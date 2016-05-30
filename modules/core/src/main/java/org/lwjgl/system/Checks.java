/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import org.lwjgl.PointerBuffer;

import java.nio.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;

/**
 * A class to check buffer boundaries in general. If there is insufficient space in the buffer when the call is made then a buffer overflow would otherwise
 * occur and cause unexpected behaviour, a crash, or worse, a security risk.
 *
 * <p>Internal class, don't use.</p>
 *
 * @see Configuration#DISABLE_CHECKS
 * @see Configuration#DEBUG
 * @see Configuration#DEBUG_FUNCTIONS
 */
public final class Checks {

	/**
	 * Runtime checks flag.
	 *
	 * <p>When enabled, LWJGL will perform basic checks during its operation, mainly to avoid crashes in native code. Examples of such checks are:
	 * context-specific function address validation, buffer capacity checks, null-termination checks, etc. These checks are generally low-overhead and should
	 * not have a measurable effect on performance, so its recommended to have them enabled both during development and in production releases.</p>
	 *
	 * <p>If maximum performance is required, they can be disabled by setting {@link Configuration#DISABLE_CHECKS} to true.</p>
	 */
	public static final boolean CHECKS = !Configuration.DISABLE_CHECKS.get(false);

	/**
	 * Debug mode flag.
	 *
	 * <p>When enabled, LWJGL will perform additional checks during its operation. These checks are more expensive than the ones enabled with {@link #CHECKS}
	 * and will have a noticeable effect on performance, so they are disabled by default. Examples of such checks are: buffer object binding state check (GL),
	 * buffer capacity checks for texture images (GL & CL), etc. LWJGL will also print additional information, mainly during start-up.</p>
	 *
	 * <p>Can be enabled by setting {@link Configuration#DEBUG} to true.</p>
	 */
	public static final boolean DEBUG = Configuration.DEBUG.get(false);

	/**
	 * Debug functions flag.
	 *
	 * <p>When enabled, capabilities classes will print an error message when they fail to retrieve a function pointer.</p>
	 *
	 * <p>Can be enabled by setting {@link Configuration#DEBUG_FUNCTIONS} to true.</p>
	 */
	public static final boolean DEBUG_FUNCTIONS = Configuration.DEBUG_FUNCTIONS.get(false);

	static {
		if ( DEBUG_FUNCTIONS && !DEBUG )
			APIUtil.DEBUG_STREAM.println("[LWJGL] The DEBUG_FUNCTIONS option requires DEBUG to produce output.");
	}

	private Checks() {
	}

	/**
	 * Checks if any of the specified functions pointers is {@code NULL}.
	 *
	 * @param functions the function pointers to check
	 *
	 * @return true if all function pointers are valid, false otherwise.
	 */
	public static boolean checkFunctions(long... functions) {
		for ( long pointer : functions ) {
			if ( pointer == NULL )
				return false;
		}
		return true;
	}

	/**
	 * Ensures that the specified function pointer is not-null (0L).
	 *
	 * @param pointer the pointer to check
	 *
	 * @throws IllegalStateException
	 */
	public static long checkFunctionAddress(long pointer) {
		if ( pointer == NULL )
			throw new IllegalStateException("This function is not available.");

		return pointer;
	}

	/**
	 * Ensures that the specified pointer is not-null (0L).
	 *
	 * @param pointer the pointer to check
	 *
	 * @throws NullPointerException
	 */
	public static long checkPointer(long pointer) {
		if ( pointer == NULL )
			throw new NullPointerException();

		return pointer;
	}

	/** Ensures that the specified ByteBuffer is null-terminated (last byte equal to 0). */
	public static ByteBuffer checkNT1(ByteBuffer buf) {
		checkBuffer(buf, 1);
		if ( buf.get(buf.limit() - 1) != 0 )
			throw new IllegalArgumentException("Missing null termination");

		return buf;
	}

