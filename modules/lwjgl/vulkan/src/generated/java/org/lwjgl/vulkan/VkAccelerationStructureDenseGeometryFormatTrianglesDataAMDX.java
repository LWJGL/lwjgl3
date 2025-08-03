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
 * struct VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link VkDeviceOrHostAddressConstKHR VkDeviceOrHostAddressConstKHR} compressedData;
 *     VkDeviceSize dataSize;
 *     uint32_t numTriangles;
 *     uint32_t numVertices;
 *     uint32_t maxPrimitiveIndex;
 *     uint32_t maxGeometryIndex;
 *     VkCompressedTriangleFormatAMDX format;
 * }}</pre>
 */
public class VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX extends Struct<VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        COMPRESSEDDATA,
        DATASIZE,
        NUMTRIANGLES,
        NUMVERTICES,
        MAXPRIMITIVEINDEX,
        MAXGEOMETRYINDEX,
        FORMAT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkDeviceOrHostAddressConstKHR.SIZEOF, VkDeviceOrHostAddressConstKHR.ALIGNOF),
            __member(8),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COMPRESSEDDATA = layout.offsetof(2);
        DATASIZE = layout.offsetof(3);
        NUMTRIANGLES = layout.offsetof(4);
        NUMVERTICES = layout.offsetof(5);
        MAXPRIMITIVEINDEX = layout.offsetof(6);
        MAXGEOMETRYINDEX = layout.offsetof(7);
        FORMAT = layout.offsetof(8);
    }

    protected VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX create(long address, @Nullable ByteBuffer container) {
        return new VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX(address, container);
    }

    /**
     * Creates a {@code VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX(ByteBuffer container) {
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
    /** @return a {@link VkDeviceOrHostAddressConstKHR} view of the {@code compressedData} field. */
    public VkDeviceOrHostAddressConstKHR compressedData() { return ncompressedData(address()); }
    /** @return the value of the {@code dataSize} field. */
    @NativeType("VkDeviceSize")
    public long dataSize() { return ndataSize(address()); }
    /** @return the value of the {@code numTriangles} field. */
    @NativeType("uint32_t")
    public int numTriangles() { return nnumTriangles(address()); }
    /** @return the value of the {@code numVertices} field. */
    @NativeType("uint32_t")
    public int numVertices() { return nnumVertices(address()); }
    /** @return the value of the {@code maxPrimitiveIndex} field. */
    @NativeType("uint32_t")
    public int maxPrimitiveIndex() { return nmaxPrimitiveIndex(address()); }
    /** @return the value of the {@code maxGeometryIndex} field. */
    @NativeType("uint32_t")
    public int maxGeometryIndex() { return nmaxGeometryIndex(address()); }
    /** @return the value of the {@code format} field. */
    @NativeType("VkCompressedTriangleFormatAMDX")
    public int format() { return nformat(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link AMDXDenseGeometryFormat#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_DENSE_GEOMETRY_FORMAT_TRIANGLES_DATA_AMDX STRUCTURE_TYPE_ACCELERATION_STRUCTURE_DENSE_GEOMETRY_FORMAT_TRIANGLES_DATA_AMDX} value to the {@code sType} field. */
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX sType$Default() { return sType(AMDXDenseGeometryFormat.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_DENSE_GEOMETRY_FORMAT_TRIANGLES_DATA_AMDX); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkAccelerationStructureTrianglesOpacityMicromapEXT} value to the {@code pNext} chain. */
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX pNext(VkAccelerationStructureTrianglesOpacityMicromapEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@code compressedData} field. */
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX compressedData(VkDeviceOrHostAddressConstKHR value) { ncompressedData(address(), value); return this; }
    /** Passes the {@code compressedData} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX compressedData(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(compressedData()); return this; }
    /** Sets the specified value to the {@code dataSize} field. */
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX dataSize(@NativeType("VkDeviceSize") long value) { ndataSize(address(), value); return this; }
    /** Sets the specified value to the {@code numTriangles} field. */
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX numTriangles(@NativeType("uint32_t") int value) { nnumTriangles(address(), value); return this; }
    /** Sets the specified value to the {@code numVertices} field. */
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX numVertices(@NativeType("uint32_t") int value) { nnumVertices(address(), value); return this; }
    /** Sets the specified value to the {@code maxPrimitiveIndex} field. */
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX maxPrimitiveIndex(@NativeType("uint32_t") int value) { nmaxPrimitiveIndex(address(), value); return this; }
    /** Sets the specified value to the {@code maxGeometryIndex} field. */
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX maxGeometryIndex(@NativeType("uint32_t") int value) { nmaxGeometryIndex(address(), value); return this; }
    /** Sets the specified value to the {@code format} field. */
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX format(@NativeType("VkCompressedTriangleFormatAMDX") int value) { nformat(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX set(
        int sType,
        long pNext,
        VkDeviceOrHostAddressConstKHR compressedData,
        long dataSize,
        int numTriangles,
        int numVertices,
        int maxPrimitiveIndex,
        int maxGeometryIndex,
        int format
    ) {
        sType(sType);
        pNext(pNext);
        compressedData(compressedData);
        dataSize(dataSize);
        numTriangles(numTriangles);
        numVertices(numVertices);
        maxPrimitiveIndex(maxPrimitiveIndex);
        maxGeometryIndex(maxGeometryIndex);
        format(format);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX set(VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX malloc() {
        return new VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX calloc() {
        return new VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX} instance allocated with {@link BufferUtils}. */
    public static VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX(memAddress(container), container);
    }

    /** Returns a new {@code VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX} instance for the specified memory address. */
    public static VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX create(long address) {
        return new VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX createSafe(long address) {
        return address == NULL ? null : new VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX(address, null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX malloc(MemoryStack stack) {
        return new VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX calloc(MemoryStack stack) {
        return new VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.PNEXT); }
    /** Unsafe version of {@link #compressedData}. */
    public static VkDeviceOrHostAddressConstKHR ncompressedData(long struct) { return VkDeviceOrHostAddressConstKHR.create(struct + VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.COMPRESSEDDATA); }
    /** Unsafe version of {@link #dataSize}. */
    public static long ndataSize(long struct) { return memGetLong(struct + VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.DATASIZE); }
    /** Unsafe version of {@link #numTriangles}. */
    public static int nnumTriangles(long struct) { return memGetInt(struct + VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.NUMTRIANGLES); }
    /** Unsafe version of {@link #numVertices}. */
    public static int nnumVertices(long struct) { return memGetInt(struct + VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.NUMVERTICES); }
    /** Unsafe version of {@link #maxPrimitiveIndex}. */
    public static int nmaxPrimitiveIndex(long struct) { return memGetInt(struct + VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.MAXPRIMITIVEINDEX); }
    /** Unsafe version of {@link #maxGeometryIndex}. */
    public static int nmaxGeometryIndex(long struct) { return memGetInt(struct + VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.MAXGEOMETRYINDEX); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return memGetInt(struct + VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.FORMAT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.PNEXT, value); }
    /** Unsafe version of {@link #compressedData(VkDeviceOrHostAddressConstKHR) compressedData}. */
    public static void ncompressedData(long struct, VkDeviceOrHostAddressConstKHR value) { memCopy(value.address(), struct + VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.COMPRESSEDDATA, VkDeviceOrHostAddressConstKHR.SIZEOF); }
    /** Unsafe version of {@link #dataSize(long) dataSize}. */
    public static void ndataSize(long struct, long value) { memPutLong(struct + VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.DATASIZE, value); }
    /** Unsafe version of {@link #numTriangles(int) numTriangles}. */
    public static void nnumTriangles(long struct, int value) { memPutInt(struct + VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.NUMTRIANGLES, value); }
    /** Unsafe version of {@link #numVertices(int) numVertices}. */
    public static void nnumVertices(long struct, int value) { memPutInt(struct + VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.NUMVERTICES, value); }
    /** Unsafe version of {@link #maxPrimitiveIndex(int) maxPrimitiveIndex}. */
    public static void nmaxPrimitiveIndex(long struct, int value) { memPutInt(struct + VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.MAXPRIMITIVEINDEX, value); }
    /** Unsafe version of {@link #maxGeometryIndex(int) maxGeometryIndex}. */
    public static void nmaxGeometryIndex(long struct, int value) { memPutInt(struct + VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.MAXGEOMETRYINDEX, value); }
    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { memPutInt(struct + VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.FORMAT, value); }

    // -----------------------------------

    /** An array of {@link VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX} structs. */
    public static class Buffer extends StructBuffer<VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX, Buffer> implements NativeResource {

        private static final VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX ELEMENT_FACTORY = VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.create(-1L);

        /**
         * Creates a new {@code VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.npNext(address()); }
        /** @return a {@link VkDeviceOrHostAddressConstKHR} view of the {@code compressedData} field. */
        public VkDeviceOrHostAddressConstKHR compressedData() { return VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.ncompressedData(address()); }
        /** @return the value of the {@code dataSize} field. */
        @NativeType("VkDeviceSize")
        public long dataSize() { return VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.ndataSize(address()); }
        /** @return the value of the {@code numTriangles} field. */
        @NativeType("uint32_t")
        public int numTriangles() { return VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.nnumTriangles(address()); }
        /** @return the value of the {@code numVertices} field. */
        @NativeType("uint32_t")
        public int numVertices() { return VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.nnumVertices(address()); }
        /** @return the value of the {@code maxPrimitiveIndex} field. */
        @NativeType("uint32_t")
        public int maxPrimitiveIndex() { return VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.nmaxPrimitiveIndex(address()); }
        /** @return the value of the {@code maxGeometryIndex} field. */
        @NativeType("uint32_t")
        public int maxGeometryIndex() { return VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.nmaxGeometryIndex(address()); }
        /** @return the value of the {@code format} field. */
        @NativeType("VkCompressedTriangleFormatAMDX")
        public int format() { return VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.nformat(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer sType(@NativeType("VkStructureType") int value) { VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.nsType(address(), value); return this; }
        /** Sets the {@link AMDXDenseGeometryFormat#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_DENSE_GEOMETRY_FORMAT_TRIANGLES_DATA_AMDX STRUCTURE_TYPE_ACCELERATION_STRUCTURE_DENSE_GEOMETRY_FORMAT_TRIANGLES_DATA_AMDX} value to the {@code sType} field. */
        public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer sType$Default() { return sType(AMDXDenseGeometryFormat.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_DENSE_GEOMETRY_FORMAT_TRIANGLES_DATA_AMDX); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer pNext(@NativeType("void const *") long value) { VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkAccelerationStructureTrianglesOpacityMicromapEXT} value to the {@code pNext} chain. */
        public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer pNext(VkAccelerationStructureTrianglesOpacityMicromapEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@code compressedData} field. */
        public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer compressedData(VkDeviceOrHostAddressConstKHR value) { VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.ncompressedData(address(), value); return this; }
        /** Passes the {@code compressedData} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer compressedData(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(compressedData()); return this; }
        /** Sets the specified value to the {@code dataSize} field. */
        public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer dataSize(@NativeType("VkDeviceSize") long value) { VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.ndataSize(address(), value); return this; }
        /** Sets the specified value to the {@code numTriangles} field. */
        public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer numTriangles(@NativeType("uint32_t") int value) { VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.nnumTriangles(address(), value); return this; }
        /** Sets the specified value to the {@code numVertices} field. */
        public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer numVertices(@NativeType("uint32_t") int value) { VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.nnumVertices(address(), value); return this; }
        /** Sets the specified value to the {@code maxPrimitiveIndex} field. */
        public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer maxPrimitiveIndex(@NativeType("uint32_t") int value) { VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.nmaxPrimitiveIndex(address(), value); return this; }
        /** Sets the specified value to the {@code maxGeometryIndex} field. */
        public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer maxGeometryIndex(@NativeType("uint32_t") int value) { VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.nmaxGeometryIndex(address(), value); return this; }
        /** Sets the specified value to the {@code format} field. */
        public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer format(@NativeType("VkCompressedTriangleFormatAMDX") int value) { VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.nformat(address(), value); return this; }

    }

}