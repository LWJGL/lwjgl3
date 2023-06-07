/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * FreeType root face class structure. A face object models a typeface in a font file.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_FaceRec {
 *     FT_Long num_faces;
 *     FT_Long face_index;
 *     FT_Long face_flags;
 *     FT_Long style_flags;
 *     FT_Long num_glyphs;
 *     FT_String * family_name;
 *     FT_String * style_name;
 *     FT_Int num_fixed_sizes;
 *     {@link FT_Bitmap_Size FT_Bitmap_Size} * available_sizes;
 *     FT_Int num_charmaps;
 *     {@link FT_CharMap FT_CharMap} * charmaps;
 *     {@link FT_Generic FT_Generic} generic;
 *     {@link FT_BBox FT_BBox} bbox;
 *     FT_UShort units_per_EM;
 *     FT_Short ascender;
 *     FT_Short descender;
 *     FT_Short height;
 *     FT_Short max_advance_width;
 *     FT_Short max_advance_height;
 *     FT_Short underline_position;
 *     FT_Short underline_thickness;
 *     {@link FT_GlyphSlot FT_GlyphSlot} glyph;
 *     {@link FT_Size FT_Size} size;
 *     {@link FT_CharMap FT_CharMap} charmap;
 *     FT_Driver driver;
 *     FT_Memory memory;
 *     {@link FT_Stream FT_Stream} stream;
 *     {@link FT_List FT_ListRec} sizes_list;
 *     {@link FT_Generic FT_Generic} autohint;
 *     void * extensions;
 *     FT_Face_Internal internal;
 * }</code></pre>
 */
