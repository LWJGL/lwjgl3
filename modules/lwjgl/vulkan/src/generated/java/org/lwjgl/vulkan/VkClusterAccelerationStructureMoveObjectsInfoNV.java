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
 * struct VkClusterAccelerationStructureMoveObjectsInfoNV {
 *     VkDeviceAddress srcAccelerationStructure;
 * }}</pre>
 */
public class VkClusterAccelerationStructureMoveObjectsInfoNV extends Struct<VkClusterAccelerationStructureMoveObjectsInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SRCACCELERATIONSTRUCTURE;

    static {
        Layout layout = __struct(
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SRCACCELERATIONSTRUCTURE = layout.offsetof(0);
    }

    protected VkClusterAccelerationStructureMoveObjectsInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkClusterAccelerationStructureMoveObjectsInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkClusterAccelerationStructureMoveObjectsInfoNV(address, container);
    }

    /**
     * Creates a {@code VkClusterAccelerationStructureMoveObjectsInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkClusterAccelerationStructureMoveObjectsInfoNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code srcAccelerationStructure} field. */
    @NativeType("VkDeviceAddress")
    public long srcAccelerationStructure() { return nsrcAccelerationStructure(address()); }

    /** Sets the specified value to the {@code srcAccelerationStructure} field. */
    public VkClusterAccelerationStructureMoveObjectsInfoNV srcAccelerationStructure(@NativeType("VkDeviceAddress") long value) { nsrcAccelerationStructure(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkClusterAccelerationStructureMoveObjectsInfoNV set(VkClusterAccelerationStructureMoveObjectsInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkClusterAccelerationStructureMoveObjectsInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkClusterAccelerationStructureMoveObjectsInfoNV malloc() {
        return new VkClusterAccelerationStructureMoveObjectsInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkClusterAccelerationStructureMoveObjectsInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkClusterAccelerationStructureMoveObjectsInfoNV calloc() {
        return new VkClusterAccelerationStructureMoveObjectsInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkClusterAccelerationStructureMoveObjectsInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkClusterAccelerationStructureMoveObjectsInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkClusterAccelerationStructureMoveObjectsInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkClusterAccelerationStructureMoveObjectsInfoNV} instance for the specified memory address. */
    public static VkClusterAccelerationStructureMoveObjectsInfoNV create(long address) {
        return new VkClusterAccelerationStructureMoveObjectsInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkClusterAccelerationStructureMoveObjectsInfoNV createSafe(long address) {
        return address == NULL ? null : new VkClusterAccelerationStructureMoveObjectsInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureMoveObjectsInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureMoveObjectsInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureMoveObjectsInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureMoveObjectsInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureMoveObjectsInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureMoveObjectsInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkClusterAccelerationStructureMoveObjectsInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureMoveObjectsInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkClusterAccelerationStructureMoveObjectsInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkClusterAccelerationStructureMoveObjectsInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkClusterAccelerationStructureMoveObjectsInfoNV malloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureMoveObjectsInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkClusterAccelerationStructureMoveObjectsInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkClusterAccelerationStructureMoveObjectsInfoNV calloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureMoveObjectsInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureMoveObjectsInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureMoveObjectsInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureMoveObjectsInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureMoveObjectsInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #srcAccelerationStructure}. */
    public static long nsrcAccelerationStructure(long struct) { return memGetLong(struct + VkClusterAccelerationStructureMoveObjectsInfoNV.SRCACCELERATIONSTRUCTURE); }

    /** Unsafe version of {@link #srcAccelerationStructure(long) srcAccelerationStructure}. */
    public static void nsrcAccelerationStructure(long struct, long value) { memPutLong(struct + VkClusterAccelerationStructureMoveObjectsInfoNV.SRCACCELERATIONSTRUCTURE, value); }

    // -----------------------------------

    /** An array of {@link VkClusterAccelerationStructureMoveObjectsInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkClusterAccelerationStructureMoveObjectsInfoNV, Buffer> implements NativeResource {

        private static final VkClusterAccelerationStructureMoveObjectsInfoNV ELEMENT_FACTORY = VkClusterAccelerationStructureMoveObjectsInfoNV.create(-1L);

        /**
         * Creates a new {@code VkClusterAccelerationStructureMoveObjectsInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkClusterAccelerationStructureMoveObjectsInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkClusterAccelerationStructureMoveObjectsInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code srcAccelerationStructure} field. */
        @NativeType("VkDeviceAddress")
        public long srcAccelerationStructure() { return VkClusterAccelerationStructureMoveObjectsInfoNV.nsrcAccelerationStructure(address()); }

        /** Sets the specified value to the {@code srcAccelerationStructure} field. */
        public VkClusterAccelerationStructureMoveObjectsInfoNV.Buffer srcAccelerationStructure(@NativeType("VkDeviceAddress") long value) { VkClusterAccelerationStructureMoveObjectsInfoNV.nsrcAccelerationStructure(address(), value); return this; }

    }

}