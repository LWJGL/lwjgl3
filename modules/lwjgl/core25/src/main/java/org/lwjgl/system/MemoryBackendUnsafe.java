/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import jdk.internal.misc.*;
import org.jspecify.annotations.*;

import java.lang.foreign.*;
import java.lang.reflect.*;
import java.nio.*;
import java.util.*;
import java.util.function.*;

import static java.lang.Character.*;
import static java.nio.charset.StandardCharsets.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;
import static org.lwjgl.system.jni.JNINativeInterface.*;

@NullMarked
class MemoryBackendUnsafe implements MemoryBackend {

    protected static final jdk.internal.misc.Unsafe UNSAFE;

    private static final ByteOrder NATIVE_ORDER = ByteOrder.nativeOrder();

    private static final Class<? extends ByteBuffer>   BUFFER_BYTE;
    private static final Class<? extends CharBuffer>   BUFFER_CHAR;
    private static final Class<? extends ShortBuffer>  BUFFER_SHORT;
    private static final Class<? extends IntBuffer>    BUFFER_INT;
    private static final Class<? extends LongBuffer>   BUFFER_LONG;
    private static final Class<? extends FloatBuffer>  BUFFER_FLOAT;
    private static final Class<? extends DoubleBuffer> BUFFER_DOUBLE;

    private static final long MARK;
    private static final long POSITION;
    private static final long LIMIT;
    private static final long CAPACITY;

    private static final long ADDRESS;

    private static final long SEGMENT;

    private static final long PARENT_BYTE;
    private static final long PARENT_CHAR;
    private static final long PARENT_SHORT;
    private static final long PARENT_INT;
    private static final long PARENT_LONG;
    private static final long PARENT_FLOAT;
    private static final long PARENT_DOUBLE;

    private static final long STRING_VALUE;
    private static final long STRING_CODER;

    private static final boolean COMPACT_STRINGS;

    static {
        UNSAFE = jdk.internal.misc.Unsafe.getUnsafe();

        var bb = ByteBuffer.allocateDirect(0).order(NATIVE_ORDER);

        BUFFER_BYTE = bb.getClass();
        BUFFER_SHORT = bb.asShortBuffer().getClass();
        BUFFER_CHAR = bb.asCharBuffer().getClass();
        BUFFER_INT = bb.asIntBuffer().getClass();
        BUFFER_LONG = bb.asLongBuffer().getClass();
        BUFFER_FLOAT = bb.asFloatBuffer().getClass();
        BUFFER_DOUBLE = bb.asDoubleBuffer().getClass();

        try {
            MARK = getMarkOffset();
            POSITION = getPositionOffset();
            LIMIT = getLimitOffset();
            CAPACITY = getCapacityOffset();

            ADDRESS = getAddressOffset();

            var segment = MemorySegment.ofBuffer(bb);
            SEGMENT = getFieldOffsetObject(segment.asByteBuffer(), segment);

            PARENT_BYTE = getFieldOffsetObject(bb.duplicate().order(bb.order()), bb);
            PARENT_CHAR = getFieldOffsetObject(bb.asCharBuffer(), bb);
            PARENT_SHORT = getFieldOffsetObject(bb.asShortBuffer(), bb);
            PARENT_INT = getFieldOffsetObject(bb.asIntBuffer(), bb);
            PARENT_LONG = getFieldOffsetObject(bb.asLongBuffer(), bb);
            PARENT_FLOAT = getFieldOffsetObject(bb.asFloatBuffer(), bb);
            PARENT_DOUBLE = getFieldOffsetObject(bb.asDoubleBuffer(), bb);

            STRING_VALUE = UNSAFE.objectFieldOffset(String.class.getDeclaredField("value"));
            STRING_CODER = UNSAFE.objectFieldOffset(String.class.getDeclaredField("coder"));

            COMPACT_STRINGS = UNSAFE.getByte("latin1", STRING_CODER) == 0;
        } catch (Throwable t) {
            throw new UnsupportedOperationException(t);
        }

        apiLog("MemoryUtil backend: jdk.internal.misc.Unsafe");
    }

    @Override public final boolean getBoolean(long ptr)                    { return UNSAFE.getBoolean(null, ptr); }

    @Override public final byte getByte(long ptr)                          { return UNSAFE.getByte(null, ptr); }

    @Override public final char getChar(long ptr)                          { return UNSAFE.getChar(null, ptr); }
    @Override public final char getCharUnaligned(long ptr)                 { return UNSAFE.getCharUnaligned(null, ptr); }

    @Override public final short getShort(long ptr)                        { return UNSAFE.getShort(null, ptr); }
    @Override public final short getShortUnaligned(long ptr)               { return UNSAFE.getShortUnaligned(null, ptr); }

    @Override public final int getInt(long ptr)                            { return UNSAFE.getInt(null, ptr); }
    @Override public final int getIntUnaligned(long ptr)                   { return UNSAFE.getIntUnaligned(null, ptr); }

    @Override public final long getLong(long ptr)                          { return UNSAFE.getLong(null, ptr); }
    @Override public final long getLongUnaligned(long ptr)                 { return UNSAFE.getLongUnaligned(null, ptr); }

    @Override public final long getLong(byte[] o, long offset)             { return UNSAFE.getLong(o, Unsafe.ARRAY_BYTE_BASE_OFFSET + offset); }

    @Override public final float getFloat(long ptr)                        { return UNSAFE.getFloat(null, ptr); }
    @Override public final float getFloatUnaligned(long ptr)               { return Float.intBitsToFloat(UNSAFE.getIntUnaligned(null, ptr)); }

