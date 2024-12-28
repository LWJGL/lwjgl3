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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct SDL_MessageBoxColorScheme {
 *     {@link SDL_MessageBoxColor SDL_MessageBoxColor} colors[5];
 * }}</pre>
 */
public class SDL_MessageBoxColorScheme extends Struct<SDL_MessageBoxColorScheme> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        COLORS;

    static {
        Layout layout = __struct(
            __array(SDL_MessageBoxColor.SIZEOF, SDL_MessageBoxColor.ALIGNOF, 5)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        COLORS = layout.offsetof(0);
    }

    protected SDL_MessageBoxColorScheme(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_MessageBoxColorScheme create(long address, @Nullable ByteBuffer container) {
        return new SDL_MessageBoxColorScheme(address, container);
    }

    /**
     * Creates a {@code SDL_MessageBoxColorScheme} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_MessageBoxColorScheme(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link SDL_MessageBoxColor}.Buffer view of the {@code colors} field. */
    @NativeType("SDL_MessageBoxColor[5]")
    public SDL_MessageBoxColor.Buffer colors() { return ncolors(address()); }
    /** @return a {@link SDL_MessageBoxColor} view of the struct at the specified index of the {@code colors} field. */
    public SDL_MessageBoxColor colors(int index) { return ncolors(address(), index); }

    /** Copies the specified {@link SDL_MessageBoxColor.Buffer} to the {@code colors} field. */
    public SDL_MessageBoxColorScheme colors(@NativeType("SDL_MessageBoxColor[5]") SDL_MessageBoxColor.Buffer value) { ncolors(address(), value); return this; }
    /** Copies the specified {@link SDL_MessageBoxColor} at the specified index of the {@code colors} field. */
    public SDL_MessageBoxColorScheme colors(int index, SDL_MessageBoxColor value) { ncolors(address(), index, value); return this; }
    /** Passes the {@code colors} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_MessageBoxColorScheme colors(java.util.function.Consumer<SDL_MessageBoxColor.Buffer> consumer) { consumer.accept(colors()); return this; }
    /** Passes the element at {@code index} of the {@code colors} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_MessageBoxColorScheme colors(int index, java.util.function.Consumer<SDL_MessageBoxColor> consumer) { consumer.accept(colors(index)); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_MessageBoxColorScheme set(SDL_MessageBoxColorScheme src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_MessageBoxColorScheme} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_MessageBoxColorScheme malloc() {
        return new SDL_MessageBoxColorScheme(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_MessageBoxColorScheme} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_MessageBoxColorScheme calloc() {
        return new SDL_MessageBoxColorScheme(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_MessageBoxColorScheme} instance allocated with {@link BufferUtils}. */
    public static SDL_MessageBoxColorScheme create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_MessageBoxColorScheme(memAddress(container), container);
    }

    /** Returns a new {@code SDL_MessageBoxColorScheme} instance for the specified memory address. */
    public static SDL_MessageBoxColorScheme create(long address) {
        return new SDL_MessageBoxColorScheme(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_MessageBoxColorScheme createSafe(long address) {
        return address == NULL ? null : new SDL_MessageBoxColorScheme(address, null);
    }

    /**
     * Returns a new {@link SDL_MessageBoxColorScheme.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_MessageBoxColorScheme.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_MessageBoxColorScheme.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_MessageBoxColorScheme.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_MessageBoxColorScheme.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_MessageBoxColorScheme.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_MessageBoxColorScheme.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_MessageBoxColorScheme.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_MessageBoxColorScheme.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_MessageBoxColorScheme} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_MessageBoxColorScheme malloc(MemoryStack stack) {
        return new SDL_MessageBoxColorScheme(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_MessageBoxColorScheme} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_MessageBoxColorScheme calloc(MemoryStack stack) {
        return new SDL_MessageBoxColorScheme(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_MessageBoxColorScheme.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_MessageBoxColorScheme.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_MessageBoxColorScheme.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_MessageBoxColorScheme.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #colors}. */
    public static SDL_MessageBoxColor.Buffer ncolors(long struct) { return SDL_MessageBoxColor.create(struct + SDL_MessageBoxColorScheme.COLORS, 5); }
    /** Unsafe version of {@link #colors(int) colors}. */
    public static SDL_MessageBoxColor ncolors(long struct, int index) {
        return SDL_MessageBoxColor.create(struct + SDL_MessageBoxColorScheme.COLORS + check(index, 5) * SDL_MessageBoxColor.SIZEOF);
    }

    /** Unsafe version of {@link #colors(SDL_MessageBoxColor.Buffer) colors}. */
    public static void ncolors(long struct, SDL_MessageBoxColor.Buffer value) {
        if (CHECKS) { checkGT(value, 5); }
        memCopy(value.address(), struct + SDL_MessageBoxColorScheme.COLORS, value.remaining() * SDL_MessageBoxColor.SIZEOF);
    }
    /** Unsafe version of {@link #colors(int, SDL_MessageBoxColor) colors}. */
    public static void ncolors(long struct, int index, SDL_MessageBoxColor value) {
        memCopy(value.address(), struct + SDL_MessageBoxColorScheme.COLORS + check(index, 5) * SDL_MessageBoxColor.SIZEOF, SDL_MessageBoxColor.SIZEOF);
    }

    // -----------------------------------

    /** An array of {@link SDL_MessageBoxColorScheme} structs. */
    public static class Buffer extends StructBuffer<SDL_MessageBoxColorScheme, Buffer> implements NativeResource {

        private static final SDL_MessageBoxColorScheme ELEMENT_FACTORY = SDL_MessageBoxColorScheme.create(-1L);

        /**
         * Creates a new {@code SDL_MessageBoxColorScheme.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_MessageBoxColorScheme#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_MessageBoxColorScheme getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link SDL_MessageBoxColor}.Buffer view of the {@code colors} field. */
        @NativeType("SDL_MessageBoxColor[5]")
        public SDL_MessageBoxColor.Buffer colors() { return SDL_MessageBoxColorScheme.ncolors(address()); }
        /** @return a {@link SDL_MessageBoxColor} view of the struct at the specified index of the {@code colors} field. */
        public SDL_MessageBoxColor colors(int index) { return SDL_MessageBoxColorScheme.ncolors(address(), index); }

        /** Copies the specified {@link SDL_MessageBoxColor.Buffer} to the {@code colors} field. */
        public SDL_MessageBoxColorScheme.Buffer colors(@NativeType("SDL_MessageBoxColor[5]") SDL_MessageBoxColor.Buffer value) { SDL_MessageBoxColorScheme.ncolors(address(), value); return this; }
        /** Copies the specified {@link SDL_MessageBoxColor} at the specified index of the {@code colors} field. */
        public SDL_MessageBoxColorScheme.Buffer colors(int index, SDL_MessageBoxColor value) { SDL_MessageBoxColorScheme.ncolors(address(), index, value); return this; }
        /** Passes the {@code colors} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_MessageBoxColorScheme.Buffer colors(java.util.function.Consumer<SDL_MessageBoxColor.Buffer> consumer) { consumer.accept(colors()); return this; }
        /** Passes the element at {@code index} of the {@code colors} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_MessageBoxColorScheme.Buffer colors(int index, java.util.function.Consumer<SDL_MessageBoxColor> consumer) { consumer.accept(colors(index)); return this; }

    }

}