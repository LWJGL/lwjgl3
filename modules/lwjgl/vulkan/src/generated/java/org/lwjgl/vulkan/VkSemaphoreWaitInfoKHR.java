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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * See {@link VkSemaphoreWaitInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSemaphoreWaitInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkSemaphoreWaitFlags flags;
 *     uint32_t semaphoreCount;
 *     VkSemaphore const * pSemaphores;
 *     uint64_t const * pValues;
 * }</code></pre>
 */
public class VkSemaphoreWaitInfoKHR extends VkSemaphoreWaitInfo {

    protected VkSemaphoreWaitInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSemaphoreWaitInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkSemaphoreWaitInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkSemaphoreWaitInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSemaphoreWaitInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkSemaphoreWaitInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO} value to the {@code sType} field. */
    @Override
    public VkSemaphoreWaitInfoKHR sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkSemaphoreWaitInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    @Override
    public VkSemaphoreWaitInfoKHR flags(@NativeType("VkSemaphoreWaitFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code semaphoreCount} field. */
    @Override
    public VkSemaphoreWaitInfoKHR semaphoreCount(@NativeType("uint32_t") int value) { nsemaphoreCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pSemaphores} field. */
    @Override
    public VkSemaphoreWaitInfoKHR pSemaphores(@NativeType("VkSemaphore const *") LongBuffer value) { npSemaphores(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pValues} field. */
    @Override
    public VkSemaphoreWaitInfoKHR pValues(@NativeType("uint64_t const *") LongBuffer value) { npValues(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkSemaphoreWaitInfoKHR set(
        int sType,
        long pNext,
        int flags,
        int semaphoreCount,
        LongBuffer pSemaphores,
        LongBuffer pValues
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        semaphoreCount(semaphoreCount);
        pSemaphores(pSemaphores);
        pValues(pValues);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSemaphoreWaitInfoKHR set(VkSemaphoreWaitInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSemaphoreWaitInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSemaphoreWaitInfoKHR malloc() {
        return new VkSemaphoreWaitInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSemaphoreWaitInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSemaphoreWaitInfoKHR calloc() {
        return new VkSemaphoreWaitInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSemaphoreWaitInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkSemaphoreWaitInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSemaphoreWaitInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkSemaphoreWaitInfoKHR} instance for the specified memory address. */
    public static VkSemaphoreWaitInfoKHR create(long address) {
        return new VkSemaphoreWaitInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSemaphoreWaitInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkSemaphoreWaitInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkSemaphoreWaitInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreWaitInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreWaitInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreWaitInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreWaitInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreWaitInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSemaphoreWaitInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreWaitInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSemaphoreWaitInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSemaphoreWaitInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSemaphoreWaitInfoKHR malloc(MemoryStack stack) {
        return new VkSemaphoreWaitInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSemaphoreWaitInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSemaphoreWaitInfoKHR calloc(MemoryStack stack) {
        return new VkSemaphoreWaitInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSemaphoreWaitInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreWaitInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreWaitInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreWaitInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkSemaphoreWaitInfoKHR} structs. */
    public static class Buffer extends VkSemaphoreWaitInfo.Buffer {

        private static final VkSemaphoreWaitInfoKHR ELEMENT_FACTORY = VkSemaphoreWaitInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkSemaphoreWaitInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSemaphoreWaitInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSemaphoreWaitInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkSemaphoreWaitInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkSemaphoreWaitInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO} value to the {@code sType} field. */
        @Override
        public VkSemaphoreWaitInfoKHR.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkSemaphoreWaitInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkSemaphoreWaitInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        @Override
        public VkSemaphoreWaitInfoKHR.Buffer flags(@NativeType("VkSemaphoreWaitFlags") int value) { VkSemaphoreWaitInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code semaphoreCount} field. */
        @Override
        public VkSemaphoreWaitInfoKHR.Buffer semaphoreCount(@NativeType("uint32_t") int value) { VkSemaphoreWaitInfoKHR.nsemaphoreCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pSemaphores} field. */
        @Override
        public VkSemaphoreWaitInfoKHR.Buffer pSemaphores(@NativeType("VkSemaphore const *") LongBuffer value) { VkSemaphoreWaitInfoKHR.npSemaphores(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pValues} field. */
        @Override
        public VkSemaphoreWaitInfoKHR.Buffer pValues(@NativeType("uint64_t const *") LongBuffer value) { VkSemaphoreWaitInfoKHR.npValues(address(), value); return this; }

    }

}