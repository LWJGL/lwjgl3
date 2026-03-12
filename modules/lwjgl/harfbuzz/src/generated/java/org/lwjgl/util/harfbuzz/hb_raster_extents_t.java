/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.harfbuzz;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct hb_raster_extents_t {
 *     int x_origin;
 *     int y_origin;
 *     unsigned int width;
 *     unsigned int height;
 *     unsigned int stride;
 * }}</pre>
 */
public class hb_raster_extents_t extends Struct<hb_raster_extents_t> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        X_ORIGIN,
        Y_ORIGIN,
        WIDTH,
        HEIGHT,
        STRIDE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        X_ORIGIN = layout.offsetof(0);
        Y_ORIGIN = layout.offsetof(1);
        WIDTH = layout.offsetof(2);
        HEIGHT = layout.offsetof(3);
        STRIDE = layout.offsetof(4);
    }

    protected hb_raster_extents_t(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected hb_raster_extents_t create(long address, @Nullable ByteBuffer container) {
        return new hb_raster_extents_t(address, container);
    }

    /**
     * Creates a {@code hb_raster_extents_t} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public hb_raster_extents_t(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code x_origin} field. */
    public int x_origin() { return nx_origin(address()); }
    /** @return the value of the {@code y_origin} field. */
    public int y_origin() { return ny_origin(address()); }
    /** @return the value of the {@code width} field. */
    @NativeType("unsigned int")
    public int width() { return nwidth(address()); }
    /** @return the value of the {@code height} field. */
    @NativeType("unsigned int")
    public int height() { return nheight(address()); }
    /** @return the value of the {@code stride} field. */
    @NativeType("unsigned int")
    public int stride() { return nstride(address()); }

    /** Sets the specified value to the {@code x_origin} field. */
    public hb_raster_extents_t x_origin(int value) { nx_origin(address(), value); return this; }
    /** Sets the specified value to the {@code y_origin} field. */
    public hb_raster_extents_t y_origin(int value) { ny_origin(address(), value); return this; }
    /** Sets the specified value to the {@code width} field. */
    public hb_raster_extents_t width(@NativeType("unsigned int") int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    public hb_raster_extents_t height(@NativeType("unsigned int") int value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@code stride} field. */
    public hb_raster_extents_t stride(@NativeType("unsigned int") int value) { nstride(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public hb_raster_extents_t set(
        int x_origin,
        int y_origin,
        int width,
        int height,
        int stride
    ) {
        x_origin(x_origin);
        y_origin(y_origin);
        width(width);
        height(height);
        stride(stride);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public hb_raster_extents_t set(hb_raster_extents_t src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code hb_raster_extents_t} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static hb_raster_extents_t malloc() {
        return new hb_raster_extents_t(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code hb_raster_extents_t} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static hb_raster_extents_t calloc() {
        return new hb_raster_extents_t(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code hb_raster_extents_t} instance allocated with {@link BufferUtils}. */
    public static hb_raster_extents_t create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new hb_raster_extents_t(memAddress(container), container);
    }

    /** Returns a new {@code hb_raster_extents_t} instance for the specified memory address. */
    public static hb_raster_extents_t create(long address) {
        return new hb_raster_extents_t(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable hb_raster_extents_t createSafe(long address) {
        return address == NULL ? null : new hb_raster_extents_t(address, null);
    }

    /**
     * Returns a new {@link hb_raster_extents_t.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hb_raster_extents_t.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link hb_raster_extents_t.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hb_raster_extents_t.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hb_raster_extents_t.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static hb_raster_extents_t.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link hb_raster_extents_t.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static hb_raster_extents_t.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static hb_raster_extents_t.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code hb_raster_extents_t} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static hb_raster_extents_t malloc(MemoryStack stack) {
        return new hb_raster_extents_t(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code hb_raster_extents_t} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static hb_raster_extents_t calloc(MemoryStack stack) {
        return new hb_raster_extents_t(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link hb_raster_extents_t.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hb_raster_extents_t.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hb_raster_extents_t.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hb_raster_extents_t.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x_origin}. */
    public static int nx_origin(long struct) { return memGetInt(struct + hb_raster_extents_t.X_ORIGIN); }
    /** Unsafe version of {@link #y_origin}. */
    public static int ny_origin(long struct) { return memGetInt(struct + hb_raster_extents_t.Y_ORIGIN); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return memGetInt(struct + hb_raster_extents_t.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return memGetInt(struct + hb_raster_extents_t.HEIGHT); }
    /** Unsafe version of {@link #stride}. */
    public static int nstride(long struct) { return memGetInt(struct + hb_raster_extents_t.STRIDE); }

    /** Unsafe version of {@link #x_origin(int) x_origin}. */
    public static void nx_origin(long struct, int value) { memPutInt(struct + hb_raster_extents_t.X_ORIGIN, value); }
    /** Unsafe version of {@link #y_origin(int) y_origin}. */
    public static void ny_origin(long struct, int value) { memPutInt(struct + hb_raster_extents_t.Y_ORIGIN, value); }
    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { memPutInt(struct + hb_raster_extents_t.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { memPutInt(struct + hb_raster_extents_t.HEIGHT, value); }
    /** Unsafe version of {@link #stride(int) stride}. */
    public static void nstride(long struct, int value) { memPutInt(struct + hb_raster_extents_t.STRIDE, value); }

    // -----------------------------------

    /** An array of {@link hb_raster_extents_t} structs. */
    public static class Buffer extends StructBuffer<hb_raster_extents_t, Buffer> implements NativeResource {

        private static final hb_raster_extents_t ELEMENT_FACTORY = hb_raster_extents_t.create(-1L);

        /**
         * Creates a new {@code hb_raster_extents_t.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link hb_raster_extents_t#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected hb_raster_extents_t getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code x_origin} field. */
        public int x_origin() { return hb_raster_extents_t.nx_origin(address()); }
        /** @return the value of the {@code y_origin} field. */
        public int y_origin() { return hb_raster_extents_t.ny_origin(address()); }
        /** @return the value of the {@code width} field. */
        @NativeType("unsigned int")
        public int width() { return hb_raster_extents_t.nwidth(address()); }
        /** @return the value of the {@code height} field. */
        @NativeType("unsigned int")
        public int height() { return hb_raster_extents_t.nheight(address()); }
        /** @return the value of the {@code stride} field. */
        @NativeType("unsigned int")
        public int stride() { return hb_raster_extents_t.nstride(address()); }

        /** Sets the specified value to the {@code x_origin} field. */
        public hb_raster_extents_t.Buffer x_origin(int value) { hb_raster_extents_t.nx_origin(address(), value); return this; }
        /** Sets the specified value to the {@code y_origin} field. */
        public hb_raster_extents_t.Buffer y_origin(int value) { hb_raster_extents_t.ny_origin(address(), value); return this; }
        /** Sets the specified value to the {@code width} field. */
        public hb_raster_extents_t.Buffer width(@NativeType("unsigned int") int value) { hb_raster_extents_t.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code height} field. */
        public hb_raster_extents_t.Buffer height(@NativeType("unsigned int") int value) { hb_raster_extents_t.nheight(address(), value); return this; }
        /** Sets the specified value to the {@code stride} field. */
        public hb_raster_extents_t.Buffer stride(@NativeType("unsigned int") int value) { hb_raster_extents_t.nstride(address(), value); return this; }

    }

}