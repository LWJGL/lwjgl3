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
 * struct SDL_GUID {
 *     Uint8 data[16];
 * }}</pre>
 */
public class SDL_GUID extends Struct<SDL_GUID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DATA;

    static {
        Layout layout = __struct(
            __array(1, 16)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DATA = layout.offsetof(0);
    }

    protected SDL_GUID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_GUID create(long address, @Nullable ByteBuffer container) {
        return new SDL_GUID(address, container);
    }

    /**
     * Creates a {@code SDL_GUID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_GUID(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the {@code data} field. */
    @NativeType("Uint8[16]")
    public ByteBuffer data() { return ndata(address()); }
    /** @return the value at the specified index of the {@code data} field. */
    @NativeType("Uint8")
    public byte data(int index) { return ndata(address(), index); }

    /** Copies the specified {@link ByteBuffer} to the {@code data} field. */
    public SDL_GUID data(@NativeType("Uint8[16]") ByteBuffer value) { ndata(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code data} field. */
    public SDL_GUID data(int index, @NativeType("Uint8") byte value) { ndata(address(), index, value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_GUID set(SDL_GUID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_GUID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_GUID malloc() {
        return new SDL_GUID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_GUID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_GUID calloc() {
        return new SDL_GUID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_GUID} instance allocated with {@link BufferUtils}. */
    public static SDL_GUID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GUID(memAddress(container), container);
    }

    /** Returns a new {@code SDL_GUID} instance for the specified memory address. */
    public static SDL_GUID create(long address) {
        return new SDL_GUID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_GUID createSafe(long address) {
        return address == NULL ? null : new SDL_GUID(address, null);
    }

    /**
     * Returns a new {@link SDL_GUID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GUID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_GUID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GUID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GUID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GUID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_GUID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_GUID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_GUID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_GUID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GUID malloc(MemoryStack stack) {
        return new SDL_GUID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_GUID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GUID calloc(MemoryStack stack) {
        return new SDL_GUID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_GUID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GUID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GUID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GUID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #data}. */
    public static ByteBuffer ndata(long struct) { return memByteBuffer(struct + SDL_GUID.DATA, 16); }
    /** Unsafe version of {@link #data(int) data}. */
    public static byte ndata(long struct, int index) {
        return memGetByte(struct + SDL_GUID.DATA + check(index, 16) * 1);
    }

    /** Unsafe version of {@link #data(ByteBuffer) data}. */
    public static void ndata(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 16); }
        memCopy(memAddress(value), struct + SDL_GUID.DATA, value.remaining() * 1);
    }
    /** Unsafe version of {@link #data(int, byte) data}. */
    public static void ndata(long struct, int index, byte value) {
        memPutByte(struct + SDL_GUID.DATA + check(index, 16) * 1, value);
    }

    // -----------------------------------

    /** An array of {@link SDL_GUID} structs. */
    public static class Buffer extends StructBuffer<SDL_GUID, Buffer> implements NativeResource {

        private static final SDL_GUID ELEMENT_FACTORY = SDL_GUID.create(-1L);

        /**
         * Creates a new {@code SDL_GUID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_GUID#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_GUID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the {@code data} field. */
        @NativeType("Uint8[16]")
        public ByteBuffer data() { return SDL_GUID.ndata(address()); }
        /** @return the value at the specified index of the {@code data} field. */
        @NativeType("Uint8")
        public byte data(int index) { return SDL_GUID.ndata(address(), index); }

        /** Copies the specified {@link ByteBuffer} to the {@code data} field. */
        public SDL_GUID.Buffer data(@NativeType("Uint8[16]") ByteBuffer value) { SDL_GUID.ndata(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code data} field. */
        public SDL_GUID.Buffer data(int index, @NativeType("Uint8") byte value) { SDL_GUID.ndata(address(), index, value); return this; }

    }

}