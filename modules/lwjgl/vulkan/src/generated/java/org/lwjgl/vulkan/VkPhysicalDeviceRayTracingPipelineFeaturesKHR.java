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
 * struct VkPhysicalDeviceRayTracingPipelineFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 rayTracingPipeline;
 *     VkBool32 rayTracingPipelineShaderGroupHandleCaptureReplay;
 *     VkBool32 rayTracingPipelineShaderGroupHandleCaptureReplayMixed;
 *     VkBool32 rayTracingPipelineTraceRaysIndirect;
 *     VkBool32 rayTraversalPrimitiveCulling;
 * }}</pre>
 */
public class VkPhysicalDeviceRayTracingPipelineFeaturesKHR extends Struct<VkPhysicalDeviceRayTracingPipelineFeaturesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        RAYTRACINGPIPELINE,
        RAYTRACINGPIPELINESHADERGROUPHANDLECAPTUREREPLAY,
        RAYTRACINGPIPELINESHADERGROUPHANDLECAPTUREREPLAYMIXED,
        RAYTRACINGPIPELINETRACERAYSINDIRECT,
        RAYTRAVERSALPRIMITIVECULLING;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        RAYTRACINGPIPELINE = layout.offsetof(2);
        RAYTRACINGPIPELINESHADERGROUPHANDLECAPTUREREPLAY = layout.offsetof(3);
        RAYTRACINGPIPELINESHADERGROUPHANDLECAPTUREREPLAYMIXED = layout.offsetof(4);
        RAYTRACINGPIPELINETRACERAYSINDIRECT = layout.offsetof(5);
        RAYTRAVERSALPRIMITIVECULLING = layout.offsetof(6);
    }

    protected VkPhysicalDeviceRayTracingPipelineFeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceRayTracingPipelineFeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceRayTracingPipelineFeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceRayTracingPipelineFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR(ByteBuffer container) {
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
    /** @return the value of the {@code rayTracingPipeline} field. */
    @NativeType("VkBool32")
    public boolean rayTracingPipeline() { return nrayTracingPipeline(address()) != 0; }
    /** @return the value of the {@code rayTracingPipelineShaderGroupHandleCaptureReplay} field. */
    @NativeType("VkBool32")
    public boolean rayTracingPipelineShaderGroupHandleCaptureReplay() { return nrayTracingPipelineShaderGroupHandleCaptureReplay(address()) != 0; }
    /** @return the value of the {@code rayTracingPipelineShaderGroupHandleCaptureReplayMixed} field. */
    @NativeType("VkBool32")
    public boolean rayTracingPipelineShaderGroupHandleCaptureReplayMixed() { return nrayTracingPipelineShaderGroupHandleCaptureReplayMixed(address()) != 0; }
    /** @return the value of the {@code rayTracingPipelineTraceRaysIndirect} field. */
    @NativeType("VkBool32")
    public boolean rayTracingPipelineTraceRaysIndirect() { return nrayTracingPipelineTraceRaysIndirect(address()) != 0; }
    /** @return the value of the {@code rayTraversalPrimitiveCulling} field. */
    @NativeType("VkBool32")
    public boolean rayTraversalPrimitiveCulling() { return nrayTraversalPrimitiveCulling(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRRayTracingPipeline#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_FEATURES_KHR} value to the {@code sType} field. */
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR sType$Default() { return sType(KHRRayTracingPipeline.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_FEATURES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code rayTracingPipeline} field. */
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTracingPipeline(@NativeType("VkBool32") boolean value) { nrayTracingPipeline(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code rayTracingPipelineShaderGroupHandleCaptureReplay} field. */
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTracingPipelineShaderGroupHandleCaptureReplay(@NativeType("VkBool32") boolean value) { nrayTracingPipelineShaderGroupHandleCaptureReplay(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code rayTracingPipelineShaderGroupHandleCaptureReplayMixed} field. */
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTracingPipelineShaderGroupHandleCaptureReplayMixed(@NativeType("VkBool32") boolean value) { nrayTracingPipelineShaderGroupHandleCaptureReplayMixed(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code rayTracingPipelineTraceRaysIndirect} field. */
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTracingPipelineTraceRaysIndirect(@NativeType("VkBool32") boolean value) { nrayTracingPipelineTraceRaysIndirect(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code rayTraversalPrimitiveCulling} field. */
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTraversalPrimitiveCulling(@NativeType("VkBool32") boolean value) { nrayTraversalPrimitiveCulling(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR set(
        int sType,
        long pNext,
        boolean rayTracingPipeline,
        boolean rayTracingPipelineShaderGroupHandleCaptureReplay,
        boolean rayTracingPipelineShaderGroupHandleCaptureReplayMixed,
        boolean rayTracingPipelineTraceRaysIndirect,
        boolean rayTraversalPrimitiveCulling
    ) {
        sType(sType);
        pNext(pNext);
        rayTracingPipeline(rayTracingPipeline);
        rayTracingPipelineShaderGroupHandleCaptureReplay(rayTracingPipelineShaderGroupHandleCaptureReplay);
        rayTracingPipelineShaderGroupHandleCaptureReplayMixed(rayTracingPipelineShaderGroupHandleCaptureReplayMixed);
        rayTracingPipelineTraceRaysIndirect(rayTracingPipelineTraceRaysIndirect);
        rayTraversalPrimitiveCulling(rayTraversalPrimitiveCulling);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR set(VkPhysicalDeviceRayTracingPipelineFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceRayTracingPipelineFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR malloc() {
        return new VkPhysicalDeviceRayTracingPipelineFeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingPipelineFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR calloc() {
        return new VkPhysicalDeviceRayTracingPipelineFeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingPipelineFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceRayTracingPipelineFeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingPipelineFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR create(long address) {
        return new VkPhysicalDeviceRayTracingPipelineFeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceRayTracingPipelineFeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceRayTracingPipelineFeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRayTracingPipelineFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceRayTracingPipelineFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRayTracingPipelineFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceRayTracingPipelineFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceRayTracingPipelineFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceRayTracingPipelineFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #rayTracingPipeline}. */
    public static int nrayTracingPipeline(long struct) { return memGetInt(struct + VkPhysicalDeviceRayTracingPipelineFeaturesKHR.RAYTRACINGPIPELINE); }
    /** Unsafe version of {@link #rayTracingPipelineShaderGroupHandleCaptureReplay}. */
    public static int nrayTracingPipelineShaderGroupHandleCaptureReplay(long struct) { return memGetInt(struct + VkPhysicalDeviceRayTracingPipelineFeaturesKHR.RAYTRACINGPIPELINESHADERGROUPHANDLECAPTUREREPLAY); }
    /** Unsafe version of {@link #rayTracingPipelineShaderGroupHandleCaptureReplayMixed}. */
    public static int nrayTracingPipelineShaderGroupHandleCaptureReplayMixed(long struct) { return memGetInt(struct + VkPhysicalDeviceRayTracingPipelineFeaturesKHR.RAYTRACINGPIPELINESHADERGROUPHANDLECAPTUREREPLAYMIXED); }
    /** Unsafe version of {@link #rayTracingPipelineTraceRaysIndirect}. */
    public static int nrayTracingPipelineTraceRaysIndirect(long struct) { return memGetInt(struct + VkPhysicalDeviceRayTracingPipelineFeaturesKHR.RAYTRACINGPIPELINETRACERAYSINDIRECT); }
    /** Unsafe version of {@link #rayTraversalPrimitiveCulling}. */
    public static int nrayTraversalPrimitiveCulling(long struct) { return memGetInt(struct + VkPhysicalDeviceRayTracingPipelineFeaturesKHR.RAYTRAVERSALPRIMITIVECULLING); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceRayTracingPipelineFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceRayTracingPipelineFeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #rayTracingPipeline(boolean) rayTracingPipeline}. */
    public static void nrayTracingPipeline(long struct, int value) { memPutInt(struct + VkPhysicalDeviceRayTracingPipelineFeaturesKHR.RAYTRACINGPIPELINE, value); }
    /** Unsafe version of {@link #rayTracingPipelineShaderGroupHandleCaptureReplay(boolean) rayTracingPipelineShaderGroupHandleCaptureReplay}. */
    public static void nrayTracingPipelineShaderGroupHandleCaptureReplay(long struct, int value) { memPutInt(struct + VkPhysicalDeviceRayTracingPipelineFeaturesKHR.RAYTRACINGPIPELINESHADERGROUPHANDLECAPTUREREPLAY, value); }
    /** Unsafe version of {@link #rayTracingPipelineShaderGroupHandleCaptureReplayMixed(boolean) rayTracingPipelineShaderGroupHandleCaptureReplayMixed}. */
    public static void nrayTracingPipelineShaderGroupHandleCaptureReplayMixed(long struct, int value) { memPutInt(struct + VkPhysicalDeviceRayTracingPipelineFeaturesKHR.RAYTRACINGPIPELINESHADERGROUPHANDLECAPTUREREPLAYMIXED, value); }
    /** Unsafe version of {@link #rayTracingPipelineTraceRaysIndirect(boolean) rayTracingPipelineTraceRaysIndirect}. */
    public static void nrayTracingPipelineTraceRaysIndirect(long struct, int value) { memPutInt(struct + VkPhysicalDeviceRayTracingPipelineFeaturesKHR.RAYTRACINGPIPELINETRACERAYSINDIRECT, value); }
    /** Unsafe version of {@link #rayTraversalPrimitiveCulling(boolean) rayTraversalPrimitiveCulling}. */
    public static void nrayTraversalPrimitiveCulling(long struct, int value) { memPutInt(struct + VkPhysicalDeviceRayTracingPipelineFeaturesKHR.RAYTRAVERSALPRIMITIVECULLING, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRayTracingPipelineFeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceRayTracingPipelineFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceRayTracingPipelineFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceRayTracingPipelineFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.npNext(address()); }
        /** @return the value of the {@code rayTracingPipeline} field. */
        @NativeType("VkBool32")
        public boolean rayTracingPipeline() { return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.nrayTracingPipeline(address()) != 0; }
        /** @return the value of the {@code rayTracingPipelineShaderGroupHandleCaptureReplay} field. */
        @NativeType("VkBool32")
        public boolean rayTracingPipelineShaderGroupHandleCaptureReplay() { return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.nrayTracingPipelineShaderGroupHandleCaptureReplay(address()) != 0; }
        /** @return the value of the {@code rayTracingPipelineShaderGroupHandleCaptureReplayMixed} field. */
        @NativeType("VkBool32")
        public boolean rayTracingPipelineShaderGroupHandleCaptureReplayMixed() { return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.nrayTracingPipelineShaderGroupHandleCaptureReplayMixed(address()) != 0; }
        /** @return the value of the {@code rayTracingPipelineTraceRaysIndirect} field. */
        @NativeType("VkBool32")
        public boolean rayTracingPipelineTraceRaysIndirect() { return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.nrayTracingPipelineTraceRaysIndirect(address()) != 0; }
        /** @return the value of the {@code rayTraversalPrimitiveCulling} field. */
        @NativeType("VkBool32")
        public boolean rayTraversalPrimitiveCulling() { return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.nrayTraversalPrimitiveCulling(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceRayTracingPipelineFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRRayTracingPipeline#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_FEATURES_KHR} value to the {@code sType} field. */
        public VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer sType$Default() { return sType(KHRRayTracingPipeline.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_FEATURES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceRayTracingPipelineFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code rayTracingPipeline} field. */
        public VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer rayTracingPipeline(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceRayTracingPipelineFeaturesKHR.nrayTracingPipeline(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code rayTracingPipelineShaderGroupHandleCaptureReplay} field. */
        public VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer rayTracingPipelineShaderGroupHandleCaptureReplay(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceRayTracingPipelineFeaturesKHR.nrayTracingPipelineShaderGroupHandleCaptureReplay(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code rayTracingPipelineShaderGroupHandleCaptureReplayMixed} field. */
        public VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer rayTracingPipelineShaderGroupHandleCaptureReplayMixed(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceRayTracingPipelineFeaturesKHR.nrayTracingPipelineShaderGroupHandleCaptureReplayMixed(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code rayTracingPipelineTraceRaysIndirect} field. */
        public VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer rayTracingPipelineTraceRaysIndirect(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceRayTracingPipelineFeaturesKHR.nrayTracingPipelineTraceRaysIndirect(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code rayTraversalPrimitiveCulling} field. */
        public VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer rayTraversalPrimitiveCulling(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceRayTracingPipelineFeaturesKHR.nrayTraversalPrimitiveCulling(address(), value ? 1 : 0); return this; }

    }

}