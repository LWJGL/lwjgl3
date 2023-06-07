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
 * This structure models the metrics of a bitmap strike (i.e., a set of glyphs for a given point size and resolution) in a bitmap font. It
 * is used for the {@code available_sizes} field of {@code FT_Face}.
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Windows FNT: The nominal size given in a FNT font is not reliable. If the driver finds it incorrect, it sets {@code size} to some calculated
 * values, and {@code x_ppem} and {@code y_ppem} to the pixel width and height given in the font, respectively.</p></div>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>TrueType embedded bitmaps: {@code size}, {@code width}, and {@code height} values are not contained in the bitmap strike itself. They are
 * computed from the global font parameters.</p></div>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_Bitmap_Size {
 *     FT_Short {@link #height};
 *     FT_Short {@link #width};
 *     FT_Pos {@link #size};
 *     FT_Pos {@link #x_ppem};
 *     FT_Pos {@link #y_ppem};
 * }</code></pre>
 */
public class FT_Bitmap_Size extends Struct<FT_Bitmap_Size> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HEIGHT,
        WIDTH,
        SIZE,
        X_PPEM,
        Y_PPEM;

    static {
        Layout layout = __struct(
            __member(2),
            __member(2),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HEIGHT = layout.offsetof(0);
        WIDTH = layout.offsetof(1);
        SIZE = layout.offsetof(2);
        X_PPEM = layout.offsetof(3);
        Y_PPEM = layout.offsetof(4);
    }

    protected FT_Bitmap_Size(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_Bitmap_Size create(long address, @Nullable ByteBuffer container) {
        return new FT_Bitmap_Size(address, container);
    }

    /**
     * Creates a {@code FT_Bitmap_Size} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_Bitmap_Size(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the vertical distance, in pixels, between two consecutive baselines. It is always positive. */
    @NativeType("FT_Short")
    public short height() { return nheight(address()); }
    /** the average width, in pixels, of all glyphs in the strike */
    @NativeType("FT_Short")
    public short width() { return nwidth(address()); }
    /** the nominal size of the strike in 26.6 fractional points. This field is not very useful. */
    @NativeType("FT_Pos")
    public long size() { return nsize(address()); }
    /** the horizontal ppem (nominal width) in 26.6 fractional pixels */
    @NativeType("FT_Pos")
    public long x_ppem() { return nx_ppem(address()); }
    /** the vertical ppem (nominal height) in 26.6 fractional pixels */
    @NativeType("FT_Pos")
    public long y_ppem() { return ny_ppem(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_Bitmap_Size} instance for the specified memory address. */
    public static FT_Bitmap_Size create(long address) {
        return new FT_Bitmap_Size(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Bitmap_Size createSafe(long address) {
        return address == NULL ? null : new FT_Bitmap_Size(address, null);
    }

    /**
     * Create a {@link FT_Bitmap_Size.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_Bitmap_Size.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Bitmap_Size.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #height}. */
    public static short nheight(long struct) { return UNSAFE.getShort(null, struct + FT_Bitmap_Size.HEIGHT); }
    /** Unsafe version of {@link #width}. */
    public static short nwidth(long struct) { return UNSAFE.getShort(null, struct + FT_Bitmap_Size.WIDTH); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetCLong(struct + FT_Bitmap_Size.SIZE); }
    /** Unsafe version of {@link #x_ppem}. */
    public static long nx_ppem(long struct) { return memGetCLong(struct + FT_Bitmap_Size.X_PPEM); }
    /** Unsafe version of {@link #y_ppem}. */
    public static long ny_ppem(long struct) { return memGetCLong(struct + FT_Bitmap_Size.Y_PPEM); }

    // -----------------------------------

    /** An array of {@link FT_Bitmap_Size} structs. */
    public static class Buffer extends StructBuffer<FT_Bitmap_Size, Buffer> {

        private static final FT_Bitmap_Size ELEMENT_FACTORY = FT_Bitmap_Size.create(-1L);

        /**
         * Creates a new {@code FT_Bitmap_Size.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_Bitmap_Size#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_Bitmap_Size getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link FT_Bitmap_Size#height} field. */
        @NativeType("FT_Short")
        public short height() { return FT_Bitmap_Size.nheight(address()); }
        /** @return the value of the {@link FT_Bitmap_Size#width} field. */
        @NativeType("FT_Short")
        public short width() { return FT_Bitmap_Size.nwidth(address()); }
        /** @return the value of the {@link FT_Bitmap_Size#size} field. */
        @NativeType("FT_Pos")
        public long size() { return FT_Bitmap_Size.nsize(address()); }
        /** @return the value of the {@link FT_Bitmap_Size#x_ppem} field. */
        @NativeType("FT_Pos")
        public long x_ppem() { return FT_Bitmap_Size.nx_ppem(address()); }
        /** @return the value of the {@link FT_Bitmap_Size#y_ppem} field. */
        @NativeType("FT_Pos")
        public long y_ppem() { return FT_Bitmap_Size.ny_ppem(address()); }

    }

}