    @Override public final double getDouble(long ptr)                      { return UNSAFE.getDouble(null, ptr); }
    @Override public final double getDoubleUnaligned(long ptr)             { return Double.longBitsToDouble(UNSAFE.getLongUnaligned(null, ptr)); }

    @Override public long getCLong(long ptr)                               { return UNSAFE.getLong(null, ptr); }
    @Override public long getCLongUnaligned(long ptr)                      { return UNSAFE.getLongUnaligned(null, ptr); }

    @Override public long getAddress(long ptr)                             { return UNSAFE.getLong(null, ptr); }
    @Override public long getAddressUnaligned(long ptr)                    { return UNSAFE.getLongUnaligned(null, ptr); }

    @Override public final void putBoolean(long ptr, boolean value)        { UNSAFE.putBoolean(null, ptr, value); }

    @Override public final void putByte(long ptr, byte value)              { UNSAFE.putByte(null, ptr, value); }

    @Override public final void putChar(long ptr, char value)              { UNSAFE.putChar(null, ptr, value); }
    @Override public final void putCharUnaligned(long ptr, char value)     { UNSAFE.putCharUnaligned(null, ptr, value); }

    @Override public final void putShort(long ptr, short value)            { UNSAFE.putShort(null, ptr, value); }
    @Override public final void putShortUnaligned(long ptr, short value)   { UNSAFE.putShortUnaligned(null, ptr, value); }

    @Override public final void putInt(long ptr, int value)                { UNSAFE.putInt(null, ptr, value); }
    @Override public final void putIntUnaligned(long ptr, int value)       { UNSAFE.putIntUnaligned(null, ptr, value); }

    @Override public final void putLong(long ptr, long value)              { UNSAFE.putLong(null, ptr, value); }
    @Override public final void putLongUnaligned(long ptr, long value)     { UNSAFE.putLongUnaligned(null, ptr, value); }

    @Override public final void putFloat(long ptr, float value)            { UNSAFE.putFloat(null, ptr, value); }
    @Override public final void putFloatUnaligned(long ptr, float value)   { UNSAFE.putIntUnaligned(null, ptr, Float.floatToRawIntBits(value)); }

    @Override public final void putDouble(long ptr, double value)          { UNSAFE.putDouble(null, ptr, value); }
    @Override public final void putDoubleUnaligned(long ptr, double value) { UNSAFE.putLongUnaligned(null, ptr, Double.doubleToRawLongBits(value)); }

    @Override public void putCLong(long ptr, long value)                   { UNSAFE.putLong(null, ptr, value); }
    @Override public void putCLongUnaligned(long ptr, long value)          { UNSAFE.putLongUnaligned(null, ptr, value); }

    @Override public void putAddress(long ptr, long value)                 { UNSAFE.putLong(null, ptr, value); }
    @Override public void putAddressUnaligned(long ptr, long value)        { UNSAFE.putLongUnaligned(null, ptr, value); }

    @Override public final long getAddress0(Buffer buffer)                 { return UNSAFE.getLong(buffer, ADDRESS); }
    @Override public final long getAddress0(ByteBuffer buffer)             { return UNSAFE.getLong(buffer, ADDRESS); }
    @Override public final long getAddress0(CharBuffer buffer)             { return UNSAFE.getLong(buffer, ADDRESS); }
    @Override public final long getAddress0(ShortBuffer buffer)            { return UNSAFE.getLong(buffer, ADDRESS); }
    @Override public final long getAddress0(IntBuffer buffer)              { return UNSAFE.getLong(buffer, ADDRESS); }
    @Override public final long getAddress0(LongBuffer buffer)             { return UNSAFE.getLong(buffer, ADDRESS); }
    @Override public final long getAddress0(FloatBuffer buffer)            { return UNSAFE.getLong(buffer, ADDRESS); }
    @Override public final long getAddress0(DoubleBuffer buffer)           { return UNSAFE.getLong(buffer, ADDRESS); }

    private static long address(int position, int elementShift, long address) {
        return address + ((position & 0xFFFF_FFFFL) << elementShift);
    }

    @Override public final long getAddress(Buffer buffer) {
        int elementShift;
        if (buffer instanceof ByteBuffer) {
            elementShift = 0;
        } else if (buffer instanceof ShortBuffer || buffer instanceof CharBuffer) {
            elementShift = 1;
        } else if (buffer instanceof IntBuffer || buffer instanceof FloatBuffer) {
            elementShift = 2;
        } else {
            elementShift = 3;
        }
        return address(buffer.position(), elementShift, getAddress0(buffer));
    }
    @Override public final long getAddress(Buffer buffer, int position) {
        int elementShift;
        if (buffer instanceof ByteBuffer) {
            elementShift = 0;
        } else if (buffer instanceof ShortBuffer || buffer instanceof CharBuffer) {
            elementShift = 1;
        } else if (buffer instanceof IntBuffer || buffer instanceof FloatBuffer) {
            elementShift = 2;
        } else {
            elementShift = 3;
        }
        return address(position, elementShift, getAddress0(buffer));
    }

    @Override public final long getAddress(ByteBuffer buffer) { return buffer.position() + getAddress0(buffer); }
    @Override public final long getAddress(ByteBuffer buffer, int position) {
        Objects.requireNonNull(buffer);
        return getAddress0(buffer) + Integer.toUnsignedLong(position);
    }

    @Override public final long getAddress(CharBuffer buffer) { return address(buffer.position(), 1, getAddress0(buffer)); }
    @Override public final long getAddress(CharBuffer buffer, int position) {
        Objects.requireNonNull(buffer);
        return address(position, 1, getAddress0(buffer));
    }

