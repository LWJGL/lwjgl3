/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import org.lwjgl.PointerBuffer;

import java.nio.*;

/**
 * <p>A class to check buffer boundaries in general. If there is unsufficient space
 * in the buffer when the call is made then a buffer overflow would otherwise
 * occur and cause unexpected behaviour, a crash, or worse, a security risk.
 * <p/>
 * Internal class, don't use.
 */
public class Checks {

	private Checks() {
	}

	/**
	 * Ensures that the specified function pointer is not-null (0L).
	 *
	 * @param pointer the pointer to check
	 *
	 * @throws IllegalStateException
	 */
	public static void checkFunctionAddress(long pointer) {
		if ( pointer == 0 )
			throw new IllegalStateException("Function is not supported");
	}

	/**
	 * Ensures that the specified pointer is not-null (0L).
	 *
	 * @param pointer the pointer to check
	 *
	 * @throws NullPointerException
	 */
	public static void checkPointer(long pointer) {
		if ( pointer == 0 )
			throw new NullPointerException();
	}

	/** Ensures that the specified ByteBuffer is null-terminated (last byte equal to 0). */
	public static ByteBuffer checkNT1(ByteBuffer buf) {
		if ( buf.get(buf.limit() - 1) != 0 )
			throw new IllegalArgumentException("Missing null termination");

		return buf;
	}

	/** Ensures that the specified ByteBuffer is null-terminated (last 2 bytes equal to 0). */
	public static ByteBuffer checkNT2(ByteBuffer buf) {
		if ( buf.getShort(buf.limit() - 2) != 0 )
			throw new IllegalArgumentException("Missing null termination");

		return buf;
	}

	/** Ensures that the specified ByteBuffer is null-terminated (last 4 bytes equal to 0). */
	public static ByteBuffer checkNT4(ByteBuffer buf) {
		if ( buf.getInt(buf.limit() - 4) != 0 )
			throw new IllegalArgumentException("Missing null termination");

		return buf;
	}

	/** Ensures that the specified ByteBuffer is null-terminated (last 8 bytes equal to 0). */
	public static ByteBuffer checkNT8(ByteBuffer buf) {
		if ( buf.getLong(buf.limit() - 8) != 0 )
			throw new IllegalArgumentException("Missing null termination");

		return buf;
	}

	/** Ensures that the specified IntBuffer is null-terminated. */
	public static IntBuffer checkNT(IntBuffer buf) {
		if ( buf.get(buf.limit() - 1) != 0 )
			throw new IllegalArgumentException("Missing null termination");

		return buf;
	}

	/** Ensures that the specified FloatBuffer is null-terminated. */
	public static FloatBuffer checkNT(FloatBuffer buf) {
		if ( buf.get(buf.limit() - 1) != 0.0f )
			throw new IllegalArgumentException("Missing null termination");

		return buf;
	}

	public static void checkNullTerminatedArray(ByteBuffer buf, int count) {
		int nullFound = 0;
		for ( int i = buf.position(); i < buf.limit(); i++ ) {
			if ( buf.get(i) == 0 )
				nullFound++;
		}

		if ( nullFound < count )
			throw new IllegalArgumentException("Missing null termination");
	}

	/** Helper method to ensure an IntBuffer is null-terminated */
	public static void checkNullTerminated(IntBuffer buf) {
		if ( buf.get(buf.limit() - 1) != 0 ) {
			throw new IllegalArgumentException("Missing null termination");
		}
	}

	/** Helper method to ensure a LongBuffer is null-terminated */
	public static void checkNullTerminated(LongBuffer buf) {
		if ( buf.get(buf.limit() - 1) != 0 ) {
			throw new IllegalArgumentException("Missing null termination");
		}
	}

	/** Helper method to ensure a PointerBuffer is null-terminated */
	public static void checkNullTerminated(PointerBuffer buf) {
		if ( buf.get(buf.limit() - 1) != 0 ) {
			throw new IllegalArgumentException("Missing null termination");
		}
	}

	public static void checkNotNull(Object o) {
		if ( o == null )
			throw new IllegalArgumentException("Null argument");
	}

	public static void checkArray(Object[] array) {
		if ( array == null || array.length == 0 )
			throw new IllegalArgumentException("Invalid array");
	}

	/** This is a separate call to help inline checkBuffer. */
	private static void throwBufferSizeException(Buffer buf, int size) {
		throw new IllegalArgumentException("Number of remaining buffer elements is " + buf.remaining() + ", must be at least " + size + ". Because at most " + size + " elements can be returned, a buffer with at least " + size + " elements is required, regardless of actual returned element count");
	}

	private static void throwBufferSizeException(PointerBuffer buf, int size) {
		throw new IllegalArgumentException("Number of remaining pointer buffer elements is " + buf.remaining() + ", must be at least " + size);
	}

	private static void throwArraySizeException(Object[] array, int size) {
		throw new IllegalArgumentException("Number of array elements is " + array.length + ", must be at least " + size);
	}

	private static void throwArraySizeException(long[] array, int size) {
		throw new IllegalArgumentException("Number of array elements is " + array.length + ", must be at least " + size);
	}

	/**
	 * Helper method to ensure a buffer has enough capacity.
	 *
	 * @param buf  The buffer to check
	 * @param size The minimum buffer capacity
	 *
	 * @throws IllegalArgumentException
	 */
	public static void checkBuffer(Buffer buf, int size) {
		if ( buf.remaining() < size ) {
			throwBufferSizeException(buf, size);
		}
	}

	public static void checkBuffer(PointerBuffer buf, int size) {
		if ( buf.remaining() < size ) {
			throwBufferSizeException(buf, size);
		}
	}

	public static void checkArray(Object[] array, int size) {
		if ( array.length < size )
			throwArraySizeException(array, size);
	}

	public static void checkArray(long[] array, int size) {
		if ( array.length < size )
			throwArraySizeException(array, size);
	}

	/** This is a separate call to help inline checkBufferGT. */
	private static void throwBufferSizeGTException(Buffer buf, int size) {
		throw new IllegalArgumentException("Number of remaining buffer elements is " + buf.remaining() + ", must be at most " + size + ".");
	}

	public static void checkBufferGT(Buffer buf, int size) {
		if ( size < buf.remaining() )
			throwBufferSizeGTException(buf, size);
	}

}