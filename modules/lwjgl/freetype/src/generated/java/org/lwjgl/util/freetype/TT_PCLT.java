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
 * A structure to model a TrueType {@code PCLT} table.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct TT_PCLT {
 *     FT_Fixed Version;
 *     FT_ULong FontNumber;
 *     FT_UShort Pitch;
 *     FT_UShort xHeight;
 *     FT_UShort Style;
 *     FT_UShort TypeFamily;
 *     FT_UShort CapHeight;
 *     FT_UShort SymbolSet;
 *     FT_Char TypeFace[16];
 *     FT_Char CharacterComplement[8];
 *     FT_Char FileName[6];
 *     FT_Char StrokeWeight;
 *     FT_Char WidthType;
 *     FT_Byte SerifStyle;
 *     FT_Byte Reserved;
 * }</code></pre>
 */
public class TT_PCLT extends Struct<TT_PCLT> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VERSION,
        FONTNUMBER,
        PITCH,
        XHEIGHT,
        STYLE,
        TYPEFAMILY,
        CAPHEIGHT,
        SYMBOLSET,
        TYPEFACE,
        CHARACTERCOMPLEMENT,
        FILENAME,
        STROKEWEIGHT,
        WIDTHTYPE,
        SERIFSTYLE,
        RESERVED;

    static {
        Layout layout = __struct(
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __array(1, 16),
            __array(1, 8),
            __array(1, 6),
            __member(1),
            __member(1),
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VERSION = layout.offsetof(0);
        FONTNUMBER = layout.offsetof(1);
        PITCH = layout.offsetof(2);
        XHEIGHT = layout.offsetof(3);
        STYLE = layout.offsetof(4);
        TYPEFAMILY = layout.offsetof(5);
        CAPHEIGHT = layout.offsetof(6);
        SYMBOLSET = layout.offsetof(7);
        TYPEFACE = layout.offsetof(8);
        CHARACTERCOMPLEMENT = layout.offsetof(9);
        FILENAME = layout.offsetof(10);
        STROKEWEIGHT = layout.offsetof(11);
        WIDTHTYPE = layout.offsetof(12);
        SERIFSTYLE = layout.offsetof(13);
        RESERVED = layout.offsetof(14);
    }

    protected TT_PCLT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected TT_PCLT create(long address, @Nullable ByteBuffer container) {
        return new TT_PCLT(address, container);
    }

    /**
     * Creates a {@code TT_PCLT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public TT_PCLT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code Version} field. */
    @NativeType("FT_Fixed")
    public long Version() { return nVersion(address()); }
    /** @return the value of the {@code FontNumber} field. */
    @NativeType("FT_ULong")
    public long FontNumber() { return nFontNumber(address()); }
    /** @return the value of the {@code Pitch} field. */
    @NativeType("FT_UShort")
    public short Pitch() { return nPitch(address()); }
    /** @return the value of the {@code xHeight} field. */
    @NativeType("FT_UShort")
    public short xHeight() { return nxHeight(address()); }
    /** @return the value of the {@code Style} field. */
    @NativeType("FT_UShort")
    public short Style() { return nStyle(address()); }
    /** @return the value of the {@code TypeFamily} field. */
    @NativeType("FT_UShort")
    public short TypeFamily() { return nTypeFamily(address()); }
    /** @return the value of the {@code CapHeight} field. */
    @NativeType("FT_UShort")
    public short CapHeight() { return nCapHeight(address()); }
    /** @return the value of the {@code SymbolSet} field. */
    @NativeType("FT_UShort")
    public short SymbolSet() { return nSymbolSet(address()); }
    /** @return a {@link ByteBuffer} view of the {@code TypeFace} field. */
    @NativeType("FT_Char[16]")
    public ByteBuffer TypeFace() { return nTypeFace(address()); }
    /** @return the value at the specified index of the {@code TypeFace} field. */
    @NativeType("FT_Char")
    public byte TypeFace(int index) { return nTypeFace(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code CharacterComplement} field. */
    @NativeType("FT_Char[8]")
    public ByteBuffer CharacterComplement() { return nCharacterComplement(address()); }
    /** @return the value at the specified index of the {@code CharacterComplement} field. */
    @NativeType("FT_Char")
    public byte CharacterComplement(int index) { return nCharacterComplement(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code FileName} field. */
    @NativeType("FT_Char[6]")
    public ByteBuffer FileName() { return nFileName(address()); }
    /** @return the value at the specified index of the {@code FileName} field. */
    @NativeType("FT_Char")
    public byte FileName(int index) { return nFileName(address(), index); }
    /** @return the value of the {@code StrokeWeight} field. */
    @NativeType("FT_Char")
    public byte StrokeWeight() { return nStrokeWeight(address()); }
    /** @return the value of the {@code WidthType} field. */
    @NativeType("FT_Char")
    public byte WidthType() { return nWidthType(address()); }
    /** @return the value of the {@code SerifStyle} field. */
    @NativeType("FT_Byte")
    public byte SerifStyle() { return nSerifStyle(address()); }
    /** @return the value of the {@code Reserved} field. */
    @NativeType("FT_Byte")
    public byte Reserved() { return nReserved(address()); }

    // -----------------------------------

    /** Returns a new {@code TT_PCLT} instance for the specified memory address. */
    public static TT_PCLT create(long address) {
        return new TT_PCLT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static TT_PCLT createSafe(long address) {
        return address == NULL ? null : new TT_PCLT(address, null);
    }

    /**
     * Create a {@link TT_PCLT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static TT_PCLT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static TT_PCLT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Version}. */
    public static long nVersion(long struct) { return memGetCLong(struct + TT_PCLT.VERSION); }
    /** Unsafe version of {@link #FontNumber}. */
    public static long nFontNumber(long struct) { return memGetCLong(struct + TT_PCLT.FONTNUMBER); }
    /** Unsafe version of {@link #Pitch}. */
    public static short nPitch(long struct) { return UNSAFE.getShort(null, struct + TT_PCLT.PITCH); }
    /** Unsafe version of {@link #xHeight}. */
    public static short nxHeight(long struct) { return UNSAFE.getShort(null, struct + TT_PCLT.XHEIGHT); }
    /** Unsafe version of {@link #Style}. */
    public static short nStyle(long struct) { return UNSAFE.getShort(null, struct + TT_PCLT.STYLE); }
    /** Unsafe version of {@link #TypeFamily}. */
    public static short nTypeFamily(long struct) { return UNSAFE.getShort(null, struct + TT_PCLT.TYPEFAMILY); }
    /** Unsafe version of {@link #CapHeight}. */
    public static short nCapHeight(long struct) { return UNSAFE.getShort(null, struct + TT_PCLT.CAPHEIGHT); }
    /** Unsafe version of {@link #SymbolSet}. */
    public static short nSymbolSet(long struct) { return UNSAFE.getShort(null, struct + TT_PCLT.SYMBOLSET); }
    /** Unsafe version of {@link #TypeFace}. */
    public static ByteBuffer nTypeFace(long struct) { return memByteBuffer(struct + TT_PCLT.TYPEFACE, 16); }
    /** Unsafe version of {@link #TypeFace(int) TypeFace}. */
    public static byte nTypeFace(long struct, int index) {
        return UNSAFE.getByte(null, struct + TT_PCLT.TYPEFACE + check(index, 16) * 1);
    }
    /** Unsafe version of {@link #CharacterComplement}. */
    public static ByteBuffer nCharacterComplement(long struct) { return memByteBuffer(struct + TT_PCLT.CHARACTERCOMPLEMENT, 8); }
    /** Unsafe version of {@link #CharacterComplement(int) CharacterComplement}. */
    public static byte nCharacterComplement(long struct, int index) {
        return UNSAFE.getByte(null, struct + TT_PCLT.CHARACTERCOMPLEMENT + check(index, 8) * 1);
    }
    /** Unsafe version of {@link #FileName}. */
    public static ByteBuffer nFileName(long struct) { return memByteBuffer(struct + TT_PCLT.FILENAME, 6); }
    /** Unsafe version of {@link #FileName(int) FileName}. */
    public static byte nFileName(long struct, int index) {
        return UNSAFE.getByte(null, struct + TT_PCLT.FILENAME + check(index, 6) * 1);
    }
    /** Unsafe version of {@link #StrokeWeight}. */
    public static byte nStrokeWeight(long struct) { return UNSAFE.getByte(null, struct + TT_PCLT.STROKEWEIGHT); }
    /** Unsafe version of {@link #WidthType}. */
    public static byte nWidthType(long struct) { return UNSAFE.getByte(null, struct + TT_PCLT.WIDTHTYPE); }
    /** Unsafe version of {@link #SerifStyle}. */
    public static byte nSerifStyle(long struct) { return UNSAFE.getByte(null, struct + TT_PCLT.SERIFSTYLE); }
    /** Unsafe version of {@link #Reserved}. */
    public static byte nReserved(long struct) { return UNSAFE.getByte(null, struct + TT_PCLT.RESERVED); }

    // -----------------------------------

    /** An array of {@link TT_PCLT} structs. */
    public static class Buffer extends StructBuffer<TT_PCLT, Buffer> {

        private static final TT_PCLT ELEMENT_FACTORY = TT_PCLT.create(-1L);

        /**
         * Creates a new {@code TT_PCLT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link TT_PCLT#SIZEOF}, and its mark will be undefined.</p>
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
        protected TT_PCLT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code Version} field. */
        @NativeType("FT_Fixed")
        public long Version() { return TT_PCLT.nVersion(address()); }
        /** @return the value of the {@code FontNumber} field. */
        @NativeType("FT_ULong")
        public long FontNumber() { return TT_PCLT.nFontNumber(address()); }
        /** @return the value of the {@code Pitch} field. */
        @NativeType("FT_UShort")
        public short Pitch() { return TT_PCLT.nPitch(address()); }
        /** @return the value of the {@code xHeight} field. */
        @NativeType("FT_UShort")
        public short xHeight() { return TT_PCLT.nxHeight(address()); }
        /** @return the value of the {@code Style} field. */
        @NativeType("FT_UShort")
        public short Style() { return TT_PCLT.nStyle(address()); }
        /** @return the value of the {@code TypeFamily} field. */
        @NativeType("FT_UShort")
        public short TypeFamily() { return TT_PCLT.nTypeFamily(address()); }
        /** @return the value of the {@code CapHeight} field. */
        @NativeType("FT_UShort")
        public short CapHeight() { return TT_PCLT.nCapHeight(address()); }
        /** @return the value of the {@code SymbolSet} field. */
        @NativeType("FT_UShort")
        public short SymbolSet() { return TT_PCLT.nSymbolSet(address()); }
        /** @return a {@link ByteBuffer} view of the {@code TypeFace} field. */
        @NativeType("FT_Char[16]")
        public ByteBuffer TypeFace() { return TT_PCLT.nTypeFace(address()); }
        /** @return the value at the specified index of the {@code TypeFace} field. */
        @NativeType("FT_Char")
        public byte TypeFace(int index) { return TT_PCLT.nTypeFace(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code CharacterComplement} field. */
        @NativeType("FT_Char[8]")
        public ByteBuffer CharacterComplement() { return TT_PCLT.nCharacterComplement(address()); }
        /** @return the value at the specified index of the {@code CharacterComplement} field. */
        @NativeType("FT_Char")
        public byte CharacterComplement(int index) { return TT_PCLT.nCharacterComplement(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code FileName} field. */
        @NativeType("FT_Char[6]")
        public ByteBuffer FileName() { return TT_PCLT.nFileName(address()); }
        /** @return the value at the specified index of the {@code FileName} field. */
        @NativeType("FT_Char")
        public byte FileName(int index) { return TT_PCLT.nFileName(address(), index); }
        /** @return the value of the {@code StrokeWeight} field. */
        @NativeType("FT_Char")
        public byte StrokeWeight() { return TT_PCLT.nStrokeWeight(address()); }
        /** @return the value of the {@code WidthType} field. */
        @NativeType("FT_Char")
        public byte WidthType() { return TT_PCLT.nWidthType(address()); }
        /** @return the value of the {@code SerifStyle} field. */
        @NativeType("FT_Byte")
        public byte SerifStyle() { return TT_PCLT.nSerifStyle(address()); }
        /** @return the value of the {@code Reserved} field. */
        @NativeType("FT_Byte")
        public byte Reserved() { return TT_PCLT.nReserved(address()); }

    }

}