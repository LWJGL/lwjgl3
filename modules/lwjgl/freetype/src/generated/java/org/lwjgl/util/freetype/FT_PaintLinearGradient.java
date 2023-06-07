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
 * A structure representing a {@code PaintLinearGradient} value of the {@code COLR} v1 extensions.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_PaintLinearGradient {
 *     {@link FT_ColorLine FT_ColorLine} colorline;
 *     {@link FT_Vector FT_Vector} p0;
 *     {@link FT_Vector FT_Vector} p1;
 *     {@link FT_Vector FT_Vector} p2;
 * }</code></pre>
 */
public class FT_PaintLinearGradient extends Struct<FT_PaintLinearGradient> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        COLORLINE,
        P0,
        P1,
        P2;

    static {
        Layout layout = __struct(
            __member(FT_ColorLine.SIZEOF, FT_ColorLine.ALIGNOF),
            __member(FT_Vector.SIZEOF, FT_Vector.ALIGNOF),
            __member(FT_Vector.SIZEOF, FT_Vector.ALIGNOF),
            __member(FT_Vector.SIZEOF, FT_Vector.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        COLORLINE = layout.offsetof(0);
        P0 = layout.offsetof(1);
        P1 = layout.offsetof(2);
        P2 = layout.offsetof(3);
    }

    protected FT_PaintLinearGradient(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_PaintLinearGradient create(long address, @Nullable ByteBuffer container) {
        return new FT_PaintLinearGradient(address, container);
    }

    /**
     * Creates a {@code FT_PaintLinearGradient} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_PaintLinearGradient(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link FT_ColorLine} view of the {@code colorline} field. */
    public FT_ColorLine colorline() { return ncolorline(address()); }
    /** @return a {@link FT_Vector} view of the {@code p0} field. */
    public FT_Vector p0() { return np0(address()); }
    /** @return a {@link FT_Vector} view of the {@code p1} field. */
    public FT_Vector p1() { return np1(address()); }
    /** @return a {@link FT_Vector} view of the {@code p2} field. */
    public FT_Vector p2() { return np2(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_PaintLinearGradient} instance for the specified memory address. */
    public static FT_PaintLinearGradient create(long address) {
        return new FT_PaintLinearGradient(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_PaintLinearGradient createSafe(long address) {
        return address == NULL ? null : new FT_PaintLinearGradient(address, null);
    }

    /**
     * Create a {@link FT_PaintLinearGradient.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_PaintLinearGradient.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_PaintLinearGradient.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #colorline}. */
    public static FT_ColorLine ncolorline(long struct) { return FT_ColorLine.create(struct + FT_PaintLinearGradient.COLORLINE); }
    /** Unsafe version of {@link #p0}. */
    public static FT_Vector np0(long struct) { return FT_Vector.create(struct + FT_PaintLinearGradient.P0); }
    /** Unsafe version of {@link #p1}. */
    public static FT_Vector np1(long struct) { return FT_Vector.create(struct + FT_PaintLinearGradient.P1); }
    /** Unsafe version of {@link #p2}. */
    public static FT_Vector np2(long struct) { return FT_Vector.create(struct + FT_PaintLinearGradient.P2); }

    // -----------------------------------

    /** An array of {@link FT_PaintLinearGradient} structs. */
    public static class Buffer extends StructBuffer<FT_PaintLinearGradient, Buffer> {

        private static final FT_PaintLinearGradient ELEMENT_FACTORY = FT_PaintLinearGradient.create(-1L);

        /**
         * Creates a new {@code FT_PaintLinearGradient.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_PaintLinearGradient#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_PaintLinearGradient getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FT_ColorLine} view of the {@code colorline} field. */
        public FT_ColorLine colorline() { return FT_PaintLinearGradient.ncolorline(address()); }
        /** @return a {@link FT_Vector} view of the {@code p0} field. */
        public FT_Vector p0() { return FT_PaintLinearGradient.np0(address()); }
        /** @return a {@link FT_Vector} view of the {@code p1} field. */
        public FT_Vector p1() { return FT_PaintLinearGradient.np1(address()); }
        /** @return a {@link FT_Vector} view of the {@code p2} field. */
        public FT_Vector p2() { return FT_PaintLinearGradient.np2(address()); }

    }

}