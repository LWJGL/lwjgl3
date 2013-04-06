package org.lwjgl.system;

import org.lwjgl.BufferUtils;
import org.lwjgl.PointerBuffer;

import java.nio.ByteBuffer;

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

	public APIBuffer() {
		buffer = BufferUtils.createByteBuffer(DEFAULT_CAPACITY);
		address = memAddress(buffer);
	}

	public APIBuffer reset() {
		offset = 0;
		return this;
	}

	public long address() {
		return address;
	}

	public ByteBuffer buffer() {
		return buffer;
	}

	private void ensureCapacity(int bytes) {
		int requiredCapacity = offset + bytes;
		if ( requiredCapacity <= buffer.capacity() )
			return;

		ByteBuffer resized = BufferUtils.createByteBuffer(mathNextPoT(requiredCapacity));

		resized.put(buffer);
		resized.clear();

		buffer = resized;
		address = memAddress(resized);
	}

	private int param(int bytes) {
		// TODO: Consider padding the offset such that the parameter is memory aligned.

		ensureCapacity(bytes);

		int param = offset;
		offset = param + bytes;
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

	/** Ensures space for an additional buffer with the given size (in bytes) and returns the address offset. */
	public int bufferParam(int size) { return param(size); }

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

	/** Sets a boolean value at the specified offset. */
	public APIBuffer booleanValue(int offset, boolean value) {
		buffer.put(offset, value ? (byte)1 : (byte)0);
		return this;
	}

	/** Sets a byte value at the specified offset. */
	public APIBuffer byteValue(int offset, byte value) {
		buffer.put(offset, value);
		return this;
	}

	/** Sets a short value at the specified offset. */
	public APIBuffer shortValue(int offset, short value) {
		buffer.putShort(offset, value);
		return this;
	}

	/** Sets an int value at the specified offset. */
	public APIBuffer intValue(int offset, int value) {
		buffer.putInt(offset, value);
		return this;
	}

	/** Sets a long value at the specified offset. */
	public APIBuffer longValue(int offset, long value) {
		buffer.putLong(offset, value);
		return this;
	}

	/** Sets a float value at the specified offset. */
	public APIBuffer floatValue(int offset, float value) {
		buffer.putFloat(offset, value);
		return this;
	}

	/** Sets a double value at the specified offset. */
	public APIBuffer doubleValue(int offset, double value) {
		buffer.putDouble(offset, value);
		return this;
	}

	/** Sets a pointer value at the specified offset. */
	public APIBuffer pointerValue(int offset, long value) {
		PointerBuffer.put(buffer, offset, value);
		return this;
	}

	/** Sets a pointer value at the specified offset. */
	public APIBuffer pointerValue(int offset, PointerWrapper value) {
		pointerValue(offset, value.getPointer());
		return this;
	}

	/** Sets a pointer value at the given index of the pointer buffer that starts at the given offset. */
	public APIBuffer pointerValue(int offset, int index, long value) {
		PointerBuffer.put(buffer, offset + (index << POINTER_SHIFT), value);
		return this;
	}

}