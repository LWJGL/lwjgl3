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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code type} &ndash; one of:<br><table><tr><td>{@link Nuklear#NK_PANEL_NONE PANEL_NONE}</td><td>{@link Nuklear#NK_PANEL_WINDOW PANEL_WINDOW}</td><td>{@link Nuklear#NK_PANEL_GROUP PANEL_GROUP}</td><td>{@link Nuklear#NK_PANEL_POPUP PANEL_POPUP}</td><td>{@link Nuklear#NK_PANEL_CONTEXTUAL PANEL_CONTEXTUAL}</td><td>{@link Nuklear#NK_PANEL_COMBO PANEL_COMBO}</td></tr><tr><td>{@link Nuklear#NK_PANEL_MENU PANEL_MENU}</td><td>{@link Nuklear#NK_PANEL_TOOLTIP PANEL_TOOLTIP}</td><td>{@link Nuklear#NK_PANEL_SET_NONBLOCK PANEL_SET_NONBLOCK}</td><td>{@link Nuklear#NK_PANEL_SET_POPUP PANEL_SET_POPUP}</td><td>{@link Nuklear#NK_PANEL_SET_SUB PANEL_SET_SUB}</td></tr></table></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct nk_panel {
 *     enum nk_panel_type type;
 *     nk_flags flags;
 *     {@link NkRect struct nk_rect} bounds;
 *     nk_uint * offset_x;
 *     nk_uint * offset_y;
 *     float at_x;
 *     float at_y;
 *     float max_x;
 *     float footer_height;
 *     float header_height;
 *     float border;
 *     unsigned int has_scrolling;
 *     {@link NkRect struct nk_rect} clip;
 *     {@link NkMenuState struct nk_menu_state} menu;
 *     {@link NkRowLayout struct nk_row_layout} row;
 *     {@link NkChart struct nk_chart} chart;
 *     {@link NkCommandBuffer struct nk_command_buffer} * buffer;
 *     {@link NkPanel struct nk_panel} * parent;
 * }</code></pre>
 */