	/** Ensures that the specified ByteBuffer is null-terminated (last 2 bytes equal to 0). */
	public static ByteBuffer checkNT2(ByteBuffer buf) {
		checkBuffer(buf, 2);
		if ( buf.getShort(buf.limit() - 2) != 0 )
			throw new IllegalArgumentException("Missing null termination");

		return buf;
	}

	/** Ensures that the specified ByteBuffer is null-terminated (last 4 bytes equal to 0). */
	public static ByteBuffer checkNT4(ByteBuffer buf) {
		checkBuffer(buf, 4);
		if ( buf.getInt(buf.limit() - 4) != 0 )
			throw new IllegalArgumentException("Missing null termination");

		return buf;
	}

	/** Ensures that the specified ByteBuffer is terminated with the specified terminator (last 4 bytes equal to {@code terminator}). */
	public static ByteBuffer checkNT4(ByteBuffer buf, int terminator) {
		checkBuffer(buf, 4);
		if ( buf.getInt(buf.limit() - 4) != terminator )
			throw new IllegalArgumentException("Missing termination");

		return buf;
	}

	/** Ensures that the specified ByteBuffer is null-terminated (last 8 bytes equal to 0). */
	public static ByteBuffer checkNT8(ByteBuffer buf) {
		checkBuffer(buf, 8);
		if ( buf.getLong(buf.limit() - 8) != 0 )
			throw new IllegalArgumentException("Missing null termination");

		return buf;
	}

	/** Ensures that the specified ByteBuffer is null-terminated (last 4 or 8 bytes equal to 0). */
	public static ByteBuffer checkNTP(ByteBuffer buf) {
		return checkNTP(buf, NULL);
	}

	/** Ensures that the specified ByteBuffer is terminated with the specified terminator (last 4 or 8 bytes equal to {@code terminator}). */
	public static ByteBuffer checkNTP(ByteBuffer buf, long terminator) {
		checkBuffer(buf, POINTER_SIZE);
		if ( PointerBuffer.get(buf, buf.limit() - POINTER_SIZE) != terminator )
			throw new IllegalArgumentException("Missing null termination");

		return buf;
	}

	/** Ensures that the specified IntBuffer is null-terminated. */
	public static IntBuffer checkNT(IntBuffer buf) {
		checkBuffer(buf, 1);
		if ( buf.get(buf.limit() - 1) != 0 )
			throw new IllegalArgumentException("Missing null termination");

		return buf;
	}

	/** Ensures that the specified array is null-terminated. */
	public static int[] checkNT(int[] buf) {
		checkBuffer(buf, 1);
		if ( buf[buf.length - 1] != 0 )
			throw new IllegalArgumentException("Missing null termination");

		return buf;
	}

	/** Ensures that the specified IntBuffer is terminated with the specified terminator. */
	public static IntBuffer checkNT(IntBuffer buf, int terminator) {
		checkBuffer(buf, 1);
		if ( buf.get(buf.limit() - 1) != terminator )
			throw new IllegalArgumentException("Missing termination");

		return buf;
	}

	/** Ensures that the specified array is terminated with the specified terminator. */
	public static int[] checkNT(int[] buf, int terminator) {
		checkBuffer(buf, 1);
		if ( buf[buf.length - 1] != terminator )
			throw new IllegalArgumentException("Missing termination");

		return buf;
	}

	/** Ensures that the specified LongBuffer is null-terminated. */
	public static LongBuffer checkNT(LongBuffer buf) {
		checkBuffer(buf, 1);
		if ( buf.get(buf.limit() - 1) != NULL )
			throw new IllegalArgumentException("Missing null termination");

		return buf;
	}

	/** Ensures that the specified array is null-terminated. */
	public static long[] checkNT(long[] buf) {
		checkBuffer(buf, 1);
		if ( buf[buf.length - 1] != NULL )
			throw new IllegalArgumentException("Missing null termination");

		return buf;
	}

