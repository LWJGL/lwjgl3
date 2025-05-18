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
 * struct spng_chrm_int {
 *     uint32_t white_point_x;
 *     uint32_t white_point_y;
 *     uint32_t red_x;
 *     uint32_t red_y;
 *     uint32_t green_x;
 *     uint32_t green_y;
 *     uint32_t blue_x;
 *     uint32_t blue_y;
 * }}</pre>
 */
@NativeType("struct spng_chrm_int")
public class spng_chrm_int extends Struct<spng_chrm_int> implements NativeResource {

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

        WHITE_POINT_X = layout.offsetof(0);
        WHITE_POINT_Y = layout.offsetof(1);
        RED_X = layout.offsetof(2);
        RED_Y = layout.offsetof(3);
        GREEN_X = layout.offsetof(4);
        GREEN_Y = layout.offsetof(5);
        BLUE_X = layout.offsetof(6);
        BLUE_Y = layout.offsetof(7);
    }

    protected spng_chrm_int(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected spng_chrm_int create(long address, @Nullable ByteBuffer container) {
        return new spng_chrm_int(address, container);
    }

    /**
     * Creates a {@code spng_chrm_int} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public spng_chrm_int(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code white_point_x} field. */
    @NativeType("uint32_t")
    public int white_point_x() { return nwhite_point_x(address()); }
    /** @return the value of the {@code white_point_y} field. */
    @NativeType("uint32_t")
    public int white_point_y() { return nwhite_point_y(address()); }
    /** @return the value of the {@code red_x} field. */
    @NativeType("uint32_t")
    public int red_x() { return nred_x(address()); }
    /** @return the value of the {@code red_y} field. */
    @NativeType("uint32_t")
    public int red_y() { return nred_y(address()); }
    /** @return the value of the {@code green_x} field. */
    @NativeType("uint32_t")
    public int green_x() { return ngreen_x(address()); }
    /** @return the value of the {@code green_y} field. */
    @NativeType("uint32_t")
    public int green_y() { return ngreen_y(address()); }
    /** @return the value of the {@code blue_x} field. */
    @NativeType("uint32_t")
    public int blue_x() { return nblue_x(address()); }
    /** @return the value of the {@code blue_y} field. */
    @NativeType("uint32_t")
    public int blue_y() { return nblue_y(address()); }

    /** Sets the specified value to the {@code white_point_x} field. */
    public spng_chrm_int white_point_x(@NativeType("uint32_t") int value) { nwhite_point_x(address(), value); return this; }
    /** Sets the specified value to the {@code white_point_y} field. */
    public spng_chrm_int white_point_y(@NativeType("uint32_t") int value) { nwhite_point_y(address(), value); return this; }
    /** Sets the specified value to the {@code red_x} field. */
    public spng_chrm_int red_x(@NativeType("uint32_t") int value) { nred_x(address(), value); return this; }
    /** Sets the specified value to the {@code red_y} field. */
    public spng_chrm_int red_y(@NativeType("uint32_t") int value) { nred_y(address(), value); return this; }
    /** Sets the specified value to the {@code green_x} field. */
    public spng_chrm_int green_x(@NativeType("uint32_t") int value) { ngreen_x(address(), value); return this; }
    /** Sets the specified value to the {@code green_y} field. */
    public spng_chrm_int green_y(@NativeType("uint32_t") int value) { ngreen_y(address(), value); return this; }
    /** Sets the specified value to the {@code blue_x} field. */
    public spng_chrm_int blue_x(@NativeType("uint32_t") int value) { nblue_x(address(), value); return this; }
    /** Sets the specified value to the {@code blue_y} field. */
    public spng_chrm_int blue_y(@NativeType("uint32_t") int value) { nblue_y(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public spng_chrm_int set(
        int white_point_x,
        int white_point_y,
        int red_x,
        int red_y,
        int green_x,
        int green_y,
        int blue_x,
        int blue_y
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
    public spng_chrm_int set(spng_chrm_int src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code spng_chrm_int} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static spng_chrm_int malloc() {
        return new spng_chrm_int(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code spng_chrm_int} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static spng_chrm_int calloc() {
        return new spng_chrm_int(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code spng_chrm_int} instance allocated with {@link BufferUtils}. */
    public static spng_chrm_int create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new spng_chrm_int(memAddress(container), container);
    }

    /** Returns a new {@code spng_chrm_int} instance for the specified memory address. */
    public static spng_chrm_int create(long address) {
        return new spng_chrm_int(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable spng_chrm_int createSafe(long address) {
        return address == NULL ? null : new spng_chrm_int(address, null);
    }

    /**
     * Returns a new {@link spng_chrm_int.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static spng_chrm_int.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link spng_chrm_int.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static spng_chrm_int.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link spng_chrm_int.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static spng_chrm_int.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link spng_chrm_int.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static spng_chrm_int.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static spng_chrm_int.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code spng_chrm_int} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static spng_chrm_int malloc(MemoryStack stack) {
        return new spng_chrm_int(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code spng_chrm_int} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static spng_chrm_int calloc(MemoryStack stack) {
        return new spng_chrm_int(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link spng_chrm_int.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static spng_chrm_int.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link spng_chrm_int.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static spng_chrm_int.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #white_point_x}. */
    public static int nwhite_point_x(long struct) { return memGetInt(struct + spng_chrm_int.WHITE_POINT_X); }
    /** Unsafe version of {@link #white_point_y}. */
    public static int nwhite_point_y(long struct) { return memGetInt(struct + spng_chrm_int.WHITE_POINT_Y); }
    /** Unsafe version of {@link #red_x}. */
    public static int nred_x(long struct) { return memGetInt(struct + spng_chrm_int.RED_X); }
    /** Unsafe version of {@link #red_y}. */
    public static int nred_y(long struct) { return memGetInt(struct + spng_chrm_int.RED_Y); }
    /** Unsafe version of {@link #green_x}. */
    public static int ngreen_x(long struct) { return memGetInt(struct + spng_chrm_int.GREEN_X); }
    /** Unsafe version of {@link #green_y}. */
    public static int ngreen_y(long struct) { return memGetInt(struct + spng_chrm_int.GREEN_Y); }
    /** Unsafe version of {@link #blue_x}. */
    public static int nblue_x(long struct) { return memGetInt(struct + spng_chrm_int.BLUE_X); }
    /** Unsafe version of {@link #blue_y}. */
    public static int nblue_y(long struct) { return memGetInt(struct + spng_chrm_int.BLUE_Y); }

    /** Unsafe version of {@link #white_point_x(int) white_point_x}. */
    public static void nwhite_point_x(long struct, int value) { memPutInt(struct + spng_chrm_int.WHITE_POINT_X, value); }
    /** Unsafe version of {@link #white_point_y(int) white_point_y}. */
    public static void nwhite_point_y(long struct, int value) { memPutInt(struct + spng_chrm_int.WHITE_POINT_Y, value); }
    /** Unsafe version of {@link #red_x(int) red_x}. */
    public static void nred_x(long struct, int value) { memPutInt(struct + spng_chrm_int.RED_X, value); }
    /** Unsafe version of {@link #red_y(int) red_y}. */
    public static void nred_y(long struct, int value) { memPutInt(struct + spng_chrm_int.RED_Y, value); }
    /** Unsafe version of {@link #green_x(int) green_x}. */
    public static void ngreen_x(long struct, int value) { memPutInt(struct + spng_chrm_int.GREEN_X, value); }
    /** Unsafe version of {@link #green_y(int) green_y}. */
    public static void ngreen_y(long struct, int value) { memPutInt(struct + spng_chrm_int.GREEN_Y, value); }
    /** Unsafe version of {@link #blue_x(int) blue_x}. */
    public static void nblue_x(long struct, int value) { memPutInt(struct + spng_chrm_int.BLUE_X, value); }
    /** Unsafe version of {@link #blue_y(int) blue_y}. */
    public static void nblue_y(long struct, int value) { memPutInt(struct + spng_chrm_int.BLUE_Y, value); }

    // -----------------------------------

    /** An array of {@link spng_chrm_int} structs. */
    public static class Buffer extends StructBuffer<spng_chrm_int, Buffer> implements NativeResource {

        private static final spng_chrm_int ELEMENT_FACTORY = spng_chrm_int.create(-1L);

        /**
         * Creates a new {@code spng_chrm_int.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link spng_chrm_int#SIZEOF}, and its mark will be undefined.</p>
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
        protected spng_chrm_int getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code white_point_x} field. */
        @NativeType("uint32_t")
        public int white_point_x() { return spng_chrm_int.nwhite_point_x(address()); }
        /** @return the value of the {@code white_point_y} field. */
        @NativeType("uint32_t")
        public int white_point_y() { return spng_chrm_int.nwhite_point_y(address()); }
        /** @return the value of the {@code red_x} field. */
        @NativeType("uint32_t")
        public int red_x() { return spng_chrm_int.nred_x(address()); }
        /** @return the value of the {@code red_y} field. */
        @NativeType("uint32_t")
        public int red_y() { return spng_chrm_int.nred_y(address()); }
        /** @return the value of the {@code green_x} field. */
        @NativeType("uint32_t")
        public int green_x() { return spng_chrm_int.ngreen_x(address()); }
        /** @return the value of the {@code green_y} field. */
        @NativeType("uint32_t")
        public int green_y() { return spng_chrm_int.ngreen_y(address()); }
        /** @return the value of the {@code blue_x} field. */
        @NativeType("uint32_t")
        public int blue_x() { return spng_chrm_int.nblue_x(address()); }
        /** @return the value of the {@code blue_y} field. */
        @NativeType("uint32_t")
        public int blue_y() { return spng_chrm_int.nblue_y(address()); }

        /** Sets the specified value to the {@code white_point_x} field. */
        public spng_chrm_int.Buffer white_point_x(@NativeType("uint32_t") int value) { spng_chrm_int.nwhite_point_x(address(), value); return this; }
        /** Sets the specified value to the {@code white_point_y} field. */
        public spng_chrm_int.Buffer white_point_y(@NativeType("uint32_t") int value) { spng_chrm_int.nwhite_point_y(address(), value); return this; }
        /** Sets the specified value to the {@code red_x} field. */
        public spng_chrm_int.Buffer red_x(@NativeType("uint32_t") int value) { spng_chrm_int.nred_x(address(), value); return this; }
        /** Sets the specified value to the {@code red_y} field. */
        public spng_chrm_int.Buffer red_y(@NativeType("uint32_t") int value) { spng_chrm_int.nred_y(address(), value); return this; }
        /** Sets the specified value to the {@code green_x} field. */
        public spng_chrm_int.Buffer green_x(@NativeType("uint32_t") int value) { spng_chrm_int.ngreen_x(address(), value); return this; }
        /** Sets the specified value to the {@code green_y} field. */
        public spng_chrm_int.Buffer green_y(@NativeType("uint32_t") int value) { spng_chrm_int.ngreen_y(address(), value); return this; }
        /** Sets the specified value to the {@code blue_x} field. */
        public spng_chrm_int.Buffer blue_x(@NativeType("uint32_t") int value) { spng_chrm_int.nblue_x(address(), value); return this; }
        /** Sets the specified value to the {@code blue_y} field. */
        public spng_chrm_int.Buffer blue_y(@NativeType("uint32_t") int value) { spng_chrm_int.nblue_y(address(), value); return this; }

    }

}