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
 * struct ExrProgressInfo {
 *     int32_t percent_complete;
 *     int32_t current_block;
 *     int32_t total_blocks;
 *     uint64_t bytes_processed;
 *     uint64_t bytes_total;
 * }}</pre>
 */
public class ExrProgressInfo extends Struct<ExrProgressInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PERCENT_COMPLETE,
        CURRENT_BLOCK,
        TOTAL_BLOCKS,
        BYTES_PROCESSED,
        BYTES_TOTAL;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PERCENT_COMPLETE = layout.offsetof(0);
        CURRENT_BLOCK = layout.offsetof(1);
        TOTAL_BLOCKS = layout.offsetof(2);
        BYTES_PROCESSED = layout.offsetof(3);
        BYTES_TOTAL = layout.offsetof(4);
    }

    protected ExrProgressInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ExrProgressInfo create(long address, @Nullable ByteBuffer container) {
        return new ExrProgressInfo(address, container);
    }

    /**
     * Creates a {@code ExrProgressInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ExrProgressInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code percent_complete} field. */
    @NativeType("int32_t")
    public int percent_complete() { return npercent_complete(address()); }
    /** @return the value of the {@code current_block} field. */
    @NativeType("int32_t")
    public int current_block() { return ncurrent_block(address()); }
    /** @return the value of the {@code total_blocks} field. */
    @NativeType("int32_t")
    public int total_blocks() { return ntotal_blocks(address()); }
    /** @return the value of the {@code bytes_processed} field. */
    @NativeType("uint64_t")
    public long bytes_processed() { return nbytes_processed(address()); }
    /** @return the value of the {@code bytes_total} field. */
    @NativeType("uint64_t")
    public long bytes_total() { return nbytes_total(address()); }

    /** Sets the specified value to the {@code percent_complete} field. */
    public ExrProgressInfo percent_complete(@NativeType("int32_t") int value) { npercent_complete(address(), value); return this; }
    /** Sets the specified value to the {@code current_block} field. */
    public ExrProgressInfo current_block(@NativeType("int32_t") int value) { ncurrent_block(address(), value); return this; }
    /** Sets the specified value to the {@code total_blocks} field. */
    public ExrProgressInfo total_blocks(@NativeType("int32_t") int value) { ntotal_blocks(address(), value); return this; }
    /** Sets the specified value to the {@code bytes_processed} field. */
    public ExrProgressInfo bytes_processed(@NativeType("uint64_t") long value) { nbytes_processed(address(), value); return this; }
    /** Sets the specified value to the {@code bytes_total} field. */
    public ExrProgressInfo bytes_total(@NativeType("uint64_t") long value) { nbytes_total(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ExrProgressInfo set(
        int percent_complete,
        int current_block,
        int total_blocks,
        long bytes_processed,
        long bytes_total
    ) {
        percent_complete(percent_complete);
        current_block(current_block);
        total_blocks(total_blocks);
        bytes_processed(bytes_processed);
        bytes_total(bytes_total);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ExrProgressInfo set(ExrProgressInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ExrProgressInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ExrProgressInfo malloc() {
        return new ExrProgressInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ExrProgressInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ExrProgressInfo calloc() {
        return new ExrProgressInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ExrProgressInfo} instance allocated with {@link BufferUtils}. */
    public static ExrProgressInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ExrProgressInfo(memAddress(container), container);
    }

    /** Returns a new {@code ExrProgressInfo} instance for the specified memory address. */
    public static ExrProgressInfo create(long address) {
        return new ExrProgressInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ExrProgressInfo createSafe(long address) {
        return address == NULL ? null : new ExrProgressInfo(address, null);
    }

    /**
     * Returns a new {@link ExrProgressInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrProgressInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ExrProgressInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrProgressInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrProgressInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ExrProgressInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ExrProgressInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ExrProgressInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ExrProgressInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ExrProgressInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrProgressInfo malloc(MemoryStack stack) {
        return new ExrProgressInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ExrProgressInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrProgressInfo calloc(MemoryStack stack) {
        return new ExrProgressInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ExrProgressInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrProgressInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrProgressInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrProgressInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #percent_complete}. */
    public static int npercent_complete(long struct) { return memGetInt(struct + ExrProgressInfo.PERCENT_COMPLETE); }
    /** Unsafe version of {@link #current_block}. */
    public static int ncurrent_block(long struct) { return memGetInt(struct + ExrProgressInfo.CURRENT_BLOCK); }
    /** Unsafe version of {@link #total_blocks}. */
    public static int ntotal_blocks(long struct) { return memGetInt(struct + ExrProgressInfo.TOTAL_BLOCKS); }
    /** Unsafe version of {@link #bytes_processed}. */
    public static long nbytes_processed(long struct) { return memGetLong(struct + ExrProgressInfo.BYTES_PROCESSED); }
    /** Unsafe version of {@link #bytes_total}. */
    public static long nbytes_total(long struct) { return memGetLong(struct + ExrProgressInfo.BYTES_TOTAL); }

    /** Unsafe version of {@link #percent_complete(int) percent_complete}. */
    public static void npercent_complete(long struct, int value) { memPutInt(struct + ExrProgressInfo.PERCENT_COMPLETE, value); }
    /** Unsafe version of {@link #current_block(int) current_block}. */
    public static void ncurrent_block(long struct, int value) { memPutInt(struct + ExrProgressInfo.CURRENT_BLOCK, value); }
    /** Unsafe version of {@link #total_blocks(int) total_blocks}. */
    public static void ntotal_blocks(long struct, int value) { memPutInt(struct + ExrProgressInfo.TOTAL_BLOCKS, value); }
    /** Unsafe version of {@link #bytes_processed(long) bytes_processed}. */
    public static void nbytes_processed(long struct, long value) { memPutLong(struct + ExrProgressInfo.BYTES_PROCESSED, value); }
    /** Unsafe version of {@link #bytes_total(long) bytes_total}. */
    public static void nbytes_total(long struct, long value) { memPutLong(struct + ExrProgressInfo.BYTES_TOTAL, value); }

    // -----------------------------------

    /** An array of {@link ExrProgressInfo} structs. */
    public static class Buffer extends StructBuffer<ExrProgressInfo, Buffer> implements NativeResource {

        private static final ExrProgressInfo ELEMENT_FACTORY = ExrProgressInfo.create(-1L);

        /**
         * Creates a new {@code ExrProgressInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ExrProgressInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected ExrProgressInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code percent_complete} field. */
        @NativeType("int32_t")
        public int percent_complete() { return ExrProgressInfo.npercent_complete(address()); }
        /** @return the value of the {@code current_block} field. */
        @NativeType("int32_t")
        public int current_block() { return ExrProgressInfo.ncurrent_block(address()); }
        /** @return the value of the {@code total_blocks} field. */
        @NativeType("int32_t")
        public int total_blocks() { return ExrProgressInfo.ntotal_blocks(address()); }
        /** @return the value of the {@code bytes_processed} field. */
        @NativeType("uint64_t")
        public long bytes_processed() { return ExrProgressInfo.nbytes_processed(address()); }
        /** @return the value of the {@code bytes_total} field. */
        @NativeType("uint64_t")
        public long bytes_total() { return ExrProgressInfo.nbytes_total(address()); }

        /** Sets the specified value to the {@code percent_complete} field. */
        public ExrProgressInfo.Buffer percent_complete(@NativeType("int32_t") int value) { ExrProgressInfo.npercent_complete(address(), value); return this; }
        /** Sets the specified value to the {@code current_block} field. */
        public ExrProgressInfo.Buffer current_block(@NativeType("int32_t") int value) { ExrProgressInfo.ncurrent_block(address(), value); return this; }
        /** Sets the specified value to the {@code total_blocks} field. */
        public ExrProgressInfo.Buffer total_blocks(@NativeType("int32_t") int value) { ExrProgressInfo.ntotal_blocks(address(), value); return this; }
        /** Sets the specified value to the {@code bytes_processed} field. */
        public ExrProgressInfo.Buffer bytes_processed(@NativeType("uint64_t") long value) { ExrProgressInfo.nbytes_processed(address(), value); return this; }
        /** Sets the specified value to the {@code bytes_total} field. */
        public ExrProgressInfo.Buffer bytes_total(@NativeType("uint64_t") long value) { ExrProgressInfo.nbytes_total(address(), value); return this; }

    }

}