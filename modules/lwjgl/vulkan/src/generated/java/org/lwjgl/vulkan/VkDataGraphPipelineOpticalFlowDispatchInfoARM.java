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
 * struct VkDataGraphPipelineOpticalFlowDispatchInfoARM {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkDataGraphOpticalFlowExecuteFlagsARM flags;
 *     uint32_t meanFlowL1NormHint;
 * }}</pre>
 */
public class VkDataGraphPipelineOpticalFlowDispatchInfoARM extends Struct<VkDataGraphPipelineOpticalFlowDispatchInfoARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        MEANFLOWL1NORMHINT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        MEANFLOWL1NORMHINT = layout.offsetof(3);
    }

    protected VkDataGraphPipelineOpticalFlowDispatchInfoARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDataGraphPipelineOpticalFlowDispatchInfoARM create(long address, @Nullable ByteBuffer container) {
        return new VkDataGraphPipelineOpticalFlowDispatchInfoARM(address, container);
    }

    /**
     * Creates a {@code VkDataGraphPipelineOpticalFlowDispatchInfoARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDataGraphPipelineOpticalFlowDispatchInfoARM(ByteBuffer container) {
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
    /** @return the value of the {@code flags} field. */
    @NativeType("VkDataGraphOpticalFlowExecuteFlagsARM")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code meanFlowL1NormHint} field. */
    @NativeType("uint32_t")
    public int meanFlowL1NormHint() { return nmeanFlowL1NormHint(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDataGraphPipelineOpticalFlowDispatchInfoARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMDataGraphOpticalFlow#VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_OPTICAL_FLOW_DISPATCH_INFO_ARM STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_OPTICAL_FLOW_DISPATCH_INFO_ARM} value to the {@code sType} field. */
    public VkDataGraphPipelineOpticalFlowDispatchInfoARM sType$Default() { return sType(ARMDataGraphOpticalFlow.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_OPTICAL_FLOW_DISPATCH_INFO_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDataGraphPipelineOpticalFlowDispatchInfoARM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkDataGraphPipelineOpticalFlowDispatchInfoARM flags(@NativeType("VkDataGraphOpticalFlowExecuteFlagsARM") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code meanFlowL1NormHint} field. */
    public VkDataGraphPipelineOpticalFlowDispatchInfoARM meanFlowL1NormHint(@NativeType("uint32_t") int value) { nmeanFlowL1NormHint(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDataGraphPipelineOpticalFlowDispatchInfoARM set(
        int sType,
        long pNext,
        int flags,
        int meanFlowL1NormHint
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        meanFlowL1NormHint(meanFlowL1NormHint);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDataGraphPipelineOpticalFlowDispatchInfoARM set(VkDataGraphPipelineOpticalFlowDispatchInfoARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDataGraphPipelineOpticalFlowDispatchInfoARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDataGraphPipelineOpticalFlowDispatchInfoARM malloc() {
        return new VkDataGraphPipelineOpticalFlowDispatchInfoARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDataGraphPipelineOpticalFlowDispatchInfoARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDataGraphPipelineOpticalFlowDispatchInfoARM calloc() {
        return new VkDataGraphPipelineOpticalFlowDispatchInfoARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDataGraphPipelineOpticalFlowDispatchInfoARM} instance allocated with {@link BufferUtils}. */
    public static VkDataGraphPipelineOpticalFlowDispatchInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDataGraphPipelineOpticalFlowDispatchInfoARM(memAddress(container), container);
    }

    /** Returns a new {@code VkDataGraphPipelineOpticalFlowDispatchInfoARM} instance for the specified memory address. */
    public static VkDataGraphPipelineOpticalFlowDispatchInfoARM create(long address) {
        return new VkDataGraphPipelineOpticalFlowDispatchInfoARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDataGraphPipelineOpticalFlowDispatchInfoARM createSafe(long address) {
        return address == NULL ? null : new VkDataGraphPipelineOpticalFlowDispatchInfoARM(address, null);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineOpticalFlowDispatchInfoARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineOpticalFlowDispatchInfoARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineOpticalFlowDispatchInfoARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineOpticalFlowDispatchInfoARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineOpticalFlowDispatchInfoARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineOpticalFlowDispatchInfoARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDataGraphPipelineOpticalFlowDispatchInfoARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineOpticalFlowDispatchInfoARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDataGraphPipelineOpticalFlowDispatchInfoARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDataGraphPipelineOpticalFlowDispatchInfoARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDataGraphPipelineOpticalFlowDispatchInfoARM malloc(MemoryStack stack) {
        return new VkDataGraphPipelineOpticalFlowDispatchInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDataGraphPipelineOpticalFlowDispatchInfoARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDataGraphPipelineOpticalFlowDispatchInfoARM calloc(MemoryStack stack) {
        return new VkDataGraphPipelineOpticalFlowDispatchInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineOpticalFlowDispatchInfoARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineOpticalFlowDispatchInfoARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineOpticalFlowDispatchInfoARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineOpticalFlowDispatchInfoARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDataGraphPipelineOpticalFlowDispatchInfoARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDataGraphPipelineOpticalFlowDispatchInfoARM.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkDataGraphPipelineOpticalFlowDispatchInfoARM.FLAGS); }
    /** Unsafe version of {@link #meanFlowL1NormHint}. */
    public static int nmeanFlowL1NormHint(long struct) { return memGetInt(struct + VkDataGraphPipelineOpticalFlowDispatchInfoARM.MEANFLOWL1NORMHINT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDataGraphPipelineOpticalFlowDispatchInfoARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDataGraphPipelineOpticalFlowDispatchInfoARM.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkDataGraphPipelineOpticalFlowDispatchInfoARM.FLAGS, value); }
    /** Unsafe version of {@link #meanFlowL1NormHint(int) meanFlowL1NormHint}. */
    public static void nmeanFlowL1NormHint(long struct, int value) { memPutInt(struct + VkDataGraphPipelineOpticalFlowDispatchInfoARM.MEANFLOWL1NORMHINT, value); }

    // -----------------------------------

    /** An array of {@link VkDataGraphPipelineOpticalFlowDispatchInfoARM} structs. */
    public static class Buffer extends StructBuffer<VkDataGraphPipelineOpticalFlowDispatchInfoARM, Buffer> implements NativeResource {

        private static final VkDataGraphPipelineOpticalFlowDispatchInfoARM ELEMENT_FACTORY = VkDataGraphPipelineOpticalFlowDispatchInfoARM.create(-1L);

        /**
         * Creates a new {@code VkDataGraphPipelineOpticalFlowDispatchInfoARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDataGraphPipelineOpticalFlowDispatchInfoARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDataGraphPipelineOpticalFlowDispatchInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDataGraphPipelineOpticalFlowDispatchInfoARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkDataGraphPipelineOpticalFlowDispatchInfoARM.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkDataGraphOpticalFlowExecuteFlagsARM")
        public int flags() { return VkDataGraphPipelineOpticalFlowDispatchInfoARM.nflags(address()); }
        /** @return the value of the {@code meanFlowL1NormHint} field. */
        @NativeType("uint32_t")
        public int meanFlowL1NormHint() { return VkDataGraphPipelineOpticalFlowDispatchInfoARM.nmeanFlowL1NormHint(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDataGraphPipelineOpticalFlowDispatchInfoARM.Buffer sType(@NativeType("VkStructureType") int value) { VkDataGraphPipelineOpticalFlowDispatchInfoARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMDataGraphOpticalFlow#VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_OPTICAL_FLOW_DISPATCH_INFO_ARM STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_OPTICAL_FLOW_DISPATCH_INFO_ARM} value to the {@code sType} field. */
        public VkDataGraphPipelineOpticalFlowDispatchInfoARM.Buffer sType$Default() { return sType(ARMDataGraphOpticalFlow.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_OPTICAL_FLOW_DISPATCH_INFO_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDataGraphPipelineOpticalFlowDispatchInfoARM.Buffer pNext(@NativeType("void *") long value) { VkDataGraphPipelineOpticalFlowDispatchInfoARM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkDataGraphPipelineOpticalFlowDispatchInfoARM.Buffer flags(@NativeType("VkDataGraphOpticalFlowExecuteFlagsARM") int value) { VkDataGraphPipelineOpticalFlowDispatchInfoARM.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code meanFlowL1NormHint} field. */
        public VkDataGraphPipelineOpticalFlowDispatchInfoARM.Buffer meanFlowL1NormHint(@NativeType("uint32_t") int value) { VkDataGraphPipelineOpticalFlowDispatchInfoARM.nmeanFlowL1NormHint(address(), value); return this; }

    }

}