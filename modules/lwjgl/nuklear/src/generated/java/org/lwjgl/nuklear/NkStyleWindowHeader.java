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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code align} &ndash; one of:<br><table><tr><td>{@link Nuklear#NK_HEADER_LEFT HEADER_LEFT}</td><td>{@link Nuklear#NK_HEADER_RIGHT HEADER_RIGHT}</td></tr></table></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct nk_style_window_header {
 *     {@link NkStyleItem struct nk_style_item} normal;
 *     {@link NkStyleItem struct nk_style_item} hover;
 *     {@link NkStyleItem struct nk_style_item} active;
 *     {@link NkStyleButton struct nk_style_button} close_button;
 *     {@link NkStyleButton struct nk_style_button} minimize_button;
 *     enum nk_symbol_type close_symbol;
 *     enum nk_symbol_type minimize_symbol;
 *     enum nk_symbol_type maximize_symbol;
 *     {@link NkColor struct nk_color} label_normal;
 *     {@link NkColor struct nk_color} label_hover;
 *     {@link NkColor struct nk_color} label_active;
 *     enum nk_style_header_align align;
 *     {@link NkVec2 struct nk_vec2} padding;
 *     {@link NkVec2 struct nk_vec2} label_padding;
 *     {@link NkVec2 struct nk_vec2} spacing;
 * }</code></pre>
 */
