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
 * Structure specifying parameters of a newly created subpass shading pipeline.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code subpass} <b>must</b> be created with {@link HUAWEISubpassShading#VK_PIPELINE_BIND_POINT_SUBPASS_SHADING_HUAWEI PIPELINE_BIND_POINT_SUBPASS_SHADING_HUAWEI} bind point</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link HUAWEISubpassShading#VK_STRUCTURE_TYPE_SUBPASS_SHADING_PIPELINE_CREATE_INFO_HUAWEI STRUCTURE_TYPE_SUBPASS_SHADING_PIPELINE_CREATE_INFO_HUAWEI}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSubpassShadingPipelineCreateInfoHUAWEI {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkRenderPass {@link #renderPass};
 *     uint32_t {@link #subpass};
 * }</code></pre>
 */
public class VkSubpassShadingPipelineCreateInfoHUAWEI extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        RENDERPASS,
        SUBPASS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        RENDERPASS = layout.offsetof(2);
        SUBPASS = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkSubpassShadingPipelineCreateInfoHUAWEI} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSubpassShadingPipelineCreateInfoHUAWEI(ByteBuffer container) {
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
    /** a handle to a render pass object describing the environment in which the pipeline will be used. The pipeline <b>must</b> only be used with a render pass instance compatible with the one provided. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#renderpass-compatibility">Render Pass Compatibility</a> for more information. */
    @NativeType("VkRenderPass")
    public long renderPass() { return nrenderPass(address()); }
    /** the index of the subpass in the render pass where this pipeline will be used. */
    @NativeType("uint32_t")
    public int subpass() { return nsubpass(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkSubpassShadingPipelineCreateInfoHUAWEI sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link HUAWEISubpassShading#VK_STRUCTURE_TYPE_SUBPASS_SHADING_PIPELINE_CREATE_INFO_HUAWEI STRUCTURE_TYPE_SUBPASS_SHADING_PIPELINE_CREATE_INFO_HUAWEI} value to the {@link #sType} field. */
    public VkSubpassShadingPipelineCreateInfoHUAWEI sType$Default() { return sType(HUAWEISubpassShading.VK_STRUCTURE_TYPE_SUBPASS_SHADING_PIPELINE_CREATE_INFO_HUAWEI); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSubpassShadingPipelineCreateInfoHUAWEI pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSubpassShadingPipelineCreateInfoHUAWEI set(
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
    public VkSubpassShadingPipelineCreateInfoHUAWEI set(VkSubpassShadingPipelineCreateInfoHUAWEI src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSubpassShadingPipelineCreateInfoHUAWEI} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSubpassShadingPipelineCreateInfoHUAWEI malloc() {
        return wrap(VkSubpassShadingPipelineCreateInfoHUAWEI.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSubpassShadingPipelineCreateInfoHUAWEI} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSubpassShadingPipelineCreateInfoHUAWEI calloc() {
        return wrap(VkSubpassShadingPipelineCreateInfoHUAWEI.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSubpassShadingPipelineCreateInfoHUAWEI} instance allocated with {@link BufferUtils}. */
    public static VkSubpassShadingPipelineCreateInfoHUAWEI create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSubpassShadingPipelineCreateInfoHUAWEI.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSubpassShadingPipelineCreateInfoHUAWEI} instance for the specified memory address. */
    public static VkSubpassShadingPipelineCreateInfoHUAWEI create(long address) {
        return wrap(VkSubpassShadingPipelineCreateInfoHUAWEI.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubpassShadingPipelineCreateInfoHUAWEI createSafe(long address) {
        return address == NULL ? null : wrap(VkSubpassShadingPipelineCreateInfoHUAWEI.class, address);
    }

    /**
     * Returns a new {@link VkSubpassShadingPipelineCreateInfoHUAWEI.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassShadingPipelineCreateInfoHUAWEI.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSubpassShadingPipelineCreateInfoHUAWEI.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassShadingPipelineCreateInfoHUAWEI.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassShadingPipelineCreateInfoHUAWEI.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassShadingPipelineCreateInfoHUAWEI.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSubpassShadingPipelineCreateInfoHUAWEI.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSubpassShadingPipelineCreateInfoHUAWEI.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubpassShadingPipelineCreateInfoHUAWEI.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkSubpassShadingPipelineCreateInfoHUAWEI} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassShadingPipelineCreateInfoHUAWEI malloc(MemoryStack stack) {
        return wrap(VkSubpassShadingPipelineCreateInfoHUAWEI.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSubpassShadingPipelineCreateInfoHUAWEI} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassShadingPipelineCreateInfoHUAWEI calloc(MemoryStack stack) {
        return wrap(VkSubpassShadingPipelineCreateInfoHUAWEI.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSubpassShadingPipelineCreateInfoHUAWEI.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassShadingPipelineCreateInfoHUAWEI.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassShadingPipelineCreateInfoHUAWEI.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassShadingPipelineCreateInfoHUAWEI.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSubpassShadingPipelineCreateInfoHUAWEI.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSubpassShadingPipelineCreateInfoHUAWEI.PNEXT); }
    /** Unsafe version of {@link #renderPass}. */
    public static long nrenderPass(long struct) { return UNSAFE.getLong(null, struct + VkSubpassShadingPipelineCreateInfoHUAWEI.RENDERPASS); }
    /** Unsafe version of {@link #subpass}. */
    public static int nsubpass(long struct) { return UNSAFE.getInt(null, struct + VkSubpassShadingPipelineCreateInfoHUAWEI.SUBPASS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSubpassShadingPipelineCreateInfoHUAWEI.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSubpassShadingPipelineCreateInfoHUAWEI.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkSubpassShadingPipelineCreateInfoHUAWEI} structs. */
    public static class Buffer extends StructBuffer<VkSubpassShadingPipelineCreateInfoHUAWEI, Buffer> implements NativeResource {

        private static final VkSubpassShadingPipelineCreateInfoHUAWEI ELEMENT_FACTORY = VkSubpassShadingPipelineCreateInfoHUAWEI.create(-1L);

        /**
         * Creates a new {@code VkSubpassShadingPipelineCreateInfoHUAWEI.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSubpassShadingPipelineCreateInfoHUAWEI#SIZEOF}, and its mark will be undefined.
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
        protected VkSubpassShadingPipelineCreateInfoHUAWEI getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSubpassShadingPipelineCreateInfoHUAWEI#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSubpassShadingPipelineCreateInfoHUAWEI.nsType(address()); }
        /** @return the value of the {@link VkSubpassShadingPipelineCreateInfoHUAWEI#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkSubpassShadingPipelineCreateInfoHUAWEI.npNext(address()); }
        /** @return the value of the {@link VkSubpassShadingPipelineCreateInfoHUAWEI#renderPass} field. */
        @NativeType("VkRenderPass")
        public long renderPass() { return VkSubpassShadingPipelineCreateInfoHUAWEI.nrenderPass(address()); }
        /** @return the value of the {@link VkSubpassShadingPipelineCreateInfoHUAWEI#subpass} field. */
        @NativeType("uint32_t")
        public int subpass() { return VkSubpassShadingPipelineCreateInfoHUAWEI.nsubpass(address()); }

        /** Sets the specified value to the {@link VkSubpassShadingPipelineCreateInfoHUAWEI#sType} field. */
        public VkSubpassShadingPipelineCreateInfoHUAWEI.Buffer sType(@NativeType("VkStructureType") int value) { VkSubpassShadingPipelineCreateInfoHUAWEI.nsType(address(), value); return this; }
        /** Sets the {@link HUAWEISubpassShading#VK_STRUCTURE_TYPE_SUBPASS_SHADING_PIPELINE_CREATE_INFO_HUAWEI STRUCTURE_TYPE_SUBPASS_SHADING_PIPELINE_CREATE_INFO_HUAWEI} value to the {@link VkSubpassShadingPipelineCreateInfoHUAWEI#sType} field. */
        public VkSubpassShadingPipelineCreateInfoHUAWEI.Buffer sType$Default() { return sType(HUAWEISubpassShading.VK_STRUCTURE_TYPE_SUBPASS_SHADING_PIPELINE_CREATE_INFO_HUAWEI); }
        /** Sets the specified value to the {@link VkSubpassShadingPipelineCreateInfoHUAWEI#pNext} field. */
        public VkSubpassShadingPipelineCreateInfoHUAWEI.Buffer pNext(@NativeType("void *") long value) { VkSubpassShadingPipelineCreateInfoHUAWEI.npNext(address(), value); return this; }

    }

}