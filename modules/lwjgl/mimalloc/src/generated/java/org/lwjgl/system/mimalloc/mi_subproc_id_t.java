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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct mi_subproc_id_t {
 *     void * _mi_subproc_id;
 * }}</pre>
 */
public class mi_subproc_id_t extends Struct<mi_subproc_id_t> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        _MI_SUBPROC_ID;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        _MI_SUBPROC_ID = layout.offsetof(0);
    }

    protected mi_subproc_id_t(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected mi_subproc_id_t create(long address, @Nullable ByteBuffer container) {
        return new mi_subproc_id_t(address, container);
    }

    /**
     * Creates a {@code mi_subproc_id_t} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public mi_subproc_id_t(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    // -----------------------------------

    /** Returns a new {@code mi_subproc_id_t} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static mi_subproc_id_t malloc() {
        return new mi_subproc_id_t(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code mi_subproc_id_t} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static mi_subproc_id_t calloc() {
        return new mi_subproc_id_t(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code mi_subproc_id_t} instance allocated with {@link BufferUtils}. */
    public static mi_subproc_id_t create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new mi_subproc_id_t(memAddress(container), container);
    }

    /** Returns a new {@code mi_subproc_id_t} instance for the specified memory address. */
    public static mi_subproc_id_t create(long address) {
        return new mi_subproc_id_t(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable mi_subproc_id_t createSafe(long address) {
        return address == NULL ? null : new mi_subproc_id_t(address, null);
    }

    /**
     * Returns a new {@link mi_subproc_id_t.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static mi_subproc_id_t.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link mi_subproc_id_t.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static mi_subproc_id_t.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link mi_subproc_id_t.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static mi_subproc_id_t.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link mi_subproc_id_t.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static mi_subproc_id_t.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static mi_subproc_id_t.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code mi_subproc_id_t} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static mi_subproc_id_t malloc(MemoryStack stack) {
        return new mi_subproc_id_t(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code mi_subproc_id_t} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static mi_subproc_id_t calloc(MemoryStack stack) {
        return new mi_subproc_id_t(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link mi_subproc_id_t.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static mi_subproc_id_t.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link mi_subproc_id_t.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static mi_subproc_id_t.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    static @Nullable ByteBuffer n_mi_subproc_id(long struct, int capacity) { return memByteBufferSafe(memGetAddress(struct + mi_subproc_id_t._MI_SUBPROC_ID), capacity); }

    static void n_mi_subproc_id(long struct, @Nullable ByteBuffer value) { memPutAddress(struct + mi_subproc_id_t._MI_SUBPROC_ID, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link mi_subproc_id_t} structs. */
    public static class Buffer extends StructBuffer<mi_subproc_id_t, Buffer> implements NativeResource {

        private static final mi_subproc_id_t ELEMENT_FACTORY = mi_subproc_id_t.create(-1L);

        /**
         * Creates a new {@code mi_subproc_id_t.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link mi_subproc_id_t#SIZEOF}, and its mark will be undefined.</p>
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
        protected mi_subproc_id_t getElementFactory() {
            return ELEMENT_FACTORY;
        }

    }

}