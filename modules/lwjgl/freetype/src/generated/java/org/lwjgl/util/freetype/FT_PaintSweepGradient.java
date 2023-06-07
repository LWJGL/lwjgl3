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
 * A structure representing a {@code PaintSweepGradient} value of the {@code COLR} v1 extensions.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_PaintSweepGradient {
 *     {@link FT_ColorLine FT_ColorLine} colorline;
 *     {@link FT_Vector FT_Vector} center;
 *     FT_Fixed start_angle;
 *     FT_Fixed end_angle;
 * }</code></pre>
 */
public class FT_PaintSweepGradient extends Struct<FT_PaintSweepGradient> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        COLORLINE,
        CENTER,
        START_ANGLE,
        END_ANGLE;

    static {
        Layout layout = __struct(
            __member(FT_ColorLine.SIZEOF, FT_ColorLine.ALIGNOF),
            __member(FT_Vector.SIZEOF, FT_Vector.ALIGNOF),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        COLORLINE = layout.offsetof(0);
        CENTER = layout.offsetof(1);
        START_ANGLE = layout.offsetof(2);
        END_ANGLE = layout.offsetof(3);
    }

    protected FT_PaintSweepGradient(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_PaintSweepGradient create(long address, @Nullable ByteBuffer container) {
        return new FT_PaintSweepGradient(address, container);
    }

    /**
     * Creates a {@code FT_PaintSweepGradient} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_PaintSweepGradient(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link FT_ColorLine} view of the {@code colorline} field. */
    public FT_ColorLine colorline() { return ncolorline(address()); }
    /** @return a {@link FT_Vector} view of the {@code center} field. */
    public FT_Vector center() { return ncenter(address()); }
    /** @return the value of the {@code start_angle} field. */
    @NativeType("FT_Fixed")
    public long start_angle() { return nstart_angle(address()); }
    /** @return the value of the {@code end_angle} field. */
    @NativeType("FT_Fixed")
    public long end_angle() { return nend_angle(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_PaintSweepGradient} instance for the specified memory address. */
    public static FT_PaintSweepGradient create(long address) {
        return new FT_PaintSweepGradient(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_PaintSweepGradient createSafe(long address) {
        return address == NULL ? null : new FT_PaintSweepGradient(address, null);
    }

    /**
     * Create a {@link FT_PaintSweepGradient.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_PaintSweepGradient.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_PaintSweepGradient.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #colorline}. */
    public static FT_ColorLine ncolorline(long struct) { return FT_ColorLine.create(struct + FT_PaintSweepGradient.COLORLINE); }
    /** Unsafe version of {@link #center}. */
    public static FT_Vector ncenter(long struct) { return FT_Vector.create(struct + FT_PaintSweepGradient.CENTER); }
    /** Unsafe version of {@link #start_angle}. */
    public static long nstart_angle(long struct) { return memGetCLong(struct + FT_PaintSweepGradient.START_ANGLE); }
    /** Unsafe version of {@link #end_angle}. */
    public static long nend_angle(long struct) { return memGetCLong(struct + FT_PaintSweepGradient.END_ANGLE); }

    // -----------------------------------

    /** An array of {@link FT_PaintSweepGradient} structs. */
    public static class Buffer extends StructBuffer<FT_PaintSweepGradient, Buffer> {

        private static final FT_PaintSweepGradient ELEMENT_FACTORY = FT_PaintSweepGradient.create(-1L);

        /**
         * Creates a new {@code FT_PaintSweepGradient.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_PaintSweepGradient#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_PaintSweepGradient getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FT_ColorLine} view of the {@code colorline} field. */
        public FT_ColorLine colorline() { return FT_PaintSweepGradient.ncolorline(address()); }
        /** @return a {@link FT_Vector} view of the {@code center} field. */
        public FT_Vector center() { return FT_PaintSweepGradient.ncenter(address()); }
        /** @return the value of the {@code start_angle} field. */
        @NativeType("FT_Fixed")
        public long start_angle() { return FT_PaintSweepGradient.nstart_angle(address()); }
        /** @return the value of the {@code end_angle} field. */
        @NativeType("FT_Fixed")
        public long end_angle() { return FT_PaintSweepGradient.nend_angle(address()); }

    }

}