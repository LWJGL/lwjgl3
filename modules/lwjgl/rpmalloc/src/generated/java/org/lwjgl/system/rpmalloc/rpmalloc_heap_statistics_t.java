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
 * struct rpmalloc_heap_statistics_t {
 *     size_t allocated_size;
 *     size_t committed_size;
 *     size_t mapped_size;
 * }}</pre>
 */
@NativeType("struct rpmalloc_heap_statistics_t")
public class rpmalloc_heap_statistics_t extends Struct<rpmalloc_heap_statistics_t> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ALLOCATED_SIZE,
        COMMITTED_SIZE,
        MAPPED_SIZE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ALLOCATED_SIZE = layout.offsetof(0);
        COMMITTED_SIZE = layout.offsetof(1);
        MAPPED_SIZE = layout.offsetof(2);
    }

    protected rpmalloc_heap_statistics_t(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected rpmalloc_heap_statistics_t create(long address, @Nullable ByteBuffer container) {
        return new rpmalloc_heap_statistics_t(address, container);
    }

    /**
     * Creates a {@code rpmalloc_heap_statistics_t} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public rpmalloc_heap_statistics_t(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code allocated_size} field. */
    @NativeType("size_t")
    public long allocated_size() { return nallocated_size(address()); }
    /** @return the value of the {@code committed_size} field. */
    @NativeType("size_t")
    public long committed_size() { return ncommitted_size(address()); }
    /** @return the value of the {@code mapped_size} field. */
    @NativeType("size_t")
    public long mapped_size() { return nmapped_size(address()); }

    // -----------------------------------

    /** Returns a new {@code rpmalloc_heap_statistics_t} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static rpmalloc_heap_statistics_t malloc() {
        return new rpmalloc_heap_statistics_t(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code rpmalloc_heap_statistics_t} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static rpmalloc_heap_statistics_t calloc() {
        return new rpmalloc_heap_statistics_t(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code rpmalloc_heap_statistics_t} instance allocated with {@link BufferUtils}. */
    public static rpmalloc_heap_statistics_t create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new rpmalloc_heap_statistics_t(memAddress(container), container);
    }

    /** Returns a new {@code rpmalloc_heap_statistics_t} instance for the specified memory address. */
    public static rpmalloc_heap_statistics_t create(long address) {
        return new rpmalloc_heap_statistics_t(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable rpmalloc_heap_statistics_t createSafe(long address) {
        return address == NULL ? null : new rpmalloc_heap_statistics_t(address, null);
    }

    /**
     * Returns a new {@link rpmalloc_heap_statistics_t.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static rpmalloc_heap_statistics_t.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link rpmalloc_heap_statistics_t.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static rpmalloc_heap_statistics_t.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link rpmalloc_heap_statistics_t.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static rpmalloc_heap_statistics_t.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link rpmalloc_heap_statistics_t.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static rpmalloc_heap_statistics_t.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static rpmalloc_heap_statistics_t.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code rpmalloc_heap_statistics_t} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static rpmalloc_heap_statistics_t malloc(MemoryStack stack) {
        return new rpmalloc_heap_statistics_t(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code rpmalloc_heap_statistics_t} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static rpmalloc_heap_statistics_t calloc(MemoryStack stack) {
        return new rpmalloc_heap_statistics_t(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link rpmalloc_heap_statistics_t.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static rpmalloc_heap_statistics_t.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link rpmalloc_heap_statistics_t.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static rpmalloc_heap_statistics_t.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #allocated_size}. */
    public static long nallocated_size(long struct) { return memGetAddress(struct + rpmalloc_heap_statistics_t.ALLOCATED_SIZE); }
    /** Unsafe version of {@link #committed_size}. */
    public static long ncommitted_size(long struct) { return memGetAddress(struct + rpmalloc_heap_statistics_t.COMMITTED_SIZE); }
    /** Unsafe version of {@link #mapped_size}. */
    public static long nmapped_size(long struct) { return memGetAddress(struct + rpmalloc_heap_statistics_t.MAPPED_SIZE); }

    // -----------------------------------

    /** An array of {@link rpmalloc_heap_statistics_t} structs. */
    public static class Buffer extends StructBuffer<rpmalloc_heap_statistics_t, Buffer> implements NativeResource {

        private static final rpmalloc_heap_statistics_t ELEMENT_FACTORY = rpmalloc_heap_statistics_t.create(-1L);

        /**
         * Creates a new {@code rpmalloc_heap_statistics_t.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link rpmalloc_heap_statistics_t#SIZEOF}, and its mark will be undefined.</p>
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
        protected rpmalloc_heap_statistics_t getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code allocated_size} field. */
        @NativeType("size_t")
        public long allocated_size() { return rpmalloc_heap_statistics_t.nallocated_size(address()); }
        /** @return the value of the {@code committed_size} field. */
        @NativeType("size_t")
        public long committed_size() { return rpmalloc_heap_statistics_t.ncommitted_size(address()); }
        /** @return the value of the {@code mapped_size} field. */
        @NativeType("size_t")
        public long mapped_size() { return rpmalloc_heap_statistics_t.nmapped_size(address()); }

    }

}