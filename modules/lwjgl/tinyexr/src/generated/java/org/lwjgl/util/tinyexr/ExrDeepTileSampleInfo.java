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
 * struct ExrDeepTileSampleInfo {
 *     int32_t tile_x;
 *     int32_t tile_y;
 *     int32_t level_x;
 *     int32_t level_y;
 *     int32_t width;
 *     int32_t height;
 *     uint64_t total_samples;
 *     uint32_t * sample_counts;
 *     uint64_t * sample_offsets;
 * }}</pre>
 */
public class ExrDeepTileSampleInfo extends Struct<ExrDeepTileSampleInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TILE_X,
        TILE_Y,
        LEVEL_X,
        LEVEL_Y,
        WIDTH,
        HEIGHT,
        TOTAL_SAMPLES,
        SAMPLE_COUNTS,
        SAMPLE_OFFSETS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(8),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TILE_X = layout.offsetof(0);
        TILE_Y = layout.offsetof(1);
        LEVEL_X = layout.offsetof(2);
        LEVEL_Y = layout.offsetof(3);
        WIDTH = layout.offsetof(4);
        HEIGHT = layout.offsetof(5);
        TOTAL_SAMPLES = layout.offsetof(6);
        SAMPLE_COUNTS = layout.offsetof(7);
        SAMPLE_OFFSETS = layout.offsetof(8);
    }

    protected ExrDeepTileSampleInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ExrDeepTileSampleInfo create(long address, @Nullable ByteBuffer container) {
        return new ExrDeepTileSampleInfo(address, container);
    }

    /**
     * Creates a {@code ExrDeepTileSampleInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ExrDeepTileSampleInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

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
    /** @return the value of the {@code width} field. */
    @NativeType("int32_t")
    public int width() { return nwidth(address()); }
    /** @return the value of the {@code height} field. */
    @NativeType("int32_t")
    public int height() { return nheight(address()); }
    /** @return the value of the {@code total_samples} field. */
    @NativeType("uint64_t")
    public long total_samples() { return ntotal_samples(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code sample_counts} field. */
    @NativeType("uint32_t *")
    public IntBuffer sample_counts() { return nsample_counts(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code sample_offsets} field. */
    @NativeType("uint64_t *")
    public LongBuffer sample_offsets() { return nsample_offsets(address()); }

    /** Sets the specified value to the {@code tile_x} field. */
    public ExrDeepTileSampleInfo tile_x(@NativeType("int32_t") int value) { ntile_x(address(), value); return this; }
    /** Sets the specified value to the {@code tile_y} field. */
    public ExrDeepTileSampleInfo tile_y(@NativeType("int32_t") int value) { ntile_y(address(), value); return this; }
    /** Sets the specified value to the {@code level_x} field. */
    public ExrDeepTileSampleInfo level_x(@NativeType("int32_t") int value) { nlevel_x(address(), value); return this; }
    /** Sets the specified value to the {@code level_y} field. */
    public ExrDeepTileSampleInfo level_y(@NativeType("int32_t") int value) { nlevel_y(address(), value); return this; }
    /** Sets the specified value to the {@code width} field. */
    public ExrDeepTileSampleInfo width(@NativeType("int32_t") int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    public ExrDeepTileSampleInfo height(@NativeType("int32_t") int value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@code total_samples} field. */
    public ExrDeepTileSampleInfo total_samples(@NativeType("uint64_t") long value) { ntotal_samples(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code sample_counts} field. */
    public ExrDeepTileSampleInfo sample_counts(@NativeType("uint32_t *") IntBuffer value) { nsample_counts(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code sample_offsets} field. */
    public ExrDeepTileSampleInfo sample_offsets(@NativeType("uint64_t *") LongBuffer value) { nsample_offsets(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ExrDeepTileSampleInfo set(
        int tile_x,
        int tile_y,
        int level_x,
        int level_y,
        int width,
        int height,
        long total_samples,
        IntBuffer sample_counts,
        LongBuffer sample_offsets
    ) {
        tile_x(tile_x);
        tile_y(tile_y);
        level_x(level_x);
        level_y(level_y);
        width(width);
        height(height);
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
    public ExrDeepTileSampleInfo set(ExrDeepTileSampleInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ExrDeepTileSampleInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ExrDeepTileSampleInfo malloc() {
        return new ExrDeepTileSampleInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ExrDeepTileSampleInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ExrDeepTileSampleInfo calloc() {
        return new ExrDeepTileSampleInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ExrDeepTileSampleInfo} instance allocated with {@link BufferUtils}. */
    public static ExrDeepTileSampleInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ExrDeepTileSampleInfo(memAddress(container), container);
    }

    /** Returns a new {@code ExrDeepTileSampleInfo} instance for the specified memory address. */
    public static ExrDeepTileSampleInfo create(long address) {
        return new ExrDeepTileSampleInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ExrDeepTileSampleInfo createSafe(long address) {
        return address == NULL ? null : new ExrDeepTileSampleInfo(address, null);
    }

    /**
     * Returns a new {@link ExrDeepTileSampleInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrDeepTileSampleInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ExrDeepTileSampleInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrDeepTileSampleInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrDeepTileSampleInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ExrDeepTileSampleInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ExrDeepTileSampleInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ExrDeepTileSampleInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ExrDeepTileSampleInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ExrDeepTileSampleInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrDeepTileSampleInfo malloc(MemoryStack stack) {
        return new ExrDeepTileSampleInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ExrDeepTileSampleInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrDeepTileSampleInfo calloc(MemoryStack stack) {
        return new ExrDeepTileSampleInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ExrDeepTileSampleInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrDeepTileSampleInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrDeepTileSampleInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrDeepTileSampleInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #tile_x}. */
    public static int ntile_x(long struct) { return memGetInt(struct + ExrDeepTileSampleInfo.TILE_X); }
    /** Unsafe version of {@link #tile_y}. */
    public static int ntile_y(long struct) { return memGetInt(struct + ExrDeepTileSampleInfo.TILE_Y); }
    /** Unsafe version of {@link #level_x}. */
    public static int nlevel_x(long struct) { return memGetInt(struct + ExrDeepTileSampleInfo.LEVEL_X); }
    /** Unsafe version of {@link #level_y}. */
    public static int nlevel_y(long struct) { return memGetInt(struct + ExrDeepTileSampleInfo.LEVEL_Y); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return memGetInt(struct + ExrDeepTileSampleInfo.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return memGetInt(struct + ExrDeepTileSampleInfo.HEIGHT); }
    /** Unsafe version of {@link #total_samples}. */
    public static long ntotal_samples(long struct) { return memGetLong(struct + ExrDeepTileSampleInfo.TOTAL_SAMPLES); }
    /** Unsafe version of {@link #sample_counts() sample_counts}. */
    public static IntBuffer nsample_counts(long struct) { return memIntBuffer(memGetAddress(struct + ExrDeepTileSampleInfo.SAMPLE_COUNTS), nwidth(struct) * nheight(struct)); }
    /** Unsafe version of {@link #sample_offsets() sample_offsets}. */
    public static LongBuffer nsample_offsets(long struct) { return memLongBuffer(memGetAddress(struct + ExrDeepTileSampleInfo.SAMPLE_OFFSETS), nwidth(struct) * nheight(struct) + 1); }

    /** Unsafe version of {@link #tile_x(int) tile_x}. */
    public static void ntile_x(long struct, int value) { memPutInt(struct + ExrDeepTileSampleInfo.TILE_X, value); }
    /** Unsafe version of {@link #tile_y(int) tile_y}. */
    public static void ntile_y(long struct, int value) { memPutInt(struct + ExrDeepTileSampleInfo.TILE_Y, value); }
    /** Unsafe version of {@link #level_x(int) level_x}. */
    public static void nlevel_x(long struct, int value) { memPutInt(struct + ExrDeepTileSampleInfo.LEVEL_X, value); }
    /** Unsafe version of {@link #level_y(int) level_y}. */
    public static void nlevel_y(long struct, int value) { memPutInt(struct + ExrDeepTileSampleInfo.LEVEL_Y, value); }
    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { memPutInt(struct + ExrDeepTileSampleInfo.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { memPutInt(struct + ExrDeepTileSampleInfo.HEIGHT, value); }
    /** Unsafe version of {@link #total_samples(long) total_samples}. */
    public static void ntotal_samples(long struct, long value) { memPutLong(struct + ExrDeepTileSampleInfo.TOTAL_SAMPLES, value); }
    /** Unsafe version of {@link #sample_counts(IntBuffer) sample_counts}. */
    public static void nsample_counts(long struct, IntBuffer value) { memPutAddress(struct + ExrDeepTileSampleInfo.SAMPLE_COUNTS, memAddress(value)); }
    /** Unsafe version of {@link #sample_offsets(LongBuffer) sample_offsets}. */
    public static void nsample_offsets(long struct, LongBuffer value) { memPutAddress(struct + ExrDeepTileSampleInfo.SAMPLE_OFFSETS, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + ExrDeepTileSampleInfo.SAMPLE_COUNTS));
        check(memGetAddress(struct + ExrDeepTileSampleInfo.SAMPLE_OFFSETS));
    }

    // -----------------------------------

    /** An array of {@link ExrDeepTileSampleInfo} structs. */
    public static class Buffer extends StructBuffer<ExrDeepTileSampleInfo, Buffer> implements NativeResource {

        private static final ExrDeepTileSampleInfo ELEMENT_FACTORY = ExrDeepTileSampleInfo.create(-1L);

        /**
         * Creates a new {@code ExrDeepTileSampleInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ExrDeepTileSampleInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected ExrDeepTileSampleInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code tile_x} field. */
        @NativeType("int32_t")
        public int tile_x() { return ExrDeepTileSampleInfo.ntile_x(address()); }
        /** @return the value of the {@code tile_y} field. */
        @NativeType("int32_t")
        public int tile_y() { return ExrDeepTileSampleInfo.ntile_y(address()); }
        /** @return the value of the {@code level_x} field. */
        @NativeType("int32_t")
        public int level_x() { return ExrDeepTileSampleInfo.nlevel_x(address()); }
        /** @return the value of the {@code level_y} field. */
        @NativeType("int32_t")
        public int level_y() { return ExrDeepTileSampleInfo.nlevel_y(address()); }
        /** @return the value of the {@code width} field. */
        @NativeType("int32_t")
        public int width() { return ExrDeepTileSampleInfo.nwidth(address()); }
        /** @return the value of the {@code height} field. */
        @NativeType("int32_t")
        public int height() { return ExrDeepTileSampleInfo.nheight(address()); }
        /** @return the value of the {@code total_samples} field. */
        @NativeType("uint64_t")
        public long total_samples() { return ExrDeepTileSampleInfo.ntotal_samples(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code sample_counts} field. */
        @NativeType("uint32_t *")
        public IntBuffer sample_counts() { return ExrDeepTileSampleInfo.nsample_counts(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code sample_offsets} field. */
        @NativeType("uint64_t *")
        public LongBuffer sample_offsets() { return ExrDeepTileSampleInfo.nsample_offsets(address()); }

        /** Sets the specified value to the {@code tile_x} field. */
        public ExrDeepTileSampleInfo.Buffer tile_x(@NativeType("int32_t") int value) { ExrDeepTileSampleInfo.ntile_x(address(), value); return this; }
        /** Sets the specified value to the {@code tile_y} field. */
        public ExrDeepTileSampleInfo.Buffer tile_y(@NativeType("int32_t") int value) { ExrDeepTileSampleInfo.ntile_y(address(), value); return this; }
        /** Sets the specified value to the {@code level_x} field. */
        public ExrDeepTileSampleInfo.Buffer level_x(@NativeType("int32_t") int value) { ExrDeepTileSampleInfo.nlevel_x(address(), value); return this; }
        /** Sets the specified value to the {@code level_y} field. */
        public ExrDeepTileSampleInfo.Buffer level_y(@NativeType("int32_t") int value) { ExrDeepTileSampleInfo.nlevel_y(address(), value); return this; }
        /** Sets the specified value to the {@code width} field. */
        public ExrDeepTileSampleInfo.Buffer width(@NativeType("int32_t") int value) { ExrDeepTileSampleInfo.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code height} field. */
        public ExrDeepTileSampleInfo.Buffer height(@NativeType("int32_t") int value) { ExrDeepTileSampleInfo.nheight(address(), value); return this; }
        /** Sets the specified value to the {@code total_samples} field. */
        public ExrDeepTileSampleInfo.Buffer total_samples(@NativeType("uint64_t") long value) { ExrDeepTileSampleInfo.ntotal_samples(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code sample_counts} field. */
        public ExrDeepTileSampleInfo.Buffer sample_counts(@NativeType("uint32_t *") IntBuffer value) { ExrDeepTileSampleInfo.nsample_counts(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code sample_offsets} field. */
        public ExrDeepTileSampleInfo.Buffer sample_offsets(@NativeType("uint64_t *") LongBuffer value) { ExrDeepTileSampleInfo.nsample_offsets(address(), value); return this; }

    }

}