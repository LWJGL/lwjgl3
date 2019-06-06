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
 * struct nk_style_toggle {
 *     {@link NkStyleItem struct nk_style_item} normal;
 *     {@link NkStyleItem struct nk_style_item} hover;
 *     {@link NkStyleItem struct nk_style_item} active;
 *     {@link NkColor struct nk_color} border_color;
 *     {@link NkStyleItem struct nk_style_item} cursor_normal;
 *     {@link NkStyleItem struct nk_style_item} cursor_hover;
 *     {@link NkColor struct nk_color} text_normal;
 *     {@link NkColor struct nk_color} text_hover;
 *     {@link NkColor struct nk_color} text_active;
 *     {@link NkColor struct nk_color} text_background;
 *     nk_flags text_alignment;
 *     {@link NkVec2 struct nk_vec2} padding;
 *     {@link NkVec2 struct nk_vec2} touch_padding;
 *     float spacing;
 *     float border;
 *     {@link NkHandle nk_handle} userdata;
 *     {@link NkDrawBeginCallbackI nk_draw_begin} draw_begin;
 *     {@link NkDrawEndCallbackI nk_draw_end} draw_end;
 * }</code></pre>
 */
@NativeType("struct nk_style_toggle")
public class NkStyleToggle extends Struct implements NativeResource {

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
        TEXT_NORMAL,
        TEXT_HOVER,
        TEXT_ACTIVE,
        TEXT_BACKGROUND,
        TEXT_ALIGNMENT,
        PADDING,
        TOUCH_PADDING,
        SPACING,
        BORDER,
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
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(4),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
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
        TEXT_NORMAL = layout.offsetof(6);
        TEXT_HOVER = layout.offsetof(7);
        TEXT_ACTIVE = layout.offsetof(8);
        TEXT_BACKGROUND = layout.offsetof(9);
        TEXT_ALIGNMENT = layout.offsetof(10);
        PADDING = layout.offsetof(11);
        TOUCH_PADDING = layout.offsetof(12);
        SPACING = layout.offsetof(13);
        BORDER = layout.offsetof(14);
        USERDATA = layout.offsetof(15);
        DRAW_BEGIN = layout.offsetof(16);
        DRAW_END = layout.offsetof(17);
    }

    /**
     * Creates a {@code NkStyleToggle} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkStyleToggle(ByteBuffer container) {
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
    /** Returns a {@link NkColor} view of the {@code text_normal} field. */
    @NativeType("struct nk_color")
    public NkColor text_normal() { return ntext_normal(address()); }
    /** Returns a {@link NkColor} view of the {@code text_hover} field. */
    @NativeType("struct nk_color")
    public NkColor text_hover() { return ntext_hover(address()); }
    /** Returns a {@link NkColor} view of the {@code text_active} field. */
    @NativeType("struct nk_color")
    public NkColor text_active() { return ntext_active(address()); }
    /** Returns a {@link NkColor} view of the {@code text_background} field. */
    @NativeType("struct nk_color")
    public NkColor text_background() { return ntext_background(address()); }
    /** Returns the value of the {@code text_alignment} field. */
    @NativeType("nk_flags")
    public int text_alignment() { return ntext_alignment(address()); }
    /** Returns a {@link NkVec2} view of the {@code padding} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 padding() { return npadding(address()); }
    /** Returns a {@link NkVec2} view of the {@code touch_padding} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 touch_padding() { return ntouch_padding(address()); }
    /** Returns the value of the {@code spacing} field. */
    public float spacing() { return nspacing(address()); }
    /** Returns the value of the {@code border} field. */
    public float border() { return nborder(address()); }
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
    public NkStyleToggle normal(@NativeType("struct nk_style_item") NkStyleItem value) { nnormal(address(), value); return this; }
    /** Passes the {@code normal} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleToggle normal(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(normal()); return this; }
    /** Copies the specified {@link NkStyleItem} to the {@code hover} field. */
    public NkStyleToggle hover(@NativeType("struct nk_style_item") NkStyleItem value) { nhover(address(), value); return this; }
    /** Passes the {@code hover} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleToggle hover(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(hover()); return this; }
    /** Copies the specified {@link NkStyleItem} to the {@code active} field. */
    public NkStyleToggle active(@NativeType("struct nk_style_item") NkStyleItem value) { nactive(address(), value); return this; }
    /** Passes the {@code active} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleToggle active(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(active()); return this; }
    /** Copies the specified {@link NkColor} to the {@code border_color} field. */
    public NkStyleToggle border_color(@NativeType("struct nk_color") NkColor value) { nborder_color(address(), value); return this; }
    /** Passes the {@code border_color} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleToggle border_color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(border_color()); return this; }
    /** Copies the specified {@link NkStyleItem} to the {@code cursor_normal} field. */
    public NkStyleToggle cursor_normal(@NativeType("struct nk_style_item") NkStyleItem value) { ncursor_normal(address(), value); return this; }
    /** Passes the {@code cursor_normal} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleToggle cursor_normal(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(cursor_normal()); return this; }
    /** Copies the specified {@link NkStyleItem} to the {@code cursor_hover} field. */
    public NkStyleToggle cursor_hover(@NativeType("struct nk_style_item") NkStyleItem value) { ncursor_hover(address(), value); return this; }
    /** Passes the {@code cursor_hover} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleToggle cursor_hover(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(cursor_hover()); return this; }
    /** Copies the specified {@link NkColor} to the {@code text_normal} field. */
    public NkStyleToggle text_normal(@NativeType("struct nk_color") NkColor value) { ntext_normal(address(), value); return this; }
    /** Passes the {@code text_normal} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleToggle text_normal(java.util.function.Consumer<NkColor> consumer) { consumer.accept(text_normal()); return this; }
    /** Copies the specified {@link NkColor} to the {@code text_hover} field. */
    public NkStyleToggle text_hover(@NativeType("struct nk_color") NkColor value) { ntext_hover(address(), value); return this; }
    /** Passes the {@code text_hover} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleToggle text_hover(java.util.function.Consumer<NkColor> consumer) { consumer.accept(text_hover()); return this; }
    /** Copies the specified {@link NkColor} to the {@code text_active} field. */
    public NkStyleToggle text_active(@NativeType("struct nk_color") NkColor value) { ntext_active(address(), value); return this; }
    /** Passes the {@code text_active} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleToggle text_active(java.util.function.Consumer<NkColor> consumer) { consumer.accept(text_active()); return this; }
    /** Copies the specified {@link NkColor} to the {@code text_background} field. */
    public NkStyleToggle text_background(@NativeType("struct nk_color") NkColor value) { ntext_background(address(), value); return this; }
    /** Passes the {@code text_background} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleToggle text_background(java.util.function.Consumer<NkColor> consumer) { consumer.accept(text_background()); return this; }
    /** Sets the specified value to the {@code text_alignment} field. */
    public NkStyleToggle text_alignment(@NativeType("nk_flags") int value) { ntext_alignment(address(), value); return this; }
    /** Copies the specified {@link NkVec2} to the {@code padding} field. */
    public NkStyleToggle padding(@NativeType("struct nk_vec2") NkVec2 value) { npadding(address(), value); return this; }
    /** Passes the {@code padding} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleToggle padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(padding()); return this; }
    /** Copies the specified {@link NkVec2} to the {@code touch_padding} field. */
    public NkStyleToggle touch_padding(@NativeType("struct nk_vec2") NkVec2 value) { ntouch_padding(address(), value); return this; }
    /** Passes the {@code touch_padding} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleToggle touch_padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(touch_padding()); return this; }
    /** Sets the specified value to the {@code spacing} field. */
    public NkStyleToggle spacing(float value) { nspacing(address(), value); return this; }
    /** Sets the specified value to the {@code border} field. */
    public NkStyleToggle border(float value) { nborder(address(), value); return this; }
    /** Copies the specified {@link NkHandle} to the {@code userdata} field. */
    public NkStyleToggle userdata(@NativeType("nk_handle") NkHandle value) { nuserdata(address(), value); return this; }
    /** Passes the {@code userdata} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleToggle userdata(java.util.function.Consumer<NkHandle> consumer) { consumer.accept(userdata()); return this; }
    /** Sets the specified value to the {@code draw_begin} field. */
    public NkStyleToggle draw_begin(@Nullable @NativeType("nk_draw_begin") NkDrawBeginCallbackI value) { ndraw_begin(address(), value); return this; }
    /** Sets the specified value to the {@code draw_end} field. */
    public NkStyleToggle draw_end(@Nullable @NativeType("nk_draw_end") NkDrawEndCallbackI value) { ndraw_end(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public NkStyleToggle set(
        NkStyleItem normal,
        NkStyleItem hover,
        NkStyleItem active,
        NkColor border_color,
        NkStyleItem cursor_normal,
        NkStyleItem cursor_hover,
        NkColor text_normal,
        NkColor text_hover,
        NkColor text_active,
        NkColor text_background,
        int text_alignment,
        NkVec2 padding,
        NkVec2 touch_padding,
        float spacing,
        float border,
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
        text_normal(text_normal);
        text_hover(text_hover);
        text_active(text_active);
        text_background(text_background);
        text_alignment(text_alignment);
        padding(padding);
        touch_padding(touch_padding);
        spacing(spacing);
        border(border);
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
    public NkStyleToggle set(NkStyleToggle src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code NkStyleToggle} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkStyleToggle malloc() {
        return wrap(NkStyleToggle.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code NkStyleToggle} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkStyleToggle calloc() {
        return wrap(NkStyleToggle.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code NkStyleToggle} instance allocated with {@link BufferUtils}. */
    public static NkStyleToggle create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(NkStyleToggle.class, memAddress(container), container);
    }

    /** Returns a new {@code NkStyleToggle} instance for the specified memory address. */
    public static NkStyleToggle create(long address) {
        return wrap(NkStyleToggle.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkStyleToggle createSafe(long address) {
        return address == NULL ? null : wrap(NkStyleToggle.class, address);
    }

    /**
     * Returns a new {@link NkStyleToggle.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleToggle.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NkStyleToggle.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleToggle.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkStyleToggle.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleToggle.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link NkStyleToggle.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkStyleToggle.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkStyleToggle.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code NkStyleToggle} instance allocated on the thread-local {@link MemoryStack}. */
    public static NkStyleToggle mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code NkStyleToggle} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static NkStyleToggle callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code NkStyleToggle} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkStyleToggle mallocStack(MemoryStack stack) {
        return wrap(NkStyleToggle.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code NkStyleToggle} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkStyleToggle callocStack(MemoryStack stack) {
        return wrap(NkStyleToggle.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link NkStyleToggle.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleToggle.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkStyleToggle.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleToggle.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkStyleToggle.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkStyleToggle.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkStyleToggle.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkStyleToggle.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #normal}. */
    public static NkStyleItem nnormal(long struct) { return NkStyleItem.create(struct + NkStyleToggle.NORMAL); }
    /** Unsafe version of {@link #hover}. */
    public static NkStyleItem nhover(long struct) { return NkStyleItem.create(struct + NkStyleToggle.HOVER); }
    /** Unsafe version of {@link #active}. */
    public static NkStyleItem nactive(long struct) { return NkStyleItem.create(struct + NkStyleToggle.ACTIVE); }
    /** Unsafe version of {@link #border_color}. */
    public static NkColor nborder_color(long struct) { return NkColor.create(struct + NkStyleToggle.BORDER_COLOR); }
    /** Unsafe version of {@link #cursor_normal}. */
    public static NkStyleItem ncursor_normal(long struct) { return NkStyleItem.create(struct + NkStyleToggle.CURSOR_NORMAL); }
    /** Unsafe version of {@link #cursor_hover}. */
    public static NkStyleItem ncursor_hover(long struct) { return NkStyleItem.create(struct + NkStyleToggle.CURSOR_HOVER); }
    /** Unsafe version of {@link #text_normal}. */
    public static NkColor ntext_normal(long struct) { return NkColor.create(struct + NkStyleToggle.TEXT_NORMAL); }
    /** Unsafe version of {@link #text_hover}. */
    public static NkColor ntext_hover(long struct) { return NkColor.create(struct + NkStyleToggle.TEXT_HOVER); }
    /** Unsafe version of {@link #text_active}. */
    public static NkColor ntext_active(long struct) { return NkColor.create(struct + NkStyleToggle.TEXT_ACTIVE); }
    /** Unsafe version of {@link #text_background}. */
    public static NkColor ntext_background(long struct) { return NkColor.create(struct + NkStyleToggle.TEXT_BACKGROUND); }
    /** Unsafe version of {@link #text_alignment}. */
    public static int ntext_alignment(long struct) { return UNSAFE.getInt(null, struct + NkStyleToggle.TEXT_ALIGNMENT); }
    /** Unsafe version of {@link #padding}. */
    public static NkVec2 npadding(long struct) { return NkVec2.create(struct + NkStyleToggle.PADDING); }
    /** Unsafe version of {@link #touch_padding}. */
    public static NkVec2 ntouch_padding(long struct) { return NkVec2.create(struct + NkStyleToggle.TOUCH_PADDING); }
    /** Unsafe version of {@link #spacing}. */
    public static float nspacing(long struct) { return UNSAFE.getFloat(null, struct + NkStyleToggle.SPACING); }
    /** Unsafe version of {@link #border}. */
    public static float nborder(long struct) { return UNSAFE.getFloat(null, struct + NkStyleToggle.BORDER); }
    /** Unsafe version of {@link #userdata}. */
    public static NkHandle nuserdata(long struct) { return NkHandle.create(struct + NkStyleToggle.USERDATA); }
    /** Unsafe version of {@link #draw_begin}. */
    @Nullable public static NkDrawBeginCallback ndraw_begin(long struct) { return NkDrawBeginCallback.createSafe(memGetAddress(struct + NkStyleToggle.DRAW_BEGIN)); }
    /** Unsafe version of {@link #draw_end}. */
    @Nullable public static NkDrawEndCallback ndraw_end(long struct) { return NkDrawEndCallback.createSafe(memGetAddress(struct + NkStyleToggle.DRAW_END)); }

    /** Unsafe version of {@link #normal(NkStyleItem) normal}. */
    public static void nnormal(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleToggle.NORMAL, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #hover(NkStyleItem) hover}. */
    public static void nhover(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleToggle.HOVER, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #active(NkStyleItem) active}. */
    public static void nactive(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleToggle.ACTIVE, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #border_color(NkColor) border_color}. */
    public static void nborder_color(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleToggle.BORDER_COLOR, NkColor.SIZEOF); }
    /** Unsafe version of {@link #cursor_normal(NkStyleItem) cursor_normal}. */
    public static void ncursor_normal(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleToggle.CURSOR_NORMAL, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #cursor_hover(NkStyleItem) cursor_hover}. */
    public static void ncursor_hover(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleToggle.CURSOR_HOVER, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #text_normal(NkColor) text_normal}. */
    public static void ntext_normal(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleToggle.TEXT_NORMAL, NkColor.SIZEOF); }
    /** Unsafe version of {@link #text_hover(NkColor) text_hover}. */
    public static void ntext_hover(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleToggle.TEXT_HOVER, NkColor.SIZEOF); }
    /** Unsafe version of {@link #text_active(NkColor) text_active}. */
    public static void ntext_active(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleToggle.TEXT_ACTIVE, NkColor.SIZEOF); }
    /** Unsafe version of {@link #text_background(NkColor) text_background}. */
    public static void ntext_background(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleToggle.TEXT_BACKGROUND, NkColor.SIZEOF); }
    /** Unsafe version of {@link #text_alignment(int) text_alignment}. */
    public static void ntext_alignment(long struct, int value) { UNSAFE.putInt(null, struct + NkStyleToggle.TEXT_ALIGNMENT, value); }
    /** Unsafe version of {@link #padding(NkVec2) padding}. */
    public static void npadding(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleToggle.PADDING, NkVec2.SIZEOF); }
    /** Unsafe version of {@link #touch_padding(NkVec2) touch_padding}. */
    public static void ntouch_padding(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleToggle.TOUCH_PADDING, NkVec2.SIZEOF); }
    /** Unsafe version of {@link #spacing(float) spacing}. */
    public static void nspacing(long struct, float value) { UNSAFE.putFloat(null, struct + NkStyleToggle.SPACING, value); }
    /** Unsafe version of {@link #border(float) border}. */
    public static void nborder(long struct, float value) { UNSAFE.putFloat(null, struct + NkStyleToggle.BORDER, value); }
    /** Unsafe version of {@link #userdata(NkHandle) userdata}. */
    public static void nuserdata(long struct, NkHandle value) { memCopy(value.address(), struct + NkStyleToggle.USERDATA, NkHandle.SIZEOF); }
    /** Unsafe version of {@link #draw_begin(NkDrawBeginCallbackI) draw_begin}. */
    public static void ndraw_begin(long struct, @Nullable NkDrawBeginCallbackI value) { memPutAddress(struct + NkStyleToggle.DRAW_BEGIN, memAddressSafe(value)); }
    /** Unsafe version of {@link #draw_end(NkDrawEndCallbackI) draw_end}. */
    public static void ndraw_end(long struct, @Nullable NkDrawEndCallbackI value) { memPutAddress(struct + NkStyleToggle.DRAW_END, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link NkStyleToggle} structs. */
    public static class Buffer extends StructBuffer<NkStyleToggle, Buffer> implements NativeResource {

        private static final NkStyleToggle ELEMENT_FACTORY = NkStyleToggle.create(-1L);

        /**
         * Creates a new {@code NkStyleToggle.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkStyleToggle#SIZEOF}, and its mark will be undefined.
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
        protected NkStyleToggle getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link NkStyleItem} view of the {@code normal} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem normal() { return NkStyleToggle.nnormal(address()); }
        /** Returns a {@link NkStyleItem} view of the {@code hover} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem hover() { return NkStyleToggle.nhover(address()); }
        /** Returns a {@link NkStyleItem} view of the {@code active} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem active() { return NkStyleToggle.nactive(address()); }
        /** Returns a {@link NkColor} view of the {@code border_color} field. */
        @NativeType("struct nk_color")
        public NkColor border_color() { return NkStyleToggle.nborder_color(address()); }
        /** Returns a {@link NkStyleItem} view of the {@code cursor_normal} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem cursor_normal() { return NkStyleToggle.ncursor_normal(address()); }
        /** Returns a {@link NkStyleItem} view of the {@code cursor_hover} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem cursor_hover() { return NkStyleToggle.ncursor_hover(address()); }
        /** Returns a {@link NkColor} view of the {@code text_normal} field. */
        @NativeType("struct nk_color")
        public NkColor text_normal() { return NkStyleToggle.ntext_normal(address()); }
        /** Returns a {@link NkColor} view of the {@code text_hover} field. */
        @NativeType("struct nk_color")
        public NkColor text_hover() { return NkStyleToggle.ntext_hover(address()); }
        /** Returns a {@link NkColor} view of the {@code text_active} field. */
        @NativeType("struct nk_color")
        public NkColor text_active() { return NkStyleToggle.ntext_active(address()); }
        /** Returns a {@link NkColor} view of the {@code text_background} field. */
        @NativeType("struct nk_color")
        public NkColor text_background() { return NkStyleToggle.ntext_background(address()); }
        /** Returns the value of the {@code text_alignment} field. */
        @NativeType("nk_flags")
        public int text_alignment() { return NkStyleToggle.ntext_alignment(address()); }
        /** Returns a {@link NkVec2} view of the {@code padding} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 padding() { return NkStyleToggle.npadding(address()); }
        /** Returns a {@link NkVec2} view of the {@code touch_padding} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 touch_padding() { return NkStyleToggle.ntouch_padding(address()); }
        /** Returns the value of the {@code spacing} field. */
        public float spacing() { return NkStyleToggle.nspacing(address()); }
        /** Returns the value of the {@code border} field. */
        public float border() { return NkStyleToggle.nborder(address()); }
        /** Returns a {@link NkHandle} view of the {@code userdata} field. */
        @NativeType("nk_handle")
        public NkHandle userdata() { return NkStyleToggle.nuserdata(address()); }
        /** Returns the value of the {@code draw_begin} field. */
        @Nullable
        @NativeType("nk_draw_begin")
        public NkDrawBeginCallback draw_begin() { return NkStyleToggle.ndraw_begin(address()); }
        /** Returns the value of the {@code draw_end} field. */
        @Nullable
        @NativeType("nk_draw_end")
        public NkDrawEndCallback draw_end() { return NkStyleToggle.ndraw_end(address()); }

        /** Copies the specified {@link NkStyleItem} to the {@code normal} field. */
        public NkStyleToggle.Buffer normal(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleToggle.nnormal(address(), value); return this; }
        /** Passes the {@code normal} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleToggle.Buffer normal(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(normal()); return this; }
        /** Copies the specified {@link NkStyleItem} to the {@code hover} field. */
        public NkStyleToggle.Buffer hover(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleToggle.nhover(address(), value); return this; }
        /** Passes the {@code hover} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleToggle.Buffer hover(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(hover()); return this; }
        /** Copies the specified {@link NkStyleItem} to the {@code active} field. */
        public NkStyleToggle.Buffer active(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleToggle.nactive(address(), value); return this; }
        /** Passes the {@code active} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleToggle.Buffer active(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(active()); return this; }
        /** Copies the specified {@link NkColor} to the {@code border_color} field. */
        public NkStyleToggle.Buffer border_color(@NativeType("struct nk_color") NkColor value) { NkStyleToggle.nborder_color(address(), value); return this; }
        /** Passes the {@code border_color} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleToggle.Buffer border_color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(border_color()); return this; }
        /** Copies the specified {@link NkStyleItem} to the {@code cursor_normal} field. */
        public NkStyleToggle.Buffer cursor_normal(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleToggle.ncursor_normal(address(), value); return this; }
        /** Passes the {@code cursor_normal} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleToggle.Buffer cursor_normal(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(cursor_normal()); return this; }
        /** Copies the specified {@link NkStyleItem} to the {@code cursor_hover} field. */
        public NkStyleToggle.Buffer cursor_hover(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleToggle.ncursor_hover(address(), value); return this; }
        /** Passes the {@code cursor_hover} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleToggle.Buffer cursor_hover(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(cursor_hover()); return this; }
        /** Copies the specified {@link NkColor} to the {@code text_normal} field. */
        public NkStyleToggle.Buffer text_normal(@NativeType("struct nk_color") NkColor value) { NkStyleToggle.ntext_normal(address(), value); return this; }
        /** Passes the {@code text_normal} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleToggle.Buffer text_normal(java.util.function.Consumer<NkColor> consumer) { consumer.accept(text_normal()); return this; }
        /** Copies the specified {@link NkColor} to the {@code text_hover} field. */
        public NkStyleToggle.Buffer text_hover(@NativeType("struct nk_color") NkColor value) { NkStyleToggle.ntext_hover(address(), value); return this; }
        /** Passes the {@code text_hover} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleToggle.Buffer text_hover(java.util.function.Consumer<NkColor> consumer) { consumer.accept(text_hover()); return this; }
        /** Copies the specified {@link NkColor} to the {@code text_active} field. */
        public NkStyleToggle.Buffer text_active(@NativeType("struct nk_color") NkColor value) { NkStyleToggle.ntext_active(address(), value); return this; }
        /** Passes the {@code text_active} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleToggle.Buffer text_active(java.util.function.Consumer<NkColor> consumer) { consumer.accept(text_active()); return this; }
        /** Copies the specified {@link NkColor} to the {@code text_background} field. */
        public NkStyleToggle.Buffer text_background(@NativeType("struct nk_color") NkColor value) { NkStyleToggle.ntext_background(address(), value); return this; }
        /** Passes the {@code text_background} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleToggle.Buffer text_background(java.util.function.Consumer<NkColor> consumer) { consumer.accept(text_background()); return this; }
        /** Sets the specified value to the {@code text_alignment} field. */
        public NkStyleToggle.Buffer text_alignment(@NativeType("nk_flags") int value) { NkStyleToggle.ntext_alignment(address(), value); return this; }
        /** Copies the specified {@link NkVec2} to the {@code padding} field. */
        public NkStyleToggle.Buffer padding(@NativeType("struct nk_vec2") NkVec2 value) { NkStyleToggle.npadding(address(), value); return this; }
        /** Passes the {@code padding} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleToggle.Buffer padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(padding()); return this; }
        /** Copies the specified {@link NkVec2} to the {@code touch_padding} field. */
        public NkStyleToggle.Buffer touch_padding(@NativeType("struct nk_vec2") NkVec2 value) { NkStyleToggle.ntouch_padding(address(), value); return this; }
        /** Passes the {@code touch_padding} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleToggle.Buffer touch_padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(touch_padding()); return this; }
        /** Sets the specified value to the {@code spacing} field. */
        public NkStyleToggle.Buffer spacing(float value) { NkStyleToggle.nspacing(address(), value); return this; }
        /** Sets the specified value to the {@code border} field. */
        public NkStyleToggle.Buffer border(float value) { NkStyleToggle.nborder(address(), value); return this; }
        /** Copies the specified {@link NkHandle} to the {@code userdata} field. */
        public NkStyleToggle.Buffer userdata(@NativeType("nk_handle") NkHandle value) { NkStyleToggle.nuserdata(address(), value); return this; }
        /** Passes the {@code userdata} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleToggle.Buffer userdata(java.util.function.Consumer<NkHandle> consumer) { consumer.accept(userdata()); return this; }
        /** Sets the specified value to the {@code draw_begin} field. */
        public NkStyleToggle.Buffer draw_begin(@Nullable @NativeType("nk_draw_begin") NkDrawBeginCallbackI value) { NkStyleToggle.ndraw_begin(address(), value); return this; }
        /** Sets the specified value to the {@code draw_end} field. */
        public NkStyleToggle.Buffer draw_end(@Nullable @NativeType("nk_draw_end") NkDrawEndCallbackI value) { NkStyleToggle.ndraw_end(address(), value); return this; }

    }

}