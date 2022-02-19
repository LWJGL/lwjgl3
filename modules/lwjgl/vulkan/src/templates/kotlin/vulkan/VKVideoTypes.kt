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
val StdVideoH264Level = "StdVideoH264Level".enumType
val StdVideoH264MemMgmtControlOp = "StdVideoH264MemMgmtControlOp".enumType
val StdVideoH264ModificationOfPicNumsIdc = "StdVideoH264ModificationOfPicNumsIdc".enumType
val StdVideoH264NonVclNaluType = "StdVideoH264NonVclNaluType".enumType
val StdVideoH264PictureType = "StdVideoH264PictureType".enumType
val StdVideoH264PocType = "StdVideoH264PocType".enumType
val StdVideoH264ProfileIdc = "StdVideoH264ProfileIdc".enumType
val StdVideoH264SliceType = "StdVideoH264SliceType".enumType
val StdVideoH264WeightedBipredIdc = "StdVideoH264WeightedBipredIdc".enumType
val StdVideoH265PictureType = "StdVideoH265PictureType".enumType
val StdVideoH265SliceType = "StdVideoH265SliceType".enumType

val StdVideoH264SpsVuiFlags = struct(Module.VULKAN, "StdVideoH264SpsVuiFlags") {
    subpackage = "video"

    uint32_tb("aspect_ratio_info_present_flag", "", bits = 1)
    uint32_tb("overscan_info_present_flag", "", bits = 1)
    uint32_tb("overscan_appropriate_flag", "", bits = 1)
    uint32_tb("video_signal_type_present_flag", "", bits = 1)
    uint32_tb("video_full_range_flag", "", bits = 1)
    uint32_tb("color_description_present_flag", "", bits = 1)
    uint32_tb("chroma_loc_info_present_flag", "", bits = 1)
    uint32_tb("timing_info_present_flag", "", bits = 1)
    uint32_tb("fixed_frame_rate_flag", "", bits = 1)
    uint32_tb("bitstream_restriction_flag", "", bits = 1)
    uint32_tb("nal_hrd_parameters_present_flag", "", bits = 1)
    uint32_tb("vcl_hrd_parameters_present_flag", "", bits = 1)
}

val StdVideoH264HrdParameters = struct(Module.VULKAN, "StdVideoH264HrdParameters") {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideoCodecH264.*")

    uint8_t("cpb_cnt_minus1", "")
    uint8_t("bit_rate_scale", "")
    uint8_t("cpb_size_scale", "")
    uint32_t("bit_rate_value_minus1", "")["STD_VIDEO_H264_CPB_CNT_LIST_SIZE"]
    uint32_t("cpb_size_value_minus1", "")["STD_VIDEO_H264_CPB_CNT_LIST_SIZE"]
    uint8_t("cbr_flag", "")["STD_VIDEO_H264_CPB_CNT_LIST_SIZE"]
    uint32_t("initial_cpb_removal_delay_length_minus1", "")
    uint32_t("cpb_removal_delay_length_minus1", "")
    uint32_t("dpb_output_delay_length_minus1", "")
    uint32_t("time_offset_length", "")
}

val StdVideoH264SequenceParameterSetVui = struct(Module.VULKAN, "StdVideoH264SequenceParameterSetVui") {
    subpackage = "video"

    StdVideoH264AspectRatioIdc("aspect_ratio_idc", "")
    uint16_t("sar_width", "")
    uint16_t("sar_height", "")
    uint8_t("video_format", "")
    uint8_t("color_primaries", "")
    uint8_t("transfer_characteristics", "")
    uint8_t("matrix_coefficients", "")
    uint32_t("num_units_in_tick", "")
    uint32_t("time_scale", "")
    StdVideoH264HrdParameters.p(
        "pHrdParameters",
        "must be a valid {@code ptr} to {@code hrd_parameters}, if {@code nal_hrd_parameters_present_flag} or {@code vcl_hrd_parameters_present_flag} are set"
    )
    uint8_t("max_num_reorder_frames", "")
    uint8_t("max_dec_frame_buffering", "")
    StdVideoH264SpsVuiFlags("flags", "")
}

val StdVideoH264SpsFlags = struct(Module.VULKAN, "StdVideoH264SpsFlags") {
    subpackage = "video"

    uint32_tb("constraint_set0_flag", "", bits = 1)
    uint32_tb("constraint_set1_flag", "", bits = 1)
    uint32_tb("constraint_set2_flag", "", bits = 1)
    uint32_tb("constraint_set3_flag", "", bits = 1)
    uint32_tb("constraint_set4_flag", "", bits = 1)
    uint32_tb("constraint_set5_flag", "", bits = 1)
    uint32_tb("direct_8x8_inference_flag", "", bits = 1)
    uint32_tb("mb_adaptive_frame_field_flag", "", bits = 1)
    uint32_tb("frame_mbs_only_flag", "", bits = 1)
    uint32_tb("delta_pic_order_always_zero_flag", "", bits = 1)
    uint32_tb("separate_colour_plane_flag", "", bits = 1)
    uint32_tb("gaps_in_frame_num_value_allowed_flag", "", bits = 1)
    uint32_tb("qpprime_y_zero_transform_bypass_flag", "", bits = 1)
    uint32_tb("frame_cropping_flag", "", bits = 1)
    uint32_tb("seq_scaling_matrix_present_flag", "", bits = 1)
    uint32_tb("vui_parameters_present_flag", "", bits = 1)
}

val StdVideoH264ScalingLists = struct(Module.VULKAN, "StdVideoH264ScalingLists") {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideoCodecH264.*")

    uint8_t(
        "scaling_list_present_mask",
        """
        scaling_list_present_mask has one bit for each seq_scaling_list_present_flag[i] for SPS OR pic_scaling_list_present_flag[i] for PPS, bit 0 - 5 are for
        each entry of ScalingList4x4 bit 6 - 7 are for each entry plus 6 for ScalingList8x8
        """
    )
    uint8_t(
        "use_default_scaling_matrix_mask",
        """
        use_default_scaling_matrix_mask has one bit for each UseDefaultScalingMatrix4x4Flag[ i ] and UseDefaultScalingMatrix8x8Flag[ i - 6 ] for SPS OR PPS bit
        0 - 5 are for each entry of ScalingList4x4 bit 6 - 7 are for each entry plus 6 for ScalingList8x8
        """
    )
    uint8_t("ScalingList4x4", "")["STD_VIDEO_H264_SCALING_LIST_4X4_NUM_LISTS"]["STD_VIDEO_H264_SCALING_LIST_4X4_NUM_ELEMENTS"]
    uint8_t("ScalingList8x8", "")["STD_VIDEO_H264_SCALING_LIST_8X8_NUM_LISTS"]["STD_VIDEO_H264_SCALING_LIST_8X8_NUM_ELEMENTS"]
}

