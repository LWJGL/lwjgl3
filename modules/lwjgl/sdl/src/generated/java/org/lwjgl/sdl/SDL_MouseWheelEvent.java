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
 * struct SDL_MouseWheelEvent {
 *     SDL_EventType type;
 *     Uint32 reserved;
 *     Uint64 timestamp;
 *     SDL_WindowID windowID;
 *     SDL_MouseID which;
 *     float x;
 *     float y;
 *     SDL_MouseWheelDirection direction;
 *     float mouse_x;
 *     float mouse_y;
 * }}</pre>
 */
public class SDL_MouseWheelEvent extends Struct<SDL_MouseWheelEvent> implements NativeResource {

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
        X,
        Y,
        DIRECTION,
        MOUSE_X,
        MOUSE_Y;

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
        X = layout.offsetof(5);
        Y = layout.offsetof(6);
        DIRECTION = layout.offsetof(7);
        MOUSE_X = layout.offsetof(8);
        MOUSE_Y = layout.offsetof(9);
    }

    protected SDL_MouseWheelEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_MouseWheelEvent create(long address, @Nullable ByteBuffer container) {
        return new SDL_MouseWheelEvent(address, container);
    }

    /**
     * Creates a {@code SDL_MouseWheelEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_MouseWheelEvent(ByteBuffer container) {
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
    /** @return the value of the {@code x} field. */
    public float x() { return nx(address()); }
    /** @return the value of the {@code y} field. */
    public float y() { return ny(address()); }
    /** @return the value of the {@code direction} field. */
    @NativeType("SDL_MouseWheelDirection")
    public int direction() { return ndirection(address()); }
    /** @return the value of the {@code mouse_x} field. */
    public float mouse_x() { return nmouse_x(address()); }
    /** @return the value of the {@code mouse_y} field. */
    public float mouse_y() { return nmouse_y(address()); }

    /** Sets the specified value to the {@code type} field. */
    public SDL_MouseWheelEvent type(@NativeType("SDL_EventType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code reserved} field. */
    public SDL_MouseWheelEvent reserved(@NativeType("Uint32") int value) { nreserved(address(), value); return this; }
    /** Sets the specified value to the {@code timestamp} field. */
    public SDL_MouseWheelEvent timestamp(@NativeType("Uint64") long value) { ntimestamp(address(), value); return this; }
    /** Sets the specified value to the {@code windowID} field. */
    public SDL_MouseWheelEvent windowID(@NativeType("SDL_WindowID") int value) { nwindowID(address(), value); return this; }
    /** Sets the specified value to the {@code which} field. */
    public SDL_MouseWheelEvent which(@NativeType("SDL_MouseID") int value) { nwhich(address(), value); return this; }
    /** Sets the specified value to the {@code x} field. */
    public SDL_MouseWheelEvent x(float value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public SDL_MouseWheelEvent y(float value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@code direction} field. */
    public SDL_MouseWheelEvent direction(@NativeType("SDL_MouseWheelDirection") int value) { ndirection(address(), value); return this; }
    /** Sets the specified value to the {@code mouse_x} field. */
    public SDL_MouseWheelEvent mouse_x(float value) { nmouse_x(address(), value); return this; }
    /** Sets the specified value to the {@code mouse_y} field. */
    public SDL_MouseWheelEvent mouse_y(float value) { nmouse_y(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_MouseWheelEvent set(
        int type,
        int reserved,
        long timestamp,
        int windowID,
        int which,
        float x,
        float y,
        int direction,
        float mouse_x,
        float mouse_y
    ) {
        type(type);
        reserved(reserved);
        timestamp(timestamp);
        windowID(windowID);
        which(which);
        x(x);
        y(y);
        direction(direction);
        mouse_x(mouse_x);
        mouse_y(mouse_y);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_MouseWheelEvent set(SDL_MouseWheelEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_MouseWheelEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_MouseWheelEvent malloc() {
        return new SDL_MouseWheelEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_MouseWheelEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_MouseWheelEvent calloc() {
        return new SDL_MouseWheelEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_MouseWheelEvent} instance allocated with {@link BufferUtils}. */
    public static SDL_MouseWheelEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_MouseWheelEvent(memAddress(container), container);
    }

    /** Returns a new {@code SDL_MouseWheelEvent} instance for the specified memory address. */
    public static SDL_MouseWheelEvent create(long address) {
        return new SDL_MouseWheelEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_MouseWheelEvent createSafe(long address) {
        return address == NULL ? null : new SDL_MouseWheelEvent(address, null);
    }

    /**
     * Returns a new {@link SDL_MouseWheelEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_MouseWheelEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_MouseWheelEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_MouseWheelEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_MouseWheelEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_MouseWheelEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_MouseWheelEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_MouseWheelEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_MouseWheelEvent.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_MouseWheelEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_MouseWheelEvent malloc(MemoryStack stack) {
        return new SDL_MouseWheelEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_MouseWheelEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_MouseWheelEvent calloc(MemoryStack stack) {
        return new SDL_MouseWheelEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_MouseWheelEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_MouseWheelEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_MouseWheelEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_MouseWheelEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + SDL_MouseWheelEvent.TYPE); }
    /** Unsafe version of {@link #reserved}. */
    public static int nreserved(long struct) { return memGetInt(struct + SDL_MouseWheelEvent.RESERVED); }
    /** Unsafe version of {@link #timestamp}. */
    public static long ntimestamp(long struct) { return memGetLong(struct + SDL_MouseWheelEvent.TIMESTAMP); }
    /** Unsafe version of {@link #windowID}. */
    public static int nwindowID(long struct) { return memGetInt(struct + SDL_MouseWheelEvent.WINDOWID); }
    /** Unsafe version of {@link #which}. */
    public static int nwhich(long struct) { return memGetInt(struct + SDL_MouseWheelEvent.WHICH); }
    /** Unsafe version of {@link #x}. */
    public static float nx(long struct) { return memGetFloat(struct + SDL_MouseWheelEvent.X); }
    /** Unsafe version of {@link #y}. */
    public static float ny(long struct) { return memGetFloat(struct + SDL_MouseWheelEvent.Y); }
    /** Unsafe version of {@link #direction}. */
    public static int ndirection(long struct) { return memGetInt(struct + SDL_MouseWheelEvent.DIRECTION); }
    /** Unsafe version of {@link #mouse_x}. */
    public static float nmouse_x(long struct) { return memGetFloat(struct + SDL_MouseWheelEvent.MOUSE_X); }
    /** Unsafe version of {@link #mouse_y}. */
    public static float nmouse_y(long struct) { return memGetFloat(struct + SDL_MouseWheelEvent.MOUSE_Y); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + SDL_MouseWheelEvent.TYPE, value); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static void nreserved(long struct, int value) { memPutInt(struct + SDL_MouseWheelEvent.RESERVED, value); }
    /** Unsafe version of {@link #timestamp(long) timestamp}. */
    public static void ntimestamp(long struct, long value) { memPutLong(struct + SDL_MouseWheelEvent.TIMESTAMP, value); }
    /** Unsafe version of {@link #windowID(int) windowID}. */
    public static void nwindowID(long struct, int value) { memPutInt(struct + SDL_MouseWheelEvent.WINDOWID, value); }
    /** Unsafe version of {@link #which(int) which}. */
    public static void nwhich(long struct, int value) { memPutInt(struct + SDL_MouseWheelEvent.WHICH, value); }
    /** Unsafe version of {@link #x(float) x}. */
    public static void nx(long struct, float value) { memPutFloat(struct + SDL_MouseWheelEvent.X, value); }
    /** Unsafe version of {@link #y(float) y}. */
    public static void ny(long struct, float value) { memPutFloat(struct + SDL_MouseWheelEvent.Y, value); }
    /** Unsafe version of {@link #direction(int) direction}. */
    public static void ndirection(long struct, int value) { memPutInt(struct + SDL_MouseWheelEvent.DIRECTION, value); }
    /** Unsafe version of {@link #mouse_x(float) mouse_x}. */
    public static void nmouse_x(long struct, float value) { memPutFloat(struct + SDL_MouseWheelEvent.MOUSE_X, value); }
    /** Unsafe version of {@link #mouse_y(float) mouse_y}. */
    public static void nmouse_y(long struct, float value) { memPutFloat(struct + SDL_MouseWheelEvent.MOUSE_Y, value); }

    // -----------------------------------

    /** An array of {@link SDL_MouseWheelEvent} structs. */
    public static class Buffer extends StructBuffer<SDL_MouseWheelEvent, Buffer> implements NativeResource {

        private static final SDL_MouseWheelEvent ELEMENT_FACTORY = SDL_MouseWheelEvent.create(-1L);

        /**
         * Creates a new {@code SDL_MouseWheelEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_MouseWheelEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_MouseWheelEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("SDL_EventType")
        public int type() { return SDL_MouseWheelEvent.ntype(address()); }
        /** @return the value of the {@code reserved} field. */
        @NativeType("Uint32")
        public int reserved() { return SDL_MouseWheelEvent.nreserved(address()); }
        /** @return the value of the {@code timestamp} field. */
        @NativeType("Uint64")
        public long timestamp() { return SDL_MouseWheelEvent.ntimestamp(address()); }
        /** @return the value of the {@code windowID} field. */
        @NativeType("SDL_WindowID")
        public int windowID() { return SDL_MouseWheelEvent.nwindowID(address()); }
        /** @return the value of the {@code which} field. */
        @NativeType("SDL_MouseID")
        public int which() { return SDL_MouseWheelEvent.nwhich(address()); }
        /** @return the value of the {@code x} field. */
        public float x() { return SDL_MouseWheelEvent.nx(address()); }
        /** @return the value of the {@code y} field. */
        public float y() { return SDL_MouseWheelEvent.ny(address()); }
        /** @return the value of the {@code direction} field. */
        @NativeType("SDL_MouseWheelDirection")
        public int direction() { return SDL_MouseWheelEvent.ndirection(address()); }
        /** @return the value of the {@code mouse_x} field. */
        public float mouse_x() { return SDL_MouseWheelEvent.nmouse_x(address()); }
        /** @return the value of the {@code mouse_y} field. */
        public float mouse_y() { return SDL_MouseWheelEvent.nmouse_y(address()); }

        /** Sets the specified value to the {@code type} field. */
        public SDL_MouseWheelEvent.Buffer type(@NativeType("SDL_EventType") int value) { SDL_MouseWheelEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code reserved} field. */
        public SDL_MouseWheelEvent.Buffer reserved(@NativeType("Uint32") int value) { SDL_MouseWheelEvent.nreserved(address(), value); return this; }
        /** Sets the specified value to the {@code timestamp} field. */
        public SDL_MouseWheelEvent.Buffer timestamp(@NativeType("Uint64") long value) { SDL_MouseWheelEvent.ntimestamp(address(), value); return this; }
        /** Sets the specified value to the {@code windowID} field. */
        public SDL_MouseWheelEvent.Buffer windowID(@NativeType("SDL_WindowID") int value) { SDL_MouseWheelEvent.nwindowID(address(), value); return this; }
        /** Sets the specified value to the {@code which} field. */
        public SDL_MouseWheelEvent.Buffer which(@NativeType("SDL_MouseID") int value) { SDL_MouseWheelEvent.nwhich(address(), value); return this; }
        /** Sets the specified value to the {@code x} field. */
        public SDL_MouseWheelEvent.Buffer x(float value) { SDL_MouseWheelEvent.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public SDL_MouseWheelEvent.Buffer y(float value) { SDL_MouseWheelEvent.ny(address(), value); return this; }
        /** Sets the specified value to the {@code direction} field. */
        public SDL_MouseWheelEvent.Buffer direction(@NativeType("SDL_MouseWheelDirection") int value) { SDL_MouseWheelEvent.ndirection(address(), value); return this; }
        /** Sets the specified value to the {@code mouse_x} field. */
        public SDL_MouseWheelEvent.Buffer mouse_x(float value) { SDL_MouseWheelEvent.nmouse_x(address(), value); return this; }
        /** Sets the specified value to the {@code mouse_y} field. */
        public SDL_MouseWheelEvent.Buffer mouse_y(float value) { SDL_MouseWheelEvent.nmouse_y(address(), value); return this; }

    }

}