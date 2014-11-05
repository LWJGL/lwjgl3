/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl;

import org.lwjgl.system.Platform;
import org.lwjgl.system.windows.WindowsPlatform;

import java.io.File;
import java.security.AccessController;
import java.security.PrivilegedAction;

import static org.lwjgl.LWJGLUtil.*;

/**
 * System class. The static initializers in this class must run before
 * anything else executes in LWJGL.
 */
public final class Sys {

	/** The native library name */
	private static final String JNI_LIBRARY_NAME = "lwjgl";

	private static final Platform platform;
	private static final String   nativeLibrary;

	/** Current version of library. */
	public static final int
		VERSION_MAJOR    = 3,
		VERSION_MINOR    = 0,
		VERSION_REVISION = 0;

	/** The development state of the current build. */
	public static final BuildType BUILD_TYPE = BuildType.ALPHA;

	static {
		log("Version " + getVersion());
		platform = new WindowsPlatform();
		nativeLibrary = loadLibrary(JNI_LIBRARY_NAME);
	}

	private Sys() {
	}

	/** Dummy method to trigger the static initializers. */
	public static void touch() {
		// Intentionally empty
	}

	/** Returns the Platform implementation. */
	public static Platform getPlatform() {
		return platform;
	}

	/** Returns the native LWJGL library file that was loaded. */
	public static String getNativeLibrary() {
		return nativeLibrary;
	}

	/** Returns the LWJGL version. */
	public static String getVersion() {
		return String.valueOf(VERSION_MAJOR) + '.' + VERSION_MINOR + '.' + VERSION_REVISION + BUILD_TYPE.postfix;
	}

	private static String loadLibrary(final String libraryName) {
		return AccessController.doPrivileged(new PrivilegedAction<String>() {
			@Override
			public String run() {
				String libraryPath = System.getProperty("org.lwjgl.librarypath");

				if ( libraryPath != null )
					System.load(libraryPath + File.separator + System.mapLibraryName(libraryName));
				else
					System.loadLibrary(libraryName);

				return libraryName;
			}
		});
	}

	/** The development state of the current build. */
	public static enum BuildType {
		/** Work in progress, unstable. */
		ALPHA("a"),
		/** Feature complete, unstable. */
		BETA("b"),
		/** Feature complete, stable, official release. */
		STABLE("");

		final String postfix;

		BuildType(String postfix) {
			this.postfix = postfix;
		}
	}

}