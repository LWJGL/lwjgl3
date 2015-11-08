/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import org.lwjgl.BufferUtils;
import org.lwjgl.PointerBuffer;

import java.nio.ByteBuffer;
import java.util.Arrays;

import static org.lwjgl.system.Pointer.*;
import static org.lwjgl.system.MathUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Helper class for alternative API functions. Instead of the user
 * passing their own buffer, thread-local instances of this class
 * are used internally instead.
 */
public class APIBuffer {

	private static final int DEFAULT_CAPACITY = 128;

	private ByteBuffer buffer;
	private long       address;

	private int offset;

	private int stackDepth;
	private int[] stack = new int[4];

	public APIBuffer() {
		buffer = BufferUtils.createAlignedByteBufferCacheLine(DEFAULT_CAPACITY);
		address = memAddress(buffer);
	}

	/** Resets the parameter offset to 0. */
	public APIBuffer reset() {
		offset = 0;
		return this;
	}

	/** Pushes the current parameter offset to a stack. */
	public APIBuffer push() {
		if ( stackDepth == stack.length )
			stack = Arrays.copyOf(stack, stack.length << 1);

		stack[stackDepth++] = offset;

		// Upward align the current offset to the pointer size.
		offset = (offset + (POINTER_SIZE - 1)) & -POINTER_SIZE;

		return this;
	}

	/** Restores the last pushed parameter offset. */
	public APIBuffer pop() {
		offset = stack[--stackDepth];
		return this;
	}

	/** Returns the current parameter offset. */
	public int getOffset() {
		return offset;
	}

	/** Sets the current parameter offset. */
	public void setOffset(int offset) {
		this.offset = offset;
	}

	/** Returns the memory address of the internal {@link ByteBuffer}. This address may change after a call to one of the {@code <type>Param()} methods. */
	public long address() {
		return address;
	}

	/** Returns the memory address of the specified {@code offset}. This address may change after a call to one of the {@code <type>Param()} methods. */
	public long address(int offset) {
		return address + offset;
	}

	/**
	 * Returns the memory address of the specified {@code offset} or {@link MemoryUtil#NULL NULL} if the specified {@code value} is null. This address may
	 * change after a call to one of the {@code <type>Param()} methods.
	 */
	public long addressSafe(Object value, int offset) {
		return value == null ? NULL : address(offset);
	}

	/** Returns the {@link ByteBuffer} that backs this {@link APIBuffer}. */
	public ByteBuffer buffer() {
		return buffer;
	}

	private void ensureCapacity(int capacity) {
		if ( capacity <= buffer.capacity() )
			return;

		ByteBuffer resized = BufferUtils.createAlignedByteBufferCacheLine(mathRoundPoT(capacity));

		resized.put(buffer);
		resized.clear();

		buffer = resized;
		address = memAddress(resized);
	}

	// ---------------------------------------------------------------------------------------------------------------------

	private int param(int bytes) {
		return param(bytes, bytes);
	}

	private int param(int bytes, int alignment) {
		// Upward align the current offset to the specified alignment
		int param = (offset + (alignment - 1)) & -alignment;
		ensureCapacity(offset = param + bytes);
		return param;
	}

	/** Ensures space for an additional boolean value and returns the address offset. */
	public int booleanParam() { return param(1); }

	/** Ensures space for an additional byte value and returns the address offset. */
	public int byteParam() { return param(1); }

	/** Ensures space for an additional short value and returns the address offset. */
	public int shortParam() { return param(2); }

	/** Ensures space for an additional int value and returns the address offset. */
	public int intParam() { return param(4); }

	/** Ensures space for an additional long value and returns the address offset. */
	public int longParam() { return param(8); }

	/** Ensures space for an additional float value and returns the address offset. */
	public int floatParam() { return param(4); }

	/** Ensures space for an additional double value and returns the address offset. */
	public int doubleParam() { return param(8); }

	/** Ensures space for an additional pointer value and returns the address offset. */
	public int pointerParam() { return param(POINTER_SIZE); }

