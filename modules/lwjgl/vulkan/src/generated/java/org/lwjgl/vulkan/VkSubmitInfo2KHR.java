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
    public VkSubmitInfo2KHR pWaitSemaphoreInfos(@Nullable @NativeType("VkSemaphoreSubmitInfo const *") VkSemaphoreSubmitInfo.Buffer value) { npWaitSemaphoreInfos(address(), value); return this; }
    /** Sets the address of the specified {@link VkCommandBufferSubmitInfo.Buffer} to the {@code pCommandBufferInfos} field. */
    @Override
    public VkSubmitInfo2KHR pCommandBufferInfos(@Nullable @NativeType("VkCommandBufferSubmitInfo const *") VkCommandBufferSubmitInfo.Buffer value) { npCommandBufferInfos(address(), value); return this; }
    /** Sets the address of the specified {@link VkSemaphoreSubmitInfo.Buffer} to the {@code pSignalSemaphoreInfos} field. */
    @Override
    public VkSubmitInfo2KHR pSignalSemaphoreInfos(@Nullable @NativeType("VkSemaphoreSubmitInfo const *") VkSemaphoreSubmitInfo.Buffer value) { npSignalSemaphoreInfos(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkSubmitInfo2KHR set(
        int sType,
        long pNext,
        int flags,
        @Nullable VkSemaphoreSubmitInfo.Buffer pWaitSemaphoreInfos,
        @Nullable VkCommandBufferSubmitInfo.Buffer pCommandBufferInfos,
        @Nullable VkSemaphoreSubmitInfo.Buffer pSignalSemaphoreInfos
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
        return wrap(VkSubmitInfo2KHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSubmitInfo2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSubmitInfo2KHR calloc() {
        return wrap(VkSubmitInfo2KHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSubmitInfo2KHR} instance allocated with {@link BufferUtils}. */
    public static VkSubmitInfo2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSubmitInfo2KHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSubmitInfo2KHR} instance for the specified memory address. */
    public static VkSubmitInfo2KHR create(long address) {
        return wrap(VkSubmitInfo2KHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubmitInfo2KHR createSafe(long address) {
        return address == NULL ? null : wrap(VkSubmitInfo2KHR.class, address);
    }

    /**
     * Returns a new {@link VkSubmitInfo2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubmitInfo2KHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSubmitInfo2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubmitInfo2KHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubmitInfo2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubmitInfo2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSubmitInfo2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSubmitInfo2KHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubmitInfo2KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkSubmitInfo2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubmitInfo2KHR malloc(MemoryStack stack) {
        return wrap(VkSubmitInfo2KHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSubmitInfo2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubmitInfo2KHR calloc(MemoryStack stack) {
        return wrap(VkSubmitInfo2KHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSubmitInfo2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubmitInfo2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubmitInfo2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubmitInfo2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkSubmitInfo2KHR} structs. */
    public static class Buffer extends VkSubmitInfo2.Buffer {

        private static final VkSubmitInfo2KHR ELEMENT_FACTORY = VkSubmitInfo2KHR.create(-1L);

        /**
         * Creates a new {@code VkSubmitInfo2KHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSubmitInfo2KHR#SIZEOF}, and its mark will be undefined.
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
        public VkSubmitInfo2KHR.Buffer pWaitSemaphoreInfos(@Nullable @NativeType("VkSemaphoreSubmitInfo const *") VkSemaphoreSubmitInfo.Buffer value) { VkSubmitInfo2KHR.npWaitSemaphoreInfos(address(), value); return this; }
        /** Sets the address of the specified {@link VkCommandBufferSubmitInfo.Buffer} to the {@code pCommandBufferInfos} field. */
        @Override
        public VkSubmitInfo2KHR.Buffer pCommandBufferInfos(@Nullable @NativeType("VkCommandBufferSubmitInfo const *") VkCommandBufferSubmitInfo.Buffer value) { VkSubmitInfo2KHR.npCommandBufferInfos(address(), value); return this; }
        /** Sets the address of the specified {@link VkSemaphoreSubmitInfo.Buffer} to the {@code pSignalSemaphoreInfos} field. */
        @Override
        public VkSubmitInfo2KHR.Buffer pSignalSemaphoreInfos(@Nullable @NativeType("VkSemaphoreSubmitInfo const *") VkSemaphoreSubmitInfo.Buffer value) { VkSubmitInfo2KHR.npSignalSemaphoreInfos(address(), value); return this; }

    }

}