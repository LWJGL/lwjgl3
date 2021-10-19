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
 * See {@link VkDescriptorSetLayoutSupport}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDescriptorSetLayoutSupportKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 supported;
 * }</code></pre>
 */
public class VkDescriptorSetLayoutSupportKHR extends VkDescriptorSetLayoutSupport {

    /**
     * Creates a {@code VkDescriptorSetLayoutSupportKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorSetLayoutSupportKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkDescriptorSetLayoutSupportKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_SUPPORT STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_SUPPORT} value to the {@code sType} field. */
    @Override
    public VkDescriptorSetLayoutSupportKHR sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_SUPPORT); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkDescriptorSetLayoutSupportKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkDescriptorSetLayoutSupportKHR set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorSetLayoutSupportKHR set(VkDescriptorSetLayoutSupportKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDescriptorSetLayoutSupportKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorSetLayoutSupportKHR malloc() {
        return wrap(VkDescriptorSetLayoutSupportKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDescriptorSetLayoutSupportKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorSetLayoutSupportKHR calloc() {
        return wrap(VkDescriptorSetLayoutSupportKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDescriptorSetLayoutSupportKHR} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorSetLayoutSupportKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDescriptorSetLayoutSupportKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorSetLayoutSupportKHR} instance for the specified memory address. */
    public static VkDescriptorSetLayoutSupportKHR create(long address) {
        return wrap(VkDescriptorSetLayoutSupportKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorSetLayoutSupportKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkDescriptorSetLayoutSupportKHR.class, address);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutSupportKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutSupportKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutSupportKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutSupportKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutSupportKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutSupportKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDescriptorSetLayoutSupportKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutSupportKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorSetLayoutSupportKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutSupportKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutSupportKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutSupportKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutSupportKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutSupportKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutSupportKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutSupportKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorSetLayoutSupportKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDescriptorSetLayoutSupportKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorSetLayoutSupportKHR malloc(MemoryStack stack) {
        return wrap(VkDescriptorSetLayoutSupportKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDescriptorSetLayoutSupportKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorSetLayoutSupportKHR calloc(MemoryStack stack) {
        return wrap(VkDescriptorSetLayoutSupportKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutSupportKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutSupportKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutSupportKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutSupportKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkDescriptorSetLayoutSupportKHR} structs. */
    public static class Buffer extends VkDescriptorSetLayoutSupport.Buffer {

        private static final VkDescriptorSetLayoutSupportKHR ELEMENT_FACTORY = VkDescriptorSetLayoutSupportKHR.create(-1L);

        /**
         * Creates a new {@code VkDescriptorSetLayoutSupportKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorSetLayoutSupportKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkDescriptorSetLayoutSupportKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkDescriptorSetLayoutSupportKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkDescriptorSetLayoutSupportKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_SUPPORT STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_SUPPORT} value to the {@code sType} field. */
        @Override
        public VkDescriptorSetLayoutSupportKHR.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_SUPPORT); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkDescriptorSetLayoutSupportKHR.Buffer pNext(@NativeType("void *") long value) { VkDescriptorSetLayoutSupportKHR.npNext(address(), value); return this; }

    }

}