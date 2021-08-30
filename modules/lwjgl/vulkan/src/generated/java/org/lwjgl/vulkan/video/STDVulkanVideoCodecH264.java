/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.video;

import static org.lwjgl.vulkan.video.STDVulkanVideo.*;

public final class STDVulkanVideoCodecH264 {

    /** The extension specification version. */
    public static final int VK_STD_VULKAN_VIDEO_CODEC_H264_SPEC_VERSION = VK_MAKE_VIDEO_STD_VERSION(0, 9, 0);

    /** The extension name. */
    public static final String VK_STD_VULKAN_VIDEO_CODEC_H264_EXTENSION_NAME = "VK_STD_vulkan_video_codec_h264";

    /**
     * {@code StdVideoH264ChromaFormatIdc}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #std_video_h264_chroma_format_idc_monochrome std_video_h264_chroma_format_idc_monochrome}</li>
     * <li>{@link #std_video_h264_chroma_format_idc_420 std_video_h264_chroma_format_idc_420}</li>
     * <li>{@link #std_video_h264_chroma_format_idc_422 std_video_h264_chroma_format_idc_422}</li>
     * <li>{@link #std_video_h264_chroma_format_idc_444 std_video_h264_chroma_format_idc_444}</li>
     * </ul>
     */
    public static final int
        std_video_h264_chroma_format_idc_monochrome = 0,
        std_video_h264_chroma_format_idc_420        = 1,
        std_video_h264_chroma_format_idc_422        = 2,
        std_video_h264_chroma_format_idc_444        = 3;

    /**
     * {@code StdVideoH264ProfileIdc}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #std_video_h264_profile_idc_baseline std_video_h264_profile_idc_baseline} - Only constrained baseSTline is supported</li>
     * <li>{@link #std_video_h264_profile_idc_main std_video_h264_profile_idc_main}</li>
     * <li>{@link #std_video_h264_profile_idc_high std_video_h264_profile_idc_high}</li>
     * <li>{@link #std_video_h264_profile_idc_high_444_predictive std_video_h264_profile_idc_high_444_predictive}</li>
     * <li>{@link #std_video_h264_profile_idc_invalid std_video_h264_profile_idc_invalid}</li>
     * </ul>
     */
    public static final int
        std_video_h264_profile_idc_baseline            = 66,
        std_video_h264_profile_idc_main                = 77,
        std_video_h264_profile_idc_high                = 100,
        std_video_h264_profile_idc_high_444_predictive = 244,
        std_video_h264_profile_idc_invalid             = 0x7FFFFFFF;