    @Override public final long getAddress(ShortBuffer buffer) { return address(buffer.position(), 1, getAddress0(buffer)); }
    @Override public final long getAddress(ShortBuffer buffer, int position) {
        Objects.requireNonNull(buffer);
        return address(position, 1, getAddress0(buffer));
    }

    @Override public final long getAddress(IntBuffer buffer) { return address(buffer.position(), 2, getAddress0(buffer)); }
    @Override public final long getAddress(IntBuffer buffer, int position) {
        Objects.requireNonNull(buffer);
        return address(position, 2, getAddress0(buffer));
    }

    @Override public final long getAddress(LongBuffer buffer) { return address(buffer.position(), 3, getAddress0(buffer)); }
    @Override public final long getAddress(LongBuffer buffer, int position) {
        Objects.requireNonNull(buffer);
        return address(position, 3, getAddress0(buffer));
    }

    @Override public final long getAddress(FloatBuffer buffer) { return address(buffer.position(), 2, getAddress0(buffer)); }
    @Override public final long getAddress(FloatBuffer buffer, int position) {
        Objects.requireNonNull(buffer);
        return address(position, 2, getAddress0(buffer));
    }

    @Override public final long getAddress(DoubleBuffer buffer) { return address(buffer.position(), 3, getAddress0(buffer)); }
    @Override public final long getAddress(DoubleBuffer buffer, int position) {
        Objects.requireNonNull(buffer);
        return address(position, 3, getAddress0(buffer));
    }

    @Override public final ByteBuffer wrapBufferByte(long address, int capacity) {
        ByteBuffer buffer;
        try {
            buffer = (ByteBuffer)UNSAFE.allocateInstance(BUFFER_BYTE);
        } catch (InstantiationException e) {
            throw new UnsupportedOperationException(e);
        }

        UNSAFE.putLong(buffer, ADDRESS, address);
        UNSAFE.putInt(buffer, MARK, -1);
        UNSAFE.putInt(buffer, LIMIT, capacity);
        UNSAFE.putInt(buffer, CAPACITY, capacity);

        return buffer.order(NATIVE_ORDER);
    }
    @Override public final CharBuffer wrapBufferChar(long address, int capacity) {
        CharBuffer buffer;
        try {
            buffer = (CharBuffer)UNSAFE.allocateInstance(BUFFER_CHAR);
        } catch (InstantiationException e) {
            throw new UnsupportedOperationException(e);
        }

        UNSAFE.putLong(buffer, ADDRESS, address);
        UNSAFE.putInt(buffer, MARK, -1);
        UNSAFE.putInt(buffer, LIMIT, capacity);
        UNSAFE.putInt(buffer, CAPACITY, capacity);

        return buffer;
    }
    @Override public final ShortBuffer wrapBufferShort(long address, int capacity) {
        ShortBuffer buffer;
        try {
            buffer = (ShortBuffer)UNSAFE.allocateInstance(BUFFER_SHORT);
        } catch (InstantiationException e) {
            throw new UnsupportedOperationException(e);
        }

        UNSAFE.putLong(buffer, ADDRESS, address);
        UNSAFE.putInt(buffer, MARK, -1);
        UNSAFE.putInt(buffer, LIMIT, capacity);
        UNSAFE.putInt(buffer, CAPACITY, capacity);

        return buffer;
    }
    @Override public final IntBuffer wrapBufferInt(long address, int capacity) {
        IntBuffer buffer;
        try {
            buffer = (IntBuffer)UNSAFE.allocateInstance(BUFFER_INT);
        } catch (InstantiationException e) {
            throw new UnsupportedOperationException(e);
        }

        UNSAFE.putLong(buffer, ADDRESS, address);
        UNSAFE.putInt(buffer, MARK, -1);
        UNSAFE.putInt(buffer, LIMIT, capacity);
        UNSAFE.putInt(buffer, CAPACITY, capacity);

        return buffer;
    }
    @Override public final LongBuffer wrapBufferLong(long address, int capacity) {
        LongBuffer buffer;
        try {
            buffer = (LongBuffer)UNSAFE.allocateInstance(BUFFER_LONG);
        } catch (InstantiationException e) {
            throw new UnsupportedOperationException(e);
        }

        UNSAFE.putLong(buffer, ADDRESS, address);
        UNSAFE.putInt(buffer, MARK, -1);
        UNSAFE.putInt(buffer, LIMIT, capacity);
        UNSAFE.putInt(buffer, CAPACITY, capacity);

        return buffer;
    }
    @Override public final FloatBuffer wrapBufferFloat(long address, int capacity) {
        FloatBuffer buffer;
        try {
            buffer = (FloatBuffer)UNSAFE.allocateInstance(BUFFER_FLOAT);
        } catch (InstantiationException e) {
            throw new UnsupportedOperationException(e);
        }

        UNSAFE.putLong(buffer, ADDRESS, address);
        UNSAFE.putInt(buffer, MARK, -1);
        UNSAFE.putInt(buffer, LIMIT, capacity);
        UNSAFE.putInt(buffer, CAPACITY, capacity);

        return buffer;
    }
    @Override public final DoubleBuffer wrapBufferDouble(long address, int capacity) {
        DoubleBuffer buffer;
        try {
            buffer = (DoubleBuffer)UNSAFE.allocateInstance(BUFFER_DOUBLE);
        } catch (InstantiationException e) {
            throw new UnsupportedOperationException(e);
        }

        UNSAFE.putLong(buffer, ADDRESS, address);
        UNSAFE.putInt(buffer, MARK, -1);
        UNSAFE.putInt(buffer, LIMIT, capacity);
        UNSAFE.putInt(buffer, CAPACITY, capacity);

        return buffer;
    }

