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
 * A structure representing a {@code PaintSolid} value of the {@code COLR} v1 extensions.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_PaintSolid {
 *     {@link FT_ColorIndex FT_ColorIndex} color;
 * }</code></pre>
 */
public class FT_PaintSolid extends Struct<FT_PaintSolid> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        COLOR;

    static {
        Layout layout = __struct(
            __member(FT_ColorIndex.SIZEOF, FT_ColorIndex.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        COLOR = layout.offsetof(0);
    }

    protected FT_PaintSolid(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_PaintSolid create(long address, @Nullable ByteBuffer container) {
        return new FT_PaintSolid(address, container);
    }

    /**
     * Creates a {@code FT_PaintSolid} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_PaintSolid(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link FT_ColorIndex} view of the {@code color} field. */
    public FT_ColorIndex color() { return ncolor(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_PaintSolid} instance for the specified memory address. */
    public static FT_PaintSolid create(long address) {
        return new FT_PaintSolid(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_PaintSolid createSafe(long address) {
        return address == NULL ? null : new FT_PaintSolid(address, null);
    }

    /**
     * Create a {@link FT_PaintSolid.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_PaintSolid.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_PaintSolid.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #color}. */
    public static FT_ColorIndex ncolor(long struct) { return FT_ColorIndex.create(struct + FT_PaintSolid.COLOR); }

    // -----------------------------------

    /** An array of {@link FT_PaintSolid} structs. */
    public static class Buffer extends StructBuffer<FT_PaintSolid, Buffer> {

        private static final FT_PaintSolid ELEMENT_FACTORY = FT_PaintSolid.create(-1L);

        /**
         * Creates a new {@code FT_PaintSolid.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_PaintSolid#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_PaintSolid getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FT_ColorIndex} view of the {@code color} field. */
        public FT_ColorIndex color() { return FT_PaintSolid.ncolor(address()); }

    }

}