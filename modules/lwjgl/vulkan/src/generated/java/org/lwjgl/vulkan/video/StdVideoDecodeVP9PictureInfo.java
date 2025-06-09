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

import static org.lwjgl.vulkan.video.STDVulkanVideoCodecVP9.*;

/**
 * <pre>{@code
 * struct StdVideoDecodeVP9PictureInfo {
 *     {@link StdVideoDecodeVP9PictureInfoFlags StdVideoDecodeVP9PictureInfoFlags} flags;
 *     StdVideoVP9Profile profile;
 *     StdVideoVP9FrameType frame_type;
 *     uint8_t frame_context_idx;
 *     uint8_t reset_frame_context;
 *     uint8_t refresh_frame_flags;
 *     uint8_t ref_frame_sign_bias_mask;
 *     StdVideoVP9InterpolationFilter interpolation_filter;
 *     uint8_t base_q_idx;
 *     int8_t delta_q_y_dc;
 *     int8_t delta_q_uv_dc;
 *     int8_t delta_q_uv_ac;
 *     uint8_t tile_cols_log2;
 *     uint8_t tile_rows_log2;
 *     uint16_t reserved1[3];
 *     {@link StdVideoVP9ColorConfig StdVideoVP9ColorConfig} const * pColorConfig;
 *     {@link StdVideoVP9LoopFilter StdVideoVP9LoopFilter} const * pLoopFilter;
 *     {@link StdVideoVP9Segmentation StdVideoVP9Segmentation} const * pSegmentation;
 * }}</pre>
 */
