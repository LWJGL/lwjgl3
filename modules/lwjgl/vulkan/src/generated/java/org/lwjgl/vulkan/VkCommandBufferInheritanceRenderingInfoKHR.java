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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * See {@link VkCommandBufferInheritanceRenderingInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCommandBufferInheritanceRenderingInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkRenderingFlags flags;
 *     uint32_t viewMask;
 *     uint32_t colorAttachmentCount;
 *     VkFormat const * pColorAttachmentFormats;
 *     VkFormat depthAttachmentFormat;
 *     VkFormat stencilAttachmentFormat;
 *     VkSampleCountFlagBits rasterizationSamples;
 * }</code></pre>
 */
public class VkCommandBufferInheritanceRenderingInfoKHR extends VkCommandBufferInheritanceRenderingInfo {

    protected VkCommandBufferInheritanceRenderingInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCommandBufferInheritanceRenderingInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkCommandBufferInheritanceRenderingInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkCommandBufferInheritanceRenderingInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCommandBufferInheritanceRenderingInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkCommandBufferInheritanceRenderingInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO} value to the {@code sType} field. */
    @Override
    public VkCommandBufferInheritanceRenderingInfoKHR sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkCommandBufferInheritanceRenderingInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    @Override
    public VkCommandBufferInheritanceRenderingInfoKHR flags(@NativeType("VkRenderingFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code viewMask} field. */
    @Override
    public VkCommandBufferInheritanceRenderingInfoKHR viewMask(@NativeType("uint32_t") int value) { nviewMask(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pColorAttachmentFormats} field. */
    @Override
    public VkCommandBufferInheritanceRenderingInfoKHR pColorAttachmentFormats(@Nullable @NativeType("VkFormat const *") IntBuffer value) { npColorAttachmentFormats(address(), value); return this; }
    /** Sets the specified value to the {@code depthAttachmentFormat} field. */
    @Override
    public VkCommandBufferInheritanceRenderingInfoKHR depthAttachmentFormat(@NativeType("VkFormat") int value) { ndepthAttachmentFormat(address(), value); return this; }
    /** Sets the specified value to the {@code stencilAttachmentFormat} field. */
    @Override
    public VkCommandBufferInheritanceRenderingInfoKHR stencilAttachmentFormat(@NativeType("VkFormat") int value) { nstencilAttachmentFormat(address(), value); return this; }
    /** Sets the specified value to the {@code rasterizationSamples} field. */
    @Override
    public VkCommandBufferInheritanceRenderingInfoKHR rasterizationSamples(@NativeType("VkSampleCountFlagBits") int value) { nrasterizationSamples(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkCommandBufferInheritanceRenderingInfoKHR set(
        int sType,
        long pNext,
        int flags,
        int viewMask,
        @Nullable IntBuffer pColorAttachmentFormats,
        int depthAttachmentFormat,
        int stencilAttachmentFormat,
        int rasterizationSamples
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        viewMask(viewMask);
        pColorAttachmentFormats(pColorAttachmentFormats);
        depthAttachmentFormat(depthAttachmentFormat);
        stencilAttachmentFormat(stencilAttachmentFormat);
        rasterizationSamples(rasterizationSamples);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCommandBufferInheritanceRenderingInfoKHR set(VkCommandBufferInheritanceRenderingInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCommandBufferInheritanceRenderingInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCommandBufferInheritanceRenderingInfoKHR malloc() {
        return new VkCommandBufferInheritanceRenderingInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCommandBufferInheritanceRenderingInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCommandBufferInheritanceRenderingInfoKHR calloc() {
        return new VkCommandBufferInheritanceRenderingInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCommandBufferInheritanceRenderingInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkCommandBufferInheritanceRenderingInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCommandBufferInheritanceRenderingInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkCommandBufferInheritanceRenderingInfoKHR} instance for the specified memory address. */
    public static VkCommandBufferInheritanceRenderingInfoKHR create(long address) {
        return new VkCommandBufferInheritanceRenderingInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkCommandBufferInheritanceRenderingInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkCommandBufferInheritanceRenderingInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceRenderingInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceRenderingInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceRenderingInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceRenderingInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceRenderingInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceRenderingInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCommandBufferInheritanceRenderingInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceRenderingInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkCommandBufferInheritanceRenderingInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCommandBufferInheritanceRenderingInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCommandBufferInheritanceRenderingInfoKHR malloc(MemoryStack stack) {
        return new VkCommandBufferInheritanceRenderingInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCommandBufferInheritanceRenderingInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCommandBufferInheritanceRenderingInfoKHR calloc(MemoryStack stack) {
        return new VkCommandBufferInheritanceRenderingInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceRenderingInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceRenderingInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferInheritanceRenderingInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferInheritanceRenderingInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkCommandBufferInheritanceRenderingInfoKHR} structs. */
    public static class Buffer extends VkCommandBufferInheritanceRenderingInfo.Buffer {

        private static final VkCommandBufferInheritanceRenderingInfoKHR ELEMENT_FACTORY = VkCommandBufferInheritanceRenderingInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkCommandBufferInheritanceRenderingInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCommandBufferInheritanceRenderingInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkCommandBufferInheritanceRenderingInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkCommandBufferInheritanceRenderingInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkCommandBufferInheritanceRenderingInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO} value to the {@code sType} field. */
        @Override
        public VkCommandBufferInheritanceRenderingInfoKHR.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDERING_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkCommandBufferInheritanceRenderingInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkCommandBufferInheritanceRenderingInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        @Override
        public VkCommandBufferInheritanceRenderingInfoKHR.Buffer flags(@NativeType("VkRenderingFlags") int value) { VkCommandBufferInheritanceRenderingInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code viewMask} field. */
        @Override
        public VkCommandBufferInheritanceRenderingInfoKHR.Buffer viewMask(@NativeType("uint32_t") int value) { VkCommandBufferInheritanceRenderingInfoKHR.nviewMask(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pColorAttachmentFormats} field. */
        @Override
        public VkCommandBufferInheritanceRenderingInfoKHR.Buffer pColorAttachmentFormats(@Nullable @NativeType("VkFormat const *") IntBuffer value) { VkCommandBufferInheritanceRenderingInfoKHR.npColorAttachmentFormats(address(), value); return this; }
        /** Sets the specified value to the {@code depthAttachmentFormat} field. */
        @Override
        public VkCommandBufferInheritanceRenderingInfoKHR.Buffer depthAttachmentFormat(@NativeType("VkFormat") int value) { VkCommandBufferInheritanceRenderingInfoKHR.ndepthAttachmentFormat(address(), value); return this; }
        /** Sets the specified value to the {@code stencilAttachmentFormat} field. */
        @Override
        public VkCommandBufferInheritanceRenderingInfoKHR.Buffer stencilAttachmentFormat(@NativeType("VkFormat") int value) { VkCommandBufferInheritanceRenderingInfoKHR.nstencilAttachmentFormat(address(), value); return this; }
        /** Sets the specified value to the {@code rasterizationSamples} field. */
        @Override
        public VkCommandBufferInheritanceRenderingInfoKHR.Buffer rasterizationSamples(@NativeType("VkSampleCountFlagBits") int value) { VkCommandBufferInheritanceRenderingInfoKHR.nrasterizationSamples(address(), value); return this; }

    }

}