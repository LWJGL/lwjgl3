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
 * A structure used for OT-SVG glyphs. This is a 'sub-class' of {@link FT_Glyph}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_SvgGlyphRec {
 *     {@link FT_Glyph FT_GlyphRec} root;
 *     FT_Byte * svg_document;
 *     FT_ULong svg_document_length;
 *     FT_UInt glyph_index;
 *     {@link FT_Size_Metrics FT_Size_Metrics} metrics;
 *     FT_UShort units_per_EM;
 *     FT_UShort start_glyph_id;
 *     FT_UShort end_glyph_id;
 *     {@link FT_Matrix FT_Matrix} transform;
 *     {@link FT_Vector FT_Vector} delta;
 * }</code></pre>
 */
@NativeType("struct FT_SvgGlyphRec")
public class FT_SvgGlyph extends Struct<FT_SvgGlyph> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ROOT,
        SVG_DOCUMENT,
        SVG_DOCUMENT_LENGTH,
        GLYPH_INDEX,
        METRICS,
        UNITS_PER_EM,
        START_GLYPH_ID,
        END_GLYPH_ID,
        TRANSFORM,
        DELTA;

    static {
        Layout layout = __struct(
            __member(FT_Glyph.SIZEOF, FT_Glyph.ALIGNOF),
            __member(POINTER_SIZE),
            __member(CLONG_SIZE),
            __member(4),
            __member(FT_Size_Metrics.SIZEOF, FT_Size_Metrics.ALIGNOF),
            __member(2),
            __member(2),
            __member(2),
            __member(FT_Matrix.SIZEOF, FT_Matrix.ALIGNOF),
            __member(FT_Vector.SIZEOF, FT_Vector.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ROOT = layout.offsetof(0);
        SVG_DOCUMENT = layout.offsetof(1);
        SVG_DOCUMENT_LENGTH = layout.offsetof(2);
        GLYPH_INDEX = layout.offsetof(3);
        METRICS = layout.offsetof(4);
        UNITS_PER_EM = layout.offsetof(5);
        START_GLYPH_ID = layout.offsetof(6);
        END_GLYPH_ID = layout.offsetof(7);
        TRANSFORM = layout.offsetof(8);
        DELTA = layout.offsetof(9);
    }

    protected FT_SvgGlyph(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_SvgGlyph create(long address, @Nullable ByteBuffer container) {
        return new FT_SvgGlyph(address, container);
    }

    /**
     * Creates a {@code FT_SvgGlyph} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_SvgGlyph(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link FT_Glyph} view of the {@code root} field. */
    @NativeType("FT_GlyphRec")
    public FT_Glyph root() { return nroot(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code svg_document} field. */
    @NativeType("FT_Byte *")
    public ByteBuffer svg_document() { return nsvg_document(address()); }
    /** @return the value of the {@code svg_document_length} field. */
    @NativeType("FT_ULong")
    public long svg_document_length() { return nsvg_document_length(address()); }
    /** @return the value of the {@code glyph_index} field. */
    @NativeType("FT_UInt")
    public int glyph_index() { return nglyph_index(address()); }
    /** @return a {@link FT_Size_Metrics} view of the {@code metrics} field. */
    public FT_Size_Metrics metrics() { return nmetrics(address()); }
    /** @return the value of the {@code units_per_EM} field. */
    @NativeType("FT_UShort")
    public short units_per_EM() { return nunits_per_EM(address()); }
    /** @return the value of the {@code start_glyph_id} field. */
    @NativeType("FT_UShort")
    public short start_glyph_id() { return nstart_glyph_id(address()); }
    /** @return the value of the {@code end_glyph_id} field. */
    @NativeType("FT_UShort")
    public short end_glyph_id() { return nend_glyph_id(address()); }
    /** @return a {@link FT_Matrix} view of the {@code transform} field. */
    public FT_Matrix transform() { return ntransform(address()); }
    /** @return a {@link FT_Vector} view of the {@code delta} field. */
    public FT_Vector delta() { return ndelta(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_SvgGlyph} instance for the specified memory address. */
    public static FT_SvgGlyph create(long address) {
        return new FT_SvgGlyph(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_SvgGlyph createSafe(long address) {
        return address == NULL ? null : new FT_SvgGlyph(address, null);
    }

    /**
     * Create a {@link FT_SvgGlyph.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_SvgGlyph.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_SvgGlyph.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #root}. */
    public static FT_Glyph nroot(long struct) { return FT_Glyph.create(struct + FT_SvgGlyph.ROOT); }
    /** Unsafe version of {@link #svg_document() svg_document}. */
    public static ByteBuffer nsvg_document(long struct) { return memByteBuffer(memGetAddress(struct + FT_SvgGlyph.SVG_DOCUMENT), (int)nsvg_document_length(struct)); }
    /** Unsafe version of {@link #svg_document_length}. */
    public static long nsvg_document_length(long struct) { return memGetCLong(struct + FT_SvgGlyph.SVG_DOCUMENT_LENGTH); }
    /** Unsafe version of {@link #glyph_index}. */
    public static int nglyph_index(long struct) { return UNSAFE.getInt(null, struct + FT_SvgGlyph.GLYPH_INDEX); }
    /** Unsafe version of {@link #metrics}. */
    public static FT_Size_Metrics nmetrics(long struct) { return FT_Size_Metrics.create(struct + FT_SvgGlyph.METRICS); }
    /** Unsafe version of {@link #units_per_EM}. */
    public static short nunits_per_EM(long struct) { return UNSAFE.getShort(null, struct + FT_SvgGlyph.UNITS_PER_EM); }
    /** Unsafe version of {@link #start_glyph_id}. */
    public static short nstart_glyph_id(long struct) { return UNSAFE.getShort(null, struct + FT_SvgGlyph.START_GLYPH_ID); }
    /** Unsafe version of {@link #end_glyph_id}. */
    public static short nend_glyph_id(long struct) { return UNSAFE.getShort(null, struct + FT_SvgGlyph.END_GLYPH_ID); }
    /** Unsafe version of {@link #transform}. */
    public static FT_Matrix ntransform(long struct) { return FT_Matrix.create(struct + FT_SvgGlyph.TRANSFORM); }
    /** Unsafe version of {@link #delta}. */
    public static FT_Vector ndelta(long struct) { return FT_Vector.create(struct + FT_SvgGlyph.DELTA); }

    // -----------------------------------

    /** An array of {@link FT_SvgGlyph} structs. */
    public static class Buffer extends StructBuffer<FT_SvgGlyph, Buffer> {

        private static final FT_SvgGlyph ELEMENT_FACTORY = FT_SvgGlyph.create(-1L);

        /**
         * Creates a new {@code FT_SvgGlyph.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_SvgGlyph#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_SvgGlyph getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FT_Glyph} view of the {@code root} field. */
        @NativeType("FT_GlyphRec")
        public FT_Glyph root() { return FT_SvgGlyph.nroot(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code svg_document} field. */
        @NativeType("FT_Byte *")
        public ByteBuffer svg_document() { return FT_SvgGlyph.nsvg_document(address()); }
        /** @return the value of the {@code svg_document_length} field. */
        @NativeType("FT_ULong")
        public long svg_document_length() { return FT_SvgGlyph.nsvg_document_length(address()); }
        /** @return the value of the {@code glyph_index} field. */
        @NativeType("FT_UInt")
        public int glyph_index() { return FT_SvgGlyph.nglyph_index(address()); }
        /** @return a {@link FT_Size_Metrics} view of the {@code metrics} field. */
        public FT_Size_Metrics metrics() { return FT_SvgGlyph.nmetrics(address()); }
        /** @return the value of the {@code units_per_EM} field. */
        @NativeType("FT_UShort")
        public short units_per_EM() { return FT_SvgGlyph.nunits_per_EM(address()); }
        /** @return the value of the {@code start_glyph_id} field. */
        @NativeType("FT_UShort")
        public short start_glyph_id() { return FT_SvgGlyph.nstart_glyph_id(address()); }
        /** @return the value of the {@code end_glyph_id} field. */
        @NativeType("FT_UShort")
        public short end_glyph_id() { return FT_SvgGlyph.nend_glyph_id(address()); }
        /** @return a {@link FT_Matrix} view of the {@code transform} field. */
        public FT_Matrix transform() { return FT_SvgGlyph.ntransform(address()); }
        /** @return a {@link FT_Vector} view of the {@code delta} field. */
        public FT_Vector delta() { return FT_SvgGlyph.ndelta(address()); }

    }

}