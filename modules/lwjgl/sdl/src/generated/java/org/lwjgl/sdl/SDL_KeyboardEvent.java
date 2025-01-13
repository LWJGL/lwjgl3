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
 * struct SDL_KeyboardEvent {
 *     SDL_EventType type;
 *     Uint32 reserved;
 *     Uint64 timestamp;
 *     SDL_WindowID windowID;
 *     SDL_KeyboardID which;
 *     SDL_Scancode scancode;
 *     SDL_Keycode key;
 *     SDL_Keymod mod;
 *     Uint16 raw;
 *     bool down;
 *     bool repeat;
 * }}</pre>
 */
public class SDL_KeyboardEvent extends Struct<SDL_KeyboardEvent> implements NativeResource {

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
        SCANCODE,
        KEY,
        MOD,
        RAW,
        DOWN,
        REPEAT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(2),
            __member(2),
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        RESERVED = layout.offsetof(1);
        TIMESTAMP = layout.offsetof(2);
        WINDOWID = layout.offsetof(3);
        WHICH = layout.offsetof(4);
        SCANCODE = layout.offsetof(5);
        KEY = layout.offsetof(6);
        MOD = layout.offsetof(7);
        RAW = layout.offsetof(8);
        DOWN = layout.offsetof(9);
        REPEAT = layout.offsetof(10);
    }

    protected SDL_KeyboardEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_KeyboardEvent create(long address, @Nullable ByteBuffer container) {
        return new SDL_KeyboardEvent(address, container);
    }

    /**
     * Creates a {@code SDL_KeyboardEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_KeyboardEvent(ByteBuffer container) {
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
    @NativeType("SDL_KeyboardID")
    public int which() { return nwhich(address()); }
    /** @return the value of the {@code scancode} field. */
    @NativeType("SDL_Scancode")
    public int scancode() { return nscancode(address()); }
    /** @return the value of the {@code key} field. */
    @NativeType("SDL_Keycode")
    public int key() { return nkey(address()); }
    /** @return the value of the {@code mod} field. */
    @NativeType("SDL_Keymod")
    public short mod() { return nmod(address()); }
    /** @return the value of the {@code raw} field. */
    @NativeType("Uint16")
    public short raw() { return nraw(address()); }
    /** @return the value of the {@code down} field. */
    @NativeType("bool")
    public boolean down() { return ndown(address()); }
    /** @return the value of the {@code repeat} field. */
    @NativeType("bool")
    public boolean repeat() { return nrepeat(address()); }

    /** Sets the specified value to the {@code type} field. */
    public SDL_KeyboardEvent type(@NativeType("SDL_EventType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code reserved} field. */
    public SDL_KeyboardEvent reserved(@NativeType("Uint32") int value) { nreserved(address(), value); return this; }
    /** Sets the specified value to the {@code timestamp} field. */
    public SDL_KeyboardEvent timestamp(@NativeType("Uint64") long value) { ntimestamp(address(), value); return this; }
    /** Sets the specified value to the {@code windowID} field. */
    public SDL_KeyboardEvent windowID(@NativeType("SDL_WindowID") int value) { nwindowID(address(), value); return this; }
    /** Sets the specified value to the {@code which} field. */
    public SDL_KeyboardEvent which(@NativeType("SDL_KeyboardID") int value) { nwhich(address(), value); return this; }
    /** Sets the specified value to the {@code scancode} field. */
    public SDL_KeyboardEvent scancode(@NativeType("SDL_Scancode") int value) { nscancode(address(), value); return this; }
    /** Sets the specified value to the {@code key} field. */
    public SDL_KeyboardEvent key(@NativeType("SDL_Keycode") int value) { nkey(address(), value); return this; }
    /** Sets the specified value to the {@code mod} field. */
    public SDL_KeyboardEvent mod(@NativeType("SDL_Keymod") short value) { nmod(address(), value); return this; }
    /** Sets the specified value to the {@code raw} field. */
    public SDL_KeyboardEvent raw(@NativeType("Uint16") short value) { nraw(address(), value); return this; }
    /** Sets the specified value to the {@code down} field. */
    public SDL_KeyboardEvent down(@NativeType("bool") boolean value) { ndown(address(), value); return this; }
    /** Sets the specified value to the {@code repeat} field. */
    public SDL_KeyboardEvent repeat(@NativeType("bool") boolean value) { nrepeat(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_KeyboardEvent set(
        int type,
        int reserved,
        long timestamp,
        int windowID,
        int which,
        int scancode,
        int key,
        short mod,
        short raw,
        boolean down,
        boolean repeat
    ) {
        type(type);
        reserved(reserved);
        timestamp(timestamp);
        windowID(windowID);
        which(which);
        scancode(scancode);
        key(key);
        mod(mod);
        raw(raw);
        down(down);
        repeat(repeat);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_KeyboardEvent set(SDL_KeyboardEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_KeyboardEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_KeyboardEvent malloc() {
        return new SDL_KeyboardEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_KeyboardEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_KeyboardEvent calloc() {
        return new SDL_KeyboardEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_KeyboardEvent} instance allocated with {@link BufferUtils}. */
    public static SDL_KeyboardEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_KeyboardEvent(memAddress(container), container);
    }

    /** Returns a new {@code SDL_KeyboardEvent} instance for the specified memory address. */
    public static SDL_KeyboardEvent create(long address) {
        return new SDL_KeyboardEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_KeyboardEvent createSafe(long address) {
        return address == NULL ? null : new SDL_KeyboardEvent(address, null);
    }

    /**
     * Returns a new {@link SDL_KeyboardEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_KeyboardEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_KeyboardEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_KeyboardEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_KeyboardEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_KeyboardEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_KeyboardEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_KeyboardEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_KeyboardEvent.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_KeyboardEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_KeyboardEvent malloc(MemoryStack stack) {
        return new SDL_KeyboardEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_KeyboardEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_KeyboardEvent calloc(MemoryStack stack) {
        return new SDL_KeyboardEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_KeyboardEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_KeyboardEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_KeyboardEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_KeyboardEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + SDL_KeyboardEvent.TYPE); }
    /** Unsafe version of {@link #reserved}. */
    public static int nreserved(long struct) { return memGetInt(struct + SDL_KeyboardEvent.RESERVED); }
    /** Unsafe version of {@link #timestamp}. */
    public static long ntimestamp(long struct) { return memGetLong(struct + SDL_KeyboardEvent.TIMESTAMP); }
    /** Unsafe version of {@link #windowID}. */
    public static int nwindowID(long struct) { return memGetInt(struct + SDL_KeyboardEvent.WINDOWID); }
    /** Unsafe version of {@link #which}. */
    public static int nwhich(long struct) { return memGetInt(struct + SDL_KeyboardEvent.WHICH); }
    /** Unsafe version of {@link #scancode}. */
    public static int nscancode(long struct) { return memGetInt(struct + SDL_KeyboardEvent.SCANCODE); }
    /** Unsafe version of {@link #key}. */
    public static int nkey(long struct) { return memGetInt(struct + SDL_KeyboardEvent.KEY); }
    /** Unsafe version of {@link #mod}. */
    public static short nmod(long struct) { return memGetShort(struct + SDL_KeyboardEvent.MOD); }
    /** Unsafe version of {@link #raw}. */
    public static short nraw(long struct) { return memGetShort(struct + SDL_KeyboardEvent.RAW); }
    /** Unsafe version of {@link #down}. */
    public static boolean ndown(long struct) { return memGetByte(struct + SDL_KeyboardEvent.DOWN) != 0; }
    /** Unsafe version of {@link #repeat}. */
    public static boolean nrepeat(long struct) { return memGetByte(struct + SDL_KeyboardEvent.REPEAT) != 0; }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + SDL_KeyboardEvent.TYPE, value); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static void nreserved(long struct, int value) { memPutInt(struct + SDL_KeyboardEvent.RESERVED, value); }
    /** Unsafe version of {@link #timestamp(long) timestamp}. */
    public static void ntimestamp(long struct, long value) { memPutLong(struct + SDL_KeyboardEvent.TIMESTAMP, value); }
    /** Unsafe version of {@link #windowID(int) windowID}. */
    public static void nwindowID(long struct, int value) { memPutInt(struct + SDL_KeyboardEvent.WINDOWID, value); }
    /** Unsafe version of {@link #which(int) which}. */
    public static void nwhich(long struct, int value) { memPutInt(struct + SDL_KeyboardEvent.WHICH, value); }
    /** Unsafe version of {@link #scancode(int) scancode}. */
    public static void nscancode(long struct, int value) { memPutInt(struct + SDL_KeyboardEvent.SCANCODE, value); }
    /** Unsafe version of {@link #key(int) key}. */
    public static void nkey(long struct, int value) { memPutInt(struct + SDL_KeyboardEvent.KEY, value); }
    /** Unsafe version of {@link #mod(short) mod}. */
    public static void nmod(long struct, short value) { memPutShort(struct + SDL_KeyboardEvent.MOD, value); }
    /** Unsafe version of {@link #raw(short) raw}. */
    public static void nraw(long struct, short value) { memPutShort(struct + SDL_KeyboardEvent.RAW, value); }
    /** Unsafe version of {@link #down(boolean) down}. */
    public static void ndown(long struct, boolean value) { memPutByte(struct + SDL_KeyboardEvent.DOWN, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #repeat(boolean) repeat}. */
    public static void nrepeat(long struct, boolean value) { memPutByte(struct + SDL_KeyboardEvent.REPEAT, value ? (byte)1 : (byte)0); }

    // -----------------------------------

    /** An array of {@link SDL_KeyboardEvent} structs. */
    public static class Buffer extends StructBuffer<SDL_KeyboardEvent, Buffer> implements NativeResource {

        private static final SDL_KeyboardEvent ELEMENT_FACTORY = SDL_KeyboardEvent.create(-1L);

        /**
         * Creates a new {@code SDL_KeyboardEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_KeyboardEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_KeyboardEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("SDL_EventType")
        public int type() { return SDL_KeyboardEvent.ntype(address()); }
        /** @return the value of the {@code reserved} field. */
        @NativeType("Uint32")
        public int reserved() { return SDL_KeyboardEvent.nreserved(address()); }
        /** @return the value of the {@code timestamp} field. */
        @NativeType("Uint64")
        public long timestamp() { return SDL_KeyboardEvent.ntimestamp(address()); }
        /** @return the value of the {@code windowID} field. */
        @NativeType("SDL_WindowID")
        public int windowID() { return SDL_KeyboardEvent.nwindowID(address()); }
        /** @return the value of the {@code which} field. */
        @NativeType("SDL_KeyboardID")
        public int which() { return SDL_KeyboardEvent.nwhich(address()); }
        /** @return the value of the {@code scancode} field. */
        @NativeType("SDL_Scancode")
        public int scancode() { return SDL_KeyboardEvent.nscancode(address()); }
        /** @return the value of the {@code key} field. */
        @NativeType("SDL_Keycode")
        public int key() { return SDL_KeyboardEvent.nkey(address()); }
        /** @return the value of the {@code mod} field. */
        @NativeType("SDL_Keymod")
        public short mod() { return SDL_KeyboardEvent.nmod(address()); }
        /** @return the value of the {@code raw} field. */
        @NativeType("Uint16")
        public short raw() { return SDL_KeyboardEvent.nraw(address()); }
        /** @return the value of the {@code down} field. */
        @NativeType("bool")
        public boolean down() { return SDL_KeyboardEvent.ndown(address()); }
        /** @return the value of the {@code repeat} field. */
        @NativeType("bool")
        public boolean repeat() { return SDL_KeyboardEvent.nrepeat(address()); }

        /** Sets the specified value to the {@code type} field. */
        public SDL_KeyboardEvent.Buffer type(@NativeType("SDL_EventType") int value) { SDL_KeyboardEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code reserved} field. */
        public SDL_KeyboardEvent.Buffer reserved(@NativeType("Uint32") int value) { SDL_KeyboardEvent.nreserved(address(), value); return this; }
        /** Sets the specified value to the {@code timestamp} field. */
        public SDL_KeyboardEvent.Buffer timestamp(@NativeType("Uint64") long value) { SDL_KeyboardEvent.ntimestamp(address(), value); return this; }
        /** Sets the specified value to the {@code windowID} field. */
        public SDL_KeyboardEvent.Buffer windowID(@NativeType("SDL_WindowID") int value) { SDL_KeyboardEvent.nwindowID(address(), value); return this; }
        /** Sets the specified value to the {@code which} field. */
        public SDL_KeyboardEvent.Buffer which(@NativeType("SDL_KeyboardID") int value) { SDL_KeyboardEvent.nwhich(address(), value); return this; }
        /** Sets the specified value to the {@code scancode} field. */
        public SDL_KeyboardEvent.Buffer scancode(@NativeType("SDL_Scancode") int value) { SDL_KeyboardEvent.nscancode(address(), value); return this; }
        /** Sets the specified value to the {@code key} field. */
        public SDL_KeyboardEvent.Buffer key(@NativeType("SDL_Keycode") int value) { SDL_KeyboardEvent.nkey(address(), value); return this; }
        /** Sets the specified value to the {@code mod} field. */
        public SDL_KeyboardEvent.Buffer mod(@NativeType("SDL_Keymod") short value) { SDL_KeyboardEvent.nmod(address(), value); return this; }
        /** Sets the specified value to the {@code raw} field. */
        public SDL_KeyboardEvent.Buffer raw(@NativeType("Uint16") short value) { SDL_KeyboardEvent.nraw(address(), value); return this; }
        /** Sets the specified value to the {@code down} field. */
        public SDL_KeyboardEvent.Buffer down(@NativeType("bool") boolean value) { SDL_KeyboardEvent.ndown(address(), value); return this; }
        /** Sets the specified value to the {@code repeat} field. */
        public SDL_KeyboardEvent.Buffer repeat(@NativeType("bool") boolean value) { SDL_KeyboardEvent.nrepeat(address(), value); return this; }

    }

}