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
 * struct StdVideoDecodeAV1PictureInfo {
 *     {@link StdVideoDecodeAV1PictureInfoFlags StdVideoDecodeAV1PictureInfoFlags} flags;
 *     StdVideoAV1FrameType frame_type;
 *     uint32_t current_frame_id;
 *     uint8_t OrderHint;
 *     uint8_t primary_ref_frame;
 *     uint8_t refresh_frame_flags;
 *     uint8_t reserved1;
 *     StdVideoAV1InterpolationFilter interpolation_filter;
 *     StdVideoAV1TxMode TxMode;
 *     uint8_t delta_q_res;
 *     uint8_t delta_lf_res;
 *     uint8_t SkipModeFrame[STD_VIDEO_AV1_SKIP_MODE_FRAMES];
 *     uint8_t coded_denom;
 *     uint8_t reserved2[3];
 *     uint8_t OrderHints[STD_VIDEO_AV1_NUM_REF_FRAMES];
 *     uint32_t expectedFrameId[STD_VIDEO_AV1_NUM_REF_FRAMES];
 *     {@link StdVideoAV1TileInfo StdVideoAV1TileInfo} const * pTileInfo;
 *     {@link StdVideoAV1Quantization StdVideoAV1Quantization} const * pQuantization;
 *     {@link StdVideoAV1Segmentation StdVideoAV1Segmentation} const * pSegmentation;
 *     {@link StdVideoAV1LoopFilter StdVideoAV1LoopFilter} const * pLoopFilter;
 *     {@link StdVideoAV1CDEF StdVideoAV1CDEF} const * pCDEF;
 *     {@link StdVideoAV1LoopRestoration StdVideoAV1LoopRestoration} const * pLoopRestoration;
 *     {@link StdVideoAV1GlobalMotion StdVideoAV1GlobalMotion} const * pGlobalMotion;
 *     {@link StdVideoAV1FilmGrain StdVideoAV1FilmGrain} const * pFilmGrain;
 * }}</pre>
 */
