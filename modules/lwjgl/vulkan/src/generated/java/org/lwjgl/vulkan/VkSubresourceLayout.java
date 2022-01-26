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
 * Structure specifying subresource layout.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the image is <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#glossary-linear-resource">linear</a>, then {@code rowPitch}, {@code arrayPitch} and {@code depthPitch} describe the layout of the image subresource in linear memory. For uncompressed formats, {@code rowPitch} is the number of bytes between texels with the same x coordinate in adjacent rows (y coordinates differ by one). {@code arrayPitch} is the number of bytes between texels with the same x and y coordinate in adjacent array layers of the image (array layer values differ by one). {@code depthPitch} is the number of bytes between texels with the same x and y coordinate in adjacent slices of a 3D image (z coordinates differ by one). Expressed as an addressing formula, the starting byte of a texel in the image subresource has address:</p>
 * 
 * <pre><code>
 * // (x,y,z,layer) are in texel coordinates
 * address(x,y,z,layer) = layer*arrayPitch + z*depthPitch + y*rowPitch + x*elementSize + offset</code></pre>
 * 
 * <p>For compressed formats, the {@code rowPitch} is the number of bytes between compressed texel blocks in adjacent rows. {@code arrayPitch} is the number of bytes between compressed texel blocks in adjacent array layers. {@code depthPitch} is the number of bytes between compressed texel blocks in adjacent slices of a 3D image.</p>
 * 
 * <pre><code>
 * // (x,y,z,layer) are in compressed texel block coordinates
 * address(x,y,z,layer) = layer*arrayPitch + z*depthPitch + y*rowPitch + x*compressedTexelBlockByteSize + offset;</code></pre>
 * 
 * <p>The value of {@code arrayPitch} is undefined for images that were not created as arrays. {@code depthPitch} is defined only for 3D images.</p>
 * 
 * <p>If the image has a <em>single-plane</em> color format and its tiling is {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR} , then the {@code aspectMask} member of {@link VkImageSubresource} <b>must</b> be {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT}.</p>
 * 
 * <p>If the image has a depth/stencil format and its tiling is {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR} , then {@code aspectMask} <b>must</b> be either {@link VK10#VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT} or {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT}. On implementations that store depth and stencil aspects separately, querying each of these image subresource layouts will return a different {@code offset} and {@code size} representing the region of memory used for that aspect. On implementations that store depth and stencil aspects interleaved, the same {@code offset} and {@code size} are returned and represent the interleaved memory allocation.</p>
 * 
 * <p>If the image has a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar format</a> and its tiling is {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR} , then the {@code aspectMask} member of {@link VkImageSubresource} <b>must</b> be {@link VK11#VK_IMAGE_ASPECT_PLANE_0_BIT IMAGE_ASPECT_PLANE_0_BIT}, {@link VK11#VK_IMAGE_ASPECT_PLANE_1_BIT IMAGE_ASPECT_PLANE_1_BIT}, or (for 3-plane formats only) {@link VK11#VK_IMAGE_ASPECT_PLANE_2_BIT IMAGE_ASPECT_PLANE_2_BIT}. Querying each of these image subresource layouts will return a different {@code offset} and {@code size} representing the region of memory used for that plane. If the image is <em>disjoint</em>, then the {@code offset} is relative to the base address of the plane. If the image is <em>non-disjoint</em>, then the {@code offset} is relative to the base address of the image.</p>
 * 
 * <p>If the image’s tiling is {@link EXTImageDrmFormatModifier#VK_IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT}, then the {@code aspectMask} member of {@link VkImageSubresource} <b>must</b> be one of <code>VK_IMAGE_ASPECT_MEMORY_PLANE<em>_i_</em>BIT_EXT</code>, where the maximum allowed plane index <em>i</em> is defined by the {@link VkDrmFormatModifierPropertiesEXT}{@code ::drmFormatModifierPlaneCount} associated with the image’s {@link VkImageCreateInfo}{@code ::format} and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#glossary-drm-format-modifier">modifier</a>. The memory range used by the subresource is described by {@code offset} and {@code size}. If the image is <em>disjoint</em>, then the {@code offset} is relative to the base address of the <em>memory plane</em>. If the image is <em>non-disjoint</em>, then the {@code offset} is relative to the base address of the image. If the image is <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#glossary-linear-resource">non-linear</a>, then {@code rowPitch}, {@code arrayPitch}, and {@code depthPitch} have an implementation-dependent meaning.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkImageDrmFormatModifierExplicitCreateInfoEXT}, {@link VK10#vkGetImageSubresourceLayout GetImageSubresourceLayout}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSubresourceLayout {
 *     VkDeviceSize {@link #offset};
 *     VkDeviceSize {@link #size};
 *     VkDeviceSize {@link #rowPitch};
 *     VkDeviceSize {@link #arrayPitch};
 *     VkDeviceSize {@link #depthPitch};
 * }</code></pre>
 */
public class VkSubresourceLayout extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        OFFSET,
        SIZE,
        ROWPITCH,
        ARRAYPITCH,
        DEPTHPITCH;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        OFFSET = layout.offsetof(0);
        SIZE = layout.offsetof(1);
        ROWPITCH = layout.offsetof(2);
        ARRAYPITCH = layout.offsetof(3);
        DEPTHPITCH = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkSubresourceLayout} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSubresourceLayout(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the byte offset from the start of the image or the plane where the image subresource begins. */
    @NativeType("VkDeviceSize")
    public long offset() { return noffset(address()); }
    /** the size in bytes of the image subresource. {@code size} includes any extra memory that is required based on {@code rowPitch}. */
    @NativeType("VkDeviceSize")
    public long size() { return nsize(address()); }
    /** describes the number of bytes between each row of texels in an image. */
    @NativeType("VkDeviceSize")
    public long rowPitch() { return nrowPitch(address()); }
    /** describes the number of bytes between each array layer of an image. */
    @NativeType("VkDeviceSize")
    public long arrayPitch() { return narrayPitch(address()); }
    /** describes the number of bytes between each slice of 3D image. */
    @NativeType("VkDeviceSize")
    public long depthPitch() { return ndepthPitch(address()); }

    // -----------------------------------

    /** Returns a new {@code VkSubresourceLayout} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSubresourceLayout malloc() {
        return wrap(VkSubresourceLayout.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSubresourceLayout} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSubresourceLayout calloc() {
        return wrap(VkSubresourceLayout.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSubresourceLayout} instance allocated with {@link BufferUtils}. */
    public static VkSubresourceLayout create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSubresourceLayout.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSubresourceLayout} instance for the specified memory address. */
    public static VkSubresourceLayout create(long address) {
        return wrap(VkSubresourceLayout.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubresourceLayout createSafe(long address) {
        return address == NULL ? null : wrap(VkSubresourceLayout.class, address);
    }

    /**
     * Returns a new {@link VkSubresourceLayout.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubresourceLayout.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSubresourceLayout.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubresourceLayout.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubresourceLayout.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubresourceLayout.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSubresourceLayout.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSubresourceLayout.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubresourceLayout.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSubresourceLayout mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSubresourceLayout callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSubresourceLayout mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSubresourceLayout callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSubresourceLayout.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSubresourceLayout.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSubresourceLayout.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSubresourceLayout.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkSubresourceLayout} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubresourceLayout malloc(MemoryStack stack) {
        return wrap(VkSubresourceLayout.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSubresourceLayout} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubresourceLayout calloc(MemoryStack stack) {
        return wrap(VkSubresourceLayout.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSubresourceLayout.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubresourceLayout.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubresourceLayout.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubresourceLayout.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #offset}. */
    public static long noffset(long struct) { return UNSAFE.getLong(null, struct + VkSubresourceLayout.OFFSET); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return UNSAFE.getLong(null, struct + VkSubresourceLayout.SIZE); }
    /** Unsafe version of {@link #rowPitch}. */
    public static long nrowPitch(long struct) { return UNSAFE.getLong(null, struct + VkSubresourceLayout.ROWPITCH); }
    /** Unsafe version of {@link #arrayPitch}. */
    public static long narrayPitch(long struct) { return UNSAFE.getLong(null, struct + VkSubresourceLayout.ARRAYPITCH); }
    /** Unsafe version of {@link #depthPitch}. */
    public static long ndepthPitch(long struct) { return UNSAFE.getLong(null, struct + VkSubresourceLayout.DEPTHPITCH); }

    // -----------------------------------

    /** An array of {@link VkSubresourceLayout} structs. */
    public static class Buffer extends StructBuffer<VkSubresourceLayout, Buffer> implements NativeResource {

        private static final VkSubresourceLayout ELEMENT_FACTORY = VkSubresourceLayout.create(-1L);

        /**
         * Creates a new {@code VkSubresourceLayout.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSubresourceLayout#SIZEOF}, and its mark will be undefined.
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
        protected VkSubresourceLayout getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSubresourceLayout#offset} field. */
        @NativeType("VkDeviceSize")
        public long offset() { return VkSubresourceLayout.noffset(address()); }
        /** @return the value of the {@link VkSubresourceLayout#size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VkSubresourceLayout.nsize(address()); }
        /** @return the value of the {@link VkSubresourceLayout#rowPitch} field. */
        @NativeType("VkDeviceSize")
        public long rowPitch() { return VkSubresourceLayout.nrowPitch(address()); }
        /** @return the value of the {@link VkSubresourceLayout#arrayPitch} field. */
        @NativeType("VkDeviceSize")
        public long arrayPitch() { return VkSubresourceLayout.narrayPitch(address()); }
        /** @return the value of the {@link VkSubresourceLayout#depthPitch} field. */
        @NativeType("VkDeviceSize")
        public long depthPitch() { return VkSubresourceLayout.ndepthPitch(address()); }

    }

}