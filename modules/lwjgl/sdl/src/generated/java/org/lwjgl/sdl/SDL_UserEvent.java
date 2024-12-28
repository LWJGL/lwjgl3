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
 * struct SDL_UserEvent {
 *     Uint32 type;
 *     Uint32 reserved;
 *     Uint64 timestamp;
 *     SDL_WindowID windowID;
 *     Sint32 code;
 *     void * data1;
 *     void * data2;
 * }}</pre>
 */
public class SDL_UserEvent extends Struct<SDL_UserEvent> implements NativeResource {

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
        CODE,
        DATA1,
        DATA2;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        RESERVED = layout.offsetof(1);
        TIMESTAMP = layout.offsetof(2);
        WINDOWID = layout.offsetof(3);
        CODE = layout.offsetof(4);
        DATA1 = layout.offsetof(5);
        DATA2 = layout.offsetof(6);
    }

    protected SDL_UserEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_UserEvent create(long address, @Nullable ByteBuffer container) {
        return new SDL_UserEvent(address, container);
    }

    /**
     * Creates a {@code SDL_UserEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_UserEvent(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("Uint32")
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
    /** @return the value of the {@code code} field. */
    @NativeType("Sint32")
    public int code() { return ncode(address()); }
    /** @return the value of the {@code data1} field. */
    @NativeType("void *")
    public long data1() { return ndata1(address()); }
    /** @return the value of the {@code data2} field. */
    @NativeType("void *")
    public long data2() { return ndata2(address()); }

    /** Sets the specified value to the {@code type} field. */
    public SDL_UserEvent type(@NativeType("Uint32") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code reserved} field. */
    public SDL_UserEvent reserved(@NativeType("Uint32") int value) { nreserved(address(), value); return this; }
    /** Sets the specified value to the {@code timestamp} field. */
    public SDL_UserEvent timestamp(@NativeType("Uint64") long value) { ntimestamp(address(), value); return this; }
    /** Sets the specified value to the {@code windowID} field. */
    public SDL_UserEvent windowID(@NativeType("SDL_WindowID") int value) { nwindowID(address(), value); return this; }
    /** Sets the specified value to the {@code code} field. */
    public SDL_UserEvent code(@NativeType("Sint32") int value) { ncode(address(), value); return this; }
    /** Sets the specified value to the {@code data1} field. */
    public SDL_UserEvent data1(@NativeType("void *") long value) { ndata1(address(), value); return this; }
    /** Sets the specified value to the {@code data2} field. */
    public SDL_UserEvent data2(@NativeType("void *") long value) { ndata2(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_UserEvent set(
        int type,
        int reserved,
        long timestamp,
        int windowID,
        int code,
        long data1,
        long data2
    ) {
        type(type);
        reserved(reserved);
        timestamp(timestamp);
        windowID(windowID);
        code(code);
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
    public SDL_UserEvent set(SDL_UserEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_UserEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_UserEvent malloc() {
        return new SDL_UserEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_UserEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_UserEvent calloc() {
        return new SDL_UserEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_UserEvent} instance allocated with {@link BufferUtils}. */
    public static SDL_UserEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_UserEvent(memAddress(container), container);
    }

    /** Returns a new {@code SDL_UserEvent} instance for the specified memory address. */
    public static SDL_UserEvent create(long address) {
        return new SDL_UserEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_UserEvent createSafe(long address) {
        return address == NULL ? null : new SDL_UserEvent(address, null);
    }

    /**
     * Returns a new {@link SDL_UserEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_UserEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_UserEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_UserEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_UserEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_UserEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_UserEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_UserEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_UserEvent.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_UserEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_UserEvent malloc(MemoryStack stack) {
        return new SDL_UserEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_UserEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_UserEvent calloc(MemoryStack stack) {
        return new SDL_UserEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_UserEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_UserEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_UserEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_UserEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + SDL_UserEvent.TYPE); }
    /** Unsafe version of {@link #reserved}. */
    public static int nreserved(long struct) { return memGetInt(struct + SDL_UserEvent.RESERVED); }
    /** Unsafe version of {@link #timestamp}. */
    public static long ntimestamp(long struct) { return memGetLong(struct + SDL_UserEvent.TIMESTAMP); }
    /** Unsafe version of {@link #windowID}. */
    public static int nwindowID(long struct) { return memGetInt(struct + SDL_UserEvent.WINDOWID); }
    /** Unsafe version of {@link #code}. */
    public static int ncode(long struct) { return memGetInt(struct + SDL_UserEvent.CODE); }
    /** Unsafe version of {@link #data1}. */
    public static long ndata1(long struct) { return memGetAddress(struct + SDL_UserEvent.DATA1); }
    /** Unsafe version of {@link #data2}. */
    public static long ndata2(long struct) { return memGetAddress(struct + SDL_UserEvent.DATA2); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + SDL_UserEvent.TYPE, value); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static void nreserved(long struct, int value) { memPutInt(struct + SDL_UserEvent.RESERVED, value); }
    /** Unsafe version of {@link #timestamp(long) timestamp}. */
    public static void ntimestamp(long struct, long value) { memPutLong(struct + SDL_UserEvent.TIMESTAMP, value); }
    /** Unsafe version of {@link #windowID(int) windowID}. */
    public static void nwindowID(long struct, int value) { memPutInt(struct + SDL_UserEvent.WINDOWID, value); }
    /** Unsafe version of {@link #code(int) code}. */
    public static void ncode(long struct, int value) { memPutInt(struct + SDL_UserEvent.CODE, value); }
    /** Unsafe version of {@link #data1(long) data1}. */
    public static void ndata1(long struct, long value) { memPutAddress(struct + SDL_UserEvent.DATA1, value); }
    /** Unsafe version of {@link #data2(long) data2}. */
    public static void ndata2(long struct, long value) { memPutAddress(struct + SDL_UserEvent.DATA2, value); }

    // -----------------------------------

    /** An array of {@link SDL_UserEvent} structs. */
    public static class Buffer extends StructBuffer<SDL_UserEvent, Buffer> implements NativeResource {

        private static final SDL_UserEvent ELEMENT_FACTORY = SDL_UserEvent.create(-1L);

        /**
         * Creates a new {@code SDL_UserEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_UserEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_UserEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("Uint32")
        public int type() { return SDL_UserEvent.ntype(address()); }
        /** @return the value of the {@code reserved} field. */
        @NativeType("Uint32")
        public int reserved() { return SDL_UserEvent.nreserved(address()); }
        /** @return the value of the {@code timestamp} field. */
        @NativeType("Uint64")
        public long timestamp() { return SDL_UserEvent.ntimestamp(address()); }
        /** @return the value of the {@code windowID} field. */
        @NativeType("SDL_WindowID")
        public int windowID() { return SDL_UserEvent.nwindowID(address()); }
        /** @return the value of the {@code code} field. */
        @NativeType("Sint32")
        public int code() { return SDL_UserEvent.ncode(address()); }
        /** @return the value of the {@code data1} field. */
        @NativeType("void *")
        public long data1() { return SDL_UserEvent.ndata1(address()); }
        /** @return the value of the {@code data2} field. */
        @NativeType("void *")
        public long data2() { return SDL_UserEvent.ndata2(address()); }

        /** Sets the specified value to the {@code type} field. */
        public SDL_UserEvent.Buffer type(@NativeType("Uint32") int value) { SDL_UserEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code reserved} field. */
        public SDL_UserEvent.Buffer reserved(@NativeType("Uint32") int value) { SDL_UserEvent.nreserved(address(), value); return this; }
        /** Sets the specified value to the {@code timestamp} field. */
        public SDL_UserEvent.Buffer timestamp(@NativeType("Uint64") long value) { SDL_UserEvent.ntimestamp(address(), value); return this; }
        /** Sets the specified value to the {@code windowID} field. */
        public SDL_UserEvent.Buffer windowID(@NativeType("SDL_WindowID") int value) { SDL_UserEvent.nwindowID(address(), value); return this; }
        /** Sets the specified value to the {@code code} field. */
        public SDL_UserEvent.Buffer code(@NativeType("Sint32") int value) { SDL_UserEvent.ncode(address(), value); return this; }
        /** Sets the specified value to the {@code data1} field. */
        public SDL_UserEvent.Buffer data1(@NativeType("void *") long value) { SDL_UserEvent.ndata1(address(), value); return this; }
        /** Sets the specified value to the {@code data2} field. */
        public SDL_UserEvent.Buffer data2(@NativeType("void *") long value) { SDL_UserEvent.ndata2(address(), value); return this; }

    }

}