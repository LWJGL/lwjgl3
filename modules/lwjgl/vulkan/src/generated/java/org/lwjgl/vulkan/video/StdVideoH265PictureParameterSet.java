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
 * struct StdVideoH265PictureParameterSet {
 *     uint8_t pps_pic_parameter_set_id;
 *     uint8_t pps_seq_parameter_set_id;
 *     uint8_t num_extra_slice_header_bits;
 *     uint8_t num_ref_idx_l0_default_active_minus1;
 *     uint8_t num_ref_idx_l1_default_active_minus1;
 *     int8_t init_qp_minus26;
 *     uint8_t diff_cu_qp_delta_depth;
 *     int8_t pps_cb_qp_offset;
 *     int8_t pps_cr_qp_offset;
 *     uint8_t num_tile_columns_minus1;
 *     uint8_t num_tile_rows_minus1;
 *     uint16_t column_width_minus1[STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_COLS_LIST_SIZE];
 *     uint16_t row_height_minus1[STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_ROWS_LIST_SIZE];
 *     int8_t pps_beta_offset_div2;
 *     int8_t pps_tc_offset_div2;
 *     uint8_t log2_parallel_merge_level_minus2;
 *     {@link StdVideoH265PpsFlags StdVideoH265PpsFlags} flags;
 *     {@link StdVideoH265ScalingLists StdVideoH265ScalingLists} * {@link #pScalingLists};
 *     uint8_t {@link #log2_max_transform_skip_block_size_minus2};
 *     uint8_t diff_cu_chroma_qp_offset_depth;
 *     uint8_t chroma_qp_offset_list_len_minus1;
 *     int8_t cb_qp_offset_list[STD_VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE];
 *     int8_t cr_qp_offset_list[STD_VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE];
 *     uint8_t log2_sao_offset_scale_luma;
 *     uint8_t log2_sao_offset_scale_chroma;
 *     int8_t {@link #pps_act_y_qp_offset_plus5};
 *     int8_t pps_act_cb_qp_offset_plus5;
 *     int8_t pps_act_cr_qp_offset_plus5;
 *     uint8_t pps_num_palette_predictor_initializer;
 *     uint8_t luma_bit_depth_entry_minus8;
 *     uint8_t chroma_bit_depth_entry_minus8;
 *     {@link StdVideoH265PredictorPaletteEntries StdVideoH265PredictorPaletteEntries} * {@link #pPredictorPaletteEntries};
 * }</code></pre>
 */
public class StdVideoH265PictureParameterSet extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PPS_PIC_PARAMETER_SET_ID,
        PPS_SEQ_PARAMETER_SET_ID,
        NUM_EXTRA_SLICE_HEADER_BITS,
        NUM_REF_IDX_L0_DEFAULT_ACTIVE_MINUS1,
        NUM_REF_IDX_L1_DEFAULT_ACTIVE_MINUS1,
        INIT_QP_MINUS26,
        DIFF_CU_QP_DELTA_DEPTH,
        PPS_CB_QP_OFFSET,
        PPS_CR_QP_OFFSET,
        NUM_TILE_COLUMNS_MINUS1,
        NUM_TILE_ROWS_MINUS1,
        COLUMN_WIDTH_MINUS1,
        ROW_HEIGHT_MINUS1,
        PPS_BETA_OFFSET_DIV2,
        PPS_TC_OFFSET_DIV2,
        LOG2_PARALLEL_MERGE_LEVEL_MINUS2,
        FLAGS,
        PSCALINGLISTS,
        LOG2_MAX_TRANSFORM_SKIP_BLOCK_SIZE_MINUS2,
        DIFF_CU_CHROMA_QP_OFFSET_DEPTH,
        CHROMA_QP_OFFSET_LIST_LEN_MINUS1,
        CB_QP_OFFSET_LIST,
        CR_QP_OFFSET_LIST,
        LOG2_SAO_OFFSET_SCALE_LUMA,
        LOG2_SAO_OFFSET_SCALE_CHROMA,
        PPS_ACT_Y_QP_OFFSET_PLUS5,
        PPS_ACT_CB_QP_OFFSET_PLUS5,
        PPS_ACT_CR_QP_OFFSET_PLUS5,
        PPS_NUM_PALETTE_PREDICTOR_INITIALIZER,
        LUMA_BIT_DEPTH_ENTRY_MINUS8,
        CHROMA_BIT_DEPTH_ENTRY_MINUS8,
        PPREDICTORPALETTEENTRIES;

    static {
        Layout layout = __struct(
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __array(2, STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_COLS_LIST_SIZE),
            __array(2, STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_ROWS_LIST_SIZE),
            __member(1),
            __member(1),
            __member(1),
            __member(StdVideoH265PpsFlags.SIZEOF, StdVideoH265PpsFlags.ALIGNOF),
            __member(POINTER_SIZE),
            __member(1),
            __member(1),
            __member(1),
            __array(1, STD_VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE),
            __array(1, STD_VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PPS_PIC_PARAMETER_SET_ID = layout.offsetof(0);
        PPS_SEQ_PARAMETER_SET_ID = layout.offsetof(1);
        NUM_EXTRA_SLICE_HEADER_BITS = layout.offsetof(2);
        NUM_REF_IDX_L0_DEFAULT_ACTIVE_MINUS1 = layout.offsetof(3);
        NUM_REF_IDX_L1_DEFAULT_ACTIVE_MINUS1 = layout.offsetof(4);
        INIT_QP_MINUS26 = layout.offsetof(5);
        DIFF_CU_QP_DELTA_DEPTH = layout.offsetof(6);
        PPS_CB_QP_OFFSET = layout.offsetof(7);
        PPS_CR_QP_OFFSET = layout.offsetof(8);
        NUM_TILE_COLUMNS_MINUS1 = layout.offsetof(9);
        NUM_TILE_ROWS_MINUS1 = layout.offsetof(10);
        COLUMN_WIDTH_MINUS1 = layout.offsetof(11);
        ROW_HEIGHT_MINUS1 = layout.offsetof(12);
        PPS_BETA_OFFSET_DIV2 = layout.offsetof(13);
        PPS_TC_OFFSET_DIV2 = layout.offsetof(14);
        LOG2_PARALLEL_MERGE_LEVEL_MINUS2 = layout.offsetof(15);
        FLAGS = layout.offsetof(16);
        PSCALINGLISTS = layout.offsetof(17);
        LOG2_MAX_TRANSFORM_SKIP_BLOCK_SIZE_MINUS2 = layout.offsetof(18);
        DIFF_CU_CHROMA_QP_OFFSET_DEPTH = layout.offsetof(19);
        CHROMA_QP_OFFSET_LIST_LEN_MINUS1 = layout.offsetof(20);
        CB_QP_OFFSET_LIST = layout.offsetof(21);
        CR_QP_OFFSET_LIST = layout.offsetof(22);
        LOG2_SAO_OFFSET_SCALE_LUMA = layout.offsetof(23);
        LOG2_SAO_OFFSET_SCALE_CHROMA = layout.offsetof(24);
        PPS_ACT_Y_QP_OFFSET_PLUS5 = layout.offsetof(25);
        PPS_ACT_CB_QP_OFFSET_PLUS5 = layout.offsetof(26);
        PPS_ACT_CR_QP_OFFSET_PLUS5 = layout.offsetof(27);
        PPS_NUM_PALETTE_PREDICTOR_INITIALIZER = layout.offsetof(28);
        LUMA_BIT_DEPTH_ENTRY_MINUS8 = layout.offsetof(29);
        CHROMA_BIT_DEPTH_ENTRY_MINUS8 = layout.offsetof(30);
        PPREDICTORPALETTEENTRIES = layout.offsetof(31);
    }

    /**
     * Creates a {@code StdVideoH265PictureParameterSet} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public StdVideoH265PictureParameterSet(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code pps_pic_parameter_set_id} field. */
    @NativeType("uint8_t")
    public byte pps_pic_parameter_set_id() { return npps_pic_parameter_set_id(address()); }
    /** @return the value of the {@code pps_seq_parameter_set_id} field. */
    @NativeType("uint8_t")
    public byte pps_seq_parameter_set_id() { return npps_seq_parameter_set_id(address()); }
    /** @return the value of the {@code num_extra_slice_header_bits} field. */
    @NativeType("uint8_t")
    public byte num_extra_slice_header_bits() { return nnum_extra_slice_header_bits(address()); }
    /** @return the value of the {@code num_ref_idx_l0_default_active_minus1} field. */
    @NativeType("uint8_t")
    public byte num_ref_idx_l0_default_active_minus1() { return nnum_ref_idx_l0_default_active_minus1(address()); }
    /** @return the value of the {@code num_ref_idx_l1_default_active_minus1} field. */
    @NativeType("uint8_t")
    public byte num_ref_idx_l1_default_active_minus1() { return nnum_ref_idx_l1_default_active_minus1(address()); }
    /** @return the value of the {@code init_qp_minus26} field. */
    @NativeType("int8_t")
    public byte init_qp_minus26() { return ninit_qp_minus26(address()); }
    /** @return the value of the {@code diff_cu_qp_delta_depth} field. */
    @NativeType("uint8_t")
    public byte diff_cu_qp_delta_depth() { return ndiff_cu_qp_delta_depth(address()); }
    /** @return the value of the {@code pps_cb_qp_offset} field. */
    @NativeType("int8_t")
    public byte pps_cb_qp_offset() { return npps_cb_qp_offset(address()); }
    /** @return the value of the {@code pps_cr_qp_offset} field. */
    @NativeType("int8_t")
    public byte pps_cr_qp_offset() { return npps_cr_qp_offset(address()); }
    /** @return the value of the {@code num_tile_columns_minus1} field. */
    @NativeType("uint8_t")
    public byte num_tile_columns_minus1() { return nnum_tile_columns_minus1(address()); }
    /** @return the value of the {@code num_tile_rows_minus1} field. */
    @NativeType("uint8_t")
    public byte num_tile_rows_minus1() { return nnum_tile_rows_minus1(address()); }
    /** @return a {@link ShortBuffer} view of the {@code column_width_minus1} field. */
    @NativeType("uint16_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_COLS_LIST_SIZE]")
    public ShortBuffer column_width_minus1() { return ncolumn_width_minus1(address()); }
    /** @return the value at the specified index of the {@code column_width_minus1} field. */
    @NativeType("uint16_t")
    public short column_width_minus1(int index) { return ncolumn_width_minus1(address(), index); }
    /** @return a {@link ShortBuffer} view of the {@code row_height_minus1} field. */
    @NativeType("uint16_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_ROWS_LIST_SIZE]")
    public ShortBuffer row_height_minus1() { return nrow_height_minus1(address()); }
    /** @return the value at the specified index of the {@code row_height_minus1} field. */
    @NativeType("uint16_t")
    public short row_height_minus1(int index) { return nrow_height_minus1(address(), index); }
    /** @return the value of the {@code pps_beta_offset_div2} field. */
    @NativeType("int8_t")
    public byte pps_beta_offset_div2() { return npps_beta_offset_div2(address()); }
    /** @return the value of the {@code pps_tc_offset_div2} field. */
    @NativeType("int8_t")
    public byte pps_tc_offset_div2() { return npps_tc_offset_div2(address()); }
    /** @return the value of the {@code log2_parallel_merge_level_minus2} field. */
    @NativeType("uint8_t")
    public byte log2_parallel_merge_level_minus2() { return nlog2_parallel_merge_level_minus2(address()); }
    /** @return a {@link StdVideoH265PpsFlags} view of the {@code flags} field. */
    public StdVideoH265PpsFlags flags() { return nflags(address()); }
    /** must be a valid pointer if {@code pps_scaling_list_data_present_flag} is set */
    @NativeType("StdVideoH265ScalingLists *")
    public StdVideoH265ScalingLists pScalingLists() { return npScalingLists(address()); }
    /** extension PPS, valid when {@link STDVulkanVideoCodecH265#STD_VIDEO_H265_PROFILE_IDC_FORMAT_RANGE_EXTENSIONS VIDEO_H265_PROFILE_IDC_FORMAT_RANGE_EXTENSIONS} is set */
    @NativeType("uint8_t")
    public byte log2_max_transform_skip_block_size_minus2() { return nlog2_max_transform_skip_block_size_minus2(address()); }
    /** @return the value of the {@code diff_cu_chroma_qp_offset_depth} field. */
    @NativeType("uint8_t")
    public byte diff_cu_chroma_qp_offset_depth() { return ndiff_cu_chroma_qp_offset_depth(address()); }
    /** @return the value of the {@code chroma_qp_offset_list_len_minus1} field. */
    @NativeType("uint8_t")
    public byte chroma_qp_offset_list_len_minus1() { return nchroma_qp_offset_list_len_minus1(address()); }
    /** @return a {@link ByteBuffer} view of the {@code cb_qp_offset_list} field. */
    @NativeType("int8_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE]")
    public ByteBuffer cb_qp_offset_list() { return ncb_qp_offset_list(address()); }
    /** @return the value at the specified index of the {@code cb_qp_offset_list} field. */
    @NativeType("int8_t")
    public byte cb_qp_offset_list(int index) { return ncb_qp_offset_list(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code cr_qp_offset_list} field. */
    @NativeType("int8_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE]")
    public ByteBuffer cr_qp_offset_list() { return ncr_qp_offset_list(address()); }
    /** @return the value at the specified index of the {@code cr_qp_offset_list} field. */
    @NativeType("int8_t")
    public byte cr_qp_offset_list(int index) { return ncr_qp_offset_list(address(), index); }
    /** @return the value of the {@code log2_sao_offset_scale_luma} field. */
    @NativeType("uint8_t")
    public byte log2_sao_offset_scale_luma() { return nlog2_sao_offset_scale_luma(address()); }
    /** @return the value of the {@code log2_sao_offset_scale_chroma} field. */
    @NativeType("uint8_t")
    public byte log2_sao_offset_scale_chroma() { return nlog2_sao_offset_scale_chroma(address()); }
    /** extension PPS, valid when std_video_h265_profile_idc_scc_extensions is set */
    @NativeType("int8_t")
    public byte pps_act_y_qp_offset_plus5() { return npps_act_y_qp_offset_plus5(address()); }
    /** @return the value of the {@code pps_act_cb_qp_offset_plus5} field. */
    @NativeType("int8_t")
    public byte pps_act_cb_qp_offset_plus5() { return npps_act_cb_qp_offset_plus5(address()); }
    /** @return the value of the {@code pps_act_cr_qp_offset_plus5} field. */
    @NativeType("int8_t")
    public byte pps_act_cr_qp_offset_plus5() { return npps_act_cr_qp_offset_plus5(address()); }
    /** @return the value of the {@code pps_num_palette_predictor_initializer} field. */
    @NativeType("uint8_t")
    public byte pps_num_palette_predictor_initializer() { return npps_num_palette_predictor_initializer(address()); }
    /** @return the value of the {@code luma_bit_depth_entry_minus8} field. */
    @NativeType("uint8_t")
    public byte luma_bit_depth_entry_minus8() { return nluma_bit_depth_entry_minus8(address()); }
    /** @return the value of the {@code chroma_bit_depth_entry_minus8} field. */
    @NativeType("uint8_t")
    public byte chroma_bit_depth_entry_minus8() { return nchroma_bit_depth_entry_minus8(address()); }
    /** must be a valid pointer if pps_palette_predictor_initializer_present_flag is set */
    @NativeType("StdVideoH265PredictorPaletteEntries *")
    public StdVideoH265PredictorPaletteEntries pPredictorPaletteEntries() { return npPredictorPaletteEntries(address()); }

    /** Sets the specified value to the {@code pps_pic_parameter_set_id} field. */
    public StdVideoH265PictureParameterSet pps_pic_parameter_set_id(@NativeType("uint8_t") byte value) { npps_pic_parameter_set_id(address(), value); return this; }
    /** Sets the specified value to the {@code pps_seq_parameter_set_id} field. */
    public StdVideoH265PictureParameterSet pps_seq_parameter_set_id(@NativeType("uint8_t") byte value) { npps_seq_parameter_set_id(address(), value); return this; }
    /** Sets the specified value to the {@code num_extra_slice_header_bits} field. */
    public StdVideoH265PictureParameterSet num_extra_slice_header_bits(@NativeType("uint8_t") byte value) { nnum_extra_slice_header_bits(address(), value); return this; }
    /** Sets the specified value to the {@code num_ref_idx_l0_default_active_minus1} field. */
    public StdVideoH265PictureParameterSet num_ref_idx_l0_default_active_minus1(@NativeType("uint8_t") byte value) { nnum_ref_idx_l0_default_active_minus1(address(), value); return this; }
    /** Sets the specified value to the {@code num_ref_idx_l1_default_active_minus1} field. */
    public StdVideoH265PictureParameterSet num_ref_idx_l1_default_active_minus1(@NativeType("uint8_t") byte value) { nnum_ref_idx_l1_default_active_minus1(address(), value); return this; }
    /** Sets the specified value to the {@code init_qp_minus26} field. */
    public StdVideoH265PictureParameterSet init_qp_minus26(@NativeType("int8_t") byte value) { ninit_qp_minus26(address(), value); return this; }
    /** Sets the specified value to the {@code diff_cu_qp_delta_depth} field. */
    public StdVideoH265PictureParameterSet diff_cu_qp_delta_depth(@NativeType("uint8_t") byte value) { ndiff_cu_qp_delta_depth(address(), value); return this; }
    /** Sets the specified value to the {@code pps_cb_qp_offset} field. */
    public StdVideoH265PictureParameterSet pps_cb_qp_offset(@NativeType("int8_t") byte value) { npps_cb_qp_offset(address(), value); return this; }
    /** Sets the specified value to the {@code pps_cr_qp_offset} field. */
    public StdVideoH265PictureParameterSet pps_cr_qp_offset(@NativeType("int8_t") byte value) { npps_cr_qp_offset(address(), value); return this; }
    /** Sets the specified value to the {@code num_tile_columns_minus1} field. */
    public StdVideoH265PictureParameterSet num_tile_columns_minus1(@NativeType("uint8_t") byte value) { nnum_tile_columns_minus1(address(), value); return this; }
    /** Sets the specified value to the {@code num_tile_rows_minus1} field. */
    public StdVideoH265PictureParameterSet num_tile_rows_minus1(@NativeType("uint8_t") byte value) { nnum_tile_rows_minus1(address(), value); return this; }
    /** Copies the specified {@link ShortBuffer} to the {@code column_width_minus1} field. */
    public StdVideoH265PictureParameterSet column_width_minus1(@NativeType("uint16_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_COLS_LIST_SIZE]") ShortBuffer value) { ncolumn_width_minus1(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code column_width_minus1} field. */
    public StdVideoH265PictureParameterSet column_width_minus1(int index, @NativeType("uint16_t") short value) { ncolumn_width_minus1(address(), index, value); return this; }
    /** Copies the specified {@link ShortBuffer} to the {@code row_height_minus1} field. */
    public StdVideoH265PictureParameterSet row_height_minus1(@NativeType("uint16_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_ROWS_LIST_SIZE]") ShortBuffer value) { nrow_height_minus1(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code row_height_minus1} field. */
    public StdVideoH265PictureParameterSet row_height_minus1(int index, @NativeType("uint16_t") short value) { nrow_height_minus1(address(), index, value); return this; }
    /** Sets the specified value to the {@code pps_beta_offset_div2} field. */
    public StdVideoH265PictureParameterSet pps_beta_offset_div2(@NativeType("int8_t") byte value) { npps_beta_offset_div2(address(), value); return this; }
    /** Sets the specified value to the {@code pps_tc_offset_div2} field. */
    public StdVideoH265PictureParameterSet pps_tc_offset_div2(@NativeType("int8_t") byte value) { npps_tc_offset_div2(address(), value); return this; }
    /** Sets the specified value to the {@code log2_parallel_merge_level_minus2} field. */
    public StdVideoH265PictureParameterSet log2_parallel_merge_level_minus2(@NativeType("uint8_t") byte value) { nlog2_parallel_merge_level_minus2(address(), value); return this; }
    /** Copies the specified {@link StdVideoH265PpsFlags} to the {@code flags} field. */
    public StdVideoH265PictureParameterSet flags(StdVideoH265PpsFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public StdVideoH265PictureParameterSet flags(java.util.function.Consumer<StdVideoH265PpsFlags> consumer) { consumer.accept(flags()); return this; }
    /** Sets the address of the specified {@link StdVideoH265ScalingLists} to the {@link #pScalingLists} field. */
    public StdVideoH265PictureParameterSet pScalingLists(@NativeType("StdVideoH265ScalingLists *") StdVideoH265ScalingLists value) { npScalingLists(address(), value); return this; }
    /** Sets the specified value to the {@link #log2_max_transform_skip_block_size_minus2} field. */
    public StdVideoH265PictureParameterSet log2_max_transform_skip_block_size_minus2(@NativeType("uint8_t") byte value) { nlog2_max_transform_skip_block_size_minus2(address(), value); return this; }
    /** Sets the specified value to the {@code diff_cu_chroma_qp_offset_depth} field. */
    public StdVideoH265PictureParameterSet diff_cu_chroma_qp_offset_depth(@NativeType("uint8_t") byte value) { ndiff_cu_chroma_qp_offset_depth(address(), value); return this; }
    /** Sets the specified value to the {@code chroma_qp_offset_list_len_minus1} field. */
    public StdVideoH265PictureParameterSet chroma_qp_offset_list_len_minus1(@NativeType("uint8_t") byte value) { nchroma_qp_offset_list_len_minus1(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code cb_qp_offset_list} field. */
    public StdVideoH265PictureParameterSet cb_qp_offset_list(@NativeType("int8_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE]") ByteBuffer value) { ncb_qp_offset_list(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code cb_qp_offset_list} field. */
    public StdVideoH265PictureParameterSet cb_qp_offset_list(int index, @NativeType("int8_t") byte value) { ncb_qp_offset_list(address(), index, value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code cr_qp_offset_list} field. */
    public StdVideoH265PictureParameterSet cr_qp_offset_list(@NativeType("int8_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE]") ByteBuffer value) { ncr_qp_offset_list(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code cr_qp_offset_list} field. */
    public StdVideoH265PictureParameterSet cr_qp_offset_list(int index, @NativeType("int8_t") byte value) { ncr_qp_offset_list(address(), index, value); return this; }
    /** Sets the specified value to the {@code log2_sao_offset_scale_luma} field. */
    public StdVideoH265PictureParameterSet log2_sao_offset_scale_luma(@NativeType("uint8_t") byte value) { nlog2_sao_offset_scale_luma(address(), value); return this; }
    /** Sets the specified value to the {@code log2_sao_offset_scale_chroma} field. */
    public StdVideoH265PictureParameterSet log2_sao_offset_scale_chroma(@NativeType("uint8_t") byte value) { nlog2_sao_offset_scale_chroma(address(), value); return this; }
    /** Sets the specified value to the {@link #pps_act_y_qp_offset_plus5} field. */
    public StdVideoH265PictureParameterSet pps_act_y_qp_offset_plus5(@NativeType("int8_t") byte value) { npps_act_y_qp_offset_plus5(address(), value); return this; }
    /** Sets the specified value to the {@code pps_act_cb_qp_offset_plus5} field. */
    public StdVideoH265PictureParameterSet pps_act_cb_qp_offset_plus5(@NativeType("int8_t") byte value) { npps_act_cb_qp_offset_plus5(address(), value); return this; }
    /** Sets the specified value to the {@code pps_act_cr_qp_offset_plus5} field. */
    public StdVideoH265PictureParameterSet pps_act_cr_qp_offset_plus5(@NativeType("int8_t") byte value) { npps_act_cr_qp_offset_plus5(address(), value); return this; }
    /** Sets the specified value to the {@code pps_num_palette_predictor_initializer} field. */
    public StdVideoH265PictureParameterSet pps_num_palette_predictor_initializer(@NativeType("uint8_t") byte value) { npps_num_palette_predictor_initializer(address(), value); return this; }
    /** Sets the specified value to the {@code luma_bit_depth_entry_minus8} field. */
    public StdVideoH265PictureParameterSet luma_bit_depth_entry_minus8(@NativeType("uint8_t") byte value) { nluma_bit_depth_entry_minus8(address(), value); return this; }
    /** Sets the specified value to the {@code chroma_bit_depth_entry_minus8} field. */
    public StdVideoH265PictureParameterSet chroma_bit_depth_entry_minus8(@NativeType("uint8_t") byte value) { nchroma_bit_depth_entry_minus8(address(), value); return this; }
    /** Sets the address of the specified {@link StdVideoH265PredictorPaletteEntries} to the {@link #pPredictorPaletteEntries} field. */
    public StdVideoH265PictureParameterSet pPredictorPaletteEntries(@NativeType("StdVideoH265PredictorPaletteEntries *") StdVideoH265PredictorPaletteEntries value) { npPredictorPaletteEntries(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public StdVideoH265PictureParameterSet set(
        byte pps_pic_parameter_set_id,
        byte pps_seq_parameter_set_id,
        byte num_extra_slice_header_bits,
        byte num_ref_idx_l0_default_active_minus1,
        byte num_ref_idx_l1_default_active_minus1,
        byte init_qp_minus26,
        byte diff_cu_qp_delta_depth,
        byte pps_cb_qp_offset,
        byte pps_cr_qp_offset,
        byte num_tile_columns_minus1,
        byte num_tile_rows_minus1,
        ShortBuffer column_width_minus1,
        ShortBuffer row_height_minus1,
        byte pps_beta_offset_div2,
        byte pps_tc_offset_div2,
        byte log2_parallel_merge_level_minus2,
        StdVideoH265PpsFlags flags,
        StdVideoH265ScalingLists pScalingLists,
        byte log2_max_transform_skip_block_size_minus2,
        byte diff_cu_chroma_qp_offset_depth,
        byte chroma_qp_offset_list_len_minus1,
        ByteBuffer cb_qp_offset_list,
        ByteBuffer cr_qp_offset_list,
        byte log2_sao_offset_scale_luma,
        byte log2_sao_offset_scale_chroma,
        byte pps_act_y_qp_offset_plus5,
        byte pps_act_cb_qp_offset_plus5,
        byte pps_act_cr_qp_offset_plus5,
        byte pps_num_palette_predictor_initializer,
        byte luma_bit_depth_entry_minus8,
        byte chroma_bit_depth_entry_minus8,
        StdVideoH265PredictorPaletteEntries pPredictorPaletteEntries
    ) {
        pps_pic_parameter_set_id(pps_pic_parameter_set_id);
        pps_seq_parameter_set_id(pps_seq_parameter_set_id);
        num_extra_slice_header_bits(num_extra_slice_header_bits);
        num_ref_idx_l0_default_active_minus1(num_ref_idx_l0_default_active_minus1);
        num_ref_idx_l1_default_active_minus1(num_ref_idx_l1_default_active_minus1);
        init_qp_minus26(init_qp_minus26);
        diff_cu_qp_delta_depth(diff_cu_qp_delta_depth);
        pps_cb_qp_offset(pps_cb_qp_offset);
        pps_cr_qp_offset(pps_cr_qp_offset);
        num_tile_columns_minus1(num_tile_columns_minus1);
        num_tile_rows_minus1(num_tile_rows_minus1);
        column_width_minus1(column_width_minus1);
        row_height_minus1(row_height_minus1);
        pps_beta_offset_div2(pps_beta_offset_div2);
        pps_tc_offset_div2(pps_tc_offset_div2);
        log2_parallel_merge_level_minus2(log2_parallel_merge_level_minus2);
        flags(flags);
        pScalingLists(pScalingLists);
        log2_max_transform_skip_block_size_minus2(log2_max_transform_skip_block_size_minus2);
        diff_cu_chroma_qp_offset_depth(diff_cu_chroma_qp_offset_depth);
        chroma_qp_offset_list_len_minus1(chroma_qp_offset_list_len_minus1);
        cb_qp_offset_list(cb_qp_offset_list);
        cr_qp_offset_list(cr_qp_offset_list);
        log2_sao_offset_scale_luma(log2_sao_offset_scale_luma);
        log2_sao_offset_scale_chroma(log2_sao_offset_scale_chroma);
        pps_act_y_qp_offset_plus5(pps_act_y_qp_offset_plus5);
        pps_act_cb_qp_offset_plus5(pps_act_cb_qp_offset_plus5);
        pps_act_cr_qp_offset_plus5(pps_act_cr_qp_offset_plus5);
        pps_num_palette_predictor_initializer(pps_num_palette_predictor_initializer);
        luma_bit_depth_entry_minus8(luma_bit_depth_entry_minus8);
        chroma_bit_depth_entry_minus8(chroma_bit_depth_entry_minus8);
        pPredictorPaletteEntries(pPredictorPaletteEntries);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public StdVideoH265PictureParameterSet set(StdVideoH265PictureParameterSet src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code StdVideoH265PictureParameterSet} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static StdVideoH265PictureParameterSet malloc() {
        return wrap(StdVideoH265PictureParameterSet.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code StdVideoH265PictureParameterSet} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static StdVideoH265PictureParameterSet calloc() {
        return wrap(StdVideoH265PictureParameterSet.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code StdVideoH265PictureParameterSet} instance allocated with {@link BufferUtils}. */
    public static StdVideoH265PictureParameterSet create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(StdVideoH265PictureParameterSet.class, memAddress(container), container);
    }

    /** Returns a new {@code StdVideoH265PictureParameterSet} instance for the specified memory address. */
    public static StdVideoH265PictureParameterSet create(long address) {
        return wrap(StdVideoH265PictureParameterSet.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH265PictureParameterSet createSafe(long address) {
        return address == NULL ? null : wrap(StdVideoH265PictureParameterSet.class, address);
    }

    /**
     * Returns a new {@link StdVideoH265PictureParameterSet.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265PictureParameterSet.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265PictureParameterSet.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265PictureParameterSet.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265PictureParameterSet.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static StdVideoH265PictureParameterSet.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link StdVideoH265PictureParameterSet.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static StdVideoH265PictureParameterSet.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static StdVideoH265PictureParameterSet.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code StdVideoH265PictureParameterSet} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH265PictureParameterSet malloc(MemoryStack stack) {
        return wrap(StdVideoH265PictureParameterSet.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code StdVideoH265PictureParameterSet} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static StdVideoH265PictureParameterSet calloc(MemoryStack stack) {
        return wrap(StdVideoH265PictureParameterSet.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link StdVideoH265PictureParameterSet.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH265PictureParameterSet.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link StdVideoH265PictureParameterSet.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static StdVideoH265PictureParameterSet.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #pps_pic_parameter_set_id}. */
    public static byte npps_pic_parameter_set_id(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265PictureParameterSet.PPS_PIC_PARAMETER_SET_ID); }
    /** Unsafe version of {@link #pps_seq_parameter_set_id}. */
    public static byte npps_seq_parameter_set_id(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265PictureParameterSet.PPS_SEQ_PARAMETER_SET_ID); }
    /** Unsafe version of {@link #num_extra_slice_header_bits}. */
    public static byte nnum_extra_slice_header_bits(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265PictureParameterSet.NUM_EXTRA_SLICE_HEADER_BITS); }
    /** Unsafe version of {@link #num_ref_idx_l0_default_active_minus1}. */
    public static byte nnum_ref_idx_l0_default_active_minus1(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265PictureParameterSet.NUM_REF_IDX_L0_DEFAULT_ACTIVE_MINUS1); }
    /** Unsafe version of {@link #num_ref_idx_l1_default_active_minus1}. */
    public static byte nnum_ref_idx_l1_default_active_minus1(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265PictureParameterSet.NUM_REF_IDX_L1_DEFAULT_ACTIVE_MINUS1); }
    /** Unsafe version of {@link #init_qp_minus26}. */
    public static byte ninit_qp_minus26(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265PictureParameterSet.INIT_QP_MINUS26); }
    /** Unsafe version of {@link #diff_cu_qp_delta_depth}. */
    public static byte ndiff_cu_qp_delta_depth(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265PictureParameterSet.DIFF_CU_QP_DELTA_DEPTH); }
    /** Unsafe version of {@link #pps_cb_qp_offset}. */
    public static byte npps_cb_qp_offset(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265PictureParameterSet.PPS_CB_QP_OFFSET); }
    /** Unsafe version of {@link #pps_cr_qp_offset}. */
    public static byte npps_cr_qp_offset(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265PictureParameterSet.PPS_CR_QP_OFFSET); }
    /** Unsafe version of {@link #num_tile_columns_minus1}. */
    public static byte nnum_tile_columns_minus1(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265PictureParameterSet.NUM_TILE_COLUMNS_MINUS1); }
    /** Unsafe version of {@link #num_tile_rows_minus1}. */
    public static byte nnum_tile_rows_minus1(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265PictureParameterSet.NUM_TILE_ROWS_MINUS1); }
    /** Unsafe version of {@link #column_width_minus1}. */
    public static ShortBuffer ncolumn_width_minus1(long struct) { return memShortBuffer(struct + StdVideoH265PictureParameterSet.COLUMN_WIDTH_MINUS1, STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_COLS_LIST_SIZE); }
    /** Unsafe version of {@link #column_width_minus1(int) column_width_minus1}. */
    public static short ncolumn_width_minus1(long struct, int index) {
        return UNSAFE.getShort(null, struct + StdVideoH265PictureParameterSet.COLUMN_WIDTH_MINUS1 + check(index, STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_COLS_LIST_SIZE) * 2);
    }
    /** Unsafe version of {@link #row_height_minus1}. */
    public static ShortBuffer nrow_height_minus1(long struct) { return memShortBuffer(struct + StdVideoH265PictureParameterSet.ROW_HEIGHT_MINUS1, STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_ROWS_LIST_SIZE); }
    /** Unsafe version of {@link #row_height_minus1(int) row_height_minus1}. */
    public static short nrow_height_minus1(long struct, int index) {
        return UNSAFE.getShort(null, struct + StdVideoH265PictureParameterSet.ROW_HEIGHT_MINUS1 + check(index, STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_ROWS_LIST_SIZE) * 2);
    }
    /** Unsafe version of {@link #pps_beta_offset_div2}. */
    public static byte npps_beta_offset_div2(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265PictureParameterSet.PPS_BETA_OFFSET_DIV2); }
    /** Unsafe version of {@link #pps_tc_offset_div2}. */
    public static byte npps_tc_offset_div2(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265PictureParameterSet.PPS_TC_OFFSET_DIV2); }
    /** Unsafe version of {@link #log2_parallel_merge_level_minus2}. */
    public static byte nlog2_parallel_merge_level_minus2(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265PictureParameterSet.LOG2_PARALLEL_MERGE_LEVEL_MINUS2); }
    /** Unsafe version of {@link #flags}. */
    public static StdVideoH265PpsFlags nflags(long struct) { return StdVideoH265PpsFlags.create(struct + StdVideoH265PictureParameterSet.FLAGS); }
    /** Unsafe version of {@link #pScalingLists}. */
    public static StdVideoH265ScalingLists npScalingLists(long struct) { return StdVideoH265ScalingLists.create(memGetAddress(struct + StdVideoH265PictureParameterSet.PSCALINGLISTS)); }
    /** Unsafe version of {@link #log2_max_transform_skip_block_size_minus2}. */
    public static byte nlog2_max_transform_skip_block_size_minus2(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265PictureParameterSet.LOG2_MAX_TRANSFORM_SKIP_BLOCK_SIZE_MINUS2); }
    /** Unsafe version of {@link #diff_cu_chroma_qp_offset_depth}. */
    public static byte ndiff_cu_chroma_qp_offset_depth(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265PictureParameterSet.DIFF_CU_CHROMA_QP_OFFSET_DEPTH); }
    /** Unsafe version of {@link #chroma_qp_offset_list_len_minus1}. */
    public static byte nchroma_qp_offset_list_len_minus1(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265PictureParameterSet.CHROMA_QP_OFFSET_LIST_LEN_MINUS1); }
    /** Unsafe version of {@link #cb_qp_offset_list}. */
    public static ByteBuffer ncb_qp_offset_list(long struct) { return memByteBuffer(struct + StdVideoH265PictureParameterSet.CB_QP_OFFSET_LIST, STD_VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE); }
    /** Unsafe version of {@link #cb_qp_offset_list(int) cb_qp_offset_list}. */
    public static byte ncb_qp_offset_list(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoH265PictureParameterSet.CB_QP_OFFSET_LIST + check(index, STD_VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE) * 1);
    }
    /** Unsafe version of {@link #cr_qp_offset_list}. */
    public static ByteBuffer ncr_qp_offset_list(long struct) { return memByteBuffer(struct + StdVideoH265PictureParameterSet.CR_QP_OFFSET_LIST, STD_VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE); }
    /** Unsafe version of {@link #cr_qp_offset_list(int) cr_qp_offset_list}. */
    public static byte ncr_qp_offset_list(long struct, int index) {
        return UNSAFE.getByte(null, struct + StdVideoH265PictureParameterSet.CR_QP_OFFSET_LIST + check(index, STD_VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE) * 1);
    }
    /** Unsafe version of {@link #log2_sao_offset_scale_luma}. */
    public static byte nlog2_sao_offset_scale_luma(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265PictureParameterSet.LOG2_SAO_OFFSET_SCALE_LUMA); }
    /** Unsafe version of {@link #log2_sao_offset_scale_chroma}. */
    public static byte nlog2_sao_offset_scale_chroma(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265PictureParameterSet.LOG2_SAO_OFFSET_SCALE_CHROMA); }
    /** Unsafe version of {@link #pps_act_y_qp_offset_plus5}. */
    public static byte npps_act_y_qp_offset_plus5(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265PictureParameterSet.PPS_ACT_Y_QP_OFFSET_PLUS5); }
    /** Unsafe version of {@link #pps_act_cb_qp_offset_plus5}. */
    public static byte npps_act_cb_qp_offset_plus5(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265PictureParameterSet.PPS_ACT_CB_QP_OFFSET_PLUS5); }
    /** Unsafe version of {@link #pps_act_cr_qp_offset_plus5}. */
    public static byte npps_act_cr_qp_offset_plus5(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265PictureParameterSet.PPS_ACT_CR_QP_OFFSET_PLUS5); }
    /** Unsafe version of {@link #pps_num_palette_predictor_initializer}. */
    public static byte npps_num_palette_predictor_initializer(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265PictureParameterSet.PPS_NUM_PALETTE_PREDICTOR_INITIALIZER); }
    /** Unsafe version of {@link #luma_bit_depth_entry_minus8}. */
    public static byte nluma_bit_depth_entry_minus8(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265PictureParameterSet.LUMA_BIT_DEPTH_ENTRY_MINUS8); }
    /** Unsafe version of {@link #chroma_bit_depth_entry_minus8}. */
    public static byte nchroma_bit_depth_entry_minus8(long struct) { return UNSAFE.getByte(null, struct + StdVideoH265PictureParameterSet.CHROMA_BIT_DEPTH_ENTRY_MINUS8); }
    /** Unsafe version of {@link #pPredictorPaletteEntries}. */
    public static StdVideoH265PredictorPaletteEntries npPredictorPaletteEntries(long struct) { return StdVideoH265PredictorPaletteEntries.create(memGetAddress(struct + StdVideoH265PictureParameterSet.PPREDICTORPALETTEENTRIES)); }

    /** Unsafe version of {@link #pps_pic_parameter_set_id(byte) pps_pic_parameter_set_id}. */
    public static void npps_pic_parameter_set_id(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265PictureParameterSet.PPS_PIC_PARAMETER_SET_ID, value); }
    /** Unsafe version of {@link #pps_seq_parameter_set_id(byte) pps_seq_parameter_set_id}. */
    public static void npps_seq_parameter_set_id(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265PictureParameterSet.PPS_SEQ_PARAMETER_SET_ID, value); }
    /** Unsafe version of {@link #num_extra_slice_header_bits(byte) num_extra_slice_header_bits}. */
    public static void nnum_extra_slice_header_bits(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265PictureParameterSet.NUM_EXTRA_SLICE_HEADER_BITS, value); }
    /** Unsafe version of {@link #num_ref_idx_l0_default_active_minus1(byte) num_ref_idx_l0_default_active_minus1}. */
    public static void nnum_ref_idx_l0_default_active_minus1(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265PictureParameterSet.NUM_REF_IDX_L0_DEFAULT_ACTIVE_MINUS1, value); }
    /** Unsafe version of {@link #num_ref_idx_l1_default_active_minus1(byte) num_ref_idx_l1_default_active_minus1}. */
    public static void nnum_ref_idx_l1_default_active_minus1(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265PictureParameterSet.NUM_REF_IDX_L1_DEFAULT_ACTIVE_MINUS1, value); }
    /** Unsafe version of {@link #init_qp_minus26(byte) init_qp_minus26}. */
    public static void ninit_qp_minus26(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265PictureParameterSet.INIT_QP_MINUS26, value); }
    /** Unsafe version of {@link #diff_cu_qp_delta_depth(byte) diff_cu_qp_delta_depth}. */
    public static void ndiff_cu_qp_delta_depth(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265PictureParameterSet.DIFF_CU_QP_DELTA_DEPTH, value); }
    /** Unsafe version of {@link #pps_cb_qp_offset(byte) pps_cb_qp_offset}. */
    public static void npps_cb_qp_offset(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265PictureParameterSet.PPS_CB_QP_OFFSET, value); }
    /** Unsafe version of {@link #pps_cr_qp_offset(byte) pps_cr_qp_offset}. */
    public static void npps_cr_qp_offset(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265PictureParameterSet.PPS_CR_QP_OFFSET, value); }
    /** Unsafe version of {@link #num_tile_columns_minus1(byte) num_tile_columns_minus1}. */
    public static void nnum_tile_columns_minus1(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265PictureParameterSet.NUM_TILE_COLUMNS_MINUS1, value); }
    /** Unsafe version of {@link #num_tile_rows_minus1(byte) num_tile_rows_minus1}. */
    public static void nnum_tile_rows_minus1(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265PictureParameterSet.NUM_TILE_ROWS_MINUS1, value); }
    /** Unsafe version of {@link #column_width_minus1(ShortBuffer) column_width_minus1}. */
    public static void ncolumn_width_minus1(long struct, ShortBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_COLS_LIST_SIZE); }
        memCopy(memAddress(value), struct + StdVideoH265PictureParameterSet.COLUMN_WIDTH_MINUS1, value.remaining() * 2);
    }
    /** Unsafe version of {@link #column_width_minus1(int, short) column_width_minus1}. */
    public static void ncolumn_width_minus1(long struct, int index, short value) {
        UNSAFE.putShort(null, struct + StdVideoH265PictureParameterSet.COLUMN_WIDTH_MINUS1 + check(index, STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_COLS_LIST_SIZE) * 2, value);
    }
    /** Unsafe version of {@link #row_height_minus1(ShortBuffer) row_height_minus1}. */
    public static void nrow_height_minus1(long struct, ShortBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_ROWS_LIST_SIZE); }
        memCopy(memAddress(value), struct + StdVideoH265PictureParameterSet.ROW_HEIGHT_MINUS1, value.remaining() * 2);
    }
    /** Unsafe version of {@link #row_height_minus1(int, short) row_height_minus1}. */
    public static void nrow_height_minus1(long struct, int index, short value) {
        UNSAFE.putShort(null, struct + StdVideoH265PictureParameterSet.ROW_HEIGHT_MINUS1 + check(index, STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_ROWS_LIST_SIZE) * 2, value);
    }
    /** Unsafe version of {@link #pps_beta_offset_div2(byte) pps_beta_offset_div2}. */
    public static void npps_beta_offset_div2(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265PictureParameterSet.PPS_BETA_OFFSET_DIV2, value); }
    /** Unsafe version of {@link #pps_tc_offset_div2(byte) pps_tc_offset_div2}. */
    public static void npps_tc_offset_div2(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265PictureParameterSet.PPS_TC_OFFSET_DIV2, value); }
    /** Unsafe version of {@link #log2_parallel_merge_level_minus2(byte) log2_parallel_merge_level_minus2}. */
    public static void nlog2_parallel_merge_level_minus2(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265PictureParameterSet.LOG2_PARALLEL_MERGE_LEVEL_MINUS2, value); }
    /** Unsafe version of {@link #flags(StdVideoH265PpsFlags) flags}. */
    public static void nflags(long struct, StdVideoH265PpsFlags value) { memCopy(value.address(), struct + StdVideoH265PictureParameterSet.FLAGS, StdVideoH265PpsFlags.SIZEOF); }
    /** Unsafe version of {@link #pScalingLists(StdVideoH265ScalingLists) pScalingLists}. */
    public static void npScalingLists(long struct, StdVideoH265ScalingLists value) { memPutAddress(struct + StdVideoH265PictureParameterSet.PSCALINGLISTS, value.address()); }
    /** Unsafe version of {@link #log2_max_transform_skip_block_size_minus2(byte) log2_max_transform_skip_block_size_minus2}. */
    public static void nlog2_max_transform_skip_block_size_minus2(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265PictureParameterSet.LOG2_MAX_TRANSFORM_SKIP_BLOCK_SIZE_MINUS2, value); }
    /** Unsafe version of {@link #diff_cu_chroma_qp_offset_depth(byte) diff_cu_chroma_qp_offset_depth}. */
    public static void ndiff_cu_chroma_qp_offset_depth(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265PictureParameterSet.DIFF_CU_CHROMA_QP_OFFSET_DEPTH, value); }
    /** Unsafe version of {@link #chroma_qp_offset_list_len_minus1(byte) chroma_qp_offset_list_len_minus1}. */
    public static void nchroma_qp_offset_list_len_minus1(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265PictureParameterSet.CHROMA_QP_OFFSET_LIST_LEN_MINUS1, value); }
    /** Unsafe version of {@link #cb_qp_offset_list(ByteBuffer) cb_qp_offset_list}. */
    public static void ncb_qp_offset_list(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE); }
        memCopy(memAddress(value), struct + StdVideoH265PictureParameterSet.CB_QP_OFFSET_LIST, value.remaining() * 1);
    }
    /** Unsafe version of {@link #cb_qp_offset_list(int, byte) cb_qp_offset_list}. */
    public static void ncb_qp_offset_list(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoH265PictureParameterSet.CB_QP_OFFSET_LIST + check(index, STD_VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE) * 1, value);
    }
    /** Unsafe version of {@link #cr_qp_offset_list(ByteBuffer) cr_qp_offset_list}. */
    public static void ncr_qp_offset_list(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, STD_VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE); }
        memCopy(memAddress(value), struct + StdVideoH265PictureParameterSet.CR_QP_OFFSET_LIST, value.remaining() * 1);
    }
    /** Unsafe version of {@link #cr_qp_offset_list(int, byte) cr_qp_offset_list}. */
    public static void ncr_qp_offset_list(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + StdVideoH265PictureParameterSet.CR_QP_OFFSET_LIST + check(index, STD_VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE) * 1, value);
    }
    /** Unsafe version of {@link #log2_sao_offset_scale_luma(byte) log2_sao_offset_scale_luma}. */
    public static void nlog2_sao_offset_scale_luma(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265PictureParameterSet.LOG2_SAO_OFFSET_SCALE_LUMA, value); }
    /** Unsafe version of {@link #log2_sao_offset_scale_chroma(byte) log2_sao_offset_scale_chroma}. */
    public static void nlog2_sao_offset_scale_chroma(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265PictureParameterSet.LOG2_SAO_OFFSET_SCALE_CHROMA, value); }
    /** Unsafe version of {@link #pps_act_y_qp_offset_plus5(byte) pps_act_y_qp_offset_plus5}. */
    public static void npps_act_y_qp_offset_plus5(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265PictureParameterSet.PPS_ACT_Y_QP_OFFSET_PLUS5, value); }
    /** Unsafe version of {@link #pps_act_cb_qp_offset_plus5(byte) pps_act_cb_qp_offset_plus5}. */
    public static void npps_act_cb_qp_offset_plus5(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265PictureParameterSet.PPS_ACT_CB_QP_OFFSET_PLUS5, value); }
    /** Unsafe version of {@link #pps_act_cr_qp_offset_plus5(byte) pps_act_cr_qp_offset_plus5}. */
    public static void npps_act_cr_qp_offset_plus5(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265PictureParameterSet.PPS_ACT_CR_QP_OFFSET_PLUS5, value); }
    /** Unsafe version of {@link #pps_num_palette_predictor_initializer(byte) pps_num_palette_predictor_initializer}. */
    public static void npps_num_palette_predictor_initializer(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265PictureParameterSet.PPS_NUM_PALETTE_PREDICTOR_INITIALIZER, value); }
    /** Unsafe version of {@link #luma_bit_depth_entry_minus8(byte) luma_bit_depth_entry_minus8}. */
    public static void nluma_bit_depth_entry_minus8(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265PictureParameterSet.LUMA_BIT_DEPTH_ENTRY_MINUS8, value); }
    /** Unsafe version of {@link #chroma_bit_depth_entry_minus8(byte) chroma_bit_depth_entry_minus8}. */
    public static void nchroma_bit_depth_entry_minus8(long struct, byte value) { UNSAFE.putByte(null, struct + StdVideoH265PictureParameterSet.CHROMA_BIT_DEPTH_ENTRY_MINUS8, value); }
    /** Unsafe version of {@link #pPredictorPaletteEntries(StdVideoH265PredictorPaletteEntries) pPredictorPaletteEntries}. */
    public static void npPredictorPaletteEntries(long struct, StdVideoH265PredictorPaletteEntries value) { memPutAddress(struct + StdVideoH265PictureParameterSet.PPREDICTORPALETTEENTRIES, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + StdVideoH265PictureParameterSet.PSCALINGLISTS));
        check(memGetAddress(struct + StdVideoH265PictureParameterSet.PPREDICTORPALETTEENTRIES));
    }

    // -----------------------------------

    /** An array of {@link StdVideoH265PictureParameterSet} structs. */
    public static class Buffer extends StructBuffer<StdVideoH265PictureParameterSet, Buffer> implements NativeResource {

        private static final StdVideoH265PictureParameterSet ELEMENT_FACTORY = StdVideoH265PictureParameterSet.create(-1L);

        /**
         * Creates a new {@code StdVideoH265PictureParameterSet.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link StdVideoH265PictureParameterSet#SIZEOF}, and its mark will be undefined.
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
        protected StdVideoH265PictureParameterSet getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code pps_pic_parameter_set_id} field. */
        @NativeType("uint8_t")
        public byte pps_pic_parameter_set_id() { return StdVideoH265PictureParameterSet.npps_pic_parameter_set_id(address()); }
        /** @return the value of the {@code pps_seq_parameter_set_id} field. */
        @NativeType("uint8_t")
        public byte pps_seq_parameter_set_id() { return StdVideoH265PictureParameterSet.npps_seq_parameter_set_id(address()); }
        /** @return the value of the {@code num_extra_slice_header_bits} field. */
        @NativeType("uint8_t")
        public byte num_extra_slice_header_bits() { return StdVideoH265PictureParameterSet.nnum_extra_slice_header_bits(address()); }
        /** @return the value of the {@code num_ref_idx_l0_default_active_minus1} field. */
        @NativeType("uint8_t")
        public byte num_ref_idx_l0_default_active_minus1() { return StdVideoH265PictureParameterSet.nnum_ref_idx_l0_default_active_minus1(address()); }
        /** @return the value of the {@code num_ref_idx_l1_default_active_minus1} field. */
        @NativeType("uint8_t")
        public byte num_ref_idx_l1_default_active_minus1() { return StdVideoH265PictureParameterSet.nnum_ref_idx_l1_default_active_minus1(address()); }
        /** @return the value of the {@code init_qp_minus26} field. */
        @NativeType("int8_t")
        public byte init_qp_minus26() { return StdVideoH265PictureParameterSet.ninit_qp_minus26(address()); }
        /** @return the value of the {@code diff_cu_qp_delta_depth} field. */
        @NativeType("uint8_t")
        public byte diff_cu_qp_delta_depth() { return StdVideoH265PictureParameterSet.ndiff_cu_qp_delta_depth(address()); }
        /** @return the value of the {@code pps_cb_qp_offset} field. */
        @NativeType("int8_t")
        public byte pps_cb_qp_offset() { return StdVideoH265PictureParameterSet.npps_cb_qp_offset(address()); }
        /** @return the value of the {@code pps_cr_qp_offset} field. */
        @NativeType("int8_t")
        public byte pps_cr_qp_offset() { return StdVideoH265PictureParameterSet.npps_cr_qp_offset(address()); }
        /** @return the value of the {@code num_tile_columns_minus1} field. */
        @NativeType("uint8_t")
        public byte num_tile_columns_minus1() { return StdVideoH265PictureParameterSet.nnum_tile_columns_minus1(address()); }
        /** @return the value of the {@code num_tile_rows_minus1} field. */
        @NativeType("uint8_t")
        public byte num_tile_rows_minus1() { return StdVideoH265PictureParameterSet.nnum_tile_rows_minus1(address()); }
        /** @return a {@link ShortBuffer} view of the {@code column_width_minus1} field. */
        @NativeType("uint16_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_COLS_LIST_SIZE]")
        public ShortBuffer column_width_minus1() { return StdVideoH265PictureParameterSet.ncolumn_width_minus1(address()); }
        /** @return the value at the specified index of the {@code column_width_minus1} field. */
        @NativeType("uint16_t")
        public short column_width_minus1(int index) { return StdVideoH265PictureParameterSet.ncolumn_width_minus1(address(), index); }
        /** @return a {@link ShortBuffer} view of the {@code row_height_minus1} field. */
        @NativeType("uint16_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_ROWS_LIST_SIZE]")
        public ShortBuffer row_height_minus1() { return StdVideoH265PictureParameterSet.nrow_height_minus1(address()); }
        /** @return the value at the specified index of the {@code row_height_minus1} field. */
        @NativeType("uint16_t")
        public short row_height_minus1(int index) { return StdVideoH265PictureParameterSet.nrow_height_minus1(address(), index); }
        /** @return the value of the {@code pps_beta_offset_div2} field. */
        @NativeType("int8_t")
        public byte pps_beta_offset_div2() { return StdVideoH265PictureParameterSet.npps_beta_offset_div2(address()); }
        /** @return the value of the {@code pps_tc_offset_div2} field. */
        @NativeType("int8_t")
        public byte pps_tc_offset_div2() { return StdVideoH265PictureParameterSet.npps_tc_offset_div2(address()); }
        /** @return the value of the {@code log2_parallel_merge_level_minus2} field. */
        @NativeType("uint8_t")
        public byte log2_parallel_merge_level_minus2() { return StdVideoH265PictureParameterSet.nlog2_parallel_merge_level_minus2(address()); }
        /** @return a {@link StdVideoH265PpsFlags} view of the {@code flags} field. */
        public StdVideoH265PpsFlags flags() { return StdVideoH265PictureParameterSet.nflags(address()); }
        /** @return a {@link StdVideoH265ScalingLists} view of the struct pointed to by the {@link StdVideoH265PictureParameterSet#pScalingLists} field. */
        @NativeType("StdVideoH265ScalingLists *")
        public StdVideoH265ScalingLists pScalingLists() { return StdVideoH265PictureParameterSet.npScalingLists(address()); }
        /** @return the value of the {@link StdVideoH265PictureParameterSet#log2_max_transform_skip_block_size_minus2} field. */
        @NativeType("uint8_t")
        public byte log2_max_transform_skip_block_size_minus2() { return StdVideoH265PictureParameterSet.nlog2_max_transform_skip_block_size_minus2(address()); }
        /** @return the value of the {@code diff_cu_chroma_qp_offset_depth} field. */
        @NativeType("uint8_t")
        public byte diff_cu_chroma_qp_offset_depth() { return StdVideoH265PictureParameterSet.ndiff_cu_chroma_qp_offset_depth(address()); }
        /** @return the value of the {@code chroma_qp_offset_list_len_minus1} field. */
        @NativeType("uint8_t")
        public byte chroma_qp_offset_list_len_minus1() { return StdVideoH265PictureParameterSet.nchroma_qp_offset_list_len_minus1(address()); }
        /** @return a {@link ByteBuffer} view of the {@code cb_qp_offset_list} field. */
        @NativeType("int8_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE]")
        public ByteBuffer cb_qp_offset_list() { return StdVideoH265PictureParameterSet.ncb_qp_offset_list(address()); }
        /** @return the value at the specified index of the {@code cb_qp_offset_list} field. */
        @NativeType("int8_t")
        public byte cb_qp_offset_list(int index) { return StdVideoH265PictureParameterSet.ncb_qp_offset_list(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code cr_qp_offset_list} field. */
        @NativeType("int8_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE]")
        public ByteBuffer cr_qp_offset_list() { return StdVideoH265PictureParameterSet.ncr_qp_offset_list(address()); }
        /** @return the value at the specified index of the {@code cr_qp_offset_list} field. */
        @NativeType("int8_t")
        public byte cr_qp_offset_list(int index) { return StdVideoH265PictureParameterSet.ncr_qp_offset_list(address(), index); }
        /** @return the value of the {@code log2_sao_offset_scale_luma} field. */
        @NativeType("uint8_t")
        public byte log2_sao_offset_scale_luma() { return StdVideoH265PictureParameterSet.nlog2_sao_offset_scale_luma(address()); }
        /** @return the value of the {@code log2_sao_offset_scale_chroma} field. */
        @NativeType("uint8_t")
        public byte log2_sao_offset_scale_chroma() { return StdVideoH265PictureParameterSet.nlog2_sao_offset_scale_chroma(address()); }
        /** @return the value of the {@link StdVideoH265PictureParameterSet#pps_act_y_qp_offset_plus5} field. */
        @NativeType("int8_t")
        public byte pps_act_y_qp_offset_plus5() { return StdVideoH265PictureParameterSet.npps_act_y_qp_offset_plus5(address()); }
        /** @return the value of the {@code pps_act_cb_qp_offset_plus5} field. */
        @NativeType("int8_t")
        public byte pps_act_cb_qp_offset_plus5() { return StdVideoH265PictureParameterSet.npps_act_cb_qp_offset_plus5(address()); }
        /** @return the value of the {@code pps_act_cr_qp_offset_plus5} field. */
        @NativeType("int8_t")
        public byte pps_act_cr_qp_offset_plus5() { return StdVideoH265PictureParameterSet.npps_act_cr_qp_offset_plus5(address()); }
        /** @return the value of the {@code pps_num_palette_predictor_initializer} field. */
        @NativeType("uint8_t")
        public byte pps_num_palette_predictor_initializer() { return StdVideoH265PictureParameterSet.npps_num_palette_predictor_initializer(address()); }
        /** @return the value of the {@code luma_bit_depth_entry_minus8} field. */
        @NativeType("uint8_t")
        public byte luma_bit_depth_entry_minus8() { return StdVideoH265PictureParameterSet.nluma_bit_depth_entry_minus8(address()); }
        /** @return the value of the {@code chroma_bit_depth_entry_minus8} field. */
        @NativeType("uint8_t")
        public byte chroma_bit_depth_entry_minus8() { return StdVideoH265PictureParameterSet.nchroma_bit_depth_entry_minus8(address()); }
        /** @return a {@link StdVideoH265PredictorPaletteEntries} view of the struct pointed to by the {@link StdVideoH265PictureParameterSet#pPredictorPaletteEntries} field. */
        @NativeType("StdVideoH265PredictorPaletteEntries *")
        public StdVideoH265PredictorPaletteEntries pPredictorPaletteEntries() { return StdVideoH265PictureParameterSet.npPredictorPaletteEntries(address()); }

        /** Sets the specified value to the {@code pps_pic_parameter_set_id} field. */
        public StdVideoH265PictureParameterSet.Buffer pps_pic_parameter_set_id(@NativeType("uint8_t") byte value) { StdVideoH265PictureParameterSet.npps_pic_parameter_set_id(address(), value); return this; }
        /** Sets the specified value to the {@code pps_seq_parameter_set_id} field. */
        public StdVideoH265PictureParameterSet.Buffer pps_seq_parameter_set_id(@NativeType("uint8_t") byte value) { StdVideoH265PictureParameterSet.npps_seq_parameter_set_id(address(), value); return this; }
        /** Sets the specified value to the {@code num_extra_slice_header_bits} field. */
        public StdVideoH265PictureParameterSet.Buffer num_extra_slice_header_bits(@NativeType("uint8_t") byte value) { StdVideoH265PictureParameterSet.nnum_extra_slice_header_bits(address(), value); return this; }
        /** Sets the specified value to the {@code num_ref_idx_l0_default_active_minus1} field. */
        public StdVideoH265PictureParameterSet.Buffer num_ref_idx_l0_default_active_minus1(@NativeType("uint8_t") byte value) { StdVideoH265PictureParameterSet.nnum_ref_idx_l0_default_active_minus1(address(), value); return this; }
        /** Sets the specified value to the {@code num_ref_idx_l1_default_active_minus1} field. */
        public StdVideoH265PictureParameterSet.Buffer num_ref_idx_l1_default_active_minus1(@NativeType("uint8_t") byte value) { StdVideoH265PictureParameterSet.nnum_ref_idx_l1_default_active_minus1(address(), value); return this; }
        /** Sets the specified value to the {@code init_qp_minus26} field. */
        public StdVideoH265PictureParameterSet.Buffer init_qp_minus26(@NativeType("int8_t") byte value) { StdVideoH265PictureParameterSet.ninit_qp_minus26(address(), value); return this; }
        /** Sets the specified value to the {@code diff_cu_qp_delta_depth} field. */
        public StdVideoH265PictureParameterSet.Buffer diff_cu_qp_delta_depth(@NativeType("uint8_t") byte value) { StdVideoH265PictureParameterSet.ndiff_cu_qp_delta_depth(address(), value); return this; }
        /** Sets the specified value to the {@code pps_cb_qp_offset} field. */
        public StdVideoH265PictureParameterSet.Buffer pps_cb_qp_offset(@NativeType("int8_t") byte value) { StdVideoH265PictureParameterSet.npps_cb_qp_offset(address(), value); return this; }
        /** Sets the specified value to the {@code pps_cr_qp_offset} field. */
        public StdVideoH265PictureParameterSet.Buffer pps_cr_qp_offset(@NativeType("int8_t") byte value) { StdVideoH265PictureParameterSet.npps_cr_qp_offset(address(), value); return this; }
        /** Sets the specified value to the {@code num_tile_columns_minus1} field. */
        public StdVideoH265PictureParameterSet.Buffer num_tile_columns_minus1(@NativeType("uint8_t") byte value) { StdVideoH265PictureParameterSet.nnum_tile_columns_minus1(address(), value); return this; }
        /** Sets the specified value to the {@code num_tile_rows_minus1} field. */
        public StdVideoH265PictureParameterSet.Buffer num_tile_rows_minus1(@NativeType("uint8_t") byte value) { StdVideoH265PictureParameterSet.nnum_tile_rows_minus1(address(), value); return this; }
        /** Copies the specified {@link ShortBuffer} to the {@code column_width_minus1} field. */
        public StdVideoH265PictureParameterSet.Buffer column_width_minus1(@NativeType("uint16_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_COLS_LIST_SIZE]") ShortBuffer value) { StdVideoH265PictureParameterSet.ncolumn_width_minus1(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code column_width_minus1} field. */
        public StdVideoH265PictureParameterSet.Buffer column_width_minus1(int index, @NativeType("uint16_t") short value) { StdVideoH265PictureParameterSet.ncolumn_width_minus1(address(), index, value); return this; }
        /** Copies the specified {@link ShortBuffer} to the {@code row_height_minus1} field. */
        public StdVideoH265PictureParameterSet.Buffer row_height_minus1(@NativeType("uint16_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_ROWS_LIST_SIZE]") ShortBuffer value) { StdVideoH265PictureParameterSet.nrow_height_minus1(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code row_height_minus1} field. */
        public StdVideoH265PictureParameterSet.Buffer row_height_minus1(int index, @NativeType("uint16_t") short value) { StdVideoH265PictureParameterSet.nrow_height_minus1(address(), index, value); return this; }
        /** Sets the specified value to the {@code pps_beta_offset_div2} field. */
        public StdVideoH265PictureParameterSet.Buffer pps_beta_offset_div2(@NativeType("int8_t") byte value) { StdVideoH265PictureParameterSet.npps_beta_offset_div2(address(), value); return this; }
        /** Sets the specified value to the {@code pps_tc_offset_div2} field. */
        public StdVideoH265PictureParameterSet.Buffer pps_tc_offset_div2(@NativeType("int8_t") byte value) { StdVideoH265PictureParameterSet.npps_tc_offset_div2(address(), value); return this; }
        /** Sets the specified value to the {@code log2_parallel_merge_level_minus2} field. */
        public StdVideoH265PictureParameterSet.Buffer log2_parallel_merge_level_minus2(@NativeType("uint8_t") byte value) { StdVideoH265PictureParameterSet.nlog2_parallel_merge_level_minus2(address(), value); return this; }
        /** Copies the specified {@link StdVideoH265PpsFlags} to the {@code flags} field. */
        public StdVideoH265PictureParameterSet.Buffer flags(StdVideoH265PpsFlags value) { StdVideoH265PictureParameterSet.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public StdVideoH265PictureParameterSet.Buffer flags(java.util.function.Consumer<StdVideoH265PpsFlags> consumer) { consumer.accept(flags()); return this; }
        /** Sets the address of the specified {@link StdVideoH265ScalingLists} to the {@link StdVideoH265PictureParameterSet#pScalingLists} field. */
        public StdVideoH265PictureParameterSet.Buffer pScalingLists(@NativeType("StdVideoH265ScalingLists *") StdVideoH265ScalingLists value) { StdVideoH265PictureParameterSet.npScalingLists(address(), value); return this; }
        /** Sets the specified value to the {@link StdVideoH265PictureParameterSet#log2_max_transform_skip_block_size_minus2} field. */
        public StdVideoH265PictureParameterSet.Buffer log2_max_transform_skip_block_size_minus2(@NativeType("uint8_t") byte value) { StdVideoH265PictureParameterSet.nlog2_max_transform_skip_block_size_minus2(address(), value); return this; }
        /** Sets the specified value to the {@code diff_cu_chroma_qp_offset_depth} field. */
        public StdVideoH265PictureParameterSet.Buffer diff_cu_chroma_qp_offset_depth(@NativeType("uint8_t") byte value) { StdVideoH265PictureParameterSet.ndiff_cu_chroma_qp_offset_depth(address(), value); return this; }
        /** Sets the specified value to the {@code chroma_qp_offset_list_len_minus1} field. */
        public StdVideoH265PictureParameterSet.Buffer chroma_qp_offset_list_len_minus1(@NativeType("uint8_t") byte value) { StdVideoH265PictureParameterSet.nchroma_qp_offset_list_len_minus1(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code cb_qp_offset_list} field. */
        public StdVideoH265PictureParameterSet.Buffer cb_qp_offset_list(@NativeType("int8_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE]") ByteBuffer value) { StdVideoH265PictureParameterSet.ncb_qp_offset_list(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code cb_qp_offset_list} field. */
        public StdVideoH265PictureParameterSet.Buffer cb_qp_offset_list(int index, @NativeType("int8_t") byte value) { StdVideoH265PictureParameterSet.ncb_qp_offset_list(address(), index, value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code cr_qp_offset_list} field. */
        public StdVideoH265PictureParameterSet.Buffer cr_qp_offset_list(@NativeType("int8_t[STD_VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE]") ByteBuffer value) { StdVideoH265PictureParameterSet.ncr_qp_offset_list(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code cr_qp_offset_list} field. */
        public StdVideoH265PictureParameterSet.Buffer cr_qp_offset_list(int index, @NativeType("int8_t") byte value) { StdVideoH265PictureParameterSet.ncr_qp_offset_list(address(), index, value); return this; }
        /** Sets the specified value to the {@code log2_sao_offset_scale_luma} field. */
        public StdVideoH265PictureParameterSet.Buffer log2_sao_offset_scale_luma(@NativeType("uint8_t") byte value) { StdVideoH265PictureParameterSet.nlog2_sao_offset_scale_luma(address(), value); return this; }
        /** Sets the specified value to the {@code log2_sao_offset_scale_chroma} field. */
        public StdVideoH265PictureParameterSet.Buffer log2_sao_offset_scale_chroma(@NativeType("uint8_t") byte value) { StdVideoH265PictureParameterSet.nlog2_sao_offset_scale_chroma(address(), value); return this; }
        /** Sets the specified value to the {@link StdVideoH265PictureParameterSet#pps_act_y_qp_offset_plus5} field. */
        public StdVideoH265PictureParameterSet.Buffer pps_act_y_qp_offset_plus5(@NativeType("int8_t") byte value) { StdVideoH265PictureParameterSet.npps_act_y_qp_offset_plus5(address(), value); return this; }
        /** Sets the specified value to the {@code pps_act_cb_qp_offset_plus5} field. */
        public StdVideoH265PictureParameterSet.Buffer pps_act_cb_qp_offset_plus5(@NativeType("int8_t") byte value) { StdVideoH265PictureParameterSet.npps_act_cb_qp_offset_plus5(address(), value); return this; }
        /** Sets the specified value to the {@code pps_act_cr_qp_offset_plus5} field. */
        public StdVideoH265PictureParameterSet.Buffer pps_act_cr_qp_offset_plus5(@NativeType("int8_t") byte value) { StdVideoH265PictureParameterSet.npps_act_cr_qp_offset_plus5(address(), value); return this; }
        /** Sets the specified value to the {@code pps_num_palette_predictor_initializer} field. */
        public StdVideoH265PictureParameterSet.Buffer pps_num_palette_predictor_initializer(@NativeType("uint8_t") byte value) { StdVideoH265PictureParameterSet.npps_num_palette_predictor_initializer(address(), value); return this; }
        /** Sets the specified value to the {@code luma_bit_depth_entry_minus8} field. */
        public StdVideoH265PictureParameterSet.Buffer luma_bit_depth_entry_minus8(@NativeType("uint8_t") byte value) { StdVideoH265PictureParameterSet.nluma_bit_depth_entry_minus8(address(), value); return this; }
        /** Sets the specified value to the {@code chroma_bit_depth_entry_minus8} field. */
        public StdVideoH265PictureParameterSet.Buffer chroma_bit_depth_entry_minus8(@NativeType("uint8_t") byte value) { StdVideoH265PictureParameterSet.nchroma_bit_depth_entry_minus8(address(), value); return this; }
        /** Sets the address of the specified {@link StdVideoH265PredictorPaletteEntries} to the {@link StdVideoH265PictureParameterSet#pPredictorPaletteEntries} field. */
        public StdVideoH265PictureParameterSet.Buffer pPredictorPaletteEntries(@NativeType("StdVideoH265PredictorPaletteEntries *") StdVideoH265PredictorPaletteEntries value) { StdVideoH265PictureParameterSet.npPredictorPaletteEntries(address(), value); return this; }

    }

}