    /**
     * {@code StdVideoH264Level}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #std_video_h264_level_1_0 std_video_h264_level_1_0}</li>
     * <li>{@link #std_video_h264_level_1_1 std_video_h264_level_1_1}</li>
     * <li>{@link #std_video_h264_level_1_2 std_video_h264_level_1_2}</li>
     * <li>{@link #std_video_h264_level_1_3 std_video_h264_level_1_3}</li>
     * <li>{@link #std_video_h264_level_2_0 std_video_h264_level_2_0}</li>
     * <li>{@link #std_video_h264_level_2_1 std_video_h264_level_2_1}</li>
     * <li>{@link #std_video_h264_level_2_2 std_video_h264_level_2_2}</li>
     * <li>{@link #std_video_h264_level_3_0 std_video_h264_level_3_0}</li>
     * <li>{@link #std_video_h264_level_3_1 std_video_h264_level_3_1}</li>
     * <li>{@link #std_video_h264_level_3_2 std_video_h264_level_3_2}</li>
     * <li>{@link #std_video_h264_level_4_0 std_video_h264_level_4_0}</li>
     * <li>{@link #std_video_h264_level_4_1 std_video_h264_level_4_1}</li>
     * <li>{@link #std_video_h264_level_4_2 std_video_h264_level_4_2}</li>
     * <li>{@link #std_video_h264_level_5_0 std_video_h264_level_5_0}</li>
     * <li>{@link #std_video_h264_level_5_1 std_video_h264_level_5_1}</li>
     * <li>{@link #std_video_h264_level_5_2 std_video_h264_level_5_2}</li>
     * <li>{@link #std_video_h264_level_6_0 std_video_h264_level_6_0}</li>
     * <li>{@link #std_video_h264_level_6_1 std_video_h264_level_6_1}</li>
     * <li>{@link #std_video_h264_level_6_2 std_video_h264_level_6_2}</li>
     * <li>{@link #std_video_h264_level_invalid std_video_h264_level_invalid}</li>
     * </ul>
     */
    public static final int
        std_video_h264_level_1_0     = 0,
        std_video_h264_level_1_1     = 1,
        std_video_h264_level_1_2     = 2,
        std_video_h264_level_1_3     = 3,
        std_video_h264_level_2_0     = 4,
        std_video_h264_level_2_1     = 5,
        std_video_h264_level_2_2     = 6,
        std_video_h264_level_3_0     = 7,
        std_video_h264_level_3_1     = 8,
        std_video_h264_level_3_2     = 9,
        std_video_h264_level_4_0     = 10,
        std_video_h264_level_4_1     = 11,
        std_video_h264_level_4_2     = 12,
        std_video_h264_level_5_0     = 13,
        std_video_h264_level_5_1     = 14,
        std_video_h264_level_5_2     = 15,
        std_video_h264_level_6_0     = 16,
        std_video_h264_level_6_1     = 17,
        std_video_h264_level_6_2     = 18,
        std_video_h264_level_invalid = 0x7FFFFFFF;

    /**
     * {@code StdVideoH264PocType}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #std_video_h264_poc_type_0 std_video_h264_poc_type_0}</li>
     * <li>{@link #std_video_h264_poc_type_1 std_video_h264_poc_type_1}</li>
     * <li>{@link #std_video_h264_poc_type_2 std_video_h264_poc_type_2}</li>
     * <li>{@link #std_video_h264_poc_type_invalid std_video_h264_poc_type_invalid}</li>
     * </ul>
     */
    public static final int
        std_video_h264_poc_type_0       = 0,
        std_video_h264_poc_type_1       = 1,
        std_video_h264_poc_type_2       = 2,
        std_video_h264_poc_type_invalid = 0x7FFFFFFF;

