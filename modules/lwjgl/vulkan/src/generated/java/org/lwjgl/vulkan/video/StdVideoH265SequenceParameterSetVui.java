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

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct StdVideoH265SequenceParameterSetVui {
 *     uint8_t aspect_ratio_idc;
 *     uint16_t sar_width;
 *     uint16_t sar_height;
 *     uint8_t video_format;
 *     uint8_t colour_primaries;
 *     uint8_t transfer_characteristics;
 *     uint8_t matrix_coeffs;
 *     uint8_t chroma_sample_loc_type_top_field;
 *     uint8_t chroma_sample_loc_type_bottom_field;
 *     uint16_t def_disp_win_left_offset;
 *     uint16_t def_disp_win_right_offset;
 *     uint16_t def_disp_win_top_offset;
 *     uint16_t def_disp_win_bottom_offset;
 *     uint32_t vui_num_units_in_tick;
 *     uint32_t vui_time_scale;
 *     uint32_t vui_num_ticks_poc_diff_one_minus1;
 *     {@link StdVideoH265HrdParameters StdVideoH265HrdParameters} * pHrdParameters;
 *     uint16_t min_spatial_segmentation_idc;
 *     uint8_t max_bytes_per_pic_denom;
 *     uint8_t max_bits_per_min_cu_denom;
 *     uint8_t log2_max_mv_length_horizontal;
 *     uint8_t log2_max_mv_length_vertical;
 *     {@link StdVideoH265SpsVuiFlags StdVideoH265SpsVuiFlags} flags;
 * }</code></pre>
 */
