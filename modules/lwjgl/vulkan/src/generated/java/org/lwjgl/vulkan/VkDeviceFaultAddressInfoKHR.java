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
 * struct VkDeviceFaultAddressInfoKHR {
 *     VkDeviceFaultAddressTypeKHR addressType;
 *     VkDeviceAddress reportedAddress;
 *     VkDeviceSize addressPrecision;
 * }}</pre>
 */
public class VkDeviceFaultAddressInfoKHR extends Struct<VkDeviceFaultAddressInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ADDRESSTYPE,
        REPORTEDADDRESS,
        ADDRESSPRECISION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ADDRESSTYPE = layout.offsetof(0);
        REPORTEDADDRESS = layout.offsetof(1);
        ADDRESSPRECISION = layout.offsetof(2);
    }

    protected VkDeviceFaultAddressInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDeviceFaultAddressInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkDeviceFaultAddressInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkDeviceFaultAddressInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceFaultAddressInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code addressType} field. */
    @NativeType("VkDeviceFaultAddressTypeKHR")
    public int addressType() { return naddressType(address()); }
    /** @return the value of the {@code reportedAddress} field. */
    @NativeType("VkDeviceAddress")
    public long reportedAddress() { return nreportedAddress(address()); }
    /** @return the value of the {@code addressPrecision} field. */
    @NativeType("VkDeviceSize")
    public long addressPrecision() { return naddressPrecision(address()); }

    // -----------------------------------

    /** Returns a new {@code VkDeviceFaultAddressInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceFaultAddressInfoKHR malloc() {
        return new VkDeviceFaultAddressInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceFaultAddressInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceFaultAddressInfoKHR calloc() {
        return new VkDeviceFaultAddressInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceFaultAddressInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkDeviceFaultAddressInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceFaultAddressInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceFaultAddressInfoKHR} instance for the specified memory address. */
    public static VkDeviceFaultAddressInfoKHR create(long address) {
        return new VkDeviceFaultAddressInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDeviceFaultAddressInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkDeviceFaultAddressInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkDeviceFaultAddressInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultAddressInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceFaultAddressInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultAddressInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceFaultAddressInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultAddressInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDeviceFaultAddressInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultAddressInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDeviceFaultAddressInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDeviceFaultAddressInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceFaultAddressInfoKHR malloc(MemoryStack stack) {
        return new VkDeviceFaultAddressInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDeviceFaultAddressInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceFaultAddressInfoKHR calloc(MemoryStack stack) {
        return new VkDeviceFaultAddressInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDeviceFaultAddressInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultAddressInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceFaultAddressInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultAddressInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #addressType}. */
    public static int naddressType(long struct) { return memGetInt(struct + VkDeviceFaultAddressInfoKHR.ADDRESSTYPE); }
    /** Unsafe version of {@link #reportedAddress}. */
    public static long nreportedAddress(long struct) { return memGetLong(struct + VkDeviceFaultAddressInfoKHR.REPORTEDADDRESS); }
    /** Unsafe version of {@link #addressPrecision}. */
    public static long naddressPrecision(long struct) { return memGetLong(struct + VkDeviceFaultAddressInfoKHR.ADDRESSPRECISION); }

    // -----------------------------------

    /** An array of {@link VkDeviceFaultAddressInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkDeviceFaultAddressInfoKHR, Buffer> implements NativeResource {

        private static final VkDeviceFaultAddressInfoKHR ELEMENT_FACTORY = VkDeviceFaultAddressInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkDeviceFaultAddressInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceFaultAddressInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDeviceFaultAddressInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code addressType} field. */
        @NativeType("VkDeviceFaultAddressTypeKHR")
        public int addressType() { return VkDeviceFaultAddressInfoKHR.naddressType(address()); }
        /** @return the value of the {@code reportedAddress} field. */
        @NativeType("VkDeviceAddress")
        public long reportedAddress() { return VkDeviceFaultAddressInfoKHR.nreportedAddress(address()); }
        /** @return the value of the {@code addressPrecision} field. */
        @NativeType("VkDeviceSize")
        public long addressPrecision() { return VkDeviceFaultAddressInfoKHR.naddressPrecision(address()); }

    }

}