/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_video_encode_h264 = "KHRVideoEncodeH264".nativeClassVK("KHR_video_encode_h264", type = "device", postfix = "KHR") {
    documentation =
        """
        This extension builds upon the {@link KHRVideoEncodeQueue VK_KHR_video_encode_queue} extension by adding support for encoding elementary video stream sequences compliant with the H.264/AVC video compression standard.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        This extension was promoted to {@code KHR} from the provisional extension {@code VK_EXT_video_encode_h264}.
        </div>

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_video_encode_h264}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>39</dd>

            <dt><b>Revision</b></dt>
            <dd>14</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRVideoEncodeQueue VK_KHR_video_encode_queue}</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Ahmed Abdelkhalek <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_video_encode_h264]%20@aabdelkh%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_video_encode_h264%20extension*">aabdelkh</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_video_encode_h264.adoc">VK_KHR_video_encode_h264</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2023-12-05</dd>

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
                <li>Lynne Iribarren, Independent</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_VIDEO_ENCODE_H264_SPEC_VERSION".."14"
    )

    StringConstant(
        "The extension name.",

        "KHR_VIDEO_ENCODE_H264_EXTENSION_NAME".."VK_KHR_video_encode_h264"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_CAPABILITIES_KHR".."1000038000",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_CREATE_INFO_KHR".."1000038001",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_ADD_INFO_KHR".."1000038002",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_PICTURE_INFO_KHR".."1000038003",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_DPB_SLOT_INFO_KHR".."1000038004",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_NALU_SLICE_INFO_KHR".."1000038005",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_GOP_REMAINING_FRAME_INFO_KHR".."1000038006",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_PROFILE_INFO_KHR".."1000038007",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_RATE_CONTROL_INFO_KHR".."1000038008",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_RATE_CONTROL_LAYER_INFO_KHR".."1000038009",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_CREATE_INFO_KHR".."1000038010",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_QUALITY_LEVEL_PROPERTIES_KHR".."1000038011",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_GET_INFO_KHR".."1000038012",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H264_SESSION_PARAMETERS_FEEDBACK_INFO_KHR".."1000038013"
    )

    EnumConstant(
        "Extends {@code VkVideoCodecOperationFlagBitsKHR}.",

        "VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR".enum(0x00010000)
    )

    EnumConstant(
        """
        VkVideoEncodeH264CapabilityFlagBitsKHR - H.264 encode capability flags

        <h5>Description</h5>
        <ul>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_HRD_COMPLIANCE_BIT_KHR specifies whether the implementation <b>may</b> be able to generate HRD compliant bitstreams if any of the {@code nal_hrd_parameters_present_flag} or {@code vcl_hrd_parameters_present_flag} members of {@code StdVideoH264SpsVuiFlags} are set to 1 in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-h264-active-sps">active SPS</a>.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_PREDICTION_WEIGHT_TABLE_GENERATED_BIT_KHR specifies that if {@code StdVideoH264PpsFlags}{@code ::weighted_pred_flag} is set to 1 or {@code StdVideoH264PictureParameterSet}{@code ::weighted_bipred_idc} is set to {@code STD_VIDEO_H264_WEIGHTED_BIPRED_IDC_EXPLICIT} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-h264-active-pps">active PPS</a> when encoding a <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-h264-p-pic">P picture</a> or <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-h264-b-pic">B picture</a>, respectively, then the implementation is able to internally decide syntax for {@code pred_weight_table}, as defined in section 7.4.3.2 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#itu-t-h264">ITU-T H.264 Specification</a>, and the application is not <b>required</b> to provide a weight table in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-h264-slice-header-params">H.264 slice header parameters</a>.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_ROW_UNALIGNED_SLICE_BIT_KHR specifies that each slice in a frame with multiple slices may begin or finish at any offset in a macroblock row. If not supported, all slices in the frame <b>must</b> begin at the start of a macroblock row (and hence each slice <b>must</b> finish at the end of a macroblock row).</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_DIFFERENT_SLICE_TYPE_BIT_KHR specifies that when a frame is encoded with multiple slices, the implementation allows encoding each slice with a different {@code StdVideoEncodeH264SliceHeader}{@code ::slice_type} specified in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-h264-slice-header-params">H.264 slice header parameters</a>. If not supported, all slices of the frame <b>must</b> be encoded with the same {@code slice_type} which corresponds to the picture type of the frame.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_B_FRAME_IN_L0_LIST_BIT_KHR specifies support for using a <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-h264-b-pic">B frame</a> as L0 reference, as specified in {@code StdVideoEncodeH264ReferenceListsInfo}{@code ::RefPicList0} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-h264-picture-info">H.264 picture information</a>.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_B_FRAME_IN_L1_LIST_BIT_KHR specifies support for using a <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-h264-b-pic">B frame</a> as L1 reference, as specified in {@code StdVideoEncodeH264ReferenceListsInfo}{@code ::RefPicList1} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-h264-picture-info">H.264 picture information</a>.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_PER_PICTURE_TYPE_MIN_MAX_QP_BIT_KHR specifies support for specifying different QP values in the members of ##VkVideoEncodeH264QpKHR.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_PER_SLICE_CONSTANT_QP_BIT_KHR specifies support for specifying different constant QP values for each slice.</li>
            <li>#VIDEO_ENCODE_H264_CAPABILITY_GENERATE_PREFIX_NALU_BIT_KHR specifies support for generating prefix NAL units by setting ##VkVideoEncodeH264PictureInfoKHR{@code ::generatePrefixNalu} to #TRUE.</li>
            <li>
                #VIDEO_ENCODE_H264_CAPABILITY_MB_QP_DIFF_WRAPAROUND_BIT_KHR indicates support for wraparound during the calculation of the QP values of subsequently encoded macroblocks, as defined in equation 7-37 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#itu-t-h264">ITU-T H.264 Specification</a>. If not supported, equation 7-37 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#itu-t-h264">ITU-T H.264 Specification</a> is effectively reduced to the following:
                <code>QP<sub>Y</sub> = QP<sub>Y,PREV</sub> + mb_qp_delta</code>

                <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
                The effect of this is that the maximum QP difference across subsequent macroblocks is limited to the <code>[-(26 + QpBdOffset<sub>Y</sub> / 2), 25 + QpBdOffset<sub>Y</sub> / 2]</code> range.
                </div>
            </li>
        </ul>
        """,

        "VIDEO_ENCODE_H264_CAPABILITY_HRD_COMPLIANCE_BIT_KHR".enum(0x00000001),
        "VIDEO_ENCODE_H264_CAPABILITY_PREDICTION_WEIGHT_TABLE_GENERATED_BIT_KHR".enum(0x00000002),
        "VIDEO_ENCODE_H264_CAPABILITY_ROW_UNALIGNED_SLICE_BIT_KHR".enum(0x00000004),
        "VIDEO_ENCODE_H264_CAPABILITY_DIFFERENT_SLICE_TYPE_BIT_KHR".enum(0x00000008),
        "VIDEO_ENCODE_H264_CAPABILITY_B_FRAME_IN_L0_LIST_BIT_KHR".enum(0x00000010),
        "VIDEO_ENCODE_H264_CAPABILITY_B_FRAME_IN_L1_LIST_BIT_KHR".enum(0x00000020),
        "VIDEO_ENCODE_H264_CAPABILITY_PER_PICTURE_TYPE_MIN_MAX_QP_BIT_KHR".enum(0x00000040),
        "VIDEO_ENCODE_H264_CAPABILITY_PER_SLICE_CONSTANT_QP_BIT_KHR".enum(0x00000080),
        "VIDEO_ENCODE_H264_CAPABILITY_GENERATE_PREFIX_NALU_BIT_KHR".enum(0x00000100)
    )

    EnumConstant(
        """
        VkVideoEncodeH264StdFlagBitsKHR - Video encode H.264 syntax capability flags

        <h5>Description</h5>
        <ul>
            <li>#VIDEO_ENCODE_H264_STD_SEPARATE_COLOR_PLANE_FLAG_SET_BIT_KHR specifies whether the implementation supports using the application-provided value for {@code StdVideoH264SpsFlags}{@code ::separate_colour_plane_flag} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-h264-sps">SPS</a> when that value is 1.</li>
            <li>#VIDEO_ENCODE_H264_STD_QPPRIME_Y_ZERO_TRANSFORM_BYPASS_FLAG_SET_BIT_KHR specifies whether the implementation supports using the application-provided value for {@code StdVideoH264SpsFlags}{@code ::qpprime_y_zero_transform_bypass_flag} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-h264-sps">SPS</a> when that value is 1.</li>
            <li>#VIDEO_ENCODE_H264_STD_SCALING_MATRIX_PRESENT_FLAG_SET_BIT_KHR specifies whether the implementation supports using the application-provided values for {@code StdVideoH264SpsFlags}{@code ::seq_scaling_matrix_present_flag} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-h264-sps">SPS</a> and {@code StdVideoH264PpsFlags}{@code ::pic_scaling_matrix_present_flag} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-h264-pps">PPS</a> when any of those values are 1.</li>
            <li>#VIDEO_ENCODE_H264_STD_CHROMA_QP_INDEX_OFFSET_BIT_KHR specifies whether the implementation supports using the application-provided value for {@code StdVideoH264PictureParameterSet}{@code ::chroma_qp_index_offset} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-h264-pps">PPS</a> when that value is non-zero.</li>
            <li>#VIDEO_ENCODE_H264_STD_SECOND_CHROMA_QP_INDEX_OFFSET_BIT_KHR specifies whether the implementation supports using the application-provided value for {@code StdVideoH264PictureParameterSet}{@code ::second_chroma_qp_index_offset} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-h264-pps">PPS</a> when that value is non-zero.</li>
            <li>#VIDEO_ENCODE_H264_STD_PIC_INIT_QP_MINUS26_BIT_KHR specifies whether the implementation supports using the application-provided value for {@code StdVideoH264PictureParameterSet}{@code ::pic_init_qp_minus26} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-h264-pps">PPS</a> when that value is non-zero.</li>
            <li>#VIDEO_ENCODE_H264_STD_WEIGHTED_PRED_FLAG_SET_BIT_KHR specifies whether the implementation supports using the application-provided value for {@code StdVideoH264PpsFlags}{@code ::weighted_pred_flag} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-h264-pps">PPS</a> when that value is 1.</li>
            <li>#VIDEO_ENCODE_H264_STD_WEIGHTED_BIPRED_IDC_EXPLICIT_BIT_KHR specifies whether the implementation supports using the application-provided value for {@code StdVideoH264PictureParameterSet}{@code ::weighted_bipred_idc} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-h264-pps">PPS</a> when that value is {@code STD_VIDEO_H264_WEIGHTED_BIPRED_IDC_EXPLICIT}.</li>
            <li>#VIDEO_ENCODE_H264_STD_WEIGHTED_BIPRED_IDC_IMPLICIT_BIT_KHR specifies whether the implementation supports using the application-provided value for {@code StdVideoH264PictureParameterSet}{@code ::weighted_bipred_idc} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-h264-pps">PPS</a> when that value is {@code STD_VIDEO_H264_WEIGHTED_BIPRED_IDC_IMPLICIT}.</li>
            <li>#VIDEO_ENCODE_H264_STD_TRANSFORM_8X8_MODE_FLAG_SET_BIT_KHR specifies whether the implementation supports using the application-provided value for {@code StdVideoH264PpsFlags}{@code ::transform_8x8_mode_flag} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-h264-pps">PPS</a> when that value is 1.</li>
            <li>#VIDEO_ENCODE_H264_STD_DIRECT_SPATIAL_MV_PRED_FLAG_UNSET_BIT_KHR specifies whether the implementation supports using the application-provided value for {@code StdVideoEncodeH264SliceHeaderFlags}{@code ::direct_spatial_mv_pred_flag} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-h264-slice-header-params">H.264 slice header parameters</a> when that value is 0.</li>
            <li>#VIDEO_ENCODE_H264_STD_ENTROPY_CODING_MODE_FLAG_UNSET_BIT_KHR specifies whether the implementation supports CAVLC entropy coding, as defined in section 9.2 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#itu-t-h264">ITU-T H.264 Specification</a>, and thus supports using the application-provided value for {@code StdVideoH264PpsFlags}{@code ::entropy_coding_mode_flag} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-h264-pps">PPS</a> when that value is 0.</li>
            <li>#VIDEO_ENCODE_H264_STD_ENTROPY_CODING_MODE_FLAG_SET_BIT_KHR specifies whether the implementation supports CABAC entropy coding, as defined in section 9.3 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#itu-t-h264">ITU-T H.264 Specification</a>, and thus supports using the application-provided value for {@code StdVideoH264PpsFlags}{@code ::entropy_coding_mode_flag} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-h264-pps">PPS</a> when that value is 1.</li>
            <li>#VIDEO_ENCODE_H264_STD_DIRECT_8X8_INFERENCE_FLAG_UNSET_BIT_KHR specifies whether the implementation supports using the application-provided value for {@code StdVideoH264SpsFlags}{@code ::direct_8x8_inference_flag} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-h264-sps">SPS</a> when that value is 0.</li>
            <li>#VIDEO_ENCODE_H264_STD_CONSTRAINED_INTRA_PRED_FLAG_SET_BIT_KHR specifies whether the implementation supports using the application-provided value for {@code StdVideoH264PpsFlags}{@code ::constrained_intra_pred_flag} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-h264-pps">PPS</a> when that value is 1.</li>
            <li>#VIDEO_ENCODE_H264_STD_DEBLOCKING_FILTER_DISABLED_BIT_KHR specifies whether the implementation supports using the application-provided value for {@code StdVideoEncodeH264SliceHeader}{@code ::disable_deblocking_filter_idc} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-h264-slice-header-params">H.264 slice header parameters</a> when that value is {@code STD_VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_DISABLED}.</li>
            <li>#VIDEO_ENCODE_H264_STD_DEBLOCKING_FILTER_ENABLED_BIT_KHR specifies whether the implementation supports using the application-provided value for {@code StdVideoEncodeH264SliceHeader}{@code ::disable_deblocking_filter_idc} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-h264-slice-header-params">H.264 slice header parameters</a> when that value is {@code STD_VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_ENABLED}.</li>
            <li>#VIDEO_ENCODE_H264_STD_DEBLOCKING_FILTER_PARTIAL_BIT_KHR specifies whether the implementation supports using the application-provided value for {@code StdVideoEncodeH264SliceHeader}{@code ::disable_deblocking_filter_idc} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-h264-slice-header-params">H.264 slice header parameters</a> when that value is {@code STD_VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_PARTIAL}.</li>
            <li>#VIDEO_ENCODE_H264_STD_SLICE_QP_DELTA_BIT_KHR specifies whether the implementation supports using the application-provided value for {@code StdVideoEncodeH264SliceHeader}{@code ::slice_qp_delta} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-h264-slice-header-params">H.264 slice header parameters</a> when that value is identical across the slices of the encoded frame.</li>
            <li>#VIDEO_ENCODE_H264_STD_DIFFERENT_SLICE_QP_DELTA_BIT_KHR specifies whether the implementation supports using the application-provided value for {@code StdVideoEncodeH264SliceHeader}{@code ::slice_qp_delta} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-h264-slice-header-params">H.264 slice header parameters</a> when that value is different across the slices of the encoded frame.</li>
        </ul>

        These capability flags provide information to the application about specific H.264 syntax element values that the implementation supports without having to <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-h264-overrides">override</a> them and do not otherwise restrict the values that the application <b>can</b> specify for any of the mentioned H.264 syntax elements.
        """,

        "VIDEO_ENCODE_H264_STD_SEPARATE_COLOR_PLANE_FLAG_SET_BIT_KHR".enum(0x00000001),
        "VIDEO_ENCODE_H264_STD_QPPRIME_Y_ZERO_TRANSFORM_BYPASS_FLAG_SET_BIT_KHR".enum(0x00000002),
        "VIDEO_ENCODE_H264_STD_SCALING_MATRIX_PRESENT_FLAG_SET_BIT_KHR".enum(0x00000004),
        "VIDEO_ENCODE_H264_STD_CHROMA_QP_INDEX_OFFSET_BIT_KHR".enum(0x00000008),
        "VIDEO_ENCODE_H264_STD_SECOND_CHROMA_QP_INDEX_OFFSET_BIT_KHR".enum(0x00000010),
        "VIDEO_ENCODE_H264_STD_PIC_INIT_QP_MINUS26_BIT_KHR".enum(0x00000020),
        "VIDEO_ENCODE_H264_STD_WEIGHTED_PRED_FLAG_SET_BIT_KHR".enum(0x00000040),
        "VIDEO_ENCODE_H264_STD_WEIGHTED_BIPRED_IDC_EXPLICIT_BIT_KHR".enum(0x00000080),
        "VIDEO_ENCODE_H264_STD_WEIGHTED_BIPRED_IDC_IMPLICIT_BIT_KHR".enum(0x00000100),
        "VIDEO_ENCODE_H264_STD_TRANSFORM_8X8_MODE_FLAG_SET_BIT_KHR".enum(0x00000200),
        "VIDEO_ENCODE_H264_STD_DIRECT_SPATIAL_MV_PRED_FLAG_UNSET_BIT_KHR".enum(0x00000400),
        "VIDEO_ENCODE_H264_STD_ENTROPY_CODING_MODE_FLAG_UNSET_BIT_KHR".enum(0x00000800),
        "VIDEO_ENCODE_H264_STD_ENTROPY_CODING_MODE_FLAG_SET_BIT_KHR".enum(0x00001000),
        "VIDEO_ENCODE_H264_STD_DIRECT_8X8_INFERENCE_FLAG_UNSET_BIT_KHR".enum(0x00002000),
        "VIDEO_ENCODE_H264_STD_CONSTRAINED_INTRA_PRED_FLAG_SET_BIT_KHR".enum(0x00004000),
        "VIDEO_ENCODE_H264_STD_DEBLOCKING_FILTER_DISABLED_BIT_KHR".enum(0x00008000),
        "VIDEO_ENCODE_H264_STD_DEBLOCKING_FILTER_ENABLED_BIT_KHR".enum(0x00010000),
        "VIDEO_ENCODE_H264_STD_DEBLOCKING_FILTER_PARTIAL_BIT_KHR".enum(0x00020000),
        "VIDEO_ENCODE_H264_STD_SLICE_QP_DELTA_BIT_KHR".enum(0x00080000),
        "VIDEO_ENCODE_H264_STD_DIFFERENT_SLICE_QP_DELTA_BIT_KHR".enum(0x00100000)
    )

    EnumConstant(
        """
        VkVideoEncodeH264RateControlFlagBitsKHR - H.264 encode rate control bits

        <h5>Description</h5>
        <ul>
            <li>#VIDEO_ENCODE_H264_RATE_CONTROL_ATTEMPT_HRD_COMPLIANCE_BIT_KHR specifies that rate control <b>should</b> attempt to produce an HRD compliant bitstream, as defined in annex C of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#itu-t-h264">ITU-T H.264 Specification</a>.</li>
            <li>#VIDEO_ENCODE_H264_RATE_CONTROL_REGULAR_GOP_BIT_KHR specifies that the application intends to use a <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-h264-regular-gop">regular GOP structure</a> according to the parameters specified in the {@code gopFrameCount}, {@code idrPeriod}, and {@code consecutiveBFrameCount} members of the ##VkVideoEncodeH264RateControlInfoKHR structure.</li>
            <li>#VIDEO_ENCODE_H264_RATE_CONTROL_REFERENCE_PATTERN_FLAT_BIT_KHR specifies that the application intends to follow a <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-h264-ref-pattern-flat">flat reference pattern</a> in the GOP.</li>
            <li>#VIDEO_ENCODE_H264_RATE_CONTROL_REFERENCE_PATTERN_DYADIC_BIT_KHR specifies that the application intends to follow a <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-h264-ref-pattern-dyadic">dyadic reference pattern</a> in the GOP.</li>
            <li>#VIDEO_ENCODE_H264_RATE_CONTROL_TEMPORAL_LAYER_PATTERN_DYADIC_BIT_KHR specifies that the application intends to follow a <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#encode-h264-layer-pattern-dyadic">dyadic temporal layer pattern</a>.</li>
        </ul>
        """,

        "VIDEO_ENCODE_H264_RATE_CONTROL_ATTEMPT_HRD_COMPLIANCE_BIT_KHR".enum(0x00000001),
        "VIDEO_ENCODE_H264_RATE_CONTROL_REGULAR_GOP_BIT_KHR".enum(0x00000002),
        "VIDEO_ENCODE_H264_RATE_CONTROL_REFERENCE_PATTERN_FLAT_BIT_KHR".enum(0x00000004),
        "VIDEO_ENCODE_H264_RATE_CONTROL_REFERENCE_PATTERN_DYADIC_BIT_KHR".enum(0x00000008),
        "VIDEO_ENCODE_H264_RATE_CONTROL_TEMPORAL_LAYER_PATTERN_DYADIC_BIT_KHR".enum(0x00000010)
    )
}