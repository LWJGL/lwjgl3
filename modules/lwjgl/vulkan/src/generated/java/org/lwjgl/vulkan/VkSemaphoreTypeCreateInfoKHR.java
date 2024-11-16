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
 * See {@link VkSemaphoreTypeCreateInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSemaphoreTypeCreateInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkSemaphoreType semaphoreType;
 *     uint64_t initialValue;
 * }</code></pre>
 */
public class VkSemaphoreTypeCreateInfoKHR extends VkSemaphoreTypeCreateInfo {

    protected VkSemaphoreTypeCreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSemaphoreTypeCreateInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkSemaphoreTypeCreateInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkSemaphoreTypeCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSemaphoreTypeCreateInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkSemaphoreTypeCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO} value to the {@code sType} field. */
    @Override
    public VkSemaphoreTypeCreateInfoKHR sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkSemaphoreTypeCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code semaphoreType} field. */
    @Override
    public VkSemaphoreTypeCreateInfoKHR semaphoreType(@NativeType("VkSemaphoreType") int value) { nsemaphoreType(address(), value); return this; }
    /** Sets the specified value to the {@code initialValue} field. */
    @Override
    public VkSemaphoreTypeCreateInfoKHR initialValue(@NativeType("uint64_t") long value) { ninitialValue(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkSemaphoreTypeCreateInfoKHR set(
        int sType,
        long pNext,
        int semaphoreType,
        long initialValue
    ) {
        sType(sType);
        pNext(pNext);
        semaphoreType(semaphoreType);
        initialValue(initialValue);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSemaphoreTypeCreateInfoKHR set(VkSemaphoreTypeCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSemaphoreTypeCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSemaphoreTypeCreateInfoKHR malloc() {
        return new VkSemaphoreTypeCreateInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSemaphoreTypeCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSemaphoreTypeCreateInfoKHR calloc() {
        return new VkSemaphoreTypeCreateInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSemaphoreTypeCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkSemaphoreTypeCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSemaphoreTypeCreateInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkSemaphoreTypeCreateInfoKHR} instance for the specified memory address. */
    public static VkSemaphoreTypeCreateInfoKHR create(long address) {
        return new VkSemaphoreTypeCreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSemaphoreTypeCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkSemaphoreTypeCreateInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkSemaphoreTypeCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreTypeCreateInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreTypeCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreTypeCreateInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreTypeCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreTypeCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSemaphoreTypeCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreTypeCreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSemaphoreTypeCreateInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSemaphoreTypeCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSemaphoreTypeCreateInfoKHR malloc(MemoryStack stack) {
        return new VkSemaphoreTypeCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSemaphoreTypeCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSemaphoreTypeCreateInfoKHR calloc(MemoryStack stack) {
        return new VkSemaphoreTypeCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSemaphoreTypeCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreTypeCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreTypeCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreTypeCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkSemaphoreTypeCreateInfoKHR} structs. */
    public static class Buffer extends VkSemaphoreTypeCreateInfo.Buffer {

        private static final VkSemaphoreTypeCreateInfoKHR ELEMENT_FACTORY = VkSemaphoreTypeCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkSemaphoreTypeCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSemaphoreTypeCreateInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSemaphoreTypeCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkSemaphoreTypeCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkSemaphoreTypeCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO} value to the {@code sType} field. */
        @Override
        public VkSemaphoreTypeCreateInfoKHR.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkSemaphoreTypeCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkSemaphoreTypeCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code semaphoreType} field. */
        @Override
        public VkSemaphoreTypeCreateInfoKHR.Buffer semaphoreType(@NativeType("VkSemaphoreType") int value) { VkSemaphoreTypeCreateInfoKHR.nsemaphoreType(address(), value); return this; }
        /** Sets the specified value to the {@code initialValue} field. */
        @Override
        public VkSemaphoreTypeCreateInfoKHR.Buffer initialValue(@NativeType("uint64_t") long value) { VkSemaphoreTypeCreateInfoKHR.ninitialValue(address(), value); return this; }

    }

}