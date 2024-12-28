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
 * struct SDL_Texture {
 *     SDL_PixelFormat format;
 *     int w;
 *     int h;
 *     int refcount;
 * }}</pre>
 */
public class SDL_Texture extends Struct<SDL_Texture> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FORMAT,
        W,
        H,
        REFCOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FORMAT = layout.offsetof(0);
        W = layout.offsetof(1);
        H = layout.offsetof(2);
        REFCOUNT = layout.offsetof(3);
    }

    protected SDL_Texture(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_Texture create(long address, @Nullable ByteBuffer container) {
        return new SDL_Texture(address, container);
    }

    /**
     * Creates a {@code SDL_Texture} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_Texture(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code format} field. */
    @NativeType("SDL_PixelFormat")
    public int format() { return nformat(address()); }
    /** @return the value of the {@code w} field. */
    public int w() { return nw(address()); }
    /** @return the value of the {@code h} field. */
    public int h() { return nh(address()); }
    /** @return the value of the {@code refcount} field. */
    public int refcount() { return nrefcount(address()); }

    /** Sets the specified value to the {@code format} field. */
    public SDL_Texture format(@NativeType("SDL_PixelFormat") int value) { nformat(address(), value); return this; }
    /** Sets the specified value to the {@code w} field. */
    public SDL_Texture w(int value) { nw(address(), value); return this; }
    /** Sets the specified value to the {@code h} field. */
    public SDL_Texture h(int value) { nh(address(), value); return this; }
    /** Sets the specified value to the {@code refcount} field. */
    public SDL_Texture refcount(int value) { nrefcount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_Texture set(
        int format,
        int w,
        int h,
        int refcount
    ) {
        format(format);
        w(w);
        h(h);
        refcount(refcount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_Texture set(SDL_Texture src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_Texture} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_Texture malloc() {
        return new SDL_Texture(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_Texture} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_Texture calloc() {
        return new SDL_Texture(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_Texture} instance allocated with {@link BufferUtils}. */
    public static SDL_Texture create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_Texture(memAddress(container), container);
    }

    /** Returns a new {@code SDL_Texture} instance for the specified memory address. */
    public static SDL_Texture create(long address) {
        return new SDL_Texture(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_Texture createSafe(long address) {
        return address == NULL ? null : new SDL_Texture(address, null);
    }

    /**
     * Returns a new {@link SDL_Texture.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_Texture.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_Texture.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_Texture.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_Texture.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_Texture.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_Texture.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_Texture.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_Texture.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_Texture} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_Texture malloc(MemoryStack stack) {
        return new SDL_Texture(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_Texture} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_Texture calloc(MemoryStack stack) {
        return new SDL_Texture(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_Texture.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_Texture.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_Texture.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_Texture.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return memGetInt(struct + SDL_Texture.FORMAT); }
    /** Unsafe version of {@link #w}. */
    public static int nw(long struct) { return memGetInt(struct + SDL_Texture.W); }
    /** Unsafe version of {@link #h}. */
    public static int nh(long struct) { return memGetInt(struct + SDL_Texture.H); }
    /** Unsafe version of {@link #refcount}. */
    public static int nrefcount(long struct) { return memGetInt(struct + SDL_Texture.REFCOUNT); }

    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { memPutInt(struct + SDL_Texture.FORMAT, value); }
    /** Unsafe version of {@link #w(int) w}. */
    public static void nw(long struct, int value) { memPutInt(struct + SDL_Texture.W, value); }
    /** Unsafe version of {@link #h(int) h}. */
    public static void nh(long struct, int value) { memPutInt(struct + SDL_Texture.H, value); }
    /** Unsafe version of {@link #refcount(int) refcount}. */
    public static void nrefcount(long struct, int value) { memPutInt(struct + SDL_Texture.REFCOUNT, value); }

    // -----------------------------------

    /** An array of {@link SDL_Texture} structs. */
    public static class Buffer extends StructBuffer<SDL_Texture, Buffer> implements NativeResource {

        private static final SDL_Texture ELEMENT_FACTORY = SDL_Texture.create(-1L);

        /**
         * Creates a new {@code SDL_Texture.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_Texture#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_Texture getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code format} field. */
        @NativeType("SDL_PixelFormat")
        public int format() { return SDL_Texture.nformat(address()); }
        /** @return the value of the {@code w} field. */
        public int w() { return SDL_Texture.nw(address()); }
        /** @return the value of the {@code h} field. */
        public int h() { return SDL_Texture.nh(address()); }
        /** @return the value of the {@code refcount} field. */
        public int refcount() { return SDL_Texture.nrefcount(address()); }

        /** Sets the specified value to the {@code format} field. */
        public SDL_Texture.Buffer format(@NativeType("SDL_PixelFormat") int value) { SDL_Texture.nformat(address(), value); return this; }
        /** Sets the specified value to the {@code w} field. */
        public SDL_Texture.Buffer w(int value) { SDL_Texture.nw(address(), value); return this; }
        /** Sets the specified value to the {@code h} field. */
        public SDL_Texture.Buffer h(int value) { SDL_Texture.nh(address(), value); return this; }
        /** Sets the specified value to the {@code refcount} field. */
        public SDL_Texture.Buffer refcount(int value) { SDL_Texture.nrefcount(address(), value); return this; }

    }

}