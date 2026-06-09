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
 * struct ExrScanlineWrite {
 *     ExrWriteImage image;
 *     int32_t y_start;
 *     int32_t num_lines;
 *     {@link ExrBuffer ExrBuffer} input;
 *     uint32_t input_layout;
 *     uint32_t input_pixel_type;
 * }</code></pre>
 */
public class ExrScanlineWrite extends Struct<ExrScanlineWrite> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        IMAGE,
        Y_START,
        NUM_LINES,
        INPUT,
        INPUT_LAYOUT,
        INPUT_PIXEL_TYPE;

    static {
        ExrBuffer.createSafe(NULL);

        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(ExrBuffer.SIZEOF, ExrBuffer.ALIGNOF),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        IMAGE = layout.offsetof(0);
        Y_START = layout.offsetof(1);
        NUM_LINES = layout.offsetof(2);
        INPUT = layout.offsetof(3);
        INPUT_LAYOUT = layout.offsetof(4);
        INPUT_PIXEL_TYPE = layout.offsetof(5);
    }

    protected ExrScanlineWrite(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ExrScanlineWrite create(long address, @Nullable ByteBuffer container) {
        return new ExrScanlineWrite(address, container);
    }

    /**
     * Creates a {@code ExrScanlineWrite} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ExrScanlineWrite(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code image} field. */
    @NativeType("ExrWriteImage")
    public long image() { return nimage(address()); }
    /** @return the value of the {@code y_start} field. */
    @NativeType("int32_t")
    public int y_start() { return ny_start(address()); }
    /** @return the value of the {@code num_lines} field. */
    @NativeType("int32_t")
    public int num_lines() { return nnum_lines(address()); }
    /** @return a {@link ExrBuffer} view of the {@code input} field. */
    public ExrBuffer input() { return ninput(address()); }
    /** @return the value of the {@code input_layout} field. */
    @NativeType("uint32_t")
    public int input_layout() { return ninput_layout(address()); }
    /** @return the value of the {@code input_pixel_type} field. */
    @NativeType("uint32_t")
    public int input_pixel_type() { return ninput_pixel_type(address()); }

    /** Sets the specified value to the {@code image} field. */
    public ExrScanlineWrite image(@NativeType("ExrWriteImage") long value) { nimage(address(), value); return this; }
    /** Sets the specified value to the {@code y_start} field. */
    public ExrScanlineWrite y_start(@NativeType("int32_t") int value) { ny_start(address(), value); return this; }
    /** Sets the specified value to the {@code num_lines} field. */
    public ExrScanlineWrite num_lines(@NativeType("int32_t") int value) { nnum_lines(address(), value); return this; }
    /** Copies the specified {@link ExrBuffer} to the {@code input} field. */
    public ExrScanlineWrite input(ExrBuffer value) { ninput(address(), value); return this; }
    /** Passes the {@code input} field to the specified {@link java.util.function.Consumer Consumer}. */
    public ExrScanlineWrite input(java.util.function.Consumer<ExrBuffer> consumer) { consumer.accept(input()); return this; }
    /** Sets the specified value to the {@code input_layout} field. */
    public ExrScanlineWrite input_layout(@NativeType("uint32_t") int value) { ninput_layout(address(), value); return this; }
    /** Sets the specified value to the {@code input_pixel_type} field. */
    public ExrScanlineWrite input_pixel_type(@NativeType("uint32_t") int value) { ninput_pixel_type(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ExrScanlineWrite set(
        long image,
        int y_start,
        int num_lines,
        ExrBuffer input,
        int input_layout,
        int input_pixel_type
    ) {
        image(image);
        y_start(y_start);
        num_lines(num_lines);
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
    public ExrScanlineWrite set(ExrScanlineWrite src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ExrScanlineWrite} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ExrScanlineWrite malloc() {
        return new ExrScanlineWrite(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ExrScanlineWrite} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ExrScanlineWrite calloc() {
        return new ExrScanlineWrite(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ExrScanlineWrite} instance allocated with {@link BufferUtils}. */
    public static ExrScanlineWrite create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ExrScanlineWrite(memAddress(container), container);
    }

    /** Returns a new {@code ExrScanlineWrite} instance for the specified memory address. */
    public static ExrScanlineWrite create(long address) {
        return new ExrScanlineWrite(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ExrScanlineWrite createSafe(long address) {
        return address == NULL ? null : new ExrScanlineWrite(address, null);
    }

    /**
     * Returns a new {@link ExrScanlineWrite.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrScanlineWrite.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ExrScanlineWrite.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrScanlineWrite.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrScanlineWrite.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ExrScanlineWrite.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ExrScanlineWrite.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ExrScanlineWrite.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ExrScanlineWrite.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ExrScanlineWrite} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrScanlineWrite malloc(MemoryStack stack) {
        return new ExrScanlineWrite(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ExrScanlineWrite} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrScanlineWrite calloc(MemoryStack stack) {
        return new ExrScanlineWrite(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ExrScanlineWrite.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrScanlineWrite.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrScanlineWrite.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrScanlineWrite.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #image}. */
    public static long nimage(long struct) { return memGetAddress(struct + ExrScanlineWrite.IMAGE); }
    /** Unsafe version of {@link #y_start}. */
    public static int ny_start(long struct) { return memGetInt(struct + ExrScanlineWrite.Y_START); }
    /** Unsafe version of {@link #num_lines}. */
    public static int nnum_lines(long struct) { return memGetInt(struct + ExrScanlineWrite.NUM_LINES); }
    /** Unsafe version of {@link #input}. */
    public static ExrBuffer ninput(long struct) { return ExrBuffer.create(struct + ExrScanlineWrite.INPUT); }
    /** Unsafe version of {@link #input_layout}. */
    public static int ninput_layout(long struct) { return memGetInt(struct + ExrScanlineWrite.INPUT_LAYOUT); }
    /** Unsafe version of {@link #input_pixel_type}. */
    public static int ninput_pixel_type(long struct) { return memGetInt(struct + ExrScanlineWrite.INPUT_PIXEL_TYPE); }

    /** Unsafe version of {@link #image(long) image}. */
    public static void nimage(long struct, long value) { memPutAddress(struct + ExrScanlineWrite.IMAGE, check(value)); }
    /** Unsafe version of {@link #y_start(int) y_start}. */
    public static void ny_start(long struct, int value) { memPutInt(struct + ExrScanlineWrite.Y_START, value); }
    /** Unsafe version of {@link #num_lines(int) num_lines}. */
    public static void nnum_lines(long struct, int value) { memPutInt(struct + ExrScanlineWrite.NUM_LINES, value); }
    /** Unsafe version of {@link #input(ExrBuffer) input}. */
    public static void ninput(long struct, ExrBuffer value) { memCopy(value.address(), struct + ExrScanlineWrite.INPUT, ExrBuffer.SIZEOF); }
    /** Unsafe version of {@link #input_layout(int) input_layout}. */
    public static void ninput_layout(long struct, int value) { memPutInt(struct + ExrScanlineWrite.INPUT_LAYOUT, value); }
    /** Unsafe version of {@link #input_pixel_type(int) input_pixel_type}. */
    public static void ninput_pixel_type(long struct, int value) { memPutInt(struct + ExrScanlineWrite.INPUT_PIXEL_TYPE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + ExrScanlineWrite.IMAGE));
        ExrBuffer.validate(struct + ExrScanlineWrite.INPUT);
    }

    // -----------------------------------

    /** An array of {@link ExrScanlineWrite} structs. */
    public static class Buffer extends StructBuffer<ExrScanlineWrite, Buffer> implements NativeResource {

        private static final ExrScanlineWrite ELEMENT_FACTORY = ExrScanlineWrite.create(-1L);

        /**
         * Creates a new {@code ExrScanlineWrite.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ExrScanlineWrite#SIZEOF}, and its mark will be undefined.</p>
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
        protected ExrScanlineWrite getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code image} field. */
        @NativeType("ExrWriteImage")
        public long image() { return ExrScanlineWrite.nimage(address()); }
        /** @return the value of the {@code y_start} field. */
        @NativeType("int32_t")
        public int y_start() { return ExrScanlineWrite.ny_start(address()); }
        /** @return the value of the {@code num_lines} field. */
        @NativeType("int32_t")
        public int num_lines() { return ExrScanlineWrite.nnum_lines(address()); }
        /** @return a {@link ExrBuffer} view of the {@code input} field. */
        public ExrBuffer input() { return ExrScanlineWrite.ninput(address()); }
        /** @return the value of the {@code input_layout} field. */
        @NativeType("uint32_t")
        public int input_layout() { return ExrScanlineWrite.ninput_layout(address()); }
        /** @return the value of the {@code input_pixel_type} field. */
        @NativeType("uint32_t")
        public int input_pixel_type() { return ExrScanlineWrite.ninput_pixel_type(address()); }

        /** Sets the specified value to the {@code image} field. */
        public ExrScanlineWrite.Buffer image(@NativeType("ExrWriteImage") long value) { ExrScanlineWrite.nimage(address(), value); return this; }
        /** Sets the specified value to the {@code y_start} field. */
        public ExrScanlineWrite.Buffer y_start(@NativeType("int32_t") int value) { ExrScanlineWrite.ny_start(address(), value); return this; }
        /** Sets the specified value to the {@code num_lines} field. */
        public ExrScanlineWrite.Buffer num_lines(@NativeType("int32_t") int value) { ExrScanlineWrite.nnum_lines(address(), value); return this; }
        /** Copies the specified {@link ExrBuffer} to the {@code input} field. */
        public ExrScanlineWrite.Buffer input(ExrBuffer value) { ExrScanlineWrite.ninput(address(), value); return this; }
        /** Passes the {@code input} field to the specified {@link java.util.function.Consumer Consumer}. */
        public ExrScanlineWrite.Buffer input(java.util.function.Consumer<ExrBuffer> consumer) { consumer.accept(input()); return this; }
        /** Sets the specified value to the {@code input_layout} field. */
        public ExrScanlineWrite.Buffer input_layout(@NativeType("uint32_t") int value) { ExrScanlineWrite.ninput_layout(address(), value); return this; }
        /** Sets the specified value to the {@code input_pixel_type} field. */
        public ExrScanlineWrite.Buffer input_pixel_type(@NativeType("uint32_t") int value) { ExrScanlineWrite.ninput_pixel_type(address(), value); return this; }

    }

}