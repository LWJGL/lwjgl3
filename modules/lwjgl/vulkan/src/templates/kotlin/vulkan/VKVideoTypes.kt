/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package vulkan

import org.lwjgl.generator.*

const val STD = "STD"

val uint32_tb = PrimitiveType("uint32_t", PrimitiveMapping.BOOLEAN4)

// vulkan_video_codec_h264std.h

val StdVideoH264AspectRatioIdc = "StdVideoH264AspectRatioIdc".enumType
val StdVideoH264CabacInitIdc = "StdVideoH264CabacInitIdc".enumType
val StdVideoH264ChromaFormatIdc = "StdVideoH264ChromaFormatIdc".enumType
val StdVideoH264DisableDeblockingFilterIdc = "StdVideoH264DisableDeblockingFilterIdc".enumType
val StdVideoH264LevelIdc = "StdVideoH264LevelIdc".enumType
val StdVideoH264MemMgmtControlOp = "StdVideoH264MemMgmtControlOp".enumType
val StdVideoH264ModificationOfPicNumsIdc = "StdVideoH264ModificationOfPicNumsIdc".enumType
val StdVideoH264NonVclNaluType = "StdVideoH264NonVclNaluType".enumType
val StdVideoH264PictureType = "StdVideoH264PictureType".enumType
val StdVideoH264PocType = "StdVideoH264PocType".enumType
val StdVideoH264ProfileIdc = "StdVideoH264ProfileIdc".enumType
val StdVideoH264SliceType = "StdVideoH264SliceType".enumType
val StdVideoH264WeightedBipredIdc = "StdVideoH264WeightedBipredIdc".enumType

val StdVideoH264SpsVuiFlags = struct(Module.VULKAN, "StdVideoH264SpsVuiFlags") {
    subpackage = "video"

    uint32_tb("aspect_ratio_info_present_flag", bits = 1)
    uint32_tb("overscan_info_present_flag", bits = 1)
    uint32_tb("overscan_appropriate_flag", bits = 1)
    uint32_tb("video_signal_type_present_flag", bits = 1)
    uint32_tb("video_full_range_flag", bits = 1)
    uint32_tb("color_description_present_flag", bits = 1)
    uint32_tb("chroma_loc_info_present_flag", bits = 1)
    uint32_tb("timing_info_present_flag", bits = 1)
    uint32_tb("fixed_frame_rate_flag", bits = 1)
    uint32_tb("bitstream_restriction_flag", bits = 1)
    uint32_tb("nal_hrd_parameters_present_flag", bits = 1)
    uint32_tb("vcl_hrd_parameters_present_flag", bits = 1)
}

val StdVideoH264HrdParameters = struct(Module.VULKAN, "StdVideoH264HrdParameters") {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideoCodecH264.*")

    uint8_t("cpb_cnt_minus1")
    uint8_t("bit_rate_scale")
    uint8_t("cpb_size_scale")
    uint8_t("reserved1").private()
    uint32_t("bit_rate_value_minus1")["STD_VIDEO_H264_CPB_CNT_LIST_SIZE"]
    uint32_t("cpb_size_value_minus1")["STD_VIDEO_H264_CPB_CNT_LIST_SIZE"]
    uint8_t("cbr_flag")["STD_VIDEO_H264_CPB_CNT_LIST_SIZE"]
    uint32_t("initial_cpb_removal_delay_length_minus1")
    uint32_t("cpb_removal_delay_length_minus1")
    uint32_t("dpb_output_delay_length_minus1")
    uint32_t("time_offset_length")
}

val StdVideoH264SequenceParameterSetVui = struct(Module.VULKAN, "StdVideoH264SequenceParameterSetVui") {
    subpackage = "video"

    StdVideoH264SpsVuiFlags("flags")
    StdVideoH264AspectRatioIdc("aspect_ratio_idc")
    uint16_t("sar_width")
    uint16_t("sar_height")
    uint8_t("video_format")
    uint8_t("colour_primaries")
    uint8_t("transfer_characteristics")
    uint8_t("matrix_coefficients")
    uint32_t("num_units_in_tick")
    uint32_t("time_scale")
    uint8_t("max_num_reorder_frames")
    uint8_t("max_dec_frame_buffering")
    uint8_t("chroma_sample_loc_type_top_field")
    uint8_t("chroma_sample_loc_type_bottom_field")
    uint32_t("reserved1").private()
    StdVideoH264HrdParameters.const.p("pHrdParameters")
}

val StdVideoH264SpsFlags = struct(Module.VULKAN, "StdVideoH264SpsFlags") {
    subpackage = "video"

    uint32_tb("constraint_set0_flag", bits = 1)
    uint32_tb("constraint_set1_flag", bits = 1)
    uint32_tb("constraint_set2_flag", bits = 1)
    uint32_tb("constraint_set3_flag", bits = 1)
    uint32_tb("constraint_set4_flag", bits = 1)
    uint32_tb("constraint_set5_flag", bits = 1)
    uint32_tb("direct_8x8_inference_flag", bits = 1)
    uint32_tb("mb_adaptive_frame_field_flag", bits = 1)
    uint32_tb("frame_mbs_only_flag", bits = 1)
    uint32_tb("delta_pic_order_always_zero_flag", bits = 1)
    uint32_tb("separate_colour_plane_flag", bits = 1)
    uint32_tb("gaps_in_frame_num_value_allowed_flag", bits = 1)
    uint32_tb("qpprime_y_zero_transform_bypass_flag", bits = 1)
    uint32_tb("frame_cropping_flag", bits = 1)
    uint32_tb("seq_scaling_matrix_present_flag", bits = 1)
    uint32_tb("vui_parameters_present_flag", bits = 1)
}

val StdVideoH264ScalingLists = struct(Module.VULKAN, "StdVideoH264ScalingLists") {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideoCodecH264.*")

    uint16_t("scaling_list_present_mask")
    uint16_t("use_default_scaling_matrix_mask")
    uint8_t("ScalingList4x4")["STD_VIDEO_H264_SCALING_LIST_4X4_NUM_LISTS"]["STD_VIDEO_H264_SCALING_LIST_4X4_NUM_ELEMENTS"]
    uint8_t("ScalingList8x8")["STD_VIDEO_H264_SCALING_LIST_8X8_NUM_LISTS"]["STD_VIDEO_H264_SCALING_LIST_8X8_NUM_ELEMENTS"]
}

val StdVideoH264SequenceParameterSet = struct(Module.VULKAN, "StdVideoH264SequenceParameterSet") {
    subpackage = "video"

    StdVideoH264SpsFlags("flags")
    StdVideoH264ProfileIdc("profile_idc")
    StdVideoH264LevelIdc("level_idc")
    StdVideoH264ChromaFormatIdc("chroma_format_idc")
    uint8_t("seq_parameter_set_id")
    uint8_t("bit_depth_luma_minus8")
    uint8_t("bit_depth_chroma_minus8")
    uint8_t("log2_max_frame_num_minus4")
    StdVideoH264PocType("pic_order_cnt_type")
    int32_t("offset_for_non_ref_pic")
    int32_t("offset_for_top_to_bottom_field")
    uint8_t("log2_max_pic_order_cnt_lsb_minus4")
    AutoSize("pOffsetForRefFrame")..uint8_t("num_ref_frames_in_pic_order_cnt_cycle")
    uint8_t("max_num_ref_frames")
    uint8_t("reserved1").private()
    uint32_t("pic_width_in_mbs_minus1")
    uint32_t("pic_height_in_map_units_minus1")
    uint32_t("frame_crop_left_offset")
    uint32_t("frame_crop_right_offset")
    uint32_t("frame_crop_top_offset")
    uint32_t("frame_crop_bottom_offset")
    uint32_t("reserved2").private()
    nullable..int32_t.const.p("pOffsetForRefFrame")
    StdVideoH264ScalingLists.const.p("pScalingLists")
    StdVideoH264SequenceParameterSetVui.const.p("pSequenceParameterSetVui")
}

val StdVideoH264PpsFlags = struct(Module.VULKAN, "StdVideoH264PpsFlags") {
    subpackage = "video"

    uint32_tb("transform_8x8_mode_flag", bits = 1)
    uint32_tb("redundant_pic_cnt_present_flag", bits = 1)
    uint32_tb("constrained_intra_pred_flag", bits = 1)
    uint32_tb("deblocking_filter_control_present_flag", bits = 1)
    uint32_tb("weighted_pred_flag", bits = 1)
    uint32_tb("bottom_field_pic_order_in_frame_present_flag", bits = 1)
    uint32_tb("entropy_coding_mode_flag", bits = 1)
    uint32_tb("pic_scaling_matrix_present_flag", bits = 1)
}

val StdVideoH264PictureParameterSet = struct(Module.VULKAN, "StdVideoH264PictureParameterSet") {
    subpackage = "video"

    StdVideoH264PpsFlags("flags")
    uint8_t("seq_parameter_set_id")
    uint8_t("pic_parameter_set_id")
    uint8_t("num_ref_idx_l0_default_active_minus1")
    uint8_t("num_ref_idx_l1_default_active_minus1")
    StdVideoH264WeightedBipredIdc("weighted_bipred_idc")
    int8_t("pic_init_qp_minus26")
    int8_t("pic_init_qs_minus26")
    int8_t("chroma_qp_index_offset")
    int8_t("second_chroma_qp_index_offset")
    StdVideoH264ScalingLists.const.p("pScalingLists")
}

// vulkan_video_codec_h264std_decode.h

val StdVideoDecodeH264PictureInfoFlags = struct(Module.VULKAN, "StdVideoDecodeH264PictureInfoFlags") {
    subpackage = "video"

    uint32_tb("field_pic_flag", bits = 1)
    uint32_tb("is_intra", bits = 1)
    uint32_tb("IdrPicFlag", bits = 1)
    uint32_tb("bottom_field_flag", bits = 1)
    uint32_tb("is_reference", bits = 1)
    uint32_tb("complementary_field_pair", bits = 1)
}

