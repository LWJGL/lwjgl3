package org.lwjgl.system;

import org.lwjgl.BufferUtils;
import org.lwjgl.PointerBuffer;

import java.nio.ByteBuffer;

import static org.lwjgl.system.MathUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Helper class for alternative API functions. Instead of the user
 * passing their own buffer, thread-local instances of this class
 * are used internally instead.
 */
public class APIBuffer {

	private static final int DEFAULT_CAPACITY = 16;

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

	private void ensureCapacity(int bytes) {
		final int requiredCapacity = offset + bytes;
		if ( requiredCapacity <= buffer.capacity() )
			return;

		final ByteBuffer resized = BufferUtils.createByteBuffer(mathNextPoT(requiredCapacity));

		resized.put(buffer);
		resized.clear();

		buffer = resized;
		address = memAddress(resized);
	}

	private int param(final int bytes) {
		ensureCapacity(bytes);

		final int param = offset;
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
	public int pointerParam() { return param(PointerBuffer.getPointerSize()); }

	/** Ensures space for an additional buffer with the given size and returns the address offset. */
	public int bufferParam(int size) { return param(size); }

	/** Returns the boolean value at the specified offset. */
	public boolean booleanValue(final int offset) { return buffer.get(offset) != 0; }

	/** Returns the boolean value at the specified offset. */
	public byte byteValue(final int offset) { return buffer.get(offset); }

	/** Returns the short value at the specified offset. */
	public short shortValue(final int offset) { return buffer.getShort(offset); }

	/** Returns the int value at the specified offset. */
	public int intValue(final int offset) { return buffer.getInt(offset); }

	/** Returns the long value at the specified offset. */
	public long longValue(final int offset) { return buffer.getLong(offset); }

	/** Returns the float value at the specified offset. */
	public float floatValue(final int offset) { return buffer.getFloat(offset); }

	/** Returns the double value at the specified offset. */
	public double doubleValue(final int offset) { return buffer.getDouble(offset); }

	/** Returns the pointer value at the specified offset. */
	public long pointerValue(final int offset) { return PointerBuffer.get(buffer, offset); }

	/** Sets a boolean value at the specified offset. */
	public void booleanValue(final int offset, final boolean value) { buffer.put(offset, value ? (byte)1 : (byte)0); }

	/** Sets a byte value at the specified offset. */
	public void byteValue(final int offset, final byte value) { buffer.put(offset, value); }

	/** Sets a short value at the specified offset. */
	public void shortValue(final int offset, final short value) { buffer.putShort(offset, value); }

	/** Sets an int value at the specified offset. */
	public void intValue(final int offset, final int value) { buffer.putInt(offset, value); }

	/** Sets a long value at the specified offset. */
	public void longValue(final int offset, final long value) { buffer.putLong(offset, value); }

	/** Sets a float value at the specified offset. */
	public void floatValue(final int offset, final float value) { buffer.putFloat(offset, value); }

	/** Sets a double value at the specified offset. */
	public void doubleValue(final int offset, final double value) { buffer.putDouble(offset, value); }

	/** Sets a pointer value at the specified offset. */
	public void pointerValue(final int offset, final long value) { PointerBuffer.put(buffer, offset, value); }

}