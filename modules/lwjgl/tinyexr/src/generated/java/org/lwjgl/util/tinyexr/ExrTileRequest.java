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
 * struct ExrTileRequest {
 *     ExrPart part;
 *     int32_t tile_x;
 *     int32_t tile_y;
 *     int32_t level_x;
 *     int32_t level_y;
 *     {@link ExrBuffer ExrBuffer} output;
 *     uint32_t channels_mask;
 *     uint32_t output_pixel_type;
 *     uint32_t output_layout;
 * }</code></pre>
 */
public class ExrTileRequest extends Struct<ExrTileRequest> implements NativeResource {

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
        OUTPUT,
        CHANNELS_MASK,
        OUTPUT_PIXEL_TYPE,
        OUTPUT_LAYOUT;

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
        OUTPUT = layout.offsetof(5);
        CHANNELS_MASK = layout.offsetof(6);
        OUTPUT_PIXEL_TYPE = layout.offsetof(7);
        OUTPUT_LAYOUT = layout.offsetof(8);
    }

    protected ExrTileRequest(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ExrTileRequest create(long address, @Nullable ByteBuffer container) {
        return new ExrTileRequest(address, container);
    }

    /**
     * Creates a {@code ExrTileRequest} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ExrTileRequest(ByteBuffer container) {
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
    /** @return a {@link ExrBuffer} view of the {@code output} field. */
    public ExrBuffer output() { return noutput(address()); }
    /** @return the value of the {@code channels_mask} field. */
    @NativeType("uint32_t")
    public int channels_mask() { return nchannels_mask(address()); }
    /** @return the value of the {@code output_pixel_type} field. */
    @NativeType("uint32_t")
    public int output_pixel_type() { return noutput_pixel_type(address()); }
    /** @return the value of the {@code output_layout} field. */
    @NativeType("uint32_t")
    public int output_layout() { return noutput_layout(address()); }

    /** Sets the specified value to the {@code part} field. */
    public ExrTileRequest part(@NativeType("ExrPart") long value) { npart(address(), value); return this; }
    /** Sets the specified value to the {@code tile_x} field. */
    public ExrTileRequest tile_x(@NativeType("int32_t") int value) { ntile_x(address(), value); return this; }
    /** Sets the specified value to the {@code tile_y} field. */
    public ExrTileRequest tile_y(@NativeType("int32_t") int value) { ntile_y(address(), value); return this; }
    /** Sets the specified value to the {@code level_x} field. */
    public ExrTileRequest level_x(@NativeType("int32_t") int value) { nlevel_x(address(), value); return this; }
    /** Sets the specified value to the {@code level_y} field. */
    public ExrTileRequest level_y(@NativeType("int32_t") int value) { nlevel_y(address(), value); return this; }
    /** Copies the specified {@link ExrBuffer} to the {@code output} field. */
    public ExrTileRequest output(ExrBuffer value) { noutput(address(), value); return this; }
    /** Passes the {@code output} field to the specified {@link java.util.function.Consumer Consumer}. */
    public ExrTileRequest output(java.util.function.Consumer<ExrBuffer> consumer) { consumer.accept(output()); return this; }
    /** Sets the specified value to the {@code channels_mask} field. */
    public ExrTileRequest channels_mask(@NativeType("uint32_t") int value) { nchannels_mask(address(), value); return this; }
    /** Sets the specified value to the {@code output_pixel_type} field. */
    public ExrTileRequest output_pixel_type(@NativeType("uint32_t") int value) { noutput_pixel_type(address(), value); return this; }
    /** Sets the specified value to the {@code output_layout} field. */
    public ExrTileRequest output_layout(@NativeType("uint32_t") int value) { noutput_layout(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ExrTileRequest set(
        long part,
        int tile_x,
        int tile_y,
        int level_x,
        int level_y,
        ExrBuffer output,
        int channels_mask,
        int output_pixel_type,
        int output_layout
    ) {
        part(part);
        tile_x(tile_x);
        tile_y(tile_y);
        level_x(level_x);
        level_y(level_y);
        output(output);
        channels_mask(channels_mask);
        output_pixel_type(output_pixel_type);
        output_layout(output_layout);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ExrTileRequest set(ExrTileRequest src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ExrTileRequest} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ExrTileRequest malloc() {
        return new ExrTileRequest(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ExrTileRequest} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ExrTileRequest calloc() {
        return new ExrTileRequest(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ExrTileRequest} instance allocated with {@link BufferUtils}. */
    public static ExrTileRequest create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ExrTileRequest(memAddress(container), container);
    }

    /** Returns a new {@code ExrTileRequest} instance for the specified memory address. */
    public static ExrTileRequest create(long address) {
        return new ExrTileRequest(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ExrTileRequest createSafe(long address) {
        return address == NULL ? null : new ExrTileRequest(address, null);
    }

    /**
     * Returns a new {@link ExrTileRequest.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrTileRequest.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ExrTileRequest.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrTileRequest.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrTileRequest.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ExrTileRequest.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ExrTileRequest.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ExrTileRequest.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ExrTileRequest.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ExrTileRequest} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrTileRequest malloc(MemoryStack stack) {
        return new ExrTileRequest(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ExrTileRequest} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrTileRequest calloc(MemoryStack stack) {
        return new ExrTileRequest(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ExrTileRequest.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrTileRequest.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrTileRequest.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrTileRequest.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #part}. */
    public static long npart(long struct) { return memGetAddress(struct + ExrTileRequest.PART); }
    /** Unsafe version of {@link #tile_x}. */
    public static int ntile_x(long struct) { return memGetInt(struct + ExrTileRequest.TILE_X); }
    /** Unsafe version of {@link #tile_y}. */
    public static int ntile_y(long struct) { return memGetInt(struct + ExrTileRequest.TILE_Y); }
    /** Unsafe version of {@link #level_x}. */
    public static int nlevel_x(long struct) { return memGetInt(struct + ExrTileRequest.LEVEL_X); }
    /** Unsafe version of {@link #level_y}. */
    public static int nlevel_y(long struct) { return memGetInt(struct + ExrTileRequest.LEVEL_Y); }
    /** Unsafe version of {@link #output}. */
    public static ExrBuffer noutput(long struct) { return ExrBuffer.create(struct + ExrTileRequest.OUTPUT); }
    /** Unsafe version of {@link #channels_mask}. */
    public static int nchannels_mask(long struct) { return memGetInt(struct + ExrTileRequest.CHANNELS_MASK); }
    /** Unsafe version of {@link #output_pixel_type}. */
    public static int noutput_pixel_type(long struct) { return memGetInt(struct + ExrTileRequest.OUTPUT_PIXEL_TYPE); }
    /** Unsafe version of {@link #output_layout}. */
    public static int noutput_layout(long struct) { return memGetInt(struct + ExrTileRequest.OUTPUT_LAYOUT); }

    /** Unsafe version of {@link #part(long) part}. */
    public static void npart(long struct, long value) { memPutAddress(struct + ExrTileRequest.PART, check(value)); }
    /** Unsafe version of {@link #tile_x(int) tile_x}. */
    public static void ntile_x(long struct, int value) { memPutInt(struct + ExrTileRequest.TILE_X, value); }
    /** Unsafe version of {@link #tile_y(int) tile_y}. */
    public static void ntile_y(long struct, int value) { memPutInt(struct + ExrTileRequest.TILE_Y, value); }
    /** Unsafe version of {@link #level_x(int) level_x}. */
    public static void nlevel_x(long struct, int value) { memPutInt(struct + ExrTileRequest.LEVEL_X, value); }
    /** Unsafe version of {@link #level_y(int) level_y}. */
    public static void nlevel_y(long struct, int value) { memPutInt(struct + ExrTileRequest.LEVEL_Y, value); }
    /** Unsafe version of {@link #output(ExrBuffer) output}. */
    public static void noutput(long struct, ExrBuffer value) { memCopy(value.address(), struct + ExrTileRequest.OUTPUT, ExrBuffer.SIZEOF); }
    /** Unsafe version of {@link #channels_mask(int) channels_mask}. */
    public static void nchannels_mask(long struct, int value) { memPutInt(struct + ExrTileRequest.CHANNELS_MASK, value); }
    /** Unsafe version of {@link #output_pixel_type(int) output_pixel_type}. */
    public static void noutput_pixel_type(long struct, int value) { memPutInt(struct + ExrTileRequest.OUTPUT_PIXEL_TYPE, value); }
    /** Unsafe version of {@link #output_layout(int) output_layout}. */
    public static void noutput_layout(long struct, int value) { memPutInt(struct + ExrTileRequest.OUTPUT_LAYOUT, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + ExrTileRequest.PART));
        ExrBuffer.validate(struct + ExrTileRequest.OUTPUT);
    }

    // -----------------------------------

    /** An array of {@link ExrTileRequest} structs. */
    public static class Buffer extends StructBuffer<ExrTileRequest, Buffer> implements NativeResource {

        private static final ExrTileRequest ELEMENT_FACTORY = ExrTileRequest.create(-1L);

        /**
         * Creates a new {@code ExrTileRequest.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ExrTileRequest#SIZEOF}, and its mark will be undefined.</p>
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
        protected ExrTileRequest getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code part} field. */
        @NativeType("ExrPart")
        public long part() { return ExrTileRequest.npart(address()); }
        /** @return the value of the {@code tile_x} field. */
        @NativeType("int32_t")
        public int tile_x() { return ExrTileRequest.ntile_x(address()); }
        /** @return the value of the {@code tile_y} field. */
        @NativeType("int32_t")
        public int tile_y() { return ExrTileRequest.ntile_y(address()); }
        /** @return the value of the {@code level_x} field. */
        @NativeType("int32_t")
        public int level_x() { return ExrTileRequest.nlevel_x(address()); }
        /** @return the value of the {@code level_y} field. */
        @NativeType("int32_t")
        public int level_y() { return ExrTileRequest.nlevel_y(address()); }
        /** @return a {@link ExrBuffer} view of the {@code output} field. */
        public ExrBuffer output() { return ExrTileRequest.noutput(address()); }
        /** @return the value of the {@code channels_mask} field. */
        @NativeType("uint32_t")
        public int channels_mask() { return ExrTileRequest.nchannels_mask(address()); }
        /** @return the value of the {@code output_pixel_type} field. */
        @NativeType("uint32_t")
        public int output_pixel_type() { return ExrTileRequest.noutput_pixel_type(address()); }
        /** @return the value of the {@code output_layout} field. */
        @NativeType("uint32_t")
        public int output_layout() { return ExrTileRequest.noutput_layout(address()); }

        /** Sets the specified value to the {@code part} field. */
        public ExrTileRequest.Buffer part(@NativeType("ExrPart") long value) { ExrTileRequest.npart(address(), value); return this; }
        /** Sets the specified value to the {@code tile_x} field. */
        public ExrTileRequest.Buffer tile_x(@NativeType("int32_t") int value) { ExrTileRequest.ntile_x(address(), value); return this; }
        /** Sets the specified value to the {@code tile_y} field. */
        public ExrTileRequest.Buffer tile_y(@NativeType("int32_t") int value) { ExrTileRequest.ntile_y(address(), value); return this; }
        /** Sets the specified value to the {@code level_x} field. */
        public ExrTileRequest.Buffer level_x(@NativeType("int32_t") int value) { ExrTileRequest.nlevel_x(address(), value); return this; }
        /** Sets the specified value to the {@code level_y} field. */
        public ExrTileRequest.Buffer level_y(@NativeType("int32_t") int value) { ExrTileRequest.nlevel_y(address(), value); return this; }
        /** Copies the specified {@link ExrBuffer} to the {@code output} field. */
        public ExrTileRequest.Buffer output(ExrBuffer value) { ExrTileRequest.noutput(address(), value); return this; }
        /** Passes the {@code output} field to the specified {@link java.util.function.Consumer Consumer}. */
        public ExrTileRequest.Buffer output(java.util.function.Consumer<ExrBuffer> consumer) { consumer.accept(output()); return this; }
        /** Sets the specified value to the {@code channels_mask} field. */
        public ExrTileRequest.Buffer channels_mask(@NativeType("uint32_t") int value) { ExrTileRequest.nchannels_mask(address(), value); return this; }
        /** Sets the specified value to the {@code output_pixel_type} field. */
        public ExrTileRequest.Buffer output_pixel_type(@NativeType("uint32_t") int value) { ExrTileRequest.noutput_pixel_type(address(), value); return this; }
        /** Sets the specified value to the {@code output_layout} field. */
        public ExrTileRequest.Buffer output_layout(@NativeType("uint32_t") int value) { ExrTileRequest.noutput_layout(address(), value); return this; }

    }

}