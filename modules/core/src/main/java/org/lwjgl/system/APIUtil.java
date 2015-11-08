/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import org.lwjgl.system.linux.LinuxLibrary;
import org.lwjgl.system.macosx.MacOSXLibrary;
import org.lwjgl.system.windows.WindowsLibrary;

import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Utility class useful to API bindings. [INTERNAL USE ONLY]
 *
 * <p>Method names in this class are prefixed with {@code api} to avoid ambiguities when used with static imports.</p>
 */
public final class APIUtil {

	/**
	 * The {@link PrintStream} used by LWJGL to print debug information and non-fatal errors. Defaults to {@link System#err} which can be changed with
	 * {@link Configuration#DEBUG_STREAM}.
	 */
	public static final PrintStream DEBUG_STREAM = Configuration.createDebugStream();

	private static final ThreadLocal<APIBuffer> API_BUFFERS = new ThreadLocal<APIBuffer>() {
		@Override
		protected APIBuffer initialValue() {
			return new APIBuffer();
		}
	};

	static {
		Library.initialize();
	}

	private APIUtil() {
	}

	/**
	 * Prints the specified message to the {@link #DEBUG_STREAM} if {@link Checks#DEBUG} is true.
	 *
	 * @param msg the message to print
	 */
	public static void apiLog(CharSequence msg) {
		if ( Checks.DEBUG ) {
			DEBUG_STREAM.print("[LWJGL] ");
			DEBUG_STREAM.println(msg);
		}
	}

	/** Returns a thread-local {@link APIBuffer} that has been reset. */
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

	public static SharedLibrary apiCreateLibrary(String name) {
		switch ( Platform.get() ) {
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

		public APIVersion(int major, int minor) {
			this(major, minor, null, null);
		}

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

	public static String apiUnknownToken(int token) {
		return apiUnknownToken("Unknown", token);
	}

	public static String apiUnknownToken(String description, int token) {
		return String.format("%s [0x%X]", description, token);
	}

	/**
	 * Returns a map of public static final integer fields in the specified classes, to their String representations. An optional filter can be specified to
	 * only include specific fields. The target map may be null, in which case a new map is allocated and returned.
	 *
	 * <p>This method is useful when debugging to quickly identify values returned from an API.</p>
	 *
	 * @param filter       the filter to use (optional)
	 * @param target       the target map (optional)
	 * @param tokenClasses the classes to get tokens from
	 *
	 * @return the token map
	 */
	public static Map<Integer, String> apiClassTokens(TokenFilter filter, Map<Integer, String> target, Class<?>... tokenClasses) {
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

	public static Class<?> apiOptionalClass(String className) {
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