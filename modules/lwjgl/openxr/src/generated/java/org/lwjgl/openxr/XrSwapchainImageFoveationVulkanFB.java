/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.vulkan.*;

/**
 * <pre>{@code
 * struct XrSwapchainImageFoveationVulkanFB {
 *     XrStructureType type;
 *     void * next;
 *     VkImage image;
 *     uint32_t width;
 *     uint32_t height;
 * }}</pre>
 */
public class XrSwapchainImageFoveationVulkanFB extends Struct<XrSwapchainImageFoveationVulkanFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        IMAGE,
        WIDTH,
        HEIGHT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        IMAGE = layout.offsetof(2);
        WIDTH = layout.offsetof(3);
        HEIGHT = layout.offsetof(4);
    }

    protected XrSwapchainImageFoveationVulkanFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSwapchainImageFoveationVulkanFB create(long address, @Nullable ByteBuffer container) {
        return new XrSwapchainImageFoveationVulkanFB(address, container);
    }

    /**
     * Creates a {@code XrSwapchainImageFoveationVulkanFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSwapchainImageFoveationVulkanFB(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code image} field. */
    @NativeType("VkImage")
    public long image() { return nimage(address()); }
    /** @return the value of the {@code width} field. */
    @NativeType("uint32_t")
    public int width() { return nwidth(address()); }
    /** @return the value of the {@code height} field. */
    @NativeType("uint32_t")
    public int height() { return nheight(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSwapchainImageFoveationVulkanFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBFoveationVulkan#XR_TYPE_SWAPCHAIN_IMAGE_FOVEATION_VULKAN_FB TYPE_SWAPCHAIN_IMAGE_FOVEATION_VULKAN_FB} value to the {@code type} field. */
    public XrSwapchainImageFoveationVulkanFB type$Default() { return type(FBFoveationVulkan.XR_TYPE_SWAPCHAIN_IMAGE_FOVEATION_VULKAN_FB); }
    /** Sets the specified value to the {@code next} field. */
    public XrSwapchainImageFoveationVulkanFB next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSwapchainImageFoveationVulkanFB set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSwapchainImageFoveationVulkanFB set(XrSwapchainImageFoveationVulkanFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSwapchainImageFoveationVulkanFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSwapchainImageFoveationVulkanFB malloc() {
        return new XrSwapchainImageFoveationVulkanFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSwapchainImageFoveationVulkanFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSwapchainImageFoveationVulkanFB calloc() {
        return new XrSwapchainImageFoveationVulkanFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSwapchainImageFoveationVulkanFB} instance allocated with {@link BufferUtils}. */
    public static XrSwapchainImageFoveationVulkanFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSwapchainImageFoveationVulkanFB(memAddress(container), container);
    }

    /** Returns a new {@code XrSwapchainImageFoveationVulkanFB} instance for the specified memory address. */
    public static XrSwapchainImageFoveationVulkanFB create(long address) {
        return new XrSwapchainImageFoveationVulkanFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSwapchainImageFoveationVulkanFB createSafe(long address) {
        return address == NULL ? null : new XrSwapchainImageFoveationVulkanFB(address, null);
    }

    /**
     * Returns a new {@link XrSwapchainImageFoveationVulkanFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageFoveationVulkanFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainImageFoveationVulkanFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageFoveationVulkanFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainImageFoveationVulkanFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageFoveationVulkanFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSwapchainImageFoveationVulkanFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageFoveationVulkanFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSwapchainImageFoveationVulkanFB.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSwapchainImageFoveationVulkanFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSwapchainImageFoveationVulkanFB malloc(MemoryStack stack) {
        return new XrSwapchainImageFoveationVulkanFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSwapchainImageFoveationVulkanFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSwapchainImageFoveationVulkanFB calloc(MemoryStack stack) {
        return new XrSwapchainImageFoveationVulkanFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSwapchainImageFoveationVulkanFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageFoveationVulkanFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainImageFoveationVulkanFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageFoveationVulkanFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSwapchainImageFoveationVulkanFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSwapchainImageFoveationVulkanFB.NEXT); }
    /** Unsafe version of {@link #image}. */
    public static long nimage(long struct) { return memGetLong(struct + XrSwapchainImageFoveationVulkanFB.IMAGE); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return memGetInt(struct + XrSwapchainImageFoveationVulkanFB.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return memGetInt(struct + XrSwapchainImageFoveationVulkanFB.HEIGHT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSwapchainImageFoveationVulkanFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSwapchainImageFoveationVulkanFB.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSwapchainImageFoveationVulkanFB} structs. */
    public static class Buffer extends StructBuffer<XrSwapchainImageFoveationVulkanFB, Buffer> implements NativeResource {

        private static final XrSwapchainImageFoveationVulkanFB ELEMENT_FACTORY = XrSwapchainImageFoveationVulkanFB.create(-1L);

        /**
         * Creates a new {@code XrSwapchainImageFoveationVulkanFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSwapchainImageFoveationVulkanFB#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
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
        protected XrSwapchainImageFoveationVulkanFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSwapchainImageFoveationVulkanFB.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSwapchainImageFoveationVulkanFB.nnext(address()); }
        /** @return the value of the {@code image} field. */
        @NativeType("VkImage")
        public long image() { return XrSwapchainImageFoveationVulkanFB.nimage(address()); }
        /** @return the value of the {@code width} field. */
        @NativeType("uint32_t")
        public int width() { return XrSwapchainImageFoveationVulkanFB.nwidth(address()); }
        /** @return the value of the {@code height} field. */
        @NativeType("uint32_t")
        public int height() { return XrSwapchainImageFoveationVulkanFB.nheight(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSwapchainImageFoveationVulkanFB.Buffer type(@NativeType("XrStructureType") int value) { XrSwapchainImageFoveationVulkanFB.ntype(address(), value); return this; }
        /** Sets the {@link FBFoveationVulkan#XR_TYPE_SWAPCHAIN_IMAGE_FOVEATION_VULKAN_FB TYPE_SWAPCHAIN_IMAGE_FOVEATION_VULKAN_FB} value to the {@code type} field. */
        public XrSwapchainImageFoveationVulkanFB.Buffer type$Default() { return type(FBFoveationVulkan.XR_TYPE_SWAPCHAIN_IMAGE_FOVEATION_VULKAN_FB); }
        /** Sets the specified value to the {@code next} field. */
        public XrSwapchainImageFoveationVulkanFB.Buffer next(@NativeType("void *") long value) { XrSwapchainImageFoveationVulkanFB.nnext(address(), value); return this; }

    }

}