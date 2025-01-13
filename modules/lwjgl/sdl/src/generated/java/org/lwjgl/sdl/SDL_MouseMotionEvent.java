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
 * struct SDL_MouseMotionEvent {
 *     SDL_EventType type;
 *     Uint32 reserved;
 *     Uint64 timestamp;
 *     SDL_WindowID windowID;
 *     SDL_MouseID which;
 *     SDL_MouseButtonFlags state;
 *     float x;
 *     float y;
 *     float xrel;
 *     float yrel;
 * }}</pre>
 */
public class SDL_MouseMotionEvent extends Struct<SDL_MouseMotionEvent> implements NativeResource {

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
        STATE,
        X,
        Y,
        XREL,
        YREL;

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
        STATE = layout.offsetof(5);
        X = layout.offsetof(6);
        Y = layout.offsetof(7);
        XREL = layout.offsetof(8);
        YREL = layout.offsetof(9);
    }

    protected SDL_MouseMotionEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_MouseMotionEvent create(long address, @Nullable ByteBuffer container) {
        return new SDL_MouseMotionEvent(address, container);
    }

    /**
     * Creates a {@code SDL_MouseMotionEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_MouseMotionEvent(ByteBuffer container) {
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
    /** @return the value of the {@code state} field. */
    @NativeType("SDL_MouseButtonFlags")
    public int state() { return nstate(address()); }
    /** @return the value of the {@code x} field. */
    public float x() { return nx(address()); }
    /** @return the value of the {@code y} field. */
    public float y() { return ny(address()); }
    /** @return the value of the {@code xrel} field. */
    public float xrel() { return nxrel(address()); }
    /** @return the value of the {@code yrel} field. */
    public float yrel() { return nyrel(address()); }

    /** Sets the specified value to the {@code type} field. */
    public SDL_MouseMotionEvent type(@NativeType("SDL_EventType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code reserved} field. */
    public SDL_MouseMotionEvent reserved(@NativeType("Uint32") int value) { nreserved(address(), value); return this; }
    /** Sets the specified value to the {@code timestamp} field. */
    public SDL_MouseMotionEvent timestamp(@NativeType("Uint64") long value) { ntimestamp(address(), value); return this; }
    /** Sets the specified value to the {@code windowID} field. */
    public SDL_MouseMotionEvent windowID(@NativeType("SDL_WindowID") int value) { nwindowID(address(), value); return this; }
    /** Sets the specified value to the {@code which} field. */
    public SDL_MouseMotionEvent which(@NativeType("SDL_MouseID") int value) { nwhich(address(), value); return this; }
    /** Sets the specified value to the {@code state} field. */
    public SDL_MouseMotionEvent state(@NativeType("SDL_MouseButtonFlags") int value) { nstate(address(), value); return this; }
    /** Sets the specified value to the {@code x} field. */
    public SDL_MouseMotionEvent x(float value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public SDL_MouseMotionEvent y(float value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@code xrel} field. */
    public SDL_MouseMotionEvent xrel(float value) { nxrel(address(), value); return this; }
    /** Sets the specified value to the {@code yrel} field. */
    public SDL_MouseMotionEvent yrel(float value) { nyrel(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_MouseMotionEvent set(
        int type,
        int reserved,
        long timestamp,
        int windowID,
        int which,
        int state,
        float x,
        float y,
        float xrel,
        float yrel
    ) {
        type(type);
        reserved(reserved);
        timestamp(timestamp);
        windowID(windowID);
        which(which);
        state(state);
        x(x);
        y(y);
        xrel(xrel);
        yrel(yrel);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_MouseMotionEvent set(SDL_MouseMotionEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_MouseMotionEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_MouseMotionEvent malloc() {
        return new SDL_MouseMotionEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_MouseMotionEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_MouseMotionEvent calloc() {
        return new SDL_MouseMotionEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_MouseMotionEvent} instance allocated with {@link BufferUtils}. */
    public static SDL_MouseMotionEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_MouseMotionEvent(memAddress(container), container);
    }

    /** Returns a new {@code SDL_MouseMotionEvent} instance for the specified memory address. */
    public static SDL_MouseMotionEvent create(long address) {
        return new SDL_MouseMotionEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_MouseMotionEvent createSafe(long address) {
        return address == NULL ? null : new SDL_MouseMotionEvent(address, null);
    }

    /**
     * Returns a new {@link SDL_MouseMotionEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_MouseMotionEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_MouseMotionEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_MouseMotionEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_MouseMotionEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_MouseMotionEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_MouseMotionEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_MouseMotionEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_MouseMotionEvent.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_MouseMotionEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_MouseMotionEvent malloc(MemoryStack stack) {
        return new SDL_MouseMotionEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_MouseMotionEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_MouseMotionEvent calloc(MemoryStack stack) {
        return new SDL_MouseMotionEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_MouseMotionEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_MouseMotionEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_MouseMotionEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_MouseMotionEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + SDL_MouseMotionEvent.TYPE); }
    /** Unsafe version of {@link #reserved}. */
    public static int nreserved(long struct) { return memGetInt(struct + SDL_MouseMotionEvent.RESERVED); }
    /** Unsafe version of {@link #timestamp}. */
    public static long ntimestamp(long struct) { return memGetLong(struct + SDL_MouseMotionEvent.TIMESTAMP); }
    /** Unsafe version of {@link #windowID}. */
    public static int nwindowID(long struct) { return memGetInt(struct + SDL_MouseMotionEvent.WINDOWID); }
    /** Unsafe version of {@link #which}. */
    public static int nwhich(long struct) { return memGetInt(struct + SDL_MouseMotionEvent.WHICH); }
    /** Unsafe version of {@link #state}. */
    public static int nstate(long struct) { return memGetInt(struct + SDL_MouseMotionEvent.STATE); }
    /** Unsafe version of {@link #x}. */
    public static float nx(long struct) { return memGetFloat(struct + SDL_MouseMotionEvent.X); }
    /** Unsafe version of {@link #y}. */
    public static float ny(long struct) { return memGetFloat(struct + SDL_MouseMotionEvent.Y); }
    /** Unsafe version of {@link #xrel}. */
    public static float nxrel(long struct) { return memGetFloat(struct + SDL_MouseMotionEvent.XREL); }
    /** Unsafe version of {@link #yrel}. */
    public static float nyrel(long struct) { return memGetFloat(struct + SDL_MouseMotionEvent.YREL); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + SDL_MouseMotionEvent.TYPE, value); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static void nreserved(long struct, int value) { memPutInt(struct + SDL_MouseMotionEvent.RESERVED, value); }
    /** Unsafe version of {@link #timestamp(long) timestamp}. */
    public static void ntimestamp(long struct, long value) { memPutLong(struct + SDL_MouseMotionEvent.TIMESTAMP, value); }
    /** Unsafe version of {@link #windowID(int) windowID}. */
    public static void nwindowID(long struct, int value) { memPutInt(struct + SDL_MouseMotionEvent.WINDOWID, value); }
    /** Unsafe version of {@link #which(int) which}. */
    public static void nwhich(long struct, int value) { memPutInt(struct + SDL_MouseMotionEvent.WHICH, value); }
    /** Unsafe version of {@link #state(int) state}. */
    public static void nstate(long struct, int value) { memPutInt(struct + SDL_MouseMotionEvent.STATE, value); }
    /** Unsafe version of {@link #x(float) x}. */
    public static void nx(long struct, float value) { memPutFloat(struct + SDL_MouseMotionEvent.X, value); }
    /** Unsafe version of {@link #y(float) y}. */
    public static void ny(long struct, float value) { memPutFloat(struct + SDL_MouseMotionEvent.Y, value); }
    /** Unsafe version of {@link #xrel(float) xrel}. */
    public static void nxrel(long struct, float value) { memPutFloat(struct + SDL_MouseMotionEvent.XREL, value); }
    /** Unsafe version of {@link #yrel(float) yrel}. */
    public static void nyrel(long struct, float value) { memPutFloat(struct + SDL_MouseMotionEvent.YREL, value); }

    // -----------------------------------

    /** An array of {@link SDL_MouseMotionEvent} structs. */
    public static class Buffer extends StructBuffer<SDL_MouseMotionEvent, Buffer> implements NativeResource {

        private static final SDL_MouseMotionEvent ELEMENT_FACTORY = SDL_MouseMotionEvent.create(-1L);

        /**
         * Creates a new {@code SDL_MouseMotionEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_MouseMotionEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_MouseMotionEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("SDL_EventType")
        public int type() { return SDL_MouseMotionEvent.ntype(address()); }
        /** @return the value of the {@code reserved} field. */
        @NativeType("Uint32")
        public int reserved() { return SDL_MouseMotionEvent.nreserved(address()); }
        /** @return the value of the {@code timestamp} field. */
        @NativeType("Uint64")
        public long timestamp() { return SDL_MouseMotionEvent.ntimestamp(address()); }
        /** @return the value of the {@code windowID} field. */
        @NativeType("SDL_WindowID")
        public int windowID() { return SDL_MouseMotionEvent.nwindowID(address()); }
        /** @return the value of the {@code which} field. */
        @NativeType("SDL_MouseID")
        public int which() { return SDL_MouseMotionEvent.nwhich(address()); }
        /** @return the value of the {@code state} field. */
        @NativeType("SDL_MouseButtonFlags")
        public int state() { return SDL_MouseMotionEvent.nstate(address()); }
        /** @return the value of the {@code x} field. */
        public float x() { return SDL_MouseMotionEvent.nx(address()); }
        /** @return the value of the {@code y} field. */
        public float y() { return SDL_MouseMotionEvent.ny(address()); }
        /** @return the value of the {@code xrel} field. */
        public float xrel() { return SDL_MouseMotionEvent.nxrel(address()); }
        /** @return the value of the {@code yrel} field. */
        public float yrel() { return SDL_MouseMotionEvent.nyrel(address()); }

        /** Sets the specified value to the {@code type} field. */
        public SDL_MouseMotionEvent.Buffer type(@NativeType("SDL_EventType") int value) { SDL_MouseMotionEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code reserved} field. */
        public SDL_MouseMotionEvent.Buffer reserved(@NativeType("Uint32") int value) { SDL_MouseMotionEvent.nreserved(address(), value); return this; }
        /** Sets the specified value to the {@code timestamp} field. */
        public SDL_MouseMotionEvent.Buffer timestamp(@NativeType("Uint64") long value) { SDL_MouseMotionEvent.ntimestamp(address(), value); return this; }
        /** Sets the specified value to the {@code windowID} field. */
        public SDL_MouseMotionEvent.Buffer windowID(@NativeType("SDL_WindowID") int value) { SDL_MouseMotionEvent.nwindowID(address(), value); return this; }
        /** Sets the specified value to the {@code which} field. */
        public SDL_MouseMotionEvent.Buffer which(@NativeType("SDL_MouseID") int value) { SDL_MouseMotionEvent.nwhich(address(), value); return this; }
        /** Sets the specified value to the {@code state} field. */
        public SDL_MouseMotionEvent.Buffer state(@NativeType("SDL_MouseButtonFlags") int value) { SDL_MouseMotionEvent.nstate(address(), value); return this; }
        /** Sets the specified value to the {@code x} field. */
        public SDL_MouseMotionEvent.Buffer x(float value) { SDL_MouseMotionEvent.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public SDL_MouseMotionEvent.Buffer y(float value) { SDL_MouseMotionEvent.ny(address(), value); return this; }
        /** Sets the specified value to the {@code xrel} field. */
        public SDL_MouseMotionEvent.Buffer xrel(float value) { SDL_MouseMotionEvent.nxrel(address(), value); return this; }
        /** Sets the specified value to the {@code yrel} field. */
        public SDL_MouseMotionEvent.Buffer yrel(float value) { SDL_MouseMotionEvent.nyrel(address(), value); return this; }

    }

}