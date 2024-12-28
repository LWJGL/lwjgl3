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
 * struct SDL_GPUBufferLocation {
 *     SDL_GPUBuffer * buffer;
 *     Uint32 offset;
 * }}</pre>
 */
public class SDL_GPUBufferLocation extends Struct<SDL_GPUBufferLocation> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BUFFER,
        OFFSET;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BUFFER = layout.offsetof(0);
        OFFSET = layout.offsetof(1);
    }

    protected SDL_GPUBufferLocation(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_GPUBufferLocation create(long address, @Nullable ByteBuffer container) {
        return new SDL_GPUBufferLocation(address, container);
    }

    /**
     * Creates a {@code SDL_GPUBufferLocation} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_GPUBufferLocation(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code buffer} field. */
    @NativeType("SDL_GPUBuffer *")
    public long buffer() { return nbuffer(address()); }
    /** @return the value of the {@code offset} field. */
    @NativeType("Uint32")
    public int offset() { return noffset(address()); }

    /** Sets the specified value to the {@code buffer} field. */
    public SDL_GPUBufferLocation buffer(@NativeType("SDL_GPUBuffer *") long value) { nbuffer(address(), value); return this; }
    /** Sets the specified value to the {@code offset} field. */
    public SDL_GPUBufferLocation offset(@NativeType("Uint32") int value) { noffset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_GPUBufferLocation set(
        long buffer,
        int offset
    ) {
        buffer(buffer);
        offset(offset);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_GPUBufferLocation set(SDL_GPUBufferLocation src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_GPUBufferLocation} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_GPUBufferLocation malloc() {
        return new SDL_GPUBufferLocation(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUBufferLocation} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_GPUBufferLocation calloc() {
        return new SDL_GPUBufferLocation(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUBufferLocation} instance allocated with {@link BufferUtils}. */
    public static SDL_GPUBufferLocation create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUBufferLocation(memAddress(container), container);
    }

    /** Returns a new {@code SDL_GPUBufferLocation} instance for the specified memory address. */
    public static SDL_GPUBufferLocation create(long address) {
        return new SDL_GPUBufferLocation(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_GPUBufferLocation createSafe(long address) {
        return address == NULL ? null : new SDL_GPUBufferLocation(address, null);
    }

    /**
     * Returns a new {@link SDL_GPUBufferLocation.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUBufferLocation.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUBufferLocation.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUBufferLocation.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUBufferLocation.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUBufferLocation.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_GPUBufferLocation.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_GPUBufferLocation.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_GPUBufferLocation.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_GPUBufferLocation} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUBufferLocation malloc(MemoryStack stack) {
        return new SDL_GPUBufferLocation(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_GPUBufferLocation} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUBufferLocation calloc(MemoryStack stack) {
        return new SDL_GPUBufferLocation(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_GPUBufferLocation.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUBufferLocation.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUBufferLocation.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUBufferLocation.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #buffer}. */
    public static long nbuffer(long struct) { return memGetAddress(struct + SDL_GPUBufferLocation.BUFFER); }
    /** Unsafe version of {@link #offset}. */
    public static int noffset(long struct) { return memGetInt(struct + SDL_GPUBufferLocation.OFFSET); }

    /** Unsafe version of {@link #buffer(long) buffer}. */
    public static void nbuffer(long struct, long value) { memPutAddress(struct + SDL_GPUBufferLocation.BUFFER, check(value)); }
    /** Unsafe version of {@link #offset(int) offset}. */
    public static void noffset(long struct, int value) { memPutInt(struct + SDL_GPUBufferLocation.OFFSET, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + SDL_GPUBufferLocation.BUFFER));
    }

    // -----------------------------------

    /** An array of {@link SDL_GPUBufferLocation} structs. */
    public static class Buffer extends StructBuffer<SDL_GPUBufferLocation, Buffer> implements NativeResource {

        private static final SDL_GPUBufferLocation ELEMENT_FACTORY = SDL_GPUBufferLocation.create(-1L);

        /**
         * Creates a new {@code SDL_GPUBufferLocation.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_GPUBufferLocation#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_GPUBufferLocation getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code buffer} field. */
        @NativeType("SDL_GPUBuffer *")
        public long buffer() { return SDL_GPUBufferLocation.nbuffer(address()); }
        /** @return the value of the {@code offset} field. */
        @NativeType("Uint32")
        public int offset() { return SDL_GPUBufferLocation.noffset(address()); }

        /** Sets the specified value to the {@code buffer} field. */
        public SDL_GPUBufferLocation.Buffer buffer(@NativeType("SDL_GPUBuffer *") long value) { SDL_GPUBufferLocation.nbuffer(address(), value); return this; }
        /** Sets the specified value to the {@code offset} field. */
        public SDL_GPUBufferLocation.Buffer offset(@NativeType("Uint32") int value) { SDL_GPUBufferLocation.noffset(address(), value); return this; }

    }

}