    private static void checkSegment(Buffer buffer) {
        if (UNSAFE.getReference(buffer, SEGMENT) != null) {
            throw new UnsupportedOperationException();
        }
    }

    @Override public final ByteBuffer duplicate(ByteBuffer buffer) {
        if (DEBUG) {
            checkSegment(buffer);
        }

        ByteBuffer target;
        try {
            target = (ByteBuffer)UNSAFE.allocateInstance(BUFFER_BYTE);
        } catch (InstantiationException e) {
            throw new UnsupportedOperationException(e);
        }

        UNSAFE.putLong(target, ADDRESS, UNSAFE.getLong(buffer, ADDRESS));
        UNSAFE.putInt(target, MARK, UNSAFE.getInt(buffer, MARK));
        UNSAFE.putInt(target, POSITION, UNSAFE.getInt(buffer, POSITION));
        UNSAFE.putInt(target, LIMIT, UNSAFE.getInt(buffer, LIMIT));
        UNSAFE.putInt(target, CAPACITY, UNSAFE.getInt(buffer, CAPACITY));

        var attachment = UNSAFE.getReference(buffer, PARENT_BYTE);
        UNSAFE.putReference(target, PARENT_BYTE, attachment == null ? buffer : attachment);

        return target.order(buffer.order());
    }
    @Override public final CharBuffer duplicate(CharBuffer buffer) {
        if (DEBUG) {
            checkSegment(buffer);
        }
        return duplicate(BUFFER_CHAR, buffer, PARENT_CHAR);
    }
    @Override public final ShortBuffer duplicate(ShortBuffer buffer) {
        if (DEBUG) {
            checkSegment(buffer);
        }
        return duplicate(BUFFER_SHORT, buffer, PARENT_SHORT);
    }
    @Override public final IntBuffer duplicate(IntBuffer buffer) {
        if (DEBUG) {
            checkSegment(buffer);
        }
        return duplicate(BUFFER_INT, buffer, PARENT_INT);
    }
    @Override public final LongBuffer duplicate(LongBuffer buffer) {
        if (DEBUG) {
            checkSegment(buffer);
        }
        return duplicate(BUFFER_LONG, buffer, PARENT_LONG);
    }
    @Override public final FloatBuffer duplicate(FloatBuffer buffer) {
        if (DEBUG) {
            checkSegment(buffer);
        }
        return duplicate(BUFFER_FLOAT, buffer, PARENT_FLOAT);
    }
    @Override public final DoubleBuffer duplicate(DoubleBuffer buffer) {
        if (DEBUG) {
            checkSegment(buffer);
        }
        return duplicate(BUFFER_DOUBLE, buffer, PARENT_DOUBLE);
    }

    @Override public final ByteBuffer slice(ByteBuffer buffer) {
        if (DEBUG) {
            checkSegment(buffer);
        }
        return slice(buffer, getAddress0(buffer) + buffer.position(), buffer.remaining());
    }
    @Override public final ByteBuffer slice(ByteBuffer buffer, int offset, int length) {
        if (DEBUG) {
            checkSegment(buffer);
        }

        var position = buffer.position() + offset;
        if ((offset | position) < 0 || buffer.limit() < position) {
            throw new IllegalArgumentException();
        }
        if (length < 0 || buffer.capacity() - position < length) {
            throw new IllegalArgumentException();
        }
        return slice(buffer, getAddress0(buffer) + position, length);
    }

    @Override public final CharBuffer slice(CharBuffer buffer) {
        if (DEBUG) {
            checkSegment(buffer);
        }
        return slice(BUFFER_CHAR, buffer, address(buffer.position(), 1, getAddress0(buffer)), buffer.remaining(), PARENT_CHAR);
    }
    @Override public final CharBuffer slice(CharBuffer buffer, int offset, int length) {
        if (DEBUG) {
            checkSegment(buffer);
        }

        var position = buffer.position() + offset;
        if ((offset | position) < 0 || buffer.limit() < position) {
            throw new IllegalArgumentException();
        }
        if (length < 0 || buffer.capacity() - position < length) {
            throw new IllegalArgumentException();
        }
        return slice(BUFFER_CHAR, buffer, address(position, 1, getAddress0(buffer)), length, PARENT_CHAR);
    }

    @Override public final ShortBuffer slice(ShortBuffer buffer) {
        if (DEBUG) {
            checkSegment(buffer);
        }
        return slice(BUFFER_SHORT, buffer, address(buffer.position(), 1, getAddress0(buffer)), buffer.remaining(), PARENT_SHORT);
    }
    @Override public final ShortBuffer slice(ShortBuffer buffer, int offset, int length) {
        if (DEBUG) {
            checkSegment(buffer);
        }

        var position = buffer.position() + offset;
        if ((offset | position) < 0 || buffer.limit() < position) {
            throw new IllegalArgumentException();
        }
        if (length < 0 || buffer.capacity() - position < length) {
            throw new IllegalArgumentException();
        }
        return slice(BUFFER_SHORT, buffer, address(position, 1, getAddress0(buffer)), length, PARENT_SHORT);
    }

    @Override public final IntBuffer slice(IntBuffer buffer) {
        if (DEBUG) {
            checkSegment(buffer);
        }
        return slice(BUFFER_INT, buffer, address(buffer.position(), 2, getAddress0(buffer)), buffer.remaining(), PARENT_INT);
    }
    @Override public final IntBuffer slice(IntBuffer buffer, int offset, int length) {
        if (DEBUG) {
            checkSegment(buffer);
        }

        var position = buffer.position() + offset;
        if ((offset | position) < 0 || buffer.limit() < position) {
            throw new IllegalArgumentException();
        }
        if (length < 0 || buffer.capacity() - position < length) {
            throw new IllegalArgumentException();
        }
        return slice(BUFFER_INT, buffer, address(position, 2, getAddress0(buffer)), length, PARENT_INT);
    }

