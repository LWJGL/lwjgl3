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
 * struct SDL_DisplayEvent {
 *     SDL_EventType type;
 *     Uint32 reserved;
 *     Uint64 timestamp;
 *     SDL_DisplayID displayID;
 *     Sint32 data1;
 *     Sint32 data2;
 * }}</pre>
 */
public class SDL_DisplayEvent extends Struct<SDL_DisplayEvent> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        RESERVED,
        TIMESTAMP,
        DISPLAYID,
        DATA1,
        DATA2;

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
        DISPLAYID = layout.offsetof(3);
        DATA1 = layout.offsetof(4);
        DATA2 = layout.offsetof(5);
    }

    protected SDL_DisplayEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_DisplayEvent create(long address, @Nullable ByteBuffer container) {
        return new SDL_DisplayEvent(address, container);
    }

    /**
     * Creates a {@code SDL_DisplayEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_DisplayEvent(ByteBuffer container) {
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
    /** @return the value of the {@code displayID} field. */
    @NativeType("SDL_DisplayID")
    public int displayID() { return ndisplayID(address()); }
    /** @return the value of the {@code data1} field. */
    @NativeType("Sint32")
    public int data1() { return ndata1(address()); }
    /** @return the value of the {@code data2} field. */
    @NativeType("Sint32")
    public int data2() { return ndata2(address()); }

    /** Sets the specified value to the {@code type} field. */
    public SDL_DisplayEvent type(@NativeType("SDL_EventType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code reserved} field. */
    public SDL_DisplayEvent reserved(@NativeType("Uint32") int value) { nreserved(address(), value); return this; }
    /** Sets the specified value to the {@code timestamp} field. */
    public SDL_DisplayEvent timestamp(@NativeType("Uint64") long value) { ntimestamp(address(), value); return this; }
    /** Sets the specified value to the {@code displayID} field. */
    public SDL_DisplayEvent displayID(@NativeType("SDL_DisplayID") int value) { ndisplayID(address(), value); return this; }
    /** Sets the specified value to the {@code data1} field. */
    public SDL_DisplayEvent data1(@NativeType("Sint32") int value) { ndata1(address(), value); return this; }
    /** Sets the specified value to the {@code data2} field. */
    public SDL_DisplayEvent data2(@NativeType("Sint32") int value) { ndata2(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_DisplayEvent set(
        int type,
        int reserved,
        long timestamp,
        int displayID,
        int data1,
        int data2
    ) {
        type(type);
        reserved(reserved);
        timestamp(timestamp);
        displayID(displayID);
        data1(data1);
        data2(data2);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_DisplayEvent set(SDL_DisplayEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_DisplayEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_DisplayEvent malloc() {
        return new SDL_DisplayEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_DisplayEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_DisplayEvent calloc() {
        return new SDL_DisplayEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_DisplayEvent} instance allocated with {@link BufferUtils}. */
    public static SDL_DisplayEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_DisplayEvent(memAddress(container), container);
    }

    /** Returns a new {@code SDL_DisplayEvent} instance for the specified memory address. */
    public static SDL_DisplayEvent create(long address) {
        return new SDL_DisplayEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_DisplayEvent createSafe(long address) {
        return address == NULL ? null : new SDL_DisplayEvent(address, null);
    }

    /**
     * Returns a new {@link SDL_DisplayEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_DisplayEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_DisplayEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_DisplayEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_DisplayEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_DisplayEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_DisplayEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_DisplayEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_DisplayEvent.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_DisplayEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_DisplayEvent malloc(MemoryStack stack) {
        return new SDL_DisplayEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_DisplayEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_DisplayEvent calloc(MemoryStack stack) {
        return new SDL_DisplayEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_DisplayEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_DisplayEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_DisplayEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_DisplayEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + SDL_DisplayEvent.TYPE); }
    /** Unsafe version of {@link #reserved}. */
    public static int nreserved(long struct) { return memGetInt(struct + SDL_DisplayEvent.RESERVED); }
    /** Unsafe version of {@link #timestamp}. */
    public static long ntimestamp(long struct) { return memGetLong(struct + SDL_DisplayEvent.TIMESTAMP); }
    /** Unsafe version of {@link #displayID}. */
    public static int ndisplayID(long struct) { return memGetInt(struct + SDL_DisplayEvent.DISPLAYID); }
    /** Unsafe version of {@link #data1}. */
    public static int ndata1(long struct) { return memGetInt(struct + SDL_DisplayEvent.DATA1); }
    /** Unsafe version of {@link #data2}. */
    public static int ndata2(long struct) { return memGetInt(struct + SDL_DisplayEvent.DATA2); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + SDL_DisplayEvent.TYPE, value); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static void nreserved(long struct, int value) { memPutInt(struct + SDL_DisplayEvent.RESERVED, value); }
    /** Unsafe version of {@link #timestamp(long) timestamp}. */
    public static void ntimestamp(long struct, long value) { memPutLong(struct + SDL_DisplayEvent.TIMESTAMP, value); }
    /** Unsafe version of {@link #displayID(int) displayID}. */
    public static void ndisplayID(long struct, int value) { memPutInt(struct + SDL_DisplayEvent.DISPLAYID, value); }
    /** Unsafe version of {@link #data1(int) data1}. */
    public static void ndata1(long struct, int value) { memPutInt(struct + SDL_DisplayEvent.DATA1, value); }
    /** Unsafe version of {@link #data2(int) data2}. */
    public static void ndata2(long struct, int value) { memPutInt(struct + SDL_DisplayEvent.DATA2, value); }

    // -----------------------------------

    /** An array of {@link SDL_DisplayEvent} structs. */
    public static class Buffer extends StructBuffer<SDL_DisplayEvent, Buffer> implements NativeResource {

        private static final SDL_DisplayEvent ELEMENT_FACTORY = SDL_DisplayEvent.create(-1L);

        /**
         * Creates a new {@code SDL_DisplayEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_DisplayEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_DisplayEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("SDL_EventType")
        public int type() { return SDL_DisplayEvent.ntype(address()); }
        /** @return the value of the {@code reserved} field. */
        @NativeType("Uint32")
        public int reserved() { return SDL_DisplayEvent.nreserved(address()); }
        /** @return the value of the {@code timestamp} field. */
        @NativeType("Uint64")
        public long timestamp() { return SDL_DisplayEvent.ntimestamp(address()); }
        /** @return the value of the {@code displayID} field. */
        @NativeType("SDL_DisplayID")
        public int displayID() { return SDL_DisplayEvent.ndisplayID(address()); }
        /** @return the value of the {@code data1} field. */
        @NativeType("Sint32")
        public int data1() { return SDL_DisplayEvent.ndata1(address()); }
        /** @return the value of the {@code data2} field. */
        @NativeType("Sint32")
        public int data2() { return SDL_DisplayEvent.ndata2(address()); }

        /** Sets the specified value to the {@code type} field. */
        public SDL_DisplayEvent.Buffer type(@NativeType("SDL_EventType") int value) { SDL_DisplayEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code reserved} field. */
        public SDL_DisplayEvent.Buffer reserved(@NativeType("Uint32") int value) { SDL_DisplayEvent.nreserved(address(), value); return this; }
        /** Sets the specified value to the {@code timestamp} field. */
        public SDL_DisplayEvent.Buffer timestamp(@NativeType("Uint64") long value) { SDL_DisplayEvent.ntimestamp(address(), value); return this; }
        /** Sets the specified value to the {@code displayID} field. */
        public SDL_DisplayEvent.Buffer displayID(@NativeType("SDL_DisplayID") int value) { SDL_DisplayEvent.ndisplayID(address(), value); return this; }
        /** Sets the specified value to the {@code data1} field. */
        public SDL_DisplayEvent.Buffer data1(@NativeType("Sint32") int value) { SDL_DisplayEvent.ndata1(address(), value); return this; }
        /** Sets the specified value to the {@code data2} field. */
        public SDL_DisplayEvent.Buffer data2(@NativeType("Sint32") int value) { SDL_DisplayEvent.ndata2(address(), value); return this; }

    }

}