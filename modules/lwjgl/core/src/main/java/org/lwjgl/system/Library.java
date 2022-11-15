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
import java.util.jar.*;
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
            DEBUG_STREAM.print(
                "[LWJGL] Version: " + Version.getVersion() +
                "\n\t OS: " + System.getProperty("os.name") + " v" + System.getProperty("os.version") +
                "\n\tJRE: " + Platform.get().getName() + " " + System.getProperty("os.arch") + " " + System.getProperty("java.version") +
                "\n\tJVM: " + System.getProperty("java.vm.name") + " v" + System.getProperty("java.vm.version") + " by " + System.getProperty("java.vm.vendor") +
                "\n"
            );
        }

        loadSystem("org.lwjgl", JNI_LIBRARY_NAME);
    }

    private Library() {}

    /** Ensures that the LWJGL shared library has been loaded. */
    public static void initialize() {
        // intentionally empty to trigger static initializer
    }

    /** Calls {@link #loadSystem(Consumer, Consumer, Class, String, String)} using {@code Library.class} as the context parameter. */
    public static void loadSystem(String module, String name) throws UnsatisfiedLinkError {
        loadSystem(System::load, System::loadLibrary, Library.class, module, name);
    }

    /**
     * Loads a JNI shared library.
     *
     * @param load        should be the {@code System::load} expression. This ensures that {@code System.load} has the same caller as this method.
     * @param loadLibrary should be the {@code System::loadLibrary} expression. This ensures that {@code System.loadLibrary} has the same caller as this
     *                    method.
     * @param context     the class to use to discover the shared library in the classpath
     * @param module      the module to which the shared library belongs
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
        String module,
        String name
    ) throws UnsatisfiedLinkError {
        if (DEBUG) {
            DEBUG_STREAM.print(
                "[LWJGL] Loading JNI library: " + name +
                "\n\tModule: " + module +
                "\n"
            );
        }

        // METHOD 1: absolute path
        if (Paths.get(name).isAbsolute()) {
            load.accept(name);
            apiLogMore("Success");
            return;
        }

        String libName = Platform.get().mapLibraryName(name);

        boolean bundledWithLWJGL = name.contains("lwjgl");

        // METHOD 2: org.lwjgl.librarypath
        URL libURL = findResource(context, module, libName, bundledWithLWJGL);
        if (libURL == null) {
            if (loadSystemFromLibraryPath(load, context, module, libName, bundledWithLWJGL)) {
                return;
            }
        } else {
            boolean debugLoader = Configuration.DEBUG_LOADER.get(false);
            try {
                if (!Configuration.SHARED_LIBRARY_EXTRACT_FORCE.get(false)) {
                    String regular = getRegularFilePath(libURL);
                    if (regular != null) {
                        load.accept(regular);
                        apiLogMore("Loaded from classpath: " + regular);
                        return;
                    }
                }

                // Always use the SLL if the library is found in the classpath,
                // so that newer versions can be detected.
                if (debugLoader) {
                    apiLogMore("Using SharedLibraryLoader...");
                }
                // Extract from classpath and try org.lwjgl.librarypath
                try (FileChannel ignored = SharedLibraryLoader.load(name, libName, libURL, load)) {
                    if (loadSystemFromLibraryPath(load, context, module, libName, bundledWithLWJGL)) {
                        return;
                    }
                }
            } catch (Exception e) {
                if (debugLoader) {
                    e.printStackTrace(DEBUG_STREAM);
                }
            }
        }

        String javaLibraryPath = System.getProperty(JAVA_LIBRARY_PATH);

        // METHOD 3: java.library.path (bundled only)
        if (bundledWithLWJGL && javaLibraryPath != null) {
            if (loadSystem(load, context, module, getBundledPath(module, libName), false, JAVA_LIBRARY_PATH, javaLibraryPath)) {
                return;
            }
        }

        // METHOD 4: System.loadLibrary
        try {
            loadLibrary.accept(name);

            // Success, but java.library.path might be empty, or not include the library.
            // In that case, ClassLoader::findLibrary was used to return the library path (e.g. OSGi does this with native libraries in bundles).
            Path libFile = javaLibraryPath == null ? null : findFile(javaLibraryPath, module, libName, bundledWithLWJGL);
            if (libFile != null) {
                apiLogMore(String.format("Loaded from %s: %s", JAVA_LIBRARY_PATH, libFile));
                if (bundledWithLWJGL) {
                    checkHash(context, libFile, module, libName);
                }
            } else {
                apiLogMore("Loaded from a ClassLoader provided path.");
            }
            return;
        } catch (Throwable t) {
            apiLogMore(libName + " not found in " + JAVA_LIBRARY_PATH);
        }

        detectPlatformMismatch(context, module);
        printError(true);
        throw new UnsatisfiedLinkError("Failed to locate library: " + libName);
    }

    private static boolean loadSystemFromLibraryPath(Consumer<String> load, Class<?> context, String module, String libName, boolean bundledWithLWJGL) {
        String paths = Configuration.LIBRARY_PATH.get();
        return paths != null && loadSystem(load, context, module, libName, bundledWithLWJGL, Configuration.LIBRARY_PATH.getProperty(), paths);
    }

    private static boolean loadSystem(Consumer<String> load, Class<?> context, String module, String libName, boolean bundledWithLWJGL, String property, String paths) {
        Path libFile = findFile(paths, module, libName, bundledWithLWJGL);
        if (libFile == null) {
            apiLogMore(libName + " not found in " + property + "=" + paths);
            return false;
        }

        load.accept(libFile.toAbsolutePath().toString());
        apiLogMore("Loaded from " + property + ": " + libFile);
        if (bundledWithLWJGL) {
            checkHash(context, libFile, module, libName);
        }
        return true;
    }

    /** Calls {@link #loadNative(Class, String, String)} using {@code Library.class} as the context parameter. */
    public static SharedLibrary loadNative(String module, String name) {
        return loadNative(Library.class, module, name);
    }

    /**
     * Loads a shared library using OS-specific APIs (e.g. {@link org.lwjgl.system.windows.WinBase#LoadLibrary LoadLibrary} or
     * {@link org.lwjgl.system.linux.DynamicLinkLoader#dlopen dlopen}).
     *
     * @param context the class to use to discover the shared library in the classpath
     * @param module  the module to which the shared library belongs
     * @param name    the library name. OS-specific prefixes and file extensions are optional (e.g. both {@code "GL"} and {@code "libGL.so.1"} are
     *                valid on Linux)
     *
     * @return the shared library
     *
     * @throws UnsatisfiedLinkError if the library could not be loaded
     */
    @SuppressWarnings("try")
    public static SharedLibrary loadNative(Class<?> context, String module, String name) {
        return loadNative(context, module, name, false);
    }

    /**
     * Loads a shared library using OS-specific APIs (e.g. {@link org.lwjgl.system.windows.WinBase#LoadLibrary LoadLibrary} or
     * {@link org.lwjgl.system.linux.DynamicLinkLoader#dlopen dlopen}).
     *
     * @param context          the class to use to discover the shared library in the classpath
     * @param module           the module to which the shared library belongs
     * @param name             the library name. OS-specific prefixes and file extensions are optional (e.g. both {@code "GL"} and {@code "libGL.so.1"} are
     *                         valid on Linux)
     * @param bundledWithLWJGL whether the default LWJGL distribution includes the shared library. If true, LWJGL will also try to find the shared library under
     *                         the {@code <platform>/<arch>/<module>} subfolder.
     *
     * @return the shared library
     *
     * @throws UnsatisfiedLinkError if the library could not be loaded
     */
    public static SharedLibrary loadNative(Class<?> context, String module, String name, boolean bundledWithLWJGL) {
        return loadNative(context, module, name, bundledWithLWJGL, true);
    }

    @SuppressWarnings("try")
    private static SharedLibrary loadNative(Class<?> context, String module, String name, boolean bundledWithLWJGL, boolean printError) {
        if (DEBUG) {
            DEBUG_STREAM.print(
                "[LWJGL] Loading library: " + name +
                "\n\tModule: " + module +
                "\n"
            );
        }

        // METHOD 1: absolute path
        if (Paths.get(name).isAbsolute()) {
            SharedLibrary lib = apiCreateLibrary(name);
            apiLogMore("Success");
            return lib;
        }

        String        libName = Platform.get().mapLibraryName(name);
        SharedLibrary lib;

        // METHOD 2: org.lwjgl.librarypath
        URL libURL = findResource(context, module, libName, bundledWithLWJGL);
        if (libURL == null) {
            lib = loadNativeFromLibraryPath(context, module, libName, bundledWithLWJGL);
            if (lib != null) {
                return lib;
            }
        } else {
            boolean debugLoader = Configuration.DEBUG_LOADER.get(false);
            try {
                if (!Configuration.SHARED_LIBRARY_EXTRACT_FORCE.get(false)) {
                    String regular = getRegularFilePath(libURL);
                    if (regular != null) {
                        lib = apiCreateLibrary(regular);
                        apiLogMore("Loaded from classpath: " + regular);
                        return lib;
                    }
                }

                // Always use the SLL if the library is found in the classpath,
                // so that newer versions can be detected.
                if (debugLoader) {
                    apiLogMore("Using SharedLibraryLoader...");
                }
                // Extract from classpath and try org.lwjgl.librarypath
                try (FileChannel ignored = SharedLibraryLoader.load(name, libName, libURL, null)) {
                    lib = loadNativeFromLibraryPath(context, module, libName, bundledWithLWJGL);
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
                        apiLogMore("Loaded from ClassLoader provided path: " + libPath);
                        return lib;
                    }
                } catch (Exception ignored) {
                    // This will fail on JDK 9 without --add-opens java.base/java.lang=ALL-UNNAMED
                }
            }

            // Then java.library.path
            String paths = System.getProperty(JAVA_LIBRARY_PATH);
            if (paths != null) {
                lib = loadNative(context, module, libName, bundledWithLWJGL, JAVA_LIBRARY_PATH, paths);
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
            detectPlatformMismatch(context, module);
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
            apiLogMore(path == null
                ? "Loaded from system paths"
                : "Loaded from system paths: " + path);
        } catch (UnsatisfiedLinkError e) {
            lib = null;
            apiLogMore(libName + " not found in system paths");
        }
        return lib;
    }

    @Nullable
    private static SharedLibrary loadNativeFromLibraryPath(Class<?> context, String module, String libName, boolean bundledWithLWJGL) {
        String paths = Configuration.LIBRARY_PATH.get();
        if (paths == null) {
            return null;
        }
        return loadNative(context, module, libName, bundledWithLWJGL, Configuration.LIBRARY_PATH.getProperty(), paths);
    }

    @Nullable
    private static SharedLibrary loadNative(Class<?> context, String module, String libName, boolean bundledWithLWJGL, String property, String paths) {
        Path libFile = findFile(paths, module, libName, bundledWithLWJGL);
        if (libFile == null) {
            apiLogMore(libName + " not found in " + property + "=" + paths);
            return null;
        }

        SharedLibrary lib = apiCreateLibrary(libFile.toAbsolutePath().toString());
        apiLogMore("Loaded from " + property + ": " + libFile);
        if (bundledWithLWJGL) {
            checkHash(context, libFile, module, libName);
        }
        return lib;
    }

    /**
     * Loads a shared library using {@link #loadNative(String, String)} with the name specified by {@code name}. If {@code name} is not set,
     * {@link #loadNative(String, String)} will be called with the names specified by {@code defaultNames}. The first successful will be returned.
     *
     * @param name         a {@link Configuration} that specifies the library name
     * @param defaultNames the default library name(s)
     *
     * @return the shared library
     *
     * @throws UnsatisfiedLinkError if the library could not be loaded
     */
    public static SharedLibrary loadNative(Class<?> context, String module, @Nullable Configuration<String> name, String... defaultNames) {
        return loadNative(context, module, name, null, defaultNames);
    }

    /**
     * Loads a shared library using {@link #loadNative(String, String)} with the name specified by {@code name}. If {@code name} is not set,
     * {@link #loadNative(String, String)} will be called with the names specified by {@code defaultNames}. The first successful will be returned. If the library could
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
    public static SharedLibrary loadNative(Class<?> context, String module, @Nullable Configuration<String> name, @Nullable Supplier<SharedLibrary> fallback, String... defaultNames) {
        if (defaultNames.length == 0) {
            throw new IllegalArgumentException("No default names specified.");
        }

        if (name != null) {
            String libraryName = name.get();
            if (libraryName != null) {
                return loadNative(context, module, libraryName);
            }
        }

        if (fallback == null && defaultNames.length <= 1) {
            return loadNative(context, module, defaultNames[0]);
        }

        try {
            return loadNative(context, module, defaultNames[0], false, false); // try first
        } catch (Throwable t) {
            for (int i = 1; i < defaultNames.length; i++) { // try alternatives
                try {
                    return loadNative(context, module, defaultNames[i], false, fallback == null && i == defaultNames.length - 1);
                } catch (Throwable ignored) {
                }
            }
            if (fallback != null) {
                return fallback.get();
            }
            throw t; // original error
        }
    }

    private static String getBundledPath(String module, String resource) {
        return Platform.mapLibraryPathBundled(module.replace('.', '/') + "/" + resource);
    }

    @Nullable
    static URL findResource(Class<?> context, String module, String resource, boolean bundledWithLWJGL) {
        URL url = null;
        if (bundledWithLWJGL) {
            String bundledResource = getBundledPath(module, resource);
            if (!bundledResource.equals(resource)) {
                url = context.getClassLoader().getResource(bundledResource);
            }
        }
        return url == null ? context.getClassLoader().getResource(resource) : url;
    }

    @Nullable
    static String getRegularFilePath(URL url) {
        if (url.getProtocol().equals("file")) {
            try {
                Path path = Paths.get(url.toURI());
                if (path.isAbsolute() && Files.isReadable(path)) {
                    return path.toString();
                }
            } catch (URISyntaxException ignored) {
            }
        }
        return null;
    }

    @Nullable
    static Path findFile(String path, String module, String file, boolean bundledWithLWJGL) {
        if (bundledWithLWJGL) {
            String bundledFile = getBundledPath(module, file);
            if (!bundledFile.equals(file)) {
                Path p = findFile(path, bundledFile);
                if (p != null) {
                    return p;
                }
            }
        }
        return findFile(path, file);
    }

    @Nullable
    private static Path findFile(String path, String file) {
        for (String directory : PATH_SEPARATOR.split(path)) {
            Path p = Paths.get(directory, file);
            if (Files.isReadable(p)) {
                return p;
            }
        }
        return null;
    }

    private static void detectPlatformMismatch(Class<?> context, String module) {
        if (!module.startsWith("org.lwjgl")) {
            return;
        }

        String moduleTitle = module.equals("org.lwjgl") ? "lwjgl" : "lwjgl-" + module.substring("org.lwjgl.".length());

        List<String> platforms = new ArrayList<>(8);
        try {
            Enumeration<URL> manifests = context.getClassLoader().getResources(JarFile.MANIFEST_NAME);
            while (manifests.hasMoreElements()) {
                try (InputStream is = manifests.nextElement().openStream()) {
                    Manifest   manifest = new Manifest(is);
                    Attributes attribs  = manifest.getMainAttributes();

                    if (moduleTitle.equals(attribs.getValue("Implementation-Title"))) {
                        String jarPlatform = attribs.getValue("LWJGL-Platform");
                        if (jarPlatform != null) {
                            platforms.add(jarPlatform);
                        }
                    }
                }
            }
        } catch (IOException ignored) {
        }

        if (!platforms.isEmpty()) {
            DEBUG_STREAM.print(
                "[LWJGL] Platform/architecture mismatch detected for module: " + module +
                "\n\tJVM platform:" +
                "\t\t" + Platform.get().getName() + " " + System.getProperty("os.arch") + " " + System.getProperty("java.version") + "\n" +
                "\t\t" + System.getProperty("java.vm.name") + " v" + System.getProperty("java.vm.version") + " by " + System.getProperty("java.vm.vendor") + "\n" +
                "\tPlatform" + (platforms.size() == 1 ? "" : "s") + " available on classpath:\n\t\t" + String.join("\n\t\t", platforms) + "\n"
            );
        }
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
        StringBuilder sb = new StringBuilder(message);
        sb.append("\n");

        if (!DEBUG) {
            sb.append("[LWJGL] Enable debug mode with -Dorg.lwjgl.util.Debug=true for better diagnostics.\n");
            if (!Configuration.DEBUG_LOADER.get(false)) {
                sb.append("[LWJGL] Enable the SharedLibraryLoader debug mode with -Dorg.lwjgl.util.DebugLoader=true for better diagnostics.\n");
            }
        }

        DEBUG_STREAM.print(sb);
    }

    /**
     * Compares the shared library hash stored in the classpath, with the hash of the actual library loaded at runtime.
     *
     * <p>This check prints a simple warning when there's a hash mismatch, to help diagnose installation/classpath issues. It is not a security feature.</p>
     *
     * @param context the class to use to discover the shared library hash in the classpath
     * @param libFile the library file loaded
     */
    private static void checkHash(Class<?> context, Path libFile, String module, String libName) {
        if (!CHECKS) {
            return;
        }

        try {
            URL classesURL = null;
            URL nativesURL = null;

            Enumeration<URL> resources = context.getClassLoader().getResources("META-INF/" + getBundledPath(module, libName) + ".sha1");
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