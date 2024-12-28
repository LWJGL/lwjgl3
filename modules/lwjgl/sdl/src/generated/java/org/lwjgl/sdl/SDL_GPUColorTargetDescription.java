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
 * struct SDL_GPUColorTargetDescription {
 *     SDL_GPUTextureFormat format;
 *     {@link SDL_GPUColorTargetBlendState SDL_GPUColorTargetBlendState} blend_state;
 * }}</pre>
 */
public class SDL_GPUColorTargetDescription extends Struct<SDL_GPUColorTargetDescription> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FORMAT,
        BLEND_STATE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(SDL_GPUColorTargetBlendState.SIZEOF, SDL_GPUColorTargetBlendState.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FORMAT = layout.offsetof(0);
        BLEND_STATE = layout.offsetof(1);
    }

    protected SDL_GPUColorTargetDescription(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_GPUColorTargetDescription create(long address, @Nullable ByteBuffer container) {
        return new SDL_GPUColorTargetDescription(address, container);
    }

    /**
     * Creates a {@code SDL_GPUColorTargetDescription} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_GPUColorTargetDescription(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code format} field. */
    @NativeType("SDL_GPUTextureFormat")
    public int format() { return nformat(address()); }
    /** @return a {@link SDL_GPUColorTargetBlendState} view of the {@code blend_state} field. */
    public SDL_GPUColorTargetBlendState blend_state() { return nblend_state(address()); }

    /** Sets the specified value to the {@code format} field. */
    public SDL_GPUColorTargetDescription format(@NativeType("SDL_GPUTextureFormat") int value) { nformat(address(), value); return this; }
    /** Copies the specified {@link SDL_GPUColorTargetBlendState} to the {@code blend_state} field. */
    public SDL_GPUColorTargetDescription blend_state(SDL_GPUColorTargetBlendState value) { nblend_state(address(), value); return this; }
    /** Passes the {@code blend_state} field to the specified {@link java.util.function.Consumer Consumer}. */
    public SDL_GPUColorTargetDescription blend_state(java.util.function.Consumer<SDL_GPUColorTargetBlendState> consumer) { consumer.accept(blend_state()); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_GPUColorTargetDescription set(
        int format,
        SDL_GPUColorTargetBlendState blend_state
    ) {
        format(format);
        blend_state(blend_state);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_GPUColorTargetDescription set(SDL_GPUColorTargetDescription src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_GPUColorTargetDescription} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_GPUColorTargetDescription malloc() {
        return new SDL_GPUColorTargetDescription(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUColorTargetDescription} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_GPUColorTargetDescription calloc() {
        return new SDL_GPUColorTargetDescription(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUColorTargetDescription} instance allocated with {@link BufferUtils}. */
    public static SDL_GPUColorTargetDescription create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUColorTargetDescription(memAddress(container), container);
    }

    /** Returns a new {@code SDL_GPUColorTargetDescription} instance for the specified memory address. */
    public static SDL_GPUColorTargetDescription create(long address) {
        return new SDL_GPUColorTargetDescription(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_GPUColorTargetDescription createSafe(long address) {
        return address == NULL ? null : new SDL_GPUColorTargetDescription(address, null);
    }

    /**
     * Returns a new {@link SDL_GPUColorTargetDescription.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUColorTargetDescription.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUColorTargetDescription.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUColorTargetDescription.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUColorTargetDescription.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUColorTargetDescription.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_GPUColorTargetDescription.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_GPUColorTargetDescription.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_GPUColorTargetDescription.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_GPUColorTargetDescription} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUColorTargetDescription malloc(MemoryStack stack) {
        return new SDL_GPUColorTargetDescription(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_GPUColorTargetDescription} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUColorTargetDescription calloc(MemoryStack stack) {
        return new SDL_GPUColorTargetDescription(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_GPUColorTargetDescription.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUColorTargetDescription.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUColorTargetDescription.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUColorTargetDescription.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return memGetInt(struct + SDL_GPUColorTargetDescription.FORMAT); }
    /** Unsafe version of {@link #blend_state}. */
    public static SDL_GPUColorTargetBlendState nblend_state(long struct) { return SDL_GPUColorTargetBlendState.create(struct + SDL_GPUColorTargetDescription.BLEND_STATE); }

    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { memPutInt(struct + SDL_GPUColorTargetDescription.FORMAT, value); }
    /** Unsafe version of {@link #blend_state(SDL_GPUColorTargetBlendState) blend_state}. */
    public static void nblend_state(long struct, SDL_GPUColorTargetBlendState value) { memCopy(value.address(), struct + SDL_GPUColorTargetDescription.BLEND_STATE, SDL_GPUColorTargetBlendState.SIZEOF); }

    // -----------------------------------

    /** An array of {@link SDL_GPUColorTargetDescription} structs. */
    public static class Buffer extends StructBuffer<SDL_GPUColorTargetDescription, Buffer> implements NativeResource {

        private static final SDL_GPUColorTargetDescription ELEMENT_FACTORY = SDL_GPUColorTargetDescription.create(-1L);

        /**
         * Creates a new {@code SDL_GPUColorTargetDescription.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_GPUColorTargetDescription#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_GPUColorTargetDescription getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code format} field. */
        @NativeType("SDL_GPUTextureFormat")
        public int format() { return SDL_GPUColorTargetDescription.nformat(address()); }
        /** @return a {@link SDL_GPUColorTargetBlendState} view of the {@code blend_state} field. */
        public SDL_GPUColorTargetBlendState blend_state() { return SDL_GPUColorTargetDescription.nblend_state(address()); }

        /** Sets the specified value to the {@code format} field. */
        public SDL_GPUColorTargetDescription.Buffer format(@NativeType("SDL_GPUTextureFormat") int value) { SDL_GPUColorTargetDescription.nformat(address(), value); return this; }
        /** Copies the specified {@link SDL_GPUColorTargetBlendState} to the {@code blend_state} field. */
        public SDL_GPUColorTargetDescription.Buffer blend_state(SDL_GPUColorTargetBlendState value) { SDL_GPUColorTargetDescription.nblend_state(address(), value); return this; }
        /** Passes the {@code blend_state} field to the specified {@link java.util.function.Consumer Consumer}. */
        public SDL_GPUColorTargetDescription.Buffer blend_state(java.util.function.Consumer<SDL_GPUColorTargetBlendState> consumer) { consumer.accept(blend_state()); return this; }

    }

}