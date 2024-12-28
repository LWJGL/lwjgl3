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
 * struct SDL_Palette {
 *     int ncolors;
 *     {@link SDL_Color SDL_Color} * colors;
 *     Uint32 version;
 *     int refcount;
 * }}</pre>
 */
public class SDL_Palette extends Struct<SDL_Palette> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NCOLORS,
        COLORS,
        VERSION,
        REFCOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NCOLORS = layout.offsetof(0);
        COLORS = layout.offsetof(1);
        VERSION = layout.offsetof(2);
        REFCOUNT = layout.offsetof(3);
    }

    protected SDL_Palette(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_Palette create(long address, @Nullable ByteBuffer container) {
        return new SDL_Palette(address, container);
    }

    /**
     * Creates a {@code SDL_Palette} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_Palette(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code ncolors} field. */
    public int ncolors() { return nncolors(address()); }
    /** @return a {@link SDL_Color.Buffer} view of the struct array pointed to by the {@code colors} field. */
    @NativeType("SDL_Color *")
    public SDL_Color.Buffer colors() { return ncolors(address()); }

    // -----------------------------------

    /** Returns a new {@code SDL_Palette} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_Palette malloc() {
        return new SDL_Palette(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_Palette} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_Palette calloc() {
        return new SDL_Palette(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_Palette} instance allocated with {@link BufferUtils}. */
    public static SDL_Palette create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_Palette(memAddress(container), container);
    }

    /** Returns a new {@code SDL_Palette} instance for the specified memory address. */
    public static SDL_Palette create(long address) {
        return new SDL_Palette(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_Palette createSafe(long address) {
        return address == NULL ? null : new SDL_Palette(address, null);
    }

    /**
     * Returns a new {@link SDL_Palette.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_Palette.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_Palette.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_Palette.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_Palette.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_Palette.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_Palette.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_Palette.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_Palette.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_Palette} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_Palette malloc(MemoryStack stack) {
        return new SDL_Palette(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_Palette} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_Palette calloc(MemoryStack stack) {
        return new SDL_Palette(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_Palette.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_Palette.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_Palette.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_Palette.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #ncolors}. */
    public static int nncolors(long struct) { return memGetInt(struct + SDL_Palette.NCOLORS); }
    /** Unsafe version of {@link #colors}. */
    public static SDL_Color.Buffer ncolors(long struct) { return SDL_Color.create(memGetAddress(struct + SDL_Palette.COLORS), nncolors(struct)); }
    public static int nversion(long struct) { return memGetInt(struct + SDL_Palette.VERSION); }
    public static int nrefcount(long struct) { return memGetInt(struct + SDL_Palette.REFCOUNT); }

    // -----------------------------------

    /** An array of {@link SDL_Palette} structs. */
    public static class Buffer extends StructBuffer<SDL_Palette, Buffer> implements NativeResource {

        private static final SDL_Palette ELEMENT_FACTORY = SDL_Palette.create(-1L);

        /**
         * Creates a new {@code SDL_Palette.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_Palette#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_Palette getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code ncolors} field. */
        public int ncolors() { return SDL_Palette.nncolors(address()); }
        /** @return a {@link SDL_Color.Buffer} view of the struct array pointed to by the {@code colors} field. */
        @NativeType("SDL_Color *")
        public SDL_Color.Buffer colors() { return SDL_Palette.ncolors(address()); }

    }

}