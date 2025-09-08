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
 * <pre><code>
 * struct VkImageFormatProperties {
 *     {@link VkExtent3D VkExtent3D} maxExtent;
 *     uint32_t maxMipLevels;
 *     uint32_t maxArrayLayers;
 *     VkSampleCountFlags sampleCounts;
 *     VkDeviceSize maxResourceSize;
 * }</code></pre>
 */
public class VkImageFormatProperties extends Struct<VkImageFormatProperties> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
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

    protected VkImageFormatProperties(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkImageFormatProperties create(long address, @Nullable ByteBuffer container) {
        return new VkImageFormatProperties(address, container);
    }

    /**
     * Creates a {@code VkImageFormatProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageFormatProperties(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link VkExtent3D} view of the {@code maxExtent} field. */
    public VkExtent3D maxExtent() { return nmaxExtent(address()); }
    /** @return the value of the {@code maxMipLevels} field. */
    @NativeType("uint32_t")
    public int maxMipLevels() { return nmaxMipLevels(address()); }
    /** @return the value of the {@code maxArrayLayers} field. */
    @NativeType("uint32_t")
    public int maxArrayLayers() { return nmaxArrayLayers(address()); }
    /** @return the value of the {@code sampleCounts} field. */
    @NativeType("VkSampleCountFlags")
    public int sampleCounts() { return nsampleCounts(address()); }
    /** @return the value of the {@code maxResourceSize} field. */
    @NativeType("VkDeviceSize")
    public long maxResourceSize() { return nmaxResourceSize(address()); }

    // -----------------------------------

    /** Returns a new {@code VkImageFormatProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageFormatProperties malloc() {
        return new VkImageFormatProperties(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkImageFormatProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageFormatProperties calloc() {
        return new VkImageFormatProperties(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkImageFormatProperties} instance allocated with {@link BufferUtils}. */
    public static VkImageFormatProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageFormatProperties(memAddress(container), container);
    }

    /** Returns a new {@code VkImageFormatProperties} instance for the specified memory address. */
    public static VkImageFormatProperties create(long address) {
        return new VkImageFormatProperties(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkImageFormatProperties createSafe(long address) {
        return address == NULL ? null : new VkImageFormatProperties(address, null);
    }

    /**
     * Returns a new {@link VkImageFormatProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageFormatProperties.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageFormatProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageFormatProperties.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageFormatProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageFormatProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
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
    public static VkImageFormatProperties.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageFormatProperties mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageFormatProperties callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageFormatProperties mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageFormatProperties callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageFormatProperties.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageFormatProperties.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageFormatProperties.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageFormatProperties.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkImageFormatProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageFormatProperties malloc(MemoryStack stack) {
        return new VkImageFormatProperties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkImageFormatProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageFormatProperties calloc(MemoryStack stack) {
        return new VkImageFormatProperties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkImageFormatProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageFormatProperties.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageFormatProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageFormatProperties.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
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

        private static final VkImageFormatProperties ELEMENT_FACTORY = VkImageFormatProperties.create(-1L);

        /**
         * Creates a new {@code VkImageFormatProperties.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageFormatProperties#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkImageFormatProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link VkExtent3D} view of the {@code maxExtent} field. */
        public VkExtent3D maxExtent() { return VkImageFormatProperties.nmaxExtent(address()); }
        /** @return the value of the {@code maxMipLevels} field. */
        @NativeType("uint32_t")
        public int maxMipLevels() { return VkImageFormatProperties.nmaxMipLevels(address()); }
        /** @return the value of the {@code maxArrayLayers} field. */
        @NativeType("uint32_t")
        public int maxArrayLayers() { return VkImageFormatProperties.nmaxArrayLayers(address()); }
        /** @return the value of the {@code sampleCounts} field. */
        @NativeType("VkSampleCountFlags")
        public int sampleCounts() { return VkImageFormatProperties.nsampleCounts(address()); }
        /** @return the value of the {@code maxResourceSize} field. */
        @NativeType("VkDeviceSize")
        public long maxResourceSize() { return VkImageFormatProperties.nmaxResourceSize(address()); }

    }

}