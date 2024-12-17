/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.vma;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VmaAllocationInfo2 {
 *     {@link VmaAllocationInfo VmaAllocationInfo} allocationInfo;
 *     VkDeviceSize blockSize;
 *     VkBool32 dedicatedMemory;
 * }}</pre>
 */
public class VmaAllocationInfo2 extends Struct<VmaAllocationInfo2> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ALLOCATIONINFO,
        BLOCKSIZE,
        DEDICATEDMEMORY;

    static {
        Layout layout = __struct(
            __member(VmaAllocationInfo.SIZEOF, VmaAllocationInfo.ALIGNOF),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ALLOCATIONINFO = layout.offsetof(0);
        BLOCKSIZE = layout.offsetof(1);
        DEDICATEDMEMORY = layout.offsetof(2);
    }

    protected VmaAllocationInfo2(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VmaAllocationInfo2 create(long address, @Nullable ByteBuffer container) {
        return new VmaAllocationInfo2(address, container);
    }

    /**
     * Creates a {@code VmaAllocationInfo2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VmaAllocationInfo2(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link VmaAllocationInfo} view of the {@code allocationInfo} field. */
    public VmaAllocationInfo allocationInfo() { return nallocationInfo(address()); }
    /** @return the value of the {@code blockSize} field. */
    @NativeType("VkDeviceSize")
    public long blockSize() { return nblockSize(address()); }
    /** @return the value of the {@code dedicatedMemory} field. */
    @NativeType("VkBool32")
    public boolean dedicatedMemory() { return ndedicatedMemory(address()) != 0; }

    // -----------------------------------

    /** Returns a new {@code VmaAllocationInfo2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VmaAllocationInfo2 malloc() {
        return new VmaAllocationInfo2(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VmaAllocationInfo2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VmaAllocationInfo2 calloc() {
        return new VmaAllocationInfo2(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VmaAllocationInfo2} instance allocated with {@link BufferUtils}. */
    public static VmaAllocationInfo2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VmaAllocationInfo2(memAddress(container), container);
    }

    /** Returns a new {@code VmaAllocationInfo2} instance for the specified memory address. */
    public static VmaAllocationInfo2 create(long address) {
        return new VmaAllocationInfo2(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VmaAllocationInfo2 createSafe(long address) {
        return address == NULL ? null : new VmaAllocationInfo2(address, null);
    }

    /**
     * Returns a new {@link VmaAllocationInfo2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaAllocationInfo2.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VmaAllocationInfo2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaAllocationInfo2.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaAllocationInfo2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VmaAllocationInfo2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VmaAllocationInfo2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VmaAllocationInfo2.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VmaAllocationInfo2.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VmaAllocationInfo2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaAllocationInfo2 malloc(MemoryStack stack) {
        return new VmaAllocationInfo2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VmaAllocationInfo2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaAllocationInfo2 calloc(MemoryStack stack) {
        return new VmaAllocationInfo2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VmaAllocationInfo2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaAllocationInfo2.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaAllocationInfo2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaAllocationInfo2.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #allocationInfo}. */
    public static VmaAllocationInfo nallocationInfo(long struct) { return VmaAllocationInfo.create(struct + VmaAllocationInfo2.ALLOCATIONINFO); }
    /** Unsafe version of {@link #blockSize}. */
    public static long nblockSize(long struct) { return memGetLong(struct + VmaAllocationInfo2.BLOCKSIZE); }
    /** Unsafe version of {@link #dedicatedMemory}. */
    public static int ndedicatedMemory(long struct) { return memGetInt(struct + VmaAllocationInfo2.DEDICATEDMEMORY); }

    // -----------------------------------

    /** An array of {@link VmaAllocationInfo2} structs. */
    public static class Buffer extends StructBuffer<VmaAllocationInfo2, Buffer> implements NativeResource {

        private static final VmaAllocationInfo2 ELEMENT_FACTORY = VmaAllocationInfo2.create(-1L);

        /**
         * Creates a new {@code VmaAllocationInfo2.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VmaAllocationInfo2#SIZEOF}, and its mark will be undefined.</p>
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
        protected VmaAllocationInfo2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link VmaAllocationInfo} view of the {@code allocationInfo} field. */
        public VmaAllocationInfo allocationInfo() { return VmaAllocationInfo2.nallocationInfo(address()); }
        /** @return the value of the {@code blockSize} field. */
        @NativeType("VkDeviceSize")
        public long blockSize() { return VmaAllocationInfo2.nblockSize(address()); }
        /** @return the value of the {@code dedicatedMemory} field. */
        @NativeType("VkBool32")
        public boolean dedicatedMemory() { return VmaAllocationInfo2.ndedicatedMemory(address()) != 0; }

    }

}