	/** Ensures space for an additional buffer with the specified size (in bytes) and returns the address offset. */
	public int bufferParam(int size) { return param(size, POINTER_SIZE); }

	// ---------------------------------------------------------------------------------------------------------------------

	/** Ensures space for an additional boolean value, sets the specified value at the allocated offset and returns that offset. */
	public int booleanParam(boolean value) {
		int offset = booleanParam();
		buffer.put(offset, value ? (byte)1 : (byte)0);
		return offset;
	}

	/** Ensures space for an additional byte value, sets the specified value at the allocated offset and returns that offset. */
	public int byteParam(byte value) {
		int offset = byteParam();
		buffer.put(offset, value);
		return offset;
	}

	/** Ensures space for an additional short value, sets the specified value at the allocated offset and returns that offset. */
	public int shortParam(short value) {
		int offset = shortParam();
		buffer.putShort(offset, value);
		return offset;
	}

	/** Ensures space for an additional int value, sets the specified value at the allocated offset and returns that offset. */
	public int intParam(int value) {
		int offset = intParam();
		buffer.putInt(offset, value);
		return offset;
	}

	/** Ensures space for an additional long value, sets the specified value at the allocated offset and returns that offset. */
	public int longParam(long value) {
		int offset = longParam();
		buffer.putLong(offset, value);
		return offset;
	}

	/** Ensures space for an additional float value, sets the specified value at the allocated offset and returns that offset. */
	public int floatParam(float value) {
		int offset = floatParam();
		buffer.putFloat(offset, value);
		return offset;
	}

	/** Ensures space for an additional double value, sets the specified value at the allocated offset and returns that offset. */
	public int doubleParam(double value) {
		int offset = doubleParam();
		buffer.putDouble(offset, value);
		return offset;
	}

	/** Ensures space for an additional pointer value, sets the specified value at the allocated offset and returns that offset. */
	public int pointerParam(long value) {
		int offset = pointerParam();
		PointerBuffer.put(buffer, offset, value);
		return offset;
	}

	/** Ensures space for an additional pointer value, sets the specified value at the allocated offset and returns that offset. */
	public int pointerParam(PointerWrapper value) {
		return pointerParam(value.address());
	}

	// ----

	/** Ensures space for an additional pointer buffer, sets the specified memory addresses and returns the address offset. */
	public int pointerArrayParam(long... pointers) {
		int buffersAddress = bufferParam(pointers.length << POINTER_SHIFT);
		for ( int i = 0; i < pointers.length; i++ )
			pointerParam(buffersAddress, i, pointers[i]);

		return buffersAddress;
	}

	/** Ensures space for an additional pointer buffer, sets the memory addresses of the specified buffers and returns the address offset. */
	public int pointerArrayParam(ByteBuffer... buffers) {
		int buffersAddress = bufferParam(buffers.length << POINTER_SHIFT);
		for ( int i = 0; i < buffers.length; i++ )
			pointerParam(buffersAddress, i, memAddress(buffers[i]));

		return buffersAddress;
	}

	/**
	 * Ensures space for two additional pointer buffers, sets the memory addresses and remaining bytes of the specified buffers and returns the address
	 * offset.
	 */
	public int pointerArrayParamp(ByteBuffer... buffers) {
		int buffersAddress = pointerArrayParam(buffers);

		int buffersLengths = bufferParam(buffers.length << POINTER_SHIFT);
		for ( int i = 0; i < buffers.length; i++ )
			pointerParam(buffersLengths, i, buffers[i].remaining());

		return buffersAddress;
	}

	// ---------------------------------------------------------------------------------------------------------------------

