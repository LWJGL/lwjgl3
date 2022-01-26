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
 * Structure specifying additional interface information when using libraries.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@code maxPipelineRayPayloadSize} is calculated as the maximum number of bytes used by any block declared in the {@code RayPayloadKHR} or {@code IncomingRayPayloadKHR} storage classes. {@code maxPipelineRayHitAttributeSize} is calculated as the maximum number of bytes used by any block declared in the {@code HitAttributeKHR} storage class. As variables in these storage classes do not have explicit offsets, the size should be calculated as if each variable has a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#interfaces-alignment-requirements">scalar alignment</a> equal to the largest scalar alignment of any of the block’s members.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>There is no explicit upper limit for {@code maxPipelineRayPayloadSize}, but in practice it should be kept as small as possible. Similar to invocation local memory, it must be allocated for each shader invocation and for devices which support many simultaneous invocations, this storage can rapidly be exhausted, resulting in failure.</p>
 * </div>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code maxPipelineRayHitAttributeSize} <b>must</b> be less than or equal to {@link VkPhysicalDeviceRayTracingPipelinePropertiesKHR}{@code ::maxRayHitAttributeSize}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRRayTracingPipeline#VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_INTERFACE_CREATE_INFO_KHR STRUCTURE_TYPE_RAY_TRACING_PIPELINE_INTERFACE_CREATE_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkRayTracingPipelineCreateInfoKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkRayTracingPipelineInterfaceCreateInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #maxPipelineRayPayloadSize};
 *     uint32_t {@link #maxPipelineRayHitAttributeSize};
 * }</code></pre>
 */
