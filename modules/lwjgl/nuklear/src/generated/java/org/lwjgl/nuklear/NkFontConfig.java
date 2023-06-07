/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct nk_font_config {
 *     {@link NkFontConfig struct nk_font_config} * {@link #next};
 *     void * {@link #ttf_blob};
 *     nk_size {@link #ttf_size};
 *     unsigned char {@link #ttf_data_owned_by_atlas};
 *     unsigned char {@link #merge_mode};
 *     unsigned char {@link #pixel_snap};
 *     unsigned char {@link #oversample_v};
 *     unsigned char {@link #oversample_h};
 *     unsigned char {@link #padding}[3];
 *     float {@link #size};
 *     enum nk_font_coord_type {@link #coord_type};
 *     {@link NkVec2 struct nk_vec2} {@link #spacing};
 *     nk_rune const * {@link #range};
 *     {@link NkBakedFont struct nk_baked_font} * {@link #font};
 *     nk_rune {@link #fallback_glyph};
 *     {@link NkFontConfig struct nk_font_config} * n;
 *     {@link NkFontConfig struct nk_font_config} * p;
 * }</code></pre>
 */
@NativeType("struct nk_font_config")
public class NkFontConfig extends Struct<NkFontConfig> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NEXT,
        TTF_BLOB,
        TTF_SIZE,
        TTF_DATA_OWNED_BY_ATLAS,
        MERGE_MODE,
        PIXEL_SNAP,
        OVERSAMPLE_V,
        OVERSAMPLE_H,
        PADDING,
        SIZE,
        COORD_TYPE,
        SPACING,
        RANGE,
        FONT,
        FALLBACK_GLYPH,
        N,
        P;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __array(1, 3),
            __member(4),
            __member(4),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NEXT = layout.offsetof(0);
        TTF_BLOB = layout.offsetof(1);
        TTF_SIZE = layout.offsetof(2);
        TTF_DATA_OWNED_BY_ATLAS = layout.offsetof(3);
        MERGE_MODE = layout.offsetof(4);
        PIXEL_SNAP = layout.offsetof(5);
        OVERSAMPLE_V = layout.offsetof(6);
        OVERSAMPLE_H = layout.offsetof(7);
        PADDING = layout.offsetof(8);
        SIZE = layout.offsetof(9);
        COORD_TYPE = layout.offsetof(10);
        SPACING = layout.offsetof(11);
        RANGE = layout.offsetof(12);
        FONT = layout.offsetof(13);
        FALLBACK_GLYPH = layout.offsetof(14);
        N = layout.offsetof(15);
        P = layout.offsetof(16);
    }

    protected NkFontConfig(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NkFontConfig create(long address, @Nullable ByteBuffer container) {
        return new NkFontConfig(address, container);
    }

    /**
     * Creates a {@code NkFontConfig} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkFontConfig(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** NOTE: only used internally */
    @Nullable
    @NativeType("struct nk_font_config *")
    public NkFontConfig next() { return nnext(address()); }
    /** pointer to loaded TTF file memory block */
    @Nullable
    @NativeType("void *")
    public ByteBuffer ttf_blob() { return nttf_blob(address()); }
    /** size of the loaded TTF file memory block */
    @NativeType("nk_size")
    public long ttf_size() { return nttf_size(address()); }
    /** used inside font atlas: default to: 0 */
    @NativeType("unsigned char")
    public boolean ttf_data_owned_by_atlas() { return nttf_data_owned_by_atlas(address()); }
    /** merges this font into the last font */
    @NativeType("unsigned char")
    public boolean merge_mode() { return nmerge_mode(address()); }
    /** align every character to pixel boundary (if true set oversample (1,1)) */
    @NativeType("unsigned char")
    public boolean pixel_snap() { return npixel_snap(address()); }
    /** rasterize at high quality for sub-pixel position */
    @NativeType("unsigned char")
    public boolean oversample_v() { return noversample_v(address()); }
    /** rasterize at high quality for sub-pixel position */
    @NativeType("unsigned char")
    public boolean oversample_h() { return noversample_h(address()); }
    /** rasterize at high quality for sub-pixel position */
    @NativeType("unsigned char[3]")
    public ByteBuffer padding() { return npadding(address()); }
    /** rasterize at high quality for sub-pixel position */
    @NativeType("unsigned char")
    public byte padding(int index) { return npadding(address(), index); }
    /** baked pixel height of the font */
    public float size() { return nsize(address()); }
    /** texture coordinate format with either pixel or UV coordinates */
    @NativeType("enum nk_font_coord_type")
    public int coord_type() { return ncoord_type(address()); }
    /** extra pixel spacing between glyphs */
    @NativeType("struct nk_vec2")
    public NkVec2 spacing() { return nspacing(address()); }
    /**
     * @param capacity the number of elements in the returned buffer
     *
     * @return list of unicode ranges (2 values per range, zero terminated)
     */
    @Nullable
    @NativeType("nk_rune const *")
    public IntBuffer range(int capacity) { return nrange(address(), capacity); }
    /** font to setup in the baking process */
    @Nullable
    @NativeType("struct nk_baked_font *")
    public NkBakedFont font() { return nfont(address()); }
    /** fallback glyph to use if a given rune is not found */
    @NativeType("nk_rune")
    public int fallback_glyph() { return nfallback_glyph(address()); }
    /** @return a {@link NkFontConfig} view of the struct pointed to by the {@code n} field. */
    @Nullable
    @NativeType("struct nk_font_config *")
    public NkFontConfig n() { return nn(address()); }
    /** @return a {@link NkFontConfig} view of the struct pointed to by the {@code p} field. */
    @Nullable
    @NativeType("struct nk_font_config *")
    public NkFontConfig p() { return np(address()); }

    /** Sets the address of the specified {@link NkFontConfig} to the {@link #next} field. */
    public NkFontConfig next(@Nullable @NativeType("struct nk_font_config *") NkFontConfig value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@link #ttf_blob} field. */
    public NkFontConfig ttf_blob(@Nullable @NativeType("void *") ByteBuffer value) { nttf_blob(address(), value); return this; }
    /** Sets the specified value to the {@link #ttf_size} field. */
    public NkFontConfig ttf_size(@NativeType("nk_size") long value) { nttf_size(address(), value); return this; }
    /** Sets the specified value to the {@link #ttf_data_owned_by_atlas} field. */
    public NkFontConfig ttf_data_owned_by_atlas(@NativeType("unsigned char") boolean value) { nttf_data_owned_by_atlas(address(), value); return this; }
    /** Sets the specified value to the {@link #merge_mode} field. */
    public NkFontConfig merge_mode(@NativeType("unsigned char") boolean value) { nmerge_mode(address(), value); return this; }
    /** Sets the specified value to the {@link #pixel_snap} field. */
    public NkFontConfig pixel_snap(@NativeType("unsigned char") boolean value) { npixel_snap(address(), value); return this; }
    /** Sets the specified value to the {@link #oversample_v} field. */
    public NkFontConfig oversample_v(@NativeType("unsigned char") boolean value) { noversample_v(address(), value); return this; }
    /** Sets the specified value to the {@link #oversample_h} field. */
    public NkFontConfig oversample_h(@NativeType("unsigned char") boolean value) { noversample_h(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@link #padding} field. */
    public NkFontConfig padding(@NativeType("unsigned char[3]") ByteBuffer value) { npadding(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@link #padding} field. */
    public NkFontConfig padding(int index, @NativeType("unsigned char") byte value) { npadding(address(), index, value); return this; }
    /** Sets the specified value to the {@link #size} field. */
    public NkFontConfig size(float value) { nsize(address(), value); return this; }
    /** Sets the specified value to the {@link #coord_type} field. */
    public NkFontConfig coord_type(@NativeType("enum nk_font_coord_type") int value) { ncoord_type(address(), value); return this; }
    /** Copies the specified {@link NkVec2} to the {@link #spacing} field. */
    public NkFontConfig spacing(@NativeType("struct nk_vec2") NkVec2 value) { nspacing(address(), value); return this; }
    /** Passes the {@link #spacing} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkFontConfig spacing(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(spacing()); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #range} field. */
    public NkFontConfig range(@Nullable @NativeType("nk_rune const *") IntBuffer value) { nrange(address(), value); return this; }
    /** Sets the address of the specified {@link NkBakedFont} to the {@link #font} field. */
    public NkFontConfig font(@Nullable @NativeType("struct nk_baked_font *") NkBakedFont value) { nfont(address(), value); return this; }
    /** Sets the specified value to the {@link #fallback_glyph} field. */
    public NkFontConfig fallback_glyph(@NativeType("nk_rune") int value) { nfallback_glyph(address(), value); return this; }
    /** Sets the address of the specified {@link NkFontConfig} to the {@code n} field. */
    public NkFontConfig n(@Nullable @NativeType("struct nk_font_config *") NkFontConfig value) { nn(address(), value); return this; }
    /** Sets the address of the specified {@link NkFontConfig} to the {@code p} field. */
    public NkFontConfig p(@Nullable @NativeType("struct nk_font_config *") NkFontConfig value) { np(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public NkFontConfig set(
        @Nullable NkFontConfig next,
        @Nullable ByteBuffer ttf_blob,
        long ttf_size,
        boolean ttf_data_owned_by_atlas,
        boolean merge_mode,
        boolean pixel_snap,
        boolean oversample_v,
        boolean oversample_h,
        ByteBuffer padding,
        float size,
        int coord_type,
        NkVec2 spacing,
        @Nullable IntBuffer range,
        @Nullable NkBakedFont font,
        int fallback_glyph,
        @Nullable NkFontConfig n,
        @Nullable NkFontConfig p
    ) {
        next(next);
        ttf_blob(ttf_blob);
        ttf_size(ttf_size);
        ttf_data_owned_by_atlas(ttf_data_owned_by_atlas);
        merge_mode(merge_mode);
        pixel_snap(pixel_snap);
        oversample_v(oversample_v);
        oversample_h(oversample_h);
        padding(padding);
        size(size);
        coord_type(coord_type);
        spacing(spacing);
        range(range);
        font(font);
        fallback_glyph(fallback_glyph);
        n(n);
        p(p);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public NkFontConfig set(NkFontConfig src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code NkFontConfig} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkFontConfig malloc() {
        return new NkFontConfig(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code NkFontConfig} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkFontConfig calloc() {
        return new NkFontConfig(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code NkFontConfig} instance allocated with {@link BufferUtils}. */
    public static NkFontConfig create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new NkFontConfig(memAddress(container), container);
    }

    /** Returns a new {@code NkFontConfig} instance for the specified memory address. */
    public static NkFontConfig create(long address) {
        return new NkFontConfig(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkFontConfig createSafe(long address) {
        return address == NULL ? null : new NkFontConfig(address, null);
    }

    /**
     * Returns a new {@link NkFontConfig.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkFontConfig.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NkFontConfig.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkFontConfig.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkFontConfig.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkFontConfig.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link NkFontConfig.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkFontConfig.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkFontConfig.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code NkFontConfig} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkFontConfig malloc(MemoryStack stack) {
        return new NkFontConfig(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code NkFontConfig} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkFontConfig calloc(MemoryStack stack) {
        return new NkFontConfig(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link NkFontConfig.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkFontConfig.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkFontConfig.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkFontConfig.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #next}. */
    @Nullable public static NkFontConfig nnext(long struct) { return NkFontConfig.createSafe(memGetAddress(struct + NkFontConfig.NEXT)); }
    /** Unsafe version of {@link #ttf_blob() ttf_blob}. */
    @Nullable public static ByteBuffer nttf_blob(long struct) { return memByteBufferSafe(memGetAddress(struct + NkFontConfig.TTF_BLOB), (int)nttf_size(struct)); }
    /** Unsafe version of {@link #ttf_size}. */
    public static long nttf_size(long struct) { return memGetAddress(struct + NkFontConfig.TTF_SIZE); }
    /** Unsafe version of {@link #ttf_data_owned_by_atlas}. */
    public static boolean nttf_data_owned_by_atlas(long struct) { return UNSAFE.getByte(null, struct + NkFontConfig.TTF_DATA_OWNED_BY_ATLAS) != 0; }
    /** Unsafe version of {@link #merge_mode}. */
    public static boolean nmerge_mode(long struct) { return UNSAFE.getByte(null, struct + NkFontConfig.MERGE_MODE) != 0; }
    /** Unsafe version of {@link #pixel_snap}. */
    public static boolean npixel_snap(long struct) { return UNSAFE.getByte(null, struct + NkFontConfig.PIXEL_SNAP) != 0; }
    /** Unsafe version of {@link #oversample_v}. */
    public static boolean noversample_v(long struct) { return UNSAFE.getByte(null, struct + NkFontConfig.OVERSAMPLE_V) != 0; }
    /** Unsafe version of {@link #oversample_h}. */
    public static boolean noversample_h(long struct) { return UNSAFE.getByte(null, struct + NkFontConfig.OVERSAMPLE_H) != 0; }
    /** Unsafe version of {@link #padding}. */
    public static ByteBuffer npadding(long struct) { return memByteBuffer(struct + NkFontConfig.PADDING, 3); }
    /** Unsafe version of {@link #padding(int) padding}. */
    public static byte npadding(long struct, int index) {
        return UNSAFE.getByte(null, struct + NkFontConfig.PADDING + check(index, 3) * 1);
    }
    /** Unsafe version of {@link #size}. */
    public static float nsize(long struct) { return UNSAFE.getFloat(null, struct + NkFontConfig.SIZE); }
    /** Unsafe version of {@link #coord_type}. */
    public static int ncoord_type(long struct) { return UNSAFE.getInt(null, struct + NkFontConfig.COORD_TYPE); }
    /** Unsafe version of {@link #spacing}. */
    public static NkVec2 nspacing(long struct) { return NkVec2.create(struct + NkFontConfig.SPACING); }
    /** Unsafe version of {@link #range(int) range}. */
    @Nullable public static IntBuffer nrange(long struct, int capacity) { return memIntBufferSafe(memGetAddress(struct + NkFontConfig.RANGE), capacity); }
    /** Unsafe version of {@link #font}. */
    @Nullable public static NkBakedFont nfont(long struct) { return NkBakedFont.createSafe(memGetAddress(struct + NkFontConfig.FONT)); }
    /** Unsafe version of {@link #fallback_glyph}. */
    public static int nfallback_glyph(long struct) { return UNSAFE.getInt(null, struct + NkFontConfig.FALLBACK_GLYPH); }
    /** Unsafe version of {@link #n}. */
    @Nullable public static NkFontConfig nn(long struct) { return NkFontConfig.createSafe(memGetAddress(struct + NkFontConfig.N)); }
    /** Unsafe version of {@link #p}. */
    @Nullable public static NkFontConfig np(long struct) { return NkFontConfig.createSafe(memGetAddress(struct + NkFontConfig.P)); }

    /** Unsafe version of {@link #next(NkFontConfig) next}. */
    public static void nnext(long struct, @Nullable NkFontConfig value) { memPutAddress(struct + NkFontConfig.NEXT, memAddressSafe(value)); }
    /** Unsafe version of {@link #ttf_blob(ByteBuffer) ttf_blob}. */
    public static void nttf_blob(long struct, @Nullable ByteBuffer value) { memPutAddress(struct + NkFontConfig.TTF_BLOB, memAddressSafe(value)); nttf_size(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code ttf_size} field of the specified {@code struct}. */
    public static void nttf_size(long struct, long value) { memPutAddress(struct + NkFontConfig.TTF_SIZE, value); }
    /** Unsafe version of {@link #ttf_data_owned_by_atlas(boolean) ttf_data_owned_by_atlas}. */
    public static void nttf_data_owned_by_atlas(long struct, boolean value) { UNSAFE.putByte(null, struct + NkFontConfig.TTF_DATA_OWNED_BY_ATLAS, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #merge_mode(boolean) merge_mode}. */
    public static void nmerge_mode(long struct, boolean value) { UNSAFE.putByte(null, struct + NkFontConfig.MERGE_MODE, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #pixel_snap(boolean) pixel_snap}. */
    public static void npixel_snap(long struct, boolean value) { UNSAFE.putByte(null, struct + NkFontConfig.PIXEL_SNAP, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #oversample_v(boolean) oversample_v}. */
    public static void noversample_v(long struct, boolean value) { UNSAFE.putByte(null, struct + NkFontConfig.OVERSAMPLE_V, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #oversample_h(boolean) oversample_h}. */
    public static void noversample_h(long struct, boolean value) { UNSAFE.putByte(null, struct + NkFontConfig.OVERSAMPLE_H, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #padding(ByteBuffer) padding}. */
    public static void npadding(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + NkFontConfig.PADDING, value.remaining() * 1);
    }
    /** Unsafe version of {@link #padding(int, byte) padding}. */
    public static void npadding(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + NkFontConfig.PADDING + check(index, 3) * 1, value);
    }
    /** Unsafe version of {@link #size(float) size}. */
    public static void nsize(long struct, float value) { UNSAFE.putFloat(null, struct + NkFontConfig.SIZE, value); }
    /** Unsafe version of {@link #coord_type(int) coord_type}. */
    public static void ncoord_type(long struct, int value) { UNSAFE.putInt(null, struct + NkFontConfig.COORD_TYPE, value); }
    /** Unsafe version of {@link #spacing(NkVec2) spacing}. */
    public static void nspacing(long struct, NkVec2 value) { memCopy(value.address(), struct + NkFontConfig.SPACING, NkVec2.SIZEOF); }
    /** Unsafe version of {@link #range(IntBuffer) range}. */
    public static void nrange(long struct, @Nullable IntBuffer value) { memPutAddress(struct + NkFontConfig.RANGE, memAddressSafe(value)); }
    /** Unsafe version of {@link #font(NkBakedFont) font}. */
    public static void nfont(long struct, @Nullable NkBakedFont value) { memPutAddress(struct + NkFontConfig.FONT, memAddressSafe(value)); }
    /** Unsafe version of {@link #fallback_glyph(int) fallback_glyph}. */
    public static void nfallback_glyph(long struct, int value) { UNSAFE.putInt(null, struct + NkFontConfig.FALLBACK_GLYPH, value); }
    /** Unsafe version of {@link #n(NkFontConfig) n}. */
    public static void nn(long struct, @Nullable NkFontConfig value) { memPutAddress(struct + NkFontConfig.N, memAddressSafe(value)); }
    /** Unsafe version of {@link #p(NkFontConfig) p}. */
    public static void np(long struct, @Nullable NkFontConfig value) { memPutAddress(struct + NkFontConfig.P, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link NkFontConfig} structs. */
    public static class Buffer extends StructBuffer<NkFontConfig, Buffer> implements NativeResource {

        private static final NkFontConfig ELEMENT_FACTORY = NkFontConfig.create(-1L);

        /**
         * Creates a new {@code NkFontConfig.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkFontConfig#SIZEOF}, and its mark will be undefined.</p>
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
        protected NkFontConfig getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link NkFontConfig} view of the struct pointed to by the {@link NkFontConfig#next} field. */
        @Nullable
        @NativeType("struct nk_font_config *")
        public NkFontConfig next() { return NkFontConfig.nnext(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@link NkFontConfig#ttf_blob} field. */
        @Nullable
        @NativeType("void *")
        public ByteBuffer ttf_blob() { return NkFontConfig.nttf_blob(address()); }
        /** @return the value of the {@link NkFontConfig#ttf_size} field. */
        @NativeType("nk_size")
        public long ttf_size() { return NkFontConfig.nttf_size(address()); }
        /** @return the value of the {@link NkFontConfig#ttf_data_owned_by_atlas} field. */
        @NativeType("unsigned char")
        public boolean ttf_data_owned_by_atlas() { return NkFontConfig.nttf_data_owned_by_atlas(address()); }
        /** @return the value of the {@link NkFontConfig#merge_mode} field. */
        @NativeType("unsigned char")
        public boolean merge_mode() { return NkFontConfig.nmerge_mode(address()); }
        /** @return the value of the {@link NkFontConfig#pixel_snap} field. */
        @NativeType("unsigned char")
        public boolean pixel_snap() { return NkFontConfig.npixel_snap(address()); }
        /** @return the value of the {@link NkFontConfig#oversample_v} field. */
        @NativeType("unsigned char")
        public boolean oversample_v() { return NkFontConfig.noversample_v(address()); }
        /** @return the value of the {@link NkFontConfig#oversample_h} field. */
        @NativeType("unsigned char")
        public boolean oversample_h() { return NkFontConfig.noversample_h(address()); }
        /** @return a {@link ByteBuffer} view of the {@link NkFontConfig#padding} field. */
        @NativeType("unsigned char[3]")
        public ByteBuffer padding() { return NkFontConfig.npadding(address()); }
        /** @return the value at the specified index of the {@link NkFontConfig#padding} field. */
        @NativeType("unsigned char")
        public byte padding(int index) { return NkFontConfig.npadding(address(), index); }
        /** @return the value of the {@link NkFontConfig#size} field. */
        public float size() { return NkFontConfig.nsize(address()); }
        /** @return the value of the {@link NkFontConfig#coord_type} field. */
        @NativeType("enum nk_font_coord_type")
        public int coord_type() { return NkFontConfig.ncoord_type(address()); }
        /** @return a {@link NkVec2} view of the {@link NkFontConfig#spacing} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 spacing() { return NkFontConfig.nspacing(address()); }
        /**
         * @return a {@link IntBuffer} view of the data pointed to by the {@link NkFontConfig#range} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @Nullable
        @NativeType("nk_rune const *")
        public IntBuffer range(int capacity) { return NkFontConfig.nrange(address(), capacity); }
        /** @return a {@link NkBakedFont} view of the struct pointed to by the {@link NkFontConfig#font} field. */
        @Nullable
        @NativeType("struct nk_baked_font *")
        public NkBakedFont font() { return NkFontConfig.nfont(address()); }
        /** @return the value of the {@link NkFontConfig#fallback_glyph} field. */
        @NativeType("nk_rune")
        public int fallback_glyph() { return NkFontConfig.nfallback_glyph(address()); }
        /** @return a {@link NkFontConfig} view of the struct pointed to by the {@code n} field. */
        @Nullable
        @NativeType("struct nk_font_config *")
        public NkFontConfig n() { return NkFontConfig.nn(address()); }
        /** @return a {@link NkFontConfig} view of the struct pointed to by the {@code p} field. */
        @Nullable
        @NativeType("struct nk_font_config *")
        public NkFontConfig p() { return NkFontConfig.np(address()); }

        /** Sets the address of the specified {@link NkFontConfig} to the {@link NkFontConfig#next} field. */
        public NkFontConfig.Buffer next(@Nullable @NativeType("struct nk_font_config *") NkFontConfig value) { NkFontConfig.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@link NkFontConfig#ttf_blob} field. */
        public NkFontConfig.Buffer ttf_blob(@Nullable @NativeType("void *") ByteBuffer value) { NkFontConfig.nttf_blob(address(), value); return this; }
        /** Sets the specified value to the {@link NkFontConfig#ttf_size} field. */
        public NkFontConfig.Buffer ttf_size(@NativeType("nk_size") long value) { NkFontConfig.nttf_size(address(), value); return this; }
        /** Sets the specified value to the {@link NkFontConfig#ttf_data_owned_by_atlas} field. */
        public NkFontConfig.Buffer ttf_data_owned_by_atlas(@NativeType("unsigned char") boolean value) { NkFontConfig.nttf_data_owned_by_atlas(address(), value); return this; }
        /** Sets the specified value to the {@link NkFontConfig#merge_mode} field. */
        public NkFontConfig.Buffer merge_mode(@NativeType("unsigned char") boolean value) { NkFontConfig.nmerge_mode(address(), value); return this; }
        /** Sets the specified value to the {@link NkFontConfig#pixel_snap} field. */
        public NkFontConfig.Buffer pixel_snap(@NativeType("unsigned char") boolean value) { NkFontConfig.npixel_snap(address(), value); return this; }
        /** Sets the specified value to the {@link NkFontConfig#oversample_v} field. */
        public NkFontConfig.Buffer oversample_v(@NativeType("unsigned char") boolean value) { NkFontConfig.noversample_v(address(), value); return this; }
        /** Sets the specified value to the {@link NkFontConfig#oversample_h} field. */
        public NkFontConfig.Buffer oversample_h(@NativeType("unsigned char") boolean value) { NkFontConfig.noversample_h(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@link NkFontConfig#padding} field. */
        public NkFontConfig.Buffer padding(@NativeType("unsigned char[3]") ByteBuffer value) { NkFontConfig.npadding(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@link NkFontConfig#padding} field. */
        public NkFontConfig.Buffer padding(int index, @NativeType("unsigned char") byte value) { NkFontConfig.npadding(address(), index, value); return this; }
        /** Sets the specified value to the {@link NkFontConfig#size} field. */
        public NkFontConfig.Buffer size(float value) { NkFontConfig.nsize(address(), value); return this; }
        /** Sets the specified value to the {@link NkFontConfig#coord_type} field. */
        public NkFontConfig.Buffer coord_type(@NativeType("enum nk_font_coord_type") int value) { NkFontConfig.ncoord_type(address(), value); return this; }
        /** Copies the specified {@link NkVec2} to the {@link NkFontConfig#spacing} field. */
        public NkFontConfig.Buffer spacing(@NativeType("struct nk_vec2") NkVec2 value) { NkFontConfig.nspacing(address(), value); return this; }
        /** Passes the {@link NkFontConfig#spacing} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkFontConfig.Buffer spacing(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(spacing()); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link NkFontConfig#range} field. */
        public NkFontConfig.Buffer range(@Nullable @NativeType("nk_rune const *") IntBuffer value) { NkFontConfig.nrange(address(), value); return this; }
        /** Sets the address of the specified {@link NkBakedFont} to the {@link NkFontConfig#font} field. */
        public NkFontConfig.Buffer font(@Nullable @NativeType("struct nk_baked_font *") NkBakedFont value) { NkFontConfig.nfont(address(), value); return this; }
        /** Sets the specified value to the {@link NkFontConfig#fallback_glyph} field. */
        public NkFontConfig.Buffer fallback_glyph(@NativeType("nk_rune") int value) { NkFontConfig.nfallback_glyph(address(), value); return this; }
        /** Sets the address of the specified {@link NkFontConfig} to the {@code n} field. */
        public NkFontConfig.Buffer n(@Nullable @NativeType("struct nk_font_config *") NkFontConfig value) { NkFontConfig.nn(address(), value); return this; }
        /** Sets the address of the specified {@link NkFontConfig} to the {@code p} field. */
        public NkFontConfig.Buffer p(@Nullable @NativeType("struct nk_font_config *") NkFontConfig value) { NkFontConfig.np(address(), value); return this; }

    }

}