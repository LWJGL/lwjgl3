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
 * struct nk_font_atlas {
 *     void * pixel;
 *     int tex_width;
 *     int tex_height;
 *     {@link NkAllocator struct nk_allocator} permanent;
 *     {@link NkAllocator struct nk_allocator} temporary;
 *     {@link NkRecti struct nk_recti} custom;
 *     {@link NkCursor struct nk_cursor} cursors[7];
 *     int glyph_count;
 *     {@link NkFontGlyph struct nk_font_glyph} * glyphs;
 *     {@link NkFont struct nk_font} * default_font;
 *     {@link NkFont struct nk_font} * fonts;
 *     {@link NkFontConfig struct nk_font_config} * config;
 *     int font_num;
 * }</code></pre>
 */
@NativeType("struct nk_font_atlas")
public class NkFontAtlas extends Struct<NkFontAtlas> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PIXEL,
        TEX_WIDTH,
        TEX_HEIGHT,
        PERMANENT,
        TEMPORARY,
        CUSTOM,
        CURSORS,
        GLYPH_COUNT,
        GLYPHS,
        DEFAULT_FONT,
        FONTS,
        CONFIG,
        FONT_NUM;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(NkAllocator.SIZEOF, NkAllocator.ALIGNOF),
            __member(NkAllocator.SIZEOF, NkAllocator.ALIGNOF),
            __member(NkRecti.SIZEOF, NkRecti.ALIGNOF),
            __array(NkCursor.SIZEOF, NkCursor.ALIGNOF, 7),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PIXEL = layout.offsetof(0);
        TEX_WIDTH = layout.offsetof(1);
        TEX_HEIGHT = layout.offsetof(2);
        PERMANENT = layout.offsetof(3);
        TEMPORARY = layout.offsetof(4);
        CUSTOM = layout.offsetof(5);
        CURSORS = layout.offsetof(6);
        GLYPH_COUNT = layout.offsetof(7);
        GLYPHS = layout.offsetof(8);
        DEFAULT_FONT = layout.offsetof(9);
        FONTS = layout.offsetof(10);
        CONFIG = layout.offsetof(11);
        FONT_NUM = layout.offsetof(12);
    }

    protected NkFontAtlas(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NkFontAtlas create(long address, @Nullable ByteBuffer container) {
        return new NkFontAtlas(address, container);
    }

    /**
     * Creates a {@code NkFontAtlas} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkFontAtlas(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pixel} field. */
    @Nullable
    @NativeType("void *")
    public ByteBuffer pixel() { return npixel(address()); }
    /** @return the value of the {@code tex_width} field. */
    public int tex_width() { return ntex_width(address()); }
    /** @return the value of the {@code tex_height} field. */
    public int tex_height() { return ntex_height(address()); }
    /** @return a {@link NkAllocator} view of the {@code permanent} field. */
    @NativeType("struct nk_allocator")
    public NkAllocator permanent() { return npermanent(address()); }
    /** @return a {@link NkAllocator} view of the {@code temporary} field. */
    @NativeType("struct nk_allocator")
    public NkAllocator temporary() { return ntemporary(address()); }
    /** @return a {@link NkRecti} view of the {@code custom} field. */
    @NativeType("struct nk_recti")
    public NkRecti custom() { return ncustom(address()); }
    /** @return a {@link NkCursor}.Buffer view of the {@code cursors} field. */
    @NativeType("struct nk_cursor[7]")
    public NkCursor.Buffer cursors() { return ncursors(address()); }
    /** @return a {@link NkCursor} view of the struct at the specified index of the {@code cursors} field. */
    @NativeType("struct nk_cursor")
    public NkCursor cursors(int index) { return ncursors(address(), index); }
    /** @return the value of the {@code glyph_count} field. */
    public int glyph_count() { return nglyph_count(address()); }
    /** @return a {@link NkFontGlyph.Buffer} view of the struct array pointed to by the {@code glyphs} field. */
    @Nullable
    @NativeType("struct nk_font_glyph *")
    public NkFontGlyph.Buffer glyphs() { return nglyphs(address()); }
    /** @return a {@link NkFont} view of the struct pointed to by the {@code default_font} field. */
    @Nullable
    @NativeType("struct nk_font *")
    public NkFont default_font() { return ndefault_font(address()); }
    /** @return a {@link NkFont} view of the struct pointed to by the {@code fonts} field. */
    @Nullable
    @NativeType("struct nk_font *")
    public NkFont fonts() { return nfonts(address()); }
    /** @return a {@link NkFontConfig} view of the struct pointed to by the {@code config} field. */
    @Nullable
    @NativeType("struct nk_font_config *")
    public NkFontConfig config() { return nconfig(address()); }
    /** @return the value of the {@code font_num} field. */
    public int font_num() { return nfont_num(address()); }

    /** Sets the address of the specified {@link ByteBuffer} to the {@code pixel} field. */
    public NkFontAtlas pixel(@Nullable @NativeType("void *") ByteBuffer value) { npixel(address(), value); return this; }
    /** Sets the specified value to the {@code tex_width} field. */
    public NkFontAtlas tex_width(int value) { ntex_width(address(), value); return this; }
    /** Sets the specified value to the {@code tex_height} field. */
    public NkFontAtlas tex_height(int value) { ntex_height(address(), value); return this; }
    /** Copies the specified {@link NkAllocator} to the {@code permanent} field. */
    public NkFontAtlas permanent(@NativeType("struct nk_allocator") NkAllocator value) { npermanent(address(), value); return this; }
    /** Passes the {@code permanent} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkFontAtlas permanent(java.util.function.Consumer<NkAllocator> consumer) { consumer.accept(permanent()); return this; }
    /** Copies the specified {@link NkAllocator} to the {@code temporary} field. */
    public NkFontAtlas temporary(@NativeType("struct nk_allocator") NkAllocator value) { ntemporary(address(), value); return this; }
    /** Passes the {@code temporary} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkFontAtlas temporary(java.util.function.Consumer<NkAllocator> consumer) { consumer.accept(temporary()); return this; }
    /** Copies the specified {@link NkRecti} to the {@code custom} field. */
    public NkFontAtlas custom(@NativeType("struct nk_recti") NkRecti value) { ncustom(address(), value); return this; }
    /** Passes the {@code custom} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkFontAtlas custom(java.util.function.Consumer<NkRecti> consumer) { consumer.accept(custom()); return this; }
    /** Copies the specified {@link NkCursor.Buffer} to the {@code cursors} field. */
    public NkFontAtlas cursors(@NativeType("struct nk_cursor[7]") NkCursor.Buffer value) { ncursors(address(), value); return this; }
    /** Copies the specified {@link NkCursor} at the specified index of the {@code cursors} field. */
    public NkFontAtlas cursors(int index, @NativeType("struct nk_cursor") NkCursor value) { ncursors(address(), index, value); return this; }
    /** Passes the {@code cursors} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkFontAtlas cursors(java.util.function.Consumer<NkCursor.Buffer> consumer) { consumer.accept(cursors()); return this; }
    /** Passes the element at {@code index} of the {@code cursors} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkFontAtlas cursors(int index, java.util.function.Consumer<NkCursor> consumer) { consumer.accept(cursors(index)); return this; }
    /** Sets the specified value to the {@code glyph_count} field. */
    public NkFontAtlas glyph_count(int value) { nglyph_count(address(), value); return this; }
    /** Sets the address of the specified {@link NkFontGlyph.Buffer} to the {@code glyphs} field. */
    public NkFontAtlas glyphs(@Nullable @NativeType("struct nk_font_glyph *") NkFontGlyph.Buffer value) { nglyphs(address(), value); return this; }
    /** Sets the address of the specified {@link NkFont} to the {@code default_font} field. */
    public NkFontAtlas default_font(@Nullable @NativeType("struct nk_font *") NkFont value) { ndefault_font(address(), value); return this; }
    /** Sets the address of the specified {@link NkFont} to the {@code fonts} field. */
    public NkFontAtlas fonts(@Nullable @NativeType("struct nk_font *") NkFont value) { nfonts(address(), value); return this; }
    /** Sets the address of the specified {@link NkFontConfig} to the {@code config} field. */
    public NkFontAtlas config(@Nullable @NativeType("struct nk_font_config *") NkFontConfig value) { nconfig(address(), value); return this; }
    /** Sets the specified value to the {@code font_num} field. */
    public NkFontAtlas font_num(int value) { nfont_num(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public NkFontAtlas set(
        @Nullable ByteBuffer pixel,
        int tex_width,
        int tex_height,
        NkAllocator permanent,
        NkAllocator temporary,
        NkRecti custom,
        NkCursor.Buffer cursors,
        int glyph_count,
        @Nullable NkFontGlyph.Buffer glyphs,
        @Nullable NkFont default_font,
        @Nullable NkFont fonts,
        @Nullable NkFontConfig config,
        int font_num
    ) {
        pixel(pixel);
        tex_width(tex_width);
        tex_height(tex_height);
        permanent(permanent);
        temporary(temporary);
        custom(custom);
        cursors(cursors);
        glyph_count(glyph_count);
        glyphs(glyphs);
        default_font(default_font);
        fonts(fonts);
        config(config);
        font_num(font_num);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public NkFontAtlas set(NkFontAtlas src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code NkFontAtlas} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkFontAtlas malloc() {
        return new NkFontAtlas(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code NkFontAtlas} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkFontAtlas calloc() {
        return new NkFontAtlas(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code NkFontAtlas} instance allocated with {@link BufferUtils}. */
    public static NkFontAtlas create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new NkFontAtlas(memAddress(container), container);
    }

    /** Returns a new {@code NkFontAtlas} instance for the specified memory address. */
    public static NkFontAtlas create(long address) {
        return new NkFontAtlas(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkFontAtlas createSafe(long address) {
        return address == NULL ? null : new NkFontAtlas(address, null);
    }

    /**
     * Returns a new {@link NkFontAtlas.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkFontAtlas.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NkFontAtlas.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkFontAtlas.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkFontAtlas.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkFontAtlas.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link NkFontAtlas.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkFontAtlas.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkFontAtlas.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code NkFontAtlas} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkFontAtlas malloc(MemoryStack stack) {
        return new NkFontAtlas(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code NkFontAtlas} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkFontAtlas calloc(MemoryStack stack) {
        return new NkFontAtlas(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link NkFontAtlas.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkFontAtlas.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkFontAtlas.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkFontAtlas.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #pixel() pixel}. */
    @Nullable public static ByteBuffer npixel(long struct) { return memByteBufferSafe(memGetAddress(struct + NkFontAtlas.PIXEL), ntex_width(struct) * ntex_height(struct)); }
    /** Unsafe version of {@link #tex_width}. */
    public static int ntex_width(long struct) { return UNSAFE.getInt(null, struct + NkFontAtlas.TEX_WIDTH); }
    /** Unsafe version of {@link #tex_height}. */
    public static int ntex_height(long struct) { return UNSAFE.getInt(null, struct + NkFontAtlas.TEX_HEIGHT); }
    /** Unsafe version of {@link #permanent}. */
    public static NkAllocator npermanent(long struct) { return NkAllocator.create(struct + NkFontAtlas.PERMANENT); }
    /** Unsafe version of {@link #temporary}. */
    public static NkAllocator ntemporary(long struct) { return NkAllocator.create(struct + NkFontAtlas.TEMPORARY); }
    /** Unsafe version of {@link #custom}. */
    public static NkRecti ncustom(long struct) { return NkRecti.create(struct + NkFontAtlas.CUSTOM); }
    /** Unsafe version of {@link #cursors}. */
    public static NkCursor.Buffer ncursors(long struct) { return NkCursor.create(struct + NkFontAtlas.CURSORS, 7); }
    /** Unsafe version of {@link #cursors(int) cursors}. */
    public static NkCursor ncursors(long struct, int index) {
        return NkCursor.create(struct + NkFontAtlas.CURSORS + check(index, 7) * NkCursor.SIZEOF);
    }
    /** Unsafe version of {@link #glyph_count}. */
    public static int nglyph_count(long struct) { return UNSAFE.getInt(null, struct + NkFontAtlas.GLYPH_COUNT); }
    /** Unsafe version of {@link #glyphs}. */
    @Nullable public static NkFontGlyph.Buffer nglyphs(long struct) { return NkFontGlyph.createSafe(memGetAddress(struct + NkFontAtlas.GLYPHS), nglyph_count(struct)); }
    /** Unsafe version of {@link #default_font}. */
    @Nullable public static NkFont ndefault_font(long struct) { return NkFont.createSafe(memGetAddress(struct + NkFontAtlas.DEFAULT_FONT)); }
    /** Unsafe version of {@link #fonts}. */
    @Nullable public static NkFont nfonts(long struct) { return NkFont.createSafe(memGetAddress(struct + NkFontAtlas.FONTS)); }
    /** Unsafe version of {@link #config}. */
    @Nullable public static NkFontConfig nconfig(long struct) { return NkFontConfig.createSafe(memGetAddress(struct + NkFontAtlas.CONFIG)); }
    /** Unsafe version of {@link #font_num}. */
    public static int nfont_num(long struct) { return UNSAFE.getInt(null, struct + NkFontAtlas.FONT_NUM); }

    /** Unsafe version of {@link #pixel(ByteBuffer) pixel}. */
    public static void npixel(long struct, @Nullable ByteBuffer value) { memPutAddress(struct + NkFontAtlas.PIXEL, memAddressSafe(value)); ntex_width(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code tex_width} field of the specified {@code struct}. */
    public static void ntex_width(long struct, int value) { UNSAFE.putInt(null, struct + NkFontAtlas.TEX_WIDTH, value); }
    /** Sets the specified value to the {@code tex_height} field of the specified {@code struct}. */
    public static void ntex_height(long struct, int value) { UNSAFE.putInt(null, struct + NkFontAtlas.TEX_HEIGHT, value); }
    /** Unsafe version of {@link #permanent(NkAllocator) permanent}. */
    public static void npermanent(long struct, NkAllocator value) { memCopy(value.address(), struct + NkFontAtlas.PERMANENT, NkAllocator.SIZEOF); }
    /** Unsafe version of {@link #temporary(NkAllocator) temporary}. */
    public static void ntemporary(long struct, NkAllocator value) { memCopy(value.address(), struct + NkFontAtlas.TEMPORARY, NkAllocator.SIZEOF); }
    /** Unsafe version of {@link #custom(NkRecti) custom}. */
    public static void ncustom(long struct, NkRecti value) { memCopy(value.address(), struct + NkFontAtlas.CUSTOM, NkRecti.SIZEOF); }
    /** Unsafe version of {@link #cursors(NkCursor.Buffer) cursors}. */
    public static void ncursors(long struct, NkCursor.Buffer value) {
        if (CHECKS) { checkGT(value, 7); }
        memCopy(value.address(), struct + NkFontAtlas.CURSORS, value.remaining() * NkCursor.SIZEOF);
    }
    /** Unsafe version of {@link #cursors(int, NkCursor) cursors}. */
    public static void ncursors(long struct, int index, NkCursor value) {
        memCopy(value.address(), struct + NkFontAtlas.CURSORS + check(index, 7) * NkCursor.SIZEOF, NkCursor.SIZEOF);
    }
    /** Sets the specified value to the {@code glyph_count} field of the specified {@code struct}. */
    public static void nglyph_count(long struct, int value) { UNSAFE.putInt(null, struct + NkFontAtlas.GLYPH_COUNT, value); }
    /** Unsafe version of {@link #glyphs(NkFontGlyph.Buffer) glyphs}. */
    public static void nglyphs(long struct, @Nullable NkFontGlyph.Buffer value) { memPutAddress(struct + NkFontAtlas.GLYPHS, memAddressSafe(value)); nglyph_count(struct, value == null ? 0 : value.remaining()); }
    /** Unsafe version of {@link #default_font(NkFont) default_font}. */
    public static void ndefault_font(long struct, @Nullable NkFont value) { memPutAddress(struct + NkFontAtlas.DEFAULT_FONT, memAddressSafe(value)); }
    /** Unsafe version of {@link #fonts(NkFont) fonts}. */
    public static void nfonts(long struct, @Nullable NkFont value) { memPutAddress(struct + NkFontAtlas.FONTS, memAddressSafe(value)); }
    /** Unsafe version of {@link #config(NkFontConfig) config}. */
    public static void nconfig(long struct, @Nullable NkFontConfig value) { memPutAddress(struct + NkFontAtlas.CONFIG, memAddressSafe(value)); }
    /** Unsafe version of {@link #font_num(int) font_num}. */
    public static void nfont_num(long struct, int value) { UNSAFE.putInt(null, struct + NkFontAtlas.FONT_NUM, value); }

    // -----------------------------------

    /** An array of {@link NkFontAtlas} structs. */
    public static class Buffer extends StructBuffer<NkFontAtlas, Buffer> implements NativeResource {

        private static final NkFontAtlas ELEMENT_FACTORY = NkFontAtlas.create(-1L);

        /**
         * Creates a new {@code NkFontAtlas.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkFontAtlas#SIZEOF}, and its mark will be undefined.</p>
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
        protected NkFontAtlas getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pixel} field. */
        @Nullable
        @NativeType("void *")
        public ByteBuffer pixel() { return NkFontAtlas.npixel(address()); }
        /** @return the value of the {@code tex_width} field. */
        public int tex_width() { return NkFontAtlas.ntex_width(address()); }
        /** @return the value of the {@code tex_height} field. */
        public int tex_height() { return NkFontAtlas.ntex_height(address()); }
        /** @return a {@link NkAllocator} view of the {@code permanent} field. */
        @NativeType("struct nk_allocator")
        public NkAllocator permanent() { return NkFontAtlas.npermanent(address()); }
        /** @return a {@link NkAllocator} view of the {@code temporary} field. */
        @NativeType("struct nk_allocator")
        public NkAllocator temporary() { return NkFontAtlas.ntemporary(address()); }
        /** @return a {@link NkRecti} view of the {@code custom} field. */
        @NativeType("struct nk_recti")
        public NkRecti custom() { return NkFontAtlas.ncustom(address()); }
        /** @return a {@link NkCursor}.Buffer view of the {@code cursors} field. */
        @NativeType("struct nk_cursor[7]")
        public NkCursor.Buffer cursors() { return NkFontAtlas.ncursors(address()); }
        /** @return a {@link NkCursor} view of the struct at the specified index of the {@code cursors} field. */
        @NativeType("struct nk_cursor")
        public NkCursor cursors(int index) { return NkFontAtlas.ncursors(address(), index); }
        /** @return the value of the {@code glyph_count} field. */
        public int glyph_count() { return NkFontAtlas.nglyph_count(address()); }
        /** @return a {@link NkFontGlyph.Buffer} view of the struct array pointed to by the {@code glyphs} field. */
        @Nullable
        @NativeType("struct nk_font_glyph *")
        public NkFontGlyph.Buffer glyphs() { return NkFontAtlas.nglyphs(address()); }
        /** @return a {@link NkFont} view of the struct pointed to by the {@code default_font} field. */
        @Nullable
        @NativeType("struct nk_font *")
        public NkFont default_font() { return NkFontAtlas.ndefault_font(address()); }
        /** @return a {@link NkFont} view of the struct pointed to by the {@code fonts} field. */
        @Nullable
        @NativeType("struct nk_font *")
        public NkFont fonts() { return NkFontAtlas.nfonts(address()); }
        /** @return a {@link NkFontConfig} view of the struct pointed to by the {@code config} field. */
        @Nullable
        @NativeType("struct nk_font_config *")
        public NkFontConfig config() { return NkFontAtlas.nconfig(address()); }
        /** @return the value of the {@code font_num} field. */
        public int font_num() { return NkFontAtlas.nfont_num(address()); }

        /** Sets the address of the specified {@link ByteBuffer} to the {@code pixel} field. */
        public NkFontAtlas.Buffer pixel(@Nullable @NativeType("void *") ByteBuffer value) { NkFontAtlas.npixel(address(), value); return this; }
        /** Sets the specified value to the {@code tex_width} field. */
        public NkFontAtlas.Buffer tex_width(int value) { NkFontAtlas.ntex_width(address(), value); return this; }
        /** Sets the specified value to the {@code tex_height} field. */
        public NkFontAtlas.Buffer tex_height(int value) { NkFontAtlas.ntex_height(address(), value); return this; }
        /** Copies the specified {@link NkAllocator} to the {@code permanent} field. */
        public NkFontAtlas.Buffer permanent(@NativeType("struct nk_allocator") NkAllocator value) { NkFontAtlas.npermanent(address(), value); return this; }
        /** Passes the {@code permanent} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkFontAtlas.Buffer permanent(java.util.function.Consumer<NkAllocator> consumer) { consumer.accept(permanent()); return this; }
        /** Copies the specified {@link NkAllocator} to the {@code temporary} field. */
        public NkFontAtlas.Buffer temporary(@NativeType("struct nk_allocator") NkAllocator value) { NkFontAtlas.ntemporary(address(), value); return this; }
        /** Passes the {@code temporary} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkFontAtlas.Buffer temporary(java.util.function.Consumer<NkAllocator> consumer) { consumer.accept(temporary()); return this; }
        /** Copies the specified {@link NkRecti} to the {@code custom} field. */
        public NkFontAtlas.Buffer custom(@NativeType("struct nk_recti") NkRecti value) { NkFontAtlas.ncustom(address(), value); return this; }
        /** Passes the {@code custom} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkFontAtlas.Buffer custom(java.util.function.Consumer<NkRecti> consumer) { consumer.accept(custom()); return this; }
        /** Copies the specified {@link NkCursor.Buffer} to the {@code cursors} field. */
        public NkFontAtlas.Buffer cursors(@NativeType("struct nk_cursor[7]") NkCursor.Buffer value) { NkFontAtlas.ncursors(address(), value); return this; }
        /** Copies the specified {@link NkCursor} at the specified index of the {@code cursors} field. */
        public NkFontAtlas.Buffer cursors(int index, @NativeType("struct nk_cursor") NkCursor value) { NkFontAtlas.ncursors(address(), index, value); return this; }
        /** Passes the {@code cursors} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkFontAtlas.Buffer cursors(java.util.function.Consumer<NkCursor.Buffer> consumer) { consumer.accept(cursors()); return this; }
        /** Passes the element at {@code index} of the {@code cursors} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkFontAtlas.Buffer cursors(int index, java.util.function.Consumer<NkCursor> consumer) { consumer.accept(cursors(index)); return this; }
        /** Sets the specified value to the {@code glyph_count} field. */
        public NkFontAtlas.Buffer glyph_count(int value) { NkFontAtlas.nglyph_count(address(), value); return this; }
        /** Sets the address of the specified {@link NkFontGlyph.Buffer} to the {@code glyphs} field. */
        public NkFontAtlas.Buffer glyphs(@Nullable @NativeType("struct nk_font_glyph *") NkFontGlyph.Buffer value) { NkFontAtlas.nglyphs(address(), value); return this; }
        /** Sets the address of the specified {@link NkFont} to the {@code default_font} field. */
        public NkFontAtlas.Buffer default_font(@Nullable @NativeType("struct nk_font *") NkFont value) { NkFontAtlas.ndefault_font(address(), value); return this; }
        /** Sets the address of the specified {@link NkFont} to the {@code fonts} field. */
        public NkFontAtlas.Buffer fonts(@Nullable @NativeType("struct nk_font *") NkFont value) { NkFontAtlas.nfonts(address(), value); return this; }
        /** Sets the address of the specified {@link NkFontConfig} to the {@code config} field. */
        public NkFontAtlas.Buffer config(@Nullable @NativeType("struct nk_font_config *") NkFontConfig value) { NkFontAtlas.nconfig(address(), value); return this; }
        /** Sets the specified value to the {@code font_num} field. */
        public NkFontAtlas.Buffer font_num(int value) { NkFontAtlas.nfont_num(address(), value); return this; }

    }

}