@NativeType("struct nk_style_window_header")
public class NkStyleWindowHeader extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NORMAL,
        HOVER,
        ACTIVE,
        CLOSE_BUTTON,
        MINIMIZE_BUTTON,
        CLOSE_SYMBOL,
        MINIMIZE_SYMBOL,
        MAXIMIZE_SYMBOL,
        LABEL_NORMAL,
        LABEL_HOVER,
        LABEL_ACTIVE,
        ALIGN,
        PADDING,
        LABEL_PADDING,
        SPACING;

    static {
        Layout layout = __struct(
            __member(NkStyleItem.SIZEOF, NkStyleItem.ALIGNOF),
            __member(NkStyleItem.SIZEOF, NkStyleItem.ALIGNOF),
            __member(NkStyleItem.SIZEOF, NkStyleItem.ALIGNOF),
            __member(NkStyleButton.SIZEOF, NkStyleButton.ALIGNOF),
            __member(NkStyleButton.SIZEOF, NkStyleButton.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
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
        CLOSE_BUTTON = layout.offsetof(3);
        MINIMIZE_BUTTON = layout.offsetof(4);
        CLOSE_SYMBOL = layout.offsetof(5);
        MINIMIZE_SYMBOL = layout.offsetof(6);
        MAXIMIZE_SYMBOL = layout.offsetof(7);
        LABEL_NORMAL = layout.offsetof(8);
        LABEL_HOVER = layout.offsetof(9);
        LABEL_ACTIVE = layout.offsetof(10);
        ALIGN = layout.offsetof(11);
        PADDING = layout.offsetof(12);
        LABEL_PADDING = layout.offsetof(13);
        SPACING = layout.offsetof(14);
    }

    /**
     * Creates a {@code NkStyleWindowHeader} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkStyleWindowHeader(ByteBuffer container) {
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
    /** Returns a {@link NkStyleButton} view of the {@code close_button} field. */
    @NativeType("struct nk_style_button")
    public NkStyleButton close_button() { return nclose_button(address()); }
    /** Returns a {@link NkStyleButton} view of the {@code minimize_button} field. */
    @NativeType("struct nk_style_button")
    public NkStyleButton minimize_button() { return nminimize_button(address()); }
    /** Returns the value of the {@code close_symbol} field. */
    @NativeType("enum nk_symbol_type")
    public int close_symbol() { return nclose_symbol(address()); }
    /** Returns the value of the {@code minimize_symbol} field. */
    @NativeType("enum nk_symbol_type")
    public int minimize_symbol() { return nminimize_symbol(address()); }
    /** Returns the value of the {@code maximize_symbol} field. */
    @NativeType("enum nk_symbol_type")
    public int maximize_symbol() { return nmaximize_symbol(address()); }
    /** Returns a {@link NkColor} view of the {@code label_normal} field. */
    @NativeType("struct nk_color")
    public NkColor label_normal() { return nlabel_normal(address()); }
    /** Returns a {@link NkColor} view of the {@code label_hover} field. */
    @NativeType("struct nk_color")
    public NkColor label_hover() { return nlabel_hover(address()); }
    /** Returns a {@link NkColor} view of the {@code label_active} field. */
    @NativeType("struct nk_color")
    public NkColor label_active() { return nlabel_active(address()); }
    /** Returns the value of the {@code align} field. */
    @NativeType("enum nk_style_header_align")
    public int align() { return nalign(address()); }
    /** Returns a {@link NkVec2} view of the {@code padding} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 padding() { return npadding(address()); }
    /** Returns a {@link NkVec2} view of the {@code label_padding} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 label_padding() { return nlabel_padding(address()); }
    /** Returns a {@link NkVec2} view of the {@code spacing} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 spacing() { return nspacing(address()); }

    /** Copies the specified {@link NkStyleItem} to the {@code normal} field. */
    public NkStyleWindowHeader normal(@NativeType("struct nk_style_item") NkStyleItem value) { nnormal(address(), value); return this; }
    /** Passes the {@code normal} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleWindowHeader normal(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(normal()); return this; }
    /** Copies the specified {@link NkStyleItem} to the {@code hover} field. */
    public NkStyleWindowHeader hover(@NativeType("struct nk_style_item") NkStyleItem value) { nhover(address(), value); return this; }
    /** Passes the {@code hover} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleWindowHeader hover(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(hover()); return this; }
    /** Copies the specified {@link NkStyleItem} to the {@code active} field. */
    public NkStyleWindowHeader active(@NativeType("struct nk_style_item") NkStyleItem value) { nactive(address(), value); return this; }
    /** Passes the {@code active} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleWindowHeader active(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(active()); return this; }
    /** Copies the specified {@link NkStyleButton} to the {@code close_button} field. */
    public NkStyleWindowHeader close_button(@NativeType("struct nk_style_button") NkStyleButton value) { nclose_button(address(), value); return this; }
    /** Passes the {@code close_button} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleWindowHeader close_button(java.util.function.Consumer<NkStyleButton> consumer) { consumer.accept(close_button()); return this; }
    /** Copies the specified {@link NkStyleButton} to the {@code minimize_button} field. */
    public NkStyleWindowHeader minimize_button(@NativeType("struct nk_style_button") NkStyleButton value) { nminimize_button(address(), value); return this; }
    /** Passes the {@code minimize_button} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleWindowHeader minimize_button(java.util.function.Consumer<NkStyleButton> consumer) { consumer.accept(minimize_button()); return this; }
    /** Sets the specified value to the {@code close_symbol} field. */
    public NkStyleWindowHeader close_symbol(@NativeType("enum nk_symbol_type") int value) { nclose_symbol(address(), value); return this; }
    /** Sets the specified value to the {@code minimize_symbol} field. */
    public NkStyleWindowHeader minimize_symbol(@NativeType("enum nk_symbol_type") int value) { nminimize_symbol(address(), value); return this; }
    /** Sets the specified value to the {@code maximize_symbol} field. */
    public NkStyleWindowHeader maximize_symbol(@NativeType("enum nk_symbol_type") int value) { nmaximize_symbol(address(), value); return this; }
    /** Copies the specified {@link NkColor} to the {@code label_normal} field. */
    public NkStyleWindowHeader label_normal(@NativeType("struct nk_color") NkColor value) { nlabel_normal(address(), value); return this; }
    /** Passes the {@code label_normal} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleWindowHeader label_normal(java.util.function.Consumer<NkColor> consumer) { consumer.accept(label_normal()); return this; }
    /** Copies the specified {@link NkColor} to the {@code label_hover} field. */
    public NkStyleWindowHeader label_hover(@NativeType("struct nk_color") NkColor value) { nlabel_hover(address(), value); return this; }
    /** Passes the {@code label_hover} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleWindowHeader label_hover(java.util.function.Consumer<NkColor> consumer) { consumer.accept(label_hover()); return this; }
    /** Copies the specified {@link NkColor} to the {@code label_active} field. */
    public NkStyleWindowHeader label_active(@NativeType("struct nk_color") NkColor value) { nlabel_active(address(), value); return this; }
    /** Passes the {@code label_active} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleWindowHeader label_active(java.util.function.Consumer<NkColor> consumer) { consumer.accept(label_active()); return this; }
    /** Sets the specified value to the {@code align} field. */
    public NkStyleWindowHeader align(@NativeType("enum nk_style_header_align") int value) { nalign(address(), value); return this; }
    /** Copies the specified {@link NkVec2} to the {@code padding} field. */
    public NkStyleWindowHeader padding(@NativeType("struct nk_vec2") NkVec2 value) { npadding(address(), value); return this; }
    /** Passes the {@code padding} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleWindowHeader padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(padding()); return this; }
    /** Copies the specified {@link NkVec2} to the {@code label_padding} field. */
    public NkStyleWindowHeader label_padding(@NativeType("struct nk_vec2") NkVec2 value) { nlabel_padding(address(), value); return this; }
    /** Passes the {@code label_padding} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleWindowHeader label_padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(label_padding()); return this; }
    /** Copies the specified {@link NkVec2} to the {@code spacing} field. */
    public NkStyleWindowHeader spacing(@NativeType("struct nk_vec2") NkVec2 value) { nspacing(address(), value); return this; }
    /** Passes the {@code spacing} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleWindowHeader spacing(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(spacing()); return this; }

    /** Initializes this struct with the specified values. */
    public NkStyleWindowHeader set(
        NkStyleItem normal,
        NkStyleItem hover,
        NkStyleItem active,
        NkStyleButton close_button,
        NkStyleButton minimize_button,
        int close_symbol,
        int minimize_symbol,
        int maximize_symbol,
        NkColor label_normal,
        NkColor label_hover,
        NkColor label_active,
        int align,
        NkVec2 padding,
        NkVec2 label_padding,
        NkVec2 spacing
    ) {
        normal(normal);
        hover(hover);
        active(active);
        close_button(close_button);
        minimize_button(minimize_button);
        close_symbol(close_symbol);
        minimize_symbol(minimize_symbol);
        maximize_symbol(maximize_symbol);
        label_normal(label_normal);
        label_hover(label_hover);
        label_active(label_active);
        align(align);
        padding(padding);
        label_padding(label_padding);
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
    public NkStyleWindowHeader set(NkStyleWindowHeader src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code NkStyleWindowHeader} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkStyleWindowHeader malloc() {
        return wrap(NkStyleWindowHeader.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code NkStyleWindowHeader} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkStyleWindowHeader calloc() {
        return wrap(NkStyleWindowHeader.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code NkStyleWindowHeader} instance allocated with {@link BufferUtils}. */
    public static NkStyleWindowHeader create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(NkStyleWindowHeader.class, memAddress(container), container);
    }

    /** Returns a new {@code NkStyleWindowHeader} instance for the specified memory address. */
    public static NkStyleWindowHeader create(long address) {
        return wrap(NkStyleWindowHeader.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkStyleWindowHeader createSafe(long address) {
        return address == NULL ? null : wrap(NkStyleWindowHeader.class, address);
    }

    /**
     * Returns a new {@link NkStyleWindowHeader.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleWindowHeader.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NkStyleWindowHeader.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleWindowHeader.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkStyleWindowHeader.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleWindowHeader.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link NkStyleWindowHeader.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkStyleWindowHeader.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkStyleWindowHeader.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code NkStyleWindowHeader} instance allocated on the thread-local {@link MemoryStack}. */
    public static NkStyleWindowHeader mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code NkStyleWindowHeader} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static NkStyleWindowHeader callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code NkStyleWindowHeader} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkStyleWindowHeader mallocStack(MemoryStack stack) {
        return wrap(NkStyleWindowHeader.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code NkStyleWindowHeader} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkStyleWindowHeader callocStack(MemoryStack stack) {
        return wrap(NkStyleWindowHeader.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link NkStyleWindowHeader.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleWindowHeader.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkStyleWindowHeader.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleWindowHeader.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkStyleWindowHeader.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkStyleWindowHeader.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkStyleWindowHeader.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkStyleWindowHeader.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #normal}. */
    public static NkStyleItem nnormal(long struct) { return NkStyleItem.create(struct + NkStyleWindowHeader.NORMAL); }
    /** Unsafe version of {@link #hover}. */
    public static NkStyleItem nhover(long struct) { return NkStyleItem.create(struct + NkStyleWindowHeader.HOVER); }
    /** Unsafe version of {@link #active}. */
    public static NkStyleItem nactive(long struct) { return NkStyleItem.create(struct + NkStyleWindowHeader.ACTIVE); }
    /** Unsafe version of {@link #close_button}. */
    public static NkStyleButton nclose_button(long struct) { return NkStyleButton.create(struct + NkStyleWindowHeader.CLOSE_BUTTON); }
    /** Unsafe version of {@link #minimize_button}. */
    public static NkStyleButton nminimize_button(long struct) { return NkStyleButton.create(struct + NkStyleWindowHeader.MINIMIZE_BUTTON); }
    /** Unsafe version of {@link #close_symbol}. */
    public static int nclose_symbol(long struct) { return UNSAFE.getInt(null, struct + NkStyleWindowHeader.CLOSE_SYMBOL); }
    /** Unsafe version of {@link #minimize_symbol}. */
    public static int nminimize_symbol(long struct) { return UNSAFE.getInt(null, struct + NkStyleWindowHeader.MINIMIZE_SYMBOL); }
    /** Unsafe version of {@link #maximize_symbol}. */
    public static int nmaximize_symbol(long struct) { return UNSAFE.getInt(null, struct + NkStyleWindowHeader.MAXIMIZE_SYMBOL); }
    /** Unsafe version of {@link #label_normal}. */
    public static NkColor nlabel_normal(long struct) { return NkColor.create(struct + NkStyleWindowHeader.LABEL_NORMAL); }
    /** Unsafe version of {@link #label_hover}. */
    public static NkColor nlabel_hover(long struct) { return NkColor.create(struct + NkStyleWindowHeader.LABEL_HOVER); }
    /** Unsafe version of {@link #label_active}. */
    public static NkColor nlabel_active(long struct) { return NkColor.create(struct + NkStyleWindowHeader.LABEL_ACTIVE); }
    /** Unsafe version of {@link #align}. */
    public static int nalign(long struct) { return UNSAFE.getInt(null, struct + NkStyleWindowHeader.ALIGN); }
    /** Unsafe version of {@link #padding}. */
    public static NkVec2 npadding(long struct) { return NkVec2.create(struct + NkStyleWindowHeader.PADDING); }
    /** Unsafe version of {@link #label_padding}. */
    public static NkVec2 nlabel_padding(long struct) { return NkVec2.create(struct + NkStyleWindowHeader.LABEL_PADDING); }
    /** Unsafe version of {@link #spacing}. */
    public static NkVec2 nspacing(long struct) { return NkVec2.create(struct + NkStyleWindowHeader.SPACING); }

    /** Unsafe version of {@link #normal(NkStyleItem) normal}. */
    public static void nnormal(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleWindowHeader.NORMAL, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #hover(NkStyleItem) hover}. */
    public static void nhover(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleWindowHeader.HOVER, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #active(NkStyleItem) active}. */
    public static void nactive(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleWindowHeader.ACTIVE, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #close_button(NkStyleButton) close_button}. */
    public static void nclose_button(long struct, NkStyleButton value) { memCopy(value.address(), struct + NkStyleWindowHeader.CLOSE_BUTTON, NkStyleButton.SIZEOF); }
    /** Unsafe version of {@link #minimize_button(NkStyleButton) minimize_button}. */
    public static void nminimize_button(long struct, NkStyleButton value) { memCopy(value.address(), struct + NkStyleWindowHeader.MINIMIZE_BUTTON, NkStyleButton.SIZEOF); }
    /** Unsafe version of {@link #close_symbol(int) close_symbol}. */
    public static void nclose_symbol(long struct, int value) { UNSAFE.putInt(null, struct + NkStyleWindowHeader.CLOSE_SYMBOL, value); }
    /** Unsafe version of {@link #minimize_symbol(int) minimize_symbol}. */
    public static void nminimize_symbol(long struct, int value) { UNSAFE.putInt(null, struct + NkStyleWindowHeader.MINIMIZE_SYMBOL, value); }
    /** Unsafe version of {@link #maximize_symbol(int) maximize_symbol}. */
    public static void nmaximize_symbol(long struct, int value) { UNSAFE.putInt(null, struct + NkStyleWindowHeader.MAXIMIZE_SYMBOL, value); }
    /** Unsafe version of {@link #label_normal(NkColor) label_normal}. */
    public static void nlabel_normal(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleWindowHeader.LABEL_NORMAL, NkColor.SIZEOF); }
    /** Unsafe version of {@link #label_hover(NkColor) label_hover}. */
    public static void nlabel_hover(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleWindowHeader.LABEL_HOVER, NkColor.SIZEOF); }
    /** Unsafe version of {@link #label_active(NkColor) label_active}. */
    public static void nlabel_active(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleWindowHeader.LABEL_ACTIVE, NkColor.SIZEOF); }
    /** Unsafe version of {@link #align(int) align}. */
    public static void nalign(long struct, int value) { UNSAFE.putInt(null, struct + NkStyleWindowHeader.ALIGN, value); }
    /** Unsafe version of {@link #padding(NkVec2) padding}. */
    public static void npadding(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleWindowHeader.PADDING, NkVec2.SIZEOF); }
    /** Unsafe version of {@link #label_padding(NkVec2) label_padding}. */
    public static void nlabel_padding(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleWindowHeader.LABEL_PADDING, NkVec2.SIZEOF); }
    /** Unsafe version of {@link #spacing(NkVec2) spacing}. */
    public static void nspacing(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleWindowHeader.SPACING, NkVec2.SIZEOF); }

    // -----------------------------------

    /** An array of {@link NkStyleWindowHeader} structs. */
    public static class Buffer extends StructBuffer<NkStyleWindowHeader, Buffer> implements NativeResource {

        private static final NkStyleWindowHeader ELEMENT_FACTORY = NkStyleWindowHeader.create(-1L);

        /**
         * Creates a new {@code NkStyleWindowHeader.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkStyleWindowHeader#SIZEOF}, and its mark will be undefined.
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
        protected NkStyleWindowHeader getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link NkStyleItem} view of the {@code normal} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem normal() { return NkStyleWindowHeader.nnormal(address()); }
        /** Returns a {@link NkStyleItem} view of the {@code hover} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem hover() { return NkStyleWindowHeader.nhover(address()); }
        /** Returns a {@link NkStyleItem} view of the {@code active} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem active() { return NkStyleWindowHeader.nactive(address()); }
        /** Returns a {@link NkStyleButton} view of the {@code close_button} field. */
        @NativeType("struct nk_style_button")
        public NkStyleButton close_button() { return NkStyleWindowHeader.nclose_button(address()); }
        /** Returns a {@link NkStyleButton} view of the {@code minimize_button} field. */
        @NativeType("struct nk_style_button")
        public NkStyleButton minimize_button() { return NkStyleWindowHeader.nminimize_button(address()); }
        /** Returns the value of the {@code close_symbol} field. */
        @NativeType("enum nk_symbol_type")
        public int close_symbol() { return NkStyleWindowHeader.nclose_symbol(address()); }
        /** Returns the value of the {@code minimize_symbol} field. */
        @NativeType("enum nk_symbol_type")
        public int minimize_symbol() { return NkStyleWindowHeader.nminimize_symbol(address()); }
        /** Returns the value of the {@code maximize_symbol} field. */
        @NativeType("enum nk_symbol_type")
        public int maximize_symbol() { return NkStyleWindowHeader.nmaximize_symbol(address()); }
        /** Returns a {@link NkColor} view of the {@code label_normal} field. */
        @NativeType("struct nk_color")
        public NkColor label_normal() { return NkStyleWindowHeader.nlabel_normal(address()); }
        /** Returns a {@link NkColor} view of the {@code label_hover} field. */
        @NativeType("struct nk_color")
        public NkColor label_hover() { return NkStyleWindowHeader.nlabel_hover(address()); }
        /** Returns a {@link NkColor} view of the {@code label_active} field. */
        @NativeType("struct nk_color")
        public NkColor label_active() { return NkStyleWindowHeader.nlabel_active(address()); }
        /** Returns the value of the {@code align} field. */
        @NativeType("enum nk_style_header_align")
        public int align() { return NkStyleWindowHeader.nalign(address()); }
        /** Returns a {@link NkVec2} view of the {@code padding} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 padding() { return NkStyleWindowHeader.npadding(address()); }
        /** Returns a {@link NkVec2} view of the {@code label_padding} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 label_padding() { return NkStyleWindowHeader.nlabel_padding(address()); }
        /** Returns a {@link NkVec2} view of the {@code spacing} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 spacing() { return NkStyleWindowHeader.nspacing(address()); }

        /** Copies the specified {@link NkStyleItem} to the {@code normal} field. */
        public NkStyleWindowHeader.Buffer normal(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleWindowHeader.nnormal(address(), value); return this; }
        /** Passes the {@code normal} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleWindowHeader.Buffer normal(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(normal()); return this; }
        /** Copies the specified {@link NkStyleItem} to the {@code hover} field. */
        public NkStyleWindowHeader.Buffer hover(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleWindowHeader.nhover(address(), value); return this; }
        /** Passes the {@code hover} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleWindowHeader.Buffer hover(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(hover()); return this; }
        /** Copies the specified {@link NkStyleItem} to the {@code active} field. */
        public NkStyleWindowHeader.Buffer active(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleWindowHeader.nactive(address(), value); return this; }
        /** Passes the {@code active} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleWindowHeader.Buffer active(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(active()); return this; }
        /** Copies the specified {@link NkStyleButton} to the {@code close_button} field. */
        public NkStyleWindowHeader.Buffer close_button(@NativeType("struct nk_style_button") NkStyleButton value) { NkStyleWindowHeader.nclose_button(address(), value); return this; }
        /** Passes the {@code close_button} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleWindowHeader.Buffer close_button(java.util.function.Consumer<NkStyleButton> consumer) { consumer.accept(close_button()); return this; }
        /** Copies the specified {@link NkStyleButton} to the {@code minimize_button} field. */
        public NkStyleWindowHeader.Buffer minimize_button(@NativeType("struct nk_style_button") NkStyleButton value) { NkStyleWindowHeader.nminimize_button(address(), value); return this; }
        /** Passes the {@code minimize_button} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleWindowHeader.Buffer minimize_button(java.util.function.Consumer<NkStyleButton> consumer) { consumer.accept(minimize_button()); return this; }
        /** Sets the specified value to the {@code close_symbol} field. */
        public NkStyleWindowHeader.Buffer close_symbol(@NativeType("enum nk_symbol_type") int value) { NkStyleWindowHeader.nclose_symbol(address(), value); return this; }
        /** Sets the specified value to the {@code minimize_symbol} field. */
        public NkStyleWindowHeader.Buffer minimize_symbol(@NativeType("enum nk_symbol_type") int value) { NkStyleWindowHeader.nminimize_symbol(address(), value); return this; }
        /** Sets the specified value to the {@code maximize_symbol} field. */
        public NkStyleWindowHeader.Buffer maximize_symbol(@NativeType("enum nk_symbol_type") int value) { NkStyleWindowHeader.nmaximize_symbol(address(), value); return this; }
        /** Copies the specified {@link NkColor} to the {@code label_normal} field. */
        public NkStyleWindowHeader.Buffer label_normal(@NativeType("struct nk_color") NkColor value) { NkStyleWindowHeader.nlabel_normal(address(), value); return this; }
        /** Passes the {@code label_normal} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleWindowHeader.Buffer label_normal(java.util.function.Consumer<NkColor> consumer) { consumer.accept(label_normal()); return this; }
        /** Copies the specified {@link NkColor} to the {@code label_hover} field. */
        public NkStyleWindowHeader.Buffer label_hover(@NativeType("struct nk_color") NkColor value) { NkStyleWindowHeader.nlabel_hover(address(), value); return this; }
        /** Passes the {@code label_hover} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleWindowHeader.Buffer label_hover(java.util.function.Consumer<NkColor> consumer) { consumer.accept(label_hover()); return this; }
        /** Copies the specified {@link NkColor} to the {@code label_active} field. */
        public NkStyleWindowHeader.Buffer label_active(@NativeType("struct nk_color") NkColor value) { NkStyleWindowHeader.nlabel_active(address(), value); return this; }
        /** Passes the {@code label_active} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleWindowHeader.Buffer label_active(java.util.function.Consumer<NkColor> consumer) { consumer.accept(label_active()); return this; }
        /** Sets the specified value to the {@code align} field. */
        public NkStyleWindowHeader.Buffer align(@NativeType("enum nk_style_header_align") int value) { NkStyleWindowHeader.nalign(address(), value); return this; }
        /** Copies the specified {@link NkVec2} to the {@code padding} field. */
        public NkStyleWindowHeader.Buffer padding(@NativeType("struct nk_vec2") NkVec2 value) { NkStyleWindowHeader.npadding(address(), value); return this; }
        /** Passes the {@code padding} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleWindowHeader.Buffer padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(padding()); return this; }
        /** Copies the specified {@link NkVec2} to the {@code label_padding} field. */
        public NkStyleWindowHeader.Buffer label_padding(@NativeType("struct nk_vec2") NkVec2 value) { NkStyleWindowHeader.nlabel_padding(address(), value); return this; }
        /** Passes the {@code label_padding} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleWindowHeader.Buffer label_padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(label_padding()); return this; }
        /** Copies the specified {@link NkVec2} to the {@code spacing} field. */
        public NkStyleWindowHeader.Buffer spacing(@NativeType("struct nk_vec2") NkVec2 value) { NkStyleWindowHeader.nspacing(address(), value); return this; }
        /** Passes the {@code spacing} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleWindowHeader.Buffer spacing(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(spacing()); return this; }

    }

}