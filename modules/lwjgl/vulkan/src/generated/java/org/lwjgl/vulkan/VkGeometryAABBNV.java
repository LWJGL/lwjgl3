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
 * Structure specifying axis-aligned bounding box geometry in a bottom-level acceleration structure.
 * 
 * <h5>Description</h5>
 * 
 * <p>The AABB data in memory is six 32-bit floats consisting of the minimum x, y, and z values followed by the maximum x, y, and z values.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code offset} <b>must</b> be less than the size of {@code aabbData}</li>
 * <li>{@code offset} <b>must</b> be a multiple of 8</li>
 * <li>{@code stride} <b>must</b> be a multiple of 8</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVRayTracing#VK_STRUCTURE_TYPE_GEOMETRY_AABB_NV STRUCTURE_TYPE_GEOMETRY_AABB_NV}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>If {@code aabbData} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code aabbData} <b>must</b> be a valid {@code VkBuffer} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkGeometryDataNV}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkGeometryAABBNV {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkBuffer {@link #aabbData};
 *     uint32_t {@link #numAABBs};
 *     uint32_t {@link #stride};
 *     VkDeviceSize {@link #offset};
 * }</code></pre>
 */
public class VkGeometryAABBNV extends Struct implements NativeResource {

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

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the buffer containing axis-aligned bounding box data. */
    @NativeType("VkBuffer")
    public long aabbData() { return naabbData(address()); }
    /** the number of AABBs in this geometry. */
    @NativeType("uint32_t")
    public int numAABBs() { return nnumAABBs(address()); }
    /** the stride in bytes between AABBs in {@code aabbData}. */
    @NativeType("uint32_t")
    public int stride() { return nstride(address()); }
    /** the offset in bytes of the first AABB in {@code aabbData}. */
    @NativeType("VkDeviceSize")
    public long offset() { return noffset(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkGeometryAABBNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVRayTracing#VK_STRUCTURE_TYPE_GEOMETRY_AABB_NV STRUCTURE_TYPE_GEOMETRY_AABB_NV} value to the {@link #sType} field. */
    public VkGeometryAABBNV sType$Default() { return sType(NVRayTracing.VK_STRUCTURE_TYPE_GEOMETRY_AABB_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkGeometryAABBNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #aabbData} field. */
    public VkGeometryAABBNV aabbData(@NativeType("VkBuffer") long value) { naabbData(address(), value); return this; }
    /** Sets the specified value to the {@link #numAABBs} field. */
    public VkGeometryAABBNV numAABBs(@NativeType("uint32_t") int value) { nnumAABBs(address(), value); return this; }
    /** Sets the specified value to the {@link #stride} field. */
    public VkGeometryAABBNV stride(@NativeType("uint32_t") int value) { nstride(address(), value); return this; }
    /** Sets the specified value to the {@link #offset} field. */
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
        return wrap(VkGeometryAABBNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkGeometryAABBNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkGeometryAABBNV calloc() {
        return wrap(VkGeometryAABBNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkGeometryAABBNV} instance allocated with {@link BufferUtils}. */
    public static VkGeometryAABBNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkGeometryAABBNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkGeometryAABBNV} instance for the specified memory address. */
    public static VkGeometryAABBNV create(long address) {
        return wrap(VkGeometryAABBNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkGeometryAABBNV createSafe(long address) {
        return address == NULL ? null : wrap(VkGeometryAABBNV.class, address);
    }

    /**
     * Returns a new {@link VkGeometryAABBNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryAABBNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkGeometryAABBNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryAABBNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGeometryAABBNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryAABBNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkGeometryAABBNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkGeometryAABBNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkGeometryAABBNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
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
        return wrap(VkGeometryAABBNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkGeometryAABBNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGeometryAABBNV calloc(MemoryStack stack) {
        return wrap(VkGeometryAABBNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkGeometryAABBNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGeometryAABBNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGeometryAABBNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGeometryAABBNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkGeometryAABBNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkGeometryAABBNV.PNEXT); }
    /** Unsafe version of {@link #aabbData}. */
    public static long naabbData(long struct) { return UNSAFE.getLong(null, struct + VkGeometryAABBNV.AABBDATA); }
    /** Unsafe version of {@link #numAABBs}. */
    public static int nnumAABBs(long struct) { return UNSAFE.getInt(null, struct + VkGeometryAABBNV.NUMAABBS); }
    /** Unsafe version of {@link #stride}. */
    public static int nstride(long struct) { return UNSAFE.getInt(null, struct + VkGeometryAABBNV.STRIDE); }
    /** Unsafe version of {@link #offset}. */
    public static long noffset(long struct) { return UNSAFE.getLong(null, struct + VkGeometryAABBNV.OFFSET); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkGeometryAABBNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkGeometryAABBNV.PNEXT, value); }
    /** Unsafe version of {@link #aabbData(long) aabbData}. */
    public static void naabbData(long struct, long value) { UNSAFE.putLong(null, struct + VkGeometryAABBNV.AABBDATA, value); }
    /** Unsafe version of {@link #numAABBs(int) numAABBs}. */
    public static void nnumAABBs(long struct, int value) { UNSAFE.putInt(null, struct + VkGeometryAABBNV.NUMAABBS, value); }
    /** Unsafe version of {@link #stride(int) stride}. */
    public static void nstride(long struct, int value) { UNSAFE.putInt(null, struct + VkGeometryAABBNV.STRIDE, value); }
    /** Unsafe version of {@link #offset(long) offset}. */
    public static void noffset(long struct, long value) { UNSAFE.putLong(null, struct + VkGeometryAABBNV.OFFSET, value); }

    // -----------------------------------

    /** An array of {@link VkGeometryAABBNV} structs. */
    public static class Buffer extends StructBuffer<VkGeometryAABBNV, Buffer> implements NativeResource {

        private static final VkGeometryAABBNV ELEMENT_FACTORY = VkGeometryAABBNV.create(-1L);

        /**
         * Creates a new {@code VkGeometryAABBNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkGeometryAABBNV#SIZEOF}, and its mark will be undefined.
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
        protected VkGeometryAABBNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkGeometryAABBNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkGeometryAABBNV.nsType(address()); }
        /** @return the value of the {@link VkGeometryAABBNV#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkGeometryAABBNV.npNext(address()); }
        /** @return the value of the {@link VkGeometryAABBNV#aabbData} field. */
        @NativeType("VkBuffer")
        public long aabbData() { return VkGeometryAABBNV.naabbData(address()); }
        /** @return the value of the {@link VkGeometryAABBNV#numAABBs} field. */
        @NativeType("uint32_t")
        public int numAABBs() { return VkGeometryAABBNV.nnumAABBs(address()); }
        /** @return the value of the {@link VkGeometryAABBNV#stride} field. */
        @NativeType("uint32_t")
        public int stride() { return VkGeometryAABBNV.nstride(address()); }
        /** @return the value of the {@link VkGeometryAABBNV#offset} field. */
        @NativeType("VkDeviceSize")
        public long offset() { return VkGeometryAABBNV.noffset(address()); }

        /** Sets the specified value to the {@link VkGeometryAABBNV#sType} field. */
        public VkGeometryAABBNV.Buffer sType(@NativeType("VkStructureType") int value) { VkGeometryAABBNV.nsType(address(), value); return this; }
        /** Sets the {@link NVRayTracing#VK_STRUCTURE_TYPE_GEOMETRY_AABB_NV STRUCTURE_TYPE_GEOMETRY_AABB_NV} value to the {@link VkGeometryAABBNV#sType} field. */
        public VkGeometryAABBNV.Buffer sType$Default() { return sType(NVRayTracing.VK_STRUCTURE_TYPE_GEOMETRY_AABB_NV); }
        /** Sets the specified value to the {@link VkGeometryAABBNV#pNext} field. */
        public VkGeometryAABBNV.Buffer pNext(@NativeType("void const *") long value) { VkGeometryAABBNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkGeometryAABBNV#aabbData} field. */
        public VkGeometryAABBNV.Buffer aabbData(@NativeType("VkBuffer") long value) { VkGeometryAABBNV.naabbData(address(), value); return this; }
        /** Sets the specified value to the {@link VkGeometryAABBNV#numAABBs} field. */
        public VkGeometryAABBNV.Buffer numAABBs(@NativeType("uint32_t") int value) { VkGeometryAABBNV.nnumAABBs(address(), value); return this; }
        /** Sets the specified value to the {@link VkGeometryAABBNV#stride} field. */
        public VkGeometryAABBNV.Buffer stride(@NativeType("uint32_t") int value) { VkGeometryAABBNV.nstride(address(), value); return this; }
        /** Sets the specified value to the {@link VkGeometryAABBNV#offset} field. */
        public VkGeometryAABBNV.Buffer offset(@NativeType("VkDeviceSize") long value) { VkGeometryAABBNV.noffset(address(), value); return this; }

    }

}