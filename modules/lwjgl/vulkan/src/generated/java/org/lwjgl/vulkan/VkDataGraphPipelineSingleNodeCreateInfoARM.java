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
 * struct VkDataGraphPipelineSingleNodeCreateInfoARM {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkDataGraphPipelineNodeTypeARM nodeType;
 *     uint32_t connectionCount;
 *     {@link VkDataGraphPipelineSingleNodeConnectionARM VkDataGraphPipelineSingleNodeConnectionARM} const * pConnections;
 * }</code></pre>
 */
public class VkDataGraphPipelineSingleNodeCreateInfoARM extends Struct<VkDataGraphPipelineSingleNodeCreateInfoARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        NODETYPE,
        CONNECTIONCOUNT,
        PCONNECTIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        NODETYPE = layout.offsetof(2);
        CONNECTIONCOUNT = layout.offsetof(3);
        PCONNECTIONS = layout.offsetof(4);
    }

    protected VkDataGraphPipelineSingleNodeCreateInfoARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDataGraphPipelineSingleNodeCreateInfoARM create(long address, @Nullable ByteBuffer container) {
        return new VkDataGraphPipelineSingleNodeCreateInfoARM(address, container);
    }

    /**
     * Creates a {@code VkDataGraphPipelineSingleNodeCreateInfoARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDataGraphPipelineSingleNodeCreateInfoARM(ByteBuffer container) {
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
    /** @return the value of the {@code nodeType} field. */
    @NativeType("VkDataGraphPipelineNodeTypeARM")
    public int nodeType() { return nnodeType(address()); }
    /** @return the value of the {@code connectionCount} field. */
    @NativeType("uint32_t")
    public int connectionCount() { return nconnectionCount(address()); }
    /** @return a {@link VkDataGraphPipelineSingleNodeConnectionARM.Buffer} view of the struct array pointed to by the {@code pConnections} field. */
    @NativeType("VkDataGraphPipelineSingleNodeConnectionARM const *")
    public VkDataGraphPipelineSingleNodeConnectionARM.Buffer pConnections() { return npConnections(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDataGraphPipelineSingleNodeCreateInfoARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMDataGraphOpticalFlow#VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SINGLE_NODE_CREATE_INFO_ARM STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SINGLE_NODE_CREATE_INFO_ARM} value to the {@code sType} field. */
    public VkDataGraphPipelineSingleNodeCreateInfoARM sType$Default() { return sType(ARMDataGraphOpticalFlow.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SINGLE_NODE_CREATE_INFO_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDataGraphPipelineSingleNodeCreateInfoARM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code nodeType} field. */
    public VkDataGraphPipelineSingleNodeCreateInfoARM nodeType(@NativeType("VkDataGraphPipelineNodeTypeARM") int value) { nnodeType(address(), value); return this; }
    /** Sets the address of the specified {@link VkDataGraphPipelineSingleNodeConnectionARM.Buffer} to the {@code pConnections} field. */
    public VkDataGraphPipelineSingleNodeCreateInfoARM pConnections(@NativeType("VkDataGraphPipelineSingleNodeConnectionARM const *") VkDataGraphPipelineSingleNodeConnectionARM.Buffer value) { npConnections(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDataGraphPipelineSingleNodeCreateInfoARM set(
        int sType,
        long pNext,
        int nodeType,
        VkDataGraphPipelineSingleNodeConnectionARM.Buffer pConnections
    ) {
        sType(sType);
        pNext(pNext);
        nodeType(nodeType);
        pConnections(pConnections);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDataGraphPipelineSingleNodeCreateInfoARM set(VkDataGraphPipelineSingleNodeCreateInfoARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDataGraphPipelineSingleNodeCreateInfoARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDataGraphPipelineSingleNodeCreateInfoARM malloc() {
        return new VkDataGraphPipelineSingleNodeCreateInfoARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDataGraphPipelineSingleNodeCreateInfoARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDataGraphPipelineSingleNodeCreateInfoARM calloc() {
        return new VkDataGraphPipelineSingleNodeCreateInfoARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDataGraphPipelineSingleNodeCreateInfoARM} instance allocated with {@link BufferUtils}. */
    public static VkDataGraphPipelineSingleNodeCreateInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDataGraphPipelineSingleNodeCreateInfoARM(memAddress(container), container);
    }

    /** Returns a new {@code VkDataGraphPipelineSingleNodeCreateInfoARM} instance for the specified memory address. */
    public static VkDataGraphPipelineSingleNodeCreateInfoARM create(long address) {
        return new VkDataGraphPipelineSingleNodeCreateInfoARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDataGraphPipelineSingleNodeCreateInfoARM createSafe(long address) {
        return address == NULL ? null : new VkDataGraphPipelineSingleNodeCreateInfoARM(address, null);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineSingleNodeCreateInfoARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineSingleNodeCreateInfoARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineSingleNodeCreateInfoARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineSingleNodeCreateInfoARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineSingleNodeCreateInfoARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineSingleNodeCreateInfoARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDataGraphPipelineSingleNodeCreateInfoARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineSingleNodeCreateInfoARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDataGraphPipelineSingleNodeCreateInfoARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDataGraphPipelineSingleNodeCreateInfoARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDataGraphPipelineSingleNodeCreateInfoARM malloc(MemoryStack stack) {
        return new VkDataGraphPipelineSingleNodeCreateInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDataGraphPipelineSingleNodeCreateInfoARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDataGraphPipelineSingleNodeCreateInfoARM calloc(MemoryStack stack) {
        return new VkDataGraphPipelineSingleNodeCreateInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineSingleNodeCreateInfoARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineSingleNodeCreateInfoARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineSingleNodeCreateInfoARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineSingleNodeCreateInfoARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDataGraphPipelineSingleNodeCreateInfoARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDataGraphPipelineSingleNodeCreateInfoARM.PNEXT); }
    /** Unsafe version of {@link #nodeType}. */
    public static int nnodeType(long struct) { return memGetInt(struct + VkDataGraphPipelineSingleNodeCreateInfoARM.NODETYPE); }
    /** Unsafe version of {@link #connectionCount}. */
    public static int nconnectionCount(long struct) { return memGetInt(struct + VkDataGraphPipelineSingleNodeCreateInfoARM.CONNECTIONCOUNT); }
    /** Unsafe version of {@link #pConnections}. */
    public static VkDataGraphPipelineSingleNodeConnectionARM.Buffer npConnections(long struct) { return VkDataGraphPipelineSingleNodeConnectionARM.create(memGetAddress(struct + VkDataGraphPipelineSingleNodeCreateInfoARM.PCONNECTIONS), nconnectionCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDataGraphPipelineSingleNodeCreateInfoARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDataGraphPipelineSingleNodeCreateInfoARM.PNEXT, value); }
    /** Unsafe version of {@link #nodeType(int) nodeType}. */
    public static void nnodeType(long struct, int value) { memPutInt(struct + VkDataGraphPipelineSingleNodeCreateInfoARM.NODETYPE, value); }
    /** Sets the specified value to the {@code connectionCount} field of the specified {@code struct}. */
    public static void nconnectionCount(long struct, int value) { memPutInt(struct + VkDataGraphPipelineSingleNodeCreateInfoARM.CONNECTIONCOUNT, value); }
    /** Unsafe version of {@link #pConnections(VkDataGraphPipelineSingleNodeConnectionARM.Buffer) pConnections}. */
    public static void npConnections(long struct, VkDataGraphPipelineSingleNodeConnectionARM.Buffer value) { memPutAddress(struct + VkDataGraphPipelineSingleNodeCreateInfoARM.PCONNECTIONS, value.address()); nconnectionCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkDataGraphPipelineSingleNodeCreateInfoARM.PCONNECTIONS));
    }

    // -----------------------------------

    /** An array of {@link VkDataGraphPipelineSingleNodeCreateInfoARM} structs. */
    public static class Buffer extends StructBuffer<VkDataGraphPipelineSingleNodeCreateInfoARM, Buffer> implements NativeResource {

        private static final VkDataGraphPipelineSingleNodeCreateInfoARM ELEMENT_FACTORY = VkDataGraphPipelineSingleNodeCreateInfoARM.create(-1L);

        /**
         * Creates a new {@code VkDataGraphPipelineSingleNodeCreateInfoARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDataGraphPipelineSingleNodeCreateInfoARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDataGraphPipelineSingleNodeCreateInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDataGraphPipelineSingleNodeCreateInfoARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkDataGraphPipelineSingleNodeCreateInfoARM.npNext(address()); }
        /** @return the value of the {@code nodeType} field. */
        @NativeType("VkDataGraphPipelineNodeTypeARM")
        public int nodeType() { return VkDataGraphPipelineSingleNodeCreateInfoARM.nnodeType(address()); }
        /** @return the value of the {@code connectionCount} field. */
        @NativeType("uint32_t")
        public int connectionCount() { return VkDataGraphPipelineSingleNodeCreateInfoARM.nconnectionCount(address()); }
        /** @return a {@link VkDataGraphPipelineSingleNodeConnectionARM.Buffer} view of the struct array pointed to by the {@code pConnections} field. */
        @NativeType("VkDataGraphPipelineSingleNodeConnectionARM const *")
        public VkDataGraphPipelineSingleNodeConnectionARM.Buffer pConnections() { return VkDataGraphPipelineSingleNodeCreateInfoARM.npConnections(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDataGraphPipelineSingleNodeCreateInfoARM.Buffer sType(@NativeType("VkStructureType") int value) { VkDataGraphPipelineSingleNodeCreateInfoARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMDataGraphOpticalFlow#VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SINGLE_NODE_CREATE_INFO_ARM STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SINGLE_NODE_CREATE_INFO_ARM} value to the {@code sType} field. */
        public VkDataGraphPipelineSingleNodeCreateInfoARM.Buffer sType$Default() { return sType(ARMDataGraphOpticalFlow.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SINGLE_NODE_CREATE_INFO_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDataGraphPipelineSingleNodeCreateInfoARM.Buffer pNext(@NativeType("void *") long value) { VkDataGraphPipelineSingleNodeCreateInfoARM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code nodeType} field. */
        public VkDataGraphPipelineSingleNodeCreateInfoARM.Buffer nodeType(@NativeType("VkDataGraphPipelineNodeTypeARM") int value) { VkDataGraphPipelineSingleNodeCreateInfoARM.nnodeType(address(), value); return this; }
        /** Sets the address of the specified {@link VkDataGraphPipelineSingleNodeConnectionARM.Buffer} to the {@code pConnections} field. */
        public VkDataGraphPipelineSingleNodeCreateInfoARM.Buffer pConnections(@NativeType("VkDataGraphPipelineSingleNodeConnectionARM const *") VkDataGraphPipelineSingleNodeConnectionARM.Buffer value) { VkDataGraphPipelineSingleNodeCreateInfoARM.npConnections(address(), value); return this; }

    }

}