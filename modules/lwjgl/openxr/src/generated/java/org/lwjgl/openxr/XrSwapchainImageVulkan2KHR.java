/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.vulkan.*;

/**
 * See {@link XrSwapchainImageVulkanKHR}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSwapchainImageVulkan2KHR {
 *     XrStructureType type;
 *     void * next;
 *     VkImage image;
 * }</code></pre>
 */
public class XrSwapchainImageVulkan2KHR extends XrSwapchainImageVulkanKHR {

    /**
     * Creates a {@code XrSwapchainImageVulkan2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSwapchainImageVulkan2KHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code type} field. */
    @Override
    public XrSwapchainImageVulkan2KHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link KHRVulkanEnable#XR_TYPE_SWAPCHAIN_IMAGE_VULKAN_KHR TYPE_SWAPCHAIN_IMAGE_VULKAN_KHR} value to the {@code type} field. */
    @Override
    public XrSwapchainImageVulkan2KHR type$Default() { return type(KHRVulkanEnable.XR_TYPE_SWAPCHAIN_IMAGE_VULKAN_KHR); }
    /** Sets the specified value to the {@code next} field. */
    @Override
    public XrSwapchainImageVulkan2KHR next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code image} field. */
    @Override
    public XrSwapchainImageVulkan2KHR image(@NativeType("VkImage") long value) { nimage(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public XrSwapchainImageVulkan2KHR set(
        int type,
        long next,
        long image
    ) {
        type(type);
        next(next);
        image(image);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSwapchainImageVulkan2KHR set(XrSwapchainImageVulkan2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSwapchainImageVulkan2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSwapchainImageVulkan2KHR malloc() {
        return wrap(XrSwapchainImageVulkan2KHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSwapchainImageVulkan2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSwapchainImageVulkan2KHR calloc() {
        return wrap(XrSwapchainImageVulkan2KHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSwapchainImageVulkan2KHR} instance allocated with {@link BufferUtils}. */
    public static XrSwapchainImageVulkan2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSwapchainImageVulkan2KHR.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSwapchainImageVulkan2KHR} instance for the specified memory address. */
    public static XrSwapchainImageVulkan2KHR create(long address) {
        return wrap(XrSwapchainImageVulkan2KHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSwapchainImageVulkan2KHR createSafe(long address) {
        return address == NULL ? null : wrap(XrSwapchainImageVulkan2KHR.class, address);
    }

    /**
     * Returns a new {@link XrSwapchainImageVulkan2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageVulkan2KHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainImageVulkan2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageVulkan2KHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainImageVulkan2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageVulkan2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSwapchainImageVulkan2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageVulkan2KHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSwapchainImageVulkan2KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSwapchainImageVulkan2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSwapchainImageVulkan2KHR malloc(MemoryStack stack) {
        return wrap(XrSwapchainImageVulkan2KHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSwapchainImageVulkan2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSwapchainImageVulkan2KHR calloc(MemoryStack stack) {
        return wrap(XrSwapchainImageVulkan2KHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSwapchainImageVulkan2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageVulkan2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainImageVulkan2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageVulkan2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link XrSwapchainImageVulkan2KHR} structs. */
    public static class Buffer extends XrSwapchainImageVulkanKHR.Buffer {

        private static final XrSwapchainImageVulkan2KHR ELEMENT_FACTORY = XrSwapchainImageVulkan2KHR.create(-1L);

        /**
         * Creates a new {@code XrSwapchainImageVulkan2KHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSwapchainImageVulkan2KHR#SIZEOF}, and its mark will be undefined.
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
        protected XrSwapchainImageVulkan2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code type} field. */
        @Override
        public XrSwapchainImageVulkan2KHR.Buffer type(@NativeType("XrStructureType") int value) { XrSwapchainImageVulkan2KHR.ntype(address(), value); return this; }
        /** Sets the {@link KHRVulkanEnable#XR_TYPE_SWAPCHAIN_IMAGE_VULKAN_KHR TYPE_SWAPCHAIN_IMAGE_VULKAN_KHR} value to the {@code type} field. */
        @Override
        public XrSwapchainImageVulkan2KHR.Buffer type$Default() { return type(KHRVulkanEnable.XR_TYPE_SWAPCHAIN_IMAGE_VULKAN_KHR); }
        /** Sets the specified value to the {@code next} field. */
        @Override
        public XrSwapchainImageVulkan2KHR.Buffer next(@NativeType("void *") long value) { XrSwapchainImageVulkan2KHR.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code image} field. */
        @Override
        public XrSwapchainImageVulkan2KHR.Buffer image(@NativeType("VkImage") long value) { XrSwapchainImageVulkan2KHR.nimage(address(), value); return this; }

    }

}