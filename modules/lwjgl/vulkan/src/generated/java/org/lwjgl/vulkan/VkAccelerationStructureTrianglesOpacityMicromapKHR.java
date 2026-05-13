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
 * struct VkAccelerationStructureTrianglesOpacityMicromapKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkIndexType indexType;
 *     VkDeviceAddress indexBuffer;
 *     VkDeviceSize indexStride;
 *     uint32_t baseTriangle;
 *     VkAccelerationStructureKHR micromap;
 * }}</pre>
 */
public class VkAccelerationStructureTrianglesOpacityMicromapKHR extends Struct<VkAccelerationStructureTrianglesOpacityMicromapKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        INDEXTYPE,
        INDEXBUFFER,
        INDEXSTRIDE,
        BASETRIANGLE,
        MICROMAP;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(8),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        INDEXTYPE = layout.offsetof(2);
        INDEXBUFFER = layout.offsetof(3);
        INDEXSTRIDE = layout.offsetof(4);
        BASETRIANGLE = layout.offsetof(5);
        MICROMAP = layout.offsetof(6);
    }

    protected VkAccelerationStructureTrianglesOpacityMicromapKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAccelerationStructureTrianglesOpacityMicromapKHR create(long address, @Nullable ByteBuffer container) {
        return new VkAccelerationStructureTrianglesOpacityMicromapKHR(address, container);
    }

    /**
     * Creates a {@code VkAccelerationStructureTrianglesOpacityMicromapKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAccelerationStructureTrianglesOpacityMicromapKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code indexType} field. */
    @NativeType("VkIndexType")
    public int indexType() { return nindexType(address()); }
    /** @return the value of the {@code indexBuffer} field. */
    @NativeType("VkDeviceAddress")
    public long indexBuffer() { return nindexBuffer(address()); }
    /** @return the value of the {@code indexStride} field. */
    @NativeType("VkDeviceSize")
    public long indexStride() { return nindexStride(address()); }
    /** @return the value of the {@code baseTriangle} field. */
    @NativeType("uint32_t")
    public int baseTriangle() { return nbaseTriangle(address()); }
    /** @return the value of the {@code micromap} field. */
    @NativeType("VkAccelerationStructureKHR")
    public long micromap() { return nmicromap(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkAccelerationStructureTrianglesOpacityMicromapKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHROpacityMicromap#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_OPACITY_MICROMAP_KHR STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_OPACITY_MICROMAP_KHR} value to the {@code sType} field. */
    public VkAccelerationStructureTrianglesOpacityMicromapKHR sType$Default() { return sType(KHROpacityMicromap.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_OPACITY_MICROMAP_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkAccelerationStructureTrianglesOpacityMicromapKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code indexType} field. */
    public VkAccelerationStructureTrianglesOpacityMicromapKHR indexType(@NativeType("VkIndexType") int value) { nindexType(address(), value); return this; }
    /** Sets the specified value to the {@code indexBuffer} field. */
    public VkAccelerationStructureTrianglesOpacityMicromapKHR indexBuffer(@NativeType("VkDeviceAddress") long value) { nindexBuffer(address(), value); return this; }
    /** Sets the specified value to the {@code indexStride} field. */
    public VkAccelerationStructureTrianglesOpacityMicromapKHR indexStride(@NativeType("VkDeviceSize") long value) { nindexStride(address(), value); return this; }
    /** Sets the specified value to the {@code baseTriangle} field. */
    public VkAccelerationStructureTrianglesOpacityMicromapKHR baseTriangle(@NativeType("uint32_t") int value) { nbaseTriangle(address(), value); return this; }
    /** Sets the specified value to the {@code micromap} field. */
    public VkAccelerationStructureTrianglesOpacityMicromapKHR micromap(@NativeType("VkAccelerationStructureKHR") long value) { nmicromap(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAccelerationStructureTrianglesOpacityMicromapKHR set(
        int sType,
        long pNext,
        int indexType,
        long indexBuffer,
        long indexStride,
        int baseTriangle,
        long micromap
    ) {
        sType(sType);
        pNext(pNext);
        indexType(indexType);
        indexBuffer(indexBuffer);
        indexStride(indexStride);
        baseTriangle(baseTriangle);
        micromap(micromap);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAccelerationStructureTrianglesOpacityMicromapKHR set(VkAccelerationStructureTrianglesOpacityMicromapKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAccelerationStructureTrianglesOpacityMicromapKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureTrianglesOpacityMicromapKHR malloc() {
        return new VkAccelerationStructureTrianglesOpacityMicromapKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureTrianglesOpacityMicromapKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureTrianglesOpacityMicromapKHR calloc() {
        return new VkAccelerationStructureTrianglesOpacityMicromapKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureTrianglesOpacityMicromapKHR} instance allocated with {@link BufferUtils}. */
    public static VkAccelerationStructureTrianglesOpacityMicromapKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureTrianglesOpacityMicromapKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkAccelerationStructureTrianglesOpacityMicromapKHR} instance for the specified memory address. */
    public static VkAccelerationStructureTrianglesOpacityMicromapKHR create(long address) {
        return new VkAccelerationStructureTrianglesOpacityMicromapKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkAccelerationStructureTrianglesOpacityMicromapKHR createSafe(long address) {
        return address == NULL ? null : new VkAccelerationStructureTrianglesOpacityMicromapKHR(address, null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureTrianglesOpacityMicromapKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureTrianglesOpacityMicromapKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureTrianglesOpacityMicromapKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureTrianglesOpacityMicromapKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureTrianglesOpacityMicromapKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureTrianglesOpacityMicromapKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAccelerationStructureTrianglesOpacityMicromapKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureTrianglesOpacityMicromapKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkAccelerationStructureTrianglesOpacityMicromapKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkAccelerationStructureTrianglesOpacityMicromapKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureTrianglesOpacityMicromapKHR malloc(MemoryStack stack) {
        return new VkAccelerationStructureTrianglesOpacityMicromapKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAccelerationStructureTrianglesOpacityMicromapKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureTrianglesOpacityMicromapKHR calloc(MemoryStack stack) {
        return new VkAccelerationStructureTrianglesOpacityMicromapKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureTrianglesOpacityMicromapKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureTrianglesOpacityMicromapKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureTrianglesOpacityMicromapKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureTrianglesOpacityMicromapKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkAccelerationStructureTrianglesOpacityMicromapKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAccelerationStructureTrianglesOpacityMicromapKHR.PNEXT); }
    /** Unsafe version of {@link #indexType}. */
    public static int nindexType(long struct) { return memGetInt(struct + VkAccelerationStructureTrianglesOpacityMicromapKHR.INDEXTYPE); }
    /** Unsafe version of {@link #indexBuffer}. */
    public static long nindexBuffer(long struct) { return memGetLong(struct + VkAccelerationStructureTrianglesOpacityMicromapKHR.INDEXBUFFER); }
    /** Unsafe version of {@link #indexStride}. */
    public static long nindexStride(long struct) { return memGetLong(struct + VkAccelerationStructureTrianglesOpacityMicromapKHR.INDEXSTRIDE); }
    /** Unsafe version of {@link #baseTriangle}. */
    public static int nbaseTriangle(long struct) { return memGetInt(struct + VkAccelerationStructureTrianglesOpacityMicromapKHR.BASETRIANGLE); }
    /** Unsafe version of {@link #micromap}. */
    public static long nmicromap(long struct) { return memGetLong(struct + VkAccelerationStructureTrianglesOpacityMicromapKHR.MICROMAP); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkAccelerationStructureTrianglesOpacityMicromapKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAccelerationStructureTrianglesOpacityMicromapKHR.PNEXT, value); }
    /** Unsafe version of {@link #indexType(int) indexType}. */
    public static void nindexType(long struct, int value) { memPutInt(struct + VkAccelerationStructureTrianglesOpacityMicromapKHR.INDEXTYPE, value); }
    /** Unsafe version of {@link #indexBuffer(long) indexBuffer}. */
    public static void nindexBuffer(long struct, long value) { memPutLong(struct + VkAccelerationStructureTrianglesOpacityMicromapKHR.INDEXBUFFER, value); }
    /** Unsafe version of {@link #indexStride(long) indexStride}. */
    public static void nindexStride(long struct, long value) { memPutLong(struct + VkAccelerationStructureTrianglesOpacityMicromapKHR.INDEXSTRIDE, value); }
    /** Unsafe version of {@link #baseTriangle(int) baseTriangle}. */
    public static void nbaseTriangle(long struct, int value) { memPutInt(struct + VkAccelerationStructureTrianglesOpacityMicromapKHR.BASETRIANGLE, value); }
    /** Unsafe version of {@link #micromap(long) micromap}. */
    public static void nmicromap(long struct, long value) { memPutLong(struct + VkAccelerationStructureTrianglesOpacityMicromapKHR.MICROMAP, value); }

    // -----------------------------------

    /** An array of {@link VkAccelerationStructureTrianglesOpacityMicromapKHR} structs. */
    public static class Buffer extends StructBuffer<VkAccelerationStructureTrianglesOpacityMicromapKHR, Buffer> implements NativeResource {

        private static final VkAccelerationStructureTrianglesOpacityMicromapKHR ELEMENT_FACTORY = VkAccelerationStructureTrianglesOpacityMicromapKHR.create(-1L);

        /**
         * Creates a new {@code VkAccelerationStructureTrianglesOpacityMicromapKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAccelerationStructureTrianglesOpacityMicromapKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkAccelerationStructureTrianglesOpacityMicromapKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAccelerationStructureTrianglesOpacityMicromapKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkAccelerationStructureTrianglesOpacityMicromapKHR.npNext(address()); }
        /** @return the value of the {@code indexType} field. */
        @NativeType("VkIndexType")
        public int indexType() { return VkAccelerationStructureTrianglesOpacityMicromapKHR.nindexType(address()); }
        /** @return the value of the {@code indexBuffer} field. */
        @NativeType("VkDeviceAddress")
        public long indexBuffer() { return VkAccelerationStructureTrianglesOpacityMicromapKHR.nindexBuffer(address()); }
        /** @return the value of the {@code indexStride} field. */
        @NativeType("VkDeviceSize")
        public long indexStride() { return VkAccelerationStructureTrianglesOpacityMicromapKHR.nindexStride(address()); }
        /** @return the value of the {@code baseTriangle} field. */
        @NativeType("uint32_t")
        public int baseTriangle() { return VkAccelerationStructureTrianglesOpacityMicromapKHR.nbaseTriangle(address()); }
        /** @return the value of the {@code micromap} field. */
        @NativeType("VkAccelerationStructureKHR")
        public long micromap() { return VkAccelerationStructureTrianglesOpacityMicromapKHR.nmicromap(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkAccelerationStructureTrianglesOpacityMicromapKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkAccelerationStructureTrianglesOpacityMicromapKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHROpacityMicromap#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_OPACITY_MICROMAP_KHR STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_OPACITY_MICROMAP_KHR} value to the {@code sType} field. */
        public VkAccelerationStructureTrianglesOpacityMicromapKHR.Buffer sType$Default() { return sType(KHROpacityMicromap.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_OPACITY_MICROMAP_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkAccelerationStructureTrianglesOpacityMicromapKHR.Buffer pNext(@NativeType("void *") long value) { VkAccelerationStructureTrianglesOpacityMicromapKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code indexType} field. */
        public VkAccelerationStructureTrianglesOpacityMicromapKHR.Buffer indexType(@NativeType("VkIndexType") int value) { VkAccelerationStructureTrianglesOpacityMicromapKHR.nindexType(address(), value); return this; }
        /** Sets the specified value to the {@code indexBuffer} field. */
        public VkAccelerationStructureTrianglesOpacityMicromapKHR.Buffer indexBuffer(@NativeType("VkDeviceAddress") long value) { VkAccelerationStructureTrianglesOpacityMicromapKHR.nindexBuffer(address(), value); return this; }
        /** Sets the specified value to the {@code indexStride} field. */
        public VkAccelerationStructureTrianglesOpacityMicromapKHR.Buffer indexStride(@NativeType("VkDeviceSize") long value) { VkAccelerationStructureTrianglesOpacityMicromapKHR.nindexStride(address(), value); return this; }
        /** Sets the specified value to the {@code baseTriangle} field. */
        public VkAccelerationStructureTrianglesOpacityMicromapKHR.Buffer baseTriangle(@NativeType("uint32_t") int value) { VkAccelerationStructureTrianglesOpacityMicromapKHR.nbaseTriangle(address(), value); return this; }
        /** Sets the specified value to the {@code micromap} field. */
        public VkAccelerationStructureTrianglesOpacityMicromapKHR.Buffer micromap(@NativeType("VkAccelerationStructureKHR") long value) { VkAccelerationStructureTrianglesOpacityMicromapKHR.nmicromap(address(), value); return this; }

    }

}