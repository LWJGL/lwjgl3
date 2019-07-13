/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import javax.annotation.*;
import java.net.*;
import java.nio.channels.*;
import java.nio.file.*;
import java.util.function.*;

import static org.lwjgl.system.APIUtil.*;

/**
 * Handles loading of native resources in LWJGL. [INTERNAL USE ONLY]
 *
 * <p>This class uses the same mechanism as {@link Library} for loading shared libraries. The resource name could be an absolute path, or a relative path that
 * is resolved via {@code org.lwjgl.librarypath}, {@code java.library.path}, or even the class/module-path. When the resource is detected in the
 * class/module-path, it is extracted automatically to {@code org.lwjgl.librarypath} via the {@code SharedLibraryLoader}.</p>
 */
public final class LibraryResource {

    static {
        Library.initialize();
    }

    private LibraryResource() {}

    /** Calls {@link #load(Class, String, String)} using {@code LibraryResource.class} as the context parameter. */
    public static Path load(String module, String name) {
        return load(LibraryResource.class, module, name);
    }

    /**
     * Loads a library resource.
     *
     * @param context the class to use to discover the library resource in the classpath
     * @param module  the module to which the resource belongs
     * @param name    the resource name
     *
     * @return the library resource path
     *
     * @throws IllegalStateException if the resource could not be found
     */
    @SuppressWarnings("try")
    public static Path load(Class<?> context, String module, String name) {
        return load(context, module, name, false, true);
    }

    /**
     * Loads a library resource.
     *
     * @param context          the class to use to discover the library resource in the classpath
     * @param module           the module to which the resource belongs
     * @param name             the resource name
     * @param bundledWithLWJGL whether the default LWJGL distribution includes the  resource. If true, LWJGL will also try to find the shared library under the
     *                         {@code <platform>/<arch>/<module>} subfolder.
     *
     * @return the library resource path
     *
     * @throws IllegalStateException if the resource could not be found
     */
    @SuppressWarnings("try")
    public static Path load(Class<?> context, String module, String name, boolean bundledWithLWJGL) {
        return load(context, module, name, bundledWithLWJGL, true);
    }

    @SuppressWarnings("try")
    private static Path load(Class<?> context, String module, String name, boolean bundledWithLWJGL, boolean printError) {
        apiLog("Loading library resource: " + name);
        apiLog("\tModule: " + module);

        // METHOD 1: absolute path
        Path path = Paths.get(name);
        if (path.isAbsolute()) {
            if (!Files.exists(path)) {
                if (printError) {
                    printError();
                }
                throw new IllegalStateException("Failed to locate library resource: " + name);
            }
            apiLog("\tSuccess");
            return path;
        }

        // METHOD 2: org.lwjgl.librarypath
        URL resourceURL = Library.findResource(context, module, name, bundledWithLWJGL);
        if (resourceURL == null) {
            path = loadFromLibraryPath(module, name, bundledWithLWJGL);
            if (path != null) {
                return path;
            }
        } else {
            boolean debugLoader = Configuration.DEBUG_LOADER.get(false);
            try {
                String regular = Library.getRegularFilePath(resourceURL);
                if (regular != null) {
                    apiLog("\tLoaded from classpath: " + regular);
                    return Paths.get(regular);
                }

                // Always use the SLL if the resource is found in the classpath,
                // so that newer versions can be detected.
                if (debugLoader) {
                    apiLog("\tUsing SharedLibraryLoader...");
                }
                // Extract from classpath and try org.lwjgl.librarypath
                try (FileChannel ignored = SharedLibraryLoader.load(name, name, resourceURL)) {
                    path = loadFromLibraryPath(module, name, bundledWithLWJGL);
                    if (path != null) {
                        return path;
                    }
                }
            } catch (Exception e) {
                if (debugLoader) {
                    e.printStackTrace(DEBUG_STREAM);
                }
            }
        }

        // METHOD 3: java.library.path
        String paths = System.getProperty(Library.JAVA_LIBRARY_PATH);
        if (paths != null) {
            path = load(module, name, bundledWithLWJGL, Library.JAVA_LIBRARY_PATH, paths);
            if (path != null) {
                return path;
            }
        }

        if (printError) {
            printError();
        }
        throw new IllegalStateException("Failed to locate library resource: " + name);
    }

    @Nullable
    private static Path loadFromLibraryPath(String module, String libName, boolean bundledWithLWJGL) {
        String paths = Configuration.LIBRARY_PATH.get();
        if (paths == null) {
            return null;
        }
        return load(module, libName, bundledWithLWJGL, Configuration.LIBRARY_PATH.getProperty(), paths);
    }

    @Nullable
    private static Path load(String module, String name, boolean bundledWithLWJGL, String property, String paths) {
        Path resource = Library.findFile(paths, module, name, bundledWithLWJGL);
        if (resource == null) {
            apiLog(String.format("\t%s not found in %s=%s", name, property, paths));
            return null;
        }

        apiLog(String.format("\tLoaded from %s: %s", property, resource));
        return resource;
    }

    /**
     * Loads a library resource using {@link #load(String, String)} with the name specified by {@code name}. If {@code name} is not set,
     * {@link #load(String, String)} will be called with the names specified by {@code defaultNames}. The first successful will be returned.
     *
     * @param name         a {@link Configuration} that specifies the resource name
     * @param defaultNames the default resource name(s)
     *
     * @return the library resource path
     *
     * @throws IllegalStateException if the resource could not be found
     */
    public static Path load(Class<?> context, String module, Configuration<String> name, String... defaultNames) {
        return load(context, module, name, null, defaultNames);
    }

    /**
     * Loads a library resource using {@link #load(Class, String, String) load} with the name specified by {@code name}. If {@code name} is not set,
     * {@code load} will be called with the names specified by {@code defaultNames}. The first successful will be returned. If the resource could
     * not be found, the {@code fallback} will be called.
     *
     * @param name         a {@link Configuration} that specifies the resource name
     * @param fallback     fallback to use if everything else fails
     * @param defaultNames the default resource name(s)
     *
     * @return the library resource path
     *
     * @throws UnsatisfiedLinkError if the resource could not be found
     */
    public static Path load(Class<?> context, String module, Configuration<String> name, @Nullable Supplier<Path> fallback, String... defaultNames) {
        if (defaultNames.length == 0) {
            throw new IllegalArgumentException("No default names specified.");
        }

        String resourceName = name.get();
        if (resourceName != null) {
            return load(context, module, resourceName);
        }

        if (fallback == null && defaultNames.length <= 1) {
            return load(context, module, defaultNames[0]);
        }

        try {
            return load(context, module, defaultNames[0], false, false); // try first
        } catch (Throwable t) {
            for (int i = 1; i < defaultNames.length; i++) { // try alternatives
                try {
                    return load(context, module, defaultNames[i], false, fallback == null && i == defaultNames.length - 1);
                } catch (Throwable ignored) {
                }
            }
            if (fallback != null) {
                return fallback.get();
            }
            throw t; // original error
        }
    }

    private static void printError() {
        Library.printError(
            "[LWJGL] Failed to load a library resource. Possible solutions:\n" +
            "\ta) Add the directory that contains the resource to -Djava.library.path or -Dorg.lwjgl.librarypath.\n" +
            "\tb) Add the JAR that contains the resource to the classpath."
        );
    }

}