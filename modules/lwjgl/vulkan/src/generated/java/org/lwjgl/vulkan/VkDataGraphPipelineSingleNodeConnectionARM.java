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
 * struct VkDataGraphPipelineSingleNodeConnectionARM {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t set;
 *     uint32_t binding;
 *     VkDataGraphPipelineNodeConnectionTypeARM connection;
 * }}</pre>
 */
public class VkDataGraphPipelineSingleNodeConnectionARM extends Struct<VkDataGraphPipelineSingleNodeConnectionARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SET,
        BINDING,
        CONNECTION;

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
        SET = layout.offsetof(2);
        BINDING = layout.offsetof(3);
        CONNECTION = layout.offsetof(4);
    }

    protected VkDataGraphPipelineSingleNodeConnectionARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDataGraphPipelineSingleNodeConnectionARM create(long address, @Nullable ByteBuffer container) {
        return new VkDataGraphPipelineSingleNodeConnectionARM(address, container);
    }

    /**
     * Creates a {@code VkDataGraphPipelineSingleNodeConnectionARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDataGraphPipelineSingleNodeConnectionARM(ByteBuffer container) {
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
    /** @return the value of the {@code set} field. */
    @NativeType("uint32_t")
    public int set() { return nset(address()); }
    /** @return the value of the {@code binding} field. */
    @NativeType("uint32_t")
    public int binding() { return nbinding(address()); }
    /** @return the value of the {@code connection} field. */
    @NativeType("VkDataGraphPipelineNodeConnectionTypeARM")
    public int connection() { return nconnection(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDataGraphPipelineSingleNodeConnectionARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMDataGraphOpticalFlow#VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SINGLE_NODE_CONNECTION_ARM STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SINGLE_NODE_CONNECTION_ARM} value to the {@code sType} field. */
    public VkDataGraphPipelineSingleNodeConnectionARM sType$Default() { return sType(ARMDataGraphOpticalFlow.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SINGLE_NODE_CONNECTION_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDataGraphPipelineSingleNodeConnectionARM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code set} field. */
    public VkDataGraphPipelineSingleNodeConnectionARM set(@NativeType("uint32_t") int value) { nset(address(), value); return this; }
    /** Sets the specified value to the {@code binding} field. */
    public VkDataGraphPipelineSingleNodeConnectionARM binding(@NativeType("uint32_t") int value) { nbinding(address(), value); return this; }
    /** Sets the specified value to the {@code connection} field. */
    public VkDataGraphPipelineSingleNodeConnectionARM connection(@NativeType("VkDataGraphPipelineNodeConnectionTypeARM") int value) { nconnection(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDataGraphPipelineSingleNodeConnectionARM set(
        int sType,
        long pNext,
        int set,
        int binding,
        int connection
    ) {
        sType(sType);
        pNext(pNext);
        set(set);
        binding(binding);
        connection(connection);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDataGraphPipelineSingleNodeConnectionARM set(VkDataGraphPipelineSingleNodeConnectionARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDataGraphPipelineSingleNodeConnectionARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDataGraphPipelineSingleNodeConnectionARM malloc() {
        return new VkDataGraphPipelineSingleNodeConnectionARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDataGraphPipelineSingleNodeConnectionARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDataGraphPipelineSingleNodeConnectionARM calloc() {
        return new VkDataGraphPipelineSingleNodeConnectionARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDataGraphPipelineSingleNodeConnectionARM} instance allocated with {@link BufferUtils}. */
    public static VkDataGraphPipelineSingleNodeConnectionARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDataGraphPipelineSingleNodeConnectionARM(memAddress(container), container);
    }

    /** Returns a new {@code VkDataGraphPipelineSingleNodeConnectionARM} instance for the specified memory address. */
    public static VkDataGraphPipelineSingleNodeConnectionARM create(long address) {
        return new VkDataGraphPipelineSingleNodeConnectionARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDataGraphPipelineSingleNodeConnectionARM createSafe(long address) {
        return address == NULL ? null : new VkDataGraphPipelineSingleNodeConnectionARM(address, null);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineSingleNodeConnectionARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineSingleNodeConnectionARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineSingleNodeConnectionARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineSingleNodeConnectionARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineSingleNodeConnectionARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineSingleNodeConnectionARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDataGraphPipelineSingleNodeConnectionARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineSingleNodeConnectionARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDataGraphPipelineSingleNodeConnectionARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDataGraphPipelineSingleNodeConnectionARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDataGraphPipelineSingleNodeConnectionARM malloc(MemoryStack stack) {
        return new VkDataGraphPipelineSingleNodeConnectionARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDataGraphPipelineSingleNodeConnectionARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDataGraphPipelineSingleNodeConnectionARM calloc(MemoryStack stack) {
        return new VkDataGraphPipelineSingleNodeConnectionARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineSingleNodeConnectionARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineSingleNodeConnectionARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineSingleNodeConnectionARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineSingleNodeConnectionARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDataGraphPipelineSingleNodeConnectionARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDataGraphPipelineSingleNodeConnectionARM.PNEXT); }
    /** Unsafe version of {@link #set}. */
    public static int nset(long struct) { return memGetInt(struct + VkDataGraphPipelineSingleNodeConnectionARM.SET); }
    /** Unsafe version of {@link #binding}. */
    public static int nbinding(long struct) { return memGetInt(struct + VkDataGraphPipelineSingleNodeConnectionARM.BINDING); }
    /** Unsafe version of {@link #connection}. */
    public static int nconnection(long struct) { return memGetInt(struct + VkDataGraphPipelineSingleNodeConnectionARM.CONNECTION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDataGraphPipelineSingleNodeConnectionARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDataGraphPipelineSingleNodeConnectionARM.PNEXT, value); }
    /** Unsafe version of {@link #set(int) set}. */
    public static void nset(long struct, int value) { memPutInt(struct + VkDataGraphPipelineSingleNodeConnectionARM.SET, value); }
    /** Unsafe version of {@link #binding(int) binding}. */
    public static void nbinding(long struct, int value) { memPutInt(struct + VkDataGraphPipelineSingleNodeConnectionARM.BINDING, value); }
    /** Unsafe version of {@link #connection(int) connection}. */
    public static void nconnection(long struct, int value) { memPutInt(struct + VkDataGraphPipelineSingleNodeConnectionARM.CONNECTION, value); }

    // -----------------------------------

    /** An array of {@link VkDataGraphPipelineSingleNodeConnectionARM} structs. */
    public static class Buffer extends StructBuffer<VkDataGraphPipelineSingleNodeConnectionARM, Buffer> implements NativeResource {

        private static final VkDataGraphPipelineSingleNodeConnectionARM ELEMENT_FACTORY = VkDataGraphPipelineSingleNodeConnectionARM.create(-1L);

        /**
         * Creates a new {@code VkDataGraphPipelineSingleNodeConnectionARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDataGraphPipelineSingleNodeConnectionARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDataGraphPipelineSingleNodeConnectionARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDataGraphPipelineSingleNodeConnectionARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkDataGraphPipelineSingleNodeConnectionARM.npNext(address()); }
        /** @return the value of the {@code set} field. */
        @NativeType("uint32_t")
        public int set() { return VkDataGraphPipelineSingleNodeConnectionARM.nset(address()); }
        /** @return the value of the {@code binding} field. */
        @NativeType("uint32_t")
        public int binding() { return VkDataGraphPipelineSingleNodeConnectionARM.nbinding(address()); }
        /** @return the value of the {@code connection} field. */
        @NativeType("VkDataGraphPipelineNodeConnectionTypeARM")
        public int connection() { return VkDataGraphPipelineSingleNodeConnectionARM.nconnection(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDataGraphPipelineSingleNodeConnectionARM.Buffer sType(@NativeType("VkStructureType") int value) { VkDataGraphPipelineSingleNodeConnectionARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMDataGraphOpticalFlow#VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SINGLE_NODE_CONNECTION_ARM STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SINGLE_NODE_CONNECTION_ARM} value to the {@code sType} field. */
        public VkDataGraphPipelineSingleNodeConnectionARM.Buffer sType$Default() { return sType(ARMDataGraphOpticalFlow.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SINGLE_NODE_CONNECTION_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDataGraphPipelineSingleNodeConnectionARM.Buffer pNext(@NativeType("void *") long value) { VkDataGraphPipelineSingleNodeConnectionARM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code set} field. */
        public VkDataGraphPipelineSingleNodeConnectionARM.Buffer set(@NativeType("uint32_t") int value) { VkDataGraphPipelineSingleNodeConnectionARM.nset(address(), value); return this; }
        /** Sets the specified value to the {@code binding} field. */
        public VkDataGraphPipelineSingleNodeConnectionARM.Buffer binding(@NativeType("uint32_t") int value) { VkDataGraphPipelineSingleNodeConnectionARM.nbinding(address(), value); return this; }
        /** Sets the specified value to the {@code connection} field. */
        public VkDataGraphPipelineSingleNodeConnectionARM.Buffer connection(@NativeType("VkDataGraphPipelineNodeConnectionTypeARM") int value) { VkDataGraphPipelineSingleNodeConnectionARM.nconnection(address(), value); return this; }

    }

}