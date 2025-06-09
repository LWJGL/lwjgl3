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
 * struct VkTensorCaptureDescriptorDataInfoARM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkTensorARM tensor;
 * }}</pre>
 */
public class VkTensorCaptureDescriptorDataInfoARM extends Struct<VkTensorCaptureDescriptorDataInfoARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TENSOR;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TENSOR = layout.offsetof(2);
    }

    protected VkTensorCaptureDescriptorDataInfoARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkTensorCaptureDescriptorDataInfoARM create(long address, @Nullable ByteBuffer container) {
        return new VkTensorCaptureDescriptorDataInfoARM(address, container);
    }

    /**
     * Creates a {@code VkTensorCaptureDescriptorDataInfoARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkTensorCaptureDescriptorDataInfoARM(ByteBuffer container) {
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
    /** @return the value of the {@code tensor} field. */
    @NativeType("VkTensorARM")
    public long tensor() { return ntensor(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkTensorCaptureDescriptorDataInfoARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMTensors#VK_STRUCTURE_TYPE_TENSOR_CAPTURE_DESCRIPTOR_DATA_INFO_ARM STRUCTURE_TYPE_TENSOR_CAPTURE_DESCRIPTOR_DATA_INFO_ARM} value to the {@code sType} field. */
    public VkTensorCaptureDescriptorDataInfoARM sType$Default() { return sType(ARMTensors.VK_STRUCTURE_TYPE_TENSOR_CAPTURE_DESCRIPTOR_DATA_INFO_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkTensorCaptureDescriptorDataInfoARM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code tensor} field. */
    public VkTensorCaptureDescriptorDataInfoARM tensor(@NativeType("VkTensorARM") long value) { ntensor(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkTensorCaptureDescriptorDataInfoARM set(
        int sType,
        long pNext,
        long tensor
    ) {
        sType(sType);
        pNext(pNext);
        tensor(tensor);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkTensorCaptureDescriptorDataInfoARM set(VkTensorCaptureDescriptorDataInfoARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkTensorCaptureDescriptorDataInfoARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkTensorCaptureDescriptorDataInfoARM malloc() {
        return new VkTensorCaptureDescriptorDataInfoARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkTensorCaptureDescriptorDataInfoARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkTensorCaptureDescriptorDataInfoARM calloc() {
        return new VkTensorCaptureDescriptorDataInfoARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkTensorCaptureDescriptorDataInfoARM} instance allocated with {@link BufferUtils}. */
    public static VkTensorCaptureDescriptorDataInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkTensorCaptureDescriptorDataInfoARM(memAddress(container), container);
    }

    /** Returns a new {@code VkTensorCaptureDescriptorDataInfoARM} instance for the specified memory address. */
    public static VkTensorCaptureDescriptorDataInfoARM create(long address) {
        return new VkTensorCaptureDescriptorDataInfoARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkTensorCaptureDescriptorDataInfoARM createSafe(long address) {
        return address == NULL ? null : new VkTensorCaptureDescriptorDataInfoARM(address, null);
    }

    /**
     * Returns a new {@link VkTensorCaptureDescriptorDataInfoARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTensorCaptureDescriptorDataInfoARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkTensorCaptureDescriptorDataInfoARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTensorCaptureDescriptorDataInfoARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTensorCaptureDescriptorDataInfoARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkTensorCaptureDescriptorDataInfoARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkTensorCaptureDescriptorDataInfoARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkTensorCaptureDescriptorDataInfoARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkTensorCaptureDescriptorDataInfoARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkTensorCaptureDescriptorDataInfoARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTensorCaptureDescriptorDataInfoARM malloc(MemoryStack stack) {
        return new VkTensorCaptureDescriptorDataInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkTensorCaptureDescriptorDataInfoARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTensorCaptureDescriptorDataInfoARM calloc(MemoryStack stack) {
        return new VkTensorCaptureDescriptorDataInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkTensorCaptureDescriptorDataInfoARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTensorCaptureDescriptorDataInfoARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTensorCaptureDescriptorDataInfoARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTensorCaptureDescriptorDataInfoARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkTensorCaptureDescriptorDataInfoARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkTensorCaptureDescriptorDataInfoARM.PNEXT); }
    /** Unsafe version of {@link #tensor}. */
    public static long ntensor(long struct) { return memGetLong(struct + VkTensorCaptureDescriptorDataInfoARM.TENSOR); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkTensorCaptureDescriptorDataInfoARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkTensorCaptureDescriptorDataInfoARM.PNEXT, value); }
    /** Unsafe version of {@link #tensor(long) tensor}. */
    public static void ntensor(long struct, long value) { memPutLong(struct + VkTensorCaptureDescriptorDataInfoARM.TENSOR, value); }

    // -----------------------------------

    /** An array of {@link VkTensorCaptureDescriptorDataInfoARM} structs. */
    public static class Buffer extends StructBuffer<VkTensorCaptureDescriptorDataInfoARM, Buffer> implements NativeResource {

        private static final VkTensorCaptureDescriptorDataInfoARM ELEMENT_FACTORY = VkTensorCaptureDescriptorDataInfoARM.create(-1L);

        /**
         * Creates a new {@code VkTensorCaptureDescriptorDataInfoARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkTensorCaptureDescriptorDataInfoARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkTensorCaptureDescriptorDataInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkTensorCaptureDescriptorDataInfoARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkTensorCaptureDescriptorDataInfoARM.npNext(address()); }
        /** @return the value of the {@code tensor} field. */
        @NativeType("VkTensorARM")
        public long tensor() { return VkTensorCaptureDescriptorDataInfoARM.ntensor(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkTensorCaptureDescriptorDataInfoARM.Buffer sType(@NativeType("VkStructureType") int value) { VkTensorCaptureDescriptorDataInfoARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMTensors#VK_STRUCTURE_TYPE_TENSOR_CAPTURE_DESCRIPTOR_DATA_INFO_ARM STRUCTURE_TYPE_TENSOR_CAPTURE_DESCRIPTOR_DATA_INFO_ARM} value to the {@code sType} field. */
        public VkTensorCaptureDescriptorDataInfoARM.Buffer sType$Default() { return sType(ARMTensors.VK_STRUCTURE_TYPE_TENSOR_CAPTURE_DESCRIPTOR_DATA_INFO_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkTensorCaptureDescriptorDataInfoARM.Buffer pNext(@NativeType("void const *") long value) { VkTensorCaptureDescriptorDataInfoARM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code tensor} field. */
        public VkTensorCaptureDescriptorDataInfoARM.Buffer tensor(@NativeType("VkTensorARM") long value) { VkTensorCaptureDescriptorDataInfoARM.ntensor(address(), value); return this; }

    }

}