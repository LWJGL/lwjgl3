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
 * struct ExrWriteImageCreateInfo {
 *     int32_t width;
 *     int32_t height;
 *     uint32_t num_channels;
 *     {@link ExrWriteChannelInfo ExrWriteChannelInfo} const * channels;
 *     uint32_t compression;
 *     int32_t compression_level;
 *     uint32_t flags;
 *     int32_t tile_size_x;
 *     int32_t tile_size_y;
 *     {@link ExrBox2i ExrBox2i} const * data_window;
 *     {@link ExrBox2i ExrBox2i} const * display_window;
 *     char const * part_name;
 * }</code></pre>
 */
public class ExrWriteImageCreateInfo extends Struct<ExrWriteImageCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        WIDTH,
        HEIGHT,
        NUM_CHANNELS,
        CHANNELS,
        COMPRESSION,
        COMPRESSION_LEVEL,
        FLAGS,
        TILE_SIZE_X,
        TILE_SIZE_Y,
        DATA_WINDOW,
        DISPLAY_WINDOW,
        PART_NAME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        WIDTH = layout.offsetof(0);
        HEIGHT = layout.offsetof(1);
        NUM_CHANNELS = layout.offsetof(2);
        CHANNELS = layout.offsetof(3);
        COMPRESSION = layout.offsetof(4);
        COMPRESSION_LEVEL = layout.offsetof(5);
        FLAGS = layout.offsetof(6);
        TILE_SIZE_X = layout.offsetof(7);
        TILE_SIZE_Y = layout.offsetof(8);
        DATA_WINDOW = layout.offsetof(9);
        DISPLAY_WINDOW = layout.offsetof(10);
        PART_NAME = layout.offsetof(11);
    }

    protected ExrWriteImageCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ExrWriteImageCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new ExrWriteImageCreateInfo(address, container);
    }

    /**
     * Creates a {@code ExrWriteImageCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ExrWriteImageCreateInfo(ByteBuffer container) {
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
    /** @return the value of the {@code num_channels} field. */
    @NativeType("uint32_t")
    public int num_channels() { return nnum_channels(address()); }
    /** @return a {@link ExrWriteChannelInfo.Buffer} view of the struct array pointed to by the {@code channels} field. */
    @NativeType("ExrWriteChannelInfo const *")
    public ExrWriteChannelInfo.Buffer channels() { return nchannels(address()); }
    /** @return the value of the {@code compression} field. */
    @NativeType("uint32_t")
    public int compression() { return ncompression(address()); }
    /** @return the value of the {@code compression_level} field. */
    @NativeType("int32_t")
    public int compression_level() { return ncompression_level(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("uint32_t")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code tile_size_x} field. */
    @NativeType("int32_t")
    public int tile_size_x() { return ntile_size_x(address()); }
    /** @return the value of the {@code tile_size_y} field. */
    @NativeType("int32_t")
    public int tile_size_y() { return ntile_size_y(address()); }
    /** @return a {@link ExrBox2i} view of the struct pointed to by the {@code data_window} field. */
    @NativeType("ExrBox2i const *")
    public @Nullable ExrBox2i data_window() { return ndata_window(address()); }
    /** @return a {@link ExrBox2i} view of the struct pointed to by the {@code display_window} field. */
    @NativeType("ExrBox2i const *")
    public @Nullable ExrBox2i display_window() { return ndisplay_window(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code part_name} field. */
    @NativeType("char const *")
    public @Nullable ByteBuffer part_name() { return npart_name(address()); }
    /** @return the null-terminated string pointed to by the {@code part_name} field. */
    @NativeType("char const *")
    public @Nullable String part_nameString() { return npart_nameString(address()); }

    /** Sets the specified value to the {@code width} field. */
    public ExrWriteImageCreateInfo width(@NativeType("int32_t") int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    public ExrWriteImageCreateInfo height(@NativeType("int32_t") int value) { nheight(address(), value); return this; }
    /** Sets the address of the specified {@link ExrWriteChannelInfo.Buffer} to the {@code channels} field. */
    public ExrWriteImageCreateInfo channels(@NativeType("ExrWriteChannelInfo const *") ExrWriteChannelInfo.Buffer value) { nchannels(address(), value); return this; }
    /** Sets the specified value to the {@code compression} field. */
    public ExrWriteImageCreateInfo compression(@NativeType("uint32_t") int value) { ncompression(address(), value); return this; }
    /** Sets the specified value to the {@code compression_level} field. */
    public ExrWriteImageCreateInfo compression_level(@NativeType("int32_t") int value) { ncompression_level(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public ExrWriteImageCreateInfo flags(@NativeType("uint32_t") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code tile_size_x} field. */
    public ExrWriteImageCreateInfo tile_size_x(@NativeType("int32_t") int value) { ntile_size_x(address(), value); return this; }
    /** Sets the specified value to the {@code tile_size_y} field. */
    public ExrWriteImageCreateInfo tile_size_y(@NativeType("int32_t") int value) { ntile_size_y(address(), value); return this; }
    /** Sets the address of the specified {@link ExrBox2i} to the {@code data_window} field. */
    public ExrWriteImageCreateInfo data_window(@Nullable @NativeType("ExrBox2i const *") ExrBox2i value) { ndata_window(address(), value); return this; }
    /** Sets the address of the specified {@link ExrBox2i} to the {@code display_window} field. */
    public ExrWriteImageCreateInfo display_window(@Nullable @NativeType("ExrBox2i const *") ExrBox2i value) { ndisplay_window(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code part_name} field. */
    public ExrWriteImageCreateInfo part_name(@Nullable @NativeType("char const *") ByteBuffer value) { npart_name(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ExrWriteImageCreateInfo set(
        int width,
        int height,
        ExrWriteChannelInfo.Buffer channels,
        int compression,
        int compression_level,
        int flags,
        int tile_size_x,
        int tile_size_y,
        @Nullable ExrBox2i data_window,
        @Nullable ExrBox2i display_window,
        @Nullable ByteBuffer part_name
    ) {
        width(width);
        height(height);
        channels(channels);
        compression(compression);
        compression_level(compression_level);
        flags(flags);
        tile_size_x(tile_size_x);
        tile_size_y(tile_size_y);
        data_window(data_window);
        display_window(display_window);
        part_name(part_name);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ExrWriteImageCreateInfo set(ExrWriteImageCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ExrWriteImageCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ExrWriteImageCreateInfo malloc() {
        return new ExrWriteImageCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ExrWriteImageCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ExrWriteImageCreateInfo calloc() {
        return new ExrWriteImageCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ExrWriteImageCreateInfo} instance allocated with {@link BufferUtils}. */
    public static ExrWriteImageCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ExrWriteImageCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code ExrWriteImageCreateInfo} instance for the specified memory address. */
    public static ExrWriteImageCreateInfo create(long address) {
        return new ExrWriteImageCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ExrWriteImageCreateInfo createSafe(long address) {
        return address == NULL ? null : new ExrWriteImageCreateInfo(address, null);
    }

    /**
     * Returns a new {@link ExrWriteImageCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrWriteImageCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ExrWriteImageCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrWriteImageCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrWriteImageCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ExrWriteImageCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ExrWriteImageCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ExrWriteImageCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ExrWriteImageCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ExrWriteImageCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrWriteImageCreateInfo malloc(MemoryStack stack) {
        return new ExrWriteImageCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ExrWriteImageCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrWriteImageCreateInfo calloc(MemoryStack stack) {
        return new ExrWriteImageCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ExrWriteImageCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrWriteImageCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrWriteImageCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrWriteImageCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return memGetInt(struct + ExrWriteImageCreateInfo.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return memGetInt(struct + ExrWriteImageCreateInfo.HEIGHT); }
    /** Unsafe version of {@link #num_channels}. */
    public static int nnum_channels(long struct) { return memGetInt(struct + ExrWriteImageCreateInfo.NUM_CHANNELS); }
    /** Unsafe version of {@link #channels}. */
    public static ExrWriteChannelInfo.Buffer nchannels(long struct) { return ExrWriteChannelInfo.create(memGetAddress(struct + ExrWriteImageCreateInfo.CHANNELS), nnum_channels(struct)); }
    /** Unsafe version of {@link #compression}. */
    public static int ncompression(long struct) { return memGetInt(struct + ExrWriteImageCreateInfo.COMPRESSION); }
    /** Unsafe version of {@link #compression_level}. */
    public static int ncompression_level(long struct) { return memGetInt(struct + ExrWriteImageCreateInfo.COMPRESSION_LEVEL); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + ExrWriteImageCreateInfo.FLAGS); }
    /** Unsafe version of {@link #tile_size_x}. */
    public static int ntile_size_x(long struct) { return memGetInt(struct + ExrWriteImageCreateInfo.TILE_SIZE_X); }
    /** Unsafe version of {@link #tile_size_y}. */
    public static int ntile_size_y(long struct) { return memGetInt(struct + ExrWriteImageCreateInfo.TILE_SIZE_Y); }
    /** Unsafe version of {@link #data_window}. */
    public static @Nullable ExrBox2i ndata_window(long struct) { return ExrBox2i.createSafe(memGetAddress(struct + ExrWriteImageCreateInfo.DATA_WINDOW)); }
    /** Unsafe version of {@link #display_window}. */
    public static @Nullable ExrBox2i ndisplay_window(long struct) { return ExrBox2i.createSafe(memGetAddress(struct + ExrWriteImageCreateInfo.DISPLAY_WINDOW)); }
    /** Unsafe version of {@link #part_name}. */
    public static @Nullable ByteBuffer npart_name(long struct) { return memByteBufferNT1Safe(memGetAddress(struct + ExrWriteImageCreateInfo.PART_NAME)); }
    /** Unsafe version of {@link #part_nameString}. */
    public static @Nullable String npart_nameString(long struct) { return memASCIISafe(memGetAddress(struct + ExrWriteImageCreateInfo.PART_NAME)); }

    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { memPutInt(struct + ExrWriteImageCreateInfo.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { memPutInt(struct + ExrWriteImageCreateInfo.HEIGHT, value); }
    /** Sets the specified value to the {@code num_channels} field of the specified {@code struct}. */
    public static void nnum_channels(long struct, int value) { memPutInt(struct + ExrWriteImageCreateInfo.NUM_CHANNELS, value); }
    /** Unsafe version of {@link #channels(ExrWriteChannelInfo.Buffer) channels}. */
    public static void nchannels(long struct, ExrWriteChannelInfo.Buffer value) { memPutAddress(struct + ExrWriteImageCreateInfo.CHANNELS, value.address()); nnum_channels(struct, value.remaining()); }
    /** Unsafe version of {@link #compression(int) compression}. */
    public static void ncompression(long struct, int value) { memPutInt(struct + ExrWriteImageCreateInfo.COMPRESSION, value); }
    /** Unsafe version of {@link #compression_level(int) compression_level}. */
    public static void ncompression_level(long struct, int value) { memPutInt(struct + ExrWriteImageCreateInfo.COMPRESSION_LEVEL, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + ExrWriteImageCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #tile_size_x(int) tile_size_x}. */
    public static void ntile_size_x(long struct, int value) { memPutInt(struct + ExrWriteImageCreateInfo.TILE_SIZE_X, value); }
    /** Unsafe version of {@link #tile_size_y(int) tile_size_y}. */
    public static void ntile_size_y(long struct, int value) { memPutInt(struct + ExrWriteImageCreateInfo.TILE_SIZE_Y, value); }
    /** Unsafe version of {@link #data_window(ExrBox2i) data_window}. */
    public static void ndata_window(long struct, @Nullable ExrBox2i value) { memPutAddress(struct + ExrWriteImageCreateInfo.DATA_WINDOW, memAddressSafe(value)); }
    /** Unsafe version of {@link #display_window(ExrBox2i) display_window}. */
    public static void ndisplay_window(long struct, @Nullable ExrBox2i value) { memPutAddress(struct + ExrWriteImageCreateInfo.DISPLAY_WINDOW, memAddressSafe(value)); }
    /** Unsafe version of {@link #part_name(ByteBuffer) part_name}. */
    public static void npart_name(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + ExrWriteImageCreateInfo.PART_NAME, memAddressSafe(value));
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int num_channels = nnum_channels(struct);
        long channels = memGetAddress(struct + ExrWriteImageCreateInfo.CHANNELS);
        check(channels);
        validate(channels, num_channels, ExrWriteChannelInfo.SIZEOF, ExrWriteChannelInfo::validate);
    }

    // -----------------------------------

    /** An array of {@link ExrWriteImageCreateInfo} structs. */
    public static class Buffer extends StructBuffer<ExrWriteImageCreateInfo, Buffer> implements NativeResource {

        private static final ExrWriteImageCreateInfo ELEMENT_FACTORY = ExrWriteImageCreateInfo.create(-1L);

        /**
         * Creates a new {@code ExrWriteImageCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ExrWriteImageCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected ExrWriteImageCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code width} field. */
        @NativeType("int32_t")
        public int width() { return ExrWriteImageCreateInfo.nwidth(address()); }
        /** @return the value of the {@code height} field. */
        @NativeType("int32_t")
        public int height() { return ExrWriteImageCreateInfo.nheight(address()); }
        /** @return the value of the {@code num_channels} field. */
        @NativeType("uint32_t")
        public int num_channels() { return ExrWriteImageCreateInfo.nnum_channels(address()); }
        /** @return a {@link ExrWriteChannelInfo.Buffer} view of the struct array pointed to by the {@code channels} field. */
        @NativeType("ExrWriteChannelInfo const *")
        public ExrWriteChannelInfo.Buffer channels() { return ExrWriteImageCreateInfo.nchannels(address()); }
        /** @return the value of the {@code compression} field. */
        @NativeType("uint32_t")
        public int compression() { return ExrWriteImageCreateInfo.ncompression(address()); }
        /** @return the value of the {@code compression_level} field. */
        @NativeType("int32_t")
        public int compression_level() { return ExrWriteImageCreateInfo.ncompression_level(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("uint32_t")
        public int flags() { return ExrWriteImageCreateInfo.nflags(address()); }
        /** @return the value of the {@code tile_size_x} field. */
        @NativeType("int32_t")
        public int tile_size_x() { return ExrWriteImageCreateInfo.ntile_size_x(address()); }
        /** @return the value of the {@code tile_size_y} field. */
        @NativeType("int32_t")
        public int tile_size_y() { return ExrWriteImageCreateInfo.ntile_size_y(address()); }
        /** @return a {@link ExrBox2i} view of the struct pointed to by the {@code data_window} field. */
        @NativeType("ExrBox2i const *")
        public @Nullable ExrBox2i data_window() { return ExrWriteImageCreateInfo.ndata_window(address()); }
        /** @return a {@link ExrBox2i} view of the struct pointed to by the {@code display_window} field. */
        @NativeType("ExrBox2i const *")
        public @Nullable ExrBox2i display_window() { return ExrWriteImageCreateInfo.ndisplay_window(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code part_name} field. */
        @NativeType("char const *")
        public @Nullable ByteBuffer part_name() { return ExrWriteImageCreateInfo.npart_name(address()); }
        /** @return the null-terminated string pointed to by the {@code part_name} field. */
        @NativeType("char const *")
        public @Nullable String part_nameString() { return ExrWriteImageCreateInfo.npart_nameString(address()); }

        /** Sets the specified value to the {@code width} field. */
        public ExrWriteImageCreateInfo.Buffer width(@NativeType("int32_t") int value) { ExrWriteImageCreateInfo.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code height} field. */
        public ExrWriteImageCreateInfo.Buffer height(@NativeType("int32_t") int value) { ExrWriteImageCreateInfo.nheight(address(), value); return this; }
        /** Sets the address of the specified {@link ExrWriteChannelInfo.Buffer} to the {@code channels} field. */
        public ExrWriteImageCreateInfo.Buffer channels(@NativeType("ExrWriteChannelInfo const *") ExrWriteChannelInfo.Buffer value) { ExrWriteImageCreateInfo.nchannels(address(), value); return this; }
        /** Sets the specified value to the {@code compression} field. */
        public ExrWriteImageCreateInfo.Buffer compression(@NativeType("uint32_t") int value) { ExrWriteImageCreateInfo.ncompression(address(), value); return this; }
        /** Sets the specified value to the {@code compression_level} field. */
        public ExrWriteImageCreateInfo.Buffer compression_level(@NativeType("int32_t") int value) { ExrWriteImageCreateInfo.ncompression_level(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public ExrWriteImageCreateInfo.Buffer flags(@NativeType("uint32_t") int value) { ExrWriteImageCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code tile_size_x} field. */
        public ExrWriteImageCreateInfo.Buffer tile_size_x(@NativeType("int32_t") int value) { ExrWriteImageCreateInfo.ntile_size_x(address(), value); return this; }
        /** Sets the specified value to the {@code tile_size_y} field. */
        public ExrWriteImageCreateInfo.Buffer tile_size_y(@NativeType("int32_t") int value) { ExrWriteImageCreateInfo.ntile_size_y(address(), value); return this; }
        /** Sets the address of the specified {@link ExrBox2i} to the {@code data_window} field. */
        public ExrWriteImageCreateInfo.Buffer data_window(@Nullable @NativeType("ExrBox2i const *") ExrBox2i value) { ExrWriteImageCreateInfo.ndata_window(address(), value); return this; }
        /** Sets the address of the specified {@link ExrBox2i} to the {@code display_window} field. */
        public ExrWriteImageCreateInfo.Buffer display_window(@Nullable @NativeType("ExrBox2i const *") ExrBox2i value) { ExrWriteImageCreateInfo.ndisplay_window(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code part_name} field. */
        public ExrWriteImageCreateInfo.Buffer part_name(@Nullable @NativeType("char const *") ByteBuffer value) { ExrWriteImageCreateInfo.npart_name(address(), value); return this; }

    }

}