val StdVideoH264SequenceParameterSet = struct(Module.VULKAN, "StdVideoH264SequenceParameterSet") {
    subpackage = "video"

    StdVideoH264ProfileIdc("profile_idc", "")
    StdVideoH264Level("level_idc", "")
    uint8_t("seq_parameter_set_id", "")
    StdVideoH264ChromaFormatIdc("chroma_format_idc", "")
    uint8_t("bit_depth_luma_minus8", "")
    uint8_t("bit_depth_chroma_minus8", "")
    uint8_t("log2_max_frame_num_minus4", "")
    StdVideoH264PocType("pic_order_cnt_type", "")
    uint8_t("log2_max_pic_order_cnt_lsb_minus4", "")
    int32_t("offset_for_non_ref_pic", "")
    int32_t("offset_for_top_to_bottom_field", "")
    AutoSize("pOffsetForRefFrame")..uint8_t("num_ref_frames_in_pic_order_cnt_cycle", "")
    uint8_t("max_num_ref_frames", "")
    uint32_t("pic_width_in_mbs_minus1", "")
    uint32_t("pic_height_in_map_units_minus1", "")
    uint32_t("frame_crop_left_offset", "")
    uint32_t("frame_crop_right_offset", "")
    uint32_t("frame_crop_top_offset", "")
    uint32_t("frame_crop_bottom_offset", "")
    StdVideoH264SpsFlags("flags", "")
    nullable..int32_t.p(
        "pOffsetForRefFrame",
        """
        a pointer representing the {@code offset_for_ref_frame} array with {@code num_ref_frames_in_pic_order_cnt_cycle} number of elements.
        
        If {@code pOffsetForRefFrame} has {@code nullptr} value, then {@code num_ref_frames_in_pic_order_cnt_cycle} must also be "0".
        """
    )
    StdVideoH264ScalingLists.p("pScalingLists", "must be a valid pointer if scaling_matrix_present_flag is set")
    StdVideoH264SequenceParameterSetVui.p("pSequenceParameterSetVui", "must be a valid pointer if StdVideoH264SpsFlags:vui_parameters_present_flag is set")
}

val StdVideoH264PpsFlags = struct(Module.VULKAN, "StdVideoH264PpsFlags") {
    subpackage = "video"

    uint32_tb("transform_8x8_mode_flag", "", bits = 1)
    uint32_tb("redundant_pic_cnt_present_flag", "", bits = 1)
    uint32_tb("constrained_intra_pred_flag", "", bits = 1)
    uint32_tb("deblocking_filter_control_present_flag", "", bits = 1)
    uint32_tb("weighted_bipred_idc_flag", "", bits = 1)
    uint32_tb("weighted_pred_flag", "", bits = 1)
    uint32_tb("pic_order_present_flag", "", bits = 1)
    uint32_tb("entropy_coding_mode_flag", "", bits = 1)
    uint32_tb("pic_scaling_matrix_present_flag", "", bits = 1)
}

val StdVideoH264PictureParameterSet = struct(Module.VULKAN, "StdVideoH264PictureParameterSet") {
    subpackage = "video"

    uint8_t("seq_parameter_set_id", "")
    uint8_t("pic_parameter_set_id", "")
    uint8_t("num_ref_idx_l0_default_active_minus1", "")
    uint8_t("num_ref_idx_l1_default_active_minus1", "")
    StdVideoH264WeightedBipredIdc("weighted_bipred_idc", "")
    int8_t("pic_init_qp_minus26", "")
    int8_t("pic_init_qs_minus26", "")
    int8_t("chroma_qp_index_offset", "")
    int8_t("second_chroma_qp_index_offset", "")
    StdVideoH264PpsFlags("flags", "")
    StdVideoH264ScalingLists.p("pScalingLists", "must be a valid pointer if  StdVideoH264PpsFlags::pic_scaling_matrix_present_flag is set")
}

// vulkan_video_codec_h264std_decode.h

val StdVideoDecodeH264PictureInfoFlags = struct(Module.VULKAN, "StdVideoDecodeH264PictureInfoFlags") {
    subpackage = "video"

    uint32_tb("field_pic_flag", "is field picture", bits = 1)
    uint32_tb("is_intra", "is intra picture", bits = 1)
    uint32_tb("IdrPicFlag", "instantaneous decoding refresh (IDR) picture", bits = 1)
    uint32_tb("bottom_field_flag", "bottom (true) or top (false) field if field_pic_flag is set", bits = 1)
    uint32_tb("is_reference", "this only applies to picture info, and not to the DPB lists", bits = 1)
    uint32_tb("complementary_field_pair", "complementary field pair, complementary non-reference field pair, complementary reference field pair", bits = 1)
}

val StdVideoDecodeH264PictureInfo = struct(Module.VULKAN, "StdVideoDecodeH264PictureInfo") {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideoCodecH264.*")

    uint8_t("seq_parameter_set_id", "selecting SPS from the Picture Parameters")
    uint8_t("pic_parameter_set_id", "selecting PPS from the Picture Parameters and the SPS")
    uint16_t("reserved", "for structure members 32-bit packing/alignment")
    uint16_t("frame_num", "7.4.3 Slice header semantics")
    uint16_t("idr_pic_id", "7.4.3 Slice header semantics")
    int32_t("PicOrderCnt", "topFieldOrderCnt and BottomFieldOrderCnt fields")["STD_VIDEO_DECODE_H264_FIELD_ORDER_COUNT_LIST_SIZE"]
    StdVideoDecodeH264PictureInfoFlags("flags", "")
}

val StdVideoDecodeH264ReferenceInfoFlags = struct(Module.VULKAN, "StdVideoDecodeH264ReferenceInfoFlags") {
    subpackage = "video"

    uint32_tb("top_field_flag", "reference is used for top field reference", bits = 1)
    uint32_tb("bottom_field_flag", "reference is used for bottom field reference", bits = 1)
    uint32_tb("is_long_term", "this is a long term reference", bits = 1)
    uint32_tb("is_non_existing", "must be handled in accordance with 8.2.5.2: Decoding process for gaps in frame_num", bits = 1)
}

