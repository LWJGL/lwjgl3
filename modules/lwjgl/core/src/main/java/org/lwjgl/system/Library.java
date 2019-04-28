/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.lwjgl.*;

import javax.annotation.*;
import java.io.*;
import java.lang.reflect.*;
import java.net.*;
import java.nio.channels.*;
import java.nio.file.*;
import java.security.*;
import java.util.*;
import java.util.function.*;
import java.util.regex.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;

/**
 * Initializes the LWJGL shared library and handles loading additional shared libraries.
 *
 * @see Configuration#LIBRARY_NAME
 * @see Configuration#LIBRARY_PATH
 */
public final class Library {

    /** The LWJGL shared library name. */
    public static final String JNI_LIBRARY_NAME = Configuration.LIBRARY_NAME.get(Platform.mapLibraryNameBundled("lwjgl"));

    static final String JAVA_LIBRARY_PATH = "java.library.path";

    private static final Pattern PATH_SEPARATOR = Pattern.compile(File.pathSeparator);

    private static final Pattern NATIVES_JAR = Pattern.compile("/[\\w-]+?-natives-\\w+.jar!/");

    static {
        if (DEBUG) {
            apiLog("Version: " + Version.getVersion());
            apiLog("\t OS: " + System.getProperty("os.name") + " v" + System.getProperty("os.version"));
            apiLog("\tJRE: " + System.getProperty("java.version") + " " + System.getProperty("os.arch"));
            apiLog(
                "\tJVM: " + System.getProperty("java.vm.name") + " v" + System.getProperty("java.vm.version") + " by " + System.getProperty("java.vm.vendor")
            );
        }

        loadSystem(JNI_LIBRARY_NAME);
    }

    private Library() {}

    /** Ensures that the LWJGL shared library has been loaded. */
    public static void initialize() {
        // intentionally empty to trigger static initializer
    }

    /**
     * Loads a JNI shared library.
     *
     * @param name the library name. If not an absolute path, it must be the plain library name, without an OS specific prefix or file extension (e.g. GL, not
     *             libGL.so)
     */
    public static void loadSystem(String name) throws UnsatisfiedLinkError {
        loadSystem(System::load, System::loadLibrary, Library.class, name);
    }

    /**
     * Loads a JNI shared library.
     *
     * @param load        should be the {@code System::load} expression. This ensures that {@code System.load} has the same caller as this method.
     * @param loadLibrary should be the {@code System::loadLibrary} expression. This ensures that {@code System.loadLibrary} has the same caller as this
     *                    method.
     * @param context     the class to use to discover the shared library in the classpath
     * @param name        the library name. If not an absolute path, it must be the plain library name, without an OS specific prefix or file extension (e.g.
     *                    GL, not libGL.so)
     *
     * @throws UnsatisfiedLinkError if the library could not be loaded
     */
    @SuppressWarnings("try")
    public static void loadSystem(
        Consumer<String> load,
        Consumer<String> loadLibrary,
        Class<?> context,
        String name
    ) throws UnsatisfiedLinkError {
        apiLog("Loading library (system): " + name);

        // METHOD 1: absolute path
        if (Paths.get(name).isAbsolute()) {
            load.accept(name);
            apiLog("\tSuccess");
            return;
        }

        String libName = Platform.get().mapLibraryName(name);

        // METHOD 2: org.lwjgl.librarypath
        URL libURL = findURL(context, libName, name.contains("lwjgl"));
        if (libURL == null) {
            if (loadSystemFromLibraryPath(load, context, libName)) {
                return;
            }
        } else {
            // Always use the SLL if the library is found in the classpath,
            // so that newer versions can be detected.
            boolean debugLoader = Configuration.DEBUG_LOADER.get(false);
            try {
                if (debugLoader) {
                    apiLog("\tUsing SharedLibraryLoader...");
                }
                // Extract from classpath and try org.lwjgl.librarypath
                try (FileChannel ignored = SharedLibraryLoader.load(name, libName, libURL)) {
                    if (loadSystemFromLibraryPath(load, context, libName)) {
                        return;
                    }
                }
            } catch (Exception e) {
                if (debugLoader) {
                    e.printStackTrace(DEBUG_STREAM);
                }
            }
        }

        // METHOD 3: System.loadLibrary
        try {
            loadLibrary.accept(name);

            // Success, but java.library.path might be still empty, or not include the library.
            // In that case, ClassLoader::findLibrary was used to return the library path (e.g. OSGi does this with native libraries in bundles).
            String paths   = System.getProperty(JAVA_LIBRARY_PATH);
            Path   libFile = paths == null ? null : findFile(paths, libName);
            if (libFile != null) {
                apiLog(String.format("\tLoaded from %s: %s", JAVA_LIBRARY_PATH, libFile));
                checkHash(context, libFile);
            } else {
                apiLog("\tLoaded from a ClassLoader provided path.");
            }
            return;
        } catch (Throwable t) {
            apiLog(String.format("\t%s not found in %s", libName, JAVA_LIBRARY_PATH));
        }

        printError(true);
        throw new UnsatisfiedLinkError("Failed to locate library: " + libName);
    }

