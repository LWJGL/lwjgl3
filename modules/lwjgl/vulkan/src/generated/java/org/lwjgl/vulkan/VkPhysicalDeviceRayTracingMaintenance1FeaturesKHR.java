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
 * struct VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 rayTracingMaintenance1;
 *     VkBool32 rayTracingPipelineTraceRaysIndirect2;
 * }}</pre>
 */
public class VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR extends Struct<VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        RAYTRACINGMAINTENANCE1,
        RAYTRACINGPIPELINETRACERAYSINDIRECT2;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        RAYTRACINGMAINTENANCE1 = layout.offsetof(2);
        RAYTRACINGPIPELINETRACERAYSINDIRECT2 = layout.offsetof(3);
    }

    protected VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(ByteBuffer container) {
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
    /** @return the value of the {@code rayTracingMaintenance1} field. */
    @NativeType("VkBool32")
    public boolean rayTracingMaintenance1() { return nrayTracingMaintenance1(address()) != 0; }
    /** @return the value of the {@code rayTracingPipelineTraceRaysIndirect2} field. */
    @NativeType("VkBool32")
    public boolean rayTracingPipelineTraceRaysIndirect2() { return nrayTracingPipelineTraceRaysIndirect2(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRRayTracingMaintenance1#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_MAINTENANCE_1_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_MAINTENANCE_1_FEATURES_KHR} value to the {@code sType} field. */
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR sType$Default() { return sType(KHRRayTracingMaintenance1.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_MAINTENANCE_1_FEATURES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code rayTracingMaintenance1} field. */
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR rayTracingMaintenance1(@NativeType("VkBool32") boolean value) { nrayTracingMaintenance1(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code rayTracingPipelineTraceRaysIndirect2} field. */
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR rayTracingPipelineTraceRaysIndirect2(@NativeType("VkBool32") boolean value) { nrayTracingPipelineTraceRaysIndirect2(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR set(
        int sType,
        long pNext,
        boolean rayTracingMaintenance1,
        boolean rayTracingPipelineTraceRaysIndirect2
    ) {
        sType(sType);
        pNext(pNext);
        rayTracingMaintenance1(rayTracingMaintenance1);
        rayTracingPipelineTraceRaysIndirect2(rayTracingPipelineTraceRaysIndirect2);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR set(VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR malloc() {
        return new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR calloc() {
        return new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR create(long address) {
        return new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #rayTracingMaintenance1}. */
    public static int nrayTracingMaintenance1(long struct) { return memGetInt(struct + VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.RAYTRACINGMAINTENANCE1); }
    /** Unsafe version of {@link #rayTracingPipelineTraceRaysIndirect2}. */
    public static int nrayTracingPipelineTraceRaysIndirect2(long struct) { return memGetInt(struct + VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.RAYTRACINGPIPELINETRACERAYSINDIRECT2); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #rayTracingMaintenance1(boolean) rayTracingMaintenance1}. */
    public static void nrayTracingMaintenance1(long struct, int value) { memPutInt(struct + VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.RAYTRACINGMAINTENANCE1, value); }
    /** Unsafe version of {@link #rayTracingPipelineTraceRaysIndirect2(boolean) rayTracingPipelineTraceRaysIndirect2}. */
    public static void nrayTracingPipelineTraceRaysIndirect2(long struct, int value) { memPutInt(struct + VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.RAYTRACINGPIPELINETRACERAYSINDIRECT2, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.npNext(address()); }
        /** @return the value of the {@code rayTracingMaintenance1} field. */
        @NativeType("VkBool32")
        public boolean rayTracingMaintenance1() { return VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.nrayTracingMaintenance1(address()) != 0; }
        /** @return the value of the {@code rayTracingPipelineTraceRaysIndirect2} field. */
        @NativeType("VkBool32")
        public boolean rayTracingPipelineTraceRaysIndirect2() { return VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.nrayTracingPipelineTraceRaysIndirect2(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRRayTracingMaintenance1#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_MAINTENANCE_1_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_MAINTENANCE_1_FEATURES_KHR} value to the {@code sType} field. */
        public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.Buffer sType$Default() { return sType(KHRRayTracingMaintenance1.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_MAINTENANCE_1_FEATURES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code rayTracingMaintenance1} field. */
        public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.Buffer rayTracingMaintenance1(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.nrayTracingMaintenance1(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code rayTracingPipelineTraceRaysIndirect2} field. */
        public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.Buffer rayTracingPipelineTraceRaysIndirect2(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.nrayTracingPipelineTraceRaysIndirect2(address(), value ? 1 : 0); return this; }

    }

}