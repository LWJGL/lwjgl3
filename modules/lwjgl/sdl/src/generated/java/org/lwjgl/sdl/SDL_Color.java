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
 * struct SDL_Color {
 *     Uint8 r;
 *     Uint8 g;
 *     Uint8 b;
 *     Uint8 a;
 * }}</pre>
 */
public class SDL_Color extends Struct<SDL_Color> implements NativeResource {

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
            __member(1),
            __member(1),
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        R = layout.offsetof(0);
        G = layout.offsetof(1);
        B = layout.offsetof(2);
        A = layout.offsetof(3);
    }

    protected SDL_Color(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_Color create(long address, @Nullable ByteBuffer container) {
        return new SDL_Color(address, container);
    }

    /**
     * Creates a {@code SDL_Color} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_Color(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code r} field. */
    @NativeType("Uint8")
    public byte r() { return nr(address()); }
    /** @return the value of the {@code g} field. */
    @NativeType("Uint8")
    public byte g() { return ng(address()); }
    /** @return the value of the {@code b} field. */
    @NativeType("Uint8")
    public byte b() { return nb(address()); }
    /** @return the value of the {@code a} field. */
    @NativeType("Uint8")
    public byte a() { return na(address()); }

    /** Sets the specified value to the {@code r} field. */
    public SDL_Color r(@NativeType("Uint8") byte value) { nr(address(), value); return this; }
    /** Sets the specified value to the {@code g} field. */
    public SDL_Color g(@NativeType("Uint8") byte value) { ng(address(), value); return this; }
    /** Sets the specified value to the {@code b} field. */
    public SDL_Color b(@NativeType("Uint8") byte value) { nb(address(), value); return this; }
    /** Sets the specified value to the {@code a} field. */
    public SDL_Color a(@NativeType("Uint8") byte value) { na(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_Color set(
        byte r,
        byte g,
        byte b,
        byte a
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
    public SDL_Color set(SDL_Color src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_Color} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_Color malloc() {
        return new SDL_Color(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_Color} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_Color calloc() {
        return new SDL_Color(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_Color} instance allocated with {@link BufferUtils}. */
    public static SDL_Color create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_Color(memAddress(container), container);
    }

    /** Returns a new {@code SDL_Color} instance for the specified memory address. */
    public static SDL_Color create(long address) {
        return new SDL_Color(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_Color createSafe(long address) {
        return address == NULL ? null : new SDL_Color(address, null);
    }

    /**
     * Returns a new {@link SDL_Color.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_Color.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_Color.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_Color.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_Color.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_Color.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_Color.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_Color.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_Color.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_Color} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_Color malloc(MemoryStack stack) {
        return new SDL_Color(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_Color} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_Color calloc(MemoryStack stack) {
        return new SDL_Color(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_Color.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_Color.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_Color.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_Color.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #r}. */
    public static byte nr(long struct) { return memGetByte(struct + SDL_Color.R); }
    /** Unsafe version of {@link #g}. */
    public static byte ng(long struct) { return memGetByte(struct + SDL_Color.G); }
    /** Unsafe version of {@link #b}. */
    public static byte nb(long struct) { return memGetByte(struct + SDL_Color.B); }
    /** Unsafe version of {@link #a}. */
    public static byte na(long struct) { return memGetByte(struct + SDL_Color.A); }

    /** Unsafe version of {@link #r(byte) r}. */
    public static void nr(long struct, byte value) { memPutByte(struct + SDL_Color.R, value); }
    /** Unsafe version of {@link #g(byte) g}. */
    public static void ng(long struct, byte value) { memPutByte(struct + SDL_Color.G, value); }
    /** Unsafe version of {@link #b(byte) b}. */
    public static void nb(long struct, byte value) { memPutByte(struct + SDL_Color.B, value); }
    /** Unsafe version of {@link #a(byte) a}. */
    public static void na(long struct, byte value) { memPutByte(struct + SDL_Color.A, value); }

    // -----------------------------------

    /** An array of {@link SDL_Color} structs. */
    public static class Buffer extends StructBuffer<SDL_Color, Buffer> implements NativeResource {

        private static final SDL_Color ELEMENT_FACTORY = SDL_Color.create(-1L);

        /**
         * Creates a new {@code SDL_Color.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_Color#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_Color getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code r} field. */
        @NativeType("Uint8")
        public byte r() { return SDL_Color.nr(address()); }
        /** @return the value of the {@code g} field. */
        @NativeType("Uint8")
        public byte g() { return SDL_Color.ng(address()); }
        /** @return the value of the {@code b} field. */
        @NativeType("Uint8")
        public byte b() { return SDL_Color.nb(address()); }
        /** @return the value of the {@code a} field. */
        @NativeType("Uint8")
        public byte a() { return SDL_Color.na(address()); }

        /** Sets the specified value to the {@code r} field. */
        public SDL_Color.Buffer r(@NativeType("Uint8") byte value) { SDL_Color.nr(address(), value); return this; }
        /** Sets the specified value to the {@code g} field. */
        public SDL_Color.Buffer g(@NativeType("Uint8") byte value) { SDL_Color.ng(address(), value); return this; }
        /** Sets the specified value to the {@code b} field. */
        public SDL_Color.Buffer b(@NativeType("Uint8") byte value) { SDL_Color.nb(address(), value); return this; }
        /** Sets the specified value to the {@code a} field. */
        public SDL_Color.Buffer a(@NativeType("Uint8") byte value) { SDL_Color.na(address(), value); return this; }

    }

}