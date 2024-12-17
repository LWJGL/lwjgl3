/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.ktx;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct ktxVulkanTexture {
 *     PFN_vkDestroyImage vkDestroyImage;
 *     PFN_vkFreeMemory vkFreeMemory;
 *     VkImage image;
 *     VkFormat imageFormat;
 *     VkImageLayout imageLayout;
 *     VkDeviceMemory deviceMemory;
 *     VkImageViewType viewType;
 *     uint32_t width;
 *     uint32_t height;
 *     uint32_t depth;
 *     uint32_t levelCount;
 *     uint32_t layerCount;
 *     uint64_t allocationId;
 * }}</pre>
 */
public class ktxVulkanTexture extends Struct<ktxVulkanTexture> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VKDESTROYIMAGE,
        VKFREEMEMORY,
        IMAGE,
        IMAGEFORMAT,
        IMAGELAYOUT,
        DEVICEMEMORY,
        VIEWTYPE,
        WIDTH,
        HEIGHT,
        DEPTH,
        LEVELCOUNT,
        LAYERCOUNT,
        ALLOCATIONID;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VKDESTROYIMAGE = layout.offsetof(0);
        VKFREEMEMORY = layout.offsetof(1);
        IMAGE = layout.offsetof(2);
        IMAGEFORMAT = layout.offsetof(3);
        IMAGELAYOUT = layout.offsetof(4);
        DEVICEMEMORY = layout.offsetof(5);
        VIEWTYPE = layout.offsetof(6);
        WIDTH = layout.offsetof(7);
        HEIGHT = layout.offsetof(8);
        DEPTH = layout.offsetof(9);
        LEVELCOUNT = layout.offsetof(10);
        LAYERCOUNT = layout.offsetof(11);
        ALLOCATIONID = layout.offsetof(12);
    }

    protected ktxVulkanTexture(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ktxVulkanTexture create(long address, @Nullable ByteBuffer container) {
        return new ktxVulkanTexture(address, container);
    }

    /**
     * Creates a {@code ktxVulkanTexture} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ktxVulkanTexture(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code vkDestroyImage} field. */
    @NativeType("PFN_vkDestroyImage")
    public long vkDestroyImage() { return nvkDestroyImage(address()); }
    /** @return the value of the {@code vkFreeMemory} field. */
    @NativeType("PFN_vkFreeMemory")
    public long vkFreeMemory() { return nvkFreeMemory(address()); }
    /** @return the value of the {@code image} field. */
    @NativeType("VkImage")
    public long image() { return nimage(address()); }
    /** @return the value of the {@code imageFormat} field. */
    @NativeType("VkFormat")
    public int imageFormat() { return nimageFormat(address()); }
    /** @return the value of the {@code imageLayout} field. */
    @NativeType("VkImageLayout")
    public int imageLayout() { return nimageLayout(address()); }
    /** @return the value of the {@code deviceMemory} field. */
    @NativeType("VkDeviceMemory")
    public long deviceMemory() { return ndeviceMemory(address()); }
    /** @return the value of the {@code viewType} field. */
    @NativeType("VkImageViewType")
    public int viewType() { return nviewType(address()); }
    /** @return the value of the {@code width} field. */
    @NativeType("uint32_t")
    public int width() { return nwidth(address()); }
    /** @return the value of the {@code height} field. */
    @NativeType("uint32_t")
    public int height() { return nheight(address()); }
    /** @return the value of the {@code depth} field. */
    @NativeType("uint32_t")
    public int depth() { return ndepth(address()); }
    /** @return the value of the {@code levelCount} field. */
    @NativeType("uint32_t")
    public int levelCount() { return nlevelCount(address()); }
    /** @return the value of the {@code layerCount} field. */
    @NativeType("uint32_t")
    public int layerCount() { return nlayerCount(address()); }
    /** @return the value of the {@code allocationId} field. */
    @NativeType("uint64_t")
    public long allocationId() { return nallocationId(address()); }

    // -----------------------------------

    /** Returns a new {@code ktxVulkanTexture} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ktxVulkanTexture malloc() {
        return new ktxVulkanTexture(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ktxVulkanTexture} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ktxVulkanTexture calloc() {
        return new ktxVulkanTexture(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ktxVulkanTexture} instance allocated with {@link BufferUtils}. */
    public static ktxVulkanTexture create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ktxVulkanTexture(memAddress(container), container);
    }

    /** Returns a new {@code ktxVulkanTexture} instance for the specified memory address. */
    public static ktxVulkanTexture create(long address) {
        return new ktxVulkanTexture(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ktxVulkanTexture createSafe(long address) {
        return address == NULL ? null : new ktxVulkanTexture(address, null);
    }

    /**
     * Returns a new {@link ktxVulkanTexture.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ktxVulkanTexture.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ktxVulkanTexture.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ktxVulkanTexture.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ktxVulkanTexture.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ktxVulkanTexture.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ktxVulkanTexture.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ktxVulkanTexture.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ktxVulkanTexture.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ktxVulkanTexture} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ktxVulkanTexture malloc(MemoryStack stack) {
        return new ktxVulkanTexture(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ktxVulkanTexture} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ktxVulkanTexture calloc(MemoryStack stack) {
        return new ktxVulkanTexture(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ktxVulkanTexture.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ktxVulkanTexture.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ktxVulkanTexture.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ktxVulkanTexture.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #vkDestroyImage}. */
    public static long nvkDestroyImage(long struct) { return memGetAddress(struct + ktxVulkanTexture.VKDESTROYIMAGE); }
    /** Unsafe version of {@link #vkFreeMemory}. */
    public static long nvkFreeMemory(long struct) { return memGetAddress(struct + ktxVulkanTexture.VKFREEMEMORY); }
    /** Unsafe version of {@link #image}. */
    public static long nimage(long struct) { return memGetLong(struct + ktxVulkanTexture.IMAGE); }
    /** Unsafe version of {@link #imageFormat}. */
    public static int nimageFormat(long struct) { return memGetInt(struct + ktxVulkanTexture.IMAGEFORMAT); }
    /** Unsafe version of {@link #imageLayout}. */
    public static int nimageLayout(long struct) { return memGetInt(struct + ktxVulkanTexture.IMAGELAYOUT); }
    /** Unsafe version of {@link #deviceMemory}. */
    public static long ndeviceMemory(long struct) { return memGetLong(struct + ktxVulkanTexture.DEVICEMEMORY); }
    /** Unsafe version of {@link #viewType}. */
    public static int nviewType(long struct) { return memGetInt(struct + ktxVulkanTexture.VIEWTYPE); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return memGetInt(struct + ktxVulkanTexture.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return memGetInt(struct + ktxVulkanTexture.HEIGHT); }
    /** Unsafe version of {@link #depth}. */
    public static int ndepth(long struct) { return memGetInt(struct + ktxVulkanTexture.DEPTH); }
    /** Unsafe version of {@link #levelCount}. */
    public static int nlevelCount(long struct) { return memGetInt(struct + ktxVulkanTexture.LEVELCOUNT); }
    /** Unsafe version of {@link #layerCount}. */
    public static int nlayerCount(long struct) { return memGetInt(struct + ktxVulkanTexture.LAYERCOUNT); }
    /** Unsafe version of {@link #allocationId}. */
    public static long nallocationId(long struct) { return memGetLong(struct + ktxVulkanTexture.ALLOCATIONID); }

    // -----------------------------------

    /** An array of {@link ktxVulkanTexture} structs. */
    public static class Buffer extends StructBuffer<ktxVulkanTexture, Buffer> implements NativeResource {

        private static final ktxVulkanTexture ELEMENT_FACTORY = ktxVulkanTexture.create(-1L);

        /**
         * Creates a new {@code ktxVulkanTexture.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ktxVulkanTexture#SIZEOF}, and its mark will be undefined.</p>
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
        protected ktxVulkanTexture getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code vkDestroyImage} field. */
        @NativeType("PFN_vkDestroyImage")
        public long vkDestroyImage() { return ktxVulkanTexture.nvkDestroyImage(address()); }
        /** @return the value of the {@code vkFreeMemory} field. */
        @NativeType("PFN_vkFreeMemory")
        public long vkFreeMemory() { return ktxVulkanTexture.nvkFreeMemory(address()); }
        /** @return the value of the {@code image} field. */
        @NativeType("VkImage")
        public long image() { return ktxVulkanTexture.nimage(address()); }
        /** @return the value of the {@code imageFormat} field. */
        @NativeType("VkFormat")
        public int imageFormat() { return ktxVulkanTexture.nimageFormat(address()); }
        /** @return the value of the {@code imageLayout} field. */
        @NativeType("VkImageLayout")
        public int imageLayout() { return ktxVulkanTexture.nimageLayout(address()); }
        /** @return the value of the {@code deviceMemory} field. */
        @NativeType("VkDeviceMemory")
        public long deviceMemory() { return ktxVulkanTexture.ndeviceMemory(address()); }
        /** @return the value of the {@code viewType} field. */
        @NativeType("VkImageViewType")
        public int viewType() { return ktxVulkanTexture.nviewType(address()); }
        /** @return the value of the {@code width} field. */
        @NativeType("uint32_t")
        public int width() { return ktxVulkanTexture.nwidth(address()); }
        /** @return the value of the {@code height} field. */
        @NativeType("uint32_t")
        public int height() { return ktxVulkanTexture.nheight(address()); }
        /** @return the value of the {@code depth} field. */
        @NativeType("uint32_t")
        public int depth() { return ktxVulkanTexture.ndepth(address()); }
        /** @return the value of the {@code levelCount} field. */
        @NativeType("uint32_t")
        public int levelCount() { return ktxVulkanTexture.nlevelCount(address()); }
        /** @return the value of the {@code layerCount} field. */
        @NativeType("uint32_t")
        public int layerCount() { return ktxVulkanTexture.nlayerCount(address()); }
        /** @return the value of the {@code allocationId} field. */
        @NativeType("uint64_t")
        public long allocationId() { return ktxVulkanTexture.nallocationId(address()); }

    }

}