    /**
     * {@code StdVideoH264AspectRatioIdc}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #std_video_h264_aspect_ratio_idc_unspecified std_video_h264_aspect_ratio_idc_unspecified}</li>
     * <li>{@link #std_video_h264_aspect_ratio_idc_square std_video_h264_aspect_ratio_idc_square}</li>
     * <li>{@link #std_video_h264_aspect_ratio_idc_12_11 std_video_h264_aspect_ratio_idc_12_11}</li>
     * <li>{@link #std_video_h264_aspect_ratio_idc_10_11 std_video_h264_aspect_ratio_idc_10_11}</li>
     * <li>{@link #std_video_h264_aspect_ratio_idc_16_11 std_video_h264_aspect_ratio_idc_16_11}</li>
     * <li>{@link #std_video_h264_aspect_ratio_idc_40_33 std_video_h264_aspect_ratio_idc_40_33}</li>
     * <li>{@link #std_video_h264_aspect_ratio_idc_24_11 std_video_h264_aspect_ratio_idc_24_11}</li>
     * <li>{@link #std_video_h264_aspect_ratio_idc_20_11 std_video_h264_aspect_ratio_idc_20_11}</li>
     * <li>{@link #std_video_h264_aspect_ratio_idc_32_11 std_video_h264_aspect_ratio_idc_32_11}</li>
     * <li>{@link #std_video_h264_aspect_ratio_idc_80_33 std_video_h264_aspect_ratio_idc_80_33}</li>
     * <li>{@link #std_video_h264_aspect_ratio_idc_18_11 std_video_h264_aspect_ratio_idc_18_11}</li>
     * <li>{@link #std_video_h264_aspect_ratio_idc_15_11 std_video_h264_aspect_ratio_idc_15_11}</li>
     * <li>{@link #std_video_h264_aspect_ratio_idc_64_33 std_video_h264_aspect_ratio_idc_64_33}</li>
     * <li>{@link #std_video_h264_aspect_ratio_idc_160_99 std_video_h264_aspect_ratio_idc_160_99}</li>
     * <li>{@link #std_video_h264_aspect_ratio_idc_4_3 std_video_h264_aspect_ratio_idc_4_3}</li>
     * <li>{@link #std_video_h264_aspect_ratio_idc_3_2 std_video_h264_aspect_ratio_idc_3_2}</li>
     * <li>{@link #std_video_h264_aspect_ratio_idc_2_1 std_video_h264_aspect_ratio_idc_2_1}</li>
     * <li>{@link #std_video_h264_aspect_ratio_idc_extended_sar std_video_h264_aspect_ratio_idc_extended_sar}</li>
     * <li>{@link #std_video_h264_aspect_ratio_idc_invalid std_video_h264_aspect_ratio_idc_invalid}</li>
     * </ul>
     */
    public static final int
        std_video_h264_aspect_ratio_idc_unspecified  = 0,
        std_video_h264_aspect_ratio_idc_square       = 1,
        std_video_h264_aspect_ratio_idc_12_11        = 2,
        std_video_h264_aspect_ratio_idc_10_11        = 3,
        std_video_h264_aspect_ratio_idc_16_11        = 4,
        std_video_h264_aspect_ratio_idc_40_33        = 5,
        std_video_h264_aspect_ratio_idc_24_11        = 6,
        std_video_h264_aspect_ratio_idc_20_11        = 7,
        std_video_h264_aspect_ratio_idc_32_11        = 8,
        std_video_h264_aspect_ratio_idc_80_33        = 9,
        std_video_h264_aspect_ratio_idc_18_11        = 10,
        std_video_h264_aspect_ratio_idc_15_11        = 11,
        std_video_h264_aspect_ratio_idc_64_33        = 12,
        std_video_h264_aspect_ratio_idc_160_99       = 13,
        std_video_h264_aspect_ratio_idc_4_3          = 14,
        std_video_h264_aspect_ratio_idc_3_2          = 15,
        std_video_h264_aspect_ratio_idc_2_1          = 16,
        std_video_h264_aspect_ratio_idc_extended_sar = 255,
        std_video_h264_aspect_ratio_idc_invalid      = 0x7FFFFFFF;

    /**
     * {@code StdVideoH264WeightedBiPredIdc}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #std_video_h264_default_weighted_b_slices_prediction_idc std_video_h264_default_weighted_b_slices_prediction_idc}</li>
     * <li>{@link #std_video_h264_explicit_weighted_b_slices_prediction_idc std_video_h264_explicit_weighted_b_slices_prediction_idc}</li>
     * <li>{@link #std_video_h264_implicit_weighted_b_slices_prediction_idc std_video_h264_implicit_weighted_b_slices_prediction_idc}</li>
     * <li>{@link #std_video_h264_invalid_weighted_b_slices_prediction_idc std_video_h264_invalid_weighted_b_slices_prediction_idc}</li>
     * </ul>
     */
    public static final int
        std_video_h264_default_weighted_b_slices_prediction_idc  = 0,
        std_video_h264_explicit_weighted_b_slices_prediction_idc = 1,
        std_video_h264_implicit_weighted_b_slices_prediction_idc = 2,
        std_video_h264_invalid_weighted_b_slices_prediction_idc  = 0x7FFFFFFF;

