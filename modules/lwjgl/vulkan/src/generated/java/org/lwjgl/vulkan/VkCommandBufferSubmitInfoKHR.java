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
 * See {@link VkCommandBufferSubmitInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCommandBufferSubmitInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkCommandBuffer commandBuffer;
 *     uint32_t deviceMask;
 * }</code></pre>
 */
public class VkCommandBufferSubmitInfoKHR extends VkCommandBufferSubmitInfo {

    /**
     * Creates a {@code VkCommandBufferSubmitInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCommandBufferSubmitInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkCommandBufferSubmitInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO} value to the {@code sType} field. */
    @Override
    public VkCommandBufferSubmitInfoKHR sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkCommandBufferSubmitInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code commandBuffer} field. */
    @Override
    public VkCommandBufferSubmitInfoKHR commandBuffer(VkCommandBuffer value) { ncommandBuffer(address(), value); return this; }
    /** Sets the specified value to the {@code deviceMask} field. */
    @Override
    public VkCommandBufferSubmitInfoKHR deviceMask(@NativeType("uint32_t") int value) { ndeviceMask(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkCommandBufferSubmitInfoKHR set(
        int sType,
        long pNext,
        VkCommandBuffer commandBuffer,
        int deviceMask
    ) {
        sType(sType);
        pNext(pNext);
        commandBuffer(commandBuffer);
        deviceMask(deviceMask);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCommandBufferSubmitInfoKHR set(VkCommandBufferSubmitInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCommandBufferSubmitInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCommandBufferSubmitInfoKHR malloc() {
        return wrap(VkCommandBufferSubmitInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkCommandBufferSubmitInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCommandBufferSubmitInfoKHR calloc() {
        return wrap(VkCommandBufferSubmitInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkCommandBufferSubmitInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkCommandBufferSubmitInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkCommandBufferSubmitInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkCommandBufferSubmitInfoKHR} instance for the specified memory address. */
    public static VkCommandBufferSubmitInfoKHR create(long address) {
        return wrap(VkCommandBufferSubmitInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCommandBufferSubmitInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkCommandBufferSubmitInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkCommandBufferSubmitInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferSubmitInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferSubmitInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferSubmitInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferSubmitInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferSubmitInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkCommandBufferSubmitInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferSubmitInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCommandBufferSubmitInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkCommandBufferSubmitInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCommandBufferSubmitInfoKHR malloc(MemoryStack stack) {
        return wrap(VkCommandBufferSubmitInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkCommandBufferSubmitInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCommandBufferSubmitInfoKHR calloc(MemoryStack stack) {
        return wrap(VkCommandBufferSubmitInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkCommandBufferSubmitInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferSubmitInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferSubmitInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferSubmitInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkCommandBufferSubmitInfoKHR} structs. */
    public static class Buffer extends VkCommandBufferSubmitInfo.Buffer {

        private static final VkCommandBufferSubmitInfoKHR ELEMENT_FACTORY = VkCommandBufferSubmitInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkCommandBufferSubmitInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCommandBufferSubmitInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkCommandBufferSubmitInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkCommandBufferSubmitInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkCommandBufferSubmitInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO} value to the {@code sType} field. */
        @Override
        public VkCommandBufferSubmitInfoKHR.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkCommandBufferSubmitInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkCommandBufferSubmitInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code commandBuffer} field. */
        @Override
        public VkCommandBufferSubmitInfoKHR.Buffer commandBuffer(VkCommandBuffer value) { VkCommandBufferSubmitInfoKHR.ncommandBuffer(address(), value); return this; }
        /** Sets the specified value to the {@code deviceMask} field. */
        @Override
        public VkCommandBufferSubmitInfoKHR.Buffer deviceMask(@NativeType("uint32_t") int value) { VkCommandBufferSubmitInfoKHR.ndeviceMask(address(), value); return this; }

    }

}