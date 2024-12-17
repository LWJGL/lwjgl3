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
 * <pre>{@code
 * struct VkQueueFamilyProperties {
 *     VkQueueFlags queueFlags;
 *     uint32_t queueCount;
 *     uint32_t timestampValidBits;
 *     {@link VkExtent3D VkExtent3D} minImageTransferGranularity;
 * }}</pre>
 */
public class VkQueueFamilyProperties extends Struct<VkQueueFamilyProperties> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        QUEUEFLAGS,
        QUEUECOUNT,
        TIMESTAMPVALIDBITS,
        MINIMAGETRANSFERGRANULARITY;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(VkExtent3D.SIZEOF, VkExtent3D.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        QUEUEFLAGS = layout.offsetof(0);
        QUEUECOUNT = layout.offsetof(1);
        TIMESTAMPVALIDBITS = layout.offsetof(2);
        MINIMAGETRANSFERGRANULARITY = layout.offsetof(3);
    }

    protected VkQueueFamilyProperties(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkQueueFamilyProperties create(long address, @Nullable ByteBuffer container) {
        return new VkQueueFamilyProperties(address, container);
    }

    /**
     * Creates a {@code VkQueueFamilyProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkQueueFamilyProperties(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code queueFlags} field. */
    @NativeType("VkQueueFlags")
    public int queueFlags() { return nqueueFlags(address()); }
    /** @return the value of the {@code queueCount} field. */
    @NativeType("uint32_t")
    public int queueCount() { return nqueueCount(address()); }
    /** @return the value of the {@code timestampValidBits} field. */
    @NativeType("uint32_t")
    public int timestampValidBits() { return ntimestampValidBits(address()); }
    /** @return a {@link VkExtent3D} view of the {@code minImageTransferGranularity} field. */
    public VkExtent3D minImageTransferGranularity() { return nminImageTransferGranularity(address()); }

    // -----------------------------------

    /** Returns a new {@code VkQueueFamilyProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkQueueFamilyProperties malloc() {
        return new VkQueueFamilyProperties(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkQueueFamilyProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkQueueFamilyProperties calloc() {
        return new VkQueueFamilyProperties(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkQueueFamilyProperties} instance allocated with {@link BufferUtils}. */
    public static VkQueueFamilyProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkQueueFamilyProperties(memAddress(container), container);
    }

    /** Returns a new {@code VkQueueFamilyProperties} instance for the specified memory address. */
    public static VkQueueFamilyProperties create(long address) {
        return new VkQueueFamilyProperties(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkQueueFamilyProperties createSafe(long address) {
        return address == NULL ? null : new VkQueueFamilyProperties(address, null);
    }

    /**
     * Returns a new {@link VkQueueFamilyProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyProperties.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyProperties.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkQueueFamilyProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyProperties.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkQueueFamilyProperties.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkQueueFamilyProperties mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkQueueFamilyProperties callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkQueueFamilyProperties mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkQueueFamilyProperties callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkQueueFamilyProperties.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkQueueFamilyProperties.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkQueueFamilyProperties.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkQueueFamilyProperties.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkQueueFamilyProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueueFamilyProperties malloc(MemoryStack stack) {
        return new VkQueueFamilyProperties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkQueueFamilyProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueueFamilyProperties calloc(MemoryStack stack) {
        return new VkQueueFamilyProperties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkQueueFamilyProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyProperties.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyProperties.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #queueFlags}. */
    public static int nqueueFlags(long struct) { return memGetInt(struct + VkQueueFamilyProperties.QUEUEFLAGS); }
    /** Unsafe version of {@link #queueCount}. */
    public static int nqueueCount(long struct) { return memGetInt(struct + VkQueueFamilyProperties.QUEUECOUNT); }
    /** Unsafe version of {@link #timestampValidBits}. */
    public static int ntimestampValidBits(long struct) { return memGetInt(struct + VkQueueFamilyProperties.TIMESTAMPVALIDBITS); }
    /** Unsafe version of {@link #minImageTransferGranularity}. */
    public static VkExtent3D nminImageTransferGranularity(long struct) { return VkExtent3D.create(struct + VkQueueFamilyProperties.MINIMAGETRANSFERGRANULARITY); }

    // -----------------------------------

    /** An array of {@link VkQueueFamilyProperties} structs. */
    public static class Buffer extends StructBuffer<VkQueueFamilyProperties, Buffer> implements NativeResource {

        private static final VkQueueFamilyProperties ELEMENT_FACTORY = VkQueueFamilyProperties.create(-1L);

        /**
         * Creates a new {@code VkQueueFamilyProperties.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkQueueFamilyProperties#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkQueueFamilyProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code queueFlags} field. */
        @NativeType("VkQueueFlags")
        public int queueFlags() { return VkQueueFamilyProperties.nqueueFlags(address()); }
        /** @return the value of the {@code queueCount} field. */
        @NativeType("uint32_t")
        public int queueCount() { return VkQueueFamilyProperties.nqueueCount(address()); }
        /** @return the value of the {@code timestampValidBits} field. */
        @NativeType("uint32_t")
        public int timestampValidBits() { return VkQueueFamilyProperties.ntimestampValidBits(address()); }
        /** @return a {@link VkExtent3D} view of the {@code minImageTransferGranularity} field. */
        public VkExtent3D minImageTransferGranularity() { return VkQueueFamilyProperties.nminImageTransferGranularity(address()); }

    }

}