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
 * struct ExrDeepScanlineWrite {
 *     ExrWriteImage image;
 *     int32_t y_start;
 *     int32_t num_lines;
 *     int32_t width;
 *     uint32_t const * sample_counts;
 *     uint64_t total_samples;
 *     {@link ExrBuffer ExrBuffer} input;
 *     uint32_t input_layout;
 *     uint32_t input_pixel_type;
 * }</code></pre>
 */
public class ExrDeepScanlineWrite extends Struct<ExrDeepScanlineWrite> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        IMAGE,
        Y_START,
        NUM_LINES,
        WIDTH,
        SAMPLE_COUNTS,
        TOTAL_SAMPLES,
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
            __member(POINTER_SIZE),
            __member(8),
            __member(ExrBuffer.SIZEOF, ExrBuffer.ALIGNOF),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        IMAGE = layout.offsetof(0);
        Y_START = layout.offsetof(1);
        NUM_LINES = layout.offsetof(2);
        WIDTH = layout.offsetof(3);
        SAMPLE_COUNTS = layout.offsetof(4);
        TOTAL_SAMPLES = layout.offsetof(5);
        INPUT = layout.offsetof(6);
        INPUT_LAYOUT = layout.offsetof(7);
        INPUT_PIXEL_TYPE = layout.offsetof(8);
    }

    protected ExrDeepScanlineWrite(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ExrDeepScanlineWrite create(long address, @Nullable ByteBuffer container) {
        return new ExrDeepScanlineWrite(address, container);
    }

    /**
     * Creates a {@code ExrDeepScanlineWrite} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ExrDeepScanlineWrite(ByteBuffer container) {
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
    /** @return the value of the {@code width} field. */
    @NativeType("int32_t")
    public int width() { return nwidth(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code sample_counts} field. */
    @NativeType("uint32_t const *")
    public IntBuffer sample_counts() { return nsample_counts(address()); }
    /** @return the value of the {@code total_samples} field. */
    @NativeType("uint64_t")
    public long total_samples() { return ntotal_samples(address()); }
    /** @return a {@link ExrBuffer} view of the {@code input} field. */
    public ExrBuffer input() { return ninput(address()); }
    /** @return the value of the {@code input_layout} field. */
    @NativeType("uint32_t")
    public int input_layout() { return ninput_layout(address()); }
    /** @return the value of the {@code input_pixel_type} field. */
    @NativeType("uint32_t")
    public int input_pixel_type() { return ninput_pixel_type(address()); }

    /** Sets the specified value to the {@code image} field. */
    public ExrDeepScanlineWrite image(@NativeType("ExrWriteImage") long value) { nimage(address(), value); return this; }
    /** Sets the specified value to the {@code y_start} field. */
    public ExrDeepScanlineWrite y_start(@NativeType("int32_t") int value) { ny_start(address(), value); return this; }
    /** Sets the specified value to the {@code num_lines} field. */
    public ExrDeepScanlineWrite num_lines(@NativeType("int32_t") int value) { nnum_lines(address(), value); return this; }
    /** Sets the specified value to the {@code width} field. */
    public ExrDeepScanlineWrite width(@NativeType("int32_t") int value) { nwidth(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code sample_counts} field. */
    public ExrDeepScanlineWrite sample_counts(@NativeType("uint32_t const *") IntBuffer value) { nsample_counts(address(), value); return this; }
    /** Sets the specified value to the {@code total_samples} field. */
    public ExrDeepScanlineWrite total_samples(@NativeType("uint64_t") long value) { ntotal_samples(address(), value); return this; }
    /** Copies the specified {@link ExrBuffer} to the {@code input} field. */
    public ExrDeepScanlineWrite input(ExrBuffer value) { ninput(address(), value); return this; }
    /** Passes the {@code input} field to the specified {@link java.util.function.Consumer Consumer}. */
    public ExrDeepScanlineWrite input(java.util.function.Consumer<ExrBuffer> consumer) { consumer.accept(input()); return this; }
    /** Sets the specified value to the {@code input_layout} field. */
    public ExrDeepScanlineWrite input_layout(@NativeType("uint32_t") int value) { ninput_layout(address(), value); return this; }
    /** Sets the specified value to the {@code input_pixel_type} field. */
    public ExrDeepScanlineWrite input_pixel_type(@NativeType("uint32_t") int value) { ninput_pixel_type(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ExrDeepScanlineWrite set(
        long image,
        int y_start,
        int num_lines,
        int width,
        IntBuffer sample_counts,
        long total_samples,
        ExrBuffer input,
        int input_layout,
        int input_pixel_type
    ) {
        image(image);
        y_start(y_start);
        num_lines(num_lines);
        width(width);
        sample_counts(sample_counts);
        total_samples(total_samples);
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
    public ExrDeepScanlineWrite set(ExrDeepScanlineWrite src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ExrDeepScanlineWrite} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ExrDeepScanlineWrite malloc() {
        return new ExrDeepScanlineWrite(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ExrDeepScanlineWrite} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ExrDeepScanlineWrite calloc() {
        return new ExrDeepScanlineWrite(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ExrDeepScanlineWrite} instance allocated with {@link BufferUtils}. */
    public static ExrDeepScanlineWrite create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ExrDeepScanlineWrite(memAddress(container), container);
    }

    /** Returns a new {@code ExrDeepScanlineWrite} instance for the specified memory address. */
    public static ExrDeepScanlineWrite create(long address) {
        return new ExrDeepScanlineWrite(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ExrDeepScanlineWrite createSafe(long address) {
        return address == NULL ? null : new ExrDeepScanlineWrite(address, null);
    }

    /**
     * Returns a new {@link ExrDeepScanlineWrite.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrDeepScanlineWrite.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ExrDeepScanlineWrite.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrDeepScanlineWrite.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrDeepScanlineWrite.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ExrDeepScanlineWrite.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ExrDeepScanlineWrite.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ExrDeepScanlineWrite.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ExrDeepScanlineWrite.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ExrDeepScanlineWrite} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrDeepScanlineWrite malloc(MemoryStack stack) {
        return new ExrDeepScanlineWrite(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ExrDeepScanlineWrite} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrDeepScanlineWrite calloc(MemoryStack stack) {
        return new ExrDeepScanlineWrite(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ExrDeepScanlineWrite.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrDeepScanlineWrite.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrDeepScanlineWrite.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrDeepScanlineWrite.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #image}. */
    public static long nimage(long struct) { return memGetAddress(struct + ExrDeepScanlineWrite.IMAGE); }
    /** Unsafe version of {@link #y_start}. */
    public static int ny_start(long struct) { return memGetInt(struct + ExrDeepScanlineWrite.Y_START); }
    /** Unsafe version of {@link #num_lines}. */
    public static int nnum_lines(long struct) { return memGetInt(struct + ExrDeepScanlineWrite.NUM_LINES); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return memGetInt(struct + ExrDeepScanlineWrite.WIDTH); }
    /** Unsafe version of {@link #sample_counts() sample_counts}. */
    public static IntBuffer nsample_counts(long struct) { return memIntBuffer(memGetAddress(struct + ExrDeepScanlineWrite.SAMPLE_COUNTS), nwidth(struct) * nnum_lines(struct)); }
    /** Unsafe version of {@link #total_samples}. */
    public static long ntotal_samples(long struct) { return memGetLong(struct + ExrDeepScanlineWrite.TOTAL_SAMPLES); }
    /** Unsafe version of {@link #input}. */
    public static ExrBuffer ninput(long struct) { return ExrBuffer.create(struct + ExrDeepScanlineWrite.INPUT); }
    /** Unsafe version of {@link #input_layout}. */
    public static int ninput_layout(long struct) { return memGetInt(struct + ExrDeepScanlineWrite.INPUT_LAYOUT); }
    /** Unsafe version of {@link #input_pixel_type}. */
    public static int ninput_pixel_type(long struct) { return memGetInt(struct + ExrDeepScanlineWrite.INPUT_PIXEL_TYPE); }

    /** Unsafe version of {@link #image(long) image}. */
    public static void nimage(long struct, long value) { memPutAddress(struct + ExrDeepScanlineWrite.IMAGE, check(value)); }
    /** Unsafe version of {@link #y_start(int) y_start}. */
    public static void ny_start(long struct, int value) { memPutInt(struct + ExrDeepScanlineWrite.Y_START, value); }
    /** Unsafe version of {@link #num_lines(int) num_lines}. */
    public static void nnum_lines(long struct, int value) { memPutInt(struct + ExrDeepScanlineWrite.NUM_LINES, value); }
    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { memPutInt(struct + ExrDeepScanlineWrite.WIDTH, value); }
    /** Unsafe version of {@link #sample_counts(IntBuffer) sample_counts}. */
    public static void nsample_counts(long struct, IntBuffer value) { memPutAddress(struct + ExrDeepScanlineWrite.SAMPLE_COUNTS, memAddress(value)); }
    /** Unsafe version of {@link #total_samples(long) total_samples}. */
    public static void ntotal_samples(long struct, long value) { memPutLong(struct + ExrDeepScanlineWrite.TOTAL_SAMPLES, value); }
    /** Unsafe version of {@link #input(ExrBuffer) input}. */
    public static void ninput(long struct, ExrBuffer value) { memCopy(value.address(), struct + ExrDeepScanlineWrite.INPUT, ExrBuffer.SIZEOF); }
    /** Unsafe version of {@link #input_layout(int) input_layout}. */
    public static void ninput_layout(long struct, int value) { memPutInt(struct + ExrDeepScanlineWrite.INPUT_LAYOUT, value); }
    /** Unsafe version of {@link #input_pixel_type(int) input_pixel_type}. */
    public static void ninput_pixel_type(long struct, int value) { memPutInt(struct + ExrDeepScanlineWrite.INPUT_PIXEL_TYPE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + ExrDeepScanlineWrite.IMAGE));
        check(memGetAddress(struct + ExrDeepScanlineWrite.SAMPLE_COUNTS));
        ExrBuffer.validate(struct + ExrDeepScanlineWrite.INPUT);
    }

    // -----------------------------------

    /** An array of {@link ExrDeepScanlineWrite} structs. */
    public static class Buffer extends StructBuffer<ExrDeepScanlineWrite, Buffer> implements NativeResource {

        private static final ExrDeepScanlineWrite ELEMENT_FACTORY = ExrDeepScanlineWrite.create(-1L);

        /**
         * Creates a new {@code ExrDeepScanlineWrite.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ExrDeepScanlineWrite#SIZEOF}, and its mark will be undefined.</p>
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
        protected ExrDeepScanlineWrite getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code image} field. */
        @NativeType("ExrWriteImage")
        public long image() { return ExrDeepScanlineWrite.nimage(address()); }
        /** @return the value of the {@code y_start} field. */
        @NativeType("int32_t")
        public int y_start() { return ExrDeepScanlineWrite.ny_start(address()); }
        /** @return the value of the {@code num_lines} field. */
        @NativeType("int32_t")
        public int num_lines() { return ExrDeepScanlineWrite.nnum_lines(address()); }
        /** @return the value of the {@code width} field. */
        @NativeType("int32_t")
        public int width() { return ExrDeepScanlineWrite.nwidth(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code sample_counts} field. */
        @NativeType("uint32_t const *")
        public IntBuffer sample_counts() { return ExrDeepScanlineWrite.nsample_counts(address()); }
        /** @return the value of the {@code total_samples} field. */
        @NativeType("uint64_t")
        public long total_samples() { return ExrDeepScanlineWrite.ntotal_samples(address()); }
        /** @return a {@link ExrBuffer} view of the {@code input} field. */
        public ExrBuffer input() { return ExrDeepScanlineWrite.ninput(address()); }
        /** @return the value of the {@code input_layout} field. */
        @NativeType("uint32_t")
        public int input_layout() { return ExrDeepScanlineWrite.ninput_layout(address()); }
        /** @return the value of the {@code input_pixel_type} field. */
        @NativeType("uint32_t")
        public int input_pixel_type() { return ExrDeepScanlineWrite.ninput_pixel_type(address()); }

        /** Sets the specified value to the {@code image} field. */
        public ExrDeepScanlineWrite.Buffer image(@NativeType("ExrWriteImage") long value) { ExrDeepScanlineWrite.nimage(address(), value); return this; }
        /** Sets the specified value to the {@code y_start} field. */
        public ExrDeepScanlineWrite.Buffer y_start(@NativeType("int32_t") int value) { ExrDeepScanlineWrite.ny_start(address(), value); return this; }
        /** Sets the specified value to the {@code num_lines} field. */
        public ExrDeepScanlineWrite.Buffer num_lines(@NativeType("int32_t") int value) { ExrDeepScanlineWrite.nnum_lines(address(), value); return this; }
        /** Sets the specified value to the {@code width} field. */
        public ExrDeepScanlineWrite.Buffer width(@NativeType("int32_t") int value) { ExrDeepScanlineWrite.nwidth(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code sample_counts} field. */
        public ExrDeepScanlineWrite.Buffer sample_counts(@NativeType("uint32_t const *") IntBuffer value) { ExrDeepScanlineWrite.nsample_counts(address(), value); return this; }
        /** Sets the specified value to the {@code total_samples} field. */
        public ExrDeepScanlineWrite.Buffer total_samples(@NativeType("uint64_t") long value) { ExrDeepScanlineWrite.ntotal_samples(address(), value); return this; }
        /** Copies the specified {@link ExrBuffer} to the {@code input} field. */
        public ExrDeepScanlineWrite.Buffer input(ExrBuffer value) { ExrDeepScanlineWrite.ninput(address(), value); return this; }
        /** Passes the {@code input} field to the specified {@link java.util.function.Consumer Consumer}. */
        public ExrDeepScanlineWrite.Buffer input(java.util.function.Consumer<ExrBuffer> consumer) { consumer.accept(input()); return this; }
        /** Sets the specified value to the {@code input_layout} field. */
        public ExrDeepScanlineWrite.Buffer input_layout(@NativeType("uint32_t") int value) { ExrDeepScanlineWrite.ninput_layout(address(), value); return this; }
        /** Sets the specified value to the {@code input_pixel_type} field. */
        public ExrDeepScanlineWrite.Buffer input_pixel_type(@NativeType("uint32_t") int value) { ExrDeepScanlineWrite.ninput_pixel_type(address(), value); return this; }

    }

}