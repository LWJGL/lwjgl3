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
 * struct ExrScanlineRequest {
 *     ExrPart part;
 *     int32_t y_start;
 *     int32_t num_lines;
 *     {@link ExrBuffer ExrBuffer} output;
 *     uint32_t channels_mask;
 *     uint32_t output_pixel_type;
 *     uint32_t output_layout;
 * }</code></pre>
 */
public class ExrScanlineRequest extends Struct<ExrScanlineRequest> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PART,
        Y_START,
        NUM_LINES,
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
            __member(ExrBuffer.SIZEOF, ExrBuffer.ALIGNOF),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PART = layout.offsetof(0);
        Y_START = layout.offsetof(1);
        NUM_LINES = layout.offsetof(2);
        OUTPUT = layout.offsetof(3);
        CHANNELS_MASK = layout.offsetof(4);
        OUTPUT_PIXEL_TYPE = layout.offsetof(5);
        OUTPUT_LAYOUT = layout.offsetof(6);
    }

    protected ExrScanlineRequest(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ExrScanlineRequest create(long address, @Nullable ByteBuffer container) {
        return new ExrScanlineRequest(address, container);
    }

    /**
     * Creates a {@code ExrScanlineRequest} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ExrScanlineRequest(ByteBuffer container) {
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
    public ExrScanlineRequest part(@NativeType("ExrPart") long value) { npart(address(), value); return this; }
    /** Sets the specified value to the {@code y_start} field. */
    public ExrScanlineRequest y_start(@NativeType("int32_t") int value) { ny_start(address(), value); return this; }
    /** Sets the specified value to the {@code num_lines} field. */
    public ExrScanlineRequest num_lines(@NativeType("int32_t") int value) { nnum_lines(address(), value); return this; }
    /** Copies the specified {@link ExrBuffer} to the {@code output} field. */
    public ExrScanlineRequest output(ExrBuffer value) { noutput(address(), value); return this; }
    /** Passes the {@code output} field to the specified {@link java.util.function.Consumer Consumer}. */
    public ExrScanlineRequest output(java.util.function.Consumer<ExrBuffer> consumer) { consumer.accept(output()); return this; }
    /** Sets the specified value to the {@code channels_mask} field. */
    public ExrScanlineRequest channels_mask(@NativeType("uint32_t") int value) { nchannels_mask(address(), value); return this; }
    /** Sets the specified value to the {@code output_pixel_type} field. */
    public ExrScanlineRequest output_pixel_type(@NativeType("uint32_t") int value) { noutput_pixel_type(address(), value); return this; }
    /** Sets the specified value to the {@code output_layout} field. */
    public ExrScanlineRequest output_layout(@NativeType("uint32_t") int value) { noutput_layout(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ExrScanlineRequest set(
        long part,
        int y_start,
        int num_lines,
        ExrBuffer output,
        int channels_mask,
        int output_pixel_type,
        int output_layout
    ) {
        part(part);
        y_start(y_start);
        num_lines(num_lines);
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
    public ExrScanlineRequest set(ExrScanlineRequest src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ExrScanlineRequest} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ExrScanlineRequest malloc() {
        return new ExrScanlineRequest(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ExrScanlineRequest} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ExrScanlineRequest calloc() {
        return new ExrScanlineRequest(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ExrScanlineRequest} instance allocated with {@link BufferUtils}. */
    public static ExrScanlineRequest create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ExrScanlineRequest(memAddress(container), container);
    }

    /** Returns a new {@code ExrScanlineRequest} instance for the specified memory address. */
    public static ExrScanlineRequest create(long address) {
        return new ExrScanlineRequest(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ExrScanlineRequest createSafe(long address) {
        return address == NULL ? null : new ExrScanlineRequest(address, null);
    }

    /**
     * Returns a new {@link ExrScanlineRequest.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrScanlineRequest.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ExrScanlineRequest.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrScanlineRequest.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrScanlineRequest.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ExrScanlineRequest.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ExrScanlineRequest.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ExrScanlineRequest.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ExrScanlineRequest.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ExrScanlineRequest} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrScanlineRequest malloc(MemoryStack stack) {
        return new ExrScanlineRequest(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ExrScanlineRequest} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrScanlineRequest calloc(MemoryStack stack) {
        return new ExrScanlineRequest(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ExrScanlineRequest.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrScanlineRequest.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrScanlineRequest.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrScanlineRequest.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #part}. */
    public static long npart(long struct) { return memGetAddress(struct + ExrScanlineRequest.PART); }
    /** Unsafe version of {@link #y_start}. */
    public static int ny_start(long struct) { return memGetInt(struct + ExrScanlineRequest.Y_START); }
    /** Unsafe version of {@link #num_lines}. */
    public static int nnum_lines(long struct) { return memGetInt(struct + ExrScanlineRequest.NUM_LINES); }
    /** Unsafe version of {@link #output}. */
    public static ExrBuffer noutput(long struct) { return ExrBuffer.create(struct + ExrScanlineRequest.OUTPUT); }
    /** Unsafe version of {@link #channels_mask}. */
    public static int nchannels_mask(long struct) { return memGetInt(struct + ExrScanlineRequest.CHANNELS_MASK); }
    /** Unsafe version of {@link #output_pixel_type}. */
    public static int noutput_pixel_type(long struct) { return memGetInt(struct + ExrScanlineRequest.OUTPUT_PIXEL_TYPE); }
    /** Unsafe version of {@link #output_layout}. */
    public static int noutput_layout(long struct) { return memGetInt(struct + ExrScanlineRequest.OUTPUT_LAYOUT); }

    /** Unsafe version of {@link #part(long) part}. */
    public static void npart(long struct, long value) { memPutAddress(struct + ExrScanlineRequest.PART, check(value)); }
    /** Unsafe version of {@link #y_start(int) y_start}. */
    public static void ny_start(long struct, int value) { memPutInt(struct + ExrScanlineRequest.Y_START, value); }
    /** Unsafe version of {@link #num_lines(int) num_lines}. */
    public static void nnum_lines(long struct, int value) { memPutInt(struct + ExrScanlineRequest.NUM_LINES, value); }
    /** Unsafe version of {@link #output(ExrBuffer) output}. */
    public static void noutput(long struct, ExrBuffer value) { memCopy(value.address(), struct + ExrScanlineRequest.OUTPUT, ExrBuffer.SIZEOF); }
    /** Unsafe version of {@link #channels_mask(int) channels_mask}. */
    public static void nchannels_mask(long struct, int value) { memPutInt(struct + ExrScanlineRequest.CHANNELS_MASK, value); }
    /** Unsafe version of {@link #output_pixel_type(int) output_pixel_type}. */
    public static void noutput_pixel_type(long struct, int value) { memPutInt(struct + ExrScanlineRequest.OUTPUT_PIXEL_TYPE, value); }
    /** Unsafe version of {@link #output_layout(int) output_layout}. */
    public static void noutput_layout(long struct, int value) { memPutInt(struct + ExrScanlineRequest.OUTPUT_LAYOUT, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + ExrScanlineRequest.PART));
        ExrBuffer.validate(struct + ExrScanlineRequest.OUTPUT);
    }

    // -----------------------------------

    /** An array of {@link ExrScanlineRequest} structs. */
    public static class Buffer extends StructBuffer<ExrScanlineRequest, Buffer> implements NativeResource {

        private static final ExrScanlineRequest ELEMENT_FACTORY = ExrScanlineRequest.create(-1L);

        /**
         * Creates a new {@code ExrScanlineRequest.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ExrScanlineRequest#SIZEOF}, and its mark will be undefined.</p>
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
        protected ExrScanlineRequest getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code part} field. */
        @NativeType("ExrPart")
        public long part() { return ExrScanlineRequest.npart(address()); }
        /** @return the value of the {@code y_start} field. */
        @NativeType("int32_t")
        public int y_start() { return ExrScanlineRequest.ny_start(address()); }
        /** @return the value of the {@code num_lines} field. */
        @NativeType("int32_t")
        public int num_lines() { return ExrScanlineRequest.nnum_lines(address()); }
        /** @return a {@link ExrBuffer} view of the {@code output} field. */
        public ExrBuffer output() { return ExrScanlineRequest.noutput(address()); }
        /** @return the value of the {@code channels_mask} field. */
        @NativeType("uint32_t")
        public int channels_mask() { return ExrScanlineRequest.nchannels_mask(address()); }
        /** @return the value of the {@code output_pixel_type} field. */
        @NativeType("uint32_t")
        public int output_pixel_type() { return ExrScanlineRequest.noutput_pixel_type(address()); }
        /** @return the value of the {@code output_layout} field. */
        @NativeType("uint32_t")
        public int output_layout() { return ExrScanlineRequest.noutput_layout(address()); }

        /** Sets the specified value to the {@code part} field. */
        public ExrScanlineRequest.Buffer part(@NativeType("ExrPart") long value) { ExrScanlineRequest.npart(address(), value); return this; }
        /** Sets the specified value to the {@code y_start} field. */
        public ExrScanlineRequest.Buffer y_start(@NativeType("int32_t") int value) { ExrScanlineRequest.ny_start(address(), value); return this; }
        /** Sets the specified value to the {@code num_lines} field. */
        public ExrScanlineRequest.Buffer num_lines(@NativeType("int32_t") int value) { ExrScanlineRequest.nnum_lines(address(), value); return this; }
        /** Copies the specified {@link ExrBuffer} to the {@code output} field. */
        public ExrScanlineRequest.Buffer output(ExrBuffer value) { ExrScanlineRequest.noutput(address(), value); return this; }
        /** Passes the {@code output} field to the specified {@link java.util.function.Consumer Consumer}. */
        public ExrScanlineRequest.Buffer output(java.util.function.Consumer<ExrBuffer> consumer) { consumer.accept(output()); return this; }
        /** Sets the specified value to the {@code channels_mask} field. */
        public ExrScanlineRequest.Buffer channels_mask(@NativeType("uint32_t") int value) { ExrScanlineRequest.nchannels_mask(address(), value); return this; }
        /** Sets the specified value to the {@code output_pixel_type} field. */
        public ExrScanlineRequest.Buffer output_pixel_type(@NativeType("uint32_t") int value) { ExrScanlineRequest.noutput_pixel_type(address(), value); return this; }
        /** Sets the specified value to the {@code output_layout} field. */
        public ExrScanlineRequest.Buffer output_layout(@NativeType("uint32_t") int value) { ExrScanlineRequest.noutput_layout(address(), value); return this; }

    }

}