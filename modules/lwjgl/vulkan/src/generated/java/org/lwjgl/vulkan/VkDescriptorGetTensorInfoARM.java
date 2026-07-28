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
 * struct VkDescriptorGetTensorInfoARM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkTensorViewARM tensorView;
 * }}</pre>
 */
public class VkDescriptorGetTensorInfoARM extends Struct<VkDescriptorGetTensorInfoARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TENSORVIEW;

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
        TENSORVIEW = layout.offsetof(2);
    }

    protected VkDescriptorGetTensorInfoARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDescriptorGetTensorInfoARM create(long address, @Nullable ByteBuffer container) {
        return new VkDescriptorGetTensorInfoARM(address, container);
    }

    /**
     * Creates a {@code VkDescriptorGetTensorInfoARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorGetTensorInfoARM(ByteBuffer container) {
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
    /** @return the value of the {@code tensorView} field. */
    @NativeType("VkTensorViewARM")
    public long tensorView() { return ntensorView(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDescriptorGetTensorInfoARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMTensors#VK_STRUCTURE_TYPE_DESCRIPTOR_GET_TENSOR_INFO_ARM STRUCTURE_TYPE_DESCRIPTOR_GET_TENSOR_INFO_ARM} value to the {@code sType} field. */
    public VkDescriptorGetTensorInfoARM sType$Default() { return sType(ARMTensors.VK_STRUCTURE_TYPE_DESCRIPTOR_GET_TENSOR_INFO_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDescriptorGetTensorInfoARM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code tensorView} field. */
    public VkDescriptorGetTensorInfoARM tensorView(@NativeType("VkTensorViewARM") long value) { ntensorView(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDescriptorGetTensorInfoARM set(
        int sType,
        long pNext,
        long tensorView
    ) {
        sType(sType);
        pNext(pNext);
        tensorView(tensorView);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorGetTensorInfoARM set(VkDescriptorGetTensorInfoARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDescriptorGetTensorInfoARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorGetTensorInfoARM malloc() {
        return new VkDescriptorGetTensorInfoARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorGetTensorInfoARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorGetTensorInfoARM calloc() {
        return new VkDescriptorGetTensorInfoARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorGetTensorInfoARM} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorGetTensorInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorGetTensorInfoARM(memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorGetTensorInfoARM} instance for the specified memory address. */
    public static VkDescriptorGetTensorInfoARM create(long address) {
        return new VkDescriptorGetTensorInfoARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDescriptorGetTensorInfoARM createSafe(long address) {
        return address == NULL ? null : new VkDescriptorGetTensorInfoARM(address, null);
    }

    /**
     * Returns a new {@link VkDescriptorGetTensorInfoARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorGetTensorInfoARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorGetTensorInfoARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorGetTensorInfoARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorGetTensorInfoARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorGetTensorInfoARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDescriptorGetTensorInfoARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorGetTensorInfoARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDescriptorGetTensorInfoARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDescriptorGetTensorInfoARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorGetTensorInfoARM malloc(MemoryStack stack) {
        return new VkDescriptorGetTensorInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDescriptorGetTensorInfoARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorGetTensorInfoARM calloc(MemoryStack stack) {
        return new VkDescriptorGetTensorInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDescriptorGetTensorInfoARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorGetTensorInfoARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorGetTensorInfoARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorGetTensorInfoARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDescriptorGetTensorInfoARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDescriptorGetTensorInfoARM.PNEXT); }
    /** Unsafe version of {@link #tensorView}. */
    public static long ntensorView(long struct) { return memGetLong(struct + VkDescriptorGetTensorInfoARM.TENSORVIEW); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDescriptorGetTensorInfoARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDescriptorGetTensorInfoARM.PNEXT, value); }
    /** Unsafe version of {@link #tensorView(long) tensorView}. */
    public static void ntensorView(long struct, long value) { memPutLong(struct + VkDescriptorGetTensorInfoARM.TENSORVIEW, value); }

    // -----------------------------------

    /** An array of {@link VkDescriptorGetTensorInfoARM} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorGetTensorInfoARM, Buffer> implements NativeResource {

        private static final VkDescriptorGetTensorInfoARM ELEMENT_FACTORY = VkDescriptorGetTensorInfoARM.create(-1L);

        /**
         * Creates a new {@code VkDescriptorGetTensorInfoARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorGetTensorInfoARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDescriptorGetTensorInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDescriptorGetTensorInfoARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDescriptorGetTensorInfoARM.npNext(address()); }
        /** @return the value of the {@code tensorView} field. */
        @NativeType("VkTensorViewARM")
        public long tensorView() { return VkDescriptorGetTensorInfoARM.ntensorView(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDescriptorGetTensorInfoARM.Buffer sType(@NativeType("VkStructureType") int value) { VkDescriptorGetTensorInfoARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMTensors#VK_STRUCTURE_TYPE_DESCRIPTOR_GET_TENSOR_INFO_ARM STRUCTURE_TYPE_DESCRIPTOR_GET_TENSOR_INFO_ARM} value to the {@code sType} field. */
        public VkDescriptorGetTensorInfoARM.Buffer sType$Default() { return sType(ARMTensors.VK_STRUCTURE_TYPE_DESCRIPTOR_GET_TENSOR_INFO_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDescriptorGetTensorInfoARM.Buffer pNext(@NativeType("void const *") long value) { VkDescriptorGetTensorInfoARM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code tensorView} field. */
        public VkDescriptorGetTensorInfoARM.Buffer tensorView(@NativeType("VkTensorViewARM") long value) { VkDescriptorGetTensorInfoARM.ntensorView(address(), value); return this; }

    }

}