	/** Ensures that the specified FloatBuffer is null-terminated. */
	public static FloatBuffer checkNT(FloatBuffer buf) {
		checkBuffer(buf, 1);
		if ( buf.get(buf.limit() - 1) != 0.0f )
			throw new IllegalArgumentException("Missing null termination");

		return buf;
	}

	/** Ensures that the specified array is null-terminated. */
	public static float[] checkNT(float[] buf) {
		checkBuffer(buf, 1);
		if ( buf[buf.length - 1] != 0.0f )
			throw new IllegalArgumentException("Missing null termination");

		return buf;
	}

	/** Ensures that the specified PointerBuffer is null-terminated. */
	public static PointerBuffer checkNT(PointerBuffer buf) {
		checkBuffer(buf, 1);
		if ( buf.get(buf.limit() - 1) != NULL )
			throw new IllegalArgumentException("Missing null termination");

		return buf;
	}

	/** Ensures that the specified PointerBuffer is terminated with the specified terminator. */
	public static PointerBuffer checkNT(PointerBuffer buf, long terminator) {
		checkBuffer(buf, 1);
		if ( buf.get(buf.limit() - 1) != terminator )
			throw new IllegalArgumentException("Missing termination");

		return buf;
	}

	/**
	 * Helper method to ensure a array has enough capacity.
	 *
	 * @param buf  the array to check
	 * @param size the minimum array capacity
	 *
	 * @throws IllegalArgumentException
	 */
	public static void checkBuffer(short[] buf, int size) {
		if ( buf.length < size ) {
			throwSizeException(buf, size);
		}
	}

	/**
	 * Helper method to ensure a array has enough capacity.
	 *
	 * @param buf  the array to check
	 * @param size the minimum array capacity
	 *
	 * @throws IllegalArgumentException
	 */
	public static void checkBuffer(int[] buf, int size) {
		if ( buf.length < size ) {
			throwSizeException(buf, size);
		}
	}

	/**
	 * Helper method to ensure a array has enough capacity.
	 *
	 * @param buf  the array to check
	 * @param size the minimum array capacity
	 *
	 * @throws IllegalArgumentException
	 */
	public static void checkBuffer(long[] buf, int size) {
		if ( buf.length < size ) {
			throwSizeException(buf, size);
		}
	}

	/**
	 * Helper method to ensure a array has enough capacity.
	 *
	 * @param buf  the array to check
	 * @param size the minimum array capacity
	 *
	 * @throws IllegalArgumentException
	 */
	public static void checkBuffer(float[] buf, int size) {
		if ( buf.length < size ) {
			throwSizeException(buf, size);
		}
	}

	/**
	 * Helper method to ensure a array has enough capacity.
	 *
	 * @param buf  the array to check
	 * @param size the minimum array capacity
	 *
	 * @throws IllegalArgumentException
	 */
	public static void checkBuffer(double[] buf, int size) {
		if ( buf.length < size ) {
			throwSizeException(buf, size);
		}
	}

	/**
	 * Helper method to ensure a CharSequence has enough characters.
	 *
	 * @param text the text to check
	 * @param size the minimum number of characters
	 */
	public static void checkBuffer(CharSequence text, int size) {
		if ( text.length() < size ) {
			throwSizeException(text, size);
		}
	}

	/**
	 * Helper method to ensure a buffer has enough capacity.
	 *
	 * @param buf  the buffer to check
	 * @param size the minimum buffer capacity
	 *
	 * @throws IllegalArgumentException
	 */
	public static void checkBuffer(Buffer buf, int size) {
		if ( buf.remaining() < size ) {
			throwSizeException(buf, size);
		}
	}

	/** @see #checkBuffer(Buffer, int) */
	public static void checkBuffer(Buffer buf, long size) {
		checkBuffer(buf, (int)size);
	}

	/**
	 * Helper method to ensure a {@link PointerBuffer} has enough capacity.
	 *
	 * @param buf  the buffer to check
	 * @param size the minimum buffer capacity
	 *
	 * @throws IllegalArgumentException
	 */
	public static void checkBuffer(PointerBuffer buf, int size) {
		if ( buf.remaining() < size ) {
			throwSizeException(buf, size);
		}
	}

