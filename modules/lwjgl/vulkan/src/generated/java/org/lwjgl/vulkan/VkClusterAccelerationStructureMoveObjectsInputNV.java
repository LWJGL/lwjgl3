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
 * struct VkClusterAccelerationStructureMoveObjectsInputNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkClusterAccelerationStructureTypeNV type;
 *     VkBool32 noMoveOverlap;
 *     VkDeviceSize maxMovedBytes;
 * }}</pre>
 */
public class VkClusterAccelerationStructureMoveObjectsInputNV extends Struct<VkClusterAccelerationStructureMoveObjectsInputNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TYPE,
        NOMOVEOVERLAP,
        MAXMOVEDBYTES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TYPE = layout.offsetof(2);
        NOMOVEOVERLAP = layout.offsetof(3);
        MAXMOVEDBYTES = layout.offsetof(4);
    }

    protected VkClusterAccelerationStructureMoveObjectsInputNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkClusterAccelerationStructureMoveObjectsInputNV create(long address, @Nullable ByteBuffer container) {
        return new VkClusterAccelerationStructureMoveObjectsInputNV(address, container);
    }

    /**
     * Creates a {@code VkClusterAccelerationStructureMoveObjectsInputNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkClusterAccelerationStructureMoveObjectsInputNV(ByteBuffer container) {
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
    /** @return the value of the {@code type} field. */
    @NativeType("VkClusterAccelerationStructureTypeNV")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code noMoveOverlap} field. */
    @NativeType("VkBool32")
    public boolean noMoveOverlap() { return nnoMoveOverlap(address()) != 0; }
    /** @return the value of the {@code maxMovedBytes} field. */
    @NativeType("VkDeviceSize")
    public long maxMovedBytes() { return nmaxMovedBytes(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkClusterAccelerationStructureMoveObjectsInputNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVClusterAccelerationStructure#VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_MOVE_OBJECTS_INPUT_NV STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_MOVE_OBJECTS_INPUT_NV} value to the {@code sType} field. */
    public VkClusterAccelerationStructureMoveObjectsInputNV sType$Default() { return sType(NVClusterAccelerationStructure.VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_MOVE_OBJECTS_INPUT_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkClusterAccelerationStructureMoveObjectsInputNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code type} field. */
    public VkClusterAccelerationStructureMoveObjectsInputNV type(@NativeType("VkClusterAccelerationStructureTypeNV") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code noMoveOverlap} field. */
    public VkClusterAccelerationStructureMoveObjectsInputNV noMoveOverlap(@NativeType("VkBool32") boolean value) { nnoMoveOverlap(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code maxMovedBytes} field. */
    public VkClusterAccelerationStructureMoveObjectsInputNV maxMovedBytes(@NativeType("VkDeviceSize") long value) { nmaxMovedBytes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkClusterAccelerationStructureMoveObjectsInputNV set(
        int sType,
        long pNext,
        int type,
        boolean noMoveOverlap,
        long maxMovedBytes
    ) {
        sType(sType);
        pNext(pNext);
        type(type);
        noMoveOverlap(noMoveOverlap);
        maxMovedBytes(maxMovedBytes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkClusterAccelerationStructureMoveObjectsInputNV set(VkClusterAccelerationStructureMoveObjectsInputNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkClusterAccelerationStructureMoveObjectsInputNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkClusterAccelerationStructureMoveObjectsInputNV malloc() {
        return new VkClusterAccelerationStructureMoveObjectsInputNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkClusterAccelerationStructureMoveObjectsInputNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkClusterAccelerationStructureMoveObjectsInputNV calloc() {
        return new VkClusterAccelerationStructureMoveObjectsInputNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkClusterAccelerationStructureMoveObjectsInputNV} instance allocated with {@link BufferUtils}. */
    public static VkClusterAccelerationStructureMoveObjectsInputNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkClusterAccelerationStructureMoveObjectsInputNV(memAddress(container), container);
    }

    /** Returns a new {@code VkClusterAccelerationStructureMoveObjectsInputNV} instance for the specified memory address. */
    public static VkClusterAccelerationStructureMoveObjectsInputNV create(long address) {
        return new VkClusterAccelerationStructureMoveObjectsInputNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkClusterAccelerationStructureMoveObjectsInputNV createSafe(long address) {
        return address == NULL ? null : new VkClusterAccelerationStructureMoveObjectsInputNV(address, null);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureMoveObjectsInputNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureMoveObjectsInputNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureMoveObjectsInputNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureMoveObjectsInputNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureMoveObjectsInputNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureMoveObjectsInputNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkClusterAccelerationStructureMoveObjectsInputNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureMoveObjectsInputNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkClusterAccelerationStructureMoveObjectsInputNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkClusterAccelerationStructureMoveObjectsInputNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkClusterAccelerationStructureMoveObjectsInputNV malloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureMoveObjectsInputNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkClusterAccelerationStructureMoveObjectsInputNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkClusterAccelerationStructureMoveObjectsInputNV calloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureMoveObjectsInputNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureMoveObjectsInputNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureMoveObjectsInputNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureMoveObjectsInputNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureMoveObjectsInputNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkClusterAccelerationStructureMoveObjectsInputNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkClusterAccelerationStructureMoveObjectsInputNV.PNEXT); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + VkClusterAccelerationStructureMoveObjectsInputNV.TYPE); }
    /** Unsafe version of {@link #noMoveOverlap}. */
    public static int nnoMoveOverlap(long struct) { return memGetInt(struct + VkClusterAccelerationStructureMoveObjectsInputNV.NOMOVEOVERLAP); }
    /** Unsafe version of {@link #maxMovedBytes}. */
    public static long nmaxMovedBytes(long struct) { return memGetLong(struct + VkClusterAccelerationStructureMoveObjectsInputNV.MAXMOVEDBYTES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkClusterAccelerationStructureMoveObjectsInputNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkClusterAccelerationStructureMoveObjectsInputNV.PNEXT, value); }
    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + VkClusterAccelerationStructureMoveObjectsInputNV.TYPE, value); }
    /** Unsafe version of {@link #noMoveOverlap(boolean) noMoveOverlap}. */
    public static void nnoMoveOverlap(long struct, int value) { memPutInt(struct + VkClusterAccelerationStructureMoveObjectsInputNV.NOMOVEOVERLAP, value); }
    /** Unsafe version of {@link #maxMovedBytes(long) maxMovedBytes}. */
    public static void nmaxMovedBytes(long struct, long value) { memPutLong(struct + VkClusterAccelerationStructureMoveObjectsInputNV.MAXMOVEDBYTES, value); }

    // -----------------------------------

    /** An array of {@link VkClusterAccelerationStructureMoveObjectsInputNV} structs. */
    public static class Buffer extends StructBuffer<VkClusterAccelerationStructureMoveObjectsInputNV, Buffer> implements NativeResource {

        private static final VkClusterAccelerationStructureMoveObjectsInputNV ELEMENT_FACTORY = VkClusterAccelerationStructureMoveObjectsInputNV.create(-1L);

        /**
         * Creates a new {@code VkClusterAccelerationStructureMoveObjectsInputNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkClusterAccelerationStructureMoveObjectsInputNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkClusterAccelerationStructureMoveObjectsInputNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkClusterAccelerationStructureMoveObjectsInputNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkClusterAccelerationStructureMoveObjectsInputNV.npNext(address()); }
        /** @return the value of the {@code type} field. */
        @NativeType("VkClusterAccelerationStructureTypeNV")
        public int type() { return VkClusterAccelerationStructureMoveObjectsInputNV.ntype(address()); }
        /** @return the value of the {@code noMoveOverlap} field. */
        @NativeType("VkBool32")
        public boolean noMoveOverlap() { return VkClusterAccelerationStructureMoveObjectsInputNV.nnoMoveOverlap(address()) != 0; }
        /** @return the value of the {@code maxMovedBytes} field. */
        @NativeType("VkDeviceSize")
        public long maxMovedBytes() { return VkClusterAccelerationStructureMoveObjectsInputNV.nmaxMovedBytes(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkClusterAccelerationStructureMoveObjectsInputNV.Buffer sType(@NativeType("VkStructureType") int value) { VkClusterAccelerationStructureMoveObjectsInputNV.nsType(address(), value); return this; }
        /** Sets the {@link NVClusterAccelerationStructure#VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_MOVE_OBJECTS_INPUT_NV STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_MOVE_OBJECTS_INPUT_NV} value to the {@code sType} field. */
        public VkClusterAccelerationStructureMoveObjectsInputNV.Buffer sType$Default() { return sType(NVClusterAccelerationStructure.VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_MOVE_OBJECTS_INPUT_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkClusterAccelerationStructureMoveObjectsInputNV.Buffer pNext(@NativeType("void *") long value) { VkClusterAccelerationStructureMoveObjectsInputNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code type} field. */
        public VkClusterAccelerationStructureMoveObjectsInputNV.Buffer type(@NativeType("VkClusterAccelerationStructureTypeNV") int value) { VkClusterAccelerationStructureMoveObjectsInputNV.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code noMoveOverlap} field. */
        public VkClusterAccelerationStructureMoveObjectsInputNV.Buffer noMoveOverlap(@NativeType("VkBool32") boolean value) { VkClusterAccelerationStructureMoveObjectsInputNV.nnoMoveOverlap(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code maxMovedBytes} field. */
        public VkClusterAccelerationStructureMoveObjectsInputNV.Buffer maxMovedBytes(@NativeType("VkDeviceSize") long value) { VkClusterAccelerationStructureMoveObjectsInputNV.nmaxMovedBytes(address(), value); return this; }

    }

}