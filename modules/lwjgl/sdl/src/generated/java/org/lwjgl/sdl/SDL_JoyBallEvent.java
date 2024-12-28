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
 * struct SDL_JoyBallEvent {
 *     SDL_EventType type;
 *     Uint32 reserved;
 *     Uint64 timestamp;
 *     SDL_JoystickID which;
 *     Uint8 ball;
 *     Uint8 padding1;
 *     Uint8 padding2;
 *     Uint8 padding3;
 *     Sint16 xrel;
 *     Sint16 yrel;
 * }}</pre>
 */
public class SDL_JoyBallEvent extends Struct<SDL_JoyBallEvent> implements NativeResource {

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
        BALL,
        PADDING1,
        PADDING2,
        PADDING3,
        XREL,
        YREL;

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
        BALL = layout.offsetof(4);
        PADDING1 = layout.offsetof(5);
        PADDING2 = layout.offsetof(6);
        PADDING3 = layout.offsetof(7);
        XREL = layout.offsetof(8);
        YREL = layout.offsetof(9);
    }

    protected SDL_JoyBallEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_JoyBallEvent create(long address, @Nullable ByteBuffer container) {
        return new SDL_JoyBallEvent(address, container);
    }

    /**
     * Creates a {@code SDL_JoyBallEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_JoyBallEvent(ByteBuffer container) {
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
    /** @return the value of the {@code ball} field. */
    @NativeType("Uint8")
    public byte ball() { return nball(address()); }
    /** @return the value of the {@code xrel} field. */
    @NativeType("Sint16")
    public short xrel() { return nxrel(address()); }
    /** @return the value of the {@code yrel} field. */
    @NativeType("Sint16")
    public short yrel() { return nyrel(address()); }

    /** Sets the specified value to the {@code type} field. */
    public SDL_JoyBallEvent type(@NativeType("SDL_EventType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code reserved} field. */
    public SDL_JoyBallEvent reserved(@NativeType("Uint32") int value) { nreserved(address(), value); return this; }
    /** Sets the specified value to the {@code timestamp} field. */
    public SDL_JoyBallEvent timestamp(@NativeType("Uint64") long value) { ntimestamp(address(), value); return this; }
    /** Sets the specified value to the {@code which} field. */
    public SDL_JoyBallEvent which(@NativeType("SDL_JoystickID") int value) { nwhich(address(), value); return this; }
    /** Sets the specified value to the {@code ball} field. */
    public SDL_JoyBallEvent ball(@NativeType("Uint8") byte value) { nball(address(), value); return this; }
    /** Sets the specified value to the {@code xrel} field. */
    public SDL_JoyBallEvent xrel(@NativeType("Sint16") short value) { nxrel(address(), value); return this; }
    /** Sets the specified value to the {@code yrel} field. */
    public SDL_JoyBallEvent yrel(@NativeType("Sint16") short value) { nyrel(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_JoyBallEvent set(
        int type,
        int reserved,
        long timestamp,
        int which,
        byte ball,
        short xrel,
        short yrel
    ) {
        type(type);
        reserved(reserved);
        timestamp(timestamp);
        which(which);
        ball(ball);
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
    public SDL_JoyBallEvent set(SDL_JoyBallEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_JoyBallEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_JoyBallEvent malloc() {
        return new SDL_JoyBallEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_JoyBallEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_JoyBallEvent calloc() {
        return new SDL_JoyBallEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_JoyBallEvent} instance allocated with {@link BufferUtils}. */
    public static SDL_JoyBallEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_JoyBallEvent(memAddress(container), container);
    }

    /** Returns a new {@code SDL_JoyBallEvent} instance for the specified memory address. */
    public static SDL_JoyBallEvent create(long address) {
        return new SDL_JoyBallEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_JoyBallEvent createSafe(long address) {
        return address == NULL ? null : new SDL_JoyBallEvent(address, null);
    }

    /**
     * Returns a new {@link SDL_JoyBallEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_JoyBallEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_JoyBallEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_JoyBallEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_JoyBallEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_JoyBallEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_JoyBallEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_JoyBallEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_JoyBallEvent.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_JoyBallEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_JoyBallEvent malloc(MemoryStack stack) {
        return new SDL_JoyBallEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_JoyBallEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_JoyBallEvent calloc(MemoryStack stack) {
        return new SDL_JoyBallEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_JoyBallEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_JoyBallEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_JoyBallEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_JoyBallEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + SDL_JoyBallEvent.TYPE); }
    /** Unsafe version of {@link #reserved}. */
    public static int nreserved(long struct) { return memGetInt(struct + SDL_JoyBallEvent.RESERVED); }
    /** Unsafe version of {@link #timestamp}. */
    public static long ntimestamp(long struct) { return memGetLong(struct + SDL_JoyBallEvent.TIMESTAMP); }
    /** Unsafe version of {@link #which}. */
    public static int nwhich(long struct) { return memGetInt(struct + SDL_JoyBallEvent.WHICH); }
    /** Unsafe version of {@link #ball}. */
    public static byte nball(long struct) { return memGetByte(struct + SDL_JoyBallEvent.BALL); }
    public static byte npadding1(long struct) { return memGetByte(struct + SDL_JoyBallEvent.PADDING1); }
    public static byte npadding2(long struct) { return memGetByte(struct + SDL_JoyBallEvent.PADDING2); }
    public static byte npadding3(long struct) { return memGetByte(struct + SDL_JoyBallEvent.PADDING3); }
    /** Unsafe version of {@link #xrel}. */
    public static short nxrel(long struct) { return memGetShort(struct + SDL_JoyBallEvent.XREL); }
    /** Unsafe version of {@link #yrel}. */
    public static short nyrel(long struct) { return memGetShort(struct + SDL_JoyBallEvent.YREL); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + SDL_JoyBallEvent.TYPE, value); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static void nreserved(long struct, int value) { memPutInt(struct + SDL_JoyBallEvent.RESERVED, value); }
    /** Unsafe version of {@link #timestamp(long) timestamp}. */
    public static void ntimestamp(long struct, long value) { memPutLong(struct + SDL_JoyBallEvent.TIMESTAMP, value); }
    /** Unsafe version of {@link #which(int) which}. */
    public static void nwhich(long struct, int value) { memPutInt(struct + SDL_JoyBallEvent.WHICH, value); }
    /** Unsafe version of {@link #ball(byte) ball}. */
    public static void nball(long struct, byte value) { memPutByte(struct + SDL_JoyBallEvent.BALL, value); }
    public static void npadding1(long struct, byte value) { memPutByte(struct + SDL_JoyBallEvent.PADDING1, value); }
    public static void npadding2(long struct, byte value) { memPutByte(struct + SDL_JoyBallEvent.PADDING2, value); }
    public static void npadding3(long struct, byte value) { memPutByte(struct + SDL_JoyBallEvent.PADDING3, value); }
    /** Unsafe version of {@link #xrel(short) xrel}. */
    public static void nxrel(long struct, short value) { memPutShort(struct + SDL_JoyBallEvent.XREL, value); }
    /** Unsafe version of {@link #yrel(short) yrel}. */
    public static void nyrel(long struct, short value) { memPutShort(struct + SDL_JoyBallEvent.YREL, value); }

    // -----------------------------------

    /** An array of {@link SDL_JoyBallEvent} structs. */
    public static class Buffer extends StructBuffer<SDL_JoyBallEvent, Buffer> implements NativeResource {

        private static final SDL_JoyBallEvent ELEMENT_FACTORY = SDL_JoyBallEvent.create(-1L);

        /**
         * Creates a new {@code SDL_JoyBallEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_JoyBallEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_JoyBallEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("SDL_EventType")
        public int type() { return SDL_JoyBallEvent.ntype(address()); }
        /** @return the value of the {@code reserved} field. */
        @NativeType("Uint32")
        public int reserved() { return SDL_JoyBallEvent.nreserved(address()); }
        /** @return the value of the {@code timestamp} field. */
        @NativeType("Uint64")
        public long timestamp() { return SDL_JoyBallEvent.ntimestamp(address()); }
        /** @return the value of the {@code which} field. */
        @NativeType("SDL_JoystickID")
        public int which() { return SDL_JoyBallEvent.nwhich(address()); }
        /** @return the value of the {@code ball} field. */
        @NativeType("Uint8")
        public byte ball() { return SDL_JoyBallEvent.nball(address()); }
        /** @return the value of the {@code xrel} field. */
        @NativeType("Sint16")
        public short xrel() { return SDL_JoyBallEvent.nxrel(address()); }
        /** @return the value of the {@code yrel} field. */
        @NativeType("Sint16")
        public short yrel() { return SDL_JoyBallEvent.nyrel(address()); }

        /** Sets the specified value to the {@code type} field. */
        public SDL_JoyBallEvent.Buffer type(@NativeType("SDL_EventType") int value) { SDL_JoyBallEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code reserved} field. */
        public SDL_JoyBallEvent.Buffer reserved(@NativeType("Uint32") int value) { SDL_JoyBallEvent.nreserved(address(), value); return this; }
        /** Sets the specified value to the {@code timestamp} field. */
        public SDL_JoyBallEvent.Buffer timestamp(@NativeType("Uint64") long value) { SDL_JoyBallEvent.ntimestamp(address(), value); return this; }
        /** Sets the specified value to the {@code which} field. */
        public SDL_JoyBallEvent.Buffer which(@NativeType("SDL_JoystickID") int value) { SDL_JoyBallEvent.nwhich(address(), value); return this; }
        /** Sets the specified value to the {@code ball} field. */
        public SDL_JoyBallEvent.Buffer ball(@NativeType("Uint8") byte value) { SDL_JoyBallEvent.nball(address(), value); return this; }
        /** Sets the specified value to the {@code xrel} field. */
        public SDL_JoyBallEvent.Buffer xrel(@NativeType("Sint16") short value) { SDL_JoyBallEvent.nxrel(address(), value); return this; }
        /** Sets the specified value to the {@code yrel} field. */
        public SDL_JoyBallEvent.Buffer yrel(@NativeType("Sint16") short value) { SDL_JoyBallEvent.nyrel(address(), value); return this; }

    }

}