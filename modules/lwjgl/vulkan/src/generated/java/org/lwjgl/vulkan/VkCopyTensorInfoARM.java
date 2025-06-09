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
 * struct VkCopyTensorInfoARM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkTensorARM srcTensor;
 *     VkTensorARM dstTensor;
 *     uint32_t regionCount;
 *     {@link VkTensorCopyARM VkTensorCopyARM} const * pRegions;
 * }}</pre>
 */
public class VkCopyTensorInfoARM extends Struct<VkCopyTensorInfoARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SRCTENSOR,
        DSTTENSOR,
        REGIONCOUNT,
        PREGIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCTENSOR = layout.offsetof(2);
        DSTTENSOR = layout.offsetof(3);
        REGIONCOUNT = layout.offsetof(4);
        PREGIONS = layout.offsetof(5);
    }

    protected VkCopyTensorInfoARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCopyTensorInfoARM create(long address, @Nullable ByteBuffer container) {
        return new VkCopyTensorInfoARM(address, container);
    }

    /**
     * Creates a {@code VkCopyTensorInfoARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCopyTensorInfoARM(ByteBuffer container) {
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
    /** @return the value of the {@code srcTensor} field. */
    @NativeType("VkTensorARM")
    public long srcTensor() { return nsrcTensor(address()); }
    /** @return the value of the {@code dstTensor} field. */
    @NativeType("VkTensorARM")
    public long dstTensor() { return ndstTensor(address()); }
    /** @return the value of the {@code regionCount} field. */
    @NativeType("uint32_t")
    public int regionCount() { return nregionCount(address()); }
    /** @return a {@link VkTensorCopyARM.Buffer} view of the struct array pointed to by the {@code pRegions} field. */
    @NativeType("VkTensorCopyARM const *")
    public VkTensorCopyARM.Buffer pRegions() { return npRegions(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkCopyTensorInfoARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMTensors#VK_STRUCTURE_TYPE_COPY_TENSOR_INFO_ARM STRUCTURE_TYPE_COPY_TENSOR_INFO_ARM} value to the {@code sType} field. */
    public VkCopyTensorInfoARM sType$Default() { return sType(ARMTensors.VK_STRUCTURE_TYPE_COPY_TENSOR_INFO_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkCopyTensorInfoARM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code srcTensor} field. */
    public VkCopyTensorInfoARM srcTensor(@NativeType("VkTensorARM") long value) { nsrcTensor(address(), value); return this; }
    /** Sets the specified value to the {@code dstTensor} field. */
    public VkCopyTensorInfoARM dstTensor(@NativeType("VkTensorARM") long value) { ndstTensor(address(), value); return this; }
    /** Sets the address of the specified {@link VkTensorCopyARM.Buffer} to the {@code pRegions} field. */
    public VkCopyTensorInfoARM pRegions(@NativeType("VkTensorCopyARM const *") VkTensorCopyARM.Buffer value) { npRegions(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCopyTensorInfoARM set(
        int sType,
        long pNext,
        long srcTensor,
        long dstTensor,
        VkTensorCopyARM.Buffer pRegions
    ) {
        sType(sType);
        pNext(pNext);
        srcTensor(srcTensor);
        dstTensor(dstTensor);
        pRegions(pRegions);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCopyTensorInfoARM set(VkCopyTensorInfoARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCopyTensorInfoARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCopyTensorInfoARM malloc() {
        return new VkCopyTensorInfoARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCopyTensorInfoARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCopyTensorInfoARM calloc() {
        return new VkCopyTensorInfoARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCopyTensorInfoARM} instance allocated with {@link BufferUtils}. */
    public static VkCopyTensorInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyTensorInfoARM(memAddress(container), container);
    }

    /** Returns a new {@code VkCopyTensorInfoARM} instance for the specified memory address. */
    public static VkCopyTensorInfoARM create(long address) {
        return new VkCopyTensorInfoARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkCopyTensorInfoARM createSafe(long address) {
        return address == NULL ? null : new VkCopyTensorInfoARM(address, null);
    }

    /**
     * Returns a new {@link VkCopyTensorInfoARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyTensorInfoARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCopyTensorInfoARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyTensorInfoARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyTensorInfoARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyTensorInfoARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCopyTensorInfoARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCopyTensorInfoARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkCopyTensorInfoARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCopyTensorInfoARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyTensorInfoARM malloc(MemoryStack stack) {
        return new VkCopyTensorInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCopyTensorInfoARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyTensorInfoARM calloc(MemoryStack stack) {
        return new VkCopyTensorInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCopyTensorInfoARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyTensorInfoARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyTensorInfoARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyTensorInfoARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkCopyTensorInfoARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCopyTensorInfoARM.PNEXT); }
    /** Unsafe version of {@link #srcTensor}. */
    public static long nsrcTensor(long struct) { return memGetLong(struct + VkCopyTensorInfoARM.SRCTENSOR); }
    /** Unsafe version of {@link #dstTensor}. */
    public static long ndstTensor(long struct) { return memGetLong(struct + VkCopyTensorInfoARM.DSTTENSOR); }
    /** Unsafe version of {@link #regionCount}. */
    public static int nregionCount(long struct) { return memGetInt(struct + VkCopyTensorInfoARM.REGIONCOUNT); }
    /** Unsafe version of {@link #pRegions}. */
    public static VkTensorCopyARM.Buffer npRegions(long struct) { return VkTensorCopyARM.create(memGetAddress(struct + VkCopyTensorInfoARM.PREGIONS), nregionCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkCopyTensorInfoARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCopyTensorInfoARM.PNEXT, value); }
    /** Unsafe version of {@link #srcTensor(long) srcTensor}. */
    public static void nsrcTensor(long struct, long value) { memPutLong(struct + VkCopyTensorInfoARM.SRCTENSOR, value); }
    /** Unsafe version of {@link #dstTensor(long) dstTensor}. */
    public static void ndstTensor(long struct, long value) { memPutLong(struct + VkCopyTensorInfoARM.DSTTENSOR, value); }
    /** Sets the specified value to the {@code regionCount} field of the specified {@code struct}. */
    public static void nregionCount(long struct, int value) { memPutInt(struct + VkCopyTensorInfoARM.REGIONCOUNT, value); }
    /** Unsafe version of {@link #pRegions(VkTensorCopyARM.Buffer) pRegions}. */
    public static void npRegions(long struct, VkTensorCopyARM.Buffer value) { memPutAddress(struct + VkCopyTensorInfoARM.PREGIONS, value.address()); nregionCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkCopyTensorInfoARM.PREGIONS));
    }

    // -----------------------------------

    /** An array of {@link VkCopyTensorInfoARM} structs. */
    public static class Buffer extends StructBuffer<VkCopyTensorInfoARM, Buffer> implements NativeResource {

        private static final VkCopyTensorInfoARM ELEMENT_FACTORY = VkCopyTensorInfoARM.create(-1L);

        /**
         * Creates a new {@code VkCopyTensorInfoARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCopyTensorInfoARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCopyTensorInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCopyTensorInfoARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCopyTensorInfoARM.npNext(address()); }
        /** @return the value of the {@code srcTensor} field. */
        @NativeType("VkTensorARM")
        public long srcTensor() { return VkCopyTensorInfoARM.nsrcTensor(address()); }
        /** @return the value of the {@code dstTensor} field. */
        @NativeType("VkTensorARM")
        public long dstTensor() { return VkCopyTensorInfoARM.ndstTensor(address()); }
        /** @return the value of the {@code regionCount} field. */
        @NativeType("uint32_t")
        public int regionCount() { return VkCopyTensorInfoARM.nregionCount(address()); }
        /** @return a {@link VkTensorCopyARM.Buffer} view of the struct array pointed to by the {@code pRegions} field. */
        @NativeType("VkTensorCopyARM const *")
        public VkTensorCopyARM.Buffer pRegions() { return VkCopyTensorInfoARM.npRegions(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkCopyTensorInfoARM.Buffer sType(@NativeType("VkStructureType") int value) { VkCopyTensorInfoARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMTensors#VK_STRUCTURE_TYPE_COPY_TENSOR_INFO_ARM STRUCTURE_TYPE_COPY_TENSOR_INFO_ARM} value to the {@code sType} field. */
        public VkCopyTensorInfoARM.Buffer sType$Default() { return sType(ARMTensors.VK_STRUCTURE_TYPE_COPY_TENSOR_INFO_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkCopyTensorInfoARM.Buffer pNext(@NativeType("void const *") long value) { VkCopyTensorInfoARM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code srcTensor} field. */
        public VkCopyTensorInfoARM.Buffer srcTensor(@NativeType("VkTensorARM") long value) { VkCopyTensorInfoARM.nsrcTensor(address(), value); return this; }
        /** Sets the specified value to the {@code dstTensor} field. */
        public VkCopyTensorInfoARM.Buffer dstTensor(@NativeType("VkTensorARM") long value) { VkCopyTensorInfoARM.ndstTensor(address(), value); return this; }
        /** Sets the address of the specified {@link VkTensorCopyARM.Buffer} to the {@code pRegions} field. */
        public VkCopyTensorInfoARM.Buffer pRegions(@NativeType("VkTensorCopyARM const *") VkTensorCopyARM.Buffer value) { VkCopyTensorInfoARM.npRegions(address(), value); return this; }

    }

}