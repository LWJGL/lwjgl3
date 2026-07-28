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
 * struct VkDispatchParametersARM {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t workGroupBatchSize;
 *     uint32_t maxQueuedWorkGroupBatches;
 *     uint32_t maxWarpsPerShaderCore;
 * }}</pre>
 */
public class VkDispatchParametersARM extends Struct<VkDispatchParametersARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        WORKGROUPBATCHSIZE,
        MAXQUEUEDWORKGROUPBATCHES,
        MAXWARPSPERSHADERCORE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        WORKGROUPBATCHSIZE = layout.offsetof(2);
        MAXQUEUEDWORKGROUPBATCHES = layout.offsetof(3);
        MAXWARPSPERSHADERCORE = layout.offsetof(4);
    }

    protected VkDispatchParametersARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDispatchParametersARM create(long address, @Nullable ByteBuffer container) {
        return new VkDispatchParametersARM(address, container);
    }

    /**
     * Creates a {@code VkDispatchParametersARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDispatchParametersARM(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code workGroupBatchSize} field. */
    @NativeType("uint32_t")
    public int workGroupBatchSize() { return nworkGroupBatchSize(address()); }
    /** @return the value of the {@code maxQueuedWorkGroupBatches} field. */
    @NativeType("uint32_t")
    public int maxQueuedWorkGroupBatches() { return nmaxQueuedWorkGroupBatches(address()); }
    /** @return the value of the {@code maxWarpsPerShaderCore} field. */
    @NativeType("uint32_t")
    public int maxWarpsPerShaderCore() { return nmaxWarpsPerShaderCore(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDispatchParametersARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMSchedulingControls#VK_STRUCTURE_TYPE_DISPATCH_PARAMETERS_ARM STRUCTURE_TYPE_DISPATCH_PARAMETERS_ARM} value to the {@code sType} field. */
    public VkDispatchParametersARM sType$Default() { return sType(ARMSchedulingControls.VK_STRUCTURE_TYPE_DISPATCH_PARAMETERS_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDispatchParametersARM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code workGroupBatchSize} field. */
    public VkDispatchParametersARM workGroupBatchSize(@NativeType("uint32_t") int value) { nworkGroupBatchSize(address(), value); return this; }
    /** Sets the specified value to the {@code maxQueuedWorkGroupBatches} field. */
    public VkDispatchParametersARM maxQueuedWorkGroupBatches(@NativeType("uint32_t") int value) { nmaxQueuedWorkGroupBatches(address(), value); return this; }
    /** Sets the specified value to the {@code maxWarpsPerShaderCore} field. */
    public VkDispatchParametersARM maxWarpsPerShaderCore(@NativeType("uint32_t") int value) { nmaxWarpsPerShaderCore(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDispatchParametersARM set(
        int sType,
        long pNext,
        int workGroupBatchSize,
        int maxQueuedWorkGroupBatches,
        int maxWarpsPerShaderCore
    ) {
        sType(sType);
        pNext(pNext);
        workGroupBatchSize(workGroupBatchSize);
        maxQueuedWorkGroupBatches(maxQueuedWorkGroupBatches);
        maxWarpsPerShaderCore(maxWarpsPerShaderCore);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDispatchParametersARM set(VkDispatchParametersARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDispatchParametersARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDispatchParametersARM malloc() {
        return new VkDispatchParametersARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDispatchParametersARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDispatchParametersARM calloc() {
        return new VkDispatchParametersARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDispatchParametersARM} instance allocated with {@link BufferUtils}. */
    public static VkDispatchParametersARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDispatchParametersARM(memAddress(container), container);
    }

    /** Returns a new {@code VkDispatchParametersARM} instance for the specified memory address. */
    public static VkDispatchParametersARM create(long address) {
        return new VkDispatchParametersARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDispatchParametersARM createSafe(long address) {
        return address == NULL ? null : new VkDispatchParametersARM(address, null);
    }

    /**
     * Returns a new {@link VkDispatchParametersARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDispatchParametersARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDispatchParametersARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDispatchParametersARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDispatchParametersARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDispatchParametersARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDispatchParametersARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDispatchParametersARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDispatchParametersARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDispatchParametersARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDispatchParametersARM malloc(MemoryStack stack) {
        return new VkDispatchParametersARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDispatchParametersARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDispatchParametersARM calloc(MemoryStack stack) {
        return new VkDispatchParametersARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDispatchParametersARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDispatchParametersARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDispatchParametersARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDispatchParametersARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDispatchParametersARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDispatchParametersARM.PNEXT); }
    /** Unsafe version of {@link #workGroupBatchSize}. */
    public static int nworkGroupBatchSize(long struct) { return memGetInt(struct + VkDispatchParametersARM.WORKGROUPBATCHSIZE); }
    /** Unsafe version of {@link #maxQueuedWorkGroupBatches}. */
    public static int nmaxQueuedWorkGroupBatches(long struct) { return memGetInt(struct + VkDispatchParametersARM.MAXQUEUEDWORKGROUPBATCHES); }
    /** Unsafe version of {@link #maxWarpsPerShaderCore}. */
    public static int nmaxWarpsPerShaderCore(long struct) { return memGetInt(struct + VkDispatchParametersARM.MAXWARPSPERSHADERCORE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDispatchParametersARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDispatchParametersARM.PNEXT, value); }
    /** Unsafe version of {@link #workGroupBatchSize(int) workGroupBatchSize}. */
    public static void nworkGroupBatchSize(long struct, int value) { memPutInt(struct + VkDispatchParametersARM.WORKGROUPBATCHSIZE, value); }
    /** Unsafe version of {@link #maxQueuedWorkGroupBatches(int) maxQueuedWorkGroupBatches}. */
    public static void nmaxQueuedWorkGroupBatches(long struct, int value) { memPutInt(struct + VkDispatchParametersARM.MAXQUEUEDWORKGROUPBATCHES, value); }
    /** Unsafe version of {@link #maxWarpsPerShaderCore(int) maxWarpsPerShaderCore}. */
    public static void nmaxWarpsPerShaderCore(long struct, int value) { memPutInt(struct + VkDispatchParametersARM.MAXWARPSPERSHADERCORE, value); }

    // -----------------------------------

    /** An array of {@link VkDispatchParametersARM} structs. */
    public static class Buffer extends StructBuffer<VkDispatchParametersARM, Buffer> implements NativeResource {

        private static final VkDispatchParametersARM ELEMENT_FACTORY = VkDispatchParametersARM.create(-1L);

        /**
         * Creates a new {@code VkDispatchParametersARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDispatchParametersARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDispatchParametersARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDispatchParametersARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkDispatchParametersARM.npNext(address()); }
        /** @return the value of the {@code workGroupBatchSize} field. */
        @NativeType("uint32_t")
        public int workGroupBatchSize() { return VkDispatchParametersARM.nworkGroupBatchSize(address()); }
        /** @return the value of the {@code maxQueuedWorkGroupBatches} field. */
        @NativeType("uint32_t")
        public int maxQueuedWorkGroupBatches() { return VkDispatchParametersARM.nmaxQueuedWorkGroupBatches(address()); }
        /** @return the value of the {@code maxWarpsPerShaderCore} field. */
        @NativeType("uint32_t")
        public int maxWarpsPerShaderCore() { return VkDispatchParametersARM.nmaxWarpsPerShaderCore(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDispatchParametersARM.Buffer sType(@NativeType("VkStructureType") int value) { VkDispatchParametersARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMSchedulingControls#VK_STRUCTURE_TYPE_DISPATCH_PARAMETERS_ARM STRUCTURE_TYPE_DISPATCH_PARAMETERS_ARM} value to the {@code sType} field. */
        public VkDispatchParametersARM.Buffer sType$Default() { return sType(ARMSchedulingControls.VK_STRUCTURE_TYPE_DISPATCH_PARAMETERS_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDispatchParametersARM.Buffer pNext(@NativeType("void *") long value) { VkDispatchParametersARM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code workGroupBatchSize} field. */
        public VkDispatchParametersARM.Buffer workGroupBatchSize(@NativeType("uint32_t") int value) { VkDispatchParametersARM.nworkGroupBatchSize(address(), value); return this; }
        /** Sets the specified value to the {@code maxQueuedWorkGroupBatches} field. */
        public VkDispatchParametersARM.Buffer maxQueuedWorkGroupBatches(@NativeType("uint32_t") int value) { VkDispatchParametersARM.nmaxQueuedWorkGroupBatches(address(), value); return this; }
        /** Sets the specified value to the {@code maxWarpsPerShaderCore} field. */
        public VkDispatchParametersARM.Buffer maxWarpsPerShaderCore(@NativeType("uint32_t") int value) { VkDispatchParametersARM.nmaxWarpsPerShaderCore(address(), value); return this; }

    }

}