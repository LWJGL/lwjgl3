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
        MODULE_NAME = Pattern.compile("^\\s*(?:open\\s+)?module\\s+(" + JAVA_PACKAGE + ")\\s*\\{", Pattern.MULTILINE),
        REQUIRES    = Pattern.compile("^\\s*requires(?:\\s+(?:transitive|static))?\\s+(.+)\\s*;", Pattern.MULTILINE);

    private static final Path METAINF = Paths.get("META-INF", "versions", "9");

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
        if (args.length == 1) {
            generateJavaModuleInfoClasses(args[0]);
        } else if (args.length == 2) {
            generateNativeModuleInfoClasses(args[0], args[1]);
        } else {
            throw new IllegalArgumentException("Usage: ModuleInfoGen <module.list> OR <module source name> <module release name>");
        }
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

        private void compile(ModuleInfoGen gen) {
            String modulePath = dependencies.stream()
                .map(it -> "bin/classes/lwjgl/" + it)
                .collect(Collectors.joining(File.pathSeparator));

            gen.compile(
                name,
                info,
                modulePath,
                Paths.get("modules", "lwjgl", name, "src", "main", "java"),
                Paths.get("bin", "classes", "lwjgl", name),
                null
            );
        }
    }

    private static void generateJavaModuleInfoClasses(String moduleNameList) throws IOException {
        List<String> moduleNames = Pattern.compile(",")
            .splitAsStream(moduleNameList)
            .collect(Collectors.toList());

        try (ModuleInfoGen gen = new ModuleInfoGen()) {
            // Find module-info sources
            List<Module> modules = moduleNames.stream()
                .map(it -> {
                    try {
                        return Files.readAllBytes(Paths.get("modules", "lwjgl", it, "src", "main", "resources", "module-info.java"));
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
                module.compile(gen);
            }

            // Move module-info classes to <module>/META-INF/versions/9
            for (String module : moduleNames) {
                Path source = Paths.get("bin", "classes", "lwjgl", module, "module-info.class");
                Path target = source.resolveSibling(METAINF);

                Files.createDirectories(target);
                Files.move(
                    source,
                    target.resolve(source.getFileName()),
                    StandardCopyOption.REPLACE_EXISTING
                );
            }
        }
    }

    private static void generateNativeModuleInfoClasses(String moduleNameSource, String moduleNameRelease) throws IOException {
        Path root = Paths.get("bin", "RELEASE", moduleNameRelease, "native");

        Module module       = parseModuleInfo(Files.readAllBytes(Paths.get("modules", "lwjgl", moduleNameSource, "src", "main", "resources", "module-info.java")));
        String moduleNative = module.nameJava + ".natives";

        try (ModuleInfoGen gen = new ModuleInfoGen()) {
            try (Stream<Path> platforms = Files.list(root)) {
                platforms
                    .filter(it -> Files.isDirectory(it))
                    .forEach(platform -> {
                        try {
                            try (Stream<Path> architectures = Files.list(platform)) {
                                architectures
                                    .filter(it -> Files.isDirectory(it))
                                    .forEach(architecture -> {
                                        String nativePackage = platform.getFileName().toString() + '.' + architecture.getFileName() + '.' + module.nameJava;

                                        Path outputPath = architecture.resolve(METAINF);

                                        gen.compile(
                                            moduleNative,
                                            "module " + moduleNative + " {\n" +
                                            "    requires transitive " + module.nameJava + ";\n" +
                                            "\n" +
                                            "    opens " + nativePackage + ";\n" +
                                            "}",
                                            Stream.concat(Stream.of(module.name), module.dependencies.stream())
                                                .map(it -> "bin/classes/lwjgl/" + it + "/META-INF/versions/9")
                                                .collect(Collectors.joining(File.pathSeparator)),
                                            architecture,
                                            outputPath,
                                            nativePackage
                                        );

                                        try (Stream<Path> dummy = Files.walk(outputPath.resolve(platform.getFileName()))) {
                                            dummy
                                                .sorted(Comparator.reverseOrder())
                                                .map(Path::toFile)
                                                .forEach(File::delete);
                                        } catch (IOException e) {
                                            e.printStackTrace();
                                        }
                                    });
                            }
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
            }
        }
    }

    private static String getModule(String moduleJava) {
        return "org.lwjgl".equals(moduleJava)
            ? "core"
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
            Module depModule = moduleRegistry.get(predecessor);
            if (depModule == null) {
                throw new IllegalStateException("Module " + module.name + " depends on module " + predecessor + " which does not exist.");
            }
            traverse(depModule, moduleRegistry, stack, visited, expanded);
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

    private void compile(
        String module,
        String moduleInfo,
        String modulePath,
        Path sourcePath,
        Path outputPath,
        String nativePackage
    ) {
        ArrayList<MemoryJavaFileObject> compilationUnits = new ArrayList<>(2);
        if (nativePackage != null) {
            compilationUnits.add(new MemoryJavaFileObject(
                sourcePath.resolve("Dummy.java").toString(),
                "package " + nativePackage + ";\n\npublic class Dummy {}")
            );
        }
        compilationUnits.add(new MemoryJavaFileObject(
            sourcePath.resolve("module-info.java").toString(),
            moduleInfo
        ));

        ArrayList<String> options = new ArrayList<>(6);
        options.add("--release");
        options.add("9");
        if (modulePath != null && !modulePath.isEmpty()) {
            options.add("--module-path");
            options.add(modulePath);
        }
        options.add("-d");
        options.add(outputPath.toString());

        boolean success = compiler
            .getTask(null, fileManager, diagnostics, options, null, compilationUnits)
            .call();
        System.out.println((nativePackage == null ? module : nativePackage) + ": " + (success ? "OK" : "FAILED"));
        if (!success) {
            printDiagnostics();
        }
    }

    private void printDiagnostics() {
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