val StdVideoDecodeH264ReferenceInfo = struct(Module.VULKAN, "StdVideoDecodeH264ReferenceInfo") {
    subpackage = "video"

    uint16_t("FrameNum", "7.4.3.3 Decoded reference picture marking semantics")
    uint16_t("reserved", "for structure members 32-bit packing/alignment")
    int32_t("PicOrderCnt", "topFieldOrderCnt and BottomFieldOrderCnt fields")[2]
    StdVideoDecodeH264ReferenceInfoFlags("flags", "")
}

val StdVideoDecodeH264MvcElementFlags = struct(Module.VULKAN, "StdVideoDecodeH264MvcElementFlags") {
    subpackage = "video"

    uint32_tb("non_idr", "", bits = 1)
    uint32_tb("anchor_pic", "", bits = 1)
    uint32_tb("inter_view", "", bits = 1)
}

val StdVideoDecodeH264MvcElement = struct(Module.VULKAN, "StdVideoDecodeH264MvcElement") {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideoCodecH264.*")

    StdVideoDecodeH264MvcElementFlags("flags", "")
    uint16_t("viewOrderIndex", "")
    uint16_t("viewId", "")
    uint16_t("temporalId", "move out?")
    uint16_t("priorityId", "move out?")
    uint16_t("numOfAnchorRefsInL0", "")
    uint16_t("viewIdOfAnchorRefsInL0", "")["STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE"]
    uint16_t("numOfAnchorRefsInL1", "")
    uint16_t("viewIdOfAnchorRefsInL1", "")["STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE"]
    uint16_t("numOfNonAnchorRefsInL0", "")
    uint16_t("viewIdOfNonAnchorRefsInL0", "")["STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE"]
    uint16_t("numOfNonAnchorRefsInL1", "")
    uint16_t("viewIdOfNonAnchorRefsInL1", "")["STD_VIDEO_DECODE_H264_MVC_REF_LIST_SIZE"]
}

val StdVideoDecodeH264Mvc = struct(Module.VULKAN, "StdVideoDecodeH264Mvc") {
    subpackage = "video"

    uint32_t("viewId0", "")
    uint32_t("mvcElementCount", "")
    StdVideoDecodeH264MvcElement.p("pMvcElements", "")
}

// vulkan_video_codec_h264std_encode.h

val StdVideoEncodeH264SliceHeaderFlags = struct(Module.VULKAN, "StdVideoEncodeH264SliceHeaderFlags") {
    subpackage = "video"

    uint32_tb("direct_spatial_mv_pred_flag", "", bits = 1)
    uint32_tb("num_ref_idx_active_override_flag", "", bits = 1)
    uint32_tb("no_output_of_prior_pics_flag", "", bits = 1)
    uint32_tb("adaptive_ref_pic_marking_mode_flag", "", bits = 1)
    uint32_tb("no_prior_references_available_flag", "", bits = 1)
}

val StdVideoEncodeH264PictureInfoFlags = struct(Module.VULKAN, "StdVideoEncodeH264PictureInfoFlags") {
    subpackage = "video"

    uint32_tb("idr_flag", "", bits = 1)
    uint32_tb("is_reference_flag", "", bits = 1)
    uint32_tb("long_term_reference_flag", "", bits = 1)
}

val StdVideoEncodeH264ReferenceInfoFlags = struct(Module.VULKAN, "StdVideoEncodeH264ReferenceInfoFlags") {
    subpackage = "video"

    uint32_tb("is_long_term", "", bits = 1)
}

val StdVideoEncodeH264RefMgmtFlags = struct(Module.VULKAN, "StdVideoEncodeH264RefMgmtFlags") {
    subpackage = "video"

    uint32_tb("ref_pic_list_modification_l0_flag", "", bits = 1)
    uint32_tb("ref_pic_list_modification_l1_flag", "", bits = 1)
}

val StdVideoEncodeH264RefListModEntry = struct(Module.VULKAN, "StdVideoEncodeH264RefListModEntry") {
    subpackage = "video"

    StdVideoH264ModificationOfPicNumsIdc("modification_of_pic_nums_idc", "")
    uint16_t("abs_diff_pic_num_minus1", "")
    uint16_t("long_term_pic_num", "")
}

val StdVideoEncodeH264RefPicMarkingEntry = struct(Module.VULKAN, "StdVideoEncodeH264RefPicMarkingEntry") {
    subpackage = "video"

    StdVideoH264MemMgmtControlOp("operation", "")
    uint16_t("difference_of_pic_nums_minus1", "")
    uint16_t("long_term_pic_num", "")
    uint16_t("long_term_frame_idx", "")
    uint16_t("max_long_term_frame_idx_plus1", "")
}

val StdVideoEncodeH264RefMemMgmtCtrlOperations = struct(Module.VULKAN, "StdVideoEncodeH264RefMemMgmtCtrlOperations") {
    subpackage = "video"

    StdVideoEncodeH264RefMgmtFlags("flags", "")
    uint8_t("refList0ModOpCount", "")
    StdVideoEncodeH264RefListModEntry.p("pRefList0ModOperations", "")
    uint8_t("refList1ModOpCount", "")
    StdVideoEncodeH264RefListModEntry.p("pRefList1ModOperations", "")
    uint8_t("refPicMarkingOpCount", "")
    StdVideoEncodeH264RefPicMarkingEntry.p("pRefPicMarkingOperations", "")
}

val StdVideoEncodeH264PictureInfo = struct(Module.VULKAN, "StdVideoEncodeH264PictureInfo") {
    subpackage = "video"

    StdVideoEncodeH264PictureInfoFlags("flags", "")
    StdVideoH264PictureType("pictureType", "")
    uint32_t("frame_num", "")
    int32_t("PicOrderCnt", "")
}

val StdVideoEncodeH264ReferenceInfo = struct(Module.VULKAN, "StdVideoEncodeH264ReferenceInfo") {
    subpackage = "video"

    StdVideoEncodeH264ReferenceInfoFlags("flags", "")
    uint32_t("FrameNum", "")
    int32_t("PicOrderCnt", "")
    uint16_t("long_term_pic_num", "")
    uint16_t("long_term_frame_idx", "")
}

