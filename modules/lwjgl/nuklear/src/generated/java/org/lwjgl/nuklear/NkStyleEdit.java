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
 * struct nk_style_edit {
 *     {@link NkStyleItem struct nk_style_item} normal;
 *     {@link NkStyleItem struct nk_style_item} hover;
 *     {@link NkStyleItem struct nk_style_item} active;
 *     {@link NkColor struct nk_color} border_color;
 *     {@link NkStyleScrollbar struct nk_style_scrollbar} scrollbar;
 *     {@link NkColor struct nk_color} cursor_normal;
 *     {@link NkColor struct nk_color} cursor_hover;
 *     {@link NkColor struct nk_color} cursor_text_normal;
 *     {@link NkColor struct nk_color} cursor_text_hover;
 *     {@link NkColor struct nk_color} text_normal;
 *     {@link NkColor struct nk_color} text_hover;
 *     {@link NkColor struct nk_color} text_active;
 *     {@link NkColor struct nk_color} selected_normal;
 *     {@link NkColor struct nk_color} selected_hover;
 *     {@link NkColor struct nk_color} selected_text_normal;
 *     {@link NkColor struct nk_color} selected_text_hover;
 *     float border;
 *     float rounding;
 *     float cursor_size;
 *     {@link NkVec2 struct nk_vec2} scrollbar_size;
 *     {@link NkVec2 struct nk_vec2} padding;
 *     float row_padding;
 * }</code></pre>
 */
@NativeType("struct nk_style_edit")
public class NkStyleEdit extends Struct implements NativeResource {

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
        SCROLLBAR,
        CURSOR_NORMAL,
        CURSOR_HOVER,
        CURSOR_TEXT_NORMAL,
        CURSOR_TEXT_HOVER,
        TEXT_NORMAL,
        TEXT_HOVER,
        TEXT_ACTIVE,
        SELECTED_NORMAL,
        SELECTED_HOVER,
        SELECTED_TEXT_NORMAL,
        SELECTED_TEXT_HOVER,
        BORDER,
        ROUNDING,
        CURSOR_SIZE,
        SCROLLBAR_SIZE,
        PADDING,
        ROW_PADDING;

