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
 * struct SDL_VirtualJoystickTouchpadDesc {
 *     Uint16 nfingers;
 *     Uint16 padding[3];
 * }}</pre>
 */
public class SDL_VirtualJoystickTouchpadDesc extends Struct<SDL_VirtualJoystickTouchpadDesc> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NFINGERS,
        PADDING;

    static {
        Layout layout = __struct(
            __member(2),
            __array(2, 3)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NFINGERS = layout.offsetof(0);
        PADDING = layout.offsetof(1);
    }

    protected SDL_VirtualJoystickTouchpadDesc(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_VirtualJoystickTouchpadDesc create(long address, @Nullable ByteBuffer container) {
        return new SDL_VirtualJoystickTouchpadDesc(address, container);
    }

    /**
     * Creates a {@code SDL_VirtualJoystickTouchpadDesc} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_VirtualJoystickTouchpadDesc(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code nfingers} field. */
    @NativeType("Uint16")
    public short nfingers() { return nnfingers(address()); }

    /** Sets the specified value to the {@code nfingers} field. */
    public SDL_VirtualJoystickTouchpadDesc nfingers(@NativeType("Uint16") short value) { nnfingers(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_VirtualJoystickTouchpadDesc set(SDL_VirtualJoystickTouchpadDesc src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_VirtualJoystickTouchpadDesc} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_VirtualJoystickTouchpadDesc malloc() {
        return new SDL_VirtualJoystickTouchpadDesc(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_VirtualJoystickTouchpadDesc} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_VirtualJoystickTouchpadDesc calloc() {
        return new SDL_VirtualJoystickTouchpadDesc(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_VirtualJoystickTouchpadDesc} instance allocated with {@link BufferUtils}. */
    public static SDL_VirtualJoystickTouchpadDesc create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_VirtualJoystickTouchpadDesc(memAddress(container), container);
    }

    /** Returns a new {@code SDL_VirtualJoystickTouchpadDesc} instance for the specified memory address. */
    public static SDL_VirtualJoystickTouchpadDesc create(long address) {
        return new SDL_VirtualJoystickTouchpadDesc(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_VirtualJoystickTouchpadDesc createSafe(long address) {
        return address == NULL ? null : new SDL_VirtualJoystickTouchpadDesc(address, null);
    }

    /**
     * Returns a new {@link SDL_VirtualJoystickTouchpadDesc.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_VirtualJoystickTouchpadDesc.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_VirtualJoystickTouchpadDesc.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_VirtualJoystickTouchpadDesc.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_VirtualJoystickTouchpadDesc.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_VirtualJoystickTouchpadDesc.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_VirtualJoystickTouchpadDesc.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_VirtualJoystickTouchpadDesc.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_VirtualJoystickTouchpadDesc.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_VirtualJoystickTouchpadDesc} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_VirtualJoystickTouchpadDesc malloc(MemoryStack stack) {
        return new SDL_VirtualJoystickTouchpadDesc(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_VirtualJoystickTouchpadDesc} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_VirtualJoystickTouchpadDesc calloc(MemoryStack stack) {
        return new SDL_VirtualJoystickTouchpadDesc(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_VirtualJoystickTouchpadDesc.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_VirtualJoystickTouchpadDesc.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_VirtualJoystickTouchpadDesc.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_VirtualJoystickTouchpadDesc.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #nfingers}. */
    public static short nnfingers(long struct) { return memGetShort(struct + SDL_VirtualJoystickTouchpadDesc.NFINGERS); }
    public static ShortBuffer npadding(long struct) { return memShortBuffer(struct + SDL_VirtualJoystickTouchpadDesc.PADDING, 3); }
    public static short npadding(long struct, int index) {
        return memGetShort(struct + SDL_VirtualJoystickTouchpadDesc.PADDING + check(index, 3) * 2);
    }

    /** Unsafe version of {@link #nfingers(short) nfingers}. */
    public static void nnfingers(long struct, short value) { memPutShort(struct + SDL_VirtualJoystickTouchpadDesc.NFINGERS, value); }
    public static void npadding(long struct, ShortBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + SDL_VirtualJoystickTouchpadDesc.PADDING, value.remaining() * 2);
    }
    public static void npadding(long struct, int index, short value) {
        memPutShort(struct + SDL_VirtualJoystickTouchpadDesc.PADDING + check(index, 3) * 2, value);
    }

    // -----------------------------------

    /** An array of {@link SDL_VirtualJoystickTouchpadDesc} structs. */
    public static class Buffer extends StructBuffer<SDL_VirtualJoystickTouchpadDesc, Buffer> implements NativeResource {

        private static final SDL_VirtualJoystickTouchpadDesc ELEMENT_FACTORY = SDL_VirtualJoystickTouchpadDesc.create(-1L);

        /**
         * Creates a new {@code SDL_VirtualJoystickTouchpadDesc.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_VirtualJoystickTouchpadDesc#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_VirtualJoystickTouchpadDesc getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code nfingers} field. */
        @NativeType("Uint16")
        public short nfingers() { return SDL_VirtualJoystickTouchpadDesc.nnfingers(address()); }

        /** Sets the specified value to the {@code nfingers} field. */
        public SDL_VirtualJoystickTouchpadDesc.Buffer nfingers(@NativeType("Uint16") short value) { SDL_VirtualJoystickTouchpadDesc.nnfingers(address(), value); return this; }

    }

}