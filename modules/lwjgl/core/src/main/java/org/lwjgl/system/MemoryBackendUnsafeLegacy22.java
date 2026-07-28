/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.jspecify.annotations.*;

import java.lang.reflect.*;
import java.nio.*;

import static org.lwjgl.system.Checks.*;

// Use reflection to call MemorySegment methods, so that we can build in core module
class MemoryBackendUnsafeLegacy22 extends MemoryBackendUnsafeLegacy17 {

    private static final long SEGMENT;

    static {
        try {
            Class<?> MemorySegment = Class.forName("java.lang.foreign.MemorySegment");

            Method ofBuffer     = MemorySegment.getDeclaredMethod("ofBuffer", Buffer.class);
            Method asByteBuffer = MemorySegment.getDeclaredMethod("asByteBuffer");

            ByteBuffer bb = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

            Object segment = ofBuffer.invoke(null, bb);

            SEGMENT = getFieldOffsetObject(asByteBuffer.invoke(segment), segment);
        } catch (Throwable t) {
            throw new UnsupportedOperationException(t);
        }
    }

    private static void checkSegment(Buffer buffer) {
        if (UNSAFE.getObject(buffer, SEGMENT) != null) {
            throw new UnsupportedOperationException();
        }
    }
    @Override public ByteBuffer duplicate(ByteBuffer buffer) {
        if (DEBUG) {
            checkSegment(buffer);
        }
        return super.duplicate(buffer);
    }
    @Override public CharBuffer duplicate(CharBuffer buffer) {
        if (DEBUG) {
            checkSegment(buffer);
        }
        return duplicate(BUFFER_CHAR, buffer, PARENT_CHAR);
    }
    @Override public ShortBuffer duplicate(ShortBuffer buffer) {
        if (DEBUG) {
            checkSegment(buffer);
        }
        return duplicate(BUFFER_SHORT, buffer, PARENT_SHORT);
    }
    @Override public IntBuffer duplicate(IntBuffer buffer) {
        if (DEBUG) {
            checkSegment(buffer);
        }
        return duplicate(BUFFER_INT, buffer, PARENT_INT);
    }
    @Override public LongBuffer duplicate(LongBuffer buffer) {
        if (DEBUG) {
            checkSegment(buffer);
        }
        return duplicate(BUFFER_LONG, buffer, PARENT_LONG);
    }
    @Override public FloatBuffer duplicate(FloatBuffer buffer) {
        if (DEBUG) {
            checkSegment(buffer);
        }
        return duplicate(BUFFER_FLOAT, buffer, PARENT_FLOAT);
    }
    @Override public DoubleBuffer duplicate(DoubleBuffer buffer) {
        if (DEBUG) {
            checkSegment(buffer);
        }
        return duplicate(BUFFER_DOUBLE, buffer, PARENT_DOUBLE);
    }
    @Override public ByteBuffer slice(ByteBuffer buffer) {
        if (DEBUG) {
            checkSegment(buffer);
        }
        return slice(buffer, getAddress0(buffer) + buffer.position(), buffer.remaining());
    }
    @Override public ByteBuffer slice(ByteBuffer buffer, int offset, int length) {
        if (DEBUG) {
            checkSegment(buffer);
        }
        return super.slice(buffer, offset, length);
    }
    @Override public CharBuffer slice(CharBuffer buffer) {
        if (DEBUG) {
            checkSegment(buffer);
        }
        return slice(BUFFER_CHAR, buffer, address(buffer.position(), 1, getAddress0(buffer)), buffer.remaining(), PARENT_CHAR);
    }
    @Override public CharBuffer slice(CharBuffer buffer, int offset, int length) {
        if (DEBUG) {
            checkSegment(buffer);
        }
        return super.slice(buffer, offset, length);
    }
    @Override public ShortBuffer slice(ShortBuffer buffer) {
        if (DEBUG) {
            checkSegment(buffer);
        }
        return slice(BUFFER_SHORT, buffer, address(buffer.position(), 1, getAddress0(buffer)), buffer.remaining(), PARENT_SHORT);
    }
    @Override public ShortBuffer slice(ShortBuffer buffer, int offset, int length) {
        if (DEBUG) {
            checkSegment(buffer);
        }
        return super.slice(buffer, offset, length);
    }
    @Override public IntBuffer slice(IntBuffer buffer) {
        if (DEBUG) {
            checkSegment(buffer);
        }
        return slice(BUFFER_INT, buffer, address(buffer.position(), 2, getAddress0(buffer)), buffer.remaining(), PARENT_INT);
    }
    @Override public IntBuffer slice(IntBuffer buffer, int offset, int length) {
        if (DEBUG) {
            checkSegment(buffer);
        }
        return super.slice(buffer, offset, length);
    }
    @Override public LongBuffer slice(LongBuffer buffer) {
        if (DEBUG) {
            checkSegment(buffer);
        }
        return slice(BUFFER_LONG, buffer, address(buffer.position(), 3, getAddress0(buffer)), buffer.remaining(), PARENT_LONG);
    }
    @Override public LongBuffer slice(LongBuffer buffer, int offset, int length) {
        if (DEBUG) {
            checkSegment(buffer);
        }
        return super.slice(buffer, offset, length);
    }
    @Override public FloatBuffer slice(FloatBuffer buffer) {
        if (DEBUG) {
            checkSegment(buffer);
        }
        return slice(BUFFER_FLOAT, buffer, address(buffer.position(), 2, getAddress0(buffer)), buffer.remaining(), PARENT_FLOAT);
    }
    @Override public FloatBuffer slice(FloatBuffer buffer, int offset, int length) {
        if (DEBUG) {
            checkSegment(buffer);
        }
        return super.slice(buffer, offset, length);
    }
    @Override public DoubleBuffer slice(DoubleBuffer buffer) {
        if (DEBUG) {
            checkSegment(buffer);
        }
        return slice(BUFFER_DOUBLE, buffer, address(buffer.position(), 3, getAddress0(buffer)), buffer.remaining(), PARENT_DOUBLE);
    }
    @Override public DoubleBuffer slice(DoubleBuffer buffer, int offset, int length) {
        if (DEBUG) {
            checkSegment(buffer);
        }
        return super.slice(buffer, offset, length);
    }

// ----------------------------------------------
    // ----------------------------------------------
    // ----------------------------------------------

