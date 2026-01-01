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
 * struct SDL_PinchFingerEvent {
 *     SDL_EventType type;
 *     Uint32 reserved;
 *     Uint64 timestamp;
 *     float scale;
 *     SDL_WindowID windowID;
 * }}</pre>
 */
public class SDL_PinchFingerEvent extends Struct<SDL_PinchFingerEvent> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        RESERVED,
        TIMESTAMP,
        SCALE,
        WINDOWID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(8),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        RESERVED = layout.offsetof(1);
        TIMESTAMP = layout.offsetof(2);
        SCALE = layout.offsetof(3);
        WINDOWID = layout.offsetof(4);
    }

    protected SDL_PinchFingerEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_PinchFingerEvent create(long address, @Nullable ByteBuffer container) {
        return new SDL_PinchFingerEvent(address, container);
    }

    /**
     * Creates a {@code SDL_PinchFingerEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_PinchFingerEvent(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("SDL_EventType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code timestamp} field. */
    @NativeType("Uint64")
    public long timestamp() { return ntimestamp(address()); }
    /** @return the value of the {@code scale} field. */
    public float scale() { return nscale(address()); }
    /** @return the value of the {@code windowID} field. */
    @NativeType("SDL_WindowID")
    public int windowID() { return nwindowID(address()); }

    /** Sets the specified value to the {@code type} field. */
    public SDL_PinchFingerEvent type(@NativeType("SDL_EventType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code timestamp} field. */
    public SDL_PinchFingerEvent timestamp(@NativeType("Uint64") long value) { ntimestamp(address(), value); return this; }
    /** Sets the specified value to the {@code scale} field. */
    public SDL_PinchFingerEvent scale(float value) { nscale(address(), value); return this; }
    /** Sets the specified value to the {@code windowID} field. */
    public SDL_PinchFingerEvent windowID(@NativeType("SDL_WindowID") int value) { nwindowID(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_PinchFingerEvent set(
        int type,
        long timestamp,
        float scale,
        int windowID
    ) {
        type(type);
        timestamp(timestamp);
        scale(scale);
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
    public SDL_PinchFingerEvent set(SDL_PinchFingerEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_PinchFingerEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_PinchFingerEvent malloc() {
        return new SDL_PinchFingerEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_PinchFingerEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_PinchFingerEvent calloc() {
        return new SDL_PinchFingerEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_PinchFingerEvent} instance allocated with {@link BufferUtils}. */
    public static SDL_PinchFingerEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_PinchFingerEvent(memAddress(container), container);
    }

    /** Returns a new {@code SDL_PinchFingerEvent} instance for the specified memory address. */
    public static SDL_PinchFingerEvent create(long address) {
        return new SDL_PinchFingerEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_PinchFingerEvent createSafe(long address) {
        return address == NULL ? null : new SDL_PinchFingerEvent(address, null);
    }

    /**
     * Returns a new {@link SDL_PinchFingerEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_PinchFingerEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_PinchFingerEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_PinchFingerEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_PinchFingerEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_PinchFingerEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_PinchFingerEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_PinchFingerEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_PinchFingerEvent.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_PinchFingerEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_PinchFingerEvent malloc(MemoryStack stack) {
        return new SDL_PinchFingerEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_PinchFingerEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_PinchFingerEvent calloc(MemoryStack stack) {
        return new SDL_PinchFingerEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_PinchFingerEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_PinchFingerEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_PinchFingerEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_PinchFingerEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + SDL_PinchFingerEvent.TYPE); }
    public static int nreserved(long struct) { return memGetInt(struct + SDL_PinchFingerEvent.RESERVED); }
    /** Unsafe version of {@link #timestamp}. */
    public static long ntimestamp(long struct) { return memGetLong(struct + SDL_PinchFingerEvent.TIMESTAMP); }
    /** Unsafe version of {@link #scale}. */
    public static float nscale(long struct) { return memGetFloat(struct + SDL_PinchFingerEvent.SCALE); }
    /** Unsafe version of {@link #windowID}. */
    public static int nwindowID(long struct) { return memGetInt(struct + SDL_PinchFingerEvent.WINDOWID); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + SDL_PinchFingerEvent.TYPE, value); }
    public static void nreserved(long struct, int value) { memPutInt(struct + SDL_PinchFingerEvent.RESERVED, value); }
    /** Unsafe version of {@link #timestamp(long) timestamp}. */
    public static void ntimestamp(long struct, long value) { memPutLong(struct + SDL_PinchFingerEvent.TIMESTAMP, value); }
    /** Unsafe version of {@link #scale(float) scale}. */
    public static void nscale(long struct, float value) { memPutFloat(struct + SDL_PinchFingerEvent.SCALE, value); }
    /** Unsafe version of {@link #windowID(int) windowID}. */
    public static void nwindowID(long struct, int value) { memPutInt(struct + SDL_PinchFingerEvent.WINDOWID, value); }

    // -----------------------------------

    /** An array of {@link SDL_PinchFingerEvent} structs. */
    public static class Buffer extends StructBuffer<SDL_PinchFingerEvent, Buffer> implements NativeResource {

        private static final SDL_PinchFingerEvent ELEMENT_FACTORY = SDL_PinchFingerEvent.create(-1L);

        /**
         * Creates a new {@code SDL_PinchFingerEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_PinchFingerEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_PinchFingerEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("SDL_EventType")
        public int type() { return SDL_PinchFingerEvent.ntype(address()); }
        /** @return the value of the {@code timestamp} field. */
        @NativeType("Uint64")
        public long timestamp() { return SDL_PinchFingerEvent.ntimestamp(address()); }
        /** @return the value of the {@code scale} field. */
        public float scale() { return SDL_PinchFingerEvent.nscale(address()); }
        /** @return the value of the {@code windowID} field. */
        @NativeType("SDL_WindowID")
        public int windowID() { return SDL_PinchFingerEvent.nwindowID(address()); }

        /** Sets the specified value to the {@code type} field. */
        public SDL_PinchFingerEvent.Buffer type(@NativeType("SDL_EventType") int value) { SDL_PinchFingerEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code timestamp} field. */
        public SDL_PinchFingerEvent.Buffer timestamp(@NativeType("Uint64") long value) { SDL_PinchFingerEvent.ntimestamp(address(), value); return this; }
        /** Sets the specified value to the {@code scale} field. */
        public SDL_PinchFingerEvent.Buffer scale(float value) { SDL_PinchFingerEvent.nscale(address(), value); return this; }
        /** Sets the specified value to the {@code windowID} field. */
        public SDL_PinchFingerEvent.Buffer windowID(@NativeType("SDL_WindowID") int value) { SDL_PinchFingerEvent.nwindowID(address(), value); return this; }

    }

}