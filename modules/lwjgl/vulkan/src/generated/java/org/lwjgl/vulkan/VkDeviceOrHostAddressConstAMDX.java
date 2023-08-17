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
 * Union specifying a const device or host address.
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDispatchGraphCountInfoAMDX}, {@link VkDispatchGraphInfoAMDX}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * union VkDeviceOrHostAddressConstAMDX {
 *     VkDeviceAddress {@link #deviceAddress};
 *     void const * {@link #hostAddress};
 * }</code></pre>
 */
public class VkDeviceOrHostAddressConstAMDX extends Struct<VkDeviceOrHostAddressConstAMDX> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DEVICEADDRESS,
        HOSTADDRESS;

    static {
        Layout layout = __union(
            __member(8),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DEVICEADDRESS = layout.offsetof(0);
        HOSTADDRESS = layout.offsetof(1);
    }

    protected VkDeviceOrHostAddressConstAMDX(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDeviceOrHostAddressConstAMDX create(long address, @Nullable ByteBuffer container) {
        return new VkDeviceOrHostAddressConstAMDX(address, container);
    }

    /**
     * Creates a {@code VkDeviceOrHostAddressConstAMDX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceOrHostAddressConstAMDX(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a buffer device address as returned by the {@link KHRBufferDeviceAddress#vkGetBufferDeviceAddressKHR GetBufferDeviceAddressKHR} command. */
    @NativeType("VkDeviceAddress")
    public long deviceAddress() { return ndeviceAddress(address()); }
    /** a const host memory address. */
    @NativeType("void const *")
    public long hostAddress() { return nhostAddress(address()); }

    /** Sets the specified value to the {@link #deviceAddress} field. */
    public VkDeviceOrHostAddressConstAMDX deviceAddress(@NativeType("VkDeviceAddress") long value) { ndeviceAddress(address(), value); return this; }
    /** Sets the specified value to the {@link #hostAddress} field. */
    public VkDeviceOrHostAddressConstAMDX hostAddress(@NativeType("void const *") long value) { nhostAddress(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceOrHostAddressConstAMDX set(VkDeviceOrHostAddressConstAMDX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceOrHostAddressConstAMDX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceOrHostAddressConstAMDX malloc() {
        return new VkDeviceOrHostAddressConstAMDX(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceOrHostAddressConstAMDX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceOrHostAddressConstAMDX calloc() {
        return new VkDeviceOrHostAddressConstAMDX(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceOrHostAddressConstAMDX} instance allocated with {@link BufferUtils}. */
    public static VkDeviceOrHostAddressConstAMDX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceOrHostAddressConstAMDX(memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceOrHostAddressConstAMDX} instance for the specified memory address. */
    public static VkDeviceOrHostAddressConstAMDX create(long address) {
        return new VkDeviceOrHostAddressConstAMDX(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceOrHostAddressConstAMDX createSafe(long address) {
        return address == NULL ? null : new VkDeviceOrHostAddressConstAMDX(address, null);
    }

    /**
     * Returns a new {@link VkDeviceOrHostAddressConstAMDX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceOrHostAddressConstAMDX.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceOrHostAddressConstAMDX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceOrHostAddressConstAMDX.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceOrHostAddressConstAMDX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceOrHostAddressConstAMDX.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDeviceOrHostAddressConstAMDX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceOrHostAddressConstAMDX.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceOrHostAddressConstAMDX.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDeviceOrHostAddressConstAMDX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceOrHostAddressConstAMDX malloc(MemoryStack stack) {
        return new VkDeviceOrHostAddressConstAMDX(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDeviceOrHostAddressConstAMDX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceOrHostAddressConstAMDX calloc(MemoryStack stack) {
        return new VkDeviceOrHostAddressConstAMDX(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDeviceOrHostAddressConstAMDX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceOrHostAddressConstAMDX.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceOrHostAddressConstAMDX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceOrHostAddressConstAMDX.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #deviceAddress}. */
    public static long ndeviceAddress(long struct) { return UNSAFE.getLong(null, struct + VkDeviceOrHostAddressConstAMDX.DEVICEADDRESS); }
    /** Unsafe version of {@link #hostAddress}. */
    public static long nhostAddress(long struct) { return memGetAddress(struct + VkDeviceOrHostAddressConstAMDX.HOSTADDRESS); }

    /** Unsafe version of {@link #deviceAddress(long) deviceAddress}. */
    public static void ndeviceAddress(long struct, long value) { UNSAFE.putLong(null, struct + VkDeviceOrHostAddressConstAMDX.DEVICEADDRESS, value); }
    /** Unsafe version of {@link #hostAddress(long) hostAddress}. */
    public static void nhostAddress(long struct, long value) { memPutAddress(struct + VkDeviceOrHostAddressConstAMDX.HOSTADDRESS, value); }

    // -----------------------------------

    /** An array of {@link VkDeviceOrHostAddressConstAMDX} structs. */
    public static class Buffer extends StructBuffer<VkDeviceOrHostAddressConstAMDX, Buffer> implements NativeResource {

        private static final VkDeviceOrHostAddressConstAMDX ELEMENT_FACTORY = VkDeviceOrHostAddressConstAMDX.create(-1L);

        /**
         * Creates a new {@code VkDeviceOrHostAddressConstAMDX.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceOrHostAddressConstAMDX#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDeviceOrHostAddressConstAMDX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDeviceOrHostAddressConstAMDX#deviceAddress} field. */
        @NativeType("VkDeviceAddress")
        public long deviceAddress() { return VkDeviceOrHostAddressConstAMDX.ndeviceAddress(address()); }
        /** @return the value of the {@link VkDeviceOrHostAddressConstAMDX#hostAddress} field. */
        @NativeType("void const *")
        public long hostAddress() { return VkDeviceOrHostAddressConstAMDX.nhostAddress(address()); }

        /** Sets the specified value to the {@link VkDeviceOrHostAddressConstAMDX#deviceAddress} field. */
        public VkDeviceOrHostAddressConstAMDX.Buffer deviceAddress(@NativeType("VkDeviceAddress") long value) { VkDeviceOrHostAddressConstAMDX.ndeviceAddress(address(), value); return this; }
        /** Sets the specified value to the {@link VkDeviceOrHostAddressConstAMDX#hostAddress} field. */
        public VkDeviceOrHostAddressConstAMDX.Buffer hostAddress(@NativeType("void const *") long value) { VkDeviceOrHostAddressConstAMDX.nhostAddress(address(), value); return this; }

    }

}