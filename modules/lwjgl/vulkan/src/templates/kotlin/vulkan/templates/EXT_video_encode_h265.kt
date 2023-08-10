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
        This extension builds upon the {@link KHRVideoEncodeQueue VK_KHR_video_encode_queue} extension by adding support for encoding elementary video stream sequences compliant with the H.265/HEVC video compression standard.

        <h5>VK_EXT_video_encode_h265</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_video_encode_h265}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>40</dd>

            <dt><b>Revision</b></dt>
            <dd>10</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRVideoEncodeQueue VK_KHR_video_encode_queue}

            <ul>
                <li>This is a <em>provisional</em> extension and <b>must</b> be used with caution. See the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#boilerplate-provisional-header">description</a> of provisional header files for enablement and stability details.</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Ahmed Abdelkhalek <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_video_encode_h265]%20@aabdelkh%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_video_encode_h265%20extension*">aabdelkh</a></li>
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
                <li>Chunbo Chen, Intel</li>
                <li>Ping Liu, Intel</li>
                <li>Srinath Kumarapuram, NVIDIA</li>
                <li>Tony Zlatinski, NVIDIA</li>
                <li>Daniel Rakos, RasterGrid</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_VIDEO_ENCODE_H265_SPEC_VERSION".."10"
    )

    StringConstant(
        "The extension name.",

        "EXT_VIDEO_ENCODE_H265_EXTENSION_NAME".."VK_EXT_video_encode_h265"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_EXT".."1000039000",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_CREATE_INFO_EXT".."1000039001",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_ADD_INFO_EXT".."1000039002",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H265_VCL_FRAME_INFO_EXT".."1000039003",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H265_DPB_SLOT_INFO_EXT".."1000039004",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H265_NALU_SLICE_SEGMENT_INFO_EXT".."1000039005",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H265_PROFILE_INFO_EXT".."1000039007",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_INFO_EXT".."1000039009",
        "STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_LAYER_INFO_EXT".."1000039010"
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
            <li>#VIDEO_ENCODE_H265_CAPABILITY_SCALING_LISTS_BIT_EXT reports if enabling scaling_list_enabled_flag and sps_scaling_list_data_present_flag in StdVideoH265SpsFlags, or enabling pps_scaling_list_data_present_flag in StdVideoH265PpsFlags are supported.</li>
            <li>#VIDEO_ENCODE_H265_CAPABILITY_SAMPLE_ADAPTIVE_OFFSET_ENABLED_BIT_EXT reports if enabling sample_adaptive_offset_enabled_flag in StdVideoH265SpsFlags is supported.</li>
            <li>#VIDEO_ENCODE_H265_CAPABILITY_PCM_ENABLE_BIT_EXT reports if enabling pcm_enable_flag in StdVideoH265SpsFlags is supported.</li>
            <li>#VIDEO_ENCODE_H265_CAPABILITY_SPS_TEMPORAL_MVP_ENABLED_BIT_EXT reports if enabling sps_temporal_mvp_enabled_flag in StdVideoH265SpsFlags is supported.</li>
            <li>#VIDEO_ENCODE_H265_CAPABILITY_HRD_COMPLIANCE_BIT_EXT reports if the implementation guarantees generating a HRD compliant bitstream if nal_hrd_parameters_present_flag, vcl_hrd_parameters_present_flag, or sub_pic_hrd_params_present_flag are enabled in StdVideoH265HrdFlags, or vui_hrd_parameters_present_flag is enabled in StdVideoH265SpsVuiFlags.</li>
            <li>#VIDEO_ENCODE_H265_CAPABILITY_INIT_QP_MINUS26_BIT_EXT reports if setting non-zero init_qp_minus26 in StdVideoH265PictureParameterSet is supported.</li>
            <li>#VIDEO_ENCODE_H265_CAPABILITY_LOG2_PARALLEL_MERGE_LEVEL_MINUS2_BIT_EXT reports if setting non-zero value for log2_parallel_merge_level_minus2 in StdVideoH265PictureParameterSet is supported.</li>
            <li>#VIDEO_ENCODE_H265_CAPABILITY_SIGN_DATA_HIDING_ENABLED_BIT_EXT reports if enabling sign_data_hiding_enabled_flag in StdVideoH265PpsFlags is supported.</li>
            <li>#VIDEO_ENCODE_H265_CAPABILITY_TRANSFORM_SKIP_ENABLED_BIT_EXT reports if enabling transform_skip_enabled_flag in StdVideoH265PpsFlags is supported.</li>
            <li>#VIDEO_ENCODE_H265_CAPABILITY_TRANSFORM_SKIP_DISABLED_BIT_EXT reports if disabling transform_skip_enabled_flag in StdVideoH265PpsFlags is supported. Implementations <b>must</b> report at least one of #VIDEO_ENCODE_H265_CAPABILITY_TRANSFORM_SKIP_ENABLED_BIT_EXT and #VIDEO_ENCODE_H265_CAPABILITY_TRANSFORM_SKIP_DISABLED_BIT_EXT as supported.</li>
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
            <li>#VIDEO_ENCODE_H265_CAPABILITY_SLICE_SEGMENT_CTB_COUNT_BIT_EXT reports support for configuring ##VkVideoEncodeH265NaluSliceSegmentInfoEXT{@code ::ctbCount} and slice_segment_address in StdVideoEncodeH265SliceSegmentHeader for each slice segment in a frame with multiple slice segments. If not supported, the implementation decides the number of CTBs in each slice segment based on ##VkVideoEncodeH265VclFrameInfoEXT{@code ::naluSliceSegmentEntryCount}.</li>
            <li>#VIDEO_ENCODE_H265_CAPABILITY_ROW_UNALIGNED_SLICE_SEGMENT_BIT_EXT reports that each slice segment in a frame with a single or multiple tiles per slice may begin or finish at any offset in a CTB row. If not supported, all slice segments in such a frame <b>must</b> begin at the start of a CTB row (and hence each slice segment <b>must</b> finish at the end of a CTB row). Also reports that each slice segment in a frame with multiple slices per tile may begin or finish at any offset within the enclosing tile’s CTB row. If not supported, slice segments in such a frame <b>must</b> begin at the start of the enclosing tile’s CTB row (and hence each slice segment <b>must</b> finish at the end of the enclosing tile’s CTB row).</li>
            <li>#VIDEO_ENCODE_H265_CAPABILITY_DEPENDENT_SLICE_SEGMENT_BIT_EXT reports if enabling dependent_slice_segment_flag in StdVideoEncodeH265SliceHeaderFlags is supported.</li>
            <li>#VIDEO_ENCODE_H265_CAPABILITY_DIFFERENT_SLICE_TYPE_BIT_EXT reports that when #VIDEO_ENCODE_H265_CAPABILITY_MULTIPLE_SLICE_PER_TILE_BIT_EXT is supported and a frame is encoded with multiple slices, the implementation allows encoding each slice segment with a different {@code StdVideoEncodeH265SliceSegmentHeader}::slice_type. If not supported, all slice segments of the frame <b>must</b> be encoded with the same {@code slice_type} which corresponds to the picture type of the frame. For example, all slice segments of a P-frame would be encoded as P-slices.</li>
            <li>#VIDEO_ENCODE_H265_CAPABILITY_B_FRAME_IN_L1_LIST_BIT_EXT reports support for using a B frame as L1 reference.</li>
            <li>#VIDEO_ENCODE_H265_CAPABILITY_DIFFERENT_REFERENCE_FINAL_LISTS_BIT_EXT reports that the implementation allows encoding each slice segment with a different {@code StdVideoEncodeH265ReferenceListsInfo}. If not supported, all slice segments of the frame <b>must</b> be encoded with the same {@code StdVideoEncodeH265ReferenceListsInfo}.</li>
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
        "VIDEO_ENCODE_H265_CAPABILITY_TRANSFORM_SKIP_DISABLED_BIT_EXT".enum(0x00000400),
        "VIDEO_ENCODE_H265_CAPABILITY_PPS_SLICE_CHROMA_QP_OFFSETS_PRESENT_BIT_EXT".enum(0x00000800),
        "VIDEO_ENCODE_H265_CAPABILITY_WEIGHTED_PRED_BIT_EXT".enum(0x00001000),
        "VIDEO_ENCODE_H265_CAPABILITY_WEIGHTED_BIPRED_BIT_EXT".enum(0x00002000),
        "VIDEO_ENCODE_H265_CAPABILITY_WEIGHTED_PRED_NO_TABLE_BIT_EXT".enum(0x00004000),
        "VIDEO_ENCODE_H265_CAPABILITY_TRANSQUANT_BYPASS_ENABLED_BIT_EXT".enum(0x00008000),
        "VIDEO_ENCODE_H265_CAPABILITY_ENTROPY_CODING_SYNC_ENABLED_BIT_EXT".enum(0x00010000),
        "VIDEO_ENCODE_H265_CAPABILITY_DEBLOCKING_FILTER_OVERRIDE_ENABLED_BIT_EXT".enum(0x00020000),
        "VIDEO_ENCODE_H265_CAPABILITY_MULTIPLE_TILE_PER_FRAME_BIT_EXT".enum(0x00040000),
        "VIDEO_ENCODE_H265_CAPABILITY_MULTIPLE_SLICE_PER_TILE_BIT_EXT".enum(0x00080000),
        "VIDEO_ENCODE_H265_CAPABILITY_MULTIPLE_TILE_PER_SLICE_BIT_EXT".enum(0x00100000),
        "VIDEO_ENCODE_H265_CAPABILITY_SLICE_SEGMENT_CTB_COUNT_BIT_EXT".enum(0x00200000),
        "VIDEO_ENCODE_H265_CAPABILITY_ROW_UNALIGNED_SLICE_SEGMENT_BIT_EXT".enum(0x00400000),
        "VIDEO_ENCODE_H265_CAPABILITY_DEPENDENT_SLICE_SEGMENT_BIT_EXT".enum(0x00800000),
        "VIDEO_ENCODE_H265_CAPABILITY_DIFFERENT_SLICE_TYPE_BIT_EXT".enum(0x01000000),
        "VIDEO_ENCODE_H265_CAPABILITY_B_FRAME_IN_L1_LIST_BIT_EXT".enum(0x02000000),
        "VIDEO_ENCODE_H265_CAPABILITY_DIFFERENT_REFERENCE_FINAL_LISTS_BIT_EXT".enum(0x04000000)
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
        VkVideoEncodeH265RateControlStructureEXT - Specifies the video encode H.265 rate control structure

        <h5>Description</h5>
        <ul>
            <li>#VIDEO_ENCODE_H265_RATE_CONTROL_STRUCTURE_UNKNOWN_EXT specifies a reference structure unknown at the time of stream rate control configuration.</li>
            <li>#VIDEO_ENCODE_H265_RATE_CONTROL_STRUCTURE_FLAT_EXT specifies a flat reference structure.</li>
            <li>#VIDEO_ENCODE_H265_RATE_CONTROL_STRUCTURE_DYADIC_EXT specifies a dyadic reference structure.</li>
        </ul>

        <h5>See Also</h5>
        ##VkVideoEncodeH265RateControlInfoEXT
        """,

        "VIDEO_ENCODE_H265_RATE_CONTROL_STRUCTURE_UNKNOWN_EXT".."0",
        "VIDEO_ENCODE_H265_RATE_CONTROL_STRUCTURE_FLAT_EXT".."1",
        "VIDEO_ENCODE_H265_RATE_CONTROL_STRUCTURE_DYADIC_EXT".."2"
    )
}