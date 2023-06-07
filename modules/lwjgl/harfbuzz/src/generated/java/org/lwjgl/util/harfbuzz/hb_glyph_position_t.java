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
 * The structure that holds the positions of the glyph in both horizontal and vertical directions.
 * 
 * <p>All positions in {@code hb_glyph_position_t} are relative to the current point.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct hb_glyph_position_t {
 *     hb_position_t {@link #x_advance};
 *     hb_position_t {@link #y_advance};
 *     hb_position_t {@link #x_offset};
 *     hb_position_t {@link #y_offset};
 *     {@link hb_var_int_t hb_var_int_t} var;
 * }</code></pre>
 */
public class hb_glyph_position_t extends Struct<hb_glyph_position_t> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        X_ADVANCE,
        Y_ADVANCE,
        X_OFFSET,
        Y_OFFSET,
        VAR;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(hb_var_int_t.SIZEOF, hb_var_int_t.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        X_ADVANCE = layout.offsetof(0);
        Y_ADVANCE = layout.offsetof(1);
        X_OFFSET = layout.offsetof(2);
        Y_OFFSET = layout.offsetof(3);
        VAR = layout.offsetof(4);
    }

    protected hb_glyph_position_t(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected hb_glyph_position_t create(long address, @Nullable ByteBuffer container) {
        return new hb_glyph_position_t(address, container);
    }

    /**
     * Creates a {@code hb_glyph_position_t} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public hb_glyph_position_t(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** how much the line advances after drawing this glyph when setting text in horizontal direction */
    @NativeType("hb_position_t")
    public int x_advance() { return nx_advance(address()); }
    /** how much the line advances after drawing this glyph when setting text in vertical direction */
    @NativeType("hb_position_t")
    public int y_advance() { return ny_advance(address()); }
    /** how much the glyph moves on the X-axis before drawing it, this should not affect how much the line advances */
    @NativeType("hb_position_t")
    public int x_offset() { return nx_offset(address()); }
    /** how much the glyph moves on the Y-axis before drawing it, this should not affect how much the line advances. */
    @NativeType("hb_position_t")
    public int y_offset() { return ny_offset(address()); }

    /** Sets the specified value to the {@link #x_advance} field. */
    public hb_glyph_position_t x_advance(@NativeType("hb_position_t") int value) { nx_advance(address(), value); return this; }
    /** Sets the specified value to the {@link #y_advance} field. */
    public hb_glyph_position_t y_advance(@NativeType("hb_position_t") int value) { ny_advance(address(), value); return this; }
    /** Sets the specified value to the {@link #x_offset} field. */
    public hb_glyph_position_t x_offset(@NativeType("hb_position_t") int value) { nx_offset(address(), value); return this; }
    /** Sets the specified value to the {@link #y_offset} field. */
    public hb_glyph_position_t y_offset(@NativeType("hb_position_t") int value) { ny_offset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public hb_glyph_position_t set(
        int x_advance,
        int y_advance,
        int x_offset,
        int y_offset
    ) {
        x_advance(x_advance);
        y_advance(y_advance);
        x_offset(x_offset);
        y_offset(y_offset);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public hb_glyph_position_t set(hb_glyph_position_t src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code hb_glyph_position_t} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static hb_glyph_position_t malloc() {
        return new hb_glyph_position_t(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code hb_glyph_position_t} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static hb_glyph_position_t calloc() {
        return new hb_glyph_position_t(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code hb_glyph_position_t} instance allocated with {@link BufferUtils}. */
    public static hb_glyph_position_t create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new hb_glyph_position_t(memAddress(container), container);
    }

    /** Returns a new {@code hb_glyph_position_t} instance for the specified memory address. */
    public static hb_glyph_position_t create(long address) {
        return new hb_glyph_position_t(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hb_glyph_position_t createSafe(long address) {
        return address == NULL ? null : new hb_glyph_position_t(address, null);
    }

    /**
     * Returns a new {@link hb_glyph_position_t.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hb_glyph_position_t.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link hb_glyph_position_t.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hb_glyph_position_t.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hb_glyph_position_t.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static hb_glyph_position_t.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link hb_glyph_position_t.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static hb_glyph_position_t.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hb_glyph_position_t.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code hb_glyph_position_t} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static hb_glyph_position_t malloc(MemoryStack stack) {
        return new hb_glyph_position_t(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code hb_glyph_position_t} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static hb_glyph_position_t calloc(MemoryStack stack) {
        return new hb_glyph_position_t(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link hb_glyph_position_t.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hb_glyph_position_t.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hb_glyph_position_t.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hb_glyph_position_t.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x_advance}. */
    public static int nx_advance(long struct) { return UNSAFE.getInt(null, struct + hb_glyph_position_t.X_ADVANCE); }
    /** Unsafe version of {@link #y_advance}. */
    public static int ny_advance(long struct) { return UNSAFE.getInt(null, struct + hb_glyph_position_t.Y_ADVANCE); }
    /** Unsafe version of {@link #x_offset}. */
    public static int nx_offset(long struct) { return UNSAFE.getInt(null, struct + hb_glyph_position_t.X_OFFSET); }
    /** Unsafe version of {@link #y_offset}. */
    public static int ny_offset(long struct) { return UNSAFE.getInt(null, struct + hb_glyph_position_t.Y_OFFSET); }
    public static hb_var_int_t nvar(long struct) { return hb_var_int_t.create(struct + hb_glyph_position_t.VAR); }

    /** Unsafe version of {@link #x_advance(int) x_advance}. */
    public static void nx_advance(long struct, int value) { UNSAFE.putInt(null, struct + hb_glyph_position_t.X_ADVANCE, value); }
    /** Unsafe version of {@link #y_advance(int) y_advance}. */
    public static void ny_advance(long struct, int value) { UNSAFE.putInt(null, struct + hb_glyph_position_t.Y_ADVANCE, value); }
    /** Unsafe version of {@link #x_offset(int) x_offset}. */
    public static void nx_offset(long struct, int value) { UNSAFE.putInt(null, struct + hb_glyph_position_t.X_OFFSET, value); }
    /** Unsafe version of {@link #y_offset(int) y_offset}. */
    public static void ny_offset(long struct, int value) { UNSAFE.putInt(null, struct + hb_glyph_position_t.Y_OFFSET, value); }
    public static void nvar(long struct, hb_var_int_t value) { memCopy(value.address(), struct + hb_glyph_position_t.VAR, hb_var_int_t.SIZEOF); }

    // -----------------------------------

    /** An array of {@link hb_glyph_position_t} structs. */
    public static class Buffer extends StructBuffer<hb_glyph_position_t, Buffer> implements NativeResource {

        private static final hb_glyph_position_t ELEMENT_FACTORY = hb_glyph_position_t.create(-1L);

        /**
         * Creates a new {@code hb_glyph_position_t.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link hb_glyph_position_t#SIZEOF}, and its mark will be undefined.</p>
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
        protected hb_glyph_position_t getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link hb_glyph_position_t#x_advance} field. */
        @NativeType("hb_position_t")
        public int x_advance() { return hb_glyph_position_t.nx_advance(address()); }
        /** @return the value of the {@link hb_glyph_position_t#y_advance} field. */
        @NativeType("hb_position_t")
        public int y_advance() { return hb_glyph_position_t.ny_advance(address()); }
        /** @return the value of the {@link hb_glyph_position_t#x_offset} field. */
        @NativeType("hb_position_t")
        public int x_offset() { return hb_glyph_position_t.nx_offset(address()); }
        /** @return the value of the {@link hb_glyph_position_t#y_offset} field. */
        @NativeType("hb_position_t")
        public int y_offset() { return hb_glyph_position_t.ny_offset(address()); }

        /** Sets the specified value to the {@link hb_glyph_position_t#x_advance} field. */
        public hb_glyph_position_t.Buffer x_advance(@NativeType("hb_position_t") int value) { hb_glyph_position_t.nx_advance(address(), value); return this; }
        /** Sets the specified value to the {@link hb_glyph_position_t#y_advance} field. */
        public hb_glyph_position_t.Buffer y_advance(@NativeType("hb_position_t") int value) { hb_glyph_position_t.ny_advance(address(), value); return this; }
        /** Sets the specified value to the {@link hb_glyph_position_t#x_offset} field. */
        public hb_glyph_position_t.Buffer x_offset(@NativeType("hb_position_t") int value) { hb_glyph_position_t.nx_offset(address(), value); return this; }
        /** Sets the specified value to the {@link hb_glyph_position_t#y_offset} field. */
        public hb_glyph_position_t.Buffer y_offset(@NativeType("hb_position_t") int value) { hb_glyph_position_t.ny_offset(address(), value); return this; }

    }

}