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
 * struct nk_style_window {
 *     {@link NkStyleWindowHeader struct nk_style_window_header} header;
 *     {@link NkStyleItem struct nk_style_item} fixed_background;
 *     {@link NkColor struct nk_color} background;
 *     {@link NkColor struct nk_color} border_color;
 *     {@link NkColor struct nk_color} popup_border_color;
 *     {@link NkColor struct nk_color} combo_border_color;
 *     {@link NkColor struct nk_color} contextual_border_color;
 *     {@link NkColor struct nk_color} menu_border_color;
 *     {@link NkColor struct nk_color} group_border_color;
 *     {@link NkColor struct nk_color} tooltip_border_color;
 *     {@link NkStyleItem struct nk_style_item} scaler;
 *     float border;
 *     float combo_border;
 *     float contextual_border;
 *     float menu_border;
 *     float group_border;
 *     float tooltip_border;
 *     float popup_border;
 *     float min_row_height_padding;
 *     float rounding;
 *     {@link NkVec2 struct nk_vec2} spacing;
 *     {@link NkVec2 struct nk_vec2} scrollbar_size;
 *     {@link NkVec2 struct nk_vec2} min_size;
 *     {@link NkVec2 struct nk_vec2} padding;
 *     {@link NkVec2 struct nk_vec2} group_padding;
 *     {@link NkVec2 struct nk_vec2} popup_padding;
 *     {@link NkVec2 struct nk_vec2} combo_padding;
 *     {@link NkVec2 struct nk_vec2} contextual_padding;
 *     {@link NkVec2 struct nk_vec2} menu_padding;
 *     {@link NkVec2 struct nk_vec2} tooltip_padding;
 * }</code></pre>
 */
