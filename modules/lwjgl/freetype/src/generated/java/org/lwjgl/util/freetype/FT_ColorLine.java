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
 * A structure representing a {@code ColorLine} value of the {@code COLR} v1 extensions.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_ColorLine {
 *     FT_PaintExtend extend;
 *     {@link FT_ColorStopIterator FT_ColorStopIterator} color_stop_iterator;
 * }</code></pre>
 */
public class FT_ColorLine extends Struct<FT_ColorLine> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        EXTEND,
        COLOR_STOP_ITERATOR;

    static {
        Layout layout = __struct(
            __member(4),
            __member(FT_ColorStopIterator.SIZEOF, FT_ColorStopIterator.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        EXTEND = layout.offsetof(0);
        COLOR_STOP_ITERATOR = layout.offsetof(1);
    }

    protected FT_ColorLine(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_ColorLine create(long address, @Nullable ByteBuffer container) {
        return new FT_ColorLine(address, container);
    }

    /**
     * Creates a {@code FT_ColorLine} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_ColorLine(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code extend} field. */
    @NativeType("FT_PaintExtend")
    public int extend() { return nextend(address()); }
    /** @return a {@link FT_ColorStopIterator} view of the {@code color_stop_iterator} field. */
    public FT_ColorStopIterator color_stop_iterator() { return ncolor_stop_iterator(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_ColorLine} instance for the specified memory address. */
    public static FT_ColorLine create(long address) {
        return new FT_ColorLine(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_ColorLine createSafe(long address) {
        return address == NULL ? null : new FT_ColorLine(address, null);
    }

    /**
     * Create a {@link FT_ColorLine.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_ColorLine.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_ColorLine.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #extend}. */
    public static int nextend(long struct) { return UNSAFE.getInt(null, struct + FT_ColorLine.EXTEND); }
    /** Unsafe version of {@link #color_stop_iterator}. */
    public static FT_ColorStopIterator ncolor_stop_iterator(long struct) { return FT_ColorStopIterator.create(struct + FT_ColorLine.COLOR_STOP_ITERATOR); }

    // -----------------------------------

    /** An array of {@link FT_ColorLine} structs. */
    public static class Buffer extends StructBuffer<FT_ColorLine, Buffer> {

        private static final FT_ColorLine ELEMENT_FACTORY = FT_ColorLine.create(-1L);

        /**
         * Creates a new {@code FT_ColorLine.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_ColorLine#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_ColorLine getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code extend} field. */
        @NativeType("FT_PaintExtend")
        public int extend() { return FT_ColorLine.nextend(address()); }
        /** @return a {@link FT_ColorStopIterator} view of the {@code color_stop_iterator} field. */
        public FT_ColorStopIterator color_stop_iterator() { return FT_ColorLine.ncolor_stop_iterator(address()); }

    }

}