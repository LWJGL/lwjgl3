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
 * struct VkAccelerationStructureGeometryMotionTrianglesDataNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link VkDeviceOrHostAddressConstKHR VkDeviceOrHostAddressConstKHR} vertexData;
 * }}</pre>
 */
public class VkAccelerationStructureGeometryMotionTrianglesDataNV extends Struct<VkAccelerationStructureGeometryMotionTrianglesDataNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        VERTEXDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkDeviceOrHostAddressConstKHR.SIZEOF, VkDeviceOrHostAddressConstKHR.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VERTEXDATA = layout.offsetof(2);
    }

    protected VkAccelerationStructureGeometryMotionTrianglesDataNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAccelerationStructureGeometryMotionTrianglesDataNV create(long address, @Nullable ByteBuffer container) {
        return new VkAccelerationStructureGeometryMotionTrianglesDataNV(address, container);
    }

    /**
     * Creates a {@code VkAccelerationStructureGeometryMotionTrianglesDataNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAccelerationStructureGeometryMotionTrianglesDataNV(ByteBuffer container) {
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
    /** @return a {@link VkDeviceOrHostAddressConstKHR} view of the {@code vertexData} field. */
    public VkDeviceOrHostAddressConstKHR vertexData() { return nvertexData(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkAccelerationStructureGeometryMotionTrianglesDataNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVRayTracingMotionBlur#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_MOTION_TRIANGLES_DATA_NV STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_MOTION_TRIANGLES_DATA_NV} value to the {@code sType} field. */
    public VkAccelerationStructureGeometryMotionTrianglesDataNV sType$Default() { return sType(NVRayTracingMotionBlur.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_MOTION_TRIANGLES_DATA_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkAccelerationStructureGeometryMotionTrianglesDataNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@code vertexData} field. */
    public VkAccelerationStructureGeometryMotionTrianglesDataNV vertexData(VkDeviceOrHostAddressConstKHR value) { nvertexData(address(), value); return this; }
    /** Passes the {@code vertexData} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkAccelerationStructureGeometryMotionTrianglesDataNV vertexData(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(vertexData()); return this; }

    /** Initializes this struct with the specified values. */
    public VkAccelerationStructureGeometryMotionTrianglesDataNV set(
        int sType,
        long pNext,
        VkDeviceOrHostAddressConstKHR vertexData
    ) {
        sType(sType);
        pNext(pNext);
        vertexData(vertexData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAccelerationStructureGeometryMotionTrianglesDataNV set(VkAccelerationStructureGeometryMotionTrianglesDataNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAccelerationStructureGeometryMotionTrianglesDataNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureGeometryMotionTrianglesDataNV malloc() {
        return new VkAccelerationStructureGeometryMotionTrianglesDataNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureGeometryMotionTrianglesDataNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureGeometryMotionTrianglesDataNV calloc() {
        return new VkAccelerationStructureGeometryMotionTrianglesDataNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureGeometryMotionTrianglesDataNV} instance allocated with {@link BufferUtils}. */
    public static VkAccelerationStructureGeometryMotionTrianglesDataNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureGeometryMotionTrianglesDataNV(memAddress(container), container);
    }

    /** Returns a new {@code VkAccelerationStructureGeometryMotionTrianglesDataNV} instance for the specified memory address. */
    public static VkAccelerationStructureGeometryMotionTrianglesDataNV create(long address) {
        return new VkAccelerationStructureGeometryMotionTrianglesDataNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkAccelerationStructureGeometryMotionTrianglesDataNV createSafe(long address) {
        return address == NULL ? null : new VkAccelerationStructureGeometryMotionTrianglesDataNV(address, null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryMotionTrianglesDataNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryMotionTrianglesDataNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryMotionTrianglesDataNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryMotionTrianglesDataNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryMotionTrianglesDataNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryMotionTrianglesDataNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAccelerationStructureGeometryMotionTrianglesDataNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryMotionTrianglesDataNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkAccelerationStructureGeometryMotionTrianglesDataNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkAccelerationStructureGeometryMotionTrianglesDataNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureGeometryMotionTrianglesDataNV malloc(MemoryStack stack) {
        return new VkAccelerationStructureGeometryMotionTrianglesDataNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAccelerationStructureGeometryMotionTrianglesDataNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureGeometryMotionTrianglesDataNV calloc(MemoryStack stack) {
        return new VkAccelerationStructureGeometryMotionTrianglesDataNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryMotionTrianglesDataNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryMotionTrianglesDataNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryMotionTrianglesDataNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryMotionTrianglesDataNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkAccelerationStructureGeometryMotionTrianglesDataNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAccelerationStructureGeometryMotionTrianglesDataNV.PNEXT); }
    /** Unsafe version of {@link #vertexData}. */
    public static VkDeviceOrHostAddressConstKHR nvertexData(long struct) { return VkDeviceOrHostAddressConstKHR.create(struct + VkAccelerationStructureGeometryMotionTrianglesDataNV.VERTEXDATA); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkAccelerationStructureGeometryMotionTrianglesDataNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAccelerationStructureGeometryMotionTrianglesDataNV.PNEXT, value); }
    /** Unsafe version of {@link #vertexData(VkDeviceOrHostAddressConstKHR) vertexData}. */
    public static void nvertexData(long struct, VkDeviceOrHostAddressConstKHR value) { memCopy(value.address(), struct + VkAccelerationStructureGeometryMotionTrianglesDataNV.VERTEXDATA, VkDeviceOrHostAddressConstKHR.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkAccelerationStructureGeometryMotionTrianglesDataNV} structs. */
    public static class Buffer extends StructBuffer<VkAccelerationStructureGeometryMotionTrianglesDataNV, Buffer> implements NativeResource {

        private static final VkAccelerationStructureGeometryMotionTrianglesDataNV ELEMENT_FACTORY = VkAccelerationStructureGeometryMotionTrianglesDataNV.create(-1L);

        /**
         * Creates a new {@code VkAccelerationStructureGeometryMotionTrianglesDataNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAccelerationStructureGeometryMotionTrianglesDataNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkAccelerationStructureGeometryMotionTrianglesDataNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAccelerationStructureGeometryMotionTrianglesDataNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkAccelerationStructureGeometryMotionTrianglesDataNV.npNext(address()); }
        /** @return a {@link VkDeviceOrHostAddressConstKHR} view of the {@code vertexData} field. */
        public VkDeviceOrHostAddressConstKHR vertexData() { return VkAccelerationStructureGeometryMotionTrianglesDataNV.nvertexData(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkAccelerationStructureGeometryMotionTrianglesDataNV.Buffer sType(@NativeType("VkStructureType") int value) { VkAccelerationStructureGeometryMotionTrianglesDataNV.nsType(address(), value); return this; }
        /** Sets the {@link NVRayTracingMotionBlur#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_MOTION_TRIANGLES_DATA_NV STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_MOTION_TRIANGLES_DATA_NV} value to the {@code sType} field. */
        public VkAccelerationStructureGeometryMotionTrianglesDataNV.Buffer sType$Default() { return sType(NVRayTracingMotionBlur.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_MOTION_TRIANGLES_DATA_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkAccelerationStructureGeometryMotionTrianglesDataNV.Buffer pNext(@NativeType("void const *") long value) { VkAccelerationStructureGeometryMotionTrianglesDataNV.npNext(address(), value); return this; }
        /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@code vertexData} field. */
        public VkAccelerationStructureGeometryMotionTrianglesDataNV.Buffer vertexData(VkDeviceOrHostAddressConstKHR value) { VkAccelerationStructureGeometryMotionTrianglesDataNV.nvertexData(address(), value); return this; }
        /** Passes the {@code vertexData} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkAccelerationStructureGeometryMotionTrianglesDataNV.Buffer vertexData(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(vertexData()); return this; }

    }

}