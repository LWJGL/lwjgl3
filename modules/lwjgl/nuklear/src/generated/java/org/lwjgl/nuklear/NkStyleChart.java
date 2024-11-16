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
 * struct nk_style_chart {
 *     {@link NkStyleItem struct nk_style_item} background;
 *     {@link NkColor struct nk_color} border_color;
 *     {@link NkColor struct nk_color} selected_color;
 *     {@link NkColor struct nk_color} color;
 *     float border;
 *     float rounding;
 *     {@link NkVec2 struct nk_vec2} padding;
 *     float color_factor;
 *     float disabled_factor;
 *     nk_bool show_markers;
 * }</code></pre>
 */
@NativeType("struct nk_style_chart")
public class NkStyleChart extends Struct<NkStyleChart> implements NativeResource {

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
        PADDING,
        COLOR_FACTOR,
        DISABLED_FACTOR,
        SHOW_MARKERS;

    static {
        Layout layout = __struct(
            __member(NkStyleItem.SIZEOF, NkStyleItem.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(NkColor.SIZEOF, NkColor.ALIGNOF),
            __member(4),
            __member(4),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
            __member(4),
            __member(4),
            __member(1)
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
        COLOR_FACTOR = layout.offsetof(7);
        DISABLED_FACTOR = layout.offsetof(8);
        SHOW_MARKERS = layout.offsetof(9);
    }

    protected NkStyleChart(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NkStyleChart create(long address, @Nullable ByteBuffer container) {
        return new NkStyleChart(address, container);
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

    /** @return a {@link NkStyleItem} view of the {@code background} field. */
    @NativeType("struct nk_style_item")
    public NkStyleItem background() { return nbackground(address()); }
    /** @return a {@link NkColor} view of the {@code border_color} field. */
    @NativeType("struct nk_color")
    public NkColor border_color() { return nborder_color(address()); }
    /** @return a {@link NkColor} view of the {@code selected_color} field. */
    @NativeType("struct nk_color")
    public NkColor selected_color() { return nselected_color(address()); }
    /** @return a {@link NkColor} view of the {@code color} field. */
    @NativeType("struct nk_color")
    public NkColor color() { return ncolor(address()); }
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
    /** @return the value of the {@code show_markers} field. */
    @NativeType("nk_bool")
    public boolean show_markers() { return nshow_markers(address()); }

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
    /** Sets the specified value to the {@code color_factor} field. */
    public NkStyleChart color_factor(float value) { ncolor_factor(address(), value); return this; }
    /** Sets the specified value to the {@code disabled_factor} field. */
    public NkStyleChart disabled_factor(float value) { ndisabled_factor(address(), value); return this; }
    /** Sets the specified value to the {@code show_markers} field. */
    public NkStyleChart show_markers(@NativeType("nk_bool") boolean value) { nshow_markers(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public NkStyleChart set(
        NkStyleItem background,
        NkColor border_color,
        NkColor selected_color,
        NkColor color,
        float border,
        float rounding,
        NkVec2 padding,
        float color_factor,
        float disabled_factor,
        boolean show_markers
    ) {
        background(background);
        border_color(border_color);
        selected_color(selected_color);
        color(color);
        border(border);
        rounding(rounding);
        padding(padding);
        color_factor(color_factor);
        disabled_factor(disabled_factor);
        show_markers(show_markers);

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
        return new NkStyleChart(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code NkStyleChart} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkStyleChart calloc() {
        return new NkStyleChart(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code NkStyleChart} instance allocated with {@link BufferUtils}. */
    public static NkStyleChart create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new NkStyleChart(memAddress(container), container);
    }

    /** Returns a new {@code NkStyleChart} instance for the specified memory address. */
    public static NkStyleChart create(long address) {
        return new NkStyleChart(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable NkStyleChart createSafe(long address) {
        return address == NULL ? null : new NkStyleChart(address, null);
    }

    /**
     * Returns a new {@link NkStyleChart.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleChart.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NkStyleChart.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleChart.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkStyleChart.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkStyleChart.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link NkStyleChart.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkStyleChart.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static NkStyleChart.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static NkStyleChart mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static NkStyleChart callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static NkStyleChart mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static NkStyleChart callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static NkStyleChart.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static NkStyleChart.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static NkStyleChart.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static NkStyleChart.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code NkStyleChart} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkStyleChart malloc(MemoryStack stack) {
        return new NkStyleChart(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code NkStyleChart} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkStyleChart calloc(MemoryStack stack) {
        return new NkStyleChart(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link NkStyleChart.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkStyleChart.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkStyleChart.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkStyleChart.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
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
    public static float nborder(long struct) { return memGetFloat(struct + NkStyleChart.BORDER); }
    /** Unsafe version of {@link #rounding}. */
    public static float nrounding(long struct) { return memGetFloat(struct + NkStyleChart.ROUNDING); }
    /** Unsafe version of {@link #padding}. */
    public static NkVec2 npadding(long struct) { return NkVec2.create(struct + NkStyleChart.PADDING); }
    /** Unsafe version of {@link #color_factor}. */
    public static float ncolor_factor(long struct) { return memGetFloat(struct + NkStyleChart.COLOR_FACTOR); }
    /** Unsafe version of {@link #disabled_factor}. */
    public static float ndisabled_factor(long struct) { return memGetFloat(struct + NkStyleChart.DISABLED_FACTOR); }
    /** Unsafe version of {@link #show_markers}. */
    public static boolean nshow_markers(long struct) { return memGetByte(struct + NkStyleChart.SHOW_MARKERS) != 0; }

    /** Unsafe version of {@link #background(NkStyleItem) background}. */
    public static void nbackground(long struct, NkStyleItem value) { memCopy(value.address(), struct + NkStyleChart.BACKGROUND, NkStyleItem.SIZEOF); }
    /** Unsafe version of {@link #border_color(NkColor) border_color}. */
    public static void nborder_color(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleChart.BORDER_COLOR, NkColor.SIZEOF); }
    /** Unsafe version of {@link #selected_color(NkColor) selected_color}. */
    public static void nselected_color(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleChart.SELECTED_COLOR, NkColor.SIZEOF); }
    /** Unsafe version of {@link #color(NkColor) color}. */
    public static void ncolor(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleChart.COLOR, NkColor.SIZEOF); }
    /** Unsafe version of {@link #border(float) border}. */
    public static void nborder(long struct, float value) { memPutFloat(struct + NkStyleChart.BORDER, value); }
    /** Unsafe version of {@link #rounding(float) rounding}. */
    public static void nrounding(long struct, float value) { memPutFloat(struct + NkStyleChart.ROUNDING, value); }
    /** Unsafe version of {@link #padding(NkVec2) padding}. */
    public static void npadding(long struct, NkVec2 value) { memCopy(value.address(), struct + NkStyleChart.PADDING, NkVec2.SIZEOF); }
    /** Unsafe version of {@link #color_factor(float) color_factor}. */
    public static void ncolor_factor(long struct, float value) { memPutFloat(struct + NkStyleChart.COLOR_FACTOR, value); }
    /** Unsafe version of {@link #disabled_factor(float) disabled_factor}. */
    public static void ndisabled_factor(long struct, float value) { memPutFloat(struct + NkStyleChart.DISABLED_FACTOR, value); }
    /** Unsafe version of {@link #show_markers(boolean) show_markers}. */
    public static void nshow_markers(long struct, boolean value) { memPutByte(struct + NkStyleChart.SHOW_MARKERS, value ? (byte)1 : (byte)0); }

    // -----------------------------------

    /** An array of {@link NkStyleChart} structs. */
    public static class Buffer extends StructBuffer<NkStyleChart, Buffer> implements NativeResource {

        private static final NkStyleChart ELEMENT_FACTORY = NkStyleChart.create(-1L);

        /**
         * Creates a new {@code NkStyleChart.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkStyleChart#SIZEOF}, and its mark will be undefined.</p>
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
        protected NkStyleChart getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link NkStyleItem} view of the {@code background} field. */
        @NativeType("struct nk_style_item")
        public NkStyleItem background() { return NkStyleChart.nbackground(address()); }
        /** @return a {@link NkColor} view of the {@code border_color} field. */
        @NativeType("struct nk_color")
        public NkColor border_color() { return NkStyleChart.nborder_color(address()); }
        /** @return a {@link NkColor} view of the {@code selected_color} field. */
        @NativeType("struct nk_color")
        public NkColor selected_color() { return NkStyleChart.nselected_color(address()); }
        /** @return a {@link NkColor} view of the {@code color} field. */
        @NativeType("struct nk_color")
        public NkColor color() { return NkStyleChart.ncolor(address()); }
        /** @return the value of the {@code border} field. */
        public float border() { return NkStyleChart.nborder(address()); }
        /** @return the value of the {@code rounding} field. */
        public float rounding() { return NkStyleChart.nrounding(address()); }
        /** @return a {@link NkVec2} view of the {@code padding} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 padding() { return NkStyleChart.npadding(address()); }
        /** @return the value of the {@code color_factor} field. */
        public float color_factor() { return NkStyleChart.ncolor_factor(address()); }
        /** @return the value of the {@code disabled_factor} field. */
        public float disabled_factor() { return NkStyleChart.ndisabled_factor(address()); }
        /** @return the value of the {@code show_markers} field. */
        @NativeType("nk_bool")
        public boolean show_markers() { return NkStyleChart.nshow_markers(address()); }

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
        /** Sets the specified value to the {@code color_factor} field. */
        public NkStyleChart.Buffer color_factor(float value) { NkStyleChart.ncolor_factor(address(), value); return this; }
        /** Sets the specified value to the {@code disabled_factor} field. */
        public NkStyleChart.Buffer disabled_factor(float value) { NkStyleChart.ndisabled_factor(address(), value); return this; }
        /** Sets the specified value to the {@code show_markers} field. */
        public NkStyleChart.Buffer show_markers(@NativeType("nk_bool") boolean value) { NkStyleChart.nshow_markers(address(), value); return this; }

    }

}