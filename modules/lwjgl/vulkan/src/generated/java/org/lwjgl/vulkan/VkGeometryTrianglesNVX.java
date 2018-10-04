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
 * Structure specifying a triangle geometry in a bottom-level acceleration structure.
 * 
 * <h5>Description</h5>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVXRaytracing#VK_STRUCTURE_TYPE_GEOMETRY_TRIANGLES_NVX STRUCTURE_TYPE_GEOMETRY_TRIANGLES_NVX}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>If {@code vertexData} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code vertexData} <b>must</b> be a valid {@code VkBuffer} handle</li>
 * <li>{@code vertexFormat} <b>must</b> be a valid {@code VkFormat} value</li>
 * <li>If {@code indexData} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code indexData} <b>must</b> be a valid {@code VkBuffer} handle</li>
 * <li>{@code indexType} <b>must</b> be a valid {@code VkIndexType} value</li>
 * <li>If {@code transformData} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code transformData} <b>must</b> be a valid {@code VkBuffer} handle</li>
 * <li>Each of {@code indexData}, {@code transformData}, and {@code vertexData} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkGeometryDataNVX}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code vertexData} &ndash; the buffer containing vertex data.</li>
 * <li>{@code vertexOffset} &ndash; the offset within {@code vertexData} containing vertex data.</li>
 * <li>{@code vertexCount} &ndash; the number of valid vertices.</li>
 * <li>{@code vertexStride} &ndash; the stride in bytes between each vertex.</li>
 * <li>{@code vertexFormat} &ndash; the format of each vertex element.</li>
 * <li>{@code indexData} &ndash; the buffer containing index data.</li>
 * <li>{@code indexOffset} &ndash; the offset within {@code indexData} containing index data.</li>
 * <li>{@code indexCount} &ndash; the number of indices to include in this geometry.</li>
 * <li>{@code indexType} &ndash; the format of each index.</li>
 * <li>{@code transformData} &ndash; a buffer containing optional reference to an array of floats representing a 3x4 row major affine transformation matrix.</li>
 * <li>{@code transformOffset} &ndash; the offset in {@code transformData}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkGeometryTrianglesNVX {
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
 * }</code></pre>
 */
public class VkGeometryTrianglesNVX extends Struct implements NativeResource {

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