	/**
	 * ASCII encodes the specified strings with a null-terminator and ensures space for a buffer filled with the memory addresses of the encoded strings.
	 *
	 * <p>The encoded buffers must be later freed with {@link #pointerArrayFree(int, int)}.</p>
	 *
	 * @return the offset to the memory address buffer
	 */
	public int pointerArrayParamASCII(CharSequence... strings) {
		int buffersAddress = bufferParam(strings.length << POINTER_SHIFT);
		for ( int i = 0; i < strings.length; i++ ) {
			ByteBuffer buffer = memEncodeASCII(strings[i], true, BufferAllocator.MALLOC);

			pointerParam(buffersAddress, i, memAddress(buffer));
		}

		return buffersAddress;
	}

	/**
	 * ASCII encodes the specified strings and ensures space for two additional buffers filled with the lengths and memory addresses of the encoded strings,
	 * respectively. The lengths are 4-bytes integers and the memory address buffer starts immediately after the lengths buffer.
	 *
	 * <p>The encoded buffers must be later freed with {@link #pointerArrayFree(int, int)}.</p>
	 *
	 * @return the offset to the lengths buffer
	 */
	public int pointerArrayParamASCIIi(CharSequence... strings) {
		int buffersAddress = bufferParam(strings.length << POINTER_SHIFT);
		int lengthsAddress = bufferParam(strings.length << 2);

		for ( int i = 0; i < strings.length; i++ ) {
			ByteBuffer buffer = memEncodeASCII(strings[i], false, BufferAllocator.MALLOC);

			pointerParam(buffersAddress, i, memAddress(buffer));
			intParam(lengthsAddress, i, buffer.remaining());
		}

		return buffersAddress;
	}

	/**
	 * ASCII encodes the specified strings and ensures space for two additional buffers filled with the lengths and memory addresses of the encoded strings,
	 * respectively. The lengths are pointer-sized integers and the memory address buffer starts immediately after the lengths buffer.
	 *
	 * <p>The encoded buffers must be later freed with {@link #pointerArrayFree(int, int)}.</p>
	 *
	 * @return the offset to the lengths buffer
	 */
	public int pointerArrayParamASCIIp(CharSequence... strings) {
		int buffersAddress = bufferParam(strings.length << POINTER_SHIFT);
		int lengthsAddress = bufferParam(strings.length << POINTER_SHIFT);

		for ( int i = 0; i < strings.length; i++ ) {
			ByteBuffer buffer = memEncodeASCII(strings[i], false, BufferAllocator.MALLOC);

			pointerParam(buffersAddress, i, memAddress(buffer));
			pointerParam(lengthsAddress, i, buffer.remaining());
		}

		return buffersAddress;
	}

	/**
	 * UTF8 encodes the specified strings with a null-terminator and ensures space for a buffer filled with the memory addresses of the encoded strings.
	 *
	 * <p>The encoded buffers must be later freed with {@link #pointerArrayFree(int, int)}.</p>
	 *
	 * @return the offset to the memory address buffer
	 */
	public int pointerArrayParamUTF8(CharSequence... strings) {
		int buffersAddress = bufferParam(strings.length << POINTER_SHIFT);
		for ( int i = 0; i < strings.length; i++ ) {
			ByteBuffer buffer = memEncodeUTF8(strings[i], true, BufferAllocator.MALLOC);

			pointerParam(buffersAddress, i, memAddress(buffer));
		}

		return buffersAddress;
	}

	/**
	 * UTF8 encodes the specified strings and ensures space for two additional buffers filled with the lengths and memory addresses of the encoded strings,
	 * respectively. The lengths are 4-bytes integers and the memory address buffer starts immediately after the lengths buffer.
	 *
	 * <p>The encoded buffers must be later freed with {@link #pointerArrayFree(int, int)}.</p>
	 *
	 * @return the offset to the lengths buffer
	 */
	public int pointerArrayParamUTF8i(CharSequence... strings) {
		int buffersAddress = bufferParam(strings.length << POINTER_SHIFT);
		int lengthsAddress = bufferParam(strings.length << 2);

		for ( int i = 0; i < strings.length; i++ ) {
			ByteBuffer buffer = memEncodeUTF8(strings[i], false, BufferAllocator.MALLOC);

			pointerParam(buffersAddress, i, memAddress(buffer));
			intParam(lengthsAddress, i, buffer.remaining());
		}

		return buffersAddress;
	}

