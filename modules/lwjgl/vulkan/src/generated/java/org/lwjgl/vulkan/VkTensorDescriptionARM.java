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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkTensorDescriptionARM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkTensorTilingARM tiling;
 *     VkFormat format;
 *     uint32_t dimensionCount;
 *     int64_t const * pDimensions;
 *     int64_t const * pStrides;
 *     VkTensorUsageFlagsARM usage;
 * }}</pre>
 */
public class VkTensorDescriptionARM extends Struct<VkTensorDescriptionARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TILING,
        FORMAT,
        DIMENSIONCOUNT,
        PDIMENSIONS,
        PSTRIDES,
        USAGE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TILING = layout.offsetof(2);
        FORMAT = layout.offsetof(3);
        DIMENSIONCOUNT = layout.offsetof(4);
        PDIMENSIONS = layout.offsetof(5);
        PSTRIDES = layout.offsetof(6);
        USAGE = layout.offsetof(7);
    }

    protected VkTensorDescriptionARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkTensorDescriptionARM create(long address, @Nullable ByteBuffer container) {
        return new VkTensorDescriptionARM(address, container);
    }

    /**
     * Creates a {@code VkTensorDescriptionARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkTensorDescriptionARM(ByteBuffer container) {
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
    /** @return the value of the {@code tiling} field. */
    @NativeType("VkTensorTilingARM")
    public int tiling() { return ntiling(address()); }
    /** @return the value of the {@code format} field. */
    @NativeType("VkFormat")
    public int format() { return nformat(address()); }
    /** @return the value of the {@code dimensionCount} field. */
    @NativeType("uint32_t")
    public int dimensionCount() { return ndimensionCount(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code pDimensions} field. */
    @NativeType("int64_t const *")
    public LongBuffer pDimensions() { return npDimensions(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code pStrides} field. */
    @NativeType("int64_t const *")
    public @Nullable LongBuffer pStrides() { return npStrides(address()); }
    /** @return the value of the {@code usage} field. */
    @NativeType("VkTensorUsageFlagsARM")
    public long usage() { return nusage(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkTensorDescriptionARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMTensors#VK_STRUCTURE_TYPE_TENSOR_DESCRIPTION_ARM STRUCTURE_TYPE_TENSOR_DESCRIPTION_ARM} value to the {@code sType} field. */
    public VkTensorDescriptionARM sType$Default() { return sType(ARMTensors.VK_STRUCTURE_TYPE_TENSOR_DESCRIPTION_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkTensorDescriptionARM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code tiling} field. */
    public VkTensorDescriptionARM tiling(@NativeType("VkTensorTilingARM") int value) { ntiling(address(), value); return this; }
    /** Sets the specified value to the {@code format} field. */
    public VkTensorDescriptionARM format(@NativeType("VkFormat") int value) { nformat(address(), value); return this; }
    /** Sets the specified value to the {@code dimensionCount} field. */
    public VkTensorDescriptionARM dimensionCount(@NativeType("uint32_t") int value) { ndimensionCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pDimensions} field. */
    public VkTensorDescriptionARM pDimensions(@NativeType("int64_t const *") LongBuffer value) { npDimensions(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pStrides} field. */
    public VkTensorDescriptionARM pStrides(@Nullable @NativeType("int64_t const *") LongBuffer value) { npStrides(address(), value); return this; }
    /** Sets the specified value to the {@code usage} field. */
    public VkTensorDescriptionARM usage(@NativeType("VkTensorUsageFlagsARM") long value) { nusage(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkTensorDescriptionARM set(
        int sType,
        long pNext,
        int tiling,
        int format,
        int dimensionCount,
        LongBuffer pDimensions,
        @Nullable LongBuffer pStrides,
        long usage
    ) {
        sType(sType);
        pNext(pNext);
        tiling(tiling);
        format(format);
        dimensionCount(dimensionCount);
        pDimensions(pDimensions);
        pStrides(pStrides);
        usage(usage);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkTensorDescriptionARM set(VkTensorDescriptionARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkTensorDescriptionARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkTensorDescriptionARM malloc() {
        return new VkTensorDescriptionARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkTensorDescriptionARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkTensorDescriptionARM calloc() {
        return new VkTensorDescriptionARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkTensorDescriptionARM} instance allocated with {@link BufferUtils}. */
    public static VkTensorDescriptionARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkTensorDescriptionARM(memAddress(container), container);
    }

    /** Returns a new {@code VkTensorDescriptionARM} instance for the specified memory address. */
    public static VkTensorDescriptionARM create(long address) {
        return new VkTensorDescriptionARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkTensorDescriptionARM createSafe(long address) {
        return address == NULL ? null : new VkTensorDescriptionARM(address, null);
    }

    /**
     * Returns a new {@link VkTensorDescriptionARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTensorDescriptionARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkTensorDescriptionARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTensorDescriptionARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTensorDescriptionARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkTensorDescriptionARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkTensorDescriptionARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkTensorDescriptionARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkTensorDescriptionARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkTensorDescriptionARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTensorDescriptionARM malloc(MemoryStack stack) {
        return new VkTensorDescriptionARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkTensorDescriptionARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTensorDescriptionARM calloc(MemoryStack stack) {
        return new VkTensorDescriptionARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkTensorDescriptionARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTensorDescriptionARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTensorDescriptionARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTensorDescriptionARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkTensorDescriptionARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkTensorDescriptionARM.PNEXT); }
    /** Unsafe version of {@link #tiling}. */
    public static int ntiling(long struct) { return memGetInt(struct + VkTensorDescriptionARM.TILING); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return memGetInt(struct + VkTensorDescriptionARM.FORMAT); }
    /** Unsafe version of {@link #dimensionCount}. */
    public static int ndimensionCount(long struct) { return memGetInt(struct + VkTensorDescriptionARM.DIMENSIONCOUNT); }
    /** Unsafe version of {@link #pDimensions() pDimensions}. */
    public static LongBuffer npDimensions(long struct) { return memLongBuffer(memGetAddress(struct + VkTensorDescriptionARM.PDIMENSIONS), ndimensionCount(struct)); }
    /** Unsafe version of {@link #pStrides() pStrides}. */
    public static @Nullable LongBuffer npStrides(long struct) { return memLongBufferSafe(memGetAddress(struct + VkTensorDescriptionARM.PSTRIDES), ndimensionCount(struct)); }
    /** Unsafe version of {@link #usage}. */
    public static long nusage(long struct) { return memGetLong(struct + VkTensorDescriptionARM.USAGE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkTensorDescriptionARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkTensorDescriptionARM.PNEXT, value); }
    /** Unsafe version of {@link #tiling(int) tiling}. */
    public static void ntiling(long struct, int value) { memPutInt(struct + VkTensorDescriptionARM.TILING, value); }
    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { memPutInt(struct + VkTensorDescriptionARM.FORMAT, value); }
    /** Sets the specified value to the {@code dimensionCount} field of the specified {@code struct}. */
    public static void ndimensionCount(long struct, int value) { memPutInt(struct + VkTensorDescriptionARM.DIMENSIONCOUNT, value); }
    /** Unsafe version of {@link #pDimensions(LongBuffer) pDimensions}. */
    public static void npDimensions(long struct, LongBuffer value) { memPutAddress(struct + VkTensorDescriptionARM.PDIMENSIONS, memAddress(value)); }
    /** Unsafe version of {@link #pStrides(LongBuffer) pStrides}. */
    public static void npStrides(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkTensorDescriptionARM.PSTRIDES, memAddressSafe(value)); }
    /** Unsafe version of {@link #usage(long) usage}. */
    public static void nusage(long struct, long value) { memPutLong(struct + VkTensorDescriptionARM.USAGE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkTensorDescriptionARM.PDIMENSIONS));
    }

    // -----------------------------------

    /** An array of {@link VkTensorDescriptionARM} structs. */
    public static class Buffer extends StructBuffer<VkTensorDescriptionARM, Buffer> implements NativeResource {

        private static final VkTensorDescriptionARM ELEMENT_FACTORY = VkTensorDescriptionARM.create(-1L);

        /**
         * Creates a new {@code VkTensorDescriptionARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkTensorDescriptionARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkTensorDescriptionARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkTensorDescriptionARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkTensorDescriptionARM.npNext(address()); }
        /** @return the value of the {@code tiling} field. */
        @NativeType("VkTensorTilingARM")
        public int tiling() { return VkTensorDescriptionARM.ntiling(address()); }
        /** @return the value of the {@code format} field. */
        @NativeType("VkFormat")
        public int format() { return VkTensorDescriptionARM.nformat(address()); }
        /** @return the value of the {@code dimensionCount} field. */
        @NativeType("uint32_t")
        public int dimensionCount() { return VkTensorDescriptionARM.ndimensionCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pDimensions} field. */
        @NativeType("int64_t const *")
        public LongBuffer pDimensions() { return VkTensorDescriptionARM.npDimensions(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pStrides} field. */
        @NativeType("int64_t const *")
        public @Nullable LongBuffer pStrides() { return VkTensorDescriptionARM.npStrides(address()); }
        /** @return the value of the {@code usage} field. */
        @NativeType("VkTensorUsageFlagsARM")
        public long usage() { return VkTensorDescriptionARM.nusage(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkTensorDescriptionARM.Buffer sType(@NativeType("VkStructureType") int value) { VkTensorDescriptionARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMTensors#VK_STRUCTURE_TYPE_TENSOR_DESCRIPTION_ARM STRUCTURE_TYPE_TENSOR_DESCRIPTION_ARM} value to the {@code sType} field. */
        public VkTensorDescriptionARM.Buffer sType$Default() { return sType(ARMTensors.VK_STRUCTURE_TYPE_TENSOR_DESCRIPTION_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkTensorDescriptionARM.Buffer pNext(@NativeType("void const *") long value) { VkTensorDescriptionARM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code tiling} field. */
        public VkTensorDescriptionARM.Buffer tiling(@NativeType("VkTensorTilingARM") int value) { VkTensorDescriptionARM.ntiling(address(), value); return this; }
        /** Sets the specified value to the {@code format} field. */
        public VkTensorDescriptionARM.Buffer format(@NativeType("VkFormat") int value) { VkTensorDescriptionARM.nformat(address(), value); return this; }
        /** Sets the specified value to the {@code dimensionCount} field. */
        public VkTensorDescriptionARM.Buffer dimensionCount(@NativeType("uint32_t") int value) { VkTensorDescriptionARM.ndimensionCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pDimensions} field. */
        public VkTensorDescriptionARM.Buffer pDimensions(@NativeType("int64_t const *") LongBuffer value) { VkTensorDescriptionARM.npDimensions(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pStrides} field. */
        public VkTensorDescriptionARM.Buffer pStrides(@Nullable @NativeType("int64_t const *") LongBuffer value) { VkTensorDescriptionARM.npStrides(address(), value); return this; }
        /** Sets the specified value to the {@code usage} field. */
        public VkTensorDescriptionARM.Buffer usage(@NativeType("VkTensorUsageFlagsARM") long value) { VkTensorDescriptionARM.nusage(address(), value); return this; }

    }

}