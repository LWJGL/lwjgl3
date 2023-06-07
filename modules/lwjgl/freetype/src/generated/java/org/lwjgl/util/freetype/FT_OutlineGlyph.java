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
 * A structure used for outline (vectorial) glyph images. This really is a 'sub-class' of {@link FT_Glyph}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_OutlineGlyphRec {
 *     {@link FT_Glyph FT_GlyphRec} root;
 *     {@link FT_Outline FT_Outline} outline;
 * }</code></pre>
 */
@NativeType("struct FT_OutlineGlyphRec")
public class FT_OutlineGlyph extends Struct<FT_OutlineGlyph> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ROOT,
        OUTLINE;

    static {
        Layout layout = __struct(
            __member(FT_Glyph.SIZEOF, FT_Glyph.ALIGNOF),
            __member(FT_Outline.SIZEOF, FT_Outline.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ROOT = layout.offsetof(0);
        OUTLINE = layout.offsetof(1);
    }

    protected FT_OutlineGlyph(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_OutlineGlyph create(long address, @Nullable ByteBuffer container) {
        return new FT_OutlineGlyph(address, container);
    }

    /**
     * Creates a {@code FT_OutlineGlyph} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_OutlineGlyph(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link FT_Glyph} view of the {@code root} field. */
    @NativeType("FT_GlyphRec")
    public FT_Glyph root() { return nroot(address()); }
    /** @return a {@link FT_Outline} view of the {@code outline} field. */
    public FT_Outline outline() { return noutline(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_OutlineGlyph} instance for the specified memory address. */
    public static FT_OutlineGlyph create(long address) {
        return new FT_OutlineGlyph(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_OutlineGlyph createSafe(long address) {
        return address == NULL ? null : new FT_OutlineGlyph(address, null);
    }

    /**
     * Create a {@link FT_OutlineGlyph.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_OutlineGlyph.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_OutlineGlyph.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #root}. */
    public static FT_Glyph nroot(long struct) { return FT_Glyph.create(struct + FT_OutlineGlyph.ROOT); }
    /** Unsafe version of {@link #outline}. */
    public static FT_Outline noutline(long struct) { return FT_Outline.create(struct + FT_OutlineGlyph.OUTLINE); }

    // -----------------------------------

    /** An array of {@link FT_OutlineGlyph} structs. */
    public static class Buffer extends StructBuffer<FT_OutlineGlyph, Buffer> {

        private static final FT_OutlineGlyph ELEMENT_FACTORY = FT_OutlineGlyph.create(-1L);

        /**
         * Creates a new {@code FT_OutlineGlyph.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_OutlineGlyph#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_OutlineGlyph getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FT_Glyph} view of the {@code root} field. */
        @NativeType("FT_GlyphRec")
        public FT_Glyph root() { return FT_OutlineGlyph.nroot(address()); }
        /** @return a {@link FT_Outline} view of the {@code outline} field. */
        public FT_Outline outline() { return FT_OutlineGlyph.noutline(address()); }

    }

}