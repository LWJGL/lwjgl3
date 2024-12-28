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
 * struct SDL_TextInputEvent {
 *     SDL_EventType type;
 *     Uint32 reserved;
 *     Uint64 timestamp;
 *     SDL_WindowID windowID;
 *     char const * text;
 * }}</pre>
 */
public class SDL_TextInputEvent extends Struct<SDL_TextInputEvent> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        RESERVED,
        TIMESTAMP,
        WINDOWID,
        TEXT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(8),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        RESERVED = layout.offsetof(1);
        TIMESTAMP = layout.offsetof(2);
        WINDOWID = layout.offsetof(3);
        TEXT = layout.offsetof(4);
    }

    protected SDL_TextInputEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_TextInputEvent create(long address, @Nullable ByteBuffer container) {
        return new SDL_TextInputEvent(address, container);
    }

    /**
     * Creates a {@code SDL_TextInputEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_TextInputEvent(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("SDL_EventType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code reserved} field. */
    @NativeType("Uint32")
    public int reserved() { return nreserved(address()); }
    /** @return the value of the {@code timestamp} field. */
    @NativeType("Uint64")
    public long timestamp() { return ntimestamp(address()); }
    /** @return the value of the {@code windowID} field. */
    @NativeType("SDL_WindowID")
    public int windowID() { return nwindowID(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code text} field. */
    @NativeType("char const *")
    public @Nullable ByteBuffer text() { return ntext(address()); }
    /** @return the null-terminated string pointed to by the {@code text} field. */
    @NativeType("char const *")
    public @Nullable String textString() { return ntextString(address()); }

    /** Sets the specified value to the {@code type} field. */
    public SDL_TextInputEvent type(@NativeType("SDL_EventType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code reserved} field. */
    public SDL_TextInputEvent reserved(@NativeType("Uint32") int value) { nreserved(address(), value); return this; }
    /** Sets the specified value to the {@code timestamp} field. */
    public SDL_TextInputEvent timestamp(@NativeType("Uint64") long value) { ntimestamp(address(), value); return this; }
    /** Sets the specified value to the {@code windowID} field. */
    public SDL_TextInputEvent windowID(@NativeType("SDL_WindowID") int value) { nwindowID(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code text} field. */
    public SDL_TextInputEvent text(@Nullable @NativeType("char const *") ByteBuffer value) { ntext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_TextInputEvent set(
        int type,
        int reserved,
        long timestamp,
        int windowID,
        @Nullable ByteBuffer text
    ) {
        type(type);
        reserved(reserved);
        timestamp(timestamp);
        windowID(windowID);
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
    public SDL_TextInputEvent set(SDL_TextInputEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_TextInputEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_TextInputEvent malloc() {
        return new SDL_TextInputEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_TextInputEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_TextInputEvent calloc() {
        return new SDL_TextInputEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_TextInputEvent} instance allocated with {@link BufferUtils}. */
    public static SDL_TextInputEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_TextInputEvent(memAddress(container), container);
    }

    /** Returns a new {@code SDL_TextInputEvent} instance for the specified memory address. */
    public static SDL_TextInputEvent create(long address) {
        return new SDL_TextInputEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_TextInputEvent createSafe(long address) {
        return address == NULL ? null : new SDL_TextInputEvent(address, null);
    }

    /**
     * Returns a new {@link SDL_TextInputEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_TextInputEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_TextInputEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_TextInputEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_TextInputEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_TextInputEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_TextInputEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_TextInputEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_TextInputEvent.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_TextInputEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_TextInputEvent malloc(MemoryStack stack) {
        return new SDL_TextInputEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_TextInputEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_TextInputEvent calloc(MemoryStack stack) {
        return new SDL_TextInputEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_TextInputEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_TextInputEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_TextInputEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_TextInputEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + SDL_TextInputEvent.TYPE); }
    /** Unsafe version of {@link #reserved}. */
    public static int nreserved(long struct) { return memGetInt(struct + SDL_TextInputEvent.RESERVED); }
    /** Unsafe version of {@link #timestamp}. */
    public static long ntimestamp(long struct) { return memGetLong(struct + SDL_TextInputEvent.TIMESTAMP); }
    /** Unsafe version of {@link #windowID}. */
    public static int nwindowID(long struct) { return memGetInt(struct + SDL_TextInputEvent.WINDOWID); }
    /** Unsafe version of {@link #text}. */
    public static @Nullable ByteBuffer ntext(long struct) { return memByteBufferNT1Safe(memGetAddress(struct + SDL_TextInputEvent.TEXT)); }
    /** Unsafe version of {@link #textString}. */
    public static @Nullable String ntextString(long struct) { return memUTF8Safe(memGetAddress(struct + SDL_TextInputEvent.TEXT)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + SDL_TextInputEvent.TYPE, value); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static void nreserved(long struct, int value) { memPutInt(struct + SDL_TextInputEvent.RESERVED, value); }
    /** Unsafe version of {@link #timestamp(long) timestamp}. */
    public static void ntimestamp(long struct, long value) { memPutLong(struct + SDL_TextInputEvent.TIMESTAMP, value); }
    /** Unsafe version of {@link #windowID(int) windowID}. */
    public static void nwindowID(long struct, int value) { memPutInt(struct + SDL_TextInputEvent.WINDOWID, value); }
    /** Unsafe version of {@link #text(ByteBuffer) text}. */
    public static void ntext(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + SDL_TextInputEvent.TEXT, memAddressSafe(value));
    }

    // -----------------------------------

    /** An array of {@link SDL_TextInputEvent} structs. */
    public static class Buffer extends StructBuffer<SDL_TextInputEvent, Buffer> implements NativeResource {

        private static final SDL_TextInputEvent ELEMENT_FACTORY = SDL_TextInputEvent.create(-1L);

        /**
         * Creates a new {@code SDL_TextInputEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_TextInputEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_TextInputEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("SDL_EventType")
        public int type() { return SDL_TextInputEvent.ntype(address()); }
        /** @return the value of the {@code reserved} field. */
        @NativeType("Uint32")
        public int reserved() { return SDL_TextInputEvent.nreserved(address()); }
        /** @return the value of the {@code timestamp} field. */
        @NativeType("Uint64")
        public long timestamp() { return SDL_TextInputEvent.ntimestamp(address()); }
        /** @return the value of the {@code windowID} field. */
        @NativeType("SDL_WindowID")
        public int windowID() { return SDL_TextInputEvent.nwindowID(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code text} field. */
        @NativeType("char const *")
        public @Nullable ByteBuffer text() { return SDL_TextInputEvent.ntext(address()); }
        /** @return the null-terminated string pointed to by the {@code text} field. */
        @NativeType("char const *")
        public @Nullable String textString() { return SDL_TextInputEvent.ntextString(address()); }

        /** Sets the specified value to the {@code type} field. */
        public SDL_TextInputEvent.Buffer type(@NativeType("SDL_EventType") int value) { SDL_TextInputEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code reserved} field. */
        public SDL_TextInputEvent.Buffer reserved(@NativeType("Uint32") int value) { SDL_TextInputEvent.nreserved(address(), value); return this; }
        /** Sets the specified value to the {@code timestamp} field. */
        public SDL_TextInputEvent.Buffer timestamp(@NativeType("Uint64") long value) { SDL_TextInputEvent.ntimestamp(address(), value); return this; }
        /** Sets the specified value to the {@code windowID} field. */
        public SDL_TextInputEvent.Buffer windowID(@NativeType("SDL_WindowID") int value) { SDL_TextInputEvent.nwindowID(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code text} field. */
        public SDL_TextInputEvent.Buffer text(@Nullable @NativeType("char const *") ByteBuffer value) { SDL_TextInputEvent.ntext(address(), value); return this; }

    }

}