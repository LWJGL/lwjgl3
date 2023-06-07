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
 * Glyph extent values, measured in font units.
 * 
 * <p>Note that {@code height} is negative, in coordinate systems that grow up.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct hb_glyph_extents_t {
 *     hb_position_t {@link #x_bearing};
 *     hb_position_t {@link #y_bearing};
 *     hb_position_t {@link #width};
 *     hb_position_t {@link #height};
 * }</code></pre>
 */
public class hb_glyph_extents_t extends Struct<hb_glyph_extents_t> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        X_BEARING,
        Y_BEARING,
        WIDTH,
        HEIGHT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        X_BEARING = layout.offsetof(0);
        Y_BEARING = layout.offsetof(1);
        WIDTH = layout.offsetof(2);
        HEIGHT = layout.offsetof(3);
    }

    protected hb_glyph_extents_t(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected hb_glyph_extents_t create(long address, @Nullable ByteBuffer container) {
        return new hb_glyph_extents_t(address, container);
    }

    /**
     * Creates a {@code hb_glyph_extents_t} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public hb_glyph_extents_t(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** distance from the x-origin to the left extremum of the glyph */
    @NativeType("hb_position_t")
    public int x_bearing() { return nx_bearing(address()); }
    /** distance from the top extremum of the glyph to the y-origin */
    @NativeType("hb_position_t")
    public int y_bearing() { return ny_bearing(address()); }
    /** distance from the left extremum of the glyph to the right extremum */
    @NativeType("hb_position_t")
    public int width() { return nwidth(address()); }
    /** distance from the top extremum of the glyph to the bottom extremum */
    @NativeType("hb_position_t")
    public int height() { return nheight(address()); }

    /** Sets the specified value to the {@link #x_bearing} field. */
    public hb_glyph_extents_t x_bearing(@NativeType("hb_position_t") int value) { nx_bearing(address(), value); return this; }
    /** Sets the specified value to the {@link #y_bearing} field. */
    public hb_glyph_extents_t y_bearing(@NativeType("hb_position_t") int value) { ny_bearing(address(), value); return this; }
    /** Sets the specified value to the {@link #width} field. */
    public hb_glyph_extents_t width(@NativeType("hb_position_t") int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@link #height} field. */
    public hb_glyph_extents_t height(@NativeType("hb_position_t") int value) { nheight(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public hb_glyph_extents_t set(
        int x_bearing,
        int y_bearing,
        int width,
        int height
    ) {
        x_bearing(x_bearing);
        y_bearing(y_bearing);
        width(width);
        height(height);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public hb_glyph_extents_t set(hb_glyph_extents_t src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code hb_glyph_extents_t} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static hb_glyph_extents_t malloc() {
        return new hb_glyph_extents_t(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code hb_glyph_extents_t} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static hb_glyph_extents_t calloc() {
        return new hb_glyph_extents_t(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code hb_glyph_extents_t} instance allocated with {@link BufferUtils}. */
    public static hb_glyph_extents_t create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new hb_glyph_extents_t(memAddress(container), container);
    }

    /** Returns a new {@code hb_glyph_extents_t} instance for the specified memory address. */
    public static hb_glyph_extents_t create(long address) {
        return new hb_glyph_extents_t(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hb_glyph_extents_t createSafe(long address) {
        return address == NULL ? null : new hb_glyph_extents_t(address, null);
    }

    /**
     * Returns a new {@link hb_glyph_extents_t.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hb_glyph_extents_t.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link hb_glyph_extents_t.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hb_glyph_extents_t.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hb_glyph_extents_t.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static hb_glyph_extents_t.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link hb_glyph_extents_t.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static hb_glyph_extents_t.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hb_glyph_extents_t.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code hb_glyph_extents_t} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static hb_glyph_extents_t malloc(MemoryStack stack) {
        return new hb_glyph_extents_t(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code hb_glyph_extents_t} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static hb_glyph_extents_t calloc(MemoryStack stack) {
        return new hb_glyph_extents_t(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link hb_glyph_extents_t.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hb_glyph_extents_t.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hb_glyph_extents_t.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hb_glyph_extents_t.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x_bearing}. */
    public static int nx_bearing(long struct) { return UNSAFE.getInt(null, struct + hb_glyph_extents_t.X_BEARING); }
    /** Unsafe version of {@link #y_bearing}. */
    public static int ny_bearing(long struct) { return UNSAFE.getInt(null, struct + hb_glyph_extents_t.Y_BEARING); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return UNSAFE.getInt(null, struct + hb_glyph_extents_t.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return UNSAFE.getInt(null, struct + hb_glyph_extents_t.HEIGHT); }

    /** Unsafe version of {@link #x_bearing(int) x_bearing}. */
    public static void nx_bearing(long struct, int value) { UNSAFE.putInt(null, struct + hb_glyph_extents_t.X_BEARING, value); }
    /** Unsafe version of {@link #y_bearing(int) y_bearing}. */
    public static void ny_bearing(long struct, int value) { UNSAFE.putInt(null, struct + hb_glyph_extents_t.Y_BEARING, value); }
    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { UNSAFE.putInt(null, struct + hb_glyph_extents_t.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { UNSAFE.putInt(null, struct + hb_glyph_extents_t.HEIGHT, value); }

    // -----------------------------------

    /** An array of {@link hb_glyph_extents_t} structs. */
    public static class Buffer extends StructBuffer<hb_glyph_extents_t, Buffer> implements NativeResource {

        private static final hb_glyph_extents_t ELEMENT_FACTORY = hb_glyph_extents_t.create(-1L);

        /**
         * Creates a new {@code hb_glyph_extents_t.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link hb_glyph_extents_t#SIZEOF}, and its mark will be undefined.</p>
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
        protected hb_glyph_extents_t getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link hb_glyph_extents_t#x_bearing} field. */
        @NativeType("hb_position_t")
        public int x_bearing() { return hb_glyph_extents_t.nx_bearing(address()); }
        /** @return the value of the {@link hb_glyph_extents_t#y_bearing} field. */
        @NativeType("hb_position_t")
        public int y_bearing() { return hb_glyph_extents_t.ny_bearing(address()); }
        /** @return the value of the {@link hb_glyph_extents_t#width} field. */
        @NativeType("hb_position_t")
        public int width() { return hb_glyph_extents_t.nwidth(address()); }
        /** @return the value of the {@link hb_glyph_extents_t#height} field. */
        @NativeType("hb_position_t")
        public int height() { return hb_glyph_extents_t.nheight(address()); }

        /** Sets the specified value to the {@link hb_glyph_extents_t#x_bearing} field. */
        public hb_glyph_extents_t.Buffer x_bearing(@NativeType("hb_position_t") int value) { hb_glyph_extents_t.nx_bearing(address(), value); return this; }
        /** Sets the specified value to the {@link hb_glyph_extents_t#y_bearing} field. */
        public hb_glyph_extents_t.Buffer y_bearing(@NativeType("hb_position_t") int value) { hb_glyph_extents_t.ny_bearing(address(), value); return this; }
        /** Sets the specified value to the {@link hb_glyph_extents_t#width} field. */
        public hb_glyph_extents_t.Buffer width(@NativeType("hb_position_t") int value) { hb_glyph_extents_t.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@link hb_glyph_extents_t#height} field. */
        public hb_glyph_extents_t.Buffer height(@NativeType("hb_position_t") int value) { hb_glyph_extents_t.nheight(address(), value); return this; }

    }

}