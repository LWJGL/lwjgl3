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
 * struct VkFrameBoundaryTensorsARM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t tensorCount;
 *     VkTensorARM const * pTensors;
 * }}</pre>
 */
public class VkFrameBoundaryTensorsARM extends Struct<VkFrameBoundaryTensorsARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TENSORCOUNT,
        PTENSORS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TENSORCOUNT = layout.offsetof(2);
        PTENSORS = layout.offsetof(3);
    }

    protected VkFrameBoundaryTensorsARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkFrameBoundaryTensorsARM create(long address, @Nullable ByteBuffer container) {
        return new VkFrameBoundaryTensorsARM(address, container);
    }

    /**
     * Creates a {@code VkFrameBoundaryTensorsARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkFrameBoundaryTensorsARM(ByteBuffer container) {
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
    /** @return the value of the {@code tensorCount} field. */
    @NativeType("uint32_t")
    public int tensorCount() { return ntensorCount(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code pTensors} field. */
    @NativeType("VkTensorARM const *")
    public LongBuffer pTensors() { return npTensors(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkFrameBoundaryTensorsARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMTensors#VK_STRUCTURE_TYPE_FRAME_BOUNDARY_TENSORS_ARM STRUCTURE_TYPE_FRAME_BOUNDARY_TENSORS_ARM} value to the {@code sType} field. */
    public VkFrameBoundaryTensorsARM sType$Default() { return sType(ARMTensors.VK_STRUCTURE_TYPE_FRAME_BOUNDARY_TENSORS_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkFrameBoundaryTensorsARM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pTensors} field. */
    public VkFrameBoundaryTensorsARM pTensors(@NativeType("VkTensorARM const *") LongBuffer value) { npTensors(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkFrameBoundaryTensorsARM set(
        int sType,
        long pNext,
        LongBuffer pTensors
    ) {
        sType(sType);
        pNext(pNext);
        pTensors(pTensors);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkFrameBoundaryTensorsARM set(VkFrameBoundaryTensorsARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkFrameBoundaryTensorsARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkFrameBoundaryTensorsARM malloc() {
        return new VkFrameBoundaryTensorsARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkFrameBoundaryTensorsARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkFrameBoundaryTensorsARM calloc() {
        return new VkFrameBoundaryTensorsARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkFrameBoundaryTensorsARM} instance allocated with {@link BufferUtils}. */
    public static VkFrameBoundaryTensorsARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkFrameBoundaryTensorsARM(memAddress(container), container);
    }

    /** Returns a new {@code VkFrameBoundaryTensorsARM} instance for the specified memory address. */
    public static VkFrameBoundaryTensorsARM create(long address) {
        return new VkFrameBoundaryTensorsARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkFrameBoundaryTensorsARM createSafe(long address) {
        return address == NULL ? null : new VkFrameBoundaryTensorsARM(address, null);
    }

    /**
     * Returns a new {@link VkFrameBoundaryTensorsARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFrameBoundaryTensorsARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkFrameBoundaryTensorsARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFrameBoundaryTensorsARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFrameBoundaryTensorsARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkFrameBoundaryTensorsARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkFrameBoundaryTensorsARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkFrameBoundaryTensorsARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkFrameBoundaryTensorsARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkFrameBoundaryTensorsARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFrameBoundaryTensorsARM malloc(MemoryStack stack) {
        return new VkFrameBoundaryTensorsARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkFrameBoundaryTensorsARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFrameBoundaryTensorsARM calloc(MemoryStack stack) {
        return new VkFrameBoundaryTensorsARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkFrameBoundaryTensorsARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFrameBoundaryTensorsARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFrameBoundaryTensorsARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFrameBoundaryTensorsARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkFrameBoundaryTensorsARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkFrameBoundaryTensorsARM.PNEXT); }
    /** Unsafe version of {@link #tensorCount}. */
    public static int ntensorCount(long struct) { return memGetInt(struct + VkFrameBoundaryTensorsARM.TENSORCOUNT); }
    /** Unsafe version of {@link #pTensors() pTensors}. */
    public static LongBuffer npTensors(long struct) { return memLongBuffer(memGetAddress(struct + VkFrameBoundaryTensorsARM.PTENSORS), ntensorCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkFrameBoundaryTensorsARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkFrameBoundaryTensorsARM.PNEXT, value); }
    /** Sets the specified value to the {@code tensorCount} field of the specified {@code struct}. */
    public static void ntensorCount(long struct, int value) { memPutInt(struct + VkFrameBoundaryTensorsARM.TENSORCOUNT, value); }
    /** Unsafe version of {@link #pTensors(LongBuffer) pTensors}. */
    public static void npTensors(long struct, LongBuffer value) { memPutAddress(struct + VkFrameBoundaryTensorsARM.PTENSORS, memAddress(value)); ntensorCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkFrameBoundaryTensorsARM.PTENSORS));
    }

    // -----------------------------------

    /** An array of {@link VkFrameBoundaryTensorsARM} structs. */
    public static class Buffer extends StructBuffer<VkFrameBoundaryTensorsARM, Buffer> implements NativeResource {

        private static final VkFrameBoundaryTensorsARM ELEMENT_FACTORY = VkFrameBoundaryTensorsARM.create(-1L);

        /**
         * Creates a new {@code VkFrameBoundaryTensorsARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkFrameBoundaryTensorsARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkFrameBoundaryTensorsARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkFrameBoundaryTensorsARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkFrameBoundaryTensorsARM.npNext(address()); }
        /** @return the value of the {@code tensorCount} field. */
        @NativeType("uint32_t")
        public int tensorCount() { return VkFrameBoundaryTensorsARM.ntensorCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pTensors} field. */
        @NativeType("VkTensorARM const *")
        public LongBuffer pTensors() { return VkFrameBoundaryTensorsARM.npTensors(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkFrameBoundaryTensorsARM.Buffer sType(@NativeType("VkStructureType") int value) { VkFrameBoundaryTensorsARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMTensors#VK_STRUCTURE_TYPE_FRAME_BOUNDARY_TENSORS_ARM STRUCTURE_TYPE_FRAME_BOUNDARY_TENSORS_ARM} value to the {@code sType} field. */
        public VkFrameBoundaryTensorsARM.Buffer sType$Default() { return sType(ARMTensors.VK_STRUCTURE_TYPE_FRAME_BOUNDARY_TENSORS_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkFrameBoundaryTensorsARM.Buffer pNext(@NativeType("void const *") long value) { VkFrameBoundaryTensorsARM.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pTensors} field. */
        public VkFrameBoundaryTensorsARM.Buffer pTensors(@NativeType("VkTensorARM const *") LongBuffer value) { VkFrameBoundaryTensorsARM.npTensors(address(), value); return this; }

    }

}