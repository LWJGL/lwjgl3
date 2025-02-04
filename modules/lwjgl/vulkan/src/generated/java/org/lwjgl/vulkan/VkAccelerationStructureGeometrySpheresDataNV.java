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
 * struct VkAccelerationStructureGeometrySpheresDataNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkFormat vertexFormat;
 *     {@link VkDeviceOrHostAddressConstKHR VkDeviceOrHostAddressConstKHR} vertexData;
 *     VkDeviceSize vertexStride;
 *     VkFormat radiusFormat;
 *     {@link VkDeviceOrHostAddressConstKHR VkDeviceOrHostAddressConstKHR} radiusData;
 *     VkDeviceSize radiusStride;
 *     VkIndexType indexType;
 *     {@link VkDeviceOrHostAddressConstKHR VkDeviceOrHostAddressConstKHR} indexData;
 *     VkDeviceSize indexStride;
 * }}</pre>
 */
public class VkAccelerationStructureGeometrySpheresDataNV extends Struct<VkAccelerationStructureGeometrySpheresDataNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        VERTEXFORMAT,
        VERTEXDATA,
        VERTEXSTRIDE,
        RADIUSFORMAT,
        RADIUSDATA,
        RADIUSSTRIDE,
        INDEXTYPE,
        INDEXDATA,
        INDEXSTRIDE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(VkDeviceOrHostAddressConstKHR.SIZEOF, VkDeviceOrHostAddressConstKHR.ALIGNOF),
            __member(8),
            __member(4),
            __member(VkDeviceOrHostAddressConstKHR.SIZEOF, VkDeviceOrHostAddressConstKHR.ALIGNOF),
            __member(8),
            __member(4),
            __member(VkDeviceOrHostAddressConstKHR.SIZEOF, VkDeviceOrHostAddressConstKHR.ALIGNOF),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VERTEXFORMAT = layout.offsetof(2);
        VERTEXDATA = layout.offsetof(3);
        VERTEXSTRIDE = layout.offsetof(4);
        RADIUSFORMAT = layout.offsetof(5);
        RADIUSDATA = layout.offsetof(6);
        RADIUSSTRIDE = layout.offsetof(7);
        INDEXTYPE = layout.offsetof(8);
        INDEXDATA = layout.offsetof(9);
        INDEXSTRIDE = layout.offsetof(10);
    }

    protected VkAccelerationStructureGeometrySpheresDataNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAccelerationStructureGeometrySpheresDataNV create(long address, @Nullable ByteBuffer container) {
        return new VkAccelerationStructureGeometrySpheresDataNV(address, container);
    }

    /**
     * Creates a {@code VkAccelerationStructureGeometrySpheresDataNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAccelerationStructureGeometrySpheresDataNV(ByteBuffer container) {
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
    /** @return the value of the {@code vertexFormat} field. */
    @NativeType("VkFormat")
    public int vertexFormat() { return nvertexFormat(address()); }
    /** @return a {@link VkDeviceOrHostAddressConstKHR} view of the {@code vertexData} field. */
    public VkDeviceOrHostAddressConstKHR vertexData() { return nvertexData(address()); }
    /** @return the value of the {@code vertexStride} field. */
    @NativeType("VkDeviceSize")
    public long vertexStride() { return nvertexStride(address()); }
    /** @return the value of the {@code radiusFormat} field. */
    @NativeType("VkFormat")
    public int radiusFormat() { return nradiusFormat(address()); }
    /** @return a {@link VkDeviceOrHostAddressConstKHR} view of the {@code radiusData} field. */
    public VkDeviceOrHostAddressConstKHR radiusData() { return nradiusData(address()); }
    /** @return the value of the {@code radiusStride} field. */
    @NativeType("VkDeviceSize")
    public long radiusStride() { return nradiusStride(address()); }
    /** @return the value of the {@code indexType} field. */
    @NativeType("VkIndexType")
    public int indexType() { return nindexType(address()); }
    /** @return a {@link VkDeviceOrHostAddressConstKHR} view of the {@code indexData} field. */
    public VkDeviceOrHostAddressConstKHR indexData() { return nindexData(address()); }
    /** @return the value of the {@code indexStride} field. */
    @NativeType("VkDeviceSize")
    public long indexStride() { return nindexStride(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkAccelerationStructureGeometrySpheresDataNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVRayTracingLinearSweptSpheres#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_SPHERES_DATA_NV STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_SPHERES_DATA_NV} value to the {@code sType} field. */
    public VkAccelerationStructureGeometrySpheresDataNV sType$Default() { return sType(NVRayTracingLinearSweptSpheres.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_SPHERES_DATA_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkAccelerationStructureGeometrySpheresDataNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code vertexFormat} field. */
    public VkAccelerationStructureGeometrySpheresDataNV vertexFormat(@NativeType("VkFormat") int value) { nvertexFormat(address(), value); return this; }
    /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@code vertexData} field. */
    public VkAccelerationStructureGeometrySpheresDataNV vertexData(VkDeviceOrHostAddressConstKHR value) { nvertexData(address(), value); return this; }
    /** Passes the {@code vertexData} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkAccelerationStructureGeometrySpheresDataNV vertexData(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(vertexData()); return this; }
    /** Sets the specified value to the {@code vertexStride} field. */
    public VkAccelerationStructureGeometrySpheresDataNV vertexStride(@NativeType("VkDeviceSize") long value) { nvertexStride(address(), value); return this; }
    /** Sets the specified value to the {@code radiusFormat} field. */
    public VkAccelerationStructureGeometrySpheresDataNV radiusFormat(@NativeType("VkFormat") int value) { nradiusFormat(address(), value); return this; }
    /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@code radiusData} field. */
    public VkAccelerationStructureGeometrySpheresDataNV radiusData(VkDeviceOrHostAddressConstKHR value) { nradiusData(address(), value); return this; }
    /** Passes the {@code radiusData} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkAccelerationStructureGeometrySpheresDataNV radiusData(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(radiusData()); return this; }
    /** Sets the specified value to the {@code radiusStride} field. */
    public VkAccelerationStructureGeometrySpheresDataNV radiusStride(@NativeType("VkDeviceSize") long value) { nradiusStride(address(), value); return this; }
    /** Sets the specified value to the {@code indexType} field. */
    public VkAccelerationStructureGeometrySpheresDataNV indexType(@NativeType("VkIndexType") int value) { nindexType(address(), value); return this; }
    /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@code indexData} field. */
    public VkAccelerationStructureGeometrySpheresDataNV indexData(VkDeviceOrHostAddressConstKHR value) { nindexData(address(), value); return this; }
    /** Passes the {@code indexData} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkAccelerationStructureGeometrySpheresDataNV indexData(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(indexData()); return this; }
    /** Sets the specified value to the {@code indexStride} field. */
    public VkAccelerationStructureGeometrySpheresDataNV indexStride(@NativeType("VkDeviceSize") long value) { nindexStride(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAccelerationStructureGeometrySpheresDataNV set(
        int sType,
        long pNext,
        int vertexFormat,
        VkDeviceOrHostAddressConstKHR vertexData,
        long vertexStride,
        int radiusFormat,
        VkDeviceOrHostAddressConstKHR radiusData,
        long radiusStride,
        int indexType,
        VkDeviceOrHostAddressConstKHR indexData,
        long indexStride
    ) {
        sType(sType);
        pNext(pNext);
        vertexFormat(vertexFormat);
        vertexData(vertexData);
        vertexStride(vertexStride);
        radiusFormat(radiusFormat);
        radiusData(radiusData);
        radiusStride(radiusStride);
        indexType(indexType);
        indexData(indexData);
        indexStride(indexStride);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAccelerationStructureGeometrySpheresDataNV set(VkAccelerationStructureGeometrySpheresDataNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAccelerationStructureGeometrySpheresDataNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureGeometrySpheresDataNV malloc() {
        return new VkAccelerationStructureGeometrySpheresDataNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureGeometrySpheresDataNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureGeometrySpheresDataNV calloc() {
        return new VkAccelerationStructureGeometrySpheresDataNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureGeometrySpheresDataNV} instance allocated with {@link BufferUtils}. */
    public static VkAccelerationStructureGeometrySpheresDataNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureGeometrySpheresDataNV(memAddress(container), container);
    }

    /** Returns a new {@code VkAccelerationStructureGeometrySpheresDataNV} instance for the specified memory address. */
    public static VkAccelerationStructureGeometrySpheresDataNV create(long address) {
        return new VkAccelerationStructureGeometrySpheresDataNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkAccelerationStructureGeometrySpheresDataNV createSafe(long address) {
        return address == NULL ? null : new VkAccelerationStructureGeometrySpheresDataNV(address, null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometrySpheresDataNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometrySpheresDataNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometrySpheresDataNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometrySpheresDataNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometrySpheresDataNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometrySpheresDataNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAccelerationStructureGeometrySpheresDataNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometrySpheresDataNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkAccelerationStructureGeometrySpheresDataNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkAccelerationStructureGeometrySpheresDataNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureGeometrySpheresDataNV malloc(MemoryStack stack) {
        return new VkAccelerationStructureGeometrySpheresDataNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAccelerationStructureGeometrySpheresDataNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureGeometrySpheresDataNV calloc(MemoryStack stack) {
        return new VkAccelerationStructureGeometrySpheresDataNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometrySpheresDataNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometrySpheresDataNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometrySpheresDataNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometrySpheresDataNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkAccelerationStructureGeometrySpheresDataNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAccelerationStructureGeometrySpheresDataNV.PNEXT); }
    /** Unsafe version of {@link #vertexFormat}. */
    public static int nvertexFormat(long struct) { return memGetInt(struct + VkAccelerationStructureGeometrySpheresDataNV.VERTEXFORMAT); }
    /** Unsafe version of {@link #vertexData}. */
    public static VkDeviceOrHostAddressConstKHR nvertexData(long struct) { return VkDeviceOrHostAddressConstKHR.create(struct + VkAccelerationStructureGeometrySpheresDataNV.VERTEXDATA); }
    /** Unsafe version of {@link #vertexStride}. */
    public static long nvertexStride(long struct) { return memGetLong(struct + VkAccelerationStructureGeometrySpheresDataNV.VERTEXSTRIDE); }
    /** Unsafe version of {@link #radiusFormat}. */
    public static int nradiusFormat(long struct) { return memGetInt(struct + VkAccelerationStructureGeometrySpheresDataNV.RADIUSFORMAT); }
    /** Unsafe version of {@link #radiusData}. */
    public static VkDeviceOrHostAddressConstKHR nradiusData(long struct) { return VkDeviceOrHostAddressConstKHR.create(struct + VkAccelerationStructureGeometrySpheresDataNV.RADIUSDATA); }
    /** Unsafe version of {@link #radiusStride}. */
    public static long nradiusStride(long struct) { return memGetLong(struct + VkAccelerationStructureGeometrySpheresDataNV.RADIUSSTRIDE); }
    /** Unsafe version of {@link #indexType}. */
    public static int nindexType(long struct) { return memGetInt(struct + VkAccelerationStructureGeometrySpheresDataNV.INDEXTYPE); }
    /** Unsafe version of {@link #indexData}. */
    public static VkDeviceOrHostAddressConstKHR nindexData(long struct) { return VkDeviceOrHostAddressConstKHR.create(struct + VkAccelerationStructureGeometrySpheresDataNV.INDEXDATA); }
    /** Unsafe version of {@link #indexStride}. */
    public static long nindexStride(long struct) { return memGetLong(struct + VkAccelerationStructureGeometrySpheresDataNV.INDEXSTRIDE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkAccelerationStructureGeometrySpheresDataNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAccelerationStructureGeometrySpheresDataNV.PNEXT, value); }
    /** Unsafe version of {@link #vertexFormat(int) vertexFormat}. */
    public static void nvertexFormat(long struct, int value) { memPutInt(struct + VkAccelerationStructureGeometrySpheresDataNV.VERTEXFORMAT, value); }
    /** Unsafe version of {@link #vertexData(VkDeviceOrHostAddressConstKHR) vertexData}. */
    public static void nvertexData(long struct, VkDeviceOrHostAddressConstKHR value) { memCopy(value.address(), struct + VkAccelerationStructureGeometrySpheresDataNV.VERTEXDATA, VkDeviceOrHostAddressConstKHR.SIZEOF); }
    /** Unsafe version of {@link #vertexStride(long) vertexStride}. */
    public static void nvertexStride(long struct, long value) { memPutLong(struct + VkAccelerationStructureGeometrySpheresDataNV.VERTEXSTRIDE, value); }
    /** Unsafe version of {@link #radiusFormat(int) radiusFormat}. */
    public static void nradiusFormat(long struct, int value) { memPutInt(struct + VkAccelerationStructureGeometrySpheresDataNV.RADIUSFORMAT, value); }
    /** Unsafe version of {@link #radiusData(VkDeviceOrHostAddressConstKHR) radiusData}. */
    public static void nradiusData(long struct, VkDeviceOrHostAddressConstKHR value) { memCopy(value.address(), struct + VkAccelerationStructureGeometrySpheresDataNV.RADIUSDATA, VkDeviceOrHostAddressConstKHR.SIZEOF); }
    /** Unsafe version of {@link #radiusStride(long) radiusStride}. */
    public static void nradiusStride(long struct, long value) { memPutLong(struct + VkAccelerationStructureGeometrySpheresDataNV.RADIUSSTRIDE, value); }
    /** Unsafe version of {@link #indexType(int) indexType}. */
    public static void nindexType(long struct, int value) { memPutInt(struct + VkAccelerationStructureGeometrySpheresDataNV.INDEXTYPE, value); }
    /** Unsafe version of {@link #indexData(VkDeviceOrHostAddressConstKHR) indexData}. */
    public static void nindexData(long struct, VkDeviceOrHostAddressConstKHR value) { memCopy(value.address(), struct + VkAccelerationStructureGeometrySpheresDataNV.INDEXDATA, VkDeviceOrHostAddressConstKHR.SIZEOF); }
    /** Unsafe version of {@link #indexStride(long) indexStride}. */
    public static void nindexStride(long struct, long value) { memPutLong(struct + VkAccelerationStructureGeometrySpheresDataNV.INDEXSTRIDE, value); }

    // -----------------------------------

    /** An array of {@link VkAccelerationStructureGeometrySpheresDataNV} structs. */
    public static class Buffer extends StructBuffer<VkAccelerationStructureGeometrySpheresDataNV, Buffer> implements NativeResource {

        private static final VkAccelerationStructureGeometrySpheresDataNV ELEMENT_FACTORY = VkAccelerationStructureGeometrySpheresDataNV.create(-1L);

        /**
         * Creates a new {@code VkAccelerationStructureGeometrySpheresDataNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAccelerationStructureGeometrySpheresDataNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkAccelerationStructureGeometrySpheresDataNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAccelerationStructureGeometrySpheresDataNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkAccelerationStructureGeometrySpheresDataNV.npNext(address()); }
        /** @return the value of the {@code vertexFormat} field. */
        @NativeType("VkFormat")
        public int vertexFormat() { return VkAccelerationStructureGeometrySpheresDataNV.nvertexFormat(address()); }
        /** @return a {@link VkDeviceOrHostAddressConstKHR} view of the {@code vertexData} field. */
        public VkDeviceOrHostAddressConstKHR vertexData() { return VkAccelerationStructureGeometrySpheresDataNV.nvertexData(address()); }
        /** @return the value of the {@code vertexStride} field. */
        @NativeType("VkDeviceSize")
        public long vertexStride() { return VkAccelerationStructureGeometrySpheresDataNV.nvertexStride(address()); }
        /** @return the value of the {@code radiusFormat} field. */
        @NativeType("VkFormat")
        public int radiusFormat() { return VkAccelerationStructureGeometrySpheresDataNV.nradiusFormat(address()); }
        /** @return a {@link VkDeviceOrHostAddressConstKHR} view of the {@code radiusData} field. */
        public VkDeviceOrHostAddressConstKHR radiusData() { return VkAccelerationStructureGeometrySpheresDataNV.nradiusData(address()); }
        /** @return the value of the {@code radiusStride} field. */
        @NativeType("VkDeviceSize")
        public long radiusStride() { return VkAccelerationStructureGeometrySpheresDataNV.nradiusStride(address()); }
        /** @return the value of the {@code indexType} field. */
        @NativeType("VkIndexType")
        public int indexType() { return VkAccelerationStructureGeometrySpheresDataNV.nindexType(address()); }
        /** @return a {@link VkDeviceOrHostAddressConstKHR} view of the {@code indexData} field. */
        public VkDeviceOrHostAddressConstKHR indexData() { return VkAccelerationStructureGeometrySpheresDataNV.nindexData(address()); }
        /** @return the value of the {@code indexStride} field. */
        @NativeType("VkDeviceSize")
        public long indexStride() { return VkAccelerationStructureGeometrySpheresDataNV.nindexStride(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkAccelerationStructureGeometrySpheresDataNV.Buffer sType(@NativeType("VkStructureType") int value) { VkAccelerationStructureGeometrySpheresDataNV.nsType(address(), value); return this; }
        /** Sets the {@link NVRayTracingLinearSweptSpheres#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_SPHERES_DATA_NV STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_SPHERES_DATA_NV} value to the {@code sType} field. */
        public VkAccelerationStructureGeometrySpheresDataNV.Buffer sType$Default() { return sType(NVRayTracingLinearSweptSpheres.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_SPHERES_DATA_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkAccelerationStructureGeometrySpheresDataNV.Buffer pNext(@NativeType("void const *") long value) { VkAccelerationStructureGeometrySpheresDataNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code vertexFormat} field. */
        public VkAccelerationStructureGeometrySpheresDataNV.Buffer vertexFormat(@NativeType("VkFormat") int value) { VkAccelerationStructureGeometrySpheresDataNV.nvertexFormat(address(), value); return this; }
        /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@code vertexData} field. */
        public VkAccelerationStructureGeometrySpheresDataNV.Buffer vertexData(VkDeviceOrHostAddressConstKHR value) { VkAccelerationStructureGeometrySpheresDataNV.nvertexData(address(), value); return this; }
        /** Passes the {@code vertexData} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkAccelerationStructureGeometrySpheresDataNV.Buffer vertexData(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(vertexData()); return this; }
        /** Sets the specified value to the {@code vertexStride} field. */
        public VkAccelerationStructureGeometrySpheresDataNV.Buffer vertexStride(@NativeType("VkDeviceSize") long value) { VkAccelerationStructureGeometrySpheresDataNV.nvertexStride(address(), value); return this; }
        /** Sets the specified value to the {@code radiusFormat} field. */
        public VkAccelerationStructureGeometrySpheresDataNV.Buffer radiusFormat(@NativeType("VkFormat") int value) { VkAccelerationStructureGeometrySpheresDataNV.nradiusFormat(address(), value); return this; }
        /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@code radiusData} field. */
        public VkAccelerationStructureGeometrySpheresDataNV.Buffer radiusData(VkDeviceOrHostAddressConstKHR value) { VkAccelerationStructureGeometrySpheresDataNV.nradiusData(address(), value); return this; }
        /** Passes the {@code radiusData} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkAccelerationStructureGeometrySpheresDataNV.Buffer radiusData(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(radiusData()); return this; }
        /** Sets the specified value to the {@code radiusStride} field. */
        public VkAccelerationStructureGeometrySpheresDataNV.Buffer radiusStride(@NativeType("VkDeviceSize") long value) { VkAccelerationStructureGeometrySpheresDataNV.nradiusStride(address(), value); return this; }
        /** Sets the specified value to the {@code indexType} field. */
        public VkAccelerationStructureGeometrySpheresDataNV.Buffer indexType(@NativeType("VkIndexType") int value) { VkAccelerationStructureGeometrySpheresDataNV.nindexType(address(), value); return this; }
        /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@code indexData} field. */
        public VkAccelerationStructureGeometrySpheresDataNV.Buffer indexData(VkDeviceOrHostAddressConstKHR value) { VkAccelerationStructureGeometrySpheresDataNV.nindexData(address(), value); return this; }
        /** Passes the {@code indexData} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkAccelerationStructureGeometrySpheresDataNV.Buffer indexData(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(indexData()); return this; }
        /** Sets the specified value to the {@code indexStride} field. */
        public VkAccelerationStructureGeometrySpheresDataNV.Buffer indexStride(@NativeType("VkDeviceSize") long value) { VkAccelerationStructureGeometrySpheresDataNV.nindexStride(address(), value); return this; }

    }

}