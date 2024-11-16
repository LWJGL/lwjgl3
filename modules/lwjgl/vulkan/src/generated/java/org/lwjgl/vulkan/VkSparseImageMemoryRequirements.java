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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying sparse image memory requirements.
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkSparseImageFormatProperties}, {@link VkSparseImageMemoryRequirements2}, {@link VK10#vkGetImageSparseMemoryRequirements GetImageSparseMemoryRequirements}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSparseImageMemoryRequirements {
 *     {@link VkSparseImageFormatProperties VkSparseImageFormatProperties} {@link #formatProperties};
 *     uint32_t {@link #imageMipTailFirstLod};
 *     VkDeviceSize {@link #imageMipTailSize};
 *     VkDeviceSize {@link #imageMipTailOffset};
 *     VkDeviceSize {@link #imageMipTailStride};
 * }</code></pre>
 */
public class VkSparseImageMemoryRequirements extends Struct<VkSparseImageMemoryRequirements> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FORMATPROPERTIES,
        IMAGEMIPTAILFIRSTLOD,
        IMAGEMIPTAILSIZE,
        IMAGEMIPTAILOFFSET,
        IMAGEMIPTAILSTRIDE;

    static {
        Layout layout = __struct(
            __member(VkSparseImageFormatProperties.SIZEOF, VkSparseImageFormatProperties.ALIGNOF),
            __member(4),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FORMATPROPERTIES = layout.offsetof(0);
        IMAGEMIPTAILFIRSTLOD = layout.offsetof(1);
        IMAGEMIPTAILSIZE = layout.offsetof(2);
        IMAGEMIPTAILOFFSET = layout.offsetof(3);
        IMAGEMIPTAILSTRIDE = layout.offsetof(4);
    }

    protected VkSparseImageMemoryRequirements(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSparseImageMemoryRequirements create(long address, @Nullable ByteBuffer container) {
        return new VkSparseImageMemoryRequirements(address, container);
    }

    /**
     * Creates a {@code VkSparseImageMemoryRequirements} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSparseImageMemoryRequirements(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@link VkSparseImageFormatProperties} structure specifying properties of the image format. */
    public VkSparseImageFormatProperties formatProperties() { return nformatProperties(address()); }
    /** the first mip level at which image subresources are included in the mip tail region. */
    @NativeType("uint32_t")
    public int imageMipTailFirstLod() { return nimageMipTailFirstLod(address()); }
    /** the memory size (in bytes) of the mip tail region. If {@code formatProperties.flags} contains {@link VK10#VK_SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT}, this is the size of the whole mip tail, otherwise this is the size of the mip tail of a single array layer. This value is guaranteed to be a multiple of the sparse block size in bytes. */
    @NativeType("VkDeviceSize")
    public long imageMipTailSize() { return nimageMipTailSize(address()); }
    /** the opaque memory offset used with {@link VkSparseImageOpaqueMemoryBindInfo} to bind the mip tail region(s). */
    @NativeType("VkDeviceSize")
    public long imageMipTailOffset() { return nimageMipTailOffset(address()); }
    /** the offset stride between each array-layer’s mip tail, if {@code formatProperties.flags} does not contain {@link VK10#VK_SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT} (otherwise the value is undefined). */
    @NativeType("VkDeviceSize")
    public long imageMipTailStride() { return nimageMipTailStride(address()); }

    // -----------------------------------

    /** Returns a new {@code VkSparseImageMemoryRequirements} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSparseImageMemoryRequirements malloc() {
        return new VkSparseImageMemoryRequirements(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSparseImageMemoryRequirements} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSparseImageMemoryRequirements calloc() {
        return new VkSparseImageMemoryRequirements(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSparseImageMemoryRequirements} instance allocated with {@link BufferUtils}. */
    public static VkSparseImageMemoryRequirements create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSparseImageMemoryRequirements(memAddress(container), container);
    }

    /** Returns a new {@code VkSparseImageMemoryRequirements} instance for the specified memory address. */
    public static VkSparseImageMemoryRequirements create(long address) {
        return new VkSparseImageMemoryRequirements(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSparseImageMemoryRequirements createSafe(long address) {
        return address == NULL ? null : new VkSparseImageMemoryRequirements(address, null);
    }

    /**
     * Returns a new {@link VkSparseImageMemoryRequirements.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSparseImageMemoryRequirements.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSparseImageMemoryRequirements.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSparseImageMemoryRequirements.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSparseImageMemoryRequirements.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSparseImageMemoryRequirements.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSparseImageMemoryRequirements.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSparseImageMemoryRequirements.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSparseImageMemoryRequirements.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSparseImageMemoryRequirements mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSparseImageMemoryRequirements callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSparseImageMemoryRequirements mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSparseImageMemoryRequirements callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSparseImageMemoryRequirements.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSparseImageMemoryRequirements.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSparseImageMemoryRequirements.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSparseImageMemoryRequirements.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkSparseImageMemoryRequirements} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSparseImageMemoryRequirements malloc(MemoryStack stack) {
        return new VkSparseImageMemoryRequirements(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSparseImageMemoryRequirements} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSparseImageMemoryRequirements calloc(MemoryStack stack) {
        return new VkSparseImageMemoryRequirements(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSparseImageMemoryRequirements.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSparseImageMemoryRequirements.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSparseImageMemoryRequirements.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSparseImageMemoryRequirements.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #formatProperties}. */
    public static VkSparseImageFormatProperties nformatProperties(long struct) { return VkSparseImageFormatProperties.create(struct + VkSparseImageMemoryRequirements.FORMATPROPERTIES); }
    /** Unsafe version of {@link #imageMipTailFirstLod}. */
    public static int nimageMipTailFirstLod(long struct) { return memGetInt(struct + VkSparseImageMemoryRequirements.IMAGEMIPTAILFIRSTLOD); }
    /** Unsafe version of {@link #imageMipTailSize}. */
    public static long nimageMipTailSize(long struct) { return memGetLong(struct + VkSparseImageMemoryRequirements.IMAGEMIPTAILSIZE); }
    /** Unsafe version of {@link #imageMipTailOffset}. */
    public static long nimageMipTailOffset(long struct) { return memGetLong(struct + VkSparseImageMemoryRequirements.IMAGEMIPTAILOFFSET); }
    /** Unsafe version of {@link #imageMipTailStride}. */
    public static long nimageMipTailStride(long struct) { return memGetLong(struct + VkSparseImageMemoryRequirements.IMAGEMIPTAILSTRIDE); }

    // -----------------------------------

    /** An array of {@link VkSparseImageMemoryRequirements} structs. */
    public static class Buffer extends StructBuffer<VkSparseImageMemoryRequirements, Buffer> implements NativeResource {

        private static final VkSparseImageMemoryRequirements ELEMENT_FACTORY = VkSparseImageMemoryRequirements.create(-1L);

        /**
         * Creates a new {@code VkSparseImageMemoryRequirements.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSparseImageMemoryRequirements#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSparseImageMemoryRequirements getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link VkSparseImageFormatProperties} view of the {@link VkSparseImageMemoryRequirements#formatProperties} field. */
        public VkSparseImageFormatProperties formatProperties() { return VkSparseImageMemoryRequirements.nformatProperties(address()); }
        /** @return the value of the {@link VkSparseImageMemoryRequirements#imageMipTailFirstLod} field. */
        @NativeType("uint32_t")
        public int imageMipTailFirstLod() { return VkSparseImageMemoryRequirements.nimageMipTailFirstLod(address()); }
        /** @return the value of the {@link VkSparseImageMemoryRequirements#imageMipTailSize} field. */
        @NativeType("VkDeviceSize")
        public long imageMipTailSize() { return VkSparseImageMemoryRequirements.nimageMipTailSize(address()); }
        /** @return the value of the {@link VkSparseImageMemoryRequirements#imageMipTailOffset} field. */
        @NativeType("VkDeviceSize")
        public long imageMipTailOffset() { return VkSparseImageMemoryRequirements.nimageMipTailOffset(address()); }
        /** @return the value of the {@link VkSparseImageMemoryRequirements#imageMipTailStride} field. */
        @NativeType("VkDeviceSize")
        public long imageMipTailStride() { return VkSparseImageMemoryRequirements.nimageMipTailStride(address()); }

    }

}