	/**
	 * UTF8 encodes the specified strings and ensures space for two additional buffers filled with the lengths and memory addresses of the encoded strings,
	 * respectively. The lengths are pointer-sized integers and the memory address buffer starts immediately after the lengths buffer.
	 *
	 * <p>The encoded buffers must be later freed with {@link #pointerArrayFree(int, int)}.</p>
	 *
	 * @return the offset to the lengths buffer
	 */
	public int pointerArrayParamUTF8p(CharSequence... strings) {
		int buffersAddress = bufferParam(strings.length << POINTER_SHIFT);
		int lengthsAddress = bufferParam(strings.length << POINTER_SHIFT);

		for ( int i = 0; i < strings.length; i++ ) {
			ByteBuffer buffer = memEncodeUTF8(strings[i], false, BufferAllocator.MALLOC);

			pointerParam(buffersAddress, i, memAddress(buffer));
			pointerParam(lengthsAddress, i, buffer.remaining());
		}

		return buffersAddress;
	}

	/**
	 * UTF16 encodes the specified strings with a null-terminator and ensures space for a buffer filled with the memory addresses of the encoded strings.
	 *
	 * <p>The encoded buffers must be later freed with {@link #pointerArrayFree(int, int)}.</p>
	 *
	 * @return the offset to the memory address buffer
	 */
	public int pointerArrayParamUTF16(CharSequence... strings) {
		int buffersAddress = bufferParam(strings.length << POINTER_SHIFT);
		for ( int i = 0; i < strings.length; i++ ) {
			ByteBuffer buffer = memEncodeUTF16(strings[i], true, BufferAllocator.MALLOC);

			pointerParam(buffersAddress, i, memAddress(buffer));
		}

		return buffersAddress;
	}

	/**
	 * UTF16 encodes the specified strings and ensures space for two additional buffers filled with the lengths and memory addresses of the encoded strings,
	 * respectively. The lengths are 4-bytes integers and the memory address buffer starts immediately after the lengths buffer.
	 *
	 * <p>The encoded buffers must be later freed with {@link #pointerArrayFree(int, int)}.</p>
	 *
	 * @return the offset to the lengths buffer
	 */
	public int pointerArrayParamUTF16i(CharSequence... strings) {
		int buffersAddress = bufferParam(strings.length << POINTER_SHIFT);
		int lengthsAddress = bufferParam(strings.length << 2);

		for ( int i = 0; i < strings.length; i++ ) {
			ByteBuffer buffer = memEncodeUTF16(strings[i], false, BufferAllocator.MALLOC);

			pointerParam(buffersAddress, i, memAddress(buffer));
			intParam(lengthsAddress, i, buffer.remaining());
		}

		return buffersAddress;
	}

	/**
	 * UTF16 encodes the specified strings and ensures space for two additional buffers filled with the lengths and memory addresses of the encoded strings,
	 * respectively. The lengths are pointer-sized integers and the memory address buffer starts immediately after the lengths buffer.
	 *
	 * <p>The encoded buffers must be later freed with {@link #pointerArrayFree(int, int)}.</p>
	 *
	 * @return the offset to the lengths buffer
	 */
	public int pointerArrayParamUTF16p(CharSequence... strings) {
		int buffersAddress = bufferParam(strings.length << POINTER_SHIFT);
		int lengthsAddress = bufferParam(strings.length << POINTER_SHIFT);

		for ( int i = 0; i < strings.length; i++ ) {
			ByteBuffer buffer = memEncodeUTF16(strings[i], false, BufferAllocator.MALLOC);

			pointerParam(buffersAddress, i, memAddress(buffer));
			pointerParam(lengthsAddress, i, buffer.remaining());
		}

		return buffersAddress;
	}

	// ---------------------------------------------------------------------------------------------------------------------

