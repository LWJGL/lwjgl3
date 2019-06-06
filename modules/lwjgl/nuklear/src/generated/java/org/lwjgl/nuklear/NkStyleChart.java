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
 * struct nk_style_chart {
 *     {@link NkStyleItem struct nk_style_item} background;
 *     {@link NkColor struct nk_color} border_color;
 *     {@link NkColor struct nk_color} selected_color;
 *     {@link NkColor struct nk_color} color;
 *     float border;
 *     float rounding;
 *     {@link NkVec2 struct nk_vec2} padding;
 * }</code></pre>
 */
@NativeType("struct nk_style_chart")
public class NkStyleChart extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BACKGROUND,
        BORDER_COLOR,
        SELECTED_COLOR,
        COLOR,
        BORDER,
        ROUNDING,
        PADDING;

    static {
        Layout layout = __struct(
            __member(NkStyleItem.SIZEOF, NkStyleItem.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(4),
            __member(4),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BACKGROUND = layout.offsetof(0);
        BORDER_COLOR = layout.offsetof(1);
        SELECTED_COLOR = layout.offsetof(2);
        COLOR = layout.offsetof(3);
        BORDER = layout.offsetof(4);
        ROUNDING = layout.offsetof(5);
        PADDING = layout.offsetof(6);
    }

    /**
     * Creates a {@code NkStyleChart} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkStyleChart(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link NkStyleItem} view of the {@code background} field. */
    @NativeType("struct nk_style_item")
    public NkStyleItem background() { return nbackground(address()); }
    /** Returns a {@link NkColor} view of the {@code border_color} field. */
    @NativeType("struct nk_color")
    public NkColor border_color() { return nborder_color(address()); }
    /** Returns a {@link NkColor} view of the {@code selected_color} field. */
    @NativeType("struct nk_color")
    public NkColor selected_color() { return nselected_color(address()); }
    /** Returns a {@link NkColor} view of the {@code color} field. */
    @NativeType("struct nk_color")
    public NkColor color() { return ncolor(address()); }
    /** Returns the value of the {@code border} field. */
    public float border() { return nborder(address()); }
    /** Returns the value of the {@code rounding} field. */
    public float rounding() { return nrounding(address()); }
    /** Returns a {@link NkVec2} view of the {@code padding} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 padding() { return npadding(address()); }

    /** Copies the specified {@link NkStyleItem} to the {@code background} field. */
    public NkStyleChart background(@NativeType("struct nk_style_item") NkStyleItem value) { nbackground(address(), value); return this; }
    /** Passes the {@code background} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleChart background(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(background()); return this; }
    /** Copies the specified {@link NkColor} to the {@code border_color} field. */
    public NkStyleChart border_color(@NativeType("struct nk_color") NkColor value) { nborder_color(address(), value); return this; }
    /** Passes the {@code border_color} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleChart border_color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(border_color()); return this; }
    /** Copies the specified {@link NkColor} to the {@code selected_color} field. */
    public NkStyleChart selected_color(@NativeType("struct nk_color") NkColor value) { nselected_color(address(), value); return this; }
    /** Passes the {@code selected_color} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleChart selected_color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(selected_color()); return this; }
    /** Copies the specified {@link NkColor} to the {@code color} field. */
    public NkStyleChart color(@NativeType("struct nk_color") NkColor value) { ncolor(address(), value); return this; }
    /** Passes the {@code color} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleChart color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(color()); return this; }
    /** Sets the specified value to the {@code border} field. */
    public NkStyleChart border(float value) { nborder(address(), value); return this; }
    /** Sets the specified value to the {@code rounding} field. */
    public NkStyleChart rounding(float value) { nrounding(address(), value); return this; }
    /** Copies the specified {@link NkVec2} to the {@code padding} field. */
    public NkStyleChart padding(@NativeType("struct nk_vec2") NkVec2 value) { npadding(address(), value); return this; }
    /** Passes the {@code padding} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkStyleChart padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(padding()); return this; }

    /** Initializes this struct with the specified values. */
    public NkStyleChart set(
        NkStyleItem background,
        NkColor border_color,
        NkColor selected_color,
        NkColor color,
        float border,
        float rounding,
        NkVec2 padding
    ) {
        background(background);
        border_color(border_color);
        selected_color(selected_color);
        color(color);
        border(border);
        rounding(rounding);
        padding(padding);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public NkStyleChart set(NkStyleChart src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code NkStyleChart} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkStyleChart malloc() {
        return wrap(NkStyleChart.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code NkStyleChart} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkStyleChart calloc() {
        return wrap(NkStyleChart.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code NkStyleChart} instance allocated with {@link BufferUtils}. */
    public static NkStyleChart create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(NkStyleChart.class, memAddress(container), container);
    }

    /** Returns a new {@code NkStyleChart} instance for the specified memory address. */
    public static NkStyleChart create(long address) {
        return wrap(NkStyleChart.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkStyleChart createSafe(long address) {
        return address == NULL ? null : wrap(NkStyleChart.class, address);
    }

    /**
     * Returns a new {@link NkStyleChart.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleChart.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NkStyleChart.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleChart.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkStyleChart.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleChart.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link NkStyleChart.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkStyleChart.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkStyleChart.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code NkStyleChart} instance allocated on the thread-local {@link MemoryStack}. */
    public static NkStyleChart mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code NkStyleChart} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static NkStyleChart callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code NkStyleChart} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkStyleChart mallocStack(MemoryStack stack) {
        return wrap(NkStyleChart.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code NkStyleChart} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkStyleChart callocStack(MemoryStack stack) {
        return wrap(NkStyleChart.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link NkStyleChart.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleChart.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkStyleChart.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleChart.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkStyleChart.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkStyleChart.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkStyleChart.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkStyleChart.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #background}. */
    public static NkStyleItem nbackground(long struct) { return NkStyleItem.create(struct + NkStyleChart.BACKGROUND); }
    /** Unsafe version of {@link #border_color}. */
    public static NkColor nborder_color(long struct) { return NkColor.create(struct + NkStyleChart.BORDER_COLOR); }
    /** Unsafe version of {@link #selected_color}. */
    public static NkColor nselected_color(long struct) { return NkColor.create(struct + NkStyleChart.SELECTED_COLOR); }
    /** Unsafe version of {@link #color}. */
    public static NkColor ncolor(long struct) { return NkColor.create(struct + NkStyleChart.COLOR); }
    /** Unsafe version of {@link #border}. */
    public static float nborder(long struct) { return UNSAFE.getFloat(null, struct + NkStyleChart.BORDER); }
    /** Unsafe version of {@link #rounding}. */
    public static float nrounding(long struct) { return UNSAFE.getFloat(null, struct + NkStyleChart.ROUNDING); }
    /** Unsafe version of {@link #padding}. */
    public static NkVec2 npadding(long struct) { return NkVec2.create(struct + NkStyleChart.PADDING); }

    /** Unsafe version of {@link #background(NkStyleItem) background}. */
    public static void nbackground(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleChart.BACKGROUND, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #border_color(NkColor) border_color}. */
    public static void nborder_color(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleChart.BORDER_COLOR, NkColor.SIZEOF); }
    /** Unsafe version of {@link #selected_color(NkColor) selected_color}. */
    public static void nselected_color(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleChart.SELECTED_COLOR, NkColor.SIZEOF); }
    /** Unsafe version of {@link #color(NkColor) color}. */
    public static void ncolor(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleChart.COLOR, NkColor.SIZEOF); }
    /** Unsafe version of {@link #border(float) border}. */
    public static void nborder(long struct, float value) { UNSAFE.putFloat(null, struct + NkStyleChart.BORDER, value); }
    /** Unsafe version of {@link #rounding(float) rounding}. */
    public static void nrounding(long struct, float value) { UNSAFE.putFloat(null, struct + NkStyleChart.ROUNDING, value); }
    /** Unsafe version of {@link #padding(NkVec2) padding}. */
    public static void npadding(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleChart.PADDING, NkVec2.SIZEOF); }

    // -----------------------------------

    /** An array of {@link NkStyleChart} structs. */
    public static class Buffer extends StructBuffer<NkStyleChart, Buffer> implements NativeResource {

        private static final NkStyleChart ELEMENT_FACTORY = NkStyleChart.create(-1L);

        /**
         * Creates a new {@code NkStyleChart.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkStyleChart#SIZEOF}, and its mark will be undefined.
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
        protected NkStyleChart getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link NkStyleItem} view of the {@code background} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem background() { return NkStyleChart.nbackground(address()); }
        /** Returns a {@link NkColor} view of the {@code border_color} field. */
        @NativeType("struct nk_color")
        public NkColor border_color() { return NkStyleChart.nborder_color(address()); }
        /** Returns a {@link NkColor} view of the {@code selected_color} field. */
        @NativeType("struct nk_color")
        public NkColor selected_color() { return NkStyleChart.nselected_color(address()); }
        /** Returns a {@link NkColor} view of the {@code color} field. */
        @NativeType("struct nk_color")
        public NkColor color() { return NkStyleChart.ncolor(address()); }
        /** Returns the value of the {@code border} field. */
        public float border() { return NkStyleChart.nborder(address()); }
        /** Returns the value of the {@code rounding} field. */
        public float rounding() { return NkStyleChart.nrounding(address()); }
        /** Returns a {@link NkVec2} view of the {@code padding} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 padding() { return NkStyleChart.npadding(address()); }

        /** Copies the specified {@link NkStyleItem} to the {@code background} field. */
        public NkStyleChart.Buffer background(@NativeType("struct nk_style_item") NkStyleItem value) { NkStyleChart.nbackground(address(), value); return this; }
        /** Passes the {@code background} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleChart.Buffer background(java.util.function.Consumer<NkStyleItem> consumer) { consumer.accept(background()); return this; }
        /** Copies the specified {@link NkColor} to the {@code border_color} field. */
        public NkStyleChart.Buffer border_color(@NativeType("struct nk_color") NkColor value) { NkStyleChart.nborder_color(address(), value); return this; }
        /** Passes the {@code border_color} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleChart.Buffer border_color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(border_color()); return this; }
        /** Copies the specified {@link NkColor} to the {@code selected_color} field. */
        public NkStyleChart.Buffer selected_color(@NativeType("struct nk_color") NkColor value) { NkStyleChart.nselected_color(address(), value); return this; }
        /** Passes the {@code selected_color} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleChart.Buffer selected_color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(selected_color()); return this; }
        /** Copies the specified {@link NkColor} to the {@code color} field. */
        public NkStyleChart.Buffer color(@NativeType("struct nk_color") NkColor value) { NkStyleChart.ncolor(address(), value); return this; }
        /** Passes the {@code color} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleChart.Buffer color(java.util.function.Consumer<NkColor> consumer) { consumer.accept(color()); return this; }
        /** Sets the specified value to the {@code border} field. */
        public NkStyleChart.Buffer border(float value) { NkStyleChart.nborder(address(), value); return this; }
        /** Sets the specified value to the {@code rounding} field. */
        public NkStyleChart.Buffer rounding(float value) { NkStyleChart.nrounding(address(), value); return this; }
        /** Copies the specified {@link NkVec2} to the {@code padding} field. */
        public NkStyleChart.Buffer padding(@NativeType("struct nk_vec2") NkVec2 value) { NkStyleChart.npadding(address(), value); return this; }
        /** Passes the {@code padding} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkStyleChart.Buffer padding(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(padding()); return this; }

    }

}