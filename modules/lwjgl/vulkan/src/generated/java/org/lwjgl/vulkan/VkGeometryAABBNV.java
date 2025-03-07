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
 * struct VkGeometryAABBNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBuffer aabbData;
 *     uint32_t numAABBs;
 *     uint32_t stride;
 *     VkDeviceSize offset;
 * }}</pre>
 */
public class VkGeometryAABBNV extends Struct<VkGeometryAABBNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        AABBDATA,
        NUMAABBS,
        STRIDE,
        OFFSET;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        AABBDATA = layout.offsetof(2);
        NUMAABBS = layout.offsetof(3);
        STRIDE = layout.offsetof(4);
        OFFSET = layout.offsetof(5);
    }

    protected VkGeometryAABBNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkGeometryAABBNV create(long address, @Nullable ByteBuffer container) {
        return new VkGeometryAABBNV(address, container);
    }

    /**
     * Creates a {@code VkGeometryAABBNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkGeometryAABBNV(ByteBuffer container) {
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
    /** @return the value of the {@code aabbData} field. */
    @NativeType("VkBuffer")
    public long aabbData() { return naabbData(address()); }
    /** @return the value of the {@code numAABBs} field. */
    @NativeType("uint32_t")
    public int numAABBs() { return nnumAABBs(address()); }
    /** @return the value of the {@code stride} field. */
    @NativeType("uint32_t")
    public int stride() { return nstride(address()); }
    /** @return the value of the {@code offset} field. */
    @NativeType("VkDeviceSize")
    public long offset() { return noffset(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkGeometryAABBNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVRayTracing#VK_STRUCTURE_TYPE_GEOMETRY_AABB_NV STRUCTURE_TYPE_GEOMETRY_AABB_NV} value to the {@code sType} field. */
    public VkGeometryAABBNV sType$Default() { return sType(NVRayTracing.VK_STRUCTURE_TYPE_GEOMETRY_AABB_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkGeometryAABBNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code aabbData} field. */
    public VkGeometryAABBNV aabbData(@NativeType("VkBuffer") long value) { naabbData(address(), value); return this; }
    /** Sets the specified value to the {@code numAABBs} field. */
    public VkGeometryAABBNV numAABBs(@NativeType("uint32_t") int value) { nnumAABBs(address(), value); return this; }
    /** Sets the specified value to the {@code stride} field. */
    public VkGeometryAABBNV stride(@NativeType("uint32_t") int value) { nstride(address(), value); return this; }
    /** Sets the specified value to the {@code offset} field. */
    public VkGeometryAABBNV offset(@NativeType("VkDeviceSize") long value) { noffset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkGeometryAABBNV set(
        int sType,
        long pNext,
        long aabbData,
        int numAABBs,
        int stride,
        long offset
    ) {
        sType(sType);
        pNext(pNext);
        aabbData(aabbData);
        numAABBs(numAABBs);
        stride(stride);
        offset(offset);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkGeometryAABBNV set(VkGeometryAABBNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkGeometryAABBNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkGeometryAABBNV malloc() {
        return new VkGeometryAABBNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkGeometryAABBNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkGeometryAABBNV calloc() {
        return new VkGeometryAABBNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkGeometryAABBNV} instance allocated with {@link BufferUtils}. */
    public static VkGeometryAABBNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkGeometryAABBNV(memAddress(container), container);
    }

    /** Returns a new {@code VkGeometryAABBNV} instance for the specified memory address. */
    public static VkGeometryAABBNV create(long address) {
        return new VkGeometryAABBNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkGeometryAABBNV createSafe(long address) {
        return address == NULL ? null : new VkGeometryAABBNV(address, null);
    }

    /**
     * Returns a new {@link VkGeometryAABBNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryAABBNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkGeometryAABBNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryAABBNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGeometryAABBNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryAABBNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkGeometryAABBNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkGeometryAABBNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkGeometryAABBNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkGeometryAABBNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkGeometryAABBNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkGeometryAABBNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkGeometryAABBNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkGeometryAABBNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkGeometryAABBNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkGeometryAABBNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkGeometryAABBNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkGeometryAABBNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGeometryAABBNV malloc(MemoryStack stack) {
        return new VkGeometryAABBNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkGeometryAABBNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGeometryAABBNV calloc(MemoryStack stack) {
        return new VkGeometryAABBNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkGeometryAABBNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGeometryAABBNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGeometryAABBNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGeometryAABBNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkGeometryAABBNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkGeometryAABBNV.PNEXT); }
    /** Unsafe version of {@link #aabbData}. */
    public static long naabbData(long struct) { return memGetLong(struct + VkGeometryAABBNV.AABBDATA); }
    /** Unsafe version of {@link #numAABBs}. */
    public static int nnumAABBs(long struct) { return memGetInt(struct + VkGeometryAABBNV.NUMAABBS); }
    /** Unsafe version of {@link #stride}. */
    public static int nstride(long struct) { return memGetInt(struct + VkGeometryAABBNV.STRIDE); }
    /** Unsafe version of {@link #offset}. */
    public static long noffset(long struct) { return memGetLong(struct + VkGeometryAABBNV.OFFSET); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkGeometryAABBNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkGeometryAABBNV.PNEXT, value); }
    /** Unsafe version of {@link #aabbData(long) aabbData}. */
    public static void naabbData(long struct, long value) { memPutLong(struct + VkGeometryAABBNV.AABBDATA, value); }
    /** Unsafe version of {@link #numAABBs(int) numAABBs}. */
    public static void nnumAABBs(long struct, int value) { memPutInt(struct + VkGeometryAABBNV.NUMAABBS, value); }
    /** Unsafe version of {@link #stride(int) stride}. */
    public static void nstride(long struct, int value) { memPutInt(struct + VkGeometryAABBNV.STRIDE, value); }
    /** Unsafe version of {@link #offset(long) offset}. */
    public static void noffset(long struct, long value) { memPutLong(struct + VkGeometryAABBNV.OFFSET, value); }

    // -----------------------------------

    /** An array of {@link VkGeometryAABBNV} structs. */
    public static class Buffer extends StructBuffer<VkGeometryAABBNV, Buffer> implements NativeResource {

        private static final VkGeometryAABBNV ELEMENT_FACTORY = VkGeometryAABBNV.create(-1L);

        /**
         * Creates a new {@code VkGeometryAABBNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkGeometryAABBNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkGeometryAABBNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkGeometryAABBNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkGeometryAABBNV.npNext(address()); }
        /** @return the value of the {@code aabbData} field. */
        @NativeType("VkBuffer")
        public long aabbData() { return VkGeometryAABBNV.naabbData(address()); }
        /** @return the value of the {@code numAABBs} field. */
        @NativeType("uint32_t")
        public int numAABBs() { return VkGeometryAABBNV.nnumAABBs(address()); }
        /** @return the value of the {@code stride} field. */
        @NativeType("uint32_t")
        public int stride() { return VkGeometryAABBNV.nstride(address()); }
        /** @return the value of the {@code offset} field. */
        @NativeType("VkDeviceSize")
        public long offset() { return VkGeometryAABBNV.noffset(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkGeometryAABBNV.Buffer sType(@NativeType("VkStructureType") int value) { VkGeometryAABBNV.nsType(address(), value); return this; }
        /** Sets the {@link NVRayTracing#VK_STRUCTURE_TYPE_GEOMETRY_AABB_NV STRUCTURE_TYPE_GEOMETRY_AABB_NV} value to the {@code sType} field. */
        public VkGeometryAABBNV.Buffer sType$Default() { return sType(NVRayTracing.VK_STRUCTURE_TYPE_GEOMETRY_AABB_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkGeometryAABBNV.Buffer pNext(@NativeType("void const *") long value) { VkGeometryAABBNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code aabbData} field. */
        public VkGeometryAABBNV.Buffer aabbData(@NativeType("VkBuffer") long value) { VkGeometryAABBNV.naabbData(address(), value); return this; }
        /** Sets the specified value to the {@code numAABBs} field. */
        public VkGeometryAABBNV.Buffer numAABBs(@NativeType("uint32_t") int value) { VkGeometryAABBNV.nnumAABBs(address(), value); return this; }
        /** Sets the specified value to the {@code stride} field. */
        public VkGeometryAABBNV.Buffer stride(@NativeType("uint32_t") int value) { VkGeometryAABBNV.nstride(address(), value); return this; }
        /** Sets the specified value to the {@code offset} field. */
        public VkGeometryAABBNV.Buffer offset(@NativeType("VkDeviceSize") long value) { VkGeometryAABBNV.noffset(address(), value); return this; }

    }

}