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
 * struct SDL_AudioSpec {
 *     SDL_AudioFormat format;
 *     int channels;
 *     int freq;
 * }}</pre>
 */
public class SDL_AudioSpec extends Struct<SDL_AudioSpec> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FORMAT,
        CHANNELS,
        FREQ;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FORMAT = layout.offsetof(0);
        CHANNELS = layout.offsetof(1);
        FREQ = layout.offsetof(2);
    }

    protected SDL_AudioSpec(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_AudioSpec create(long address, @Nullable ByteBuffer container) {
        return new SDL_AudioSpec(address, container);
    }

    /**
     * Creates a {@code SDL_AudioSpec} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_AudioSpec(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code format} field. */
    @NativeType("SDL_AudioFormat")
    public int format() { return nformat(address()); }
    /** @return the value of the {@code channels} field. */
    public int channels() { return nchannels(address()); }
    /** @return the value of the {@code freq} field. */
    public int freq() { return nfreq(address()); }

    /** Sets the specified value to the {@code format} field. */
    public SDL_AudioSpec format(@NativeType("SDL_AudioFormat") int value) { nformat(address(), value); return this; }
    /** Sets the specified value to the {@code channels} field. */
    public SDL_AudioSpec channels(int value) { nchannels(address(), value); return this; }
    /** Sets the specified value to the {@code freq} field. */
    public SDL_AudioSpec freq(int value) { nfreq(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_AudioSpec set(
        int format,
        int channels,
        int freq
    ) {
        format(format);
        channels(channels);
        freq(freq);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_AudioSpec set(SDL_AudioSpec src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_AudioSpec} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_AudioSpec malloc() {
        return new SDL_AudioSpec(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_AudioSpec} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_AudioSpec calloc() {
        return new SDL_AudioSpec(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_AudioSpec} instance allocated with {@link BufferUtils}. */
    public static SDL_AudioSpec create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_AudioSpec(memAddress(container), container);
    }

    /** Returns a new {@code SDL_AudioSpec} instance for the specified memory address. */
    public static SDL_AudioSpec create(long address) {
        return new SDL_AudioSpec(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_AudioSpec createSafe(long address) {
        return address == NULL ? null : new SDL_AudioSpec(address, null);
    }

    /**
     * Returns a new {@link SDL_AudioSpec.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_AudioSpec.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_AudioSpec.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_AudioSpec.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_AudioSpec.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_AudioSpec.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_AudioSpec.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_AudioSpec.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_AudioSpec.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_AudioSpec} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_AudioSpec malloc(MemoryStack stack) {
        return new SDL_AudioSpec(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_AudioSpec} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_AudioSpec calloc(MemoryStack stack) {
        return new SDL_AudioSpec(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_AudioSpec.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_AudioSpec.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_AudioSpec.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_AudioSpec.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return memGetInt(struct + SDL_AudioSpec.FORMAT); }
    /** Unsafe version of {@link #channels}. */
    public static int nchannels(long struct) { return memGetInt(struct + SDL_AudioSpec.CHANNELS); }
    /** Unsafe version of {@link #freq}. */
    public static int nfreq(long struct) { return memGetInt(struct + SDL_AudioSpec.FREQ); }

    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { memPutInt(struct + SDL_AudioSpec.FORMAT, value); }
    /** Unsafe version of {@link #channels(int) channels}. */
    public static void nchannels(long struct, int value) { memPutInt(struct + SDL_AudioSpec.CHANNELS, value); }
    /** Unsafe version of {@link #freq(int) freq}. */
    public static void nfreq(long struct, int value) { memPutInt(struct + SDL_AudioSpec.FREQ, value); }

    // -----------------------------------

    /** An array of {@link SDL_AudioSpec} structs. */
    public static class Buffer extends StructBuffer<SDL_AudioSpec, Buffer> implements NativeResource {

        private static final SDL_AudioSpec ELEMENT_FACTORY = SDL_AudioSpec.create(-1L);

        /**
         * Creates a new {@code SDL_AudioSpec.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_AudioSpec#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_AudioSpec getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code format} field. */
        @NativeType("SDL_AudioFormat")
        public int format() { return SDL_AudioSpec.nformat(address()); }
        /** @return the value of the {@code channels} field. */
        public int channels() { return SDL_AudioSpec.nchannels(address()); }
        /** @return the value of the {@code freq} field. */
        public int freq() { return SDL_AudioSpec.nfreq(address()); }

        /** Sets the specified value to the {@code format} field. */
        public SDL_AudioSpec.Buffer format(@NativeType("SDL_AudioFormat") int value) { SDL_AudioSpec.nformat(address(), value); return this; }
        /** Sets the specified value to the {@code channels} field. */
        public SDL_AudioSpec.Buffer channels(int value) { SDL_AudioSpec.nchannels(address(), value); return this; }
        /** Sets the specified value to the {@code freq} field. */
        public SDL_AudioSpec.Buffer freq(int value) { SDL_AudioSpec.nfreq(address(), value); return this; }

    }

}