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

import static org.lwjgl.vulkan.video.STDVulkanVideoCodecAV1.*;

/**
 * <pre>{@code
 * struct StdVideoEncodeAV1PictureInfo {
 *     {@link StdVideoEncodeAV1PictureInfoFlags StdVideoEncodeAV1PictureInfoFlags} flags;
 *     StdVideoAV1FrameType frame_type;
 *     uint32_t frame_presentation_time;
 *     uint32_t current_frame_id;
 *     uint8_t order_hint;
 *     uint8_t primary_ref_frame;
 *     uint8_t refresh_frame_flags;
 *     uint8_t coded_denom;
 *     uint16_t render_width_minus_1;
 *     uint16_t render_height_minus_1;
 *     StdVideoAV1InterpolationFilter interpolation_filter;
 *     StdVideoAV1TxMode TxMode;
 *     uint8_t delta_q_res;
 *     uint8_t delta_lf_res;
 *     uint8_t ref_order_hint[STD_VIDEO_AV1_NUM_REF_FRAMES];
 *     int8_t ref_frame_idx[STD_VIDEO_AV1_REFS_PER_FRAME];
 *     uint8_t reserved1[3];
 *     uint32_t delta_frame_id_minus_1[STD_VIDEO_AV1_REFS_PER_FRAME];
 *     {@link StdVideoAV1TileInfo StdVideoAV1TileInfo} const * pTileInfo;
 *     {@link StdVideoAV1Quantization StdVideoAV1Quantization} const * pQuantization;
 *     {@link StdVideoAV1Segmentation StdVideoAV1Segmentation} const * pSegmentation;
 *     {@link StdVideoAV1LoopFilter StdVideoAV1LoopFilter} const * pLoopFilter;
 *     {@link StdVideoAV1CDEF StdVideoAV1CDEF} const * pCDEF;
 *     {@link StdVideoAV1LoopRestoration StdVideoAV1LoopRestoration} const * pLoopRestoration;
 *     {@link StdVideoAV1GlobalMotion StdVideoAV1GlobalMotion} const * pGlobalMotion;
 *     {@link StdVideoEncodeAV1ExtensionHeader StdVideoEncodeAV1ExtensionHeader} const * pExtensionHeader;
 *     uint32_t const * pBufferRemovalTimes;
 * }}</pre>
 */
