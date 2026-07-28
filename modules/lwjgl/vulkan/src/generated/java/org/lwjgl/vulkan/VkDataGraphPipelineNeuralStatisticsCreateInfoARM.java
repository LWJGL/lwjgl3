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
 * struct VkDataGraphPipelineNeuralStatisticsCreateInfoARM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBool32 allowNeuralStatistics;
 * }}</pre>
 */
public class VkDataGraphPipelineNeuralStatisticsCreateInfoARM extends Struct<VkDataGraphPipelineNeuralStatisticsCreateInfoARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ALLOWNEURALSTATISTICS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ALLOWNEURALSTATISTICS = layout.offsetof(2);
    }

    protected VkDataGraphPipelineNeuralStatisticsCreateInfoARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDataGraphPipelineNeuralStatisticsCreateInfoARM create(long address, @Nullable ByteBuffer container) {
        return new VkDataGraphPipelineNeuralStatisticsCreateInfoARM(address, container);
    }

    /**
     * Creates a {@code VkDataGraphPipelineNeuralStatisticsCreateInfoARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDataGraphPipelineNeuralStatisticsCreateInfoARM(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code allowNeuralStatistics} field. */
    @NativeType("VkBool32")
    public boolean allowNeuralStatistics() { return nallowNeuralStatistics(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkDataGraphPipelineNeuralStatisticsCreateInfoARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMDataGraphNeuralAcceleratorStatistics#VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_NEURAL_STATISTICS_CREATE_INFO_ARM STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_NEURAL_STATISTICS_CREATE_INFO_ARM} value to the {@code sType} field. */
    public VkDataGraphPipelineNeuralStatisticsCreateInfoARM sType$Default() { return sType(ARMDataGraphNeuralAcceleratorStatistics.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_NEURAL_STATISTICS_CREATE_INFO_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDataGraphPipelineNeuralStatisticsCreateInfoARM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code allowNeuralStatistics} field. */
    public VkDataGraphPipelineNeuralStatisticsCreateInfoARM allowNeuralStatistics(@NativeType("VkBool32") boolean value) { nallowNeuralStatistics(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkDataGraphPipelineNeuralStatisticsCreateInfoARM set(
        int sType,
        long pNext,
        boolean allowNeuralStatistics
    ) {
        sType(sType);
        pNext(pNext);
        allowNeuralStatistics(allowNeuralStatistics);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDataGraphPipelineNeuralStatisticsCreateInfoARM set(VkDataGraphPipelineNeuralStatisticsCreateInfoARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDataGraphPipelineNeuralStatisticsCreateInfoARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDataGraphPipelineNeuralStatisticsCreateInfoARM malloc() {
        return new VkDataGraphPipelineNeuralStatisticsCreateInfoARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDataGraphPipelineNeuralStatisticsCreateInfoARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDataGraphPipelineNeuralStatisticsCreateInfoARM calloc() {
        return new VkDataGraphPipelineNeuralStatisticsCreateInfoARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDataGraphPipelineNeuralStatisticsCreateInfoARM} instance allocated with {@link BufferUtils}. */
    public static VkDataGraphPipelineNeuralStatisticsCreateInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDataGraphPipelineNeuralStatisticsCreateInfoARM(memAddress(container), container);
    }

    /** Returns a new {@code VkDataGraphPipelineNeuralStatisticsCreateInfoARM} instance for the specified memory address. */
    public static VkDataGraphPipelineNeuralStatisticsCreateInfoARM create(long address) {
        return new VkDataGraphPipelineNeuralStatisticsCreateInfoARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDataGraphPipelineNeuralStatisticsCreateInfoARM createSafe(long address) {
        return address == NULL ? null : new VkDataGraphPipelineNeuralStatisticsCreateInfoARM(address, null);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineNeuralStatisticsCreateInfoARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineNeuralStatisticsCreateInfoARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineNeuralStatisticsCreateInfoARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineNeuralStatisticsCreateInfoARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineNeuralStatisticsCreateInfoARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineNeuralStatisticsCreateInfoARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDataGraphPipelineNeuralStatisticsCreateInfoARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineNeuralStatisticsCreateInfoARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDataGraphPipelineNeuralStatisticsCreateInfoARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDataGraphPipelineNeuralStatisticsCreateInfoARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDataGraphPipelineNeuralStatisticsCreateInfoARM malloc(MemoryStack stack) {
        return new VkDataGraphPipelineNeuralStatisticsCreateInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDataGraphPipelineNeuralStatisticsCreateInfoARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDataGraphPipelineNeuralStatisticsCreateInfoARM calloc(MemoryStack stack) {
        return new VkDataGraphPipelineNeuralStatisticsCreateInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineNeuralStatisticsCreateInfoARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineNeuralStatisticsCreateInfoARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineNeuralStatisticsCreateInfoARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineNeuralStatisticsCreateInfoARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDataGraphPipelineNeuralStatisticsCreateInfoARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDataGraphPipelineNeuralStatisticsCreateInfoARM.PNEXT); }
    /** Unsafe version of {@link #allowNeuralStatistics}. */
    public static int nallowNeuralStatistics(long struct) { return memGetInt(struct + VkDataGraphPipelineNeuralStatisticsCreateInfoARM.ALLOWNEURALSTATISTICS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDataGraphPipelineNeuralStatisticsCreateInfoARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDataGraphPipelineNeuralStatisticsCreateInfoARM.PNEXT, value); }
    /** Unsafe version of {@link #allowNeuralStatistics(boolean) allowNeuralStatistics}. */
    public static void nallowNeuralStatistics(long struct, int value) { memPutInt(struct + VkDataGraphPipelineNeuralStatisticsCreateInfoARM.ALLOWNEURALSTATISTICS, value); }

    // -----------------------------------

    /** An array of {@link VkDataGraphPipelineNeuralStatisticsCreateInfoARM} structs. */
    public static class Buffer extends StructBuffer<VkDataGraphPipelineNeuralStatisticsCreateInfoARM, Buffer> implements NativeResource {

        private static final VkDataGraphPipelineNeuralStatisticsCreateInfoARM ELEMENT_FACTORY = VkDataGraphPipelineNeuralStatisticsCreateInfoARM.create(-1L);

        /**
         * Creates a new {@code VkDataGraphPipelineNeuralStatisticsCreateInfoARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDataGraphPipelineNeuralStatisticsCreateInfoARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDataGraphPipelineNeuralStatisticsCreateInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDataGraphPipelineNeuralStatisticsCreateInfoARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDataGraphPipelineNeuralStatisticsCreateInfoARM.npNext(address()); }
        /** @return the value of the {@code allowNeuralStatistics} field. */
        @NativeType("VkBool32")
        public boolean allowNeuralStatistics() { return VkDataGraphPipelineNeuralStatisticsCreateInfoARM.nallowNeuralStatistics(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkDataGraphPipelineNeuralStatisticsCreateInfoARM.Buffer sType(@NativeType("VkStructureType") int value) { VkDataGraphPipelineNeuralStatisticsCreateInfoARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMDataGraphNeuralAcceleratorStatistics#VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_NEURAL_STATISTICS_CREATE_INFO_ARM STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_NEURAL_STATISTICS_CREATE_INFO_ARM} value to the {@code sType} field. */
        public VkDataGraphPipelineNeuralStatisticsCreateInfoARM.Buffer sType$Default() { return sType(ARMDataGraphNeuralAcceleratorStatistics.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_NEURAL_STATISTICS_CREATE_INFO_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDataGraphPipelineNeuralStatisticsCreateInfoARM.Buffer pNext(@NativeType("void const *") long value) { VkDataGraphPipelineNeuralStatisticsCreateInfoARM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code allowNeuralStatistics} field. */
        public VkDataGraphPipelineNeuralStatisticsCreateInfoARM.Buffer allowNeuralStatistics(@NativeType("VkBool32") boolean value) { VkDataGraphPipelineNeuralStatisticsCreateInfoARM.nallowNeuralStatistics(address(), value ? 1 : 0); return this; }

    }

}