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
 * struct SDL_JoyButtonEvent {
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
public class SDL_JoyButtonEvent extends Struct<SDL_JoyButtonEvent> implements NativeResource {

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

    protected SDL_JoyButtonEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_JoyButtonEvent create(long address, @Nullable ByteBuffer container) {
        return new SDL_JoyButtonEvent(address, container);
    }

    /**
     * Creates a {@code SDL_JoyButtonEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_JoyButtonEvent(ByteBuffer container) {
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
    public SDL_JoyButtonEvent type(@NativeType("SDL_EventType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code reserved} field. */
    public SDL_JoyButtonEvent reserved(@NativeType("Uint32") int value) { nreserved(address(), value); return this; }
    /** Sets the specified value to the {@code timestamp} field. */
    public SDL_JoyButtonEvent timestamp(@NativeType("Uint64") long value) { ntimestamp(address(), value); return this; }
    /** Sets the specified value to the {@code which} field. */
    public SDL_JoyButtonEvent which(@NativeType("SDL_JoystickID") int value) { nwhich(address(), value); return this; }
    /** Sets the specified value to the {@code button} field. */
    public SDL_JoyButtonEvent button(@NativeType("Uint8") byte value) { nbutton(address(), value); return this; }
    /** Sets the specified value to the {@code down} field. */
    public SDL_JoyButtonEvent down(@NativeType("bool") boolean value) { ndown(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_JoyButtonEvent set(
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
    public SDL_JoyButtonEvent set(SDL_JoyButtonEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_JoyButtonEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_JoyButtonEvent malloc() {
        return new SDL_JoyButtonEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_JoyButtonEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_JoyButtonEvent calloc() {
        return new SDL_JoyButtonEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_JoyButtonEvent} instance allocated with {@link BufferUtils}. */
    public static SDL_JoyButtonEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_JoyButtonEvent(memAddress(container), container);
    }

    /** Returns a new {@code SDL_JoyButtonEvent} instance for the specified memory address. */
    public static SDL_JoyButtonEvent create(long address) {
        return new SDL_JoyButtonEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_JoyButtonEvent createSafe(long address) {
        return address == NULL ? null : new SDL_JoyButtonEvent(address, null);
    }

    /**
     * Returns a new {@link SDL_JoyButtonEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_JoyButtonEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_JoyButtonEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_JoyButtonEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_JoyButtonEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_JoyButtonEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_JoyButtonEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_JoyButtonEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_JoyButtonEvent.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_JoyButtonEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_JoyButtonEvent malloc(MemoryStack stack) {
        return new SDL_JoyButtonEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_JoyButtonEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_JoyButtonEvent calloc(MemoryStack stack) {
        return new SDL_JoyButtonEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_JoyButtonEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_JoyButtonEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_JoyButtonEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_JoyButtonEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + SDL_JoyButtonEvent.TYPE); }
    /** Unsafe version of {@link #reserved}. */
    public static int nreserved(long struct) { return memGetInt(struct + SDL_JoyButtonEvent.RESERVED); }
    /** Unsafe version of {@link #timestamp}. */
    public static long ntimestamp(long struct) { return memGetLong(struct + SDL_JoyButtonEvent.TIMESTAMP); }
    /** Unsafe version of {@link #which}. */
    public static int nwhich(long struct) { return memGetInt(struct + SDL_JoyButtonEvent.WHICH); }
    /** Unsafe version of {@link #button}. */
    public static byte nbutton(long struct) { return memGetByte(struct + SDL_JoyButtonEvent.BUTTON); }
    /** Unsafe version of {@link #down}. */
    public static boolean ndown(long struct) { return memGetByte(struct + SDL_JoyButtonEvent.DOWN) != 0; }
    public static byte npadding1(long struct) { return memGetByte(struct + SDL_JoyButtonEvent.PADDING1); }
    public static byte npadding2(long struct) { return memGetByte(struct + SDL_JoyButtonEvent.PADDING2); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + SDL_JoyButtonEvent.TYPE, value); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static void nreserved(long struct, int value) { memPutInt(struct + SDL_JoyButtonEvent.RESERVED, value); }
    /** Unsafe version of {@link #timestamp(long) timestamp}. */
    public static void ntimestamp(long struct, long value) { memPutLong(struct + SDL_JoyButtonEvent.TIMESTAMP, value); }
    /** Unsafe version of {@link #which(int) which}. */
    public static void nwhich(long struct, int value) { memPutInt(struct + SDL_JoyButtonEvent.WHICH, value); }
    /** Unsafe version of {@link #button(byte) button}. */
    public static void nbutton(long struct, byte value) { memPutByte(struct + SDL_JoyButtonEvent.BUTTON, value); }
    /** Unsafe version of {@link #down(boolean) down}. */
    public static void ndown(long struct, boolean value) { memPutByte(struct + SDL_JoyButtonEvent.DOWN, value ? (byte)1 : (byte)0); }
    public static void npadding1(long struct, byte value) { memPutByte(struct + SDL_JoyButtonEvent.PADDING1, value); }
    public static void npadding2(long struct, byte value) { memPutByte(struct + SDL_JoyButtonEvent.PADDING2, value); }

    // -----------------------------------

    /** An array of {@link SDL_JoyButtonEvent} structs. */
    public static class Buffer extends StructBuffer<SDL_JoyButtonEvent, Buffer> implements NativeResource {

        private static final SDL_JoyButtonEvent ELEMENT_FACTORY = SDL_JoyButtonEvent.create(-1L);

        /**
         * Creates a new {@code SDL_JoyButtonEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_JoyButtonEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_JoyButtonEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("SDL_EventType")
        public int type() { return SDL_JoyButtonEvent.ntype(address()); }
        /** @return the value of the {@code reserved} field. */
        @NativeType("Uint32")
        public int reserved() { return SDL_JoyButtonEvent.nreserved(address()); }
        /** @return the value of the {@code timestamp} field. */
        @NativeType("Uint64")
        public long timestamp() { return SDL_JoyButtonEvent.ntimestamp(address()); }
        /** @return the value of the {@code which} field. */
        @NativeType("SDL_JoystickID")
        public int which() { return SDL_JoyButtonEvent.nwhich(address()); }
        /** @return the value of the {@code button} field. */
        @NativeType("Uint8")
        public byte button() { return SDL_JoyButtonEvent.nbutton(address()); }
        /** @return the value of the {@code down} field. */
        @NativeType("bool")
        public boolean down() { return SDL_JoyButtonEvent.ndown(address()); }

        /** Sets the specified value to the {@code type} field. */
        public SDL_JoyButtonEvent.Buffer type(@NativeType("SDL_EventType") int value) { SDL_JoyButtonEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code reserved} field. */
        public SDL_JoyButtonEvent.Buffer reserved(@NativeType("Uint32") int value) { SDL_JoyButtonEvent.nreserved(address(), value); return this; }
        /** Sets the specified value to the {@code timestamp} field. */
        public SDL_JoyButtonEvent.Buffer timestamp(@NativeType("Uint64") long value) { SDL_JoyButtonEvent.ntimestamp(address(), value); return this; }
        /** Sets the specified value to the {@code which} field. */
        public SDL_JoyButtonEvent.Buffer which(@NativeType("SDL_JoystickID") int value) { SDL_JoyButtonEvent.nwhich(address(), value); return this; }
        /** Sets the specified value to the {@code button} field. */
        public SDL_JoyButtonEvent.Buffer button(@NativeType("Uint8") byte value) { SDL_JoyButtonEvent.nbutton(address(), value); return this; }
        /** Sets the specified value to the {@code down} field. */
        public SDL_JoyButtonEvent.Buffer down(@NativeType("bool") boolean value) { SDL_JoyButtonEvent.ndown(address(), value); return this; }

    }

}