val StdVideoEncodeH264SliceHeader = struct(Module.VULKAN, "StdVideoEncodeH264SliceHeader") {
    subpackage = "video"

    StdVideoEncodeH264SliceHeaderFlags("flags", "")
    uint32_t("first_mb_in_slice", "")
    StdVideoH264SliceType("slice_type", "")
    uint8_t("seq_parameter_set_id", "")
    uint8_t("pic_parameter_set_id", "")
    uint16_t("idr_pic_id", "")
    uint8_t("num_ref_idx_l0_active_minus1", "")
    uint8_t("num_ref_idx_l1_active_minus1", "")
    StdVideoH264CabacInitIdc("cabac_init_idc", "")
    StdVideoH264DisableDeblockingFilterIdc("disable_deblocking_filter_idc", "")
    int8_t("slice_alpha_c0_offset_div2", "")
    int8_t("slice_beta_offset_div2", "")
}

// vulkan_video_codec_h265std.h

val StdVideoH265ChromaFormatIdc = "StdVideoH265ChromaFormatIdc".enumType
val StdVideoH265Level = "StdVideoH265Level".enumType
val StdVideoH265ProfileIdc = "StdVideoH265ProfileIdc".enumType

val StdVideoH265DecPicBufMgr = struct(Module.VULKAN, "StdVideoH265DecPicBufMgr") {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideoCodecH265.*")

    uint32_t("max_latency_increase_plus1", "")["STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE"]
    uint8_t("max_dec_pic_buffering_minus1", "")["STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE"]
    uint8_t("max_num_reorder_pics", "")["STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE"]
}

val StdVideoH265SubLayerHrdParameters = struct(Module.VULKAN, "StdVideoH265SubLayerHrdParameters") {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideoCodecH265.*")

    uint32_t("bit_rate_value_minus1", "")["STD_VIDEO_H265_CPB_CNT_LIST_SIZE"]
    uint32_t("cpb_size_value_minus1", "")["STD_VIDEO_H265_CPB_CNT_LIST_SIZE"]
    uint32_t("cpb_size_du_value_minus1", "")["STD_VIDEO_H265_CPB_CNT_LIST_SIZE"]
    uint32_t("bit_rate_du_value_minus1", "")["STD_VIDEO_H265_CPB_CNT_LIST_SIZE"]
    uint32_t("cbr_flag", "each bit represents a range of CpbCounts (bit 0 - cpb_cnt_minus1) per sub-layer")
}

val StdVideoH265HrdFlags = struct(Module.VULKAN, "StdVideoH265HrdFlags") {
    subpackage = "video"

    uint32_tb("nal_hrd_parameters_present_flag", "", bits = 1)
    uint32_tb("vcl_hrd_parameters_present_flag", "", bits = 1)
    uint32_tb("sub_pic_hrd_params_present_flag", "", bits = 1)
    uint32_tb("sub_pic_cpb_params_in_pic_timing_sei_flag", "", bits = 1)
    uint32_t("fixed_pic_rate_general_flag", "each bit represents a sublayer, bit 0 - vps_max_sub_layers_minus1", bits = 8)
    uint32_t("fixed_pic_rate_within_cvs_flag", "each bit represents a sublayer, bit 0 - vps_max_sub_layers_minus1", bits = 8)
    uint32_t("low_delay_hrd_flag", "each bit represents a sublayer, bit 0 - vps_max_sub_layers_minus1", bits = 8)
}

val StdVideoH265HrdParameters = struct(Module.VULKAN, "StdVideoH265HrdParameters") {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideoCodecH265.*")

    uint8_t("tick_divisor_minus2", "")
    uint8_t("du_cpb_removal_delay_increment_length_minus1", "")
    uint8_t("dpb_output_delay_du_length_minus1", "")
    uint8_t("bit_rate_scale", "")
    uint8_t("cpb_size_scale", "")
    uint8_t("cpb_size_du_scale", "")
    uint8_t("initial_cpb_removal_delay_length_minus1", "")
    uint8_t("au_cpb_removal_delay_length_minus1", "")
    uint8_t("dpb_output_delay_length_minus1", "")
    uint8_t("cpb_cnt_minus1", "")["STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE"]
    uint16_t("elemental_duration_in_tc_minus1", "")["STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE"]
    StdVideoH265SubLayerHrdParameters.p(
        "pSubLayerHrdParametersNal",
        "NAL per layer {@code ptr} to {@code sub_layer_hrd_parameters}"
    )["STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE"]
    StdVideoH265SubLayerHrdParameters.p(
        "pSubLayerHrdParametersVcl",
        "VCL per layer {@code ptr} to {@code sub_layer_hrd_parameters}"
    )["STD_VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE"]
    StdVideoH265HrdFlags("flags", "")
}

val StdVideoH265VpsFlags = struct(Module.VULKAN, "StdVideoH265VpsFlags") {
    subpackage = "video"

    uint32_tb("vps_temporal_id_nesting_flag", "", bits = 1)
    uint32_tb("vps_sub_layer_ordering_info_present_flag", "", bits = 1)
    uint32_tb("vps_timing_info_present_flag", "", bits = 1)
    uint32_tb("vps_poc_proportional_to_timing_flag", "", bits = 1)
}

val StdVideoH265VideoParameterSet = struct(Module.VULKAN, "StdVideoH265VideoParameterSet") {
    subpackage = "video"

    uint8_t("vps_video_parameter_set_id", "")
    uint8_t("vps_max_sub_layers_minus1", "")
    uint32_t("vps_num_units_in_tick", "")
    uint32_t("vps_time_scale", "")
    uint32_t("vps_num_ticks_poc_diff_one_minus1", "")
    StdVideoH265DecPicBufMgr.p("pDecPicBufMgr", "")
    StdVideoH265HrdParameters.p("pHrdParameters", "")
    StdVideoH265VpsFlags("flags", "")
}

