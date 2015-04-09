/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system;

import org.lwjgl.BufferUtils;
import org.lwjgl.PointerBuffer;

import java.nio.ByteBuffer;
import java.util.Arrays;

import static org.lwjgl.Pointer.*;
import static org.lwjgl.system.MathUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Helper class for alternative API functions. Instead of the user
 * passing their own buffer, thread-local instances of this class
 * are used internally instead.
 */
public class APIBuffer {

	private static final int DEFAULT_CAPACITY = 1024;

	private ByteBuffer buffer;
	private long       address;

	private int offset;

	private int stackDepth;
	private int[] stack = new int[4];

	public APIBuffer() {
		buffer = BufferUtils.createAlignedByteBufferPage(DEFAULT_CAPACITY);
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

		ByteBuffer resized = BufferUtils.createAlignedByteBufferPage(mathRoundPoT(capacity));

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
		return pointerParam(value.getPointer());
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