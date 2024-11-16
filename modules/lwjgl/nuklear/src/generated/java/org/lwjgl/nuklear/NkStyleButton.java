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
 * struct nk_style_button {
 *     {@link NkStyleItem struct nk_style_item} normal;
 *     {@link NkStyleItem struct nk_style_item} hover;
 *     {@link NkStyleItem struct nk_style_item} active;
 *     {@link NkColor struct nk_color} border_color;
 *     float color_factor_background;
 *     {@link NkColor struct nk_color} text_background;
 *     {@link NkColor struct nk_color} text_normal;
 *     {@link NkColor struct nk_color} text_hover;
 *     {@link NkColor struct nk_color} text_active;
 *     nk_flags text_alignment;
 *     float color_factor_text;
 *     float border;
 *     float rounding;
 *     {@link NkVec2 struct nk_vec2} padding;
 *     {@link NkVec2 struct nk_vec2} image_padding;
 *     {@link NkVec2 struct nk_vec2} touch_padding;
 *     float disabled_factor;
 *     {@link NkHandle nk_handle} userdata;
 *     {@link NkDrawBeginCallbackI nk_draw_begin} draw_begin;
 *     {@link NkDrawEndCallbackI nk_draw_end} draw_end;
 * }</code></pre>
 */
@NativeType("struct nk_style_button")
public class NkStyleButton extends Struct<NkStyleButton> implements NativeResource {

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
        COLOR_FACTOR_BACKGROUND,
        TEXT_BACKGROUND,
        TEXT_NORMAL,
        TEXT_HOVER,
        TEXT_ACTIVE,
        TEXT_ALIGNMENT,
        COLOR_FACTOR_TEXT,
        BORDER,
        ROUNDING,
        PADDING,
        IMAGE_PADDING,
        TOUCH_PADDING,
        DISABLED_FACTOR,
        USERDATA,
        DRAW_BEGIN,
        DRAW_END;

