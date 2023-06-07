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
 * A structure to model a TrueType horizontal header, the {@code hhea} table, as well as the corresponding horizontal metrics table, {@code hmtx}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct TT_HoriHeader {
 *     FT_Fixed Version;
 *     FT_Short Ascender;
 *     FT_Short Descender;
 *     FT_Short Line_Gap;
 *     FT_UShort {@link #advance_Width_Max};
 *     FT_Short {@link #min_Left_Side_Bearing};
 *     FT_Short {@link #min_Right_Side_Bearing};
 *     FT_Short {@link #xMax_Extent};
 *     FT_Short caret_Slope_Rise;
 *     FT_Short caret_Slope_Run;
 *     FT_Short caret_Offset;
 *     FT_Short Reserved[4];
 *     FT_Short metric_Data_Format;
 *     FT_UShort number_Of_HMetrics;
 *     void * long_metrics;
 *     void * short_metrics;
 * }</code></pre>
 */
public class TT_HoriHeader extends Struct<TT_HoriHeader> {

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
        ADVANCE_WIDTH_MAX,
        MIN_LEFT_SIDE_BEARING,
        MIN_RIGHT_SIDE_BEARING,
        XMAX_EXTENT,
        CARET_SLOPE_RISE,
        CARET_SLOPE_RUN,
        CARET_OFFSET,
        RESERVED,
        METRIC_DATA_FORMAT,
        NUMBER_OF_HMETRICS,
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
        ADVANCE_WIDTH_MAX = layout.offsetof(4);
        MIN_LEFT_SIDE_BEARING = layout.offsetof(5);
        MIN_RIGHT_SIDE_BEARING = layout.offsetof(6);
        XMAX_EXTENT = layout.offsetof(7);
        CARET_SLOPE_RISE = layout.offsetof(8);
        CARET_SLOPE_RUN = layout.offsetof(9);
        CARET_OFFSET = layout.offsetof(10);
        RESERVED = layout.offsetof(11);
        METRIC_DATA_FORMAT = layout.offsetof(12);
        NUMBER_OF_HMETRICS = layout.offsetof(13);
        LONG_METRICS = layout.offsetof(14);
        SHORT_METRICS = layout.offsetof(15);
    }

    protected TT_HoriHeader(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected TT_HoriHeader create(long address, @Nullable ByteBuffer container) {
        return new TT_HoriHeader(address, container);
    }

    /**
     * Creates a {@code TT_HoriHeader} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public TT_HoriHeader(ByteBuffer container) {
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
    /** advance width maximum */
    @NativeType("FT_UShort")
    public short advance_Width_Max() { return nadvance_Width_Max(address()); }
    /** minimum left-sb */
    @NativeType("FT_Short")
    public short min_Left_Side_Bearing() { return nmin_Left_Side_Bearing(address()); }
    /** minimum right-sb */
    @NativeType("FT_Short")
    public short min_Right_Side_Bearing() { return nmin_Right_Side_Bearing(address()); }
    /** xmax extents */
    @NativeType("FT_Short")
    public short xMax_Extent() { return nxMax_Extent(address()); }
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
    /** @return the value of the {@code number_Of_HMetrics} field. */
    @NativeType("FT_UShort")
    public short number_Of_HMetrics() { return nnumber_Of_HMetrics(address()); }
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

    /** Returns a new {@code TT_HoriHeader} instance for the specified memory address. */
    public static TT_HoriHeader create(long address) {
        return new TT_HoriHeader(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static TT_HoriHeader createSafe(long address) {
        return address == NULL ? null : new TT_HoriHeader(address, null);
    }

    /**
     * Create a {@link TT_HoriHeader.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static TT_HoriHeader.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static TT_HoriHeader.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Version}. */
    public static long nVersion(long struct) { return memGetCLong(struct + TT_HoriHeader.VERSION); }
    /** Unsafe version of {@link #Ascender}. */
    public static short nAscender(long struct) { return UNSAFE.getShort(null, struct + TT_HoriHeader.ASCENDER); }
    /** Unsafe version of {@link #Descender}. */
    public static short nDescender(long struct) { return UNSAFE.getShort(null, struct + TT_HoriHeader.DESCENDER); }
    /** Unsafe version of {@link #Line_Gap}. */
    public static short nLine_Gap(long struct) { return UNSAFE.getShort(null, struct + TT_HoriHeader.LINE_GAP); }
    /** Unsafe version of {@link #advance_Width_Max}. */
    public static short nadvance_Width_Max(long struct) { return UNSAFE.getShort(null, struct + TT_HoriHeader.ADVANCE_WIDTH_MAX); }
    /** Unsafe version of {@link #min_Left_Side_Bearing}. */
    public static short nmin_Left_Side_Bearing(long struct) { return UNSAFE.getShort(null, struct + TT_HoriHeader.MIN_LEFT_SIDE_BEARING); }
    /** Unsafe version of {@link #min_Right_Side_Bearing}. */
    public static short nmin_Right_Side_Bearing(long struct) { return UNSAFE.getShort(null, struct + TT_HoriHeader.MIN_RIGHT_SIDE_BEARING); }
    /** Unsafe version of {@link #xMax_Extent}. */
    public static short nxMax_Extent(long struct) { return UNSAFE.getShort(null, struct + TT_HoriHeader.XMAX_EXTENT); }
    /** Unsafe version of {@link #caret_Slope_Rise}. */
    public static short ncaret_Slope_Rise(long struct) { return UNSAFE.getShort(null, struct + TT_HoriHeader.CARET_SLOPE_RISE); }
    /** Unsafe version of {@link #caret_Slope_Run}. */
    public static short ncaret_Slope_Run(long struct) { return UNSAFE.getShort(null, struct + TT_HoriHeader.CARET_SLOPE_RUN); }
    /** Unsafe version of {@link #caret_Offset}. */
    public static short ncaret_Offset(long struct) { return UNSAFE.getShort(null, struct + TT_HoriHeader.CARET_OFFSET); }
    /** Unsafe version of {@link #Reserved}. */
    public static ShortBuffer nReserved(long struct) { return memShortBuffer(struct + TT_HoriHeader.RESERVED, 4); }
    /** Unsafe version of {@link #Reserved(int) Reserved}. */
    public static short nReserved(long struct, int index) {
        return UNSAFE.getShort(null, struct + TT_HoriHeader.RESERVED + check(index, 4) * 2);
    }
    /** Unsafe version of {@link #metric_Data_Format}. */
    public static short nmetric_Data_Format(long struct) { return UNSAFE.getShort(null, struct + TT_HoriHeader.METRIC_DATA_FORMAT); }
    /** Unsafe version of {@link #number_Of_HMetrics}. */
    public static short nnumber_Of_HMetrics(long struct) { return UNSAFE.getShort(null, struct + TT_HoriHeader.NUMBER_OF_HMETRICS); }
    /** Unsafe version of {@link #long_metrics(int) long_metrics}. */
    @Nullable public static ByteBuffer nlong_metrics(long struct, int capacity) { return memByteBufferSafe(memGetAddress(struct + TT_HoriHeader.LONG_METRICS), capacity); }
    /** Unsafe version of {@link #short_metrics(int) short_metrics}. */
    @Nullable public static ByteBuffer nshort_metrics(long struct, int capacity) { return memByteBufferSafe(memGetAddress(struct + TT_HoriHeader.SHORT_METRICS), capacity); }

    // -----------------------------------

    /** An array of {@link TT_HoriHeader} structs. */
    public static class Buffer extends StructBuffer<TT_HoriHeader, Buffer> {

        private static final TT_HoriHeader ELEMENT_FACTORY = TT_HoriHeader.create(-1L);

        /**
         * Creates a new {@code TT_HoriHeader.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link TT_HoriHeader#SIZEOF}, and its mark will be undefined.</p>
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
        protected TT_HoriHeader getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code Version} field. */
        @NativeType("FT_Fixed")
        public long Version() { return TT_HoriHeader.nVersion(address()); }
        /** @return the value of the {@code Ascender} field. */
        @NativeType("FT_Short")
        public short Ascender() { return TT_HoriHeader.nAscender(address()); }
        /** @return the value of the {@code Descender} field. */
        @NativeType("FT_Short")
        public short Descender() { return TT_HoriHeader.nDescender(address()); }
        /** @return the value of the {@code Line_Gap} field. */
        @NativeType("FT_Short")
        public short Line_Gap() { return TT_HoriHeader.nLine_Gap(address()); }
        /** @return the value of the {@link TT_HoriHeader#advance_Width_Max} field. */
        @NativeType("FT_UShort")
        public short advance_Width_Max() { return TT_HoriHeader.nadvance_Width_Max(address()); }
        /** @return the value of the {@link TT_HoriHeader#min_Left_Side_Bearing} field. */
        @NativeType("FT_Short")
        public short min_Left_Side_Bearing() { return TT_HoriHeader.nmin_Left_Side_Bearing(address()); }
        /** @return the value of the {@link TT_HoriHeader#min_Right_Side_Bearing} field. */
        @NativeType("FT_Short")
        public short min_Right_Side_Bearing() { return TT_HoriHeader.nmin_Right_Side_Bearing(address()); }
        /** @return the value of the {@link TT_HoriHeader#xMax_Extent} field. */
        @NativeType("FT_Short")
        public short xMax_Extent() { return TT_HoriHeader.nxMax_Extent(address()); }
        /** @return the value of the {@code caret_Slope_Rise} field. */
        @NativeType("FT_Short")
        public short caret_Slope_Rise() { return TT_HoriHeader.ncaret_Slope_Rise(address()); }
        /** @return the value of the {@code caret_Slope_Run} field. */
        @NativeType("FT_Short")
        public short caret_Slope_Run() { return TT_HoriHeader.ncaret_Slope_Run(address()); }
        /** @return the value of the {@code caret_Offset} field. */
        @NativeType("FT_Short")
        public short caret_Offset() { return TT_HoriHeader.ncaret_Offset(address()); }
        /** @return a {@link ShortBuffer} view of the {@code Reserved} field. */
        @NativeType("FT_Short[4]")
        public ShortBuffer Reserved() { return TT_HoriHeader.nReserved(address()); }
        /** @return the value at the specified index of the {@code Reserved} field. */
        @NativeType("FT_Short")
        public short Reserved(int index) { return TT_HoriHeader.nReserved(address(), index); }
        /** @return the value of the {@code metric_Data_Format} field. */
        @NativeType("FT_Short")
        public short metric_Data_Format() { return TT_HoriHeader.nmetric_Data_Format(address()); }
        /** @return the value of the {@code number_Of_HMetrics} field. */
        @NativeType("FT_UShort")
        public short number_Of_HMetrics() { return TT_HoriHeader.nnumber_Of_HMetrics(address()); }
        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@code long_metrics} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @Nullable
        @NativeType("void *")
        public ByteBuffer long_metrics(int capacity) { return TT_HoriHeader.nlong_metrics(address(), capacity); }
        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@code short_metrics} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @Nullable
        @NativeType("void *")
        public ByteBuffer short_metrics(int capacity) { return TT_HoriHeader.nshort_metrics(address(), capacity); }

    }

}