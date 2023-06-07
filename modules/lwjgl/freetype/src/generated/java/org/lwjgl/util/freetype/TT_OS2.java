/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * A structure to model a TrueType {@code OS/2} table.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct TT_OS2 {
 *     FT_UShort version;
 *     FT_Short xAvgCharWidth;
 *     FT_UShort usWeightClass;
 *     FT_UShort usWidthClass;
 *     FT_UShort fsType;
 *     FT_Short ySubscriptXSize;
 *     FT_Short ySubscriptYSize;
 *     FT_Short ySubscriptXOffset;
 *     FT_Short ySubscriptYOffset;
 *     FT_Short ySuperscriptXSize;
 *     FT_Short ySuperscriptYSize;
 *     FT_Short ySuperscriptXOffset;
 *     FT_Short ySuperscriptYOffset;
 *     FT_Short yStrikeoutSize;
 *     FT_Short yStrikeoutPosition;
 *     FT_Short sFamilyClass;
 *     FT_Byte panose[10];
 *     FT_ULong ulUnicodeRange1;
 *     FT_ULong ulUnicodeRange2;
 *     FT_ULong ulUnicodeRange3;
 *     FT_ULong ulUnicodeRange4;
 *     FT_Char achVendID[4];
 *     FT_UShort fsSelection;
 *     FT_UShort usFirstCharIndex;
 *     FT_UShort usLastCharIndex;
 *     FT_Short sTypoAscender;
 *     FT_Short sTypoDescender;
 *     FT_Short sTypoLineGap;
 *     FT_UShort usWinAscent;
 *     FT_UShort usWinDescent;
 *     FT_ULong ulCodePageRange1;
 *     FT_ULong ulCodePageRange2;
 *     FT_Short sxHeight;
 *     FT_Short sCapHeight;
 *     FT_UShort usDefaultChar;
 *     FT_UShort usBreakChar;
 *     FT_UShort usMaxContext;
 *     FT_UShort usLowerOpticalPointSize;
 *     FT_UShort usUpperOpticalPointSize;
 * }</code></pre>
 */
