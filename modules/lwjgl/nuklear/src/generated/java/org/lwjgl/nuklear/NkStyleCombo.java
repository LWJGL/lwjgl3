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
 * struct nk_style_combo {
 *     {@link NkStyleItem struct nk_style_item} normal;
 *     {@link NkStyleItem struct nk_style_item} hover;
 *     {@link NkStyleItem struct nk_style_item} active;
 *     {@link NkColor struct nk_color} border_color;
 *     {@link NkColor struct nk_color} label_normal;
 *     {@link NkColor struct nk_color} label_hover;
 *     {@link NkColor struct nk_color} label_active;
 *     {@link NkColor struct nk_color} symbol_normal;
 *     {@link NkColor struct nk_color} symbol_hover;
 *     {@link NkColor struct nk_color} symbol_active;
 *     {@link NkStyleButton struct nk_style_button} button;
 *     enum nk_symbol_type sym_normal;
 *     enum nk_symbol_type sym_hover;
 *     enum nk_symbol_type sym_active;
 *     float border;
 *     float rounding;
 *     {@link NkVec2 struct nk_vec2} content_padding;
 *     {@link NkVec2 struct nk_vec2} button_padding;
 *     {@link NkVec2 struct nk_vec2} spacing;
 * }</code></pre>
 */
