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
 * struct StdVideoEncodeH265WeightTable {
 *     {@link StdVideoEncodeH265WeightTableFlags StdVideoEncodeH265WeightTableFlags} flags;
 *     uint8_t luma_log2_weight_denom;
 *     int8_t delta_chroma_log2_weight_denom;
 *     int8_t delta_luma_weight_l0[STD_VIDEO_H265_MAX_NUM_LIST_REF];
 *     int8_t luma_offset_l0[STD_VIDEO_H265_MAX_NUM_LIST_REF];
 *     int8_t delta_chroma_weight_l0[STD_VIDEO_H265_MAX_CHROMA_PLANES];
 *     int8_t delta_chroma_offset_l0[STD_VIDEO_H265_MAX_CHROMA_PLANES];
 *     int8_t delta_luma_weight_l1[STD_VIDEO_H265_MAX_NUM_LIST_REF];
 *     int8_t luma_offset_l1[STD_VIDEO_H265_MAX_NUM_LIST_REF];
 *     int8_t delta_chroma_weight_l1[STD_VIDEO_H265_MAX_CHROMA_PLANES];
 *     int8_t delta_chroma_offset_l1[STD_VIDEO_H265_MAX_CHROMA_PLANES];
 * }</code></pre>
 */
public class StdVideoEncodeH265WeightTable extends Struct<StdVideoEncodeH265WeightTable> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        LUMA_LOG2_WEIGHT_DENOM,
        DELTA_CHROMA_LOG2_WEIGHT_DENOM,
        DELTA_LUMA_WEIGHT_L0,
        LUMA_OFFSET_L0,
        DELTA_CHROMA_WEIGHT_L0,
        DELTA_CHROMA_OFFSET_L0,
        DELTA_LUMA_WEIGHT_L1,
        LUMA_OFFSET_L1,
        DELTA_CHROMA_WEIGHT_L1,
        DELTA_CHROMA_OFFSET_L1;

    static {
        Layout layout = __struct(
            __member(StdVideoEncodeH265WeightTableFlags.SIZEOF, StdVideoEncodeH265WeightTableFlags.ALIGNOF),
            __member(1),
            __member(1),
            __array(1, STD_VIDEO_H265_MAX_NUM_LIST_REF),
            __array(1, STD_VIDEO_H265_MAX_NUM_LIST_REF),
            __array(1, STD_VIDEO_H265_MAX_CHROMA_PLANES),
            __array(1, STD_VIDEO_H265_MAX_CHROMA_PLANES),
            __array(1, STD_VIDEO_H265_MAX_NUM_LIST_REF),
            __array(1, STD_VIDEO_H265_MAX_NUM_LIST_REF),
            __array(1, STD_VIDEO_H265_MAX_CHROMA_PLANES),
            __array(1, STD_VIDEO_H265_MAX_CHROMA_PLANES)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        LUMA_LOG2_WEIGHT_DENOM = layout.offsetof(1);
        DELTA_CHROMA_LOG2_WEIGHT_DENOM = layout.offsetof(2);
        DELTA_LUMA_WEIGHT_L0 = layout.offsetof(3);
        LUMA_OFFSET_L0 = layout.offsetof(4);
        DELTA_CHROMA_WEIGHT_L0 = layout.offsetof(5);
        DELTA_CHROMA_OFFSET_L0 = layout.offsetof(6);
        DELTA_LUMA_WEIGHT_L1 = layout.offsetof(7);
        LUMA_OFFSET_L1 = layout.offsetof(8);
        DELTA_CHROMA_WEIGHT_L1 = layout.offsetof(9);
        DELTA_CHROMA_OFFSET_L1 = layout.offsetof(10);
    }

    protected StdVideoEncodeH265WeightTable(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoEncodeH265WeightTable create(long address, @Nullable ByteBuffer container) {
        return new StdVideoEncodeH265WeightTable(address, container);
    }

    /**
     * Creates a {@code StdVideoEncodeH265WeightTable} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoEncodeH265WeightTable(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link StdVideoEncodeH265WeightTableFlags} view of the {@code flags} field. */
    public StdVideoEncodeH265WeightTableFlags flags() { return nflags(address()); }
    /** @return the value of the {@code luma_log2_weight_denom} field. */
    @NativeType("uint8_t")
    public byte luma_log2_weight_denom() { return nluma_log2_weight_denom(address()); }
    /** @return the value of the {@code delta_chroma_log2_weight_denom} field. */
    @NativeType("int8_t")
    public byte delta_chroma_log2_weight_denom() { return ndelta_chroma_log2_weight_denom(address()); }
    /** @return a {@link ByteBuffer} view of the {@code delta_luma_weight_l0} field. */
    @NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]")
    public ByteBuffer delta_luma_weight_l0() { return ndelta_luma_weight_l0(address()); }
    /** @return the value at the specified index of the {@code delta_luma_weight_l0} field. */
    @NativeType("int8_t")
    public byte delta_luma_weight_l0(int index) { return ndelta_luma_weight_l0(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code luma_offset_l0} field. */
    @NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]")
    public ByteBuffer luma_offset_l0() { return nluma_offset_l0(address()); }
    /** @return the value at the specified index of the {@code luma_offset_l0} field. */
    @NativeType("int8_t")
    public byte luma_offset_l0(int index) { return nluma_offset_l0(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code delta_chroma_weight_l0} field. */
    @NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]")
    public ByteBuffer delta_chroma_weight_l0() { return ndelta_chroma_weight_l0(address()); }
    /** @return the value at the specified index of the {@code delta_chroma_weight_l0} field. */
    @NativeType("int8_t")
    public byte delta_chroma_weight_l0(int index) { return ndelta_chroma_weight_l0(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code delta_chroma_offset_l0} field. */
    @NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]")
    public ByteBuffer delta_chroma_offset_l0() { return ndelta_chroma_offset_l0(address()); }
    /** @return the value at the specified index of the {@code delta_chroma_offset_l0} field. */
    @NativeType("int8_t")
    public byte delta_chroma_offset_l0(int index) { return ndelta_chroma_offset_l0(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code delta_luma_weight_l1} field. */
    @NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]")
    public ByteBuffer delta_luma_weight_l1() { return ndelta_luma_weight_l1(address()); }
    /** @return the value at the specified index of the {@code delta_luma_weight_l1} field. */
    @NativeType("int8_t")
    public byte delta_luma_weight_l1(int index) { return ndelta_luma_weight_l1(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code luma_offset_l1} field. */
    @NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]")
    public ByteBuffer luma_offset_l1() { return nluma_offset_l1(address()); }
    /** @return the value at the specified index of the {@code luma_offset_l1} field. */
    @NativeType("int8_t")
    public byte luma_offset_l1(int index) { return nluma_offset_l1(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code delta_chroma_weight_l1} field. */
    @NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]")
    public ByteBuffer delta_chroma_weight_l1() { return ndelta_chroma_weight_l1(address()); }
    /** @return the value at the specified index of the {@code delta_chroma_weight_l1} field. */
    @NativeType("int8_t")
    public byte delta_chroma_weight_l1(int index) { return ndelta_chroma_weight_l1(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code delta_chroma_offset_l1} field. */
    @NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]")
    public ByteBuffer delta_chroma_offset_l1() { return ndelta_chroma_offset_l1(address()); }
    /** @return the value at the specified index of the {@code delta_chroma_offset_l1} field. */
    @NativeType("int8_t")
    public byte delta_chroma_offset_l1(int index) { return ndelta_chroma_offset_l1(address(), index); }

    /** Copies the specified {@link StdVideoEncodeH265WeightTableFlags} to the {@code flags} field. */
    public StdVideoEncodeH265WeightTable flags(StdVideoEncodeH265WeightTableFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoEncodeH265WeightTable flags(java.util.function.Consumer<StdVideoEncodeH265WeightTableFlags> consumer) { consumer.accept(flags()); return this; }
    /** Sets the specified value to the {@code luma_log2_weight_denom} field. */
    public StdVideoEncodeH265WeightTable luma_log2_weight_denom(@NativeType("uint8_t") byte value) { nluma_log2_weight_denom(address(), value); return this; }
    /** Sets the specified value to the {@code delta_chroma_log2_weight_denom} field. */
    public StdVideoEncodeH265WeightTable delta_chroma_log2_weight_denom(@NativeType("int8_t") byte value) { ndelta_chroma_log2_weight_denom(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code delta_luma_weight_l0} field. */
    public StdVideoEncodeH265WeightTable delta_luma_weight_l0(@NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]") ByteBuffer value) { ndelta_luma_weight_l0(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code delta_luma_weight_l0} field. */
    public StdVideoEncodeH265WeightTable delta_luma_weight_l0(int index, @NativeType("int8_t") byte value) { ndelta_luma_weight_l0(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code luma_offset_l0} field. */
    public StdVideoEncodeH265WeightTable luma_offset_l0(@NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]") ByteBuffer value) { nluma_offset_l0(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code luma_offset_l0} field. */
    public StdVideoEncodeH265WeightTable luma_offset_l0(int index, @NativeType("int8_t") byte value) { nluma_offset_l0(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code delta_chroma_weight_l0} field. */
    public StdVideoEncodeH265WeightTable delta_chroma_weight_l0(@NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]") ByteBuffer value) { ndelta_chroma_weight_l0(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code delta_chroma_weight_l0} field. */
    public StdVideoEncodeH265WeightTable delta_chroma_weight_l0(int index, @NativeType("int8_t") byte value) { ndelta_chroma_weight_l0(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code delta_chroma_offset_l0} field. */
    public StdVideoEncodeH265WeightTable delta_chroma_offset_l0(@NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]") ByteBuffer value) { ndelta_chroma_offset_l0(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code delta_chroma_offset_l0} field. */
    public StdVideoEncodeH265WeightTable delta_chroma_offset_l0(int index, @NativeType("int8_t") byte value) { ndelta_chroma_offset_l0(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code delta_luma_weight_l1} field. */
    public StdVideoEncodeH265WeightTable delta_luma_weight_l1(@NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]") ByteBuffer value) { ndelta_luma_weight_l1(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code delta_luma_weight_l1} field. */
    public StdVideoEncodeH265WeightTable delta_luma_weight_l1(int index, @NativeType("int8_t") byte value) { ndelta_luma_weight_l1(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code luma_offset_l1} field. */
    public StdVideoEncodeH265WeightTable luma_offset_l1(@NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]") ByteBuffer value) { nluma_offset_l1(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code luma_offset_l1} field. */
    public StdVideoEncodeH265WeightTable luma_offset_l1(int index, @NativeType("int8_t") byte value) { nluma_offset_l1(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code delta_chroma_weight_l1} field. */
    public StdVideoEncodeH265WeightTable delta_chroma_weight_l1(@NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]") ByteBuffer value) { ndelta_chroma_weight_l1(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code delta_chroma_weight_l1} field. */
    public StdVideoEncodeH265WeightTable delta_chroma_weight_l1(int index, @NativeType("int8_t") byte value) { ndelta_chroma_weight_l1(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code delta_chroma_offset_l1} field. */
    public StdVideoEncodeH265WeightTable delta_chroma_offset_l1(@NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]") ByteBuffer value) { ndelta_chroma_offset_l1(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code delta_chroma_offset_l1} field. */
    public StdVideoEncodeH265WeightTable delta_chroma_offset_l1(int index, @NativeType("int8_t") byte value) { ndelta_chroma_offset_l1(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoEncodeH265WeightTable set(
        StdVideoEncodeH265WeightTableFlags flags,
        byte luma_log2_weight_denom,
        byte delta_chroma_log2_weight_denom,
        ByteBuffer delta_luma_weight_l0,
        ByteBuffer luma_offset_l0,
        ByteBuffer delta_chroma_weight_l0,
        ByteBuffer delta_chroma_offset_l0,
        ByteBuffer delta_luma_weight_l1,
        ByteBuffer luma_offset_l1,
        ByteBuffer delta_chroma_weight_l1,
        ByteBuffer delta_chroma_offset_l1
    ) {
        flags(flags);
        luma_log2_weight_denom(luma_log2_weight_denom);
        delta_chroma_log2_weight_denom(delta_chroma_log2_weight_denom);
        delta_luma_weight_l0(delta_luma_weight_l0);
        luma_offset_l0(luma_offset_l0);
        delta_chroma_weight_l0(delta_chroma_weight_l0);
        delta_chroma_offset_l0(delta_chroma_offset_l0);
        delta_luma_weight_l1(delta_luma_weight_l1);
        luma_offset_l1(luma_offset_l1);
        delta_chroma_weight_l1(delta_chroma_weight_l1);
        delta_chroma_offset_l1(delta_chroma_offset_l1);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoEncodeH265WeightTable set(StdVideoEncodeH265WeightTable src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoEncodeH265WeightTable} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH265WeightTable malloc() {
        return new StdVideoEncodeH265WeightTable(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeH265WeightTable} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH265WeightTable calloc() {
        return new StdVideoEncodeH265WeightTable(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeH265WeightTable} instance allocated with {@link BufferUtils}. */
    public static StdVideoEncodeH265WeightTable create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeH265WeightTable(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoEncodeH265WeightTable} instance for the specified memory address. */
    public static StdVideoEncodeH265WeightTable create(long address) {
        return new StdVideoEncodeH265WeightTable(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH265WeightTable createSafe(long address) {
        return address == NULL ? null : new StdVideoEncodeH265WeightTable(address, null);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265WeightTable.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265WeightTable.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265WeightTable.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265WeightTable.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265WeightTable.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265WeightTable.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoEncodeH265WeightTable.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265WeightTable.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH265WeightTable.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoEncodeH265WeightTable} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH265WeightTable malloc(MemoryStack stack) {
        return new StdVideoEncodeH265WeightTable(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoEncodeH265WeightTable} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH265WeightTable calloc(MemoryStack stack) {
        return new StdVideoEncodeH265WeightTable(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265WeightTable.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265WeightTable.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH265WeightTable.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH265WeightTable.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static StdVideoEncodeH265WeightTableFlags nflags(long struct) { return StdVideoEncodeH265WeightTableFlags.create(struct + StdVideoEncodeH265WeightTable.FLAGS); }
    /** Unsafe version of {@link #luma_log2_weight_denom}. */
    public static byte nluma_log2_weight_denom(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265WeightTable.LUMA_LOG2_WEIGHT_DENOM); }
    /** Unsafe version of {@link #delta_chroma_log2_weight_denom}. */
    public static byte ndelta_chroma_log2_weight_denom(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH265WeightTable.DELTA_CHROMA_LOG2_WEIGHT_DENOM); }
    /** Unsafe version of {@link #delta_luma_weight_l0}. */
    public static ByteBuffer ndelta_luma_weight_l0(long struct) { return memByteBuffer(struct + StdVideoEncodeH265WeightTable.DELTA_LUMA_WEIGHT_L0, STD_VIDEO_H265_MAX_NUM_LIST_REF); }
    /** Unsafe version of {@link #delta_luma_weight_l0(int) delta_luma_weight_l0}. */
    public static byte ndelta_luma_weight_l0(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoEncodeH265WeightTable.DELTA_LUMA_WEIGHT_L0 + check(index, STD_VIDEO_H265_MAX_NUM_LIST_REF) * 1);
    }
    /** Unsafe version of {@link #luma_offset_l0}. */
    public static ByteBuffer nluma_offset_l0(long struct) { return memByteBuffer(struct + StdVideoEncodeH265WeightTable.LUMA_OFFSET_L0, STD_VIDEO_H265_MAX_NUM_LIST_REF); }
    /** Unsafe version of {@link #luma_offset_l0(int) luma_offset_l0}. */
    public static byte nluma_offset_l0(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoEncodeH265WeightTable.LUMA_OFFSET_L0 + check(index, STD_VIDEO_H265_MAX_NUM_LIST_REF) * 1);
    }
    /** Unsafe version of {@link #delta_chroma_weight_l0}. */
    public static ByteBuffer ndelta_chroma_weight_l0(long struct) { return memByteBuffer(struct + StdVideoEncodeH265WeightTable.DELTA_CHROMA_WEIGHT_L0, STD_VIDEO_H265_MAX_CHROMA_PLANES); }
    /** Unsafe version of {@link #delta_chroma_weight_l0(int) delta_chroma_weight_l0}. */
    public static byte ndelta_chroma_weight_l0(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoEncodeH265WeightTable.DELTA_CHROMA_WEIGHT_L0 + check(index, STD_VIDEO_H265_MAX_CHROMA_PLANES) * 1);
    }
    /** Unsafe version of {@link #delta_chroma_offset_l0}. */
    public static ByteBuffer ndelta_chroma_offset_l0(long struct) { return memByteBuffer(struct + StdVideoEncodeH265WeightTable.DELTA_CHROMA_OFFSET_L0, STD_VIDEO_H265_MAX_CHROMA_PLANES); }
    /** Unsafe version of {@link #delta_chroma_offset_l0(int) delta_chroma_offset_l0}. */
    public static byte ndelta_chroma_offset_l0(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoEncodeH265WeightTable.DELTA_CHROMA_OFFSET_L0 + check(index, STD_VIDEO_H265_MAX_CHROMA_PLANES) * 1);
    }
    /** Unsafe version of {@link #delta_luma_weight_l1}. */
    public static ByteBuffer ndelta_luma_weight_l1(long struct) { return memByteBuffer(struct + StdVideoEncodeH265WeightTable.DELTA_LUMA_WEIGHT_L1, STD_VIDEO_H265_MAX_NUM_LIST_REF); }
    /** Unsafe version of {@link #delta_luma_weight_l1(int) delta_luma_weight_l1}. */
    public static byte ndelta_luma_weight_l1(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoEncodeH265WeightTable.DELTA_LUMA_WEIGHT_L1 + check(index, STD_VIDEO_H265_MAX_NUM_LIST_REF) * 1);
    }
    /** Unsafe version of {@link #luma_offset_l1}. */
    public static ByteBuffer nluma_offset_l1(long struct) { return memByteBuffer(struct + StdVideoEncodeH265WeightTable.LUMA_OFFSET_L1, STD_VIDEO_H265_MAX_NUM_LIST_REF); }
    /** Unsafe version of {@link #luma_offset_l1(int) luma_offset_l1}. */
    public static byte nluma_offset_l1(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoEncodeH265WeightTable.LUMA_OFFSET_L1 + check(index, STD_VIDEO_H265_MAX_NUM_LIST_REF) * 1);
    }
    /** Unsafe version of {@link #delta_chroma_weight_l1}. */
    public static ByteBuffer ndelta_chroma_weight_l1(long struct) { return memByteBuffer(struct + StdVideoEncodeH265WeightTable.DELTA_CHROMA_WEIGHT_L1, STD_VIDEO_H265_MAX_CHROMA_PLANES); }
    /** Unsafe version of {@link #delta_chroma_weight_l1(int) delta_chroma_weight_l1}. */
    public static byte ndelta_chroma_weight_l1(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoEncodeH265WeightTable.DELTA_CHROMA_WEIGHT_L1 + check(index, STD_VIDEO_H265_MAX_CHROMA_PLANES) * 1);
    }
    /** Unsafe version of {@link #delta_chroma_offset_l1}. */
    public static ByteBuffer ndelta_chroma_offset_l1(long struct) { return memByteBuffer(struct + StdVideoEncodeH265WeightTable.DELTA_CHROMA_OFFSET_L1, STD_VIDEO_H265_MAX_CHROMA_PLANES); }
    /** Unsafe version of {@link #delta_chroma_offset_l1(int) delta_chroma_offset_l1}. */
    public static byte ndelta_chroma_offset_l1(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoEncodeH265WeightTable.DELTA_CHROMA_OFFSET_L1 + check(index, STD_VIDEO_H265_MAX_CHROMA_PLANES) * 1);
    }

    /** Unsafe version of {@link #flags(StdVideoEncodeH265WeightTableFlags) flags}. */
    public static void nflags(long struct, StdVideoEncodeH265WeightTableFlags value) { memCopy(value.address(), struct + StdVideoEncodeH265WeightTable.FLAGS, StdVideoEncodeH265WeightTableFlags.SIZEOF); }
    /** Unsafe version of {@link #luma_log2_weight_denom(byte) luma_log2_weight_denom}. */
    public static void nluma_log2_weight_denom(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265WeightTable.LUMA_LOG2_WEIGHT_DENOM, value); }
    /** Unsafe version of {@link #delta_chroma_log2_weight_denom(byte) delta_chroma_log2_weight_denom}. */
    public static void ndelta_chroma_log2_weight_denom(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH265WeightTable.DELTA_CHROMA_LOG2_WEIGHT_DENOM, value); }
    /** Unsafe version of {@link #delta_luma_weight_l0(ByteBuffer) delta_luma_weight_l0}. */
    public static void ndelta_luma_weight_l0(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H265_MAX_NUM_LIST_REF); }
        memCopy(memAddress(value), struct + StdVideoEncodeH265WeightTable.DELTA_LUMA_WEIGHT_L0, value.remaining() * 1);
    }
    /** Unsafe version of {@link #delta_luma_weight_l0(int, byte) delta_luma_weight_l0}. */
    public static void ndelta_luma_weight_l0(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoEncodeH265WeightTable.DELTA_LUMA_WEIGHT_L0 + check(index, STD_VIDEO_H265_MAX_NUM_LIST_REF) * 1, value);
    }
    /** Unsafe version of {@link #luma_offset_l0(ByteBuffer) luma_offset_l0}. */
    public static void nluma_offset_l0(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H265_MAX_NUM_LIST_REF); }
        memCopy(memAddress(value), struct + StdVideoEncodeH265WeightTable.LUMA_OFFSET_L0, value.remaining() * 1);
    }
    /** Unsafe version of {@link #luma_offset_l0(int, byte) luma_offset_l0}. */
    public static void nluma_offset_l0(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoEncodeH265WeightTable.LUMA_OFFSET_L0 + check(index, STD_VIDEO_H265_MAX_NUM_LIST_REF) * 1, value);
    }
    /** Unsafe version of {@link #delta_chroma_weight_l0(ByteBuffer) delta_chroma_weight_l0}. */
    public static void ndelta_chroma_weight_l0(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H265_MAX_CHROMA_PLANES); }
        memCopy(memAddress(value), struct + StdVideoEncodeH265WeightTable.DELTA_CHROMA_WEIGHT_L0, value.remaining() * 1);
    }
    /** Unsafe version of {@link #delta_chroma_weight_l0(int, byte) delta_chroma_weight_l0}. */
    public static void ndelta_chroma_weight_l0(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoEncodeH265WeightTable.DELTA_CHROMA_WEIGHT_L0 + check(index, STD_VIDEO_H265_MAX_CHROMA_PLANES) * 1, value);
    }
    /** Unsafe version of {@link #delta_chroma_offset_l0(ByteBuffer) delta_chroma_offset_l0}. */
    public static void ndelta_chroma_offset_l0(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H265_MAX_CHROMA_PLANES); }
        memCopy(memAddress(value), struct + StdVideoEncodeH265WeightTable.DELTA_CHROMA_OFFSET_L0, value.remaining() * 1);
    }
    /** Unsafe version of {@link #delta_chroma_offset_l0(int, byte) delta_chroma_offset_l0}. */
    public static void ndelta_chroma_offset_l0(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoEncodeH265WeightTable.DELTA_CHROMA_OFFSET_L0 + check(index, STD_VIDEO_H265_MAX_CHROMA_PLANES) * 1, value);
    }
    /** Unsafe version of {@link #delta_luma_weight_l1(ByteBuffer) delta_luma_weight_l1}. */
    public static void ndelta_luma_weight_l1(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H265_MAX_NUM_LIST_REF); }
        memCopy(memAddress(value), struct + StdVideoEncodeH265WeightTable.DELTA_LUMA_WEIGHT_L1, value.remaining() * 1);
    }
    /** Unsafe version of {@link #delta_luma_weight_l1(int, byte) delta_luma_weight_l1}. */
    public static void ndelta_luma_weight_l1(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoEncodeH265WeightTable.DELTA_LUMA_WEIGHT_L1 + check(index, STD_VIDEO_H265_MAX_NUM_LIST_REF) * 1, value);
    }
    /** Unsafe version of {@link #luma_offset_l1(ByteBuffer) luma_offset_l1}. */
    public static void nluma_offset_l1(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H265_MAX_NUM_LIST_REF); }
        memCopy(memAddress(value), struct + StdVideoEncodeH265WeightTable.LUMA_OFFSET_L1, value.remaining() * 1);
    }
    /** Unsafe version of {@link #luma_offset_l1(int, byte) luma_offset_l1}. */
    public static void nluma_offset_l1(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoEncodeH265WeightTable.LUMA_OFFSET_L1 + check(index, STD_VIDEO_H265_MAX_NUM_LIST_REF) * 1, value);
    }
    /** Unsafe version of {@link #delta_chroma_weight_l1(ByteBuffer) delta_chroma_weight_l1}. */
    public static void ndelta_chroma_weight_l1(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H265_MAX_CHROMA_PLANES); }
        memCopy(memAddress(value), struct + StdVideoEncodeH265WeightTable.DELTA_CHROMA_WEIGHT_L1, value.remaining() * 1);
    }
    /** Unsafe version of {@link #delta_chroma_weight_l1(int, byte) delta_chroma_weight_l1}. */
    public static void ndelta_chroma_weight_l1(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoEncodeH265WeightTable.DELTA_CHROMA_WEIGHT_L1 + check(index, STD_VIDEO_H265_MAX_CHROMA_PLANES) * 1, value);
    }
    /** Unsafe version of {@link #delta_chroma_offset_l1(ByteBuffer) delta_chroma_offset_l1}. */
    public static void ndelta_chroma_offset_l1(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H265_MAX_CHROMA_PLANES); }
        memCopy(memAddress(value), struct + StdVideoEncodeH265WeightTable.DELTA_CHROMA_OFFSET_L1, value.remaining() * 1);
    }
    /** Unsafe version of {@link #delta_chroma_offset_l1(int, byte) delta_chroma_offset_l1}. */
    public static void ndelta_chroma_offset_l1(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoEncodeH265WeightTable.DELTA_CHROMA_OFFSET_L1 + check(index, STD_VIDEO_H265_MAX_CHROMA_PLANES) * 1, value);
    }

    // -----------------------------------

    /** An array of {@link StdVideoEncodeH265WeightTable} structs. */
    public static class Buffer extends StructBuffer<StdVideoEncodeH265WeightTable, Buffer> implements NativeResource {

        private static final StdVideoEncodeH265WeightTable ELEMENT_FACTORY = StdVideoEncodeH265WeightTable.create(-1L);

        /**
         * Creates a new {@code StdVideoEncodeH265WeightTable.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoEncodeH265WeightTable#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoEncodeH265WeightTable getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link StdVideoEncodeH265WeightTableFlags} view of the {@code flags} field. */
        public StdVideoEncodeH265WeightTableFlags flags() { return StdVideoEncodeH265WeightTable.nflags(address()); }
        /** @return the value of the {@code luma_log2_weight_denom} field. */
        @NativeType("uint8_t")
        public byte luma_log2_weight_denom() { return StdVideoEncodeH265WeightTable.nluma_log2_weight_denom(address()); }
        /** @return the value of the {@code delta_chroma_log2_weight_denom} field. */
        @NativeType("int8_t")
        public byte delta_chroma_log2_weight_denom() { return StdVideoEncodeH265WeightTable.ndelta_chroma_log2_weight_denom(address()); }
        /** @return a {@link ByteBuffer} view of the {@code delta_luma_weight_l0} field. */
        @NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]")
        public ByteBuffer delta_luma_weight_l0() { return StdVideoEncodeH265WeightTable.ndelta_luma_weight_l0(address()); }
        /** @return the value at the specified index of the {@code delta_luma_weight_l0} field. */
        @NativeType("int8_t")
        public byte delta_luma_weight_l0(int index) { return StdVideoEncodeH265WeightTable.ndelta_luma_weight_l0(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code luma_offset_l0} field. */
        @NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]")
        public ByteBuffer luma_offset_l0() { return StdVideoEncodeH265WeightTable.nluma_offset_l0(address()); }
        /** @return the value at the specified index of the {@code luma_offset_l0} field. */
        @NativeType("int8_t")
        public byte luma_offset_l0(int index) { return StdVideoEncodeH265WeightTable.nluma_offset_l0(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code delta_chroma_weight_l0} field. */
        @NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]")
        public ByteBuffer delta_chroma_weight_l0() { return StdVideoEncodeH265WeightTable.ndelta_chroma_weight_l0(address()); }
        /** @return the value at the specified index of the {@code delta_chroma_weight_l0} field. */
        @NativeType("int8_t")
        public byte delta_chroma_weight_l0(int index) { return StdVideoEncodeH265WeightTable.ndelta_chroma_weight_l0(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code delta_chroma_offset_l0} field. */
        @NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]")
        public ByteBuffer delta_chroma_offset_l0() { return StdVideoEncodeH265WeightTable.ndelta_chroma_offset_l0(address()); }
        /** @return the value at the specified index of the {@code delta_chroma_offset_l0} field. */
        @NativeType("int8_t")
        public byte delta_chroma_offset_l0(int index) { return StdVideoEncodeH265WeightTable.ndelta_chroma_offset_l0(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code delta_luma_weight_l1} field. */
        @NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]")
        public ByteBuffer delta_luma_weight_l1() { return StdVideoEncodeH265WeightTable.ndelta_luma_weight_l1(address()); }
        /** @return the value at the specified index of the {@code delta_luma_weight_l1} field. */
        @NativeType("int8_t")
        public byte delta_luma_weight_l1(int index) { return StdVideoEncodeH265WeightTable.ndelta_luma_weight_l1(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code luma_offset_l1} field. */
        @NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]")
        public ByteBuffer luma_offset_l1() { return StdVideoEncodeH265WeightTable.nluma_offset_l1(address()); }
        /** @return the value at the specified index of the {@code luma_offset_l1} field. */
        @NativeType("int8_t")
        public byte luma_offset_l1(int index) { return StdVideoEncodeH265WeightTable.nluma_offset_l1(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code delta_chroma_weight_l1} field. */
        @NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]")
        public ByteBuffer delta_chroma_weight_l1() { return StdVideoEncodeH265WeightTable.ndelta_chroma_weight_l1(address()); }
        /** @return the value at the specified index of the {@code delta_chroma_weight_l1} field. */
        @NativeType("int8_t")
        public byte delta_chroma_weight_l1(int index) { return StdVideoEncodeH265WeightTable.ndelta_chroma_weight_l1(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code delta_chroma_offset_l1} field. */
        @NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]")
        public ByteBuffer delta_chroma_offset_l1() { return StdVideoEncodeH265WeightTable.ndelta_chroma_offset_l1(address()); }
        /** @return the value at the specified index of the {@code delta_chroma_offset_l1} field. */
        @NativeType("int8_t")
        public byte delta_chroma_offset_l1(int index) { return StdVideoEncodeH265WeightTable.ndelta_chroma_offset_l1(address(), index); }

        /** Copies the specified {@link StdVideoEncodeH265WeightTableFlags} to the {@code flags} field. */
        public StdVideoEncodeH265WeightTable.Buffer flags(StdVideoEncodeH265WeightTableFlags value) { StdVideoEncodeH265WeightTable.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoEncodeH265WeightTable.Buffer flags(java.util.function.Consumer<StdVideoEncodeH265WeightTableFlags> consumer) { consumer.accept(flags()); return this; }
        /** Sets the specified value to the {@code luma_log2_weight_denom} field. */
        public StdVideoEncodeH265WeightTable.Buffer luma_log2_weight_denom(@NativeType("uint8_t") byte value) { StdVideoEncodeH265WeightTable.nluma_log2_weight_denom(address(), value); return this; }
        /** Sets the specified value to the {@code delta_chroma_log2_weight_denom} field. */
        public StdVideoEncodeH265WeightTable.Buffer delta_chroma_log2_weight_denom(@NativeType("int8_t") byte value) { StdVideoEncodeH265WeightTable.ndelta_chroma_log2_weight_denom(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code delta_luma_weight_l0} field. */
        public StdVideoEncodeH265WeightTable.Buffer delta_luma_weight_l0(@NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]") ByteBuffer value) { StdVideoEncodeH265WeightTable.ndelta_luma_weight_l0(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code delta_luma_weight_l0} field. */
        public StdVideoEncodeH265WeightTable.Buffer delta_luma_weight_l0(int index, @NativeType("int8_t") byte value) { StdVideoEncodeH265WeightTable.ndelta_luma_weight_l0(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code luma_offset_l0} field. */
        public StdVideoEncodeH265WeightTable.Buffer luma_offset_l0(@NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]") ByteBuffer value) { StdVideoEncodeH265WeightTable.nluma_offset_l0(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code luma_offset_l0} field. */
        public StdVideoEncodeH265WeightTable.Buffer luma_offset_l0(int index, @NativeType("int8_t") byte value) { StdVideoEncodeH265WeightTable.nluma_offset_l0(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code delta_chroma_weight_l0} field. */
        public StdVideoEncodeH265WeightTable.Buffer delta_chroma_weight_l0(@NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]") ByteBuffer value) { StdVideoEncodeH265WeightTable.ndelta_chroma_weight_l0(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code delta_chroma_weight_l0} field. */
        public StdVideoEncodeH265WeightTable.Buffer delta_chroma_weight_l0(int index, @NativeType("int8_t") byte value) { StdVideoEncodeH265WeightTable.ndelta_chroma_weight_l0(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code delta_chroma_offset_l0} field. */
        public StdVideoEncodeH265WeightTable.Buffer delta_chroma_offset_l0(@NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]") ByteBuffer value) { StdVideoEncodeH265WeightTable.ndelta_chroma_offset_l0(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code delta_chroma_offset_l0} field. */
        public StdVideoEncodeH265WeightTable.Buffer delta_chroma_offset_l0(int index, @NativeType("int8_t") byte value) { StdVideoEncodeH265WeightTable.ndelta_chroma_offset_l0(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code delta_luma_weight_l1} field. */
        public StdVideoEncodeH265WeightTable.Buffer delta_luma_weight_l1(@NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]") ByteBuffer value) { StdVideoEncodeH265WeightTable.ndelta_luma_weight_l1(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code delta_luma_weight_l1} field. */
        public StdVideoEncodeH265WeightTable.Buffer delta_luma_weight_l1(int index, @NativeType("int8_t") byte value) { StdVideoEncodeH265WeightTable.ndelta_luma_weight_l1(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code luma_offset_l1} field. */
        public StdVideoEncodeH265WeightTable.Buffer luma_offset_l1(@NativeType("int8_t[STD_VIDEO_H265_MAX_NUM_LIST_REF]") ByteBuffer value) { StdVideoEncodeH265WeightTable.nluma_offset_l1(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code luma_offset_l1} field. */
        public StdVideoEncodeH265WeightTable.Buffer luma_offset_l1(int index, @NativeType("int8_t") byte value) { StdVideoEncodeH265WeightTable.nluma_offset_l1(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code delta_chroma_weight_l1} field. */
        public StdVideoEncodeH265WeightTable.Buffer delta_chroma_weight_l1(@NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]") ByteBuffer value) { StdVideoEncodeH265WeightTable.ndelta_chroma_weight_l1(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code delta_chroma_weight_l1} field. */
        public StdVideoEncodeH265WeightTable.Buffer delta_chroma_weight_l1(int index, @NativeType("int8_t") byte value) { StdVideoEncodeH265WeightTable.ndelta_chroma_weight_l1(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code delta_chroma_offset_l1} field. */
        public StdVideoEncodeH265WeightTable.Buffer delta_chroma_offset_l1(@NativeType("int8_t[STD_VIDEO_H265_MAX_CHROMA_PLANES]") ByteBuffer value) { StdVideoEncodeH265WeightTable.ndelta_chroma_offset_l1(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code delta_chroma_offset_l1} field. */
        public StdVideoEncodeH265WeightTable.Buffer delta_chroma_offset_l1(int index, @NativeType("int8_t") byte value) { StdVideoEncodeH265WeightTable.ndelta_chroma_offset_l1(address(), index, value); return this; }

    }

}