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
 * struct nk_style_property {
 *     {@link NkStyleItem struct nk_style_item} normal;
 *     {@link NkStyleItem struct nk_style_item} hover;
 *     {@link NkStyleItem struct nk_style_item} active;
 *     {@link NkColor struct nk_color} border_color;
 *     {@link NkColor struct nk_color} label_normal;
 *     {@link NkColor struct nk_color} label_hover;
 *     {@link NkColor struct nk_color} label_active;
 *     enum nk_symbol_type sym_left;
 *     enum nk_symbol_type sym_right;
 *     float border;
 *     float rounding;
 *     {@link NkVec2 struct nk_vec2} padding;
 *     float color_factor;
 *     float disabled_factor;
 *     {@link NkStyleEdit struct nk_style_edit} edit;
 *     {@link NkStyleButton struct nk_style_button} inc_button;
 *     {@link NkStyleButton struct nk_style_button} dec_button;
 *     {@link NkHandle nk_handle} userdata;
 *     {@link NkDrawBeginCallbackI nk_draw_begin} draw_begin;
 *     {@link NkDrawEndCallbackI nk_draw_end} draw_end;
 * }}</pre>
 */
@NativeType("struct nk_style_property")
public class NkStyleProperty extends Struct<NkStyleProperty> implements NativeResource {

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
        LABEL_NORMAL,
        LABEL_HOVER,
        LABEL_ACTIVE,
        SYM_LEFT,
        SYM_RIGHT,
        BORDER,
        ROUNDING,
        PADDING,
        COLOR_FACTOR,
        DISABLED_FACTOR,
        EDIT,
        INC_BUTTON,
        DEC_BUTTON,
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
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
            __member(4),
            __member(4),
            __member(NkStyleEdit.SIZEOF, NkStyleEdit.ALIGNOF),
            __member(NkStyleButton.SIZEOF, NkStyleButton.ALIGNOF),
            __member(NkStyleButton.SIZEOF, NkStyleButton.ALIGNOF),
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
        LABEL_NORMAL = layout.offsetof(4);
        LABEL_HOVER = layout.offsetof(5);
        LABEL_ACTIVE = layout.offsetof(6);
        SYM_LEFT = layout.offsetof(7);
        SYM_RIGHT = layout.offsetof(8);
        BORDER = layout.offsetof(9);
        ROUNDING = layout.offsetof(10);
        PADDING = layout.offsetof(11);
        COLOR_FACTOR = layout.offsetof(12);
        DISABLED_FACTOR = layout.offsetof(13);
        EDIT = layout.offsetof(14);
        INC_BUTTON = layout.offsetof(15);
        DEC_BUTTON = layout.offsetof(16);
        USERDATA = layout.offsetof(17);
        DRAW_BEGIN = layout.offsetof(18);
        DRAW_END = layout.offsetof(19);
    }

    protected NkStyleProperty(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NkStyleProperty create(long address, @Nullable ByteBuffer container) {
        return new NkStyleProperty(address, container);
    }

    /**
     * Creates a {@code NkStyleProperty} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkStyleProperty(ByteBuffer container) {
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
    /** @return a {@link NkColor} view of the {@code label_normal} field. */
    @NativeType("struct nk_color")
    public NkColor label_normal() { return nlabel_normal(address()); }
    /** @return a {@link NkColor} view of the {@code label_hover} field. */
    @NativeType("struct nk_color")
    public NkColor label_hover() { return nlabel_hover(address()); }
    /** @return a {@link NkColor} view of the {@code label_active} field. */
    @NativeType("struct nk_color")
    public NkColor label_active() { return nlabel_active(address()); }
    /** @return the value of the {@code sym_left} field. */
    @NativeType("enum nk_symbol_type")
    public int sym_left() { return nsym_left(address()); }
    /** @return the value of the {@code sym_right} field. */
    @NativeType("enum nk_symbol_type")
    public int sym_right() { return nsym_right(address()); }
    /** @return the value of the {@code border} field. */
    public float border() { return nborder(address()); }
    /** @return the value of the {@code rounding} field. */
    public float rounding() { return nrounding(address()); }
    /** @return a {@link NkVec2} view of the {@code padding} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 padding() { return npadding(address()); }
    /** @return the value of the {@code color_factor} field. */
    public float color_factor() { return ncolor_factor(address()); }
    /** @return the value of the {@code disabled_factor} field. */
    public float disabled_factor() { return ndisabled_factor(address()); }
    /** @return a {@link NkStyleEdit} view of the {@code edit} field. */
    @NativeType("struct nk_style_edit")
    public NkStyleEdit edit() { return nedit(address()); }
    /** @return a {@link NkStyleButton} view of the {@code inc_button} field. */
    @NativeType("struct nk_style_button")
    public NkStyleButton inc_button() { return ninc_button(address()); }
    /** @return a {@link NkStyleButton} view of the {@code dec_button} field. */
    @NativeType("struct nk_style_button")
    public NkStyleButton dec_button() { return ndec_button(address()); }
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
    public NkStyleProperty normal(@NativeType("struct nk_style_item") NkStyleItem value) { nnormal(address(), value); return this; }
    /** Passes the {@code normal} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleProperty normal(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(normal()); return this; }
    /** Copies the specified {@link NkStyleItem} to the {@code hover} field. */
    public NkStyleProperty hover(@NativeType("struct nk_style_item") NkStyleItem value) { nhover(address(), value); return this; }
    /** Passes the {@code hover} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleProperty hover(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(hover()); return this; }
    /** Copies the specified {@link NkStyleItem} to the {@code active} field. */
    public NkStyleProperty active(@NativeType("struct nk_style_item") NkStyleItem value) { nactive(address(), value); return this; }
    /** Passes the {@code active} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleProperty active(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(active()); return this; }
    /** Copies the specified {@link NkColor} to the {@code border_color} field. */
    public NkStyleProperty border_color(@NativeType("struct nk_color") NkColor value) { nborder_color(address(), value); return this; }
    /** Passes the {@code border_color} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleProperty border_color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(border_color()); return this; }
    /** Copies the specified {@link NkColor} to the {@code label_normal} field. */
    public NkStyleProperty label_normal(@NativeType("struct nk_color") NkColor value) { nlabel_normal(address(), value); return this; }
    /** Passes the {@code label_normal} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleProperty label_normal(java.util.function.Consumer<NkColor> consumer) { consumer.accept(label_normal()); return this; }
    /** Copies the specified {@link NkColor} to the {@code label_hover} field. */
    public NkStyleProperty label_hover(@NativeType("struct nk_color") NkColor value) { nlabel_hover(address(), value); return this; }
    /** Passes the {@code label_hover} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleProperty label_hover(java.util.function.Consumer<NkColor> consumer) { consumer.accept(label_hover()); return this; }
    /** Copies the specified {@link NkColor} to the {@code label_active} field. */
    public NkStyleProperty label_active(@NativeType("struct nk_color") NkColor value) { nlabel_active(address(), value); return this; }
    /** Passes the {@code label_active} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleProperty label_active(java.util.function.Consumer<NkColor> consumer) { consumer.accept(label_active()); return this; }
    /** Sets the specified value to the {@code sym_left} field. */
    public NkStyleProperty sym_left(@NativeType("enum nk_symbol_type") int value) { nsym_left(address(), value); return this; }
    /** Sets the specified value to the {@code sym_right} field. */
    public NkStyleProperty sym_right(@NativeType("enum nk_symbol_type") int value) { nsym_right(address(), value); return this; }
    /** Sets the specified value to the {@code border} field. */
    public NkStyleProperty border(float value) { nborder(address(), value); return this; }
    /** Sets the specified value to the {@code rounding} field. */
    public NkStyleProperty rounding(float value) { nrounding(address(), value); return this; }
    /** Copies the specified {@link NkVec2} to the {@code padding} field. */
    public NkStyleProperty padding(@NativeType("struct nk_vec2") NkVec2 value) { npadding(address(), value); return this; }
    /** Passes the {@code padding} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleProperty padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(padding()); return this; }
    /** Sets the specified value to the {@code color_factor} field. */
    public NkStyleProperty color_factor(float value) { ncolor_factor(address(), value); return this; }
    /** Sets the specified value to the {@code disabled_factor} field. */
    public NkStyleProperty disabled_factor(float value) { ndisabled_factor(address(), value); return this; }
    /** Copies the specified {@link NkStyleEdit} to the {@code edit} field. */
    public NkStyleProperty edit(@NativeType("struct nk_style_edit") NkStyleEdit value) { nedit(address(), value); return this; }
    /** Passes the {@code edit} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleProperty edit(java.util.function.Consumer<NkStyleEdit> consumer) { consumer.accept(edit()); return this; }
    /** Copies the specified {@link NkStyleButton} to the {@code inc_button} field. */
    public NkStyleProperty inc_button(@NativeType("struct nk_style_button") NkStyleButton value) { ninc_button(address(), value); return this; }
    /** Passes the {@code inc_button} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleProperty inc_button(java.util.function.Consumer<NkStyleButton> consumer) { consumer.accept(inc_button()); return this; }
    /** Copies the specified {@link NkStyleButton} to the {@code dec_button} field. */
    public NkStyleProperty dec_button(@NativeType("struct nk_style_button") NkStyleButton value) { ndec_button(address(), value); return this; }
    /** Passes the {@code dec_button} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleProperty dec_button(java.util.function.Consumer<NkStyleButton> consumer) { consumer.accept(dec_button()); return this; }
    /** Copies the specified {@link NkHandle} to the {@code userdata} field. */
    public NkStyleProperty userdata(@NativeType("nk_handle") NkHandle value) { nuserdata(address(), value); return this; }
    /** Passes the {@code userdata} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleProperty userdata(java.util.function.Consumer<NkHandle> consumer) { consumer.accept(userdata()); return this; }
    /** Sets the specified value to the {@code draw_begin} field. */
    public NkStyleProperty draw_begin(@Nullable @NativeType("nk_draw_begin") NkDrawBeginCallbackI value) { ndraw_begin(address(), value); return this; }
    /** Sets the specified value to the {@code draw_end} field. */
    public NkStyleProperty draw_end(@Nullable @NativeType("nk_draw_end") NkDrawEndCallbackI value) { ndraw_end(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public NkStyleProperty set(
        NkStyleItem normal,
        NkStyleItem hover,
        NkStyleItem active,
        NkColor border_color,
        NkColor label_normal,
        NkColor label_hover,
        NkColor label_active,
        int sym_left,
        int sym_right,
        float border,
        float rounding,
        NkVec2 padding,
        float color_factor,
        float disabled_factor,
        NkStyleEdit edit,
        NkStyleButton inc_button,
        NkStyleButton dec_button,
        NkHandle userdata,
        NkDrawBeginCallbackI draw_begin,
        NkDrawEndCallbackI draw_end
    ) {
        normal(normal);
        hover(hover);
        active(active);
        border_color(border_color);
        label_normal(label_normal);
        label_hover(label_hover);
        label_active(label_active);
        sym_left(sym_left);
        sym_right(sym_right);
        border(border);
        rounding(rounding);
        padding(padding);
        color_factor(color_factor);
        disabled_factor(disabled_factor);
        edit(edit);
        inc_button(inc_button);
        dec_button(dec_button);
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
    public NkStyleProperty set(NkStyleProperty src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code NkStyleProperty} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkStyleProperty malloc() {
        return new NkStyleProperty(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code NkStyleProperty} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkStyleProperty calloc() {
        return new NkStyleProperty(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code NkStyleProperty} instance allocated with {@link BufferUtils}. */
    public static NkStyleProperty create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new NkStyleProperty(memAddress(container), container);
    }

    /** Returns a new {@code NkStyleProperty} instance for the specified memory address. */
    public static NkStyleProperty create(long address) {
        return new NkStyleProperty(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable NkStyleProperty createSafe(long address) {
        return address == NULL ? null : new NkStyleProperty(address, null);
    }

    /**
     * Returns a new {@link NkStyleProperty.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleProperty.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NkStyleProperty.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleProperty.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkStyleProperty.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleProperty.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link NkStyleProperty.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkStyleProperty.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static NkStyleProperty.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static NkStyleProperty mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static NkStyleProperty callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static NkStyleProperty mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static NkStyleProperty callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static NkStyleProperty.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static NkStyleProperty.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static NkStyleProperty.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static NkStyleProperty.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code NkStyleProperty} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkStyleProperty malloc(MemoryStack stack) {
        return new NkStyleProperty(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code NkStyleProperty} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkStyleProperty calloc(MemoryStack stack) {
        return new NkStyleProperty(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link NkStyleProperty.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkStyleProperty.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkStyleProperty.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkStyleProperty.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #normal}. */
    public static NkStyleItem nnormal(long struct) { return NkStyleItem.create(struct + NkStyleProperty.NORMAL); }
    /** Unsafe version of {@link #hover}. */
    public static NkStyleItem nhover(long struct) { return NkStyleItem.create(struct + NkStyleProperty.HOVER); }
    /** Unsafe version of {@link #active}. */
    public static NkStyleItem nactive(long struct) { return NkStyleItem.create(struct + NkStyleProperty.ACTIVE); }
    /** Unsafe version of {@link #border_color}. */
    public static NkColor nborder_color(long struct) { return NkColor.create(struct + NkStyleProperty.BORDER_COLOR); }
    /** Unsafe version of {@link #label_normal}. */
    public static NkColor nlabel_normal(long struct) { return NkColor.create(struct + NkStyleProperty.LABEL_NORMAL); }
    /** Unsafe version of {@link #label_hover}. */
    public static NkColor nlabel_hover(long struct) { return NkColor.create(struct + NkStyleProperty.LABEL_HOVER); }
    /** Unsafe version of {@link #label_active}. */
    public static NkColor nlabel_active(long struct) { return NkColor.create(struct + NkStyleProperty.LABEL_ACTIVE); }
    /** Unsafe version of {@link #sym_left}. */
    public static int nsym_left(long struct) { return memGetInt(struct + NkStyleProperty.SYM_LEFT); }
    /** Unsafe version of {@link #sym_right}. */
    public static int nsym_right(long struct) { return memGetInt(struct + NkStyleProperty.SYM_RIGHT); }
    /** Unsafe version of {@link #border}. */
    public static float nborder(long struct) { return memGetFloat(struct + NkStyleProperty.BORDER); }
    /** Unsafe version of {@link #rounding}. */
    public static float nrounding(long struct) { return memGetFloat(struct + NkStyleProperty.ROUNDING); }
    /** Unsafe version of {@link #padding}. */
    public static NkVec2 npadding(long struct) { return NkVec2.create(struct + NkStyleProperty.PADDING); }
    /** Unsafe version of {@link #color_factor}. */
    public static float ncolor_factor(long struct) { return memGetFloat(struct + NkStyleProperty.COLOR_FACTOR); }
    /** Unsafe version of {@link #disabled_factor}. */
    public static float ndisabled_factor(long struct) { return memGetFloat(struct + NkStyleProperty.DISABLED_FACTOR); }
    /** Unsafe version of {@link #edit}. */
    public static NkStyleEdit nedit(long struct) { return NkStyleEdit.create(struct + NkStyleProperty.EDIT); }
    /** Unsafe version of {@link #inc_button}. */
    public static NkStyleButton ninc_button(long struct) { return NkStyleButton.create(struct + NkStyleProperty.INC_BUTTON); }
    /** Unsafe version of {@link #dec_button}. */
    public static NkStyleButton ndec_button(long struct) { return NkStyleButton.create(struct + NkStyleProperty.DEC_BUTTON); }
    /** Unsafe version of {@link #userdata}. */
    public static NkHandle nuserdata(long struct) { return NkHandle.create(struct + NkStyleProperty.USERDATA); }
    /** Unsafe version of {@link #draw_begin}. */
    public static @Nullable NkDrawBeginCallback ndraw_begin(long struct) { return NkDrawBeginCallback.createSafe(memGetAddress(struct + NkStyleProperty.DRAW_BEGIN)); }
    /** Unsafe version of {@link #draw_end}. */
    public static @Nullable NkDrawEndCallback ndraw_end(long struct) { return NkDrawEndCallback.createSafe(memGetAddress(struct + NkStyleProperty.DRAW_END)); }

    /** Unsafe version of {@link #normal(NkStyleItem) normal}. */
    public static void nnormal(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleProperty.NORMAL, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #hover(NkStyleItem) hover}. */
    public static void nhover(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleProperty.HOVER, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #active(NkStyleItem) active}. */
    public static void nactive(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleProperty.ACTIVE, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #border_color(NkColor) border_color}. */
    public static void nborder_color(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleProperty.BORDER_COLOR, NkColor.SIZEOF); }
    /** Unsafe version of {@link #label_normal(NkColor) label_normal}. */
    public static void nlabel_normal(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleProperty.LABEL_NORMAL, NkColor.SIZEOF); }
    /** Unsafe version of {@link #label_hover(NkColor) label_hover}. */
    public static void nlabel_hover(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleProperty.LABEL_HOVER, NkColor.SIZEOF); }
    /** Unsafe version of {@link #label_active(NkColor) label_active}. */
    public static void nlabel_active(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleProperty.LABEL_ACTIVE, NkColor.SIZEOF); }
    /** Unsafe version of {@link #sym_left(int) sym_left}. */
    public static void nsym_left(long struct, int value) { memPutInt(struct + NkStyleProperty.SYM_LEFT, value); }
    /** Unsafe version of {@link #sym_right(int) sym_right}. */
    public static void nsym_right(long struct, int value) { memPutInt(struct + NkStyleProperty.SYM_RIGHT, value); }
    /** Unsafe version of {@link #border(float) border}. */
    public static void nborder(long struct, float value) { memPutFloat(struct + NkStyleProperty.BORDER, value); }
    /** Unsafe version of {@link #rounding(float) rounding}. */
    public static void nrounding(long struct, float value) { memPutFloat(struct + NkStyleProperty.ROUNDING, value); }
    /** Unsafe version of {@link #padding(NkVec2) padding}. */
    public static void npadding(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleProperty.PADDING, NkVec2.SIZEOF); }
    /** Unsafe version of {@link #color_factor(float) color_factor}. */
    public static void ncolor_factor(long struct, float value) { memPutFloat(struct + NkStyleProperty.COLOR_FACTOR, value); }
    /** Unsafe version of {@link #disabled_factor(float) disabled_factor}. */
    public static void ndisabled_factor(long struct, float value) { memPutFloat(struct + NkStyleProperty.DISABLED_FACTOR, value); }
    /** Unsafe version of {@link #edit(NkStyleEdit) edit}. */
    public static void nedit(long struct, NkStyleEdit value) { memCopy(value.address(), struct + NkStyleProperty.EDIT, NkStyleEdit.SIZEOF); }
    /** Unsafe version of {@link #inc_button(NkStyleButton) inc_button}. */
    public static void ninc_button(long struct, NkStyleButton value) { memCopy(value.address(), struct + NkStyleProperty.INC_BUTTON, NkStyleButton.SIZEOF); }
    /** Unsafe version of {@link #dec_button(NkStyleButton) dec_button}. */
    public static void ndec_button(long struct, NkStyleButton value) { memCopy(value.address(), struct + NkStyleProperty.DEC_BUTTON, NkStyleButton.SIZEOF); }
    /** Unsafe version of {@link #userdata(NkHandle) userdata}. */
    public static void nuserdata(long struct, NkHandle value) { memCopy(value.address(), struct + NkStyleProperty.USERDATA, NkHandle.SIZEOF); }
    /** Unsafe version of {@link #draw_begin(NkDrawBeginCallbackI) draw_begin}. */
    public static void ndraw_begin(long struct, @Nullable NkDrawBeginCallbackI value) { memPutAddress(struct + NkStyleProperty.DRAW_BEGIN, memAddressSafe(value)); }
    /** Unsafe version of {@link #draw_end(NkDrawEndCallbackI) draw_end}. */
    public static void ndraw_end(long struct, @Nullable NkDrawEndCallbackI value) { memPutAddress(struct + NkStyleProperty.DRAW_END, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link NkStyleProperty} structs. */
    public static class Buffer extends StructBuffer<NkStyleProperty, Buffer> implements NativeResource {

        private static final NkStyleProperty ELEMENT_FACTORY = NkStyleProperty.create(-1L);

        /**
         * Creates a new {@code NkStyleProperty.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkStyleProperty#SIZEOF}, and its mark will be undefined.</p>
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
        protected NkStyleProperty getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link NkStyleItem} view of the {@code normal} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem normal() { return NkStyleProperty.nnormal(address()); }
        /** @return a {@link NkStyleItem} view of the {@code hover} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem hover() { return NkStyleProperty.nhover(address()); }
        /** @return a {@link NkStyleItem} view of the {@code active} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem active() { return NkStyleProperty.nactive(address()); }
        /** @return a {@link NkColor} view of the {@code border_color} field. */
        @NativeType("struct nk_color")
        public NkColor border_color() { return NkStyleProperty.nborder_color(address()); }
        /** @return a {@link NkColor} view of the {@code label_normal} field. */
        @NativeType("struct nk_color")
        public NkColor label_normal() { return NkStyleProperty.nlabel_normal(address()); }
        /** @return a {@link NkColor} view of the {@code label_hover} field. */
        @NativeType("struct nk_color")
        public NkColor label_hover() { return NkStyleProperty.nlabel_hover(address()); }
        /** @return a {@link NkColor} view of the {@code label_active} field. */
        @NativeType("struct nk_color")
        public NkColor label_active() { return NkStyleProperty.nlabel_active(address()); }
        /** @return the value of the {@code sym_left} field. */
        @NativeType("enum nk_symbol_type")
        public int sym_left() { return NkStyleProperty.nsym_left(address()); }
        /** @return the value of the {@code sym_right} field. */
        @NativeType("enum nk_symbol_type")
        public int sym_right() { return NkStyleProperty.nsym_right(address()); }
        /** @return the value of the {@code border} field. */
        public float border() { return NkStyleProperty.nborder(address()); }
        /** @return the value of the {@code rounding} field. */
        public float rounding() { return NkStyleProperty.nrounding(address()); }
        /** @return a {@link NkVec2} view of the {@code padding} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 padding() { return NkStyleProperty.npadding(address()); }
        /** @return the value of the {@code color_factor} field. */
        public float color_factor() { return NkStyleProperty.ncolor_factor(address()); }
        /** @return the value of the {@code disabled_factor} field. */
        public float disabled_factor() { return NkStyleProperty.ndisabled_factor(address()); }
        /** @return a {@link NkStyleEdit} view of the {@code edit} field. */
        @NativeType("struct nk_style_edit")
        public NkStyleEdit edit() { return NkStyleProperty.nedit(address()); }
        /** @return a {@link NkStyleButton} view of the {@code inc_button} field. */
        @NativeType("struct nk_style_button")
        public NkStyleButton inc_button() { return NkStyleProperty.ninc_button(address()); }
        /** @return a {@link NkStyleButton} view of the {@code dec_button} field. */
        @NativeType("struct nk_style_button")
        public NkStyleButton dec_button() { return NkStyleProperty.ndec_button(address()); }
        /** @return a {@link NkHandle} view of the {@code userdata} field. */
        @NativeType("nk_handle")
        public NkHandle userdata() { return NkStyleProperty.nuserdata(address()); }
        /** @return the value of the {@code draw_begin} field. */
        @NativeType("nk_draw_begin")
        public @Nullable NkDrawBeginCallback draw_begin() { return NkStyleProperty.ndraw_begin(address()); }
        /** @return the value of the {@code draw_end} field. */
        @NativeType("nk_draw_end")
        public @Nullable NkDrawEndCallback draw_end() { return NkStyleProperty.ndraw_end(address()); }

        /** Copies the specified {@link NkStyleItem} to the {@code normal} field. */
        public NkStyleProperty.Buffer normal(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleProperty.nnormal(address(), value); return this; }
        /** Passes the {@code normal} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleProperty.Buffer normal(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(normal()); return this; }
        /** Copies the specified {@link NkStyleItem} to the {@code hover} field. */
        public NkStyleProperty.Buffer hover(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleProperty.nhover(address(), value); return this; }
        /** Passes the {@code hover} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleProperty.Buffer hover(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(hover()); return this; }
        /** Copies the specified {@link NkStyleItem} to the {@code active} field. */
        public NkStyleProperty.Buffer active(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleProperty.nactive(address(), value); return this; }
        /** Passes the {@code active} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleProperty.Buffer active(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(active()); return this; }
        /** Copies the specified {@link NkColor} to the {@code border_color} field. */
        public NkStyleProperty.Buffer border_color(@NativeType("struct nk_color") NkColor value) { NkStyleProperty.nborder_color(address(), value); return this; }
        /** Passes the {@code border_color} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleProperty.Buffer border_color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(border_color()); return this; }
        /** Copies the specified {@link NkColor} to the {@code label_normal} field. */
        public NkStyleProperty.Buffer label_normal(@NativeType("struct nk_color") NkColor value) { NkStyleProperty.nlabel_normal(address(), value); return this; }
        /** Passes the {@code label_normal} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleProperty.Buffer label_normal(java.util.function.Consumer<NkColor> consumer) { consumer.accept(label_normal()); return this; }
        /** Copies the specified {@link NkColor} to the {@code label_hover} field. */
        public NkStyleProperty.Buffer label_hover(@NativeType("struct nk_color") NkColor value) { NkStyleProperty.nlabel_hover(address(), value); return this; }
        /** Passes the {@code label_hover} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleProperty.Buffer label_hover(java.util.function.Consumer<NkColor> consumer) { consumer.accept(label_hover()); return this; }
        /** Copies the specified {@link NkColor} to the {@code label_active} field. */
        public NkStyleProperty.Buffer label_active(@NativeType("struct nk_color") NkColor value) { NkStyleProperty.nlabel_active(address(), value); return this; }
        /** Passes the {@code label_active} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleProperty.Buffer label_active(java.util.function.Consumer<NkColor> consumer) { consumer.accept(label_active()); return this; }
        /** Sets the specified value to the {@code sym_left} field. */
        public NkStyleProperty.Buffer sym_left(@NativeType("enum nk_symbol_type") int value) { NkStyleProperty.nsym_left(address(), value); return this; }
        /** Sets the specified value to the {@code sym_right} field. */
        public NkStyleProperty.Buffer sym_right(@NativeType("enum nk_symbol_type") int value) { NkStyleProperty.nsym_right(address(), value); return this; }
        /** Sets the specified value to the {@code border} field. */
        public NkStyleProperty.Buffer border(float value) { NkStyleProperty.nborder(address(), value); return this; }
        /** Sets the specified value to the {@code rounding} field. */
        public NkStyleProperty.Buffer rounding(float value) { NkStyleProperty.nrounding(address(), value); return this; }
        /** Copies the specified {@link NkVec2} to the {@code padding} field. */
        public NkStyleProperty.Buffer padding(@NativeType("struct nk_vec2") NkVec2 value) { NkStyleProperty.npadding(address(), value); return this; }
        /** Passes the {@code padding} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleProperty.Buffer padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(padding()); return this; }
        /** Sets the specified value to the {@code color_factor} field. */
        public NkStyleProperty.Buffer color_factor(float value) { NkStyleProperty.ncolor_factor(address(), value); return this; }
        /** Sets the specified value to the {@code disabled_factor} field. */
        public NkStyleProperty.Buffer disabled_factor(float value) { NkStyleProperty.ndisabled_factor(address(), value); return this; }
        /** Copies the specified {@link NkStyleEdit} to the {@code edit} field. */
        public NkStyleProperty.Buffer edit(@NativeType("struct nk_style_edit") NkStyleEdit value) { NkStyleProperty.nedit(address(), value); return this; }
        /** Passes the {@code edit} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleProperty.Buffer edit(java.util.function.Consumer<NkStyleEdit> consumer) { consumer.accept(edit()); return this; }
        /** Copies the specified {@link NkStyleButton} to the {@code inc_button} field. */
        public NkStyleProperty.Buffer inc_button(@NativeType("struct nk_style_button") NkStyleButton value) { NkStyleProperty.ninc_button(address(), value); return this; }
        /** Passes the {@code inc_button} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleProperty.Buffer inc_button(java.util.function.Consumer<NkStyleButton> consumer) { consumer.accept(inc_button()); return this; }
        /** Copies the specified {@link NkStyleButton} to the {@code dec_button} field. */
        public NkStyleProperty.Buffer dec_button(@NativeType("struct nk_style_button") NkStyleButton value) { NkStyleProperty.ndec_button(address(), value); return this; }
        /** Passes the {@code dec_button} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleProperty.Buffer dec_button(java.util.function.Consumer<NkStyleButton> consumer) { consumer.accept(dec_button()); return this; }
        /** Copies the specified {@link NkHandle} to the {@code userdata} field. */
        public NkStyleProperty.Buffer userdata(@NativeType("nk_handle") NkHandle value) { NkStyleProperty.nuserdata(address(), value); return this; }
        /** Passes the {@code userdata} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleProperty.Buffer userdata(java.util.function.Consumer<NkHandle> consumer) { consumer.accept(userdata()); return this; }
        /** Sets the specified value to the {@code draw_begin} field. */
        public NkStyleProperty.Buffer draw_begin(@Nullable @NativeType("nk_draw_begin") NkDrawBeginCallbackI value) { NkStyleProperty.ndraw_begin(address(), value); return this; }
        /** Sets the specified value to the {@code draw_end} field. */
        public NkStyleProperty.Buffer draw_end(@Nullable @NativeType("nk_draw_end") NkDrawEndCallbackI value) { NkStyleProperty.ndraw_end(address(), value); return this; }

    }

}