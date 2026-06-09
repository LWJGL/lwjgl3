/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.tinyexr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct ExrBox2i {
 *     int32_t min_x;
 *     int32_t min_y;
 *     int32_t max_x;
 *     int32_t max_y;
 * }}</pre>
 */
public class ExrBox2i extends Struct<ExrBox2i> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MIN_X,
        MIN_Y,
        MAX_X,
        MAX_Y;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MIN_X = layout.offsetof(0);
        MIN_Y = layout.offsetof(1);
        MAX_X = layout.offsetof(2);
        MAX_Y = layout.offsetof(3);
    }

    protected ExrBox2i(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ExrBox2i create(long address, @Nullable ByteBuffer container) {
        return new ExrBox2i(address, container);
    }

    /**
     * Creates a {@code ExrBox2i} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ExrBox2i(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code min_x} field. */
    @NativeType("int32_t")
    public int min_x() { return nmin_x(address()); }
    /** @return the value of the {@code min_y} field. */
    @NativeType("int32_t")
    public int min_y() { return nmin_y(address()); }
    /** @return the value of the {@code max_x} field. */
    @NativeType("int32_t")
    public int max_x() { return nmax_x(address()); }
    /** @return the value of the {@code max_y} field. */
    @NativeType("int32_t")
    public int max_y() { return nmax_y(address()); }

    /** Sets the specified value to the {@code min_x} field. */
    public ExrBox2i min_x(@NativeType("int32_t") int value) { nmin_x(address(), value); return this; }
    /** Sets the specified value to the {@code min_y} field. */
    public ExrBox2i min_y(@NativeType("int32_t") int value) { nmin_y(address(), value); return this; }
    /** Sets the specified value to the {@code max_x} field. */
    public ExrBox2i max_x(@NativeType("int32_t") int value) { nmax_x(address(), value); return this; }
    /** Sets the specified value to the {@code max_y} field. */
    public ExrBox2i max_y(@NativeType("int32_t") int value) { nmax_y(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ExrBox2i set(
        int min_x,
        int min_y,
        int max_x,
        int max_y
    ) {
        min_x(min_x);
        min_y(min_y);
        max_x(max_x);
        max_y(max_y);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ExrBox2i set(ExrBox2i src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ExrBox2i} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ExrBox2i malloc() {
        return new ExrBox2i(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ExrBox2i} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ExrBox2i calloc() {
        return new ExrBox2i(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ExrBox2i} instance allocated with {@link BufferUtils}. */
    public static ExrBox2i create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ExrBox2i(memAddress(container), container);
    }

    /** Returns a new {@code ExrBox2i} instance for the specified memory address. */
    public static ExrBox2i create(long address) {
        return new ExrBox2i(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ExrBox2i createSafe(long address) {
        return address == NULL ? null : new ExrBox2i(address, null);
    }

    /**
     * Returns a new {@link ExrBox2i.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrBox2i.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ExrBox2i.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrBox2i.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrBox2i.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ExrBox2i.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ExrBox2i.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ExrBox2i.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ExrBox2i.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ExrBox2i} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrBox2i malloc(MemoryStack stack) {
        return new ExrBox2i(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ExrBox2i} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrBox2i calloc(MemoryStack stack) {
        return new ExrBox2i(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ExrBox2i.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrBox2i.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrBox2i.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrBox2i.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #min_x}. */
    public static int nmin_x(long struct) { return memGetInt(struct + ExrBox2i.MIN_X); }
    /** Unsafe version of {@link #min_y}. */
    public static int nmin_y(long struct) { return memGetInt(struct + ExrBox2i.MIN_Y); }
    /** Unsafe version of {@link #max_x}. */
    public static int nmax_x(long struct) { return memGetInt(struct + ExrBox2i.MAX_X); }
    /** Unsafe version of {@link #max_y}. */
    public static int nmax_y(long struct) { return memGetInt(struct + ExrBox2i.MAX_Y); }

    /** Unsafe version of {@link #min_x(int) min_x}. */
    public static void nmin_x(long struct, int value) { memPutInt(struct + ExrBox2i.MIN_X, value); }
    /** Unsafe version of {@link #min_y(int) min_y}. */
    public static void nmin_y(long struct, int value) { memPutInt(struct + ExrBox2i.MIN_Y, value); }
    /** Unsafe version of {@link #max_x(int) max_x}. */
    public static void nmax_x(long struct, int value) { memPutInt(struct + ExrBox2i.MAX_X, value); }
    /** Unsafe version of {@link #max_y(int) max_y}. */
    public static void nmax_y(long struct, int value) { memPutInt(struct + ExrBox2i.MAX_Y, value); }

    // -----------------------------------

    /** An array of {@link ExrBox2i} structs. */
    public static class Buffer extends StructBuffer<ExrBox2i, Buffer> implements NativeResource {

        private static final ExrBox2i ELEMENT_FACTORY = ExrBox2i.create(-1L);

        /**
         * Creates a new {@code ExrBox2i.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ExrBox2i#SIZEOF}, and its mark will be undefined.</p>
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
        protected ExrBox2i getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code min_x} field. */
        @NativeType("int32_t")
        public int min_x() { return ExrBox2i.nmin_x(address()); }
        /** @return the value of the {@code min_y} field. */
        @NativeType("int32_t")
        public int min_y() { return ExrBox2i.nmin_y(address()); }
        /** @return the value of the {@code max_x} field. */
        @NativeType("int32_t")
        public int max_x() { return ExrBox2i.nmax_x(address()); }
        /** @return the value of the {@code max_y} field. */
        @NativeType("int32_t")
        public int max_y() { return ExrBox2i.nmax_y(address()); }

        /** Sets the specified value to the {@code min_x} field. */
        public ExrBox2i.Buffer min_x(@NativeType("int32_t") int value) { ExrBox2i.nmin_x(address(), value); return this; }
        /** Sets the specified value to the {@code min_y} field. */
        public ExrBox2i.Buffer min_y(@NativeType("int32_t") int value) { ExrBox2i.nmin_y(address(), value); return this; }
        /** Sets the specified value to the {@code max_x} field. */
        public ExrBox2i.Buffer max_x(@NativeType("int32_t") int value) { ExrBox2i.nmax_x(address(), value); return this; }
        /** Sets the specified value to the {@code max_y} field. */
        public ExrBox2i.Buffer max_y(@NativeType("int32_t") int value) { ExrBox2i.nmax_y(address(), value); return this; }

    }

}