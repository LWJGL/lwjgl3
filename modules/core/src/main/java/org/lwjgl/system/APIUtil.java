/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.system.linux.LinuxLibrary;
import org.lwjgl.system.macosx.MacOSXLibrary;
import org.lwjgl.system.windows.WindowsLibrary;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Utility class useful to API bindings.
 * <p/>
 * Method names in this class are prefixed with {@code api} to avoid ambiguities when used with static imports.
 */
public final class APIUtil {

	private static final ThreadLocal<APIBuffer> API_BUFFERS = new ThreadLocal<APIBuffer>() {
		@Override
		protected APIBuffer initialValue() {
			return new APIBuffer();
		}
	};

	static {
		LWJGLUtil.initialize();
	}

	private APIUtil() {
	}

	/** Returns a resetted thread-local {@link APIBuffer}. */
	public static APIBuffer apiBuffer() {
		return API_BUFFERS.get().reset();
	}

	/**
	 * Returns a thread-local {@link APIBuffer}, without resetting it. This makes the APIBuffer work like a stack when used in nested API calls. The user is
	 * responsible for resetting the {@link APIBuffer} to an appropriate state before the nested call returns.
	 *
	 * @see APIBuffer#pop
	 */
	public static APIBuffer apiStack() {
		return API_BUFFERS.get().push();
	}

	public static DynamicLinkLibrary apiCreateLibrary(String name) {
		switch ( LWJGLUtil.getPlatform() ) {
			case WINDOWS:
				return new WindowsLibrary(name);
			case LINUX:
				return new LinuxLibrary(name);
			case MACOSX:
				return MacOSXLibrary.create(name);
			default:
				throw new IllegalStateException();
		}
	}

	/** A data class for API versioning information. */
	public static class APIVersion {

		/** Returns the API major version. */
		public final int major;
		/** Returns the API minor version. */
		public final int minor;

		/** Returns the API revision. May be null. */
		public final String revision;
		/** Returns the API implementation-specific versioning information. May be null. */
		public final String implementation;

		public APIVersion(int major, int minor, String revision, String implementation) {
			this.major = major;
			this.minor = minor;
			this.revision = revision;
			this.implementation = implementation;
		}

	}

	/**
	 * Parses a version string. The version string must have the format {@code MAJOR.MINOR.REVISION IMPL}, where {@code MAJOR} is the major version (integer),
	 * {@code MINOR} is the minor version (integer), {@code REVISION} is the revision version (string, optional) and {@code IMPL} is implementation-specific
	 * information (string, optional).
	 *
	 * @param version the API version string
	 *
	 * @return the parsed {@link APIVersion}
	 */
	public static APIVersion apiParseVersion(String version) {
		return apiParseVersion(version, null);
	}

	/**
	 * Parses a version string. The version string must have the format {@code PREFIX MAJOR.MINOR.REVISION IMPL}, where {@code PREFIX} is the specified prefix
	 * (string, optional), {@code MAJOR} is the major version (integer), {@code MINOR} is the minor version (integer), {@code REVISION} is the revision version
	 * (string, optional) and {@code IMPL} is implementation-specific information (string, optional).
	 *
	 * @param version the version string
	 * @param prefix  the version string prefix, may be null
	 *
	 * @return the parsed {@link APIVersion}
	 */
	public static APIVersion apiParseVersion(String version, String prefix) {
		String pattern = "([0-9]+)[.]([0-9]+)([.]\\S+)?\\s*(.+)?";
		if ( prefix != null )
			pattern = prefix + "\\s+" + pattern;

		Matcher matcher = Pattern.compile(pattern).matcher(version);
		if ( !matcher.matches() )
			throw new IllegalArgumentException(String.format("Malformed API version string [%s]", version));

		return new APIVersion(
			Integer.parseInt(matcher.group(1)),
			Integer.parseInt(matcher.group(2)),
			matcher.group(3),
			matcher.group(4)
		);
	}

}