public class StdVideoDecodeVP9PictureInfo extends Struct<StdVideoDecodeVP9PictureInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        PROFILE,
        FRAME_TYPE,
        FRAME_CONTEXT_IDX,
        RESET_FRAME_CONTEXT,
        REFRESH_FRAME_FLAGS,
        REF_FRAME_SIGN_BIAS_MASK,
        INTERPOLATION_FILTER,
        BASE_Q_IDX,
        DELTA_Q_Y_DC,
        DELTA_Q_UV_DC,
        DELTA_Q_UV_AC,
        TILE_COLS_LOG2,
        TILE_ROWS_LOG2,
        RESERVED1,
        PCOLORCONFIG,
        PLOOPFILTER,
        PSEGMENTATION;

    static {
        Layout layout = __struct(
            __member(StdVideoDecodeVP9PictureInfoFlags.SIZEOF, StdVideoDecodeVP9PictureInfoFlags.ALIGNOF),
            __member(4),
            __member(4),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(4),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __array(2, 3),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        PROFILE = layout.offsetof(1);
        FRAME_TYPE = layout.offsetof(2);
        FRAME_CONTEXT_IDX = layout.offsetof(3);
        RESET_FRAME_CONTEXT = layout.offsetof(4);
        REFRESH_FRAME_FLAGS = layout.offsetof(5);
        REF_FRAME_SIGN_BIAS_MASK = layout.offsetof(6);
        INTERPOLATION_FILTER = layout.offsetof(7);
        BASE_Q_IDX = layout.offsetof(8);
        DELTA_Q_Y_DC = layout.offsetof(9);
        DELTA_Q_UV_DC = layout.offsetof(10);
        DELTA_Q_UV_AC = layout.offsetof(11);
        TILE_COLS_LOG2 = layout.offsetof(12);
        TILE_ROWS_LOG2 = layout.offsetof(13);
        RESERVED1 = layout.offsetof(14);
        PCOLORCONFIG = layout.offsetof(15);
        PLOOPFILTER = layout.offsetof(16);
        PSEGMENTATION = layout.offsetof(17);
    }

    protected StdVideoDecodeVP9PictureInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoDecodeVP9PictureInfo create(long address, @Nullable ByteBuffer container) {
        return new StdVideoDecodeVP9PictureInfo(address, container);
    }

    /**
     * Creates a {@code StdVideoDecodeVP9PictureInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoDecodeVP9PictureInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link StdVideoDecodeVP9PictureInfoFlags} view of the {@code flags} field. */
    public StdVideoDecodeVP9PictureInfoFlags flags() { return nflags(address()); }
    /** @return the value of the {@code profile} field. */
    @NativeType("StdVideoVP9Profile")
    public int profile() { return nprofile(address()); }
    /** @return the value of the {@code frame_type} field. */
    @NativeType("StdVideoVP9FrameType")
    public int frame_type() { return nframe_type(address()); }
    /** @return the value of the {@code frame_context_idx} field. */
    @NativeType("uint8_t")
    public byte frame_context_idx() { return nframe_context_idx(address()); }
    /** @return the value of the {@code reset_frame_context} field. */
    @NativeType("uint8_t")
    public byte reset_frame_context() { return nreset_frame_context(address()); }
    /** @return the value of the {@code refresh_frame_flags} field. */
    @NativeType("uint8_t")
    public byte refresh_frame_flags() { return nrefresh_frame_flags(address()); }
    /** @return the value of the {@code ref_frame_sign_bias_mask} field. */
    @NativeType("uint8_t")
    public byte ref_frame_sign_bias_mask() { return nref_frame_sign_bias_mask(address()); }
    /** @return the value of the {@code interpolation_filter} field. */
    @NativeType("StdVideoVP9InterpolationFilter")
    public int interpolation_filter() { return ninterpolation_filter(address()); }
    /** @return the value of the {@code base_q_idx} field. */
    @NativeType("uint8_t")
    public byte base_q_idx() { return nbase_q_idx(address()); }
    /** @return the value of the {@code delta_q_y_dc} field. */
    @NativeType("int8_t")
    public byte delta_q_y_dc() { return ndelta_q_y_dc(address()); }
    /** @return the value of the {@code delta_q_uv_dc} field. */
    @NativeType("int8_t")
    public byte delta_q_uv_dc() { return ndelta_q_uv_dc(address()); }
    /** @return the value of the {@code delta_q_uv_ac} field. */
    @NativeType("int8_t")
    public byte delta_q_uv_ac() { return ndelta_q_uv_ac(address()); }
    /** @return the value of the {@code tile_cols_log2} field. */
    @NativeType("uint8_t")
    public byte tile_cols_log2() { return ntile_cols_log2(address()); }
    /** @return the value of the {@code tile_rows_log2} field. */
    @NativeType("uint8_t")
    public byte tile_rows_log2() { return ntile_rows_log2(address()); }
    /** @return a {@link StdVideoVP9ColorConfig} view of the struct pointed to by the {@code pColorConfig} field. */
    @NativeType("StdVideoVP9ColorConfig const *")
    public StdVideoVP9ColorConfig pColorConfig() { return npColorConfig(address()); }
    /** @return a {@link StdVideoVP9LoopFilter} view of the struct pointed to by the {@code pLoopFilter} field. */
    @NativeType("StdVideoVP9LoopFilter const *")
    public StdVideoVP9LoopFilter pLoopFilter() { return npLoopFilter(address()); }
    /** @return a {@link StdVideoVP9Segmentation} view of the struct pointed to by the {@code pSegmentation} field. */
    @NativeType("StdVideoVP9Segmentation const *")
    public StdVideoVP9Segmentation pSegmentation() { return npSegmentation(address()); }

    /** Copies the specified {@link StdVideoDecodeVP9PictureInfoFlags} to the {@code flags} field. */
    public StdVideoDecodeVP9PictureInfo flags(StdVideoDecodeVP9PictureInfoFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoDecodeVP9PictureInfo flags(java.util.function.Consumer<StdVideoDecodeVP9PictureInfoFlags> consumer) { consumer.accept(flags()); return this; }
    /** Sets the specified value to the {@code profile} field. */
    public StdVideoDecodeVP9PictureInfo profile(@NativeType("StdVideoVP9Profile") int value) { nprofile(address(), value); return this; }
    /** Sets the specified value to the {@code frame_type} field. */
    public StdVideoDecodeVP9PictureInfo frame_type(@NativeType("StdVideoVP9FrameType") int value) { nframe_type(address(), value); return this; }
    /** Sets the specified value to the {@code frame_context_idx} field. */
    public StdVideoDecodeVP9PictureInfo frame_context_idx(@NativeType("uint8_t") byte value) { nframe_context_idx(address(), value); return this; }
    /** Sets the specified value to the {@code reset_frame_context} field. */
    public StdVideoDecodeVP9PictureInfo reset_frame_context(@NativeType("uint8_t") byte value) { nreset_frame_context(address(), value); return this; }
    /** Sets the specified value to the {@code refresh_frame_flags} field. */
    public StdVideoDecodeVP9PictureInfo refresh_frame_flags(@NativeType("uint8_t") byte value) { nrefresh_frame_flags(address(), value); return this; }
    /** Sets the specified value to the {@code ref_frame_sign_bias_mask} field. */
    public StdVideoDecodeVP9PictureInfo ref_frame_sign_bias_mask(@NativeType("uint8_t") byte value) { nref_frame_sign_bias_mask(address(), value); return this; }
    /** Sets the specified value to the {@code interpolation_filter} field. */
    public StdVideoDecodeVP9PictureInfo interpolation_filter(@NativeType("StdVideoVP9InterpolationFilter") int value) { ninterpolation_filter(address(), value); return this; }
    /** Sets the specified value to the {@code base_q_idx} field. */
    public StdVideoDecodeVP9PictureInfo base_q_idx(@NativeType("uint8_t") byte value) { nbase_q_idx(address(), value); return this; }
    /** Sets the specified value to the {@code delta_q_y_dc} field. */
    public StdVideoDecodeVP9PictureInfo delta_q_y_dc(@NativeType("int8_t") byte value) { ndelta_q_y_dc(address(), value); return this; }
    /** Sets the specified value to the {@code delta_q_uv_dc} field. */
    public StdVideoDecodeVP9PictureInfo delta_q_uv_dc(@NativeType("int8_t") byte value) { ndelta_q_uv_dc(address(), value); return this; }
    /** Sets the specified value to the {@code delta_q_uv_ac} field. */
    public StdVideoDecodeVP9PictureInfo delta_q_uv_ac(@NativeType("int8_t") byte value) { ndelta_q_uv_ac(address(), value); return this; }
    /** Sets the specified value to the {@code tile_cols_log2} field. */
    public StdVideoDecodeVP9PictureInfo tile_cols_log2(@NativeType("uint8_t") byte value) { ntile_cols_log2(address(), value); return this; }
    /** Sets the specified value to the {@code tile_rows_log2} field. */
    public StdVideoDecodeVP9PictureInfo tile_rows_log2(@NativeType("uint8_t") byte value) { ntile_rows_log2(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoVP9ColorConfig} to the {@code pColorConfig} field. */
    public StdVideoDecodeVP9PictureInfo pColorConfig(@NativeType("StdVideoVP9ColorConfig const *") StdVideoVP9ColorConfig value) { npColorConfig(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoVP9LoopFilter} to the {@code pLoopFilter} field. */
    public StdVideoDecodeVP9PictureInfo pLoopFilter(@NativeType("StdVideoVP9LoopFilter const *") StdVideoVP9LoopFilter value) { npLoopFilter(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoVP9Segmentation} to the {@code pSegmentation} field. */
    public StdVideoDecodeVP9PictureInfo pSegmentation(@NativeType("StdVideoVP9Segmentation const *") StdVideoVP9Segmentation value) { npSegmentation(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoDecodeVP9PictureInfo set(
        StdVideoDecodeVP9PictureInfoFlags flags,
        int profile,
        int frame_type,
        byte frame_context_idx,
        byte reset_frame_context,
        byte refresh_frame_flags,
        byte ref_frame_sign_bias_mask,
        int interpolation_filter,
        byte base_q_idx,
        byte delta_q_y_dc,
        byte delta_q_uv_dc,
        byte delta_q_uv_ac,
        byte tile_cols_log2,
        byte tile_rows_log2,
        StdVideoVP9ColorConfig pColorConfig,
        StdVideoVP9LoopFilter pLoopFilter,
        StdVideoVP9Segmentation pSegmentation
    ) {
        flags(flags);
        profile(profile);
        frame_type(frame_type);
        frame_context_idx(frame_context_idx);
        reset_frame_context(reset_frame_context);
        refresh_frame_flags(refresh_frame_flags);
        ref_frame_sign_bias_mask(ref_frame_sign_bias_mask);
        interpolation_filter(interpolation_filter);
        base_q_idx(base_q_idx);
        delta_q_y_dc(delta_q_y_dc);
        delta_q_uv_dc(delta_q_uv_dc);
        delta_q_uv_ac(delta_q_uv_ac);
        tile_cols_log2(tile_cols_log2);
        tile_rows_log2(tile_rows_log2);
        pColorConfig(pColorConfig);
        pLoopFilter(pLoopFilter);
        pSegmentation(pSegmentation);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoDecodeVP9PictureInfo set(StdVideoDecodeVP9PictureInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoDecodeVP9PictureInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoDecodeVP9PictureInfo malloc() {
        return new StdVideoDecodeVP9PictureInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoDecodeVP9PictureInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoDecodeVP9PictureInfo calloc() {
        return new StdVideoDecodeVP9PictureInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoDecodeVP9PictureInfo} instance allocated with {@link BufferUtils}. */
    public static StdVideoDecodeVP9PictureInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoDecodeVP9PictureInfo(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoDecodeVP9PictureInfo} instance for the specified memory address. */
    public static StdVideoDecodeVP9PictureInfo create(long address) {
        return new StdVideoDecodeVP9PictureInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable StdVideoDecodeVP9PictureInfo createSafe(long address) {
        return address == NULL ? null : new StdVideoDecodeVP9PictureInfo(address, null);
    }

    /**
     * Returns a new {@link StdVideoDecodeVP9PictureInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeVP9PictureInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeVP9PictureInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeVP9PictureInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeVP9PictureInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeVP9PictureInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoDecodeVP9PictureInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeVP9PictureInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static StdVideoDecodeVP9PictureInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoDecodeVP9PictureInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoDecodeVP9PictureInfo malloc(MemoryStack stack) {
        return new StdVideoDecodeVP9PictureInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoDecodeVP9PictureInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoDecodeVP9PictureInfo calloc(MemoryStack stack) {
        return new StdVideoDecodeVP9PictureInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoDecodeVP9PictureInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeVP9PictureInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeVP9PictureInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeVP9PictureInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static StdVideoDecodeVP9PictureInfoFlags nflags(long struct) { return StdVideoDecodeVP9PictureInfoFlags.create(struct + StdVideoDecodeVP9PictureInfo.FLAGS); }
    /** Unsafe version of {@link #profile}. */
    public static int nprofile(long struct) { return memGetInt(struct + StdVideoDecodeVP9PictureInfo.PROFILE); }
    /** Unsafe version of {@link #frame_type}. */
    public static int nframe_type(long struct) { return memGetInt(struct + StdVideoDecodeVP9PictureInfo.FRAME_TYPE); }
    /** Unsafe version of {@link #frame_context_idx}. */
    public static byte nframe_context_idx(long struct) { return memGetByte(struct + StdVideoDecodeVP9PictureInfo.FRAME_CONTEXT_IDX); }
    /** Unsafe version of {@link #reset_frame_context}. */
    public static byte nreset_frame_context(long struct) { return memGetByte(struct + StdVideoDecodeVP9PictureInfo.RESET_FRAME_CONTEXT); }
    /** Unsafe version of {@link #refresh_frame_flags}. */
    public static byte nrefresh_frame_flags(long struct) { return memGetByte(struct + StdVideoDecodeVP9PictureInfo.REFRESH_FRAME_FLAGS); }
    /** Unsafe version of {@link #ref_frame_sign_bias_mask}. */
    public static byte nref_frame_sign_bias_mask(long struct) { return memGetByte(struct + StdVideoDecodeVP9PictureInfo.REF_FRAME_SIGN_BIAS_MASK); }
    /** Unsafe version of {@link #interpolation_filter}. */
    public static int ninterpolation_filter(long struct) { return memGetInt(struct + StdVideoDecodeVP9PictureInfo.INTERPOLATION_FILTER); }
    /** Unsafe version of {@link #base_q_idx}. */
    public static byte nbase_q_idx(long struct) { return memGetByte(struct + StdVideoDecodeVP9PictureInfo.BASE_Q_IDX); }
    /** Unsafe version of {@link #delta_q_y_dc}. */
    public static byte ndelta_q_y_dc(long struct) { return memGetByte(struct + StdVideoDecodeVP9PictureInfo.DELTA_Q_Y_DC); }
    /** Unsafe version of {@link #delta_q_uv_dc}. */
    public static byte ndelta_q_uv_dc(long struct) { return memGetByte(struct + StdVideoDecodeVP9PictureInfo.DELTA_Q_UV_DC); }
    /** Unsafe version of {@link #delta_q_uv_ac}. */
    public static byte ndelta_q_uv_ac(long struct) { return memGetByte(struct + StdVideoDecodeVP9PictureInfo.DELTA_Q_UV_AC); }
    /** Unsafe version of {@link #tile_cols_log2}. */
    public static byte ntile_cols_log2(long struct) { return memGetByte(struct + StdVideoDecodeVP9PictureInfo.TILE_COLS_LOG2); }
    /** Unsafe version of {@link #tile_rows_log2}. */
    public static byte ntile_rows_log2(long struct) { return memGetByte(struct + StdVideoDecodeVP9PictureInfo.TILE_ROWS_LOG2); }
    public static ShortBuffer nreserved1(long struct) { return memShortBuffer(struct + StdVideoDecodeVP9PictureInfo.RESERVED1, 3); }
    public static short nreserved1(long struct, int index) {
        return memGetShort(struct + StdVideoDecodeVP9PictureInfo.RESERVED1 + check(index, 3) * 2);
    }
    /** Unsafe version of {@link #pColorConfig}. */
    public static StdVideoVP9ColorConfig npColorConfig(long struct) { return StdVideoVP9ColorConfig.create(memGetAddress(struct + StdVideoDecodeVP9PictureInfo.PCOLORCONFIG)); }
    /** Unsafe version of {@link #pLoopFilter}. */
    public static StdVideoVP9LoopFilter npLoopFilter(long struct) { return StdVideoVP9LoopFilter.create(memGetAddress(struct + StdVideoDecodeVP9PictureInfo.PLOOPFILTER)); }
    /** Unsafe version of {@link #pSegmentation}. */
    public static StdVideoVP9Segmentation npSegmentation(long struct) { return StdVideoVP9Segmentation.create(memGetAddress(struct + StdVideoDecodeVP9PictureInfo.PSEGMENTATION)); }

    /** Unsafe version of {@link #flags(StdVideoDecodeVP9PictureInfoFlags) flags}. */
    public static void nflags(long struct, StdVideoDecodeVP9PictureInfoFlags value) { memCopy(value.address(), struct + StdVideoDecodeVP9PictureInfo.FLAGS, StdVideoDecodeVP9PictureInfoFlags.SIZEOF); }
    /** Unsafe version of {@link #profile(int) profile}. */
    public static void nprofile(long struct, int value) { memPutInt(struct + StdVideoDecodeVP9PictureInfo.PROFILE, value); }
    /** Unsafe version of {@link #frame_type(int) frame_type}. */
    public static void nframe_type(long struct, int value) { memPutInt(struct + StdVideoDecodeVP9PictureInfo.FRAME_TYPE, value); }
    /** Unsafe version of {@link #frame_context_idx(byte) frame_context_idx}. */
    public static void nframe_context_idx(long struct, byte value) { memPutByte(struct + StdVideoDecodeVP9PictureInfo.FRAME_CONTEXT_IDX, value); }
    /** Unsafe version of {@link #reset_frame_context(byte) reset_frame_context}. */
    public static void nreset_frame_context(long struct, byte value) { memPutByte(struct + StdVideoDecodeVP9PictureInfo.RESET_FRAME_CONTEXT, value); }
    /** Unsafe version of {@link #refresh_frame_flags(byte) refresh_frame_flags}. */
    public static void nrefresh_frame_flags(long struct, byte value) { memPutByte(struct + StdVideoDecodeVP9PictureInfo.REFRESH_FRAME_FLAGS, value); }
    /** Unsafe version of {@link #ref_frame_sign_bias_mask(byte) ref_frame_sign_bias_mask}. */
    public static void nref_frame_sign_bias_mask(long struct, byte value) { memPutByte(struct + StdVideoDecodeVP9PictureInfo.REF_FRAME_SIGN_BIAS_MASK, value); }
    /** Unsafe version of {@link #interpolation_filter(int) interpolation_filter}. */
    public static void ninterpolation_filter(long struct, int value) { memPutInt(struct + StdVideoDecodeVP9PictureInfo.INTERPOLATION_FILTER, value); }
    /** Unsafe version of {@link #base_q_idx(byte) base_q_idx}. */
    public static void nbase_q_idx(long struct, byte value) { memPutByte(struct + StdVideoDecodeVP9PictureInfo.BASE_Q_IDX, value); }
    /** Unsafe version of {@link #delta_q_y_dc(byte) delta_q_y_dc}. */
    public static void ndelta_q_y_dc(long struct, byte value) { memPutByte(struct + StdVideoDecodeVP9PictureInfo.DELTA_Q_Y_DC, value); }
    /** Unsafe version of {@link #delta_q_uv_dc(byte) delta_q_uv_dc}. */
    public static void ndelta_q_uv_dc(long struct, byte value) { memPutByte(struct + StdVideoDecodeVP9PictureInfo.DELTA_Q_UV_DC, value); }
    /** Unsafe version of {@link #delta_q_uv_ac(byte) delta_q_uv_ac}. */
    public static void ndelta_q_uv_ac(long struct, byte value) { memPutByte(struct + StdVideoDecodeVP9PictureInfo.DELTA_Q_UV_AC, value); }
    /** Unsafe version of {@link #tile_cols_log2(byte) tile_cols_log2}. */
    public static void ntile_cols_log2(long struct, byte value) { memPutByte(struct + StdVideoDecodeVP9PictureInfo.TILE_COLS_LOG2, value); }
    /** Unsafe version of {@link #tile_rows_log2(byte) tile_rows_log2}. */
    public static void ntile_rows_log2(long struct, byte value) { memPutByte(struct + StdVideoDecodeVP9PictureInfo.TILE_ROWS_LOG2, value); }
    public static void nreserved1(long struct, ShortBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + StdVideoDecodeVP9PictureInfo.RESERVED1, value.remaining() * 2);
    }
    public static void nreserved1(long struct, int index, short value) {
        memPutShort(struct + StdVideoDecodeVP9PictureInfo.RESERVED1 + check(index, 3) * 2, value);
    }
    /** Unsafe version of {@link #pColorConfig(StdVideoVP9ColorConfig) pColorConfig}. */
    public static void npColorConfig(long struct, StdVideoVP9ColorConfig value) { memPutAddress(struct + StdVideoDecodeVP9PictureInfo.PCOLORCONFIG, value.address()); }
    /** Unsafe version of {@link #pLoopFilter(StdVideoVP9LoopFilter) pLoopFilter}. */
    public static void npLoopFilter(long struct, StdVideoVP9LoopFilter value) { memPutAddress(struct + StdVideoDecodeVP9PictureInfo.PLOOPFILTER, value.address()); }
    /** Unsafe version of {@link #pSegmentation(StdVideoVP9Segmentation) pSegmentation}. */
    public static void npSegmentation(long struct, StdVideoVP9Segmentation value) { memPutAddress(struct + StdVideoDecodeVP9PictureInfo.PSEGMENTATION, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + StdVideoDecodeVP9PictureInfo.PCOLORCONFIG));
        check(memGetAddress(struct + StdVideoDecodeVP9PictureInfo.PLOOPFILTER));
        check(memGetAddress(struct + StdVideoDecodeVP9PictureInfo.PSEGMENTATION));
    }

    // -----------------------------------

    /** An array of {@link StdVideoDecodeVP9PictureInfo} structs. */
    public static class Buffer extends StructBuffer<StdVideoDecodeVP9PictureInfo, Buffer> implements NativeResource {

        private static final StdVideoDecodeVP9PictureInfo ELEMENT_FACTORY = StdVideoDecodeVP9PictureInfo.create(-1L);

        /**
         * Creates a new {@code StdVideoDecodeVP9PictureInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoDecodeVP9PictureInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoDecodeVP9PictureInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link StdVideoDecodeVP9PictureInfoFlags} view of the {@code flags} field. */
        public StdVideoDecodeVP9PictureInfoFlags flags() { return StdVideoDecodeVP9PictureInfo.nflags(address()); }
        /** @return the value of the {@code profile} field. */
        @NativeType("StdVideoVP9Profile")
        public int profile() { return StdVideoDecodeVP9PictureInfo.nprofile(address()); }
        /** @return the value of the {@code frame_type} field. */
        @NativeType("StdVideoVP9FrameType")
        public int frame_type() { return StdVideoDecodeVP9PictureInfo.nframe_type(address()); }
        /** @return the value of the {@code frame_context_idx} field. */
        @NativeType("uint8_t")
        public byte frame_context_idx() { return StdVideoDecodeVP9PictureInfo.nframe_context_idx(address()); }
        /** @return the value of the {@code reset_frame_context} field. */
        @NativeType("uint8_t")
        public byte reset_frame_context() { return StdVideoDecodeVP9PictureInfo.nreset_frame_context(address()); }
        /** @return the value of the {@code refresh_frame_flags} field. */
        @NativeType("uint8_t")
        public byte refresh_frame_flags() { return StdVideoDecodeVP9PictureInfo.nrefresh_frame_flags(address()); }
        /** @return the value of the {@code ref_frame_sign_bias_mask} field. */
        @NativeType("uint8_t")
        public byte ref_frame_sign_bias_mask() { return StdVideoDecodeVP9PictureInfo.nref_frame_sign_bias_mask(address()); }
        /** @return the value of the {@code interpolation_filter} field. */
        @NativeType("StdVideoVP9InterpolationFilter")
        public int interpolation_filter() { return StdVideoDecodeVP9PictureInfo.ninterpolation_filter(address()); }
        /** @return the value of the {@code base_q_idx} field. */
        @NativeType("uint8_t")
        public byte base_q_idx() { return StdVideoDecodeVP9PictureInfo.nbase_q_idx(address()); }
        /** @return the value of the {@code delta_q_y_dc} field. */
        @NativeType("int8_t")
        public byte delta_q_y_dc() { return StdVideoDecodeVP9PictureInfo.ndelta_q_y_dc(address()); }
        /** @return the value of the {@code delta_q_uv_dc} field. */
        @NativeType("int8_t")
        public byte delta_q_uv_dc() { return StdVideoDecodeVP9PictureInfo.ndelta_q_uv_dc(address()); }
        /** @return the value of the {@code delta_q_uv_ac} field. */
        @NativeType("int8_t")
        public byte delta_q_uv_ac() { return StdVideoDecodeVP9PictureInfo.ndelta_q_uv_ac(address()); }
        /** @return the value of the {@code tile_cols_log2} field. */
        @NativeType("uint8_t")
        public byte tile_cols_log2() { return StdVideoDecodeVP9PictureInfo.ntile_cols_log2(address()); }
        /** @return the value of the {@code tile_rows_log2} field. */
        @NativeType("uint8_t")
        public byte tile_rows_log2() { return StdVideoDecodeVP9PictureInfo.ntile_rows_log2(address()); }
        /** @return a {@link StdVideoVP9ColorConfig} view of the struct pointed to by the {@code pColorConfig} field. */
        @NativeType("StdVideoVP9ColorConfig const *")
        public StdVideoVP9ColorConfig pColorConfig() { return StdVideoDecodeVP9PictureInfo.npColorConfig(address()); }
        /** @return a {@link StdVideoVP9LoopFilter} view of the struct pointed to by the {@code pLoopFilter} field. */
        @NativeType("StdVideoVP9LoopFilter const *")
        public StdVideoVP9LoopFilter pLoopFilter() { return StdVideoDecodeVP9PictureInfo.npLoopFilter(address()); }
        /** @return a {@link StdVideoVP9Segmentation} view of the struct pointed to by the {@code pSegmentation} field. */
        @NativeType("StdVideoVP9Segmentation const *")
        public StdVideoVP9Segmentation pSegmentation() { return StdVideoDecodeVP9PictureInfo.npSegmentation(address()); }

        /** Copies the specified {@link StdVideoDecodeVP9PictureInfoFlags} to the {@code flags} field. */
        public StdVideoDecodeVP9PictureInfo.Buffer flags(StdVideoDecodeVP9PictureInfoFlags value) { StdVideoDecodeVP9PictureInfo.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoDecodeVP9PictureInfo.Buffer flags(java.util.function.Consumer<StdVideoDecodeVP9PictureInfoFlags> consumer) { consumer.accept(flags()); return this; }
        /** Sets the specified value to the {@code profile} field. */
        public StdVideoDecodeVP9PictureInfo.Buffer profile(@NativeType("StdVideoVP9Profile") int value) { StdVideoDecodeVP9PictureInfo.nprofile(address(), value); return this; }
        /** Sets the specified value to the {@code frame_type} field. */
        public StdVideoDecodeVP9PictureInfo.Buffer frame_type(@NativeType("StdVideoVP9FrameType") int value) { StdVideoDecodeVP9PictureInfo.nframe_type(address(), value); return this; }
        /** Sets the specified value to the {@code frame_context_idx} field. */
        public StdVideoDecodeVP9PictureInfo.Buffer frame_context_idx(@NativeType("uint8_t") byte value) { StdVideoDecodeVP9PictureInfo.nframe_context_idx(address(), value); return this; }
        /** Sets the specified value to the {@code reset_frame_context} field. */
        public StdVideoDecodeVP9PictureInfo.Buffer reset_frame_context(@NativeType("uint8_t") byte value) { StdVideoDecodeVP9PictureInfo.nreset_frame_context(address(), value); return this; }
        /** Sets the specified value to the {@code refresh_frame_flags} field. */
        public StdVideoDecodeVP9PictureInfo.Buffer refresh_frame_flags(@NativeType("uint8_t") byte value) { StdVideoDecodeVP9PictureInfo.nrefresh_frame_flags(address(), value); return this; }
        /** Sets the specified value to the {@code ref_frame_sign_bias_mask} field. */
        public StdVideoDecodeVP9PictureInfo.Buffer ref_frame_sign_bias_mask(@NativeType("uint8_t") byte value) { StdVideoDecodeVP9PictureInfo.nref_frame_sign_bias_mask(address(), value); return this; }
        /** Sets the specified value to the {@code interpolation_filter} field. */
        public StdVideoDecodeVP9PictureInfo.Buffer interpolation_filter(@NativeType("StdVideoVP9InterpolationFilter") int value) { StdVideoDecodeVP9PictureInfo.ninterpolation_filter(address(), value); return this; }
        /** Sets the specified value to the {@code base_q_idx} field. */
        public StdVideoDecodeVP9PictureInfo.Buffer base_q_idx(@NativeType("uint8_t") byte value) { StdVideoDecodeVP9PictureInfo.nbase_q_idx(address(), value); return this; }
        /** Sets the specified value to the {@code delta_q_y_dc} field. */
        public StdVideoDecodeVP9PictureInfo.Buffer delta_q_y_dc(@NativeType("int8_t") byte value) { StdVideoDecodeVP9PictureInfo.ndelta_q_y_dc(address(), value); return this; }
        /** Sets the specified value to the {@code delta_q_uv_dc} field. */
        public StdVideoDecodeVP9PictureInfo.Buffer delta_q_uv_dc(@NativeType("int8_t") byte value) { StdVideoDecodeVP9PictureInfo.ndelta_q_uv_dc(address(), value); return this; }
        /** Sets the specified value to the {@code delta_q_uv_ac} field. */
        public StdVideoDecodeVP9PictureInfo.Buffer delta_q_uv_ac(@NativeType("int8_t") byte value) { StdVideoDecodeVP9PictureInfo.ndelta_q_uv_ac(address(), value); return this; }
        /** Sets the specified value to the {@code tile_cols_log2} field. */
        public StdVideoDecodeVP9PictureInfo.Buffer tile_cols_log2(@NativeType("uint8_t") byte value) { StdVideoDecodeVP9PictureInfo.ntile_cols_log2(address(), value); return this; }
        /** Sets the specified value to the {@code tile_rows_log2} field. */
        public StdVideoDecodeVP9PictureInfo.Buffer tile_rows_log2(@NativeType("uint8_t") byte value) { StdVideoDecodeVP9PictureInfo.ntile_rows_log2(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoVP9ColorConfig} to the {@code pColorConfig} field. */
        public StdVideoDecodeVP9PictureInfo.Buffer pColorConfig(@NativeType("StdVideoVP9ColorConfig const *") StdVideoVP9ColorConfig value) { StdVideoDecodeVP9PictureInfo.npColorConfig(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoVP9LoopFilter} to the {@code pLoopFilter} field. */
        public StdVideoDecodeVP9PictureInfo.Buffer pLoopFilter(@NativeType("StdVideoVP9LoopFilter const *") StdVideoVP9LoopFilter value) { StdVideoDecodeVP9PictureInfo.npLoopFilter(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoVP9Segmentation} to the {@code pSegmentation} field. */
        public StdVideoDecodeVP9PictureInfo.Buffer pSegmentation(@NativeType("StdVideoVP9Segmentation const *") StdVideoVP9Segmentation value) { StdVideoDecodeVP9PictureInfo.npSegmentation(address(), value); return this; }

    }

}