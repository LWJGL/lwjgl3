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
 * struct SDL_JoyBatteryEvent {
 *     SDL_EventType type;
 *     Uint32 reserved;
 *     Uint64 timestamp;
 *     SDL_JoystickID which;
 *     SDL_PowerState state;
 *     int percent;
 * }}</pre>
 */
public class SDL_JoyBatteryEvent extends Struct<SDL_JoyBatteryEvent> implements NativeResource {

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
        STATE,
        PERCENT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(8),
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
        STATE = layout.offsetof(4);
        PERCENT = layout.offsetof(5);
    }

    protected SDL_JoyBatteryEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_JoyBatteryEvent create(long address, @Nullable ByteBuffer container) {
        return new SDL_JoyBatteryEvent(address, container);
    }

    /**
     * Creates a {@code SDL_JoyBatteryEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_JoyBatteryEvent(ByteBuffer container) {
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
    /** @return the value of the {@code state} field. */
    @NativeType("SDL_PowerState")
    public int state() { return nstate(address()); }
    /** @return the value of the {@code percent} field. */
    public int percent() { return npercent(address()); }

    /** Sets the specified value to the {@code type} field. */
    public SDL_JoyBatteryEvent type(@NativeType("SDL_EventType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code reserved} field. */
    public SDL_JoyBatteryEvent reserved(@NativeType("Uint32") int value) { nreserved(address(), value); return this; }
    /** Sets the specified value to the {@code timestamp} field. */
    public SDL_JoyBatteryEvent timestamp(@NativeType("Uint64") long value) { ntimestamp(address(), value); return this; }
    /** Sets the specified value to the {@code which} field. */
    public SDL_JoyBatteryEvent which(@NativeType("SDL_JoystickID") int value) { nwhich(address(), value); return this; }
    /** Sets the specified value to the {@code state} field. */
    public SDL_JoyBatteryEvent state(@NativeType("SDL_PowerState") int value) { nstate(address(), value); return this; }
    /** Sets the specified value to the {@code percent} field. */
    public SDL_JoyBatteryEvent percent(int value) { npercent(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_JoyBatteryEvent set(
        int type,
        int reserved,
        long timestamp,
        int which,
        int state,
        int percent
    ) {
        type(type);
        reserved(reserved);
        timestamp(timestamp);
        which(which);
        state(state);
        percent(percent);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_JoyBatteryEvent set(SDL_JoyBatteryEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_JoyBatteryEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_JoyBatteryEvent malloc() {
        return new SDL_JoyBatteryEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_JoyBatteryEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_JoyBatteryEvent calloc() {
        return new SDL_JoyBatteryEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_JoyBatteryEvent} instance allocated with {@link BufferUtils}. */
    public static SDL_JoyBatteryEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_JoyBatteryEvent(memAddress(container), container);
    }

    /** Returns a new {@code SDL_JoyBatteryEvent} instance for the specified memory address. */
    public static SDL_JoyBatteryEvent create(long address) {
        return new SDL_JoyBatteryEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_JoyBatteryEvent createSafe(long address) {
        return address == NULL ? null : new SDL_JoyBatteryEvent(address, null);
    }

    /**
     * Returns a new {@link SDL_JoyBatteryEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_JoyBatteryEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_JoyBatteryEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_JoyBatteryEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_JoyBatteryEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_JoyBatteryEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_JoyBatteryEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_JoyBatteryEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_JoyBatteryEvent.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_JoyBatteryEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_JoyBatteryEvent malloc(MemoryStack stack) {
        return new SDL_JoyBatteryEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_JoyBatteryEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_JoyBatteryEvent calloc(MemoryStack stack) {
        return new SDL_JoyBatteryEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_JoyBatteryEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_JoyBatteryEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_JoyBatteryEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_JoyBatteryEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + SDL_JoyBatteryEvent.TYPE); }
    /** Unsafe version of {@link #reserved}. */
    public static int nreserved(long struct) { return memGetInt(struct + SDL_JoyBatteryEvent.RESERVED); }
    /** Unsafe version of {@link #timestamp}. */
    public static long ntimestamp(long struct) { return memGetLong(struct + SDL_JoyBatteryEvent.TIMESTAMP); }
    /** Unsafe version of {@link #which}. */
    public static int nwhich(long struct) { return memGetInt(struct + SDL_JoyBatteryEvent.WHICH); }
    /** Unsafe version of {@link #state}. */
    public static int nstate(long struct) { return memGetInt(struct + SDL_JoyBatteryEvent.STATE); }
    /** Unsafe version of {@link #percent}. */
    public static int npercent(long struct) { return memGetInt(struct + SDL_JoyBatteryEvent.PERCENT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + SDL_JoyBatteryEvent.TYPE, value); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static void nreserved(long struct, int value) { memPutInt(struct + SDL_JoyBatteryEvent.RESERVED, value); }
    /** Unsafe version of {@link #timestamp(long) timestamp}. */
    public static void ntimestamp(long struct, long value) { memPutLong(struct + SDL_JoyBatteryEvent.TIMESTAMP, value); }
    /** Unsafe version of {@link #which(int) which}. */
    public static void nwhich(long struct, int value) { memPutInt(struct + SDL_JoyBatteryEvent.WHICH, value); }
    /** Unsafe version of {@link #state(int) state}. */
    public static void nstate(long struct, int value) { memPutInt(struct + SDL_JoyBatteryEvent.STATE, value); }
    /** Unsafe version of {@link #percent(int) percent}. */
    public static void npercent(long struct, int value) { memPutInt(struct + SDL_JoyBatteryEvent.PERCENT, value); }

    // -----------------------------------

    /** An array of {@link SDL_JoyBatteryEvent} structs. */
    public static class Buffer extends StructBuffer<SDL_JoyBatteryEvent, Buffer> implements NativeResource {

        private static final SDL_JoyBatteryEvent ELEMENT_FACTORY = SDL_JoyBatteryEvent.create(-1L);

        /**
         * Creates a new {@code SDL_JoyBatteryEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_JoyBatteryEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_JoyBatteryEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("SDL_EventType")
        public int type() { return SDL_JoyBatteryEvent.ntype(address()); }
        /** @return the value of the {@code reserved} field. */
        @NativeType("Uint32")
        public int reserved() { return SDL_JoyBatteryEvent.nreserved(address()); }
        /** @return the value of the {@code timestamp} field. */
        @NativeType("Uint64")
        public long timestamp() { return SDL_JoyBatteryEvent.ntimestamp(address()); }
        /** @return the value of the {@code which} field. */
        @NativeType("SDL_JoystickID")
        public int which() { return SDL_JoyBatteryEvent.nwhich(address()); }
        /** @return the value of the {@code state} field. */
        @NativeType("SDL_PowerState")
        public int state() { return SDL_JoyBatteryEvent.nstate(address()); }
        /** @return the value of the {@code percent} field. */
        public int percent() { return SDL_JoyBatteryEvent.npercent(address()); }

        /** Sets the specified value to the {@code type} field. */
        public SDL_JoyBatteryEvent.Buffer type(@NativeType("SDL_EventType") int value) { SDL_JoyBatteryEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code reserved} field. */
        public SDL_JoyBatteryEvent.Buffer reserved(@NativeType("Uint32") int value) { SDL_JoyBatteryEvent.nreserved(address(), value); return this; }
        /** Sets the specified value to the {@code timestamp} field. */
        public SDL_JoyBatteryEvent.Buffer timestamp(@NativeType("Uint64") long value) { SDL_JoyBatteryEvent.ntimestamp(address(), value); return this; }
        /** Sets the specified value to the {@code which} field. */
        public SDL_JoyBatteryEvent.Buffer which(@NativeType("SDL_JoystickID") int value) { SDL_JoyBatteryEvent.nwhich(address(), value); return this; }
        /** Sets the specified value to the {@code state} field. */
        public SDL_JoyBatteryEvent.Buffer state(@NativeType("SDL_PowerState") int value) { SDL_JoyBatteryEvent.nstate(address(), value); return this; }
        /** Sets the specified value to the {@code percent} field. */
        public SDL_JoyBatteryEvent.Buffer percent(int value) { SDL_JoyBatteryEvent.npercent(address(), value); return this; }

    }

}