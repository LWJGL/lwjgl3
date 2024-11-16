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
 * See {@link VkAttachmentReference2}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAttachmentReference2KHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t attachment;
 *     VkImageLayout layout;
 *     VkImageAspectFlags aspectMask;
 * }</code></pre>
 */
public class VkAttachmentReference2KHR extends VkAttachmentReference2 {

    protected VkAttachmentReference2KHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAttachmentReference2KHR create(long address, @Nullable ByteBuffer container) {
        return new VkAttachmentReference2KHR(address, container);
    }

    /**
     * Creates a {@code VkAttachmentReference2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAttachmentReference2KHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkAttachmentReference2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2 STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2} value to the {@code sType} field. */
    @Override
    public VkAttachmentReference2KHR sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkAttachmentReference2KHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code attachment} field. */
    @Override
    public VkAttachmentReference2KHR attachment(@NativeType("uint32_t") int value) { nattachment(address(), value); return this; }
    /** Sets the specified value to the {@code layout} field. */
    @Override
    public VkAttachmentReference2KHR layout(@NativeType("VkImageLayout") int value) { nlayout(address(), value); return this; }
    /** Sets the specified value to the {@code aspectMask} field. */
    @Override
    public VkAttachmentReference2KHR aspectMask(@NativeType("VkImageAspectFlags") int value) { naspectMask(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkAttachmentReference2KHR set(
        int sType,
        long pNext,
        int attachment,
        int layout,
        int aspectMask
    ) {
        sType(sType);
        pNext(pNext);
        attachment(attachment);
        layout(layout);
        aspectMask(aspectMask);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAttachmentReference2KHR set(VkAttachmentReference2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAttachmentReference2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAttachmentReference2KHR malloc() {
        return new VkAttachmentReference2KHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAttachmentReference2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAttachmentReference2KHR calloc() {
        return new VkAttachmentReference2KHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAttachmentReference2KHR} instance allocated with {@link BufferUtils}. */
    public static VkAttachmentReference2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAttachmentReference2KHR(memAddress(container), container);
    }

    /** Returns a new {@code VkAttachmentReference2KHR} instance for the specified memory address. */
    public static VkAttachmentReference2KHR create(long address) {
        return new VkAttachmentReference2KHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkAttachmentReference2KHR createSafe(long address) {
        return address == NULL ? null : new VkAttachmentReference2KHR(address, null);
    }

    /**
     * Returns a new {@link VkAttachmentReference2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReference2KHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentReference2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReference2KHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentReference2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReference2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAttachmentReference2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReference2KHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkAttachmentReference2KHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkAttachmentReference2KHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkAttachmentReference2KHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkAttachmentReference2KHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkAttachmentReference2KHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkAttachmentReference2KHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkAttachmentReference2KHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkAttachmentReference2KHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkAttachmentReference2KHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkAttachmentReference2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAttachmentReference2KHR malloc(MemoryStack stack) {
        return new VkAttachmentReference2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAttachmentReference2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAttachmentReference2KHR calloc(MemoryStack stack) {
        return new VkAttachmentReference2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAttachmentReference2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReference2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentReference2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAttachmentReference2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkAttachmentReference2KHR} structs. */
    public static class Buffer extends VkAttachmentReference2.Buffer {

        private static final VkAttachmentReference2KHR ELEMENT_FACTORY = VkAttachmentReference2KHR.create(-1L);

        /**
         * Creates a new {@code VkAttachmentReference2KHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAttachmentReference2KHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkAttachmentReference2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkAttachmentReference2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkAttachmentReference2KHR.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2 STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2} value to the {@code sType} field. */
        @Override
        public VkAttachmentReference2KHR.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkAttachmentReference2KHR.Buffer pNext(@NativeType("void const *") long value) { VkAttachmentReference2KHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code attachment} field. */
        @Override
        public VkAttachmentReference2KHR.Buffer attachment(@NativeType("uint32_t") int value) { VkAttachmentReference2KHR.nattachment(address(), value); return this; }
        /** Sets the specified value to the {@code layout} field. */
        @Override
        public VkAttachmentReference2KHR.Buffer layout(@NativeType("VkImageLayout") int value) { VkAttachmentReference2KHR.nlayout(address(), value); return this; }
        /** Sets the specified value to the {@code aspectMask} field. */
        @Override
        public VkAttachmentReference2KHR.Buffer aspectMask(@NativeType("VkImageAspectFlags") int value) { VkAttachmentReference2KHR.naspectMask(address(), value); return this; }

    }

}