@NativeType("struct FT_FaceRec")
public class FT_Face extends Struct<FT_Face> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NUM_FACES,
        FACE_INDEX,
        FACE_FLAGS,
        STYLE_FLAGS,
        NUM_GLYPHS,
        FAMILY_NAME,
        STYLE_NAME,
        NUM_FIXED_SIZES,
        AVAILABLE_SIZES,
        NUM_CHARMAPS,
        CHARMAPS,
        GENERIC,
        BBOX,
        UNITS_PER_EM,
        ASCENDER,
        DESCENDER,
        HEIGHT,
        MAX_ADVANCE_WIDTH,
        MAX_ADVANCE_HEIGHT,
        UNDERLINE_POSITION,
        UNDERLINE_THICKNESS,
        GLYPH,
        SIZE,
        CHARMAP,
        DRIVER,
        MEMORY,
        STREAM,
        SIZES_LIST,
        AUTOHINT,
        EXTENSIONS,
        INTERNAL;

    static {
        Layout layout = __struct(
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(FT_Generic.SIZEOF, FT_Generic.ALIGNOF),
            __member(FT_BBox.SIZEOF, FT_BBox.ALIGNOF),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(FT_List.SIZEOF, FT_List.ALIGNOF),
            __member(FT_Generic.SIZEOF, FT_Generic.ALIGNOF),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NUM_FACES = layout.offsetof(0);
        FACE_INDEX = layout.offsetof(1);
        FACE_FLAGS = layout.offsetof(2);
        STYLE_FLAGS = layout.offsetof(3);
        NUM_GLYPHS = layout.offsetof(4);
        FAMILY_NAME = layout.offsetof(5);
        STYLE_NAME = layout.offsetof(6);
        NUM_FIXED_SIZES = layout.offsetof(7);
        AVAILABLE_SIZES = layout.offsetof(8);
        NUM_CHARMAPS = layout.offsetof(9);
        CHARMAPS = layout.offsetof(10);
        GENERIC = layout.offsetof(11);
        BBOX = layout.offsetof(12);
        UNITS_PER_EM = layout.offsetof(13);
        ASCENDER = layout.offsetof(14);
        DESCENDER = layout.offsetof(15);
        HEIGHT = layout.offsetof(16);
        MAX_ADVANCE_WIDTH = layout.offsetof(17);
        MAX_ADVANCE_HEIGHT = layout.offsetof(18);
        UNDERLINE_POSITION = layout.offsetof(19);
        UNDERLINE_THICKNESS = layout.offsetof(20);
        GLYPH = layout.offsetof(21);
        SIZE = layout.offsetof(22);
        CHARMAP = layout.offsetof(23);
        DRIVER = layout.offsetof(24);
        MEMORY = layout.offsetof(25);
        STREAM = layout.offsetof(26);
        SIZES_LIST = layout.offsetof(27);
        AUTOHINT = layout.offsetof(28);
        EXTENSIONS = layout.offsetof(29);
        INTERNAL = layout.offsetof(30);
    }

    protected FT_Face(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_Face create(long address, @Nullable ByteBuffer container) {
        return new FT_Face(address, container);
    }

    /**
     * Creates a {@code FT_Face} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_Face(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code num_faces} field. */
    @NativeType("FT_Long")
    public long num_faces() { return nnum_faces(address()); }
    /** @return the value of the {@code face_index} field. */
    @NativeType("FT_Long")
    public long face_index() { return nface_index(address()); }
    /** @return the value of the {@code face_flags} field. */
    @NativeType("FT_Long")
    public long face_flags() { return nface_flags(address()); }
    /** @return the value of the {@code style_flags} field. */
    @NativeType("FT_Long")
    public long style_flags() { return nstyle_flags(address()); }
    /** @return the value of the {@code num_glyphs} field. */
    @NativeType("FT_Long")
    public long num_glyphs() { return nnum_glyphs(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code family_name} field. */
    @NativeType("FT_String *")
    public ByteBuffer family_name() { return nfamily_name(address()); }
    /** @return the null-terminated string pointed to by the {@code family_name} field. */
    @NativeType("FT_String *")
    public String family_nameString() { return nfamily_nameString(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code style_name} field. */
    @NativeType("FT_String *")
    public ByteBuffer style_name() { return nstyle_name(address()); }
    /** @return the null-terminated string pointed to by the {@code style_name} field. */
    @NativeType("FT_String *")
    public String style_nameString() { return nstyle_nameString(address()); }
    /** @return the value of the {@code num_fixed_sizes} field. */
    @NativeType("FT_Int")
    public int num_fixed_sizes() { return nnum_fixed_sizes(address()); }
    /** @return a {@link FT_Bitmap_Size.Buffer} view of the struct array pointed to by the {@code available_sizes} field. */
    @Nullable
    @NativeType("FT_Bitmap_Size *")
    public FT_Bitmap_Size.Buffer available_sizes() { return navailable_sizes(address()); }
    /** @return the value of the {@code num_charmaps} field. */
    @NativeType("FT_Int")
    public int num_charmaps() { return nnum_charmaps(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code charmaps} field. */
    @NativeType("FT_CharMap *")
    public PointerBuffer charmaps() { return ncharmaps(address()); }
    /** @return a {@link FT_Generic} view of the {@code generic} field. */
    public FT_Generic generic() { return ngeneric(address()); }
    /** @return a {@link FT_BBox} view of the {@code bbox} field. */
    public FT_BBox bbox() { return nbbox(address()); }
    /** @return the value of the {@code units_per_EM} field. */
    @NativeType("FT_UShort")
    public short units_per_EM() { return nunits_per_EM(address()); }
    /** @return the value of the {@code ascender} field. */
    @NativeType("FT_Short")
    public short ascender() { return nascender(address()); }
    /** @return the value of the {@code descender} field. */
    @NativeType("FT_Short")
    public short descender() { return ndescender(address()); }
    /** @return the value of the {@code height} field. */
    @NativeType("FT_Short")
    public short height() { return nheight(address()); }
    /** @return the value of the {@code max_advance_width} field. */
    @NativeType("FT_Short")
    public short max_advance_width() { return nmax_advance_width(address()); }
    /** @return the value of the {@code max_advance_height} field. */
    @NativeType("FT_Short")
    public short max_advance_height() { return nmax_advance_height(address()); }
    /** @return the value of the {@code underline_position} field. */
    @NativeType("FT_Short")
    public short underline_position() { return nunderline_position(address()); }
    /** @return the value of the {@code underline_thickness} field. */
    @NativeType("FT_Short")
    public short underline_thickness() { return nunderline_thickness(address()); }
    /** @return a {@link FT_GlyphSlot} view of the struct pointed to by the {@code glyph} field. */
    @Nullable
    public FT_GlyphSlot glyph() { return nglyph(address()); }
    /** @return a {@link FT_Size} view of the struct pointed to by the {@code size} field. */
    @Nullable
    public FT_Size size() { return nsize(address()); }
    /** @return a {@link FT_CharMap} view of the struct pointed to by the {@code charmap} field. */
    @Nullable
    public FT_CharMap charmap() { return ncharmap(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_Face} instance for the specified memory address. */
    public static FT_Face create(long address) {
        return new FT_Face(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Face createSafe(long address) {
        return address == NULL ? null : new FT_Face(address, null);
    }

    /**
     * Create a {@link FT_Face.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_Face.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Face.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #num_faces}. */
    public static long nnum_faces(long struct) { return memGetCLong(struct + FT_Face.NUM_FACES); }
    /** Unsafe version of {@link #face_index}. */
    public static long nface_index(long struct) { return memGetCLong(struct + FT_Face.FACE_INDEX); }
    /** Unsafe version of {@link #face_flags}. */
    public static long nface_flags(long struct) { return memGetCLong(struct + FT_Face.FACE_FLAGS); }
    /** Unsafe version of {@link #style_flags}. */
    public static long nstyle_flags(long struct) { return memGetCLong(struct + FT_Face.STYLE_FLAGS); }
    /** Unsafe version of {@link #num_glyphs}. */
    public static long nnum_glyphs(long struct) { return memGetCLong(struct + FT_Face.NUM_GLYPHS); }
    /** Unsafe version of {@link #family_name}. */
    public static ByteBuffer nfamily_name(long struct) { return memByteBufferNT1(memGetAddress(struct + FT_Face.FAMILY_NAME)); }
    /** Unsafe version of {@link #family_nameString}. */
    public static String nfamily_nameString(long struct) { return memUTF8(memGetAddress(struct + FT_Face.FAMILY_NAME)); }
    /** Unsafe version of {@link #style_name}. */
    public static ByteBuffer nstyle_name(long struct) { return memByteBufferNT1(memGetAddress(struct + FT_Face.STYLE_NAME)); }
    /** Unsafe version of {@link #style_nameString}. */
    public static String nstyle_nameString(long struct) { return memUTF8(memGetAddress(struct + FT_Face.STYLE_NAME)); }
    /** Unsafe version of {@link #num_fixed_sizes}. */
    public static int nnum_fixed_sizes(long struct) { return UNSAFE.getInt(null, struct + FT_Face.NUM_FIXED_SIZES); }
    /** Unsafe version of {@link #available_sizes}. */
    @Nullable public static FT_Bitmap_Size.Buffer navailable_sizes(long struct) { return FT_Bitmap_Size.createSafe(memGetAddress(struct + FT_Face.AVAILABLE_SIZES), nnum_fixed_sizes(struct)); }
    /** Unsafe version of {@link #num_charmaps}. */
    public static int nnum_charmaps(long struct) { return UNSAFE.getInt(null, struct + FT_Face.NUM_CHARMAPS); }
    /** Unsafe version of {@link #charmaps() charmaps}. */
    public static PointerBuffer ncharmaps(long struct) { return memPointerBuffer(memGetAddress(struct + FT_Face.CHARMAPS), nnum_charmaps(struct)); }
    /** Unsafe version of {@link #generic}. */
    public static FT_Generic ngeneric(long struct) { return FT_Generic.create(struct + FT_Face.GENERIC); }
    /** Unsafe version of {@link #bbox}. */
    public static FT_BBox nbbox(long struct) { return FT_BBox.create(struct + FT_Face.BBOX); }
    /** Unsafe version of {@link #units_per_EM}. */
    public static short nunits_per_EM(long struct) { return UNSAFE.getShort(null, struct + FT_Face.UNITS_PER_EM); }
    /** Unsafe version of {@link #ascender}. */
    public static short nascender(long struct) { return UNSAFE.getShort(null, struct + FT_Face.ASCENDER); }
    /** Unsafe version of {@link #descender}. */
    public static short ndescender(long struct) { return UNSAFE.getShort(null, struct + FT_Face.DESCENDER); }
    /** Unsafe version of {@link #height}. */
    public static short nheight(long struct) { return UNSAFE.getShort(null, struct + FT_Face.HEIGHT); }
    /** Unsafe version of {@link #max_advance_width}. */
    public static short nmax_advance_width(long struct) { return UNSAFE.getShort(null, struct + FT_Face.MAX_ADVANCE_WIDTH); }
    /** Unsafe version of {@link #max_advance_height}. */
    public static short nmax_advance_height(long struct) { return UNSAFE.getShort(null, struct + FT_Face.MAX_ADVANCE_HEIGHT); }
    /** Unsafe version of {@link #underline_position}. */
    public static short nunderline_position(long struct) { return UNSAFE.getShort(null, struct + FT_Face.UNDERLINE_POSITION); }
    /** Unsafe version of {@link #underline_thickness}. */
    public static short nunderline_thickness(long struct) { return UNSAFE.getShort(null, struct + FT_Face.UNDERLINE_THICKNESS); }
    /** Unsafe version of {@link #glyph}. */
    @Nullable public static FT_GlyphSlot nglyph(long struct) { return FT_GlyphSlot.createSafe(memGetAddress(struct + FT_Face.GLYPH)); }
    /** Unsafe version of {@link #size}. */
    @Nullable public static FT_Size nsize(long struct) { return FT_Size.createSafe(memGetAddress(struct + FT_Face.SIZE)); }
    /** Unsafe version of {@link #charmap}. */
    @Nullable public static FT_CharMap ncharmap(long struct) { return FT_CharMap.createSafe(memGetAddress(struct + FT_Face.CHARMAP)); }
    public static long ndriver(long struct) { return memGetAddress(struct + FT_Face.DRIVER); }
    @Nullable public static FT_Memory nmemory(long struct) { return FT_Memory.createSafe(memGetAddress(struct + FT_Face.MEMORY)); }
    @Nullable public static FT_Stream nstream$(long struct) { return FT_Stream.createSafe(memGetAddress(struct + FT_Face.STREAM)); }
    public static FT_List nsizes_list(long struct) { return FT_List.create(struct + FT_Face.SIZES_LIST); }
    public static FT_Generic nautohint(long struct) { return FT_Generic.create(struct + FT_Face.AUTOHINT); }
    public static long nextensions(long struct) { return memGetAddress(struct + FT_Face.EXTENSIONS); }
    public static long ninternal(long struct) { return memGetAddress(struct + FT_Face.INTERNAL); }

    // -----------------------------------

    /** An array of {@link FT_Face} structs. */
    public static class Buffer extends StructBuffer<FT_Face, Buffer> {

        private static final FT_Face ELEMENT_FACTORY = FT_Face.create(-1L);

        /**
         * Creates a new {@code FT_Face.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_Face#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_Face getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code num_faces} field. */
        @NativeType("FT_Long")
        public long num_faces() { return FT_Face.nnum_faces(address()); }
        /** @return the value of the {@code face_index} field. */
        @NativeType("FT_Long")
        public long face_index() { return FT_Face.nface_index(address()); }
        /** @return the value of the {@code face_flags} field. */
        @NativeType("FT_Long")
        public long face_flags() { return FT_Face.nface_flags(address()); }
        /** @return the value of the {@code style_flags} field. */
        @NativeType("FT_Long")
        public long style_flags() { return FT_Face.nstyle_flags(address()); }
        /** @return the value of the {@code num_glyphs} field. */
        @NativeType("FT_Long")
        public long num_glyphs() { return FT_Face.nnum_glyphs(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code family_name} field. */
        @NativeType("FT_String *")
        public ByteBuffer family_name() { return FT_Face.nfamily_name(address()); }
        /** @return the null-terminated string pointed to by the {@code family_name} field. */
        @NativeType("FT_String *")
        public String family_nameString() { return FT_Face.nfamily_nameString(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code style_name} field. */
        @NativeType("FT_String *")
        public ByteBuffer style_name() { return FT_Face.nstyle_name(address()); }
        /** @return the null-terminated string pointed to by the {@code style_name} field. */
        @NativeType("FT_String *")
        public String style_nameString() { return FT_Face.nstyle_nameString(address()); }
        /** @return the value of the {@code num_fixed_sizes} field. */
        @NativeType("FT_Int")
        public int num_fixed_sizes() { return FT_Face.nnum_fixed_sizes(address()); }
        /** @return a {@link FT_Bitmap_Size.Buffer} view of the struct array pointed to by the {@code available_sizes} field. */
        @Nullable
        @NativeType("FT_Bitmap_Size *")
        public FT_Bitmap_Size.Buffer available_sizes() { return FT_Face.navailable_sizes(address()); }
        /** @return the value of the {@code num_charmaps} field. */
        @NativeType("FT_Int")
        public int num_charmaps() { return FT_Face.nnum_charmaps(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code charmaps} field. */
        @NativeType("FT_CharMap *")
        public PointerBuffer charmaps() { return FT_Face.ncharmaps(address()); }
        /** @return a {@link FT_Generic} view of the {@code generic} field. */
        public FT_Generic generic() { return FT_Face.ngeneric(address()); }
        /** @return a {@link FT_BBox} view of the {@code bbox} field. */
        public FT_BBox bbox() { return FT_Face.nbbox(address()); }
        /** @return the value of the {@code units_per_EM} field. */
        @NativeType("FT_UShort")
        public short units_per_EM() { return FT_Face.nunits_per_EM(address()); }
        /** @return the value of the {@code ascender} field. */
        @NativeType("FT_Short")
        public short ascender() { return FT_Face.nascender(address()); }
        /** @return the value of the {@code descender} field. */
        @NativeType("FT_Short")
        public short descender() { return FT_Face.ndescender(address()); }
        /** @return the value of the {@code height} field. */
        @NativeType("FT_Short")
        public short height() { return FT_Face.nheight(address()); }
        /** @return the value of the {@code max_advance_width} field. */
        @NativeType("FT_Short")
        public short max_advance_width() { return FT_Face.nmax_advance_width(address()); }
        /** @return the value of the {@code max_advance_height} field. */
        @NativeType("FT_Short")
        public short max_advance_height() { return FT_Face.nmax_advance_height(address()); }
        /** @return the value of the {@code underline_position} field. */
        @NativeType("FT_Short")
        public short underline_position() { return FT_Face.nunderline_position(address()); }
        /** @return the value of the {@code underline_thickness} field. */
        @NativeType("FT_Short")
        public short underline_thickness() { return FT_Face.nunderline_thickness(address()); }
        /** @return a {@link FT_GlyphSlot} view of the struct pointed to by the {@code glyph} field. */
        @Nullable
        public FT_GlyphSlot glyph() { return FT_Face.nglyph(address()); }
        /** @return a {@link FT_Size} view of the struct pointed to by the {@code size} field. */
        @Nullable
        public FT_Size size() { return FT_Face.nsize(address()); }
        /** @return a {@link FT_CharMap} view of the struct pointed to by the {@code charmap} field. */
        @Nullable
        public FT_CharMap charmap() { return FT_Face.ncharmap(address()); }

    }

}