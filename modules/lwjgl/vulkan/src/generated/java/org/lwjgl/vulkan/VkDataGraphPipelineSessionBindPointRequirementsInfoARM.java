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
 * struct VkDataGraphPipelineSessionBindPointRequirementsInfoARM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkDataGraphPipelineSessionARM session;
 * }}</pre>
 */
public class VkDataGraphPipelineSessionBindPointRequirementsInfoARM extends Struct<VkDataGraphPipelineSessionBindPointRequirementsInfoARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SESSION;

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
        SESSION = layout.offsetof(2);
    }

    protected VkDataGraphPipelineSessionBindPointRequirementsInfoARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDataGraphPipelineSessionBindPointRequirementsInfoARM create(long address, @Nullable ByteBuffer container) {
        return new VkDataGraphPipelineSessionBindPointRequirementsInfoARM(address, container);
    }

    /**
     * Creates a {@code VkDataGraphPipelineSessionBindPointRequirementsInfoARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM(ByteBuffer container) {
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

    /** Sets the specified value to the {@code sType} field. */
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMDataGraph#VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_BIND_POINT_REQUIREMENTS_INFO_ARM STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_BIND_POINT_REQUIREMENTS_INFO_ARM} value to the {@code sType} field. */
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM sType$Default() { return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_BIND_POINT_REQUIREMENTS_INFO_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code session} field. */
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM session(@NativeType("VkDataGraphPipelineSessionARM") long value) { nsession(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM set(
        int sType,
        long pNext,
        long session
    ) {
        sType(sType);
        pNext(pNext);
        session(session);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM set(VkDataGraphPipelineSessionBindPointRequirementsInfoARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDataGraphPipelineSessionBindPointRequirementsInfoARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDataGraphPipelineSessionBindPointRequirementsInfoARM malloc() {
        return new VkDataGraphPipelineSessionBindPointRequirementsInfoARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDataGraphPipelineSessionBindPointRequirementsInfoARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDataGraphPipelineSessionBindPointRequirementsInfoARM calloc() {
        return new VkDataGraphPipelineSessionBindPointRequirementsInfoARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDataGraphPipelineSessionBindPointRequirementsInfoARM} instance allocated with {@link BufferUtils}. */
    public static VkDataGraphPipelineSessionBindPointRequirementsInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDataGraphPipelineSessionBindPointRequirementsInfoARM(memAddress(container), container);
    }

    /** Returns a new {@code VkDataGraphPipelineSessionBindPointRequirementsInfoARM} instance for the specified memory address. */
    public static VkDataGraphPipelineSessionBindPointRequirementsInfoARM create(long address) {
        return new VkDataGraphPipelineSessionBindPointRequirementsInfoARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDataGraphPipelineSessionBindPointRequirementsInfoARM createSafe(long address) {
        return address == NULL ? null : new VkDataGraphPipelineSessionBindPointRequirementsInfoARM(address, null);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineSessionBindPointRequirementsInfoARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineSessionBindPointRequirementsInfoARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineSessionBindPointRequirementsInfoARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineSessionBindPointRequirementsInfoARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineSessionBindPointRequirementsInfoARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineSessionBindPointRequirementsInfoARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDataGraphPipelineSessionBindPointRequirementsInfoARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineSessionBindPointRequirementsInfoARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDataGraphPipelineSessionBindPointRequirementsInfoARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDataGraphPipelineSessionBindPointRequirementsInfoARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDataGraphPipelineSessionBindPointRequirementsInfoARM malloc(MemoryStack stack) {
        return new VkDataGraphPipelineSessionBindPointRequirementsInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDataGraphPipelineSessionBindPointRequirementsInfoARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDataGraphPipelineSessionBindPointRequirementsInfoARM calloc(MemoryStack stack) {
        return new VkDataGraphPipelineSessionBindPointRequirementsInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineSessionBindPointRequirementsInfoARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineSessionBindPointRequirementsInfoARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineSessionBindPointRequirementsInfoARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineSessionBindPointRequirementsInfoARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDataGraphPipelineSessionBindPointRequirementsInfoARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDataGraphPipelineSessionBindPointRequirementsInfoARM.PNEXT); }
    /** Unsafe version of {@link #session}. */
    public static long nsession(long struct) { return memGetLong(struct + VkDataGraphPipelineSessionBindPointRequirementsInfoARM.SESSION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDataGraphPipelineSessionBindPointRequirementsInfoARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDataGraphPipelineSessionBindPointRequirementsInfoARM.PNEXT, value); }
    /** Unsafe version of {@link #session(long) session}. */
    public static void nsession(long struct, long value) { memPutLong(struct + VkDataGraphPipelineSessionBindPointRequirementsInfoARM.SESSION, value); }

    // -----------------------------------

    /** An array of {@link VkDataGraphPipelineSessionBindPointRequirementsInfoARM} structs. */
    public static class Buffer extends StructBuffer<VkDataGraphPipelineSessionBindPointRequirementsInfoARM, Buffer> implements NativeResource {

        private static final VkDataGraphPipelineSessionBindPointRequirementsInfoARM ELEMENT_FACTORY = VkDataGraphPipelineSessionBindPointRequirementsInfoARM.create(-1L);

        /**
         * Creates a new {@code VkDataGraphPipelineSessionBindPointRequirementsInfoARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDataGraphPipelineSessionBindPointRequirementsInfoARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDataGraphPipelineSessionBindPointRequirementsInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDataGraphPipelineSessionBindPointRequirementsInfoARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDataGraphPipelineSessionBindPointRequirementsInfoARM.npNext(address()); }
        /** @return the value of the {@code session} field. */
        @NativeType("VkDataGraphPipelineSessionARM")
        public long session() { return VkDataGraphPipelineSessionBindPointRequirementsInfoARM.nsession(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDataGraphPipelineSessionBindPointRequirementsInfoARM.Buffer sType(@NativeType("VkStructureType") int value) { VkDataGraphPipelineSessionBindPointRequirementsInfoARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMDataGraph#VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_BIND_POINT_REQUIREMENTS_INFO_ARM STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_BIND_POINT_REQUIREMENTS_INFO_ARM} value to the {@code sType} field. */
        public VkDataGraphPipelineSessionBindPointRequirementsInfoARM.Buffer sType$Default() { return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_BIND_POINT_REQUIREMENTS_INFO_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDataGraphPipelineSessionBindPointRequirementsInfoARM.Buffer pNext(@NativeType("void const *") long value) { VkDataGraphPipelineSessionBindPointRequirementsInfoARM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code session} field. */
        public VkDataGraphPipelineSessionBindPointRequirementsInfoARM.Buffer session(@NativeType("VkDataGraphPipelineSessionARM") long value) { VkDataGraphPipelineSessionBindPointRequirementsInfoARM.nsession(address(), value); return this; }

    }

}