    static {
        Layout layout = __struct(
            __member(NkStyleItem.SIZEOF, NkStyleItem.ALIGNOF),
            __member(NkStyleItem.SIZEOF, NkStyleItem.ALIGNOF),
            __member(NkStyleItem.SIZEOF, NkStyleItem.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(NkStyleScrollbar.SIZEOF, NkStyleScrollbar.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
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
            __member(4),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NORMAL = layout.offsetof(0);
        HOVER = layout.offsetof(1);
        ACTIVE = layout.offsetof(2);
        BORDER_COLOR = layout.offsetof(3);
        SCROLLBAR = layout.offsetof(4);
        CURSOR_NORMAL = layout.offsetof(5);
        CURSOR_HOVER = layout.offsetof(6);
        CURSOR_TEXT_NORMAL = layout.offsetof(7);
        CURSOR_TEXT_HOVER = layout.offsetof(8);
        TEXT_NORMAL = layout.offsetof(9);
        TEXT_HOVER = layout.offsetof(10);
        TEXT_ACTIVE = layout.offsetof(11);
        SELECTED_NORMAL = layout.offsetof(12);
        SELECTED_HOVER = layout.offsetof(13);
        SELECTED_TEXT_NORMAL = layout.offsetof(14);
        SELECTED_TEXT_HOVER = layout.offsetof(15);
        BORDER = layout.offsetof(16);
        ROUNDING = layout.offsetof(17);
        CURSOR_SIZE = layout.offsetof(18);
        SCROLLBAR_SIZE = layout.offsetof(19);
        PADDING = layout.offsetof(20);
        ROW_PADDING = layout.offsetof(21);
    }

    /**
     * Creates a {@code NkStyleEdit} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkStyleEdit(ByteBuffer container) {
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
    /** Returns a {@link NkStyleScrollbar} view of the {@code scrollbar} field. */
    @NativeType("struct nk_style_scrollbar")
    public NkStyleScrollbar scrollbar() { return nscrollbar(address()); }
    /** Returns a {@link NkColor} view of the {@code cursor_normal} field. */
    @NativeType("struct nk_color")
    public NkColor cursor_normal() { return ncursor_normal(address()); }
    /** Returns a {@link NkColor} view of the {@code cursor_hover} field. */
    @NativeType("struct nk_color")
    public NkColor cursor_hover() { return ncursor_hover(address()); }
    /** Returns a {@link NkColor} view of the {@code cursor_text_normal} field. */
    @NativeType("struct nk_color")
    public NkColor cursor_text_normal() { return ncursor_text_normal(address()); }
    /** Returns a {@link NkColor} view of the {@code cursor_text_hover} field. */
    @NativeType("struct nk_color")
    public NkColor cursor_text_hover() { return ncursor_text_hover(address()); }
    /** Returns a {@link NkColor} view of the {@code text_normal} field. */
    @NativeType("struct nk_color")
    public NkColor text_normal() { return ntext_normal(address()); }
    /** Returns a {@link NkColor} view of the {@code text_hover} field. */
    @NativeType("struct nk_color")
    public NkColor text_hover() { return ntext_hover(address()); }
    /** Returns a {@link NkColor} view of the {@code text_active} field. */
    @NativeType("struct nk_color")
    public NkColor text_active() { return ntext_active(address()); }
    /** Returns a {@link NkColor} view of the {@code selected_normal} field. */
    @NativeType("struct nk_color")
    public NkColor selected_normal() { return nselected_normal(address()); }
    /** Returns a {@link NkColor} view of the {@code selected_hover} field. */
    @NativeType("struct nk_color")
    public NkColor selected_hover() { return nselected_hover(address()); }
    /** Returns a {@link NkColor} view of the {@code selected_text_normal} field. */
    @NativeType("struct nk_color")
    public NkColor selected_text_normal() { return nselected_text_normal(address()); }
    /** Returns a {@link NkColor} view of the {@code selected_text_hover} field. */
    @NativeType("struct nk_color")
    public NkColor selected_text_hover() { return nselected_text_hover(address()); }
    /** Returns the value of the {@code border} field. */
    public float border() { return nborder(address()); }
    /** Returns the value of the {@code rounding} field. */
    public float rounding() { return nrounding(address()); }
    /** Returns the value of the {@code cursor_size} field. */
    public float cursor_size() { return ncursor_size(address()); }
    /** Returns a {@link NkVec2} view of the {@code scrollbar_size} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 scrollbar_size() { return nscrollbar_size(address()); }
    /** Returns a {@link NkVec2} view of the {@code padding} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 padding() { return npadding(address()); }
    /** Returns the value of the {@code row_padding} field. */
    public float row_padding() { return nrow_padding(address()); }

    /** Copies the specified {@link NkStyleItem} to the {@code normal} field. */
    public NkStyleEdit normal(@NativeType("struct nk_style_item") NkStyleItem value) { nnormal(address(), value); return this; }
    /** Passes the {@code normal} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleEdit normal(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(normal()); return this; }
    /** Copies the specified {@link NkStyleItem} to the {@code hover} field. */
    public NkStyleEdit hover(@NativeType("struct nk_style_item") NkStyleItem value) { nhover(address(), value); return this; }
    /** Passes the {@code hover} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleEdit hover(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(hover()); return this; }
    /** Copies the specified {@link NkStyleItem} to the {@code active} field. */
    public NkStyleEdit active(@NativeType("struct nk_style_item") NkStyleItem value) { nactive(address(), value); return this; }
    /** Passes the {@code active} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleEdit active(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(active()); return this; }
    /** Copies the specified {@link NkColor} to the {@code border_color} field. */
    public NkStyleEdit border_color(@NativeType("struct nk_color") NkColor value) { nborder_color(address(), value); return this; }
    /** Passes the {@code border_color} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleEdit border_color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(border_color()); return this; }
    /** Copies the specified {@link NkStyleScrollbar} to the {@code scrollbar} field. */
    public NkStyleEdit scrollbar(@NativeType("struct nk_style_scrollbar") NkStyleScrollbar value) { nscrollbar(address(), value); return this; }
    /** Passes the {@code scrollbar} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleEdit scrollbar(java.util.function.Consumer<NkStyleScrollbar> consumer) { consumer.accept(scrollbar()); return this; }
    /** Copies the specified {@link NkColor} to the {@code cursor_normal} field. */
    public NkStyleEdit cursor_normal(@NativeType("struct nk_color") NkColor value) { ncursor_normal(address(), value); return this; }
    /** Passes the {@code cursor_normal} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleEdit cursor_normal(java.util.function.Consumer<NkColor> consumer) { consumer.accept(cursor_normal()); return this; }
    /** Copies the specified {@link NkColor} to the {@code cursor_hover} field. */
    public NkStyleEdit cursor_hover(@NativeType("struct nk_color") NkColor value) { ncursor_hover(address(), value); return this; }
    /** Passes the {@code cursor_hover} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleEdit cursor_hover(java.util.function.Consumer<NkColor> consumer) { consumer.accept(cursor_hover()); return this; }
    /** Copies the specified {@link NkColor} to the {@code cursor_text_normal} field. */
    public NkStyleEdit cursor_text_normal(@NativeType("struct nk_color") NkColor value) { ncursor_text_normal(address(), value); return this; }
    /** Passes the {@code cursor_text_normal} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleEdit cursor_text_normal(java.util.function.Consumer<NkColor> consumer) { consumer.accept(cursor_text_normal()); return this; }
    /** Copies the specified {@link NkColor} to the {@code cursor_text_hover} field. */
    public NkStyleEdit cursor_text_hover(@NativeType("struct nk_color") NkColor value) { ncursor_text_hover(address(), value); return this; }
    /** Passes the {@code cursor_text_hover} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleEdit cursor_text_hover(java.util.function.Consumer<NkColor> consumer) { consumer.accept(cursor_text_hover()); return this; }
    /** Copies the specified {@link NkColor} to the {@code text_normal} field. */
    public NkStyleEdit text_normal(@NativeType("struct nk_color") NkColor value) { ntext_normal(address(), value); return this; }
    /** Passes the {@code text_normal} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleEdit text_normal(java.util.function.Consumer<NkColor> consumer) { consumer.accept(text_normal()); return this; }
    /** Copies the specified {@link NkColor} to the {@code text_hover} field. */
    public NkStyleEdit text_hover(@NativeType("struct nk_color") NkColor value) { ntext_hover(address(), value); return this; }
    /** Passes the {@code text_hover} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleEdit text_hover(java.util.function.Consumer<NkColor> consumer) { consumer.accept(text_hover()); return this; }
    /** Copies the specified {@link NkColor} to the {@code text_active} field. */
    public NkStyleEdit text_active(@NativeType("struct nk_color") NkColor value) { ntext_active(address(), value); return this; }
    /** Passes the {@code text_active} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleEdit text_active(java.util.function.Consumer<NkColor> consumer) { consumer.accept(text_active()); return this; }
    /** Copies the specified {@link NkColor} to the {@code selected_normal} field. */
    public NkStyleEdit selected_normal(@NativeType("struct nk_color") NkColor value) { nselected_normal(address(), value); return this; }
    /** Passes the {@code selected_normal} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleEdit selected_normal(java.util.function.Consumer<NkColor> consumer) { consumer.accept(selected_normal()); return this; }
    /** Copies the specified {@link NkColor} to the {@code selected_hover} field. */
    public NkStyleEdit selected_hover(@NativeType("struct nk_color") NkColor value) { nselected_hover(address(), value); return this; }
    /** Passes the {@code selected_hover} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleEdit selected_hover(java.util.function.Consumer<NkColor> consumer) { consumer.accept(selected_hover()); return this; }
    /** Copies the specified {@link NkColor} to the {@code selected_text_normal} field. */
    public NkStyleEdit selected_text_normal(@NativeType("struct nk_color") NkColor value) { nselected_text_normal(address(), value); return this; }
    /** Passes the {@code selected_text_normal} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleEdit selected_text_normal(java.util.function.Consumer<NkColor> consumer) { consumer.accept(selected_text_normal()); return this; }
    /** Copies the specified {@link NkColor} to the {@code selected_text_hover} field. */
    public NkStyleEdit selected_text_hover(@NativeType("struct nk_color") NkColor value) { nselected_text_hover(address(), value); return this; }
    /** Passes the {@code selected_text_hover} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleEdit selected_text_hover(java.util.function.Consumer<NkColor> consumer) { consumer.accept(selected_text_hover()); return this; }
    /** Sets the specified value to the {@code border} field. */
    public NkStyleEdit border(float value) { nborder(address(), value); return this; }
    /** Sets the specified value to the {@code rounding} field. */
    public NkStyleEdit rounding(float value) { nrounding(address(), value); return this; }
    /** Sets the specified value to the {@code cursor_size} field. */
    public NkStyleEdit cursor_size(float value) { ncursor_size(address(), value); return this; }
    /** Copies the specified {@link NkVec2} to the {@code scrollbar_size} field. */
    public NkStyleEdit scrollbar_size(@NativeType("struct nk_vec2") NkVec2 value) { nscrollbar_size(address(), value); return this; }
    /** Passes the {@code scrollbar_size} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleEdit scrollbar_size(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(scrollbar_size()); return this; }
    /** Copies the specified {@link NkVec2} to the {@code padding} field. */
    public NkStyleEdit padding(@NativeType("struct nk_vec2") NkVec2 value) { npadding(address(), value); return this; }
    /** Passes the {@code padding} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleEdit padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(padding()); return this; }
    /** Sets the specified value to the {@code row_padding} field. */
    public NkStyleEdit row_padding(float value) { nrow_padding(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public NkStyleEdit set(
        NkStyleItem normal,
        NkStyleItem hover,
        NkStyleItem active,
        NkColor border_color,
        NkStyleScrollbar scrollbar,
        NkColor cursor_normal,
        NkColor cursor_hover,
        NkColor cursor_text_normal,
        NkColor cursor_text_hover,
        NkColor text_normal,
        NkColor text_hover,
        NkColor text_active,
        NkColor selected_normal,
        NkColor selected_hover,
        NkColor selected_text_normal,
        NkColor selected_text_hover,
        float border,
        float rounding,
        float cursor_size,
        NkVec2 scrollbar_size,
        NkVec2 padding,
        float row_padding
    ) {
        normal(normal);
        hover(hover);
        active(active);
        border_color(border_color);
        scrollbar(scrollbar);
        cursor_normal(cursor_normal);
        cursor_hover(cursor_hover);
        cursor_text_normal(cursor_text_normal);
        cursor_text_hover(cursor_text_hover);
        text_normal(text_normal);
        text_hover(text_hover);
        text_active(text_active);
        selected_normal(selected_normal);
        selected_hover(selected_hover);
        selected_text_normal(selected_text_normal);
        selected_text_hover(selected_text_hover);
        border(border);
        rounding(rounding);
        cursor_size(cursor_size);
        scrollbar_size(scrollbar_size);
        padding(padding);
        row_padding(row_padding);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public NkStyleEdit set(NkStyleEdit src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code NkStyleEdit} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkStyleEdit malloc() {
        return wrap(NkStyleEdit.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code NkStyleEdit} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkStyleEdit calloc() {
        return wrap(NkStyleEdit.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code NkStyleEdit} instance allocated with {@link BufferUtils}. */
    public static NkStyleEdit create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(NkStyleEdit.class, memAddress(container), container);
    }

    /** Returns a new {@code NkStyleEdit} instance for the specified memory address. */
    public static NkStyleEdit create(long address) {
        return wrap(NkStyleEdit.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkStyleEdit createSafe(long address) {
        return address == NULL ? null : wrap(NkStyleEdit.class, address);
    }

    /**
     * Returns a new {@link NkStyleEdit.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleEdit.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NkStyleEdit.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleEdit.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkStyleEdit.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleEdit.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link NkStyleEdit.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkStyleEdit.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkStyleEdit.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code NkStyleEdit} instance allocated on the thread-local {@link MemoryStack}. */
    public static NkStyleEdit mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code NkStyleEdit} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static NkStyleEdit callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code NkStyleEdit} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkStyleEdit mallocStack(MemoryStack stack) {
        return wrap(NkStyleEdit.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code NkStyleEdit} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkStyleEdit callocStack(MemoryStack stack) {
        return wrap(NkStyleEdit.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link NkStyleEdit.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleEdit.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkStyleEdit.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleEdit.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkStyleEdit.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkStyleEdit.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkStyleEdit.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkStyleEdit.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #normal}. */
    public static NkStyleItem nnormal(long struct) { return NkStyleItem.create(struct + NkStyleEdit.NORMAL); }
    /** Unsafe version of {@link #hover}. */
    public static NkStyleItem nhover(long struct) { return NkStyleItem.create(struct + NkStyleEdit.HOVER); }
    /** Unsafe version of {@link #active}. */
    public static NkStyleItem nactive(long struct) { return NkStyleItem.create(struct + NkStyleEdit.ACTIVE); }
    /** Unsafe version of {@link #border_color}. */
    public static NkColor nborder_color(long struct) { return NkColor.create(struct + NkStyleEdit.BORDER_COLOR); }
    /** Unsafe version of {@link #scrollbar}. */
    public static NkStyleScrollbar nscrollbar(long struct) { return NkStyleScrollbar.create(struct + NkStyleEdit.SCROLLBAR); }
    /** Unsafe version of {@link #cursor_normal}. */
    public static NkColor ncursor_normal(long struct) { return NkColor.create(struct + NkStyleEdit.CURSOR_NORMAL); }
    /** Unsafe version of {@link #cursor_hover}. */
    public static NkColor ncursor_hover(long struct) { return NkColor.create(struct + NkStyleEdit.CURSOR_HOVER); }
    /** Unsafe version of {@link #cursor_text_normal}. */
    public static NkColor ncursor_text_normal(long struct) { return NkColor.create(struct + NkStyleEdit.CURSOR_TEXT_NORMAL); }
    /** Unsafe version of {@link #cursor_text_hover}. */
    public static NkColor ncursor_text_hover(long struct) { return NkColor.create(struct + NkStyleEdit.CURSOR_TEXT_HOVER); }
    /** Unsafe version of {@link #text_normal}. */
    public static NkColor ntext_normal(long struct) { return NkColor.create(struct + NkStyleEdit.TEXT_NORMAL); }
    /** Unsafe version of {@link #text_hover}. */
    public static NkColor ntext_hover(long struct) { return NkColor.create(struct + NkStyleEdit.TEXT_HOVER); }
    /** Unsafe version of {@link #text_active}. */
    public static NkColor ntext_active(long struct) { return NkColor.create(struct + NkStyleEdit.TEXT_ACTIVE); }
    /** Unsafe version of {@link #selected_normal}. */
    public static NkColor nselected_normal(long struct) { return NkColor.create(struct + NkStyleEdit.SELECTED_NORMAL); }
    /** Unsafe version of {@link #selected_hover}. */
    public static NkColor nselected_hover(long struct) { return NkColor.create(struct + NkStyleEdit.SELECTED_HOVER); }
    /** Unsafe version of {@link #selected_text_normal}. */
    public static NkColor nselected_text_normal(long struct) { return NkColor.create(struct + NkStyleEdit.SELECTED_TEXT_NORMAL); }
    /** Unsafe version of {@link #selected_text_hover}. */
    public static NkColor nselected_text_hover(long struct) { return NkColor.create(struct + NkStyleEdit.SELECTED_TEXT_HOVER); }
    /** Unsafe version of {@link #border}. */
    public static float nborder(long struct) { return UNSAFE.getFloat(null, struct + NkStyleEdit.BORDER); }
    /** Unsafe version of {@link #rounding}. */
    public static float nrounding(long struct) { return UNSAFE.getFloat(null, struct + NkStyleEdit.ROUNDING); }
    /** Unsafe version of {@link #cursor_size}. */
    public static float ncursor_size(long struct) { return UNSAFE.getFloat(null, struct + NkStyleEdit.CURSOR_SIZE); }
    /** Unsafe version of {@link #scrollbar_size}. */
    public static NkVec2 nscrollbar_size(long struct) { return NkVec2.create(struct + NkStyleEdit.SCROLLBAR_SIZE); }
    /** Unsafe version of {@link #padding}. */
    public static NkVec2 npadding(long struct) { return NkVec2.create(struct + NkStyleEdit.PADDING); }
    /** Unsafe version of {@link #row_padding}. */
    public static float nrow_padding(long struct) { return UNSAFE.getFloat(null, struct + NkStyleEdit.ROW_PADDING); }

    /** Unsafe version of {@link #normal(NkStyleItem) normal}. */
    public static void nnormal(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleEdit.NORMAL, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #hover(NkStyleItem) hover}. */
    public static void nhover(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleEdit.HOVER, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #active(NkStyleItem) active}. */
    public static void nactive(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleEdit.ACTIVE, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #border_color(NkColor) border_color}. */
    public static void nborder_color(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleEdit.BORDER_COLOR, NkColor.SIZEOF); }
    /** Unsafe version of {@link #scrollbar(NkStyleScrollbar) scrollbar}. */
    public static void nscrollbar(long struct, NkStyleScrollbar value) { memCopy(value.address(), struct + NkStyleEdit.SCROLLBAR, NkStyleScrollbar.SIZEOF); }
    /** Unsafe version of {@link #cursor_normal(NkColor) cursor_normal}. */
    public static void ncursor_normal(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleEdit.CURSOR_NORMAL, NkColor.SIZEOF); }
    /** Unsafe version of {@link #cursor_hover(NkColor) cursor_hover}. */
    public static void ncursor_hover(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleEdit.CURSOR_HOVER, NkColor.SIZEOF); }
    /** Unsafe version of {@link #cursor_text_normal(NkColor) cursor_text_normal}. */
    public static void ncursor_text_normal(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleEdit.CURSOR_TEXT_NORMAL, NkColor.SIZEOF); }
    /** Unsafe version of {@link #cursor_text_hover(NkColor) cursor_text_hover}. */
    public static void ncursor_text_hover(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleEdit.CURSOR_TEXT_HOVER, NkColor.SIZEOF); }
    /** Unsafe version of {@link #text_normal(NkColor) text_normal}. */
    public static void ntext_normal(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleEdit.TEXT_NORMAL, NkColor.SIZEOF); }
    /** Unsafe version of {@link #text_hover(NkColor) text_hover}. */
    public static void ntext_hover(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleEdit.TEXT_HOVER, NkColor.SIZEOF); }
    /** Unsafe version of {@link #text_active(NkColor) text_active}. */
    public static void ntext_active(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleEdit.TEXT_ACTIVE, NkColor.SIZEOF); }
    /** Unsafe version of {@link #selected_normal(NkColor) selected_normal}. */
    public static void nselected_normal(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleEdit.SELECTED_NORMAL, NkColor.SIZEOF); }
    /** Unsafe version of {@link #selected_hover(NkColor) selected_hover}. */
    public static void nselected_hover(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleEdit.SELECTED_HOVER, NkColor.SIZEOF); }
    /** Unsafe version of {@link #selected_text_normal(NkColor) selected_text_normal}. */
    public static void nselected_text_normal(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleEdit.SELECTED_TEXT_NORMAL, NkColor.SIZEOF); }
    /** Unsafe version of {@link #selected_text_hover(NkColor) selected_text_hover}. */
    public static void nselected_text_hover(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleEdit.SELECTED_TEXT_HOVER, NkColor.SIZEOF); }
    /** Unsafe version of {@link #border(float) border}. */
    public static void nborder(long struct, float value) { UNSAFE.putFloat(null, struct + NkStyleEdit.BORDER, value); }
    /** Unsafe version of {@link #rounding(float) rounding}. */
    public static void nrounding(long struct, float value) { UNSAFE.putFloat(null, struct + NkStyleEdit.ROUNDING, value); }
    /** Unsafe version of {@link #cursor_size(float) cursor_size}. */
    public static void ncursor_size(long struct, float value) { UNSAFE.putFloat(null, struct + NkStyleEdit.CURSOR_SIZE, value); }
    /** Unsafe version of {@link #scrollbar_size(NkVec2) scrollbar_size}. */
    public static void nscrollbar_size(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleEdit.SCROLLBAR_SIZE, NkVec2.SIZEOF); }
    /** Unsafe version of {@link #padding(NkVec2) padding}. */
    public static void npadding(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleEdit.PADDING, NkVec2.SIZEOF); }
    /** Unsafe version of {@link #row_padding(float) row_padding}. */
    public static void nrow_padding(long struct, float value) { UNSAFE.putFloat(null, struct + NkStyleEdit.ROW_PADDING, value); }

    // -----------------------------------

    /** An array of {@link NkStyleEdit} structs. */
    public static class Buffer extends StructBuffer<NkStyleEdit, Buffer> implements NativeResource {

        private static final NkStyleEdit ELEMENT_FACTORY = NkStyleEdit.create(-1L);

        /**
         * Creates a new {@code NkStyleEdit.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkStyleEdit#SIZEOF}, and its mark will be undefined.
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
        protected NkStyleEdit getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link NkStyleItem} view of the {@code normal} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem normal() { return NkStyleEdit.nnormal(address()); }
        /** Returns a {@link NkStyleItem} view of the {@code hover} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem hover() { return NkStyleEdit.nhover(address()); }
        /** Returns a {@link NkStyleItem} view of the {@code active} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem active() { return NkStyleEdit.nactive(address()); }
        /** Returns a {@link NkColor} view of the {@code border_color} field. */
        @NativeType("struct nk_color")
        public NkColor border_color() { return NkStyleEdit.nborder_color(address()); }
        /** Returns a {@link NkStyleScrollbar} view of the {@code scrollbar} field. */
        @NativeType("struct nk_style_scrollbar")
        public NkStyleScrollbar scrollbar() { return NkStyleEdit.nscrollbar(address()); }
        /** Returns a {@link NkColor} view of the {@code cursor_normal} field. */
        @NativeType("struct nk_color")
        public NkColor cursor_normal() { return NkStyleEdit.ncursor_normal(address()); }
        /** Returns a {@link NkColor} view of the {@code cursor_hover} field. */
        @NativeType("struct nk_color")
        public NkColor cursor_hover() { return NkStyleEdit.ncursor_hover(address()); }
        /** Returns a {@link NkColor} view of the {@code cursor_text_normal} field. */
        @NativeType("struct nk_color")
        public NkColor cursor_text_normal() { return NkStyleEdit.ncursor_text_normal(address()); }
        /** Returns a {@link NkColor} view of the {@code cursor_text_hover} field. */
        @NativeType("struct nk_color")
        public NkColor cursor_text_hover() { return NkStyleEdit.ncursor_text_hover(address()); }
        /** Returns a {@link NkColor} view of the {@code text_normal} field. */
        @NativeType("struct nk_color")
        public NkColor text_normal() { return NkStyleEdit.ntext_normal(address()); }
        /** Returns a {@link NkColor} view of the {@code text_hover} field. */
        @NativeType("struct nk_color")
        public NkColor text_hover() { return NkStyleEdit.ntext_hover(address()); }
        /** Returns a {@link NkColor} view of the {@code text_active} field. */
        @NativeType("struct nk_color")
        public NkColor text_active() { return NkStyleEdit.ntext_active(address()); }
        /** Returns a {@link NkColor} view of the {@code selected_normal} field. */
        @NativeType("struct nk_color")
        public NkColor selected_normal() { return NkStyleEdit.nselected_normal(address()); }
        /** Returns a {@link NkColor} view of the {@code selected_hover} field. */
        @NativeType("struct nk_color")
        public NkColor selected_hover() { return NkStyleEdit.nselected_hover(address()); }
        /** Returns a {@link NkColor} view of the {@code selected_text_normal} field. */
        @NativeType("struct nk_color")
        public NkColor selected_text_normal() { return NkStyleEdit.nselected_text_normal(address()); }
        /** Returns a {@link NkColor} view of the {@code selected_text_hover} field. */
        @NativeType("struct nk_color")
        public NkColor selected_text_hover() { return NkStyleEdit.nselected_text_hover(address()); }
        /** Returns the value of the {@code border} field. */
        public float border() { return NkStyleEdit.nborder(address()); }
        /** Returns the value of the {@code rounding} field. */
        public float rounding() { return NkStyleEdit.nrounding(address()); }
        /** Returns the value of the {@code cursor_size} field. */
        public float cursor_size() { return NkStyleEdit.ncursor_size(address()); }
        /** Returns a {@link NkVec2} view of the {@code scrollbar_size} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 scrollbar_size() { return NkStyleEdit.nscrollbar_size(address()); }
        /** Returns a {@link NkVec2} view of the {@code padding} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 padding() { return NkStyleEdit.npadding(address()); }
        /** Returns the value of the {@code row_padding} field. */
        public float row_padding() { return NkStyleEdit.nrow_padding(address()); }

        /** Copies the specified {@link NkStyleItem} to the {@code normal} field. */
        public NkStyleEdit.Buffer normal(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleEdit.nnormal(address(), value); return this; }
        /** Passes the {@code normal} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleEdit.Buffer normal(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(normal()); return this; }
        /** Copies the specified {@link NkStyleItem} to the {@code hover} field. */
        public NkStyleEdit.Buffer hover(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleEdit.nhover(address(), value); return this; }
        /** Passes the {@code hover} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleEdit.Buffer hover(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(hover()); return this; }
        /** Copies the specified {@link NkStyleItem} to the {@code active} field. */
        public NkStyleEdit.Buffer active(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleEdit.nactive(address(), value); return this; }
        /** Passes the {@code active} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleEdit.Buffer active(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(active()); return this; }
        /** Copies the specified {@link NkColor} to the {@code border_color} field. */
        public NkStyleEdit.Buffer border_color(@NativeType("struct nk_color") NkColor value) { NkStyleEdit.nborder_color(address(), value); return this; }
        /** Passes the {@code border_color} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleEdit.Buffer border_color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(border_color()); return this; }
        /** Copies the specified {@link NkStyleScrollbar} to the {@code scrollbar} field. */
        public NkStyleEdit.Buffer scrollbar(@NativeType("struct nk_style_scrollbar") NkStyleScrollbar value) { NkStyleEdit.nscrollbar(address(), value); return this; }
        /** Passes the {@code scrollbar} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleEdit.Buffer scrollbar(java.util.function.Consumer<NkStyleScrollbar> consumer) { consumer.accept(scrollbar()); return this; }
        /** Copies the specified {@link NkColor} to the {@code cursor_normal} field. */
        public NkStyleEdit.Buffer cursor_normal(@NativeType("struct nk_color") NkColor value) { NkStyleEdit.ncursor_normal(address(), value); return this; }
        /** Passes the {@code cursor_normal} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleEdit.Buffer cursor_normal(java.util.function.Consumer<NkColor> consumer) { consumer.accept(cursor_normal()); return this; }
        /** Copies the specified {@link NkColor} to the {@code cursor_hover} field. */
        public NkStyleEdit.Buffer cursor_hover(@NativeType("struct nk_color") NkColor value) { NkStyleEdit.ncursor_hover(address(), value); return this; }
        /** Passes the {@code cursor_hover} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleEdit.Buffer cursor_hover(java.util.function.Consumer<NkColor> consumer) { consumer.accept(cursor_hover()); return this; }
        /** Copies the specified {@link NkColor} to the {@code cursor_text_normal} field. */
        public NkStyleEdit.Buffer cursor_text_normal(@NativeType("struct nk_color") NkColor value) { NkStyleEdit.ncursor_text_normal(address(), value); return this; }
        /** Passes the {@code cursor_text_normal} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleEdit.Buffer cursor_text_normal(java.util.function.Consumer<NkColor> consumer) { consumer.accept(cursor_text_normal()); return this; }
        /** Copies the specified {@link NkColor} to the {@code cursor_text_hover} field. */
        public NkStyleEdit.Buffer cursor_text_hover(@NativeType("struct nk_color") NkColor value) { NkStyleEdit.ncursor_text_hover(address(), value); return this; }
        /** Passes the {@code cursor_text_hover} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleEdit.Buffer cursor_text_hover(java.util.function.Consumer<NkColor> consumer) { consumer.accept(cursor_text_hover()); return this; }
        /** Copies the specified {@link NkColor} to the {@code text_normal} field. */
        public NkStyleEdit.Buffer text_normal(@NativeType("struct nk_color") NkColor value) { NkStyleEdit.ntext_normal(address(), value); return this; }
        /** Passes the {@code text_normal} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleEdit.Buffer text_normal(java.util.function.Consumer<NkColor> consumer) { consumer.accept(text_normal()); return this; }
        /** Copies the specified {@link NkColor} to the {@code text_hover} field. */
        public NkStyleEdit.Buffer text_hover(@NativeType("struct nk_color") NkColor value) { NkStyleEdit.ntext_hover(address(), value); return this; }
        /** Passes the {@code text_hover} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleEdit.Buffer text_hover(java.util.function.Consumer<NkColor> consumer) { consumer.accept(text_hover()); return this; }
        /** Copies the specified {@link NkColor} to the {@code text_active} field. */
        public NkStyleEdit.Buffer text_active(@NativeType("struct nk_color") NkColor value) { NkStyleEdit.ntext_active(address(), value); return this; }
        /** Passes the {@code text_active} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleEdit.Buffer text_active(java.util.function.Consumer<NkColor> consumer) { consumer.accept(text_active()); return this; }
        /** Copies the specified {@link NkColor} to the {@code selected_normal} field. */
        public NkStyleEdit.Buffer selected_normal(@NativeType("struct nk_color") NkColor value) { NkStyleEdit.nselected_normal(address(), value); return this; }
        /** Passes the {@code selected_normal} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleEdit.Buffer selected_normal(java.util.function.Consumer<NkColor> consumer) { consumer.accept(selected_normal()); return this; }
        /** Copies the specified {@link NkColor} to the {@code selected_hover} field. */
        public NkStyleEdit.Buffer selected_hover(@NativeType("struct nk_color") NkColor value) { NkStyleEdit.nselected_hover(address(), value); return this; }
        /** Passes the {@code selected_hover} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleEdit.Buffer selected_hover(java.util.function.Consumer<NkColor> consumer) { consumer.accept(selected_hover()); return this; }
        /** Copies the specified {@link NkColor} to the {@code selected_text_normal} field. */
        public NkStyleEdit.Buffer selected_text_normal(@NativeType("struct nk_color") NkColor value) { NkStyleEdit.nselected_text_normal(address(), value); return this; }
        /** Passes the {@code selected_text_normal} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleEdit.Buffer selected_text_normal(java.util.function.Consumer<NkColor> consumer) { consumer.accept(selected_text_normal()); return this; }
        /** Copies the specified {@link NkColor} to the {@code selected_text_hover} field. */
        public NkStyleEdit.Buffer selected_text_hover(@NativeType("struct nk_color") NkColor value) { NkStyleEdit.nselected_text_hover(address(), value); return this; }
        /** Passes the {@code selected_text_hover} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleEdit.Buffer selected_text_hover(java.util.function.Consumer<NkColor> consumer) { consumer.accept(selected_text_hover()); return this; }
        /** Sets the specified value to the {@code border} field. */
        public NkStyleEdit.Buffer border(float value) { NkStyleEdit.nborder(address(), value); return this; }
        /** Sets the specified value to the {@code rounding} field. */
        public NkStyleEdit.Buffer rounding(float value) { NkStyleEdit.nrounding(address(), value); return this; }
        /** Sets the specified value to the {@code cursor_size} field. */
        public NkStyleEdit.Buffer cursor_size(float value) { NkStyleEdit.ncursor_size(address(), value); return this; }
        /** Copies the specified {@link NkVec2} to the {@code scrollbar_size} field. */
        public NkStyleEdit.Buffer scrollbar_size(@NativeType("struct nk_vec2") NkVec2 value) { NkStyleEdit.nscrollbar_size(address(), value); return this; }
        /** Passes the {@code scrollbar_size} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleEdit.Buffer scrollbar_size(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(scrollbar_size()); return this; }
        /** Copies the specified {@link NkVec2} to the {@code padding} field. */
        public NkStyleEdit.Buffer padding(@NativeType("struct nk_vec2") NkVec2 value) { NkStyleEdit.npadding(address(), value); return this; }
        /** Passes the {@code padding} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleEdit.Buffer padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(padding()); return this; }
        /** Sets the specified value to the {@code row_padding} field. */
        public NkStyleEdit.Buffer row_padding(float value) { NkStyleEdit.nrow_padding(address(), value); return this; }

    }

}