val StdVideoH265ScalingLists = struct(Module.VULKAN, "StdVideoH265ScalingLists") {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideoCodecH265.*")

    uint8_t(
        "ScalingList4x4",
        "{@code scalingList[ 0 ][ MatrixID ][ i ] (sizeID = 0)}"
    )["STD_VIDEO_H265_SCALING_LIST_4X4_NUM_LISTS"]["STD_VIDEO_H265_SCALING_LIST_4X4_NUM_ELEMENTS"]
    uint8_t(
        "ScalingList8x8",
        "{@code scalingList[ 1 ][ MatrixID ][ i ] (sizeID = 1)}"
    )["STD_VIDEO_H265_SCALING_LIST_8X8_NUM_LISTS"]["STD_VIDEO_H265_SCALING_LIST_8X8_NUM_ELEMENTS"]
    uint8_t(
        "ScalingList16x16",
        "{@code scalingList[ 2 ][ MatrixID ][ i ] (sizeID = 2)}"
    )["STD_VIDEO_H265_SCALING_LIST_16X16_NUM_LISTS"]["STD_VIDEO_H265_SCALING_LIST_16X16_NUM_ELEMENTS"]
    uint8_t(
        "ScalingList32x32",
        "{@code scalingList[ 3 ][ MatrixID ][ i ] (sizeID = 3)}"
    )["STD_VIDEO_H265_SCALING_LIST_32X32_NUM_LISTS"]["STD_VIDEO_H265_SCALING_LIST_32X32_NUM_ELEMENTS"]
    uint8_t(
        "ScalingListDCCoef16x16",
        "{@code scaling_list_dc_coef_minus8[ sizeID - 2 ][ matrixID ] + 8, sizeID = 2}"
    )["STD_VIDEO_H265_SCALING_LIST_16X16_NUM_LISTS"]
    uint8_t(
        "ScalingListDCCoef32x32",
        "{@code scaling_list_dc_coef_minus8[ sizeID - 2 ][ matrixID ] + 8. sizeID = 3}"
    )["STD_VIDEO_H265_SCALING_LIST_32X32_NUM_LISTS"]
}

val StdVideoH265SpsVuiFlags = struct(Module.VULKAN, "StdVideoH265SpsVuiFlags") {
    subpackage = "video"

    uint32_tb("aspect_ratio_info_present_flag", "", bits = 1)
    uint32_tb("overscan_info_present_flag", "", bits = 1)
    uint32_tb("overscan_appropriate_flag", "", bits = 1)
    uint32_tb("video_signal_type_present_flag", "", bits = 1)
    uint32_tb("video_full_range_flag", "", bits = 1)
    uint32_tb("colour_description_present_flag", "", bits = 1)
    uint32_tb("chroma_loc_info_present_flag", "", bits = 1)
    uint32_tb("neutral_chroma_indication_flag", "", bits = 1)
    uint32_tb("field_seq_flag", "", bits = 1)
    uint32_tb("frame_field_info_present_flag", "", bits = 1)
    uint32_tb("default_display_window_flag", "", bits = 1)
    uint32_tb("vui_timing_info_present_flag", "", bits = 1)
    uint32_tb("vui_poc_proportional_to_timing_flag", "", bits = 1)
    uint32_tb("vui_hrd_parameters_present_flag", "", bits = 1)
    uint32_tb("bitstream_restriction_flag", "", bits = 1)
    uint32_tb("tiles_fixed_structure_flag", "", bits = 1)
    uint32_tb("motion_vectors_over_pic_boundaries_flag", "", bits = 1)
    uint32_tb("restricted_ref_pic_lists_flag", "", bits = 1)
}

val StdVideoH265SequenceParameterSetVui = struct(Module.VULKAN, "StdVideoH265SequenceParameterSetVui") {
    subpackage = "video"

    uint8_t("aspect_ratio_idc", "")
    uint16_t("sar_width", "")
    uint16_t("sar_height", "")
    uint8_t("video_format", "")
    uint8_t("colour_primaries", "")
    uint8_t("transfer_characteristics", "")
    uint8_t("matrix_coeffs", "")
    uint8_t("chroma_sample_loc_type_top_field", "")
    uint8_t("chroma_sample_loc_type_bottom_field", "")
    uint16_t("def_disp_win_left_offset", "")
    uint16_t("def_disp_win_right_offset", "")
    uint16_t("def_disp_win_top_offset", "")
    uint16_t("def_disp_win_bottom_offset", "")
    uint32_t("vui_num_units_in_tick", "")
    uint32_t("vui_time_scale", "")
    uint32_t("vui_num_ticks_poc_diff_one_minus1", "")
    StdVideoH265HrdParameters.p("pHrdParameters", "")
    uint16_t("min_spatial_segmentation_idc", "")
    uint8_t("max_bytes_per_pic_denom", "")
    uint8_t("max_bits_per_min_cu_denom", "")
    uint8_t("log2_max_mv_length_horizontal", "")
    uint8_t("log2_max_mv_length_vertical", "")
    StdVideoH265SpsVuiFlags("flags", "")
}

val StdVideoH265PredictorPaletteEntries = struct(Module.VULKAN, "StdVideoH265PredictorPaletteEntries") {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideoCodecH265.*")

    uint16_t("PredictorPaletteEntries", "")["STD_VIDEO_H265_PREDICTOR_PALETTE_COMPONENTS_LIST_SIZE"]["STD_VIDEO_H265_PREDICTOR_PALETTE_COMP_ENTRIES_LIST_SIZE"]
}

val StdVideoH265SpsFlags = struct(Module.VULKAN, "StdVideoH265SpsFlags") {
    subpackage = "video"

    uint32_tb("sps_temporal_id_nesting_flag", "", bits = 1)
    uint32_tb("separate_colour_plane_flag", "", bits = 1)
    uint32_tb("scaling_list_enabled_flag", "", bits = 1)
    uint32_tb("sps_scaling_list_data_present_flag", "", bits = 1)
    uint32_tb("amp_enabled_flag", "", bits = 1)
    uint32_tb("sample_adaptive_offset_enabled_flag", "", bits = 1)
    uint32_tb("pcm_enabled_flag", "", bits = 1)
    uint32_tb("pcm_loop_filter_disabled_flag", "", bits = 1)
    uint32_tb("long_term_ref_pics_present_flag", "", bits = 1)
    uint32_tb("sps_temporal_mvp_enabled_flag", "", bits = 1)
    uint32_tb("strong_intra_smoothing_enabled_flag", "", bits = 1)
    uint32_tb("vui_parameters_present_flag", "", bits = 1)
    uint32_tb("sps_extension_present_flag", "", bits = 1)
    uint32_tb("sps_range_extension_flag", "", bits = 1)
    uint32_tb("transform_skip_rotation_enabled_flag", "extension SPS flags, valid when #VIDEO_H265_PROFILE_IDC_FORMAT_RANGE_EXTENSIONS is set", bits = 1)
    uint32_tb("transform_skip_context_enabled_flag", "", bits = 1)
    uint32_tb("implicit_rdpcm_enabled_flag", "", bits = 1)
    uint32_tb("explicit_rdpcm_enabled_flag", "", bits = 1)
    uint32_tb("extended_precision_processing_flag", "", bits = 1)
    uint32_tb("intra_smoothing_disabled_flag", "", bits = 1)
    uint32_tb("high_precision_offsets_enabled_flag", "", bits = 1)
    uint32_tb("persistent_rice_adaptation_enabled_flag", "", bits = 1)
    uint32_tb("cabac_bypass_alignment_enabled_flag", "", bits = 1)
    uint32_tb("sps_curr_pic_ref_enabled_flag", "extension SPS flags, valid when #VIDEO_H265_PROFILE_IDC_SCC_EXTENSIONS is set", bits = 1)
    uint32_tb("palette_mode_enabled_flag", "", bits = 1)
    uint32_tb("sps_palette_predictor_initializer_present_flag", "", bits = 1)
    uint32_tb("intra_boundary_filtering_disabled_flag", "", bits = 1)
}

