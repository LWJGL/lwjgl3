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
 * struct SDL_Locale {
 *     char const * language;
 *     char const * country;
 * }}</pre>
 */
public class SDL_Locale extends Struct<SDL_Locale> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LANGUAGE,
        COUNTRY;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LANGUAGE = layout.offsetof(0);
        COUNTRY = layout.offsetof(1);
    }

    protected SDL_Locale(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_Locale create(long address, @Nullable ByteBuffer container) {
        return new SDL_Locale(address, container);
    }

    /**
     * Creates a {@code SDL_Locale} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_Locale(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code language} field. */
    @NativeType("char const *")
    public ByteBuffer language() { return nlanguage(address()); }
    /** @return the null-terminated string pointed to by the {@code language} field. */
    @NativeType("char const *")
    public String languageString() { return nlanguageString(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code country} field. */
    @NativeType("char const *")
    public @Nullable ByteBuffer country() { return ncountry(address()); }
    /** @return the null-terminated string pointed to by the {@code country} field. */
    @NativeType("char const *")
    public @Nullable String countryString() { return ncountryString(address()); }

    /** Sets the address of the specified encoded string to the {@code language} field. */
    public SDL_Locale language(@NativeType("char const *") ByteBuffer value) { nlanguage(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code country} field. */
    public SDL_Locale country(@Nullable @NativeType("char const *") ByteBuffer value) { ncountry(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_Locale set(
        ByteBuffer language,
        @Nullable ByteBuffer country
    ) {
        language(language);
        country(country);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_Locale set(SDL_Locale src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_Locale} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_Locale malloc() {
        return new SDL_Locale(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_Locale} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_Locale calloc() {
        return new SDL_Locale(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_Locale} instance allocated with {@link BufferUtils}. */
    public static SDL_Locale create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_Locale(memAddress(container), container);
    }

    /** Returns a new {@code SDL_Locale} instance for the specified memory address. */
    public static SDL_Locale create(long address) {
        return new SDL_Locale(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_Locale createSafe(long address) {
        return address == NULL ? null : new SDL_Locale(address, null);
    }

    /**
     * Returns a new {@link SDL_Locale.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_Locale.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_Locale.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_Locale.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_Locale.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_Locale.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_Locale.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_Locale.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_Locale.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_Locale} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_Locale malloc(MemoryStack stack) {
        return new SDL_Locale(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_Locale} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_Locale calloc(MemoryStack stack) {
        return new SDL_Locale(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_Locale.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_Locale.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_Locale.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_Locale.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #language}. */
    public static ByteBuffer nlanguage(long struct) { return memByteBufferNT1(memGetAddress(struct + SDL_Locale.LANGUAGE)); }
    /** Unsafe version of {@link #languageString}. */
    public static String nlanguageString(long struct) { return memASCII(memGetAddress(struct + SDL_Locale.LANGUAGE)); }
    /** Unsafe version of {@link #country}. */
    public static @Nullable ByteBuffer ncountry(long struct) { return memByteBufferNT1Safe(memGetAddress(struct + SDL_Locale.COUNTRY)); }
    /** Unsafe version of {@link #countryString}. */
    public static @Nullable String ncountryString(long struct) { return memASCIISafe(memGetAddress(struct + SDL_Locale.COUNTRY)); }

    /** Unsafe version of {@link #language(ByteBuffer) language}. */
    public static void nlanguage(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + SDL_Locale.LANGUAGE, memAddress(value));
    }
    /** Unsafe version of {@link #country(ByteBuffer) country}. */
    public static void ncountry(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + SDL_Locale.COUNTRY, memAddressSafe(value));
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + SDL_Locale.LANGUAGE));
    }

    // -----------------------------------

    /** An array of {@link SDL_Locale} structs. */
    public static class Buffer extends StructBuffer<SDL_Locale, Buffer> implements NativeResource {

        private static final SDL_Locale ELEMENT_FACTORY = SDL_Locale.create(-1L);

        /**
         * Creates a new {@code SDL_Locale.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_Locale#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_Locale getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code language} field. */
        @NativeType("char const *")
        public ByteBuffer language() { return SDL_Locale.nlanguage(address()); }
        /** @return the null-terminated string pointed to by the {@code language} field. */
        @NativeType("char const *")
        public String languageString() { return SDL_Locale.nlanguageString(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code country} field. */
        @NativeType("char const *")
        public @Nullable ByteBuffer country() { return SDL_Locale.ncountry(address()); }
        /** @return the null-terminated string pointed to by the {@code country} field. */
        @NativeType("char const *")
        public @Nullable String countryString() { return SDL_Locale.ncountryString(address()); }

        /** Sets the address of the specified encoded string to the {@code language} field. */
        public SDL_Locale.Buffer language(@NativeType("char const *") ByteBuffer value) { SDL_Locale.nlanguage(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code country} field. */
        public SDL_Locale.Buffer country(@Nullable @NativeType("char const *") ByteBuffer value) { SDL_Locale.ncountry(address(), value); return this; }

    }

}