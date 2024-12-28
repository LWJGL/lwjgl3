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
 * struct SDL_GPUTransferBufferLocation {
 *     SDL_GPUTransferBuffer * transfer_buffer;
 *     Uint32 offset;
 * }}</pre>
 */
public class SDL_GPUTransferBufferLocation extends Struct<SDL_GPUTransferBufferLocation> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TRANSFER_BUFFER,
        OFFSET;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TRANSFER_BUFFER = layout.offsetof(0);
        OFFSET = layout.offsetof(1);
    }

    protected SDL_GPUTransferBufferLocation(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_GPUTransferBufferLocation create(long address, @Nullable ByteBuffer container) {
        return new SDL_GPUTransferBufferLocation(address, container);
    }

    /**
     * Creates a {@code SDL_GPUTransferBufferLocation} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_GPUTransferBufferLocation(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code transfer_buffer} field. */
    @NativeType("SDL_GPUTransferBuffer *")
    public long transfer_buffer() { return ntransfer_buffer(address()); }
    /** @return the value of the {@code offset} field. */
    @NativeType("Uint32")
    public int offset() { return noffset(address()); }

    /** Sets the specified value to the {@code transfer_buffer} field. */
    public SDL_GPUTransferBufferLocation transfer_buffer(@NativeType("SDL_GPUTransferBuffer *") long value) { ntransfer_buffer(address(), value); return this; }
    /** Sets the specified value to the {@code offset} field. */
    public SDL_GPUTransferBufferLocation offset(@NativeType("Uint32") int value) { noffset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_GPUTransferBufferLocation set(
        long transfer_buffer,
        int offset
    ) {
        transfer_buffer(transfer_buffer);
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
    public SDL_GPUTransferBufferLocation set(SDL_GPUTransferBufferLocation src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_GPUTransferBufferLocation} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_GPUTransferBufferLocation malloc() {
        return new SDL_GPUTransferBufferLocation(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUTransferBufferLocation} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_GPUTransferBufferLocation calloc() {
        return new SDL_GPUTransferBufferLocation(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_GPUTransferBufferLocation} instance allocated with {@link BufferUtils}. */
    public static SDL_GPUTransferBufferLocation create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUTransferBufferLocation(memAddress(container), container);
    }

    /** Returns a new {@code SDL_GPUTransferBufferLocation} instance for the specified memory address. */
    public static SDL_GPUTransferBufferLocation create(long address) {
        return new SDL_GPUTransferBufferLocation(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_GPUTransferBufferLocation createSafe(long address) {
        return address == NULL ? null : new SDL_GPUTransferBufferLocation(address, null);
    }

    /**
     * Returns a new {@link SDL_GPUTransferBufferLocation.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUTransferBufferLocation.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUTransferBufferLocation.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUTransferBufferLocation.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUTransferBufferLocation.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GPUTransferBufferLocation.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_GPUTransferBufferLocation.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_GPUTransferBufferLocation.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_GPUTransferBufferLocation.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_GPUTransferBufferLocation} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUTransferBufferLocation malloc(MemoryStack stack) {
        return new SDL_GPUTransferBufferLocation(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_GPUTransferBufferLocation} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GPUTransferBufferLocation calloc(MemoryStack stack) {
        return new SDL_GPUTransferBufferLocation(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_GPUTransferBufferLocation.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUTransferBufferLocation.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GPUTransferBufferLocation.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GPUTransferBufferLocation.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #transfer_buffer}. */
    public static long ntransfer_buffer(long struct) { return memGetAddress(struct + SDL_GPUTransferBufferLocation.TRANSFER_BUFFER); }
    /** Unsafe version of {@link #offset}. */
    public static int noffset(long struct) { return memGetInt(struct + SDL_GPUTransferBufferLocation.OFFSET); }

    /** Unsafe version of {@link #transfer_buffer(long) transfer_buffer}. */
    public static void ntransfer_buffer(long struct, long value) { memPutAddress(struct + SDL_GPUTransferBufferLocation.TRANSFER_BUFFER, check(value)); }
    /** Unsafe version of {@link #offset(int) offset}. */
    public static void noffset(long struct, int value) { memPutInt(struct + SDL_GPUTransferBufferLocation.OFFSET, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + SDL_GPUTransferBufferLocation.TRANSFER_BUFFER));
    }

    // -----------------------------------

    /** An array of {@link SDL_GPUTransferBufferLocation} structs. */
    public static class Buffer extends StructBuffer<SDL_GPUTransferBufferLocation, Buffer> implements NativeResource {

        private static final SDL_GPUTransferBufferLocation ELEMENT_FACTORY = SDL_GPUTransferBufferLocation.create(-1L);

        /**
         * Creates a new {@code SDL_GPUTransferBufferLocation.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_GPUTransferBufferLocation#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_GPUTransferBufferLocation getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code transfer_buffer} field. */
        @NativeType("SDL_GPUTransferBuffer *")
        public long transfer_buffer() { return SDL_GPUTransferBufferLocation.ntransfer_buffer(address()); }
        /** @return the value of the {@code offset} field. */
        @NativeType("Uint32")
        public int offset() { return SDL_GPUTransferBufferLocation.noffset(address()); }

        /** Sets the specified value to the {@code transfer_buffer} field. */
        public SDL_GPUTransferBufferLocation.Buffer transfer_buffer(@NativeType("SDL_GPUTransferBuffer *") long value) { SDL_GPUTransferBufferLocation.ntransfer_buffer(address(), value); return this; }
        /** Sets the specified value to the {@code offset} field. */
        public SDL_GPUTransferBufferLocation.Buffer offset(@NativeType("Uint32") int value) { SDL_GPUTransferBufferLocation.noffset(address(), value); return this; }

    }

}