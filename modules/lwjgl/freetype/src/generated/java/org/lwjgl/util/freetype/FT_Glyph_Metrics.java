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
 * A structure to model the metrics of a single glyph.
 * 
 * <p>The values are expressed in 26.6 fractional pixel format; if the flag {@link FreeType#FT_LOAD_NO_SCALE LOAD_NO_SCALE} has been used while loading the glyph, values are expressed in
 * font units instead.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>If not disabled with {@link FreeType#FT_LOAD_NO_HINTING LOAD_NO_HINTING}, the values represent dimensions of the hinted glyph (in case hinting is applicable).</p></div>
 * 
 * <p>Stroking a glyph with an outside border does not increase {@code horiAdvance} or {@code vertAdvance}; you have to manually adjust these values to
 * account for the added width and height.</p>
 * 
 * <p>FreeType doesn't use the {@code VORG} table data for CFF fonts because it doesn't have an interface to quickly retrieve the glyph height. The
 * y~coordinate of the vertical origin can be simply computed as {@code vertBearingY + height} after loading a glyph.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_Glyph_Metrics {
 *     FT_Pos {@link #width};
 *     FT_Pos {@link #height};
 *     FT_Pos {@link #horiBearingX};
 *     FT_Pos {@link #horiBearingY};
 *     FT_Pos {@link #horiAdvance};
 *     FT_Pos {@link #vertBearingX};
 *     FT_Pos {@link #vertBearingY};
 *     FT_Pos {@link #vertAdvance};
 * }</code></pre>
 */
public class FT_Glyph_Metrics extends Struct<FT_Glyph_Metrics> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        WIDTH,
        HEIGHT,
        HORIBEARINGX,
        HORIBEARINGY,
        HORIADVANCE,
        VERTBEARINGX,
        VERTBEARINGY,
        VERTADVANCE;

    static {
        Layout layout = __struct(
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        WIDTH = layout.offsetof(0);
        HEIGHT = layout.offsetof(1);
        HORIBEARINGX = layout.offsetof(2);
        HORIBEARINGY = layout.offsetof(3);
        HORIADVANCE = layout.offsetof(4);
        VERTBEARINGX = layout.offsetof(5);
        VERTBEARINGY = layout.offsetof(6);
        VERTADVANCE = layout.offsetof(7);
    }

    protected FT_Glyph_Metrics(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_Glyph_Metrics create(long address, @Nullable ByteBuffer container) {
        return new FT_Glyph_Metrics(address, container);
    }

    /**
     * Creates a {@code FT_Glyph_Metrics} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_Glyph_Metrics(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the glyph's width */
    @NativeType("FT_Pos")
    public long width() { return nwidth(address()); }
    /** the glyph's height */
    @NativeType("FT_Pos")
    public long height() { return nheight(address()); }
    /** left side bearing for horizontal layout */
    @NativeType("FT_Pos")
    public long horiBearingX() { return nhoriBearingX(address()); }
    /** top side bearing for horizontal layout */
    @NativeType("FT_Pos")
    public long horiBearingY() { return nhoriBearingY(address()); }
    /** advance width for horizontal layout */
    @NativeType("FT_Pos")
    public long horiAdvance() { return nhoriAdvance(address()); }
    /** left side bearing for vertical layout */
    @NativeType("FT_Pos")
    public long vertBearingX() { return nvertBearingX(address()); }
    /** top side bearing for vertical layout. Larger positive values mean further below the vertical glyph origin */
    @NativeType("FT_Pos")
    public long vertBearingY() { return nvertBearingY(address()); }
    /** advance height for vertical layout. Positive values mean the glyph has a positive advance downward */
    @NativeType("FT_Pos")
    public long vertAdvance() { return nvertAdvance(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_Glyph_Metrics} instance for the specified memory address. */
    public static FT_Glyph_Metrics create(long address) {
        return new FT_Glyph_Metrics(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Glyph_Metrics createSafe(long address) {
        return address == NULL ? null : new FT_Glyph_Metrics(address, null);
    }

    /**
     * Create a {@link FT_Glyph_Metrics.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_Glyph_Metrics.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Glyph_Metrics.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #width}. */
    public static long nwidth(long struct) { return memGetCLong(struct + FT_Glyph_Metrics.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static long nheight(long struct) { return memGetCLong(struct + FT_Glyph_Metrics.HEIGHT); }
    /** Unsafe version of {@link #horiBearingX}. */
    public static long nhoriBearingX(long struct) { return memGetCLong(struct + FT_Glyph_Metrics.HORIBEARINGX); }
    /** Unsafe version of {@link #horiBearingY}. */
    public static long nhoriBearingY(long struct) { return memGetCLong(struct + FT_Glyph_Metrics.HORIBEARINGY); }
    /** Unsafe version of {@link #horiAdvance}. */
    public static long nhoriAdvance(long struct) { return memGetCLong(struct + FT_Glyph_Metrics.HORIADVANCE); }
    /** Unsafe version of {@link #vertBearingX}. */
    public static long nvertBearingX(long struct) { return memGetCLong(struct + FT_Glyph_Metrics.VERTBEARINGX); }
    /** Unsafe version of {@link #vertBearingY}. */
    public static long nvertBearingY(long struct) { return memGetCLong(struct + FT_Glyph_Metrics.VERTBEARINGY); }
    /** Unsafe version of {@link #vertAdvance}. */
    public static long nvertAdvance(long struct) { return memGetCLong(struct + FT_Glyph_Metrics.VERTADVANCE); }

    // -----------------------------------

    /** An array of {@link FT_Glyph_Metrics} structs. */
    public static class Buffer extends StructBuffer<FT_Glyph_Metrics, Buffer> {

        private static final FT_Glyph_Metrics ELEMENT_FACTORY = FT_Glyph_Metrics.create(-1L);

        /**
         * Creates a new {@code FT_Glyph_Metrics.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_Glyph_Metrics#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_Glyph_Metrics getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link FT_Glyph_Metrics#width} field. */
        @NativeType("FT_Pos")
        public long width() { return FT_Glyph_Metrics.nwidth(address()); }
        /** @return the value of the {@link FT_Glyph_Metrics#height} field. */
        @NativeType("FT_Pos")
        public long height() { return FT_Glyph_Metrics.nheight(address()); }
        /** @return the value of the {@link FT_Glyph_Metrics#horiBearingX} field. */
        @NativeType("FT_Pos")
        public long horiBearingX() { return FT_Glyph_Metrics.nhoriBearingX(address()); }
        /** @return the value of the {@link FT_Glyph_Metrics#horiBearingY} field. */
        @NativeType("FT_Pos")
        public long horiBearingY() { return FT_Glyph_Metrics.nhoriBearingY(address()); }
        /** @return the value of the {@link FT_Glyph_Metrics#horiAdvance} field. */
        @NativeType("FT_Pos")
        public long horiAdvance() { return FT_Glyph_Metrics.nhoriAdvance(address()); }
        /** @return the value of the {@link FT_Glyph_Metrics#vertBearingX} field. */
        @NativeType("FT_Pos")
        public long vertBearingX() { return FT_Glyph_Metrics.nvertBearingX(address()); }
        /** @return the value of the {@link FT_Glyph_Metrics#vertBearingY} field. */
        @NativeType("FT_Pos")
        public long vertBearingY() { return FT_Glyph_Metrics.nvertBearingY(address()); }
        /** @return the value of the {@link FT_Glyph_Metrics#vertAdvance} field. */
        @NativeType("FT_Pos")
        public long vertAdvance() { return FT_Glyph_Metrics.nvertAdvance(address()); }

    }

}