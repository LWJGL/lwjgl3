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
 * Structure specifying sparse image format properties.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code aspectMask} &ndash; a bitmask {@code VkImageAspectFlagBits} specifying which aspects of the image the properties apply to.</li>
 * <li>{@code imageGranularity} &ndash; the width, height, and depth of the sparse image block in texels or compressed texel blocks.</li>
 * <li>{@code flags} &ndash; a bitmask of {@code VkSparseImageFormatFlagBits} specifying additional information about the sparse resource.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSparseImageFormatProperties {
 *     VkImageAspectFlags aspectMask;
 *     {@link VkExtent3D VkExtent3D} imageGranularity;
 *     VkSparseImageFormatFlags flags;
 * }</code></pre>
 */
public class VkSparseImageFormatProperties extends Struct implements NativeResource {

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

    /** Returns the value of the {@code aspectMask} field. */
    @NativeType("VkImageAspectFlags")
    public int aspectMask() { return naspectMask(address()); }
    /** Returns a {@link VkExtent3D} view of the {@code imageGranularity} field. */
    public VkExtent3D imageGranularity() { return nimageGranularity(address()); }
    /** Returns the value of the {@code flags} field. */
    @NativeType("VkSparseImageFormatFlags")
    public int flags() { return nflags(address()); }

    // -----------------------------------

    /** Returns a new {@code VkSparseImageFormatProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSparseImageFormatProperties malloc() {
        return wrap(VkSparseImageFormatProperties.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSparseImageFormatProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSparseImageFormatProperties calloc() {
        return wrap(VkSparseImageFormatProperties.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSparseImageFormatProperties} instance allocated with {@link BufferUtils}. */
    public static VkSparseImageFormatProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSparseImageFormatProperties.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSparseImageFormatProperties} instance for the specified memory address. */
    public static VkSparseImageFormatProperties create(long address) {
        return wrap(VkSparseImageFormatProperties.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSparseImageFormatProperties createSafe(long address) {
        return address == NULL ? null : wrap(VkSparseImageFormatProperties.class, address);
    }

    /**
     * Returns a new {@link VkSparseImageFormatProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSparseImageFormatProperties.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSparseImageFormatProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSparseImageFormatProperties.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSparseImageFormatProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSparseImageFormatProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSparseImageFormatProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSparseImageFormatProperties.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSparseImageFormatProperties.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkSparseImageFormatProperties} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkSparseImageFormatProperties mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkSparseImageFormatProperties} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkSparseImageFormatProperties callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkSparseImageFormatProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSparseImageFormatProperties mallocStack(MemoryStack stack) {
        return wrap(VkSparseImageFormatProperties.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSparseImageFormatProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSparseImageFormatProperties callocStack(MemoryStack stack) {
        return wrap(VkSparseImageFormatProperties.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSparseImageFormatProperties.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSparseImageFormatProperties.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSparseImageFormatProperties.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkSparseImageFormatProperties.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSparseImageFormatProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSparseImageFormatProperties.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSparseImageFormatProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSparseImageFormatProperties.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #aspectMask}. */
    public static int naspectMask(long struct) { return UNSAFE.getInt(null, struct + VkSparseImageFormatProperties.ASPECTMASK); }
    /** Unsafe version of {@link #imageGranularity}. */
    public static VkExtent3D nimageGranularity(long struct) { return VkExtent3D.create(struct + VkSparseImageFormatProperties.IMAGEGRANULARITY); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkSparseImageFormatProperties.FLAGS); }

    // -----------------------------------

    /** An array of {@link VkSparseImageFormatProperties} structs. */
    public static class Buffer extends StructBuffer<VkSparseImageFormatProperties, Buffer> implements NativeResource {

        private static final VkSparseImageFormatProperties ELEMENT_FACTORY = VkSparseImageFormatProperties.create(-1L);

        /**
         * Creates a new {@code VkSparseImageFormatProperties.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSparseImageFormatProperties#SIZEOF}, and its mark will be undefined.
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
        protected VkSparseImageFormatProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code aspectMask} field. */
        @NativeType("VkImageAspectFlags")
        public int aspectMask() { return VkSparseImageFormatProperties.naspectMask(address()); }
        /** Returns a {@link VkExtent3D} view of the {@code imageGranularity} field. */
        public VkExtent3D imageGranularity() { return VkSparseImageFormatProperties.nimageGranularity(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkSparseImageFormatFlags")
        public int flags() { return VkSparseImageFormatProperties.nflags(address()); }

    }

}