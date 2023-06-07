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
 * FreeType root glyph slot class structure. A glyph slot is a container where individual glyphs can be loaded, be they in outline or bitmap format.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_GlyphSlotRec {
 *     FT_Library library;
 *     {@link FT_Face FT_Face} face;
 *     {@link FT_GlyphSlot FT_GlyphSlot} next;
 *     FT_UInt glyph_index;
 *     {@link FT_Generic FT_Generic} generic;
 *     {@link FT_Glyph_Metrics FT_Glyph_Metrics} metrics;
 *     FT_Fixed linearHoriAdvance;
 *     FT_Fixed linearVertAdvance;
 *     {@link FT_Vector FT_Vector} advance;
 *     FT_Glyph_Format format;
 *     {@link FT_Bitmap FT_Bitmap} bitmap;
 *     FT_Int bitmap_left;
 *     FT_Int bitmap_top;
 *     {@link FT_Outline FT_Outline} outline;
 *     FT_UInt num_subglyphs;
 *     FT_SubGlyph subglyphs;
 *     void * control_data;
 *     long control_len;
 *     FT_Pos lsb_delta;
 *     FT_Pos rsb_delta;
 *     void * other;
 *     FT_Slot_Internal internal;
 * }</code></pre>
 */
@NativeType("struct FT_GlyphSlotRec")
public class FT_GlyphSlot extends Struct<FT_GlyphSlot> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LIBRARY,
        FACE,
        NEXT,
        GLYPH_INDEX,
        GENERIC,
        METRICS,
        LINEARHORIADVANCE,
        LINEARVERTADVANCE,
        ADVANCE,
        FORMAT,
        BITMAP,
        BITMAP_LEFT,
        BITMAP_TOP,
        OUTLINE,
        NUM_SUBGLYPHS,
        SUBGLYPHS,
        CONTROL_DATA,
        CONTROL_LEN,
        LSB_DELTA,
        RSB_DELTA,
        OTHER,
        INTERNAL;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(FT_Generic.SIZEOF, FT_Generic.ALIGNOF),
            __member(FT_Glyph_Metrics.SIZEOF, FT_Glyph_Metrics.ALIGNOF),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(FT_Vector.SIZEOF, FT_Vector.ALIGNOF),
            __member(4),
            __member(FT_Bitmap.SIZEOF, FT_Bitmap.ALIGNOF),
            __member(4),
            __member(4),
            __member(FT_Outline.SIZEOF, FT_Outline.ALIGNOF),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LIBRARY = layout.offsetof(0);
        FACE = layout.offsetof(1);
        NEXT = layout.offsetof(2);
        GLYPH_INDEX = layout.offsetof(3);
        GENERIC = layout.offsetof(4);
        METRICS = layout.offsetof(5);
        LINEARHORIADVANCE = layout.offsetof(6);
        LINEARVERTADVANCE = layout.offsetof(7);
        ADVANCE = layout.offsetof(8);
        FORMAT = layout.offsetof(9);
        BITMAP = layout.offsetof(10);
        BITMAP_LEFT = layout.offsetof(11);
        BITMAP_TOP = layout.offsetof(12);
        OUTLINE = layout.offsetof(13);
        NUM_SUBGLYPHS = layout.offsetof(14);
        SUBGLYPHS = layout.offsetof(15);
        CONTROL_DATA = layout.offsetof(16);
        CONTROL_LEN = layout.offsetof(17);
        LSB_DELTA = layout.offsetof(18);
        RSB_DELTA = layout.offsetof(19);
        OTHER = layout.offsetof(20);
        INTERNAL = layout.offsetof(21);
    }

    protected FT_GlyphSlot(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_GlyphSlot create(long address, @Nullable ByteBuffer container) {
        return new FT_GlyphSlot(address, container);
    }

    /**
     * Creates a {@code FT_GlyphSlot} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_GlyphSlot(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code library} field. */
    @NativeType("FT_Library")
    public long library() { return nlibrary(address()); }
    /** @return a {@link FT_Face} view of the struct pointed to by the {@code face} field. */
    public FT_Face face() { return nface(address()); }
    /** @return a {@link FT_GlyphSlot} view of the struct pointed to by the {@code next} field. */
    @Nullable
    public FT_GlyphSlot next() { return nnext(address()); }
    /** @return the value of the {@code glyph_index} field. */
    @NativeType("FT_UInt")
    public int glyph_index() { return nglyph_index(address()); }
    /** @return a {@link FT_Generic} view of the {@code generic} field. */
    public FT_Generic generic() { return ngeneric(address()); }
    /** @return a {@link FT_Glyph_Metrics} view of the {@code metrics} field. */
    public FT_Glyph_Metrics metrics() { return nmetrics(address()); }
    /** @return the value of the {@code linearHoriAdvance} field. */
    @NativeType("FT_Fixed")
    public long linearHoriAdvance() { return nlinearHoriAdvance(address()); }
    /** @return the value of the {@code linearVertAdvance} field. */
    @NativeType("FT_Fixed")
    public long linearVertAdvance() { return nlinearVertAdvance(address()); }
    /** @return a {@link FT_Vector} view of the {@code advance} field. */
    public FT_Vector advance() { return nadvance(address()); }
    /** @return the value of the {@code format} field. */
    @NativeType("FT_Glyph_Format")
    public int format() { return nformat(address()); }
    /** @return a {@link FT_Bitmap} view of the {@code bitmap} field. */
    public FT_Bitmap bitmap() { return nbitmap(address()); }
    /** @return the value of the {@code bitmap_left} field. */
    @NativeType("FT_Int")
    public int bitmap_left() { return nbitmap_left(address()); }
    /** @return the value of the {@code bitmap_top} field. */
    @NativeType("FT_Int")
    public int bitmap_top() { return nbitmap_top(address()); }
    /** @return a {@link FT_Outline} view of the {@code outline} field. */
    public FT_Outline outline() { return noutline(address()); }
    /** @return the value of the {@code lsb_delta} field. */
    @NativeType("FT_Pos")
    public long lsb_delta() { return nlsb_delta(address()); }
    /** @return the value of the {@code rsb_delta} field. */
    @NativeType("FT_Pos")
    public long rsb_delta() { return nrsb_delta(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_GlyphSlot} instance for the specified memory address. */
    public static FT_GlyphSlot create(long address) {
        return new FT_GlyphSlot(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_GlyphSlot createSafe(long address) {
        return address == NULL ? null : new FT_GlyphSlot(address, null);
    }

    /**
     * Create a {@link FT_GlyphSlot.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_GlyphSlot.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_GlyphSlot.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #library}. */
    public static long nlibrary(long struct) { return memGetAddress(struct + FT_GlyphSlot.LIBRARY); }
    /** Unsafe version of {@link #face}. */
    public static FT_Face nface(long struct) { return FT_Face.create(memGetAddress(struct + FT_GlyphSlot.FACE)); }
    /** Unsafe version of {@link #next}. */
    @Nullable public static FT_GlyphSlot nnext(long struct) { return FT_GlyphSlot.createSafe(memGetAddress(struct + FT_GlyphSlot.NEXT)); }
    /** Unsafe version of {@link #glyph_index}. */
    public static int nglyph_index(long struct) { return UNSAFE.getInt(null, struct + FT_GlyphSlot.GLYPH_INDEX); }
    /** Unsafe version of {@link #generic}. */
    public static FT_Generic ngeneric(long struct) { return FT_Generic.create(struct + FT_GlyphSlot.GENERIC); }
    /** Unsafe version of {@link #metrics}. */
    public static FT_Glyph_Metrics nmetrics(long struct) { return FT_Glyph_Metrics.create(struct + FT_GlyphSlot.METRICS); }
    /** Unsafe version of {@link #linearHoriAdvance}. */
    public static long nlinearHoriAdvance(long struct) { return memGetCLong(struct + FT_GlyphSlot.LINEARHORIADVANCE); }
    /** Unsafe version of {@link #linearVertAdvance}. */
    public static long nlinearVertAdvance(long struct) { return memGetCLong(struct + FT_GlyphSlot.LINEARVERTADVANCE); }
    /** Unsafe version of {@link #advance}. */
    public static FT_Vector nadvance(long struct) { return FT_Vector.create(struct + FT_GlyphSlot.ADVANCE); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return UNSAFE.getInt(null, struct + FT_GlyphSlot.FORMAT); }
    /** Unsafe version of {@link #bitmap}. */
    public static FT_Bitmap nbitmap(long struct) { return FT_Bitmap.create(struct + FT_GlyphSlot.BITMAP); }
    /** Unsafe version of {@link #bitmap_left}. */
    public static int nbitmap_left(long struct) { return UNSAFE.getInt(null, struct + FT_GlyphSlot.BITMAP_LEFT); }
    /** Unsafe version of {@link #bitmap_top}. */
    public static int nbitmap_top(long struct) { return UNSAFE.getInt(null, struct + FT_GlyphSlot.BITMAP_TOP); }
    /** Unsafe version of {@link #outline}. */
    public static FT_Outline noutline(long struct) { return FT_Outline.create(struct + FT_GlyphSlot.OUTLINE); }
    public static int nnum_subglyphs(long struct) { return UNSAFE.getInt(null, struct + FT_GlyphSlot.NUM_SUBGLYPHS); }
    public static long nsubglyphs(long struct) { return memGetAddress(struct + FT_GlyphSlot.SUBGLYPHS); }
    @Nullable public static ByteBuffer ncontrol_data(long struct) { return memByteBufferSafe(memGetAddress(struct + FT_GlyphSlot.CONTROL_DATA), (int)ncontrol_len(struct)); }
    public static long ncontrol_len(long struct) { return memGetCLong(struct + FT_GlyphSlot.CONTROL_LEN); }
    /** Unsafe version of {@link #lsb_delta}. */
    public static long nlsb_delta(long struct) { return memGetCLong(struct + FT_GlyphSlot.LSB_DELTA); }
    /** Unsafe version of {@link #rsb_delta}. */
    public static long nrsb_delta(long struct) { return memGetCLong(struct + FT_GlyphSlot.RSB_DELTA); }
    public static long nother(long struct) { return memGetAddress(struct + FT_GlyphSlot.OTHER); }
    public static long ninternal(long struct) { return memGetAddress(struct + FT_GlyphSlot.INTERNAL); }

    // -----------------------------------

    /** An array of {@link FT_GlyphSlot} structs. */
    public static class Buffer extends StructBuffer<FT_GlyphSlot, Buffer> {

        private static final FT_GlyphSlot ELEMENT_FACTORY = FT_GlyphSlot.create(-1L);

        /**
         * Creates a new {@code FT_GlyphSlot.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_GlyphSlot#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_GlyphSlot getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code library} field. */
        @NativeType("FT_Library")
        public long library() { return FT_GlyphSlot.nlibrary(address()); }
        /** @return a {@link FT_Face} view of the struct pointed to by the {@code face} field. */
        public FT_Face face() { return FT_GlyphSlot.nface(address()); }
        /** @return a {@link FT_GlyphSlot} view of the struct pointed to by the {@code next} field. */
        @Nullable
        public FT_GlyphSlot next() { return FT_GlyphSlot.nnext(address()); }
        /** @return the value of the {@code glyph_index} field. */
        @NativeType("FT_UInt")
        public int glyph_index() { return FT_GlyphSlot.nglyph_index(address()); }
        /** @return a {@link FT_Generic} view of the {@code generic} field. */
        public FT_Generic generic() { return FT_GlyphSlot.ngeneric(address()); }
        /** @return a {@link FT_Glyph_Metrics} view of the {@code metrics} field. */
        public FT_Glyph_Metrics metrics() { return FT_GlyphSlot.nmetrics(address()); }
        /** @return the value of the {@code linearHoriAdvance} field. */
        @NativeType("FT_Fixed")
        public long linearHoriAdvance() { return FT_GlyphSlot.nlinearHoriAdvance(address()); }
        /** @return the value of the {@code linearVertAdvance} field. */
        @NativeType("FT_Fixed")
        public long linearVertAdvance() { return FT_GlyphSlot.nlinearVertAdvance(address()); }
        /** @return a {@link FT_Vector} view of the {@code advance} field. */
        public FT_Vector advance() { return FT_GlyphSlot.nadvance(address()); }
        /** @return the value of the {@code format} field. */
        @NativeType("FT_Glyph_Format")
        public int format() { return FT_GlyphSlot.nformat(address()); }
        /** @return a {@link FT_Bitmap} view of the {@code bitmap} field. */
        public FT_Bitmap bitmap() { return FT_GlyphSlot.nbitmap(address()); }
        /** @return the value of the {@code bitmap_left} field. */
        @NativeType("FT_Int")
        public int bitmap_left() { return FT_GlyphSlot.nbitmap_left(address()); }
        /** @return the value of the {@code bitmap_top} field. */
        @NativeType("FT_Int")
        public int bitmap_top() { return FT_GlyphSlot.nbitmap_top(address()); }
        /** @return a {@link FT_Outline} view of the {@code outline} field. */
        public FT_Outline outline() { return FT_GlyphSlot.noutline(address()); }
        /** @return the value of the {@code lsb_delta} field. */
        @NativeType("FT_Pos")
        public long lsb_delta() { return FT_GlyphSlot.nlsb_delta(address()); }
        /** @return the value of the {@code rsb_delta} field. */
        @NativeType("FT_Pos")
        public long rsb_delta() { return FT_GlyphSlot.nrsb_delta(address()); }

    }

}