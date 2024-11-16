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
 * See {@link VkSparseImageMemoryRequirements2}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSparseImageMemoryRequirements2KHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     {@link VkSparseImageMemoryRequirements VkSparseImageMemoryRequirements} memoryRequirements;
 * }</code></pre>
 */
public class VkSparseImageMemoryRequirements2KHR extends VkSparseImageMemoryRequirements2 {

    protected VkSparseImageMemoryRequirements2KHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSparseImageMemoryRequirements2KHR create(long address, @Nullable ByteBuffer container) {
        return new VkSparseImageMemoryRequirements2KHR(address, container);
    }

    /**
     * Creates a {@code VkSparseImageMemoryRequirements2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSparseImageMemoryRequirements2KHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkSparseImageMemoryRequirements2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2 STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2} value to the {@code sType} field. */
    @Override
    public VkSparseImageMemoryRequirements2KHR sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkSparseImageMemoryRequirements2KHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkSparseImageMemoryRequirements2KHR set(
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
    public VkSparseImageMemoryRequirements2KHR set(VkSparseImageMemoryRequirements2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSparseImageMemoryRequirements2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSparseImageMemoryRequirements2KHR malloc() {
        return new VkSparseImageMemoryRequirements2KHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSparseImageMemoryRequirements2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSparseImageMemoryRequirements2KHR calloc() {
        return new VkSparseImageMemoryRequirements2KHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSparseImageMemoryRequirements2KHR} instance allocated with {@link BufferUtils}. */
    public static VkSparseImageMemoryRequirements2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSparseImageMemoryRequirements2KHR(memAddress(container), container);
    }

    /** Returns a new {@code VkSparseImageMemoryRequirements2KHR} instance for the specified memory address. */
    public static VkSparseImageMemoryRequirements2KHR create(long address) {
        return new VkSparseImageMemoryRequirements2KHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSparseImageMemoryRequirements2KHR createSafe(long address) {
        return address == NULL ? null : new VkSparseImageMemoryRequirements2KHR(address, null);
    }

    /**
     * Returns a new {@link VkSparseImageMemoryRequirements2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSparseImageMemoryRequirements2KHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSparseImageMemoryRequirements2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSparseImageMemoryRequirements2KHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSparseImageMemoryRequirements2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSparseImageMemoryRequirements2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSparseImageMemoryRequirements2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSparseImageMemoryRequirements2KHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSparseImageMemoryRequirements2KHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSparseImageMemoryRequirements2KHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSparseImageMemoryRequirements2KHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSparseImageMemoryRequirements2KHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSparseImageMemoryRequirements2KHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSparseImageMemoryRequirements2KHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSparseImageMemoryRequirements2KHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSparseImageMemoryRequirements2KHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSparseImageMemoryRequirements2KHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkSparseImageMemoryRequirements2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSparseImageMemoryRequirements2KHR malloc(MemoryStack stack) {
        return new VkSparseImageMemoryRequirements2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSparseImageMemoryRequirements2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSparseImageMemoryRequirements2KHR calloc(MemoryStack stack) {
        return new VkSparseImageMemoryRequirements2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSparseImageMemoryRequirements2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSparseImageMemoryRequirements2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSparseImageMemoryRequirements2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSparseImageMemoryRequirements2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkSparseImageMemoryRequirements2KHR} structs. */
    public static class Buffer extends VkSparseImageMemoryRequirements2.Buffer {

        private static final VkSparseImageMemoryRequirements2KHR ELEMENT_FACTORY = VkSparseImageMemoryRequirements2KHR.create(-1L);

        /**
         * Creates a new {@code VkSparseImageMemoryRequirements2KHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSparseImageMemoryRequirements2KHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSparseImageMemoryRequirements2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkSparseImageMemoryRequirements2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkSparseImageMemoryRequirements2KHR.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2 STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2} value to the {@code sType} field. */
        @Override
        public VkSparseImageMemoryRequirements2KHR.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkSparseImageMemoryRequirements2KHR.Buffer pNext(@NativeType("void *") long value) { VkSparseImageMemoryRequirements2KHR.npNext(address(), value); return this; }

    }

}