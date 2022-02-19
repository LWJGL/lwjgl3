/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_video_encode_h265 = "EXTVideoEncodeH265".nativeClassVK("EXT_video_encode_h265", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension allows applications to compress a raw video sequence by using the H.265/HEVC video compression standard.

        <h5>VK_EXT_video_encode_h265</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_video_encode_h265}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>40</dd>

            <dt><b>Revision</b></dt>
            <dd>5</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRVideoEncodeQueue VK_KHR_video_encode_queue}</li>
                <li>This is a <em>provisional</em> extension and <b>must</b> be used with caution. See the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#boilerplate-provisional-header">description</a> of provisional header files for enablement and stability details.</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Ahmed Abdelkhalek <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_video_encode_h265]%20@aabdelkh%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_video_encode_h265%20extension%3E%3E">aabdelkh</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2022-02-10</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Ahmed Abdelkhalek, AMD</li>
                <li>George Hao, AMD</li>
                <li>Jake Beju, AMD</li>
                <li>Chunbo Chen, Intel</li>
                <li>Ping Liu, Intel</li>
                <li>Srinath Kumarapuram, NVIDIA</li>
                <li>Tony Zlatinski, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_VIDEO_ENCODE_H265_SPEC_VERSION".."5"
    )

    StringConstant(
        "The extension name.",

        "EXT_VIDEO_ENCODE_H265_EXTENSION_NAME".."VK_EXT_video_encode_h265"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_EXT".."1000039000",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_CREATE_INFO_EXT".."1000039001",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_CREATE_INFO_EXT".."1000039002",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_ADD_INFO_EXT".."1000039003",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H265_VCL_FRAME_INFO_EXT".."1000039004",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H265_DPB_SLOT_INFO_EXT".."1000039005",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H265_NALU_SLICE_SEGMENT_EXT".."1000039006",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H265_EMIT_PICTURE_PARAMETERS_EXT".."1000039007",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H265_PROFILE_EXT".."1000039008",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H265_REFERENCE_LISTS_EXT".."1000039009",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_INFO_EXT".."1000039010",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_LAYER_INFO_EXT".."1000039011"
    )

    EnumConstant(
        "Extends {@code VkVideoCodecOperationFlagBitsKHR}.",

        "VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_EXT".enum(0x00020000)
    )

    EnumConstant(
        """
        VkVideoEncodeH265CapabilityFlagBitsEXT - Video encode H.265 capability flags

        <h5>Description</h5>
        <ul>
            <li>#VIDEO_ENCODE_H265_CAPABILITY_SEPARATE_COLOUR_PLANE_BIT_EXT reports if enabling separate_colour_plane_flag in StdVideoH265SpsFlags is supported.</li>
            <li>#VIDEO_ENCODE_H265_CAPABILITY_SCALING_LISTS_BIT_EXT reports if enabling scaling_list_enabled_flag and sps_scaling_list_data_present_flag in StdVideoH265SpsFlags, or enabling pps_scaling_list_data_present_flag in StdVideoH265PpsFlags are supproted.</li>
            <li>#VIDEO_ENCODE_H265_CAPABILITY_SAMPLE_ADAPTIVE_OFFSET_ENABLED_BIT_EXT reports if enabling sample_adaptive_offset_enabled_flag in StdVideoH265SpsFlags is supported.</li>
            <li>#VIDEO_ENCODE_H265_CAPABILITY_PCM_ENABLE_BIT_EXT reports if enabling pcm_enable_flag in StdVideoH265SpsFlags is supported.</li>
            <li>#VIDEO_ENCODE_H265_CAPABILITY_SPS_TEMPORAL_MVP_ENABLED_BIT_EXT reports if enabling sps_temporal_mvp_enabled_flag in StdVideoH265SpsFlags is supported.</li>
            <li>#VIDEO_ENCODE_H265_CAPABILITY_HRD_COMPLIANCE_BIT_EXT reports if the implementation guarantees generating a HRD compliant bitstream if nal_hrd_parameters_present_flag, vcl_hrd_parameters_present_flag, or sub_pic_hrd_params_present_flag are enabled in StdVideoH265HrdFlags, or vui_hrd_parameters_present_flag is enabled in StdVideoH265SpsVuiFlags.</li>
            <li>#VIDEO_ENCODE_H265_CAPABILITY_INIT_QP_MINUS26_BIT_EXT reports if setting non-zero init_qp_minus26 in StdVideoH265PictureParameterSet is supported.</li>
            <li>#VIDEO_ENCODE_H265_CAPABILITY_LOG2_PARALLEL_MERGE_LEVEL_MINUS2_BIT_EXT reports if setting non-zero value for log2_parallel_merge_level_minus2 in StdVideoH265PictureParameterSet is supported.</li>
            <li>#VIDEO_ENCODE_H265_CAPABILITY_SIGN_DATA_HIDING_ENABLED_BIT_EXT reports if enabling sign_data_hiding_enabled_flag in StdVideoH265PpsFlags is supported.</li>
            <li>#VIDEO_ENCODE_H265_CAPABILITY_TRANSFORM_SKIP_ENABLED_BIT_EXT reports if enabling transform_skip_enabled_flag in StdVideoH265PpsFlags is supported.</li>
            <li>#VIDEO_ENCODE_H265_CAPABILITY_PPS_SLICE_CHROMA_QP_OFFSETS_PRESENT_BIT_EXT reports if enabling pps_slice_chroma_qp_offsets_present_flag in StdVideoH265PpsFlags is supported.</li>
            <li>#VIDEO_ENCODE_H265_CAPABILITY_WEIGHTED_PRED_BIT_EXT reports if enabling weighted_pred_flag in StdVideoH265PpsFlags is supported.</li>
            <li>#VIDEO_ENCODE_H265_CAPABILITY_WEIGHTED_BIPRED_BIT_EXT reports if enabling weighted_bipred_flag in StdVideoH265PpsFlags is supported.</li>
            <li>#VIDEO_ENCODE_H265_CAPABILITY_WEIGHTED_PRED_NO_TABLE_BIT_EXT reports that when weighted_pred_flag or weighted_bipred_flag in StdVideoH265PpsFlags are enabled, the implementation is able to internally decide syntax for pred_weight_table.</li>
            <li>#VIDEO_ENCODE_H265_CAPABILITY_TRANSQUANT_BYPASS_ENABLED_BIT_EXT reports if enabling transquant_bypass_enabled_flag in StdVideoH265PpsFlags is supported.</li>
            <li>#VIDEO_ENCODE_H265_CAPABILITY_ENTROPY_CODING_SYNC_ENABLED_BIT_EXT reports if enabling entropy_coding_sync_enabled_flag in StdVideoH265PpsFlags is supported.</li>
            <li>#VIDEO_ENCODE_H265_CAPABILITY_DEBLOCKING_FILTER_OVERRIDE_ENABLED_BIT_EXT reports if enabling deblocking_filter_override_enabled_flag in StdVideoH265PpsFlags is supported.</li>
            <li>#VIDEO_ENCODE_H265_CAPABILITY_MULTIPLE_TILE_PER_FRAME_BIT_EXT reports if encoding multiple tiles per frame is supported. If not set, the implementation is only able to encode a single tile for each frame.</li>
            <li>#VIDEO_ENCODE_H265_CAPABILITY_MULTIPLE_SLICE_PER_TILE_BIT_EXT reports if encoding multiple slices per tile is supported. If not set, the implementation is only able to encode a single slice for each tile.</li>
            <li>#VIDEO_ENCODE_H265_CAPABILITY_MULTIPLE_TILE_PER_SLICE_BIT_EXT reports if encoding multiple tiles per slice is supported. If not set, the implementation is only able to encode a single tile for each slice.</li>
            <li>#VIDEO_ENCODE_H265_CAPABILITY_SLICE_SEGMENT_CTB_COUNT_BIT_EXT reports support for configuring ##VkVideoEncodeH265NaluSliceSegmentEXT{@code ::ctbCount} and slice_segment_address in StdVideoEncodeH265SliceSegmentHeader for each slice segment in a frame with multiple slice segments. If not supported, the implementation decides the number of CTBs in each slice segment based on ##VkVideoEncodeH265VclFrameInfoEXT{@code ::naluSliceSegmentEntryCount}.</li>
            <li>#VIDEO_ENCODE_H265_CAPABILITY_ROW_UNALIGNED_SLICE_SEGMENT_BIT_EXT reports that each slice segment in a frame with a single or multiple tiles per slice may begin or finish at any offset in a CTB row. If not supported, all slice segments in such a frame <b>must</b> begin at the start of a CTB row (and hence each slice segment <b>must</b> finish at the end of a CTB row). Also reports that each slice segment in a frame with multiple slices per tile may begin or finish at any offset within the enclosing tile’s CTB row. If not supported, slice segments in such a frame <b>must</b> begin at the start of the enclosing tile’s CTB row (and hence each slice segment <b>must</b> finish at the end of the enclosing tile’s CTB row).</li>
            <li>#VIDEO_ENCODE_H265_CAPABILITY_DEPENDENT_SLICE_SEGMENT_BIT_EXT reports if enabling dependent_slice_segment_flag in StdVideoEncodeH265SliceHeaderFlags is supported.</li>
            <li>#VIDEO_ENCODE_H265_CAPABILITY_DIFFERENT_SLICE_TYPE_BIT_EXT reports that when #VIDEO_ENCODE_H265_CAPABILITY_MULTIPLE_SLICE_PER_TILE_BIT_EXT is supported and a frame is encoded with multiple slices, the implementation allows encoding each slice segment with a different {@code StdVideoEncodeH265SliceSegmentHeader}::slice_type. If not supported, all slice segments of the frame <b>must</b> be encoded with the same {@code slice_type} which corresponds to the picture type of the frame. For example, all slice segments of a P-frame would be encoded as P-slices.</li>
        </ul>
        """,

        "VIDEO_ENCODE_H265_CAPABILITY_SEPARATE_COLOUR_PLANE_BIT_EXT".enum(0x00000001),
        "VIDEO_ENCODE_H265_CAPABILITY_SCALING_LISTS_BIT_EXT".enum(0x00000002),
        "VIDEO_ENCODE_H265_CAPABILITY_SAMPLE_ADAPTIVE_OFFSET_ENABLED_BIT_EXT".enum(0x00000004),
        "VIDEO_ENCODE_H265_CAPABILITY_PCM_ENABLE_BIT_EXT".enum(0x00000008),
        "VIDEO_ENCODE_H265_CAPABILITY_SPS_TEMPORAL_MVP_ENABLED_BIT_EXT".enum(0x00000010),
        "VIDEO_ENCODE_H265_CAPABILITY_HRD_COMPLIANCE_BIT_EXT".enum(0x00000020),
        "VIDEO_ENCODE_H265_CAPABILITY_INIT_QP_MINUS26_BIT_EXT".enum(0x00000040),
        "VIDEO_ENCODE_H265_CAPABILITY_LOG2_PARALLEL_MERGE_LEVEL_MINUS2_BIT_EXT".enum(0x00000080),
        "VIDEO_ENCODE_H265_CAPABILITY_SIGN_DATA_HIDING_ENABLED_BIT_EXT".enum(0x00000100),
        "VIDEO_ENCODE_H265_CAPABILITY_TRANSFORM_SKIP_ENABLED_BIT_EXT".enum(0x00000200),
        "VIDEO_ENCODE_H265_CAPABILITY_PPS_SLICE_CHROMA_QP_OFFSETS_PRESENT_BIT_EXT".enum(0x00000400),
        "VIDEO_ENCODE_H265_CAPABILITY_WEIGHTED_PRED_BIT_EXT".enum(0x00000800),
        "VIDEO_ENCODE_H265_CAPABILITY_WEIGHTED_BIPRED_BIT_EXT".enum(0x00001000),
        "VIDEO_ENCODE_H265_CAPABILITY_WEIGHTED_PRED_NO_TABLE_BIT_EXT".enum(0x00002000),
        "VIDEO_ENCODE_H265_CAPABILITY_TRANSQUANT_BYPASS_ENABLED_BIT_EXT".enum(0x00004000),
        "VIDEO_ENCODE_H265_CAPABILITY_ENTROPY_CODING_SYNC_ENABLED_BIT_EXT".enum(0x00008000),
        "VIDEO_ENCODE_H265_CAPABILITY_DEBLOCKING_FILTER_OVERRIDE_ENABLED_BIT_EXT".enum(0x00010000),
        "VIDEO_ENCODE_H265_CAPABILITY_MULTIPLE_TILE_PER_FRAME_BIT_EXT".enum(0x00020000),
        "VIDEO_ENCODE_H265_CAPABILITY_MULTIPLE_SLICE_PER_TILE_BIT_EXT".enum(0x00040000),
        "VIDEO_ENCODE_H265_CAPABILITY_MULTIPLE_TILE_PER_SLICE_BIT_EXT".enum(0x00080000),
        "VIDEO_ENCODE_H265_CAPABILITY_SLICE_SEGMENT_CTB_COUNT_BIT_EXT".enum(0x00100000),
        "VIDEO_ENCODE_H265_CAPABILITY_ROW_UNALIGNED_SLICE_SEGMENT_BIT_EXT".enum(0x00200000),
        "VIDEO_ENCODE_H265_CAPABILITY_DEPENDENT_SLICE_SEGMENT_BIT_EXT".enum(0x00400000),
        "VIDEO_ENCODE_H265_CAPABILITY_DIFFERENT_SLICE_TYPE_BIT_EXT".enum(0x00800000)
    )

    EnumConstant(
        """
        VkVideoEncodeH265InputModeFlagBitsEXT - Video encode H.265 input modes

        <h5>Description</h5>
        <ul>
            <li>#VIDEO_ENCODE_H265_INPUT_MODE_FRAME_BIT_EXT indicates that a single command buffer <b>must</b> at least encode an entire frame. Any non-VCL NALUs <b>must</b> be encoded using the same command buffer as the frame if #VIDEO_ENCODE_H265_INPUT_MODE_NON_VCL_BIT_EXT is not supported.</li>
            <li>#VIDEO_ENCODE_H265_INPUT_MODE_SLICE_SEGMENT_BIT_EXT indicates that a single command buffer <b>must</b> at least encode a single slice segment. Any non-VCL NALUs <b>must</b> be encoded using the same command buffer as the first slice segment of the frame if #VIDEO_ENCODE_H265_INPUT_MODE_NON_VCL_BIT_EXT is not supported.</li>
            <li>#VIDEO_ENCODE_H265_INPUT_MODE_NON_VCL_BIT_EXT indicates that a single command buffer <b>may</b> encode a non-VCL NALU by itself.</li>
        </ul>

        An implementation <b>must</b> support at least one of #VIDEO_ENCODE_H265_INPUT_MODE_FRAME_BIT_EXT or #VIDEO_ENCODE_H265_INPUT_MODE_SLICE_SEGMENT_BIT_EXT.

        If #VIDEO_ENCODE_H265_INPUT_MODE_SLICE_SEGMENT_BIT_EXT is not supported, the following two additional restrictions apply for frames encoded with multiple slice segments. First, all frame slice segments <b>must</b> have the same pReferenceFinalLists. Second, the order in which slice segments appear in ##VkVideoEncodeH265VclFrameInfoEXT{@code ::pNaluSliceSegmentEntries} or in the command buffer <b>must</b> match the placement order of the slice segments in the frame.
        """,

        "VIDEO_ENCODE_H265_INPUT_MODE_FRAME_BIT_EXT".enum(0x00000001),
        "VIDEO_ENCODE_H265_INPUT_MODE_SLICE_SEGMENT_BIT_EXT".enum(0x00000002),
        "VIDEO_ENCODE_H265_INPUT_MODE_NON_VCL_BIT_EXT".enum(0x00000004)
    )

    EnumConstant(
        """
        VkVideoEncodeH265OutputModeFlagBitsEXT - Video encode H.265 output modes

        <h5>Description</h5>
        <ul>
            <li>#VIDEO_ENCODE_H265_OUTPUT_MODE_FRAME_BIT_EXT indicates that calls to generate all NALUs of a frame <b>must</b> be included within a single begin/end pair. Any non-VCL NALUs <b>must</b> be encoded within the same begin/end pair if #VIDEO_ENCODE_H265_OUTPUT_MODE_NON_VCL_BIT_EXT is not supported.</li>
            <li>#VIDEO_ENCODE_H265_OUTPUT_MODE_SLICE_SEGMENT_BIT_EXT indicates that each begin/end pair <b>must</b> encode at least one slice segment. Any non-VCL NALUs <b>must</b> be encoded within the same begin/end pair as the first slice segment of the frame if #VIDEO_ENCODE_H265_OUTPUT_MODE_NON_VCL_BIT_EXT is not supported.</li>
            <li>#VIDEO_ENCODE_H265_OUTPUT_MODE_NON_VCL_BIT_EXT indicates that each begin/end pair <b>may</b> encode only a non-VCL NALU by itself. An implementation <b>must</b> support at least one of #VIDEO_ENCODE_H265_OUTPUT_MODE_FRAME_BIT_EXT or #VIDEO_ENCODE_H265_OUTPUT_MODE_SLICE_SEGMENT_BIT_EXT.</li>
        </ul>

        A single begin/end pair <b>must</b> not encode more than a single frame.

        The bitstreams of NALUs generated within a single begin/end pair are written continuously into the same bitstream buffer (any padding between the NALUs <b>must</b> be compliant to the H.265 standard).

        The supported input modes <b>must</b> be coarser or equal to the supported output modes. For example, it is illegal to report slice segment input is supported but only frame output is supported.

        An implementation <b>must</b> report one of the following combinations of input/output modes:

        <ul>
            <li>Input: Frame, Output: Frame</li>
            <li>Input: Frame, Output: Frame and Non-VCL</li>
            <li>Input: Frame, Output: Slice Segment</li>
            <li>Input: Frame, Output: Slice Segment and Non-VCL</li>
            <li>Input: Slice Segment, Output: Slice Segment</li>
            <li>Input: Slice Segment, Output: Slice Segment and Non-VCL</li>
            <li>Input: Frame and Non-VCL, Output: Frame and Non-VCL</li>
            <li>Input: Frame and Non-VCL, Output: Slice Segment and Non-VCL</li>
            <li>Input: Slice Segment and Non-VCL, Output: Slice Segment and Non-VCL</li>
        </ul>
        """,

        "VIDEO_ENCODE_H265_OUTPUT_MODE_FRAME_BIT_EXT".enum(0x00000001),
        "VIDEO_ENCODE_H265_OUTPUT_MODE_SLICE_SEGMENT_BIT_EXT".enum(0x00000002),
        "VIDEO_ENCODE_H265_OUTPUT_MODE_NON_VCL_BIT_EXT".enum(0x00000004)
    )

    EnumConstant(
        """
        VkVideoEncodeH265CtbSizeFlagBitsEXT - Supported CTB sizes for H.265 video encode

        <h5>Description</h5>
        <ul>
            <li>#VIDEO_ENCODE_H265_CTB_SIZE_16_BIT_EXT specifies that a CTB size of 16x16 is supported.</li>
            <li>#VIDEO_ENCODE_H265_CTB_SIZE_32_BIT_EXT specifies that a CTB size of 32x32 is supported.</li>
            <li>#VIDEO_ENCODE_H265_CTB_SIZE_64_BIT_EXT specifies that a CTB size of 64x64 is supported.</li>
        </ul>
        """,

        "VIDEO_ENCODE_H265_CTB_SIZE_16_BIT_EXT".enum(0x00000001),
        "VIDEO_ENCODE_H265_CTB_SIZE_32_BIT_EXT".enum(0x00000002),
        "VIDEO_ENCODE_H265_CTB_SIZE_64_BIT_EXT".enum(0x00000004)
    )

    EnumConstant(
        """
        VkVideoEncodeH265TransformBlockSizeFlagBitsEXT - Supported transform block sizes for H.265 video encode

        <h5>Description</h5>
        <ul>
            <li>#VIDEO_ENCODE_H265_TRANSFORM_BLOCK_SIZE_4_BIT_EXT specifies that a transform block size of 4x4 is supported.</li>
            <li>#VIDEO_ENCODE_H265_TRANSFORM_BLOCK_SIZE_8_BIT_EXT specifies that a transform block size of 8x8 is supported.</li>
            <li>#VIDEO_ENCODE_H265_TRANSFORM_BLOCK_SIZE_16_BIT_EXT specifies that a transform block size of 16x16 is supported.</li>
            <li>#VIDEO_ENCODE_H265_TRANSFORM_BLOCK_SIZE_32_BIT_EXT specifies that a transform block size of 32x32 is supported.</li>
        </ul>
        """,

        "VIDEO_ENCODE_H265_TRANSFORM_BLOCK_SIZE_4_BIT_EXT".enum(0x00000001),
        "VIDEO_ENCODE_H265_TRANSFORM_BLOCK_SIZE_8_BIT_EXT".enum(0x00000002),
        "VIDEO_ENCODE_H265_TRANSFORM_BLOCK_SIZE_16_BIT_EXT".enum(0x00000004),
        "VIDEO_ENCODE_H265_TRANSFORM_BLOCK_SIZE_32_BIT_EXT".enum(0x00000008)
    )

    EnumConstant(
        """
        VkVideoEncodeH265RateControlStructureFlagBitsEXT - Video encode H.265 rate control structure flags

        <h5>Description</h5>
        <ul>
            <li>#VIDEO_ENCODE_H265_RATE_CONTROL_STRUCTURE_UNKNOWN_EXT is 0, and specifies a reference structure unknown at the time of stream rate control configuration.</li>
            <li>#VIDEO_ENCODE_H265_RATE_CONTROL_STRUCTURE_FLAT_BIT_EXT specifies a flat reference structure.</li>
            <li>#VIDEO_ENCODE_H265_RATE_CONTROL_STRUCTURE_DYADIC_BIT_EXT specifies a dyadic reference structure.</li>
        </ul>

        <h5>See Also</h5>
        ##VkVideoEncodeH265RateControlInfoEXT
        """,

        "VIDEO_ENCODE_H265_RATE_CONTROL_STRUCTURE_UNKNOWN_EXT".."0",
        "VIDEO_ENCODE_H265_RATE_CONTROL_STRUCTURE_FLAT_BIT_EXT".enum(0x00000001),
        "VIDEO_ENCODE_H265_RATE_CONTROL_STRUCTURE_DYADIC_BIT_EXT".enum(0x00000002)
    )
}