val StdVideoDecodeH264PictureInfo = struct(Module.VULKAN, "StdVideoDecodeH264PictureInfo") {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideoCodecH264.*")

    StdVideoDecodeH264PictureInfoFlags("flags")
    uint8_t("seq_parameter_set_id")
    uint8_t("pic_parameter_set_id")
    uint8_t("reserved1").private()
    uint8_t("reserved2").private()
    uint16_t("frame_num")
    uint16_t("idr_pic_id")
    int32_t("PicOrderCnt")["STD_VIDEO_DECODE_H264_FIELD_ORDER_COUNT_LIST_SIZE"]
}

val StdVideoDecodeH264ReferenceInfoFlags = struct(Module.VULKAN, "StdVideoDecodeH264ReferenceInfoFlags") {
    subpackage = "video"

    uint32_tb("top_field_flag", bits = 1)
    uint32_tb("bottom_field_flag", bits = 1)
    uint32_tb("used_for_long_term_reference", bits = 1)
    uint32_tb("is_non_existing", bits = 1)
}

val StdVideoDecodeH264ReferenceInfo = struct(Module.VULKAN, "StdVideoDecodeH264ReferenceInfo") {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideoCodecH264.*")

    StdVideoDecodeH264ReferenceInfoFlags("flags")
    uint16_t("FrameNum")
    uint16_t("reserved").private()
    int32_t("PicOrderCnt")["STD_VIDEO_DECODE_H264_FIELD_ORDER_COUNT_LIST_SIZE"]
}

// vulkan_video_codec_h264std_encode.h

val StdVideoEncodeH264WeightTableFlags = struct(Module.VULKAN, "StdVideoEncodeH264WeightTableFlags") {
    subpackage = "video"

    uint32_t("luma_weight_l0_flag")
    uint32_t("chroma_weight_l0_flag")
    uint32_t("luma_weight_l1_flag")
    uint32_t("chroma_weight_l1_flag")
}

val StdVideoEncodeH264WeightTable = struct(Module.VULKAN, "StdVideoEncodeH264WeightTable") {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideoCodecH264.*")

    StdVideoEncodeH264WeightTableFlags("flags")
    uint8_t("luma_log2_weight_denom")
    uint8_t("chroma_log2_weight_denom")
    int8_t("luma_weight_l0")["STD_VIDEO_H264_MAX_NUM_LIST_REF"]
    int8_t("luma_offset_l0")["STD_VIDEO_H264_MAX_NUM_LIST_REF"]
    int8_t("chroma_weight_l0")["STD_VIDEO_H264_MAX_NUM_LIST_REF"]["STD_VIDEO_H264_MAX_CHROMA_PLANES"]
    int8_t("chroma_offset_l0")["STD_VIDEO_H264_MAX_NUM_LIST_REF"]["STD_VIDEO_H264_MAX_CHROMA_PLANES"]
    int8_t("luma_weight_l1")["STD_VIDEO_H264_MAX_NUM_LIST_REF"]
    int8_t("luma_offset_l1")["STD_VIDEO_H264_MAX_NUM_LIST_REF"]
    int8_t("chroma_weight_l1")["STD_VIDEO_H264_MAX_NUM_LIST_REF"]["STD_VIDEO_H264_MAX_CHROMA_PLANES"]
    int8_t("chroma_offset_l1")["STD_VIDEO_H264_MAX_NUM_LIST_REF"]["STD_VIDEO_H264_MAX_CHROMA_PLANES"]
}

val StdVideoEncodeH264SliceHeaderFlags = struct(Module.VULKAN, "StdVideoEncodeH264SliceHeaderFlags") {
    subpackage = "video"

    uint32_tb("direct_spatial_mv_pred_flag", bits = 1)
    uint32_tb("num_ref_idx_active_override_flag", bits = 1)
    uint32_tb("reserved", bits = 30).private()
}

val StdVideoEncodeH264PictureInfoFlags = struct(Module.VULKAN, "StdVideoEncodeH264PictureInfoFlags") {
    subpackage = "video"

    uint32_tb("IdrPicFlag", bits = 1)
    uint32_tb("is_reference", bits = 1)
    uint32_tb("no_output_of_prior_pics_flag", bits = 1)
    uint32_tb("long_term_reference_flag", bits = 1)
    uint32_tb("adaptive_ref_pic_marking_mode_flag", bits = 1)
    uint32_tb("reserved", bits = 27).private()
}

val StdVideoEncodeH264ReferenceInfoFlags = struct(Module.VULKAN, "StdVideoEncodeH264ReferenceInfoFlags") {
    subpackage = "video"

    uint32_tb("used_for_long_term_reference", bits = 1)
    uint32_tb("reserved", bits = 31).private()
}

val StdVideoEncodeH264ReferenceListsInfoFlags = struct(Module.VULKAN, "StdVideoEncodeH264ReferenceListsInfoFlags") {
    subpackage = "video"

    uint32_tb("ref_pic_list_modification_l0_flag", bits = 1)
    uint32_tb("ref_pic_list_modification_l1_flag", bits = 1)
    uint32_tb("reserved", bits = 30).private()
}

val StdVideoEncodeH264RefListModEntry = struct(Module.VULKAN, "StdVideoEncodeH264RefListModEntry") {
    subpackage = "video"

    StdVideoH264ModificationOfPicNumsIdc("modification_of_pic_nums_idc")
    uint16_t("abs_diff_pic_num_minus1")
    uint16_t("long_term_pic_num")
}

val StdVideoEncodeH264RefPicMarkingEntry = struct(Module.VULKAN, "StdVideoEncodeH264RefPicMarkingEntry") {
    subpackage = "video"

    StdVideoH264MemMgmtControlOp("memory_management_control_operation")
    uint16_t("difference_of_pic_nums_minus1")
    uint16_t("long_term_pic_num")
    uint16_t("long_term_frame_idx")
    uint16_t("max_long_term_frame_idx_plus1")
}

val StdVideoEncodeH264ReferenceListsInfo = struct(Module.VULKAN, "StdVideoEncodeH264ReferenceListsInfo") {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideoCodecH264.*")

    StdVideoEncodeH264ReferenceListsInfoFlags("flags")
    uint8_t("num_ref_idx_l0_active_minus1")
    uint8_t("num_ref_idx_l1_active_minus1")
    uint8_t("RefPicList0")["STD_VIDEO_H264_MAX_NUM_LIST_REF"]
    uint8_t("RefPicList1")["STD_VIDEO_H264_MAX_NUM_LIST_REF"]
    AutoSize("pRefList0ModOperations")..uint8_t("refList0ModOpCount")
    AutoSize("pRefList1ModOperations")..uint8_t("refList1ModOpCount")
    AutoSize("pRefPicMarkingOperations")..uint8_t("refPicMarkingOpCount")
    uint8_t("reserved1")["7"].private()
    nullable..StdVideoEncodeH264RefListModEntry.const.p("pRefList0ModOperations")
    nullable..StdVideoEncodeH264RefListModEntry.const.p("pRefList1ModOperations")
    StdVideoEncodeH264RefPicMarkingEntry.const.p("pRefPicMarkingOperations")
}

val StdVideoEncodeH264PictureInfo = struct(Module.VULKAN, "StdVideoEncodeH264PictureInfo") {
    subpackage = "video"

    StdVideoEncodeH264PictureInfoFlags("flags")
    uint8_t("seq_parameter_set_id")
    uint8_t("pic_parameter_set_id")
    uint16_t("idr_pic_id")
    StdVideoH264PictureType("primary_pic_type")
    uint32_t("frame_num")
    int32_t("PicOrderCnt")
    uint8_t("temporal_id")
    uint8_t("reserved1")[3].private()
    StdVideoEncodeH264ReferenceListsInfo.const.p("pRefLists")
}

val StdVideoEncodeH264ReferenceInfo = struct(Module.VULKAN, "StdVideoEncodeH264ReferenceInfo") {
    subpackage = "video"

    StdVideoEncodeH264ReferenceInfoFlags("flags")
    StdVideoH264PictureType("primary_pic_type")
    uint32_t("FrameNum")
    int32_t("PicOrderCnt")
    uint16_t("long_term_pic_num")
    uint16_t("long_term_frame_idx")
    uint8_t("temporal_id")
}

val StdVideoEncodeH264SliceHeader = struct(Module.VULKAN, "StdVideoEncodeH264SliceHeader") {
    subpackage = "video"

    StdVideoEncodeH264SliceHeaderFlags("flags")
    uint32_t("first_mb_in_slice")
    StdVideoH264SliceType("slice_type")
    int8_t("slice_alpha_c0_offset_div2")
    int8_t("slice_beta_offset_div2")
    int8_t("slice_qp_delta")
    uint8_t("reserved1").private()
    StdVideoH264CabacInitIdc("cabac_init_idc")
    StdVideoH264DisableDeblockingFilterIdc("disable_deblocking_filter_idc")
    StdVideoEncodeH264WeightTable.const.p("pWeightTable")
}

// vulkan_video_codec_h265std.h

val StdVideoH265AspectRatioIdc = "StdVideoH265AspectRatioIdc".enumType
val StdVideoH265ChromaFormatIdc = "StdVideoH265ChromaFormatIdc".enumType
val StdVideoH265LevelIdc = "StdVideoH265LevelIdc".enumType
val StdVideoH265PictureType = "StdVideoH265PictureType".enumType
val StdVideoH265ProfileIdc = "StdVideoH265ProfileIdc".enumType
val StdVideoH265SliceType = "StdVideoH265SliceType".enumType

val StdVideoH265DecPicBufMgr = struct(Module.VULKAN, "StdVideoH265DecPicBufMgr") {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideoCodecH265.*")

    uint32_t("max_latency_increase_plus1")["STD_VIDEO_H265_SUBLAYERS_LIST_SIZE"]
    uint8_t("max_dec_pic_buffering_minus1")["STD_VIDEO_H265_SUBLAYERS_LIST_SIZE"]
    uint8_t("max_num_reorder_pics")["STD_VIDEO_H265_SUBLAYERS_LIST_SIZE"]
}

