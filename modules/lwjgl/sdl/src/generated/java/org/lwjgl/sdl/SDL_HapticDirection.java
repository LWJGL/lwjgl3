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
 * struct SDL_HapticDirection {
 *     Uint8 type;
 *     Sint32 dir[3];
 * }}</pre>
 */
public class SDL_HapticDirection extends Struct<SDL_HapticDirection> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        DIR;

    static {
        Layout layout = __struct(
            __member(1),
            __array(4, 3)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        DIR = layout.offsetof(1);
    }

    protected SDL_HapticDirection(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_HapticDirection create(long address, @Nullable ByteBuffer container) {
        return new SDL_HapticDirection(address, container);
    }

    /**
     * Creates a {@code SDL_HapticDirection} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_HapticDirection(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("Uint8")
    public byte type() { return ntype(address()); }
    /** @return a {@link IntBuffer} view of the {@code dir} field. */
    @NativeType("Sint32[3]")
    public IntBuffer dir() { return ndir(address()); }
    /** @return the value at the specified index of the {@code dir} field. */
    @NativeType("Sint32")
    public int dir(int index) { return ndir(address(), index); }

    /** Sets the specified value to the {@code type} field. */
    public SDL_HapticDirection type(@NativeType("Uint8") byte value) { ntype(address(), value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code dir} field. */
    public SDL_HapticDirection dir(@NativeType("Sint32[3]") IntBuffer value) { ndir(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code dir} field. */
    public SDL_HapticDirection dir(int index, @NativeType("Sint32") int value) { ndir(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_HapticDirection set(
        byte type,
        IntBuffer dir
    ) {
        type(type);
        dir(dir);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_HapticDirection set(SDL_HapticDirection src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_HapticDirection} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_HapticDirection malloc() {
        return new SDL_HapticDirection(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_HapticDirection} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_HapticDirection calloc() {
        return new SDL_HapticDirection(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_HapticDirection} instance allocated with {@link BufferUtils}. */
    public static SDL_HapticDirection create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_HapticDirection(memAddress(container), container);
    }

    /** Returns a new {@code SDL_HapticDirection} instance for the specified memory address. */
    public static SDL_HapticDirection create(long address) {
        return new SDL_HapticDirection(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_HapticDirection createSafe(long address) {
        return address == NULL ? null : new SDL_HapticDirection(address, null);
    }

    /**
     * Returns a new {@link SDL_HapticDirection.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_HapticDirection.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_HapticDirection.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_HapticDirection.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_HapticDirection.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_HapticDirection.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_HapticDirection.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_HapticDirection.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_HapticDirection.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_HapticDirection} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_HapticDirection malloc(MemoryStack stack) {
        return new SDL_HapticDirection(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_HapticDirection} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_HapticDirection calloc(MemoryStack stack) {
        return new SDL_HapticDirection(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_HapticDirection.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_HapticDirection.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_HapticDirection.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_HapticDirection.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static byte ntype(long struct) { return memGetByte(struct + SDL_HapticDirection.TYPE); }
    /** Unsafe version of {@link #dir}. */
    public static IntBuffer ndir(long struct) { return memIntBuffer(struct + SDL_HapticDirection.DIR, 3); }
    /** Unsafe version of {@link #dir(int) dir}. */
    public static int ndir(long struct, int index) {
        return memGetInt(struct + SDL_HapticDirection.DIR + check(index, 3) * 4);
    }

    /** Unsafe version of {@link #type(byte) type}. */
    public static void ntype(long struct, byte value) { memPutByte(struct + SDL_HapticDirection.TYPE, value); }
    /** Unsafe version of {@link #dir(IntBuffer) dir}. */
    public static void ndir(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + SDL_HapticDirection.DIR, value.remaining() * 4);
    }
    /** Unsafe version of {@link #dir(int, int) dir}. */
    public static void ndir(long struct, int index, int value) {
        memPutInt(struct + SDL_HapticDirection.DIR + check(index, 3) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link SDL_HapticDirection} structs. */
    public static class Buffer extends StructBuffer<SDL_HapticDirection, Buffer> implements NativeResource {

        private static final SDL_HapticDirection ELEMENT_FACTORY = SDL_HapticDirection.create(-1L);

        /**
         * Creates a new {@code SDL_HapticDirection.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_HapticDirection#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_HapticDirection getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("Uint8")
        public byte type() { return SDL_HapticDirection.ntype(address()); }
        /** @return a {@link IntBuffer} view of the {@code dir} field. */
        @NativeType("Sint32[3]")
        public IntBuffer dir() { return SDL_HapticDirection.ndir(address()); }
        /** @return the value at the specified index of the {@code dir} field. */
        @NativeType("Sint32")
        public int dir(int index) { return SDL_HapticDirection.ndir(address(), index); }

        /** Sets the specified value to the {@code type} field. */
        public SDL_HapticDirection.Buffer type(@NativeType("Uint8") byte value) { SDL_HapticDirection.ntype(address(), value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code dir} field. */
        public SDL_HapticDirection.Buffer dir(@NativeType("Sint32[3]") IntBuffer value) { SDL_HapticDirection.ndir(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code dir} field. */
        public SDL_HapticDirection.Buffer dir(int index, @NativeType("Sint32") int value) { SDL_HapticDirection.ndir(address(), index, value); return this; }

    }

}