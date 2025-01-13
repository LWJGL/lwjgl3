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
 * struct SDL_FColor {
 *     float r;
 *     float g;
 *     float b;
 *     float a;
 * }}</pre>
 */
public class SDL_FColor extends Struct<SDL_FColor> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        R,
        G,
        B,
        A;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        R = layout.offsetof(0);
        G = layout.offsetof(1);
        B = layout.offsetof(2);
        A = layout.offsetof(3);
    }

    protected SDL_FColor(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_FColor create(long address, @Nullable ByteBuffer container) {
        return new SDL_FColor(address, container);
    }

    /**
     * Creates a {@code SDL_FColor} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_FColor(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code r} field. */
    public float r() { return nr(address()); }
    /** @return the value of the {@code g} field. */
    public float g() { return ng(address()); }
    /** @return the value of the {@code b} field. */
    public float b() { return nb(address()); }
    /** @return the value of the {@code a} field. */
    public float a() { return na(address()); }

    /** Sets the specified value to the {@code r} field. */
    public SDL_FColor r(float value) { nr(address(), value); return this; }
    /** Sets the specified value to the {@code g} field. */
    public SDL_FColor g(float value) { ng(address(), value); return this; }
    /** Sets the specified value to the {@code b} field. */
    public SDL_FColor b(float value) { nb(address(), value); return this; }
    /** Sets the specified value to the {@code a} field. */
    public SDL_FColor a(float value) { na(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_FColor set(
        float r,
        float g,
        float b,
        float a
    ) {
        r(r);
        g(g);
        b(b);
        a(a);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_FColor set(SDL_FColor src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_FColor} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_FColor malloc() {
        return new SDL_FColor(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_FColor} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_FColor calloc() {
        return new SDL_FColor(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_FColor} instance allocated with {@link BufferUtils}. */
    public static SDL_FColor create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_FColor(memAddress(container), container);
    }

    /** Returns a new {@code SDL_FColor} instance for the specified memory address. */
    public static SDL_FColor create(long address) {
        return new SDL_FColor(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_FColor createSafe(long address) {
        return address == NULL ? null : new SDL_FColor(address, null);
    }

    /**
     * Returns a new {@link SDL_FColor.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_FColor.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_FColor.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_FColor.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_FColor.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_FColor.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_FColor.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_FColor.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_FColor.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_FColor} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_FColor malloc(MemoryStack stack) {
        return new SDL_FColor(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_FColor} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_FColor calloc(MemoryStack stack) {
        return new SDL_FColor(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_FColor.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_FColor.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_FColor.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_FColor.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #r}. */
    public static float nr(long struct) { return memGetFloat(struct + SDL_FColor.R); }
    /** Unsafe version of {@link #g}. */
    public static float ng(long struct) { return memGetFloat(struct + SDL_FColor.G); }
    /** Unsafe version of {@link #b}. */
    public static float nb(long struct) { return memGetFloat(struct + SDL_FColor.B); }
    /** Unsafe version of {@link #a}. */
    public static float na(long struct) { return memGetFloat(struct + SDL_FColor.A); }

    /** Unsafe version of {@link #r(float) r}. */
    public static void nr(long struct, float value) { memPutFloat(struct + SDL_FColor.R, value); }
    /** Unsafe version of {@link #g(float) g}. */
    public static void ng(long struct, float value) { memPutFloat(struct + SDL_FColor.G, value); }
    /** Unsafe version of {@link #b(float) b}. */
    public static void nb(long struct, float value) { memPutFloat(struct + SDL_FColor.B, value); }
    /** Unsafe version of {@link #a(float) a}. */
    public static void na(long struct, float value) { memPutFloat(struct + SDL_FColor.A, value); }

    // -----------------------------------

    /** An array of {@link SDL_FColor} structs. */
    public static class Buffer extends StructBuffer<SDL_FColor, Buffer> implements NativeResource {

        private static final SDL_FColor ELEMENT_FACTORY = SDL_FColor.create(-1L);

        /**
         * Creates a new {@code SDL_FColor.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_FColor#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_FColor getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code r} field. */
        public float r() { return SDL_FColor.nr(address()); }
        /** @return the value of the {@code g} field. */
        public float g() { return SDL_FColor.ng(address()); }
        /** @return the value of the {@code b} field. */
        public float b() { return SDL_FColor.nb(address()); }
        /** @return the value of the {@code a} field. */
        public float a() { return SDL_FColor.na(address()); }

        /** Sets the specified value to the {@code r} field. */
        public SDL_FColor.Buffer r(float value) { SDL_FColor.nr(address(), value); return this; }
        /** Sets the specified value to the {@code g} field. */
        public SDL_FColor.Buffer g(float value) { SDL_FColor.ng(address(), value); return this; }
        /** Sets the specified value to the {@code b} field. */
        public SDL_FColor.Buffer b(float value) { SDL_FColor.nb(address(), value); return this; }
        /** Sets the specified value to the {@code a} field. */
        public SDL_FColor.Buffer a(float value) { SDL_FColor.na(address(), value); return this; }

    }

}