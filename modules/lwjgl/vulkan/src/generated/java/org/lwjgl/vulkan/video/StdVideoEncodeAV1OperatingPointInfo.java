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
 * struct StdVideoEncodeAV1OperatingPointInfo {
 *     {@link StdVideoEncodeAV1OperatingPointInfoFlags StdVideoEncodeAV1OperatingPointInfoFlags} flags;
 *     uint16_t operating_point_idc;
 *     uint8_t seq_level_idx;
 *     uint8_t seq_tier;
 *     uint32_t decoder_buffer_delay;
 *     uint32_t encoder_buffer_delay;
 *     uint8_t initial_display_delay_minus_1;
 * }}</pre>
 */
public class StdVideoEncodeAV1OperatingPointInfo extends Struct<StdVideoEncodeAV1OperatingPointInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        OPERATING_POINT_IDC,
        SEQ_LEVEL_IDX,
        SEQ_TIER,
        DECODER_BUFFER_DELAY,
        ENCODER_BUFFER_DELAY,
        INITIAL_DISPLAY_DELAY_MINUS_1;

    static {
        Layout layout = __struct(
            __member(StdVideoEncodeAV1OperatingPointInfoFlags.SIZEOF, StdVideoEncodeAV1OperatingPointInfoFlags.ALIGNOF),
            __member(2),
            __member(1),
            __member(1),
            __member(4),
            __member(4),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        OPERATING_POINT_IDC = layout.offsetof(1);
        SEQ_LEVEL_IDX = layout.offsetof(2);
        SEQ_TIER = layout.offsetof(3);
        DECODER_BUFFER_DELAY = layout.offsetof(4);
        ENCODER_BUFFER_DELAY = layout.offsetof(5);
        INITIAL_DISPLAY_DELAY_MINUS_1 = layout.offsetof(6);
    }

    protected StdVideoEncodeAV1OperatingPointInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoEncodeAV1OperatingPointInfo create(long address, @Nullable ByteBuffer container) {
        return new StdVideoEncodeAV1OperatingPointInfo(address, container);
    }

    /**
     * Creates a {@code StdVideoEncodeAV1OperatingPointInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoEncodeAV1OperatingPointInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link StdVideoEncodeAV1OperatingPointInfoFlags} view of the {@code flags} field. */
    public StdVideoEncodeAV1OperatingPointInfoFlags flags() { return nflags(address()); }
    /** @return the value of the {@code operating_point_idc} field. */
    @NativeType("uint16_t")
    public short operating_point_idc() { return noperating_point_idc(address()); }
    /** @return the value of the {@code seq_level_idx} field. */
    @NativeType("uint8_t")
    public byte seq_level_idx() { return nseq_level_idx(address()); }
    /** @return the value of the {@code seq_tier} field. */
    @NativeType("uint8_t")
    public byte seq_tier() { return nseq_tier(address()); }
    /** @return the value of the {@code decoder_buffer_delay} field. */
    @NativeType("uint32_t")
    public int decoder_buffer_delay() { return ndecoder_buffer_delay(address()); }
    /** @return the value of the {@code encoder_buffer_delay} field. */
    @NativeType("uint32_t")
    public int encoder_buffer_delay() { return nencoder_buffer_delay(address()); }
    /** @return the value of the {@code initial_display_delay_minus_1} field. */
    @NativeType("uint8_t")
    public byte initial_display_delay_minus_1() { return ninitial_display_delay_minus_1(address()); }

    /** Copies the specified {@link StdVideoEncodeAV1OperatingPointInfoFlags} to the {@code flags} field. */
    public StdVideoEncodeAV1OperatingPointInfo flags(StdVideoEncodeAV1OperatingPointInfoFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoEncodeAV1OperatingPointInfo flags(java.util.function.Consumer<StdVideoEncodeAV1OperatingPointInfoFlags> consumer) { consumer.accept(flags()); return this; }
    /** Sets the specified value to the {@code operating_point_idc} field. */
    public StdVideoEncodeAV1OperatingPointInfo operating_point_idc(@NativeType("uint16_t") short value) { noperating_point_idc(address(), value); return this; }
    /** Sets the specified value to the {@code seq_level_idx} field. */
    public StdVideoEncodeAV1OperatingPointInfo seq_level_idx(@NativeType("uint8_t") byte value) { nseq_level_idx(address(), value); return this; }
    /** Sets the specified value to the {@code seq_tier} field. */
    public StdVideoEncodeAV1OperatingPointInfo seq_tier(@NativeType("uint8_t") byte value) { nseq_tier(address(), value); return this; }
    /** Sets the specified value to the {@code decoder_buffer_delay} field. */
    public StdVideoEncodeAV1OperatingPointInfo decoder_buffer_delay(@NativeType("uint32_t") int value) { ndecoder_buffer_delay(address(), value); return this; }
    /** Sets the specified value to the {@code encoder_buffer_delay} field. */
    public StdVideoEncodeAV1OperatingPointInfo encoder_buffer_delay(@NativeType("uint32_t") int value) { nencoder_buffer_delay(address(), value); return this; }
    /** Sets the specified value to the {@code initial_display_delay_minus_1} field. */
    public StdVideoEncodeAV1OperatingPointInfo initial_display_delay_minus_1(@NativeType("uint8_t") byte value) { ninitial_display_delay_minus_1(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoEncodeAV1OperatingPointInfo set(
        StdVideoEncodeAV1OperatingPointInfoFlags flags,
        short operating_point_idc,
        byte seq_level_idx,
        byte seq_tier,
        int decoder_buffer_delay,
        int encoder_buffer_delay,
        byte initial_display_delay_minus_1
    ) {
        flags(flags);
        operating_point_idc(operating_point_idc);
        seq_level_idx(seq_level_idx);
        seq_tier(seq_tier);
        decoder_buffer_delay(decoder_buffer_delay);
        encoder_buffer_delay(encoder_buffer_delay);
        initial_display_delay_minus_1(initial_display_delay_minus_1);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoEncodeAV1OperatingPointInfo set(StdVideoEncodeAV1OperatingPointInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoEncodeAV1OperatingPointInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeAV1OperatingPointInfo malloc() {
        return new StdVideoEncodeAV1OperatingPointInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeAV1OperatingPointInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeAV1OperatingPointInfo calloc() {
        return new StdVideoEncodeAV1OperatingPointInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeAV1OperatingPointInfo} instance allocated with {@link BufferUtils}. */
    public static StdVideoEncodeAV1OperatingPointInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeAV1OperatingPointInfo(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoEncodeAV1OperatingPointInfo} instance for the specified memory address. */
    public static StdVideoEncodeAV1OperatingPointInfo create(long address) {
        return new StdVideoEncodeAV1OperatingPointInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable StdVideoEncodeAV1OperatingPointInfo createSafe(long address) {
        return address == NULL ? null : new StdVideoEncodeAV1OperatingPointInfo(address, null);
    }

    /**
     * Returns a new {@link StdVideoEncodeAV1OperatingPointInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeAV1OperatingPointInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeAV1OperatingPointInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeAV1OperatingPointInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeAV1OperatingPointInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeAV1OperatingPointInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoEncodeAV1OperatingPointInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeAV1OperatingPointInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static StdVideoEncodeAV1OperatingPointInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoEncodeAV1OperatingPointInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeAV1OperatingPointInfo malloc(MemoryStack stack) {
        return new StdVideoEncodeAV1OperatingPointInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoEncodeAV1OperatingPointInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeAV1OperatingPointInfo calloc(MemoryStack stack) {
        return new StdVideoEncodeAV1OperatingPointInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoEncodeAV1OperatingPointInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeAV1OperatingPointInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeAV1OperatingPointInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeAV1OperatingPointInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static StdVideoEncodeAV1OperatingPointInfoFlags nflags(long struct) { return StdVideoEncodeAV1OperatingPointInfoFlags.create(struct + StdVideoEncodeAV1OperatingPointInfo.FLAGS); }
    /** Unsafe version of {@link #operating_point_idc}. */
    public static short noperating_point_idc(long struct) { return memGetShort(struct + StdVideoEncodeAV1OperatingPointInfo.OPERATING_POINT_IDC); }
    /** Unsafe version of {@link #seq_level_idx}. */
    public static byte nseq_level_idx(long struct) { return memGetByte(struct + StdVideoEncodeAV1OperatingPointInfo.SEQ_LEVEL_IDX); }
    /** Unsafe version of {@link #seq_tier}. */
    public static byte nseq_tier(long struct) { return memGetByte(struct + StdVideoEncodeAV1OperatingPointInfo.SEQ_TIER); }
    /** Unsafe version of {@link #decoder_buffer_delay}. */
    public static int ndecoder_buffer_delay(long struct) { return memGetInt(struct + StdVideoEncodeAV1OperatingPointInfo.DECODER_BUFFER_DELAY); }
    /** Unsafe version of {@link #encoder_buffer_delay}. */
    public static int nencoder_buffer_delay(long struct) { return memGetInt(struct + StdVideoEncodeAV1OperatingPointInfo.ENCODER_BUFFER_DELAY); }
    /** Unsafe version of {@link #initial_display_delay_minus_1}. */
    public static byte ninitial_display_delay_minus_1(long struct) { return memGetByte(struct + StdVideoEncodeAV1OperatingPointInfo.INITIAL_DISPLAY_DELAY_MINUS_1); }

    /** Unsafe version of {@link #flags(StdVideoEncodeAV1OperatingPointInfoFlags) flags}. */
    public static void nflags(long struct, StdVideoEncodeAV1OperatingPointInfoFlags value) { memCopy(value.address(), struct + StdVideoEncodeAV1OperatingPointInfo.FLAGS, StdVideoEncodeAV1OperatingPointInfoFlags.SIZEOF); }
    /** Unsafe version of {@link #operating_point_idc(short) operating_point_idc}. */
    public static void noperating_point_idc(long struct, short value) { memPutShort(struct + StdVideoEncodeAV1OperatingPointInfo.OPERATING_POINT_IDC, value); }
    /** Unsafe version of {@link #seq_level_idx(byte) seq_level_idx}. */
    public static void nseq_level_idx(long struct, byte value) { memPutByte(struct + StdVideoEncodeAV1OperatingPointInfo.SEQ_LEVEL_IDX, value); }
    /** Unsafe version of {@link #seq_tier(byte) seq_tier}. */
    public static void nseq_tier(long struct, byte value) { memPutByte(struct + StdVideoEncodeAV1OperatingPointInfo.SEQ_TIER, value); }
    /** Unsafe version of {@link #decoder_buffer_delay(int) decoder_buffer_delay}. */
    public static void ndecoder_buffer_delay(long struct, int value) { memPutInt(struct + StdVideoEncodeAV1OperatingPointInfo.DECODER_BUFFER_DELAY, value); }
    /** Unsafe version of {@link #encoder_buffer_delay(int) encoder_buffer_delay}. */
    public static void nencoder_buffer_delay(long struct, int value) { memPutInt(struct + StdVideoEncodeAV1OperatingPointInfo.ENCODER_BUFFER_DELAY, value); }
    /** Unsafe version of {@link #initial_display_delay_minus_1(byte) initial_display_delay_minus_1}. */
    public static void ninitial_display_delay_minus_1(long struct, byte value) { memPutByte(struct + StdVideoEncodeAV1OperatingPointInfo.INITIAL_DISPLAY_DELAY_MINUS_1, value); }

    // -----------------------------------

    /** An array of {@link StdVideoEncodeAV1OperatingPointInfo} structs. */
    public static class Buffer extends StructBuffer<StdVideoEncodeAV1OperatingPointInfo, Buffer> implements NativeResource {

        private static final StdVideoEncodeAV1OperatingPointInfo ELEMENT_FACTORY = StdVideoEncodeAV1OperatingPointInfo.create(-1L);

        /**
         * Creates a new {@code StdVideoEncodeAV1OperatingPointInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoEncodeAV1OperatingPointInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoEncodeAV1OperatingPointInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link StdVideoEncodeAV1OperatingPointInfoFlags} view of the {@code flags} field. */
        public StdVideoEncodeAV1OperatingPointInfoFlags flags() { return StdVideoEncodeAV1OperatingPointInfo.nflags(address()); }
        /** @return the value of the {@code operating_point_idc} field. */
        @NativeType("uint16_t")
        public short operating_point_idc() { return StdVideoEncodeAV1OperatingPointInfo.noperating_point_idc(address()); }
        /** @return the value of the {@code seq_level_idx} field. */
        @NativeType("uint8_t")
        public byte seq_level_idx() { return StdVideoEncodeAV1OperatingPointInfo.nseq_level_idx(address()); }
        /** @return the value of the {@code seq_tier} field. */
        @NativeType("uint8_t")
        public byte seq_tier() { return StdVideoEncodeAV1OperatingPointInfo.nseq_tier(address()); }
        /** @return the value of the {@code decoder_buffer_delay} field. */
        @NativeType("uint32_t")
        public int decoder_buffer_delay() { return StdVideoEncodeAV1OperatingPointInfo.ndecoder_buffer_delay(address()); }
        /** @return the value of the {@code encoder_buffer_delay} field. */
        @NativeType("uint32_t")
        public int encoder_buffer_delay() { return StdVideoEncodeAV1OperatingPointInfo.nencoder_buffer_delay(address()); }
        /** @return the value of the {@code initial_display_delay_minus_1} field. */
        @NativeType("uint8_t")
        public byte initial_display_delay_minus_1() { return StdVideoEncodeAV1OperatingPointInfo.ninitial_display_delay_minus_1(address()); }

        /** Copies the specified {@link StdVideoEncodeAV1OperatingPointInfoFlags} to the {@code flags} field. */
        public StdVideoEncodeAV1OperatingPointInfo.Buffer flags(StdVideoEncodeAV1OperatingPointInfoFlags value) { StdVideoEncodeAV1OperatingPointInfo.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoEncodeAV1OperatingPointInfo.Buffer flags(java.util.function.Consumer<StdVideoEncodeAV1OperatingPointInfoFlags> consumer) { consumer.accept(flags()); return this; }
        /** Sets the specified value to the {@code operating_point_idc} field. */
        public StdVideoEncodeAV1OperatingPointInfo.Buffer operating_point_idc(@NativeType("uint16_t") short value) { StdVideoEncodeAV1OperatingPointInfo.noperating_point_idc(address(), value); return this; }
        /** Sets the specified value to the {@code seq_level_idx} field. */
        public StdVideoEncodeAV1OperatingPointInfo.Buffer seq_level_idx(@NativeType("uint8_t") byte value) { StdVideoEncodeAV1OperatingPointInfo.nseq_level_idx(address(), value); return this; }
        /** Sets the specified value to the {@code seq_tier} field. */
        public StdVideoEncodeAV1OperatingPointInfo.Buffer seq_tier(@NativeType("uint8_t") byte value) { StdVideoEncodeAV1OperatingPointInfo.nseq_tier(address(), value); return this; }
        /** Sets the specified value to the {@code decoder_buffer_delay} field. */
        public StdVideoEncodeAV1OperatingPointInfo.Buffer decoder_buffer_delay(@NativeType("uint32_t") int value) { StdVideoEncodeAV1OperatingPointInfo.ndecoder_buffer_delay(address(), value); return this; }
        /** Sets the specified value to the {@code encoder_buffer_delay} field. */
        public StdVideoEncodeAV1OperatingPointInfo.Buffer encoder_buffer_delay(@NativeType("uint32_t") int value) { StdVideoEncodeAV1OperatingPointInfo.nencoder_buffer_delay(address(), value); return this; }
        /** Sets the specified value to the {@code initial_display_delay_minus_1} field. */
        public StdVideoEncodeAV1OperatingPointInfo.Buffer initial_display_delay_minus_1(@NativeType("uint8_t") byte value) { StdVideoEncodeAV1OperatingPointInfo.ninitial_display_delay_minus_1(address(), value); return this; }

    }

}