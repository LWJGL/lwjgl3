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
 * A structure used for bitmap glyph images. This really is a 'sub-class' of {@link FT_Glyph}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_BitmapGlyphRec {
 *     {@link FT_Glyph FT_GlyphRec} root;
 *     FT_Int left;
 *     FT_Int top;
 *     {@link FT_Bitmap FT_Bitmap} bitmap;
 * }</code></pre>
 */
@NativeType("struct FT_BitmapGlyphRec")
public class FT_BitmapGlyph extends Struct<FT_BitmapGlyph> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ROOT,
        LEFT,
        TOP,
        BITMAP;

    static {
        Layout layout = __struct(
            __member(FT_Glyph.SIZEOF, FT_Glyph.ALIGNOF),
            __member(4),
            __member(4),
            __member(FT_Bitmap.SIZEOF, FT_Bitmap.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ROOT = layout.offsetof(0);
        LEFT = layout.offsetof(1);
        TOP = layout.offsetof(2);
        BITMAP = layout.offsetof(3);
    }

    protected FT_BitmapGlyph(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_BitmapGlyph create(long address, @Nullable ByteBuffer container) {
        return new FT_BitmapGlyph(address, container);
    }

    /**
     * Creates a {@code FT_BitmapGlyph} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_BitmapGlyph(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link FT_Glyph} view of the {@code root} field. */
    @NativeType("FT_GlyphRec")
    public FT_Glyph root() { return nroot(address()); }
    /** @return the value of the {@code left} field. */
    @NativeType("FT_Int")
    public int left() { return nleft(address()); }
    /** @return the value of the {@code top} field. */
    @NativeType("FT_Int")
    public int top() { return ntop(address()); }
    /** @return a {@link FT_Bitmap} view of the {@code bitmap} field. */
    public FT_Bitmap bitmap() { return nbitmap(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_BitmapGlyph} instance for the specified memory address. */
    public static FT_BitmapGlyph create(long address) {
        return new FT_BitmapGlyph(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_BitmapGlyph createSafe(long address) {
        return address == NULL ? null : new FT_BitmapGlyph(address, null);
    }

    /**
     * Create a {@link FT_BitmapGlyph.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_BitmapGlyph.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_BitmapGlyph.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #root}. */
    public static FT_Glyph nroot(long struct) { return FT_Glyph.create(struct + FT_BitmapGlyph.ROOT); }
    /** Unsafe version of {@link #left}. */
    public static int nleft(long struct) { return UNSAFE.getInt(null, struct + FT_BitmapGlyph.LEFT); }
    /** Unsafe version of {@link #top}. */
    public static int ntop(long struct) { return UNSAFE.getInt(null, struct + FT_BitmapGlyph.TOP); }
    /** Unsafe version of {@link #bitmap}. */
    public static FT_Bitmap nbitmap(long struct) { return FT_Bitmap.create(struct + FT_BitmapGlyph.BITMAP); }

    // -----------------------------------

    /** An array of {@link FT_BitmapGlyph} structs. */
    public static class Buffer extends StructBuffer<FT_BitmapGlyph, Buffer> {

        private static final FT_BitmapGlyph ELEMENT_FACTORY = FT_BitmapGlyph.create(-1L);

        /**
         * Creates a new {@code FT_BitmapGlyph.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_BitmapGlyph#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_BitmapGlyph getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FT_Glyph} view of the {@code root} field. */
        @NativeType("FT_GlyphRec")
        public FT_Glyph root() { return FT_BitmapGlyph.nroot(address()); }
        /** @return the value of the {@code left} field. */
        @NativeType("FT_Int")
        public int left() { return FT_BitmapGlyph.nleft(address()); }
        /** @return the value of the {@code top} field. */
        @NativeType("FT_Int")
        public int top() { return FT_BitmapGlyph.ntop(address()); }
        /** @return a {@link FT_Bitmap} view of the {@code bitmap} field. */
        public FT_Bitmap bitmap() { return FT_BitmapGlyph.nbitmap(address()); }

    }

}