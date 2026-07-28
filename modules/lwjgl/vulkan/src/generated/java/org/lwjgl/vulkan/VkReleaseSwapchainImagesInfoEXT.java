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
 * struct VkReleaseSwapchainImagesInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkSwapchainKHR swapchain;
 *     uint32_t imageIndexCount;
 *     uint32_t const * pImageIndices;
 * }}</pre>
 */
public class VkReleaseSwapchainImagesInfoEXT extends VkReleaseSwapchainImagesInfoKHR {

    protected VkReleaseSwapchainImagesInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkReleaseSwapchainImagesInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkReleaseSwapchainImagesInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkReleaseSwapchainImagesInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkReleaseSwapchainImagesInfoEXT(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkReleaseSwapchainImagesInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRSwapchainMaintenance1#VK_STRUCTURE_TYPE_RELEASE_SWAPCHAIN_IMAGES_INFO_KHR STRUCTURE_TYPE_RELEASE_SWAPCHAIN_IMAGES_INFO_KHR} value to the {@code sType} field. */
    @Override
    public VkReleaseSwapchainImagesInfoEXT sType$Default() { return sType(KHRSwapchainMaintenance1.VK_STRUCTURE_TYPE_RELEASE_SWAPCHAIN_IMAGES_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkReleaseSwapchainImagesInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code swapchain} field. */
    @Override
    public VkReleaseSwapchainImagesInfoEXT swapchain(@NativeType("VkSwapchainKHR") long value) { nswapchain(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pImageIndices} field. */
    @Override
    public VkReleaseSwapchainImagesInfoEXT pImageIndices(@NativeType("uint32_t const *") IntBuffer value) { npImageIndices(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkReleaseSwapchainImagesInfoEXT set(
        int sType,
        long pNext,
        long swapchain,
        IntBuffer pImageIndices
    ) {
        sType(sType);
        pNext(pNext);
        swapchain(swapchain);
        pImageIndices(pImageIndices);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkReleaseSwapchainImagesInfoEXT set(VkReleaseSwapchainImagesInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkReleaseSwapchainImagesInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkReleaseSwapchainImagesInfoEXT malloc() {
        return new VkReleaseSwapchainImagesInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkReleaseSwapchainImagesInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkReleaseSwapchainImagesInfoEXT calloc() {
        return new VkReleaseSwapchainImagesInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkReleaseSwapchainImagesInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkReleaseSwapchainImagesInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkReleaseSwapchainImagesInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkReleaseSwapchainImagesInfoEXT} instance for the specified memory address. */
    public static VkReleaseSwapchainImagesInfoEXT create(long address) {
        return new VkReleaseSwapchainImagesInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkReleaseSwapchainImagesInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkReleaseSwapchainImagesInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkReleaseSwapchainImagesInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkReleaseSwapchainImagesInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkReleaseSwapchainImagesInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkReleaseSwapchainImagesInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkReleaseSwapchainImagesInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkReleaseSwapchainImagesInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkReleaseSwapchainImagesInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkReleaseSwapchainImagesInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkReleaseSwapchainImagesInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkReleaseSwapchainImagesInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkReleaseSwapchainImagesInfoEXT malloc(MemoryStack stack) {
        return new VkReleaseSwapchainImagesInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkReleaseSwapchainImagesInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkReleaseSwapchainImagesInfoEXT calloc(MemoryStack stack) {
        return new VkReleaseSwapchainImagesInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkReleaseSwapchainImagesInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkReleaseSwapchainImagesInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkReleaseSwapchainImagesInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkReleaseSwapchainImagesInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkReleaseSwapchainImagesInfoEXT} structs. */
    public static class Buffer extends VkReleaseSwapchainImagesInfoKHR.Buffer {

        private static final VkReleaseSwapchainImagesInfoEXT ELEMENT_FACTORY = VkReleaseSwapchainImagesInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkReleaseSwapchainImagesInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkReleaseSwapchainImagesInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkReleaseSwapchainImagesInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkReleaseSwapchainImagesInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkReleaseSwapchainImagesInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link KHRSwapchainMaintenance1#VK_STRUCTURE_TYPE_RELEASE_SWAPCHAIN_IMAGES_INFO_KHR STRUCTURE_TYPE_RELEASE_SWAPCHAIN_IMAGES_INFO_KHR} value to the {@code sType} field. */
        @Override
        public VkReleaseSwapchainImagesInfoEXT.Buffer sType$Default() { return sType(KHRSwapchainMaintenance1.VK_STRUCTURE_TYPE_RELEASE_SWAPCHAIN_IMAGES_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkReleaseSwapchainImagesInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkReleaseSwapchainImagesInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code swapchain} field. */
        @Override
        public VkReleaseSwapchainImagesInfoEXT.Buffer swapchain(@NativeType("VkSwapchainKHR") long value) { VkReleaseSwapchainImagesInfoEXT.nswapchain(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pImageIndices} field. */
        @Override
        public VkReleaseSwapchainImagesInfoEXT.Buffer pImageIndices(@NativeType("uint32_t const *") IntBuffer value) { VkReleaseSwapchainImagesInfoEXT.npImageIndices(address(), value); return this; }

    }

}