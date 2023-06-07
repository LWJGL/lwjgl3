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
 * A structure used to represent data in a CID top-level dictionary.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CID_FaceDictRec {
 *     {@link PS_Private PS_PrivateRec} private_dict;
 *     FT_UInt len_buildchar;
 *     FT_Fixed forcebold_threshold;
 *     FT_Pos stroke_width;
 *     FT_Fixed expansion_factor;
 *     FT_Byte paint_type;
 *     FT_Byte font_type;
 *     {@link FT_Matrix FT_Matrix} font_matrix;
 *     {@link FT_Vector FT_Vector} font_offset;
 *     FT_UInt num_subrs;
 *     FT_ULong subrmap_offset;
 *     FT_UInt sd_bytes;
 * }</code></pre>
 */
@NativeType("struct CID_FaceDictRec")
public class CID_FaceDict extends Struct<CID_FaceDict> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PRIVATE_DICT,
        LEN_BUILDCHAR,
        FORCEBOLD_THRESHOLD,
        STROKE_WIDTH,
        EXPANSION_FACTOR,
        PAINT_TYPE,
        FONT_TYPE,
        FONT_MATRIX,
        FONT_OFFSET,
        NUM_SUBRS,
        SUBRMAP_OFFSET,
        SD_BYTES;

    static {
        Layout layout = __struct(
            __member(PS_Private.SIZEOF, PS_Private.ALIGNOF),
            __member(4),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(1),
            __member(1),
            __member(FT_Matrix.SIZEOF, FT_Matrix.ALIGNOF),
            __member(FT_Vector.SIZEOF, FT_Vector.ALIGNOF),
            __member(4),
            __member(CLONG_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PRIVATE_DICT = layout.offsetof(0);
        LEN_BUILDCHAR = layout.offsetof(1);
        FORCEBOLD_THRESHOLD = layout.offsetof(2);
        STROKE_WIDTH = layout.offsetof(3);
        EXPANSION_FACTOR = layout.offsetof(4);
        PAINT_TYPE = layout.offsetof(5);
        FONT_TYPE = layout.offsetof(6);
        FONT_MATRIX = layout.offsetof(7);
        FONT_OFFSET = layout.offsetof(8);
        NUM_SUBRS = layout.offsetof(9);
        SUBRMAP_OFFSET = layout.offsetof(10);
        SD_BYTES = layout.offsetof(11);
    }

    protected CID_FaceDict(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CID_FaceDict create(long address, @Nullable ByteBuffer container) {
        return new CID_FaceDict(address, container);
    }

    /**
     * Creates a {@code CID_FaceDict} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CID_FaceDict(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link PS_Private} view of the {@code private_dict} field. */
    @NativeType("PS_PrivateRec")
    public PS_Private private_dict() { return nprivate_dict(address()); }
    /** @return the value of the {@code len_buildchar} field. */
    @NativeType("FT_UInt")
    public int len_buildchar() { return nlen_buildchar(address()); }
    /** @return the value of the {@code forcebold_threshold} field. */
    @NativeType("FT_Fixed")
    public long forcebold_threshold() { return nforcebold_threshold(address()); }
    /** @return the value of the {@code stroke_width} field. */
    @NativeType("FT_Pos")
    public long stroke_width() { return nstroke_width(address()); }
    /** @return the value of the {@code expansion_factor} field. */
    @NativeType("FT_Fixed")
    public long expansion_factor() { return nexpansion_factor(address()); }
    /** @return the value of the {@code paint_type} field. */
    @NativeType("FT_Byte")
    public byte paint_type() { return npaint_type(address()); }
    /** @return the value of the {@code font_type} field. */
    @NativeType("FT_Byte")
    public byte font_type() { return nfont_type(address()); }
    /** @return a {@link FT_Matrix} view of the {@code font_matrix} field. */
    public FT_Matrix font_matrix() { return nfont_matrix(address()); }
    /** @return a {@link FT_Vector} view of the {@code font_offset} field. */
    public FT_Vector font_offset() { return nfont_offset(address()); }
    /** @return the value of the {@code num_subrs} field. */
    @NativeType("FT_UInt")
    public int num_subrs() { return nnum_subrs(address()); }
    /** @return the value of the {@code subrmap_offset} field. */
    @NativeType("FT_ULong")
    public long subrmap_offset() { return nsubrmap_offset(address()); }
    /** @return the value of the {@code sd_bytes} field. */
    @NativeType("FT_UInt")
    public int sd_bytes() { return nsd_bytes(address()); }

    // -----------------------------------

    /** Returns a new {@code CID_FaceDict} instance for the specified memory address. */
    public static CID_FaceDict create(long address) {
        return new CID_FaceDict(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CID_FaceDict createSafe(long address) {
        return address == NULL ? null : new CID_FaceDict(address, null);
    }

    /**
     * Create a {@link CID_FaceDict.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CID_FaceDict.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CID_FaceDict.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #private_dict}. */
    public static PS_Private nprivate_dict(long struct) { return PS_Private.create(struct + CID_FaceDict.PRIVATE_DICT); }
    /** Unsafe version of {@link #len_buildchar}. */
    public static int nlen_buildchar(long struct) { return UNSAFE.getInt(null, struct + CID_FaceDict.LEN_BUILDCHAR); }
    /** Unsafe version of {@link #forcebold_threshold}. */
    public static long nforcebold_threshold(long struct) { return memGetCLong(struct + CID_FaceDict.FORCEBOLD_THRESHOLD); }
    /** Unsafe version of {@link #stroke_width}. */
    public static long nstroke_width(long struct) { return memGetCLong(struct + CID_FaceDict.STROKE_WIDTH); }
    /** Unsafe version of {@link #expansion_factor}. */
    public static long nexpansion_factor(long struct) { return memGetCLong(struct + CID_FaceDict.EXPANSION_FACTOR); }
    /** Unsafe version of {@link #paint_type}. */
    public static byte npaint_type(long struct) { return UNSAFE.getByte(null, struct + CID_FaceDict.PAINT_TYPE); }
    /** Unsafe version of {@link #font_type}. */
    public static byte nfont_type(long struct) { return UNSAFE.getByte(null, struct + CID_FaceDict.FONT_TYPE); }
    /** Unsafe version of {@link #font_matrix}. */
    public static FT_Matrix nfont_matrix(long struct) { return FT_Matrix.create(struct + CID_FaceDict.FONT_MATRIX); }
    /** Unsafe version of {@link #font_offset}. */
    public static FT_Vector nfont_offset(long struct) { return FT_Vector.create(struct + CID_FaceDict.FONT_OFFSET); }
    /** Unsafe version of {@link #num_subrs}. */
    public static int nnum_subrs(long struct) { return UNSAFE.getInt(null, struct + CID_FaceDict.NUM_SUBRS); }
    /** Unsafe version of {@link #subrmap_offset}. */
    public static long nsubrmap_offset(long struct) { return memGetCLong(struct + CID_FaceDict.SUBRMAP_OFFSET); }
    /** Unsafe version of {@link #sd_bytes}. */
    public static int nsd_bytes(long struct) { return UNSAFE.getInt(null, struct + CID_FaceDict.SD_BYTES); }

    // -----------------------------------

    /** An array of {@link CID_FaceDict} structs. */
    public static class Buffer extends StructBuffer<CID_FaceDict, Buffer> {

        private static final CID_FaceDict ELEMENT_FACTORY = CID_FaceDict.create(-1L);

        /**
         * Creates a new {@code CID_FaceDict.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CID_FaceDict#SIZEOF}, and its mark will be undefined.</p>
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
        protected CID_FaceDict getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link PS_Private} view of the {@code private_dict} field. */
        @NativeType("PS_PrivateRec")
        public PS_Private private_dict() { return CID_FaceDict.nprivate_dict(address()); }
        /** @return the value of the {@code len_buildchar} field. */
        @NativeType("FT_UInt")
        public int len_buildchar() { return CID_FaceDict.nlen_buildchar(address()); }
        /** @return the value of the {@code forcebold_threshold} field. */
        @NativeType("FT_Fixed")
        public long forcebold_threshold() { return CID_FaceDict.nforcebold_threshold(address()); }
        /** @return the value of the {@code stroke_width} field. */
        @NativeType("FT_Pos")
        public long stroke_width() { return CID_FaceDict.nstroke_width(address()); }
        /** @return the value of the {@code expansion_factor} field. */
        @NativeType("FT_Fixed")
        public long expansion_factor() { return CID_FaceDict.nexpansion_factor(address()); }
        /** @return the value of the {@code paint_type} field. */
        @NativeType("FT_Byte")
        public byte paint_type() { return CID_FaceDict.npaint_type(address()); }
        /** @return the value of the {@code font_type} field. */
        @NativeType("FT_Byte")
        public byte font_type() { return CID_FaceDict.nfont_type(address()); }
        /** @return a {@link FT_Matrix} view of the {@code font_matrix} field. */
        public FT_Matrix font_matrix() { return CID_FaceDict.nfont_matrix(address()); }
        /** @return a {@link FT_Vector} view of the {@code font_offset} field. */
        public FT_Vector font_offset() { return CID_FaceDict.nfont_offset(address()); }
        /** @return the value of the {@code num_subrs} field. */
        @NativeType("FT_UInt")
        public int num_subrs() { return CID_FaceDict.nnum_subrs(address()); }
        /** @return the value of the {@code subrmap_offset} field. */
        @NativeType("FT_ULong")
        public long subrmap_offset() { return CID_FaceDict.nsubrmap_offset(address()); }
        /** @return the value of the {@code sd_bytes} field. */
        @NativeType("FT_UInt")
        public int sd_bytes() { return CID_FaceDict.nsd_bytes(address()); }

    }

}