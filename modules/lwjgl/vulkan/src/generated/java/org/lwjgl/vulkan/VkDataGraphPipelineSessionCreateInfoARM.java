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
 * struct VkDataGraphPipelineSessionCreateInfoARM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkDataGraphPipelineSessionCreateFlagsARM flags;
 *     VkPipeline dataGraphPipeline;
 * }}</pre>
 */
public class VkDataGraphPipelineSessionCreateInfoARM extends Struct<VkDataGraphPipelineSessionCreateInfoARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        DATAGRAPHPIPELINE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        DATAGRAPHPIPELINE = layout.offsetof(3);
    }

    protected VkDataGraphPipelineSessionCreateInfoARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDataGraphPipelineSessionCreateInfoARM create(long address, @Nullable ByteBuffer container) {
        return new VkDataGraphPipelineSessionCreateInfoARM(address, container);
    }

    /**
     * Creates a {@code VkDataGraphPipelineSessionCreateInfoARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDataGraphPipelineSessionCreateInfoARM(ByteBuffer container) {
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
    /** @return the value of the {@code flags} field. */
    @NativeType("VkDataGraphPipelineSessionCreateFlagsARM")
    public long flags() { return nflags(address()); }
    /** @return the value of the {@code dataGraphPipeline} field. */
    @NativeType("VkPipeline")
    public long dataGraphPipeline() { return ndataGraphPipeline(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDataGraphPipelineSessionCreateInfoARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMDataGraph#VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_CREATE_INFO_ARM STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_CREATE_INFO_ARM} value to the {@code sType} field. */
    public VkDataGraphPipelineSessionCreateInfoARM sType$Default() { return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_CREATE_INFO_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDataGraphPipelineSessionCreateInfoARM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkDataGraphPipelineSessionCreateInfoARM flags(@NativeType("VkDataGraphPipelineSessionCreateFlagsARM") long value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code dataGraphPipeline} field. */
    public VkDataGraphPipelineSessionCreateInfoARM dataGraphPipeline(@NativeType("VkPipeline") long value) { ndataGraphPipeline(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDataGraphPipelineSessionCreateInfoARM set(
        int sType,
        long pNext,
        long flags,
        long dataGraphPipeline
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
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
    public VkDataGraphPipelineSessionCreateInfoARM set(VkDataGraphPipelineSessionCreateInfoARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDataGraphPipelineSessionCreateInfoARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDataGraphPipelineSessionCreateInfoARM malloc() {
        return new VkDataGraphPipelineSessionCreateInfoARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDataGraphPipelineSessionCreateInfoARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDataGraphPipelineSessionCreateInfoARM calloc() {
        return new VkDataGraphPipelineSessionCreateInfoARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDataGraphPipelineSessionCreateInfoARM} instance allocated with {@link BufferUtils}. */
    public static VkDataGraphPipelineSessionCreateInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDataGraphPipelineSessionCreateInfoARM(memAddress(container), container);
    }

    /** Returns a new {@code VkDataGraphPipelineSessionCreateInfoARM} instance for the specified memory address. */
    public static VkDataGraphPipelineSessionCreateInfoARM create(long address) {
        return new VkDataGraphPipelineSessionCreateInfoARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDataGraphPipelineSessionCreateInfoARM createSafe(long address) {
        return address == NULL ? null : new VkDataGraphPipelineSessionCreateInfoARM(address, null);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineSessionCreateInfoARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineSessionCreateInfoARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineSessionCreateInfoARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineSessionCreateInfoARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineSessionCreateInfoARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineSessionCreateInfoARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDataGraphPipelineSessionCreateInfoARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineSessionCreateInfoARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDataGraphPipelineSessionCreateInfoARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDataGraphPipelineSessionCreateInfoARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDataGraphPipelineSessionCreateInfoARM malloc(MemoryStack stack) {
        return new VkDataGraphPipelineSessionCreateInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDataGraphPipelineSessionCreateInfoARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDataGraphPipelineSessionCreateInfoARM calloc(MemoryStack stack) {
        return new VkDataGraphPipelineSessionCreateInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineSessionCreateInfoARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineSessionCreateInfoARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineSessionCreateInfoARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineSessionCreateInfoARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDataGraphPipelineSessionCreateInfoARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDataGraphPipelineSessionCreateInfoARM.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static long nflags(long struct) { return memGetLong(struct + VkDataGraphPipelineSessionCreateInfoARM.FLAGS); }
    /** Unsafe version of {@link #dataGraphPipeline}. */
    public static long ndataGraphPipeline(long struct) { return memGetLong(struct + VkDataGraphPipelineSessionCreateInfoARM.DATAGRAPHPIPELINE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDataGraphPipelineSessionCreateInfoARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDataGraphPipelineSessionCreateInfoARM.PNEXT, value); }
    /** Unsafe version of {@link #flags(long) flags}. */
    public static void nflags(long struct, long value) { memPutLong(struct + VkDataGraphPipelineSessionCreateInfoARM.FLAGS, value); }
    /** Unsafe version of {@link #dataGraphPipeline(long) dataGraphPipeline}. */
    public static void ndataGraphPipeline(long struct, long value) { memPutLong(struct + VkDataGraphPipelineSessionCreateInfoARM.DATAGRAPHPIPELINE, value); }

    // -----------------------------------

    /** An array of {@link VkDataGraphPipelineSessionCreateInfoARM} structs. */
    public static class Buffer extends StructBuffer<VkDataGraphPipelineSessionCreateInfoARM, Buffer> implements NativeResource {

        private static final VkDataGraphPipelineSessionCreateInfoARM ELEMENT_FACTORY = VkDataGraphPipelineSessionCreateInfoARM.create(-1L);

        /**
         * Creates a new {@code VkDataGraphPipelineSessionCreateInfoARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDataGraphPipelineSessionCreateInfoARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDataGraphPipelineSessionCreateInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDataGraphPipelineSessionCreateInfoARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDataGraphPipelineSessionCreateInfoARM.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkDataGraphPipelineSessionCreateFlagsARM")
        public long flags() { return VkDataGraphPipelineSessionCreateInfoARM.nflags(address()); }
        /** @return the value of the {@code dataGraphPipeline} field. */
        @NativeType("VkPipeline")
        public long dataGraphPipeline() { return VkDataGraphPipelineSessionCreateInfoARM.ndataGraphPipeline(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDataGraphPipelineSessionCreateInfoARM.Buffer sType(@NativeType("VkStructureType") int value) { VkDataGraphPipelineSessionCreateInfoARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMDataGraph#VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_CREATE_INFO_ARM STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_CREATE_INFO_ARM} value to the {@code sType} field. */
        public VkDataGraphPipelineSessionCreateInfoARM.Buffer sType$Default() { return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_CREATE_INFO_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDataGraphPipelineSessionCreateInfoARM.Buffer pNext(@NativeType("void const *") long value) { VkDataGraphPipelineSessionCreateInfoARM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkDataGraphPipelineSessionCreateInfoARM.Buffer flags(@NativeType("VkDataGraphPipelineSessionCreateFlagsARM") long value) { VkDataGraphPipelineSessionCreateInfoARM.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code dataGraphPipeline} field. */
        public VkDataGraphPipelineSessionCreateInfoARM.Buffer dataGraphPipeline(@NativeType("VkPipeline") long value) { VkDataGraphPipelineSessionCreateInfoARM.ndataGraphPipeline(address(), value); return this; }

    }

}