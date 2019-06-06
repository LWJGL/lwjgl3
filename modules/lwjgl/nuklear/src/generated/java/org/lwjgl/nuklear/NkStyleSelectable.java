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
 * struct nk_style_selectable {
 *     {@link NkStyleItem struct nk_style_item} normal;
 *     {@link NkStyleItem struct nk_style_item} hover;
 *     {@link NkStyleItem struct nk_style_item} pressed;
 *     {@link NkStyleItem struct nk_style_item} normal_active;
 *     {@link NkStyleItem struct nk_style_item} hover_active;
 *     {@link NkStyleItem struct nk_style_item} pressed_active;
 *     {@link NkColor struct nk_color} text_normal;
 *     {@link NkColor struct nk_color} text_hover;
 *     {@link NkColor struct nk_color} text_pressed;
 *     {@link NkColor struct nk_color} text_normal_active;
 *     {@link NkColor struct nk_color} text_hover_active;
 *     {@link NkColor struct nk_color} text_pressed_active;
 *     {@link NkColor struct nk_color} text_background;
 *     nk_flags text_alignment;
 *     float rounding;
 *     {@link NkVec2 struct nk_vec2} padding;
 *     {@link NkVec2 struct nk_vec2} touch_padding;
 *     {@link NkVec2 struct nk_vec2} image_padding;
 *     {@link NkHandle nk_handle} userdata;
 *     {@link NkDrawBeginCallbackI nk_draw_begin} draw_begin;
 *     {@link NkDrawEndCallbackI nk_draw_end} draw_end;
 * }</code></pre>
 */
