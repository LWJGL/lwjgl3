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
 * Structure specifying sparse image format properties.
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtent3D}, {@link VkSparseImageFormatProperties2}, {@link VkSparseImageMemoryRequirements}, {@link VK10#vkGetPhysicalDeviceSparseImageFormatProperties GetPhysicalDeviceSparseImageFormatProperties}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSparseImageFormatProperties {
 *     VkImageAspectFlags {@link #aspectMask};
 *     {@link VkExtent3D VkExtent3D} {@link #imageGranularity};
 *     VkSparseImageFormatFlags {@link #flags};
 * }</code></pre>
 */
public class VkSparseImageFormatProperties extends Struct<VkSparseImageFormatProperties> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ASPECTMASK,
        IMAGEGRANULARITY,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(VkExtent3D.SIZEOF, VkExtent3D.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ASPECTMASK = layout.offsetof(0);
        IMAGEGRANULARITY = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
    }

    protected VkSparseImageFormatProperties(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSparseImageFormatProperties create(long address, @Nullable ByteBuffer container) {
        return new VkSparseImageFormatProperties(address, container);
    }

    /**
     * Creates a {@code VkSparseImageFormatProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSparseImageFormatProperties(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a bitmask {@code VkImageAspectFlagBits} specifying which aspects of the image the properties apply to. */
    @NativeType("VkImageAspectFlags")
    public int aspectMask() { return naspectMask(address()); }
    /** the width, height, and depth of the sparse image block in texels or compressed texel blocks. */
    public VkExtent3D imageGranularity() { return nimageGranularity(address()); }
    /** a bitmask of {@code VkSparseImageFormatFlagBits} specifying additional information about the sparse resource. */
    @NativeType("VkSparseImageFormatFlags")
    public int flags() { return nflags(address()); }

    // -----------------------------------

    /** Returns a new {@code VkSparseImageFormatProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSparseImageFormatProperties malloc() {
        return new VkSparseImageFormatProperties(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSparseImageFormatProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSparseImageFormatProperties calloc() {
        return new VkSparseImageFormatProperties(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSparseImageFormatProperties} instance allocated with {@link BufferUtils}. */
    public static VkSparseImageFormatProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSparseImageFormatProperties(memAddress(container), container);
    }

    /** Returns a new {@code VkSparseImageFormatProperties} instance for the specified memory address. */
    public static VkSparseImageFormatProperties create(long address) {
        return new VkSparseImageFormatProperties(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSparseImageFormatProperties createSafe(long address) {
        return address == NULL ? null : new VkSparseImageFormatProperties(address, null);
    }

    /**
     * Returns a new {@link VkSparseImageFormatProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSparseImageFormatProperties.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSparseImageFormatProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSparseImageFormatProperties.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSparseImageFormatProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSparseImageFormatProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSparseImageFormatProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSparseImageFormatProperties.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSparseImageFormatProperties.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSparseImageFormatProperties mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSparseImageFormatProperties callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSparseImageFormatProperties mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSparseImageFormatProperties callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSparseImageFormatProperties.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSparseImageFormatProperties.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSparseImageFormatProperties.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSparseImageFormatProperties.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkSparseImageFormatProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSparseImageFormatProperties malloc(MemoryStack stack) {
        return new VkSparseImageFormatProperties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSparseImageFormatProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSparseImageFormatProperties calloc(MemoryStack stack) {
        return new VkSparseImageFormatProperties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSparseImageFormatProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSparseImageFormatProperties.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSparseImageFormatProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSparseImageFormatProperties.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #aspectMask}. */
    public static int naspectMask(long struct) { return memGetInt(struct + VkSparseImageFormatProperties.ASPECTMASK); }
    /** Unsafe version of {@link #imageGranularity}. */
    public static VkExtent3D nimageGranularity(long struct) { return VkExtent3D.create(struct + VkSparseImageFormatProperties.IMAGEGRANULARITY); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkSparseImageFormatProperties.FLAGS); }

    // -----------------------------------

    /** An array of {@link VkSparseImageFormatProperties} structs. */
    public static class Buffer extends StructBuffer<VkSparseImageFormatProperties, Buffer> implements NativeResource {

        private static final VkSparseImageFormatProperties ELEMENT_FACTORY = VkSparseImageFormatProperties.create(-1L);

        /**
         * Creates a new {@code VkSparseImageFormatProperties.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSparseImageFormatProperties#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSparseImageFormatProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSparseImageFormatProperties#aspectMask} field. */
        @NativeType("VkImageAspectFlags")
        public int aspectMask() { return VkSparseImageFormatProperties.naspectMask(address()); }
        /** @return a {@link VkExtent3D} view of the {@link VkSparseImageFormatProperties#imageGranularity} field. */
        public VkExtent3D imageGranularity() { return VkSparseImageFormatProperties.nimageGranularity(address()); }
        /** @return the value of the {@link VkSparseImageFormatProperties#flags} field. */
        @NativeType("VkSparseImageFormatFlags")
        public int flags() { return VkSparseImageFormatProperties.nflags(address()); }

    }

}