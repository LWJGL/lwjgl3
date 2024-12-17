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
 * struct VkAccelerationStructureGeometryAabbsDataKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link VkDeviceOrHostAddressConstKHR VkDeviceOrHostAddressConstKHR} data;
 *     VkDeviceSize stride;
 * }}</pre>
 */
public class VkAccelerationStructureGeometryAabbsDataKHR extends Struct<VkAccelerationStructureGeometryAabbsDataKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DATA,
        STRIDE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkDeviceOrHostAddressConstKHR.SIZEOF, VkDeviceOrHostAddressConstKHR.ALIGNOF),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DATA = layout.offsetof(2);
        STRIDE = layout.offsetof(3);
    }

    protected VkAccelerationStructureGeometryAabbsDataKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAccelerationStructureGeometryAabbsDataKHR create(long address, @Nullable ByteBuffer container) {
        return new VkAccelerationStructureGeometryAabbsDataKHR(address, container);
    }

    /**
     * Creates a {@code VkAccelerationStructureGeometryAabbsDataKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAccelerationStructureGeometryAabbsDataKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return a {@link VkDeviceOrHostAddressConstKHR} view of the {@code data} field. */
    public VkDeviceOrHostAddressConstKHR data() { return ndata(address()); }
    /** @return the value of the {@code stride} field. */
    @NativeType("VkDeviceSize")
    public long stride() { return nstride(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkAccelerationStructureGeometryAabbsDataKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_AABBS_DATA_KHR STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_AABBS_DATA_KHR} value to the {@code sType} field. */
    public VkAccelerationStructureGeometryAabbsDataKHR sType$Default() { return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_AABBS_DATA_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkAccelerationStructureGeometryAabbsDataKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@code data} field. */
    public VkAccelerationStructureGeometryAabbsDataKHR data(VkDeviceOrHostAddressConstKHR value) { ndata(address(), value); return this; }
    /** Passes the {@code data} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkAccelerationStructureGeometryAabbsDataKHR data(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(data()); return this; }
    /** Sets the specified value to the {@code stride} field. */
    public VkAccelerationStructureGeometryAabbsDataKHR stride(@NativeType("VkDeviceSize") long value) { nstride(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAccelerationStructureGeometryAabbsDataKHR set(
        int sType,
        long pNext,
        VkDeviceOrHostAddressConstKHR data,
        long stride
    ) {
        sType(sType);
        pNext(pNext);
        data(data);
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
    public VkAccelerationStructureGeometryAabbsDataKHR set(VkAccelerationStructureGeometryAabbsDataKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAccelerationStructureGeometryAabbsDataKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureGeometryAabbsDataKHR malloc() {
        return new VkAccelerationStructureGeometryAabbsDataKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureGeometryAabbsDataKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureGeometryAabbsDataKHR calloc() {
        return new VkAccelerationStructureGeometryAabbsDataKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureGeometryAabbsDataKHR} instance allocated with {@link BufferUtils}. */
    public static VkAccelerationStructureGeometryAabbsDataKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureGeometryAabbsDataKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkAccelerationStructureGeometryAabbsDataKHR} instance for the specified memory address. */
    public static VkAccelerationStructureGeometryAabbsDataKHR create(long address) {
        return new VkAccelerationStructureGeometryAabbsDataKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkAccelerationStructureGeometryAabbsDataKHR createSafe(long address) {
        return address == NULL ? null : new VkAccelerationStructureGeometryAabbsDataKHR(address, null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryAabbsDataKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryAabbsDataKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryAabbsDataKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryAabbsDataKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryAabbsDataKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryAabbsDataKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAccelerationStructureGeometryAabbsDataKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryAabbsDataKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkAccelerationStructureGeometryAabbsDataKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkAccelerationStructureGeometryAabbsDataKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureGeometryAabbsDataKHR malloc(MemoryStack stack) {
        return new VkAccelerationStructureGeometryAabbsDataKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAccelerationStructureGeometryAabbsDataKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureGeometryAabbsDataKHR calloc(MemoryStack stack) {
        return new VkAccelerationStructureGeometryAabbsDataKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryAabbsDataKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryAabbsDataKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryAabbsDataKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryAabbsDataKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkAccelerationStructureGeometryAabbsDataKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAccelerationStructureGeometryAabbsDataKHR.PNEXT); }
    /** Unsafe version of {@link #data}. */
    public static VkDeviceOrHostAddressConstKHR ndata(long struct) { return VkDeviceOrHostAddressConstKHR.create(struct + VkAccelerationStructureGeometryAabbsDataKHR.DATA); }
    /** Unsafe version of {@link #stride}. */
    public static long nstride(long struct) { return memGetLong(struct + VkAccelerationStructureGeometryAabbsDataKHR.STRIDE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkAccelerationStructureGeometryAabbsDataKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAccelerationStructureGeometryAabbsDataKHR.PNEXT, value); }
    /** Unsafe version of {@link #data(VkDeviceOrHostAddressConstKHR) data}. */
    public static void ndata(long struct, VkDeviceOrHostAddressConstKHR value) { memCopy(value.address(), struct + VkAccelerationStructureGeometryAabbsDataKHR.DATA, VkDeviceOrHostAddressConstKHR.SIZEOF); }
    /** Unsafe version of {@link #stride(long) stride}. */
    public static void nstride(long struct, long value) { memPutLong(struct + VkAccelerationStructureGeometryAabbsDataKHR.STRIDE, value); }

    // -----------------------------------

    /** An array of {@link VkAccelerationStructureGeometryAabbsDataKHR} structs. */
    public static class Buffer extends StructBuffer<VkAccelerationStructureGeometryAabbsDataKHR, Buffer> implements NativeResource {

        private static final VkAccelerationStructureGeometryAabbsDataKHR ELEMENT_FACTORY = VkAccelerationStructureGeometryAabbsDataKHR.create(-1L);

        /**
         * Creates a new {@code VkAccelerationStructureGeometryAabbsDataKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAccelerationStructureGeometryAabbsDataKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkAccelerationStructureGeometryAabbsDataKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAccelerationStructureGeometryAabbsDataKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkAccelerationStructureGeometryAabbsDataKHR.npNext(address()); }
        /** @return a {@link VkDeviceOrHostAddressConstKHR} view of the {@code data} field. */
        public VkDeviceOrHostAddressConstKHR data() { return VkAccelerationStructureGeometryAabbsDataKHR.ndata(address()); }
        /** @return the value of the {@code stride} field. */
        @NativeType("VkDeviceSize")
        public long stride() { return VkAccelerationStructureGeometryAabbsDataKHR.nstride(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkAccelerationStructureGeometryAabbsDataKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkAccelerationStructureGeometryAabbsDataKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_AABBS_DATA_KHR STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_AABBS_DATA_KHR} value to the {@code sType} field. */
        public VkAccelerationStructureGeometryAabbsDataKHR.Buffer sType$Default() { return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_AABBS_DATA_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkAccelerationStructureGeometryAabbsDataKHR.Buffer pNext(@NativeType("void const *") long value) { VkAccelerationStructureGeometryAabbsDataKHR.npNext(address(), value); return this; }
        /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@code data} field. */
        public VkAccelerationStructureGeometryAabbsDataKHR.Buffer data(VkDeviceOrHostAddressConstKHR value) { VkAccelerationStructureGeometryAabbsDataKHR.ndata(address(), value); return this; }
        /** Passes the {@code data} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkAccelerationStructureGeometryAabbsDataKHR.Buffer data(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(data()); return this; }
        /** Sets the specified value to the {@code stride} field. */
        public VkAccelerationStructureGeometryAabbsDataKHR.Buffer stride(@NativeType("VkDeviceSize") long value) { VkAccelerationStructureGeometryAabbsDataKHR.nstride(address(), value); return this; }

    }

}