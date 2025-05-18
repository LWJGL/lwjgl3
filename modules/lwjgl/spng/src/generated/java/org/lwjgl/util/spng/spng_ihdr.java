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
 * struct spng_ihdr {
 *     uint32_t width;
 *     uint32_t height;
 *     uint8_t bit_depth;
 *     uint8_t color_type;
 *     uint8_t compression_method;
 *     uint8_t filter_method;
 *     uint8_t interlace_method;
 * }}</pre>
 */
@NativeType("struct spng_ihdr")
public class spng_ihdr extends Struct<spng_ihdr> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        WIDTH,
        HEIGHT,
        BIT_DEPTH,
        COLOR_TYPE,
        COMPRESSION_METHOD,
        FILTER_METHOD,
        INTERLACE_METHOD;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        WIDTH = layout.offsetof(0);
        HEIGHT = layout.offsetof(1);
        BIT_DEPTH = layout.offsetof(2);
        COLOR_TYPE = layout.offsetof(3);
        COMPRESSION_METHOD = layout.offsetof(4);
        FILTER_METHOD = layout.offsetof(5);
        INTERLACE_METHOD = layout.offsetof(6);
    }

    protected spng_ihdr(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected spng_ihdr create(long address, @Nullable ByteBuffer container) {
        return new spng_ihdr(address, container);
    }

    /**
     * Creates a {@code spng_ihdr} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public spng_ihdr(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code width} field. */
    @NativeType("uint32_t")
    public int width() { return nwidth(address()); }
    /** @return the value of the {@code height} field. */
    @NativeType("uint32_t")
    public int height() { return nheight(address()); }
    /** @return the value of the {@code bit_depth} field. */
    @NativeType("uint8_t")
    public byte bit_depth() { return nbit_depth(address()); }
    /** @return the value of the {@code color_type} field. */
    @NativeType("uint8_t")
    public byte color_type() { return ncolor_type(address()); }
    /** @return the value of the {@code compression_method} field. */
    @NativeType("uint8_t")
    public byte compression_method() { return ncompression_method(address()); }
    /** @return the value of the {@code filter_method} field. */
    @NativeType("uint8_t")
    public byte filter_method() { return nfilter_method(address()); }
    /** @return the value of the {@code interlace_method} field. */
    @NativeType("uint8_t")
    public byte interlace_method() { return ninterlace_method(address()); }

    /** Sets the specified value to the {@code width} field. */
    public spng_ihdr width(@NativeType("uint32_t") int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    public spng_ihdr height(@NativeType("uint32_t") int value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@code bit_depth} field. */
    public spng_ihdr bit_depth(@NativeType("uint8_t") byte value) { nbit_depth(address(), value); return this; }
    /** Sets the specified value to the {@code color_type} field. */
    public spng_ihdr color_type(@NativeType("uint8_t") byte value) { ncolor_type(address(), value); return this; }
    /** Sets the specified value to the {@code compression_method} field. */
    public spng_ihdr compression_method(@NativeType("uint8_t") byte value) { ncompression_method(address(), value); return this; }
    /** Sets the specified value to the {@code filter_method} field. */
    public spng_ihdr filter_method(@NativeType("uint8_t") byte value) { nfilter_method(address(), value); return this; }
    /** Sets the specified value to the {@code interlace_method} field. */
    public spng_ihdr interlace_method(@NativeType("uint8_t") byte value) { ninterlace_method(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public spng_ihdr set(
        int width,
        int height,
        byte bit_depth,
        byte color_type,
        byte compression_method,
        byte filter_method,
        byte interlace_method
    ) {
        width(width);
        height(height);
        bit_depth(bit_depth);
        color_type(color_type);
        compression_method(compression_method);
        filter_method(filter_method);
        interlace_method(interlace_method);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public spng_ihdr set(spng_ihdr src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code spng_ihdr} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static spng_ihdr malloc() {
        return new spng_ihdr(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code spng_ihdr} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static spng_ihdr calloc() {
        return new spng_ihdr(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code spng_ihdr} instance allocated with {@link BufferUtils}. */
    public static spng_ihdr create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new spng_ihdr(memAddress(container), container);
    }

    /** Returns a new {@code spng_ihdr} instance for the specified memory address. */
    public static spng_ihdr create(long address) {
        return new spng_ihdr(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable spng_ihdr createSafe(long address) {
        return address == NULL ? null : new spng_ihdr(address, null);
    }

    /**
     * Returns a new {@link spng_ihdr.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static spng_ihdr.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link spng_ihdr.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static spng_ihdr.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link spng_ihdr.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static spng_ihdr.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link spng_ihdr.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static spng_ihdr.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static spng_ihdr.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code spng_ihdr} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static spng_ihdr malloc(MemoryStack stack) {
        return new spng_ihdr(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code spng_ihdr} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static spng_ihdr calloc(MemoryStack stack) {
        return new spng_ihdr(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link spng_ihdr.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static spng_ihdr.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link spng_ihdr.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static spng_ihdr.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return memGetInt(struct + spng_ihdr.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return memGetInt(struct + spng_ihdr.HEIGHT); }
    /** Unsafe version of {@link #bit_depth}. */
    public static byte nbit_depth(long struct) { return memGetByte(struct + spng_ihdr.BIT_DEPTH); }
    /** Unsafe version of {@link #color_type}. */
    public static byte ncolor_type(long struct) { return memGetByte(struct + spng_ihdr.COLOR_TYPE); }
    /** Unsafe version of {@link #compression_method}. */
    public static byte ncompression_method(long struct) { return memGetByte(struct + spng_ihdr.COMPRESSION_METHOD); }
    /** Unsafe version of {@link #filter_method}. */
    public static byte nfilter_method(long struct) { return memGetByte(struct + spng_ihdr.FILTER_METHOD); }
    /** Unsafe version of {@link #interlace_method}. */
    public static byte ninterlace_method(long struct) { return memGetByte(struct + spng_ihdr.INTERLACE_METHOD); }

    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { memPutInt(struct + spng_ihdr.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { memPutInt(struct + spng_ihdr.HEIGHT, value); }
    /** Unsafe version of {@link #bit_depth(byte) bit_depth}. */
    public static void nbit_depth(long struct, byte value) { memPutByte(struct + spng_ihdr.BIT_DEPTH, value); }
    /** Unsafe version of {@link #color_type(byte) color_type}. */
    public static void ncolor_type(long struct, byte value) { memPutByte(struct + spng_ihdr.COLOR_TYPE, value); }
    /** Unsafe version of {@link #compression_method(byte) compression_method}. */
    public static void ncompression_method(long struct, byte value) { memPutByte(struct + spng_ihdr.COMPRESSION_METHOD, value); }
    /** Unsafe version of {@link #filter_method(byte) filter_method}. */
    public static void nfilter_method(long struct, byte value) { memPutByte(struct + spng_ihdr.FILTER_METHOD, value); }
    /** Unsafe version of {@link #interlace_method(byte) interlace_method}. */
    public static void ninterlace_method(long struct, byte value) { memPutByte(struct + spng_ihdr.INTERLACE_METHOD, value); }

    // -----------------------------------

    /** An array of {@link spng_ihdr} structs. */
    public static class Buffer extends StructBuffer<spng_ihdr, Buffer> implements NativeResource {

        private static final spng_ihdr ELEMENT_FACTORY = spng_ihdr.create(-1L);

        /**
         * Creates a new {@code spng_ihdr.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link spng_ihdr#SIZEOF}, and its mark will be undefined.</p>
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
        protected spng_ihdr getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code width} field. */
        @NativeType("uint32_t")
        public int width() { return spng_ihdr.nwidth(address()); }
        /** @return the value of the {@code height} field. */
        @NativeType("uint32_t")
        public int height() { return spng_ihdr.nheight(address()); }
        /** @return the value of the {@code bit_depth} field. */
        @NativeType("uint8_t")
        public byte bit_depth() { return spng_ihdr.nbit_depth(address()); }
        /** @return the value of the {@code color_type} field. */
        @NativeType("uint8_t")
        public byte color_type() { return spng_ihdr.ncolor_type(address()); }
        /** @return the value of the {@code compression_method} field. */
        @NativeType("uint8_t")
        public byte compression_method() { return spng_ihdr.ncompression_method(address()); }
        /** @return the value of the {@code filter_method} field. */
        @NativeType("uint8_t")
        public byte filter_method() { return spng_ihdr.nfilter_method(address()); }
        /** @return the value of the {@code interlace_method} field. */
        @NativeType("uint8_t")
        public byte interlace_method() { return spng_ihdr.ninterlace_method(address()); }

        /** Sets the specified value to the {@code width} field. */
        public spng_ihdr.Buffer width(@NativeType("uint32_t") int value) { spng_ihdr.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code height} field. */
        public spng_ihdr.Buffer height(@NativeType("uint32_t") int value) { spng_ihdr.nheight(address(), value); return this; }
        /** Sets the specified value to the {@code bit_depth} field. */
        public spng_ihdr.Buffer bit_depth(@NativeType("uint8_t") byte value) { spng_ihdr.nbit_depth(address(), value); return this; }
        /** Sets the specified value to the {@code color_type} field. */
        public spng_ihdr.Buffer color_type(@NativeType("uint8_t") byte value) { spng_ihdr.ncolor_type(address(), value); return this; }
        /** Sets the specified value to the {@code compression_method} field. */
        public spng_ihdr.Buffer compression_method(@NativeType("uint8_t") byte value) { spng_ihdr.ncompression_method(address(), value); return this; }
        /** Sets the specified value to the {@code filter_method} field. */
        public spng_ihdr.Buffer filter_method(@NativeType("uint8_t") byte value) { spng_ihdr.nfilter_method(address(), value); return this; }
        /** Sets the specified value to the {@code interlace_method} field. */
        public spng_ihdr.Buffer interlace_method(@NativeType("uint8_t") byte value) { spng_ihdr.ninterlace_method(address(), value); return this; }

    }

}