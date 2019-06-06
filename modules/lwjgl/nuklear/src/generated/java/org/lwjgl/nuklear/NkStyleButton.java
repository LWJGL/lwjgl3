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
 * struct nk_style_button {
 *     {@link NkStyleItem struct nk_style_item} normal;
 *     {@link NkStyleItem struct nk_style_item} hover;
 *     {@link NkStyleItem struct nk_style_item} active;
 *     {@link NkColor struct nk_color} border_color;
 *     {@link NkColor struct nk_color} text_background;
 *     {@link NkColor struct nk_color} text_normal;
 *     {@link NkColor struct nk_color} text_hover;
 *     {@link NkColor struct nk_color} text_active;
 *     nk_flags text_alignment;
 *     float border;
 *     float rounding;
 *     {@link NkVec2 struct nk_vec2} padding;
 *     {@link NkVec2 struct nk_vec2} image_padding;
 *     {@link NkVec2 struct nk_vec2} touch_padding;
 *     {@link NkHandle nk_handle} userdata;
 *     {@link NkDrawBeginCallbackI nk_draw_begin} draw_begin;
 *     {@link NkDrawEndCallbackI nk_draw_end} draw_end;
 * }</code></pre>
 */
@NativeType("struct nk_style_button")
public class NkStyleButton extends Struct implements NativeResource {

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
        TEXT_BACKGROUND,
        TEXT_NORMAL,
        TEXT_HOVER,
        TEXT_ACTIVE,
        TEXT_ALIGNMENT,
        BORDER,
        ROUNDING,
        PADDING,
        IMAGE_PADDING,
        TOUCH_PADDING,
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
            __member(4),
            __member(4),
            __member(4),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
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
        TEXT_BACKGROUND = layout.offsetof(4);
        TEXT_NORMAL = layout.offsetof(5);
        TEXT_HOVER = layout.offsetof(6);
        TEXT_ACTIVE = layout.offsetof(7);
        TEXT_ALIGNMENT = layout.offsetof(8);
        BORDER = layout.offsetof(9);
        ROUNDING = layout.offsetof(10);
        PADDING = layout.offsetof(11);
        IMAGE_PADDING = layout.offsetof(12);
        TOUCH_PADDING = layout.offsetof(13);
        USERDATA = layout.offsetof(14);
        DRAW_BEGIN = layout.offsetof(15);
        DRAW_END = layout.offsetof(16);
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
    /** Returns a {@link NkColor} view of the {@code text_background} field. */
    @NativeType("struct nk_color")
    public NkColor text_background() { return ntext_background(address()); }
    /** Returns a {@link NkColor} view of the {@code text_normal} field. */
    @NativeType("struct nk_color")
    public NkColor text_normal() { return ntext_normal(address()); }
    /** Returns a {@link NkColor} view of the {@code text_hover} field. */
    @NativeType("struct nk_color")
    public NkColor text_hover() { return ntext_hover(address()); }
    /** Returns a {@link NkColor} view of the {@code text_active} field. */
    @NativeType("struct nk_color")
    public NkColor text_active() { return ntext_active(address()); }
    /** Returns the value of the {@code text_alignment} field. */
    @NativeType("nk_flags")
    public int text_alignment() { return ntext_alignment(address()); }
    /** Returns the value of the {@code border} field. */
    public float border() { return nborder(address()); }
    /** Returns the value of the {@code rounding} field. */
    public float rounding() { return nrounding(address()); }
    /** Returns a {@link NkVec2} view of the {@code padding} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 padding() { return npadding(address()); }
    /** Returns a {@link NkVec2} view of the {@code image_padding} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 image_padding() { return nimage_padding(address()); }
    /** Returns a {@link NkVec2} view of the {@code touch_padding} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 touch_padding() { return ntouch_padding(address()); }
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
        NkColor text_background,
        NkColor text_normal,
        NkColor text_hover,
        NkColor text_active,
        int text_alignment,
        float border,
        float rounding,
        NkVec2 padding,
        NkVec2 image_padding,
        NkVec2 touch_padding,
        NkHandle userdata,
        NkDrawBeginCallbackI draw_begin,
        NkDrawEndCallbackI draw_end
    ) {
        normal(normal);
        hover(hover);
        active(active);
        border_color(border_color);
        text_background(text_background);
        text_normal(text_normal);
        text_hover(text_hover);
        text_active(text_active);
        text_alignment(text_alignment);
        border(border);
        rounding(rounding);
        padding(padding);
        image_padding(image_padding);
        touch_padding(touch_padding);
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
        return wrap(NkStyleButton.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code NkStyleButton} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkStyleButton calloc() {
        return wrap(NkStyleButton.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code NkStyleButton} instance allocated with {@link BufferUtils}. */
    public static NkStyleButton create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(NkStyleButton.class, memAddress(container), container);
    }

    /** Returns a new {@code NkStyleButton} instance for the specified memory address. */
    public static NkStyleButton create(long address) {
        return wrap(NkStyleButton.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkStyleButton createSafe(long address) {
        return address == NULL ? null : wrap(NkStyleButton.class, address);
    }

    /**
     * Returns a new {@link NkStyleButton.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleButton.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NkStyleButton.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleButton.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkStyleButton.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleButton.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link NkStyleButton.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkStyleButton.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkStyleButton.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code NkStyleButton} instance allocated on the thread-local {@link MemoryStack}. */
    public static NkStyleButton mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code NkStyleButton} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static NkStyleButton callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code NkStyleButton} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkStyleButton mallocStack(MemoryStack stack) {
        return wrap(NkStyleButton.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code NkStyleButton} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkStyleButton callocStack(MemoryStack stack) {
        return wrap(NkStyleButton.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link NkStyleButton.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleButton.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkStyleButton.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleButton.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkStyleButton.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkStyleButton.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkStyleButton.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkStyleButton.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
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
    /** Unsafe version of {@link #text_background}. */
    public static NkColor ntext_background(long struct) { return NkColor.create(struct + NkStyleButton.TEXT_BACKGROUND); }
    /** Unsafe version of {@link #text_normal}. */
    public static NkColor ntext_normal(long struct) { return NkColor.create(struct + NkStyleButton.TEXT_NORMAL); }
    /** Unsafe version of {@link #text_hover}. */
    public static NkColor ntext_hover(long struct) { return NkColor.create(struct + NkStyleButton.TEXT_HOVER); }
    /** Unsafe version of {@link #text_active}. */
    public static NkColor ntext_active(long struct) { return NkColor.create(struct + NkStyleButton.TEXT_ACTIVE); }
    /** Unsafe version of {@link #text_alignment}. */
    public static int ntext_alignment(long struct) { return UNSAFE.getInt(null, struct + NkStyleButton.TEXT_ALIGNMENT); }
    /** Unsafe version of {@link #border}. */
    public static float nborder(long struct) { return UNSAFE.getFloat(null, struct + NkStyleButton.BORDER); }
    /** Unsafe version of {@link #rounding}. */
    public static float nrounding(long struct) { return UNSAFE.getFloat(null, struct + NkStyleButton.ROUNDING); }
    /** Unsafe version of {@link #padding}. */
    public static NkVec2 npadding(long struct) { return NkVec2.create(struct + NkStyleButton.PADDING); }
    /** Unsafe version of {@link #image_padding}. */
    public static NkVec2 nimage_padding(long struct) { return NkVec2.create(struct + NkStyleButton.IMAGE_PADDING); }
    /** Unsafe version of {@link #touch_padding}. */
    public static NkVec2 ntouch_padding(long struct) { return NkVec2.create(struct + NkStyleButton.TOUCH_PADDING); }
    /** Unsafe version of {@link #userdata}. */
    public static NkHandle nuserdata(long struct) { return NkHandle.create(struct + NkStyleButton.USERDATA); }
    /** Unsafe version of {@link #draw_begin}. */
    @Nullable public static NkDrawBeginCallback ndraw_begin(long struct) { return NkDrawBeginCallback.createSafe(memGetAddress(struct + NkStyleButton.DRAW_BEGIN)); }
    /** Unsafe version of {@link #draw_end}. */
    @Nullable public static NkDrawEndCallback ndraw_end(long struct) { return NkDrawEndCallback.createSafe(memGetAddress(struct + NkStyleButton.DRAW_END)); }

    /** Unsafe version of {@link #normal(NkStyleItem) normal}. */
    public static void nnormal(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleButton.NORMAL, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #hover(NkStyleItem) hover}. */
    public static void nhover(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleButton.HOVER, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #active(NkStyleItem) active}. */
    public static void nactive(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleButton.ACTIVE, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #border_color(NkColor) border_color}. */
    public static void nborder_color(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleButton.BORDER_COLOR, NkColor.SIZEOF); }
    /** Unsafe version of {@link #text_background(NkColor) text_background}. */
    public static void ntext_background(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleButton.TEXT_BACKGROUND, NkColor.SIZEOF); }
    /** Unsafe version of {@link #text_normal(NkColor) text_normal}. */
    public static void ntext_normal(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleButton.TEXT_NORMAL, NkColor.SIZEOF); }
    /** Unsafe version of {@link #text_hover(NkColor) text_hover}. */
    public static void ntext_hover(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleButton.TEXT_HOVER, NkColor.SIZEOF); }
    /** Unsafe version of {@link #text_active(NkColor) text_active}. */
    public static void ntext_active(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleButton.TEXT_ACTIVE, NkColor.SIZEOF); }
    /** Unsafe version of {@link #text_alignment(int) text_alignment}. */
    public static void ntext_alignment(long struct, int value) { UNSAFE.putInt(null, struct + NkStyleButton.TEXT_ALIGNMENT, value); }
    /** Unsafe version of {@link #border(float) border}. */
    public static void nborder(long struct, float value) { UNSAFE.putFloat(null, struct + NkStyleButton.BORDER, value); }
    /** Unsafe version of {@link #rounding(float) rounding}. */
    public static void nrounding(long struct, float value) { UNSAFE.putFloat(null, struct + NkStyleButton.ROUNDING, value); }
    /** Unsafe version of {@link #padding(NkVec2) padding}. */
    public static void npadding(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleButton.PADDING, NkVec2.SIZEOF); }
    /** Unsafe version of {@link #image_padding(NkVec2) image_padding}. */
    public static void nimage_padding(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleButton.IMAGE_PADDING, NkVec2.SIZEOF); }
    /** Unsafe version of {@link #touch_padding(NkVec2) touch_padding}. */
    public static void ntouch_padding(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleButton.TOUCH_PADDING, NkVec2.SIZEOF); }
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
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkStyleButton#SIZEOF}, and its mark will be undefined.
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
        protected NkStyleButton getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link NkStyleItem} view of the {@code normal} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem normal() { return NkStyleButton.nnormal(address()); }
        /** Returns a {@link NkStyleItem} view of the {@code hover} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem hover() { return NkStyleButton.nhover(address()); }
        /** Returns a {@link NkStyleItem} view of the {@code active} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem active() { return NkStyleButton.nactive(address()); }
        /** Returns a {@link NkColor} view of the {@code border_color} field. */
        @NativeType("struct nk_color")
        public NkColor border_color() { return NkStyleButton.nborder_color(address()); }
        /** Returns a {@link NkColor} view of the {@code text_background} field. */
        @NativeType("struct nk_color")
        public NkColor text_background() { return NkStyleButton.ntext_background(address()); }
        /** Returns a {@link NkColor} view of the {@code text_normal} field. */
        @NativeType("struct nk_color")
        public NkColor text_normal() { return NkStyleButton.ntext_normal(address()); }
        /** Returns a {@link NkColor} view of the {@code text_hover} field. */
        @NativeType("struct nk_color")
        public NkColor text_hover() { return NkStyleButton.ntext_hover(address()); }
        /** Returns a {@link NkColor} view of the {@code text_active} field. */
        @NativeType("struct nk_color")
        public NkColor text_active() { return NkStyleButton.ntext_active(address()); }
        /** Returns the value of the {@code text_alignment} field. */
        @NativeType("nk_flags")
        public int text_alignment() { return NkStyleButton.ntext_alignment(address()); }
        /** Returns the value of the {@code border} field. */
        public float border() { return NkStyleButton.nborder(address()); }
        /** Returns the value of the {@code rounding} field. */
        public float rounding() { return NkStyleButton.nrounding(address()); }
        /** Returns a {@link NkVec2} view of the {@code padding} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 padding() { return NkStyleButton.npadding(address()); }
        /** Returns a {@link NkVec2} view of the {@code image_padding} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 image_padding() { return NkStyleButton.nimage_padding(address()); }
        /** Returns a {@link NkVec2} view of the {@code touch_padding} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 touch_padding() { return NkStyleButton.ntouch_padding(address()); }
        /** Returns a {@link NkHandle} view of the {@code userdata} field. */
        @NativeType("nk_handle")
        public NkHandle userdata() { return NkStyleButton.nuserdata(address()); }
        /** Returns the value of the {@code draw_begin} field. */
        @Nullable
        @NativeType("nk_draw_begin")
        public NkDrawBeginCallback draw_begin() { return NkStyleButton.ndraw_begin(address()); }
        /** Returns the value of the {@code draw_end} field. */
        @Nullable
        @NativeType("nk_draw_end")
        public NkDrawEndCallback draw_end() { return NkStyleButton.ndraw_end(address()); }

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