/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl;

import java.io.InputStream;
import java.net.URL;
import java.util.jar.JarFile;
import java.util.jar.Manifest;

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
	public static final BuildType BUILD_TYPE = BuildType.BETA;

	static {
		log("Version " + getVersion() + " | " + System.getProperty("os.name") + " | " + System.getProperty("os.arch"));
		try {
			LWJGLUtil.loadLibrarySystem(JNI_LIBRARY_NAME);
		} catch (Throwable t) {
			// Failed, attempt to extract the natives from the classpath
			SharedLibraryLoader.load();
			// and try again
			LWJGLUtil.loadLibrarySystem(JNI_LIBRARY_NAME);
		}
	}

	private Sys() {
	}

	// Dummy method to trigger the static initializers.
	static void touch() {
		// Intentionally empty
	}

	// Returns sizeof(void *)
	static native int getPointerSize();

	/** Returns the LWJGL version. */
	public static String getVersion() {
		return String.valueOf(VERSION_MAJOR) + '.' + VERSION_MINOR + '.' + VERSION_REVISION + BUILD_TYPE.postfix + ' ' + getVersionImpl();
	}

	private static String getVersionImpl() {
		URL url = Sys.class.getClassLoader().getResource("org/lwjgl/Sys.class");
		if ( url != null ) {
			String classURL = url.toString();
			if ( classURL.startsWith("jar:") ) {
				try {
					InputStream stream = new URL(
						classURL.substring(0, classURL.lastIndexOf("!") + 1) + '/' + JarFile.MANIFEST_NAME
					).openStream();

					try {
						return new Manifest(stream)
							.getAttributes("org/lwjgl/")
							.getValue("Implementation-Version");
					} finally {
						stream.close();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

		return "SNAPSHOT";
	}

	public static void main(String[] args) {
		System.out.println(getVersion());
	}

	/** The development state of the current build. */
	public enum BuildType {
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