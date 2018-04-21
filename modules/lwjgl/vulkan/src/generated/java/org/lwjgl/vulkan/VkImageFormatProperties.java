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
 * Structure specifying a image format properties.
 * 
 * <h5>Description</h5>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>There is no mechanism to query the size of an image before creating it, to compare that size against {@code maxResourceSize}. If an application attempts to create an image that exceeds this limit, the creation will fail and {@link VK10#vkCreateImage CreateImage} will return {@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}. While the advertised limit <b>must</b> be at least 2<sup>31</sup>, it <b>may</b> not be possible to create an image that approaches that size, particularly for {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D}.</p>
 * </div>
 * 
 * <p>If the combination of parameters to {@link VK10#vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties} is not supported by the implementation for use in {@link VK10#vkCreateImage CreateImage}, then all members of {@link VkImageFormatProperties} will be filled with zero.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Filling {@link VkImageFormatProperties} with zero for unsupported formats is an exception to the usual rule that output structures have undefined contents on error. This exception was unintentional, but is preserved for backwards compatibility.</p>
 * </div>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtent3D}, {@link VkExternalImageFormatPropertiesNV}, {@link VkImageFormatProperties2}, {@link VK10#vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code maxExtent} &ndash; are the maximum image dimensions. See the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#features-extentperimagetype">Allowed Extent Values</a> section below for how these values are constrained by {@code type}.</li>
 * <li>{@code maxMipLevels} &ndash; the maximum number of mipmap levels. {@code maxMipLevels} <b>must</b> be equal to <code>⌈log<sub>2</sub>(max(width, height, depth))⌉ + 1</code>, where <code>width</code>, <code>height</code>, and <code>depth</code> are taken from the corresponding members of {@code maxExtent}, except when one of the following conditions is true, in which case it <b>may</b> instead be 1:
 * 
 * <ul>
 * <li>{@link VK10#vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties}{@code ::tiling} was {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR}</li>
 * <li>the {@link VkPhysicalDeviceImageFormatInfo2}{@code ::pNext} chain included an instance of {@link VkPhysicalDeviceExternalImageFormatInfo} with a handle type included in the {@code handleTypes} member for which mipmap image support is not required</li>
 * </ul></li>
 * <li>{@code maxArrayLayers} &ndash; the maximum number of array layers. {@code maxArrayLayers} <b>must</b> either be equal to 1 or be greater than or equal to the {@code maxImageArrayLayers} member of {@link VkPhysicalDeviceLimits}. A value of 1 is valid only if {@code tiling} is {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR} or if {@code type} is {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}.</li>
 * <li>{@code sampleCounts} &ndash; a bitmask of {@code VkSampleCountFlagBits} specifying all the supported sample counts for this image as described <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#features-supported-sample-counts">below</a>.</li>
 * <li>{@code maxResourceSize} &ndash; an upper bound on the total image size in bytes, inclusive of all image subresources. Implementations <b>may</b> have an address space limit on total size of a resource, which is advertised by this property. {@code maxResourceSize} <b>must</b> be at least 2<sup>31</sup>.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkImageFormatProperties {
 *     {@link VkExtent3D VkExtent3D} maxExtent;
 *     uint32_t maxMipLevels;
 *     uint32_t maxArrayLayers;
 *     VkSampleCountFlags sampleCounts;
 *     VkDeviceSize maxResourceSize;
 * }</pre></code>
 */
public class VkImageFormatProperties extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MAXEXTENT,
        MAXMIPLEVELS,
        MAXARRAYLAYERS,
        SAMPLECOUNTS,
        MAXRESOURCESIZE;

    static {
        Layout layout = __struct(
            __member(VkExtent3D.SIZEOF, VkExtent3D.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MAXEXTENT = layout.offsetof(0);
        MAXMIPLEVELS = layout.offsetof(1);
        MAXARRAYLAYERS = layout.offsetof(2);
        SAMPLECOUNTS = layout.offsetof(3);
        MAXRESOURCESIZE = layout.offsetof(4);
    }

    VkImageFormatProperties(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkImageFormatProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageFormatProperties(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link VkExtent3D} view of the {@code maxExtent} field. */
    public VkExtent3D maxExtent() { return nmaxExtent(address()); }
    /** Returns the value of the {@code maxMipLevels} field. */
    @NativeType("uint32_t")
    public int maxMipLevels() { return nmaxMipLevels(address()); }
    /** Returns the value of the {@code maxArrayLayers} field. */
    @NativeType("uint32_t")
    public int maxArrayLayers() { return nmaxArrayLayers(address()); }
    /** Returns the value of the {@code sampleCounts} field. */
    @NativeType("VkSampleCountFlags")
    public int sampleCounts() { return nsampleCounts(address()); }
    /** Returns the value of the {@code maxResourceSize} field. */
    @NativeType("VkDeviceSize")
    public long maxResourceSize() { return nmaxResourceSize(address()); }

    // -----------------------------------

    /** Returns a new {@link VkImageFormatProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageFormatProperties malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkImageFormatProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageFormatProperties calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkImageFormatProperties} instance allocated with {@link BufferUtils}. */
    public static VkImageFormatProperties create() {
        return new VkImageFormatProperties(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkImageFormatProperties} instance for the specified memory address. */
    public static VkImageFormatProperties create(long address) {
        return new VkImageFormatProperties(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageFormatProperties createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkImageFormatProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageFormatProperties.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageFormatProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageFormatProperties.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageFormatProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageFormatProperties.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkImageFormatProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageFormatProperties.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageFormatProperties.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkImageFormatProperties} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkImageFormatProperties mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkImageFormatProperties} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkImageFormatProperties callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkImageFormatProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageFormatProperties mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkImageFormatProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageFormatProperties callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImageFormatProperties.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageFormatProperties.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImageFormatProperties.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageFormatProperties.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImageFormatProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageFormatProperties.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageFormatProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageFormatProperties.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #maxExtent}. */
    public static VkExtent3D nmaxExtent(long struct) { return VkExtent3D.create(struct + VkImageFormatProperties.MAXEXTENT); }
    /** Unsafe version of {@link #maxMipLevels}. */
    public static int nmaxMipLevels(long struct) { return memGetInt(struct + VkImageFormatProperties.MAXMIPLEVELS); }
    /** Unsafe version of {@link #maxArrayLayers}. */
    public static int nmaxArrayLayers(long struct) { return memGetInt(struct + VkImageFormatProperties.MAXARRAYLAYERS); }
    /** Unsafe version of {@link #sampleCounts}. */
    public static int nsampleCounts(long struct) { return memGetInt(struct + VkImageFormatProperties.SAMPLECOUNTS); }
    /** Unsafe version of {@link #maxResourceSize}. */
    public static long nmaxResourceSize(long struct) { return memGetLong(struct + VkImageFormatProperties.MAXRESOURCESIZE); }

    // -----------------------------------

    /** An array of {@link VkImageFormatProperties} structs. */
    public static class Buffer extends StructBuffer<VkImageFormatProperties, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkImageFormatProperties.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageFormatProperties#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VkImageFormatProperties newInstance(long address) {
            return new VkImageFormatProperties(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link VkExtent3D} view of the {@code maxExtent} field. */
        public VkExtent3D maxExtent() { return VkImageFormatProperties.nmaxExtent(address()); }
        /** Returns the value of the {@code maxMipLevels} field. */
        @NativeType("uint32_t")
        public int maxMipLevels() { return VkImageFormatProperties.nmaxMipLevels(address()); }
        /** Returns the value of the {@code maxArrayLayers} field. */
        @NativeType("uint32_t")
        public int maxArrayLayers() { return VkImageFormatProperties.nmaxArrayLayers(address()); }
        /** Returns the value of the {@code sampleCounts} field. */
        @NativeType("VkSampleCountFlags")
        public int sampleCounts() { return VkImageFormatProperties.nsampleCounts(address()); }
        /** Returns the value of the {@code maxResourceSize} field. */
        @NativeType("VkDeviceSize")
        public long maxResourceSize() { return VkImageFormatProperties.nmaxResourceSize(address()); }

    }

}