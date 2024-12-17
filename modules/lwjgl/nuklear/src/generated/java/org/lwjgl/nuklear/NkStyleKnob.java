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
 * <pre>{@code
 * struct nk_style_knob {
 *     {@link NkStyleItem struct nk_style_item} normal;
 *     {@link NkStyleItem struct nk_style_item} hover;
 *     {@link NkStyleItem struct nk_style_item} active;
 *     {@link NkColor struct nk_color} border_color;
 *     {@link NkColor struct nk_color} knob_normal;
 *     {@link NkColor struct nk_color} knob_hover;
 *     {@link NkColor struct nk_color} knob_active;
 *     {@link NkColor struct nk_color} knob_border_color;
 *     {@link NkColor struct nk_color} cursor_normal;
 *     {@link NkColor struct nk_color} cursor_hover;
 *     {@link NkColor struct nk_color} cursor_active;
 *     float border;
 *     float knob_border;
 *     {@link NkVec2 struct nk_vec2} padding;
 *     {@link NkVec2 struct nk_vec2} spacing;
 *     float cursor_width;
 *     float color_factor;
 *     float disabled_factor;
 *     {@link NkHandle nk_handle} userdata;
 *     {@link NkDrawBeginCallbackI nk_draw_begin} draw_begin;
 *     {@link NkDrawEndCallbackI nk_draw_end} draw_end;
 * }}</pre>
 */
