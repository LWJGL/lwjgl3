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
 * struct VkDeviceFaultAddressInfoEXT {
 *     VkDeviceFaultAddressTypeEXT addressType;
 *     VkDeviceAddress reportedAddress;
 *     VkDeviceSize addressPrecision;
 * }}</pre>
 */
public class VkDeviceFaultAddressInfoEXT extends Struct<VkDeviceFaultAddressInfoEXT> implements NativeResource {

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

    protected VkDeviceFaultAddressInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDeviceFaultAddressInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkDeviceFaultAddressInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkDeviceFaultAddressInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceFaultAddressInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code addressType} field. */
    @NativeType("VkDeviceFaultAddressTypeEXT")
    public int addressType() { return naddressType(address()); }
    /** @return the value of the {@code reportedAddress} field. */
    @NativeType("VkDeviceAddress")
    public long reportedAddress() { return nreportedAddress(address()); }
    /** @return the value of the {@code addressPrecision} field. */
    @NativeType("VkDeviceSize")
    public long addressPrecision() { return naddressPrecision(address()); }

    /** Sets the specified value to the {@code addressType} field. */
    public VkDeviceFaultAddressInfoEXT addressType(@NativeType("VkDeviceFaultAddressTypeEXT") int value) { naddressType(address(), value); return this; }
    /** Sets the specified value to the {@code reportedAddress} field. */
    public VkDeviceFaultAddressInfoEXT reportedAddress(@NativeType("VkDeviceAddress") long value) { nreportedAddress(address(), value); return this; }
    /** Sets the specified value to the {@code addressPrecision} field. */
    public VkDeviceFaultAddressInfoEXT addressPrecision(@NativeType("VkDeviceSize") long value) { naddressPrecision(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceFaultAddressInfoEXT set(
        int addressType,
        long reportedAddress,
        long addressPrecision
    ) {
        addressType(addressType);
        reportedAddress(reportedAddress);
        addressPrecision(addressPrecision);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceFaultAddressInfoEXT set(VkDeviceFaultAddressInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceFaultAddressInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceFaultAddressInfoEXT malloc() {
        return new VkDeviceFaultAddressInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceFaultAddressInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceFaultAddressInfoEXT calloc() {
        return new VkDeviceFaultAddressInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceFaultAddressInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkDeviceFaultAddressInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceFaultAddressInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceFaultAddressInfoEXT} instance for the specified memory address. */
    public static VkDeviceFaultAddressInfoEXT create(long address) {
        return new VkDeviceFaultAddressInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDeviceFaultAddressInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkDeviceFaultAddressInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkDeviceFaultAddressInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultAddressInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceFaultAddressInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultAddressInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceFaultAddressInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultAddressInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDeviceFaultAddressInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultAddressInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDeviceFaultAddressInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDeviceFaultAddressInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceFaultAddressInfoEXT malloc(MemoryStack stack) {
        return new VkDeviceFaultAddressInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDeviceFaultAddressInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceFaultAddressInfoEXT calloc(MemoryStack stack) {
        return new VkDeviceFaultAddressInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDeviceFaultAddressInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultAddressInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceFaultAddressInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultAddressInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #addressType}. */
    public static int naddressType(long struct) { return memGetInt(struct + VkDeviceFaultAddressInfoEXT.ADDRESSTYPE); }
    /** Unsafe version of {@link #reportedAddress}. */
    public static long nreportedAddress(long struct) { return memGetLong(struct + VkDeviceFaultAddressInfoEXT.REPORTEDADDRESS); }
    /** Unsafe version of {@link #addressPrecision}. */
    public static long naddressPrecision(long struct) { return memGetLong(struct + VkDeviceFaultAddressInfoEXT.ADDRESSPRECISION); }

    /** Unsafe version of {@link #addressType(int) addressType}. */
    public static void naddressType(long struct, int value) { memPutInt(struct + VkDeviceFaultAddressInfoEXT.ADDRESSTYPE, value); }
    /** Unsafe version of {@link #reportedAddress(long) reportedAddress}. */
    public static void nreportedAddress(long struct, long value) { memPutLong(struct + VkDeviceFaultAddressInfoEXT.REPORTEDADDRESS, value); }
    /** Unsafe version of {@link #addressPrecision(long) addressPrecision}. */
    public static void naddressPrecision(long struct, long value) { memPutLong(struct + VkDeviceFaultAddressInfoEXT.ADDRESSPRECISION, value); }

    // -----------------------------------

    /** An array of {@link VkDeviceFaultAddressInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkDeviceFaultAddressInfoEXT, Buffer> implements NativeResource {

        private static final VkDeviceFaultAddressInfoEXT ELEMENT_FACTORY = VkDeviceFaultAddressInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkDeviceFaultAddressInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceFaultAddressInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDeviceFaultAddressInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code addressType} field. */
        @NativeType("VkDeviceFaultAddressTypeEXT")
        public int addressType() { return VkDeviceFaultAddressInfoEXT.naddressType(address()); }
        /** @return the value of the {@code reportedAddress} field. */
        @NativeType("VkDeviceAddress")
        public long reportedAddress() { return VkDeviceFaultAddressInfoEXT.nreportedAddress(address()); }
        /** @return the value of the {@code addressPrecision} field. */
        @NativeType("VkDeviceSize")
        public long addressPrecision() { return VkDeviceFaultAddressInfoEXT.naddressPrecision(address()); }

        /** Sets the specified value to the {@code addressType} field. */
        public VkDeviceFaultAddressInfoEXT.Buffer addressType(@NativeType("VkDeviceFaultAddressTypeEXT") int value) { VkDeviceFaultAddressInfoEXT.naddressType(address(), value); return this; }
        /** Sets the specified value to the {@code reportedAddress} field. */
        public VkDeviceFaultAddressInfoEXT.Buffer reportedAddress(@NativeType("VkDeviceAddress") long value) { VkDeviceFaultAddressInfoEXT.nreportedAddress(address(), value); return this; }
        /** Sets the specified value to the {@code addressPrecision} field. */
        public VkDeviceFaultAddressInfoEXT.Buffer addressPrecision(@NativeType("VkDeviceSize") long value) { VkDeviceFaultAddressInfoEXT.naddressPrecision(address(), value); return this; }

    }

}