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
 * See {@link VkRenderPassInputAttachmentAspectCreateInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkRenderPassInputAttachmentAspectCreateInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t aspectReferenceCount;
 *     {@link VkInputAttachmentAspectReference VkInputAttachmentAspectReference} const * pAspectReferences;
 * }</code></pre>
 */
public class VkRenderPassInputAttachmentAspectCreateInfoKHR extends VkRenderPassInputAttachmentAspectCreateInfo {

    /**
     * Creates a {@code VkRenderPassInputAttachmentAspectCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderPassInputAttachmentAspectCreateInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkRenderPassInputAttachmentAspectCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO} value to the {@code sType} field. */
    @Override
    public VkRenderPassInputAttachmentAspectCreateInfoKHR sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkRenderPassInputAttachmentAspectCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkInputAttachmentAspectReference.Buffer} to the {@code pAspectReferences} field. */
    @Override
    public VkRenderPassInputAttachmentAspectCreateInfoKHR pAspectReferences(@NativeType("VkInputAttachmentAspectReference const *") VkInputAttachmentAspectReference.Buffer value) { npAspectReferences(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkRenderPassInputAttachmentAspectCreateInfoKHR set(
        int sType,
        long pNext,
        VkInputAttachmentAspectReference.Buffer pAspectReferences
    ) {
        sType(sType);
        pNext(pNext);
        pAspectReferences(pAspectReferences);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRenderPassInputAttachmentAspectCreateInfoKHR set(VkRenderPassInputAttachmentAspectCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderPassInputAttachmentAspectCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR malloc() {
        return wrap(VkRenderPassInputAttachmentAspectCreateInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkRenderPassInputAttachmentAspectCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR calloc() {
        return wrap(VkRenderPassInputAttachmentAspectCreateInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkRenderPassInputAttachmentAspectCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkRenderPassInputAttachmentAspectCreateInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkRenderPassInputAttachmentAspectCreateInfoKHR} instance for the specified memory address. */
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR create(long address) {
        return wrap(VkRenderPassInputAttachmentAspectCreateInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkRenderPassInputAttachmentAspectCreateInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkRenderPassInputAttachmentAspectCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassInputAttachmentAspectCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassInputAttachmentAspectCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkRenderPassInputAttachmentAspectCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkRenderPassInputAttachmentAspectCreateInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkRenderPassInputAttachmentAspectCreateInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkRenderPassInputAttachmentAspectCreateInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkRenderPassInputAttachmentAspectCreateInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRenderPassInputAttachmentAspectCreateInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRenderPassInputAttachmentAspectCreateInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRenderPassInputAttachmentAspectCreateInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRenderPassInputAttachmentAspectCreateInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkRenderPassInputAttachmentAspectCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR malloc(MemoryStack stack) {
        return wrap(VkRenderPassInputAttachmentAspectCreateInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkRenderPassInputAttachmentAspectCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR calloc(MemoryStack stack) {
        return wrap(VkRenderPassInputAttachmentAspectCreateInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkRenderPassInputAttachmentAspectCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassInputAttachmentAspectCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassInputAttachmentAspectCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkRenderPassInputAttachmentAspectCreateInfoKHR} structs. */
    public static class Buffer extends VkRenderPassInputAttachmentAspectCreateInfo.Buffer {

        private static final VkRenderPassInputAttachmentAspectCreateInfoKHR ELEMENT_FACTORY = VkRenderPassInputAttachmentAspectCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkRenderPassInputAttachmentAspectCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderPassInputAttachmentAspectCreateInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkRenderPassInputAttachmentAspectCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkRenderPassInputAttachmentAspectCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderPassInputAttachmentAspectCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO} value to the {@code sType} field. */
        @Override
        public VkRenderPassInputAttachmentAspectCreateInfoKHR.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_RENDER_PASS_INPUT_ATTACHMENT_ASPECT_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkRenderPassInputAttachmentAspectCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkRenderPassInputAttachmentAspectCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkInputAttachmentAspectReference.Buffer} to the {@code pAspectReferences} field. */
        @Override
        public VkRenderPassInputAttachmentAspectCreateInfoKHR.Buffer pAspectReferences(@NativeType("VkInputAttachmentAspectReference const *") VkInputAttachmentAspectReference.Buffer value) { VkRenderPassInputAttachmentAspectCreateInfoKHR.npAspectReferences(address(), value); return this; }

    }

}