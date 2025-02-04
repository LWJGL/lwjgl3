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
 * struct VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV {
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
 *     VkDeviceAddress instantiationBoundingBoxLimit;
 * }}</pre>
 */
public class VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV extends Struct<VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV> implements NativeResource {

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
        OPACITYMICROMAPINDEXBUFFER,
        INSTANTIATIONBOUNDINGBOXLIMIT;

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
        INSTANTIATIONBOUNDINGBOXLIMIT = layout.offsetof(13);
    }

    protected VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV(address, container);
    }

    /**
     * Creates a {@code VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV(ByteBuffer container) {
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
    /** @return the value of the {@code instantiationBoundingBoxLimit} field. */
    @NativeType("VkDeviceAddress")
    public long instantiationBoundingBoxLimit() { return ninstantiationBoundingBoxLimit(address()); }

    /** Sets the specified value to the {@code clusterID} field. */
    public VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV clusterID(@NativeType("uint32_t") int value) { nclusterID(address(), value); return this; }
    /** Sets the specified value to the {@code clusterFlags} field. */
    public VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV clusterFlags(@NativeType("VkClusterAccelerationStructureClusterFlagsNV") int value) { nclusterFlags(address(), value); return this; }
    /** Sets the specified value to the {@code triangleCount} field. */
    public VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV triangleCount(@NativeType("uint32_t") int value) { ntriangleCount(address(), value); return this; }
    /** Sets the specified value to the {@code vertexCount} field. */
    public VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV vertexCount(@NativeType("uint32_t") int value) { nvertexCount(address(), value); return this; }
    /** Sets the specified value to the {@code positionTruncateBitCount} field. */
    public VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV positionTruncateBitCount(@NativeType("uint32_t") int value) { npositionTruncateBitCount(address(), value); return this; }
    /** Sets the specified value to the {@code indexType} field. */
    public VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV indexType(@NativeType("uint32_t") int value) { nindexType(address(), value); return this; }
    /** Sets the specified value to the {@code opacityMicromapIndexType} field. */
    public VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV opacityMicromapIndexType(@NativeType("uint32_t") int value) { nopacityMicromapIndexType(address(), value); return this; }
    /** Copies the specified {@link VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV} to the {@code baseGeometryIndexAndGeometryFlags} field. */
    public VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV baseGeometryIndexAndGeometryFlags(VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV value) { nbaseGeometryIndexAndGeometryFlags(address(), value); return this; }
    /** Passes the {@code baseGeometryIndexAndGeometryFlags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV baseGeometryIndexAndGeometryFlags(java.util.function.Consumer<VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV> consumer) { consumer.accept(baseGeometryIndexAndGeometryFlags()); return this; }
    /** Sets the specified value to the {@code indexBufferStride} field. */
    public VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV indexBufferStride(@NativeType("uint16_t") short value) { nindexBufferStride(address(), value); return this; }
    /** Sets the specified value to the {@code vertexBufferStride} field. */
    public VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV vertexBufferStride(@NativeType("uint16_t") short value) { nvertexBufferStride(address(), value); return this; }
    /** Sets the specified value to the {@code geometryIndexAndFlagsBufferStride} field. */
    public VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV geometryIndexAndFlagsBufferStride(@NativeType("uint16_t") short value) { ngeometryIndexAndFlagsBufferStride(address(), value); return this; }
    /** Sets the specified value to the {@code opacityMicromapIndexBufferStride} field. */
    public VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV opacityMicromapIndexBufferStride(@NativeType("uint16_t") short value) { nopacityMicromapIndexBufferStride(address(), value); return this; }
    /** Sets the specified value to the {@code indexBuffer} field. */
    public VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV indexBuffer(@NativeType("VkDeviceAddress") long value) { nindexBuffer(address(), value); return this; }
    /** Sets the specified value to the {@code vertexBuffer} field. */
    public VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV vertexBuffer(@NativeType("VkDeviceAddress") long value) { nvertexBuffer(address(), value); return this; }
    /** Sets the specified value to the {@code geometryIndexAndFlagsBuffer} field. */
    public VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV geometryIndexAndFlagsBuffer(@NativeType("VkDeviceAddress") long value) { ngeometryIndexAndFlagsBuffer(address(), value); return this; }
    /** Sets the specified value to the {@code opacityMicromapArray} field. */
    public VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV opacityMicromapArray(@NativeType("VkDeviceAddress") long value) { nopacityMicromapArray(address(), value); return this; }
    /** Sets the specified value to the {@code opacityMicromapIndexBuffer} field. */
    public VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV opacityMicromapIndexBuffer(@NativeType("VkDeviceAddress") long value) { nopacityMicromapIndexBuffer(address(), value); return this; }
    /** Sets the specified value to the {@code instantiationBoundingBoxLimit} field. */
    public VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV instantiationBoundingBoxLimit(@NativeType("VkDeviceAddress") long value) { ninstantiationBoundingBoxLimit(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV set(
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
        long opacityMicromapIndexBuffer,
        long instantiationBoundingBoxLimit
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
        instantiationBoundingBoxLimit(instantiationBoundingBoxLimit);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV set(VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV malloc() {
        return new VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV calloc() {
        return new VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV} instance for the specified memory address. */
    public static VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV create(long address) {
        return new VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV createSafe(long address) {
        return address == NULL ? null : new VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV malloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV calloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #clusterID}. */
    public static int nclusterID(long struct) { return memGetInt(struct + VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.CLUSTERID); }
    /** Unsafe version of {@link #clusterFlags}. */
    public static int nclusterFlags(long struct) { return memGetInt(struct + VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.CLUSTERFLAGS); }
    public static int nbitfield0(long struct) { return memGetInt(struct + VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.BITFIELD0); }
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
    public static VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV nbaseGeometryIndexAndGeometryFlags(long struct) { return VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.create(struct + VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.BASEGEOMETRYINDEXANDGEOMETRYFLAGS); }
    /** Unsafe version of {@link #indexBufferStride}. */
    public static short nindexBufferStride(long struct) { return memGetShort(struct + VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.INDEXBUFFERSTRIDE); }
    /** Unsafe version of {@link #vertexBufferStride}. */
    public static short nvertexBufferStride(long struct) { return memGetShort(struct + VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.VERTEXBUFFERSTRIDE); }
    /** Unsafe version of {@link #geometryIndexAndFlagsBufferStride}. */
    public static short ngeometryIndexAndFlagsBufferStride(long struct) { return memGetShort(struct + VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.GEOMETRYINDEXANDFLAGSBUFFERSTRIDE); }
    /** Unsafe version of {@link #opacityMicromapIndexBufferStride}. */
    public static short nopacityMicromapIndexBufferStride(long struct) { return memGetShort(struct + VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.OPACITYMICROMAPINDEXBUFFERSTRIDE); }
    /** Unsafe version of {@link #indexBuffer}. */
    public static long nindexBuffer(long struct) { return memGetLong(struct + VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.INDEXBUFFER); }
    /** Unsafe version of {@link #vertexBuffer}. */
    public static long nvertexBuffer(long struct) { return memGetLong(struct + VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.VERTEXBUFFER); }
    /** Unsafe version of {@link #geometryIndexAndFlagsBuffer}. */
    public static long ngeometryIndexAndFlagsBuffer(long struct) { return memGetLong(struct + VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.GEOMETRYINDEXANDFLAGSBUFFER); }
    /** Unsafe version of {@link #opacityMicromapArray}. */
    public static long nopacityMicromapArray(long struct) { return memGetLong(struct + VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.OPACITYMICROMAPARRAY); }
    /** Unsafe version of {@link #opacityMicromapIndexBuffer}. */
    public static long nopacityMicromapIndexBuffer(long struct) { return memGetLong(struct + VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.OPACITYMICROMAPINDEXBUFFER); }
    /** Unsafe version of {@link #instantiationBoundingBoxLimit}. */
    public static long ninstantiationBoundingBoxLimit(long struct) { return memGetLong(struct + VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.INSTANTIATIONBOUNDINGBOXLIMIT); }

    /** Unsafe version of {@link #clusterID(int) clusterID}. */
    public static void nclusterID(long struct, int value) { memPutInt(struct + VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.CLUSTERID, value); }
    /** Unsafe version of {@link #clusterFlags(int) clusterFlags}. */
    public static void nclusterFlags(long struct, int value) { memPutInt(struct + VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.CLUSTERFLAGS, value); }
    public static void nbitfield0(long struct, int value) { memPutInt(struct + VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.BITFIELD0, value); }
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
    public static void nbaseGeometryIndexAndGeometryFlags(long struct, VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV value) { memCopy(value.address(), struct + VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.BASEGEOMETRYINDEXANDGEOMETRYFLAGS, VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.SIZEOF); }
    /** Unsafe version of {@link #indexBufferStride(short) indexBufferStride}. */
    public static void nindexBufferStride(long struct, short value) { memPutShort(struct + VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.INDEXBUFFERSTRIDE, value); }
    /** Unsafe version of {@link #vertexBufferStride(short) vertexBufferStride}. */
    public static void nvertexBufferStride(long struct, short value) { memPutShort(struct + VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.VERTEXBUFFERSTRIDE, value); }
    /** Unsafe version of {@link #geometryIndexAndFlagsBufferStride(short) geometryIndexAndFlagsBufferStride}. */
    public static void ngeometryIndexAndFlagsBufferStride(long struct, short value) { memPutShort(struct + VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.GEOMETRYINDEXANDFLAGSBUFFERSTRIDE, value); }
    /** Unsafe version of {@link #opacityMicromapIndexBufferStride(short) opacityMicromapIndexBufferStride}. */
    public static void nopacityMicromapIndexBufferStride(long struct, short value) { memPutShort(struct + VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.OPACITYMICROMAPINDEXBUFFERSTRIDE, value); }
    /** Unsafe version of {@link #indexBuffer(long) indexBuffer}. */
    public static void nindexBuffer(long struct, long value) { memPutLong(struct + VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.INDEXBUFFER, value); }
    /** Unsafe version of {@link #vertexBuffer(long) vertexBuffer}. */
    public static void nvertexBuffer(long struct, long value) { memPutLong(struct + VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.VERTEXBUFFER, value); }
    /** Unsafe version of {@link #geometryIndexAndFlagsBuffer(long) geometryIndexAndFlagsBuffer}. */
    public static void ngeometryIndexAndFlagsBuffer(long struct, long value) { memPutLong(struct + VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.GEOMETRYINDEXANDFLAGSBUFFER, value); }
    /** Unsafe version of {@link #opacityMicromapArray(long) opacityMicromapArray}. */
    public static void nopacityMicromapArray(long struct, long value) { memPutLong(struct + VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.OPACITYMICROMAPARRAY, value); }
    /** Unsafe version of {@link #opacityMicromapIndexBuffer(long) opacityMicromapIndexBuffer}. */
    public static void nopacityMicromapIndexBuffer(long struct, long value) { memPutLong(struct + VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.OPACITYMICROMAPINDEXBUFFER, value); }
    /** Unsafe version of {@link #instantiationBoundingBoxLimit(long) instantiationBoundingBoxLimit}. */
    public static void ninstantiationBoundingBoxLimit(long struct, long value) { memPutLong(struct + VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.INSTANTIATIONBOUNDINGBOXLIMIT, value); }

    // -----------------------------------

    /** An array of {@link VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV, Buffer> implements NativeResource {

        private static final VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV ELEMENT_FACTORY = VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.create(-1L);

        /**
         * Creates a new {@code VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code clusterID} field. */
        @NativeType("uint32_t")
        public int clusterID() { return VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.nclusterID(address()); }
        /** @return the value of the {@code clusterFlags} field. */
        @NativeType("VkClusterAccelerationStructureClusterFlagsNV")
        public int clusterFlags() { return VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.nclusterFlags(address()); }
        /** @return the value of the {@code triangleCount} field. */
        @NativeType("uint32_t")
        public int triangleCount() { return VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.ntriangleCount(address()); }
        /** @return the value of the {@code vertexCount} field. */
        @NativeType("uint32_t")
        public int vertexCount() { return VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.nvertexCount(address()); }
        /** @return the value of the {@code positionTruncateBitCount} field. */
        @NativeType("uint32_t")
        public int positionTruncateBitCount() { return VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.npositionTruncateBitCount(address()); }
        /** @return the value of the {@code indexType} field. */
        @NativeType("uint32_t")
        public int indexType() { return VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.nindexType(address()); }
        /** @return the value of the {@code opacityMicromapIndexType} field. */
        @NativeType("uint32_t")
        public int opacityMicromapIndexType() { return VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.nopacityMicromapIndexType(address()); }
        /** @return a {@link VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV} view of the {@code baseGeometryIndexAndGeometryFlags} field. */
        public VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV baseGeometryIndexAndGeometryFlags() { return VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.nbaseGeometryIndexAndGeometryFlags(address()); }
        /** @return the value of the {@code indexBufferStride} field. */
        @NativeType("uint16_t")
        public short indexBufferStride() { return VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.nindexBufferStride(address()); }
        /** @return the value of the {@code vertexBufferStride} field. */
        @NativeType("uint16_t")
        public short vertexBufferStride() { return VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.nvertexBufferStride(address()); }
        /** @return the value of the {@code geometryIndexAndFlagsBufferStride} field. */
        @NativeType("uint16_t")
        public short geometryIndexAndFlagsBufferStride() { return VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.ngeometryIndexAndFlagsBufferStride(address()); }
        /** @return the value of the {@code opacityMicromapIndexBufferStride} field. */
        @NativeType("uint16_t")
        public short opacityMicromapIndexBufferStride() { return VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.nopacityMicromapIndexBufferStride(address()); }
        /** @return the value of the {@code indexBuffer} field. */
        @NativeType("VkDeviceAddress")
        public long indexBuffer() { return VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.nindexBuffer(address()); }
        /** @return the value of the {@code vertexBuffer} field. */
        @NativeType("VkDeviceAddress")
        public long vertexBuffer() { return VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.nvertexBuffer(address()); }
        /** @return the value of the {@code geometryIndexAndFlagsBuffer} field. */
        @NativeType("VkDeviceAddress")
        public long geometryIndexAndFlagsBuffer() { return VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.ngeometryIndexAndFlagsBuffer(address()); }
        /** @return the value of the {@code opacityMicromapArray} field. */
        @NativeType("VkDeviceAddress")
        public long opacityMicromapArray() { return VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.nopacityMicromapArray(address()); }
        /** @return the value of the {@code opacityMicromapIndexBuffer} field. */
        @NativeType("VkDeviceAddress")
        public long opacityMicromapIndexBuffer() { return VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.nopacityMicromapIndexBuffer(address()); }
        /** @return the value of the {@code instantiationBoundingBoxLimit} field. */
        @NativeType("VkDeviceAddress")
        public long instantiationBoundingBoxLimit() { return VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.ninstantiationBoundingBoxLimit(address()); }

        /** Sets the specified value to the {@code clusterID} field. */
        public VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.Buffer clusterID(@NativeType("uint32_t") int value) { VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.nclusterID(address(), value); return this; }
        /** Sets the specified value to the {@code clusterFlags} field. */
        public VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.Buffer clusterFlags(@NativeType("VkClusterAccelerationStructureClusterFlagsNV") int value) { VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.nclusterFlags(address(), value); return this; }
        /** Sets the specified value to the {@code triangleCount} field. */
        public VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.Buffer triangleCount(@NativeType("uint32_t") int value) { VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.ntriangleCount(address(), value); return this; }
        /** Sets the specified value to the {@code vertexCount} field. */
        public VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.Buffer vertexCount(@NativeType("uint32_t") int value) { VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.nvertexCount(address(), value); return this; }
        /** Sets the specified value to the {@code positionTruncateBitCount} field. */
        public VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.Buffer positionTruncateBitCount(@NativeType("uint32_t") int value) { VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.npositionTruncateBitCount(address(), value); return this; }
        /** Sets the specified value to the {@code indexType} field. */
        public VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.Buffer indexType(@NativeType("uint32_t") int value) { VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.nindexType(address(), value); return this; }
        /** Sets the specified value to the {@code opacityMicromapIndexType} field. */
        public VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.Buffer opacityMicromapIndexType(@NativeType("uint32_t") int value) { VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.nopacityMicromapIndexType(address(), value); return this; }
        /** Copies the specified {@link VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV} to the {@code baseGeometryIndexAndGeometryFlags} field. */
        public VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.Buffer baseGeometryIndexAndGeometryFlags(VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV value) { VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.nbaseGeometryIndexAndGeometryFlags(address(), value); return this; }
        /** Passes the {@code baseGeometryIndexAndGeometryFlags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.Buffer baseGeometryIndexAndGeometryFlags(java.util.function.Consumer<VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV> consumer) { consumer.accept(baseGeometryIndexAndGeometryFlags()); return this; }
        /** Sets the specified value to the {@code indexBufferStride} field. */
        public VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.Buffer indexBufferStride(@NativeType("uint16_t") short value) { VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.nindexBufferStride(address(), value); return this; }
        /** Sets the specified value to the {@code vertexBufferStride} field. */
        public VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.Buffer vertexBufferStride(@NativeType("uint16_t") short value) { VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.nvertexBufferStride(address(), value); return this; }
        /** Sets the specified value to the {@code geometryIndexAndFlagsBufferStride} field. */
        public VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.Buffer geometryIndexAndFlagsBufferStride(@NativeType("uint16_t") short value) { VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.ngeometryIndexAndFlagsBufferStride(address(), value); return this; }
        /** Sets the specified value to the {@code opacityMicromapIndexBufferStride} field. */
        public VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.Buffer opacityMicromapIndexBufferStride(@NativeType("uint16_t") short value) { VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.nopacityMicromapIndexBufferStride(address(), value); return this; }
        /** Sets the specified value to the {@code indexBuffer} field. */
        public VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.Buffer indexBuffer(@NativeType("VkDeviceAddress") long value) { VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.nindexBuffer(address(), value); return this; }
        /** Sets the specified value to the {@code vertexBuffer} field. */
        public VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.Buffer vertexBuffer(@NativeType("VkDeviceAddress") long value) { VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.nvertexBuffer(address(), value); return this; }
        /** Sets the specified value to the {@code geometryIndexAndFlagsBuffer} field. */
        public VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.Buffer geometryIndexAndFlagsBuffer(@NativeType("VkDeviceAddress") long value) { VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.ngeometryIndexAndFlagsBuffer(address(), value); return this; }
        /** Sets the specified value to the {@code opacityMicromapArray} field. */
        public VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.Buffer opacityMicromapArray(@NativeType("VkDeviceAddress") long value) { VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.nopacityMicromapArray(address(), value); return this; }
        /** Sets the specified value to the {@code opacityMicromapIndexBuffer} field. */
        public VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.Buffer opacityMicromapIndexBuffer(@NativeType("VkDeviceAddress") long value) { VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.nopacityMicromapIndexBuffer(address(), value); return this; }
        /** Sets the specified value to the {@code instantiationBoundingBoxLimit} field. */
        public VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.Buffer instantiationBoundingBoxLimit(@NativeType("VkDeviceAddress") long value) { VkClusterAccelerationStructureBuildTriangleClusterTemplateInfoNV.ninstantiationBoundingBoxLimit(address(), value); return this; }

    }

}