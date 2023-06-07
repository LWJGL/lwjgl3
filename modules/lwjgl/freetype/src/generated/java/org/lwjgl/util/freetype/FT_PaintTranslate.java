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
 * A structure representing a {@code COLR} v1 {@code PaintTranslate} paint table. Used for translating downstream paints by a given x and y~delta.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_PaintTranslate {
 *     {@link FT_OpaquePaint FT_OpaquePaintRec} paint;
 *     FT_Fixed dx;
 *     FT_Fixed dy;
 * }</code></pre>
 */
public class FT_PaintTranslate extends Struct<FT_PaintTranslate> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PAINT,
        DX,
        DY;

    static {
        Layout layout = __struct(
            __member(FT_OpaquePaint.SIZEOF, FT_OpaquePaint.ALIGNOF),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PAINT = layout.offsetof(0);
        DX = layout.offsetof(1);
        DY = layout.offsetof(2);
    }

    protected FT_PaintTranslate(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_PaintTranslate create(long address, @Nullable ByteBuffer container) {
        return new FT_PaintTranslate(address, container);
    }

    /**
     * Creates a {@code FT_PaintTranslate} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_PaintTranslate(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link FT_OpaquePaint} view of the {@code paint} field. */
    @NativeType("FT_OpaquePaintRec")
    public FT_OpaquePaint paint() { return npaint(address()); }
    /** @return the value of the {@code dx} field. */
    @NativeType("FT_Fixed")
    public long dx() { return ndx(address()); }
    /** @return the value of the {@code dy} field. */
    @NativeType("FT_Fixed")
    public long dy() { return ndy(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_PaintTranslate} instance for the specified memory address. */
    public static FT_PaintTranslate create(long address) {
        return new FT_PaintTranslate(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_PaintTranslate createSafe(long address) {
        return address == NULL ? null : new FT_PaintTranslate(address, null);
    }

    /**
     * Create a {@link FT_PaintTranslate.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_PaintTranslate.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_PaintTranslate.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #paint}. */
    public static FT_OpaquePaint npaint(long struct) { return FT_OpaquePaint.create(struct + FT_PaintTranslate.PAINT); }
    /** Unsafe version of {@link #dx}. */
    public static long ndx(long struct) { return memGetCLong(struct + FT_PaintTranslate.DX); }
    /** Unsafe version of {@link #dy}. */
    public static long ndy(long struct) { return memGetCLong(struct + FT_PaintTranslate.DY); }

    // -----------------------------------

    /** An array of {@link FT_PaintTranslate} structs. */
    public static class Buffer extends StructBuffer<FT_PaintTranslate, Buffer> {

        private static final FT_PaintTranslate ELEMENT_FACTORY = FT_PaintTranslate.create(-1L);

        /**
         * Creates a new {@code FT_PaintTranslate.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_PaintTranslate#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_PaintTranslate getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FT_OpaquePaint} view of the {@code paint} field. */
        @NativeType("FT_OpaquePaintRec")
        public FT_OpaquePaint paint() { return FT_PaintTranslate.npaint(address()); }
        /** @return the value of the {@code dx} field. */
        @NativeType("FT_Fixed")
        public long dx() { return FT_PaintTranslate.ndx(address()); }
        /** @return the value of the {@code dy} field. */
        @NativeType("FT_Fixed")
        public long dy() { return FT_PaintTranslate.ndy(address()); }

    }

}