    @Override public final LongBuffer slice(LongBuffer buffer) {
        if (DEBUG) {
            checkSegment(buffer);
        }
        return slice(BUFFER_LONG, buffer, address(buffer.position(), 3, getAddress0(buffer)), buffer.remaining(), PARENT_LONG);
    }
    @Override public final LongBuffer slice(LongBuffer buffer, int offset, int length) {
        if (DEBUG) {
            checkSegment(buffer);
        }

        var position = buffer.position() + offset;
        if ((offset | position) < 0 || buffer.limit() < position) {
            throw new IllegalArgumentException();
        }
        if (length < 0 || buffer.capacity() - position < length) {
            throw new IllegalArgumentException();
        }
        return slice(BUFFER_LONG, buffer, address(position, 3, getAddress0(buffer)), length, PARENT_LONG);
    }

    @Override public final FloatBuffer slice(FloatBuffer buffer) {
        if (DEBUG) {
            checkSegment(buffer);
        }
        return slice(BUFFER_FLOAT, buffer, address(buffer.position(), 2, getAddress0(buffer)), buffer.remaining(), PARENT_FLOAT);
    }
    @Override public final FloatBuffer slice(FloatBuffer buffer, int offset, int length) {
        if (DEBUG) {
            checkSegment(buffer);
        }

        var position = buffer.position() + offset;
        if ((offset | position) < 0 || buffer.limit() < position) {
            throw new IllegalArgumentException();
        }
        if (length < 0 || buffer.capacity() - position < length) {
            throw new IllegalArgumentException();
        }
        return slice(BUFFER_FLOAT, buffer, address(position, 2, getAddress0(buffer)), length, PARENT_FLOAT);
    }

    @Override public final DoubleBuffer slice(DoubleBuffer buffer) {
        if (DEBUG) {
            checkSegment(buffer);
        }
        return slice(BUFFER_DOUBLE, buffer, address(buffer.position(), 3, getAddress0(buffer)), buffer.remaining(), PARENT_DOUBLE);
    }
    @Override public final DoubleBuffer slice(DoubleBuffer buffer, int offset, int length) {
        if (DEBUG) {
            checkSegment(buffer);
        }

        var position = buffer.position() + offset;
        if ((offset | position) < 0 || buffer.limit() < position) {
            throw new IllegalArgumentException();
        }
        if (length < 0 || buffer.capacity() - position < length) {
            throw new IllegalArgumentException();
        }
        return slice(BUFFER_DOUBLE, buffer, address(position, 3, getAddress0(buffer)), length, PARENT_DOUBLE);
    }

    @Override public final void memset(long ptr, int value, long bytes) {
        if (bytes == 0L) {
            return;
        }

        var b = (byte)(value & 0xFF);

        // On x64, setMemory has degraded performance with byte counts that are even.
        // Workaround by setting all but the last byte with setMemory, then setting the last byte separately.
        // Does not hurt on non-x64.
        var lastByteIndex = bytes - 1L;
        UNSAFE.setMemory(null, ptr, lastByteIndex + (bytes & 1L), b);
        UNSAFE.putByte(null, ptr + lastByteIndex, b);
    }

    @Override public final void memcpy(long src, long dst, long bytes) {
        // Much better performance on Java 16+
        //UNSAFE.copyMemory(null, src, null, dst, bytes);

        if (bytes == 0L) {
            return;
        }

        // On x64, copyMemory has degraded performance with byte counts that are multiple of 4.
        // Workaround by copying all but the last byte with copyMemory, then copying the last byte separately.
        // Does not hurt on non-x64.
        var lastByteIndex = bytes - 1L;
        UNSAFE.copyMemory(null, src, null, dst, lastByteIndex + (bytes & 1L));
        UNSAFE.putByte(null, dst + lastByteIndex, UNSAFE.getByte(null, src + lastByteIndex));
    }

    private static void memcpy(Object src, long dst, long srcOffset, long bytes) {
        if (bytes == 0L) {
            return;
        }

        var lastByteIndex = bytes - 1L;

        UNSAFE.copyMemory(src, srcOffset, null, dst, lastByteIndex + (bytes & 1L));
        UNSAFE.putByte(null, dst + lastByteIndex, UNSAFE.getByte(src, srcOffset + lastByteIndex));
    }

    @Override public final void memcpy(byte[] src, long dst, int offset, int size) {
        checkMemcpy(dst, offset, size, src.length);
        memcpy(src, dst, Unsafe.ARRAY_BYTE_BASE_OFFSET + offset, size);
    }
    @Override public final void memcpy(char[] src, long dst, int offset, int size) {
        checkMemcpy(dst, offset, size, src.length);
        memcpy(src, dst, Unsafe.ARRAY_CHAR_BASE_OFFSET + apiGetBytes(offset, 1), apiGetBytes(size, 1));
    }
    @Override public final void memcpy(short[] src, long dst, int offset, int size) {
        checkMemcpy(dst, offset, size, src.length);
        memcpy(src, dst, Unsafe.ARRAY_SHORT_BASE_OFFSET + apiGetBytes(offset, 1), apiGetBytes(size, 1));
    }
    @Override public final void memcpy(int[] src, long dst, int offset, int size) {
        checkMemcpy(dst, offset, size, src.length);
        memcpy(src, dst, Unsafe.ARRAY_INT_BASE_OFFSET + apiGetBytes(offset, 2), apiGetBytes(size, 2));
    }
    @Override public final void memcpy(long[] src, long dst, int offset, int size) {
        checkMemcpy(dst, offset, size, src.length);
        memcpy(src, dst, Unsafe.ARRAY_LONG_BASE_OFFSET + apiGetBytes(offset, 3), apiGetBytes(size, 3));
    }
    @Override public final void memcpy(float[] src, long dst, int offset, int size) {
        checkMemcpy(dst, offset, size, src.length);
        memcpy(src, dst, Unsafe.ARRAY_FLOAT_BASE_OFFSET + apiGetBytes(offset, 2), apiGetBytes(size, 2));
    }
    @Override public final void memcpy(double[] src, long dst, int offset, int size) {
        checkMemcpy(dst, offset, size, src.length);
        memcpy(src, dst, Unsafe.ARRAY_DOUBLE_BASE_OFFSET + apiGetBytes(offset, 3), apiGetBytes(size, 3));
    }

