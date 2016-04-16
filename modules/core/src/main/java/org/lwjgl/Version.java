/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl;

import org.lwjgl.system.APIUtil;

import java.io.InputStream;
import java.net.URL;
import java.util.jar.JarFile;
import java.util.jar.Manifest;

/** This class can be used to query the LWJGL version. */
public final class Version {

	/** Current version of library. */
	public static final int
		VERSION_MAJOR    = 3,
		VERSION_MINOR    = 0,
		VERSION_REVISION = 0;

	/** The development state of the current build. */
	public static final BuildType BUILD_TYPE = BuildType.STABLE;

	private Version() {
	}

	public static void main(String[] args) {
		System.out.println(getVersion());
	}

	/** Returns the LWJGL version. */
	public static String getVersion() {
		return String.valueOf(VERSION_MAJOR) + '.' + VERSION_MINOR + '.' + VERSION_REVISION + BUILD_TYPE.postfix + ' ' + getVersionImpl();
	}

	private static String getVersionImpl() {
		URL url = Thread.currentThread().getContextClassLoader().getResource("org/lwjgl/Version.class");
		if ( url != null ) {
			String classURL = url.toString();
			if ( classURL.startsWith("jar:") ) {
				try ( InputStream stream = new URL(classURL.substring(0, classURL.lastIndexOf("!") + 1) + '/' + JarFile.MANIFEST_NAME).openStream() ) {
					return new Manifest(stream)
						.getAttributes("org/lwjgl/")
						.getValue("Implementation-Version");
				} catch (Exception e) {
					e.printStackTrace(APIUtil.DEBUG_STREAM);
				}
			}
		}

		return "SNAPSHOT";
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