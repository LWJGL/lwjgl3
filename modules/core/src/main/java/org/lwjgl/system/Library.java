/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import org.lwjgl.Version;

import java.io.File;
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

	private static final LibraryLoader<Boolean> LOADER_SYSTEM = library -> {
		System.load(library.getAbsolutePath());
		return true;
	};

	private static final LibraryLoader<SharedLibrary> LOADER_NATIVE = library -> apiCreateLibrary(library.getPath());

	static {
		if ( Checks.DEBUG ) {
			apiLog("Version: " + Version.getVersion());
			apiLog("\t OS: " + System.getProperty("os.name") + " v" + System.getProperty("os.version"));
			apiLog("\tJRE: " + System.getProperty("java.version") + " " + System.getProperty("os.arch"));
			apiLog(
				"\tJVM: " + System.getProperty("java.vm.name") + " v" + System.getProperty("java.vm.version") + " by " + System.getProperty("java.vm.vendor")
			);
		}

		try {
			loadSystemRelative(JNI_LIBRARY_NAME);
		} catch (UnsatisfiedLinkError ule) {
			try {
				// Failed, attempt to extract from the classpath
				SharedLibraryLoader.load();
				// and try again
				loadSystemRelative(JNI_LIBRARY_NAME);
			} catch (Throwable t) {
				if ( Checks.DEBUG )
					t.printStackTrace(DEBUG_STREAM);
				throw ule;
			}
		}
	}

	private Library() {}

	/** Ensures that the LWJGL shared library has been loaded. */
	public static void initialize() {
		// intentionally empty to trigger static initializer
	}

	/**
	 * Loads a shared library using {@link System}.
	 *
	 * <p>If {@code name} is an absolute path or {@link Configuration#LIBRARY_PATH} is set, {@link System#load} will be used. Otherwise,
	 * {@link System#loadLibrary} will be used.</p>
	 *
	 * @param name the library name. If not an absolute path, it must be the plain library name, without an OS specific prefix or file extension (e.g. GL, not
	 *             libGL.so)
	 *
	 * @throws UnsatisfiedLinkError if the library could not be loaded
	 */
	public static void loadSystem(String name) throws UnsatisfiedLinkError {
		if ( new File(name).isAbsolute() ) {
			System.load(name);
			apiLog("Loaded library: " + name);
			return;
		}

		try {
			loadSystemRelative(name);
		} catch (UnsatisfiedLinkError e) {
			try {
				// Failed, attempt to extract from the classpath
				SharedLibraryLoader.load(name);
				// and try again
				loadSystemRelative(name);
			} catch (Throwable t) {
				if ( Checks.DEBUG )
					t.printStackTrace(DEBUG_STREAM);
				throw e;
			}

		}
	}

	private static void loadSystemRelative(String name) {
		// Try org.lwjgl.librarypath first
		String override = Configuration.LIBRARY_PATH.get();
		if ( override != null && loadLibrary(LOADER_SYSTEM, override, Platform.get().mapLibraryName(name), false) ) {
			apiLog("Loaded library from " + Configuration.LIBRARY_PATH.getProperty() + ": " + name);
			return;
		}

		// Then java.library.path
		try {
			System.loadLibrary(name);
			apiLog("Loaded library from " + JAVA_LIBRARY_PATH + ": " + name);
		} catch (UnsatisfiedLinkError e) {
			try {
				// Then the current working directory
				System.load(new File("./" + Platform.get().mapLibraryName(name)).getAbsolutePath());
				apiLog("Loaded library from the working directory: " + name);
			} catch (UnsatisfiedLinkError ignored) {
				throw e;
			}
		}
	}

	/**
	 * Loads a shared library using OS-specific APIs (e.g. {@link org.lwjgl.system.windows.WinBase#LoadLibrary LoadLibrary} or
	 * {@link org.lwjgl.system.linux.DynamicLinkLoader#dlopen dlopen}).
	 *
	 * @param name the library name. OS-specific prefixes and file extensions are optional (e.g. both {@code "GL"} and {@code "libGL.so.1"} are valid on Linux)
	 *
	 * @return the shared library
	 *
	 * @throws RuntimeException if the library could not be loaded
	 */
	public static SharedLibrary loadNative(String name) {
		if ( new File(name).isAbsolute() )
			return apiCreateLibrary(name);

		try {
			return loadNativeRelative(name);
		} catch (RuntimeException e) {
			try {
				// Failed, attempt to extract from the classpath
				SharedLibraryLoader.load(name);
				// and try again
				return loadNativeRelative(name);
			} catch (Throwable t) {
				if ( Checks.DEBUG )
					t.printStackTrace(DEBUG_STREAM);
				throw e;
			}
		}
	}

	private static SharedLibrary loadNativeRelative(String name) {
		String libName = Platform.get().mapLibraryName(name);

		// Try org.lwjgl.librarypath first
		String override = Configuration.LIBRARY_PATH.get();
		if ( override != null ) {
			SharedLibrary lib = loadLibrary(LOADER_NATIVE, override, libName, null);
			if ( lib != null )
				return lib;
		}

		// Then java.library.path
		SharedLibrary lib = loadLibrary(LOADER_NATIVE, System.getProperty(JAVA_LIBRARY_PATH), libName, null);
		if ( lib != null )
			return lib;

		// Then the OS paths
		try {
			return apiCreateLibrary(libName);
		} catch (RuntimeException e) {
			try {
				// Then the current working directory
				return apiCreateLibrary("./" + libName);
			} catch (Exception ignored) {
				throw e;
			}
		}
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
	 * @throws RuntimeException if the library could not be loaded
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
			} catch (Exception e) {
				for ( int i = 1; i < defaultNames.length; i++ ) { // try alternatives
					try {
						library = Library.loadNative(defaultNames[i]);
						break;
					} catch (Exception ignored) {
					}
				}
				if ( library == null )
					throw new RuntimeException("Failed to load library.", e); // original exception
			}
			return library;
		}
	}

	private interface LibraryLoader<T> {
		T load(File library);
	}

	private static <T> T loadLibrary(LibraryLoader<T> loader, String path, String libName, T onFailure) {
		for ( String root : Pattern.compile(File.pathSeparator).split(path) ) {
			File f = new File(root + File.separator + libName);
			if ( f.exists() )
				return loader.load(f);
		}

		return onFailure;
	}

}