val StdVideoH265SequenceParameterSet = struct(Module.VULKAN, "StdVideoH265SequenceParameterSet") {
    subpackage = "video"

    StdVideoH265ProfileIdc("profile_idc", "")
    StdVideoH265Level("level_idc", "")
    uint32_t("pic_width_in_luma_samples", "")
    uint32_t("pic_height_in_luma_samples", "")
    uint8_t("sps_video_parameter_set_id", "")
    uint8_t("sps_max_sub_layers_minus1", "")
    uint8_t("sps_seq_parameter_set_id", "")
    uint8_t("chroma_format_idc", "")
    uint8_t("bit_depth_luma_minus8", "")
    uint8_t("bit_depth_chroma_minus8", "")
    uint8_t("log2_max_pic_order_cnt_lsb_minus4", "")
    uint8_t("sps_max_dec_pic_buffering_minus1", "")
    uint8_t("log2_min_luma_coding_block_size_minus3", "")
    uint8_t("log2_diff_max_min_luma_coding_block_size", "")
    uint8_t("log2_min_luma_transform_block_size_minus2", "")
    uint8_t("log2_diff_max_min_luma_transform_block_size", "")
    uint8_t("max_transform_hierarchy_depth_inter", "")
    uint8_t("max_transform_hierarchy_depth_intra", "")
    uint8_t("num_short_term_ref_pic_sets", "")
    uint8_t("num_long_term_ref_pics_sps", "")
    uint8_t("pcm_sample_bit_depth_luma_minus1", "")
    uint8_t("pcm_sample_bit_depth_chroma_minus1", "")
    uint8_t("log2_min_pcm_luma_coding_block_size_minus3", "")
    uint8_t("log2_diff_max_min_pcm_luma_coding_block_size", "")
    uint32_t("conf_win_left_offset", "")
    uint32_t("conf_win_right_offset", "")
    uint32_t("conf_win_top_offset", "")
    uint32_t("conf_win_bottom_offset", "")
    StdVideoH265DecPicBufMgr.p("pDecPicBufMgr", "")
    StdVideoH265SpsFlags("flags", "")
    StdVideoH265ScalingLists.p("pScalingLists", "must be a valid pointer if sps_scaling_list_data_present_flag is set")
    StdVideoH265SequenceParameterSetVui.p(
        "pSequenceParameterSetVui",
        "must be a valid pointer if StdVideoH265SpsFlags:vui_parameters_present_flag is set palette_max_size;"
    )
    uint8_t("palette_max_size", "extension SPS flags, valid when #VIDEO_H265_PROFILE_IDC_SCC_EXTENSIONS is set")
    uint8_t("delta_palette_max_predictor_size", "")
    uint8_t("motion_vector_resolution_control_idc", "")
    uint8_t("sps_num_palette_predictor_initializer_minus1", "")
    StdVideoH265PredictorPaletteEntries.p("pPredictorPaletteEntries", "must be a valid pointer if sps_palette_predictor_initializer_present_flag is set")
}

val StdVideoH265PpsFlags = struct(Module.VULKAN, "StdVideoH265PpsFlags") {
    subpackage = "video"

    uint32_tb("dependent_slice_segments_enabled_flag", "", bits = 1)
    uint32_tb("output_flag_present_flag", "", bits = 1)
    uint32_tb("sign_data_hiding_enabled_flag", "", bits = 1)
    uint32_tb("cabac_init_present_flag", "", bits = 1)
    uint32_tb("constrained_intra_pred_flag", "", bits = 1)
    uint32_tb("transform_skip_enabled_flag", "", bits = 1)
    uint32_tb("cu_qp_delta_enabled_flag", "", bits = 1)
    uint32_tb("pps_slice_chroma_qp_offsets_present_flag", "", bits = 1)
    uint32_tb("weighted_pred_flag", "", bits = 1)
    uint32_tb("weighted_bipred_flag", "", bits = 1)
    uint32_tb("transquant_bypass_enabled_flag", "", bits = 1)
    uint32_tb("tiles_enabled_flag", "", bits = 1)
    uint32_tb("entropy_coding_sync_enabled_flag", "", bits = 1)
    uint32_tb("uniform_spacing_flag", "", bits = 1)
    uint32_tb("loop_filter_across_tiles_enabled_flag", "", bits = 1)
    uint32_tb("pps_loop_filter_across_slices_enabled_flag", "", bits = 1)
    uint32_tb("deblocking_filter_control_present_flag", "", bits = 1)
    uint32_tb("deblocking_filter_override_enabled_flag", "", bits = 1)
    uint32_tb("pps_deblocking_filter_disabled_flag", "", bits = 1)
    uint32_tb("pps_scaling_list_data_present_flag", "", bits = 1)
    uint32_tb("lists_modification_present_flag", "", bits = 1)
    uint32_tb("slice_segment_header_extension_present_flag", "", bits = 1)
    uint32_tb("pps_extension_present_flag", "", bits = 1)
    uint32_tb("cross_component_prediction_enabled_flag", "extension PPS flags, valid when #VIDEO_H265_PROFILE_IDC_FORMAT_RANGE_EXTENSIONS is set", bits = 1)
    uint32_tb("chroma_qp_offset_list_enabled_flag", "", bits = 1)
    uint32_tb("pps_curr_pic_ref_enabled_flag", "extension PPS flags, valid when #VIDEO_H265_PROFILE_IDC_SCC_EXTENSIONS is set", bits = 1)
    uint32_tb("residual_adaptive_colour_transform_enabled_flag", "", bits = 1)
    uint32_tb("pps_slice_act_qp_offsets_present_flag", "", bits = 1)
    uint32_tb("pps_palette_predictor_initializer_present_flag", "", bits = 1)
    uint32_tb("monochrome_palette_flag", "", bits = 1)
    uint32_tb("pps_range_extension_flag", "", bits = 1)
}

