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
 * The data exchange structure for the glyph -to-script-map property.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_Prop_GlyphToScriptMap {
 *     {@link FT_Face FT_Face} face;
 *     FT_UShort * map;
 * }</code></pre>
 */
public class FT_Prop_GlyphToScriptMap extends Struct<FT_Prop_GlyphToScriptMap> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FACE,
        MAP;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FACE = layout.offsetof(0);
        MAP = layout.offsetof(1);
    }

    protected FT_Prop_GlyphToScriptMap(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_Prop_GlyphToScriptMap create(long address, @Nullable ByteBuffer container) {
        return new FT_Prop_GlyphToScriptMap(address, container);
    }

    /**
     * Creates a {@code FT_Prop_GlyphToScriptMap} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_Prop_GlyphToScriptMap(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link FT_Face} view of the struct pointed to by the {@code face} field. */
    public FT_Face face() { return nface(address()); }
    /**
     * @return a {@link ShortBuffer} view of the data pointed to by the {@code map} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @Nullable
    @NativeType("FT_UShort *")
    public ShortBuffer map(int capacity) { return nmap(address(), capacity); }

    // -----------------------------------

    /** Returns a new {@code FT_Prop_GlyphToScriptMap} instance for the specified memory address. */
    public static FT_Prop_GlyphToScriptMap create(long address) {
        return new FT_Prop_GlyphToScriptMap(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Prop_GlyphToScriptMap createSafe(long address) {
        return address == NULL ? null : new FT_Prop_GlyphToScriptMap(address, null);
    }

    /**
     * Create a {@link FT_Prop_GlyphToScriptMap.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_Prop_GlyphToScriptMap.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Prop_GlyphToScriptMap.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #face}. */
    public static FT_Face nface(long struct) { return FT_Face.create(memGetAddress(struct + FT_Prop_GlyphToScriptMap.FACE)); }
    /** Unsafe version of {@link #map(int) map}. */
    @Nullable public static ShortBuffer nmap(long struct, int capacity) { return memShortBufferSafe(memGetAddress(struct + FT_Prop_GlyphToScriptMap.MAP), capacity); }

    // -----------------------------------

    /** An array of {@link FT_Prop_GlyphToScriptMap} structs. */
    public static class Buffer extends StructBuffer<FT_Prop_GlyphToScriptMap, Buffer> {

        private static final FT_Prop_GlyphToScriptMap ELEMENT_FACTORY = FT_Prop_GlyphToScriptMap.create(-1L);

        /**
         * Creates a new {@code FT_Prop_GlyphToScriptMap.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_Prop_GlyphToScriptMap#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_Prop_GlyphToScriptMap getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FT_Face} view of the struct pointed to by the {@code face} field. */
        public FT_Face face() { return FT_Prop_GlyphToScriptMap.nface(address()); }
        /**
         * @return a {@link ShortBuffer} view of the data pointed to by the {@code map} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @Nullable
        @NativeType("FT_UShort *")
        public ShortBuffer map(int capacity) { return FT_Prop_GlyphToScriptMap.nmap(address(), capacity); }

    }

}