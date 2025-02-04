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
 * <pre>{@code
 * union VkClusterAccelerationStructureOpInputNV {
 *     {@link VkClusterAccelerationStructureClustersBottomLevelInputNV VkClusterAccelerationStructureClustersBottomLevelInputNV} * pClustersBottomLevel;
 *     {@link VkClusterAccelerationStructureTriangleClusterInputNV VkClusterAccelerationStructureTriangleClusterInputNV} * pTriangleClusters;
 *     {@link VkClusterAccelerationStructureMoveObjectsInputNV VkClusterAccelerationStructureMoveObjectsInputNV} * pMoveObjects;
 * }}</pre>
 */
public class VkClusterAccelerationStructureOpInputNV extends Struct<VkClusterAccelerationStructureOpInputNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PCLUSTERSBOTTOMLEVEL,
        PTRIANGLECLUSTERS,
        PMOVEOBJECTS;

    static {
        Layout layout = __union(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PCLUSTERSBOTTOMLEVEL = layout.offsetof(0);
        PTRIANGLECLUSTERS = layout.offsetof(1);
        PMOVEOBJECTS = layout.offsetof(2);
    }

    protected VkClusterAccelerationStructureOpInputNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkClusterAccelerationStructureOpInputNV create(long address, @Nullable ByteBuffer container) {
        return new VkClusterAccelerationStructureOpInputNV(address, container);
    }

    /**
     * Creates a {@code VkClusterAccelerationStructureOpInputNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkClusterAccelerationStructureOpInputNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link VkClusterAccelerationStructureClustersBottomLevelInputNV} view of the struct pointed to by the {@code pClustersBottomLevel} field. */
    @NativeType("VkClusterAccelerationStructureClustersBottomLevelInputNV *")
    public VkClusterAccelerationStructureClustersBottomLevelInputNV pClustersBottomLevel() { return npClustersBottomLevel(address()); }
    /** @return a {@link VkClusterAccelerationStructureTriangleClusterInputNV} view of the struct pointed to by the {@code pTriangleClusters} field. */
    @NativeType("VkClusterAccelerationStructureTriangleClusterInputNV *")
    public VkClusterAccelerationStructureTriangleClusterInputNV pTriangleClusters() { return npTriangleClusters(address()); }
    /** @return a {@link VkClusterAccelerationStructureMoveObjectsInputNV} view of the struct pointed to by the {@code pMoveObjects} field. */
    @NativeType("VkClusterAccelerationStructureMoveObjectsInputNV *")
    public VkClusterAccelerationStructureMoveObjectsInputNV pMoveObjects() { return npMoveObjects(address()); }

    /** Sets the address of the specified {@link VkClusterAccelerationStructureClustersBottomLevelInputNV} to the {@code pClustersBottomLevel} field. */
    public VkClusterAccelerationStructureOpInputNV pClustersBottomLevel(@NativeType("VkClusterAccelerationStructureClustersBottomLevelInputNV *") VkClusterAccelerationStructureClustersBottomLevelInputNV value) { npClustersBottomLevel(address(), value); return this; }
    /** Sets the address of the specified {@link VkClusterAccelerationStructureTriangleClusterInputNV} to the {@code pTriangleClusters} field. */
    public VkClusterAccelerationStructureOpInputNV pTriangleClusters(@NativeType("VkClusterAccelerationStructureTriangleClusterInputNV *") VkClusterAccelerationStructureTriangleClusterInputNV value) { npTriangleClusters(address(), value); return this; }
    /** Sets the address of the specified {@link VkClusterAccelerationStructureMoveObjectsInputNV} to the {@code pMoveObjects} field. */
    public VkClusterAccelerationStructureOpInputNV pMoveObjects(@NativeType("VkClusterAccelerationStructureMoveObjectsInputNV *") VkClusterAccelerationStructureMoveObjectsInputNV value) { npMoveObjects(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkClusterAccelerationStructureOpInputNV set(VkClusterAccelerationStructureOpInputNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkClusterAccelerationStructureOpInputNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkClusterAccelerationStructureOpInputNV malloc() {
        return new VkClusterAccelerationStructureOpInputNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkClusterAccelerationStructureOpInputNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkClusterAccelerationStructureOpInputNV calloc() {
        return new VkClusterAccelerationStructureOpInputNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkClusterAccelerationStructureOpInputNV} instance allocated with {@link BufferUtils}. */
    public static VkClusterAccelerationStructureOpInputNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkClusterAccelerationStructureOpInputNV(memAddress(container), container);
    }

    /** Returns a new {@code VkClusterAccelerationStructureOpInputNV} instance for the specified memory address. */
    public static VkClusterAccelerationStructureOpInputNV create(long address) {
        return new VkClusterAccelerationStructureOpInputNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkClusterAccelerationStructureOpInputNV createSafe(long address) {
        return address == NULL ? null : new VkClusterAccelerationStructureOpInputNV(address, null);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureOpInputNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureOpInputNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureOpInputNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureOpInputNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureOpInputNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureOpInputNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkClusterAccelerationStructureOpInputNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureOpInputNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkClusterAccelerationStructureOpInputNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkClusterAccelerationStructureOpInputNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkClusterAccelerationStructureOpInputNV malloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureOpInputNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkClusterAccelerationStructureOpInputNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkClusterAccelerationStructureOpInputNV calloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureOpInputNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureOpInputNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureOpInputNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureOpInputNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureOpInputNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #pClustersBottomLevel}. */
    public static VkClusterAccelerationStructureClustersBottomLevelInputNV npClustersBottomLevel(long struct) { return VkClusterAccelerationStructureClustersBottomLevelInputNV.create(memGetAddress(struct + VkClusterAccelerationStructureOpInputNV.PCLUSTERSBOTTOMLEVEL)); }
    /** Unsafe version of {@link #pTriangleClusters}. */
    public static VkClusterAccelerationStructureTriangleClusterInputNV npTriangleClusters(long struct) { return VkClusterAccelerationStructureTriangleClusterInputNV.create(memGetAddress(struct + VkClusterAccelerationStructureOpInputNV.PTRIANGLECLUSTERS)); }
    /** Unsafe version of {@link #pMoveObjects}. */
    public static VkClusterAccelerationStructureMoveObjectsInputNV npMoveObjects(long struct) { return VkClusterAccelerationStructureMoveObjectsInputNV.create(memGetAddress(struct + VkClusterAccelerationStructureOpInputNV.PMOVEOBJECTS)); }

    /** Unsafe version of {@link #pClustersBottomLevel(VkClusterAccelerationStructureClustersBottomLevelInputNV) pClustersBottomLevel}. */
    public static void npClustersBottomLevel(long struct, VkClusterAccelerationStructureClustersBottomLevelInputNV value) { memPutAddress(struct + VkClusterAccelerationStructureOpInputNV.PCLUSTERSBOTTOMLEVEL, value.address()); }
    /** Unsafe version of {@link #pTriangleClusters(VkClusterAccelerationStructureTriangleClusterInputNV) pTriangleClusters}. */
    public static void npTriangleClusters(long struct, VkClusterAccelerationStructureTriangleClusterInputNV value) { memPutAddress(struct + VkClusterAccelerationStructureOpInputNV.PTRIANGLECLUSTERS, value.address()); }
    /** Unsafe version of {@link #pMoveObjects(VkClusterAccelerationStructureMoveObjectsInputNV) pMoveObjects}. */
    public static void npMoveObjects(long struct, VkClusterAccelerationStructureMoveObjectsInputNV value) { memPutAddress(struct + VkClusterAccelerationStructureOpInputNV.PMOVEOBJECTS, value.address()); }

    // -----------------------------------

    /** An array of {@link VkClusterAccelerationStructureOpInputNV} structs. */
    public static class Buffer extends StructBuffer<VkClusterAccelerationStructureOpInputNV, Buffer> implements NativeResource {

        private static final VkClusterAccelerationStructureOpInputNV ELEMENT_FACTORY = VkClusterAccelerationStructureOpInputNV.create(-1L);

        /**
         * Creates a new {@code VkClusterAccelerationStructureOpInputNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkClusterAccelerationStructureOpInputNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkClusterAccelerationStructureOpInputNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link VkClusterAccelerationStructureClustersBottomLevelInputNV} view of the struct pointed to by the {@code pClustersBottomLevel} field. */
        @NativeType("VkClusterAccelerationStructureClustersBottomLevelInputNV *")
        public VkClusterAccelerationStructureClustersBottomLevelInputNV pClustersBottomLevel() { return VkClusterAccelerationStructureOpInputNV.npClustersBottomLevel(address()); }
        /** @return a {@link VkClusterAccelerationStructureTriangleClusterInputNV} view of the struct pointed to by the {@code pTriangleClusters} field. */
        @NativeType("VkClusterAccelerationStructureTriangleClusterInputNV *")
        public VkClusterAccelerationStructureTriangleClusterInputNV pTriangleClusters() { return VkClusterAccelerationStructureOpInputNV.npTriangleClusters(address()); }
        /** @return a {@link VkClusterAccelerationStructureMoveObjectsInputNV} view of the struct pointed to by the {@code pMoveObjects} field. */
        @NativeType("VkClusterAccelerationStructureMoveObjectsInputNV *")
        public VkClusterAccelerationStructureMoveObjectsInputNV pMoveObjects() { return VkClusterAccelerationStructureOpInputNV.npMoveObjects(address()); }

        /** Sets the address of the specified {@link VkClusterAccelerationStructureClustersBottomLevelInputNV} to the {@code pClustersBottomLevel} field. */
        public VkClusterAccelerationStructureOpInputNV.Buffer pClustersBottomLevel(@NativeType("VkClusterAccelerationStructureClustersBottomLevelInputNV *") VkClusterAccelerationStructureClustersBottomLevelInputNV value) { VkClusterAccelerationStructureOpInputNV.npClustersBottomLevel(address(), value); return this; }
        /** Sets the address of the specified {@link VkClusterAccelerationStructureTriangleClusterInputNV} to the {@code pTriangleClusters} field. */
        public VkClusterAccelerationStructureOpInputNV.Buffer pTriangleClusters(@NativeType("VkClusterAccelerationStructureTriangleClusterInputNV *") VkClusterAccelerationStructureTriangleClusterInputNV value) { VkClusterAccelerationStructureOpInputNV.npTriangleClusters(address(), value); return this; }
        /** Sets the address of the specified {@link VkClusterAccelerationStructureMoveObjectsInputNV} to the {@code pMoveObjects} field. */
        public VkClusterAccelerationStructureOpInputNV.Buffer pMoveObjects(@NativeType("VkClusterAccelerationStructureMoveObjectsInputNV *") VkClusterAccelerationStructureMoveObjectsInputNV value) { VkClusterAccelerationStructureOpInputNV.npMoveObjects(address(), value); return this; }

    }

}