/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.jspecify.annotations.*;
import sun.misc.*;

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
import static org.lwjgl.system.libc.LibCString.*;

class MemoryBackendUnsafeLegacy implements MemoryBackend {

    protected static final sun.misc.Unsafe UNSAFE;

    private static final ByteOrder NATIVE_ORDER = ByteOrder.nativeOrder();

    protected static final Class<? extends ByteBuffer>   BUFFER_BYTE;
    protected static final Class<? extends CharBuffer>   BUFFER_CHAR;
    protected static final Class<? extends ShortBuffer>  BUFFER_SHORT;
    protected static final Class<? extends IntBuffer>    BUFFER_INT;
    protected static final Class<? extends LongBuffer>   BUFFER_LONG;
    protected static final Class<? extends FloatBuffer>  BUFFER_FLOAT;
    protected static final Class<? extends DoubleBuffer> BUFFER_DOUBLE;

    private static final long MARK;
    private static final long POSITION;
    private static final long LIMIT;
    private static final long CAPACITY;

    private static final long ADDRESS;

    protected static final long PARENT_BYTE;
    protected static final long PARENT_CHAR;
    protected static final long PARENT_SHORT;
    protected static final long PARENT_INT;
    protected static final long PARENT_LONG;
    protected static final long PARENT_FLOAT;
    protected static final long PARENT_DOUBLE;

    private static final long STRING_VALUE;

    private static final boolean UNALIGNED_ACCESS;

    static {
        UNSAFE = getUnsafeInstance();

        ByteBuffer bb = ByteBuffer.allocateDirect(0).order(NATIVE_ORDER);

        BUFFER_BYTE = bb.getClass();
        BUFFER_CHAR = bb.asCharBuffer().getClass();
        BUFFER_SHORT = bb.asShortBuffer().getClass();
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

            PARENT_BYTE = getFieldOffsetObject(bb.duplicate().order(bb.order()), bb);
            PARENT_CHAR = getFieldOffsetObject(bb.asCharBuffer(), bb);
            PARENT_SHORT = getFieldOffsetObject(bb.asShortBuffer(), bb);
            PARENT_INT = getFieldOffsetObject(bb.asIntBuffer(), bb);
            PARENT_LONG = getFieldOffsetObject(bb.asLongBuffer(), bb);
            PARENT_FLOAT = getFieldOffsetObject(bb.asFloatBuffer(), bb);
            PARENT_DOUBLE = getFieldOffsetObject(bb.asDoubleBuffer(), bb);

            STRING_VALUE = UNSAFE.objectFieldOffset(String.class.getDeclaredField("value"));
        } catch (Throwable t) {
            throw new UnsupportedOperationException(t);
        }

        switch (Platform.getArchitecture()) {
            case ARM32:
            case RISCV64:
                UNALIGNED_ACCESS = false;
                break;
            default:
                UNALIGNED_ACCESS = true;
        }

