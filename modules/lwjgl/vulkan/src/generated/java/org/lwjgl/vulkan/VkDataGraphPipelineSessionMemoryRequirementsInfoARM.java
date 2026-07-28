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
 * struct VkDataGraphPipelineSessionMemoryRequirementsInfoARM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkDataGraphPipelineSessionARM session;
 *     VkDataGraphPipelineSessionBindPointARM bindPoint;
 *     uint32_t objectIndex;
 * }}</pre>
 */
public class VkDataGraphPipelineSessionMemoryRequirementsInfoARM extends Struct<VkDataGraphPipelineSessionMemoryRequirementsInfoARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SESSION,
        BINDPOINT,
        OBJECTINDEX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SESSION = layout.offsetof(2);
        BINDPOINT = layout.offsetof(3);
        OBJECTINDEX = layout.offsetof(4);
    }

    protected VkDataGraphPipelineSessionMemoryRequirementsInfoARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDataGraphPipelineSessionMemoryRequirementsInfoARM create(long address, @Nullable ByteBuffer container) {
        return new VkDataGraphPipelineSessionMemoryRequirementsInfoARM(address, container);
    }

    /**
     * Creates a {@code VkDataGraphPipelineSessionMemoryRequirementsInfoARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM(ByteBuffer container) {
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
    /** @return the value of the {@code session} field. */
    @NativeType("VkDataGraphPipelineSessionARM")
    public long session() { return nsession(address()); }
    /** @return the value of the {@code bindPoint} field. */
    @NativeType("VkDataGraphPipelineSessionBindPointARM")
    public int bindPoint() { return nbindPoint(address()); }
    /** @return the value of the {@code objectIndex} field. */
    @NativeType("uint32_t")
    public int objectIndex() { return nobjectIndex(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMDataGraph#VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_MEMORY_REQUIREMENTS_INFO_ARM STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_MEMORY_REQUIREMENTS_INFO_ARM} value to the {@code sType} field. */
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM sType$Default() { return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_MEMORY_REQUIREMENTS_INFO_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code session} field. */
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM session(@NativeType("VkDataGraphPipelineSessionARM") long value) { nsession(address(), value); return this; }
    /** Sets the specified value to the {@code bindPoint} field. */
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM bindPoint(@NativeType("VkDataGraphPipelineSessionBindPointARM") int value) { nbindPoint(address(), value); return this; }
    /** Sets the specified value to the {@code objectIndex} field. */
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM objectIndex(@NativeType("uint32_t") int value) { nobjectIndex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM set(
        int sType,
        long pNext,
        long session,
        int bindPoint,
        int objectIndex
    ) {
        sType(sType);
        pNext(pNext);
        session(session);
        bindPoint(bindPoint);
        objectIndex(objectIndex);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDataGraphPipelineSessionMemoryRequirementsInfoARM set(VkDataGraphPipelineSessionMemoryRequirementsInfoARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDataGraphPipelineSessionMemoryRequirementsInfoARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDataGraphPipelineSessionMemoryRequirementsInfoARM malloc() {
        return new VkDataGraphPipelineSessionMemoryRequirementsInfoARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDataGraphPipelineSessionMemoryRequirementsInfoARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDataGraphPipelineSessionMemoryRequirementsInfoARM calloc() {
        return new VkDataGraphPipelineSessionMemoryRequirementsInfoARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDataGraphPipelineSessionMemoryRequirementsInfoARM} instance allocated with {@link BufferUtils}. */
    public static VkDataGraphPipelineSessionMemoryRequirementsInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDataGraphPipelineSessionMemoryRequirementsInfoARM(memAddress(container), container);
    }

    /** Returns a new {@code VkDataGraphPipelineSessionMemoryRequirementsInfoARM} instance for the specified memory address. */
    public static VkDataGraphPipelineSessionMemoryRequirementsInfoARM create(long address) {
        return new VkDataGraphPipelineSessionMemoryRequirementsInfoARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDataGraphPipelineSessionMemoryRequirementsInfoARM createSafe(long address) {
        return address == NULL ? null : new VkDataGraphPipelineSessionMemoryRequirementsInfoARM(address, null);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineSessionMemoryRequirementsInfoARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineSessionMemoryRequirementsInfoARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineSessionMemoryRequirementsInfoARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineSessionMemoryRequirementsInfoARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineSessionMemoryRequirementsInfoARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineSessionMemoryRequirementsInfoARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDataGraphPipelineSessionMemoryRequirementsInfoARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineSessionMemoryRequirementsInfoARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDataGraphPipelineSessionMemoryRequirementsInfoARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDataGraphPipelineSessionMemoryRequirementsInfoARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDataGraphPipelineSessionMemoryRequirementsInfoARM malloc(MemoryStack stack) {
        return new VkDataGraphPipelineSessionMemoryRequirementsInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDataGraphPipelineSessionMemoryRequirementsInfoARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDataGraphPipelineSessionMemoryRequirementsInfoARM calloc(MemoryStack stack) {
        return new VkDataGraphPipelineSessionMemoryRequirementsInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineSessionMemoryRequirementsInfoARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineSessionMemoryRequirementsInfoARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineSessionMemoryRequirementsInfoARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineSessionMemoryRequirementsInfoARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDataGraphPipelineSessionMemoryRequirementsInfoARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDataGraphPipelineSessionMemoryRequirementsInfoARM.PNEXT); }
    /** Unsafe version of {@link #session}. */
    public static long nsession(long struct) { return memGetLong(struct + VkDataGraphPipelineSessionMemoryRequirementsInfoARM.SESSION); }
    /** Unsafe version of {@link #bindPoint}. */
    public static int nbindPoint(long struct) { return memGetInt(struct + VkDataGraphPipelineSessionMemoryRequirementsInfoARM.BINDPOINT); }
    /** Unsafe version of {@link #objectIndex}. */
    public static int nobjectIndex(long struct) { return memGetInt(struct + VkDataGraphPipelineSessionMemoryRequirementsInfoARM.OBJECTINDEX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDataGraphPipelineSessionMemoryRequirementsInfoARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDataGraphPipelineSessionMemoryRequirementsInfoARM.PNEXT, value); }
    /** Unsafe version of {@link #session(long) session}. */
    public static void nsession(long struct, long value) { memPutLong(struct + VkDataGraphPipelineSessionMemoryRequirementsInfoARM.SESSION, value); }
    /** Unsafe version of {@link #bindPoint(int) bindPoint}. */
    public static void nbindPoint(long struct, int value) { memPutInt(struct + VkDataGraphPipelineSessionMemoryRequirementsInfoARM.BINDPOINT, value); }
    /** Unsafe version of {@link #objectIndex(int) objectIndex}. */
    public static void nobjectIndex(long struct, int value) { memPutInt(struct + VkDataGraphPipelineSessionMemoryRequirementsInfoARM.OBJECTINDEX, value); }

    // -----------------------------------

    /** An array of {@link VkDataGraphPipelineSessionMemoryRequirementsInfoARM} structs. */
    public static class Buffer extends StructBuffer<VkDataGraphPipelineSessionMemoryRequirementsInfoARM, Buffer> implements NativeResource {

        private static final VkDataGraphPipelineSessionMemoryRequirementsInfoARM ELEMENT_FACTORY = VkDataGraphPipelineSessionMemoryRequirementsInfoARM.create(-1L);

        /**
         * Creates a new {@code VkDataGraphPipelineSessionMemoryRequirementsInfoARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDataGraphPipelineSessionMemoryRequirementsInfoARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDataGraphPipelineSessionMemoryRequirementsInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDataGraphPipelineSessionMemoryRequirementsInfoARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDataGraphPipelineSessionMemoryRequirementsInfoARM.npNext(address()); }
        /** @return the value of the {@code session} field. */
        @NativeType("VkDataGraphPipelineSessionARM")
        public long session() { return VkDataGraphPipelineSessionMemoryRequirementsInfoARM.nsession(address()); }
        /** @return the value of the {@code bindPoint} field. */
        @NativeType("VkDataGraphPipelineSessionBindPointARM")
        public int bindPoint() { return VkDataGraphPipelineSessionMemoryRequirementsInfoARM.nbindPoint(address()); }
        /** @return the value of the {@code objectIndex} field. */
        @NativeType("uint32_t")
        public int objectIndex() { return VkDataGraphPipelineSessionMemoryRequirementsInfoARM.nobjectIndex(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDataGraphPipelineSessionMemoryRequirementsInfoARM.Buffer sType(@NativeType("VkStructureType") int value) { VkDataGraphPipelineSessionMemoryRequirementsInfoARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMDataGraph#VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_MEMORY_REQUIREMENTS_INFO_ARM STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_MEMORY_REQUIREMENTS_INFO_ARM} value to the {@code sType} field. */
        public VkDataGraphPipelineSessionMemoryRequirementsInfoARM.Buffer sType$Default() { return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_MEMORY_REQUIREMENTS_INFO_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDataGraphPipelineSessionMemoryRequirementsInfoARM.Buffer pNext(@NativeType("void const *") long value) { VkDataGraphPipelineSessionMemoryRequirementsInfoARM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code session} field. */
        public VkDataGraphPipelineSessionMemoryRequirementsInfoARM.Buffer session(@NativeType("VkDataGraphPipelineSessionARM") long value) { VkDataGraphPipelineSessionMemoryRequirementsInfoARM.nsession(address(), value); return this; }
        /** Sets the specified value to the {@code bindPoint} field. */
        public VkDataGraphPipelineSessionMemoryRequirementsInfoARM.Buffer bindPoint(@NativeType("VkDataGraphPipelineSessionBindPointARM") int value) { VkDataGraphPipelineSessionMemoryRequirementsInfoARM.nbindPoint(address(), value); return this; }
        /** Sets the specified value to the {@code objectIndex} field. */
        public VkDataGraphPipelineSessionMemoryRequirementsInfoARM.Buffer objectIndex(@NativeType("uint32_t") int value) { VkDataGraphPipelineSessionMemoryRequirementsInfoARM.nobjectIndex(address(), value); return this; }

    }

}