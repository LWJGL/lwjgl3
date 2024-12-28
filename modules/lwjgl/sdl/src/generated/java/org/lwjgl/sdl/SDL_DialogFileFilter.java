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
 * struct SDL_DialogFileFilter {
 *     char const * name;
 *     char const * pattern;
 * }}</pre>
 */
public class SDL_DialogFileFilter extends Struct<SDL_DialogFileFilter> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NAME,
        PATTERN;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NAME = layout.offsetof(0);
        PATTERN = layout.offsetof(1);
    }

    protected SDL_DialogFileFilter(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_DialogFileFilter create(long address, @Nullable ByteBuffer container) {
        return new SDL_DialogFileFilter(address, container);
    }

    /**
     * Creates a {@code SDL_DialogFileFilter} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_DialogFileFilter(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
    @NativeType("char const *")
    public ByteBuffer name() { return nname(address()); }
    /** @return the null-terminated string pointed to by the {@code name} field. */
    @NativeType("char const *")
    public String nameString() { return nnameString(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pattern} field. */
    @NativeType("char const *")
    public ByteBuffer pattern() { return npattern(address()); }
    /** @return the null-terminated string pointed to by the {@code pattern} field. */
    @NativeType("char const *")
    public String patternString() { return npatternString(address()); }

    /** Sets the address of the specified encoded string to the {@code name} field. */
    public SDL_DialogFileFilter name(@NativeType("char const *") ByteBuffer value) { nname(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code pattern} field. */
    public SDL_DialogFileFilter pattern(@NativeType("char const *") ByteBuffer value) { npattern(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_DialogFileFilter set(
        ByteBuffer name,
        ByteBuffer pattern
    ) {
        name(name);
        pattern(pattern);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_DialogFileFilter set(SDL_DialogFileFilter src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_DialogFileFilter} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_DialogFileFilter malloc() {
        return new SDL_DialogFileFilter(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_DialogFileFilter} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_DialogFileFilter calloc() {
        return new SDL_DialogFileFilter(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_DialogFileFilter} instance allocated with {@link BufferUtils}. */
    public static SDL_DialogFileFilter create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_DialogFileFilter(memAddress(container), container);
    }

    /** Returns a new {@code SDL_DialogFileFilter} instance for the specified memory address. */
    public static SDL_DialogFileFilter create(long address) {
        return new SDL_DialogFileFilter(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_DialogFileFilter createSafe(long address) {
        return address == NULL ? null : new SDL_DialogFileFilter(address, null);
    }

    /**
     * Returns a new {@link SDL_DialogFileFilter.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_DialogFileFilter.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_DialogFileFilter.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_DialogFileFilter.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_DialogFileFilter.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_DialogFileFilter.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_DialogFileFilter.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_DialogFileFilter.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_DialogFileFilter.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_DialogFileFilter} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_DialogFileFilter malloc(MemoryStack stack) {
        return new SDL_DialogFileFilter(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_DialogFileFilter} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_DialogFileFilter calloc(MemoryStack stack) {
        return new SDL_DialogFileFilter(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_DialogFileFilter.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_DialogFileFilter.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_DialogFileFilter.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_DialogFileFilter.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBufferNT1(memGetAddress(struct + SDL_DialogFileFilter.NAME)); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memUTF8(memGetAddress(struct + SDL_DialogFileFilter.NAME)); }
    /** Unsafe version of {@link #pattern}. */
    public static ByteBuffer npattern(long struct) { return memByteBufferNT1(memGetAddress(struct + SDL_DialogFileFilter.PATTERN)); }
    /** Unsafe version of {@link #patternString}. */
    public static String npatternString(long struct) { return memUTF8(memGetAddress(struct + SDL_DialogFileFilter.PATTERN)); }

    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + SDL_DialogFileFilter.NAME, memAddress(value));
    }
    /** Unsafe version of {@link #pattern(ByteBuffer) pattern}. */
    public static void npattern(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + SDL_DialogFileFilter.PATTERN, memAddress(value));
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + SDL_DialogFileFilter.NAME));
        check(memGetAddress(struct + SDL_DialogFileFilter.PATTERN));
    }

    // -----------------------------------

    /** An array of {@link SDL_DialogFileFilter} structs. */
    public static class Buffer extends StructBuffer<SDL_DialogFileFilter, Buffer> implements NativeResource {

        private static final SDL_DialogFileFilter ELEMENT_FACTORY = SDL_DialogFileFilter.create(-1L);

        /**
         * Creates a new {@code SDL_DialogFileFilter.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_DialogFileFilter#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_DialogFileFilter getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
        @NativeType("char const *")
        public ByteBuffer name() { return SDL_DialogFileFilter.nname(address()); }
        /** @return the null-terminated string pointed to by the {@code name} field. */
        @NativeType("char const *")
        public String nameString() { return SDL_DialogFileFilter.nnameString(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pattern} field. */
        @NativeType("char const *")
        public ByteBuffer pattern() { return SDL_DialogFileFilter.npattern(address()); }
        /** @return the null-terminated string pointed to by the {@code pattern} field. */
        @NativeType("char const *")
        public String patternString() { return SDL_DialogFileFilter.npatternString(address()); }

        /** Sets the address of the specified encoded string to the {@code name} field. */
        public SDL_DialogFileFilter.Buffer name(@NativeType("char const *") ByteBuffer value) { SDL_DialogFileFilter.nname(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code pattern} field. */
        public SDL_DialogFileFilter.Buffer pattern(@NativeType("char const *") ByteBuffer value) { SDL_DialogFileFilter.npattern(address(), value); return this; }

    }

}