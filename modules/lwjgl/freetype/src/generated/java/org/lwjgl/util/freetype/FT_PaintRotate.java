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
 * A structure representing a {@code COLR} v1 {@code PaintRotate} paint table. Used for rotating downstream paints with a given center and angle.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_PaintRotate {
 *     {@link FT_OpaquePaint FT_OpaquePaintRec} paint;
 *     FT_Fixed angle;
 *     FT_Fixed center_x;
 *     FT_Fixed center_y;
 * }</code></pre>
 */
public class FT_PaintRotate extends Struct<FT_PaintRotate> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PAINT,
        ANGLE,
        CENTER_X,
        CENTER_Y;

    static {
        Layout layout = __struct(
            __member(FT_OpaquePaint.SIZEOF, FT_OpaquePaint.ALIGNOF),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PAINT = layout.offsetof(0);
        ANGLE = layout.offsetof(1);
        CENTER_X = layout.offsetof(2);
        CENTER_Y = layout.offsetof(3);
    }

    protected FT_PaintRotate(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_PaintRotate create(long address, @Nullable ByteBuffer container) {
        return new FT_PaintRotate(address, container);
    }

    /**
     * Creates a {@code FT_PaintRotate} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_PaintRotate(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link FT_OpaquePaint} view of the {@code paint} field. */
    @NativeType("FT_OpaquePaintRec")
    public FT_OpaquePaint paint() { return npaint(address()); }
    /** @return the value of the {@code angle} field. */
    @NativeType("FT_Fixed")
    public long angle() { return nangle(address()); }
    /** @return the value of the {@code center_x} field. */
    @NativeType("FT_Fixed")
    public long center_x() { return ncenter_x(address()); }
    /** @return the value of the {@code center_y} field. */
    @NativeType("FT_Fixed")
    public long center_y() { return ncenter_y(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_PaintRotate} instance for the specified memory address. */
    public static FT_PaintRotate create(long address) {
        return new FT_PaintRotate(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_PaintRotate createSafe(long address) {
        return address == NULL ? null : new FT_PaintRotate(address, null);
    }

    /**
     * Create a {@link FT_PaintRotate.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_PaintRotate.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_PaintRotate.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #paint}. */
    public static FT_OpaquePaint npaint(long struct) { return FT_OpaquePaint.create(struct + FT_PaintRotate.PAINT); }
    /** Unsafe version of {@link #angle}. */
    public static long nangle(long struct) { return memGetCLong(struct + FT_PaintRotate.ANGLE); }
    /** Unsafe version of {@link #center_x}. */
    public static long ncenter_x(long struct) { return memGetCLong(struct + FT_PaintRotate.CENTER_X); }
    /** Unsafe version of {@link #center_y}. */
    public static long ncenter_y(long struct) { return memGetCLong(struct + FT_PaintRotate.CENTER_Y); }

    // -----------------------------------

    /** An array of {@link FT_PaintRotate} structs. */
    public static class Buffer extends StructBuffer<FT_PaintRotate, Buffer> {

        private static final FT_PaintRotate ELEMENT_FACTORY = FT_PaintRotate.create(-1L);

        /**
         * Creates a new {@code FT_PaintRotate.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_PaintRotate#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_PaintRotate getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FT_OpaquePaint} view of the {@code paint} field. */
        @NativeType("FT_OpaquePaintRec")
        public FT_OpaquePaint paint() { return FT_PaintRotate.npaint(address()); }
        /** @return the value of the {@code angle} field. */
        @NativeType("FT_Fixed")
        public long angle() { return FT_PaintRotate.nangle(address()); }
        /** @return the value of the {@code center_x} field. */
        @NativeType("FT_Fixed")
        public long center_x() { return FT_PaintRotate.ncenter_x(address()); }
        /** @return the value of the {@code center_y} field. */
        @NativeType("FT_Fixed")
        public long center_y() { return FT_PaintRotate.ncenter_y(address()); }

    }

}