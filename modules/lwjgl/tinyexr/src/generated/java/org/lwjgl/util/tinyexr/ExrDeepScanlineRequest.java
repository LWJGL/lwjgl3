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
 * struct ExrDeepScanlineRequest {
 *     ExrPart part;
 *     int32_t y_start;
 *     int32_t num_lines;
 *     {@link ExrDeepSampleInfo ExrDeepSampleInfo} * sample_info;
 *     {@link ExrBuffer ExrBuffer} output;
 *     uint32_t channels_mask;
 *     uint32_t output_pixel_type;
 * }</code></pre>
 */
public class ExrDeepScanlineRequest extends Struct<ExrDeepScanlineRequest> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PART,
        Y_START,
        NUM_LINES,
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
            __member(POINTER_SIZE),
            __member(ExrBuffer.SIZEOF, ExrBuffer.ALIGNOF),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PART = layout.offsetof(0);
        Y_START = layout.offsetof(1);
        NUM_LINES = layout.offsetof(2);
        SAMPLE_INFO = layout.offsetof(3);
        OUTPUT = layout.offsetof(4);
        CHANNELS_MASK = layout.offsetof(5);
        OUTPUT_PIXEL_TYPE = layout.offsetof(6);
    }

    protected ExrDeepScanlineRequest(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ExrDeepScanlineRequest create(long address, @Nullable ByteBuffer container) {
        return new ExrDeepScanlineRequest(address, container);
    }

    /**
     * Creates a {@code ExrDeepScanlineRequest} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ExrDeepScanlineRequest(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code part} field. */
    @NativeType("ExrPart")
    public long part() { return npart(address()); }
    /** @return the value of the {@code y_start} field. */
    @NativeType("int32_t")
    public int y_start() { return ny_start(address()); }
    /** @return the value of the {@code num_lines} field. */
    @NativeType("int32_t")
    public int num_lines() { return nnum_lines(address()); }
    /** @return a {@link ExrDeepSampleInfo} view of the struct pointed to by the {@code sample_info} field. */
    @NativeType("ExrDeepSampleInfo *")
    public ExrDeepSampleInfo sample_info() { return nsample_info(address()); }
    /** @return a {@link ExrBuffer} view of the {@code output} field. */
    public ExrBuffer output() { return noutput(address()); }
    /** @return the value of the {@code channels_mask} field. */
    @NativeType("uint32_t")
    public int channels_mask() { return nchannels_mask(address()); }
    /** @return the value of the {@code output_pixel_type} field. */
    @NativeType("uint32_t")
    public int output_pixel_type() { return noutput_pixel_type(address()); }

    /** Sets the specified value to the {@code part} field. */
    public ExrDeepScanlineRequest part(@NativeType("ExrPart") long value) { npart(address(), value); return this; }
    /** Sets the specified value to the {@code y_start} field. */
    public ExrDeepScanlineRequest y_start(@NativeType("int32_t") int value) { ny_start(address(), value); return this; }
    /** Sets the specified value to the {@code num_lines} field. */
    public ExrDeepScanlineRequest num_lines(@NativeType("int32_t") int value) { nnum_lines(address(), value); return this; }
    /** Sets the address of the specified {@link ExrDeepSampleInfo} to the {@code sample_info} field. */
    public ExrDeepScanlineRequest sample_info(@NativeType("ExrDeepSampleInfo *") ExrDeepSampleInfo value) { nsample_info(address(), value); return this; }
    /** Copies the specified {@link ExrBuffer} to the {@code output} field. */
    public ExrDeepScanlineRequest output(ExrBuffer value) { noutput(address(), value); return this; }
    /** Passes the {@code output} field to the specified {@link java.util.function.Consumer Consumer}. */
    public ExrDeepScanlineRequest output(java.util.function.Consumer<ExrBuffer> consumer) { consumer.accept(output()); return this; }
    /** Sets the specified value to the {@code channels_mask} field. */
    public ExrDeepScanlineRequest channels_mask(@NativeType("uint32_t") int value) { nchannels_mask(address(), value); return this; }
    /** Sets the specified value to the {@code output_pixel_type} field. */
    public ExrDeepScanlineRequest output_pixel_type(@NativeType("uint32_t") int value) { noutput_pixel_type(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ExrDeepScanlineRequest set(
        long part,
        int y_start,
        int num_lines,
        ExrDeepSampleInfo sample_info,
        ExrBuffer output,
        int channels_mask,
        int output_pixel_type
    ) {
        part(part);
        y_start(y_start);
        num_lines(num_lines);
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
    public ExrDeepScanlineRequest set(ExrDeepScanlineRequest src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ExrDeepScanlineRequest} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ExrDeepScanlineRequest malloc() {
        return new ExrDeepScanlineRequest(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ExrDeepScanlineRequest} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ExrDeepScanlineRequest calloc() {
        return new ExrDeepScanlineRequest(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ExrDeepScanlineRequest} instance allocated with {@link BufferUtils}. */
    public static ExrDeepScanlineRequest create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ExrDeepScanlineRequest(memAddress(container), container);
    }

    /** Returns a new {@code ExrDeepScanlineRequest} instance for the specified memory address. */
    public static ExrDeepScanlineRequest create(long address) {
        return new ExrDeepScanlineRequest(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ExrDeepScanlineRequest createSafe(long address) {
        return address == NULL ? null : new ExrDeepScanlineRequest(address, null);
    }

    /**
     * Returns a new {@link ExrDeepScanlineRequest.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrDeepScanlineRequest.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ExrDeepScanlineRequest.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrDeepScanlineRequest.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrDeepScanlineRequest.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ExrDeepScanlineRequest.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ExrDeepScanlineRequest.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ExrDeepScanlineRequest.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ExrDeepScanlineRequest.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ExrDeepScanlineRequest} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrDeepScanlineRequest malloc(MemoryStack stack) {
        return new ExrDeepScanlineRequest(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ExrDeepScanlineRequest} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrDeepScanlineRequest calloc(MemoryStack stack) {
        return new ExrDeepScanlineRequest(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ExrDeepScanlineRequest.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrDeepScanlineRequest.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrDeepScanlineRequest.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrDeepScanlineRequest.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #part}. */
    public static long npart(long struct) { return memGetAddress(struct + ExrDeepScanlineRequest.PART); }
    /** Unsafe version of {@link #y_start}. */
    public static int ny_start(long struct) { return memGetInt(struct + ExrDeepScanlineRequest.Y_START); }
    /** Unsafe version of {@link #num_lines}. */
    public static int nnum_lines(long struct) { return memGetInt(struct + ExrDeepScanlineRequest.NUM_LINES); }
    /** Unsafe version of {@link #sample_info}. */
    public static ExrDeepSampleInfo nsample_info(long struct) { return ExrDeepSampleInfo.create(memGetAddress(struct + ExrDeepScanlineRequest.SAMPLE_INFO)); }
    /** Unsafe version of {@link #output}. */
    public static ExrBuffer noutput(long struct) { return ExrBuffer.create(struct + ExrDeepScanlineRequest.OUTPUT); }
    /** Unsafe version of {@link #channels_mask}. */
    public static int nchannels_mask(long struct) { return memGetInt(struct + ExrDeepScanlineRequest.CHANNELS_MASK); }
    /** Unsafe version of {@link #output_pixel_type}. */
    public static int noutput_pixel_type(long struct) { return memGetInt(struct + ExrDeepScanlineRequest.OUTPUT_PIXEL_TYPE); }

    /** Unsafe version of {@link #part(long) part}. */
    public static void npart(long struct, long value) { memPutAddress(struct + ExrDeepScanlineRequest.PART, check(value)); }
    /** Unsafe version of {@link #y_start(int) y_start}. */
    public static void ny_start(long struct, int value) { memPutInt(struct + ExrDeepScanlineRequest.Y_START, value); }
    /** Unsafe version of {@link #num_lines(int) num_lines}. */
    public static void nnum_lines(long struct, int value) { memPutInt(struct + ExrDeepScanlineRequest.NUM_LINES, value); }
    /** Unsafe version of {@link #sample_info(ExrDeepSampleInfo) sample_info}. */
    public static void nsample_info(long struct, ExrDeepSampleInfo value) { memPutAddress(struct + ExrDeepScanlineRequest.SAMPLE_INFO, value.address()); }
    /** Unsafe version of {@link #output(ExrBuffer) output}. */
    public static void noutput(long struct, ExrBuffer value) { memCopy(value.address(), struct + ExrDeepScanlineRequest.OUTPUT, ExrBuffer.SIZEOF); }
    /** Unsafe version of {@link #channels_mask(int) channels_mask}. */
    public static void nchannels_mask(long struct, int value) { memPutInt(struct + ExrDeepScanlineRequest.CHANNELS_MASK, value); }
    /** Unsafe version of {@link #output_pixel_type(int) output_pixel_type}. */
    public static void noutput_pixel_type(long struct, int value) { memPutInt(struct + ExrDeepScanlineRequest.OUTPUT_PIXEL_TYPE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + ExrDeepScanlineRequest.PART));
        long sample_info = memGetAddress(struct + ExrDeepScanlineRequest.SAMPLE_INFO);
        check(sample_info);
        ExrDeepSampleInfo.validate(sample_info);
        ExrBuffer.validate(struct + ExrDeepScanlineRequest.OUTPUT);
    }

    // -----------------------------------

    /** An array of {@link ExrDeepScanlineRequest} structs. */
    public static class Buffer extends StructBuffer<ExrDeepScanlineRequest, Buffer> implements NativeResource {

        private static final ExrDeepScanlineRequest ELEMENT_FACTORY = ExrDeepScanlineRequest.create(-1L);

        /**
         * Creates a new {@code ExrDeepScanlineRequest.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ExrDeepScanlineRequest#SIZEOF}, and its mark will be undefined.</p>
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
        protected ExrDeepScanlineRequest getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code part} field. */
        @NativeType("ExrPart")
        public long part() { return ExrDeepScanlineRequest.npart(address()); }
        /** @return the value of the {@code y_start} field. */
        @NativeType("int32_t")
        public int y_start() { return ExrDeepScanlineRequest.ny_start(address()); }
        /** @return the value of the {@code num_lines} field. */
        @NativeType("int32_t")
        public int num_lines() { return ExrDeepScanlineRequest.nnum_lines(address()); }
        /** @return a {@link ExrDeepSampleInfo} view of the struct pointed to by the {@code sample_info} field. */
        @NativeType("ExrDeepSampleInfo *")
        public ExrDeepSampleInfo sample_info() { return ExrDeepScanlineRequest.nsample_info(address()); }
        /** @return a {@link ExrBuffer} view of the {@code output} field. */
        public ExrBuffer output() { return ExrDeepScanlineRequest.noutput(address()); }
        /** @return the value of the {@code channels_mask} field. */
        @NativeType("uint32_t")
        public int channels_mask() { return ExrDeepScanlineRequest.nchannels_mask(address()); }
        /** @return the value of the {@code output_pixel_type} field. */
        @NativeType("uint32_t")
        public int output_pixel_type() { return ExrDeepScanlineRequest.noutput_pixel_type(address()); }

        /** Sets the specified value to the {@code part} field. */
        public ExrDeepScanlineRequest.Buffer part(@NativeType("ExrPart") long value) { ExrDeepScanlineRequest.npart(address(), value); return this; }
        /** Sets the specified value to the {@code y_start} field. */
        public ExrDeepScanlineRequest.Buffer y_start(@NativeType("int32_t") int value) { ExrDeepScanlineRequest.ny_start(address(), value); return this; }
        /** Sets the specified value to the {@code num_lines} field. */
        public ExrDeepScanlineRequest.Buffer num_lines(@NativeType("int32_t") int value) { ExrDeepScanlineRequest.nnum_lines(address(), value); return this; }
        /** Sets the address of the specified {@link ExrDeepSampleInfo} to the {@code sample_info} field. */
        public ExrDeepScanlineRequest.Buffer sample_info(@NativeType("ExrDeepSampleInfo *") ExrDeepSampleInfo value) { ExrDeepScanlineRequest.nsample_info(address(), value); return this; }
        /** Copies the specified {@link ExrBuffer} to the {@code output} field. */
        public ExrDeepScanlineRequest.Buffer output(ExrBuffer value) { ExrDeepScanlineRequest.noutput(address(), value); return this; }
        /** Passes the {@code output} field to the specified {@link java.util.function.Consumer Consumer}. */
        public ExrDeepScanlineRequest.Buffer output(java.util.function.Consumer<ExrBuffer> consumer) { consumer.accept(output()); return this; }
        /** Sets the specified value to the {@code channels_mask} field. */
        public ExrDeepScanlineRequest.Buffer channels_mask(@NativeType("uint32_t") int value) { ExrDeepScanlineRequest.nchannels_mask(address(), value); return this; }
        /** Sets the specified value to the {@code output_pixel_type} field. */
        public ExrDeepScanlineRequest.Buffer output_pixel_type(@NativeType("uint32_t") int value) { ExrDeepScanlineRequest.noutput_pixel_type(address(), value); return this; }

    }

}