@NativeType("struct nk_style_window")
public class NkStyleWindow extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HEADER,
        FIXED_BACKGROUND,
        BACKGROUND,
        BORDER_COLOR,
        POPUP_BORDER_COLOR,
        COMBO_BORDER_COLOR,
        CONTEXTUAL_BORDER_COLOR,
        MENU_BORDER_COLOR,
        GROUP_BORDER_COLOR,
        TOOLTIP_BORDER_COLOR,
        SCALER,
        BORDER,
        COMBO_BORDER,
        CONTEXTUAL_BORDER,
        MENU_BORDER,
        GROUP_BORDER,
        TOOLTIP_BORDER,
        POPUP_BORDER,
        MIN_ROW_HEIGHT_PADDING,
        ROUNDING,
        SPACING,
        SCROLLBAR_SIZE,
        MIN_SIZE,
        PADDING,
        GROUP_PADDING,
        POPUP_PADDING,
        COMBO_PADDING,
        CONTEXTUAL_PADDING,
        MENU_PADDING,
        TOOLTIP_PADDING;

    static {
        Layout layout = __struct(
            __member(NkStyleWindowHeader.SIZEOF, NkStyleWindowHeader.ALIGNOF),
            __member(NkStyleItem.SIZEOF, NkStyleItem.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(NkStyleItem.SIZEOF, NkStyleItem.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HEADER = layout.offsetof(0);
        FIXED_BACKGROUND = layout.offsetof(1);
        BACKGROUND = layout.offsetof(2);
        BORDER_COLOR = layout.offsetof(3);
        POPUP_BORDER_COLOR = layout.offsetof(4);
        COMBO_BORDER_COLOR = layout.offsetof(5);
        CONTEXTUAL_BORDER_COLOR = layout.offsetof(6);
        MENU_BORDER_COLOR = layout.offsetof(7);
        GROUP_BORDER_COLOR = layout.offsetof(8);
        TOOLTIP_BORDER_COLOR = layout.offsetof(9);
        SCALER = layout.offsetof(10);
        BORDER = layout.offsetof(11);
        COMBO_BORDER = layout.offsetof(12);
        CONTEXTUAL_BORDER = layout.offsetof(13);
        MENU_BORDER = layout.offsetof(14);
        GROUP_BORDER = layout.offsetof(15);
        TOOLTIP_BORDER = layout.offsetof(16);
        POPUP_BORDER = layout.offsetof(17);
        MIN_ROW_HEIGHT_PADDING = layout.offsetof(18);
        ROUNDING = layout.offsetof(19);
        SPACING = layout.offsetof(20);
        SCROLLBAR_SIZE = layout.offsetof(21);
        MIN_SIZE = layout.offsetof(22);
        PADDING = layout.offsetof(23);
        GROUP_PADDING = layout.offsetof(24);
        POPUP_PADDING = layout.offsetof(25);
        COMBO_PADDING = layout.offsetof(26);
        CONTEXTUAL_PADDING = layout.offsetof(27);
        MENU_PADDING = layout.offsetof(28);
        TOOLTIP_PADDING = layout.offsetof(29);
    }

    /**
     * Creates a {@code NkStyleWindow} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkStyleWindow(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link NkStyleWindowHeader} view of the {@code header} field. */
    @NativeType("struct nk_style_window_header")
    public NkStyleWindowHeader header() { return nheader(address()); }
    /** Returns a {@link NkStyleItem} view of the {@code fixed_background} field. */
    @NativeType("struct nk_style_item")
    public NkStyleItem fixed_background() { return nfixed_background(address()); }
    /** Returns a {@link NkColor} view of the {@code background} field. */
    @NativeType("struct nk_color")
    public NkColor background() { return nbackground(address()); }
    /** Returns a {@link NkColor} view of the {@code border_color} field. */
    @NativeType("struct nk_color")
    public NkColor border_color() { return nborder_color(address()); }
    /** Returns a {@link NkColor} view of the {@code popup_border_color} field. */
    @NativeType("struct nk_color")
    public NkColor popup_border_color() { return npopup_border_color(address()); }
    /** Returns a {@link NkColor} view of the {@code combo_border_color} field. */
    @NativeType("struct nk_color")
    public NkColor combo_border_color() { return ncombo_border_color(address()); }
    /** Returns a {@link NkColor} view of the {@code contextual_border_color} field. */
    @NativeType("struct nk_color")
    public NkColor contextual_border_color() { return ncontextual_border_color(address()); }
    /** Returns a {@link NkColor} view of the {@code menu_border_color} field. */
    @NativeType("struct nk_color")
    public NkColor menu_border_color() { return nmenu_border_color(address()); }
    /** Returns a {@link NkColor} view of the {@code group_border_color} field. */
    @NativeType("struct nk_color")
    public NkColor group_border_color() { return ngroup_border_color(address()); }
    /** Returns a {@link NkColor} view of the {@code tooltip_border_color} field. */
    @NativeType("struct nk_color")
    public NkColor tooltip_border_color() { return ntooltip_border_color(address()); }
    /** Returns a {@link NkStyleItem} view of the {@code scaler} field. */
    @NativeType("struct nk_style_item")
    public NkStyleItem scaler() { return nscaler(address()); }
    /** Returns the value of the {@code border} field. */
    public float border() { return nborder(address()); }
    /** Returns the value of the {@code combo_border} field. */
    public float combo_border() { return ncombo_border(address()); }
    /** Returns the value of the {@code contextual_border} field. */
    public float contextual_border() { return ncontextual_border(address()); }
    /** Returns the value of the {@code menu_border} field. */
    public float menu_border() { return nmenu_border(address()); }
    /** Returns the value of the {@code group_border} field. */
    public float group_border() { return ngroup_border(address()); }
    /** Returns the value of the {@code tooltip_border} field. */
    public float tooltip_border() { return ntooltip_border(address()); }
    /** Returns the value of the {@code popup_border} field. */
    public float popup_border() { return npopup_border(address()); }
    /** Returns the value of the {@code min_row_height_padding} field. */
    public float min_row_height_padding() { return nmin_row_height_padding(address()); }
    /** Returns the value of the {@code rounding} field. */
    public float rounding() { return nrounding(address()); }
    /** Returns a {@link NkVec2} view of the {@code spacing} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 spacing() { return nspacing(address()); }
    /** Returns a {@link NkVec2} view of the {@code scrollbar_size} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 scrollbar_size() { return nscrollbar_size(address()); }
    /** Returns a {@link NkVec2} view of the {@code min_size} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 min_size() { return nmin_size(address()); }
    /** Returns a {@link NkVec2} view of the {@code padding} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 padding() { return npadding(address()); }
    /** Returns a {@link NkVec2} view of the {@code group_padding} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 group_padding() { return ngroup_padding(address()); }
    /** Returns a {@link NkVec2} view of the {@code popup_padding} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 popup_padding() { return npopup_padding(address()); }
    /** Returns a {@link NkVec2} view of the {@code combo_padding} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 combo_padding() { return ncombo_padding(address()); }
    /** Returns a {@link NkVec2} view of the {@code contextual_padding} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 contextual_padding() { return ncontextual_padding(address()); }
    /** Returns a {@link NkVec2} view of the {@code menu_padding} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 menu_padding() { return nmenu_padding(address()); }
    /** Returns a {@link NkVec2} view of the {@code tooltip_padding} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 tooltip_padding() { return ntooltip_padding(address()); }

    /** Copies the specified {@link NkStyleWindowHeader} to the {@code header} field. */
    public NkStyleWindow header(@NativeType("struct nk_style_window_header") NkStyleWindowHeader value) { nheader(address(), value); return this; }
    /** Passes the {@code header} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleWindow header(java.util.function.Consumer<NkStyleWindowHeader> consumer) { consumer.accept(header()); return this; }
    /** Copies the specified {@link NkStyleItem} to the {@code fixed_background} field. */
    public NkStyleWindow fixed_background(@NativeType("struct nk_style_item") NkStyleItem value) { nfixed_background(address(), value); return this; }
    /** Passes the {@code fixed_background} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleWindow fixed_background(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(fixed_background()); return this; }
    /** Copies the specified {@link NkColor} to the {@code background} field. */
    public NkStyleWindow background(@NativeType("struct nk_color") NkColor value) { nbackground(address(), value); return this; }
    /** Passes the {@code background} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleWindow background(java.util.function.Consumer<NkColor> consumer) { consumer.accept(background()); return this; }
    /** Copies the specified {@link NkColor} to the {@code border_color} field. */
    public NkStyleWindow border_color(@NativeType("struct nk_color") NkColor value) { nborder_color(address(), value); return this; }
    /** Passes the {@code border_color} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleWindow border_color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(border_color()); return this; }
    /** Copies the specified {@link NkColor} to the {@code popup_border_color} field. */
    public NkStyleWindow popup_border_color(@NativeType("struct nk_color") NkColor value) { npopup_border_color(address(), value); return this; }
    /** Passes the {@code popup_border_color} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleWindow popup_border_color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(popup_border_color()); return this; }
    /** Copies the specified {@link NkColor} to the {@code combo_border_color} field. */
    public NkStyleWindow combo_border_color(@NativeType("struct nk_color") NkColor value) { ncombo_border_color(address(), value); return this; }
    /** Passes the {@code combo_border_color} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleWindow combo_border_color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(combo_border_color()); return this; }
    /** Copies the specified {@link NkColor} to the {@code contextual_border_color} field. */
    public NkStyleWindow contextual_border_color(@NativeType("struct nk_color") NkColor value) { ncontextual_border_color(address(), value); return this; }
    /** Passes the {@code contextual_border_color} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleWindow contextual_border_color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(contextual_border_color()); return this; }
    /** Copies the specified {@link NkColor} to the {@code menu_border_color} field. */
    public NkStyleWindow menu_border_color(@NativeType("struct nk_color") NkColor value) { nmenu_border_color(address(), value); return this; }
    /** Passes the {@code menu_border_color} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleWindow menu_border_color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(menu_border_color()); return this; }
    /** Copies the specified {@link NkColor} to the {@code group_border_color} field. */
    public NkStyleWindow group_border_color(@NativeType("struct nk_color") NkColor value) { ngroup_border_color(address(), value); return this; }
    /** Passes the {@code group_border_color} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleWindow group_border_color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(group_border_color()); return this; }
    /** Copies the specified {@link NkColor} to the {@code tooltip_border_color} field. */
    public NkStyleWindow tooltip_border_color(@NativeType("struct nk_color") NkColor value) { ntooltip_border_color(address(), value); return this; }
    /** Passes the {@code tooltip_border_color} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleWindow tooltip_border_color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(tooltip_border_color()); return this; }
    /** Copies the specified {@link NkStyleItem} to the {@code scaler} field. */
    public NkStyleWindow scaler(@NativeType("struct nk_style_item") NkStyleItem value) { nscaler(address(), value); return this; }
    /** Passes the {@code scaler} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleWindow scaler(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(scaler()); return this; }
    /** Sets the specified value to the {@code border} field. */
    public NkStyleWindow border(float value) { nborder(address(), value); return this; }
    /** Sets the specified value to the {@code combo_border} field. */
    public NkStyleWindow combo_border(float value) { ncombo_border(address(), value); return this; }
    /** Sets the specified value to the {@code contextual_border} field. */
    public NkStyleWindow contextual_border(float value) { ncontextual_border(address(), value); return this; }
    /** Sets the specified value to the {@code menu_border} field. */
    public NkStyleWindow menu_border(float value) { nmenu_border(address(), value); return this; }
    /** Sets the specified value to the {@code group_border} field. */
    public NkStyleWindow group_border(float value) { ngroup_border(address(), value); return this; }
    /** Sets the specified value to the {@code tooltip_border} field. */
    public NkStyleWindow tooltip_border(float value) { ntooltip_border(address(), value); return this; }
    /** Sets the specified value to the {@code popup_border} field. */
    public NkStyleWindow popup_border(float value) { npopup_border(address(), value); return this; }
    /** Sets the specified value to the {@code min_row_height_padding} field. */
    public NkStyleWindow min_row_height_padding(float value) { nmin_row_height_padding(address(), value); return this; }
    /** Sets the specified value to the {@code rounding} field. */
    public NkStyleWindow rounding(float value) { nrounding(address(), value); return this; }
    /** Copies the specified {@link NkVec2} to the {@code spacing} field. */
    public NkStyleWindow spacing(@NativeType("struct nk_vec2") NkVec2 value) { nspacing(address(), value); return this; }
    /** Passes the {@code spacing} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleWindow spacing(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(spacing()); return this; }
    /** Copies the specified {@link NkVec2} to the {@code scrollbar_size} field. */
    public NkStyleWindow scrollbar_size(@NativeType("struct nk_vec2") NkVec2 value) { nscrollbar_size(address(), value); return this; }
    /** Passes the {@code scrollbar_size} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleWindow scrollbar_size(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(scrollbar_size()); return this; }
    /** Copies the specified {@link NkVec2} to the {@code min_size} field. */
    public NkStyleWindow min_size(@NativeType("struct nk_vec2") NkVec2 value) { nmin_size(address(), value); return this; }
    /** Passes the {@code min_size} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleWindow min_size(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(min_size()); return this; }
    /** Copies the specified {@link NkVec2} to the {@code padding} field. */
    public NkStyleWindow padding(@NativeType("struct nk_vec2") NkVec2 value) { npadding(address(), value); return this; }
    /** Passes the {@code padding} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleWindow padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(padding()); return this; }
    /** Copies the specified {@link NkVec2} to the {@code group_padding} field. */
    public NkStyleWindow group_padding(@NativeType("struct nk_vec2") NkVec2 value) { ngroup_padding(address(), value); return this; }
    /** Passes the {@code group_padding} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleWindow group_padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(group_padding()); return this; }
    /** Copies the specified {@link NkVec2} to the {@code popup_padding} field. */
    public NkStyleWindow popup_padding(@NativeType("struct nk_vec2") NkVec2 value) { npopup_padding(address(), value); return this; }
    /** Passes the {@code popup_padding} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleWindow popup_padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(popup_padding()); return this; }
    /** Copies the specified {@link NkVec2} to the {@code combo_padding} field. */
    public NkStyleWindow combo_padding(@NativeType("struct nk_vec2") NkVec2 value) { ncombo_padding(address(), value); return this; }
    /** Passes the {@code combo_padding} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleWindow combo_padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(combo_padding()); return this; }
    /** Copies the specified {@link NkVec2} to the {@code contextual_padding} field. */
    public NkStyleWindow contextual_padding(@NativeType("struct nk_vec2") NkVec2 value) { ncontextual_padding(address(), value); return this; }
    /** Passes the {@code contextual_padding} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleWindow contextual_padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(contextual_padding()); return this; }
    /** Copies the specified {@link NkVec2} to the {@code menu_padding} field. */
    public NkStyleWindow menu_padding(@NativeType("struct nk_vec2") NkVec2 value) { nmenu_padding(address(), value); return this; }
    /** Passes the {@code menu_padding} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleWindow menu_padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(menu_padding()); return this; }
    /** Copies the specified {@link NkVec2} to the {@code tooltip_padding} field. */
    public NkStyleWindow tooltip_padding(@NativeType("struct nk_vec2") NkVec2 value) { ntooltip_padding(address(), value); return this; }
    /** Passes the {@code tooltip_padding} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleWindow tooltip_padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(tooltip_padding()); return this; }

    /** Initializes this struct with the specified values. */
    public NkStyleWindow set(
        NkStyleWindowHeader header,
        NkStyleItem fixed_background,
        NkColor background,
        NkColor border_color,
        NkColor popup_border_color,
        NkColor combo_border_color,
        NkColor contextual_border_color,
        NkColor menu_border_color,
        NkColor group_border_color,
        NkColor tooltip_border_color,
        NkStyleItem scaler,
        float border,
        float combo_border,
        float contextual_border,
        float menu_border,
        float group_border,
        float tooltip_border,
        float popup_border,
        float min_row_height_padding,
        float rounding,
        NkVec2 spacing,
        NkVec2 scrollbar_size,
        NkVec2 min_size,
        NkVec2 padding,
        NkVec2 group_padding,
        NkVec2 popup_padding,
        NkVec2 combo_padding,
        NkVec2 contextual_padding,
        NkVec2 menu_padding,
        NkVec2 tooltip_padding
    ) {
        header(header);
        fixed_background(fixed_background);
        background(background);
        border_color(border_color);
        popup_border_color(popup_border_color);
        combo_border_color(combo_border_color);
        contextual_border_color(contextual_border_color);
        menu_border_color(menu_border_color);
        group_border_color(group_border_color);
        tooltip_border_color(tooltip_border_color);
        scaler(scaler);
        border(border);
        combo_border(combo_border);
        contextual_border(contextual_border);
        menu_border(menu_border);
        group_border(group_border);
        tooltip_border(tooltip_border);
        popup_border(popup_border);
        min_row_height_padding(min_row_height_padding);
        rounding(rounding);
        spacing(spacing);
        scrollbar_size(scrollbar_size);
        min_size(min_size);
        padding(padding);
        group_padding(group_padding);
        popup_padding(popup_padding);
        combo_padding(combo_padding);
        contextual_padding(contextual_padding);
        menu_padding(menu_padding);
        tooltip_padding(tooltip_padding);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public NkStyleWindow set(NkStyleWindow src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code NkStyleWindow} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkStyleWindow malloc() {
        return wrap(NkStyleWindow.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code NkStyleWindow} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkStyleWindow calloc() {
        return wrap(NkStyleWindow.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code NkStyleWindow} instance allocated with {@link BufferUtils}. */
    public static NkStyleWindow create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(NkStyleWindow.class, memAddress(container), container);
    }

    /** Returns a new {@code NkStyleWindow} instance for the specified memory address. */
    public static NkStyleWindow create(long address) {
        return wrap(NkStyleWindow.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkStyleWindow createSafe(long address) {
        return address == NULL ? null : wrap(NkStyleWindow.class, address);
    }

    /**
     * Returns a new {@link NkStyleWindow.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleWindow.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NkStyleWindow.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleWindow.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkStyleWindow.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleWindow.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link NkStyleWindow.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkStyleWindow.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkStyleWindow.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code NkStyleWindow} instance allocated on the thread-local {@link MemoryStack}. */
    public static NkStyleWindow mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code NkStyleWindow} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static NkStyleWindow callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code NkStyleWindow} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkStyleWindow mallocStack(MemoryStack stack) {
        return wrap(NkStyleWindow.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code NkStyleWindow} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkStyleWindow callocStack(MemoryStack stack) {
        return wrap(NkStyleWindow.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link NkStyleWindow.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleWindow.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkStyleWindow.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleWindow.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkStyleWindow.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkStyleWindow.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkStyleWindow.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkStyleWindow.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #header}. */
    public static NkStyleWindowHeader nheader(long struct) { return NkStyleWindowHeader.create(struct + NkStyleWindow.HEADER); }
    /** Unsafe version of {@link #fixed_background}. */
    public static NkStyleItem nfixed_background(long struct) { return NkStyleItem.create(struct + NkStyleWindow.FIXED_BACKGROUND); }
    /** Unsafe version of {@link #background}. */
    public static NkColor nbackground(long struct) { return NkColor.create(struct + NkStyleWindow.BACKGROUND); }
    /** Unsafe version of {@link #border_color}. */
    public static NkColor nborder_color(long struct) { return NkColor.create(struct + NkStyleWindow.BORDER_COLOR); }
    /** Unsafe version of {@link #popup_border_color}. */
    public static NkColor npopup_border_color(long struct) { return NkColor.create(struct + NkStyleWindow.POPUP_BORDER_COLOR); }
    /** Unsafe version of {@link #combo_border_color}. */
    public static NkColor ncombo_border_color(long struct) { return NkColor.create(struct + NkStyleWindow.COMBO_BORDER_COLOR); }
    /** Unsafe version of {@link #contextual_border_color}. */
    public static NkColor ncontextual_border_color(long struct) { return NkColor.create(struct + NkStyleWindow.CONTEXTUAL_BORDER_COLOR); }
    /** Unsafe version of {@link #menu_border_color}. */
    public static NkColor nmenu_border_color(long struct) { return NkColor.create(struct + NkStyleWindow.MENU_BORDER_COLOR); }
    /** Unsafe version of {@link #group_border_color}. */
    public static NkColor ngroup_border_color(long struct) { return NkColor.create(struct + NkStyleWindow.GROUP_BORDER_COLOR); }
    /** Unsafe version of {@link #tooltip_border_color}. */
    public static NkColor ntooltip_border_color(long struct) { return NkColor.create(struct + NkStyleWindow.TOOLTIP_BORDER_COLOR); }
    /** Unsafe version of {@link #scaler}. */
    public static NkStyleItem nscaler(long struct) { return NkStyleItem.create(struct + NkStyleWindow.SCALER); }
    /** Unsafe version of {@link #border}. */
    public static float nborder(long struct) { return UNSAFE.getFloat(null, struct + NkStyleWindow.BORDER); }
    /** Unsafe version of {@link #combo_border}. */
    public static float ncombo_border(long struct) { return UNSAFE.getFloat(null, struct + NkStyleWindow.COMBO_BORDER); }
    /** Unsafe version of {@link #contextual_border}. */
    public static float ncontextual_border(long struct) { return UNSAFE.getFloat(null, struct + NkStyleWindow.CONTEXTUAL_BORDER); }
    /** Unsafe version of {@link #menu_border}. */
    public static float nmenu_border(long struct) { return UNSAFE.getFloat(null, struct + NkStyleWindow.MENU_BORDER); }
    /** Unsafe version of {@link #group_border}. */
    public static float ngroup_border(long struct) { return UNSAFE.getFloat(null, struct + NkStyleWindow.GROUP_BORDER); }
    /** Unsafe version of {@link #tooltip_border}. */
    public static float ntooltip_border(long struct) { return UNSAFE.getFloat(null, struct + NkStyleWindow.TOOLTIP_BORDER); }
    /** Unsafe version of {@link #popup_border}. */
    public static float npopup_border(long struct) { return UNSAFE.getFloat(null, struct + NkStyleWindow.POPUP_BORDER); }
    /** Unsafe version of {@link #min_row_height_padding}. */
    public static float nmin_row_height_padding(long struct) { return UNSAFE.getFloat(null, struct + NkStyleWindow.MIN_ROW_HEIGHT_PADDING); }
    /** Unsafe version of {@link #rounding}. */
    public static float nrounding(long struct) { return UNSAFE.getFloat(null, struct + NkStyleWindow.ROUNDING); }
    /** Unsafe version of {@link #spacing}. */
    public static NkVec2 nspacing(long struct) { return NkVec2.create(struct + NkStyleWindow.SPACING); }
    /** Unsafe version of {@link #scrollbar_size}. */
    public static NkVec2 nscrollbar_size(long struct) { return NkVec2.create(struct + NkStyleWindow.SCROLLBAR_SIZE); }
    /** Unsafe version of {@link #min_size}. */
    public static NkVec2 nmin_size(long struct) { return NkVec2.create(struct + NkStyleWindow.MIN_SIZE); }
    /** Unsafe version of {@link #padding}. */
    public static NkVec2 npadding(long struct) { return NkVec2.create(struct + NkStyleWindow.PADDING); }
    /** Unsafe version of {@link #group_padding}. */
    public static NkVec2 ngroup_padding(long struct) { return NkVec2.create(struct + NkStyleWindow.GROUP_PADDING); }
    /** Unsafe version of {@link #popup_padding}. */
    public static NkVec2 npopup_padding(long struct) { return NkVec2.create(struct + NkStyleWindow.POPUP_PADDING); }
    /** Unsafe version of {@link #combo_padding}. */
    public static NkVec2 ncombo_padding(long struct) { return NkVec2.create(struct + NkStyleWindow.COMBO_PADDING); }
    /** Unsafe version of {@link #contextual_padding}. */
    public static NkVec2 ncontextual_padding(long struct) { return NkVec2.create(struct + NkStyleWindow.CONTEXTUAL_PADDING); }
    /** Unsafe version of {@link #menu_padding}. */
    public static NkVec2 nmenu_padding(long struct) { return NkVec2.create(struct + NkStyleWindow.MENU_PADDING); }
    /** Unsafe version of {@link #tooltip_padding}. */
    public static NkVec2 ntooltip_padding(long struct) { return NkVec2.create(struct + NkStyleWindow.TOOLTIP_PADDING); }

    /** Unsafe version of {@link #header(NkStyleWindowHeader) header}. */
    public static void nheader(long struct, NkStyleWindowHeader value) { memCopy(value.address(), struct + NkStyleWindow.HEADER, NkStyleWindowHeader.SIZEOF); }
    /** Unsafe version of {@link #fixed_background(NkStyleItem) fixed_background}. */
    public static void nfixed_background(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleWindow.FIXED_BACKGROUND, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #background(NkColor) background}. */
    public static void nbackground(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleWindow.BACKGROUND, NkColor.SIZEOF); }
    /** Unsafe version of {@link #border_color(NkColor) border_color}. */
    public static void nborder_color(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleWindow.BORDER_COLOR, NkColor.SIZEOF); }
    /** Unsafe version of {@link #popup_border_color(NkColor) popup_border_color}. */
    public static void npopup_border_color(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleWindow.POPUP_BORDER_COLOR, NkColor.SIZEOF); }
    /** Unsafe version of {@link #combo_border_color(NkColor) combo_border_color}. */
    public static void ncombo_border_color(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleWindow.COMBO_BORDER_COLOR, NkColor.SIZEOF); }
    /** Unsafe version of {@link #contextual_border_color(NkColor) contextual_border_color}. */
    public static void ncontextual_border_color(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleWindow.CONTEXTUAL_BORDER_COLOR, NkColor.SIZEOF); }
    /** Unsafe version of {@link #menu_border_color(NkColor) menu_border_color}. */
    public static void nmenu_border_color(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleWindow.MENU_BORDER_COLOR, NkColor.SIZEOF); }
    /** Unsafe version of {@link #group_border_color(NkColor) group_border_color}. */
    public static void ngroup_border_color(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleWindow.GROUP_BORDER_COLOR, NkColor.SIZEOF); }
    /** Unsafe version of {@link #tooltip_border_color(NkColor) tooltip_border_color}. */
    public static void ntooltip_border_color(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleWindow.TOOLTIP_BORDER_COLOR, NkColor.SIZEOF); }
    /** Unsafe version of {@link #scaler(NkStyleItem) scaler}. */
    public static void nscaler(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleWindow.SCALER, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #border(float) border}. */
    public static void nborder(long struct, float value) { UNSAFE.putFloat(null, struct + NkStyleWindow.BORDER, value); }
    /** Unsafe version of {@link #combo_border(float) combo_border}. */
    public static void ncombo_border(long struct, float value) { UNSAFE.putFloat(null, struct + NkStyleWindow.COMBO_BORDER, value); }
    /** Unsafe version of {@link #contextual_border(float) contextual_border}. */
    public static void ncontextual_border(long struct, float value) { UNSAFE.putFloat(null, struct + NkStyleWindow.CONTEXTUAL_BORDER, value); }
    /** Unsafe version of {@link #menu_border(float) menu_border}. */
    public static void nmenu_border(long struct, float value) { UNSAFE.putFloat(null, struct + NkStyleWindow.MENU_BORDER, value); }
    /** Unsafe version of {@link #group_border(float) group_border}. */
    public static void ngroup_border(long struct, float value) { UNSAFE.putFloat(null, struct + NkStyleWindow.GROUP_BORDER, value); }
    /** Unsafe version of {@link #tooltip_border(float) tooltip_border}. */
    public static void ntooltip_border(long struct, float value) { UNSAFE.putFloat(null, struct + NkStyleWindow.TOOLTIP_BORDER, value); }
    /** Unsafe version of {@link #popup_border(float) popup_border}. */
    public static void npopup_border(long struct, float value) { UNSAFE.putFloat(null, struct + NkStyleWindow.POPUP_BORDER, value); }
    /** Unsafe version of {@link #min_row_height_padding(float) min_row_height_padding}. */
    public static void nmin_row_height_padding(long struct, float value) { UNSAFE.putFloat(null, struct + NkStyleWindow.MIN_ROW_HEIGHT_PADDING, value); }
    /** Unsafe version of {@link #rounding(float) rounding}. */
    public static void nrounding(long struct, float value) { UNSAFE.putFloat(null, struct + NkStyleWindow.ROUNDING, value); }
    /** Unsafe version of {@link #spacing(NkVec2) spacing}. */
    public static void nspacing(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleWindow.SPACING, NkVec2.SIZEOF); }
    /** Unsafe version of {@link #scrollbar_size(NkVec2) scrollbar_size}. */
    public static void nscrollbar_size(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleWindow.SCROLLBAR_SIZE, NkVec2.SIZEOF); }
    /** Unsafe version of {@link #min_size(NkVec2) min_size}. */
    public static void nmin_size(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleWindow.MIN_SIZE, NkVec2.SIZEOF); }
    /** Unsafe version of {@link #padding(NkVec2) padding}. */
    public static void npadding(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleWindow.PADDING, NkVec2.SIZEOF); }
    /** Unsafe version of {@link #group_padding(NkVec2) group_padding}. */
    public static void ngroup_padding(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleWindow.GROUP_PADDING, NkVec2.SIZEOF); }
    /** Unsafe version of {@link #popup_padding(NkVec2) popup_padding}. */
    public static void npopup_padding(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleWindow.POPUP_PADDING, NkVec2.SIZEOF); }
    /** Unsafe version of {@link #combo_padding(NkVec2) combo_padding}. */
    public static void ncombo_padding(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleWindow.COMBO_PADDING, NkVec2.SIZEOF); }
    /** Unsafe version of {@link #contextual_padding(NkVec2) contextual_padding}. */
    public static void ncontextual_padding(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleWindow.CONTEXTUAL_PADDING, NkVec2.SIZEOF); }
    /** Unsafe version of {@link #menu_padding(NkVec2) menu_padding}. */
    public static void nmenu_padding(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleWindow.MENU_PADDING, NkVec2.SIZEOF); }
    /** Unsafe version of {@link #tooltip_padding(NkVec2) tooltip_padding}. */
    public static void ntooltip_padding(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleWindow.TOOLTIP_PADDING, NkVec2.SIZEOF); }

    // -----------------------------------

    /** An array of {@link NkStyleWindow} structs. */
    public static class Buffer extends StructBuffer<NkStyleWindow, Buffer> implements NativeResource {

        private static final NkStyleWindow ELEMENT_FACTORY = NkStyleWindow.create(-1L);

        /**
         * Creates a new {@code NkStyleWindow.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkStyleWindow#SIZEOF}, and its mark will be undefined.
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
        protected NkStyleWindow getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link NkStyleWindowHeader} view of the {@code header} field. */
        @NativeType("struct nk_style_window_header")
        public NkStyleWindowHeader header() { return NkStyleWindow.nheader(address()); }
        /** Returns a {@link NkStyleItem} view of the {@code fixed_background} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem fixed_background() { return NkStyleWindow.nfixed_background(address()); }
        /** Returns a {@link NkColor} view of the {@code background} field. */
        @NativeType("struct nk_color")
        public NkColor background() { return NkStyleWindow.nbackground(address()); }
        /** Returns a {@link NkColor} view of the {@code border_color} field. */
        @NativeType("struct nk_color")
        public NkColor border_color() { return NkStyleWindow.nborder_color(address()); }
        /** Returns a {@link NkColor} view of the {@code popup_border_color} field. */
        @NativeType("struct nk_color")
        public NkColor popup_border_color() { return NkStyleWindow.npopup_border_color(address()); }
        /** Returns a {@link NkColor} view of the {@code combo_border_color} field. */
        @NativeType("struct nk_color")
        public NkColor combo_border_color() { return NkStyleWindow.ncombo_border_color(address()); }
        /** Returns a {@link NkColor} view of the {@code contextual_border_color} field. */
        @NativeType("struct nk_color")
        public NkColor contextual_border_color() { return NkStyleWindow.ncontextual_border_color(address()); }
        /** Returns a {@link NkColor} view of the {@code menu_border_color} field. */
        @NativeType("struct nk_color")
        public NkColor menu_border_color() { return NkStyleWindow.nmenu_border_color(address()); }
        /** Returns a {@link NkColor} view of the {@code group_border_color} field. */
        @NativeType("struct nk_color")
        public NkColor group_border_color() { return NkStyleWindow.ngroup_border_color(address()); }
        /** Returns a {@link NkColor} view of the {@code tooltip_border_color} field. */
        @NativeType("struct nk_color")
        public NkColor tooltip_border_color() { return NkStyleWindow.ntooltip_border_color(address()); }
        /** Returns a {@link NkStyleItem} view of the {@code scaler} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem scaler() { return NkStyleWindow.nscaler(address()); }
        /** Returns the value of the {@code border} field. */
        public float border() { return NkStyleWindow.nborder(address()); }
        /** Returns the value of the {@code combo_border} field. */
        public float combo_border() { return NkStyleWindow.ncombo_border(address()); }
        /** Returns the value of the {@code contextual_border} field. */
        public float contextual_border() { return NkStyleWindow.ncontextual_border(address()); }
        /** Returns the value of the {@code menu_border} field. */
        public float menu_border() { return NkStyleWindow.nmenu_border(address()); }
        /** Returns the value of the {@code group_border} field. */
        public float group_border() { return NkStyleWindow.ngroup_border(address()); }
        /** Returns the value of the {@code tooltip_border} field. */
        public float tooltip_border() { return NkStyleWindow.ntooltip_border(address()); }
        /** Returns the value of the {@code popup_border} field. */
        public float popup_border() { return NkStyleWindow.npopup_border(address()); }
        /** Returns the value of the {@code min_row_height_padding} field. */
        public float min_row_height_padding() { return NkStyleWindow.nmin_row_height_padding(address()); }
        /** Returns the value of the {@code rounding} field. */
        public float rounding() { return NkStyleWindow.nrounding(address()); }
        /** Returns a {@link NkVec2} view of the {@code spacing} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 spacing() { return NkStyleWindow.nspacing(address()); }
        /** Returns a {@link NkVec2} view of the {@code scrollbar_size} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 scrollbar_size() { return NkStyleWindow.nscrollbar_size(address()); }
        /** Returns a {@link NkVec2} view of the {@code min_size} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 min_size() { return NkStyleWindow.nmin_size(address()); }
        /** Returns a {@link NkVec2} view of the {@code padding} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 padding() { return NkStyleWindow.npadding(address()); }
        /** Returns a {@link NkVec2} view of the {@code group_padding} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 group_padding() { return NkStyleWindow.ngroup_padding(address()); }
        /** Returns a {@link NkVec2} view of the {@code popup_padding} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 popup_padding() { return NkStyleWindow.npopup_padding(address()); }
        /** Returns a {@link NkVec2} view of the {@code combo_padding} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 combo_padding() { return NkStyleWindow.ncombo_padding(address()); }
        /** Returns a {@link NkVec2} view of the {@code contextual_padding} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 contextual_padding() { return NkStyleWindow.ncontextual_padding(address()); }
        /** Returns a {@link NkVec2} view of the {@code menu_padding} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 menu_padding() { return NkStyleWindow.nmenu_padding(address()); }
        /** Returns a {@link NkVec2} view of the {@code tooltip_padding} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 tooltip_padding() { return NkStyleWindow.ntooltip_padding(address()); }

        /** Copies the specified {@link NkStyleWindowHeader} to the {@code header} field. */
        public NkStyleWindow.Buffer header(@NativeType("struct nk_style_window_header") NkStyleWindowHeader value) { NkStyleWindow.nheader(address(), value); return this; }
        /** Passes the {@code header} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleWindow.Buffer header(java.util.function.Consumer<NkStyleWindowHeader> consumer) { consumer.accept(header()); return this; }
        /** Copies the specified {@link NkStyleItem} to the {@code fixed_background} field. */
        public NkStyleWindow.Buffer fixed_background(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleWindow.nfixed_background(address(), value); return this; }
        /** Passes the {@code fixed_background} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleWindow.Buffer fixed_background(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(fixed_background()); return this; }
        /** Copies the specified {@link NkColor} to the {@code background} field. */
        public NkStyleWindow.Buffer background(@NativeType("struct nk_color") NkColor value) { NkStyleWindow.nbackground(address(), value); return this; }
        /** Passes the {@code background} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleWindow.Buffer background(java.util.function.Consumer<NkColor> consumer) { consumer.accept(background()); return this; }
        /** Copies the specified {@link NkColor} to the {@code border_color} field. */
        public NkStyleWindow.Buffer border_color(@NativeType("struct nk_color") NkColor value) { NkStyleWindow.nborder_color(address(), value); return this; }
        /** Passes the {@code border_color} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleWindow.Buffer border_color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(border_color()); return this; }
        /** Copies the specified {@link NkColor} to the {@code popup_border_color} field. */
        public NkStyleWindow.Buffer popup_border_color(@NativeType("struct nk_color") NkColor value) { NkStyleWindow.npopup_border_color(address(), value); return this; }
        /** Passes the {@code popup_border_color} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleWindow.Buffer popup_border_color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(popup_border_color()); return this; }
        /** Copies the specified {@link NkColor} to the {@code combo_border_color} field. */
        public NkStyleWindow.Buffer combo_border_color(@NativeType("struct nk_color") NkColor value) { NkStyleWindow.ncombo_border_color(address(), value); return this; }
        /** Passes the {@code combo_border_color} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleWindow.Buffer combo_border_color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(combo_border_color()); return this; }
        /** Copies the specified {@link NkColor} to the {@code contextual_border_color} field. */
        public NkStyleWindow.Buffer contextual_border_color(@NativeType("struct nk_color") NkColor value) { NkStyleWindow.ncontextual_border_color(address(), value); return this; }
        /** Passes the {@code contextual_border_color} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleWindow.Buffer contextual_border_color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(contextual_border_color()); return this; }
        /** Copies the specified {@link NkColor} to the {@code menu_border_color} field. */
        public NkStyleWindow.Buffer menu_border_color(@NativeType("struct nk_color") NkColor value) { NkStyleWindow.nmenu_border_color(address(), value); return this; }
        /** Passes the {@code menu_border_color} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleWindow.Buffer menu_border_color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(menu_border_color()); return this; }
        /** Copies the specified {@link NkColor} to the {@code group_border_color} field. */
        public NkStyleWindow.Buffer group_border_color(@NativeType("struct nk_color") NkColor value) { NkStyleWindow.ngroup_border_color(address(), value); return this; }
        /** Passes the {@code group_border_color} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleWindow.Buffer group_border_color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(group_border_color()); return this; }
        /** Copies the specified {@link NkColor} to the {@code tooltip_border_color} field. */
        public NkStyleWindow.Buffer tooltip_border_color(@NativeType("struct nk_color") NkColor value) { NkStyleWindow.ntooltip_border_color(address(), value); return this; }
        /** Passes the {@code tooltip_border_color} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleWindow.Buffer tooltip_border_color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(tooltip_border_color()); return this; }
        /** Copies the specified {@link NkStyleItem} to the {@code scaler} field. */
        public NkStyleWindow.Buffer scaler(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleWindow.nscaler(address(), value); return this; }
        /** Passes the {@code scaler} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleWindow.Buffer scaler(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(scaler()); return this; }
        /** Sets the specified value to the {@code border} field. */
        public NkStyleWindow.Buffer border(float value) { NkStyleWindow.nborder(address(), value); return this; }
        /** Sets the specified value to the {@code combo_border} field. */
        public NkStyleWindow.Buffer combo_border(float value) { NkStyleWindow.ncombo_border(address(), value); return this; }
        /** Sets the specified value to the {@code contextual_border} field. */
        public NkStyleWindow.Buffer contextual_border(float value) { NkStyleWindow.ncontextual_border(address(), value); return this; }
        /** Sets the specified value to the {@code menu_border} field. */
        public NkStyleWindow.Buffer menu_border(float value) { NkStyleWindow.nmenu_border(address(), value); return this; }
        /** Sets the specified value to the {@code group_border} field. */
        public NkStyleWindow.Buffer group_border(float value) { NkStyleWindow.ngroup_border(address(), value); return this; }
        /** Sets the specified value to the {@code tooltip_border} field. */
        public NkStyleWindow.Buffer tooltip_border(float value) { NkStyleWindow.ntooltip_border(address(), value); return this; }
        /** Sets the specified value to the {@code popup_border} field. */
        public NkStyleWindow.Buffer popup_border(float value) { NkStyleWindow.npopup_border(address(), value); return this; }
        /** Sets the specified value to the {@code min_row_height_padding} field. */
        public NkStyleWindow.Buffer min_row_height_padding(float value) { NkStyleWindow.nmin_row_height_padding(address(), value); return this; }
        /** Sets the specified value to the {@code rounding} field. */
        public NkStyleWindow.Buffer rounding(float value) { NkStyleWindow.nrounding(address(), value); return this; }
        /** Copies the specified {@link NkVec2} to the {@code spacing} field. */
        public NkStyleWindow.Buffer spacing(@NativeType("struct nk_vec2") NkVec2 value) { NkStyleWindow.nspacing(address(), value); return this; }
        /** Passes the {@code spacing} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleWindow.Buffer spacing(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(spacing()); return this; }
        /** Copies the specified {@link NkVec2} to the {@code scrollbar_size} field. */
        public NkStyleWindow.Buffer scrollbar_size(@NativeType("struct nk_vec2") NkVec2 value) { NkStyleWindow.nscrollbar_size(address(), value); return this; }
        /** Passes the {@code scrollbar_size} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleWindow.Buffer scrollbar_size(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(scrollbar_size()); return this; }
        /** Copies the specified {@link NkVec2} to the {@code min_size} field. */
        public NkStyleWindow.Buffer min_size(@NativeType("struct nk_vec2") NkVec2 value) { NkStyleWindow.nmin_size(address(), value); return this; }
        /** Passes the {@code min_size} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleWindow.Buffer min_size(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(min_size()); return this; }
        /** Copies the specified {@link NkVec2} to the {@code padding} field. */
        public NkStyleWindow.Buffer padding(@NativeType("struct nk_vec2") NkVec2 value) { NkStyleWindow.npadding(address(), value); return this; }
        /** Passes the {@code padding} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleWindow.Buffer padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(padding()); return this; }
        /** Copies the specified {@link NkVec2} to the {@code group_padding} field. */
        public NkStyleWindow.Buffer group_padding(@NativeType("struct nk_vec2") NkVec2 value) { NkStyleWindow.ngroup_padding(address(), value); return this; }
        /** Passes the {@code group_padding} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleWindow.Buffer group_padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(group_padding()); return this; }
        /** Copies the specified {@link NkVec2} to the {@code popup_padding} field. */
        public NkStyleWindow.Buffer popup_padding(@NativeType("struct nk_vec2") NkVec2 value) { NkStyleWindow.npopup_padding(address(), value); return this; }
        /** Passes the {@code popup_padding} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleWindow.Buffer popup_padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(popup_padding()); return this; }
        /** Copies the specified {@link NkVec2} to the {@code combo_padding} field. */
        public NkStyleWindow.Buffer combo_padding(@NativeType("struct nk_vec2") NkVec2 value) { NkStyleWindow.ncombo_padding(address(), value); return this; }
        /** Passes the {@code combo_padding} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleWindow.Buffer combo_padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(combo_padding()); return this; }
        /** Copies the specified {@link NkVec2} to the {@code contextual_padding} field. */
        public NkStyleWindow.Buffer contextual_padding(@NativeType("struct nk_vec2") NkVec2 value) { NkStyleWindow.ncontextual_padding(address(), value); return this; }
        /** Passes the {@code contextual_padding} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleWindow.Buffer contextual_padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(contextual_padding()); return this; }
        /** Copies the specified {@link NkVec2} to the {@code menu_padding} field. */
        public NkStyleWindow.Buffer menu_padding(@NativeType("struct nk_vec2") NkVec2 value) { NkStyleWindow.nmenu_padding(address(), value); return this; }
        /** Passes the {@code menu_padding} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleWindow.Buffer menu_padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(menu_padding()); return this; }
        /** Copies the specified {@link NkVec2} to the {@code tooltip_padding} field. */
        public NkStyleWindow.Buffer tooltip_padding(@NativeType("struct nk_vec2") NkVec2 value) { NkStyleWindow.ntooltip_padding(address(), value); return this; }
        /** Passes the {@code tooltip_padding} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleWindow.Buffer tooltip_padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(tooltip_padding()); return this; }

    }

}