/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct nk_style_tab {
 *     {@link NkStyleItem struct nk_style_item} background;
 *     {@link NkColor struct nk_color} border_color;
 *     {@link NkColor struct nk_color} text;
 *     {@link NkStyleButton struct nk_style_button} tab_maximize_button;
 *     {@link NkStyleButton struct nk_style_button} tab_minimize_button;
 *     {@link NkStyleButton struct nk_style_button} node_maximize_button;
 *     {@link NkStyleButton struct nk_style_button} node_minimize_button;
 *     enum nk_symbol_type sym_minimize;
 *     enum nk_symbol_type sym_maximize;
 *     float border;
 *     float rounding;
 *     float indent;
 *     {@link NkVec2 struct nk_vec2} padding;
 *     {@link NkVec2 struct nk_vec2} spacing;
 * }</code></pre>
 */
@NativeType("struct nk_style_tab")
public class NkStyleTab extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BACKGROUND,
        BORDER_COLOR,
        TEXT,
        TAB_MAXIMIZE_BUTTON,
        TAB_MINIMIZE_BUTTON,
        NODE_MAXIMIZE_BUTTON,
        NODE_MINIMIZE_BUTTON,
        SYM_MINIMIZE,
        SYM_MAXIMIZE,
        BORDER,
        ROUNDING,
        INDENT,
        PADDING,
        SPACING;

    static {
        Layout layout = __struct(
            __member(NkStyleItem.SIZEOF, NkStyleItem.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(NkStyleButton.SIZEOF, NkStyleButton.ALIGNOF),
            __member(NkStyleButton.SIZEOF, NkStyleButton.ALIGNOF),
            __member(NkStyleButton.SIZEOF, NkStyleButton.ALIGNOF),
            __member(NkStyleButton.SIZEOF, NkStyleButton.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BACKGROUND = layout.offsetof(0);
        BORDER_COLOR = layout.offsetof(1);
        TEXT = layout.offsetof(2);
        TAB_MAXIMIZE_BUTTON = layout.offsetof(3);
        TAB_MINIMIZE_BUTTON = layout.offsetof(4);
        NODE_MAXIMIZE_BUTTON = layout.offsetof(5);
        NODE_MINIMIZE_BUTTON = layout.offsetof(6);
        SYM_MINIMIZE = layout.offsetof(7);
        SYM_MAXIMIZE = layout.offsetof(8);
        BORDER = layout.offsetof(9);
        ROUNDING = layout.offsetof(10);
        INDENT = layout.offsetof(11);
        PADDING = layout.offsetof(12);
        SPACING = layout.offsetof(13);
    }

    /**
     * Creates a {@code NkStyleTab} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkStyleTab(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link NkStyleItem} view of the {@code background} field. */
    @NativeType("struct nk_style_item")
    public NkStyleItem background() { return nbackground(address()); }
    /** Returns a {@link NkColor} view of the {@code border_color} field. */
    @NativeType("struct nk_color")
    public NkColor border_color() { return nborder_color(address()); }
    /** Returns a {@link NkColor} view of the {@code text} field. */
    @NativeType("struct nk_color")
    public NkColor text() { return ntext(address()); }
    /** Returns a {@link NkStyleButton} view of the {@code tab_maximize_button} field. */
    @NativeType("struct nk_style_button")
    public NkStyleButton tab_maximize_button() { return ntab_maximize_button(address()); }
    /** Returns a {@link NkStyleButton} view of the {@code tab_minimize_button} field. */
    @NativeType("struct nk_style_button")
    public NkStyleButton tab_minimize_button() { return ntab_minimize_button(address()); }
    /** Returns a {@link NkStyleButton} view of the {@code node_maximize_button} field. */
    @NativeType("struct nk_style_button")
    public NkStyleButton node_maximize_button() { return nnode_maximize_button(address()); }
    /** Returns a {@link NkStyleButton} view of the {@code node_minimize_button} field. */
    @NativeType("struct nk_style_button")
    public NkStyleButton node_minimize_button() { return nnode_minimize_button(address()); }
    /** Returns the value of the {@code sym_minimize} field. */
    @NativeType("enum nk_symbol_type")
    public int sym_minimize() { return nsym_minimize(address()); }
    /** Returns the value of the {@code sym_maximize} field. */
    @NativeType("enum nk_symbol_type")
    public int sym_maximize() { return nsym_maximize(address()); }
    /** Returns the value of the {@code border} field. */
    public float border() { return nborder(address()); }
    /** Returns the value of the {@code rounding} field. */
    public float rounding() { return nrounding(address()); }
    /** Returns the value of the {@code indent} field. */
    public float indent() { return nindent(address()); }
    /** Returns a {@link NkVec2} view of the {@code padding} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 padding() { return npadding(address()); }
    /** Returns a {@link NkVec2} view of the {@code spacing} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 spacing() { return nspacing(address()); }

    /** Copies the specified {@link NkStyleItem} to the {@code background} field. */
    public NkStyleTab background(@NativeType("struct nk_style_item") NkStyleItem value) { nbackground(address(), value); return this; }
    /** Passes the {@code background} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleTab background(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(background()); return this; }
    /** Copies the specified {@link NkColor} to the {@code border_color} field. */
    public NkStyleTab border_color(@NativeType("struct nk_color") NkColor value) { nborder_color(address(), value); return this; }
    /** Passes the {@code border_color} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleTab border_color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(border_color()); return this; }
    /** Copies the specified {@link NkColor} to the {@code text} field. */
    public NkStyleTab text(@NativeType("struct nk_color") NkColor value) { ntext(address(), value); return this; }
    /** Passes the {@code text} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleTab text(java.util.function.Consumer<NkColor> consumer) { consumer.accept(text()); return this; }
    /** Copies the specified {@link NkStyleButton} to the {@code tab_maximize_button} field. */
    public NkStyleTab tab_maximize_button(@NativeType("struct nk_style_button") NkStyleButton value) { ntab_maximize_button(address(), value); return this; }
    /** Passes the {@code tab_maximize_button} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleTab tab_maximize_button(java.util.function.Consumer<NkStyleButton> consumer) { consumer.accept(tab_maximize_button()); return this; }
    /** Copies the specified {@link NkStyleButton} to the {@code tab_minimize_button} field. */
    public NkStyleTab tab_minimize_button(@NativeType("struct nk_style_button") NkStyleButton value) { ntab_minimize_button(address(), value); return this; }
    /** Passes the {@code tab_minimize_button} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleTab tab_minimize_button(java.util.function.Consumer<NkStyleButton> consumer) { consumer.accept(tab_minimize_button()); return this; }
    /** Copies the specified {@link NkStyleButton} to the {@code node_maximize_button} field. */
    public NkStyleTab node_maximize_button(@NativeType("struct nk_style_button") NkStyleButton value) { nnode_maximize_button(address(), value); return this; }
    /** Passes the {@code node_maximize_button} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleTab node_maximize_button(java.util.function.Consumer<NkStyleButton> consumer) { consumer.accept(node_maximize_button()); return this; }
    /** Copies the specified {@link NkStyleButton} to the {@code node_minimize_button} field. */
    public NkStyleTab node_minimize_button(@NativeType("struct nk_style_button") NkStyleButton value) { nnode_minimize_button(address(), value); return this; }
    /** Passes the {@code node_minimize_button} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleTab node_minimize_button(java.util.function.Consumer<NkStyleButton> consumer) { consumer.accept(node_minimize_button()); return this; }
    /** Sets the specified value to the {@code sym_minimize} field. */
    public NkStyleTab sym_minimize(@NativeType("enum nk_symbol_type") int value) { nsym_minimize(address(), value); return this; }
    /** Sets the specified value to the {@code sym_maximize} field. */
    public NkStyleTab sym_maximize(@NativeType("enum nk_symbol_type") int value) { nsym_maximize(address(), value); return this; }
    /** Sets the specified value to the {@code border} field. */
    public NkStyleTab border(float value) { nborder(address(), value); return this; }
    /** Sets the specified value to the {@code rounding} field. */
    public NkStyleTab rounding(float value) { nrounding(address(), value); return this; }
    /** Sets the specified value to the {@code indent} field. */
    public NkStyleTab indent(float value) { nindent(address(), value); return this; }
    /** Copies the specified {@link NkVec2} to the {@code padding} field. */
    public NkStyleTab padding(@NativeType("struct nk_vec2") NkVec2 value) { npadding(address(), value); return this; }
    /** Passes the {@code padding} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleTab padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(padding()); return this; }
    /** Copies the specified {@link NkVec2} to the {@code spacing} field. */
    public NkStyleTab spacing(@NativeType("struct nk_vec2") NkVec2 value) { nspacing(address(), value); return this; }
    /** Passes the {@code spacing} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleTab spacing(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(spacing()); return this; }

    /** Initializes this struct with the specified values. */
    public NkStyleTab set(
        NkStyleItem background,
        NkColor border_color,
        NkColor text,
        NkStyleButton tab_maximize_button,
        NkStyleButton tab_minimize_button,
        NkStyleButton node_maximize_button,
        NkStyleButton node_minimize_button,
        int sym_minimize,
        int sym_maximize,
        float border,
        float rounding,
        float indent,
        NkVec2 padding,
        NkVec2 spacing
    ) {
        background(background);
        border_color(border_color);
        text(text);
        tab_maximize_button(tab_maximize_button);
        tab_minimize_button(tab_minimize_button);
        node_maximize_button(node_maximize_button);
        node_minimize_button(node_minimize_button);
        sym_minimize(sym_minimize);
        sym_maximize(sym_maximize);
        border(border);
        rounding(rounding);
        indent(indent);
        padding(padding);
        spacing(spacing);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public NkStyleTab set(NkStyleTab src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code NkStyleTab} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkStyleTab malloc() {
        return wrap(NkStyleTab.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code NkStyleTab} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkStyleTab calloc() {
        return wrap(NkStyleTab.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code NkStyleTab} instance allocated with {@link BufferUtils}. */
    public static NkStyleTab create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(NkStyleTab.class, memAddress(container), container);
    }

    /** Returns a new {@code NkStyleTab} instance for the specified memory address. */
    public static NkStyleTab create(long address) {
        return wrap(NkStyleTab.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkStyleTab createSafe(long address) {
        return address == NULL ? null : wrap(NkStyleTab.class, address);
    }

    /**
     * Returns a new {@link NkStyleTab.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleTab.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NkStyleTab.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleTab.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkStyleTab.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleTab.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link NkStyleTab.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkStyleTab.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkStyleTab.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code NkStyleTab} instance allocated on the thread-local {@link MemoryStack}. */
    public static NkStyleTab mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code NkStyleTab} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static NkStyleTab callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code NkStyleTab} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkStyleTab mallocStack(MemoryStack stack) {
        return wrap(NkStyleTab.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code NkStyleTab} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkStyleTab callocStack(MemoryStack stack) {
        return wrap(NkStyleTab.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link NkStyleTab.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleTab.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkStyleTab.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleTab.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkStyleTab.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkStyleTab.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkStyleTab.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkStyleTab.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #background}. */
    public static NkStyleItem nbackground(long struct) { return NkStyleItem.create(struct + NkStyleTab.BACKGROUND); }
    /** Unsafe version of {@link #border_color}. */
    public static NkColor nborder_color(long struct) { return NkColor.create(struct + NkStyleTab.BORDER_COLOR); }
    /** Unsafe version of {@link #text}. */
    public static NkColor ntext(long struct) { return NkColor.create(struct + NkStyleTab.TEXT); }
    /** Unsafe version of {@link #tab_maximize_button}. */
    public static NkStyleButton ntab_maximize_button(long struct) { return NkStyleButton.create(struct + NkStyleTab.TAB_MAXIMIZE_BUTTON); }
    /** Unsafe version of {@link #tab_minimize_button}. */
    public static NkStyleButton ntab_minimize_button(long struct) { return NkStyleButton.create(struct + NkStyleTab.TAB_MINIMIZE_BUTTON); }
    /** Unsafe version of {@link #node_maximize_button}. */
    public static NkStyleButton nnode_maximize_button(long struct) { return NkStyleButton.create(struct + NkStyleTab.NODE_MAXIMIZE_BUTTON); }
    /** Unsafe version of {@link #node_minimize_button}. */
    public static NkStyleButton nnode_minimize_button(long struct) { return NkStyleButton.create(struct + NkStyleTab.NODE_MINIMIZE_BUTTON); }
    /** Unsafe version of {@link #sym_minimize}. */
    public static int nsym_minimize(long struct) { return UNSAFE.getInt(null, struct + NkStyleTab.SYM_MINIMIZE); }
    /** Unsafe version of {@link #sym_maximize}. */
    public static int nsym_maximize(long struct) { return UNSAFE.getInt(null, struct + NkStyleTab.SYM_MAXIMIZE); }
    /** Unsafe version of {@link #border}. */
    public static float nborder(long struct) { return UNSAFE.getFloat(null, struct + NkStyleTab.BORDER); }
    /** Unsafe version of {@link #rounding}. */
    public static float nrounding(long struct) { return UNSAFE.getFloat(null, struct + NkStyleTab.ROUNDING); }
    /** Unsafe version of {@link #indent}. */
    public static float nindent(long struct) { return UNSAFE.getFloat(null, struct + NkStyleTab.INDENT); }
    /** Unsafe version of {@link #padding}. */
    public static NkVec2 npadding(long struct) { return NkVec2.create(struct + NkStyleTab.PADDING); }
    /** Unsafe version of {@link #spacing}. */
    public static NkVec2 nspacing(long struct) { return NkVec2.create(struct + NkStyleTab.SPACING); }

    /** Unsafe version of {@link #background(NkStyleItem) background}. */
    public static void nbackground(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleTab.BACKGROUND, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #border_color(NkColor) border_color}. */
    public static void nborder_color(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleTab.BORDER_COLOR, NkColor.SIZEOF); }
    /** Unsafe version of {@link #text(NkColor) text}. */
    public static void ntext(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleTab.TEXT, NkColor.SIZEOF); }
    /** Unsafe version of {@link #tab_maximize_button(NkStyleButton) tab_maximize_button}. */
    public static void ntab_maximize_button(long struct, NkStyleButton value) { memCopy(value.address(), struct + NkStyleTab.TAB_MAXIMIZE_BUTTON, NkStyleButton.SIZEOF); }
    /** Unsafe version of {@link #tab_minimize_button(NkStyleButton) tab_minimize_button}. */
    public static void ntab_minimize_button(long struct, NkStyleButton value) { memCopy(value.address(), struct + NkStyleTab.TAB_MINIMIZE_BUTTON, NkStyleButton.SIZEOF); }
    /** Unsafe version of {@link #node_maximize_button(NkStyleButton) node_maximize_button}. */
    public static void nnode_maximize_button(long struct, NkStyleButton value) { memCopy(value.address(), struct + NkStyleTab.NODE_MAXIMIZE_BUTTON, NkStyleButton.SIZEOF); }
    /** Unsafe version of {@link #node_minimize_button(NkStyleButton) node_minimize_button}. */
    public static void nnode_minimize_button(long struct, NkStyleButton value) { memCopy(value.address(), struct + NkStyleTab.NODE_MINIMIZE_BUTTON, NkStyleButton.SIZEOF); }
    /** Unsafe version of {@link #sym_minimize(int) sym_minimize}. */
    public static void nsym_minimize(long struct, int value) { UNSAFE.putInt(null, struct + NkStyleTab.SYM_MINIMIZE, value); }
    /** Unsafe version of {@link #sym_maximize(int) sym_maximize}. */
    public static void nsym_maximize(long struct, int value) { UNSAFE.putInt(null, struct + NkStyleTab.SYM_MAXIMIZE, value); }
    /** Unsafe version of {@link #border(float) border}. */
    public static void nborder(long struct, float value) { UNSAFE.putFloat(null, struct + NkStyleTab.BORDER, value); }
    /** Unsafe version of {@link #rounding(float) rounding}. */
    public static void nrounding(long struct, float value) { UNSAFE.putFloat(null, struct + NkStyleTab.ROUNDING, value); }
    /** Unsafe version of {@link #indent(float) indent}. */
    public static void nindent(long struct, float value) { UNSAFE.putFloat(null, struct + NkStyleTab.INDENT, value); }
    /** Unsafe version of {@link #padding(NkVec2) padding}. */
    public static void npadding(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleTab.PADDING, NkVec2.SIZEOF); }
    /** Unsafe version of {@link #spacing(NkVec2) spacing}. */
    public static void nspacing(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleTab.SPACING, NkVec2.SIZEOF); }

    // -----------------------------------

    /** An array of {@link NkStyleTab} structs. */
    public static class Buffer extends StructBuffer<NkStyleTab, Buffer> implements NativeResource {

        private static final NkStyleTab ELEMENT_FACTORY = NkStyleTab.create(-1L);

        /**
         * Creates a new {@code NkStyleTab.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkStyleTab#SIZEOF}, and its mark will be undefined.
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
        protected NkStyleTab getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link NkStyleItem} view of the {@code background} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem background() { return NkStyleTab.nbackground(address()); }
        /** Returns a {@link NkColor} view of the {@code border_color} field. */
        @NativeType("struct nk_color")
        public NkColor border_color() { return NkStyleTab.nborder_color(address()); }
        /** Returns a {@link NkColor} view of the {@code text} field. */
        @NativeType("struct nk_color")
        public NkColor text() { return NkStyleTab.ntext(address()); }
        /** Returns a {@link NkStyleButton} view of the {@code tab_maximize_button} field. */
        @NativeType("struct nk_style_button")
        public NkStyleButton tab_maximize_button() { return NkStyleTab.ntab_maximize_button(address()); }
        /** Returns a {@link NkStyleButton} view of the {@code tab_minimize_button} field. */
        @NativeType("struct nk_style_button")
        public NkStyleButton tab_minimize_button() { return NkStyleTab.ntab_minimize_button(address()); }
        /** Returns a {@link NkStyleButton} view of the {@code node_maximize_button} field. */
        @NativeType("struct nk_style_button")
        public NkStyleButton node_maximize_button() { return NkStyleTab.nnode_maximize_button(address()); }
        /** Returns a {@link NkStyleButton} view of the {@code node_minimize_button} field. */
        @NativeType("struct nk_style_button")
        public NkStyleButton node_minimize_button() { return NkStyleTab.nnode_minimize_button(address()); }
        /** Returns the value of the {@code sym_minimize} field. */
        @NativeType("enum nk_symbol_type")
        public int sym_minimize() { return NkStyleTab.nsym_minimize(address()); }
        /** Returns the value of the {@code sym_maximize} field. */
        @NativeType("enum nk_symbol_type")
        public int sym_maximize() { return NkStyleTab.nsym_maximize(address()); }
        /** Returns the value of the {@code border} field. */
        public float border() { return NkStyleTab.nborder(address()); }
        /** Returns the value of the {@code rounding} field. */
        public float rounding() { return NkStyleTab.nrounding(address()); }
        /** Returns the value of the {@code indent} field. */
        public float indent() { return NkStyleTab.nindent(address()); }
        /** Returns a {@link NkVec2} view of the {@code padding} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 padding() { return NkStyleTab.npadding(address()); }
        /** Returns a {@link NkVec2} view of the {@code spacing} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 spacing() { return NkStyleTab.nspacing(address()); }

        /** Copies the specified {@link NkStyleItem} to the {@code background} field. */
        public NkStyleTab.Buffer background(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleTab.nbackground(address(), value); return this; }
        /** Passes the {@code background} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleTab.Buffer background(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(background()); return this; }
        /** Copies the specified {@link NkColor} to the {@code border_color} field. */
        public NkStyleTab.Buffer border_color(@NativeType("struct nk_color") NkColor value) { NkStyleTab.nborder_color(address(), value); return this; }
        /** Passes the {@code border_color} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleTab.Buffer border_color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(border_color()); return this; }
        /** Copies the specified {@link NkColor} to the {@code text} field. */
        public NkStyleTab.Buffer text(@NativeType("struct nk_color") NkColor value) { NkStyleTab.ntext(address(), value); return this; }
        /** Passes the {@code text} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleTab.Buffer text(java.util.function.Consumer<NkColor> consumer) { consumer.accept(text()); return this; }
        /** Copies the specified {@link NkStyleButton} to the {@code tab_maximize_button} field. */
        public NkStyleTab.Buffer tab_maximize_button(@NativeType("struct nk_style_button") NkStyleButton value) { NkStyleTab.ntab_maximize_button(address(), value); return this; }
        /** Passes the {@code tab_maximize_button} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleTab.Buffer tab_maximize_button(java.util.function.Consumer<NkStyleButton> consumer) { consumer.accept(tab_maximize_button()); return this; }
        /** Copies the specified {@link NkStyleButton} to the {@code tab_minimize_button} field. */
        public NkStyleTab.Buffer tab_minimize_button(@NativeType("struct nk_style_button") NkStyleButton value) { NkStyleTab.ntab_minimize_button(address(), value); return this; }
        /** Passes the {@code tab_minimize_button} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleTab.Buffer tab_minimize_button(java.util.function.Consumer<NkStyleButton> consumer) { consumer.accept(tab_minimize_button()); return this; }
        /** Copies the specified {@link NkStyleButton} to the {@code node_maximize_button} field. */
        public NkStyleTab.Buffer node_maximize_button(@NativeType("struct nk_style_button") NkStyleButton value) { NkStyleTab.nnode_maximize_button(address(), value); return this; }
        /** Passes the {@code node_maximize_button} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleTab.Buffer node_maximize_button(java.util.function.Consumer<NkStyleButton> consumer) { consumer.accept(node_maximize_button()); return this; }
        /** Copies the specified {@link NkStyleButton} to the {@code node_minimize_button} field. */
        public NkStyleTab.Buffer node_minimize_button(@NativeType("struct nk_style_button") NkStyleButton value) { NkStyleTab.nnode_minimize_button(address(), value); return this; }
        /** Passes the {@code node_minimize_button} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleTab.Buffer node_minimize_button(java.util.function.Consumer<NkStyleButton> consumer) { consumer.accept(node_minimize_button()); return this; }
        /** Sets the specified value to the {@code sym_minimize} field. */
        public NkStyleTab.Buffer sym_minimize(@NativeType("enum nk_symbol_type") int value) { NkStyleTab.nsym_minimize(address(), value); return this; }
        /** Sets the specified value to the {@code sym_maximize} field. */
        public NkStyleTab.Buffer sym_maximize(@NativeType("enum nk_symbol_type") int value) { NkStyleTab.nsym_maximize(address(), value); return this; }
        /** Sets the specified value to the {@code border} field. */
        public NkStyleTab.Buffer border(float value) { NkStyleTab.nborder(address(), value); return this; }
        /** Sets the specified value to the {@code rounding} field. */
        public NkStyleTab.Buffer rounding(float value) { NkStyleTab.nrounding(address(), value); return this; }
        /** Sets the specified value to the {@code indent} field. */
        public NkStyleTab.Buffer indent(float value) { NkStyleTab.nindent(address(), value); return this; }
        /** Copies the specified {@link NkVec2} to the {@code padding} field. */
        public NkStyleTab.Buffer padding(@NativeType("struct nk_vec2") NkVec2 value) { NkStyleTab.npadding(address(), value); return this; }
        /** Passes the {@code padding} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleTab.Buffer padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(padding()); return this; }
        /** Copies the specified {@link NkVec2} to the {@code spacing} field. */
        public NkStyleTab.Buffer spacing(@NativeType("struct nk_vec2") NkVec2 value) { NkStyleTab.nspacing(address(), value); return this; }
        /** Passes the {@code spacing} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleTab.Buffer spacing(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(spacing()); return this; }

    }

}