public class StdVideoDecodeAV1PictureInfo extends Struct<StdVideoDecodeAV1PictureInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        FRAME_TYPE,
        CURRENT_FRAME_ID,
        ORDERHINT,
        PRIMARY_REF_FRAME,
        REFRESH_FRAME_FLAGS,
        RESERVED1,
        INTERPOLATION_FILTER,
        TXMODE,
        DELTA_Q_RES,
        DELTA_LF_RES,
        SKIPMODEFRAME,
        CODED_DENOM,
        RESERVED2,
        ORDERHINTS,
        EXPECTEDFRAMEID,
        PTILEINFO,
        PQUANTIZATION,
        PSEGMENTATION,
        PLOOPFILTER,
        PCDEF,
        PLOOPRESTORATION,
        PGLOBALMOTION,
        PFILMGRAIN;

    static {
        Layout layout = __struct(
            __member(StdVideoDecodeAV1PictureInfoFlags.SIZEOF, StdVideoDecodeAV1PictureInfoFlags.ALIGNOF),
            __member(4),
            __member(4),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(4),
            __member(4),
            __member(1),
            __member(1),
            __array(1, STD_VIDEO_AV1_SKIP_MODE_FRAMES),
            __member(1),
            __array(1, 3),
            __array(1, STD_VIDEO_AV1_NUM_REF_FRAMES),
            __array(4, STD_VIDEO_AV1_NUM_REF_FRAMES),
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
        CURRENT_FRAME_ID = layout.offsetof(2);
        ORDERHINT = layout.offsetof(3);
        PRIMARY_REF_FRAME = layout.offsetof(4);
        REFRESH_FRAME_FLAGS = layout.offsetof(5);
        RESERVED1 = layout.offsetof(6);
        INTERPOLATION_FILTER = layout.offsetof(7);
        TXMODE = layout.offsetof(8);
        DELTA_Q_RES = layout.offsetof(9);
        DELTA_LF_RES = layout.offsetof(10);
        SKIPMODEFRAME = layout.offsetof(11);
        CODED_DENOM = layout.offsetof(12);
        RESERVED2 = layout.offsetof(13);
        ORDERHINTS = layout.offsetof(14);
        EXPECTEDFRAMEID = layout.offsetof(15);
        PTILEINFO = layout.offsetof(16);
        PQUANTIZATION = layout.offsetof(17);
        PSEGMENTATION = layout.offsetof(18);
        PLOOPFILTER = layout.offsetof(19);
        PCDEF = layout.offsetof(20);
        PLOOPRESTORATION = layout.offsetof(21);
        PGLOBALMOTION = layout.offsetof(22);
        PFILMGRAIN = layout.offsetof(23);
    }

    protected StdVideoDecodeAV1PictureInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected StdVideoDecodeAV1PictureInfo create(long address, @Nullable ByteBuffer container) {
        return new StdVideoDecodeAV1PictureInfo(address, container);
    }

    /**
     * Creates a {@code StdVideoDecodeAV1PictureInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoDecodeAV1PictureInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link StdVideoDecodeAV1PictureInfoFlags} view of the {@code flags} field. */
    public StdVideoDecodeAV1PictureInfoFlags flags() { return nflags(address()); }
    /** @return the value of the {@code frame_type} field. */
    @NativeType("StdVideoAV1FrameType")
    public int frame_type() { return nframe_type(address()); }
    /** @return the value of the {@code current_frame_id} field. */
    @NativeType("uint32_t")
    public int current_frame_id() { return ncurrent_frame_id(address()); }
    /** @return the value of the {@code OrderHint} field. */
    @NativeType("uint8_t")
    public byte OrderHint() { return nOrderHint(address()); }
    /** @return the value of the {@code primary_ref_frame} field. */
    @NativeType("uint8_t")
    public byte primary_ref_frame() { return nprimary_ref_frame(address()); }
    /** @return the value of the {@code refresh_frame_flags} field. */
    @NativeType("uint8_t")
    public byte refresh_frame_flags() { return nrefresh_frame_flags(address()); }
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
    /** @return a {@link ByteBuffer} view of the {@code SkipModeFrame} field. */
    @NativeType("uint8_t[STD_VIDEO_AV1_SKIP_MODE_FRAMES]")
    public ByteBuffer SkipModeFrame() { return nSkipModeFrame(address()); }
    /** @return the value at the specified index of the {@code SkipModeFrame} field. */
    @NativeType("uint8_t")
    public byte SkipModeFrame(int index) { return nSkipModeFrame(address(), index); }
    /** @return the value of the {@code coded_denom} field. */
    @NativeType("uint8_t")
    public byte coded_denom() { return ncoded_denom(address()); }
    /** @return a {@link ByteBuffer} view of the {@code OrderHints} field. */
    @NativeType("uint8_t[STD_VIDEO_AV1_NUM_REF_FRAMES]")
    public ByteBuffer OrderHints() { return nOrderHints(address()); }
    /** @return the value at the specified index of the {@code OrderHints} field. */
    @NativeType("uint8_t")
    public byte OrderHints(int index) { return nOrderHints(address(), index); }
    /** @return a {@link IntBuffer} view of the {@code expectedFrameId} field. */
    @NativeType("uint32_t[STD_VIDEO_AV1_NUM_REF_FRAMES]")
    public IntBuffer expectedFrameId() { return nexpectedFrameId(address()); }
    /** @return the value at the specified index of the {@code expectedFrameId} field. */
    @NativeType("uint32_t")
    public int expectedFrameId(int index) { return nexpectedFrameId(address(), index); }
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
    /** @return a {@link StdVideoAV1FilmGrain} view of the struct pointed to by the {@code pFilmGrain} field. */
    @NativeType("StdVideoAV1FilmGrain const *")
    public StdVideoAV1FilmGrain pFilmGrain() { return npFilmGrain(address()); }

    /** Copies the specified {@link StdVideoDecodeAV1PictureInfoFlags} to the {@code flags} field. */
    public StdVideoDecodeAV1PictureInfo flags(StdVideoDecodeAV1PictureInfoFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoDecodeAV1PictureInfo flags(java.util.function.Consumer<StdVideoDecodeAV1PictureInfoFlags> consumer) { consumer.accept(flags()); return this; }
    /** Sets the specified value to the {@code frame_type} field. */
    public StdVideoDecodeAV1PictureInfo frame_type(@NativeType("StdVideoAV1FrameType") int value) { nframe_type(address(), value); return this; }
    /** Sets the specified value to the {@code current_frame_id} field. */
    public StdVideoDecodeAV1PictureInfo current_frame_id(@NativeType("uint32_t") int value) { ncurrent_frame_id(address(), value); return this; }
    /** Sets the specified value to the {@code OrderHint} field. */
    public StdVideoDecodeAV1PictureInfo OrderHint(@NativeType("uint8_t") byte value) { nOrderHint(address(), value); return this; }
    /** Sets the specified value to the {@code primary_ref_frame} field. */
    public StdVideoDecodeAV1PictureInfo primary_ref_frame(@NativeType("uint8_t") byte value) { nprimary_ref_frame(address(), value); return this; }
    /** Sets the specified value to the {@code refresh_frame_flags} field. */
    public StdVideoDecodeAV1PictureInfo refresh_frame_flags(@NativeType("uint8_t") byte value) { nrefresh_frame_flags(address(), value); return this; }
    /** Sets the specified value to the {@code interpolation_filter} field. */
    public StdVideoDecodeAV1PictureInfo interpolation_filter(@NativeType("StdVideoAV1InterpolationFilter") int value) { ninterpolation_filter(address(), value); return this; }
    /** Sets the specified value to the {@code TxMode} field. */
    public StdVideoDecodeAV1PictureInfo TxMode(@NativeType("StdVideoAV1TxMode") int value) { nTxMode(address(), value); return this; }
    /** Sets the specified value to the {@code delta_q_res} field. */
    public StdVideoDecodeAV1PictureInfo delta_q_res(@NativeType("uint8_t") byte value) { ndelta_q_res(address(), value); return this; }
    /** Sets the specified value to the {@code delta_lf_res} field. */
    public StdVideoDecodeAV1PictureInfo delta_lf_res(@NativeType("uint8_t") byte value) { ndelta_lf_res(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code SkipModeFrame} field. */
    public StdVideoDecodeAV1PictureInfo SkipModeFrame(@NativeType("uint8_t[STD_VIDEO_AV1_SKIP_MODE_FRAMES]") ByteBuffer value) { nSkipModeFrame(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code SkipModeFrame} field. */
    public StdVideoDecodeAV1PictureInfo SkipModeFrame(int index, @NativeType("uint8_t") byte value) { nSkipModeFrame(address(), index, value); return this; }
    /** Sets the specified value to the {@code coded_denom} field. */
    public StdVideoDecodeAV1PictureInfo coded_denom(@NativeType("uint8_t") byte value) { ncoded_denom(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code OrderHints} field. */
    public StdVideoDecodeAV1PictureInfo OrderHints(@NativeType("uint8_t[STD_VIDEO_AV1_NUM_REF_FRAMES]") ByteBuffer value) { nOrderHints(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code OrderHints} field. */
    public StdVideoDecodeAV1PictureInfo OrderHints(int index, @NativeType("uint8_t") byte value) { nOrderHints(address(), index, value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code expectedFrameId} field. */
    public StdVideoDecodeAV1PictureInfo expectedFrameId(@NativeType("uint32_t[STD_VIDEO_AV1_NUM_REF_FRAMES]") IntBuffer value) { nexpectedFrameId(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code expectedFrameId} field. */
    public StdVideoDecodeAV1PictureInfo expectedFrameId(int index, @NativeType("uint32_t") int value) { nexpectedFrameId(address(), index, value); return this; }
    /** Sets the address of the specified {@link StdVideoAV1TileInfo} to the {@code pTileInfo} field. */
    public StdVideoDecodeAV1PictureInfo pTileInfo(@NativeType("StdVideoAV1TileInfo const *") StdVideoAV1TileInfo value) { npTileInfo(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoAV1Quantization} to the {@code pQuantization} field. */
    public StdVideoDecodeAV1PictureInfo pQuantization(@NativeType("StdVideoAV1Quantization const *") StdVideoAV1Quantization value) { npQuantization(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoAV1Segmentation} to the {@code pSegmentation} field. */
    public StdVideoDecodeAV1PictureInfo pSegmentation(@NativeType("StdVideoAV1Segmentation const *") StdVideoAV1Segmentation value) { npSegmentation(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoAV1LoopFilter} to the {@code pLoopFilter} field. */
    public StdVideoDecodeAV1PictureInfo pLoopFilter(@NativeType("StdVideoAV1LoopFilter const *") StdVideoAV1LoopFilter value) { npLoopFilter(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoAV1CDEF} to the {@code pCDEF} field. */
    public StdVideoDecodeAV1PictureInfo pCDEF(@NativeType("StdVideoAV1CDEF const *") StdVideoAV1CDEF value) { npCDEF(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoAV1LoopRestoration} to the {@code pLoopRestoration} field. */
    public StdVideoDecodeAV1PictureInfo pLoopRestoration(@NativeType("StdVideoAV1LoopRestoration const *") StdVideoAV1LoopRestoration value) { npLoopRestoration(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoAV1GlobalMotion} to the {@code pGlobalMotion} field. */
    public StdVideoDecodeAV1PictureInfo pGlobalMotion(@NativeType("StdVideoAV1GlobalMotion const *") StdVideoAV1GlobalMotion value) { npGlobalMotion(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoAV1FilmGrain} to the {@code pFilmGrain} field. */
    public StdVideoDecodeAV1PictureInfo pFilmGrain(@NativeType("StdVideoAV1FilmGrain const *") StdVideoAV1FilmGrain value) { npFilmGrain(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoDecodeAV1PictureInfo set(
        StdVideoDecodeAV1PictureInfoFlags flags,
        int frame_type,
        int current_frame_id,
        byte OrderHint,
        byte primary_ref_frame,
        byte refresh_frame_flags,
        int interpolation_filter,
        int TxMode,
        byte delta_q_res,
        byte delta_lf_res,
        ByteBuffer SkipModeFrame,
        byte coded_denom,
        ByteBuffer OrderHints,
        IntBuffer expectedFrameId,
        StdVideoAV1TileInfo pTileInfo,
        StdVideoAV1Quantization pQuantization,
        StdVideoAV1Segmentation pSegmentation,
        StdVideoAV1LoopFilter pLoopFilter,
        StdVideoAV1CDEF pCDEF,
        StdVideoAV1LoopRestoration pLoopRestoration,
        StdVideoAV1GlobalMotion pGlobalMotion,
        StdVideoAV1FilmGrain pFilmGrain
    ) {
        flags(flags);
        frame_type(frame_type);
        current_frame_id(current_frame_id);
        OrderHint(OrderHint);
        primary_ref_frame(primary_ref_frame);
        refresh_frame_flags(refresh_frame_flags);
        interpolation_filter(interpolation_filter);
        TxMode(TxMode);
        delta_q_res(delta_q_res);
        delta_lf_res(delta_lf_res);
        SkipModeFrame(SkipModeFrame);
        coded_denom(coded_denom);
        OrderHints(OrderHints);
        expectedFrameId(expectedFrameId);
        pTileInfo(pTileInfo);
        pQuantization(pQuantization);
        pSegmentation(pSegmentation);
        pLoopFilter(pLoopFilter);
        pCDEF(pCDEF);
        pLoopRestoration(pLoopRestoration);
        pGlobalMotion(pGlobalMotion);
        pFilmGrain(pFilmGrain);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoDecodeAV1PictureInfo set(StdVideoDecodeAV1PictureInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoDecodeAV1PictureInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoDecodeAV1PictureInfo malloc() {
        return new StdVideoDecodeAV1PictureInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code StdVideoDecodeAV1PictureInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoDecodeAV1PictureInfo calloc() {
        return new StdVideoDecodeAV1PictureInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code StdVideoDecodeAV1PictureInfo} instance allocated with {@link BufferUtils}. */
    public static StdVideoDecodeAV1PictureInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoDecodeAV1PictureInfo(memAddress(container), container);
    }

    /** Returns a new {@code StdVideoDecodeAV1PictureInfo} instance for the specified memory address. */
    public static StdVideoDecodeAV1PictureInfo create(long address) {
        return new StdVideoDecodeAV1PictureInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable StdVideoDecodeAV1PictureInfo createSafe(long address) {
        return address == NULL ? null : new StdVideoDecodeAV1PictureInfo(address, null);
    }

    /**
     * Returns a new {@link StdVideoDecodeAV1PictureInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeAV1PictureInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeAV1PictureInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeAV1PictureInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeAV1PictureInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeAV1PictureInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link StdVideoDecodeAV1PictureInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeAV1PictureInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static StdVideoDecodeAV1PictureInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code StdVideoDecodeAV1PictureInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoDecodeAV1PictureInfo malloc(MemoryStack stack) {
        return new StdVideoDecodeAV1PictureInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code StdVideoDecodeAV1PictureInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoDecodeAV1PictureInfo calloc(MemoryStack stack) {
        return new StdVideoDecodeAV1PictureInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link StdVideoDecodeAV1PictureInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeAV1PictureInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoDecodeAV1PictureInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoDecodeAV1PictureInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static StdVideoDecodeAV1PictureInfoFlags nflags(long struct) { return StdVideoDecodeAV1PictureInfoFlags.create(struct + StdVideoDecodeAV1PictureInfo.FLAGS); }
    /** Unsafe version of {@link #frame_type}. */
    public static int nframe_type(long struct) { return memGetInt(struct + StdVideoDecodeAV1PictureInfo.FRAME_TYPE); }
    /** Unsafe version of {@link #current_frame_id}. */
    public static int ncurrent_frame_id(long struct) { return memGetInt(struct + StdVideoDecodeAV1PictureInfo.CURRENT_FRAME_ID); }
    /** Unsafe version of {@link #OrderHint}. */
    public static byte nOrderHint(long struct) { return memGetByte(struct + StdVideoDecodeAV1PictureInfo.ORDERHINT); }
    /** Unsafe version of {@link #primary_ref_frame}. */
    public static byte nprimary_ref_frame(long struct) { return memGetByte(struct + StdVideoDecodeAV1PictureInfo.PRIMARY_REF_FRAME); }
    /** Unsafe version of {@link #refresh_frame_flags}. */
    public static byte nrefresh_frame_flags(long struct) { return memGetByte(struct + StdVideoDecodeAV1PictureInfo.REFRESH_FRAME_FLAGS); }
    public static byte nreserved1(long struct) { return memGetByte(struct + StdVideoDecodeAV1PictureInfo.RESERVED1); }
    /** Unsafe version of {@link #interpolation_filter}. */
    public static int ninterpolation_filter(long struct) { return memGetInt(struct + StdVideoDecodeAV1PictureInfo.INTERPOLATION_FILTER); }
    /** Unsafe version of {@link #TxMode}. */
    public static int nTxMode(long struct) { return memGetInt(struct + StdVideoDecodeAV1PictureInfo.TXMODE); }
    /** Unsafe version of {@link #delta_q_res}. */
    public static byte ndelta_q_res(long struct) { return memGetByte(struct + StdVideoDecodeAV1PictureInfo.DELTA_Q_RES); }
    /** Unsafe version of {@link #delta_lf_res}. */
    public static byte ndelta_lf_res(long struct) { return memGetByte(struct + StdVideoDecodeAV1PictureInfo.DELTA_LF_RES); }
    /** Unsafe version of {@link #SkipModeFrame}. */
    public static ByteBuffer nSkipModeFrame(long struct) { return memByteBuffer(struct + StdVideoDecodeAV1PictureInfo.SKIPMODEFRAME, STD_VIDEO_AV1_SKIP_MODE_FRAMES); }
    /** Unsafe version of {@link #SkipModeFrame(int) SkipModeFrame}. */
    public static byte nSkipModeFrame(long struct, int index) {
        return memGetByte(struct + StdVideoDecodeAV1PictureInfo.SKIPMODEFRAME + check(index, STD_VIDEO_AV1_SKIP_MODE_FRAMES) * 1);
    }
    /** Unsafe version of {@link #coded_denom}. */
    public static byte ncoded_denom(long struct) { return memGetByte(struct + StdVideoDecodeAV1PictureInfo.CODED_DENOM); }
    public static ByteBuffer nreserved2(long struct) { return memByteBuffer(struct + StdVideoDecodeAV1PictureInfo.RESERVED2, 3); }
    public static byte nreserved2(long struct, int index) {
        return memGetByte(struct + StdVideoDecodeAV1PictureInfo.RESERVED2 + check(index, 3) * 1);
    }
    /** Unsafe version of {@link #OrderHints}. */
    public static ByteBuffer nOrderHints(long struct) { return memByteBuffer(struct + StdVideoDecodeAV1PictureInfo.ORDERHINTS, STD_VIDEO_AV1_NUM_REF_FRAMES); }
    /** Unsafe version of {@link #OrderHints(int) OrderHints}. */
    public static byte nOrderHints(long struct, int index) {
        return memGetByte(struct + StdVideoDecodeAV1PictureInfo.ORDERHINTS + check(index, STD_VIDEO_AV1_NUM_REF_FRAMES) * 1);
    }
    /** Unsafe version of {@link #expectedFrameId}. */
    public static IntBuffer nexpectedFrameId(long struct) { return memIntBuffer(struct + StdVideoDecodeAV1PictureInfo.EXPECTEDFRAMEID, STD_VIDEO_AV1_NUM_REF_FRAMES); }
    /** Unsafe version of {@link #expectedFrameId(int) expectedFrameId}. */
    public static int nexpectedFrameId(long struct, int index) {
        return memGetInt(struct + StdVideoDecodeAV1PictureInfo.EXPECTEDFRAMEID + check(index, STD_VIDEO_AV1_NUM_REF_FRAMES) * 4);
    }
    /** Unsafe version of {@link #pTileInfo}. */
    public static StdVideoAV1TileInfo npTileInfo(long struct) { return StdVideoAV1TileInfo.create(memGetAddress(struct + StdVideoDecodeAV1PictureInfo.PTILEINFO)); }
    /** Unsafe version of {@link #pQuantization}. */
    public static StdVideoAV1Quantization npQuantization(long struct) { return StdVideoAV1Quantization.create(memGetAddress(struct + StdVideoDecodeAV1PictureInfo.PQUANTIZATION)); }
    /** Unsafe version of {@link #pSegmentation}. */
    public static StdVideoAV1Segmentation npSegmentation(long struct) { return StdVideoAV1Segmentation.create(memGetAddress(struct + StdVideoDecodeAV1PictureInfo.PSEGMENTATION)); }
    /** Unsafe version of {@link #pLoopFilter}. */
    public static StdVideoAV1LoopFilter npLoopFilter(long struct) { return StdVideoAV1LoopFilter.create(memGetAddress(struct + StdVideoDecodeAV1PictureInfo.PLOOPFILTER)); }
    /** Unsafe version of {@link #pCDEF}. */
    public static StdVideoAV1CDEF npCDEF(long struct) { return StdVideoAV1CDEF.create(memGetAddress(struct + StdVideoDecodeAV1PictureInfo.PCDEF)); }
    /** Unsafe version of {@link #pLoopRestoration}. */
    public static StdVideoAV1LoopRestoration npLoopRestoration(long struct) { return StdVideoAV1LoopRestoration.create(memGetAddress(struct + StdVideoDecodeAV1PictureInfo.PLOOPRESTORATION)); }
    /** Unsafe version of {@link #pGlobalMotion}. */
    public static StdVideoAV1GlobalMotion npGlobalMotion(long struct) { return StdVideoAV1GlobalMotion.create(memGetAddress(struct + StdVideoDecodeAV1PictureInfo.PGLOBALMOTION)); }
    /** Unsafe version of {@link #pFilmGrain}. */
    public static StdVideoAV1FilmGrain npFilmGrain(long struct) { return StdVideoAV1FilmGrain.create(memGetAddress(struct + StdVideoDecodeAV1PictureInfo.PFILMGRAIN)); }

    /** Unsafe version of {@link #flags(StdVideoDecodeAV1PictureInfoFlags) flags}. */
    public static void nflags(long struct, StdVideoDecodeAV1PictureInfoFlags value) { memCopy(value.address(), struct + StdVideoDecodeAV1PictureInfo.FLAGS, StdVideoDecodeAV1PictureInfoFlags.SIZEOF); }
    /** Unsafe version of {@link #frame_type(int) frame_type}. */
    public static void nframe_type(long struct, int value) { memPutInt(struct + StdVideoDecodeAV1PictureInfo.FRAME_TYPE, value); }
    /** Unsafe version of {@link #current_frame_id(int) current_frame_id}. */
    public static void ncurrent_frame_id(long struct, int value) { memPutInt(struct + StdVideoDecodeAV1PictureInfo.CURRENT_FRAME_ID, value); }
    /** Unsafe version of {@link #OrderHint(byte) OrderHint}. */
    public static void nOrderHint(long struct, byte value) { memPutByte(struct + StdVideoDecodeAV1PictureInfo.ORDERHINT, value); }
    /** Unsafe version of {@link #primary_ref_frame(byte) primary_ref_frame}. */
    public static void nprimary_ref_frame(long struct, byte value) { memPutByte(struct + StdVideoDecodeAV1PictureInfo.PRIMARY_REF_FRAME, value); }
    /** Unsafe version of {@link #refresh_frame_flags(byte) refresh_frame_flags}. */
    public static void nrefresh_frame_flags(long struct, byte value) { memPutByte(struct + StdVideoDecodeAV1PictureInfo.REFRESH_FRAME_FLAGS, value); }
    public static void nreserved1(long struct, byte value) { memPutByte(struct + StdVideoDecodeAV1PictureInfo.RESERVED1, value); }
    /** Unsafe version of {@link #interpolation_filter(int) interpolation_filter}. */
    public static void ninterpolation_filter(long struct, int value) { memPutInt(struct + StdVideoDecodeAV1PictureInfo.INTERPOLATION_FILTER, value); }
    /** Unsafe version of {@link #TxMode(int) TxMode}. */
    public static void nTxMode(long struct, int value) { memPutInt(struct + StdVideoDecodeAV1PictureInfo.TXMODE, value); }
    /** Unsafe version of {@link #delta_q_res(byte) delta_q_res}. */
    public static void ndelta_q_res(long struct, byte value) { memPutByte(struct + StdVideoDecodeAV1PictureInfo.DELTA_Q_RES, value); }
    /** Unsafe version of {@link #delta_lf_res(byte) delta_lf_res}. */
    public static void ndelta_lf_res(long struct, byte value) { memPutByte(struct + StdVideoDecodeAV1PictureInfo.DELTA_LF_RES, value); }
    /** Unsafe version of {@link #SkipModeFrame(ByteBuffer) SkipModeFrame}. */
    public static void nSkipModeFrame(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_AV1_SKIP_MODE_FRAMES); }
        memCopy(memAddress(value), struct + StdVideoDecodeAV1PictureInfo.SKIPMODEFRAME, value.remaining() * 1);
    }
    /** Unsafe version of {@link #SkipModeFrame(int, byte) SkipModeFrame}. */
    public static void nSkipModeFrame(long struct, int index, byte value) {
        memPutByte(struct + StdVideoDecodeAV1PictureInfo.SKIPMODEFRAME + check(index, STD_VIDEO_AV1_SKIP_MODE_FRAMES) * 1, value);
    }
    /** Unsafe version of {@link #coded_denom(byte) coded_denom}. */
    public static void ncoded_denom(long struct, byte value) { memPutByte(struct + StdVideoDecodeAV1PictureInfo.CODED_DENOM, value); }
    public static void nreserved2(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + StdVideoDecodeAV1PictureInfo.RESERVED2, value.remaining() * 1);
    }
    public static void nreserved2(long struct, int index, byte value) {
        memPutByte(struct + StdVideoDecodeAV1PictureInfo.RESERVED2 + check(index, 3) * 1, value);
    }
    /** Unsafe version of {@link #OrderHints(ByteBuffer) OrderHints}. */
    public static void nOrderHints(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_AV1_NUM_REF_FRAMES); }
        memCopy(memAddress(value), struct + StdVideoDecodeAV1PictureInfo.ORDERHINTS, value.remaining() * 1);
    }
    /** Unsafe version of {@link #OrderHints(int, byte) OrderHints}. */
    public static void nOrderHints(long struct, int index, byte value) {
        memPutByte(struct + StdVideoDecodeAV1PictureInfo.ORDERHINTS + check(index, STD_VIDEO_AV1_NUM_REF_FRAMES) * 1, value);
    }
    /** Unsafe version of {@link #expectedFrameId(IntBuffer) expectedFrameId}. */
    public static void nexpectedFrameId(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_AV1_NUM_REF_FRAMES); }
        memCopy(memAddress(value), struct + StdVideoDecodeAV1PictureInfo.EXPECTEDFRAMEID, value.remaining() * 4);
    }
    /** Unsafe version of {@link #expectedFrameId(int, int) expectedFrameId}. */
    public static void nexpectedFrameId(long struct, int index, int value) {
        memPutInt(struct + StdVideoDecodeAV1PictureInfo.EXPECTEDFRAMEID + check(index, STD_VIDEO_AV1_NUM_REF_FRAMES) * 4, value);
    }
    /** Unsafe version of {@link #pTileInfo(StdVideoAV1TileInfo) pTileInfo}. */
    public static void npTileInfo(long struct, StdVideoAV1TileInfo value) { memPutAddress(struct + StdVideoDecodeAV1PictureInfo.PTILEINFO, value.address()); }
    /** Unsafe version of {@link #pQuantization(StdVideoAV1Quantization) pQuantization}. */
    public static void npQuantization(long struct, StdVideoAV1Quantization value) { memPutAddress(struct + StdVideoDecodeAV1PictureInfo.PQUANTIZATION, value.address()); }
    /** Unsafe version of {@link #pSegmentation(StdVideoAV1Segmentation) pSegmentation}. */
    public static void npSegmentation(long struct, StdVideoAV1Segmentation value) { memPutAddress(struct + StdVideoDecodeAV1PictureInfo.PSEGMENTATION, value.address()); }
    /** Unsafe version of {@link #pLoopFilter(StdVideoAV1LoopFilter) pLoopFilter}. */
    public static void npLoopFilter(long struct, StdVideoAV1LoopFilter value) { memPutAddress(struct + StdVideoDecodeAV1PictureInfo.PLOOPFILTER, value.address()); }
    /** Unsafe version of {@link #pCDEF(StdVideoAV1CDEF) pCDEF}. */
    public static void npCDEF(long struct, StdVideoAV1CDEF value) { memPutAddress(struct + StdVideoDecodeAV1PictureInfo.PCDEF, value.address()); }
    /** Unsafe version of {@link #pLoopRestoration(StdVideoAV1LoopRestoration) pLoopRestoration}. */
    public static void npLoopRestoration(long struct, StdVideoAV1LoopRestoration value) { memPutAddress(struct + StdVideoDecodeAV1PictureInfo.PLOOPRESTORATION, value.address()); }
    /** Unsafe version of {@link #pGlobalMotion(StdVideoAV1GlobalMotion) pGlobalMotion}. */
    public static void npGlobalMotion(long struct, StdVideoAV1GlobalMotion value) { memPutAddress(struct + StdVideoDecodeAV1PictureInfo.PGLOBALMOTION, value.address()); }
    /** Unsafe version of {@link #pFilmGrain(StdVideoAV1FilmGrain) pFilmGrain}. */
    public static void npFilmGrain(long struct, StdVideoAV1FilmGrain value) { memPutAddress(struct + StdVideoDecodeAV1PictureInfo.PFILMGRAIN, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long pTileInfo = memGetAddress(struct + StdVideoDecodeAV1PictureInfo.PTILEINFO);
        check(pTileInfo);
        StdVideoAV1TileInfo.validate(pTileInfo);
        check(memGetAddress(struct + StdVideoDecodeAV1PictureInfo.PQUANTIZATION));
        check(memGetAddress(struct + StdVideoDecodeAV1PictureInfo.PSEGMENTATION));
        check(memGetAddress(struct + StdVideoDecodeAV1PictureInfo.PLOOPFILTER));
        check(memGetAddress(struct + StdVideoDecodeAV1PictureInfo.PCDEF));
        check(memGetAddress(struct + StdVideoDecodeAV1PictureInfo.PLOOPRESTORATION));
        check(memGetAddress(struct + StdVideoDecodeAV1PictureInfo.PGLOBALMOTION));
        check(memGetAddress(struct + StdVideoDecodeAV1PictureInfo.PFILMGRAIN));
    }

    // -----------------------------------

    /** An array of {@link StdVideoDecodeAV1PictureInfo} structs. */
    public static class Buffer extends StructBuffer<StdVideoDecodeAV1PictureInfo, Buffer> implements NativeResource {

        private static final StdVideoDecodeAV1PictureInfo ELEMENT_FACTORY = StdVideoDecodeAV1PictureInfo.create(-1L);

        /**
         * Creates a new {@code StdVideoDecodeAV1PictureInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoDecodeAV1PictureInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected StdVideoDecodeAV1PictureInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link StdVideoDecodeAV1PictureInfoFlags} view of the {@code flags} field. */
        public StdVideoDecodeAV1PictureInfoFlags flags() { return StdVideoDecodeAV1PictureInfo.nflags(address()); }
        /** @return the value of the {@code frame_type} field. */
        @NativeType("StdVideoAV1FrameType")
        public int frame_type() { return StdVideoDecodeAV1PictureInfo.nframe_type(address()); }
        /** @return the value of the {@code current_frame_id} field. */
        @NativeType("uint32_t")
        public int current_frame_id() { return StdVideoDecodeAV1PictureInfo.ncurrent_frame_id(address()); }
        /** @return the value of the {@code OrderHint} field. */
        @NativeType("uint8_t")
        public byte OrderHint() { return StdVideoDecodeAV1PictureInfo.nOrderHint(address()); }
        /** @return the value of the {@code primary_ref_frame} field. */
        @NativeType("uint8_t")
        public byte primary_ref_frame() { return StdVideoDecodeAV1PictureInfo.nprimary_ref_frame(address()); }
        /** @return the value of the {@code refresh_frame_flags} field. */
        @NativeType("uint8_t")
        public byte refresh_frame_flags() { return StdVideoDecodeAV1PictureInfo.nrefresh_frame_flags(address()); }
        /** @return the value of the {@code interpolation_filter} field. */
        @NativeType("StdVideoAV1InterpolationFilter")
        public int interpolation_filter() { return StdVideoDecodeAV1PictureInfo.ninterpolation_filter(address()); }
        /** @return the value of the {@code TxMode} field. */
        @NativeType("StdVideoAV1TxMode")
        public int TxMode() { return StdVideoDecodeAV1PictureInfo.nTxMode(address()); }
        /** @return the value of the {@code delta_q_res} field. */
        @NativeType("uint8_t")
        public byte delta_q_res() { return StdVideoDecodeAV1PictureInfo.ndelta_q_res(address()); }
        /** @return the value of the {@code delta_lf_res} field. */
        @NativeType("uint8_t")
        public byte delta_lf_res() { return StdVideoDecodeAV1PictureInfo.ndelta_lf_res(address()); }
        /** @return a {@link ByteBuffer} view of the {@code SkipModeFrame} field. */
        @NativeType("uint8_t[STD_VIDEO_AV1_SKIP_MODE_FRAMES]")
        public ByteBuffer SkipModeFrame() { return StdVideoDecodeAV1PictureInfo.nSkipModeFrame(address()); }
        /** @return the value at the specified index of the {@code SkipModeFrame} field. */
        @NativeType("uint8_t")
        public byte SkipModeFrame(int index) { return StdVideoDecodeAV1PictureInfo.nSkipModeFrame(address(), index); }
        /** @return the value of the {@code coded_denom} field. */
        @NativeType("uint8_t")
        public byte coded_denom() { return StdVideoDecodeAV1PictureInfo.ncoded_denom(address()); }
        /** @return a {@link ByteBuffer} view of the {@code OrderHints} field. */
        @NativeType("uint8_t[STD_VIDEO_AV1_NUM_REF_FRAMES]")
        public ByteBuffer OrderHints() { return StdVideoDecodeAV1PictureInfo.nOrderHints(address()); }
        /** @return the value at the specified index of the {@code OrderHints} field. */
        @NativeType("uint8_t")
        public byte OrderHints(int index) { return StdVideoDecodeAV1PictureInfo.nOrderHints(address(), index); }
        /** @return a {@link IntBuffer} view of the {@code expectedFrameId} field. */
        @NativeType("uint32_t[STD_VIDEO_AV1_NUM_REF_FRAMES]")
        public IntBuffer expectedFrameId() { return StdVideoDecodeAV1PictureInfo.nexpectedFrameId(address()); }
        /** @return the value at the specified index of the {@code expectedFrameId} field. */
        @NativeType("uint32_t")
        public int expectedFrameId(int index) { return StdVideoDecodeAV1PictureInfo.nexpectedFrameId(address(), index); }
        /** @return a {@link StdVideoAV1TileInfo} view of the struct pointed to by the {@code pTileInfo} field. */
        @NativeType("StdVideoAV1TileInfo const *")
        public StdVideoAV1TileInfo pTileInfo() { return StdVideoDecodeAV1PictureInfo.npTileInfo(address()); }
        /** @return a {@link StdVideoAV1Quantization} view of the struct pointed to by the {@code pQuantization} field. */
        @NativeType("StdVideoAV1Quantization const *")
        public StdVideoAV1Quantization pQuantization() { return StdVideoDecodeAV1PictureInfo.npQuantization(address()); }
        /** @return a {@link StdVideoAV1Segmentation} view of the struct pointed to by the {@code pSegmentation} field. */
        @NativeType("StdVideoAV1Segmentation const *")
        public StdVideoAV1Segmentation pSegmentation() { return StdVideoDecodeAV1PictureInfo.npSegmentation(address()); }
        /** @return a {@link StdVideoAV1LoopFilter} view of the struct pointed to by the {@code pLoopFilter} field. */
        @NativeType("StdVideoAV1LoopFilter const *")
        public StdVideoAV1LoopFilter pLoopFilter() { return StdVideoDecodeAV1PictureInfo.npLoopFilter(address()); }
        /** @return a {@link StdVideoAV1CDEF} view of the struct pointed to by the {@code pCDEF} field. */
        @NativeType("StdVideoAV1CDEF const *")
        public StdVideoAV1CDEF pCDEF() { return StdVideoDecodeAV1PictureInfo.npCDEF(address()); }
        /** @return a {@link StdVideoAV1LoopRestoration} view of the struct pointed to by the {@code pLoopRestoration} field. */
        @NativeType("StdVideoAV1LoopRestoration const *")
        public StdVideoAV1LoopRestoration pLoopRestoration() { return StdVideoDecodeAV1PictureInfo.npLoopRestoration(address()); }
        /** @return a {@link StdVideoAV1GlobalMotion} view of the struct pointed to by the {@code pGlobalMotion} field. */
        @NativeType("StdVideoAV1GlobalMotion const *")
        public StdVideoAV1GlobalMotion pGlobalMotion() { return StdVideoDecodeAV1PictureInfo.npGlobalMotion(address()); }
        /** @return a {@link StdVideoAV1FilmGrain} view of the struct pointed to by the {@code pFilmGrain} field. */
        @NativeType("StdVideoAV1FilmGrain const *")
        public StdVideoAV1FilmGrain pFilmGrain() { return StdVideoDecodeAV1PictureInfo.npFilmGrain(address()); }

        /** Copies the specified {@link StdVideoDecodeAV1PictureInfoFlags} to the {@code flags} field. */
        public StdVideoDecodeAV1PictureInfo.Buffer flags(StdVideoDecodeAV1PictureInfoFlags value) { StdVideoDecodeAV1PictureInfo.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoDecodeAV1PictureInfo.Buffer flags(java.util.function.Consumer<StdVideoDecodeAV1PictureInfoFlags> consumer) { consumer.accept(flags()); return this; }
        /** Sets the specified value to the {@code frame_type} field. */
        public StdVideoDecodeAV1PictureInfo.Buffer frame_type(@NativeType("StdVideoAV1FrameType") int value) { StdVideoDecodeAV1PictureInfo.nframe_type(address(), value); return this; }
        /** Sets the specified value to the {@code current_frame_id} field. */
        public StdVideoDecodeAV1PictureInfo.Buffer current_frame_id(@NativeType("uint32_t") int value) { StdVideoDecodeAV1PictureInfo.ncurrent_frame_id(address(), value); return this; }
        /** Sets the specified value to the {@code OrderHint} field. */
        public StdVideoDecodeAV1PictureInfo.Buffer OrderHint(@NativeType("uint8_t") byte value) { StdVideoDecodeAV1PictureInfo.nOrderHint(address(), value); return this; }
        /** Sets the specified value to the {@code primary_ref_frame} field. */
        public StdVideoDecodeAV1PictureInfo.Buffer primary_ref_frame(@NativeType("uint8_t") byte value) { StdVideoDecodeAV1PictureInfo.nprimary_ref_frame(address(), value); return this; }
        /** Sets the specified value to the {@code refresh_frame_flags} field. */
        public StdVideoDecodeAV1PictureInfo.Buffer refresh_frame_flags(@NativeType("uint8_t") byte value) { StdVideoDecodeAV1PictureInfo.nrefresh_frame_flags(address(), value); return this; }
        /** Sets the specified value to the {@code interpolation_filter} field. */
        public StdVideoDecodeAV1PictureInfo.Buffer interpolation_filter(@NativeType("StdVideoAV1InterpolationFilter") int value) { StdVideoDecodeAV1PictureInfo.ninterpolation_filter(address(), value); return this; }
        /** Sets the specified value to the {@code TxMode} field. */
        public StdVideoDecodeAV1PictureInfo.Buffer TxMode(@NativeType("StdVideoAV1TxMode") int value) { StdVideoDecodeAV1PictureInfo.nTxMode(address(), value); return this; }
        /** Sets the specified value to the {@code delta_q_res} field. */
        public StdVideoDecodeAV1PictureInfo.Buffer delta_q_res(@NativeType("uint8_t") byte value) { StdVideoDecodeAV1PictureInfo.ndelta_q_res(address(), value); return this; }
        /** Sets the specified value to the {@code delta_lf_res} field. */
        public StdVideoDecodeAV1PictureInfo.Buffer delta_lf_res(@NativeType("uint8_t") byte value) { StdVideoDecodeAV1PictureInfo.ndelta_lf_res(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code SkipModeFrame} field. */
        public StdVideoDecodeAV1PictureInfo.Buffer SkipModeFrame(@NativeType("uint8_t[STD_VIDEO_AV1_SKIP_MODE_FRAMES]") ByteBuffer value) { StdVideoDecodeAV1PictureInfo.nSkipModeFrame(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code SkipModeFrame} field. */
        public StdVideoDecodeAV1PictureInfo.Buffer SkipModeFrame(int index, @NativeType("uint8_t") byte value) { StdVideoDecodeAV1PictureInfo.nSkipModeFrame(address(), index, value); return this; }
        /** Sets the specified value to the {@code coded_denom} field. */
        public StdVideoDecodeAV1PictureInfo.Buffer coded_denom(@NativeType("uint8_t") byte value) { StdVideoDecodeAV1PictureInfo.ncoded_denom(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code OrderHints} field. */
        public StdVideoDecodeAV1PictureInfo.Buffer OrderHints(@NativeType("uint8_t[STD_VIDEO_AV1_NUM_REF_FRAMES]") ByteBuffer value) { StdVideoDecodeAV1PictureInfo.nOrderHints(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code OrderHints} field. */
        public StdVideoDecodeAV1PictureInfo.Buffer OrderHints(int index, @NativeType("uint8_t") byte value) { StdVideoDecodeAV1PictureInfo.nOrderHints(address(), index, value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code expectedFrameId} field. */
        public StdVideoDecodeAV1PictureInfo.Buffer expectedFrameId(@NativeType("uint32_t[STD_VIDEO_AV1_NUM_REF_FRAMES]") IntBuffer value) { StdVideoDecodeAV1PictureInfo.nexpectedFrameId(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code expectedFrameId} field. */
        public StdVideoDecodeAV1PictureInfo.Buffer expectedFrameId(int index, @NativeType("uint32_t") int value) { StdVideoDecodeAV1PictureInfo.nexpectedFrameId(address(), index, value); return this; }
        /** Sets the address of the specified {@link StdVideoAV1TileInfo} to the {@code pTileInfo} field. */
        public StdVideoDecodeAV1PictureInfo.Buffer pTileInfo(@NativeType("StdVideoAV1TileInfo const *") StdVideoAV1TileInfo value) { StdVideoDecodeAV1PictureInfo.npTileInfo(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoAV1Quantization} to the {@code pQuantization} field. */
        public StdVideoDecodeAV1PictureInfo.Buffer pQuantization(@NativeType("StdVideoAV1Quantization const *") StdVideoAV1Quantization value) { StdVideoDecodeAV1PictureInfo.npQuantization(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoAV1Segmentation} to the {@code pSegmentation} field. */
        public StdVideoDecodeAV1PictureInfo.Buffer pSegmentation(@NativeType("StdVideoAV1Segmentation const *") StdVideoAV1Segmentation value) { StdVideoDecodeAV1PictureInfo.npSegmentation(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoAV1LoopFilter} to the {@code pLoopFilter} field. */
        public StdVideoDecodeAV1PictureInfo.Buffer pLoopFilter(@NativeType("StdVideoAV1LoopFilter const *") StdVideoAV1LoopFilter value) { StdVideoDecodeAV1PictureInfo.npLoopFilter(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoAV1CDEF} to the {@code pCDEF} field. */
        public StdVideoDecodeAV1PictureInfo.Buffer pCDEF(@NativeType("StdVideoAV1CDEF const *") StdVideoAV1CDEF value) { StdVideoDecodeAV1PictureInfo.npCDEF(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoAV1LoopRestoration} to the {@code pLoopRestoration} field. */
        public StdVideoDecodeAV1PictureInfo.Buffer pLoopRestoration(@NativeType("StdVideoAV1LoopRestoration const *") StdVideoAV1LoopRestoration value) { StdVideoDecodeAV1PictureInfo.npLoopRestoration(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoAV1GlobalMotion} to the {@code pGlobalMotion} field. */
        public StdVideoDecodeAV1PictureInfo.Buffer pGlobalMotion(@NativeType("StdVideoAV1GlobalMotion const *") StdVideoAV1GlobalMotion value) { StdVideoDecodeAV1PictureInfo.npGlobalMotion(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoAV1FilmGrain} to the {@code pFilmGrain} field. */
        public StdVideoDecodeAV1PictureInfo.Buffer pFilmGrain(@NativeType("StdVideoAV1FilmGrain const *") StdVideoAV1FilmGrain value) { StdVideoDecodeAV1PictureInfo.npFilmGrain(address(), value); return this; }

    }

}