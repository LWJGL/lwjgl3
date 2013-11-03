/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl;

import java.nio.*;

import static org.lwjgl.system.MathUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Some often-used Buffer code for creating native buffers of the appropriate size. */
public final class BufferUtils {

	private interface BufferAllocator {

		ByteBuffer malloc(int capacity);
	}

	private static final BufferAllocator BUFFER_ALLOCATOR = getDefaultAllocator();

	private BufferUtils() {}

	private static BufferAllocator getDefaultAllocator() {
		String alignment = System.getProperty("org.lwjgl.util.BufferAlign", "default");

		switch ( alignment ) {
			case "page":
				return new BufferAllocator() {
					@Override
					public ByteBuffer malloc(int capacity) {
						return createAlignedByteBufferPage(capacity);
					}
				};
			case "cache-line":
				return new BufferAllocator() {
					@Override
					public ByteBuffer malloc(int capacity) {
						return createAlignedByteBufferCacheLine(capacity);
					}
				};
			case "default":
				return new BufferAllocator() {
					@Override
					public ByteBuffer malloc(int capacity) {
						return createUnalignedByteBuffer(capacity);
					}
				};
			default:
				try {
					final int bytes = Integer.parseInt(alignment);
					if ( mathIsPoT(bytes) && 8 < bytes )
						return new BufferAllocator() {
							@Override
							public ByteBuffer malloc(int capacity) {
								return createAlignedByteBuffer(capacity, bytes);
							}
						};
				} catch (NumberFormatException e) {
					// ignore
				}
		}

		throw new IllegalArgumentException(String.format(
			"Invalid org.lwjgl.util.BufferAlign value: \"%s\". It must be one of {page, cache-line, default} or a power-of-two integer > 8.",
			alignment
		));
	}

	/**
	 * Construct a direct native-ordered bytebuffer with the specified capacity.
	 *
	 * @param capacity The capacity, in bytes
	 *
	 * @return a ByteBuffer
	 */
	public static ByteBuffer createByteBuffer(int capacity) {
		return BUFFER_ALLOCATOR.malloc(capacity).order(ByteOrder.nativeOrder());
	}

	/**
	 * Construct a direct native-order shortbuffer with the specified number
	 * of elements.
	 *
	 * @param capacity The capacity, in shorts
	 *
	 * @return a ShortBuffer
	 */
	public static ShortBuffer createShortBuffer(int capacity) {
		return createByteBuffer(capacity << 1).asShortBuffer();
	}

	/**
	 * Construct a direct native-order charbuffer with the specified number
	 * of elements.
	 *
	 * @param capacity The capacity, in chars
	 *
	 * @return an CharBuffer
	 */
	public static CharBuffer createCharBuffer(int capacity) {
		return createByteBuffer(capacity << 1).asCharBuffer();
	}

	/**
	 * Construct a direct native-order intbuffer with the specified number
	 * of elements.
	 *
	 * @param capacity The capacity, in ints
	 *
	 * @return an IntBuffer
	 */
	public static IntBuffer createIntBuffer(int capacity) {
		return createByteBuffer(capacity << 2).asIntBuffer();
	}

	/**
	 * Construct a direct native-order longbuffer with the specified number
	 * of elements.
	 *
	 * @param capacity The capacity, in longs
	 *
	 * @return an LongBuffer
	 */
	public static LongBuffer createLongBuffer(int capacity) {
		return createByteBuffer(capacity << 3).asLongBuffer();
	}

	/**
	 * Construct a direct native-order floatbuffer with the specified number
	 * of elements.
	 *
	 * @param capacity The capacity, in floats
	 *
	 * @return a FloatBuffer
	 */
	public static FloatBuffer createFloatBuffer(int capacity) {
		return createByteBuffer(capacity << 2).asFloatBuffer();
	}

	/**
	 * Construct a direct native-order doublebuffer with the specified number
	 * of elements.
	 *
	 * @param capacity The capacity, in floats
	 *
	 * @return a FloatBuffer
	 */
	public static DoubleBuffer createDoubleBuffer(int capacity) {
		return createByteBuffer(capacity << 3).asDoubleBuffer();
	}

	/**
	 * Construct a PointerBuffer with the specified number
	 * of elements.
	 *
	 * @param capacity The capacity, in memory addresses
	 *
	 * @return a PointerBuffer
	 */
	public static PointerBuffer createPointerBuffer(int capacity) {
		return PointerBuffer.allocateDirect(capacity);
	}

	// Unaligned mallocs

	/**
	 * Allocates a direct ByteBuffer in native order with the given capacity.
	 *
	 * @param capacity the ByteBuffer capacity
	 *
	 * @return the new ByteBuffer
	 */
	public static ByteBuffer createUnalignedByteBuffer(int capacity) {
		return ByteBuffer.allocateDirect(capacity).order(ByteOrder.nativeOrder());
	}

	// Aligned mallocs

	/**
	 * Allocates a direct ByteBuffer in native order with the given capacity and memory alignment.
	 *
	 * @param capacity  the ByteBuffer capacity
	 * @param alignment the desired memory alignment, in bytes. Must be a power-of-two.
	 *
	 * @return the aligned ByteBuffer
	 */
	public static ByteBuffer createAlignedByteBuffer(int capacity, int alignment) {
		if ( LWJGLUtil.DEBUG && !mathIsPoT(alignment) )
			throw new IllegalArgumentException("The alignment value must be a power-of-two integer.");

		ByteBuffer buffer = ByteBuffer.allocateDirect(capacity + alignment);

		// Align
		buffer.position(alignment - (int)(memAddress(buffer) & (alignment - 1)));
		// Prepare to slice
		buffer.limit(buffer.position() + capacity);

		return buffer.slice().order(ByteOrder.nativeOrder());
	}

	/**
	 * Allocates a direct ByteBuffer in native order with the given capacity. The returned ByteBuffer
	 * will be page-aligned.
	 *
	 * @param capacity the ByteBuffer capacity
	 *
	 * @return the page-aligned ByteBuffer
	 */
	public static ByteBuffer createAlignedByteBufferPage(int capacity) {
		return createAlignedByteBuffer(capacity, PAGE_SIZE);
	}

	/**
	 * Allocates a direct ByteBuffer in native order with the given capacity. The returned ByteBuffer
	 * will be cache-line-aligned.
	 *
	 * @param capacity the ByteBuffer capacity
	 *
	 * @return the cache-line-aligned ByteBuffer
	 */
	public static ByteBuffer createAlignedByteBufferCacheLine(int capacity) {
		return createAlignedByteBuffer(capacity, 64); // TODO: Discover cache line size at runtime
	}

	// memsets

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