/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.harfbuzz;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Data structure for holding user-data keys.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct hb_user_data_key_t {
 *     char unused;
 * }</code></pre>
 */
public class hb_user_data_key_t extends Struct<hb_user_data_key_t> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        UNUSED;

    static {
        Layout layout = __struct(
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        UNUSED = layout.offsetof(0);
    }

    protected hb_user_data_key_t(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected hb_user_data_key_t create(long address, @Nullable ByteBuffer container) {
        return new hb_user_data_key_t(address, container);
    }

    /**
     * Creates a {@code hb_user_data_key_t} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public hb_user_data_key_t(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    // -----------------------------------

    /** Returns a new {@code hb_user_data_key_t} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static hb_user_data_key_t malloc() {
        return new hb_user_data_key_t(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code hb_user_data_key_t} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static hb_user_data_key_t calloc() {
        return new hb_user_data_key_t(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code hb_user_data_key_t} instance allocated with {@link BufferUtils}. */
    public static hb_user_data_key_t create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new hb_user_data_key_t(memAddress(container), container);
    }

    /** Returns a new {@code hb_user_data_key_t} instance for the specified memory address. */
    public static hb_user_data_key_t create(long address) {
        return new hb_user_data_key_t(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hb_user_data_key_t createSafe(long address) {
        return address == NULL ? null : new hb_user_data_key_t(address, null);
    }

    /**
     * Returns a new {@link hb_user_data_key_t.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hb_user_data_key_t.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link hb_user_data_key_t.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hb_user_data_key_t.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hb_user_data_key_t.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static hb_user_data_key_t.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link hb_user_data_key_t.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static hb_user_data_key_t.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hb_user_data_key_t.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code hb_user_data_key_t} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static hb_user_data_key_t malloc(MemoryStack stack) {
        return new hb_user_data_key_t(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code hb_user_data_key_t} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static hb_user_data_key_t calloc(MemoryStack stack) {
        return new hb_user_data_key_t(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link hb_user_data_key_t.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hb_user_data_key_t.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hb_user_data_key_t.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hb_user_data_key_t.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    public static byte nunused(long struct) { return UNSAFE.getByte(null, struct + hb_user_data_key_t.UNUSED); }

    public static void nunused(long struct, byte value) { UNSAFE.putByte(null, struct + hb_user_data_key_t.UNUSED, value); }

    // -----------------------------------

    /** An array of {@link hb_user_data_key_t} structs. */
    public static class Buffer extends StructBuffer<hb_user_data_key_t, Buffer> implements NativeResource {

        private static final hb_user_data_key_t ELEMENT_FACTORY = hb_user_data_key_t.create(-1L);

        /**
         * Creates a new {@code hb_user_data_key_t.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link hb_user_data_key_t#SIZEOF}, and its mark will be undefined.</p>
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
        protected hb_user_data_key_t getElementFactory() {
            return ELEMENT_FACTORY;
        }

    }

}