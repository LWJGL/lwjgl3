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
 * struct ExrCompressInfo {
 *     void const * src;
 *     size_t src_size;
 *     void * dst;
 *     size_t dst_capacity;
 *     size_t * out_size;
 *     uint32_t compression;
 *     int32_t compression_level;
 *     int32_t width;
 *     int32_t num_lines;
 *     uint32_t num_channels;
 *     {@link ExrChannelInfo ExrChannelInfo} const * channels;
 *     ExrMemoryPool scratch;
 * }</code></pre>
 */
public class ExrCompressInfo extends Struct<ExrCompressInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SRC,
        SRC_SIZE,
        DST,
        DST_CAPACITY,
        OUT_SIZE,
        COMPRESSION,
        COMPRESSION_LEVEL,
        WIDTH,
        NUM_LINES,
        NUM_CHANNELS,
        CHANNELS,
        SCRATCH;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SRC = layout.offsetof(0);
        SRC_SIZE = layout.offsetof(1);
        DST = layout.offsetof(2);
        DST_CAPACITY = layout.offsetof(3);
        OUT_SIZE = layout.offsetof(4);
        COMPRESSION = layout.offsetof(5);
        COMPRESSION_LEVEL = layout.offsetof(6);
        WIDTH = layout.offsetof(7);
        NUM_LINES = layout.offsetof(8);
        NUM_CHANNELS = layout.offsetof(9);
        CHANNELS = layout.offsetof(10);
        SCRATCH = layout.offsetof(11);
    }

    protected ExrCompressInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ExrCompressInfo create(long address, @Nullable ByteBuffer container) {
        return new ExrCompressInfo(address, container);
    }

    /**
     * Creates a {@code ExrCompressInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ExrCompressInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code src} field. */
    @NativeType("void const *")
    public ByteBuffer src() { return nsrc(address()); }
    /** @return the value of the {@code src_size} field. */
    @NativeType("size_t")
    public long src_size() { return nsrc_size(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code dst} field. */
    @NativeType("void *")
    public ByteBuffer dst() { return ndst(address()); }
    /** @return the value of the {@code dst_capacity} field. */
    @NativeType("size_t")
    public long dst_capacity() { return ndst_capacity(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code out_size} field. */
    @NativeType("size_t *")
    public PointerBuffer out_size() { return nout_size(address()); }
    /** @return the value of the {@code compression} field. */
    @NativeType("uint32_t")
    public int compression() { return ncompression(address()); }
    /** @return the value of the {@code compression_level} field. */
    @NativeType("int32_t")
    public int compression_level() { return ncompression_level(address()); }
    /** @return the value of the {@code width} field. */
    @NativeType("int32_t")
    public int width() { return nwidth(address()); }
    /** @return the value of the {@code num_lines} field. */
    @NativeType("int32_t")
    public int num_lines() { return nnum_lines(address()); }
    /** @return the value of the {@code num_channels} field. */
    @NativeType("uint32_t")
    public int num_channels() { return nnum_channels(address()); }
    /** @return a {@link ExrChannelInfo.Buffer} view of the struct array pointed to by the {@code channels} field. */
    @NativeType("ExrChannelInfo const *")
    public ExrChannelInfo.Buffer channels() { return nchannels(address()); }
    /** @return the value of the {@code scratch} field. */
    @NativeType("ExrMemoryPool")
    public long scratch() { return nscratch(address()); }

    /** Sets the address of the specified {@link ByteBuffer} to the {@code src} field. */
    public ExrCompressInfo src(@NativeType("void const *") ByteBuffer value) { nsrc(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code dst} field. */
    public ExrCompressInfo dst(@NativeType("void *") ByteBuffer value) { ndst(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code out_size} field. */
    public ExrCompressInfo out_size(@NativeType("size_t *") PointerBuffer value) { nout_size(address(), value); return this; }
    /** Sets the specified value to the {@code compression} field. */
    public ExrCompressInfo compression(@NativeType("uint32_t") int value) { ncompression(address(), value); return this; }
    /** Sets the specified value to the {@code compression_level} field. */
    public ExrCompressInfo compression_level(@NativeType("int32_t") int value) { ncompression_level(address(), value); return this; }
    /** Sets the specified value to the {@code width} field. */
    public ExrCompressInfo width(@NativeType("int32_t") int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code num_lines} field. */
    public ExrCompressInfo num_lines(@NativeType("int32_t") int value) { nnum_lines(address(), value); return this; }
    /** Sets the address of the specified {@link ExrChannelInfo.Buffer} to the {@code channels} field. */
    public ExrCompressInfo channels(@NativeType("ExrChannelInfo const *") ExrChannelInfo.Buffer value) { nchannels(address(), value); return this; }
    /** Sets the specified value to the {@code scratch} field. */
    public ExrCompressInfo scratch(@NativeType("ExrMemoryPool") long value) { nscratch(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ExrCompressInfo set(
        ByteBuffer src,
        ByteBuffer dst,
        PointerBuffer out_size,
        int compression,
        int compression_level,
        int width,
        int num_lines,
        ExrChannelInfo.Buffer channels,
        long scratch
    ) {
        src(src);
        dst(dst);
        out_size(out_size);
        compression(compression);
        compression_level(compression_level);
        width(width);
        num_lines(num_lines);
        channels(channels);
        scratch(scratch);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ExrCompressInfo set(ExrCompressInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ExrCompressInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ExrCompressInfo malloc() {
        return new ExrCompressInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ExrCompressInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ExrCompressInfo calloc() {
        return new ExrCompressInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ExrCompressInfo} instance allocated with {@link BufferUtils}. */
    public static ExrCompressInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ExrCompressInfo(memAddress(container), container);
    }

    /** Returns a new {@code ExrCompressInfo} instance for the specified memory address. */
    public static ExrCompressInfo create(long address) {
        return new ExrCompressInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ExrCompressInfo createSafe(long address) {
        return address == NULL ? null : new ExrCompressInfo(address, null);
    }

    /**
     * Returns a new {@link ExrCompressInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrCompressInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ExrCompressInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrCompressInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrCompressInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ExrCompressInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ExrCompressInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ExrCompressInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ExrCompressInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ExrCompressInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrCompressInfo malloc(MemoryStack stack) {
        return new ExrCompressInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ExrCompressInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrCompressInfo calloc(MemoryStack stack) {
        return new ExrCompressInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ExrCompressInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrCompressInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrCompressInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrCompressInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #src() src}. */
    public static ByteBuffer nsrc(long struct) { return memByteBuffer(memGetAddress(struct + ExrCompressInfo.SRC), (int)nsrc_size(struct)); }
    /** Unsafe version of {@link #src_size}. */
    public static long nsrc_size(long struct) { return memGetAddress(struct + ExrCompressInfo.SRC_SIZE); }
    /** Unsafe version of {@link #dst() dst}. */
    public static ByteBuffer ndst(long struct) { return memByteBuffer(memGetAddress(struct + ExrCompressInfo.DST), (int)ndst_capacity(struct)); }
    /** Unsafe version of {@link #dst_capacity}. */
    public static long ndst_capacity(long struct) { return memGetAddress(struct + ExrCompressInfo.DST_CAPACITY); }
    /** Unsafe version of {@link #out_size() out_size}. */
    public static PointerBuffer nout_size(long struct) { return memPointerBuffer(memGetAddress(struct + ExrCompressInfo.OUT_SIZE), 1); }
    /** Unsafe version of {@link #compression}. */
    public static int ncompression(long struct) { return memGetInt(struct + ExrCompressInfo.COMPRESSION); }
    /** Unsafe version of {@link #compression_level}. */
    public static int ncompression_level(long struct) { return memGetInt(struct + ExrCompressInfo.COMPRESSION_LEVEL); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return memGetInt(struct + ExrCompressInfo.WIDTH); }
    /** Unsafe version of {@link #num_lines}. */
    public static int nnum_lines(long struct) { return memGetInt(struct + ExrCompressInfo.NUM_LINES); }
    /** Unsafe version of {@link #num_channels}. */
    public static int nnum_channels(long struct) { return memGetInt(struct + ExrCompressInfo.NUM_CHANNELS); }
    /** Unsafe version of {@link #channels}. */
    public static ExrChannelInfo.Buffer nchannels(long struct) { return ExrChannelInfo.create(memGetAddress(struct + ExrCompressInfo.CHANNELS), nnum_channels(struct)); }
    /** Unsafe version of {@link #scratch}. */
    public static long nscratch(long struct) { return memGetAddress(struct + ExrCompressInfo.SCRATCH); }

    /** Unsafe version of {@link #src(ByteBuffer) src}. */
    public static void nsrc(long struct, ByteBuffer value) { memPutAddress(struct + ExrCompressInfo.SRC, memAddress(value)); nsrc_size(struct, value.remaining()); }
    /** Sets the specified value to the {@code src_size} field of the specified {@code struct}. */
    public static void nsrc_size(long struct, long value) { memPutAddress(struct + ExrCompressInfo.SRC_SIZE, value); }
    /** Unsafe version of {@link #dst(ByteBuffer) dst}. */
    public static void ndst(long struct, ByteBuffer value) { memPutAddress(struct + ExrCompressInfo.DST, memAddress(value)); ndst_capacity(struct, value.remaining()); }
    /** Sets the specified value to the {@code dst_capacity} field of the specified {@code struct}. */
    public static void ndst_capacity(long struct, long value) { memPutAddress(struct + ExrCompressInfo.DST_CAPACITY, value); }
    /** Unsafe version of {@link #out_size(PointerBuffer) out_size}. */
    public static void nout_size(long struct, PointerBuffer value) { memPutAddress(struct + ExrCompressInfo.OUT_SIZE, memAddress(value)); }
    /** Unsafe version of {@link #compression(int) compression}. */
    public static void ncompression(long struct, int value) { memPutInt(struct + ExrCompressInfo.COMPRESSION, value); }
    /** Unsafe version of {@link #compression_level(int) compression_level}. */
    public static void ncompression_level(long struct, int value) { memPutInt(struct + ExrCompressInfo.COMPRESSION_LEVEL, value); }
    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { memPutInt(struct + ExrCompressInfo.WIDTH, value); }
    /** Unsafe version of {@link #num_lines(int) num_lines}. */
    public static void nnum_lines(long struct, int value) { memPutInt(struct + ExrCompressInfo.NUM_LINES, value); }
    /** Sets the specified value to the {@code num_channels} field of the specified {@code struct}. */
    public static void nnum_channels(long struct, int value) { memPutInt(struct + ExrCompressInfo.NUM_CHANNELS, value); }
    /** Unsafe version of {@link #channels(ExrChannelInfo.Buffer) channels}. */
    public static void nchannels(long struct, ExrChannelInfo.Buffer value) { memPutAddress(struct + ExrCompressInfo.CHANNELS, value.address()); nnum_channels(struct, value.remaining()); }
    /** Unsafe version of {@link #scratch(long) scratch}. */
    public static void nscratch(long struct, long value) { memPutAddress(struct + ExrCompressInfo.SCRATCH, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + ExrCompressInfo.SRC));
        check(memGetAddress(struct + ExrCompressInfo.DST));
        check(memGetAddress(struct + ExrCompressInfo.OUT_SIZE));
        int num_channels = nnum_channels(struct);
        long channels = memGetAddress(struct + ExrCompressInfo.CHANNELS);
        check(channels);
        validate(channels, num_channels, ExrChannelInfo.SIZEOF, ExrChannelInfo::validate);
        check(memGetAddress(struct + ExrCompressInfo.SCRATCH));
    }

    // -----------------------------------

    /** An array of {@link ExrCompressInfo} structs. */
    public static class Buffer extends StructBuffer<ExrCompressInfo, Buffer> implements NativeResource {

        private static final ExrCompressInfo ELEMENT_FACTORY = ExrCompressInfo.create(-1L);

        /**
         * Creates a new {@code ExrCompressInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ExrCompressInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected ExrCompressInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code src} field. */
        @NativeType("void const *")
        public ByteBuffer src() { return ExrCompressInfo.nsrc(address()); }
        /** @return the value of the {@code src_size} field. */
        @NativeType("size_t")
        public long src_size() { return ExrCompressInfo.nsrc_size(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code dst} field. */
        @NativeType("void *")
        public ByteBuffer dst() { return ExrCompressInfo.ndst(address()); }
        /** @return the value of the {@code dst_capacity} field. */
        @NativeType("size_t")
        public long dst_capacity() { return ExrCompressInfo.ndst_capacity(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code out_size} field. */
        @NativeType("size_t *")
        public PointerBuffer out_size() { return ExrCompressInfo.nout_size(address()); }
        /** @return the value of the {@code compression} field. */
        @NativeType("uint32_t")
        public int compression() { return ExrCompressInfo.ncompression(address()); }
        /** @return the value of the {@code compression_level} field. */
        @NativeType("int32_t")
        public int compression_level() { return ExrCompressInfo.ncompression_level(address()); }
        /** @return the value of the {@code width} field. */
        @NativeType("int32_t")
        public int width() { return ExrCompressInfo.nwidth(address()); }
        /** @return the value of the {@code num_lines} field. */
        @NativeType("int32_t")
        public int num_lines() { return ExrCompressInfo.nnum_lines(address()); }
        /** @return the value of the {@code num_channels} field. */
        @NativeType("uint32_t")
        public int num_channels() { return ExrCompressInfo.nnum_channels(address()); }
        /** @return a {@link ExrChannelInfo.Buffer} view of the struct array pointed to by the {@code channels} field. */
        @NativeType("ExrChannelInfo const *")
        public ExrChannelInfo.Buffer channels() { return ExrCompressInfo.nchannels(address()); }
        /** @return the value of the {@code scratch} field. */
        @NativeType("ExrMemoryPool")
        public long scratch() { return ExrCompressInfo.nscratch(address()); }

        /** Sets the address of the specified {@link ByteBuffer} to the {@code src} field. */
        public ExrCompressInfo.Buffer src(@NativeType("void const *") ByteBuffer value) { ExrCompressInfo.nsrc(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code dst} field. */
        public ExrCompressInfo.Buffer dst(@NativeType("void *") ByteBuffer value) { ExrCompressInfo.ndst(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code out_size} field. */
        public ExrCompressInfo.Buffer out_size(@NativeType("size_t *") PointerBuffer value) { ExrCompressInfo.nout_size(address(), value); return this; }
        /** Sets the specified value to the {@code compression} field. */
        public ExrCompressInfo.Buffer compression(@NativeType("uint32_t") int value) { ExrCompressInfo.ncompression(address(), value); return this; }
        /** Sets the specified value to the {@code compression_level} field. */
        public ExrCompressInfo.Buffer compression_level(@NativeType("int32_t") int value) { ExrCompressInfo.ncompression_level(address(), value); return this; }
        /** Sets the specified value to the {@code width} field. */
        public ExrCompressInfo.Buffer width(@NativeType("int32_t") int value) { ExrCompressInfo.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code num_lines} field. */
        public ExrCompressInfo.Buffer num_lines(@NativeType("int32_t") int value) { ExrCompressInfo.nnum_lines(address(), value); return this; }
        /** Sets the address of the specified {@link ExrChannelInfo.Buffer} to the {@code channels} field. */
        public ExrCompressInfo.Buffer channels(@NativeType("ExrChannelInfo const *") ExrChannelInfo.Buffer value) { ExrCompressInfo.nchannels(address(), value); return this; }
        /** Sets the specified value to the {@code scratch} field. */
        public ExrCompressInfo.Buffer scratch(@NativeType("ExrMemoryPool") long value) { ExrCompressInfo.nscratch(address(), value); return this; }

    }

}