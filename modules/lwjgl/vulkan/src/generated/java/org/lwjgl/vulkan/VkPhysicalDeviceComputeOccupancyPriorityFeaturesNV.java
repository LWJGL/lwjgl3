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
 * struct VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 computeOccupancyPriority;
 * }}</pre>
 */
public class VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV extends Struct<VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        COMPUTEOCCUPANCYPRIORITY;

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
        COMPUTEOCCUPANCYPRIORITY = layout.offsetof(2);
    }

    protected VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV(ByteBuffer container) {
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
    /** @return the value of the {@code computeOccupancyPriority} field. */
    @NativeType("VkBool32")
    public boolean computeOccupancyPriority() { return ncomputeOccupancyPriority(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVComputeOccupancyPriority#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_OCCUPANCY_PRIORITY_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_OCCUPANCY_PRIORITY_FEATURES_NV} value to the {@code sType} field. */
    public VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV sType$Default() { return sType(NVComputeOccupancyPriority.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_OCCUPANCY_PRIORITY_FEATURES_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code computeOccupancyPriority} field. */
    public VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV computeOccupancyPriority(@NativeType("VkBool32") boolean value) { ncomputeOccupancyPriority(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV set(
        int sType,
        long pNext,
        boolean computeOccupancyPriority
    ) {
        sType(sType);
        pNext(pNext);
        computeOccupancyPriority(computeOccupancyPriority);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV set(VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV malloc() {
        return new VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV calloc() {
        return new VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV create(long address) {
        return new VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV.PNEXT); }
    /** Unsafe version of {@link #computeOccupancyPriority}. */
    public static int ncomputeOccupancyPriority(long struct) { return memGetInt(struct + VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV.COMPUTEOCCUPANCYPRIORITY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #computeOccupancyPriority(boolean) computeOccupancyPriority}. */
    public static void ncomputeOccupancyPriority(long struct, int value) { memPutInt(struct + VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV.COMPUTEOCCUPANCYPRIORITY, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV.npNext(address()); }
        /** @return the value of the {@code computeOccupancyPriority} field. */
        @NativeType("VkBool32")
        public boolean computeOccupancyPriority() { return VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV.ncomputeOccupancyPriority(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVComputeOccupancyPriority#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_OCCUPANCY_PRIORITY_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_OCCUPANCY_PRIORITY_FEATURES_NV} value to the {@code sType} field. */
        public VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV.Buffer sType$Default() { return sType(NVComputeOccupancyPriority.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_OCCUPANCY_PRIORITY_FEATURES_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code computeOccupancyPriority} field. */
        public VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV.Buffer computeOccupancyPriority(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceComputeOccupancyPriorityFeaturesNV.ncomputeOccupancyPriority(address(), value ? 1 : 0); return this; }

    }

}