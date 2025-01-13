/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct SDL_FRect {
 *     float x;
 *     float y;
 *     float w;
 *     float h;
 * }}</pre>
 */
public class SDL_FRect extends Struct<SDL_FRect> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        X,
        Y,
        W,
        H;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        X = layout.offsetof(0);
        Y = layout.offsetof(1);
        W = layout.offsetof(2);
        H = layout.offsetof(3);
    }

    protected SDL_FRect(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_FRect create(long address, @Nullable ByteBuffer container) {
        return new SDL_FRect(address, container);
    }

    /**
     * Creates a {@code SDL_FRect} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_FRect(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code x} field. */
    public float x() { return nx(address()); }
    /** @return the value of the {@code y} field. */
    public float y() { return ny(address()); }
    /** @return the value of the {@code w} field. */
    public float w() { return nw(address()); }
    /** @return the value of the {@code h} field. */
    public float h() { return nh(address()); }

    /** Sets the specified value to the {@code x} field. */
    public SDL_FRect x(float value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public SDL_FRect y(float value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@code w} field. */
    public SDL_FRect w(float value) { nw(address(), value); return this; }
    /** Sets the specified value to the {@code h} field. */
    public SDL_FRect h(float value) { nh(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_FRect set(
        float x,
        float y,
        float w,
        float h
    ) {
        x(x);
        y(y);
        w(w);
        h(h);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_FRect set(SDL_FRect src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_FRect} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_FRect malloc() {
        return new SDL_FRect(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_FRect} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_FRect calloc() {
        return new SDL_FRect(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_FRect} instance allocated with {@link BufferUtils}. */
    public static SDL_FRect create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_FRect(memAddress(container), container);
    }

    /** Returns a new {@code SDL_FRect} instance for the specified memory address. */
    public static SDL_FRect create(long address) {
        return new SDL_FRect(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_FRect createSafe(long address) {
        return address == NULL ? null : new SDL_FRect(address, null);
    }

    /**
     * Returns a new {@link SDL_FRect.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_FRect.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_FRect.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_FRect.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_FRect.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_FRect.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_FRect.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_FRect.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_FRect.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_FRect} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_FRect malloc(MemoryStack stack) {
        return new SDL_FRect(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_FRect} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_FRect calloc(MemoryStack stack) {
        return new SDL_FRect(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_FRect.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_FRect.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_FRect.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_FRect.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static float nx(long struct) { return memGetFloat(struct + SDL_FRect.X); }
    /** Unsafe version of {@link #y}. */
    public static float ny(long struct) { return memGetFloat(struct + SDL_FRect.Y); }
    /** Unsafe version of {@link #w}. */
    public static float nw(long struct) { return memGetFloat(struct + SDL_FRect.W); }
    /** Unsafe version of {@link #h}. */
    public static float nh(long struct) { return memGetFloat(struct + SDL_FRect.H); }

    /** Unsafe version of {@link #x(float) x}. */
    public static void nx(long struct, float value) { memPutFloat(struct + SDL_FRect.X, value); }
    /** Unsafe version of {@link #y(float) y}. */
    public static void ny(long struct, float value) { memPutFloat(struct + SDL_FRect.Y, value); }
    /** Unsafe version of {@link #w(float) w}. */
    public static void nw(long struct, float value) { memPutFloat(struct + SDL_FRect.W, value); }
    /** Unsafe version of {@link #h(float) h}. */
    public static void nh(long struct, float value) { memPutFloat(struct + SDL_FRect.H, value); }

    // -----------------------------------

    /** An array of {@link SDL_FRect} structs. */
    public static class Buffer extends StructBuffer<SDL_FRect, Buffer> implements NativeResource {

        private static final SDL_FRect ELEMENT_FACTORY = SDL_FRect.create(-1L);

        /**
         * Creates a new {@code SDL_FRect.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_FRect#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_FRect getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code x} field. */
        public float x() { return SDL_FRect.nx(address()); }
        /** @return the value of the {@code y} field. */
        public float y() { return SDL_FRect.ny(address()); }
        /** @return the value of the {@code w} field. */
        public float w() { return SDL_FRect.nw(address()); }
        /** @return the value of the {@code h} field. */
        public float h() { return SDL_FRect.nh(address()); }

        /** Sets the specified value to the {@code x} field. */
        public SDL_FRect.Buffer x(float value) { SDL_FRect.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public SDL_FRect.Buffer y(float value) { SDL_FRect.ny(address(), value); return this; }
        /** Sets the specified value to the {@code w} field. */
        public SDL_FRect.Buffer w(float value) { SDL_FRect.nw(address(), value); return this; }
        /** Sets the specified value to the {@code h} field. */
        public SDL_FRect.Buffer h(float value) { SDL_FRect.nh(address(), value); return this; }

    }

}