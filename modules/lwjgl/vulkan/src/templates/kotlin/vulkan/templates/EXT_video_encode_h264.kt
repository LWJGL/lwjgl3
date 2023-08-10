/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_video_encode_h264 = "EXTVideoEncodeH264".nativeClassVK("EXT_video_encode_h264", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension builds upon the {@link KHRVideoEncodeQueue VK_KHR_video_encode_queue} extension by adding support for encoding elementary video stream sequences compliant with the H.264/AVC video compression standard.

        <h5>VK_EXT_video_encode_h264</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_video_encode_h264}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>39</dd>

            <dt><b>Revision</b></dt>
            <dd>10</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRVideoEncodeQueue VK_KHR_video_encode_queue}

            <ul>
                <li>This is a <em>provisional</em> extension and <b>must</b> be used with caution. See the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#boilerplate-provisional-header">description</a> of provisional header files for enablement and stability details.</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Ahmed Abdelkhalek <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_video_encode_h264]%20@aabdelkh%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_video_encode_h264%20extension*">aabdelkh</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2023-03-06</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Ahmed Abdelkhalek, AMD</li>
                <li>George Hao, AMD</li>
                <li>Jake Beju, AMD</li>
                <li>Peter Fang, AMD</li>
                <li>Ping Liu, Intel</li>
                <li>Srinath Kumarapuram, NVIDIA</li>
                <li>Tony Zlatinski, NVIDIA</li>
                <li>Yang Liu, AMD</li>
                <li>Daniel Rakos, RasterGrid</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_VIDEO_ENCODE_H264_SPEC_VERSION".."10"
    )

    StringConstant(
        "The extension name.",

        "EXT_VIDEO_ENCODE_H264_EXTENSION_NAME".."VK_EXT_video_encode_h264"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_CAPABILITIES_EXT".."1000038000",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_CREATE_INFO_EXT".."1000038001",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_ADD_INFO_EXT".."1000038002",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_VCL_FRAME_INFO_EXT".."1000038003",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_DPB_SLOT_INFO_EXT".."1000038004",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_NALU_SLICE_INFO_EXT".."1000038005",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_PROFILE_INFO_EXT".."1000038007",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_RATE_CONTROL_INFO_EXT".."1000038008",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_RATE_CONTROL_LAYER_INFO_EXT".."1000038009"
    )

    EnumConstant(
        "Extends {@code VkVideoCodecOperationFlagBitsKHR}.",

        "VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_EXT".enum(0x00010000)
    )

    EnumConstant(
        """
        VkVideoEncodeH264CapabilityFlagBitsEXT - Video encode H.264 capability flags

        <h5>Description</h5>
        <ul>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_DIRECT_8X8_INFERENCE_ENABLED_BIT_EXT reports if enabling direct_8x8_inference_flag in StdVideoH264SpsFlags is supported.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_DIRECT_8X8_INFERENCE_DISABLED_BIT_EXT reports if disabling direct_8x8_inference_flag in StdVideoH264SpsFlags is supported.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_SEPARATE_COLOUR_PLANE_BIT_EXT reports if enabling separate_colour_plane_flag in StdVideoH264SpsFlags is supported.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_QPPRIME_Y_ZERO_TRANSFORM_BYPASS_BIT_EXT reports if enabling qpprime_y_zero_transform_bypass_flag in StdVideoH264SpsFlags is supported.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_SCALING_LISTS_BIT_EXT reports if enabling seq_scaling_matrix_present_flag in StdVideoH264SpsFlags or pic_scaling_matrix_present_flag in StdVideoH264PpsFlags are supported.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_HRD_COMPLIANCE_BIT_EXT reports if the implementation guarantees generating a HRD compliant bitstream if nal_hrd_parameters_present_flag or vcl_hrd_parameters_present_flag are enabled in StdVideoH264SpsVuiFlags.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_CHROMA_QP_OFFSET_BIT_EXT reports if setting non-zero chroma_qp_index_offset in StdVideoH264PictureParameterSet is supported.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_SECOND_CHROMA_QP_OFFSET_BIT_EXT reports if setting non-zero second_chroma_qp_index_offset in StdVideoH264PictureParameterSet is supported.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_PIC_INIT_QP_MINUS26_BIT_EXT reports if setting non-zero pic_init_qp_minus26 in StdVideoH264PictureParameterSet is supported.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_WEIGHTED_PRED_BIT_EXT reports if enabling weighted_pred_flag in StdVideoH264PpsFlags is supported.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_WEIGHTED_BIPRED_EXPLICIT_BIT_EXT reports if using STD_VIDEO_H264_WEIGHTED_BIPRED_IDC_EXPLICIT from StdVideoH264WeightedBipredIdc is supported.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_WEIGHTED_BIPRED_IMPLICIT_BIT_EXT reports if using STD_VIDEO_H264_WEIGHTED_BIPRED_IDC_IMPLICIT from StdVideoH264WeightedBipredIdc is supported.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_WEIGHTED_PRED_NO_TABLE_BIT_EXT reports that when weighted_pred_flag is enabled or STD_VIDEO_H264_WEIGHTED_BIPRED_IDC_EXPLICIT from StdVideoH264WeightedBipredIdc is used, the implementation is able to internally decide syntax for pred_weight_table.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_TRANSFORM_8X8_BIT_EXT reports if enabling transform_8x8_mode_flag in StdVideoH264PpsFlags is supported.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_CABAC_BIT_EXT reports if CABAC entropy coding is supported.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_CAVLC_BIT_EXT reports if CAVLC entropy coding is supported. An implementation <b>must</b> support at least one entropy coding mode.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_DEBLOCKING_FILTER_DISABLED_BIT_EXT reports if using STD_VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_DISABLED from StdVideoH264DisableDeblockingFilterIdc is supported.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_DEBLOCKING_FILTER_ENABLED_BIT_EXT reports if using STD_VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_ENABLED from StdVideoH264DisableDeblockingFilterIdc is supported.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_DEBLOCKING_FILTER_PARTIAL_BIT_EXT reports if using STD_VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_PARTIAL from StdVideoH264DisableDeblockingFilterIdc is supported. An implementation <b>must</b> support at least one deblocking filter mode.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_DISABLE_DIRECT_SPATIAL_MV_PRED_BIT_EXT reports if disabling {@code StdVideoEncodeH264SliceHeaderFlags}::direct_spatial_mv_pred_flag is supported when it is present in the slice header.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_MULTIPLE_SLICE_PER_FRAME_BIT_EXT reports if encoding multiple slices per frame is supported. If not set, the implementation is only able to encode a single slice for the entire frame.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_SLICE_MB_COUNT_BIT_EXT reports support for configuring ##VkVideoEncodeH264NaluSliceInfoEXT{@code ::mbCount} and first_mb_in_slice in StdVideoEncodeH264SliceHeader for each slice in a frame with multiple slices. If not supported, the implementation decides the number of macroblocks in each slice based on ##VkVideoEncodeH264VclFrameInfoEXT{@code ::naluSliceEntryCount}.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_ROW_UNALIGNED_SLICE_BIT_EXT reports that each slice in a frame with multiple slices may begin or finish at any offset in a macroblock row. If not supported, all slices in the frame <b>must</b> begin at the start of a macroblock row (and hence each slice <b>must</b> finish at the end of a macroblock row).</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_DIFFERENT_SLICE_TYPE_BIT_EXT reports that when #VIDEO_ENCODE_H264_CAPABILITY_MULTIPLE_SLICE_PER_FRAME_BIT_EXT is supported and a frame is encoded with multiple slices, the implementation allows encoding each slice with a different {@code StdVideoEncodeH264SliceHeader}::slice_type. If not supported, all slices of the frame <b>must</b> be encoded with the same {@code slice_type} which corresponds to the picture type of the frame. For example, all slices of a P-frame would be encoded as P-slices.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_B_FRAME_IN_L1_LIST_BIT_EXT reports support for using a B frame as L1 reference.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_DIFFERENT_REFERENCE_FINAL_LISTS_BIT_EXT reports that the implementation allows encoding each slice with a different {@code StdVideoEncodeH264ReferenceListsInfo}. If not supported, all slices of the frame <b>must</b> be encoded with the same {@code StdVideoEncodeH264ReferenceListsInfo}.</li>
        </ul>
        """,

        "VIDEO_ENCODE_H264_CAPABILITY_DIRECT_8X8_INFERENCE_ENABLED_BIT_EXT".enum(0x00000001),
        "VIDEO_ENCODE_H264_CAPABILITY_DIRECT_8X8_INFERENCE_DISABLED_BIT_EXT".enum(0x00000002),
        "VIDEO_ENCODE_H264_CAPABILITY_SEPARATE_COLOUR_PLANE_BIT_EXT".enum(0x00000004),
        "VIDEO_ENCODE_H264_CAPABILITY_QPPRIME_Y_ZERO_TRANSFORM_BYPASS_BIT_EXT".enum(0x00000008),
        "VIDEO_ENCODE_H264_CAPABILITY_SCALING_LISTS_BIT_EXT".enum(0x00000010),
        "VIDEO_ENCODE_H264_CAPABILITY_HRD_COMPLIANCE_BIT_EXT".enum(0x00000020),
        "VIDEO_ENCODE_H264_CAPABILITY_CHROMA_QP_OFFSET_BIT_EXT".enum(0x00000040),
        "VIDEO_ENCODE_H264_CAPABILITY_SECOND_CHROMA_QP_OFFSET_BIT_EXT".enum(0x00000080),
        "VIDEO_ENCODE_H264_CAPABILITY_PIC_INIT_QP_MINUS26_BIT_EXT".enum(0x00000100),
        "VIDEO_ENCODE_H264_CAPABILITY_WEIGHTED_PRED_BIT_EXT".enum(0x00000200),
        "VIDEO_ENCODE_H264_CAPABILITY_WEIGHTED_BIPRED_EXPLICIT_BIT_EXT".enum(0x00000400),
        "VIDEO_ENCODE_H264_CAPABILITY_WEIGHTED_BIPRED_IMPLICIT_BIT_EXT".enum(0x00000800),
        "VIDEO_ENCODE_H264_CAPABILITY_WEIGHTED_PRED_NO_TABLE_BIT_EXT".enum(0x00001000),
        "VIDEO_ENCODE_H264_CAPABILITY_TRANSFORM_8X8_BIT_EXT".enum(0x00002000),
        "VIDEO_ENCODE_H264_CAPABILITY_CABAC_BIT_EXT".enum(0x00004000),
        "VIDEO_ENCODE_H264_CAPABILITY_CAVLC_BIT_EXT".enum(0x00008000),
        "VIDEO_ENCODE_H264_CAPABILITY_DEBLOCKING_FILTER_DISABLED_BIT_EXT".enum(0x00010000),
        "VIDEO_ENCODE_H264_CAPABILITY_DEBLOCKING_FILTER_ENABLED_BIT_EXT".enum(0x00020000),
        "VIDEO_ENCODE_H264_CAPABILITY_DEBLOCKING_FILTER_PARTIAL_BIT_EXT".enum(0x00040000),
        "VIDEO_ENCODE_H264_CAPABILITY_DISABLE_DIRECT_SPATIAL_MV_PRED_BIT_EXT".enum(0x00080000),
        "VIDEO_ENCODE_H264_CAPABILITY_MULTIPLE_SLICE_PER_FRAME_BIT_EXT".enum(0x00100000),
        "VIDEO_ENCODE_H264_CAPABILITY_SLICE_MB_COUNT_BIT_EXT".enum(0x00200000),
        "VIDEO_ENCODE_H264_CAPABILITY_ROW_UNALIGNED_SLICE_BIT_EXT".enum(0x00400000),
        "VIDEO_ENCODE_H264_CAPABILITY_DIFFERENT_SLICE_TYPE_BIT_EXT".enum(0x00800000),
        "VIDEO_ENCODE_H264_CAPABILITY_B_FRAME_IN_L1_LIST_BIT_EXT".enum(0x01000000),
        "VIDEO_ENCODE_H264_CAPABILITY_DIFFERENT_REFERENCE_FINAL_LISTS_BIT_EXT".enum(0x02000000)
    )

    EnumConstant(
        """
        VkVideoEncodeH264RateControlStructureEXT - Specifies the video encode H.264 rate control structure

        <h5>Description</h5>
        <ul>
            <li>#VIDEO_ENCODE_H264_RATE_CONTROL_STRUCTURE_UNKNOWN_EXT specifies a reference structure unknown at the time of stream rate control configuration.</li>
            <li>#VIDEO_ENCODE_H264_RATE_CONTROL_STRUCTURE_FLAT_EXT specifies a flat reference structure.</li>
            <li>#VIDEO_ENCODE_H264_RATE_CONTROL_STRUCTURE_DYADIC_EXT specifies a dyadic reference structure.</li>
        </ul>

        <h5>See Also</h5>
        ##VkVideoEncodeH264RateControlInfoEXT
        """,

        "VIDEO_ENCODE_H264_RATE_CONTROL_STRUCTURE_UNKNOWN_EXT".."0",
        "VIDEO_ENCODE_H264_RATE_CONTROL_STRUCTURE_FLAT_EXT".."1",
        "VIDEO_ENCODE_H264_RATE_CONTROL_STRUCTURE_DYADIC_EXT".."2"
    )
}