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
 * A structure representing a {@code COLR} v1 {@code PaintGlyph} paint table.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_PaintGlyph {
 *     {@link FT_OpaquePaint FT_OpaquePaintRec} paint;
 *     FT_UInt glyphID;
 * }</code></pre>
 */
public class FT_PaintGlyph extends Struct<FT_PaintGlyph> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PAINT,
        GLYPHID;

    static {
        Layout layout = __struct(
            __member(FT_OpaquePaint.SIZEOF, FT_OpaquePaint.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PAINT = layout.offsetof(0);
        GLYPHID = layout.offsetof(1);
    }

    protected FT_PaintGlyph(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_PaintGlyph create(long address, @Nullable ByteBuffer container) {
        return new FT_PaintGlyph(address, container);
    }

    /**
     * Creates a {@code FT_PaintGlyph} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_PaintGlyph(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link FT_OpaquePaint} view of the {@code paint} field. */
    @NativeType("FT_OpaquePaintRec")
    public FT_OpaquePaint paint() { return npaint(address()); }
    /** @return the value of the {@code glyphID} field. */
    @NativeType("FT_UInt")
    public int glyphID() { return nglyphID(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_PaintGlyph} instance for the specified memory address. */
    public static FT_PaintGlyph create(long address) {
        return new FT_PaintGlyph(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_PaintGlyph createSafe(long address) {
        return address == NULL ? null : new FT_PaintGlyph(address, null);
    }

    /**
     * Create a {@link FT_PaintGlyph.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_PaintGlyph.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_PaintGlyph.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #paint}. */
    public static FT_OpaquePaint npaint(long struct) { return FT_OpaquePaint.create(struct + FT_PaintGlyph.PAINT); }
    /** Unsafe version of {@link #glyphID}. */
    public static int nglyphID(long struct) { return UNSAFE.getInt(null, struct + FT_PaintGlyph.GLYPHID); }

    // -----------------------------------

    /** An array of {@link FT_PaintGlyph} structs. */
    public static class Buffer extends StructBuffer<FT_PaintGlyph, Buffer> {

        private static final FT_PaintGlyph ELEMENT_FACTORY = FT_PaintGlyph.create(-1L);

        /**
         * Creates a new {@code FT_PaintGlyph.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_PaintGlyph#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_PaintGlyph getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FT_OpaquePaint} view of the {@code paint} field. */
        @NativeType("FT_OpaquePaintRec")
        public FT_OpaquePaint paint() { return FT_PaintGlyph.npaint(address()); }
        /** @return the value of the {@code glyphID} field. */
        @NativeType("FT_UInt")
        public int glyphID() { return FT_PaintGlyph.nglyphID(address()); }

    }

}