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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * A structure to model a TrueType font header table.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct TT_Header {
 *     FT_Fixed Table_Version;
 *     FT_Fixed Font_Revision;
 *     FT_Long CheckSum_Adjust;
 *     FT_Long Magic_Number;
 *     FT_UShort Flags;
 *     FT_UShort Units_Per_EM;
 *     FT_ULong Created[2];
 *     FT_ULong Modified[2];
 *     FT_Short xMin;
 *     FT_Short yMin;
 *     FT_Short xMax;
 *     FT_Short yMax;
 *     FT_UShort Mac_Style;
 *     FT_UShort Lowest_Rec_PPEM;
 *     FT_Short Font_Direction;
 *     FT_Short Index_To_Loc_Format;
 *     FT_Short Glyph_Data_Format;
 * }</code></pre>
 */
public class TT_Header extends Struct<TT_Header> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TABLE_VERSION,
        FONT_REVISION,
        CHECKSUM_ADJUST,
        MAGIC_NUMBER,
        FLAGS,
        UNITS_PER_EM,
        CREATED,
        MODIFIED,
        XMIN,
        YMIN,
        XMAX,
        YMAX,
        MAC_STYLE,
        LOWEST_REC_PPEM,
        FONT_DIRECTION,
        INDEX_TO_LOC_FORMAT,
        GLYPH_DATA_FORMAT;

    static {
        Layout layout = __struct(
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(2),
            __member(2),
            __array(CLONG_SIZE, 2),
            __array(CLONG_SIZE, 2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TABLE_VERSION = layout.offsetof(0);
        FONT_REVISION = layout.offsetof(1);
        CHECKSUM_ADJUST = layout.offsetof(2);
        MAGIC_NUMBER = layout.offsetof(3);
        FLAGS = layout.offsetof(4);
        UNITS_PER_EM = layout.offsetof(5);
        CREATED = layout.offsetof(6);
        MODIFIED = layout.offsetof(7);
        XMIN = layout.offsetof(8);
        YMIN = layout.offsetof(9);
        XMAX = layout.offsetof(10);
        YMAX = layout.offsetof(11);
        MAC_STYLE = layout.offsetof(12);
        LOWEST_REC_PPEM = layout.offsetof(13);
        FONT_DIRECTION = layout.offsetof(14);
        INDEX_TO_LOC_FORMAT = layout.offsetof(15);
        GLYPH_DATA_FORMAT = layout.offsetof(16);
    }

    protected TT_Header(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected TT_Header create(long address, @Nullable ByteBuffer container) {
        return new TT_Header(address, container);
    }

    /**
     * Creates a {@code TT_Header} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public TT_Header(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code Table_Version} field. */
    @NativeType("FT_Fixed")
    public long Table_Version() { return nTable_Version(address()); }
    /** @return the value of the {@code Font_Revision} field. */
    @NativeType("FT_Fixed")
    public long Font_Revision() { return nFont_Revision(address()); }
    /** @return the value of the {@code CheckSum_Adjust} field. */
    @NativeType("FT_Long")
    public long CheckSum_Adjust() { return nCheckSum_Adjust(address()); }
    /** @return the value of the {@code Magic_Number} field. */
    @NativeType("FT_Long")
    public long Magic_Number() { return nMagic_Number(address()); }
    /** @return the value of the {@code Flags} field. */
    @NativeType("FT_UShort")
    public short Flags() { return nFlags(address()); }
    /** @return the value of the {@code Units_Per_EM} field. */
    @NativeType("FT_UShort")
    public short Units_Per_EM() { return nUnits_Per_EM(address()); }
    /** @return a {@link CLongBuffer} view of the {@code Created} field. */
    @NativeType("FT_ULong[2]")
    public CLongBuffer Created() { return nCreated(address()); }
    /** @return the value at the specified index of the {@code Created} field. */
    @NativeType("FT_ULong")
    public long Created(int index) { return nCreated(address(), index); }
    /** @return a {@link CLongBuffer} view of the {@code Modified} field. */
    @NativeType("FT_ULong[2]")
    public CLongBuffer Modified() { return nModified(address()); }
    /** @return the value at the specified index of the {@code Modified} field. */
    @NativeType("FT_ULong")
    public long Modified(int index) { return nModified(address(), index); }
    /** @return the value of the {@code xMin} field. */
    @NativeType("FT_Short")
    public short xMin() { return nxMin(address()); }
    /** @return the value of the {@code yMin} field. */
    @NativeType("FT_Short")
    public short yMin() { return nyMin(address()); }
    /** @return the value of the {@code xMax} field. */
    @NativeType("FT_Short")
    public short xMax() { return nxMax(address()); }
    /** @return the value of the {@code yMax} field. */
    @NativeType("FT_Short")
    public short yMax() { return nyMax(address()); }
    /** @return the value of the {@code Mac_Style} field. */
    @NativeType("FT_UShort")
    public short Mac_Style() { return nMac_Style(address()); }
    /** @return the value of the {@code Lowest_Rec_PPEM} field. */
    @NativeType("FT_UShort")
    public short Lowest_Rec_PPEM() { return nLowest_Rec_PPEM(address()); }
    /** @return the value of the {@code Font_Direction} field. */
    @NativeType("FT_Short")
    public short Font_Direction() { return nFont_Direction(address()); }
    /** @return the value of the {@code Index_To_Loc_Format} field. */
    @NativeType("FT_Short")
    public short Index_To_Loc_Format() { return nIndex_To_Loc_Format(address()); }
    /** @return the value of the {@code Glyph_Data_Format} field. */
    @NativeType("FT_Short")
    public short Glyph_Data_Format() { return nGlyph_Data_Format(address()); }

    // -----------------------------------

    /** Returns a new {@code TT_Header} instance for the specified memory address. */
    public static TT_Header create(long address) {
        return new TT_Header(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static TT_Header createSafe(long address) {
        return address == NULL ? null : new TT_Header(address, null);
    }

    /**
     * Create a {@link TT_Header.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static TT_Header.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static TT_Header.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Table_Version}. */
    public static long nTable_Version(long struct) { return memGetCLong(struct + TT_Header.TABLE_VERSION); }
    /** Unsafe version of {@link #Font_Revision}. */
    public static long nFont_Revision(long struct) { return memGetCLong(struct + TT_Header.FONT_REVISION); }
    /** Unsafe version of {@link #CheckSum_Adjust}. */
    public static long nCheckSum_Adjust(long struct) { return memGetCLong(struct + TT_Header.CHECKSUM_ADJUST); }
    /** Unsafe version of {@link #Magic_Number}. */
    public static long nMagic_Number(long struct) { return memGetCLong(struct + TT_Header.MAGIC_NUMBER); }
    /** Unsafe version of {@link #Flags}. */
    public static short nFlags(long struct) { return UNSAFE.getShort(null, struct + TT_Header.FLAGS); }
    /** Unsafe version of {@link #Units_Per_EM}. */
    public static short nUnits_Per_EM(long struct) { return UNSAFE.getShort(null, struct + TT_Header.UNITS_PER_EM); }
    /** Unsafe version of {@link #Created}. */
    public static CLongBuffer nCreated(long struct) { return memCLongBuffer(struct + TT_Header.CREATED, 2); }
    /** Unsafe version of {@link #Created(int) Created}. */
    public static long nCreated(long struct, int index) {
        return memGetCLong(struct + TT_Header.CREATED + check(index, 2) * CLONG_SIZE);
    }
    /** Unsafe version of {@link #Modified}. */
    public static CLongBuffer nModified(long struct) { return memCLongBuffer(struct + TT_Header.MODIFIED, 2); }
    /** Unsafe version of {@link #Modified(int) Modified}. */
    public static long nModified(long struct, int index) {
        return memGetCLong(struct + TT_Header.MODIFIED + check(index, 2) * CLONG_SIZE);
    }
    /** Unsafe version of {@link #xMin}. */
    public static short nxMin(long struct) { return UNSAFE.getShort(null, struct + TT_Header.XMIN); }
    /** Unsafe version of {@link #yMin}. */
    public static short nyMin(long struct) { return UNSAFE.getShort(null, struct + TT_Header.YMIN); }
    /** Unsafe version of {@link #xMax}. */
    public static short nxMax(long struct) { return UNSAFE.getShort(null, struct + TT_Header.XMAX); }
    /** Unsafe version of {@link #yMax}. */
    public static short nyMax(long struct) { return UNSAFE.getShort(null, struct + TT_Header.YMAX); }
    /** Unsafe version of {@link #Mac_Style}. */
    public static short nMac_Style(long struct) { return UNSAFE.getShort(null, struct + TT_Header.MAC_STYLE); }
    /** Unsafe version of {@link #Lowest_Rec_PPEM}. */
    public static short nLowest_Rec_PPEM(long struct) { return UNSAFE.getShort(null, struct + TT_Header.LOWEST_REC_PPEM); }
    /** Unsafe version of {@link #Font_Direction}. */
    public static short nFont_Direction(long struct) { return UNSAFE.getShort(null, struct + TT_Header.FONT_DIRECTION); }
    /** Unsafe version of {@link #Index_To_Loc_Format}. */
    public static short nIndex_To_Loc_Format(long struct) { return UNSAFE.getShort(null, struct + TT_Header.INDEX_TO_LOC_FORMAT); }
    /** Unsafe version of {@link #Glyph_Data_Format}. */
    public static short nGlyph_Data_Format(long struct) { return UNSAFE.getShort(null, struct + TT_Header.GLYPH_DATA_FORMAT); }

    // -----------------------------------

    /** An array of {@link TT_Header} structs. */
    public static class Buffer extends StructBuffer<TT_Header, Buffer> {

        private static final TT_Header ELEMENT_FACTORY = TT_Header.create(-1L);

        /**
         * Creates a new {@code TT_Header.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link TT_Header#SIZEOF}, and its mark will be undefined.</p>
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
        protected TT_Header getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code Table_Version} field. */
        @NativeType("FT_Fixed")
        public long Table_Version() { return TT_Header.nTable_Version(address()); }
        /** @return the value of the {@code Font_Revision} field. */
        @NativeType("FT_Fixed")
        public long Font_Revision() { return TT_Header.nFont_Revision(address()); }
        /** @return the value of the {@code CheckSum_Adjust} field. */
        @NativeType("FT_Long")
        public long CheckSum_Adjust() { return TT_Header.nCheckSum_Adjust(address()); }
        /** @return the value of the {@code Magic_Number} field. */
        @NativeType("FT_Long")
        public long Magic_Number() { return TT_Header.nMagic_Number(address()); }
        /** @return the value of the {@code Flags} field. */
        @NativeType("FT_UShort")
        public short Flags() { return TT_Header.nFlags(address()); }
        /** @return the value of the {@code Units_Per_EM} field. */
        @NativeType("FT_UShort")
        public short Units_Per_EM() { return TT_Header.nUnits_Per_EM(address()); }
        /** @return a {@link CLongBuffer} view of the {@code Created} field. */
        @NativeType("FT_ULong[2]")
        public CLongBuffer Created() { return TT_Header.nCreated(address()); }
        /** @return the value at the specified index of the {@code Created} field. */
        @NativeType("FT_ULong")
        public long Created(int index) { return TT_Header.nCreated(address(), index); }
        /** @return a {@link CLongBuffer} view of the {@code Modified} field. */
        @NativeType("FT_ULong[2]")
        public CLongBuffer Modified() { return TT_Header.nModified(address()); }
        /** @return the value at the specified index of the {@code Modified} field. */
        @NativeType("FT_ULong")
        public long Modified(int index) { return TT_Header.nModified(address(), index); }
        /** @return the value of the {@code xMin} field. */
        @NativeType("FT_Short")
        public short xMin() { return TT_Header.nxMin(address()); }
        /** @return the value of the {@code yMin} field. */
        @NativeType("FT_Short")
        public short yMin() { return TT_Header.nyMin(address()); }
        /** @return the value of the {@code xMax} field. */
        @NativeType("FT_Short")
        public short xMax() { return TT_Header.nxMax(address()); }
        /** @return the value of the {@code yMax} field. */
        @NativeType("FT_Short")
        public short yMax() { return TT_Header.nyMax(address()); }
        /** @return the value of the {@code Mac_Style} field. */
        @NativeType("FT_UShort")
        public short Mac_Style() { return TT_Header.nMac_Style(address()); }
        /** @return the value of the {@code Lowest_Rec_PPEM} field. */
        @NativeType("FT_UShort")
        public short Lowest_Rec_PPEM() { return TT_Header.nLowest_Rec_PPEM(address()); }
        /** @return the value of the {@code Font_Direction} field. */
        @NativeType("FT_Short")
        public short Font_Direction() { return TT_Header.nFont_Direction(address()); }
        /** @return the value of the {@code Index_To_Loc_Format} field. */
        @NativeType("FT_Short")
        public short Index_To_Loc_Format() { return TT_Header.nIndex_To_Loc_Format(address()); }
        /** @return the value of the {@code Glyph_Data_Format} field. */
        @NativeType("FT_Short")
        public short Glyph_Data_Format() { return TT_Header.nGlyph_Data_Format(address()); }

    }

}