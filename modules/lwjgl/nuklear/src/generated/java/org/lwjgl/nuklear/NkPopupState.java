/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.nuklear.Nuklear.*;

/**
 * <pre>{@code
 * struct nk_popup_state {
 *     {@link NkWindow struct nk_window} * win;
 *     enum nk_panel_type type;
 *     {@link NkPopupBuffer struct nk_popup_buffer} buf;
 *     nk_hash name;
 *     nk_bool active;
 *     unsigned combo_count;
 *     unsigned con_count;
 *     unsigned con_old;
 *     unsigned active_con;
 *     {@link NkRect struct nk_rect} header;
 * }}</pre>
 */
@NativeType("struct nk_popup_state")
public class NkPopupState extends Struct<NkPopupState> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        WIN,
        TYPE,
        BUF,
        NAME,
        ACTIVE,
        COMBO_COUNT,
        CON_COUNT,
        CON_OLD,
        ACTIVE_CON,
        HEADER;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(NkPopupBuffer.SIZEOF, NkPopupBuffer.ALIGNOF),
            __member(4),
            __member(1),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(NkRect.SIZEOF, NkRect.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        WIN = layout.offsetof(0);
        TYPE = layout.offsetof(1);
        BUF = layout.offsetof(2);
        NAME = layout.offsetof(3);
        ACTIVE = layout.offsetof(4);
        COMBO_COUNT = layout.offsetof(5);
        CON_COUNT = layout.offsetof(6);
        CON_OLD = layout.offsetof(7);
        ACTIVE_CON = layout.offsetof(8);
        HEADER = layout.offsetof(9);
    }

    protected NkPopupState(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NkPopupState create(long address, @Nullable ByteBuffer container) {
        return new NkPopupState(address, container);
    }

    /**
     * Creates a {@code NkPopupState} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkPopupState(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link NkWindow} view of the struct pointed to by the {@code win} field. */
    @NativeType("struct nk_window *")
    public NkWindow win() { return nwin(address()); }
    /** @return the value of the {@code type} field. */
    @NativeType("enum nk_panel_type")
    public int type() { return ntype(address()); }
    /** @return a {@link NkPopupBuffer} view of the {@code buf} field. */
    @NativeType("struct nk_popup_buffer")
    public NkPopupBuffer buf() { return nbuf(address()); }
    /** @return the value of the {@code name} field. */
    @NativeType("nk_hash")
    public int name() { return nname(address()); }
    /** @return the value of the {@code active} field. */
    @NativeType("nk_bool")
    public boolean active() { return nactive(address()); }
    /** @return the value of the {@code combo_count} field. */
    @NativeType("unsigned")
    public int combo_count() { return ncombo_count(address()); }
    /** @return the value of the {@code con_count} field. */
    @NativeType("unsigned")
    public int con_count() { return ncon_count(address()); }
    /** @return the value of the {@code con_old} field. */
    @NativeType("unsigned")
    public int con_old() { return ncon_old(address()); }
    /** @return the value of the {@code active_con} field. */
    @NativeType("unsigned")
    public int active_con() { return nactive_con(address()); }
    /** @return a {@link NkRect} view of the {@code header} field. */
    @NativeType("struct nk_rect")
    public NkRect header() { return nheader(address()); }

    // -----------------------------------

    /** Returns a new {@code NkPopupState} instance for the specified memory address. */
    public static NkPopupState create(long address) {
        return new NkPopupState(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable NkPopupState createSafe(long address) {
        return address == NULL ? null : new NkPopupState(address, null);
    }

    /**
     * Create a {@link NkPopupState.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkPopupState.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static NkPopupState.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #win}. */
    public static NkWindow nwin(long struct) { return NkWindow.create(memGetAddress(struct + NkPopupState.WIN)); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + NkPopupState.TYPE); }
    /** Unsafe version of {@link #buf}. */
    public static NkPopupBuffer nbuf(long struct) { return NkPopupBuffer.create(struct + NkPopupState.BUF); }
    /** Unsafe version of {@link #name}. */
    public static int nname(long struct) { return memGetInt(struct + NkPopupState.NAME); }
    /** Unsafe version of {@link #active}. */
    public static boolean nactive(long struct) { return memGetByte(struct + NkPopupState.ACTIVE) != 0; }
    /** Unsafe version of {@link #combo_count}. */
    public static int ncombo_count(long struct) { return memGetInt(struct + NkPopupState.COMBO_COUNT); }
    /** Unsafe version of {@link #con_count}. */
    public static int ncon_count(long struct) { return memGetInt(struct + NkPopupState.CON_COUNT); }
    /** Unsafe version of {@link #con_old}. */
    public static int ncon_old(long struct) { return memGetInt(struct + NkPopupState.CON_OLD); }
    /** Unsafe version of {@link #active_con}. */
    public static int nactive_con(long struct) { return memGetInt(struct + NkPopupState.ACTIVE_CON); }
    /** Unsafe version of {@link #header}. */
    public static NkRect nheader(long struct) { return NkRect.create(struct + NkPopupState.HEADER); }

    // -----------------------------------

    /** An array of {@link NkPopupState} structs. */
    public static class Buffer extends StructBuffer<NkPopupState, Buffer> {

        private static final NkPopupState ELEMENT_FACTORY = NkPopupState.create(-1L);

        /**
         * Creates a new {@code NkPopupState.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkPopupState#SIZEOF}, and its mark will be undefined.</p>
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
        protected NkPopupState getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link NkWindow} view of the struct pointed to by the {@code win} field. */
        @NativeType("struct nk_window *")
        public NkWindow win() { return NkPopupState.nwin(address()); }
        /** @return the value of the {@code type} field. */
        @NativeType("enum nk_panel_type")
        public int type() { return NkPopupState.ntype(address()); }
        /** @return a {@link NkPopupBuffer} view of the {@code buf} field. */
        @NativeType("struct nk_popup_buffer")
        public NkPopupBuffer buf() { return NkPopupState.nbuf(address()); }
        /** @return the value of the {@code name} field. */
        @NativeType("nk_hash")
        public int name() { return NkPopupState.nname(address()); }
        /** @return the value of the {@code active} field. */
        @NativeType("nk_bool")
        public boolean active() { return NkPopupState.nactive(address()); }
        /** @return the value of the {@code combo_count} field. */
        @NativeType("unsigned")
        public int combo_count() { return NkPopupState.ncombo_count(address()); }
        /** @return the value of the {@code con_count} field. */
        @NativeType("unsigned")
        public int con_count() { return NkPopupState.ncon_count(address()); }
        /** @return the value of the {@code con_old} field. */
        @NativeType("unsigned")
        public int con_old() { return NkPopupState.ncon_old(address()); }
        /** @return the value of the {@code active_con} field. */
        @NativeType("unsigned")
        public int active_con() { return NkPopupState.nactive_con(address()); }
        /** @return a {@link NkRect} view of the {@code header} field. */
        @NativeType("struct nk_rect")
        public NkRect header() { return NkPopupState.nheader(address()); }

    }

}