public class TT_OS2 extends Struct<TT_OS2> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VERSION,
        XAVGCHARWIDTH,
        USWEIGHTCLASS,
        USWIDTHCLASS,
        FSTYPE,
        YSUBSCRIPTXSIZE,
        YSUBSCRIPTYSIZE,
        YSUBSCRIPTXOFFSET,
        YSUBSCRIPTYOFFSET,
        YSUPERSCRIPTXSIZE,
        YSUPERSCRIPTYSIZE,
        YSUPERSCRIPTXOFFSET,
        YSUPERSCRIPTYOFFSET,
        YSTRIKEOUTSIZE,
        YSTRIKEOUTPOSITION,
        SFAMILYCLASS,
        PANOSE,
        ULUNICODERANGE1,
        ULUNICODERANGE2,
        ULUNICODERANGE3,
        ULUNICODERANGE4,
        ACHVENDID,
        FSSELECTION,
        USFIRSTCHARINDEX,
        USLASTCHARINDEX,
        STYPOASCENDER,
        STYPODESCENDER,
        STYPOLINEGAP,
        USWINASCENT,
        USWINDESCENT,
        ULCODEPAGERANGE1,
        ULCODEPAGERANGE2,
        SXHEIGHT,
        SCAPHEIGHT,
        USDEFAULTCHAR,
        USBREAKCHAR,
        USMAXCONTEXT,
        USLOWEROPTICALPOINTSIZE,
        USUPPEROPTICALPOINTSIZE;

    static {
        Layout layout = __struct(
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __array(1, 10),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __array(1, 4),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
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

        VERSION = layout.offsetof(0);
        XAVGCHARWIDTH = layout.offsetof(1);
        USWEIGHTCLASS = layout.offsetof(2);
        USWIDTHCLASS = layout.offsetof(3);
        FSTYPE = layout.offsetof(4);
        YSUBSCRIPTXSIZE = layout.offsetof(5);
        YSUBSCRIPTYSIZE = layout.offsetof(6);
        YSUBSCRIPTXOFFSET = layout.offsetof(7);
        YSUBSCRIPTYOFFSET = layout.offsetof(8);
        YSUPERSCRIPTXSIZE = layout.offsetof(9);
        YSUPERSCRIPTYSIZE = layout.offsetof(10);
        YSUPERSCRIPTXOFFSET = layout.offsetof(11);
        YSUPERSCRIPTYOFFSET = layout.offsetof(12);
        YSTRIKEOUTSIZE = layout.offsetof(13);
        YSTRIKEOUTPOSITION = layout.offsetof(14);
        SFAMILYCLASS = layout.offsetof(15);
        PANOSE = layout.offsetof(16);
        ULUNICODERANGE1 = layout.offsetof(17);
        ULUNICODERANGE2 = layout.offsetof(18);
        ULUNICODERANGE3 = layout.offsetof(19);
        ULUNICODERANGE4 = layout.offsetof(20);
        ACHVENDID = layout.offsetof(21);
        FSSELECTION = layout.offsetof(22);
        USFIRSTCHARINDEX = layout.offsetof(23);
        USLASTCHARINDEX = layout.offsetof(24);
        STYPOASCENDER = layout.offsetof(25);
        STYPODESCENDER = layout.offsetof(26);
        STYPOLINEGAP = layout.offsetof(27);
        USWINASCENT = layout.offsetof(28);
        USWINDESCENT = layout.offsetof(29);
        ULCODEPAGERANGE1 = layout.offsetof(30);
        ULCODEPAGERANGE2 = layout.offsetof(31);
        SXHEIGHT = layout.offsetof(32);
        SCAPHEIGHT = layout.offsetof(33);
        USDEFAULTCHAR = layout.offsetof(34);
        USBREAKCHAR = layout.offsetof(35);
        USMAXCONTEXT = layout.offsetof(36);
        USLOWEROPTICALPOINTSIZE = layout.offsetof(37);
        USUPPEROPTICALPOINTSIZE = layout.offsetof(38);
    }

    protected TT_OS2(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected TT_OS2 create(long address, @Nullable ByteBuffer container) {
        return new TT_OS2(address, container);
    }

    /**
     * Creates a {@code TT_OS2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public TT_OS2(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code version} field. */
    @NativeType("FT_UShort")
    public short version() { return nversion(address()); }
    /** @return the value of the {@code xAvgCharWidth} field. */
    @NativeType("FT_Short")
    public short xAvgCharWidth() { return nxAvgCharWidth(address()); }
    /** @return the value of the {@code usWeightClass} field. */
    @NativeType("FT_UShort")
    public short usWeightClass() { return nusWeightClass(address()); }
    /** @return the value of the {@code usWidthClass} field. */
    @NativeType("FT_UShort")
    public short usWidthClass() { return nusWidthClass(address()); }
    /** @return the value of the {@code fsType} field. */
    @NativeType("FT_UShort")
    public short fsType() { return nfsType(address()); }
    /** @return the value of the {@code ySubscriptXSize} field. */
    @NativeType("FT_Short")
    public short ySubscriptXSize() { return nySubscriptXSize(address()); }
    /** @return the value of the {@code ySubscriptYSize} field. */
    @NativeType("FT_Short")
    public short ySubscriptYSize() { return nySubscriptYSize(address()); }
    /** @return the value of the {@code ySubscriptXOffset} field. */
    @NativeType("FT_Short")
    public short ySubscriptXOffset() { return nySubscriptXOffset(address()); }
    /** @return the value of the {@code ySubscriptYOffset} field. */
    @NativeType("FT_Short")
    public short ySubscriptYOffset() { return nySubscriptYOffset(address()); }
    /** @return the value of the {@code ySuperscriptXSize} field. */
    @NativeType("FT_Short")
    public short ySuperscriptXSize() { return nySuperscriptXSize(address()); }
    /** @return the value of the {@code ySuperscriptYSize} field. */
    @NativeType("FT_Short")
    public short ySuperscriptYSize() { return nySuperscriptYSize(address()); }
    /** @return the value of the {@code ySuperscriptXOffset} field. */
    @NativeType("FT_Short")
    public short ySuperscriptXOffset() { return nySuperscriptXOffset(address()); }
    /** @return the value of the {@code ySuperscriptYOffset} field. */
    @NativeType("FT_Short")
    public short ySuperscriptYOffset() { return nySuperscriptYOffset(address()); }
    /** @return the value of the {@code yStrikeoutSize} field. */
    @NativeType("FT_Short")
    public short yStrikeoutSize() { return nyStrikeoutSize(address()); }
    /** @return the value of the {@code yStrikeoutPosition} field. */
    @NativeType("FT_Short")
    public short yStrikeoutPosition() { return nyStrikeoutPosition(address()); }
    /** @return the value of the {@code sFamilyClass} field. */
    @NativeType("FT_Short")
    public short sFamilyClass() { return nsFamilyClass(address()); }
    /** @return a {@link ByteBuffer} view of the {@code panose} field. */
    @NativeType("FT_Byte[10]")
    public ByteBuffer panose() { return npanose(address()); }
    /** @return the value at the specified index of the {@code panose} field. */
    @NativeType("FT_Byte")
    public byte panose(int index) { return npanose(address(), index); }
    /** @return the value of the {@code ulUnicodeRange1} field. */
    @NativeType("FT_ULong")
    public long ulUnicodeRange1() { return nulUnicodeRange1(address()); }
    /** @return the value of the {@code ulUnicodeRange2} field. */
    @NativeType("FT_ULong")
    public long ulUnicodeRange2() { return nulUnicodeRange2(address()); }
    /** @return the value of the {@code ulUnicodeRange3} field. */
    @NativeType("FT_ULong")
    public long ulUnicodeRange3() { return nulUnicodeRange3(address()); }
    /** @return the value of the {@code ulUnicodeRange4} field. */
    @NativeType("FT_ULong")
    public long ulUnicodeRange4() { return nulUnicodeRange4(address()); }
    /** @return a {@link ByteBuffer} view of the {@code achVendID} field. */
    @NativeType("FT_Char[4]")
    public ByteBuffer achVendID() { return nachVendID(address()); }
    /** @return the value at the specified index of the {@code achVendID} field. */
    @NativeType("FT_Char")
    public byte achVendID(int index) { return nachVendID(address(), index); }
    /** @return the value of the {@code fsSelection} field. */
    @NativeType("FT_UShort")
    public short fsSelection() { return nfsSelection(address()); }
    /** @return the value of the {@code usFirstCharIndex} field. */
    @NativeType("FT_UShort")
    public short usFirstCharIndex() { return nusFirstCharIndex(address()); }
    /** @return the value of the {@code usLastCharIndex} field. */
    @NativeType("FT_UShort")
    public short usLastCharIndex() { return nusLastCharIndex(address()); }
    /** @return the value of the {@code sTypoAscender} field. */
    @NativeType("FT_Short")
    public short sTypoAscender() { return nsTypoAscender(address()); }
    /** @return the value of the {@code sTypoDescender} field. */
    @NativeType("FT_Short")
    public short sTypoDescender() { return nsTypoDescender(address()); }
    /** @return the value of the {@code sTypoLineGap} field. */
    @NativeType("FT_Short")
    public short sTypoLineGap() { return nsTypoLineGap(address()); }
    /** @return the value of the {@code usWinAscent} field. */
    @NativeType("FT_UShort")
    public short usWinAscent() { return nusWinAscent(address()); }
    /** @return the value of the {@code usWinDescent} field. */
    @NativeType("FT_UShort")
    public short usWinDescent() { return nusWinDescent(address()); }
    /** @return the value of the {@code ulCodePageRange1} field. */
    @NativeType("FT_ULong")
    public long ulCodePageRange1() { return nulCodePageRange1(address()); }
    /** @return the value of the {@code ulCodePageRange2} field. */
    @NativeType("FT_ULong")
    public long ulCodePageRange2() { return nulCodePageRange2(address()); }
    /** @return the value of the {@code sxHeight} field. */
    @NativeType("FT_Short")
    public short sxHeight() { return nsxHeight(address()); }
    /** @return the value of the {@code sCapHeight} field. */
    @NativeType("FT_Short")
    public short sCapHeight() { return nsCapHeight(address()); }
    /** @return the value of the {@code usDefaultChar} field. */
    @NativeType("FT_UShort")
    public short usDefaultChar() { return nusDefaultChar(address()); }
    /** @return the value of the {@code usBreakChar} field. */
    @NativeType("FT_UShort")
    public short usBreakChar() { return nusBreakChar(address()); }
    /** @return the value of the {@code usMaxContext} field. */
    @NativeType("FT_UShort")
    public short usMaxContext() { return nusMaxContext(address()); }
    /** @return the value of the {@code usLowerOpticalPointSize} field. */
    @NativeType("FT_UShort")
    public short usLowerOpticalPointSize() { return nusLowerOpticalPointSize(address()); }
    /** @return the value of the {@code usUpperOpticalPointSize} field. */
    @NativeType("FT_UShort")
    public short usUpperOpticalPointSize() { return nusUpperOpticalPointSize(address()); }

    // -----------------------------------

    /** Returns a new {@code TT_OS2} instance for the specified memory address. */
    public static TT_OS2 create(long address) {
        return new TT_OS2(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static TT_OS2 createSafe(long address) {
        return address == NULL ? null : new TT_OS2(address, null);
    }

    /**
     * Create a {@link TT_OS2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static TT_OS2.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static TT_OS2.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #version}. */
    public static short nversion(long struct) { return UNSAFE.getShort(null, struct + TT_OS2.VERSION); }
    /** Unsafe version of {@link #xAvgCharWidth}. */
    public static short nxAvgCharWidth(long struct) { return UNSAFE.getShort(null, struct + TT_OS2.XAVGCHARWIDTH); }
    /** Unsafe version of {@link #usWeightClass}. */
    public static short nusWeightClass(long struct) { return UNSAFE.getShort(null, struct + TT_OS2.USWEIGHTCLASS); }
    /** Unsafe version of {@link #usWidthClass}. */
    public static short nusWidthClass(long struct) { return UNSAFE.getShort(null, struct + TT_OS2.USWIDTHCLASS); }
    /** Unsafe version of {@link #fsType}. */
    public static short nfsType(long struct) { return UNSAFE.getShort(null, struct + TT_OS2.FSTYPE); }
    /** Unsafe version of {@link #ySubscriptXSize}. */
    public static short nySubscriptXSize(long struct) { return UNSAFE.getShort(null, struct + TT_OS2.YSUBSCRIPTXSIZE); }
    /** Unsafe version of {@link #ySubscriptYSize}. */
    public static short nySubscriptYSize(long struct) { return UNSAFE.getShort(null, struct + TT_OS2.YSUBSCRIPTYSIZE); }
    /** Unsafe version of {@link #ySubscriptXOffset}. */
    public static short nySubscriptXOffset(long struct) { return UNSAFE.getShort(null, struct + TT_OS2.YSUBSCRIPTXOFFSET); }
    /** Unsafe version of {@link #ySubscriptYOffset}. */
    public static short nySubscriptYOffset(long struct) { return UNSAFE.getShort(null, struct + TT_OS2.YSUBSCRIPTYOFFSET); }
    /** Unsafe version of {@link #ySuperscriptXSize}. */
    public static short nySuperscriptXSize(long struct) { return UNSAFE.getShort(null, struct + TT_OS2.YSUPERSCRIPTXSIZE); }
    /** Unsafe version of {@link #ySuperscriptYSize}. */
    public static short nySuperscriptYSize(long struct) { return UNSAFE.getShort(null, struct + TT_OS2.YSUPERSCRIPTYSIZE); }
    /** Unsafe version of {@link #ySuperscriptXOffset}. */
    public static short nySuperscriptXOffset(long struct) { return UNSAFE.getShort(null, struct + TT_OS2.YSUPERSCRIPTXOFFSET); }
    /** Unsafe version of {@link #ySuperscriptYOffset}. */
    public static short nySuperscriptYOffset(long struct) { return UNSAFE.getShort(null, struct + TT_OS2.YSUPERSCRIPTYOFFSET); }
    /** Unsafe version of {@link #yStrikeoutSize}. */
    public static short nyStrikeoutSize(long struct) { return UNSAFE.getShort(null, struct + TT_OS2.YSTRIKEOUTSIZE); }
    /** Unsafe version of {@link #yStrikeoutPosition}. */
    public static short nyStrikeoutPosition(long struct) { return UNSAFE.getShort(null, struct + TT_OS2.YSTRIKEOUTPOSITION); }
    /** Unsafe version of {@link #sFamilyClass}. */
    public static short nsFamilyClass(long struct) { return UNSAFE.getShort(null, struct + TT_OS2.SFAMILYCLASS); }
    /** Unsafe version of {@link #panose}. */
    public static ByteBuffer npanose(long struct) { return memByteBuffer(struct + TT_OS2.PANOSE, 10); }
    /** Unsafe version of {@link #panose(int) panose}. */
    public static byte npanose(long struct, int index) {
        return UNSAFE.getByte(null, struct + TT_OS2.PANOSE + check(index, 10) * 1);
    }
    /** Unsafe version of {@link #ulUnicodeRange1}. */
    public static long nulUnicodeRange1(long struct) { return memGetCLong(struct + TT_OS2.ULUNICODERANGE1); }
    /** Unsafe version of {@link #ulUnicodeRange2}. */
    public static long nulUnicodeRange2(long struct) { return memGetCLong(struct + TT_OS2.ULUNICODERANGE2); }
    /** Unsafe version of {@link #ulUnicodeRange3}. */
    public static long nulUnicodeRange3(long struct) { return memGetCLong(struct + TT_OS2.ULUNICODERANGE3); }
    /** Unsafe version of {@link #ulUnicodeRange4}. */
    public static long nulUnicodeRange4(long struct) { return memGetCLong(struct + TT_OS2.ULUNICODERANGE4); }
    /** Unsafe version of {@link #achVendID}. */
    public static ByteBuffer nachVendID(long struct) { return memByteBuffer(struct + TT_OS2.ACHVENDID, 4); }
    /** Unsafe version of {@link #achVendID(int) achVendID}. */
    public static byte nachVendID(long struct, int index) {
        return UNSAFE.getByte(null, struct + TT_OS2.ACHVENDID + check(index, 4) * 1);
    }
    /** Unsafe version of {@link #fsSelection}. */
    public static short nfsSelection(long struct) { return UNSAFE.getShort(null, struct + TT_OS2.FSSELECTION); }
    /** Unsafe version of {@link #usFirstCharIndex}. */
    public static short nusFirstCharIndex(long struct) { return UNSAFE.getShort(null, struct + TT_OS2.USFIRSTCHARINDEX); }
    /** Unsafe version of {@link #usLastCharIndex}. */
    public static short nusLastCharIndex(long struct) { return UNSAFE.getShort(null, struct + TT_OS2.USLASTCHARINDEX); }
    /** Unsafe version of {@link #sTypoAscender}. */
    public static short nsTypoAscender(long struct) { return UNSAFE.getShort(null, struct + TT_OS2.STYPOASCENDER); }
    /** Unsafe version of {@link #sTypoDescender}. */
    public static short nsTypoDescender(long struct) { return UNSAFE.getShort(null, struct + TT_OS2.STYPODESCENDER); }
    /** Unsafe version of {@link #sTypoLineGap}. */
    public static short nsTypoLineGap(long struct) { return UNSAFE.getShort(null, struct + TT_OS2.STYPOLINEGAP); }
    /** Unsafe version of {@link #usWinAscent}. */
    public static short nusWinAscent(long struct) { return UNSAFE.getShort(null, struct + TT_OS2.USWINASCENT); }
    /** Unsafe version of {@link #usWinDescent}. */
    public static short nusWinDescent(long struct) { return UNSAFE.getShort(null, struct + TT_OS2.USWINDESCENT); }
    /** Unsafe version of {@link #ulCodePageRange1}. */
    public static long nulCodePageRange1(long struct) { return memGetCLong(struct + TT_OS2.ULCODEPAGERANGE1); }
    /** Unsafe version of {@link #ulCodePageRange2}. */
    public static long nulCodePageRange2(long struct) { return memGetCLong(struct + TT_OS2.ULCODEPAGERANGE2); }
    /** Unsafe version of {@link #sxHeight}. */
    public static short nsxHeight(long struct) { return UNSAFE.getShort(null, struct + TT_OS2.SXHEIGHT); }
    /** Unsafe version of {@link #sCapHeight}. */
    public static short nsCapHeight(long struct) { return UNSAFE.getShort(null, struct + TT_OS2.SCAPHEIGHT); }
    /** Unsafe version of {@link #usDefaultChar}. */
    public static short nusDefaultChar(long struct) { return UNSAFE.getShort(null, struct + TT_OS2.USDEFAULTCHAR); }
    /** Unsafe version of {@link #usBreakChar}. */
    public static short nusBreakChar(long struct) { return UNSAFE.getShort(null, struct + TT_OS2.USBREAKCHAR); }
    /** Unsafe version of {@link #usMaxContext}. */
    public static short nusMaxContext(long struct) { return UNSAFE.getShort(null, struct + TT_OS2.USMAXCONTEXT); }
    /** Unsafe version of {@link #usLowerOpticalPointSize}. */
    public static short nusLowerOpticalPointSize(long struct) { return UNSAFE.getShort(null, struct + TT_OS2.USLOWEROPTICALPOINTSIZE); }
    /** Unsafe version of {@link #usUpperOpticalPointSize}. */
    public static short nusUpperOpticalPointSize(long struct) { return UNSAFE.getShort(null, struct + TT_OS2.USUPPEROPTICALPOINTSIZE); }

    // -----------------------------------

    /** An array of {@link TT_OS2} structs. */
    public static class Buffer extends StructBuffer<TT_OS2, Buffer> {

        private static final TT_OS2 ELEMENT_FACTORY = TT_OS2.create(-1L);

        /**
         * Creates a new {@code TT_OS2.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link TT_OS2#SIZEOF}, and its mark will be undefined.</p>
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
        protected TT_OS2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code version} field. */
        @NativeType("FT_UShort")
        public short version() { return TT_OS2.nversion(address()); }
        /** @return the value of the {@code xAvgCharWidth} field. */
        @NativeType("FT_Short")
        public short xAvgCharWidth() { return TT_OS2.nxAvgCharWidth(address()); }
        /** @return the value of the {@code usWeightClass} field. */
        @NativeType("FT_UShort")
        public short usWeightClass() { return TT_OS2.nusWeightClass(address()); }
        /** @return the value of the {@code usWidthClass} field. */
        @NativeType("FT_UShort")
        public short usWidthClass() { return TT_OS2.nusWidthClass(address()); }
        /** @return the value of the {@code fsType} field. */
        @NativeType("FT_UShort")
        public short fsType() { return TT_OS2.nfsType(address()); }
        /** @return the value of the {@code ySubscriptXSize} field. */
        @NativeType("FT_Short")
        public short ySubscriptXSize() { return TT_OS2.nySubscriptXSize(address()); }
        /** @return the value of the {@code ySubscriptYSize} field. */
        @NativeType("FT_Short")
        public short ySubscriptYSize() { return TT_OS2.nySubscriptYSize(address()); }
        /** @return the value of the {@code ySubscriptXOffset} field. */
        @NativeType("FT_Short")
        public short ySubscriptXOffset() { return TT_OS2.nySubscriptXOffset(address()); }
        /** @return the value of the {@code ySubscriptYOffset} field. */
        @NativeType("FT_Short")
        public short ySubscriptYOffset() { return TT_OS2.nySubscriptYOffset(address()); }
        /** @return the value of the {@code ySuperscriptXSize} field. */
        @NativeType("FT_Short")
        public short ySuperscriptXSize() { return TT_OS2.nySuperscriptXSize(address()); }
        /** @return the value of the {@code ySuperscriptYSize} field. */
        @NativeType("FT_Short")
        public short ySuperscriptYSize() { return TT_OS2.nySuperscriptYSize(address()); }
        /** @return the value of the {@code ySuperscriptXOffset} field. */
        @NativeType("FT_Short")
        public short ySuperscriptXOffset() { return TT_OS2.nySuperscriptXOffset(address()); }
        /** @return the value of the {@code ySuperscriptYOffset} field. */
        @NativeType("FT_Short")
        public short ySuperscriptYOffset() { return TT_OS2.nySuperscriptYOffset(address()); }
        /** @return the value of the {@code yStrikeoutSize} field. */
        @NativeType("FT_Short")
        public short yStrikeoutSize() { return TT_OS2.nyStrikeoutSize(address()); }
        /** @return the value of the {@code yStrikeoutPosition} field. */
        @NativeType("FT_Short")
        public short yStrikeoutPosition() { return TT_OS2.nyStrikeoutPosition(address()); }
        /** @return the value of the {@code sFamilyClass} field. */
        @NativeType("FT_Short")
        public short sFamilyClass() { return TT_OS2.nsFamilyClass(address()); }
        /** @return a {@link ByteBuffer} view of the {@code panose} field. */
        @NativeType("FT_Byte[10]")
        public ByteBuffer panose() { return TT_OS2.npanose(address()); }
        /** @return the value at the specified index of the {@code panose} field. */
        @NativeType("FT_Byte")
        public byte panose(int index) { return TT_OS2.npanose(address(), index); }
        /** @return the value of the {@code ulUnicodeRange1} field. */
        @NativeType("FT_ULong")
        public long ulUnicodeRange1() { return TT_OS2.nulUnicodeRange1(address()); }
        /** @return the value of the {@code ulUnicodeRange2} field. */
        @NativeType("FT_ULong")
        public long ulUnicodeRange2() { return TT_OS2.nulUnicodeRange2(address()); }
        /** @return the value of the {@code ulUnicodeRange3} field. */
        @NativeType("FT_ULong")
        public long ulUnicodeRange3() { return TT_OS2.nulUnicodeRange3(address()); }
        /** @return the value of the {@code ulUnicodeRange4} field. */
        @NativeType("FT_ULong")
        public long ulUnicodeRange4() { return TT_OS2.nulUnicodeRange4(address()); }
        /** @return a {@link ByteBuffer} view of the {@code achVendID} field. */
        @NativeType("FT_Char[4]")
        public ByteBuffer achVendID() { return TT_OS2.nachVendID(address()); }
        /** @return the value at the specified index of the {@code achVendID} field. */
        @NativeType("FT_Char")
        public byte achVendID(int index) { return TT_OS2.nachVendID(address(), index); }
        /** @return the value of the {@code fsSelection} field. */
        @NativeType("FT_UShort")
        public short fsSelection() { return TT_OS2.nfsSelection(address()); }
        /** @return the value of the {@code usFirstCharIndex} field. */
        @NativeType("FT_UShort")
        public short usFirstCharIndex() { return TT_OS2.nusFirstCharIndex(address()); }
        /** @return the value of the {@code usLastCharIndex} field. */
        @NativeType("FT_UShort")
        public short usLastCharIndex() { return TT_OS2.nusLastCharIndex(address()); }
        /** @return the value of the {@code sTypoAscender} field. */
        @NativeType("FT_Short")
        public short sTypoAscender() { return TT_OS2.nsTypoAscender(address()); }
        /** @return the value of the {@code sTypoDescender} field. */
        @NativeType("FT_Short")
        public short sTypoDescender() { return TT_OS2.nsTypoDescender(address()); }
        /** @return the value of the {@code sTypoLineGap} field. */
        @NativeType("FT_Short")
        public short sTypoLineGap() { return TT_OS2.nsTypoLineGap(address()); }
        /** @return the value of the {@code usWinAscent} field. */
        @NativeType("FT_UShort")
        public short usWinAscent() { return TT_OS2.nusWinAscent(address()); }
        /** @return the value of the {@code usWinDescent} field. */
        @NativeType("FT_UShort")
        public short usWinDescent() { return TT_OS2.nusWinDescent(address()); }
        /** @return the value of the {@code ulCodePageRange1} field. */
        @NativeType("FT_ULong")
        public long ulCodePageRange1() { return TT_OS2.nulCodePageRange1(address()); }
        /** @return the value of the {@code ulCodePageRange2} field. */
        @NativeType("FT_ULong")
        public long ulCodePageRange2() { return TT_OS2.nulCodePageRange2(address()); }
        /** @return the value of the {@code sxHeight} field. */
        @NativeType("FT_Short")
        public short sxHeight() { return TT_OS2.nsxHeight(address()); }
        /** @return the value of the {@code sCapHeight} field. */
        @NativeType("FT_Short")
        public short sCapHeight() { return TT_OS2.nsCapHeight(address()); }
        /** @return the value of the {@code usDefaultChar} field. */
        @NativeType("FT_UShort")
        public short usDefaultChar() { return TT_OS2.nusDefaultChar(address()); }
        /** @return the value of the {@code usBreakChar} field. */
        @NativeType("FT_UShort")
        public short usBreakChar() { return TT_OS2.nusBreakChar(address()); }
        /** @return the value of the {@code usMaxContext} field. */
        @NativeType("FT_UShort")
        public short usMaxContext() { return TT_OS2.nusMaxContext(address()); }
        /** @return the value of the {@code usLowerOpticalPointSize} field. */
        @NativeType("FT_UShort")
        public short usLowerOpticalPointSize() { return TT_OS2.nusLowerOpticalPointSize(address()); }
        /** @return the value of the {@code usUpperOpticalPointSize} field. */
        @NativeType("FT_UShort")
        public short usUpperOpticalPointSize() { return TT_OS2.nusUpperOpticalPointSize(address()); }

    }

}