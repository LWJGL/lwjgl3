/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val STD_vulkan_video_codec_h264 = "STDVulkanVideoCodecH264".nativeClassVK("STD_vulkan_video_codec_h264", type = "device", postfix = STD) {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideo.*")

    IntConstant(
        "The extension specification version.",

        "STD_VULKAN_VIDEO_CODEC_H264_SPEC_VERSION".."VK_MAKE_VIDEO_STD_VERSION(0, 9, 0)"
    )

    StringConstant(
        "The extension name.",

        "STD_VULKAN_VIDEO_CODEC_H264_EXTENSION_NAME".."VK_STD_vulkan_video_codec_h264"
    )

    EnumConstant(
        "{@code StdVideoH264ChromaFormatIdc}",

        "std_video_h264_chroma_format_idc_monochrome".enum("", "0"),
        "std_video_h264_chroma_format_idc_420".enum,
        "std_video_h264_chroma_format_idc_422".enum,
        "std_video_h264_chroma_format_idc_444".enum
    ).noPrefix()

    EnumConstant(
        "{@code StdVideoH264ProfileIdc}",

        "std_video_h264_profile_idc_baseline".enum("Only constrained baseSTline is supported", "66"),
        "std_video_h264_profile_idc_main".enum("", "77"),
        "std_video_h264_profile_idc_high".enum("", "100"),
        "std_video_h264_profile_idc_high_444_predictive".enum("", "244"),
        "std_video_h264_profile_idc_invalid".enum("", 0x7FFFFFFF)
    ).noPrefix()

    EnumConstant(
        "{@code StdVideoH264Level}",

        "std_video_h264_level_1_0".enum("", "0"),
        "std_video_h264_level_1_1".enum,
        "std_video_h264_level_1_2".enum,
        "std_video_h264_level_1_3".enum,
        "std_video_h264_level_2_0".enum,
        "std_video_h264_level_2_1".enum,
        "std_video_h264_level_2_2".enum,
        "std_video_h264_level_3_0".enum,
        "std_video_h264_level_3_1".enum,
        "std_video_h264_level_3_2".enum,
        "std_video_h264_level_4_0".enum,
        "std_video_h264_level_4_1".enum,
        "std_video_h264_level_4_2".enum,
        "std_video_h264_level_5_0".enum,
        "std_video_h264_level_5_1".enum,
        "std_video_h264_level_5_2".enum,
        "std_video_h264_level_6_0".enum,
        "std_video_h264_level_6_1".enum,
        "std_video_h264_level_6_2".enum,
        "std_video_h264_level_invalid".enum("", 0x7FFFFFFF)
    ).noPrefix()

    EnumConstant(
        "{@code StdVideoH264PocType}",

        "std_video_h264_poc_type_0".enum("", "0"),
        "std_video_h264_poc_type_1".enum,
        "std_video_h264_poc_type_2".enum,
        "std_video_h264_poc_type_invalid".enum("", 0x7FFFFFFF)
    ).noPrefix()

    EnumConstant(
        "{@code StdVideoH264AspectRatioIdc}",

        "std_video_h264_aspect_ratio_idc_unspecified".enum("", "0"),
        "std_video_h264_aspect_ratio_idc_square".enum,
        "std_video_h264_aspect_ratio_idc_12_11".enum,
        "std_video_h264_aspect_ratio_idc_10_11".enum,
        "std_video_h264_aspect_ratio_idc_16_11".enum,
        "std_video_h264_aspect_ratio_idc_40_33".enum,
        "std_video_h264_aspect_ratio_idc_24_11".enum,
        "std_video_h264_aspect_ratio_idc_20_11".enum,
        "std_video_h264_aspect_ratio_idc_32_11".enum,
        "std_video_h264_aspect_ratio_idc_80_33".enum,
        "std_video_h264_aspect_ratio_idc_18_11".enum,
        "std_video_h264_aspect_ratio_idc_15_11".enum,
        "std_video_h264_aspect_ratio_idc_64_33".enum,
        "std_video_h264_aspect_ratio_idc_160_99".enum,
        "std_video_h264_aspect_ratio_idc_4_3".enum,
        "std_video_h264_aspect_ratio_idc_3_2".enum,
        "std_video_h264_aspect_ratio_idc_2_1".enum,
        "std_video_h264_aspect_ratio_idc_extended_sar".enum("", "255"),
        "std_video_h264_aspect_ratio_idc_invalid".enum("", 0x7FFFFFFF)
    ).noPrefix()

    EnumConstant(
        "{@code StdVideoH264WeightedBiPredIdc}",

        "std_video_h264_default_weighted_b_slices_prediction_idc".enum("", "0"),
        "std_video_h264_explicit_weighted_b_slices_prediction_idc".enum,
        "std_video_h264_implicit_weighted_b_slices_prediction_idc".enum,
        "std_video_h264_invalid_weighted_b_slices_prediction_idc".enum("", 0x7FFFFFFF)
    ).noPrefix()

    EnumConstant(
        "{@code StdVideoH264ModificationOfPicNumsIdc}",

        "std_video_h264_modification_of_pic_nums_idc_short_term_subtract".enum("", "0"),
        "std_video_h264_modification_of_pic_nums_idc_short_term_add".enum,
        "std_video_h264_modification_of_pic_nums_idc_long_term".enum,
        "std_video_h264_modification_of_pic_nums_idc_end".enum,
        "std_video_h264_modification_of_pic_nums_idc_invalid".enum("", 0x7FFFFFFF)
    ).noPrefix()

    EnumConstant(
        "{@code StdVideoH264MemMgmtControlOp}",

        "std_video_h264_mem_mgmt_control_op_end".enum("", "0"),
        "std_video_h264_mem_mgmt_control_op_unmark_short_term".enum,
        "std_video_h264_mem_mgmt_control_op_unmark_long_term".enum,
        "std_video_h264_mem_mgmt_control_op_mark_long_term".enum,
        "std_video_h264_mem_mgmt_control_op_set_max_long_term_index".enum,
        "std_video_h264_mem_mgmt_control_op_unmark_all".enum,
        "std_video_h264_mem_mgmt_control_op_mark_current_as_long_term".enum,
        "std_video_h264_mem_mgmt_control_op_invalid".enum("", 0x7FFFFFFF)
    ).noPrefix()

    EnumConstant(
        "{@code StdVideoH264CabacInitIdc}",

        "std_video_h264_cabac_init_idc_0".enum("", "0"),
        "std_video_h264_cabac_init_idc_1".enum,
        "std_video_h264_cabac_init_idc_2".enum,
        "std_video_h264_cabac_init_idc_invalid".enum("", 0x7FFFFFFF)
    ).noPrefix()

    EnumConstant(
        "{@code StdVideoH264DisableDeblockingFilterIdc}",

        "std_video_h264_disable_deblocking_filter_idc_disabled".enum("", "0"),
        "std_video_h264_disable_deblocking_filter_idc_enabled".enum,
        "std_video_h264_disable_deblocking_filter_idc_partial".enum,
        "std_video_h264_disable_deblocking_filter_idc_invalid".enum("", 0x7FFFFFFF)
    ).noPrefix()

    EnumConstant(
        "{@code StdVideoH264PictureType}",

        "std_video_h264_picture_type_i".enum("", "0"),
        "std_video_h264_picture_type_p".enum,
        "std_video_h264_picture_type_b".enum,
        "std_video_h264_picture_type_invalid".enum("", 0x7FFFFFFF)
    ).noPrefix()

    EnumConstant(
        "{@code StdVideoH264SliceType}",

        "std_video_h264_slice_type_i".enum("", "0"),
        "std_video_h264_slice_type_p".enum,
        "std_video_h264_slice_type_b".enum,
        "std_video_h264_slice_type_invalid".enum("", 0x7FFFFFFF)
    ).noPrefix()

    EnumConstant(
        "{@code StdVideoH264NonVclNaluType}",

        "std_video_h264_non_vcl_nalu_type_sps".enum("", "0"),
        "std_video_h264_non_vcl_nalu_type_pps".enum,
        "std_video_h264_non_vcl_nalu_type_aud".enum,
        "std_video_h264_non_vcl_nalu_type_prefix".enum,
        "std_video_h264_non_vcl_nalu_type_end_of_sequence".enum,
        "std_video_h264_non_vcl_nalu_type_end_of_stream".enum,
        "std_video_h264_non_vcl_nalu_type_precoded".enum,
        "std_video_h264_non_vcl_nalu_type_invalid".enum("", 0x7FFFFFFF)
    ).noPrefix()
}