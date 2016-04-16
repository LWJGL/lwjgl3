/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import org.lwjgl.PointerBuffer;
import org.lwjgl.system.linux.LinuxLibrary;
import org.lwjgl.system.macosx.MacOSXLibrary;
import org.lwjgl.system.windows.WindowsLibrary;

import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;

/**
 * Utility class useful to API bindings. [INTERNAL USE ONLY]
 *
 * <p>Method names in this class are prefixed with {@code api} to avoid ambiguities when used with static imports.</p>
 *
 * @see Configuration#DEBUG_STREAM
 */
public final class APIUtil {

	/**
	 * The {@link PrintStream} used by LWJGL to print debug information and non-fatal errors. Defaults to {@link System#err} which can be changed with
	 * {@link Configuration#DEBUG_STREAM}.
	 */
	public static final PrintStream DEBUG_STREAM;

	static {
		PrintStream debugStream = System.err;

		Object state = Configuration.DEBUG_STREAM.get();
		if ( state instanceof String ) {
			try {
				Configuration.DebugStreamFactory factory = (Configuration.DebugStreamFactory)Class.forName((String)state).newInstance();
				debugStream = factory.create();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if ( state instanceof Configuration.DebugStreamFactory ) {
			debugStream = ((Configuration.DebugStreamFactory)state).create();
		} else if ( state instanceof PrintStream )
			debugStream = (PrintStream)state;

		DEBUG_STREAM = debugStream;
	}

	private APIUtil() {
	}

	/**
	 * Prints the specified message to the {@link #DEBUG_STREAM} if {@link Checks#DEBUG} is true.
	 *
	 * @param msg the message to print
	 */
	public static void apiLog(CharSequence msg) {
		if ( DEBUG ) {
			DEBUG_STREAM.print("[LWJGL] ");
			DEBUG_STREAM.println(msg);
		}
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

	public static long apiGetFunctionAddress(FunctionProvider provider, String functionName) {
		return checkFunctionAddress(provider.getFunctionAddress(functionName));
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

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder(16);
			sb.append(major).append('.').append(minor);
			if ( revision != null )
				sb.append('.').append(revision);
			if ( implementation != null )
				sb.append(" (").append(implementation).append(')');
			return sb.toString();
		}
	}

	/**
	 * Returns the {@link APIVersion} value of the specified option.
	 *
	 * @param option the option to query
	 */
	public static APIVersion apiParseVersion(Configuration<?> option) {
		APIVersion version;

		Object state = option.get();
		if ( state instanceof String )
			version = apiParseVersion((String)state, null);
		else if ( state instanceof APIVersion )
			version = (APIVersion)state;
		else
			version = null;

		return version;
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
			pattern = "(?:" + prefix + "\\s+)?" + pattern;

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
	public static Map<Integer, String> apiClassTokens(BiPredicate<Field, Integer> filter, Map<Integer, String> target, Class<?>... tokenClasses) {
		if ( target == null )
			target = new HashMap<>(64);

		int TOKEN_MODIFIERS = Modifier.PUBLIC | Modifier.STATIC | Modifier.FINAL;

		for ( Class<?> tokenClass : tokenClasses ) {
			if ( tokenClass == null )
				continue;

			for ( Field field : tokenClass.getDeclaredFields() ) {
				// Get only <public static final int> fields.
				if ( (field.getModifiers() & TOKEN_MODIFIERS) == TOKEN_MODIFIERS && field.getType() == int.class ) {
					try {
						Integer value = field.getInt(null);
						if ( filter != null && !filter.test(field, value) )
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

	public static long apiCallbackText(String text) {
		int size = memLengthUTF8(text, true);
		long address = getAllocator().malloc(size);
		memUTF8(text, true, memByteBuffer(address, size));
		return address;
	}

	public static boolean apiCompareCapabilities(Iterable<Field> flags, Iterable<Field> funcs, Object a, Object b) {
		try {
			for ( Field f : flags ) {
				if ( f.getBoolean(a) != f.getBoolean(b) )
					return false;
			}

			for ( Field f : funcs ) {
				if ( f.getLong(a) != f.getLong(b) )
					return false;
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	// ----------------------------------------

	/** Ensures space for an additional pointer buffer, sets the specified memory addresses and returns the address offset. */
	public static long apiArray(MemoryStack stack, long... addresses) {
		PointerBuffer pointers = stack.mallocPointer(addresses.length);

		for ( long address : addresses )
			pointers.put(address);

		return memAddress0(pointers);
	}

	/** Ensures space for an additional pointer buffer, sets the memory addresses of the specified buffers and returns the address offset. */
	public static long apiArray(MemoryStack stack, ByteBuffer... buffers) {
		PointerBuffer pointers = stack.mallocPointer(buffers.length);

		for ( ByteBuffer buffer : buffers )
			pointers.put(buffer);

		return memAddress0(pointers);
	}

	/**
	 * Ensures space for two additional pointer buffers, sets the memory addresses and remaining bytes of the specified buffers and returns the address
	 * offset.
	 */
	public static long apiArrayp(MemoryStack stack, ByteBuffer... buffers) {
		long pointers = apiArray(stack, buffers);

		PointerBuffer lengths = stack.mallocPointer(buffers.length);

		for ( ByteBuffer buffer : buffers )
			lengths.put(buffer.remaining());

		return pointers;
	}

	public static void apiArrayFree(long pointers, int length) {
		for ( int i = 0; i < length; i++ )
			nmemFree(memGetAddress(pointers + (i << POINTER_SHIFT)));
	}

	// ----------------------------------------

	/**
	 * ASCII encodes the specified strings with a null-terminator and ensures space for a buffer filled with the memory addresses of the encoded strings.
	 *
	 * @return the buffer address
	 */
	public static long apiArrayASCII(MemoryStack stack, CharSequence... strings) {
		PointerBuffer pointers = stack.mallocPointer(strings.length);

		for ( CharSequence s : strings )
			pointers.put(memASCII(s));

		return memAddress0(pointers);
	}

	/**
	 * ASCII encodes the specified strings and ensures space for two additional buffers filled with the lengths and memory addresses of the encoded strings,
	 * respectively. The lengths are 4-bytes integers and the memory address buffer starts immediately after the lengths buffer.
	 *
	 * <p>The encoded buffers must be later freed with {@link #apiArrayFree}.</p>
	 *
	 * @return the offset to the lengths buffer
	 */
	public static long apiArrayASCIIi(MemoryStack stack, CharSequence... strings) {
		// Alignment rules guarantee these two will be contiguous
		PointerBuffer pointers = stack.mallocPointer(strings.length);
		IntBuffer lengths = stack.mallocInt(strings.length);

		for ( CharSequence s : strings ) {
			ByteBuffer buffer = memASCII(s, false);

			pointers.put(buffer);
			lengths.put(buffer.capacity());
		}

		return memAddress0(pointers);
	}

	/**
	 * ASCII encodes the specified strings and ensures space for two additional buffers filled with the lengths and memory addresses of the encoded strings,
	 * respectively. The lengths are pointer-sized integers and the memory address buffer starts immediately after the lengths buffer.
	 *
	 * <p>The encoded buffers must be later freed with {@link #apiArrayFree}.</p>
	 *
	 * @return the offset to the lengths buffer
	 */
	public static long apiArrayASCIIp(MemoryStack stack, CharSequence... strings) {
		PointerBuffer pointers = stack.mallocPointer(strings.length);
		PointerBuffer lengths = stack.mallocPointer(strings.length);

		for ( CharSequence s : strings ) {
			ByteBuffer buffer = memASCII(s, false);

			pointers.put(buffer);
			lengths.put(buffer.capacity());
		}

		return memAddress0(pointers);
	}

	/**
	 * UTF8 encodes the specified strings with a null-terminator and ensures space for a buffer filled with the memory addresses of the encoded strings.
	 *
	 * <p>The encoded buffers must be later freed with {@link #apiArrayFree}.</p>
	 *
	 * @return the offset to the memory address buffer
	 */
	public static long apiArrayUTF8(MemoryStack stack, CharSequence... strings) {
		PointerBuffer pointers = stack.mallocPointer(strings.length);

		for ( CharSequence s : strings )
			pointers.put(memUTF8(s));

		return memAddress0(pointers);
	}

	/**
	 * UTF8 encodes the specified strings and ensures space for two additional buffers filled with the lengths and memory addresses of the encoded strings,
	 * respectively. The lengths are 4-bytes integers and the memory address buffer starts immediately after the lengths buffer.
	 *
	 * <p>The encoded buffers must be later freed with {@link #apiArrayFree}.</p>
	 *
	 * @return the offset to the lengths buffer
	 */
	public static long apiArrayUTF8i(MemoryStack stack, CharSequence... strings) {
		// Alignment rules guarantee these two will be contiguous
		PointerBuffer pointers = stack.mallocPointer(strings.length);
		IntBuffer lengths = stack.mallocInt(strings.length);

		for ( CharSequence s : strings ) {
			ByteBuffer buffer = memUTF8(s, false);

			pointers.put(buffer);
			lengths.put(buffer.capacity());
		}

		return memAddress0(pointers);
	}

	/**
	 * UTF8 encodes the specified strings and ensures space for two additional buffers filled with the lengths and memory addresses of the encoded strings,
	 * respectively. The lengths are pointer-sized integers and the memory address buffer starts immediately after the lengths buffer.
	 *
	 * <p>The encoded buffers must be later freed with {@link #apiArrayFree}.</p>
	 *
	 * @return the offset to the lengths buffer
	 */
	public static long apiArrayUTF8p(MemoryStack stack, CharSequence... strings) {
		PointerBuffer pointers = stack.mallocPointer(strings.length);
		PointerBuffer lengths = stack.mallocPointer(strings.length);

		for ( CharSequence s : strings ) {
			ByteBuffer buffer = memUTF8(s, false);

			pointers.put(buffer);
			lengths.put(buffer.capacity());
		}

		return memAddress0(pointers);
	}

	/**
	 * UTF16 encodes the specified strings with a null-terminator and ensures space for a buffer filled with the memory addresses of the encoded strings.
	 *
	 * <p>The encoded buffers must be later freed with {@link #apiArrayFree}.</p>
	 *
	 * @return the offset to the memory address buffer
	 */
	public static long apiArrayUTF16(MemoryStack stack, CharSequence... strings) {
		PointerBuffer pointers = stack.mallocPointer(strings.length);

		for ( CharSequence s : strings )
			pointers.put(memUTF16(s));

		return memAddress0(pointers);
	}

	/**
	 * UTF16 encodes the specified strings and ensures space for two additional buffers filled with the lengths and memory addresses of the encoded strings,
	 * respectively. The lengths are 4-bytes integers and the memory address buffer starts immediately after the lengths buffer.
	 *
	 * <p>The encoded buffers must be later freed with {@link #apiArrayFree}.</p>
	 *
	 * @return the offset to the lengths buffer
	 */
	public static long apiArrayUTF16i(MemoryStack stack, CharSequence... strings) {
		// Alignment rules guarantee these two will be contiguous
		PointerBuffer pointers = stack.mallocPointer(strings.length);
		IntBuffer lengths = stack.mallocInt(strings.length);

		for ( CharSequence s : strings ) {
			ByteBuffer buffer = memUTF16(s, false);

			pointers.put(buffer);
			lengths.put(buffer.capacity());
		}

		return memAddress0(pointers);
	}

	/**
	 * UTF16 encodes the specified strings and ensures space for two additional buffers filled with the lengths and memory addresses of the encoded strings,
	 * respectively. The lengths are pointer-sized integers and the memory address buffer starts immediately after the lengths buffer.
	 *
	 * <p>The encoded buffers must be later freed with {@link #apiArrayFree}.</p>
	 *
	 * @return the offset to the lengths buffer
	 */
	public static long apiArrayUTF16p(MemoryStack stack, CharSequence... strings) {
		PointerBuffer pointers = stack.mallocPointer(strings.length);
		PointerBuffer lengths = stack.mallocPointer(strings.length);

		for ( CharSequence s : strings ) {
			ByteBuffer buffer = memUTF16(s, false);

			pointers.put(buffer);
			lengths.put(buffer.capacity());
		}

		return memAddress0(pointers);
	}

	// ----------------------------------------

}