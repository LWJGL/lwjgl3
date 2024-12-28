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
 * struct SDL_DropEvent {
 *     SDL_EventType type;
 *     Uint32 reserved;
 *     Uint64 timestamp;
 *     SDL_WindowID windowID;
 *     float x;
 *     float y;
 *     char const * source;
 *     char const * data;
 * }}</pre>
 */
public class SDL_DropEvent extends Struct<SDL_DropEvent> implements NativeResource {

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
        X,
        Y,
        SOURCE,
        DATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        RESERVED = layout.offsetof(1);
        TIMESTAMP = layout.offsetof(2);
        WINDOWID = layout.offsetof(3);
        X = layout.offsetof(4);
        Y = layout.offsetof(5);
        SOURCE = layout.offsetof(6);
        DATA = layout.offsetof(7);
    }

    protected SDL_DropEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_DropEvent create(long address, @Nullable ByteBuffer container) {
        return new SDL_DropEvent(address, container);
    }

    /**
     * Creates a {@code SDL_DropEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_DropEvent(ByteBuffer container) {
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
    /** @return the value of the {@code x} field. */
    public float x() { return nx(address()); }
    /** @return the value of the {@code y} field. */
    public float y() { return ny(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code source} field. */
    @NativeType("char const *")
    public @Nullable ByteBuffer source() { return nsource(address()); }
    /** @return the null-terminated string pointed to by the {@code source} field. */
    @NativeType("char const *")
    public @Nullable String sourceString() { return nsourceString(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code data} field. */
    @NativeType("char const *")
    public @Nullable ByteBuffer data() { return ndata(address()); }
    /** @return the null-terminated string pointed to by the {@code data} field. */
    @NativeType("char const *")
    public @Nullable String dataString() { return ndataString(address()); }

    /** Sets the specified value to the {@code type} field. */
    public SDL_DropEvent type(@NativeType("SDL_EventType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code reserved} field. */
    public SDL_DropEvent reserved(@NativeType("Uint32") int value) { nreserved(address(), value); return this; }
    /** Sets the specified value to the {@code timestamp} field. */
    public SDL_DropEvent timestamp(@NativeType("Uint64") long value) { ntimestamp(address(), value); return this; }
    /** Sets the specified value to the {@code windowID} field. */
    public SDL_DropEvent windowID(@NativeType("SDL_WindowID") int value) { nwindowID(address(), value); return this; }
    /** Sets the specified value to the {@code x} field. */
    public SDL_DropEvent x(float value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public SDL_DropEvent y(float value) { ny(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code source} field. */
    public SDL_DropEvent source(@Nullable @NativeType("char const *") ByteBuffer value) { nsource(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code data} field. */
    public SDL_DropEvent data(@Nullable @NativeType("char const *") ByteBuffer value) { ndata(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_DropEvent set(
        int type,
        int reserved,
        long timestamp,
        int windowID,
        float x,
        float y,
        @Nullable ByteBuffer source,
        @Nullable ByteBuffer data
    ) {
        type(type);
        reserved(reserved);
        timestamp(timestamp);
        windowID(windowID);
        x(x);
        y(y);
        source(source);
        data(data);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_DropEvent set(SDL_DropEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_DropEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_DropEvent malloc() {
        return new SDL_DropEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_DropEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_DropEvent calloc() {
        return new SDL_DropEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_DropEvent} instance allocated with {@link BufferUtils}. */
    public static SDL_DropEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_DropEvent(memAddress(container), container);
    }

    /** Returns a new {@code SDL_DropEvent} instance for the specified memory address. */
    public static SDL_DropEvent create(long address) {
        return new SDL_DropEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_DropEvent createSafe(long address) {
        return address == NULL ? null : new SDL_DropEvent(address, null);
    }

    /**
     * Returns a new {@link SDL_DropEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_DropEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_DropEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_DropEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_DropEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_DropEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_DropEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_DropEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_DropEvent.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_DropEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_DropEvent malloc(MemoryStack stack) {
        return new SDL_DropEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_DropEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_DropEvent calloc(MemoryStack stack) {
        return new SDL_DropEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_DropEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_DropEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_DropEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_DropEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + SDL_DropEvent.TYPE); }
    /** Unsafe version of {@link #reserved}. */
    public static int nreserved(long struct) { return memGetInt(struct + SDL_DropEvent.RESERVED); }
    /** Unsafe version of {@link #timestamp}. */
    public static long ntimestamp(long struct) { return memGetLong(struct + SDL_DropEvent.TIMESTAMP); }
    /** Unsafe version of {@link #windowID}. */
    public static int nwindowID(long struct) { return memGetInt(struct + SDL_DropEvent.WINDOWID); }
    /** Unsafe version of {@link #x}. */
    public static float nx(long struct) { return memGetFloat(struct + SDL_DropEvent.X); }
    /** Unsafe version of {@link #y}. */
    public static float ny(long struct) { return memGetFloat(struct + SDL_DropEvent.Y); }
    /** Unsafe version of {@link #source}. */
    public static @Nullable ByteBuffer nsource(long struct) { return memByteBufferNT1Safe(memGetAddress(struct + SDL_DropEvent.SOURCE)); }
    /** Unsafe version of {@link #sourceString}. */
    public static @Nullable String nsourceString(long struct) { return memUTF8Safe(memGetAddress(struct + SDL_DropEvent.SOURCE)); }
    /** Unsafe version of {@link #data}. */
    public static @Nullable ByteBuffer ndata(long struct) { return memByteBufferNT1Safe(memGetAddress(struct + SDL_DropEvent.DATA)); }
    /** Unsafe version of {@link #dataString}. */
    public static @Nullable String ndataString(long struct) { return memUTF8Safe(memGetAddress(struct + SDL_DropEvent.DATA)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + SDL_DropEvent.TYPE, value); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static void nreserved(long struct, int value) { memPutInt(struct + SDL_DropEvent.RESERVED, value); }
    /** Unsafe version of {@link #timestamp(long) timestamp}. */
    public static void ntimestamp(long struct, long value) { memPutLong(struct + SDL_DropEvent.TIMESTAMP, value); }
    /** Unsafe version of {@link #windowID(int) windowID}. */
    public static void nwindowID(long struct, int value) { memPutInt(struct + SDL_DropEvent.WINDOWID, value); }
    /** Unsafe version of {@link #x(float) x}. */
    public static void nx(long struct, float value) { memPutFloat(struct + SDL_DropEvent.X, value); }
    /** Unsafe version of {@link #y(float) y}. */
    public static void ny(long struct, float value) { memPutFloat(struct + SDL_DropEvent.Y, value); }
    /** Unsafe version of {@link #source(ByteBuffer) source}. */
    public static void nsource(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + SDL_DropEvent.SOURCE, memAddressSafe(value));
    }
    /** Unsafe version of {@link #data(ByteBuffer) data}. */
    public static void ndata(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + SDL_DropEvent.DATA, memAddressSafe(value));
    }

    // -----------------------------------

    /** An array of {@link SDL_DropEvent} structs. */
    public static class Buffer extends StructBuffer<SDL_DropEvent, Buffer> implements NativeResource {

        private static final SDL_DropEvent ELEMENT_FACTORY = SDL_DropEvent.create(-1L);

        /**
         * Creates a new {@code SDL_DropEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_DropEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_DropEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("SDL_EventType")
        public int type() { return SDL_DropEvent.ntype(address()); }
        /** @return the value of the {@code reserved} field. */
        @NativeType("Uint32")
        public int reserved() { return SDL_DropEvent.nreserved(address()); }
        /** @return the value of the {@code timestamp} field. */
        @NativeType("Uint64")
        public long timestamp() { return SDL_DropEvent.ntimestamp(address()); }
        /** @return the value of the {@code windowID} field. */
        @NativeType("SDL_WindowID")
        public int windowID() { return SDL_DropEvent.nwindowID(address()); }
        /** @return the value of the {@code x} field. */
        public float x() { return SDL_DropEvent.nx(address()); }
        /** @return the value of the {@code y} field. */
        public float y() { return SDL_DropEvent.ny(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code source} field. */
        @NativeType("char const *")
        public @Nullable ByteBuffer source() { return SDL_DropEvent.nsource(address()); }
        /** @return the null-terminated string pointed to by the {@code source} field. */
        @NativeType("char const *")
        public @Nullable String sourceString() { return SDL_DropEvent.nsourceString(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code data} field. */
        @NativeType("char const *")
        public @Nullable ByteBuffer data() { return SDL_DropEvent.ndata(address()); }
        /** @return the null-terminated string pointed to by the {@code data} field. */
        @NativeType("char const *")
        public @Nullable String dataString() { return SDL_DropEvent.ndataString(address()); }

        /** Sets the specified value to the {@code type} field. */
        public SDL_DropEvent.Buffer type(@NativeType("SDL_EventType") int value) { SDL_DropEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code reserved} field. */
        public SDL_DropEvent.Buffer reserved(@NativeType("Uint32") int value) { SDL_DropEvent.nreserved(address(), value); return this; }
        /** Sets the specified value to the {@code timestamp} field. */
        public SDL_DropEvent.Buffer timestamp(@NativeType("Uint64") long value) { SDL_DropEvent.ntimestamp(address(), value); return this; }
        /** Sets the specified value to the {@code windowID} field. */
        public SDL_DropEvent.Buffer windowID(@NativeType("SDL_WindowID") int value) { SDL_DropEvent.nwindowID(address(), value); return this; }
        /** Sets the specified value to the {@code x} field. */
        public SDL_DropEvent.Buffer x(float value) { SDL_DropEvent.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public SDL_DropEvent.Buffer y(float value) { SDL_DropEvent.ny(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code source} field. */
        public SDL_DropEvent.Buffer source(@Nullable @NativeType("char const *") ByteBuffer value) { SDL_DropEvent.nsource(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code data} field. */
        public SDL_DropEvent.Buffer data(@Nullable @NativeType("char const *") ByteBuffer value) { SDL_DropEvent.ndata(address(), value); return this; }

    }

}