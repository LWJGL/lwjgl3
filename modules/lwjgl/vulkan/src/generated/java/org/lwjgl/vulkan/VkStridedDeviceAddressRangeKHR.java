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
 * struct VkStridedDeviceAddressRangeKHR {
 *     VkDeviceAddress address;
 *     VkDeviceSize size;
 *     VkDeviceSize stride;
 * }}</pre>
 */
public class VkStridedDeviceAddressRangeKHR extends Struct<VkStridedDeviceAddressRangeKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ADDRESS,
        SIZE,
        STRIDE;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ADDRESS = layout.offsetof(0);
        SIZE = layout.offsetof(1);
        STRIDE = layout.offsetof(2);
    }

    protected VkStridedDeviceAddressRangeKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkStridedDeviceAddressRangeKHR create(long address, @Nullable ByteBuffer container) {
        return new VkStridedDeviceAddressRangeKHR(address, container);
    }

    /**
     * Creates a {@code VkStridedDeviceAddressRangeKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkStridedDeviceAddressRangeKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code address} field. */
    @NativeType("VkDeviceAddress")
    public long address$() { return naddress$(address()); }
    /** @return the value of the {@code size} field. */
    @NativeType("VkDeviceSize")
    public long size() { return nsize(address()); }
    /** @return the value of the {@code stride} field. */
    @NativeType("VkDeviceSize")
    public long stride() { return nstride(address()); }

    /** Sets the specified value to the {@code address} field. */
    public VkStridedDeviceAddressRangeKHR address$(@NativeType("VkDeviceAddress") long value) { naddress$(address(), value); return this; }
    /** Sets the specified value to the {@code size} field. */
    public VkStridedDeviceAddressRangeKHR size(@NativeType("VkDeviceSize") long value) { nsize(address(), value); return this; }
    /** Sets the specified value to the {@code stride} field. */
    public VkStridedDeviceAddressRangeKHR stride(@NativeType("VkDeviceSize") long value) { nstride(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkStridedDeviceAddressRangeKHR set(
        long address$,
        long size,
        long stride
    ) {
        address$(address$);
        size(size);
        stride(stride);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkStridedDeviceAddressRangeKHR set(VkStridedDeviceAddressRangeKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkStridedDeviceAddressRangeKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkStridedDeviceAddressRangeKHR malloc() {
        return new VkStridedDeviceAddressRangeKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkStridedDeviceAddressRangeKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkStridedDeviceAddressRangeKHR calloc() {
        return new VkStridedDeviceAddressRangeKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkStridedDeviceAddressRangeKHR} instance allocated with {@link BufferUtils}. */
    public static VkStridedDeviceAddressRangeKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkStridedDeviceAddressRangeKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkStridedDeviceAddressRangeKHR} instance for the specified memory address. */
    public static VkStridedDeviceAddressRangeKHR create(long address) {
        return new VkStridedDeviceAddressRangeKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkStridedDeviceAddressRangeKHR createSafe(long address) {
        return address == NULL ? null : new VkStridedDeviceAddressRangeKHR(address, null);
    }

    /**
     * Returns a new {@link VkStridedDeviceAddressRangeKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkStridedDeviceAddressRangeKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkStridedDeviceAddressRangeKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkStridedDeviceAddressRangeKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkStridedDeviceAddressRangeKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkStridedDeviceAddressRangeKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkStridedDeviceAddressRangeKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkStridedDeviceAddressRangeKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkStridedDeviceAddressRangeKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkStridedDeviceAddressRangeKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkStridedDeviceAddressRangeKHR malloc(MemoryStack stack) {
        return new VkStridedDeviceAddressRangeKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkStridedDeviceAddressRangeKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkStridedDeviceAddressRangeKHR calloc(MemoryStack stack) {
        return new VkStridedDeviceAddressRangeKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkStridedDeviceAddressRangeKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkStridedDeviceAddressRangeKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkStridedDeviceAddressRangeKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkStridedDeviceAddressRangeKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #address$}. */
    public static long naddress$(long struct) { return memGetLong(struct + VkStridedDeviceAddressRangeKHR.ADDRESS); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetLong(struct + VkStridedDeviceAddressRangeKHR.SIZE); }
    /** Unsafe version of {@link #stride}. */
    public static long nstride(long struct) { return memGetLong(struct + VkStridedDeviceAddressRangeKHR.STRIDE); }

    /** Unsafe version of {@link #address$(long) address$}. */
    public static void naddress$(long struct, long value) { memPutLong(struct + VkStridedDeviceAddressRangeKHR.ADDRESS, value); }
    /** Unsafe version of {@link #size(long) size}. */
    public static void nsize(long struct, long value) { memPutLong(struct + VkStridedDeviceAddressRangeKHR.SIZE, value); }
    /** Unsafe version of {@link #stride(long) stride}. */
    public static void nstride(long struct, long value) { memPutLong(struct + VkStridedDeviceAddressRangeKHR.STRIDE, value); }

    // -----------------------------------

    /** An array of {@link VkStridedDeviceAddressRangeKHR} structs. */
    public static class Buffer extends StructBuffer<VkStridedDeviceAddressRangeKHR, Buffer> implements NativeResource {

        private static final VkStridedDeviceAddressRangeKHR ELEMENT_FACTORY = VkStridedDeviceAddressRangeKHR.create(-1L);

        /**
         * Creates a new {@code VkStridedDeviceAddressRangeKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkStridedDeviceAddressRangeKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkStridedDeviceAddressRangeKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code address} field. */
        @NativeType("VkDeviceAddress")
        public long address$() { return VkStridedDeviceAddressRangeKHR.naddress$(address()); }
        /** @return the value of the {@code size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VkStridedDeviceAddressRangeKHR.nsize(address()); }
        /** @return the value of the {@code stride} field. */
        @NativeType("VkDeviceSize")
        public long stride() { return VkStridedDeviceAddressRangeKHR.nstride(address()); }

        /** Sets the specified value to the {@code address} field. */
        public VkStridedDeviceAddressRangeKHR.Buffer address$(@NativeType("VkDeviceAddress") long value) { VkStridedDeviceAddressRangeKHR.naddress$(address(), value); return this; }
        /** Sets the specified value to the {@code size} field. */
        public VkStridedDeviceAddressRangeKHR.Buffer size(@NativeType("VkDeviceSize") long value) { VkStridedDeviceAddressRangeKHR.nsize(address(), value); return this; }
        /** Sets the specified value to the {@code stride} field. */
        public VkStridedDeviceAddressRangeKHR.Buffer stride(@NativeType("VkDeviceSize") long value) { VkStridedDeviceAddressRangeKHR.nstride(address(), value); return this; }

    }

}