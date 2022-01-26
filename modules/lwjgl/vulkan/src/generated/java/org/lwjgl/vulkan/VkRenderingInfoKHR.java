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
 * See {@link VkRenderingInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkRenderingInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkRenderingFlags flags;
 *     {@link VkRect2D VkRect2D} renderArea;
 *     uint32_t layerCount;
 *     uint32_t viewMask;
 *     uint32_t colorAttachmentCount;
 *     {@link VkRenderingAttachmentInfo VkRenderingAttachmentInfo} const * pColorAttachments;
 *     {@link VkRenderingAttachmentInfo VkRenderingAttachmentInfo} const * pDepthAttachment;
 *     {@link VkRenderingAttachmentInfo VkRenderingAttachmentInfo} const * pStencilAttachment;
 * }</code></pre>
 */
public class VkRenderingInfoKHR extends VkRenderingInfo {

    /**
     * Creates a {@code VkRenderingInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderingInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkRenderingInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_RENDERING_INFO STRUCTURE_TYPE_RENDERING_INFO} value to the {@code sType} field. */
    @Override
    public VkRenderingInfoKHR sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_RENDERING_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkRenderingInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    @Override
    public VkRenderingInfoKHR flags(@NativeType("VkRenderingFlags") int value) { nflags(address(), value); return this; }
    /** Copies the specified {@link VkRect2D} to the {@code renderArea} field. */
    @Override
    public VkRenderingInfoKHR renderArea(VkRect2D value) { nrenderArea(address(), value); return this; }
    /** Passes the {@code renderArea} field to the specified {@link java.util.function.Consumer Consumer}. */
    @Override
    public VkRenderingInfoKHR renderArea(java.util.function.Consumer<VkRect2D> consumer) { consumer.accept(renderArea()); return this; }
    /** Sets the specified value to the {@code layerCount} field. */
    @Override
    public VkRenderingInfoKHR layerCount(@NativeType("uint32_t") int value) { nlayerCount(address(), value); return this; }
    /** Sets the specified value to the {@code viewMask} field. */
    @Override
    public VkRenderingInfoKHR viewMask(@NativeType("uint32_t") int value) { nviewMask(address(), value); return this; }
    /** Sets the address of the specified {@link VkRenderingAttachmentInfo.Buffer} to the {@code pColorAttachments} field. */
    @Override
    public VkRenderingInfoKHR pColorAttachments(@Nullable @NativeType("VkRenderingAttachmentInfo const *") VkRenderingAttachmentInfo.Buffer value) { npColorAttachments(address(), value); return this; }
    /** Sets the address of the specified {@link VkRenderingAttachmentInfo} to the {@code pDepthAttachment} field. */
    @Override
    public VkRenderingInfoKHR pDepthAttachment(@Nullable @NativeType("VkRenderingAttachmentInfo const *") VkRenderingAttachmentInfo value) { npDepthAttachment(address(), value); return this; }
    /** Sets the address of the specified {@link VkRenderingAttachmentInfo} to the {@code pStencilAttachment} field. */
    @Override
    public VkRenderingInfoKHR pStencilAttachment(@Nullable @NativeType("VkRenderingAttachmentInfo const *") VkRenderingAttachmentInfo value) { npStencilAttachment(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkRenderingInfoKHR set(
        int sType,
        long pNext,
        int flags,
        VkRect2D renderArea,
        int layerCount,
        int viewMask,
        @Nullable VkRenderingAttachmentInfo.Buffer pColorAttachments,
        @Nullable VkRenderingAttachmentInfo pDepthAttachment,
        @Nullable VkRenderingAttachmentInfo pStencilAttachment
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        renderArea(renderArea);
        layerCount(layerCount);
        viewMask(viewMask);
        pColorAttachments(pColorAttachments);
        pDepthAttachment(pDepthAttachment);
        pStencilAttachment(pStencilAttachment);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRenderingInfoKHR set(VkRenderingInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderingInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderingInfoKHR malloc() {
        return wrap(VkRenderingInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkRenderingInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderingInfoKHR calloc() {
        return wrap(VkRenderingInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkRenderingInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkRenderingInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkRenderingInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkRenderingInfoKHR} instance for the specified memory address. */
    public static VkRenderingInfoKHR create(long address) {
        return wrap(VkRenderingInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderingInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkRenderingInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkRenderingInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRenderingInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderingInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkRenderingInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderingInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderingInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkRenderingInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderingInfoKHR malloc(MemoryStack stack) {
        return wrap(VkRenderingInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkRenderingInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderingInfoKHR calloc(MemoryStack stack) {
        return wrap(VkRenderingInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkRenderingInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderingInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderingInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderingInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkRenderingInfoKHR} structs. */
    public static class Buffer extends VkRenderingInfo.Buffer {

        private static final VkRenderingInfoKHR ELEMENT_FACTORY = VkRenderingInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkRenderingInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderingInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkRenderingInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkRenderingInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderingInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_RENDERING_INFO STRUCTURE_TYPE_RENDERING_INFO} value to the {@code sType} field. */
        @Override
        public VkRenderingInfoKHR.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_RENDERING_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkRenderingInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkRenderingInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        @Override
        public VkRenderingInfoKHR.Buffer flags(@NativeType("VkRenderingFlags") int value) { VkRenderingInfoKHR.nflags(address(), value); return this; }
        /** Copies the specified {@link VkRect2D} to the {@code renderArea} field. */
        @Override
        public VkRenderingInfoKHR.Buffer renderArea(VkRect2D value) { VkRenderingInfoKHR.nrenderArea(address(), value); return this; }
        /** Passes the {@code renderArea} field to the specified {@link java.util.function.Consumer Consumer}. */
        @Override
        public VkRenderingInfoKHR.Buffer renderArea(java.util.function.Consumer<VkRect2D> consumer) { consumer.accept(renderArea()); return this; }
        /** Sets the specified value to the {@code layerCount} field. */
        @Override
        public VkRenderingInfoKHR.Buffer layerCount(@NativeType("uint32_t") int value) { VkRenderingInfoKHR.nlayerCount(address(), value); return this; }
        /** Sets the specified value to the {@code viewMask} field. */
        @Override
        public VkRenderingInfoKHR.Buffer viewMask(@NativeType("uint32_t") int value) { VkRenderingInfoKHR.nviewMask(address(), value); return this; }
        /** Sets the address of the specified {@link VkRenderingAttachmentInfo.Buffer} to the {@code pColorAttachments} field. */
        @Override
        public VkRenderingInfoKHR.Buffer pColorAttachments(@Nullable @NativeType("VkRenderingAttachmentInfo const *") VkRenderingAttachmentInfo.Buffer value) { VkRenderingInfoKHR.npColorAttachments(address(), value); return this; }
        /** Sets the address of the specified {@link VkRenderingAttachmentInfo} to the {@code pDepthAttachment} field. */
        @Override
        public VkRenderingInfoKHR.Buffer pDepthAttachment(@Nullable @NativeType("VkRenderingAttachmentInfo const *") VkRenderingAttachmentInfo value) { VkRenderingInfoKHR.npDepthAttachment(address(), value); return this; }
        /** Sets the address of the specified {@link VkRenderingAttachmentInfo} to the {@code pStencilAttachment} field. */
        @Override
        public VkRenderingInfoKHR.Buffer pStencilAttachment(@Nullable @NativeType("VkRenderingAttachmentInfo const *") VkRenderingAttachmentInfo value) { VkRenderingInfoKHR.npStencilAttachment(address(), value); return this; }

    }

}