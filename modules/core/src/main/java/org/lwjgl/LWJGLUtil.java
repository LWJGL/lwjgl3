/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl;

import org.lwjgl.system.DynamicLinkLibrary;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import static org.lwjgl.system.APIUtil.*;

/** Internal library methods */
public final class LWJGLUtil {

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
	 * Checks flag. When enabled, LWJGL will perform basic checks during its operation, mainly to avoid crashes in native code. Examples
	 * of such checks are: context-specific function address validation, buffer capacity checks, null-termination checks, etc.
	 * These checks are generally low-overhead and should not have a measurable effect on performance, so its recommended to have them
	 * enabled both during development and in production releases.
	 * <p/>
	 * If maximum performance is required, they can be disabled by setting the system property {@code org.lwjgl.util.NoChecks} to true.
	 */
	public static final boolean CHECKS = !Boolean.getBoolean("org.lwjgl.util.NoChecks");

	/**
	 * Debug flag. When enabled, LWJGL will perform additional checks during its operation. These checks are less trivial than the ones
	 * enabled with {@link #CHECKS} and will have a noticeable effect on performance, so they are disabled by default. Examples of such
	 * checks are: a GetError call after SwapBuffers, buffer object binding state check (GL), buffer capacity checks for texture images (GL & CL), etc.
	 * LWJGL will also print additional information in stdout, mainly during start-up.
	 * <p/>
	 * Can be enabled by setting the system property {@code org.lwjgl.util.Debug} to true.
	 *
	 * @see org.lwjgl.opencl.OpenCLException
	 * @see org.lwjgl.opengl.OpenGLException
	 */
	public static final boolean DEBUG = Boolean.getBoolean("org.lwjgl.util.Debug");

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
	 * <p>If {@code name} is an absolute path or {@code org.lwjgl.librarypath} is set, {@link System#load} will be used. Otherwise, {@link System#loadLibrary}
	 * will be used.</p>
	 *
	 * @param name the library name. If not an absolute path, it must be the plain library name, without an OS specific prefix or file extension (e.g. GL, not
	 *             libGL.so)
	 *
	 * @throws UnsatisfiedLinkError if the library could not be loaded
	 */
	public static void loadLibrarySystem(String name) throws UnsatisfiedLinkError {
		if ( new File(name).isAbsolute() ) {
			System.load(name);
			LWJGLUtil.log("Loaded library: " + name);
			return;
		}

		// Try org.lwjgl.librarypath first
		String override = System.getProperty("org.lwjgl.librarypath");
		if ( override != null ) {
			String libName = PLATFORM.mapLibraryName(name);
			if ( loadLibrary(LOADER_SYSTEM, override, libName, false) ) {
				LWJGLUtil.log("Loaded library from org.lwjgl.librarypath: " + libName);
				return;
			}
		}

		// Then java.library.path
		System.loadLibrary(name);
		LWJGLUtil.log("Loaded library from java.library.path: " + name);
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
		String libName;
		if ( new File(name).isAbsolute() )
			libName = name;
		else {
			libName = PLATFORM.mapLibraryName(name);

			// Try org.lwjgl.librarypath first
			String override = System.getProperty("org.lwjgl.librarypath");
			if ( override != null ) {
				DynamicLinkLibrary lib = loadLibrary(LOADER_NATIVE, override, libName, null);
				if ( lib != null )
					return lib;
			}

			// Then java.library.path
			DynamicLinkLibrary lib = loadLibrary(LOADER_NATIVE, System.getProperty("java.library.path"), libName, null);
			if ( lib != null )
				return lib;
		}

		// Then the OS paths
		return apiCreateLibrary(libName);
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

	/**
	 * Prints the specified message to System.err if DEBUG is true.
	 *
	 * @param msg Message to print
	 */
	public static void log(CharSequence msg) {
		if ( DEBUG ) {
			System.err.print("[LWJGL] ");
			System.err.println(msg);
		}
	}

	/**
	 * Returns a map of public static final integer fields in the specified classes, to their String representations.
	 * An optional filter can be specified to only include specific fields. The target map may be null, in which
	 * case a new map is allocated and returned.
	 * <p/>
	 * This method is useful when debugging to quickly identify values returned from the AL/GL/CL APIs.
	 *
	 * @param filter       the filter to use (optional)
	 * @param target       the target map (optional)
	 * @param tokenClasses an array of classes to get tokens from
	 *
	 * @return the token map
	 */

	public static Map<Integer, String> getClassTokens(TokenFilter filter, Map<Integer, String> target, Class<?>... tokenClasses) {
		return getClassTokens(filter, target, Arrays.asList(tokenClasses));
	}

	/**
	 * Returns a map of public static final integer fields in the specified classes, to their String representations.
	 * An optional filter can be specified to only include specific fields. The target map may be null, in which
	 * case a new map is allocated and returned.
	 * <p/>
	 * This method is useful when debugging to quickly identify values returned from the AL/GL/CL APIs.
	 *
	 * @param filter       the filter to use (optional)
	 * @param target       the target map (optional)
	 * @param tokenClasses the classes to get tokens from
	 *
	 * @return the token map
	 */
	public static Map<Integer, String> getClassTokens(TokenFilter filter, Map<Integer, String> target, Iterable<Class<?>> tokenClasses) {
		if ( target == null )
			target = new HashMap<Integer, String>(64);

		int TOKEN_MODIFIERS = Modifier.PUBLIC | Modifier.STATIC | Modifier.FINAL;

		for ( Class<?> tokenClass : tokenClasses ) {
			if ( tokenClass == null )
				continue;

			for ( Field field : tokenClass.getDeclaredFields() ) {
				// Get only <public static final int> fields.
				if ( (field.getModifiers() & TOKEN_MODIFIERS) == TOKEN_MODIFIERS && field.getType() == int.class ) {
					try {
						int value = field.getInt(null);
						if ( filter != null && !filter.accept(field, value) )
							continue;

						String name = target.get(value);
						target.put(value, name == null ? field.getName() : name + "|" + field.getName());
					} catch (IllegalAccessException e) {
						// Ignore
					}
				}
			}
		}

		return target;
	}

	public static Class<?> getOptionalClass(String className) {
		try {
			return Class.forName(className);
		} catch (ClassNotFoundException e) {
			return null;
		}
	}

	/** Simple interface for Field filtering. */
	public interface TokenFilter {

		/**
		 * Should return true if the specified Field passes the filter.
		 *
		 * @param field the Field to test
		 * @param value the integer value of the field
		 *
		 * @return true if the Field is accepted
		 */
		boolean accept(Field field, int value);

	}

}