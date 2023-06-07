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
 * struct nk_baked_font {
 *     float {@link #height};
 *     float {@link #ascent};
 *     float {@link #descent};
 *     nk_rune {@link #glyph_offset};
 *     nk_rune {@link #glyph_count};
 *     nk_rune const * {@link #ranges};
 * }</code></pre>
 */
@NativeType("struct nk_baked_font")
public class NkBakedFont extends Struct<NkBakedFont> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HEIGHT,
        ASCENT,
        DESCENT,
        GLYPH_OFFSET,
        GLYPH_COUNT,
        RANGES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HEIGHT = layout.offsetof(0);
        ASCENT = layout.offsetof(1);
        DESCENT = layout.offsetof(2);
        GLYPH_OFFSET = layout.offsetof(3);
        GLYPH_COUNT = layout.offsetof(4);
        RANGES = layout.offsetof(5);
    }

    protected NkBakedFont(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NkBakedFont create(long address, @Nullable ByteBuffer container) {
        return new NkBakedFont(address, container);
    }

    /**
     * Creates a {@code NkBakedFont} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkBakedFont(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** height of the font */
    public float height() { return nheight(address()); }
    /** font glyph ascent */
    public float ascent() { return nascent(address()); }
    /** font glyph descent */
    public float descent() { return ndescent(address()); }
    /** glyph array offset inside the font glyph baking output array */
    @NativeType("nk_rune")
    public int glyph_offset() { return nglyph_offset(address()); }
    /** number of glyphs of this font inside the glyph baking array output */
    @NativeType("nk_rune")
    public int glyph_count() { return nglyph_count(address()); }
    /**
     * @param capacity the number of elements in the returned buffer
     *
     * @return font codepoint ranges as pairs of (from/to) and 0 as last element
     */
    @Nullable
    @NativeType("nk_rune const *")
    public IntBuffer ranges(int capacity) { return nranges(address(), capacity); }

    /** Sets the specified value to the {@link #height} field. */
    public NkBakedFont height(float value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@link #ascent} field. */
    public NkBakedFont ascent(float value) { nascent(address(), value); return this; }
    /** Sets the specified value to the {@link #descent} field. */
    public NkBakedFont descent(float value) { ndescent(address(), value); return this; }
    /** Sets the specified value to the {@link #glyph_offset} field. */
    public NkBakedFont glyph_offset(@NativeType("nk_rune") int value) { nglyph_offset(address(), value); return this; }
    /** Sets the specified value to the {@link #glyph_count} field. */
    public NkBakedFont glyph_count(@NativeType("nk_rune") int value) { nglyph_count(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #ranges} field. */
    public NkBakedFont ranges(@Nullable @NativeType("nk_rune const *") IntBuffer value) { nranges(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public NkBakedFont set(
        float height,
        float ascent,
        float descent,
        int glyph_offset,
        int glyph_count,
        @Nullable IntBuffer ranges
    ) {
        height(height);
        ascent(ascent);
        descent(descent);
        glyph_offset(glyph_offset);
        glyph_count(glyph_count);
        ranges(ranges);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public NkBakedFont set(NkBakedFont src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code NkBakedFont} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkBakedFont malloc() {
        return new NkBakedFont(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code NkBakedFont} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkBakedFont calloc() {
        return new NkBakedFont(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code NkBakedFont} instance allocated with {@link BufferUtils}. */
    public static NkBakedFont create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new NkBakedFont(memAddress(container), container);
    }

    /** Returns a new {@code NkBakedFont} instance for the specified memory address. */
    public static NkBakedFont create(long address) {
        return new NkBakedFont(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkBakedFont createSafe(long address) {
        return address == NULL ? null : new NkBakedFont(address, null);
    }

    /**
     * Returns a new {@link NkBakedFont.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkBakedFont.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NkBakedFont.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkBakedFont.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkBakedFont.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkBakedFont.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link NkBakedFont.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkBakedFont.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkBakedFont.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code NkBakedFont} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkBakedFont malloc(MemoryStack stack) {
        return new NkBakedFont(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code NkBakedFont} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkBakedFont calloc(MemoryStack stack) {
        return new NkBakedFont(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link NkBakedFont.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkBakedFont.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkBakedFont.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkBakedFont.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #height}. */
    public static float nheight(long struct) { return UNSAFE.getFloat(null, struct + NkBakedFont.HEIGHT); }
    /** Unsafe version of {@link #ascent}. */
    public static float nascent(long struct) { return UNSAFE.getFloat(null, struct + NkBakedFont.ASCENT); }
    /** Unsafe version of {@link #descent}. */
    public static float ndescent(long struct) { return UNSAFE.getFloat(null, struct + NkBakedFont.DESCENT); }
    /** Unsafe version of {@link #glyph_offset}. */
    public static int nglyph_offset(long struct) { return UNSAFE.getInt(null, struct + NkBakedFont.GLYPH_OFFSET); }
    /** Unsafe version of {@link #glyph_count}. */
    public static int nglyph_count(long struct) { return UNSAFE.getInt(null, struct + NkBakedFont.GLYPH_COUNT); }
    /** Unsafe version of {@link #ranges(int) ranges}. */
    @Nullable public static IntBuffer nranges(long struct, int capacity) { return memIntBufferSafe(memGetAddress(struct + NkBakedFont.RANGES), capacity); }

    /** Unsafe version of {@link #height(float) height}. */
    public static void nheight(long struct, float value) { UNSAFE.putFloat(null, struct + NkBakedFont.HEIGHT, value); }
    /** Unsafe version of {@link #ascent(float) ascent}. */
    public static void nascent(long struct, float value) { UNSAFE.putFloat(null, struct + NkBakedFont.ASCENT, value); }
    /** Unsafe version of {@link #descent(float) descent}. */
    public static void ndescent(long struct, float value) { UNSAFE.putFloat(null, struct + NkBakedFont.DESCENT, value); }
    /** Unsafe version of {@link #glyph_offset(int) glyph_offset}. */
    public static void nglyph_offset(long struct, int value) { UNSAFE.putInt(null, struct + NkBakedFont.GLYPH_OFFSET, value); }
    /** Unsafe version of {@link #glyph_count(int) glyph_count}. */
    public static void nglyph_count(long struct, int value) { UNSAFE.putInt(null, struct + NkBakedFont.GLYPH_COUNT, value); }
    /** Unsafe version of {@link #ranges(IntBuffer) ranges}. */
    public static void nranges(long struct, @Nullable IntBuffer value) { memPutAddress(struct + NkBakedFont.RANGES, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link NkBakedFont} structs. */
    public static class Buffer extends StructBuffer<NkBakedFont, Buffer> implements NativeResource {

        private static final NkBakedFont ELEMENT_FACTORY = NkBakedFont.create(-1L);

        /**
         * Creates a new {@code NkBakedFont.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkBakedFont#SIZEOF}, and its mark will be undefined.</p>
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
        protected NkBakedFont getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link NkBakedFont#height} field. */
        public float height() { return NkBakedFont.nheight(address()); }
        /** @return the value of the {@link NkBakedFont#ascent} field. */
        public float ascent() { return NkBakedFont.nascent(address()); }
        /** @return the value of the {@link NkBakedFont#descent} field. */
        public float descent() { return NkBakedFont.ndescent(address()); }
        /** @return the value of the {@link NkBakedFont#glyph_offset} field. */
        @NativeType("nk_rune")
        public int glyph_offset() { return NkBakedFont.nglyph_offset(address()); }
        /** @return the value of the {@link NkBakedFont#glyph_count} field. */
        @NativeType("nk_rune")
        public int glyph_count() { return NkBakedFont.nglyph_count(address()); }
        /**
         * @return a {@link IntBuffer} view of the data pointed to by the {@link NkBakedFont#ranges} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @Nullable
        @NativeType("nk_rune const *")
        public IntBuffer ranges(int capacity) { return NkBakedFont.nranges(address(), capacity); }

        /** Sets the specified value to the {@link NkBakedFont#height} field. */
        public NkBakedFont.Buffer height(float value) { NkBakedFont.nheight(address(), value); return this; }
        /** Sets the specified value to the {@link NkBakedFont#ascent} field. */
        public NkBakedFont.Buffer ascent(float value) { NkBakedFont.nascent(address(), value); return this; }
        /** Sets the specified value to the {@link NkBakedFont#descent} field. */
        public NkBakedFont.Buffer descent(float value) { NkBakedFont.ndescent(address(), value); return this; }
        /** Sets the specified value to the {@link NkBakedFont#glyph_offset} field. */
        public NkBakedFont.Buffer glyph_offset(@NativeType("nk_rune") int value) { NkBakedFont.nglyph_offset(address(), value); return this; }
        /** Sets the specified value to the {@link NkBakedFont#glyph_count} field. */
        public NkBakedFont.Buffer glyph_count(@NativeType("nk_rune") int value) { NkBakedFont.nglyph_count(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link NkBakedFont#ranges} field. */
        public NkBakedFont.Buffer ranges(@Nullable @NativeType("nk_rune const *") IntBuffer value) { NkBakedFont.nranges(address(), value); return this; }

    }

}