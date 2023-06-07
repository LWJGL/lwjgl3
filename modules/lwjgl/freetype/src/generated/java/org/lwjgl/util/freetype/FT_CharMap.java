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
 * The base charmap structure.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_CharMapRec {
 *     {@link FT_Face FT_Face} {@link #face};
 *     FT_Encoding {@link #encoding};
 *     FT_UShort {@link #platform_id};
 *     FT_UShort {@link #encoding_id};
 * }</code></pre>
 */
@NativeType("struct FT_CharMapRec")
public class FT_CharMap extends Struct<FT_CharMap> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FACE,
        ENCODING,
        PLATFORM_ID,
        ENCODING_ID;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(2),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FACE = layout.offsetof(0);
        ENCODING = layout.offsetof(1);
        PLATFORM_ID = layout.offsetof(2);
        ENCODING_ID = layout.offsetof(3);
    }

    protected FT_CharMap(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_CharMap create(long address, @Nullable ByteBuffer container) {
        return new FT_CharMap(address, container);
    }

    /**
     * Creates a {@code FT_CharMap} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_CharMap(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a handle to the parent face object */
    public FT_Face face() { return nface(address()); }
    /** an {@code FT_Encoding} tag identifying the charmap. Use this with {@link FreeType#FT_Select_Charmap Select_Charmap}. */
    @NativeType("FT_Encoding")
    public int encoding() { return nencoding(address()); }
    /**
     * an ID number describing the platform for the following encoding ID. This comes directly from the TrueType specification and gets emulated for other
     * formats.
     */
    @NativeType("FT_UShort")
    public short platform_id() { return nplatform_id(address()); }
    /** a platform-specific encoding number. This also comes from the TrueType specification and gets emulated similarly. */
    @NativeType("FT_UShort")
    public short encoding_id() { return nencoding_id(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_CharMap} instance for the specified memory address. */
    public static FT_CharMap create(long address) {
        return new FT_CharMap(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_CharMap createSafe(long address) {
        return address == NULL ? null : new FT_CharMap(address, null);
    }

    /**
     * Create a {@link FT_CharMap.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_CharMap.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_CharMap.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #face}. */
    public static FT_Face nface(long struct) { return FT_Face.create(memGetAddress(struct + FT_CharMap.FACE)); }
    /** Unsafe version of {@link #encoding}. */
    public static int nencoding(long struct) { return UNSAFE.getInt(null, struct + FT_CharMap.ENCODING); }
    /** Unsafe version of {@link #platform_id}. */
    public static short nplatform_id(long struct) { return UNSAFE.getShort(null, struct + FT_CharMap.PLATFORM_ID); }
    /** Unsafe version of {@link #encoding_id}. */
    public static short nencoding_id(long struct) { return UNSAFE.getShort(null, struct + FT_CharMap.ENCODING_ID); }

    // -----------------------------------

    /** An array of {@link FT_CharMap} structs. */
    public static class Buffer extends StructBuffer<FT_CharMap, Buffer> {

        private static final FT_CharMap ELEMENT_FACTORY = FT_CharMap.create(-1L);

        /**
         * Creates a new {@code FT_CharMap.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_CharMap#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_CharMap getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FT_Face} view of the struct pointed to by the {@link FT_CharMap#face} field. */
        public FT_Face face() { return FT_CharMap.nface(address()); }
        /** @return the value of the {@link FT_CharMap#encoding} field. */
        @NativeType("FT_Encoding")
        public int encoding() { return FT_CharMap.nencoding(address()); }
        /** @return the value of the {@link FT_CharMap#platform_id} field. */
        @NativeType("FT_UShort")
        public short platform_id() { return FT_CharMap.nplatform_id(address()); }
        /** @return the value of the {@link FT_CharMap#encoding_id} field. */
        @NativeType("FT_UShort")
        public short encoding_id() { return FT_CharMap.nencoding_id(address()); }

    }

}