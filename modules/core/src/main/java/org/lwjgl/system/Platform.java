/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import java.util.regex.Pattern;

public enum Platform {

	LINUX("Linux") {
		private final Pattern SO = Pattern.compile("lib\\w+[.]so(?:[.]\\d+){0,3}");

		@Override
		String mapLibraryName(String name) {
			if ( SO.matcher(name).matches() )
				return name;

			return System.mapLibraryName(name);
		}
	},
	MACOSX("Mac OS X") {
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
	WINDOWS("Windows") {
		@Override
		String mapLibraryName(String name) {
			if ( name.endsWith(".dll") )
				return name;

			return System.mapLibraryName(name);
		}
	};

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

	private final String name;

	Platform(String name) {
		this.name = name;
	}

	/** Returns the platform name. */
	public String getName() {
		return name;
	}

	abstract String mapLibraryName(String name);

	/** Returns the platform on which the library is running. */
	public static Platform get() {
		return PLATFORM;
	}

}