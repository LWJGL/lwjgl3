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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct nk_font {
 *     {@link NkFont struct nk_font} * next;
 *     {@link NkUserFont struct nk_user_font} handle;
 *     {@link NkBakedFont struct nk_baked_font} info;
 *     float scale;
 *     {@link NkFontGlyph struct nk_font_glyph} * glyphs;
 *     {@link NkFontGlyph struct nk_font_glyph} const * fallback;
 *     nk_rune fallback_codepoint;
 *     {@link NkHandle nk_handle} texture;
 *     {@link NkFontConfig struct nk_font_config} * config;
 * }</code></pre>
 */
@NativeType("struct nk_font")
public class NkFont extends Struct<NkFont> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NEXT,
        HANDLE,
        INFO,
        SCALE,
        GLYPHS,
        FALLBACK,
        FALLBACK_CODEPOINT,
        TEXTURE,
        CONFIG;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(NkUserFont.SIZEOF, NkUserFont.ALIGNOF),
            __member(NkBakedFont.SIZEOF, NkBakedFont.ALIGNOF),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(NkHandle.SIZEOF, NkHandle.ALIGNOF),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NEXT = layout.offsetof(0);
        HANDLE = layout.offsetof(1);
        INFO = layout.offsetof(2);
        SCALE = layout.offsetof(3);
        GLYPHS = layout.offsetof(4);
        FALLBACK = layout.offsetof(5);
        FALLBACK_CODEPOINT = layout.offsetof(6);
        TEXTURE = layout.offsetof(7);
        CONFIG = layout.offsetof(8);
    }

    protected NkFont(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NkFont create(long address, @Nullable ByteBuffer container) {
        return new NkFont(address, container);
    }

    /**
     * Creates a {@code NkFont} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkFont(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link NkFont} view of the struct pointed to by the {@code next} field. */
    @Nullable
    @NativeType("struct nk_font *")
    public NkFont next() { return nnext(address()); }
    /** @return a {@link NkUserFont} view of the {@code handle} field. */
    @NativeType("struct nk_user_font")
    public NkUserFont handle() { return nhandle(address()); }
    /** @return a {@link NkBakedFont} view of the {@code info} field. */
    @NativeType("struct nk_baked_font")
    public NkBakedFont info() { return ninfo(address()); }
    /** @return the value of the {@code scale} field. */
    public float scale() { return nscale(address()); }
    /** @return a {@link NkFontGlyph} view of the struct pointed to by the {@code glyphs} field. */
    @Nullable
    @NativeType("struct nk_font_glyph *")
    public NkFontGlyph glyphs() { return nglyphs(address()); }
    /** @return a {@link NkFontGlyph} view of the struct pointed to by the {@code fallback} field. */
    @Nullable
    @NativeType("struct nk_font_glyph const *")
    public NkFontGlyph fallback() { return nfallback(address()); }
    /** @return the value of the {@code fallback_codepoint} field. */
    @NativeType("nk_rune")
    public int fallback_codepoint() { return nfallback_codepoint(address()); }
    /** @return a {@link NkHandle} view of the {@code texture} field. */
    @NativeType("nk_handle")
    public NkHandle texture() { return ntexture(address()); }
    /** @return a {@link NkFontConfig} view of the struct pointed to by the {@code config} field. */
    @Nullable
    @NativeType("struct nk_font_config *")
    public NkFontConfig config() { return nconfig(address()); }

    /** Sets the address of the specified {@link NkFont} to the {@code next} field. */
    public NkFont next(@Nullable @NativeType("struct nk_font *") NkFont value) { nnext(address(), value); return this; }
    /** Copies the specified {@link NkUserFont} to the {@code handle} field. */
    public NkFont handle(@NativeType("struct nk_user_font") NkUserFont value) { nhandle(address(), value); return this; }
    /** Passes the {@code handle} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkFont handle(java.util.function.Consumer<NkUserFont> consumer) { consumer.accept(handle()); return this; }
    /** Copies the specified {@link NkBakedFont} to the {@code info} field. */
    public NkFont info(@NativeType("struct nk_baked_font") NkBakedFont value) { ninfo(address(), value); return this; }
    /** Passes the {@code info} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkFont info(java.util.function.Consumer<NkBakedFont> consumer) { consumer.accept(info()); return this; }
    /** Sets the specified value to the {@code scale} field. */
    public NkFont scale(float value) { nscale(address(), value); return this; }
    /** Sets the address of the specified {@link NkFontGlyph} to the {@code glyphs} field. */
    public NkFont glyphs(@Nullable @NativeType("struct nk_font_glyph *") NkFontGlyph value) { nglyphs(address(), value); return this; }
    /** Sets the address of the specified {@link NkFontGlyph} to the {@code fallback} field. */
    public NkFont fallback(@Nullable @NativeType("struct nk_font_glyph const *") NkFontGlyph value) { nfallback(address(), value); return this; }
    /** Sets the specified value to the {@code fallback_codepoint} field. */
    public NkFont fallback_codepoint(@NativeType("nk_rune") int value) { nfallback_codepoint(address(), value); return this; }
    /** Copies the specified {@link NkHandle} to the {@code texture} field. */
    public NkFont texture(@NativeType("nk_handle") NkHandle value) { ntexture(address(), value); return this; }
    /** Passes the {@code texture} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkFont texture(java.util.function.Consumer<NkHandle> consumer) { consumer.accept(texture()); return this; }
    /** Sets the address of the specified {@link NkFontConfig} to the {@code config} field. */
    public NkFont config(@Nullable @NativeType("struct nk_font_config *") NkFontConfig value) { nconfig(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public NkFont set(
        @Nullable NkFont next,
        NkUserFont handle,
        NkBakedFont info,
        float scale,
        @Nullable NkFontGlyph glyphs,
        @Nullable NkFontGlyph fallback,
        int fallback_codepoint,
        NkHandle texture,
        @Nullable NkFontConfig config
    ) {
        next(next);
        handle(handle);
        info(info);
        scale(scale);
        glyphs(glyphs);
        fallback(fallback);
        fallback_codepoint(fallback_codepoint);
        texture(texture);
        config(config);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public NkFont set(NkFont src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code NkFont} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkFont malloc() {
        return new NkFont(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code NkFont} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkFont calloc() {
        return new NkFont(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code NkFont} instance allocated with {@link BufferUtils}. */
    public static NkFont create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new NkFont(memAddress(container), container);
    }

    /** Returns a new {@code NkFont} instance for the specified memory address. */
    public static NkFont create(long address) {
        return new NkFont(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkFont createSafe(long address) {
        return address == NULL ? null : new NkFont(address, null);
    }

    /**
     * Returns a new {@link NkFont.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkFont.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NkFont.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkFont.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkFont.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkFont.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link NkFont.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkFont.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkFont.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code NkFont} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkFont malloc(MemoryStack stack) {
        return new NkFont(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code NkFont} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkFont calloc(MemoryStack stack) {
        return new NkFont(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link NkFont.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkFont.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkFont.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkFont.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #next}. */
    @Nullable public static NkFont nnext(long struct) { return NkFont.createSafe(memGetAddress(struct + NkFont.NEXT)); }
    /** Unsafe version of {@link #handle}. */
    public static NkUserFont nhandle(long struct) { return NkUserFont.create(struct + NkFont.HANDLE); }
    /** Unsafe version of {@link #info}. */
    public static NkBakedFont ninfo(long struct) { return NkBakedFont.create(struct + NkFont.INFO); }
    /** Unsafe version of {@link #scale}. */
    public static float nscale(long struct) { return UNSAFE.getFloat(null, struct + NkFont.SCALE); }
    /** Unsafe version of {@link #glyphs}. */
    @Nullable public static NkFontGlyph nglyphs(long struct) { return NkFontGlyph.createSafe(memGetAddress(struct + NkFont.GLYPHS)); }
    /** Unsafe version of {@link #fallback}. */
    @Nullable public static NkFontGlyph nfallback(long struct) { return NkFontGlyph.createSafe(memGetAddress(struct + NkFont.FALLBACK)); }
    /** Unsafe version of {@link #fallback_codepoint}. */
    public static int nfallback_codepoint(long struct) { return UNSAFE.getInt(null, struct + NkFont.FALLBACK_CODEPOINT); }
    /** Unsafe version of {@link #texture}. */
    public static NkHandle ntexture(long struct) { return NkHandle.create(struct + NkFont.TEXTURE); }
    /** Unsafe version of {@link #config}. */
    @Nullable public static NkFontConfig nconfig(long struct) { return NkFontConfig.createSafe(memGetAddress(struct + NkFont.CONFIG)); }

    /** Unsafe version of {@link #next(NkFont) next}. */
    public static void nnext(long struct, @Nullable NkFont value) { memPutAddress(struct + NkFont.NEXT, memAddressSafe(value)); }
    /** Unsafe version of {@link #handle(NkUserFont) handle}. */
    public static void nhandle(long struct, NkUserFont value) { memCopy(value.address(), struct + NkFont.HANDLE, NkUserFont.SIZEOF); }
    /** Unsafe version of {@link #info(NkBakedFont) info}. */
    public static void ninfo(long struct, NkBakedFont value) { memCopy(value.address(), struct + NkFont.INFO, NkBakedFont.SIZEOF); }
    /** Unsafe version of {@link #scale(float) scale}. */
    public static void nscale(long struct, float value) { UNSAFE.putFloat(null, struct + NkFont.SCALE, value); }
    /** Unsafe version of {@link #glyphs(NkFontGlyph) glyphs}. */
    public static void nglyphs(long struct, @Nullable NkFontGlyph value) { memPutAddress(struct + NkFont.GLYPHS, memAddressSafe(value)); }
    /** Unsafe version of {@link #fallback(NkFontGlyph) fallback}. */
    public static void nfallback(long struct, @Nullable NkFontGlyph value) { memPutAddress(struct + NkFont.FALLBACK, memAddressSafe(value)); }
    /** Unsafe version of {@link #fallback_codepoint(int) fallback_codepoint}. */
    public static void nfallback_codepoint(long struct, int value) { UNSAFE.putInt(null, struct + NkFont.FALLBACK_CODEPOINT, value); }
    /** Unsafe version of {@link #texture(NkHandle) texture}. */
    public static void ntexture(long struct, NkHandle value) { memCopy(value.address(), struct + NkFont.TEXTURE, NkHandle.SIZEOF); }
    /** Unsafe version of {@link #config(NkFontConfig) config}. */
    public static void nconfig(long struct, @Nullable NkFontConfig value) { memPutAddress(struct + NkFont.CONFIG, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link NkFont} structs. */
    public static class Buffer extends StructBuffer<NkFont, Buffer> implements NativeResource {

        private static final NkFont ELEMENT_FACTORY = NkFont.create(-1L);

        /**
         * Creates a new {@code NkFont.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkFont#SIZEOF}, and its mark will be undefined.</p>
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
        protected NkFont getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link NkFont} view of the struct pointed to by the {@code next} field. */
        @Nullable
        @NativeType("struct nk_font *")
        public NkFont next() { return NkFont.nnext(address()); }
        /** @return a {@link NkUserFont} view of the {@code handle} field. */
        @NativeType("struct nk_user_font")
        public NkUserFont handle() { return NkFont.nhandle(address()); }
        /** @return a {@link NkBakedFont} view of the {@code info} field. */
        @NativeType("struct nk_baked_font")
        public NkBakedFont info() { return NkFont.ninfo(address()); }
        /** @return the value of the {@code scale} field. */
        public float scale() { return NkFont.nscale(address()); }
        /** @return a {@link NkFontGlyph} view of the struct pointed to by the {@code glyphs} field. */
        @Nullable
        @NativeType("struct nk_font_glyph *")
        public NkFontGlyph glyphs() { return NkFont.nglyphs(address()); }
        /** @return a {@link NkFontGlyph} view of the struct pointed to by the {@code fallback} field. */
        @Nullable
        @NativeType("struct nk_font_glyph const *")
        public NkFontGlyph fallback() { return NkFont.nfallback(address()); }
        /** @return the value of the {@code fallback_codepoint} field. */
        @NativeType("nk_rune")
        public int fallback_codepoint() { return NkFont.nfallback_codepoint(address()); }
        /** @return a {@link NkHandle} view of the {@code texture} field. */
        @NativeType("nk_handle")
        public NkHandle texture() { return NkFont.ntexture(address()); }
        /** @return a {@link NkFontConfig} view of the struct pointed to by the {@code config} field. */
        @Nullable
        @NativeType("struct nk_font_config *")
        public NkFontConfig config() { return NkFont.nconfig(address()); }

        /** Sets the address of the specified {@link NkFont} to the {@code next} field. */
        public NkFont.Buffer next(@Nullable @NativeType("struct nk_font *") NkFont value) { NkFont.nnext(address(), value); return this; }
        /** Copies the specified {@link NkUserFont} to the {@code handle} field. */
        public NkFont.Buffer handle(@NativeType("struct nk_user_font") NkUserFont value) { NkFont.nhandle(address(), value); return this; }
        /** Passes the {@code handle} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkFont.Buffer handle(java.util.function.Consumer<NkUserFont> consumer) { consumer.accept(handle()); return this; }
        /** Copies the specified {@link NkBakedFont} to the {@code info} field. */
        public NkFont.Buffer info(@NativeType("struct nk_baked_font") NkBakedFont value) { NkFont.ninfo(address(), value); return this; }
        /** Passes the {@code info} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkFont.Buffer info(java.util.function.Consumer<NkBakedFont> consumer) { consumer.accept(info()); return this; }
        /** Sets the specified value to the {@code scale} field. */
        public NkFont.Buffer scale(float value) { NkFont.nscale(address(), value); return this; }
        /** Sets the address of the specified {@link NkFontGlyph} to the {@code glyphs} field. */
        public NkFont.Buffer glyphs(@Nullable @NativeType("struct nk_font_glyph *") NkFontGlyph value) { NkFont.nglyphs(address(), value); return this; }
        /** Sets the address of the specified {@link NkFontGlyph} to the {@code fallback} field. */
        public NkFont.Buffer fallback(@Nullable @NativeType("struct nk_font_glyph const *") NkFontGlyph value) { NkFont.nfallback(address(), value); return this; }
        /** Sets the specified value to the {@code fallback_codepoint} field. */
        public NkFont.Buffer fallback_codepoint(@NativeType("nk_rune") int value) { NkFont.nfallback_codepoint(address(), value); return this; }
        /** Copies the specified {@link NkHandle} to the {@code texture} field. */
        public NkFont.Buffer texture(@NativeType("nk_handle") NkHandle value) { NkFont.ntexture(address(), value); return this; }
        /** Passes the {@code texture} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkFont.Buffer texture(java.util.function.Consumer<NkHandle> consumer) { consumer.accept(texture()); return this; }
        /** Sets the address of the specified {@link NkFontConfig} to the {@code config} field. */
        public NkFont.Buffer config(@Nullable @NativeType("struct nk_font_config *") NkFontConfig value) { NkFont.nconfig(address(), value); return this; }

    }

}