    private static boolean loadSystemFromLibraryPath(Consumer<String> load, Class<?> context, String libName) {
        String paths = Configuration.LIBRARY_PATH.get();
        return paths != null && loadSystem(load, context, libName, Configuration.LIBRARY_PATH.getProperty(), paths);
    }

    private static boolean loadSystem(Consumer<String> load, Class<?> context, String libName, String property, String paths) {
        Path libFile = findFile(paths, libName);
        if (libFile == null) {
            apiLog(String.format("\t%s not found in %s=%s", libName, property, paths));
            return false;
        }

        load.accept(libFile.toAbsolutePath().toString());
        apiLog(String.format("\tLoaded from %s: %s", property, libFile));
        checkHash(context, libFile);
        return true;
    }

    /** Calls {@link #loadNative(Class, String)} using {@code Library.class} as the context parameter. */
    public static SharedLibrary loadNative(String name) {
        return loadNative(Library.class, name);
    }

    /**
     * Loads a shared library using OS-specific APIs (e.g. {@link org.lwjgl.system.windows.WinBase#LoadLibrary LoadLibrary} or
     * {@link org.lwjgl.system.linux.DynamicLinkLoader#dlopen dlopen}).
     *
     * @param context the class to use to discover the shared library in the classpath
     * @param name    the library name. OS-specific prefixes and file extensions are optional (e.g. both {@code "GL"} and {@code "libGL.so.1"} are
     *                valid on Linux)
     *
     * @return the shared library
     *
     * @throws UnsatisfiedLinkError if the library could not be loaded
     */
    @SuppressWarnings("try")
    public static SharedLibrary loadNative(Class<?> context, String name) {
        return loadNative(context, name, false);
    }

    /**
     * Loads a shared library using OS-specific APIs (e.g. {@link org.lwjgl.system.windows.WinBase#LoadLibrary LoadLibrary} or
     * {@link org.lwjgl.system.linux.DynamicLinkLoader#dlopen dlopen}).
     *
     * @param context          the class to use to discover the shared library in the classpath
     * @param name             the library name. OS-specific prefixes and file extensions are optional (e.g. both {@code "GL"} and {@code "libGL.so.1"} are
     *                         valid on Linux)
     * @param bundledWithLWJGL whether the default LWJGL distribution includes the shared library. This flag does not affect the shared library loading
     *                         process.
     *
     * @return the shared library
     *
     * @throws UnsatisfiedLinkError if the library could not be loaded
     */
    public static SharedLibrary loadNative(Class<?> context, String name, boolean bundledWithLWJGL) {
        return loadNative(context, name, bundledWithLWJGL, true);
    }

    @SuppressWarnings("try")
    private static SharedLibrary loadNative(Class<?> context, String name, boolean bundledWithLWJGL, boolean printError) {
        apiLog("Loading library: " + name);

        // METHOD 1: absolute path
        if (Paths.get(name).isAbsolute()) {
            SharedLibrary lib = apiCreateLibrary(name);
            apiLog("\tSuccess");
            return lib;
        }

        String        libName = Platform.get().mapLibraryName(name);
        SharedLibrary lib;

        // METHOD 2: org.lwjgl.librarypath
        URL libURL = findURL(context, libName, bundledWithLWJGL);
        if (libURL == null) {
            lib = loadNativeFromLibraryPath(context, libName);
            if (lib != null) {
                return lib;
            }
        } else {
            boolean debugLoader = Configuration.DEBUG_LOADER.get(false);
            try {
                // Always use the SLL if the library is found in the classpath,
                // so that newer versions can be detected.
                if (debugLoader) {
                    apiLog("\tUsing SharedLibraryLoader...");
                }
                // Extract from classpath and try org.lwjgl.librarypath
                try (FileChannel ignored = SharedLibraryLoader.load(name, libName, libURL)) {
                    lib = loadNativeFromLibraryPath(context, libName);
                    if (lib != null) {
                        return lib;
                    }
                }
            } catch (Exception e) {
                if (debugLoader) {
                    e.printStackTrace(DEBUG_STREAM);
                }
            }
        }

        // Use method 4 before 3 for libraries not bundled with LWJGL.
        if (!bundledWithLWJGL) {
            lib = loadNativeFromSystem(libName);
            if (lib != null) {
                return lib;
            }
        }

        // METHOD 3: System.loadLibrary (emulated)
        {
            if (Configuration.EMULATE_SYSTEM_LOADLIBRARY.get(false)) {
                // Try ClassLoader::findLibrary (e.g. OSGi bundle)
                try {
                    Method findLibrary = ClassLoader.class.getDeclaredMethod("findLibrary", String.class);
                    findLibrary.setAccessible(true);

                    String libPath = (String)findLibrary.invoke(context.getClassLoader(), name);
                    if (libPath != null) {
                        lib = apiCreateLibrary(libPath);
                        apiLog(String.format("\tLoaded from ClassLoader provided path: %s", libPath));
                        return lib;
                    }
                } catch (Exception ignored) {
                    // This will fail on JDK 9 without --add-opens java.base/java.lang=ALL-UNNAMED
                }
            }

            // Then java.library.path
            String paths = System.getProperty(JAVA_LIBRARY_PATH);
            if (paths != null) {
                lib = loadNative(context, libName, JAVA_LIBRARY_PATH, paths);
                if (lib != null) {
                    return lib;
                }
            }
        }

        // METHOD 4: system-specific
        if (bundledWithLWJGL) {
            lib = loadNativeFromSystem(libName);
            if (lib != null) {
                return lib;
            }
        }

        if (printError) {
            printError(bundledWithLWJGL);
        }
        throw new UnsatisfiedLinkError("Failed to locate library: " + libName);
    }

