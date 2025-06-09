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
 * struct VkTensorCopyARM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t dimensionCount;
 *     uint64_t const * pSrcOffset;
 *     uint64_t const * pDstOffset;
 *     uint64_t const * pExtent;
 * }}</pre>
 */
public class VkTensorCopyARM extends Struct<VkTensorCopyARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DIMENSIONCOUNT,
        PSRCOFFSET,
        PDSTOFFSET,
        PEXTENT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DIMENSIONCOUNT = layout.offsetof(2);
        PSRCOFFSET = layout.offsetof(3);
        PDSTOFFSET = layout.offsetof(4);
        PEXTENT = layout.offsetof(5);
    }

    protected VkTensorCopyARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkTensorCopyARM create(long address, @Nullable ByteBuffer container) {
        return new VkTensorCopyARM(address, container);
    }

    /**
     * Creates a {@code VkTensorCopyARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkTensorCopyARM(ByteBuffer container) {
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
    /** @return the value of the {@code dimensionCount} field. */
    @NativeType("uint32_t")
    public int dimensionCount() { return ndimensionCount(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code pSrcOffset} field. */
    @NativeType("uint64_t const *")
    public @Nullable LongBuffer pSrcOffset() { return npSrcOffset(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code pDstOffset} field. */
    @NativeType("uint64_t const *")
    public @Nullable LongBuffer pDstOffset() { return npDstOffset(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code pExtent} field. */
    @NativeType("uint64_t const *")
    public @Nullable LongBuffer pExtent() { return npExtent(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkTensorCopyARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMTensors#VK_STRUCTURE_TYPE_TENSOR_COPY_ARM STRUCTURE_TYPE_TENSOR_COPY_ARM} value to the {@code sType} field. */
    public VkTensorCopyARM sType$Default() { return sType(ARMTensors.VK_STRUCTURE_TYPE_TENSOR_COPY_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkTensorCopyARM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code dimensionCount} field. */
    public VkTensorCopyARM dimensionCount(@NativeType("uint32_t") int value) { ndimensionCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pSrcOffset} field. */
    public VkTensorCopyARM pSrcOffset(@Nullable @NativeType("uint64_t const *") LongBuffer value) { npSrcOffset(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pDstOffset} field. */
    public VkTensorCopyARM pDstOffset(@Nullable @NativeType("uint64_t const *") LongBuffer value) { npDstOffset(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pExtent} field. */
    public VkTensorCopyARM pExtent(@Nullable @NativeType("uint64_t const *") LongBuffer value) { npExtent(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkTensorCopyARM set(
        int sType,
        long pNext,
        int dimensionCount,
        @Nullable LongBuffer pSrcOffset,
        @Nullable LongBuffer pDstOffset,
        @Nullable LongBuffer pExtent
    ) {
        sType(sType);
        pNext(pNext);
        dimensionCount(dimensionCount);
        pSrcOffset(pSrcOffset);
        pDstOffset(pDstOffset);
        pExtent(pExtent);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkTensorCopyARM set(VkTensorCopyARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkTensorCopyARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkTensorCopyARM malloc() {
        return new VkTensorCopyARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkTensorCopyARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkTensorCopyARM calloc() {
        return new VkTensorCopyARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkTensorCopyARM} instance allocated with {@link BufferUtils}. */
    public static VkTensorCopyARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkTensorCopyARM(memAddress(container), container);
    }

    /** Returns a new {@code VkTensorCopyARM} instance for the specified memory address. */
    public static VkTensorCopyARM create(long address) {
        return new VkTensorCopyARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkTensorCopyARM createSafe(long address) {
        return address == NULL ? null : new VkTensorCopyARM(address, null);
    }

    /**
     * Returns a new {@link VkTensorCopyARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTensorCopyARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkTensorCopyARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTensorCopyARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTensorCopyARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkTensorCopyARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkTensorCopyARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkTensorCopyARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkTensorCopyARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkTensorCopyARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTensorCopyARM malloc(MemoryStack stack) {
        return new VkTensorCopyARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkTensorCopyARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTensorCopyARM calloc(MemoryStack stack) {
        return new VkTensorCopyARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkTensorCopyARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTensorCopyARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTensorCopyARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTensorCopyARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkTensorCopyARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkTensorCopyARM.PNEXT); }
    /** Unsafe version of {@link #dimensionCount}. */
    public static int ndimensionCount(long struct) { return memGetInt(struct + VkTensorCopyARM.DIMENSIONCOUNT); }
    /** Unsafe version of {@link #pSrcOffset() pSrcOffset}. */
    public static @Nullable LongBuffer npSrcOffset(long struct) { return memLongBufferSafe(memGetAddress(struct + VkTensorCopyARM.PSRCOFFSET), ndimensionCount(struct)); }
    /** Unsafe version of {@link #pDstOffset() pDstOffset}. */
    public static @Nullable LongBuffer npDstOffset(long struct) { return memLongBufferSafe(memGetAddress(struct + VkTensorCopyARM.PDSTOFFSET), ndimensionCount(struct)); }
    /** Unsafe version of {@link #pExtent() pExtent}. */
    public static @Nullable LongBuffer npExtent(long struct) { return memLongBufferSafe(memGetAddress(struct + VkTensorCopyARM.PEXTENT), ndimensionCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkTensorCopyARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkTensorCopyARM.PNEXT, value); }
    /** Sets the specified value to the {@code dimensionCount} field of the specified {@code struct}. */
    public static void ndimensionCount(long struct, int value) { memPutInt(struct + VkTensorCopyARM.DIMENSIONCOUNT, value); }
    /** Unsafe version of {@link #pSrcOffset(LongBuffer) pSrcOffset}. */
    public static void npSrcOffset(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkTensorCopyARM.PSRCOFFSET, memAddressSafe(value)); }
    /** Unsafe version of {@link #pDstOffset(LongBuffer) pDstOffset}. */
    public static void npDstOffset(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkTensorCopyARM.PDSTOFFSET, memAddressSafe(value)); }
    /** Unsafe version of {@link #pExtent(LongBuffer) pExtent}. */
    public static void npExtent(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkTensorCopyARM.PEXTENT, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link VkTensorCopyARM} structs. */
    public static class Buffer extends StructBuffer<VkTensorCopyARM, Buffer> implements NativeResource {

        private static final VkTensorCopyARM ELEMENT_FACTORY = VkTensorCopyARM.create(-1L);

        /**
         * Creates a new {@code VkTensorCopyARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkTensorCopyARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkTensorCopyARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkTensorCopyARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkTensorCopyARM.npNext(address()); }
        /** @return the value of the {@code dimensionCount} field. */
        @NativeType("uint32_t")
        public int dimensionCount() { return VkTensorCopyARM.ndimensionCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pSrcOffset} field. */
        @NativeType("uint64_t const *")
        public @Nullable LongBuffer pSrcOffset() { return VkTensorCopyARM.npSrcOffset(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pDstOffset} field. */
        @NativeType("uint64_t const *")
        public @Nullable LongBuffer pDstOffset() { return VkTensorCopyARM.npDstOffset(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pExtent} field. */
        @NativeType("uint64_t const *")
        public @Nullable LongBuffer pExtent() { return VkTensorCopyARM.npExtent(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkTensorCopyARM.Buffer sType(@NativeType("VkStructureType") int value) { VkTensorCopyARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMTensors#VK_STRUCTURE_TYPE_TENSOR_COPY_ARM STRUCTURE_TYPE_TENSOR_COPY_ARM} value to the {@code sType} field. */
        public VkTensorCopyARM.Buffer sType$Default() { return sType(ARMTensors.VK_STRUCTURE_TYPE_TENSOR_COPY_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkTensorCopyARM.Buffer pNext(@NativeType("void const *") long value) { VkTensorCopyARM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code dimensionCount} field. */
        public VkTensorCopyARM.Buffer dimensionCount(@NativeType("uint32_t") int value) { VkTensorCopyARM.ndimensionCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pSrcOffset} field. */
        public VkTensorCopyARM.Buffer pSrcOffset(@Nullable @NativeType("uint64_t const *") LongBuffer value) { VkTensorCopyARM.npSrcOffset(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pDstOffset} field. */
        public VkTensorCopyARM.Buffer pDstOffset(@Nullable @NativeType("uint64_t const *") LongBuffer value) { VkTensorCopyARM.npDstOffset(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pExtent} field. */
        public VkTensorCopyARM.Buffer pExtent(@Nullable @NativeType("uint64_t const *") LongBuffer value) { VkTensorCopyARM.npExtent(address(), value); return this; }

    }

}