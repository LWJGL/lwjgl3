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
 * struct VkGeometryTrianglesNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBuffer vertexData;
 *     VkDeviceSize vertexOffset;
 *     uint32_t vertexCount;
 *     VkDeviceSize vertexStride;
 *     VkFormat vertexFormat;
 *     VkBuffer indexData;
 *     VkDeviceSize indexOffset;
 *     uint32_t indexCount;
 *     VkIndexType indexType;
 *     VkBuffer transformData;
 *     VkDeviceSize transformOffset;
 * }}</pre>
 */
public class VkGeometryTrianglesNV extends Struct<VkGeometryTrianglesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        VERTEXDATA,
        VERTEXOFFSET,
        VERTEXCOUNT,
        VERTEXSTRIDE,
        VERTEXFORMAT,
        INDEXDATA,
        INDEXOFFSET,
        INDEXCOUNT,
        INDEXTYPE,
        TRANSFORMDATA,
        TRANSFORMOFFSET;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(4),
            __member(8),
            __member(4),
            __member(8),
            __member(8),
            __member(4),
            __member(4),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VERTEXDATA = layout.offsetof(2);
        VERTEXOFFSET = layout.offsetof(3);
        VERTEXCOUNT = layout.offsetof(4);
        VERTEXSTRIDE = layout.offsetof(5);
        VERTEXFORMAT = layout.offsetof(6);
        INDEXDATA = layout.offsetof(7);
        INDEXOFFSET = layout.offsetof(8);
        INDEXCOUNT = layout.offsetof(9);
        INDEXTYPE = layout.offsetof(10);
        TRANSFORMDATA = layout.offsetof(11);
        TRANSFORMOFFSET = layout.offsetof(12);
    }

    protected VkGeometryTrianglesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkGeometryTrianglesNV create(long address, @Nullable ByteBuffer container) {
        return new VkGeometryTrianglesNV(address, container);
    }

    /**
     * Creates a {@code VkGeometryTrianglesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkGeometryTrianglesNV(ByteBuffer container) {
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
    /** @return the value of the {@code vertexData} field. */
    @NativeType("VkBuffer")
    public long vertexData() { return nvertexData(address()); }
    /** @return the value of the {@code vertexOffset} field. */
    @NativeType("VkDeviceSize")
    public long vertexOffset() { return nvertexOffset(address()); }
    /** @return the value of the {@code vertexCount} field. */
    @NativeType("uint32_t")
    public int vertexCount() { return nvertexCount(address()); }
    /** @return the value of the {@code vertexStride} field. */
    @NativeType("VkDeviceSize")
    public long vertexStride() { return nvertexStride(address()); }
    /** @return the value of the {@code vertexFormat} field. */
    @NativeType("VkFormat")
    public int vertexFormat() { return nvertexFormat(address()); }
    /** @return the value of the {@code indexData} field. */
    @NativeType("VkBuffer")
    public long indexData() { return nindexData(address()); }
    /** @return the value of the {@code indexOffset} field. */
    @NativeType("VkDeviceSize")
    public long indexOffset() { return nindexOffset(address()); }
    /** @return the value of the {@code indexCount} field. */
    @NativeType("uint32_t")
    public int indexCount() { return nindexCount(address()); }
    /** @return the value of the {@code indexType} field. */
    @NativeType("VkIndexType")
    public int indexType() { return nindexType(address()); }
    /** @return the value of the {@code transformData} field. */
    @NativeType("VkBuffer")
    public long transformData() { return ntransformData(address()); }
    /** @return the value of the {@code transformOffset} field. */
    @NativeType("VkDeviceSize")
    public long transformOffset() { return ntransformOffset(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkGeometryTrianglesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVRayTracing#VK_STRUCTURE_TYPE_GEOMETRY_TRIANGLES_NV STRUCTURE_TYPE_GEOMETRY_TRIANGLES_NV} value to the {@code sType} field. */
    public VkGeometryTrianglesNV sType$Default() { return sType(NVRayTracing.VK_STRUCTURE_TYPE_GEOMETRY_TRIANGLES_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkGeometryTrianglesNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code vertexData} field. */
    public VkGeometryTrianglesNV vertexData(@NativeType("VkBuffer") long value) { nvertexData(address(), value); return this; }
    /** Sets the specified value to the {@code vertexOffset} field. */
    public VkGeometryTrianglesNV vertexOffset(@NativeType("VkDeviceSize") long value) { nvertexOffset(address(), value); return this; }
    /** Sets the specified value to the {@code vertexCount} field. */
    public VkGeometryTrianglesNV vertexCount(@NativeType("uint32_t") int value) { nvertexCount(address(), value); return this; }
    /** Sets the specified value to the {@code vertexStride} field. */
    public VkGeometryTrianglesNV vertexStride(@NativeType("VkDeviceSize") long value) { nvertexStride(address(), value); return this; }
    /** Sets the specified value to the {@code vertexFormat} field. */
    public VkGeometryTrianglesNV vertexFormat(@NativeType("VkFormat") int value) { nvertexFormat(address(), value); return this; }
    /** Sets the specified value to the {@code indexData} field. */
    public VkGeometryTrianglesNV indexData(@NativeType("VkBuffer") long value) { nindexData(address(), value); return this; }
    /** Sets the specified value to the {@code indexOffset} field. */
    public VkGeometryTrianglesNV indexOffset(@NativeType("VkDeviceSize") long value) { nindexOffset(address(), value); return this; }
    /** Sets the specified value to the {@code indexCount} field. */
    public VkGeometryTrianglesNV indexCount(@NativeType("uint32_t") int value) { nindexCount(address(), value); return this; }
    /** Sets the specified value to the {@code indexType} field. */
    public VkGeometryTrianglesNV indexType(@NativeType("VkIndexType") int value) { nindexType(address(), value); return this; }
    /** Sets the specified value to the {@code transformData} field. */
    public VkGeometryTrianglesNV transformData(@NativeType("VkBuffer") long value) { ntransformData(address(), value); return this; }
    /** Sets the specified value to the {@code transformOffset} field. */
    public VkGeometryTrianglesNV transformOffset(@NativeType("VkDeviceSize") long value) { ntransformOffset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkGeometryTrianglesNV set(
        int sType,
        long pNext,
        long vertexData,
        long vertexOffset,
        int vertexCount,
        long vertexStride,
        int vertexFormat,
        long indexData,
        long indexOffset,
        int indexCount,
        int indexType,
        long transformData,
        long transformOffset
    ) {
        sType(sType);
        pNext(pNext);
        vertexData(vertexData);
        vertexOffset(vertexOffset);
        vertexCount(vertexCount);
        vertexStride(vertexStride);
        vertexFormat(vertexFormat);
        indexData(indexData);
        indexOffset(indexOffset);
        indexCount(indexCount);
        indexType(indexType);
        transformData(transformData);
        transformOffset(transformOffset);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkGeometryTrianglesNV set(VkGeometryTrianglesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkGeometryTrianglesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkGeometryTrianglesNV malloc() {
        return new VkGeometryTrianglesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkGeometryTrianglesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkGeometryTrianglesNV calloc() {
        return new VkGeometryTrianglesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkGeometryTrianglesNV} instance allocated with {@link BufferUtils}. */
    public static VkGeometryTrianglesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkGeometryTrianglesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkGeometryTrianglesNV} instance for the specified memory address. */
    public static VkGeometryTrianglesNV create(long address) {
        return new VkGeometryTrianglesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkGeometryTrianglesNV createSafe(long address) {
        return address == NULL ? null : new VkGeometryTrianglesNV(address, null);
    }

    /**
     * Returns a new {@link VkGeometryTrianglesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryTrianglesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkGeometryTrianglesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryTrianglesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGeometryTrianglesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryTrianglesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkGeometryTrianglesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkGeometryTrianglesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkGeometryTrianglesNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkGeometryTrianglesNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkGeometryTrianglesNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkGeometryTrianglesNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkGeometryTrianglesNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkGeometryTrianglesNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkGeometryTrianglesNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkGeometryTrianglesNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkGeometryTrianglesNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkGeometryTrianglesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGeometryTrianglesNV malloc(MemoryStack stack) {
        return new VkGeometryTrianglesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkGeometryTrianglesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGeometryTrianglesNV calloc(MemoryStack stack) {
        return new VkGeometryTrianglesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkGeometryTrianglesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGeometryTrianglesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGeometryTrianglesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGeometryTrianglesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkGeometryTrianglesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkGeometryTrianglesNV.PNEXT); }
    /** Unsafe version of {@link #vertexData}. */
    public static long nvertexData(long struct) { return memGetLong(struct + VkGeometryTrianglesNV.VERTEXDATA); }
    /** Unsafe version of {@link #vertexOffset}. */
    public static long nvertexOffset(long struct) { return memGetLong(struct + VkGeometryTrianglesNV.VERTEXOFFSET); }
    /** Unsafe version of {@link #vertexCount}. */
    public static int nvertexCount(long struct) { return memGetInt(struct + VkGeometryTrianglesNV.VERTEXCOUNT); }
    /** Unsafe version of {@link #vertexStride}. */
    public static long nvertexStride(long struct) { return memGetLong(struct + VkGeometryTrianglesNV.VERTEXSTRIDE); }
    /** Unsafe version of {@link #vertexFormat}. */
    public static int nvertexFormat(long struct) { return memGetInt(struct + VkGeometryTrianglesNV.VERTEXFORMAT); }
    /** Unsafe version of {@link #indexData}. */
    public static long nindexData(long struct) { return memGetLong(struct + VkGeometryTrianglesNV.INDEXDATA); }
    /** Unsafe version of {@link #indexOffset}. */
    public static long nindexOffset(long struct) { return memGetLong(struct + VkGeometryTrianglesNV.INDEXOFFSET); }
    /** Unsafe version of {@link #indexCount}. */
    public static int nindexCount(long struct) { return memGetInt(struct + VkGeometryTrianglesNV.INDEXCOUNT); }
    /** Unsafe version of {@link #indexType}. */
    public static int nindexType(long struct) { return memGetInt(struct + VkGeometryTrianglesNV.INDEXTYPE); }
    /** Unsafe version of {@link #transformData}. */
    public static long ntransformData(long struct) { return memGetLong(struct + VkGeometryTrianglesNV.TRANSFORMDATA); }
    /** Unsafe version of {@link #transformOffset}. */
    public static long ntransformOffset(long struct) { return memGetLong(struct + VkGeometryTrianglesNV.TRANSFORMOFFSET); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkGeometryTrianglesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkGeometryTrianglesNV.PNEXT, value); }
    /** Unsafe version of {@link #vertexData(long) vertexData}. */
    public static void nvertexData(long struct, long value) { memPutLong(struct + VkGeometryTrianglesNV.VERTEXDATA, value); }
    /** Unsafe version of {@link #vertexOffset(long) vertexOffset}. */
    public static void nvertexOffset(long struct, long value) { memPutLong(struct + VkGeometryTrianglesNV.VERTEXOFFSET, value); }
    /** Unsafe version of {@link #vertexCount(int) vertexCount}. */
    public static void nvertexCount(long struct, int value) { memPutInt(struct + VkGeometryTrianglesNV.VERTEXCOUNT, value); }
    /** Unsafe version of {@link #vertexStride(long) vertexStride}. */
    public static void nvertexStride(long struct, long value) { memPutLong(struct + VkGeometryTrianglesNV.VERTEXSTRIDE, value); }
    /** Unsafe version of {@link #vertexFormat(int) vertexFormat}. */
    public static void nvertexFormat(long struct, int value) { memPutInt(struct + VkGeometryTrianglesNV.VERTEXFORMAT, value); }
    /** Unsafe version of {@link #indexData(long) indexData}. */
    public static void nindexData(long struct, long value) { memPutLong(struct + VkGeometryTrianglesNV.INDEXDATA, value); }
    /** Unsafe version of {@link #indexOffset(long) indexOffset}. */
    public static void nindexOffset(long struct, long value) { memPutLong(struct + VkGeometryTrianglesNV.INDEXOFFSET, value); }
    /** Unsafe version of {@link #indexCount(int) indexCount}. */
    public static void nindexCount(long struct, int value) { memPutInt(struct + VkGeometryTrianglesNV.INDEXCOUNT, value); }
    /** Unsafe version of {@link #indexType(int) indexType}. */
    public static void nindexType(long struct, int value) { memPutInt(struct + VkGeometryTrianglesNV.INDEXTYPE, value); }
    /** Unsafe version of {@link #transformData(long) transformData}. */
    public static void ntransformData(long struct, long value) { memPutLong(struct + VkGeometryTrianglesNV.TRANSFORMDATA, value); }
    /** Unsafe version of {@link #transformOffset(long) transformOffset}. */
    public static void ntransformOffset(long struct, long value) { memPutLong(struct + VkGeometryTrianglesNV.TRANSFORMOFFSET, value); }

    // -----------------------------------

    /** An array of {@link VkGeometryTrianglesNV} structs. */
    public static class Buffer extends StructBuffer<VkGeometryTrianglesNV, Buffer> implements NativeResource {

        private static final VkGeometryTrianglesNV ELEMENT_FACTORY = VkGeometryTrianglesNV.create(-1L);

        /**
         * Creates a new {@code VkGeometryTrianglesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkGeometryTrianglesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkGeometryTrianglesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkGeometryTrianglesNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkGeometryTrianglesNV.npNext(address()); }
        /** @return the value of the {@code vertexData} field. */
        @NativeType("VkBuffer")
        public long vertexData() { return VkGeometryTrianglesNV.nvertexData(address()); }
        /** @return the value of the {@code vertexOffset} field. */
        @NativeType("VkDeviceSize")
        public long vertexOffset() { return VkGeometryTrianglesNV.nvertexOffset(address()); }
        /** @return the value of the {@code vertexCount} field. */
        @NativeType("uint32_t")
        public int vertexCount() { return VkGeometryTrianglesNV.nvertexCount(address()); }
        /** @return the value of the {@code vertexStride} field. */
        @NativeType("VkDeviceSize")
        public long vertexStride() { return VkGeometryTrianglesNV.nvertexStride(address()); }
        /** @return the value of the {@code vertexFormat} field. */
        @NativeType("VkFormat")
        public int vertexFormat() { return VkGeometryTrianglesNV.nvertexFormat(address()); }
        /** @return the value of the {@code indexData} field. */
        @NativeType("VkBuffer")
        public long indexData() { return VkGeometryTrianglesNV.nindexData(address()); }
        /** @return the value of the {@code indexOffset} field. */
        @NativeType("VkDeviceSize")
        public long indexOffset() { return VkGeometryTrianglesNV.nindexOffset(address()); }
        /** @return the value of the {@code indexCount} field. */
        @NativeType("uint32_t")
        public int indexCount() { return VkGeometryTrianglesNV.nindexCount(address()); }
        /** @return the value of the {@code indexType} field. */
        @NativeType("VkIndexType")
        public int indexType() { return VkGeometryTrianglesNV.nindexType(address()); }
        /** @return the value of the {@code transformData} field. */
        @NativeType("VkBuffer")
        public long transformData() { return VkGeometryTrianglesNV.ntransformData(address()); }
        /** @return the value of the {@code transformOffset} field. */
        @NativeType("VkDeviceSize")
        public long transformOffset() { return VkGeometryTrianglesNV.ntransformOffset(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkGeometryTrianglesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkGeometryTrianglesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVRayTracing#VK_STRUCTURE_TYPE_GEOMETRY_TRIANGLES_NV STRUCTURE_TYPE_GEOMETRY_TRIANGLES_NV} value to the {@code sType} field. */
        public VkGeometryTrianglesNV.Buffer sType$Default() { return sType(NVRayTracing.VK_STRUCTURE_TYPE_GEOMETRY_TRIANGLES_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkGeometryTrianglesNV.Buffer pNext(@NativeType("void const *") long value) { VkGeometryTrianglesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code vertexData} field. */
        public VkGeometryTrianglesNV.Buffer vertexData(@NativeType("VkBuffer") long value) { VkGeometryTrianglesNV.nvertexData(address(), value); return this; }
        /** Sets the specified value to the {@code vertexOffset} field. */
        public VkGeometryTrianglesNV.Buffer vertexOffset(@NativeType("VkDeviceSize") long value) { VkGeometryTrianglesNV.nvertexOffset(address(), value); return this; }
        /** Sets the specified value to the {@code vertexCount} field. */
        public VkGeometryTrianglesNV.Buffer vertexCount(@NativeType("uint32_t") int value) { VkGeometryTrianglesNV.nvertexCount(address(), value); return this; }
        /** Sets the specified value to the {@code vertexStride} field. */
        public VkGeometryTrianglesNV.Buffer vertexStride(@NativeType("VkDeviceSize") long value) { VkGeometryTrianglesNV.nvertexStride(address(), value); return this; }
        /** Sets the specified value to the {@code vertexFormat} field. */
        public VkGeometryTrianglesNV.Buffer vertexFormat(@NativeType("VkFormat") int value) { VkGeometryTrianglesNV.nvertexFormat(address(), value); return this; }
        /** Sets the specified value to the {@code indexData} field. */
        public VkGeometryTrianglesNV.Buffer indexData(@NativeType("VkBuffer") long value) { VkGeometryTrianglesNV.nindexData(address(), value); return this; }
        /** Sets the specified value to the {@code indexOffset} field. */
        public VkGeometryTrianglesNV.Buffer indexOffset(@NativeType("VkDeviceSize") long value) { VkGeometryTrianglesNV.nindexOffset(address(), value); return this; }
        /** Sets the specified value to the {@code indexCount} field. */
        public VkGeometryTrianglesNV.Buffer indexCount(@NativeType("uint32_t") int value) { VkGeometryTrianglesNV.nindexCount(address(), value); return this; }
        /** Sets the specified value to the {@code indexType} field. */
        public VkGeometryTrianglesNV.Buffer indexType(@NativeType("VkIndexType") int value) { VkGeometryTrianglesNV.nindexType(address(), value); return this; }
        /** Sets the specified value to the {@code transformData} field. */
        public VkGeometryTrianglesNV.Buffer transformData(@NativeType("VkBuffer") long value) { VkGeometryTrianglesNV.ntransformData(address(), value); return this; }
        /** Sets the specified value to the {@code transformOffset} field. */
        public VkGeometryTrianglesNV.Buffer transformOffset(@NativeType("VkDeviceSize") long value) { VkGeometryTrianglesNV.ntransformOffset(address(), value); return this; }

    }

}