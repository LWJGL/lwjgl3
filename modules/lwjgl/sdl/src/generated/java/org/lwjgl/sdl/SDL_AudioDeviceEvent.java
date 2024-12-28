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
 * struct SDL_AudioDeviceEvent {
 *     SDL_EventType type;
 *     Uint32 reserved;
 *     Uint64 timestamp;
 *     SDL_AudioDeviceID which;
 *     bool recording;
 *     Uint8 padding1;
 *     Uint8 padding2;
 *     Uint8 padding3;
 * }}</pre>
 */
public class SDL_AudioDeviceEvent extends Struct<SDL_AudioDeviceEvent> implements NativeResource {

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
        RECORDING,
        PADDING1,
        PADDING2,
        PADDING3;

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
        RECORDING = layout.offsetof(4);
        PADDING1 = layout.offsetof(5);
        PADDING2 = layout.offsetof(6);
        PADDING3 = layout.offsetof(7);
    }

    protected SDL_AudioDeviceEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_AudioDeviceEvent create(long address, @Nullable ByteBuffer container) {
        return new SDL_AudioDeviceEvent(address, container);
    }

    /**
     * Creates a {@code SDL_AudioDeviceEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_AudioDeviceEvent(ByteBuffer container) {
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
    @NativeType("SDL_AudioDeviceID")
    public int which() { return nwhich(address()); }
    /** @return the value of the {@code recording} field. */
    @NativeType("bool")
    public boolean recording() { return nrecording(address()); }

    /** Sets the specified value to the {@code type} field. */
    public SDL_AudioDeviceEvent type(@NativeType("SDL_EventType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code reserved} field. */
    public SDL_AudioDeviceEvent reserved(@NativeType("Uint32") int value) { nreserved(address(), value); return this; }
    /** Sets the specified value to the {@code timestamp} field. */
    public SDL_AudioDeviceEvent timestamp(@NativeType("Uint64") long value) { ntimestamp(address(), value); return this; }
    /** Sets the specified value to the {@code which} field. */
    public SDL_AudioDeviceEvent which(@NativeType("SDL_AudioDeviceID") int value) { nwhich(address(), value); return this; }
    /** Sets the specified value to the {@code recording} field. */
    public SDL_AudioDeviceEvent recording(@NativeType("bool") boolean value) { nrecording(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_AudioDeviceEvent set(
        int type,
        int reserved,
        long timestamp,
        int which,
        boolean recording
    ) {
        type(type);
        reserved(reserved);
        timestamp(timestamp);
        which(which);
        recording(recording);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_AudioDeviceEvent set(SDL_AudioDeviceEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_AudioDeviceEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_AudioDeviceEvent malloc() {
        return new SDL_AudioDeviceEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_AudioDeviceEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_AudioDeviceEvent calloc() {
        return new SDL_AudioDeviceEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_AudioDeviceEvent} instance allocated with {@link BufferUtils}. */
    public static SDL_AudioDeviceEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_AudioDeviceEvent(memAddress(container), container);
    }

    /** Returns a new {@code SDL_AudioDeviceEvent} instance for the specified memory address. */
    public static SDL_AudioDeviceEvent create(long address) {
        return new SDL_AudioDeviceEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_AudioDeviceEvent createSafe(long address) {
        return address == NULL ? null : new SDL_AudioDeviceEvent(address, null);
    }

    /**
     * Returns a new {@link SDL_AudioDeviceEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_AudioDeviceEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_AudioDeviceEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_AudioDeviceEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_AudioDeviceEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_AudioDeviceEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_AudioDeviceEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_AudioDeviceEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_AudioDeviceEvent.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_AudioDeviceEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_AudioDeviceEvent malloc(MemoryStack stack) {
        return new SDL_AudioDeviceEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_AudioDeviceEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_AudioDeviceEvent calloc(MemoryStack stack) {
        return new SDL_AudioDeviceEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_AudioDeviceEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_AudioDeviceEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_AudioDeviceEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_AudioDeviceEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + SDL_AudioDeviceEvent.TYPE); }
    /** Unsafe version of {@link #reserved}. */
    public static int nreserved(long struct) { return memGetInt(struct + SDL_AudioDeviceEvent.RESERVED); }
    /** Unsafe version of {@link #timestamp}. */
    public static long ntimestamp(long struct) { return memGetLong(struct + SDL_AudioDeviceEvent.TIMESTAMP); }
    /** Unsafe version of {@link #which}. */
    public static int nwhich(long struct) { return memGetInt(struct + SDL_AudioDeviceEvent.WHICH); }
    /** Unsafe version of {@link #recording}. */
    public static boolean nrecording(long struct) { return memGetByte(struct + SDL_AudioDeviceEvent.RECORDING) != 0; }
    public static byte npadding1(long struct) { return memGetByte(struct + SDL_AudioDeviceEvent.PADDING1); }
    public static byte npadding2(long struct) { return memGetByte(struct + SDL_AudioDeviceEvent.PADDING2); }
    public static byte npadding3(long struct) { return memGetByte(struct + SDL_AudioDeviceEvent.PADDING3); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + SDL_AudioDeviceEvent.TYPE, value); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static void nreserved(long struct, int value) { memPutInt(struct + SDL_AudioDeviceEvent.RESERVED, value); }
    /** Unsafe version of {@link #timestamp(long) timestamp}. */
    public static void ntimestamp(long struct, long value) { memPutLong(struct + SDL_AudioDeviceEvent.TIMESTAMP, value); }
    /** Unsafe version of {@link #which(int) which}. */
    public static void nwhich(long struct, int value) { memPutInt(struct + SDL_AudioDeviceEvent.WHICH, value); }
    /** Unsafe version of {@link #recording(boolean) recording}. */
    public static void nrecording(long struct, boolean value) { memPutByte(struct + SDL_AudioDeviceEvent.RECORDING, value ? (byte)1 : (byte)0); }
    public static void npadding1(long struct, byte value) { memPutByte(struct + SDL_AudioDeviceEvent.PADDING1, value); }
    public static void npadding2(long struct, byte value) { memPutByte(struct + SDL_AudioDeviceEvent.PADDING2, value); }
    public static void npadding3(long struct, byte value) { memPutByte(struct + SDL_AudioDeviceEvent.PADDING3, value); }

    // -----------------------------------

    /** An array of {@link SDL_AudioDeviceEvent} structs. */
    public static class Buffer extends StructBuffer<SDL_AudioDeviceEvent, Buffer> implements NativeResource {

        private static final SDL_AudioDeviceEvent ELEMENT_FACTORY = SDL_AudioDeviceEvent.create(-1L);

        /**
         * Creates a new {@code SDL_AudioDeviceEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_AudioDeviceEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_AudioDeviceEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("SDL_EventType")
        public int type() { return SDL_AudioDeviceEvent.ntype(address()); }
        /** @return the value of the {@code reserved} field. */
        @NativeType("Uint32")
        public int reserved() { return SDL_AudioDeviceEvent.nreserved(address()); }
        /** @return the value of the {@code timestamp} field. */
        @NativeType("Uint64")
        public long timestamp() { return SDL_AudioDeviceEvent.ntimestamp(address()); }
        /** @return the value of the {@code which} field. */
        @NativeType("SDL_AudioDeviceID")
        public int which() { return SDL_AudioDeviceEvent.nwhich(address()); }
        /** @return the value of the {@code recording} field. */
        @NativeType("bool")
        public boolean recording() { return SDL_AudioDeviceEvent.nrecording(address()); }

        /** Sets the specified value to the {@code type} field. */
        public SDL_AudioDeviceEvent.Buffer type(@NativeType("SDL_EventType") int value) { SDL_AudioDeviceEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code reserved} field. */
        public SDL_AudioDeviceEvent.Buffer reserved(@NativeType("Uint32") int value) { SDL_AudioDeviceEvent.nreserved(address(), value); return this; }
        /** Sets the specified value to the {@code timestamp} field. */
        public SDL_AudioDeviceEvent.Buffer timestamp(@NativeType("Uint64") long value) { SDL_AudioDeviceEvent.ntimestamp(address(), value); return this; }
        /** Sets the specified value to the {@code which} field. */
        public SDL_AudioDeviceEvent.Buffer which(@NativeType("SDL_AudioDeviceID") int value) { SDL_AudioDeviceEvent.nwhich(address(), value); return this; }
        /** Sets the specified value to the {@code recording} field. */
        public SDL_AudioDeviceEvent.Buffer recording(@NativeType("bool") boolean value) { SDL_AudioDeviceEvent.nrecording(address(), value); return this; }

    }

}