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
 * struct SDL_GamepadButtonEvent {
 *     SDL_EventType type;
 *     Uint32 reserved;
 *     Uint64 timestamp;
 *     SDL_JoystickID which;
 *     Uint8 button;
 *     bool down;
 *     Uint8 padding1;
 *     Uint8 padding2;
 * }}</pre>
 */
public class SDL_GamepadButtonEvent extends Struct<SDL_GamepadButtonEvent> implements NativeResource {

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
        BUTTON,
        DOWN,
        PADDING1,
        PADDING2;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(8),
            __member(4),
            __member(1),
            __member(1),
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        RESERVED = layout.offsetof(1);
        TIMESTAMP = layout.offsetof(2);
        WHICH = layout.offsetof(3);
        BUTTON = layout.offsetof(4);
        DOWN = layout.offsetof(5);
        PADDING1 = layout.offsetof(6);
        PADDING2 = layout.offsetof(7);
    }

    protected SDL_GamepadButtonEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_GamepadButtonEvent create(long address, @Nullable ByteBuffer container) {
        return new SDL_GamepadButtonEvent(address, container);
    }

    /**
     * Creates a {@code SDL_GamepadButtonEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_GamepadButtonEvent(ByteBuffer container) {
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
    /** @return the value of the {@code button} field. */
    @NativeType("Uint8")
    public byte button() { return nbutton(address()); }
    /** @return the value of the {@code down} field. */
    @NativeType("bool")
    public boolean down() { return ndown(address()); }

    /** Sets the specified value to the {@code type} field. */
    public SDL_GamepadButtonEvent type(@NativeType("SDL_EventType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code reserved} field. */
    public SDL_GamepadButtonEvent reserved(@NativeType("Uint32") int value) { nreserved(address(), value); return this; }
    /** Sets the specified value to the {@code timestamp} field. */
    public SDL_GamepadButtonEvent timestamp(@NativeType("Uint64") long value) { ntimestamp(address(), value); return this; }
    /** Sets the specified value to the {@code which} field. */
    public SDL_GamepadButtonEvent which(@NativeType("SDL_JoystickID") int value) { nwhich(address(), value); return this; }
    /** Sets the specified value to the {@code button} field. */
    public SDL_GamepadButtonEvent button(@NativeType("Uint8") byte value) { nbutton(address(), value); return this; }
    /** Sets the specified value to the {@code down} field. */
    public SDL_GamepadButtonEvent down(@NativeType("bool") boolean value) { ndown(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_GamepadButtonEvent set(
        int type,
        int reserved,
        long timestamp,
        int which,
        byte button,
        boolean down
    ) {
        type(type);
        reserved(reserved);
        timestamp(timestamp);
        which(which);
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
    public SDL_GamepadButtonEvent set(SDL_GamepadButtonEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_GamepadButtonEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_GamepadButtonEvent malloc() {
        return new SDL_GamepadButtonEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_GamepadButtonEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_GamepadButtonEvent calloc() {
        return new SDL_GamepadButtonEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_GamepadButtonEvent} instance allocated with {@link BufferUtils}. */
    public static SDL_GamepadButtonEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GamepadButtonEvent(memAddress(container), container);
    }

    /** Returns a new {@code SDL_GamepadButtonEvent} instance for the specified memory address. */
    public static SDL_GamepadButtonEvent create(long address) {
        return new SDL_GamepadButtonEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_GamepadButtonEvent createSafe(long address) {
        return address == NULL ? null : new SDL_GamepadButtonEvent(address, null);
    }

    /**
     * Returns a new {@link SDL_GamepadButtonEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GamepadButtonEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_GamepadButtonEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GamepadButtonEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GamepadButtonEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GamepadButtonEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_GamepadButtonEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_GamepadButtonEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_GamepadButtonEvent.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_GamepadButtonEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GamepadButtonEvent malloc(MemoryStack stack) {
        return new SDL_GamepadButtonEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_GamepadButtonEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GamepadButtonEvent calloc(MemoryStack stack) {
        return new SDL_GamepadButtonEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_GamepadButtonEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GamepadButtonEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GamepadButtonEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GamepadButtonEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + SDL_GamepadButtonEvent.TYPE); }
    /** Unsafe version of {@link #reserved}. */
    public static int nreserved(long struct) { return memGetInt(struct + SDL_GamepadButtonEvent.RESERVED); }
    /** Unsafe version of {@link #timestamp}. */
    public static long ntimestamp(long struct) { return memGetLong(struct + SDL_GamepadButtonEvent.TIMESTAMP); }
    /** Unsafe version of {@link #which}. */
    public static int nwhich(long struct) { return memGetInt(struct + SDL_GamepadButtonEvent.WHICH); }
    /** Unsafe version of {@link #button}. */
    public static byte nbutton(long struct) { return memGetByte(struct + SDL_GamepadButtonEvent.BUTTON); }
    /** Unsafe version of {@link #down}. */
    public static boolean ndown(long struct) { return memGetByte(struct + SDL_GamepadButtonEvent.DOWN) != 0; }
    public static byte npadding1(long struct) { return memGetByte(struct + SDL_GamepadButtonEvent.PADDING1); }
    public static byte npadding2(long struct) { return memGetByte(struct + SDL_GamepadButtonEvent.PADDING2); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + SDL_GamepadButtonEvent.TYPE, value); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static void nreserved(long struct, int value) { memPutInt(struct + SDL_GamepadButtonEvent.RESERVED, value); }
    /** Unsafe version of {@link #timestamp(long) timestamp}. */
    public static void ntimestamp(long struct, long value) { memPutLong(struct + SDL_GamepadButtonEvent.TIMESTAMP, value); }
    /** Unsafe version of {@link #which(int) which}. */
    public static void nwhich(long struct, int value) { memPutInt(struct + SDL_GamepadButtonEvent.WHICH, value); }
    /** Unsafe version of {@link #button(byte) button}. */
    public static void nbutton(long struct, byte value) { memPutByte(struct + SDL_GamepadButtonEvent.BUTTON, value); }
    /** Unsafe version of {@link #down(boolean) down}. */
    public static void ndown(long struct, boolean value) { memPutByte(struct + SDL_GamepadButtonEvent.DOWN, value ? (byte)1 : (byte)0); }
    public static void npadding1(long struct, byte value) { memPutByte(struct + SDL_GamepadButtonEvent.PADDING1, value); }
    public static void npadding2(long struct, byte value) { memPutByte(struct + SDL_GamepadButtonEvent.PADDING2, value); }

    // -----------------------------------

    /** An array of {@link SDL_GamepadButtonEvent} structs. */
    public static class Buffer extends StructBuffer<SDL_GamepadButtonEvent, Buffer> implements NativeResource {

        private static final SDL_GamepadButtonEvent ELEMENT_FACTORY = SDL_GamepadButtonEvent.create(-1L);

        /**
         * Creates a new {@code SDL_GamepadButtonEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_GamepadButtonEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_GamepadButtonEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("SDL_EventType")
        public int type() { return SDL_GamepadButtonEvent.ntype(address()); }
        /** @return the value of the {@code reserved} field. */
        @NativeType("Uint32")
        public int reserved() { return SDL_GamepadButtonEvent.nreserved(address()); }
        /** @return the value of the {@code timestamp} field. */
        @NativeType("Uint64")
        public long timestamp() { return SDL_GamepadButtonEvent.ntimestamp(address()); }
        /** @return the value of the {@code which} field. */
        @NativeType("SDL_JoystickID")
        public int which() { return SDL_GamepadButtonEvent.nwhich(address()); }
        /** @return the value of the {@code button} field. */
        @NativeType("Uint8")
        public byte button() { return SDL_GamepadButtonEvent.nbutton(address()); }
        /** @return the value of the {@code down} field. */
        @NativeType("bool")
        public boolean down() { return SDL_GamepadButtonEvent.ndown(address()); }

        /** Sets the specified value to the {@code type} field. */
        public SDL_GamepadButtonEvent.Buffer type(@NativeType("SDL_EventType") int value) { SDL_GamepadButtonEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code reserved} field. */
        public SDL_GamepadButtonEvent.Buffer reserved(@NativeType("Uint32") int value) { SDL_GamepadButtonEvent.nreserved(address(), value); return this; }
        /** Sets the specified value to the {@code timestamp} field. */
        public SDL_GamepadButtonEvent.Buffer timestamp(@NativeType("Uint64") long value) { SDL_GamepadButtonEvent.ntimestamp(address(), value); return this; }
        /** Sets the specified value to the {@code which} field. */
        public SDL_GamepadButtonEvent.Buffer which(@NativeType("SDL_JoystickID") int value) { SDL_GamepadButtonEvent.nwhich(address(), value); return this; }
        /** Sets the specified value to the {@code button} field. */
        public SDL_GamepadButtonEvent.Buffer button(@NativeType("Uint8") byte value) { SDL_GamepadButtonEvent.nbutton(address(), value); return this; }
        /** Sets the specified value to the {@code down} field. */
        public SDL_GamepadButtonEvent.Buffer down(@NativeType("bool") boolean value) { SDL_GamepadButtonEvent.ndown(address(), value); return this; }

    }

}