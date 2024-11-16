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
 * Structure describing the ray tracing motion blur features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceRayTracingMotionBlurFeaturesNV} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceRayTracingMotionBlurFeaturesNV} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVRayTracingMotionBlur#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_MOTION_BLUR_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_MOTION_BLUR_FEATURES_NV}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceRayTracingMotionBlurFeaturesNV {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #rayTracingMotionBlur};
 *     VkBool32 {@link #rayTracingMotionBlurPipelineTraceRaysIndirect};
 * }</code></pre>
 */
public class VkPhysicalDeviceRayTracingMotionBlurFeaturesNV extends Struct<VkPhysicalDeviceRayTracingMotionBlurFeaturesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        RAYTRACINGMOTIONBLUR,
        RAYTRACINGMOTIONBLURPIPELINETRACERAYSINDIRECT;

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
        RAYTRACINGMOTIONBLUR = layout.offsetof(2);
        RAYTRACINGMOTIONBLURPIPELINETRACERAYSINDIRECT = layout.offsetof(3);
    }

    protected VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceRayTracingMotionBlurFeaturesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceRayTracingMotionBlurFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** indicates whether the implementation supports the motion blur feature. */
    @NativeType("VkBool32")
    public boolean rayTracingMotionBlur() { return nrayTracingMotionBlur(address()) != 0; }
    /** indicates whether the implementation supports indirect ray tracing commands with the motion blur feature enabled. */
    @NativeType("VkBool32")
    public boolean rayTracingMotionBlurPipelineTraceRaysIndirect() { return nrayTracingMotionBlurPipelineTraceRaysIndirect(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVRayTracingMotionBlur#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_MOTION_BLUR_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_MOTION_BLUR_FEATURES_NV} value to the {@link #sType} field. */
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV sType$Default() { return sType(NVRayTracingMotionBlur.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_MOTION_BLUR_FEATURES_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #rayTracingMotionBlur} field. */
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV rayTracingMotionBlur(@NativeType("VkBool32") boolean value) { nrayTracingMotionBlur(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #rayTracingMotionBlurPipelineTraceRaysIndirect} field. */
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV rayTracingMotionBlurPipelineTraceRaysIndirect(@NativeType("VkBool32") boolean value) { nrayTracingMotionBlurPipelineTraceRaysIndirect(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV set(
        int sType,
        long pNext,
        boolean rayTracingMotionBlur,
        boolean rayTracingMotionBlurPipelineTraceRaysIndirect
    ) {
        sType(sType);
        pNext(pNext);
        rayTracingMotionBlur(rayTracingMotionBlur);
        rayTracingMotionBlurPipelineTraceRaysIndirect(rayTracingMotionBlurPipelineTraceRaysIndirect);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV set(VkPhysicalDeviceRayTracingMotionBlurFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceRayTracingMotionBlurFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRayTracingMotionBlurFeaturesNV malloc() {
        return new VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingMotionBlurFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRayTracingMotionBlurFeaturesNV calloc() {
        return new VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingMotionBlurFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceRayTracingMotionBlurFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingMotionBlurFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceRayTracingMotionBlurFeaturesNV create(long address) {
        return new VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceRayTracingMotionBlurFeaturesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingMotionBlurFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingMotionBlurFeaturesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingMotionBlurFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingMotionBlurFeaturesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingMotionBlurFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingMotionBlurFeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceRayTracingMotionBlurFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingMotionBlurFeaturesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceRayTracingMotionBlurFeaturesNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRayTracingMotionBlurFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRayTracingMotionBlurFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRayTracingMotionBlurFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRayTracingMotionBlurFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingMotionBlurFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingMotionBlurFeaturesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingMotionBlurFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingMotionBlurFeaturesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceRayTracingMotionBlurFeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceRayTracingMotionBlurFeaturesNV.PNEXT); }
    /** Unsafe version of {@link #rayTracingMotionBlur}. */
    public static int nrayTracingMotionBlur(long struct) { return memGetInt(struct + VkPhysicalDeviceRayTracingMotionBlurFeaturesNV.RAYTRACINGMOTIONBLUR); }
    /** Unsafe version of {@link #rayTracingMotionBlurPipelineTraceRaysIndirect}. */
    public static int nrayTracingMotionBlurPipelineTraceRaysIndirect(long struct) { return memGetInt(struct + VkPhysicalDeviceRayTracingMotionBlurFeaturesNV.RAYTRACINGMOTIONBLURPIPELINETRACERAYSINDIRECT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceRayTracingMotionBlurFeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceRayTracingMotionBlurFeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #rayTracingMotionBlur(boolean) rayTracingMotionBlur}. */
    public static void nrayTracingMotionBlur(long struct, int value) { memPutInt(struct + VkPhysicalDeviceRayTracingMotionBlurFeaturesNV.RAYTRACINGMOTIONBLUR, value); }
    /** Unsafe version of {@link #rayTracingMotionBlurPipelineTraceRaysIndirect(boolean) rayTracingMotionBlurPipelineTraceRaysIndirect}. */
    public static void nrayTracingMotionBlurPipelineTraceRaysIndirect(long struct, int value) { memPutInt(struct + VkPhysicalDeviceRayTracingMotionBlurFeaturesNV.RAYTRACINGMOTIONBLURPIPELINETRACERAYSINDIRECT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceRayTracingMotionBlurFeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRayTracingMotionBlurFeaturesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceRayTracingMotionBlurFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceRayTracingMotionBlurFeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceRayTracingMotionBlurFeaturesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceRayTracingMotionBlurFeaturesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceRayTracingMotionBlurFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceRayTracingMotionBlurFeaturesNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceRayTracingMotionBlurFeaturesNV.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceRayTracingMotionBlurFeaturesNV#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceRayTracingMotionBlurFeaturesNV.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceRayTracingMotionBlurFeaturesNV#rayTracingMotionBlur} field. */
        @NativeType("VkBool32")
        public boolean rayTracingMotionBlur() { return VkPhysicalDeviceRayTracingMotionBlurFeaturesNV.nrayTracingMotionBlur(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceRayTracingMotionBlurFeaturesNV#rayTracingMotionBlurPipelineTraceRaysIndirect} field. */
        @NativeType("VkBool32")
        public boolean rayTracingMotionBlurPipelineTraceRaysIndirect() { return VkPhysicalDeviceRayTracingMotionBlurFeaturesNV.nrayTracingMotionBlurPipelineTraceRaysIndirect(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceRayTracingMotionBlurFeaturesNV#sType} field. */
        public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceRayTracingMotionBlurFeaturesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVRayTracingMotionBlur#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_MOTION_BLUR_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_MOTION_BLUR_FEATURES_NV} value to the {@link VkPhysicalDeviceRayTracingMotionBlurFeaturesNV#sType} field. */
        public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV.Buffer sType$Default() { return sType(NVRayTracingMotionBlur.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_MOTION_BLUR_FEATURES_NV); }
        /** Sets the specified value to the {@link VkPhysicalDeviceRayTracingMotionBlurFeaturesNV#pNext} field. */
        public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceRayTracingMotionBlurFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceRayTracingMotionBlurFeaturesNV#rayTracingMotionBlur} field. */
        public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV.Buffer rayTracingMotionBlur(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceRayTracingMotionBlurFeaturesNV.nrayTracingMotionBlur(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceRayTracingMotionBlurFeaturesNV#rayTracingMotionBlurPipelineTraceRaysIndirect} field. */
        public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV.Buffer rayTracingMotionBlurPipelineTraceRaysIndirect(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceRayTracingMotionBlurFeaturesNV.nrayTracingMotionBlurPipelineTraceRaysIndirect(address(), value ? 1 : 0); return this; }

    }

}