    /**
     * {@code StdVideoH264ModificationOfPicNumsIdc}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #std_video_h264_modification_of_pic_nums_idc_short_term_subtract std_video_h264_modification_of_pic_nums_idc_short_term_subtract}</li>
     * <li>{@link #std_video_h264_modification_of_pic_nums_idc_short_term_add std_video_h264_modification_of_pic_nums_idc_short_term_add}</li>
     * <li>{@link #std_video_h264_modification_of_pic_nums_idc_long_term std_video_h264_modification_of_pic_nums_idc_long_term}</li>
     * <li>{@link #std_video_h264_modification_of_pic_nums_idc_end std_video_h264_modification_of_pic_nums_idc_end}</li>
     * <li>{@link #std_video_h264_modification_of_pic_nums_idc_invalid std_video_h264_modification_of_pic_nums_idc_invalid}</li>
     * </ul>
     */
    public static final int
        std_video_h264_modification_of_pic_nums_idc_short_term_subtract = 0,
        std_video_h264_modification_of_pic_nums_idc_short_term_add      = 1,
        std_video_h264_modification_of_pic_nums_idc_long_term           = 2,
        std_video_h264_modification_of_pic_nums_idc_end                 = 3,
        std_video_h264_modification_of_pic_nums_idc_invalid             = 0x7FFFFFFF;

    /**
     * {@code StdVideoH264MemMgmtControlOp}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #std_video_h264_mem_mgmt_control_op_end std_video_h264_mem_mgmt_control_op_end}</li>
     * <li>{@link #std_video_h264_mem_mgmt_control_op_unmark_short_term std_video_h264_mem_mgmt_control_op_unmark_short_term}</li>
     * <li>{@link #std_video_h264_mem_mgmt_control_op_unmark_long_term std_video_h264_mem_mgmt_control_op_unmark_long_term}</li>
     * <li>{@link #std_video_h264_mem_mgmt_control_op_mark_long_term std_video_h264_mem_mgmt_control_op_mark_long_term}</li>
     * <li>{@link #std_video_h264_mem_mgmt_control_op_set_max_long_term_index std_video_h264_mem_mgmt_control_op_set_max_long_term_index}</li>
     * <li>{@link #std_video_h264_mem_mgmt_control_op_unmark_all std_video_h264_mem_mgmt_control_op_unmark_all}</li>
     * <li>{@link #std_video_h264_mem_mgmt_control_op_mark_current_as_long_term std_video_h264_mem_mgmt_control_op_mark_current_as_long_term}</li>
     * <li>{@link #std_video_h264_mem_mgmt_control_op_invalid std_video_h264_mem_mgmt_control_op_invalid}</li>
     * </ul>
     */
    public static final int
        std_video_h264_mem_mgmt_control_op_end                       = 0,
        std_video_h264_mem_mgmt_control_op_unmark_short_term         = 1,
        std_video_h264_mem_mgmt_control_op_unmark_long_term          = 2,
        std_video_h264_mem_mgmt_control_op_mark_long_term            = 3,
        std_video_h264_mem_mgmt_control_op_set_max_long_term_index   = 4,
        std_video_h264_mem_mgmt_control_op_unmark_all                = 5,
        std_video_h264_mem_mgmt_control_op_mark_current_as_long_term = 6,
        std_video_h264_mem_mgmt_control_op_invalid                   = 0x7FFFFFFF;

    /**
     * {@code StdVideoH264CabacInitIdc}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #std_video_h264_cabac_init_idc_0 std_video_h264_cabac_init_idc_0}</li>
     * <li>{@link #std_video_h264_cabac_init_idc_1 std_video_h264_cabac_init_idc_1}</li>
     * <li>{@link #std_video_h264_cabac_init_idc_2 std_video_h264_cabac_init_idc_2}</li>
     * <li>{@link #std_video_h264_cabac_init_idc_invalid std_video_h264_cabac_init_idc_invalid}</li>
     * </ul>
     */
    public static final int
        std_video_h264_cabac_init_idc_0       = 0,
        std_video_h264_cabac_init_idc_1       = 1,
        std_video_h264_cabac_init_idc_2       = 2,
        std_video_h264_cabac_init_idc_invalid = 0x7FFFFFFF;

