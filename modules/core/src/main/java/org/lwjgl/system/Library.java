/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.lwjgl.Version;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.regex.Pattern;

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
		if ( DEBUG ) {
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
	 * Loads a shared library using {@link System#load}.
	 *
	 * @param name the library name. If not an absolute path, it must be the plain library name, without an OS specific prefix or file extension (e.g. GL, not
	 *             libGL.so)
	 *
	 * @throws UnsatisfiedLinkError if the library could not be loaded
	 */
	@SuppressWarnings("try")
	public static void loadSystem(String name) throws UnsatisfiedLinkError {
		apiLog("Loading library (system): " + name);
		if ( Paths.get(name).isAbsolute() ) {
			System.load(name);
			apiLog("\tSuccess");
			return;
		}

		String libName = Platform.get().mapLibraryName(name);

		URL libURL = Library.class.getResource("/" + libName);
		if ( libURL == null ) {
			// Try org.lwjgl.librarypath
			if ( loadSystem(libName, Configuration.LIBRARY_PATH) )
				return;
		} else {
			// Always use the SLL if the library is found in the classpath,
			// so that newer versions can be detected.
			boolean debugLoader = Configuration.DEBUG_LOADER.get(false);
			try {
				if ( debugLoader )
					apiLog("\tUsing SharedLibraryLoader...");
				// Extract from classpath and try org.lwjgl.librarypath
				try ( FileChannel ignored = SharedLibraryLoader.load(name, libName, libURL) ) {
					if ( loadSystem(libName, Configuration.LIBRARY_PATH) )
						return;
				}
			} catch (Exception e) {
				if ( debugLoader )
					e.printStackTrace(DEBUG_STREAM);
			}
		}

		// Then java.library.path
		String paths = System.getProperty(JAVA_LIBRARY_PATH);
		if ( paths != null ) {
			try {
				System.loadLibrary(name);

				Path libFile = findLibrary(paths, libName);
				if ( libFile != null ) {
					apiLog(String.format("\tLoaded from %s: %s", JAVA_LIBRARY_PATH, libFile));
					checkHash(libFile);
				}
				return;
			} catch (Throwable t) {
				apiLog(String.format("\t%s not found in %s", libName, JAVA_LIBRARY_PATH));
			}
		}

		printError();
		throw new UnsatisfiedLinkError("Failed to locate library: " + libName);
	}

	private static boolean loadSystem(String libName, Configuration<String> property) {
		String paths = property.get();
		return paths != null && loadSystem(libName, property.getProperty(), paths);
	}

	private static boolean loadSystem(String libName, String property, String paths) {
		Path libFile = findLibrary(paths, libName);
		if ( libFile == null ) {
			apiLog(String.format("\t%s not found in %s=%s", libName, property, paths));
			return false;
		}

		System.load(libFile.toAbsolutePath().toString());
		apiLog(String.format("\tLoaded from %s: %s", property, libFile));
		checkHash(libFile);
		return true;
	}

	/**
	 * Loads a shared library using OS-specific APIs (e.g. {@link org.lwjgl.system.windows.WinBase#LoadLibrary LoadLibrary} or
	 * {@link org.lwjgl.system.linux.DynamicLinkLoader#dlopen dlopen}).
	 *
	 * @param name the library name. OS-specific prefixes and file extensions are optional (e.g. both {@code "GL"} and {@code "libGL.so.1"} are valid on Linux)
	 *
	 * @return the shared library
	 *
	 * @throws UnsatisfiedLinkError if the library could not be loaded
	 */
	@SuppressWarnings("try")
	public static SharedLibrary loadNative(String name) {
		apiLog("Loading library: " + name);
		if ( new File(name).isAbsolute() ) {
			SharedLibrary lib = apiCreateLibrary(name);
			apiLog("\tSuccess");
			return lib;
		}

		String libName = Platform.get().mapLibraryName(name);
		SharedLibrary lib;

		URL libURL = Library.class.getResource("/" + libName);
		if ( libURL == null ) {
			// Try org.lwjgl.librarypath
			lib = loadNative(libName, Configuration.LIBRARY_PATH);
			if ( lib != null )
				return lib;
		} else {
			boolean debugLoader = Configuration.DEBUG_LOADER.get(false);
			try {
				// Always use the SLL if the library is found in the classpath,
				// so that newer versions can be detected.
				if ( debugLoader )
					apiLog("\tUsing SharedLibraryLoader...");
				// Extract from classpath and try org.lwjgl.librarypath
				try ( FileChannel ignored = SharedLibraryLoader.load(name, libName, libURL) ) {
					return loadNative(libName, Configuration.LIBRARY_PATH);
				}
			} catch (Exception e) {
				if ( debugLoader )
					e.printStackTrace(DEBUG_STREAM);
			}
		}

		// Then java.library.path
		String paths = System.getProperty(JAVA_LIBRARY_PATH);
		if ( paths != null ) {
			lib = loadNative(libName, JAVA_LIBRARY_PATH, paths);
			if ( lib != null )
				return lib;
		}

		// Then the OS paths
		try {
			lib = apiCreateLibrary(libName);
			apiLog("\tLoaded from system paths");
			return lib;
		} catch (UnsatisfiedLinkError e) {
			apiLog(String.format("\t%s not found in system paths", libName));
		}

		printError();
		throw new UnsatisfiedLinkError("Failed to locate library: " + libName);
	}

	private static SharedLibrary loadNative(String libName, Configuration<String> property) {
		String paths = property.get();
		if ( paths != null ) {
			SharedLibrary lib = loadNative(libName, property.getProperty(), paths);
			if ( lib != null )
				return lib;
		}
		return null;
	}

	private static SharedLibrary loadNative(String libName, String property, String paths) {
		Path libFile = findLibrary(paths, libName);
		if ( libFile == null ) {
			apiLog(String.format("\t%s not found in %s=%s", libName, property, paths));
			return null;
		}

		SharedLibrary lib = apiCreateLibrary(libFile.toString());
		apiLog(String.format("\tLoaded from %s: %s", property, libFile));
		checkHash(libFile);
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
	public static SharedLibrary loadNative(Configuration<String> name, String... defaultNames) {
		if ( name.get() != null )
			return loadNative(name.get());
		else if ( defaultNames.length <= 1 ) {
			if ( defaultNames.length == 0 )
				throw new RuntimeException("No default names specified.");

			return loadNative(defaultNames[0]);
		} else {
			SharedLibrary library = null;
			try {
				library = Library.loadNative(defaultNames[0]); // try first
			} catch (Throwable t) {
				for ( int i = 1; i < defaultNames.length; i++ ) { // try alternatives
					try {
						library = Library.loadNative(defaultNames[i]);
						break;
					} catch (Throwable ignored) {
					}
				}
				if ( library == null )
					throw t; // original error
			}
			return library;
		}
	}

	private static Path findLibrary(String path, String libName) {
		for ( String directory : PATH_SEPARATOR.split(path) ) {
			Path p = Paths.get(directory, libName);
			if ( Files.isReadable(p) )
				return p;
		}
		return null;
	}

	private static void printError() {
		DEBUG_STREAM.println(
			"[LWJGL] Failed to load a library. Possible solutions:\n" +
				"\ta) Set -Djava.library.path or -Dorg.lwjgl.librarypath to the directory that contains the shared libraries.\n" +
				"\tb) Add the JAR(s) containing the shared libraries to the classpath."
		);

		if ( !DEBUG ) {
			DEBUG_STREAM.println("[LWJGL] Enable debug mode with -Dorg.lwjgl.util.Debug=true for better diagnostics.");
			if ( !Configuration.DEBUG_LOADER.get(false) )
				DEBUG_STREAM.println("[LWJGL] Enable the SharedLibraryLoader debug mode with -Dorg.lwjgl.util.DebugLoader=true for better diagnostics.");
		}
	}

	/**
	 * Compares the shared library hash stored in the classpath, with the hash of the actual library loaded at runtime.
	 *
	 * <p>This check prints a simple warning when there's a hash mismatch, to help diagnose installation/classpath issues. It is not a security feature.</p>
	 *
	 * @param libFile the library file loaded
	 */
	private static void checkHash(Path libFile) {
		if ( !CHECKS )
			return;

		try {
			URL classesURL = null;
			URL nativesURL = null;

			Enumeration<URL> resources = Library.class.getClassLoader().getResources(libFile.getFileName() + ".sha1");
			while ( resources.hasMoreElements() ) {
				URL url = resources.nextElement();
				if ( NATIVES_JAR.matcher(url.toExternalForm()).find() )
					nativesURL = url;
				else
					classesURL = url;
			}
			if ( classesURL == null )
				return;

			byte[] expected = getSHA1(classesURL);
			byte[] actual = DEBUG || nativesURL == null
				? getSHA1(libFile)
				: getSHA1(nativesURL);

			if ( !Arrays.equals(expected, actual) )
				DEBUG_STREAM.println("[LWJGL] [WARNING] Mismatch detected between the Java and native libraries.");
		} catch (Exception e) {
			if ( DEBUG ) {
				apiLog("Failed to verify native library.");
				e.printStackTrace();
			}
		}
	}

	private static byte[] getSHA1(URL hashURL) throws IOException {
		byte[] hash = new byte[20];
		try ( InputStream sha1 = hashURL.openStream() ) {
			for ( int i = 0; i < 20; i++ )
				hash[i] = (byte)((Character.digit(sha1.read(), 16) << 4) | Character.digit(sha1.read(), 16));
		}
		return hash;
	}

	private static byte[] getSHA1(Path libFile) throws NoSuchAlgorithmException, IOException {
		MessageDigest digest = MessageDigest.getInstance("SHA-1");
		try ( FileChannel fc = FileChannel.open(libFile) ) {
			MappedByteBuffer buffer = fc.map(MapMode.READ_ONLY, 0, fc.size());
			digest.update(buffer);
		}
		return digest.digest();
	}

}