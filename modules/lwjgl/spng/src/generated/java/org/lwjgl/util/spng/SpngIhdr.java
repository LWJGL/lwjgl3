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
public class SpngIhdr extends Struct<SpngIhdr> implements NativeResource {

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

    protected SpngIhdr(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SpngIhdr create(long address, @Nullable ByteBuffer container) {
        return new SpngIhdr(address, container);
    }

    /**
     * Creates a {@code SpngIhdr} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SpngIhdr(ByteBuffer container) {
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
    public SpngIhdr width(@NativeType("uint32_t") int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    public SpngIhdr height(@NativeType("uint32_t") int value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@code bit_depth} field. */
    public SpngIhdr bit_depth(@NativeType("uint8_t") byte value) { nbit_depth(address(), value); return this; }
    /** Sets the specified value to the {@code color_type} field. */
    public SpngIhdr color_type(@NativeType("uint8_t") byte value) { ncolor_type(address(), value); return this; }
    /** Sets the specified value to the {@code compression_method} field. */
    public SpngIhdr compression_method(@NativeType("uint8_t") byte value) { ncompression_method(address(), value); return this; }
    /** Sets the specified value to the {@code filter_method} field. */
    public SpngIhdr filter_method(@NativeType("uint8_t") byte value) { nfilter_method(address(), value); return this; }
    /** Sets the specified value to the {@code interlace_method} field. */
    public SpngIhdr interlace_method(@NativeType("uint8_t") byte value) { ninterlace_method(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SpngIhdr set(
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
    public SpngIhdr set(SpngIhdr src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SpngIhdr} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SpngIhdr malloc() {
        return new SpngIhdr(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SpngIhdr} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SpngIhdr calloc() {
        return new SpngIhdr(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SpngIhdr} instance allocated with {@link BufferUtils}. */
    public static SpngIhdr create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SpngIhdr(memAddress(container), container);
    }

    /** Returns a new {@code SpngIhdr} instance for the specified memory address. */
    public static SpngIhdr create(long address) {
        return new SpngIhdr(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SpngIhdr createSafe(long address) {
        return address == NULL ? null : new SpngIhdr(address, null);
    }

    /**
     * Returns a new {@link SpngIhdr.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpngIhdr.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SpngIhdr.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpngIhdr.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpngIhdr.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SpngIhdr.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SpngIhdr.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SpngIhdr.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SpngIhdr.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SpngIhdr} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SpngIhdr malloc(MemoryStack stack) {
        return new SpngIhdr(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SpngIhdr} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SpngIhdr calloc(MemoryStack stack) {
        return new SpngIhdr(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SpngIhdr.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpngIhdr.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpngIhdr.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpngIhdr.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return memGetInt(struct + SpngIhdr.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return memGetInt(struct + SpngIhdr.HEIGHT); }
    /** Unsafe version of {@link #bit_depth}. */
    public static byte nbit_depth(long struct) { return memGetByte(struct + SpngIhdr.BIT_DEPTH); }
    /** Unsafe version of {@link #color_type}. */
    public static byte ncolor_type(long struct) { return memGetByte(struct + SpngIhdr.COLOR_TYPE); }
    /** Unsafe version of {@link #compression_method}. */
    public static byte ncompression_method(long struct) { return memGetByte(struct + SpngIhdr.COMPRESSION_METHOD); }
    /** Unsafe version of {@link #filter_method}. */
    public static byte nfilter_method(long struct) { return memGetByte(struct + SpngIhdr.FILTER_METHOD); }
    /** Unsafe version of {@link #interlace_method}. */
    public static byte ninterlace_method(long struct) { return memGetByte(struct + SpngIhdr.INTERLACE_METHOD); }

    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { memPutInt(struct + SpngIhdr.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { memPutInt(struct + SpngIhdr.HEIGHT, value); }
    /** Unsafe version of {@link #bit_depth(byte) bit_depth}. */
    public static void nbit_depth(long struct, byte value) { memPutByte(struct + SpngIhdr.BIT_DEPTH, value); }
    /** Unsafe version of {@link #color_type(byte) color_type}. */
    public static void ncolor_type(long struct, byte value) { memPutByte(struct + SpngIhdr.COLOR_TYPE, value); }
    /** Unsafe version of {@link #compression_method(byte) compression_method}. */
    public static void ncompression_method(long struct, byte value) { memPutByte(struct + SpngIhdr.COMPRESSION_METHOD, value); }
    /** Unsafe version of {@link #filter_method(byte) filter_method}. */
    public static void nfilter_method(long struct, byte value) { memPutByte(struct + SpngIhdr.FILTER_METHOD, value); }
    /** Unsafe version of {@link #interlace_method(byte) interlace_method}. */
    public static void ninterlace_method(long struct, byte value) { memPutByte(struct + SpngIhdr.INTERLACE_METHOD, value); }

    // -----------------------------------

    /** An array of {@link SpngIhdr} structs. */
    public static class Buffer extends StructBuffer<SpngIhdr, Buffer> implements NativeResource {

        private static final SpngIhdr ELEMENT_FACTORY = SpngIhdr.create(-1L);

        /**
         * Creates a new {@code SpngIhdr.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SpngIhdr#SIZEOF}, and its mark will be undefined.</p>
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
        protected SpngIhdr getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code width} field. */
        @NativeType("uint32_t")
        public int width() { return SpngIhdr.nwidth(address()); }
        /** @return the value of the {@code height} field. */
        @NativeType("uint32_t")
        public int height() { return SpngIhdr.nheight(address()); }
        /** @return the value of the {@code bit_depth} field. */
        @NativeType("uint8_t")
        public byte bit_depth() { return SpngIhdr.nbit_depth(address()); }
        /** @return the value of the {@code color_type} field. */
        @NativeType("uint8_t")
        public byte color_type() { return SpngIhdr.ncolor_type(address()); }
        /** @return the value of the {@code compression_method} field. */
        @NativeType("uint8_t")
        public byte compression_method() { return SpngIhdr.ncompression_method(address()); }
        /** @return the value of the {@code filter_method} field. */
        @NativeType("uint8_t")
        public byte filter_method() { return SpngIhdr.nfilter_method(address()); }
        /** @return the value of the {@code interlace_method} field. */
        @NativeType("uint8_t")
        public byte interlace_method() { return SpngIhdr.ninterlace_method(address()); }

        /** Sets the specified value to the {@code width} field. */
        public SpngIhdr.Buffer width(@NativeType("uint32_t") int value) { SpngIhdr.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code height} field. */
        public SpngIhdr.Buffer height(@NativeType("uint32_t") int value) { SpngIhdr.nheight(address(), value); return this; }
        /** Sets the specified value to the {@code bit_depth} field. */
        public SpngIhdr.Buffer bit_depth(@NativeType("uint8_t") byte value) { SpngIhdr.nbit_depth(address(), value); return this; }
        /** Sets the specified value to the {@code color_type} field. */
        public SpngIhdr.Buffer color_type(@NativeType("uint8_t") byte value) { SpngIhdr.ncolor_type(address(), value); return this; }
        /** Sets the specified value to the {@code compression_method} field. */
        public SpngIhdr.Buffer compression_method(@NativeType("uint8_t") byte value) { SpngIhdr.ncompression_method(address(), value); return this; }
        /** Sets the specified value to the {@code filter_method} field. */
        public SpngIhdr.Buffer filter_method(@NativeType("uint8_t") byte value) { SpngIhdr.nfilter_method(address(), value); return this; }
        /** Sets the specified value to the {@code interlace_method} field. */
        public SpngIhdr.Buffer interlace_method(@NativeType("uint8_t") byte value) { SpngIhdr.ninterlace_method(address(), value); return this; }

    }

}