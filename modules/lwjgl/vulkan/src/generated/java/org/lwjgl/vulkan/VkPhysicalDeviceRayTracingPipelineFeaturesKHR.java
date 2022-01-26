/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure describing the ray tracing features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code rayTracingPipelineShaderGroupHandleCaptureReplayMixed} is {@link VK10#VK_TRUE TRUE}, {@code rayTracingPipelineShaderGroupHandleCaptureReplay} <b>must</b> also be {@link VK10#VK_TRUE TRUE}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRRayTracingPipeline#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_FEATURES_KHR}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceRayTracingPipelineFeaturesKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #rayTracingPipeline};
 *     VkBool32 {@link #rayTracingPipelineShaderGroupHandleCaptureReplay};
 *     VkBool32 {@link #rayTracingPipelineShaderGroupHandleCaptureReplayMixed};
 *     VkBool32 {@link #rayTracingPipelineTraceRaysIndirect};
 *     VkBool32 {@link #rayTraversalPrimitiveCulling};
 * }</code></pre>
 */
public class VkPhysicalDeviceRayTracingPipelineFeaturesKHR extends Struct implements NativeResource {

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

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** indicates whether the implementation supports the ray tracing pipeline functionality. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#ray-tracing">Ray Tracing</a>. */
    @NativeType("VkBool32")
    public boolean rayTracingPipeline() { return nrayTracingPipeline(address()) != 0; }
    /** indicates whether the implementation supports saving and reusing shader group handles, e.g. for trace capture and replay. */
    @NativeType("VkBool32")
    public boolean rayTracingPipelineShaderGroupHandleCaptureReplay() { return nrayTracingPipelineShaderGroupHandleCaptureReplay(address()) != 0; }
    /** indicates whether the implementation supports reuse of shader group handles being arbitrarily mixed with creation of non-reused shader group handles. If this is {@link VK10#VK_FALSE FALSE}, all reused shader group handles <b>must</b> be specified before any non-reused handles <b>may</b> be created. */
    @NativeType("VkBool32")
    public boolean rayTracingPipelineShaderGroupHandleCaptureReplayMixed() { return nrayTracingPipelineShaderGroupHandleCaptureReplayMixed(address()) != 0; }
    /** indicates whether the implementation supports indirect ray tracing commands, e.g. {@link KHRRayTracingPipeline#vkCmdTraceRaysIndirectKHR CmdTraceRaysIndirectKHR}. */
    @NativeType("VkBool32")
    public boolean rayTracingPipelineTraceRaysIndirect() { return nrayTracingPipelineTraceRaysIndirect(address()) != 0; }
    /** indicates whether the implementation supports <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#ray-traversal-culling-primitive">primitive culling during ray traversal</a>. */
    @NativeType("VkBool32")
    public boolean rayTraversalPrimitiveCulling() { return nrayTraversalPrimitiveCulling(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRRayTracingPipeline#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_FEATURES_KHR} value to the {@link #sType} field. */
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR sType$Default() { return sType(KHRRayTracingPipeline.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_FEATURES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #rayTracingPipeline} field. */
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTracingPipeline(@NativeType("VkBool32") boolean value) { nrayTracingPipeline(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #rayTracingPipelineShaderGroupHandleCaptureReplay} field. */
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTracingPipelineShaderGroupHandleCaptureReplay(@NativeType("VkBool32") boolean value) { nrayTracingPipelineShaderGroupHandleCaptureReplay(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #rayTracingPipelineShaderGroupHandleCaptureReplayMixed} field. */
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTracingPipelineShaderGroupHandleCaptureReplayMixed(@NativeType("VkBool32") boolean value) { nrayTracingPipelineShaderGroupHandleCaptureReplayMixed(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #rayTracingPipelineTraceRaysIndirect} field. */
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTracingPipelineTraceRaysIndirect(@NativeType("VkBool32") boolean value) { nrayTracingPipelineTraceRaysIndirect(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #rayTraversalPrimitiveCulling} field. */
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
        return wrap(VkPhysicalDeviceRayTracingPipelineFeaturesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingPipelineFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR calloc() {
        return wrap(VkPhysicalDeviceRayTracingPipelineFeaturesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingPipelineFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceRayTracingPipelineFeaturesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingPipelineFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR create(long address) {
        return wrap(VkPhysicalDeviceRayTracingPipelineFeaturesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceRayTracingPipelineFeaturesKHR.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRayTracingPipelineFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceRayTracingPipelineFeaturesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRayTracingPipelineFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceRayTracingPipelineFeaturesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRayTracingPipelineFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceRayTracingPipelineFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #rayTracingPipeline}. */
    public static int nrayTracingPipeline(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRayTracingPipelineFeaturesKHR.RAYTRACINGPIPELINE); }
    /** Unsafe version of {@link #rayTracingPipelineShaderGroupHandleCaptureReplay}. */
    public static int nrayTracingPipelineShaderGroupHandleCaptureReplay(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRayTracingPipelineFeaturesKHR.RAYTRACINGPIPELINESHADERGROUPHANDLECAPTUREREPLAY); }
    /** Unsafe version of {@link #rayTracingPipelineShaderGroupHandleCaptureReplayMixed}. */
    public static int nrayTracingPipelineShaderGroupHandleCaptureReplayMixed(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRayTracingPipelineFeaturesKHR.RAYTRACINGPIPELINESHADERGROUPHANDLECAPTUREREPLAYMIXED); }
    /** Unsafe version of {@link #rayTracingPipelineTraceRaysIndirect}. */
    public static int nrayTracingPipelineTraceRaysIndirect(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRayTracingPipelineFeaturesKHR.RAYTRACINGPIPELINETRACERAYSINDIRECT); }
    /** Unsafe version of {@link #rayTraversalPrimitiveCulling}. */
    public static int nrayTraversalPrimitiveCulling(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRayTracingPipelineFeaturesKHR.RAYTRAVERSALPRIMITIVECULLING); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceRayTracingPipelineFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceRayTracingPipelineFeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #rayTracingPipeline(boolean) rayTracingPipeline}. */
    public static void nrayTracingPipeline(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceRayTracingPipelineFeaturesKHR.RAYTRACINGPIPELINE, value); }
    /** Unsafe version of {@link #rayTracingPipelineShaderGroupHandleCaptureReplay(boolean) rayTracingPipelineShaderGroupHandleCaptureReplay}. */
    public static void nrayTracingPipelineShaderGroupHandleCaptureReplay(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceRayTracingPipelineFeaturesKHR.RAYTRACINGPIPELINESHADERGROUPHANDLECAPTUREREPLAY, value); }
    /** Unsafe version of {@link #rayTracingPipelineShaderGroupHandleCaptureReplayMixed(boolean) rayTracingPipelineShaderGroupHandleCaptureReplayMixed}. */
    public static void nrayTracingPipelineShaderGroupHandleCaptureReplayMixed(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceRayTracingPipelineFeaturesKHR.RAYTRACINGPIPELINESHADERGROUPHANDLECAPTUREREPLAYMIXED, value); }
    /** Unsafe version of {@link #rayTracingPipelineTraceRaysIndirect(boolean) rayTracingPipelineTraceRaysIndirect}. */
    public static void nrayTracingPipelineTraceRaysIndirect(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceRayTracingPipelineFeaturesKHR.RAYTRACINGPIPELINETRACERAYSINDIRECT, value); }
    /** Unsafe version of {@link #rayTraversalPrimitiveCulling(boolean) rayTraversalPrimitiveCulling}. */
    public static void nrayTraversalPrimitiveCulling(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceRayTracingPipelineFeaturesKHR.RAYTRAVERSALPRIMITIVECULLING, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRayTracingPipelineFeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceRayTracingPipelineFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceRayTracingPipelineFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceRayTracingPipelineFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR#rayTracingPipeline} field. */
        @NativeType("VkBool32")
        public boolean rayTracingPipeline() { return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.nrayTracingPipeline(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR#rayTracingPipelineShaderGroupHandleCaptureReplay} field. */
        @NativeType("VkBool32")
        public boolean rayTracingPipelineShaderGroupHandleCaptureReplay() { return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.nrayTracingPipelineShaderGroupHandleCaptureReplay(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR#rayTracingPipelineShaderGroupHandleCaptureReplayMixed} field. */
        @NativeType("VkBool32")
        public boolean rayTracingPipelineShaderGroupHandleCaptureReplayMixed() { return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.nrayTracingPipelineShaderGroupHandleCaptureReplayMixed(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR#rayTracingPipelineTraceRaysIndirect} field. */
        @NativeType("VkBool32")
        public boolean rayTracingPipelineTraceRaysIndirect() { return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.nrayTracingPipelineTraceRaysIndirect(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR#rayTraversalPrimitiveCulling} field. */
        @NativeType("VkBool32")
        public boolean rayTraversalPrimitiveCulling() { return VkPhysicalDeviceRayTracingPipelineFeaturesKHR.nrayTraversalPrimitiveCulling(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR#sType} field. */
        public VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceRayTracingPipelineFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRRayTracingPipeline#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_FEATURES_KHR} value to the {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR#sType} field. */
        public VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer sType$Default() { return sType(KHRRayTracingPipeline.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_FEATURES_KHR); }
        /** Sets the specified value to the {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR#pNext} field. */
        public VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceRayTracingPipelineFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR#rayTracingPipeline} field. */
        public VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer rayTracingPipeline(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceRayTracingPipelineFeaturesKHR.nrayTracingPipeline(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR#rayTracingPipelineShaderGroupHandleCaptureReplay} field. */
        public VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer rayTracingPipelineShaderGroupHandleCaptureReplay(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceRayTracingPipelineFeaturesKHR.nrayTracingPipelineShaderGroupHandleCaptureReplay(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR#rayTracingPipelineShaderGroupHandleCaptureReplayMixed} field. */
        public VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer rayTracingPipelineShaderGroupHandleCaptureReplayMixed(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceRayTracingPipelineFeaturesKHR.nrayTracingPipelineShaderGroupHandleCaptureReplayMixed(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR#rayTracingPipelineTraceRaysIndirect} field. */
        public VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer rayTracingPipelineTraceRaysIndirect(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceRayTracingPipelineFeaturesKHR.nrayTracingPipelineTraceRaysIndirect(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceRayTracingPipelineFeaturesKHR#rayTraversalPrimitiveCulling} field. */
        public VkPhysicalDeviceRayTracingPipelineFeaturesKHR.Buffer rayTraversalPrimitiveCulling(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceRayTracingPipelineFeaturesKHR.nrayTraversalPrimitiveCulling(address(), value ? 1 : 0); return this; }

    }

}