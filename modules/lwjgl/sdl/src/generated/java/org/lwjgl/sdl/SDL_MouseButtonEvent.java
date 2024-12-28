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
 * struct SDL_MouseButtonEvent {
 *     SDL_EventType type;
 *     Uint32 reserved;
 *     Uint64 timestamp;
 *     SDL_WindowID windowID;
 *     SDL_MouseID which;
 *     Uint8 button;
 *     bool down;
 *     Uint8 clicks;
 *     Uint8 padding;
 *     float x;
 *     float y;
 * }}</pre>
 */
public class SDL_MouseButtonEvent extends Struct<SDL_MouseButtonEvent> implements NativeResource {

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
        BUTTON,
        DOWN,
        CLICKS,
        PADDING,
        X,
        Y;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        RESERVED = layout.offsetof(1);
        TIMESTAMP = layout.offsetof(2);
        WINDOWID = layout.offsetof(3);
        WHICH = layout.offsetof(4);
        BUTTON = layout.offsetof(5);
        DOWN = layout.offsetof(6);
        CLICKS = layout.offsetof(7);
        PADDING = layout.offsetof(8);
        X = layout.offsetof(9);
        Y = layout.offsetof(10);
    }

    protected SDL_MouseButtonEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_MouseButtonEvent create(long address, @Nullable ByteBuffer container) {
        return new SDL_MouseButtonEvent(address, container);
    }

    /**
     * Creates a {@code SDL_MouseButtonEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_MouseButtonEvent(ByteBuffer container) {
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
    @NativeType("SDL_MouseID")
    public int which() { return nwhich(address()); }
    /** @return the value of the {@code button} field. */
    @NativeType("Uint8")
    public byte button() { return nbutton(address()); }
    /** @return the value of the {@code down} field. */
    @NativeType("bool")
    public boolean down() { return ndown(address()); }
    /** @return the value of the {@code clicks} field. */
    @NativeType("Uint8")
    public byte clicks() { return nclicks(address()); }
    /** @return the value of the {@code x} field. */
    public float x() { return nx(address()); }
    /** @return the value of the {@code y} field. */
    public float y() { return ny(address()); }

    /** Sets the specified value to the {@code type} field. */
    public SDL_MouseButtonEvent type(@NativeType("SDL_EventType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code reserved} field. */
    public SDL_MouseButtonEvent reserved(@NativeType("Uint32") int value) { nreserved(address(), value); return this; }
    /** Sets the specified value to the {@code timestamp} field. */
    public SDL_MouseButtonEvent timestamp(@NativeType("Uint64") long value) { ntimestamp(address(), value); return this; }
    /** Sets the specified value to the {@code windowID} field. */
    public SDL_MouseButtonEvent windowID(@NativeType("SDL_WindowID") int value) { nwindowID(address(), value); return this; }
    /** Sets the specified value to the {@code which} field. */
    public SDL_MouseButtonEvent which(@NativeType("SDL_MouseID") int value) { nwhich(address(), value); return this; }
    /** Sets the specified value to the {@code button} field. */
    public SDL_MouseButtonEvent button(@NativeType("Uint8") byte value) { nbutton(address(), value); return this; }
    /** Sets the specified value to the {@code down} field. */
    public SDL_MouseButtonEvent down(@NativeType("bool") boolean value) { ndown(address(), value); return this; }
    /** Sets the specified value to the {@code clicks} field. */
    public SDL_MouseButtonEvent clicks(@NativeType("Uint8") byte value) { nclicks(address(), value); return this; }
    /** Sets the specified value to the {@code x} field. */
    public SDL_MouseButtonEvent x(float value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public SDL_MouseButtonEvent y(float value) { ny(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_MouseButtonEvent set(
        int type,
        int reserved,
        long timestamp,
        int windowID,
        int which,
        byte button,
        boolean down,
        byte clicks,
        float x,
        float y
    ) {
        type(type);
        reserved(reserved);
        timestamp(timestamp);
        windowID(windowID);
        which(which);
        button(button);
        down(down);
        clicks(clicks);
        x(x);
        y(y);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_MouseButtonEvent set(SDL_MouseButtonEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_MouseButtonEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_MouseButtonEvent malloc() {
        return new SDL_MouseButtonEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_MouseButtonEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_MouseButtonEvent calloc() {
        return new SDL_MouseButtonEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_MouseButtonEvent} instance allocated with {@link BufferUtils}. */
    public static SDL_MouseButtonEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_MouseButtonEvent(memAddress(container), container);
    }

    /** Returns a new {@code SDL_MouseButtonEvent} instance for the specified memory address. */
    public static SDL_MouseButtonEvent create(long address) {
        return new SDL_MouseButtonEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_MouseButtonEvent createSafe(long address) {
        return address == NULL ? null : new SDL_MouseButtonEvent(address, null);
    }

    /**
     * Returns a new {@link SDL_MouseButtonEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_MouseButtonEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_MouseButtonEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_MouseButtonEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_MouseButtonEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_MouseButtonEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_MouseButtonEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_MouseButtonEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_MouseButtonEvent.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_MouseButtonEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_MouseButtonEvent malloc(MemoryStack stack) {
        return new SDL_MouseButtonEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_MouseButtonEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_MouseButtonEvent calloc(MemoryStack stack) {
        return new SDL_MouseButtonEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_MouseButtonEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_MouseButtonEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_MouseButtonEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_MouseButtonEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + SDL_MouseButtonEvent.TYPE); }
    /** Unsafe version of {@link #reserved}. */
    public static int nreserved(long struct) { return memGetInt(struct + SDL_MouseButtonEvent.RESERVED); }
    /** Unsafe version of {@link #timestamp}. */
    public static long ntimestamp(long struct) { return memGetLong(struct + SDL_MouseButtonEvent.TIMESTAMP); }
    /** Unsafe version of {@link #windowID}. */
    public static int nwindowID(long struct) { return memGetInt(struct + SDL_MouseButtonEvent.WINDOWID); }
    /** Unsafe version of {@link #which}. */
    public static int nwhich(long struct) { return memGetInt(struct + SDL_MouseButtonEvent.WHICH); }
    /** Unsafe version of {@link #button}. */
    public static byte nbutton(long struct) { return memGetByte(struct + SDL_MouseButtonEvent.BUTTON); }
    /** Unsafe version of {@link #down}. */
    public static boolean ndown(long struct) { return memGetByte(struct + SDL_MouseButtonEvent.DOWN) != 0; }
    /** Unsafe version of {@link #clicks}. */
    public static byte nclicks(long struct) { return memGetByte(struct + SDL_MouseButtonEvent.CLICKS); }
    public static byte npadding(long struct) { return memGetByte(struct + SDL_MouseButtonEvent.PADDING); }
    /** Unsafe version of {@link #x}. */
    public static float nx(long struct) { return memGetFloat(struct + SDL_MouseButtonEvent.X); }
    /** Unsafe version of {@link #y}. */
    public static float ny(long struct) { return memGetFloat(struct + SDL_MouseButtonEvent.Y); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + SDL_MouseButtonEvent.TYPE, value); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static void nreserved(long struct, int value) { memPutInt(struct + SDL_MouseButtonEvent.RESERVED, value); }
    /** Unsafe version of {@link #timestamp(long) timestamp}. */
    public static void ntimestamp(long struct, long value) { memPutLong(struct + SDL_MouseButtonEvent.TIMESTAMP, value); }
    /** Unsafe version of {@link #windowID(int) windowID}. */
    public static void nwindowID(long struct, int value) { memPutInt(struct + SDL_MouseButtonEvent.WINDOWID, value); }
    /** Unsafe version of {@link #which(int) which}. */
    public static void nwhich(long struct, int value) { memPutInt(struct + SDL_MouseButtonEvent.WHICH, value); }
    /** Unsafe version of {@link #button(byte) button}. */
    public static void nbutton(long struct, byte value) { memPutByte(struct + SDL_MouseButtonEvent.BUTTON, value); }
    /** Unsafe version of {@link #down(boolean) down}. */
    public static void ndown(long struct, boolean value) { memPutByte(struct + SDL_MouseButtonEvent.DOWN, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #clicks(byte) clicks}. */
    public static void nclicks(long struct, byte value) { memPutByte(struct + SDL_MouseButtonEvent.CLICKS, value); }
    public static void npadding(long struct, byte value) { memPutByte(struct + SDL_MouseButtonEvent.PADDING, value); }
    /** Unsafe version of {@link #x(float) x}. */
    public static void nx(long struct, float value) { memPutFloat(struct + SDL_MouseButtonEvent.X, value); }
    /** Unsafe version of {@link #y(float) y}. */
    public static void ny(long struct, float value) { memPutFloat(struct + SDL_MouseButtonEvent.Y, value); }

    // -----------------------------------

    /** An array of {@link SDL_MouseButtonEvent} structs. */
    public static class Buffer extends StructBuffer<SDL_MouseButtonEvent, Buffer> implements NativeResource {

        private static final SDL_MouseButtonEvent ELEMENT_FACTORY = SDL_MouseButtonEvent.create(-1L);

        /**
         * Creates a new {@code SDL_MouseButtonEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_MouseButtonEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_MouseButtonEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("SDL_EventType")
        public int type() { return SDL_MouseButtonEvent.ntype(address()); }
        /** @return the value of the {@code reserved} field. */
        @NativeType("Uint32")
        public int reserved() { return SDL_MouseButtonEvent.nreserved(address()); }
        /** @return the value of the {@code timestamp} field. */
        @NativeType("Uint64")
        public long timestamp() { return SDL_MouseButtonEvent.ntimestamp(address()); }
        /** @return the value of the {@code windowID} field. */
        @NativeType("SDL_WindowID")
        public int windowID() { return SDL_MouseButtonEvent.nwindowID(address()); }
        /** @return the value of the {@code which} field. */
        @NativeType("SDL_MouseID")
        public int which() { return SDL_MouseButtonEvent.nwhich(address()); }
        /** @return the value of the {@code button} field. */
        @NativeType("Uint8")
        public byte button() { return SDL_MouseButtonEvent.nbutton(address()); }
        /** @return the value of the {@code down} field. */
        @NativeType("bool")
        public boolean down() { return SDL_MouseButtonEvent.ndown(address()); }
        /** @return the value of the {@code clicks} field. */
        @NativeType("Uint8")
        public byte clicks() { return SDL_MouseButtonEvent.nclicks(address()); }
        /** @return the value of the {@code x} field. */
        public float x() { return SDL_MouseButtonEvent.nx(address()); }
        /** @return the value of the {@code y} field. */
        public float y() { return SDL_MouseButtonEvent.ny(address()); }

        /** Sets the specified value to the {@code type} field. */
        public SDL_MouseButtonEvent.Buffer type(@NativeType("SDL_EventType") int value) { SDL_MouseButtonEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code reserved} field. */
        public SDL_MouseButtonEvent.Buffer reserved(@NativeType("Uint32") int value) { SDL_MouseButtonEvent.nreserved(address(), value); return this; }
        /** Sets the specified value to the {@code timestamp} field. */
        public SDL_MouseButtonEvent.Buffer timestamp(@NativeType("Uint64") long value) { SDL_MouseButtonEvent.ntimestamp(address(), value); return this; }
        /** Sets the specified value to the {@code windowID} field. */
        public SDL_MouseButtonEvent.Buffer windowID(@NativeType("SDL_WindowID") int value) { SDL_MouseButtonEvent.nwindowID(address(), value); return this; }
        /** Sets the specified value to the {@code which} field. */
        public SDL_MouseButtonEvent.Buffer which(@NativeType("SDL_MouseID") int value) { SDL_MouseButtonEvent.nwhich(address(), value); return this; }
        /** Sets the specified value to the {@code button} field. */
        public SDL_MouseButtonEvent.Buffer button(@NativeType("Uint8") byte value) { SDL_MouseButtonEvent.nbutton(address(), value); return this; }
        /** Sets the specified value to the {@code down} field. */
        public SDL_MouseButtonEvent.Buffer down(@NativeType("bool") boolean value) { SDL_MouseButtonEvent.ndown(address(), value); return this; }
        /** Sets the specified value to the {@code clicks} field. */
        public SDL_MouseButtonEvent.Buffer clicks(@NativeType("Uint8") byte value) { SDL_MouseButtonEvent.nclicks(address(), value); return this; }
        /** Sets the specified value to the {@code x} field. */
        public SDL_MouseButtonEvent.Buffer x(float value) { SDL_MouseButtonEvent.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public SDL_MouseButtonEvent.Buffer y(float value) { SDL_MouseButtonEvent.ny(address(), value); return this; }

    }

}