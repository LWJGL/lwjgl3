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
 * struct VkAccelerationStructureGeometryLinearSweptSpheresDataNV {
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
 *     VkRayTracingLssIndexingModeNV indexingMode;
 *     VkRayTracingLssPrimitiveEndCapsModeNV endCapsMode;
 * }}</pre>
 */
public class VkAccelerationStructureGeometryLinearSweptSpheresDataNV extends Struct<VkAccelerationStructureGeometryLinearSweptSpheresDataNV> implements NativeResource {

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
        INDEXSTRIDE,
        INDEXINGMODE,
        ENDCAPSMODE;

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
            __member(8),
            __member(4),
            __member(4)
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
        INDEXINGMODE = layout.offsetof(11);
        ENDCAPSMODE = layout.offsetof(12);
    }

    protected VkAccelerationStructureGeometryLinearSweptSpheresDataNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAccelerationStructureGeometryLinearSweptSpheresDataNV create(long address, @Nullable ByteBuffer container) {
        return new VkAccelerationStructureGeometryLinearSweptSpheresDataNV(address, container);
    }

    /**
     * Creates a {@code VkAccelerationStructureGeometryLinearSweptSpheresDataNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV(ByteBuffer container) {
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
    /** @return the value of the {@code indexingMode} field. */
    @NativeType("VkRayTracingLssIndexingModeNV")
    public int indexingMode() { return nindexingMode(address()); }
    /** @return the value of the {@code endCapsMode} field. */
    @NativeType("VkRayTracingLssPrimitiveEndCapsModeNV")
    public int endCapsMode() { return nendCapsMode(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVRayTracingLinearSweptSpheres#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_LINEAR_SWEPT_SPHERES_DATA_NV STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_LINEAR_SWEPT_SPHERES_DATA_NV} value to the {@code sType} field. */
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV sType$Default() { return sType(NVRayTracingLinearSweptSpheres.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_LINEAR_SWEPT_SPHERES_DATA_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code vertexFormat} field. */
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV vertexFormat(@NativeType("VkFormat") int value) { nvertexFormat(address(), value); return this; }
    /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@code vertexData} field. */
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV vertexData(VkDeviceOrHostAddressConstKHR value) { nvertexData(address(), value); return this; }
    /** Passes the {@code vertexData} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV vertexData(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(vertexData()); return this; }
    /** Sets the specified value to the {@code vertexStride} field. */
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV vertexStride(@NativeType("VkDeviceSize") long value) { nvertexStride(address(), value); return this; }
    /** Sets the specified value to the {@code radiusFormat} field. */
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV radiusFormat(@NativeType("VkFormat") int value) { nradiusFormat(address(), value); return this; }
    /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@code radiusData} field. */
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV radiusData(VkDeviceOrHostAddressConstKHR value) { nradiusData(address(), value); return this; }
    /** Passes the {@code radiusData} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV radiusData(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(radiusData()); return this; }
    /** Sets the specified value to the {@code radiusStride} field. */
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV radiusStride(@NativeType("VkDeviceSize") long value) { nradiusStride(address(), value); return this; }
    /** Sets the specified value to the {@code indexType} field. */
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV indexType(@NativeType("VkIndexType") int value) { nindexType(address(), value); return this; }
    /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@code indexData} field. */
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV indexData(VkDeviceOrHostAddressConstKHR value) { nindexData(address(), value); return this; }
    /** Passes the {@code indexData} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV indexData(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(indexData()); return this; }
    /** Sets the specified value to the {@code indexStride} field. */
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV indexStride(@NativeType("VkDeviceSize") long value) { nindexStride(address(), value); return this; }
    /** Sets the specified value to the {@code indexingMode} field. */
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV indexingMode(@NativeType("VkRayTracingLssIndexingModeNV") int value) { nindexingMode(address(), value); return this; }
    /** Sets the specified value to the {@code endCapsMode} field. */
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV endCapsMode(@NativeType("VkRayTracingLssPrimitiveEndCapsModeNV") int value) { nendCapsMode(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV set(
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
        long indexStride,
        int indexingMode,
        int endCapsMode
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
        indexingMode(indexingMode);
        endCapsMode(endCapsMode);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV set(VkAccelerationStructureGeometryLinearSweptSpheresDataNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAccelerationStructureGeometryLinearSweptSpheresDataNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureGeometryLinearSweptSpheresDataNV malloc() {
        return new VkAccelerationStructureGeometryLinearSweptSpheresDataNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureGeometryLinearSweptSpheresDataNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureGeometryLinearSweptSpheresDataNV calloc() {
        return new VkAccelerationStructureGeometryLinearSweptSpheresDataNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureGeometryLinearSweptSpheresDataNV} instance allocated with {@link BufferUtils}. */
    public static VkAccelerationStructureGeometryLinearSweptSpheresDataNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureGeometryLinearSweptSpheresDataNV(memAddress(container), container);
    }

    /** Returns a new {@code VkAccelerationStructureGeometryLinearSweptSpheresDataNV} instance for the specified memory address. */
    public static VkAccelerationStructureGeometryLinearSweptSpheresDataNV create(long address) {
        return new VkAccelerationStructureGeometryLinearSweptSpheresDataNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkAccelerationStructureGeometryLinearSweptSpheresDataNV createSafe(long address) {
        return address == NULL ? null : new VkAccelerationStructureGeometryLinearSweptSpheresDataNV(address, null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkAccelerationStructureGeometryLinearSweptSpheresDataNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkAccelerationStructureGeometryLinearSweptSpheresDataNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureGeometryLinearSweptSpheresDataNV malloc(MemoryStack stack) {
        return new VkAccelerationStructureGeometryLinearSweptSpheresDataNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAccelerationStructureGeometryLinearSweptSpheresDataNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureGeometryLinearSweptSpheresDataNV calloc(MemoryStack stack) {
        return new VkAccelerationStructureGeometryLinearSweptSpheresDataNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkAccelerationStructureGeometryLinearSweptSpheresDataNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAccelerationStructureGeometryLinearSweptSpheresDataNV.PNEXT); }
    /** Unsafe version of {@link #vertexFormat}. */
    public static int nvertexFormat(long struct) { return memGetInt(struct + VkAccelerationStructureGeometryLinearSweptSpheresDataNV.VERTEXFORMAT); }
    /** Unsafe version of {@link #vertexData}. */
    public static VkDeviceOrHostAddressConstKHR nvertexData(long struct) { return VkDeviceOrHostAddressConstKHR.create(struct + VkAccelerationStructureGeometryLinearSweptSpheresDataNV.VERTEXDATA); }
    /** Unsafe version of {@link #vertexStride}. */
    public static long nvertexStride(long struct) { return memGetLong(struct + VkAccelerationStructureGeometryLinearSweptSpheresDataNV.VERTEXSTRIDE); }
    /** Unsafe version of {@link #radiusFormat}. */
    public static int nradiusFormat(long struct) { return memGetInt(struct + VkAccelerationStructureGeometryLinearSweptSpheresDataNV.RADIUSFORMAT); }
    /** Unsafe version of {@link #radiusData}. */
    public static VkDeviceOrHostAddressConstKHR nradiusData(long struct) { return VkDeviceOrHostAddressConstKHR.create(struct + VkAccelerationStructureGeometryLinearSweptSpheresDataNV.RADIUSDATA); }
    /** Unsafe version of {@link #radiusStride}. */
    public static long nradiusStride(long struct) { return memGetLong(struct + VkAccelerationStructureGeometryLinearSweptSpheresDataNV.RADIUSSTRIDE); }
    /** Unsafe version of {@link #indexType}. */
    public static int nindexType(long struct) { return memGetInt(struct + VkAccelerationStructureGeometryLinearSweptSpheresDataNV.INDEXTYPE); }
    /** Unsafe version of {@link #indexData}. */
    public static VkDeviceOrHostAddressConstKHR nindexData(long struct) { return VkDeviceOrHostAddressConstKHR.create(struct + VkAccelerationStructureGeometryLinearSweptSpheresDataNV.INDEXDATA); }
    /** Unsafe version of {@link #indexStride}. */
    public static long nindexStride(long struct) { return memGetLong(struct + VkAccelerationStructureGeometryLinearSweptSpheresDataNV.INDEXSTRIDE); }
    /** Unsafe version of {@link #indexingMode}. */
    public static int nindexingMode(long struct) { return memGetInt(struct + VkAccelerationStructureGeometryLinearSweptSpheresDataNV.INDEXINGMODE); }
    /** Unsafe version of {@link #endCapsMode}. */
    public static int nendCapsMode(long struct) { return memGetInt(struct + VkAccelerationStructureGeometryLinearSweptSpheresDataNV.ENDCAPSMODE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkAccelerationStructureGeometryLinearSweptSpheresDataNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAccelerationStructureGeometryLinearSweptSpheresDataNV.PNEXT, value); }
    /** Unsafe version of {@link #vertexFormat(int) vertexFormat}. */
    public static void nvertexFormat(long struct, int value) { memPutInt(struct + VkAccelerationStructureGeometryLinearSweptSpheresDataNV.VERTEXFORMAT, value); }
    /** Unsafe version of {@link #vertexData(VkDeviceOrHostAddressConstKHR) vertexData}. */
    public static void nvertexData(long struct, VkDeviceOrHostAddressConstKHR value) { memCopy(value.address(), struct + VkAccelerationStructureGeometryLinearSweptSpheresDataNV.VERTEXDATA, VkDeviceOrHostAddressConstKHR.SIZEOF); }
    /** Unsafe version of {@link #vertexStride(long) vertexStride}. */
    public static void nvertexStride(long struct, long value) { memPutLong(struct + VkAccelerationStructureGeometryLinearSweptSpheresDataNV.VERTEXSTRIDE, value); }
    /** Unsafe version of {@link #radiusFormat(int) radiusFormat}. */
    public static void nradiusFormat(long struct, int value) { memPutInt(struct + VkAccelerationStructureGeometryLinearSweptSpheresDataNV.RADIUSFORMAT, value); }
    /** Unsafe version of {@link #radiusData(VkDeviceOrHostAddressConstKHR) radiusData}. */
    public static void nradiusData(long struct, VkDeviceOrHostAddressConstKHR value) { memCopy(value.address(), struct + VkAccelerationStructureGeometryLinearSweptSpheresDataNV.RADIUSDATA, VkDeviceOrHostAddressConstKHR.SIZEOF); }
    /** Unsafe version of {@link #radiusStride(long) radiusStride}. */
    public static void nradiusStride(long struct, long value) { memPutLong(struct + VkAccelerationStructureGeometryLinearSweptSpheresDataNV.RADIUSSTRIDE, value); }
    /** Unsafe version of {@link #indexType(int) indexType}. */
    public static void nindexType(long struct, int value) { memPutInt(struct + VkAccelerationStructureGeometryLinearSweptSpheresDataNV.INDEXTYPE, value); }
    /** Unsafe version of {@link #indexData(VkDeviceOrHostAddressConstKHR) indexData}. */
    public static void nindexData(long struct, VkDeviceOrHostAddressConstKHR value) { memCopy(value.address(), struct + VkAccelerationStructureGeometryLinearSweptSpheresDataNV.INDEXDATA, VkDeviceOrHostAddressConstKHR.SIZEOF); }
    /** Unsafe version of {@link #indexStride(long) indexStride}. */
    public static void nindexStride(long struct, long value) { memPutLong(struct + VkAccelerationStructureGeometryLinearSweptSpheresDataNV.INDEXSTRIDE, value); }
    /** Unsafe version of {@link #indexingMode(int) indexingMode}. */
    public static void nindexingMode(long struct, int value) { memPutInt(struct + VkAccelerationStructureGeometryLinearSweptSpheresDataNV.INDEXINGMODE, value); }
    /** Unsafe version of {@link #endCapsMode(int) endCapsMode}. */
    public static void nendCapsMode(long struct, int value) { memPutInt(struct + VkAccelerationStructureGeometryLinearSweptSpheresDataNV.ENDCAPSMODE, value); }

    // -----------------------------------

    /** An array of {@link VkAccelerationStructureGeometryLinearSweptSpheresDataNV} structs. */
    public static class Buffer extends StructBuffer<VkAccelerationStructureGeometryLinearSweptSpheresDataNV, Buffer> implements NativeResource {

        private static final VkAccelerationStructureGeometryLinearSweptSpheresDataNV ELEMENT_FACTORY = VkAccelerationStructureGeometryLinearSweptSpheresDataNV.create(-1L);

        /**
         * Creates a new {@code VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAccelerationStructureGeometryLinearSweptSpheresDataNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkAccelerationStructureGeometryLinearSweptSpheresDataNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkAccelerationStructureGeometryLinearSweptSpheresDataNV.npNext(address()); }
        /** @return the value of the {@code vertexFormat} field. */
        @NativeType("VkFormat")
        public int vertexFormat() { return VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nvertexFormat(address()); }
        /** @return a {@link VkDeviceOrHostAddressConstKHR} view of the {@code vertexData} field. */
        public VkDeviceOrHostAddressConstKHR vertexData() { return VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nvertexData(address()); }
        /** @return the value of the {@code vertexStride} field. */
        @NativeType("VkDeviceSize")
        public long vertexStride() { return VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nvertexStride(address()); }
        /** @return the value of the {@code radiusFormat} field. */
        @NativeType("VkFormat")
        public int radiusFormat() { return VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nradiusFormat(address()); }
        /** @return a {@link VkDeviceOrHostAddressConstKHR} view of the {@code radiusData} field. */
        public VkDeviceOrHostAddressConstKHR radiusData() { return VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nradiusData(address()); }
        /** @return the value of the {@code radiusStride} field. */
        @NativeType("VkDeviceSize")
        public long radiusStride() { return VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nradiusStride(address()); }
        /** @return the value of the {@code indexType} field. */
        @NativeType("VkIndexType")
        public int indexType() { return VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nindexType(address()); }
        /** @return a {@link VkDeviceOrHostAddressConstKHR} view of the {@code indexData} field. */
        public VkDeviceOrHostAddressConstKHR indexData() { return VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nindexData(address()); }
        /** @return the value of the {@code indexStride} field. */
        @NativeType("VkDeviceSize")
        public long indexStride() { return VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nindexStride(address()); }
        /** @return the value of the {@code indexingMode} field. */
        @NativeType("VkRayTracingLssIndexingModeNV")
        public int indexingMode() { return VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nindexingMode(address()); }
        /** @return the value of the {@code endCapsMode} field. */
        @NativeType("VkRayTracingLssPrimitiveEndCapsModeNV")
        public int endCapsMode() { return VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nendCapsMode(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer sType(@NativeType("VkStructureType") int value) { VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nsType(address(), value); return this; }
        /** Sets the {@link NVRayTracingLinearSweptSpheres#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_LINEAR_SWEPT_SPHERES_DATA_NV STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_LINEAR_SWEPT_SPHERES_DATA_NV} value to the {@code sType} field. */
        public VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer sType$Default() { return sType(NVRayTracingLinearSweptSpheres.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_LINEAR_SWEPT_SPHERES_DATA_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer pNext(@NativeType("void const *") long value) { VkAccelerationStructureGeometryLinearSweptSpheresDataNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code vertexFormat} field. */
        public VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer vertexFormat(@NativeType("VkFormat") int value) { VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nvertexFormat(address(), value); return this; }
        /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@code vertexData} field. */
        public VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer vertexData(VkDeviceOrHostAddressConstKHR value) { VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nvertexData(address(), value); return this; }
        /** Passes the {@code vertexData} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer vertexData(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(vertexData()); return this; }
        /** Sets the specified value to the {@code vertexStride} field. */
        public VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer vertexStride(@NativeType("VkDeviceSize") long value) { VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nvertexStride(address(), value); return this; }
        /** Sets the specified value to the {@code radiusFormat} field. */
        public VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer radiusFormat(@NativeType("VkFormat") int value) { VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nradiusFormat(address(), value); return this; }
        /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@code radiusData} field. */
        public VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer radiusData(VkDeviceOrHostAddressConstKHR value) { VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nradiusData(address(), value); return this; }
        /** Passes the {@code radiusData} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer radiusData(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(radiusData()); return this; }
        /** Sets the specified value to the {@code radiusStride} field. */
        public VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer radiusStride(@NativeType("VkDeviceSize") long value) { VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nradiusStride(address(), value); return this; }
        /** Sets the specified value to the {@code indexType} field. */
        public VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer indexType(@NativeType("VkIndexType") int value) { VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nindexType(address(), value); return this; }
        /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@code indexData} field. */
        public VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer indexData(VkDeviceOrHostAddressConstKHR value) { VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nindexData(address(), value); return this; }
        /** Passes the {@code indexData} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer indexData(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(indexData()); return this; }
        /** Sets the specified value to the {@code indexStride} field. */
        public VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer indexStride(@NativeType("VkDeviceSize") long value) { VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nindexStride(address(), value); return this; }
        /** Sets the specified value to the {@code indexingMode} field. */
        public VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer indexingMode(@NativeType("VkRayTracingLssIndexingModeNV") int value) { VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nindexingMode(address(), value); return this; }
        /** Sets the specified value to the {@code endCapsMode} field. */
        public VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer endCapsMode(@NativeType("VkRayTracingLssPrimitiveEndCapsModeNV") int value) { VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nendCapsMode(address(), value); return this; }

    }

}