@NativeType("struct nk_style_knob")
public class NkStyleKnob extends Struct<NkStyleKnob> implements NativeResource {

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
        KNOB_NORMAL,
        KNOB_HOVER,
        KNOB_ACTIVE,
        KNOB_BORDER_COLOR,
        CURSOR_NORMAL,
        CURSOR_HOVER,
        CURSOR_ACTIVE,
        BORDER,
        KNOB_BORDER,
        PADDING,
        SPACING,
        CURSOR_WIDTH,
        COLOR_FACTOR,
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
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(4),
            __member(4),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
            __member(4),
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
        KNOB_NORMAL = layout.offsetof(4);
        KNOB_HOVER = layout.offsetof(5);
        KNOB_ACTIVE = layout.offsetof(6);
        KNOB_BORDER_COLOR = layout.offsetof(7);
        CURSOR_NORMAL = layout.offsetof(8);
        CURSOR_HOVER = layout.offsetof(9);
        CURSOR_ACTIVE = layout.offsetof(10);
        BORDER = layout.offsetof(11);
        KNOB_BORDER = layout.offsetof(12);
        PADDING = layout.offsetof(13);
        SPACING = layout.offsetof(14);
        CURSOR_WIDTH = layout.offsetof(15);
        COLOR_FACTOR = layout.offsetof(16);
        DISABLED_FACTOR = layout.offsetof(17);
        USERDATA = layout.offsetof(18);
        DRAW_BEGIN = layout.offsetof(19);
        DRAW_END = layout.offsetof(20);
    }

    protected NkStyleKnob(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NkStyleKnob create(long address, @Nullable ByteBuffer container) {
        return new NkStyleKnob(address, container);
    }

    /**
     * Creates a {@code NkStyleKnob} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkStyleKnob(ByteBuffer container) {
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
    /** @return a {@link NkColor} view of the {@code knob_normal} field. */
    @NativeType("struct nk_color")
    public NkColor knob_normal() { return nknob_normal(address()); }
    /** @return a {@link NkColor} view of the {@code knob_hover} field. */
    @NativeType("struct nk_color")
    public NkColor knob_hover() { return nknob_hover(address()); }
    /** @return a {@link NkColor} view of the {@code knob_active} field. */
    @NativeType("struct nk_color")
    public NkColor knob_active() { return nknob_active(address()); }
    /** @return a {@link NkColor} view of the {@code knob_border_color} field. */
    @NativeType("struct nk_color")
    public NkColor knob_border_color() { return nknob_border_color(address()); }
    /** @return a {@link NkColor} view of the {@code cursor_normal} field. */
    @NativeType("struct nk_color")
    public NkColor cursor_normal() { return ncursor_normal(address()); }
    /** @return a {@link NkColor} view of the {@code cursor_hover} field. */
    @NativeType("struct nk_color")
    public NkColor cursor_hover() { return ncursor_hover(address()); }
    /** @return a {@link NkColor} view of the {@code cursor_active} field. */
    @NativeType("struct nk_color")
    public NkColor cursor_active() { return ncursor_active(address()); }
    /** @return the value of the {@code border} field. */
    public float border() { return nborder(address()); }
    /** @return the value of the {@code knob_border} field. */
    public float knob_border() { return nknob_border(address()); }
    /** @return a {@link NkVec2} view of the {@code padding} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 padding() { return npadding(address()); }
    /** @return a {@link NkVec2} view of the {@code spacing} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 spacing() { return nspacing(address()); }
    /** @return the value of the {@code cursor_width} field. */
    public float cursor_width() { return ncursor_width(address()); }
    /** @return the value of the {@code color_factor} field. */
    public float color_factor() { return ncolor_factor(address()); }
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
    public NkStyleKnob normal(@NativeType("struct nk_style_item") NkStyleItem value) { nnormal(address(), value); return this; }
    /** Passes the {@code normal} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleKnob normal(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(normal()); return this; }
    /** Copies the specified {@link NkStyleItem} to the {@code hover} field. */
    public NkStyleKnob hover(@NativeType("struct nk_style_item") NkStyleItem value) { nhover(address(), value); return this; }
    /** Passes the {@code hover} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleKnob hover(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(hover()); return this; }
    /** Copies the specified {@link NkStyleItem} to the {@code active} field. */
    public NkStyleKnob active(@NativeType("struct nk_style_item") NkStyleItem value) { nactive(address(), value); return this; }
    /** Passes the {@code active} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleKnob active(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(active()); return this; }
    /** Copies the specified {@link NkColor} to the {@code border_color} field. */
    public NkStyleKnob border_color(@NativeType("struct nk_color") NkColor value) { nborder_color(address(), value); return this; }
    /** Passes the {@code border_color} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleKnob border_color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(border_color()); return this; }
    /** Copies the specified {@link NkColor} to the {@code knob_normal} field. */
    public NkStyleKnob knob_normal(@NativeType("struct nk_color") NkColor value) { nknob_normal(address(), value); return this; }
    /** Passes the {@code knob_normal} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleKnob knob_normal(java.util.function.Consumer<NkColor> consumer) { consumer.accept(knob_normal()); return this; }
    /** Copies the specified {@link NkColor} to the {@code knob_hover} field. */
    public NkStyleKnob knob_hover(@NativeType("struct nk_color") NkColor value) { nknob_hover(address(), value); return this; }
    /** Passes the {@code knob_hover} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleKnob knob_hover(java.util.function.Consumer<NkColor> consumer) { consumer.accept(knob_hover()); return this; }
    /** Copies the specified {@link NkColor} to the {@code knob_active} field. */
    public NkStyleKnob knob_active(@NativeType("struct nk_color") NkColor value) { nknob_active(address(), value); return this; }
    /** Passes the {@code knob_active} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleKnob knob_active(java.util.function.Consumer<NkColor> consumer) { consumer.accept(knob_active()); return this; }
    /** Copies the specified {@link NkColor} to the {@code knob_border_color} field. */
    public NkStyleKnob knob_border_color(@NativeType("struct nk_color") NkColor value) { nknob_border_color(address(), value); return this; }
    /** Passes the {@code knob_border_color} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleKnob knob_border_color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(knob_border_color()); return this; }
    /** Copies the specified {@link NkColor} to the {@code cursor_normal} field. */
    public NkStyleKnob cursor_normal(@NativeType("struct nk_color") NkColor value) { ncursor_normal(address(), value); return this; }
    /** Passes the {@code cursor_normal} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleKnob cursor_normal(java.util.function.Consumer<NkColor> consumer) { consumer.accept(cursor_normal()); return this; }
    /** Copies the specified {@link NkColor} to the {@code cursor_hover} field. */
    public NkStyleKnob cursor_hover(@NativeType("struct nk_color") NkColor value) { ncursor_hover(address(), value); return this; }
    /** Passes the {@code cursor_hover} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleKnob cursor_hover(java.util.function.Consumer<NkColor> consumer) { consumer.accept(cursor_hover()); return this; }
    /** Copies the specified {@link NkColor} to the {@code cursor_active} field. */
    public NkStyleKnob cursor_active(@NativeType("struct nk_color") NkColor value) { ncursor_active(address(), value); return this; }
    /** Passes the {@code cursor_active} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleKnob cursor_active(java.util.function.Consumer<NkColor> consumer) { consumer.accept(cursor_active()); return this; }
    /** Sets the specified value to the {@code border} field. */
    public NkStyleKnob border(float value) { nborder(address(), value); return this; }
    /** Sets the specified value to the {@code knob_border} field. */
    public NkStyleKnob knob_border(float value) { nknob_border(address(), value); return this; }
    /** Copies the specified {@link NkVec2} to the {@code padding} field. */
    public NkStyleKnob padding(@NativeType("struct nk_vec2") NkVec2 value) { npadding(address(), value); return this; }
    /** Passes the {@code padding} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleKnob padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(padding()); return this; }
    /** Copies the specified {@link NkVec2} to the {@code spacing} field. */
    public NkStyleKnob spacing(@NativeType("struct nk_vec2") NkVec2 value) { nspacing(address(), value); return this; }
    /** Passes the {@code spacing} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleKnob spacing(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(spacing()); return this; }
    /** Sets the specified value to the {@code cursor_width} field. */
    public NkStyleKnob cursor_width(float value) { ncursor_width(address(), value); return this; }
    /** Sets the specified value to the {@code color_factor} field. */
    public NkStyleKnob color_factor(float value) { ncolor_factor(address(), value); return this; }
    /** Sets the specified value to the {@code disabled_factor} field. */
    public NkStyleKnob disabled_factor(float value) { ndisabled_factor(address(), value); return this; }
    /** Copies the specified {@link NkHandle} to the {@code userdata} field. */
    public NkStyleKnob userdata(@NativeType("nk_handle") NkHandle value) { nuserdata(address(), value); return this; }
    /** Passes the {@code userdata} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleKnob userdata(java.util.function.Consumer<NkHandle> consumer) { consumer.accept(userdata()); return this; }
    /** Sets the specified value to the {@code draw_begin} field. */
    public NkStyleKnob draw_begin(@Nullable @NativeType("nk_draw_begin") NkDrawBeginCallbackI value) { ndraw_begin(address(), value); return this; }
    /** Sets the specified value to the {@code draw_end} field. */
    public NkStyleKnob draw_end(@Nullable @NativeType("nk_draw_end") NkDrawEndCallbackI value) { ndraw_end(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public NkStyleKnob set(
        NkStyleItem normal,
        NkStyleItem hover,
        NkStyleItem active,
        NkColor border_color,
        NkColor knob_normal,
        NkColor knob_hover,
        NkColor knob_active,
        NkColor knob_border_color,
        NkColor cursor_normal,
        NkColor cursor_hover,
        NkColor cursor_active,
        float border,
        float knob_border,
        NkVec2 padding,
        NkVec2 spacing,
        float cursor_width,
        float color_factor,
        float disabled_factor,
        NkHandle userdata,
        NkDrawBeginCallbackI draw_begin,
        NkDrawEndCallbackI draw_end
    ) {
        normal(normal);
        hover(hover);
        active(active);
        border_color(border_color);
        knob_normal(knob_normal);
        knob_hover(knob_hover);
        knob_active(knob_active);
        knob_border_color(knob_border_color);
        cursor_normal(cursor_normal);
        cursor_hover(cursor_hover);
        cursor_active(cursor_active);
        border(border);
        knob_border(knob_border);
        padding(padding);
        spacing(spacing);
        cursor_width(cursor_width);
        color_factor(color_factor);
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
    public NkStyleKnob set(NkStyleKnob src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code NkStyleKnob} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkStyleKnob malloc() {
        return new NkStyleKnob(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code NkStyleKnob} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkStyleKnob calloc() {
        return new NkStyleKnob(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code NkStyleKnob} instance allocated with {@link BufferUtils}. */
    public static NkStyleKnob create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new NkStyleKnob(memAddress(container), container);
    }

    /** Returns a new {@code NkStyleKnob} instance for the specified memory address. */
    public static NkStyleKnob create(long address) {
        return new NkStyleKnob(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable NkStyleKnob createSafe(long address) {
        return address == NULL ? null : new NkStyleKnob(address, null);
    }

    /**
     * Returns a new {@link NkStyleKnob.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleKnob.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NkStyleKnob.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleKnob.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkStyleKnob.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleKnob.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link NkStyleKnob.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkStyleKnob.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static NkStyleKnob.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code NkStyleKnob} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkStyleKnob malloc(MemoryStack stack) {
        return new NkStyleKnob(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code NkStyleKnob} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkStyleKnob calloc(MemoryStack stack) {
        return new NkStyleKnob(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link NkStyleKnob.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkStyleKnob.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkStyleKnob.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkStyleKnob.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #normal}. */
    public static NkStyleItem nnormal(long struct) { return NkStyleItem.create(struct + NkStyleKnob.NORMAL); }
    /** Unsafe version of {@link #hover}. */
    public static NkStyleItem nhover(long struct) { return NkStyleItem.create(struct + NkStyleKnob.HOVER); }
    /** Unsafe version of {@link #active}. */
    public static NkStyleItem nactive(long struct) { return NkStyleItem.create(struct + NkStyleKnob.ACTIVE); }
    /** Unsafe version of {@link #border_color}. */
    public static NkColor nborder_color(long struct) { return NkColor.create(struct + NkStyleKnob.BORDER_COLOR); }
    /** Unsafe version of {@link #knob_normal}. */
    public static NkColor nknob_normal(long struct) { return NkColor.create(struct + NkStyleKnob.KNOB_NORMAL); }
    /** Unsafe version of {@link #knob_hover}. */
    public static NkColor nknob_hover(long struct) { return NkColor.create(struct + NkStyleKnob.KNOB_HOVER); }
    /** Unsafe version of {@link #knob_active}. */
    public static NkColor nknob_active(long struct) { return NkColor.create(struct + NkStyleKnob.KNOB_ACTIVE); }
    /** Unsafe version of {@link #knob_border_color}. */
    public static NkColor nknob_border_color(long struct) { return NkColor.create(struct + NkStyleKnob.KNOB_BORDER_COLOR); }
    /** Unsafe version of {@link #cursor_normal}. */
    public static NkColor ncursor_normal(long struct) { return NkColor.create(struct + NkStyleKnob.CURSOR_NORMAL); }
    /** Unsafe version of {@link #cursor_hover}. */
    public static NkColor ncursor_hover(long struct) { return NkColor.create(struct + NkStyleKnob.CURSOR_HOVER); }
    /** Unsafe version of {@link #cursor_active}. */
    public static NkColor ncursor_active(long struct) { return NkColor.create(struct + NkStyleKnob.CURSOR_ACTIVE); }
    /** Unsafe version of {@link #border}. */
    public static float nborder(long struct) { return memGetFloat(struct + NkStyleKnob.BORDER); }
    /** Unsafe version of {@link #knob_border}. */
    public static float nknob_border(long struct) { return memGetFloat(struct + NkStyleKnob.KNOB_BORDER); }
    /** Unsafe version of {@link #padding}. */
    public static NkVec2 npadding(long struct) { return NkVec2.create(struct + NkStyleKnob.PADDING); }
    /** Unsafe version of {@link #spacing}. */
    public static NkVec2 nspacing(long struct) { return NkVec2.create(struct + NkStyleKnob.SPACING); }
    /** Unsafe version of {@link #cursor_width}. */
    public static float ncursor_width(long struct) { return memGetFloat(struct + NkStyleKnob.CURSOR_WIDTH); }
    /** Unsafe version of {@link #color_factor}. */
    public static float ncolor_factor(long struct) { return memGetFloat(struct + NkStyleKnob.COLOR_FACTOR); }
    /** Unsafe version of {@link #disabled_factor}. */
    public static float ndisabled_factor(long struct) { return memGetFloat(struct + NkStyleKnob.DISABLED_FACTOR); }
    /** Unsafe version of {@link #userdata}. */
    public static NkHandle nuserdata(long struct) { return NkHandle.create(struct + NkStyleKnob.USERDATA); }
    /** Unsafe version of {@link #draw_begin}. */
    public static @Nullable NkDrawBeginCallback ndraw_begin(long struct) { return NkDrawBeginCallback.createSafe(memGetAddress(struct + NkStyleKnob.DRAW_BEGIN)); }
    /** Unsafe version of {@link #draw_end}. */
    public static @Nullable NkDrawEndCallback ndraw_end(long struct) { return NkDrawEndCallback.createSafe(memGetAddress(struct + NkStyleKnob.DRAW_END)); }

    /** Unsafe version of {@link #normal(NkStyleItem) normal}. */
    public static void nnormal(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleKnob.NORMAL, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #hover(NkStyleItem) hover}. */
    public static void nhover(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleKnob.HOVER, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #active(NkStyleItem) active}. */
    public static void nactive(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleKnob.ACTIVE, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #border_color(NkColor) border_color}. */
    public static void nborder_color(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleKnob.BORDER_COLOR, NkColor.SIZEOF); }
    /** Unsafe version of {@link #knob_normal(NkColor) knob_normal}. */
    public static void nknob_normal(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleKnob.KNOB_NORMAL, NkColor.SIZEOF); }
    /** Unsafe version of {@link #knob_hover(NkColor) knob_hover}. */
    public static void nknob_hover(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleKnob.KNOB_HOVER, NkColor.SIZEOF); }
    /** Unsafe version of {@link #knob_active(NkColor) knob_active}. */
    public static void nknob_active(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleKnob.KNOB_ACTIVE, NkColor.SIZEOF); }
    /** Unsafe version of {@link #knob_border_color(NkColor) knob_border_color}. */
    public static void nknob_border_color(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleKnob.KNOB_BORDER_COLOR, NkColor.SIZEOF); }
    /** Unsafe version of {@link #cursor_normal(NkColor) cursor_normal}. */
    public static void ncursor_normal(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleKnob.CURSOR_NORMAL, NkColor.SIZEOF); }
    /** Unsafe version of {@link #cursor_hover(NkColor) cursor_hover}. */
    public static void ncursor_hover(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleKnob.CURSOR_HOVER, NkColor.SIZEOF); }
    /** Unsafe version of {@link #cursor_active(NkColor) cursor_active}. */
    public static void ncursor_active(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleKnob.CURSOR_ACTIVE, NkColor.SIZEOF); }
    /** Unsafe version of {@link #border(float) border}. */
    public static void nborder(long struct, float value) { memPutFloat(struct + NkStyleKnob.BORDER, value); }
    /** Unsafe version of {@link #knob_border(float) knob_border}. */
    public static void nknob_border(long struct, float value) { memPutFloat(struct + NkStyleKnob.KNOB_BORDER, value); }
    /** Unsafe version of {@link #padding(NkVec2) padding}. */
    public static void npadding(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleKnob.PADDING, NkVec2.SIZEOF); }
    /** Unsafe version of {@link #spacing(NkVec2) spacing}. */
    public static void nspacing(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleKnob.SPACING, NkVec2.SIZEOF); }
    /** Unsafe version of {@link #cursor_width(float) cursor_width}. */
    public static void ncursor_width(long struct, float value) { memPutFloat(struct + NkStyleKnob.CURSOR_WIDTH, value); }
    /** Unsafe version of {@link #color_factor(float) color_factor}. */
    public static void ncolor_factor(long struct, float value) { memPutFloat(struct + NkStyleKnob.COLOR_FACTOR, value); }
    /** Unsafe version of {@link #disabled_factor(float) disabled_factor}. */
    public static void ndisabled_factor(long struct, float value) { memPutFloat(struct + NkStyleKnob.DISABLED_FACTOR, value); }
    /** Unsafe version of {@link #userdata(NkHandle) userdata}. */
    public static void nuserdata(long struct, NkHandle value) { memCopy(value.address(), struct + NkStyleKnob.USERDATA, NkHandle.SIZEOF); }
    /** Unsafe version of {@link #draw_begin(NkDrawBeginCallbackI) draw_begin}. */
    public static void ndraw_begin(long struct, @Nullable NkDrawBeginCallbackI value) { memPutAddress(struct + NkStyleKnob.DRAW_BEGIN, memAddressSafe(value)); }
    /** Unsafe version of {@link #draw_end(NkDrawEndCallbackI) draw_end}. */
    public static void ndraw_end(long struct, @Nullable NkDrawEndCallbackI value) { memPutAddress(struct + NkStyleKnob.DRAW_END, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link NkStyleKnob} structs. */
    public static class Buffer extends StructBuffer<NkStyleKnob, Buffer> implements NativeResource {

        private static final NkStyleKnob ELEMENT_FACTORY = NkStyleKnob.create(-1L);

        /**
         * Creates a new {@code NkStyleKnob.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkStyleKnob#SIZEOF}, and its mark will be undefined.</p>
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
        protected NkStyleKnob getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link NkStyleItem} view of the {@code normal} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem normal() { return NkStyleKnob.nnormal(address()); }
        /** @return a {@link NkStyleItem} view of the {@code hover} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem hover() { return NkStyleKnob.nhover(address()); }
        /** @return a {@link NkStyleItem} view of the {@code active} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem active() { return NkStyleKnob.nactive(address()); }
        /** @return a {@link NkColor} view of the {@code border_color} field. */
        @NativeType("struct nk_color")
        public NkColor border_color() { return NkStyleKnob.nborder_color(address()); }
        /** @return a {@link NkColor} view of the {@code knob_normal} field. */
        @NativeType("struct nk_color")
        public NkColor knob_normal() { return NkStyleKnob.nknob_normal(address()); }
        /** @return a {@link NkColor} view of the {@code knob_hover} field. */
        @NativeType("struct nk_color")
        public NkColor knob_hover() { return NkStyleKnob.nknob_hover(address()); }
        /** @return a {@link NkColor} view of the {@code knob_active} field. */
        @NativeType("struct nk_color")
        public NkColor knob_active() { return NkStyleKnob.nknob_active(address()); }
        /** @return a {@link NkColor} view of the {@code knob_border_color} field. */
        @NativeType("struct nk_color")
        public NkColor knob_border_color() { return NkStyleKnob.nknob_border_color(address()); }
        /** @return a {@link NkColor} view of the {@code cursor_normal} field. */
        @NativeType("struct nk_color")
        public NkColor cursor_normal() { return NkStyleKnob.ncursor_normal(address()); }
        /** @return a {@link NkColor} view of the {@code cursor_hover} field. */
        @NativeType("struct nk_color")
        public NkColor cursor_hover() { return NkStyleKnob.ncursor_hover(address()); }
        /** @return a {@link NkColor} view of the {@code cursor_active} field. */
        @NativeType("struct nk_color")
        public NkColor cursor_active() { return NkStyleKnob.ncursor_active(address()); }
        /** @return the value of the {@code border} field. */
        public float border() { return NkStyleKnob.nborder(address()); }
        /** @return the value of the {@code knob_border} field. */
        public float knob_border() { return NkStyleKnob.nknob_border(address()); }
        /** @return a {@link NkVec2} view of the {@code padding} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 padding() { return NkStyleKnob.npadding(address()); }
        /** @return a {@link NkVec2} view of the {@code spacing} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 spacing() { return NkStyleKnob.nspacing(address()); }
        /** @return the value of the {@code cursor_width} field. */
        public float cursor_width() { return NkStyleKnob.ncursor_width(address()); }
        /** @return the value of the {@code color_factor} field. */
        public float color_factor() { return NkStyleKnob.ncolor_factor(address()); }
        /** @return the value of the {@code disabled_factor} field. */
        public float disabled_factor() { return NkStyleKnob.ndisabled_factor(address()); }
        /** @return a {@link NkHandle} view of the {@code userdata} field. */
        @NativeType("nk_handle")
        public NkHandle userdata() { return NkStyleKnob.nuserdata(address()); }
        /** @return the value of the {@code draw_begin} field. */
        @NativeType("nk_draw_begin")
        public @Nullable NkDrawBeginCallback draw_begin() { return NkStyleKnob.ndraw_begin(address()); }
        /** @return the value of the {@code draw_end} field. */
        @NativeType("nk_draw_end")
        public @Nullable NkDrawEndCallback draw_end() { return NkStyleKnob.ndraw_end(address()); }

        /** Copies the specified {@link NkStyleItem} to the {@code normal} field. */
        public NkStyleKnob.Buffer normal(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleKnob.nnormal(address(), value); return this; }
        /** Passes the {@code normal} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleKnob.Buffer normal(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(normal()); return this; }
        /** Copies the specified {@link NkStyleItem} to the {@code hover} field. */
        public NkStyleKnob.Buffer hover(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleKnob.nhover(address(), value); return this; }
        /** Passes the {@code hover} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleKnob.Buffer hover(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(hover()); return this; }
        /** Copies the specified {@link NkStyleItem} to the {@code active} field. */
        public NkStyleKnob.Buffer active(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleKnob.nactive(address(), value); return this; }
        /** Passes the {@code active} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleKnob.Buffer active(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(active()); return this; }
        /** Copies the specified {@link NkColor} to the {@code border_color} field. */
        public NkStyleKnob.Buffer border_color(@NativeType("struct nk_color") NkColor value) { NkStyleKnob.nborder_color(address(), value); return this; }
        /** Passes the {@code border_color} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleKnob.Buffer border_color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(border_color()); return this; }
        /** Copies the specified {@link NkColor} to the {@code knob_normal} field. */
        public NkStyleKnob.Buffer knob_normal(@NativeType("struct nk_color") NkColor value) { NkStyleKnob.nknob_normal(address(), value); return this; }
        /** Passes the {@code knob_normal} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleKnob.Buffer knob_normal(java.util.function.Consumer<NkColor> consumer) { consumer.accept(knob_normal()); return this; }
        /** Copies the specified {@link NkColor} to the {@code knob_hover} field. */
        public NkStyleKnob.Buffer knob_hover(@NativeType("struct nk_color") NkColor value) { NkStyleKnob.nknob_hover(address(), value); return this; }
        /** Passes the {@code knob_hover} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleKnob.Buffer knob_hover(java.util.function.Consumer<NkColor> consumer) { consumer.accept(knob_hover()); return this; }
        /** Copies the specified {@link NkColor} to the {@code knob_active} field. */
        public NkStyleKnob.Buffer knob_active(@NativeType("struct nk_color") NkColor value) { NkStyleKnob.nknob_active(address(), value); return this; }
        /** Passes the {@code knob_active} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleKnob.Buffer knob_active(java.util.function.Consumer<NkColor> consumer) { consumer.accept(knob_active()); return this; }
        /** Copies the specified {@link NkColor} to the {@code knob_border_color} field. */
        public NkStyleKnob.Buffer knob_border_color(@NativeType("struct nk_color") NkColor value) { NkStyleKnob.nknob_border_color(address(), value); return this; }
        /** Passes the {@code knob_border_color} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleKnob.Buffer knob_border_color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(knob_border_color()); return this; }
        /** Copies the specified {@link NkColor} to the {@code cursor_normal} field. */
        public NkStyleKnob.Buffer cursor_normal(@NativeType("struct nk_color") NkColor value) { NkStyleKnob.ncursor_normal(address(), value); return this; }
        /** Passes the {@code cursor_normal} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleKnob.Buffer cursor_normal(java.util.function.Consumer<NkColor> consumer) { consumer.accept(cursor_normal()); return this; }
        /** Copies the specified {@link NkColor} to the {@code cursor_hover} field. */
        public NkStyleKnob.Buffer cursor_hover(@NativeType("struct nk_color") NkColor value) { NkStyleKnob.ncursor_hover(address(), value); return this; }
        /** Passes the {@code cursor_hover} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleKnob.Buffer cursor_hover(java.util.function.Consumer<NkColor> consumer) { consumer.accept(cursor_hover()); return this; }
        /** Copies the specified {@link NkColor} to the {@code cursor_active} field. */
        public NkStyleKnob.Buffer cursor_active(@NativeType("struct nk_color") NkColor value) { NkStyleKnob.ncursor_active(address(), value); return this; }
        /** Passes the {@code cursor_active} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleKnob.Buffer cursor_active(java.util.function.Consumer<NkColor> consumer) { consumer.accept(cursor_active()); return this; }
        /** Sets the specified value to the {@code border} field. */
        public NkStyleKnob.Buffer border(float value) { NkStyleKnob.nborder(address(), value); return this; }
        /** Sets the specified value to the {@code knob_border} field. */
        public NkStyleKnob.Buffer knob_border(float value) { NkStyleKnob.nknob_border(address(), value); return this; }
        /** Copies the specified {@link NkVec2} to the {@code padding} field. */
        public NkStyleKnob.Buffer padding(@NativeType("struct nk_vec2") NkVec2 value) { NkStyleKnob.npadding(address(), value); return this; }
        /** Passes the {@code padding} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleKnob.Buffer padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(padding()); return this; }
        /** Copies the specified {@link NkVec2} to the {@code spacing} field. */
        public NkStyleKnob.Buffer spacing(@NativeType("struct nk_vec2") NkVec2 value) { NkStyleKnob.nspacing(address(), value); return this; }
        /** Passes the {@code spacing} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleKnob.Buffer spacing(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(spacing()); return this; }
        /** Sets the specified value to the {@code cursor_width} field. */
        public NkStyleKnob.Buffer cursor_width(float value) { NkStyleKnob.ncursor_width(address(), value); return this; }
        /** Sets the specified value to the {@code color_factor} field. */
        public NkStyleKnob.Buffer color_factor(float value) { NkStyleKnob.ncolor_factor(address(), value); return this; }
        /** Sets the specified value to the {@code disabled_factor} field. */
        public NkStyleKnob.Buffer disabled_factor(float value) { NkStyleKnob.ndisabled_factor(address(), value); return this; }
        /** Copies the specified {@link NkHandle} to the {@code userdata} field. */
        public NkStyleKnob.Buffer userdata(@NativeType("nk_handle") NkHandle value) { NkStyleKnob.nuserdata(address(), value); return this; }
        /** Passes the {@code userdata} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleKnob.Buffer userdata(java.util.function.Consumer<NkHandle> consumer) { consumer.accept(userdata()); return this; }
        /** Sets the specified value to the {@code draw_begin} field. */
        public NkStyleKnob.Buffer draw_begin(@Nullable @NativeType("nk_draw_begin") NkDrawBeginCallbackI value) { NkStyleKnob.ndraw_begin(address(), value); return this; }
        /** Sets the specified value to the {@code draw_end} field. */
        public NkStyleKnob.Buffer draw_end(@Nullable @NativeType("nk_draw_end") NkDrawEndCallbackI value) { NkStyleKnob.ndraw_end(address(), value); return this; }

    }

}