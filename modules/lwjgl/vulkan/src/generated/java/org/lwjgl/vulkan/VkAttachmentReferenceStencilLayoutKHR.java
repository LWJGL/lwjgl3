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

    protected VkAttachmentReferenceStencilLayoutKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAttachmentReferenceStencilLayoutKHR create(long address, @Nullable ByteBuffer container) {
        return new VkAttachmentReferenceStencilLayoutKHR(address, container);
    }

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
        return new VkAttachmentReferenceStencilLayoutKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAttachmentReferenceStencilLayoutKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAttachmentReferenceStencilLayoutKHR calloc() {
        return new VkAttachmentReferenceStencilLayoutKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAttachmentReferenceStencilLayoutKHR} instance allocated with {@link BufferUtils}. */
    public static VkAttachmentReferenceStencilLayoutKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAttachmentReferenceStencilLayoutKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkAttachmentReferenceStencilLayoutKHR} instance for the specified memory address. */
    public static VkAttachmentReferenceStencilLayoutKHR create(long address) {
        return new VkAttachmentReferenceStencilLayoutKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkAttachmentReferenceStencilLayoutKHR createSafe(long address) {
        return address == NULL ? null : new VkAttachmentReferenceStencilLayoutKHR(address, null);
    }

    /**
     * Returns a new {@link VkAttachmentReferenceStencilLayoutKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReferenceStencilLayoutKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentReferenceStencilLayoutKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReferenceStencilLayoutKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentReferenceStencilLayoutKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReferenceStencilLayoutKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAttachmentReferenceStencilLayoutKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReferenceStencilLayoutKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkAttachmentReferenceStencilLayoutKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkAttachmentReferenceStencilLayoutKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAttachmentReferenceStencilLayoutKHR malloc(MemoryStack stack) {
        return new VkAttachmentReferenceStencilLayoutKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAttachmentReferenceStencilLayoutKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAttachmentReferenceStencilLayoutKHR calloc(MemoryStack stack) {
        return new VkAttachmentReferenceStencilLayoutKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAttachmentReferenceStencilLayoutKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReferenceStencilLayoutKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentReferenceStencilLayoutKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReferenceStencilLayoutKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkAttachmentReferenceStencilLayoutKHR} structs. */
    public static class Buffer extends VkAttachmentReferenceStencilLayout.Buffer {

        private static final VkAttachmentReferenceStencilLayoutKHR ELEMENT_FACTORY = VkAttachmentReferenceStencilLayoutKHR.create(-1L);

        /**
         * Creates a new {@code VkAttachmentReferenceStencilLayoutKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAttachmentReferenceStencilLayoutKHR#SIZEOF}, and its mark will be undefined.</p>
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