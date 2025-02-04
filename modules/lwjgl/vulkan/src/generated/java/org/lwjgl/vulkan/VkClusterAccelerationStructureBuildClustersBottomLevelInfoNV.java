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
 * struct VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV {
 *     uint32_t clusterReferencesCount;
 *     uint32_t clusterReferencesStride;
 *     VkDeviceAddress clusterReferences;
 * }}</pre>
 */
public class VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV extends Struct<VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CLUSTERREFERENCESCOUNT,
        CLUSTERREFERENCESSTRIDE,
        CLUSTERREFERENCES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CLUSTERREFERENCESCOUNT = layout.offsetof(0);
        CLUSTERREFERENCESSTRIDE = layout.offsetof(1);
        CLUSTERREFERENCES = layout.offsetof(2);
    }

    protected VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(address, container);
    }

    /**
     * Creates a {@code VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code clusterReferencesCount} field. */
    @NativeType("uint32_t")
    public int clusterReferencesCount() { return nclusterReferencesCount(address()); }
    /** @return the value of the {@code clusterReferencesStride} field. */
    @NativeType("uint32_t")
    public int clusterReferencesStride() { return nclusterReferencesStride(address()); }
    /** @return the value of the {@code clusterReferences} field. */
    @NativeType("VkDeviceAddress")
    public long clusterReferences() { return nclusterReferences(address()); }

    /** Sets the specified value to the {@code clusterReferencesCount} field. */
    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV clusterReferencesCount(@NativeType("uint32_t") int value) { nclusterReferencesCount(address(), value); return this; }
    /** Sets the specified value to the {@code clusterReferencesStride} field. */
    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV clusterReferencesStride(@NativeType("uint32_t") int value) { nclusterReferencesStride(address(), value); return this; }
    /** Sets the specified value to the {@code clusterReferences} field. */
    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV clusterReferences(@NativeType("VkDeviceAddress") long value) { nclusterReferences(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV set(
        int clusterReferencesCount,
        int clusterReferencesStride,
        long clusterReferences
    ) {
        clusterReferencesCount(clusterReferencesCount);
        clusterReferencesStride(clusterReferencesStride);
        clusterReferences(clusterReferences);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV set(VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV malloc() {
        return new VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV calloc() {
        return new VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV} instance for the specified memory address. */
    public static VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV create(long address) {
        return new VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV createSafe(long address) {
        return address == NULL ? null : new VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV malloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV calloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #clusterReferencesCount}. */
    public static int nclusterReferencesCount(long struct) { return memGetInt(struct + VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV.CLUSTERREFERENCESCOUNT); }
    /** Unsafe version of {@link #clusterReferencesStride}. */
    public static int nclusterReferencesStride(long struct) { return memGetInt(struct + VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV.CLUSTERREFERENCESSTRIDE); }
    /** Unsafe version of {@link #clusterReferences}. */
    public static long nclusterReferences(long struct) { return memGetLong(struct + VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV.CLUSTERREFERENCES); }

    /** Unsafe version of {@link #clusterReferencesCount(int) clusterReferencesCount}. */
    public static void nclusterReferencesCount(long struct, int value) { memPutInt(struct + VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV.CLUSTERREFERENCESCOUNT, value); }
    /** Unsafe version of {@link #clusterReferencesStride(int) clusterReferencesStride}. */
    public static void nclusterReferencesStride(long struct, int value) { memPutInt(struct + VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV.CLUSTERREFERENCESSTRIDE, value); }
    /** Unsafe version of {@link #clusterReferences(long) clusterReferences}. */
    public static void nclusterReferences(long struct, long value) { memPutLong(struct + VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV.CLUSTERREFERENCES, value); }

    // -----------------------------------

    /** An array of {@link VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV, Buffer> implements NativeResource {

        private static final VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV ELEMENT_FACTORY = VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV.create(-1L);

        /**
         * Creates a new {@code VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code clusterReferencesCount} field. */
        @NativeType("uint32_t")
        public int clusterReferencesCount() { return VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV.nclusterReferencesCount(address()); }
        /** @return the value of the {@code clusterReferencesStride} field. */
        @NativeType("uint32_t")
        public int clusterReferencesStride() { return VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV.nclusterReferencesStride(address()); }
        /** @return the value of the {@code clusterReferences} field. */
        @NativeType("VkDeviceAddress")
        public long clusterReferences() { return VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV.nclusterReferences(address()); }

        /** Sets the specified value to the {@code clusterReferencesCount} field. */
        public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV.Buffer clusterReferencesCount(@NativeType("uint32_t") int value) { VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV.nclusterReferencesCount(address(), value); return this; }
        /** Sets the specified value to the {@code clusterReferencesStride} field. */
        public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV.Buffer clusterReferencesStride(@NativeType("uint32_t") int value) { VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV.nclusterReferencesStride(address(), value); return this; }
        /** Sets the specified value to the {@code clusterReferences} field. */
        public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV.Buffer clusterReferences(@NativeType("VkDeviceAddress") long value) { VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV.nclusterReferences(address(), value); return this; }

    }

}