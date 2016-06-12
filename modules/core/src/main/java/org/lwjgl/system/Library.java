/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import org.lwjgl.Version;

import java.io.File;
import java.io.FileInputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.util.Optional;
import java.util.regex.Pattern;

import static org.lwjgl.system.APIUtil.*;

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

	static {
		if ( Checks.DEBUG ) {
			apiLog("Version: " + Version.getVersion());
			apiLog("\t OS: " + System.getProperty("os.name") + " v" + System.getProperty("os.version"));
			apiLog("\tJRE: " + System.getProperty("java.version") + " " + System.getProperty("os.arch"));
			apiLog(
				"\tJVM: " + System.getProperty("java.vm.name") + " v" + System.getProperty("java.vm.version") + " by " + System.getProperty("java.vm.vendor")
			);
		}

		loadSystem(JNI_LIBRARY_NAME);
		checkHash();
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
	public static void loadSystem(String name) throws UnsatisfiedLinkError {
		apiLog("Loading library (system): " + name);
		if ( new File(name).isAbsolute() ) {
			System.load(name);
			apiLog("\tSuccess");
			return;
		}

		String libName = Platform.get().mapLibraryName(name);

		// Try org.lwjgl.librarypath first
		if ( loadSystem(libName, Configuration.LIBRARY_PATH) )
			return;

		try {
			// Failed, attempt to extract from the classpath
			if ( Checks.DEBUG )
				DEBUG_STREAM.print("[LWJGL] \tUsing SharedLibraryLoader...");
			SharedLibraryLoader.load(name);
			if ( Checks.DEBUG )
				DEBUG_STREAM.println("found");
			// and try again
			if ( loadSystem(libName, Configuration.LIBRARY_PATH) )
				return;
		} catch (Exception e) {
			if ( Checks.DEBUG )
				DEBUG_STREAM.println("failed");
			if ( Configuration.DEBUG_LOADER.get(false) )
				e.printStackTrace(DEBUG_STREAM);
		}

		// Then java.library.path
		String paths = System.getProperty(JAVA_LIBRARY_PATH);
		if ( paths != null && loadSystem(libName, JAVA_LIBRARY_PATH, paths) )
			return;

		printError();
		throw new UnsatisfiedLinkError("Failed to locate library: " + libName);
	}

	private static boolean loadSystem(String libName, Configuration<String> property) {
		String paths = property.get();
		return paths != null && loadSystem(libName, property.getProperty(), paths);
	}

	private static boolean loadSystem(String libName, String property, String paths) {
		File libFile = findLibrary(paths, libName).orElse(null);
		if ( libFile == null ) {
			apiLog(String.format("\t%s not found in %s=%s", libName, property, paths));
			return false;
		}

		System.load(libFile.getAbsolutePath());
		apiLog(String.format("\tLoaded from %s: %s", property, libFile.getPath()));
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
	public static SharedLibrary loadNative(String name) {
		apiLog("Loading library: " + name);
		if ( new File(name).isAbsolute() ) {
			SharedLibrary lib = apiCreateLibrary(name);
			apiLog("\tSuccess");
			return lib;
		}

		String libName = Platform.get().mapLibraryName(name);

		// Try org.lwjgl.librarypath first
		SharedLibrary lib = loadNative(libName, Configuration.LIBRARY_PATH);
		if ( lib != null )
			return lib;

		try {
			if ( Checks.DEBUG )
				DEBUG_STREAM.print("[LWJGL] \tUsing SharedLibraryLoader...");
			// Failed, attempt to extract from the classpath
			SharedLibraryLoader.load(name);
			if ( Checks.DEBUG )
				DEBUG_STREAM.println("found");
			// and try again
			return loadNative(libName, Configuration.LIBRARY_PATH);
		} catch (Exception e) {
			if ( Checks.DEBUG )
				DEBUG_STREAM.println("failed");
			if ( Configuration.DEBUG_LOADER.get(false) )
				e.printStackTrace(DEBUG_STREAM);
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
		File libFile = findLibrary(paths, libName).orElse(null);
		if ( libFile == null ) {
			apiLog(String.format("\t%s not found in %s=%s", libName, property, paths));
			return null;
		}

		SharedLibrary lib = apiCreateLibrary(libFile.getPath());
		apiLog(String.format("\tLoaded from %s: %s", property, libFile.getPath()));
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

	private static Optional<File> findLibrary(String path, String libName) {
		return PATH_SEPARATOR
			.splitAsStream(path)
			.map(it -> new File(it + File.separator + libName))
			.filter(File::isFile)
			.findFirst();
	}

	private static void printError() {
		DEBUG_STREAM.println(
			"[LWJGL] Failed to load a library. Possible solutions:\n" +
				"\ta) Set -Djava.library.path or -Dorg.lwjgl.librarypath to the directory that contains the shared libraries.\n" +
				"\tb) Add the JAR(s) containing the shared libraries to the classpath."
		);

		if ( !Checks.DEBUG ) {
			DEBUG_STREAM.println("[LWJGL] Enable debug mode with -Dorg.lwjgl.util.Debug=true for better diagnostics.");
			if ( !Configuration.DEBUG_LOADER.get(false) )
				DEBUG_STREAM.println("[LWJGL] Enable the SharedLibraryLoader debug mode with -Dorg.lwjgl.util.DebugLoader=true for better diagnostics.");
		}
	}

	/**
	 * Compares the shared library hash stored in lwjgl.jar, with the hash of the actual library loaded at runtime.
	 *
	 * <p>This check prints a simple warning when there's a hash mismatch, to help diagnose installation/classpath issues. It is not a security feature.</p>
	 */
	private static void checkHash() {
		String libName = Platform.get().mapLibraryName(JNI_LIBRARY_NAME);

		String expected = apiGetManifestValue(libName.replace('.', '-')).orElse(null);
		if ( expected == null )
			return;

		File libFile = null;

		// Try org.lwjgl.librarypath first
		String override = Configuration.LIBRARY_PATH.get();
		if ( override != null )
			libFile = findLibrary(override, libName).orElse(null);

		// Then java.library.path
		if ( libFile == null )
			libFile = findLibrary(System.getProperty(JAVA_LIBRARY_PATH), libName).orElse(null);

		// Then working directory
		if ( libFile == null ) {
			libFile = new File("./" + libName);
			if ( !libFile.isFile() )
				return;
		}

		try {
			MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
			try ( DigestInputStream dis = new DigestInputStream(new FileInputStream(libFile), sha1) ) {
				byte[] buffer = new byte[8 * 1024];
				while ( dis.read(buffer) != -1 ) ;
			}

			byte[] digest = sha1.digest();
			StringBuilder actual = new StringBuilder(40);
			for ( int i = 0; i < digest.length; i++ ) {
				int b = digest[i] & 0xFF;
				if ( b < 0x10 )
					actual.append('0');
				actual.append(Integer.toHexString(b));
			}

			if ( !expected.contentEquals(actual) )
				DEBUG_STREAM.println("[LWJGL] [WARNING] Mismatch detected between the Java and native LWJGL libraries." +
					                     (Checks.DEBUG ? "" : "\n\tLaunch the JVM with -Dorg.lwjgl.util.Debug=true for more information.")
				);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}