val StdVideoH265PictureParameterSet = struct(Module.VULKAN, "StdVideoH265PictureParameterSet") {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideoCodecH265.*")

    uint8_t("pps_pic_parameter_set_id", "")
    uint8_t("pps_seq_parameter_set_id", "")
    uint8_t("num_extra_slice_header_bits", "")
    uint8_t("num_ref_idx_l0_default_active_minus1", "")
    uint8_t("num_ref_idx_l1_default_active_minus1", "")
    int8_t("init_qp_minus26", "")
    uint8_t("diff_cu_qp_delta_depth", "")
    int8_t("pps_cb_qp_offset", "")
    int8_t("pps_cr_qp_offset", "")
    uint8_t("num_tile_columns_minus1", "")
    uint8_t("num_tile_rows_minus1", "")
    uint16_t("column_width_minus1", "")["STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_COLS_LIST_SIZE"]
    uint16_t("row_height_minus1", "")["STD_VIDEO_H265_CHROMA_QP_OFFSET_TILE_ROWS_LIST_SIZE"]
    int8_t("pps_beta_offset_div2", "")
    int8_t("pps_tc_offset_div2", "")
    uint8_t("log2_parallel_merge_level_minus2", "")
    StdVideoH265PpsFlags("flags", "")
    StdVideoH265ScalingLists.p("pScalingLists", "must be a valid pointer if {@code pps_scaling_list_data_present_flag} is set")
    uint8_t("log2_max_transform_skip_block_size_minus2", "extension PPS, valid when #VIDEO_H265_PROFILE_IDC_FORMAT_RANGE_EXTENSIONS is set")
    uint8_t("diff_cu_chroma_qp_offset_depth", "")
    uint8_t("chroma_qp_offset_list_len_minus1", "")
    int8_t("cb_qp_offset_list", "")["STD_VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE"]
    int8_t("cr_qp_offset_list", "")["STD_VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE"]
    uint8_t("log2_sao_offset_scale_luma", "")
    uint8_t("log2_sao_offset_scale_chroma", "")
    int8_t("pps_act_y_qp_offset_plus5", "extension PPS, valid when std_video_h265_profile_idc_scc_extensions is set")
    int8_t("pps_act_cb_qp_offset_plus5", "")
    int8_t("pps_act_cr_qp_offset_plus5", "")
    uint8_t("pps_num_palette_predictor_initializer", "")
    uint8_t("luma_bit_depth_entry_minus8", "")
    uint8_t("chroma_bit_depth_entry_minus8", "")
    StdVideoH265PredictorPaletteEntries.p("pPredictorPaletteEntries", "must be a valid pointer if pps_palette_predictor_initializer_present_flag is set")
}

// vulkan_video_codec_h265std_decode.h

val StdVideoDecodeH265PictureInfoFlags = struct(Module.VULKAN, "StdVideoDecodeH265PictureInfoFlags") {
    subpackage = "video"

    uint32_t("IrapPicFlag", "", bits = 1)
    uint32_t("IdrPicFlag", "", bits = 1)
    uint32_t("IsReference", "", bits = 1)
    uint32_t("short_term_ref_pic_set_sps_flag", "", bits = 1)
}

val StdVideoDecodeH265PictureInfo = struct(Module.VULKAN, "StdVideoDecodeH265PictureInfo") {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideoCodecH265.*")

    uint8_t("vps_video_parameter_set_id", "")
    uint8_t("sps_seq_parameter_set_id", "")
    uint8_t("pps_pic_parameter_set_id", "")
    uint8_t("num_short_term_ref_pic_sets", "")
    int32_t("PicOrderCntVal", "")
    uint16_t("NumBitsForSTRefPicSetInSlice", "number of bits used in st_ref_pic_set() when short_term_ref_pic_set_sps_flag is 0; otherwise set to 0")
    uint8_t("NumDeltaPocsOfRefRpsIdx", "numDeltaPocs[ RefRpsIdx ] when short_term_ref_pic_set_sps_flag = 1, otherwise 0")
    uint8_t(
        "RefPicSetStCurrBefore",
        "slotIndex as used in VkVideoReferenceSlotKHR structures representing pReferenceSlots in VkVideoDecodeInfoKHR, 0xff for invalid slotIndex"
    )["STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE"]
    uint8_t(
        "RefPicSetStCurrAfter",
        "slotIndex as used in VkVideoReferenceSlotKHR structures representing pReferenceSlots in VkVideoDecodeInfoKHR, 0xff for invalid slotIndex"
    )["STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE"]
    uint8_t(
        "RefPicSetLtCurr",
        "slotIndex as used in VkVideoReferenceSlotKHR structures representing pReferenceSlots in VkVideoDecodeInfoKHR, 0xff for invalid slotIndex"
    )["STD_VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE"]
    StdVideoDecodeH265PictureInfoFlags("flags", "")
}

val StdVideoDecodeH265ReferenceInfoFlags = struct(Module.VULKAN, "StdVideoDecodeH265ReferenceInfoFlags") {
    subpackage = "video"

    uint32_t("is_long_term", "", bits = 1)
    uint32_t("is_non_existing", "", bits = 1)
}

val StdVideoDecodeH265ReferenceInfo = struct(Module.VULKAN, "StdVideoDecodeH265ReferenceInfo") {
    subpackage = "video"

    int32_t("PicOrderCntVal", "")
    StdVideoDecodeH265ReferenceInfoFlags("flags", "")
}

// vulkan_video_code_h265std_encode

