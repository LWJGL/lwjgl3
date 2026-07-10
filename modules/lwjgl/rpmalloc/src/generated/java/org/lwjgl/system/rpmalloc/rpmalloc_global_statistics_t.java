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
 * <pre>{@code
 * struct rpmalloc_global_statistics_t {
 *     size_t mapped;
 *     size_t mapped_peak;
 *     size_t committed;
 *     size_t decommitted;
 *     size_t active;
 *     size_t active_peak;
 *     size_t huge_alloc;
 *     size_t huge_alloc_peak;
 *     size_t heap_count;
 * }}</pre>
 */
public class rpmalloc_global_statistics_t extends Struct<rpmalloc_global_statistics_t> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MAPPED,
        MAPPED_PEAK,
        COMMITTED,
        DECOMMITTED,
        ACTIVE,
        ACTIVE_PEAK,
        HUGE_ALLOC,
        HUGE_ALLOC_PEAK,
        HEAP_COUNT;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
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
        COMMITTED = layout.offsetof(2);
        DECOMMITTED = layout.offsetof(3);
        ACTIVE = layout.offsetof(4);
        ACTIVE_PEAK = layout.offsetof(5);
        HUGE_ALLOC = layout.offsetof(6);
        HUGE_ALLOC_PEAK = layout.offsetof(7);
        HEAP_COUNT = layout.offsetof(8);
    }

    protected rpmalloc_global_statistics_t(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected rpmalloc_global_statistics_t create(long address, @Nullable ByteBuffer container) {
        return new rpmalloc_global_statistics_t(address, container);
    }

    /**
     * Creates a {@code rpmalloc_global_statistics_t} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public rpmalloc_global_statistics_t(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code mapped} field. */
    @NativeType("size_t")
    public long mapped() { return nmapped(address()); }
    /** @return the value of the {@code mapped_peak} field. */
    @NativeType("size_t")
    public long mapped_peak() { return nmapped_peak(address()); }
    /** @return the value of the {@code committed} field. */
    @NativeType("size_t")
    public long committed() { return ncommitted(address()); }
    /** @return the value of the {@code decommitted} field. */
    @NativeType("size_t")
    public long decommitted() { return ndecommitted(address()); }
    /** @return the value of the {@code active} field. */
    @NativeType("size_t")
    public long active() { return nactive(address()); }
    /** @return the value of the {@code active_peak} field. */
    @NativeType("size_t")
    public long active_peak() { return nactive_peak(address()); }
    /** @return the value of the {@code huge_alloc} field. */
    @NativeType("size_t")
    public long huge_alloc() { return nhuge_alloc(address()); }
    /** @return the value of the {@code huge_alloc_peak} field. */
    @NativeType("size_t")
    public long huge_alloc_peak() { return nhuge_alloc_peak(address()); }
    /** @return the value of the {@code heap_count} field. */
    @NativeType("size_t")
    public long heap_count() { return nheap_count(address()); }

    // -----------------------------------

    /** Returns a new {@code rpmalloc_global_statistics_t} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static rpmalloc_global_statistics_t malloc() {
        return new rpmalloc_global_statistics_t(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code rpmalloc_global_statistics_t} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static rpmalloc_global_statistics_t calloc() {
        return new rpmalloc_global_statistics_t(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code rpmalloc_global_statistics_t} instance allocated with {@link BufferUtils}. */
    public static rpmalloc_global_statistics_t create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new rpmalloc_global_statistics_t(memAddress(container), container);
    }

    /** Returns a new {@code rpmalloc_global_statistics_t} instance for the specified memory address. */
    public static rpmalloc_global_statistics_t create(long address) {
        return new rpmalloc_global_statistics_t(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable rpmalloc_global_statistics_t createSafe(long address) {
        return address == NULL ? null : new rpmalloc_global_statistics_t(address, null);
    }

    /**
     * Returns a new {@link rpmalloc_global_statistics_t.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static rpmalloc_global_statistics_t.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link rpmalloc_global_statistics_t.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static rpmalloc_global_statistics_t.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link rpmalloc_global_statistics_t.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static rpmalloc_global_statistics_t.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link rpmalloc_global_statistics_t.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static rpmalloc_global_statistics_t.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static rpmalloc_global_statistics_t.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code rpmalloc_global_statistics_t} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static rpmalloc_global_statistics_t malloc(MemoryStack stack) {
        return new rpmalloc_global_statistics_t(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code rpmalloc_global_statistics_t} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static rpmalloc_global_statistics_t calloc(MemoryStack stack) {
        return new rpmalloc_global_statistics_t(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link rpmalloc_global_statistics_t.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static rpmalloc_global_statistics_t.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link rpmalloc_global_statistics_t.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static rpmalloc_global_statistics_t.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mapped}. */
    public static long nmapped(long struct) { return memGetAddress(struct + rpmalloc_global_statistics_t.MAPPED); }
    /** Unsafe version of {@link #mapped_peak}. */
    public static long nmapped_peak(long struct) { return memGetAddress(struct + rpmalloc_global_statistics_t.MAPPED_PEAK); }
    /** Unsafe version of {@link #committed}. */
    public static long ncommitted(long struct) { return memGetAddress(struct + rpmalloc_global_statistics_t.COMMITTED); }
    /** Unsafe version of {@link #decommitted}. */
    public static long ndecommitted(long struct) { return memGetAddress(struct + rpmalloc_global_statistics_t.DECOMMITTED); }
    /** Unsafe version of {@link #active}. */
    public static long nactive(long struct) { return memGetAddress(struct + rpmalloc_global_statistics_t.ACTIVE); }
    /** Unsafe version of {@link #active_peak}. */
    public static long nactive_peak(long struct) { return memGetAddress(struct + rpmalloc_global_statistics_t.ACTIVE_PEAK); }
    /** Unsafe version of {@link #huge_alloc}. */
    public static long nhuge_alloc(long struct) { return memGetAddress(struct + rpmalloc_global_statistics_t.HUGE_ALLOC); }
    /** Unsafe version of {@link #huge_alloc_peak}. */
    public static long nhuge_alloc_peak(long struct) { return memGetAddress(struct + rpmalloc_global_statistics_t.HUGE_ALLOC_PEAK); }
    /** Unsafe version of {@link #heap_count}. */
    public static long nheap_count(long struct) { return memGetAddress(struct + rpmalloc_global_statistics_t.HEAP_COUNT); }

    // -----------------------------------

    /** An array of {@link rpmalloc_global_statistics_t} structs. */
    public static class Buffer extends StructBuffer<rpmalloc_global_statistics_t, Buffer> implements NativeResource {

        private static final rpmalloc_global_statistics_t ELEMENT_FACTORY = rpmalloc_global_statistics_t.create(-1L);

        /**
         * Creates a new {@code rpmalloc_global_statistics_t.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link rpmalloc_global_statistics_t#SIZEOF}, and its mark will be undefined.</p>
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
        protected rpmalloc_global_statistics_t getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code mapped} field. */
        @NativeType("size_t")
        public long mapped() { return rpmalloc_global_statistics_t.nmapped(address()); }
        /** @return the value of the {@code mapped_peak} field. */
        @NativeType("size_t")
        public long mapped_peak() { return rpmalloc_global_statistics_t.nmapped_peak(address()); }
        /** @return the value of the {@code committed} field. */
        @NativeType("size_t")
        public long committed() { return rpmalloc_global_statistics_t.ncommitted(address()); }
        /** @return the value of the {@code decommitted} field. */
        @NativeType("size_t")
        public long decommitted() { return rpmalloc_global_statistics_t.ndecommitted(address()); }
        /** @return the value of the {@code active} field. */
        @NativeType("size_t")
        public long active() { return rpmalloc_global_statistics_t.nactive(address()); }
        /** @return the value of the {@code active_peak} field. */
        @NativeType("size_t")
        public long active_peak() { return rpmalloc_global_statistics_t.nactive_peak(address()); }
        /** @return the value of the {@code huge_alloc} field. */
        @NativeType("size_t")
        public long huge_alloc() { return rpmalloc_global_statistics_t.nhuge_alloc(address()); }
        /** @return the value of the {@code huge_alloc_peak} field. */
        @NativeType("size_t")
        public long huge_alloc_peak() { return rpmalloc_global_statistics_t.nhuge_alloc_peak(address()); }
        /** @return the value of the {@code heap_count} field. */
        @NativeType("size_t")
        public long heap_count() { return rpmalloc_global_statistics_t.nheap_count(address()); }

    }

}