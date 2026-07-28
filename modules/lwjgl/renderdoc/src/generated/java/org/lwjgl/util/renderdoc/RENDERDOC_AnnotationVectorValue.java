/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.renderdoc;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * union RENDERDOC_AnnotationVectorValue {
 *     bool boolean[4];
 *     int32_t int32[4];
 *     int64_t int64[4];
 *     uint32_t uint32[4];
 *     uint64_t uint64[4];
 *     float float32[4];
 *     double float64[4];
 * }}</pre>
 */
public class RENDERDOC_AnnotationVectorValue extends Struct<RENDERDOC_AnnotationVectorValue> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BOOLEAN,
        INT32,
        INT64,
        UINT32,
        UINT64,
        FLOAT32,
        FLOAT64;

    static {
        Layout layout = __union(
            __array(1, 4),
            __array(4, 4),
            __array(8, 4),
            __array(4, 4),
            __array(8, 4),
            __array(4, 4),
            __array(8, 4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BOOLEAN = layout.offsetof(0);
        INT32 = layout.offsetof(1);
        INT64 = layout.offsetof(2);
        UINT32 = layout.offsetof(3);
        UINT64 = layout.offsetof(4);
        FLOAT32 = layout.offsetof(5);
        FLOAT64 = layout.offsetof(6);
    }

    protected RENDERDOC_AnnotationVectorValue(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected RENDERDOC_AnnotationVectorValue create(long address, @Nullable ByteBuffer container) {
        return new RENDERDOC_AnnotationVectorValue(address, container);
    }

    /**
     * Creates a {@code RENDERDOC_AnnotationVectorValue} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public RENDERDOC_AnnotationVectorValue(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the {@code boolean} field. */
    @NativeType("bool[4]")
    public ByteBuffer boolean$() { return nboolean$(address()); }
    /** @return the value at the specified index of the {@code boolean} field. */
    @NativeType("bool")
    public boolean boolean$(int index) { return nboolean$(address(), index); }
    /** @return a {@link IntBuffer} view of the {@code int32} field. */
    @NativeType("int32_t[4]")
    public IntBuffer int32() { return nint32(address()); }
    /** @return the value at the specified index of the {@code int32} field. */
    @NativeType("int32_t")
    public int int32(int index) { return nint32(address(), index); }
    /** @return a {@link LongBuffer} view of the {@code int64} field. */
    @NativeType("int64_t[4]")
    public LongBuffer int64() { return nint64(address()); }
    /** @return the value at the specified index of the {@code int64} field. */
    @NativeType("int64_t")
    public long int64(int index) { return nint64(address(), index); }
    /** @return a {@link IntBuffer} view of the {@code uint32} field. */
    @NativeType("uint32_t[4]")
    public IntBuffer uint32() { return nuint32(address()); }
    /** @return the value at the specified index of the {@code uint32} field. */
    @NativeType("uint32_t")
    public int uint32(int index) { return nuint32(address(), index); }
    /** @return a {@link LongBuffer} view of the {@code uint64} field. */
    @NativeType("uint64_t[4]")
    public LongBuffer uint64() { return nuint64(address()); }
    /** @return the value at the specified index of the {@code uint64} field. */
    @NativeType("uint64_t")
    public long uint64(int index) { return nuint64(address(), index); }
    /** @return a {@link FloatBuffer} view of the {@code float32} field. */
    @NativeType("float[4]")
    public FloatBuffer float32() { return nfloat32(address()); }
    /** @return the value at the specified index of the {@code float32} field. */
    public float float32(int index) { return nfloat32(address(), index); }
    /** @return a {@link DoubleBuffer} view of the {@code float64} field. */
    @NativeType("double[4]")
    public DoubleBuffer float64() { return nfloat64(address()); }
    /** @return the value at the specified index of the {@code float64} field. */
    public double float64(int index) { return nfloat64(address(), index); }

    /** Copies the specified {@link ByteBuffer} to the {@code boolean} field. */
    public RENDERDOC_AnnotationVectorValue boolean$(@NativeType("bool[4]") ByteBuffer value) { nboolean$(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code boolean} field. */
    public RENDERDOC_AnnotationVectorValue boolean$(int index, @NativeType("bool") boolean value) { nboolean$(address(), index, value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code int32} field. */
    public RENDERDOC_AnnotationVectorValue int32(@NativeType("int32_t[4]") IntBuffer value) { nint32(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code int32} field. */
    public RENDERDOC_AnnotationVectorValue int32(int index, @NativeType("int32_t") int value) { nint32(address(), index, value); return this; }
    /** Copies the specified {@link LongBuffer} to the {@code int64} field. */
    public RENDERDOC_AnnotationVectorValue int64(@NativeType("int64_t[4]") LongBuffer value) { nint64(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code int64} field. */
    public RENDERDOC_AnnotationVectorValue int64(int index, @NativeType("int64_t") long value) { nint64(address(), index, value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code uint32} field. */
    public RENDERDOC_AnnotationVectorValue uint32(@NativeType("uint32_t[4]") IntBuffer value) { nuint32(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code uint32} field. */
    public RENDERDOC_AnnotationVectorValue uint32(int index, @NativeType("uint32_t") int value) { nuint32(address(), index, value); return this; }
    /** Copies the specified {@link LongBuffer} to the {@code uint64} field. */
    public RENDERDOC_AnnotationVectorValue uint64(@NativeType("uint64_t[4]") LongBuffer value) { nuint64(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code uint64} field. */
    public RENDERDOC_AnnotationVectorValue uint64(int index, @NativeType("uint64_t") long value) { nuint64(address(), index, value); return this; }
    /** Copies the specified {@link FloatBuffer} to the {@code float32} field. */
    public RENDERDOC_AnnotationVectorValue float32(@NativeType("float[4]") FloatBuffer value) { nfloat32(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code float32} field. */
    public RENDERDOC_AnnotationVectorValue float32(int index, float value) { nfloat32(address(), index, value); return this; }
    /** Copies the specified {@link DoubleBuffer} to the {@code float64} field. */
    public RENDERDOC_AnnotationVectorValue float64(@NativeType("double[4]") DoubleBuffer value) { nfloat64(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code float64} field. */
    public RENDERDOC_AnnotationVectorValue float64(int index, double value) { nfloat64(address(), index, value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public RENDERDOC_AnnotationVectorValue set(RENDERDOC_AnnotationVectorValue src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code RENDERDOC_AnnotationVectorValue} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static RENDERDOC_AnnotationVectorValue malloc() {
        return new RENDERDOC_AnnotationVectorValue(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code RENDERDOC_AnnotationVectorValue} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static RENDERDOC_AnnotationVectorValue calloc() {
        return new RENDERDOC_AnnotationVectorValue(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code RENDERDOC_AnnotationVectorValue} instance allocated with {@link BufferUtils}. */
    public static RENDERDOC_AnnotationVectorValue create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new RENDERDOC_AnnotationVectorValue(memAddress(container), container);
    }

    /** Returns a new {@code RENDERDOC_AnnotationVectorValue} instance for the specified memory address. */
    public static RENDERDOC_AnnotationVectorValue create(long address) {
        return new RENDERDOC_AnnotationVectorValue(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable RENDERDOC_AnnotationVectorValue createSafe(long address) {
        return address == NULL ? null : new RENDERDOC_AnnotationVectorValue(address, null);
    }

    /**
     * Returns a new {@link RENDERDOC_AnnotationVectorValue.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static RENDERDOC_AnnotationVectorValue.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link RENDERDOC_AnnotationVectorValue.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static RENDERDOC_AnnotationVectorValue.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RENDERDOC_AnnotationVectorValue.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static RENDERDOC_AnnotationVectorValue.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link RENDERDOC_AnnotationVectorValue.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static RENDERDOC_AnnotationVectorValue.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static RENDERDOC_AnnotationVectorValue.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code RENDERDOC_AnnotationVectorValue} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static RENDERDOC_AnnotationVectorValue malloc(MemoryStack stack) {
        return new RENDERDOC_AnnotationVectorValue(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code RENDERDOC_AnnotationVectorValue} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static RENDERDOC_AnnotationVectorValue calloc(MemoryStack stack) {
        return new RENDERDOC_AnnotationVectorValue(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link RENDERDOC_AnnotationVectorValue.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static RENDERDOC_AnnotationVectorValue.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RENDERDOC_AnnotationVectorValue.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static RENDERDOC_AnnotationVectorValue.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #boolean$}. */
    public static ByteBuffer nboolean$(long struct) { return memByteBuffer(struct + RENDERDOC_AnnotationVectorValue.BOOLEAN, 4); }
    /** Unsafe version of {@link #boolean$(int) boolean$}. */
    public static boolean nboolean$(long struct, int index) {
        return memGetByte(struct + RENDERDOC_AnnotationVectorValue.BOOLEAN + check(index, 4) * 1) != 0;
    }
    /** Unsafe version of {@link #int32}. */
    public static IntBuffer nint32(long struct) { return memIntBuffer(struct + RENDERDOC_AnnotationVectorValue.INT32, 4); }
    /** Unsafe version of {@link #int32(int) int32}. */
    public static int nint32(long struct, int index) {
        return memGetInt(struct + RENDERDOC_AnnotationVectorValue.INT32 + check(index, 4) * 4);
    }
    /** Unsafe version of {@link #int64}. */
    public static LongBuffer nint64(long struct) { return memLongBuffer(struct + RENDERDOC_AnnotationVectorValue.INT64, 4); }
    /** Unsafe version of {@link #int64(int) int64}. */
    public static long nint64(long struct, int index) {
        return memGetLong(struct + RENDERDOC_AnnotationVectorValue.INT64 + check(index, 4) * 8);
    }
    /** Unsafe version of {@link #uint32}. */
    public static IntBuffer nuint32(long struct) { return memIntBuffer(struct + RENDERDOC_AnnotationVectorValue.UINT32, 4); }
    /** Unsafe version of {@link #uint32(int) uint32}. */
    public static int nuint32(long struct, int index) {
        return memGetInt(struct + RENDERDOC_AnnotationVectorValue.UINT32 + check(index, 4) * 4);
    }
    /** Unsafe version of {@link #uint64}. */
    public static LongBuffer nuint64(long struct) { return memLongBuffer(struct + RENDERDOC_AnnotationVectorValue.UINT64, 4); }
    /** Unsafe version of {@link #uint64(int) uint64}. */
    public static long nuint64(long struct, int index) {
        return memGetLong(struct + RENDERDOC_AnnotationVectorValue.UINT64 + check(index, 4) * 8);
    }
    /** Unsafe version of {@link #float32}. */
    public static FloatBuffer nfloat32(long struct) { return memFloatBuffer(struct + RENDERDOC_AnnotationVectorValue.FLOAT32, 4); }
    /** Unsafe version of {@link #float32(int) float32}. */
    public static float nfloat32(long struct, int index) {
        return memGetFloat(struct + RENDERDOC_AnnotationVectorValue.FLOAT32 + check(index, 4) * 4);
    }
    /** Unsafe version of {@link #float64}. */
    public static DoubleBuffer nfloat64(long struct) { return memDoubleBuffer(struct + RENDERDOC_AnnotationVectorValue.FLOAT64, 4); }
    /** Unsafe version of {@link #float64(int) float64}. */
    public static double nfloat64(long struct, int index) {
        return memGetDouble(struct + RENDERDOC_AnnotationVectorValue.FLOAT64 + check(index, 4) * 8);
    }

    /** Unsafe version of {@link #boolean$(ByteBuffer) boolean$}. */
    public static void nboolean$(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + RENDERDOC_AnnotationVectorValue.BOOLEAN, value.remaining() * 1);
    }
    /** Unsafe version of {@link #boolean$(int, boolean) boolean$}. */
    public static void nboolean$(long struct, int index, boolean value) {
        memPutByte(struct + RENDERDOC_AnnotationVectorValue.BOOLEAN + check(index, 4) * 1, value ? (byte)1 : (byte)0);
    }
    /** Unsafe version of {@link #int32(IntBuffer) int32}. */
    public static void nint32(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + RENDERDOC_AnnotationVectorValue.INT32, value.remaining() * 4);
    }
    /** Unsafe version of {@link #int32(int, int) int32}. */
    public static void nint32(long struct, int index, int value) {
        memPutInt(struct + RENDERDOC_AnnotationVectorValue.INT32 + check(index, 4) * 4, value);
    }
    /** Unsafe version of {@link #int64(LongBuffer) int64}. */
    public static void nint64(long struct, LongBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + RENDERDOC_AnnotationVectorValue.INT64, value.remaining() * 8);
    }
    /** Unsafe version of {@link #int64(int, long) int64}. */
    public static void nint64(long struct, int index, long value) {
        memPutLong(struct + RENDERDOC_AnnotationVectorValue.INT64 + check(index, 4) * 8, value);
    }
    /** Unsafe version of {@link #uint32(IntBuffer) uint32}. */
    public static void nuint32(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + RENDERDOC_AnnotationVectorValue.UINT32, value.remaining() * 4);
    }
    /** Unsafe version of {@link #uint32(int, int) uint32}. */
    public static void nuint32(long struct, int index, int value) {
        memPutInt(struct + RENDERDOC_AnnotationVectorValue.UINT32 + check(index, 4) * 4, value);
    }
    /** Unsafe version of {@link #uint64(LongBuffer) uint64}. */
    public static void nuint64(long struct, LongBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + RENDERDOC_AnnotationVectorValue.UINT64, value.remaining() * 8);
    }
    /** Unsafe version of {@link #uint64(int, long) uint64}. */
    public static void nuint64(long struct, int index, long value) {
        memPutLong(struct + RENDERDOC_AnnotationVectorValue.UINT64 + check(index, 4) * 8, value);
    }
    /** Unsafe version of {@link #float32(FloatBuffer) float32}. */
    public static void nfloat32(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + RENDERDOC_AnnotationVectorValue.FLOAT32, value.remaining() * 4);
    }
    /** Unsafe version of {@link #float32(int, float) float32}. */
    public static void nfloat32(long struct, int index, float value) {
        memPutFloat(struct + RENDERDOC_AnnotationVectorValue.FLOAT32 + check(index, 4) * 4, value);
    }
    /** Unsafe version of {@link #float64(DoubleBuffer) float64}. */
    public static void nfloat64(long struct, DoubleBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + RENDERDOC_AnnotationVectorValue.FLOAT64, value.remaining() * 8);
    }
    /** Unsafe version of {@link #float64(int, double) float64}. */
    public static void nfloat64(long struct, int index, double value) {
        memPutDouble(struct + RENDERDOC_AnnotationVectorValue.FLOAT64 + check(index, 4) * 8, value);
    }

    // -----------------------------------

    /** An array of {@link RENDERDOC_AnnotationVectorValue} structs. */
    public static class Buffer extends StructBuffer<RENDERDOC_AnnotationVectorValue, Buffer> implements NativeResource {

        private static final RENDERDOC_AnnotationVectorValue ELEMENT_FACTORY = RENDERDOC_AnnotationVectorValue.create(-1L);

        /**
         * Creates a new {@code RENDERDOC_AnnotationVectorValue.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link RENDERDOC_AnnotationVectorValue#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected RENDERDOC_AnnotationVectorValue getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the {@code boolean} field. */
        @NativeType("bool[4]")
        public ByteBuffer boolean$() { return RENDERDOC_AnnotationVectorValue.nboolean$(address()); }
        /** @return the value at the specified index of the {@code boolean} field. */
        @NativeType("bool")
        public boolean boolean$(int index) { return RENDERDOC_AnnotationVectorValue.nboolean$(address(), index); }
        /** @return a {@link IntBuffer} view of the {@code int32} field. */
        @NativeType("int32_t[4]")
        public IntBuffer int32() { return RENDERDOC_AnnotationVectorValue.nint32(address()); }
        /** @return the value at the specified index of the {@code int32} field. */
        @NativeType("int32_t")
        public int int32(int index) { return RENDERDOC_AnnotationVectorValue.nint32(address(), index); }
        /** @return a {@link LongBuffer} view of the {@code int64} field. */
        @NativeType("int64_t[4]")
        public LongBuffer int64() { return RENDERDOC_AnnotationVectorValue.nint64(address()); }
        /** @return the value at the specified index of the {@code int64} field. */
        @NativeType("int64_t")
        public long int64(int index) { return RENDERDOC_AnnotationVectorValue.nint64(address(), index); }
        /** @return a {@link IntBuffer} view of the {@code uint32} field. */
        @NativeType("uint32_t[4]")
        public IntBuffer uint32() { return RENDERDOC_AnnotationVectorValue.nuint32(address()); }
        /** @return the value at the specified index of the {@code uint32} field. */
        @NativeType("uint32_t")
        public int uint32(int index) { return RENDERDOC_AnnotationVectorValue.nuint32(address(), index); }
        /** @return a {@link LongBuffer} view of the {@code uint64} field. */
        @NativeType("uint64_t[4]")
        public LongBuffer uint64() { return RENDERDOC_AnnotationVectorValue.nuint64(address()); }
        /** @return the value at the specified index of the {@code uint64} field. */
        @NativeType("uint64_t")
        public long uint64(int index) { return RENDERDOC_AnnotationVectorValue.nuint64(address(), index); }
        /** @return a {@link FloatBuffer} view of the {@code float32} field. */
        @NativeType("float[4]")
        public FloatBuffer float32() { return RENDERDOC_AnnotationVectorValue.nfloat32(address()); }
        /** @return the value at the specified index of the {@code float32} field. */
        public float float32(int index) { return RENDERDOC_AnnotationVectorValue.nfloat32(address(), index); }
        /** @return a {@link DoubleBuffer} view of the {@code float64} field. */
        @NativeType("double[4]")
        public DoubleBuffer float64() { return RENDERDOC_AnnotationVectorValue.nfloat64(address()); }
        /** @return the value at the specified index of the {@code float64} field. */
        public double float64(int index) { return RENDERDOC_AnnotationVectorValue.nfloat64(address(), index); }

        /** Copies the specified {@link ByteBuffer} to the {@code boolean} field. */
        public RENDERDOC_AnnotationVectorValue.Buffer boolean$(@NativeType("bool[4]") ByteBuffer value) { RENDERDOC_AnnotationVectorValue.nboolean$(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code boolean} field. */
        public RENDERDOC_AnnotationVectorValue.Buffer boolean$(int index, @NativeType("bool") boolean value) { RENDERDOC_AnnotationVectorValue.nboolean$(address(), index, value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code int32} field. */
        public RENDERDOC_AnnotationVectorValue.Buffer int32(@NativeType("int32_t[4]") IntBuffer value) { RENDERDOC_AnnotationVectorValue.nint32(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code int32} field. */
        public RENDERDOC_AnnotationVectorValue.Buffer int32(int index, @NativeType("int32_t") int value) { RENDERDOC_AnnotationVectorValue.nint32(address(), index, value); return this; }
        /** Copies the specified {@link LongBuffer} to the {@code int64} field. */
        public RENDERDOC_AnnotationVectorValue.Buffer int64(@NativeType("int64_t[4]") LongBuffer value) { RENDERDOC_AnnotationVectorValue.nint64(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code int64} field. */
        public RENDERDOC_AnnotationVectorValue.Buffer int64(int index, @NativeType("int64_t") long value) { RENDERDOC_AnnotationVectorValue.nint64(address(), index, value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code uint32} field. */
        public RENDERDOC_AnnotationVectorValue.Buffer uint32(@NativeType("uint32_t[4]") IntBuffer value) { RENDERDOC_AnnotationVectorValue.nuint32(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code uint32} field. */
        public RENDERDOC_AnnotationVectorValue.Buffer uint32(int index, @NativeType("uint32_t") int value) { RENDERDOC_AnnotationVectorValue.nuint32(address(), index, value); return this; }
        /** Copies the specified {@link LongBuffer} to the {@code uint64} field. */
        public RENDERDOC_AnnotationVectorValue.Buffer uint64(@NativeType("uint64_t[4]") LongBuffer value) { RENDERDOC_AnnotationVectorValue.nuint64(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code uint64} field. */
        public RENDERDOC_AnnotationVectorValue.Buffer uint64(int index, @NativeType("uint64_t") long value) { RENDERDOC_AnnotationVectorValue.nuint64(address(), index, value); return this; }
        /** Copies the specified {@link FloatBuffer} to the {@code float32} field. */
        public RENDERDOC_AnnotationVectorValue.Buffer float32(@NativeType("float[4]") FloatBuffer value) { RENDERDOC_AnnotationVectorValue.nfloat32(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code float32} field. */
        public RENDERDOC_AnnotationVectorValue.Buffer float32(int index, float value) { RENDERDOC_AnnotationVectorValue.nfloat32(address(), index, value); return this; }
        /** Copies the specified {@link DoubleBuffer} to the {@code float64} field. */
        public RENDERDOC_AnnotationVectorValue.Buffer float64(@NativeType("double[4]") DoubleBuffer value) { RENDERDOC_AnnotationVectorValue.nfloat64(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code float64} field. */
        public RENDERDOC_AnnotationVectorValue.Buffer float64(int index, double value) { RENDERDOC_AnnotationVectorValue.nfloat64(address(), index, value); return this; }

    }

}