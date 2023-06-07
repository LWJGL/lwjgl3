/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.remotery;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * A property value as a union of all its possible types.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * union rmtPropertyValue {
 *     rmtBool Bool;
 *     rmtS32 S32;
 *     rmtU32 U32;
 *     rmtF32 F32;
 *     rmtS64 S64;
 *     rmtU64 U64;
 *     rmtF64 F64;
 * }</code></pre>
 */
@NativeType("union rmtPropertyValue")
public class RMTPropertyValue extends Struct<RMTPropertyValue> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BOOL,
        S32,
        U32,
        F32,
        S64,
        U64,
        F64;

    static {
        Layout layout = __union(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BOOL = layout.offsetof(0);
        S32 = layout.offsetof(1);
        U32 = layout.offsetof(2);
        F32 = layout.offsetof(3);
        S64 = layout.offsetof(4);
        U64 = layout.offsetof(5);
        F64 = layout.offsetof(6);
    }

    protected RMTPropertyValue(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected RMTPropertyValue create(long address, @Nullable ByteBuffer container) {
        return new RMTPropertyValue(address, container);
    }

    /**
     * Creates a {@code RMTPropertyValue} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public RMTPropertyValue(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code Bool} field. */
    @NativeType("rmtBool")
    public boolean Bool() { return nBool(address()) != 0; }
    /** @return the value of the {@code S32} field. */
    @NativeType("rmtS32")
    public int S32() { return nS32(address()); }
    /** @return the value of the {@code U32} field. */
    @NativeType("rmtU32")
    public int U32() { return nU32(address()); }
    /** @return the value of the {@code F32} field. */
    @NativeType("rmtF32")
    public float F32() { return nF32(address()); }
    /** @return the value of the {@code S64} field. */
    @NativeType("rmtS64")
    public long S64() { return nS64(address()); }
    /** @return the value of the {@code U64} field. */
    @NativeType("rmtU64")
    public long U64() { return nU64(address()); }
    /** @return the value of the {@code F64} field. */
    @NativeType("rmtF64")
    public double F64() { return nF64(address()); }

    /** Sets the specified value to the {@code Bool} field. */
    public RMTPropertyValue Bool(@NativeType("rmtBool") boolean value) { nBool(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code S32} field. */
    public RMTPropertyValue S32(@NativeType("rmtS32") int value) { nS32(address(), value); return this; }
    /** Sets the specified value to the {@code U32} field. */
    public RMTPropertyValue U32(@NativeType("rmtU32") int value) { nU32(address(), value); return this; }
    /** Sets the specified value to the {@code F32} field. */
    public RMTPropertyValue F32(@NativeType("rmtF32") float value) { nF32(address(), value); return this; }
    /** Sets the specified value to the {@code S64} field. */
    public RMTPropertyValue S64(@NativeType("rmtS64") long value) { nS64(address(), value); return this; }
    /** Sets the specified value to the {@code U64} field. */
    public RMTPropertyValue U64(@NativeType("rmtU64") long value) { nU64(address(), value); return this; }
    /** Sets the specified value to the {@code F64} field. */
    public RMTPropertyValue F64(@NativeType("rmtF64") double value) { nF64(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public RMTPropertyValue set(RMTPropertyValue src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code RMTPropertyValue} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static RMTPropertyValue malloc() {
        return new RMTPropertyValue(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code RMTPropertyValue} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static RMTPropertyValue calloc() {
        return new RMTPropertyValue(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code RMTPropertyValue} instance allocated with {@link BufferUtils}. */
    public static RMTPropertyValue create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new RMTPropertyValue(memAddress(container), container);
    }

    /** Returns a new {@code RMTPropertyValue} instance for the specified memory address. */
    public static RMTPropertyValue create(long address) {
        return new RMTPropertyValue(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static RMTPropertyValue createSafe(long address) {
        return address == NULL ? null : new RMTPropertyValue(address, null);
    }

    /**
     * Returns a new {@link RMTPropertyValue.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static RMTPropertyValue.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link RMTPropertyValue.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static RMTPropertyValue.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RMTPropertyValue.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static RMTPropertyValue.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link RMTPropertyValue.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static RMTPropertyValue.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static RMTPropertyValue.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code RMTPropertyValue} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static RMTPropertyValue malloc(MemoryStack stack) {
        return new RMTPropertyValue(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code RMTPropertyValue} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static RMTPropertyValue calloc(MemoryStack stack) {
        return new RMTPropertyValue(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link RMTPropertyValue.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static RMTPropertyValue.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RMTPropertyValue.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static RMTPropertyValue.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Bool}. */
    public static int nBool(long struct) { return UNSAFE.getInt(null, struct + RMTPropertyValue.BOOL); }
    /** Unsafe version of {@link #S32}. */
    public static int nS32(long struct) { return UNSAFE.getInt(null, struct + RMTPropertyValue.S32); }
    /** Unsafe version of {@link #U32}. */
    public static int nU32(long struct) { return UNSAFE.getInt(null, struct + RMTPropertyValue.U32); }
    /** Unsafe version of {@link #F32}. */
    public static float nF32(long struct) { return UNSAFE.getFloat(null, struct + RMTPropertyValue.F32); }
    /** Unsafe version of {@link #S64}. */
    public static long nS64(long struct) { return UNSAFE.getLong(null, struct + RMTPropertyValue.S64); }
    /** Unsafe version of {@link #U64}. */
    public static long nU64(long struct) { return UNSAFE.getLong(null, struct + RMTPropertyValue.U64); }
    /** Unsafe version of {@link #F64}. */
    public static double nF64(long struct) { return UNSAFE.getDouble(null, struct + RMTPropertyValue.F64); }

    /** Unsafe version of {@link #Bool(boolean) Bool}. */
    public static void nBool(long struct, int value) { UNSAFE.putInt(null, struct + RMTPropertyValue.BOOL, value); }
    /** Unsafe version of {@link #S32(int) S32}. */
    public static void nS32(long struct, int value) { UNSAFE.putInt(null, struct + RMTPropertyValue.S32, value); }
    /** Unsafe version of {@link #U32(int) U32}. */
    public static void nU32(long struct, int value) { UNSAFE.putInt(null, struct + RMTPropertyValue.U32, value); }
    /** Unsafe version of {@link #F32(float) F32}. */
    public static void nF32(long struct, float value) { UNSAFE.putFloat(null, struct + RMTPropertyValue.F32, value); }
    /** Unsafe version of {@link #S64(long) S64}. */
    public static void nS64(long struct, long value) { UNSAFE.putLong(null, struct + RMTPropertyValue.S64, value); }
    /** Unsafe version of {@link #U64(long) U64}. */
    public static void nU64(long struct, long value) { UNSAFE.putLong(null, struct + RMTPropertyValue.U64, value); }
    /** Unsafe version of {@link #F64(double) F64}. */
    public static void nF64(long struct, double value) { UNSAFE.putDouble(null, struct + RMTPropertyValue.F64, value); }

    // -----------------------------------

    /** An array of {@link RMTPropertyValue} structs. */
    public static class Buffer extends StructBuffer<RMTPropertyValue, Buffer> implements NativeResource {

        private static final RMTPropertyValue ELEMENT_FACTORY = RMTPropertyValue.create(-1L);

        /**
         * Creates a new {@code RMTPropertyValue.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link RMTPropertyValue#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected RMTPropertyValue getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code Bool} field. */
        @NativeType("rmtBool")
        public boolean Bool() { return RMTPropertyValue.nBool(address()) != 0; }
        /** @return the value of the {@code S32} field. */
        @NativeType("rmtS32")
        public int S32() { return RMTPropertyValue.nS32(address()); }
        /** @return the value of the {@code U32} field. */
        @NativeType("rmtU32")
        public int U32() { return RMTPropertyValue.nU32(address()); }
        /** @return the value of the {@code F32} field. */
        @NativeType("rmtF32")
        public float F32() { return RMTPropertyValue.nF32(address()); }
        /** @return the value of the {@code S64} field. */
        @NativeType("rmtS64")
        public long S64() { return RMTPropertyValue.nS64(address()); }
        /** @return the value of the {@code U64} field. */
        @NativeType("rmtU64")
        public long U64() { return RMTPropertyValue.nU64(address()); }
        /** @return the value of the {@code F64} field. */
        @NativeType("rmtF64")
        public double F64() { return RMTPropertyValue.nF64(address()); }

        /** Sets the specified value to the {@code Bool} field. */
        public RMTPropertyValue.Buffer Bool(@NativeType("rmtBool") boolean value) { RMTPropertyValue.nBool(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code S32} field. */
        public RMTPropertyValue.Buffer S32(@NativeType("rmtS32") int value) { RMTPropertyValue.nS32(address(), value); return this; }
        /** Sets the specified value to the {@code U32} field. */
        public RMTPropertyValue.Buffer U32(@NativeType("rmtU32") int value) { RMTPropertyValue.nU32(address(), value); return this; }
        /** Sets the specified value to the {@code F32} field. */
        public RMTPropertyValue.Buffer F32(@NativeType("rmtF32") float value) { RMTPropertyValue.nF32(address(), value); return this; }
        /** Sets the specified value to the {@code S64} field. */
        public RMTPropertyValue.Buffer S64(@NativeType("rmtS64") long value) { RMTPropertyValue.nS64(address(), value); return this; }
        /** Sets the specified value to the {@code U64} field. */
        public RMTPropertyValue.Buffer U64(@NativeType("rmtU64") long value) { RMTPropertyValue.nU64(address(), value); return this; }
        /** Sets the specified value to the {@code F64} field. */
        public RMTPropertyValue.Buffer F64(@NativeType("rmtF64") double value) { RMTPropertyValue.nF64(address(), value); return this; }

    }

}