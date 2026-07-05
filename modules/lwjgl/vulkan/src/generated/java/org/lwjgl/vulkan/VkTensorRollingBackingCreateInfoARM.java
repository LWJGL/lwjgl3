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

import static org.lwjgl.vulkan.ARMTensorControls.*;

/**
 * <pre>{@code
 * struct VkTensorRollingBackingCreateInfoARM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t wraps[VK_MAX_TENSOR_CREATE_INFO_ROLLING_BACKING_WRAP_COUNT_ARM];
 * }}</pre>
 */
public class VkTensorRollingBackingCreateInfoARM extends Struct<VkTensorRollingBackingCreateInfoARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        WRAPS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __array(4, VK_MAX_TENSOR_CREATE_INFO_ROLLING_BACKING_WRAP_COUNT_ARM)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        WRAPS = layout.offsetof(2);
    }

    protected VkTensorRollingBackingCreateInfoARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkTensorRollingBackingCreateInfoARM create(long address, @Nullable ByteBuffer container) {
        return new VkTensorRollingBackingCreateInfoARM(address, container);
    }

    /**
     * Creates a {@code VkTensorRollingBackingCreateInfoARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkTensorRollingBackingCreateInfoARM(ByteBuffer container) {
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
    /** @return a {@link IntBuffer} view of the {@code wraps} field. */
    @NativeType("uint32_t[VK_MAX_TENSOR_CREATE_INFO_ROLLING_BACKING_WRAP_COUNT_ARM]")
    public IntBuffer wraps() { return nwraps(address()); }
    /** @return the value at the specified index of the {@code wraps} field. */
    @NativeType("uint32_t")
    public int wraps(int index) { return nwraps(address(), index); }

    /** Sets the specified value to the {@code sType} field. */
    public VkTensorRollingBackingCreateInfoARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMTensorControls#VK_STRUCTURE_TYPE_TENSOR_ROLLING_BACKING_CREATE_INFO_ARM STRUCTURE_TYPE_TENSOR_ROLLING_BACKING_CREATE_INFO_ARM} value to the {@code sType} field. */
    public VkTensorRollingBackingCreateInfoARM sType$Default() { return sType(ARMTensorControls.VK_STRUCTURE_TYPE_TENSOR_ROLLING_BACKING_CREATE_INFO_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkTensorRollingBackingCreateInfoARM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code wraps} field. */
    public VkTensorRollingBackingCreateInfoARM wraps(@NativeType("uint32_t[VK_MAX_TENSOR_CREATE_INFO_ROLLING_BACKING_WRAP_COUNT_ARM]") IntBuffer value) { nwraps(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code wraps} field. */
    public VkTensorRollingBackingCreateInfoARM wraps(int index, @NativeType("uint32_t") int value) { nwraps(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public VkTensorRollingBackingCreateInfoARM set(
        int sType,
        long pNext,
        IntBuffer wraps
    ) {
        sType(sType);
        pNext(pNext);
        wraps(wraps);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkTensorRollingBackingCreateInfoARM set(VkTensorRollingBackingCreateInfoARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkTensorRollingBackingCreateInfoARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkTensorRollingBackingCreateInfoARM malloc() {
        return new VkTensorRollingBackingCreateInfoARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkTensorRollingBackingCreateInfoARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkTensorRollingBackingCreateInfoARM calloc() {
        return new VkTensorRollingBackingCreateInfoARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkTensorRollingBackingCreateInfoARM} instance allocated with {@link BufferUtils}. */
    public static VkTensorRollingBackingCreateInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkTensorRollingBackingCreateInfoARM(memAddress(container), container);
    }

    /** Returns a new {@code VkTensorRollingBackingCreateInfoARM} instance for the specified memory address. */
    public static VkTensorRollingBackingCreateInfoARM create(long address) {
        return new VkTensorRollingBackingCreateInfoARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkTensorRollingBackingCreateInfoARM createSafe(long address) {
        return address == NULL ? null : new VkTensorRollingBackingCreateInfoARM(address, null);
    }

    /**
     * Returns a new {@link VkTensorRollingBackingCreateInfoARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTensorRollingBackingCreateInfoARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkTensorRollingBackingCreateInfoARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTensorRollingBackingCreateInfoARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTensorRollingBackingCreateInfoARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkTensorRollingBackingCreateInfoARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkTensorRollingBackingCreateInfoARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkTensorRollingBackingCreateInfoARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkTensorRollingBackingCreateInfoARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkTensorRollingBackingCreateInfoARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTensorRollingBackingCreateInfoARM malloc(MemoryStack stack) {
        return new VkTensorRollingBackingCreateInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkTensorRollingBackingCreateInfoARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTensorRollingBackingCreateInfoARM calloc(MemoryStack stack) {
        return new VkTensorRollingBackingCreateInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkTensorRollingBackingCreateInfoARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTensorRollingBackingCreateInfoARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTensorRollingBackingCreateInfoARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTensorRollingBackingCreateInfoARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkTensorRollingBackingCreateInfoARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkTensorRollingBackingCreateInfoARM.PNEXT); }
    /** Unsafe version of {@link #wraps}. */
    public static IntBuffer nwraps(long struct) { return memIntBuffer(struct + VkTensorRollingBackingCreateInfoARM.WRAPS, VK_MAX_TENSOR_CREATE_INFO_ROLLING_BACKING_WRAP_COUNT_ARM); }
    /** Unsafe version of {@link #wraps(int) wraps}. */
    public static int nwraps(long struct, int index) {
        return memGetInt(struct + VkTensorRollingBackingCreateInfoARM.WRAPS + check(index, VK_MAX_TENSOR_CREATE_INFO_ROLLING_BACKING_WRAP_COUNT_ARM) * 4);
    }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkTensorRollingBackingCreateInfoARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkTensorRollingBackingCreateInfoARM.PNEXT, value); }
    /** Unsafe version of {@link #wraps(IntBuffer) wraps}. */
    public static void nwraps(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, VK_MAX_TENSOR_CREATE_INFO_ROLLING_BACKING_WRAP_COUNT_ARM); }
        memCopy(memAddress(value), struct + VkTensorRollingBackingCreateInfoARM.WRAPS, value.remaining() * 4);
    }
    /** Unsafe version of {@link #wraps(int, int) wraps}. */
    public static void nwraps(long struct, int index, int value) {
        memPutInt(struct + VkTensorRollingBackingCreateInfoARM.WRAPS + check(index, VK_MAX_TENSOR_CREATE_INFO_ROLLING_BACKING_WRAP_COUNT_ARM) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link VkTensorRollingBackingCreateInfoARM} structs. */
    public static class Buffer extends StructBuffer<VkTensorRollingBackingCreateInfoARM, Buffer> implements NativeResource {

        private static final VkTensorRollingBackingCreateInfoARM ELEMENT_FACTORY = VkTensorRollingBackingCreateInfoARM.create(-1L);

        /**
         * Creates a new {@code VkTensorRollingBackingCreateInfoARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkTensorRollingBackingCreateInfoARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkTensorRollingBackingCreateInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkTensorRollingBackingCreateInfoARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkTensorRollingBackingCreateInfoARM.npNext(address()); }
        /** @return a {@link IntBuffer} view of the {@code wraps} field. */
        @NativeType("uint32_t[VK_MAX_TENSOR_CREATE_INFO_ROLLING_BACKING_WRAP_COUNT_ARM]")
        public IntBuffer wraps() { return VkTensorRollingBackingCreateInfoARM.nwraps(address()); }
        /** @return the value at the specified index of the {@code wraps} field. */
        @NativeType("uint32_t")
        public int wraps(int index) { return VkTensorRollingBackingCreateInfoARM.nwraps(address(), index); }

        /** Sets the specified value to the {@code sType} field. */
        public VkTensorRollingBackingCreateInfoARM.Buffer sType(@NativeType("VkStructureType") int value) { VkTensorRollingBackingCreateInfoARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMTensorControls#VK_STRUCTURE_TYPE_TENSOR_ROLLING_BACKING_CREATE_INFO_ARM STRUCTURE_TYPE_TENSOR_ROLLING_BACKING_CREATE_INFO_ARM} value to the {@code sType} field. */
        public VkTensorRollingBackingCreateInfoARM.Buffer sType$Default() { return sType(ARMTensorControls.VK_STRUCTURE_TYPE_TENSOR_ROLLING_BACKING_CREATE_INFO_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkTensorRollingBackingCreateInfoARM.Buffer pNext(@NativeType("void const *") long value) { VkTensorRollingBackingCreateInfoARM.npNext(address(), value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code wraps} field. */
        public VkTensorRollingBackingCreateInfoARM.Buffer wraps(@NativeType("uint32_t[VK_MAX_TENSOR_CREATE_INFO_ROLLING_BACKING_WRAP_COUNT_ARM]") IntBuffer value) { VkTensorRollingBackingCreateInfoARM.nwraps(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code wraps} field. */
        public VkTensorRollingBackingCreateInfoARM.Buffer wraps(int index, @NativeType("uint32_t") int value) { VkTensorRollingBackingCreateInfoARM.nwraps(address(), index, value); return this; }

    }

}