val StdVideoH265SubLayerHrdParameters = struct(Module.VULKAN, "StdVideoH265SubLayerHrdParameters") {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideoCodecH265.*")

    uint32_t("bit_rate_value_minus1")["STD_VIDEO_H265_CPB_CNT_LIST_SIZE"]
    uint32_t("cpb_size_value_minus1")["STD_VIDEO_H265_CPB_CNT_LIST_SIZE"]
    uint32_t("cpb_size_du_value_minus1")["STD_VIDEO_H265_CPB_CNT_LIST_SIZE"]
    uint32_t("bit_rate_du_value_minus1")["STD_VIDEO_H265_CPB_CNT_LIST_SIZE"]
    uint32_t("cbr_flag")
}

val StdVideoH265HrdFlags = struct(Module.VULKAN, "StdVideoH265HrdFlags") {
    subpackage = "video"

    uint32_tb("nal_hrd_parameters_present_flag", bits = 1)
    uint32_tb("vcl_hrd_parameters_present_flag", bits = 1)
    uint32_tb("sub_pic_hrd_params_present_flag", bits = 1)
    uint32_tb("sub_pic_cpb_params_in_pic_timing_sei_flag", bits = 1)
    uint32_t("fixed_pic_rate_general_flag", bits = 8)
    uint32_t("fixed_pic_rate_within_cvs_flag", bits = 8)
    uint32_t("low_delay_hrd_flag", bits = 8)
}

val StdVideoH265HrdParameters = struct(Module.VULKAN, "StdVideoH265HrdParameters") {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideoCodecH265.*")

    StdVideoH265HrdFlags("flags")
    uint8_t("tick_divisor_minus2")
    uint8_t("du_cpb_removal_delay_increment_length_minus1")
    uint8_t("dpb_output_delay_du_length_minus1")
    uint8_t("bit_rate_scale")
    uint8_t("cpb_size_scale")
    uint8_t("cpb_size_du_scale")
    uint8_t("initial_cpb_removal_delay_length_minus1")
    uint8_t("au_cpb_removal_delay_length_minus1")
    uint8_t("dpb_output_delay_length_minus1")
    uint8_t("cpb_cnt_minus1")["STD_VIDEO_H265_SUBLAYERS_LIST_SIZE"]
    uint16_t("elemental_duration_in_tc_minus1")["STD_VIDEO_H265_SUBLAYERS_LIST_SIZE"]
    uint16_t("reserved")[3].private()
    StdVideoH265SubLayerHrdParameters.const.p("pSubLayerHrdParametersNal")
    StdVideoH265SubLayerHrdParameters.const.p("pSubLayerHrdParametersVcl")
}

val StdVideoH265VpsFlags = struct(Module.VULKAN, "StdVideoH265VpsFlags") {
    subpackage = "video"

    uint32_tb("vps_temporal_id_nesting_flag", bits = 1)
    uint32_tb("vps_sub_layer_ordering_info_present_flag", bits = 1)
    uint32_tb("vps_timing_info_present_flag", bits = 1)
    uint32_tb("vps_poc_proportional_to_timing_flag", bits = 1)
}

val StdVideoH265ProfileTierLevelFlags = struct(Module.VULKAN, "StdVideoH265ProfileTierLevelFlags") {
    subpackage = "video"

    uint32_tb("general_tier_flag", bits = 1)
    uint32_tb("general_progressive_source_flag", bits = 1)
    uint32_tb("general_interlaced_source_flag", bits = 1)
    uint32_tb("general_non_packed_constraint_flag", bits = 1)
    uint32_tb("general_frame_only_constraint_flag", bits = 1)
}

val StdVideoH265ProfileTierLevel = struct(Module.VULKAN, "StdVideoH265ProfileTierLevel") {
    subpackage = "video"

    StdVideoH265ProfileTierLevelFlags("flags")
    StdVideoH265ProfileIdc("general_profile_idc")
    StdVideoH265LevelIdc("general_level_idc")
}

val StdVideoH265VideoParameterSet = struct(Module.VULKAN, "StdVideoH265VideoParameterSet") {
    subpackage = "video"

    StdVideoH265VpsFlags("flags")
    uint8_t("vps_video_parameter_set_id")
    uint8_t("vps_max_sub_layers_minus1")
    uint8_t("reserved1").private()
    uint8_t("reserved2").private()
    uint32_t("vps_num_units_in_tick")
    uint32_t("vps_time_scale")
    uint32_t("vps_num_ticks_poc_diff_one_minus1")
    uint32_t("reserved3").private()
    StdVideoH265DecPicBufMgr.const.p("pDecPicBufMgr")
    StdVideoH265HrdParameters.const.p("pHrdParameters")
    StdVideoH265ProfileTierLevel.const.p("pProfileTierLevel")
}

val StdVideoH265ScalingLists = struct(Module.VULKAN, "StdVideoH265ScalingLists") {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideoCodecH265.*")

    uint8_t("ScalingList4x4")["STD_VIDEO_H265_SCALING_LIST_4X4_NUM_LISTS"]["STD_VIDEO_H265_SCALING_LIST_4X4_NUM_ELEMENTS"]
    uint8_t("ScalingList8x8")["STD_VIDEO_H265_SCALING_LIST_8X8_NUM_LISTS"]["STD_VIDEO_H265_SCALING_LIST_8X8_NUM_ELEMENTS"]
    uint8_t("ScalingList16x16")["STD_VIDEO_H265_SCALING_LIST_16X16_NUM_LISTS"]["STD_VIDEO_H265_SCALING_LIST_16X16_NUM_ELEMENTS"]
    uint8_t("ScalingList32x32")["STD_VIDEO_H265_SCALING_LIST_32X32_NUM_LISTS"]["STD_VIDEO_H265_SCALING_LIST_32X32_NUM_ELEMENTS"]
    uint8_t("ScalingListDCCoef16x16")["STD_VIDEO_H265_SCALING_LIST_16X16_NUM_LISTS"]
    uint8_t("ScalingListDCCoef32x32")["STD_VIDEO_H265_SCALING_LIST_32X32_NUM_LISTS"]
}

val StdVideoH265SpsVuiFlags = struct(Module.VULKAN, "StdVideoH265SpsVuiFlags") {
    subpackage = "video"

    uint32_tb("aspect_ratio_info_present_flag", bits = 1)
    uint32_tb("overscan_info_present_flag", bits = 1)
    uint32_tb("overscan_appropriate_flag", bits = 1)
    uint32_tb("video_signal_type_present_flag", bits = 1)
    uint32_tb("video_full_range_flag", bits = 1)
    uint32_tb("colour_description_present_flag", bits = 1)
    uint32_tb("chroma_loc_info_present_flag", bits = 1)
    uint32_tb("neutral_chroma_indication_flag", bits = 1)
    uint32_tb("field_seq_flag", bits = 1)
    uint32_tb("frame_field_info_present_flag", bits = 1)
    uint32_tb("default_display_window_flag", bits = 1)
    uint32_tb("vui_timing_info_present_flag", bits = 1)
    uint32_tb("vui_poc_proportional_to_timing_flag", bits = 1)
    uint32_tb("vui_hrd_parameters_present_flag", bits = 1)
    uint32_tb("bitstream_restriction_flag", bits = 1)
    uint32_tb("tiles_fixed_structure_flag", bits = 1)
    uint32_tb("motion_vectors_over_pic_boundaries_flag", bits = 1)
    uint32_tb("restricted_ref_pic_lists_flag", bits = 1)
}

val StdVideoH265SequenceParameterSetVui = struct(Module.VULKAN, "StdVideoH265SequenceParameterSetVui") {
    subpackage = "video"

    StdVideoH265SpsVuiFlags("flags")
    StdVideoH265AspectRatioIdc("aspect_ratio_idc")
    uint16_t("sar_width")
    uint16_t("sar_height")
    uint8_t("video_format")
    uint8_t("colour_primaries")
    uint8_t("transfer_characteristics")
    uint8_t("matrix_coeffs")
    uint8_t("chroma_sample_loc_type_top_field")
    uint8_t("chroma_sample_loc_type_bottom_field")
    uint8_t("reserved1").private()
    uint8_t("reserved2").private()
    uint16_t("def_disp_win_left_offset")
    uint16_t("def_disp_win_right_offset")
    uint16_t("def_disp_win_top_offset")
    uint16_t("def_disp_win_bottom_offset")
    uint32_t("vui_num_units_in_tick")
    uint32_t("vui_time_scale")
    uint32_t("vui_num_ticks_poc_diff_one_minus1")
    uint16_t("min_spatial_segmentation_idc")
    uint16_t("reserved3").private()
    uint8_t("max_bytes_per_pic_denom")
    uint8_t("max_bits_per_min_cu_denom")
    uint8_t("log2_max_mv_length_horizontal")
    uint8_t("log2_max_mv_length_vertical")
    StdVideoH265HrdParameters.const.p("pHrdParameters")
}

val StdVideoH265PredictorPaletteEntries = struct(Module.VULKAN, "StdVideoH265PredictorPaletteEntries") {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideoCodecH265.*")

    uint16_t("PredictorPaletteEntries")["STD_VIDEO_H265_PREDICTOR_PALETTE_COMPONENTS_LIST_SIZE"]["STD_VIDEO_H265_PREDICTOR_PALETTE_COMP_ENTRIES_LIST_SIZE"]
}