    private static void memcpy(long src, Object dst, long dstOffset, long bytes) {
        if (bytes == 0L) {
            return;
        }

        var lastByteIndex = bytes - 1L;

        UNSAFE.copyMemory(null, src, dst, dstOffset, lastByteIndex + (bytes & 1L));
        UNSAFE.putByte(dst, dstOffset + lastByteIndex, UNSAFE.getByte(null, src + lastByteIndex));
    }

    @Override public final void memcpy(long src, byte[] dst, int offset, int size) {
        checkMemcpy(src, offset, size, dst.length);
        memcpy(src, dst, Unsafe.ARRAY_BYTE_BASE_OFFSET + offset, size);
    }
    @Override public final void memcpy(long src, char[] dst, int offset, int size) {
        checkMemcpy(src, offset, size, dst.length);
        memcpy(src, dst, Unsafe.ARRAY_CHAR_BASE_OFFSET + apiGetBytes(offset, 1), apiGetBytes(size, 1));
    }
    @Override public final void memcpy(long src, short[] dst, int offset, int size) {
        checkMemcpy(src, offset, size, dst.length);
        memcpy(src, dst, Unsafe.ARRAY_SHORT_BASE_OFFSET + apiGetBytes(offset, 1), apiGetBytes(size, 1));
    }
    @Override public final void memcpy(long src, int[] dst, int offset, int size) {
        checkMemcpy(src, offset, size, dst.length);
        memcpy(src, dst, Unsafe.ARRAY_INT_BASE_OFFSET + apiGetBytes(offset, 2), apiGetBytes(size, 2));
    }
    @Override public final void memcpy(long src, long[] dst, int offset, int size) {
        checkMemcpy(src, offset, size, dst.length);
        memcpy(src, dst, Unsafe.ARRAY_LONG_BASE_OFFSET + apiGetBytes(offset, 3), apiGetBytes(size, 3));
    }
    @Override public final void memcpy(long src, float[] dst, int offset, int size) {
        checkMemcpy(src, offset, size, dst.length);
        memcpy(src, dst, Unsafe.ARRAY_FLOAT_BASE_OFFSET + apiGetBytes(offset, 2), apiGetBytes(size, 2));
    }
    @Override public final void memcpy(long src, double[] dst, int offset, int size) {
        checkMemcpy(src, offset, size, dst.length);
        memcpy(src, dst, Unsafe.ARRAY_DOUBLE_BASE_OFFSET + apiGetBytes(offset, 3), apiGetBytes(size, 3));
    }

    // Cannot use StandardCharsets.ISO_8859_1 for encoding, because it replaces unmappable characters
    // and replacing surrogates changes the string length.
    @Override public final void putStringASCII(String text, boolean nullTerminated, long target) {
        var length = text.length();

        var bytes = (byte @NonNull [])UNSAFE.getReference(text, STRING_VALUE);
        if (COMPACT_STRINGS && UNSAFE.getByte(text, STRING_CODER) == 0) {
            memcpy(bytes, target, 0, bytes.length);
        } else {
            var i = 0;
            for (; i <= length - 4; i += 4) {
                var v = UNSAFE.getLongUnaligned(bytes, Unsafe.ARRAY_BYTE_BASE_OFFSET + ((long)i << 1));

                v &= 0x00FF_00FF_00FF_00FFL;
                v = (v | (v >>> 8)) & 0x0000_FFFF_0000_FFFFL;
                v = (v | (v >>> 16));

                UNSAFE.putIntUnaligned(null, target + i, (int)v);
                //UNSAFE.putIntUnaligned(null, target + i, (int)Long.compress(l, 0x00FF_00FF_00FF_00FFL));
            }
            for (; i < length; i++) {
                UNSAFE.putByte(null, target + i, (byte)text.charAt(i));
            }
        }
        if (nullTerminated) {
            UNSAFE.putByte(null, target + length, (byte)0);
        }
    }

    @Override public final void putStringASCII(CharSequence text, boolean nullTerminated, long target) {
        var length = text.length();
        for (var i = 0; i < length; i++) {
            UNSAFE.putByte(null, target + i, (byte)text.charAt(i));
        }
        if (nullTerminated) {
            UNSAFE.putByte(null, target + length, (byte)0);
        }
    }

    private static byte[] getUTF8Bytes(String text) {
        if (COMPACT_STRINGS && UNSAFE.getByte(text, STRING_CODER) == 0) {
            var bytes = (byte @NonNull [])UNSAFE.getReference(text, STRING_VALUE);
            if (isCompactStringASCII(bytes)) {
                return bytes;
            }
        }
        return text.getBytes(UTF_8);
    }

