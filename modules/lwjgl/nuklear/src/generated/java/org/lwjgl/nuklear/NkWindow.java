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
 * struct nk_window {
 *     unsigned int seq;
 *     nk_hash name;
 *     char name_string[64];
 *     nk_flags flags;
 *     {@link NkRect struct nk_rect} bounds;
 *     {@link NkScroll struct nk_scroll} scrollbar;
 *     {@link NkCommandBuffer struct nk_command_buffer} buffer;
 *     {@link NkPanel struct nk_panel} * layout;
 *     float scrollbar_hiding_timer;
 *     {@link NkPropertyState struct nk_property_state} property;
 *     {@link NkPopupState struct nk_popup_state} popup;
 *     {@link NkEditState struct nk_edit_state} edit;
 *     unsigned int scrolled;
 *     struct nk_table * tables;
 *     unsigned int table_count;
 *     {@link NkWindow struct nk_window} * next;
 *     {@link NkWindow struct nk_window} * prev;
 *     {@link NkWindow struct nk_window} * parent;
 * }</code></pre>
 */
@NativeType("struct nk_window")
public class NkWindow extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SEQ,
        NAME,
        NAME_STRING,
        FLAGS,
        BOUNDS,
        SCROLLBAR,
        BUFFER,
        LAYOUT,
        SCROLLBAR_HIDING_TIMER,
        PROPERTY,
        POPUP,
        EDIT,
        SCROLLED,
        TABLES,
        TABLE_COUNT,
        NEXT,
        PREV,
        PARENT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __array(1, 64),
            __member(4),
            __member(NkRect.SIZEOF, NkRect.ALIGNOF),
            __member(NkScroll.SIZEOF, NkScroll.ALIGNOF),
            __member(NkCommandBuffer.SIZEOF, NkCommandBuffer.ALIGNOF),
            __member(POINTER_SIZE),
            __member(4),
            __member(NkPropertyState.SIZEOF, NkPropertyState.ALIGNOF),
            __member(NkPopupState.SIZEOF, NkPopupState.ALIGNOF),
            __member(NkEditState.SIZEOF, NkEditState.ALIGNOF),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SEQ = layout.offsetof(0);
        NAME = layout.offsetof(1);
        NAME_STRING = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
        BOUNDS = layout.offsetof(4);
        SCROLLBAR = layout.offsetof(5);
        BUFFER = layout.offsetof(6);
        LAYOUT = layout.offsetof(7);
        SCROLLBAR_HIDING_TIMER = layout.offsetof(8);
        PROPERTY = layout.offsetof(9);
        POPUP = layout.offsetof(10);
        EDIT = layout.offsetof(11);
        SCROLLED = layout.offsetof(12);
        TABLES = layout.offsetof(13);
        TABLE_COUNT = layout.offsetof(14);
        NEXT = layout.offsetof(15);
        PREV = layout.offsetof(16);
        PARENT = layout.offsetof(17);
    }

    /**
     * Creates a {@code NkWindow} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkWindow(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code seq} field. */
    @NativeType("unsigned int")
    public int seq() { return nseq(address()); }
    /** Returns the value of the {@code name} field. */
    @NativeType("nk_hash")
    public int name() { return nname(address()); }
    /** Returns a {@link ByteBuffer} view of the {@code name_string} field. */
    @NativeType("char[64]")
    public ByteBuffer name_string() { return nname_string(address()); }
    /** Decodes the null-terminated string stored in the {@code name_string} field. */
    @NativeType("char[64]")
    public String name_stringString() { return nname_stringString(address()); }
    /** Returns the value of the {@code flags} field. */
    @NativeType("nk_flags")
    public int flags() { return nflags(address()); }
    /** Returns a {@link NkRect} view of the {@code bounds} field. */
    @NativeType("struct nk_rect")
    public NkRect bounds() { return nbounds(address()); }
    /** Returns a {@link NkScroll} view of the {@code scrollbar} field. */
    @NativeType("struct nk_scroll")
    public NkScroll scrollbar() { return nscrollbar(address()); }
    /** Returns a {@link NkCommandBuffer} view of the {@code buffer} field. */
    @NativeType("struct nk_command_buffer")
    public NkCommandBuffer buffer() { return nbuffer(address()); }
    /** Returns a {@link NkPanel} view of the struct pointed to by the {@code layout} field. */
    @NativeType("struct nk_panel *")
    public NkPanel layout() { return nlayout(address()); }
    /** Returns the value of the {@code scrollbar_hiding_timer} field. */
    public float scrollbar_hiding_timer() { return nscrollbar_hiding_timer(address()); }
    /** Returns a {@link NkPropertyState} view of the {@code property} field. */
    @NativeType("struct nk_property_state")
    public NkPropertyState property() { return nproperty(address()); }
    /** Returns a {@link NkPopupState} view of the {@code popup} field. */
    @NativeType("struct nk_popup_state")
    public NkPopupState popup() { return npopup(address()); }
    /** Returns a {@link NkEditState} view of the {@code edit} field. */
    @NativeType("struct nk_edit_state")
    public NkEditState edit() { return nedit(address()); }
    /** Returns the value of the {@code scrolled} field. */
    @NativeType("unsigned int")
    public int scrolled() { return nscrolled(address()); }
    /** Returns the value of the {@code tables} field. */
    @NativeType("struct nk_table *")
    public long tables() { return ntables(address()); }
    /** Returns the value of the {@code table_count} field. */
    @NativeType("unsigned int")
    public int table_count() { return ntable_count(address()); }
    /** Returns a {@link NkWindow} view of the struct pointed to by the {@code next} field. */
    @NativeType("struct nk_window *")
    public NkWindow next() { return nnext(address()); }
    /** Returns a {@link NkWindow} view of the struct pointed to by the {@code prev} field. */
    @NativeType("struct nk_window *")
    public NkWindow prev() { return nprev(address()); }
    /** Returns a {@link NkWindow} view of the struct pointed to by the {@code parent} field. */
    @NativeType("struct nk_window *")
    public NkWindow parent() { return nparent(address()); }

    // -----------------------------------

    /** Returns a new {@code NkWindow} instance for the specified memory address. */
    public static NkWindow create(long address) {
        return wrap(NkWindow.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkWindow createSafe(long address) {
        return address == NULL ? null : wrap(NkWindow.class, address);
    }

    /**
     * Create a {@link NkWindow.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkWindow.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkWindow.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #seq}. */
    public static int nseq(long struct) { return UNSAFE.getInt(null, struct + NkWindow.SEQ); }
    /** Unsafe version of {@link #name}. */
    public static int nname(long struct) { return UNSAFE.getInt(null, struct + NkWindow.NAME); }
    /** Unsafe version of {@link #name_string}. */
    public static ByteBuffer nname_string(long struct) { return memByteBuffer(struct + NkWindow.NAME_STRING, 64); }
    /** Unsafe version of {@link #name_stringString}. */
    public static String nname_stringString(long struct) { return memUTF8(struct + NkWindow.NAME_STRING); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + NkWindow.FLAGS); }
    /** Unsafe version of {@link #bounds}. */
    public static NkRect nbounds(long struct) { return NkRect.create(struct + NkWindow.BOUNDS); }
    /** Unsafe version of {@link #scrollbar}. */
    public static NkScroll nscrollbar(long struct) { return NkScroll.create(struct + NkWindow.SCROLLBAR); }
    /** Unsafe version of {@link #buffer}. */
    public static NkCommandBuffer nbuffer(long struct) { return NkCommandBuffer.create(struct + NkWindow.BUFFER); }
    /** Unsafe version of {@link #layout}. */
    public static NkPanel nlayout(long struct) { return NkPanel.create(memGetAddress(struct + NkWindow.LAYOUT)); }
    /** Unsafe version of {@link #scrollbar_hiding_timer}. */
    public static float nscrollbar_hiding_timer(long struct) { return UNSAFE.getFloat(null, struct + NkWindow.SCROLLBAR_HIDING_TIMER); }
    /** Unsafe version of {@link #property}. */
    public static NkPropertyState nproperty(long struct) { return NkPropertyState.create(struct + NkWindow.PROPERTY); }
    /** Unsafe version of {@link #popup}. */
    public static NkPopupState npopup(long struct) { return NkPopupState.create(struct + NkWindow.POPUP); }
    /** Unsafe version of {@link #edit}. */
    public static NkEditState nedit(long struct) { return NkEditState.create(struct + NkWindow.EDIT); }
    /** Unsafe version of {@link #scrolled}. */
    public static int nscrolled(long struct) { return UNSAFE.getInt(null, struct + NkWindow.SCROLLED); }
    /** Unsafe version of {@link #tables}. */
    public static long ntables(long struct) { return memGetAddress(struct + NkWindow.TABLES); }
    /** Unsafe version of {@link #table_count}. */
    public static int ntable_count(long struct) { return UNSAFE.getInt(null, struct + NkWindow.TABLE_COUNT); }
    /** Unsafe version of {@link #next}. */
    public static NkWindow nnext(long struct) { return NkWindow.create(memGetAddress(struct + NkWindow.NEXT)); }
    /** Unsafe version of {@link #prev}. */
    public static NkWindow nprev(long struct) { return NkWindow.create(memGetAddress(struct + NkWindow.PREV)); }
    /** Unsafe version of {@link #parent}. */
    public static NkWindow nparent(long struct) { return NkWindow.create(memGetAddress(struct + NkWindow.PARENT)); }

    // -----------------------------------

    /** An array of {@link NkWindow} structs. */
    public static class Buffer extends StructBuffer<NkWindow, Buffer> {

        private static final NkWindow ELEMENT_FACTORY = NkWindow.create(-1L);

        /**
         * Creates a new {@code NkWindow.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkWindow#SIZEOF}, and its mark will be undefined.
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
        protected NkWindow getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code seq} field. */
        @NativeType("unsigned int")
        public int seq() { return NkWindow.nseq(address()); }
        /** Returns the value of the {@code name} field. */
        @NativeType("nk_hash")
        public int name() { return NkWindow.nname(address()); }
        /** Returns a {@link ByteBuffer} view of the {@code name_string} field. */
        @NativeType("char[64]")
        public ByteBuffer name_string() { return NkWindow.nname_string(address()); }
        /** Decodes the null-terminated string stored in the {@code name_string} field. */
        @NativeType("char[64]")
        public String name_stringString() { return NkWindow.nname_stringString(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("nk_flags")
        public int flags() { return NkWindow.nflags(address()); }
        /** Returns a {@link NkRect} view of the {@code bounds} field. */
        @NativeType("struct nk_rect")
        public NkRect bounds() { return NkWindow.nbounds(address()); }
        /** Returns a {@link NkScroll} view of the {@code scrollbar} field. */
        @NativeType("struct nk_scroll")
        public NkScroll scrollbar() { return NkWindow.nscrollbar(address()); }
        /** Returns a {@link NkCommandBuffer} view of the {@code buffer} field. */
        @NativeType("struct nk_command_buffer")
        public NkCommandBuffer buffer() { return NkWindow.nbuffer(address()); }
        /** Returns a {@link NkPanel} view of the struct pointed to by the {@code layout} field. */
        @NativeType("struct nk_panel *")
        public NkPanel layout() { return NkWindow.nlayout(address()); }
        /** Returns the value of the {@code scrollbar_hiding_timer} field. */
        public float scrollbar_hiding_timer() { return NkWindow.nscrollbar_hiding_timer(address()); }
        /** Returns a {@link NkPropertyState} view of the {@code property} field. */
        @NativeType("struct nk_property_state")
        public NkPropertyState property() { return NkWindow.nproperty(address()); }
        /** Returns a {@link NkPopupState} view of the {@code popup} field. */
        @NativeType("struct nk_popup_state")
        public NkPopupState popup() { return NkWindow.npopup(address()); }
        /** Returns a {@link NkEditState} view of the {@code edit} field. */
        @NativeType("struct nk_edit_state")
        public NkEditState edit() { return NkWindow.nedit(address()); }
        /** Returns the value of the {@code scrolled} field. */
        @NativeType("unsigned int")
        public int scrolled() { return NkWindow.nscrolled(address()); }
        /** Returns the value of the {@code tables} field. */
        @NativeType("struct nk_table *")
        public long tables() { return NkWindow.ntables(address()); }
        /** Returns the value of the {@code table_count} field. */
        @NativeType("unsigned int")
        public int table_count() { return NkWindow.ntable_count(address()); }
        /** Returns a {@link NkWindow} view of the struct pointed to by the {@code next} field. */
        @NativeType("struct nk_window *")
        public NkWindow next() { return NkWindow.nnext(address()); }
        /** Returns a {@link NkWindow} view of the struct pointed to by the {@code prev} field. */
        @NativeType("struct nk_window *")
        public NkWindow prev() { return NkWindow.nprev(address()); }
        /** Returns a {@link NkWindow} view of the struct pointed to by the {@code parent} field. */
        @NativeType("struct nk_window *")
        public NkWindow parent() { return NkWindow.nparent(address()); }

    }

}