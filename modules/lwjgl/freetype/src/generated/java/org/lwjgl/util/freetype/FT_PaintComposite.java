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
 * A structure representing a {@code COLR} v1 {@code PaintComposite} paint table. Used for compositing two paints in a {@code COLR} v1 directed acyclic
 * graph.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_PaintComposite {
 *     {@link FT_OpaquePaint FT_OpaquePaintRec} source_paint;
 *     FT_Composite_Mode composite_mode;
 *     {@link FT_OpaquePaint FT_OpaquePaintRec} backdrop_paint;
 * }</code></pre>
 */
public class FT_PaintComposite extends Struct<FT_PaintComposite> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SOURCE_PAINT,
        COMPOSITE_MODE,
        BACKDROP_PAINT;

    static {
        Layout layout = __struct(
            __member(FT_OpaquePaint.SIZEOF, FT_OpaquePaint.ALIGNOF),
            __member(4),
            __member(FT_OpaquePaint.SIZEOF, FT_OpaquePaint.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SOURCE_PAINT = layout.offsetof(0);
        COMPOSITE_MODE = layout.offsetof(1);
        BACKDROP_PAINT = layout.offsetof(2);
    }

    protected FT_PaintComposite(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_PaintComposite create(long address, @Nullable ByteBuffer container) {
        return new FT_PaintComposite(address, container);
    }

    /**
     * Creates a {@code FT_PaintComposite} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_PaintComposite(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link FT_OpaquePaint} view of the {@code source_paint} field. */
    @NativeType("FT_OpaquePaintRec")
    public FT_OpaquePaint source_paint() { return nsource_paint(address()); }
    /** @return the value of the {@code composite_mode} field. */
    @NativeType("FT_Composite_Mode")
    public int composite_mode() { return ncomposite_mode(address()); }
    /** @return a {@link FT_OpaquePaint} view of the {@code backdrop_paint} field. */
    @NativeType("FT_OpaquePaintRec")
    public FT_OpaquePaint backdrop_paint() { return nbackdrop_paint(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_PaintComposite} instance for the specified memory address. */
    public static FT_PaintComposite create(long address) {
        return new FT_PaintComposite(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_PaintComposite createSafe(long address) {
        return address == NULL ? null : new FT_PaintComposite(address, null);
    }

    /**
     * Create a {@link FT_PaintComposite.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_PaintComposite.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_PaintComposite.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #source_paint}. */
    public static FT_OpaquePaint nsource_paint(long struct) { return FT_OpaquePaint.create(struct + FT_PaintComposite.SOURCE_PAINT); }
    /** Unsafe version of {@link #composite_mode}. */
    public static int ncomposite_mode(long struct) { return UNSAFE.getInt(null, struct + FT_PaintComposite.COMPOSITE_MODE); }
    /** Unsafe version of {@link #backdrop_paint}. */
    public static FT_OpaquePaint nbackdrop_paint(long struct) { return FT_OpaquePaint.create(struct + FT_PaintComposite.BACKDROP_PAINT); }

    // -----------------------------------

    /** An array of {@link FT_PaintComposite} structs. */
    public static class Buffer extends StructBuffer<FT_PaintComposite, Buffer> {

        private static final FT_PaintComposite ELEMENT_FACTORY = FT_PaintComposite.create(-1L);

        /**
         * Creates a new {@code FT_PaintComposite.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_PaintComposite#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_PaintComposite getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FT_OpaquePaint} view of the {@code source_paint} field. */
        @NativeType("FT_OpaquePaintRec")
        public FT_OpaquePaint source_paint() { return FT_PaintComposite.nsource_paint(address()); }
        /** @return the value of the {@code composite_mode} field. */
        @NativeType("FT_Composite_Mode")
        public int composite_mode() { return FT_PaintComposite.ncomposite_mode(address()); }
        /** @return a {@link FT_OpaquePaint} view of the {@code backdrop_paint} field. */
        @NativeType("FT_OpaquePaintRec")
        public FT_OpaquePaint backdrop_paint() { return FT_PaintComposite.nbackdrop_paint(address()); }

    }

}