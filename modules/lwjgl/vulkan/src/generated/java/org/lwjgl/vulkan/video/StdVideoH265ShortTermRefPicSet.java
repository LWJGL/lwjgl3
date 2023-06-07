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

import static org.lwjgl.vulkan.video.STDVulkanVideoCodecH265.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct StdVideoH265ShortTermRefPicSet {
 *     {@link StdVideoH265ShortTermRefPicSetFlags StdVideoH265ShortTermRefPicSetFlags} flags;
 *     uint32_t delta_idx_minus1;
 *     uint16_t use_delta_flag;
 *     uint16_t abs_delta_rps_minus1;
 *     uint16_t used_by_curr_pic_flag;
 *     uint16_t used_by_curr_pic_s0_flag;
 *     uint16_t used_by_curr_pic_s1_flag;
 *     uint16_t reserved1;
 *     uint8_t reserved2;
 *     uint8_t reserved3;
 *     uint8_t num_negative_pics;
 *     uint8_t num_positive_pics;
 *     uint16_t delta_poc_s0_minus1[STD_VIDEO_H265_MAX_DPB_SIZE];
 *     uint16_t delta_poc_s1_minus1[STD_VIDEO_H265_MAX_DPB_SIZE];
 * }</code></pre>
 */
public class StdVideoH265ShortTermRefPicSet extends Struct<StdVideoH265ShortTermRefPicSet> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        DELTA_IDX_MINUS1,
        USE_DELTA_FLAG,
        ABS_DELTA_RPS_MINUS1,
        USED_BY_CURR_PIC_FLAG,
        USED_BY_CURR_PIC_S0_FLAG,
        USED_BY_CURR_PIC_S1_FLAG,
        RESERVED1,
        RESERVED2,
        RESERVED3,
        NUM_NEGATIVE_PICS,
        NUM_POSITIVE_PICS,
        DELTA_POC_S0_MINUS1,
        DELTA_POC_S1_MINUS1;

    static {
        Layout layout = __struct(
            __member(StdVideoH265ShortTermRefPicSetFlags.SIZEOF, StdVideoH265ShortTermRefPicSetFlags.ALIGNOF),
            __member(4),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __array(2, STD_VIDEO_H265_MAX_DPB_SIZE),
            __array(2, STD_VIDEO_H265_MAX_DPB_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        DELTA_IDX_MINUS1 = layout.offsetof(1);
        USE_DELTA_FLAG = layout.offsetof(2);
        ABS_DELTA_RPS_MINUS1 = layout.offsetof(3);
        USED_BY_CURR_PIC_FLAG = layout.offsetof(4);
        USED_BY_CURR_PIC_S0_FLAG = layout.offsetof(5);
        USED_BY_CURR_PIC_S1_FLAG = layout.offsetof(6);
        RESERVED1 = layout.offsetof(7);
        RESERVED2 = layout.offsetof(8);
        RESERVED3 = layout.offsetof(9);
        NUM_NEGATIVE_PICS = layout.offsetof(10);
        NUM_POSITIVE_PICS = layout.offsetof(11);
        DELTA_POC_S0_MINUS1 = layout.offsetof(12);
        DELTA_POC_S1_MINUS1 = layout.offsetof(13);
    }

    protected StdVideoH265ShortTermRefPicSet(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoH265ShortTermRefPicSet create(long address, @Nullable ByteBuffer container) {
        return new StdVideoH265ShortTermRefPicSet(address, container);
    }

    /**
     * Creates a {@code StdVideoH265ShortTermRefPicSet} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoH265ShortTermRefPicSet(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link StdVideoH265ShortTermRefPicSetFlags} view of the {@code flags} field. */
    public StdVideoH265ShortTermRefPicSetFlags flags() { return nflags(address()); }
    /** @return the value of the {@code delta_idx_minus1} field. */
    @NativeType("uint32_t")
    public int delta_idx_minus1() { return ndelta_idx_minus1(address()); }
    /** @return the value of the {@code use_delta_flag} field. */
    @NativeType("uint16_t")
    public short use_delta_flag() { return nuse_delta_flag(address()); }
    /** @return the value of the {@code abs_delta_rps_minus1} field. */
    @NativeType("uint16_t")
    public short abs_delta_rps_minus1() { return nabs_delta_rps_minus1(address()); }
    /** @return the value of the {@code used_by_curr_pic_flag} field. */
    @NativeType("uint16_t")
    public short used_by_curr_pic_flag() { return nused_by_curr_pic_flag(address()); }
    /** @return the value of the {@code used_by_curr_pic_s0_flag} field. */
    @NativeType("uint16_t")
    public short used_by_curr_pic_s0_flag() { return nused_by_curr_pic_s0_flag(address()); }
    /** @return the value of the {@code used_by_curr_pic_s1_flag} field. */
    @NativeType("uint16_t")
    public short used_by_curr_pic_s1_flag() { return nused_by_curr_pic_s1_flag(address()); }
    /** @return the value of the {@code num_negative_pics} field. */
    @NativeType("uint8_t")
    public byte num_negative_pics() { return nnum_negative_pics(address()); }
    /** @return the value of the {@code num_positive_pics} field. */
    @NativeType("uint8_t")
    public byte num_positive_pics() { return nnum_positive_pics(address()); }
    /** @return a {@link ShortBuffer} view of the {@code delta_poc_s0_minus1} field. */
    @NativeType("uint16_t[STD_VIDEO_H265_MAX_DPB_SIZE]")
    public ShortBuffer delta_poc_s0_minus1() { return ndelta_poc_s0_minus1(address()); }
    /** @return the value at the specified index of the {@code delta_poc_s0_minus1} field. */
    @NativeType("uint16_t")
    public short delta_poc_s0_minus1(int index) { return ndelta_poc_s0_minus1(address(), index); }
    /** @return a {@link ShortBuffer} view of the {@code delta_poc_s1_minus1} field. */
    @NativeType("uint16_t[STD_VIDEO_H265_MAX_DPB_SIZE]")
    public ShortBuffer delta_poc_s1_minus1() { return ndelta_poc_s1_minus1(address()); }
    /** @return the value at the specified index of the {@code delta_poc_s1_minus1} field. */
    @NativeType("uint16_t")
    public short delta_poc_s1_minus1(int index) { return ndelta_poc_s1_minus1(address(), index); }

    /** Copies the specified {@link StdVideoH265ShortTermRefPicSetFlags} to the {@code flags} field. */
    public StdVideoH265ShortTermRefPicSet flags(StdVideoH265ShortTermRefPicSetFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoH265ShortTermRefPicSet flags(java.util.function.Consumer<StdVideoH265ShortTermRefPicSetFlags> consumer) { consumer.accept(flags()); return this; }
    /** Sets the specified value to the {@code delta_idx_minus1} field. */
    public StdVideoH265ShortTermRefPicSet delta_idx_minus1(@NativeType("uint32_t") int value) { ndelta_idx_minus1(address(), value); return this; }
    /** Sets the specified value to the {@code use_delta_flag} field. */
    public StdVideoH265ShortTermRefPicSet use_delta_flag(@NativeType("uint16_t") short value) { nuse_delta_flag(address(), value); return this; }
    /** Sets the specified value to the {@code abs_delta_rps_minus1} field. */
    public StdVideoH265ShortTermRefPicSet abs_delta_rps_minus1(@NativeType("uint16_t") short value) { nabs_delta_rps_minus1(address(), value); return this; }
    /** Sets the specified value to the {@code used_by_curr_pic_flag} field. */
    public StdVideoH265ShortTermRefPicSet used_by_curr_pic_flag(@NativeType("uint16_t") short value) { nused_by_curr_pic_flag(address(), value); return this; }
    /** Sets the specified value to the {@code used_by_curr_pic_s0_flag} field. */
    public StdVideoH265ShortTermRefPicSet used_by_curr_pic_s0_flag(@NativeType("uint16_t") short value) { nused_by_curr_pic_s0_flag(address(), value); return this; }
    /** Sets the specified value to the {@code used_by_curr_pic_s1_flag} field. */
    public StdVideoH265ShortTermRefPicSet used_by_curr_pic_s1_flag(@NativeType("uint16_t") short value) { nused_by_curr_pic_s1_flag(address(), value); return this; }
    /** Sets the specified value to the {@code num_negative_pics} field. */
    public StdVideoH265ShortTermRefPicSet num_negative_pics(@NativeType("uint8_t") byte value) { nnum_negative_pics(address(), value); return this; }
    /** Sets the specified value to the {@code num_positive_pics} field. */
    public StdVideoH265ShortTermRefPicSet num_positive_pics(@NativeType("uint8_t") byte value) { nnum_positive_pics(address(), value); return this; }
    /** Copies the specified {@link ShortBuffer} to the {@code delta_poc_s0_minus1} field. */
    public StdVideoH265ShortTermRefPicSet delta_poc_s0_minus1(@NativeType("uint16_t[STD_VIDEO_H265_MAX_DPB_SIZE]") ShortBuffer value) { ndelta_poc_s0_minus1(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code delta_poc_s0_minus1} field. */
    public StdVideoH265ShortTermRefPicSet delta_poc_s0_minus1(int index, @NativeType("uint16_t") short value) { ndelta_poc_s0_minus1(address(), index, value); return this; }
    /** Copies the specified {@link ShortBuffer} to the {@code delta_poc_s1_minus1} field. */
    public StdVideoH265ShortTermRefPicSet delta_poc_s1_minus1(@NativeType("uint16_t[STD_VIDEO_H265_MAX_DPB_SIZE]") ShortBuffer value) { ndelta_poc_s1_minus1(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code delta_poc_s1_minus1} field. */
    public StdVideoH265ShortTermRefPicSet delta_poc_s1_minus1(int index, @NativeType("uint16_t") short value) { ndelta_poc_s1_minus1(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoH265ShortTermRefPicSet set(
        StdVideoH265ShortTermRefPicSetFlags flags,
        int delta_idx_minus1,
        short use_delta_flag,
        short abs_delta_rps_minus1,
        short used_by_curr_pic_flag,
        short used_by_curr_pic_s0_flag,
        short used_by_curr_pic_s1_flag,
        byte num_negative_pics,
        byte num_positive_pics,
        ShortBuffer delta_poc_s0_minus1,
        ShortBuffer delta_poc_s1_minus1
    ) {
        flags(flags);
        delta_idx_minus1(delta_idx_minus1);
        use_delta_flag(use_delta_flag);
        abs_delta_rps_minus1(abs_delta_rps_minus1);
        used_by_curr_pic_flag(used_by_curr_pic_flag);
        used_by_curr_pic_s0_flag(used_by_curr_pic_s0_flag);
        used_by_curr_pic_s1_flag(used_by_curr_pic_s1_flag);
        num_negative_pics(num_negative_pics);
        num_positive_pics(num_positive_pics);
        delta_poc_s0_minus1(delta_poc_s0_minus1);
        delta_poc_s1_minus1(delta_poc_s1_minus1);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoH265ShortTermRefPicSet set(StdVideoH265ShortTermRefPicSet src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoH265ShortTermRefPicSet} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoH265ShortTermRefPicSet malloc() {
        return new StdVideoH265ShortTermRefPicSet(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoH265ShortTermRefPicSet} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoH265ShortTermRefPicSet calloc() {
        return new StdVideoH265ShortTermRefPicSet(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoH265ShortTermRefPicSet} instance allocated with {@link BufferUtils}. */
    public static StdVideoH265ShortTermRefPicSet create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoH265ShortTermRefPicSet(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoH265ShortTermRefPicSet} instance for the specified memory address. */
    public static StdVideoH265ShortTermRefPicSet create(long address) {
        return new StdVideoH265ShortTermRefPicSet(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH265ShortTermRefPicSet createSafe(long address) {
        return address == NULL ? null : new StdVideoH265ShortTermRefPicSet(address, null);
    }

    /**
     * Returns a new {@link StdVideoH265ShortTermRefPicSet.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265ShortTermRefPicSet.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265ShortTermRefPicSet.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265ShortTermRefPicSet.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265ShortTermRefPicSet.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265ShortTermRefPicSet.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoH265ShortTermRefPicSet.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoH265ShortTermRefPicSet.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH265ShortTermRefPicSet.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoH265ShortTermRefPicSet} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH265ShortTermRefPicSet malloc(MemoryStack stack) {
        return new StdVideoH265ShortTermRefPicSet(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoH265ShortTermRefPicSet} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH265ShortTermRefPicSet calloc(MemoryStack stack) {
        return new StdVideoH265ShortTermRefPicSet(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoH265ShortTermRefPicSet.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH265ShortTermRefPicSet.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265ShortTermRefPicSet.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH265ShortTermRefPicSet.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static StdVideoH265ShortTermRefPicSetFlags nflags(long struct) { return StdVideoH265ShortTermRefPicSetFlags.create(struct + StdVideoH265ShortTermRefPicSet.FLAGS); }
    /** Unsafe version of {@link #delta_idx_minus1}. */
    public static int ndelta_idx_minus1(long struct) { return UNSAFE.getInt(null, struct + StdVideoH265ShortTermRefPicSet.DELTA_IDX_MINUS1); }
    /** Unsafe version of {@link #use_delta_flag}. */
    public static short nuse_delta_flag(long struct) { return UNSAFE.getShort(null, struct + StdVideoH265ShortTermRefPicSet.USE_DELTA_FLAG); }
    /** Unsafe version of {@link #abs_delta_rps_minus1}. */
    public static short nabs_delta_rps_minus1(long struct) { return UNSAFE.getShort(null, struct + StdVideoH265ShortTermRefPicSet.ABS_DELTA_RPS_MINUS1); }
    /** Unsafe version of {@link #used_by_curr_pic_flag}. */
    public static short nused_by_curr_pic_flag(long struct) { return UNSAFE.getShort(null, struct + StdVideoH265ShortTermRefPicSet.USED_BY_CURR_PIC_FLAG); }
    /** Unsafe version of {@link #used_by_curr_pic_s0_flag}. */
    public static short nused_by_curr_pic_s0_flag(long struct) { return UNSAFE.getShort(null, struct + StdVideoH265ShortTermRefPicSet.USED_BY_CURR_PIC_S0_FLAG); }
    /** Unsafe version of {@link #used_by_curr_pic_s1_flag}. */
    public static short nused_by_curr_pic_s1_flag(long struct) { return UNSAFE.getShort(null, struct + StdVideoH265ShortTermRefPicSet.USED_BY_CURR_PIC_S1_FLAG); }
    public static short nreserved1(long struct) { return UNSAFE.getShort(null, struct + StdVideoH265ShortTermRefPicSet.RESERVED1); }
    public static byte nreserved2(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265ShortTermRefPicSet.RESERVED2); }
    public static byte nreserved3(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265ShortTermRefPicSet.RESERVED3); }
    /** Unsafe version of {@link #num_negative_pics}. */
    public static byte nnum_negative_pics(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265ShortTermRefPicSet.NUM_NEGATIVE_PICS); }
    /** Unsafe version of {@link #num_positive_pics}. */
    public static byte nnum_positive_pics(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265ShortTermRefPicSet.NUM_POSITIVE_PICS); }
    /** Unsafe version of {@link #delta_poc_s0_minus1}. */
    public static ShortBuffer ndelta_poc_s0_minus1(long struct) { return memShortBuffer(struct + StdVideoH265ShortTermRefPicSet.DELTA_POC_S0_MINUS1, STD_VIDEO_H265_MAX_DPB_SIZE); }
    /** Unsafe version of {@link #delta_poc_s0_minus1(int) delta_poc_s0_minus1}. */
    public static short ndelta_poc_s0_minus1(long struct, int index) {
        return UNSAFE.getShort(null, struct + StdVideoH265ShortTermRefPicSet.DELTA_POC_S0_MINUS1 + check(index, STD_VIDEO_H265_MAX_DPB_SIZE) * 2);
    }
    /** Unsafe version of {@link #delta_poc_s1_minus1}. */
    public static ShortBuffer ndelta_poc_s1_minus1(long struct) { return memShortBuffer(struct + StdVideoH265ShortTermRefPicSet.DELTA_POC_S1_MINUS1, STD_VIDEO_H265_MAX_DPB_SIZE); }
    /** Unsafe version of {@link #delta_poc_s1_minus1(int) delta_poc_s1_minus1}. */
    public static short ndelta_poc_s1_minus1(long struct, int index) {
        return UNSAFE.getShort(null, struct + StdVideoH265ShortTermRefPicSet.DELTA_POC_S1_MINUS1 + check(index, STD_VIDEO_H265_MAX_DPB_SIZE) * 2);
    }

    /** Unsafe version of {@link #flags(StdVideoH265ShortTermRefPicSetFlags) flags}. */
    public static void nflags(long struct, StdVideoH265ShortTermRefPicSetFlags value) { memCopy(value.address(), struct + StdVideoH265ShortTermRefPicSet.FLAGS, StdVideoH265ShortTermRefPicSetFlags.SIZEOF); }
    /** Unsafe version of {@link #delta_idx_minus1(int) delta_idx_minus1}. */
    public static void ndelta_idx_minus1(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH265ShortTermRefPicSet.DELTA_IDX_MINUS1, value); }
    /** Unsafe version of {@link #use_delta_flag(short) use_delta_flag}. */
    public static void nuse_delta_flag(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoH265ShortTermRefPicSet.USE_DELTA_FLAG, value); }
    /** Unsafe version of {@link #abs_delta_rps_minus1(short) abs_delta_rps_minus1}. */
    public static void nabs_delta_rps_minus1(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoH265ShortTermRefPicSet.ABS_DELTA_RPS_MINUS1, value); }
    /** Unsafe version of {@link #used_by_curr_pic_flag(short) used_by_curr_pic_flag}. */
    public static void nused_by_curr_pic_flag(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoH265ShortTermRefPicSet.USED_BY_CURR_PIC_FLAG, value); }
    /** Unsafe version of {@link #used_by_curr_pic_s0_flag(short) used_by_curr_pic_s0_flag}. */
    public static void nused_by_curr_pic_s0_flag(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoH265ShortTermRefPicSet.USED_BY_CURR_PIC_S0_FLAG, value); }
    /** Unsafe version of {@link #used_by_curr_pic_s1_flag(short) used_by_curr_pic_s1_flag}. */
    public static void nused_by_curr_pic_s1_flag(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoH265ShortTermRefPicSet.USED_BY_CURR_PIC_S1_FLAG, value); }
    public static void nreserved1(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoH265ShortTermRefPicSet.RESERVED1, value); }
    public static void nreserved2(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265ShortTermRefPicSet.RESERVED2, value); }
    public static void nreserved3(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265ShortTermRefPicSet.RESERVED3, value); }
    /** Unsafe version of {@link #num_negative_pics(byte) num_negative_pics}. */
    public static void nnum_negative_pics(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265ShortTermRefPicSet.NUM_NEGATIVE_PICS, value); }
    /** Unsafe version of {@link #num_positive_pics(byte) num_positive_pics}. */
    public static void nnum_positive_pics(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265ShortTermRefPicSet.NUM_POSITIVE_PICS, value); }
    /** Unsafe version of {@link #delta_poc_s0_minus1(ShortBuffer) delta_poc_s0_minus1}. */
    public static void ndelta_poc_s0_minus1(long struct, ShortBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H265_MAX_DPB_SIZE); }
        memCopy(memAddress(value), struct + StdVideoH265ShortTermRefPicSet.DELTA_POC_S0_MINUS1, value.remaining() * 2);
    }
    /** Unsafe version of {@link #delta_poc_s0_minus1(int, short) delta_poc_s0_minus1}. */
    public static void ndelta_poc_s0_minus1(long struct, int index, short value) {
        UNSAFE.putShort(null, struct + StdVideoH265ShortTermRefPicSet.DELTA_POC_S0_MINUS1 + check(index, STD_VIDEO_H265_MAX_DPB_SIZE) * 2, value);
    }
    /** Unsafe version of {@link #delta_poc_s1_minus1(ShortBuffer) delta_poc_s1_minus1}. */
    public static void ndelta_poc_s1_minus1(long struct, ShortBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H265_MAX_DPB_SIZE); }
        memCopy(memAddress(value), struct + StdVideoH265ShortTermRefPicSet.DELTA_POC_S1_MINUS1, value.remaining() * 2);
    }
    /** Unsafe version of {@link #delta_poc_s1_minus1(int, short) delta_poc_s1_minus1}. */
    public static void ndelta_poc_s1_minus1(long struct, int index, short value) {
        UNSAFE.putShort(null, struct + StdVideoH265ShortTermRefPicSet.DELTA_POC_S1_MINUS1 + check(index, STD_VIDEO_H265_MAX_DPB_SIZE) * 2, value);
    }

    // -----------------------------------

    /** An array of {@link StdVideoH265ShortTermRefPicSet} structs. */
    public static class Buffer extends StructBuffer<StdVideoH265ShortTermRefPicSet, Buffer> implements NativeResource {

        private static final StdVideoH265ShortTermRefPicSet ELEMENT_FACTORY = StdVideoH265ShortTermRefPicSet.create(-1L);

        /**
         * Creates a new {@code StdVideoH265ShortTermRefPicSet.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoH265ShortTermRefPicSet#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoH265ShortTermRefPicSet getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link StdVideoH265ShortTermRefPicSetFlags} view of the {@code flags} field. */
        public StdVideoH265ShortTermRefPicSetFlags flags() { return StdVideoH265ShortTermRefPicSet.nflags(address()); }
        /** @return the value of the {@code delta_idx_minus1} field. */
        @NativeType("uint32_t")
        public int delta_idx_minus1() { return StdVideoH265ShortTermRefPicSet.ndelta_idx_minus1(address()); }
        /** @return the value of the {@code use_delta_flag} field. */
        @NativeType("uint16_t")
        public short use_delta_flag() { return StdVideoH265ShortTermRefPicSet.nuse_delta_flag(address()); }
        /** @return the value of the {@code abs_delta_rps_minus1} field. */
        @NativeType("uint16_t")
        public short abs_delta_rps_minus1() { return StdVideoH265ShortTermRefPicSet.nabs_delta_rps_minus1(address()); }
        /** @return the value of the {@code used_by_curr_pic_flag} field. */
        @NativeType("uint16_t")
        public short used_by_curr_pic_flag() { return StdVideoH265ShortTermRefPicSet.nused_by_curr_pic_flag(address()); }
        /** @return the value of the {@code used_by_curr_pic_s0_flag} field. */
        @NativeType("uint16_t")
        public short used_by_curr_pic_s0_flag() { return StdVideoH265ShortTermRefPicSet.nused_by_curr_pic_s0_flag(address()); }
        /** @return the value of the {@code used_by_curr_pic_s1_flag} field. */
        @NativeType("uint16_t")
        public short used_by_curr_pic_s1_flag() { return StdVideoH265ShortTermRefPicSet.nused_by_curr_pic_s1_flag(address()); }
        /** @return the value of the {@code num_negative_pics} field. */
        @NativeType("uint8_t")
        public byte num_negative_pics() { return StdVideoH265ShortTermRefPicSet.nnum_negative_pics(address()); }
        /** @return the value of the {@code num_positive_pics} field. */
        @NativeType("uint8_t")
        public byte num_positive_pics() { return StdVideoH265ShortTermRefPicSet.nnum_positive_pics(address()); }
        /** @return a {@link ShortBuffer} view of the {@code delta_poc_s0_minus1} field. */
        @NativeType("uint16_t[STD_VIDEO_H265_MAX_DPB_SIZE]")
        public ShortBuffer delta_poc_s0_minus1() { return StdVideoH265ShortTermRefPicSet.ndelta_poc_s0_minus1(address()); }
        /** @return the value at the specified index of the {@code delta_poc_s0_minus1} field. */
        @NativeType("uint16_t")
        public short delta_poc_s0_minus1(int index) { return StdVideoH265ShortTermRefPicSet.ndelta_poc_s0_minus1(address(), index); }
        /** @return a {@link ShortBuffer} view of the {@code delta_poc_s1_minus1} field. */
        @NativeType("uint16_t[STD_VIDEO_H265_MAX_DPB_SIZE]")
        public ShortBuffer delta_poc_s1_minus1() { return StdVideoH265ShortTermRefPicSet.ndelta_poc_s1_minus1(address()); }
        /** @return the value at the specified index of the {@code delta_poc_s1_minus1} field. */
        @NativeType("uint16_t")
        public short delta_poc_s1_minus1(int index) { return StdVideoH265ShortTermRefPicSet.ndelta_poc_s1_minus1(address(), index); }

        /** Copies the specified {@link StdVideoH265ShortTermRefPicSetFlags} to the {@code flags} field. */
        public StdVideoH265ShortTermRefPicSet.Buffer flags(StdVideoH265ShortTermRefPicSetFlags value) { StdVideoH265ShortTermRefPicSet.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoH265ShortTermRefPicSet.Buffer flags(java.util.function.Consumer<StdVideoH265ShortTermRefPicSetFlags> consumer) { consumer.accept(flags()); return this; }
        /** Sets the specified value to the {@code delta_idx_minus1} field. */
        public StdVideoH265ShortTermRefPicSet.Buffer delta_idx_minus1(@NativeType("uint32_t") int value) { StdVideoH265ShortTermRefPicSet.ndelta_idx_minus1(address(), value); return this; }
        /** Sets the specified value to the {@code use_delta_flag} field. */
        public StdVideoH265ShortTermRefPicSet.Buffer use_delta_flag(@NativeType("uint16_t") short value) { StdVideoH265ShortTermRefPicSet.nuse_delta_flag(address(), value); return this; }
        /** Sets the specified value to the {@code abs_delta_rps_minus1} field. */
        public StdVideoH265ShortTermRefPicSet.Buffer abs_delta_rps_minus1(@NativeType("uint16_t") short value) { StdVideoH265ShortTermRefPicSet.nabs_delta_rps_minus1(address(), value); return this; }
        /** Sets the specified value to the {@code used_by_curr_pic_flag} field. */
        public StdVideoH265ShortTermRefPicSet.Buffer used_by_curr_pic_flag(@NativeType("uint16_t") short value) { StdVideoH265ShortTermRefPicSet.nused_by_curr_pic_flag(address(), value); return this; }
        /** Sets the specified value to the {@code used_by_curr_pic_s0_flag} field. */
        public StdVideoH265ShortTermRefPicSet.Buffer used_by_curr_pic_s0_flag(@NativeType("uint16_t") short value) { StdVideoH265ShortTermRefPicSet.nused_by_curr_pic_s0_flag(address(), value); return this; }
        /** Sets the specified value to the {@code used_by_curr_pic_s1_flag} field. */
        public StdVideoH265ShortTermRefPicSet.Buffer used_by_curr_pic_s1_flag(@NativeType("uint16_t") short value) { StdVideoH265ShortTermRefPicSet.nused_by_curr_pic_s1_flag(address(), value); return this; }
        /** Sets the specified value to the {@code num_negative_pics} field. */
        public StdVideoH265ShortTermRefPicSet.Buffer num_negative_pics(@NativeType("uint8_t") byte value) { StdVideoH265ShortTermRefPicSet.nnum_negative_pics(address(), value); return this; }
        /** Sets the specified value to the {@code num_positive_pics} field. */
        public StdVideoH265ShortTermRefPicSet.Buffer num_positive_pics(@NativeType("uint8_t") byte value) { StdVideoH265ShortTermRefPicSet.nnum_positive_pics(address(), value); return this; }
        /** Copies the specified {@link ShortBuffer} to the {@code delta_poc_s0_minus1} field. */
        public StdVideoH265ShortTermRefPicSet.Buffer delta_poc_s0_minus1(@NativeType("uint16_t[STD_VIDEO_H265_MAX_DPB_SIZE]") ShortBuffer value) { StdVideoH265ShortTermRefPicSet.ndelta_poc_s0_minus1(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code delta_poc_s0_minus1} field. */
        public StdVideoH265ShortTermRefPicSet.Buffer delta_poc_s0_minus1(int index, @NativeType("uint16_t") short value) { StdVideoH265ShortTermRefPicSet.ndelta_poc_s0_minus1(address(), index, value); return this; }
        /** Copies the specified {@link ShortBuffer} to the {@code delta_poc_s1_minus1} field. */
        public StdVideoH265ShortTermRefPicSet.Buffer delta_poc_s1_minus1(@NativeType("uint16_t[STD_VIDEO_H265_MAX_DPB_SIZE]") ShortBuffer value) { StdVideoH265ShortTermRefPicSet.ndelta_poc_s1_minus1(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code delta_poc_s1_minus1} field. */
        public StdVideoH265ShortTermRefPicSet.Buffer delta_poc_s1_minus1(int index, @NativeType("uint16_t") short value) { StdVideoH265ShortTermRefPicSet.ndelta_poc_s1_minus1(address(), index, value); return this; }

    }

}