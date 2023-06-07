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
 * Structure specifying GPU virtual address information.
 * 
 * <h5>Description</h5>
 * 
 * <p>The combination of {@code reportedAddress} and {@code addressPrecision} allow the possible range of addresses to be calculated, such that:</p>
 * 
 * <pre><code>
 * lower_address = (pInfo-&gt;reportedAddress &amp; ~(pInfo-&gt;addressPrecision-1))
 * upper_address = (pInfo-&gt;reportedAddress |  (pInfo-&gt;addressPrecision-1))</code></pre>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>It is valid for the {@code reportedAddress} to contain a more precise address than indicated by {@code addressPrecision}. In this case, the value of {@code reportedAddress} should be treated as an additional hint as to the value of the address that triggered the page fault, or to the value of an instruction pointer.</p>
 * </div>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code addressType} <b>must</b> be a valid {@code VkDeviceFaultAddressTypeEXT} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDeviceFaultInfoEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDeviceFaultAddressInfoEXT {
 *     VkDeviceFaultAddressTypeEXT {@link #addressType};
 *     VkDeviceAddress {@link #reportedAddress};
 *     VkDeviceSize {@link #addressPrecision};
 * }</code></pre>
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

    /** either the type of memory operation that triggered a page fault, or the type of association between an instruction pointer and a fault. */
    @NativeType("VkDeviceFaultAddressTypeEXT")
    public int addressType() { return naddressType(address()); }
    /** the GPU virtual address recorded by the device. */
    @NativeType("VkDeviceAddress")
    public long reportedAddress() { return nreportedAddress(address()); }
    /** a power of two value that specifies how precisely the device can report the address. */
    @NativeType("VkDeviceSize")
    public long addressPrecision() { return naddressPrecision(address()); }

    /** Sets the specified value to the {@link #addressType} field. */
    public VkDeviceFaultAddressInfoEXT addressType(@NativeType("VkDeviceFaultAddressTypeEXT") int value) { naddressType(address(), value); return this; }
    /** Sets the specified value to the {@link #reportedAddress} field. */
    public VkDeviceFaultAddressInfoEXT reportedAddress(@NativeType("VkDeviceAddress") long value) { nreportedAddress(address(), value); return this; }
    /** Sets the specified value to the {@link #addressPrecision} field. */
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
    @Nullable
    public static VkDeviceFaultAddressInfoEXT createSafe(long address) {
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
    @Nullable
    public static VkDeviceFaultAddressInfoEXT.Buffer createSafe(long address, int capacity) {
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
    public static int naddressType(long struct) { return UNSAFE.getInt(null, struct + VkDeviceFaultAddressInfoEXT.ADDRESSTYPE); }
    /** Unsafe version of {@link #reportedAddress}. */
    public static long nreportedAddress(long struct) { return UNSAFE.getLong(null, struct + VkDeviceFaultAddressInfoEXT.REPORTEDADDRESS); }
    /** Unsafe version of {@link #addressPrecision}. */
    public static long naddressPrecision(long struct) { return UNSAFE.getLong(null, struct + VkDeviceFaultAddressInfoEXT.ADDRESSPRECISION); }

    /** Unsafe version of {@link #addressType(int) addressType}. */
    public static void naddressType(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceFaultAddressInfoEXT.ADDRESSTYPE, value); }
    /** Unsafe version of {@link #reportedAddress(long) reportedAddress}. */
    public static void nreportedAddress(long struct, long value) { UNSAFE.putLong(null, struct + VkDeviceFaultAddressInfoEXT.REPORTEDADDRESS, value); }
    /** Unsafe version of {@link #addressPrecision(long) addressPrecision}. */
    public static void naddressPrecision(long struct, long value) { UNSAFE.putLong(null, struct + VkDeviceFaultAddressInfoEXT.ADDRESSPRECISION, value); }

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
        protected VkDeviceFaultAddressInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDeviceFaultAddressInfoEXT#addressType} field. */
        @NativeType("VkDeviceFaultAddressTypeEXT")
        public int addressType() { return VkDeviceFaultAddressInfoEXT.naddressType(address()); }
        /** @return the value of the {@link VkDeviceFaultAddressInfoEXT#reportedAddress} field. */
        @NativeType("VkDeviceAddress")
        public long reportedAddress() { return VkDeviceFaultAddressInfoEXT.nreportedAddress(address()); }
        /** @return the value of the {@link VkDeviceFaultAddressInfoEXT#addressPrecision} field. */
        @NativeType("VkDeviceSize")
        public long addressPrecision() { return VkDeviceFaultAddressInfoEXT.naddressPrecision(address()); }

        /** Sets the specified value to the {@link VkDeviceFaultAddressInfoEXT#addressType} field. */
        public VkDeviceFaultAddressInfoEXT.Buffer addressType(@NativeType("VkDeviceFaultAddressTypeEXT") int value) { VkDeviceFaultAddressInfoEXT.naddressType(address(), value); return this; }
        /** Sets the specified value to the {@link VkDeviceFaultAddressInfoEXT#reportedAddress} field. */
        public VkDeviceFaultAddressInfoEXT.Buffer reportedAddress(@NativeType("VkDeviceAddress") long value) { VkDeviceFaultAddressInfoEXT.nreportedAddress(address(), value); return this; }
        /** Sets the specified value to the {@link VkDeviceFaultAddressInfoEXT#addressPrecision} field. */
        public VkDeviceFaultAddressInfoEXT.Buffer addressPrecision(@NativeType("VkDeviceSize") long value) { VkDeviceFaultAddressInfoEXT.naddressPrecision(address(), value); return this; }

    }

}