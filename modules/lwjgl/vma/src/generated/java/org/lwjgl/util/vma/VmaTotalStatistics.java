/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.vma;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * General statistics from current state of the Allocator - total memory usage across all memory heaps and types.
 * 
 * <p>These are slower to calculate. Use for debugging purposes.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VmaTotalStatistics {
 *     {@link VmaDetailedStatistics VmaDetailedStatistics} memoryType[32];
 *     {@link VmaDetailedStatistics VmaDetailedStatistics} memoryHeap[16];
 *     {@link VmaDetailedStatistics VmaDetailedStatistics} total;
 * }</code></pre>
 *
 * @see Vma#vmaCalculateStatistics
 */
public class VmaTotalStatistics extends Struct<VmaTotalStatistics> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MEMORYTYPE,
        MEMORYHEAP,
        TOTAL;

    static {
        Layout layout = __struct(
            __array(VmaDetailedStatistics.SIZEOF, VmaDetailedStatistics.ALIGNOF, 32),
            __array(VmaDetailedStatistics.SIZEOF, VmaDetailedStatistics.ALIGNOF, 16),
            __member(VmaDetailedStatistics.SIZEOF, VmaDetailedStatistics.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MEMORYTYPE = layout.offsetof(0);
        MEMORYHEAP = layout.offsetof(1);
        TOTAL = layout.offsetof(2);
    }

    protected VmaTotalStatistics(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VmaTotalStatistics create(long address, @Nullable ByteBuffer container) {
        return new VmaTotalStatistics(address, container);
    }

    /**
     * Creates a {@code VmaTotalStatistics} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VmaTotalStatistics(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link VmaDetailedStatistics}.Buffer view of the {@code memoryType} field. */
    @NativeType("VmaDetailedStatistics[32]")
    public VmaDetailedStatistics.Buffer memoryType() { return nmemoryType(address()); }
    /** @return a {@link VmaDetailedStatistics} view of the struct at the specified index of the {@code memoryType} field. */
    public VmaDetailedStatistics memoryType(int index) { return nmemoryType(address(), index); }
    /** @return a {@link VmaDetailedStatistics}.Buffer view of the {@code memoryHeap} field. */
    @NativeType("VmaDetailedStatistics[16]")
    public VmaDetailedStatistics.Buffer memoryHeap() { return nmemoryHeap(address()); }
    /** @return a {@link VmaDetailedStatistics} view of the struct at the specified index of the {@code memoryHeap} field. */
    public VmaDetailedStatistics memoryHeap(int index) { return nmemoryHeap(address(), index); }
    /** @return a {@link VmaDetailedStatistics} view of the {@code total} field. */
    public VmaDetailedStatistics total() { return ntotal(address()); }

    // -----------------------------------

    /** Returns a new {@code VmaTotalStatistics} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VmaTotalStatistics malloc() {
        return new VmaTotalStatistics(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VmaTotalStatistics} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VmaTotalStatistics calloc() {
        return new VmaTotalStatistics(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VmaTotalStatistics} instance allocated with {@link BufferUtils}. */
    public static VmaTotalStatistics create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VmaTotalStatistics(memAddress(container), container);
    }

    /** Returns a new {@code VmaTotalStatistics} instance for the specified memory address. */
    public static VmaTotalStatistics create(long address) {
        return new VmaTotalStatistics(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaTotalStatistics createSafe(long address) {
        return address == NULL ? null : new VmaTotalStatistics(address, null);
    }

    /**
     * Returns a new {@link VmaTotalStatistics.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaTotalStatistics.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VmaTotalStatistics.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VmaTotalStatistics.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaTotalStatistics.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VmaTotalStatistics.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VmaTotalStatistics.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VmaTotalStatistics.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaTotalStatistics.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VmaTotalStatistics} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaTotalStatistics malloc(MemoryStack stack) {
        return new VmaTotalStatistics(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VmaTotalStatistics} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaTotalStatistics calloc(MemoryStack stack) {
        return new VmaTotalStatistics(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VmaTotalStatistics.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaTotalStatistics.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VmaTotalStatistics.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VmaTotalStatistics.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #memoryType}. */
    public static VmaDetailedStatistics.Buffer nmemoryType(long struct) { return VmaDetailedStatistics.create(struct + VmaTotalStatistics.MEMORYTYPE, 32); }
    /** Unsafe version of {@link #memoryType(int) memoryType}. */
    public static VmaDetailedStatistics nmemoryType(long struct, int index) {
        return VmaDetailedStatistics.create(struct + VmaTotalStatistics.MEMORYTYPE + check(index, 32) * VmaDetailedStatistics.SIZEOF);
    }
    /** Unsafe version of {@link #memoryHeap}. */
    public static VmaDetailedStatistics.Buffer nmemoryHeap(long struct) { return VmaDetailedStatistics.create(struct + VmaTotalStatistics.MEMORYHEAP, 16); }
    /** Unsafe version of {@link #memoryHeap(int) memoryHeap}. */
    public static VmaDetailedStatistics nmemoryHeap(long struct, int index) {
        return VmaDetailedStatistics.create(struct + VmaTotalStatistics.MEMORYHEAP + check(index, 16) * VmaDetailedStatistics.SIZEOF);
    }
    /** Unsafe version of {@link #total}. */
    public static VmaDetailedStatistics ntotal(long struct) { return VmaDetailedStatistics.create(struct + VmaTotalStatistics.TOTAL); }

    // -----------------------------------

    /** An array of {@link VmaTotalStatistics} structs. */
    public static class Buffer extends StructBuffer<VmaTotalStatistics, Buffer> implements NativeResource {

        private static final VmaTotalStatistics ELEMENT_FACTORY = VmaTotalStatistics.create(-1L);

        /**
         * Creates a new {@code VmaTotalStatistics.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VmaTotalStatistics#SIZEOF}, and its mark will be undefined.</p>
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
        protected VmaTotalStatistics getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link VmaDetailedStatistics}.Buffer view of the {@code memoryType} field. */
        @NativeType("VmaDetailedStatistics[32]")
        public VmaDetailedStatistics.Buffer memoryType() { return VmaTotalStatistics.nmemoryType(address()); }
        /** @return a {@link VmaDetailedStatistics} view of the struct at the specified index of the {@code memoryType} field. */
        public VmaDetailedStatistics memoryType(int index) { return VmaTotalStatistics.nmemoryType(address(), index); }
        /** @return a {@link VmaDetailedStatistics}.Buffer view of the {@code memoryHeap} field. */
        @NativeType("VmaDetailedStatistics[16]")
        public VmaDetailedStatistics.Buffer memoryHeap() { return VmaTotalStatistics.nmemoryHeap(address()); }
        /** @return a {@link VmaDetailedStatistics} view of the struct at the specified index of the {@code memoryHeap} field. */
        public VmaDetailedStatistics memoryHeap(int index) { return VmaTotalStatistics.nmemoryHeap(address(), index); }
        /** @return a {@link VmaDetailedStatistics} view of the {@code total} field. */
        public VmaDetailedStatistics total() { return VmaTotalStatistics.ntotal(address()); }

    }

}