public class VkRayTracingPipelineInterfaceCreateInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXPIPELINERAYPAYLOADSIZE,
        MAXPIPELINERAYHITATTRIBUTESIZE;

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
        MAXPIPELINERAYPAYLOADSIZE = layout.offsetof(2);
        MAXPIPELINERAYHITATTRIBUTESIZE = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkRayTracingPipelineInterfaceCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRayTracingPipelineInterfaceCreateInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the maximum payload size in bytes used by any shader in the pipeline. */
    @NativeType("uint32_t")
    public int maxPipelineRayPayloadSize() { return nmaxPipelineRayPayloadSize(address()); }
    /** the maximum attribute structure size in bytes used by any shader in the pipeline. */
    @NativeType("uint32_t")
    public int maxPipelineRayHitAttributeSize() { return nmaxPipelineRayHitAttributeSize(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkRayTracingPipelineInterfaceCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRRayTracingPipeline#VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_INTERFACE_CREATE_INFO_KHR STRUCTURE_TYPE_RAY_TRACING_PIPELINE_INTERFACE_CREATE_INFO_KHR} value to the {@link #sType} field. */
    public VkRayTracingPipelineInterfaceCreateInfoKHR sType$Default() { return sType(KHRRayTracingPipeline.VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_INTERFACE_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkRayTracingPipelineInterfaceCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #maxPipelineRayPayloadSize} field. */
    public VkRayTracingPipelineInterfaceCreateInfoKHR maxPipelineRayPayloadSize(@NativeType("uint32_t") int value) { nmaxPipelineRayPayloadSize(address(), value); return this; }
    /** Sets the specified value to the {@link #maxPipelineRayHitAttributeSize} field. */
    public VkRayTracingPipelineInterfaceCreateInfoKHR maxPipelineRayHitAttributeSize(@NativeType("uint32_t") int value) { nmaxPipelineRayHitAttributeSize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkRayTracingPipelineInterfaceCreateInfoKHR set(
        int sType,
        long pNext,
        int maxPipelineRayPayloadSize,
        int maxPipelineRayHitAttributeSize
    ) {
        sType(sType);
        pNext(pNext);
        maxPipelineRayPayloadSize(maxPipelineRayPayloadSize);
        maxPipelineRayHitAttributeSize(maxPipelineRayHitAttributeSize);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRayTracingPipelineInterfaceCreateInfoKHR set(VkRayTracingPipelineInterfaceCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRayTracingPipelineInterfaceCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRayTracingPipelineInterfaceCreateInfoKHR malloc() {
        return wrap(VkRayTracingPipelineInterfaceCreateInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkRayTracingPipelineInterfaceCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRayTracingPipelineInterfaceCreateInfoKHR calloc() {
        return wrap(VkRayTracingPipelineInterfaceCreateInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkRayTracingPipelineInterfaceCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkRayTracingPipelineInterfaceCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkRayTracingPipelineInterfaceCreateInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkRayTracingPipelineInterfaceCreateInfoKHR} instance for the specified memory address. */
    public static VkRayTracingPipelineInterfaceCreateInfoKHR create(long address) {
        return wrap(VkRayTracingPipelineInterfaceCreateInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRayTracingPipelineInterfaceCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkRayTracingPipelineInterfaceCreateInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkRayTracingPipelineInterfaceCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRayTracingPipelineInterfaceCreateInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRayTracingPipelineInterfaceCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRayTracingPipelineInterfaceCreateInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRayTracingPipelineInterfaceCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRayTracingPipelineInterfaceCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkRayTracingPipelineInterfaceCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRayTracingPipelineInterfaceCreateInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRayTracingPipelineInterfaceCreateInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkRayTracingPipelineInterfaceCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRayTracingPipelineInterfaceCreateInfoKHR malloc(MemoryStack stack) {
        return wrap(VkRayTracingPipelineInterfaceCreateInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkRayTracingPipelineInterfaceCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRayTracingPipelineInterfaceCreateInfoKHR calloc(MemoryStack stack) {
        return wrap(VkRayTracingPipelineInterfaceCreateInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkRayTracingPipelineInterfaceCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRayTracingPipelineInterfaceCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRayTracingPipelineInterfaceCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRayTracingPipelineInterfaceCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkRayTracingPipelineInterfaceCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRayTracingPipelineInterfaceCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #maxPipelineRayPayloadSize}. */
    public static int nmaxPipelineRayPayloadSize(long struct) { return UNSAFE.getInt(null, struct + VkRayTracingPipelineInterfaceCreateInfoKHR.MAXPIPELINERAYPAYLOADSIZE); }
    /** Unsafe version of {@link #maxPipelineRayHitAttributeSize}. */
    public static int nmaxPipelineRayHitAttributeSize(long struct) { return UNSAFE.getInt(null, struct + VkRayTracingPipelineInterfaceCreateInfoKHR.MAXPIPELINERAYHITATTRIBUTESIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkRayTracingPipelineInterfaceCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRayTracingPipelineInterfaceCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #maxPipelineRayPayloadSize(int) maxPipelineRayPayloadSize}. */
    public static void nmaxPipelineRayPayloadSize(long struct, int value) { UNSAFE.putInt(null, struct + VkRayTracingPipelineInterfaceCreateInfoKHR.MAXPIPELINERAYPAYLOADSIZE, value); }
    /** Unsafe version of {@link #maxPipelineRayHitAttributeSize(int) maxPipelineRayHitAttributeSize}. */
    public static void nmaxPipelineRayHitAttributeSize(long struct, int value) { UNSAFE.putInt(null, struct + VkRayTracingPipelineInterfaceCreateInfoKHR.MAXPIPELINERAYHITATTRIBUTESIZE, value); }

    // -----------------------------------

    /** An array of {@link VkRayTracingPipelineInterfaceCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkRayTracingPipelineInterfaceCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkRayTracingPipelineInterfaceCreateInfoKHR ELEMENT_FACTORY = VkRayTracingPipelineInterfaceCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkRayTracingPipelineInterfaceCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRayTracingPipelineInterfaceCreateInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkRayTracingPipelineInterfaceCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkRayTracingPipelineInterfaceCreateInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRayTracingPipelineInterfaceCreateInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkRayTracingPipelineInterfaceCreateInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRayTracingPipelineInterfaceCreateInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkRayTracingPipelineInterfaceCreateInfoKHR#maxPipelineRayPayloadSize} field. */
        @NativeType("uint32_t")
        public int maxPipelineRayPayloadSize() { return VkRayTracingPipelineInterfaceCreateInfoKHR.nmaxPipelineRayPayloadSize(address()); }
        /** @return the value of the {@link VkRayTracingPipelineInterfaceCreateInfoKHR#maxPipelineRayHitAttributeSize} field. */
        @NativeType("uint32_t")
        public int maxPipelineRayHitAttributeSize() { return VkRayTracingPipelineInterfaceCreateInfoKHR.nmaxPipelineRayHitAttributeSize(address()); }

        /** Sets the specified value to the {@link VkRayTracingPipelineInterfaceCreateInfoKHR#sType} field. */
        public VkRayTracingPipelineInterfaceCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkRayTracingPipelineInterfaceCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRRayTracingPipeline#VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_INTERFACE_CREATE_INFO_KHR STRUCTURE_TYPE_RAY_TRACING_PIPELINE_INTERFACE_CREATE_INFO_KHR} value to the {@link VkRayTracingPipelineInterfaceCreateInfoKHR#sType} field. */
        public VkRayTracingPipelineInterfaceCreateInfoKHR.Buffer sType$Default() { return sType(KHRRayTracingPipeline.VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_INTERFACE_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@link VkRayTracingPipelineInterfaceCreateInfoKHR#pNext} field. */
        public VkRayTracingPipelineInterfaceCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkRayTracingPipelineInterfaceCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkRayTracingPipelineInterfaceCreateInfoKHR#maxPipelineRayPayloadSize} field. */
        public VkRayTracingPipelineInterfaceCreateInfoKHR.Buffer maxPipelineRayPayloadSize(@NativeType("uint32_t") int value) { VkRayTracingPipelineInterfaceCreateInfoKHR.nmaxPipelineRayPayloadSize(address(), value); return this; }
        /** Sets the specified value to the {@link VkRayTracingPipelineInterfaceCreateInfoKHR#maxPipelineRayHitAttributeSize} field. */
        public VkRayTracingPipelineInterfaceCreateInfoKHR.Buffer maxPipelineRayHitAttributeSize(@NativeType("uint32_t") int value) { VkRayTracingPipelineInterfaceCreateInfoKHR.nmaxPipelineRayHitAttributeSize(address(), value); return this; }

    }

}