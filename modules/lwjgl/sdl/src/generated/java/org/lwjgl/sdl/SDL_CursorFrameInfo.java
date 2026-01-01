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
 * <pre><code>
 * struct SDL_CursorFrameInfo {
 *     {@link SDL_Surface SDL_Surface} * surface;
 *     Uint32 duration;
 * }</code></pre>
 */
public class SDL_CursorFrameInfo extends Struct<SDL_CursorFrameInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SURFACE,
        DURATION;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SURFACE = layout.offsetof(0);
        DURATION = layout.offsetof(1);
    }

    protected SDL_CursorFrameInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_CursorFrameInfo create(long address, @Nullable ByteBuffer container) {
        return new SDL_CursorFrameInfo(address, container);
    }

    /**
     * Creates a {@code SDL_CursorFrameInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_CursorFrameInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link SDL_Surface} view of the struct pointed to by the {@code surface} field. */
    @NativeType("SDL_Surface *")
    public SDL_Surface surface() { return nsurface(address()); }
    /** @return the value of the {@code duration} field. */
    @NativeType("Uint32")
    public int duration() { return nduration(address()); }

    /** Sets the address of the specified {@link SDL_Surface} to the {@code surface} field. */
    public SDL_CursorFrameInfo surface(@NativeType("SDL_Surface *") SDL_Surface value) { nsurface(address(), value); return this; }
    /** Sets the specified value to the {@code duration} field. */
    public SDL_CursorFrameInfo duration(@NativeType("Uint32") int value) { nduration(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_CursorFrameInfo set(
        SDL_Surface surface,
        int duration
    ) {
        surface(surface);
        duration(duration);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_CursorFrameInfo set(SDL_CursorFrameInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_CursorFrameInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_CursorFrameInfo malloc() {
        return new SDL_CursorFrameInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_CursorFrameInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_CursorFrameInfo calloc() {
        return new SDL_CursorFrameInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_CursorFrameInfo} instance allocated with {@link BufferUtils}. */
    public static SDL_CursorFrameInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_CursorFrameInfo(memAddress(container), container);
    }

    /** Returns a new {@code SDL_CursorFrameInfo} instance for the specified memory address. */
    public static SDL_CursorFrameInfo create(long address) {
        return new SDL_CursorFrameInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_CursorFrameInfo createSafe(long address) {
        return address == NULL ? null : new SDL_CursorFrameInfo(address, null);
    }

    /**
     * Returns a new {@link SDL_CursorFrameInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_CursorFrameInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_CursorFrameInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_CursorFrameInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_CursorFrameInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_CursorFrameInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_CursorFrameInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_CursorFrameInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_CursorFrameInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_CursorFrameInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_CursorFrameInfo malloc(MemoryStack stack) {
        return new SDL_CursorFrameInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_CursorFrameInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_CursorFrameInfo calloc(MemoryStack stack) {
        return new SDL_CursorFrameInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_CursorFrameInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_CursorFrameInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_CursorFrameInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_CursorFrameInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #surface}. */
    public static SDL_Surface nsurface(long struct) { return SDL_Surface.create(memGetAddress(struct + SDL_CursorFrameInfo.SURFACE)); }
    /** Unsafe version of {@link #duration}. */
    public static int nduration(long struct) { return memGetInt(struct + SDL_CursorFrameInfo.DURATION); }

    /** Unsafe version of {@link #surface(SDL_Surface) surface}. */
    public static void nsurface(long struct, SDL_Surface value) { memPutAddress(struct + SDL_CursorFrameInfo.SURFACE, value.address()); }
    /** Unsafe version of {@link #duration(int) duration}. */
    public static void nduration(long struct, int value) { memPutInt(struct + SDL_CursorFrameInfo.DURATION, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + SDL_CursorFrameInfo.SURFACE));
    }

    // -----------------------------------

    /** An array of {@link SDL_CursorFrameInfo} structs. */
    public static class Buffer extends StructBuffer<SDL_CursorFrameInfo, Buffer> implements NativeResource {

        private static final SDL_CursorFrameInfo ELEMENT_FACTORY = SDL_CursorFrameInfo.create(-1L);

        /**
         * Creates a new {@code SDL_CursorFrameInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_CursorFrameInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_CursorFrameInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link SDL_Surface} view of the struct pointed to by the {@code surface} field. */
        @NativeType("SDL_Surface *")
        public SDL_Surface surface() { return SDL_CursorFrameInfo.nsurface(address()); }
        /** @return the value of the {@code duration} field. */
        @NativeType("Uint32")
        public int duration() { return SDL_CursorFrameInfo.nduration(address()); }

        /** Sets the address of the specified {@link SDL_Surface} to the {@code surface} field. */
        public SDL_CursorFrameInfo.Buffer surface(@NativeType("SDL_Surface *") SDL_Surface value) { SDL_CursorFrameInfo.nsurface(address(), value); return this; }
        /** Sets the specified value to the {@code duration} field. */
        public SDL_CursorFrameInfo.Buffer duration(@NativeType("Uint32") int value) { SDL_CursorFrameInfo.nduration(address(), value); return this; }

    }

}