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
 * struct VkPhysicalDevicePerformanceCountersByRegionFeaturesARM {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 performanceCountersByRegion;
 * }}</pre>
 */
public class VkPhysicalDevicePerformanceCountersByRegionFeaturesARM extends Struct<VkPhysicalDevicePerformanceCountersByRegionFeaturesARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PERFORMANCECOUNTERSBYREGION;

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
        PERFORMANCECOUNTERSBYREGION = layout.offsetof(2);
    }

    protected VkPhysicalDevicePerformanceCountersByRegionFeaturesARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDevicePerformanceCountersByRegionFeaturesARM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDevicePerformanceCountersByRegionFeaturesARM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDevicePerformanceCountersByRegionFeaturesARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevicePerformanceCountersByRegionFeaturesARM(ByteBuffer container) {
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
    /** @return the value of the {@code performanceCountersByRegion} field. */
    @NativeType("VkBool32")
    public boolean performanceCountersByRegion() { return nperformanceCountersByRegion(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDevicePerformanceCountersByRegionFeaturesARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMPerformanceCountersByRegion#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_COUNTERS_BY_REGION_FEATURES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_COUNTERS_BY_REGION_FEATURES_ARM} value to the {@code sType} field. */
    public VkPhysicalDevicePerformanceCountersByRegionFeaturesARM sType$Default() { return sType(ARMPerformanceCountersByRegion.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_COUNTERS_BY_REGION_FEATURES_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDevicePerformanceCountersByRegionFeaturesARM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code performanceCountersByRegion} field. */
    public VkPhysicalDevicePerformanceCountersByRegionFeaturesARM performanceCountersByRegion(@NativeType("VkBool32") boolean value) { nperformanceCountersByRegion(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDevicePerformanceCountersByRegionFeaturesARM set(
        int sType,
        long pNext,
        boolean performanceCountersByRegion
    ) {
        sType(sType);
        pNext(pNext);
        performanceCountersByRegion(performanceCountersByRegion);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDevicePerformanceCountersByRegionFeaturesARM set(VkPhysicalDevicePerformanceCountersByRegionFeaturesARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevicePerformanceCountersByRegionFeaturesARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePerformanceCountersByRegionFeaturesARM malloc() {
        return new VkPhysicalDevicePerformanceCountersByRegionFeaturesARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePerformanceCountersByRegionFeaturesARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePerformanceCountersByRegionFeaturesARM calloc() {
        return new VkPhysicalDevicePerformanceCountersByRegionFeaturesARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePerformanceCountersByRegionFeaturesARM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevicePerformanceCountersByRegionFeaturesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePerformanceCountersByRegionFeaturesARM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevicePerformanceCountersByRegionFeaturesARM} instance for the specified memory address. */
    public static VkPhysicalDevicePerformanceCountersByRegionFeaturesARM create(long address) {
        return new VkPhysicalDevicePerformanceCountersByRegionFeaturesARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDevicePerformanceCountersByRegionFeaturesARM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDevicePerformanceCountersByRegionFeaturesARM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePerformanceCountersByRegionFeaturesARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePerformanceCountersByRegionFeaturesARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePerformanceCountersByRegionFeaturesARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePerformanceCountersByRegionFeaturesARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePerformanceCountersByRegionFeaturesARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePerformanceCountersByRegionFeaturesARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDevicePerformanceCountersByRegionFeaturesARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePerformanceCountersByRegionFeaturesARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDevicePerformanceCountersByRegionFeaturesARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePerformanceCountersByRegionFeaturesARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePerformanceCountersByRegionFeaturesARM malloc(MemoryStack stack) {
        return new VkPhysicalDevicePerformanceCountersByRegionFeaturesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePerformanceCountersByRegionFeaturesARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePerformanceCountersByRegionFeaturesARM calloc(MemoryStack stack) {
        return new VkPhysicalDevicePerformanceCountersByRegionFeaturesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePerformanceCountersByRegionFeaturesARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePerformanceCountersByRegionFeaturesARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePerformanceCountersByRegionFeaturesARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePerformanceCountersByRegionFeaturesARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDevicePerformanceCountersByRegionFeaturesARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevicePerformanceCountersByRegionFeaturesARM.PNEXT); }
    /** Unsafe version of {@link #performanceCountersByRegion}. */
    public static int nperformanceCountersByRegion(long struct) { return memGetInt(struct + VkPhysicalDevicePerformanceCountersByRegionFeaturesARM.PERFORMANCECOUNTERSBYREGION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDevicePerformanceCountersByRegionFeaturesARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevicePerformanceCountersByRegionFeaturesARM.PNEXT, value); }
    /** Unsafe version of {@link #performanceCountersByRegion(boolean) performanceCountersByRegion}. */
    public static void nperformanceCountersByRegion(long struct, int value) { memPutInt(struct + VkPhysicalDevicePerformanceCountersByRegionFeaturesARM.PERFORMANCECOUNTERSBYREGION, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevicePerformanceCountersByRegionFeaturesARM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePerformanceCountersByRegionFeaturesARM, Buffer> implements NativeResource {

        private static final VkPhysicalDevicePerformanceCountersByRegionFeaturesARM ELEMENT_FACTORY = VkPhysicalDevicePerformanceCountersByRegionFeaturesARM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevicePerformanceCountersByRegionFeaturesARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevicePerformanceCountersByRegionFeaturesARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDevicePerformanceCountersByRegionFeaturesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevicePerformanceCountersByRegionFeaturesARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevicePerformanceCountersByRegionFeaturesARM.npNext(address()); }
        /** @return the value of the {@code performanceCountersByRegion} field. */
        @NativeType("VkBool32")
        public boolean performanceCountersByRegion() { return VkPhysicalDevicePerformanceCountersByRegionFeaturesARM.nperformanceCountersByRegion(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDevicePerformanceCountersByRegionFeaturesARM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevicePerformanceCountersByRegionFeaturesARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMPerformanceCountersByRegion#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_COUNTERS_BY_REGION_FEATURES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_COUNTERS_BY_REGION_FEATURES_ARM} value to the {@code sType} field. */
        public VkPhysicalDevicePerformanceCountersByRegionFeaturesARM.Buffer sType$Default() { return sType(ARMPerformanceCountersByRegion.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_COUNTERS_BY_REGION_FEATURES_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDevicePerformanceCountersByRegionFeaturesARM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevicePerformanceCountersByRegionFeaturesARM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code performanceCountersByRegion} field. */
        public VkPhysicalDevicePerformanceCountersByRegionFeaturesARM.Buffer performanceCountersByRegion(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePerformanceCountersByRegionFeaturesARM.nperformanceCountersByRegion(address(), value ? 1 : 0); return this; }

    }

}