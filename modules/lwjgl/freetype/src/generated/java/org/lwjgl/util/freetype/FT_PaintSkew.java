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
 * A structure representing a {@code COLR} v1 {@code PaintSkew} paint table. Used for skewing or shearing downstream paints by a given center and angle.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_PaintSkew {
 *     {@link FT_OpaquePaint FT_OpaquePaintRec} paint;
 *     FT_Fixed x_skew_angle;
 *     FT_Fixed y_skew_angle;
 *     FT_Fixed center_x;
 *     FT_Fixed center_y;
 * }</code></pre>
 */
public class FT_PaintSkew extends Struct<FT_PaintSkew> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PAINT,
        X_SKEW_ANGLE,
        Y_SKEW_ANGLE,
        CENTER_X,
        CENTER_Y;

    static {
        Layout layout = __struct(
            __member(FT_OpaquePaint.SIZEOF, FT_OpaquePaint.ALIGNOF),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PAINT = layout.offsetof(0);
        X_SKEW_ANGLE = layout.offsetof(1);
        Y_SKEW_ANGLE = layout.offsetof(2);
        CENTER_X = layout.offsetof(3);
        CENTER_Y = layout.offsetof(4);
    }

    protected FT_PaintSkew(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_PaintSkew create(long address, @Nullable ByteBuffer container) {
        return new FT_PaintSkew(address, container);
    }

    /**
     * Creates a {@code FT_PaintSkew} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_PaintSkew(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link FT_OpaquePaint} view of the {@code paint} field. */
    @NativeType("FT_OpaquePaintRec")
    public FT_OpaquePaint paint() { return npaint(address()); }
    /** @return the value of the {@code x_skew_angle} field. */
    @NativeType("FT_Fixed")
    public long x_skew_angle() { return nx_skew_angle(address()); }
    /** @return the value of the {@code y_skew_angle} field. */
    @NativeType("FT_Fixed")
    public long y_skew_angle() { return ny_skew_angle(address()); }
    /** @return the value of the {@code center_x} field. */
    @NativeType("FT_Fixed")
    public long center_x() { return ncenter_x(address()); }
    /** @return the value of the {@code center_y} field. */
    @NativeType("FT_Fixed")
    public long center_y() { return ncenter_y(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_PaintSkew} instance for the specified memory address. */
    public static FT_PaintSkew create(long address) {
        return new FT_PaintSkew(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_PaintSkew createSafe(long address) {
        return address == NULL ? null : new FT_PaintSkew(address, null);
    }

    /**
     * Create a {@link FT_PaintSkew.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_PaintSkew.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_PaintSkew.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #paint}. */
    public static FT_OpaquePaint npaint(long struct) { return FT_OpaquePaint.create(struct + FT_PaintSkew.PAINT); }
    /** Unsafe version of {@link #x_skew_angle}. */
    public static long nx_skew_angle(long struct) { return memGetCLong(struct + FT_PaintSkew.X_SKEW_ANGLE); }
    /** Unsafe version of {@link #y_skew_angle}. */
    public static long ny_skew_angle(long struct) { return memGetCLong(struct + FT_PaintSkew.Y_SKEW_ANGLE); }
    /** Unsafe version of {@link #center_x}. */
    public static long ncenter_x(long struct) { return memGetCLong(struct + FT_PaintSkew.CENTER_X); }
    /** Unsafe version of {@link #center_y}. */
    public static long ncenter_y(long struct) { return memGetCLong(struct + FT_PaintSkew.CENTER_Y); }

    // -----------------------------------

    /** An array of {@link FT_PaintSkew} structs. */
    public static class Buffer extends StructBuffer<FT_PaintSkew, Buffer> {

        private static final FT_PaintSkew ELEMENT_FACTORY = FT_PaintSkew.create(-1L);

        /**
         * Creates a new {@code FT_PaintSkew.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_PaintSkew#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_PaintSkew getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FT_OpaquePaint} view of the {@code paint} field. */
        @NativeType("FT_OpaquePaintRec")
        public FT_OpaquePaint paint() { return FT_PaintSkew.npaint(address()); }
        /** @return the value of the {@code x_skew_angle} field. */
        @NativeType("FT_Fixed")
        public long x_skew_angle() { return FT_PaintSkew.nx_skew_angle(address()); }
        /** @return the value of the {@code y_skew_angle} field. */
        @NativeType("FT_Fixed")
        public long y_skew_angle() { return FT_PaintSkew.ny_skew_angle(address()); }
        /** @return the value of the {@code center_x} field. */
        @NativeType("FT_Fixed")
        public long center_x() { return FT_PaintSkew.ncenter_x(address()); }
        /** @return the value of the {@code center_y} field. */
        @NativeType("FT_Fixed")
        public long center_y() { return FT_PaintSkew.ncenter_y(address()); }

    }

}