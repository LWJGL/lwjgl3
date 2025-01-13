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
 * struct SDL_PenTouchEvent {
 *     SDL_EventType type;
 *     Uint32 reserved;
 *     Uint64 timestamp;
 *     SDL_WindowID windowID;
 *     SDL_PenID which;
 *     SDL_PenInputFlags pen_state;
 *     float x;
 *     float y;
 *     bool eraser;
 *     bool down;
 * }}</pre>
 */
public class SDL_PenTouchEvent extends Struct<SDL_PenTouchEvent> implements NativeResource {

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
        WHICH,
        PEN_STATE,
        X,
        Y,
        ERASER,
        DOWN;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        RESERVED = layout.offsetof(1);
        TIMESTAMP = layout.offsetof(2);
        WINDOWID = layout.offsetof(3);
        WHICH = layout.offsetof(4);
        PEN_STATE = layout.offsetof(5);
        X = layout.offsetof(6);
        Y = layout.offsetof(7);
        ERASER = layout.offsetof(8);
        DOWN = layout.offsetof(9);
    }

    protected SDL_PenTouchEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_PenTouchEvent create(long address, @Nullable ByteBuffer container) {
        return new SDL_PenTouchEvent(address, container);
    }

    /**
     * Creates a {@code SDL_PenTouchEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_PenTouchEvent(ByteBuffer container) {
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
    /** @return the value of the {@code which} field. */
    @NativeType("SDL_PenID")
    public int which() { return nwhich(address()); }
    /** @return the value of the {@code pen_state} field. */
    @NativeType("SDL_PenInputFlags")
    public int pen_state() { return npen_state(address()); }
    /** @return the value of the {@code x} field. */
    public float x() { return nx(address()); }
    /** @return the value of the {@code y} field. */
    public float y() { return ny(address()); }
    /** @return the value of the {@code eraser} field. */
    @NativeType("bool")
    public boolean eraser() { return neraser(address()); }
    /** @return the value of the {@code down} field. */
    @NativeType("bool")
    public boolean down() { return ndown(address()); }

    /** Sets the specified value to the {@code type} field. */
    public SDL_PenTouchEvent type(@NativeType("SDL_EventType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code reserved} field. */
    public SDL_PenTouchEvent reserved(@NativeType("Uint32") int value) { nreserved(address(), value); return this; }
    /** Sets the specified value to the {@code timestamp} field. */
    public SDL_PenTouchEvent timestamp(@NativeType("Uint64") long value) { ntimestamp(address(), value); return this; }
    /** Sets the specified value to the {@code windowID} field. */
    public SDL_PenTouchEvent windowID(@NativeType("SDL_WindowID") int value) { nwindowID(address(), value); return this; }
    /** Sets the specified value to the {@code which} field. */
    public SDL_PenTouchEvent which(@NativeType("SDL_PenID") int value) { nwhich(address(), value); return this; }
    /** Sets the specified value to the {@code pen_state} field. */
    public SDL_PenTouchEvent pen_state(@NativeType("SDL_PenInputFlags") int value) { npen_state(address(), value); return this; }
    /** Sets the specified value to the {@code x} field. */
    public SDL_PenTouchEvent x(float value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public SDL_PenTouchEvent y(float value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@code eraser} field. */
    public SDL_PenTouchEvent eraser(@NativeType("bool") boolean value) { neraser(address(), value); return this; }
    /** Sets the specified value to the {@code down} field. */
    public SDL_PenTouchEvent down(@NativeType("bool") boolean value) { ndown(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_PenTouchEvent set(
        int type,
        int reserved,
        long timestamp,
        int windowID,
        int which,
        int pen_state,
        float x,
        float y,
        boolean eraser,
        boolean down
    ) {
        type(type);
        reserved(reserved);
        timestamp(timestamp);
        windowID(windowID);
        which(which);
        pen_state(pen_state);
        x(x);
        y(y);
        eraser(eraser);
        down(down);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_PenTouchEvent set(SDL_PenTouchEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_PenTouchEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_PenTouchEvent malloc() {
        return new SDL_PenTouchEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_PenTouchEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_PenTouchEvent calloc() {
        return new SDL_PenTouchEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_PenTouchEvent} instance allocated with {@link BufferUtils}. */
    public static SDL_PenTouchEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_PenTouchEvent(memAddress(container), container);
    }

    /** Returns a new {@code SDL_PenTouchEvent} instance for the specified memory address. */
    public static SDL_PenTouchEvent create(long address) {
        return new SDL_PenTouchEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_PenTouchEvent createSafe(long address) {
        return address == NULL ? null : new SDL_PenTouchEvent(address, null);
    }

    /**
     * Returns a new {@link SDL_PenTouchEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_PenTouchEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_PenTouchEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_PenTouchEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_PenTouchEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_PenTouchEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_PenTouchEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_PenTouchEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_PenTouchEvent.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_PenTouchEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_PenTouchEvent malloc(MemoryStack stack) {
        return new SDL_PenTouchEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_PenTouchEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_PenTouchEvent calloc(MemoryStack stack) {
        return new SDL_PenTouchEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_PenTouchEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_PenTouchEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_PenTouchEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_PenTouchEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + SDL_PenTouchEvent.TYPE); }
    /** Unsafe version of {@link #reserved}. */
    public static int nreserved(long struct) { return memGetInt(struct + SDL_PenTouchEvent.RESERVED); }
    /** Unsafe version of {@link #timestamp}. */
    public static long ntimestamp(long struct) { return memGetLong(struct + SDL_PenTouchEvent.TIMESTAMP); }
    /** Unsafe version of {@link #windowID}. */
    public static int nwindowID(long struct) { return memGetInt(struct + SDL_PenTouchEvent.WINDOWID); }
    /** Unsafe version of {@link #which}. */
    public static int nwhich(long struct) { return memGetInt(struct + SDL_PenTouchEvent.WHICH); }
    /** Unsafe version of {@link #pen_state}. */
    public static int npen_state(long struct) { return memGetInt(struct + SDL_PenTouchEvent.PEN_STATE); }
    /** Unsafe version of {@link #x}. */
    public static float nx(long struct) { return memGetFloat(struct + SDL_PenTouchEvent.X); }
    /** Unsafe version of {@link #y}. */
    public static float ny(long struct) { return memGetFloat(struct + SDL_PenTouchEvent.Y); }
    /** Unsafe version of {@link #eraser}. */
    public static boolean neraser(long struct) { return memGetByte(struct + SDL_PenTouchEvent.ERASER) != 0; }
    /** Unsafe version of {@link #down}. */
    public static boolean ndown(long struct) { return memGetByte(struct + SDL_PenTouchEvent.DOWN) != 0; }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + SDL_PenTouchEvent.TYPE, value); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static void nreserved(long struct, int value) { memPutInt(struct + SDL_PenTouchEvent.RESERVED, value); }
    /** Unsafe version of {@link #timestamp(long) timestamp}. */
    public static void ntimestamp(long struct, long value) { memPutLong(struct + SDL_PenTouchEvent.TIMESTAMP, value); }
    /** Unsafe version of {@link #windowID(int) windowID}. */
    public static void nwindowID(long struct, int value) { memPutInt(struct + SDL_PenTouchEvent.WINDOWID, value); }
    /** Unsafe version of {@link #which(int) which}. */
    public static void nwhich(long struct, int value) { memPutInt(struct + SDL_PenTouchEvent.WHICH, value); }
    /** Unsafe version of {@link #pen_state(int) pen_state}. */
    public static void npen_state(long struct, int value) { memPutInt(struct + SDL_PenTouchEvent.PEN_STATE, value); }
    /** Unsafe version of {@link #x(float) x}. */
    public static void nx(long struct, float value) { memPutFloat(struct + SDL_PenTouchEvent.X, value); }
    /** Unsafe version of {@link #y(float) y}. */
    public static void ny(long struct, float value) { memPutFloat(struct + SDL_PenTouchEvent.Y, value); }
    /** Unsafe version of {@link #eraser(boolean) eraser}. */
    public static void neraser(long struct, boolean value) { memPutByte(struct + SDL_PenTouchEvent.ERASER, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #down(boolean) down}. */
    public static void ndown(long struct, boolean value) { memPutByte(struct + SDL_PenTouchEvent.DOWN, value ? (byte)1 : (byte)0); }

    // -----------------------------------

    /** An array of {@link SDL_PenTouchEvent} structs. */
    public static class Buffer extends StructBuffer<SDL_PenTouchEvent, Buffer> implements NativeResource {

        private static final SDL_PenTouchEvent ELEMENT_FACTORY = SDL_PenTouchEvent.create(-1L);

        /**
         * Creates a new {@code SDL_PenTouchEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_PenTouchEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_PenTouchEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("SDL_EventType")
        public int type() { return SDL_PenTouchEvent.ntype(address()); }
        /** @return the value of the {@code reserved} field. */
        @NativeType("Uint32")
        public int reserved() { return SDL_PenTouchEvent.nreserved(address()); }
        /** @return the value of the {@code timestamp} field. */
        @NativeType("Uint64")
        public long timestamp() { return SDL_PenTouchEvent.ntimestamp(address()); }
        /** @return the value of the {@code windowID} field. */
        @NativeType("SDL_WindowID")
        public int windowID() { return SDL_PenTouchEvent.nwindowID(address()); }
        /** @return the value of the {@code which} field. */
        @NativeType("SDL_PenID")
        public int which() { return SDL_PenTouchEvent.nwhich(address()); }
        /** @return the value of the {@code pen_state} field. */
        @NativeType("SDL_PenInputFlags")
        public int pen_state() { return SDL_PenTouchEvent.npen_state(address()); }
        /** @return the value of the {@code x} field. */
        public float x() { return SDL_PenTouchEvent.nx(address()); }
        /** @return the value of the {@code y} field. */
        public float y() { return SDL_PenTouchEvent.ny(address()); }
        /** @return the value of the {@code eraser} field. */
        @NativeType("bool")
        public boolean eraser() { return SDL_PenTouchEvent.neraser(address()); }
        /** @return the value of the {@code down} field. */
        @NativeType("bool")
        public boolean down() { return SDL_PenTouchEvent.ndown(address()); }

        /** Sets the specified value to the {@code type} field. */
        public SDL_PenTouchEvent.Buffer type(@NativeType("SDL_EventType") int value) { SDL_PenTouchEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code reserved} field. */
        public SDL_PenTouchEvent.Buffer reserved(@NativeType("Uint32") int value) { SDL_PenTouchEvent.nreserved(address(), value); return this; }
        /** Sets the specified value to the {@code timestamp} field. */
        public SDL_PenTouchEvent.Buffer timestamp(@NativeType("Uint64") long value) { SDL_PenTouchEvent.ntimestamp(address(), value); return this; }
        /** Sets the specified value to the {@code windowID} field. */
        public SDL_PenTouchEvent.Buffer windowID(@NativeType("SDL_WindowID") int value) { SDL_PenTouchEvent.nwindowID(address(), value); return this; }
        /** Sets the specified value to the {@code which} field. */
        public SDL_PenTouchEvent.Buffer which(@NativeType("SDL_PenID") int value) { SDL_PenTouchEvent.nwhich(address(), value); return this; }
        /** Sets the specified value to the {@code pen_state} field. */
        public SDL_PenTouchEvent.Buffer pen_state(@NativeType("SDL_PenInputFlags") int value) { SDL_PenTouchEvent.npen_state(address(), value); return this; }
        /** Sets the specified value to the {@code x} field. */
        public SDL_PenTouchEvent.Buffer x(float value) { SDL_PenTouchEvent.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public SDL_PenTouchEvent.Buffer y(float value) { SDL_PenTouchEvent.ny(address(), value); return this; }
        /** Sets the specified value to the {@code eraser} field. */
        public SDL_PenTouchEvent.Buffer eraser(@NativeType("bool") boolean value) { SDL_PenTouchEvent.neraser(address(), value); return this; }
        /** Sets the specified value to the {@code down} field. */
        public SDL_PenTouchEvent.Buffer down(@NativeType("bool") boolean value) { SDL_PenTouchEvent.ndown(address(), value); return this; }

    }

}