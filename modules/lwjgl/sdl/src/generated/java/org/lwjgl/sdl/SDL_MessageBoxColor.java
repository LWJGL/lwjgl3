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
 * struct SDL_MessageBoxColor {
 *     Uint8 r;
 *     Uint8 g;
 *     Uint8 b;
 * }}</pre>
 */
public class SDL_MessageBoxColor extends Struct<SDL_MessageBoxColor> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        R,
        G,
        B;

    static {
        Layout layout = __struct(
            __member(1),
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        R = layout.offsetof(0);
        G = layout.offsetof(1);
        B = layout.offsetof(2);
    }

    protected SDL_MessageBoxColor(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_MessageBoxColor create(long address, @Nullable ByteBuffer container) {
        return new SDL_MessageBoxColor(address, container);
    }

    /**
     * Creates a {@code SDL_MessageBoxColor} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_MessageBoxColor(ByteBuffer container) {
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

    /** Sets the specified value to the {@code r} field. */
    public SDL_MessageBoxColor r(@NativeType("Uint8") byte value) { nr(address(), value); return this; }
    /** Sets the specified value to the {@code g} field. */
    public SDL_MessageBoxColor g(@NativeType("Uint8") byte value) { ng(address(), value); return this; }
    /** Sets the specified value to the {@code b} field. */
    public SDL_MessageBoxColor b(@NativeType("Uint8") byte value) { nb(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_MessageBoxColor set(
        byte r,
        byte g,
        byte b
    ) {
        r(r);
        g(g);
        b(b);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_MessageBoxColor set(SDL_MessageBoxColor src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_MessageBoxColor} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_MessageBoxColor malloc() {
        return new SDL_MessageBoxColor(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_MessageBoxColor} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_MessageBoxColor calloc() {
        return new SDL_MessageBoxColor(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_MessageBoxColor} instance allocated with {@link BufferUtils}. */
    public static SDL_MessageBoxColor create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_MessageBoxColor(memAddress(container), container);
    }

    /** Returns a new {@code SDL_MessageBoxColor} instance for the specified memory address. */
    public static SDL_MessageBoxColor create(long address) {
        return new SDL_MessageBoxColor(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_MessageBoxColor createSafe(long address) {
        return address == NULL ? null : new SDL_MessageBoxColor(address, null);
    }

    /**
     * Returns a new {@link SDL_MessageBoxColor.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_MessageBoxColor.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_MessageBoxColor.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_MessageBoxColor.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_MessageBoxColor.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_MessageBoxColor.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_MessageBoxColor.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_MessageBoxColor.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_MessageBoxColor.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_MessageBoxColor} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_MessageBoxColor malloc(MemoryStack stack) {
        return new SDL_MessageBoxColor(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_MessageBoxColor} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_MessageBoxColor calloc(MemoryStack stack) {
        return new SDL_MessageBoxColor(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_MessageBoxColor.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_MessageBoxColor.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_MessageBoxColor.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_MessageBoxColor.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #r}. */
    public static byte nr(long struct) { return memGetByte(struct + SDL_MessageBoxColor.R); }
    /** Unsafe version of {@link #g}. */
    public static byte ng(long struct) { return memGetByte(struct + SDL_MessageBoxColor.G); }
    /** Unsafe version of {@link #b}. */
    public static byte nb(long struct) { return memGetByte(struct + SDL_MessageBoxColor.B); }

    /** Unsafe version of {@link #r(byte) r}. */
    public static void nr(long struct, byte value) { memPutByte(struct + SDL_MessageBoxColor.R, value); }
    /** Unsafe version of {@link #g(byte) g}. */
    public static void ng(long struct, byte value) { memPutByte(struct + SDL_MessageBoxColor.G, value); }
    /** Unsafe version of {@link #b(byte) b}. */
    public static void nb(long struct, byte value) { memPutByte(struct + SDL_MessageBoxColor.B, value); }

    // -----------------------------------

    /** An array of {@link SDL_MessageBoxColor} structs. */
    public static class Buffer extends StructBuffer<SDL_MessageBoxColor, Buffer> implements NativeResource {

        private static final SDL_MessageBoxColor ELEMENT_FACTORY = SDL_MessageBoxColor.create(-1L);

        /**
         * Creates a new {@code SDL_MessageBoxColor.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_MessageBoxColor#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_MessageBoxColor getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code r} field. */
        @NativeType("Uint8")
        public byte r() { return SDL_MessageBoxColor.nr(address()); }
        /** @return the value of the {@code g} field. */
        @NativeType("Uint8")
        public byte g() { return SDL_MessageBoxColor.ng(address()); }
        /** @return the value of the {@code b} field. */
        @NativeType("Uint8")
        public byte b() { return SDL_MessageBoxColor.nb(address()); }

        /** Sets the specified value to the {@code r} field. */
        public SDL_MessageBoxColor.Buffer r(@NativeType("Uint8") byte value) { SDL_MessageBoxColor.nr(address(), value); return this; }
        /** Sets the specified value to the {@code g} field. */
        public SDL_MessageBoxColor.Buffer g(@NativeType("Uint8") byte value) { SDL_MessageBoxColor.ng(address(), value); return this; }
        /** Sets the specified value to the {@code b} field. */
        public SDL_MessageBoxColor.Buffer b(@NativeType("Uint8") byte value) { SDL_MessageBoxColor.nb(address(), value); return this; }

    }

}