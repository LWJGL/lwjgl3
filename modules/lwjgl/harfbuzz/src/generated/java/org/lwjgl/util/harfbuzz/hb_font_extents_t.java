/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.harfbuzz;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Font-wide extent values, measured in font units.
 * 
 * <p>Note that typically {@code ascender} is positive and {@code descender} negative, in coordinate systems that grow up.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct hb_font_extents_t {
 *     hb_position_t {@link #ascender};
 *     hb_position_t {@link #descender};
 *     hb_position_t {@link #line_gap};
 *     hb_position_t reserved9;
 *     hb_position_t reserved8;
 *     hb_position_t reserved7;
 *     hb_position_t reserved6;
 *     hb_position_t reserved5;
 *     hb_position_t reserved4;
 *     hb_position_t reserved3;
 *     hb_position_t reserved2;
 *     hb_position_t reserved1;
 * }</code></pre>
 */
public class hb_font_extents_t extends Struct<hb_font_extents_t> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ASCENDER,
        DESCENDER,
        LINE_GAP,
        RESERVED9,
        RESERVED8,
        RESERVED7,
        RESERVED6,
        RESERVED5,
        RESERVED4,
        RESERVED3,
        RESERVED2,
        RESERVED1;

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

        ASCENDER = layout.offsetof(0);
        DESCENDER = layout.offsetof(1);
        LINE_GAP = layout.offsetof(2);
        RESERVED9 = layout.offsetof(3);
        RESERVED8 = layout.offsetof(4);
        RESERVED7 = layout.offsetof(5);
        RESERVED6 = layout.offsetof(6);
        RESERVED5 = layout.offsetof(7);
        RESERVED4 = layout.offsetof(8);
        RESERVED3 = layout.offsetof(9);
        RESERVED2 = layout.offsetof(10);
        RESERVED1 = layout.offsetof(11);
    }

    protected hb_font_extents_t(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected hb_font_extents_t create(long address, @Nullable ByteBuffer container) {
        return new hb_font_extents_t(address, container);
    }

    /**
     * Creates a {@code hb_font_extents_t} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public hb_font_extents_t(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the height of typographic ascenders */
    @NativeType("hb_position_t")
    public int ascender() { return nascender(address()); }
    /** the depth of typographic descenders */
    @NativeType("hb_position_t")
    public int descender() { return ndescender(address()); }
    /** the suggested line-spacing gap */
    @NativeType("hb_position_t")
    public int line_gap() { return nline_gap(address()); }

    /** Sets the specified value to the {@link #ascender} field. */
    public hb_font_extents_t ascender(@NativeType("hb_position_t") int value) { nascender(address(), value); return this; }
    /** Sets the specified value to the {@link #descender} field. */
    public hb_font_extents_t descender(@NativeType("hb_position_t") int value) { ndescender(address(), value); return this; }
    /** Sets the specified value to the {@link #line_gap} field. */
    public hb_font_extents_t line_gap(@NativeType("hb_position_t") int value) { nline_gap(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public hb_font_extents_t set(
        int ascender,
        int descender,
        int line_gap
    ) {
        ascender(ascender);
        descender(descender);
        line_gap(line_gap);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public hb_font_extents_t set(hb_font_extents_t src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code hb_font_extents_t} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static hb_font_extents_t malloc() {
        return new hb_font_extents_t(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code hb_font_extents_t} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static hb_font_extents_t calloc() {
        return new hb_font_extents_t(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code hb_font_extents_t} instance allocated with {@link BufferUtils}. */
    public static hb_font_extents_t create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new hb_font_extents_t(memAddress(container), container);
    }

    /** Returns a new {@code hb_font_extents_t} instance for the specified memory address. */
    public static hb_font_extents_t create(long address) {
        return new hb_font_extents_t(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hb_font_extents_t createSafe(long address) {
        return address == NULL ? null : new hb_font_extents_t(address, null);
    }

    /**
     * Returns a new {@link hb_font_extents_t.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hb_font_extents_t.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link hb_font_extents_t.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hb_font_extents_t.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hb_font_extents_t.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static hb_font_extents_t.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link hb_font_extents_t.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static hb_font_extents_t.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hb_font_extents_t.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code hb_font_extents_t} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static hb_font_extents_t malloc(MemoryStack stack) {
        return new hb_font_extents_t(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code hb_font_extents_t} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static hb_font_extents_t calloc(MemoryStack stack) {
        return new hb_font_extents_t(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link hb_font_extents_t.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hb_font_extents_t.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hb_font_extents_t.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hb_font_extents_t.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #ascender}. */
    public static int nascender(long struct) { return UNSAFE.getInt(null, struct + hb_font_extents_t.ASCENDER); }
    /** Unsafe version of {@link #descender}. */
    public static int ndescender(long struct) { return UNSAFE.getInt(null, struct + hb_font_extents_t.DESCENDER); }
    /** Unsafe version of {@link #line_gap}. */
    public static int nline_gap(long struct) { return UNSAFE.getInt(null, struct + hb_font_extents_t.LINE_GAP); }
    public static int nreserved9(long struct) { return UNSAFE.getInt(null, struct + hb_font_extents_t.RESERVED9); }
    public static int nreserved8(long struct) { return UNSAFE.getInt(null, struct + hb_font_extents_t.RESERVED8); }
    public static int nreserved7(long struct) { return UNSAFE.getInt(null, struct + hb_font_extents_t.RESERVED7); }
    public static int nreserved6(long struct) { return UNSAFE.getInt(null, struct + hb_font_extents_t.RESERVED6); }
    public static int nreserved5(long struct) { return UNSAFE.getInt(null, struct + hb_font_extents_t.RESERVED5); }
    public static int nreserved4(long struct) { return UNSAFE.getInt(null, struct + hb_font_extents_t.RESERVED4); }
    public static int nreserved3(long struct) { return UNSAFE.getInt(null, struct + hb_font_extents_t.RESERVED3); }
    public static int nreserved2(long struct) { return UNSAFE.getInt(null, struct + hb_font_extents_t.RESERVED2); }
    public static int nreserved1(long struct) { return UNSAFE.getInt(null, struct + hb_font_extents_t.RESERVED1); }

    /** Unsafe version of {@link #ascender(int) ascender}. */
    public static void nascender(long struct, int value) { UNSAFE.putInt(null, struct + hb_font_extents_t.ASCENDER, value); }
    /** Unsafe version of {@link #descender(int) descender}. */
    public static void ndescender(long struct, int value) { UNSAFE.putInt(null, struct + hb_font_extents_t.DESCENDER, value); }
    /** Unsafe version of {@link #line_gap(int) line_gap}. */
    public static void nline_gap(long struct, int value) { UNSAFE.putInt(null, struct + hb_font_extents_t.LINE_GAP, value); }
    public static void nreserved9(long struct, int value) { UNSAFE.putInt(null, struct + hb_font_extents_t.RESERVED9, value); }
    public static void nreserved8(long struct, int value) { UNSAFE.putInt(null, struct + hb_font_extents_t.RESERVED8, value); }
    public static void nreserved7(long struct, int value) { UNSAFE.putInt(null, struct + hb_font_extents_t.RESERVED7, value); }
    public static void nreserved6(long struct, int value) { UNSAFE.putInt(null, struct + hb_font_extents_t.RESERVED6, value); }
    public static void nreserved5(long struct, int value) { UNSAFE.putInt(null, struct + hb_font_extents_t.RESERVED5, value); }
    public static void nreserved4(long struct, int value) { UNSAFE.putInt(null, struct + hb_font_extents_t.RESERVED4, value); }
    public static void nreserved3(long struct, int value) { UNSAFE.putInt(null, struct + hb_font_extents_t.RESERVED3, value); }
    public static void nreserved2(long struct, int value) { UNSAFE.putInt(null, struct + hb_font_extents_t.RESERVED2, value); }
    public static void nreserved1(long struct, int value) { UNSAFE.putInt(null, struct + hb_font_extents_t.RESERVED1, value); }

    // -----------------------------------

    /** An array of {@link hb_font_extents_t} structs. */
    public static class Buffer extends StructBuffer<hb_font_extents_t, Buffer> implements NativeResource {

        private static final hb_font_extents_t ELEMENT_FACTORY = hb_font_extents_t.create(-1L);

        /**
         * Creates a new {@code hb_font_extents_t.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link hb_font_extents_t#SIZEOF}, and its mark will be undefined.</p>
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
        protected hb_font_extents_t getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link hb_font_extents_t#ascender} field. */
        @NativeType("hb_position_t")
        public int ascender() { return hb_font_extents_t.nascender(address()); }
        /** @return the value of the {@link hb_font_extents_t#descender} field. */
        @NativeType("hb_position_t")
        public int descender() { return hb_font_extents_t.ndescender(address()); }
        /** @return the value of the {@link hb_font_extents_t#line_gap} field. */
        @NativeType("hb_position_t")
        public int line_gap() { return hb_font_extents_t.nline_gap(address()); }

        /** Sets the specified value to the {@link hb_font_extents_t#ascender} field. */
        public hb_font_extents_t.Buffer ascender(@NativeType("hb_position_t") int value) { hb_font_extents_t.nascender(address(), value); return this; }
        /** Sets the specified value to the {@link hb_font_extents_t#descender} field. */
        public hb_font_extents_t.Buffer descender(@NativeType("hb_position_t") int value) { hb_font_extents_t.ndescender(address(), value); return this; }
        /** Sets the specified value to the {@link hb_font_extents_t#line_gap} field. */
        public hb_font_extents_t.Buffer line_gap(@NativeType("hb_position_t") int value) { hb_font_extents_t.nline_gap(address(), value); return this; }

    }

}