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
 * Structure specifying a region of device addresses with a stride.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code size} is not zero, all addresses between {@code deviceAddress} and <code>deviceAddress + size - 1</code> <b>must</b> be in the buffer device address range of the same buffer</li>
 * <li>If {@code size} is not zero, {@code stride} <b>must</b> be less than or equal to the size of the buffer from which {@code deviceAddress} was queried</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRRayTracingPipeline#vkCmdTraceRaysIndirectKHR CmdTraceRaysIndirectKHR}, {@link KHRRayTracingPipeline#vkCmdTraceRaysKHR CmdTraceRaysKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkStridedDeviceAddressRegionKHR {
 *     VkDeviceAddress {@link #deviceAddress};
 *     VkDeviceSize {@link #stride};
 *     VkDeviceSize {@link #size};
 * }</code></pre>
 */
public class VkStridedDeviceAddressRegionKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DEVICEADDRESS,
        STRIDE,
        SIZE;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DEVICEADDRESS = layout.offsetof(0);
        STRIDE = layout.offsetof(1);
        SIZE = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkStridedDeviceAddressRegionKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkStridedDeviceAddressRegionKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the device address (as returned by the {@link VK12#vkGetBufferDeviceAddress GetBufferDeviceAddress} command) at which the region starts, or zero if the region is unused. */
    @NativeType("VkDeviceAddress")
    public long deviceAddress() { return ndeviceAddress(address()); }
    /** the byte stride between consecutive elements. */
    @NativeType("VkDeviceSize")
    public long stride() { return nstride(address()); }
    /** the size in bytes of the region starting at {@code deviceAddress}. */
    @NativeType("VkDeviceSize")
    public long size() { return nsize(address()); }

    /** Sets the specified value to the {@link #deviceAddress} field. */
    public VkStridedDeviceAddressRegionKHR deviceAddress(@NativeType("VkDeviceAddress") long value) { ndeviceAddress(address(), value); return this; }
    /** Sets the specified value to the {@link #stride} field. */
    public VkStridedDeviceAddressRegionKHR stride(@NativeType("VkDeviceSize") long value) { nstride(address(), value); return this; }
    /** Sets the specified value to the {@link #size} field. */
    public VkStridedDeviceAddressRegionKHR size(@NativeType("VkDeviceSize") long value) { nsize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkStridedDeviceAddressRegionKHR set(
        long deviceAddress,
        long stride,
        long size
    ) {
        deviceAddress(deviceAddress);
        stride(stride);
        size(size);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkStridedDeviceAddressRegionKHR set(VkStridedDeviceAddressRegionKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkStridedDeviceAddressRegionKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkStridedDeviceAddressRegionKHR malloc() {
        return wrap(VkStridedDeviceAddressRegionKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkStridedDeviceAddressRegionKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkStridedDeviceAddressRegionKHR calloc() {
        return wrap(VkStridedDeviceAddressRegionKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkStridedDeviceAddressRegionKHR} instance allocated with {@link BufferUtils}. */
    public static VkStridedDeviceAddressRegionKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkStridedDeviceAddressRegionKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkStridedDeviceAddressRegionKHR} instance for the specified memory address. */
    public static VkStridedDeviceAddressRegionKHR create(long address) {
        return wrap(VkStridedDeviceAddressRegionKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkStridedDeviceAddressRegionKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkStridedDeviceAddressRegionKHR.class, address);
    }

    /**
     * Returns a new {@link VkStridedDeviceAddressRegionKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkStridedDeviceAddressRegionKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkStridedDeviceAddressRegionKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkStridedDeviceAddressRegionKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkStridedDeviceAddressRegionKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkStridedDeviceAddressRegionKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkStridedDeviceAddressRegionKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkStridedDeviceAddressRegionKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkStridedDeviceAddressRegionKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkStridedDeviceAddressRegionKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkStridedDeviceAddressRegionKHR malloc(MemoryStack stack) {
        return wrap(VkStridedDeviceAddressRegionKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkStridedDeviceAddressRegionKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkStridedDeviceAddressRegionKHR calloc(MemoryStack stack) {
        return wrap(VkStridedDeviceAddressRegionKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkStridedDeviceAddressRegionKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkStridedDeviceAddressRegionKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkStridedDeviceAddressRegionKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkStridedDeviceAddressRegionKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #deviceAddress}. */
    public static long ndeviceAddress(long struct) { return UNSAFE.getLong(null, struct + VkStridedDeviceAddressRegionKHR.DEVICEADDRESS); }
    /** Unsafe version of {@link #stride}. */
    public static long nstride(long struct) { return UNSAFE.getLong(null, struct + VkStridedDeviceAddressRegionKHR.STRIDE); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return UNSAFE.getLong(null, struct + VkStridedDeviceAddressRegionKHR.SIZE); }

    /** Unsafe version of {@link #deviceAddress(long) deviceAddress}. */
    public static void ndeviceAddress(long struct, long value) { UNSAFE.putLong(null, struct + VkStridedDeviceAddressRegionKHR.DEVICEADDRESS, value); }
    /** Unsafe version of {@link #stride(long) stride}. */
    public static void nstride(long struct, long value) { UNSAFE.putLong(null, struct + VkStridedDeviceAddressRegionKHR.STRIDE, value); }
    /** Unsafe version of {@link #size(long) size}. */
    public static void nsize(long struct, long value) { UNSAFE.putLong(null, struct + VkStridedDeviceAddressRegionKHR.SIZE, value); }

    // -----------------------------------

    /** An array of {@link VkStridedDeviceAddressRegionKHR} structs. */
    public static class Buffer extends StructBuffer<VkStridedDeviceAddressRegionKHR, Buffer> implements NativeResource {

        private static final VkStridedDeviceAddressRegionKHR ELEMENT_FACTORY = VkStridedDeviceAddressRegionKHR.create(-1L);

        /**
         * Creates a new {@code VkStridedDeviceAddressRegionKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkStridedDeviceAddressRegionKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkStridedDeviceAddressRegionKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkStridedDeviceAddressRegionKHR#deviceAddress} field. */
        @NativeType("VkDeviceAddress")
        public long deviceAddress() { return VkStridedDeviceAddressRegionKHR.ndeviceAddress(address()); }
        /** @return the value of the {@link VkStridedDeviceAddressRegionKHR#stride} field. */
        @NativeType("VkDeviceSize")
        public long stride() { return VkStridedDeviceAddressRegionKHR.nstride(address()); }
        /** @return the value of the {@link VkStridedDeviceAddressRegionKHR#size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VkStridedDeviceAddressRegionKHR.nsize(address()); }

        /** Sets the specified value to the {@link VkStridedDeviceAddressRegionKHR#deviceAddress} field. */
        public VkStridedDeviceAddressRegionKHR.Buffer deviceAddress(@NativeType("VkDeviceAddress") long value) { VkStridedDeviceAddressRegionKHR.ndeviceAddress(address(), value); return this; }
        /** Sets the specified value to the {@link VkStridedDeviceAddressRegionKHR#stride} field. */
        public VkStridedDeviceAddressRegionKHR.Buffer stride(@NativeType("VkDeviceSize") long value) { VkStridedDeviceAddressRegionKHR.nstride(address(), value); return this; }
        /** Sets the specified value to the {@link VkStridedDeviceAddressRegionKHR#size} field. */
        public VkStridedDeviceAddressRegionKHR.Buffer size(@NativeType("VkDeviceSize") long value) { VkStridedDeviceAddressRegionKHR.nsize(address(), value); return this; }

    }

}