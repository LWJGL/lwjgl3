/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * <pre>{@code
 * struct VkShaderStatisticsInfoAMD {
 *     VkShaderStageFlags shaderStageMask;
 *     {@link VkShaderResourceUsageAMD VkShaderResourceUsageAMD} resourceUsage;
 *     uint32_t numPhysicalVgprs;
 *     uint32_t numPhysicalSgprs;
 *     uint32_t numAvailableVgprs;
 *     uint32_t numAvailableSgprs;
 *     uint32_t computeWorkGroupSize[3];
 * }}</pre>
 */
public class VkShaderStatisticsInfoAMD extends Struct<VkShaderStatisticsInfoAMD> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SHADERSTAGEMASK,
        RESOURCEUSAGE,
        NUMPHYSICALVGPRS,
        NUMPHYSICALSGPRS,
        NUMAVAILABLEVGPRS,
        NUMAVAILABLESGPRS,
        COMPUTEWORKGROUPSIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(VkShaderResourceUsageAMD.SIZEOF, VkShaderResourceUsageAMD.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __array(4, 3)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SHADERSTAGEMASK = layout.offsetof(0);
        RESOURCEUSAGE = layout.offsetof(1);
        NUMPHYSICALVGPRS = layout.offsetof(2);
        NUMPHYSICALSGPRS = layout.offsetof(3);
        NUMAVAILABLEVGPRS = layout.offsetof(4);
        NUMAVAILABLESGPRS = layout.offsetof(5);
        COMPUTEWORKGROUPSIZE = layout.offsetof(6);
    }

    protected VkShaderStatisticsInfoAMD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkShaderStatisticsInfoAMD create(long address, @Nullable ByteBuffer container) {
        return new VkShaderStatisticsInfoAMD(address, container);
    }

    /**
     * Creates a {@code VkShaderStatisticsInfoAMD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkShaderStatisticsInfoAMD(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code shaderStageMask} field. */
    @NativeType("VkShaderStageFlags")
    public int shaderStageMask() { return nshaderStageMask(address()); }
    /** @return a {@link VkShaderResourceUsageAMD} view of the {@code resourceUsage} field. */
    public VkShaderResourceUsageAMD resourceUsage() { return nresourceUsage(address()); }
    /** @return the value of the {@code numPhysicalVgprs} field. */
    @NativeType("uint32_t")
    public int numPhysicalVgprs() { return nnumPhysicalVgprs(address()); }
    /** @return the value of the {@code numPhysicalSgprs} field. */
    @NativeType("uint32_t")
    public int numPhysicalSgprs() { return nnumPhysicalSgprs(address()); }
    /** @return the value of the {@code numAvailableVgprs} field. */
    @NativeType("uint32_t")
    public int numAvailableVgprs() { return nnumAvailableVgprs(address()); }
    /** @return the value of the {@code numAvailableSgprs} field. */
    @NativeType("uint32_t")
    public int numAvailableSgprs() { return nnumAvailableSgprs(address()); }
    /** @return a {@link IntBuffer} view of the {@code computeWorkGroupSize} field. */
    @NativeType("uint32_t[3]")
    public IntBuffer computeWorkGroupSize() { return ncomputeWorkGroupSize(address()); }
    /** @return the value at the specified index of the {@code computeWorkGroupSize} field. */
    @NativeType("uint32_t")
    public int computeWorkGroupSize(int index) { return ncomputeWorkGroupSize(address(), index); }

    // -----------------------------------

    /** Returns a new {@code VkShaderStatisticsInfoAMD} instance for the specified memory address. */
    public static VkShaderStatisticsInfoAMD create(long address) {
        return new VkShaderStatisticsInfoAMD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkShaderStatisticsInfoAMD createSafe(long address) {
        return address == NULL ? null : new VkShaderStatisticsInfoAMD(address, null);
    }

    /**
     * Create a {@link VkShaderStatisticsInfoAMD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkShaderStatisticsInfoAMD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkShaderStatisticsInfoAMD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #shaderStageMask}. */
    public static int nshaderStageMask(long struct) { return memGetInt(struct + VkShaderStatisticsInfoAMD.SHADERSTAGEMASK); }
    /** Unsafe version of {@link #resourceUsage}. */
    public static VkShaderResourceUsageAMD nresourceUsage(long struct) { return VkShaderResourceUsageAMD.create(struct + VkShaderStatisticsInfoAMD.RESOURCEUSAGE); }
    /** Unsafe version of {@link #numPhysicalVgprs}. */
    public static int nnumPhysicalVgprs(long struct) { return memGetInt(struct + VkShaderStatisticsInfoAMD.NUMPHYSICALVGPRS); }
    /** Unsafe version of {@link #numPhysicalSgprs}. */
    public static int nnumPhysicalSgprs(long struct) { return memGetInt(struct + VkShaderStatisticsInfoAMD.NUMPHYSICALSGPRS); }
    /** Unsafe version of {@link #numAvailableVgprs}. */
    public static int nnumAvailableVgprs(long struct) { return memGetInt(struct + VkShaderStatisticsInfoAMD.NUMAVAILABLEVGPRS); }
    /** Unsafe version of {@link #numAvailableSgprs}. */
    public static int nnumAvailableSgprs(long struct) { return memGetInt(struct + VkShaderStatisticsInfoAMD.NUMAVAILABLESGPRS); }
    /** Unsafe version of {@link #computeWorkGroupSize}. */
    public static IntBuffer ncomputeWorkGroupSize(long struct) { return memIntBuffer(struct + VkShaderStatisticsInfoAMD.COMPUTEWORKGROUPSIZE, 3); }
    /** Unsafe version of {@link #computeWorkGroupSize(int) computeWorkGroupSize}. */
    public static int ncomputeWorkGroupSize(long struct, int index) {
        return memGetInt(struct + VkShaderStatisticsInfoAMD.COMPUTEWORKGROUPSIZE + check(index, 3) * 4);
    }

    // -----------------------------------

    /** An array of {@link VkShaderStatisticsInfoAMD} structs. */
    public static class Buffer extends StructBuffer<VkShaderStatisticsInfoAMD, Buffer> {

        private static final VkShaderStatisticsInfoAMD ELEMENT_FACTORY = VkShaderStatisticsInfoAMD.create(-1L);

        /**
         * Creates a new {@code VkShaderStatisticsInfoAMD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkShaderStatisticsInfoAMD#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkShaderStatisticsInfoAMD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code shaderStageMask} field. */
        @NativeType("VkShaderStageFlags")
        public int shaderStageMask() { return VkShaderStatisticsInfoAMD.nshaderStageMask(address()); }
        /** @return a {@link VkShaderResourceUsageAMD} view of the {@code resourceUsage} field. */
        public VkShaderResourceUsageAMD resourceUsage() { return VkShaderStatisticsInfoAMD.nresourceUsage(address()); }
        /** @return the value of the {@code numPhysicalVgprs} field. */
        @NativeType("uint32_t")
        public int numPhysicalVgprs() { return VkShaderStatisticsInfoAMD.nnumPhysicalVgprs(address()); }
        /** @return the value of the {@code numPhysicalSgprs} field. */
        @NativeType("uint32_t")
        public int numPhysicalSgprs() { return VkShaderStatisticsInfoAMD.nnumPhysicalSgprs(address()); }
        /** @return the value of the {@code numAvailableVgprs} field. */
        @NativeType("uint32_t")
        public int numAvailableVgprs() { return VkShaderStatisticsInfoAMD.nnumAvailableVgprs(address()); }
        /** @return the value of the {@code numAvailableSgprs} field. */
        @NativeType("uint32_t")
        public int numAvailableSgprs() { return VkShaderStatisticsInfoAMD.nnumAvailableSgprs(address()); }
        /** @return a {@link IntBuffer} view of the {@code computeWorkGroupSize} field. */
        @NativeType("uint32_t[3]")
        public IntBuffer computeWorkGroupSize() { return VkShaderStatisticsInfoAMD.ncomputeWorkGroupSize(address()); }
        /** @return the value at the specified index of the {@code computeWorkGroupSize} field. */
        @NativeType("uint32_t")
        public int computeWorkGroupSize(int index) { return VkShaderStatisticsInfoAMD.ncomputeWorkGroupSize(address(), index); }

    }

}