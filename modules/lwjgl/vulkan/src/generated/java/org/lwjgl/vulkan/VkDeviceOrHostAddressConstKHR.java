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
 * Union specifying a const device or host address.
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkAccelerationStructureGeometryAabbsDataKHR}, {@link VkAccelerationStructureGeometryInstancesDataKHR}, {@link VkAccelerationStructureGeometryMotionTrianglesDataNV}, {@link VkAccelerationStructureGeometryTrianglesDataKHR}, {@link VkAccelerationStructureTrianglesDisplacementMicromapNV}, {@link VkAccelerationStructureTrianglesOpacityMicromapEXT}, {@link VkCopyMemoryToAccelerationStructureInfoKHR}, {@link VkCopyMemoryToMicromapInfoEXT}, {@link VkMicromapBuildInfoEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * union VkDeviceOrHostAddressConstKHR {
 *     VkDeviceAddress {@link #deviceAddress};
 *     void const * {@link #hostAddress};
 * }</code></pre>
 */
public class VkDeviceOrHostAddressConstKHR extends Struct<VkDeviceOrHostAddressConstKHR> implements NativeResource {

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

    protected VkDeviceOrHostAddressConstKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDeviceOrHostAddressConstKHR create(long address, @Nullable ByteBuffer container) {
        return new VkDeviceOrHostAddressConstKHR(address, container);
    }

    /**
     * Creates a {@code VkDeviceOrHostAddressConstKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceOrHostAddressConstKHR(ByteBuffer container) {
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
    public VkDeviceOrHostAddressConstKHR deviceAddress(@NativeType("VkDeviceAddress") long value) { ndeviceAddress(address(), value); return this; }
    /** Sets the specified value to the {@link #hostAddress} field. */
    public VkDeviceOrHostAddressConstKHR hostAddress(@NativeType("void const *") long value) { nhostAddress(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceOrHostAddressConstKHR set(VkDeviceOrHostAddressConstKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceOrHostAddressConstKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceOrHostAddressConstKHR malloc() {
        return new VkDeviceOrHostAddressConstKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceOrHostAddressConstKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceOrHostAddressConstKHR calloc() {
        return new VkDeviceOrHostAddressConstKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceOrHostAddressConstKHR} instance allocated with {@link BufferUtils}. */
    public static VkDeviceOrHostAddressConstKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceOrHostAddressConstKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceOrHostAddressConstKHR} instance for the specified memory address. */
    public static VkDeviceOrHostAddressConstKHR create(long address) {
        return new VkDeviceOrHostAddressConstKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDeviceOrHostAddressConstKHR createSafe(long address) {
        return address == NULL ? null : new VkDeviceOrHostAddressConstKHR(address, null);
    }

    /**
     * Returns a new {@link VkDeviceOrHostAddressConstKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceOrHostAddressConstKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceOrHostAddressConstKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceOrHostAddressConstKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceOrHostAddressConstKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceOrHostAddressConstKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDeviceOrHostAddressConstKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceOrHostAddressConstKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDeviceOrHostAddressConstKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDeviceOrHostAddressConstKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceOrHostAddressConstKHR malloc(MemoryStack stack) {
        return new VkDeviceOrHostAddressConstKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDeviceOrHostAddressConstKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceOrHostAddressConstKHR calloc(MemoryStack stack) {
        return new VkDeviceOrHostAddressConstKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDeviceOrHostAddressConstKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceOrHostAddressConstKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceOrHostAddressConstKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceOrHostAddressConstKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #deviceAddress}. */
    public static long ndeviceAddress(long struct) { return memGetLong(struct + VkDeviceOrHostAddressConstKHR.DEVICEADDRESS); }
    /** Unsafe version of {@link #hostAddress}. */
    public static long nhostAddress(long struct) { return memGetAddress(struct + VkDeviceOrHostAddressConstKHR.HOSTADDRESS); }

    /** Unsafe version of {@link #deviceAddress(long) deviceAddress}. */
    public static void ndeviceAddress(long struct, long value) { memPutLong(struct + VkDeviceOrHostAddressConstKHR.DEVICEADDRESS, value); }
    /** Unsafe version of {@link #hostAddress(long) hostAddress}. */
    public static void nhostAddress(long struct, long value) { memPutAddress(struct + VkDeviceOrHostAddressConstKHR.HOSTADDRESS, value); }

    // -----------------------------------

    /** An array of {@link VkDeviceOrHostAddressConstKHR} structs. */
    public static class Buffer extends StructBuffer<VkDeviceOrHostAddressConstKHR, Buffer> implements NativeResource {

        private static final VkDeviceOrHostAddressConstKHR ELEMENT_FACTORY = VkDeviceOrHostAddressConstKHR.create(-1L);

        /**
         * Creates a new {@code VkDeviceOrHostAddressConstKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceOrHostAddressConstKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDeviceOrHostAddressConstKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDeviceOrHostAddressConstKHR#deviceAddress} field. */
        @NativeType("VkDeviceAddress")
        public long deviceAddress() { return VkDeviceOrHostAddressConstKHR.ndeviceAddress(address()); }
        /** @return the value of the {@link VkDeviceOrHostAddressConstKHR#hostAddress} field. */
        @NativeType("void const *")
        public long hostAddress() { return VkDeviceOrHostAddressConstKHR.nhostAddress(address()); }

        /** Sets the specified value to the {@link VkDeviceOrHostAddressConstKHR#deviceAddress} field. */
        public VkDeviceOrHostAddressConstKHR.Buffer deviceAddress(@NativeType("VkDeviceAddress") long value) { VkDeviceOrHostAddressConstKHR.ndeviceAddress(address(), value); return this; }
        /** Sets the specified value to the {@link VkDeviceOrHostAddressConstKHR#hostAddress} field. */
        public VkDeviceOrHostAddressConstKHR.Buffer hostAddress(@NativeType("void const *") long value) { VkDeviceOrHostAddressConstKHR.nhostAddress(address(), value); return this; }

    }

}