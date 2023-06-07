/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.harfbuzz;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Pairs of glyph and color index.
 * 
 * <p>A color index of 0xFFFF does not refer to a palette color, but indicates that the foreground color should be used.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct hb_ot_color_layer_t {
 *     hb_codepoint_t {@link #glyph};
 *     unsigned int {@link #color_index};
 * }</code></pre>
 */
public class hb_ot_color_layer_t extends Struct<hb_ot_color_layer_t> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        GLYPH,
        COLOR_INDEX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        GLYPH = layout.offsetof(0);
        COLOR_INDEX = layout.offsetof(1);
    }

    protected hb_ot_color_layer_t(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected hb_ot_color_layer_t create(long address, @Nullable ByteBuffer container) {
        return new hb_ot_color_layer_t(address, container);
    }

    /**
     * Creates a {@code hb_ot_color_layer_t} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public hb_ot_color_layer_t(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the glyph ID of the layer */
    @NativeType("hb_codepoint_t")
    public int glyph() { return nglyph(address()); }
    /** the palette color index of the layer */
    @NativeType("unsigned int")
    public int color_index() { return ncolor_index(address()); }

    /** Sets the specified value to the {@link #glyph} field. */
    public hb_ot_color_layer_t glyph(@NativeType("hb_codepoint_t") int value) { nglyph(address(), value); return this; }
    /** Sets the specified value to the {@link #color_index} field. */
    public hb_ot_color_layer_t color_index(@NativeType("unsigned int") int value) { ncolor_index(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public hb_ot_color_layer_t set(
        int glyph,
        int color_index
    ) {
        glyph(glyph);
        color_index(color_index);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public hb_ot_color_layer_t set(hb_ot_color_layer_t src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code hb_ot_color_layer_t} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static hb_ot_color_layer_t malloc() {
        return new hb_ot_color_layer_t(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code hb_ot_color_layer_t} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static hb_ot_color_layer_t calloc() {
        return new hb_ot_color_layer_t(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code hb_ot_color_layer_t} instance allocated with {@link BufferUtils}. */
    public static hb_ot_color_layer_t create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new hb_ot_color_layer_t(memAddress(container), container);
    }

    /** Returns a new {@code hb_ot_color_layer_t} instance for the specified memory address. */
    public static hb_ot_color_layer_t create(long address) {
        return new hb_ot_color_layer_t(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hb_ot_color_layer_t createSafe(long address) {
        return address == NULL ? null : new hb_ot_color_layer_t(address, null);
    }

    /**
     * Returns a new {@link hb_ot_color_layer_t.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hb_ot_color_layer_t.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link hb_ot_color_layer_t.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hb_ot_color_layer_t.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hb_ot_color_layer_t.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static hb_ot_color_layer_t.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link hb_ot_color_layer_t.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static hb_ot_color_layer_t.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hb_ot_color_layer_t.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code hb_ot_color_layer_t} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static hb_ot_color_layer_t malloc(MemoryStack stack) {
        return new hb_ot_color_layer_t(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code hb_ot_color_layer_t} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static hb_ot_color_layer_t calloc(MemoryStack stack) {
        return new hb_ot_color_layer_t(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link hb_ot_color_layer_t.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hb_ot_color_layer_t.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hb_ot_color_layer_t.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hb_ot_color_layer_t.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #glyph}. */
    public static int nglyph(long struct) { return UNSAFE.getInt(null, struct + hb_ot_color_layer_t.GLYPH); }
    /** Unsafe version of {@link #color_index}. */
    public static int ncolor_index(long struct) { return UNSAFE.getInt(null, struct + hb_ot_color_layer_t.COLOR_INDEX); }

    /** Unsafe version of {@link #glyph(int) glyph}. */
    public static void nglyph(long struct, int value) { UNSAFE.putInt(null, struct + hb_ot_color_layer_t.GLYPH, value); }
    /** Unsafe version of {@link #color_index(int) color_index}. */
    public static void ncolor_index(long struct, int value) { UNSAFE.putInt(null, struct + hb_ot_color_layer_t.COLOR_INDEX, value); }

    // -----------------------------------

    /** An array of {@link hb_ot_color_layer_t} structs. */
    public static class Buffer extends StructBuffer<hb_ot_color_layer_t, Buffer> implements NativeResource {

        private static final hb_ot_color_layer_t ELEMENT_FACTORY = hb_ot_color_layer_t.create(-1L);

        /**
         * Creates a new {@code hb_ot_color_layer_t.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link hb_ot_color_layer_t#SIZEOF}, and its mark will be undefined.</p>
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
        protected hb_ot_color_layer_t getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link hb_ot_color_layer_t#glyph} field. */
        @NativeType("hb_codepoint_t")
        public int glyph() { return hb_ot_color_layer_t.nglyph(address()); }
        /** @return the value of the {@link hb_ot_color_layer_t#color_index} field. */
        @NativeType("unsigned int")
        public int color_index() { return hb_ot_color_layer_t.ncolor_index(address()); }

        /** Sets the specified value to the {@link hb_ot_color_layer_t#glyph} field. */
        public hb_ot_color_layer_t.Buffer glyph(@NativeType("hb_codepoint_t") int value) { hb_ot_color_layer_t.nglyph(address(), value); return this; }
        /** Sets the specified value to the {@link hb_ot_color_layer_t#color_index} field. */
        public hb_ot_color_layer_t.Buffer color_index(@NativeType("unsigned int") int value) { hb_ot_color_layer_t.ncolor_index(address(), value); return this; }

    }

}