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
 * Properties of the physical device for ray tracing.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <p>Limits specified by this structure <b>must</b> match those specified with the same name in {@link VkPhysicalDeviceRayTracingPropertiesNV}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRRayTracingPipeline#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_PROPERTIES_KHR}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceRayTracingPipelinePropertiesKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #shaderGroupHandleSize};
 *     uint32_t {@link #maxRayRecursionDepth};
 *     uint32_t {@link #maxShaderGroupStride};
 *     uint32_t {@link #shaderGroupBaseAlignment};
 *     uint32_t {@link #shaderGroupHandleCaptureReplaySize};
 *     uint32_t {@link #maxRayDispatchInvocationCount};
 *     uint32_t {@link #shaderGroupHandleAlignment};
 *     uint32_t {@link #maxRayHitAttributeSize};
 * }</code></pre>
 */
public class VkPhysicalDeviceRayTracingPipelinePropertiesKHR extends Struct implements NativeResource {

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

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** the size in bytes of the shader header. */
    @NativeType("uint32_t")
    public int shaderGroupHandleSize() { return nshaderGroupHandleSize(address()); }
    /** the maximum number of levels of ray recursion allowed in a trace command. */
    @NativeType("uint32_t")
    public int maxRayRecursionDepth() { return nmaxRayRecursionDepth(address()); }
    /** the maximum stride in bytes allowed between shader groups in the shader binding table. */
    @NativeType("uint32_t")
    public int maxShaderGroupStride() { return nmaxShaderGroupStride(address()); }
    /** the <b>required</b> alignment in bytes for the base of the shader binding table. */
    @NativeType("uint32_t")
    public int shaderGroupBaseAlignment() { return nshaderGroupBaseAlignment(address()); }
    /** the number of bytes for the information required to do capture and replay for shader group handles. */
    @NativeType("uint32_t")
    public int shaderGroupHandleCaptureReplaySize() { return nshaderGroupHandleCaptureReplaySize(address()); }
    /** the maximum number of ray generation shader invocations which <b>may</b> be produced by a single {@link KHRRayTracingPipeline#vkCmdTraceRaysIndirectKHR CmdTraceRaysIndirectKHR} or {@link KHRRayTracingPipeline#vkCmdTraceRaysKHR CmdTraceRaysKHR} command. */
    @NativeType("uint32_t")
    public int maxRayDispatchInvocationCount() { return nmaxRayDispatchInvocationCount(address()); }
    /** the <b>required</b> alignment in bytes for each shader binding table entry. The value <b>must</b> be a power of two. */
    @NativeType("uint32_t")
    public int shaderGroupHandleAlignment() { return nshaderGroupHandleAlignment(address()); }
    /** the maximum size in bytes for a ray attribute structure */
    @NativeType("uint32_t")
    public int maxRayHitAttributeSize() { return nmaxRayHitAttributeSize(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRRayTracingPipeline#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_PROPERTIES_KHR} value to the {@link #sType} field. */
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR sType$Default() { return sType(KHRRayTracingPipeline.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_PROPERTIES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
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
        return wrap(VkPhysicalDeviceRayTracingPipelinePropertiesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingPipelinePropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR calloc() {
        return wrap(VkPhysicalDeviceRayTracingPipelinePropertiesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingPipelinePropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceRayTracingPipelinePropertiesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingPipelinePropertiesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR create(long address) {
        return wrap(VkPhysicalDeviceRayTracingPipelinePropertiesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceRayTracingPipelinePropertiesKHR.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRayTracingPipelinePropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceRayTracingPipelinePropertiesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRayTracingPipelinePropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceRayTracingPipelinePropertiesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRayTracingPipelinePropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceRayTracingPipelinePropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #shaderGroupHandleSize}. */
    public static int nshaderGroupHandleSize(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRayTracingPipelinePropertiesKHR.SHADERGROUPHANDLESIZE); }
    /** Unsafe version of {@link #maxRayRecursionDepth}. */
    public static int nmaxRayRecursionDepth(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRayTracingPipelinePropertiesKHR.MAXRAYRECURSIONDEPTH); }
    /** Unsafe version of {@link #maxShaderGroupStride}. */
    public static int nmaxShaderGroupStride(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRayTracingPipelinePropertiesKHR.MAXSHADERGROUPSTRIDE); }
    /** Unsafe version of {@link #shaderGroupBaseAlignment}. */
    public static int nshaderGroupBaseAlignment(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRayTracingPipelinePropertiesKHR.SHADERGROUPBASEALIGNMENT); }
    /** Unsafe version of {@link #shaderGroupHandleCaptureReplaySize}. */
    public static int nshaderGroupHandleCaptureReplaySize(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRayTracingPipelinePropertiesKHR.SHADERGROUPHANDLECAPTUREREPLAYSIZE); }
    /** Unsafe version of {@link #maxRayDispatchInvocationCount}. */
    public static int nmaxRayDispatchInvocationCount(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRayTracingPipelinePropertiesKHR.MAXRAYDISPATCHINVOCATIONCOUNT); }
    /** Unsafe version of {@link #shaderGroupHandleAlignment}. */
    public static int nshaderGroupHandleAlignment(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRayTracingPipelinePropertiesKHR.SHADERGROUPHANDLEALIGNMENT); }
    /** Unsafe version of {@link #maxRayHitAttributeSize}. */
    public static int nmaxRayHitAttributeSize(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRayTracingPipelinePropertiesKHR.MAXRAYHITATTRIBUTESIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceRayTracingPipelinePropertiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceRayTracingPipelinePropertiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRayTracingPipelinePropertiesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceRayTracingPipelinePropertiesKHR ELEMENT_FACTORY = VkPhysicalDeviceRayTracingPipelinePropertiesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceRayTracingPipelinePropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR#shaderGroupHandleSize} field. */
        @NativeType("uint32_t")
        public int shaderGroupHandleSize() { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.nshaderGroupHandleSize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR#maxRayRecursionDepth} field. */
        @NativeType("uint32_t")
        public int maxRayRecursionDepth() { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.nmaxRayRecursionDepth(address()); }
        /** @return the value of the {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR#maxShaderGroupStride} field. */
        @NativeType("uint32_t")
        public int maxShaderGroupStride() { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.nmaxShaderGroupStride(address()); }
        /** @return the value of the {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR#shaderGroupBaseAlignment} field. */
        @NativeType("uint32_t")
        public int shaderGroupBaseAlignment() { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.nshaderGroupBaseAlignment(address()); }
        /** @return the value of the {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR#shaderGroupHandleCaptureReplaySize} field. */
        @NativeType("uint32_t")
        public int shaderGroupHandleCaptureReplaySize() { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.nshaderGroupHandleCaptureReplaySize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR#maxRayDispatchInvocationCount} field. */
        @NativeType("uint32_t")
        public int maxRayDispatchInvocationCount() { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.nmaxRayDispatchInvocationCount(address()); }
        /** @return the value of the {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR#shaderGroupHandleAlignment} field. */
        @NativeType("uint32_t")
        public int shaderGroupHandleAlignment() { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.nshaderGroupHandleAlignment(address()); }
        /** @return the value of the {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR#maxRayHitAttributeSize} field. */
        @NativeType("uint32_t")
        public int maxRayHitAttributeSize() { return VkPhysicalDeviceRayTracingPipelinePropertiesKHR.nmaxRayHitAttributeSize(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR#sType} field. */
        public VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceRayTracingPipelinePropertiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRRayTracingPipeline#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_PROPERTIES_KHR} value to the {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR#sType} field. */
        public VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer sType$Default() { return sType(KHRRayTracingPipeline.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_PROPERTIES_KHR); }
        /** Sets the specified value to the {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR#pNext} field. */
        public VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceRayTracingPipelinePropertiesKHR.npNext(address(), value); return this; }

    }

}