@NativeType("struct nk_style_combo")
public class NkStyleCombo extends Struct implements NativeResource {

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
        SYMBOL_NORMAL,
        SYMBOL_HOVER,
        SYMBOL_ACTIVE,
        BUTTON,
        SYM_NORMAL,
        SYM_HOVER,
        SYM_ACTIVE,
        BORDER,
        ROUNDING,
        CONTENT_PADDING,
        BUTTON_PADDING,
        SPACING;

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
            __member(NkStyleButton.SIZEOF, NkStyleButton.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF)
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
        SYMBOL_NORMAL = layout.offsetof(7);
        SYMBOL_HOVER = layout.offsetof(8);
        SYMBOL_ACTIVE = layout.offsetof(9);
        BUTTON = layout.offsetof(10);
        SYM_NORMAL = layout.offsetof(11);
        SYM_HOVER = layout.offsetof(12);
        SYM_ACTIVE = layout.offsetof(13);
        BORDER = layout.offsetof(14);
        ROUNDING = layout.offsetof(15);
        CONTENT_PADDING = layout.offsetof(16);
        BUTTON_PADDING = layout.offsetof(17);
        SPACING = layout.offsetof(18);
    }

    /**
     * Creates a {@code NkStyleCombo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkStyleCombo(ByteBuffer container) {
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
    /** Returns a {@link NkColor} view of the {@code label_normal} field. */
    @NativeType("struct nk_color")
    public NkColor label_normal() { return nlabel_normal(address()); }
    /** Returns a {@link NkColor} view of the {@code label_hover} field. */
    @NativeType("struct nk_color")
    public NkColor label_hover() { return nlabel_hover(address()); }
    /** Returns a {@link NkColor} view of the {@code label_active} field. */
    @NativeType("struct nk_color")
    public NkColor label_active() { return nlabel_active(address()); }
    /** Returns a {@link NkColor} view of the {@code symbol_normal} field. */
    @NativeType("struct nk_color")
    public NkColor symbol_normal() { return nsymbol_normal(address()); }
    /** Returns a {@link NkColor} view of the {@code symbol_hover} field. */
    @NativeType("struct nk_color")
    public NkColor symbol_hover() { return nsymbol_hover(address()); }
    /** Returns a {@link NkColor} view of the {@code symbol_active} field. */
    @NativeType("struct nk_color")
    public NkColor symbol_active() { return nsymbol_active(address()); }
    /** Returns a {@link NkStyleButton} view of the {@code button} field. */
    @NativeType("struct nk_style_button")
    public NkStyleButton button() { return nbutton(address()); }
    /** Returns the value of the {@code sym_normal} field. */
    @NativeType("enum nk_symbol_type")
    public int sym_normal() { return nsym_normal(address()); }
    /** Returns the value of the {@code sym_hover} field. */
    @NativeType("enum nk_symbol_type")
    public int sym_hover() { return nsym_hover(address()); }
    /** Returns the value of the {@code sym_active} field. */
    @NativeType("enum nk_symbol_type")
    public int sym_active() { return nsym_active(address()); }
    /** Returns the value of the {@code border} field. */
    public float border() { return nborder(address()); }
    /** Returns the value of the {@code rounding} field. */
    public float rounding() { return nrounding(address()); }
    /** Returns a {@link NkVec2} view of the {@code content_padding} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 content_padding() { return ncontent_padding(address()); }
    /** Returns a {@link NkVec2} view of the {@code button_padding} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 button_padding() { return nbutton_padding(address()); }
    /** Returns a {@link NkVec2} view of the {@code spacing} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 spacing() { return nspacing(address()); }

    /** Copies the specified {@link NkStyleItem} to the {@code normal} field. */
    public NkStyleCombo normal(@NativeType("struct nk_style_item") NkStyleItem value) { nnormal(address(), value); return this; }
    /** Passes the {@code normal} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleCombo normal(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(normal()); return this; }
    /** Copies the specified {@link NkStyleItem} to the {@code hover} field. */
    public NkStyleCombo hover(@NativeType("struct nk_style_item") NkStyleItem value) { nhover(address(), value); return this; }
    /** Passes the {@code hover} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleCombo hover(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(hover()); return this; }
    /** Copies the specified {@link NkStyleItem} to the {@code active} field. */
    public NkStyleCombo active(@NativeType("struct nk_style_item") NkStyleItem value) { nactive(address(), value); return this; }
    /** Passes the {@code active} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleCombo active(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(active()); return this; }
    /** Copies the specified {@link NkColor} to the {@code border_color} field. */
    public NkStyleCombo border_color(@NativeType("struct nk_color") NkColor value) { nborder_color(address(), value); return this; }
    /** Passes the {@code border_color} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleCombo border_color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(border_color()); return this; }
    /** Copies the specified {@link NkColor} to the {@code label_normal} field. */
    public NkStyleCombo label_normal(@NativeType("struct nk_color") NkColor value) { nlabel_normal(address(), value); return this; }
    /** Passes the {@code label_normal} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleCombo label_normal(java.util.function.Consumer<NkColor> consumer) { consumer.accept(label_normal()); return this; }
    /** Copies the specified {@link NkColor} to the {@code label_hover} field. */
    public NkStyleCombo label_hover(@NativeType("struct nk_color") NkColor value) { nlabel_hover(address(), value); return this; }
    /** Passes the {@code label_hover} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleCombo label_hover(java.util.function.Consumer<NkColor> consumer) { consumer.accept(label_hover()); return this; }
    /** Copies the specified {@link NkColor} to the {@code label_active} field. */
    public NkStyleCombo label_active(@NativeType("struct nk_color") NkColor value) { nlabel_active(address(), value); return this; }
    /** Passes the {@code label_active} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleCombo label_active(java.util.function.Consumer<NkColor> consumer) { consumer.accept(label_active()); return this; }
    /** Copies the specified {@link NkColor} to the {@code symbol_normal} field. */
    public NkStyleCombo symbol_normal(@NativeType("struct nk_color") NkColor value) { nsymbol_normal(address(), value); return this; }
    /** Passes the {@code symbol_normal} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleCombo symbol_normal(java.util.function.Consumer<NkColor> consumer) { consumer.accept(symbol_normal()); return this; }
    /** Copies the specified {@link NkColor} to the {@code symbol_hover} field. */
    public NkStyleCombo symbol_hover(@NativeType("struct nk_color") NkColor value) { nsymbol_hover(address(), value); return this; }
    /** Passes the {@code symbol_hover} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleCombo symbol_hover(java.util.function.Consumer<NkColor> consumer) { consumer.accept(symbol_hover()); return this; }
    /** Copies the specified {@link NkColor} to the {@code symbol_active} field. */
    public NkStyleCombo symbol_active(@NativeType("struct nk_color") NkColor value) { nsymbol_active(address(), value); return this; }
    /** Passes the {@code symbol_active} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleCombo symbol_active(java.util.function.Consumer<NkColor> consumer) { consumer.accept(symbol_active()); return this; }
    /** Copies the specified {@link NkStyleButton} to the {@code button} field. */
    public NkStyleCombo button(@NativeType("struct nk_style_button") NkStyleButton value) { nbutton(address(), value); return this; }
    /** Passes the {@code button} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleCombo button(java.util.function.Consumer<NkStyleButton> consumer) { consumer.accept(button()); return this; }
    /** Sets the specified value to the {@code sym_normal} field. */
    public NkStyleCombo sym_normal(@NativeType("enum nk_symbol_type") int value) { nsym_normal(address(), value); return this; }
    /** Sets the specified value to the {@code sym_hover} field. */
    public NkStyleCombo sym_hover(@NativeType("enum nk_symbol_type") int value) { nsym_hover(address(), value); return this; }
    /** Sets the specified value to the {@code sym_active} field. */
    public NkStyleCombo sym_active(@NativeType("enum nk_symbol_type") int value) { nsym_active(address(), value); return this; }
    /** Sets the specified value to the {@code border} field. */
    public NkStyleCombo border(float value) { nborder(address(), value); return this; }
    /** Sets the specified value to the {@code rounding} field. */
    public NkStyleCombo rounding(float value) { nrounding(address(), value); return this; }
    /** Copies the specified {@link NkVec2} to the {@code content_padding} field. */
    public NkStyleCombo content_padding(@NativeType("struct nk_vec2") NkVec2 value) { ncontent_padding(address(), value); return this; }
    /** Passes the {@code content_padding} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleCombo content_padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(content_padding()); return this; }
    /** Copies the specified {@link NkVec2} to the {@code button_padding} field. */
    public NkStyleCombo button_padding(@NativeType("struct nk_vec2") NkVec2 value) { nbutton_padding(address(), value); return this; }
    /** Passes the {@code button_padding} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleCombo button_padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(button_padding()); return this; }
    /** Copies the specified {@link NkVec2} to the {@code spacing} field. */
    public NkStyleCombo spacing(@NativeType("struct nk_vec2") NkVec2 value) { nspacing(address(), value); return this; }
    /** Passes the {@code spacing} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleCombo spacing(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(spacing()); return this; }

    /** Initializes this struct with the specified values. */
    public NkStyleCombo set(
        NkStyleItem normal,
        NkStyleItem hover,
        NkStyleItem active,
        NkColor border_color,
        NkColor label_normal,
        NkColor label_hover,
        NkColor label_active,
        NkColor symbol_normal,
        NkColor symbol_hover,
        NkColor symbol_active,
        NkStyleButton button,
        int sym_normal,
        int sym_hover,
        int sym_active,
        float border,
        float rounding,
        NkVec2 content_padding,
        NkVec2 button_padding,
        NkVec2 spacing
    ) {
        normal(normal);
        hover(hover);
        active(active);
        border_color(border_color);
        label_normal(label_normal);
        label_hover(label_hover);
        label_active(label_active);
        symbol_normal(symbol_normal);
        symbol_hover(symbol_hover);
        symbol_active(symbol_active);
        button(button);
        sym_normal(sym_normal);
        sym_hover(sym_hover);
        sym_active(sym_active);
        border(border);
        rounding(rounding);
        content_padding(content_padding);
        button_padding(button_padding);
        spacing(spacing);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public NkStyleCombo set(NkStyleCombo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code NkStyleCombo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkStyleCombo malloc() {
        return wrap(NkStyleCombo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code NkStyleCombo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkStyleCombo calloc() {
        return wrap(NkStyleCombo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code NkStyleCombo} instance allocated with {@link BufferUtils}. */
    public static NkStyleCombo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(NkStyleCombo.class, memAddress(container), container);
    }

    /** Returns a new {@code NkStyleCombo} instance for the specified memory address. */
    public static NkStyleCombo create(long address) {
        return wrap(NkStyleCombo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkStyleCombo createSafe(long address) {
        return address == NULL ? null : wrap(NkStyleCombo.class, address);
    }

    /**
     * Returns a new {@link NkStyleCombo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleCombo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NkStyleCombo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleCombo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkStyleCombo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleCombo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link NkStyleCombo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkStyleCombo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkStyleCombo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code NkStyleCombo} instance allocated on the thread-local {@link MemoryStack}. */
    public static NkStyleCombo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code NkStyleCombo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static NkStyleCombo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code NkStyleCombo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkStyleCombo mallocStack(MemoryStack stack) {
        return wrap(NkStyleCombo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code NkStyleCombo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkStyleCombo callocStack(MemoryStack stack) {
        return wrap(NkStyleCombo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link NkStyleCombo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleCombo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkStyleCombo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleCombo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkStyleCombo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkStyleCombo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkStyleCombo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkStyleCombo.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #normal}. */
    public static NkStyleItem nnormal(long struct) { return NkStyleItem.create(struct + NkStyleCombo.NORMAL); }
    /** Unsafe version of {@link #hover}. */
    public static NkStyleItem nhover(long struct) { return NkStyleItem.create(struct + NkStyleCombo.HOVER); }
    /** Unsafe version of {@link #active}. */
    public static NkStyleItem nactive(long struct) { return NkStyleItem.create(struct + NkStyleCombo.ACTIVE); }
    /** Unsafe version of {@link #border_color}. */
    public static NkColor nborder_color(long struct) { return NkColor.create(struct + NkStyleCombo.BORDER_COLOR); }
    /** Unsafe version of {@link #label_normal}. */
    public static NkColor nlabel_normal(long struct) { return NkColor.create(struct + NkStyleCombo.LABEL_NORMAL); }
    /** Unsafe version of {@link #label_hover}. */
    public static NkColor nlabel_hover(long struct) { return NkColor.create(struct + NkStyleCombo.LABEL_HOVER); }
    /** Unsafe version of {@link #label_active}. */
    public static NkColor nlabel_active(long struct) { return NkColor.create(struct + NkStyleCombo.LABEL_ACTIVE); }
    /** Unsafe version of {@link #symbol_normal}. */
    public static NkColor nsymbol_normal(long struct) { return NkColor.create(struct + NkStyleCombo.SYMBOL_NORMAL); }
    /** Unsafe version of {@link #symbol_hover}. */
    public static NkColor nsymbol_hover(long struct) { return NkColor.create(struct + NkStyleCombo.SYMBOL_HOVER); }
    /** Unsafe version of {@link #symbol_active}. */
    public static NkColor nsymbol_active(long struct) { return NkColor.create(struct + NkStyleCombo.SYMBOL_ACTIVE); }
    /** Unsafe version of {@link #button}. */
    public static NkStyleButton nbutton(long struct) { return NkStyleButton.create(struct + NkStyleCombo.BUTTON); }
    /** Unsafe version of {@link #sym_normal}. */
    public static int nsym_normal(long struct) { return UNSAFE.getInt(null, struct + NkStyleCombo.SYM_NORMAL); }
    /** Unsafe version of {@link #sym_hover}. */
    public static int nsym_hover(long struct) { return UNSAFE.getInt(null, struct + NkStyleCombo.SYM_HOVER); }
    /** Unsafe version of {@link #sym_active}. */
    public static int nsym_active(long struct) { return UNSAFE.getInt(null, struct + NkStyleCombo.SYM_ACTIVE); }
    /** Unsafe version of {@link #border}. */
    public static float nborder(long struct) { return UNSAFE.getFloat(null, struct + NkStyleCombo.BORDER); }
    /** Unsafe version of {@link #rounding}. */
    public static float nrounding(long struct) { return UNSAFE.getFloat(null, struct + NkStyleCombo.ROUNDING); }
    /** Unsafe version of {@link #content_padding}. */
    public static NkVec2 ncontent_padding(long struct) { return NkVec2.create(struct + NkStyleCombo.CONTENT_PADDING); }
    /** Unsafe version of {@link #button_padding}. */
    public static NkVec2 nbutton_padding(long struct) { return NkVec2.create(struct + NkStyleCombo.BUTTON_PADDING); }
    /** Unsafe version of {@link #spacing}. */
    public static NkVec2 nspacing(long struct) { return NkVec2.create(struct + NkStyleCombo.SPACING); }

    /** Unsafe version of {@link #normal(NkStyleItem) normal}. */
    public static void nnormal(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleCombo.NORMAL, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #hover(NkStyleItem) hover}. */
    public static void nhover(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleCombo.HOVER, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #active(NkStyleItem) active}. */
    public static void nactive(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleCombo.ACTIVE, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #border_color(NkColor) border_color}. */
    public static void nborder_color(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleCombo.BORDER_COLOR, NkColor.SIZEOF); }
    /** Unsafe version of {@link #label_normal(NkColor) label_normal}. */
    public static void nlabel_normal(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleCombo.LABEL_NORMAL, NkColor.SIZEOF); }
    /** Unsafe version of {@link #label_hover(NkColor) label_hover}. */
    public static void nlabel_hover(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleCombo.LABEL_HOVER, NkColor.SIZEOF); }
    /** Unsafe version of {@link #label_active(NkColor) label_active}. */
    public static void nlabel_active(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleCombo.LABEL_ACTIVE, NkColor.SIZEOF); }
    /** Unsafe version of {@link #symbol_normal(NkColor) symbol_normal}. */
    public static void nsymbol_normal(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleCombo.SYMBOL_NORMAL, NkColor.SIZEOF); }
    /** Unsafe version of {@link #symbol_hover(NkColor) symbol_hover}. */
    public static void nsymbol_hover(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleCombo.SYMBOL_HOVER, NkColor.SIZEOF); }
    /** Unsafe version of {@link #symbol_active(NkColor) symbol_active}. */
    public static void nsymbol_active(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleCombo.SYMBOL_ACTIVE, NkColor.SIZEOF); }
    /** Unsafe version of {@link #button(NkStyleButton) button}. */
    public static void nbutton(long struct, NkStyleButton value) { memCopy(value.address(), struct + NkStyleCombo.BUTTON, NkStyleButton.SIZEOF); }
    /** Unsafe version of {@link #sym_normal(int) sym_normal}. */
    public static void nsym_normal(long struct, int value) { UNSAFE.putInt(null, struct + NkStyleCombo.SYM_NORMAL, value); }
    /** Unsafe version of {@link #sym_hover(int) sym_hover}. */
    public static void nsym_hover(long struct, int value) { UNSAFE.putInt(null, struct + NkStyleCombo.SYM_HOVER, value); }
    /** Unsafe version of {@link #sym_active(int) sym_active}. */
    public static void nsym_active(long struct, int value) { UNSAFE.putInt(null, struct + NkStyleCombo.SYM_ACTIVE, value); }
    /** Unsafe version of {@link #border(float) border}. */
    public static void nborder(long struct, float value) { UNSAFE.putFloat(null, struct + NkStyleCombo.BORDER, value); }
    /** Unsafe version of {@link #rounding(float) rounding}. */
    public static void nrounding(long struct, float value) { UNSAFE.putFloat(null, struct + NkStyleCombo.ROUNDING, value); }
    /** Unsafe version of {@link #content_padding(NkVec2) content_padding}. */
    public static void ncontent_padding(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleCombo.CONTENT_PADDING, NkVec2.SIZEOF); }
    /** Unsafe version of {@link #button_padding(NkVec2) button_padding}. */
    public static void nbutton_padding(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleCombo.BUTTON_PADDING, NkVec2.SIZEOF); }
    /** Unsafe version of {@link #spacing(NkVec2) spacing}. */
    public static void nspacing(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleCombo.SPACING, NkVec2.SIZEOF); }

    // -----------------------------------

    /** An array of {@link NkStyleCombo} structs. */
    public static class Buffer extends StructBuffer<NkStyleCombo, Buffer> implements NativeResource {

        private static final NkStyleCombo ELEMENT_FACTORY = NkStyleCombo.create(-1L);

        /**
         * Creates a new {@code NkStyleCombo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkStyleCombo#SIZEOF}, and its mark will be undefined.
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
        protected NkStyleCombo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link NkStyleItem} view of the {@code normal} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem normal() { return NkStyleCombo.nnormal(address()); }
        /** Returns a {@link NkStyleItem} view of the {@code hover} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem hover() { return NkStyleCombo.nhover(address()); }
        /** Returns a {@link NkStyleItem} view of the {@code active} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem active() { return NkStyleCombo.nactive(address()); }
        /** Returns a {@link NkColor} view of the {@code border_color} field. */
        @NativeType("struct nk_color")
        public NkColor border_color() { return NkStyleCombo.nborder_color(address()); }
        /** Returns a {@link NkColor} view of the {@code label_normal} field. */
        @NativeType("struct nk_color")
        public NkColor label_normal() { return NkStyleCombo.nlabel_normal(address()); }
        /** Returns a {@link NkColor} view of the {@code label_hover} field. */
        @NativeType("struct nk_color")
        public NkColor label_hover() { return NkStyleCombo.nlabel_hover(address()); }
        /** Returns a {@link NkColor} view of the {@code label_active} field. */
        @NativeType("struct nk_color")
        public NkColor label_active() { return NkStyleCombo.nlabel_active(address()); }
        /** Returns a {@link NkColor} view of the {@code symbol_normal} field. */
        @NativeType("struct nk_color")
        public NkColor symbol_normal() { return NkStyleCombo.nsymbol_normal(address()); }
        /** Returns a {@link NkColor} view of the {@code symbol_hover} field. */
        @NativeType("struct nk_color")
        public NkColor symbol_hover() { return NkStyleCombo.nsymbol_hover(address()); }
        /** Returns a {@link NkColor} view of the {@code symbol_active} field. */
        @NativeType("struct nk_color")
        public NkColor symbol_active() { return NkStyleCombo.nsymbol_active(address()); }
        /** Returns a {@link NkStyleButton} view of the {@code button} field. */
        @NativeType("struct nk_style_button")
        public NkStyleButton button() { return NkStyleCombo.nbutton(address()); }
        /** Returns the value of the {@code sym_normal} field. */
        @NativeType("enum nk_symbol_type")
        public int sym_normal() { return NkStyleCombo.nsym_normal(address()); }
        /** Returns the value of the {@code sym_hover} field. */
        @NativeType("enum nk_symbol_type")
        public int sym_hover() { return NkStyleCombo.nsym_hover(address()); }
        /** Returns the value of the {@code sym_active} field. */
        @NativeType("enum nk_symbol_type")
        public int sym_active() { return NkStyleCombo.nsym_active(address()); }
        /** Returns the value of the {@code border} field. */
        public float border() { return NkStyleCombo.nborder(address()); }
        /** Returns the value of the {@code rounding} field. */
        public float rounding() { return NkStyleCombo.nrounding(address()); }
        /** Returns a {@link NkVec2} view of the {@code content_padding} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 content_padding() { return NkStyleCombo.ncontent_padding(address()); }
        /** Returns a {@link NkVec2} view of the {@code button_padding} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 button_padding() { return NkStyleCombo.nbutton_padding(address()); }
        /** Returns a {@link NkVec2} view of the {@code spacing} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 spacing() { return NkStyleCombo.nspacing(address()); }

        /** Copies the specified {@link NkStyleItem} to the {@code normal} field. */
        public NkStyleCombo.Buffer normal(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleCombo.nnormal(address(), value); return this; }
        /** Passes the {@code normal} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleCombo.Buffer normal(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(normal()); return this; }
        /** Copies the specified {@link NkStyleItem} to the {@code hover} field. */
        public NkStyleCombo.Buffer hover(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleCombo.nhover(address(), value); return this; }
        /** Passes the {@code hover} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleCombo.Buffer hover(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(hover()); return this; }
        /** Copies the specified {@link NkStyleItem} to the {@code active} field. */
        public NkStyleCombo.Buffer active(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleCombo.nactive(address(), value); return this; }
        /** Passes the {@code active} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleCombo.Buffer active(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(active()); return this; }
        /** Copies the specified {@link NkColor} to the {@code border_color} field. */
        public NkStyleCombo.Buffer border_color(@NativeType("struct nk_color") NkColor value) { NkStyleCombo.nborder_color(address(), value); return this; }
        /** Passes the {@code border_color} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleCombo.Buffer border_color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(border_color()); return this; }
        /** Copies the specified {@link NkColor} to the {@code label_normal} field. */
        public NkStyleCombo.Buffer label_normal(@NativeType("struct nk_color") NkColor value) { NkStyleCombo.nlabel_normal(address(), value); return this; }
        /** Passes the {@code label_normal} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleCombo.Buffer label_normal(java.util.function.Consumer<NkColor> consumer) { consumer.accept(label_normal()); return this; }
        /** Copies the specified {@link NkColor} to the {@code label_hover} field. */
        public NkStyleCombo.Buffer label_hover(@NativeType("struct nk_color") NkColor value) { NkStyleCombo.nlabel_hover(address(), value); return this; }
        /** Passes the {@code label_hover} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleCombo.Buffer label_hover(java.util.function.Consumer<NkColor> consumer) { consumer.accept(label_hover()); return this; }
        /** Copies the specified {@link NkColor} to the {@code label_active} field. */
        public NkStyleCombo.Buffer label_active(@NativeType("struct nk_color") NkColor value) { NkStyleCombo.nlabel_active(address(), value); return this; }
        /** Passes the {@code label_active} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleCombo.Buffer label_active(java.util.function.Consumer<NkColor> consumer) { consumer.accept(label_active()); return this; }
        /** Copies the specified {@link NkColor} to the {@code symbol_normal} field. */
        public NkStyleCombo.Buffer symbol_normal(@NativeType("struct nk_color") NkColor value) { NkStyleCombo.nsymbol_normal(address(), value); return this; }
        /** Passes the {@code symbol_normal} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleCombo.Buffer symbol_normal(java.util.function.Consumer<NkColor> consumer) { consumer.accept(symbol_normal()); return this; }
        /** Copies the specified {@link NkColor} to the {@code symbol_hover} field. */
        public NkStyleCombo.Buffer symbol_hover(@NativeType("struct nk_color") NkColor value) { NkStyleCombo.nsymbol_hover(address(), value); return this; }
        /** Passes the {@code symbol_hover} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleCombo.Buffer symbol_hover(java.util.function.Consumer<NkColor> consumer) { consumer.accept(symbol_hover()); return this; }
        /** Copies the specified {@link NkColor} to the {@code symbol_active} field. */
        public NkStyleCombo.Buffer symbol_active(@NativeType("struct nk_color") NkColor value) { NkStyleCombo.nsymbol_active(address(), value); return this; }
        /** Passes the {@code symbol_active} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleCombo.Buffer symbol_active(java.util.function.Consumer<NkColor> consumer) { consumer.accept(symbol_active()); return this; }
        /** Copies the specified {@link NkStyleButton} to the {@code button} field. */
        public NkStyleCombo.Buffer button(@NativeType("struct nk_style_button") NkStyleButton value) { NkStyleCombo.nbutton(address(), value); return this; }
        /** Passes the {@code button} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleCombo.Buffer button(java.util.function.Consumer<NkStyleButton> consumer) { consumer.accept(button()); return this; }
        /** Sets the specified value to the {@code sym_normal} field. */
        public NkStyleCombo.Buffer sym_normal(@NativeType("enum nk_symbol_type") int value) { NkStyleCombo.nsym_normal(address(), value); return this; }
        /** Sets the specified value to the {@code sym_hover} field. */
        public NkStyleCombo.Buffer sym_hover(@NativeType("enum nk_symbol_type") int value) { NkStyleCombo.nsym_hover(address(), value); return this; }
        /** Sets the specified value to the {@code sym_active} field. */
        public NkStyleCombo.Buffer sym_active(@NativeType("enum nk_symbol_type") int value) { NkStyleCombo.nsym_active(address(), value); return this; }
        /** Sets the specified value to the {@code border} field. */
        public NkStyleCombo.Buffer border(float value) { NkStyleCombo.nborder(address(), value); return this; }
        /** Sets the specified value to the {@code rounding} field. */
        public NkStyleCombo.Buffer rounding(float value) { NkStyleCombo.nrounding(address(), value); return this; }
        /** Copies the specified {@link NkVec2} to the {@code content_padding} field. */
        public NkStyleCombo.Buffer content_padding(@NativeType("struct nk_vec2") NkVec2 value) { NkStyleCombo.ncontent_padding(address(), value); return this; }
        /** Passes the {@code content_padding} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleCombo.Buffer content_padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(content_padding()); return this; }
        /** Copies the specified {@link NkVec2} to the {@code button_padding} field. */
        public NkStyleCombo.Buffer button_padding(@NativeType("struct nk_vec2") NkVec2 value) { NkStyleCombo.nbutton_padding(address(), value); return this; }
        /** Passes the {@code button_padding} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleCombo.Buffer button_padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(button_padding()); return this; }
        /** Copies the specified {@link NkVec2} to the {@code spacing} field. */
        public NkStyleCombo.Buffer spacing(@NativeType("struct nk_vec2") NkVec2 value) { NkStyleCombo.nspacing(address(), value); return this; }
        /** Passes the {@code spacing} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleCombo.Buffer spacing(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(spacing()); return this; }

    }

}