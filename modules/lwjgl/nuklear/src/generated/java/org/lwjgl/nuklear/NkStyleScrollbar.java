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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code inc_symbol} &ndash; one of:<br><table><tr><td>{@link Nuklear#NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link Nuklear#NK_SYMBOL_X SYMBOL_X}</td><td>{@link Nuklear#NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link Nuklear#NK_SYMBOL_CIRCLE_SOLID SYMBOL_CIRCLE_SOLID}</td><td>{@link Nuklear#NK_SYMBOL_CIRCLE_OUTLINE SYMBOL_CIRCLE_OUTLINE}</td></tr><tr><td>{@link Nuklear#NK_SYMBOL_RECT_SOLID SYMBOL_RECT_SOLID}</td><td>{@link Nuklear#NK_SYMBOL_RECT_OUTLINE SYMBOL_RECT_OUTLINE}</td><td>{@link Nuklear#NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link Nuklear#NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link Nuklear#NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link Nuklear#NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link Nuklear#NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link Nuklear#NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link Nuklear#NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table></li>
 * <li>{@code dec_symbol} &ndash; see {@code inc_symbol}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct nk_style_scrollbar {
 *     {@link NkStyleItem struct nk_style_item} normal;
 *     {@link NkStyleItem struct nk_style_item} hover;
 *     {@link NkStyleItem struct nk_style_item} active;
 *     {@link NkColor struct nk_color} border_color;
 *     {@link NkStyleItem struct nk_style_item} cursor_normal;
 *     {@link NkStyleItem struct nk_style_item} cursor_hover;
 *     {@link NkStyleItem struct nk_style_item} cursor_active;
 *     {@link NkColor struct nk_color} cursor_border_color;
 *     float border;
 *     float rounding;
 *     float border_cursor;
 *     float rounding_cursor;
 *     {@link NkVec2 struct nk_vec2} padding;
 *     int show_buttons;
 *     {@link NkStyleButton struct nk_style_button} inc_button;
 *     {@link NkStyleButton struct nk_style_button} dec_button;
 *     enum nk_symbol_type inc_symbol;
 *     enum nk_symbol_type dec_symbol;
 *     {@link NkHandle nk_handle} userdata;
 *     {@link NkDrawBeginCallbackI nk_draw_begin} draw_begin;
 *     {@link NkDrawEndCallbackI nk_draw_end} draw_end;
 * }</code></pre>
 */
@NativeType("struct nk_style_scrollbar")
public class NkStyleScrollbar extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NORMAL,
        HOVER,
        ACTIVE,
        BORDER_COLOR,
        CURSOR_NORMAL,
        CURSOR_HOVER,
        CURSOR_ACTIVE,
        CURSOR_BORDER_COLOR,
        BORDER,
        ROUNDING,
        BORDER_CURSOR,
        ROUNDING_CURSOR,
        PADDING,
        SHOW_BUTTONS,
        INC_BUTTON,
        DEC_BUTTON,
        INC_SYMBOL,
        DEC_SYMBOL,
        USERDATA,
        DRAW_BEGIN,
        DRAW_END;

    static {
        Layout layout = __struct(
            __member(NkStyleItem.SIZEOF, NkStyleItem.ALIGNOF),
            __member(NkStyleItem.SIZEOF, NkStyleItem.ALIGNOF),
            __member(NkStyleItem.SIZEOF, NkStyleItem.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(NkStyleItem.SIZEOF, NkStyleItem.ALIGNOF),
            __member(NkStyleItem.SIZEOF, NkStyleItem.ALIGNOF),
            __member(NkStyleItem.SIZEOF, NkStyleItem.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
            __member(4),
            __member(NkStyleButton.SIZEOF, NkStyleButton.ALIGNOF),
            __member(NkStyleButton.SIZEOF, NkStyleButton.ALIGNOF),
            __member(4),
            __member(4),
            __member(NkHandle.SIZEOF, NkHandle.ALIGNOF),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NORMAL = layout.offsetof(0);
        HOVER = layout.offsetof(1);
        ACTIVE = layout.offsetof(2);
        BORDER_COLOR = layout.offsetof(3);
        CURSOR_NORMAL = layout.offsetof(4);
        CURSOR_HOVER = layout.offsetof(5);
        CURSOR_ACTIVE = layout.offsetof(6);
        CURSOR_BORDER_COLOR = layout.offsetof(7);
        BORDER = layout.offsetof(8);
        ROUNDING = layout.offsetof(9);
        BORDER_CURSOR = layout.offsetof(10);
        ROUNDING_CURSOR = layout.offsetof(11);
        PADDING = layout.offsetof(12);
        SHOW_BUTTONS = layout.offsetof(13);
        INC_BUTTON = layout.offsetof(14);
        DEC_BUTTON = layout.offsetof(15);
        INC_SYMBOL = layout.offsetof(16);
        DEC_SYMBOL = layout.offsetof(17);
        USERDATA = layout.offsetof(18);
        DRAW_BEGIN = layout.offsetof(19);
        DRAW_END = layout.offsetof(20);
    }

    /**
     * Creates a {@code NkStyleScrollbar} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkStyleScrollbar(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link NkStyleItem} view of the {@code normal} field. */
    @NativeType("struct nk_style_item")
    public NkStyleItem normal() { return nnormal(address()); }
    /** Returns a {@link NkStyleItem} view of the {@code hover} field. */
    @NativeType("struct nk_style_item")
    public NkStyleItem hover() { return nhover(address()); }
    /** Returns a {@link NkStyleItem} view of the {@code active} field. */
    @NativeType("struct nk_style_item")
    public NkStyleItem active() { return nactive(address()); }
    /** Returns a {@link NkColor} view of the {@code border_color} field. */
    @NativeType("struct nk_color")
    public NkColor border_color() { return nborder_color(address()); }
    /** Returns a {@link NkStyleItem} view of the {@code cursor_normal} field. */
    @NativeType("struct nk_style_item")
    public NkStyleItem cursor_normal() { return ncursor_normal(address()); }
    /** Returns a {@link NkStyleItem} view of the {@code cursor_hover} field. */
    @NativeType("struct nk_style_item")
    public NkStyleItem cursor_hover() { return ncursor_hover(address()); }
    /** Returns a {@link NkStyleItem} view of the {@code cursor_active} field. */
    @NativeType("struct nk_style_item")
    public NkStyleItem cursor_active() { return ncursor_active(address()); }
    /** Returns a {@link NkColor} view of the {@code cursor_border_color} field. */
    @NativeType("struct nk_color")
    public NkColor cursor_border_color() { return ncursor_border_color(address()); }
    /** Returns the value of the {@code border} field. */
    public float border() { return nborder(address()); }
    /** Returns the value of the {@code rounding} field. */
    public float rounding() { return nrounding(address()); }
    /** Returns the value of the {@code border_cursor} field. */
    public float border_cursor() { return nborder_cursor(address()); }
    /** Returns the value of the {@code rounding_cursor} field. */
    public float rounding_cursor() { return nrounding_cursor(address()); }
    /** Returns a {@link NkVec2} view of the {@code padding} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 padding() { return npadding(address()); }
    /** Returns the value of the {@code show_buttons} field. */
    public int show_buttons() { return nshow_buttons(address()); }
    /** Returns a {@link NkStyleButton} view of the {@code inc_button} field. */
    @NativeType("struct nk_style_button")
    public NkStyleButton inc_button() { return ninc_button(address()); }
    /** Returns a {@link NkStyleButton} view of the {@code dec_button} field. */
    @NativeType("struct nk_style_button")
    public NkStyleButton dec_button() { return ndec_button(address()); }
    /** Returns the value of the {@code inc_symbol} field. */
    @NativeType("enum nk_symbol_type")
    public int inc_symbol() { return ninc_symbol(address()); }
    /** Returns the value of the {@code dec_symbol} field. */
    @NativeType("enum nk_symbol_type")
    public int dec_symbol() { return ndec_symbol(address()); }
    /** Returns a {@link NkHandle} view of the {@code userdata} field. */
    @NativeType("nk_handle")
    public NkHandle userdata() { return nuserdata(address()); }
    /** Returns the value of the {@code draw_begin} field. */
    @Nullable
    @NativeType("nk_draw_begin")
    public NkDrawBeginCallback draw_begin() { return ndraw_begin(address()); }
    /** Returns the value of the {@code draw_end} field. */
    @Nullable
    @NativeType("nk_draw_end")
    public NkDrawEndCallback draw_end() { return ndraw_end(address()); }

    /** Copies the specified {@link NkStyleItem} to the {@code normal} field. */
    public NkStyleScrollbar normal(@NativeType("struct nk_style_item") NkStyleItem value) { nnormal(address(), value); return this; }
    /** Passes the {@code normal} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleScrollbar normal(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(normal()); return this; }
    /** Copies the specified {@link NkStyleItem} to the {@code hover} field. */
    public NkStyleScrollbar hover(@NativeType("struct nk_style_item") NkStyleItem value) { nhover(address(), value); return this; }
    /** Passes the {@code hover} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleScrollbar hover(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(hover()); return this; }
    /** Copies the specified {@link NkStyleItem} to the {@code active} field. */
    public NkStyleScrollbar active(@NativeType("struct nk_style_item") NkStyleItem value) { nactive(address(), value); return this; }
    /** Passes the {@code active} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleScrollbar active(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(active()); return this; }
    /** Copies the specified {@link NkColor} to the {@code border_color} field. */
    public NkStyleScrollbar border_color(@NativeType("struct nk_color") NkColor value) { nborder_color(address(), value); return this; }
    /** Passes the {@code border_color} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleScrollbar border_color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(border_color()); return this; }
    /** Copies the specified {@link NkStyleItem} to the {@code cursor_normal} field. */
    public NkStyleScrollbar cursor_normal(@NativeType("struct nk_style_item") NkStyleItem value) { ncursor_normal(address(), value); return this; }
    /** Passes the {@code cursor_normal} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleScrollbar cursor_normal(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(cursor_normal()); return this; }
    /** Copies the specified {@link NkStyleItem} to the {@code cursor_hover} field. */
    public NkStyleScrollbar cursor_hover(@NativeType("struct nk_style_item") NkStyleItem value) { ncursor_hover(address(), value); return this; }
    /** Passes the {@code cursor_hover} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleScrollbar cursor_hover(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(cursor_hover()); return this; }
    /** Copies the specified {@link NkStyleItem} to the {@code cursor_active} field. */
    public NkStyleScrollbar cursor_active(@NativeType("struct nk_style_item") NkStyleItem value) { ncursor_active(address(), value); return this; }
    /** Passes the {@code cursor_active} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleScrollbar cursor_active(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(cursor_active()); return this; }
    /** Copies the specified {@link NkColor} to the {@code cursor_border_color} field. */
    public NkStyleScrollbar cursor_border_color(@NativeType("struct nk_color") NkColor value) { ncursor_border_color(address(), value); return this; }
    /** Passes the {@code cursor_border_color} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleScrollbar cursor_border_color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(cursor_border_color()); return this; }
    /** Sets the specified value to the {@code border} field. */
    public NkStyleScrollbar border(float value) { nborder(address(), value); return this; }
    /** Sets the specified value to the {@code rounding} field. */
    public NkStyleScrollbar rounding(float value) { nrounding(address(), value); return this; }
    /** Sets the specified value to the {@code border_cursor} field. */
    public NkStyleScrollbar border_cursor(float value) { nborder_cursor(address(), value); return this; }
    /** Sets the specified value to the {@code rounding_cursor} field. */
    public NkStyleScrollbar rounding_cursor(float value) { nrounding_cursor(address(), value); return this; }
    /** Copies the specified {@link NkVec2} to the {@code padding} field. */
    public NkStyleScrollbar padding(@NativeType("struct nk_vec2") NkVec2 value) { npadding(address(), value); return this; }
    /** Passes the {@code padding} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleScrollbar padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(padding()); return this; }
    /** Sets the specified value to the {@code show_buttons} field. */
    public NkStyleScrollbar show_buttons(int value) { nshow_buttons(address(), value); return this; }
    /** Copies the specified {@link NkStyleButton} to the {@code inc_button} field. */
    public NkStyleScrollbar inc_button(@NativeType("struct nk_style_button") NkStyleButton value) { ninc_button(address(), value); return this; }
    /** Passes the {@code inc_button} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleScrollbar inc_button(java.util.function.Consumer<NkStyleButton> consumer) { consumer.accept(inc_button()); return this; }
    /** Copies the specified {@link NkStyleButton} to the {@code dec_button} field. */
    public NkStyleScrollbar dec_button(@NativeType("struct nk_style_button") NkStyleButton value) { ndec_button(address(), value); return this; }
    /** Passes the {@code dec_button} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleScrollbar dec_button(java.util.function.Consumer<NkStyleButton> consumer) { consumer.accept(dec_button()); return this; }
    /** Sets the specified value to the {@code inc_symbol} field. */
    public NkStyleScrollbar inc_symbol(@NativeType("enum nk_symbol_type") int value) { ninc_symbol(address(), value); return this; }
    /** Sets the specified value to the {@code dec_symbol} field. */
    public NkStyleScrollbar dec_symbol(@NativeType("enum nk_symbol_type") int value) { ndec_symbol(address(), value); return this; }
    /** Copies the specified {@link NkHandle} to the {@code userdata} field. */
    public NkStyleScrollbar userdata(@NativeType("nk_handle") NkHandle value) { nuserdata(address(), value); return this; }
    /** Passes the {@code userdata} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleScrollbar userdata(java.util.function.Consumer<NkHandle> consumer) { consumer.accept(userdata()); return this; }
    /** Sets the specified value to the {@code draw_begin} field. */
    public NkStyleScrollbar draw_begin(@Nullable @NativeType("nk_draw_begin") NkDrawBeginCallbackI value) { ndraw_begin(address(), value); return this; }
    /** Sets the specified value to the {@code draw_end} field. */
    public NkStyleScrollbar draw_end(@Nullable @NativeType("nk_draw_end") NkDrawEndCallbackI value) { ndraw_end(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public NkStyleScrollbar set(
        NkStyleItem normal,
        NkStyleItem hover,
        NkStyleItem active,
        NkColor border_color,
        NkStyleItem cursor_normal,
        NkStyleItem cursor_hover,
        NkStyleItem cursor_active,
        NkColor cursor_border_color,
        float border,
        float rounding,
        float border_cursor,
        float rounding_cursor,
        NkVec2 padding,
        int show_buttons,
        NkStyleButton inc_button,
        NkStyleButton dec_button,
        int inc_symbol,
        int dec_symbol,
        NkHandle userdata,
        NkDrawBeginCallbackI draw_begin,
        NkDrawEndCallbackI draw_end
    ) {
        normal(normal);
        hover(hover);
        active(active);
        border_color(border_color);
        cursor_normal(cursor_normal);
        cursor_hover(cursor_hover);
        cursor_active(cursor_active);
        cursor_border_color(cursor_border_color);
        border(border);
        rounding(rounding);
        border_cursor(border_cursor);
        rounding_cursor(rounding_cursor);
        padding(padding);
        show_buttons(show_buttons);
        inc_button(inc_button);
        dec_button(dec_button);
        inc_symbol(inc_symbol);
        dec_symbol(dec_symbol);
        userdata(userdata);
        draw_begin(draw_begin);
        draw_end(draw_end);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public NkStyleScrollbar set(NkStyleScrollbar src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code NkStyleScrollbar} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkStyleScrollbar malloc() {
        return wrap(NkStyleScrollbar.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code NkStyleScrollbar} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkStyleScrollbar calloc() {
        return wrap(NkStyleScrollbar.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code NkStyleScrollbar} instance allocated with {@link BufferUtils}. */
    public static NkStyleScrollbar create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(NkStyleScrollbar.class, memAddress(container), container);
    }

    /** Returns a new {@code NkStyleScrollbar} instance for the specified memory address. */
    public static NkStyleScrollbar create(long address) {
        return wrap(NkStyleScrollbar.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkStyleScrollbar createSafe(long address) {
        return address == NULL ? null : wrap(NkStyleScrollbar.class, address);
    }

    /**
     * Returns a new {@link NkStyleScrollbar.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleScrollbar.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NkStyleScrollbar.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleScrollbar.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkStyleScrollbar.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleScrollbar.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link NkStyleScrollbar.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkStyleScrollbar.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkStyleScrollbar.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code NkStyleScrollbar} instance allocated on the thread-local {@link MemoryStack}. */
    public static NkStyleScrollbar mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code NkStyleScrollbar} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static NkStyleScrollbar callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code NkStyleScrollbar} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkStyleScrollbar mallocStack(MemoryStack stack) {
        return wrap(NkStyleScrollbar.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code NkStyleScrollbar} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkStyleScrollbar callocStack(MemoryStack stack) {
        return wrap(NkStyleScrollbar.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link NkStyleScrollbar.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleScrollbar.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkStyleScrollbar.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleScrollbar.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkStyleScrollbar.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkStyleScrollbar.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkStyleScrollbar.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkStyleScrollbar.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #normal}. */
    public static NkStyleItem nnormal(long struct) { return NkStyleItem.create(struct + NkStyleScrollbar.NORMAL); }
    /** Unsafe version of {@link #hover}. */
    public static NkStyleItem nhover(long struct) { return NkStyleItem.create(struct + NkStyleScrollbar.HOVER); }
    /** Unsafe version of {@link #active}. */
    public static NkStyleItem nactive(long struct) { return NkStyleItem.create(struct + NkStyleScrollbar.ACTIVE); }
    /** Unsafe version of {@link #border_color}. */
    public static NkColor nborder_color(long struct) { return NkColor.create(struct + NkStyleScrollbar.BORDER_COLOR); }
    /** Unsafe version of {@link #cursor_normal}. */
    public static NkStyleItem ncursor_normal(long struct) { return NkStyleItem.create(struct + NkStyleScrollbar.CURSOR_NORMAL); }
    /** Unsafe version of {@link #cursor_hover}. */
    public static NkStyleItem ncursor_hover(long struct) { return NkStyleItem.create(struct + NkStyleScrollbar.CURSOR_HOVER); }
    /** Unsafe version of {@link #cursor_active}. */
    public static NkStyleItem ncursor_active(long struct) { return NkStyleItem.create(struct + NkStyleScrollbar.CURSOR_ACTIVE); }
    /** Unsafe version of {@link #cursor_border_color}. */
    public static NkColor ncursor_border_color(long struct) { return NkColor.create(struct + NkStyleScrollbar.CURSOR_BORDER_COLOR); }
    /** Unsafe version of {@link #border}. */
    public static float nborder(long struct) { return UNSAFE.getFloat(null, struct + NkStyleScrollbar.BORDER); }
    /** Unsafe version of {@link #rounding}. */
    public static float nrounding(long struct) { return UNSAFE.getFloat(null, struct + NkStyleScrollbar.ROUNDING); }
    /** Unsafe version of {@link #border_cursor}. */
    public static float nborder_cursor(long struct) { return UNSAFE.getFloat(null, struct + NkStyleScrollbar.BORDER_CURSOR); }
    /** Unsafe version of {@link #rounding_cursor}. */
    public static float nrounding_cursor(long struct) { return UNSAFE.getFloat(null, struct + NkStyleScrollbar.ROUNDING_CURSOR); }
    /** Unsafe version of {@link #padding}. */
    public static NkVec2 npadding(long struct) { return NkVec2.create(struct + NkStyleScrollbar.PADDING); }
    /** Unsafe version of {@link #show_buttons}. */
    public static int nshow_buttons(long struct) { return UNSAFE.getInt(null, struct + NkStyleScrollbar.SHOW_BUTTONS); }
    /** Unsafe version of {@link #inc_button}. */
    public static NkStyleButton ninc_button(long struct) { return NkStyleButton.create(struct + NkStyleScrollbar.INC_BUTTON); }
    /** Unsafe version of {@link #dec_button}. */
    public static NkStyleButton ndec_button(long struct) { return NkStyleButton.create(struct + NkStyleScrollbar.DEC_BUTTON); }
    /** Unsafe version of {@link #inc_symbol}. */
    public static int ninc_symbol(long struct) { return UNSAFE.getInt(null, struct + NkStyleScrollbar.INC_SYMBOL); }
    /** Unsafe version of {@link #dec_symbol}. */
    public static int ndec_symbol(long struct) { return UNSAFE.getInt(null, struct + NkStyleScrollbar.DEC_SYMBOL); }
    /** Unsafe version of {@link #userdata}. */
    public static NkHandle nuserdata(long struct) { return NkHandle.create(struct + NkStyleScrollbar.USERDATA); }
    /** Unsafe version of {@link #draw_begin}. */
    @Nullable public static NkDrawBeginCallback ndraw_begin(long struct) { return NkDrawBeginCallback.createSafe(memGetAddress(struct + NkStyleScrollbar.DRAW_BEGIN)); }
    /** Unsafe version of {@link #draw_end}. */
    @Nullable public static NkDrawEndCallback ndraw_end(long struct) { return NkDrawEndCallback.createSafe(memGetAddress(struct + NkStyleScrollbar.DRAW_END)); }

    /** Unsafe version of {@link #normal(NkStyleItem) normal}. */
    public static void nnormal(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleScrollbar.NORMAL, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #hover(NkStyleItem) hover}. */
    public static void nhover(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleScrollbar.HOVER, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #active(NkStyleItem) active}. */
    public static void nactive(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleScrollbar.ACTIVE, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #border_color(NkColor) border_color}. */
    public static void nborder_color(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleScrollbar.BORDER_COLOR, NkColor.SIZEOF); }
    /** Unsafe version of {@link #cursor_normal(NkStyleItem) cursor_normal}. */
    public static void ncursor_normal(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleScrollbar.CURSOR_NORMAL, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #cursor_hover(NkStyleItem) cursor_hover}. */
    public static void ncursor_hover(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleScrollbar.CURSOR_HOVER, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #cursor_active(NkStyleItem) cursor_active}. */
    public static void ncursor_active(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleScrollbar.CURSOR_ACTIVE, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #cursor_border_color(NkColor) cursor_border_color}. */
    public static void ncursor_border_color(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleScrollbar.CURSOR_BORDER_COLOR, NkColor.SIZEOF); }
    /** Unsafe version of {@link #border(float) border}. */
    public static void nborder(long struct, float value) { UNSAFE.putFloat(null, struct + NkStyleScrollbar.BORDER, value); }
    /** Unsafe version of {@link #rounding(float) rounding}. */
    public static void nrounding(long struct, float value) { UNSAFE.putFloat(null, struct + NkStyleScrollbar.ROUNDING, value); }
    /** Unsafe version of {@link #border_cursor(float) border_cursor}. */
    public static void nborder_cursor(long struct, float value) { UNSAFE.putFloat(null, struct + NkStyleScrollbar.BORDER_CURSOR, value); }
    /** Unsafe version of {@link #rounding_cursor(float) rounding_cursor}. */
    public static void nrounding_cursor(long struct, float value) { UNSAFE.putFloat(null, struct + NkStyleScrollbar.ROUNDING_CURSOR, value); }
    /** Unsafe version of {@link #padding(NkVec2) padding}. */
    public static void npadding(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleScrollbar.PADDING, NkVec2.SIZEOF); }
    /** Unsafe version of {@link #show_buttons(int) show_buttons}. */
    public static void nshow_buttons(long struct, int value) { UNSAFE.putInt(null, struct + NkStyleScrollbar.SHOW_BUTTONS, value); }
    /** Unsafe version of {@link #inc_button(NkStyleButton) inc_button}. */
    public static void ninc_button(long struct, NkStyleButton value) { memCopy(value.address(), struct + NkStyleScrollbar.INC_BUTTON, NkStyleButton.SIZEOF); }
    /** Unsafe version of {@link #dec_button(NkStyleButton) dec_button}. */
    public static void ndec_button(long struct, NkStyleButton value) { memCopy(value.address(), struct + NkStyleScrollbar.DEC_BUTTON, NkStyleButton.SIZEOF); }
    /** Unsafe version of {@link #inc_symbol(int) inc_symbol}. */
    public static void ninc_symbol(long struct, int value) { UNSAFE.putInt(null, struct + NkStyleScrollbar.INC_SYMBOL, value); }
    /** Unsafe version of {@link #dec_symbol(int) dec_symbol}. */
    public static void ndec_symbol(long struct, int value) { UNSAFE.putInt(null, struct + NkStyleScrollbar.DEC_SYMBOL, value); }
    /** Unsafe version of {@link #userdata(NkHandle) userdata}. */
    public static void nuserdata(long struct, NkHandle value) { memCopy(value.address(), struct + NkStyleScrollbar.USERDATA, NkHandle.SIZEOF); }
    /** Unsafe version of {@link #draw_begin(NkDrawBeginCallbackI) draw_begin}. */
    public static void ndraw_begin(long struct, @Nullable NkDrawBeginCallbackI value) { memPutAddress(struct + NkStyleScrollbar.DRAW_BEGIN, memAddressSafe(value)); }
    /** Unsafe version of {@link #draw_end(NkDrawEndCallbackI) draw_end}. */
    public static void ndraw_end(long struct, @Nullable NkDrawEndCallbackI value) { memPutAddress(struct + NkStyleScrollbar.DRAW_END, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link NkStyleScrollbar} structs. */
    public static class Buffer extends StructBuffer<NkStyleScrollbar, Buffer> implements NativeResource {

        private static final NkStyleScrollbar ELEMENT_FACTORY = NkStyleScrollbar.create(-1L);

        /**
         * Creates a new {@code NkStyleScrollbar.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkStyleScrollbar#SIZEOF}, and its mark will be undefined.
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
        protected NkStyleScrollbar getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link NkStyleItem} view of the {@code normal} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem normal() { return NkStyleScrollbar.nnormal(address()); }
        /** Returns a {@link NkStyleItem} view of the {@code hover} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem hover() { return NkStyleScrollbar.nhover(address()); }
        /** Returns a {@link NkStyleItem} view of the {@code active} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem active() { return NkStyleScrollbar.nactive(address()); }
        /** Returns a {@link NkColor} view of the {@code border_color} field. */
        @NativeType("struct nk_color")
        public NkColor border_color() { return NkStyleScrollbar.nborder_color(address()); }
        /** Returns a {@link NkStyleItem} view of the {@code cursor_normal} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem cursor_normal() { return NkStyleScrollbar.ncursor_normal(address()); }
        /** Returns a {@link NkStyleItem} view of the {@code cursor_hover} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem cursor_hover() { return NkStyleScrollbar.ncursor_hover(address()); }
        /** Returns a {@link NkStyleItem} view of the {@code cursor_active} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem cursor_active() { return NkStyleScrollbar.ncursor_active(address()); }
        /** Returns a {@link NkColor} view of the {@code cursor_border_color} field. */
        @NativeType("struct nk_color")
        public NkColor cursor_border_color() { return NkStyleScrollbar.ncursor_border_color(address()); }
        /** Returns the value of the {@code border} field. */
        public float border() { return NkStyleScrollbar.nborder(address()); }
        /** Returns the value of the {@code rounding} field. */
        public float rounding() { return NkStyleScrollbar.nrounding(address()); }
        /** Returns the value of the {@code border_cursor} field. */
        public float border_cursor() { return NkStyleScrollbar.nborder_cursor(address()); }
        /** Returns the value of the {@code rounding_cursor} field. */
        public float rounding_cursor() { return NkStyleScrollbar.nrounding_cursor(address()); }
        /** Returns a {@link NkVec2} view of the {@code padding} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 padding() { return NkStyleScrollbar.npadding(address()); }
        /** Returns the value of the {@code show_buttons} field. */
        public int show_buttons() { return NkStyleScrollbar.nshow_buttons(address()); }
        /** Returns a {@link NkStyleButton} view of the {@code inc_button} field. */
        @NativeType("struct nk_style_button")
        public NkStyleButton inc_button() { return NkStyleScrollbar.ninc_button(address()); }
        /** Returns a {@link NkStyleButton} view of the {@code dec_button} field. */
        @NativeType("struct nk_style_button")
        public NkStyleButton dec_button() { return NkStyleScrollbar.ndec_button(address()); }
        /** Returns the value of the {@code inc_symbol} field. */
        @NativeType("enum nk_symbol_type")
        public int inc_symbol() { return NkStyleScrollbar.ninc_symbol(address()); }
        /** Returns the value of the {@code dec_symbol} field. */
        @NativeType("enum nk_symbol_type")
        public int dec_symbol() { return NkStyleScrollbar.ndec_symbol(address()); }
        /** Returns a {@link NkHandle} view of the {@code userdata} field. */
        @NativeType("nk_handle")
        public NkHandle userdata() { return NkStyleScrollbar.nuserdata(address()); }
        /** Returns the value of the {@code draw_begin} field. */
        @Nullable
        @NativeType("nk_draw_begin")
        public NkDrawBeginCallback draw_begin() { return NkStyleScrollbar.ndraw_begin(address()); }
        /** Returns the value of the {@code draw_end} field. */
        @Nullable
        @NativeType("nk_draw_end")
        public NkDrawEndCallback draw_end() { return NkStyleScrollbar.ndraw_end(address()); }

        /** Copies the specified {@link NkStyleItem} to the {@code normal} field. */
        public NkStyleScrollbar.Buffer normal(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleScrollbar.nnormal(address(), value); return this; }
        /** Passes the {@code normal} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleScrollbar.Buffer normal(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(normal()); return this; }
        /** Copies the specified {@link NkStyleItem} to the {@code hover} field. */
        public NkStyleScrollbar.Buffer hover(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleScrollbar.nhover(address(), value); return this; }
        /** Passes the {@code hover} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleScrollbar.Buffer hover(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(hover()); return this; }
        /** Copies the specified {@link NkStyleItem} to the {@code active} field. */
        public NkStyleScrollbar.Buffer active(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleScrollbar.nactive(address(), value); return this; }
        /** Passes the {@code active} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleScrollbar.Buffer active(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(active()); return this; }
        /** Copies the specified {@link NkColor} to the {@code border_color} field. */
        public NkStyleScrollbar.Buffer border_color(@NativeType("struct nk_color") NkColor value) { NkStyleScrollbar.nborder_color(address(), value); return this; }
        /** Passes the {@code border_color} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleScrollbar.Buffer border_color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(border_color()); return this; }
        /** Copies the specified {@link NkStyleItem} to the {@code cursor_normal} field. */
        public NkStyleScrollbar.Buffer cursor_normal(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleScrollbar.ncursor_normal(address(), value); return this; }
        /** Passes the {@code cursor_normal} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleScrollbar.Buffer cursor_normal(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(cursor_normal()); return this; }
        /** Copies the specified {@link NkStyleItem} to the {@code cursor_hover} field. */
        public NkStyleScrollbar.Buffer cursor_hover(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleScrollbar.ncursor_hover(address(), value); return this; }
        /** Passes the {@code cursor_hover} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleScrollbar.Buffer cursor_hover(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(cursor_hover()); return this; }
        /** Copies the specified {@link NkStyleItem} to the {@code cursor_active} field. */
        public NkStyleScrollbar.Buffer cursor_active(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleScrollbar.ncursor_active(address(), value); return this; }
        /** Passes the {@code cursor_active} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleScrollbar.Buffer cursor_active(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(cursor_active()); return this; }
        /** Copies the specified {@link NkColor} to the {@code cursor_border_color} field. */
        public NkStyleScrollbar.Buffer cursor_border_color(@NativeType("struct nk_color") NkColor value) { NkStyleScrollbar.ncursor_border_color(address(), value); return this; }
        /** Passes the {@code cursor_border_color} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleScrollbar.Buffer cursor_border_color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(cursor_border_color()); return this; }
        /** Sets the specified value to the {@code border} field. */
        public NkStyleScrollbar.Buffer border(float value) { NkStyleScrollbar.nborder(address(), value); return this; }
        /** Sets the specified value to the {@code rounding} field. */
        public NkStyleScrollbar.Buffer rounding(float value) { NkStyleScrollbar.nrounding(address(), value); return this; }
        /** Sets the specified value to the {@code border_cursor} field. */
        public NkStyleScrollbar.Buffer border_cursor(float value) { NkStyleScrollbar.nborder_cursor(address(), value); return this; }
        /** Sets the specified value to the {@code rounding_cursor} field. */
        public NkStyleScrollbar.Buffer rounding_cursor(float value) { NkStyleScrollbar.nrounding_cursor(address(), value); return this; }
        /** Copies the specified {@link NkVec2} to the {@code padding} field. */
        public NkStyleScrollbar.Buffer padding(@NativeType("struct nk_vec2") NkVec2 value) { NkStyleScrollbar.npadding(address(), value); return this; }
        /** Passes the {@code padding} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleScrollbar.Buffer padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(padding()); return this; }
        /** Sets the specified value to the {@code show_buttons} field. */
        public NkStyleScrollbar.Buffer show_buttons(int value) { NkStyleScrollbar.nshow_buttons(address(), value); return this; }
        /** Copies the specified {@link NkStyleButton} to the {@code inc_button} field. */
        public NkStyleScrollbar.Buffer inc_button(@NativeType("struct nk_style_button") NkStyleButton value) { NkStyleScrollbar.ninc_button(address(), value); return this; }
        /** Passes the {@code inc_button} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleScrollbar.Buffer inc_button(java.util.function.Consumer<NkStyleButton> consumer) { consumer.accept(inc_button()); return this; }
        /** Copies the specified {@link NkStyleButton} to the {@code dec_button} field. */
        public NkStyleScrollbar.Buffer dec_button(@NativeType("struct nk_style_button") NkStyleButton value) { NkStyleScrollbar.ndec_button(address(), value); return this; }
        /** Passes the {@code dec_button} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleScrollbar.Buffer dec_button(java.util.function.Consumer<NkStyleButton> consumer) { consumer.accept(dec_button()); return this; }
        /** Sets the specified value to the {@code inc_symbol} field. */
        public NkStyleScrollbar.Buffer inc_symbol(@NativeType("enum nk_symbol_type") int value) { NkStyleScrollbar.ninc_symbol(address(), value); return this; }
        /** Sets the specified value to the {@code dec_symbol} field. */
        public NkStyleScrollbar.Buffer dec_symbol(@NativeType("enum nk_symbol_type") int value) { NkStyleScrollbar.ndec_symbol(address(), value); return this; }
        /** Copies the specified {@link NkHandle} to the {@code userdata} field. */
        public NkStyleScrollbar.Buffer userdata(@NativeType("nk_handle") NkHandle value) { NkStyleScrollbar.nuserdata(address(), value); return this; }
        /** Passes the {@code userdata} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleScrollbar.Buffer userdata(java.util.function.Consumer<NkHandle> consumer) { consumer.accept(userdata()); return this; }
        /** Sets the specified value to the {@code draw_begin} field. */
        public NkStyleScrollbar.Buffer draw_begin(@Nullable @NativeType("nk_draw_begin") NkDrawBeginCallbackI value) { NkStyleScrollbar.ndraw_begin(address(), value); return this; }
        /** Sets the specified value to the {@code draw_end} field. */
        public NkStyleScrollbar.Buffer draw_end(@Nullable @NativeType("nk_draw_end") NkDrawEndCallbackI value) { NkStyleScrollbar.ndraw_end(address(), value); return this; }

    }

}