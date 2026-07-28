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
 * struct VkTensorMemoryBarrierARM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkPipelineStageFlags2 srcStageMask;
 *     VkAccessFlags2 srcAccessMask;
 *     VkPipelineStageFlags2 dstStageMask;
 *     VkAccessFlags2 dstAccessMask;
 *     uint32_t srcQueueFamilyIndex;
 *     uint32_t dstQueueFamilyIndex;
 *     VkTensorARM tensor;
 * }}</pre>
 */
public class VkTensorMemoryBarrierARM extends Struct<VkTensorMemoryBarrierARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SRCSTAGEMASK,
        SRCACCESSMASK,
        DSTSTAGEMASK,
        DSTACCESSMASK,
        SRCQUEUEFAMILYINDEX,
        DSTQUEUEFAMILYINDEX,
        TENSOR;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(4),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCSTAGEMASK = layout.offsetof(2);
        SRCACCESSMASK = layout.offsetof(3);
        DSTSTAGEMASK = layout.offsetof(4);
        DSTACCESSMASK = layout.offsetof(5);
        SRCQUEUEFAMILYINDEX = layout.offsetof(6);
        DSTQUEUEFAMILYINDEX = layout.offsetof(7);
        TENSOR = layout.offsetof(8);
    }

    protected VkTensorMemoryBarrierARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkTensorMemoryBarrierARM create(long address, @Nullable ByteBuffer container) {
        return new VkTensorMemoryBarrierARM(address, container);
    }

    /**
     * Creates a {@code VkTensorMemoryBarrierARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkTensorMemoryBarrierARM(ByteBuffer container) {
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
    /** @return the value of the {@code srcStageMask} field. */
    @NativeType("VkPipelineStageFlags2")
    public long srcStageMask() { return nsrcStageMask(address()); }
    /** @return the value of the {@code srcAccessMask} field. */
    @NativeType("VkAccessFlags2")
    public long srcAccessMask() { return nsrcAccessMask(address()); }
    /** @return the value of the {@code dstStageMask} field. */
    @NativeType("VkPipelineStageFlags2")
    public long dstStageMask() { return ndstStageMask(address()); }
    /** @return the value of the {@code dstAccessMask} field. */
    @NativeType("VkAccessFlags2")
    public long dstAccessMask() { return ndstAccessMask(address()); }
    /** @return the value of the {@code srcQueueFamilyIndex} field. */
    @NativeType("uint32_t")
    public int srcQueueFamilyIndex() { return nsrcQueueFamilyIndex(address()); }
    /** @return the value of the {@code dstQueueFamilyIndex} field. */
    @NativeType("uint32_t")
    public int dstQueueFamilyIndex() { return ndstQueueFamilyIndex(address()); }
    /** @return the value of the {@code tensor} field. */
    @NativeType("VkTensorARM")
    public long tensor() { return ntensor(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkTensorMemoryBarrierARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMTensors#VK_STRUCTURE_TYPE_TENSOR_MEMORY_BARRIER_ARM STRUCTURE_TYPE_TENSOR_MEMORY_BARRIER_ARM} value to the {@code sType} field. */
    public VkTensorMemoryBarrierARM sType$Default() { return sType(ARMTensors.VK_STRUCTURE_TYPE_TENSOR_MEMORY_BARRIER_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkTensorMemoryBarrierARM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code srcStageMask} field. */
    public VkTensorMemoryBarrierARM srcStageMask(@NativeType("VkPipelineStageFlags2") long value) { nsrcStageMask(address(), value); return this; }
    /** Sets the specified value to the {@code srcAccessMask} field. */
    public VkTensorMemoryBarrierARM srcAccessMask(@NativeType("VkAccessFlags2") long value) { nsrcAccessMask(address(), value); return this; }
    /** Sets the specified value to the {@code dstStageMask} field. */
    public VkTensorMemoryBarrierARM dstStageMask(@NativeType("VkPipelineStageFlags2") long value) { ndstStageMask(address(), value); return this; }
    /** Sets the specified value to the {@code dstAccessMask} field. */
    public VkTensorMemoryBarrierARM dstAccessMask(@NativeType("VkAccessFlags2") long value) { ndstAccessMask(address(), value); return this; }
    /** Sets the specified value to the {@code srcQueueFamilyIndex} field. */
    public VkTensorMemoryBarrierARM srcQueueFamilyIndex(@NativeType("uint32_t") int value) { nsrcQueueFamilyIndex(address(), value); return this; }
    /** Sets the specified value to the {@code dstQueueFamilyIndex} field. */
    public VkTensorMemoryBarrierARM dstQueueFamilyIndex(@NativeType("uint32_t") int value) { ndstQueueFamilyIndex(address(), value); return this; }
    /** Sets the specified value to the {@code tensor} field. */
    public VkTensorMemoryBarrierARM tensor(@NativeType("VkTensorARM") long value) { ntensor(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkTensorMemoryBarrierARM set(
        int sType,
        long pNext,
        long srcStageMask,
        long srcAccessMask,
        long dstStageMask,
        long dstAccessMask,
        int srcQueueFamilyIndex,
        int dstQueueFamilyIndex,
        long tensor
    ) {
        sType(sType);
        pNext(pNext);
        srcStageMask(srcStageMask);
        srcAccessMask(srcAccessMask);
        dstStageMask(dstStageMask);
        dstAccessMask(dstAccessMask);
        srcQueueFamilyIndex(srcQueueFamilyIndex);
        dstQueueFamilyIndex(dstQueueFamilyIndex);
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
    public VkTensorMemoryBarrierARM set(VkTensorMemoryBarrierARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkTensorMemoryBarrierARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkTensorMemoryBarrierARM malloc() {
        return new VkTensorMemoryBarrierARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkTensorMemoryBarrierARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkTensorMemoryBarrierARM calloc() {
        return new VkTensorMemoryBarrierARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkTensorMemoryBarrierARM} instance allocated with {@link BufferUtils}. */
    public static VkTensorMemoryBarrierARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkTensorMemoryBarrierARM(memAddress(container), container);
    }

    /** Returns a new {@code VkTensorMemoryBarrierARM} instance for the specified memory address. */
    public static VkTensorMemoryBarrierARM create(long address) {
        return new VkTensorMemoryBarrierARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkTensorMemoryBarrierARM createSafe(long address) {
        return address == NULL ? null : new VkTensorMemoryBarrierARM(address, null);
    }

    /**
     * Returns a new {@link VkTensorMemoryBarrierARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTensorMemoryBarrierARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkTensorMemoryBarrierARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTensorMemoryBarrierARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTensorMemoryBarrierARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkTensorMemoryBarrierARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkTensorMemoryBarrierARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkTensorMemoryBarrierARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkTensorMemoryBarrierARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkTensorMemoryBarrierARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTensorMemoryBarrierARM malloc(MemoryStack stack) {
        return new VkTensorMemoryBarrierARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkTensorMemoryBarrierARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTensorMemoryBarrierARM calloc(MemoryStack stack) {
        return new VkTensorMemoryBarrierARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkTensorMemoryBarrierARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTensorMemoryBarrierARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTensorMemoryBarrierARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTensorMemoryBarrierARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkTensorMemoryBarrierARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkTensorMemoryBarrierARM.PNEXT); }
    /** Unsafe version of {@link #srcStageMask}. */
    public static long nsrcStageMask(long struct) { return memGetLong(struct + VkTensorMemoryBarrierARM.SRCSTAGEMASK); }
    /** Unsafe version of {@link #srcAccessMask}. */
    public static long nsrcAccessMask(long struct) { return memGetLong(struct + VkTensorMemoryBarrierARM.SRCACCESSMASK); }
    /** Unsafe version of {@link #dstStageMask}. */
    public static long ndstStageMask(long struct) { return memGetLong(struct + VkTensorMemoryBarrierARM.DSTSTAGEMASK); }
    /** Unsafe version of {@link #dstAccessMask}. */
    public static long ndstAccessMask(long struct) { return memGetLong(struct + VkTensorMemoryBarrierARM.DSTACCESSMASK); }
    /** Unsafe version of {@link #srcQueueFamilyIndex}. */
    public static int nsrcQueueFamilyIndex(long struct) { return memGetInt(struct + VkTensorMemoryBarrierARM.SRCQUEUEFAMILYINDEX); }
    /** Unsafe version of {@link #dstQueueFamilyIndex}. */
    public static int ndstQueueFamilyIndex(long struct) { return memGetInt(struct + VkTensorMemoryBarrierARM.DSTQUEUEFAMILYINDEX); }
    /** Unsafe version of {@link #tensor}. */
    public static long ntensor(long struct) { return memGetLong(struct + VkTensorMemoryBarrierARM.TENSOR); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkTensorMemoryBarrierARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkTensorMemoryBarrierARM.PNEXT, value); }
    /** Unsafe version of {@link #srcStageMask(long) srcStageMask}. */
    public static void nsrcStageMask(long struct, long value) { memPutLong(struct + VkTensorMemoryBarrierARM.SRCSTAGEMASK, value); }
    /** Unsafe version of {@link #srcAccessMask(long) srcAccessMask}. */
    public static void nsrcAccessMask(long struct, long value) { memPutLong(struct + VkTensorMemoryBarrierARM.SRCACCESSMASK, value); }
    /** Unsafe version of {@link #dstStageMask(long) dstStageMask}. */
    public static void ndstStageMask(long struct, long value) { memPutLong(struct + VkTensorMemoryBarrierARM.DSTSTAGEMASK, value); }
    /** Unsafe version of {@link #dstAccessMask(long) dstAccessMask}. */
    public static void ndstAccessMask(long struct, long value) { memPutLong(struct + VkTensorMemoryBarrierARM.DSTACCESSMASK, value); }
    /** Unsafe version of {@link #srcQueueFamilyIndex(int) srcQueueFamilyIndex}. */
    public static void nsrcQueueFamilyIndex(long struct, int value) { memPutInt(struct + VkTensorMemoryBarrierARM.SRCQUEUEFAMILYINDEX, value); }
    /** Unsafe version of {@link #dstQueueFamilyIndex(int) dstQueueFamilyIndex}. */
    public static void ndstQueueFamilyIndex(long struct, int value) { memPutInt(struct + VkTensorMemoryBarrierARM.DSTQUEUEFAMILYINDEX, value); }
    /** Unsafe version of {@link #tensor(long) tensor}. */
    public static void ntensor(long struct, long value) { memPutLong(struct + VkTensorMemoryBarrierARM.TENSOR, value); }

    // -----------------------------------

    /** An array of {@link VkTensorMemoryBarrierARM} structs. */
    public static class Buffer extends StructBuffer<VkTensorMemoryBarrierARM, Buffer> implements NativeResource {

        private static final VkTensorMemoryBarrierARM ELEMENT_FACTORY = VkTensorMemoryBarrierARM.create(-1L);

        /**
         * Creates a new {@code VkTensorMemoryBarrierARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkTensorMemoryBarrierARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkTensorMemoryBarrierARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkTensorMemoryBarrierARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkTensorMemoryBarrierARM.npNext(address()); }
        /** @return the value of the {@code srcStageMask} field. */
        @NativeType("VkPipelineStageFlags2")
        public long srcStageMask() { return VkTensorMemoryBarrierARM.nsrcStageMask(address()); }
        /** @return the value of the {@code srcAccessMask} field. */
        @NativeType("VkAccessFlags2")
        public long srcAccessMask() { return VkTensorMemoryBarrierARM.nsrcAccessMask(address()); }
        /** @return the value of the {@code dstStageMask} field. */
        @NativeType("VkPipelineStageFlags2")
        public long dstStageMask() { return VkTensorMemoryBarrierARM.ndstStageMask(address()); }
        /** @return the value of the {@code dstAccessMask} field. */
        @NativeType("VkAccessFlags2")
        public long dstAccessMask() { return VkTensorMemoryBarrierARM.ndstAccessMask(address()); }
        /** @return the value of the {@code srcQueueFamilyIndex} field. */
        @NativeType("uint32_t")
        public int srcQueueFamilyIndex() { return VkTensorMemoryBarrierARM.nsrcQueueFamilyIndex(address()); }
        /** @return the value of the {@code dstQueueFamilyIndex} field. */
        @NativeType("uint32_t")
        public int dstQueueFamilyIndex() { return VkTensorMemoryBarrierARM.ndstQueueFamilyIndex(address()); }
        /** @return the value of the {@code tensor} field. */
        @NativeType("VkTensorARM")
        public long tensor() { return VkTensorMemoryBarrierARM.ntensor(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkTensorMemoryBarrierARM.Buffer sType(@NativeType("VkStructureType") int value) { VkTensorMemoryBarrierARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMTensors#VK_STRUCTURE_TYPE_TENSOR_MEMORY_BARRIER_ARM STRUCTURE_TYPE_TENSOR_MEMORY_BARRIER_ARM} value to the {@code sType} field. */
        public VkTensorMemoryBarrierARM.Buffer sType$Default() { return sType(ARMTensors.VK_STRUCTURE_TYPE_TENSOR_MEMORY_BARRIER_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkTensorMemoryBarrierARM.Buffer pNext(@NativeType("void const *") long value) { VkTensorMemoryBarrierARM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code srcStageMask} field. */
        public VkTensorMemoryBarrierARM.Buffer srcStageMask(@NativeType("VkPipelineStageFlags2") long value) { VkTensorMemoryBarrierARM.nsrcStageMask(address(), value); return this; }
        /** Sets the specified value to the {@code srcAccessMask} field. */
        public VkTensorMemoryBarrierARM.Buffer srcAccessMask(@NativeType("VkAccessFlags2") long value) { VkTensorMemoryBarrierARM.nsrcAccessMask(address(), value); return this; }
        /** Sets the specified value to the {@code dstStageMask} field. */
        public VkTensorMemoryBarrierARM.Buffer dstStageMask(@NativeType("VkPipelineStageFlags2") long value) { VkTensorMemoryBarrierARM.ndstStageMask(address(), value); return this; }
        /** Sets the specified value to the {@code dstAccessMask} field. */
        public VkTensorMemoryBarrierARM.Buffer dstAccessMask(@NativeType("VkAccessFlags2") long value) { VkTensorMemoryBarrierARM.ndstAccessMask(address(), value); return this; }
        /** Sets the specified value to the {@code srcQueueFamilyIndex} field. */
        public VkTensorMemoryBarrierARM.Buffer srcQueueFamilyIndex(@NativeType("uint32_t") int value) { VkTensorMemoryBarrierARM.nsrcQueueFamilyIndex(address(), value); return this; }
        /** Sets the specified value to the {@code dstQueueFamilyIndex} field. */
        public VkTensorMemoryBarrierARM.Buffer dstQueueFamilyIndex(@NativeType("uint32_t") int value) { VkTensorMemoryBarrierARM.ndstQueueFamilyIndex(address(), value); return this; }
        /** Sets the specified value to the {@code tensor} field. */
        public VkTensorMemoryBarrierARM.Buffer tensor(@NativeType("VkTensorARM") long value) { VkTensorMemoryBarrierARM.ntensor(address(), value); return this; }

    }

}