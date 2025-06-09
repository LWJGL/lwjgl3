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
 * struct VkTensorViewCreateInfoARM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkTensorViewCreateFlagsARM flags;
 *     VkTensorARM tensor;
 *     VkFormat format;
 * }}</pre>
 */
public class VkTensorViewCreateInfoARM extends Struct<VkTensorViewCreateInfoARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        TENSOR,
        FORMAT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        TENSOR = layout.offsetof(3);
        FORMAT = layout.offsetof(4);
    }

    protected VkTensorViewCreateInfoARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkTensorViewCreateInfoARM create(long address, @Nullable ByteBuffer container) {
        return new VkTensorViewCreateInfoARM(address, container);
    }

    /**
     * Creates a {@code VkTensorViewCreateInfoARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkTensorViewCreateInfoARM(ByteBuffer container) {
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
    /** @return the value of the {@code flags} field. */
    @NativeType("VkTensorViewCreateFlagsARM")
    public long flags() { return nflags(address()); }
    /** @return the value of the {@code tensor} field. */
    @NativeType("VkTensorARM")
    public long tensor() { return ntensor(address()); }
    /** @return the value of the {@code format} field. */
    @NativeType("VkFormat")
    public int format() { return nformat(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkTensorViewCreateInfoARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMTensors#VK_STRUCTURE_TYPE_TENSOR_VIEW_CREATE_INFO_ARM STRUCTURE_TYPE_TENSOR_VIEW_CREATE_INFO_ARM} value to the {@code sType} field. */
    public VkTensorViewCreateInfoARM sType$Default() { return sType(ARMTensors.VK_STRUCTURE_TYPE_TENSOR_VIEW_CREATE_INFO_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkTensorViewCreateInfoARM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkOpaqueCaptureDescriptorDataCreateInfoEXT} value to the {@code pNext} chain. */
    public VkTensorViewCreateInfoARM pNext(VkOpaqueCaptureDescriptorDataCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code flags} field. */
    public VkTensorViewCreateInfoARM flags(@NativeType("VkTensorViewCreateFlagsARM") long value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code tensor} field. */
    public VkTensorViewCreateInfoARM tensor(@NativeType("VkTensorARM") long value) { ntensor(address(), value); return this; }
    /** Sets the specified value to the {@code format} field. */
    public VkTensorViewCreateInfoARM format(@NativeType("VkFormat") int value) { nformat(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkTensorViewCreateInfoARM set(
        int sType,
        long pNext,
        long flags,
        long tensor,
        int format
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        tensor(tensor);
        format(format);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkTensorViewCreateInfoARM set(VkTensorViewCreateInfoARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkTensorViewCreateInfoARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkTensorViewCreateInfoARM malloc() {
        return new VkTensorViewCreateInfoARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkTensorViewCreateInfoARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkTensorViewCreateInfoARM calloc() {
        return new VkTensorViewCreateInfoARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkTensorViewCreateInfoARM} instance allocated with {@link BufferUtils}. */
    public static VkTensorViewCreateInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkTensorViewCreateInfoARM(memAddress(container), container);
    }

    /** Returns a new {@code VkTensorViewCreateInfoARM} instance for the specified memory address. */
    public static VkTensorViewCreateInfoARM create(long address) {
        return new VkTensorViewCreateInfoARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkTensorViewCreateInfoARM createSafe(long address) {
        return address == NULL ? null : new VkTensorViewCreateInfoARM(address, null);
    }

    /**
     * Returns a new {@link VkTensorViewCreateInfoARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTensorViewCreateInfoARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkTensorViewCreateInfoARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTensorViewCreateInfoARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTensorViewCreateInfoARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkTensorViewCreateInfoARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkTensorViewCreateInfoARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkTensorViewCreateInfoARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkTensorViewCreateInfoARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkTensorViewCreateInfoARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTensorViewCreateInfoARM malloc(MemoryStack stack) {
        return new VkTensorViewCreateInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkTensorViewCreateInfoARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTensorViewCreateInfoARM calloc(MemoryStack stack) {
        return new VkTensorViewCreateInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkTensorViewCreateInfoARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTensorViewCreateInfoARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTensorViewCreateInfoARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTensorViewCreateInfoARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkTensorViewCreateInfoARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkTensorViewCreateInfoARM.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static long nflags(long struct) { return memGetLong(struct + VkTensorViewCreateInfoARM.FLAGS); }
    /** Unsafe version of {@link #tensor}. */
    public static long ntensor(long struct) { return memGetLong(struct + VkTensorViewCreateInfoARM.TENSOR); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return memGetInt(struct + VkTensorViewCreateInfoARM.FORMAT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkTensorViewCreateInfoARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkTensorViewCreateInfoARM.PNEXT, value); }
    /** Unsafe version of {@link #flags(long) flags}. */
    public static void nflags(long struct, long value) { memPutLong(struct + VkTensorViewCreateInfoARM.FLAGS, value); }
    /** Unsafe version of {@link #tensor(long) tensor}. */
    public static void ntensor(long struct, long value) { memPutLong(struct + VkTensorViewCreateInfoARM.TENSOR, value); }
    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { memPutInt(struct + VkTensorViewCreateInfoARM.FORMAT, value); }

    // -----------------------------------

    /** An array of {@link VkTensorViewCreateInfoARM} structs. */
    public static class Buffer extends StructBuffer<VkTensorViewCreateInfoARM, Buffer> implements NativeResource {

        private static final VkTensorViewCreateInfoARM ELEMENT_FACTORY = VkTensorViewCreateInfoARM.create(-1L);

        /**
         * Creates a new {@code VkTensorViewCreateInfoARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkTensorViewCreateInfoARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkTensorViewCreateInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkTensorViewCreateInfoARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkTensorViewCreateInfoARM.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkTensorViewCreateFlagsARM")
        public long flags() { return VkTensorViewCreateInfoARM.nflags(address()); }
        /** @return the value of the {@code tensor} field. */
        @NativeType("VkTensorARM")
        public long tensor() { return VkTensorViewCreateInfoARM.ntensor(address()); }
        /** @return the value of the {@code format} field. */
        @NativeType("VkFormat")
        public int format() { return VkTensorViewCreateInfoARM.nformat(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkTensorViewCreateInfoARM.Buffer sType(@NativeType("VkStructureType") int value) { VkTensorViewCreateInfoARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMTensors#VK_STRUCTURE_TYPE_TENSOR_VIEW_CREATE_INFO_ARM STRUCTURE_TYPE_TENSOR_VIEW_CREATE_INFO_ARM} value to the {@code sType} field. */
        public VkTensorViewCreateInfoARM.Buffer sType$Default() { return sType(ARMTensors.VK_STRUCTURE_TYPE_TENSOR_VIEW_CREATE_INFO_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkTensorViewCreateInfoARM.Buffer pNext(@NativeType("void const *") long value) { VkTensorViewCreateInfoARM.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkOpaqueCaptureDescriptorDataCreateInfoEXT} value to the {@code pNext} chain. */
        public VkTensorViewCreateInfoARM.Buffer pNext(VkOpaqueCaptureDescriptorDataCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code flags} field. */
        public VkTensorViewCreateInfoARM.Buffer flags(@NativeType("VkTensorViewCreateFlagsARM") long value) { VkTensorViewCreateInfoARM.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code tensor} field. */
        public VkTensorViewCreateInfoARM.Buffer tensor(@NativeType("VkTensorARM") long value) { VkTensorViewCreateInfoARM.ntensor(address(), value); return this; }
        /** Sets the specified value to the {@code format} field. */
        public VkTensorViewCreateInfoARM.Buffer format(@NativeType("VkFormat") int value) { VkTensorViewCreateInfoARM.nformat(address(), value); return this; }

    }

}