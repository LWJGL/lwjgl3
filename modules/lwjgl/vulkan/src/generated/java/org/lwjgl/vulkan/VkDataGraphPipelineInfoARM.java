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
 * struct VkDataGraphPipelineInfoARM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkPipeline dataGraphPipeline;
 * }}</pre>
 */
public class VkDataGraphPipelineInfoARM extends Struct<VkDataGraphPipelineInfoARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DATAGRAPHPIPELINE;

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
        DATAGRAPHPIPELINE = layout.offsetof(2);
    }

    protected VkDataGraphPipelineInfoARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDataGraphPipelineInfoARM create(long address, @Nullable ByteBuffer container) {
        return new VkDataGraphPipelineInfoARM(address, container);
    }

    /**
     * Creates a {@code VkDataGraphPipelineInfoARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDataGraphPipelineInfoARM(ByteBuffer container) {
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
    /** @return the value of the {@code dataGraphPipeline} field. */
    @NativeType("VkPipeline")
    public long dataGraphPipeline() { return ndataGraphPipeline(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDataGraphPipelineInfoARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMDataGraph#VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_INFO_ARM STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_INFO_ARM} value to the {@code sType} field. */
    public VkDataGraphPipelineInfoARM sType$Default() { return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_INFO_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDataGraphPipelineInfoARM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code dataGraphPipeline} field. */
    public VkDataGraphPipelineInfoARM dataGraphPipeline(@NativeType("VkPipeline") long value) { ndataGraphPipeline(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDataGraphPipelineInfoARM set(
        int sType,
        long pNext,
        long dataGraphPipeline
    ) {
        sType(sType);
        pNext(pNext);
        dataGraphPipeline(dataGraphPipeline);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDataGraphPipelineInfoARM set(VkDataGraphPipelineInfoARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDataGraphPipelineInfoARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDataGraphPipelineInfoARM malloc() {
        return new VkDataGraphPipelineInfoARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDataGraphPipelineInfoARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDataGraphPipelineInfoARM calloc() {
        return new VkDataGraphPipelineInfoARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDataGraphPipelineInfoARM} instance allocated with {@link BufferUtils}. */
    public static VkDataGraphPipelineInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDataGraphPipelineInfoARM(memAddress(container), container);
    }

    /** Returns a new {@code VkDataGraphPipelineInfoARM} instance for the specified memory address. */
    public static VkDataGraphPipelineInfoARM create(long address) {
        return new VkDataGraphPipelineInfoARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDataGraphPipelineInfoARM createSafe(long address) {
        return address == NULL ? null : new VkDataGraphPipelineInfoARM(address, null);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineInfoARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineInfoARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineInfoARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineInfoARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineInfoARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineInfoARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDataGraphPipelineInfoARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineInfoARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDataGraphPipelineInfoARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDataGraphPipelineInfoARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDataGraphPipelineInfoARM malloc(MemoryStack stack) {
        return new VkDataGraphPipelineInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDataGraphPipelineInfoARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDataGraphPipelineInfoARM calloc(MemoryStack stack) {
        return new VkDataGraphPipelineInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineInfoARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineInfoARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineInfoARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineInfoARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDataGraphPipelineInfoARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDataGraphPipelineInfoARM.PNEXT); }
    /** Unsafe version of {@link #dataGraphPipeline}. */
    public static long ndataGraphPipeline(long struct) { return memGetLong(struct + VkDataGraphPipelineInfoARM.DATAGRAPHPIPELINE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDataGraphPipelineInfoARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDataGraphPipelineInfoARM.PNEXT, value); }
    /** Unsafe version of {@link #dataGraphPipeline(long) dataGraphPipeline}. */
    public static void ndataGraphPipeline(long struct, long value) { memPutLong(struct + VkDataGraphPipelineInfoARM.DATAGRAPHPIPELINE, value); }

    // -----------------------------------

    /** An array of {@link VkDataGraphPipelineInfoARM} structs. */
    public static class Buffer extends StructBuffer<VkDataGraphPipelineInfoARM, Buffer> implements NativeResource {

        private static final VkDataGraphPipelineInfoARM ELEMENT_FACTORY = VkDataGraphPipelineInfoARM.create(-1L);

        /**
         * Creates a new {@code VkDataGraphPipelineInfoARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDataGraphPipelineInfoARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDataGraphPipelineInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDataGraphPipelineInfoARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDataGraphPipelineInfoARM.npNext(address()); }
        /** @return the value of the {@code dataGraphPipeline} field. */
        @NativeType("VkPipeline")
        public long dataGraphPipeline() { return VkDataGraphPipelineInfoARM.ndataGraphPipeline(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDataGraphPipelineInfoARM.Buffer sType(@NativeType("VkStructureType") int value) { VkDataGraphPipelineInfoARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMDataGraph#VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_INFO_ARM STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_INFO_ARM} value to the {@code sType} field. */
        public VkDataGraphPipelineInfoARM.Buffer sType$Default() { return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_INFO_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDataGraphPipelineInfoARM.Buffer pNext(@NativeType("void const *") long value) { VkDataGraphPipelineInfoARM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code dataGraphPipeline} field. */
        public VkDataGraphPipelineInfoARM.Buffer dataGraphPipeline(@NativeType("VkPipeline") long value) { VkDataGraphPipelineInfoARM.ndataGraphPipeline(address(), value); return this; }

    }

}