    static final class P64CL32 extends MemoryBackendUnsafeLegacy22 {
        @Override public long getCLong(long ptr)                      { return UNSAFE.getInt(null, ptr); }
        @Override public long getCLongUnaligned(long ptr)             { return getIntUnaligned(ptr); }

        @Override public void putCLong(long ptr, long value)          { UNSAFE.putInt(null, ptr, (int)value); }
        @Override public void putCLongUnaligned(long ptr, long value) { putIntUnaligned(ptr, (int)value); }
    }

    static final class P32 extends MemoryBackendUnsafeLegacy22 {
        @Override public long getCLong(long ptr)                        { return UNSAFE.getInt(null, ptr); }
        @Override public long getCLongUnaligned(long ptr)               { return getIntUnaligned(ptr); }

        @Override public long getAddress(long ptr)                      { return UNSAFE.getInt(null, ptr) & 0xFFFF_FFFFL; }
        @Override public long getAddressUnaligned(long ptr)             { return getIntUnaligned(ptr) & 0xFFFF_FFFFL; }

        @Override public void putCLong(long ptr, long value)            { UNSAFE.putInt(null, ptr, (int)value); }
        @Override public void putCLongUnaligned(long ptr, long value)   { putIntUnaligned(ptr, (int)value); }

        @Override public void putAddress(long ptr, long value)          { UNSAFE.putInt(null, ptr, (int)value); }
        @Override public void putAddressUnaligned(long ptr, long value) { putIntUnaligned(ptr, (int)value); }
    }

}