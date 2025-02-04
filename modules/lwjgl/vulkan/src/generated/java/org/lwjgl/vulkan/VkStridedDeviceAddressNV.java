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
 * struct VkStridedDeviceAddressNV {
 *     VkDeviceAddress startAddress;
 *     VkDeviceSize strideInBytes;
 * }}</pre>
 */
public class VkStridedDeviceAddressNV extends Struct<VkStridedDeviceAddressNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STARTADDRESS,
        STRIDEINBYTES;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STARTADDRESS = layout.offsetof(0);
        STRIDEINBYTES = layout.offsetof(1);
    }

    protected VkStridedDeviceAddressNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkStridedDeviceAddressNV create(long address, @Nullable ByteBuffer container) {
        return new VkStridedDeviceAddressNV(address, container);
    }

    /**
     * Creates a {@code VkStridedDeviceAddressNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkStridedDeviceAddressNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code startAddress} field. */
    @NativeType("VkDeviceAddress")
    public long startAddress() { return nstartAddress(address()); }
    /** @return the value of the {@code strideInBytes} field. */
    @NativeType("VkDeviceSize")
    public long strideInBytes() { return nstrideInBytes(address()); }

    /** Sets the specified value to the {@code startAddress} field. */
    public VkStridedDeviceAddressNV startAddress(@NativeType("VkDeviceAddress") long value) { nstartAddress(address(), value); return this; }
    /** Sets the specified value to the {@code strideInBytes} field. */
    public VkStridedDeviceAddressNV strideInBytes(@NativeType("VkDeviceSize") long value) { nstrideInBytes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkStridedDeviceAddressNV set(
        long startAddress,
        long strideInBytes
    ) {
        startAddress(startAddress);
        strideInBytes(strideInBytes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkStridedDeviceAddressNV set(VkStridedDeviceAddressNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkStridedDeviceAddressNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkStridedDeviceAddressNV malloc() {
        return new VkStridedDeviceAddressNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkStridedDeviceAddressNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkStridedDeviceAddressNV calloc() {
        return new VkStridedDeviceAddressNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkStridedDeviceAddressNV} instance allocated with {@link BufferUtils}. */
    public static VkStridedDeviceAddressNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkStridedDeviceAddressNV(memAddress(container), container);
    }

    /** Returns a new {@code VkStridedDeviceAddressNV} instance for the specified memory address. */
    public static VkStridedDeviceAddressNV create(long address) {
        return new VkStridedDeviceAddressNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkStridedDeviceAddressNV createSafe(long address) {
        return address == NULL ? null : new VkStridedDeviceAddressNV(address, null);
    }

    /**
     * Returns a new {@link VkStridedDeviceAddressNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkStridedDeviceAddressNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkStridedDeviceAddressNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkStridedDeviceAddressNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkStridedDeviceAddressNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkStridedDeviceAddressNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkStridedDeviceAddressNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkStridedDeviceAddressNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkStridedDeviceAddressNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkStridedDeviceAddressNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkStridedDeviceAddressNV malloc(MemoryStack stack) {
        return new VkStridedDeviceAddressNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkStridedDeviceAddressNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkStridedDeviceAddressNV calloc(MemoryStack stack) {
        return new VkStridedDeviceAddressNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkStridedDeviceAddressNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkStridedDeviceAddressNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkStridedDeviceAddressNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkStridedDeviceAddressNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #startAddress}. */
    public static long nstartAddress(long struct) { return memGetLong(struct + VkStridedDeviceAddressNV.STARTADDRESS); }
    /** Unsafe version of {@link #strideInBytes}. */
    public static long nstrideInBytes(long struct) { return memGetLong(struct + VkStridedDeviceAddressNV.STRIDEINBYTES); }

    /** Unsafe version of {@link #startAddress(long) startAddress}. */
    public static void nstartAddress(long struct, long value) { memPutLong(struct + VkStridedDeviceAddressNV.STARTADDRESS, value); }
    /** Unsafe version of {@link #strideInBytes(long) strideInBytes}. */
    public static void nstrideInBytes(long struct, long value) { memPutLong(struct + VkStridedDeviceAddressNV.STRIDEINBYTES, value); }

    // -----------------------------------

    /** An array of {@link VkStridedDeviceAddressNV} structs. */
    public static class Buffer extends StructBuffer<VkStridedDeviceAddressNV, Buffer> implements NativeResource {

        private static final VkStridedDeviceAddressNV ELEMENT_FACTORY = VkStridedDeviceAddressNV.create(-1L);

        /**
         * Creates a new {@code VkStridedDeviceAddressNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkStridedDeviceAddressNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkStridedDeviceAddressNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code startAddress} field. */
        @NativeType("VkDeviceAddress")
        public long startAddress() { return VkStridedDeviceAddressNV.nstartAddress(address()); }
        /** @return the value of the {@code strideInBytes} field. */
        @NativeType("VkDeviceSize")
        public long strideInBytes() { return VkStridedDeviceAddressNV.nstrideInBytes(address()); }

        /** Sets the specified value to the {@code startAddress} field. */
        public VkStridedDeviceAddressNV.Buffer startAddress(@NativeType("VkDeviceAddress") long value) { VkStridedDeviceAddressNV.nstartAddress(address(), value); return this; }
        /** Sets the specified value to the {@code strideInBytes} field. */
        public VkStridedDeviceAddressNV.Buffer strideInBytes(@NativeType("VkDeviceSize") long value) { VkStridedDeviceAddressNV.nstrideInBytes(address(), value); return this; }

    }

}