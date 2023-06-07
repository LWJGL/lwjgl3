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
 * struct nk_font_glyph {
 *     nk_rune codepoint;
 *     float xadvance;
 *     float x0;
 *     float y0;
 *     float x1;
 *     float y1;
 *     float w;
 *     float h;
 *     float u0;
 *     float v0;
 *     float u1;
 *     float v1;
 * }</code></pre>
 */
@NativeType("struct nk_font_glyph")
public class NkFontGlyph extends Struct<NkFontGlyph> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CODEPOINT,
        XADVANCE,
        X0,
        Y0,
        X1,
        Y1,
        W,
        H,
        U0,
        V0,
        U1,
        V1;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CODEPOINT = layout.offsetof(0);
        XADVANCE = layout.offsetof(1);
        X0 = layout.offsetof(2);
        Y0 = layout.offsetof(3);
        X1 = layout.offsetof(4);
        Y1 = layout.offsetof(5);
        W = layout.offsetof(6);
        H = layout.offsetof(7);
        U0 = layout.offsetof(8);
        V0 = layout.offsetof(9);
        U1 = layout.offsetof(10);
        V1 = layout.offsetof(11);
    }

    protected NkFontGlyph(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NkFontGlyph create(long address, @Nullable ByteBuffer container) {
        return new NkFontGlyph(address, container);
    }

    /**
     * Creates a {@code NkFontGlyph} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkFontGlyph(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code codepoint} field. */
    @NativeType("nk_rune")
    public int codepoint() { return ncodepoint(address()); }
    /** @return the value of the {@code xadvance} field. */
    public float xadvance() { return nxadvance(address()); }
    /** @return the value of the {@code x0} field. */
    public float x0() { return nx0(address()); }
    /** @return the value of the {@code y0} field. */
    public float y0() { return ny0(address()); }
    /** @return the value of the {@code x1} field. */
    public float x1() { return nx1(address()); }
    /** @return the value of the {@code y1} field. */
    public float y1() { return ny1(address()); }
    /** @return the value of the {@code w} field. */
    public float w() { return nw(address()); }
    /** @return the value of the {@code h} field. */
    public float h() { return nh(address()); }
    /** @return the value of the {@code u0} field. */
    public float u0() { return nu0(address()); }
    /** @return the value of the {@code v0} field. */
    public float v0() { return nv0(address()); }
    /** @return the value of the {@code u1} field. */
    public float u1() { return nu1(address()); }
    /** @return the value of the {@code v1} field. */
    public float v1() { return nv1(address()); }

    /** Sets the specified value to the {@code codepoint} field. */
    public NkFontGlyph codepoint(@NativeType("nk_rune") int value) { ncodepoint(address(), value); return this; }
    /** Sets the specified value to the {@code xadvance} field. */
    public NkFontGlyph xadvance(float value) { nxadvance(address(), value); return this; }
    /** Sets the specified value to the {@code x0} field. */
    public NkFontGlyph x0(float value) { nx0(address(), value); return this; }
    /** Sets the specified value to the {@code y0} field. */
    public NkFontGlyph y0(float value) { ny0(address(), value); return this; }
    /** Sets the specified value to the {@code x1} field. */
    public NkFontGlyph x1(float value) { nx1(address(), value); return this; }
    /** Sets the specified value to the {@code y1} field. */
    public NkFontGlyph y1(float value) { ny1(address(), value); return this; }
    /** Sets the specified value to the {@code w} field. */
    public NkFontGlyph w(float value) { nw(address(), value); return this; }
    /** Sets the specified value to the {@code h} field. */
    public NkFontGlyph h(float value) { nh(address(), value); return this; }
    /** Sets the specified value to the {@code u0} field. */
    public NkFontGlyph u0(float value) { nu0(address(), value); return this; }
    /** Sets the specified value to the {@code v0} field. */
    public NkFontGlyph v0(float value) { nv0(address(), value); return this; }
    /** Sets the specified value to the {@code u1} field. */
    public NkFontGlyph u1(float value) { nu1(address(), value); return this; }
    /** Sets the specified value to the {@code v1} field. */
    public NkFontGlyph v1(float value) { nv1(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public NkFontGlyph set(
        int codepoint,
        float xadvance,
        float x0,
        float y0,
        float x1,
        float y1,
        float w,
        float h,
        float u0,
        float v0,
        float u1,
        float v1
    ) {
        codepoint(codepoint);
        xadvance(xadvance);
        x0(x0);
        y0(y0);
        x1(x1);
        y1(y1);
        w(w);
        h(h);
        u0(u0);
        v0(v0);
        u1(u1);
        v1(v1);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public NkFontGlyph set(NkFontGlyph src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code NkFontGlyph} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkFontGlyph malloc() {
        return new NkFontGlyph(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code NkFontGlyph} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkFontGlyph calloc() {
        return new NkFontGlyph(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code NkFontGlyph} instance allocated with {@link BufferUtils}. */
    public static NkFontGlyph create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new NkFontGlyph(memAddress(container), container);
    }

    /** Returns a new {@code NkFontGlyph} instance for the specified memory address. */
    public static NkFontGlyph create(long address) {
        return new NkFontGlyph(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkFontGlyph createSafe(long address) {
        return address == NULL ? null : new NkFontGlyph(address, null);
    }

    /**
     * Returns a new {@link NkFontGlyph.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkFontGlyph.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NkFontGlyph.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkFontGlyph.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkFontGlyph.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkFontGlyph.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link NkFontGlyph.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkFontGlyph.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkFontGlyph.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code NkFontGlyph} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkFontGlyph malloc(MemoryStack stack) {
        return new NkFontGlyph(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code NkFontGlyph} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkFontGlyph calloc(MemoryStack stack) {
        return new NkFontGlyph(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link NkFontGlyph.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkFontGlyph.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkFontGlyph.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkFontGlyph.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #codepoint}. */
    public static int ncodepoint(long struct) { return UNSAFE.getInt(null, struct + NkFontGlyph.CODEPOINT); }
    /** Unsafe version of {@link #xadvance}. */
    public static float nxadvance(long struct) { return UNSAFE.getFloat(null, struct + NkFontGlyph.XADVANCE); }
    /** Unsafe version of {@link #x0}. */
    public static float nx0(long struct) { return UNSAFE.getFloat(null, struct + NkFontGlyph.X0); }
    /** Unsafe version of {@link #y0}. */
    public static float ny0(long struct) { return UNSAFE.getFloat(null, struct + NkFontGlyph.Y0); }
    /** Unsafe version of {@link #x1}. */
    public static float nx1(long struct) { return UNSAFE.getFloat(null, struct + NkFontGlyph.X1); }
    /** Unsafe version of {@link #y1}. */
    public static float ny1(long struct) { return UNSAFE.getFloat(null, struct + NkFontGlyph.Y1); }
    /** Unsafe version of {@link #w}. */
    public static float nw(long struct) { return UNSAFE.getFloat(null, struct + NkFontGlyph.W); }
    /** Unsafe version of {@link #h}. */
    public static float nh(long struct) { return UNSAFE.getFloat(null, struct + NkFontGlyph.H); }
    /** Unsafe version of {@link #u0}. */
    public static float nu0(long struct) { return UNSAFE.getFloat(null, struct + NkFontGlyph.U0); }
    /** Unsafe version of {@link #v0}. */
    public static float nv0(long struct) { return UNSAFE.getFloat(null, struct + NkFontGlyph.V0); }
    /** Unsafe version of {@link #u1}. */
    public static float nu1(long struct) { return UNSAFE.getFloat(null, struct + NkFontGlyph.U1); }
    /** Unsafe version of {@link #v1}. */
    public static float nv1(long struct) { return UNSAFE.getFloat(null, struct + NkFontGlyph.V1); }

    /** Unsafe version of {@link #codepoint(int) codepoint}. */
    public static void ncodepoint(long struct, int value) { UNSAFE.putInt(null, struct + NkFontGlyph.CODEPOINT, value); }
    /** Unsafe version of {@link #xadvance(float) xadvance}. */
    public static void nxadvance(long struct, float value) { UNSAFE.putFloat(null, struct + NkFontGlyph.XADVANCE, value); }
    /** Unsafe version of {@link #x0(float) x0}. */
    public static void nx0(long struct, float value) { UNSAFE.putFloat(null, struct + NkFontGlyph.X0, value); }
    /** Unsafe version of {@link #y0(float) y0}. */
    public static void ny0(long struct, float value) { UNSAFE.putFloat(null, struct + NkFontGlyph.Y0, value); }
    /** Unsafe version of {@link #x1(float) x1}. */
    public static void nx1(long struct, float value) { UNSAFE.putFloat(null, struct + NkFontGlyph.X1, value); }
    /** Unsafe version of {@link #y1(float) y1}. */
    public static void ny1(long struct, float value) { UNSAFE.putFloat(null, struct + NkFontGlyph.Y1, value); }
    /** Unsafe version of {@link #w(float) w}. */
    public static void nw(long struct, float value) { UNSAFE.putFloat(null, struct + NkFontGlyph.W, value); }
    /** Unsafe version of {@link #h(float) h}. */
    public static void nh(long struct, float value) { UNSAFE.putFloat(null, struct + NkFontGlyph.H, value); }
    /** Unsafe version of {@link #u0(float) u0}. */
    public static void nu0(long struct, float value) { UNSAFE.putFloat(null, struct + NkFontGlyph.U0, value); }
    /** Unsafe version of {@link #v0(float) v0}. */
    public static void nv0(long struct, float value) { UNSAFE.putFloat(null, struct + NkFontGlyph.V0, value); }
    /** Unsafe version of {@link #u1(float) u1}. */
    public static void nu1(long struct, float value) { UNSAFE.putFloat(null, struct + NkFontGlyph.U1, value); }
    /** Unsafe version of {@link #v1(float) v1}. */
    public static void nv1(long struct, float value) { UNSAFE.putFloat(null, struct + NkFontGlyph.V1, value); }

    // -----------------------------------

    /** An array of {@link NkFontGlyph} structs. */
    public static class Buffer extends StructBuffer<NkFontGlyph, Buffer> implements NativeResource {

        private static final NkFontGlyph ELEMENT_FACTORY = NkFontGlyph.create(-1L);

        /**
         * Creates a new {@code NkFontGlyph.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkFontGlyph#SIZEOF}, and its mark will be undefined.</p>
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
        protected NkFontGlyph getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code codepoint} field. */
        @NativeType("nk_rune")
        public int codepoint() { return NkFontGlyph.ncodepoint(address()); }
        /** @return the value of the {@code xadvance} field. */
        public float xadvance() { return NkFontGlyph.nxadvance(address()); }
        /** @return the value of the {@code x0} field. */
        public float x0() { return NkFontGlyph.nx0(address()); }
        /** @return the value of the {@code y0} field. */
        public float y0() { return NkFontGlyph.ny0(address()); }
        /** @return the value of the {@code x1} field. */
        public float x1() { return NkFontGlyph.nx1(address()); }
        /** @return the value of the {@code y1} field. */
        public float y1() { return NkFontGlyph.ny1(address()); }
        /** @return the value of the {@code w} field. */
        public float w() { return NkFontGlyph.nw(address()); }
        /** @return the value of the {@code h} field. */
        public float h() { return NkFontGlyph.nh(address()); }
        /** @return the value of the {@code u0} field. */
        public float u0() { return NkFontGlyph.nu0(address()); }
        /** @return the value of the {@code v0} field. */
        public float v0() { return NkFontGlyph.nv0(address()); }
        /** @return the value of the {@code u1} field. */
        public float u1() { return NkFontGlyph.nu1(address()); }
        /** @return the value of the {@code v1} field. */
        public float v1() { return NkFontGlyph.nv1(address()); }

        /** Sets the specified value to the {@code codepoint} field. */
        public NkFontGlyph.Buffer codepoint(@NativeType("nk_rune") int value) { NkFontGlyph.ncodepoint(address(), value); return this; }
        /** Sets the specified value to the {@code xadvance} field. */
        public NkFontGlyph.Buffer xadvance(float value) { NkFontGlyph.nxadvance(address(), value); return this; }
        /** Sets the specified value to the {@code x0} field. */
        public NkFontGlyph.Buffer x0(float value) { NkFontGlyph.nx0(address(), value); return this; }
        /** Sets the specified value to the {@code y0} field. */
        public NkFontGlyph.Buffer y0(float value) { NkFontGlyph.ny0(address(), value); return this; }
        /** Sets the specified value to the {@code x1} field. */
        public NkFontGlyph.Buffer x1(float value) { NkFontGlyph.nx1(address(), value); return this; }
        /** Sets the specified value to the {@code y1} field. */
        public NkFontGlyph.Buffer y1(float value) { NkFontGlyph.ny1(address(), value); return this; }
        /** Sets the specified value to the {@code w} field. */
        public NkFontGlyph.Buffer w(float value) { NkFontGlyph.nw(address(), value); return this; }
        /** Sets the specified value to the {@code h} field. */
        public NkFontGlyph.Buffer h(float value) { NkFontGlyph.nh(address(), value); return this; }
        /** Sets the specified value to the {@code u0} field. */
        public NkFontGlyph.Buffer u0(float value) { NkFontGlyph.nu0(address(), value); return this; }
        /** Sets the specified value to the {@code v0} field. */
        public NkFontGlyph.Buffer v0(float value) { NkFontGlyph.nv0(address(), value); return this; }
        /** Sets the specified value to the {@code u1} field. */
        public NkFontGlyph.Buffer u1(float value) { NkFontGlyph.nu1(address(), value); return this; }
        /** Sets the specified value to the {@code v1} field. */
        public NkFontGlyph.Buffer v1(float value) { NkFontGlyph.nv1(address(), value); return this; }

    }

}