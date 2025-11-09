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
 * struct VkWriteDescriptorSetTensorARM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t tensorViewCount;
 *     VkTensorViewARM const * pTensorViews;
 * }}</pre>
 */
public class VkWriteDescriptorSetTensorARM extends Struct<VkWriteDescriptorSetTensorARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TENSORVIEWCOUNT,
        PTENSORVIEWS;

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
        TENSORVIEWCOUNT = layout.offsetof(2);
        PTENSORVIEWS = layout.offsetof(3);
    }

    protected VkWriteDescriptorSetTensorARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkWriteDescriptorSetTensorARM create(long address, @Nullable ByteBuffer container) {
        return new VkWriteDescriptorSetTensorARM(address, container);
    }

    /**
     * Creates a {@code VkWriteDescriptorSetTensorARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkWriteDescriptorSetTensorARM(ByteBuffer container) {
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
    /** @return the value of the {@code tensorViewCount} field. */
    @NativeType("uint32_t")
    public int tensorViewCount() { return ntensorViewCount(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code pTensorViews} field. */
    @NativeType("VkTensorViewARM const *")
    public @Nullable LongBuffer pTensorViews() { return npTensorViews(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkWriteDescriptorSetTensorARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMTensors#VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_TENSOR_ARM STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_TENSOR_ARM} value to the {@code sType} field. */
    public VkWriteDescriptorSetTensorARM sType$Default() { return sType(ARMTensors.VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_TENSOR_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkWriteDescriptorSetTensorARM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code tensorViewCount} field. */
    public VkWriteDescriptorSetTensorARM tensorViewCount(@NativeType("uint32_t") int value) { ntensorViewCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pTensorViews} field. */
    public VkWriteDescriptorSetTensorARM pTensorViews(@Nullable @NativeType("VkTensorViewARM const *") LongBuffer value) { npTensorViews(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkWriteDescriptorSetTensorARM set(
        int sType,
        long pNext,
        int tensorViewCount,
        @Nullable LongBuffer pTensorViews
    ) {
        sType(sType);
        pNext(pNext);
        tensorViewCount(tensorViewCount);
        pTensorViews(pTensorViews);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkWriteDescriptorSetTensorARM set(VkWriteDescriptorSetTensorARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkWriteDescriptorSetTensorARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkWriteDescriptorSetTensorARM malloc() {
        return new VkWriteDescriptorSetTensorARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkWriteDescriptorSetTensorARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkWriteDescriptorSetTensorARM calloc() {
        return new VkWriteDescriptorSetTensorARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkWriteDescriptorSetTensorARM} instance allocated with {@link BufferUtils}. */
    public static VkWriteDescriptorSetTensorARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkWriteDescriptorSetTensorARM(memAddress(container), container);
    }

    /** Returns a new {@code VkWriteDescriptorSetTensorARM} instance for the specified memory address. */
    public static VkWriteDescriptorSetTensorARM create(long address) {
        return new VkWriteDescriptorSetTensorARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkWriteDescriptorSetTensorARM createSafe(long address) {
        return address == NULL ? null : new VkWriteDescriptorSetTensorARM(address, null);
    }

    /**
     * Returns a new {@link VkWriteDescriptorSetTensorARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetTensorARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkWriteDescriptorSetTensorARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetTensorARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkWriteDescriptorSetTensorARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetTensorARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkWriteDescriptorSetTensorARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetTensorARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkWriteDescriptorSetTensorARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkWriteDescriptorSetTensorARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkWriteDescriptorSetTensorARM malloc(MemoryStack stack) {
        return new VkWriteDescriptorSetTensorARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkWriteDescriptorSetTensorARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkWriteDescriptorSetTensorARM calloc(MemoryStack stack) {
        return new VkWriteDescriptorSetTensorARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkWriteDescriptorSetTensorARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetTensorARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkWriteDescriptorSetTensorARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetTensorARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkWriteDescriptorSetTensorARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkWriteDescriptorSetTensorARM.PNEXT); }
    /** Unsafe version of {@link #tensorViewCount}. */
    public static int ntensorViewCount(long struct) { return memGetInt(struct + VkWriteDescriptorSetTensorARM.TENSORVIEWCOUNT); }
    /** Unsafe version of {@link #pTensorViews() pTensorViews}. */
    public static @Nullable LongBuffer npTensorViews(long struct) { return memLongBufferSafe(memGetAddress(struct + VkWriteDescriptorSetTensorARM.PTENSORVIEWS), ntensorViewCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkWriteDescriptorSetTensorARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkWriteDescriptorSetTensorARM.PNEXT, value); }
    /** Sets the specified value to the {@code tensorViewCount} field of the specified {@code struct}. */
    public static void ntensorViewCount(long struct, int value) { memPutInt(struct + VkWriteDescriptorSetTensorARM.TENSORVIEWCOUNT, value); }
    /** Unsafe version of {@link #pTensorViews(LongBuffer) pTensorViews}. */
    public static void npTensorViews(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkWriteDescriptorSetTensorARM.PTENSORVIEWS, memAddressSafe(value)); if (value != null) { ntensorViewCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkWriteDescriptorSetTensorARM} structs. */
    public static class Buffer extends StructBuffer<VkWriteDescriptorSetTensorARM, Buffer> implements NativeResource {

        private static final VkWriteDescriptorSetTensorARM ELEMENT_FACTORY = VkWriteDescriptorSetTensorARM.create(-1L);

        /**
         * Creates a new {@code VkWriteDescriptorSetTensorARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkWriteDescriptorSetTensorARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkWriteDescriptorSetTensorARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkWriteDescriptorSetTensorARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkWriteDescriptorSetTensorARM.npNext(address()); }
        /** @return the value of the {@code tensorViewCount} field. */
        @NativeType("uint32_t")
        public int tensorViewCount() { return VkWriteDescriptorSetTensorARM.ntensorViewCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pTensorViews} field. */
        @NativeType("VkTensorViewARM const *")
        public @Nullable LongBuffer pTensorViews() { return VkWriteDescriptorSetTensorARM.npTensorViews(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkWriteDescriptorSetTensorARM.Buffer sType(@NativeType("VkStructureType") int value) { VkWriteDescriptorSetTensorARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMTensors#VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_TENSOR_ARM STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_TENSOR_ARM} value to the {@code sType} field. */
        public VkWriteDescriptorSetTensorARM.Buffer sType$Default() { return sType(ARMTensors.VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_TENSOR_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkWriteDescriptorSetTensorARM.Buffer pNext(@NativeType("void const *") long value) { VkWriteDescriptorSetTensorARM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code tensorViewCount} field. */
        public VkWriteDescriptorSetTensorARM.Buffer tensorViewCount(@NativeType("uint32_t") int value) { VkWriteDescriptorSetTensorARM.ntensorViewCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pTensorViews} field. */
        public VkWriteDescriptorSetTensorARM.Buffer pTensorViews(@Nullable @NativeType("VkTensorViewARM const *") LongBuffer value) { VkWriteDescriptorSetTensorARM.npTensorViews(address(), value); return this; }

    }

}