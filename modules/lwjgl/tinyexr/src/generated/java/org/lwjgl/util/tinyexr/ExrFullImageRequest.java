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
 * struct ExrFullImageRequest {
 *     ExrPart part;
 *     {@link ExrBuffer ExrBuffer} output;
 *     uint32_t channels_mask;
 *     uint32_t output_pixel_type;
 *     uint32_t output_layout;
 *     int32_t target_level;
 * }</code></pre>
 */
public class ExrFullImageRequest extends Struct<ExrFullImageRequest> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PART,
        OUTPUT,
        CHANNELS_MASK,
        OUTPUT_PIXEL_TYPE,
        OUTPUT_LAYOUT,
        TARGET_LEVEL;

    static {
        ExrBuffer.createSafe(NULL);

        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(ExrBuffer.SIZEOF, ExrBuffer.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PART = layout.offsetof(0);
        OUTPUT = layout.offsetof(1);
        CHANNELS_MASK = layout.offsetof(2);
        OUTPUT_PIXEL_TYPE = layout.offsetof(3);
        OUTPUT_LAYOUT = layout.offsetof(4);
        TARGET_LEVEL = layout.offsetof(5);
    }

    protected ExrFullImageRequest(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ExrFullImageRequest create(long address, @Nullable ByteBuffer container) {
        return new ExrFullImageRequest(address, container);
    }

    /**
     * Creates a {@code ExrFullImageRequest} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ExrFullImageRequest(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code part} field. */
    @NativeType("ExrPart")
    public long part() { return npart(address()); }
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
    /** @return the value of the {@code target_level} field. */
    @NativeType("int32_t")
    public int target_level() { return ntarget_level(address()); }

    /** Sets the specified value to the {@code part} field. */
    public ExrFullImageRequest part(@NativeType("ExrPart") long value) { npart(address(), value); return this; }
    /** Copies the specified {@link ExrBuffer} to the {@code output} field. */
    public ExrFullImageRequest output(ExrBuffer value) { noutput(address(), value); return this; }
    /** Passes the {@code output} field to the specified {@link java.util.function.Consumer Consumer}. */
    public ExrFullImageRequest output(java.util.function.Consumer<ExrBuffer> consumer) { consumer.accept(output()); return this; }
    /** Sets the specified value to the {@code channels_mask} field. */
    public ExrFullImageRequest channels_mask(@NativeType("uint32_t") int value) { nchannels_mask(address(), value); return this; }
    /** Sets the specified value to the {@code output_pixel_type} field. */
    public ExrFullImageRequest output_pixel_type(@NativeType("uint32_t") int value) { noutput_pixel_type(address(), value); return this; }
    /** Sets the specified value to the {@code output_layout} field. */
    public ExrFullImageRequest output_layout(@NativeType("uint32_t") int value) { noutput_layout(address(), value); return this; }
    /** Sets the specified value to the {@code target_level} field. */
    public ExrFullImageRequest target_level(@NativeType("int32_t") int value) { ntarget_level(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ExrFullImageRequest set(
        long part,
        ExrBuffer output,
        int channels_mask,
        int output_pixel_type,
        int output_layout,
        int target_level
    ) {
        part(part);
        output(output);
        channels_mask(channels_mask);
        output_pixel_type(output_pixel_type);
        output_layout(output_layout);
        target_level(target_level);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ExrFullImageRequest set(ExrFullImageRequest src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ExrFullImageRequest} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ExrFullImageRequest malloc() {
        return new ExrFullImageRequest(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ExrFullImageRequest} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ExrFullImageRequest calloc() {
        return new ExrFullImageRequest(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ExrFullImageRequest} instance allocated with {@link BufferUtils}. */
    public static ExrFullImageRequest create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ExrFullImageRequest(memAddress(container), container);
    }

    /** Returns a new {@code ExrFullImageRequest} instance for the specified memory address. */
    public static ExrFullImageRequest create(long address) {
        return new ExrFullImageRequest(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ExrFullImageRequest createSafe(long address) {
        return address == NULL ? null : new ExrFullImageRequest(address, null);
    }

    /**
     * Returns a new {@link ExrFullImageRequest.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrFullImageRequest.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ExrFullImageRequest.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ExrFullImageRequest.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrFullImageRequest.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ExrFullImageRequest.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ExrFullImageRequest.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ExrFullImageRequest.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ExrFullImageRequest.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ExrFullImageRequest} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrFullImageRequest malloc(MemoryStack stack) {
        return new ExrFullImageRequest(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ExrFullImageRequest} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ExrFullImageRequest calloc(MemoryStack stack) {
        return new ExrFullImageRequest(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ExrFullImageRequest.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrFullImageRequest.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ExrFullImageRequest.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ExrFullImageRequest.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #part}. */
    public static long npart(long struct) { return memGetAddress(struct + ExrFullImageRequest.PART); }
    /** Unsafe version of {@link #output}. */
    public static ExrBuffer noutput(long struct) { return ExrBuffer.create(struct + ExrFullImageRequest.OUTPUT); }
    /** Unsafe version of {@link #channels_mask}. */
    public static int nchannels_mask(long struct) { return memGetInt(struct + ExrFullImageRequest.CHANNELS_MASK); }
    /** Unsafe version of {@link #output_pixel_type}. */
    public static int noutput_pixel_type(long struct) { return memGetInt(struct + ExrFullImageRequest.OUTPUT_PIXEL_TYPE); }
    /** Unsafe version of {@link #output_layout}. */
    public static int noutput_layout(long struct) { return memGetInt(struct + ExrFullImageRequest.OUTPUT_LAYOUT); }
    /** Unsafe version of {@link #target_level}. */
    public static int ntarget_level(long struct) { return memGetInt(struct + ExrFullImageRequest.TARGET_LEVEL); }

    /** Unsafe version of {@link #part(long) part}. */
    public static void npart(long struct, long value) { memPutAddress(struct + ExrFullImageRequest.PART, check(value)); }
    /** Unsafe version of {@link #output(ExrBuffer) output}. */
    public static void noutput(long struct, ExrBuffer value) { memCopy(value.address(), struct + ExrFullImageRequest.OUTPUT, ExrBuffer.SIZEOF); }
    /** Unsafe version of {@link #channels_mask(int) channels_mask}. */
    public static void nchannels_mask(long struct, int value) { memPutInt(struct + ExrFullImageRequest.CHANNELS_MASK, value); }
    /** Unsafe version of {@link #output_pixel_type(int) output_pixel_type}. */
    public static void noutput_pixel_type(long struct, int value) { memPutInt(struct + ExrFullImageRequest.OUTPUT_PIXEL_TYPE, value); }
    /** Unsafe version of {@link #output_layout(int) output_layout}. */
    public static void noutput_layout(long struct, int value) { memPutInt(struct + ExrFullImageRequest.OUTPUT_LAYOUT, value); }
    /** Unsafe version of {@link #target_level(int) target_level}. */
    public static void ntarget_level(long struct, int value) { memPutInt(struct + ExrFullImageRequest.TARGET_LEVEL, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + ExrFullImageRequest.PART));
        ExrBuffer.validate(struct + ExrFullImageRequest.OUTPUT);
    }

    // -----------------------------------

    /** An array of {@link ExrFullImageRequest} structs. */
    public static class Buffer extends StructBuffer<ExrFullImageRequest, Buffer> implements NativeResource {

        private static final ExrFullImageRequest ELEMENT_FACTORY = ExrFullImageRequest.create(-1L);

        /**
         * Creates a new {@code ExrFullImageRequest.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ExrFullImageRequest#SIZEOF}, and its mark will be undefined.</p>
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
        protected ExrFullImageRequest getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code part} field. */
        @NativeType("ExrPart")
        public long part() { return ExrFullImageRequest.npart(address()); }
        /** @return a {@link ExrBuffer} view of the {@code output} field. */
        public ExrBuffer output() { return ExrFullImageRequest.noutput(address()); }
        /** @return the value of the {@code channels_mask} field. */
        @NativeType("uint32_t")
        public int channels_mask() { return ExrFullImageRequest.nchannels_mask(address()); }
        /** @return the value of the {@code output_pixel_type} field. */
        @NativeType("uint32_t")
        public int output_pixel_type() { return ExrFullImageRequest.noutput_pixel_type(address()); }
        /** @return the value of the {@code output_layout} field. */
        @NativeType("uint32_t")
        public int output_layout() { return ExrFullImageRequest.noutput_layout(address()); }
        /** @return the value of the {@code target_level} field. */
        @NativeType("int32_t")
        public int target_level() { return ExrFullImageRequest.ntarget_level(address()); }

        /** Sets the specified value to the {@code part} field. */
        public ExrFullImageRequest.Buffer part(@NativeType("ExrPart") long value) { ExrFullImageRequest.npart(address(), value); return this; }
        /** Copies the specified {@link ExrBuffer} to the {@code output} field. */
        public ExrFullImageRequest.Buffer output(ExrBuffer value) { ExrFullImageRequest.noutput(address(), value); return this; }
        /** Passes the {@code output} field to the specified {@link java.util.function.Consumer Consumer}. */
        public ExrFullImageRequest.Buffer output(java.util.function.Consumer<ExrBuffer> consumer) { consumer.accept(output()); return this; }
        /** Sets the specified value to the {@code channels_mask} field. */
        public ExrFullImageRequest.Buffer channels_mask(@NativeType("uint32_t") int value) { ExrFullImageRequest.nchannels_mask(address(), value); return this; }
        /** Sets the specified value to the {@code output_pixel_type} field. */
        public ExrFullImageRequest.Buffer output_pixel_type(@NativeType("uint32_t") int value) { ExrFullImageRequest.noutput_pixel_type(address(), value); return this; }
        /** Sets the specified value to the {@code output_layout} field. */
        public ExrFullImageRequest.Buffer output_layout(@NativeType("uint32_t") int value) { ExrFullImageRequest.noutput_layout(address(), value); return this; }
        /** Sets the specified value to the {@code target_level} field. */
        public ExrFullImageRequest.Buffer target_level(@NativeType("int32_t") int value) { ExrFullImageRequest.ntarget_level(address(), value); return this; }

    }

}