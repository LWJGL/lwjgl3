/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.nuklear.Nuklear.NK_MAX_NUMBER_BUFFER;

/**
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct nk_property_state {
 *     int active;
 *     int prev;
 *     char buffer[NK_MAX_NUMBER_BUFFER];
 *     int length;
 *     int cursor;
 *     int select_start;
 *     int select_end;
 *     nk_hash name;
 *     unsigned int seq;
 *     unsigned int old;
 *     int state;
 * }</pre></code>
 */
@NativeType("struct nk_property_state")
public class NkPropertyState extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ACTIVE,
        PREV,
        BUFFER,
        LENGTH,
        CURSOR,
        SELECT_START,
        SELECT_END,
        NAME,
        SEQ,
        OLD,
        STATE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __array(1, NK_MAX_NUMBER_BUFFER),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ACTIVE = layout.offsetof(0);
        PREV = layout.offsetof(1);
        BUFFER = layout.offsetof(2);
        LENGTH = layout.offsetof(3);
        CURSOR = layout.offsetof(4);
        SELECT_START = layout.offsetof(5);
        SELECT_END = layout.offsetof(6);
        NAME = layout.offsetof(7);
        SEQ = layout.offsetof(8);
        OLD = layout.offsetof(9);
        STATE = layout.offsetof(10);
    }

    NkPropertyState(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link NkPropertyState} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkPropertyState(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code active} field. */
    public int active() { return nactive(address()); }
    /** Returns the value of the {@code prev} field. */
    public int prev() { return nprev(address()); }
    /** Returns a {@link ByteBuffer} view of the {@code buffer} field. */
    @NativeType("char[NK_MAX_NUMBER_BUFFER]")
    public ByteBuffer buffer() { return nbuffer(address()); }
    /** Returns the value at the specified index of the {@code buffer} field. */
    @NativeType("char")
    public byte buffer(int index) { return nbuffer(address(), index); }
    /** Returns the value of the {@code length} field. */
    public int length() { return nlength(address()); }
    /** Returns the value of the {@code cursor} field. */
    public int cursor() { return ncursor(address()); }
    /** Returns the value of the {@code select_start} field. */
    public int select_start() { return nselect_start(address()); }
    /** Returns the value of the {@code select_end} field. */
    public int select_end() { return nselect_end(address()); }
    /** Returns the value of the {@code name} field. */
    @NativeType("nk_hash")
    public int name() { return nname(address()); }
    /** Returns the value of the {@code seq} field. */
    @NativeType("unsigned int")
    public int seq() { return nseq(address()); }
    /** Returns the value of the {@code old} field. */
    @NativeType("unsigned int")
    public int old() { return nold(address()); }
    /** Returns the value of the {@code state} field. */
    public int state() { return nstate(address()); }

    // -----------------------------------

    /** Returns a new {@link NkPropertyState} instance for the specified memory address. */
    public static NkPropertyState create(long address) {
        return new NkPropertyState(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkPropertyState createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Create a {@link NkPropertyState.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkPropertyState.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkPropertyState.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #active}. */
    public static int nactive(long struct) { return memGetInt(struct + NkPropertyState.ACTIVE); }
    /** Unsafe version of {@link #prev}. */
    public static int nprev(long struct) { return memGetInt(struct + NkPropertyState.PREV); }
    /** Unsafe version of {@link #buffer}. */
    public static ByteBuffer nbuffer(long struct) { return memByteBuffer(struct + NkPropertyState.BUFFER, NK_MAX_NUMBER_BUFFER); }
    /** Unsafe version of {@link #buffer(int) buffer}. */
    public static byte nbuffer(long struct, int index) {
        return memGetByte(struct + NkPropertyState.BUFFER + check(index, NK_MAX_NUMBER_BUFFER) * 1);
    }
    /** Unsafe version of {@link #length}. */
    public static int nlength(long struct) { return memGetInt(struct + NkPropertyState.LENGTH); }
    /** Unsafe version of {@link #cursor}. */
    public static int ncursor(long struct) { return memGetInt(struct + NkPropertyState.CURSOR); }
    /** Unsafe version of {@link #select_start}. */
    public static int nselect_start(long struct) { return memGetInt(struct + NkPropertyState.SELECT_START); }
    /** Unsafe version of {@link #select_end}. */
    public static int nselect_end(long struct) { return memGetInt(struct + NkPropertyState.SELECT_END); }
    /** Unsafe version of {@link #name}. */
    public static int nname(long struct) { return memGetInt(struct + NkPropertyState.NAME); }
    /** Unsafe version of {@link #seq}. */
    public static int nseq(long struct) { return memGetInt(struct + NkPropertyState.SEQ); }
    /** Unsafe version of {@link #old}. */
    public static int nold(long struct) { return memGetInt(struct + NkPropertyState.OLD); }
    /** Unsafe version of {@link #state}. */
    public static int nstate(long struct) { return memGetInt(struct + NkPropertyState.STATE); }

    // -----------------------------------

    /** An array of {@link NkPropertyState} structs. */
    public static class Buffer extends StructBuffer<NkPropertyState, Buffer> {

        /**
         * Creates a new {@link NkPropertyState.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkPropertyState#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected NkPropertyState newInstance(long address) {
            return new NkPropertyState(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code active} field. */
        public int active() { return NkPropertyState.nactive(address()); }
        /** Returns the value of the {@code prev} field. */
        public int prev() { return NkPropertyState.nprev(address()); }
        /** Returns a {@link ByteBuffer} view of the {@code buffer} field. */
        @NativeType("char[NK_MAX_NUMBER_BUFFER]")
        public ByteBuffer buffer() { return NkPropertyState.nbuffer(address()); }
        /** Returns the value at the specified index of the {@code buffer} field. */
        @NativeType("char")
        public byte buffer(int index) { return NkPropertyState.nbuffer(address(), index); }
        /** Returns the value of the {@code length} field. */
        public int length() { return NkPropertyState.nlength(address()); }
        /** Returns the value of the {@code cursor} field. */
        public int cursor() { return NkPropertyState.ncursor(address()); }
        /** Returns the value of the {@code select_start} field. */
        public int select_start() { return NkPropertyState.nselect_start(address()); }
        /** Returns the value of the {@code select_end} field. */
        public int select_end() { return NkPropertyState.nselect_end(address()); }
        /** Returns the value of the {@code name} field. */
        @NativeType("nk_hash")
        public int name() { return NkPropertyState.nname(address()); }
        /** Returns the value of the {@code seq} field. */
        @NativeType("unsigned int")
        public int seq() { return NkPropertyState.nseq(address()); }
        /** Returns the value of the {@code old} field. */
        @NativeType("unsigned int")
        public int old() { return NkPropertyState.nold(address()); }
        /** Returns the value of the {@code state} field. */
        public int state() { return NkPropertyState.nstate(address()); }

    }

}