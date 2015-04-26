/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl;

import java.security.AccessController;
import java.security.PrivilegedAction;

import static org.lwjgl.LWJGLUtil.*;

/**
 * System class. The static initializers in this class must run before
 * anything else executes in LWJGL.
 */
public final class Sys {

	/** The native library name */
	public static final String JNI_LIBRARY_NAME = System.getProperty("org.lwjgl.libname", System.getProperty("os.arch").contains("64") ? "lwjgl" : "lwjgl32");

	/** Current version of library. */
	public static final int
		VERSION_MAJOR    = 3,
		VERSION_MINOR    = 0,
		VERSION_REVISION = 0;

	/** The development state of the current build. */
	public static final BuildType BUILD_TYPE = BuildType.ALPHA;

	static {
		log("Version " + getVersion() + " | " + System.getProperty("os.name") + " | " + System.getProperty("os.arch"));

		AccessController.doPrivileged(new PrivilegedAction<Object>() {
			@Override
			public Object run() {
				LWJGLUtil.loadLibrarySystem(JNI_LIBRARY_NAME);
				return null;
			}
		});
	}

	private Sys() {
	}

	// Dummy method to trigger the static initializers.
	static void touch() {
		// Intentionally empty
	}

	/** Returns the LWJGL version. */
	public static String getVersion() {
		return String.valueOf(VERSION_MAJOR) + '.' + VERSION_MINOR + '.' + VERSION_REVISION + BUILD_TYPE.postfix;
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