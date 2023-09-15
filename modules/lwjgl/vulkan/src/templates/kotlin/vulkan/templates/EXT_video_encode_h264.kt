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
            <dd>12</dd>

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
            <dd>2023-07-19</dd>

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
                <li>Ravi Chaudhary, NVIDIA</li>
                <li>Yang Liu, AMD</li>
                <li>Daniel Rakos, RasterGrid</li>
                <li>Aidan Fabius, Core Avionics &amp; Industrial Inc.</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_VIDEO_ENCODE_H264_SPEC_VERSION".."12"
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
        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_PICTURE_INFO_EXT".."1000038003",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_DPB_SLOT_INFO_EXT".."1000038004",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_NALU_SLICE_INFO_EXT".."1000038005",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_GOP_REMAINING_FRAME_INFO_EXT".."1000038006",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_PROFILE_INFO_EXT".."1000038007",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_RATE_CONTROL_INFO_EXT".."1000038008",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_RATE_CONTROL_LAYER_INFO_EXT".."1000038009",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_CREATE_INFO_EXT".."1000038010",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_QUALITY_LEVEL_PROPERTIES_EXT".."1000038011",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_GET_INFO_EXT".."1000038012",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_FEEDBACK_INFO_EXT".."1000038013"
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
            <li>#VIDEO_ENCODE_H264_CAPABILITY_HRD_COMPLIANCE_BIT_EXT indicates if the implementation guarantees generating a HRD compliant bitstream if {@code nal_hrd_parameters_present_flag} or {@code vcl_hrd_parameters_present_flag} are enabled in {@code StdVideoH264SpsVuiFlags}.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_PREDICTION_WEIGHT_TABLE_GENERATED_BIT_EXT indicates that when {@code weighted_pred_flag} is enabled or {@code STD_VIDEO_H264_WEIGHTED_BIPRED_IDC_EXPLICIT} from {@code StdVideoH264WeightedBipredIdc} is used, the implementation is able to internally decide syntax for {@code pred_weight_table}.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_ROW_UNALIGNED_SLICE_BIT_EXT indicates that each slice in a frame with multiple slices may begin or finish at any offset in a macroblock row. If not supported, all slices in the frame <b>must</b> begin at the start of a macroblock row (and hence each slice <b>must</b> finish at the end of a macroblock row).</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_DIFFERENT_SLICE_TYPE_BIT_EXT indicates that when a frame is encoded with multiple slices, the implementation allows encoding each slice with a different {@code StdVideoEncodeH264SliceHeader}{@code ::slice_type}. If not supported, all slices of the frame <b>must</b> be encoded with the same {@code slice_type} which corresponds to the picture type of the frame. For example, all slices of a P-frame would be encoded as P-slices.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_B_FRAME_IN_L0_LIST_BIT_EXT indicates support for using a B frame as L0 reference.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_B_FRAME_IN_L1_LIST_BIT_EXT indicates support for using a B frame as L1 reference.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_PER_PICTURE_TYPE_MIN_MAX_QP_BIT_EXT indicates support for specifying different QP values in the members of ##VkVideoEncodeH264QpEXT.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_PER_SLICE_CONSTANT_QP_BIT_EXT indicates support for specifying different constant QP values for each slice.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_GENERATE_PREFIX_NALU_BIT_EXT indicates support for generating prefix NALUs by setting ##VkVideoEncodeH264PictureInfoEXT{@code ::generatePrefixNalu} to #TRUE.</li>
        </ul>
        """,

        "VIDEO_ENCODE_H264_CAPABILITY_HRD_COMPLIANCE_BIT_EXT".enum(0x00000001),
        "VIDEO_ENCODE_H264_CAPABILITY_PREDICTION_WEIGHT_TABLE_GENERATED_BIT_EXT".enum(0x00000002),
        "VIDEO_ENCODE_H264_CAPABILITY_ROW_UNALIGNED_SLICE_BIT_EXT".enum(0x00000004),
        "VIDEO_ENCODE_H264_CAPABILITY_DIFFERENT_SLICE_TYPE_BIT_EXT".enum(0x00000008),
        "VIDEO_ENCODE_H264_CAPABILITY_B_FRAME_IN_L0_LIST_BIT_EXT".enum(0x00000010),
        "VIDEO_ENCODE_H264_CAPABILITY_B_FRAME_IN_L1_LIST_BIT_EXT".enum(0x00000020),
        "VIDEO_ENCODE_H264_CAPABILITY_PER_PICTURE_TYPE_MIN_MAX_QP_BIT_EXT".enum(0x00000040),
        "VIDEO_ENCODE_H264_CAPABILITY_PER_SLICE_CONSTANT_QP_BIT_EXT".enum(0x00000080),
        "VIDEO_ENCODE_H264_CAPABILITY_GENERATE_PREFIX_NALU_BIT_EXT".enum(0x00000100)
    )

    EnumConstant(
        """
        VkVideoEncodeH264StdFlagBitsEXT - Video encode H.264 syntax capability flags

        <h5>Description</h5>
        <ul>
            <li>#VIDEO_ENCODE_H264_STD_SEPARATE_COLOR_PLANE_FLAG_SET_BIT_EXT indicates if enabling {@code separate_colour_plane_flag} in {@code StdVideoH264SpsFlags} is supported.</li>
            <li>#VIDEO_ENCODE_H264_STD_QPPRIME_Y_ZERO_TRANSFORM_BYPASS_FLAG_SET_BIT_EXT indicates if enabling {@code qpprime_y_zero_transform_bypass_flag} in {@code StdVideoH264SpsFlags} is supported.</li>
            <li>#VIDEO_ENCODE_H264_STD_SCALING_MATRIX_PRESENT_FLAG_SET_BIT_EXT indicates if enabling {@code seq_scaling_matrix_present_flag} in {@code StdVideoH264SpsFlags} or {@code pic_scaling_matrix_present_flag} in {@code StdVideoH264PpsFlags} are supported.</li>
            <li>#VIDEO_ENCODE_H264_STD_CHROMA_QP_INDEX_OFFSET_BIT_EXT indicates if setting non-zero {@code chroma_qp_index_offset} in {@code StdVideoH264PictureParameterSet} is supported.</li>
            <li>#VIDEO_ENCODE_H264_STD_SECOND_CHROMA_QP_INDEX_OFFSET_BIT_EXT indicates if setting non-zero {@code second_chroma_qp_index_offset} in {@code StdVideoH264PictureParameterSet} is supported.</li>
            <li>#VIDEO_ENCODE_H264_STD_PIC_INIT_QP_MINUS26_BIT_EXT indicates if setting non-zero {@code pic_init_qp_minus26} in {@code StdVideoH264PictureParameterSet} is supported.</li>
            <li>#VIDEO_ENCODE_H264_STD_WEIGHTED_PRED_FLAG_SET_BIT_EXT indicates if enabling {@code weighted_pred_flag} in {@code StdVideoH264PpsFlags} is supported.</li>
            <li>#VIDEO_ENCODE_H264_STD_WEIGHTED_BIPRED_IDC_EXPLICIT_BIT_EXT indicates if using {@code STD_VIDEO_H264_WEIGHTED_BIPRED_IDC_EXPLICIT} from {@code StdVideoH264WeightedBipredIdc} is supported.</li>
            <li>#VIDEO_ENCODE_H264_STD_WEIGHTED_BIPRED_IDC_IMPLICIT_BIT_EXT indicates if using {@code STD_VIDEO_H264_WEIGHTED_BIPRED_IDC_IMPLICIT} from {@code StdVideoH264WeightedBipredIdc} is supported.</li>
            <li>#VIDEO_ENCODE_H264_STD_TRANSFORM_8X8_MODE_FLAG_SET_BIT_EXT indicates if enabling {@code transform_8x8_mode_flag} in {@code StdVideoH264PpsFlags} is supported.</li>
            <li>#VIDEO_ENCODE_H264_STD_DIRECT_SPATIAL_MV_PRED_FLAG_UNSET_BIT_EXT indicates if disabling {@code StdVideoEncodeH264SliceHeaderFlags}{@code ::direct_spatial_mv_pred_flag} is supported when it is present in the slice header.</li>
            <li>#VIDEO_ENCODE_H264_STD_ENTROPY_CODING_MODE_FLAG_UNSET_BIT_EXT indicates if CAVLC entropy coding is supported.</li>
            <li>#VIDEO_ENCODE_H264_STD_ENTROPY_CODING_MODE_FLAG_SET_BIT_EXT indicates if CABAC entropy coding is supported. An implementation <b>must</b> support at least one entropy coding mode.</li>
            <li>#VIDEO_ENCODE_H264_STD_DIRECT_8X8_INFERENCE_FLAG_UNSET_BIT_EXT indicates if disabling {@code direct_8x8_inference_flag} in {@code StdVideoH264SpsFlags} is supported.</li>
            <li>#VIDEO_ENCODE_H264_STD_CONSTRAINED_INTRA_PRED_FLAG_SET_BIT_EXT indicates if enabling {@code constrained_intra_pred_flag} in {@code StdVideoH264PpsFlags} is supported.</li>
            <li>#VIDEO_ENCODE_H264_STD_DEBLOCKING_FILTER_DISABLED_BIT_EXT indicates if using {@code STD_VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_DISABLED} from StdVideoH264DisableDeblockingFilterIdc is supported.</li>
            <li>#VIDEO_ENCODE_H264_STD_DEBLOCKING_FILTER_ENABLED_BIT_EXT indicates if using {@code STD_VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_ENABLED} from StdVideoH264DisableDeblockingFilterIdc is supported.</li>
            <li>#VIDEO_ENCODE_H264_STD_DEBLOCKING_FILTER_PARTIAL_BIT_EXT indicates if using {@code STD_VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_PARTIAL} from StdVideoH264DisableDeblockingFilterIdc is supported. An implementation <b>must</b> support at least one deblocking filter mode.</li>
            <li>#VIDEO_ENCODE_H264_STD_SLICE_QP_DELTA_BIT_EXT indicates whether the implementation supports using the application-provided value for {@code StdVideoEncodeH264SliceHeader}{@code ::slice_qp_delta} when that value is identical across the slices of the encoded frame.</li>
            <li>#VIDEO_ENCODE_H264_STD_DIFFERENT_SLICE_QP_DELTA_BIT_EXT indicates whether the implementation supports using the application-provided value for {@code StdVideoEncodeH264SliceHeader}{@code ::slice_qp_delta} when that value is different across the slices of the encoded frame.</li>
        </ul>
        """,

        "VIDEO_ENCODE_H264_STD_SEPARATE_COLOR_PLANE_FLAG_SET_BIT_EXT".enum(0x00000001),
        "VIDEO_ENCODE_H264_STD_QPPRIME_Y_ZERO_TRANSFORM_BYPASS_FLAG_SET_BIT_EXT".enum(0x00000002),
        "VIDEO_ENCODE_H264_STD_SCALING_MATRIX_PRESENT_FLAG_SET_BIT_EXT".enum(0x00000004),
        "VIDEO_ENCODE_H264_STD_CHROMA_QP_INDEX_OFFSET_BIT_EXT".enum(0x00000008),
        "VIDEO_ENCODE_H264_STD_SECOND_CHROMA_QP_INDEX_OFFSET_BIT_EXT".enum(0x00000010),
        "VIDEO_ENCODE_H264_STD_PIC_INIT_QP_MINUS26_BIT_EXT".enum(0x00000020),
        "VIDEO_ENCODE_H264_STD_WEIGHTED_PRED_FLAG_SET_BIT_EXT".enum(0x00000040),
        "VIDEO_ENCODE_H264_STD_WEIGHTED_BIPRED_IDC_EXPLICIT_BIT_EXT".enum(0x00000080),
        "VIDEO_ENCODE_H264_STD_WEIGHTED_BIPRED_IDC_IMPLICIT_BIT_EXT".enum(0x00000100),
        "VIDEO_ENCODE_H264_STD_TRANSFORM_8X8_MODE_FLAG_SET_BIT_EXT".enum(0x00000200),
        "VIDEO_ENCODE_H264_STD_DIRECT_SPATIAL_MV_PRED_FLAG_UNSET_BIT_EXT".enum(0x00000400),
        "VIDEO_ENCODE_H264_STD_ENTROPY_CODING_MODE_FLAG_UNSET_BIT_EXT".enum(0x00000800),
        "VIDEO_ENCODE_H264_STD_ENTROPY_CODING_MODE_FLAG_SET_BIT_EXT".enum(0x00001000),
        "VIDEO_ENCODE_H264_STD_DIRECT_8X8_INFERENCE_FLAG_UNSET_BIT_EXT".enum(0x00002000),
        "VIDEO_ENCODE_H264_STD_CONSTRAINED_INTRA_PRED_FLAG_SET_BIT_EXT".enum(0x00004000),
        "VIDEO_ENCODE_H264_STD_DEBLOCKING_FILTER_DISABLED_BIT_EXT".enum(0x00008000),
        "VIDEO_ENCODE_H264_STD_DEBLOCKING_FILTER_ENABLED_BIT_EXT".enum(0x00010000),
        "VIDEO_ENCODE_H264_STD_DEBLOCKING_FILTER_PARTIAL_BIT_EXT".enum(0x00020000),
        "VIDEO_ENCODE_H264_STD_SLICE_QP_DELTA_BIT_EXT".enum(0x00080000),
        "VIDEO_ENCODE_H264_STD_DIFFERENT_SLICE_QP_DELTA_BIT_EXT".enum(0x00100000)
    )

    EnumConstant(
        """
        VkVideoEncodeH264RateControlFlagBitsEXT - H.264 encode rate control bits

        <h5>Description</h5>
        <ul>
            <li>#VIDEO_ENCODE_H264_RATE_CONTROL_ATTEMPT_HRD_COMPLIANCE_BIT_EXT specifies that rate control <b>should</b> attempt to produce an HRD compliant bitstream.</li>
            <li>#VIDEO_ENCODE_H264_RATE_CONTROL_REGULAR_GOP_BIT_EXT specifies that the application intends to use a regular GOP structure according to the parameters specified in the {@code gopFrameCount}, {@code idrPeriod}, and {@code consecutiveBFrameCount} members of the ##VkVideoEncodeH264RateControlInfoEXT structure.</li>
            <li>#VIDEO_ENCODE_H264_RATE_CONTROL_REFERENCE_PATTERN_FLAT_BIT_EXT specifies that the application intends to follow a flat reference pattern.</li>
            <li>#VIDEO_ENCODE_H264_RATE_CONTROL_REFERENCE_PATTERN_DYADIC_BIT_EXT specifies that the application intends to follow a dyadic reference pattern.</li>
            <li>#VIDEO_ENCODE_H264_RATE_CONTROL_TEMPORAL_LAYER_PATTERN_DYADIC_BIT_EXT specifies that the application intends to follow a dyadic temporal layer pattern.</li>
        </ul>
        """,

        "VIDEO_ENCODE_H264_RATE_CONTROL_ATTEMPT_HRD_COMPLIANCE_BIT_EXT".enum(0x00000001),
        "VIDEO_ENCODE_H264_RATE_CONTROL_REGULAR_GOP_BIT_EXT".enum(0x00000002),
        "VIDEO_ENCODE_H264_RATE_CONTROL_REFERENCE_PATTERN_FLAT_BIT_EXT".enum(0x00000004),
        "VIDEO_ENCODE_H264_RATE_CONTROL_REFERENCE_PATTERN_DYADIC_BIT_EXT".enum(0x00000008),
        "VIDEO_ENCODE_H264_RATE_CONTROL_TEMPORAL_LAYER_PATTERN_DYADIC_BIT_EXT".enum(0x00000010)
    )
}