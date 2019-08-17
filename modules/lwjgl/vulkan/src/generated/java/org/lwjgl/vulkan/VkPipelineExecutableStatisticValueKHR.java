/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * A union describing a pipeline executable statistic.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code b32} &ndash; the 32-bit boolean value if the {@code VkPipelineExecutableStatisticFormatKHR} is {@link KHRPipelineExecutableProperties#VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_BOOL32_KHR PIPELINE_EXECUTABLE_STATISTIC_FORMAT_BOOL32_KHR}.</li>
 * <li>{@code i64} &ndash; the signed 64-bit integer value if the {@code VkPipelineExecutableStatisticFormatKHR} is {@link KHRPipelineExecutableProperties#VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_INT64_KHR PIPELINE_EXECUTABLE_STATISTIC_FORMAT_INT64_KHR}.</li>
 * <li>{@code u64} &ndash; the unsigned 64-bit integer value if the {@code VkPipelineExecutableStatisticFormatKHR} is {@link KHRPipelineExecutableProperties#VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_UINT64_KHR PIPELINE_EXECUTABLE_STATISTIC_FORMAT_UINT64_KHR}.</li>
 * <li>{@code f64} &ndash; the 64-bit floating-point value if the {@code VkPipelineExecutableStatisticFormatKHR} is {@link KHRPipelineExecutableProperties#VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_FLOAT64_KHR PIPELINE_EXECUTABLE_STATISTIC_FORMAT_FLOAT64_KHR}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * union VkPipelineExecutableStatisticValueKHR {
 *     VkBool32 b32;
 *     int64_t i64;
 *     uint64_t u64;
 *     double f64;
 * }</code></pre>
 */
public class VkPipelineExecutableStatisticValueKHR extends Struct {

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

    /** Returns the value of the {@code b32} field. */
    @NativeType("VkBool32")
    public boolean b32() { return nb32(address()) != 0; }
    /** Returns the value of the {@code i64} field. */
    @NativeType("int64_t")
    public long i64() { return ni64(address()); }
    /** Returns the value of the {@code u64} field. */
    @NativeType("uint64_t")
    public long u64() { return nu64(address()); }
    /** Returns the value of the {@code f64} field. */
    public double f64() { return nf64(address()); }

    // -----------------------------------

    /** Returns a new {@code VkPipelineExecutableStatisticValueKHR} instance for the specified memory address. */
    public static VkPipelineExecutableStatisticValueKHR create(long address) {
        return wrap(VkPipelineExecutableStatisticValueKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineExecutableStatisticValueKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPipelineExecutableStatisticValueKHR.class, address);
    }

    /**
     * Create a {@link VkPipelineExecutableStatisticValueKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutableStatisticValueKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineExecutableStatisticValueKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #b32}. */
    public static int nb32(long struct) { return UNSAFE.getInt(null, struct + VkPipelineExecutableStatisticValueKHR.B32); }
    /** Unsafe version of {@link #i64}. */
    public static long ni64(long struct) { return UNSAFE.getLong(null, struct + VkPipelineExecutableStatisticValueKHR.I64); }
    /** Unsafe version of {@link #u64}. */
    public static long nu64(long struct) { return UNSAFE.getLong(null, struct + VkPipelineExecutableStatisticValueKHR.U64); }
    /** Unsafe version of {@link #f64}. */
    public static double nf64(long struct) { return UNSAFE.getDouble(null, struct + VkPipelineExecutableStatisticValueKHR.F64); }

    // -----------------------------------

    /** An array of {@link VkPipelineExecutableStatisticValueKHR} structs. */
    public static class Buffer extends StructBuffer<VkPipelineExecutableStatisticValueKHR, Buffer> {

        private static final VkPipelineExecutableStatisticValueKHR ELEMENT_FACTORY = VkPipelineExecutableStatisticValueKHR.create(-1L);

        /**
         * Creates a new {@code VkPipelineExecutableStatisticValueKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineExecutableStatisticValueKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineExecutableStatisticValueKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code b32} field. */
        @NativeType("VkBool32")
        public boolean b32() { return VkPipelineExecutableStatisticValueKHR.nb32(address()) != 0; }
        /** Returns the value of the {@code i64} field. */
        @NativeType("int64_t")
        public long i64() { return VkPipelineExecutableStatisticValueKHR.ni64(address()); }
        /** Returns the value of the {@code u64} field. */
        @NativeType("uint64_t")
        public long u64() { return VkPipelineExecutableStatisticValueKHR.nu64(address()); }
        /** Returns the value of the {@code f64} field. */
        public double f64() { return VkPipelineExecutableStatisticValueKHR.nf64(address()); }

    }

}