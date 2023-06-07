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
 * The root glyph structure contains a given glyph image plus its advance width in 16.16 fixed-point format.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_GlyphRec {
 *     FT_Library library;
 *     FT_Glyph_Class const * clazz;
 *     FT_Glyph_Format format;
 *     {@link FT_Vector FT_Vector} advance;
 * }</code></pre>
 */
@NativeType("struct FT_GlyphRec")
public class FT_Glyph extends Struct<FT_Glyph> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LIBRARY,
        CLAZZ,
        FORMAT,
        ADVANCE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(FT_Vector.SIZEOF, FT_Vector.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LIBRARY = layout.offsetof(0);
        CLAZZ = layout.offsetof(1);
        FORMAT = layout.offsetof(2);
        ADVANCE = layout.offsetof(3);
    }

    protected FT_Glyph(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_Glyph create(long address, @Nullable ByteBuffer container) {
        return new FT_Glyph(address, container);
    }

    /**
     * Creates a {@code FT_Glyph} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_Glyph(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code library} field. */
    @NativeType("FT_Library")
    public long library() { return nlibrary(address()); }
    /** @return the value of the {@code format} field. */
    @NativeType("FT_Glyph_Format")
    public int format() { return nformat(address()); }
    /** @return a {@link FT_Vector} view of the {@code advance} field. */
    public FT_Vector advance() { return nadvance(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_Glyph} instance for the specified memory address. */
    public static FT_Glyph create(long address) {
        return new FT_Glyph(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Glyph createSafe(long address) {
        return address == NULL ? null : new FT_Glyph(address, null);
    }

    /**
     * Create a {@link FT_Glyph.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_Glyph.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Glyph.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #library}. */
    public static long nlibrary(long struct) { return memGetAddress(struct + FT_Glyph.LIBRARY); }
    public static long nclazz(long struct) { return memGetAddress(struct + FT_Glyph.CLAZZ); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return UNSAFE.getInt(null, struct + FT_Glyph.FORMAT); }
    /** Unsafe version of {@link #advance}. */
    public static FT_Vector nadvance(long struct) { return FT_Vector.create(struct + FT_Glyph.ADVANCE); }

    // -----------------------------------

    /** An array of {@link FT_Glyph} structs. */
    public static class Buffer extends StructBuffer<FT_Glyph, Buffer> {

        private static final FT_Glyph ELEMENT_FACTORY = FT_Glyph.create(-1L);

        /**
         * Creates a new {@code FT_Glyph.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_Glyph#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_Glyph getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code library} field. */
        @NativeType("FT_Library")
        public long library() { return FT_Glyph.nlibrary(address()); }
        /** @return the value of the {@code format} field. */
        @NativeType("FT_Glyph_Format")
        public int format() { return FT_Glyph.nformat(address()); }
        /** @return a {@link FT_Vector} view of the {@code advance} field. */
        public FT_Vector advance() { return FT_Glyph.nadvance(address()); }

    }

}