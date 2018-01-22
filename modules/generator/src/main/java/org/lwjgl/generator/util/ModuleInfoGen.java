/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.generator.util;

import javax.tools.*;
import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public final class ModuleInfoGen implements AutoCloseable {

    private static final String JAVA_PACKAGE = "\\p{javaJavaIdentifierStart}\\p{javaJavaIdentifierPart}*(\\s*\\.\\s*\\p{javaJavaIdentifierStart}\\p{javaJavaIdentifierPart}*)*";

    private static final Pattern
        COMMA       = Pattern.compile(","),
        MODULE_NAME = Pattern.compile("^\\s*(?:open\\s+)?module\\s+(" + JAVA_PACKAGE + ")\\s*\\{", Pattern.MULTILINE);

    private final JavaCompiler compiler;

    private final DiagnosticCollector<JavaFileObject> diagnostics;

    private final JavaFileManager fileManager;

    private ModuleInfoGen() {
        compiler = ToolProvider.getSystemJavaCompiler();

        diagnostics = new DiagnosticCollector<>();

        fileManager = compiler.getStandardFileManager(diagnostics, Locale.getDefault(), StandardCharsets.UTF_8);
    }

    @Override
    public void close() throws IOException {
        fileManager.close();
    }

    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            throw new IllegalArgumentException("Usage: ModuleInfoGen <module.list> <module.list.java-only>");
        }

        List<String> moduleNames = COMMA
            .splitAsStream(args[0])
            .collect(Collectors.toList());

        Set<String> javaOnly = COMMA
            .splitAsStream(args[1])
            .collect(Collectors.toSet());

        try (ModuleInfoGen gen = new ModuleInfoGen()) {
            // Find module-info sources
            List<Path> modules = moduleNames.stream()
                .map((it) -> Paths.get("modules/lwjgl", it, "src/main/resources/module-info.java"))
                .collect(Collectors.toList());

            // Compile module-info classes
            for (Path path : modules) {
                gen.compileModuleInfo(path, javaOnly);
            }

            // Move module-info classes to <module>/META-INF/versions/9
            for (String module : moduleNames) {
                Path moduleInfoClass = Paths.get("bin/classes/lwjgl/" + module + "/module-info.class");
                moveModuleInfo(moduleInfoClass);

                Path natives = moduleInfoClass.getParent().resolveSibling(module + ".natives");
                if (Files.isDirectory(natives)) {
                    moveModuleInfo(natives.resolve("module-info.class"));
                }
            }
        }
    }

    private void compileModuleInfo(Path path, Set<String> javaOnly) throws IOException {
        String moduleInfo = new String(Files.readAllBytes(path), StandardCharsets.UTF_8);

        Matcher matcher = MODULE_NAME.matcher(moduleInfo);
        if (!matcher.find()) {
            throw new IllegalStateException("Failed to find module name");
        }
        String moduleJava = matcher.group(1);

        String module = "org.lwjgl".equals(moduleJava)
            ? "core"
            : moduleJava.substring("org.lwjgl.".length());

        compileModuleInfo(module, moduleJava, moduleInfo);
        if (!javaOnly.contains(module)) {
            //Paths.get("bin/classes/lwjgl/" + module + ".natives");
            compileModuleInfo(
                module + ".natives",
                moduleJava + ".natives",
                "module " + moduleJava + ".natives {\n" +
                "    requires transitive " + moduleJava + ";\n" +
                "}"
            );
        }
    }

    private void compileModuleInfo(
        String module,
        String moduleJava,
        String moduleInfo
    ) {
        List<JavaFileObject> compilationUnits = new ArrayList<>(32);
        compilationUnits.add(new MemoryJavaFileObject("modules/lwjgl/" + module + "/src/main/java/module-info.java", moduleInfo));

        JavaCompiler.CompilationTask task = compiler.getTask(
            null,
            fileManager,
            diagnostics,
            Arrays.asList(
                "--module-path", module.startsWith("core")
                    ? "bin/classes/lwjgl/core"
                    : "bin/classes/lwjgl/core" + File.pathSeparator + "bin/classes/lwjgl/" + (
                    module.endsWith(".natives")
                        ? module.substring(0, module.indexOf('.'))
                        : module
                ),
                "-d", "bin/classes/lwjgl/" + module
            ),
            null,
            compilationUnits
        );

        boolean success = task.call();
        System.out.println(moduleJava + ": " + (success ? "OK" : "FAILED"));
        if (!success) {
            System.out.flush();
            diagnostics.getDiagnostics().forEach(it -> {
                System.err.println(it.getCode());
                System.err.println(it.getKind());
                System.err.println(it.getPosition());
                System.err.println(it.getStartPosition());
                System.err.println(it.getEndPosition());
                System.err.println(it.getSource());
                System.err.println(it.getMessage(null));
            });
            System.exit(1);
        }
    }

    private static void moveModuleInfo(Path moduleInfoClass) throws IOException {
        Path java9 = moduleInfoClass.resolveSibling("META-INF/versions/9");
        Files.createDirectories(java9);

        Files.move(
            moduleInfoClass,
            java9.resolve("module-info.class"),
            StandardCopyOption.REPLACE_EXISTING
        );
    }

    private static class MemoryJavaFileObject extends SimpleJavaFileObject {
        private final String code;

        MemoryJavaFileObject(String name, String code) {
            super(Paths.get(name).toUri(), Kind.SOURCE);
            this.code = code;
        }

        @Override
        public CharSequence getCharContent(boolean ignoreEncodingErrors) {
            return code;
        }
    }

}