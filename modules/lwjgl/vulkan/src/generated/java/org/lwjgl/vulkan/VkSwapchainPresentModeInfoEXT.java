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
 * <pre>{@code
 * struct VkSwapchainPresentModeInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t swapchainCount;
 *     VkPresentModeKHR const * pPresentModes;
 * }}</pre>
 */
public class VkSwapchainPresentModeInfoEXT extends VkSwapchainPresentModeInfoKHR {

    protected VkSwapchainPresentModeInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSwapchainPresentModeInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkSwapchainPresentModeInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkSwapchainPresentModeInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSwapchainPresentModeInfoEXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkSwapchainPresentModeInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRSwapchainMaintenance1#VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODE_INFO_KHR STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODE_INFO_KHR} value to the {@code sType} field. */
    @Override
    public VkSwapchainPresentModeInfoEXT sType$Default() { return sType(KHRSwapchainMaintenance1.VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODE_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkSwapchainPresentModeInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pPresentModes} field. */
    @Override
    public VkSwapchainPresentModeInfoEXT pPresentModes(@NativeType("VkPresentModeKHR const *") IntBuffer value) { npPresentModes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkSwapchainPresentModeInfoEXT set(
        int sType,
        long pNext,
        IntBuffer pPresentModes
    ) {
        sType(sType);
        pNext(pNext);
        pPresentModes(pPresentModes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSwapchainPresentModeInfoEXT set(VkSwapchainPresentModeInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSwapchainPresentModeInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSwapchainPresentModeInfoEXT malloc() {
        return new VkSwapchainPresentModeInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSwapchainPresentModeInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSwapchainPresentModeInfoEXT calloc() {
        return new VkSwapchainPresentModeInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSwapchainPresentModeInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkSwapchainPresentModeInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSwapchainPresentModeInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkSwapchainPresentModeInfoEXT} instance for the specified memory address. */
    public static VkSwapchainPresentModeInfoEXT create(long address) {
        return new VkSwapchainPresentModeInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSwapchainPresentModeInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkSwapchainPresentModeInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkSwapchainPresentModeInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentModeInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainPresentModeInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentModeInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainPresentModeInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentModeInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSwapchainPresentModeInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentModeInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSwapchainPresentModeInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSwapchainPresentModeInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSwapchainPresentModeInfoEXT malloc(MemoryStack stack) {
        return new VkSwapchainPresentModeInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSwapchainPresentModeInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSwapchainPresentModeInfoEXT calloc(MemoryStack stack) {
        return new VkSwapchainPresentModeInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSwapchainPresentModeInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentModeInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainPresentModeInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentModeInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkSwapchainPresentModeInfoEXT} structs. */
    public static class Buffer extends VkSwapchainPresentModeInfoKHR.Buffer {

        private static final VkSwapchainPresentModeInfoEXT ELEMENT_FACTORY = VkSwapchainPresentModeInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkSwapchainPresentModeInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSwapchainPresentModeInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSwapchainPresentModeInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkSwapchainPresentModeInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkSwapchainPresentModeInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link KHRSwapchainMaintenance1#VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODE_INFO_KHR STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODE_INFO_KHR} value to the {@code sType} field. */
        @Override
        public VkSwapchainPresentModeInfoEXT.Buffer sType$Default() { return sType(KHRSwapchainMaintenance1.VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODE_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkSwapchainPresentModeInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkSwapchainPresentModeInfoEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pPresentModes} field. */
        @Override
        public VkSwapchainPresentModeInfoEXT.Buffer pPresentModes(@NativeType("VkPresentModeKHR const *") IntBuffer value) { VkSwapchainPresentModeInfoEXT.npPresentModes(address(), value); return this; }

    }

}