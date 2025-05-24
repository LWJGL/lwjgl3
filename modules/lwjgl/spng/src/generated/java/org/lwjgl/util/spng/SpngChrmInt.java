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
public class SpngChrmInt extends Struct<SpngChrmInt> implements NativeResource {

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

    protected SpngChrmInt(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SpngChrmInt create(long address, @Nullable ByteBuffer container) {
        return new SpngChrmInt(address, container);
    }

    /**
     * Creates a {@code SpngChrmInt} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SpngChrmInt(ByteBuffer container) {
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
    public SpngChrmInt white_point_x(@NativeType("uint32_t") int value) { nwhite_point_x(address(), value); return this; }
    /** Sets the specified value to the {@code white_point_y} field. */
    public SpngChrmInt white_point_y(@NativeType("uint32_t") int value) { nwhite_point_y(address(), value); return this; }
    /** Sets the specified value to the {@code red_x} field. */
    public SpngChrmInt red_x(@NativeType("uint32_t") int value) { nred_x(address(), value); return this; }
    /** Sets the specified value to the {@code red_y} field. */
    public SpngChrmInt red_y(@NativeType("uint32_t") int value) { nred_y(address(), value); return this; }
    /** Sets the specified value to the {@code green_x} field. */
    public SpngChrmInt green_x(@NativeType("uint32_t") int value) { ngreen_x(address(), value); return this; }
    /** Sets the specified value to the {@code green_y} field. */
    public SpngChrmInt green_y(@NativeType("uint32_t") int value) { ngreen_y(address(), value); return this; }
    /** Sets the specified value to the {@code blue_x} field. */
    public SpngChrmInt blue_x(@NativeType("uint32_t") int value) { nblue_x(address(), value); return this; }
    /** Sets the specified value to the {@code blue_y} field. */
    public SpngChrmInt blue_y(@NativeType("uint32_t") int value) { nblue_y(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SpngChrmInt set(
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
    public SpngChrmInt set(SpngChrmInt src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SpngChrmInt} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SpngChrmInt malloc() {
        return new SpngChrmInt(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SpngChrmInt} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SpngChrmInt calloc() {
        return new SpngChrmInt(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SpngChrmInt} instance allocated with {@link BufferUtils}. */
    public static SpngChrmInt create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SpngChrmInt(memAddress(container), container);
    }

    /** Returns a new {@code SpngChrmInt} instance for the specified memory address. */
    public static SpngChrmInt create(long address) {
        return new SpngChrmInt(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SpngChrmInt createSafe(long address) {
        return address == NULL ? null : new SpngChrmInt(address, null);
    }

    /**
     * Returns a new {@link SpngChrmInt.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpngChrmInt.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SpngChrmInt.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpngChrmInt.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpngChrmInt.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SpngChrmInt.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SpngChrmInt.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SpngChrmInt.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SpngChrmInt.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SpngChrmInt} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SpngChrmInt malloc(MemoryStack stack) {
        return new SpngChrmInt(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SpngChrmInt} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SpngChrmInt calloc(MemoryStack stack) {
        return new SpngChrmInt(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SpngChrmInt.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpngChrmInt.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpngChrmInt.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpngChrmInt.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #white_point_x}. */
    public static int nwhite_point_x(long struct) { return memGetInt(struct + SpngChrmInt.WHITE_POINT_X); }
    /** Unsafe version of {@link #white_point_y}. */
    public static int nwhite_point_y(long struct) { return memGetInt(struct + SpngChrmInt.WHITE_POINT_Y); }
    /** Unsafe version of {@link #red_x}. */
    public static int nred_x(long struct) { return memGetInt(struct + SpngChrmInt.RED_X); }
    /** Unsafe version of {@link #red_y}. */
    public static int nred_y(long struct) { return memGetInt(struct + SpngChrmInt.RED_Y); }
    /** Unsafe version of {@link #green_x}. */
    public static int ngreen_x(long struct) { return memGetInt(struct + SpngChrmInt.GREEN_X); }
    /** Unsafe version of {@link #green_y}. */
    public static int ngreen_y(long struct) { return memGetInt(struct + SpngChrmInt.GREEN_Y); }
    /** Unsafe version of {@link #blue_x}. */
    public static int nblue_x(long struct) { return memGetInt(struct + SpngChrmInt.BLUE_X); }
    /** Unsafe version of {@link #blue_y}. */
    public static int nblue_y(long struct) { return memGetInt(struct + SpngChrmInt.BLUE_Y); }

    /** Unsafe version of {@link #white_point_x(int) white_point_x}. */
    public static void nwhite_point_x(long struct, int value) { memPutInt(struct + SpngChrmInt.WHITE_POINT_X, value); }
    /** Unsafe version of {@link #white_point_y(int) white_point_y}. */
    public static void nwhite_point_y(long struct, int value) { memPutInt(struct + SpngChrmInt.WHITE_POINT_Y, value); }
    /** Unsafe version of {@link #red_x(int) red_x}. */
    public static void nred_x(long struct, int value) { memPutInt(struct + SpngChrmInt.RED_X, value); }
    /** Unsafe version of {@link #red_y(int) red_y}. */
    public static void nred_y(long struct, int value) { memPutInt(struct + SpngChrmInt.RED_Y, value); }
    /** Unsafe version of {@link #green_x(int) green_x}. */
    public static void ngreen_x(long struct, int value) { memPutInt(struct + SpngChrmInt.GREEN_X, value); }
    /** Unsafe version of {@link #green_y(int) green_y}. */
    public static void ngreen_y(long struct, int value) { memPutInt(struct + SpngChrmInt.GREEN_Y, value); }
    /** Unsafe version of {@link #blue_x(int) blue_x}. */
    public static void nblue_x(long struct, int value) { memPutInt(struct + SpngChrmInt.BLUE_X, value); }
    /** Unsafe version of {@link #blue_y(int) blue_y}. */
    public static void nblue_y(long struct, int value) { memPutInt(struct + SpngChrmInt.BLUE_Y, value); }

    // -----------------------------------

    /** An array of {@link SpngChrmInt} structs. */
    public static class Buffer extends StructBuffer<SpngChrmInt, Buffer> implements NativeResource {

        private static final SpngChrmInt ELEMENT_FACTORY = SpngChrmInt.create(-1L);

        /**
         * Creates a new {@code SpngChrmInt.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SpngChrmInt#SIZEOF}, and its mark will be undefined.</p>
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
        protected SpngChrmInt getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code white_point_x} field. */
        @NativeType("uint32_t")
        public int white_point_x() { return SpngChrmInt.nwhite_point_x(address()); }
        /** @return the value of the {@code white_point_y} field. */
        @NativeType("uint32_t")
        public int white_point_y() { return SpngChrmInt.nwhite_point_y(address()); }
        /** @return the value of the {@code red_x} field. */
        @NativeType("uint32_t")
        public int red_x() { return SpngChrmInt.nred_x(address()); }
        /** @return the value of the {@code red_y} field. */
        @NativeType("uint32_t")
        public int red_y() { return SpngChrmInt.nred_y(address()); }
        /** @return the value of the {@code green_x} field. */
        @NativeType("uint32_t")
        public int green_x() { return SpngChrmInt.ngreen_x(address()); }
        /** @return the value of the {@code green_y} field. */
        @NativeType("uint32_t")
        public int green_y() { return SpngChrmInt.ngreen_y(address()); }
        /** @return the value of the {@code blue_x} field. */
        @NativeType("uint32_t")
        public int blue_x() { return SpngChrmInt.nblue_x(address()); }
        /** @return the value of the {@code blue_y} field. */
        @NativeType("uint32_t")
        public int blue_y() { return SpngChrmInt.nblue_y(address()); }

        /** Sets the specified value to the {@code white_point_x} field. */
        public SpngChrmInt.Buffer white_point_x(@NativeType("uint32_t") int value) { SpngChrmInt.nwhite_point_x(address(), value); return this; }
        /** Sets the specified value to the {@code white_point_y} field. */
        public SpngChrmInt.Buffer white_point_y(@NativeType("uint32_t") int value) { SpngChrmInt.nwhite_point_y(address(), value); return this; }
        /** Sets the specified value to the {@code red_x} field. */
        public SpngChrmInt.Buffer red_x(@NativeType("uint32_t") int value) { SpngChrmInt.nred_x(address(), value); return this; }
        /** Sets the specified value to the {@code red_y} field. */
        public SpngChrmInt.Buffer red_y(@NativeType("uint32_t") int value) { SpngChrmInt.nred_y(address(), value); return this; }
        /** Sets the specified value to the {@code green_x} field. */
        public SpngChrmInt.Buffer green_x(@NativeType("uint32_t") int value) { SpngChrmInt.ngreen_x(address(), value); return this; }
        /** Sets the specified value to the {@code green_y} field. */
        public SpngChrmInt.Buffer green_y(@NativeType("uint32_t") int value) { SpngChrmInt.ngreen_y(address(), value); return this; }
        /** Sets the specified value to the {@code blue_x} field. */
        public SpngChrmInt.Buffer blue_x(@NativeType("uint32_t") int value) { SpngChrmInt.nblue_x(address(), value); return this; }
        /** Sets the specified value to the {@code blue_y} field. */
        public SpngChrmInt.Buffer blue_y(@NativeType("uint32_t") int value) { SpngChrmInt.nblue_y(address(), value); return this; }

    }

}