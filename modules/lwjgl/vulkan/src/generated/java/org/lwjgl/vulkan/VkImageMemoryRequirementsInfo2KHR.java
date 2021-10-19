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
 * See {@link VkImageMemoryRequirementsInfo2}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImageMemoryRequirementsInfo2KHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkImage image;
 * }</code></pre>
 */
public class VkImageMemoryRequirementsInfo2KHR extends VkImageMemoryRequirementsInfo2 {

    /**
     * Creates a {@code VkImageMemoryRequirementsInfo2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageMemoryRequirementsInfo2KHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkImageMemoryRequirementsInfo2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2 STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2} value to the {@code sType} field. */
    @Override
    public VkImageMemoryRequirementsInfo2KHR sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkImageMemoryRequirementsInfo2KHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code image} field. */
    @Override
    public VkImageMemoryRequirementsInfo2KHR image(@NativeType("VkImage") long value) { nimage(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkImageMemoryRequirementsInfo2KHR set(
        int sType,
        long pNext,
        long image
    ) {
        sType(sType);
        pNext(pNext);
        image(image);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageMemoryRequirementsInfo2KHR set(VkImageMemoryRequirementsInfo2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageMemoryRequirementsInfo2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageMemoryRequirementsInfo2KHR malloc() {
        return wrap(VkImageMemoryRequirementsInfo2KHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkImageMemoryRequirementsInfo2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageMemoryRequirementsInfo2KHR calloc() {
        return wrap(VkImageMemoryRequirementsInfo2KHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkImageMemoryRequirementsInfo2KHR} instance allocated with {@link BufferUtils}. */
    public static VkImageMemoryRequirementsInfo2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkImageMemoryRequirementsInfo2KHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkImageMemoryRequirementsInfo2KHR} instance for the specified memory address. */
    public static VkImageMemoryRequirementsInfo2KHR create(long address) {
        return wrap(VkImageMemoryRequirementsInfo2KHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageMemoryRequirementsInfo2KHR createSafe(long address) {
        return address == NULL ? null : wrap(VkImageMemoryRequirementsInfo2KHR.class, address);
    }

    /**
     * Returns a new {@link VkImageMemoryRequirementsInfo2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryRequirementsInfo2KHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageMemoryRequirementsInfo2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryRequirementsInfo2KHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageMemoryRequirementsInfo2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryRequirementsInfo2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkImageMemoryRequirementsInfo2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryRequirementsInfo2KHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageMemoryRequirementsInfo2KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageMemoryRequirementsInfo2KHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageMemoryRequirementsInfo2KHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageMemoryRequirementsInfo2KHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageMemoryRequirementsInfo2KHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageMemoryRequirementsInfo2KHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageMemoryRequirementsInfo2KHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageMemoryRequirementsInfo2KHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageMemoryRequirementsInfo2KHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkImageMemoryRequirementsInfo2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageMemoryRequirementsInfo2KHR malloc(MemoryStack stack) {
        return wrap(VkImageMemoryRequirementsInfo2KHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkImageMemoryRequirementsInfo2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageMemoryRequirementsInfo2KHR calloc(MemoryStack stack) {
        return wrap(VkImageMemoryRequirementsInfo2KHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImageMemoryRequirementsInfo2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryRequirementsInfo2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageMemoryRequirementsInfo2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryRequirementsInfo2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkImageMemoryRequirementsInfo2KHR} structs. */
    public static class Buffer extends VkImageMemoryRequirementsInfo2.Buffer {

        private static final VkImageMemoryRequirementsInfo2KHR ELEMENT_FACTORY = VkImageMemoryRequirementsInfo2KHR.create(-1L);

        /**
         * Creates a new {@code VkImageMemoryRequirementsInfo2KHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageMemoryRequirementsInfo2KHR#SIZEOF}, and its mark will be undefined.
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
        protected VkImageMemoryRequirementsInfo2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkImageMemoryRequirementsInfo2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkImageMemoryRequirementsInfo2KHR.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2 STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2} value to the {@code sType} field. */
        @Override
        public VkImageMemoryRequirementsInfo2KHR.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkImageMemoryRequirementsInfo2KHR.Buffer pNext(@NativeType("void const *") long value) { VkImageMemoryRequirementsInfo2KHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code image} field. */
        @Override
        public VkImageMemoryRequirementsInfo2KHR.Buffer image(@NativeType("VkImage") long value) { VkImageMemoryRequirementsInfo2KHR.nimage(address(), value); return this; }

    }

}