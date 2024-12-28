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
 * struct SDL_TextEditingCandidatesEvent {
 *     SDL_EventType type;
 *     Uint32 reserved;
 *     Uint64 timestamp;
 *     SDL_WindowID windowID;
 *     char const * const * candidates;
 *     Sint32 num_candidates;
 *     Sint32 selected_candidate;
 *     bool horizontal;
 *     Uint8 padding1;
 *     Uint8 padding2;
 *     Uint8 padding3;
 * }}</pre>
 */
public class SDL_TextEditingCandidatesEvent extends Struct<SDL_TextEditingCandidatesEvent> implements NativeResource {

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
        CANDIDATES,
        NUM_CANDIDATES,
        SELECTED_CANDIDATE,
        HORIZONTAL,
        PADDING1,
        PADDING2,
        PADDING3;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(8),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
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
        WINDOWID = layout.offsetof(3);
        CANDIDATES = layout.offsetof(4);
        NUM_CANDIDATES = layout.offsetof(5);
        SELECTED_CANDIDATE = layout.offsetof(6);
        HORIZONTAL = layout.offsetof(7);
        PADDING1 = layout.offsetof(8);
        PADDING2 = layout.offsetof(9);
        PADDING3 = layout.offsetof(10);
    }

    protected SDL_TextEditingCandidatesEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_TextEditingCandidatesEvent create(long address, @Nullable ByteBuffer container) {
        return new SDL_TextEditingCandidatesEvent(address, container);
    }

    /**
     * Creates a {@code SDL_TextEditingCandidatesEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_TextEditingCandidatesEvent(ByteBuffer container) {
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
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code candidates} field. */
    @NativeType("char const * const *")
    public @Nullable PointerBuffer candidates() { return ncandidates(address()); }
    /** @return the value of the {@code num_candidates} field. */
    @NativeType("Sint32")
    public int num_candidates() { return nnum_candidates(address()); }
    /** @return the value of the {@code selected_candidate} field. */
    @NativeType("Sint32")
    public int selected_candidate() { return nselected_candidate(address()); }
    /** @return the value of the {@code horizontal} field. */
    @NativeType("bool")
    public boolean horizontal() { return nhorizontal(address()); }

    /** Sets the specified value to the {@code type} field. */
    public SDL_TextEditingCandidatesEvent type(@NativeType("SDL_EventType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code reserved} field. */
    public SDL_TextEditingCandidatesEvent reserved(@NativeType("Uint32") int value) { nreserved(address(), value); return this; }
    /** Sets the specified value to the {@code timestamp} field. */
    public SDL_TextEditingCandidatesEvent timestamp(@NativeType("Uint64") long value) { ntimestamp(address(), value); return this; }
    /** Sets the specified value to the {@code windowID} field. */
    public SDL_TextEditingCandidatesEvent windowID(@NativeType("SDL_WindowID") int value) { nwindowID(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code candidates} field. */
    public SDL_TextEditingCandidatesEvent candidates(@Nullable @NativeType("char const * const *") PointerBuffer value) { ncandidates(address(), value); return this; }
    /** Sets the specified value to the {@code num_candidates} field. */
    public SDL_TextEditingCandidatesEvent num_candidates(@NativeType("Sint32") int value) { nnum_candidates(address(), value); return this; }
    /** Sets the specified value to the {@code selected_candidate} field. */
    public SDL_TextEditingCandidatesEvent selected_candidate(@NativeType("Sint32") int value) { nselected_candidate(address(), value); return this; }
    /** Sets the specified value to the {@code horizontal} field. */
    public SDL_TextEditingCandidatesEvent horizontal(@NativeType("bool") boolean value) { nhorizontal(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_TextEditingCandidatesEvent set(
        int type,
        int reserved,
        long timestamp,
        int windowID,
        @Nullable PointerBuffer candidates,
        int num_candidates,
        int selected_candidate,
        boolean horizontal
    ) {
        type(type);
        reserved(reserved);
        timestamp(timestamp);
        windowID(windowID);
        candidates(candidates);
        num_candidates(num_candidates);
        selected_candidate(selected_candidate);
        horizontal(horizontal);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_TextEditingCandidatesEvent set(SDL_TextEditingCandidatesEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_TextEditingCandidatesEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_TextEditingCandidatesEvent malloc() {
        return new SDL_TextEditingCandidatesEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_TextEditingCandidatesEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_TextEditingCandidatesEvent calloc() {
        return new SDL_TextEditingCandidatesEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_TextEditingCandidatesEvent} instance allocated with {@link BufferUtils}. */
    public static SDL_TextEditingCandidatesEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_TextEditingCandidatesEvent(memAddress(container), container);
    }

    /** Returns a new {@code SDL_TextEditingCandidatesEvent} instance for the specified memory address. */
    public static SDL_TextEditingCandidatesEvent create(long address) {
        return new SDL_TextEditingCandidatesEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_TextEditingCandidatesEvent createSafe(long address) {
        return address == NULL ? null : new SDL_TextEditingCandidatesEvent(address, null);
    }

    /**
     * Returns a new {@link SDL_TextEditingCandidatesEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_TextEditingCandidatesEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_TextEditingCandidatesEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_TextEditingCandidatesEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_TextEditingCandidatesEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_TextEditingCandidatesEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_TextEditingCandidatesEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_TextEditingCandidatesEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_TextEditingCandidatesEvent.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_TextEditingCandidatesEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_TextEditingCandidatesEvent malloc(MemoryStack stack) {
        return new SDL_TextEditingCandidatesEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_TextEditingCandidatesEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_TextEditingCandidatesEvent calloc(MemoryStack stack) {
        return new SDL_TextEditingCandidatesEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_TextEditingCandidatesEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_TextEditingCandidatesEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_TextEditingCandidatesEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_TextEditingCandidatesEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + SDL_TextEditingCandidatesEvent.TYPE); }
    /** Unsafe version of {@link #reserved}. */
    public static int nreserved(long struct) { return memGetInt(struct + SDL_TextEditingCandidatesEvent.RESERVED); }
    /** Unsafe version of {@link #timestamp}. */
    public static long ntimestamp(long struct) { return memGetLong(struct + SDL_TextEditingCandidatesEvent.TIMESTAMP); }
    /** Unsafe version of {@link #windowID}. */
    public static int nwindowID(long struct) { return memGetInt(struct + SDL_TextEditingCandidatesEvent.WINDOWID); }
    /** Unsafe version of {@link #candidates() candidates}. */
    public static @Nullable PointerBuffer ncandidates(long struct) { return memPointerBufferSafe(memGetAddress(struct + SDL_TextEditingCandidatesEvent.CANDIDATES), nnum_candidates(struct)); }
    /** Unsafe version of {@link #num_candidates}. */
    public static int nnum_candidates(long struct) { return memGetInt(struct + SDL_TextEditingCandidatesEvent.NUM_CANDIDATES); }
    /** Unsafe version of {@link #selected_candidate}. */
    public static int nselected_candidate(long struct) { return memGetInt(struct + SDL_TextEditingCandidatesEvent.SELECTED_CANDIDATE); }
    /** Unsafe version of {@link #horizontal}. */
    public static boolean nhorizontal(long struct) { return memGetByte(struct + SDL_TextEditingCandidatesEvent.HORIZONTAL) != 0; }
    public static byte npadding1(long struct) { return memGetByte(struct + SDL_TextEditingCandidatesEvent.PADDING1); }
    public static byte npadding2(long struct) { return memGetByte(struct + SDL_TextEditingCandidatesEvent.PADDING2); }
    public static byte npadding3(long struct) { return memGetByte(struct + SDL_TextEditingCandidatesEvent.PADDING3); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + SDL_TextEditingCandidatesEvent.TYPE, value); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static void nreserved(long struct, int value) { memPutInt(struct + SDL_TextEditingCandidatesEvent.RESERVED, value); }
    /** Unsafe version of {@link #timestamp(long) timestamp}. */
    public static void ntimestamp(long struct, long value) { memPutLong(struct + SDL_TextEditingCandidatesEvent.TIMESTAMP, value); }
    /** Unsafe version of {@link #windowID(int) windowID}. */
    public static void nwindowID(long struct, int value) { memPutInt(struct + SDL_TextEditingCandidatesEvent.WINDOWID, value); }
    /** Unsafe version of {@link #candidates(PointerBuffer) candidates}. */
    public static void ncandidates(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + SDL_TextEditingCandidatesEvent.CANDIDATES, memAddressSafe(value)); nnum_candidates(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code num_candidates} field of the specified {@code struct}. */
    public static void nnum_candidates(long struct, int value) { memPutInt(struct + SDL_TextEditingCandidatesEvent.NUM_CANDIDATES, value); }
    /** Unsafe version of {@link #selected_candidate(int) selected_candidate}. */
    public static void nselected_candidate(long struct, int value) { memPutInt(struct + SDL_TextEditingCandidatesEvent.SELECTED_CANDIDATE, value); }
    /** Unsafe version of {@link #horizontal(boolean) horizontal}. */
    public static void nhorizontal(long struct, boolean value) { memPutByte(struct + SDL_TextEditingCandidatesEvent.HORIZONTAL, value ? (byte)1 : (byte)0); }
    public static void npadding1(long struct, byte value) { memPutByte(struct + SDL_TextEditingCandidatesEvent.PADDING1, value); }
    public static void npadding2(long struct, byte value) { memPutByte(struct + SDL_TextEditingCandidatesEvent.PADDING2, value); }
    public static void npadding3(long struct, byte value) { memPutByte(struct + SDL_TextEditingCandidatesEvent.PADDING3, value); }

    // -----------------------------------

    /** An array of {@link SDL_TextEditingCandidatesEvent} structs. */
    public static class Buffer extends StructBuffer<SDL_TextEditingCandidatesEvent, Buffer> implements NativeResource {

        private static final SDL_TextEditingCandidatesEvent ELEMENT_FACTORY = SDL_TextEditingCandidatesEvent.create(-1L);

        /**
         * Creates a new {@code SDL_TextEditingCandidatesEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_TextEditingCandidatesEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_TextEditingCandidatesEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("SDL_EventType")
        public int type() { return SDL_TextEditingCandidatesEvent.ntype(address()); }
        /** @return the value of the {@code reserved} field. */
        @NativeType("Uint32")
        public int reserved() { return SDL_TextEditingCandidatesEvent.nreserved(address()); }
        /** @return the value of the {@code timestamp} field. */
        @NativeType("Uint64")
        public long timestamp() { return SDL_TextEditingCandidatesEvent.ntimestamp(address()); }
        /** @return the value of the {@code windowID} field. */
        @NativeType("SDL_WindowID")
        public int windowID() { return SDL_TextEditingCandidatesEvent.nwindowID(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code candidates} field. */
        @NativeType("char const * const *")
        public @Nullable PointerBuffer candidates() { return SDL_TextEditingCandidatesEvent.ncandidates(address()); }
        /** @return the value of the {@code num_candidates} field. */
        @NativeType("Sint32")
        public int num_candidates() { return SDL_TextEditingCandidatesEvent.nnum_candidates(address()); }
        /** @return the value of the {@code selected_candidate} field. */
        @NativeType("Sint32")
        public int selected_candidate() { return SDL_TextEditingCandidatesEvent.nselected_candidate(address()); }
        /** @return the value of the {@code horizontal} field. */
        @NativeType("bool")
        public boolean horizontal() { return SDL_TextEditingCandidatesEvent.nhorizontal(address()); }

        /** Sets the specified value to the {@code type} field. */
        public SDL_TextEditingCandidatesEvent.Buffer type(@NativeType("SDL_EventType") int value) { SDL_TextEditingCandidatesEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code reserved} field. */
        public SDL_TextEditingCandidatesEvent.Buffer reserved(@NativeType("Uint32") int value) { SDL_TextEditingCandidatesEvent.nreserved(address(), value); return this; }
        /** Sets the specified value to the {@code timestamp} field. */
        public SDL_TextEditingCandidatesEvent.Buffer timestamp(@NativeType("Uint64") long value) { SDL_TextEditingCandidatesEvent.ntimestamp(address(), value); return this; }
        /** Sets the specified value to the {@code windowID} field. */
        public SDL_TextEditingCandidatesEvent.Buffer windowID(@NativeType("SDL_WindowID") int value) { SDL_TextEditingCandidatesEvent.nwindowID(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code candidates} field. */
        public SDL_TextEditingCandidatesEvent.Buffer candidates(@Nullable @NativeType("char const * const *") PointerBuffer value) { SDL_TextEditingCandidatesEvent.ncandidates(address(), value); return this; }
        /** Sets the specified value to the {@code num_candidates} field. */
        public SDL_TextEditingCandidatesEvent.Buffer num_candidates(@NativeType("Sint32") int value) { SDL_TextEditingCandidatesEvent.nnum_candidates(address(), value); return this; }
        /** Sets the specified value to the {@code selected_candidate} field. */
        public SDL_TextEditingCandidatesEvent.Buffer selected_candidate(@NativeType("Sint32") int value) { SDL_TextEditingCandidatesEvent.nselected_candidate(address(), value); return this; }
        /** Sets the specified value to the {@code horizontal} field. */
        public SDL_TextEditingCandidatesEvent.Buffer horizontal(@NativeType("bool") boolean value) { SDL_TextEditingCandidatesEvent.nhorizontal(address(), value); return this; }

    }

}