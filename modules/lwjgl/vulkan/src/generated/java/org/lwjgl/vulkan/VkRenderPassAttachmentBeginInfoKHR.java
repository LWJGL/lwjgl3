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
 * See {@link VkRenderPassAttachmentBeginInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkRenderPassAttachmentBeginInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t attachmentCount;
 *     VkImageView const * pAttachments;
 * }</code></pre>
 */
public class VkRenderPassAttachmentBeginInfoKHR extends VkRenderPassAttachmentBeginInfo {

    /**
     * Creates a {@code VkRenderPassAttachmentBeginInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderPassAttachmentBeginInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkRenderPassAttachmentBeginInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_RENDER_PASS_ATTACHMENT_BEGIN_INFO STRUCTURE_TYPE_RENDER_PASS_ATTACHMENT_BEGIN_INFO} value to the {@code sType} field. */
    @Override
    public VkRenderPassAttachmentBeginInfoKHR sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_RENDER_PASS_ATTACHMENT_BEGIN_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkRenderPassAttachmentBeginInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pAttachments} field. */
    @Override
    public VkRenderPassAttachmentBeginInfoKHR pAttachments(@Nullable @NativeType("VkImageView const *") LongBuffer value) { npAttachments(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkRenderPassAttachmentBeginInfoKHR set(
        int sType,
        long pNext,
        @Nullable LongBuffer pAttachments
    ) {
        sType(sType);
        pNext(pNext);
        pAttachments(pAttachments);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRenderPassAttachmentBeginInfoKHR set(VkRenderPassAttachmentBeginInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderPassAttachmentBeginInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderPassAttachmentBeginInfoKHR malloc() {
        return wrap(VkRenderPassAttachmentBeginInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkRenderPassAttachmentBeginInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderPassAttachmentBeginInfoKHR calloc() {
        return wrap(VkRenderPassAttachmentBeginInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkRenderPassAttachmentBeginInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkRenderPassAttachmentBeginInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkRenderPassAttachmentBeginInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkRenderPassAttachmentBeginInfoKHR} instance for the specified memory address. */
    public static VkRenderPassAttachmentBeginInfoKHR create(long address) {
        return wrap(VkRenderPassAttachmentBeginInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderPassAttachmentBeginInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkRenderPassAttachmentBeginInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkRenderPassAttachmentBeginInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassAttachmentBeginInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassAttachmentBeginInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassAttachmentBeginInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassAttachmentBeginInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassAttachmentBeginInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkRenderPassAttachmentBeginInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderPassAttachmentBeginInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderPassAttachmentBeginInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkRenderPassAttachmentBeginInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkRenderPassAttachmentBeginInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkRenderPassAttachmentBeginInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkRenderPassAttachmentBeginInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRenderPassAttachmentBeginInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRenderPassAttachmentBeginInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRenderPassAttachmentBeginInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRenderPassAttachmentBeginInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkRenderPassAttachmentBeginInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassAttachmentBeginInfoKHR malloc(MemoryStack stack) {
        return wrap(VkRenderPassAttachmentBeginInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkRenderPassAttachmentBeginInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassAttachmentBeginInfoKHR calloc(MemoryStack stack) {
        return wrap(VkRenderPassAttachmentBeginInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkRenderPassAttachmentBeginInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassAttachmentBeginInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassAttachmentBeginInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassAttachmentBeginInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkRenderPassAttachmentBeginInfoKHR} structs. */
    public static class Buffer extends VkRenderPassAttachmentBeginInfo.Buffer {

        private static final VkRenderPassAttachmentBeginInfoKHR ELEMENT_FACTORY = VkRenderPassAttachmentBeginInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkRenderPassAttachmentBeginInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderPassAttachmentBeginInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkRenderPassAttachmentBeginInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkRenderPassAttachmentBeginInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderPassAttachmentBeginInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_RENDER_PASS_ATTACHMENT_BEGIN_INFO STRUCTURE_TYPE_RENDER_PASS_ATTACHMENT_BEGIN_INFO} value to the {@code sType} field. */
        @Override
        public VkRenderPassAttachmentBeginInfoKHR.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_RENDER_PASS_ATTACHMENT_BEGIN_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkRenderPassAttachmentBeginInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkRenderPassAttachmentBeginInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pAttachments} field. */
        @Override
        public VkRenderPassAttachmentBeginInfoKHR.Buffer pAttachments(@Nullable @NativeType("VkImageView const *") LongBuffer value) { VkRenderPassAttachmentBeginInfoKHR.npAttachments(address(), value); return this; }

    }

}