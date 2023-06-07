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
 * struct StdVideoEncodeH264WeightTable {
 *     {@link StdVideoEncodeH264WeightTableFlags StdVideoEncodeH264WeightTableFlags} flags;
 *     uint8_t luma_log2_weight_denom;
 *     uint8_t chroma_log2_weight_denom;
 *     int8_t luma_weight_l0[STD_VIDEO_H264_MAX_NUM_LIST_REF];
 *     int8_t luma_offset_l0[STD_VIDEO_H264_MAX_NUM_LIST_REF];
 *     int8_t chroma_weight_l0[STD_VIDEO_H264_MAX_CHROMA_PLANES];
 *     int8_t chroma_offset_l0[STD_VIDEO_H264_MAX_CHROMA_PLANES];
 *     int8_t luma_weight_l1[STD_VIDEO_H264_MAX_NUM_LIST_REF];
 *     int8_t luma_offset_l1[STD_VIDEO_H264_MAX_NUM_LIST_REF];
 *     int8_t chroma_weight_l1[STD_VIDEO_H264_MAX_CHROMA_PLANES];
 *     int8_t chroma_offset_l1[STD_VIDEO_H264_MAX_CHROMA_PLANES];
 * }</code></pre>
 */
public class StdVideoEncodeH264WeightTable extends Struct<StdVideoEncodeH264WeightTable> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        LUMA_LOG2_WEIGHT_DENOM,
        CHROMA_LOG2_WEIGHT_DENOM,
        LUMA_WEIGHT_L0,
        LUMA_OFFSET_L0,
        CHROMA_WEIGHT_L0,
        CHROMA_OFFSET_L0,
        LUMA_WEIGHT_L1,
        LUMA_OFFSET_L1,
        CHROMA_WEIGHT_L1,
        CHROMA_OFFSET_L1;

    static {
        Layout layout = __struct(
            __member(StdVideoEncodeH264WeightTableFlags.SIZEOF, StdVideoEncodeH264WeightTableFlags.ALIGNOF),
            __member(1),
            __member(1),
            __array(1, STD_VIDEO_H264_MAX_NUM_LIST_REF),
            __array(1, STD_VIDEO_H264_MAX_NUM_LIST_REF),
            __array(1, STD_VIDEO_H264_MAX_CHROMA_PLANES),
            __array(1, STD_VIDEO_H264_MAX_CHROMA_PLANES),
            __array(1, STD_VIDEO_H264_MAX_NUM_LIST_REF),
            __array(1, STD_VIDEO_H264_MAX_NUM_LIST_REF),
            __array(1, STD_VIDEO_H264_MAX_CHROMA_PLANES),
            __array(1, STD_VIDEO_H264_MAX_CHROMA_PLANES)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        LUMA_LOG2_WEIGHT_DENOM = layout.offsetof(1);
        CHROMA_LOG2_WEIGHT_DENOM = layout.offsetof(2);
        LUMA_WEIGHT_L0 = layout.offsetof(3);
        LUMA_OFFSET_L0 = layout.offsetof(4);
        CHROMA_WEIGHT_L0 = layout.offsetof(5);
        CHROMA_OFFSET_L0 = layout.offsetof(6);
        LUMA_WEIGHT_L1 = layout.offsetof(7);
        LUMA_OFFSET_L1 = layout.offsetof(8);
        CHROMA_WEIGHT_L1 = layout.offsetof(9);
        CHROMA_OFFSET_L1 = layout.offsetof(10);
    }

    protected StdVideoEncodeH264WeightTable(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoEncodeH264WeightTable create(long address, @Nullable ByteBuffer container) {
        return new StdVideoEncodeH264WeightTable(address, container);
    }

    /**
     * Creates a {@code StdVideoEncodeH264WeightTable} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoEncodeH264WeightTable(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link StdVideoEncodeH264WeightTableFlags} view of the {@code flags} field. */
    public StdVideoEncodeH264WeightTableFlags flags() { return nflags(address()); }
    /** @return the value of the {@code luma_log2_weight_denom} field. */
    @NativeType("uint8_t")
    public byte luma_log2_weight_denom() { return nluma_log2_weight_denom(address()); }
    /** @return the value of the {@code chroma_log2_weight_denom} field. */
    @NativeType("uint8_t")
    public byte chroma_log2_weight_denom() { return nchroma_log2_weight_denom(address()); }
    /** @return a {@link ByteBuffer} view of the {@code luma_weight_l0} field. */
    @NativeType("int8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]")
    public ByteBuffer luma_weight_l0() { return nluma_weight_l0(address()); }
    /** @return the value at the specified index of the {@code luma_weight_l0} field. */
    @NativeType("int8_t")
    public byte luma_weight_l0(int index) { return nluma_weight_l0(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code luma_offset_l0} field. */
    @NativeType("int8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]")
    public ByteBuffer luma_offset_l0() { return nluma_offset_l0(address()); }
    /** @return the value at the specified index of the {@code luma_offset_l0} field. */
    @NativeType("int8_t")
    public byte luma_offset_l0(int index) { return nluma_offset_l0(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code chroma_weight_l0} field. */
    @NativeType("int8_t[STD_VIDEO_H264_MAX_CHROMA_PLANES]")
    public ByteBuffer chroma_weight_l0() { return nchroma_weight_l0(address()); }
    /** @return the value at the specified index of the {@code chroma_weight_l0} field. */
    @NativeType("int8_t")
    public byte chroma_weight_l0(int index) { return nchroma_weight_l0(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code chroma_offset_l0} field. */
    @NativeType("int8_t[STD_VIDEO_H264_MAX_CHROMA_PLANES]")
    public ByteBuffer chroma_offset_l0() { return nchroma_offset_l0(address()); }
    /** @return the value at the specified index of the {@code chroma_offset_l0} field. */
    @NativeType("int8_t")
    public byte chroma_offset_l0(int index) { return nchroma_offset_l0(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code luma_weight_l1} field. */
    @NativeType("int8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]")
    public ByteBuffer luma_weight_l1() { return nluma_weight_l1(address()); }
    /** @return the value at the specified index of the {@code luma_weight_l1} field. */
    @NativeType("int8_t")
    public byte luma_weight_l1(int index) { return nluma_weight_l1(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code luma_offset_l1} field. */
    @NativeType("int8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]")
    public ByteBuffer luma_offset_l1() { return nluma_offset_l1(address()); }
    /** @return the value at the specified index of the {@code luma_offset_l1} field. */
    @NativeType("int8_t")
    public byte luma_offset_l1(int index) { return nluma_offset_l1(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code chroma_weight_l1} field. */
    @NativeType("int8_t[STD_VIDEO_H264_MAX_CHROMA_PLANES]")
    public ByteBuffer chroma_weight_l1() { return nchroma_weight_l1(address()); }
    /** @return the value at the specified index of the {@code chroma_weight_l1} field. */
    @NativeType("int8_t")
    public byte chroma_weight_l1(int index) { return nchroma_weight_l1(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code chroma_offset_l1} field. */
    @NativeType("int8_t[STD_VIDEO_H264_MAX_CHROMA_PLANES]")
    public ByteBuffer chroma_offset_l1() { return nchroma_offset_l1(address()); }
    /** @return the value at the specified index of the {@code chroma_offset_l1} field. */
    @NativeType("int8_t")
    public byte chroma_offset_l1(int index) { return nchroma_offset_l1(address(), index); }

    /** Copies the specified {@link StdVideoEncodeH264WeightTableFlags} to the {@code flags} field. */
    public StdVideoEncodeH264WeightTable flags(StdVideoEncodeH264WeightTableFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoEncodeH264WeightTable flags(java.util.function.Consumer<StdVideoEncodeH264WeightTableFlags> consumer) { consumer.accept(flags()); return this; }
    /** Sets the specified value to the {@code luma_log2_weight_denom} field. */
    public StdVideoEncodeH264WeightTable luma_log2_weight_denom(@NativeType("uint8_t") byte value) { nluma_log2_weight_denom(address(), value); return this; }
    /** Sets the specified value to the {@code chroma_log2_weight_denom} field. */
    public StdVideoEncodeH264WeightTable chroma_log2_weight_denom(@NativeType("uint8_t") byte value) { nchroma_log2_weight_denom(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code luma_weight_l0} field. */
    public StdVideoEncodeH264WeightTable luma_weight_l0(@NativeType("int8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]") ByteBuffer value) { nluma_weight_l0(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code luma_weight_l0} field. */
    public StdVideoEncodeH264WeightTable luma_weight_l0(int index, @NativeType("int8_t") byte value) { nluma_weight_l0(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code luma_offset_l0} field. */
    public StdVideoEncodeH264WeightTable luma_offset_l0(@NativeType("int8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]") ByteBuffer value) { nluma_offset_l0(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code luma_offset_l0} field. */
    public StdVideoEncodeH264WeightTable luma_offset_l0(int index, @NativeType("int8_t") byte value) { nluma_offset_l0(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code chroma_weight_l0} field. */
    public StdVideoEncodeH264WeightTable chroma_weight_l0(@NativeType("int8_t[STD_VIDEO_H264_MAX_CHROMA_PLANES]") ByteBuffer value) { nchroma_weight_l0(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code chroma_weight_l0} field. */
    public StdVideoEncodeH264WeightTable chroma_weight_l0(int index, @NativeType("int8_t") byte value) { nchroma_weight_l0(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code chroma_offset_l0} field. */
    public StdVideoEncodeH264WeightTable chroma_offset_l0(@NativeType("int8_t[STD_VIDEO_H264_MAX_CHROMA_PLANES]") ByteBuffer value) { nchroma_offset_l0(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code chroma_offset_l0} field. */
    public StdVideoEncodeH264WeightTable chroma_offset_l0(int index, @NativeType("int8_t") byte value) { nchroma_offset_l0(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code luma_weight_l1} field. */
    public StdVideoEncodeH264WeightTable luma_weight_l1(@NativeType("int8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]") ByteBuffer value) { nluma_weight_l1(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code luma_weight_l1} field. */
    public StdVideoEncodeH264WeightTable luma_weight_l1(int index, @NativeType("int8_t") byte value) { nluma_weight_l1(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code luma_offset_l1} field. */
    public StdVideoEncodeH264WeightTable luma_offset_l1(@NativeType("int8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]") ByteBuffer value) { nluma_offset_l1(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code luma_offset_l1} field. */
    public StdVideoEncodeH264WeightTable luma_offset_l1(int index, @NativeType("int8_t") byte value) { nluma_offset_l1(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code chroma_weight_l1} field. */
    public StdVideoEncodeH264WeightTable chroma_weight_l1(@NativeType("int8_t[STD_VIDEO_H264_MAX_CHROMA_PLANES]") ByteBuffer value) { nchroma_weight_l1(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code chroma_weight_l1} field. */
    public StdVideoEncodeH264WeightTable chroma_weight_l1(int index, @NativeType("int8_t") byte value) { nchroma_weight_l1(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code chroma_offset_l1} field. */
    public StdVideoEncodeH264WeightTable chroma_offset_l1(@NativeType("int8_t[STD_VIDEO_H264_MAX_CHROMA_PLANES]") ByteBuffer value) { nchroma_offset_l1(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code chroma_offset_l1} field. */
    public StdVideoEncodeH264WeightTable chroma_offset_l1(int index, @NativeType("int8_t") byte value) { nchroma_offset_l1(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoEncodeH264WeightTable set(
        StdVideoEncodeH264WeightTableFlags flags,
        byte luma_log2_weight_denom,
        byte chroma_log2_weight_denom,
        ByteBuffer luma_weight_l0,
        ByteBuffer luma_offset_l0,
        ByteBuffer chroma_weight_l0,
        ByteBuffer chroma_offset_l0,
        ByteBuffer luma_weight_l1,
        ByteBuffer luma_offset_l1,
        ByteBuffer chroma_weight_l1,
        ByteBuffer chroma_offset_l1
    ) {
        flags(flags);
        luma_log2_weight_denom(luma_log2_weight_denom);
        chroma_log2_weight_denom(chroma_log2_weight_denom);
        luma_weight_l0(luma_weight_l0);
        luma_offset_l0(luma_offset_l0);
        chroma_weight_l0(chroma_weight_l0);
        chroma_offset_l0(chroma_offset_l0);
        luma_weight_l1(luma_weight_l1);
        luma_offset_l1(luma_offset_l1);
        chroma_weight_l1(chroma_weight_l1);
        chroma_offset_l1(chroma_offset_l1);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoEncodeH264WeightTable set(StdVideoEncodeH264WeightTable src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoEncodeH264WeightTable} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH264WeightTable malloc() {
        return new StdVideoEncodeH264WeightTable(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeH264WeightTable} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeH264WeightTable calloc() {
        return new StdVideoEncodeH264WeightTable(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeH264WeightTable} instance allocated with {@link BufferUtils}. */
    public static StdVideoEncodeH264WeightTable create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeH264WeightTable(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoEncodeH264WeightTable} instance for the specified memory address. */
    public static StdVideoEncodeH264WeightTable create(long address) {
        return new StdVideoEncodeH264WeightTable(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH264WeightTable createSafe(long address) {
        return address == NULL ? null : new StdVideoEncodeH264WeightTable(address, null);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264WeightTable.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264WeightTable.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264WeightTable.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264WeightTable.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264WeightTable.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264WeightTable.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoEncodeH264WeightTable.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264WeightTable.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoEncodeH264WeightTable.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoEncodeH264WeightTable} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH264WeightTable malloc(MemoryStack stack) {
        return new StdVideoEncodeH264WeightTable(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoEncodeH264WeightTable} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeH264WeightTable calloc(MemoryStack stack) {
        return new StdVideoEncodeH264WeightTable(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264WeightTable.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264WeightTable.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeH264WeightTable.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeH264WeightTable.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static StdVideoEncodeH264WeightTableFlags nflags(long struct) { return StdVideoEncodeH264WeightTableFlags.create(struct + StdVideoEncodeH264WeightTable.FLAGS); }
    /** Unsafe version of {@link #luma_log2_weight_denom}. */
    public static byte nluma_log2_weight_denom(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH264WeightTable.LUMA_LOG2_WEIGHT_DENOM); }
    /** Unsafe version of {@link #chroma_log2_weight_denom}. */
    public static byte nchroma_log2_weight_denom(long struct) { return UNSAFE.getByte(null, struct + StdVideoEncodeH264WeightTable.CHROMA_LOG2_WEIGHT_DENOM); }
    /** Unsafe version of {@link #luma_weight_l0}. */
    public static ByteBuffer nluma_weight_l0(long struct) { return memByteBuffer(struct + StdVideoEncodeH264WeightTable.LUMA_WEIGHT_L0, STD_VIDEO_H264_MAX_NUM_LIST_REF); }
    /** Unsafe version of {@link #luma_weight_l0(int) luma_weight_l0}. */
    public static byte nluma_weight_l0(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoEncodeH264WeightTable.LUMA_WEIGHT_L0 + check(index, STD_VIDEO_H264_MAX_NUM_LIST_REF) * 1);
    }
    /** Unsafe version of {@link #luma_offset_l0}. */
    public static ByteBuffer nluma_offset_l0(long struct) { return memByteBuffer(struct + StdVideoEncodeH264WeightTable.LUMA_OFFSET_L0, STD_VIDEO_H264_MAX_NUM_LIST_REF); }
    /** Unsafe version of {@link #luma_offset_l0(int) luma_offset_l0}. */
    public static byte nluma_offset_l0(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoEncodeH264WeightTable.LUMA_OFFSET_L0 + check(index, STD_VIDEO_H264_MAX_NUM_LIST_REF) * 1);
    }
    /** Unsafe version of {@link #chroma_weight_l0}. */
    public static ByteBuffer nchroma_weight_l0(long struct) { return memByteBuffer(struct + StdVideoEncodeH264WeightTable.CHROMA_WEIGHT_L0, STD_VIDEO_H264_MAX_CHROMA_PLANES); }
    /** Unsafe version of {@link #chroma_weight_l0(int) chroma_weight_l0}. */
    public static byte nchroma_weight_l0(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoEncodeH264WeightTable.CHROMA_WEIGHT_L0 + check(index, STD_VIDEO_H264_MAX_CHROMA_PLANES) * 1);
    }
    /** Unsafe version of {@link #chroma_offset_l0}. */
    public static ByteBuffer nchroma_offset_l0(long struct) { return memByteBuffer(struct + StdVideoEncodeH264WeightTable.CHROMA_OFFSET_L0, STD_VIDEO_H264_MAX_CHROMA_PLANES); }
    /** Unsafe version of {@link #chroma_offset_l0(int) chroma_offset_l0}. */
    public static byte nchroma_offset_l0(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoEncodeH264WeightTable.CHROMA_OFFSET_L0 + check(index, STD_VIDEO_H264_MAX_CHROMA_PLANES) * 1);
    }
    /** Unsafe version of {@link #luma_weight_l1}. */
    public static ByteBuffer nluma_weight_l1(long struct) { return memByteBuffer(struct + StdVideoEncodeH264WeightTable.LUMA_WEIGHT_L1, STD_VIDEO_H264_MAX_NUM_LIST_REF); }
    /** Unsafe version of {@link #luma_weight_l1(int) luma_weight_l1}. */
    public static byte nluma_weight_l1(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoEncodeH264WeightTable.LUMA_WEIGHT_L1 + check(index, STD_VIDEO_H264_MAX_NUM_LIST_REF) * 1);
    }
    /** Unsafe version of {@link #luma_offset_l1}. */
    public static ByteBuffer nluma_offset_l1(long struct) { return memByteBuffer(struct + StdVideoEncodeH264WeightTable.LUMA_OFFSET_L1, STD_VIDEO_H264_MAX_NUM_LIST_REF); }
    /** Unsafe version of {@link #luma_offset_l1(int) luma_offset_l1}. */
    public static byte nluma_offset_l1(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoEncodeH264WeightTable.LUMA_OFFSET_L1 + check(index, STD_VIDEO_H264_MAX_NUM_LIST_REF) * 1);
    }
    /** Unsafe version of {@link #chroma_weight_l1}. */
    public static ByteBuffer nchroma_weight_l1(long struct) { return memByteBuffer(struct + StdVideoEncodeH264WeightTable.CHROMA_WEIGHT_L1, STD_VIDEO_H264_MAX_CHROMA_PLANES); }
    /** Unsafe version of {@link #chroma_weight_l1(int) chroma_weight_l1}. */
    public static byte nchroma_weight_l1(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoEncodeH264WeightTable.CHROMA_WEIGHT_L1 + check(index, STD_VIDEO_H264_MAX_CHROMA_PLANES) * 1);
    }
    /** Unsafe version of {@link #chroma_offset_l1}. */
    public static ByteBuffer nchroma_offset_l1(long struct) { return memByteBuffer(struct + StdVideoEncodeH264WeightTable.CHROMA_OFFSET_L1, STD_VIDEO_H264_MAX_CHROMA_PLANES); }
    /** Unsafe version of {@link #chroma_offset_l1(int) chroma_offset_l1}. */
    public static byte nchroma_offset_l1(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoEncodeH264WeightTable.CHROMA_OFFSET_L1 + check(index, STD_VIDEO_H264_MAX_CHROMA_PLANES) * 1);
    }

    /** Unsafe version of {@link #flags(StdVideoEncodeH264WeightTableFlags) flags}. */
    public static void nflags(long struct, StdVideoEncodeH264WeightTableFlags value) { memCopy(value.address(), struct + StdVideoEncodeH264WeightTable.FLAGS, StdVideoEncodeH264WeightTableFlags.SIZEOF); }
    /** Unsafe version of {@link #luma_log2_weight_denom(byte) luma_log2_weight_denom}. */
    public static void nluma_log2_weight_denom(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH264WeightTable.LUMA_LOG2_WEIGHT_DENOM, value); }
    /** Unsafe version of {@link #chroma_log2_weight_denom(byte) chroma_log2_weight_denom}. */
    public static void nchroma_log2_weight_denom(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoEncodeH264WeightTable.CHROMA_LOG2_WEIGHT_DENOM, value); }
    /** Unsafe version of {@link #luma_weight_l0(ByteBuffer) luma_weight_l0}. */
    public static void nluma_weight_l0(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H264_MAX_NUM_LIST_REF); }
        memCopy(memAddress(value), struct + StdVideoEncodeH264WeightTable.LUMA_WEIGHT_L0, value.remaining() * 1);
    }
    /** Unsafe version of {@link #luma_weight_l0(int, byte) luma_weight_l0}. */
    public static void nluma_weight_l0(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoEncodeH264WeightTable.LUMA_WEIGHT_L0 + check(index, STD_VIDEO_H264_MAX_NUM_LIST_REF) * 1, value);
    }
    /** Unsafe version of {@link #luma_offset_l0(ByteBuffer) luma_offset_l0}. */
    public static void nluma_offset_l0(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H264_MAX_NUM_LIST_REF); }
        memCopy(memAddress(value), struct + StdVideoEncodeH264WeightTable.LUMA_OFFSET_L0, value.remaining() * 1);
    }
    /** Unsafe version of {@link #luma_offset_l0(int, byte) luma_offset_l0}. */
    public static void nluma_offset_l0(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoEncodeH264WeightTable.LUMA_OFFSET_L0 + check(index, STD_VIDEO_H264_MAX_NUM_LIST_REF) * 1, value);
    }
    /** Unsafe version of {@link #chroma_weight_l0(ByteBuffer) chroma_weight_l0}. */
    public static void nchroma_weight_l0(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H264_MAX_CHROMA_PLANES); }
        memCopy(memAddress(value), struct + StdVideoEncodeH264WeightTable.CHROMA_WEIGHT_L0, value.remaining() * 1);
    }
    /** Unsafe version of {@link #chroma_weight_l0(int, byte) chroma_weight_l0}. */
    public static void nchroma_weight_l0(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoEncodeH264WeightTable.CHROMA_WEIGHT_L0 + check(index, STD_VIDEO_H264_MAX_CHROMA_PLANES) * 1, value);
    }
    /** Unsafe version of {@link #chroma_offset_l0(ByteBuffer) chroma_offset_l0}. */
    public static void nchroma_offset_l0(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H264_MAX_CHROMA_PLANES); }
        memCopy(memAddress(value), struct + StdVideoEncodeH264WeightTable.CHROMA_OFFSET_L0, value.remaining() * 1);
    }
    /** Unsafe version of {@link #chroma_offset_l0(int, byte) chroma_offset_l0}. */
    public static void nchroma_offset_l0(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoEncodeH264WeightTable.CHROMA_OFFSET_L0 + check(index, STD_VIDEO_H264_MAX_CHROMA_PLANES) * 1, value);
    }
    /** Unsafe version of {@link #luma_weight_l1(ByteBuffer) luma_weight_l1}. */
    public static void nluma_weight_l1(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H264_MAX_NUM_LIST_REF); }
        memCopy(memAddress(value), struct + StdVideoEncodeH264WeightTable.LUMA_WEIGHT_L1, value.remaining() * 1);
    }
    /** Unsafe version of {@link #luma_weight_l1(int, byte) luma_weight_l1}. */
    public static void nluma_weight_l1(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoEncodeH264WeightTable.LUMA_WEIGHT_L1 + check(index, STD_VIDEO_H264_MAX_NUM_LIST_REF) * 1, value);
    }
    /** Unsafe version of {@link #luma_offset_l1(ByteBuffer) luma_offset_l1}. */
    public static void nluma_offset_l1(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H264_MAX_NUM_LIST_REF); }
        memCopy(memAddress(value), struct + StdVideoEncodeH264WeightTable.LUMA_OFFSET_L1, value.remaining() * 1);
    }
    /** Unsafe version of {@link #luma_offset_l1(int, byte) luma_offset_l1}. */
    public static void nluma_offset_l1(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoEncodeH264WeightTable.LUMA_OFFSET_L1 + check(index, STD_VIDEO_H264_MAX_NUM_LIST_REF) * 1, value);
    }
    /** Unsafe version of {@link #chroma_weight_l1(ByteBuffer) chroma_weight_l1}. */
    public static void nchroma_weight_l1(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H264_MAX_CHROMA_PLANES); }
        memCopy(memAddress(value), struct + StdVideoEncodeH264WeightTable.CHROMA_WEIGHT_L1, value.remaining() * 1);
    }
    /** Unsafe version of {@link #chroma_weight_l1(int, byte) chroma_weight_l1}. */
    public static void nchroma_weight_l1(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoEncodeH264WeightTable.CHROMA_WEIGHT_L1 + check(index, STD_VIDEO_H264_MAX_CHROMA_PLANES) * 1, value);
    }
    /** Unsafe version of {@link #chroma_offset_l1(ByteBuffer) chroma_offset_l1}. */
    public static void nchroma_offset_l1(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H264_MAX_CHROMA_PLANES); }
        memCopy(memAddress(value), struct + StdVideoEncodeH264WeightTable.CHROMA_OFFSET_L1, value.remaining() * 1);
    }
    /** Unsafe version of {@link #chroma_offset_l1(int, byte) chroma_offset_l1}. */
    public static void nchroma_offset_l1(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoEncodeH264WeightTable.CHROMA_OFFSET_L1 + check(index, STD_VIDEO_H264_MAX_CHROMA_PLANES) * 1, value);
    }

    // -----------------------------------

    /** An array of {@link StdVideoEncodeH264WeightTable} structs. */
    public static class Buffer extends StructBuffer<StdVideoEncodeH264WeightTable, Buffer> implements NativeResource {

        private static final StdVideoEncodeH264WeightTable ELEMENT_FACTORY = StdVideoEncodeH264WeightTable.create(-1L);

        /**
         * Creates a new {@code StdVideoEncodeH264WeightTable.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoEncodeH264WeightTable#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoEncodeH264WeightTable getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link StdVideoEncodeH264WeightTableFlags} view of the {@code flags} field. */
        public StdVideoEncodeH264WeightTableFlags flags() { return StdVideoEncodeH264WeightTable.nflags(address()); }
        /** @return the value of the {@code luma_log2_weight_denom} field. */
        @NativeType("uint8_t")
        public byte luma_log2_weight_denom() { return StdVideoEncodeH264WeightTable.nluma_log2_weight_denom(address()); }
        /** @return the value of the {@code chroma_log2_weight_denom} field. */
        @NativeType("uint8_t")
        public byte chroma_log2_weight_denom() { return StdVideoEncodeH264WeightTable.nchroma_log2_weight_denom(address()); }
        /** @return a {@link ByteBuffer} view of the {@code luma_weight_l0} field. */
        @NativeType("int8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]")
        public ByteBuffer luma_weight_l0() { return StdVideoEncodeH264WeightTable.nluma_weight_l0(address()); }
        /** @return the value at the specified index of the {@code luma_weight_l0} field. */
        @NativeType("int8_t")
        public byte luma_weight_l0(int index) { return StdVideoEncodeH264WeightTable.nluma_weight_l0(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code luma_offset_l0} field. */
        @NativeType("int8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]")
        public ByteBuffer luma_offset_l0() { return StdVideoEncodeH264WeightTable.nluma_offset_l0(address()); }
        /** @return the value at the specified index of the {@code luma_offset_l0} field. */
        @NativeType("int8_t")
        public byte luma_offset_l0(int index) { return StdVideoEncodeH264WeightTable.nluma_offset_l0(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code chroma_weight_l0} field. */
        @NativeType("int8_t[STD_VIDEO_H264_MAX_CHROMA_PLANES]")
        public ByteBuffer chroma_weight_l0() { return StdVideoEncodeH264WeightTable.nchroma_weight_l0(address()); }
        /** @return the value at the specified index of the {@code chroma_weight_l0} field. */
        @NativeType("int8_t")
        public byte chroma_weight_l0(int index) { return StdVideoEncodeH264WeightTable.nchroma_weight_l0(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code chroma_offset_l0} field. */
        @NativeType("int8_t[STD_VIDEO_H264_MAX_CHROMA_PLANES]")
        public ByteBuffer chroma_offset_l0() { return StdVideoEncodeH264WeightTable.nchroma_offset_l0(address()); }
        /** @return the value at the specified index of the {@code chroma_offset_l0} field. */
        @NativeType("int8_t")
        public byte chroma_offset_l0(int index) { return StdVideoEncodeH264WeightTable.nchroma_offset_l0(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code luma_weight_l1} field. */
        @NativeType("int8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]")
        public ByteBuffer luma_weight_l1() { return StdVideoEncodeH264WeightTable.nluma_weight_l1(address()); }
        /** @return the value at the specified index of the {@code luma_weight_l1} field. */
        @NativeType("int8_t")
        public byte luma_weight_l1(int index) { return StdVideoEncodeH264WeightTable.nluma_weight_l1(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code luma_offset_l1} field. */
        @NativeType("int8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]")
        public ByteBuffer luma_offset_l1() { return StdVideoEncodeH264WeightTable.nluma_offset_l1(address()); }
        /** @return the value at the specified index of the {@code luma_offset_l1} field. */
        @NativeType("int8_t")
        public byte luma_offset_l1(int index) { return StdVideoEncodeH264WeightTable.nluma_offset_l1(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code chroma_weight_l1} field. */
        @NativeType("int8_t[STD_VIDEO_H264_MAX_CHROMA_PLANES]")
        public ByteBuffer chroma_weight_l1() { return StdVideoEncodeH264WeightTable.nchroma_weight_l1(address()); }
        /** @return the value at the specified index of the {@code chroma_weight_l1} field. */
        @NativeType("int8_t")
        public byte chroma_weight_l1(int index) { return StdVideoEncodeH264WeightTable.nchroma_weight_l1(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code chroma_offset_l1} field. */
        @NativeType("int8_t[STD_VIDEO_H264_MAX_CHROMA_PLANES]")
        public ByteBuffer chroma_offset_l1() { return StdVideoEncodeH264WeightTable.nchroma_offset_l1(address()); }
        /** @return the value at the specified index of the {@code chroma_offset_l1} field. */
        @NativeType("int8_t")
        public byte chroma_offset_l1(int index) { return StdVideoEncodeH264WeightTable.nchroma_offset_l1(address(), index); }

        /** Copies the specified {@link StdVideoEncodeH264WeightTableFlags} to the {@code flags} field. */
        public StdVideoEncodeH264WeightTable.Buffer flags(StdVideoEncodeH264WeightTableFlags value) { StdVideoEncodeH264WeightTable.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoEncodeH264WeightTable.Buffer flags(java.util.function.Consumer<StdVideoEncodeH264WeightTableFlags> consumer) { consumer.accept(flags()); return this; }
        /** Sets the specified value to the {@code luma_log2_weight_denom} field. */
        public StdVideoEncodeH264WeightTable.Buffer luma_log2_weight_denom(@NativeType("uint8_t") byte value) { StdVideoEncodeH264WeightTable.nluma_log2_weight_denom(address(), value); return this; }
        /** Sets the specified value to the {@code chroma_log2_weight_denom} field. */
        public StdVideoEncodeH264WeightTable.Buffer chroma_log2_weight_denom(@NativeType("uint8_t") byte value) { StdVideoEncodeH264WeightTable.nchroma_log2_weight_denom(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code luma_weight_l0} field. */
        public StdVideoEncodeH264WeightTable.Buffer luma_weight_l0(@NativeType("int8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]") ByteBuffer value) { StdVideoEncodeH264WeightTable.nluma_weight_l0(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code luma_weight_l0} field. */
        public StdVideoEncodeH264WeightTable.Buffer luma_weight_l0(int index, @NativeType("int8_t") byte value) { StdVideoEncodeH264WeightTable.nluma_weight_l0(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code luma_offset_l0} field. */
        public StdVideoEncodeH264WeightTable.Buffer luma_offset_l0(@NativeType("int8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]") ByteBuffer value) { StdVideoEncodeH264WeightTable.nluma_offset_l0(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code luma_offset_l0} field. */
        public StdVideoEncodeH264WeightTable.Buffer luma_offset_l0(int index, @NativeType("int8_t") byte value) { StdVideoEncodeH264WeightTable.nluma_offset_l0(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code chroma_weight_l0} field. */
        public StdVideoEncodeH264WeightTable.Buffer chroma_weight_l0(@NativeType("int8_t[STD_VIDEO_H264_MAX_CHROMA_PLANES]") ByteBuffer value) { StdVideoEncodeH264WeightTable.nchroma_weight_l0(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code chroma_weight_l0} field. */
        public StdVideoEncodeH264WeightTable.Buffer chroma_weight_l0(int index, @NativeType("int8_t") byte value) { StdVideoEncodeH264WeightTable.nchroma_weight_l0(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code chroma_offset_l0} field. */
        public StdVideoEncodeH264WeightTable.Buffer chroma_offset_l0(@NativeType("int8_t[STD_VIDEO_H264_MAX_CHROMA_PLANES]") ByteBuffer value) { StdVideoEncodeH264WeightTable.nchroma_offset_l0(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code chroma_offset_l0} field. */
        public StdVideoEncodeH264WeightTable.Buffer chroma_offset_l0(int index, @NativeType("int8_t") byte value) { StdVideoEncodeH264WeightTable.nchroma_offset_l0(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code luma_weight_l1} field. */
        public StdVideoEncodeH264WeightTable.Buffer luma_weight_l1(@NativeType("int8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]") ByteBuffer value) { StdVideoEncodeH264WeightTable.nluma_weight_l1(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code luma_weight_l1} field. */
        public StdVideoEncodeH264WeightTable.Buffer luma_weight_l1(int index, @NativeType("int8_t") byte value) { StdVideoEncodeH264WeightTable.nluma_weight_l1(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code luma_offset_l1} field. */
        public StdVideoEncodeH264WeightTable.Buffer luma_offset_l1(@NativeType("int8_t[STD_VIDEO_H264_MAX_NUM_LIST_REF]") ByteBuffer value) { StdVideoEncodeH264WeightTable.nluma_offset_l1(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code luma_offset_l1} field. */
        public StdVideoEncodeH264WeightTable.Buffer luma_offset_l1(int index, @NativeType("int8_t") byte value) { StdVideoEncodeH264WeightTable.nluma_offset_l1(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code chroma_weight_l1} field. */
        public StdVideoEncodeH264WeightTable.Buffer chroma_weight_l1(@NativeType("int8_t[STD_VIDEO_H264_MAX_CHROMA_PLANES]") ByteBuffer value) { StdVideoEncodeH264WeightTable.nchroma_weight_l1(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code chroma_weight_l1} field. */
        public StdVideoEncodeH264WeightTable.Buffer chroma_weight_l1(int index, @NativeType("int8_t") byte value) { StdVideoEncodeH264WeightTable.nchroma_weight_l1(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code chroma_offset_l1} field. */
        public StdVideoEncodeH264WeightTable.Buffer chroma_offset_l1(@NativeType("int8_t[STD_VIDEO_H264_MAX_CHROMA_PLANES]") ByteBuffer value) { StdVideoEncodeH264WeightTable.nchroma_offset_l1(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code chroma_offset_l1} field. */
        public StdVideoEncodeH264WeightTable.Buffer chroma_offset_l1(int index, @NativeType("int8_t") byte value) { StdVideoEncodeH264WeightTable.nchroma_offset_l1(address(), index, value); return this; }

    }

}