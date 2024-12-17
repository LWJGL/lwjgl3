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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct StdVideoAV1SequenceHeader {
 *     {@link StdVideoAV1SequenceHeaderFlags StdVideoAV1SequenceHeaderFlags} flags;
 *     StdVideoAV1Profile seq_profile;
 *     uint8_t frame_width_bits_minus_1;
 *     uint8_t frame_height_bits_minus_1;
 *     uint16_t max_frame_width_minus_1;
 *     uint16_t max_frame_height_minus_1;
 *     uint8_t delta_frame_id_length_minus_2;
 *     uint8_t additional_frame_id_length_minus_1;
 *     uint8_t order_hint_bits_minus_1;
 *     uint8_t seq_force_integer_mv;
 *     uint8_t seq_force_screen_content_tools;
 *     uint8_t reserved1[5];
 *     {@link StdVideoAV1ColorConfig StdVideoAV1ColorConfig} const * pColorConfig;
 *     {@link StdVideoAV1TimingInfo StdVideoAV1TimingInfo} const * pTimingInfo;
 * }}</pre>
 */
public class StdVideoAV1SequenceHeader extends Struct<StdVideoAV1SequenceHeader> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        SEQ_PROFILE,
        FRAME_WIDTH_BITS_MINUS_1,
        FRAME_HEIGHT_BITS_MINUS_1,
        MAX_FRAME_WIDTH_MINUS_1,
        MAX_FRAME_HEIGHT_MINUS_1,
        DELTA_FRAME_ID_LENGTH_MINUS_2,
        ADDITIONAL_FRAME_ID_LENGTH_MINUS_1,
        ORDER_HINT_BITS_MINUS_1,
        SEQ_FORCE_INTEGER_MV,
        SEQ_FORCE_SCREEN_CONTENT_TOOLS,
        RESERVED1,
        PCOLORCONFIG,
        PTIMINGINFO;

    static {
        Layout layout = __struct(
            __member(StdVideoAV1SequenceHeaderFlags.SIZEOF, StdVideoAV1SequenceHeaderFlags.ALIGNOF),
            __member(4),
            __member(1),
            __member(1),
            __member(2),
            __member(2),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __array(1, 5),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        SEQ_PROFILE = layout.offsetof(1);
        FRAME_WIDTH_BITS_MINUS_1 = layout.offsetof(2);
        FRAME_HEIGHT_BITS_MINUS_1 = layout.offsetof(3);
        MAX_FRAME_WIDTH_MINUS_1 = layout.offsetof(4);
        MAX_FRAME_HEIGHT_MINUS_1 = layout.offsetof(5);
        DELTA_FRAME_ID_LENGTH_MINUS_2 = layout.offsetof(6);
        ADDITIONAL_FRAME_ID_LENGTH_MINUS_1 = layout.offsetof(7);
        ORDER_HINT_BITS_MINUS_1 = layout.offsetof(8);
        SEQ_FORCE_INTEGER_MV = layout.offsetof(9);
        SEQ_FORCE_SCREEN_CONTENT_TOOLS = layout.offsetof(10);
        RESERVED1 = layout.offsetof(11);
        PCOLORCONFIG = layout.offsetof(12);
        PTIMINGINFO = layout.offsetof(13);
    }

    protected StdVideoAV1SequenceHeader(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoAV1SequenceHeader create(long address, @Nullable ByteBuffer container) {
        return new StdVideoAV1SequenceHeader(address, container);
    }

    /**
     * Creates a {@code StdVideoAV1SequenceHeader} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoAV1SequenceHeader(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link StdVideoAV1SequenceHeaderFlags} view of the {@code flags} field. */
    public StdVideoAV1SequenceHeaderFlags flags() { return nflags(address()); }
    /** @return the value of the {@code seq_profile} field. */
    @NativeType("StdVideoAV1Profile")
    public int seq_profile() { return nseq_profile(address()); }
    /** @return the value of the {@code frame_width_bits_minus_1} field. */
    @NativeType("uint8_t")
    public byte frame_width_bits_minus_1() { return nframe_width_bits_minus_1(address()); }
    /** @return the value of the {@code frame_height_bits_minus_1} field. */
    @NativeType("uint8_t")
    public byte frame_height_bits_minus_1() { return nframe_height_bits_minus_1(address()); }
    /** @return the value of the {@code max_frame_width_minus_1} field. */
    @NativeType("uint16_t")
    public short max_frame_width_minus_1() { return nmax_frame_width_minus_1(address()); }
    /** @return the value of the {@code max_frame_height_minus_1} field. */
    @NativeType("uint16_t")
    public short max_frame_height_minus_1() { return nmax_frame_height_minus_1(address()); }
    /** @return the value of the {@code delta_frame_id_length_minus_2} field. */
    @NativeType("uint8_t")
    public byte delta_frame_id_length_minus_2() { return ndelta_frame_id_length_minus_2(address()); }
    /** @return the value of the {@code additional_frame_id_length_minus_1} field. */
    @NativeType("uint8_t")
    public byte additional_frame_id_length_minus_1() { return nadditional_frame_id_length_minus_1(address()); }
    /** @return the value of the {@code order_hint_bits_minus_1} field. */
    @NativeType("uint8_t")
    public byte order_hint_bits_minus_1() { return norder_hint_bits_minus_1(address()); }
    /** @return the value of the {@code seq_force_integer_mv} field. */
    @NativeType("uint8_t")
    public byte seq_force_integer_mv() { return nseq_force_integer_mv(address()); }
    /** @return the value of the {@code seq_force_screen_content_tools} field. */
    @NativeType("uint8_t")
    public byte seq_force_screen_content_tools() { return nseq_force_screen_content_tools(address()); }
    /** @return a {@link StdVideoAV1ColorConfig} view of the struct pointed to by the {@code pColorConfig} field. */
    @NativeType("StdVideoAV1ColorConfig const *")
    public StdVideoAV1ColorConfig pColorConfig() { return npColorConfig(address()); }
    /** @return a {@link StdVideoAV1TimingInfo} view of the struct pointed to by the {@code pTimingInfo} field. */
    @NativeType("StdVideoAV1TimingInfo const *")
    public StdVideoAV1TimingInfo pTimingInfo() { return npTimingInfo(address()); }

    /** Copies the specified {@link StdVideoAV1SequenceHeaderFlags} to the {@code flags} field. */
    public StdVideoAV1SequenceHeader flags(StdVideoAV1SequenceHeaderFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoAV1SequenceHeader flags(java.util.function.Consumer<StdVideoAV1SequenceHeaderFlags> consumer) { consumer.accept(flags()); return this; }
    /** Sets the specified value to the {@code seq_profile} field. */
    public StdVideoAV1SequenceHeader seq_profile(@NativeType("StdVideoAV1Profile") int value) { nseq_profile(address(), value); return this; }
    /** Sets the specified value to the {@code frame_width_bits_minus_1} field. */
    public StdVideoAV1SequenceHeader frame_width_bits_minus_1(@NativeType("uint8_t") byte value) { nframe_width_bits_minus_1(address(), value); return this; }
    /** Sets the specified value to the {@code frame_height_bits_minus_1} field. */
    public StdVideoAV1SequenceHeader frame_height_bits_minus_1(@NativeType("uint8_t") byte value) { nframe_height_bits_minus_1(address(), value); return this; }
    /** Sets the specified value to the {@code max_frame_width_minus_1} field. */
    public StdVideoAV1SequenceHeader max_frame_width_minus_1(@NativeType("uint16_t") short value) { nmax_frame_width_minus_1(address(), value); return this; }
    /** Sets the specified value to the {@code max_frame_height_minus_1} field. */
    public StdVideoAV1SequenceHeader max_frame_height_minus_1(@NativeType("uint16_t") short value) { nmax_frame_height_minus_1(address(), value); return this; }
    /** Sets the specified value to the {@code delta_frame_id_length_minus_2} field. */
    public StdVideoAV1SequenceHeader delta_frame_id_length_minus_2(@NativeType("uint8_t") byte value) { ndelta_frame_id_length_minus_2(address(), value); return this; }
    /** Sets the specified value to the {@code additional_frame_id_length_minus_1} field. */
    public StdVideoAV1SequenceHeader additional_frame_id_length_minus_1(@NativeType("uint8_t") byte value) { nadditional_frame_id_length_minus_1(address(), value); return this; }
    /** Sets the specified value to the {@code order_hint_bits_minus_1} field. */
    public StdVideoAV1SequenceHeader order_hint_bits_minus_1(@NativeType("uint8_t") byte value) { norder_hint_bits_minus_1(address(), value); return this; }
    /** Sets the specified value to the {@code seq_force_integer_mv} field. */
    public StdVideoAV1SequenceHeader seq_force_integer_mv(@NativeType("uint8_t") byte value) { nseq_force_integer_mv(address(), value); return this; }
    /** Sets the specified value to the {@code seq_force_screen_content_tools} field. */
    public StdVideoAV1SequenceHeader seq_force_screen_content_tools(@NativeType("uint8_t") byte value) { nseq_force_screen_content_tools(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoAV1ColorConfig} to the {@code pColorConfig} field. */
    public StdVideoAV1SequenceHeader pColorConfig(@NativeType("StdVideoAV1ColorConfig const *") StdVideoAV1ColorConfig value) { npColorConfig(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoAV1TimingInfo} to the {@code pTimingInfo} field. */
    public StdVideoAV1SequenceHeader pTimingInfo(@NativeType("StdVideoAV1TimingInfo const *") StdVideoAV1TimingInfo value) { npTimingInfo(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoAV1SequenceHeader set(
        StdVideoAV1SequenceHeaderFlags flags,
        int seq_profile,
        byte frame_width_bits_minus_1,
        byte frame_height_bits_minus_1,
        short max_frame_width_minus_1,
        short max_frame_height_minus_1,
        byte delta_frame_id_length_minus_2,
        byte additional_frame_id_length_minus_1,
        byte order_hint_bits_minus_1,
        byte seq_force_integer_mv,
        byte seq_force_screen_content_tools,
        StdVideoAV1ColorConfig pColorConfig,
        StdVideoAV1TimingInfo pTimingInfo
    ) {
        flags(flags);
        seq_profile(seq_profile);
        frame_width_bits_minus_1(frame_width_bits_minus_1);
        frame_height_bits_minus_1(frame_height_bits_minus_1);
        max_frame_width_minus_1(max_frame_width_minus_1);
        max_frame_height_minus_1(max_frame_height_minus_1);
        delta_frame_id_length_minus_2(delta_frame_id_length_minus_2);
        additional_frame_id_length_minus_1(additional_frame_id_length_minus_1);
        order_hint_bits_minus_1(order_hint_bits_minus_1);
        seq_force_integer_mv(seq_force_integer_mv);
        seq_force_screen_content_tools(seq_force_screen_content_tools);
        pColorConfig(pColorConfig);
        pTimingInfo(pTimingInfo);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoAV1SequenceHeader set(StdVideoAV1SequenceHeader src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoAV1SequenceHeader} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoAV1SequenceHeader malloc() {
        return new StdVideoAV1SequenceHeader(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoAV1SequenceHeader} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoAV1SequenceHeader calloc() {
        return new StdVideoAV1SequenceHeader(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoAV1SequenceHeader} instance allocated with {@link BufferUtils}. */
    public static StdVideoAV1SequenceHeader create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoAV1SequenceHeader(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoAV1SequenceHeader} instance for the specified memory address. */
    public static StdVideoAV1SequenceHeader create(long address) {
        return new StdVideoAV1SequenceHeader(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable StdVideoAV1SequenceHeader createSafe(long address) {
        return address == NULL ? null : new StdVideoAV1SequenceHeader(address, null);
    }

    /**
     * Returns a new {@link StdVideoAV1SequenceHeader.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1SequenceHeader.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1SequenceHeader.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1SequenceHeader.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1SequenceHeader.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1SequenceHeader.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoAV1SequenceHeader.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1SequenceHeader.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static StdVideoAV1SequenceHeader.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoAV1SequenceHeader} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoAV1SequenceHeader malloc(MemoryStack stack) {
        return new StdVideoAV1SequenceHeader(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoAV1SequenceHeader} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoAV1SequenceHeader calloc(MemoryStack stack) {
        return new StdVideoAV1SequenceHeader(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoAV1SequenceHeader.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1SequenceHeader.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoAV1SequenceHeader.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoAV1SequenceHeader.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static StdVideoAV1SequenceHeaderFlags nflags(long struct) { return StdVideoAV1SequenceHeaderFlags.create(struct + StdVideoAV1SequenceHeader.FLAGS); }
    /** Unsafe version of {@link #seq_profile}. */
    public static int nseq_profile(long struct) { return memGetInt(struct + StdVideoAV1SequenceHeader.SEQ_PROFILE); }
    /** Unsafe version of {@link #frame_width_bits_minus_1}. */
    public static byte nframe_width_bits_minus_1(long struct) { return memGetByte(struct + StdVideoAV1SequenceHeader.FRAME_WIDTH_BITS_MINUS_1); }
    /** Unsafe version of {@link #frame_height_bits_minus_1}. */
    public static byte nframe_height_bits_minus_1(long struct) { return memGetByte(struct + StdVideoAV1SequenceHeader.FRAME_HEIGHT_BITS_MINUS_1); }
    /** Unsafe version of {@link #max_frame_width_minus_1}. */
    public static short nmax_frame_width_minus_1(long struct) { return memGetShort(struct + StdVideoAV1SequenceHeader.MAX_FRAME_WIDTH_MINUS_1); }
    /** Unsafe version of {@link #max_frame_height_minus_1}. */
    public static short nmax_frame_height_minus_1(long struct) { return memGetShort(struct + StdVideoAV1SequenceHeader.MAX_FRAME_HEIGHT_MINUS_1); }
    /** Unsafe version of {@link #delta_frame_id_length_minus_2}. */
    public static byte ndelta_frame_id_length_minus_2(long struct) { return memGetByte(struct + StdVideoAV1SequenceHeader.DELTA_FRAME_ID_LENGTH_MINUS_2); }
    /** Unsafe version of {@link #additional_frame_id_length_minus_1}. */
    public static byte nadditional_frame_id_length_minus_1(long struct) { return memGetByte(struct + StdVideoAV1SequenceHeader.ADDITIONAL_FRAME_ID_LENGTH_MINUS_1); }
    /** Unsafe version of {@link #order_hint_bits_minus_1}. */
    public static byte norder_hint_bits_minus_1(long struct) { return memGetByte(struct + StdVideoAV1SequenceHeader.ORDER_HINT_BITS_MINUS_1); }
    /** Unsafe version of {@link #seq_force_integer_mv}. */
    public static byte nseq_force_integer_mv(long struct) { return memGetByte(struct + StdVideoAV1SequenceHeader.SEQ_FORCE_INTEGER_MV); }
    /** Unsafe version of {@link #seq_force_screen_content_tools}. */
    public static byte nseq_force_screen_content_tools(long struct) { return memGetByte(struct + StdVideoAV1SequenceHeader.SEQ_FORCE_SCREEN_CONTENT_TOOLS); }
    public static ByteBuffer nreserved1(long struct) { return memByteBuffer(struct + StdVideoAV1SequenceHeader.RESERVED1, 5); }
    public static byte nreserved1(long struct, int index) {
        return memGetByte(struct + StdVideoAV1SequenceHeader.RESERVED1 + check(index, 5) * 1);
    }
    /** Unsafe version of {@link #pColorConfig}. */
    public static StdVideoAV1ColorConfig npColorConfig(long struct) { return StdVideoAV1ColorConfig.create(memGetAddress(struct + StdVideoAV1SequenceHeader.PCOLORCONFIG)); }
    /** Unsafe version of {@link #pTimingInfo}. */
    public static StdVideoAV1TimingInfo npTimingInfo(long struct) { return StdVideoAV1TimingInfo.create(memGetAddress(struct + StdVideoAV1SequenceHeader.PTIMINGINFO)); }

    /** Unsafe version of {@link #flags(StdVideoAV1SequenceHeaderFlags) flags}. */
    public static void nflags(long struct, StdVideoAV1SequenceHeaderFlags value) { memCopy(value.address(), struct + StdVideoAV1SequenceHeader.FLAGS, StdVideoAV1SequenceHeaderFlags.SIZEOF); }
    /** Unsafe version of {@link #seq_profile(int) seq_profile}. */
    public static void nseq_profile(long struct, int value) { memPutInt(struct + StdVideoAV1SequenceHeader.SEQ_PROFILE, value); }
    /** Unsafe version of {@link #frame_width_bits_minus_1(byte) frame_width_bits_minus_1}. */
    public static void nframe_width_bits_minus_1(long struct, byte value) { memPutByte(struct + StdVideoAV1SequenceHeader.FRAME_WIDTH_BITS_MINUS_1, value); }
    /** Unsafe version of {@link #frame_height_bits_minus_1(byte) frame_height_bits_minus_1}. */
    public static void nframe_height_bits_minus_1(long struct, byte value) { memPutByte(struct + StdVideoAV1SequenceHeader.FRAME_HEIGHT_BITS_MINUS_1, value); }
    /** Unsafe version of {@link #max_frame_width_minus_1(short) max_frame_width_minus_1}. */
    public static void nmax_frame_width_minus_1(long struct, short value) { memPutShort(struct + StdVideoAV1SequenceHeader.MAX_FRAME_WIDTH_MINUS_1, value); }
    /** Unsafe version of {@link #max_frame_height_minus_1(short) max_frame_height_minus_1}. */
    public static void nmax_frame_height_minus_1(long struct, short value) { memPutShort(struct + StdVideoAV1SequenceHeader.MAX_FRAME_HEIGHT_MINUS_1, value); }
    /** Unsafe version of {@link #delta_frame_id_length_minus_2(byte) delta_frame_id_length_minus_2}. */
    public static void ndelta_frame_id_length_minus_2(long struct, byte value) { memPutByte(struct + StdVideoAV1SequenceHeader.DELTA_FRAME_ID_LENGTH_MINUS_2, value); }
    /** Unsafe version of {@link #additional_frame_id_length_minus_1(byte) additional_frame_id_length_minus_1}. */
    public static void nadditional_frame_id_length_minus_1(long struct, byte value) { memPutByte(struct + StdVideoAV1SequenceHeader.ADDITIONAL_FRAME_ID_LENGTH_MINUS_1, value); }
    /** Unsafe version of {@link #order_hint_bits_minus_1(byte) order_hint_bits_minus_1}. */
    public static void norder_hint_bits_minus_1(long struct, byte value) { memPutByte(struct + StdVideoAV1SequenceHeader.ORDER_HINT_BITS_MINUS_1, value); }
    /** Unsafe version of {@link #seq_force_integer_mv(byte) seq_force_integer_mv}. */
    public static void nseq_force_integer_mv(long struct, byte value) { memPutByte(struct + StdVideoAV1SequenceHeader.SEQ_FORCE_INTEGER_MV, value); }
    /** Unsafe version of {@link #seq_force_screen_content_tools(byte) seq_force_screen_content_tools}. */
    public static void nseq_force_screen_content_tools(long struct, byte value) { memPutByte(struct + StdVideoAV1SequenceHeader.SEQ_FORCE_SCREEN_CONTENT_TOOLS, value); }
    public static void nreserved1(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 5); }
        memCopy(memAddress(value), struct + StdVideoAV1SequenceHeader.RESERVED1, value.remaining() * 1);
    }
    public static void nreserved1(long struct, int index, byte value) {
        memPutByte(struct + StdVideoAV1SequenceHeader.RESERVED1 + check(index, 5) * 1, value);
    }
    /** Unsafe version of {@link #pColorConfig(StdVideoAV1ColorConfig) pColorConfig}. */
    public static void npColorConfig(long struct, StdVideoAV1ColorConfig value) { memPutAddress(struct + StdVideoAV1SequenceHeader.PCOLORCONFIG, value.address()); }
    /** Unsafe version of {@link #pTimingInfo(StdVideoAV1TimingInfo) pTimingInfo}. */
    public static void npTimingInfo(long struct, StdVideoAV1TimingInfo value) { memPutAddress(struct + StdVideoAV1SequenceHeader.PTIMINGINFO, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + StdVideoAV1SequenceHeader.PCOLORCONFIG));
        check(memGetAddress(struct + StdVideoAV1SequenceHeader.PTIMINGINFO));
    }

    // -----------------------------------

    /** An array of {@link StdVideoAV1SequenceHeader} structs. */
    public static class Buffer extends StructBuffer<StdVideoAV1SequenceHeader, Buffer> implements NativeResource {

        private static final StdVideoAV1SequenceHeader ELEMENT_FACTORY = StdVideoAV1SequenceHeader.create(-1L);

        /**
         * Creates a new {@code StdVideoAV1SequenceHeader.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoAV1SequenceHeader#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoAV1SequenceHeader getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link StdVideoAV1SequenceHeaderFlags} view of the {@code flags} field. */
        public StdVideoAV1SequenceHeaderFlags flags() { return StdVideoAV1SequenceHeader.nflags(address()); }
        /** @return the value of the {@code seq_profile} field. */
        @NativeType("StdVideoAV1Profile")
        public int seq_profile() { return StdVideoAV1SequenceHeader.nseq_profile(address()); }
        /** @return the value of the {@code frame_width_bits_minus_1} field. */
        @NativeType("uint8_t")
        public byte frame_width_bits_minus_1() { return StdVideoAV1SequenceHeader.nframe_width_bits_minus_1(address()); }
        /** @return the value of the {@code frame_height_bits_minus_1} field. */
        @NativeType("uint8_t")
        public byte frame_height_bits_minus_1() { return StdVideoAV1SequenceHeader.nframe_height_bits_minus_1(address()); }
        /** @return the value of the {@code max_frame_width_minus_1} field. */
        @NativeType("uint16_t")
        public short max_frame_width_minus_1() { return StdVideoAV1SequenceHeader.nmax_frame_width_minus_1(address()); }
        /** @return the value of the {@code max_frame_height_minus_1} field. */
        @NativeType("uint16_t")
        public short max_frame_height_minus_1() { return StdVideoAV1SequenceHeader.nmax_frame_height_minus_1(address()); }
        /** @return the value of the {@code delta_frame_id_length_minus_2} field. */
        @NativeType("uint8_t")
        public byte delta_frame_id_length_minus_2() { return StdVideoAV1SequenceHeader.ndelta_frame_id_length_minus_2(address()); }
        /** @return the value of the {@code additional_frame_id_length_minus_1} field. */
        @NativeType("uint8_t")
        public byte additional_frame_id_length_minus_1() { return StdVideoAV1SequenceHeader.nadditional_frame_id_length_minus_1(address()); }
        /** @return the value of the {@code order_hint_bits_minus_1} field. */
        @NativeType("uint8_t")
        public byte order_hint_bits_minus_1() { return StdVideoAV1SequenceHeader.norder_hint_bits_minus_1(address()); }
        /** @return the value of the {@code seq_force_integer_mv} field. */
        @NativeType("uint8_t")
        public byte seq_force_integer_mv() { return StdVideoAV1SequenceHeader.nseq_force_integer_mv(address()); }
        /** @return the value of the {@code seq_force_screen_content_tools} field. */
        @NativeType("uint8_t")
        public byte seq_force_screen_content_tools() { return StdVideoAV1SequenceHeader.nseq_force_screen_content_tools(address()); }
        /** @return a {@link StdVideoAV1ColorConfig} view of the struct pointed to by the {@code pColorConfig} field. */
        @NativeType("StdVideoAV1ColorConfig const *")
        public StdVideoAV1ColorConfig pColorConfig() { return StdVideoAV1SequenceHeader.npColorConfig(address()); }
        /** @return a {@link StdVideoAV1TimingInfo} view of the struct pointed to by the {@code pTimingInfo} field. */
        @NativeType("StdVideoAV1TimingInfo const *")
        public StdVideoAV1TimingInfo pTimingInfo() { return StdVideoAV1SequenceHeader.npTimingInfo(address()); }

        /** Copies the specified {@link StdVideoAV1SequenceHeaderFlags} to the {@code flags} field. */
        public StdVideoAV1SequenceHeader.Buffer flags(StdVideoAV1SequenceHeaderFlags value) { StdVideoAV1SequenceHeader.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoAV1SequenceHeader.Buffer flags(java.util.function.Consumer<StdVideoAV1SequenceHeaderFlags> consumer) { consumer.accept(flags()); return this; }
        /** Sets the specified value to the {@code seq_profile} field. */
        public StdVideoAV1SequenceHeader.Buffer seq_profile(@NativeType("StdVideoAV1Profile") int value) { StdVideoAV1SequenceHeader.nseq_profile(address(), value); return this; }
        /** Sets the specified value to the {@code frame_width_bits_minus_1} field. */
        public StdVideoAV1SequenceHeader.Buffer frame_width_bits_minus_1(@NativeType("uint8_t") byte value) { StdVideoAV1SequenceHeader.nframe_width_bits_minus_1(address(), value); return this; }
        /** Sets the specified value to the {@code frame_height_bits_minus_1} field. */
        public StdVideoAV1SequenceHeader.Buffer frame_height_bits_minus_1(@NativeType("uint8_t") byte value) { StdVideoAV1SequenceHeader.nframe_height_bits_minus_1(address(), value); return this; }
        /** Sets the specified value to the {@code max_frame_width_minus_1} field. */
        public StdVideoAV1SequenceHeader.Buffer max_frame_width_minus_1(@NativeType("uint16_t") short value) { StdVideoAV1SequenceHeader.nmax_frame_width_minus_1(address(), value); return this; }
        /** Sets the specified value to the {@code max_frame_height_minus_1} field. */
        public StdVideoAV1SequenceHeader.Buffer max_frame_height_minus_1(@NativeType("uint16_t") short value) { StdVideoAV1SequenceHeader.nmax_frame_height_minus_1(address(), value); return this; }
        /** Sets the specified value to the {@code delta_frame_id_length_minus_2} field. */
        public StdVideoAV1SequenceHeader.Buffer delta_frame_id_length_minus_2(@NativeType("uint8_t") byte value) { StdVideoAV1SequenceHeader.ndelta_frame_id_length_minus_2(address(), value); return this; }
        /** Sets the specified value to the {@code additional_frame_id_length_minus_1} field. */
        public StdVideoAV1SequenceHeader.Buffer additional_frame_id_length_minus_1(@NativeType("uint8_t") byte value) { StdVideoAV1SequenceHeader.nadditional_frame_id_length_minus_1(address(), value); return this; }
        /** Sets the specified value to the {@code order_hint_bits_minus_1} field. */
        public StdVideoAV1SequenceHeader.Buffer order_hint_bits_minus_1(@NativeType("uint8_t") byte value) { StdVideoAV1SequenceHeader.norder_hint_bits_minus_1(address(), value); return this; }
        /** Sets the specified value to the {@code seq_force_integer_mv} field. */
        public StdVideoAV1SequenceHeader.Buffer seq_force_integer_mv(@NativeType("uint8_t") byte value) { StdVideoAV1SequenceHeader.nseq_force_integer_mv(address(), value); return this; }
        /** Sets the specified value to the {@code seq_force_screen_content_tools} field. */
        public StdVideoAV1SequenceHeader.Buffer seq_force_screen_content_tools(@NativeType("uint8_t") byte value) { StdVideoAV1SequenceHeader.nseq_force_screen_content_tools(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoAV1ColorConfig} to the {@code pColorConfig} field. */
        public StdVideoAV1SequenceHeader.Buffer pColorConfig(@NativeType("StdVideoAV1ColorConfig const *") StdVideoAV1ColorConfig value) { StdVideoAV1SequenceHeader.npColorConfig(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoAV1TimingInfo} to the {@code pTimingInfo} field. */
        public StdVideoAV1SequenceHeader.Buffer pTimingInfo(@NativeType("StdVideoAV1TimingInfo const *") StdVideoAV1TimingInfo value) { StdVideoAV1SequenceHeader.npTimingInfo(address(), value); return this; }

    }

}