val StdVideoH265SpsFlags = struct(Module.VULKAN, "StdVideoH265SpsFlags") {
    subpackage = "video"

    uint32_tb("sps_temporal_id_nesting_flag", bits = 1)
    uint32_tb("separate_colour_plane_flag", bits = 1)
    uint32_tb("conformance_window_flag", bits = 1)
    uint32_tb("sps_sub_layer_ordering_info_present_flag", bits = 1)
    uint32_tb("scaling_list_enabled_flag", bits = 1)
    uint32_tb("sps_scaling_list_data_present_flag", bits = 1)
    uint32_tb("amp_enabled_flag", bits = 1)
    uint32_tb("sample_adaptive_offset_enabled_flag", bits = 1)
    uint32_tb("pcm_enabled_flag", bits = 1)
    uint32_tb("pcm_loop_filter_disabled_flag", bits = 1)
    uint32_tb("long_term_ref_pics_present_flag", bits = 1)
    uint32_tb("sps_temporal_mvp_enabled_flag", bits = 1)
    uint32_tb("strong_intra_smoothing_enabled_flag", bits = 1)
    uint32_tb("vui_parameters_present_flag", bits = 1)
    uint32_tb("sps_extension_present_flag", bits = 1)
    uint32_tb("sps_range_extension_flag", bits = 1)
    uint32_tb("transform_skip_rotation_enabled_flag", bits = 1)
    uint32_tb("transform_skip_context_enabled_flag", bits = 1)
    uint32_tb("implicit_rdpcm_enabled_flag", bits = 1)
    uint32_tb("explicit_rdpcm_enabled_flag", bits = 1)
    uint32_tb("extended_precision_processing_flag", bits = 1)
    uint32_tb("intra_smoothing_disabled_flag", bits = 1)
    uint32_tb("high_precision_offsets_enabled_flag", bits = 1)
    uint32_tb("persistent_rice_adaptation_enabled_flag", bits = 1)
    uint32_tb("cabac_bypass_alignment_enabled_flag", bits = 1)
    uint32_tb("sps_scc_extension_flag", bits = 1)
    uint32_tb("sps_curr_pic_ref_enabled_flag", bits = 1)
    uint32_tb("palette_mode_enabled_flag", bits = 1)
    uint32_tb("sps_palette_predictor_initializers_present_flag", bits = 1)
    uint32_tb("sps_palette_predictor_initializer_present_flag", bits = 1)
    uint32_tb("intra_boundary_filtering_disabled_flag", bits = 1)
}

val StdVideoH265ShortTermRefPicSetFlags = struct(Module.VULKAN, "StdVideoH265ShortTermRefPicSetFlags") {
    subpackage = "video"

    uint32_tb("inter_ref_pic_set_prediction_flag", bits = 1)
    uint32_tb("delta_rps_sign", bits = 1)
}

val StdVideoH265ShortTermRefPicSet = struct(Module.VULKAN, "StdVideoH265ShortTermRefPicSet") {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideoCodecH265.*")

    StdVideoH265ShortTermRefPicSetFlags("flags")
    uint32_t("delta_idx_minus1")
    uint16_t("use_delta_flag")
    uint16_t("abs_delta_rps_minus1")
    uint16_t("used_by_curr_pic_flag")
    uint16_t("used_by_curr_pic_s0_flag")
    uint16_t("used_by_curr_pic_s1_flag")
    uint16_t("reserved1").private()
    uint8_t("reserved2").private()
    uint8_t("reserved3").private()
    uint8_t("num_negative_pics")
    uint8_t("num_positive_pics")
    uint16_t("delta_poc_s0_minus1")["STD_VIDEO_H265_MAX_DPB_SIZE"];
    uint16_t("delta_poc_s1_minus1")["STD_VIDEO_H265_MAX_DPB_SIZE"];
}

val StdVideoH265LongTermRefPicsSps = struct(Module.VULKAN, "StdVideoH265LongTermRefPicsSps") {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideoCodecH265.*")

    uint32_t("used_by_curr_pic_lt_sps_flag")
    uint32_t("lt_ref_pic_poc_lsb_sps")["STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS"]
}

val StdVideoH265SequenceParameterSet = struct(Module.VULKAN, "StdVideoH265SequenceParameterSet") {
    subpackage = "video"

    StdVideoH265SpsFlags("flags")
    StdVideoH265ChromaFormatIdc("chroma_format_idc")
    uint32_t("pic_width_in_luma_samples")
    uint32_t("pic_height_in_luma_samples")
    uint8_t("sps_video_parameter_set_id")
    uint8_t("sps_max_sub_layers_minus1")
    uint8_t("sps_seq_parameter_set_id")
    uint8_t("bit_depth_luma_minus8")
    uint8_t("bit_depth_chroma_minus8")
    uint8_t("log2_max_pic_order_cnt_lsb_minus4")
    uint8_t("sps_max_dec_pic_buffering_minus1")
    uint8_t("log2_min_luma_coding_block_size_minus3")
    uint8_t("log2_diff_max_min_luma_coding_block_size")
    uint8_t("log2_min_luma_transform_block_size_minus2")
    uint8_t("log2_diff_max_min_luma_transform_block_size")
    uint8_t("max_transform_hierarchy_depth_inter")
    uint8_t("max_transform_hierarchy_depth_intra")
    uint8_t("num_short_term_ref_pic_sets")
    uint8_t("num_long_term_ref_pics_sps")
    uint8_t("pcm_sample_bit_depth_luma_minus1")
    uint8_t("pcm_sample_bit_depth_chroma_minus1")
    uint8_t("log2_min_pcm_luma_coding_block_size_minus3")
    uint8_t("log2_diff_max_min_pcm_luma_coding_block_size")
    uint8_t("reserved1").private()
    uint8_t("reserved2").private()
    uint8_t("palette_max_size")
    uint8_t("delta_palette_max_predictor_size")
    uint8_t("motion_vector_resolution_control_idc")
    uint8_t("sps_num_palette_predictor_initializer_minus1")
    uint32_t("conf_win_left_offset")
    uint32_t("conf_win_right_offset")
    uint32_t("conf_win_top_offset")
    uint32_t("conf_win_bottom_offset")
    StdVideoH265ProfileTierLevel.const.p("pProfileTierLevel")
    StdVideoH265DecPicBufMgr.const.p("pDecPicBufMgr")
    StdVideoH265ScalingLists.const.p("pScalingLists")
    StdVideoH265ShortTermRefPicSet.const.p("pShortTermRefPicSet")
    StdVideoH265LongTermRefPicsSps.const.p("pLongTermRefPicsSps")
    StdVideoH265SequenceParameterSetVui.const.p("pSequenceParameterSetVui")
    StdVideoH265PredictorPaletteEntries.const.p("pPredictorPaletteEntries")
}

val StdVideoH265PpsFlags = struct(Module.VULKAN, "StdVideoH265PpsFlags") {
    subpackage = "video"

    uint32_tb("dependent_slice_segments_enabled_flag", bits = 1)
    uint32_tb("output_flag_present_flag", bits = 1)
    uint32_tb("sign_data_hiding_enabled_flag", bits = 1)
    uint32_tb("cabac_init_present_flag", bits = 1)
    uint32_tb("constrained_intra_pred_flag", bits = 1)
    uint32_tb("transform_skip_enabled_flag", bits = 1)
    uint32_tb("cu_qp_delta_enabled_flag", bits = 1)
    uint32_tb("pps_slice_chroma_qp_offsets_present_flag", bits = 1)
    uint32_tb("weighted_pred_flag", bits = 1)
    uint32_tb("weighted_bipred_flag", bits = 1)
    uint32_tb("transquant_bypass_enabled_flag", bits = 1)
    uint32_tb("tiles_enabled_flag", bits = 1)
    uint32_tb("entropy_coding_sync_enabled_flag", bits = 1)
    uint32_tb("uniform_spacing_flag", bits = 1)
    uint32_tb("loop_filter_across_tiles_enabled_flag", bits = 1)
    uint32_tb("pps_loop_filter_across_slices_enabled_flag", bits = 1)
    uint32_tb("deblocking_filter_control_present_flag", bits = 1)
    uint32_tb("deblocking_filter_override_enabled_flag", bits = 1)
    uint32_tb("pps_deblocking_filter_disabled_flag", bits = 1)
    uint32_tb("pps_scaling_list_data_present_flag", bits = 1)
    uint32_tb("lists_modification_present_flag", bits = 1)
    uint32_tb("slice_segment_header_extension_present_flag", bits = 1)
    uint32_tb("pps_extension_present_flag", bits = 1)
    uint32_tb("cross_component_prediction_enabled_flag", bits = 1)
    uint32_tb("chroma_qp_offset_list_enabled_flag", bits = 1)
    uint32_tb("pps_curr_pic_ref_enabled_flag", bits = 1)
    uint32_tb("residual_adaptive_colour_transform_enabled_flag", bits = 1)
    uint32_tb("pps_slice_act_qp_offsets_present_flag", bits = 1)
    uint32_tb("pps_palette_predictor_initializers_present_flag", bits = 1)
    uint32_tb("monochrome_palette_flag", bits = 1)
    uint32_tb("pps_range_extension_flag", bits = 1)
}

