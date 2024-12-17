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
 * struct VkPhysicalDeviceRayTracingPipelinePropertiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t shaderGroupHandleSize;
 *     uint32_t maxRayRecursionDepth;
 *     uint32_t maxShaderGroupStride;
 *     uint32_t shaderGroupBaseAlignment;
 *     uint32_t shaderGroupHandleCaptureReplaySize;
 *     uint32_t maxRayDispatchInvocationCount;
 *     uint32_t shaderGroupHandleAlignment;
 *     uint32_t maxRayHitAttributeSize;
 * }}</pre>
 */
public class VkPhysicalDeviceRayTracingPipelinePropertiesKHR extends Struct<VkPhysicalDeviceRayTracingPipelinePropertiesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERGROUPHANDLESIZE,
        MAXRAYRECURSIONDEPTH,
        MAXSHADERGROUPSTRIDE,
        SHADERGROUPBASEALIGNMENT,
        SHADERGROUPHANDLECAPTUREREPLAYSIZE,
        MAXRAYDISPATCHINVOCATIONCOUNT,
        SHADERGROUPHANDLEALIGNMENT,
        MAXRAYHITATTRIBUTESIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
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
        SHADERGROUPHANDLESIZE = layout.offsetof(2);
        MAXRAYRECURSIONDEPTH = layout.offsetof(3);
        MAXSHADERGROUPSTRIDE = layout.offsetof(4);
        SHADERGROUPBASEALIGNMENT = layout.offsetof(5);
        SHADERGROUPHANDLECAPTUREREPLAYSIZE = layout.offsetof(6);
        MAXRAYDISPATCHINVOCATIONCOUNT = layout.offsetof(7);
        SHADERGROUPHANDLEALIGNMENT = layout.offsetof(8);
        MAXRAYHITATTRIBUTESIZE = layout.offsetof(9);
    }

    protected VkPhysicalDeviceRayTracingPipelinePropertiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceRayTracingPipelinePropertiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceRayTracingPipelinePropertiesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceRayTracingPipelinePropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR(ByteBuffer container) {
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
    /** @return the value of the {@code shaderGroupHandleSize} field. */
    @NativeType("uint32_t")
    public int shaderGroupHandleSize() { return nshaderGroupHandleSize(address()); }
    /** @return the value of the {@code maxRayRecursionDepth} field. */
    @NativeType("uint32_t")
    public int maxRayRecursionDepth() { return nmaxRayRecursionDepth(address()); }
    /** @return the value of the {@code maxShaderGroupStride} field. */
    @NativeType("uint32_t")
    public int maxShaderGroupStride() { return nmaxShaderGroupStride(address()); }
    /** @return the value of the {@code shaderGroupBaseAlignment} field. */
    @NativeType("uint32_t")
    public int shaderGroupBaseAlignment() { return nshaderGroupBaseAlignment(address()); }
    /** @return the value of the {@code shaderGroupHandleCaptureReplaySize} field. */
    @NativeType("uint32_t")
    public int shaderGroupHandleCaptureReplaySize() { return nshaderGroupHandleCaptureReplaySize(address()); }
    /** @return the value of the {@code maxRayDispatchInvocationCount} field. */
    @NativeType("uint32_t")
    public int maxRayDispatchInvocationCount() { return nmaxRayDispatchInvocationCount(address()); }
    /** @return the value of the {@code shaderGroupHandleAlignment} field. */
    @NativeType("uint32_t")
    public int shaderGroupHandleAlignment() { return nshaderGroupHandleAlignment(address()); }
    /** @return the value of the {@code maxRayHitAttributeSize} field. */
    @NativeType("uint32_t")
    public int maxRayHitAttributeSize() { return nmaxRayHitAttributeSize(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRRayTracingPipeline#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_PROPERTIES_KHR} value to the {@code sType} field. */
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR sType$Default() { return sType(KHRRayTracingPipeline.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_PROPERTIES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR set(VkPhysicalDeviceRayTracingPipelinePropertiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceRayTracingPipelinePropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR malloc() {
        return new VkPhysicalDeviceRayTracingPipelinePropertiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingPipelinePropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR calloc() {
        return new VkPhysicalDeviceRayTracingPipelinePropertiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingPipelinePropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceRayTracingPipelinePropertiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingPipelinePropertiesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR create(long address) {
        return new VkPhysicalDeviceRayTracingPipelinePropertiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceRayTracingPipelinePropertiesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceRayTracingPipelinePropertiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRayTracingPipelinePropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceRayTracingPipelinePropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRayTracingPipelinePropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceRayTracingPipelinePropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceRayTracingPipelinePropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceRayTracingPipelinePropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #shaderGroupHandleSize}. */
    public static int nshaderGroupHandleSize(long struct) { return memGetInt(struct + VkPhysicalDeviceRayTracingPipelinePropertiesKHR.SHADERGROUPHANDLESIZE); }
    /** Unsafe version of {@link #maxRayRecursionDepth}. */
    public static int nmaxRayRecursionDepth(long struct) { return memGetInt(struct + VkPhysicalDeviceRayTracingPipelinePropertiesKHR.MAXRAYRECURSIONDEPTH); }
    /** Unsafe version of {@link #maxShaderGroupStride}. */
    public static int nmaxShaderGroupStride(long struct) { return memGetInt(struct + VkPhysicalDeviceRayTracingPipelinePropertiesKHR.MAXSHADERGROUPSTRIDE); }
    /** Unsafe version of {@link #shaderGroupBaseAlignment}. */
    public static int nshaderGroupBaseAlignment(long struct) { return memGetInt(struct + VkPhysicalDeviceRayTracingPipelinePropertiesKHR.SHADERGROUPBASEALIGNMENT); }
    /** Unsafe version of {@link #shaderGroupHandleCaptureReplaySize}. */
    public static int nshaderGroupHandleCaptureReplaySize(long struct) { return memGetInt(struct + VkPhysicalDeviceRayTracingPipelinePropertiesKHR.SHADERGROUPHANDLECAPTUREREPLAYSIZE); }
    /** Unsafe version of {@link #maxRayDispatchInvocationCount}. */
    public static int nmaxRayDispatchInvocationCount(long struct) { return memGetInt(struct + VkPhysicalDeviceRayTracingPipelinePropertiesKHR.MAXRAYDISPATCHINVOCATIONCOUNT); }
    /** Unsafe version of {@link #shaderGroupHandleAlignment}. */
    public static int nshaderGroupHandleAlignment(long struct) { return memGetInt(struct + VkPhysicalDeviceRayTracingPipelinePropertiesKHR.SHADERGROUPHANDLEALIGNMENT); }
    /** Unsafe version of {@link #maxRayHitAttributeSize}. */
    public static int nmaxRayHitAttributeSize(long struct) { return memGetInt(struct + VkPhysicalDeviceRayTracingPipelinePropertiesKHR.MAXRAYHITATTRIBUTESIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceRayTracingPipelinePropertiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceRayTracingPipelinePropertiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRayTracingPipelinePropertiesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceRayTracingPipelinePropertiesKHR ELEMENT_FACTORY = VkPhysicalDeviceRayTracingPipelinePropertiesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceRayTracingPipelinePropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.npNext(address()); }
        /** @return the value of the {@code shaderGroupHandleSize} field. */
        @NativeType("uint32_t")
        public int shaderGroupHandleSize() { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.nshaderGroupHandleSize(address()); }
        /** @return the value of the {@code maxRayRecursionDepth} field. */
        @NativeType("uint32_t")
        public int maxRayRecursionDepth() { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.nmaxRayRecursionDepth(address()); }
        /** @return the value of the {@code maxShaderGroupStride} field. */
        @NativeType("uint32_t")
        public int maxShaderGroupStride() { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.nmaxShaderGroupStride(address()); }
        /** @return the value of the {@code shaderGroupBaseAlignment} field. */
        @NativeType("uint32_t")
        public int shaderGroupBaseAlignment() { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.nshaderGroupBaseAlignment(address()); }
        /** @return the value of the {@code shaderGroupHandleCaptureReplaySize} field. */
        @NativeType("uint32_t")
        public int shaderGroupHandleCaptureReplaySize() { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.nshaderGroupHandleCaptureReplaySize(address()); }
        /** @return the value of the {@code maxRayDispatchInvocationCount} field. */
        @NativeType("uint32_t")
        public int maxRayDispatchInvocationCount() { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.nmaxRayDispatchInvocationCount(address()); }
        /** @return the value of the {@code shaderGroupHandleAlignment} field. */
        @NativeType("uint32_t")
        public int shaderGroupHandleAlignment() { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.nshaderGroupHandleAlignment(address()); }
        /** @return the value of the {@code maxRayHitAttributeSize} field. */
        @NativeType("uint32_t")
        public int maxRayHitAttributeSize() { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.nmaxRayHitAttributeSize(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceRayTracingPipelinePropertiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRRayTracingPipeline#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_PROPERTIES_KHR} value to the {@code sType} field. */
        public VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer sType$Default() { return sType(KHRRayTracingPipeline.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_PROPERTIES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceRayTracingPipelinePropertiesKHR.npNext(address(), value); return this; }

    }

}