/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.lwjgl.*;

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
    public static final String JNI_LIBRARY_NAME = Configuration.LIBRARY_NAME.get(System.getProperty("os.arch").contains("64") ? "lwjgl" : "lwjgl32");

    private static final String JAVA_LIBRARY_PATH = "java.library.path";

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
        URL libURL = context.getResource("/" + libName);
        if (libURL == null) {
            if (loadSystem(load, context, libName, Configuration.LIBRARY_PATH)) {
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
                    if (loadSystem(load, context, libName, Configuration.LIBRARY_PATH)) {
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
            Path   libFile = paths == null ? null : findLibrary(paths, libName);
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

    private static boolean loadSystem(Consumer<String> load, Class<?> context, String libName, Configuration<String> property) {
        String paths = property.get();
        return paths != null && loadSystem(load, context, libName, property.getProperty(), paths);
    }

    private static boolean loadSystem(Consumer<String> load, Class<?> context, String libName, String property, String paths) {
        Path libFile = findLibrary(paths, libName);
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
    @SuppressWarnings("try")
    public static SharedLibrary loadNative(Class<?> context, String name, boolean bundledWithLWJGL) {
        apiLog("Loading library: " + name);

        // METHOD 1: absolute path
        if (new File(name).isAbsolute()) {
            SharedLibrary lib = apiCreateLibrary(name);
            apiLog("\tSuccess");
            return lib;
        }

        String        libName = Platform.get().mapLibraryName(name);
        SharedLibrary lib;

        // METHOD 2: org.lwjgl.librarypath
        URL libURL = context.getResource("/" + libName);
        if (libURL == null) {
            lib = loadNative(context, libName, Configuration.LIBRARY_PATH);
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
                    return loadNative(context, libName, Configuration.LIBRARY_PATH);
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

        printError(bundledWithLWJGL);
        throw new UnsatisfiedLinkError("Failed to locate library: " + libName);
    }

    private static SharedLibrary loadNativeFromSystem(String libName) {
        SharedLibrary lib;
        try {
            lib = apiCreateLibrary(libName);
            apiLog("\tLoaded from system paths");
        } catch (UnsatisfiedLinkError e) {
            lib = null;
            apiLog(String.format("\t%s not found in system paths", libName));
        }
        return lib;
    }

    private static SharedLibrary loadNative(Class<?> context, String libName, Configuration<String> property) {
        String paths = property.get();
        if (paths != null) {
            SharedLibrary lib = loadNative(context, libName, property.getProperty(), paths);
            if (lib != null) {
                return lib;
            }
        }
        return null;
    }

    private static SharedLibrary loadNative(Class<?> context, String libName, String property, String paths) {
        Path libFile = findLibrary(paths, libName);
        if (libFile == null) {
            apiLog(String.format("\t%s not found in %s=%s", libName, property, paths));
            return null;
        }

        SharedLibrary lib = apiCreateLibrary(libFile.toString());
        apiLog(String.format("\tLoaded from %s: %s", property, libFile));
        checkHash(context, libFile);
        return lib;
    }

    /**
     * Loads a shared library using {@link #loadNative(String)} with the name specified by {@code name}. If {@code name} is not set,
     * {@link #loadNative(String)} will be called with the names specified by {@code defaultNames}. The first successful will be returned.
     *
     * @param name         a {@link Configuration} that specifies the library name
     * @param defaultNames the default library name
     *
     * @return the shared library
     *
     * @throws UnsatisfiedLinkError if the library could not be loaded
     */
    public static SharedLibrary loadNative(Class<?> context, Configuration<String> name, String... defaultNames) {
        if (name.get() != null) {
            return loadNative(context, name.get());
        } else if (defaultNames.length <= 1) {
            if (defaultNames.length == 0) {
                throw new RuntimeException("No default names specified.");
            }

            return loadNative(context, defaultNames[0]);
        } else {
            SharedLibrary library = null;
            try {
                library = Library.loadNative(context, defaultNames[0]); // try first
            } catch (Throwable t) {
                for (int i = 1; i < defaultNames.length; i++) { // try alternatives
                    try {
                        library = Library.loadNative(context, defaultNames[i]);
                        break;
                    } catch (Throwable ignored) {
                    }
                }
                if (library == null) {
                    throw t; // original error
                }
            }
            return library;
        }
    }

    private static Path findLibrary(String path, String libName) {
        for (String directory : PATH_SEPARATOR.split(path)) {
            Path p = Paths.get(directory, libName);
            if (Files.isReadable(p)) {
                return p;
            }
        }
        return null;
    }

    private static void printError(boolean bundledWithLWJGL) {
        DEBUG_STREAM.println(
            "[LWJGL] Failed to load a library. Possible solutions:\n" + (bundledWithLWJGL
                ? "\ta) Add the directory that contains the shared library to -Djava.library.path or -Dorg.lwjgl.librarypath.\n" +
                  "\tb) Add the JAR that contains the shared library to the classpath."
                : "\ta) Install the library or the driver that provides the library.\n" +
                  "\tb) Ensure that the library is accessible from the system library paths."
            )
        );

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
                DEBUG_STREAM.println("[LWJGL] [WARNING] Mismatch detected between the Java and native libraries.");
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