        apiLog("MemoryUtil backend: sun.misc.Unsafe");
        if (25 <= Platform.getJavaVersion()) {
            // guide users towards enabling jdk.internal.misc.Unsafe
            if (!"legacy".equals(Configuration.MEMORY_BACKEND.get())) { // unless explicitly enabled
                apiLogMore("see Configuration::MEMORY_BACKEND for more options");
            }
        }
    }

    @Override public final boolean getBoolean(long ptr) { return UNSAFE.getBoolean(null, ptr); }

    @Override public final byte getByte(long ptr)       { return UNSAFE.getByte(null, ptr); }

    @Override public final char getChar(long ptr)       { return UNSAFE.getChar(null, ptr); }
    @Override public final char getCharUnaligned(long ptr) {
        if (UNALIGNED_ACCESS || (ptr & 1L) == 0L) {
            return UNSAFE.getChar(null, ptr);
        } else {
            return byteBitsToChar(ptr);
        }
    }

    @Override public final short getShort(long ptr) { return UNSAFE.getShort(null, ptr); }
    @Override public final short getShortUnaligned(long ptr) {
        if (UNALIGNED_ACCESS || (ptr & 1L) == 0L) {
            return UNSAFE.getShort(null, ptr);
        } else {
            return byteBitsToShort(ptr);
        }
    }

    @Override public final int getInt(long ptr) { return UNSAFE.getInt(null, ptr); }
    @Override public final int getIntUnaligned(long ptr) {
        if (UNALIGNED_ACCESS || (ptr & 3L) == 0L) {
            return UNSAFE.getInt(null, ptr);
        } else {
            return bitsToInt(ptr);
        }
    }

    @Override public final long getLong(long ptr) { return UNSAFE.getLong(null, ptr); }
    @Override public final long getLongUnaligned(long ptr) {
        if (UNALIGNED_ACCESS || (ptr & 7L) == 0L) {
            return UNSAFE.getLong(null, ptr);
        } else {
            return bitsToLong(ptr);
        }
    }

    @Override public final long getLong(byte[] o, long offset)      { return UNSAFE.getLong(o, Unsafe.ARRAY_BYTE_BASE_OFFSET + offset); }

    @Override public final float getFloat(long ptr)                 { return UNSAFE.getFloat(null, ptr); }
    @Override public final float getFloatUnaligned(long ptr)        { return Float.intBitsToFloat(getIntUnaligned(ptr)); }

    @Override public final double getDouble(long ptr)               { return UNSAFE.getDouble(null, ptr); }
    @Override public final double getDoubleUnaligned(long ptr)      { return Double.longBitsToDouble(getLongUnaligned(ptr)); }

    @Override public long getCLong(long ptr)                        { return UNSAFE.getLong(null, ptr); }
    @Override public long getCLongUnaligned(long ptr)               { return getLongUnaligned(ptr); }

    @Override public long getAddress(long ptr)                      { return UNSAFE.getLong(null, ptr); }
    @Override public long getAddressUnaligned(long ptr)             { return getLongUnaligned(ptr); }

    @Override public final void putBoolean(long ptr, boolean value) { UNSAFE.putBoolean(null, ptr, value); }

    @Override public final void putByte(long ptr, byte value)       { UNSAFE.putByte(null, ptr, value); }

    @Override public final void putChar(long ptr, char value)       { UNSAFE.putChar(null, ptr, value); }
    @Override public final void putCharUnaligned(long ptr, char value) {
        if (UNALIGNED_ACCESS || (ptr & 1L) == 0L) {
            UNSAFE.putChar(null, ptr, value);
        } else {
            charToByteBits(ptr, value);
        }
    }

    @Override public final void putShort(long ptr, short value) { UNSAFE.putShort(null, ptr, value); }
    @Override public final void putShortUnaligned(long ptr, short value) {
        if (UNALIGNED_ACCESS || (ptr & 1L) == 0L) {
            UNSAFE.putShort(null, ptr, value);
        } else {
            shortToByteBits(ptr, value);
        }
    }

    @Override public final void putInt(long ptr, int value) { UNSAFE.putInt(null, ptr, value); }
    @Override public final void putIntUnaligned(long ptr, int value) {
        if (UNALIGNED_ACCESS || (ptr & 3L) == 0L) {
            UNSAFE.putInt(null, ptr, value);
        } else {
            intToBits(ptr, value);
        }
    }

    @Override public final void putLong(long ptr, long value) { UNSAFE.putLong(null, ptr, value); }
    @Override public final void putLongUnaligned(long ptr, long value) {
        if (UNALIGNED_ACCESS || (ptr & 7L) == 0L) {
            UNSAFE.putLong(null, ptr, value);
        } else {
            longToBits(ptr, value);
        }
    }

    @Override public final void putFloat(long ptr, float value)            { UNSAFE.putFloat(null, ptr, value); }
    @Override public final void putFloatUnaligned(long ptr, float value)   { putIntUnaligned(ptr, Float.floatToRawIntBits(value)); }

    @Override public final void putDouble(long ptr, double value)          { UNSAFE.putDouble(null, ptr, value); }
    @Override public final void putDoubleUnaligned(long ptr, double value) { putLongUnaligned(ptr, Double.doubleToRawLongBits(value)); }

    @Override public void putCLong(long ptr, long value)                   { UNSAFE.putLong(null, ptr, value); }
    @Override public void putCLongUnaligned(long ptr, long value)          { putLongUnaligned(ptr, value); }

    @Override public void putAddress(long ptr, long value)                 { UNSAFE.putLong(null, ptr, value); }
    @Override public void putAddressUnaligned(long ptr, long value)        { putLongUnaligned(ptr, value); }

    @Override public final long getAddress0(Buffer buffer)                 { return UNSAFE.getLong(buffer, ADDRESS); }
    @Override public final long getAddress0(ByteBuffer buffer)             { return UNSAFE.getLong(buffer, ADDRESS); }
    @Override public final long getAddress0(CharBuffer buffer)             { return UNSAFE.getLong(buffer, ADDRESS); }
    @Override public final long getAddress0(ShortBuffer buffer)            { return UNSAFE.getLong(buffer, ADDRESS); }
    @Override public final long getAddress0(IntBuffer buffer)              { return UNSAFE.getLong(buffer, ADDRESS); }
    @Override public final long getAddress0(LongBuffer buffer)             { return UNSAFE.getLong(buffer, ADDRESS); }
    @Override public final long getAddress0(FloatBuffer buffer)            { return UNSAFE.getLong(buffer, ADDRESS); }
    @Override public final long getAddress0(DoubleBuffer buffer)           { return UNSAFE.getLong(buffer, ADDRESS); }

    protected static long address(int position, int elementShift, long address) {
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

    @Override public ByteBuffer duplicate(ByteBuffer buffer) {
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

        Object attachment = UNSAFE.getObject(buffer, PARENT_BYTE);
        UNSAFE.putObject(target, PARENT_BYTE, attachment == null ? buffer : attachment);

        return target.order(buffer.order());
    }
    @Override public CharBuffer duplicate(CharBuffer buffer)     { return duplicate(BUFFER_CHAR, buffer, PARENT_CHAR); }
    @Override public ShortBuffer duplicate(ShortBuffer buffer)   { return duplicate(BUFFER_SHORT, buffer, PARENT_SHORT); }
    @Override public IntBuffer duplicate(IntBuffer buffer)       { return duplicate(BUFFER_INT, buffer, PARENT_INT); }
    @Override public LongBuffer duplicate(LongBuffer buffer)     { return duplicate(BUFFER_LONG, buffer, PARENT_LONG); }
    @Override public FloatBuffer duplicate(FloatBuffer buffer)   { return duplicate(BUFFER_FLOAT, buffer, PARENT_FLOAT); }
    @Override public DoubleBuffer duplicate(DoubleBuffer buffer) { return duplicate(BUFFER_DOUBLE, buffer, PARENT_DOUBLE); }

    @Override public ByteBuffer slice(ByteBuffer buffer)         { return slice(buffer, getAddress0(buffer) + buffer.position(), buffer.remaining()); }
    @Override public ByteBuffer slice(ByteBuffer buffer, int offset, int length) {
        int position = buffer.position() + offset;
        if ((offset | position) < 0 || buffer.limit() < position) {
            throw new IllegalArgumentException();
        }
        if (length < 0 || buffer.capacity() - position < length) {
            throw new IllegalArgumentException();
        }
        return slice(buffer, getAddress0(buffer) + position, length);
    }

    @Override public CharBuffer slice(CharBuffer buffer) {
        return slice(BUFFER_CHAR, buffer, address(buffer.position(), 1, getAddress0(buffer)), buffer.remaining(), PARENT_CHAR);
    }
    @Override public CharBuffer slice(CharBuffer buffer, int offset, int length) {
        int position = buffer.position() + offset;
        if ((offset | position) < 0 || buffer.limit() < position) {
            throw new IllegalArgumentException();
        }
        if (length < 0 || buffer.capacity() - position < length) {
            throw new IllegalArgumentException();
        }
        return slice(BUFFER_CHAR, buffer, address(position, 1, getAddress0(buffer)), length, PARENT_CHAR);
    }

    @Override public ShortBuffer slice(ShortBuffer buffer) {
        return slice(BUFFER_SHORT, buffer, address(buffer.position(), 1, getAddress0(buffer)), buffer.remaining(), PARENT_SHORT);
    }
    @Override public ShortBuffer slice(ShortBuffer buffer, int offset, int length) {
        int position = buffer.position() + offset;
        if ((offset | position) < 0 || buffer.limit() < position) {
            throw new IllegalArgumentException();
        }
        if (length < 0 || buffer.capacity() - position < length) {
            throw new IllegalArgumentException();
        }
        return slice(BUFFER_SHORT, buffer, address(position, 1, getAddress0(buffer)), length, PARENT_SHORT);
    }

    @Override public IntBuffer slice(IntBuffer buffer) {
        return slice(BUFFER_INT, buffer, address(buffer.position(), 2, getAddress0(buffer)), buffer.remaining(), PARENT_INT);
    }
    @Override public IntBuffer slice(IntBuffer buffer, int offset, int length) {
        int position = buffer.position() + offset;
        if ((offset | position) < 0 || buffer.limit() < position) {
            throw new IllegalArgumentException();
        }
        if (length < 0 || buffer.capacity() - position < length) {
            throw new IllegalArgumentException();
        }
        return slice(BUFFER_INT, buffer, address(position, 2, getAddress0(buffer)), length, PARENT_INT);
    }

    @Override public LongBuffer slice(LongBuffer buffer) {
        return slice(BUFFER_LONG, buffer, address(buffer.position(), 3, getAddress0(buffer)), buffer.remaining(), PARENT_LONG);
    }
    @Override public LongBuffer slice(LongBuffer buffer, int offset, int length) {
        int position = buffer.position() + offset;
        if ((offset | position) < 0 || buffer.limit() < position) {
            throw new IllegalArgumentException();
        }
        if (length < 0 || buffer.capacity() - position < length) {
            throw new IllegalArgumentException();
        }
        return slice(BUFFER_LONG, buffer, address(position, 3, getAddress0(buffer)), length, PARENT_LONG);
    }

    @Override public FloatBuffer slice(FloatBuffer buffer) {
        return slice(BUFFER_FLOAT, buffer, address(buffer.position(), 2, getAddress0(buffer)), buffer.remaining(), PARENT_FLOAT);
    }
    @Override public FloatBuffer slice(FloatBuffer buffer, int offset, int length) {
        int position = buffer.position() + offset;
        if ((offset | position) < 0 || buffer.limit() < position) {
            throw new IllegalArgumentException();
        }
        if (length < 0 || buffer.capacity() - position < length) {
            throw new IllegalArgumentException();
        }
        return slice(BUFFER_FLOAT, buffer, address(position, 2, getAddress0(buffer)), length, PARENT_FLOAT);
    }

    @Override public DoubleBuffer slice(DoubleBuffer buffer) {
        return slice(BUFFER_DOUBLE, buffer, address(buffer.position(), 3, getAddress0(buffer)), buffer.remaining(), PARENT_DOUBLE);
    }
    @Override public DoubleBuffer slice(DoubleBuffer buffer, int offset, int length) {
        int position = buffer.position() + offset;
        if ((offset | position) < 0 || buffer.limit() < position) {
            throw new IllegalArgumentException();
        }
        if (length < 0 || buffer.capacity() - position < length) {
            throw new IllegalArgumentException();
        }
        return slice(BUFFER_DOUBLE, buffer, address(position, 3, getAddress0(buffer)), length, PARENT_DOUBLE);
    }

    @Override public void memset(long ptr, int value, long bytes) {
        /*
        - Unsafe.setMemory is very slow.
        - A custom Java loop is fastest at small sizes, approximately up to 256 bytes.
        - The native memset becomes fastest at bigger sizes, when the JNI overhead becomes negligible.
         */
        if (bytes < 256L) {
            int p = (int)ptr;
            if (BITS64) {
                if ((p & 7) == 0) {
                    memset64(ptr, value, bytes);
                    return;
                }
            } else {
                if ((p & 3) == 0) {
                    memset32(p, value, bytes);
                    return;
                }
            }
        }
        nmemset(ptr, value, bytes);
    }
    private static final long FILL_PATTERN_64 = Long.divideUnsigned(-1L, 255L);
    private static void memset64(long ptr, int value, long bytes) {
        int limit = (int)bytes & 0xFF;

        long l = (value & 0xFF) * FILL_PATTERN_64;

        int offset = 0;

        // Aligned body
        for (int aligned = limit & ~7; offset < aligned; offset += 8) {
            UNSAFE.putLong(null, ptr + offset, l);
        }

        // Unaligned tail
        if (offset < (limit & ~3)) {
            UNSAFE.putInt(null, ptr + offset, (int)l);
            offset += 4;
        }

        if (offset < (limit & ~1)) {
            UNSAFE.putShort(null, ptr + offset, (short)l);
            offset += 2;
        }

        if (offset < limit) {
            UNSAFE.putByte(null, ptr + offset, (byte)l);
        }
    }
    private static final int FILL_PATTERN_32 = Integer.divideUnsigned(-1, 255);
    private static void memset32(int ptr, int value, long bytes) {
        int limit = (int)bytes & 0xFF;

        int i = (value & 0xFF) * FILL_PATTERN_32;

        int offset = 0;

        // Aligned body
        for (int aligned = limit & ~3; offset < aligned; offset += 4) {
            UNSAFE.putInt(null, Integer.toUnsignedLong(ptr + offset), i);
        }

        // Unaligned tail
        if (offset < (limit & ~1)) {
            UNSAFE.putShort(null, Integer.toUnsignedLong(ptr + offset), (short)i);
            offset += 2;
        }

        if (offset < limit) {
            UNSAFE.putByte(null, Integer.toUnsignedLong(ptr + offset), (byte)i);
        }
    }

    @Override public void memcpy(long src, long dst, long bytes) {
        // A custom Java loop is fastest at small sizes, approximately up to 160 bytes.
        if (BITS64 && bytes <= 160L && ((src | dst) & 7L) == 0L) {
            // both src and dst are aligned to 8 bytes
            memcpyAligned64(src, dst, bytes);
            return;
        }

        // Fastest at bigger sizes, when the JNI overhead becomes negligible.
        nmemcpy(dst, src, bytes);
    }
    private static void memcpyAligned64(long src, long dst, long bytes) {
        int limit = (int)bytes & 0xFF;

        // Aligned body
        int offset = 0;
        for (int aligned = limit & ~7; offset < aligned; offset += 8) {
            UNSAFE.putLong(null, dst + offset, UNSAFE.getLong(null, src + offset));
        }

        // Unaligned tail
        if (offset < (limit & ~3)) {
            UNSAFE.putInt(null, dst + offset, UNSAFE.getInt(null, src + offset));
            offset += 4;
        }

        if (offset < (limit & ~1)) {
            UNSAFE.putShort(null, dst + offset, UNSAFE.getShort(null, src + offset));
            offset += 2;
        }

        if (offset < limit) {
            UNSAFE.putByte(null, dst + offset, UNSAFE.getByte(null, src + offset));
        }
    }

    protected static final long BASE_OFFSET_BYTE   = Integer.toUnsignedLong(sun.misc.Unsafe.ARRAY_BYTE_BASE_OFFSET);
    protected static final long BASE_OFFSET_CHAR   = Integer.toUnsignedLong(sun.misc.Unsafe.ARRAY_CHAR_BASE_OFFSET);
    protected static final long BASE_OFFSET_SHORT  = Integer.toUnsignedLong(sun.misc.Unsafe.ARRAY_SHORT_BASE_OFFSET);
    protected static final long BASE_OFFSET_INT    = Integer.toUnsignedLong(sun.misc.Unsafe.ARRAY_INT_BASE_OFFSET);
    protected static final long BASE_OFFSET_LONG   = Integer.toUnsignedLong(sun.misc.Unsafe.ARRAY_LONG_BASE_OFFSET);
    protected static final long BASE_OFFSET_FLOAT  = Integer.toUnsignedLong(sun.misc.Unsafe.ARRAY_FLOAT_BASE_OFFSET);
    protected static final long BASE_OFFSET_DOUBLE = Integer.toUnsignedLong(sun.misc.Unsafe.ARRAY_DOUBLE_BASE_OFFSET);

    protected void memcpy(Object src, long dst, long srcOffset, long bytes) {
        UNSAFE.copyMemory(src, srcOffset, null, dst, bytes);
    }

    @Override public final void memcpy(byte[] src, long dst, int offset, int size) {
        checkMemcpy(dst, offset, size, src.length);
        memcpy(src, dst, BASE_OFFSET_BYTE + offset, size);
    }
    @Override public final void memcpy(char[] src, long dst, int offset, int size) {
        checkMemcpy(dst, offset, size, src.length);
        memcpy(src, dst, BASE_OFFSET_CHAR + apiGetBytes(offset, 1), apiGetBytes(size, 1));
    }
    @Override public final void memcpy(short[] src, long dst, int offset, int size) {
        checkMemcpy(dst, offset, size, src.length);
        memcpy(src, dst, BASE_OFFSET_SHORT + apiGetBytes(offset, 1), apiGetBytes(size, 1));
    }
    @Override public final void memcpy(int[] src, long dst, int offset, int size) {
        checkMemcpy(dst, offset, size, src.length);
        memcpy(src, dst, BASE_OFFSET_INT + apiGetBytes(offset, 2), apiGetBytes(size, 2));
    }
    @Override public final void memcpy(long[] src, long dst, int offset, int size) {
        checkMemcpy(dst, offset, size, src.length);
        memcpy(src, dst, BASE_OFFSET_LONG + apiGetBytes(offset, 3), apiGetBytes(size, 3));
    }
    @Override public final void memcpy(float[] src, long dst, int offset, int size) {
        checkMemcpy(dst, offset, size, src.length);
        memcpy(src, dst, BASE_OFFSET_FLOAT + apiGetBytes(offset, 2), apiGetBytes(size, 2));
    }
    @Override public final void memcpy(double[] src, long dst, int offset, int size) {
        checkMemcpy(dst, offset, size, src.length);
        memcpy(src, dst, BASE_OFFSET_DOUBLE + apiGetBytes(offset, 3), apiGetBytes(size, 3));
    }

    protected void memcpy(long src, Object dst, long dstOffset, long bytes) {
        UNSAFE.copyMemory(null, src, dst, dstOffset, bytes);
    }

    @Override public final void memcpy(long src, byte[] dst, int offset, int size) {
        checkMemcpy(src, offset, size, dst.length);
        memcpy(src, dst, BASE_OFFSET_BYTE + offset, size);
    }
    @Override public final void memcpy(long src, char[] dst, int offset, int size) {
        checkMemcpy(src, offset, size, dst.length);
        memcpy(src, dst, BASE_OFFSET_CHAR + apiGetBytes(offset, 1), apiGetBytes(size, 1));
    }
    @Override public final void memcpy(long src, short[] dst, int offset, int size) {
        checkMemcpy(src, offset, size, dst.length);
        memcpy(src, dst, BASE_OFFSET_SHORT + apiGetBytes(offset, 1), apiGetBytes(size, 1));
    }
    @Override public final void memcpy(long src, int[] dst, int offset, int size) {
        checkMemcpy(src, offset, size, dst.length);
        memcpy(src, dst, BASE_OFFSET_INT + apiGetBytes(offset, 2), apiGetBytes(size, 2));
    }
    @Override public final void memcpy(long src, long[] dst, int offset, int size) {
        checkMemcpy(src, offset, size, dst.length);
        memcpy(src, dst, BASE_OFFSET_LONG + apiGetBytes(offset, 3), apiGetBytes(size, 3));
    }
    @Override public final void memcpy(long src, float[] dst, int offset, int size) {
        checkMemcpy(src, offset, size, dst.length);
        memcpy(src, dst, BASE_OFFSET_FLOAT + apiGetBytes(offset, 2), apiGetBytes(size, 2));
    }
    @Override public final void memcpy(long src, double[] dst, int offset, int size) {
        checkMemcpy(src, offset, size, dst.length);
        memcpy(src, dst, BASE_OFFSET_DOUBLE + apiGetBytes(offset, 3), apiGetBytes(size, 3));
    }

    // The Charset constructor is inefficient until JDK 17.
    @SuppressWarnings("deprecation")
    @Override public String getStringASCII(long source, int length) {
        byte[] bytes = length <= ARRAY_TLC_SIZE ? ARRAY_TLC_BYTE.get() : new byte[length];
        memcpy(source, bytes, BASE_OFFSET_BYTE, length);
        return new String(bytes, 0, 0, length);
    }

    // The default implementation is inefficient without Compact Strings on JDK 8.
    @Override public String getStringUTF8(long source, int length) {
        char[] string = length <= ARRAY_TLC_SIZE ? ARRAY_TLC_CHAR.get() : new char[length];

        int i = 0, position = 0;

        while (position < length) {
            char c;

            int b0 = UNSAFE.getByte(null, source + position++) & 0xFF;
            if (b0 < 0x80) {
                c = (char)b0;
            } else {
                int b1 = UNSAFE.getByte(null, source + position++) & 0x3F;
                if ((b0 & 0xE0) == 0xC0) {
                    c = (char)(((b0 & 0x1F) << 6) | b1);
                } else {
                    int b2 = UNSAFE.getByte(null, source + position++) & 0x3F;
                    if ((b0 & 0xF0) == 0xE0) {
                        c = (char)(((b0 & 0x0F) << 12) | (b1 << 6) | b2);
                    } else {
                        int b3 = UNSAFE.getByte(null, source + position++) & 0x3F;
                        int cp = ((b0 & 0x07) << 18) | (b1 << 12) | (b2 << 6) | b3;

                        if (i < length) {
                            string[i++] = (char)((cp >>> 10) + 0xD7C0);
                        }
                        c = (char)((cp & 0x3FF) + 0xDC00);
                    }
                }
            }
            if (i < length) {
                string[i++] = c;
            }
        }

        return new String(string, 0, Math.min(i, length));
    }

    @Override public void putStringASCII(String text, boolean nullTerminated, long target) {
        int length = text.length();

        char[] chars = (char @NonNull [])UNSAFE.getObject(text, STRING_VALUE);

        int i = 0;
        for (; i <= length - 4; i += 4) {
            long v = UNSAFE.getLong(chars, Unsafe.ARRAY_CHAR_BASE_OFFSET + ((long)i << 1));

            v &= 0x00FF_00FF_00FF_00FFL;
            v = (v | (v >>> 8)) & 0x0000_FFFF_0000_FFFFL;
            v = (v | (v >>> 16));

            putIntUnaligned(target + i, (int)v);
            //UNSAFE.putIntUnaligned(null, target + i, (int)Long.compress(l, 0x00FF_00FF_00FF_00FFL));
        }
        for (; i < length; i++) {
            UNSAFE.putByte(null, target + i, (byte)text.charAt(i));
        }

        if (nullTerminated) {
            UNSAFE.putByte(null, target + length, (byte)0);
        }
    }

    @Override public final void putStringASCII(CharSequence text, boolean nullTerminated, long target) {
        int length = text.length();
        for (int i = 0; i < length; i++) {
            UNSAFE.putByte(null, target + i, (byte)text.charAt(i));
        }
        if (nullTerminated) {
            UNSAFE.putByte(null, target + length, (byte)0);
        }
    }

    @Override public ByteBuffer allocateUTF8(String text, boolean nullTerminated, MemoryAllocator allocator) {
        return allocateUTF8(text.getBytes(UTF_8), nullTerminated, allocator);
    }
    protected final ByteBuffer allocateUTF8(byte[] bytes, boolean nullTerminated, MemoryAllocator allocator) {
        int  length = memLengthNT1(bytes, nullTerminated);
        long target = allocator.malloc(length);
        if (CHECKS && target == NULL) {
            throw new OutOfMemoryError();
        }

        memcpy(bytes, target, BASE_OFFSET_BYTE, bytes.length);
        if (nullTerminated) {
            UNSAFE.putByte(null, target + bytes.length, (byte)0);
        }

        return wrapBufferByte(target, length);
    }

    @Override public int putStringUTF8(String text, boolean nullTerminated, long target, int maxLength) {
        byte[] bytes = text.getBytes(UTF_8);

        int length = memLengthNT1(bytes, nullTerminated);
        if (maxLength < length) {
            throw new BufferOverflowException();
        }

        memcpy(bytes, target, BASE_OFFSET_BYTE, bytes.length);
        if (nullTerminated) {
            UNSAFE.putByte(null, target + bytes.length, (byte)0);
        }
        return length;
    }
    @Override public final void putStringUTF8(CharSequence text, boolean nullTerminated, long target) {
        int p = 0, i = 0, len = text.length();

        while (i < len) {
            char c = text.charAt(i++);
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

    /*default void putStringUTF16(String text, boolean nullTerminated, long target) {
        byte[] bytes = text.getBytes(StandardCharsets.UTF_16);
        memcpy(bytes, target, BASE_OFFSET_BYTE, bytes.length);
        if (nullTerminated) {
            putChar(target + bytes.length, '\0');
        }
    }*/

    @Override public void putStringUTF16(String text, boolean nullTerminated, long target) {
        char[] chars  = (char @NonNull [])UNSAFE.getObject(text, STRING_VALUE);
        long   length = apiGetBytes(chars.length, 1);
        UNSAFE.copyMemory(chars, BASE_OFFSET_CHAR, null, target, length);
        if (nullTerminated) {
            UNSAFE.putChar(null, target + length, '\0');
        }
    }
    @Override public final void putStringUTF16(CharSequence text, boolean nullTerminated, long target) {
        int length = text.length();
        for (int i = 0; i < length; i++) {
            UNSAFE.putChar(null, target + ((long)i << 1), text.charAt(i));
        }
        if (nullTerminated) {
            UNSAFE.putChar(null, target + ((long)length << 1), '\0');
        }
    }

    // ------------------------

    protected static ByteBuffer slice(ByteBuffer source, long address, int capacity) {
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

        Object attachment = UNSAFE.getObject(source, PARENT_BYTE);
        UNSAFE.putObject(target, PARENT_BYTE, attachment == null ? source : attachment);

        return target.order(source.order());
    }

    @SuppressWarnings("unchecked")
    protected static <T extends Buffer> T slice(Class<? extends T> clazz, T source, long address, int capacity, long attachmentOffset) {
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

        UNSAFE.putObject(target, attachmentOffset, UNSAFE.getObject(source, attachmentOffset));

        return target;
    }

    @SuppressWarnings("unchecked")
    protected static <T extends Buffer> T duplicate(Class<? extends T> clazz, T source, long attachmentOffset) {
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

        UNSAFE.putObject(target, attachmentOffset, UNSAFE.getObject(source, attachmentOffset));

        return target;
    }

    private static sun.misc.Unsafe getUnsafeInstance() {
        java.lang.reflect.Field[] fields = sun.misc.Unsafe.class.getDeclaredFields();

        /*
        Different runtimes use different names for the Unsafe singleton,
        so we cannot use .getDeclaredField and we scan instead. For example:

        Oracle: theUnsafe
        PERC : m_unsafe_instance
        Android: THE_ONE
        */
        for (java.lang.reflect.Field field : fields) {
            if (!field.getType().equals(sun.misc.Unsafe.class)) {
                continue;
            }

            int modifiers = field.getModifiers();
            if (!(java.lang.reflect.Modifier.isStatic(modifiers) && java.lang.reflect.Modifier.isFinal(modifiers))) {
                continue;
            }

            try {
                field.setAccessible(true);
                return (sun.misc.Unsafe)field.get(null);
            } catch (Exception ignored) {
            }
            break;
        }

        throw new UnsupportedOperationException("LWJGL requires sun.misc.Unsafe to be available.");
    }

    private static final int MAGIC_CAPACITY = 0x0D15EA5E;
    private static final int MAGIC_POSITION = 0x00FACADE;

    private static long getAddressOffset() {
        long MAGIC_ADDRESS = 0xDEADBEEF8BADF00DL & (BITS32 ? 0xFFFF_FFFFL : 0xFFFF_FFFF_FFFF_FFFFL);

        ByteBuffer bb = Objects.requireNonNull(NewDirectByteBuffer(MAGIC_ADDRESS, 0));

        return getFieldOffset(bb.getClass(), long.class, offset -> UNSAFE.getLong(bb, offset) == MAGIC_ADDRESS);
    }

    private static long getMarkOffset() {
        ByteBuffer bb = Objects.requireNonNull(NewDirectByteBuffer(1L, 0));
        return getFieldOffsetInt(bb, -1);
    }

    private static long getPositionOffset() {
        ByteBuffer bb = Objects.requireNonNull(NewDirectByteBuffer(-1L, MAGIC_CAPACITY));
        bb.position(MAGIC_POSITION);
        return getFieldOffsetInt(bb, MAGIC_POSITION);
    }

    private static long getLimitOffset() {
        ByteBuffer bb = Objects.requireNonNull(NewDirectByteBuffer(-1L, MAGIC_CAPACITY));
        bb.limit(MAGIC_POSITION);
        return getFieldOffsetInt(bb, MAGIC_POSITION);
    }

    private static long getCapacityOffset() {
        ByteBuffer bb = Objects.requireNonNull(NewDirectByteBuffer(-1L, MAGIC_CAPACITY));
        bb.limit(0);
        return getFieldOffsetInt(bb, MAGIC_CAPACITY);
    }

    private static long getFieldOffsetInt(Object container, int value) {
        return getFieldOffset(container.getClass(), int.class, offset -> UNSAFE.getInt(container, offset) == value);
    }

    protected static long getFieldOffsetObject(Object container, Object value) {
        return getFieldOffset(container.getClass(), value.getClass(), offset -> UNSAFE.getObject(container, offset) == value);
    }

    private static long getFieldOffset(Class<?> containerType, Class<?> fieldType, LongPredicate predicate) {
        Class<?> c = containerType;
        while (c != Object.class) {
            Field[] fields = c.getDeclaredFields();
            for (Field field : fields) {
                if (!field.getType().isAssignableFrom(fieldType) || Modifier.isStatic(field.getModifiers()) || field.isSynthetic()) {
                    continue;
                }

                long offset = UNSAFE.objectFieldOffset(field);
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

    static final class P64CL32 extends MemoryBackendUnsafeLegacy {
        @Override public long getCLong(long ptr)                      { return UNSAFE.getInt(null, ptr); }
        @Override public long getCLongUnaligned(long ptr)             { return getIntUnaligned(ptr); }

        @Override public void putCLong(long ptr, long value)          { UNSAFE.putInt(null, ptr, (int)value); }
        @Override public void putCLongUnaligned(long ptr, long value) { putIntUnaligned(ptr, (int)value); }
    }

    static final class P32 extends MemoryBackendUnsafeLegacy {
        @Override public long getCLong(long ptr)                        { return UNSAFE.getInt(null, ptr); }
        @Override public long getCLongUnaligned(long ptr)               { return getIntUnaligned(ptr); }

        @Override public long getAddress(long ptr)                      { return UNSAFE.getInt(null, ptr) & 0xFFFF_FFFFL; }
        @Override public long getAddressUnaligned(long ptr)             { return getIntUnaligned(ptr) & 0xFFFF_FFFFL; }

        @Override public void putCLong(long ptr, long value)            { UNSAFE.putInt(null, ptr, (int)value); }
        @Override public void putCLongUnaligned(long ptr, long value)   { putIntUnaligned(ptr, (int)value); }

        @Override public void putAddress(long ptr, long value)          { UNSAFE.putInt(null, ptr, (int)value); }
        @Override public void putAddressUnaligned(long ptr, long value) { putIntUnaligned(ptr, (int)value); }
    }

    private static final int SHIFT_B2S_0 = NATIVE_ORDER == ByteOrder.BIG_ENDIAN ? 8 : 0;
    private static final int SHIFT_B2S_1 = NATIVE_ORDER == ByteOrder.BIG_ENDIAN ? 0 : 8;

    private static final int SHIFT_S2I_0 = NATIVE_ORDER == ByteOrder.BIG_ENDIAN ? 16 : 0;
    private static final int SHIFT_S2I_1 = NATIVE_ORDER == ByteOrder.BIG_ENDIAN ? 0 : 16;

    private static final int SHIFT_B2I_0 = NATIVE_ORDER == ByteOrder.BIG_ENDIAN ? 24 : 0;
    private static final int SHIFT_B2I_1 = NATIVE_ORDER == ByteOrder.BIG_ENDIAN ? 16 : 8;
    private static final int SHIFT_B2I_2 = NATIVE_ORDER == ByteOrder.BIG_ENDIAN ? 8 : 16;
    private static final int SHIFT_B2I_3 = NATIVE_ORDER == ByteOrder.BIG_ENDIAN ? 0 : 24;

    private static final int SHIFT_I2L_0 = NATIVE_ORDER == ByteOrder.BIG_ENDIAN ? 32 : 0;
    private static final int SHIFT_I2L_1 = NATIVE_ORDER == ByteOrder.BIG_ENDIAN ? 0 : 32;

    private static final int SHIFT_S2L_0 = NATIVE_ORDER == ByteOrder.BIG_ENDIAN ? 48 : 0;
    private static final int SHIFT_S2L_1 = NATIVE_ORDER == ByteOrder.BIG_ENDIAN ? 32 : 16;
    private static final int SHIFT_S2L_2 = NATIVE_ORDER == ByteOrder.BIG_ENDIAN ? 16 : 32;
    private static final int SHIFT_S2L_3 = NATIVE_ORDER == ByteOrder.BIG_ENDIAN ? 0 : 48;

    private static final int SHIFT_B2L_0 = NATIVE_ORDER == ByteOrder.BIG_ENDIAN ? 56 : 0;
    private static final int SHIFT_B2L_1 = NATIVE_ORDER == ByteOrder.BIG_ENDIAN ? 48 : 8;
    private static final int SHIFT_B2L_2 = NATIVE_ORDER == ByteOrder.BIG_ENDIAN ? 40 : 16;
    private static final int SHIFT_B2L_3 = NATIVE_ORDER == ByteOrder.BIG_ENDIAN ? 32 : 24;
    private static final int SHIFT_B2L_4 = NATIVE_ORDER == ByteOrder.BIG_ENDIAN ? 24 : 32;
    private static final int SHIFT_B2L_5 = NATIVE_ORDER == ByteOrder.BIG_ENDIAN ? 16 : 40;
    private static final int SHIFT_B2L_6 = NATIVE_ORDER == ByteOrder.BIG_ENDIAN ? 8 : 48;
    private static final int SHIFT_B2L_7 = NATIVE_ORDER == ByteOrder.BIG_ENDIAN ? 0 : 56;

    protected static char byteBitsToChar(long ptr) {
        int b0 = UNSAFE.getByte(null, ptr) & 0xFF;
        int b1 = UNSAFE.getByte(null, ptr + 1L) & 0xFF;
        return (char)(
            (b1 << SHIFT_B2S_1) |
            (b0 << SHIFT_B2S_0)
        );
    }

    protected static short byteBitsToShort(long ptr) {
        int b0 = UNSAFE.getByte(null, ptr) & 0xFF;
        int b1 = UNSAFE.getByte(null, ptr + 1L) & 0xFF;
        return (short)(
            (b1 << SHIFT_B2S_1) |
            (b0 << SHIFT_B2S_0)
        );
    }

    protected static int bitsToInt(long ptr) {
        if ((ptr & 1L) == 0L) {
            return shortBitsToInt(ptr);
        } else {
            return byteBitsToInt(ptr);
        }
    }
    private static int shortBitsToInt(long ptr) {
        int s0 = UNSAFE.getShort(null, ptr) & 0xFFFF;
        int s1 = UNSAFE.getShort(null, ptr + 2L) & 0xFFFF;
        return (s1 << SHIFT_S2I_1) |
               (s0 << SHIFT_S2I_0);
    }
    private static int byteBitsToInt(long ptr) {
        int b0 = UNSAFE.getByte(null, ptr) & 0xFF;
        int b1 = UNSAFE.getByte(null, ptr + 1L) & 0xFF;
        int b2 = UNSAFE.getByte(null, ptr + 2L) & 0xFF;
        int b3 = UNSAFE.getByte(null, ptr + 3L) & 0xFF;
        return (b3 << SHIFT_B2I_3) |
               (b2 << SHIFT_B2I_2) |
               (b1 << SHIFT_B2I_1) |
               (b0 << SHIFT_B2I_0);
    }

    protected static long bitsToLong(long ptr) {
        if ((ptr & 3L) == 0L) {
            return intBitsToLong(ptr);
        } else if ((ptr & 1L) == 0L) {
            return shortBitsToLong(ptr);
        } else {
            return byteBitsToLong(ptr);
        }
    }
    private static long intBitsToLong(long ptr) {
        long i0 = UNSAFE.getInt(null, ptr) & 0xFFFF_FFFFL;
        long i1 = UNSAFE.getInt(null, ptr + 4L) & 0xFFFF_FFFFL;
        return (i1 << SHIFT_I2L_1) |
               (i0 << SHIFT_I2L_0);
    }
    private static long shortBitsToLong(long ptr) {
        long s0 = UNSAFE.getShort(null, ptr) & 0xFFFFL;
        long s1 = UNSAFE.getShort(null, ptr + 2L) & 0xFFFFL;
        long s2 = UNSAFE.getShort(null, ptr + 4L) & 0xFFFFL;
        long s3 = UNSAFE.getShort(null, ptr + 6L) & 0xFFFFL;
        return (s3 << SHIFT_S2L_3) |
               (s2 << SHIFT_S2L_2) |
               (s1 << SHIFT_S2L_1) |
               (s0 << SHIFT_S2L_0);
    }
    private static long byteBitsToLong(long ptr) {
        long b0 = UNSAFE.getByte(null, ptr) & 0xFFL;
        long b1 = UNSAFE.getByte(null, ptr + 1L) & 0xFFL;
        long b2 = UNSAFE.getByte(null, ptr + 2L) & 0xFFL;
        long b3 = UNSAFE.getByte(null, ptr + 3L) & 0xFFL;
        long b4 = UNSAFE.getByte(null, ptr + 4L) & 0xFFL;
        long b5 = UNSAFE.getByte(null, ptr + 5L) & 0xFFL;
        long b6 = UNSAFE.getByte(null, ptr + 6L) & 0xFFL;
        long b7 = UNSAFE.getByte(null, ptr + 7L) & 0xFFL;
        return (b7 << SHIFT_B2L_7) |
               (b6 << SHIFT_B2L_6) |
               (b5 << SHIFT_B2L_5) |
               (b4 << SHIFT_B2L_4) |
               (b3 << SHIFT_B2L_3) |
               (b2 << SHIFT_B2L_2) |
               (b1 << SHIFT_B2L_1) |
               (b0 << SHIFT_B2L_0);
    }

    protected static void charToByteBits(long ptr, char value) {
        UNSAFE.putByte(null, ptr, (byte)(value >>> SHIFT_B2S_0));
        UNSAFE.putByte(null, ptr + 1L, (byte)(value >>> SHIFT_B2S_1));
    }

    protected static void shortToByteBits(long ptr, short value) {
        UNSAFE.putByte(null, ptr, (byte)(value >>> SHIFT_B2S_0));
        UNSAFE.putByte(null, ptr + 1L, (byte)(value >>> SHIFT_B2S_1));
    }

    protected static void intToBits(long ptr, int value) {
        if ((ptr & 1L) == 0L) {
            intToShortBits(ptr, value);
        } else {
            intToByteBits(ptr, value);
        }
    }
    private static void intToShortBits(long ptr, int value) {
        UNSAFE.putShort(null, ptr, (short)(value >>> SHIFT_S2I_0));
        UNSAFE.putShort(null, ptr + 2L, (short)(value >>> SHIFT_S2I_1));
    }
    private static void intToByteBits(long ptr, int value) {
        UNSAFE.putByte(null, ptr, (byte)(value >>> SHIFT_B2I_0));
        UNSAFE.putByte(null, ptr + 1L, (byte)(value >>> SHIFT_B2I_1));
        UNSAFE.putByte(null, ptr + 2L, (byte)(value >>> SHIFT_B2I_2));
        UNSAFE.putByte(null, ptr + 3L, (byte)(value >>> SHIFT_B2I_3));
    }

    protected static void longToBits(long ptr, long value) {
        if ((ptr & 3L) == 0L) {
            longToIntBits(ptr, value);
        } else if ((ptr & 1L) == 0L) {
            longToShortBits(ptr, value);
        } else {
            longToByteBits(ptr, value);
        }
    }
    private static void longToIntBits(long ptr, long value) {
        UNSAFE.putInt(null, ptr, (int)(value >>> SHIFT_I2L_0));
        UNSAFE.putInt(null, ptr + 4L, (int)(value >>> SHIFT_I2L_1));
    }
    private static void longToShortBits(long ptr, long value) {
        UNSAFE.putShort(null, ptr, (short)(value >>> SHIFT_S2L_0));
        UNSAFE.putShort(null, ptr + 2L, (short)(value >>> SHIFT_S2L_1));
        UNSAFE.putShort(null, ptr + 4L, (short)(value >>> SHIFT_S2L_2));
        UNSAFE.putShort(null, ptr + 6L, (short)(value >>> SHIFT_S2L_3));
    }
    private static void longToByteBits(long ptr, long value) {
        UNSAFE.putByte(null, ptr, (byte)(value >>> SHIFT_B2L_0));
        UNSAFE.putByte(null, ptr + 1L, (byte)(value >>> SHIFT_B2L_1));
        UNSAFE.putByte(null, ptr + 2L, (byte)(value >>> SHIFT_B2L_2));
        UNSAFE.putByte(null, ptr + 3L, (byte)(value >>> SHIFT_B2L_3));
        UNSAFE.putByte(null, ptr + 4L, (byte)(value >>> SHIFT_B2L_4));
        UNSAFE.putByte(null, ptr + 5L, (byte)(value >>> SHIFT_B2L_5));
        UNSAFE.putByte(null, ptr + 6L, (byte)(value >>> SHIFT_B2L_6));
        UNSAFE.putByte(null, ptr + 7L, (byte)(value >>> SHIFT_B2L_7));
    }

}