@NativeType("struct nk_style_selectable")
public class NkStyleSelectable extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NORMAL,
        HOVER,
        PRESSED,
        NORMAL_ACTIVE,
        HOVER_ACTIVE,
        PRESSED_ACTIVE,
        TEXT_NORMAL,
        TEXT_HOVER,
        TEXT_PRESSED,
        TEXT_NORMAL_ACTIVE,
        TEXT_HOVER_ACTIVE,
        TEXT_PRESSED_ACTIVE,
        TEXT_BACKGROUND,
        TEXT_ALIGNMENT,
        ROUNDING,
        PADDING,
        TOUCH_PADDING,
        IMAGE_PADDING,
        USERDATA,
        DRAW_BEGIN,
        DRAW_END;

    static {
        Layout layout = __struct(
            __member(NkStyleItem.SIZEOF, NkStyleItem.ALIGNOF),
            __member(NkStyleItem.SIZEOF, NkStyleItem.ALIGNOF),
            __member(NkStyleItem.SIZEOF, NkStyleItem.ALIGNOF),
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
        PRESSED = layout.offsetof(2);
        NORMAL_ACTIVE = layout.offsetof(3);
        HOVER_ACTIVE = layout.offsetof(4);
        PRESSED_ACTIVE = layout.offsetof(5);
        TEXT_NORMAL = layout.offsetof(6);
        TEXT_HOVER = layout.offsetof(7);
        TEXT_PRESSED = layout.offsetof(8);
        TEXT_NORMAL_ACTIVE = layout.offsetof(9);
        TEXT_HOVER_ACTIVE = layout.offsetof(10);
        TEXT_PRESSED_ACTIVE = layout.offsetof(11);
        TEXT_BACKGROUND = layout.offsetof(12);
        TEXT_ALIGNMENT = layout.offsetof(13);
        ROUNDING = layout.offsetof(14);
        PADDING = layout.offsetof(15);
        TOUCH_PADDING = layout.offsetof(16);
        IMAGE_PADDING = layout.offsetof(17);
        USERDATA = layout.offsetof(18);
        DRAW_BEGIN = layout.offsetof(19);
        DRAW_END = layout.offsetof(20);
    }

    /**
     * Creates a {@code NkStyleSelectable} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkStyleSelectable(ByteBuffer container) {
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
    /** Returns a {@link NkStyleItem} view of the {@code pressed} field. */
    @NativeType("struct nk_style_item")
    public NkStyleItem pressed() { return npressed(address()); }
    /** Returns a {@link NkStyleItem} view of the {@code normal_active} field. */
    @NativeType("struct nk_style_item")
    public NkStyleItem normal_active() { return nnormal_active(address()); }
    /** Returns a {@link NkStyleItem} view of the {@code hover_active} field. */
    @NativeType("struct nk_style_item")
    public NkStyleItem hover_active() { return nhover_active(address()); }
    /** Returns a {@link NkStyleItem} view of the {@code pressed_active} field. */
    @NativeType("struct nk_style_item")
    public NkStyleItem pressed_active() { return npressed_active(address()); }
    /** Returns a {@link NkColor} view of the {@code text_normal} field. */
    @NativeType("struct nk_color")
    public NkColor text_normal() { return ntext_normal(address()); }
    /** Returns a {@link NkColor} view of the {@code text_hover} field. */
    @NativeType("struct nk_color")
    public NkColor text_hover() { return ntext_hover(address()); }
    /** Returns a {@link NkColor} view of the {@code text_pressed} field. */
    @NativeType("struct nk_color")
    public NkColor text_pressed() { return ntext_pressed(address()); }
    /** Returns a {@link NkColor} view of the {@code text_normal_active} field. */
    @NativeType("struct nk_color")
    public NkColor text_normal_active() { return ntext_normal_active(address()); }
    /** Returns a {@link NkColor} view of the {@code text_hover_active} field. */
    @NativeType("struct nk_color")
    public NkColor text_hover_active() { return ntext_hover_active(address()); }
    /** Returns a {@link NkColor} view of the {@code text_pressed_active} field. */
    @NativeType("struct nk_color")
    public NkColor text_pressed_active() { return ntext_pressed_active(address()); }
    /** Returns a {@link NkColor} view of the {@code text_background} field. */
    @NativeType("struct nk_color")
    public NkColor text_background() { return ntext_background(address()); }
    /** Returns the value of the {@code text_alignment} field. */
    @NativeType("nk_flags")
    public int text_alignment() { return ntext_alignment(address()); }
    /** Returns the value of the {@code rounding} field. */
    public float rounding() { return nrounding(address()); }
    /** Returns a {@link NkVec2} view of the {@code padding} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 padding() { return npadding(address()); }
    /** Returns a {@link NkVec2} view of the {@code touch_padding} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 touch_padding() { return ntouch_padding(address()); }
    /** Returns a {@link NkVec2} view of the {@code image_padding} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 image_padding() { return nimage_padding(address()); }
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
    public NkStyleSelectable normal(@NativeType("struct nk_style_item") NkStyleItem value) { nnormal(address(), value); return this; }
    /** Passes the {@code normal} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleSelectable normal(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(normal()); return this; }
    /** Copies the specified {@link NkStyleItem} to the {@code hover} field. */
    public NkStyleSelectable hover(@NativeType("struct nk_style_item") NkStyleItem value) { nhover(address(), value); return this; }
    /** Passes the {@code hover} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleSelectable hover(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(hover()); return this; }
    /** Copies the specified {@link NkStyleItem} to the {@code pressed} field. */
    public NkStyleSelectable pressed(@NativeType("struct nk_style_item") NkStyleItem value) { npressed(address(), value); return this; }
    /** Passes the {@code pressed} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleSelectable pressed(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(pressed()); return this; }
    /** Copies the specified {@link NkStyleItem} to the {@code normal_active} field. */
    public NkStyleSelectable normal_active(@NativeType("struct nk_style_item") NkStyleItem value) { nnormal_active(address(), value); return this; }
    /** Passes the {@code normal_active} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleSelectable normal_active(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(normal_active()); return this; }
    /** Copies the specified {@link NkStyleItem} to the {@code hover_active} field. */
    public NkStyleSelectable hover_active(@NativeType("struct nk_style_item") NkStyleItem value) { nhover_active(address(), value); return this; }
    /** Passes the {@code hover_active} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleSelectable hover_active(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(hover_active()); return this; }
    /** Copies the specified {@link NkStyleItem} to the {@code pressed_active} field. */
    public NkStyleSelectable pressed_active(@NativeType("struct nk_style_item") NkStyleItem value) { npressed_active(address(), value); return this; }
    /** Passes the {@code pressed_active} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleSelectable pressed_active(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(pressed_active()); return this; }
    /** Copies the specified {@link NkColor} to the {@code text_normal} field. */
    public NkStyleSelectable text_normal(@NativeType("struct nk_color") NkColor value) { ntext_normal(address(), value); return this; }
    /** Passes the {@code text_normal} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleSelectable text_normal(java.util.function.Consumer<NkColor> consumer) { consumer.accept(text_normal()); return this; }
    /** Copies the specified {@link NkColor} to the {@code text_hover} field. */
    public NkStyleSelectable text_hover(@NativeType("struct nk_color") NkColor value) { ntext_hover(address(), value); return this; }
    /** Passes the {@code text_hover} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleSelectable text_hover(java.util.function.Consumer<NkColor> consumer) { consumer.accept(text_hover()); return this; }
    /** Copies the specified {@link NkColor} to the {@code text_pressed} field. */
    public NkStyleSelectable text_pressed(@NativeType("struct nk_color") NkColor value) { ntext_pressed(address(), value); return this; }
    /** Passes the {@code text_pressed} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleSelectable text_pressed(java.util.function.Consumer<NkColor> consumer) { consumer.accept(text_pressed()); return this; }
    /** Copies the specified {@link NkColor} to the {@code text_normal_active} field. */
    public NkStyleSelectable text_normal_active(@NativeType("struct nk_color") NkColor value) { ntext_normal_active(address(), value); return this; }
    /** Passes the {@code text_normal_active} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleSelectable text_normal_active(java.util.function.Consumer<NkColor> consumer) { consumer.accept(text_normal_active()); return this; }
    /** Copies the specified {@link NkColor} to the {@code text_hover_active} field. */
    public NkStyleSelectable text_hover_active(@NativeType("struct nk_color") NkColor value) { ntext_hover_active(address(), value); return this; }
    /** Passes the {@code text_hover_active} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleSelectable text_hover_active(java.util.function.Consumer<NkColor> consumer) { consumer.accept(text_hover_active()); return this; }
    /** Copies the specified {@link NkColor} to the {@code text_pressed_active} field. */
    public NkStyleSelectable text_pressed_active(@NativeType("struct nk_color") NkColor value) { ntext_pressed_active(address(), value); return this; }
    /** Passes the {@code text_pressed_active} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleSelectable text_pressed_active(java.util.function.Consumer<NkColor> consumer) { consumer.accept(text_pressed_active()); return this; }
    /** Copies the specified {@link NkColor} to the {@code text_background} field. */
    public NkStyleSelectable text_background(@NativeType("struct nk_color") NkColor value) { ntext_background(address(), value); return this; }
    /** Passes the {@code text_background} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleSelectable text_background(java.util.function.Consumer<NkColor> consumer) { consumer.accept(text_background()); return this; }
    /** Sets the specified value to the {@code text_alignment} field. */
    public NkStyleSelectable text_alignment(@NativeType("nk_flags") int value) { ntext_alignment(address(), value); return this; }
    /** Sets the specified value to the {@code rounding} field. */
    public NkStyleSelectable rounding(float value) { nrounding(address(), value); return this; }
    /** Copies the specified {@link NkVec2} to the {@code padding} field. */
    public NkStyleSelectable padding(@NativeType("struct nk_vec2") NkVec2 value) { npadding(address(), value); return this; }
    /** Passes the {@code padding} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleSelectable padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(padding()); return this; }
    /** Copies the specified {@link NkVec2} to the {@code touch_padding} field. */
    public NkStyleSelectable touch_padding(@NativeType("struct nk_vec2") NkVec2 value) { ntouch_padding(address(), value); return this; }
    /** Passes the {@code touch_padding} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleSelectable touch_padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(touch_padding()); return this; }
    /** Copies the specified {@link NkVec2} to the {@code image_padding} field. */
    public NkStyleSelectable image_padding(@NativeType("struct nk_vec2") NkVec2 value) { nimage_padding(address(), value); return this; }
    /** Passes the {@code image_padding} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleSelectable image_padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(image_padding()); return this; }
    /** Copies the specified {@link NkHandle} to the {@code userdata} field. */
    public NkStyleSelectable userdata(@NativeType("nk_handle") NkHandle value) { nuserdata(address(), value); return this; }
    /** Passes the {@code userdata} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleSelectable userdata(java.util.function.Consumer<NkHandle> consumer) { consumer.accept(userdata()); return this; }
    /** Sets the specified value to the {@code draw_begin} field. */
    public NkStyleSelectable draw_begin(@Nullable @NativeType("nk_draw_begin") NkDrawBeginCallbackI value) { ndraw_begin(address(), value); return this; }
    /** Sets the specified value to the {@code draw_end} field. */
    public NkStyleSelectable draw_end(@Nullable @NativeType("nk_draw_end") NkDrawEndCallbackI value) { ndraw_end(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public NkStyleSelectable set(
        NkStyleItem normal,
        NkStyleItem hover,
        NkStyleItem pressed,
        NkStyleItem normal_active,
        NkStyleItem hover_active,
        NkStyleItem pressed_active,
        NkColor text_normal,
        NkColor text_hover,
        NkColor text_pressed,
        NkColor text_normal_active,
        NkColor text_hover_active,
        NkColor text_pressed_active,
        NkColor text_background,
        int text_alignment,
        float rounding,
        NkVec2 padding,
        NkVec2 touch_padding,
        NkVec2 image_padding,
        NkHandle userdata,
        NkDrawBeginCallbackI draw_begin,
        NkDrawEndCallbackI draw_end
    ) {
        normal(normal);
        hover(hover);
        pressed(pressed);
        normal_active(normal_active);
        hover_active(hover_active);
        pressed_active(pressed_active);
        text_normal(text_normal);
        text_hover(text_hover);
        text_pressed(text_pressed);
        text_normal_active(text_normal_active);
        text_hover_active(text_hover_active);
        text_pressed_active(text_pressed_active);
        text_background(text_background);
        text_alignment(text_alignment);
        rounding(rounding);
        padding(padding);
        touch_padding(touch_padding);
        image_padding(image_padding);
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
    public NkStyleSelectable set(NkStyleSelectable src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code NkStyleSelectable} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkStyleSelectable malloc() {
        return wrap(NkStyleSelectable.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code NkStyleSelectable} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkStyleSelectable calloc() {
        return wrap(NkStyleSelectable.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code NkStyleSelectable} instance allocated with {@link BufferUtils}. */
    public static NkStyleSelectable create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(NkStyleSelectable.class, memAddress(container), container);
    }

    /** Returns a new {@code NkStyleSelectable} instance for the specified memory address. */
    public static NkStyleSelectable create(long address) {
        return wrap(NkStyleSelectable.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkStyleSelectable createSafe(long address) {
        return address == NULL ? null : wrap(NkStyleSelectable.class, address);
    }

    /**
     * Returns a new {@link NkStyleSelectable.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleSelectable.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NkStyleSelectable.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleSelectable.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkStyleSelectable.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleSelectable.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link NkStyleSelectable.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkStyleSelectable.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkStyleSelectable.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code NkStyleSelectable} instance allocated on the thread-local {@link MemoryStack}. */
    public static NkStyleSelectable mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code NkStyleSelectable} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static NkStyleSelectable callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code NkStyleSelectable} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkStyleSelectable mallocStack(MemoryStack stack) {
        return wrap(NkStyleSelectable.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code NkStyleSelectable} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkStyleSelectable callocStack(MemoryStack stack) {
        return wrap(NkStyleSelectable.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link NkStyleSelectable.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleSelectable.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkStyleSelectable.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleSelectable.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkStyleSelectable.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkStyleSelectable.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkStyleSelectable.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkStyleSelectable.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #normal}. */
    public static NkStyleItem nnormal(long struct) { return NkStyleItem.create(struct + NkStyleSelectable.NORMAL); }
    /** Unsafe version of {@link #hover}. */
    public static NkStyleItem nhover(long struct) { return NkStyleItem.create(struct + NkStyleSelectable.HOVER); }
    /** Unsafe version of {@link #pressed}. */
    public static NkStyleItem npressed(long struct) { return NkStyleItem.create(struct + NkStyleSelectable.PRESSED); }
    /** Unsafe version of {@link #normal_active}. */
    public static NkStyleItem nnormal_active(long struct) { return NkStyleItem.create(struct + NkStyleSelectable.NORMAL_ACTIVE); }
    /** Unsafe version of {@link #hover_active}. */
    public static NkStyleItem nhover_active(long struct) { return NkStyleItem.create(struct + NkStyleSelectable.HOVER_ACTIVE); }
    /** Unsafe version of {@link #pressed_active}. */
    public static NkStyleItem npressed_active(long struct) { return NkStyleItem.create(struct + NkStyleSelectable.PRESSED_ACTIVE); }
    /** Unsafe version of {@link #text_normal}. */
    public static NkColor ntext_normal(long struct) { return NkColor.create(struct + NkStyleSelectable.TEXT_NORMAL); }
    /** Unsafe version of {@link #text_hover}. */
    public static NkColor ntext_hover(long struct) { return NkColor.create(struct + NkStyleSelectable.TEXT_HOVER); }
    /** Unsafe version of {@link #text_pressed}. */
    public static NkColor ntext_pressed(long struct) { return NkColor.create(struct + NkStyleSelectable.TEXT_PRESSED); }
    /** Unsafe version of {@link #text_normal_active}. */
    public static NkColor ntext_normal_active(long struct) { return NkColor.create(struct + NkStyleSelectable.TEXT_NORMAL_ACTIVE); }
    /** Unsafe version of {@link #text_hover_active}. */
    public static NkColor ntext_hover_active(long struct) { return NkColor.create(struct + NkStyleSelectable.TEXT_HOVER_ACTIVE); }
    /** Unsafe version of {@link #text_pressed_active}. */
    public static NkColor ntext_pressed_active(long struct) { return NkColor.create(struct + NkStyleSelectable.TEXT_PRESSED_ACTIVE); }
    /** Unsafe version of {@link #text_background}. */
    public static NkColor ntext_background(long struct) { return NkColor.create(struct + NkStyleSelectable.TEXT_BACKGROUND); }
    /** Unsafe version of {@link #text_alignment}. */
    public static int ntext_alignment(long struct) { return UNSAFE.getInt(null, struct + NkStyleSelectable.TEXT_ALIGNMENT); }
    /** Unsafe version of {@link #rounding}. */
    public static float nrounding(long struct) { return UNSAFE.getFloat(null, struct + NkStyleSelectable.ROUNDING); }
    /** Unsafe version of {@link #padding}. */
    public static NkVec2 npadding(long struct) { return NkVec2.create(struct + NkStyleSelectable.PADDING); }
    /** Unsafe version of {@link #touch_padding}. */
    public static NkVec2 ntouch_padding(long struct) { return NkVec2.create(struct + NkStyleSelectable.TOUCH_PADDING); }
    /** Unsafe version of {@link #image_padding}. */
    public static NkVec2 nimage_padding(long struct) { return NkVec2.create(struct + NkStyleSelectable.IMAGE_PADDING); }
    /** Unsafe version of {@link #userdata}. */
    public static NkHandle nuserdata(long struct) { return NkHandle.create(struct + NkStyleSelectable.USERDATA); }
    /** Unsafe version of {@link #draw_begin}. */
    @Nullable public static NkDrawBeginCallback ndraw_begin(long struct) { return NkDrawBeginCallback.createSafe(memGetAddress(struct + NkStyleSelectable.DRAW_BEGIN)); }
    /** Unsafe version of {@link #draw_end}. */
    @Nullable public static NkDrawEndCallback ndraw_end(long struct) { return NkDrawEndCallback.createSafe(memGetAddress(struct + NkStyleSelectable.DRAW_END)); }

    /** Unsafe version of {@link #normal(NkStyleItem) normal}. */
    public static void nnormal(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleSelectable.NORMAL, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #hover(NkStyleItem) hover}. */
    public static void nhover(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleSelectable.HOVER, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #pressed(NkStyleItem) pressed}. */
    public static void npressed(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleSelectable.PRESSED, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #normal_active(NkStyleItem) normal_active}. */
    public static void nnormal_active(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleSelectable.NORMAL_ACTIVE, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #hover_active(NkStyleItem) hover_active}. */
    public static void nhover_active(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleSelectable.HOVER_ACTIVE, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #pressed_active(NkStyleItem) pressed_active}. */
    public static void npressed_active(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleSelectable.PRESSED_ACTIVE, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #text_normal(NkColor) text_normal}. */
    public static void ntext_normal(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleSelectable.TEXT_NORMAL, NkColor.SIZEOF); }
    /** Unsafe version of {@link #text_hover(NkColor) text_hover}. */
    public static void ntext_hover(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleSelectable.TEXT_HOVER, NkColor.SIZEOF); }
    /** Unsafe version of {@link #text_pressed(NkColor) text_pressed}. */
    public static void ntext_pressed(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleSelectable.TEXT_PRESSED, NkColor.SIZEOF); }
    /** Unsafe version of {@link #text_normal_active(NkColor) text_normal_active}. */
    public static void ntext_normal_active(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleSelectable.TEXT_NORMAL_ACTIVE, NkColor.SIZEOF); }
    /** Unsafe version of {@link #text_hover_active(NkColor) text_hover_active}. */
    public static void ntext_hover_active(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleSelectable.TEXT_HOVER_ACTIVE, NkColor.SIZEOF); }
    /** Unsafe version of {@link #text_pressed_active(NkColor) text_pressed_active}. */
    public static void ntext_pressed_active(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleSelectable.TEXT_PRESSED_ACTIVE, NkColor.SIZEOF); }
    /** Unsafe version of {@link #text_background(NkColor) text_background}. */
    public static void ntext_background(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleSelectable.TEXT_BACKGROUND, NkColor.SIZEOF); }
    /** Unsafe version of {@link #text_alignment(int) text_alignment}. */
    public static void ntext_alignment(long struct, int value) { UNSAFE.putInt(null, struct + NkStyleSelectable.TEXT_ALIGNMENT, value); }
    /** Unsafe version of {@link #rounding(float) rounding}. */
    public static void nrounding(long struct, float value) { UNSAFE.putFloat(null, struct + NkStyleSelectable.ROUNDING, value); }
    /** Unsafe version of {@link #padding(NkVec2) padding}. */
    public static void npadding(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleSelectable.PADDING, NkVec2.SIZEOF); }
    /** Unsafe version of {@link #touch_padding(NkVec2) touch_padding}. */
    public static void ntouch_padding(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleSelectable.TOUCH_PADDING, NkVec2.SIZEOF); }
    /** Unsafe version of {@link #image_padding(NkVec2) image_padding}. */
    public static void nimage_padding(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleSelectable.IMAGE_PADDING, NkVec2.SIZEOF); }
    /** Unsafe version of {@link #userdata(NkHandle) userdata}. */
    public static void nuserdata(long struct, NkHandle value) { memCopy(value.address(), struct + NkStyleSelectable.USERDATA, NkHandle.SIZEOF); }
    /** Unsafe version of {@link #draw_begin(NkDrawBeginCallbackI) draw_begin}. */
    public static void ndraw_begin(long struct, @Nullable NkDrawBeginCallbackI value) { memPutAddress(struct + NkStyleSelectable.DRAW_BEGIN, memAddressSafe(value)); }
    /** Unsafe version of {@link #draw_end(NkDrawEndCallbackI) draw_end}. */
    public static void ndraw_end(long struct, @Nullable NkDrawEndCallbackI value) { memPutAddress(struct + NkStyleSelectable.DRAW_END, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link NkStyleSelectable} structs. */
    public static class Buffer extends StructBuffer<NkStyleSelectable, Buffer> implements NativeResource {

        private static final NkStyleSelectable ELEMENT_FACTORY = NkStyleSelectable.create(-1L);

        /**
         * Creates a new {@code NkStyleSelectable.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkStyleSelectable#SIZEOF}, and its mark will be undefined.
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
        protected NkStyleSelectable getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link NkStyleItem} view of the {@code normal} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem normal() { return NkStyleSelectable.nnormal(address()); }
        /** Returns a {@link NkStyleItem} view of the {@code hover} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem hover() { return NkStyleSelectable.nhover(address()); }
        /** Returns a {@link NkStyleItem} view of the {@code pressed} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem pressed() { return NkStyleSelectable.npressed(address()); }
        /** Returns a {@link NkStyleItem} view of the {@code normal_active} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem normal_active() { return NkStyleSelectable.nnormal_active(address()); }
        /** Returns a {@link NkStyleItem} view of the {@code hover_active} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem hover_active() { return NkStyleSelectable.nhover_active(address()); }
        /** Returns a {@link NkStyleItem} view of the {@code pressed_active} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem pressed_active() { return NkStyleSelectable.npressed_active(address()); }
        /** Returns a {@link NkColor} view of the {@code text_normal} field. */
        @NativeType("struct nk_color")
        public NkColor text_normal() { return NkStyleSelectable.ntext_normal(address()); }
        /** Returns a {@link NkColor} view of the {@code text_hover} field. */
        @NativeType("struct nk_color")
        public NkColor text_hover() { return NkStyleSelectable.ntext_hover(address()); }
        /** Returns a {@link NkColor} view of the {@code text_pressed} field. */
        @NativeType("struct nk_color")
        public NkColor text_pressed() { return NkStyleSelectable.ntext_pressed(address()); }
        /** Returns a {@link NkColor} view of the {@code text_normal_active} field. */
        @NativeType("struct nk_color")
        public NkColor text_normal_active() { return NkStyleSelectable.ntext_normal_active(address()); }
        /** Returns a {@link NkColor} view of the {@code text_hover_active} field. */
        @NativeType("struct nk_color")
        public NkColor text_hover_active() { return NkStyleSelectable.ntext_hover_active(address()); }
        /** Returns a {@link NkColor} view of the {@code text_pressed_active} field. */
        @NativeType("struct nk_color")
        public NkColor text_pressed_active() { return NkStyleSelectable.ntext_pressed_active(address()); }
        /** Returns a {@link NkColor} view of the {@code text_background} field. */
        @NativeType("struct nk_color")
        public NkColor text_background() { return NkStyleSelectable.ntext_background(address()); }
        /** Returns the value of the {@code text_alignment} field. */
        @NativeType("nk_flags")
        public int text_alignment() { return NkStyleSelectable.ntext_alignment(address()); }
        /** Returns the value of the {@code rounding} field. */
        public float rounding() { return NkStyleSelectable.nrounding(address()); }
        /** Returns a {@link NkVec2} view of the {@code padding} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 padding() { return NkStyleSelectable.npadding(address()); }
        /** Returns a {@link NkVec2} view of the {@code touch_padding} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 touch_padding() { return NkStyleSelectable.ntouch_padding(address()); }
        /** Returns a {@link NkVec2} view of the {@code image_padding} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 image_padding() { return NkStyleSelectable.nimage_padding(address()); }
        /** Returns a {@link NkHandle} view of the {@code userdata} field. */
        @NativeType("nk_handle")
        public NkHandle userdata() { return NkStyleSelectable.nuserdata(address()); }
        /** Returns the value of the {@code draw_begin} field. */
        @Nullable
        @NativeType("nk_draw_begin")
        public NkDrawBeginCallback draw_begin() { return NkStyleSelectable.ndraw_begin(address()); }
        /** Returns the value of the {@code draw_end} field. */
        @Nullable
        @NativeType("nk_draw_end")
        public NkDrawEndCallback draw_end() { return NkStyleSelectable.ndraw_end(address()); }

        /** Copies the specified {@link NkStyleItem} to the {@code normal} field. */
        public NkStyleSelectable.Buffer normal(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleSelectable.nnormal(address(), value); return this; }
        /** Passes the {@code normal} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleSelectable.Buffer normal(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(normal()); return this; }
        /** Copies the specified {@link NkStyleItem} to the {@code hover} field. */
        public NkStyleSelectable.Buffer hover(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleSelectable.nhover(address(), value); return this; }
        /** Passes the {@code hover} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleSelectable.Buffer hover(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(hover()); return this; }
        /** Copies the specified {@link NkStyleItem} to the {@code pressed} field. */
        public NkStyleSelectable.Buffer pressed(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleSelectable.npressed(address(), value); return this; }
        /** Passes the {@code pressed} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleSelectable.Buffer pressed(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(pressed()); return this; }
        /** Copies the specified {@link NkStyleItem} to the {@code normal_active} field. */
        public NkStyleSelectable.Buffer normal_active(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleSelectable.nnormal_active(address(), value); return this; }
        /** Passes the {@code normal_active} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleSelectable.Buffer normal_active(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(normal_active()); return this; }
        /** Copies the specified {@link NkStyleItem} to the {@code hover_active} field. */
        public NkStyleSelectable.Buffer hover_active(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleSelectable.nhover_active(address(), value); return this; }
        /** Passes the {@code hover_active} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleSelectable.Buffer hover_active(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(hover_active()); return this; }
        /** Copies the specified {@link NkStyleItem} to the {@code pressed_active} field. */
        public NkStyleSelectable.Buffer pressed_active(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleSelectable.npressed_active(address(), value); return this; }
        /** Passes the {@code pressed_active} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleSelectable.Buffer pressed_active(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(pressed_active()); return this; }
        /** Copies the specified {@link NkColor} to the {@code text_normal} field. */
        public NkStyleSelectable.Buffer text_normal(@NativeType("struct nk_color") NkColor value) { NkStyleSelectable.ntext_normal(address(), value); return this; }
        /** Passes the {@code text_normal} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleSelectable.Buffer text_normal(java.util.function.Consumer<NkColor> consumer) { consumer.accept(text_normal()); return this; }
        /** Copies the specified {@link NkColor} to the {@code text_hover} field. */
        public NkStyleSelectable.Buffer text_hover(@NativeType("struct nk_color") NkColor value) { NkStyleSelectable.ntext_hover(address(), value); return this; }
        /** Passes the {@code text_hover} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleSelectable.Buffer text_hover(java.util.function.Consumer<NkColor> consumer) { consumer.accept(text_hover()); return this; }
        /** Copies the specified {@link NkColor} to the {@code text_pressed} field. */
        public NkStyleSelectable.Buffer text_pressed(@NativeType("struct nk_color") NkColor value) { NkStyleSelectable.ntext_pressed(address(), value); return this; }
        /** Passes the {@code text_pressed} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleSelectable.Buffer text_pressed(java.util.function.Consumer<NkColor> consumer) { consumer.accept(text_pressed()); return this; }
        /** Copies the specified {@link NkColor} to the {@code text_normal_active} field. */
        public NkStyleSelectable.Buffer text_normal_active(@NativeType("struct nk_color") NkColor value) { NkStyleSelectable.ntext_normal_active(address(), value); return this; }
        /** Passes the {@code text_normal_active} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleSelectable.Buffer text_normal_active(java.util.function.Consumer<NkColor> consumer) { consumer.accept(text_normal_active()); return this; }
        /** Copies the specified {@link NkColor} to the {@code text_hover_active} field. */
        public NkStyleSelectable.Buffer text_hover_active(@NativeType("struct nk_color") NkColor value) { NkStyleSelectable.ntext_hover_active(address(), value); return this; }
        /** Passes the {@code text_hover_active} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleSelectable.Buffer text_hover_active(java.util.function.Consumer<NkColor> consumer) { consumer.accept(text_hover_active()); return this; }
        /** Copies the specified {@link NkColor} to the {@code text_pressed_active} field. */
        public NkStyleSelectable.Buffer text_pressed_active(@NativeType("struct nk_color") NkColor value) { NkStyleSelectable.ntext_pressed_active(address(), value); return this; }
        /** Passes the {@code text_pressed_active} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleSelectable.Buffer text_pressed_active(java.util.function.Consumer<NkColor> consumer) { consumer.accept(text_pressed_active()); return this; }
        /** Copies the specified {@link NkColor} to the {@code text_background} field. */
        public NkStyleSelectable.Buffer text_background(@NativeType("struct nk_color") NkColor value) { NkStyleSelectable.ntext_background(address(), value); return this; }
        /** Passes the {@code text_background} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleSelectable.Buffer text_background(java.util.function.Consumer<NkColor> consumer) { consumer.accept(text_background()); return this; }
        /** Sets the specified value to the {@code text_alignment} field. */
        public NkStyleSelectable.Buffer text_alignment(@NativeType("nk_flags") int value) { NkStyleSelectable.ntext_alignment(address(), value); return this; }
        /** Sets the specified value to the {@code rounding} field. */
        public NkStyleSelectable.Buffer rounding(float value) { NkStyleSelectable.nrounding(address(), value); return this; }
        /** Copies the specified {@link NkVec2} to the {@code padding} field. */
        public NkStyleSelectable.Buffer padding(@NativeType("struct nk_vec2") NkVec2 value) { NkStyleSelectable.npadding(address(), value); return this; }
        /** Passes the {@code padding} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleSelectable.Buffer padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(padding()); return this; }
        /** Copies the specified {@link NkVec2} to the {@code touch_padding} field. */
        public NkStyleSelectable.Buffer touch_padding(@NativeType("struct nk_vec2") NkVec2 value) { NkStyleSelectable.ntouch_padding(address(), value); return this; }
        /** Passes the {@code touch_padding} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleSelectable.Buffer touch_padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(touch_padding()); return this; }
        /** Copies the specified {@link NkVec2} to the {@code image_padding} field. */
        public NkStyleSelectable.Buffer image_padding(@NativeType("struct nk_vec2") NkVec2 value) { NkStyleSelectable.nimage_padding(address(), value); return this; }
        /** Passes the {@code image_padding} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleSelectable.Buffer image_padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(image_padding()); return this; }
        /** Copies the specified {@link NkHandle} to the {@code userdata} field. */
        public NkStyleSelectable.Buffer userdata(@NativeType("nk_handle") NkHandle value) { NkStyleSelectable.nuserdata(address(), value); return this; }
        /** Passes the {@code userdata} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleSelectable.Buffer userdata(java.util.function.Consumer<NkHandle> consumer) { consumer.accept(userdata()); return this; }
        /** Sets the specified value to the {@code draw_begin} field. */
        public NkStyleSelectable.Buffer draw_begin(@Nullable @NativeType("nk_draw_begin") NkDrawBeginCallbackI value) { NkStyleSelectable.ndraw_begin(address(), value); return this; }
        /** Sets the specified value to the {@code draw_end} field. */
        public NkStyleSelectable.Buffer draw_end(@Nullable @NativeType("nk_draw_end") NkDrawEndCallbackI value) { NkStyleSelectable.ndraw_end(address(), value); return this; }

    }

}