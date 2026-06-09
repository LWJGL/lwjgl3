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
 * <pre>{@code
 * struct ExrDeepSampleInfo {
 *     int32_t y_start;
 *     int32_t num_lines;
 *     int32_t width;
 *     uint64_t total_samples;
 *     uint32_t * sample_counts;
 *     uint64_t * sample_offsets;
 * }}</pre>
 */
public class ExrDeepSampleInfo extends Struct<ExrDeepSampleInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        Y_START,
        NUM_LINES,
        WIDTH,
        TOTAL_SAMPLES,
        SAMPLE_COUNTS,
        SAMPLE_OFFSETS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(8),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        Y_START = layout.offsetof(0);
        NUM_LINES = layout.offsetof(1);
        WIDTH = layout.offsetof(2);
        TOTAL_SAMPLES = layout.offsetof(3);
        SAMPLE_COUNTS = layout.offsetof(4);
        SAMPLE_OFFSETS = layout.offsetof(5);
    }

    protected ExrDeepSampleInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ExrDeepSampleInfo create(long address, @Nullable ByteBuffer container) {
        return new ExrDeepSampleInfo(address, container);
    }

    /**
     * Creates a {@code ExrDeepSampleInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ExrDeepSampleInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code y_start} field. */
    @NativeType("int32_t")
    public int y_start() { return ny_start(address()); }
    /** @return the value of the {@code num_lines} field. */
    @NativeType("int32_t")
    public int num_lines() { return nnum_lines(address()); }
    /** @return the value of the {@code width} field. */
    @NativeType("int32_t")
    public int width() { return nwidth(address()); }
    /** @return the value of the {@code total_samples} field. */
    @NativeType("uint64_t")
    public long total_samples() { return ntotal_samples(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code sample_counts} field. */
    @NativeType("uint32_t *")
    public IntBuffer sample_counts() { return nsample_counts(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code sample_offsets} field. */
    @NativeType("uint64_t *")
    public LongBuffer sample_offsets() { return nsample_offsets(address()); }

    /** Sets the specified value to the {@code y_start} field. */
    public ExrDeepSampleInfo y_start(@NativeType("int32_t") int value) { ny_start(address(), value); return this; }
    /** Sets the specified value to the {@code num_lines} field. */
    public ExrDeepSampleInfo num_lines(@NativeType("int32_t") int value) { nnum_lines(address(), value); return this; }
    /** Sets the specified value to the {@code width} field. */
    public ExrDeepSampleInfo width(@NativeType("int32_t") int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code total_samples} field. */
    public ExrDeepSampleInfo total_samples(@NativeType("uint64_t") long value) { ntotal_samples(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code sample_counts} field. */
    public ExrDeepSampleInfo sample_counts(@NativeType("uint32_t *") IntBuffer value) { nsample_counts(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code sample_offsets} field. */
    public ExrDeepSampleInfo sample_offsets(@NativeType("uint64_t *") LongBuffer value) { nsample_offsets(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ExrDeepSampleInfo set(
        int y_start,
        int num_lines,
        int width,
        long total_samples,
        IntBuffer sample_counts,
        LongBuffer sample_offsets
    ) {
        y_start(y_start);
        num_lines(num_lines);
        width(width);
        total_samples(total_samples);
        sample_counts(sample_counts);
        sample_offsets(sample_offsets);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ExrDeepSampleInfo set(ExrDeepSampleInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ExrDeepSampleInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ExrDeepSampleInfo malloc() {
        return new ExrDeepSampleInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ExrDeepSampleInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ExrDeepSampleInfo calloc() {
        return new ExrDeepSampleInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ExrDeepSampleInfo} instance allocated with {@link BufferUtils}. */
    public static ExrDeepSampleInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ExrDeepSampleInfo(memAddress(container), container);
    }

    /** Returns a new {@code ExrDeepSampleInfo} instance for the specified memory address. */
    public static ExrDeepSampleInfo create(long address) {
        return new ExrDeepSampleInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ExrDeepSampleInfo createSafe(long address) {
        return address == NULL ? null : new ExrDeepSampleInfo(address, null);
    }

    /**
     * Returns a new {@link ExrDeepSampleInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrDeepSampleInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ExrDeepSampleInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrDeepSampleInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrDeepSampleInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ExrDeepSampleInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ExrDeepSampleInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ExrDeepSampleInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ExrDeepSampleInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ExrDeepSampleInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrDeepSampleInfo malloc(MemoryStack stack) {
        return new ExrDeepSampleInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ExrDeepSampleInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrDeepSampleInfo calloc(MemoryStack stack) {
        return new ExrDeepSampleInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ExrDeepSampleInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrDeepSampleInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrDeepSampleInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrDeepSampleInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #y_start}. */
    public static int ny_start(long struct) { return memGetInt(struct + ExrDeepSampleInfo.Y_START); }
    /** Unsafe version of {@link #num_lines}. */
    public static int nnum_lines(long struct) { return memGetInt(struct + ExrDeepSampleInfo.NUM_LINES); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return memGetInt(struct + ExrDeepSampleInfo.WIDTH); }
    /** Unsafe version of {@link #total_samples}. */
    public static long ntotal_samples(long struct) { return memGetLong(struct + ExrDeepSampleInfo.TOTAL_SAMPLES); }
    /** Unsafe version of {@link #sample_counts() sample_counts}. */
    public static IntBuffer nsample_counts(long struct) { return memIntBuffer(memGetAddress(struct + ExrDeepSampleInfo.SAMPLE_COUNTS), nwidth(struct) * nnum_lines(struct)); }
    /** Unsafe version of {@link #sample_offsets() sample_offsets}. */
    public static LongBuffer nsample_offsets(long struct) { return memLongBuffer(memGetAddress(struct + ExrDeepSampleInfo.SAMPLE_OFFSETS), nwidth(struct) * nnum_lines(struct) + 1); }

    /** Unsafe version of {@link #y_start(int) y_start}. */
    public static void ny_start(long struct, int value) { memPutInt(struct + ExrDeepSampleInfo.Y_START, value); }
    /** Unsafe version of {@link #num_lines(int) num_lines}. */
    public static void nnum_lines(long struct, int value) { memPutInt(struct + ExrDeepSampleInfo.NUM_LINES, value); }
    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { memPutInt(struct + ExrDeepSampleInfo.WIDTH, value); }
    /** Unsafe version of {@link #total_samples(long) total_samples}. */
    public static void ntotal_samples(long struct, long value) { memPutLong(struct + ExrDeepSampleInfo.TOTAL_SAMPLES, value); }
    /** Unsafe version of {@link #sample_counts(IntBuffer) sample_counts}. */
    public static void nsample_counts(long struct, IntBuffer value) { memPutAddress(struct + ExrDeepSampleInfo.SAMPLE_COUNTS, memAddress(value)); }
    /** Unsafe version of {@link #sample_offsets(LongBuffer) sample_offsets}. */
    public static void nsample_offsets(long struct, LongBuffer value) { memPutAddress(struct + ExrDeepSampleInfo.SAMPLE_OFFSETS, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + ExrDeepSampleInfo.SAMPLE_COUNTS));
        check(memGetAddress(struct + ExrDeepSampleInfo.SAMPLE_OFFSETS));
    }

    // -----------------------------------

    /** An array of {@link ExrDeepSampleInfo} structs. */
    public static class Buffer extends StructBuffer<ExrDeepSampleInfo, Buffer> implements NativeResource {

        private static final ExrDeepSampleInfo ELEMENT_FACTORY = ExrDeepSampleInfo.create(-1L);

        /**
         * Creates a new {@code ExrDeepSampleInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ExrDeepSampleInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected ExrDeepSampleInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code y_start} field. */
        @NativeType("int32_t")
        public int y_start() { return ExrDeepSampleInfo.ny_start(address()); }
        /** @return the value of the {@code num_lines} field. */
        @NativeType("int32_t")
        public int num_lines() { return ExrDeepSampleInfo.nnum_lines(address()); }
        /** @return the value of the {@code width} field. */
        @NativeType("int32_t")
        public int width() { return ExrDeepSampleInfo.nwidth(address()); }
        /** @return the value of the {@code total_samples} field. */
        @NativeType("uint64_t")
        public long total_samples() { return ExrDeepSampleInfo.ntotal_samples(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code sample_counts} field. */
        @NativeType("uint32_t *")
        public IntBuffer sample_counts() { return ExrDeepSampleInfo.nsample_counts(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code sample_offsets} field. */
        @NativeType("uint64_t *")
        public LongBuffer sample_offsets() { return ExrDeepSampleInfo.nsample_offsets(address()); }

        /** Sets the specified value to the {@code y_start} field. */
        public ExrDeepSampleInfo.Buffer y_start(@NativeType("int32_t") int value) { ExrDeepSampleInfo.ny_start(address(), value); return this; }
        /** Sets the specified value to the {@code num_lines} field. */
        public ExrDeepSampleInfo.Buffer num_lines(@NativeType("int32_t") int value) { ExrDeepSampleInfo.nnum_lines(address(), value); return this; }
        /** Sets the specified value to the {@code width} field. */
        public ExrDeepSampleInfo.Buffer width(@NativeType("int32_t") int value) { ExrDeepSampleInfo.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code total_samples} field. */
        public ExrDeepSampleInfo.Buffer total_samples(@NativeType("uint64_t") long value) { ExrDeepSampleInfo.ntotal_samples(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code sample_counts} field. */
        public ExrDeepSampleInfo.Buffer sample_counts(@NativeType("uint32_t *") IntBuffer value) { ExrDeepSampleInfo.nsample_counts(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code sample_offsets} field. */
        public ExrDeepSampleInfo.Buffer sample_offsets(@NativeType("uint64_t *") LongBuffer value) { ExrDeepSampleInfo.nsample_offsets(address(), value); return this; }

    }

}