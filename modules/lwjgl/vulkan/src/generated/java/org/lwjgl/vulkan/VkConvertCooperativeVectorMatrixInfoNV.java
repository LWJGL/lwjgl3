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
 * struct VkConvertCooperativeVectorMatrixInfoNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     size_t srcSize;
 *     {@link VkDeviceOrHostAddressConstKHR VkDeviceOrHostAddressConstKHR} srcData;
 *     size_t * pDstSize;
 *     {@link VkDeviceOrHostAddressKHR VkDeviceOrHostAddressKHR} dstData;
 *     VkComponentTypeNV srcComponentType;
 *     VkComponentTypeNV dstComponentType;
 *     uint32_t numRows;
 *     uint32_t numColumns;
 *     VkCooperativeVectorMatrixLayoutNV srcLayout;
 *     size_t srcStride;
 *     VkCooperativeVectorMatrixLayoutNV dstLayout;
 *     size_t dstStride;
 * }}</pre>
 */
public class VkConvertCooperativeVectorMatrixInfoNV extends Struct<VkConvertCooperativeVectorMatrixInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SRCSIZE,
        SRCDATA,
        PDSTSIZE,
        DSTDATA,
        SRCCOMPONENTTYPE,
        DSTCOMPONENTTYPE,
        NUMROWS,
        NUMCOLUMNS,
        SRCLAYOUT,
        SRCSTRIDE,
        DSTLAYOUT,
        DSTSTRIDE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(VkDeviceOrHostAddressConstKHR.SIZEOF, VkDeviceOrHostAddressConstKHR.ALIGNOF),
            __member(POINTER_SIZE),
            __member(VkDeviceOrHostAddressKHR.SIZEOF, VkDeviceOrHostAddressKHR.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCSIZE = layout.offsetof(2);
        SRCDATA = layout.offsetof(3);
        PDSTSIZE = layout.offsetof(4);
        DSTDATA = layout.offsetof(5);
        SRCCOMPONENTTYPE = layout.offsetof(6);
        DSTCOMPONENTTYPE = layout.offsetof(7);
        NUMROWS = layout.offsetof(8);
        NUMCOLUMNS = layout.offsetof(9);
        SRCLAYOUT = layout.offsetof(10);
        SRCSTRIDE = layout.offsetof(11);
        DSTLAYOUT = layout.offsetof(12);
        DSTSTRIDE = layout.offsetof(13);
    }

    protected VkConvertCooperativeVectorMatrixInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkConvertCooperativeVectorMatrixInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkConvertCooperativeVectorMatrixInfoNV(address, container);
    }

    /**
     * Creates a {@code VkConvertCooperativeVectorMatrixInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkConvertCooperativeVectorMatrixInfoNV(ByteBuffer container) {
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
    /** @return the value of the {@code srcSize} field. */
    @NativeType("size_t")
    public long srcSize() { return nsrcSize(address()); }
    /** @return a {@link VkDeviceOrHostAddressConstKHR} view of the {@code srcData} field. */
    public VkDeviceOrHostAddressConstKHR srcData() { return nsrcData(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code pDstSize} field. */
    @NativeType("size_t *")
    public @Nullable PointerBuffer pDstSize(int capacity) { return npDstSize(address(), capacity); }
    /** @return a {@link VkDeviceOrHostAddressKHR} view of the {@code dstData} field. */
    public VkDeviceOrHostAddressKHR dstData() { return ndstData(address()); }
    /** @return the value of the {@code srcComponentType} field. */
    @NativeType("VkComponentTypeNV")
    public int srcComponentType() { return nsrcComponentType(address()); }
    /** @return the value of the {@code dstComponentType} field. */
    @NativeType("VkComponentTypeNV")
    public int dstComponentType() { return ndstComponentType(address()); }
    /** @return the value of the {@code numRows} field. */
    @NativeType("uint32_t")
    public int numRows() { return nnumRows(address()); }
    /** @return the value of the {@code numColumns} field. */
    @NativeType("uint32_t")
    public int numColumns() { return nnumColumns(address()); }
    /** @return the value of the {@code srcLayout} field. */
    @NativeType("VkCooperativeVectorMatrixLayoutNV")
    public int srcLayout() { return nsrcLayout(address()); }
    /** @return the value of the {@code srcStride} field. */
    @NativeType("size_t")
    public long srcStride() { return nsrcStride(address()); }
    /** @return the value of the {@code dstLayout} field. */
    @NativeType("VkCooperativeVectorMatrixLayoutNV")
    public int dstLayout() { return ndstLayout(address()); }
    /** @return the value of the {@code dstStride} field. */
    @NativeType("size_t")
    public long dstStride() { return ndstStride(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkConvertCooperativeVectorMatrixInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVCooperativeVector#VK_STRUCTURE_TYPE_CONVERT_COOPERATIVE_VECTOR_MATRIX_INFO_NV STRUCTURE_TYPE_CONVERT_COOPERATIVE_VECTOR_MATRIX_INFO_NV} value to the {@code sType} field. */
    public VkConvertCooperativeVectorMatrixInfoNV sType$Default() { return sType(NVCooperativeVector.VK_STRUCTURE_TYPE_CONVERT_COOPERATIVE_VECTOR_MATRIX_INFO_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkConvertCooperativeVectorMatrixInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code srcSize} field. */
    public VkConvertCooperativeVectorMatrixInfoNV srcSize(@NativeType("size_t") long value) { nsrcSize(address(), value); return this; }
    /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@code srcData} field. */
    public VkConvertCooperativeVectorMatrixInfoNV srcData(VkDeviceOrHostAddressConstKHR value) { nsrcData(address(), value); return this; }
    /** Passes the {@code srcData} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkConvertCooperativeVectorMatrixInfoNV srcData(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(srcData()); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code pDstSize} field. */
    public VkConvertCooperativeVectorMatrixInfoNV pDstSize(@Nullable @NativeType("size_t *") PointerBuffer value) { npDstSize(address(), value); return this; }
    /** Copies the specified {@link VkDeviceOrHostAddressKHR} to the {@code dstData} field. */
    public VkConvertCooperativeVectorMatrixInfoNV dstData(VkDeviceOrHostAddressKHR value) { ndstData(address(), value); return this; }
    /** Passes the {@code dstData} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkConvertCooperativeVectorMatrixInfoNV dstData(java.util.function.Consumer<VkDeviceOrHostAddressKHR> consumer) { consumer.accept(dstData()); return this; }
    /** Sets the specified value to the {@code srcComponentType} field. */
    public VkConvertCooperativeVectorMatrixInfoNV srcComponentType(@NativeType("VkComponentTypeNV") int value) { nsrcComponentType(address(), value); return this; }
    /** Sets the specified value to the {@code dstComponentType} field. */
    public VkConvertCooperativeVectorMatrixInfoNV dstComponentType(@NativeType("VkComponentTypeNV") int value) { ndstComponentType(address(), value); return this; }
    /** Sets the specified value to the {@code numRows} field. */
    public VkConvertCooperativeVectorMatrixInfoNV numRows(@NativeType("uint32_t") int value) { nnumRows(address(), value); return this; }
    /** Sets the specified value to the {@code numColumns} field. */
    public VkConvertCooperativeVectorMatrixInfoNV numColumns(@NativeType("uint32_t") int value) { nnumColumns(address(), value); return this; }
    /** Sets the specified value to the {@code srcLayout} field. */
    public VkConvertCooperativeVectorMatrixInfoNV srcLayout(@NativeType("VkCooperativeVectorMatrixLayoutNV") int value) { nsrcLayout(address(), value); return this; }
    /** Sets the specified value to the {@code srcStride} field. */
    public VkConvertCooperativeVectorMatrixInfoNV srcStride(@NativeType("size_t") long value) { nsrcStride(address(), value); return this; }
    /** Sets the specified value to the {@code dstLayout} field. */
    public VkConvertCooperativeVectorMatrixInfoNV dstLayout(@NativeType("VkCooperativeVectorMatrixLayoutNV") int value) { ndstLayout(address(), value); return this; }
    /** Sets the specified value to the {@code dstStride} field. */
    public VkConvertCooperativeVectorMatrixInfoNV dstStride(@NativeType("size_t") long value) { ndstStride(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkConvertCooperativeVectorMatrixInfoNV set(
        int sType,
        long pNext,
        long srcSize,
        VkDeviceOrHostAddressConstKHR srcData,
        @Nullable PointerBuffer pDstSize,
        VkDeviceOrHostAddressKHR dstData,
        int srcComponentType,
        int dstComponentType,
        int numRows,
        int numColumns,
        int srcLayout,
        long srcStride,
        int dstLayout,
        long dstStride
    ) {
        sType(sType);
        pNext(pNext);
        srcSize(srcSize);
        srcData(srcData);
        pDstSize(pDstSize);
        dstData(dstData);
        srcComponentType(srcComponentType);
        dstComponentType(dstComponentType);
        numRows(numRows);
        numColumns(numColumns);
        srcLayout(srcLayout);
        srcStride(srcStride);
        dstLayout(dstLayout);
        dstStride(dstStride);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkConvertCooperativeVectorMatrixInfoNV set(VkConvertCooperativeVectorMatrixInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkConvertCooperativeVectorMatrixInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkConvertCooperativeVectorMatrixInfoNV malloc() {
        return new VkConvertCooperativeVectorMatrixInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkConvertCooperativeVectorMatrixInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkConvertCooperativeVectorMatrixInfoNV calloc() {
        return new VkConvertCooperativeVectorMatrixInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkConvertCooperativeVectorMatrixInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkConvertCooperativeVectorMatrixInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkConvertCooperativeVectorMatrixInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkConvertCooperativeVectorMatrixInfoNV} instance for the specified memory address. */
    public static VkConvertCooperativeVectorMatrixInfoNV create(long address) {
        return new VkConvertCooperativeVectorMatrixInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkConvertCooperativeVectorMatrixInfoNV createSafe(long address) {
        return address == NULL ? null : new VkConvertCooperativeVectorMatrixInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkConvertCooperativeVectorMatrixInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkConvertCooperativeVectorMatrixInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkConvertCooperativeVectorMatrixInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkConvertCooperativeVectorMatrixInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkConvertCooperativeVectorMatrixInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkConvertCooperativeVectorMatrixInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkConvertCooperativeVectorMatrixInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkConvertCooperativeVectorMatrixInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkConvertCooperativeVectorMatrixInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkConvertCooperativeVectorMatrixInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkConvertCooperativeVectorMatrixInfoNV malloc(MemoryStack stack) {
        return new VkConvertCooperativeVectorMatrixInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkConvertCooperativeVectorMatrixInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkConvertCooperativeVectorMatrixInfoNV calloc(MemoryStack stack) {
        return new VkConvertCooperativeVectorMatrixInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkConvertCooperativeVectorMatrixInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkConvertCooperativeVectorMatrixInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkConvertCooperativeVectorMatrixInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkConvertCooperativeVectorMatrixInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkConvertCooperativeVectorMatrixInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkConvertCooperativeVectorMatrixInfoNV.PNEXT); }
    /** Unsafe version of {@link #srcSize}. */
    public static long nsrcSize(long struct) { return memGetAddress(struct + VkConvertCooperativeVectorMatrixInfoNV.SRCSIZE); }
    /** Unsafe version of {@link #srcData}. */
    public static VkDeviceOrHostAddressConstKHR nsrcData(long struct) { return VkDeviceOrHostAddressConstKHR.create(struct + VkConvertCooperativeVectorMatrixInfoNV.SRCDATA); }
    /** Unsafe version of {@link #pDstSize(int) pDstSize}. */
    public static @Nullable PointerBuffer npDstSize(long struct, int capacity) { return memPointerBufferSafe(memGetAddress(struct + VkConvertCooperativeVectorMatrixInfoNV.PDSTSIZE), capacity); }
    /** Unsafe version of {@link #dstData}. */
    public static VkDeviceOrHostAddressKHR ndstData(long struct) { return VkDeviceOrHostAddressKHR.create(struct + VkConvertCooperativeVectorMatrixInfoNV.DSTDATA); }
    /** Unsafe version of {@link #srcComponentType}. */
    public static int nsrcComponentType(long struct) { return memGetInt(struct + VkConvertCooperativeVectorMatrixInfoNV.SRCCOMPONENTTYPE); }
    /** Unsafe version of {@link #dstComponentType}. */
    public static int ndstComponentType(long struct) { return memGetInt(struct + VkConvertCooperativeVectorMatrixInfoNV.DSTCOMPONENTTYPE); }
    /** Unsafe version of {@link #numRows}. */
    public static int nnumRows(long struct) { return memGetInt(struct + VkConvertCooperativeVectorMatrixInfoNV.NUMROWS); }
    /** Unsafe version of {@link #numColumns}. */
    public static int nnumColumns(long struct) { return memGetInt(struct + VkConvertCooperativeVectorMatrixInfoNV.NUMCOLUMNS); }
    /** Unsafe version of {@link #srcLayout}. */
    public static int nsrcLayout(long struct) { return memGetInt(struct + VkConvertCooperativeVectorMatrixInfoNV.SRCLAYOUT); }
    /** Unsafe version of {@link #srcStride}. */
    public static long nsrcStride(long struct) { return memGetAddress(struct + VkConvertCooperativeVectorMatrixInfoNV.SRCSTRIDE); }
    /** Unsafe version of {@link #dstLayout}. */
    public static int ndstLayout(long struct) { return memGetInt(struct + VkConvertCooperativeVectorMatrixInfoNV.DSTLAYOUT); }
    /** Unsafe version of {@link #dstStride}. */
    public static long ndstStride(long struct) { return memGetAddress(struct + VkConvertCooperativeVectorMatrixInfoNV.DSTSTRIDE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkConvertCooperativeVectorMatrixInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkConvertCooperativeVectorMatrixInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #srcSize(long) srcSize}. */
    public static void nsrcSize(long struct, long value) { memPutAddress(struct + VkConvertCooperativeVectorMatrixInfoNV.SRCSIZE, value); }
    /** Unsafe version of {@link #srcData(VkDeviceOrHostAddressConstKHR) srcData}. */
    public static void nsrcData(long struct, VkDeviceOrHostAddressConstKHR value) { memCopy(value.address(), struct + VkConvertCooperativeVectorMatrixInfoNV.SRCDATA, VkDeviceOrHostAddressConstKHR.SIZEOF); }
    /** Unsafe version of {@link #pDstSize(PointerBuffer) pDstSize}. */
    public static void npDstSize(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + VkConvertCooperativeVectorMatrixInfoNV.PDSTSIZE, memAddressSafe(value)); }
    /** Unsafe version of {@link #dstData(VkDeviceOrHostAddressKHR) dstData}. */
    public static void ndstData(long struct, VkDeviceOrHostAddressKHR value) { memCopy(value.address(), struct + VkConvertCooperativeVectorMatrixInfoNV.DSTDATA, VkDeviceOrHostAddressKHR.SIZEOF); }
    /** Unsafe version of {@link #srcComponentType(int) srcComponentType}. */
    public static void nsrcComponentType(long struct, int value) { memPutInt(struct + VkConvertCooperativeVectorMatrixInfoNV.SRCCOMPONENTTYPE, value); }
    /** Unsafe version of {@link #dstComponentType(int) dstComponentType}. */
    public static void ndstComponentType(long struct, int value) { memPutInt(struct + VkConvertCooperativeVectorMatrixInfoNV.DSTCOMPONENTTYPE, value); }
    /** Unsafe version of {@link #numRows(int) numRows}. */
    public static void nnumRows(long struct, int value) { memPutInt(struct + VkConvertCooperativeVectorMatrixInfoNV.NUMROWS, value); }
    /** Unsafe version of {@link #numColumns(int) numColumns}. */
    public static void nnumColumns(long struct, int value) { memPutInt(struct + VkConvertCooperativeVectorMatrixInfoNV.NUMCOLUMNS, value); }
    /** Unsafe version of {@link #srcLayout(int) srcLayout}. */
    public static void nsrcLayout(long struct, int value) { memPutInt(struct + VkConvertCooperativeVectorMatrixInfoNV.SRCLAYOUT, value); }
    /** Unsafe version of {@link #srcStride(long) srcStride}. */
    public static void nsrcStride(long struct, long value) { memPutAddress(struct + VkConvertCooperativeVectorMatrixInfoNV.SRCSTRIDE, value); }
    /** Unsafe version of {@link #dstLayout(int) dstLayout}. */
    public static void ndstLayout(long struct, int value) { memPutInt(struct + VkConvertCooperativeVectorMatrixInfoNV.DSTLAYOUT, value); }
    /** Unsafe version of {@link #dstStride(long) dstStride}. */
    public static void ndstStride(long struct, long value) { memPutAddress(struct + VkConvertCooperativeVectorMatrixInfoNV.DSTSTRIDE, value); }

    // -----------------------------------

    /** An array of {@link VkConvertCooperativeVectorMatrixInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkConvertCooperativeVectorMatrixInfoNV, Buffer> implements NativeResource {

        private static final VkConvertCooperativeVectorMatrixInfoNV ELEMENT_FACTORY = VkConvertCooperativeVectorMatrixInfoNV.create(-1L);

        /**
         * Creates a new {@code VkConvertCooperativeVectorMatrixInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkConvertCooperativeVectorMatrixInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkConvertCooperativeVectorMatrixInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkConvertCooperativeVectorMatrixInfoNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkConvertCooperativeVectorMatrixInfoNV.npNext(address()); }
        /** @return the value of the {@code srcSize} field. */
        @NativeType("size_t")
        public long srcSize() { return VkConvertCooperativeVectorMatrixInfoNV.nsrcSize(address()); }
        /** @return a {@link VkDeviceOrHostAddressConstKHR} view of the {@code srcData} field. */
        public VkDeviceOrHostAddressConstKHR srcData() { return VkConvertCooperativeVectorMatrixInfoNV.nsrcData(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code pDstSize} field. */
        @NativeType("size_t *")
        public @Nullable PointerBuffer pDstSize(int capacity) { return VkConvertCooperativeVectorMatrixInfoNV.npDstSize(address(), capacity); }
        /** @return a {@link VkDeviceOrHostAddressKHR} view of the {@code dstData} field. */
        public VkDeviceOrHostAddressKHR dstData() { return VkConvertCooperativeVectorMatrixInfoNV.ndstData(address()); }
        /** @return the value of the {@code srcComponentType} field. */
        @NativeType("VkComponentTypeNV")
        public int srcComponentType() { return VkConvertCooperativeVectorMatrixInfoNV.nsrcComponentType(address()); }
        /** @return the value of the {@code dstComponentType} field. */
        @NativeType("VkComponentTypeNV")
        public int dstComponentType() { return VkConvertCooperativeVectorMatrixInfoNV.ndstComponentType(address()); }
        /** @return the value of the {@code numRows} field. */
        @NativeType("uint32_t")
        public int numRows() { return VkConvertCooperativeVectorMatrixInfoNV.nnumRows(address()); }
        /** @return the value of the {@code numColumns} field. */
        @NativeType("uint32_t")
        public int numColumns() { return VkConvertCooperativeVectorMatrixInfoNV.nnumColumns(address()); }
        /** @return the value of the {@code srcLayout} field. */
        @NativeType("VkCooperativeVectorMatrixLayoutNV")
        public int srcLayout() { return VkConvertCooperativeVectorMatrixInfoNV.nsrcLayout(address()); }
        /** @return the value of the {@code srcStride} field. */
        @NativeType("size_t")
        public long srcStride() { return VkConvertCooperativeVectorMatrixInfoNV.nsrcStride(address()); }
        /** @return the value of the {@code dstLayout} field. */
        @NativeType("VkCooperativeVectorMatrixLayoutNV")
        public int dstLayout() { return VkConvertCooperativeVectorMatrixInfoNV.ndstLayout(address()); }
        /** @return the value of the {@code dstStride} field. */
        @NativeType("size_t")
        public long dstStride() { return VkConvertCooperativeVectorMatrixInfoNV.ndstStride(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkConvertCooperativeVectorMatrixInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkConvertCooperativeVectorMatrixInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVCooperativeVector#VK_STRUCTURE_TYPE_CONVERT_COOPERATIVE_VECTOR_MATRIX_INFO_NV STRUCTURE_TYPE_CONVERT_COOPERATIVE_VECTOR_MATRIX_INFO_NV} value to the {@code sType} field. */
        public VkConvertCooperativeVectorMatrixInfoNV.Buffer sType$Default() { return sType(NVCooperativeVector.VK_STRUCTURE_TYPE_CONVERT_COOPERATIVE_VECTOR_MATRIX_INFO_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkConvertCooperativeVectorMatrixInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkConvertCooperativeVectorMatrixInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code srcSize} field. */
        public VkConvertCooperativeVectorMatrixInfoNV.Buffer srcSize(@NativeType("size_t") long value) { VkConvertCooperativeVectorMatrixInfoNV.nsrcSize(address(), value); return this; }
        /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@code srcData} field. */
        public VkConvertCooperativeVectorMatrixInfoNV.Buffer srcData(VkDeviceOrHostAddressConstKHR value) { VkConvertCooperativeVectorMatrixInfoNV.nsrcData(address(), value); return this; }
        /** Passes the {@code srcData} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkConvertCooperativeVectorMatrixInfoNV.Buffer srcData(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(srcData()); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code pDstSize} field. */
        public VkConvertCooperativeVectorMatrixInfoNV.Buffer pDstSize(@Nullable @NativeType("size_t *") PointerBuffer value) { VkConvertCooperativeVectorMatrixInfoNV.npDstSize(address(), value); return this; }
        /** Copies the specified {@link VkDeviceOrHostAddressKHR} to the {@code dstData} field. */
        public VkConvertCooperativeVectorMatrixInfoNV.Buffer dstData(VkDeviceOrHostAddressKHR value) { VkConvertCooperativeVectorMatrixInfoNV.ndstData(address(), value); return this; }
        /** Passes the {@code dstData} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkConvertCooperativeVectorMatrixInfoNV.Buffer dstData(java.util.function.Consumer<VkDeviceOrHostAddressKHR> consumer) { consumer.accept(dstData()); return this; }
        /** Sets the specified value to the {@code srcComponentType} field. */
        public VkConvertCooperativeVectorMatrixInfoNV.Buffer srcComponentType(@NativeType("VkComponentTypeNV") int value) { VkConvertCooperativeVectorMatrixInfoNV.nsrcComponentType(address(), value); return this; }
        /** Sets the specified value to the {@code dstComponentType} field. */
        public VkConvertCooperativeVectorMatrixInfoNV.Buffer dstComponentType(@NativeType("VkComponentTypeNV") int value) { VkConvertCooperativeVectorMatrixInfoNV.ndstComponentType(address(), value); return this; }
        /** Sets the specified value to the {@code numRows} field. */
        public VkConvertCooperativeVectorMatrixInfoNV.Buffer numRows(@NativeType("uint32_t") int value) { VkConvertCooperativeVectorMatrixInfoNV.nnumRows(address(), value); return this; }
        /** Sets the specified value to the {@code numColumns} field. */
        public VkConvertCooperativeVectorMatrixInfoNV.Buffer numColumns(@NativeType("uint32_t") int value) { VkConvertCooperativeVectorMatrixInfoNV.nnumColumns(address(), value); return this; }
        /** Sets the specified value to the {@code srcLayout} field. */
        public VkConvertCooperativeVectorMatrixInfoNV.Buffer srcLayout(@NativeType("VkCooperativeVectorMatrixLayoutNV") int value) { VkConvertCooperativeVectorMatrixInfoNV.nsrcLayout(address(), value); return this; }
        /** Sets the specified value to the {@code srcStride} field. */
        public VkConvertCooperativeVectorMatrixInfoNV.Buffer srcStride(@NativeType("size_t") long value) { VkConvertCooperativeVectorMatrixInfoNV.nsrcStride(address(), value); return this; }
        /** Sets the specified value to the {@code dstLayout} field. */
        public VkConvertCooperativeVectorMatrixInfoNV.Buffer dstLayout(@NativeType("VkCooperativeVectorMatrixLayoutNV") int value) { VkConvertCooperativeVectorMatrixInfoNV.ndstLayout(address(), value); return this; }
        /** Sets the specified value to the {@code dstStride} field. */
        public VkConvertCooperativeVectorMatrixInfoNV.Buffer dstStride(@NativeType("size_t") long value) { VkConvertCooperativeVectorMatrixInfoNV.ndstStride(address(), value); return this; }

    }

}