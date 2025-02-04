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
 * struct VkClusterAccelerationStructureBuildTriangleClusterInfoNV {
 *     uint32_t clusterID;
 *     VkClusterAccelerationStructureClusterFlagsNV clusterFlags;
 *     uint32_t triangleCount : 9;
 *     uint32_t vertexCount : 9;
 *     uint32_t positionTruncateBitCount : 6;
 *     uint32_t indexType : 4;
 *     uint32_t opacityMicromapIndexType : 4;
 *     {@link VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV} baseGeometryIndexAndGeometryFlags;
 *     uint16_t indexBufferStride;
 *     uint16_t vertexBufferStride;
 *     uint16_t geometryIndexAndFlagsBufferStride;
 *     uint16_t opacityMicromapIndexBufferStride;
 *     VkDeviceAddress indexBuffer;
 *     VkDeviceAddress vertexBuffer;
 *     VkDeviceAddress geometryIndexAndFlagsBuffer;
 *     VkDeviceAddress opacityMicromapArray;
 *     VkDeviceAddress opacityMicromapIndexBuffer;
 * }}</pre>
 */
public class VkClusterAccelerationStructureBuildTriangleClusterInfoNV extends Struct<VkClusterAccelerationStructureBuildTriangleClusterInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CLUSTERID,
        CLUSTERFLAGS,
        BITFIELD0,
        BASEGEOMETRYINDEXANDGEOMETRYFLAGS,
        INDEXBUFFERSTRIDE,
        VERTEXBUFFERSTRIDE,
        GEOMETRYINDEXANDFLAGSBUFFERSTRIDE,
        OPACITYMICROMAPINDEXBUFFERSTRIDE,
        INDEXBUFFER,
        VERTEXBUFFER,
        GEOMETRYINDEXANDFLAGSBUFFER,
        OPACITYMICROMAPARRAY,
        OPACITYMICROMAPINDEXBUFFER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.SIZEOF, VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.ALIGNOF),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CLUSTERID = layout.offsetof(0);
        CLUSTERFLAGS = layout.offsetof(1);
        BITFIELD0 = layout.offsetof(2);
        BASEGEOMETRYINDEXANDGEOMETRYFLAGS = layout.offsetof(3);
        INDEXBUFFERSTRIDE = layout.offsetof(4);
        VERTEXBUFFERSTRIDE = layout.offsetof(5);
        GEOMETRYINDEXANDFLAGSBUFFERSTRIDE = layout.offsetof(6);
        OPACITYMICROMAPINDEXBUFFERSTRIDE = layout.offsetof(7);
        INDEXBUFFER = layout.offsetof(8);
        VERTEXBUFFER = layout.offsetof(9);
        GEOMETRYINDEXANDFLAGSBUFFER = layout.offsetof(10);
        OPACITYMICROMAPARRAY = layout.offsetof(11);
        OPACITYMICROMAPINDEXBUFFER = layout.offsetof(12);
    }

    protected VkClusterAccelerationStructureBuildTriangleClusterInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkClusterAccelerationStructureBuildTriangleClusterInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkClusterAccelerationStructureBuildTriangleClusterInfoNV(address, container);
    }

    /**
     * Creates a {@code VkClusterAccelerationStructureBuildTriangleClusterInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code clusterID} field. */
    @NativeType("uint32_t")
    public int clusterID() { return nclusterID(address()); }
    /** @return the value of the {@code clusterFlags} field. */
    @NativeType("VkClusterAccelerationStructureClusterFlagsNV")
    public int clusterFlags() { return nclusterFlags(address()); }
    /** @return the value of the {@code triangleCount} field. */
    @NativeType("uint32_t")
    public int triangleCount() { return ntriangleCount(address()); }
    /** @return the value of the {@code vertexCount} field. */
    @NativeType("uint32_t")
    public int vertexCount() { return nvertexCount(address()); }
    /** @return the value of the {@code positionTruncateBitCount} field. */
    @NativeType("uint32_t")
    public int positionTruncateBitCount() { return npositionTruncateBitCount(address()); }
    /** @return the value of the {@code indexType} field. */
    @NativeType("uint32_t")
    public int indexType() { return nindexType(address()); }
    /** @return the value of the {@code opacityMicromapIndexType} field. */
    @NativeType("uint32_t")
    public int opacityMicromapIndexType() { return nopacityMicromapIndexType(address()); }
    /** @return a {@link VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV} view of the {@code baseGeometryIndexAndGeometryFlags} field. */
    public VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV baseGeometryIndexAndGeometryFlags() { return nbaseGeometryIndexAndGeometryFlags(address()); }
    /** @return the value of the {@code indexBufferStride} field. */
    @NativeType("uint16_t")
    public short indexBufferStride() { return nindexBufferStride(address()); }
    /** @return the value of the {@code vertexBufferStride} field. */
    @NativeType("uint16_t")
    public short vertexBufferStride() { return nvertexBufferStride(address()); }
    /** @return the value of the {@code geometryIndexAndFlagsBufferStride} field. */
    @NativeType("uint16_t")
    public short geometryIndexAndFlagsBufferStride() { return ngeometryIndexAndFlagsBufferStride(address()); }
    /** @return the value of the {@code opacityMicromapIndexBufferStride} field. */
    @NativeType("uint16_t")
    public short opacityMicromapIndexBufferStride() { return nopacityMicromapIndexBufferStride(address()); }
    /** @return the value of the {@code indexBuffer} field. */
    @NativeType("VkDeviceAddress")
    public long indexBuffer() { return nindexBuffer(address()); }
    /** @return the value of the {@code vertexBuffer} field. */
    @NativeType("VkDeviceAddress")
    public long vertexBuffer() { return nvertexBuffer(address()); }
    /** @return the value of the {@code geometryIndexAndFlagsBuffer} field. */
    @NativeType("VkDeviceAddress")
    public long geometryIndexAndFlagsBuffer() { return ngeometryIndexAndFlagsBuffer(address()); }
    /** @return the value of the {@code opacityMicromapArray} field. */
    @NativeType("VkDeviceAddress")
    public long opacityMicromapArray() { return nopacityMicromapArray(address()); }
    /** @return the value of the {@code opacityMicromapIndexBuffer} field. */
    @NativeType("VkDeviceAddress")
    public long opacityMicromapIndexBuffer() { return nopacityMicromapIndexBuffer(address()); }

    /** Sets the specified value to the {@code clusterID} field. */
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV clusterID(@NativeType("uint32_t") int value) { nclusterID(address(), value); return this; }
    /** Sets the specified value to the {@code clusterFlags} field. */
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV clusterFlags(@NativeType("VkClusterAccelerationStructureClusterFlagsNV") int value) { nclusterFlags(address(), value); return this; }
    /** Sets the specified value to the {@code triangleCount} field. */
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV triangleCount(@NativeType("uint32_t") int value) { ntriangleCount(address(), value); return this; }
    /** Sets the specified value to the {@code vertexCount} field. */
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV vertexCount(@NativeType("uint32_t") int value) { nvertexCount(address(), value); return this; }
    /** Sets the specified value to the {@code positionTruncateBitCount} field. */
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV positionTruncateBitCount(@NativeType("uint32_t") int value) { npositionTruncateBitCount(address(), value); return this; }
    /** Sets the specified value to the {@code indexType} field. */
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV indexType(@NativeType("uint32_t") int value) { nindexType(address(), value); return this; }
    /** Sets the specified value to the {@code opacityMicromapIndexType} field. */
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV opacityMicromapIndexType(@NativeType("uint32_t") int value) { nopacityMicromapIndexType(address(), value); return this; }
    /** Copies the specified {@link VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV} to the {@code baseGeometryIndexAndGeometryFlags} field. */
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV baseGeometryIndexAndGeometryFlags(VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV value) { nbaseGeometryIndexAndGeometryFlags(address(), value); return this; }
    /** Passes the {@code baseGeometryIndexAndGeometryFlags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV baseGeometryIndexAndGeometryFlags(java.util.function.Consumer<VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV> consumer) { consumer.accept(baseGeometryIndexAndGeometryFlags()); return this; }
    /** Sets the specified value to the {@code indexBufferStride} field. */
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV indexBufferStride(@NativeType("uint16_t") short value) { nindexBufferStride(address(), value); return this; }
    /** Sets the specified value to the {@code vertexBufferStride} field. */
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV vertexBufferStride(@NativeType("uint16_t") short value) { nvertexBufferStride(address(), value); return this; }
    /** Sets the specified value to the {@code geometryIndexAndFlagsBufferStride} field. */
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV geometryIndexAndFlagsBufferStride(@NativeType("uint16_t") short value) { ngeometryIndexAndFlagsBufferStride(address(), value); return this; }
    /** Sets the specified value to the {@code opacityMicromapIndexBufferStride} field. */
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV opacityMicromapIndexBufferStride(@NativeType("uint16_t") short value) { nopacityMicromapIndexBufferStride(address(), value); return this; }
    /** Sets the specified value to the {@code indexBuffer} field. */
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV indexBuffer(@NativeType("VkDeviceAddress") long value) { nindexBuffer(address(), value); return this; }
    /** Sets the specified value to the {@code vertexBuffer} field. */
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV vertexBuffer(@NativeType("VkDeviceAddress") long value) { nvertexBuffer(address(), value); return this; }
    /** Sets the specified value to the {@code geometryIndexAndFlagsBuffer} field. */
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV geometryIndexAndFlagsBuffer(@NativeType("VkDeviceAddress") long value) { ngeometryIndexAndFlagsBuffer(address(), value); return this; }
    /** Sets the specified value to the {@code opacityMicromapArray} field. */
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV opacityMicromapArray(@NativeType("VkDeviceAddress") long value) { nopacityMicromapArray(address(), value); return this; }
    /** Sets the specified value to the {@code opacityMicromapIndexBuffer} field. */
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV opacityMicromapIndexBuffer(@NativeType("VkDeviceAddress") long value) { nopacityMicromapIndexBuffer(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV set(
        int clusterID,
        int clusterFlags,
        int triangleCount,
        int vertexCount,
        int positionTruncateBitCount,
        int indexType,
        int opacityMicromapIndexType,
        VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV baseGeometryIndexAndGeometryFlags,
        short indexBufferStride,
        short vertexBufferStride,
        short geometryIndexAndFlagsBufferStride,
        short opacityMicromapIndexBufferStride,
        long indexBuffer,
        long vertexBuffer,
        long geometryIndexAndFlagsBuffer,
        long opacityMicromapArray,
        long opacityMicromapIndexBuffer
    ) {
        clusterID(clusterID);
        clusterFlags(clusterFlags);
        triangleCount(triangleCount);
        vertexCount(vertexCount);
        positionTruncateBitCount(positionTruncateBitCount);
        indexType(indexType);
        opacityMicromapIndexType(opacityMicromapIndexType);
        baseGeometryIndexAndGeometryFlags(baseGeometryIndexAndGeometryFlags);
        indexBufferStride(indexBufferStride);
        vertexBufferStride(vertexBufferStride);
        geometryIndexAndFlagsBufferStride(geometryIndexAndFlagsBufferStride);
        opacityMicromapIndexBufferStride(opacityMicromapIndexBufferStride);
        indexBuffer(indexBuffer);
        vertexBuffer(vertexBuffer);
        geometryIndexAndFlagsBuffer(geometryIndexAndFlagsBuffer);
        opacityMicromapArray(opacityMicromapArray);
        opacityMicromapIndexBuffer(opacityMicromapIndexBuffer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV set(VkClusterAccelerationStructureBuildTriangleClusterInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkClusterAccelerationStructureBuildTriangleClusterInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkClusterAccelerationStructureBuildTriangleClusterInfoNV malloc() {
        return new VkClusterAccelerationStructureBuildTriangleClusterInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkClusterAccelerationStructureBuildTriangleClusterInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkClusterAccelerationStructureBuildTriangleClusterInfoNV calloc() {
        return new VkClusterAccelerationStructureBuildTriangleClusterInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkClusterAccelerationStructureBuildTriangleClusterInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkClusterAccelerationStructureBuildTriangleClusterInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkClusterAccelerationStructureBuildTriangleClusterInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkClusterAccelerationStructureBuildTriangleClusterInfoNV} instance for the specified memory address. */
    public static VkClusterAccelerationStructureBuildTriangleClusterInfoNV create(long address) {
        return new VkClusterAccelerationStructureBuildTriangleClusterInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkClusterAccelerationStructureBuildTriangleClusterInfoNV createSafe(long address) {
        return address == NULL ? null : new VkClusterAccelerationStructureBuildTriangleClusterInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkClusterAccelerationStructureBuildTriangleClusterInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkClusterAccelerationStructureBuildTriangleClusterInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkClusterAccelerationStructureBuildTriangleClusterInfoNV malloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureBuildTriangleClusterInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkClusterAccelerationStructureBuildTriangleClusterInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkClusterAccelerationStructureBuildTriangleClusterInfoNV calloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureBuildTriangleClusterInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #clusterID}. */
    public static int nclusterID(long struct) { return memGetInt(struct + VkClusterAccelerationStructureBuildTriangleClusterInfoNV.CLUSTERID); }
    /** Unsafe version of {@link #clusterFlags}. */
    public static int nclusterFlags(long struct) { return memGetInt(struct + VkClusterAccelerationStructureBuildTriangleClusterInfoNV.CLUSTERFLAGS); }
    public static int nbitfield0(long struct) { return memGetInt(struct + VkClusterAccelerationStructureBuildTriangleClusterInfoNV.BITFIELD0); }
    /** Unsafe version of {@link #triangleCount}. */
    public static int ntriangleCount(long struct) { return nbitfield0(struct) & 0x00_00_01_FF; }
    /** Unsafe version of {@link #vertexCount}. */
    public static int nvertexCount(long struct) { return (nbitfield0(struct) & 0x00_03_FE_00) >>> 9; }
    /** Unsafe version of {@link #positionTruncateBitCount}. */
    public static int npositionTruncateBitCount(long struct) { return (nbitfield0(struct) & 0x00_FC_00_00) >>> 18; }
    /** Unsafe version of {@link #indexType}. */
    public static int nindexType(long struct) { return (nbitfield0(struct) & 0x0F_00_00_00) >>> 24; }
    /** Unsafe version of {@link #opacityMicromapIndexType}. */
    public static int nopacityMicromapIndexType(long struct) { return nbitfield0(struct) >>> 28; }
    /** Unsafe version of {@link #baseGeometryIndexAndGeometryFlags}. */
    public static VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV nbaseGeometryIndexAndGeometryFlags(long struct) { return VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.create(struct + VkClusterAccelerationStructureBuildTriangleClusterInfoNV.BASEGEOMETRYINDEXANDGEOMETRYFLAGS); }
    /** Unsafe version of {@link #indexBufferStride}. */
    public static short nindexBufferStride(long struct) { return memGetShort(struct + VkClusterAccelerationStructureBuildTriangleClusterInfoNV.INDEXBUFFERSTRIDE); }
    /** Unsafe version of {@link #vertexBufferStride}. */
    public static short nvertexBufferStride(long struct) { return memGetShort(struct + VkClusterAccelerationStructureBuildTriangleClusterInfoNV.VERTEXBUFFERSTRIDE); }
    /** Unsafe version of {@link #geometryIndexAndFlagsBufferStride}. */
    public static short ngeometryIndexAndFlagsBufferStride(long struct) { return memGetShort(struct + VkClusterAccelerationStructureBuildTriangleClusterInfoNV.GEOMETRYINDEXANDFLAGSBUFFERSTRIDE); }
    /** Unsafe version of {@link #opacityMicromapIndexBufferStride}. */
    public static short nopacityMicromapIndexBufferStride(long struct) { return memGetShort(struct + VkClusterAccelerationStructureBuildTriangleClusterInfoNV.OPACITYMICROMAPINDEXBUFFERSTRIDE); }
    /** Unsafe version of {@link #indexBuffer}. */
    public static long nindexBuffer(long struct) { return memGetLong(struct + VkClusterAccelerationStructureBuildTriangleClusterInfoNV.INDEXBUFFER); }
    /** Unsafe version of {@link #vertexBuffer}. */
    public static long nvertexBuffer(long struct) { return memGetLong(struct + VkClusterAccelerationStructureBuildTriangleClusterInfoNV.VERTEXBUFFER); }
    /** Unsafe version of {@link #geometryIndexAndFlagsBuffer}. */
    public static long ngeometryIndexAndFlagsBuffer(long struct) { return memGetLong(struct + VkClusterAccelerationStructureBuildTriangleClusterInfoNV.GEOMETRYINDEXANDFLAGSBUFFER); }
    /** Unsafe version of {@link #opacityMicromapArray}. */
    public static long nopacityMicromapArray(long struct) { return memGetLong(struct + VkClusterAccelerationStructureBuildTriangleClusterInfoNV.OPACITYMICROMAPARRAY); }
    /** Unsafe version of {@link #opacityMicromapIndexBuffer}. */
    public static long nopacityMicromapIndexBuffer(long struct) { return memGetLong(struct + VkClusterAccelerationStructureBuildTriangleClusterInfoNV.OPACITYMICROMAPINDEXBUFFER); }

    /** Unsafe version of {@link #clusterID(int) clusterID}. */
    public static void nclusterID(long struct, int value) { memPutInt(struct + VkClusterAccelerationStructureBuildTriangleClusterInfoNV.CLUSTERID, value); }
    /** Unsafe version of {@link #clusterFlags(int) clusterFlags}. */
    public static void nclusterFlags(long struct, int value) { memPutInt(struct + VkClusterAccelerationStructureBuildTriangleClusterInfoNV.CLUSTERFLAGS, value); }
    public static void nbitfield0(long struct, int value) { memPutInt(struct + VkClusterAccelerationStructureBuildTriangleClusterInfoNV.BITFIELD0, value); }
    /** Unsafe version of {@link #triangleCount(int) triangleCount}. */
    public static void ntriangleCount(long struct, int value) { nbitfield0(struct, (nbitfield0(struct) & 0xFF_FF_FE_00) | (value & 0x00_00_01_FF)); }
    /** Unsafe version of {@link #vertexCount(int) vertexCount}. */
    public static void nvertexCount(long struct, int value) { nbitfield0(struct, ((value << 9) & 0x00_03_FE_00) | (nbitfield0(struct) & 0xFF_FC_01_FF)); }
    /** Unsafe version of {@link #positionTruncateBitCount(int) positionTruncateBitCount}. */
    public static void npositionTruncateBitCount(long struct, int value) { nbitfield0(struct, ((value << 18) & 0x00_FC_00_00) | (nbitfield0(struct) & 0xFF_03_FF_FF)); }
    /** Unsafe version of {@link #indexType(int) indexType}. */
    public static void nindexType(long struct, int value) { nbitfield0(struct, ((value << 24) & 0x0F_00_00_00) | (nbitfield0(struct) & 0xF0_FF_FF_FF)); }
    /** Unsafe version of {@link #opacityMicromapIndexType(int) opacityMicromapIndexType}. */
    public static void nopacityMicromapIndexType(long struct, int value) { nbitfield0(struct, (value << 28) | (nbitfield0(struct) & 0x0F_FF_FF_FF)); }
    /** Unsafe version of {@link #baseGeometryIndexAndGeometryFlags(VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV) baseGeometryIndexAndGeometryFlags}. */
    public static void nbaseGeometryIndexAndGeometryFlags(long struct, VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV value) { memCopy(value.address(), struct + VkClusterAccelerationStructureBuildTriangleClusterInfoNV.BASEGEOMETRYINDEXANDGEOMETRYFLAGS, VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.SIZEOF); }
    /** Unsafe version of {@link #indexBufferStride(short) indexBufferStride}. */
    public static void nindexBufferStride(long struct, short value) { memPutShort(struct + VkClusterAccelerationStructureBuildTriangleClusterInfoNV.INDEXBUFFERSTRIDE, value); }
    /** Unsafe version of {@link #vertexBufferStride(short) vertexBufferStride}. */
    public static void nvertexBufferStride(long struct, short value) { memPutShort(struct + VkClusterAccelerationStructureBuildTriangleClusterInfoNV.VERTEXBUFFERSTRIDE, value); }
    /** Unsafe version of {@link #geometryIndexAndFlagsBufferStride(short) geometryIndexAndFlagsBufferStride}. */
    public static void ngeometryIndexAndFlagsBufferStride(long struct, short value) { memPutShort(struct + VkClusterAccelerationStructureBuildTriangleClusterInfoNV.GEOMETRYINDEXANDFLAGSBUFFERSTRIDE, value); }
    /** Unsafe version of {@link #opacityMicromapIndexBufferStride(short) opacityMicromapIndexBufferStride}. */
    public static void nopacityMicromapIndexBufferStride(long struct, short value) { memPutShort(struct + VkClusterAccelerationStructureBuildTriangleClusterInfoNV.OPACITYMICROMAPINDEXBUFFERSTRIDE, value); }
    /** Unsafe version of {@link #indexBuffer(long) indexBuffer}. */
    public static void nindexBuffer(long struct, long value) { memPutLong(struct + VkClusterAccelerationStructureBuildTriangleClusterInfoNV.INDEXBUFFER, value); }
    /** Unsafe version of {@link #vertexBuffer(long) vertexBuffer}. */
    public static void nvertexBuffer(long struct, long value) { memPutLong(struct + VkClusterAccelerationStructureBuildTriangleClusterInfoNV.VERTEXBUFFER, value); }
    /** Unsafe version of {@link #geometryIndexAndFlagsBuffer(long) geometryIndexAndFlagsBuffer}. */
    public static void ngeometryIndexAndFlagsBuffer(long struct, long value) { memPutLong(struct + VkClusterAccelerationStructureBuildTriangleClusterInfoNV.GEOMETRYINDEXANDFLAGSBUFFER, value); }
    /** Unsafe version of {@link #opacityMicromapArray(long) opacityMicromapArray}. */
    public static void nopacityMicromapArray(long struct, long value) { memPutLong(struct + VkClusterAccelerationStructureBuildTriangleClusterInfoNV.OPACITYMICROMAPARRAY, value); }
    /** Unsafe version of {@link #opacityMicromapIndexBuffer(long) opacityMicromapIndexBuffer}. */
    public static void nopacityMicromapIndexBuffer(long struct, long value) { memPutLong(struct + VkClusterAccelerationStructureBuildTriangleClusterInfoNV.OPACITYMICROMAPINDEXBUFFER, value); }

    // -----------------------------------

    /** An array of {@link VkClusterAccelerationStructureBuildTriangleClusterInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkClusterAccelerationStructureBuildTriangleClusterInfoNV, Buffer> implements NativeResource {

        private static final VkClusterAccelerationStructureBuildTriangleClusterInfoNV ELEMENT_FACTORY = VkClusterAccelerationStructureBuildTriangleClusterInfoNV.create(-1L);

        /**
         * Creates a new {@code VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkClusterAccelerationStructureBuildTriangleClusterInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkClusterAccelerationStructureBuildTriangleClusterInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code clusterID} field. */
        @NativeType("uint32_t")
        public int clusterID() { return VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nclusterID(address()); }
        /** @return the value of the {@code clusterFlags} field. */
        @NativeType("VkClusterAccelerationStructureClusterFlagsNV")
        public int clusterFlags() { return VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nclusterFlags(address()); }
        /** @return the value of the {@code triangleCount} field. */
        @NativeType("uint32_t")
        public int triangleCount() { return VkClusterAccelerationStructureBuildTriangleClusterInfoNV.ntriangleCount(address()); }
        /** @return the value of the {@code vertexCount} field. */
        @NativeType("uint32_t")
        public int vertexCount() { return VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nvertexCount(address()); }
        /** @return the value of the {@code positionTruncateBitCount} field. */
        @NativeType("uint32_t")
        public int positionTruncateBitCount() { return VkClusterAccelerationStructureBuildTriangleClusterInfoNV.npositionTruncateBitCount(address()); }
        /** @return the value of the {@code indexType} field. */
        @NativeType("uint32_t")
        public int indexType() { return VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nindexType(address()); }
        /** @return the value of the {@code opacityMicromapIndexType} field. */
        @NativeType("uint32_t")
        public int opacityMicromapIndexType() { return VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nopacityMicromapIndexType(address()); }
        /** @return a {@link VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV} view of the {@code baseGeometryIndexAndGeometryFlags} field. */
        public VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV baseGeometryIndexAndGeometryFlags() { return VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nbaseGeometryIndexAndGeometryFlags(address()); }
        /** @return the value of the {@code indexBufferStride} field. */
        @NativeType("uint16_t")
        public short indexBufferStride() { return VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nindexBufferStride(address()); }
        /** @return the value of the {@code vertexBufferStride} field. */
        @NativeType("uint16_t")
        public short vertexBufferStride() { return VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nvertexBufferStride(address()); }
        /** @return the value of the {@code geometryIndexAndFlagsBufferStride} field. */
        @NativeType("uint16_t")
        public short geometryIndexAndFlagsBufferStride() { return VkClusterAccelerationStructureBuildTriangleClusterInfoNV.ngeometryIndexAndFlagsBufferStride(address()); }
        /** @return the value of the {@code opacityMicromapIndexBufferStride} field. */
        @NativeType("uint16_t")
        public short opacityMicromapIndexBufferStride() { return VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nopacityMicromapIndexBufferStride(address()); }
        /** @return the value of the {@code indexBuffer} field. */
        @NativeType("VkDeviceAddress")
        public long indexBuffer() { return VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nindexBuffer(address()); }
        /** @return the value of the {@code vertexBuffer} field. */
        @NativeType("VkDeviceAddress")
        public long vertexBuffer() { return VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nvertexBuffer(address()); }
        /** @return the value of the {@code geometryIndexAndFlagsBuffer} field. */
        @NativeType("VkDeviceAddress")
        public long geometryIndexAndFlagsBuffer() { return VkClusterAccelerationStructureBuildTriangleClusterInfoNV.ngeometryIndexAndFlagsBuffer(address()); }
        /** @return the value of the {@code opacityMicromapArray} field. */
        @NativeType("VkDeviceAddress")
        public long opacityMicromapArray() { return VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nopacityMicromapArray(address()); }
        /** @return the value of the {@code opacityMicromapIndexBuffer} field. */
        @NativeType("VkDeviceAddress")
        public long opacityMicromapIndexBuffer() { return VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nopacityMicromapIndexBuffer(address()); }

        /** Sets the specified value to the {@code clusterID} field. */
        public VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer clusterID(@NativeType("uint32_t") int value) { VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nclusterID(address(), value); return this; }
        /** Sets the specified value to the {@code clusterFlags} field. */
        public VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer clusterFlags(@NativeType("VkClusterAccelerationStructureClusterFlagsNV") int value) { VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nclusterFlags(address(), value); return this; }
        /** Sets the specified value to the {@code triangleCount} field. */
        public VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer triangleCount(@NativeType("uint32_t") int value) { VkClusterAccelerationStructureBuildTriangleClusterInfoNV.ntriangleCount(address(), value); return this; }
        /** Sets the specified value to the {@code vertexCount} field. */
        public VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer vertexCount(@NativeType("uint32_t") int value) { VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nvertexCount(address(), value); return this; }
        /** Sets the specified value to the {@code positionTruncateBitCount} field. */
        public VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer positionTruncateBitCount(@NativeType("uint32_t") int value) { VkClusterAccelerationStructureBuildTriangleClusterInfoNV.npositionTruncateBitCount(address(), value); return this; }
        /** Sets the specified value to the {@code indexType} field. */
        public VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer indexType(@NativeType("uint32_t") int value) { VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nindexType(address(), value); return this; }
        /** Sets the specified value to the {@code opacityMicromapIndexType} field. */
        public VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer opacityMicromapIndexType(@NativeType("uint32_t") int value) { VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nopacityMicromapIndexType(address(), value); return this; }
        /** Copies the specified {@link VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV} to the {@code baseGeometryIndexAndGeometryFlags} field. */
        public VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer baseGeometryIndexAndGeometryFlags(VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV value) { VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nbaseGeometryIndexAndGeometryFlags(address(), value); return this; }
        /** Passes the {@code baseGeometryIndexAndGeometryFlags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer baseGeometryIndexAndGeometryFlags(java.util.function.Consumer<VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV> consumer) { consumer.accept(baseGeometryIndexAndGeometryFlags()); return this; }
        /** Sets the specified value to the {@code indexBufferStride} field. */
        public VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer indexBufferStride(@NativeType("uint16_t") short value) { VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nindexBufferStride(address(), value); return this; }
        /** Sets the specified value to the {@code vertexBufferStride} field. */
        public VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer vertexBufferStride(@NativeType("uint16_t") short value) { VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nvertexBufferStride(address(), value); return this; }
        /** Sets the specified value to the {@code geometryIndexAndFlagsBufferStride} field. */
        public VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer geometryIndexAndFlagsBufferStride(@NativeType("uint16_t") short value) { VkClusterAccelerationStructureBuildTriangleClusterInfoNV.ngeometryIndexAndFlagsBufferStride(address(), value); return this; }
        /** Sets the specified value to the {@code opacityMicromapIndexBufferStride} field. */
        public VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer opacityMicromapIndexBufferStride(@NativeType("uint16_t") short value) { VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nopacityMicromapIndexBufferStride(address(), value); return this; }
        /** Sets the specified value to the {@code indexBuffer} field. */
        public VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer indexBuffer(@NativeType("VkDeviceAddress") long value) { VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nindexBuffer(address(), value); return this; }
        /** Sets the specified value to the {@code vertexBuffer} field. */
        public VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer vertexBuffer(@NativeType("VkDeviceAddress") long value) { VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nvertexBuffer(address(), value); return this; }
        /** Sets the specified value to the {@code geometryIndexAndFlagsBuffer} field. */
        public VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer geometryIndexAndFlagsBuffer(@NativeType("VkDeviceAddress") long value) { VkClusterAccelerationStructureBuildTriangleClusterInfoNV.ngeometryIndexAndFlagsBuffer(address(), value); return this; }
        /** Sets the specified value to the {@code opacityMicromapArray} field. */
        public VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer opacityMicromapArray(@NativeType("VkDeviceAddress") long value) { VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nopacityMicromapArray(address(), value); return this; }
        /** Sets the specified value to the {@code opacityMicromapIndexBuffer} field. */
        public VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer opacityMicromapIndexBuffer(@NativeType("VkDeviceAddress") long value) { VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nopacityMicromapIndexBuffer(address(), value); return this; }

    }

}