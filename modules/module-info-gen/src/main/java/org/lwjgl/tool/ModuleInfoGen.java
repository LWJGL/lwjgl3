/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.tool;

import javax.tools.*;
import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

public final class ModuleInfoGen {

    private static final String JAVA_PACKAGE = "\\p{javaJavaIdentifierStart}\\p{javaJavaIdentifierPart}*(\\s*\\.\\s*\\p{javaJavaIdentifierStart}\\p{javaJavaIdentifierPart}*)*";

    private static final Pattern MODULE_NAME = Pattern.compile("^\\s*(?:open\\s+)?module\\s+(" + JAVA_PACKAGE + ")\\s*\\{", Pattern.MULTILINE);

    private static final Pattern EXPORTS = Pattern.compile(
        "[{;]\\s*exports\\s+(" + JAVA_PACKAGE + ")(?:\\s+to\\s+" + JAVA_PACKAGE + ")?\\s*(?=;)",
        Pattern.MULTILINE
    );

    private final JavaCompiler compiler;

    private final DiagnosticCollector<JavaFileObject> diagnostics;

    private final JavaFileManager fileManager;

    private ModuleInfoGen() {
        compiler = ToolProvider.getSystemJavaCompiler();

        diagnostics = new DiagnosticCollector<>();

        fileManager = compiler.getStandardFileManager(diagnostics, Locale.getDefault(), StandardCharsets.UTF_8);
    }

    public static void main(String[] args) {
        ModuleInfoGen gen = new ModuleInfoGen();

        try (gen.fileManager) {
            Path[] modules = Files.list(Paths.get("modules/module-info-gen/src/main/resources"))
                .filter(Files::isRegularFile)
                .filter(it -> {
                    String filename = it.getFileName().toString();
                    return filename.startsWith("org.lwjgl.") && filename.endsWith(".java");
                })
                .sorted(Comparator
                    .<Path>comparingInt(it -> it.getFileName().toString()
                        .chars()
                        .map(c -> c == '.' ? 1 : 0) // less dots first
                        .sum())
                    .thenComparing(Comparator.naturalOrder())
                )
                .toArray(Path[]::new);

            for (Path path : modules) {
                gen.compileModuleInfo(path);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void compileModuleInfo(Path path) throws IOException {
        String moduleInfo = new String(Files.readAllBytes(path), StandardCharsets.UTF_8);

        String module = MODULE_NAME.matcher(moduleInfo)
            .results()
            .findFirst()
            .orElseThrow(() -> new IllegalStateException("Failed to find module name"))
            .group(1);

        if (Pattern.compile("[{;]\\s*requires(?:\\s+transitive)?\\s+" + module + ".natives\\s*;").matcher(moduleInfo).find()) {
            compileModuleInfo(module + ".natives", "module " + module + ".natives {}");
        }

        compileModuleInfo(module, moduleInfo);
    }

    private void compileModuleInfo(
        String module,
        String moduleInfo
    ) {
        List<JavaFileObject> compilationUnits = new ArrayList<>();
        compilationUnits.add(new MemoryJavaFileObject(module + "/module-info.java", moduleInfo));

        EXPORTS.matcher(moduleInfo).results()
            .map(it -> createDummyClass(module, it.group(1)))
            .forEach(compilationUnits::add);

        JavaCompiler.CompilationTask task = compiler.getTask(
            null,
            fileManager,
            diagnostics,
            List.of(
                "--module-path", "bin/MODULES",
                "-d", "bin/MODULES/" + module
            ),
            null,
            compilationUnits
        );

        boolean success = task.call();
        System.out.println(module + ": " + (success ? "OK" : "FAILED"));
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

    private static MemoryJavaFileObject createDummyClass(String module, String packageName) {
        return new MemoryJavaFileObject(
            module + "/" + packageName.replace('.', '/') + "/Dummy.java",
            "package " + packageName + ";\n" +
            "\n" +
            "public class Dummy {}\n"
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