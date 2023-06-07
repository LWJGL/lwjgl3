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
 * A structure representing a {@code COLR} v1 {@code PaintColorGlyph} paint table.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_PaintColrGlyph {
 *     FT_UInt glyphID;
 * }</code></pre>
 */
public class FT_PaintColrGlyph extends Struct<FT_PaintColrGlyph> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        GLYPHID;

    static {
        Layout layout = __struct(
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        GLYPHID = layout.offsetof(0);
    }

    protected FT_PaintColrGlyph(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_PaintColrGlyph create(long address, @Nullable ByteBuffer container) {
        return new FT_PaintColrGlyph(address, container);
    }

    /**
     * Creates a {@code FT_PaintColrGlyph} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_PaintColrGlyph(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code glyphID} field. */
    @NativeType("FT_UInt")
    public int glyphID() { return nglyphID(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_PaintColrGlyph} instance for the specified memory address. */
    public static FT_PaintColrGlyph create(long address) {
        return new FT_PaintColrGlyph(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_PaintColrGlyph createSafe(long address) {
        return address == NULL ? null : new FT_PaintColrGlyph(address, null);
    }

    /**
     * Create a {@link FT_PaintColrGlyph.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_PaintColrGlyph.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_PaintColrGlyph.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #glyphID}. */
    public static int nglyphID(long struct) { return UNSAFE.getInt(null, struct + FT_PaintColrGlyph.GLYPHID); }

    // -----------------------------------

    /** An array of {@link FT_PaintColrGlyph} structs. */
    public static class Buffer extends StructBuffer<FT_PaintColrGlyph, Buffer> {

        private static final FT_PaintColrGlyph ELEMENT_FACTORY = FT_PaintColrGlyph.create(-1L);

        /**
         * Creates a new {@code FT_PaintColrGlyph.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_PaintColrGlyph#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_PaintColrGlyph getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code glyphID} field. */
        @NativeType("FT_UInt")
        public int glyphID() { return FT_PaintColrGlyph.nglyphID(address()); }

    }

}