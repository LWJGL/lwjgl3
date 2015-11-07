/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl;

import org.lwjgl.system.Configuration;
import org.lwjgl.system.DynamicLinkLibrary;

import java.io.File;
import java.io.PrintStream;
import java.util.regex.Pattern;

import static org.lwjgl.system.APIUtil.*;

/** Internal library methods */
public final class LWJGLUtil {

	private static final String JAVA_LIBRARY_PATH = "java.library.path";

	public enum Platform {
		LINUX("linux") {
			private final Pattern SO = Pattern.compile("lib\\w+[.]so(?:[.]\\d+){0,3}");

			@Override
			String mapLibraryName(String name) {
				if ( SO.matcher(name).matches() )
					return name;

				return System.mapLibraryName(name);
			}
		},
		MACOSX("macosx") {
			private final Pattern SO = Pattern.compile("lib\\w+[.]dylib");

			@Override
			String mapLibraryName(String name) {
				if ( SO.matcher(name).matches() )
					return name;

				// Work around for System.mapLibraryName on OS X + JDK 6, which maps to .jnilib instead of .dylib
				String libName = System.mapLibraryName(name);
				return libName.endsWith(".jnilib")
					? libName.substring(0, libName.length() - ".jnilib".length()) + ".dylib"
					: libName;
			}
		},
		WINDOWS("windows") {
			@Override
			String mapLibraryName(String name) {
				if ( name.endsWith(".dll") )
					return name;

				return System.mapLibraryName(name);
			}
		};

		private final String name;

		Platform(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		abstract String mapLibraryName(String name);
	}

	/**
	 * Checks flag. When enabled, LWJGL will perform basic checks during its operation, mainly to avoid crashes in native code. Examples of such checks are:
	 * context-specific function address validation, buffer capacity checks, null-termination checks, etc. These checks are generally low-overhead and should
	 * not have a measurable effect on performance, so its recommended to have them enabled both during development and in production releases.
	 *
	 * <p>If maximum performance is required, they can be disabled by setting {@link Configuration#DISABLE_CHECKS} to true.</p>
	 */
	public static final boolean CHECKS = !Configuration.DISABLE_CHECKS.<Boolean>get();

	/**
	 * Debug flag. When enabled, LWJGL will perform additional checks during its operation. These checks are less trivial than the ones enabled with
	 * {@link #CHECKS} and will have a noticeable effect on performance, so they are disabled by default. Examples of such checks are: a GetError call after
	 * SwapBuffers, buffer object binding state check (GL), buffer capacity checks for texture images (GL & CL), etc. LWJGL will also print additional
	 * information in stdout, mainly during start-up.
	 *
	 * <p>Can be enabled by setting {@link Configuration#DEBUG} to true.</p>
	 *
	 * @see org.lwjgl.opencl.OpenCLException
	 * @see org.lwjgl.opengl.OpenGLException
	 */
	public static final boolean DEBUG = Configuration.DEBUG.<Boolean>get();

	/**
	 * The {@link PrintStream} used by LWJGL to print debug information and non-fatal errors. Defaults to {@link System#err} which can be changed with
	 * {@link Configuration#DEBUG_STREAM}.
	 */
	public static final PrintStream DEBUG_STREAM = Configuration.createDebugStream();

	private static final Platform PLATFORM;

	static {
		String osName = System.getProperty("os.name");
		if ( osName.startsWith("Windows") )
			PLATFORM = Platform.WINDOWS;
		else if ( osName.startsWith("Linux") || osName.startsWith("FreeBSD") || osName.startsWith("SunOS") || osName.startsWith("Unix") )
			PLATFORM = Platform.LINUX;
		else if ( osName.startsWith("Mac OS X") || osName.startsWith("Darwin") )
			PLATFORM = Platform.MACOSX;
		else
			throw new LinkageError("Unknown platform: " + osName);
	}

	private LWJGLUtil() {}

	/**
	 * @return the current platform type
	 *
	 * @see Platform
	 */
	public static Platform getPlatform() {
		return PLATFORM;
	}

	/**
	 * @return current platform name
	 *
	 * @see Platform
	 */
	public static String getPlatformName() {
		return PLATFORM.getName();
	}

	/** Ensures that the LWJGL native library has been loaded. */
	public static void initialize() {
		Sys.touch();
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
	public static void loadLibrarySystem(String name) throws UnsatisfiedLinkError {
		if ( new File(name).isAbsolute() ) {
			System.load(name);
			apiLog("Loaded library: " + name);
			return;
		}

		// Try org.lwjgl.librarypath first
		String override = Configuration.LIBRARY_PATH.get();
		if ( override != null && loadLibrary(LOADER_SYSTEM, override, PLATFORM.mapLibraryName(name), false) ) {
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
				System.load(new File("./" + PLATFORM.mapLibraryName(name)).getAbsolutePath());
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

	public static DynamicLinkLibrary loadLibraryNative(String name) {
		if ( new File(name).isAbsolute() )
			return apiCreateLibrary(name);

		String libName = PLATFORM.mapLibraryName(name);

		// Try org.lwjgl.librarypath first
		String override = Configuration.LIBRARY_PATH.get();
		if ( override != null ) {
			DynamicLinkLibrary lib = loadLibrary(LOADER_NATIVE, override, libName, null);
			if ( lib != null )
				return lib;
		}

		// Then java.library.path
		DynamicLinkLibrary lib = loadLibrary(LOADER_NATIVE, System.getProperty(JAVA_LIBRARY_PATH), libName, null);
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

	private static final LibraryLoader<Boolean> LOADER_SYSTEM = new LibraryLoader<Boolean>() {
		@Override
		public Boolean load(File library) {
			System.load(library.getAbsolutePath());
			return true;
		}
	};

	private static final LibraryLoader<DynamicLinkLibrary> LOADER_NATIVE = new LibraryLoader<DynamicLinkLibrary>() {
		@Override
		public DynamicLinkLibrary load(File library) {
			return apiCreateLibrary(library.getPath());
		}
	};

	private static <T> T loadLibrary(LibraryLoader<T> loader, String path, String libName, T onFailure) {
		for ( String root : Pattern.compile(File.pathSeparator).split(path) ) {
			File f = new File(root + File.separator + libName);
			if ( f.exists() )
				return loader.load(f);
		}

		return onFailure;
	}

}