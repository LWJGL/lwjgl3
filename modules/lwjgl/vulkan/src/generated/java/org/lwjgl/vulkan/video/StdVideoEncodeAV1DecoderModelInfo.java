/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.video;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct StdVideoEncodeAV1DecoderModelInfo {
 *     uint8_t buffer_delay_length_minus_1;
 *     uint8_t buffer_removal_time_length_minus_1;
 *     uint8_t frame_presentation_time_length_minus_1;
 *     uint8_t reserved1;
 *     uint32_t num_units_in_decoding_tick;
 * }}</pre>
 */
public class StdVideoEncodeAV1DecoderModelInfo extends Struct<StdVideoEncodeAV1DecoderModelInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BUFFER_DELAY_LENGTH_MINUS_1,
        BUFFER_REMOVAL_TIME_LENGTH_MINUS_1,
        FRAME_PRESENTATION_TIME_LENGTH_MINUS_1,
        RESERVED1,
        NUM_UNITS_IN_DECODING_TICK;

    static {
        Layout layout = __struct(
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BUFFER_DELAY_LENGTH_MINUS_1 = layout.offsetof(0);
        BUFFER_REMOVAL_TIME_LENGTH_MINUS_1 = layout.offsetof(1);
        FRAME_PRESENTATION_TIME_LENGTH_MINUS_1 = layout.offsetof(2);
        RESERVED1 = layout.offsetof(3);
        NUM_UNITS_IN_DECODING_TICK = layout.offsetof(4);
    }

    protected StdVideoEncodeAV1DecoderModelInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoEncodeAV1DecoderModelInfo create(long address, @Nullable ByteBuffer container) {
        return new StdVideoEncodeAV1DecoderModelInfo(address, container);
    }

    /**
     * Creates a {@code StdVideoEncodeAV1DecoderModelInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoEncodeAV1DecoderModelInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code buffer_delay_length_minus_1} field. */
    @NativeType("uint8_t")
    public byte buffer_delay_length_minus_1() { return nbuffer_delay_length_minus_1(address()); }
    /** @return the value of the {@code buffer_removal_time_length_minus_1} field. */
    @NativeType("uint8_t")
    public byte buffer_removal_time_length_minus_1() { return nbuffer_removal_time_length_minus_1(address()); }
    /** @return the value of the {@code frame_presentation_time_length_minus_1} field. */
    @NativeType("uint8_t")
    public byte frame_presentation_time_length_minus_1() { return nframe_presentation_time_length_minus_1(address()); }
    /** @return the value of the {@code num_units_in_decoding_tick} field. */
    @NativeType("uint32_t")
    public int num_units_in_decoding_tick() { return nnum_units_in_decoding_tick(address()); }

    /** Sets the specified value to the {@code buffer_delay_length_minus_1} field. */
    public StdVideoEncodeAV1DecoderModelInfo buffer_delay_length_minus_1(@NativeType("uint8_t") byte value) { nbuffer_delay_length_minus_1(address(), value); return this; }
    /** Sets the specified value to the {@code buffer_removal_time_length_minus_1} field. */
    public StdVideoEncodeAV1DecoderModelInfo buffer_removal_time_length_minus_1(@NativeType("uint8_t") byte value) { nbuffer_removal_time_length_minus_1(address(), value); return this; }
    /** Sets the specified value to the {@code frame_presentation_time_length_minus_1} field. */
    public StdVideoEncodeAV1DecoderModelInfo frame_presentation_time_length_minus_1(@NativeType("uint8_t") byte value) { nframe_presentation_time_length_minus_1(address(), value); return this; }
    /** Sets the specified value to the {@code num_units_in_decoding_tick} field. */
    public StdVideoEncodeAV1DecoderModelInfo num_units_in_decoding_tick(@NativeType("uint32_t") int value) { nnum_units_in_decoding_tick(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoEncodeAV1DecoderModelInfo set(
        byte buffer_delay_length_minus_1,
        byte buffer_removal_time_length_minus_1,
        byte frame_presentation_time_length_minus_1,
        int num_units_in_decoding_tick
    ) {
        buffer_delay_length_minus_1(buffer_delay_length_minus_1);
        buffer_removal_time_length_minus_1(buffer_removal_time_length_minus_1);
        frame_presentation_time_length_minus_1(frame_presentation_time_length_minus_1);
        num_units_in_decoding_tick(num_units_in_decoding_tick);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoEncodeAV1DecoderModelInfo set(StdVideoEncodeAV1DecoderModelInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoEncodeAV1DecoderModelInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeAV1DecoderModelInfo malloc() {
        return new StdVideoEncodeAV1DecoderModelInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeAV1DecoderModelInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeAV1DecoderModelInfo calloc() {
        return new StdVideoEncodeAV1DecoderModelInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeAV1DecoderModelInfo} instance allocated with {@link BufferUtils}. */
    public static StdVideoEncodeAV1DecoderModelInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeAV1DecoderModelInfo(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoEncodeAV1DecoderModelInfo} instance for the specified memory address. */
    public static StdVideoEncodeAV1DecoderModelInfo create(long address) {
        return new StdVideoEncodeAV1DecoderModelInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable StdVideoEncodeAV1DecoderModelInfo createSafe(long address) {
        return address == NULL ? null : new StdVideoEncodeAV1DecoderModelInfo(address, null);
    }

    /**
     * Returns a new {@link StdVideoEncodeAV1DecoderModelInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeAV1DecoderModelInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeAV1DecoderModelInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeAV1DecoderModelInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeAV1DecoderModelInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeAV1DecoderModelInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoEncodeAV1DecoderModelInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeAV1DecoderModelInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static StdVideoEncodeAV1DecoderModelInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoEncodeAV1DecoderModelInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeAV1DecoderModelInfo malloc(MemoryStack stack) {
        return new StdVideoEncodeAV1DecoderModelInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoEncodeAV1DecoderModelInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeAV1DecoderModelInfo calloc(MemoryStack stack) {
        return new StdVideoEncodeAV1DecoderModelInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoEncodeAV1DecoderModelInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeAV1DecoderModelInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeAV1DecoderModelInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeAV1DecoderModelInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #buffer_delay_length_minus_1}. */
    public static byte nbuffer_delay_length_minus_1(long struct) { return memGetByte(struct + StdVideoEncodeAV1DecoderModelInfo.BUFFER_DELAY_LENGTH_MINUS_1); }
    /** Unsafe version of {@link #buffer_removal_time_length_minus_1}. */
    public static byte nbuffer_removal_time_length_minus_1(long struct) { return memGetByte(struct + StdVideoEncodeAV1DecoderModelInfo.BUFFER_REMOVAL_TIME_LENGTH_MINUS_1); }
    /** Unsafe version of {@link #frame_presentation_time_length_minus_1}. */
    public static byte nframe_presentation_time_length_minus_1(long struct) { return memGetByte(struct + StdVideoEncodeAV1DecoderModelInfo.FRAME_PRESENTATION_TIME_LENGTH_MINUS_1); }
    public static byte nreserved1(long struct) { return memGetByte(struct + StdVideoEncodeAV1DecoderModelInfo.RESERVED1); }
    /** Unsafe version of {@link #num_units_in_decoding_tick}. */
    public static int nnum_units_in_decoding_tick(long struct) { return memGetInt(struct + StdVideoEncodeAV1DecoderModelInfo.NUM_UNITS_IN_DECODING_TICK); }

    /** Unsafe version of {@link #buffer_delay_length_minus_1(byte) buffer_delay_length_minus_1}. */
    public static void nbuffer_delay_length_minus_1(long struct, byte value) { memPutByte(struct + StdVideoEncodeAV1DecoderModelInfo.BUFFER_DELAY_LENGTH_MINUS_1, value); }
    /** Unsafe version of {@link #buffer_removal_time_length_minus_1(byte) buffer_removal_time_length_minus_1}. */
    public static void nbuffer_removal_time_length_minus_1(long struct, byte value) { memPutByte(struct + StdVideoEncodeAV1DecoderModelInfo.BUFFER_REMOVAL_TIME_LENGTH_MINUS_1, value); }
    /** Unsafe version of {@link #frame_presentation_time_length_minus_1(byte) frame_presentation_time_length_minus_1}. */
    public static void nframe_presentation_time_length_minus_1(long struct, byte value) { memPutByte(struct + StdVideoEncodeAV1DecoderModelInfo.FRAME_PRESENTATION_TIME_LENGTH_MINUS_1, value); }
    public static void nreserved1(long struct, byte value) { memPutByte(struct + StdVideoEncodeAV1DecoderModelInfo.RESERVED1, value); }
    /** Unsafe version of {@link #num_units_in_decoding_tick(int) num_units_in_decoding_tick}. */
    public static void nnum_units_in_decoding_tick(long struct, int value) { memPutInt(struct + StdVideoEncodeAV1DecoderModelInfo.NUM_UNITS_IN_DECODING_TICK, value); }

    // -----------------------------------

    /** An array of {@link StdVideoEncodeAV1DecoderModelInfo} structs. */
    public static class Buffer extends StructBuffer<StdVideoEncodeAV1DecoderModelInfo, Buffer> implements NativeResource {

        private static final StdVideoEncodeAV1DecoderModelInfo ELEMENT_FACTORY = StdVideoEncodeAV1DecoderModelInfo.create(-1L);

        /**
         * Creates a new {@code StdVideoEncodeAV1DecoderModelInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoEncodeAV1DecoderModelInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoEncodeAV1DecoderModelInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code buffer_delay_length_minus_1} field. */
        @NativeType("uint8_t")
        public byte buffer_delay_length_minus_1() { return StdVideoEncodeAV1DecoderModelInfo.nbuffer_delay_length_minus_1(address()); }
        /** @return the value of the {@code buffer_removal_time_length_minus_1} field. */
        @NativeType("uint8_t")
        public byte buffer_removal_time_length_minus_1() { return StdVideoEncodeAV1DecoderModelInfo.nbuffer_removal_time_length_minus_1(address()); }
        /** @return the value of the {@code frame_presentation_time_length_minus_1} field. */
        @NativeType("uint8_t")
        public byte frame_presentation_time_length_minus_1() { return StdVideoEncodeAV1DecoderModelInfo.nframe_presentation_time_length_minus_1(address()); }
        /** @return the value of the {@code num_units_in_decoding_tick} field. */
        @NativeType("uint32_t")
        public int num_units_in_decoding_tick() { return StdVideoEncodeAV1DecoderModelInfo.nnum_units_in_decoding_tick(address()); }

        /** Sets the specified value to the {@code buffer_delay_length_minus_1} field. */
        public StdVideoEncodeAV1DecoderModelInfo.Buffer buffer_delay_length_minus_1(@NativeType("uint8_t") byte value) { StdVideoEncodeAV1DecoderModelInfo.nbuffer_delay_length_minus_1(address(), value); return this; }
        /** Sets the specified value to the {@code buffer_removal_time_length_minus_1} field. */
        public StdVideoEncodeAV1DecoderModelInfo.Buffer buffer_removal_time_length_minus_1(@NativeType("uint8_t") byte value) { StdVideoEncodeAV1DecoderModelInfo.nbuffer_removal_time_length_minus_1(address(), value); return this; }
        /** Sets the specified value to the {@code frame_presentation_time_length_minus_1} field. */
        public StdVideoEncodeAV1DecoderModelInfo.Buffer frame_presentation_time_length_minus_1(@NativeType("uint8_t") byte value) { StdVideoEncodeAV1DecoderModelInfo.nframe_presentation_time_length_minus_1(address(), value); return this; }
        /** Sets the specified value to the {@code num_units_in_decoding_tick} field. */
        public StdVideoEncodeAV1DecoderModelInfo.Buffer num_units_in_decoding_tick(@NativeType("uint32_t") int value) { StdVideoEncodeAV1DecoderModelInfo.nnum_units_in_decoding_tick(address(), value); return this; }

    }

}