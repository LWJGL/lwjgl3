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
 * See {@link VkSemaphoreSignalInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSemaphoreSignalInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkSemaphore semaphore;
 *     uint64_t value;
 * }</code></pre>
 */
public class VkSemaphoreSignalInfoKHR extends VkSemaphoreSignalInfo {

    /**
     * Creates a {@code VkSemaphoreSignalInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSemaphoreSignalInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkSemaphoreSignalInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO} value to the {@code sType} field. */
    @Override
    public VkSemaphoreSignalInfoKHR sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkSemaphoreSignalInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code semaphore} field. */
    @Override
    public VkSemaphoreSignalInfoKHR semaphore(@NativeType("VkSemaphore") long value) { nsemaphore(address(), value); return this; }
    /** Sets the specified value to the {@code value} field. */
    @Override
    public VkSemaphoreSignalInfoKHR value(@NativeType("uint64_t") long value) { nvalue(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkSemaphoreSignalInfoKHR set(
        int sType,
        long pNext,
        long semaphore,
        long value
    ) {
        sType(sType);
        pNext(pNext);
        semaphore(semaphore);
        value(value);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSemaphoreSignalInfoKHR set(VkSemaphoreSignalInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSemaphoreSignalInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSemaphoreSignalInfoKHR malloc() {
        return wrap(VkSemaphoreSignalInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSemaphoreSignalInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSemaphoreSignalInfoKHR calloc() {
        return wrap(VkSemaphoreSignalInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSemaphoreSignalInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkSemaphoreSignalInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSemaphoreSignalInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSemaphoreSignalInfoKHR} instance for the specified memory address. */
    public static VkSemaphoreSignalInfoKHR create(long address) {
        return wrap(VkSemaphoreSignalInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSemaphoreSignalInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkSemaphoreSignalInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkSemaphoreSignalInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSignalInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreSignalInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSignalInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreSignalInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSignalInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSemaphoreSignalInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSignalInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSemaphoreSignalInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkSemaphoreSignalInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSemaphoreSignalInfoKHR malloc(MemoryStack stack) {
        return wrap(VkSemaphoreSignalInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSemaphoreSignalInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSemaphoreSignalInfoKHR calloc(MemoryStack stack) {
        return wrap(VkSemaphoreSignalInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSemaphoreSignalInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSignalInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreSignalInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSignalInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkSemaphoreSignalInfoKHR} structs. */
    public static class Buffer extends VkSemaphoreSignalInfo.Buffer {

        private static final VkSemaphoreSignalInfoKHR ELEMENT_FACTORY = VkSemaphoreSignalInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkSemaphoreSignalInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSemaphoreSignalInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkSemaphoreSignalInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkSemaphoreSignalInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkSemaphoreSignalInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO} value to the {@code sType} field. */
        @Override
        public VkSemaphoreSignalInfoKHR.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkSemaphoreSignalInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkSemaphoreSignalInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code semaphore} field. */
        @Override
        public VkSemaphoreSignalInfoKHR.Buffer semaphore(@NativeType("VkSemaphore") long value) { VkSemaphoreSignalInfoKHR.nsemaphore(address(), value); return this; }
        /** Sets the specified value to the {@code value} field. */
        @Override
        public VkSemaphoreSignalInfoKHR.Buffer value(@NativeType("uint64_t") long value) { VkSemaphoreSignalInfoKHR.nvalue(address(), value); return this; }

    }

}