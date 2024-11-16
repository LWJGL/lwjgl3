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
 * Structure specifying descriptor image information.
 * 
 * <h5>Description</h5>
 * 
 * <p>Members of {@link VkDescriptorImageInfo} that are not used in an update (as described above) are ignored.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code imageView} <b>must</b> not be a 2D array image view created from a 3D image</li>
 * <li>If {@code imageView} is a 2D view created from a 3D image, then {@code descriptorType} <b>must</b> be {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE}, {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE}, or {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}</li>
 * <li>If {@code imageView} is a 2D view created from a 3D image, then the image <b>must</b> have been created with {@link EXTImage2dViewOf3d#VK_IMAGE_CREATE_2D_VIEW_COMPATIBLE_BIT_EXT IMAGE_CREATE_2D_VIEW_COMPATIBLE_BIT_EXT} set</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-image2DViewOf3D">{@code image2DViewOf3D}</a> feature is not enabled or {@code descriptorType} is not {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE} then {@code imageView} <b>must</b> not be a 2D view created from a 3D image</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-sampler2DViewOf3D">{@code sampler2DViewOf3D}</a> feature is not enabled or {@code descriptorType} is not {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE} or {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER} then {@code imageView} <b>must</b> not be a 2D view created from a 3D image</li>
 * <li>If {@code imageView} is created from a depth/stencil image, the {@code aspectMask} used to create the {@code imageView} <b>must</b> include either {@link VK10#VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT} or {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT} but not both</li>
 * <li>If {@code imageLayout} is {@link VK10#VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL}, then the {@code aspectMask} used to create {@code imageView} <b>must</b> not include either {@link VK10#VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT} or {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT}</li>
 * <li>If {@code imageLayout} is {@link VK11#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL}, {@link VK11#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL}, {@link VK12#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL}, {@link VK12#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL}, {@link VK12#VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL}, {@link VK12#VK_IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL}, {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL} or {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL}, then the {@code aspectMask} used to create {@code imageView} <b>must</b> not include {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT}</li>
 * <li>{@code imageLayout} <b>must</b> match the actual {@code VkImageLayout} of each subresource accessible from {@code imageView} at the time this descriptor is accessed as defined by the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-layouts-matching-rule">image layout matching rules</a></li>
 * <li>If {@code sampler} is used and the {@code VkFormat} of the image is a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar format</a>, the image <b>must</b> have been created with {@link VK10#VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT IMAGE_CREATE_MUTABLE_FORMAT_BIT}, and the {@code aspectMask} of the {@code imageView} <b>must</b> be a valid <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-planes-image-aspect">multi-planar aspect mask</a> bit</li>
 * <li>If the {@link KHRPortabilitySubset VK_KHR_portability_subset} extension is enabled, and {@link VkPhysicalDevicePortabilitySubsetFeaturesKHR}{@code ::mutableComparisonSamplers} is {@link VK10#VK_FALSE FALSE}, then {@code sampler} <b>must</b> have been created with {@link VkSamplerCreateInfo}{@code ::compareEnable} set to {@link VK10#VK_FALSE FALSE}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>Both of {@code imageView}, and {@code sampler} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDescriptorDataEXT}, {@link VkWriteDescriptorSet}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDescriptorImageInfo {
 *     VkSampler {@link #sampler};
 *     VkImageView {@link #imageView};
 *     VkImageLayout {@link #imageLayout};
 * }</code></pre>
 */
public class VkDescriptorImageInfo extends Struct<VkDescriptorImageInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SAMPLER,
        IMAGEVIEW,
        IMAGELAYOUT;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SAMPLER = layout.offsetof(0);
        IMAGEVIEW = layout.offsetof(1);
        IMAGELAYOUT = layout.offsetof(2);
    }

    protected VkDescriptorImageInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDescriptorImageInfo create(long address, @Nullable ByteBuffer container) {
        return new VkDescriptorImageInfo(address, container);
    }

    /**
     * Creates a {@code VkDescriptorImageInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorImageInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a sampler handle, and is used in descriptor updates for types {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLER DESCRIPTOR_TYPE_SAMPLER} and {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER} if the binding being updated does not use immutable samplers. */
    @NativeType("VkSampler")
    public long sampler() { return nsampler(address()); }
    /** {@link VK10#VK_NULL_HANDLE NULL_HANDLE} or an image view handle, and is used in descriptor updates for types {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE}, {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE}, {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, and {@link VK10#VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT}. */
    @NativeType("VkImageView")
    public long imageView() { return nimageView(address()); }
    /** the layout that the image subresources accessible from {@code imageView} will be in at the time this descriptor is accessed. {@code imageLayout} is used in descriptor updates for types {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE}, {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE}, {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, and {@link VK10#VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT}. */
    @NativeType("VkImageLayout")
    public int imageLayout() { return nimageLayout(address()); }

    /** Sets the specified value to the {@link #sampler} field. */
    public VkDescriptorImageInfo sampler(@NativeType("VkSampler") long value) { nsampler(address(), value); return this; }
    /** Sets the specified value to the {@link #imageView} field. */
    public VkDescriptorImageInfo imageView(@NativeType("VkImageView") long value) { nimageView(address(), value); return this; }
    /** Sets the specified value to the {@link #imageLayout} field. */
    public VkDescriptorImageInfo imageLayout(@NativeType("VkImageLayout") int value) { nimageLayout(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDescriptorImageInfo set(
        long sampler,
        long imageView,
        int imageLayout
    ) {
        sampler(sampler);
        imageView(imageView);
        imageLayout(imageLayout);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorImageInfo set(VkDescriptorImageInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDescriptorImageInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorImageInfo malloc() {
        return new VkDescriptorImageInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorImageInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorImageInfo calloc() {
        return new VkDescriptorImageInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorImageInfo} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorImageInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorImageInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorImageInfo} instance for the specified memory address. */
    public static VkDescriptorImageInfo create(long address) {
        return new VkDescriptorImageInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDescriptorImageInfo createSafe(long address) {
        return address == NULL ? null : new VkDescriptorImageInfo(address, null);
    }

    /**
     * Returns a new {@link VkDescriptorImageInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorImageInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorImageInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorImageInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorImageInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorImageInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDescriptorImageInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorImageInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDescriptorImageInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorImageInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorImageInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorImageInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorImageInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorImageInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorImageInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorImageInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorImageInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDescriptorImageInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorImageInfo malloc(MemoryStack stack) {
        return new VkDescriptorImageInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDescriptorImageInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorImageInfo calloc(MemoryStack stack) {
        return new VkDescriptorImageInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDescriptorImageInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorImageInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorImageInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorImageInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sampler}. */
    public static long nsampler(long struct) { return memGetLong(struct + VkDescriptorImageInfo.SAMPLER); }
    /** Unsafe version of {@link #imageView}. */
    public static long nimageView(long struct) { return memGetLong(struct + VkDescriptorImageInfo.IMAGEVIEW); }
    /** Unsafe version of {@link #imageLayout}. */
    public static int nimageLayout(long struct) { return memGetInt(struct + VkDescriptorImageInfo.IMAGELAYOUT); }

    /** Unsafe version of {@link #sampler(long) sampler}. */
    public static void nsampler(long struct, long value) { memPutLong(struct + VkDescriptorImageInfo.SAMPLER, value); }
    /** Unsafe version of {@link #imageView(long) imageView}. */
    public static void nimageView(long struct, long value) { memPutLong(struct + VkDescriptorImageInfo.IMAGEVIEW, value); }
    /** Unsafe version of {@link #imageLayout(int) imageLayout}. */
    public static void nimageLayout(long struct, int value) { memPutInt(struct + VkDescriptorImageInfo.IMAGELAYOUT, value); }

    // -----------------------------------

    /** An array of {@link VkDescriptorImageInfo} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorImageInfo, Buffer> implements NativeResource {

        private static final VkDescriptorImageInfo ELEMENT_FACTORY = VkDescriptorImageInfo.create(-1L);

        /**
         * Creates a new {@code VkDescriptorImageInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorImageInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDescriptorImageInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDescriptorImageInfo#sampler} field. */
        @NativeType("VkSampler")
        public long sampler() { return VkDescriptorImageInfo.nsampler(address()); }
        /** @return the value of the {@link VkDescriptorImageInfo#imageView} field. */
        @NativeType("VkImageView")
        public long imageView() { return VkDescriptorImageInfo.nimageView(address()); }
        /** @return the value of the {@link VkDescriptorImageInfo#imageLayout} field. */
        @NativeType("VkImageLayout")
        public int imageLayout() { return VkDescriptorImageInfo.nimageLayout(address()); }

        /** Sets the specified value to the {@link VkDescriptorImageInfo#sampler} field. */
        public VkDescriptorImageInfo.Buffer sampler(@NativeType("VkSampler") long value) { VkDescriptorImageInfo.nsampler(address(), value); return this; }
        /** Sets the specified value to the {@link VkDescriptorImageInfo#imageView} field. */
        public VkDescriptorImageInfo.Buffer imageView(@NativeType("VkImageView") long value) { VkDescriptorImageInfo.nimageView(address(), value); return this; }
        /** Sets the specified value to the {@link VkDescriptorImageInfo#imageLayout} field. */
        public VkDescriptorImageInfo.Buffer imageLayout(@NativeType("VkImageLayout") int value) { VkDescriptorImageInfo.nimageLayout(address(), value); return this; }

    }

}