val StdVideoH265PictureParameterSet = struct(Module.VULKAN, "StdVideoH265PictureParameterSet") {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideoCodecH265.*")

    StdVideoH265PpsFlags("flags")
    uint8_t("pps_pic_parameter_set_id")
    uint8_t("pps_seq_parameter_set_id")
    uint8_t("sps_video_parameter_set_id")
    uint8_t("num_extra_slice_header_bits")
    uint8_t("num_ref_idx_l0_default_active_minus1")
    uint8_t("num_ref_idx_l1_default_active_minus1")
    int8_t("init_qp_minus26")
    uint8_t("diff_cu_qp_delta_depth")
    int8_t("pps_cb_qp_offset")
    int8_t("pps_cr_qp_offset")
    int8_t("pps_beta_offset_div2")
    int8_t("pps_tc_offset_div2")
    uint8_t("log2_parallel_merge_level_minus2")
    uint8_t("log2_max_transform_skip_block_size_minus2")
    uint8_t("diff_cu_chroma_qp_offset_depth")
    uint8_t("chroma_qp_offset_list_len_minus1")
    int8_t("cb_qp_offset_list")["STD_VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE"]
    int8_t("cr_qp_offset_list")["STD_VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE"]
    uint8_t("log2_sao_offset_scale_luma")
    uint8_t("log2_sao_offset_scale_chroma")
    int8_t("pps_act_y_qp_offset_plus5")
    int8_t("pps_act_cb_qp_offset_plus5")
    int8_t("pps_act_cr_qp_offset_plus3")
    uint8_t("pps_num_palette_predictor_initializers")
    uint8_t("luma_bit_depth_entry_minus8")
    uint8_t("chroma_bit_depth_entry_minus8")
    uint8_t("num_tile_columns_minus1")
    uint8_t("num_tile_rows_minus1")
    uint8_t("reserved1").private()
    uint8_t("reserved2").private()
    uint16_t("column_width_minus1")["STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_COLS_LIST_SIZE"]
    uint16_t("row_height_minus1")["STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_ROWS_LIST_SIZE"]
    uint32_t("reserved3").private()
    StdVideoH265ScalingLists.const.p("pScalingLists")
    StdVideoH265PredictorPaletteEntries.const.p("pPredictorPaletteEntries")
}

// vulkan_video_codec_h265std_decode.h

val StdVideoDecodeH265PictureInfoFlags = struct(Module.VULKAN, "StdVideoDecodeH265PictureInfoFlags") {
    subpackage = "video"

    uint32_tb("IrapPicFlag", bits = 1)
    uint32_tb("IdrPicFlag", bits = 1)
    uint32_tb("IsReference", bits = 1)
    uint32_tb("short_term_ref_pic_set_sps_flag", bits = 1)
}

val StdVideoDecodeH265PictureInfo = struct(Module.VULKAN, "StdVideoDecodeH265PictureInfo") {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideoCodecH265.*")

    StdVideoDecodeH265PictureInfoFlags("flags")
    uint8_t("sps_seq_parameter_set_id")
    uint8_t("pps_pic_parameter_set_id")
    uint8_t("NumDeltaPocsOfRefRpsIdx")
    int32_t("PicOrderCntVal")
    uint16_t("NumBitsForSTRefPicSetInSlice")
    uint16_t("reserved").private()
    uint8_t("RefPicSetStCurrBefore")["STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE"]
    uint8_t("RefPicSetStCurrAfter")["STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE"]
    uint8_t("RefPicSetLtCurr")["STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE"]
}

val StdVideoDecodeH265ReferenceInfoFlags = struct(Module.VULKAN, "StdVideoDecodeH265ReferenceInfoFlags") {
    subpackage = "video"

    uint32_tb("used_for_long_term_reference", bits = 1)
    uint32_tb("unused_for_reference", bits = 1);
}

val StdVideoDecodeH265ReferenceInfo = struct(Module.VULKAN, "StdVideoDecodeH265ReferenceInfo") {
    subpackage = "video"

    StdVideoDecodeH265ReferenceInfoFlags("flags")
    int32_t("PicOrderCntVal")
}

// vulkan_video_code_h265std_encode.h

val StdVideoEncodeH265WeightTableFlags = struct(Module.VULKAN, "StdVideoEncodeH265WeightTableFlags") {
    subpackage = "video"

    uint16_t("luma_weight_l0_flag")
    uint16_t("chroma_weight_l0_flag")
    uint16_t("luma_weight_l1_flag")
    uint16_t("chroma_weight_l1_flag")
}

val StdVideoEncodeH265WeightTable = struct(Module.VULKAN, "StdVideoEncodeH265WeightTable") {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideoCodecH265.*")

    StdVideoEncodeH265WeightTableFlags("flags")
    uint8_t("luma_log2_weight_denom")
    int8_t("delta_chroma_log2_weight_denom")
    int8_t("delta_luma_weight_l0")["STD_VIDEO_H265_MAX_NUM_LIST_REF"]
    int8_t("luma_offset_l0")["STD_VIDEO_H265_MAX_NUM_LIST_REF"]
    int8_t("delta_chroma_weight_l0")["STD_VIDEO_H265_MAX_NUM_LIST_REF"]["STD_VIDEO_H265_MAX_CHROMA_PLANES"]
    int8_t("delta_chroma_offset_l0")["STD_VIDEO_H265_MAX_NUM_LIST_REF"]["STD_VIDEO_H265_MAX_CHROMA_PLANES"]
    int8_t("delta_luma_weight_l1")["STD_VIDEO_H265_MAX_NUM_LIST_REF"]
    int8_t("luma_offset_l1")["STD_VIDEO_H265_MAX_NUM_LIST_REF"]
    int8_t("delta_chroma_weight_l1")["STD_VIDEO_H265_MAX_NUM_LIST_REF"]["STD_VIDEO_H265_MAX_CHROMA_PLANES"]
    int8_t("delta_chroma_offset_l1")["STD_VIDEO_H265_MAX_NUM_LIST_REF"]["STD_VIDEO_H265_MAX_CHROMA_PLANES"]
}

val StdVideoEncodeH265SliceSegmentHeaderFlags = struct(Module.VULKAN, "StdVideoEncodeH265SliceSegmentHeaderFlags") {
    subpackage = "video"

    uint32_tb("first_slice_segment_in_pic_flag", bits = 1)
    uint32_tb("dependent_slice_segment_flag", bits = 1)
    uint32_tb("slice_sao_luma_flag", bits = 1)
    uint32_tb("slice_sao_chroma_flag", bits = 1)
    uint32_tb("num_ref_idx_active_override_flag", bits = 1)
    uint32_tb("mvd_l1_zero_flag", bits = 1)
    uint32_tb("cabac_init_flag", bits = 1)
    uint32_tb("cu_chroma_qp_offset_enabled_flag", bits = 1)
    uint32_tb("deblocking_filter_override_flag", bits = 1)
    uint32_tb("slice_deblocking_filter_disabled_flag", bits = 1)
    uint32_tb("collocated_from_l0_flag", bits = 1)
    uint32_tb("slice_loop_filter_across_slices_enabled_flag", bits = 1)
    uint32_t("reserved", bits = 20).private()
}

val StdVideoEncodeH265SliceSegmentHeader = struct(Module.VULKAN, "StdVideoEncodeH265SliceSegmentHeader") {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideoCodecH265.*")

    StdVideoEncodeH265SliceSegmentHeaderFlags("flags")
    StdVideoH265SliceType("slice_type")
    uint32_t("slice_segment_address")
    uint8_t("collocated_ref_idx")
    uint8_t("MaxNumMergeCand")
    int8_t("slice_cb_qp_offset")
    int8_t("slice_cr_qp_offset")
    int8_t("slice_beta_offset_div2")
    int8_t("slice_tc_offset_div2")
    int8_t("slice_act_y_qp_offset")
    int8_t("slice_act_cb_qp_offset")
    int8_t("slice_act_cr_qp_offset")
    int8_t("slice_qp_delta")
    uint16_t("reserved1").private()
    StdVideoEncodeH265WeightTable.const.p("pWeightTable")
}

val StdVideoEncodeH265ReferenceListsInfoFlags = struct(Module.VULKAN, "StdVideoEncodeH265ReferenceModificationFlags") {
    subpackage = "video"

    uint32_tb("ref_pic_list_modification_flag_l0", bits = 1)
    uint32_tb("ref_pic_list_modification_flag_l1", bits = 1)
    uint32_tb("reserved", bits = 30).private()
}

val StdVideoEncodeH265ReferenceListsInfo = struct(Module.VULKAN, "StdVideoEncodeH265ReferenceModifications") {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideoCodecH265.*")

    StdVideoEncodeH265ReferenceListsInfoFlags("flags")
    uint8_t("num_ref_idx_l0_active_minus1")
    uint8_t("num_ref_idx_l1_active_minus1")
    uint16_t("reserved1")
    uint8_t("RefPicList0")["STD_VIDEO_H265_MAX_NUM_LIST_REF"]
    uint8_t("RefPicList1")["STD_VIDEO_H265_MAX_NUM_LIST_REF"]
    uint8_t("list_entry_l0")["STD_VIDEO_H265_MAX_NUM_LIST_REF"]
    uint8_t("list_entry_l1")["STD_VIDEO_H265_MAX_NUM_LIST_REF"]
}

val StdVideoEncodeH265PictureInfoFlags = struct(Module.VULKAN, "StdVideoEncodeH265PictureInfoFlags") {
    subpackage = "video"

    uint32_tb("is_reference", bits = 1)
    uint32_tb("IrapPicFlag", bits = 1)
    uint32_tb("used_for_long_term_reference", bits = 1)
    uint32_tb("discardable_flag", bits = 1)
    uint32_tb("cross_layer_bla_flag", bits = 1)
    uint32_tb("pic_output_flag", bits = 1)
    uint32_tb("no_output_of_prior_pics_flag", bits = 1)
    uint32_tb("short_term_ref_pic_set_sps_flag", bits = 1)
    uint32_tb("slice_temporal_mvp_enabled_flag", bits = 1)
    uint32_t("reserved", bits = 23).private()
}

val StdVideoEncodeH265LongTermRefPics = struct(Module.VULKAN, "StdVideoEncodeH265LongTermRefPics") {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideoCodecH265.*")

    uint8_t("num_long_term_sps")
    uint8_t("num_long_term_pics")
    uint8_t("lt_idx_sps")["STD_VIDEO_H265_MAX_LONG_TERM_REF_PICS_SPS"]
    uint8_t("poc_lsb_lt")["STD_VIDEO_H265_MAX_LONG_TERM_PICS"]
    uint16_t("used_by_curr_pic_lt_flag")
    uint8_t("delta_poc_msb_present_flag")["STD_VIDEO_H265_MAX_DELTA_POC"]
    uint8_t("delta_poc_msb_cycle_lt")["STD_VIDEO_H265_MAX_DELTA_POC"]
}

