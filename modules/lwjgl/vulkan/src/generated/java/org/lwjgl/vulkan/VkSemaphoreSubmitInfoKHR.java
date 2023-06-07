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
 * See {@link VkSemaphoreSubmitInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSemaphoreSubmitInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkSemaphore semaphore;
 *     uint64_t value;
 *     VkPipelineStageFlags2 stageMask;
 *     uint32_t deviceIndex;
 * }</code></pre>
 */
public class VkSemaphoreSubmitInfoKHR extends VkSemaphoreSubmitInfo {

    protected VkSemaphoreSubmitInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSemaphoreSubmitInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkSemaphoreSubmitInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkSemaphoreSubmitInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSemaphoreSubmitInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkSemaphoreSubmitInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO} value to the {@code sType} field. */
    @Override
    public VkSemaphoreSubmitInfoKHR sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkSemaphoreSubmitInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code semaphore} field. */
    @Override
    public VkSemaphoreSubmitInfoKHR semaphore(@NativeType("VkSemaphore") long value) { nsemaphore(address(), value); return this; }
    /** Sets the specified value to the {@code value} field. */
    @Override
    public VkSemaphoreSubmitInfoKHR value(@NativeType("uint64_t") long value) { nvalue(address(), value); return this; }
    /** Sets the specified value to the {@code stageMask} field. */
    @Override
    public VkSemaphoreSubmitInfoKHR stageMask(@NativeType("VkPipelineStageFlags2") long value) { nstageMask(address(), value); return this; }
    /** Sets the specified value to the {@code deviceIndex} field. */
    @Override
    public VkSemaphoreSubmitInfoKHR deviceIndex(@NativeType("uint32_t") int value) { ndeviceIndex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkSemaphoreSubmitInfoKHR set(
        int sType,
        long pNext,
        long semaphore,
        long value,
        long stageMask,
        int deviceIndex
    ) {
        sType(sType);
        pNext(pNext);
        semaphore(semaphore);
        value(value);
        stageMask(stageMask);
        deviceIndex(deviceIndex);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSemaphoreSubmitInfoKHR set(VkSemaphoreSubmitInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSemaphoreSubmitInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSemaphoreSubmitInfoKHR malloc() {
        return new VkSemaphoreSubmitInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSemaphoreSubmitInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSemaphoreSubmitInfoKHR calloc() {
        return new VkSemaphoreSubmitInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSemaphoreSubmitInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkSemaphoreSubmitInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSemaphoreSubmitInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkSemaphoreSubmitInfoKHR} instance for the specified memory address. */
    public static VkSemaphoreSubmitInfoKHR create(long address) {
        return new VkSemaphoreSubmitInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSemaphoreSubmitInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkSemaphoreSubmitInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkSemaphoreSubmitInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSubmitInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreSubmitInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSubmitInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreSubmitInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSubmitInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSemaphoreSubmitInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSubmitInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSemaphoreSubmitInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSemaphoreSubmitInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSemaphoreSubmitInfoKHR malloc(MemoryStack stack) {
        return new VkSemaphoreSubmitInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSemaphoreSubmitInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSemaphoreSubmitInfoKHR calloc(MemoryStack stack) {
        return new VkSemaphoreSubmitInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSemaphoreSubmitInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSubmitInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreSubmitInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSubmitInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkSemaphoreSubmitInfoKHR} structs. */
    public static class Buffer extends VkSemaphoreSubmitInfo.Buffer {

        private static final VkSemaphoreSubmitInfoKHR ELEMENT_FACTORY = VkSemaphoreSubmitInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkSemaphoreSubmitInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSemaphoreSubmitInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSemaphoreSubmitInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkSemaphoreSubmitInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkSemaphoreSubmitInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO} value to the {@code sType} field. */
        @Override
        public VkSemaphoreSubmitInfoKHR.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkSemaphoreSubmitInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkSemaphoreSubmitInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code semaphore} field. */
        @Override
        public VkSemaphoreSubmitInfoKHR.Buffer semaphore(@NativeType("VkSemaphore") long value) { VkSemaphoreSubmitInfoKHR.nsemaphore(address(), value); return this; }
        /** Sets the specified value to the {@code value} field. */
        @Override
        public VkSemaphoreSubmitInfoKHR.Buffer value(@NativeType("uint64_t") long value) { VkSemaphoreSubmitInfoKHR.nvalue(address(), value); return this; }
        /** Sets the specified value to the {@code stageMask} field. */
        @Override
        public VkSemaphoreSubmitInfoKHR.Buffer stageMask(@NativeType("VkPipelineStageFlags2") long value) { VkSemaphoreSubmitInfoKHR.nstageMask(address(), value); return this; }
        /** Sets the specified value to the {@code deviceIndex} field. */
        @Override
        public VkSemaphoreSubmitInfoKHR.Buffer deviceIndex(@NativeType("uint32_t") int value) { VkSemaphoreSubmitInfoKHR.ndeviceIndex(address(), value); return this; }

    }

}