val StdVideoEncodeH265SliceSegmentHeaderFlags = struct(Module.VULKAN, "StdVideoEncodeH265SliceSegmentHeaderFlags") {
    subpackage = "video"

    uint32_t("first_slice_segment_in_pic_flag", "", bits = 1)
    uint32_t("no_output_of_prior_pics_flag", "", bits = 1)
    uint32_t("dependent_slice_segment_flag", "", bits = 1)
    uint32_t("short_term_ref_pic_set_sps_flag", "", bits = 1)
    uint32_t("slice_temporal_mvp_enable_flag", "", bits = 1)
    uint32_t("slice_sao_luma_flag", "", bits = 1)
    uint32_t("slice_sao_chroma_flag", "", bits = 1)
    uint32_t("num_ref_idx_active_override_flag", "", bits = 1)
    uint32_t("mvd_l1_zero_flag", "", bits = 1)
    uint32_t("cabac_init_flag", "", bits = 1)
    uint32_t("slice_deblocking_filter_disable_flag", "", bits = 1)
    uint32_t("collocated_from_l0_flag", "", bits = 1)
    uint32_t("slice_loop_filter_across_slices_enabled_flag", "", bits = 1)
    uint32_t("bLastSliceInPic", "", bits = 1)
    uint32_t("reservedBits", "", bits = 18)
    uint16_t("luma_weight_l0_flag", "bit 0 - num_ref_idx_l0_active_minus1")
    uint16_t("chroma_weight_l0_flag", "bit 0 - num_ref_idx_l0_active_minus1")
    uint16_t("luma_weight_l1_flag", "bit 0 - num_ref_idx_l1_active_minus1")
    uint16_t("chroma_weight_l1_flag", "bit 0 - num_ref_idx_l1_active_minus1")
}

val StdVideoEncodeH265SliceSegmentHeader = struct(Module.VULKAN, "StdVideoEncodeH265SliceSegmentHeader") {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideoCodecH265.*")

    StdVideoH265SliceType("slice_type", "")
    uint8_t("slice_pic_parameter_set_id", "")
    uint8_t("num_short_term_ref_pic_sets", "")
    uint32_t("slice_segment_address", "")
    uint8_t("short_term_ref_pic_set_idx", "")
    uint8_t("num_long_term_sps", "")
    uint8_t("num_long_term_pics", "")
    uint8_t("collocated_ref_idx", "")
    uint8_t("num_ref_idx_l0_active_minus1", "[0, 14]")
    uint8_t("num_ref_idx_l1_active_minus1", "[0, 14]")
    uint8_t("luma_log2_weight_denom", "[0, 7]")
    int8_t("delta_chroma_log2_weight_denom", "")
    int8_t("delta_luma_weight_l0", "")["STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE"]
    int8_t("luma_offset_l0", "")["STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE"]
    int8_t("delta_chroma_weight_l0", "")["STD_VIDEO_ENCODE_H265_CHROMA_LIST_SIZE"]["STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM"]
    int8_t("delta_chroma_offset_l0", "")["STD_VIDEO_ENCODE_H265_CHROMA_LIST_SIZE"]["STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM"]
    int8_t("delta_luma_weight_l1", "")["STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE"]
    int8_t("luma_offset_l1", "")["STD_VIDEO_ENCODE_H265_LUMA_LIST_SIZE"]
    int8_t("delta_chroma_weight_l1", "")["STD_VIDEO_ENCODE_H265_CHROMA_LIST_SIZE"]["STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM"]
    int8_t("delta_chroma_offset_l1", "")["STD_VIDEO_ENCODE_H265_CHROMA_LIST_SIZE"]["STD_VIDEO_ENCODE_H265_CHROMA_LISTS_NUM"]
    uint8_t("MaxNumMergeCand", "")
    int8_t("slice_cb_qp_offset", "[-12, 12]")
    int8_t("slice_cr_qp_offset", "[-12, 12]")
    int8_t("slice_beta_offset_div2", "[-6, 6]")
    int8_t("slice_tc_offset_div2", "[-6, 6]")
    int8_t("slice_act_y_qp_offset", "")
    int8_t("slice_act_cb_qp_offset", "")
    int8_t("slice_act_cr_qp_offset", "")
    StdVideoEncodeH265SliceSegmentHeaderFlags("flags", "")
}

val StdVideoEncodeH265ReferenceModificationFlags = struct(Module.VULKAN, "StdVideoEncodeH265ReferenceModificationFlags") {
    subpackage = "video"

    uint32_t("ref_pic_list_modification_flag_l0", "", bits = 1)
    uint32_t("ref_pic_list_modification_flag_l1", "", bits = 1)
}

val StdVideoEncodeH265ReferenceModifications = struct(Module.VULKAN, "StdVideoEncodeH265ReferenceModifications") {
    subpackage = "video"

    StdVideoEncodeH265ReferenceModificationFlags("flags", "")
    uint8_t("referenceList0ModificationsCount", "num_ref_idx_l0_active_minus1")
    uint8_t.p("pReferenceList0Modifications", "list_entry_l0")
    uint8_t("referenceList1ModificationsCount", "num_ref_idx_l1_active_minus1")
    uint8_t.p("pReferenceList1Modifications", "list_entry_l1")
}

val StdVideoEncodeH265PictureInfoFlags = struct(Module.VULKAN, "StdVideoEncodeH265PictureInfoFlags") {
    subpackage = "video"

    uint32_t("is_reference_flag", "", bits = 1)
    uint32_t("IrapPicFlag", "", bits = 1)
    uint32_t("long_term_flag", "", bits = 1)
}

val StdVideoEncodeH265PictureInfo = struct(Module.VULKAN, "StdVideoEncodeH265PictureInfo") {
    subpackage = "video"

    StdVideoH265PictureType("PictureType", "")
    uint8_t("sps_video_parameter_set_id", "")
    uint8_t("pps_seq_parameter_set_id", "")
    int32_t("PicOrderCntVal", "")
    uint8_t("TemporalId", "")
    StdVideoEncodeH265PictureInfoFlags("flags", "")
}

val StdVideoEncodeH265ReferenceInfoFlags = struct(Module.VULKAN, "StdVideoEncodeH265ReferenceInfoFlags") {
    subpackage = "video"

    uint32_t("is_long_term", "", bits = 1)
    uint32_t("isUsedFlag", "", bits = 1)
}

val StdVideoEncodeH265ReferenceInfo = struct(Module.VULKAN, "StdVideoEncodeH265ReferenceInfo") {
    subpackage = "video"

    int32_t("PicOrderCntVal", "")
    uint8_t("TemporalId", "")
    StdVideoEncodeH265ReferenceInfoFlags("flags", "")
}
