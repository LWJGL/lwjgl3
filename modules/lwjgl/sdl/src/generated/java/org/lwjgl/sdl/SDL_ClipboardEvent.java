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
 * struct SDL_ClipboardEvent {
 *     SDL_EventType type;
 *     Uint32 reserved;
 *     Uint64 timestamp;
 *     bool owner;
 *     Sint32 num_mime_types;
 *     char const ** mime_types;
 * }}</pre>
 */
public class SDL_ClipboardEvent extends Struct<SDL_ClipboardEvent> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        RESERVED,
        TIMESTAMP,
        OWNER,
        NUM_MIME_TYPES,
        MIME_TYPES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(8),
            __member(1),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        RESERVED = layout.offsetof(1);
        TIMESTAMP = layout.offsetof(2);
        OWNER = layout.offsetof(3);
        NUM_MIME_TYPES = layout.offsetof(4);
        MIME_TYPES = layout.offsetof(5);
    }

    protected SDL_ClipboardEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_ClipboardEvent create(long address, @Nullable ByteBuffer container) {
        return new SDL_ClipboardEvent(address, container);
    }

    /**
     * Creates a {@code SDL_ClipboardEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_ClipboardEvent(ByteBuffer container) {
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
    /** @return the value of the {@code owner} field. */
    @NativeType("bool")
    public boolean owner() { return nowner(address()); }
    /** @return the value of the {@code num_mime_types} field. */
    @NativeType("Sint32")
    public int num_mime_types() { return nnum_mime_types(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code mime_types} field. */
    @NativeType("char const **")
    public @Nullable PointerBuffer mime_types() { return nmime_types(address()); }

    /** Sets the specified value to the {@code type} field. */
    public SDL_ClipboardEvent type(@NativeType("SDL_EventType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code reserved} field. */
    public SDL_ClipboardEvent reserved(@NativeType("Uint32") int value) { nreserved(address(), value); return this; }
    /** Sets the specified value to the {@code timestamp} field. */
    public SDL_ClipboardEvent timestamp(@NativeType("Uint64") long value) { ntimestamp(address(), value); return this; }
    /** Sets the specified value to the {@code owner} field. */
    public SDL_ClipboardEvent owner(@NativeType("bool") boolean value) { nowner(address(), value); return this; }
    /** Sets the specified value to the {@code num_mime_types} field. */
    public SDL_ClipboardEvent num_mime_types(@NativeType("Sint32") int value) { nnum_mime_types(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code mime_types} field. */
    public SDL_ClipboardEvent mime_types(@Nullable @NativeType("char const **") PointerBuffer value) { nmime_types(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_ClipboardEvent set(
        int type,
        int reserved,
        long timestamp,
        boolean owner,
        int num_mime_types,
        @Nullable PointerBuffer mime_types
    ) {
        type(type);
        reserved(reserved);
        timestamp(timestamp);
        owner(owner);
        num_mime_types(num_mime_types);
        mime_types(mime_types);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_ClipboardEvent set(SDL_ClipboardEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_ClipboardEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_ClipboardEvent malloc() {
        return new SDL_ClipboardEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_ClipboardEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_ClipboardEvent calloc() {
        return new SDL_ClipboardEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_ClipboardEvent} instance allocated with {@link BufferUtils}. */
    public static SDL_ClipboardEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_ClipboardEvent(memAddress(container), container);
    }

    /** Returns a new {@code SDL_ClipboardEvent} instance for the specified memory address. */
    public static SDL_ClipboardEvent create(long address) {
        return new SDL_ClipboardEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_ClipboardEvent createSafe(long address) {
        return address == NULL ? null : new SDL_ClipboardEvent(address, null);
    }

    /**
     * Returns a new {@link SDL_ClipboardEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_ClipboardEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_ClipboardEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_ClipboardEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_ClipboardEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_ClipboardEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_ClipboardEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_ClipboardEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_ClipboardEvent.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_ClipboardEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_ClipboardEvent malloc(MemoryStack stack) {
        return new SDL_ClipboardEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_ClipboardEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_ClipboardEvent calloc(MemoryStack stack) {
        return new SDL_ClipboardEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_ClipboardEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_ClipboardEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_ClipboardEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_ClipboardEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + SDL_ClipboardEvent.TYPE); }
    /** Unsafe version of {@link #reserved}. */
    public static int nreserved(long struct) { return memGetInt(struct + SDL_ClipboardEvent.RESERVED); }
    /** Unsafe version of {@link #timestamp}. */
    public static long ntimestamp(long struct) { return memGetLong(struct + SDL_ClipboardEvent.TIMESTAMP); }
    /** Unsafe version of {@link #owner}. */
    public static boolean nowner(long struct) { return memGetByte(struct + SDL_ClipboardEvent.OWNER) != 0; }
    /** Unsafe version of {@link #num_mime_types}. */
    public static int nnum_mime_types(long struct) { return memGetInt(struct + SDL_ClipboardEvent.NUM_MIME_TYPES); }
    /** Unsafe version of {@link #mime_types() mime_types}. */
    public static @Nullable PointerBuffer nmime_types(long struct) { return memPointerBufferSafe(memGetAddress(struct + SDL_ClipboardEvent.MIME_TYPES), nnum_mime_types(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + SDL_ClipboardEvent.TYPE, value); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static void nreserved(long struct, int value) { memPutInt(struct + SDL_ClipboardEvent.RESERVED, value); }
    /** Unsafe version of {@link #timestamp(long) timestamp}. */
    public static void ntimestamp(long struct, long value) { memPutLong(struct + SDL_ClipboardEvent.TIMESTAMP, value); }
    /** Unsafe version of {@link #owner(boolean) owner}. */
    public static void nowner(long struct, boolean value) { memPutByte(struct + SDL_ClipboardEvent.OWNER, value ? (byte)1 : (byte)0); }
    /** Sets the specified value to the {@code num_mime_types} field of the specified {@code struct}. */
    public static void nnum_mime_types(long struct, int value) { memPutInt(struct + SDL_ClipboardEvent.NUM_MIME_TYPES, value); }
    /** Unsafe version of {@link #mime_types(PointerBuffer) mime_types}. */
    public static void nmime_types(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + SDL_ClipboardEvent.MIME_TYPES, memAddressSafe(value)); nnum_mime_types(struct, value == null ? 0 : value.remaining()); }

    // -----------------------------------

    /** An array of {@link SDL_ClipboardEvent} structs. */
    public static class Buffer extends StructBuffer<SDL_ClipboardEvent, Buffer> implements NativeResource {

        private static final SDL_ClipboardEvent ELEMENT_FACTORY = SDL_ClipboardEvent.create(-1L);

        /**
         * Creates a new {@code SDL_ClipboardEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_ClipboardEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_ClipboardEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("SDL_EventType")
        public int type() { return SDL_ClipboardEvent.ntype(address()); }
        /** @return the value of the {@code reserved} field. */
        @NativeType("Uint32")
        public int reserved() { return SDL_ClipboardEvent.nreserved(address()); }
        /** @return the value of the {@code timestamp} field. */
        @NativeType("Uint64")
        public long timestamp() { return SDL_ClipboardEvent.ntimestamp(address()); }
        /** @return the value of the {@code owner} field. */
        @NativeType("bool")
        public boolean owner() { return SDL_ClipboardEvent.nowner(address()); }
        /** @return the value of the {@code num_mime_types} field. */
        @NativeType("Sint32")
        public int num_mime_types() { return SDL_ClipboardEvent.nnum_mime_types(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code mime_types} field. */
        @NativeType("char const **")
        public @Nullable PointerBuffer mime_types() { return SDL_ClipboardEvent.nmime_types(address()); }

        /** Sets the specified value to the {@code type} field. */
        public SDL_ClipboardEvent.Buffer type(@NativeType("SDL_EventType") int value) { SDL_ClipboardEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code reserved} field. */
        public SDL_ClipboardEvent.Buffer reserved(@NativeType("Uint32") int value) { SDL_ClipboardEvent.nreserved(address(), value); return this; }
        /** Sets the specified value to the {@code timestamp} field. */
        public SDL_ClipboardEvent.Buffer timestamp(@NativeType("Uint64") long value) { SDL_ClipboardEvent.ntimestamp(address(), value); return this; }
        /** Sets the specified value to the {@code owner} field. */
        public SDL_ClipboardEvent.Buffer owner(@NativeType("bool") boolean value) { SDL_ClipboardEvent.nowner(address(), value); return this; }
        /** Sets the specified value to the {@code num_mime_types} field. */
        public SDL_ClipboardEvent.Buffer num_mime_types(@NativeType("Sint32") int value) { SDL_ClipboardEvent.nnum_mime_types(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code mime_types} field. */
        public SDL_ClipboardEvent.Buffer mime_types(@Nullable @NativeType("char const **") PointerBuffer value) { SDL_ClipboardEvent.nmime_types(address(), value); return this; }

    }

}