    /**
     * Creates a {@link VkGeometryTrianglesNVX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkGeometryTrianglesNVX(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code vertexData} field. */
    @NativeType("VkBuffer")
    public long vertexData() { return nvertexData(address()); }
    /** Returns the value of the {@code vertexOffset} field. */
    @NativeType("VkDeviceSize")
    public long vertexOffset() { return nvertexOffset(address()); }
    /** Returns the value of the {@code vertexCount} field. */
    @NativeType("uint32_t")
    public int vertexCount() { return nvertexCount(address()); }
    /** Returns the value of the {@code vertexStride} field. */
    @NativeType("VkDeviceSize")
    public long vertexStride() { return nvertexStride(address()); }
    /** Returns the value of the {@code vertexFormat} field. */
    @NativeType("VkFormat")
    public int vertexFormat() { return nvertexFormat(address()); }
    /** Returns the value of the {@code indexData} field. */
    @NativeType("VkBuffer")
    public long indexData() { return nindexData(address()); }
    /** Returns the value of the {@code indexOffset} field. */
    @NativeType("VkDeviceSize")
    public long indexOffset() { return nindexOffset(address()); }
    /** Returns the value of the {@code indexCount} field. */
    @NativeType("uint32_t")
    public int indexCount() { return nindexCount(address()); }
    /** Returns the value of the {@code indexType} field. */
    @NativeType("VkIndexType")
    public int indexType() { return nindexType(address()); }
    /** Returns the value of the {@code transformData} field. */
    @NativeType("VkBuffer")
    public long transformData() { return ntransformData(address()); }
    /** Returns the value of the {@code transformOffset} field. */
    @NativeType("VkDeviceSize")
    public long transformOffset() { return ntransformOffset(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkGeometryTrianglesNVX sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkGeometryTrianglesNVX pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code vertexData} field. */
    public VkGeometryTrianglesNVX vertexData(@NativeType("VkBuffer") long value) { nvertexData(address(), value); return this; }
    /** Sets the specified value to the {@code vertexOffset} field. */
    public VkGeometryTrianglesNVX vertexOffset(@NativeType("VkDeviceSize") long value) { nvertexOffset(address(), value); return this; }
    /** Sets the specified value to the {@code vertexCount} field. */
    public VkGeometryTrianglesNVX vertexCount(@NativeType("uint32_t") int value) { nvertexCount(address(), value); return this; }
    /** Sets the specified value to the {@code vertexStride} field. */
    public VkGeometryTrianglesNVX vertexStride(@NativeType("VkDeviceSize") long value) { nvertexStride(address(), value); return this; }
    /** Sets the specified value to the {@code vertexFormat} field. */
    public VkGeometryTrianglesNVX vertexFormat(@NativeType("VkFormat") int value) { nvertexFormat(address(), value); return this; }
    /** Sets the specified value to the {@code indexData} field. */
    public VkGeometryTrianglesNVX indexData(@NativeType("VkBuffer") long value) { nindexData(address(), value); return this; }
    /** Sets the specified value to the {@code indexOffset} field. */
    public VkGeometryTrianglesNVX indexOffset(@NativeType("VkDeviceSize") long value) { nindexOffset(address(), value); return this; }
    /** Sets the specified value to the {@code indexCount} field. */
    public VkGeometryTrianglesNVX indexCount(@NativeType("uint32_t") int value) { nindexCount(address(), value); return this; }
    /** Sets the specified value to the {@code indexType} field. */
    public VkGeometryTrianglesNVX indexType(@NativeType("VkIndexType") int value) { nindexType(address(), value); return this; }
    /** Sets the specified value to the {@code transformData} field. */
    public VkGeometryTrianglesNVX transformData(@NativeType("VkBuffer") long value) { ntransformData(address(), value); return this; }
    /** Sets the specified value to the {@code transformOffset} field. */
    public VkGeometryTrianglesNVX transformOffset(@NativeType("VkDeviceSize") long value) { ntransformOffset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkGeometryTrianglesNVX set(
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
    public VkGeometryTrianglesNVX set(VkGeometryTrianglesNVX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkGeometryTrianglesNVX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkGeometryTrianglesNVX malloc() {
        return wrap(VkGeometryTrianglesNVX.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkGeometryTrianglesNVX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkGeometryTrianglesNVX calloc() {
        return wrap(VkGeometryTrianglesNVX.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkGeometryTrianglesNVX} instance allocated with {@link BufferUtils}. */
    public static VkGeometryTrianglesNVX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkGeometryTrianglesNVX.class, memAddress(container), container);
    }

    /** Returns a new {@link VkGeometryTrianglesNVX} instance for the specified memory address. */
    public static VkGeometryTrianglesNVX create(long address) {
        return wrap(VkGeometryTrianglesNVX.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkGeometryTrianglesNVX createSafe(long address) {
        return address == NULL ? null : wrap(VkGeometryTrianglesNVX.class, address);
    }

    /**
     * Returns a new {@link VkGeometryTrianglesNVX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryTrianglesNVX.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkGeometryTrianglesNVX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryTrianglesNVX.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGeometryTrianglesNVX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryTrianglesNVX.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkGeometryTrianglesNVX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkGeometryTrianglesNVX.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkGeometryTrianglesNVX.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkGeometryTrianglesNVX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkGeometryTrianglesNVX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkGeometryTrianglesNVX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkGeometryTrianglesNVX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkGeometryTrianglesNVX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGeometryTrianglesNVX mallocStack(MemoryStack stack) {
        return wrap(VkGeometryTrianglesNVX.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkGeometryTrianglesNVX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGeometryTrianglesNVX callocStack(MemoryStack stack) {
        return wrap(VkGeometryTrianglesNVX.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkGeometryTrianglesNVX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryTrianglesNVX.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkGeometryTrianglesNVX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryTrianglesNVX.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkGeometryTrianglesNVX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGeometryTrianglesNVX.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGeometryTrianglesNVX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGeometryTrianglesNVX.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkGeometryTrianglesNVX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkGeometryTrianglesNVX.PNEXT); }
    /** Unsafe version of {@link #vertexData}. */
    public static long nvertexData(long struct) { return UNSAFE.getLong(null, struct + VkGeometryTrianglesNVX.VERTEXDATA); }
    /** Unsafe version of {@link #vertexOffset}. */
    public static long nvertexOffset(long struct) { return UNSAFE.getLong(null, struct + VkGeometryTrianglesNVX.VERTEXOFFSET); }
    /** Unsafe version of {@link #vertexCount}. */
    public static int nvertexCount(long struct) { return UNSAFE.getInt(null, struct + VkGeometryTrianglesNVX.VERTEXCOUNT); }
    /** Unsafe version of {@link #vertexStride}. */
    public static long nvertexStride(long struct) { return UNSAFE.getLong(null, struct + VkGeometryTrianglesNVX.VERTEXSTRIDE); }
    /** Unsafe version of {@link #vertexFormat}. */
    public static int nvertexFormat(long struct) { return UNSAFE.getInt(null, struct + VkGeometryTrianglesNVX.VERTEXFORMAT); }
    /** Unsafe version of {@link #indexData}. */
    public static long nindexData(long struct) { return UNSAFE.getLong(null, struct + VkGeometryTrianglesNVX.INDEXDATA); }
    /** Unsafe version of {@link #indexOffset}. */
    public static long nindexOffset(long struct) { return UNSAFE.getLong(null, struct + VkGeometryTrianglesNVX.INDEXOFFSET); }
    /** Unsafe version of {@link #indexCount}. */
    public static int nindexCount(long struct) { return UNSAFE.getInt(null, struct + VkGeometryTrianglesNVX.INDEXCOUNT); }
    /** Unsafe version of {@link #indexType}. */
    public static int nindexType(long struct) { return UNSAFE.getInt(null, struct + VkGeometryTrianglesNVX.INDEXTYPE); }
    /** Unsafe version of {@link #transformData}. */
    public static long ntransformData(long struct) { return UNSAFE.getLong(null, struct + VkGeometryTrianglesNVX.TRANSFORMDATA); }
    /** Unsafe version of {@link #transformOffset}. */
    public static long ntransformOffset(long struct) { return UNSAFE.getLong(null, struct + VkGeometryTrianglesNVX.TRANSFORMOFFSET); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkGeometryTrianglesNVX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkGeometryTrianglesNVX.PNEXT, value); }
    /** Unsafe version of {@link #vertexData(long) vertexData}. */
    public static void nvertexData(long struct, long value) { UNSAFE.putLong(null, struct + VkGeometryTrianglesNVX.VERTEXDATA, value); }
    /** Unsafe version of {@link #vertexOffset(long) vertexOffset}. */
    public static void nvertexOffset(long struct, long value) { UNSAFE.putLong(null, struct + VkGeometryTrianglesNVX.VERTEXOFFSET, value); }
    /** Unsafe version of {@link #vertexCount(int) vertexCount}. */
    public static void nvertexCount(long struct, int value) { UNSAFE.putInt(null, struct + VkGeometryTrianglesNVX.VERTEXCOUNT, value); }
    /** Unsafe version of {@link #vertexStride(long) vertexStride}. */
    public static void nvertexStride(long struct, long value) { UNSAFE.putLong(null, struct + VkGeometryTrianglesNVX.VERTEXSTRIDE, value); }
    /** Unsafe version of {@link #vertexFormat(int) vertexFormat}. */
    public static void nvertexFormat(long struct, int value) { UNSAFE.putInt(null, struct + VkGeometryTrianglesNVX.VERTEXFORMAT, value); }
    /** Unsafe version of {@link #indexData(long) indexData}. */
    public static void nindexData(long struct, long value) { UNSAFE.putLong(null, struct + VkGeometryTrianglesNVX.INDEXDATA, value); }
    /** Unsafe version of {@link #indexOffset(long) indexOffset}. */
    public static void nindexOffset(long struct, long value) { UNSAFE.putLong(null, struct + VkGeometryTrianglesNVX.INDEXOFFSET, value); }
    /** Unsafe version of {@link #indexCount(int) indexCount}. */
    public static void nindexCount(long struct, int value) { UNSAFE.putInt(null, struct + VkGeometryTrianglesNVX.INDEXCOUNT, value); }
    /** Unsafe version of {@link #indexType(int) indexType}. */
    public static void nindexType(long struct, int value) { UNSAFE.putInt(null, struct + VkGeometryTrianglesNVX.INDEXTYPE, value); }
    /** Unsafe version of {@link #transformData(long) transformData}. */
    public static void ntransformData(long struct, long value) { UNSAFE.putLong(null, struct + VkGeometryTrianglesNVX.TRANSFORMDATA, value); }
    /** Unsafe version of {@link #transformOffset(long) transformOffset}. */
    public static void ntransformOffset(long struct, long value) { UNSAFE.putLong(null, struct + VkGeometryTrianglesNVX.TRANSFORMOFFSET, value); }

    // -----------------------------------

    /** An array of {@link VkGeometryTrianglesNVX} structs. */
    public static class Buffer extends StructBuffer<VkGeometryTrianglesNVX, Buffer> implements NativeResource {

        private static final VkGeometryTrianglesNVX ELEMENT_FACTORY = VkGeometryTrianglesNVX.create(-1L);

        /**
         * Creates a new {@link VkGeometryTrianglesNVX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkGeometryTrianglesNVX#SIZEOF}, and its mark will be undefined.
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
        protected VkGeometryTrianglesNVX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkGeometryTrianglesNVX.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkGeometryTrianglesNVX.npNext(address()); }
        /** Returns the value of the {@code vertexData} field. */
        @NativeType("VkBuffer")
        public long vertexData() { return VkGeometryTrianglesNVX.nvertexData(address()); }
        /** Returns the value of the {@code vertexOffset} field. */
        @NativeType("VkDeviceSize")
        public long vertexOffset() { return VkGeometryTrianglesNVX.nvertexOffset(address()); }
        /** Returns the value of the {@code vertexCount} field. */
        @NativeType("uint32_t")
        public int vertexCount() { return VkGeometryTrianglesNVX.nvertexCount(address()); }
        /** Returns the value of the {@code vertexStride} field. */
        @NativeType("VkDeviceSize")
        public long vertexStride() { return VkGeometryTrianglesNVX.nvertexStride(address()); }
        /** Returns the value of the {@code vertexFormat} field. */
        @NativeType("VkFormat")
        public int vertexFormat() { return VkGeometryTrianglesNVX.nvertexFormat(address()); }
        /** Returns the value of the {@code indexData} field. */
        @NativeType("VkBuffer")
        public long indexData() { return VkGeometryTrianglesNVX.nindexData(address()); }
        /** Returns the value of the {@code indexOffset} field. */
        @NativeType("VkDeviceSize")
        public long indexOffset() { return VkGeometryTrianglesNVX.nindexOffset(address()); }
        /** Returns the value of the {@code indexCount} field. */
        @NativeType("uint32_t")
        public int indexCount() { return VkGeometryTrianglesNVX.nindexCount(address()); }
        /** Returns the value of the {@code indexType} field. */
        @NativeType("VkIndexType")
        public int indexType() { return VkGeometryTrianglesNVX.nindexType(address()); }
        /** Returns the value of the {@code transformData} field. */
        @NativeType("VkBuffer")
        public long transformData() { return VkGeometryTrianglesNVX.ntransformData(address()); }
        /** Returns the value of the {@code transformOffset} field. */
        @NativeType("VkDeviceSize")
        public long transformOffset() { return VkGeometryTrianglesNVX.ntransformOffset(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkGeometryTrianglesNVX.Buffer sType(@NativeType("VkStructureType") int value) { VkGeometryTrianglesNVX.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkGeometryTrianglesNVX.Buffer pNext(@NativeType("void const *") long value) { VkGeometryTrianglesNVX.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code vertexData} field. */
        public VkGeometryTrianglesNVX.Buffer vertexData(@NativeType("VkBuffer") long value) { VkGeometryTrianglesNVX.nvertexData(address(), value); return this; }
        /** Sets the specified value to the {@code vertexOffset} field. */
        public VkGeometryTrianglesNVX.Buffer vertexOffset(@NativeType("VkDeviceSize") long value) { VkGeometryTrianglesNVX.nvertexOffset(address(), value); return this; }
        /** Sets the specified value to the {@code vertexCount} field. */
        public VkGeometryTrianglesNVX.Buffer vertexCount(@NativeType("uint32_t") int value) { VkGeometryTrianglesNVX.nvertexCount(address(), value); return this; }
        /** Sets the specified value to the {@code vertexStride} field. */
        public VkGeometryTrianglesNVX.Buffer vertexStride(@NativeType("VkDeviceSize") long value) { VkGeometryTrianglesNVX.nvertexStride(address(), value); return this; }
        /** Sets the specified value to the {@code vertexFormat} field. */
        public VkGeometryTrianglesNVX.Buffer vertexFormat(@NativeType("VkFormat") int value) { VkGeometryTrianglesNVX.nvertexFormat(address(), value); return this; }
        /** Sets the specified value to the {@code indexData} field. */
        public VkGeometryTrianglesNVX.Buffer indexData(@NativeType("VkBuffer") long value) { VkGeometryTrianglesNVX.nindexData(address(), value); return this; }
        /** Sets the specified value to the {@code indexOffset} field. */
        public VkGeometryTrianglesNVX.Buffer indexOffset(@NativeType("VkDeviceSize") long value) { VkGeometryTrianglesNVX.nindexOffset(address(), value); return this; }
        /** Sets the specified value to the {@code indexCount} field. */
        public VkGeometryTrianglesNVX.Buffer indexCount(@NativeType("uint32_t") int value) { VkGeometryTrianglesNVX.nindexCount(address(), value); return this; }
        /** Sets the specified value to the {@code indexType} field. */
        public VkGeometryTrianglesNVX.Buffer indexType(@NativeType("VkIndexType") int value) { VkGeometryTrianglesNVX.nindexType(address(), value); return this; }
        /** Sets the specified value to the {@code transformData} field. */
        public VkGeometryTrianglesNVX.Buffer transformData(@NativeType("VkBuffer") long value) { VkGeometryTrianglesNVX.ntransformData(address(), value); return this; }
        /** Sets the specified value to the {@code transformOffset} field. */
        public VkGeometryTrianglesNVX.Buffer transformOffset(@NativeType("VkDeviceSize") long value) { VkGeometryTrianglesNVX.ntransformOffset(address(), value); return this; }

    }

}