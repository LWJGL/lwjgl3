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
 * See {@link VkTimelineSemaphoreSubmitInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkTimelineSemaphoreSubmitInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t waitSemaphoreValueCount;
 *     uint64_t const * pWaitSemaphoreValues;
 *     uint32_t signalSemaphoreValueCount;
 *     uint64_t const * pSignalSemaphoreValues;
 * }</code></pre>
 */
public class VkTimelineSemaphoreSubmitInfoKHR extends VkTimelineSemaphoreSubmitInfo {

    /**
     * Creates a {@code VkTimelineSemaphoreSubmitInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkTimelineSemaphoreSubmitInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkTimelineSemaphoreSubmitInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO} value to the {@code sType} field. */
    @Override
    public VkTimelineSemaphoreSubmitInfoKHR sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkTimelineSemaphoreSubmitInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code waitSemaphoreValueCount} field. */
    @Override
    public VkTimelineSemaphoreSubmitInfoKHR waitSemaphoreValueCount(@NativeType("uint32_t") int value) { nwaitSemaphoreValueCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pWaitSemaphoreValues} field. */
    @Override
    public VkTimelineSemaphoreSubmitInfoKHR pWaitSemaphoreValues(@Nullable @NativeType("uint64_t const *") LongBuffer value) { npWaitSemaphoreValues(address(), value); return this; }
    /** Sets the specified value to the {@code signalSemaphoreValueCount} field. */
    @Override
    public VkTimelineSemaphoreSubmitInfoKHR signalSemaphoreValueCount(@NativeType("uint32_t") int value) { nsignalSemaphoreValueCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pSignalSemaphoreValues} field. */
    @Override
    public VkTimelineSemaphoreSubmitInfoKHR pSignalSemaphoreValues(@Nullable @NativeType("uint64_t const *") LongBuffer value) { npSignalSemaphoreValues(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkTimelineSemaphoreSubmitInfoKHR set(
        int sType,
        long pNext,
        int waitSemaphoreValueCount,
        @Nullable LongBuffer pWaitSemaphoreValues,
        int signalSemaphoreValueCount,
        @Nullable LongBuffer pSignalSemaphoreValues
    ) {
        sType(sType);
        pNext(pNext);
        waitSemaphoreValueCount(waitSemaphoreValueCount);
        pWaitSemaphoreValues(pWaitSemaphoreValues);
        signalSemaphoreValueCount(signalSemaphoreValueCount);
        pSignalSemaphoreValues(pSignalSemaphoreValues);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkTimelineSemaphoreSubmitInfoKHR set(VkTimelineSemaphoreSubmitInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkTimelineSemaphoreSubmitInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkTimelineSemaphoreSubmitInfoKHR malloc() {
        return wrap(VkTimelineSemaphoreSubmitInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkTimelineSemaphoreSubmitInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkTimelineSemaphoreSubmitInfoKHR calloc() {
        return wrap(VkTimelineSemaphoreSubmitInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkTimelineSemaphoreSubmitInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkTimelineSemaphoreSubmitInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkTimelineSemaphoreSubmitInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkTimelineSemaphoreSubmitInfoKHR} instance for the specified memory address. */
    public static VkTimelineSemaphoreSubmitInfoKHR create(long address) {
        return wrap(VkTimelineSemaphoreSubmitInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkTimelineSemaphoreSubmitInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkTimelineSemaphoreSubmitInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkTimelineSemaphoreSubmitInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTimelineSemaphoreSubmitInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkTimelineSemaphoreSubmitInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTimelineSemaphoreSubmitInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTimelineSemaphoreSubmitInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkTimelineSemaphoreSubmitInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkTimelineSemaphoreSubmitInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkTimelineSemaphoreSubmitInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkTimelineSemaphoreSubmitInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkTimelineSemaphoreSubmitInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTimelineSemaphoreSubmitInfoKHR malloc(MemoryStack stack) {
        return wrap(VkTimelineSemaphoreSubmitInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkTimelineSemaphoreSubmitInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTimelineSemaphoreSubmitInfoKHR calloc(MemoryStack stack) {
        return wrap(VkTimelineSemaphoreSubmitInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkTimelineSemaphoreSubmitInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTimelineSemaphoreSubmitInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTimelineSemaphoreSubmitInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTimelineSemaphoreSubmitInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkTimelineSemaphoreSubmitInfoKHR} structs. */
    public static class Buffer extends VkTimelineSemaphoreSubmitInfo.Buffer {

        private static final VkTimelineSemaphoreSubmitInfoKHR ELEMENT_FACTORY = VkTimelineSemaphoreSubmitInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkTimelineSemaphoreSubmitInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkTimelineSemaphoreSubmitInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkTimelineSemaphoreSubmitInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkTimelineSemaphoreSubmitInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkTimelineSemaphoreSubmitInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO} value to the {@code sType} field. */
        @Override
        public VkTimelineSemaphoreSubmitInfoKHR.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkTimelineSemaphoreSubmitInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkTimelineSemaphoreSubmitInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code waitSemaphoreValueCount} field. */
        @Override
        public VkTimelineSemaphoreSubmitInfoKHR.Buffer waitSemaphoreValueCount(@NativeType("uint32_t") int value) { VkTimelineSemaphoreSubmitInfoKHR.nwaitSemaphoreValueCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pWaitSemaphoreValues} field. */
        @Override
        public VkTimelineSemaphoreSubmitInfoKHR.Buffer pWaitSemaphoreValues(@Nullable @NativeType("uint64_t const *") LongBuffer value) { VkTimelineSemaphoreSubmitInfoKHR.npWaitSemaphoreValues(address(), value); return this; }
        /** Sets the specified value to the {@code signalSemaphoreValueCount} field. */
        @Override
        public VkTimelineSemaphoreSubmitInfoKHR.Buffer signalSemaphoreValueCount(@NativeType("uint32_t") int value) { VkTimelineSemaphoreSubmitInfoKHR.nsignalSemaphoreValueCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pSignalSemaphoreValues} field. */
        @Override
        public VkTimelineSemaphoreSubmitInfoKHR.Buffer pSignalSemaphoreValues(@Nullable @NativeType("uint64_t const *") LongBuffer value) { VkTimelineSemaphoreSubmitInfoKHR.npSignalSemaphoreValues(address(), value); return this; }

    }

}