    @Override public final ByteBuffer allocateUTF8(String text, boolean nullTerminated, MemoryAllocator allocator) {
        return allocateUTF8(getUTF8Bytes(text), nullTerminated, allocator);
    }
    protected final ByteBuffer allocateUTF8(byte[] bytes, boolean nullTerminated, MemoryAllocator allocator) {
        var length = memLengthNT1(bytes, nullTerminated);
        var target = allocator.malloc(length);
        if (CHECKS && target == NULL) {
            throw new OutOfMemoryError();
        }

        memcpy(bytes, target, Unsafe.ARRAY_BYTE_BASE_OFFSET, bytes.length);
        if (nullTerminated) {
            UNSAFE.putByte(null, target + bytes.length, (byte)0);
        }

        return wrapBufferByte(target, length);
    }
    private static boolean isCompactStringASCII(byte[] bytes) {
        var i = 0;

        // Aligned longs for performance
        for (; i <= bytes.length - 8; i += 8) {
            if ((UNSAFE.getLong(bytes, Unsafe.ARRAY_BYTE_BASE_OFFSET + i) & 0x80_80_80_80_80_80_80_80L) != 0L) {
                return false;
            }
        }

        // Tail
        for (; i < bytes.length; i++) {
            if (bytes[i] < 0) {
                return false;
            }
        }

        return true;
    }


    @Override public final int putStringUTF8(String text, boolean nullTerminated, long target, int maxLength) {
        var bytes = getUTF8Bytes(text);

        var length = memLengthNT1(bytes, nullTerminated);
        if (maxLength < length) {
            throw new BufferOverflowException();
        }

        memcpy(bytes, target, Unsafe.ARRAY_BYTE_BASE_OFFSET, bytes.length);
        if (nullTerminated) {
            UNSAFE.putByte(null, target + bytes.length, (byte)0);
        }

        return length;
    }
    @Override public final void putStringUTF8(CharSequence text, boolean nullTerminated, long target) {
        int p = 0, i = 0, len = text.length();

        while (i < len) {
            var c = text.charAt(i++);
            if (c < 0x80) {
                UNSAFE.putByte(null, target + p++, (byte)c);
            } else {
                int cp = c;
                if (c < 0x800) {
                    UNSAFE.putByte(null, target + p++, (byte)(0xC0 | cp >> 6));
                } else {
                    if (!isHighSurrogate(c)) {
                        UNSAFE.putByte(null, target + p++, (byte)(0xE0 | cp >> 12));
                    } else {
                        cp = toCodePoint(c, text.charAt(i++));

                        UNSAFE.putByte(null, target + p++, (byte)(0xF0 | cp >> 18));
                        UNSAFE.putByte(null, target + p++, (byte)(0x80 | cp >> 12 & 0x3F));
                    }
                    UNSAFE.putByte(null, target + p++, (byte)(0x80 | cp >> 6 & 0x3F));
                }
                UNSAFE.putByte(null, target + p++, (byte)(0x80 | cp & 0x3F));
            }
        }

        if (nullTerminated) {
            UNSAFE.putByte(null, target + p, (byte)0);
        }
    }

    @Override public final void putStringUTF16(String text, boolean nullTerminated, long target) {
        var length = text.length();

        var bytes = (byte @NonNull [])UNSAFE.getReference(text, STRING_VALUE);
        if (!COMPACT_STRINGS || UNSAFE.getByte(text, STRING_CODER) == 1) {
            memcpy(bytes, target, Unsafe.ARRAY_BYTE_BASE_OFFSET, bytes.length);
        } else {
            putStringUTF16Unpack(bytes, target);
        }
        if (nullTerminated) {
            UNSAFE.putChar(null, target + ((long)length << 1), '\0');
        }
    }
    private static void putStringUTF16Unpack(byte[] bytes, long target) {
        var i = 0;
        for (; i <= bytes.length - 4; i += 4) {
            var v = UNSAFE.getInt(bytes, Unsafe.ARRAY_BYTE_BASE_OFFSET + i) & 0xFFFF_FFFFL;

            v = (v | (v << 16)) & 0x0000_FFFF_0000_FFFFL;
            v = (v | (v << 8)) & 0x00FF_00FF_00FF_00FFL;

            UNSAFE.putLongUnaligned(null, target + ((long)i << 1), v);
        }
        for (; i < bytes.length; i++) {
            UNSAFE.putChar(null, target + ((long)i << 1), (char)(bytes[i] & 0xFF));
        }
    }
    @Override public final void putStringUTF16(CharSequence text, boolean nullTerminated, long target) {
        var length = text.length();
        for (var i = 0; i < length; i++) {
            UNSAFE.putChar(null, target + ((long)i << 1), text.charAt(i));
        }
        if (nullTerminated) {
            UNSAFE.putChar(null, target + ((long)length << 1), '\0');
        }
    }

    // ------------------------

    private static ByteBuffer slice(ByteBuffer source, long address, int capacity) {
        ByteBuffer target;
        try {
            target = (ByteBuffer)UNSAFE.allocateInstance(BUFFER_BYTE);
        } catch (InstantiationException e) {
            throw new UnsupportedOperationException(e);
        }

        UNSAFE.putLong(target, ADDRESS, address);
        UNSAFE.putInt(target, MARK, -1);
        UNSAFE.putInt(target, LIMIT, capacity);
        UNSAFE.putInt(target, CAPACITY, capacity);

        var attachment = UNSAFE.getReference(source, PARENT_BYTE);
        UNSAFE.putReference(target, PARENT_BYTE, attachment == null ? source : attachment);

        return target.order(source.order());
    }

