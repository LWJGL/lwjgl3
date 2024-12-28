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
 * struct SDL_GPUTextureSamplerBinding {
 *     SDL_GPUTexture * texture;
 *     SDL_GPUSampler * sampler;
 * }}</pre>
 */
public class SDL_GPUTextureSamplerBinding extends Struct<SDL_GPUTextureSamplerBinding> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TEXTURE,
        SAMPLER;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TEXTURE = layout.offsetof(0);
        SAMPLER = layout.offsetof(1);
    }

    protected SDL_GPUTextureSamplerBinding(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_GPUTextureSamplerBinding create(long address, @Nullable ByteBuffer container) {
        return new SDL_GPUTextureSamplerBinding(address, container);
    }

    /**
     * Creates a {@code SDL_GPUTextureSamplerBinding} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_GPUTextureSamplerBinding(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code texture} field. */
    @NativeType("SDL_GPUTexture *")
    public long texture() { return ntexture(address()); }
    /** @return the value of the {@code sampler} field. */
    @NativeType("SDL_GPUSampler *")
    public long sampler() { return nsampler(address()); }

    /** Sets the specified value to the {@code texture} field. */
    public SDL_GPUTextureSamplerBinding texture(@NativeType("SDL_GPUTexture *") long value) { ntexture(address(), value); return this; }
    /** Sets the specified value to the {@code sampler} field. */
    public SDL_GPUTextureSamplerBinding sampler(@NativeType("SDL_GPUSampler *") long value) { nsampler(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_GPUTextureSamplerBinding set(
        long texture,
        long sampler
    ) {
        texture(texture);
        sampler(sampler);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_GPUTextureSamplerBinding set(SDL_GPUTextureSamplerBinding src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_GPUTextureSamplerBinding} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_GPUTextureSamplerBinding malloc() {
        return new SDL_GPUTextureSamplerBinding(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUTextureSamplerBinding} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_GPUTextureSamplerBinding calloc() {
        return new SDL_GPUTextureSamplerBinding(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUTextureSamplerBinding} instance allocated with {@link BufferUtils}. */
    public static SDL_GPUTextureSamplerBinding create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUTextureSamplerBinding(memAddress(container), container);
    }

    /** Returns a new {@code SDL_GPUTextureSamplerBinding} instance for the specified memory address. */
    public static SDL_GPUTextureSamplerBinding create(long address) {
        return new SDL_GPUTextureSamplerBinding(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_GPUTextureSamplerBinding createSafe(long address) {
        return address == NULL ? null : new SDL_GPUTextureSamplerBinding(address, null);
    }

    /**
     * Returns a new {@link SDL_GPUTextureSamplerBinding.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUTextureSamplerBinding.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUTextureSamplerBinding.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUTextureSamplerBinding.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUTextureSamplerBinding.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUTextureSamplerBinding.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_GPUTextureSamplerBinding.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_GPUTextureSamplerBinding.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_GPUTextureSamplerBinding.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_GPUTextureSamplerBinding} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUTextureSamplerBinding malloc(MemoryStack stack) {
        return new SDL_GPUTextureSamplerBinding(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_GPUTextureSamplerBinding} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUTextureSamplerBinding calloc(MemoryStack stack) {
        return new SDL_GPUTextureSamplerBinding(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_GPUTextureSamplerBinding.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUTextureSamplerBinding.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUTextureSamplerBinding.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUTextureSamplerBinding.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #texture}. */
    public static long ntexture(long struct) { return memGetAddress(struct + SDL_GPUTextureSamplerBinding.TEXTURE); }
    /** Unsafe version of {@link #sampler}. */
    public static long nsampler(long struct) { return memGetAddress(struct + SDL_GPUTextureSamplerBinding.SAMPLER); }

    /** Unsafe version of {@link #texture(long) texture}. */
    public static void ntexture(long struct, long value) { memPutAddress(struct + SDL_GPUTextureSamplerBinding.TEXTURE, check(value)); }
    /** Unsafe version of {@link #sampler(long) sampler}. */
    public static void nsampler(long struct, long value) { memPutAddress(struct + SDL_GPUTextureSamplerBinding.SAMPLER, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + SDL_GPUTextureSamplerBinding.TEXTURE));
        check(memGetAddress(struct + SDL_GPUTextureSamplerBinding.SAMPLER));
    }

    // -----------------------------------

    /** An array of {@link SDL_GPUTextureSamplerBinding} structs. */
    public static class Buffer extends StructBuffer<SDL_GPUTextureSamplerBinding, Buffer> implements NativeResource {

        private static final SDL_GPUTextureSamplerBinding ELEMENT_FACTORY = SDL_GPUTextureSamplerBinding.create(-1L);

        /**
         * Creates a new {@code SDL_GPUTextureSamplerBinding.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_GPUTextureSamplerBinding#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_GPUTextureSamplerBinding getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code texture} field. */
        @NativeType("SDL_GPUTexture *")
        public long texture() { return SDL_GPUTextureSamplerBinding.ntexture(address()); }
        /** @return the value of the {@code sampler} field. */
        @NativeType("SDL_GPUSampler *")
        public long sampler() { return SDL_GPUTextureSamplerBinding.nsampler(address()); }

        /** Sets the specified value to the {@code texture} field. */
        public SDL_GPUTextureSamplerBinding.Buffer texture(@NativeType("SDL_GPUTexture *") long value) { SDL_GPUTextureSamplerBinding.ntexture(address(), value); return this; }
        /** Sets the specified value to the {@code sampler} field. */
        public SDL_GPUTextureSamplerBinding.Buffer sampler(@NativeType("SDL_GPUSampler *") long value) { SDL_GPUTextureSamplerBinding.nsampler(address(), value); return this; }

    }

}