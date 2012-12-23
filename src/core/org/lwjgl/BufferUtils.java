/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl;

import java.nio.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Some often-used Buffer code for creating native buffers of the appropriate size. */
public final class BufferUtils {

	/**
	 * Construct a direct native-ordered bytebuffer with the specified size.
	 *
	 * @param size The size, in bytes
	 *
	 * @return a ByteBuffer
	 */
	public static ByteBuffer createByteBuffer(int size) {
		return ByteBuffer.allocateDirect(size).order(ByteOrder.nativeOrder());
	}

	/**
	 * Construct a direct native-order shortbuffer with the specified number
	 * of elements.
	 *
	 * @param size The size, in shorts
	 *
	 * @return a ShortBuffer
	 */
	public static ShortBuffer createShortBuffer(int size) {
		return createByteBuffer(size << 1).asShortBuffer();
	}

	/**
	 * Construct a direct native-order charbuffer with the specified number
	 * of elements.
	 *
	 * @param size The size, in chars
	 *
	 * @return an CharBuffer
	 */
	public static CharBuffer createCharBuffer(int size) {
		return createByteBuffer(size << 1).asCharBuffer();
	}

	/**
	 * Construct a direct native-order intbuffer with the specified number
	 * of elements.
	 *
	 * @param size The size, in ints
	 *
	 * @return an IntBuffer
	 */
	public static IntBuffer createIntBuffer(int size) {
		return createByteBuffer(size << 2).asIntBuffer();
	}

	/**
	 * Construct a direct native-order longbuffer with the specified number
	 * of elements.
	 *
	 * @param size The size, in longs
	 *
	 * @return an LongBuffer
	 */
	public static LongBuffer createLongBuffer(int size) {
		return createByteBuffer(size << 3).asLongBuffer();
	}

	/**
	 * Construct a direct native-order floatbuffer with the specified number
	 * of elements.
	 *
	 * @param size The size, in floats
	 *
	 * @return a FloatBuffer
	 */
	public static FloatBuffer createFloatBuffer(int size) {
		return createByteBuffer(size << 2).asFloatBuffer();
	}

	/**
	 * Construct a direct native-order doublebuffer with the specified number
	 * of elements.
	 *
	 * @param size The size, in floats
	 *
	 * @return a FloatBuffer
	 */
	public static DoubleBuffer createDoubleBuffer(int size) {
		return createByteBuffer(size << 3).asDoubleBuffer();
	}

	/**
	 * Construct a PointerBuffer with the specified number
	 * of elements.
	 *
	 * @param size The size, in memory addresses
	 *
	 * @return a PointerBuffer
	 */
	public static PointerBuffer createPointerBuffer(int size) {
		return PointerBuffer.allocateDirect(size);
	}

	/** Fill buffer with zeros from position to remaining */
	public static void zeroBuffer(ByteBuffer b) {
		memSet(memAddress(b), 0, b.remaining());
	}

	/** Fill buffer with zeros from position to remaining */
	public static void zeroBuffer(ShortBuffer b) {
		memSet(memAddress(b), 0, b.remaining() << 1);
	}

	/** Fill buffer with zeros from position to remaining */
	public static void zeroBuffer(CharBuffer b) {
		memSet(memAddress(b), 0, b.remaining() << 1);
	}

	/** Fill buffer with zeros from position to remaining */
	public static void zeroBuffer(IntBuffer b) {
		memSet(memAddress(b), 0, b.remaining() << 2);
	}

	/** Fill buffer with zeros from position to remaining */
	public static void zeroBuffer(FloatBuffer b) {
		memSet(memAddress(b), 0, b.remaining() << 2);
	}

	/** Fill buffer with zeros from position to remaining */
	public static void zeroBuffer(LongBuffer b) {
		memSet(memAddress(b), 0, b.remaining() << 3);
	}

	/** Fill buffer with zeros from position to remaining */
	public static void zeroBuffer(DoubleBuffer b) {
		memSet(memAddress(b), 0, b.remaining() << 3);
	}

}