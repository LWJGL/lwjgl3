/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.video;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.vulkan.video.STDVulkanVideoCodecH264.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct StdVideoH264HrdParameters {
 *     uint8_t cpb_cnt_minus1;
 *     uint8_t bit_rate_scale;
 *     uint8_t cpb_size_scale;
 *     uint32_t bit_rate_value_minus1[STD_VIDEO_H264_CPB_CNT_LIST_SIZE];
 *     uint32_t cpb_size_value_minus1[STD_VIDEO_H264_CPB_CNT_LIST_SIZE];
 *     uint8_t cbr_flag[STD_VIDEO_H264_CPB_CNT_LIST_SIZE];
 *     uint32_t initial_cpb_removal_delay_length_minus1;
 *     uint32_t cpb_removal_delay_length_minus1;
 *     uint32_t dpb_output_delay_length_minus1;
 *     uint32_t time_offset_length;
 * }</code></pre>
 */
public class StdVideoH264HrdParameters extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CPB_CNT_MINUS1,
        BIT_RATE_SCALE,
        CPB_SIZE_SCALE,
        BIT_RATE_VALUE_MINUS1,
        CPB_SIZE_VALUE_MINUS1,
        CBR_FLAG,
        INITIAL_CPB_REMOVAL_DELAY_LENGTH_MINUS1,
        CPB_REMOVAL_DELAY_LENGTH_MINUS1,
        DPB_OUTPUT_DELAY_LENGTH_MINUS1,
        TIME_OFFSET_LENGTH;

    static {
        Layout layout = __struct(
            __member(1),
            __member(1),
            __member(1),
            __array(4, STD_VIDEO_H264_CPB_CNT_LIST_SIZE),
            __array(4, STD_VIDEO_H264_CPB_CNT_LIST_SIZE),
            __array(1, STD_VIDEO_H264_CPB_CNT_LIST_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CPB_CNT_MINUS1 = layout.offsetof(0);
        BIT_RATE_SCALE = layout.offsetof(1);
        CPB_SIZE_SCALE = layout.offsetof(2);
        BIT_RATE_VALUE_MINUS1 = layout.offsetof(3);
        CPB_SIZE_VALUE_MINUS1 = layout.offsetof(4);
        CBR_FLAG = layout.offsetof(5);
        INITIAL_CPB_REMOVAL_DELAY_LENGTH_MINUS1 = layout.offsetof(6);
        CPB_REMOVAL_DELAY_LENGTH_MINUS1 = layout.offsetof(7);
        DPB_OUTPUT_DELAY_LENGTH_MINUS1 = layout.offsetof(8);
        TIME_OFFSET_LENGTH = layout.offsetof(9);
    }

    /**
     * Creates a {@code StdVideoH264HrdParameters} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoH264HrdParameters(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code cpb_cnt_minus1} field. */
    @NativeType("uint8_t")
    public byte cpb_cnt_minus1() { return ncpb_cnt_minus1(address()); }
    /** @return the value of the {@code bit_rate_scale} field. */
    @NativeType("uint8_t")
    public byte bit_rate_scale() { return nbit_rate_scale(address()); }
    /** @return the value of the {@code cpb_size_scale} field. */
    @NativeType("uint8_t")
    public byte cpb_size_scale() { return ncpb_size_scale(address()); }
    /** @return a {@link IntBuffer} view of the {@code bit_rate_value_minus1} field. */
    @NativeType("uint32_t[STD_VIDEO_H264_CPB_CNT_LIST_SIZE]")
    public IntBuffer bit_rate_value_minus1() { return nbit_rate_value_minus1(address()); }
    /** @return the value at the specified index of the {@code bit_rate_value_minus1} field. */
    @NativeType("uint32_t")
    public int bit_rate_value_minus1(int index) { return nbit_rate_value_minus1(address(), index); }
    /** @return a {@link IntBuffer} view of the {@code cpb_size_value_minus1} field. */
    @NativeType("uint32_t[STD_VIDEO_H264_CPB_CNT_LIST_SIZE]")
    public IntBuffer cpb_size_value_minus1() { return ncpb_size_value_minus1(address()); }
    /** @return the value at the specified index of the {@code cpb_size_value_minus1} field. */
    @NativeType("uint32_t")
    public int cpb_size_value_minus1(int index) { return ncpb_size_value_minus1(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code cbr_flag} field. */
    @NativeType("uint8_t[STD_VIDEO_H264_CPB_CNT_LIST_SIZE]")
    public ByteBuffer cbr_flag() { return ncbr_flag(address()); }
    /** @return the value at the specified index of the {@code cbr_flag} field. */
    @NativeType("uint8_t")
    public byte cbr_flag(int index) { return ncbr_flag(address(), index); }
    /** @return the value of the {@code initial_cpb_removal_delay_length_minus1} field. */
    @NativeType("uint32_t")
    public int initial_cpb_removal_delay_length_minus1() { return ninitial_cpb_removal_delay_length_minus1(address()); }
    /** @return the value of the {@code cpb_removal_delay_length_minus1} field. */
    @NativeType("uint32_t")
    public int cpb_removal_delay_length_minus1() { return ncpb_removal_delay_length_minus1(address()); }
    /** @return the value of the {@code dpb_output_delay_length_minus1} field. */
    @NativeType("uint32_t")
    public int dpb_output_delay_length_minus1() { return ndpb_output_delay_length_minus1(address()); }
    /** @return the value of the {@code time_offset_length} field. */
    @NativeType("uint32_t")
    public int time_offset_length() { return ntime_offset_length(address()); }

    /** Sets the specified value to the {@code cpb_cnt_minus1} field. */
    public StdVideoH264HrdParameters cpb_cnt_minus1(@NativeType("uint8_t") byte value) { ncpb_cnt_minus1(address(), value); return this; }
    /** Sets the specified value to the {@code bit_rate_scale} field. */
    public StdVideoH264HrdParameters bit_rate_scale(@NativeType("uint8_t") byte value) { nbit_rate_scale(address(), value); return this; }
    /** Sets the specified value to the {@code cpb_size_scale} field. */
    public StdVideoH264HrdParameters cpb_size_scale(@NativeType("uint8_t") byte value) { ncpb_size_scale(address(), value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code bit_rate_value_minus1} field. */
    public StdVideoH264HrdParameters bit_rate_value_minus1(@NativeType("uint32_t[STD_VIDEO_H264_CPB_CNT_LIST_SIZE]") IntBuffer value) { nbit_rate_value_minus1(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code bit_rate_value_minus1} field. */
    public StdVideoH264HrdParameters bit_rate_value_minus1(int index, @NativeType("uint32_t") int value) { nbit_rate_value_minus1(address(), index, value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code cpb_size_value_minus1} field. */
    public StdVideoH264HrdParameters cpb_size_value_minus1(@NativeType("uint32_t[STD_VIDEO_H264_CPB_CNT_LIST_SIZE]") IntBuffer value) { ncpb_size_value_minus1(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code cpb_size_value_minus1} field. */
    public StdVideoH264HrdParameters cpb_size_value_minus1(int index, @NativeType("uint32_t") int value) { ncpb_size_value_minus1(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code cbr_flag} field. */
    public StdVideoH264HrdParameters cbr_flag(@NativeType("uint8_t[STD_VIDEO_H264_CPB_CNT_LIST_SIZE]") ByteBuffer value) { ncbr_flag(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code cbr_flag} field. */
    public StdVideoH264HrdParameters cbr_flag(int index, @NativeType("uint8_t") byte value) { ncbr_flag(address(), index, value); return this; }
    /** Sets the specified value to the {@code initial_cpb_removal_delay_length_minus1} field. */
    public StdVideoH264HrdParameters initial_cpb_removal_delay_length_minus1(@NativeType("uint32_t") int value) { ninitial_cpb_removal_delay_length_minus1(address(), value); return this; }
    /** Sets the specified value to the {@code cpb_removal_delay_length_minus1} field. */
    public StdVideoH264HrdParameters cpb_removal_delay_length_minus1(@NativeType("uint32_t") int value) { ncpb_removal_delay_length_minus1(address(), value); return this; }
    /** Sets the specified value to the {@code dpb_output_delay_length_minus1} field. */
    public StdVideoH264HrdParameters dpb_output_delay_length_minus1(@NativeType("uint32_t") int value) { ndpb_output_delay_length_minus1(address(), value); return this; }
    /** Sets the specified value to the {@code time_offset_length} field. */
    public StdVideoH264HrdParameters time_offset_length(@NativeType("uint32_t") int value) { ntime_offset_length(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoH264HrdParameters set(
        byte cpb_cnt_minus1,
        byte bit_rate_scale,
        byte cpb_size_scale,
        IntBuffer bit_rate_value_minus1,
        IntBuffer cpb_size_value_minus1,
        ByteBuffer cbr_flag,
        int initial_cpb_removal_delay_length_minus1,
        int cpb_removal_delay_length_minus1,
        int dpb_output_delay_length_minus1,
        int time_offset_length
    ) {
        cpb_cnt_minus1(cpb_cnt_minus1);
        bit_rate_scale(bit_rate_scale);
        cpb_size_scale(cpb_size_scale);
        bit_rate_value_minus1(bit_rate_value_minus1);
        cpb_size_value_minus1(cpb_size_value_minus1);
        cbr_flag(cbr_flag);
        initial_cpb_removal_delay_length_minus1(initial_cpb_removal_delay_length_minus1);
        cpb_removal_delay_length_minus1(cpb_removal_delay_length_minus1);
        dpb_output_delay_length_minus1(dpb_output_delay_length_minus1);
        time_offset_length(time_offset_length);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoH264HrdParameters set(StdVideoH264HrdParameters src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoH264HrdParameters} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoH264HrdParameters malloc() {
        return wrap(StdVideoH264HrdParameters.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code StdVideoH264HrdParameters} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoH264HrdParameters calloc() {
        return wrap(StdVideoH264HrdParameters.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code StdVideoH264HrdParameters} instance allocated with {@link BufferUtils}. */
    public static StdVideoH264HrdParameters create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(StdVideoH264HrdParameters.class, memAddress(container), container);
    }

    /** Returns a new {@code StdVideoH264HrdParameters} instance for the specified memory address. */
    public static StdVideoH264HrdParameters create(long address) {
        return wrap(StdVideoH264HrdParameters.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH264HrdParameters createSafe(long address) {
        return address == NULL ? null : wrap(StdVideoH264HrdParameters.class, address);
    }

    /**
     * Returns a new {@link StdVideoH264HrdParameters.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH264HrdParameters.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoH264HrdParameters.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH264HrdParameters.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH264HrdParameters.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH264HrdParameters.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link StdVideoH264HrdParameters.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoH264HrdParameters.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH264HrdParameters.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code StdVideoH264HrdParameters} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH264HrdParameters malloc(MemoryStack stack) {
        return wrap(StdVideoH264HrdParameters.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code StdVideoH264HrdParameters} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH264HrdParameters calloc(MemoryStack stack) {
        return wrap(StdVideoH264HrdParameters.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link StdVideoH264HrdParameters.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH264HrdParameters.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH264HrdParameters.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH264HrdParameters.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #cpb_cnt_minus1}. */
    public static byte ncpb_cnt_minus1(long struct) { return UNSAFE.getByte(null, struct + StdVideoH264HrdParameters.CPB_CNT_MINUS1); }
    /** Unsafe version of {@link #bit_rate_scale}. */
    public static byte nbit_rate_scale(long struct) { return UNSAFE.getByte(null, struct + StdVideoH264HrdParameters.BIT_RATE_SCALE); }
    /** Unsafe version of {@link #cpb_size_scale}. */
    public static byte ncpb_size_scale(long struct) { return UNSAFE.getByte(null, struct + StdVideoH264HrdParameters.CPB_SIZE_SCALE); }
    /** Unsafe version of {@link #bit_rate_value_minus1}. */
    public static IntBuffer nbit_rate_value_minus1(long struct) { return memIntBuffer(struct + StdVideoH264HrdParameters.BIT_RATE_VALUE_MINUS1, STD_VIDEO_H264_CPB_CNT_LIST_SIZE); }
    /** Unsafe version of {@link #bit_rate_value_minus1(int) bit_rate_value_minus1}. */
    public static int nbit_rate_value_minus1(long struct, int index) {
        return UNSAFE.getInt(null, struct + StdVideoH264HrdParameters.BIT_RATE_VALUE_MINUS1 + check(index, STD_VIDEO_H264_CPB_CNT_LIST_SIZE) * 4);
    }
    /** Unsafe version of {@link #cpb_size_value_minus1}. */
    public static IntBuffer ncpb_size_value_minus1(long struct) { return memIntBuffer(struct + StdVideoH264HrdParameters.CPB_SIZE_VALUE_MINUS1, STD_VIDEO_H264_CPB_CNT_LIST_SIZE); }
    /** Unsafe version of {@link #cpb_size_value_minus1(int) cpb_size_value_minus1}. */
    public static int ncpb_size_value_minus1(long struct, int index) {
        return UNSAFE.getInt(null, struct + StdVideoH264HrdParameters.CPB_SIZE_VALUE_MINUS1 + check(index, STD_VIDEO_H264_CPB_CNT_LIST_SIZE) * 4);
    }
    /** Unsafe version of {@link #cbr_flag}. */
    public static ByteBuffer ncbr_flag(long struct) { return memByteBuffer(struct + StdVideoH264HrdParameters.CBR_FLAG, STD_VIDEO_H264_CPB_CNT_LIST_SIZE); }
    /** Unsafe version of {@link #cbr_flag(int) cbr_flag}. */
    public static byte ncbr_flag(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoH264HrdParameters.CBR_FLAG + check(index, STD_VIDEO_H264_CPB_CNT_LIST_SIZE) * 1);
    }
    /** Unsafe version of {@link #initial_cpb_removal_delay_length_minus1}. */
    public static int ninitial_cpb_removal_delay_length_minus1(long struct) { return UNSAFE.getInt(null, struct + StdVideoH264HrdParameters.INITIAL_CPB_REMOVAL_DELAY_LENGTH_MINUS1); }
    /** Unsafe version of {@link #cpb_removal_delay_length_minus1}. */
    public static int ncpb_removal_delay_length_minus1(long struct) { return UNSAFE.getInt(null, struct + StdVideoH264HrdParameters.CPB_REMOVAL_DELAY_LENGTH_MINUS1); }
    /** Unsafe version of {@link #dpb_output_delay_length_minus1}. */
    public static int ndpb_output_delay_length_minus1(long struct) { return UNSAFE.getInt(null, struct + StdVideoH264HrdParameters.DPB_OUTPUT_DELAY_LENGTH_MINUS1); }
    /** Unsafe version of {@link #time_offset_length}. */
    public static int ntime_offset_length(long struct) { return UNSAFE.getInt(null, struct + StdVideoH264HrdParameters.TIME_OFFSET_LENGTH); }

    /** Unsafe version of {@link #cpb_cnt_minus1(byte) cpb_cnt_minus1}. */
    public static void ncpb_cnt_minus1(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH264HrdParameters.CPB_CNT_MINUS1, value); }
    /** Unsafe version of {@link #bit_rate_scale(byte) bit_rate_scale}. */
    public static void nbit_rate_scale(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH264HrdParameters.BIT_RATE_SCALE, value); }
    /** Unsafe version of {@link #cpb_size_scale(byte) cpb_size_scale}. */
    public static void ncpb_size_scale(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH264HrdParameters.CPB_SIZE_SCALE, value); }
    /** Unsafe version of {@link #bit_rate_value_minus1(IntBuffer) bit_rate_value_minus1}. */
    public static void nbit_rate_value_minus1(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H264_CPB_CNT_LIST_SIZE); }
        memCopy(memAddress(value), struct + StdVideoH264HrdParameters.BIT_RATE_VALUE_MINUS1, value.remaining() * 4);
    }
    /** Unsafe version of {@link #bit_rate_value_minus1(int, int) bit_rate_value_minus1}. */
    public static void nbit_rate_value_minus1(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + StdVideoH264HrdParameters.BIT_RATE_VALUE_MINUS1 + check(index, STD_VIDEO_H264_CPB_CNT_LIST_SIZE) * 4, value);
    }
    /** Unsafe version of {@link #cpb_size_value_minus1(IntBuffer) cpb_size_value_minus1}. */
    public static void ncpb_size_value_minus1(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H264_CPB_CNT_LIST_SIZE); }
        memCopy(memAddress(value), struct + StdVideoH264HrdParameters.CPB_SIZE_VALUE_MINUS1, value.remaining() * 4);
    }
    /** Unsafe version of {@link #cpb_size_value_minus1(int, int) cpb_size_value_minus1}. */
    public static void ncpb_size_value_minus1(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + StdVideoH264HrdParameters.CPB_SIZE_VALUE_MINUS1 + check(index, STD_VIDEO_H264_CPB_CNT_LIST_SIZE) * 4, value);
    }
    /** Unsafe version of {@link #cbr_flag(ByteBuffer) cbr_flag}. */
    public static void ncbr_flag(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H264_CPB_CNT_LIST_SIZE); }
        memCopy(memAddress(value), struct + StdVideoH264HrdParameters.CBR_FLAG, value.remaining() * 1);
    }
    /** Unsafe version of {@link #cbr_flag(int, byte) cbr_flag}. */
    public static void ncbr_flag(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoH264HrdParameters.CBR_FLAG + check(index, STD_VIDEO_H264_CPB_CNT_LIST_SIZE) * 1, value);
    }
    /** Unsafe version of {@link #initial_cpb_removal_delay_length_minus1(int) initial_cpb_removal_delay_length_minus1}. */
    public static void ninitial_cpb_removal_delay_length_minus1(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH264HrdParameters.INITIAL_CPB_REMOVAL_DELAY_LENGTH_MINUS1, value); }
    /** Unsafe version of {@link #cpb_removal_delay_length_minus1(int) cpb_removal_delay_length_minus1}. */
    public static void ncpb_removal_delay_length_minus1(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH264HrdParameters.CPB_REMOVAL_DELAY_LENGTH_MINUS1, value); }
    /** Unsafe version of {@link #dpb_output_delay_length_minus1(int) dpb_output_delay_length_minus1}. */
    public static void ndpb_output_delay_length_minus1(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH264HrdParameters.DPB_OUTPUT_DELAY_LENGTH_MINUS1, value); }
    /** Unsafe version of {@link #time_offset_length(int) time_offset_length}. */
    public static void ntime_offset_length(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH264HrdParameters.TIME_OFFSET_LENGTH, value); }

    // -----------------------------------

    /** An array of {@link StdVideoH264HrdParameters} structs. */
    public static class Buffer extends StructBuffer<StdVideoH264HrdParameters, Buffer> implements NativeResource {

        private static final StdVideoH264HrdParameters ELEMENT_FACTORY = StdVideoH264HrdParameters.create(-1L);

        /**
         * Creates a new {@code StdVideoH264HrdParameters.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoH264HrdParameters#SIZEOF}, and its mark will be undefined.
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
        protected StdVideoH264HrdParameters getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code cpb_cnt_minus1} field. */
        @NativeType("uint8_t")
        public byte cpb_cnt_minus1() { return StdVideoH264HrdParameters.ncpb_cnt_minus1(address()); }
        /** @return the value of the {@code bit_rate_scale} field. */
        @NativeType("uint8_t")
        public byte bit_rate_scale() { return StdVideoH264HrdParameters.nbit_rate_scale(address()); }
        /** @return the value of the {@code cpb_size_scale} field. */
        @NativeType("uint8_t")
        public byte cpb_size_scale() { return StdVideoH264HrdParameters.ncpb_size_scale(address()); }
        /** @return a {@link IntBuffer} view of the {@code bit_rate_value_minus1} field. */
        @NativeType("uint32_t[STD_VIDEO_H264_CPB_CNT_LIST_SIZE]")
        public IntBuffer bit_rate_value_minus1() { return StdVideoH264HrdParameters.nbit_rate_value_minus1(address()); }
        /** @return the value at the specified index of the {@code bit_rate_value_minus1} field. */
        @NativeType("uint32_t")
        public int bit_rate_value_minus1(int index) { return StdVideoH264HrdParameters.nbit_rate_value_minus1(address(), index); }
        /** @return a {@link IntBuffer} view of the {@code cpb_size_value_minus1} field. */
        @NativeType("uint32_t[STD_VIDEO_H264_CPB_CNT_LIST_SIZE]")
        public IntBuffer cpb_size_value_minus1() { return StdVideoH264HrdParameters.ncpb_size_value_minus1(address()); }
        /** @return the value at the specified index of the {@code cpb_size_value_minus1} field. */
        @NativeType("uint32_t")
        public int cpb_size_value_minus1(int index) { return StdVideoH264HrdParameters.ncpb_size_value_minus1(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code cbr_flag} field. */
        @NativeType("uint8_t[STD_VIDEO_H264_CPB_CNT_LIST_SIZE]")
        public ByteBuffer cbr_flag() { return StdVideoH264HrdParameters.ncbr_flag(address()); }
        /** @return the value at the specified index of the {@code cbr_flag} field. */
        @NativeType("uint8_t")
        public byte cbr_flag(int index) { return StdVideoH264HrdParameters.ncbr_flag(address(), index); }
        /** @return the value of the {@code initial_cpb_removal_delay_length_minus1} field. */
        @NativeType("uint32_t")
        public int initial_cpb_removal_delay_length_minus1() { return StdVideoH264HrdParameters.ninitial_cpb_removal_delay_length_minus1(address()); }
        /** @return the value of the {@code cpb_removal_delay_length_minus1} field. */
        @NativeType("uint32_t")
        public int cpb_removal_delay_length_minus1() { return StdVideoH264HrdParameters.ncpb_removal_delay_length_minus1(address()); }
        /** @return the value of the {@code dpb_output_delay_length_minus1} field. */
        @NativeType("uint32_t")
        public int dpb_output_delay_length_minus1() { return StdVideoH264HrdParameters.ndpb_output_delay_length_minus1(address()); }
        /** @return the value of the {@code time_offset_length} field. */
        @NativeType("uint32_t")
        public int time_offset_length() { return StdVideoH264HrdParameters.ntime_offset_length(address()); }

        /** Sets the specified value to the {@code cpb_cnt_minus1} field. */
        public StdVideoH264HrdParameters.Buffer cpb_cnt_minus1(@NativeType("uint8_t") byte value) { StdVideoH264HrdParameters.ncpb_cnt_minus1(address(), value); return this; }
        /** Sets the specified value to the {@code bit_rate_scale} field. */
        public StdVideoH264HrdParameters.Buffer bit_rate_scale(@NativeType("uint8_t") byte value) { StdVideoH264HrdParameters.nbit_rate_scale(address(), value); return this; }
        /** Sets the specified value to the {@code cpb_size_scale} field. */
        public StdVideoH264HrdParameters.Buffer cpb_size_scale(@NativeType("uint8_t") byte value) { StdVideoH264HrdParameters.ncpb_size_scale(address(), value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code bit_rate_value_minus1} field. */
        public StdVideoH264HrdParameters.Buffer bit_rate_value_minus1(@NativeType("uint32_t[STD_VIDEO_H264_CPB_CNT_LIST_SIZE]") IntBuffer value) { StdVideoH264HrdParameters.nbit_rate_value_minus1(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code bit_rate_value_minus1} field. */
        public StdVideoH264HrdParameters.Buffer bit_rate_value_minus1(int index, @NativeType("uint32_t") int value) { StdVideoH264HrdParameters.nbit_rate_value_minus1(address(), index, value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code cpb_size_value_minus1} field. */
        public StdVideoH264HrdParameters.Buffer cpb_size_value_minus1(@NativeType("uint32_t[STD_VIDEO_H264_CPB_CNT_LIST_SIZE]") IntBuffer value) { StdVideoH264HrdParameters.ncpb_size_value_minus1(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code cpb_size_value_minus1} field. */
        public StdVideoH264HrdParameters.Buffer cpb_size_value_minus1(int index, @NativeType("uint32_t") int value) { StdVideoH264HrdParameters.ncpb_size_value_minus1(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code cbr_flag} field. */
        public StdVideoH264HrdParameters.Buffer cbr_flag(@NativeType("uint8_t[STD_VIDEO_H264_CPB_CNT_LIST_SIZE]") ByteBuffer value) { StdVideoH264HrdParameters.ncbr_flag(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code cbr_flag} field. */
        public StdVideoH264HrdParameters.Buffer cbr_flag(int index, @NativeType("uint8_t") byte value) { StdVideoH264HrdParameters.ncbr_flag(address(), index, value); return this; }
        /** Sets the specified value to the {@code initial_cpb_removal_delay_length_minus1} field. */
        public StdVideoH264HrdParameters.Buffer initial_cpb_removal_delay_length_minus1(@NativeType("uint32_t") int value) { StdVideoH264HrdParameters.ninitial_cpb_removal_delay_length_minus1(address(), value); return this; }
        /** Sets the specified value to the {@code cpb_removal_delay_length_minus1} field. */
        public StdVideoH264HrdParameters.Buffer cpb_removal_delay_length_minus1(@NativeType("uint32_t") int value) { StdVideoH264HrdParameters.ncpb_removal_delay_length_minus1(address(), value); return this; }
        /** Sets the specified value to the {@code dpb_output_delay_length_minus1} field. */
        public StdVideoH264HrdParameters.Buffer dpb_output_delay_length_minus1(@NativeType("uint32_t") int value) { StdVideoH264HrdParameters.ndpb_output_delay_length_minus1(address(), value); return this; }
        /** Sets the specified value to the {@code time_offset_length} field. */
        public StdVideoH264HrdParameters.Buffer time_offset_length(@NativeType("uint32_t") int value) { StdVideoH264HrdParameters.ntime_offset_length(address(), value); return this; }

    }

}