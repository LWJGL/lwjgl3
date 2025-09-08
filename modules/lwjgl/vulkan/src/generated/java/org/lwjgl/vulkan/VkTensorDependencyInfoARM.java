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
 * <pre><code>
 * struct VkTensorDependencyInfoARM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t tensorMemoryBarrierCount;
 *     {@link VkTensorMemoryBarrierARM VkTensorMemoryBarrierARM} const * pTensorMemoryBarriers;
 * }</code></pre>
 */
public class VkTensorDependencyInfoARM extends Struct<VkTensorDependencyInfoARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TENSORMEMORYBARRIERCOUNT,
        PTENSORMEMORYBARRIERS;

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
        TENSORMEMORYBARRIERCOUNT = layout.offsetof(2);
        PTENSORMEMORYBARRIERS = layout.offsetof(3);
    }

    protected VkTensorDependencyInfoARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkTensorDependencyInfoARM create(long address, @Nullable ByteBuffer container) {
        return new VkTensorDependencyInfoARM(address, container);
    }

    /**
     * Creates a {@code VkTensorDependencyInfoARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkTensorDependencyInfoARM(ByteBuffer container) {
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
    /** @return the value of the {@code tensorMemoryBarrierCount} field. */
    @NativeType("uint32_t")
    public int tensorMemoryBarrierCount() { return ntensorMemoryBarrierCount(address()); }
    /** @return a {@link VkTensorMemoryBarrierARM} view of the struct pointed to by the {@code pTensorMemoryBarriers} field. */
    @NativeType("VkTensorMemoryBarrierARM const *")
    public VkTensorMemoryBarrierARM pTensorMemoryBarriers() { return npTensorMemoryBarriers(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkTensorDependencyInfoARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMTensors#VK_STRUCTURE_TYPE_TENSOR_DEPENDENCY_INFO_ARM STRUCTURE_TYPE_TENSOR_DEPENDENCY_INFO_ARM} value to the {@code sType} field. */
    public VkTensorDependencyInfoARM sType$Default() { return sType(ARMTensors.VK_STRUCTURE_TYPE_TENSOR_DEPENDENCY_INFO_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkTensorDependencyInfoARM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code tensorMemoryBarrierCount} field. */
    public VkTensorDependencyInfoARM tensorMemoryBarrierCount(@NativeType("uint32_t") int value) { ntensorMemoryBarrierCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkTensorMemoryBarrierARM} to the {@code pTensorMemoryBarriers} field. */
    public VkTensorDependencyInfoARM pTensorMemoryBarriers(@NativeType("VkTensorMemoryBarrierARM const *") VkTensorMemoryBarrierARM value) { npTensorMemoryBarriers(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkTensorDependencyInfoARM set(
        int sType,
        long pNext,
        int tensorMemoryBarrierCount,
        VkTensorMemoryBarrierARM pTensorMemoryBarriers
    ) {
        sType(sType);
        pNext(pNext);
        tensorMemoryBarrierCount(tensorMemoryBarrierCount);
        pTensorMemoryBarriers(pTensorMemoryBarriers);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkTensorDependencyInfoARM set(VkTensorDependencyInfoARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkTensorDependencyInfoARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkTensorDependencyInfoARM malloc() {
        return new VkTensorDependencyInfoARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkTensorDependencyInfoARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkTensorDependencyInfoARM calloc() {
        return new VkTensorDependencyInfoARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkTensorDependencyInfoARM} instance allocated with {@link BufferUtils}. */
    public static VkTensorDependencyInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkTensorDependencyInfoARM(memAddress(container), container);
    }

    /** Returns a new {@code VkTensorDependencyInfoARM} instance for the specified memory address. */
    public static VkTensorDependencyInfoARM create(long address) {
        return new VkTensorDependencyInfoARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkTensorDependencyInfoARM createSafe(long address) {
        return address == NULL ? null : new VkTensorDependencyInfoARM(address, null);
    }

    /**
     * Returns a new {@link VkTensorDependencyInfoARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTensorDependencyInfoARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkTensorDependencyInfoARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTensorDependencyInfoARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTensorDependencyInfoARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkTensorDependencyInfoARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkTensorDependencyInfoARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkTensorDependencyInfoARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkTensorDependencyInfoARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkTensorDependencyInfoARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTensorDependencyInfoARM malloc(MemoryStack stack) {
        return new VkTensorDependencyInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkTensorDependencyInfoARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTensorDependencyInfoARM calloc(MemoryStack stack) {
        return new VkTensorDependencyInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkTensorDependencyInfoARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTensorDependencyInfoARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTensorDependencyInfoARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTensorDependencyInfoARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkTensorDependencyInfoARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkTensorDependencyInfoARM.PNEXT); }
    /** Unsafe version of {@link #tensorMemoryBarrierCount}. */
    public static int ntensorMemoryBarrierCount(long struct) { return memGetInt(struct + VkTensorDependencyInfoARM.TENSORMEMORYBARRIERCOUNT); }
    /** Unsafe version of {@link #pTensorMemoryBarriers}. */
    public static VkTensorMemoryBarrierARM npTensorMemoryBarriers(long struct) { return VkTensorMemoryBarrierARM.create(memGetAddress(struct + VkTensorDependencyInfoARM.PTENSORMEMORYBARRIERS)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkTensorDependencyInfoARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkTensorDependencyInfoARM.PNEXT, value); }
    /** Unsafe version of {@link #tensorMemoryBarrierCount(int) tensorMemoryBarrierCount}. */
    public static void ntensorMemoryBarrierCount(long struct, int value) { memPutInt(struct + VkTensorDependencyInfoARM.TENSORMEMORYBARRIERCOUNT, value); }
    /** Unsafe version of {@link #pTensorMemoryBarriers(VkTensorMemoryBarrierARM) pTensorMemoryBarriers}. */
    public static void npTensorMemoryBarriers(long struct, VkTensorMemoryBarrierARM value) { memPutAddress(struct + VkTensorDependencyInfoARM.PTENSORMEMORYBARRIERS, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkTensorDependencyInfoARM.PTENSORMEMORYBARRIERS));
    }

    // -----------------------------------

    /** An array of {@link VkTensorDependencyInfoARM} structs. */
    public static class Buffer extends StructBuffer<VkTensorDependencyInfoARM, Buffer> implements NativeResource {

        private static final VkTensorDependencyInfoARM ELEMENT_FACTORY = VkTensorDependencyInfoARM.create(-1L);

        /**
         * Creates a new {@code VkTensorDependencyInfoARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkTensorDependencyInfoARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkTensorDependencyInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkTensorDependencyInfoARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkTensorDependencyInfoARM.npNext(address()); }
        /** @return the value of the {@code tensorMemoryBarrierCount} field. */
        @NativeType("uint32_t")
        public int tensorMemoryBarrierCount() { return VkTensorDependencyInfoARM.ntensorMemoryBarrierCount(address()); }
        /** @return a {@link VkTensorMemoryBarrierARM} view of the struct pointed to by the {@code pTensorMemoryBarriers} field. */
        @NativeType("VkTensorMemoryBarrierARM const *")
        public VkTensorMemoryBarrierARM pTensorMemoryBarriers() { return VkTensorDependencyInfoARM.npTensorMemoryBarriers(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkTensorDependencyInfoARM.Buffer sType(@NativeType("VkStructureType") int value) { VkTensorDependencyInfoARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMTensors#VK_STRUCTURE_TYPE_TENSOR_DEPENDENCY_INFO_ARM STRUCTURE_TYPE_TENSOR_DEPENDENCY_INFO_ARM} value to the {@code sType} field. */
        public VkTensorDependencyInfoARM.Buffer sType$Default() { return sType(ARMTensors.VK_STRUCTURE_TYPE_TENSOR_DEPENDENCY_INFO_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkTensorDependencyInfoARM.Buffer pNext(@NativeType("void const *") long value) { VkTensorDependencyInfoARM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code tensorMemoryBarrierCount} field. */
        public VkTensorDependencyInfoARM.Buffer tensorMemoryBarrierCount(@NativeType("uint32_t") int value) { VkTensorDependencyInfoARM.ntensorMemoryBarrierCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkTensorMemoryBarrierARM} to the {@code pTensorMemoryBarriers} field. */
        public VkTensorDependencyInfoARM.Buffer pTensorMemoryBarriers(@NativeType("VkTensorMemoryBarrierARM const *") VkTensorMemoryBarrierARM value) { VkTensorDependencyInfoARM.npTensorMemoryBarriers(address(), value); return this; }

    }

}