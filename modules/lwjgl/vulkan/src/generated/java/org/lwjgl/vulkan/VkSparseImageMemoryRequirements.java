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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying sparse image memory requirements.
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
public class VkSparseImageMemoryRequirements extends Struct implements NativeResource {

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

    /**
     * {@code formatProperties.aspectMask} is the set of aspects of the image that this sparse memory requirement applies to. This will usually have a single aspect specified. However, depth/stencil images <b>may</b> have depth and stencil data interleaved in the same sparse block, in which case both {@link VK10#VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT} and {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT} would be present.
     * 
     * <p>{@code formatProperties.imageGranularity} describes the dimensions of a single bindable sparse image block in texel units. For aspect {@link VK10#VK_IMAGE_ASPECT_METADATA_BIT IMAGE_ASPECT_METADATA_BIT}, all dimensions will be zero. All metadata is located in the mip tail region.</p>
     * 
     * <p>{@code formatProperties.flags} is a bitmask of {@code VkSparseImageFormatFlagBits}:</p>
     * 
     * <ul>
     * <li>If {@link VK10#VK_SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT} is set the image uses a single mip tail region for all array layers.</li>
     * <li>If {@link VK10#VK_SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT} is set the dimensions of mip levels <b>must</b> be integer multiples of the corresponding dimensions of the sparse image block for levels not located in the mip tail.</li>
     * <li>If {@link VK10#VK_SPARSE_IMAGE_FORMAT_NONSTANDARD_BLOCK_SIZE_BIT SPARSE_IMAGE_FORMAT_NONSTANDARD_BLOCK_SIZE_BIT} is set the image uses non-standard sparse image block dimensions. The {@code formatProperties.imageGranularity} values do not match the standard sparse image block dimension corresponding to the image&#8217;s format.</li>
     * </ul>
     */
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
    /** the offset stride between each array-layer&#8217;s mip tail, if {@code formatProperties.flags} does not contain {@link VK10#VK_SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT} (otherwise the value is undefined). */
    @NativeType("VkDeviceSize")
    public long imageMipTailStride() { return nimageMipTailStride(address()); }

    // -----------------------------------

    /** Returns a new {@code VkSparseImageMemoryRequirements} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSparseImageMemoryRequirements malloc() {
        return wrap(VkSparseImageMemoryRequirements.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSparseImageMemoryRequirements} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSparseImageMemoryRequirements calloc() {
        return wrap(VkSparseImageMemoryRequirements.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSparseImageMemoryRequirements} instance allocated with {@link BufferUtils}. */
    public static VkSparseImageMemoryRequirements create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSparseImageMemoryRequirements.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSparseImageMemoryRequirements} instance for the specified memory address. */
    public static VkSparseImageMemoryRequirements create(long address) {
        return wrap(VkSparseImageMemoryRequirements.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSparseImageMemoryRequirements createSafe(long address) {
        return address == NULL ? null : wrap(VkSparseImageMemoryRequirements.class, address);
    }

    /**
     * Returns a new {@link VkSparseImageMemoryRequirements.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSparseImageMemoryRequirements.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSparseImageMemoryRequirements.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSparseImageMemoryRequirements.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSparseImageMemoryRequirements.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSparseImageMemoryRequirements.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSparseImageMemoryRequirements.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSparseImageMemoryRequirements.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSparseImageMemoryRequirements.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkSparseImageMemoryRequirements} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkSparseImageMemoryRequirements mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkSparseImageMemoryRequirements} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkSparseImageMemoryRequirements callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkSparseImageMemoryRequirements} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSparseImageMemoryRequirements mallocStack(MemoryStack stack) {
        return wrap(VkSparseImageMemoryRequirements.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSparseImageMemoryRequirements} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSparseImageMemoryRequirements callocStack(MemoryStack stack) {
        return wrap(VkSparseImageMemoryRequirements.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSparseImageMemoryRequirements.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSparseImageMemoryRequirements.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSparseImageMemoryRequirements.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkSparseImageMemoryRequirements.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSparseImageMemoryRequirements.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSparseImageMemoryRequirements.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSparseImageMemoryRequirements.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSparseImageMemoryRequirements.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #formatProperties}. */
    public static VkSparseImageFormatProperties nformatProperties(long struct) { return VkSparseImageFormatProperties.create(struct + VkSparseImageMemoryRequirements.FORMATPROPERTIES); }
    /** Unsafe version of {@link #imageMipTailFirstLod}. */
    public static int nimageMipTailFirstLod(long struct) { return UNSAFE.getInt(null, struct + VkSparseImageMemoryRequirements.IMAGEMIPTAILFIRSTLOD); }
    /** Unsafe version of {@link #imageMipTailSize}. */
    public static long nimageMipTailSize(long struct) { return UNSAFE.getLong(null, struct + VkSparseImageMemoryRequirements.IMAGEMIPTAILSIZE); }
    /** Unsafe version of {@link #imageMipTailOffset}. */
    public static long nimageMipTailOffset(long struct) { return UNSAFE.getLong(null, struct + VkSparseImageMemoryRequirements.IMAGEMIPTAILOFFSET); }
    /** Unsafe version of {@link #imageMipTailStride}. */
    public static long nimageMipTailStride(long struct) { return UNSAFE.getLong(null, struct + VkSparseImageMemoryRequirements.IMAGEMIPTAILSTRIDE); }

    // -----------------------------------

    /** An array of {@link VkSparseImageMemoryRequirements} structs. */
    public static class Buffer extends StructBuffer<VkSparseImageMemoryRequirements, Buffer> implements NativeResource {

        private static final VkSparseImageMemoryRequirements ELEMENT_FACTORY = VkSparseImageMemoryRequirements.create(-1L);

        /**
         * Creates a new {@code VkSparseImageMemoryRequirements.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSparseImageMemoryRequirements#SIZEOF}, and its mark will be undefined.
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