	/** Frees {@code length} memory blocks stored in the APIBuffer, starting at the specified {@code offset}. */
	public void pointerArrayFree(int offset, int length) {
		for ( int i = 0; i < length; i++ )
			nmemFree(pointerValue(offset + (i << POINTER_SHIFT)));
	}

	// ---------------------------------------------------------------------------------------------------------------------

	/** Sets an int value at the specified index of the int buffer that starts at the specified offset. */
	public void intParam(int offset, int index, int value) {
		buffer.putInt(offset + (index << 2), value);
	}

	/** Sets a pointer value at the specified index of the pointer buffer that starts at the specified offset. */
	public void pointerParam(int offset, int index, long value) {
		PointerBuffer.put(buffer, offset + (index << POINTER_SHIFT), value);
	}

	// ---------------------------------------------------------------------------------------------------------------------

	/** Ensures space for the specified string encoded in ASCII, encodes the string at the allocated offset and returns that offset. */
	public int stringParamASCII(CharSequence value, boolean nullTerminated) {
		if ( value == null )
			return -1;

		int offset = bufferParam(value.length() + (nullTerminated ? 1 : 0));
		memEncodeASCII(value, nullTerminated, buffer, offset);
		return offset;
	}

	/** Ensures space for the specified string encoded in UTF-8, encodes the string at the allocated offset and returns that offset. */
	public int stringParamUTF8(CharSequence value, boolean nullTerminated) {
		if ( value == null )
			return -1;

		int encodedLen = memEncodedLengthUTF8(value);
		int offset = bufferParam(encodedLen + (nullTerminated ? 1 : 0));
		memEncodeUTF8(value, nullTerminated, buffer, offset);
		return offset;
	}

	/** Ensures space for the specified string encoded in UTF-16, encodes the string at the allocated offset and returns that offset. */
	public int stringParamUTF16(CharSequence value, boolean nullTerminated) {
		if ( value == null )
			return -1;

		int offset = bufferParam((value.length() + (nullTerminated ? 1 : 0)) << 1);
		memEncodeUTF16(value, nullTerminated, buffer, offset);
		return offset;
	}

	// ---------------------------------------------------------------------------------------------------------------------

	/** Returns the boolean value at the specified offset. */
	public boolean booleanValue(int offset) { return buffer.get(offset) != 0; }

	/** Returns the boolean value at the specified offset. */
	public byte byteValue(int offset) { return buffer.get(offset); }

	/** Returns the short value at the specified offset. */
	public short shortValue(int offset) { return buffer.getShort(offset); }

	/** Returns the int value at the specified offset. */
	public int intValue(int offset) { return buffer.getInt(offset); }

	/** Returns the long value at the specified offset. */
	public long longValue(int offset) { return buffer.getLong(offset); }

	/** Returns the float value at the specified offset. */
	public float floatValue(int offset) { return buffer.getFloat(offset); }

	/** Returns the double value at the specified offset. */
	public double doubleValue(int offset) { return buffer.getDouble(offset); }

	/** Returns the pointer value at the specified offset. */
	public long pointerValue(int offset) { return PointerBuffer.get(buffer, offset); }

	/** Returns the ASCII string value at the specified byte range. */
	public String stringValueASCII(int offset, int limit) {
		buffer.position(offset);
		buffer.limit(limit);
		try {
			return memDecodeASCII(buffer);
		} finally {
			buffer.clear();
		}
	}

	/** Returns the UTF8 string value at the specified byte range. */
	public String stringValueUTF8(int offset, int limit) {
		buffer.position(offset);
		buffer.limit(limit);
		try {
			return memDecodeUTF8(buffer);
		} finally {
			buffer.clear();
		}
	}

	/** Returns the UTF16 string value at the specified byte range. */
	public String stringValueUTF16(int offset, int limit) {
		buffer.position(offset);
		buffer.limit(limit);
		try {
			return memDecodeUTF16(buffer);
		} finally {
			buffer.clear();
		}
	}

}