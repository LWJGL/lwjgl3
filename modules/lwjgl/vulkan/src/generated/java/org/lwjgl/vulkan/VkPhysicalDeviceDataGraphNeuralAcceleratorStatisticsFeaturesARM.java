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
 * struct VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 dataGraphNeuralAcceleratorStatistics;
 * }}</pre>
 */
public class VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM extends Struct<VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DATAGRAPHNEURALACCELERATORSTATISTICS;

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
        DATAGRAPHNEURALACCELERATORSTATISTICS = layout.offsetof(2);
    }

    protected VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code dataGraphNeuralAcceleratorStatistics} field. */
    @NativeType("VkBool32")
    public boolean dataGraphNeuralAcceleratorStatistics() { return ndataGraphNeuralAcceleratorStatistics(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMDataGraphNeuralAcceleratorStatistics#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DATA_GRAPH_NEURAL_ACCELERATOR_STATISTICS_FEATURES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_DATA_GRAPH_NEURAL_ACCELERATOR_STATISTICS_FEATURES_ARM} value to the {@code sType} field. */
    public VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM sType$Default() { return sType(ARMDataGraphNeuralAcceleratorStatistics.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DATA_GRAPH_NEURAL_ACCELERATOR_STATISTICS_FEATURES_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code dataGraphNeuralAcceleratorStatistics} field. */
    public VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM dataGraphNeuralAcceleratorStatistics(@NativeType("VkBool32") boolean value) { ndataGraphNeuralAcceleratorStatistics(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM set(
        int sType,
        long pNext,
        boolean dataGraphNeuralAcceleratorStatistics
    ) {
        sType(sType);
        pNext(pNext);
        dataGraphNeuralAcceleratorStatistics(dataGraphNeuralAcceleratorStatistics);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM set(VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM malloc() {
        return new VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM calloc() {
        return new VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM} instance for the specified memory address. */
    public static VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM create(long address) {
        return new VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM.PNEXT); }
    /** Unsafe version of {@link #dataGraphNeuralAcceleratorStatistics}. */
    public static int ndataGraphNeuralAcceleratorStatistics(long struct) { return memGetInt(struct + VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM.DATAGRAPHNEURALACCELERATORSTATISTICS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM.PNEXT, value); }
    /** Unsafe version of {@link #dataGraphNeuralAcceleratorStatistics(boolean) dataGraphNeuralAcceleratorStatistics}. */
    public static void ndataGraphNeuralAcceleratorStatistics(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM.DATAGRAPHNEURALACCELERATORSTATISTICS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM ELEMENT_FACTORY = VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM.npNext(address()); }
        /** @return the value of the {@code dataGraphNeuralAcceleratorStatistics} field. */
        @NativeType("VkBool32")
        public boolean dataGraphNeuralAcceleratorStatistics() { return VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM.ndataGraphNeuralAcceleratorStatistics(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMDataGraphNeuralAcceleratorStatistics#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DATA_GRAPH_NEURAL_ACCELERATOR_STATISTICS_FEATURES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_DATA_GRAPH_NEURAL_ACCELERATOR_STATISTICS_FEATURES_ARM} value to the {@code sType} field. */
        public VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM.Buffer sType$Default() { return sType(ARMDataGraphNeuralAcceleratorStatistics.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DATA_GRAPH_NEURAL_ACCELERATOR_STATISTICS_FEATURES_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code dataGraphNeuralAcceleratorStatistics} field. */
        public VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM.Buffer dataGraphNeuralAcceleratorStatistics(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDataGraphNeuralAcceleratorStatisticsFeaturesARM.ndataGraphNeuralAcceleratorStatistics(address(), value ? 1 : 0); return this; }

    }

}