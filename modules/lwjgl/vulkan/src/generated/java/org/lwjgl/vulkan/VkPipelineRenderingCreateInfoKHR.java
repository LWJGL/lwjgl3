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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * See {@link VkPipelineRenderingCreateInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineRenderingCreateInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t viewMask;
 *     uint32_t colorAttachmentCount;
 *     VkFormat const * pColorAttachmentFormats;
 *     VkFormat depthAttachmentFormat;
 *     VkFormat stencilAttachmentFormat;
 * }</code></pre>
 */
public class VkPipelineRenderingCreateInfoKHR extends VkPipelineRenderingCreateInfo {

    /**
     * Creates a {@code VkPipelineRenderingCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineRenderingCreateInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPipelineRenderingCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO} value to the {@code sType} field. */
    @Override
    public VkPipelineRenderingCreateInfoKHR sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPipelineRenderingCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code viewMask} field. */
    @Override
    public VkPipelineRenderingCreateInfoKHR viewMask(@NativeType("uint32_t") int value) { nviewMask(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pColorAttachmentFormats} field. */
    @Override
    public VkPipelineRenderingCreateInfoKHR pColorAttachmentFormats(@Nullable @NativeType("VkFormat const *") IntBuffer value) { npColorAttachmentFormats(address(), value); return this; }
    /** Sets the specified value to the {@code depthAttachmentFormat} field. */
    @Override
    public VkPipelineRenderingCreateInfoKHR depthAttachmentFormat(@NativeType("VkFormat") int value) { ndepthAttachmentFormat(address(), value); return this; }
    /** Sets the specified value to the {@code stencilAttachmentFormat} field. */
    @Override
    public VkPipelineRenderingCreateInfoKHR stencilAttachmentFormat(@NativeType("VkFormat") int value) { nstencilAttachmentFormat(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPipelineRenderingCreateInfoKHR set(
        int sType,
        long pNext,
        int viewMask,
        @Nullable IntBuffer pColorAttachmentFormats,
        int depthAttachmentFormat,
        int stencilAttachmentFormat
    ) {
        sType(sType);
        pNext(pNext);
        viewMask(viewMask);
        pColorAttachmentFormats(pColorAttachmentFormats);
        depthAttachmentFormat(depthAttachmentFormat);
        stencilAttachmentFormat(stencilAttachmentFormat);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineRenderingCreateInfoKHR set(VkPipelineRenderingCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineRenderingCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineRenderingCreateInfoKHR malloc() {
        return wrap(VkPipelineRenderingCreateInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPipelineRenderingCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineRenderingCreateInfoKHR calloc() {
        return wrap(VkPipelineRenderingCreateInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPipelineRenderingCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkPipelineRenderingCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPipelineRenderingCreateInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineRenderingCreateInfoKHR} instance for the specified memory address. */
    public static VkPipelineRenderingCreateInfoKHR create(long address) {
        return wrap(VkPipelineRenderingCreateInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineRenderingCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPipelineRenderingCreateInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkPipelineRenderingCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRenderingCreateInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRenderingCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRenderingCreateInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRenderingCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRenderingCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPipelineRenderingCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineRenderingCreateInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineRenderingCreateInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPipelineRenderingCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineRenderingCreateInfoKHR malloc(MemoryStack stack) {
        return wrap(VkPipelineRenderingCreateInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPipelineRenderingCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineRenderingCreateInfoKHR calloc(MemoryStack stack) {
        return wrap(VkPipelineRenderingCreateInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineRenderingCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineRenderingCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRenderingCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineRenderingCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPipelineRenderingCreateInfoKHR} structs. */
    public static class Buffer extends VkPipelineRenderingCreateInfo.Buffer {

        private static final VkPipelineRenderingCreateInfoKHR ELEMENT_FACTORY = VkPipelineRenderingCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkPipelineRenderingCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineRenderingCreateInfoKHR#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container);
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
        protected VkPipelineRenderingCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPipelineRenderingCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineRenderingCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO} value to the {@code sType} field. */
        @Override
        public VkPipelineRenderingCreateInfoKHR.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPipelineRenderingCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkPipelineRenderingCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code viewMask} field. */
        @Override
        public VkPipelineRenderingCreateInfoKHR.Buffer viewMask(@NativeType("uint32_t") int value) { VkPipelineRenderingCreateInfoKHR.nviewMask(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pColorAttachmentFormats} field. */
        @Override
        public VkPipelineRenderingCreateInfoKHR.Buffer pColorAttachmentFormats(@Nullable @NativeType("VkFormat const *") IntBuffer value) { VkPipelineRenderingCreateInfoKHR.npColorAttachmentFormats(address(), value); return this; }
        /** Sets the specified value to the {@code depthAttachmentFormat} field. */
        @Override
        public VkPipelineRenderingCreateInfoKHR.Buffer depthAttachmentFormat(@NativeType("VkFormat") int value) { VkPipelineRenderingCreateInfoKHR.ndepthAttachmentFormat(address(), value); return this; }
        /** Sets the specified value to the {@code stencilAttachmentFormat} field. */
        @Override
        public VkPipelineRenderingCreateInfoKHR.Buffer stencilAttachmentFormat(@NativeType("VkFormat") int value) { VkPipelineRenderingCreateInfoKHR.nstencilAttachmentFormat(address(), value); return this; }

    }

}