val StdVideoEncodeH265PictureInfo = struct(Module.VULKAN, "StdVideoEncodeH265PictureInfo") {
    subpackage = "video"

    StdVideoEncodeH265PictureInfoFlags("flags")
    StdVideoH265PictureType("pic_type")
    uint8_t("sps_video_parameter_set_id")
    uint8_t("pps_seq_parameter_set_id")
    uint8_t("pps_pic_parameter_set_id")
    uint8_t("short_term_ref_pic_set_idx")
    int32_t("PicOrderCntVal")
    uint8_t("TemporalId")
    uint8_t("reserved1")[7].private()
    StdVideoEncodeH265ReferenceListsInfo.const.p("pRefLists")
    StdVideoH265ShortTermRefPicSet.const.p("pShortTermRefPicSet")
    StdVideoEncodeH265LongTermRefPics.const.p("pLongTermRefPics")
}

val StdVideoEncodeH265ReferenceInfoFlags = struct(Module.VULKAN, "StdVideoEncodeH265ReferenceInfoFlags") {
    subpackage = "video"

    uint32_tb("used_for_long_term_reference", bits = 1)
    uint32_tb("unused_for_reference", bits = 1)
    uint32_t("reserved", bits = 30).private()
}

val StdVideoEncodeH265ReferenceInfo = struct(Module.VULKAN, "StdVideoEncodeH265ReferenceInfo") {
    subpackage = "video"

    StdVideoEncodeH265ReferenceInfoFlags("flags")
    StdVideoH265PictureType("pic_type")
    int32_t("PicOrderCntVal")
    uint8_t("TemporalId")
}

// vulkan_video_codec_av1std.h

val StdVideoAV1Profile = "StdVideoAV1Profile".enumType
val StdVideoAV1Level = "StdVideoAV1Level".enumType
val StdVideoAV1ColorPrimaries = "StdVideoAV1ColorPrimaries".enumType
val StdVideoAV1TransferCharacteristics = "StdVideoAV1TransferCharacteristics".enumType
val StdVideoAV1MatrixCoefficients = "StdVideoAV1MatrixCoefficients".enumType
val StdVideoAV1ChromaSamplePosition = "StdVideoAV1ChromaSamplePosition".enumType
val StdVideoAV1FrameRestorationType = "StdVideoAV1FrameRestorationType".enumType
val StdVideoAV1FrameType = "StdVideoAV1FrameType".enumType
val StdVideoAV1InterpolationFilter = "StdVideoAV1InterpolationFilter".enumType
val StdVideoAV1TxMode = "StdVideoAV1TxMode".enumType

val StdVideoAV1ColorConfigFlags = struct(Module.VULKAN, "StdVideoAV1ColorConfigFlags") {
    subpackage = "video"

    uint32_tb("mono_chrome", bits = 1)
    uint32_tb("color_range", bits = 1)
    uint32_tb("separate_uv_delta_q", bits = 1)
    uint32_tb("color_description_present_flag", bits = 1)
    uint32_t("reserved", bits = 28).private()
}

val StdVideoAV1ColorConfig = struct(Module.VULKAN, "StdVideoAV1ColorConfig") {
    subpackage = "video"

    StdVideoAV1ColorConfigFlags("flags")
    uint8_t("BitDepth")
    uint8_t("subsampling_x")
    uint8_t("subsampling_y")
    uint8_t("reserved1").private()
    StdVideoAV1ColorPrimaries("color_primaries")
    StdVideoAV1TransferCharacteristics("transfer_characteristics")
    StdVideoAV1MatrixCoefficients("matrix_coefficients")
    StdVideoAV1ChromaSamplePosition("chroma_sample_position")
}

val StdVideoAV1TimingInfoFlags = struct(Module.VULKAN, "StdVideoAV1TimingInfoFlags") {
    subpackage = "video"

    uint32_tb("equal_picture_interval", bits = 1)
    uint32_t("reserved", bits = 31).private()
}

val StdVideoAV1TimingInfo = struct(Module.VULKAN, "StdVideoAV1TimingInfo") {
    subpackage = "video"

    StdVideoAV1TimingInfoFlags("flags")
    uint32_t("num_units_in_display_tick")
    uint32_t("time_scale")
    uint32_t("num_ticks_per_picture_minus_1")
}

val StdVideoAV1LoopFilterFlags = struct(Module.VULKAN, "StdVideoAV1LoopFilterFlags") {
    subpackage = "video"

    uint32_tb("loop_filter_delta_enabled", bits = 1)
    uint32_tb("loop_filter_delta_update", bits = 1)
    uint32_t("reserved", bits = 30).private()
}

val StdVideoAV1LoopFilter = struct(Module.VULKAN, "StdVideoAV1LoopFilter") {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideoCodecAV1.*")

    StdVideoAV1LoopFilterFlags("flags")
    uint8_t("loop_filter_level")["STD_VIDEO_AV1_MAX_LOOP_FILTER_STRENGTHS"]
    uint8_t("loop_filter_sharpness")
    uint8_t("update_ref_delta")
    int8_t("loop_filter_ref_deltas")["STD_VIDEO_AV1_TOTAL_REFS_PER_FRAME"]
    uint8_t("update_mode_delta")
    int8_t("loop_filter_mode_deltas")["STD_VIDEO_AV1_LOOP_FILTER_ADJUSTMENTS"]
}

val StdVideoAV1QuantizationFlags = struct(Module.VULKAN, "StdVideoAV1QuantizationFlags") {
    subpackage = "video"

    uint32_tb("using_qmatrix", bits = 1)
    uint32_tb("diff_uv_delta", bits = 1)
    uint32_t("reserved", bits = 30).private()
}

val StdVideoAV1Quantization = struct(Module.VULKAN, "StdVideoAV1Quantization") {
    subpackage = "video"

    StdVideoAV1QuantizationFlags("flags")
    uint8_t("base_q_idx")
    int8_t("DeltaQYDc")
    int8_t("DeltaQUDc")
    int8_t("DeltaQUAc")
    int8_t("DeltaQVDc")
    int8_t("DeltaQVAc")
    uint8_t("qm_y")
    uint8_t("qm_u")
    uint8_t("qm_v")
}

val StdVideoAV1Segmentation = struct(Module.VULKAN, "StdVideoAV1Segmentation") {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideoCodecAV1.*")

    uint8_t("FeatureEnabled")["STD_VIDEO_AV1_MAX_SEGMENTS"]
    int16_t("FeatureData")["STD_VIDEO_AV1_MAX_SEGMENTS"]["STD_VIDEO_AV1_SEG_LVL_MAX"] // TODO:
}

val StdVideoAV1TileInfoFlag = struct(Module.VULKAN, "StdVideoAV1TileInfoFlag") {
    subpackage = "video"

    uint32_tb("uniform_tile_spacing_flag", bits = 1)
    uint32_t("reserved", bits = 31).private()
}

val StdVideoAV1TileInfo = struct(Module.VULKAN, "StdVideoAV1TileInfo") {
    subpackage = "video"

    StdVideoAV1TileInfoFlag("flags")
    AutoSize("pMiColStarts", "pWidthInSbsMinus1")..uint8_t("TileCols")
    AutoSize("pMiRowStarts", "pHeightInSbsMinus1")..uint8_t("TileRows")
    uint16_t("context_update_tile_id")
    uint8_t("tile_size_bytes_minus_1")
    uint8_t("reserved1")[7].private()
    uint16_t.const.p("pMiColStarts")
    uint16_t.const.p("pMiRowStarts")
    uint16_t.const.p("pWidthInSbsMinus1")
    uint16_t.const.p("pHeightInSbsMinus1")
}

val StdVideoAV1CDEF = struct(Module.VULKAN, "StdVideoAV1CDEF") {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideoCodecAV1.*")

    uint8_t("cdef_damping_minus_3")
    uint8_t("cdef_bits")
    uint8_t("cdef_y_pri_strength")["STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS"]
    uint8_t("cdef_y_sec_strength")["STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS"]
    uint8_t("cdef_uv_pri_strength")["STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS"]
    uint8_t("cdef_uv_sec_strength")["STD_VIDEO_AV1_MAX_CDEF_FILTER_STRENGTHS"]
}

val StdVideoAV1LoopRestoration = struct(Module.VULKAN, "StdVideoAV1LoopRestoration") {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideoCodecAV1.*")

    StdVideoAV1FrameRestorationType("FrameRestorationType")["STD_VIDEO_AV1_MAX_NUM_PLANES"]
    uint16_t("LoopRestorationSize")["STD_VIDEO_AV1_MAX_NUM_PLANES"]
}

val StdVideoAV1GlobalMotion = struct(Module.VULKAN, "StdVideoAV1GlobalMotion") {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideoCodecAV1.*")

    uint8_t("GmType")["STD_VIDEO_AV1_NUM_REF_FRAMES"]
    int32_t("gm_params")["STD_VIDEO_AV1_NUM_REF_FRAMES"]["STD_VIDEO_AV1_GLOBAL_MOTION_PARAMS"]
}

val StdVideoAV1FilmGrainFlags = struct(Module.VULKAN, "StdVideoAV1FilmGrainFlags") {
    subpackage = "video"

    uint32_tb("chroma_scaling_from_luma", bits = 1)
    uint32_tb("overlap_flag", bits = 1)
    uint32_tb("clip_to_restricted_range", bits = 1)
    uint32_tb("update_grain", bits = 1)
    uint32_t("reserved", bits = 28).private()
}

