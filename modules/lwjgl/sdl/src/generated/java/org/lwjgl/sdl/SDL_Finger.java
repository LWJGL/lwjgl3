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
 * struct SDL_Finger {
 *     SDL_FingerID id;
 *     float x;
 *     float y;
 *     float pressure;
 * }}</pre>
 */
public class SDL_Finger extends Struct<SDL_Finger> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ID,
        X,
        Y,
        PRESSURE;

    static {
        Layout layout = __struct(
            __member(8),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ID = layout.offsetof(0);
        X = layout.offsetof(1);
        Y = layout.offsetof(2);
        PRESSURE = layout.offsetof(3);
    }

    protected SDL_Finger(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_Finger create(long address, @Nullable ByteBuffer container) {
        return new SDL_Finger(address, container);
    }

    /**
     * Creates a {@code SDL_Finger} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_Finger(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code id} field. */
    @NativeType("SDL_FingerID")
    public long id() { return nid(address()); }
    /** @return the value of the {@code x} field. */
    public float x() { return nx(address()); }
    /** @return the value of the {@code y} field. */
    public float y() { return ny(address()); }
    /** @return the value of the {@code pressure} field. */
    public float pressure() { return npressure(address()); }

    /** Sets the specified value to the {@code id} field. */
    public SDL_Finger id(@NativeType("SDL_FingerID") long value) { nid(address(), value); return this; }
    /** Sets the specified value to the {@code x} field. */
    public SDL_Finger x(float value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public SDL_Finger y(float value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@code pressure} field. */
    public SDL_Finger pressure(float value) { npressure(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_Finger set(
        long id,
        float x,
        float y,
        float pressure
    ) {
        id(id);
        x(x);
        y(y);
        pressure(pressure);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_Finger set(SDL_Finger src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_Finger} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_Finger malloc() {
        return new SDL_Finger(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_Finger} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_Finger calloc() {
        return new SDL_Finger(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_Finger} instance allocated with {@link BufferUtils}. */
    public static SDL_Finger create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_Finger(memAddress(container), container);
    }

    /** Returns a new {@code SDL_Finger} instance for the specified memory address. */
    public static SDL_Finger create(long address) {
        return new SDL_Finger(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_Finger createSafe(long address) {
        return address == NULL ? null : new SDL_Finger(address, null);
    }

    /**
     * Returns a new {@link SDL_Finger.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_Finger.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_Finger.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_Finger.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_Finger.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_Finger.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_Finger.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_Finger.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_Finger.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_Finger} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_Finger malloc(MemoryStack stack) {
        return new SDL_Finger(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_Finger} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_Finger calloc(MemoryStack stack) {
        return new SDL_Finger(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_Finger.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_Finger.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_Finger.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_Finger.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #id}. */
    public static long nid(long struct) { return memGetLong(struct + SDL_Finger.ID); }
    /** Unsafe version of {@link #x}. */
    public static float nx(long struct) { return memGetFloat(struct + SDL_Finger.X); }
    /** Unsafe version of {@link #y}. */
    public static float ny(long struct) { return memGetFloat(struct + SDL_Finger.Y); }
    /** Unsafe version of {@link #pressure}. */
    public static float npressure(long struct) { return memGetFloat(struct + SDL_Finger.PRESSURE); }

    /** Unsafe version of {@link #id(long) id}. */
    public static void nid(long struct, long value) { memPutLong(struct + SDL_Finger.ID, value); }
    /** Unsafe version of {@link #x(float) x}. */
    public static void nx(long struct, float value) { memPutFloat(struct + SDL_Finger.X, value); }
    /** Unsafe version of {@link #y(float) y}. */
    public static void ny(long struct, float value) { memPutFloat(struct + SDL_Finger.Y, value); }
    /** Unsafe version of {@link #pressure(float) pressure}. */
    public static void npressure(long struct, float value) { memPutFloat(struct + SDL_Finger.PRESSURE, value); }

    // -----------------------------------

    /** An array of {@link SDL_Finger} structs. */
    public static class Buffer extends StructBuffer<SDL_Finger, Buffer> implements NativeResource {

        private static final SDL_Finger ELEMENT_FACTORY = SDL_Finger.create(-1L);

        /**
         * Creates a new {@code SDL_Finger.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_Finger#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_Finger getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code id} field. */
        @NativeType("SDL_FingerID")
        public long id() { return SDL_Finger.nid(address()); }
        /** @return the value of the {@code x} field. */
        public float x() { return SDL_Finger.nx(address()); }
        /** @return the value of the {@code y} field. */
        public float y() { return SDL_Finger.ny(address()); }
        /** @return the value of the {@code pressure} field. */
        public float pressure() { return SDL_Finger.npressure(address()); }

        /** Sets the specified value to the {@code id} field. */
        public SDL_Finger.Buffer id(@NativeType("SDL_FingerID") long value) { SDL_Finger.nid(address(), value); return this; }
        /** Sets the specified value to the {@code x} field. */
        public SDL_Finger.Buffer x(float value) { SDL_Finger.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public SDL_Finger.Buffer y(float value) { SDL_Finger.ny(address(), value); return this; }
        /** Sets the specified value to the {@code pressure} field. */
        public SDL_Finger.Buffer pressure(float value) { SDL_Finger.npressure(address(), value); return this; }

    }

}