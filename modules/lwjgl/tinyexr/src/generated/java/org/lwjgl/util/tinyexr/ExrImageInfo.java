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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct ExrImageInfo {
 *     int32_t width;
 *     int32_t height;
 *     {@link ExrBox2i ExrBox2i} data_window;
 *     {@link ExrBox2i ExrBox2i} display_window;
 *     uint32_t num_channels;
 *     uint32_t num_parts;
 *     uint32_t compression;
 *     uint32_t flags;
 *     uint32_t tile_size_x;
 *     uint32_t tile_size_y;
 *     uint32_t num_x_levels;
 *     uint32_t num_y_levels;
 *     float pixel_aspect_ratio;
 *     {@link ExrVec2f ExrVec2f} screen_window_center;
 *     float screen_window_width;
 * }</code></pre>
 */
public class ExrImageInfo extends Struct<ExrImageInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        WIDTH,
        HEIGHT,
        DATA_WINDOW,
        DISPLAY_WINDOW,
        NUM_CHANNELS,
        NUM_PARTS,
        COMPRESSION,
        FLAGS,
        TILE_SIZE_X,
        TILE_SIZE_Y,
        NUM_X_LEVELS,
        NUM_Y_LEVELS,
        PIXEL_ASPECT_RATIO,
        SCREEN_WINDOW_CENTER,
        SCREEN_WINDOW_WIDTH;

    static {
        ExrBox2i.createSafe(NULL);
        ExrVec2f.createSafe(NULL);

        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(ExrBox2i.SIZEOF, ExrBox2i.ALIGNOF),
            __member(ExrBox2i.SIZEOF, ExrBox2i.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(ExrVec2f.SIZEOF, ExrVec2f.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        WIDTH = layout.offsetof(0);
        HEIGHT = layout.offsetof(1);
        DATA_WINDOW = layout.offsetof(2);
        DISPLAY_WINDOW = layout.offsetof(3);
        NUM_CHANNELS = layout.offsetof(4);
        NUM_PARTS = layout.offsetof(5);
        COMPRESSION = layout.offsetof(6);
        FLAGS = layout.offsetof(7);
        TILE_SIZE_X = layout.offsetof(8);
        TILE_SIZE_Y = layout.offsetof(9);
        NUM_X_LEVELS = layout.offsetof(10);
        NUM_Y_LEVELS = layout.offsetof(11);
        PIXEL_ASPECT_RATIO = layout.offsetof(12);
        SCREEN_WINDOW_CENTER = layout.offsetof(13);
        SCREEN_WINDOW_WIDTH = layout.offsetof(14);
    }

    protected ExrImageInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ExrImageInfo create(long address, @Nullable ByteBuffer container) {
        return new ExrImageInfo(address, container);
    }

    /**
     * Creates a {@code ExrImageInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ExrImageInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code width} field. */
    @NativeType("int32_t")
    public int width() { return nwidth(address()); }
    /** @return the value of the {@code height} field. */
    @NativeType("int32_t")
    public int height() { return nheight(address()); }
    /** @return a {@link ExrBox2i} view of the {@code data_window} field. */
    public ExrBox2i data_window() { return ndata_window(address()); }
    /** @return a {@link ExrBox2i} view of the {@code display_window} field. */
    public ExrBox2i display_window() { return ndisplay_window(address()); }
    /** @return the value of the {@code num_channels} field. */
    @NativeType("uint32_t")
    public int num_channels() { return nnum_channels(address()); }
    /** @return the value of the {@code num_parts} field. */
    @NativeType("uint32_t")
    public int num_parts() { return nnum_parts(address()); }
    /** @return the value of the {@code compression} field. */
    @NativeType("uint32_t")
    public int compression() { return ncompression(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("uint32_t")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code tile_size_x} field. */
    @NativeType("uint32_t")
    public int tile_size_x() { return ntile_size_x(address()); }
    /** @return the value of the {@code tile_size_y} field. */
    @NativeType("uint32_t")
    public int tile_size_y() { return ntile_size_y(address()); }
    /** @return the value of the {@code num_x_levels} field. */
    @NativeType("uint32_t")
    public int num_x_levels() { return nnum_x_levels(address()); }
    /** @return the value of the {@code num_y_levels} field. */
    @NativeType("uint32_t")
    public int num_y_levels() { return nnum_y_levels(address()); }
    /** @return the value of the {@code pixel_aspect_ratio} field. */
    public float pixel_aspect_ratio() { return npixel_aspect_ratio(address()); }
    /** @return a {@link ExrVec2f} view of the {@code screen_window_center} field. */
    public ExrVec2f screen_window_center() { return nscreen_window_center(address()); }
    /** @return the value of the {@code screen_window_width} field. */
    public float screen_window_width() { return nscreen_window_width(address()); }

    /** Sets the specified value to the {@code width} field. */
    public ExrImageInfo width(@NativeType("int32_t") int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    public ExrImageInfo height(@NativeType("int32_t") int value) { nheight(address(), value); return this; }
    /** Copies the specified {@link ExrBox2i} to the {@code data_window} field. */
    public ExrImageInfo data_window(ExrBox2i value) { ndata_window(address(), value); return this; }
    /** Passes the {@code data_window} field to the specified {@link java.util.function.Consumer Consumer}. */
    public ExrImageInfo data_window(java.util.function.Consumer<ExrBox2i> consumer) { consumer.accept(data_window()); return this; }
    /** Copies the specified {@link ExrBox2i} to the {@code display_window} field. */
    public ExrImageInfo display_window(ExrBox2i value) { ndisplay_window(address(), value); return this; }
    /** Passes the {@code display_window} field to the specified {@link java.util.function.Consumer Consumer}. */
    public ExrImageInfo display_window(java.util.function.Consumer<ExrBox2i> consumer) { consumer.accept(display_window()); return this; }
    /** Sets the specified value to the {@code num_channels} field. */
    public ExrImageInfo num_channels(@NativeType("uint32_t") int value) { nnum_channels(address(), value); return this; }
    /** Sets the specified value to the {@code num_parts} field. */
    public ExrImageInfo num_parts(@NativeType("uint32_t") int value) { nnum_parts(address(), value); return this; }
    /** Sets the specified value to the {@code compression} field. */
    public ExrImageInfo compression(@NativeType("uint32_t") int value) { ncompression(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public ExrImageInfo flags(@NativeType("uint32_t") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code tile_size_x} field. */
    public ExrImageInfo tile_size_x(@NativeType("uint32_t") int value) { ntile_size_x(address(), value); return this; }
    /** Sets the specified value to the {@code tile_size_y} field. */
    public ExrImageInfo tile_size_y(@NativeType("uint32_t") int value) { ntile_size_y(address(), value); return this; }
    /** Sets the specified value to the {@code num_x_levels} field. */
    public ExrImageInfo num_x_levels(@NativeType("uint32_t") int value) { nnum_x_levels(address(), value); return this; }
    /** Sets the specified value to the {@code num_y_levels} field. */
    public ExrImageInfo num_y_levels(@NativeType("uint32_t") int value) { nnum_y_levels(address(), value); return this; }
    /** Sets the specified value to the {@code pixel_aspect_ratio} field. */
    public ExrImageInfo pixel_aspect_ratio(float value) { npixel_aspect_ratio(address(), value); return this; }
    /** Copies the specified {@link ExrVec2f} to the {@code screen_window_center} field. */
    public ExrImageInfo screen_window_center(ExrVec2f value) { nscreen_window_center(address(), value); return this; }
    /** Passes the {@code screen_window_center} field to the specified {@link java.util.function.Consumer Consumer}. */
    public ExrImageInfo screen_window_center(java.util.function.Consumer<ExrVec2f> consumer) { consumer.accept(screen_window_center()); return this; }
    /** Sets the specified value to the {@code screen_window_width} field. */
    public ExrImageInfo screen_window_width(float value) { nscreen_window_width(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ExrImageInfo set(
        int width,
        int height,
        ExrBox2i data_window,
        ExrBox2i display_window,
        int num_channels,
        int num_parts,
        int compression,
        int flags,
        int tile_size_x,
        int tile_size_y,
        int num_x_levels,
        int num_y_levels,
        float pixel_aspect_ratio,
        ExrVec2f screen_window_center,
        float screen_window_width
    ) {
        width(width);
        height(height);
        data_window(data_window);
        display_window(display_window);
        num_channels(num_channels);
        num_parts(num_parts);
        compression(compression);
        flags(flags);
        tile_size_x(tile_size_x);
        tile_size_y(tile_size_y);
        num_x_levels(num_x_levels);
        num_y_levels(num_y_levels);
        pixel_aspect_ratio(pixel_aspect_ratio);
        screen_window_center(screen_window_center);
        screen_window_width(screen_window_width);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ExrImageInfo set(ExrImageInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ExrImageInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ExrImageInfo malloc() {
        return new ExrImageInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ExrImageInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ExrImageInfo calloc() {
        return new ExrImageInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ExrImageInfo} instance allocated with {@link BufferUtils}. */
    public static ExrImageInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ExrImageInfo(memAddress(container), container);
    }

    /** Returns a new {@code ExrImageInfo} instance for the specified memory address. */
    public static ExrImageInfo create(long address) {
        return new ExrImageInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ExrImageInfo createSafe(long address) {
        return address == NULL ? null : new ExrImageInfo(address, null);
    }

    /**
     * Returns a new {@link ExrImageInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrImageInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ExrImageInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrImageInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrImageInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ExrImageInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ExrImageInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ExrImageInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ExrImageInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ExrImageInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrImageInfo malloc(MemoryStack stack) {
        return new ExrImageInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ExrImageInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrImageInfo calloc(MemoryStack stack) {
        return new ExrImageInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ExrImageInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrImageInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrImageInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrImageInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return memGetInt(struct + ExrImageInfo.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return memGetInt(struct + ExrImageInfo.HEIGHT); }
    /** Unsafe version of {@link #data_window}. */
    public static ExrBox2i ndata_window(long struct) { return ExrBox2i.create(struct + ExrImageInfo.DATA_WINDOW); }
    /** Unsafe version of {@link #display_window}. */
    public static ExrBox2i ndisplay_window(long struct) { return ExrBox2i.create(struct + ExrImageInfo.DISPLAY_WINDOW); }
    /** Unsafe version of {@link #num_channels}. */
    public static int nnum_channels(long struct) { return memGetInt(struct + ExrImageInfo.NUM_CHANNELS); }
    /** Unsafe version of {@link #num_parts}. */
    public static int nnum_parts(long struct) { return memGetInt(struct + ExrImageInfo.NUM_PARTS); }
    /** Unsafe version of {@link #compression}. */
    public static int ncompression(long struct) { return memGetInt(struct + ExrImageInfo.COMPRESSION); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + ExrImageInfo.FLAGS); }
    /** Unsafe version of {@link #tile_size_x}. */
    public static int ntile_size_x(long struct) { return memGetInt(struct + ExrImageInfo.TILE_SIZE_X); }
    /** Unsafe version of {@link #tile_size_y}. */
    public static int ntile_size_y(long struct) { return memGetInt(struct + ExrImageInfo.TILE_SIZE_Y); }
    /** Unsafe version of {@link #num_x_levels}. */
    public static int nnum_x_levels(long struct) { return memGetInt(struct + ExrImageInfo.NUM_X_LEVELS); }
    /** Unsafe version of {@link #num_y_levels}. */
    public static int nnum_y_levels(long struct) { return memGetInt(struct + ExrImageInfo.NUM_Y_LEVELS); }
    /** Unsafe version of {@link #pixel_aspect_ratio}. */
    public static float npixel_aspect_ratio(long struct) { return memGetFloat(struct + ExrImageInfo.PIXEL_ASPECT_RATIO); }
    /** Unsafe version of {@link #screen_window_center}. */
    public static ExrVec2f nscreen_window_center(long struct) { return ExrVec2f.create(struct + ExrImageInfo.SCREEN_WINDOW_CENTER); }
    /** Unsafe version of {@link #screen_window_width}. */
    public static float nscreen_window_width(long struct) { return memGetFloat(struct + ExrImageInfo.SCREEN_WINDOW_WIDTH); }

    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { memPutInt(struct + ExrImageInfo.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { memPutInt(struct + ExrImageInfo.HEIGHT, value); }
    /** Unsafe version of {@link #data_window(ExrBox2i) data_window}. */
    public static void ndata_window(long struct, ExrBox2i value) { memCopy(value.address(), struct + ExrImageInfo.DATA_WINDOW, ExrBox2i.SIZEOF); }
    /** Unsafe version of {@link #display_window(ExrBox2i) display_window}. */
    public static void ndisplay_window(long struct, ExrBox2i value) { memCopy(value.address(), struct + ExrImageInfo.DISPLAY_WINDOW, ExrBox2i.SIZEOF); }
    /** Unsafe version of {@link #num_channels(int) num_channels}. */
    public static void nnum_channels(long struct, int value) { memPutInt(struct + ExrImageInfo.NUM_CHANNELS, value); }
    /** Unsafe version of {@link #num_parts(int) num_parts}. */
    public static void nnum_parts(long struct, int value) { memPutInt(struct + ExrImageInfo.NUM_PARTS, value); }
    /** Unsafe version of {@link #compression(int) compression}. */
    public static void ncompression(long struct, int value) { memPutInt(struct + ExrImageInfo.COMPRESSION, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + ExrImageInfo.FLAGS, value); }
    /** Unsafe version of {@link #tile_size_x(int) tile_size_x}. */
    public static void ntile_size_x(long struct, int value) { memPutInt(struct + ExrImageInfo.TILE_SIZE_X, value); }
    /** Unsafe version of {@link #tile_size_y(int) tile_size_y}. */
    public static void ntile_size_y(long struct, int value) { memPutInt(struct + ExrImageInfo.TILE_SIZE_Y, value); }
    /** Unsafe version of {@link #num_x_levels(int) num_x_levels}. */
    public static void nnum_x_levels(long struct, int value) { memPutInt(struct + ExrImageInfo.NUM_X_LEVELS, value); }
    /** Unsafe version of {@link #num_y_levels(int) num_y_levels}. */
    public static void nnum_y_levels(long struct, int value) { memPutInt(struct + ExrImageInfo.NUM_Y_LEVELS, value); }
    /** Unsafe version of {@link #pixel_aspect_ratio(float) pixel_aspect_ratio}. */
    public static void npixel_aspect_ratio(long struct, float value) { memPutFloat(struct + ExrImageInfo.PIXEL_ASPECT_RATIO, value); }
    /** Unsafe version of {@link #screen_window_center(ExrVec2f) screen_window_center}. */
    public static void nscreen_window_center(long struct, ExrVec2f value) { memCopy(value.address(), struct + ExrImageInfo.SCREEN_WINDOW_CENTER, ExrVec2f.SIZEOF); }
    /** Unsafe version of {@link #screen_window_width(float) screen_window_width}. */
    public static void nscreen_window_width(long struct, float value) { memPutFloat(struct + ExrImageInfo.SCREEN_WINDOW_WIDTH, value); }

    // -----------------------------------

    /** An array of {@link ExrImageInfo} structs. */
    public static class Buffer extends StructBuffer<ExrImageInfo, Buffer> implements NativeResource {

        private static final ExrImageInfo ELEMENT_FACTORY = ExrImageInfo.create(-1L);

        /**
         * Creates a new {@code ExrImageInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ExrImageInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected ExrImageInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code width} field. */
        @NativeType("int32_t")
        public int width() { return ExrImageInfo.nwidth(address()); }
        /** @return the value of the {@code height} field. */
        @NativeType("int32_t")
        public int height() { return ExrImageInfo.nheight(address()); }
        /** @return a {@link ExrBox2i} view of the {@code data_window} field. */
        public ExrBox2i data_window() { return ExrImageInfo.ndata_window(address()); }
        /** @return a {@link ExrBox2i} view of the {@code display_window} field. */
        public ExrBox2i display_window() { return ExrImageInfo.ndisplay_window(address()); }
        /** @return the value of the {@code num_channels} field. */
        @NativeType("uint32_t")
        public int num_channels() { return ExrImageInfo.nnum_channels(address()); }
        /** @return the value of the {@code num_parts} field. */
        @NativeType("uint32_t")
        public int num_parts() { return ExrImageInfo.nnum_parts(address()); }
        /** @return the value of the {@code compression} field. */
        @NativeType("uint32_t")
        public int compression() { return ExrImageInfo.ncompression(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("uint32_t")
        public int flags() { return ExrImageInfo.nflags(address()); }
        /** @return the value of the {@code tile_size_x} field. */
        @NativeType("uint32_t")
        public int tile_size_x() { return ExrImageInfo.ntile_size_x(address()); }
        /** @return the value of the {@code tile_size_y} field. */
        @NativeType("uint32_t")
        public int tile_size_y() { return ExrImageInfo.ntile_size_y(address()); }
        /** @return the value of the {@code num_x_levels} field. */
        @NativeType("uint32_t")
        public int num_x_levels() { return ExrImageInfo.nnum_x_levels(address()); }
        /** @return the value of the {@code num_y_levels} field. */
        @NativeType("uint32_t")
        public int num_y_levels() { return ExrImageInfo.nnum_y_levels(address()); }
        /** @return the value of the {@code pixel_aspect_ratio} field. */
        public float pixel_aspect_ratio() { return ExrImageInfo.npixel_aspect_ratio(address()); }
        /** @return a {@link ExrVec2f} view of the {@code screen_window_center} field. */
        public ExrVec2f screen_window_center() { return ExrImageInfo.nscreen_window_center(address()); }
        /** @return the value of the {@code screen_window_width} field. */
        public float screen_window_width() { return ExrImageInfo.nscreen_window_width(address()); }

        /** Sets the specified value to the {@code width} field. */
        public ExrImageInfo.Buffer width(@NativeType("int32_t") int value) { ExrImageInfo.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code height} field. */
        public ExrImageInfo.Buffer height(@NativeType("int32_t") int value) { ExrImageInfo.nheight(address(), value); return this; }
        /** Copies the specified {@link ExrBox2i} to the {@code data_window} field. */
        public ExrImageInfo.Buffer data_window(ExrBox2i value) { ExrImageInfo.ndata_window(address(), value); return this; }
        /** Passes the {@code data_window} field to the specified {@link java.util.function.Consumer Consumer}. */
        public ExrImageInfo.Buffer data_window(java.util.function.Consumer<ExrBox2i> consumer) { consumer.accept(data_window()); return this; }
        /** Copies the specified {@link ExrBox2i} to the {@code display_window} field. */
        public ExrImageInfo.Buffer display_window(ExrBox2i value) { ExrImageInfo.ndisplay_window(address(), value); return this; }
        /** Passes the {@code display_window} field to the specified {@link java.util.function.Consumer Consumer}. */
        public ExrImageInfo.Buffer display_window(java.util.function.Consumer<ExrBox2i> consumer) { consumer.accept(display_window()); return this; }
        /** Sets the specified value to the {@code num_channels} field. */
        public ExrImageInfo.Buffer num_channels(@NativeType("uint32_t") int value) { ExrImageInfo.nnum_channels(address(), value); return this; }
        /** Sets the specified value to the {@code num_parts} field. */
        public ExrImageInfo.Buffer num_parts(@NativeType("uint32_t") int value) { ExrImageInfo.nnum_parts(address(), value); return this; }
        /** Sets the specified value to the {@code compression} field. */
        public ExrImageInfo.Buffer compression(@NativeType("uint32_t") int value) { ExrImageInfo.ncompression(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public ExrImageInfo.Buffer flags(@NativeType("uint32_t") int value) { ExrImageInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code tile_size_x} field. */
        public ExrImageInfo.Buffer tile_size_x(@NativeType("uint32_t") int value) { ExrImageInfo.ntile_size_x(address(), value); return this; }
        /** Sets the specified value to the {@code tile_size_y} field. */
        public ExrImageInfo.Buffer tile_size_y(@NativeType("uint32_t") int value) { ExrImageInfo.ntile_size_y(address(), value); return this; }
        /** Sets the specified value to the {@code num_x_levels} field. */
        public ExrImageInfo.Buffer num_x_levels(@NativeType("uint32_t") int value) { ExrImageInfo.nnum_x_levels(address(), value); return this; }
        /** Sets the specified value to the {@code num_y_levels} field. */
        public ExrImageInfo.Buffer num_y_levels(@NativeType("uint32_t") int value) { ExrImageInfo.nnum_y_levels(address(), value); return this; }
        /** Sets the specified value to the {@code pixel_aspect_ratio} field. */
        public ExrImageInfo.Buffer pixel_aspect_ratio(float value) { ExrImageInfo.npixel_aspect_ratio(address(), value); return this; }
        /** Copies the specified {@link ExrVec2f} to the {@code screen_window_center} field. */
        public ExrImageInfo.Buffer screen_window_center(ExrVec2f value) { ExrImageInfo.nscreen_window_center(address(), value); return this; }
        /** Passes the {@code screen_window_center} field to the specified {@link java.util.function.Consumer Consumer}. */
        public ExrImageInfo.Buffer screen_window_center(java.util.function.Consumer<ExrVec2f> consumer) { consumer.accept(screen_window_center()); return this; }
        /** Sets the specified value to the {@code screen_window_width} field. */
        public ExrImageInfo.Buffer screen_window_width(float value) { ExrImageInfo.nscreen_window_width(address(), value); return this; }

    }

}