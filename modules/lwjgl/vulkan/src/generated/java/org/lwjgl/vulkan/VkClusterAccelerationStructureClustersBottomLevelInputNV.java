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
 * struct VkClusterAccelerationStructureClustersBottomLevelInputNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t maxTotalClusterCount;
 *     uint32_t maxClusterCountPerAccelerationStructure;
 * }}</pre>
 */
public class VkClusterAccelerationStructureClustersBottomLevelInputNV extends Struct<VkClusterAccelerationStructureClustersBottomLevelInputNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXTOTALCLUSTERCOUNT,
        MAXCLUSTERCOUNTPERACCELERATIONSTRUCTURE;

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
        MAXTOTALCLUSTERCOUNT = layout.offsetof(2);
        MAXCLUSTERCOUNTPERACCELERATIONSTRUCTURE = layout.offsetof(3);
    }

    protected VkClusterAccelerationStructureClustersBottomLevelInputNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkClusterAccelerationStructureClustersBottomLevelInputNV create(long address, @Nullable ByteBuffer container) {
        return new VkClusterAccelerationStructureClustersBottomLevelInputNV(address, container);
    }

    /**
     * Creates a {@code VkClusterAccelerationStructureClustersBottomLevelInputNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkClusterAccelerationStructureClustersBottomLevelInputNV(ByteBuffer container) {
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
    /** @return the value of the {@code maxTotalClusterCount} field. */
    @NativeType("uint32_t")
    public int maxTotalClusterCount() { return nmaxTotalClusterCount(address()); }
    /** @return the value of the {@code maxClusterCountPerAccelerationStructure} field. */
    @NativeType("uint32_t")
    public int maxClusterCountPerAccelerationStructure() { return nmaxClusterCountPerAccelerationStructure(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkClusterAccelerationStructureClustersBottomLevelInputNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVClusterAccelerationStructure#VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_CLUSTERS_BOTTOM_LEVEL_INPUT_NV STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_CLUSTERS_BOTTOM_LEVEL_INPUT_NV} value to the {@code sType} field. */
    public VkClusterAccelerationStructureClustersBottomLevelInputNV sType$Default() { return sType(NVClusterAccelerationStructure.VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_CLUSTERS_BOTTOM_LEVEL_INPUT_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkClusterAccelerationStructureClustersBottomLevelInputNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code maxTotalClusterCount} field. */
    public VkClusterAccelerationStructureClustersBottomLevelInputNV maxTotalClusterCount(@NativeType("uint32_t") int value) { nmaxTotalClusterCount(address(), value); return this; }
    /** Sets the specified value to the {@code maxClusterCountPerAccelerationStructure} field. */
    public VkClusterAccelerationStructureClustersBottomLevelInputNV maxClusterCountPerAccelerationStructure(@NativeType("uint32_t") int value) { nmaxClusterCountPerAccelerationStructure(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkClusterAccelerationStructureClustersBottomLevelInputNV set(
        int sType,
        long pNext,
        int maxTotalClusterCount,
        int maxClusterCountPerAccelerationStructure
    ) {
        sType(sType);
        pNext(pNext);
        maxTotalClusterCount(maxTotalClusterCount);
        maxClusterCountPerAccelerationStructure(maxClusterCountPerAccelerationStructure);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkClusterAccelerationStructureClustersBottomLevelInputNV set(VkClusterAccelerationStructureClustersBottomLevelInputNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkClusterAccelerationStructureClustersBottomLevelInputNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkClusterAccelerationStructureClustersBottomLevelInputNV malloc() {
        return new VkClusterAccelerationStructureClustersBottomLevelInputNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkClusterAccelerationStructureClustersBottomLevelInputNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkClusterAccelerationStructureClustersBottomLevelInputNV calloc() {
        return new VkClusterAccelerationStructureClustersBottomLevelInputNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkClusterAccelerationStructureClustersBottomLevelInputNV} instance allocated with {@link BufferUtils}. */
    public static VkClusterAccelerationStructureClustersBottomLevelInputNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkClusterAccelerationStructureClustersBottomLevelInputNV(memAddress(container), container);
    }

    /** Returns a new {@code VkClusterAccelerationStructureClustersBottomLevelInputNV} instance for the specified memory address. */
    public static VkClusterAccelerationStructureClustersBottomLevelInputNV create(long address) {
        return new VkClusterAccelerationStructureClustersBottomLevelInputNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkClusterAccelerationStructureClustersBottomLevelInputNV createSafe(long address) {
        return address == NULL ? null : new VkClusterAccelerationStructureClustersBottomLevelInputNV(address, null);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureClustersBottomLevelInputNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureClustersBottomLevelInputNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureClustersBottomLevelInputNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureClustersBottomLevelInputNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureClustersBottomLevelInputNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureClustersBottomLevelInputNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkClusterAccelerationStructureClustersBottomLevelInputNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureClustersBottomLevelInputNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkClusterAccelerationStructureClustersBottomLevelInputNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkClusterAccelerationStructureClustersBottomLevelInputNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkClusterAccelerationStructureClustersBottomLevelInputNV malloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureClustersBottomLevelInputNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkClusterAccelerationStructureClustersBottomLevelInputNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkClusterAccelerationStructureClustersBottomLevelInputNV calloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureClustersBottomLevelInputNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureClustersBottomLevelInputNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureClustersBottomLevelInputNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureClustersBottomLevelInputNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureClustersBottomLevelInputNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkClusterAccelerationStructureClustersBottomLevelInputNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkClusterAccelerationStructureClustersBottomLevelInputNV.PNEXT); }
    /** Unsafe version of {@link #maxTotalClusterCount}. */
    public static int nmaxTotalClusterCount(long struct) { return memGetInt(struct + VkClusterAccelerationStructureClustersBottomLevelInputNV.MAXTOTALCLUSTERCOUNT); }
    /** Unsafe version of {@link #maxClusterCountPerAccelerationStructure}. */
    public static int nmaxClusterCountPerAccelerationStructure(long struct) { return memGetInt(struct + VkClusterAccelerationStructureClustersBottomLevelInputNV.MAXCLUSTERCOUNTPERACCELERATIONSTRUCTURE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkClusterAccelerationStructureClustersBottomLevelInputNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkClusterAccelerationStructureClustersBottomLevelInputNV.PNEXT, value); }
    /** Unsafe version of {@link #maxTotalClusterCount(int) maxTotalClusterCount}. */
    public static void nmaxTotalClusterCount(long struct, int value) { memPutInt(struct + VkClusterAccelerationStructureClustersBottomLevelInputNV.MAXTOTALCLUSTERCOUNT, value); }
    /** Unsafe version of {@link #maxClusterCountPerAccelerationStructure(int) maxClusterCountPerAccelerationStructure}. */
    public static void nmaxClusterCountPerAccelerationStructure(long struct, int value) { memPutInt(struct + VkClusterAccelerationStructureClustersBottomLevelInputNV.MAXCLUSTERCOUNTPERACCELERATIONSTRUCTURE, value); }

    // -----------------------------------

    /** An array of {@link VkClusterAccelerationStructureClustersBottomLevelInputNV} structs. */
    public static class Buffer extends StructBuffer<VkClusterAccelerationStructureClustersBottomLevelInputNV, Buffer> implements NativeResource {

        private static final VkClusterAccelerationStructureClustersBottomLevelInputNV ELEMENT_FACTORY = VkClusterAccelerationStructureClustersBottomLevelInputNV.create(-1L);

        /**
         * Creates a new {@code VkClusterAccelerationStructureClustersBottomLevelInputNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkClusterAccelerationStructureClustersBottomLevelInputNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkClusterAccelerationStructureClustersBottomLevelInputNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkClusterAccelerationStructureClustersBottomLevelInputNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkClusterAccelerationStructureClustersBottomLevelInputNV.npNext(address()); }
        /** @return the value of the {@code maxTotalClusterCount} field. */
        @NativeType("uint32_t")
        public int maxTotalClusterCount() { return VkClusterAccelerationStructureClustersBottomLevelInputNV.nmaxTotalClusterCount(address()); }
        /** @return the value of the {@code maxClusterCountPerAccelerationStructure} field. */
        @NativeType("uint32_t")
        public int maxClusterCountPerAccelerationStructure() { return VkClusterAccelerationStructureClustersBottomLevelInputNV.nmaxClusterCountPerAccelerationStructure(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkClusterAccelerationStructureClustersBottomLevelInputNV.Buffer sType(@NativeType("VkStructureType") int value) { VkClusterAccelerationStructureClustersBottomLevelInputNV.nsType(address(), value); return this; }
        /** Sets the {@link NVClusterAccelerationStructure#VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_CLUSTERS_BOTTOM_LEVEL_INPUT_NV STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_CLUSTERS_BOTTOM_LEVEL_INPUT_NV} value to the {@code sType} field. */
        public VkClusterAccelerationStructureClustersBottomLevelInputNV.Buffer sType$Default() { return sType(NVClusterAccelerationStructure.VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_CLUSTERS_BOTTOM_LEVEL_INPUT_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkClusterAccelerationStructureClustersBottomLevelInputNV.Buffer pNext(@NativeType("void *") long value) { VkClusterAccelerationStructureClustersBottomLevelInputNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code maxTotalClusterCount} field. */
        public VkClusterAccelerationStructureClustersBottomLevelInputNV.Buffer maxTotalClusterCount(@NativeType("uint32_t") int value) { VkClusterAccelerationStructureClustersBottomLevelInputNV.nmaxTotalClusterCount(address(), value); return this; }
        /** Sets the specified value to the {@code maxClusterCountPerAccelerationStructure} field. */
        public VkClusterAccelerationStructureClustersBottomLevelInputNV.Buffer maxClusterCountPerAccelerationStructure(@NativeType("uint32_t") int value) { VkClusterAccelerationStructureClustersBottomLevelInputNV.nmaxClusterCountPerAccelerationStructure(address(), value); return this; }

    }

}