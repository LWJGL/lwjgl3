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
 * Union specifying a device or host address.
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkAccelerationStructureBuildGeometryInfoKHR}, {@link VkCopyAccelerationStructureToMemoryInfoKHR}, {@link VkCopyMicromapToMemoryInfoEXT}, {@link VkMicromapBuildInfoEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * union VkDeviceOrHostAddressKHR {
 *     VkDeviceAddress {@link #deviceAddress};
 *     void * {@link #hostAddress};
 * }</code></pre>
 */
public class VkDeviceOrHostAddressKHR extends Struct<VkDeviceOrHostAddressKHR> implements NativeResource {

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

    protected VkDeviceOrHostAddressKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDeviceOrHostAddressKHR create(long address, @Nullable ByteBuffer container) {
        return new VkDeviceOrHostAddressKHR(address, container);
    }

    /**
     * Creates a {@code VkDeviceOrHostAddressKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceOrHostAddressKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a buffer device address as returned by the {@link KHRBufferDeviceAddress#vkGetBufferDeviceAddressKHR GetBufferDeviceAddressKHR} command. */
    @NativeType("VkDeviceAddress")
    public long deviceAddress() { return ndeviceAddress(address()); }
    /** a host memory address. */
    @NativeType("void *")
    public long hostAddress() { return nhostAddress(address()); }

    /** Sets the specified value to the {@link #deviceAddress} field. */
    public VkDeviceOrHostAddressKHR deviceAddress(@NativeType("VkDeviceAddress") long value) { ndeviceAddress(address(), value); return this; }
    /** Sets the specified value to the {@link #hostAddress} field. */
    public VkDeviceOrHostAddressKHR hostAddress(@NativeType("void *") long value) { nhostAddress(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceOrHostAddressKHR set(VkDeviceOrHostAddressKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceOrHostAddressKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceOrHostAddressKHR malloc() {
        return new VkDeviceOrHostAddressKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceOrHostAddressKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceOrHostAddressKHR calloc() {
        return new VkDeviceOrHostAddressKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceOrHostAddressKHR} instance allocated with {@link BufferUtils}. */
    public static VkDeviceOrHostAddressKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceOrHostAddressKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceOrHostAddressKHR} instance for the specified memory address. */
    public static VkDeviceOrHostAddressKHR create(long address) {
        return new VkDeviceOrHostAddressKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDeviceOrHostAddressKHR createSafe(long address) {
        return address == NULL ? null : new VkDeviceOrHostAddressKHR(address, null);
    }

    /**
     * Returns a new {@link VkDeviceOrHostAddressKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceOrHostAddressKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceOrHostAddressKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceOrHostAddressKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceOrHostAddressKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceOrHostAddressKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDeviceOrHostAddressKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceOrHostAddressKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDeviceOrHostAddressKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDeviceOrHostAddressKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceOrHostAddressKHR malloc(MemoryStack stack) {
        return new VkDeviceOrHostAddressKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDeviceOrHostAddressKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceOrHostAddressKHR calloc(MemoryStack stack) {
        return new VkDeviceOrHostAddressKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDeviceOrHostAddressKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceOrHostAddressKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceOrHostAddressKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceOrHostAddressKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #deviceAddress}. */
    public static long ndeviceAddress(long struct) { return memGetLong(struct + VkDeviceOrHostAddressKHR.DEVICEADDRESS); }
    /** Unsafe version of {@link #hostAddress}. */
    public static long nhostAddress(long struct) { return memGetAddress(struct + VkDeviceOrHostAddressKHR.HOSTADDRESS); }

    /** Unsafe version of {@link #deviceAddress(long) deviceAddress}. */
    public static void ndeviceAddress(long struct, long value) { memPutLong(struct + VkDeviceOrHostAddressKHR.DEVICEADDRESS, value); }
    /** Unsafe version of {@link #hostAddress(long) hostAddress}. */
    public static void nhostAddress(long struct, long value) { memPutAddress(struct + VkDeviceOrHostAddressKHR.HOSTADDRESS, value); }

    // -----------------------------------

    /** An array of {@link VkDeviceOrHostAddressKHR} structs. */
    public static class Buffer extends StructBuffer<VkDeviceOrHostAddressKHR, Buffer> implements NativeResource {

        private static final VkDeviceOrHostAddressKHR ELEMENT_FACTORY = VkDeviceOrHostAddressKHR.create(-1L);

        /**
         * Creates a new {@code VkDeviceOrHostAddressKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceOrHostAddressKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDeviceOrHostAddressKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDeviceOrHostAddressKHR#deviceAddress} field. */
        @NativeType("VkDeviceAddress")
        public long deviceAddress() { return VkDeviceOrHostAddressKHR.ndeviceAddress(address()); }
        /** @return the value of the {@link VkDeviceOrHostAddressKHR#hostAddress} field. */
        @NativeType("void *")
        public long hostAddress() { return VkDeviceOrHostAddressKHR.nhostAddress(address()); }

        /** Sets the specified value to the {@link VkDeviceOrHostAddressKHR#deviceAddress} field. */
        public VkDeviceOrHostAddressKHR.Buffer deviceAddress(@NativeType("VkDeviceAddress") long value) { VkDeviceOrHostAddressKHR.ndeviceAddress(address(), value); return this; }
        /** Sets the specified value to the {@link VkDeviceOrHostAddressKHR#hostAddress} field. */
        public VkDeviceOrHostAddressKHR.Buffer hostAddress(@NativeType("void *") long value) { VkDeviceOrHostAddressKHR.nhostAddress(address(), value); return this; }

    }

}