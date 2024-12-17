/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <pre>{@code
 * struct FT_Size_Metrics {
 *     FT_UShort x_ppem;
 *     FT_UShort y_ppem;
 *     FT_Fixed x_scale;
 *     FT_Fixed y_scale;
 *     FT_Pos ascender;
 *     FT_Pos descender;
 *     FT_Pos height;
 *     FT_Pos max_advance;
 * }}</pre>
 */
public class FT_Size_Metrics extends Struct<FT_Size_Metrics> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        X_PPEM,
        Y_PPEM,
        X_SCALE,
        Y_SCALE,
        ASCENDER,
        DESCENDER,
        HEIGHT,
        MAX_ADVANCE;

    static {
        Layout layout = __struct(
            __member(2),
            __member(2),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        X_PPEM = layout.offsetof(0);
        Y_PPEM = layout.offsetof(1);
        X_SCALE = layout.offsetof(2);
        Y_SCALE = layout.offsetof(3);
        ASCENDER = layout.offsetof(4);
        DESCENDER = layout.offsetof(5);
        HEIGHT = layout.offsetof(6);
        MAX_ADVANCE = layout.offsetof(7);
    }

    protected FT_Size_Metrics(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_Size_Metrics create(long address, @Nullable ByteBuffer container) {
        return new FT_Size_Metrics(address, container);
    }

    /**
     * Creates a {@code FT_Size_Metrics} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_Size_Metrics(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code x_ppem} field. */
    @NativeType("FT_UShort")
    public short x_ppem() { return nx_ppem(address()); }
    /** @return the value of the {@code y_ppem} field. */
    @NativeType("FT_UShort")
    public short y_ppem() { return ny_ppem(address()); }
    /** @return the value of the {@code x_scale} field. */
    @NativeType("FT_Fixed")
    public long x_scale() { return nx_scale(address()); }
    /** @return the value of the {@code y_scale} field. */
    @NativeType("FT_Fixed")
    public long y_scale() { return ny_scale(address()); }
    /** @return the value of the {@code ascender} field. */
    @NativeType("FT_Pos")
    public long ascender() { return nascender(address()); }
    /** @return the value of the {@code descender} field. */
    @NativeType("FT_Pos")
    public long descender() { return ndescender(address()); }
    /** @return the value of the {@code height} field. */
    @NativeType("FT_Pos")
    public long height() { return nheight(address()); }
    /** @return the value of the {@code max_advance} field. */
    @NativeType("FT_Pos")
    public long max_advance() { return nmax_advance(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_Size_Metrics} instance for the specified memory address. */
    public static FT_Size_Metrics create(long address) {
        return new FT_Size_Metrics(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable FT_Size_Metrics createSafe(long address) {
        return address == NULL ? null : new FT_Size_Metrics(address, null);
    }

    /**
     * Create a {@link FT_Size_Metrics.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_Size_Metrics.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static FT_Size_Metrics.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x_ppem}. */
    public static short nx_ppem(long struct) { return memGetShort(struct + FT_Size_Metrics.X_PPEM); }
    /** Unsafe version of {@link #y_ppem}. */
    public static short ny_ppem(long struct) { return memGetShort(struct + FT_Size_Metrics.Y_PPEM); }
    /** Unsafe version of {@link #x_scale}. */
    public static long nx_scale(long struct) { return memGetCLong(struct + FT_Size_Metrics.X_SCALE); }
    /** Unsafe version of {@link #y_scale}. */
    public static long ny_scale(long struct) { return memGetCLong(struct + FT_Size_Metrics.Y_SCALE); }
    /** Unsafe version of {@link #ascender}. */
    public static long nascender(long struct) { return memGetCLong(struct + FT_Size_Metrics.ASCENDER); }
    /** Unsafe version of {@link #descender}. */
    public static long ndescender(long struct) { return memGetCLong(struct + FT_Size_Metrics.DESCENDER); }
    /** Unsafe version of {@link #height}. */
    public static long nheight(long struct) { return memGetCLong(struct + FT_Size_Metrics.HEIGHT); }
    /** Unsafe version of {@link #max_advance}. */
    public static long nmax_advance(long struct) { return memGetCLong(struct + FT_Size_Metrics.MAX_ADVANCE); }

    // -----------------------------------

    /** An array of {@link FT_Size_Metrics} structs. */
    public static class Buffer extends StructBuffer<FT_Size_Metrics, Buffer> {

        private static final FT_Size_Metrics ELEMENT_FACTORY = FT_Size_Metrics.create(-1L);

        /**
         * Creates a new {@code FT_Size_Metrics.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_Size_Metrics#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected FT_Size_Metrics getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code x_ppem} field. */
        @NativeType("FT_UShort")
        public short x_ppem() { return FT_Size_Metrics.nx_ppem(address()); }
        /** @return the value of the {@code y_ppem} field. */
        @NativeType("FT_UShort")
        public short y_ppem() { return FT_Size_Metrics.ny_ppem(address()); }
        /** @return the value of the {@code x_scale} field. */
        @NativeType("FT_Fixed")
        public long x_scale() { return FT_Size_Metrics.nx_scale(address()); }
        /** @return the value of the {@code y_scale} field. */
        @NativeType("FT_Fixed")
        public long y_scale() { return FT_Size_Metrics.ny_scale(address()); }
        /** @return the value of the {@code ascender} field. */
        @NativeType("FT_Pos")
        public long ascender() { return FT_Size_Metrics.nascender(address()); }
        /** @return the value of the {@code descender} field. */
        @NativeType("FT_Pos")
        public long descender() { return FT_Size_Metrics.ndescender(address()); }
        /** @return the value of the {@code height} field. */
        @NativeType("FT_Pos")
        public long height() { return FT_Size_Metrics.nheight(address()); }
        /** @return the value of the {@code max_advance} field. */
        @NativeType("FT_Pos")
        public long max_advance() { return FT_Size_Metrics.nmax_advance(address()); }

    }

}