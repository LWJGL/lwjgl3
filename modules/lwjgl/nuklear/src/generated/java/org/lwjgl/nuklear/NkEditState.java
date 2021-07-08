/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct nk_edit_state {
 *     nk_hash name;
 *     unsigned int seq;
 *     unsigned int old;
 *     int active;
 *     int prev;
 *     int cursor;
 *     int sel_start;
 *     int sel_end;
 *     {@link NkScroll struct nk_scroll} scrollbar;
 *     unsigned char mode;
 *     bool single_line;
 * }</code></pre>
 */
@NativeType("struct nk_edit_state")
public class NkEditState extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NAME,
        SEQ,
        OLD,
        ACTIVE,
        PREV,
        CURSOR,
        SEL_START,
        SEL_END,
        SCROLLBAR,
        MODE,
        SINGLE_LINE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(NkScroll.SIZEOF, NkScroll.ALIGNOF),
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NAME = layout.offsetof(0);
        SEQ = layout.offsetof(1);
        OLD = layout.offsetof(2);
        ACTIVE = layout.offsetof(3);
        PREV = layout.offsetof(4);
        CURSOR = layout.offsetof(5);
        SEL_START = layout.offsetof(6);
        SEL_END = layout.offsetof(7);
        SCROLLBAR = layout.offsetof(8);
        MODE = layout.offsetof(9);
        SINGLE_LINE = layout.offsetof(10);
    }

    /**
     * Creates a {@code NkEditState} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkEditState(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code name} field. */
    @NativeType("nk_hash")
    public int name() { return nname(address()); }
    /** @return the value of the {@code seq} field. */
    @NativeType("unsigned int")
    public int seq() { return nseq(address()); }
    /** @return the value of the {@code old} field. */
    @NativeType("unsigned int")
    public int old() { return nold(address()); }
    /** @return the value of the {@code active} field. */
    public int active() { return nactive(address()); }
    /** @return the value of the {@code prev} field. */
    public int prev() { return nprev(address()); }
    /** @return the value of the {@code cursor} field. */
    public int cursor() { return ncursor(address()); }
    /** @return the value of the {@code sel_start} field. */
    public int sel_start() { return nsel_start(address()); }
    /** @return the value of the {@code sel_end} field. */
    public int sel_end() { return nsel_end(address()); }
    /** @return a {@link NkScroll} view of the {@code scrollbar} field. */
    @NativeType("struct nk_scroll")
    public NkScroll scrollbar() { return nscrollbar(address()); }
    /** @return the value of the {@code mode} field. */
    @NativeType("unsigned char")
    public byte mode() { return nmode(address()); }
    /** @return the value of the {@code single_line} field. */
    @NativeType("bool")
    public boolean single_line() { return nsingle_line(address()); }

    // -----------------------------------

    /** Returns a new {@code NkEditState} instance for the specified memory address. */
    public static NkEditState create(long address) {
        return wrap(NkEditState.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkEditState createSafe(long address) {
        return address == NULL ? null : wrap(NkEditState.class, address);
    }

    /**
     * Create a {@link NkEditState.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkEditState.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkEditState.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #name}. */
    public static int nname(long struct) { return UNSAFE.getInt(null, struct + NkEditState.NAME); }
    /** Unsafe version of {@link #seq}. */
    public static int nseq(long struct) { return UNSAFE.getInt(null, struct + NkEditState.SEQ); }
    /** Unsafe version of {@link #old}. */
    public static int nold(long struct) { return UNSAFE.getInt(null, struct + NkEditState.OLD); }
    /** Unsafe version of {@link #active}. */
    public static int nactive(long struct) { return UNSAFE.getInt(null, struct + NkEditState.ACTIVE); }
    /** Unsafe version of {@link #prev}. */
    public static int nprev(long struct) { return UNSAFE.getInt(null, struct + NkEditState.PREV); }
    /** Unsafe version of {@link #cursor}. */
    public static int ncursor(long struct) { return UNSAFE.getInt(null, struct + NkEditState.CURSOR); }
    /** Unsafe version of {@link #sel_start}. */
    public static int nsel_start(long struct) { return UNSAFE.getInt(null, struct + NkEditState.SEL_START); }
    /** Unsafe version of {@link #sel_end}. */
    public static int nsel_end(long struct) { return UNSAFE.getInt(null, struct + NkEditState.SEL_END); }
    /** Unsafe version of {@link #scrollbar}. */
    public static NkScroll nscrollbar(long struct) { return NkScroll.create(struct + NkEditState.SCROLLBAR); }
    /** Unsafe version of {@link #mode}. */
    public static byte nmode(long struct) { return UNSAFE.getByte(null, struct + NkEditState.MODE); }
    /** Unsafe version of {@link #single_line}. */
    public static boolean nsingle_line(long struct) { return UNSAFE.getByte(null, struct + NkEditState.SINGLE_LINE) != 0; }

    // -----------------------------------

    /** An array of {@link NkEditState} structs. */
    public static class Buffer extends StructBuffer<NkEditState, Buffer> {

        private static final NkEditState ELEMENT_FACTORY = NkEditState.create(-1L);

        /**
         * Creates a new {@code NkEditState.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkEditState#SIZEOF}, and its mark will be undefined.
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
        protected NkEditState getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code name} field. */
        @NativeType("nk_hash")
        public int name() { return NkEditState.nname(address()); }
        /** @return the value of the {@code seq} field. */
        @NativeType("unsigned int")
        public int seq() { return NkEditState.nseq(address()); }
        /** @return the value of the {@code old} field. */
        @NativeType("unsigned int")
        public int old() { return NkEditState.nold(address()); }
        /** @return the value of the {@code active} field. */
        public int active() { return NkEditState.nactive(address()); }
        /** @return the value of the {@code prev} field. */
        public int prev() { return NkEditState.nprev(address()); }
        /** @return the value of the {@code cursor} field. */
        public int cursor() { return NkEditState.ncursor(address()); }
        /** @return the value of the {@code sel_start} field. */
        public int sel_start() { return NkEditState.nsel_start(address()); }
        /** @return the value of the {@code sel_end} field. */
        public int sel_end() { return NkEditState.nsel_end(address()); }
        /** @return a {@link NkScroll} view of the {@code scrollbar} field. */
        @NativeType("struct nk_scroll")
        public NkScroll scrollbar() { return NkEditState.nscrollbar(address()); }
        /** @return the value of the {@code mode} field. */
        @NativeType("unsigned char")
        public byte mode() { return NkEditState.nmode(address()); }
        /** @return the value of the {@code single_line} field. */
        @NativeType("bool")
        public boolean single_line() { return NkEditState.nsingle_line(address()); }

    }

}