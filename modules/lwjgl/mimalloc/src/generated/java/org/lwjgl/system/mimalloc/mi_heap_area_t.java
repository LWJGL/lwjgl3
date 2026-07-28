/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.mimalloc;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct mi_heap_area_t {
 *     void * blocks;
 *     size_t reserved;
 *     size_t committed;
 *     size_t used;
 *     size_t block_size;
 *     size_t full_block_size;
 *     void * reserved1;
 * }}</pre>
 */
public class mi_heap_area_t extends Struct<mi_heap_area_t> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BLOCKS,
        RESERVED,
        COMMITTED,
        USED,
        BLOCK_SIZE,
        FULL_BLOCK_SIZE,
        RESERVED1;

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

        BLOCKS = layout.offsetof(0);
        RESERVED = layout.offsetof(1);
        COMMITTED = layout.offsetof(2);
        USED = layout.offsetof(3);
        BLOCK_SIZE = layout.offsetof(4);
        FULL_BLOCK_SIZE = layout.offsetof(5);
        RESERVED1 = layout.offsetof(6);
    }

    protected mi_heap_area_t(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected mi_heap_area_t create(long address, @Nullable ByteBuffer container) {
        return new mi_heap_area_t(address, container);
    }

    /**
     * Creates a {@code mi_heap_area_t} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public mi_heap_area_t(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code blocks} field. */
    @NativeType("void *")
    public long blocks() { return nblocks(address()); }
    /** @return the value of the {@code reserved} field. */
    @NativeType("size_t")
    public long reserved() { return nreserved(address()); }
    /** @return the value of the {@code committed} field. */
    @NativeType("size_t")
    public long committed() { return ncommitted(address()); }
    /** @return the value of the {@code used} field. */
    @NativeType("size_t")
    public long used() { return nused(address()); }
    /** @return the value of the {@code block_size} field. */
    @NativeType("size_t")
    public long block_size() { return nblock_size(address()); }
    /** @return the value of the {@code full_block_size} field. */
    @NativeType("size_t")
    public long full_block_size() { return nfull_block_size(address()); }

    /** Sets the specified value to the {@code blocks} field. */
    public mi_heap_area_t blocks(@NativeType("void *") long value) { nblocks(address(), value); return this; }
    /** Sets the specified value to the {@code reserved} field. */
    public mi_heap_area_t reserved(@NativeType("size_t") long value) { nreserved(address(), value); return this; }
    /** Sets the specified value to the {@code committed} field. */
    public mi_heap_area_t committed(@NativeType("size_t") long value) { ncommitted(address(), value); return this; }
    /** Sets the specified value to the {@code used} field. */
    public mi_heap_area_t used(@NativeType("size_t") long value) { nused(address(), value); return this; }
    /** Sets the specified value to the {@code block_size} field. */
    public mi_heap_area_t block_size(@NativeType("size_t") long value) { nblock_size(address(), value); return this; }
    /** Sets the specified value to the {@code full_block_size} field. */
    public mi_heap_area_t full_block_size(@NativeType("size_t") long value) { nfull_block_size(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public mi_heap_area_t set(
        long blocks,
        long reserved,
        long committed,
        long used,
        long block_size,
        long full_block_size
    ) {
        blocks(blocks);
        reserved(reserved);
        committed(committed);
        used(used);
        block_size(block_size);
        full_block_size(full_block_size);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public mi_heap_area_t set(mi_heap_area_t src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code mi_heap_area_t} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static mi_heap_area_t malloc() {
        return new mi_heap_area_t(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code mi_heap_area_t} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static mi_heap_area_t calloc() {
        return new mi_heap_area_t(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code mi_heap_area_t} instance allocated with {@link BufferUtils}. */
    public static mi_heap_area_t create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new mi_heap_area_t(memAddress(container), container);
    }

    /** Returns a new {@code mi_heap_area_t} instance for the specified memory address. */
    public static mi_heap_area_t create(long address) {
        return new mi_heap_area_t(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable mi_heap_area_t createSafe(long address) {
        return address == NULL ? null : new mi_heap_area_t(address, null);
    }

    /**
     * Returns a new {@link mi_heap_area_t.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static mi_heap_area_t.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link mi_heap_area_t.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static mi_heap_area_t.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link mi_heap_area_t.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static mi_heap_area_t.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link mi_heap_area_t.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static mi_heap_area_t.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static mi_heap_area_t.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code mi_heap_area_t} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static mi_heap_area_t malloc(MemoryStack stack) {
        return new mi_heap_area_t(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code mi_heap_area_t} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static mi_heap_area_t calloc(MemoryStack stack) {
        return new mi_heap_area_t(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link mi_heap_area_t.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static mi_heap_area_t.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link mi_heap_area_t.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static mi_heap_area_t.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #blocks}. */
    public static long nblocks(long struct) { return memGetAddress(struct + mi_heap_area_t.BLOCKS); }
    /** Unsafe version of {@link #reserved}. */
    public static long nreserved(long struct) { return memGetAddress(struct + mi_heap_area_t.RESERVED); }
    /** Unsafe version of {@link #committed}. */
    public static long ncommitted(long struct) { return memGetAddress(struct + mi_heap_area_t.COMMITTED); }
    /** Unsafe version of {@link #used}. */
    public static long nused(long struct) { return memGetAddress(struct + mi_heap_area_t.USED); }
    /** Unsafe version of {@link #block_size}. */
    public static long nblock_size(long struct) { return memGetAddress(struct + mi_heap_area_t.BLOCK_SIZE); }
    /** Unsafe version of {@link #full_block_size}. */
    public static long nfull_block_size(long struct) { return memGetAddress(struct + mi_heap_area_t.FULL_BLOCK_SIZE); }
    static long nreserved1(long struct) { return memGetAddress(struct + mi_heap_area_t.RESERVED1); }

    /** Unsafe version of {@link #blocks(long) blocks}. */
    public static void nblocks(long struct, long value) { memPutAddress(struct + mi_heap_area_t.BLOCKS, check(value)); }
    /** Unsafe version of {@link #reserved(long) reserved}. */
    public static void nreserved(long struct, long value) { memPutAddress(struct + mi_heap_area_t.RESERVED, value); }
    /** Unsafe version of {@link #committed(long) committed}. */
    public static void ncommitted(long struct, long value) { memPutAddress(struct + mi_heap_area_t.COMMITTED, value); }
    /** Unsafe version of {@link #used(long) used}. */
    public static void nused(long struct, long value) { memPutAddress(struct + mi_heap_area_t.USED, value); }
    /** Unsafe version of {@link #block_size(long) block_size}. */
    public static void nblock_size(long struct, long value) { memPutAddress(struct + mi_heap_area_t.BLOCK_SIZE, value); }
    /** Unsafe version of {@link #full_block_size(long) full_block_size}. */
    public static void nfull_block_size(long struct, long value) { memPutAddress(struct + mi_heap_area_t.FULL_BLOCK_SIZE, value); }
    static void nreserved1(long struct, long value) { memPutAddress(struct + mi_heap_area_t.RESERVED1, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + mi_heap_area_t.BLOCKS));
    }

    // -----------------------------------

    /** An array of {@link mi_heap_area_t} structs. */
    public static class Buffer extends StructBuffer<mi_heap_area_t, Buffer> implements NativeResource {

        private static final mi_heap_area_t ELEMENT_FACTORY = mi_heap_area_t.create(-1L);

        /**
         * Creates a new {@code mi_heap_area_t.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link mi_heap_area_t#SIZEOF}, and its mark will be undefined.</p>
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
        protected mi_heap_area_t getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code blocks} field. */
        @NativeType("void *")
        public long blocks() { return mi_heap_area_t.nblocks(address()); }
        /** @return the value of the {@code reserved} field. */
        @NativeType("size_t")
        public long reserved() { return mi_heap_area_t.nreserved(address()); }
        /** @return the value of the {@code committed} field. */
        @NativeType("size_t")
        public long committed() { return mi_heap_area_t.ncommitted(address()); }
        /** @return the value of the {@code used} field. */
        @NativeType("size_t")
        public long used() { return mi_heap_area_t.nused(address()); }
        /** @return the value of the {@code block_size} field. */
        @NativeType("size_t")
        public long block_size() { return mi_heap_area_t.nblock_size(address()); }
        /** @return the value of the {@code full_block_size} field. */
        @NativeType("size_t")
        public long full_block_size() { return mi_heap_area_t.nfull_block_size(address()); }

        /** Sets the specified value to the {@code blocks} field. */
        public mi_heap_area_t.Buffer blocks(@NativeType("void *") long value) { mi_heap_area_t.nblocks(address(), value); return this; }
        /** Sets the specified value to the {@code reserved} field. */
        public mi_heap_area_t.Buffer reserved(@NativeType("size_t") long value) { mi_heap_area_t.nreserved(address(), value); return this; }
        /** Sets the specified value to the {@code committed} field. */
        public mi_heap_area_t.Buffer committed(@NativeType("size_t") long value) { mi_heap_area_t.ncommitted(address(), value); return this; }
        /** Sets the specified value to the {@code used} field. */
        public mi_heap_area_t.Buffer used(@NativeType("size_t") long value) { mi_heap_area_t.nused(address(), value); return this; }
        /** Sets the specified value to the {@code block_size} field. */
        public mi_heap_area_t.Buffer block_size(@NativeType("size_t") long value) { mi_heap_area_t.nblock_size(address(), value); return this; }
        /** Sets the specified value to the {@code full_block_size} field. */
        public mi_heap_area_t.Buffer full_block_size(@NativeType("size_t") long value) { mi_heap_area_t.nfull_block_size(address(), value); return this; }

    }

}