    @Nullable
    private static SharedLibrary loadNativeFromSystem(String libName) {
        SharedLibrary lib;
        try {
            lib = apiCreateLibrary(libName);
            String path = lib.getPath();
            apiLog(path == null
                ? "\tLoaded from system paths"
                : "\tLoaded from system paths: " + path);
        } catch (UnsatisfiedLinkError e) {
            lib = null;
            apiLog(String.format("\t%s not found in system paths", libName));
        }
        return lib;
    }

    @Nullable
    private static SharedLibrary loadNativeFromLibraryPath(Class<?> context, String libName) {
        String paths = Configuration.LIBRARY_PATH.get();
        if (paths == null) {
            return null;
        }
        return loadNative(context, libName, Configuration.LIBRARY_PATH.getProperty(), paths);
    }

    @Nullable
    private static SharedLibrary loadNative(Class<?> context, String libName, String property, String paths) {
        Path libFile = findFile(paths, libName);
        if (libFile == null) {
            apiLog(String.format("\t%s not found in %s=%s", libName, property, paths));
            return null;
        }

        SharedLibrary lib = apiCreateLibrary(libFile.toAbsolutePath().toString());
        apiLog(String.format("\tLoaded from %s: %s", property, libFile));
        checkHash(context, libFile);
        return lib;
    }

    /**
     * Loads a shared library using {@link #loadNative(String)} with the name specified by {@code name}. If {@code name} is not set,
     * {@link #loadNative(String)} will be called with the names specified by {@code defaultNames}. The first successful will be returned.
     *
     * @param name         a {@link Configuration} that specifies the library name
     * @param defaultNames the default library name(s)
     *
     * @return the shared library
     *
     * @throws UnsatisfiedLinkError if the library could not be loaded
     */
    public static SharedLibrary loadNative(Class<?> context, @Nullable Configuration<String> name, String... defaultNames) {
        return loadNative(context, name, null, defaultNames);
    }

    /**
     * Loads a shared library using {@link #loadNative(String)} with the name specified by {@code name}. If {@code name} is not set,
     * {@link #loadNative(String)} will be called with the names specified by {@code defaultNames}. The first successful will be returned. If the library could
     * not be loaded, the {@code fallback} will be called.
     *
     * @param name         a {@link Configuration} that specifies the library name
     * @param fallback     fallback to use if everything else fails
     * @param defaultNames the default library name(s)
     *
     * @return the shared library
     *
     * @throws UnsatisfiedLinkError if the library could not be loaded
     */
    public static SharedLibrary loadNative(Class<?> context, @Nullable Configuration<String> name, @Nullable Supplier<SharedLibrary> fallback, String... defaultNames) {
        if (defaultNames.length == 0) {
            throw new IllegalArgumentException("No default names specified.");
        }

        if (name != null) {
            String libraryName = name.get();
            if (libraryName != null) {
                return loadNative(context, libraryName);
            }
        }

        if (fallback == null && defaultNames.length <= 1) {
            return loadNative(context, defaultNames[0]);
        }

        try {
            return loadNative(context, defaultNames[0], false, false); // try first
        } catch (Throwable t) {
            for (int i = 1; i < defaultNames.length; i++) { // try alternatives
                try {
                    return loadNative(context, defaultNames[i], false, fallback == null && i == defaultNames.length - 1);
                } catch (Throwable ignored) {
                }
            }
            if (fallback != null) {
                return fallback.get();
            }
            throw t; // original error
        }
    }

