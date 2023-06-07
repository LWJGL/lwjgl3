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
 * A structure used to model a TrueType vertical header, the {@code vhea} table, as well as the corresponding vertical metrics table, {@code vmtx}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct TT_VertHeader {
 *     FT_Fixed Version;
 *     FT_Short Ascender;
 *     FT_Short Descender;
 *     FT_Short Line_Gap;
 *     FT_UShort {@link #advance_Height_Max};
 *     FT_Short {@link #min_Top_Side_Bearing};
 *     FT_Short {@link #min_Bottom_Side_Bearing};
 *     FT_Short {@link #yMax_Extent};
 *     FT_Short caret_Slope_Rise;
 *     FT_Short caret_Slope_Run;
 *     FT_Short caret_Offset;
 *     FT_Short Reserved[4];
 *     FT_Short metric_Data_Format;
 *     FT_UShort number_Of_VMetrics;
 *     void * long_metrics;
 *     void * short_metrics;
 * }</code></pre>
 */
public class TT_VertHeader extends Struct<TT_VertHeader> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VERSION,
        ASCENDER,
        DESCENDER,
        LINE_GAP,
        ADVANCE_HEIGHT_MAX,
        MIN_TOP_SIDE_BEARING,
        MIN_BOTTOM_SIDE_BEARING,
        YMAX_EXTENT,
        CARET_SLOPE_RISE,
        CARET_SLOPE_RUN,
        CARET_OFFSET,
        RESERVED,
        METRIC_DATA_FORMAT,
        NUMBER_OF_VMETRICS,
        LONG_METRICS,
        SHORT_METRICS;

    static {
        Layout layout = __struct(
            __member(CLONG_SIZE),
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
            __array(2, 4),
            __member(2),
            __member(2),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VERSION = layout.offsetof(0);
        ASCENDER = layout.offsetof(1);
        DESCENDER = layout.offsetof(2);
        LINE_GAP = layout.offsetof(3);
        ADVANCE_HEIGHT_MAX = layout.offsetof(4);
        MIN_TOP_SIDE_BEARING = layout.offsetof(5);
        MIN_BOTTOM_SIDE_BEARING = layout.offsetof(6);
        YMAX_EXTENT = layout.offsetof(7);
        CARET_SLOPE_RISE = layout.offsetof(8);
        CARET_SLOPE_RUN = layout.offsetof(9);
        CARET_OFFSET = layout.offsetof(10);
        RESERVED = layout.offsetof(11);
        METRIC_DATA_FORMAT = layout.offsetof(12);
        NUMBER_OF_VMETRICS = layout.offsetof(13);
        LONG_METRICS = layout.offsetof(14);
        SHORT_METRICS = layout.offsetof(15);
    }

    protected TT_VertHeader(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected TT_VertHeader create(long address, @Nullable ByteBuffer container) {
        return new TT_VertHeader(address, container);
    }

    /**
     * Creates a {@code TT_VertHeader} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public TT_VertHeader(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code Version} field. */
    @NativeType("FT_Fixed")
    public long Version() { return nVersion(address()); }
    /** @return the value of the {@code Ascender} field. */
    @NativeType("FT_Short")
    public short Ascender() { return nAscender(address()); }
    /** @return the value of the {@code Descender} field. */
    @NativeType("FT_Short")
    public short Descender() { return nDescender(address()); }
    /** @return the value of the {@code Line_Gap} field. */
    @NativeType("FT_Short")
    public short Line_Gap() { return nLine_Gap(address()); }
    /** advance height maximum */
    @NativeType("FT_UShort")
    public short advance_Height_Max() { return nadvance_Height_Max(address()); }
    /** minimum top-sb */
    @NativeType("FT_Short")
    public short min_Top_Side_Bearing() { return nmin_Top_Side_Bearing(address()); }
    /** minimum bottom-sb */
    @NativeType("FT_Short")
    public short min_Bottom_Side_Bearing() { return nmin_Bottom_Side_Bearing(address()); }
    /** ymax extents */
    @NativeType("FT_Short")
    public short yMax_Extent() { return nyMax_Extent(address()); }
    /** @return the value of the {@code caret_Slope_Rise} field. */
    @NativeType("FT_Short")
    public short caret_Slope_Rise() { return ncaret_Slope_Rise(address()); }
    /** @return the value of the {@code caret_Slope_Run} field. */
    @NativeType("FT_Short")
    public short caret_Slope_Run() { return ncaret_Slope_Run(address()); }
    /** @return the value of the {@code caret_Offset} field. */
    @NativeType("FT_Short")
    public short caret_Offset() { return ncaret_Offset(address()); }
    /** @return a {@link ShortBuffer} view of the {@code Reserved} field. */
    @NativeType("FT_Short[4]")
    public ShortBuffer Reserved() { return nReserved(address()); }
    /** @return the value at the specified index of the {@code Reserved} field. */
    @NativeType("FT_Short")
    public short Reserved(int index) { return nReserved(address(), index); }
    /** @return the value of the {@code metric_Data_Format} field. */
    @NativeType("FT_Short")
    public short metric_Data_Format() { return nmetric_Data_Format(address()); }
    /** @return the value of the {@code number_Of_VMetrics} field. */
    @NativeType("FT_UShort")
    public short number_Of_VMetrics() { return nnumber_Of_VMetrics(address()); }
    /**
     * @return a {@link ByteBuffer} view of the data pointed to by the {@code long_metrics} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @Nullable
    @NativeType("void *")
    public ByteBuffer long_metrics(int capacity) { return nlong_metrics(address(), capacity); }
    /**
     * @return a {@link ByteBuffer} view of the data pointed to by the {@code short_metrics} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @Nullable
    @NativeType("void *")
    public ByteBuffer short_metrics(int capacity) { return nshort_metrics(address(), capacity); }

    // -----------------------------------

    /** Returns a new {@code TT_VertHeader} instance for the specified memory address. */
    public static TT_VertHeader create(long address) {
        return new TT_VertHeader(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static TT_VertHeader createSafe(long address) {
        return address == NULL ? null : new TT_VertHeader(address, null);
    }

    /**
     * Create a {@link TT_VertHeader.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static TT_VertHeader.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static TT_VertHeader.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Version}. */
    public static long nVersion(long struct) { return memGetCLong(struct + TT_VertHeader.VERSION); }
    /** Unsafe version of {@link #Ascender}. */
    public static short nAscender(long struct) { return UNSAFE.getShort(null, struct + TT_VertHeader.ASCENDER); }
    /** Unsafe version of {@link #Descender}. */
    public static short nDescender(long struct) { return UNSAFE.getShort(null, struct + TT_VertHeader.DESCENDER); }
    /** Unsafe version of {@link #Line_Gap}. */
    public static short nLine_Gap(long struct) { return UNSAFE.getShort(null, struct + TT_VertHeader.LINE_GAP); }
    /** Unsafe version of {@link #advance_Height_Max}. */
    public static short nadvance_Height_Max(long struct) { return UNSAFE.getShort(null, struct + TT_VertHeader.ADVANCE_HEIGHT_MAX); }
    /** Unsafe version of {@link #min_Top_Side_Bearing}. */
    public static short nmin_Top_Side_Bearing(long struct) { return UNSAFE.getShort(null, struct + TT_VertHeader.MIN_TOP_SIDE_BEARING); }
    /** Unsafe version of {@link #min_Bottom_Side_Bearing}. */
    public static short nmin_Bottom_Side_Bearing(long struct) { return UNSAFE.getShort(null, struct + TT_VertHeader.MIN_BOTTOM_SIDE_BEARING); }
    /** Unsafe version of {@link #yMax_Extent}. */
    public static short nyMax_Extent(long struct) { return UNSAFE.getShort(null, struct + TT_VertHeader.YMAX_EXTENT); }
    /** Unsafe version of {@link #caret_Slope_Rise}. */
    public static short ncaret_Slope_Rise(long struct) { return UNSAFE.getShort(null, struct + TT_VertHeader.CARET_SLOPE_RISE); }
    /** Unsafe version of {@link #caret_Slope_Run}. */
    public static short ncaret_Slope_Run(long struct) { return UNSAFE.getShort(null, struct + TT_VertHeader.CARET_SLOPE_RUN); }
    /** Unsafe version of {@link #caret_Offset}. */
    public static short ncaret_Offset(long struct) { return UNSAFE.getShort(null, struct + TT_VertHeader.CARET_OFFSET); }
    /** Unsafe version of {@link #Reserved}. */
    public static ShortBuffer nReserved(long struct) { return memShortBuffer(struct + TT_VertHeader.RESERVED, 4); }
    /** Unsafe version of {@link #Reserved(int) Reserved}. */
    public static short nReserved(long struct, int index) {
        return UNSAFE.getShort(null, struct + TT_VertHeader.RESERVED + check(index, 4) * 2);
    }
    /** Unsafe version of {@link #metric_Data_Format}. */
    public static short nmetric_Data_Format(long struct) { return UNSAFE.getShort(null, struct + TT_VertHeader.METRIC_DATA_FORMAT); }
    /** Unsafe version of {@link #number_Of_VMetrics}. */
    public static short nnumber_Of_VMetrics(long struct) { return UNSAFE.getShort(null, struct + TT_VertHeader.NUMBER_OF_VMETRICS); }
    /** Unsafe version of {@link #long_metrics(int) long_metrics}. */
    @Nullable public static ByteBuffer nlong_metrics(long struct, int capacity) { return memByteBufferSafe(memGetAddress(struct + TT_VertHeader.LONG_METRICS), capacity); }
    /** Unsafe version of {@link #short_metrics(int) short_metrics}. */
    @Nullable public static ByteBuffer nshort_metrics(long struct, int capacity) { return memByteBufferSafe(memGetAddress(struct + TT_VertHeader.SHORT_METRICS), capacity); }

    // -----------------------------------

    /** An array of {@link TT_VertHeader} structs. */
    public static class Buffer extends StructBuffer<TT_VertHeader, Buffer> {

        private static final TT_VertHeader ELEMENT_FACTORY = TT_VertHeader.create(-1L);

        /**
         * Creates a new {@code TT_VertHeader.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link TT_VertHeader#SIZEOF}, and its mark will be undefined.</p>
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
        protected TT_VertHeader getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code Version} field. */
        @NativeType("FT_Fixed")
        public long Version() { return TT_VertHeader.nVersion(address()); }
        /** @return the value of the {@code Ascender} field. */
        @NativeType("FT_Short")
        public short Ascender() { return TT_VertHeader.nAscender(address()); }
        /** @return the value of the {@code Descender} field. */
        @NativeType("FT_Short")
        public short Descender() { return TT_VertHeader.nDescender(address()); }
        /** @return the value of the {@code Line_Gap} field. */
        @NativeType("FT_Short")
        public short Line_Gap() { return TT_VertHeader.nLine_Gap(address()); }
        /** @return the value of the {@link TT_VertHeader#advance_Height_Max} field. */
        @NativeType("FT_UShort")
        public short advance_Height_Max() { return TT_VertHeader.nadvance_Height_Max(address()); }
        /** @return the value of the {@link TT_VertHeader#min_Top_Side_Bearing} field. */
        @NativeType("FT_Short")
        public short min_Top_Side_Bearing() { return TT_VertHeader.nmin_Top_Side_Bearing(address()); }
        /** @return the value of the {@link TT_VertHeader#min_Bottom_Side_Bearing} field. */
        @NativeType("FT_Short")
        public short min_Bottom_Side_Bearing() { return TT_VertHeader.nmin_Bottom_Side_Bearing(address()); }
        /** @return the value of the {@link TT_VertHeader#yMax_Extent} field. */
        @NativeType("FT_Short")
        public short yMax_Extent() { return TT_VertHeader.nyMax_Extent(address()); }
        /** @return the value of the {@code caret_Slope_Rise} field. */
        @NativeType("FT_Short")
        public short caret_Slope_Rise() { return TT_VertHeader.ncaret_Slope_Rise(address()); }
        /** @return the value of the {@code caret_Slope_Run} field. */
        @NativeType("FT_Short")
        public short caret_Slope_Run() { return TT_VertHeader.ncaret_Slope_Run(address()); }
        /** @return the value of the {@code caret_Offset} field. */
        @NativeType("FT_Short")
        public short caret_Offset() { return TT_VertHeader.ncaret_Offset(address()); }
        /** @return a {@link ShortBuffer} view of the {@code Reserved} field. */
        @NativeType("FT_Short[4]")
        public ShortBuffer Reserved() { return TT_VertHeader.nReserved(address()); }
        /** @return the value at the specified index of the {@code Reserved} field. */
        @NativeType("FT_Short")
        public short Reserved(int index) { return TT_VertHeader.nReserved(address(), index); }
        /** @return the value of the {@code metric_Data_Format} field. */
        @NativeType("FT_Short")
        public short metric_Data_Format() { return TT_VertHeader.nmetric_Data_Format(address()); }
        /** @return the value of the {@code number_Of_VMetrics} field. */
        @NativeType("FT_UShort")
        public short number_Of_VMetrics() { return TT_VertHeader.nnumber_Of_VMetrics(address()); }
        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@code long_metrics} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @Nullable
        @NativeType("void *")
        public ByteBuffer long_metrics(int capacity) { return TT_VertHeader.nlong_metrics(address(), capacity); }
        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@code short_metrics} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @Nullable
        @NativeType("void *")
        public ByteBuffer short_metrics(int capacity) { return TT_VertHeader.nshort_metrics(address(), capacity); }

    }

}