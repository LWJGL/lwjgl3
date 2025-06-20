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
 * struct VkDataGraphPipelineDispatchInfoARM {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkDataGraphPipelineDispatchFlagsARM flags;
 * }}</pre>
 */
public class VkDataGraphPipelineDispatchInfoARM extends Struct<VkDataGraphPipelineDispatchInfoARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS;

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
        FLAGS = layout.offsetof(2);
    }

    protected VkDataGraphPipelineDispatchInfoARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDataGraphPipelineDispatchInfoARM create(long address, @Nullable ByteBuffer container) {
        return new VkDataGraphPipelineDispatchInfoARM(address, container);
    }

    /**
     * Creates a {@code VkDataGraphPipelineDispatchInfoARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDataGraphPipelineDispatchInfoARM(ByteBuffer container) {
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
    @NativeType("VkDataGraphPipelineDispatchFlagsARM")
    public long flags() { return nflags(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDataGraphPipelineDispatchInfoARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMDataGraph#VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_DISPATCH_INFO_ARM STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_DISPATCH_INFO_ARM} value to the {@code sType} field. */
    public VkDataGraphPipelineDispatchInfoARM sType$Default() { return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_DISPATCH_INFO_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDataGraphPipelineDispatchInfoARM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkDataGraphPipelineDispatchInfoARM flags(@NativeType("VkDataGraphPipelineDispatchFlagsARM") long value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDataGraphPipelineDispatchInfoARM set(
        int sType,
        long pNext,
        long flags
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDataGraphPipelineDispatchInfoARM set(VkDataGraphPipelineDispatchInfoARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDataGraphPipelineDispatchInfoARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDataGraphPipelineDispatchInfoARM malloc() {
        return new VkDataGraphPipelineDispatchInfoARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDataGraphPipelineDispatchInfoARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDataGraphPipelineDispatchInfoARM calloc() {
        return new VkDataGraphPipelineDispatchInfoARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDataGraphPipelineDispatchInfoARM} instance allocated with {@link BufferUtils}. */
    public static VkDataGraphPipelineDispatchInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDataGraphPipelineDispatchInfoARM(memAddress(container), container);
    }

    /** Returns a new {@code VkDataGraphPipelineDispatchInfoARM} instance for the specified memory address. */
    public static VkDataGraphPipelineDispatchInfoARM create(long address) {
        return new VkDataGraphPipelineDispatchInfoARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDataGraphPipelineDispatchInfoARM createSafe(long address) {
        return address == NULL ? null : new VkDataGraphPipelineDispatchInfoARM(address, null);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineDispatchInfoARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineDispatchInfoARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineDispatchInfoARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineDispatchInfoARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineDispatchInfoARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineDispatchInfoARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDataGraphPipelineDispatchInfoARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineDispatchInfoARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDataGraphPipelineDispatchInfoARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDataGraphPipelineDispatchInfoARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDataGraphPipelineDispatchInfoARM malloc(MemoryStack stack) {
        return new VkDataGraphPipelineDispatchInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDataGraphPipelineDispatchInfoARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDataGraphPipelineDispatchInfoARM calloc(MemoryStack stack) {
        return new VkDataGraphPipelineDispatchInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineDispatchInfoARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineDispatchInfoARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineDispatchInfoARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineDispatchInfoARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDataGraphPipelineDispatchInfoARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDataGraphPipelineDispatchInfoARM.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static long nflags(long struct) { return memGetLong(struct + VkDataGraphPipelineDispatchInfoARM.FLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDataGraphPipelineDispatchInfoARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDataGraphPipelineDispatchInfoARM.PNEXT, value); }
    /** Unsafe version of {@link #flags(long) flags}. */
    public static void nflags(long struct, long value) { memPutLong(struct + VkDataGraphPipelineDispatchInfoARM.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link VkDataGraphPipelineDispatchInfoARM} structs. */
    public static class Buffer extends StructBuffer<VkDataGraphPipelineDispatchInfoARM, Buffer> implements NativeResource {

        private static final VkDataGraphPipelineDispatchInfoARM ELEMENT_FACTORY = VkDataGraphPipelineDispatchInfoARM.create(-1L);

        /**
         * Creates a new {@code VkDataGraphPipelineDispatchInfoARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDataGraphPipelineDispatchInfoARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDataGraphPipelineDispatchInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDataGraphPipelineDispatchInfoARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkDataGraphPipelineDispatchInfoARM.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkDataGraphPipelineDispatchFlagsARM")
        public long flags() { return VkDataGraphPipelineDispatchInfoARM.nflags(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDataGraphPipelineDispatchInfoARM.Buffer sType(@NativeType("VkStructureType") int value) { VkDataGraphPipelineDispatchInfoARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMDataGraph#VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_DISPATCH_INFO_ARM STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_DISPATCH_INFO_ARM} value to the {@code sType} field. */
        public VkDataGraphPipelineDispatchInfoARM.Buffer sType$Default() { return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_DISPATCH_INFO_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDataGraphPipelineDispatchInfoARM.Buffer pNext(@NativeType("void *") long value) { VkDataGraphPipelineDispatchInfoARM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkDataGraphPipelineDispatchInfoARM.Buffer flags(@NativeType("VkDataGraphPipelineDispatchFlagsARM") long value) { VkDataGraphPipelineDispatchInfoARM.nflags(address(), value); return this; }

    }

}