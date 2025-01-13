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
 * struct SDL_PenButtonEvent {
 *     SDL_EventType type;
 *     Uint32 reserved;
 *     Uint64 timestamp;
 *     SDL_WindowID windowID;
 *     SDL_PenID which;
 *     SDL_PenInputFlags pen_state;
 *     float x;
 *     float y;
 *     Uint8 button;
 *     bool down;
 * }}</pre>
 */
public class SDL_PenButtonEvent extends Struct<SDL_PenButtonEvent> implements NativeResource {

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
        BUTTON,
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
        BUTTON = layout.offsetof(8);
        DOWN = layout.offsetof(9);
    }

    protected SDL_PenButtonEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_PenButtonEvent create(long address, @Nullable ByteBuffer container) {
        return new SDL_PenButtonEvent(address, container);
    }

    /**
     * Creates a {@code SDL_PenButtonEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_PenButtonEvent(ByteBuffer container) {
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
    /** @return the value of the {@code button} field. */
    @NativeType("Uint8")
    public byte button() { return nbutton(address()); }
    /** @return the value of the {@code down} field. */
    @NativeType("bool")
    public boolean down() { return ndown(address()); }

    /** Sets the specified value to the {@code type} field. */
    public SDL_PenButtonEvent type(@NativeType("SDL_EventType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code reserved} field. */
    public SDL_PenButtonEvent reserved(@NativeType("Uint32") int value) { nreserved(address(), value); return this; }
    /** Sets the specified value to the {@code timestamp} field. */
    public SDL_PenButtonEvent timestamp(@NativeType("Uint64") long value) { ntimestamp(address(), value); return this; }
    /** Sets the specified value to the {@code windowID} field. */
    public SDL_PenButtonEvent windowID(@NativeType("SDL_WindowID") int value) { nwindowID(address(), value); return this; }
    /** Sets the specified value to the {@code which} field. */
    public SDL_PenButtonEvent which(@NativeType("SDL_PenID") int value) { nwhich(address(), value); return this; }
    /** Sets the specified value to the {@code pen_state} field. */
    public SDL_PenButtonEvent pen_state(@NativeType("SDL_PenInputFlags") int value) { npen_state(address(), value); return this; }
    /** Sets the specified value to the {@code x} field. */
    public SDL_PenButtonEvent x(float value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public SDL_PenButtonEvent y(float value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@code button} field. */
    public SDL_PenButtonEvent button(@NativeType("Uint8") byte value) { nbutton(address(), value); return this; }
    /** Sets the specified value to the {@code down} field. */
    public SDL_PenButtonEvent down(@NativeType("bool") boolean value) { ndown(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_PenButtonEvent set(
        int type,
        int reserved,
        long timestamp,
        int windowID,
        int which,
        int pen_state,
        float x,
        float y,
        byte button,
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
        button(button);
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
    public SDL_PenButtonEvent set(SDL_PenButtonEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_PenButtonEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_PenButtonEvent malloc() {
        return new SDL_PenButtonEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_PenButtonEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_PenButtonEvent calloc() {
        return new SDL_PenButtonEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_PenButtonEvent} instance allocated with {@link BufferUtils}. */
    public static SDL_PenButtonEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_PenButtonEvent(memAddress(container), container);
    }

    /** Returns a new {@code SDL_PenButtonEvent} instance for the specified memory address. */
    public static SDL_PenButtonEvent create(long address) {
        return new SDL_PenButtonEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_PenButtonEvent createSafe(long address) {
        return address == NULL ? null : new SDL_PenButtonEvent(address, null);
    }

    /**
     * Returns a new {@link SDL_PenButtonEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_PenButtonEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_PenButtonEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_PenButtonEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_PenButtonEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_PenButtonEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_PenButtonEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_PenButtonEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_PenButtonEvent.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_PenButtonEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_PenButtonEvent malloc(MemoryStack stack) {
        return new SDL_PenButtonEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_PenButtonEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_PenButtonEvent calloc(MemoryStack stack) {
        return new SDL_PenButtonEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_PenButtonEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_PenButtonEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_PenButtonEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_PenButtonEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + SDL_PenButtonEvent.TYPE); }
    /** Unsafe version of {@link #reserved}. */
    public static int nreserved(long struct) { return memGetInt(struct + SDL_PenButtonEvent.RESERVED); }
    /** Unsafe version of {@link #timestamp}. */
    public static long ntimestamp(long struct) { return memGetLong(struct + SDL_PenButtonEvent.TIMESTAMP); }
    /** Unsafe version of {@link #windowID}. */
    public static int nwindowID(long struct) { return memGetInt(struct + SDL_PenButtonEvent.WINDOWID); }
    /** Unsafe version of {@link #which}. */
    public static int nwhich(long struct) { return memGetInt(struct + SDL_PenButtonEvent.WHICH); }
    /** Unsafe version of {@link #pen_state}. */
    public static int npen_state(long struct) { return memGetInt(struct + SDL_PenButtonEvent.PEN_STATE); }
    /** Unsafe version of {@link #x}. */
    public static float nx(long struct) { return memGetFloat(struct + SDL_PenButtonEvent.X); }
    /** Unsafe version of {@link #y}. */
    public static float ny(long struct) { return memGetFloat(struct + SDL_PenButtonEvent.Y); }
    /** Unsafe version of {@link #button}. */
    public static byte nbutton(long struct) { return memGetByte(struct + SDL_PenButtonEvent.BUTTON); }
    /** Unsafe version of {@link #down}. */
    public static boolean ndown(long struct) { return memGetByte(struct + SDL_PenButtonEvent.DOWN) != 0; }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + SDL_PenButtonEvent.TYPE, value); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static void nreserved(long struct, int value) { memPutInt(struct + SDL_PenButtonEvent.RESERVED, value); }
    /** Unsafe version of {@link #timestamp(long) timestamp}. */
    public static void ntimestamp(long struct, long value) { memPutLong(struct + SDL_PenButtonEvent.TIMESTAMP, value); }
    /** Unsafe version of {@link #windowID(int) windowID}. */
    public static void nwindowID(long struct, int value) { memPutInt(struct + SDL_PenButtonEvent.WINDOWID, value); }
    /** Unsafe version of {@link #which(int) which}. */
    public static void nwhich(long struct, int value) { memPutInt(struct + SDL_PenButtonEvent.WHICH, value); }
    /** Unsafe version of {@link #pen_state(int) pen_state}. */
    public static void npen_state(long struct, int value) { memPutInt(struct + SDL_PenButtonEvent.PEN_STATE, value); }
    /** Unsafe version of {@link #x(float) x}. */
    public static void nx(long struct, float value) { memPutFloat(struct + SDL_PenButtonEvent.X, value); }
    /** Unsafe version of {@link #y(float) y}. */
    public static void ny(long struct, float value) { memPutFloat(struct + SDL_PenButtonEvent.Y, value); }
    /** Unsafe version of {@link #button(byte) button}. */
    public static void nbutton(long struct, byte value) { memPutByte(struct + SDL_PenButtonEvent.BUTTON, value); }
    /** Unsafe version of {@link #down(boolean) down}. */
    public static void ndown(long struct, boolean value) { memPutByte(struct + SDL_PenButtonEvent.DOWN, value ? (byte)1 : (byte)0); }

    // -----------------------------------

    /** An array of {@link SDL_PenButtonEvent} structs. */
    public static class Buffer extends StructBuffer<SDL_PenButtonEvent, Buffer> implements NativeResource {

        private static final SDL_PenButtonEvent ELEMENT_FACTORY = SDL_PenButtonEvent.create(-1L);

        /**
         * Creates a new {@code SDL_PenButtonEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_PenButtonEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_PenButtonEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("SDL_EventType")
        public int type() { return SDL_PenButtonEvent.ntype(address()); }
        /** @return the value of the {@code reserved} field. */
        @NativeType("Uint32")
        public int reserved() { return SDL_PenButtonEvent.nreserved(address()); }
        /** @return the value of the {@code timestamp} field. */
        @NativeType("Uint64")
        public long timestamp() { return SDL_PenButtonEvent.ntimestamp(address()); }
        /** @return the value of the {@code windowID} field. */
        @NativeType("SDL_WindowID")
        public int windowID() { return SDL_PenButtonEvent.nwindowID(address()); }
        /** @return the value of the {@code which} field. */
        @NativeType("SDL_PenID")
        public int which() { return SDL_PenButtonEvent.nwhich(address()); }
        /** @return the value of the {@code pen_state} field. */
        @NativeType("SDL_PenInputFlags")
        public int pen_state() { return SDL_PenButtonEvent.npen_state(address()); }
        /** @return the value of the {@code x} field. */
        public float x() { return SDL_PenButtonEvent.nx(address()); }
        /** @return the value of the {@code y} field. */
        public float y() { return SDL_PenButtonEvent.ny(address()); }
        /** @return the value of the {@code button} field. */
        @NativeType("Uint8")
        public byte button() { return SDL_PenButtonEvent.nbutton(address()); }
        /** @return the value of the {@code down} field. */
        @NativeType("bool")
        public boolean down() { return SDL_PenButtonEvent.ndown(address()); }

        /** Sets the specified value to the {@code type} field. */
        public SDL_PenButtonEvent.Buffer type(@NativeType("SDL_EventType") int value) { SDL_PenButtonEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code reserved} field. */
        public SDL_PenButtonEvent.Buffer reserved(@NativeType("Uint32") int value) { SDL_PenButtonEvent.nreserved(address(), value); return this; }
        /** Sets the specified value to the {@code timestamp} field. */
        public SDL_PenButtonEvent.Buffer timestamp(@NativeType("Uint64") long value) { SDL_PenButtonEvent.ntimestamp(address(), value); return this; }
        /** Sets the specified value to the {@code windowID} field. */
        public SDL_PenButtonEvent.Buffer windowID(@NativeType("SDL_WindowID") int value) { SDL_PenButtonEvent.nwindowID(address(), value); return this; }
        /** Sets the specified value to the {@code which} field. */
        public SDL_PenButtonEvent.Buffer which(@NativeType("SDL_PenID") int value) { SDL_PenButtonEvent.nwhich(address(), value); return this; }
        /** Sets the specified value to the {@code pen_state} field. */
        public SDL_PenButtonEvent.Buffer pen_state(@NativeType("SDL_PenInputFlags") int value) { SDL_PenButtonEvent.npen_state(address(), value); return this; }
        /** Sets the specified value to the {@code x} field. */
        public SDL_PenButtonEvent.Buffer x(float value) { SDL_PenButtonEvent.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public SDL_PenButtonEvent.Buffer y(float value) { SDL_PenButtonEvent.ny(address(), value); return this; }
        /** Sets the specified value to the {@code button} field. */
        public SDL_PenButtonEvent.Buffer button(@NativeType("Uint8") byte value) { SDL_PenButtonEvent.nbutton(address(), value); return this; }
        /** Sets the specified value to the {@code down} field. */
        public SDL_PenButtonEvent.Buffer down(@NativeType("bool") boolean value) { SDL_PenButtonEvent.ndown(address(), value); return this; }

    }

}