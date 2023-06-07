/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * A structure representing a {@code PaintColrLayers} table of a {@code COLR} v1 font.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_PaintColrLayers {
 *     {@link FT_LayerIterator FT_LayerIterator} layer_iterator;
 * }</code></pre>
 */
public class FT_PaintColrLayers extends Struct<FT_PaintColrLayers> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LAYER_ITERATOR;

    static {
        Layout layout = __struct(
            __member(FT_LayerIterator.SIZEOF, FT_LayerIterator.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LAYER_ITERATOR = layout.offsetof(0);
    }

    protected FT_PaintColrLayers(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_PaintColrLayers create(long address, @Nullable ByteBuffer container) {
        return new FT_PaintColrLayers(address, container);
    }

    /**
     * Creates a {@code FT_PaintColrLayers} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_PaintColrLayers(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link FT_LayerIterator} view of the {@code layer_iterator} field. */
    public FT_LayerIterator layer_iterator() { return nlayer_iterator(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_PaintColrLayers} instance for the specified memory address. */
    public static FT_PaintColrLayers create(long address) {
        return new FT_PaintColrLayers(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_PaintColrLayers createSafe(long address) {
        return address == NULL ? null : new FT_PaintColrLayers(address, null);
    }

    /**
     * Create a {@link FT_PaintColrLayers.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_PaintColrLayers.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_PaintColrLayers.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #layer_iterator}. */
    public static FT_LayerIterator nlayer_iterator(long struct) { return FT_LayerIterator.create(struct + FT_PaintColrLayers.LAYER_ITERATOR); }

    // -----------------------------------

    /** An array of {@link FT_PaintColrLayers} structs. */
    public static class Buffer extends StructBuffer<FT_PaintColrLayers, Buffer> {

        private static final FT_PaintColrLayers ELEMENT_FACTORY = FT_PaintColrLayers.create(-1L);

        /**
         * Creates a new {@code FT_PaintColrLayers.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_PaintColrLayers#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_PaintColrLayers getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FT_LayerIterator} view of the {@code layer_iterator} field. */
        public FT_LayerIterator layer_iterator() { return FT_PaintColrLayers.nlayer_iterator(address()); }

    }

}