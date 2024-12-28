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
 * struct SDL_GamepadTouchpadEvent {
 *     SDL_EventType type;
 *     Uint32 reserved;
 *     Uint64 timestamp;
 *     SDL_JoystickID which;
 *     Sint32 touchpad;
 *     Sint32 finger;
 *     float x;
 *     float y;
 *     float pressure;
 * }}</pre>
 */
public class SDL_GamepadTouchpadEvent extends Struct<SDL_GamepadTouchpadEvent> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        RESERVED,
        TIMESTAMP,
        WHICH,
        TOUCHPAD,
        FINGER,
        X,
        Y,
        PRESSURE;

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
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        RESERVED = layout.offsetof(1);
        TIMESTAMP = layout.offsetof(2);
        WHICH = layout.offsetof(3);
        TOUCHPAD = layout.offsetof(4);
        FINGER = layout.offsetof(5);
        X = layout.offsetof(6);
        Y = layout.offsetof(7);
        PRESSURE = layout.offsetof(8);
    }

    protected SDL_GamepadTouchpadEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_GamepadTouchpadEvent create(long address, @Nullable ByteBuffer container) {
        return new SDL_GamepadTouchpadEvent(address, container);
    }

    /**
     * Creates a {@code SDL_GamepadTouchpadEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_GamepadTouchpadEvent(ByteBuffer container) {
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
    /** @return the value of the {@code which} field. */
    @NativeType("SDL_JoystickID")
    public int which() { return nwhich(address()); }
    /** @return the value of the {@code touchpad} field. */
    @NativeType("Sint32")
    public int touchpad() { return ntouchpad(address()); }
    /** @return the value of the {@code finger} field. */
    @NativeType("Sint32")
    public int finger() { return nfinger(address()); }
    /** @return the value of the {@code x} field. */
    public float x() { return nx(address()); }
    /** @return the value of the {@code y} field. */
    public float y() { return ny(address()); }
    /** @return the value of the {@code pressure} field. */
    public float pressure() { return npressure(address()); }

    /** Sets the specified value to the {@code type} field. */
    public SDL_GamepadTouchpadEvent type(@NativeType("SDL_EventType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code reserved} field. */
    public SDL_GamepadTouchpadEvent reserved(@NativeType("Uint32") int value) { nreserved(address(), value); return this; }
    /** Sets the specified value to the {@code timestamp} field. */
    public SDL_GamepadTouchpadEvent timestamp(@NativeType("Uint64") long value) { ntimestamp(address(), value); return this; }
    /** Sets the specified value to the {@code which} field. */
    public SDL_GamepadTouchpadEvent which(@NativeType("SDL_JoystickID") int value) { nwhich(address(), value); return this; }
    /** Sets the specified value to the {@code touchpad} field. */
    public SDL_GamepadTouchpadEvent touchpad(@NativeType("Sint32") int value) { ntouchpad(address(), value); return this; }
    /** Sets the specified value to the {@code finger} field. */
    public SDL_GamepadTouchpadEvent finger(@NativeType("Sint32") int value) { nfinger(address(), value); return this; }
    /** Sets the specified value to the {@code x} field. */
    public SDL_GamepadTouchpadEvent x(float value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public SDL_GamepadTouchpadEvent y(float value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@code pressure} field. */
    public SDL_GamepadTouchpadEvent pressure(float value) { npressure(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_GamepadTouchpadEvent set(
        int type,
        int reserved,
        long timestamp,
        int which,
        int touchpad,
        int finger,
        float x,
        float y,
        float pressure
    ) {
        type(type);
        reserved(reserved);
        timestamp(timestamp);
        which(which);
        touchpad(touchpad);
        finger(finger);
        x(x);
        y(y);
        pressure(pressure);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_GamepadTouchpadEvent set(SDL_GamepadTouchpadEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_GamepadTouchpadEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_GamepadTouchpadEvent malloc() {
        return new SDL_GamepadTouchpadEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_GamepadTouchpadEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_GamepadTouchpadEvent calloc() {
        return new SDL_GamepadTouchpadEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_GamepadTouchpadEvent} instance allocated with {@link BufferUtils}. */
    public static SDL_GamepadTouchpadEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GamepadTouchpadEvent(memAddress(container), container);
    }

    /** Returns a new {@code SDL_GamepadTouchpadEvent} instance for the specified memory address. */
    public static SDL_GamepadTouchpadEvent create(long address) {
        return new SDL_GamepadTouchpadEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_GamepadTouchpadEvent createSafe(long address) {
        return address == NULL ? null : new SDL_GamepadTouchpadEvent(address, null);
    }

    /**
     * Returns a new {@link SDL_GamepadTouchpadEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GamepadTouchpadEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_GamepadTouchpadEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GamepadTouchpadEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GamepadTouchpadEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GamepadTouchpadEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_GamepadTouchpadEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_GamepadTouchpadEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_GamepadTouchpadEvent.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_GamepadTouchpadEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GamepadTouchpadEvent malloc(MemoryStack stack) {
        return new SDL_GamepadTouchpadEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_GamepadTouchpadEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GamepadTouchpadEvent calloc(MemoryStack stack) {
        return new SDL_GamepadTouchpadEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_GamepadTouchpadEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GamepadTouchpadEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GamepadTouchpadEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GamepadTouchpadEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + SDL_GamepadTouchpadEvent.TYPE); }
    /** Unsafe version of {@link #reserved}. */
    public static int nreserved(long struct) { return memGetInt(struct + SDL_GamepadTouchpadEvent.RESERVED); }
    /** Unsafe version of {@link #timestamp}. */
    public static long ntimestamp(long struct) { return memGetLong(struct + SDL_GamepadTouchpadEvent.TIMESTAMP); }
    /** Unsafe version of {@link #which}. */
    public static int nwhich(long struct) { return memGetInt(struct + SDL_GamepadTouchpadEvent.WHICH); }
    /** Unsafe version of {@link #touchpad}. */
    public static int ntouchpad(long struct) { return memGetInt(struct + SDL_GamepadTouchpadEvent.TOUCHPAD); }
    /** Unsafe version of {@link #finger}. */
    public static int nfinger(long struct) { return memGetInt(struct + SDL_GamepadTouchpadEvent.FINGER); }
    /** Unsafe version of {@link #x}. */
    public static float nx(long struct) { return memGetFloat(struct + SDL_GamepadTouchpadEvent.X); }
    /** Unsafe version of {@link #y}. */
    public static float ny(long struct) { return memGetFloat(struct + SDL_GamepadTouchpadEvent.Y); }
    /** Unsafe version of {@link #pressure}. */
    public static float npressure(long struct) { return memGetFloat(struct + SDL_GamepadTouchpadEvent.PRESSURE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + SDL_GamepadTouchpadEvent.TYPE, value); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static void nreserved(long struct, int value) { memPutInt(struct + SDL_GamepadTouchpadEvent.RESERVED, value); }
    /** Unsafe version of {@link #timestamp(long) timestamp}. */
    public static void ntimestamp(long struct, long value) { memPutLong(struct + SDL_GamepadTouchpadEvent.TIMESTAMP, value); }
    /** Unsafe version of {@link #which(int) which}. */
    public static void nwhich(long struct, int value) { memPutInt(struct + SDL_GamepadTouchpadEvent.WHICH, value); }
    /** Unsafe version of {@link #touchpad(int) touchpad}. */
    public static void ntouchpad(long struct, int value) { memPutInt(struct + SDL_GamepadTouchpadEvent.TOUCHPAD, value); }
    /** Unsafe version of {@link #finger(int) finger}. */
    public static void nfinger(long struct, int value) { memPutInt(struct + SDL_GamepadTouchpadEvent.FINGER, value); }
    /** Unsafe version of {@link #x(float) x}. */
    public static void nx(long struct, float value) { memPutFloat(struct + SDL_GamepadTouchpadEvent.X, value); }
    /** Unsafe version of {@link #y(float) y}. */
    public static void ny(long struct, float value) { memPutFloat(struct + SDL_GamepadTouchpadEvent.Y, value); }
    /** Unsafe version of {@link #pressure(float) pressure}. */
    public static void npressure(long struct, float value) { memPutFloat(struct + SDL_GamepadTouchpadEvent.PRESSURE, value); }

    // -----------------------------------

    /** An array of {@link SDL_GamepadTouchpadEvent} structs. */
    public static class Buffer extends StructBuffer<SDL_GamepadTouchpadEvent, Buffer> implements NativeResource {

        private static final SDL_GamepadTouchpadEvent ELEMENT_FACTORY = SDL_GamepadTouchpadEvent.create(-1L);

        /**
         * Creates a new {@code SDL_GamepadTouchpadEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_GamepadTouchpadEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_GamepadTouchpadEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("SDL_EventType")
        public int type() { return SDL_GamepadTouchpadEvent.ntype(address()); }
        /** @return the value of the {@code reserved} field. */
        @NativeType("Uint32")
        public int reserved() { return SDL_GamepadTouchpadEvent.nreserved(address()); }
        /** @return the value of the {@code timestamp} field. */
        @NativeType("Uint64")
        public long timestamp() { return SDL_GamepadTouchpadEvent.ntimestamp(address()); }
        /** @return the value of the {@code which} field. */
        @NativeType("SDL_JoystickID")
        public int which() { return SDL_GamepadTouchpadEvent.nwhich(address()); }
        /** @return the value of the {@code touchpad} field. */
        @NativeType("Sint32")
        public int touchpad() { return SDL_GamepadTouchpadEvent.ntouchpad(address()); }
        /** @return the value of the {@code finger} field. */
        @NativeType("Sint32")
        public int finger() { return SDL_GamepadTouchpadEvent.nfinger(address()); }
        /** @return the value of the {@code x} field. */
        public float x() { return SDL_GamepadTouchpadEvent.nx(address()); }
        /** @return the value of the {@code y} field. */
        public float y() { return SDL_GamepadTouchpadEvent.ny(address()); }
        /** @return the value of the {@code pressure} field. */
        public float pressure() { return SDL_GamepadTouchpadEvent.npressure(address()); }

        /** Sets the specified value to the {@code type} field. */
        public SDL_GamepadTouchpadEvent.Buffer type(@NativeType("SDL_EventType") int value) { SDL_GamepadTouchpadEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code reserved} field. */
        public SDL_GamepadTouchpadEvent.Buffer reserved(@NativeType("Uint32") int value) { SDL_GamepadTouchpadEvent.nreserved(address(), value); return this; }
        /** Sets the specified value to the {@code timestamp} field. */
        public SDL_GamepadTouchpadEvent.Buffer timestamp(@NativeType("Uint64") long value) { SDL_GamepadTouchpadEvent.ntimestamp(address(), value); return this; }
        /** Sets the specified value to the {@code which} field. */
        public SDL_GamepadTouchpadEvent.Buffer which(@NativeType("SDL_JoystickID") int value) { SDL_GamepadTouchpadEvent.nwhich(address(), value); return this; }
        /** Sets the specified value to the {@code touchpad} field. */
        public SDL_GamepadTouchpadEvent.Buffer touchpad(@NativeType("Sint32") int value) { SDL_GamepadTouchpadEvent.ntouchpad(address(), value); return this; }
        /** Sets the specified value to the {@code finger} field. */
        public SDL_GamepadTouchpadEvent.Buffer finger(@NativeType("Sint32") int value) { SDL_GamepadTouchpadEvent.nfinger(address(), value); return this; }
        /** Sets the specified value to the {@code x} field. */
        public SDL_GamepadTouchpadEvent.Buffer x(float value) { SDL_GamepadTouchpadEvent.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public SDL_GamepadTouchpadEvent.Buffer y(float value) { SDL_GamepadTouchpadEvent.ny(address(), value); return this; }
        /** Sets the specified value to the {@code pressure} field. */
        public SDL_GamepadTouchpadEvent.Buffer pressure(float value) { SDL_GamepadTouchpadEvent.npressure(address(), value); return this; }

    }

}