    @SuppressWarnings("unchecked")
    private static <T extends Buffer> T slice(Class<? extends T> clazz, T source, long address, int capacity, long attachmentOffset) {
        T target;
        try {
            target = (T)UNSAFE.allocateInstance(clazz);
        } catch (InstantiationException e) {
            throw new UnsupportedOperationException(e);
        }

        UNSAFE.putLong(target, ADDRESS, address);
        UNSAFE.putInt(target, MARK, -1);
        UNSAFE.putInt(target, LIMIT, capacity);
        UNSAFE.putInt(target, CAPACITY, capacity);

        UNSAFE.putReference(target, attachmentOffset, UNSAFE.getReference(source, attachmentOffset));

        return target;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Buffer> T duplicate(Class<? extends T> clazz, T source, long attachmentOffset) {
        T target;
        try {
            target = (T)UNSAFE.allocateInstance(clazz);
        } catch (InstantiationException e) {
            throw new UnsupportedOperationException(e);
        }

        UNSAFE.putLong(target, ADDRESS, UNSAFE.getLong(source, ADDRESS));
        UNSAFE.putInt(target, MARK, UNSAFE.getInt(source, MARK));
        UNSAFE.putInt(target, POSITION, UNSAFE.getInt(source, POSITION));
        UNSAFE.putInt(target, LIMIT, UNSAFE.getInt(source, LIMIT));
        UNSAFE.putInt(target, CAPACITY, UNSAFE.getInt(source, CAPACITY));

        UNSAFE.putReference(target, attachmentOffset, UNSAFE.getReference(source, attachmentOffset));

        return target;
    }

    private static final int MAGIC_CAPACITY = 0x0D15EA5E;
    private static final int MAGIC_POSITION = 0x00FACADE;

    private static long getAddressOffset() {
        var MAGIC_ADDRESS = 0xDEADBEEF8BADF00DL & (BITS32 ? 0xFFFF_FFFFL : 0xFFFF_FFFF_FFFF_FFFFL);

        var bb = Objects.requireNonNull(NewDirectByteBuffer(MAGIC_ADDRESS, 0));

        return getFieldOffset(bb.getClass(), long.class, offset -> UNSAFE.getLong(bb, offset) == MAGIC_ADDRESS);
    }

    private static long getMarkOffset() {
        var bb = Objects.requireNonNull(NewDirectByteBuffer(1L, 0));
        return getFieldOffsetInt(bb, -1);
    }

    private static long getPositionOffset() {
        var bb = Objects.requireNonNull(NewDirectByteBuffer(-1L, MAGIC_CAPACITY));
        bb.position(MAGIC_POSITION);
        return getFieldOffsetInt(bb, MAGIC_POSITION);
    }

    private static long getLimitOffset() {
        var bb = Objects.requireNonNull(NewDirectByteBuffer(-1L, MAGIC_CAPACITY));
        bb.limit(MAGIC_POSITION);
        return getFieldOffsetInt(bb, MAGIC_POSITION);
    }

    private static long getCapacityOffset() {
        var bb = Objects.requireNonNull(NewDirectByteBuffer(-1L, MAGIC_CAPACITY));
        bb.limit(0);
        return getFieldOffsetInt(bb, MAGIC_CAPACITY);
    }

    private static long getFieldOffsetInt(Object container, int value) {
        return getFieldOffset(container.getClass(), int.class, offset -> UNSAFE.getInt(container, offset) == value);
    }

    private static long getFieldOffsetObject(Object container, Object value) {
        return getFieldOffset(container.getClass(), value.getClass(), offset -> UNSAFE.getReference(container, offset) == value);
    }

    private static long getFieldOffset(Class<?> containerType, Class<?> fieldType, LongPredicate predicate) {
        var c = containerType;
        while (c != Object.class) {
            var fields = c.getDeclaredFields();
            for (var field : fields) {
                if (!field.getType().isAssignableFrom(fieldType) || Modifier.isStatic(field.getModifiers()) || field.isSynthetic()) {
                    continue;
                }

                var offset = UNSAFE.objectFieldOffset(field);
                if (predicate.test(offset)) {
                    return offset;
                }
            }
            c = c.getSuperclass();
        }
        throw new UnsupportedOperationException("Failed to find field offset in class.");
    }

    // ----------------------------------------------
    // ----------------------------------------------
    // ----------------------------------------------

    static final class P64CL32 extends MemoryBackendUnsafe {
        @Override public long getCLong(long ptr)                      { return UNSAFE.getInt(null, ptr); }
        @Override public long getCLongUnaligned(long ptr)             { return UNSAFE.getIntUnaligned(null, ptr); }

        @Override public void putCLong(long ptr, long value)          { UNSAFE.putInt(null, ptr, (int)value); }
        @Override public void putCLongUnaligned(long ptr, long value) { UNSAFE.putIntUnaligned(null, ptr, (int)value); }
    }

    static final class P32 extends MemoryBackendUnsafe {
        @Override public long getCLong(long ptr)                        { return UNSAFE.getInt(null, ptr); }
        @Override public long getCLongUnaligned(long ptr)               { return UNSAFE.getIntUnaligned(null, ptr); }

        @Override public long getAddress(long ptr)                      { return UNSAFE.getInt(null, ptr) & 0xFFFF_FFFFL; }
        @Override public long getAddressUnaligned(long ptr)             { return UNSAFE.getIntUnaligned(null, ptr) & 0xFFFF_FFFFL; }

        @Override public void putCLong(long ptr, long value)            { UNSAFE.putInt(null, ptr, (int)value); }
        @Override public void putCLongUnaligned(long ptr, long value)   { UNSAFE.putIntUnaligned(null, ptr, (int)value); }

        @Override public void putAddress(long ptr, long value)          { UNSAFE.putInt(null, ptr, (int)value); }
        @Override public void putAddressUnaligned(long ptr, long value) { UNSAFE.putIntUnaligned(null, ptr, (int)value); }
    }

}