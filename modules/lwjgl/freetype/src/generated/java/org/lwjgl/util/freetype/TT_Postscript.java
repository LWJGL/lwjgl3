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
 * A structure to model a TrueType 'post' table.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct TT_Postscript {
 *     FT_Fixed FormatType;
 *     FT_Fixed italicAngle;
 *     FT_Short underlinePosition;
 *     FT_Short underlineThickness;
 *     FT_ULong isFixedPitch;
 *     FT_ULong minMemType42;
 *     FT_ULong maxMemType42;
 *     FT_ULong minMemType1;
 *     FT_ULong maxMemType1;
 * }</code></pre>
 */
public class TT_Postscript extends Struct<TT_Postscript> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FORMATTYPE,
        ITALICANGLE,
        UNDERLINEPOSITION,
        UNDERLINETHICKNESS,
        ISFIXEDPITCH,
        MINMEMTYPE42,
        MAXMEMTYPE42,
        MINMEMTYPE1,
        MAXMEMTYPE1;

    static {
        Layout layout = __struct(
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(2),
            __member(2),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FORMATTYPE = layout.offsetof(0);
        ITALICANGLE = layout.offsetof(1);
        UNDERLINEPOSITION = layout.offsetof(2);
        UNDERLINETHICKNESS = layout.offsetof(3);
        ISFIXEDPITCH = layout.offsetof(4);
        MINMEMTYPE42 = layout.offsetof(5);
        MAXMEMTYPE42 = layout.offsetof(6);
        MINMEMTYPE1 = layout.offsetof(7);
        MAXMEMTYPE1 = layout.offsetof(8);
    }

    protected TT_Postscript(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected TT_Postscript create(long address, @Nullable ByteBuffer container) {
        return new TT_Postscript(address, container);
    }

    /**
     * Creates a {@code TT_Postscript} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public TT_Postscript(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code FormatType} field. */
    @NativeType("FT_Fixed")
    public long FormatType() { return nFormatType(address()); }
    /** @return the value of the {@code italicAngle} field. */
    @NativeType("FT_Fixed")
    public long italicAngle() { return nitalicAngle(address()); }
    /** @return the value of the {@code underlinePosition} field. */
    @NativeType("FT_Short")
    public short underlinePosition() { return nunderlinePosition(address()); }
    /** @return the value of the {@code underlineThickness} field. */
    @NativeType("FT_Short")
    public short underlineThickness() { return nunderlineThickness(address()); }
    /** @return the value of the {@code isFixedPitch} field. */
    @NativeType("FT_ULong")
    public long isFixedPitch() { return nisFixedPitch(address()); }
    /** @return the value of the {@code minMemType42} field. */
    @NativeType("FT_ULong")
    public long minMemType42() { return nminMemType42(address()); }
    /** @return the value of the {@code maxMemType42} field. */
    @NativeType("FT_ULong")
    public long maxMemType42() { return nmaxMemType42(address()); }
    /** @return the value of the {@code minMemType1} field. */
    @NativeType("FT_ULong")
    public long minMemType1() { return nminMemType1(address()); }
    /** @return the value of the {@code maxMemType1} field. */
    @NativeType("FT_ULong")
    public long maxMemType1() { return nmaxMemType1(address()); }

    // -----------------------------------

    /** Returns a new {@code TT_Postscript} instance for the specified memory address. */
    public static TT_Postscript create(long address) {
        return new TT_Postscript(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static TT_Postscript createSafe(long address) {
        return address == NULL ? null : new TT_Postscript(address, null);
    }

    /**
     * Create a {@link TT_Postscript.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static TT_Postscript.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static TT_Postscript.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #FormatType}. */
    public static long nFormatType(long struct) { return memGetCLong(struct + TT_Postscript.FORMATTYPE); }
    /** Unsafe version of {@link #italicAngle}. */
    public static long nitalicAngle(long struct) { return memGetCLong(struct + TT_Postscript.ITALICANGLE); }
    /** Unsafe version of {@link #underlinePosition}. */
    public static short nunderlinePosition(long struct) { return UNSAFE.getShort(null, struct + TT_Postscript.UNDERLINEPOSITION); }
    /** Unsafe version of {@link #underlineThickness}. */
    public static short nunderlineThickness(long struct) { return UNSAFE.getShort(null, struct + TT_Postscript.UNDERLINETHICKNESS); }
    /** Unsafe version of {@link #isFixedPitch}. */
    public static long nisFixedPitch(long struct) { return memGetCLong(struct + TT_Postscript.ISFIXEDPITCH); }
    /** Unsafe version of {@link #minMemType42}. */
    public static long nminMemType42(long struct) { return memGetCLong(struct + TT_Postscript.MINMEMTYPE42); }
    /** Unsafe version of {@link #maxMemType42}. */
    public static long nmaxMemType42(long struct) { return memGetCLong(struct + TT_Postscript.MAXMEMTYPE42); }
    /** Unsafe version of {@link #minMemType1}. */
    public static long nminMemType1(long struct) { return memGetCLong(struct + TT_Postscript.MINMEMTYPE1); }
    /** Unsafe version of {@link #maxMemType1}. */
    public static long nmaxMemType1(long struct) { return memGetCLong(struct + TT_Postscript.MAXMEMTYPE1); }

    // -----------------------------------

    /** An array of {@link TT_Postscript} structs. */
    public static class Buffer extends StructBuffer<TT_Postscript, Buffer> {

        private static final TT_Postscript ELEMENT_FACTORY = TT_Postscript.create(-1L);

        /**
         * Creates a new {@code TT_Postscript.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link TT_Postscript#SIZEOF}, and its mark will be undefined.</p>
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
        protected TT_Postscript getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code FormatType} field. */
        @NativeType("FT_Fixed")
        public long FormatType() { return TT_Postscript.nFormatType(address()); }
        /** @return the value of the {@code italicAngle} field. */
        @NativeType("FT_Fixed")
        public long italicAngle() { return TT_Postscript.nitalicAngle(address()); }
        /** @return the value of the {@code underlinePosition} field. */
        @NativeType("FT_Short")
        public short underlinePosition() { return TT_Postscript.nunderlinePosition(address()); }
        /** @return the value of the {@code underlineThickness} field. */
        @NativeType("FT_Short")
        public short underlineThickness() { return TT_Postscript.nunderlineThickness(address()); }
        /** @return the value of the {@code isFixedPitch} field. */
        @NativeType("FT_ULong")
        public long isFixedPitch() { return TT_Postscript.nisFixedPitch(address()); }
        /** @return the value of the {@code minMemType42} field. */
        @NativeType("FT_ULong")
        public long minMemType42() { return TT_Postscript.nminMemType42(address()); }
        /** @return the value of the {@code maxMemType42} field. */
        @NativeType("FT_ULong")
        public long maxMemType42() { return TT_Postscript.nmaxMemType42(address()); }
        /** @return the value of the {@code minMemType1} field. */
        @NativeType("FT_ULong")
        public long minMemType1() { return TT_Postscript.nminMemType1(address()); }
        /** @return the value of the {@code maxMemType1} field. */
        @NativeType("FT_ULong")
        public long maxMemType1() { return TT_Postscript.nmaxMemType1(address()); }

    }

}