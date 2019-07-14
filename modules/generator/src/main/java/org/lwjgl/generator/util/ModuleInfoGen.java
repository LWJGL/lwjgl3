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
        MODULE_NAME = Pattern.compile("^\\s*(?:open\\s+)?module\\s+(" + JAVA_PACKAGE + ")\\s*\\{", Pattern.MULTILINE),
        REQUIRES    = Pattern.compile("^\\s*requires(?:\\s+(?:transitive|static))?\\s+(.+)\\s*;", Pattern.MULTILINE);

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

    private static class Module implements Comparable<Module> {
        final String info;

        final String nameJava;
        final String name;

        final Set<String> dependencies;

        Module(String info, String nameJava, Set<String> dependencies) {
            this.info = info;
            this.nameJava = nameJava;
            this.name = getModule(nameJava);
            this.dependencies = dependencies;
        }

        @Override public boolean equals(Object other) {
            return name.equals(((Module)other).name);
        }

        @Override public int hashCode() {
            return name.hashCode();
        }

        @Override public int compareTo(Module other) {
            return this.name.compareTo(other.name);
        }

        @Override public String toString() {
            return name;
        }
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
            List<Module> modules = moduleNames.stream()
                .map(it -> {
                    try {
                        return Files.readAllBytes(Paths.get("modules/lwjgl", it, "src/main/resources/module-info.java"));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                })
                .map(ModuleInfoGen::parseModuleInfo)
                .sorted()
                .collect(Collectors.toList());

            topologicalSort(modules);

            // Compile module-info classes
            for (Module module : modules) {
                gen.compileModuleInfo(module, javaOnly);
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

    private static String getModule(String moduleJava) {
        return "org.lwjgl".equals(moduleJava) ?
            "core"
            : moduleJava.substring("org.lwjgl.".length());
    }

    private static Module parseModuleInfo(byte[] file) {
        String info = new String(file, StandardCharsets.UTF_8);

        Matcher matcher = MODULE_NAME.matcher(info);
        if (!matcher.find()) {
            throw new IllegalStateException("Failed to find module name");
        }
        String nameJava = matcher.group(1);

        Set<String> dependencies = new HashSet<>();

        matcher = REQUIRES.matcher(info);
        while (matcher.find()) {
            String dependency = matcher.group(1);
            if (dependency.startsWith("org.lwjgl")) {
                dependencies.add(getModule(dependency));
            }
        }

        return new Module(info, nameJava, dependencies);
    }

    private static void topologicalSort(List<Module> modules) {
        Map<String, Module> moduleRegistry = new HashMap<>(modules.size());
        for (Module module : modules) {
            moduleRegistry.put(module.name, module);
        }

        List<Module> stack = new ArrayList<>(modules.size());

        Set<Module> visited  = new HashSet<>(modules.size());
        Set<Module> expanded = new HashSet<>(modules.size());

        for (Module node : modules) {
            traverse(node, moduleRegistry, stack, visited, expanded);
        }

        modules.clear();
        modules.addAll(stack);
    }

    private static void traverse(
        Module module,
        Map<String, Module> moduleRegistry,
        List<Module> stack,
        Set<Module> visited,
        Set<Module> expanded
    ) {
        if (visited.contains(module)) {
            if (!expanded.contains(module)) {
                throw new IllegalStateException("Cyclic module graph detected!");
            }
            return;
        }

        visited.add(module);
        for (String predecessor : module.dependencies) {
            traverse(moduleRegistry.get(predecessor), moduleRegistry, stack, visited, expanded);
        }
        expanded.add(module);

        push(stack, module);
    }

    // Order stack by name in groups with no interdependencies
    private static void push(List<Module> stack, Module module) {
        int i = stack.size();
        while (0 < i) {
            Module sibling = stack.get(i - 1);
            if (module.dependencies.contains(sibling.name)) {
                break;
            }
            if (sibling.name.compareTo(module.name) < 0) {
                break;
            }
            --i; // go down the stack
        }
        stack.add(i, module);
    }

    private void compileModuleInfo(Module module, Set<String> javaOnly) throws IOException {
        String modulePath = Stream.concat(
            module.dependencies.stream(),
            Stream.of(module.name)
        )
            .map(it -> "bin/classes/lwjgl/" + it)
            .collect(Collectors.joining(File.pathSeparator));

        compileModuleInfo(module.name, module.info, modulePath);
        if (!javaOnly.contains(module.name)) {
            //Paths.get("bin/classes/lwjgl/" + module + ".natives");
            compileModuleInfo(
                module.name + ".natives",
                "module " + module.nameJava + ".natives {\n" +
                "    requires transitive " + module.nameJava + ";\n" +
                "}",
                modulePath
            );
        }
    }

    private void compileModuleInfo(
        String module,
        String moduleInfo,
        String modulePath
    ) {
        class MemoryJavaFileObject extends SimpleJavaFileObject {
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

        List<JavaFileObject> compilationUnits = new ArrayList<>(32);
        compilationUnits.add(new MemoryJavaFileObject("modules/lwjgl/" + module + "/src/main/java/module-info.java", moduleInfo));

        JavaCompiler.CompilationTask task = compiler.getTask(
            null,
            fileManager,
            diagnostics,
            Arrays.asList(
                "--release", "9",
                "--module-path", modulePath,
                "-d", "bin/classes/lwjgl/" + module
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

    private static void moveModuleInfo(Path moduleInfoClass) throws IOException {
        Path java9 = moduleInfoClass.resolveSibling("META-INF/versions/9");
        Files.createDirectories(java9);

        Files.move(
            moduleInfoClass,
            java9.resolve("module-info.class"),
            StandardCopyOption.REPLACE_EXISTING
        );
    }

}