public class StdVideoEncodeAV1PictureInfo extends Struct<StdVideoEncodeAV1PictureInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        FRAME_TYPE,
        FRAME_PRESENTATION_TIME,
        CURRENT_FRAME_ID,
        ORDER_HINT,
        PRIMARY_REF_FRAME,
        REFRESH_FRAME_FLAGS,
        CODED_DENOM,
        RENDER_WIDTH_MINUS_1,
        RENDER_HEIGHT_MINUS_1,
        INTERPOLATION_FILTER,
        TXMODE,
        DELTA_Q_RES,
        DELTA_LF_RES,
        REF_ORDER_HINT,
        REF_FRAME_IDX,
        RESERVED1,
        DELTA_FRAME_ID_MINUS_1,
        PTILEINFO,
        PQUANTIZATION,
        PSEGMENTATION,
        PLOOPFILTER,
        PCDEF,
        PLOOPRESTORATION,
        PGLOBALMOTION,
        PEXTENSIONHEADER,
        PBUFFERREMOVALTIMES;

    static {
        Layout layout = __struct(
            __member(StdVideoEncodeAV1PictureInfoFlags.SIZEOF, StdVideoEncodeAV1PictureInfoFlags.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(2),
            __member(2),
            __member(4),
            __member(4),
            __member(1),
            __member(1),
            __array(1, STD_VIDEO_AV1_NUM_REF_FRAMES),
            __array(1, STD_VIDEO_AV1_REFS_PER_FRAME),
            __array(1, 3),
            __array(4, STD_VIDEO_AV1_REFS_PER_FRAME),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        FRAME_TYPE = layout.offsetof(1);
        FRAME_PRESENTATION_TIME = layout.offsetof(2);
        CURRENT_FRAME_ID = layout.offsetof(3);
        ORDER_HINT = layout.offsetof(4);
        PRIMARY_REF_FRAME = layout.offsetof(5);
        REFRESH_FRAME_FLAGS = layout.offsetof(6);
        CODED_DENOM = layout.offsetof(7);
        RENDER_WIDTH_MINUS_1 = layout.offsetof(8);
        RENDER_HEIGHT_MINUS_1 = layout.offsetof(9);
        INTERPOLATION_FILTER = layout.offsetof(10);
        TXMODE = layout.offsetof(11);
        DELTA_Q_RES = layout.offsetof(12);
        DELTA_LF_RES = layout.offsetof(13);
        REF_ORDER_HINT = layout.offsetof(14);
        REF_FRAME_IDX = layout.offsetof(15);
        RESERVED1 = layout.offsetof(16);
        DELTA_FRAME_ID_MINUS_1 = layout.offsetof(17);
        PTILEINFO = layout.offsetof(18);
        PQUANTIZATION = layout.offsetof(19);
        PSEGMENTATION = layout.offsetof(20);
        PLOOPFILTER = layout.offsetof(21);
        PCDEF = layout.offsetof(22);
        PLOOPRESTORATION = layout.offsetof(23);
        PGLOBALMOTION = layout.offsetof(24);
        PEXTENSIONHEADER = layout.offsetof(25);
        PBUFFERREMOVALTIMES = layout.offsetof(26);
    }

    protected StdVideoEncodeAV1PictureInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoEncodeAV1PictureInfo create(long address, @Nullable ByteBuffer container) {
        return new StdVideoEncodeAV1PictureInfo(address, container);
    }

    /**
     * Creates a {@code StdVideoEncodeAV1PictureInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoEncodeAV1PictureInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link StdVideoEncodeAV1PictureInfoFlags} view of the {@code flags} field. */
    public StdVideoEncodeAV1PictureInfoFlags flags() { return nflags(address()); }
    /** @return the value of the {@code frame_type} field. */
    @NativeType("StdVideoAV1FrameType")
    public int frame_type() { return nframe_type(address()); }
    /** @return the value of the {@code frame_presentation_time} field. */
    @NativeType("uint32_t")
    public int frame_presentation_time() { return nframe_presentation_time(address()); }
    /** @return the value of the {@code current_frame_id} field. */
    @NativeType("uint32_t")
    public int current_frame_id() { return ncurrent_frame_id(address()); }
    /** @return the value of the {@code order_hint} field. */
    @NativeType("uint8_t")
    public byte order_hint() { return norder_hint(address()); }
    /** @return the value of the {@code primary_ref_frame} field. */
    @NativeType("uint8_t")
    public byte primary_ref_frame() { return nprimary_ref_frame(address()); }
    /** @return the value of the {@code refresh_frame_flags} field. */
    @NativeType("uint8_t")
    public byte refresh_frame_flags() { return nrefresh_frame_flags(address()); }
    /** @return the value of the {@code coded_denom} field. */
    @NativeType("uint8_t")
    public byte coded_denom() { return ncoded_denom(address()); }
    /** @return the value of the {@code render_width_minus_1} field. */
    @NativeType("uint16_t")
    public short render_width_minus_1() { return nrender_width_minus_1(address()); }
    /** @return the value of the {@code render_height_minus_1} field. */
    @NativeType("uint16_t")
    public short render_height_minus_1() { return nrender_height_minus_1(address()); }
    /** @return the value of the {@code interpolation_filter} field. */
    @NativeType("StdVideoAV1InterpolationFilter")
    public int interpolation_filter() { return ninterpolation_filter(address()); }
    /** @return the value of the {@code TxMode} field. */
    @NativeType("StdVideoAV1TxMode")
    public int TxMode() { return nTxMode(address()); }
    /** @return the value of the {@code delta_q_res} field. */
    @NativeType("uint8_t")
    public byte delta_q_res() { return ndelta_q_res(address()); }
    /** @return the value of the {@code delta_lf_res} field. */
    @NativeType("uint8_t")
    public byte delta_lf_res() { return ndelta_lf_res(address()); }
    /** @return a {@link ByteBuffer} view of the {@code ref_order_hint} field. */
    @NativeType("uint8_t[STD_VIDEO_AV1_NUM_REF_FRAMES]")
    public ByteBuffer ref_order_hint() { return nref_order_hint(address()); }
    /** @return the value at the specified index of the {@code ref_order_hint} field. */
    @NativeType("uint8_t")
    public byte ref_order_hint(int index) { return nref_order_hint(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code ref_frame_idx} field. */
    @NativeType("int8_t[STD_VIDEO_AV1_REFS_PER_FRAME]")
    public ByteBuffer ref_frame_idx() { return nref_frame_idx(address()); }
    /** @return the value at the specified index of the {@code ref_frame_idx} field. */
    @NativeType("int8_t")
    public byte ref_frame_idx(int index) { return nref_frame_idx(address(), index); }
    /** @return a {@link IntBuffer} view of the {@code delta_frame_id_minus_1} field. */
    @NativeType("uint32_t[STD_VIDEO_AV1_REFS_PER_FRAME]")
    public IntBuffer delta_frame_id_minus_1() { return ndelta_frame_id_minus_1(address()); }
    /** @return the value at the specified index of the {@code delta_frame_id_minus_1} field. */
    @NativeType("uint32_t")
    public int delta_frame_id_minus_1(int index) { return ndelta_frame_id_minus_1(address(), index); }
    /** @return a {@link StdVideoAV1TileInfo} view of the struct pointed to by the {@code pTileInfo} field. */
    @NativeType("StdVideoAV1TileInfo const *")
    public StdVideoAV1TileInfo pTileInfo() { return npTileInfo(address()); }
    /** @return a {@link StdVideoAV1Quantization} view of the struct pointed to by the {@code pQuantization} field. */
    @NativeType("StdVideoAV1Quantization const *")
    public StdVideoAV1Quantization pQuantization() { return npQuantization(address()); }
    /** @return a {@link StdVideoAV1Segmentation} view of the struct pointed to by the {@code pSegmentation} field. */
    @NativeType("StdVideoAV1Segmentation const *")
    public StdVideoAV1Segmentation pSegmentation() { return npSegmentation(address()); }
    /** @return a {@link StdVideoAV1LoopFilter} view of the struct pointed to by the {@code pLoopFilter} field. */
    @NativeType("StdVideoAV1LoopFilter const *")
    public StdVideoAV1LoopFilter pLoopFilter() { return npLoopFilter(address()); }
    /** @return a {@link StdVideoAV1CDEF} view of the struct pointed to by the {@code pCDEF} field. */
    @NativeType("StdVideoAV1CDEF const *")
    public StdVideoAV1CDEF pCDEF() { return npCDEF(address()); }
    /** @return a {@link StdVideoAV1LoopRestoration} view of the struct pointed to by the {@code pLoopRestoration} field. */
    @NativeType("StdVideoAV1LoopRestoration const *")
    public StdVideoAV1LoopRestoration pLoopRestoration() { return npLoopRestoration(address()); }
    /** @return a {@link StdVideoAV1GlobalMotion} view of the struct pointed to by the {@code pGlobalMotion} field. */
    @NativeType("StdVideoAV1GlobalMotion const *")
    public StdVideoAV1GlobalMotion pGlobalMotion() { return npGlobalMotion(address()); }
    /** @return a {@link StdVideoEncodeAV1ExtensionHeader} view of the struct pointed to by the {@code pExtensionHeader} field. */
    @NativeType("StdVideoEncodeAV1ExtensionHeader const *")
    public StdVideoEncodeAV1ExtensionHeader pExtensionHeader() { return npExtensionHeader(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pBufferRemovalTimes} field. */
    @NativeType("uint32_t const *")
    public IntBuffer pBufferRemovalTimes(int capacity) { return npBufferRemovalTimes(address(), capacity); }

    /** Copies the specified {@link StdVideoEncodeAV1PictureInfoFlags} to the {@code flags} field. */
    public StdVideoEncodeAV1PictureInfo flags(StdVideoEncodeAV1PictureInfoFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoEncodeAV1PictureInfo flags(java.util.function.Consumer<StdVideoEncodeAV1PictureInfoFlags> consumer) { consumer.accept(flags()); return this; }
    /** Sets the specified value to the {@code frame_type} field. */
    public StdVideoEncodeAV1PictureInfo frame_type(@NativeType("StdVideoAV1FrameType") int value) { nframe_type(address(), value); return this; }
    /** Sets the specified value to the {@code frame_presentation_time} field. */
    public StdVideoEncodeAV1PictureInfo frame_presentation_time(@NativeType("uint32_t") int value) { nframe_presentation_time(address(), value); return this; }
    /** Sets the specified value to the {@code current_frame_id} field. */
    public StdVideoEncodeAV1PictureInfo current_frame_id(@NativeType("uint32_t") int value) { ncurrent_frame_id(address(), value); return this; }
    /** Sets the specified value to the {@code order_hint} field. */
    public StdVideoEncodeAV1PictureInfo order_hint(@NativeType("uint8_t") byte value) { norder_hint(address(), value); return this; }
    /** Sets the specified value to the {@code primary_ref_frame} field. */
    public StdVideoEncodeAV1PictureInfo primary_ref_frame(@NativeType("uint8_t") byte value) { nprimary_ref_frame(address(), value); return this; }
    /** Sets the specified value to the {@code refresh_frame_flags} field. */
    public StdVideoEncodeAV1PictureInfo refresh_frame_flags(@NativeType("uint8_t") byte value) { nrefresh_frame_flags(address(), value); return this; }
    /** Sets the specified value to the {@code coded_denom} field. */
    public StdVideoEncodeAV1PictureInfo coded_denom(@NativeType("uint8_t") byte value) { ncoded_denom(address(), value); return this; }
    /** Sets the specified value to the {@code render_width_minus_1} field. */
    public StdVideoEncodeAV1PictureInfo render_width_minus_1(@NativeType("uint16_t") short value) { nrender_width_minus_1(address(), value); return this; }
    /** Sets the specified value to the {@code render_height_minus_1} field. */
    public StdVideoEncodeAV1PictureInfo render_height_minus_1(@NativeType("uint16_t") short value) { nrender_height_minus_1(address(), value); return this; }
    /** Sets the specified value to the {@code interpolation_filter} field. */
    public StdVideoEncodeAV1PictureInfo interpolation_filter(@NativeType("StdVideoAV1InterpolationFilter") int value) { ninterpolation_filter(address(), value); return this; }
    /** Sets the specified value to the {@code TxMode} field. */
    public StdVideoEncodeAV1PictureInfo TxMode(@NativeType("StdVideoAV1TxMode") int value) { nTxMode(address(), value); return this; }
    /** Sets the specified value to the {@code delta_q_res} field. */
    public StdVideoEncodeAV1PictureInfo delta_q_res(@NativeType("uint8_t") byte value) { ndelta_q_res(address(), value); return this; }
    /** Sets the specified value to the {@code delta_lf_res} field. */
    public StdVideoEncodeAV1PictureInfo delta_lf_res(@NativeType("uint8_t") byte value) { ndelta_lf_res(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code ref_order_hint} field. */
    public StdVideoEncodeAV1PictureInfo ref_order_hint(@NativeType("uint8_t[STD_VIDEO_AV1_NUM_REF_FRAMES]") ByteBuffer value) { nref_order_hint(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code ref_order_hint} field. */
    public StdVideoEncodeAV1PictureInfo ref_order_hint(int index, @NativeType("uint8_t") byte value) { nref_order_hint(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code ref_frame_idx} field. */
    public StdVideoEncodeAV1PictureInfo ref_frame_idx(@NativeType("int8_t[STD_VIDEO_AV1_REFS_PER_FRAME]") ByteBuffer value) { nref_frame_idx(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code ref_frame_idx} field. */
    public StdVideoEncodeAV1PictureInfo ref_frame_idx(int index, @NativeType("int8_t") byte value) { nref_frame_idx(address(), index, value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code delta_frame_id_minus_1} field. */
    public StdVideoEncodeAV1PictureInfo delta_frame_id_minus_1(@NativeType("uint32_t[STD_VIDEO_AV1_REFS_PER_FRAME]") IntBuffer value) { ndelta_frame_id_minus_1(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code delta_frame_id_minus_1} field. */
    public StdVideoEncodeAV1PictureInfo delta_frame_id_minus_1(int index, @NativeType("uint32_t") int value) { ndelta_frame_id_minus_1(address(), index, value); return this; }
    /** Sets the address of the specified {@link StdVideoAV1TileInfo} to the {@code pTileInfo} field. */
    public StdVideoEncodeAV1PictureInfo pTileInfo(@NativeType("StdVideoAV1TileInfo const *") StdVideoAV1TileInfo value) { npTileInfo(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoAV1Quantization} to the {@code pQuantization} field. */
    public StdVideoEncodeAV1PictureInfo pQuantization(@NativeType("StdVideoAV1Quantization const *") StdVideoAV1Quantization value) { npQuantization(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoAV1Segmentation} to the {@code pSegmentation} field. */
    public StdVideoEncodeAV1PictureInfo pSegmentation(@NativeType("StdVideoAV1Segmentation const *") StdVideoAV1Segmentation value) { npSegmentation(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoAV1LoopFilter} to the {@code pLoopFilter} field. */
    public StdVideoEncodeAV1PictureInfo pLoopFilter(@NativeType("StdVideoAV1LoopFilter const *") StdVideoAV1LoopFilter value) { npLoopFilter(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoAV1CDEF} to the {@code pCDEF} field. */
    public StdVideoEncodeAV1PictureInfo pCDEF(@NativeType("StdVideoAV1CDEF const *") StdVideoAV1CDEF value) { npCDEF(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoAV1LoopRestoration} to the {@code pLoopRestoration} field. */
    public StdVideoEncodeAV1PictureInfo pLoopRestoration(@NativeType("StdVideoAV1LoopRestoration const *") StdVideoAV1LoopRestoration value) { npLoopRestoration(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoAV1GlobalMotion} to the {@code pGlobalMotion} field. */
    public StdVideoEncodeAV1PictureInfo pGlobalMotion(@NativeType("StdVideoAV1GlobalMotion const *") StdVideoAV1GlobalMotion value) { npGlobalMotion(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoEncodeAV1ExtensionHeader} to the {@code pExtensionHeader} field. */
    public StdVideoEncodeAV1PictureInfo pExtensionHeader(@NativeType("StdVideoEncodeAV1ExtensionHeader const *") StdVideoEncodeAV1ExtensionHeader value) { npExtensionHeader(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pBufferRemovalTimes} field. */
    public StdVideoEncodeAV1PictureInfo pBufferRemovalTimes(@NativeType("uint32_t const *") IntBuffer value) { npBufferRemovalTimes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoEncodeAV1PictureInfo set(
        StdVideoEncodeAV1PictureInfoFlags flags,
        int frame_type,
        int frame_presentation_time,
        int current_frame_id,
        byte order_hint,
        byte primary_ref_frame,
        byte refresh_frame_flags,
        byte coded_denom,
        short render_width_minus_1,
        short render_height_minus_1,
        int interpolation_filter,
        int TxMode,
        byte delta_q_res,
        byte delta_lf_res,
        ByteBuffer ref_order_hint,
        ByteBuffer ref_frame_idx,
        IntBuffer delta_frame_id_minus_1,
        StdVideoAV1TileInfo pTileInfo,
        StdVideoAV1Quantization pQuantization,
        StdVideoAV1Segmentation pSegmentation,
        StdVideoAV1LoopFilter pLoopFilter,
        StdVideoAV1CDEF pCDEF,
        StdVideoAV1LoopRestoration pLoopRestoration,
        StdVideoAV1GlobalMotion pGlobalMotion,
        StdVideoEncodeAV1ExtensionHeader pExtensionHeader,
        IntBuffer pBufferRemovalTimes
    ) {
        flags(flags);
        frame_type(frame_type);
        frame_presentation_time(frame_presentation_time);
        current_frame_id(current_frame_id);
        order_hint(order_hint);
        primary_ref_frame(primary_ref_frame);
        refresh_frame_flags(refresh_frame_flags);
        coded_denom(coded_denom);
        render_width_minus_1(render_width_minus_1);
        render_height_minus_1(render_height_minus_1);
        interpolation_filter(interpolation_filter);
        TxMode(TxMode);
        delta_q_res(delta_q_res);
        delta_lf_res(delta_lf_res);
        ref_order_hint(ref_order_hint);
        ref_frame_idx(ref_frame_idx);
        delta_frame_id_minus_1(delta_frame_id_minus_1);
        pTileInfo(pTileInfo);
        pQuantization(pQuantization);
        pSegmentation(pSegmentation);
        pLoopFilter(pLoopFilter);
        pCDEF(pCDEF);
        pLoopRestoration(pLoopRestoration);
        pGlobalMotion(pGlobalMotion);
        pExtensionHeader(pExtensionHeader);
        pBufferRemovalTimes(pBufferRemovalTimes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoEncodeAV1PictureInfo set(StdVideoEncodeAV1PictureInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoEncodeAV1PictureInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeAV1PictureInfo malloc() {
        return new StdVideoEncodeAV1PictureInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeAV1PictureInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoEncodeAV1PictureInfo calloc() {
        return new StdVideoEncodeAV1PictureInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoEncodeAV1PictureInfo} instance allocated with {@link BufferUtils}. */
    public static StdVideoEncodeAV1PictureInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeAV1PictureInfo(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoEncodeAV1PictureInfo} instance for the specified memory address. */
    public static StdVideoEncodeAV1PictureInfo create(long address) {
        return new StdVideoEncodeAV1PictureInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable StdVideoEncodeAV1PictureInfo createSafe(long address) {
        return address == NULL ? null : new StdVideoEncodeAV1PictureInfo(address, null);
    }

    /**
     * Returns a new {@link StdVideoEncodeAV1PictureInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeAV1PictureInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeAV1PictureInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeAV1PictureInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeAV1PictureInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeAV1PictureInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoEncodeAV1PictureInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeAV1PictureInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static StdVideoEncodeAV1PictureInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoEncodeAV1PictureInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeAV1PictureInfo malloc(MemoryStack stack) {
        return new StdVideoEncodeAV1PictureInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoEncodeAV1PictureInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoEncodeAV1PictureInfo calloc(MemoryStack stack) {
        return new StdVideoEncodeAV1PictureInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoEncodeAV1PictureInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeAV1PictureInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoEncodeAV1PictureInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoEncodeAV1PictureInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static StdVideoEncodeAV1PictureInfoFlags nflags(long struct) { return StdVideoEncodeAV1PictureInfoFlags.create(struct + StdVideoEncodeAV1PictureInfo.FLAGS); }
    /** Unsafe version of {@link #frame_type}. */
    public static int nframe_type(long struct) { return memGetInt(struct + StdVideoEncodeAV1PictureInfo.FRAME_TYPE); }
    /** Unsafe version of {@link #frame_presentation_time}. */
    public static int nframe_presentation_time(long struct) { return memGetInt(struct + StdVideoEncodeAV1PictureInfo.FRAME_PRESENTATION_TIME); }
    /** Unsafe version of {@link #current_frame_id}. */
    public static int ncurrent_frame_id(long struct) { return memGetInt(struct + StdVideoEncodeAV1PictureInfo.CURRENT_FRAME_ID); }
    /** Unsafe version of {@link #order_hint}. */
    public static byte norder_hint(long struct) { return memGetByte(struct + StdVideoEncodeAV1PictureInfo.ORDER_HINT); }
    /** Unsafe version of {@link #primary_ref_frame}. */
    public static byte nprimary_ref_frame(long struct) { return memGetByte(struct + StdVideoEncodeAV1PictureInfo.PRIMARY_REF_FRAME); }
    /** Unsafe version of {@link #refresh_frame_flags}. */
    public static byte nrefresh_frame_flags(long struct) { return memGetByte(struct + StdVideoEncodeAV1PictureInfo.REFRESH_FRAME_FLAGS); }
    /** Unsafe version of {@link #coded_denom}. */
    public static byte ncoded_denom(long struct) { return memGetByte(struct + StdVideoEncodeAV1PictureInfo.CODED_DENOM); }
    /** Unsafe version of {@link #render_width_minus_1}. */
    public static short nrender_width_minus_1(long struct) { return memGetShort(struct + StdVideoEncodeAV1PictureInfo.RENDER_WIDTH_MINUS_1); }
    /** Unsafe version of {@link #render_height_minus_1}. */
    public static short nrender_height_minus_1(long struct) { return memGetShort(struct + StdVideoEncodeAV1PictureInfo.RENDER_HEIGHT_MINUS_1); }
    /** Unsafe version of {@link #interpolation_filter}. */
    public static int ninterpolation_filter(long struct) { return memGetInt(struct + StdVideoEncodeAV1PictureInfo.INTERPOLATION_FILTER); }
    /** Unsafe version of {@link #TxMode}. */
    public static int nTxMode(long struct) { return memGetInt(struct + StdVideoEncodeAV1PictureInfo.TXMODE); }
    /** Unsafe version of {@link #delta_q_res}. */
    public static byte ndelta_q_res(long struct) { return memGetByte(struct + StdVideoEncodeAV1PictureInfo.DELTA_Q_RES); }
    /** Unsafe version of {@link #delta_lf_res}. */
    public static byte ndelta_lf_res(long struct) { return memGetByte(struct + StdVideoEncodeAV1PictureInfo.DELTA_LF_RES); }
    /** Unsafe version of {@link #ref_order_hint}. */
    public static ByteBuffer nref_order_hint(long struct) { return memByteBuffer(struct + StdVideoEncodeAV1PictureInfo.REF_ORDER_HINT, STD_VIDEO_AV1_NUM_REF_FRAMES); }
    /** Unsafe version of {@link #ref_order_hint(int) ref_order_hint}. */
    public static byte nref_order_hint(long struct, int index) {
        return memGetByte(struct + StdVideoEncodeAV1PictureInfo.REF_ORDER_HINT + check(index, STD_VIDEO_AV1_NUM_REF_FRAMES) * 1);
    }
    /** Unsafe version of {@link #ref_frame_idx}. */
    public static ByteBuffer nref_frame_idx(long struct) { return memByteBuffer(struct + StdVideoEncodeAV1PictureInfo.REF_FRAME_IDX, STD_VIDEO_AV1_REFS_PER_FRAME); }
    /** Unsafe version of {@link #ref_frame_idx(int) ref_frame_idx}. */
    public static byte nref_frame_idx(long struct, int index) {
        return memGetByte(struct + StdVideoEncodeAV1PictureInfo.REF_FRAME_IDX + check(index, STD_VIDEO_AV1_REFS_PER_FRAME) * 1);
    }
    public static ByteBuffer nreserved1(long struct) { return memByteBuffer(struct + StdVideoEncodeAV1PictureInfo.RESERVED1, 3); }
    public static byte nreserved1(long struct, int index) {
        return memGetByte(struct + StdVideoEncodeAV1PictureInfo.RESERVED1 + check(index, 3) * 1);
    }
    /** Unsafe version of {@link #delta_frame_id_minus_1}. */
    public static IntBuffer ndelta_frame_id_minus_1(long struct) { return memIntBuffer(struct + StdVideoEncodeAV1PictureInfo.DELTA_FRAME_ID_MINUS_1, STD_VIDEO_AV1_REFS_PER_FRAME); }
    /** Unsafe version of {@link #delta_frame_id_minus_1(int) delta_frame_id_minus_1}. */
    public static int ndelta_frame_id_minus_1(long struct, int index) {
        return memGetInt(struct + StdVideoEncodeAV1PictureInfo.DELTA_FRAME_ID_MINUS_1 + check(index, STD_VIDEO_AV1_REFS_PER_FRAME) * 4);
    }
    /** Unsafe version of {@link #pTileInfo}. */
    public static StdVideoAV1TileInfo npTileInfo(long struct) { return StdVideoAV1TileInfo.create(memGetAddress(struct + StdVideoEncodeAV1PictureInfo.PTILEINFO)); }
    /** Unsafe version of {@link #pQuantization}. */
    public static StdVideoAV1Quantization npQuantization(long struct) { return StdVideoAV1Quantization.create(memGetAddress(struct + StdVideoEncodeAV1PictureInfo.PQUANTIZATION)); }
    /** Unsafe version of {@link #pSegmentation}. */
    public static StdVideoAV1Segmentation npSegmentation(long struct) { return StdVideoAV1Segmentation.create(memGetAddress(struct + StdVideoEncodeAV1PictureInfo.PSEGMENTATION)); }
    /** Unsafe version of {@link #pLoopFilter}. */
    public static StdVideoAV1LoopFilter npLoopFilter(long struct) { return StdVideoAV1LoopFilter.create(memGetAddress(struct + StdVideoEncodeAV1PictureInfo.PLOOPFILTER)); }
    /** Unsafe version of {@link #pCDEF}. */
    public static StdVideoAV1CDEF npCDEF(long struct) { return StdVideoAV1CDEF.create(memGetAddress(struct + StdVideoEncodeAV1PictureInfo.PCDEF)); }
    /** Unsafe version of {@link #pLoopRestoration}. */
    public static StdVideoAV1LoopRestoration npLoopRestoration(long struct) { return StdVideoAV1LoopRestoration.create(memGetAddress(struct + StdVideoEncodeAV1PictureInfo.PLOOPRESTORATION)); }
    /** Unsafe version of {@link #pGlobalMotion}. */
    public static StdVideoAV1GlobalMotion npGlobalMotion(long struct) { return StdVideoAV1GlobalMotion.create(memGetAddress(struct + StdVideoEncodeAV1PictureInfo.PGLOBALMOTION)); }
    /** Unsafe version of {@link #pExtensionHeader}. */
    public static StdVideoEncodeAV1ExtensionHeader npExtensionHeader(long struct) { return StdVideoEncodeAV1ExtensionHeader.create(memGetAddress(struct + StdVideoEncodeAV1PictureInfo.PEXTENSIONHEADER)); }
    /** Unsafe version of {@link #pBufferRemovalTimes(int) pBufferRemovalTimes}. */
    public static IntBuffer npBufferRemovalTimes(long struct, int capacity) { return memIntBuffer(memGetAddress(struct + StdVideoEncodeAV1PictureInfo.PBUFFERREMOVALTIMES), capacity); }

    /** Unsafe version of {@link #flags(StdVideoEncodeAV1PictureInfoFlags) flags}. */
    public static void nflags(long struct, StdVideoEncodeAV1PictureInfoFlags value) { memCopy(value.address(), struct + StdVideoEncodeAV1PictureInfo.FLAGS, StdVideoEncodeAV1PictureInfoFlags.SIZEOF); }
    /** Unsafe version of {@link #frame_type(int) frame_type}. */
    public static void nframe_type(long struct, int value) { memPutInt(struct + StdVideoEncodeAV1PictureInfo.FRAME_TYPE, value); }
    /** Unsafe version of {@link #frame_presentation_time(int) frame_presentation_time}. */
    public static void nframe_presentation_time(long struct, int value) { memPutInt(struct + StdVideoEncodeAV1PictureInfo.FRAME_PRESENTATION_TIME, value); }
    /** Unsafe version of {@link #current_frame_id(int) current_frame_id}. */
    public static void ncurrent_frame_id(long struct, int value) { memPutInt(struct + StdVideoEncodeAV1PictureInfo.CURRENT_FRAME_ID, value); }
    /** Unsafe version of {@link #order_hint(byte) order_hint}. */
    public static void norder_hint(long struct, byte value) { memPutByte(struct + StdVideoEncodeAV1PictureInfo.ORDER_HINT, value); }
    /** Unsafe version of {@link #primary_ref_frame(byte) primary_ref_frame}. */
    public static void nprimary_ref_frame(long struct, byte value) { memPutByte(struct + StdVideoEncodeAV1PictureInfo.PRIMARY_REF_FRAME, value); }
    /** Unsafe version of {@link #refresh_frame_flags(byte) refresh_frame_flags}. */
    public static void nrefresh_frame_flags(long struct, byte value) { memPutByte(struct + StdVideoEncodeAV1PictureInfo.REFRESH_FRAME_FLAGS, value); }
    /** Unsafe version of {@link #coded_denom(byte) coded_denom}. */
    public static void ncoded_denom(long struct, byte value) { memPutByte(struct + StdVideoEncodeAV1PictureInfo.CODED_DENOM, value); }
    /** Unsafe version of {@link #render_width_minus_1(short) render_width_minus_1}. */
    public static void nrender_width_minus_1(long struct, short value) { memPutShort(struct + StdVideoEncodeAV1PictureInfo.RENDER_WIDTH_MINUS_1, value); }
    /** Unsafe version of {@link #render_height_minus_1(short) render_height_minus_1}. */
    public static void nrender_height_minus_1(long struct, short value) { memPutShort(struct + StdVideoEncodeAV1PictureInfo.RENDER_HEIGHT_MINUS_1, value); }
    /** Unsafe version of {@link #interpolation_filter(int) interpolation_filter}. */
    public static void ninterpolation_filter(long struct, int value) { memPutInt(struct + StdVideoEncodeAV1PictureInfo.INTERPOLATION_FILTER, value); }
    /** Unsafe version of {@link #TxMode(int) TxMode}. */
    public static void nTxMode(long struct, int value) { memPutInt(struct + StdVideoEncodeAV1PictureInfo.TXMODE, value); }
    /** Unsafe version of {@link #delta_q_res(byte) delta_q_res}. */
    public static void ndelta_q_res(long struct, byte value) { memPutByte(struct + StdVideoEncodeAV1PictureInfo.DELTA_Q_RES, value); }
    /** Unsafe version of {@link #delta_lf_res(byte) delta_lf_res}. */
    public static void ndelta_lf_res(long struct, byte value) { memPutByte(struct + StdVideoEncodeAV1PictureInfo.DELTA_LF_RES, value); }
    /** Unsafe version of {@link #ref_order_hint(ByteBuffer) ref_order_hint}. */
    public static void nref_order_hint(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_AV1_NUM_REF_FRAMES); }
        memCopy(memAddress(value), struct + StdVideoEncodeAV1PictureInfo.REF_ORDER_HINT, value.remaining() * 1);
    }
    /** Unsafe version of {@link #ref_order_hint(int, byte) ref_order_hint}. */
    public static void nref_order_hint(long struct, int index, byte value) {
        memPutByte(struct + StdVideoEncodeAV1PictureInfo.REF_ORDER_HINT + check(index, STD_VIDEO_AV1_NUM_REF_FRAMES) * 1, value);
    }
    /** Unsafe version of {@link #ref_frame_idx(ByteBuffer) ref_frame_idx}. */
    public static void nref_frame_idx(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_AV1_REFS_PER_FRAME); }
        memCopy(memAddress(value), struct + StdVideoEncodeAV1PictureInfo.REF_FRAME_IDX, value.remaining() * 1);
    }
    /** Unsafe version of {@link #ref_frame_idx(int, byte) ref_frame_idx}. */
    public static void nref_frame_idx(long struct, int index, byte value) {
        memPutByte(struct + StdVideoEncodeAV1PictureInfo.REF_FRAME_IDX + check(index, STD_VIDEO_AV1_REFS_PER_FRAME) * 1, value);
    }
    public static void nreserved1(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + StdVideoEncodeAV1PictureInfo.RESERVED1, value.remaining() * 1);
    }
    public static void nreserved1(long struct, int index, byte value) {
        memPutByte(struct + StdVideoEncodeAV1PictureInfo.RESERVED1 + check(index, 3) * 1, value);
    }
    /** Unsafe version of {@link #delta_frame_id_minus_1(IntBuffer) delta_frame_id_minus_1}. */
    public static void ndelta_frame_id_minus_1(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_AV1_REFS_PER_FRAME); }
        memCopy(memAddress(value), struct + StdVideoEncodeAV1PictureInfo.DELTA_FRAME_ID_MINUS_1, value.remaining() * 4);
    }
    /** Unsafe version of {@link #delta_frame_id_minus_1(int, int) delta_frame_id_minus_1}. */
    public static void ndelta_frame_id_minus_1(long struct, int index, int value) {
        memPutInt(struct + StdVideoEncodeAV1PictureInfo.DELTA_FRAME_ID_MINUS_1 + check(index, STD_VIDEO_AV1_REFS_PER_FRAME) * 4, value);
    }
    /** Unsafe version of {@link #pTileInfo(StdVideoAV1TileInfo) pTileInfo}. */
    public static void npTileInfo(long struct, StdVideoAV1TileInfo value) { memPutAddress(struct + StdVideoEncodeAV1PictureInfo.PTILEINFO, value.address()); }
    /** Unsafe version of {@link #pQuantization(StdVideoAV1Quantization) pQuantization}. */
    public static void npQuantization(long struct, StdVideoAV1Quantization value) { memPutAddress(struct + StdVideoEncodeAV1PictureInfo.PQUANTIZATION, value.address()); }
    /** Unsafe version of {@link #pSegmentation(StdVideoAV1Segmentation) pSegmentation}. */
    public static void npSegmentation(long struct, StdVideoAV1Segmentation value) { memPutAddress(struct + StdVideoEncodeAV1PictureInfo.PSEGMENTATION, value.address()); }
    /** Unsafe version of {@link #pLoopFilter(StdVideoAV1LoopFilter) pLoopFilter}. */
    public static void npLoopFilter(long struct, StdVideoAV1LoopFilter value) { memPutAddress(struct + StdVideoEncodeAV1PictureInfo.PLOOPFILTER, value.address()); }
    /** Unsafe version of {@link #pCDEF(StdVideoAV1CDEF) pCDEF}. */
    public static void npCDEF(long struct, StdVideoAV1CDEF value) { memPutAddress(struct + StdVideoEncodeAV1PictureInfo.PCDEF, value.address()); }
    /** Unsafe version of {@link #pLoopRestoration(StdVideoAV1LoopRestoration) pLoopRestoration}. */
    public static void npLoopRestoration(long struct, StdVideoAV1LoopRestoration value) { memPutAddress(struct + StdVideoEncodeAV1PictureInfo.PLOOPRESTORATION, value.address()); }
    /** Unsafe version of {@link #pGlobalMotion(StdVideoAV1GlobalMotion) pGlobalMotion}. */
    public static void npGlobalMotion(long struct, StdVideoAV1GlobalMotion value) { memPutAddress(struct + StdVideoEncodeAV1PictureInfo.PGLOBALMOTION, value.address()); }
    /** Unsafe version of {@link #pExtensionHeader(StdVideoEncodeAV1ExtensionHeader) pExtensionHeader}. */
    public static void npExtensionHeader(long struct, StdVideoEncodeAV1ExtensionHeader value) { memPutAddress(struct + StdVideoEncodeAV1PictureInfo.PEXTENSIONHEADER, value.address()); }
    /** Unsafe version of {@link #pBufferRemovalTimes(IntBuffer) pBufferRemovalTimes}. */
    public static void npBufferRemovalTimes(long struct, IntBuffer value) { memPutAddress(struct + StdVideoEncodeAV1PictureInfo.PBUFFERREMOVALTIMES, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long pTileInfo = memGetAddress(struct + StdVideoEncodeAV1PictureInfo.PTILEINFO);
        check(pTileInfo);
        StdVideoAV1TileInfo.validate(pTileInfo);
        check(memGetAddress(struct + StdVideoEncodeAV1PictureInfo.PQUANTIZATION));
        check(memGetAddress(struct + StdVideoEncodeAV1PictureInfo.PSEGMENTATION));
        check(memGetAddress(struct + StdVideoEncodeAV1PictureInfo.PLOOPFILTER));
        check(memGetAddress(struct + StdVideoEncodeAV1PictureInfo.PCDEF));
        check(memGetAddress(struct + StdVideoEncodeAV1PictureInfo.PLOOPRESTORATION));
        check(memGetAddress(struct + StdVideoEncodeAV1PictureInfo.PGLOBALMOTION));
        check(memGetAddress(struct + StdVideoEncodeAV1PictureInfo.PEXTENSIONHEADER));
        check(memGetAddress(struct + StdVideoEncodeAV1PictureInfo.PBUFFERREMOVALTIMES));
    }

    // -----------------------------------

    /** An array of {@link StdVideoEncodeAV1PictureInfo} structs. */
    public static class Buffer extends StructBuffer<StdVideoEncodeAV1PictureInfo, Buffer> implements NativeResource {

        private static final StdVideoEncodeAV1PictureInfo ELEMENT_FACTORY = StdVideoEncodeAV1PictureInfo.create(-1L);

        /**
         * Creates a new {@code StdVideoEncodeAV1PictureInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoEncodeAV1PictureInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoEncodeAV1PictureInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link StdVideoEncodeAV1PictureInfoFlags} view of the {@code flags} field. */
        public StdVideoEncodeAV1PictureInfoFlags flags() { return StdVideoEncodeAV1PictureInfo.nflags(address()); }
        /** @return the value of the {@code frame_type} field. */
        @NativeType("StdVideoAV1FrameType")
        public int frame_type() { return StdVideoEncodeAV1PictureInfo.nframe_type(address()); }
        /** @return the value of the {@code frame_presentation_time} field. */
        @NativeType("uint32_t")
        public int frame_presentation_time() { return StdVideoEncodeAV1PictureInfo.nframe_presentation_time(address()); }
        /** @return the value of the {@code current_frame_id} field. */
        @NativeType("uint32_t")
        public int current_frame_id() { return StdVideoEncodeAV1PictureInfo.ncurrent_frame_id(address()); }
        /** @return the value of the {@code order_hint} field. */
        @NativeType("uint8_t")
        public byte order_hint() { return StdVideoEncodeAV1PictureInfo.norder_hint(address()); }
        /** @return the value of the {@code primary_ref_frame} field. */
        @NativeType("uint8_t")
        public byte primary_ref_frame() { return StdVideoEncodeAV1PictureInfo.nprimary_ref_frame(address()); }
        /** @return the value of the {@code refresh_frame_flags} field. */
        @NativeType("uint8_t")
        public byte refresh_frame_flags() { return StdVideoEncodeAV1PictureInfo.nrefresh_frame_flags(address()); }
        /** @return the value of the {@code coded_denom} field. */
        @NativeType("uint8_t")
        public byte coded_denom() { return StdVideoEncodeAV1PictureInfo.ncoded_denom(address()); }
        /** @return the value of the {@code render_width_minus_1} field. */
        @NativeType("uint16_t")
        public short render_width_minus_1() { return StdVideoEncodeAV1PictureInfo.nrender_width_minus_1(address()); }
        /** @return the value of the {@code render_height_minus_1} field. */
        @NativeType("uint16_t")
        public short render_height_minus_1() { return StdVideoEncodeAV1PictureInfo.nrender_height_minus_1(address()); }
        /** @return the value of the {@code interpolation_filter} field. */
        @NativeType("StdVideoAV1InterpolationFilter")
        public int interpolation_filter() { return StdVideoEncodeAV1PictureInfo.ninterpolation_filter(address()); }
        /** @return the value of the {@code TxMode} field. */
        @NativeType("StdVideoAV1TxMode")
        public int TxMode() { return StdVideoEncodeAV1PictureInfo.nTxMode(address()); }
        /** @return the value of the {@code delta_q_res} field. */
        @NativeType("uint8_t")
        public byte delta_q_res() { return StdVideoEncodeAV1PictureInfo.ndelta_q_res(address()); }
        /** @return the value of the {@code delta_lf_res} field. */
        @NativeType("uint8_t")
        public byte delta_lf_res() { return StdVideoEncodeAV1PictureInfo.ndelta_lf_res(address()); }
        /** @return a {@link ByteBuffer} view of the {@code ref_order_hint} field. */
        @NativeType("uint8_t[STD_VIDEO_AV1_NUM_REF_FRAMES]")
        public ByteBuffer ref_order_hint() { return StdVideoEncodeAV1PictureInfo.nref_order_hint(address()); }
        /** @return the value at the specified index of the {@code ref_order_hint} field. */
        @NativeType("uint8_t")
        public byte ref_order_hint(int index) { return StdVideoEncodeAV1PictureInfo.nref_order_hint(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code ref_frame_idx} field. */
        @NativeType("int8_t[STD_VIDEO_AV1_REFS_PER_FRAME]")
        public ByteBuffer ref_frame_idx() { return StdVideoEncodeAV1PictureInfo.nref_frame_idx(address()); }
        /** @return the value at the specified index of the {@code ref_frame_idx} field. */
        @NativeType("int8_t")
        public byte ref_frame_idx(int index) { return StdVideoEncodeAV1PictureInfo.nref_frame_idx(address(), index); }
        /** @return a {@link IntBuffer} view of the {@code delta_frame_id_minus_1} field. */
        @NativeType("uint32_t[STD_VIDEO_AV1_REFS_PER_FRAME]")
        public IntBuffer delta_frame_id_minus_1() { return StdVideoEncodeAV1PictureInfo.ndelta_frame_id_minus_1(address()); }
        /** @return the value at the specified index of the {@code delta_frame_id_minus_1} field. */
        @NativeType("uint32_t")
        public int delta_frame_id_minus_1(int index) { return StdVideoEncodeAV1PictureInfo.ndelta_frame_id_minus_1(address(), index); }
        /** @return a {@link StdVideoAV1TileInfo} view of the struct pointed to by the {@code pTileInfo} field. */
        @NativeType("StdVideoAV1TileInfo const *")
        public StdVideoAV1TileInfo pTileInfo() { return StdVideoEncodeAV1PictureInfo.npTileInfo(address()); }
        /** @return a {@link StdVideoAV1Quantization} view of the struct pointed to by the {@code pQuantization} field. */
        @NativeType("StdVideoAV1Quantization const *")
        public StdVideoAV1Quantization pQuantization() { return StdVideoEncodeAV1PictureInfo.npQuantization(address()); }
        /** @return a {@link StdVideoAV1Segmentation} view of the struct pointed to by the {@code pSegmentation} field. */
        @NativeType("StdVideoAV1Segmentation const *")
        public StdVideoAV1Segmentation pSegmentation() { return StdVideoEncodeAV1PictureInfo.npSegmentation(address()); }
        /** @return a {@link StdVideoAV1LoopFilter} view of the struct pointed to by the {@code pLoopFilter} field. */
        @NativeType("StdVideoAV1LoopFilter const *")
        public StdVideoAV1LoopFilter pLoopFilter() { return StdVideoEncodeAV1PictureInfo.npLoopFilter(address()); }
        /** @return a {@link StdVideoAV1CDEF} view of the struct pointed to by the {@code pCDEF} field. */
        @NativeType("StdVideoAV1CDEF const *")
        public StdVideoAV1CDEF pCDEF() { return StdVideoEncodeAV1PictureInfo.npCDEF(address()); }
        /** @return a {@link StdVideoAV1LoopRestoration} view of the struct pointed to by the {@code pLoopRestoration} field. */
        @NativeType("StdVideoAV1LoopRestoration const *")
        public StdVideoAV1LoopRestoration pLoopRestoration() { return StdVideoEncodeAV1PictureInfo.npLoopRestoration(address()); }
        /** @return a {@link StdVideoAV1GlobalMotion} view of the struct pointed to by the {@code pGlobalMotion} field. */
        @NativeType("StdVideoAV1GlobalMotion const *")
        public StdVideoAV1GlobalMotion pGlobalMotion() { return StdVideoEncodeAV1PictureInfo.npGlobalMotion(address()); }
        /** @return a {@link StdVideoEncodeAV1ExtensionHeader} view of the struct pointed to by the {@code pExtensionHeader} field. */
        @NativeType("StdVideoEncodeAV1ExtensionHeader const *")
        public StdVideoEncodeAV1ExtensionHeader pExtensionHeader() { return StdVideoEncodeAV1PictureInfo.npExtensionHeader(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pBufferRemovalTimes} field. */
        @NativeType("uint32_t const *")
        public IntBuffer pBufferRemovalTimes(int capacity) { return StdVideoEncodeAV1PictureInfo.npBufferRemovalTimes(address(), capacity); }

        /** Copies the specified {@link StdVideoEncodeAV1PictureInfoFlags} to the {@code flags} field. */
        public StdVideoEncodeAV1PictureInfo.Buffer flags(StdVideoEncodeAV1PictureInfoFlags value) { StdVideoEncodeAV1PictureInfo.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoEncodeAV1PictureInfo.Buffer flags(java.util.function.Consumer<StdVideoEncodeAV1PictureInfoFlags> consumer) { consumer.accept(flags()); return this; }
        /** Sets the specified value to the {@code frame_type} field. */
        public StdVideoEncodeAV1PictureInfo.Buffer frame_type(@NativeType("StdVideoAV1FrameType") int value) { StdVideoEncodeAV1PictureInfo.nframe_type(address(), value); return this; }
        /** Sets the specified value to the {@code frame_presentation_time} field. */
        public StdVideoEncodeAV1PictureInfo.Buffer frame_presentation_time(@NativeType("uint32_t") int value) { StdVideoEncodeAV1PictureInfo.nframe_presentation_time(address(), value); return this; }
        /** Sets the specified value to the {@code current_frame_id} field. */
        public StdVideoEncodeAV1PictureInfo.Buffer current_frame_id(@NativeType("uint32_t") int value) { StdVideoEncodeAV1PictureInfo.ncurrent_frame_id(address(), value); return this; }
        /** Sets the specified value to the {@code order_hint} field. */
        public StdVideoEncodeAV1PictureInfo.Buffer order_hint(@NativeType("uint8_t") byte value) { StdVideoEncodeAV1PictureInfo.norder_hint(address(), value); return this; }
        /** Sets the specified value to the {@code primary_ref_frame} field. */
        public StdVideoEncodeAV1PictureInfo.Buffer primary_ref_frame(@NativeType("uint8_t") byte value) { StdVideoEncodeAV1PictureInfo.nprimary_ref_frame(address(), value); return this; }
        /** Sets the specified value to the {@code refresh_frame_flags} field. */
        public StdVideoEncodeAV1PictureInfo.Buffer refresh_frame_flags(@NativeType("uint8_t") byte value) { StdVideoEncodeAV1PictureInfo.nrefresh_frame_flags(address(), value); return this; }
        /** Sets the specified value to the {@code coded_denom} field. */
        public StdVideoEncodeAV1PictureInfo.Buffer coded_denom(@NativeType("uint8_t") byte value) { StdVideoEncodeAV1PictureInfo.ncoded_denom(address(), value); return this; }
        /** Sets the specified value to the {@code render_width_minus_1} field. */
        public StdVideoEncodeAV1PictureInfo.Buffer render_width_minus_1(@NativeType("uint16_t") short value) { StdVideoEncodeAV1PictureInfo.nrender_width_minus_1(address(), value); return this; }
        /** Sets the specified value to the {@code render_height_minus_1} field. */
        public StdVideoEncodeAV1PictureInfo.Buffer render_height_minus_1(@NativeType("uint16_t") short value) { StdVideoEncodeAV1PictureInfo.nrender_height_minus_1(address(), value); return this; }
        /** Sets the specified value to the {@code interpolation_filter} field. */
        public StdVideoEncodeAV1PictureInfo.Buffer interpolation_filter(@NativeType("StdVideoAV1InterpolationFilter") int value) { StdVideoEncodeAV1PictureInfo.ninterpolation_filter(address(), value); return this; }
        /** Sets the specified value to the {@code TxMode} field. */
        public StdVideoEncodeAV1PictureInfo.Buffer TxMode(@NativeType("StdVideoAV1TxMode") int value) { StdVideoEncodeAV1PictureInfo.nTxMode(address(), value); return this; }
        /** Sets the specified value to the {@code delta_q_res} field. */
        public StdVideoEncodeAV1PictureInfo.Buffer delta_q_res(@NativeType("uint8_t") byte value) { StdVideoEncodeAV1PictureInfo.ndelta_q_res(address(), value); return this; }
        /** Sets the specified value to the {@code delta_lf_res} field. */
        public StdVideoEncodeAV1PictureInfo.Buffer delta_lf_res(@NativeType("uint8_t") byte value) { StdVideoEncodeAV1PictureInfo.ndelta_lf_res(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code ref_order_hint} field. */
        public StdVideoEncodeAV1PictureInfo.Buffer ref_order_hint(@NativeType("uint8_t[STD_VIDEO_AV1_NUM_REF_FRAMES]") ByteBuffer value) { StdVideoEncodeAV1PictureInfo.nref_order_hint(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code ref_order_hint} field. */
        public StdVideoEncodeAV1PictureInfo.Buffer ref_order_hint(int index, @NativeType("uint8_t") byte value) { StdVideoEncodeAV1PictureInfo.nref_order_hint(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code ref_frame_idx} field. */
        public StdVideoEncodeAV1PictureInfo.Buffer ref_frame_idx(@NativeType("int8_t[STD_VIDEO_AV1_REFS_PER_FRAME]") ByteBuffer value) { StdVideoEncodeAV1PictureInfo.nref_frame_idx(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code ref_frame_idx} field. */
        public StdVideoEncodeAV1PictureInfo.Buffer ref_frame_idx(int index, @NativeType("int8_t") byte value) { StdVideoEncodeAV1PictureInfo.nref_frame_idx(address(), index, value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code delta_frame_id_minus_1} field. */
        public StdVideoEncodeAV1PictureInfo.Buffer delta_frame_id_minus_1(@NativeType("uint32_t[STD_VIDEO_AV1_REFS_PER_FRAME]") IntBuffer value) { StdVideoEncodeAV1PictureInfo.ndelta_frame_id_minus_1(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code delta_frame_id_minus_1} field. */
        public StdVideoEncodeAV1PictureInfo.Buffer delta_frame_id_minus_1(int index, @NativeType("uint32_t") int value) { StdVideoEncodeAV1PictureInfo.ndelta_frame_id_minus_1(address(), index, value); return this; }
        /** Sets the address of the specified {@link StdVideoAV1TileInfo} to the {@code pTileInfo} field. */
        public StdVideoEncodeAV1PictureInfo.Buffer pTileInfo(@NativeType("StdVideoAV1TileInfo const *") StdVideoAV1TileInfo value) { StdVideoEncodeAV1PictureInfo.npTileInfo(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoAV1Quantization} to the {@code pQuantization} field. */
        public StdVideoEncodeAV1PictureInfo.Buffer pQuantization(@NativeType("StdVideoAV1Quantization const *") StdVideoAV1Quantization value) { StdVideoEncodeAV1PictureInfo.npQuantization(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoAV1Segmentation} to the {@code pSegmentation} field. */
        public StdVideoEncodeAV1PictureInfo.Buffer pSegmentation(@NativeType("StdVideoAV1Segmentation const *") StdVideoAV1Segmentation value) { StdVideoEncodeAV1PictureInfo.npSegmentation(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoAV1LoopFilter} to the {@code pLoopFilter} field. */
        public StdVideoEncodeAV1PictureInfo.Buffer pLoopFilter(@NativeType("StdVideoAV1LoopFilter const *") StdVideoAV1LoopFilter value) { StdVideoEncodeAV1PictureInfo.npLoopFilter(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoAV1CDEF} to the {@code pCDEF} field. */
        public StdVideoEncodeAV1PictureInfo.Buffer pCDEF(@NativeType("StdVideoAV1CDEF const *") StdVideoAV1CDEF value) { StdVideoEncodeAV1PictureInfo.npCDEF(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoAV1LoopRestoration} to the {@code pLoopRestoration} field. */
        public StdVideoEncodeAV1PictureInfo.Buffer pLoopRestoration(@NativeType("StdVideoAV1LoopRestoration const *") StdVideoAV1LoopRestoration value) { StdVideoEncodeAV1PictureInfo.npLoopRestoration(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoAV1GlobalMotion} to the {@code pGlobalMotion} field. */
        public StdVideoEncodeAV1PictureInfo.Buffer pGlobalMotion(@NativeType("StdVideoAV1GlobalMotion const *") StdVideoAV1GlobalMotion value) { StdVideoEncodeAV1PictureInfo.npGlobalMotion(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoEncodeAV1ExtensionHeader} to the {@code pExtensionHeader} field. */
        public StdVideoEncodeAV1PictureInfo.Buffer pExtensionHeader(@NativeType("StdVideoEncodeAV1ExtensionHeader const *") StdVideoEncodeAV1ExtensionHeader value) { StdVideoEncodeAV1PictureInfo.npExtensionHeader(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pBufferRemovalTimes} field. */
        public StdVideoEncodeAV1PictureInfo.Buffer pBufferRemovalTimes(@NativeType("uint32_t const *") IntBuffer value) { StdVideoEncodeAV1PictureInfo.npBufferRemovalTimes(address(), value); return this; }

    }

}