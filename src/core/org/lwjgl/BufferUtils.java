/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl;

import java.nio.*;

import static org.lwjgl.system.MathUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * <p>This class makes it easy and safe to work with direct buffers. It is the recommended way to allocate memory to use with LWJGL.</p>
 * <h3>Direct buffers</h3>
 * <p>LWJGL requires that all NIO buffers passed to it are direct buffers. Direct buffers essentially wrap an address that points to off-heap memory, i.e. a
 * native pointer. This is the only way LWJGL can safely pass data from Java code to native code, and vice-versa, without a performance penalty. It does not
 * support on-heap Java arrays (or plain NIO buffers, which wrap them) because arrays may be moved around in memory by the JVM's garbage collector while native
 * code is accessing them. In addition, Java arrays have an unspecified layout, i.e. they are not necessarily contiguous in memory.</p>
 * <h3>Usage</h3>
 * <p>When a direct buffer is passed as an argument to an LWJGL method, no data is copied. Instead, the current buffer position is added to the buffer's memory
 * address and the resulting value is passed to native code. The native code interprets that value as a pointer and reads or copies from it as necessary. LWJGL
 * will often also use the current buffer limit (via {@link Buffer#remaining()}) to automatically pass length/maxlength arguments. This means that, just like
 * other APIs that use NIO buffers, the current {@link Buffer#position()} and {@link Buffer#limit()} at the time of the call is very important. Contrary to
 * other APIs, LWJGL never modifies the current position, it will be the same value before and after the call.</p>
 * <h3>Arrays of pointers</h3>
 * <p>In addition to the standard NIO buffer classes, LWJGL provides a {@link PointerBuffer} class for storing pointer data in an architecture independent way.
 * It is used in bindings for pointer-to-pointers arguments, usually to provide arrays of data (input parameter) or to store returned pointer values (output
 * parameter).</p>
 * <h3>Memory alignment</h3>
 * <p>This class also supports automatically aligned buffer allocations. The {@code org.lwjgl.util.BufferAlign} system property can be used to control the
 * alignment size. Note that the JVM guarantees a minimum alignment size of 8 bytes, which is the default. Supported values:
 * <ul>
 * <li><b>page</b> &ndash; OS page alignment (usually 4kb)</li>
 * <li><b>cache-line</b> &ndash; CPU cache-line alignment (usually 64 bytes)</li>
 * <li><b>default</b> &ndash; the default alignment (8 bytes)</li>
 * <li><em>&lt;custom&gt;</em> &ndash; user-specified alignment, must be a power-of-two integer greater than 8</li>
 * </ul>
 * The system property will be read only once, when this class is loaded. Hence, the automatic alignment size cannot change at runtime, but there are additional
 * methods that can be used when special alignment is required.</p>
 */
public final class BufferUtils {

	private interface BufferAllocator {

		ByteBuffer malloc(int capacity);
	}

	private static final BufferAllocator BUFFER_ALLOCATOR = getDefaultAllocator();

	private BufferUtils() {}

	private static BufferAllocator getDefaultAllocator() {
		String alignment = System.getProperty("org.lwjgl.util.BufferAlign", "default");

		if ( "page".equals(alignment) )
			return new BufferAllocator() {
				@Override
				public ByteBuffer malloc(int capacity) {
					return createAlignedByteBufferPage(capacity);
				}
			};

		if ( "cache-line".equals(alignment) )
			return new BufferAllocator() {
				@Override
				public ByteBuffer malloc(int capacity) {
					return createAlignedByteBufferCacheLine(capacity);
				}
			};

		if ( "default".equals(alignment) )
			return new BufferAllocator() {
				@Override
				public ByteBuffer malloc(int capacity) {
					return createUnalignedByteBuffer(capacity);
				}
			};

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

		throw new IllegalArgumentException(String.format(
			"Invalid org.lwjgl.util.BufferAlign value: \"%s\". It must be one of {page, cache-line, default} or a power-of-two integer > 8.",
			alignment
		));
	}

	/**
	 * Allocates a direct native-ordered bytebuffer with the specified capacity.
	 *
	 * @param capacity The capacity, in bytes
	 *
	 * @return a ByteBuffer
	 */
	public static ByteBuffer createByteBuffer(int capacity) {
		return BUFFER_ALLOCATOR.malloc(capacity).order(ByteOrder.nativeOrder());
	}

	/**
	 * Allocates a direct native-order shortbuffer with the specified number
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
	 * Allocates a direct native-order charbuffer with the specified number
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
	 * Allocates a direct native-order intbuffer with the specified number
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
	 * Allocates a direct native-order longbuffer with the specified number
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
	 * Allocates a direct native-order floatbuffer with the specified number
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
	 * Allocates a direct native-order doublebuffer with the specified number
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
	 * Allocates a PointerBuffer with the specified number
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
	 * Allocates a direct ByteBuffer in native order with the specified capacity.
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
	 * Allocates a direct ByteBuffer in native order with the specified capacity and memory alignment.
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
	 * Allocates a direct ByteBuffer in native order with the specified capacity. The returned ByteBuffer
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
	 * Allocates a direct ByteBuffer in native order with the specified capacity. The returned ByteBuffer
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

	/**
	 * Fills the specified buffer with zeros from the current position to the current limit.
	 *
	 * @param buffer the buffer to fill with zeros
	 */
	public static void zeroBuffer(ByteBuffer buffer) {
		memSet(memAddress(buffer), 0, buffer.remaining());
	}

	/**
	 * Fills the specified buffer with zeros from the current position to the current limit.
	 *
	 * @param buffer the buffer to fill with zeros
	 */
	public static void zeroBuffer(ShortBuffer buffer) {
		memSet(memAddress(buffer), 0, buffer.remaining() << 1);
	}

	/**
	 * Fills the specified buffer with zeros from the current position to the current limit.
	 *
	 * @param buffer the buffer to fill with zeros
	 */
	public static void zeroBuffer(CharBuffer buffer) {
		memSet(memAddress(buffer), 0, buffer.remaining() << 1);
	}

	/**
	 * Fills the specified buffer with zeros from the current position to the current limit.
	 *
	 * @param buffer the buffer to fill with zeros
	 */
	public static void zeroBuffer(IntBuffer buffer) {
		memSet(memAddress(buffer), 0, buffer.remaining() << 2);
	}

	/**
	 * Fills the specified buffer with zeros from the current position to the current limit.
	 *
	 * @param buffer the buffer to fill with zeros
	 */
	public static void zeroBuffer(FloatBuffer buffer) {
		memSet(memAddress(buffer), 0, buffer.remaining() << 2);
	}

	/**
	 * Fills the specified buffer with zeros from the current position to the current limit.
	 *
	 * @param buffer the buffer to fill with zeros
	 */
	public static void zeroBuffer(LongBuffer buffer) {
		memSet(memAddress(buffer), 0, buffer.remaining() << 3);
	}

	/**
	 * Fills the specified buffer with zeros from the current position to the current limit.
	 *
	 * @param buffer the buffer to fill with zeros
	 */
	public static void zeroBuffer(DoubleBuffer buffer) {
		memSet(memAddress(buffer), 0, buffer.remaining() << 3);
	}

}