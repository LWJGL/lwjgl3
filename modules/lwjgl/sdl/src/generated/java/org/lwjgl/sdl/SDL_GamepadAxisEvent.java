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
 * struct SDL_GamepadAxisEvent {
 *     SDL_EventType type;
 *     Uint32 reserved;
 *     Uint64 timestamp;
 *     SDL_JoystickID which;
 *     Uint8 axis;
 *     Uint8 padding1;
 *     Uint8 padding2;
 *     Uint8 padding3;
 *     Sint16 value;
 *     Uint16 padding4;
 * }}</pre>
 */
public class SDL_GamepadAxisEvent extends Struct<SDL_GamepadAxisEvent> implements NativeResource {

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
        AXIS,
        PADDING1,
        PADDING2,
        PADDING3,
        VALUE,
        PADDING4;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(8),
            __member(4),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(2),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        RESERVED = layout.offsetof(1);
        TIMESTAMP = layout.offsetof(2);
        WHICH = layout.offsetof(3);
        AXIS = layout.offsetof(4);
        PADDING1 = layout.offsetof(5);
        PADDING2 = layout.offsetof(6);
        PADDING3 = layout.offsetof(7);
        VALUE = layout.offsetof(8);
        PADDING4 = layout.offsetof(9);
    }

    protected SDL_GamepadAxisEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_GamepadAxisEvent create(long address, @Nullable ByteBuffer container) {
        return new SDL_GamepadAxisEvent(address, container);
    }

    /**
     * Creates a {@code SDL_GamepadAxisEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_GamepadAxisEvent(ByteBuffer container) {
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
    /** @return the value of the {@code axis} field. */
    @NativeType("Uint8")
    public byte axis() { return naxis(address()); }
    /** @return the value of the {@code value} field. */
    @NativeType("Sint16")
    public short value() { return nvalue(address()); }

    /** Sets the specified value to the {@code type} field. */
    public SDL_GamepadAxisEvent type(@NativeType("SDL_EventType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code reserved} field. */
    public SDL_GamepadAxisEvent reserved(@NativeType("Uint32") int value) { nreserved(address(), value); return this; }
    /** Sets the specified value to the {@code timestamp} field. */
    public SDL_GamepadAxisEvent timestamp(@NativeType("Uint64") long value) { ntimestamp(address(), value); return this; }
    /** Sets the specified value to the {@code which} field. */
    public SDL_GamepadAxisEvent which(@NativeType("SDL_JoystickID") int value) { nwhich(address(), value); return this; }
    /** Sets the specified value to the {@code axis} field. */
    public SDL_GamepadAxisEvent axis(@NativeType("Uint8") byte value) { naxis(address(), value); return this; }
    /** Sets the specified value to the {@code value} field. */
    public SDL_GamepadAxisEvent value(@NativeType("Sint16") short value) { nvalue(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_GamepadAxisEvent set(
        int type,
        int reserved,
        long timestamp,
        int which,
        byte axis,
        short value
    ) {
        type(type);
        reserved(reserved);
        timestamp(timestamp);
        which(which);
        axis(axis);
        value(value);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_GamepadAxisEvent set(SDL_GamepadAxisEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_GamepadAxisEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_GamepadAxisEvent malloc() {
        return new SDL_GamepadAxisEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_GamepadAxisEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_GamepadAxisEvent calloc() {
        return new SDL_GamepadAxisEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_GamepadAxisEvent} instance allocated with {@link BufferUtils}. */
    public static SDL_GamepadAxisEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GamepadAxisEvent(memAddress(container), container);
    }

    /** Returns a new {@code SDL_GamepadAxisEvent} instance for the specified memory address. */
    public static SDL_GamepadAxisEvent create(long address) {
        return new SDL_GamepadAxisEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_GamepadAxisEvent createSafe(long address) {
        return address == NULL ? null : new SDL_GamepadAxisEvent(address, null);
    }

    /**
     * Returns a new {@link SDL_GamepadAxisEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GamepadAxisEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_GamepadAxisEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GamepadAxisEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GamepadAxisEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GamepadAxisEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_GamepadAxisEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_GamepadAxisEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_GamepadAxisEvent.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_GamepadAxisEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GamepadAxisEvent malloc(MemoryStack stack) {
        return new SDL_GamepadAxisEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_GamepadAxisEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GamepadAxisEvent calloc(MemoryStack stack) {
        return new SDL_GamepadAxisEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_GamepadAxisEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GamepadAxisEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GamepadAxisEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GamepadAxisEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + SDL_GamepadAxisEvent.TYPE); }
    /** Unsafe version of {@link #reserved}. */
    public static int nreserved(long struct) { return memGetInt(struct + SDL_GamepadAxisEvent.RESERVED); }
    /** Unsafe version of {@link #timestamp}. */
    public static long ntimestamp(long struct) { return memGetLong(struct + SDL_GamepadAxisEvent.TIMESTAMP); }
    /** Unsafe version of {@link #which}. */
    public static int nwhich(long struct) { return memGetInt(struct + SDL_GamepadAxisEvent.WHICH); }
    /** Unsafe version of {@link #axis}. */
    public static byte naxis(long struct) { return memGetByte(struct + SDL_GamepadAxisEvent.AXIS); }
    public static byte npadding1(long struct) { return memGetByte(struct + SDL_GamepadAxisEvent.PADDING1); }
    public static byte npadding2(long struct) { return memGetByte(struct + SDL_GamepadAxisEvent.PADDING2); }
    public static byte npadding3(long struct) { return memGetByte(struct + SDL_GamepadAxisEvent.PADDING3); }
    /** Unsafe version of {@link #value}. */
    public static short nvalue(long struct) { return memGetShort(struct + SDL_GamepadAxisEvent.VALUE); }
    public static short npadding4(long struct) { return memGetShort(struct + SDL_GamepadAxisEvent.PADDING4); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + SDL_GamepadAxisEvent.TYPE, value); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static void nreserved(long struct, int value) { memPutInt(struct + SDL_GamepadAxisEvent.RESERVED, value); }
    /** Unsafe version of {@link #timestamp(long) timestamp}. */
    public static void ntimestamp(long struct, long value) { memPutLong(struct + SDL_GamepadAxisEvent.TIMESTAMP, value); }
    /** Unsafe version of {@link #which(int) which}. */
    public static void nwhich(long struct, int value) { memPutInt(struct + SDL_GamepadAxisEvent.WHICH, value); }
    /** Unsafe version of {@link #axis(byte) axis}. */
    public static void naxis(long struct, byte value) { memPutByte(struct + SDL_GamepadAxisEvent.AXIS, value); }
    public static void npadding1(long struct, byte value) { memPutByte(struct + SDL_GamepadAxisEvent.PADDING1, value); }
    public static void npadding2(long struct, byte value) { memPutByte(struct + SDL_GamepadAxisEvent.PADDING2, value); }
    public static void npadding3(long struct, byte value) { memPutByte(struct + SDL_GamepadAxisEvent.PADDING3, value); }
    /** Unsafe version of {@link #value(short) value}. */
    public static void nvalue(long struct, short value) { memPutShort(struct + SDL_GamepadAxisEvent.VALUE, value); }
    public static void npadding4(long struct, short value) { memPutShort(struct + SDL_GamepadAxisEvent.PADDING4, value); }

    // -----------------------------------

    /** An array of {@link SDL_GamepadAxisEvent} structs. */
    public static class Buffer extends StructBuffer<SDL_GamepadAxisEvent, Buffer> implements NativeResource {

        private static final SDL_GamepadAxisEvent ELEMENT_FACTORY = SDL_GamepadAxisEvent.create(-1L);

        /**
         * Creates a new {@code SDL_GamepadAxisEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_GamepadAxisEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_GamepadAxisEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("SDL_EventType")
        public int type() { return SDL_GamepadAxisEvent.ntype(address()); }
        /** @return the value of the {@code reserved} field. */
        @NativeType("Uint32")
        public int reserved() { return SDL_GamepadAxisEvent.nreserved(address()); }
        /** @return the value of the {@code timestamp} field. */
        @NativeType("Uint64")
        public long timestamp() { return SDL_GamepadAxisEvent.ntimestamp(address()); }
        /** @return the value of the {@code which} field. */
        @NativeType("SDL_JoystickID")
        public int which() { return SDL_GamepadAxisEvent.nwhich(address()); }
        /** @return the value of the {@code axis} field. */
        @NativeType("Uint8")
        public byte axis() { return SDL_GamepadAxisEvent.naxis(address()); }
        /** @return the value of the {@code value} field. */
        @NativeType("Sint16")
        public short value() { return SDL_GamepadAxisEvent.nvalue(address()); }

        /** Sets the specified value to the {@code type} field. */
        public SDL_GamepadAxisEvent.Buffer type(@NativeType("SDL_EventType") int value) { SDL_GamepadAxisEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code reserved} field. */
        public SDL_GamepadAxisEvent.Buffer reserved(@NativeType("Uint32") int value) { SDL_GamepadAxisEvent.nreserved(address(), value); return this; }
        /** Sets the specified value to the {@code timestamp} field. */
        public SDL_GamepadAxisEvent.Buffer timestamp(@NativeType("Uint64") long value) { SDL_GamepadAxisEvent.ntimestamp(address(), value); return this; }
        /** Sets the specified value to the {@code which} field. */
        public SDL_GamepadAxisEvent.Buffer which(@NativeType("SDL_JoystickID") int value) { SDL_GamepadAxisEvent.nwhich(address(), value); return this; }
        /** Sets the specified value to the {@code axis} field. */
        public SDL_GamepadAxisEvent.Buffer axis(@NativeType("Uint8") byte value) { SDL_GamepadAxisEvent.naxis(address(), value); return this; }
        /** Sets the specified value to the {@code value} field. */
        public SDL_GamepadAxisEvent.Buffer value(@NativeType("Sint16") short value) { SDL_GamepadAxisEvent.nvalue(address(), value); return this; }

    }

}