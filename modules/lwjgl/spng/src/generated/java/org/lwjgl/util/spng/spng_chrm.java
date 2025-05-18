/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.spng;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct spng_chrm {
 *     double white_point_x;
 *     double white_point_y;
 *     double red_x;
 *     double red_y;
 *     double green_x;
 *     double green_y;
 *     double blue_x;
 *     double blue_y;
 * }}</pre>
 */
@NativeType("struct spng_chrm")
public class spng_chrm extends Struct<spng_chrm> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        WHITE_POINT_X,
        WHITE_POINT_Y,
        RED_X,
        RED_Y,
        GREEN_X,
        GREEN_Y,
        BLUE_X,
        BLUE_Y;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        WHITE_POINT_X = layout.offsetof(0);
        WHITE_POINT_Y = layout.offsetof(1);
        RED_X = layout.offsetof(2);
        RED_Y = layout.offsetof(3);
        GREEN_X = layout.offsetof(4);
        GREEN_Y = layout.offsetof(5);
        BLUE_X = layout.offsetof(6);
        BLUE_Y = layout.offsetof(7);
    }

    protected spng_chrm(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected spng_chrm create(long address, @Nullable ByteBuffer container) {
        return new spng_chrm(address, container);
    }

    /**
     * Creates a {@code spng_chrm} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public spng_chrm(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code white_point_x} field. */
    public double white_point_x() { return nwhite_point_x(address()); }
    /** @return the value of the {@code white_point_y} field. */
    public double white_point_y() { return nwhite_point_y(address()); }
    /** @return the value of the {@code red_x} field. */
    public double red_x() { return nred_x(address()); }
    /** @return the value of the {@code red_y} field. */
    public double red_y() { return nred_y(address()); }
    /** @return the value of the {@code green_x} field. */
    public double green_x() { return ngreen_x(address()); }
    /** @return the value of the {@code green_y} field. */
    public double green_y() { return ngreen_y(address()); }
    /** @return the value of the {@code blue_x} field. */
    public double blue_x() { return nblue_x(address()); }
    /** @return the value of the {@code blue_y} field. */
    public double blue_y() { return nblue_y(address()); }

    /** Sets the specified value to the {@code white_point_x} field. */
    public spng_chrm white_point_x(double value) { nwhite_point_x(address(), value); return this; }
    /** Sets the specified value to the {@code white_point_y} field. */
    public spng_chrm white_point_y(double value) { nwhite_point_y(address(), value); return this; }
    /** Sets the specified value to the {@code red_x} field. */
    public spng_chrm red_x(double value) { nred_x(address(), value); return this; }
    /** Sets the specified value to the {@code red_y} field. */
    public spng_chrm red_y(double value) { nred_y(address(), value); return this; }
    /** Sets the specified value to the {@code green_x} field. */
    public spng_chrm green_x(double value) { ngreen_x(address(), value); return this; }
    /** Sets the specified value to the {@code green_y} field. */
    public spng_chrm green_y(double value) { ngreen_y(address(), value); return this; }
    /** Sets the specified value to the {@code blue_x} field. */
    public spng_chrm blue_x(double value) { nblue_x(address(), value); return this; }
    /** Sets the specified value to the {@code blue_y} field. */
    public spng_chrm blue_y(double value) { nblue_y(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public spng_chrm set(
        double white_point_x,
        double white_point_y,
        double red_x,
        double red_y,
        double green_x,
        double green_y,
        double blue_x,
        double blue_y
    ) {
        white_point_x(white_point_x);
        white_point_y(white_point_y);
        red_x(red_x);
        red_y(red_y);
        green_x(green_x);
        green_y(green_y);
        blue_x(blue_x);
        blue_y(blue_y);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public spng_chrm set(spng_chrm src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code spng_chrm} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static spng_chrm malloc() {
        return new spng_chrm(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code spng_chrm} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static spng_chrm calloc() {
        return new spng_chrm(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code spng_chrm} instance allocated with {@link BufferUtils}. */
    public static spng_chrm create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new spng_chrm(memAddress(container), container);
    }

    /** Returns a new {@code spng_chrm} instance for the specified memory address. */
    public static spng_chrm create(long address) {
        return new spng_chrm(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable spng_chrm createSafe(long address) {
        return address == NULL ? null : new spng_chrm(address, null);
    }

    /**
     * Returns a new {@link spng_chrm.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static spng_chrm.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link spng_chrm.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static spng_chrm.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link spng_chrm.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static spng_chrm.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link spng_chrm.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static spng_chrm.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static spng_chrm.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code spng_chrm} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static spng_chrm malloc(MemoryStack stack) {
        return new spng_chrm(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code spng_chrm} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static spng_chrm calloc(MemoryStack stack) {
        return new spng_chrm(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link spng_chrm.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static spng_chrm.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link spng_chrm.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static spng_chrm.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #white_point_x}. */
    public static double nwhite_point_x(long struct) { return memGetDouble(struct + spng_chrm.WHITE_POINT_X); }
    /** Unsafe version of {@link #white_point_y}. */
    public static double nwhite_point_y(long struct) { return memGetDouble(struct + spng_chrm.WHITE_POINT_Y); }
    /** Unsafe version of {@link #red_x}. */
    public static double nred_x(long struct) { return memGetDouble(struct + spng_chrm.RED_X); }
    /** Unsafe version of {@link #red_y}. */
    public static double nred_y(long struct) { return memGetDouble(struct + spng_chrm.RED_Y); }
    /** Unsafe version of {@link #green_x}. */
    public static double ngreen_x(long struct) { return memGetDouble(struct + spng_chrm.GREEN_X); }
    /** Unsafe version of {@link #green_y}. */
    public static double ngreen_y(long struct) { return memGetDouble(struct + spng_chrm.GREEN_Y); }
    /** Unsafe version of {@link #blue_x}. */
    public static double nblue_x(long struct) { return memGetDouble(struct + spng_chrm.BLUE_X); }
    /** Unsafe version of {@link #blue_y}. */
    public static double nblue_y(long struct) { return memGetDouble(struct + spng_chrm.BLUE_Y); }

    /** Unsafe version of {@link #white_point_x(double) white_point_x}. */
    public static void nwhite_point_x(long struct, double value) { memPutDouble(struct + spng_chrm.WHITE_POINT_X, value); }
    /** Unsafe version of {@link #white_point_y(double) white_point_y}. */
    public static void nwhite_point_y(long struct, double value) { memPutDouble(struct + spng_chrm.WHITE_POINT_Y, value); }
    /** Unsafe version of {@link #red_x(double) red_x}. */
    public static void nred_x(long struct, double value) { memPutDouble(struct + spng_chrm.RED_X, value); }
    /** Unsafe version of {@link #red_y(double) red_y}. */
    public static void nred_y(long struct, double value) { memPutDouble(struct + spng_chrm.RED_Y, value); }
    /** Unsafe version of {@link #green_x(double) green_x}. */
    public static void ngreen_x(long struct, double value) { memPutDouble(struct + spng_chrm.GREEN_X, value); }
    /** Unsafe version of {@link #green_y(double) green_y}. */
    public static void ngreen_y(long struct, double value) { memPutDouble(struct + spng_chrm.GREEN_Y, value); }
    /** Unsafe version of {@link #blue_x(double) blue_x}. */
    public static void nblue_x(long struct, double value) { memPutDouble(struct + spng_chrm.BLUE_X, value); }
    /** Unsafe version of {@link #blue_y(double) blue_y}. */
    public static void nblue_y(long struct, double value) { memPutDouble(struct + spng_chrm.BLUE_Y, value); }

    // -----------------------------------

    /** An array of {@link spng_chrm} structs. */
    public static class Buffer extends StructBuffer<spng_chrm, Buffer> implements NativeResource {

        private static final spng_chrm ELEMENT_FACTORY = spng_chrm.create(-1L);

        /**
         * Creates a new {@code spng_chrm.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link spng_chrm#SIZEOF}, and its mark will be undefined.</p>
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
        protected spng_chrm getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code white_point_x} field. */
        public double white_point_x() { return spng_chrm.nwhite_point_x(address()); }
        /** @return the value of the {@code white_point_y} field. */
        public double white_point_y() { return spng_chrm.nwhite_point_y(address()); }
        /** @return the value of the {@code red_x} field. */
        public double red_x() { return spng_chrm.nred_x(address()); }
        /** @return the value of the {@code red_y} field. */
        public double red_y() { return spng_chrm.nred_y(address()); }
        /** @return the value of the {@code green_x} field. */
        public double green_x() { return spng_chrm.ngreen_x(address()); }
        /** @return the value of the {@code green_y} field. */
        public double green_y() { return spng_chrm.ngreen_y(address()); }
        /** @return the value of the {@code blue_x} field. */
        public double blue_x() { return spng_chrm.nblue_x(address()); }
        /** @return the value of the {@code blue_y} field. */
        public double blue_y() { return spng_chrm.nblue_y(address()); }

        /** Sets the specified value to the {@code white_point_x} field. */
        public spng_chrm.Buffer white_point_x(double value) { spng_chrm.nwhite_point_x(address(), value); return this; }
        /** Sets the specified value to the {@code white_point_y} field. */
        public spng_chrm.Buffer white_point_y(double value) { spng_chrm.nwhite_point_y(address(), value); return this; }
        /** Sets the specified value to the {@code red_x} field. */
        public spng_chrm.Buffer red_x(double value) { spng_chrm.nred_x(address(), value); return this; }
        /** Sets the specified value to the {@code red_y} field. */
        public spng_chrm.Buffer red_y(double value) { spng_chrm.nred_y(address(), value); return this; }
        /** Sets the specified value to the {@code green_x} field. */
        public spng_chrm.Buffer green_x(double value) { spng_chrm.ngreen_x(address(), value); return this; }
        /** Sets the specified value to the {@code green_y} field. */
        public spng_chrm.Buffer green_y(double value) { spng_chrm.ngreen_y(address(), value); return this; }
        /** Sets the specified value to the {@code blue_x} field. */
        public spng_chrm.Buffer blue_x(double value) { spng_chrm.nblue_x(address(), value); return this; }
        /** Sets the specified value to the {@code blue_y} field. */
        public spng_chrm.Buffer blue_y(double value) { spng_chrm.nblue_y(address(), value); return this; }

    }

}