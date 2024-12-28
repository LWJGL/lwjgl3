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
 * struct SDL_MessageBoxButtonData {
 *     SDL_MessageBoxButtonFlags flags;
 *     int buttonID;
 *     char const * text;
 * }}</pre>
 */
public class SDL_MessageBoxButtonData extends Struct<SDL_MessageBoxButtonData> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        BUTTONID,
        TEXT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        BUTTONID = layout.offsetof(1);
        TEXT = layout.offsetof(2);
    }

    protected SDL_MessageBoxButtonData(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_MessageBoxButtonData create(long address, @Nullable ByteBuffer container) {
        return new SDL_MessageBoxButtonData(address, container);
    }

    /**
     * Creates a {@code SDL_MessageBoxButtonData} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_MessageBoxButtonData(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code flags} field. */
    @NativeType("SDL_MessageBoxButtonFlags")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code buttonID} field. */
    public int buttonID() { return nbuttonID(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code text} field. */
    @NativeType("char const *")
    public ByteBuffer text() { return ntext(address()); }
    /** @return the null-terminated string pointed to by the {@code text} field. */
    @NativeType("char const *")
    public String textString() { return ntextString(address()); }

    /** Sets the specified value to the {@code flags} field. */
    public SDL_MessageBoxButtonData flags(@NativeType("SDL_MessageBoxButtonFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code buttonID} field. */
    public SDL_MessageBoxButtonData buttonID(int value) { nbuttonID(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code text} field. */
    public SDL_MessageBoxButtonData text(@NativeType("char const *") ByteBuffer value) { ntext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_MessageBoxButtonData set(
        int flags,
        int buttonID,
        ByteBuffer text
    ) {
        flags(flags);
        buttonID(buttonID);
        text(text);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_MessageBoxButtonData set(SDL_MessageBoxButtonData src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_MessageBoxButtonData} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_MessageBoxButtonData malloc() {
        return new SDL_MessageBoxButtonData(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_MessageBoxButtonData} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_MessageBoxButtonData calloc() {
        return new SDL_MessageBoxButtonData(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_MessageBoxButtonData} instance allocated with {@link BufferUtils}. */
    public static SDL_MessageBoxButtonData create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_MessageBoxButtonData(memAddress(container), container);
    }

    /** Returns a new {@code SDL_MessageBoxButtonData} instance for the specified memory address. */
    public static SDL_MessageBoxButtonData create(long address) {
        return new SDL_MessageBoxButtonData(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_MessageBoxButtonData createSafe(long address) {
        return address == NULL ? null : new SDL_MessageBoxButtonData(address, null);
    }

    /**
     * Returns a new {@link SDL_MessageBoxButtonData.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_MessageBoxButtonData.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_MessageBoxButtonData.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_MessageBoxButtonData.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_MessageBoxButtonData.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_MessageBoxButtonData.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_MessageBoxButtonData.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_MessageBoxButtonData.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_MessageBoxButtonData.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_MessageBoxButtonData} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_MessageBoxButtonData malloc(MemoryStack stack) {
        return new SDL_MessageBoxButtonData(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_MessageBoxButtonData} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_MessageBoxButtonData calloc(MemoryStack stack) {
        return new SDL_MessageBoxButtonData(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_MessageBoxButtonData.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_MessageBoxButtonData.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_MessageBoxButtonData.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_MessageBoxButtonData.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + SDL_MessageBoxButtonData.FLAGS); }
    /** Unsafe version of {@link #buttonID}. */
    public static int nbuttonID(long struct) { return memGetInt(struct + SDL_MessageBoxButtonData.BUTTONID); }
    /** Unsafe version of {@link #text}. */
    public static ByteBuffer ntext(long struct) { return memByteBufferNT1(memGetAddress(struct + SDL_MessageBoxButtonData.TEXT)); }
    /** Unsafe version of {@link #textString}. */
    public static String ntextString(long struct) { return memUTF8(memGetAddress(struct + SDL_MessageBoxButtonData.TEXT)); }

    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + SDL_MessageBoxButtonData.FLAGS, value); }
    /** Unsafe version of {@link #buttonID(int) buttonID}. */
    public static void nbuttonID(long struct, int value) { memPutInt(struct + SDL_MessageBoxButtonData.BUTTONID, value); }
    /** Unsafe version of {@link #text(ByteBuffer) text}. */
    public static void ntext(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + SDL_MessageBoxButtonData.TEXT, memAddress(value));
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + SDL_MessageBoxButtonData.TEXT));
    }

    // -----------------------------------

    /** An array of {@link SDL_MessageBoxButtonData} structs. */
    public static class Buffer extends StructBuffer<SDL_MessageBoxButtonData, Buffer> implements NativeResource {

        private static final SDL_MessageBoxButtonData ELEMENT_FACTORY = SDL_MessageBoxButtonData.create(-1L);

        /**
         * Creates a new {@code SDL_MessageBoxButtonData.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_MessageBoxButtonData#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_MessageBoxButtonData getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code flags} field. */
        @NativeType("SDL_MessageBoxButtonFlags")
        public int flags() { return SDL_MessageBoxButtonData.nflags(address()); }
        /** @return the value of the {@code buttonID} field. */
        public int buttonID() { return SDL_MessageBoxButtonData.nbuttonID(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code text} field. */
        @NativeType("char const *")
        public ByteBuffer text() { return SDL_MessageBoxButtonData.ntext(address()); }
        /** @return the null-terminated string pointed to by the {@code text} field. */
        @NativeType("char const *")
        public String textString() { return SDL_MessageBoxButtonData.ntextString(address()); }

        /** Sets the specified value to the {@code flags} field. */
        public SDL_MessageBoxButtonData.Buffer flags(@NativeType("SDL_MessageBoxButtonFlags") int value) { SDL_MessageBoxButtonData.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code buttonID} field. */
        public SDL_MessageBoxButtonData.Buffer buttonID(int value) { SDL_MessageBoxButtonData.nbuttonID(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code text} field. */
        public SDL_MessageBoxButtonData.Buffer text(@NativeType("char const *") ByteBuffer value) { SDL_MessageBoxButtonData.ntext(address(), value); return this; }

    }

}