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
 * A structure representing all of the {@code COLR} v1 {@code PaintScale*} paint tables.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_PaintScale {
 *     {@link FT_OpaquePaint FT_OpaquePaintRec} paint;
 *     FT_Fixed scale_x;
 *     FT_Fixed scale_y;
 *     FT_Fixed center_x;
 *     FT_Fixed center_y;
 * }</code></pre>
 */
public class FT_PaintScale extends Struct<FT_PaintScale> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PAINT,
        SCALE_X,
        SCALE_Y,
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
        SCALE_X = layout.offsetof(1);
        SCALE_Y = layout.offsetof(2);
        CENTER_X = layout.offsetof(3);
        CENTER_Y = layout.offsetof(4);
    }

    protected FT_PaintScale(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_PaintScale create(long address, @Nullable ByteBuffer container) {
        return new FT_PaintScale(address, container);
    }

    /**
     * Creates a {@code FT_PaintScale} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_PaintScale(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link FT_OpaquePaint} view of the {@code paint} field. */
    @NativeType("FT_OpaquePaintRec")
    public FT_OpaquePaint paint() { return npaint(address()); }
    /** @return the value of the {@code scale_x} field. */
    @NativeType("FT_Fixed")
    public long scale_x() { return nscale_x(address()); }
    /** @return the value of the {@code scale_y} field. */
    @NativeType("FT_Fixed")
    public long scale_y() { return nscale_y(address()); }
    /** @return the value of the {@code center_x} field. */
    @NativeType("FT_Fixed")
    public long center_x() { return ncenter_x(address()); }
    /** @return the value of the {@code center_y} field. */
    @NativeType("FT_Fixed")
    public long center_y() { return ncenter_y(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_PaintScale} instance for the specified memory address. */
    public static FT_PaintScale create(long address) {
        return new FT_PaintScale(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_PaintScale createSafe(long address) {
        return address == NULL ? null : new FT_PaintScale(address, null);
    }

    /**
     * Create a {@link FT_PaintScale.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_PaintScale.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_PaintScale.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #paint}. */
    public static FT_OpaquePaint npaint(long struct) { return FT_OpaquePaint.create(struct + FT_PaintScale.PAINT); }
    /** Unsafe version of {@link #scale_x}. */
    public static long nscale_x(long struct) { return memGetCLong(struct + FT_PaintScale.SCALE_X); }
    /** Unsafe version of {@link #scale_y}. */
    public static long nscale_y(long struct) { return memGetCLong(struct + FT_PaintScale.SCALE_Y); }
    /** Unsafe version of {@link #center_x}. */
    public static long ncenter_x(long struct) { return memGetCLong(struct + FT_PaintScale.CENTER_X); }
    /** Unsafe version of {@link #center_y}. */
    public static long ncenter_y(long struct) { return memGetCLong(struct + FT_PaintScale.CENTER_Y); }

    // -----------------------------------

    /** An array of {@link FT_PaintScale} structs. */
    public static class Buffer extends StructBuffer<FT_PaintScale, Buffer> {

        private static final FT_PaintScale ELEMENT_FACTORY = FT_PaintScale.create(-1L);

        /**
         * Creates a new {@code FT_PaintScale.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_PaintScale#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_PaintScale getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FT_OpaquePaint} view of the {@code paint} field. */
        @NativeType("FT_OpaquePaintRec")
        public FT_OpaquePaint paint() { return FT_PaintScale.npaint(address()); }
        /** @return the value of the {@code scale_x} field. */
        @NativeType("FT_Fixed")
        public long scale_x() { return FT_PaintScale.nscale_x(address()); }
        /** @return the value of the {@code scale_y} field. */
        @NativeType("FT_Fixed")
        public long scale_y() { return FT_PaintScale.nscale_y(address()); }
        /** @return the value of the {@code center_x} field. */
        @NativeType("FT_Fixed")
        public long center_x() { return FT_PaintScale.ncenter_x(address()); }
        /** @return the value of the {@code center_y} field. */
        @NativeType("FT_Fixed")
        public long center_y() { return FT_PaintScale.ncenter_y(address()); }

    }

}