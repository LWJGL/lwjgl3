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
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVXRaytracing#VK_STRUCTURE_TYPE_GEOMETRY_AABB_NVX STRUCTURE_TYPE_GEOMETRY_AABB_NVX}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>If {@code aabbData} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code aabbData} <b>must</b> be a valid {@code VkBuffer} handle</li>
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
 * <li>{@code aabbData} &ndash; the buffer containing axis-aligned bounding box data</li>
 * <li>{@code numAABBs} &ndash; the number of AABBs in this geometry.</li>
 * <li>{@code stride} &ndash; the stride in bytes between AABBs in {@code aabbData}.</li>
 * <li>{@code offset} &ndash; the offset in bytes of the first AABB in {@code aabbData}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkGeometryAABBNVX {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBuffer aabbData;
 *     uint32_t numAABBs;
 *     uint32_t stride;
 *     VkDeviceSize offset;
 * }</code></pre>
 */
public class VkGeometryAABBNVX extends Struct implements NativeResource {

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

    VkGeometryAABBNVX(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkGeometryAABBNVX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkGeometryAABBNVX(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code aabbData} field. */
    @NativeType("VkBuffer")
    public long aabbData() { return naabbData(address()); }
    /** Returns the value of the {@code numAABBs} field. */
    @NativeType("uint32_t")
    public int numAABBs() { return nnumAABBs(address()); }
    /** Returns the value of the {@code stride} field. */
    @NativeType("uint32_t")
    public int stride() { return nstride(address()); }
    /** Returns the value of the {@code offset} field. */
    @NativeType("VkDeviceSize")
    public long offset() { return noffset(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkGeometryAABBNVX sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkGeometryAABBNVX pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code aabbData} field. */
    public VkGeometryAABBNVX aabbData(@NativeType("VkBuffer") long value) { naabbData(address(), value); return this; }
    /** Sets the specified value to the {@code numAABBs} field. */
    public VkGeometryAABBNVX numAABBs(@NativeType("uint32_t") int value) { nnumAABBs(address(), value); return this; }
    /** Sets the specified value to the {@code stride} field. */
    public VkGeometryAABBNVX stride(@NativeType("uint32_t") int value) { nstride(address(), value); return this; }
    /** Sets the specified value to the {@code offset} field. */
    public VkGeometryAABBNVX offset(@NativeType("VkDeviceSize") long value) { noffset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkGeometryAABBNVX set(
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
    public VkGeometryAABBNVX set(VkGeometryAABBNVX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkGeometryAABBNVX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkGeometryAABBNVX malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkGeometryAABBNVX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkGeometryAABBNVX calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkGeometryAABBNVX} instance allocated with {@link BufferUtils}. */
    public static VkGeometryAABBNVX create() {
        return new VkGeometryAABBNVX(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkGeometryAABBNVX} instance for the specified memory address. */
    public static VkGeometryAABBNVX create(long address) {
        return new VkGeometryAABBNVX(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkGeometryAABBNVX createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkGeometryAABBNVX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryAABBNVX.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGeometryAABBNVX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryAABBNVX.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGeometryAABBNVX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryAABBNVX.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkGeometryAABBNVX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkGeometryAABBNVX.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkGeometryAABBNVX.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkGeometryAABBNVX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkGeometryAABBNVX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkGeometryAABBNVX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkGeometryAABBNVX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkGeometryAABBNVX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGeometryAABBNVX mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkGeometryAABBNVX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGeometryAABBNVX callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkGeometryAABBNVX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryAABBNVX.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkGeometryAABBNVX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeometryAABBNVX.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkGeometryAABBNVX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGeometryAABBNVX.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGeometryAABBNVX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGeometryAABBNVX.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkGeometryAABBNVX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkGeometryAABBNVX.PNEXT); }
    /** Unsafe version of {@link #aabbData}. */
    public static long naabbData(long struct) { return memGetLong(struct + VkGeometryAABBNVX.AABBDATA); }
    /** Unsafe version of {@link #numAABBs}. */
    public static int nnumAABBs(long struct) { return memGetInt(struct + VkGeometryAABBNVX.NUMAABBS); }
    /** Unsafe version of {@link #stride}. */
    public static int nstride(long struct) { return memGetInt(struct + VkGeometryAABBNVX.STRIDE); }
    /** Unsafe version of {@link #offset}. */
    public static long noffset(long struct) { return memGetLong(struct + VkGeometryAABBNVX.OFFSET); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkGeometryAABBNVX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkGeometryAABBNVX.PNEXT, value); }
    /** Unsafe version of {@link #aabbData(long) aabbData}. */
    public static void naabbData(long struct, long value) { memPutLong(struct + VkGeometryAABBNVX.AABBDATA, value); }
    /** Unsafe version of {@link #numAABBs(int) numAABBs}. */
    public static void nnumAABBs(long struct, int value) { memPutInt(struct + VkGeometryAABBNVX.NUMAABBS, value); }
    /** Unsafe version of {@link #stride(int) stride}. */
    public static void nstride(long struct, int value) { memPutInt(struct + VkGeometryAABBNVX.STRIDE, value); }
    /** Unsafe version of {@link #offset(long) offset}. */
    public static void noffset(long struct, long value) { memPutLong(struct + VkGeometryAABBNVX.OFFSET, value); }

    // -----------------------------------

    /** An array of {@link VkGeometryAABBNVX} structs. */
    public static class Buffer extends StructBuffer<VkGeometryAABBNVX, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkGeometryAABBNVX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkGeometryAABBNVX#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VkGeometryAABBNVX newInstance(long address) {
            return new VkGeometryAABBNVX(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkGeometryAABBNVX.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkGeometryAABBNVX.npNext(address()); }
        /** Returns the value of the {@code aabbData} field. */
        @NativeType("VkBuffer")
        public long aabbData() { return VkGeometryAABBNVX.naabbData(address()); }
        /** Returns the value of the {@code numAABBs} field. */
        @NativeType("uint32_t")
        public int numAABBs() { return VkGeometryAABBNVX.nnumAABBs(address()); }
        /** Returns the value of the {@code stride} field. */
        @NativeType("uint32_t")
        public int stride() { return VkGeometryAABBNVX.nstride(address()); }
        /** Returns the value of the {@code offset} field. */
        @NativeType("VkDeviceSize")
        public long offset() { return VkGeometryAABBNVX.noffset(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkGeometryAABBNVX.Buffer sType(@NativeType("VkStructureType") int value) { VkGeometryAABBNVX.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkGeometryAABBNVX.Buffer pNext(@NativeType("void const *") long value) { VkGeometryAABBNVX.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code aabbData} field. */
        public VkGeometryAABBNVX.Buffer aabbData(@NativeType("VkBuffer") long value) { VkGeometryAABBNVX.naabbData(address(), value); return this; }
        /** Sets the specified value to the {@code numAABBs} field. */
        public VkGeometryAABBNVX.Buffer numAABBs(@NativeType("uint32_t") int value) { VkGeometryAABBNVX.nnumAABBs(address(), value); return this; }
        /** Sets the specified value to the {@code stride} field. */
        public VkGeometryAABBNVX.Buffer stride(@NativeType("uint32_t") int value) { VkGeometryAABBNVX.nstride(address(), value); return this; }
        /** Sets the specified value to the {@code offset} field. */
        public VkGeometryAABBNVX.Buffer offset(@NativeType("VkDeviceSize") long value) { VkGeometryAABBNVX.noffset(address(), value); return this; }

    }

}