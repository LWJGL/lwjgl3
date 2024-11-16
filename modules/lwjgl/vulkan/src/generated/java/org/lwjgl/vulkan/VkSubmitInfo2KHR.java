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
 * See {@link VkSubmitInfo2}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSubmitInfo2KHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkSubmitFlags flags;
 *     uint32_t waitSemaphoreInfoCount;
 *     {@link VkSemaphoreSubmitInfo VkSemaphoreSubmitInfo} const * pWaitSemaphoreInfos;
 *     uint32_t commandBufferInfoCount;
 *     {@link VkCommandBufferSubmitInfo VkCommandBufferSubmitInfo} const * pCommandBufferInfos;
 *     uint32_t signalSemaphoreInfoCount;
 *     {@link VkSemaphoreSubmitInfo VkSemaphoreSubmitInfo} const * pSignalSemaphoreInfos;
 * }</code></pre>
 */
public class VkSubmitInfo2KHR extends VkSubmitInfo2 {

    protected VkSubmitInfo2KHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSubmitInfo2KHR create(long address, @Nullable ByteBuffer container) {
        return new VkSubmitInfo2KHR(address, container);
    }

    /**
     * Creates a {@code VkSubmitInfo2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSubmitInfo2KHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkSubmitInfo2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_SUBMIT_INFO_2 STRUCTURE_TYPE_SUBMIT_INFO_2} value to the {@code sType} field. */
    @Override
    public VkSubmitInfo2KHR sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_SUBMIT_INFO_2); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkSubmitInfo2KHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    @Override
    public VkSubmitInfo2KHR flags(@NativeType("VkSubmitFlags") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link VkSemaphoreSubmitInfo.Buffer} to the {@code pWaitSemaphoreInfos} field. */
    @Override
    public VkSubmitInfo2KHR pWaitSemaphoreInfos(@NativeType("VkSemaphoreSubmitInfo const *") VkSemaphoreSubmitInfo.@Nullable Buffer value) { npWaitSemaphoreInfos(address(), value); return this; }
    /** Sets the address of the specified {@link VkCommandBufferSubmitInfo.Buffer} to the {@code pCommandBufferInfos} field. */
    @Override
    public VkSubmitInfo2KHR pCommandBufferInfos(@NativeType("VkCommandBufferSubmitInfo const *") VkCommandBufferSubmitInfo.@Nullable Buffer value) { npCommandBufferInfos(address(), value); return this; }
    /** Sets the address of the specified {@link VkSemaphoreSubmitInfo.Buffer} to the {@code pSignalSemaphoreInfos} field. */
    @Override
    public VkSubmitInfo2KHR pSignalSemaphoreInfos(@NativeType("VkSemaphoreSubmitInfo const *") VkSemaphoreSubmitInfo.@Nullable Buffer value) { npSignalSemaphoreInfos(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkSubmitInfo2KHR set(
        int sType,
        long pNext,
        int flags,
        VkSemaphoreSubmitInfo.@Nullable Buffer pWaitSemaphoreInfos,
        VkCommandBufferSubmitInfo.@Nullable Buffer pCommandBufferInfos,
        VkSemaphoreSubmitInfo.@Nullable Buffer pSignalSemaphoreInfos
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pWaitSemaphoreInfos(pWaitSemaphoreInfos);
        pCommandBufferInfos(pCommandBufferInfos);
        pSignalSemaphoreInfos(pSignalSemaphoreInfos);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSubmitInfo2KHR set(VkSubmitInfo2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSubmitInfo2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSubmitInfo2KHR malloc() {
        return new VkSubmitInfo2KHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSubmitInfo2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSubmitInfo2KHR calloc() {
        return new VkSubmitInfo2KHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSubmitInfo2KHR} instance allocated with {@link BufferUtils}. */
    public static VkSubmitInfo2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubmitInfo2KHR(memAddress(container), container);
    }

    /** Returns a new {@code VkSubmitInfo2KHR} instance for the specified memory address. */
    public static VkSubmitInfo2KHR create(long address) {
        return new VkSubmitInfo2KHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSubmitInfo2KHR createSafe(long address) {
        return address == NULL ? null : new VkSubmitInfo2KHR(address, null);
    }

    /**
     * Returns a new {@link VkSubmitInfo2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubmitInfo2KHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSubmitInfo2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubmitInfo2KHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubmitInfo2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubmitInfo2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSubmitInfo2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSubmitInfo2KHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSubmitInfo2KHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSubmitInfo2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubmitInfo2KHR malloc(MemoryStack stack) {
        return new VkSubmitInfo2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSubmitInfo2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubmitInfo2KHR calloc(MemoryStack stack) {
        return new VkSubmitInfo2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSubmitInfo2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubmitInfo2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubmitInfo2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubmitInfo2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkSubmitInfo2KHR} structs. */
    public static class Buffer extends VkSubmitInfo2.Buffer {

        private static final VkSubmitInfo2KHR ELEMENT_FACTORY = VkSubmitInfo2KHR.create(-1L);

        /**
         * Creates a new {@code VkSubmitInfo2KHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSubmitInfo2KHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSubmitInfo2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkSubmitInfo2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkSubmitInfo2KHR.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_SUBMIT_INFO_2 STRUCTURE_TYPE_SUBMIT_INFO_2} value to the {@code sType} field. */
        @Override
        public VkSubmitInfo2KHR.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_SUBMIT_INFO_2); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkSubmitInfo2KHR.Buffer pNext(@NativeType("void const *") long value) { VkSubmitInfo2KHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        @Override
        public VkSubmitInfo2KHR.Buffer flags(@NativeType("VkSubmitFlags") int value) { VkSubmitInfo2KHR.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link VkSemaphoreSubmitInfo.Buffer} to the {@code pWaitSemaphoreInfos} field. */
        @Override
        public VkSubmitInfo2KHR.Buffer pWaitSemaphoreInfos(@NativeType("VkSemaphoreSubmitInfo const *") VkSemaphoreSubmitInfo.@Nullable Buffer value) { VkSubmitInfo2KHR.npWaitSemaphoreInfos(address(), value); return this; }
        /** Sets the address of the specified {@link VkCommandBufferSubmitInfo.Buffer} to the {@code pCommandBufferInfos} field. */
        @Override
        public VkSubmitInfo2KHR.Buffer pCommandBufferInfos(@NativeType("VkCommandBufferSubmitInfo const *") VkCommandBufferSubmitInfo.@Nullable Buffer value) { VkSubmitInfo2KHR.npCommandBufferInfos(address(), value); return this; }
        /** Sets the address of the specified {@link VkSemaphoreSubmitInfo.Buffer} to the {@code pSignalSemaphoreInfos} field. */
        @Override
        public VkSubmitInfo2KHR.Buffer pSignalSemaphoreInfos(@NativeType("VkSemaphoreSubmitInfo const *") VkSemaphoreSubmitInfo.@Nullable Buffer value) { VkSubmitInfo2KHR.npSignalSemaphoreInfos(address(), value); return this; }

    }

}