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
 * See {@link VkAttachmentReferenceStencilLayout}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAttachmentReferenceStencilLayoutKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkImageLayout stencilLayout;
 * }</code></pre>
 */
public class VkAttachmentReferenceStencilLayoutKHR extends VkAttachmentReferenceStencilLayout {

    /**
     * Creates a {@code VkAttachmentReferenceStencilLayoutKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAttachmentReferenceStencilLayoutKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkAttachmentReferenceStencilLayoutKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_STENCIL_LAYOUT STRUCTURE_TYPE_ATTACHMENT_REFERENCE_STENCIL_LAYOUT} value to the {@code sType} field. */
    @Override
    public VkAttachmentReferenceStencilLayoutKHR sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_STENCIL_LAYOUT); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkAttachmentReferenceStencilLayoutKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code stencilLayout} field. */
    @Override
    public VkAttachmentReferenceStencilLayoutKHR stencilLayout(@NativeType("VkImageLayout") int value) { nstencilLayout(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkAttachmentReferenceStencilLayoutKHR set(
        int sType,
        long pNext,
        int stencilLayout
    ) {
        sType(sType);
        pNext(pNext);
        stencilLayout(stencilLayout);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAttachmentReferenceStencilLayoutKHR set(VkAttachmentReferenceStencilLayoutKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAttachmentReferenceStencilLayoutKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAttachmentReferenceStencilLayoutKHR malloc() {
        return wrap(VkAttachmentReferenceStencilLayoutKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkAttachmentReferenceStencilLayoutKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAttachmentReferenceStencilLayoutKHR calloc() {
        return wrap(VkAttachmentReferenceStencilLayoutKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkAttachmentReferenceStencilLayoutKHR} instance allocated with {@link BufferUtils}. */
    public static VkAttachmentReferenceStencilLayoutKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkAttachmentReferenceStencilLayoutKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkAttachmentReferenceStencilLayoutKHR} instance for the specified memory address. */
    public static VkAttachmentReferenceStencilLayoutKHR create(long address) {
        return wrap(VkAttachmentReferenceStencilLayoutKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAttachmentReferenceStencilLayoutKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkAttachmentReferenceStencilLayoutKHR.class, address);
    }

    /**
     * Returns a new {@link VkAttachmentReferenceStencilLayoutKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReferenceStencilLayoutKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentReferenceStencilLayoutKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReferenceStencilLayoutKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentReferenceStencilLayoutKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReferenceStencilLayoutKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkAttachmentReferenceStencilLayoutKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReferenceStencilLayoutKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAttachmentReferenceStencilLayoutKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkAttachmentReferenceStencilLayoutKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAttachmentReferenceStencilLayoutKHR malloc(MemoryStack stack) {
        return wrap(VkAttachmentReferenceStencilLayoutKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkAttachmentReferenceStencilLayoutKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAttachmentReferenceStencilLayoutKHR calloc(MemoryStack stack) {
        return wrap(VkAttachmentReferenceStencilLayoutKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkAttachmentReferenceStencilLayoutKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReferenceStencilLayoutKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentReferenceStencilLayoutKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReferenceStencilLayoutKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkAttachmentReferenceStencilLayoutKHR} structs. */
    public static class Buffer extends VkAttachmentReferenceStencilLayout.Buffer {

        private static final VkAttachmentReferenceStencilLayoutKHR ELEMENT_FACTORY = VkAttachmentReferenceStencilLayoutKHR.create(-1L);

        /**
         * Creates a new {@code VkAttachmentReferenceStencilLayoutKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAttachmentReferenceStencilLayoutKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkAttachmentReferenceStencilLayoutKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkAttachmentReferenceStencilLayoutKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkAttachmentReferenceStencilLayoutKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_STENCIL_LAYOUT STRUCTURE_TYPE_ATTACHMENT_REFERENCE_STENCIL_LAYOUT} value to the {@code sType} field. */
        @Override
        public VkAttachmentReferenceStencilLayoutKHR.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_STENCIL_LAYOUT); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkAttachmentReferenceStencilLayoutKHR.Buffer pNext(@NativeType("void *") long value) { VkAttachmentReferenceStencilLayoutKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code stencilLayout} field. */
        @Override
        public VkAttachmentReferenceStencilLayoutKHR.Buffer stencilLayout(@NativeType("VkImageLayout") int value) { VkAttachmentReferenceStencilLayoutKHR.nstencilLayout(address(), value); return this; }

    }

}