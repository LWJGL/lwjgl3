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
 * struct VkBindDataGraphPipelineSessionMemoryInfoARM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkDataGraphPipelineSessionARM session;
 *     VkDataGraphPipelineSessionBindPointARM bindPoint;
 *     uint32_t objectIndex;
 *     VkDeviceMemory memory;
 *     VkDeviceSize memoryOffset;
 * }}</pre>
 */
public class VkBindDataGraphPipelineSessionMemoryInfoARM extends Struct<VkBindDataGraphPipelineSessionMemoryInfoARM> implements NativeResource {

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
        OBJECTINDEX,
        MEMORY,
        MEMORYOFFSET;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(4),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SESSION = layout.offsetof(2);
        BINDPOINT = layout.offsetof(3);
        OBJECTINDEX = layout.offsetof(4);
        MEMORY = layout.offsetof(5);
        MEMORYOFFSET = layout.offsetof(6);
    }

    protected VkBindDataGraphPipelineSessionMemoryInfoARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkBindDataGraphPipelineSessionMemoryInfoARM create(long address, @Nullable ByteBuffer container) {
        return new VkBindDataGraphPipelineSessionMemoryInfoARM(address, container);
    }

    /**
     * Creates a {@code VkBindDataGraphPipelineSessionMemoryInfoARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBindDataGraphPipelineSessionMemoryInfoARM(ByteBuffer container) {
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
    /** @return the value of the {@code memory} field. */
    @NativeType("VkDeviceMemory")
    public long memory() { return nmemory(address()); }
    /** @return the value of the {@code memoryOffset} field. */
    @NativeType("VkDeviceSize")
    public long memoryOffset() { return nmemoryOffset(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkBindDataGraphPipelineSessionMemoryInfoARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMDataGraph#VK_STRUCTURE_TYPE_BIND_DATA_GRAPH_PIPELINE_SESSION_MEMORY_INFO_ARM STRUCTURE_TYPE_BIND_DATA_GRAPH_PIPELINE_SESSION_MEMORY_INFO_ARM} value to the {@code sType} field. */
    public VkBindDataGraphPipelineSessionMemoryInfoARM sType$Default() { return sType(ARMDataGraph.VK_STRUCTURE_TYPE_BIND_DATA_GRAPH_PIPELINE_SESSION_MEMORY_INFO_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkBindDataGraphPipelineSessionMemoryInfoARM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code session} field. */
    public VkBindDataGraphPipelineSessionMemoryInfoARM session(@NativeType("VkDataGraphPipelineSessionARM") long value) { nsession(address(), value); return this; }
    /** Sets the specified value to the {@code bindPoint} field. */
    public VkBindDataGraphPipelineSessionMemoryInfoARM bindPoint(@NativeType("VkDataGraphPipelineSessionBindPointARM") int value) { nbindPoint(address(), value); return this; }
    /** Sets the specified value to the {@code objectIndex} field. */
    public VkBindDataGraphPipelineSessionMemoryInfoARM objectIndex(@NativeType("uint32_t") int value) { nobjectIndex(address(), value); return this; }
    /** Sets the specified value to the {@code memory} field. */
    public VkBindDataGraphPipelineSessionMemoryInfoARM memory(@NativeType("VkDeviceMemory") long value) { nmemory(address(), value); return this; }
    /** Sets the specified value to the {@code memoryOffset} field. */
    public VkBindDataGraphPipelineSessionMemoryInfoARM memoryOffset(@NativeType("VkDeviceSize") long value) { nmemoryOffset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBindDataGraphPipelineSessionMemoryInfoARM set(
        int sType,
        long pNext,
        long session,
        int bindPoint,
        int objectIndex,
        long memory,
        long memoryOffset
    ) {
        sType(sType);
        pNext(pNext);
        session(session);
        bindPoint(bindPoint);
        objectIndex(objectIndex);
        memory(memory);
        memoryOffset(memoryOffset);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBindDataGraphPipelineSessionMemoryInfoARM set(VkBindDataGraphPipelineSessionMemoryInfoARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBindDataGraphPipelineSessionMemoryInfoARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBindDataGraphPipelineSessionMemoryInfoARM malloc() {
        return new VkBindDataGraphPipelineSessionMemoryInfoARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkBindDataGraphPipelineSessionMemoryInfoARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBindDataGraphPipelineSessionMemoryInfoARM calloc() {
        return new VkBindDataGraphPipelineSessionMemoryInfoARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkBindDataGraphPipelineSessionMemoryInfoARM} instance allocated with {@link BufferUtils}. */
    public static VkBindDataGraphPipelineSessionMemoryInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindDataGraphPipelineSessionMemoryInfoARM(memAddress(container), container);
    }

    /** Returns a new {@code VkBindDataGraphPipelineSessionMemoryInfoARM} instance for the specified memory address. */
    public static VkBindDataGraphPipelineSessionMemoryInfoARM create(long address) {
        return new VkBindDataGraphPipelineSessionMemoryInfoARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkBindDataGraphPipelineSessionMemoryInfoARM createSafe(long address) {
        return address == NULL ? null : new VkBindDataGraphPipelineSessionMemoryInfoARM(address, null);
    }

    /**
     * Returns a new {@link VkBindDataGraphPipelineSessionMemoryInfoARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindDataGraphPipelineSessionMemoryInfoARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBindDataGraphPipelineSessionMemoryInfoARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindDataGraphPipelineSessionMemoryInfoARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindDataGraphPipelineSessionMemoryInfoARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindDataGraphPipelineSessionMemoryInfoARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkBindDataGraphPipelineSessionMemoryInfoARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBindDataGraphPipelineSessionMemoryInfoARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkBindDataGraphPipelineSessionMemoryInfoARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkBindDataGraphPipelineSessionMemoryInfoARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindDataGraphPipelineSessionMemoryInfoARM malloc(MemoryStack stack) {
        return new VkBindDataGraphPipelineSessionMemoryInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkBindDataGraphPipelineSessionMemoryInfoARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindDataGraphPipelineSessionMemoryInfoARM calloc(MemoryStack stack) {
        return new VkBindDataGraphPipelineSessionMemoryInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkBindDataGraphPipelineSessionMemoryInfoARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindDataGraphPipelineSessionMemoryInfoARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindDataGraphPipelineSessionMemoryInfoARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindDataGraphPipelineSessionMemoryInfoARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkBindDataGraphPipelineSessionMemoryInfoARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBindDataGraphPipelineSessionMemoryInfoARM.PNEXT); }
    /** Unsafe version of {@link #session}. */
    public static long nsession(long struct) { return memGetLong(struct + VkBindDataGraphPipelineSessionMemoryInfoARM.SESSION); }
    /** Unsafe version of {@link #bindPoint}. */
    public static int nbindPoint(long struct) { return memGetInt(struct + VkBindDataGraphPipelineSessionMemoryInfoARM.BINDPOINT); }
    /** Unsafe version of {@link #objectIndex}. */
    public static int nobjectIndex(long struct) { return memGetInt(struct + VkBindDataGraphPipelineSessionMemoryInfoARM.OBJECTINDEX); }
    /** Unsafe version of {@link #memory}. */
    public static long nmemory(long struct) { return memGetLong(struct + VkBindDataGraphPipelineSessionMemoryInfoARM.MEMORY); }
    /** Unsafe version of {@link #memoryOffset}. */
    public static long nmemoryOffset(long struct) { return memGetLong(struct + VkBindDataGraphPipelineSessionMemoryInfoARM.MEMORYOFFSET); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkBindDataGraphPipelineSessionMemoryInfoARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBindDataGraphPipelineSessionMemoryInfoARM.PNEXT, value); }
    /** Unsafe version of {@link #session(long) session}. */
    public static void nsession(long struct, long value) { memPutLong(struct + VkBindDataGraphPipelineSessionMemoryInfoARM.SESSION, value); }
    /** Unsafe version of {@link #bindPoint(int) bindPoint}. */
    public static void nbindPoint(long struct, int value) { memPutInt(struct + VkBindDataGraphPipelineSessionMemoryInfoARM.BINDPOINT, value); }
    /** Unsafe version of {@link #objectIndex(int) objectIndex}. */
    public static void nobjectIndex(long struct, int value) { memPutInt(struct + VkBindDataGraphPipelineSessionMemoryInfoARM.OBJECTINDEX, value); }
    /** Unsafe version of {@link #memory(long) memory}. */
    public static void nmemory(long struct, long value) { memPutLong(struct + VkBindDataGraphPipelineSessionMemoryInfoARM.MEMORY, value); }
    /** Unsafe version of {@link #memoryOffset(long) memoryOffset}. */
    public static void nmemoryOffset(long struct, long value) { memPutLong(struct + VkBindDataGraphPipelineSessionMemoryInfoARM.MEMORYOFFSET, value); }

    // -----------------------------------

    /** An array of {@link VkBindDataGraphPipelineSessionMemoryInfoARM} structs. */
    public static class Buffer extends StructBuffer<VkBindDataGraphPipelineSessionMemoryInfoARM, Buffer> implements NativeResource {

        private static final VkBindDataGraphPipelineSessionMemoryInfoARM ELEMENT_FACTORY = VkBindDataGraphPipelineSessionMemoryInfoARM.create(-1L);

        /**
         * Creates a new {@code VkBindDataGraphPipelineSessionMemoryInfoARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBindDataGraphPipelineSessionMemoryInfoARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkBindDataGraphPipelineSessionMemoryInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBindDataGraphPipelineSessionMemoryInfoARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkBindDataGraphPipelineSessionMemoryInfoARM.npNext(address()); }
        /** @return the value of the {@code session} field. */
        @NativeType("VkDataGraphPipelineSessionARM")
        public long session() { return VkBindDataGraphPipelineSessionMemoryInfoARM.nsession(address()); }
        /** @return the value of the {@code bindPoint} field. */
        @NativeType("VkDataGraphPipelineSessionBindPointARM")
        public int bindPoint() { return VkBindDataGraphPipelineSessionMemoryInfoARM.nbindPoint(address()); }
        /** @return the value of the {@code objectIndex} field. */
        @NativeType("uint32_t")
        public int objectIndex() { return VkBindDataGraphPipelineSessionMemoryInfoARM.nobjectIndex(address()); }
        /** @return the value of the {@code memory} field. */
        @NativeType("VkDeviceMemory")
        public long memory() { return VkBindDataGraphPipelineSessionMemoryInfoARM.nmemory(address()); }
        /** @return the value of the {@code memoryOffset} field. */
        @NativeType("VkDeviceSize")
        public long memoryOffset() { return VkBindDataGraphPipelineSessionMemoryInfoARM.nmemoryOffset(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkBindDataGraphPipelineSessionMemoryInfoARM.Buffer sType(@NativeType("VkStructureType") int value) { VkBindDataGraphPipelineSessionMemoryInfoARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMDataGraph#VK_STRUCTURE_TYPE_BIND_DATA_GRAPH_PIPELINE_SESSION_MEMORY_INFO_ARM STRUCTURE_TYPE_BIND_DATA_GRAPH_PIPELINE_SESSION_MEMORY_INFO_ARM} value to the {@code sType} field. */
        public VkBindDataGraphPipelineSessionMemoryInfoARM.Buffer sType$Default() { return sType(ARMDataGraph.VK_STRUCTURE_TYPE_BIND_DATA_GRAPH_PIPELINE_SESSION_MEMORY_INFO_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkBindDataGraphPipelineSessionMemoryInfoARM.Buffer pNext(@NativeType("void const *") long value) { VkBindDataGraphPipelineSessionMemoryInfoARM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code session} field. */
        public VkBindDataGraphPipelineSessionMemoryInfoARM.Buffer session(@NativeType("VkDataGraphPipelineSessionARM") long value) { VkBindDataGraphPipelineSessionMemoryInfoARM.nsession(address(), value); return this; }
        /** Sets the specified value to the {@code bindPoint} field. */
        public VkBindDataGraphPipelineSessionMemoryInfoARM.Buffer bindPoint(@NativeType("VkDataGraphPipelineSessionBindPointARM") int value) { VkBindDataGraphPipelineSessionMemoryInfoARM.nbindPoint(address(), value); return this; }
        /** Sets the specified value to the {@code objectIndex} field. */
        public VkBindDataGraphPipelineSessionMemoryInfoARM.Buffer objectIndex(@NativeType("uint32_t") int value) { VkBindDataGraphPipelineSessionMemoryInfoARM.nobjectIndex(address(), value); return this; }
        /** Sets the specified value to the {@code memory} field. */
        public VkBindDataGraphPipelineSessionMemoryInfoARM.Buffer memory(@NativeType("VkDeviceMemory") long value) { VkBindDataGraphPipelineSessionMemoryInfoARM.nmemory(address(), value); return this; }
        /** Sets the specified value to the {@code memoryOffset} field. */
        public VkBindDataGraphPipelineSessionMemoryInfoARM.Buffer memoryOffset(@NativeType("VkDeviceSize") long value) { VkBindDataGraphPipelineSessionMemoryInfoARM.nmemoryOffset(address(), value); return this; }

    }

}