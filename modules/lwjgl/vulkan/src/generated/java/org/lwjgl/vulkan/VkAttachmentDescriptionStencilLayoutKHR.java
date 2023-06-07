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
 * See {@link VkAttachmentDescriptionStencilLayout}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAttachmentDescriptionStencilLayoutKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkImageLayout stencilInitialLayout;
 *     VkImageLayout stencilFinalLayout;
 * }</code></pre>
 */
public class VkAttachmentDescriptionStencilLayoutKHR extends VkAttachmentDescriptionStencilLayout {

    protected VkAttachmentDescriptionStencilLayoutKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAttachmentDescriptionStencilLayoutKHR create(long address, @Nullable ByteBuffer container) {
        return new VkAttachmentDescriptionStencilLayoutKHR(address, container);
    }

    /**
     * Creates a {@code VkAttachmentDescriptionStencilLayoutKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAttachmentDescriptionStencilLayoutKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkAttachmentDescriptionStencilLayoutKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT} value to the {@code sType} field. */
    @Override
    public VkAttachmentDescriptionStencilLayoutKHR sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkAttachmentDescriptionStencilLayoutKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code stencilInitialLayout} field. */
    @Override
    public VkAttachmentDescriptionStencilLayoutKHR stencilInitialLayout(@NativeType("VkImageLayout") int value) { nstencilInitialLayout(address(), value); return this; }
    /** Sets the specified value to the {@code stencilFinalLayout} field. */
    @Override
    public VkAttachmentDescriptionStencilLayoutKHR stencilFinalLayout(@NativeType("VkImageLayout") int value) { nstencilFinalLayout(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkAttachmentDescriptionStencilLayoutKHR set(
        int sType,
        long pNext,
        int stencilInitialLayout,
        int stencilFinalLayout
    ) {
        sType(sType);
        pNext(pNext);
        stencilInitialLayout(stencilInitialLayout);
        stencilFinalLayout(stencilFinalLayout);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAttachmentDescriptionStencilLayoutKHR set(VkAttachmentDescriptionStencilLayoutKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAttachmentDescriptionStencilLayoutKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAttachmentDescriptionStencilLayoutKHR malloc() {
        return new VkAttachmentDescriptionStencilLayoutKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAttachmentDescriptionStencilLayoutKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAttachmentDescriptionStencilLayoutKHR calloc() {
        return new VkAttachmentDescriptionStencilLayoutKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAttachmentDescriptionStencilLayoutKHR} instance allocated with {@link BufferUtils}. */
    public static VkAttachmentDescriptionStencilLayoutKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAttachmentDescriptionStencilLayoutKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkAttachmentDescriptionStencilLayoutKHR} instance for the specified memory address. */
    public static VkAttachmentDescriptionStencilLayoutKHR create(long address) {
        return new VkAttachmentDescriptionStencilLayoutKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAttachmentDescriptionStencilLayoutKHR createSafe(long address) {
        return address == NULL ? null : new VkAttachmentDescriptionStencilLayoutKHR(address, null);
    }

    /**
     * Returns a new {@link VkAttachmentDescriptionStencilLayoutKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescriptionStencilLayoutKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentDescriptionStencilLayoutKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescriptionStencilLayoutKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentDescriptionStencilLayoutKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescriptionStencilLayoutKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAttachmentDescriptionStencilLayoutKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescriptionStencilLayoutKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAttachmentDescriptionStencilLayoutKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkAttachmentDescriptionStencilLayoutKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAttachmentDescriptionStencilLayoutKHR malloc(MemoryStack stack) {
        return new VkAttachmentDescriptionStencilLayoutKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAttachmentDescriptionStencilLayoutKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAttachmentDescriptionStencilLayoutKHR calloc(MemoryStack stack) {
        return new VkAttachmentDescriptionStencilLayoutKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAttachmentDescriptionStencilLayoutKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescriptionStencilLayoutKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentDescriptionStencilLayoutKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAttachmentDescriptionStencilLayoutKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkAttachmentDescriptionStencilLayoutKHR} structs. */
    public static class Buffer extends VkAttachmentDescriptionStencilLayout.Buffer {

        private static final VkAttachmentDescriptionStencilLayoutKHR ELEMENT_FACTORY = VkAttachmentDescriptionStencilLayoutKHR.create(-1L);

        /**
         * Creates a new {@code VkAttachmentDescriptionStencilLayoutKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAttachmentDescriptionStencilLayoutKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkAttachmentDescriptionStencilLayoutKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkAttachmentDescriptionStencilLayoutKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkAttachmentDescriptionStencilLayoutKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT} value to the {@code sType} field. */
        @Override
        public VkAttachmentDescriptionStencilLayoutKHR.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkAttachmentDescriptionStencilLayoutKHR.Buffer pNext(@NativeType("void *") long value) { VkAttachmentDescriptionStencilLayoutKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code stencilInitialLayout} field. */
        @Override
        public VkAttachmentDescriptionStencilLayoutKHR.Buffer stencilInitialLayout(@NativeType("VkImageLayout") int value) { VkAttachmentDescriptionStencilLayoutKHR.nstencilInitialLayout(address(), value); return this; }
        /** Sets the specified value to the {@code stencilFinalLayout} field. */
        @Override
        public VkAttachmentDescriptionStencilLayoutKHR.Buffer stencilFinalLayout(@NativeType("VkImageLayout") int value) { VkAttachmentDescriptionStencilLayoutKHR.nstencilFinalLayout(address(), value); return this; }

    }

}