val StdVideoAV1FilmGrain = struct(Module.VULKAN, "StdVideoAV1FilmGrain") {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideoCodecAV1.*")

    StdVideoAV1FilmGrainFlags("flags")
    uint8_t("grain_scaling_minus_8")
    uint8_t("ar_coeff_lag")
    uint8_t("ar_coeff_shift_minus_6")
    uint8_t("grain_scale_shift")
    uint16_t("grain_seed")
    uint8_t("film_grain_params_ref_idx")
    uint8_t("num_y_points")
    uint8_t("point_y_value")["STD_VIDEO_AV1_MAX_NUM_Y_POINTS"]
    uint8_t("point_y_scaling")["STD_VIDEO_AV1_MAX_NUM_Y_POINTS"]
    uint8_t("num_cb_points")
    uint8_t("point_cb_value")["STD_VIDEO_AV1_MAX_NUM_CB_POINTS"]
    uint8_t("point_cb_scaling")["STD_VIDEO_AV1_MAX_NUM_CB_POINTS"]
    uint8_t("num_cr_points")
    uint8_t("point_cr_value")["STD_VIDEO_AV1_MAX_NUM_CR_POINTS"]
    uint8_t("point_cr_scaling")["STD_VIDEO_AV1_MAX_NUM_CR_POINTS"]
    int8_t("ar_coeffs_y_plus_128")["STD_VIDEO_AV1_MAX_NUM_POS_LUMA"]
    int8_t("ar_coeffs_cb_plus_128")["STD_VIDEO_AV1_MAX_NUM_POS_CHROMA"]
    int8_t("ar_coeffs_cr_plus_128")["STD_VIDEO_AV1_MAX_NUM_POS_CHROMA"]
    uint8_t("cb_mult")
    uint8_t("cb_luma_mult")
    uint16_t("cb_offset")
    uint8_t("cr_mult")
    uint8_t("cr_luma_mult")
    uint16_t("cr_offset")
}

val StdVideoAV1SequenceHeaderFlags = struct(Module.VULKAN, "StdVideoAV1SequenceHeaderFlags") {
    subpackage = "video"

    uint32_tb("still_picture", bits = 1)
    uint32_tb("reduced_still_picture_header", bits = 1)
    uint32_tb("use_128x128_superblock", bits = 1)
    uint32_tb("enable_filter_intra", bits = 1)
    uint32_tb("enable_intra_edge_filter", bits = 1)
    uint32_tb("enable_interintra_compound", bits = 1)
    uint32_tb("enable_masked_compound", bits = 1)
    uint32_tb("enable_warped_motion", bits = 1)
    uint32_tb("enable_dual_filter", bits = 1)
    uint32_tb("enable_order_hint", bits = 1)
    uint32_tb("enable_jnt_comp", bits = 1)
    uint32_tb("enable_ref_frame_mvs", bits = 1)
    uint32_tb("frame_id_numbers_present_flag", bits = 1)
    uint32_tb("enable_superres", bits = 1)
    uint32_tb("enable_cdef", bits = 1)
    uint32_tb("enable_restoration", bits = 1)
    uint32_tb("film_grain_params_present", bits = 1)
    uint32_tb("timing_info_present_flag", bits = 1)
    uint32_tb("initial_display_delay_present_flag", bits = 1)
    uint32_t("reserved", bits = 13).private()
}

val StdVideoAV1SequenceHeader = struct(Module.VULKAN, "StdVideoAV1SequenceHeader") {
    subpackage = "video"

    StdVideoAV1SequenceHeaderFlags("flags")
    StdVideoAV1Profile("seq_profile")
    uint8_t("frame_width_bits_minus_1")
    uint8_t("frame_height_bits_minus_1")
    uint16_t("max_frame_width_minus_1")
    uint16_t("max_frame_height_minus_1")
    uint8_t("delta_frame_id_length_minus_2")
    uint8_t("additional_frame_id_length_minus_1")
    uint8_t("order_hint_bits_minus_1")
    uint8_t("seq_force_integer_mv")
    uint8_t("seq_force_screen_content_tools")
    uint8_t("reserved1")[5].private()
    StdVideoAV1ColorConfig.const.p("pColorConfig")
    StdVideoAV1TimingInfo.const.p("pTimingInfo")
}

// vulkan_video_codec_av1std_decode.h

val StdVideoDecodeAV1PictureInfoFlags = struct(Module.VULKAN, "StdVideoDecodeAV1PictureInfoFlags") {
    subpackage = "video"

    uint32_tb("error_resilient_mode", bits = 1)
    uint32_tb("disable_cdf_update", bits = 1)
    uint32_tb("use_superres", bits = 1)
    uint32_tb("render_and_frame_size_different", bits = 1)
    uint32_tb("allow_screen_content_tools", bits = 1)
    uint32_tb("is_filter_switchable", bits = 1)
    uint32_tb("force_integer_mv", bits = 1)
    uint32_tb("frame_size_override_flag", bits = 1)
    uint32_tb("buffer_removal_time_present_flag", bits = 1)
    uint32_tb("allow_intrabc", bits = 1)
    uint32_tb("frame_refs_short_signaling", bits = 1)
    uint32_tb("allow_high_precision_mv", bits = 1)
    uint32_tb("is_motion_mode_switchable", bits = 1)
    uint32_tb("use_ref_frame_mvs", bits = 1)
    uint32_tb("disable_frame_end_update_cdf", bits = 1)
    uint32_tb("allow_warped_motion", bits = 1)
    uint32_tb("reduced_tx_set", bits = 1)
    uint32_tb("reference_select", bits = 1)
    uint32_tb("skip_mode_present", bits = 1)
    uint32_tb("delta_q_present", bits = 1)
    uint32_tb("delta_lf_present", bits = 1)
    uint32_tb("delta_lf_multi", bits = 1)
    uint32_tb("segmentation_enabled", bits = 1)
    uint32_tb("segmentation_update_map", bits = 1)
    uint32_tb("segmentation_temporal_update", bits = 1)
    uint32_tb("segmentation_update_data", bits = 1)
    uint32_tb("UsesLr", bits = 1)
    uint32_tb("usesChromaLr", bits = 1)
    uint32_tb("apply_grain", bits = 1)
    uint32_t("reserved", bits = 3).private()
}

val StdVideoDecodeAV1PictureInfo = struct(Module.VULKAN, "StdVideoDecodeAV1PictureInfo") {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideoCodecAV1.*")

    StdVideoDecodeAV1PictureInfoFlags("flags")
    StdVideoAV1FrameType("frame_type")
    uint32_t("current_frame_id")
    uint8_t("OrderHint")
    uint8_t("primary_ref_frame")
    uint8_t("refresh_frame_flags")
    uint8_t("reserved1").private()
    StdVideoAV1InterpolationFilter("interpolation_filter")
    StdVideoAV1TxMode("TxMode")
    uint8_t("delta_q_res")
    uint8_t("delta_lf_res")
    uint8_t("SkipModeFrame")["STD_VIDEO_AV1_SKIP_MODE_FRAMES"]
    uint8_t("coded_denom")
    uint8_t("reserved2")[3].private()
    uint8_t("OrderHints")["STD_VIDEO_AV1_NUM_REF_FRAMES"]
    uint32_t("expectedFrameId")["STD_VIDEO_AV1_NUM_REF_FRAMES"]
    StdVideoAV1TileInfo.const.p("pTileInfo")
    StdVideoAV1Quantization.const.p("pQuantization")
    StdVideoAV1Segmentation.const.p("pSegmentation")
    StdVideoAV1LoopFilter.const.p("pLoopFilter")
    StdVideoAV1CDEF.const.p("pCDEF")
    StdVideoAV1LoopRestoration.const.p("pLoopRestoration")
    StdVideoAV1GlobalMotion.const.p("pGlobalMotion")
    StdVideoAV1FilmGrain.const.p("pFilmGrain")
}

val StdVideoDecodeAV1ReferenceInfoFlags = struct(Module.VULKAN, "StdVideoDecodeAV1ReferenceInfoFlags") {
    subpackage = "video"

    uint32_tb("disable_frame_end_update_cdf", bits = 1)
    uint32_tb("segmentation_enabled", bits = 1)
    uint32_t("reserved", bits = 30).private()
}

val StdVideoDecodeAV1ReferenceInfo = struct(Module.VULKAN, "StdVideoDecodeAV1ReferenceInfo") {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideoCodecAV1.*")

    StdVideoDecodeAV1ReferenceInfoFlags("flags")
    uint8_t("frame_type")
    uint8_t("RefFrameSignBias")
    uint8_t("OrderHint")
    uint8_t("SavedOrderHints")["STD_VIDEO_AV1_NUM_REF_FRAMES"]
}

// vulkan_video_codec_av1std_encode.h

val StdVideoEncodeAV1DecoderModelInfo = struct(Module.VULKAN, "StdVideoEncodeAV1DecoderModelInfo") {
    subpackage = "video"

    uint8_t("buffer_delay_length_minus_1")
    uint8_t("buffer_removal_time_length_minus_1")
    uint8_t("frame_presentation_time_length_minus_1")
    uint8_t("reserved1").private()
    uint32_t("num_units_in_decoding_tick")
}

val StdVideoEncodeAV1ExtensionHeader = struct(Module.VULKAN, "StdVideoEncodeAV1ExtensionHeader") {
    subpackage = "video"

    uint8_t("temporal_id")
    uint8_t("spatial_id")
}

val StdVideoEncodeAV1OperatingPointInfoFlags = struct(Module.VULKAN, "StdVideoEncodeAV1OperatingPointInfoFlags") {
    subpackage = "video"

    uint32_tb("decoder_model_present_for_this_op", bits = 1)
    uint32_tb("low_delay_mode_flag", bits = 1)
    uint32_tb("initial_display_delay_present_for_this_op", bits = 1)
    uint32_t("reserved", bits = 29).private()
}

val StdVideoEncodeAV1OperatingPointInfo = struct(Module.VULKAN, "StdVideoEncodeAV1OperatingPointInfo") {
    subpackage = "video"

    StdVideoEncodeAV1OperatingPointInfoFlags("flags")
    uint16_t("operating_point_idc")
    uint8_t("seq_level_idx")
    uint8_t("seq_tier")
    uint32_t("decoder_buffer_delay")
    uint32_t("encoder_buffer_delay")
    uint8_t("initial_display_delay_minus_1")
}

