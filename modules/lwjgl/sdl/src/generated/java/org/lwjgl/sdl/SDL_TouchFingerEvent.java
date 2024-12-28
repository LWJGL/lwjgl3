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
 * struct SDL_TouchFingerEvent {
 *     SDL_EventType type;
 *     Uint32 reserved;
 *     Uint64 timestamp;
 *     SDL_TouchID touchID;
 *     SDL_FingerID fingerID;
 *     float x;
 *     float y;
 *     float dx;
 *     float dy;
 *     float pressure;
 *     SDL_WindowID windowID;
 * }}</pre>
 */
public class SDL_TouchFingerEvent extends Struct<SDL_TouchFingerEvent> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        RESERVED,
        TIMESTAMP,
        TOUCHID,
        FINGERID,
        X,
        Y,
        DX,
        DY,
        PRESSURE,
        WINDOWID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(8),
            __member(8),
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
        TOUCHID = layout.offsetof(3);
        FINGERID = layout.offsetof(4);
        X = layout.offsetof(5);
        Y = layout.offsetof(6);
        DX = layout.offsetof(7);
        DY = layout.offsetof(8);
        PRESSURE = layout.offsetof(9);
        WINDOWID = layout.offsetof(10);
    }

    protected SDL_TouchFingerEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_TouchFingerEvent create(long address, @Nullable ByteBuffer container) {
        return new SDL_TouchFingerEvent(address, container);
    }

    /**
     * Creates a {@code SDL_TouchFingerEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_TouchFingerEvent(ByteBuffer container) {
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
    /** @return the value of the {@code touchID} field. */
    @NativeType("SDL_TouchID")
    public long touchID() { return ntouchID(address()); }
    /** @return the value of the {@code fingerID} field. */
    @NativeType("SDL_FingerID")
    public long fingerID() { return nfingerID(address()); }
    /** @return the value of the {@code x} field. */
    public float x() { return nx(address()); }
    /** @return the value of the {@code y} field. */
    public float y() { return ny(address()); }
    /** @return the value of the {@code dx} field. */
    public float dx() { return ndx(address()); }
    /** @return the value of the {@code dy} field. */
    public float dy() { return ndy(address()); }
    /** @return the value of the {@code pressure} field. */
    public float pressure() { return npressure(address()); }
    /** @return the value of the {@code windowID} field. */
    @NativeType("SDL_WindowID")
    public int windowID() { return nwindowID(address()); }

    /** Sets the specified value to the {@code type} field. */
    public SDL_TouchFingerEvent type(@NativeType("SDL_EventType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code reserved} field. */
    public SDL_TouchFingerEvent reserved(@NativeType("Uint32") int value) { nreserved(address(), value); return this; }
    /** Sets the specified value to the {@code timestamp} field. */
    public SDL_TouchFingerEvent timestamp(@NativeType("Uint64") long value) { ntimestamp(address(), value); return this; }
    /** Sets the specified value to the {@code touchID} field. */
    public SDL_TouchFingerEvent touchID(@NativeType("SDL_TouchID") long value) { ntouchID(address(), value); return this; }
    /** Sets the specified value to the {@code fingerID} field. */
    public SDL_TouchFingerEvent fingerID(@NativeType("SDL_FingerID") long value) { nfingerID(address(), value); return this; }
    /** Sets the specified value to the {@code x} field. */
    public SDL_TouchFingerEvent x(float value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public SDL_TouchFingerEvent y(float value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@code dx} field. */
    public SDL_TouchFingerEvent dx(float value) { ndx(address(), value); return this; }
    /** Sets the specified value to the {@code dy} field. */
    public SDL_TouchFingerEvent dy(float value) { ndy(address(), value); return this; }
    /** Sets the specified value to the {@code pressure} field. */
    public SDL_TouchFingerEvent pressure(float value) { npressure(address(), value); return this; }
    /** Sets the specified value to the {@code windowID} field. */
    public SDL_TouchFingerEvent windowID(@NativeType("SDL_WindowID") int value) { nwindowID(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_TouchFingerEvent set(
        int type,
        int reserved,
        long timestamp,
        long touchID,
        long fingerID,
        float x,
        float y,
        float dx,
        float dy,
        float pressure,
        int windowID
    ) {
        type(type);
        reserved(reserved);
        timestamp(timestamp);
        touchID(touchID);
        fingerID(fingerID);
        x(x);
        y(y);
        dx(dx);
        dy(dy);
        pressure(pressure);
        windowID(windowID);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_TouchFingerEvent set(SDL_TouchFingerEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_TouchFingerEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_TouchFingerEvent malloc() {
        return new SDL_TouchFingerEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_TouchFingerEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_TouchFingerEvent calloc() {
        return new SDL_TouchFingerEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_TouchFingerEvent} instance allocated with {@link BufferUtils}. */
    public static SDL_TouchFingerEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_TouchFingerEvent(memAddress(container), container);
    }

    /** Returns a new {@code SDL_TouchFingerEvent} instance for the specified memory address. */
    public static SDL_TouchFingerEvent create(long address) {
        return new SDL_TouchFingerEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_TouchFingerEvent createSafe(long address) {
        return address == NULL ? null : new SDL_TouchFingerEvent(address, null);
    }

    /**
     * Returns a new {@link SDL_TouchFingerEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_TouchFingerEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_TouchFingerEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_TouchFingerEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_TouchFingerEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_TouchFingerEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_TouchFingerEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_TouchFingerEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_TouchFingerEvent.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_TouchFingerEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_TouchFingerEvent malloc(MemoryStack stack) {
        return new SDL_TouchFingerEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_TouchFingerEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_TouchFingerEvent calloc(MemoryStack stack) {
        return new SDL_TouchFingerEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_TouchFingerEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_TouchFingerEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_TouchFingerEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_TouchFingerEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + SDL_TouchFingerEvent.TYPE); }
    /** Unsafe version of {@link #reserved}. */
    public static int nreserved(long struct) { return memGetInt(struct + SDL_TouchFingerEvent.RESERVED); }
    /** Unsafe version of {@link #timestamp}. */
    public static long ntimestamp(long struct) { return memGetLong(struct + SDL_TouchFingerEvent.TIMESTAMP); }
    /** Unsafe version of {@link #touchID}. */
    public static long ntouchID(long struct) { return memGetLong(struct + SDL_TouchFingerEvent.TOUCHID); }
    /** Unsafe version of {@link #fingerID}. */
    public static long nfingerID(long struct) { return memGetLong(struct + SDL_TouchFingerEvent.FINGERID); }
    /** Unsafe version of {@link #x}. */
    public static float nx(long struct) { return memGetFloat(struct + SDL_TouchFingerEvent.X); }
    /** Unsafe version of {@link #y}. */
    public static float ny(long struct) { return memGetFloat(struct + SDL_TouchFingerEvent.Y); }
    /** Unsafe version of {@link #dx}. */
    public static float ndx(long struct) { return memGetFloat(struct + SDL_TouchFingerEvent.DX); }
    /** Unsafe version of {@link #dy}. */
    public static float ndy(long struct) { return memGetFloat(struct + SDL_TouchFingerEvent.DY); }
    /** Unsafe version of {@link #pressure}. */
    public static float npressure(long struct) { return memGetFloat(struct + SDL_TouchFingerEvent.PRESSURE); }
    /** Unsafe version of {@link #windowID}. */
    public static int nwindowID(long struct) { return memGetInt(struct + SDL_TouchFingerEvent.WINDOWID); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + SDL_TouchFingerEvent.TYPE, value); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static void nreserved(long struct, int value) { memPutInt(struct + SDL_TouchFingerEvent.RESERVED, value); }
    /** Unsafe version of {@link #timestamp(long) timestamp}. */
    public static void ntimestamp(long struct, long value) { memPutLong(struct + SDL_TouchFingerEvent.TIMESTAMP, value); }
    /** Unsafe version of {@link #touchID(long) touchID}. */
    public static void ntouchID(long struct, long value) { memPutLong(struct + SDL_TouchFingerEvent.TOUCHID, value); }
    /** Unsafe version of {@link #fingerID(long) fingerID}. */
    public static void nfingerID(long struct, long value) { memPutLong(struct + SDL_TouchFingerEvent.FINGERID, value); }
    /** Unsafe version of {@link #x(float) x}. */
    public static void nx(long struct, float value) { memPutFloat(struct + SDL_TouchFingerEvent.X, value); }
    /** Unsafe version of {@link #y(float) y}. */
    public static void ny(long struct, float value) { memPutFloat(struct + SDL_TouchFingerEvent.Y, value); }
    /** Unsafe version of {@link #dx(float) dx}. */
    public static void ndx(long struct, float value) { memPutFloat(struct + SDL_TouchFingerEvent.DX, value); }
    /** Unsafe version of {@link #dy(float) dy}. */
    public static void ndy(long struct, float value) { memPutFloat(struct + SDL_TouchFingerEvent.DY, value); }
    /** Unsafe version of {@link #pressure(float) pressure}. */
    public static void npressure(long struct, float value) { memPutFloat(struct + SDL_TouchFingerEvent.PRESSURE, value); }
    /** Unsafe version of {@link #windowID(int) windowID}. */
    public static void nwindowID(long struct, int value) { memPutInt(struct + SDL_TouchFingerEvent.WINDOWID, value); }

    // -----------------------------------

    /** An array of {@link SDL_TouchFingerEvent} structs. */
    public static class Buffer extends StructBuffer<SDL_TouchFingerEvent, Buffer> implements NativeResource {

        private static final SDL_TouchFingerEvent ELEMENT_FACTORY = SDL_TouchFingerEvent.create(-1L);

        /**
         * Creates a new {@code SDL_TouchFingerEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_TouchFingerEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_TouchFingerEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("SDL_EventType")
        public int type() { return SDL_TouchFingerEvent.ntype(address()); }
        /** @return the value of the {@code reserved} field. */
        @NativeType("Uint32")
        public int reserved() { return SDL_TouchFingerEvent.nreserved(address()); }
        /** @return the value of the {@code timestamp} field. */
        @NativeType("Uint64")
        public long timestamp() { return SDL_TouchFingerEvent.ntimestamp(address()); }
        /** @return the value of the {@code touchID} field. */
        @NativeType("SDL_TouchID")
        public long touchID() { return SDL_TouchFingerEvent.ntouchID(address()); }
        /** @return the value of the {@code fingerID} field. */
        @NativeType("SDL_FingerID")
        public long fingerID() { return SDL_TouchFingerEvent.nfingerID(address()); }
        /** @return the value of the {@code x} field. */
        public float x() { return SDL_TouchFingerEvent.nx(address()); }
        /** @return the value of the {@code y} field. */
        public float y() { return SDL_TouchFingerEvent.ny(address()); }
        /** @return the value of the {@code dx} field. */
        public float dx() { return SDL_TouchFingerEvent.ndx(address()); }
        /** @return the value of the {@code dy} field. */
        public float dy() { return SDL_TouchFingerEvent.ndy(address()); }
        /** @return the value of the {@code pressure} field. */
        public float pressure() { return SDL_TouchFingerEvent.npressure(address()); }
        /** @return the value of the {@code windowID} field. */
        @NativeType("SDL_WindowID")
        public int windowID() { return SDL_TouchFingerEvent.nwindowID(address()); }

        /** Sets the specified value to the {@code type} field. */
        public SDL_TouchFingerEvent.Buffer type(@NativeType("SDL_EventType") int value) { SDL_TouchFingerEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code reserved} field. */
        public SDL_TouchFingerEvent.Buffer reserved(@NativeType("Uint32") int value) { SDL_TouchFingerEvent.nreserved(address(), value); return this; }
        /** Sets the specified value to the {@code timestamp} field. */
        public SDL_TouchFingerEvent.Buffer timestamp(@NativeType("Uint64") long value) { SDL_TouchFingerEvent.ntimestamp(address(), value); return this; }
        /** Sets the specified value to the {@code touchID} field. */
        public SDL_TouchFingerEvent.Buffer touchID(@NativeType("SDL_TouchID") long value) { SDL_TouchFingerEvent.ntouchID(address(), value); return this; }
        /** Sets the specified value to the {@code fingerID} field. */
        public SDL_TouchFingerEvent.Buffer fingerID(@NativeType("SDL_FingerID") long value) { SDL_TouchFingerEvent.nfingerID(address(), value); return this; }
        /** Sets the specified value to the {@code x} field. */
        public SDL_TouchFingerEvent.Buffer x(float value) { SDL_TouchFingerEvent.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public SDL_TouchFingerEvent.Buffer y(float value) { SDL_TouchFingerEvent.ny(address(), value); return this; }
        /** Sets the specified value to the {@code dx} field. */
        public SDL_TouchFingerEvent.Buffer dx(float value) { SDL_TouchFingerEvent.ndx(address(), value); return this; }
        /** Sets the specified value to the {@code dy} field. */
        public SDL_TouchFingerEvent.Buffer dy(float value) { SDL_TouchFingerEvent.ndy(address(), value); return this; }
        /** Sets the specified value to the {@code pressure} field. */
        public SDL_TouchFingerEvent.Buffer pressure(float value) { SDL_TouchFingerEvent.npressure(address(), value); return this; }
        /** Sets the specified value to the {@code windowID} field. */
        public SDL_TouchFingerEvent.Buffer windowID(@NativeType("SDL_WindowID") int value) { SDL_TouchFingerEvent.nwindowID(address(), value); return this; }

    }

}