	/** @see #checkBuffer(PointerBuffer, int) */
	public static void checkBuffer(PointerBuffer buf, long size) {
		checkBuffer(buf, (int)size);
	}

	/**
	 * Helper method to ensure a {@link StructBuffer} has enough capacity.
	 *
	 * @param buf  the buffer to check
	 * @param size the minimum buffer capacity
	 *
	 * @throws IllegalArgumentException
	 */
	public static void checkBuffer(StructBuffer<?, ?> buf, int size) {
		if ( buf.remaining() < size ) {
			throwSizeException(buf, size);
		}
	}

	/** @see #checkBuffer(StructBuffer, int) */
	public static void checkBuffer(StructBuffer<?, ?> buf, long size) {
		checkBuffer(buf, (int)size);
	}

	public static void checkArray(Object[] array, int size) {
		if ( array.length < size )
			throwSizeException(array, size);
	}

	public static void checkBufferGT(Buffer buf, int size) {
		if ( size < buf.remaining() )
			throwBufferSizeGTException(buf, size);
	}

	public static void checkBufferGT(PointerBuffer buf, int size) {
		if ( size < buf.remaining() )
			throwBufferSizeGTException(buf, size);
	}

	public static void checkBufferGT(StructBuffer<?, ?> buf, int size) {
		if ( size < buf.remaining() )
			throwBufferSizeGTException(buf, size);
	}

	// Separate calls to help inline checkBuffer.

	private static void throwSizeException(Buffer buf, int size) {
		throw new IllegalArgumentException("Number of remaining buffer elements is " + buf.remaining() + ", must be at least " + size);
	}

	private static void throwSizeException(PointerBuffer buf, int size) {
		throw new IllegalArgumentException("Number of remaining pointer values in buffer is " + buf.remaining() + ", must be at least " + size);
	}

	private static void throwSizeException(StructBuffer<?, ?> buf, int size) {
		throw new IllegalArgumentException("Number of remaining struct values in buffer is " + buf.remaining() + ", must be at least " + size);
	}

	private static void throwSizeException(Object[] array, int size) {
		throw new IllegalArgumentException("Number of array elements is " + array.length + ", must be at least " + size);
	}

	private static void throwSizeException(short[] array, int size) {
		throw new IllegalArgumentException("Number of array elements is " + array.length + ", must be at least " + size);
	}

	private static void throwSizeException(int[] array, int size) {
		throw new IllegalArgumentException("Number of array elements is " + array.length + ", must be at least " + size);
	}

	private static void throwSizeException(long[] array, int size) {
		throw new IllegalArgumentException("Number of array elements is " + array.length + ", must be at least " + size);
	}

	private static void throwSizeException(float[] array, int size) {
		throw new IllegalArgumentException("Number of array elements is " + array.length + ", must be at least " + size);
	}

	private static void throwSizeException(double[] array, int size) {
		throw new IllegalArgumentException("Number of array elements is " + array.length + ", must be at least " + size);
	}

	private static void throwSizeException(CharSequence text, int size) {
		throw new IllegalArgumentException("Number of characters is " + text.length() + ", must be at least " + size);
	}

	private static void throwBufferSizeGTException(Buffer buf, int size) {
		throw new IllegalArgumentException("Number of remaining buffer elements is " + buf.remaining() + ", must be at most " + size + ".");
	}

	private static void throwBufferSizeGTException(PointerBuffer buf, int size) {
		throw new IllegalArgumentException("Number of remaining buffer elements is " + buf.remaining() + ", must be at most " + size + ".");
	}

	private static void throwBufferSizeGTException(StructBuffer<?, ?> buf, int size) {
		throw new IllegalArgumentException("Number of remaining buffer elements is " + buf.remaining() + ", must be at most " + size + ".");
	}

}