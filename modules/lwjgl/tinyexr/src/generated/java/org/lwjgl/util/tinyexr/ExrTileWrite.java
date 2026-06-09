/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.tinyexr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct ExrTileWrite {
 *     ExrWriteImage image;
 *     int32_t tile_x;
 *     int32_t tile_y;
 *     int32_t level_x;
 *     int32_t level_y;
 *     {@link ExrBuffer ExrBuffer} input;
 *     uint32_t input_layout;
 *     uint32_t input_pixel_type;
 * }</code></pre>
 */
public class ExrTileWrite extends Struct<ExrTileWrite> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        IMAGE,
        TILE_X,
        TILE_Y,
        LEVEL_X,
        LEVEL_Y,
        INPUT,
        INPUT_LAYOUT,
        INPUT_PIXEL_TYPE;

    static {
        ExrBuffer.createSafe(NULL);

        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(ExrBuffer.SIZEOF, ExrBuffer.ALIGNOF),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        IMAGE = layout.offsetof(0);
        TILE_X = layout.offsetof(1);
        TILE_Y = layout.offsetof(2);
        LEVEL_X = layout.offsetof(3);
        LEVEL_Y = layout.offsetof(4);
        INPUT = layout.offsetof(5);
        INPUT_LAYOUT = layout.offsetof(6);
        INPUT_PIXEL_TYPE = layout.offsetof(7);
    }

    protected ExrTileWrite(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ExrTileWrite create(long address, @Nullable ByteBuffer container) {
        return new ExrTileWrite(address, container);
    }

    /**
     * Creates a {@code ExrTileWrite} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ExrTileWrite(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code image} field. */
    @NativeType("ExrWriteImage")
    public long image() { return nimage(address()); }
    /** @return the value of the {@code tile_x} field. */
    @NativeType("int32_t")
    public int tile_x() { return ntile_x(address()); }
    /** @return the value of the {@code tile_y} field. */
    @NativeType("int32_t")
    public int tile_y() { return ntile_y(address()); }
    /** @return the value of the {@code level_x} field. */
    @NativeType("int32_t")
    public int level_x() { return nlevel_x(address()); }
    /** @return the value of the {@code level_y} field. */
    @NativeType("int32_t")
    public int level_y() { return nlevel_y(address()); }
    /** @return a {@link ExrBuffer} view of the {@code input} field. */
    public ExrBuffer input() { return ninput(address()); }
    /** @return the value of the {@code input_layout} field. */
    @NativeType("uint32_t")
    public int input_layout() { return ninput_layout(address()); }
    /** @return the value of the {@code input_pixel_type} field. */
    @NativeType("uint32_t")
    public int input_pixel_type() { return ninput_pixel_type(address()); }

    /** Sets the specified value to the {@code image} field. */
    public ExrTileWrite image(@NativeType("ExrWriteImage") long value) { nimage(address(), value); return this; }
    /** Sets the specified value to the {@code tile_x} field. */
    public ExrTileWrite tile_x(@NativeType("int32_t") int value) { ntile_x(address(), value); return this; }
    /** Sets the specified value to the {@code tile_y} field. */
    public ExrTileWrite tile_y(@NativeType("int32_t") int value) { ntile_y(address(), value); return this; }
    /** Sets the specified value to the {@code level_x} field. */
    public ExrTileWrite level_x(@NativeType("int32_t") int value) { nlevel_x(address(), value); return this; }
    /** Sets the specified value to the {@code level_y} field. */
    public ExrTileWrite level_y(@NativeType("int32_t") int value) { nlevel_y(address(), value); return this; }
    /** Copies the specified {@link ExrBuffer} to the {@code input} field. */
    public ExrTileWrite input(ExrBuffer value) { ninput(address(), value); return this; }
    /** Passes the {@code input} field to the specified {@link java.util.function.Consumer Consumer}. */
    public ExrTileWrite input(java.util.function.Consumer<ExrBuffer> consumer) { consumer.accept(input()); return this; }
    /** Sets the specified value to the {@code input_layout} field. */
    public ExrTileWrite input_layout(@NativeType("uint32_t") int value) { ninput_layout(address(), value); return this; }
    /** Sets the specified value to the {@code input_pixel_type} field. */
    public ExrTileWrite input_pixel_type(@NativeType("uint32_t") int value) { ninput_pixel_type(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ExrTileWrite set(
        long image,
        int tile_x,
        int tile_y,
        int level_x,
        int level_y,
        ExrBuffer input,
        int input_layout,
        int input_pixel_type
    ) {
        image(image);
        tile_x(tile_x);
        tile_y(tile_y);
        level_x(level_x);
        level_y(level_y);
        input(input);
        input_layout(input_layout);
        input_pixel_type(input_pixel_type);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ExrTileWrite set(ExrTileWrite src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ExrTileWrite} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ExrTileWrite malloc() {
        return new ExrTileWrite(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ExrTileWrite} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ExrTileWrite calloc() {
        return new ExrTileWrite(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ExrTileWrite} instance allocated with {@link BufferUtils}. */
    public static ExrTileWrite create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ExrTileWrite(memAddress(container), container);
    }

    /** Returns a new {@code ExrTileWrite} instance for the specified memory address. */
    public static ExrTileWrite create(long address) {
        return new ExrTileWrite(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ExrTileWrite createSafe(long address) {
        return address == NULL ? null : new ExrTileWrite(address, null);
    }

    /**
     * Returns a new {@link ExrTileWrite.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrTileWrite.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ExrTileWrite.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrTileWrite.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrTileWrite.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ExrTileWrite.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ExrTileWrite.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ExrTileWrite.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ExrTileWrite.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ExrTileWrite} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrTileWrite malloc(MemoryStack stack) {
        return new ExrTileWrite(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ExrTileWrite} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrTileWrite calloc(MemoryStack stack) {
        return new ExrTileWrite(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ExrTileWrite.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrTileWrite.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrTileWrite.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrTileWrite.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #image}. */
    public static long nimage(long struct) { return memGetAddress(struct + ExrTileWrite.IMAGE); }
    /** Unsafe version of {@link #tile_x}. */
    public static int ntile_x(long struct) { return memGetInt(struct + ExrTileWrite.TILE_X); }
    /** Unsafe version of {@link #tile_y}. */
    public static int ntile_y(long struct) { return memGetInt(struct + ExrTileWrite.TILE_Y); }
    /** Unsafe version of {@link #level_x}. */
    public static int nlevel_x(long struct) { return memGetInt(struct + ExrTileWrite.LEVEL_X); }
    /** Unsafe version of {@link #level_y}. */
    public static int nlevel_y(long struct) { return memGetInt(struct + ExrTileWrite.LEVEL_Y); }
    /** Unsafe version of {@link #input}. */
    public static ExrBuffer ninput(long struct) { return ExrBuffer.create(struct + ExrTileWrite.INPUT); }
    /** Unsafe version of {@link #input_layout}. */
    public static int ninput_layout(long struct) { return memGetInt(struct + ExrTileWrite.INPUT_LAYOUT); }
    /** Unsafe version of {@link #input_pixel_type}. */
    public static int ninput_pixel_type(long struct) { return memGetInt(struct + ExrTileWrite.INPUT_PIXEL_TYPE); }

    /** Unsafe version of {@link #image(long) image}. */
    public static void nimage(long struct, long value) { memPutAddress(struct + ExrTileWrite.IMAGE, check(value)); }
    /** Unsafe version of {@link #tile_x(int) tile_x}. */
    public static void ntile_x(long struct, int value) { memPutInt(struct + ExrTileWrite.TILE_X, value); }
    /** Unsafe version of {@link #tile_y(int) tile_y}. */
    public static void ntile_y(long struct, int value) { memPutInt(struct + ExrTileWrite.TILE_Y, value); }
    /** Unsafe version of {@link #level_x(int) level_x}. */
    public static void nlevel_x(long struct, int value) { memPutInt(struct + ExrTileWrite.LEVEL_X, value); }
    /** Unsafe version of {@link #level_y(int) level_y}. */
    public static void nlevel_y(long struct, int value) { memPutInt(struct + ExrTileWrite.LEVEL_Y, value); }
    /** Unsafe version of {@link #input(ExrBuffer) input}. */
    public static void ninput(long struct, ExrBuffer value) { memCopy(value.address(), struct + ExrTileWrite.INPUT, ExrBuffer.SIZEOF); }
    /** Unsafe version of {@link #input_layout(int) input_layout}. */
    public static void ninput_layout(long struct, int value) { memPutInt(struct + ExrTileWrite.INPUT_LAYOUT, value); }
    /** Unsafe version of {@link #input_pixel_type(int) input_pixel_type}. */
    public static void ninput_pixel_type(long struct, int value) { memPutInt(struct + ExrTileWrite.INPUT_PIXEL_TYPE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + ExrTileWrite.IMAGE));
        ExrBuffer.validate(struct + ExrTileWrite.INPUT);
    }

    // -----------------------------------

    /** An array of {@link ExrTileWrite} structs. */
    public static class Buffer extends StructBuffer<ExrTileWrite, Buffer> implements NativeResource {

        private static final ExrTileWrite ELEMENT_FACTORY = ExrTileWrite.create(-1L);

        /**
         * Creates a new {@code ExrTileWrite.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ExrTileWrite#SIZEOF}, and its mark will be undefined.</p>
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
        protected ExrTileWrite getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code image} field. */
        @NativeType("ExrWriteImage")
        public long image() { return ExrTileWrite.nimage(address()); }
        /** @return the value of the {@code tile_x} field. */
        @NativeType("int32_t")
        public int tile_x() { return ExrTileWrite.ntile_x(address()); }
        /** @return the value of the {@code tile_y} field. */
        @NativeType("int32_t")
        public int tile_y() { return ExrTileWrite.ntile_y(address()); }
        /** @return the value of the {@code level_x} field. */
        @NativeType("int32_t")
        public int level_x() { return ExrTileWrite.nlevel_x(address()); }
        /** @return the value of the {@code level_y} field. */
        @NativeType("int32_t")
        public int level_y() { return ExrTileWrite.nlevel_y(address()); }
        /** @return a {@link ExrBuffer} view of the {@code input} field. */
        public ExrBuffer input() { return ExrTileWrite.ninput(address()); }
        /** @return the value of the {@code input_layout} field. */
        @NativeType("uint32_t")
        public int input_layout() { return ExrTileWrite.ninput_layout(address()); }
        /** @return the value of the {@code input_pixel_type} field. */
        @NativeType("uint32_t")
        public int input_pixel_type() { return ExrTileWrite.ninput_pixel_type(address()); }

        /** Sets the specified value to the {@code image} field. */
        public ExrTileWrite.Buffer image(@NativeType("ExrWriteImage") long value) { ExrTileWrite.nimage(address(), value); return this; }
        /** Sets the specified value to the {@code tile_x} field. */
        public ExrTileWrite.Buffer tile_x(@NativeType("int32_t") int value) { ExrTileWrite.ntile_x(address(), value); return this; }
        /** Sets the specified value to the {@code tile_y} field. */
        public ExrTileWrite.Buffer tile_y(@NativeType("int32_t") int value) { ExrTileWrite.ntile_y(address(), value); return this; }
        /** Sets the specified value to the {@code level_x} field. */
        public ExrTileWrite.Buffer level_x(@NativeType("int32_t") int value) { ExrTileWrite.nlevel_x(address(), value); return this; }
        /** Sets the specified value to the {@code level_y} field. */
        public ExrTileWrite.Buffer level_y(@NativeType("int32_t") int value) { ExrTileWrite.nlevel_y(address(), value); return this; }
        /** Copies the specified {@link ExrBuffer} to the {@code input} field. */
        public ExrTileWrite.Buffer input(ExrBuffer value) { ExrTileWrite.ninput(address(), value); return this; }
        /** Passes the {@code input} field to the specified {@link java.util.function.Consumer Consumer}. */
        public ExrTileWrite.Buffer input(java.util.function.Consumer<ExrBuffer> consumer) { consumer.accept(input()); return this; }
        /** Sets the specified value to the {@code input_layout} field. */
        public ExrTileWrite.Buffer input_layout(@NativeType("uint32_t") int value) { ExrTileWrite.ninput_layout(address(), value); return this; }
        /** Sets the specified value to the {@code input_pixel_type} field. */
        public ExrTileWrite.Buffer input_pixel_type(@NativeType("uint32_t") int value) { ExrTileWrite.ninput_pixel_type(address(), value); return this; }

    }

}