public class StdVideoH265SequenceParameterSetVui extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ASPECT_RATIO_IDC,
        SAR_WIDTH,
        SAR_HEIGHT,
        VIDEO_FORMAT,
        COLOUR_PRIMARIES,
        TRANSFER_CHARACTERISTICS,
        MATRIX_COEFFS,
        CHROMA_SAMPLE_LOC_TYPE_TOP_FIELD,
        CHROMA_SAMPLE_LOC_TYPE_BOTTOM_FIELD,
        DEF_DISP_WIN_LEFT_OFFSET,
        DEF_DISP_WIN_RIGHT_OFFSET,
        DEF_DISP_WIN_TOP_OFFSET,
        DEF_DISP_WIN_BOTTOM_OFFSET,
        VUI_NUM_UNITS_IN_TICK,
        VUI_TIME_SCALE,
        VUI_NUM_TICKS_POC_DIFF_ONE_MINUS1,
        PHRDPARAMETERS,
        MIN_SPATIAL_SEGMENTATION_IDC,
        MAX_BYTES_PER_PIC_DENOM,
        MAX_BITS_PER_MIN_CU_DENOM,
        LOG2_MAX_MV_LENGTH_HORIZONTAL,
        LOG2_MAX_MV_LENGTH_VERTICAL,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(1),
            __member(2),
            __member(2),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(2),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(StdVideoH265SpsVuiFlags.SIZEOF, StdVideoH265SpsVuiFlags.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ASPECT_RATIO_IDC = layout.offsetof(0);
        SAR_WIDTH = layout.offsetof(1);
        SAR_HEIGHT = layout.offsetof(2);
        VIDEO_FORMAT = layout.offsetof(3);
        COLOUR_PRIMARIES = layout.offsetof(4);
        TRANSFER_CHARACTERISTICS = layout.offsetof(5);
        MATRIX_COEFFS = layout.offsetof(6);
        CHROMA_SAMPLE_LOC_TYPE_TOP_FIELD = layout.offsetof(7);
        CHROMA_SAMPLE_LOC_TYPE_BOTTOM_FIELD = layout.offsetof(8);
        DEF_DISP_WIN_LEFT_OFFSET = layout.offsetof(9);
        DEF_DISP_WIN_RIGHT_OFFSET = layout.offsetof(10);
        DEF_DISP_WIN_TOP_OFFSET = layout.offsetof(11);
        DEF_DISP_WIN_BOTTOM_OFFSET = layout.offsetof(12);
        VUI_NUM_UNITS_IN_TICK = layout.offsetof(13);
        VUI_TIME_SCALE = layout.offsetof(14);
        VUI_NUM_TICKS_POC_DIFF_ONE_MINUS1 = layout.offsetof(15);
        PHRDPARAMETERS = layout.offsetof(16);
        MIN_SPATIAL_SEGMENTATION_IDC = layout.offsetof(17);
        MAX_BYTES_PER_PIC_DENOM = layout.offsetof(18);
        MAX_BITS_PER_MIN_CU_DENOM = layout.offsetof(19);
        LOG2_MAX_MV_LENGTH_HORIZONTAL = layout.offsetof(20);
        LOG2_MAX_MV_LENGTH_VERTICAL = layout.offsetof(21);
        FLAGS = layout.offsetof(22);
    }

    /**
     * Creates a {@code StdVideoH265SequenceParameterSetVui} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoH265SequenceParameterSetVui(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code aspect_ratio_idc} field. */
    @NativeType("uint8_t")
    public byte aspect_ratio_idc() { return naspect_ratio_idc(address()); }
    /** @return the value of the {@code sar_width} field. */
    @NativeType("uint16_t")
    public short sar_width() { return nsar_width(address()); }
    /** @return the value of the {@code sar_height} field. */
    @NativeType("uint16_t")
    public short sar_height() { return nsar_height(address()); }
    /** @return the value of the {@code video_format} field. */
    @NativeType("uint8_t")
    public byte video_format() { return nvideo_format(address()); }
    /** @return the value of the {@code colour_primaries} field. */
    @NativeType("uint8_t")
    public byte colour_primaries() { return ncolour_primaries(address()); }
    /** @return the value of the {@code transfer_characteristics} field. */
    @NativeType("uint8_t")
    public byte transfer_characteristics() { return ntransfer_characteristics(address()); }
    /** @return the value of the {@code matrix_coeffs} field. */
    @NativeType("uint8_t")
    public byte matrix_coeffs() { return nmatrix_coeffs(address()); }
    /** @return the value of the {@code chroma_sample_loc_type_top_field} field. */
    @NativeType("uint8_t")
    public byte chroma_sample_loc_type_top_field() { return nchroma_sample_loc_type_top_field(address()); }
    /** @return the value of the {@code chroma_sample_loc_type_bottom_field} field. */
    @NativeType("uint8_t")
    public byte chroma_sample_loc_type_bottom_field() { return nchroma_sample_loc_type_bottom_field(address()); }
    /** @return the value of the {@code def_disp_win_left_offset} field. */
    @NativeType("uint16_t")
    public short def_disp_win_left_offset() { return ndef_disp_win_left_offset(address()); }
    /** @return the value of the {@code def_disp_win_right_offset} field. */
    @NativeType("uint16_t")
    public short def_disp_win_right_offset() { return ndef_disp_win_right_offset(address()); }
    /** @return the value of the {@code def_disp_win_top_offset} field. */
    @NativeType("uint16_t")
    public short def_disp_win_top_offset() { return ndef_disp_win_top_offset(address()); }
    /** @return the value of the {@code def_disp_win_bottom_offset} field. */
    @NativeType("uint16_t")
    public short def_disp_win_bottom_offset() { return ndef_disp_win_bottom_offset(address()); }
    /** @return the value of the {@code vui_num_units_in_tick} field. */
    @NativeType("uint32_t")
    public int vui_num_units_in_tick() { return nvui_num_units_in_tick(address()); }
    /** @return the value of the {@code vui_time_scale} field. */
    @NativeType("uint32_t")
    public int vui_time_scale() { return nvui_time_scale(address()); }
    /** @return the value of the {@code vui_num_ticks_poc_diff_one_minus1} field. */
    @NativeType("uint32_t")
    public int vui_num_ticks_poc_diff_one_minus1() { return nvui_num_ticks_poc_diff_one_minus1(address()); }
    /** @return a {@link StdVideoH265HrdParameters} view of the struct pointed to by the {@code pHrdParameters} field. */
    @NativeType("StdVideoH265HrdParameters *")
    public StdVideoH265HrdParameters pHrdParameters() { return npHrdParameters(address()); }
    /** @return the value of the {@code min_spatial_segmentation_idc} field. */
    @NativeType("uint16_t")
    public short min_spatial_segmentation_idc() { return nmin_spatial_segmentation_idc(address()); }
    /** @return the value of the {@code max_bytes_per_pic_denom} field. */
    @NativeType("uint8_t")
    public byte max_bytes_per_pic_denom() { return nmax_bytes_per_pic_denom(address()); }
    /** @return the value of the {@code max_bits_per_min_cu_denom} field. */
    @NativeType("uint8_t")
    public byte max_bits_per_min_cu_denom() { return nmax_bits_per_min_cu_denom(address()); }
    /** @return the value of the {@code log2_max_mv_length_horizontal} field. */
    @NativeType("uint8_t")
    public byte log2_max_mv_length_horizontal() { return nlog2_max_mv_length_horizontal(address()); }
    /** @return the value of the {@code log2_max_mv_length_vertical} field. */
    @NativeType("uint8_t")
    public byte log2_max_mv_length_vertical() { return nlog2_max_mv_length_vertical(address()); }
    /** @return a {@link StdVideoH265SpsVuiFlags} view of the {@code flags} field. */
    public StdVideoH265SpsVuiFlags flags() { return nflags(address()); }

    /** Sets the specified value to the {@code aspect_ratio_idc} field. */
    public StdVideoH265SequenceParameterSetVui aspect_ratio_idc(@NativeType("uint8_t") byte value) { naspect_ratio_idc(address(), value); return this; }
    /** Sets the specified value to the {@code sar_width} field. */
    public StdVideoH265SequenceParameterSetVui sar_width(@NativeType("uint16_t") short value) { nsar_width(address(), value); return this; }
    /** Sets the specified value to the {@code sar_height} field. */
    public StdVideoH265SequenceParameterSetVui sar_height(@NativeType("uint16_t") short value) { nsar_height(address(), value); return this; }
    /** Sets the specified value to the {@code video_format} field. */
    public StdVideoH265SequenceParameterSetVui video_format(@NativeType("uint8_t") byte value) { nvideo_format(address(), value); return this; }
    /** Sets the specified value to the {@code colour_primaries} field. */
    public StdVideoH265SequenceParameterSetVui colour_primaries(@NativeType("uint8_t") byte value) { ncolour_primaries(address(), value); return this; }
    /** Sets the specified value to the {@code transfer_characteristics} field. */
    public StdVideoH265SequenceParameterSetVui transfer_characteristics(@NativeType("uint8_t") byte value) { ntransfer_characteristics(address(), value); return this; }
    /** Sets the specified value to the {@code matrix_coeffs} field. */
    public StdVideoH265SequenceParameterSetVui matrix_coeffs(@NativeType("uint8_t") byte value) { nmatrix_coeffs(address(), value); return this; }
    /** Sets the specified value to the {@code chroma_sample_loc_type_top_field} field. */
    public StdVideoH265SequenceParameterSetVui chroma_sample_loc_type_top_field(@NativeType("uint8_t") byte value) { nchroma_sample_loc_type_top_field(address(), value); return this; }
    /** Sets the specified value to the {@code chroma_sample_loc_type_bottom_field} field. */
    public StdVideoH265SequenceParameterSetVui chroma_sample_loc_type_bottom_field(@NativeType("uint8_t") byte value) { nchroma_sample_loc_type_bottom_field(address(), value); return this; }
    /** Sets the specified value to the {@code def_disp_win_left_offset} field. */
    public StdVideoH265SequenceParameterSetVui def_disp_win_left_offset(@NativeType("uint16_t") short value) { ndef_disp_win_left_offset(address(), value); return this; }
    /** Sets the specified value to the {@code def_disp_win_right_offset} field. */
    public StdVideoH265SequenceParameterSetVui def_disp_win_right_offset(@NativeType("uint16_t") short value) { ndef_disp_win_right_offset(address(), value); return this; }
    /** Sets the specified value to the {@code def_disp_win_top_offset} field. */
    public StdVideoH265SequenceParameterSetVui def_disp_win_top_offset(@NativeType("uint16_t") short value) { ndef_disp_win_top_offset(address(), value); return this; }
    /** Sets the specified value to the {@code def_disp_win_bottom_offset} field. */
    public StdVideoH265SequenceParameterSetVui def_disp_win_bottom_offset(@NativeType("uint16_t") short value) { ndef_disp_win_bottom_offset(address(), value); return this; }
    /** Sets the specified value to the {@code vui_num_units_in_tick} field. */
    public StdVideoH265SequenceParameterSetVui vui_num_units_in_tick(@NativeType("uint32_t") int value) { nvui_num_units_in_tick(address(), value); return this; }
    /** Sets the specified value to the {@code vui_time_scale} field. */
    public StdVideoH265SequenceParameterSetVui vui_time_scale(@NativeType("uint32_t") int value) { nvui_time_scale(address(), value); return this; }
    /** Sets the specified value to the {@code vui_num_ticks_poc_diff_one_minus1} field. */
    public StdVideoH265SequenceParameterSetVui vui_num_ticks_poc_diff_one_minus1(@NativeType("uint32_t") int value) { nvui_num_ticks_poc_diff_one_minus1(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoH265HrdParameters} to the {@code pHrdParameters} field. */
    public StdVideoH265SequenceParameterSetVui pHrdParameters(@NativeType("StdVideoH265HrdParameters *") StdVideoH265HrdParameters value) { npHrdParameters(address(), value); return this; }
    /** Sets the specified value to the {@code min_spatial_segmentation_idc} field. */
    public StdVideoH265SequenceParameterSetVui min_spatial_segmentation_idc(@NativeType("uint16_t") short value) { nmin_spatial_segmentation_idc(address(), value); return this; }
    /** Sets the specified value to the {@code max_bytes_per_pic_denom} field. */
    public StdVideoH265SequenceParameterSetVui max_bytes_per_pic_denom(@NativeType("uint8_t") byte value) { nmax_bytes_per_pic_denom(address(), value); return this; }
    /** Sets the specified value to the {@code max_bits_per_min_cu_denom} field. */
    public StdVideoH265SequenceParameterSetVui max_bits_per_min_cu_denom(@NativeType("uint8_t") byte value) { nmax_bits_per_min_cu_denom(address(), value); return this; }
    /** Sets the specified value to the {@code log2_max_mv_length_horizontal} field. */
    public StdVideoH265SequenceParameterSetVui log2_max_mv_length_horizontal(@NativeType("uint8_t") byte value) { nlog2_max_mv_length_horizontal(address(), value); return this; }
    /** Sets the specified value to the {@code log2_max_mv_length_vertical} field. */
    public StdVideoH265SequenceParameterSetVui log2_max_mv_length_vertical(@NativeType("uint8_t") byte value) { nlog2_max_mv_length_vertical(address(), value); return this; }
    /** Copies the specified {@link StdVideoH265SpsVuiFlags} to the {@code flags} field. */
    public StdVideoH265SequenceParameterSetVui flags(StdVideoH265SpsVuiFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoH265SequenceParameterSetVui flags(java.util.function.Consumer<StdVideoH265SpsVuiFlags> consumer) { consumer.accept(flags()); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoH265SequenceParameterSetVui set(
        byte aspect_ratio_idc,
        short sar_width,
        short sar_height,
        byte video_format,
        byte colour_primaries,
        byte transfer_characteristics,
        byte matrix_coeffs,
        byte chroma_sample_loc_type_top_field,
        byte chroma_sample_loc_type_bottom_field,
        short def_disp_win_left_offset,
        short def_disp_win_right_offset,
        short def_disp_win_top_offset,
        short def_disp_win_bottom_offset,
        int vui_num_units_in_tick,
        int vui_time_scale,
        int vui_num_ticks_poc_diff_one_minus1,
        StdVideoH265HrdParameters pHrdParameters,
        short min_spatial_segmentation_idc,
        byte max_bytes_per_pic_denom,
        byte max_bits_per_min_cu_denom,
        byte log2_max_mv_length_horizontal,
        byte log2_max_mv_length_vertical,
        StdVideoH265SpsVuiFlags flags
    ) {
        aspect_ratio_idc(aspect_ratio_idc);
        sar_width(sar_width);
        sar_height(sar_height);
        video_format(video_format);
        colour_primaries(colour_primaries);
        transfer_characteristics(transfer_characteristics);
        matrix_coeffs(matrix_coeffs);
        chroma_sample_loc_type_top_field(chroma_sample_loc_type_top_field);
        chroma_sample_loc_type_bottom_field(chroma_sample_loc_type_bottom_field);
        def_disp_win_left_offset(def_disp_win_left_offset);
        def_disp_win_right_offset(def_disp_win_right_offset);
        def_disp_win_top_offset(def_disp_win_top_offset);
        def_disp_win_bottom_offset(def_disp_win_bottom_offset);
        vui_num_units_in_tick(vui_num_units_in_tick);
        vui_time_scale(vui_time_scale);
        vui_num_ticks_poc_diff_one_minus1(vui_num_ticks_poc_diff_one_minus1);
        pHrdParameters(pHrdParameters);
        min_spatial_segmentation_idc(min_spatial_segmentation_idc);
        max_bytes_per_pic_denom(max_bytes_per_pic_denom);
        max_bits_per_min_cu_denom(max_bits_per_min_cu_denom);
        log2_max_mv_length_horizontal(log2_max_mv_length_horizontal);
        log2_max_mv_length_vertical(log2_max_mv_length_vertical);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoH265SequenceParameterSetVui set(StdVideoH265SequenceParameterSetVui src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoH265SequenceParameterSetVui} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoH265SequenceParameterSetVui malloc() {
        return wrap(StdVideoH265SequenceParameterSetVui.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code StdVideoH265SequenceParameterSetVui} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoH265SequenceParameterSetVui calloc() {
        return wrap(StdVideoH265SequenceParameterSetVui.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code StdVideoH265SequenceParameterSetVui} instance allocated with {@link BufferUtils}. */
    public static StdVideoH265SequenceParameterSetVui create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(StdVideoH265SequenceParameterSetVui.class, memAddress(container), container);
    }

    /** Returns a new {@code StdVideoH265SequenceParameterSetVui} instance for the specified memory address. */
    public static StdVideoH265SequenceParameterSetVui create(long address) {
        return wrap(StdVideoH265SequenceParameterSetVui.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH265SequenceParameterSetVui createSafe(long address) {
        return address == NULL ? null : wrap(StdVideoH265SequenceParameterSetVui.class, address);
    }

    /**
     * Returns a new {@link StdVideoH265SequenceParameterSetVui.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265SequenceParameterSetVui.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265SequenceParameterSetVui.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265SequenceParameterSetVui.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265SequenceParameterSetVui.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265SequenceParameterSetVui.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link StdVideoH265SequenceParameterSetVui.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoH265SequenceParameterSetVui.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH265SequenceParameterSetVui.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code StdVideoH265SequenceParameterSetVui} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH265SequenceParameterSetVui malloc(MemoryStack stack) {
        return wrap(StdVideoH265SequenceParameterSetVui.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code StdVideoH265SequenceParameterSetVui} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH265SequenceParameterSetVui calloc(MemoryStack stack) {
        return wrap(StdVideoH265SequenceParameterSetVui.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link StdVideoH265SequenceParameterSetVui.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH265SequenceParameterSetVui.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265SequenceParameterSetVui.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH265SequenceParameterSetVui.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #aspect_ratio_idc}. */
    public static byte naspect_ratio_idc(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265SequenceParameterSetVui.ASPECT_RATIO_IDC); }
    /** Unsafe version of {@link #sar_width}. */
    public static short nsar_width(long struct) { return UNSAFE.getShort(null, struct + StdVideoH265SequenceParameterSetVui.SAR_WIDTH); }
    /** Unsafe version of {@link #sar_height}. */
    public static short nsar_height(long struct) { return UNSAFE.getShort(null, struct + StdVideoH265SequenceParameterSetVui.SAR_HEIGHT); }
    /** Unsafe version of {@link #video_format}. */
    public static byte nvideo_format(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265SequenceParameterSetVui.VIDEO_FORMAT); }
    /** Unsafe version of {@link #colour_primaries}. */
    public static byte ncolour_primaries(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265SequenceParameterSetVui.COLOUR_PRIMARIES); }
    /** Unsafe version of {@link #transfer_characteristics}. */
    public static byte ntransfer_characteristics(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265SequenceParameterSetVui.TRANSFER_CHARACTERISTICS); }
    /** Unsafe version of {@link #matrix_coeffs}. */
    public static byte nmatrix_coeffs(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265SequenceParameterSetVui.MATRIX_COEFFS); }
    /** Unsafe version of {@link #chroma_sample_loc_type_top_field}. */
    public static byte nchroma_sample_loc_type_top_field(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265SequenceParameterSetVui.CHROMA_SAMPLE_LOC_TYPE_TOP_FIELD); }
    /** Unsafe version of {@link #chroma_sample_loc_type_bottom_field}. */
    public static byte nchroma_sample_loc_type_bottom_field(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265SequenceParameterSetVui.CHROMA_SAMPLE_LOC_TYPE_BOTTOM_FIELD); }
    /** Unsafe version of {@link #def_disp_win_left_offset}. */
    public static short ndef_disp_win_left_offset(long struct) { return UNSAFE.getShort(null, struct + StdVideoH265SequenceParameterSetVui.DEF_DISP_WIN_LEFT_OFFSET); }
    /** Unsafe version of {@link #def_disp_win_right_offset}. */
    public static short ndef_disp_win_right_offset(long struct) { return UNSAFE.getShort(null, struct + StdVideoH265SequenceParameterSetVui.DEF_DISP_WIN_RIGHT_OFFSET); }
    /** Unsafe version of {@link #def_disp_win_top_offset}. */
    public static short ndef_disp_win_top_offset(long struct) { return UNSAFE.getShort(null, struct + StdVideoH265SequenceParameterSetVui.DEF_DISP_WIN_TOP_OFFSET); }
    /** Unsafe version of {@link #def_disp_win_bottom_offset}. */
    public static short ndef_disp_win_bottom_offset(long struct) { return UNSAFE.getShort(null, struct + StdVideoH265SequenceParameterSetVui.DEF_DISP_WIN_BOTTOM_OFFSET); }
    /** Unsafe version of {@link #vui_num_units_in_tick}. */
    public static int nvui_num_units_in_tick(long struct) { return UNSAFE.getInt(null, struct + StdVideoH265SequenceParameterSetVui.VUI_NUM_UNITS_IN_TICK); }
    /** Unsafe version of {@link #vui_time_scale}. */
    public static int nvui_time_scale(long struct) { return UNSAFE.getInt(null, struct + StdVideoH265SequenceParameterSetVui.VUI_TIME_SCALE); }
    /** Unsafe version of {@link #vui_num_ticks_poc_diff_one_minus1}. */
    public static int nvui_num_ticks_poc_diff_one_minus1(long struct) { return UNSAFE.getInt(null, struct + StdVideoH265SequenceParameterSetVui.VUI_NUM_TICKS_POC_DIFF_ONE_MINUS1); }
    /** Unsafe version of {@link #pHrdParameters}. */
    public static StdVideoH265HrdParameters npHrdParameters(long struct) { return StdVideoH265HrdParameters.create(memGetAddress(struct + StdVideoH265SequenceParameterSetVui.PHRDPARAMETERS)); }
    /** Unsafe version of {@link #min_spatial_segmentation_idc}. */
    public static short nmin_spatial_segmentation_idc(long struct) { return UNSAFE.getShort(null, struct + StdVideoH265SequenceParameterSetVui.MIN_SPATIAL_SEGMENTATION_IDC); }
    /** Unsafe version of {@link #max_bytes_per_pic_denom}. */
    public static byte nmax_bytes_per_pic_denom(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265SequenceParameterSetVui.MAX_BYTES_PER_PIC_DENOM); }
    /** Unsafe version of {@link #max_bits_per_min_cu_denom}. */
    public static byte nmax_bits_per_min_cu_denom(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265SequenceParameterSetVui.MAX_BITS_PER_MIN_CU_DENOM); }
    /** Unsafe version of {@link #log2_max_mv_length_horizontal}. */
    public static byte nlog2_max_mv_length_horizontal(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265SequenceParameterSetVui.LOG2_MAX_MV_LENGTH_HORIZONTAL); }
    /** Unsafe version of {@link #log2_max_mv_length_vertical}. */
    public static byte nlog2_max_mv_length_vertical(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265SequenceParameterSetVui.LOG2_MAX_MV_LENGTH_VERTICAL); }
    /** Unsafe version of {@link #flags}. */
    public static StdVideoH265SpsVuiFlags nflags(long struct) { return StdVideoH265SpsVuiFlags.create(struct + StdVideoH265SequenceParameterSetVui.FLAGS); }

    /** Unsafe version of {@link #aspect_ratio_idc(byte) aspect_ratio_idc}. */
    public static void naspect_ratio_idc(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265SequenceParameterSetVui.ASPECT_RATIO_IDC, value); }
    /** Unsafe version of {@link #sar_width(short) sar_width}. */
    public static void nsar_width(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoH265SequenceParameterSetVui.SAR_WIDTH, value); }
    /** Unsafe version of {@link #sar_height(short) sar_height}. */
    public static void nsar_height(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoH265SequenceParameterSetVui.SAR_HEIGHT, value); }
    /** Unsafe version of {@link #video_format(byte) video_format}. */
    public static void nvideo_format(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265SequenceParameterSetVui.VIDEO_FORMAT, value); }
    /** Unsafe version of {@link #colour_primaries(byte) colour_primaries}. */
    public static void ncolour_primaries(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265SequenceParameterSetVui.COLOUR_PRIMARIES, value); }
    /** Unsafe version of {@link #transfer_characteristics(byte) transfer_characteristics}. */
    public static void ntransfer_characteristics(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265SequenceParameterSetVui.TRANSFER_CHARACTERISTICS, value); }
    /** Unsafe version of {@link #matrix_coeffs(byte) matrix_coeffs}. */
    public static void nmatrix_coeffs(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265SequenceParameterSetVui.MATRIX_COEFFS, value); }
    /** Unsafe version of {@link #chroma_sample_loc_type_top_field(byte) chroma_sample_loc_type_top_field}. */
    public static void nchroma_sample_loc_type_top_field(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265SequenceParameterSetVui.CHROMA_SAMPLE_LOC_TYPE_TOP_FIELD, value); }
    /** Unsafe version of {@link #chroma_sample_loc_type_bottom_field(byte) chroma_sample_loc_type_bottom_field}. */
    public static void nchroma_sample_loc_type_bottom_field(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265SequenceParameterSetVui.CHROMA_SAMPLE_LOC_TYPE_BOTTOM_FIELD, value); }
    /** Unsafe version of {@link #def_disp_win_left_offset(short) def_disp_win_left_offset}. */
    public static void ndef_disp_win_left_offset(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoH265SequenceParameterSetVui.DEF_DISP_WIN_LEFT_OFFSET, value); }
    /** Unsafe version of {@link #def_disp_win_right_offset(short) def_disp_win_right_offset}. */
    public static void ndef_disp_win_right_offset(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoH265SequenceParameterSetVui.DEF_DISP_WIN_RIGHT_OFFSET, value); }
    /** Unsafe version of {@link #def_disp_win_top_offset(short) def_disp_win_top_offset}. */
    public static void ndef_disp_win_top_offset(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoH265SequenceParameterSetVui.DEF_DISP_WIN_TOP_OFFSET, value); }
    /** Unsafe version of {@link #def_disp_win_bottom_offset(short) def_disp_win_bottom_offset}. */
    public static void ndef_disp_win_bottom_offset(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoH265SequenceParameterSetVui.DEF_DISP_WIN_BOTTOM_OFFSET, value); }
    /** Unsafe version of {@link #vui_num_units_in_tick(int) vui_num_units_in_tick}. */
    public static void nvui_num_units_in_tick(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH265SequenceParameterSetVui.VUI_NUM_UNITS_IN_TICK, value); }
    /** Unsafe version of {@link #vui_time_scale(int) vui_time_scale}. */
    public static void nvui_time_scale(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH265SequenceParameterSetVui.VUI_TIME_SCALE, value); }
    /** Unsafe version of {@link #vui_num_ticks_poc_diff_one_minus1(int) vui_num_ticks_poc_diff_one_minus1}. */
    public static void nvui_num_ticks_poc_diff_one_minus1(long struct, int value) { UNSAFE.putInt(null, struct + StdVideoH265SequenceParameterSetVui.VUI_NUM_TICKS_POC_DIFF_ONE_MINUS1, value); }
    /** Unsafe version of {@link #pHrdParameters(StdVideoH265HrdParameters) pHrdParameters}. */
    public static void npHrdParameters(long struct, StdVideoH265HrdParameters value) { memPutAddress(struct + StdVideoH265SequenceParameterSetVui.PHRDPARAMETERS, value.address()); }
    /** Unsafe version of {@link #min_spatial_segmentation_idc(short) min_spatial_segmentation_idc}. */
    public static void nmin_spatial_segmentation_idc(long struct, short value) { UNSAFE.putShort(null, struct + StdVideoH265SequenceParameterSetVui.MIN_SPATIAL_SEGMENTATION_IDC, value); }
    /** Unsafe version of {@link #max_bytes_per_pic_denom(byte) max_bytes_per_pic_denom}. */
    public static void nmax_bytes_per_pic_denom(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265SequenceParameterSetVui.MAX_BYTES_PER_PIC_DENOM, value); }
    /** Unsafe version of {@link #max_bits_per_min_cu_denom(byte) max_bits_per_min_cu_denom}. */
    public static void nmax_bits_per_min_cu_denom(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265SequenceParameterSetVui.MAX_BITS_PER_MIN_CU_DENOM, value); }
    /** Unsafe version of {@link #log2_max_mv_length_horizontal(byte) log2_max_mv_length_horizontal}. */
    public static void nlog2_max_mv_length_horizontal(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265SequenceParameterSetVui.LOG2_MAX_MV_LENGTH_HORIZONTAL, value); }
    /** Unsafe version of {@link #log2_max_mv_length_vertical(byte) log2_max_mv_length_vertical}. */
    public static void nlog2_max_mv_length_vertical(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265SequenceParameterSetVui.LOG2_MAX_MV_LENGTH_VERTICAL, value); }
    /** Unsafe version of {@link #flags(StdVideoH265SpsVuiFlags) flags}. */
    public static void nflags(long struct, StdVideoH265SpsVuiFlags value) { memCopy(value.address(), struct + StdVideoH265SequenceParameterSetVui.FLAGS, StdVideoH265SpsVuiFlags.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long pHrdParameters = memGetAddress(struct + StdVideoH265SequenceParameterSetVui.PHRDPARAMETERS);
        check(pHrdParameters);
        StdVideoH265HrdParameters.validate(pHrdParameters);
    }

    // -----------------------------------

    /** An array of {@link StdVideoH265SequenceParameterSetVui} structs. */
    public static class Buffer extends StructBuffer<StdVideoH265SequenceParameterSetVui, Buffer> implements NativeResource {

        private static final StdVideoH265SequenceParameterSetVui ELEMENT_FACTORY = StdVideoH265SequenceParameterSetVui.create(-1L);

        /**
         * Creates a new {@code StdVideoH265SequenceParameterSetVui.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoH265SequenceParameterSetVui#SIZEOF}, and its mark will be undefined.
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
        protected StdVideoH265SequenceParameterSetVui getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code aspect_ratio_idc} field. */
        @NativeType("uint8_t")
        public byte aspect_ratio_idc() { return StdVideoH265SequenceParameterSetVui.naspect_ratio_idc(address()); }
        /** @return the value of the {@code sar_width} field. */
        @NativeType("uint16_t")
        public short sar_width() { return StdVideoH265SequenceParameterSetVui.nsar_width(address()); }
        /** @return the value of the {@code sar_height} field. */
        @NativeType("uint16_t")
        public short sar_height() { return StdVideoH265SequenceParameterSetVui.nsar_height(address()); }
        /** @return the value of the {@code video_format} field. */
        @NativeType("uint8_t")
        public byte video_format() { return StdVideoH265SequenceParameterSetVui.nvideo_format(address()); }
        /** @return the value of the {@code colour_primaries} field. */
        @NativeType("uint8_t")
        public byte colour_primaries() { return StdVideoH265SequenceParameterSetVui.ncolour_primaries(address()); }
        /** @return the value of the {@code transfer_characteristics} field. */
        @NativeType("uint8_t")
        public byte transfer_characteristics() { return StdVideoH265SequenceParameterSetVui.ntransfer_characteristics(address()); }
        /** @return the value of the {@code matrix_coeffs} field. */
        @NativeType("uint8_t")
        public byte matrix_coeffs() { return StdVideoH265SequenceParameterSetVui.nmatrix_coeffs(address()); }
        /** @return the value of the {@code chroma_sample_loc_type_top_field} field. */
        @NativeType("uint8_t")
        public byte chroma_sample_loc_type_top_field() { return StdVideoH265SequenceParameterSetVui.nchroma_sample_loc_type_top_field(address()); }
        /** @return the value of the {@code chroma_sample_loc_type_bottom_field} field. */
        @NativeType("uint8_t")
        public byte chroma_sample_loc_type_bottom_field() { return StdVideoH265SequenceParameterSetVui.nchroma_sample_loc_type_bottom_field(address()); }
        /** @return the value of the {@code def_disp_win_left_offset} field. */
        @NativeType("uint16_t")
        public short def_disp_win_left_offset() { return StdVideoH265SequenceParameterSetVui.ndef_disp_win_left_offset(address()); }
        /** @return the value of the {@code def_disp_win_right_offset} field. */
        @NativeType("uint16_t")
        public short def_disp_win_right_offset() { return StdVideoH265SequenceParameterSetVui.ndef_disp_win_right_offset(address()); }
        /** @return the value of the {@code def_disp_win_top_offset} field. */
        @NativeType("uint16_t")
        public short def_disp_win_top_offset() { return StdVideoH265SequenceParameterSetVui.ndef_disp_win_top_offset(address()); }
        /** @return the value of the {@code def_disp_win_bottom_offset} field. */
        @NativeType("uint16_t")
        public short def_disp_win_bottom_offset() { return StdVideoH265SequenceParameterSetVui.ndef_disp_win_bottom_offset(address()); }
        /** @return the value of the {@code vui_num_units_in_tick} field. */
        @NativeType("uint32_t")
        public int vui_num_units_in_tick() { return StdVideoH265SequenceParameterSetVui.nvui_num_units_in_tick(address()); }
        /** @return the value of the {@code vui_time_scale} field. */
        @NativeType("uint32_t")
        public int vui_time_scale() { return StdVideoH265SequenceParameterSetVui.nvui_time_scale(address()); }
        /** @return the value of the {@code vui_num_ticks_poc_diff_one_minus1} field. */
        @NativeType("uint32_t")
        public int vui_num_ticks_poc_diff_one_minus1() { return StdVideoH265SequenceParameterSetVui.nvui_num_ticks_poc_diff_one_minus1(address()); }
        /** @return a {@link StdVideoH265HrdParameters} view of the struct pointed to by the {@code pHrdParameters} field. */
        @NativeType("StdVideoH265HrdParameters *")
        public StdVideoH265HrdParameters pHrdParameters() { return StdVideoH265SequenceParameterSetVui.npHrdParameters(address()); }
        /** @return the value of the {@code min_spatial_segmentation_idc} field. */
        @NativeType("uint16_t")
        public short min_spatial_segmentation_idc() { return StdVideoH265SequenceParameterSetVui.nmin_spatial_segmentation_idc(address()); }
        /** @return the value of the {@code max_bytes_per_pic_denom} field. */
        @NativeType("uint8_t")
        public byte max_bytes_per_pic_denom() { return StdVideoH265SequenceParameterSetVui.nmax_bytes_per_pic_denom(address()); }
        /** @return the value of the {@code max_bits_per_min_cu_denom} field. */
        @NativeType("uint8_t")
        public byte max_bits_per_min_cu_denom() { return StdVideoH265SequenceParameterSetVui.nmax_bits_per_min_cu_denom(address()); }
        /** @return the value of the {@code log2_max_mv_length_horizontal} field. */
        @NativeType("uint8_t")
        public byte log2_max_mv_length_horizontal() { return StdVideoH265SequenceParameterSetVui.nlog2_max_mv_length_horizontal(address()); }
        /** @return the value of the {@code log2_max_mv_length_vertical} field. */
        @NativeType("uint8_t")
        public byte log2_max_mv_length_vertical() { return StdVideoH265SequenceParameterSetVui.nlog2_max_mv_length_vertical(address()); }
        /** @return a {@link StdVideoH265SpsVuiFlags} view of the {@code flags} field. */
        public StdVideoH265SpsVuiFlags flags() { return StdVideoH265SequenceParameterSetVui.nflags(address()); }

        /** Sets the specified value to the {@code aspect_ratio_idc} field. */
        public StdVideoH265SequenceParameterSetVui.Buffer aspect_ratio_idc(@NativeType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.naspect_ratio_idc(address(), value); return this; }
        /** Sets the specified value to the {@code sar_width} field. */
        public StdVideoH265SequenceParameterSetVui.Buffer sar_width(@NativeType("uint16_t") short value) { StdVideoH265SequenceParameterSetVui.nsar_width(address(), value); return this; }
        /** Sets the specified value to the {@code sar_height} field. */
        public StdVideoH265SequenceParameterSetVui.Buffer sar_height(@NativeType("uint16_t") short value) { StdVideoH265SequenceParameterSetVui.nsar_height(address(), value); return this; }
        /** Sets the specified value to the {@code video_format} field. */
        public StdVideoH265SequenceParameterSetVui.Buffer video_format(@NativeType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.nvideo_format(address(), value); return this; }
        /** Sets the specified value to the {@code colour_primaries} field. */
        public StdVideoH265SequenceParameterSetVui.Buffer colour_primaries(@NativeType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.ncolour_primaries(address(), value); return this; }
        /** Sets the specified value to the {@code transfer_characteristics} field. */
        public StdVideoH265SequenceParameterSetVui.Buffer transfer_characteristics(@NativeType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.ntransfer_characteristics(address(), value); return this; }
        /** Sets the specified value to the {@code matrix_coeffs} field. */
        public StdVideoH265SequenceParameterSetVui.Buffer matrix_coeffs(@NativeType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.nmatrix_coeffs(address(), value); return this; }
        /** Sets the specified value to the {@code chroma_sample_loc_type_top_field} field. */
        public StdVideoH265SequenceParameterSetVui.Buffer chroma_sample_loc_type_top_field(@NativeType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.nchroma_sample_loc_type_top_field(address(), value); return this; }
        /** Sets the specified value to the {@code chroma_sample_loc_type_bottom_field} field. */
        public StdVideoH265SequenceParameterSetVui.Buffer chroma_sample_loc_type_bottom_field(@NativeType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.nchroma_sample_loc_type_bottom_field(address(), value); return this; }
        /** Sets the specified value to the {@code def_disp_win_left_offset} field. */
        public StdVideoH265SequenceParameterSetVui.Buffer def_disp_win_left_offset(@NativeType("uint16_t") short value) { StdVideoH265SequenceParameterSetVui.ndef_disp_win_left_offset(address(), value); return this; }
        /** Sets the specified value to the {@code def_disp_win_right_offset} field. */
        public StdVideoH265SequenceParameterSetVui.Buffer def_disp_win_right_offset(@NativeType("uint16_t") short value) { StdVideoH265SequenceParameterSetVui.ndef_disp_win_right_offset(address(), value); return this; }
        /** Sets the specified value to the {@code def_disp_win_top_offset} field. */
        public StdVideoH265SequenceParameterSetVui.Buffer def_disp_win_top_offset(@NativeType("uint16_t") short value) { StdVideoH265SequenceParameterSetVui.ndef_disp_win_top_offset(address(), value); return this; }
        /** Sets the specified value to the {@code def_disp_win_bottom_offset} field. */
        public StdVideoH265SequenceParameterSetVui.Buffer def_disp_win_bottom_offset(@NativeType("uint16_t") short value) { StdVideoH265SequenceParameterSetVui.ndef_disp_win_bottom_offset(address(), value); return this; }
        /** Sets the specified value to the {@code vui_num_units_in_tick} field. */
        public StdVideoH265SequenceParameterSetVui.Buffer vui_num_units_in_tick(@NativeType("uint32_t") int value) { StdVideoH265SequenceParameterSetVui.nvui_num_units_in_tick(address(), value); return this; }
        /** Sets the specified value to the {@code vui_time_scale} field. */
        public StdVideoH265SequenceParameterSetVui.Buffer vui_time_scale(@NativeType("uint32_t") int value) { StdVideoH265SequenceParameterSetVui.nvui_time_scale(address(), value); return this; }
        /** Sets the specified value to the {@code vui_num_ticks_poc_diff_one_minus1} field. */
        public StdVideoH265SequenceParameterSetVui.Buffer vui_num_ticks_poc_diff_one_minus1(@NativeType("uint32_t") int value) { StdVideoH265SequenceParameterSetVui.nvui_num_ticks_poc_diff_one_minus1(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoH265HrdParameters} to the {@code pHrdParameters} field. */
        public StdVideoH265SequenceParameterSetVui.Buffer pHrdParameters(@NativeType("StdVideoH265HrdParameters *") StdVideoH265HrdParameters value) { StdVideoH265SequenceParameterSetVui.npHrdParameters(address(), value); return this; }
        /** Sets the specified value to the {@code min_spatial_segmentation_idc} field. */
        public StdVideoH265SequenceParameterSetVui.Buffer min_spatial_segmentation_idc(@NativeType("uint16_t") short value) { StdVideoH265SequenceParameterSetVui.nmin_spatial_segmentation_idc(address(), value); return this; }
        /** Sets the specified value to the {@code max_bytes_per_pic_denom} field. */
        public StdVideoH265SequenceParameterSetVui.Buffer max_bytes_per_pic_denom(@NativeType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.nmax_bytes_per_pic_denom(address(), value); return this; }
        /** Sets the specified value to the {@code max_bits_per_min_cu_denom} field. */
        public StdVideoH265SequenceParameterSetVui.Buffer max_bits_per_min_cu_denom(@NativeType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.nmax_bits_per_min_cu_denom(address(), value); return this; }
        /** Sets the specified value to the {@code log2_max_mv_length_horizontal} field. */
        public StdVideoH265SequenceParameterSetVui.Buffer log2_max_mv_length_horizontal(@NativeType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.nlog2_max_mv_length_horizontal(address(), value); return this; }
        /** Sets the specified value to the {@code log2_max_mv_length_vertical} field. */
        public StdVideoH265SequenceParameterSetVui.Buffer log2_max_mv_length_vertical(@NativeType("uint8_t") byte value) { StdVideoH265SequenceParameterSetVui.nlog2_max_mv_length_vertical(address(), value); return this; }
        /** Copies the specified {@link StdVideoH265SpsVuiFlags} to the {@code flags} field. */
        public StdVideoH265SequenceParameterSetVui.Buffer flags(StdVideoH265SpsVuiFlags value) { StdVideoH265SequenceParameterSetVui.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoH265SequenceParameterSetVui.Buffer flags(java.util.function.Consumer<StdVideoH265SpsVuiFlags> consumer) { consumer.accept(flags()); return this; }

    }

}