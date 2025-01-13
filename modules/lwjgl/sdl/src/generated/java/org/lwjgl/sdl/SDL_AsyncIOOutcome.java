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
 * struct SDL_AsyncIOOutcome {
 *     SDL_AsyncIO * asyncio;
 *     SDL_AsyncIOTaskType type;
 *     SDL_AsyncIOResult result;
 *     void * buffer;
 *     Uint64 offset;
 *     Uint64 bytes_requested;
 *     Uint64 bytes_transferred;
 *     void * userdata;
 * }}</pre>
 */
public class SDL_AsyncIOOutcome extends Struct<SDL_AsyncIOOutcome> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ASYNCIO,
        TYPE,
        RESULT,
        BUFFER,
        OFFSET,
        BYTES_REQUESTED,
        BYTES_TRANSFERRED,
        USERDATA;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(8),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ASYNCIO = layout.offsetof(0);
        TYPE = layout.offsetof(1);
        RESULT = layout.offsetof(2);
        BUFFER = layout.offsetof(3);
        OFFSET = layout.offsetof(4);
        BYTES_REQUESTED = layout.offsetof(5);
        BYTES_TRANSFERRED = layout.offsetof(6);
        USERDATA = layout.offsetof(7);
    }

    protected SDL_AsyncIOOutcome(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_AsyncIOOutcome create(long address, @Nullable ByteBuffer container) {
        return new SDL_AsyncIOOutcome(address, container);
    }

    /**
     * Creates a {@code SDL_AsyncIOOutcome} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_AsyncIOOutcome(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code asyncio} field. */
    @NativeType("SDL_AsyncIO *")
    public long asyncio() { return nasyncio(address()); }
    /** @return the value of the {@code type} field. */
    @NativeType("SDL_AsyncIOTaskType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code result} field. */
    @NativeType("SDL_AsyncIOResult")
    public int result() { return nresult(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code buffer} field. */
    @NativeType("void *")
    public ByteBuffer buffer(int capacity) { return nbuffer(address(), capacity); }
    /** @return the value of the {@code offset} field. */
    @NativeType("Uint64")
    public long offset() { return noffset(address()); }
    /** @return the value of the {@code bytes_requested} field. */
    @NativeType("Uint64")
    public long bytes_requested() { return nbytes_requested(address()); }
    /** @return the value of the {@code bytes_transferred} field. */
    @NativeType("Uint64")
    public long bytes_transferred() { return nbytes_transferred(address()); }
    /** @return the value of the {@code userdata} field. */
    @NativeType("void *")
    public long userdata() { return nuserdata(address()); }

    // -----------------------------------

    /** Returns a new {@code SDL_AsyncIOOutcome} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_AsyncIOOutcome malloc() {
        return new SDL_AsyncIOOutcome(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_AsyncIOOutcome} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_AsyncIOOutcome calloc() {
        return new SDL_AsyncIOOutcome(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_AsyncIOOutcome} instance allocated with {@link BufferUtils}. */
    public static SDL_AsyncIOOutcome create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_AsyncIOOutcome(memAddress(container), container);
    }

    /** Returns a new {@code SDL_AsyncIOOutcome} instance for the specified memory address. */
    public static SDL_AsyncIOOutcome create(long address) {
        return new SDL_AsyncIOOutcome(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_AsyncIOOutcome createSafe(long address) {
        return address == NULL ? null : new SDL_AsyncIOOutcome(address, null);
    }

    /**
     * Returns a new {@link SDL_AsyncIOOutcome.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_AsyncIOOutcome.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_AsyncIOOutcome.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_AsyncIOOutcome.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_AsyncIOOutcome.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_AsyncIOOutcome.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_AsyncIOOutcome.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_AsyncIOOutcome.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_AsyncIOOutcome.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_AsyncIOOutcome} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_AsyncIOOutcome malloc(MemoryStack stack) {
        return new SDL_AsyncIOOutcome(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_AsyncIOOutcome} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_AsyncIOOutcome calloc(MemoryStack stack) {
        return new SDL_AsyncIOOutcome(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_AsyncIOOutcome.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_AsyncIOOutcome.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_AsyncIOOutcome.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_AsyncIOOutcome.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #asyncio}. */
    public static long nasyncio(long struct) { return memGetAddress(struct + SDL_AsyncIOOutcome.ASYNCIO); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + SDL_AsyncIOOutcome.TYPE); }
    /** Unsafe version of {@link #result}. */
    public static int nresult(long struct) { return memGetInt(struct + SDL_AsyncIOOutcome.RESULT); }
    /** Unsafe version of {@link #buffer(int) buffer}. */
    public static ByteBuffer nbuffer(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + SDL_AsyncIOOutcome.BUFFER), capacity); }
    /** Unsafe version of {@link #offset}. */
    public static long noffset(long struct) { return memGetLong(struct + SDL_AsyncIOOutcome.OFFSET); }
    /** Unsafe version of {@link #bytes_requested}. */
    public static long nbytes_requested(long struct) { return memGetLong(struct + SDL_AsyncIOOutcome.BYTES_REQUESTED); }
    /** Unsafe version of {@link #bytes_transferred}. */
    public static long nbytes_transferred(long struct) { return memGetLong(struct + SDL_AsyncIOOutcome.BYTES_TRANSFERRED); }
    /** Unsafe version of {@link #userdata}. */
    public static long nuserdata(long struct) { return memGetAddress(struct + SDL_AsyncIOOutcome.USERDATA); }

    // -----------------------------------

    /** An array of {@link SDL_AsyncIOOutcome} structs. */
    public static class Buffer extends StructBuffer<SDL_AsyncIOOutcome, Buffer> implements NativeResource {

        private static final SDL_AsyncIOOutcome ELEMENT_FACTORY = SDL_AsyncIOOutcome.create(-1L);

        /**
         * Creates a new {@code SDL_AsyncIOOutcome.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_AsyncIOOutcome#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_AsyncIOOutcome getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code asyncio} field. */
        @NativeType("SDL_AsyncIO *")
        public long asyncio() { return SDL_AsyncIOOutcome.nasyncio(address()); }
        /** @return the value of the {@code type} field. */
        @NativeType("SDL_AsyncIOTaskType")
        public int type() { return SDL_AsyncIOOutcome.ntype(address()); }
        /** @return the value of the {@code result} field. */
        @NativeType("SDL_AsyncIOResult")
        public int result() { return SDL_AsyncIOOutcome.nresult(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code buffer} field. */
        @NativeType("void *")
        public ByteBuffer buffer(int capacity) { return SDL_AsyncIOOutcome.nbuffer(address(), capacity); }
        /** @return the value of the {@code offset} field. */
        @NativeType("Uint64")
        public long offset() { return SDL_AsyncIOOutcome.noffset(address()); }
        /** @return the value of the {@code bytes_requested} field. */
        @NativeType("Uint64")
        public long bytes_requested() { return SDL_AsyncIOOutcome.nbytes_requested(address()); }
        /** @return the value of the {@code bytes_transferred} field. */
        @NativeType("Uint64")
        public long bytes_transferred() { return SDL_AsyncIOOutcome.nbytes_transferred(address()); }
        /** @return the value of the {@code userdata} field. */
        @NativeType("void *")
        public long userdata() { return SDL_AsyncIOOutcome.nuserdata(address()); }

    }

}