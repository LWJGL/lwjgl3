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
 * See {@link VkFramebufferAttachmentsCreateInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkFramebufferAttachmentsCreateInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t attachmentImageInfoCount;
 *     {@link VkFramebufferAttachmentImageInfo VkFramebufferAttachmentImageInfo} const * pAttachmentImageInfos;
 * }</code></pre>
 */
public class VkFramebufferAttachmentsCreateInfoKHR extends VkFramebufferAttachmentsCreateInfo {

    /**
     * Creates a {@code VkFramebufferAttachmentsCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkFramebufferAttachmentsCreateInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkFramebufferAttachmentsCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENTS_CREATE_INFO STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENTS_CREATE_INFO} value to the {@code sType} field. */
    @Override
    public VkFramebufferAttachmentsCreateInfoKHR sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENTS_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkFramebufferAttachmentsCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkFramebufferAttachmentImageInfo.Buffer} to the {@code pAttachmentImageInfos} field. */
    @Override
    public VkFramebufferAttachmentsCreateInfoKHR pAttachmentImageInfos(@Nullable @NativeType("VkFramebufferAttachmentImageInfo const *") VkFramebufferAttachmentImageInfo.Buffer value) { npAttachmentImageInfos(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkFramebufferAttachmentsCreateInfoKHR set(
        int sType,
        long pNext,
        @Nullable VkFramebufferAttachmentImageInfo.Buffer pAttachmentImageInfos
    ) {
        sType(sType);
        pNext(pNext);
        pAttachmentImageInfos(pAttachmentImageInfos);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkFramebufferAttachmentsCreateInfoKHR set(VkFramebufferAttachmentsCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkFramebufferAttachmentsCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkFramebufferAttachmentsCreateInfoKHR malloc() {
        return wrap(VkFramebufferAttachmentsCreateInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkFramebufferAttachmentsCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkFramebufferAttachmentsCreateInfoKHR calloc() {
        return wrap(VkFramebufferAttachmentsCreateInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkFramebufferAttachmentsCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkFramebufferAttachmentsCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkFramebufferAttachmentsCreateInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkFramebufferAttachmentsCreateInfoKHR} instance for the specified memory address. */
    public static VkFramebufferAttachmentsCreateInfoKHR create(long address) {
        return wrap(VkFramebufferAttachmentsCreateInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkFramebufferAttachmentsCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkFramebufferAttachmentsCreateInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkFramebufferAttachmentsCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentsCreateInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkFramebufferAttachmentsCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentsCreateInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFramebufferAttachmentsCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentsCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkFramebufferAttachmentsCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentsCreateInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkFramebufferAttachmentsCreateInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkFramebufferAttachmentsCreateInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkFramebufferAttachmentsCreateInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkFramebufferAttachmentsCreateInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkFramebufferAttachmentsCreateInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkFramebufferAttachmentsCreateInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkFramebufferAttachmentsCreateInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkFramebufferAttachmentsCreateInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkFramebufferAttachmentsCreateInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkFramebufferAttachmentsCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFramebufferAttachmentsCreateInfoKHR malloc(MemoryStack stack) {
        return wrap(VkFramebufferAttachmentsCreateInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkFramebufferAttachmentsCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFramebufferAttachmentsCreateInfoKHR calloc(MemoryStack stack) {
        return wrap(VkFramebufferAttachmentsCreateInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkFramebufferAttachmentsCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentsCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFramebufferAttachmentsCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentsCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkFramebufferAttachmentsCreateInfoKHR} structs. */
    public static class Buffer extends VkFramebufferAttachmentsCreateInfo.Buffer {

        private static final VkFramebufferAttachmentsCreateInfoKHR ELEMENT_FACTORY = VkFramebufferAttachmentsCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkFramebufferAttachmentsCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkFramebufferAttachmentsCreateInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkFramebufferAttachmentsCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkFramebufferAttachmentsCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkFramebufferAttachmentsCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENTS_CREATE_INFO STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENTS_CREATE_INFO} value to the {@code sType} field. */
        @Override
        public VkFramebufferAttachmentsCreateInfoKHR.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENTS_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkFramebufferAttachmentsCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkFramebufferAttachmentsCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkFramebufferAttachmentImageInfo.Buffer} to the {@code pAttachmentImageInfos} field. */
        @Override
        public VkFramebufferAttachmentsCreateInfoKHR.Buffer pAttachmentImageInfos(@Nullable @NativeType("VkFramebufferAttachmentImageInfo const *") VkFramebufferAttachmentImageInfo.Buffer value) { VkFramebufferAttachmentsCreateInfoKHR.npAttachmentImageInfos(address(), value); return this; }

    }

}