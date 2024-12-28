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
 * struct SDL_GPUViewport {
 *     float x;
 *     float y;
 *     float w;
 *     float h;
 *     float min_depth;
 *     float max_depth;
 * }}</pre>
 */
public class SDL_GPUViewport extends Struct<SDL_GPUViewport> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        X,
        Y,
        W,
        H,
        MIN_DEPTH,
        MAX_DEPTH;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
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
        MIN_DEPTH = layout.offsetof(4);
        MAX_DEPTH = layout.offsetof(5);
    }

    protected SDL_GPUViewport(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_GPUViewport create(long address, @Nullable ByteBuffer container) {
        return new SDL_GPUViewport(address, container);
    }

    /**
     * Creates a {@code SDL_GPUViewport} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_GPUViewport(ByteBuffer container) {
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
    /** @return the value of the {@code min_depth} field. */
    public float min_depth() { return nmin_depth(address()); }
    /** @return the value of the {@code max_depth} field. */
    public float max_depth() { return nmax_depth(address()); }

    /** Sets the specified value to the {@code x} field. */
    public SDL_GPUViewport x(float value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public SDL_GPUViewport y(float value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@code w} field. */
    public SDL_GPUViewport w(float value) { nw(address(), value); return this; }
    /** Sets the specified value to the {@code h} field. */
    public SDL_GPUViewport h(float value) { nh(address(), value); return this; }
    /** Sets the specified value to the {@code min_depth} field. */
    public SDL_GPUViewport min_depth(float value) { nmin_depth(address(), value); return this; }
    /** Sets the specified value to the {@code max_depth} field. */
    public SDL_GPUViewport max_depth(float value) { nmax_depth(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_GPUViewport set(
        float x,
        float y,
        float w,
        float h,
        float min_depth,
        float max_depth
    ) {
        x(x);
        y(y);
        w(w);
        h(h);
        min_depth(min_depth);
        max_depth(max_depth);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_GPUViewport set(SDL_GPUViewport src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_GPUViewport} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_GPUViewport malloc() {
        return new SDL_GPUViewport(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUViewport} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_GPUViewport calloc() {
        return new SDL_GPUViewport(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUViewport} instance allocated with {@link BufferUtils}. */
    public static SDL_GPUViewport create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUViewport(memAddress(container), container);
    }

    /** Returns a new {@code SDL_GPUViewport} instance for the specified memory address. */
    public static SDL_GPUViewport create(long address) {
        return new SDL_GPUViewport(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_GPUViewport createSafe(long address) {
        return address == NULL ? null : new SDL_GPUViewport(address, null);
    }

    /**
     * Returns a new {@link SDL_GPUViewport.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUViewport.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUViewport.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUViewport.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUViewport.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUViewport.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_GPUViewport.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_GPUViewport.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_GPUViewport.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_GPUViewport} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUViewport malloc(MemoryStack stack) {
        return new SDL_GPUViewport(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_GPUViewport} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUViewport calloc(MemoryStack stack) {
        return new SDL_GPUViewport(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_GPUViewport.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUViewport.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUViewport.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUViewport.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static float nx(long struct) { return memGetFloat(struct + SDL_GPUViewport.X); }
    /** Unsafe version of {@link #y}. */
    public static float ny(long struct) { return memGetFloat(struct + SDL_GPUViewport.Y); }
    /** Unsafe version of {@link #w}. */
    public static float nw(long struct) { return memGetFloat(struct + SDL_GPUViewport.W); }
    /** Unsafe version of {@link #h}. */
    public static float nh(long struct) { return memGetFloat(struct + SDL_GPUViewport.H); }
    /** Unsafe version of {@link #min_depth}. */
    public static float nmin_depth(long struct) { return memGetFloat(struct + SDL_GPUViewport.MIN_DEPTH); }
    /** Unsafe version of {@link #max_depth}. */
    public static float nmax_depth(long struct) { return memGetFloat(struct + SDL_GPUViewport.MAX_DEPTH); }

    /** Unsafe version of {@link #x(float) x}. */
    public static void nx(long struct, float value) { memPutFloat(struct + SDL_GPUViewport.X, value); }
    /** Unsafe version of {@link #y(float) y}. */
    public static void ny(long struct, float value) { memPutFloat(struct + SDL_GPUViewport.Y, value); }
    /** Unsafe version of {@link #w(float) w}. */
    public static void nw(long struct, float value) { memPutFloat(struct + SDL_GPUViewport.W, value); }
    /** Unsafe version of {@link #h(float) h}. */
    public static void nh(long struct, float value) { memPutFloat(struct + SDL_GPUViewport.H, value); }
    /** Unsafe version of {@link #min_depth(float) min_depth}. */
    public static void nmin_depth(long struct, float value) { memPutFloat(struct + SDL_GPUViewport.MIN_DEPTH, value); }
    /** Unsafe version of {@link #max_depth(float) max_depth}. */
    public static void nmax_depth(long struct, float value) { memPutFloat(struct + SDL_GPUViewport.MAX_DEPTH, value); }

    // -----------------------------------

    /** An array of {@link SDL_GPUViewport} structs. */
    public static class Buffer extends StructBuffer<SDL_GPUViewport, Buffer> implements NativeResource {

        private static final SDL_GPUViewport ELEMENT_FACTORY = SDL_GPUViewport.create(-1L);

        /**
         * Creates a new {@code SDL_GPUViewport.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_GPUViewport#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_GPUViewport getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code x} field. */
        public float x() { return SDL_GPUViewport.nx(address()); }
        /** @return the value of the {@code y} field. */
        public float y() { return SDL_GPUViewport.ny(address()); }
        /** @return the value of the {@code w} field. */
        public float w() { return SDL_GPUViewport.nw(address()); }
        /** @return the value of the {@code h} field. */
        public float h() { return SDL_GPUViewport.nh(address()); }
        /** @return the value of the {@code min_depth} field. */
        public float min_depth() { return SDL_GPUViewport.nmin_depth(address()); }
        /** @return the value of the {@code max_depth} field. */
        public float max_depth() { return SDL_GPUViewport.nmax_depth(address()); }

        /** Sets the specified value to the {@code x} field. */
        public SDL_GPUViewport.Buffer x(float value) { SDL_GPUViewport.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public SDL_GPUViewport.Buffer y(float value) { SDL_GPUViewport.ny(address(), value); return this; }
        /** Sets the specified value to the {@code w} field. */
        public SDL_GPUViewport.Buffer w(float value) { SDL_GPUViewport.nw(address(), value); return this; }
        /** Sets the specified value to the {@code h} field. */
        public SDL_GPUViewport.Buffer h(float value) { SDL_GPUViewport.nh(address(), value); return this; }
        /** Sets the specified value to the {@code min_depth} field. */
        public SDL_GPUViewport.Buffer min_depth(float value) { SDL_GPUViewport.nmin_depth(address(), value); return this; }
        /** Sets the specified value to the {@code max_depth} field. */
        public SDL_GPUViewport.Buffer max_depth(float value) { SDL_GPUViewport.nmax_depth(address(), value); return this; }

    }

}