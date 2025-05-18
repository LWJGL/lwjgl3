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
 * struct spng_sbit {
 *     uint8_t grayscale_bits;
 *     uint8_t red_bits;
 *     uint8_t green_bits;
 *     uint8_t blue_bits;
 *     uint8_t alpha_bits;
 * }}</pre>
 */
@NativeType("struct spng_sbit")
public class spng_sbit extends Struct<spng_sbit> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        GRAYSCALE_BITS,
        RED_BITS,
        GREEN_BITS,
        BLUE_BITS,
        ALPHA_BITS;

    static {
        Layout layout = __struct(
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        GRAYSCALE_BITS = layout.offsetof(0);
        RED_BITS = layout.offsetof(1);
        GREEN_BITS = layout.offsetof(2);
        BLUE_BITS = layout.offsetof(3);
        ALPHA_BITS = layout.offsetof(4);
    }

    protected spng_sbit(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected spng_sbit create(long address, @Nullable ByteBuffer container) {
        return new spng_sbit(address, container);
    }

    /**
     * Creates a {@code spng_sbit} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public spng_sbit(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code grayscale_bits} field. */
    @NativeType("uint8_t")
    public byte grayscale_bits() { return ngrayscale_bits(address()); }
    /** @return the value of the {@code red_bits} field. */
    @NativeType("uint8_t")
    public byte red_bits() { return nred_bits(address()); }
    /** @return the value of the {@code green_bits} field. */
    @NativeType("uint8_t")
    public byte green_bits() { return ngreen_bits(address()); }
    /** @return the value of the {@code blue_bits} field. */
    @NativeType("uint8_t")
    public byte blue_bits() { return nblue_bits(address()); }
    /** @return the value of the {@code alpha_bits} field. */
    @NativeType("uint8_t")
    public byte alpha_bits() { return nalpha_bits(address()); }

    /** Sets the specified value to the {@code grayscale_bits} field. */
    public spng_sbit grayscale_bits(@NativeType("uint8_t") byte value) { ngrayscale_bits(address(), value); return this; }
    /** Sets the specified value to the {@code red_bits} field. */
    public spng_sbit red_bits(@NativeType("uint8_t") byte value) { nred_bits(address(), value); return this; }
    /** Sets the specified value to the {@code green_bits} field. */
    public spng_sbit green_bits(@NativeType("uint8_t") byte value) { ngreen_bits(address(), value); return this; }
    /** Sets the specified value to the {@code blue_bits} field. */
    public spng_sbit blue_bits(@NativeType("uint8_t") byte value) { nblue_bits(address(), value); return this; }
    /** Sets the specified value to the {@code alpha_bits} field. */
    public spng_sbit alpha_bits(@NativeType("uint8_t") byte value) { nalpha_bits(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public spng_sbit set(
        byte grayscale_bits,
        byte red_bits,
        byte green_bits,
        byte blue_bits,
        byte alpha_bits
    ) {
        grayscale_bits(grayscale_bits);
        red_bits(red_bits);
        green_bits(green_bits);
        blue_bits(blue_bits);
        alpha_bits(alpha_bits);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public spng_sbit set(spng_sbit src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code spng_sbit} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static spng_sbit malloc() {
        return new spng_sbit(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code spng_sbit} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static spng_sbit calloc() {
        return new spng_sbit(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code spng_sbit} instance allocated with {@link BufferUtils}. */
    public static spng_sbit create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new spng_sbit(memAddress(container), container);
    }

    /** Returns a new {@code spng_sbit} instance for the specified memory address. */
    public static spng_sbit create(long address) {
        return new spng_sbit(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable spng_sbit createSafe(long address) {
        return address == NULL ? null : new spng_sbit(address, null);
    }

    /**
     * Returns a new {@link spng_sbit.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static spng_sbit.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link spng_sbit.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static spng_sbit.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link spng_sbit.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static spng_sbit.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link spng_sbit.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static spng_sbit.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static spng_sbit.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code spng_sbit} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static spng_sbit malloc(MemoryStack stack) {
        return new spng_sbit(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code spng_sbit} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static spng_sbit calloc(MemoryStack stack) {
        return new spng_sbit(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link spng_sbit.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static spng_sbit.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link spng_sbit.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static spng_sbit.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #grayscale_bits}. */
    public static byte ngrayscale_bits(long struct) { return memGetByte(struct + spng_sbit.GRAYSCALE_BITS); }
    /** Unsafe version of {@link #red_bits}. */
    public static byte nred_bits(long struct) { return memGetByte(struct + spng_sbit.RED_BITS); }
    /** Unsafe version of {@link #green_bits}. */
    public static byte ngreen_bits(long struct) { return memGetByte(struct + spng_sbit.GREEN_BITS); }
    /** Unsafe version of {@link #blue_bits}. */
    public static byte nblue_bits(long struct) { return memGetByte(struct + spng_sbit.BLUE_BITS); }
    /** Unsafe version of {@link #alpha_bits}. */
    public static byte nalpha_bits(long struct) { return memGetByte(struct + spng_sbit.ALPHA_BITS); }

    /** Unsafe version of {@link #grayscale_bits(byte) grayscale_bits}. */
    public static void ngrayscale_bits(long struct, byte value) { memPutByte(struct + spng_sbit.GRAYSCALE_BITS, value); }
    /** Unsafe version of {@link #red_bits(byte) red_bits}. */
    public static void nred_bits(long struct, byte value) { memPutByte(struct + spng_sbit.RED_BITS, value); }
    /** Unsafe version of {@link #green_bits(byte) green_bits}. */
    public static void ngreen_bits(long struct, byte value) { memPutByte(struct + spng_sbit.GREEN_BITS, value); }
    /** Unsafe version of {@link #blue_bits(byte) blue_bits}. */
    public static void nblue_bits(long struct, byte value) { memPutByte(struct + spng_sbit.BLUE_BITS, value); }
    /** Unsafe version of {@link #alpha_bits(byte) alpha_bits}. */
    public static void nalpha_bits(long struct, byte value) { memPutByte(struct + spng_sbit.ALPHA_BITS, value); }

    // -----------------------------------

    /** An array of {@link spng_sbit} structs. */
    public static class Buffer extends StructBuffer<spng_sbit, Buffer> implements NativeResource {

        private static final spng_sbit ELEMENT_FACTORY = spng_sbit.create(-1L);

        /**
         * Creates a new {@code spng_sbit.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link spng_sbit#SIZEOF}, and its mark will be undefined.</p>
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
        protected spng_sbit getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code grayscale_bits} field. */
        @NativeType("uint8_t")
        public byte grayscale_bits() { return spng_sbit.ngrayscale_bits(address()); }
        /** @return the value of the {@code red_bits} field. */
        @NativeType("uint8_t")
        public byte red_bits() { return spng_sbit.nred_bits(address()); }
        /** @return the value of the {@code green_bits} field. */
        @NativeType("uint8_t")
        public byte green_bits() { return spng_sbit.ngreen_bits(address()); }
        /** @return the value of the {@code blue_bits} field. */
        @NativeType("uint8_t")
        public byte blue_bits() { return spng_sbit.nblue_bits(address()); }
        /** @return the value of the {@code alpha_bits} field. */
        @NativeType("uint8_t")
        public byte alpha_bits() { return spng_sbit.nalpha_bits(address()); }

        /** Sets the specified value to the {@code grayscale_bits} field. */
        public spng_sbit.Buffer grayscale_bits(@NativeType("uint8_t") byte value) { spng_sbit.ngrayscale_bits(address(), value); return this; }
        /** Sets the specified value to the {@code red_bits} field. */
        public spng_sbit.Buffer red_bits(@NativeType("uint8_t") byte value) { spng_sbit.nred_bits(address(), value); return this; }
        /** Sets the specified value to the {@code green_bits} field. */
        public spng_sbit.Buffer green_bits(@NativeType("uint8_t") byte value) { spng_sbit.ngreen_bits(address(), value); return this; }
        /** Sets the specified value to the {@code blue_bits} field. */
        public spng_sbit.Buffer blue_bits(@NativeType("uint8_t") byte value) { spng_sbit.nblue_bits(address(), value); return this; }
        /** Sets the specified value to the {@code alpha_bits} field. */
        public spng_sbit.Buffer alpha_bits(@NativeType("uint8_t") byte value) { spng_sbit.nalpha_bits(address(), value); return this; }

    }

}