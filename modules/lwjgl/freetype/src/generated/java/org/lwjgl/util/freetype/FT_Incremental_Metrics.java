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
 * A small structure used to contain the basic glyph metrics returned by the {@link FT_Incremental_GetGlyphMetricsFunc} method.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_Incremental_MetricsRec {
 *     FT_Long bearing_x;
 *     FT_Long bearing_y;
 *     FT_Long advance;
 *     FT_Long advance_v;
 * }</code></pre>
 */
@NativeType("struct FT_Incremental_MetricsRec")
public class FT_Incremental_Metrics extends Struct<FT_Incremental_Metrics> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BEARING_X,
        BEARING_Y,
        ADVANCE,
        ADVANCE_V;

    static {
        Layout layout = __struct(
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BEARING_X = layout.offsetof(0);
        BEARING_Y = layout.offsetof(1);
        ADVANCE = layout.offsetof(2);
        ADVANCE_V = layout.offsetof(3);
    }

    protected FT_Incremental_Metrics(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_Incremental_Metrics create(long address, @Nullable ByteBuffer container) {
        return new FT_Incremental_Metrics(address, container);
    }

    /**
     * Creates a {@code FT_Incremental_Metrics} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_Incremental_Metrics(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code bearing_x} field. */
    @NativeType("FT_Long")
    public long bearing_x() { return nbearing_x(address()); }
    /** @return the value of the {@code bearing_y} field. */
    @NativeType("FT_Long")
    public long bearing_y() { return nbearing_y(address()); }
    /** @return the value of the {@code advance} field. */
    @NativeType("FT_Long")
    public long advance() { return nadvance(address()); }
    /** @return the value of the {@code advance_v} field. */
    @NativeType("FT_Long")
    public long advance_v() { return nadvance_v(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_Incremental_Metrics} instance for the specified memory address. */
    public static FT_Incremental_Metrics create(long address) {
        return new FT_Incremental_Metrics(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Incremental_Metrics createSafe(long address) {
        return address == NULL ? null : new FT_Incremental_Metrics(address, null);
    }

    /**
     * Create a {@link FT_Incremental_Metrics.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_Incremental_Metrics.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Incremental_Metrics.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #bearing_x}. */
    public static long nbearing_x(long struct) { return memGetCLong(struct + FT_Incremental_Metrics.BEARING_X); }
    /** Unsafe version of {@link #bearing_y}. */
    public static long nbearing_y(long struct) { return memGetCLong(struct + FT_Incremental_Metrics.BEARING_Y); }
    /** Unsafe version of {@link #advance}. */
    public static long nadvance(long struct) { return memGetCLong(struct + FT_Incremental_Metrics.ADVANCE); }
    /** Unsafe version of {@link #advance_v}. */
    public static long nadvance_v(long struct) { return memGetCLong(struct + FT_Incremental_Metrics.ADVANCE_V); }

    // -----------------------------------

    /** An array of {@link FT_Incremental_Metrics} structs. */
    public static class Buffer extends StructBuffer<FT_Incremental_Metrics, Buffer> {

        private static final FT_Incremental_Metrics ELEMENT_FACTORY = FT_Incremental_Metrics.create(-1L);

        /**
         * Creates a new {@code FT_Incremental_Metrics.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_Incremental_Metrics#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_Incremental_Metrics getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code bearing_x} field. */
        @NativeType("FT_Long")
        public long bearing_x() { return FT_Incremental_Metrics.nbearing_x(address()); }
        /** @return the value of the {@code bearing_y} field. */
        @NativeType("FT_Long")
        public long bearing_y() { return FT_Incremental_Metrics.nbearing_y(address()); }
        /** @return the value of the {@code advance} field. */
        @NativeType("FT_Long")
        public long advance() { return FT_Incremental_Metrics.nadvance(address()); }
        /** @return the value of the {@code advance_v} field. */
        @NativeType("FT_Long")
        public long advance_v() { return FT_Incremental_Metrics.nadvance_v(address()); }

    }

}