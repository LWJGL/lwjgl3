/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.ktx;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Struct for returning information about the Vulkan texture image created by the {@code ktxTexture_VkUpload*} functions.
 * 
 * <p>Creation of these objects is internal to the upload functions.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ktxVulkanTexture {
 *     PFN_vkDestroyImage {@link #vkDestroyImage};
 *     PFN_vkFreeMemory {@link #vkFreeMemory};
 *     VkImage {@link #image};
 *     VkFormat {@link #imageFormat};
 *     VkImageLayout {@link #imageLayout};
 *     VkDeviceMemory {@link #deviceMemory};
 *     VkImageViewType {@link #viewType};
 *     uint32_t {@link #width};
 *     uint32_t {@link #height};
 *     uint32_t {@link #depth};
 *     uint32_t {@link #levelCount};
 *     uint32_t {@link #layerCount};
 * }</code></pre>
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
        LAYERCOUNT;

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
            __member(4)
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

    /** pointer to {@code vkDestroyImage} function */
    @NativeType("PFN_vkDestroyImage")
    public long vkDestroyImage() { return nvkDestroyImage(address()); }
    /** pointer to {@code vkFreeMemory} function */
    @NativeType("PFN_vkFreeMemory")
    public long vkFreeMemory() { return nvkFreeMemory(address()); }
    /** handle to the Vulkan image created by the loader */
    @NativeType("VkImage")
    public long image() { return nimage(address()); }
    /** format of the image data */
    @NativeType("VkFormat")
    public int imageFormat() { return nimageFormat(address()); }
    /** layout of the created image. Has the same value as {@code layout} parameter passed to the loader. */
    @NativeType("VkImageLayout")
    public int imageLayout() { return nimageLayout(address()); }
    /** the memory allocated for the image on the Vulkan device */
    @NativeType("VkDeviceMemory")
    public long deviceMemory() { return ndeviceMemory(address()); }
    /** viewType corresponding to {@code image}. Reflects the dimensionality, cubeness and arrayness of the image. */
    @NativeType("VkImageViewType")
    public int viewType() { return nviewType(address()); }
    /** the width of the image */
    @NativeType("uint32_t")
    public int width() { return nwidth(address()); }
    /** the height of the image */
    @NativeType("uint32_t")
    public int height() { return nheight(address()); }
    /** the depth of the image */
    @NativeType("uint32_t")
    public int depth() { return ndepth(address()); }
    /** the number of MIP levels in the image */
    @NativeType("uint32_t")
    public int levelCount() { return nlevelCount(address()); }
    /** the number of array layers in the image */
    @NativeType("uint32_t")
    public int layerCount() { return nlayerCount(address()); }

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
    @Nullable
    public static ktxVulkanTexture createSafe(long address) {
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
    @Nullable
    public static ktxVulkanTexture.Buffer createSafe(long address, int capacity) {
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
    public static long nimage(long struct) { return UNSAFE.getLong(null, struct + ktxVulkanTexture.IMAGE); }
    /** Unsafe version of {@link #imageFormat}. */
    public static int nimageFormat(long struct) { return UNSAFE.getInt(null, struct + ktxVulkanTexture.IMAGEFORMAT); }
    /** Unsafe version of {@link #imageLayout}. */
    public static int nimageLayout(long struct) { return UNSAFE.getInt(null, struct + ktxVulkanTexture.IMAGELAYOUT); }
    /** Unsafe version of {@link #deviceMemory}. */
    public static long ndeviceMemory(long struct) { return UNSAFE.getLong(null, struct + ktxVulkanTexture.DEVICEMEMORY); }
    /** Unsafe version of {@link #viewType}. */
    public static int nviewType(long struct) { return UNSAFE.getInt(null, struct + ktxVulkanTexture.VIEWTYPE); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return UNSAFE.getInt(null, struct + ktxVulkanTexture.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return UNSAFE.getInt(null, struct + ktxVulkanTexture.HEIGHT); }
    /** Unsafe version of {@link #depth}. */
    public static int ndepth(long struct) { return UNSAFE.getInt(null, struct + ktxVulkanTexture.DEPTH); }
    /** Unsafe version of {@link #levelCount}. */
    public static int nlevelCount(long struct) { return UNSAFE.getInt(null, struct + ktxVulkanTexture.LEVELCOUNT); }
    /** Unsafe version of {@link #layerCount}. */
    public static int nlayerCount(long struct) { return UNSAFE.getInt(null, struct + ktxVulkanTexture.LAYERCOUNT); }

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
        protected ktxVulkanTexture getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link ktxVulkanTexture#vkDestroyImage} field. */
        @NativeType("PFN_vkDestroyImage")
        public long vkDestroyImage() { return ktxVulkanTexture.nvkDestroyImage(address()); }
        /** @return the value of the {@link ktxVulkanTexture#vkFreeMemory} field. */
        @NativeType("PFN_vkFreeMemory")
        public long vkFreeMemory() { return ktxVulkanTexture.nvkFreeMemory(address()); }
        /** @return the value of the {@link ktxVulkanTexture#image} field. */
        @NativeType("VkImage")
        public long image() { return ktxVulkanTexture.nimage(address()); }
        /** @return the value of the {@link ktxVulkanTexture#imageFormat} field. */
        @NativeType("VkFormat")
        public int imageFormat() { return ktxVulkanTexture.nimageFormat(address()); }
        /** @return the value of the {@link ktxVulkanTexture#imageLayout} field. */
        @NativeType("VkImageLayout")
        public int imageLayout() { return ktxVulkanTexture.nimageLayout(address()); }
        /** @return the value of the {@link ktxVulkanTexture#deviceMemory} field. */
        @NativeType("VkDeviceMemory")
        public long deviceMemory() { return ktxVulkanTexture.ndeviceMemory(address()); }
        /** @return the value of the {@link ktxVulkanTexture#viewType} field. */
        @NativeType("VkImageViewType")
        public int viewType() { return ktxVulkanTexture.nviewType(address()); }
        /** @return the value of the {@link ktxVulkanTexture#width} field. */
        @NativeType("uint32_t")
        public int width() { return ktxVulkanTexture.nwidth(address()); }
        /** @return the value of the {@link ktxVulkanTexture#height} field. */
        @NativeType("uint32_t")
        public int height() { return ktxVulkanTexture.nheight(address()); }
        /** @return the value of the {@link ktxVulkanTexture#depth} field. */
        @NativeType("uint32_t")
        public int depth() { return ktxVulkanTexture.ndepth(address()); }
        /** @return the value of the {@link ktxVulkanTexture#levelCount} field. */
        @NativeType("uint32_t")
        public int levelCount() { return ktxVulkanTexture.nlevelCount(address()); }
        /** @return the value of the {@link ktxVulkanTexture#layerCount} field. */
        @NativeType("uint32_t")
        public int layerCount() { return ktxVulkanTexture.nlayerCount(address()); }

    }

}