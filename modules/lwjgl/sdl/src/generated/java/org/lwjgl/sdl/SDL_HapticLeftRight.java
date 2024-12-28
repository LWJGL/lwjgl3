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
 * struct SDL_HapticLeftRight {
 *     Uint16 type;
 *     Uint32 length;
 *     Uint16 large_magnitude;
 *     Uint16 small_magnitude;
 * }}</pre>
 */
public class SDL_HapticLeftRight extends Struct<SDL_HapticLeftRight> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        LENGTH,
        LARGE_MAGNITUDE,
        SMALL_MAGNITUDE;

    static {
        Layout layout = __struct(
            __member(2),
            __member(4),
            __member(2),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        LENGTH = layout.offsetof(1);
        LARGE_MAGNITUDE = layout.offsetof(2);
        SMALL_MAGNITUDE = layout.offsetof(3);
    }

    protected SDL_HapticLeftRight(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_HapticLeftRight create(long address, @Nullable ByteBuffer container) {
        return new SDL_HapticLeftRight(address, container);
    }

    /**
     * Creates a {@code SDL_HapticLeftRight} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_HapticLeftRight(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("Uint16")
    public short type() { return ntype(address()); }
    /** @return the value of the {@code length} field. */
    @NativeType("Uint32")
    public int length() { return nlength(address()); }
    /** @return the value of the {@code large_magnitude} field. */
    @NativeType("Uint16")
    public short large_magnitude() { return nlarge_magnitude(address()); }
    /** @return the value of the {@code small_magnitude} field. */
    @NativeType("Uint16")
    public short small_magnitude() { return nsmall_magnitude(address()); }

    /** Sets the specified value to the {@code type} field. */
    public SDL_HapticLeftRight type(@NativeType("Uint16") short value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code length} field. */
    public SDL_HapticLeftRight length(@NativeType("Uint32") int value) { nlength(address(), value); return this; }
    /** Sets the specified value to the {@code large_magnitude} field. */
    public SDL_HapticLeftRight large_magnitude(@NativeType("Uint16") short value) { nlarge_magnitude(address(), value); return this; }
    /** Sets the specified value to the {@code small_magnitude} field. */
    public SDL_HapticLeftRight small_magnitude(@NativeType("Uint16") short value) { nsmall_magnitude(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_HapticLeftRight set(
        short type,
        int length,
        short large_magnitude,
        short small_magnitude
    ) {
        type(type);
        length(length);
        large_magnitude(large_magnitude);
        small_magnitude(small_magnitude);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_HapticLeftRight set(SDL_HapticLeftRight src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_HapticLeftRight} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_HapticLeftRight malloc() {
        return new SDL_HapticLeftRight(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_HapticLeftRight} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_HapticLeftRight calloc() {
        return new SDL_HapticLeftRight(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_HapticLeftRight} instance allocated with {@link BufferUtils}. */
    public static SDL_HapticLeftRight create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_HapticLeftRight(memAddress(container), container);
    }

    /** Returns a new {@code SDL_HapticLeftRight} instance for the specified memory address. */
    public static SDL_HapticLeftRight create(long address) {
        return new SDL_HapticLeftRight(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_HapticLeftRight createSafe(long address) {
        return address == NULL ? null : new SDL_HapticLeftRight(address, null);
    }

    /**
     * Returns a new {@link SDL_HapticLeftRight.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_HapticLeftRight.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_HapticLeftRight.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_HapticLeftRight.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_HapticLeftRight.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_HapticLeftRight.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_HapticLeftRight.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_HapticLeftRight.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_HapticLeftRight.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_HapticLeftRight} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_HapticLeftRight malloc(MemoryStack stack) {
        return new SDL_HapticLeftRight(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_HapticLeftRight} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_HapticLeftRight calloc(MemoryStack stack) {
        return new SDL_HapticLeftRight(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_HapticLeftRight.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_HapticLeftRight.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_HapticLeftRight.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_HapticLeftRight.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static short ntype(long struct) { return memGetShort(struct + SDL_HapticLeftRight.TYPE); }
    /** Unsafe version of {@link #length}. */
    public static int nlength(long struct) { return memGetInt(struct + SDL_HapticLeftRight.LENGTH); }
    /** Unsafe version of {@link #large_magnitude}. */
    public static short nlarge_magnitude(long struct) { return memGetShort(struct + SDL_HapticLeftRight.LARGE_MAGNITUDE); }
    /** Unsafe version of {@link #small_magnitude}. */
    public static short nsmall_magnitude(long struct) { return memGetShort(struct + SDL_HapticLeftRight.SMALL_MAGNITUDE); }

    /** Unsafe version of {@link #type(short) type}. */
    public static void ntype(long struct, short value) { memPutShort(struct + SDL_HapticLeftRight.TYPE, value); }
    /** Unsafe version of {@link #length(int) length}. */
    public static void nlength(long struct, int value) { memPutInt(struct + SDL_HapticLeftRight.LENGTH, value); }
    /** Unsafe version of {@link #large_magnitude(short) large_magnitude}. */
    public static void nlarge_magnitude(long struct, short value) { memPutShort(struct + SDL_HapticLeftRight.LARGE_MAGNITUDE, value); }
    /** Unsafe version of {@link #small_magnitude(short) small_magnitude}. */
    public static void nsmall_magnitude(long struct, short value) { memPutShort(struct + SDL_HapticLeftRight.SMALL_MAGNITUDE, value); }

    // -----------------------------------

    /** An array of {@link SDL_HapticLeftRight} structs. */
    public static class Buffer extends StructBuffer<SDL_HapticLeftRight, Buffer> implements NativeResource {

        private static final SDL_HapticLeftRight ELEMENT_FACTORY = SDL_HapticLeftRight.create(-1L);

        /**
         * Creates a new {@code SDL_HapticLeftRight.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_HapticLeftRight#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_HapticLeftRight getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("Uint16")
        public short type() { return SDL_HapticLeftRight.ntype(address()); }
        /** @return the value of the {@code length} field. */
        @NativeType("Uint32")
        public int length() { return SDL_HapticLeftRight.nlength(address()); }
        /** @return the value of the {@code large_magnitude} field. */
        @NativeType("Uint16")
        public short large_magnitude() { return SDL_HapticLeftRight.nlarge_magnitude(address()); }
        /** @return the value of the {@code small_magnitude} field. */
        @NativeType("Uint16")
        public short small_magnitude() { return SDL_HapticLeftRight.nsmall_magnitude(address()); }

        /** Sets the specified value to the {@code type} field. */
        public SDL_HapticLeftRight.Buffer type(@NativeType("Uint16") short value) { SDL_HapticLeftRight.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code length} field. */
        public SDL_HapticLeftRight.Buffer length(@NativeType("Uint32") int value) { SDL_HapticLeftRight.nlength(address(), value); return this; }
        /** Sets the specified value to the {@code large_magnitude} field. */
        public SDL_HapticLeftRight.Buffer large_magnitude(@NativeType("Uint16") short value) { SDL_HapticLeftRight.nlarge_magnitude(address(), value); return this; }
        /** Sets the specified value to the {@code small_magnitude} field. */
        public SDL_HapticLeftRight.Buffer small_magnitude(@NativeType("Uint16") short value) { SDL_HapticLeftRight.nsmall_magnitude(address(), value); return this; }

    }

}