    static {
        Layout layout = __struct(
            __member(NkStyleItem.SIZEOF, NkStyleItem.ALIGNOF),
            __member(NkStyleItem.SIZEOF, NkStyleItem.ALIGNOF),
            __member(NkStyleItem.SIZEOF, NkStyleItem.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(4),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
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
        COLOR_FACTOR_BACKGROUND = layout.offsetof(4);
        TEXT_BACKGROUND = layout.offsetof(5);
        TEXT_NORMAL = layout.offsetof(6);
        TEXT_HOVER = layout.offsetof(7);
        TEXT_ACTIVE = layout.offsetof(8);
        TEXT_ALIGNMENT = layout.offsetof(9);
        COLOR_FACTOR_TEXT = layout.offsetof(10);
        BORDER = layout.offsetof(11);
        ROUNDING = layout.offsetof(12);
        PADDING = layout.offsetof(13);
        IMAGE_PADDING = layout.offsetof(14);
        TOUCH_PADDING = layout.offsetof(15);
        DISABLED_FACTOR = layout.offsetof(16);
        USERDATA = layout.offsetof(17);
        DRAW_BEGIN = layout.offsetof(18);
        DRAW_END = layout.offsetof(19);
    }

    protected NkStyleButton(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NkStyleButton create(long address, @Nullable ByteBuffer container) {
        return new NkStyleButton(address, container);
    }

    /**
     * Creates a {@code NkStyleButton} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkStyleButton(ByteBuffer container) {
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
    /** @return the value of the {@code color_factor_background} field. */
    public float color_factor_background() { return ncolor_factor_background(address()); }
    /** @return a {@link NkColor} view of the {@code text_background} field. */
    @NativeType("struct nk_color")
    public NkColor text_background() { return ntext_background(address()); }
    /** @return a {@link NkColor} view of the {@code text_normal} field. */
    @NativeType("struct nk_color")
    public NkColor text_normal() { return ntext_normal(address()); }
    /** @return a {@link NkColor} view of the {@code text_hover} field. */
    @NativeType("struct nk_color")
    public NkColor text_hover() { return ntext_hover(address()); }
    /** @return a {@link NkColor} view of the {@code text_active} field. */
    @NativeType("struct nk_color")
    public NkColor text_active() { return ntext_active(address()); }
    /** @return the value of the {@code text_alignment} field. */
    @NativeType("nk_flags")
    public int text_alignment() { return ntext_alignment(address()); }
    /** @return the value of the {@code color_factor_text} field. */
    public float color_factor_text() { return ncolor_factor_text(address()); }
    /** @return the value of the {@code border} field. */
    public float border() { return nborder(address()); }
    /** @return the value of the {@code rounding} field. */
    public float rounding() { return nrounding(address()); }
    /** @return a {@link NkVec2} view of the {@code padding} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 padding() { return npadding(address()); }
    /** @return a {@link NkVec2} view of the {@code image_padding} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 image_padding() { return nimage_padding(address()); }
    /** @return a {@link NkVec2} view of the {@code touch_padding} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 touch_padding() { return ntouch_padding(address()); }
    /** @return the value of the {@code disabled_factor} field. */
    public float disabled_factor() { return ndisabled_factor(address()); }
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
    public NkStyleButton normal(@NativeType("struct nk_style_item") NkStyleItem value) { nnormal(address(), value); return this; }
    /** Passes the {@code normal} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleButton normal(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(normal()); return this; }
    /** Copies the specified {@link NkStyleItem} to the {@code hover} field. */
    public NkStyleButton hover(@NativeType("struct nk_style_item") NkStyleItem value) { nhover(address(), value); return this; }
    /** Passes the {@code hover} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleButton hover(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(hover()); return this; }
    /** Copies the specified {@link NkStyleItem} to the {@code active} field. */
    public NkStyleButton active(@NativeType("struct nk_style_item") NkStyleItem value) { nactive(address(), value); return this; }
    /** Passes the {@code active} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleButton active(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(active()); return this; }
    /** Copies the specified {@link NkColor} to the {@code border_color} field. */
    public NkStyleButton border_color(@NativeType("struct nk_color") NkColor value) { nborder_color(address(), value); return this; }
    /** Passes the {@code border_color} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleButton border_color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(border_color()); return this; }
    /** Sets the specified value to the {@code color_factor_background} field. */
    public NkStyleButton color_factor_background(float value) { ncolor_factor_background(address(), value); return this; }
    /** Copies the specified {@link NkColor} to the {@code text_background} field. */
    public NkStyleButton text_background(@NativeType("struct nk_color") NkColor value) { ntext_background(address(), value); return this; }
    /** Passes the {@code text_background} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleButton text_background(java.util.function.Consumer<NkColor> consumer) { consumer.accept(text_background()); return this; }
    /** Copies the specified {@link NkColor} to the {@code text_normal} field. */
    public NkStyleButton text_normal(@NativeType("struct nk_color") NkColor value) { ntext_normal(address(), value); return this; }
    /** Passes the {@code text_normal} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleButton text_normal(java.util.function.Consumer<NkColor> consumer) { consumer.accept(text_normal()); return this; }
    /** Copies the specified {@link NkColor} to the {@code text_hover} field. */
    public NkStyleButton text_hover(@NativeType("struct nk_color") NkColor value) { ntext_hover(address(), value); return this; }
    /** Passes the {@code text_hover} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleButton text_hover(java.util.function.Consumer<NkColor> consumer) { consumer.accept(text_hover()); return this; }
    /** Copies the specified {@link NkColor} to the {@code text_active} field. */
    public NkStyleButton text_active(@NativeType("struct nk_color") NkColor value) { ntext_active(address(), value); return this; }
    /** Passes the {@code text_active} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleButton text_active(java.util.function.Consumer<NkColor> consumer) { consumer.accept(text_active()); return this; }
    /** Sets the specified value to the {@code text_alignment} field. */
    public NkStyleButton text_alignment(@NativeType("nk_flags") int value) { ntext_alignment(address(), value); return this; }
    /** Sets the specified value to the {@code color_factor_text} field. */
    public NkStyleButton color_factor_text(float value) { ncolor_factor_text(address(), value); return this; }
    /** Sets the specified value to the {@code border} field. */
    public NkStyleButton border(float value) { nborder(address(), value); return this; }
    /** Sets the specified value to the {@code rounding} field. */
    public NkStyleButton rounding(float value) { nrounding(address(), value); return this; }
    /** Copies the specified {@link NkVec2} to the {@code padding} field. */
    public NkStyleButton padding(@NativeType("struct nk_vec2") NkVec2 value) { npadding(address(), value); return this; }
    /** Passes the {@code padding} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleButton padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(padding()); return this; }
    /** Copies the specified {@link NkVec2} to the {@code image_padding} field. */
    public NkStyleButton image_padding(@NativeType("struct nk_vec2") NkVec2 value) { nimage_padding(address(), value); return this; }
    /** Passes the {@code image_padding} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleButton image_padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(image_padding()); return this; }
    /** Copies the specified {@link NkVec2} to the {@code touch_padding} field. */
    public NkStyleButton touch_padding(@NativeType("struct nk_vec2") NkVec2 value) { ntouch_padding(address(), value); return this; }
    /** Passes the {@code touch_padding} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleButton touch_padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(touch_padding()); return this; }
    /** Sets the specified value to the {@code disabled_factor} field. */
    public NkStyleButton disabled_factor(float value) { ndisabled_factor(address(), value); return this; }
    /** Copies the specified {@link NkHandle} to the {@code userdata} field. */
    public NkStyleButton userdata(@NativeType("nk_handle") NkHandle value) { nuserdata(address(), value); return this; }
    /** Passes the {@code userdata} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleButton userdata(java.util.function.Consumer<NkHandle> consumer) { consumer.accept(userdata()); return this; }
    /** Sets the specified value to the {@code draw_begin} field. */
    public NkStyleButton draw_begin(@Nullable @NativeType("nk_draw_begin") NkDrawBeginCallbackI value) { ndraw_begin(address(), value); return this; }
    /** Sets the specified value to the {@code draw_end} field. */
    public NkStyleButton draw_end(@Nullable @NativeType("nk_draw_end") NkDrawEndCallbackI value) { ndraw_end(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public NkStyleButton set(
        NkStyleItem normal,
        NkStyleItem hover,
        NkStyleItem active,
        NkColor border_color,
        float color_factor_background,
        NkColor text_background,
        NkColor text_normal,
        NkColor text_hover,
        NkColor text_active,
        int text_alignment,
        float color_factor_text,
        float border,
        float rounding,
        NkVec2 padding,
        NkVec2 image_padding,
        NkVec2 touch_padding,
        float disabled_factor,
        NkHandle userdata,
        NkDrawBeginCallbackI draw_begin,
        NkDrawEndCallbackI draw_end
    ) {
        normal(normal);
        hover(hover);
        active(active);
        border_color(border_color);
        color_factor_background(color_factor_background);
        text_background(text_background);
        text_normal(text_normal);
        text_hover(text_hover);
        text_active(text_active);
        text_alignment(text_alignment);
        color_factor_text(color_factor_text);
        border(border);
        rounding(rounding);
        padding(padding);
        image_padding(image_padding);
        touch_padding(touch_padding);
        disabled_factor(disabled_factor);
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
    public NkStyleButton set(NkStyleButton src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code NkStyleButton} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkStyleButton malloc() {
        return new NkStyleButton(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code NkStyleButton} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkStyleButton calloc() {
        return new NkStyleButton(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code NkStyleButton} instance allocated with {@link BufferUtils}. */
    public static NkStyleButton create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new NkStyleButton(memAddress(container), container);
    }

    /** Returns a new {@code NkStyleButton} instance for the specified memory address. */
    public static NkStyleButton create(long address) {
        return new NkStyleButton(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable NkStyleButton createSafe(long address) {
        return address == NULL ? null : new NkStyleButton(address, null);
    }

    /**
     * Returns a new {@link NkStyleButton.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleButton.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NkStyleButton.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleButton.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkStyleButton.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleButton.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link NkStyleButton.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkStyleButton.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static NkStyleButton.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static NkStyleButton mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static NkStyleButton callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static NkStyleButton mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static NkStyleButton callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static NkStyleButton.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static NkStyleButton.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static NkStyleButton.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static NkStyleButton.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code NkStyleButton} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkStyleButton malloc(MemoryStack stack) {
        return new NkStyleButton(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code NkStyleButton} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkStyleButton calloc(MemoryStack stack) {
        return new NkStyleButton(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link NkStyleButton.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkStyleButton.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkStyleButton.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkStyleButton.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #normal}. */
    public static NkStyleItem nnormal(long struct) { return NkStyleItem.create(struct + NkStyleButton.NORMAL); }
    /** Unsafe version of {@link #hover}. */
    public static NkStyleItem nhover(long struct) { return NkStyleItem.create(struct + NkStyleButton.HOVER); }
    /** Unsafe version of {@link #active}. */
    public static NkStyleItem nactive(long struct) { return NkStyleItem.create(struct + NkStyleButton.ACTIVE); }
    /** Unsafe version of {@link #border_color}. */
    public static NkColor nborder_color(long struct) { return NkColor.create(struct + NkStyleButton.BORDER_COLOR); }
    /** Unsafe version of {@link #color_factor_background}. */
    public static float ncolor_factor_background(long struct) { return memGetFloat(struct + NkStyleButton.COLOR_FACTOR_BACKGROUND); }
    /** Unsafe version of {@link #text_background}. */
    public static NkColor ntext_background(long struct) { return NkColor.create(struct + NkStyleButton.TEXT_BACKGROUND); }
    /** Unsafe version of {@link #text_normal}. */
    public static NkColor ntext_normal(long struct) { return NkColor.create(struct + NkStyleButton.TEXT_NORMAL); }
    /** Unsafe version of {@link #text_hover}. */
    public static NkColor ntext_hover(long struct) { return NkColor.create(struct + NkStyleButton.TEXT_HOVER); }
    /** Unsafe version of {@link #text_active}. */
    public static NkColor ntext_active(long struct) { return NkColor.create(struct + NkStyleButton.TEXT_ACTIVE); }
    /** Unsafe version of {@link #text_alignment}. */
    public static int ntext_alignment(long struct) { return memGetInt(struct + NkStyleButton.TEXT_ALIGNMENT); }
    /** Unsafe version of {@link #color_factor_text}. */
    public static float ncolor_factor_text(long struct) { return memGetFloat(struct + NkStyleButton.COLOR_FACTOR_TEXT); }
    /** Unsafe version of {@link #border}. */
    public static float nborder(long struct) { return memGetFloat(struct + NkStyleButton.BORDER); }
    /** Unsafe version of {@link #rounding}. */
    public static float nrounding(long struct) { return memGetFloat(struct + NkStyleButton.ROUNDING); }
    /** Unsafe version of {@link #padding}. */
    public static NkVec2 npadding(long struct) { return NkVec2.create(struct + NkStyleButton.PADDING); }
    /** Unsafe version of {@link #image_padding}. */
    public static NkVec2 nimage_padding(long struct) { return NkVec2.create(struct + NkStyleButton.IMAGE_PADDING); }
    /** Unsafe version of {@link #touch_padding}. */
    public static NkVec2 ntouch_padding(long struct) { return NkVec2.create(struct + NkStyleButton.TOUCH_PADDING); }
    /** Unsafe version of {@link #disabled_factor}. */
    public static float ndisabled_factor(long struct) { return memGetFloat(struct + NkStyleButton.DISABLED_FACTOR); }
    /** Unsafe version of {@link #userdata}. */
    public static NkHandle nuserdata(long struct) { return NkHandle.create(struct + NkStyleButton.USERDATA); }
    /** Unsafe version of {@link #draw_begin}. */
    public static @Nullable NkDrawBeginCallback ndraw_begin(long struct) { return NkDrawBeginCallback.createSafe(memGetAddress(struct + NkStyleButton.DRAW_BEGIN)); }
    /** Unsafe version of {@link #draw_end}. */
    public static @Nullable NkDrawEndCallback ndraw_end(long struct) { return NkDrawEndCallback.createSafe(memGetAddress(struct + NkStyleButton.DRAW_END)); }

    /** Unsafe version of {@link #normal(NkStyleItem) normal}. */
    public static void nnormal(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleButton.NORMAL, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #hover(NkStyleItem) hover}. */
    public static void nhover(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleButton.HOVER, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #active(NkStyleItem) active}. */
    public static void nactive(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleButton.ACTIVE, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #border_color(NkColor) border_color}. */
    public static void nborder_color(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleButton.BORDER_COLOR, NkColor.SIZEOF); }
    /** Unsafe version of {@link #color_factor_background(float) color_factor_background}. */
    public static void ncolor_factor_background(long struct, float value) { memPutFloat(struct + NkStyleButton.COLOR_FACTOR_BACKGROUND, value); }
    /** Unsafe version of {@link #text_background(NkColor) text_background}. */
    public static void ntext_background(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleButton.TEXT_BACKGROUND, NkColor.SIZEOF); }
    /** Unsafe version of {@link #text_normal(NkColor) text_normal}. */
    public static void ntext_normal(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleButton.TEXT_NORMAL, NkColor.SIZEOF); }
    /** Unsafe version of {@link #text_hover(NkColor) text_hover}. */
    public static void ntext_hover(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleButton.TEXT_HOVER, NkColor.SIZEOF); }
    /** Unsafe version of {@link #text_active(NkColor) text_active}. */
    public static void ntext_active(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleButton.TEXT_ACTIVE, NkColor.SIZEOF); }
    /** Unsafe version of {@link #text_alignment(int) text_alignment}. */
    public static void ntext_alignment(long struct, int value) { memPutInt(struct + NkStyleButton.TEXT_ALIGNMENT, value); }
    /** Unsafe version of {@link #color_factor_text(float) color_factor_text}. */
    public static void ncolor_factor_text(long struct, float value) { memPutFloat(struct + NkStyleButton.COLOR_FACTOR_TEXT, value); }
    /** Unsafe version of {@link #border(float) border}. */
    public static void nborder(long struct, float value) { memPutFloat(struct + NkStyleButton.BORDER, value); }
    /** Unsafe version of {@link #rounding(float) rounding}. */
    public static void nrounding(long struct, float value) { memPutFloat(struct + NkStyleButton.ROUNDING, value); }
    /** Unsafe version of {@link #padding(NkVec2) padding}. */
    public static void npadding(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleButton.PADDING, NkVec2.SIZEOF); }
    /** Unsafe version of {@link #image_padding(NkVec2) image_padding}. */
    public static void nimage_padding(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleButton.IMAGE_PADDING, NkVec2.SIZEOF); }
    /** Unsafe version of {@link #touch_padding(NkVec2) touch_padding}. */
    public static void ntouch_padding(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleButton.TOUCH_PADDING, NkVec2.SIZEOF); }
    /** Unsafe version of {@link #disabled_factor(float) disabled_factor}. */
    public static void ndisabled_factor(long struct, float value) { memPutFloat(struct + NkStyleButton.DISABLED_FACTOR, value); }
    /** Unsafe version of {@link #userdata(NkHandle) userdata}. */
    public static void nuserdata(long struct, NkHandle value) { memCopy(value.address(), struct + NkStyleButton.USERDATA, NkHandle.SIZEOF); }
    /** Unsafe version of {@link #draw_begin(NkDrawBeginCallbackI) draw_begin}. */
    public static void ndraw_begin(long struct, @Nullable NkDrawBeginCallbackI value) { memPutAddress(struct + NkStyleButton.DRAW_BEGIN, memAddressSafe(value)); }
    /** Unsafe version of {@link #draw_end(NkDrawEndCallbackI) draw_end}. */
    public static void ndraw_end(long struct, @Nullable NkDrawEndCallbackI value) { memPutAddress(struct + NkStyleButton.DRAW_END, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link NkStyleButton} structs. */
    public static class Buffer extends StructBuffer<NkStyleButton, Buffer> implements NativeResource {

        private static final NkStyleButton ELEMENT_FACTORY = NkStyleButton.create(-1L);

        /**
         * Creates a new {@code NkStyleButton.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkStyleButton#SIZEOF}, and its mark will be undefined.</p>
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
        protected NkStyleButton getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link NkStyleItem} view of the {@code normal} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem normal() { return NkStyleButton.nnormal(address()); }
        /** @return a {@link NkStyleItem} view of the {@code hover} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem hover() { return NkStyleButton.nhover(address()); }
        /** @return a {@link NkStyleItem} view of the {@code active} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem active() { return NkStyleButton.nactive(address()); }
        /** @return a {@link NkColor} view of the {@code border_color} field. */
        @NativeType("struct nk_color")
        public NkColor border_color() { return NkStyleButton.nborder_color(address()); }
        /** @return the value of the {@code color_factor_background} field. */
        public float color_factor_background() { return NkStyleButton.ncolor_factor_background(address()); }
        /** @return a {@link NkColor} view of the {@code text_background} field. */
        @NativeType("struct nk_color")
        public NkColor text_background() { return NkStyleButton.ntext_background(address()); }
        /** @return a {@link NkColor} view of the {@code text_normal} field. */
        @NativeType("struct nk_color")
        public NkColor text_normal() { return NkStyleButton.ntext_normal(address()); }
        /** @return a {@link NkColor} view of the {@code text_hover} field. */
        @NativeType("struct nk_color")
        public NkColor text_hover() { return NkStyleButton.ntext_hover(address()); }
        /** @return a {@link NkColor} view of the {@code text_active} field. */
        @NativeType("struct nk_color")
        public NkColor text_active() { return NkStyleButton.ntext_active(address()); }
        /** @return the value of the {@code text_alignment} field. */
        @NativeType("nk_flags")
        public int text_alignment() { return NkStyleButton.ntext_alignment(address()); }
        /** @return the value of the {@code color_factor_text} field. */
        public float color_factor_text() { return NkStyleButton.ncolor_factor_text(address()); }
        /** @return the value of the {@code border} field. */
        public float border() { return NkStyleButton.nborder(address()); }
        /** @return the value of the {@code rounding} field. */
        public float rounding() { return NkStyleButton.nrounding(address()); }
        /** @return a {@link NkVec2} view of the {@code padding} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 padding() { return NkStyleButton.npadding(address()); }
        /** @return a {@link NkVec2} view of the {@code image_padding} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 image_padding() { return NkStyleButton.nimage_padding(address()); }
        /** @return a {@link NkVec2} view of the {@code touch_padding} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 touch_padding() { return NkStyleButton.ntouch_padding(address()); }
        /** @return the value of the {@code disabled_factor} field. */
        public float disabled_factor() { return NkStyleButton.ndisabled_factor(address()); }
        /** @return a {@link NkHandle} view of the {@code userdata} field. */
        @NativeType("nk_handle")
        public NkHandle userdata() { return NkStyleButton.nuserdata(address()); }
        /** @return the value of the {@code draw_begin} field. */
        @NativeType("nk_draw_begin")
        public @Nullable NkDrawBeginCallback draw_begin() { return NkStyleButton.ndraw_begin(address()); }
        /** @return the value of the {@code draw_end} field. */
        @NativeType("nk_draw_end")
        public @Nullable NkDrawEndCallback draw_end() { return NkStyleButton.ndraw_end(address()); }

        /** Copies the specified {@link NkStyleItem} to the {@code normal} field. */
        public NkStyleButton.Buffer normal(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleButton.nnormal(address(), value); return this; }
        /** Passes the {@code normal} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleButton.Buffer normal(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(normal()); return this; }
        /** Copies the specified {@link NkStyleItem} to the {@code hover} field. */
        public NkStyleButton.Buffer hover(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleButton.nhover(address(), value); return this; }
        /** Passes the {@code hover} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleButton.Buffer hover(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(hover()); return this; }
        /** Copies the specified {@link NkStyleItem} to the {@code active} field. */
        public NkStyleButton.Buffer active(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleButton.nactive(address(), value); return this; }
        /** Passes the {@code active} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleButton.Buffer active(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(active()); return this; }
        /** Copies the specified {@link NkColor} to the {@code border_color} field. */
        public NkStyleButton.Buffer border_color(@NativeType("struct nk_color") NkColor value) { NkStyleButton.nborder_color(address(), value); return this; }
        /** Passes the {@code border_color} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleButton.Buffer border_color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(border_color()); return this; }
        /** Sets the specified value to the {@code color_factor_background} field. */
        public NkStyleButton.Buffer color_factor_background(float value) { NkStyleButton.ncolor_factor_background(address(), value); return this; }
        /** Copies the specified {@link NkColor} to the {@code text_background} field. */
        public NkStyleButton.Buffer text_background(@NativeType("struct nk_color") NkColor value) { NkStyleButton.ntext_background(address(), value); return this; }
        /** Passes the {@code text_background} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleButton.Buffer text_background(java.util.function.Consumer<NkColor> consumer) { consumer.accept(text_background()); return this; }
        /** Copies the specified {@link NkColor} to the {@code text_normal} field. */
        public NkStyleButton.Buffer text_normal(@NativeType("struct nk_color") NkColor value) { NkStyleButton.ntext_normal(address(), value); return this; }
        /** Passes the {@code text_normal} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleButton.Buffer text_normal(java.util.function.Consumer<NkColor> consumer) { consumer.accept(text_normal()); return this; }
        /** Copies the specified {@link NkColor} to the {@code text_hover} field. */
        public NkStyleButton.Buffer text_hover(@NativeType("struct nk_color") NkColor value) { NkStyleButton.ntext_hover(address(), value); return this; }
        /** Passes the {@code text_hover} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleButton.Buffer text_hover(java.util.function.Consumer<NkColor> consumer) { consumer.accept(text_hover()); return this; }
        /** Copies the specified {@link NkColor} to the {@code text_active} field. */
        public NkStyleButton.Buffer text_active(@NativeType("struct nk_color") NkColor value) { NkStyleButton.ntext_active(address(), value); return this; }
        /** Passes the {@code text_active} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleButton.Buffer text_active(java.util.function.Consumer<NkColor> consumer) { consumer.accept(text_active()); return this; }
        /** Sets the specified value to the {@code text_alignment} field. */
        public NkStyleButton.Buffer text_alignment(@NativeType("nk_flags") int value) { NkStyleButton.ntext_alignment(address(), value); return this; }
        /** Sets the specified value to the {@code color_factor_text} field. */
        public NkStyleButton.Buffer color_factor_text(float value) { NkStyleButton.ncolor_factor_text(address(), value); return this; }
        /** Sets the specified value to the {@code border} field. */
        public NkStyleButton.Buffer border(float value) { NkStyleButton.nborder(address(), value); return this; }
        /** Sets the specified value to the {@code rounding} field. */
        public NkStyleButton.Buffer rounding(float value) { NkStyleButton.nrounding(address(), value); return this; }
        /** Copies the specified {@link NkVec2} to the {@code padding} field. */
        public NkStyleButton.Buffer padding(@NativeType("struct nk_vec2") NkVec2 value) { NkStyleButton.npadding(address(), value); return this; }
        /** Passes the {@code padding} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleButton.Buffer padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(padding()); return this; }
        /** Copies the specified {@link NkVec2} to the {@code image_padding} field. */
        public NkStyleButton.Buffer image_padding(@NativeType("struct nk_vec2") NkVec2 value) { NkStyleButton.nimage_padding(address(), value); return this; }
        /** Passes the {@code image_padding} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleButton.Buffer image_padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(image_padding()); return this; }
        /** Copies the specified {@link NkVec2} to the {@code touch_padding} field. */
        public NkStyleButton.Buffer touch_padding(@NativeType("struct nk_vec2") NkVec2 value) { NkStyleButton.ntouch_padding(address(), value); return this; }
        /** Passes the {@code touch_padding} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleButton.Buffer touch_padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(touch_padding()); return this; }
        /** Sets the specified value to the {@code disabled_factor} field. */
        public NkStyleButton.Buffer disabled_factor(float value) { NkStyleButton.ndisabled_factor(address(), value); return this; }
        /** Copies the specified {@link NkHandle} to the {@code userdata} field. */
        public NkStyleButton.Buffer userdata(@NativeType("nk_handle") NkHandle value) { NkStyleButton.nuserdata(address(), value); return this; }
        /** Passes the {@code userdata} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleButton.Buffer userdata(java.util.function.Consumer<NkHandle> consumer) { consumer.accept(userdata()); return this; }
        /** Sets the specified value to the {@code draw_begin} field. */
        public NkStyleButton.Buffer draw_begin(@Nullable @NativeType("nk_draw_begin") NkDrawBeginCallbackI value) { NkStyleButton.ndraw_begin(address(), value); return this; }
        /** Sets the specified value to the {@code draw_end} field. */
        public NkStyleButton.Buffer draw_end(@Nullable @NativeType("nk_draw_end") NkDrawEndCallbackI value) { NkStyleButton.ndraw_end(address(), value); return this; }

    }

}