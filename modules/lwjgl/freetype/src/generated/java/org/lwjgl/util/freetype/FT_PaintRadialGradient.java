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
 * A structure representing a {@code PaintRadialGradient} value of the {@code COLR} v1 extensions.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_PaintRadialGradient {
 *     {@link FT_ColorLine FT_ColorLine} colorline;
 *     {@link FT_Vector FT_Vector} c0;
 *     FT_Pos r0;
 *     {@link FT_Vector FT_Vector} c1;
 *     FT_Pos r1;
 * }</code></pre>
 */
public class FT_PaintRadialGradient extends Struct<FT_PaintRadialGradient> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        COLORLINE,
        C0,
        R0,
        C1,
        R1;

    static {
        Layout layout = __struct(
            __member(FT_ColorLine.SIZEOF, FT_ColorLine.ALIGNOF),
            __member(FT_Vector.SIZEOF, FT_Vector.ALIGNOF),
            __member(CLONG_SIZE),
            __member(FT_Vector.SIZEOF, FT_Vector.ALIGNOF),
            __member(CLONG_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        COLORLINE = layout.offsetof(0);
        C0 = layout.offsetof(1);
        R0 = layout.offsetof(2);
        C1 = layout.offsetof(3);
        R1 = layout.offsetof(4);
    }

    protected FT_PaintRadialGradient(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_PaintRadialGradient create(long address, @Nullable ByteBuffer container) {
        return new FT_PaintRadialGradient(address, container);
    }

    /**
     * Creates a {@code FT_PaintRadialGradient} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_PaintRadialGradient(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link FT_ColorLine} view of the {@code colorline} field. */
    public FT_ColorLine colorline() { return ncolorline(address()); }
    /** @return a {@link FT_Vector} view of the {@code c0} field. */
    public FT_Vector c0() { return nc0(address()); }
    /** @return the value of the {@code r0} field. */
    @NativeType("FT_Pos")
    public long r0() { return nr0(address()); }
    /** @return a {@link FT_Vector} view of the {@code c1} field. */
    public FT_Vector c1() { return nc1(address()); }
    /** @return the value of the {@code r1} field. */
    @NativeType("FT_Pos")
    public long r1() { return nr1(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_PaintRadialGradient} instance for the specified memory address. */
    public static FT_PaintRadialGradient create(long address) {
        return new FT_PaintRadialGradient(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_PaintRadialGradient createSafe(long address) {
        return address == NULL ? null : new FT_PaintRadialGradient(address, null);
    }

    /**
     * Create a {@link FT_PaintRadialGradient.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_PaintRadialGradient.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_PaintRadialGradient.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #colorline}. */
    public static FT_ColorLine ncolorline(long struct) { return FT_ColorLine.create(struct + FT_PaintRadialGradient.COLORLINE); }
    /** Unsafe version of {@link #c0}. */
    public static FT_Vector nc0(long struct) { return FT_Vector.create(struct + FT_PaintRadialGradient.C0); }
    /** Unsafe version of {@link #r0}. */
    public static long nr0(long struct) { return memGetCLong(struct + FT_PaintRadialGradient.R0); }
    /** Unsafe version of {@link #c1}. */
    public static FT_Vector nc1(long struct) { return FT_Vector.create(struct + FT_PaintRadialGradient.C1); }
    /** Unsafe version of {@link #r1}. */
    public static long nr1(long struct) { return memGetCLong(struct + FT_PaintRadialGradient.R1); }

    // -----------------------------------

    /** An array of {@link FT_PaintRadialGradient} structs. */
    public static class Buffer extends StructBuffer<FT_PaintRadialGradient, Buffer> {

        private static final FT_PaintRadialGradient ELEMENT_FACTORY = FT_PaintRadialGradient.create(-1L);

        /**
         * Creates a new {@code FT_PaintRadialGradient.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_PaintRadialGradient#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_PaintRadialGradient getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FT_ColorLine} view of the {@code colorline} field. */
        public FT_ColorLine colorline() { return FT_PaintRadialGradient.ncolorline(address()); }
        /** @return a {@link FT_Vector} view of the {@code c0} field. */
        public FT_Vector c0() { return FT_PaintRadialGradient.nc0(address()); }
        /** @return the value of the {@code r0} field. */
        @NativeType("FT_Pos")
        public long r0() { return FT_PaintRadialGradient.nr0(address()); }
        /** @return a {@link FT_Vector} view of the {@code c1} field. */
        public FT_Vector c1() { return FT_PaintRadialGradient.nc1(address()); }
        /** @return the value of the {@code r1} field. */
        @NativeType("FT_Pos")
        public long r1() { return FT_PaintRadialGradient.nr1(address()); }

    }

}