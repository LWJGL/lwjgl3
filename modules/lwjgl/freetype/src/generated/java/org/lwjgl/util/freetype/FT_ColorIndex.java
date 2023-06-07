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
 * A structure representing a {@code ColorIndex} value of the {@code COLR} v1 extensions.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_ColorIndex {
 *     FT_UInt16 palette_index;
 *     FT_F2Dot14 alpha;
 * }</code></pre>
 */
public class FT_ColorIndex extends Struct<FT_ColorIndex> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PALETTE_INDEX,
        ALPHA;

    static {
        Layout layout = __struct(
            __member(2),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PALETTE_INDEX = layout.offsetof(0);
        ALPHA = layout.offsetof(1);
    }

    protected FT_ColorIndex(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_ColorIndex create(long address, @Nullable ByteBuffer container) {
        return new FT_ColorIndex(address, container);
    }

    /**
     * Creates a {@code FT_ColorIndex} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_ColorIndex(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code palette_index} field. */
    @NativeType("FT_UInt16")
    public short palette_index() { return npalette_index(address()); }
    /** @return the value of the {@code alpha} field. */
    @NativeType("FT_F2Dot14")
    public short alpha() { return nalpha(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_ColorIndex} instance for the specified memory address. */
    public static FT_ColorIndex create(long address) {
        return new FT_ColorIndex(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_ColorIndex createSafe(long address) {
        return address == NULL ? null : new FT_ColorIndex(address, null);
    }

    /**
     * Create a {@link FT_ColorIndex.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_ColorIndex.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_ColorIndex.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #palette_index}. */
    public static short npalette_index(long struct) { return UNSAFE.getShort(null, struct + FT_ColorIndex.PALETTE_INDEX); }
    /** Unsafe version of {@link #alpha}. */
    public static short nalpha(long struct) { return UNSAFE.getShort(null, struct + FT_ColorIndex.ALPHA); }

    // -----------------------------------

    /** An array of {@link FT_ColorIndex} structs. */
    public static class Buffer extends StructBuffer<FT_ColorIndex, Buffer> {

        private static final FT_ColorIndex ELEMENT_FACTORY = FT_ColorIndex.create(-1L);

        /**
         * Creates a new {@code FT_ColorIndex.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_ColorIndex#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_ColorIndex getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code palette_index} field. */
        @NativeType("FT_UInt16")
        public short palette_index() { return FT_ColorIndex.npalette_index(address()); }
        /** @return the value of the {@code alpha} field. */
        @NativeType("FT_F2Dot14")
        public short alpha() { return FT_ColorIndex.nalpha(address()); }

    }

}