    @Nullable
    static URL findURL(Class<?> context, String resource, boolean bundledWithLWJGL) {
        URL url = null;
        if (bundledWithLWJGL) {
            String bundledResource = Platform.mapLibraryPathBundled(resource);
            if (!bundledResource.equals(resource)) {
                url = context.getClassLoader().getResource(bundledResource);
            }
        }
        return url == null ? context.getClassLoader().getResource(resource) : url;
    }

    @Nullable
    static Path findFile(String path, String file) {
        for (String directory : PATH_SEPARATOR.split(path)) {
            Path p = Paths.get(directory, file);
            if (Files.isReadable(p)) {
                return p;
            }
        }
        return null;
    }

    private static void printError(boolean bundledWithLWJGL) {
        printError(
            "[LWJGL] Failed to load a library. Possible solutions:\n" + (bundledWithLWJGL
                ? "\ta) Add the directory that contains the shared library to -Djava.library.path or -Dorg.lwjgl.librarypath.\n" +
                  "\tb) Add the JAR that contains the shared library to the classpath."
                : "\ta) Install the library or the driver that provides the library.\n" +
                  "\tb) Ensure that the library is accessible from the system library paths."
            )
        );
    }

    static void printError(String message) {
        DEBUG_STREAM.println(message);
        if (!DEBUG) {
            DEBUG_STREAM.println("[LWJGL] Enable debug mode with -Dorg.lwjgl.util.Debug=true for better diagnostics.");
            if (!Configuration.DEBUG_LOADER.get(false)) {
                DEBUG_STREAM.println("[LWJGL] Enable the SharedLibraryLoader debug mode with -Dorg.lwjgl.util.DebugLoader=true for better diagnostics.");
            }
        }
    }

    /**
     * Compares the shared library hash stored in the classpath, with the hash of the actual library loaded at runtime.
     *
     * <p>This check prints a simple warning when there's a hash mismatch, to help diagnose installation/classpath issues. It is not a security feature.</p>
     *
     * @param context the class to use to discover the shared library hash in the classpath
     * @param libFile the library file loaded
     */
    private static void checkHash(Class<?> context, Path libFile) {
        if (!CHECKS) {
            return;
        }

        try {
            URL classesURL = null;
            URL nativesURL = null;

            Enumeration<URL> resources = context.getClassLoader().getResources(libFile.getFileName() + ".sha1");
            while (resources.hasMoreElements()) {
                URL url = resources.nextElement();
                if (NATIVES_JAR.matcher(url.toExternalForm()).find()) {
                    nativesURL = url;
                } else {
                    classesURL = url;
                }
            }
            if (classesURL == null) {
                return;
            }

            byte[] expected = getSHA1(classesURL);
            byte[] actual = DEBUG || nativesURL == null
                ? getSHA1(libFile)
                : getSHA1(nativesURL);

            if (!Arrays.equals(expected, actual)) {
                DEBUG_STREAM.println(
                    "[LWJGL] [ERROR] Incompatible Java and native library versions detected.\n" +
                    "Possible reasons:\n" +
                    "\ta) -Djava.library.path is set to a folder containing shared libraries of an older LWJGL version.\n" +
                    "\tb) The classpath contains jar files of an older LWJGL version.\n" +
                    "Possible solutions:\n" +
                    "\ta) Make sure to not set -Djava.library.path (it is not needed for developing with LWJGL 3) or make\n" +
                    "\t   sure the folder it points to contains the shared libraries of the correct LWJGL version.\n" +
                    "\tb) Check the classpath and make sure to only have jar files of the same LWJGL version in it.");
            }
        } catch (Throwable t) {
            if (DEBUG) {
                apiLog("Failed to verify native library.");
                t.printStackTrace();
            }
        }
    }

    private static byte[] getSHA1(URL hashURL) throws IOException {
        byte[] hash = new byte[20];
        try (InputStream sha1 = hashURL.openStream()) {
            for (int i = 0; i < 20; i++) {
                hash[i] = (byte)((Character.digit(sha1.read(), 16) << 4) | Character.digit(sha1.read(), 16));
            }
        }
        return hash;
    }

    private static byte[] getSHA1(Path libFile) throws NoSuchAlgorithmException, IOException {
        MessageDigest digest = MessageDigest.getInstance("SHA-1");
        try (InputStream input = Files.newInputStream(libFile)) {
            byte[] buffer = new byte[8 * 1024];
            for (int n; (n = input.read(buffer)) != -1; ) {
                digest.update(buffer, 0, n);
            }
        }
        return digest.digest();
    }

}