val StdVideoEncodeAV1PictureInfoFlags = struct(Module.VULKAN, "StdVideoEncodeAV1PictureInfoFlags") {
    subpackage = "video"

    uint32_tb("error_resilient_mode", bits = 1)
    uint32_tb("disable_cdf_update", bits = 1)
    uint32_tb("use_superres", bits = 1)
    uint32_tb("render_and_frame_size_different", bits = 1)
    uint32_tb("allow_screen_content_tools", bits = 1)
    uint32_tb("is_filter_switchable", bits = 1)
    uint32_tb("force_integer_mv", bits = 1)
    uint32_tb("frame_size_override_flag", bits = 1)
    uint32_tb("buffer_removal_time_present_flag", bits = 1)
    uint32_tb("allow_intrabc", bits = 1)
    uint32_tb("frame_refs_short_signaling", bits = 1)
    uint32_tb("allow_high_precision_mv", bits = 1)
    uint32_tb("is_motion_mode_switchable", bits = 1)
    uint32_tb("use_ref_frame_mvs", bits = 1)
    uint32_tb("disable_frame_end_update_cdf", bits = 1)
    uint32_tb("allow_warped_motion", bits = 1)
    uint32_tb("reduced_tx_set", bits = 1)
    uint32_tb("skip_mode_present", bits = 1)
    uint32_tb("delta_q_present", bits = 1)
    uint32_tb("delta_lf_present", bits = 1)
    uint32_tb("delta_lf_multi", bits = 1)
    uint32_tb("segmentation_enabled", bits = 1)
    uint32_tb("segmentation_update_map", bits = 1)
    uint32_tb("segmentation_temporal_update", bits = 1)
    uint32_tb("segmentation_update_data", bits = 1)
    uint32_tb("UsesLr", bits = 1)
    uint32_tb("usesChromaLr", bits = 1)
    uint32_tb("show_frame", bits = 1)
    uint32_tb("showable_frame", bits = 1)
    uint32_t("reserved", bits = 3).private()
}

val StdVideoEncodeAV1PictureInfo = struct(Module.VULKAN, "StdVideoEncodeAV1PictureInfo") {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideoCodecAV1.*")

    StdVideoEncodeAV1PictureInfoFlags("flags")
    StdVideoAV1FrameType("frame_type")
    uint32_t("frame_presentation_time")
    uint32_t("current_frame_id")
    uint8_t("order_hint")
    uint8_t("primary_ref_frame")
    uint8_t("refresh_frame_flags")
    uint8_t("coded_denom")
    uint16_t("render_width_minus_1")
    uint16_t("render_height_minus_1")
    StdVideoAV1InterpolationFilter("interpolation_filter")
    StdVideoAV1TxMode("TxMode")
    uint8_t("delta_q_res")
    uint8_t("delta_lf_res")
    uint8_t("ref_order_hint")["STD_VIDEO_AV1_NUM_REF_FRAMES"]
    int8_t("ref_frame_idx")["STD_VIDEO_AV1_REFS_PER_FRAME"]
    uint8_t("reserved1")[3].private()
    uint32_t("delta_frame_id_minus_1")["STD_VIDEO_AV1_REFS_PER_FRAME"]
    StdVideoAV1TileInfo.const.p("pTileInfo")
    StdVideoAV1Quantization.const.p("pQuantization")
    StdVideoAV1Segmentation.const.p("pSegmentation")
    StdVideoAV1LoopFilter.const.p("pLoopFilter")
    StdVideoAV1CDEF.const.p("pCDEF")
    StdVideoAV1LoopRestoration.const.p("pLoopRestoration")
    StdVideoAV1GlobalMotion.const.p("pGlobalMotion")
    StdVideoEncodeAV1ExtensionHeader.const.p("pExtensionHeader")
    uint32_t.const.p("pBufferRemovalTimes")
}

val StdVideoEncodeAV1ReferenceInfoFlags = struct(Module.VULKAN, "StdVideoEncodeAV1ReferenceInfoFlags") {
    subpackage = "video"

    uint32_tb("disable_frame_end_update_cdf", bits = 1)
    uint32_tb("segmentation_enabled", bits = 1)
    uint32_t("reserved", bits = 30).private()
}

val StdVideoEncodeAV1ReferenceInfo = struct(Module.VULKAN, "StdVideoEncodeAV1ReferenceInfo") {
    subpackage = "video"

    StdVideoEncodeAV1ReferenceInfoFlags("flags")
    uint32_t("RefFrameId")
    StdVideoAV1FrameType("frame_type")
    uint8_t("OrderHint")
    uint8_t("reserved1")[3].private()
    StdVideoEncodeAV1ExtensionHeader.const.p("pExtensionHeader")
}

// vulkan_video_codec_vp9std.h

val StdVideoVP9Profile = "StdVideoVP9Profile".enumType
val StdVideoVP9Level = "StdVideoVP9Level".enumType
val StdVideoVP9FrameType = "StdVideoVP9FrameType".enumType
val StdVideoVP9InterpolationFilter = "StdVideoVP9InterpolationFilter".enumType
val StdVideoVP9ColorSpace = "StdVideoVP9ColorSpace".enumType

val StdVideoVP9ColorConfigFlags = struct(Module.VULKAN, "StdVideoVP9ColorConfigFlags") {
    subpackage = "video"

    uint32_tb("color_range", bits = 1)
    uint32_tb("reserved", bits = 31).private()
}

val StdVideoVP9ColorConfig = struct(Module.VULKAN, "StdVideoVP9ColorConfig") {
    subpackage = "video"

    StdVideoVP9ColorConfigFlags("flags")
    uint8_t("BitDepth")
    uint8_t("subsampling_x")
    uint8_t("subsampling_y")
    uint8_t("reserved1").private()
    StdVideoVP9ColorSpace("color_space")
}

val StdVideoVP9LoopFilterFlags = struct(Module.VULKAN, "StdVideoVP9LoopFilterFlags") {
    subpackage = "video"

    uint32_tb("loop_filter_delta_enabled", bits = 1)
    uint32_tb("loop_filter_delta_update", bits = 1)
    uint32_t("reserved", bits = 30).private()
}

val StdVideoVP9LoopFilter = struct(Module.VULKAN, "StdVideoVP9LoopFilter") {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideoCodecVP9.*")

    StdVideoVP9LoopFilterFlags("flags")
    uint8_t("loop_filter_level")
    uint8_t("loop_filter_sharpness")
    uint8_t("update_ref_delta")
    int8_t("loop_filter_ref_deltas")["STD_VIDEO_VP9_MAX_REF_FRAMES"]
    uint8_t("update_mode_delta")
    int8_t("loop_filter_mode_deltas")["STD_VIDEO_VP9_LOOP_FILTER_ADJUSTMENTS"]
}

val StdVideoVP9SegmentationFlags = struct(Module.VULKAN, "StdVideoVP9SegmentationFlags") {
    subpackage = "video"

    uint32_tb("segmentation_update_map", bits = 1)
    uint32_tb("segmentation_temporal_update", bits = 1)
    uint32_tb("segmentation_update_data", bits = 1)
    uint32_tb("segmentation_abs_or_delta_update", bits = 1)
    uint32_t("reserved", bits = 28).private()
}

val StdVideoVP9Segmentation = struct(Module.VULKAN, "StdVideoVP9Segmentation") {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideoCodecVP9.*")

    StdVideoVP9SegmentationFlags("flags")
    uint8_t("segmentation_tree_probs")["STD_VIDEO_VP9_MAX_SEGMENTATION_TREE_PROBS"]
    uint8_t("segmentation_pred_prob")["STD_VIDEO_VP9_MAX_SEGMENTATION_PRED_PROB"]
    uint8_t("FeatureEnabled")["STD_VIDEO_VP9_MAX_SEGMENTS"]
    int16_t("FeatureData")["STD_VIDEO_VP9_MAX_SEGMENTS"]["STD_VIDEO_VP9_SEG_LVL_MAX"]
}

// vulkan_video_codec_vp9std_decode.h

val StdVideoDecodeVP9PictureInfoFlags = struct(Module.VULKAN, "StdVideoDecodeVP9PictureInfoFlags") {
    subpackage = "video"

    uint32_tb("error_resilient_mode", bits = 1)
    uint32_tb("intra_only", bits = 1)
    uint32_tb("allow_high_precision_mv", bits = 1)
    uint32_tb("refresh_frame_context", bits = 1)
    uint32_tb("frame_parallel_decoding_mode", bits = 1)
    uint32_tb("segmentation_enabled", bits = 1)
    uint32_tb("show_frame", bits = 1)
    uint32_tb("UsePrevFrameMvs", bits = 1)
    uint32_t("reserved", bits = 24).private()
}

val StdVideoDecodeVP9PictureInfo = struct(Module.VULKAN, "StdVideoDecodeVP9PictureInfo") {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideoCodecVP9.*")

    StdVideoDecodeVP9PictureInfoFlags("flags")
    StdVideoVP9Profile("profile")
    StdVideoVP9FrameType("frame_type")
    uint8_t("frame_context_idx")
    uint8_t("reset_frame_context")
    uint8_t("refresh_frame_flags")
    uint8_t("ref_frame_sign_bias_mask")
    StdVideoVP9InterpolationFilter("interpolation_filter")
    uint8_t("base_q_idx")
    int8_t("delta_q_y_dc")
    int8_t("delta_q_uv_dc")
    int8_t("delta_q_uv_ac")
    uint8_t("tile_cols_log2")
    uint8_t("tile_rows_log2")
    uint16_t("reserved1")[3].private()
    StdVideoVP9ColorConfig.const.p("pColorConfig")
    StdVideoVP9LoopFilter.const.p("pLoopFilter")
    StdVideoVP9Segmentation.const.p("pSegmentation")
}