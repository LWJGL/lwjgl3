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
 * A structure representing a {@code COLR} v1 {@code PaintTransform} paint table.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_PaintTransform {
 *     {@link FT_OpaquePaint FT_OpaquePaintRec} paint;
 *     {@link FT_Affine23 FT_Affine23} affine;
 * }</code></pre>
 */
public class FT_PaintTransform extends Struct<FT_PaintTransform> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PAINT,
        AFFINE;

    static {
        Layout layout = __struct(
            __member(FT_OpaquePaint.SIZEOF, FT_OpaquePaint.ALIGNOF),
            __member(FT_Affine23.SIZEOF, FT_Affine23.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PAINT = layout.offsetof(0);
        AFFINE = layout.offsetof(1);
    }

    protected FT_PaintTransform(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_PaintTransform create(long address, @Nullable ByteBuffer container) {
        return new FT_PaintTransform(address, container);
    }

    /**
     * Creates a {@code FT_PaintTransform} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_PaintTransform(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link FT_OpaquePaint} view of the {@code paint} field. */
    @NativeType("FT_OpaquePaintRec")
    public FT_OpaquePaint paint() { return npaint(address()); }
    /** @return a {@link FT_Affine23} view of the {@code affine} field. */
    public FT_Affine23 affine() { return naffine(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_PaintTransform} instance for the specified memory address. */
    public static FT_PaintTransform create(long address) {
        return new FT_PaintTransform(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_PaintTransform createSafe(long address) {
        return address == NULL ? null : new FT_PaintTransform(address, null);
    }

    /**
     * Create a {@link FT_PaintTransform.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_PaintTransform.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_PaintTransform.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #paint}. */
    public static FT_OpaquePaint npaint(long struct) { return FT_OpaquePaint.create(struct + FT_PaintTransform.PAINT); }
    /** Unsafe version of {@link #affine}. */
    public static FT_Affine23 naffine(long struct) { return FT_Affine23.create(struct + FT_PaintTransform.AFFINE); }

    // -----------------------------------

    /** An array of {@link FT_PaintTransform} structs. */
    public static class Buffer extends StructBuffer<FT_PaintTransform, Buffer> {

        private static final FT_PaintTransform ELEMENT_FACTORY = FT_PaintTransform.create(-1L);

        /**
         * Creates a new {@code FT_PaintTransform.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_PaintTransform#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_PaintTransform getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FT_OpaquePaint} view of the {@code paint} field. */
        @NativeType("FT_OpaquePaintRec")
        public FT_OpaquePaint paint() { return FT_PaintTransform.npaint(address()); }
        /** @return a {@link FT_Affine23} view of the {@code affine} field. */
        public FT_Affine23 affine() { return FT_PaintTransform.naffine(address()); }

    }

}