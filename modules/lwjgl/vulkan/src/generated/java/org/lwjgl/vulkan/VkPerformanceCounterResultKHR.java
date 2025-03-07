/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * union VkPerformanceCounterResultKHR {
 *     int32_t int32;
 *     int64_t int64;
 *     uint32_t uint32;
 *     uint64_t uint64;
 *     float float32;
 *     double float64;
 * }}</pre>
 */
public class VkPerformanceCounterResultKHR extends Struct<VkPerformanceCounterResultKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        INT32,
        INT64,
        UINT32,
        UINT64,
        FLOAT32,
        FLOAT64;

    static {
        Layout layout = __union(
            __member(4),
            __member(8),
            __member(4),
            __member(8),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        INT32 = layout.offsetof(0);
        INT64 = layout.offsetof(1);
        UINT32 = layout.offsetof(2);
        UINT64 = layout.offsetof(3);
        FLOAT32 = layout.offsetof(4);
        FLOAT64 = layout.offsetof(5);
    }

    protected VkPerformanceCounterResultKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPerformanceCounterResultKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPerformanceCounterResultKHR(address, container);
    }

    /**
     * Creates a {@code VkPerformanceCounterResultKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPerformanceCounterResultKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code int32} field. */
    @NativeType("int32_t")
    public int int32() { return nint32(address()); }
    /** @return the value of the {@code int64} field. */
    @NativeType("int64_t")
    public long int64() { return nint64(address()); }
    /** @return the value of the {@code uint32} field. */
    @NativeType("uint32_t")
    public int uint32() { return nuint32(address()); }
    /** @return the value of the {@code uint64} field. */
    @NativeType("uint64_t")
    public long uint64() { return nuint64(address()); }
    /** @return the value of the {@code float32} field. */
    public float float32() { return nfloat32(address()); }
    /** @return the value of the {@code float64} field. */
    public double float64() { return nfloat64(address()); }

    /** Sets the specified value to the {@code int32} field. */
    public VkPerformanceCounterResultKHR int32(@NativeType("int32_t") int value) { nint32(address(), value); return this; }
    /** Sets the specified value to the {@code int64} field. */
    public VkPerformanceCounterResultKHR int64(@NativeType("int64_t") long value) { nint64(address(), value); return this; }
    /** Sets the specified value to the {@code uint32} field. */
    public VkPerformanceCounterResultKHR uint32(@NativeType("uint32_t") int value) { nuint32(address(), value); return this; }
    /** Sets the specified value to the {@code uint64} field. */
    public VkPerformanceCounterResultKHR uint64(@NativeType("uint64_t") long value) { nuint64(address(), value); return this; }
    /** Sets the specified value to the {@code float32} field. */
    public VkPerformanceCounterResultKHR float32(float value) { nfloat32(address(), value); return this; }
    /** Sets the specified value to the {@code float64} field. */
    public VkPerformanceCounterResultKHR float64(double value) { nfloat64(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPerformanceCounterResultKHR set(VkPerformanceCounterResultKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPerformanceCounterResultKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPerformanceCounterResultKHR malloc() {
        return new VkPerformanceCounterResultKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPerformanceCounterResultKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPerformanceCounterResultKHR calloc() {
        return new VkPerformanceCounterResultKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPerformanceCounterResultKHR} instance allocated with {@link BufferUtils}. */
    public static VkPerformanceCounterResultKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPerformanceCounterResultKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPerformanceCounterResultKHR} instance for the specified memory address. */
    public static VkPerformanceCounterResultKHR create(long address) {
        return new VkPerformanceCounterResultKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPerformanceCounterResultKHR createSafe(long address) {
        return address == NULL ? null : new VkPerformanceCounterResultKHR(address, null);
    }

    /**
     * Returns a new {@link VkPerformanceCounterResultKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerformanceCounterResultKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPerformanceCounterResultKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerformanceCounterResultKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPerformanceCounterResultKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerformanceCounterResultKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPerformanceCounterResultKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPerformanceCounterResultKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPerformanceCounterResultKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPerformanceCounterResultKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPerformanceCounterResultKHR malloc(MemoryStack stack) {
        return new VkPerformanceCounterResultKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPerformanceCounterResultKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPerformanceCounterResultKHR calloc(MemoryStack stack) {
        return new VkPerformanceCounterResultKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPerformanceCounterResultKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPerformanceCounterResultKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPerformanceCounterResultKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPerformanceCounterResultKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #int32}. */
    public static int nint32(long struct) { return memGetInt(struct + VkPerformanceCounterResultKHR.INT32); }
    /** Unsafe version of {@link #int64}. */
    public static long nint64(long struct) { return memGetLong(struct + VkPerformanceCounterResultKHR.INT64); }
    /** Unsafe version of {@link #uint32}. */
    public static int nuint32(long struct) { return memGetInt(struct + VkPerformanceCounterResultKHR.UINT32); }
    /** Unsafe version of {@link #uint64}. */
    public static long nuint64(long struct) { return memGetLong(struct + VkPerformanceCounterResultKHR.UINT64); }
    /** Unsafe version of {@link #float32}. */
    public static float nfloat32(long struct) { return memGetFloat(struct + VkPerformanceCounterResultKHR.FLOAT32); }
    /** Unsafe version of {@link #float64}. */
    public static double nfloat64(long struct) { return memGetDouble(struct + VkPerformanceCounterResultKHR.FLOAT64); }

    /** Unsafe version of {@link #int32(int) int32}. */
    public static void nint32(long struct, int value) { memPutInt(struct + VkPerformanceCounterResultKHR.INT32, value); }
    /** Unsafe version of {@link #int64(long) int64}. */
    public static void nint64(long struct, long value) { memPutLong(struct + VkPerformanceCounterResultKHR.INT64, value); }
    /** Unsafe version of {@link #uint32(int) uint32}. */
    public static void nuint32(long struct, int value) { memPutInt(struct + VkPerformanceCounterResultKHR.UINT32, value); }
    /** Unsafe version of {@link #uint64(long) uint64}. */
    public static void nuint64(long struct, long value) { memPutLong(struct + VkPerformanceCounterResultKHR.UINT64, value); }
    /** Unsafe version of {@link #float32(float) float32}. */
    public static void nfloat32(long struct, float value) { memPutFloat(struct + VkPerformanceCounterResultKHR.FLOAT32, value); }
    /** Unsafe version of {@link #float64(double) float64}. */
    public static void nfloat64(long struct, double value) { memPutDouble(struct + VkPerformanceCounterResultKHR.FLOAT64, value); }

    // -----------------------------------

    /** An array of {@link VkPerformanceCounterResultKHR} structs. */
    public static class Buffer extends StructBuffer<VkPerformanceCounterResultKHR, Buffer> implements NativeResource {

        private static final VkPerformanceCounterResultKHR ELEMENT_FACTORY = VkPerformanceCounterResultKHR.create(-1L);

        /**
         * Creates a new {@code VkPerformanceCounterResultKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPerformanceCounterResultKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPerformanceCounterResultKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code int32} field. */
        @NativeType("int32_t")
        public int int32() { return VkPerformanceCounterResultKHR.nint32(address()); }
        /** @return the value of the {@code int64} field. */
        @NativeType("int64_t")
        public long int64() { return VkPerformanceCounterResultKHR.nint64(address()); }
        /** @return the value of the {@code uint32} field. */
        @NativeType("uint32_t")
        public int uint32() { return VkPerformanceCounterResultKHR.nuint32(address()); }
        /** @return the value of the {@code uint64} field. */
        @NativeType("uint64_t")
        public long uint64() { return VkPerformanceCounterResultKHR.nuint64(address()); }
        /** @return the value of the {@code float32} field. */
        public float float32() { return VkPerformanceCounterResultKHR.nfloat32(address()); }
        /** @return the value of the {@code float64} field. */
        public double float64() { return VkPerformanceCounterResultKHR.nfloat64(address()); }

        /** Sets the specified value to the {@code int32} field. */
        public VkPerformanceCounterResultKHR.Buffer int32(@NativeType("int32_t") int value) { VkPerformanceCounterResultKHR.nint32(address(), value); return this; }
        /** Sets the specified value to the {@code int64} field. */
        public VkPerformanceCounterResultKHR.Buffer int64(@NativeType("int64_t") long value) { VkPerformanceCounterResultKHR.nint64(address(), value); return this; }
        /** Sets the specified value to the {@code uint32} field. */
        public VkPerformanceCounterResultKHR.Buffer uint32(@NativeType("uint32_t") int value) { VkPerformanceCounterResultKHR.nuint32(address(), value); return this; }
        /** Sets the specified value to the {@code uint64} field. */
        public VkPerformanceCounterResultKHR.Buffer uint64(@NativeType("uint64_t") long value) { VkPerformanceCounterResultKHR.nuint64(address(), value); return this; }
        /** Sets the specified value to the {@code float32} field. */
        public VkPerformanceCounterResultKHR.Buffer float32(float value) { VkPerformanceCounterResultKHR.nfloat32(address(), value); return this; }
        /** Sets the specified value to the {@code float64} field. */
        public VkPerformanceCounterResultKHR.Buffer float64(double value) { VkPerformanceCounterResultKHR.nfloat64(address(), value); return this; }

    }

}