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
 * See {@link VkExternalMemoryBufferCreateInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkExternalMemoryBufferCreateInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkExternalMemoryHandleTypeFlags handleTypes;
 * }</code></pre>
 */
public class VkExternalMemoryBufferCreateInfoKHR extends VkExternalMemoryBufferCreateInfo {

    protected VkExternalMemoryBufferCreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkExternalMemoryBufferCreateInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkExternalMemoryBufferCreateInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkExternalMemoryBufferCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExternalMemoryBufferCreateInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkExternalMemoryBufferCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_BUFFER_CREATE_INFO STRUCTURE_TYPE_EXTERNAL_MEMORY_BUFFER_CREATE_INFO} value to the {@code sType} field. */
    @Override
    public VkExternalMemoryBufferCreateInfoKHR sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_BUFFER_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkExternalMemoryBufferCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code handleTypes} field. */
    @Override
    public VkExternalMemoryBufferCreateInfoKHR handleTypes(@NativeType("VkExternalMemoryHandleTypeFlags") int value) { nhandleTypes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkExternalMemoryBufferCreateInfoKHR set(
        int sType,
        long pNext,
        int handleTypes
    ) {
        sType(sType);
        pNext(pNext);
        handleTypes(handleTypes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkExternalMemoryBufferCreateInfoKHR set(VkExternalMemoryBufferCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkExternalMemoryBufferCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExternalMemoryBufferCreateInfoKHR malloc() {
        return new VkExternalMemoryBufferCreateInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkExternalMemoryBufferCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExternalMemoryBufferCreateInfoKHR calloc() {
        return new VkExternalMemoryBufferCreateInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkExternalMemoryBufferCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkExternalMemoryBufferCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExternalMemoryBufferCreateInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkExternalMemoryBufferCreateInfoKHR} instance for the specified memory address. */
    public static VkExternalMemoryBufferCreateInfoKHR create(long address) {
        return new VkExternalMemoryBufferCreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkExternalMemoryBufferCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkExternalMemoryBufferCreateInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkExternalMemoryBufferCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalMemoryBufferCreateInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkExternalMemoryBufferCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalMemoryBufferCreateInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalMemoryBufferCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalMemoryBufferCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkExternalMemoryBufferCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExternalMemoryBufferCreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkExternalMemoryBufferCreateInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkExternalMemoryBufferCreateInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkExternalMemoryBufferCreateInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkExternalMemoryBufferCreateInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkExternalMemoryBufferCreateInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExternalMemoryBufferCreateInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExternalMemoryBufferCreateInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExternalMemoryBufferCreateInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExternalMemoryBufferCreateInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkExternalMemoryBufferCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExternalMemoryBufferCreateInfoKHR malloc(MemoryStack stack) {
        return new VkExternalMemoryBufferCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkExternalMemoryBufferCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExternalMemoryBufferCreateInfoKHR calloc(MemoryStack stack) {
        return new VkExternalMemoryBufferCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkExternalMemoryBufferCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExternalMemoryBufferCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalMemoryBufferCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExternalMemoryBufferCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkExternalMemoryBufferCreateInfoKHR} structs. */
    public static class Buffer extends VkExternalMemoryBufferCreateInfo.Buffer {

        private static final VkExternalMemoryBufferCreateInfoKHR ELEMENT_FACTORY = VkExternalMemoryBufferCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkExternalMemoryBufferCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExternalMemoryBufferCreateInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkExternalMemoryBufferCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkExternalMemoryBufferCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkExternalMemoryBufferCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_BUFFER_CREATE_INFO STRUCTURE_TYPE_EXTERNAL_MEMORY_BUFFER_CREATE_INFO} value to the {@code sType} field. */
        @Override
        public VkExternalMemoryBufferCreateInfoKHR.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_BUFFER_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkExternalMemoryBufferCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkExternalMemoryBufferCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code handleTypes} field. */
        @Override
        public VkExternalMemoryBufferCreateInfoKHR.Buffer handleTypes(@NativeType("VkExternalMemoryHandleTypeFlags") int value) { VkExternalMemoryBufferCreateInfoKHR.nhandleTypes(address(), value); return this; }

    }

}