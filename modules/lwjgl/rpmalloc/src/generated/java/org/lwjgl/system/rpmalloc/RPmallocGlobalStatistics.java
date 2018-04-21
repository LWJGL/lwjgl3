/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.rpmalloc;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code mapped} &ndash; Current amount of virtual memory mapped (only if {@code ENABLE_STATISTICS=1})</li>
 * <li>{@code cached} &ndash; Current amount of memory in global caches for small and medium sizes (<64KiB)</li>
 * <li>{@code mapped_total} &ndash; Total amount of memory mapped (only if {@code ENABLE_STATISTICS=1})</li>
 * <li>{@code unmapped_total} &ndash; Total amount of memory unmapped (only if {@code ENABLE_STATISTICS=1})</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct rpmalloc_global_statistics_t {
 *     size_t mapped;
 *     size_t cached;
 *     size_t mapped_total;
 *     size_t unmapped_total;
 * }</pre></code>
 */
@NativeType("struct rpmalloc_global_statistics_t")
public class RPmallocGlobalStatistics extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MAPPED,
        CACHED,
        MAPPED_TOTAL,
        UNMAPPED_TOTAL;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MAPPED = layout.offsetof(0);
        CACHED = layout.offsetof(1);
        MAPPED_TOTAL = layout.offsetof(2);
        UNMAPPED_TOTAL = layout.offsetof(3);
    }

    RPmallocGlobalStatistics(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link RPmallocGlobalStatistics} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public RPmallocGlobalStatistics(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code mapped} field. */
    @NativeType("size_t")
    public long mapped() { return nmapped(address()); }
    /** Returns the value of the {@code cached} field. */
    @NativeType("size_t")
    public long cached() { return ncached(address()); }
    /** Returns the value of the {@code mapped_total} field. */
    @NativeType("size_t")
    public long mapped_total() { return nmapped_total(address()); }
    /** Returns the value of the {@code unmapped_total} field. */
    @NativeType("size_t")
    public long unmapped_total() { return nunmapped_total(address()); }

    // -----------------------------------

    /** Returns a new {@link RPmallocGlobalStatistics} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static RPmallocGlobalStatistics malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link RPmallocGlobalStatistics} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static RPmallocGlobalStatistics calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link RPmallocGlobalStatistics} instance allocated with {@link BufferUtils}. */
    public static RPmallocGlobalStatistics create() {
        return new RPmallocGlobalStatistics(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link RPmallocGlobalStatistics} instance for the specified memory address. */
    public static RPmallocGlobalStatistics create(long address) {
        return new RPmallocGlobalStatistics(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static RPmallocGlobalStatistics createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link RPmallocGlobalStatistics.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static RPmallocGlobalStatistics.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RPmallocGlobalStatistics.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static RPmallocGlobalStatistics.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RPmallocGlobalStatistics.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static RPmallocGlobalStatistics.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
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
    @Nullable
    public static RPmallocGlobalStatistics.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link RPmallocGlobalStatistics} instance allocated on the thread-local {@link MemoryStack}. */
    public static RPmallocGlobalStatistics mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link RPmallocGlobalStatistics} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static RPmallocGlobalStatistics callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link RPmallocGlobalStatistics} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static RPmallocGlobalStatistics mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link RPmallocGlobalStatistics} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static RPmallocGlobalStatistics callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link RPmallocGlobalStatistics.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static RPmallocGlobalStatistics.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link RPmallocGlobalStatistics.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static RPmallocGlobalStatistics.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link RPmallocGlobalStatistics.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static RPmallocGlobalStatistics.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RPmallocGlobalStatistics.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static RPmallocGlobalStatistics.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mapped}. */
    public static long nmapped(long struct) { return memGetAddress(struct + RPmallocGlobalStatistics.MAPPED); }
    /** Unsafe version of {@link #cached}. */
    public static long ncached(long struct) { return memGetAddress(struct + RPmallocGlobalStatistics.CACHED); }
    /** Unsafe version of {@link #mapped_total}. */
    public static long nmapped_total(long struct) { return memGetAddress(struct + RPmallocGlobalStatistics.MAPPED_TOTAL); }
    /** Unsafe version of {@link #unmapped_total}. */
    public static long nunmapped_total(long struct) { return memGetAddress(struct + RPmallocGlobalStatistics.UNMAPPED_TOTAL); }

    // -----------------------------------

    /** An array of {@link RPmallocGlobalStatistics} structs. */
    public static class Buffer extends StructBuffer<RPmallocGlobalStatistics, Buffer> implements NativeResource {

        /**
         * Creates a new {@link RPmallocGlobalStatistics.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link RPmallocGlobalStatistics#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected RPmallocGlobalStatistics newInstance(long address) {
            return new RPmallocGlobalStatistics(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code mapped} field. */
        @NativeType("size_t")
        public long mapped() { return RPmallocGlobalStatistics.nmapped(address()); }
        /** Returns the value of the {@code cached} field. */
        @NativeType("size_t")
        public long cached() { return RPmallocGlobalStatistics.ncached(address()); }
        /** Returns the value of the {@code mapped_total} field. */
        @NativeType("size_t")
        public long mapped_total() { return RPmallocGlobalStatistics.nmapped_total(address()); }
        /** Returns the value of the {@code unmapped_total} field. */
        @NativeType("size_t")
        public long unmapped_total() { return RPmallocGlobalStatistics.nunmapped_total(address()); }

    }

}