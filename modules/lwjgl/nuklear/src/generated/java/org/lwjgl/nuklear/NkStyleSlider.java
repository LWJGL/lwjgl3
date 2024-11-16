/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct nk_style_slider {
 *     {@link NkStyleItem struct nk_style_item} normal;
 *     {@link NkStyleItem struct nk_style_item} hover;
 *     {@link NkStyleItem struct nk_style_item} active;
 *     {@link NkColor struct nk_color} border_color;
 *     {@link NkColor struct nk_color} bar_normal;
 *     {@link NkColor struct nk_color} bar_hover;
 *     {@link NkColor struct nk_color} bar_active;
 *     {@link NkColor struct nk_color} bar_filled;
 *     {@link NkStyleItem struct nk_style_item} cursor_normal;
 *     {@link NkStyleItem struct nk_style_item} cursor_hover;
 *     {@link NkStyleItem struct nk_style_item} cursor_active;
 *     float border;
 *     float rounding;
 *     float bar_height;
 *     {@link NkVec2 struct nk_vec2} padding;
 *     {@link NkVec2 struct nk_vec2} spacing;
 *     {@link NkVec2 struct nk_vec2} cursor_size;
 *     float color_factor;
 *     float disabled_factor;
 *     int show_buttons;
 *     {@link NkStyleButton struct nk_style_button} inc_button;
 *     {@link NkStyleButton struct nk_style_button} dec_button;
 *     enum nk_symbol_type {@link #inc_symbol};
 *     enum nk_symbol_type {@link #dec_symbol};
 *     {@link NkHandle nk_handle} userdata;
 *     {@link NkDrawBeginCallbackI nk_draw_begin} draw_begin;
 *     {@link NkDrawEndCallbackI nk_draw_end} draw_end;
 * }</code></pre>
 */
@NativeType("struct nk_style_slider")
public class NkStyleSlider extends Struct<NkStyleSlider> implements NativeResource {

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
        BAR_NORMAL,
        BAR_HOVER,
        BAR_ACTIVE,
        BAR_FILLED,
        CURSOR_NORMAL,
        CURSOR_HOVER,
        CURSOR_ACTIVE,
        BORDER,
        ROUNDING,
        BAR_HEIGHT,
        PADDING,
        SPACING,
        CURSOR_SIZE,
        COLOR_FACTOR,
        DISABLED_FACTOR,
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
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(NkStyleItem.SIZEOF, NkStyleItem.ALIGNOF),
            __member(NkStyleItem.SIZEOF, NkStyleItem.ALIGNOF),
            __member(NkStyleItem.SIZEOF, NkStyleItem.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
            __member(4),
            __member(4),
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
        BAR_NORMAL = layout.offsetof(4);
        BAR_HOVER = layout.offsetof(5);
        BAR_ACTIVE = layout.offsetof(6);
        BAR_FILLED = layout.offsetof(7);
        CURSOR_NORMAL = layout.offsetof(8);
        CURSOR_HOVER = layout.offsetof(9);
        CURSOR_ACTIVE = layout.offsetof(10);
        BORDER = layout.offsetof(11);
        ROUNDING = layout.offsetof(12);
        BAR_HEIGHT = layout.offsetof(13);
        PADDING = layout.offsetof(14);
        SPACING = layout.offsetof(15);
        CURSOR_SIZE = layout.offsetof(16);
        COLOR_FACTOR = layout.offsetof(17);
        DISABLED_FACTOR = layout.offsetof(18);
        SHOW_BUTTONS = layout.offsetof(19);
        INC_BUTTON = layout.offsetof(20);
        DEC_BUTTON = layout.offsetof(21);
        INC_SYMBOL = layout.offsetof(22);
        DEC_SYMBOL = layout.offsetof(23);
        USERDATA = layout.offsetof(24);
        DRAW_BEGIN = layout.offsetof(25);
        DRAW_END = layout.offsetof(26);
    }

    protected NkStyleSlider(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NkStyleSlider create(long address, @Nullable ByteBuffer container) {
        return new NkStyleSlider(address, container);
    }

    /**
     * Creates a {@code NkStyleSlider} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkStyleSlider(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link NkStyleItem} view of the {@code normal} field. */
    @NativeType("struct nk_style_item")
    public NkStyleItem normal() { return nnormal(address()); }
    /** @return a {@link NkStyleItem} view of the {@code hover} field. */
    @NativeType("struct nk_style_item")
    public NkStyleItem hover() { return nhover(address()); }
    /** @return a {@link NkStyleItem} view of the {@code active} field. */
    @NativeType("struct nk_style_item")
    public NkStyleItem active() { return nactive(address()); }
    /** @return a {@link NkColor} view of the {@code border_color} field. */
    @NativeType("struct nk_color")
    public NkColor border_color() { return nborder_color(address()); }
    /** @return a {@link NkColor} view of the {@code bar_normal} field. */
    @NativeType("struct nk_color")
    public NkColor bar_normal() { return nbar_normal(address()); }
    /** @return a {@link NkColor} view of the {@code bar_hover} field. */
    @NativeType("struct nk_color")
    public NkColor bar_hover() { return nbar_hover(address()); }
    /** @return a {@link NkColor} view of the {@code bar_active} field. */
    @NativeType("struct nk_color")
    public NkColor bar_active() { return nbar_active(address()); }
    /** @return a {@link NkColor} view of the {@code bar_filled} field. */
    @NativeType("struct nk_color")
    public NkColor bar_filled() { return nbar_filled(address()); }
    /** @return a {@link NkStyleItem} view of the {@code cursor_normal} field. */
    @NativeType("struct nk_style_item")
    public NkStyleItem cursor_normal() { return ncursor_normal(address()); }
    /** @return a {@link NkStyleItem} view of the {@code cursor_hover} field. */
    @NativeType("struct nk_style_item")
    public NkStyleItem cursor_hover() { return ncursor_hover(address()); }
    /** @return a {@link NkStyleItem} view of the {@code cursor_active} field. */
    @NativeType("struct nk_style_item")
    public NkStyleItem cursor_active() { return ncursor_active(address()); }
    /** @return the value of the {@code border} field. */
    public float border() { return nborder(address()); }
    /** @return the value of the {@code rounding} field. */
    public float rounding() { return nrounding(address()); }
    /** @return the value of the {@code bar_height} field. */
    public float bar_height() { return nbar_height(address()); }
    /** @return a {@link NkVec2} view of the {@code padding} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 padding() { return npadding(address()); }
    /** @return a {@link NkVec2} view of the {@code spacing} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 spacing() { return nspacing(address()); }
    /** @return a {@link NkVec2} view of the {@code cursor_size} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 cursor_size() { return ncursor_size(address()); }
    /** @return the value of the {@code color_factor} field. */
    public float color_factor() { return ncolor_factor(address()); }
    /** @return the value of the {@code disabled_factor} field. */
    public float disabled_factor() { return ndisabled_factor(address()); }
    /** @return the value of the {@code show_buttons} field. */
    public int show_buttons() { return nshow_buttons(address()); }
    /** @return a {@link NkStyleButton} view of the {@code inc_button} field. */
    @NativeType("struct nk_style_button")
    public NkStyleButton inc_button() { return ninc_button(address()); }
    /** @return a {@link NkStyleButton} view of the {@code dec_button} field. */
    @NativeType("struct nk_style_button")
    public NkStyleButton dec_button() { return ndec_button(address()); }
    /** one of:<br><table><tr><td>{@link Nuklear#NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link Nuklear#NK_SYMBOL_X SYMBOL_X}</td><td>{@link Nuklear#NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link Nuklear#NK_SYMBOL_CIRCLE_SOLID SYMBOL_CIRCLE_SOLID}</td></tr><tr><td>{@link Nuklear#NK_SYMBOL_CIRCLE_OUTLINE SYMBOL_CIRCLE_OUTLINE}</td><td>{@link Nuklear#NK_SYMBOL_RECT_SOLID SYMBOL_RECT_SOLID}</td><td>{@link Nuklear#NK_SYMBOL_RECT_OUTLINE SYMBOL_RECT_OUTLINE}</td><td>{@link Nuklear#NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td></tr><tr><td>{@link Nuklear#NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link Nuklear#NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td><td>{@link Nuklear#NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link Nuklear#NK_SYMBOL_PLUS SYMBOL_PLUS}</td></tr><tr><td>{@link Nuklear#NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link Nuklear#NK_SYMBOL_TRIANGLE_UP_OUTLINE SYMBOL_TRIANGLE_UP_OUTLINE}</td><td>{@link Nuklear#NK_SYMBOL_TRIANGLE_DOWN_OUTLINE SYMBOL_TRIANGLE_DOWN_OUTLINE}</td><td>{@link Nuklear#NK_SYMBOL_TRIANGLE_LEFT_OUTLINE SYMBOL_TRIANGLE_LEFT_OUTLINE}</td></tr><tr><td>{@link Nuklear#NK_SYMBOL_TRIANGLE_RIGHT_OUTLINE SYMBOL_TRIANGLE_RIGHT_OUTLINE}</td><td>{@link Nuklear#NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table> */
    @NativeType("enum nk_symbol_type")
    public int inc_symbol() { return ninc_symbol(address()); }
    /** see {@code inc_symbol} */
    @NativeType("enum nk_symbol_type")
    public int dec_symbol() { return ndec_symbol(address()); }
    /** @return a {@link NkHandle} view of the {@code userdata} field. */
    @NativeType("nk_handle")
    public NkHandle userdata() { return nuserdata(address()); }
    /** @return the value of the {@code draw_begin} field. */
    @NativeType("nk_draw_begin")
    public @Nullable NkDrawBeginCallback draw_begin() { return ndraw_begin(address()); }
    /** @return the value of the {@code draw_end} field. */
    @NativeType("nk_draw_end")
    public @Nullable NkDrawEndCallback draw_end() { return ndraw_end(address()); }

    /** Copies the specified {@link NkStyleItem} to the {@code normal} field. */
    public NkStyleSlider normal(@NativeType("struct nk_style_item") NkStyleItem value) { nnormal(address(), value); return this; }
    /** Passes the {@code normal} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleSlider normal(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(normal()); return this; }
    /** Copies the specified {@link NkStyleItem} to the {@code hover} field. */
    public NkStyleSlider hover(@NativeType("struct nk_style_item") NkStyleItem value) { nhover(address(), value); return this; }
    /** Passes the {@code hover} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleSlider hover(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(hover()); return this; }
    /** Copies the specified {@link NkStyleItem} to the {@code active} field. */
    public NkStyleSlider active(@NativeType("struct nk_style_item") NkStyleItem value) { nactive(address(), value); return this; }
    /** Passes the {@code active} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleSlider active(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(active()); return this; }
    /** Copies the specified {@link NkColor} to the {@code border_color} field. */
    public NkStyleSlider border_color(@NativeType("struct nk_color") NkColor value) { nborder_color(address(), value); return this; }
    /** Passes the {@code border_color} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleSlider border_color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(border_color()); return this; }
    /** Copies the specified {@link NkColor} to the {@code bar_normal} field. */
    public NkStyleSlider bar_normal(@NativeType("struct nk_color") NkColor value) { nbar_normal(address(), value); return this; }
    /** Passes the {@code bar_normal} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleSlider bar_normal(java.util.function.Consumer<NkColor> consumer) { consumer.accept(bar_normal()); return this; }
    /** Copies the specified {@link NkColor} to the {@code bar_hover} field. */
    public NkStyleSlider bar_hover(@NativeType("struct nk_color") NkColor value) { nbar_hover(address(), value); return this; }
    /** Passes the {@code bar_hover} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleSlider bar_hover(java.util.function.Consumer<NkColor> consumer) { consumer.accept(bar_hover()); return this; }
    /** Copies the specified {@link NkColor} to the {@code bar_active} field. */
    public NkStyleSlider bar_active(@NativeType("struct nk_color") NkColor value) { nbar_active(address(), value); return this; }
    /** Passes the {@code bar_active} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleSlider bar_active(java.util.function.Consumer<NkColor> consumer) { consumer.accept(bar_active()); return this; }
    /** Copies the specified {@link NkColor} to the {@code bar_filled} field. */
    public NkStyleSlider bar_filled(@NativeType("struct nk_color") NkColor value) { nbar_filled(address(), value); return this; }
    /** Passes the {@code bar_filled} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleSlider bar_filled(java.util.function.Consumer<NkColor> consumer) { consumer.accept(bar_filled()); return this; }
    /** Copies the specified {@link NkStyleItem} to the {@code cursor_normal} field. */
    public NkStyleSlider cursor_normal(@NativeType("struct nk_style_item") NkStyleItem value) { ncursor_normal(address(), value); return this; }
    /** Passes the {@code cursor_normal} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleSlider cursor_normal(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(cursor_normal()); return this; }
    /** Copies the specified {@link NkStyleItem} to the {@code cursor_hover} field. */
    public NkStyleSlider cursor_hover(@NativeType("struct nk_style_item") NkStyleItem value) { ncursor_hover(address(), value); return this; }
    /** Passes the {@code cursor_hover} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleSlider cursor_hover(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(cursor_hover()); return this; }
    /** Copies the specified {@link NkStyleItem} to the {@code cursor_active} field. */
    public NkStyleSlider cursor_active(@NativeType("struct nk_style_item") NkStyleItem value) { ncursor_active(address(), value); return this; }
    /** Passes the {@code cursor_active} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleSlider cursor_active(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(cursor_active()); return this; }
    /** Sets the specified value to the {@code border} field. */
    public NkStyleSlider border(float value) { nborder(address(), value); return this; }
    /** Sets the specified value to the {@code rounding} field. */
    public NkStyleSlider rounding(float value) { nrounding(address(), value); return this; }
    /** Sets the specified value to the {@code bar_height} field. */
    public NkStyleSlider bar_height(float value) { nbar_height(address(), value); return this; }
    /** Copies the specified {@link NkVec2} to the {@code padding} field. */
    public NkStyleSlider padding(@NativeType("struct nk_vec2") NkVec2 value) { npadding(address(), value); return this; }
    /** Passes the {@code padding} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleSlider padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(padding()); return this; }
    /** Copies the specified {@link NkVec2} to the {@code spacing} field. */
    public NkStyleSlider spacing(@NativeType("struct nk_vec2") NkVec2 value) { nspacing(address(), value); return this; }
    /** Passes the {@code spacing} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleSlider spacing(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(spacing()); return this; }
    /** Copies the specified {@link NkVec2} to the {@code cursor_size} field. */
    public NkStyleSlider cursor_size(@NativeType("struct nk_vec2") NkVec2 value) { ncursor_size(address(), value); return this; }
    /** Passes the {@code cursor_size} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleSlider cursor_size(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(cursor_size()); return this; }
    /** Sets the specified value to the {@code color_factor} field. */
    public NkStyleSlider color_factor(float value) { ncolor_factor(address(), value); return this; }
    /** Sets the specified value to the {@code disabled_factor} field. */
    public NkStyleSlider disabled_factor(float value) { ndisabled_factor(address(), value); return this; }
    /** Sets the specified value to the {@code show_buttons} field. */
    public NkStyleSlider show_buttons(int value) { nshow_buttons(address(), value); return this; }
    /** Copies the specified {@link NkStyleButton} to the {@code inc_button} field. */
    public NkStyleSlider inc_button(@NativeType("struct nk_style_button") NkStyleButton value) { ninc_button(address(), value); return this; }
    /** Passes the {@code inc_button} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleSlider inc_button(java.util.function.Consumer<NkStyleButton> consumer) { consumer.accept(inc_button()); return this; }
    /** Copies the specified {@link NkStyleButton} to the {@code dec_button} field. */
    public NkStyleSlider dec_button(@NativeType("struct nk_style_button") NkStyleButton value) { ndec_button(address(), value); return this; }
    /** Passes the {@code dec_button} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleSlider dec_button(java.util.function.Consumer<NkStyleButton> consumer) { consumer.accept(dec_button()); return this; }
    /** Sets the specified value to the {@link #inc_symbol} field. */
    public NkStyleSlider inc_symbol(@NativeType("enum nk_symbol_type") int value) { ninc_symbol(address(), value); return this; }
    /** Sets the specified value to the {@link #dec_symbol} field. */
    public NkStyleSlider dec_symbol(@NativeType("enum nk_symbol_type") int value) { ndec_symbol(address(), value); return this; }
    /** Copies the specified {@link NkHandle} to the {@code userdata} field. */
    public NkStyleSlider userdata(@NativeType("nk_handle") NkHandle value) { nuserdata(address(), value); return this; }
    /** Passes the {@code userdata} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleSlider userdata(java.util.function.Consumer<NkHandle> consumer) { consumer.accept(userdata()); return this; }
    /** Sets the specified value to the {@code draw_begin} field. */
    public NkStyleSlider draw_begin(@Nullable @NativeType("nk_draw_begin") NkDrawBeginCallbackI value) { ndraw_begin(address(), value); return this; }
    /** Sets the specified value to the {@code draw_end} field. */
    public NkStyleSlider draw_end(@Nullable @NativeType("nk_draw_end") NkDrawEndCallbackI value) { ndraw_end(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public NkStyleSlider set(
        NkStyleItem normal,
        NkStyleItem hover,
        NkStyleItem active,
        NkColor border_color,
        NkColor bar_normal,
        NkColor bar_hover,
        NkColor bar_active,
        NkColor bar_filled,
        NkStyleItem cursor_normal,
        NkStyleItem cursor_hover,
        NkStyleItem cursor_active,
        float border,
        float rounding,
        float bar_height,
        NkVec2 padding,
        NkVec2 spacing,
        NkVec2 cursor_size,
        float color_factor,
        float disabled_factor,
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
        bar_normal(bar_normal);
        bar_hover(bar_hover);
        bar_active(bar_active);
        bar_filled(bar_filled);
        cursor_normal(cursor_normal);
        cursor_hover(cursor_hover);
        cursor_active(cursor_active);
        border(border);
        rounding(rounding);
        bar_height(bar_height);
        padding(padding);
        spacing(spacing);
        cursor_size(cursor_size);
        color_factor(color_factor);
        disabled_factor(disabled_factor);
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
    public NkStyleSlider set(NkStyleSlider src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code NkStyleSlider} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkStyleSlider malloc() {
        return new NkStyleSlider(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code NkStyleSlider} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkStyleSlider calloc() {
        return new NkStyleSlider(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code NkStyleSlider} instance allocated with {@link BufferUtils}. */
    public static NkStyleSlider create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new NkStyleSlider(memAddress(container), container);
    }

    /** Returns a new {@code NkStyleSlider} instance for the specified memory address. */
    public static NkStyleSlider create(long address) {
        return new NkStyleSlider(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable NkStyleSlider createSafe(long address) {
        return address == NULL ? null : new NkStyleSlider(address, null);
    }

    /**
     * Returns a new {@link NkStyleSlider.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleSlider.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NkStyleSlider.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleSlider.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkStyleSlider.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleSlider.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link NkStyleSlider.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkStyleSlider.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static NkStyleSlider.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static NkStyleSlider mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static NkStyleSlider callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static NkStyleSlider mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static NkStyleSlider callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static NkStyleSlider.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static NkStyleSlider.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static NkStyleSlider.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static NkStyleSlider.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code NkStyleSlider} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkStyleSlider malloc(MemoryStack stack) {
        return new NkStyleSlider(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code NkStyleSlider} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkStyleSlider calloc(MemoryStack stack) {
        return new NkStyleSlider(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link NkStyleSlider.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkStyleSlider.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkStyleSlider.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkStyleSlider.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #normal}. */
    public static NkStyleItem nnormal(long struct) { return NkStyleItem.create(struct + NkStyleSlider.NORMAL); }
    /** Unsafe version of {@link #hover}. */
    public static NkStyleItem nhover(long struct) { return NkStyleItem.create(struct + NkStyleSlider.HOVER); }
    /** Unsafe version of {@link #active}. */
    public static NkStyleItem nactive(long struct) { return NkStyleItem.create(struct + NkStyleSlider.ACTIVE); }
    /** Unsafe version of {@link #border_color}. */
    public static NkColor nborder_color(long struct) { return NkColor.create(struct + NkStyleSlider.BORDER_COLOR); }
    /** Unsafe version of {@link #bar_normal}. */
    public static NkColor nbar_normal(long struct) { return NkColor.create(struct + NkStyleSlider.BAR_NORMAL); }
    /** Unsafe version of {@link #bar_hover}. */
    public static NkColor nbar_hover(long struct) { return NkColor.create(struct + NkStyleSlider.BAR_HOVER); }
    /** Unsafe version of {@link #bar_active}. */
    public static NkColor nbar_active(long struct) { return NkColor.create(struct + NkStyleSlider.BAR_ACTIVE); }
    /** Unsafe version of {@link #bar_filled}. */
    public static NkColor nbar_filled(long struct) { return NkColor.create(struct + NkStyleSlider.BAR_FILLED); }
    /** Unsafe version of {@link #cursor_normal}. */
    public static NkStyleItem ncursor_normal(long struct) { return NkStyleItem.create(struct + NkStyleSlider.CURSOR_NORMAL); }
    /** Unsafe version of {@link #cursor_hover}. */
    public static NkStyleItem ncursor_hover(long struct) { return NkStyleItem.create(struct + NkStyleSlider.CURSOR_HOVER); }
    /** Unsafe version of {@link #cursor_active}. */
    public static NkStyleItem ncursor_active(long struct) { return NkStyleItem.create(struct + NkStyleSlider.CURSOR_ACTIVE); }
    /** Unsafe version of {@link #border}. */
    public static float nborder(long struct) { return memGetFloat(struct + NkStyleSlider.BORDER); }
    /** Unsafe version of {@link #rounding}. */
    public static float nrounding(long struct) { return memGetFloat(struct + NkStyleSlider.ROUNDING); }
    /** Unsafe version of {@link #bar_height}. */
    public static float nbar_height(long struct) { return memGetFloat(struct + NkStyleSlider.BAR_HEIGHT); }
    /** Unsafe version of {@link #padding}. */
    public static NkVec2 npadding(long struct) { return NkVec2.create(struct + NkStyleSlider.PADDING); }
    /** Unsafe version of {@link #spacing}. */
    public static NkVec2 nspacing(long struct) { return NkVec2.create(struct + NkStyleSlider.SPACING); }
    /** Unsafe version of {@link #cursor_size}. */
    public static NkVec2 ncursor_size(long struct) { return NkVec2.create(struct + NkStyleSlider.CURSOR_SIZE); }
    /** Unsafe version of {@link #color_factor}. */
    public static float ncolor_factor(long struct) { return memGetFloat(struct + NkStyleSlider.COLOR_FACTOR); }
    /** Unsafe version of {@link #disabled_factor}. */
    public static float ndisabled_factor(long struct) { return memGetFloat(struct + NkStyleSlider.DISABLED_FACTOR); }
    /** Unsafe version of {@link #show_buttons}. */
    public static int nshow_buttons(long struct) { return memGetInt(struct + NkStyleSlider.SHOW_BUTTONS); }
    /** Unsafe version of {@link #inc_button}. */
    public static NkStyleButton ninc_button(long struct) { return NkStyleButton.create(struct + NkStyleSlider.INC_BUTTON); }
    /** Unsafe version of {@link #dec_button}. */
    public static NkStyleButton ndec_button(long struct) { return NkStyleButton.create(struct + NkStyleSlider.DEC_BUTTON); }
    /** Unsafe version of {@link #inc_symbol}. */
    public static int ninc_symbol(long struct) { return memGetInt(struct + NkStyleSlider.INC_SYMBOL); }
    /** Unsafe version of {@link #dec_symbol}. */
    public static int ndec_symbol(long struct) { return memGetInt(struct + NkStyleSlider.DEC_SYMBOL); }
    /** Unsafe version of {@link #userdata}. */
    public static NkHandle nuserdata(long struct) { return NkHandle.create(struct + NkStyleSlider.USERDATA); }
    /** Unsafe version of {@link #draw_begin}. */
    public static @Nullable NkDrawBeginCallback ndraw_begin(long struct) { return NkDrawBeginCallback.createSafe(memGetAddress(struct + NkStyleSlider.DRAW_BEGIN)); }
    /** Unsafe version of {@link #draw_end}. */
    public static @Nullable NkDrawEndCallback ndraw_end(long struct) { return NkDrawEndCallback.createSafe(memGetAddress(struct + NkStyleSlider.DRAW_END)); }

    /** Unsafe version of {@link #normal(NkStyleItem) normal}. */
    public static void nnormal(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleSlider.NORMAL, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #hover(NkStyleItem) hover}. */
    public static void nhover(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleSlider.HOVER, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #active(NkStyleItem) active}. */
    public static void nactive(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleSlider.ACTIVE, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #border_color(NkColor) border_color}. */
    public static void nborder_color(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleSlider.BORDER_COLOR, NkColor.SIZEOF); }
    /** Unsafe version of {@link #bar_normal(NkColor) bar_normal}. */
    public static void nbar_normal(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleSlider.BAR_NORMAL, NkColor.SIZEOF); }
    /** Unsafe version of {@link #bar_hover(NkColor) bar_hover}. */
    public static void nbar_hover(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleSlider.BAR_HOVER, NkColor.SIZEOF); }
    /** Unsafe version of {@link #bar_active(NkColor) bar_active}. */
    public static void nbar_active(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleSlider.BAR_ACTIVE, NkColor.SIZEOF); }
    /** Unsafe version of {@link #bar_filled(NkColor) bar_filled}. */
    public static void nbar_filled(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleSlider.BAR_FILLED, NkColor.SIZEOF); }
    /** Unsafe version of {@link #cursor_normal(NkStyleItem) cursor_normal}. */
    public static void ncursor_normal(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleSlider.CURSOR_NORMAL, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #cursor_hover(NkStyleItem) cursor_hover}. */
    public static void ncursor_hover(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleSlider.CURSOR_HOVER, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #cursor_active(NkStyleItem) cursor_active}. */
    public static void ncursor_active(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleSlider.CURSOR_ACTIVE, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #border(float) border}. */
    public static void nborder(long struct, float value) { memPutFloat(struct + NkStyleSlider.BORDER, value); }
    /** Unsafe version of {@link #rounding(float) rounding}. */
    public static void nrounding(long struct, float value) { memPutFloat(struct + NkStyleSlider.ROUNDING, value); }
    /** Unsafe version of {@link #bar_height(float) bar_height}. */
    public static void nbar_height(long struct, float value) { memPutFloat(struct + NkStyleSlider.BAR_HEIGHT, value); }
    /** Unsafe version of {@link #padding(NkVec2) padding}. */
    public static void npadding(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleSlider.PADDING, NkVec2.SIZEOF); }
    /** Unsafe version of {@link #spacing(NkVec2) spacing}. */
    public static void nspacing(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleSlider.SPACING, NkVec2.SIZEOF); }
    /** Unsafe version of {@link #cursor_size(NkVec2) cursor_size}. */
    public static void ncursor_size(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleSlider.CURSOR_SIZE, NkVec2.SIZEOF); }
    /** Unsafe version of {@link #color_factor(float) color_factor}. */
    public static void ncolor_factor(long struct, float value) { memPutFloat(struct + NkStyleSlider.COLOR_FACTOR, value); }
    /** Unsafe version of {@link #disabled_factor(float) disabled_factor}. */
    public static void ndisabled_factor(long struct, float value) { memPutFloat(struct + NkStyleSlider.DISABLED_FACTOR, value); }
    /** Unsafe version of {@link #show_buttons(int) show_buttons}. */
    public static void nshow_buttons(long struct, int value) { memPutInt(struct + NkStyleSlider.SHOW_BUTTONS, value); }
    /** Unsafe version of {@link #inc_button(NkStyleButton) inc_button}. */
    public static void ninc_button(long struct, NkStyleButton value) { memCopy(value.address(), struct + NkStyleSlider.INC_BUTTON, NkStyleButton.SIZEOF); }
    /** Unsafe version of {@link #dec_button(NkStyleButton) dec_button}. */
    public static void ndec_button(long struct, NkStyleButton value) { memCopy(value.address(), struct + NkStyleSlider.DEC_BUTTON, NkStyleButton.SIZEOF); }
    /** Unsafe version of {@link #inc_symbol(int) inc_symbol}. */
    public static void ninc_symbol(long struct, int value) { memPutInt(struct + NkStyleSlider.INC_SYMBOL, value); }
    /** Unsafe version of {@link #dec_symbol(int) dec_symbol}. */
    public static void ndec_symbol(long struct, int value) { memPutInt(struct + NkStyleSlider.DEC_SYMBOL, value); }
    /** Unsafe version of {@link #userdata(NkHandle) userdata}. */
    public static void nuserdata(long struct, NkHandle value) { memCopy(value.address(), struct + NkStyleSlider.USERDATA, NkHandle.SIZEOF); }
    /** Unsafe version of {@link #draw_begin(NkDrawBeginCallbackI) draw_begin}. */
    public static void ndraw_begin(long struct, @Nullable NkDrawBeginCallbackI value) { memPutAddress(struct + NkStyleSlider.DRAW_BEGIN, memAddressSafe(value)); }
    /** Unsafe version of {@link #draw_end(NkDrawEndCallbackI) draw_end}. */
    public static void ndraw_end(long struct, @Nullable NkDrawEndCallbackI value) { memPutAddress(struct + NkStyleSlider.DRAW_END, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link NkStyleSlider} structs. */
    public static class Buffer extends StructBuffer<NkStyleSlider, Buffer> implements NativeResource {

        private static final NkStyleSlider ELEMENT_FACTORY = NkStyleSlider.create(-1L);

        /**
         * Creates a new {@code NkStyleSlider.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkStyleSlider#SIZEOF}, and its mark will be undefined.</p>
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
        protected NkStyleSlider getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link NkStyleItem} view of the {@code normal} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem normal() { return NkStyleSlider.nnormal(address()); }
        /** @return a {@link NkStyleItem} view of the {@code hover} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem hover() { return NkStyleSlider.nhover(address()); }
        /** @return a {@link NkStyleItem} view of the {@code active} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem active() { return NkStyleSlider.nactive(address()); }
        /** @return a {@link NkColor} view of the {@code border_color} field. */
        @NativeType("struct nk_color")
        public NkColor border_color() { return NkStyleSlider.nborder_color(address()); }
        /** @return a {@link NkColor} view of the {@code bar_normal} field. */
        @NativeType("struct nk_color")
        public NkColor bar_normal() { return NkStyleSlider.nbar_normal(address()); }
        /** @return a {@link NkColor} view of the {@code bar_hover} field. */
        @NativeType("struct nk_color")
        public NkColor bar_hover() { return NkStyleSlider.nbar_hover(address()); }
        /** @return a {@link NkColor} view of the {@code bar_active} field. */
        @NativeType("struct nk_color")
        public NkColor bar_active() { return NkStyleSlider.nbar_active(address()); }
        /** @return a {@link NkColor} view of the {@code bar_filled} field. */
        @NativeType("struct nk_color")
        public NkColor bar_filled() { return NkStyleSlider.nbar_filled(address()); }
        /** @return a {@link NkStyleItem} view of the {@code cursor_normal} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem cursor_normal() { return NkStyleSlider.ncursor_normal(address()); }
        /** @return a {@link NkStyleItem} view of the {@code cursor_hover} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem cursor_hover() { return NkStyleSlider.ncursor_hover(address()); }
        /** @return a {@link NkStyleItem} view of the {@code cursor_active} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem cursor_active() { return NkStyleSlider.ncursor_active(address()); }
        /** @return the value of the {@code border} field. */
        public float border() { return NkStyleSlider.nborder(address()); }
        /** @return the value of the {@code rounding} field. */
        public float rounding() { return NkStyleSlider.nrounding(address()); }
        /** @return the value of the {@code bar_height} field. */
        public float bar_height() { return NkStyleSlider.nbar_height(address()); }
        /** @return a {@link NkVec2} view of the {@code padding} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 padding() { return NkStyleSlider.npadding(address()); }
        /** @return a {@link NkVec2} view of the {@code spacing} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 spacing() { return NkStyleSlider.nspacing(address()); }
        /** @return a {@link NkVec2} view of the {@code cursor_size} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 cursor_size() { return NkStyleSlider.ncursor_size(address()); }
        /** @return the value of the {@code color_factor} field. */
        public float color_factor() { return NkStyleSlider.ncolor_factor(address()); }
        /** @return the value of the {@code disabled_factor} field. */
        public float disabled_factor() { return NkStyleSlider.ndisabled_factor(address()); }
        /** @return the value of the {@code show_buttons} field. */
        public int show_buttons() { return NkStyleSlider.nshow_buttons(address()); }
        /** @return a {@link NkStyleButton} view of the {@code inc_button} field. */
        @NativeType("struct nk_style_button")
        public NkStyleButton inc_button() { return NkStyleSlider.ninc_button(address()); }
        /** @return a {@link NkStyleButton} view of the {@code dec_button} field. */
        @NativeType("struct nk_style_button")
        public NkStyleButton dec_button() { return NkStyleSlider.ndec_button(address()); }
        /** @return the value of the {@link NkStyleSlider#inc_symbol} field. */
        @NativeType("enum nk_symbol_type")
        public int inc_symbol() { return NkStyleSlider.ninc_symbol(address()); }
        /** @return the value of the {@link NkStyleSlider#dec_symbol} field. */
        @NativeType("enum nk_symbol_type")
        public int dec_symbol() { return NkStyleSlider.ndec_symbol(address()); }
        /** @return a {@link NkHandle} view of the {@code userdata} field. */
        @NativeType("nk_handle")
        public NkHandle userdata() { return NkStyleSlider.nuserdata(address()); }
        /** @return the value of the {@code draw_begin} field. */
        @NativeType("nk_draw_begin")
        public @Nullable NkDrawBeginCallback draw_begin() { return NkStyleSlider.ndraw_begin(address()); }
        /** @return the value of the {@code draw_end} field. */
        @NativeType("nk_draw_end")
        public @Nullable NkDrawEndCallback draw_end() { return NkStyleSlider.ndraw_end(address()); }

        /** Copies the specified {@link NkStyleItem} to the {@code normal} field. */
        public NkStyleSlider.Buffer normal(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleSlider.nnormal(address(), value); return this; }
        /** Passes the {@code normal} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleSlider.Buffer normal(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(normal()); return this; }
        /** Copies the specified {@link NkStyleItem} to the {@code hover} field. */
        public NkStyleSlider.Buffer hover(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleSlider.nhover(address(), value); return this; }
        /** Passes the {@code hover} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleSlider.Buffer hover(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(hover()); return this; }
        /** Copies the specified {@link NkStyleItem} to the {@code active} field. */
        public NkStyleSlider.Buffer active(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleSlider.nactive(address(), value); return this; }
        /** Passes the {@code active} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleSlider.Buffer active(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(active()); return this; }
        /** Copies the specified {@link NkColor} to the {@code border_color} field. */
        public NkStyleSlider.Buffer border_color(@NativeType("struct nk_color") NkColor value) { NkStyleSlider.nborder_color(address(), value); return this; }
        /** Passes the {@code border_color} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleSlider.Buffer border_color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(border_color()); return this; }
        /** Copies the specified {@link NkColor} to the {@code bar_normal} field. */
        public NkStyleSlider.Buffer bar_normal(@NativeType("struct nk_color") NkColor value) { NkStyleSlider.nbar_normal(address(), value); return this; }
        /** Passes the {@code bar_normal} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleSlider.Buffer bar_normal(java.util.function.Consumer<NkColor> consumer) { consumer.accept(bar_normal()); return this; }
        /** Copies the specified {@link NkColor} to the {@code bar_hover} field. */
        public NkStyleSlider.Buffer bar_hover(@NativeType("struct nk_color") NkColor value) { NkStyleSlider.nbar_hover(address(), value); return this; }
        /** Passes the {@code bar_hover} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleSlider.Buffer bar_hover(java.util.function.Consumer<NkColor> consumer) { consumer.accept(bar_hover()); return this; }
        /** Copies the specified {@link NkColor} to the {@code bar_active} field. */
        public NkStyleSlider.Buffer bar_active(@NativeType("struct nk_color") NkColor value) { NkStyleSlider.nbar_active(address(), value); return this; }
        /** Passes the {@code bar_active} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleSlider.Buffer bar_active(java.util.function.Consumer<NkColor> consumer) { consumer.accept(bar_active()); return this; }
        /** Copies the specified {@link NkColor} to the {@code bar_filled} field. */
        public NkStyleSlider.Buffer bar_filled(@NativeType("struct nk_color") NkColor value) { NkStyleSlider.nbar_filled(address(), value); return this; }
        /** Passes the {@code bar_filled} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleSlider.Buffer bar_filled(java.util.function.Consumer<NkColor> consumer) { consumer.accept(bar_filled()); return this; }
        /** Copies the specified {@link NkStyleItem} to the {@code cursor_normal} field. */
        public NkStyleSlider.Buffer cursor_normal(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleSlider.ncursor_normal(address(), value); return this; }
        /** Passes the {@code cursor_normal} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleSlider.Buffer cursor_normal(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(cursor_normal()); return this; }
        /** Copies the specified {@link NkStyleItem} to the {@code cursor_hover} field. */
        public NkStyleSlider.Buffer cursor_hover(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleSlider.ncursor_hover(address(), value); return this; }
        /** Passes the {@code cursor_hover} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleSlider.Buffer cursor_hover(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(cursor_hover()); return this; }
        /** Copies the specified {@link NkStyleItem} to the {@code cursor_active} field. */
        public NkStyleSlider.Buffer cursor_active(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleSlider.ncursor_active(address(), value); return this; }
        /** Passes the {@code cursor_active} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleSlider.Buffer cursor_active(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(cursor_active()); return this; }
        /** Sets the specified value to the {@code border} field. */
        public NkStyleSlider.Buffer border(float value) { NkStyleSlider.nborder(address(), value); return this; }
        /** Sets the specified value to the {@code rounding} field. */
        public NkStyleSlider.Buffer rounding(float value) { NkStyleSlider.nrounding(address(), value); return this; }
        /** Sets the specified value to the {@code bar_height} field. */
        public NkStyleSlider.Buffer bar_height(float value) { NkStyleSlider.nbar_height(address(), value); return this; }
        /** Copies the specified {@link NkVec2} to the {@code padding} field. */
        public NkStyleSlider.Buffer padding(@NativeType("struct nk_vec2") NkVec2 value) { NkStyleSlider.npadding(address(), value); return this; }
        /** Passes the {@code padding} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleSlider.Buffer padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(padding()); return this; }
        /** Copies the specified {@link NkVec2} to the {@code spacing} field. */
        public NkStyleSlider.Buffer spacing(@NativeType("struct nk_vec2") NkVec2 value) { NkStyleSlider.nspacing(address(), value); return this; }
        /** Passes the {@code spacing} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleSlider.Buffer spacing(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(spacing()); return this; }
        /** Copies the specified {@link NkVec2} to the {@code cursor_size} field. */
        public NkStyleSlider.Buffer cursor_size(@NativeType("struct nk_vec2") NkVec2 value) { NkStyleSlider.ncursor_size(address(), value); return this; }
        /** Passes the {@code cursor_size} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleSlider.Buffer cursor_size(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(cursor_size()); return this; }
        /** Sets the specified value to the {@code color_factor} field. */
        public NkStyleSlider.Buffer color_factor(float value) { NkStyleSlider.ncolor_factor(address(), value); return this; }
        /** Sets the specified value to the {@code disabled_factor} field. */
        public NkStyleSlider.Buffer disabled_factor(float value) { NkStyleSlider.ndisabled_factor(address(), value); return this; }
        /** Sets the specified value to the {@code show_buttons} field. */
        public NkStyleSlider.Buffer show_buttons(int value) { NkStyleSlider.nshow_buttons(address(), value); return this; }
        /** Copies the specified {@link NkStyleButton} to the {@code inc_button} field. */
        public NkStyleSlider.Buffer inc_button(@NativeType("struct nk_style_button") NkStyleButton value) { NkStyleSlider.ninc_button(address(), value); return this; }
        /** Passes the {@code inc_button} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleSlider.Buffer inc_button(java.util.function.Consumer<NkStyleButton> consumer) { consumer.accept(inc_button()); return this; }
        /** Copies the specified {@link NkStyleButton} to the {@code dec_button} field. */
        public NkStyleSlider.Buffer dec_button(@NativeType("struct nk_style_button") NkStyleButton value) { NkStyleSlider.ndec_button(address(), value); return this; }
        /** Passes the {@code dec_button} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleSlider.Buffer dec_button(java.util.function.Consumer<NkStyleButton> consumer) { consumer.accept(dec_button()); return this; }
        /** Sets the specified value to the {@link NkStyleSlider#inc_symbol} field. */
        public NkStyleSlider.Buffer inc_symbol(@NativeType("enum nk_symbol_type") int value) { NkStyleSlider.ninc_symbol(address(), value); return this; }
        /** Sets the specified value to the {@link NkStyleSlider#dec_symbol} field. */
        public NkStyleSlider.Buffer dec_symbol(@NativeType("enum nk_symbol_type") int value) { NkStyleSlider.ndec_symbol(address(), value); return this; }
        /** Copies the specified {@link NkHandle} to the {@code userdata} field. */
        public NkStyleSlider.Buffer userdata(@NativeType("nk_handle") NkHandle value) { NkStyleSlider.nuserdata(address(), value); return this; }
        /** Passes the {@code userdata} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleSlider.Buffer userdata(java.util.function.Consumer<NkHandle> consumer) { consumer.accept(userdata()); return this; }
        /** Sets the specified value to the {@code draw_begin} field. */
        public NkStyleSlider.Buffer draw_begin(@Nullable @NativeType("nk_draw_begin") NkDrawBeginCallbackI value) { NkStyleSlider.ndraw_begin(address(), value); return this; }
        /** Sets the specified value to the {@code draw_end} field. */
        public NkStyleSlider.Buffer draw_end(@Nullable @NativeType("nk_draw_end") NkDrawEndCallbackI value) { NkStyleSlider.ndraw_end(address(), value); return this; }

    }

}