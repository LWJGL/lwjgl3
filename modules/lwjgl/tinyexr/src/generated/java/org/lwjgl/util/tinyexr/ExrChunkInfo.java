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
 * <pre>{@code
 * struct ExrChunkInfo {
 *     uint64_t file_offset;
 *     uint32_t compressed_size;
 *     uint32_t uncompressed_size;
 *     int32_t y_start;
 *     int32_t tile_x;
 *     int32_t tile_y;
 *     int32_t level_x;
 *     int32_t level_y;
 *     uint32_t chunk_type;
 * }}</pre>
 */
public class ExrChunkInfo extends Struct<ExrChunkInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FILE_OFFSET,
        COMPRESSED_SIZE,
        UNCOMPRESSED_SIZE,
        Y_START,
        TILE_X,
        TILE_Y,
        LEVEL_X,
        LEVEL_Y,
        CHUNK_TYPE;

    static {
        Layout layout = __struct(
            __member(8),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FILE_OFFSET = layout.offsetof(0);
        COMPRESSED_SIZE = layout.offsetof(1);
        UNCOMPRESSED_SIZE = layout.offsetof(2);
        Y_START = layout.offsetof(3);
        TILE_X = layout.offsetof(4);
        TILE_Y = layout.offsetof(5);
        LEVEL_X = layout.offsetof(6);
        LEVEL_Y = layout.offsetof(7);
        CHUNK_TYPE = layout.offsetof(8);
    }

    protected ExrChunkInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ExrChunkInfo create(long address, @Nullable ByteBuffer container) {
        return new ExrChunkInfo(address, container);
    }

    /**
     * Creates a {@code ExrChunkInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ExrChunkInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code file_offset} field. */
    @NativeType("uint64_t")
    public long file_offset() { return nfile_offset(address()); }
    /** @return the value of the {@code compressed_size} field. */
    @NativeType("uint32_t")
    public int compressed_size() { return ncompressed_size(address()); }
    /** @return the value of the {@code uncompressed_size} field. */
    @NativeType("uint32_t")
    public int uncompressed_size() { return nuncompressed_size(address()); }
    /** @return the value of the {@code y_start} field. */
    @NativeType("int32_t")
    public int y_start() { return ny_start(address()); }
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
    /** @return the value of the {@code chunk_type} field. */
    @NativeType("uint32_t")
    public int chunk_type() { return nchunk_type(address()); }

    /** Sets the specified value to the {@code file_offset} field. */
    public ExrChunkInfo file_offset(@NativeType("uint64_t") long value) { nfile_offset(address(), value); return this; }
    /** Sets the specified value to the {@code compressed_size} field. */
    public ExrChunkInfo compressed_size(@NativeType("uint32_t") int value) { ncompressed_size(address(), value); return this; }
    /** Sets the specified value to the {@code uncompressed_size} field. */
    public ExrChunkInfo uncompressed_size(@NativeType("uint32_t") int value) { nuncompressed_size(address(), value); return this; }
    /** Sets the specified value to the {@code y_start} field. */
    public ExrChunkInfo y_start(@NativeType("int32_t") int value) { ny_start(address(), value); return this; }
    /** Sets the specified value to the {@code tile_x} field. */
    public ExrChunkInfo tile_x(@NativeType("int32_t") int value) { ntile_x(address(), value); return this; }
    /** Sets the specified value to the {@code tile_y} field. */
    public ExrChunkInfo tile_y(@NativeType("int32_t") int value) { ntile_y(address(), value); return this; }
    /** Sets the specified value to the {@code level_x} field. */
    public ExrChunkInfo level_x(@NativeType("int32_t") int value) { nlevel_x(address(), value); return this; }
    /** Sets the specified value to the {@code level_y} field. */
    public ExrChunkInfo level_y(@NativeType("int32_t") int value) { nlevel_y(address(), value); return this; }
    /** Sets the specified value to the {@code chunk_type} field. */
    public ExrChunkInfo chunk_type(@NativeType("uint32_t") int value) { nchunk_type(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ExrChunkInfo set(
        long file_offset,
        int compressed_size,
        int uncompressed_size,
        int y_start,
        int tile_x,
        int tile_y,
        int level_x,
        int level_y,
        int chunk_type
    ) {
        file_offset(file_offset);
        compressed_size(compressed_size);
        uncompressed_size(uncompressed_size);
        y_start(y_start);
        tile_x(tile_x);
        tile_y(tile_y);
        level_x(level_x);
        level_y(level_y);
        chunk_type(chunk_type);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ExrChunkInfo set(ExrChunkInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ExrChunkInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ExrChunkInfo malloc() {
        return new ExrChunkInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ExrChunkInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ExrChunkInfo calloc() {
        return new ExrChunkInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ExrChunkInfo} instance allocated with {@link BufferUtils}. */
    public static ExrChunkInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ExrChunkInfo(memAddress(container), container);
    }

    /** Returns a new {@code ExrChunkInfo} instance for the specified memory address. */
    public static ExrChunkInfo create(long address) {
        return new ExrChunkInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ExrChunkInfo createSafe(long address) {
        return address == NULL ? null : new ExrChunkInfo(address, null);
    }

    /**
     * Returns a new {@link ExrChunkInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrChunkInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ExrChunkInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrChunkInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrChunkInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ExrChunkInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ExrChunkInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ExrChunkInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ExrChunkInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ExrChunkInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrChunkInfo malloc(MemoryStack stack) {
        return new ExrChunkInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ExrChunkInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrChunkInfo calloc(MemoryStack stack) {
        return new ExrChunkInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ExrChunkInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrChunkInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrChunkInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrChunkInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #file_offset}. */
    public static long nfile_offset(long struct) { return memGetLong(struct + ExrChunkInfo.FILE_OFFSET); }
    /** Unsafe version of {@link #compressed_size}. */
    public static int ncompressed_size(long struct) { return memGetInt(struct + ExrChunkInfo.COMPRESSED_SIZE); }
    /** Unsafe version of {@link #uncompressed_size}. */
    public static int nuncompressed_size(long struct) { return memGetInt(struct + ExrChunkInfo.UNCOMPRESSED_SIZE); }
    /** Unsafe version of {@link #y_start}. */
    public static int ny_start(long struct) { return memGetInt(struct + ExrChunkInfo.Y_START); }
    /** Unsafe version of {@link #tile_x}. */
    public static int ntile_x(long struct) { return memGetInt(struct + ExrChunkInfo.TILE_X); }
    /** Unsafe version of {@link #tile_y}. */
    public static int ntile_y(long struct) { return memGetInt(struct + ExrChunkInfo.TILE_Y); }
    /** Unsafe version of {@link #level_x}. */
    public static int nlevel_x(long struct) { return memGetInt(struct + ExrChunkInfo.LEVEL_X); }
    /** Unsafe version of {@link #level_y}. */
    public static int nlevel_y(long struct) { return memGetInt(struct + ExrChunkInfo.LEVEL_Y); }
    /** Unsafe version of {@link #chunk_type}. */
    public static int nchunk_type(long struct) { return memGetInt(struct + ExrChunkInfo.CHUNK_TYPE); }

    /** Unsafe version of {@link #file_offset(long) file_offset}. */
    public static void nfile_offset(long struct, long value) { memPutLong(struct + ExrChunkInfo.FILE_OFFSET, value); }
    /** Unsafe version of {@link #compressed_size(int) compressed_size}. */
    public static void ncompressed_size(long struct, int value) { memPutInt(struct + ExrChunkInfo.COMPRESSED_SIZE, value); }
    /** Unsafe version of {@link #uncompressed_size(int) uncompressed_size}. */
    public static void nuncompressed_size(long struct, int value) { memPutInt(struct + ExrChunkInfo.UNCOMPRESSED_SIZE, value); }
    /** Unsafe version of {@link #y_start(int) y_start}. */
    public static void ny_start(long struct, int value) { memPutInt(struct + ExrChunkInfo.Y_START, value); }
    /** Unsafe version of {@link #tile_x(int) tile_x}. */
    public static void ntile_x(long struct, int value) { memPutInt(struct + ExrChunkInfo.TILE_X, value); }
    /** Unsafe version of {@link #tile_y(int) tile_y}. */
    public static void ntile_y(long struct, int value) { memPutInt(struct + ExrChunkInfo.TILE_Y, value); }
    /** Unsafe version of {@link #level_x(int) level_x}. */
    public static void nlevel_x(long struct, int value) { memPutInt(struct + ExrChunkInfo.LEVEL_X, value); }
    /** Unsafe version of {@link #level_y(int) level_y}. */
    public static void nlevel_y(long struct, int value) { memPutInt(struct + ExrChunkInfo.LEVEL_Y, value); }
    /** Unsafe version of {@link #chunk_type(int) chunk_type}. */
    public static void nchunk_type(long struct, int value) { memPutInt(struct + ExrChunkInfo.CHUNK_TYPE, value); }

    // -----------------------------------

    /** An array of {@link ExrChunkInfo} structs. */
    public static class Buffer extends StructBuffer<ExrChunkInfo, Buffer> implements NativeResource {

        private static final ExrChunkInfo ELEMENT_FACTORY = ExrChunkInfo.create(-1L);

        /**
         * Creates a new {@code ExrChunkInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ExrChunkInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected ExrChunkInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code file_offset} field. */
        @NativeType("uint64_t")
        public long file_offset() { return ExrChunkInfo.nfile_offset(address()); }
        /** @return the value of the {@code compressed_size} field. */
        @NativeType("uint32_t")
        public int compressed_size() { return ExrChunkInfo.ncompressed_size(address()); }
        /** @return the value of the {@code uncompressed_size} field. */
        @NativeType("uint32_t")
        public int uncompressed_size() { return ExrChunkInfo.nuncompressed_size(address()); }
        /** @return the value of the {@code y_start} field. */
        @NativeType("int32_t")
        public int y_start() { return ExrChunkInfo.ny_start(address()); }
        /** @return the value of the {@code tile_x} field. */
        @NativeType("int32_t")
        public int tile_x() { return ExrChunkInfo.ntile_x(address()); }
        /** @return the value of the {@code tile_y} field. */
        @NativeType("int32_t")
        public int tile_y() { return ExrChunkInfo.ntile_y(address()); }
        /** @return the value of the {@code level_x} field. */
        @NativeType("int32_t")
        public int level_x() { return ExrChunkInfo.nlevel_x(address()); }
        /** @return the value of the {@code level_y} field. */
        @NativeType("int32_t")
        public int level_y() { return ExrChunkInfo.nlevel_y(address()); }
        /** @return the value of the {@code chunk_type} field. */
        @NativeType("uint32_t")
        public int chunk_type() { return ExrChunkInfo.nchunk_type(address()); }

        /** Sets the specified value to the {@code file_offset} field. */
        public ExrChunkInfo.Buffer file_offset(@NativeType("uint64_t") long value) { ExrChunkInfo.nfile_offset(address(), value); return this; }
        /** Sets the specified value to the {@code compressed_size} field. */
        public ExrChunkInfo.Buffer compressed_size(@NativeType("uint32_t") int value) { ExrChunkInfo.ncompressed_size(address(), value); return this; }
        /** Sets the specified value to the {@code uncompressed_size} field. */
        public ExrChunkInfo.Buffer uncompressed_size(@NativeType("uint32_t") int value) { ExrChunkInfo.nuncompressed_size(address(), value); return this; }
        /** Sets the specified value to the {@code y_start} field. */
        public ExrChunkInfo.Buffer y_start(@NativeType("int32_t") int value) { ExrChunkInfo.ny_start(address(), value); return this; }
        /** Sets the specified value to the {@code tile_x} field. */
        public ExrChunkInfo.Buffer tile_x(@NativeType("int32_t") int value) { ExrChunkInfo.ntile_x(address(), value); return this; }
        /** Sets the specified value to the {@code tile_y} field. */
        public ExrChunkInfo.Buffer tile_y(@NativeType("int32_t") int value) { ExrChunkInfo.ntile_y(address(), value); return this; }
        /** Sets the specified value to the {@code level_x} field. */
        public ExrChunkInfo.Buffer level_x(@NativeType("int32_t") int value) { ExrChunkInfo.nlevel_x(address(), value); return this; }
        /** Sets the specified value to the {@code level_y} field. */
        public ExrChunkInfo.Buffer level_y(@NativeType("int32_t") int value) { ExrChunkInfo.nlevel_y(address(), value); return this; }
        /** Sets the specified value to the {@code chunk_type} field. */
        public ExrChunkInfo.Buffer chunk_type(@NativeType("uint32_t") int value) { ExrChunkInfo.nchunk_type(address(), value); return this; }

    }

}