    /**
     * {@code StdVideoH264DisableDeblockingFilterIdc}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #std_video_h264_disable_deblocking_filter_idc_disabled std_video_h264_disable_deblocking_filter_idc_disabled}</li>
     * <li>{@link #std_video_h264_disable_deblocking_filter_idc_enabled std_video_h264_disable_deblocking_filter_idc_enabled}</li>
     * <li>{@link #std_video_h264_disable_deblocking_filter_idc_partial std_video_h264_disable_deblocking_filter_idc_partial}</li>
     * <li>{@link #std_video_h264_disable_deblocking_filter_idc_invalid std_video_h264_disable_deblocking_filter_idc_invalid}</li>
     * </ul>
     */
    public static final int
        std_video_h264_disable_deblocking_filter_idc_disabled = 0,
        std_video_h264_disable_deblocking_filter_idc_enabled  = 1,
        std_video_h264_disable_deblocking_filter_idc_partial  = 2,
        std_video_h264_disable_deblocking_filter_idc_invalid  = 0x7FFFFFFF;

    /**
     * {@code StdVideoH264PictureType}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #std_video_h264_picture_type_i std_video_h264_picture_type_i}</li>
     * <li>{@link #std_video_h264_picture_type_p std_video_h264_picture_type_p}</li>
     * <li>{@link #std_video_h264_picture_type_b std_video_h264_picture_type_b}</li>
     * <li>{@link #std_video_h264_picture_type_invalid std_video_h264_picture_type_invalid}</li>
     * </ul>
     */
    public static final int
        std_video_h264_picture_type_i       = 0,
        std_video_h264_picture_type_p       = 1,
        std_video_h264_picture_type_b       = 2,
        std_video_h264_picture_type_invalid = 0x7FFFFFFF;

    /**
     * {@code StdVideoH264SliceType}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #std_video_h264_slice_type_i std_video_h264_slice_type_i}</li>
     * <li>{@link #std_video_h264_slice_type_p std_video_h264_slice_type_p}</li>
     * <li>{@link #std_video_h264_slice_type_b std_video_h264_slice_type_b}</li>
     * <li>{@link #std_video_h264_slice_type_invalid std_video_h264_slice_type_invalid}</li>
     * </ul>
     */
    public static final int
        std_video_h264_slice_type_i       = 0,
        std_video_h264_slice_type_p       = 1,
        std_video_h264_slice_type_b       = 2,
        std_video_h264_slice_type_invalid = 0x7FFFFFFF;

    /**
     * {@code StdVideoH264NonVclNaluType}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #std_video_h264_non_vcl_nalu_type_sps std_video_h264_non_vcl_nalu_type_sps}</li>
     * <li>{@link #std_video_h264_non_vcl_nalu_type_pps std_video_h264_non_vcl_nalu_type_pps}</li>
     * <li>{@link #std_video_h264_non_vcl_nalu_type_aud std_video_h264_non_vcl_nalu_type_aud}</li>
     * <li>{@link #std_video_h264_non_vcl_nalu_type_prefix std_video_h264_non_vcl_nalu_type_prefix}</li>
     * <li>{@link #std_video_h264_non_vcl_nalu_type_end_of_sequence std_video_h264_non_vcl_nalu_type_end_of_sequence}</li>
     * <li>{@link #std_video_h264_non_vcl_nalu_type_end_of_stream std_video_h264_non_vcl_nalu_type_end_of_stream}</li>
     * <li>{@link #std_video_h264_non_vcl_nalu_type_precoded std_video_h264_non_vcl_nalu_type_precoded}</li>
     * <li>{@link #std_video_h264_non_vcl_nalu_type_invalid std_video_h264_non_vcl_nalu_type_invalid}</li>
     * </ul>
     */
    public static final int
        std_video_h264_non_vcl_nalu_type_sps             = 0,
        std_video_h264_non_vcl_nalu_type_pps             = 1,
        std_video_h264_non_vcl_nalu_type_aud             = 2,
        std_video_h264_non_vcl_nalu_type_prefix          = 3,
        std_video_h264_non_vcl_nalu_type_end_of_sequence = 4,
        std_video_h264_non_vcl_nalu_type_end_of_stream   = 5,
        std_video_h264_non_vcl_nalu_type_precoded        = 6,
        std_video_h264_non_vcl_nalu_type_invalid         = 0x7FFFFFFF;

    private STDVulkanVideoCodecH264() {}

}