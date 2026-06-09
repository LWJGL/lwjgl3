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
 * struct ExrDeepTileRequest {
 *     ExrPart part;
 *     int32_t tile_x;
 *     int32_t tile_y;
 *     int32_t level_x;
 *     int32_t level_y;
 *     {@link ExrDeepTileSampleInfo ExrDeepTileSampleInfo} * sample_info;
 *     {@link ExrBuffer ExrBuffer} output;
 *     uint32_t channels_mask;
 *     uint32_t output_pixel_type;
 * }</code></pre>
 */
public class ExrDeepTileRequest extends Struct<ExrDeepTileRequest> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PART,
        TILE_X,
        TILE_Y,
        LEVEL_X,
        LEVEL_Y,
        SAMPLE_INFO,
        OUTPUT,
        CHANNELS_MASK,
        OUTPUT_PIXEL_TYPE;

    static {
        ExrBuffer.createSafe(NULL);

        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(ExrBuffer.SIZEOF, ExrBuffer.ALIGNOF),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PART = layout.offsetof(0);
        TILE_X = layout.offsetof(1);
        TILE_Y = layout.offsetof(2);
        LEVEL_X = layout.offsetof(3);
        LEVEL_Y = layout.offsetof(4);
        SAMPLE_INFO = layout.offsetof(5);
        OUTPUT = layout.offsetof(6);
        CHANNELS_MASK = layout.offsetof(7);
        OUTPUT_PIXEL_TYPE = layout.offsetof(8);
    }

    protected ExrDeepTileRequest(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ExrDeepTileRequest create(long address, @Nullable ByteBuffer container) {
        return new ExrDeepTileRequest(address, container);
    }

    /**
     * Creates a {@code ExrDeepTileRequest} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ExrDeepTileRequest(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code part} field. */
    @NativeType("ExrPart")
    public long part() { return npart(address()); }
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
    /** @return a {@link ExrDeepTileSampleInfo} view of the struct pointed to by the {@code sample_info} field. */
    @NativeType("ExrDeepTileSampleInfo *")
    public ExrDeepTileSampleInfo sample_info() { return nsample_info(address()); }
    /** @return a {@link ExrBuffer} view of the {@code output} field. */
    public ExrBuffer output() { return noutput(address()); }
    /** @return the value of the {@code channels_mask} field. */
    @NativeType("uint32_t")
    public int channels_mask() { return nchannels_mask(address()); }
    /** @return the value of the {@code output_pixel_type} field. */
    @NativeType("uint32_t")
    public int output_pixel_type() { return noutput_pixel_type(address()); }

    /** Sets the specified value to the {@code part} field. */
    public ExrDeepTileRequest part(@NativeType("ExrPart") long value) { npart(address(), value); return this; }
    /** Sets the specified value to the {@code tile_x} field. */
    public ExrDeepTileRequest tile_x(@NativeType("int32_t") int value) { ntile_x(address(), value); return this; }
    /** Sets the specified value to the {@code tile_y} field. */
    public ExrDeepTileRequest tile_y(@NativeType("int32_t") int value) { ntile_y(address(), value); return this; }
    /** Sets the specified value to the {@code level_x} field. */
    public ExrDeepTileRequest level_x(@NativeType("int32_t") int value) { nlevel_x(address(), value); return this; }
    /** Sets the specified value to the {@code level_y} field. */
    public ExrDeepTileRequest level_y(@NativeType("int32_t") int value) { nlevel_y(address(), value); return this; }
    /** Sets the address of the specified {@link ExrDeepTileSampleInfo} to the {@code sample_info} field. */
    public ExrDeepTileRequest sample_info(@NativeType("ExrDeepTileSampleInfo *") ExrDeepTileSampleInfo value) { nsample_info(address(), value); return this; }
    /** Copies the specified {@link ExrBuffer} to the {@code output} field. */
    public ExrDeepTileRequest output(ExrBuffer value) { noutput(address(), value); return this; }
    /** Passes the {@code output} field to the specified {@link java.util.function.Consumer Consumer}. */
    public ExrDeepTileRequest output(java.util.function.Consumer<ExrBuffer> consumer) { consumer.accept(output()); return this; }
    /** Sets the specified value to the {@code channels_mask} field. */
    public ExrDeepTileRequest channels_mask(@NativeType("uint32_t") int value) { nchannels_mask(address(), value); return this; }
    /** Sets the specified value to the {@code output_pixel_type} field. */
    public ExrDeepTileRequest output_pixel_type(@NativeType("uint32_t") int value) { noutput_pixel_type(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ExrDeepTileRequest set(
        long part,
        int tile_x,
        int tile_y,
        int level_x,
        int level_y,
        ExrDeepTileSampleInfo sample_info,
        ExrBuffer output,
        int channels_mask,
        int output_pixel_type
    ) {
        part(part);
        tile_x(tile_x);
        tile_y(tile_y);
        level_x(level_x);
        level_y(level_y);
        sample_info(sample_info);
        output(output);
        channels_mask(channels_mask);
        output_pixel_type(output_pixel_type);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ExrDeepTileRequest set(ExrDeepTileRequest src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ExrDeepTileRequest} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ExrDeepTileRequest malloc() {
        return new ExrDeepTileRequest(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ExrDeepTileRequest} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ExrDeepTileRequest calloc() {
        return new ExrDeepTileRequest(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ExrDeepTileRequest} instance allocated with {@link BufferUtils}. */
    public static ExrDeepTileRequest create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ExrDeepTileRequest(memAddress(container), container);
    }

    /** Returns a new {@code ExrDeepTileRequest} instance for the specified memory address. */
    public static ExrDeepTileRequest create(long address) {
        return new ExrDeepTileRequest(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ExrDeepTileRequest createSafe(long address) {
        return address == NULL ? null : new ExrDeepTileRequest(address, null);
    }

    /**
     * Returns a new {@link ExrDeepTileRequest.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrDeepTileRequest.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ExrDeepTileRequest.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrDeepTileRequest.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrDeepTileRequest.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ExrDeepTileRequest.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ExrDeepTileRequest.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ExrDeepTileRequest.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ExrDeepTileRequest.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ExrDeepTileRequest} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrDeepTileRequest malloc(MemoryStack stack) {
        return new ExrDeepTileRequest(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ExrDeepTileRequest} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrDeepTileRequest calloc(MemoryStack stack) {
        return new ExrDeepTileRequest(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ExrDeepTileRequest.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrDeepTileRequest.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrDeepTileRequest.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrDeepTileRequest.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #part}. */
    public static long npart(long struct) { return memGetAddress(struct + ExrDeepTileRequest.PART); }
    /** Unsafe version of {@link #tile_x}. */
    public static int ntile_x(long struct) { return memGetInt(struct + ExrDeepTileRequest.TILE_X); }
    /** Unsafe version of {@link #tile_y}. */
    public static int ntile_y(long struct) { return memGetInt(struct + ExrDeepTileRequest.TILE_Y); }
    /** Unsafe version of {@link #level_x}. */
    public static int nlevel_x(long struct) { return memGetInt(struct + ExrDeepTileRequest.LEVEL_X); }
    /** Unsafe version of {@link #level_y}. */
    public static int nlevel_y(long struct) { return memGetInt(struct + ExrDeepTileRequest.LEVEL_Y); }
    /** Unsafe version of {@link #sample_info}. */
    public static ExrDeepTileSampleInfo nsample_info(long struct) { return ExrDeepTileSampleInfo.create(memGetAddress(struct + ExrDeepTileRequest.SAMPLE_INFO)); }
    /** Unsafe version of {@link #output}. */
    public static ExrBuffer noutput(long struct) { return ExrBuffer.create(struct + ExrDeepTileRequest.OUTPUT); }
    /** Unsafe version of {@link #channels_mask}. */
    public static int nchannels_mask(long struct) { return memGetInt(struct + ExrDeepTileRequest.CHANNELS_MASK); }
    /** Unsafe version of {@link #output_pixel_type}. */
    public static int noutput_pixel_type(long struct) { return memGetInt(struct + ExrDeepTileRequest.OUTPUT_PIXEL_TYPE); }

    /** Unsafe version of {@link #part(long) part}. */
    public static void npart(long struct, long value) { memPutAddress(struct + ExrDeepTileRequest.PART, check(value)); }
    /** Unsafe version of {@link #tile_x(int) tile_x}. */
    public static void ntile_x(long struct, int value) { memPutInt(struct + ExrDeepTileRequest.TILE_X, value); }
    /** Unsafe version of {@link #tile_y(int) tile_y}. */
    public static void ntile_y(long struct, int value) { memPutInt(struct + ExrDeepTileRequest.TILE_Y, value); }
    /** Unsafe version of {@link #level_x(int) level_x}. */
    public static void nlevel_x(long struct, int value) { memPutInt(struct + ExrDeepTileRequest.LEVEL_X, value); }
    /** Unsafe version of {@link #level_y(int) level_y}. */
    public static void nlevel_y(long struct, int value) { memPutInt(struct + ExrDeepTileRequest.LEVEL_Y, value); }
    /** Unsafe version of {@link #sample_info(ExrDeepTileSampleInfo) sample_info}. */
    public static void nsample_info(long struct, ExrDeepTileSampleInfo value) { memPutAddress(struct + ExrDeepTileRequest.SAMPLE_INFO, value.address()); }
    /** Unsafe version of {@link #output(ExrBuffer) output}. */
    public static void noutput(long struct, ExrBuffer value) { memCopy(value.address(), struct + ExrDeepTileRequest.OUTPUT, ExrBuffer.SIZEOF); }
    /** Unsafe version of {@link #channels_mask(int) channels_mask}. */
    public static void nchannels_mask(long struct, int value) { memPutInt(struct + ExrDeepTileRequest.CHANNELS_MASK, value); }
    /** Unsafe version of {@link #output_pixel_type(int) output_pixel_type}. */
    public static void noutput_pixel_type(long struct, int value) { memPutInt(struct + ExrDeepTileRequest.OUTPUT_PIXEL_TYPE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + ExrDeepTileRequest.PART));
        long sample_info = memGetAddress(struct + ExrDeepTileRequest.SAMPLE_INFO);
        check(sample_info);
        ExrDeepTileSampleInfo.validate(sample_info);
        ExrBuffer.validate(struct + ExrDeepTileRequest.OUTPUT);
    }

    // -----------------------------------

    /** An array of {@link ExrDeepTileRequest} structs. */
    public static class Buffer extends StructBuffer<ExrDeepTileRequest, Buffer> implements NativeResource {

        private static final ExrDeepTileRequest ELEMENT_FACTORY = ExrDeepTileRequest.create(-1L);

        /**
         * Creates a new {@code ExrDeepTileRequest.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ExrDeepTileRequest#SIZEOF}, and its mark will be undefined.</p>
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
        protected ExrDeepTileRequest getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code part} field. */
        @NativeType("ExrPart")
        public long part() { return ExrDeepTileRequest.npart(address()); }
        /** @return the value of the {@code tile_x} field. */
        @NativeType("int32_t")
        public int tile_x() { return ExrDeepTileRequest.ntile_x(address()); }
        /** @return the value of the {@code tile_y} field. */
        @NativeType("int32_t")
        public int tile_y() { return ExrDeepTileRequest.ntile_y(address()); }
        /** @return the value of the {@code level_x} field. */
        @NativeType("int32_t")
        public int level_x() { return ExrDeepTileRequest.nlevel_x(address()); }
        /** @return the value of the {@code level_y} field. */
        @NativeType("int32_t")
        public int level_y() { return ExrDeepTileRequest.nlevel_y(address()); }
        /** @return a {@link ExrDeepTileSampleInfo} view of the struct pointed to by the {@code sample_info} field. */
        @NativeType("ExrDeepTileSampleInfo *")
        public ExrDeepTileSampleInfo sample_info() { return ExrDeepTileRequest.nsample_info(address()); }
        /** @return a {@link ExrBuffer} view of the {@code output} field. */
        public ExrBuffer output() { return ExrDeepTileRequest.noutput(address()); }
        /** @return the value of the {@code channels_mask} field. */
        @NativeType("uint32_t")
        public int channels_mask() { return ExrDeepTileRequest.nchannels_mask(address()); }
        /** @return the value of the {@code output_pixel_type} field. */
        @NativeType("uint32_t")
        public int output_pixel_type() { return ExrDeepTileRequest.noutput_pixel_type(address()); }

        /** Sets the specified value to the {@code part} field. */
        public ExrDeepTileRequest.Buffer part(@NativeType("ExrPart") long value) { ExrDeepTileRequest.npart(address(), value); return this; }
        /** Sets the specified value to the {@code tile_x} field. */
        public ExrDeepTileRequest.Buffer tile_x(@NativeType("int32_t") int value) { ExrDeepTileRequest.ntile_x(address(), value); return this; }
        /** Sets the specified value to the {@code tile_y} field. */
        public ExrDeepTileRequest.Buffer tile_y(@NativeType("int32_t") int value) { ExrDeepTileRequest.ntile_y(address(), value); return this; }
        /** Sets the specified value to the {@code level_x} field. */
        public ExrDeepTileRequest.Buffer level_x(@NativeType("int32_t") int value) { ExrDeepTileRequest.nlevel_x(address(), value); return this; }
        /** Sets the specified value to the {@code level_y} field. */
        public ExrDeepTileRequest.Buffer level_y(@NativeType("int32_t") int value) { ExrDeepTileRequest.nlevel_y(address(), value); return this; }
        /** Sets the address of the specified {@link ExrDeepTileSampleInfo} to the {@code sample_info} field. */
        public ExrDeepTileRequest.Buffer sample_info(@NativeType("ExrDeepTileSampleInfo *") ExrDeepTileSampleInfo value) { ExrDeepTileRequest.nsample_info(address(), value); return this; }
        /** Copies the specified {@link ExrBuffer} to the {@code output} field. */
        public ExrDeepTileRequest.Buffer output(ExrBuffer value) { ExrDeepTileRequest.noutput(address(), value); return this; }
        /** Passes the {@code output} field to the specified {@link java.util.function.Consumer Consumer}. */
        public ExrDeepTileRequest.Buffer output(java.util.function.Consumer<ExrBuffer> consumer) { consumer.accept(output()); return this; }
        /** Sets the specified value to the {@code channels_mask} field. */
        public ExrDeepTileRequest.Buffer channels_mask(@NativeType("uint32_t") int value) { ExrDeepTileRequest.nchannels_mask(address(), value); return this; }
        /** Sets the specified value to the {@code output_pixel_type} field. */
        public ExrDeepTileRequest.Buffer output_pixel_type(@NativeType("uint32_t") int value) { ExrDeepTileRequest.noutput_pixel_type(address(), value); return this; }

    }

}