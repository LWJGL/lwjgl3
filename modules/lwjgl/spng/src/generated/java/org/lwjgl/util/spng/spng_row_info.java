/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.spng;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct spng_row_info {
 *     uint32_t scanline_idx;
 *     uint32_t row_num;
 *     int pass;
 *     uint8_t filter;
 * }}</pre>
 */
@NativeType("struct spng_row_info")
public class spng_row_info extends Struct<spng_row_info> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SCANLINE_IDX,
        ROW_NUM,
        PASS,
        FILTER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SCANLINE_IDX = layout.offsetof(0);
        ROW_NUM = layout.offsetof(1);
        PASS = layout.offsetof(2);
        FILTER = layout.offsetof(3);
    }

    protected spng_row_info(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected spng_row_info create(long address, @Nullable ByteBuffer container) {
        return new spng_row_info(address, container);
    }

    /**
     * Creates a {@code spng_row_info} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public spng_row_info(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code scanline_idx} field. */
    @NativeType("uint32_t")
    public int scanline_idx() { return nscanline_idx(address()); }
    /** @return the value of the {@code row_num} field. */
    @NativeType("uint32_t")
    public int row_num() { return nrow_num(address()); }
    /** @return the value of the {@code pass} field. */
    public int pass() { return npass(address()); }
    /** @return the value of the {@code filter} field. */
    @NativeType("uint8_t")
    public byte filter() { return nfilter(address()); }

    // -----------------------------------

    /** Returns a new {@code spng_row_info} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static spng_row_info malloc() {
        return new spng_row_info(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code spng_row_info} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static spng_row_info calloc() {
        return new spng_row_info(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code spng_row_info} instance allocated with {@link BufferUtils}. */
    public static spng_row_info create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new spng_row_info(memAddress(container), container);
    }

    /** Returns a new {@code spng_row_info} instance for the specified memory address. */
    public static spng_row_info create(long address) {
        return new spng_row_info(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable spng_row_info createSafe(long address) {
        return address == NULL ? null : new spng_row_info(address, null);
    }

    /**
     * Returns a new {@link spng_row_info.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static spng_row_info.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link spng_row_info.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static spng_row_info.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link spng_row_info.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static spng_row_info.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link spng_row_info.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static spng_row_info.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static spng_row_info.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code spng_row_info} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static spng_row_info malloc(MemoryStack stack) {
        return new spng_row_info(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code spng_row_info} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static spng_row_info calloc(MemoryStack stack) {
        return new spng_row_info(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link spng_row_info.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static spng_row_info.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link spng_row_info.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static spng_row_info.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #scanline_idx}. */
    public static int nscanline_idx(long struct) { return memGetInt(struct + spng_row_info.SCANLINE_IDX); }
    /** Unsafe version of {@link #row_num}. */
    public static int nrow_num(long struct) { return memGetInt(struct + spng_row_info.ROW_NUM); }
    /** Unsafe version of {@link #pass}. */
    public static int npass(long struct) { return memGetInt(struct + spng_row_info.PASS); }
    /** Unsafe version of {@link #filter}. */
    public static byte nfilter(long struct) { return memGetByte(struct + spng_row_info.FILTER); }

    // -----------------------------------

    /** An array of {@link spng_row_info} structs. */
    public static class Buffer extends StructBuffer<spng_row_info, Buffer> implements NativeResource {

        private static final spng_row_info ELEMENT_FACTORY = spng_row_info.create(-1L);

        /**
         * Creates a new {@code spng_row_info.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link spng_row_info#SIZEOF}, and its mark will be undefined.</p>
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
        protected spng_row_info getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code scanline_idx} field. */
        @NativeType("uint32_t")
        public int scanline_idx() { return spng_row_info.nscanline_idx(address()); }
        /** @return the value of the {@code row_num} field. */
        @NativeType("uint32_t")
        public int row_num() { return spng_row_info.nrow_num(address()); }
        /** @return the value of the {@code pass} field. */
        public int pass() { return spng_row_info.npass(address()); }
        /** @return the value of the {@code filter} field. */
        @NativeType("uint8_t")
        public byte filter() { return spng_row_info.nfilter(address()); }

    }

}