/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.rpmalloc;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct rpmalloc_global_statistics_t {
 *     size_t {@link #mapped};
 *     size_t {@link #mapped_peak};
 *     size_t {@link #cached};
 *     size_t {@link #huge_alloc};
 *     size_t {@link #huge_alloc_peak};
 *     size_t {@link #mapped_total};
 *     size_t {@link #unmapped_total};
 * }</code></pre>
 */
@NativeType("struct rpmalloc_global_statistics_t")
public class RPmallocGlobalStatistics extends Struct<RPmallocGlobalStatistics> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MAPPED,
        MAPPED_PEAK,
        CACHED,
        HUGE_ALLOC,
        HUGE_ALLOC_PEAK,
        MAPPED_TOTAL,
        UNMAPPED_TOTAL;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MAPPED = layout.offsetof(0);
        MAPPED_PEAK = layout.offsetof(1);
        CACHED = layout.offsetof(2);
        HUGE_ALLOC = layout.offsetof(3);
        HUGE_ALLOC_PEAK = layout.offsetof(4);
        MAPPED_TOTAL = layout.offsetof(5);
        UNMAPPED_TOTAL = layout.offsetof(6);
    }

    protected RPmallocGlobalStatistics(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected RPmallocGlobalStatistics create(long address, @Nullable ByteBuffer container) {
        return new RPmallocGlobalStatistics(address, container);
    }

    /**
     * Creates a {@code RPmallocGlobalStatistics} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public RPmallocGlobalStatistics(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Current amount of virtual memory mapped, all of which might not have been committed (only if {@code ENABLE_STATISTICS=1}) */
    @NativeType("size_t")
    public long mapped() { return nmapped(address()); }
    /** Peak amount of virtual memory mapped, all of which might not have been committed (only if {@code ENABLE_STATISTICS=1}) */
    @NativeType("size_t")
    public long mapped_peak() { return nmapped_peak(address()); }
    /** Current amount of memory in global caches for small and medium sizes (&lt;32KiB) */
    @NativeType("size_t")
    public long cached() { return ncached(address()); }
    /**
     * Current amount of memory allocated in huge allocations, i.e larger than {@code LARGE_SIZE_LIMIT} which is 2MiB by default (only if
     * {@code ENABLE_STATISTICS=1})
     */
    @NativeType("size_t")
    public long huge_alloc() { return nhuge_alloc(address()); }
    /**
     * Peak amount of memory allocated in huge allocations, i.e larger than {@code LARGE_SIZE_LIMIT} which is 2MiB by default (only if
     * {@code ENABLE_STATISTICS=1})
     */
    @NativeType("size_t")
    public long huge_alloc_peak() { return nhuge_alloc_peak(address()); }
    /** Total amount of memory mapped since initialization (only if {@code ENABLE_STATISTICS=1}) */
    @NativeType("size_t")
    public long mapped_total() { return nmapped_total(address()); }
    /** Total amount of memory unmapped since initialization  (only if {@code ENABLE_STATISTICS=1}) */
    @NativeType("size_t")
    public long unmapped_total() { return nunmapped_total(address()); }

    // -----------------------------------

    /** Returns a new {@code RPmallocGlobalStatistics} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static RPmallocGlobalStatistics malloc() {
        return new RPmallocGlobalStatistics(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code RPmallocGlobalStatistics} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static RPmallocGlobalStatistics calloc() {
        return new RPmallocGlobalStatistics(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code RPmallocGlobalStatistics} instance allocated with {@link BufferUtils}. */
    public static RPmallocGlobalStatistics create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new RPmallocGlobalStatistics(memAddress(container), container);
    }

    /** Returns a new {@code RPmallocGlobalStatistics} instance for the specified memory address. */
    public static RPmallocGlobalStatistics create(long address) {
        return new RPmallocGlobalStatistics(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable RPmallocGlobalStatistics createSafe(long address) {
        return address == NULL ? null : new RPmallocGlobalStatistics(address, null);
    }

    /**
     * Returns a new {@link RPmallocGlobalStatistics.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static RPmallocGlobalStatistics.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link RPmallocGlobalStatistics.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static RPmallocGlobalStatistics.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RPmallocGlobalStatistics.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static RPmallocGlobalStatistics.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link RPmallocGlobalStatistics.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static RPmallocGlobalStatistics.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static RPmallocGlobalStatistics.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static RPmallocGlobalStatistics mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static RPmallocGlobalStatistics callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static RPmallocGlobalStatistics mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static RPmallocGlobalStatistics callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static RPmallocGlobalStatistics.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static RPmallocGlobalStatistics.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static RPmallocGlobalStatistics.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static RPmallocGlobalStatistics.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code RPmallocGlobalStatistics} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static RPmallocGlobalStatistics malloc(MemoryStack stack) {
        return new RPmallocGlobalStatistics(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code RPmallocGlobalStatistics} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static RPmallocGlobalStatistics calloc(MemoryStack stack) {
        return new RPmallocGlobalStatistics(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link RPmallocGlobalStatistics.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static RPmallocGlobalStatistics.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RPmallocGlobalStatistics.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static RPmallocGlobalStatistics.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mapped}. */
    public static long nmapped(long struct) { return memGetAddress(struct + RPmallocGlobalStatistics.MAPPED); }
    /** Unsafe version of {@link #mapped_peak}. */
    public static long nmapped_peak(long struct) { return memGetAddress(struct + RPmallocGlobalStatistics.MAPPED_PEAK); }
    /** Unsafe version of {@link #cached}. */
    public static long ncached(long struct) { return memGetAddress(struct + RPmallocGlobalStatistics.CACHED); }
    /** Unsafe version of {@link #huge_alloc}. */
    public static long nhuge_alloc(long struct) { return memGetAddress(struct + RPmallocGlobalStatistics.HUGE_ALLOC); }
    /** Unsafe version of {@link #huge_alloc_peak}. */
    public static long nhuge_alloc_peak(long struct) { return memGetAddress(struct + RPmallocGlobalStatistics.HUGE_ALLOC_PEAK); }
    /** Unsafe version of {@link #mapped_total}. */
    public static long nmapped_total(long struct) { return memGetAddress(struct + RPmallocGlobalStatistics.MAPPED_TOTAL); }
    /** Unsafe version of {@link #unmapped_total}. */
    public static long nunmapped_total(long struct) { return memGetAddress(struct + RPmallocGlobalStatistics.UNMAPPED_TOTAL); }

    // -----------------------------------

    /** An array of {@link RPmallocGlobalStatistics} structs. */
    public static class Buffer extends StructBuffer<RPmallocGlobalStatistics, Buffer> implements NativeResource {

        private static final RPmallocGlobalStatistics ELEMENT_FACTORY = RPmallocGlobalStatistics.create(-1L);

        /**
         * Creates a new {@code RPmallocGlobalStatistics.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link RPmallocGlobalStatistics#SIZEOF}, and its mark will be undefined.</p>
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
        protected RPmallocGlobalStatistics getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link RPmallocGlobalStatistics#mapped} field. */
        @NativeType("size_t")
        public long mapped() { return RPmallocGlobalStatistics.nmapped(address()); }
        /** @return the value of the {@link RPmallocGlobalStatistics#mapped_peak} field. */
        @NativeType("size_t")
        public long mapped_peak() { return RPmallocGlobalStatistics.nmapped_peak(address()); }
        /** @return the value of the {@link RPmallocGlobalStatistics#cached} field. */
        @NativeType("size_t")
        public long cached() { return RPmallocGlobalStatistics.ncached(address()); }
        /** @return the value of the {@link RPmallocGlobalStatistics#huge_alloc} field. */
        @NativeType("size_t")
        public long huge_alloc() { return RPmallocGlobalStatistics.nhuge_alloc(address()); }
        /** @return the value of the {@link RPmallocGlobalStatistics#huge_alloc_peak} field. */
        @NativeType("size_t")
        public long huge_alloc_peak() { return RPmallocGlobalStatistics.nhuge_alloc_peak(address()); }
        /** @return the value of the {@link RPmallocGlobalStatistics#mapped_total} field. */
        @NativeType("size_t")
        public long mapped_total() { return RPmallocGlobalStatistics.nmapped_total(address()); }
        /** @return the value of the {@link RPmallocGlobalStatistics#unmapped_total} field. */
        @NativeType("size_t")
        public long unmapped_total() { return RPmallocGlobalStatistics.nunmapped_total(address()); }

    }

}