/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <pre>{@code
 * union VkPipelineExecutableStatisticValueKHR {
 *     VkBool32 b32;
 *     int64_t i64;
 *     uint64_t u64;
 *     double f64;
 * }}</pre>
 */
public class VkPipelineExecutableStatisticValueKHR extends Struct<VkPipelineExecutableStatisticValueKHR> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        B32,
        I64,
        U64,
        F64;

    static {
        Layout layout = __union(
            __member(4),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        B32 = layout.offsetof(0);
        I64 = layout.offsetof(1);
        U64 = layout.offsetof(2);
        F64 = layout.offsetof(3);
    }

    protected VkPipelineExecutableStatisticValueKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineExecutableStatisticValueKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineExecutableStatisticValueKHR(address, container);
    }

    /**
     * Creates a {@code VkPipelineExecutableStatisticValueKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineExecutableStatisticValueKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code b32} field. */
    @NativeType("VkBool32")
    public boolean b32() { return nb32(address()) != 0; }
    /** @return the value of the {@code i64} field. */
    @NativeType("int64_t")
    public long i64() { return ni64(address()); }
    /** @return the value of the {@code u64} field. */
    @NativeType("uint64_t")
    public long u64() { return nu64(address()); }
    /** @return the value of the {@code f64} field. */
    public double f64() { return nf64(address()); }

    // -----------------------------------

    /** Returns a new {@code VkPipelineExecutableStatisticValueKHR} instance for the specified memory address. */
    public static VkPipelineExecutableStatisticValueKHR create(long address) {
        return new VkPipelineExecutableStatisticValueKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineExecutableStatisticValueKHR createSafe(long address) {
        return address == NULL ? null : new VkPipelineExecutableStatisticValueKHR(address, null);
    }

    /**
     * Create a {@link VkPipelineExecutableStatisticValueKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutableStatisticValueKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineExecutableStatisticValueKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #b32}. */
    public static int nb32(long struct) { return memGetInt(struct + VkPipelineExecutableStatisticValueKHR.B32); }
    /** Unsafe version of {@link #i64}. */
    public static long ni64(long struct) { return memGetLong(struct + VkPipelineExecutableStatisticValueKHR.I64); }
    /** Unsafe version of {@link #u64}. */
    public static long nu64(long struct) { return memGetLong(struct + VkPipelineExecutableStatisticValueKHR.U64); }
    /** Unsafe version of {@link #f64}. */
    public static double nf64(long struct) { return memGetDouble(struct + VkPipelineExecutableStatisticValueKHR.F64); }

    // -----------------------------------

    /** An array of {@link VkPipelineExecutableStatisticValueKHR} structs. */
    public static class Buffer extends StructBuffer<VkPipelineExecutableStatisticValueKHR, Buffer> {

        private static final VkPipelineExecutableStatisticValueKHR ELEMENT_FACTORY = VkPipelineExecutableStatisticValueKHR.create(-1L);

        /**
         * Creates a new {@code VkPipelineExecutableStatisticValueKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineExecutableStatisticValueKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineExecutableStatisticValueKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code b32} field. */
        @NativeType("VkBool32")
        public boolean b32() { return VkPipelineExecutableStatisticValueKHR.nb32(address()) != 0; }
        /** @return the value of the {@code i64} field. */
        @NativeType("int64_t")
        public long i64() { return VkPipelineExecutableStatisticValueKHR.ni64(address()); }
        /** @return the value of the {@code u64} field. */
        @NativeType("uint64_t")
        public long u64() { return VkPipelineExecutableStatisticValueKHR.nu64(address()); }
        /** @return the value of the {@code f64} field. */
        public double f64() { return VkPipelineExecutableStatisticValueKHR.nf64(address()); }

    }

}