@NativeType("struct nk_panel")
public class NkPanel extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        FLAGS,
        BOUNDS,
        OFFSET_X,
        OFFSET_Y,
        AT_X,
        AT_Y,
        MAX_X,
        FOOTER_HEIGHT,
        HEADER_HEIGHT,
        BORDER,
        HAS_SCROLLING,
        CLIP,
        MENU,
        ROW,
        CHART,
        BUFFER,
        PARENT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(NkRect.SIZEOF, NkRect.ALIGNOF),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(NkRect.SIZEOF, NkRect.ALIGNOF),
            __member(NkMenuState.SIZEOF, NkMenuState.ALIGNOF),
            __member(NkRowLayout.SIZEOF, NkRowLayout.ALIGNOF),
            __member(NkChart.SIZEOF, NkChart.ALIGNOF),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        FLAGS = layout.offsetof(1);
        BOUNDS = layout.offsetof(2);
        OFFSET_X = layout.offsetof(3);
        OFFSET_Y = layout.offsetof(4);
        AT_X = layout.offsetof(5);
        AT_Y = layout.offsetof(6);
        MAX_X = layout.offsetof(7);
        FOOTER_HEIGHT = layout.offsetof(8);
        HEADER_HEIGHT = layout.offsetof(9);
        BORDER = layout.offsetof(10);
        HAS_SCROLLING = layout.offsetof(11);
        CLIP = layout.offsetof(12);
        MENU = layout.offsetof(13);
        ROW = layout.offsetof(14);
        CHART = layout.offsetof(15);
        BUFFER = layout.offsetof(16);
        PARENT = layout.offsetof(17);
    }

    /**
     * Creates a {@code NkPanel} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkPanel(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code type} field. */
    @NativeType("enum nk_panel_type")
    public int type() { return ntype(address()); }
    /** Returns the value of the {@code flags} field. */
    @NativeType("nk_flags")
    public int flags() { return nflags(address()); }
    /** Returns a {@link NkRect} view of the {@code bounds} field. */
    @NativeType("struct nk_rect")
    public NkRect bounds() { return nbounds(address()); }
    /**
     * Returns a {@link IntBuffer} view of the data pointed to by the {@code offset_x} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("nk_uint *")
    public IntBuffer offset_x(int capacity) { return noffset_x(address(), capacity); }
    /**
     * Returns a {@link IntBuffer} view of the data pointed to by the {@code offset_y} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("nk_uint *")
    public IntBuffer offset_y(int capacity) { return noffset_y(address(), capacity); }
    /** Returns the value of the {@code at_x} field. */
    public float at_x() { return nat_x(address()); }
    /** Returns the value of the {@code at_y} field. */
    public float at_y() { return nat_y(address()); }
    /** Returns the value of the {@code max_x} field. */
    public float max_x() { return nmax_x(address()); }
    /** Returns the value of the {@code footer_height} field. */
    public float footer_height() { return nfooter_height(address()); }
    /** Returns the value of the {@code header_height} field. */
    public float header_height() { return nheader_height(address()); }
    /** Returns the value of the {@code border} field. */
    public float border() { return nborder(address()); }
    /** Returns the value of the {@code has_scrolling} field. */
    @NativeType("unsigned int")
    public int has_scrolling() { return nhas_scrolling(address()); }
    /** Returns a {@link NkRect} view of the {@code clip} field. */
    @NativeType("struct nk_rect")
    public NkRect clip() { return nclip(address()); }
    /** Returns a {@link NkMenuState} view of the {@code menu} field. */
    @NativeType("struct nk_menu_state")
    public NkMenuState menu() { return nmenu(address()); }
    /** Returns a {@link NkRowLayout} view of the {@code row} field. */
    @NativeType("struct nk_row_layout")
    public NkRowLayout row() { return nrow(address()); }
    /** Returns a {@link NkChart} view of the {@code chart} field. */
    @NativeType("struct nk_chart")
    public NkChart chart() { return nchart(address()); }
    /** Returns a {@link NkCommandBuffer} view of the struct pointed to by the {@code buffer} field. */
    @NativeType("struct nk_command_buffer *")
    public NkCommandBuffer buffer() { return nbuffer(address()); }
    /** Returns a {@link NkPanel} view of the struct pointed to by the {@code parent} field. */
    @NativeType("struct nk_panel *")
    public NkPanel parent() { return nparent(address()); }

    // -----------------------------------

    /** Returns a new {@code NkPanel} instance for the specified memory address. */
    public static NkPanel create(long address) {
        return wrap(NkPanel.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkPanel createSafe(long address) {
        return address == NULL ? null : wrap(NkPanel.class, address);
    }

    /**
     * Create a {@link NkPanel.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkPanel.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkPanel.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + NkPanel.TYPE); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + NkPanel.FLAGS); }
    /** Unsafe version of {@link #bounds}. */
    public static NkRect nbounds(long struct) { return NkRect.create(struct + NkPanel.BOUNDS); }
    /** Unsafe version of {@link #offset_x(int) offset_x}. */
    public static IntBuffer noffset_x(long struct, int capacity) { return memIntBuffer(memGetAddress(struct + NkPanel.OFFSET_X), capacity); }
    /** Unsafe version of {@link #offset_y(int) offset_y}. */
    public static IntBuffer noffset_y(long struct, int capacity) { return memIntBuffer(memGetAddress(struct + NkPanel.OFFSET_Y), capacity); }
    /** Unsafe version of {@link #at_x}. */
    public static float nat_x(long struct) { return UNSAFE.getFloat(null, struct + NkPanel.AT_X); }
    /** Unsafe version of {@link #at_y}. */
    public static float nat_y(long struct) { return UNSAFE.getFloat(null, struct + NkPanel.AT_Y); }
    /** Unsafe version of {@link #max_x}. */
    public static float nmax_x(long struct) { return UNSAFE.getFloat(null, struct + NkPanel.MAX_X); }
    /** Unsafe version of {@link #footer_height}. */
    public static float nfooter_height(long struct) { return UNSAFE.getFloat(null, struct + NkPanel.FOOTER_HEIGHT); }
    /** Unsafe version of {@link #header_height}. */
    public static float nheader_height(long struct) { return UNSAFE.getFloat(null, struct + NkPanel.HEADER_HEIGHT); }
    /** Unsafe version of {@link #border}. */
    public static float nborder(long struct) { return UNSAFE.getFloat(null, struct + NkPanel.BORDER); }
    /** Unsafe version of {@link #has_scrolling}. */
    public static int nhas_scrolling(long struct) { return UNSAFE.getInt(null, struct + NkPanel.HAS_SCROLLING); }
    /** Unsafe version of {@link #clip}. */
    public static NkRect nclip(long struct) { return NkRect.create(struct + NkPanel.CLIP); }
    /** Unsafe version of {@link #menu}. */
    public static NkMenuState nmenu(long struct) { return NkMenuState.create(struct + NkPanel.MENU); }
    /** Unsafe version of {@link #row}. */
    public static NkRowLayout nrow(long struct) { return NkRowLayout.create(struct + NkPanel.ROW); }
    /** Unsafe version of {@link #chart}. */
    public static NkChart nchart(long struct) { return NkChart.create(struct + NkPanel.CHART); }
    /** Unsafe version of {@link #buffer}. */
    public static NkCommandBuffer nbuffer(long struct) { return NkCommandBuffer.create(memGetAddress(struct + NkPanel.BUFFER)); }
    /** Unsafe version of {@link #parent}. */
    public static NkPanel nparent(long struct) { return NkPanel.create(memGetAddress(struct + NkPanel.PARENT)); }

    // -----------------------------------

    /** An array of {@link NkPanel} structs. */
    public static class Buffer extends StructBuffer<NkPanel, Buffer> {

        private static final NkPanel ELEMENT_FACTORY = NkPanel.create(-1L);

        /**
         * Creates a new {@code NkPanel.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkPanel#SIZEOF}, and its mark will be undefined.
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
        protected NkPanel getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        @NativeType("enum nk_panel_type")
        public int type() { return NkPanel.ntype(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("nk_flags")
        public int flags() { return NkPanel.nflags(address()); }
        /** Returns a {@link NkRect} view of the {@code bounds} field. */
        @NativeType("struct nk_rect")
        public NkRect bounds() { return NkPanel.nbounds(address()); }
        /**
         * Returns a {@link IntBuffer} view of the data pointed to by the {@code offset_x} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("nk_uint *")
        public IntBuffer offset_x(int capacity) { return NkPanel.noffset_x(address(), capacity); }
        /**
         * Returns a {@link IntBuffer} view of the data pointed to by the {@code offset_y} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("nk_uint *")
        public IntBuffer offset_y(int capacity) { return NkPanel.noffset_y(address(), capacity); }
        /** Returns the value of the {@code at_x} field. */
        public float at_x() { return NkPanel.nat_x(address()); }
        /** Returns the value of the {@code at_y} field. */
        public float at_y() { return NkPanel.nat_y(address()); }
        /** Returns the value of the {@code max_x} field. */
        public float max_x() { return NkPanel.nmax_x(address()); }
        /** Returns the value of the {@code footer_height} field. */
        public float footer_height() { return NkPanel.nfooter_height(address()); }
        /** Returns the value of the {@code header_height} field. */
        public float header_height() { return NkPanel.nheader_height(address()); }
        /** Returns the value of the {@code border} field. */
        public float border() { return NkPanel.nborder(address()); }
        /** Returns the value of the {@code has_scrolling} field. */
        @NativeType("unsigned int")
        public int has_scrolling() { return NkPanel.nhas_scrolling(address()); }
        /** Returns a {@link NkRect} view of the {@code clip} field. */
        @NativeType("struct nk_rect")
        public NkRect clip() { return NkPanel.nclip(address()); }
        /** Returns a {@link NkMenuState} view of the {@code menu} field. */
        @NativeType("struct nk_menu_state")
        public NkMenuState menu() { return NkPanel.nmenu(address()); }
        /** Returns a {@link NkRowLayout} view of the {@code row} field. */
        @NativeType("struct nk_row_layout")
        public NkRowLayout row() { return NkPanel.nrow(address()); }
        /** Returns a {@link NkChart} view of the {@code chart} field. */
        @NativeType("struct nk_chart")
        public NkChart chart() { return NkPanel.nchart(address()); }
        /** Returns a {@link NkCommandBuffer} view of the struct pointed to by the {@code buffer} field. */
        @NativeType("struct nk_command_buffer *")
        public NkCommandBuffer buffer() { return NkPanel.nbuffer(address()); }
        /** Returns a {@link NkPanel} view of the struct pointed to by the {@code parent} field. */
        @NativeType("struct nk_panel *")
        public NkPanel parent() { return NkPanel.nparent(address()); }

    }

}