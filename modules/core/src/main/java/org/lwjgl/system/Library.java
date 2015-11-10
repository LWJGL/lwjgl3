/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import org.lwjgl.Version;

import java.io.File;
import java.util.regex.Pattern;

import static org.lwjgl.system.APIUtil.*;

/** Initializes the LWJGL native library and handles loading additional shared libraries. */
public final class Library {

	/** The LWJGL native library name */
	public static final String JNI_LIBRARY_NAME = Configuration.LIBRARY_NAME_LWJGL.get(System.getProperty("os.arch").contains("64") ? "lwjgl" : "lwjgl32");

	private static final String JAVA_LIBRARY_PATH = "java.library.path";

	private static final LibraryLoader<Boolean> LOADER_SYSTEM = new LibraryLoader<Boolean>() {
		@Override
		public Boolean load(File library) {
			System.load(library.getAbsolutePath());
			return true;
		}
	};

	private static final LibraryLoader<SharedLibrary> LOADER_NATIVE = new LibraryLoader<SharedLibrary>() {
		@Override
		public SharedLibrary load(File library) {
			return apiCreateLibrary(library.getPath());
		}
	};

	static {
		if ( Checks.DEBUG ) {
			apiLog("Version: " + Version.getVersion());
			apiLog("\t OS: " + System.getProperty("os.name") + " v" + System.getProperty("os.version"));
			apiLog("\tJRE: " + System.getProperty("java.version") + " " + System.getProperty("os.arch"));
			apiLog("\tJVM: " + System.getProperty("java.vm.name") + " v" + System.getProperty("java.vm.version") + " by " + System.getProperty("java.vm.vendor"));
		}

		try {
			loadSystem(JNI_LIBRARY_NAME);
		} catch (UnsatisfiedLinkError ule) {
			try {
				// Failed, attempt to extract the natives from the classpath
				SharedLibraryLoader.load();
				// and try again
				loadSystem(JNI_LIBRARY_NAME);
			} catch (Throwable t) {
				if ( Checks.DEBUG )
					t.printStackTrace(DEBUG_STREAM);
				throw ule;
			}
		}
	}

	private Library() {}

	/** Ensures that the LWJGL native library has been loaded. */
	public static void initialize() {
		// intentionally empty to trigger static initializer
	}

	/**
	 * Loads a native library using {@link System}.
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
		} catch (UnsatisfiedLinkError t) {
			try {
				// Then the current working directory
				System.load(new File("./" + Platform.get().mapLibraryName(name)).getAbsolutePath());
				apiLog("Loaded library from the working directory: " + name);
			} catch (UnsatisfiedLinkError ignored) {
				throw t;
			}
		}
	}

	/**
	 * Loads a native library using OS-specific APIs (e.g. {@link org.lwjgl.system.windows.WinBase#LoadLibrary LoadLibrary} or
	 * {@link org.lwjgl.system.linux.DynamicLinkLoader#dlopen dlopen}).
	 *
	 * @param name the library name, without an OS specific prefix or file extension (e.g. GL, not libGL.so)
	 *
	 * @return the native library
	 *
	 * @throws UnsatisfiedLinkError if the library could not be loaded
	 */

	public static SharedLibrary loadNative(String name) {
		if ( new File(name).isAbsolute() )
			return apiCreateLibrary(name);

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