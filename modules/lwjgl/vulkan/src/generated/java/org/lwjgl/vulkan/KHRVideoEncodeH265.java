/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension builds upon the {@link KHRVideoEncodeQueue VK_KHR_video_encode_queue} extension by adding support for encoding elementary video stream sequences compliant with the H.265/HEVC video compression standard.
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>This extension was promoted to {@code KHR} from the provisional extension {@code VK_EXT_video_encode_h265}.</p>
 * </div>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_video_encode_h265}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>40</dd>
 * <dt><b>Revision</b></dt>
 * <dd>14</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRVideoEncodeQueue VK_KHR_video_encode_queue}</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Ahmed Abdelkhalek <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_video_encode_h265]%20@aabdelkh%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_video_encode_h265%20extension*">aabdelkh</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_video_encode_h265.adoc">VK_KHR_video_encode_h265</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2023-12-05</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Ahmed Abdelkhalek, AMD</li>
 * <li>George Hao, AMD</li>
 * <li>Jake Beju, AMD</li>
 * <li>Chunbo Chen, Intel</li>
 * <li>Ping Liu, Intel</li>
 * <li>Srinath Kumarapuram, NVIDIA</li>
 * <li>Tony Zlatinski, NVIDIA</li>
 * <li>Ravi Chaudhary, NVIDIA</li>
 * <li>Daniel Rakos, RasterGrid</li>
 * <li>Aidan Fabius, Core Avionics &amp; Industrial Inc.</li>
 * <li>Lynne Iribarren, Independent</li>
 * </ul></dd>
 * </dl>
 */
public final class KHRVideoEncodeH265 {

    /** The extension specification version. */
    public static final int VK_KHR_VIDEO_ENCODE_H265_SPEC_VERSION = 14;

    /** The extension name. */
    public static final String VK_KHR_VIDEO_ENCODE_H265_EXTENSION_NAME = "VK_KHR_video_encode_h265";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_CREATE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_ADD_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_ADD_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_PICTURE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_PICTURE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_DPB_SLOT_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_DPB_SLOT_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_NALU_SLICE_SEGMENT_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_NALU_SLICE_SEGMENT_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_GOP_REMAINING_FRAME_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_GOP_REMAINING_FRAME_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_PROFILE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_PROFILE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_LAYER_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_LAYER_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_CREATE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_QUALITY_LEVEL_PROPERTIES_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_QUALITY_LEVEL_PROPERTIES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_GET_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_GET_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_FEEDBACK_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_FEEDBACK_INFO_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_KHR                     = 1000039000,
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_CREATE_INFO_KHR   = 1000039001,
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_ADD_INFO_KHR      = 1000039002,
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_PICTURE_INFO_KHR                     = 1000039003,
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_DPB_SLOT_INFO_KHR                    = 1000039004,
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_NALU_SLICE_SEGMENT_INFO_KHR          = 1000039005,
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_GOP_REMAINING_FRAME_INFO_KHR         = 1000039006,
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_PROFILE_INFO_KHR                     = 1000039007,
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_INFO_KHR                = 1000039009,
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_RATE_CONTROL_LAYER_INFO_KHR          = 1000039010,
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_CREATE_INFO_KHR              = 1000039011,
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_QUALITY_LEVEL_PROPERTIES_KHR         = 1000039012,
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_GET_INFO_KHR      = 1000039013,
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_SESSION_PARAMETERS_FEEDBACK_INFO_KHR = 1000039014;

    /** Extends {@code VkVideoCodecOperationFlagBitsKHR}. */
    public static final int VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR = 0x20000;

    /**
     * VkVideoEncodeH265CapabilityFlagBitsKHR - Video encode H.265 capability flags
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_ENCODE_H265_CAPABILITY_HRD_COMPLIANCE_BIT_KHR VIDEO_ENCODE_H265_CAPABILITY_HRD_COMPLIANCE_BIT_KHR} indicates if the implementation <b>may</b> be able to generate HRD compliant bitstreams if any of the {@code nal_hrd_parameters_present_flag}, {@code vcl_hrd_parameters_present_flag}, or {@code sub_pic_hrd_params_present_flag} members of {@code StdVideoH265HrdFlags} are set to 1 in the HRD parameters of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-active-vps">active VPS</a> or <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-active-sps">active SPS</a>, or if {@code StdVideoH265SpsVuiFlags}{@code ::vui_hrd_parameters_present_flag} is set to 1 in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-active-sps">active SPS</a>.</li>
     * <li>{@link #VK_VIDEO_ENCODE_H265_CAPABILITY_PREDICTION_WEIGHT_TABLE_GENERATED_BIT_KHR VIDEO_ENCODE_H265_CAPABILITY_PREDICTION_WEIGHT_TABLE_GENERATED_BIT_KHR} indicates that if the {@code weighted_pred_flag} or the {@code weighted_bipred_flag} member of {@code StdVideoH265PpsFlags} is set to 1 in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-active-pps">active PPS</a> when encoding a <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-p-pic">P picture</a> or <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-b-pic">B picture</a>, respectively, then the implementation is able to internally decide syntax for {@code pred_weight_table}, as defined in section 7.4.7.3 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#itu-t-h265">ITU-T H.265 Specification</a>, and the application is not <b>required</b> to provide a weight table in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-slice-segment-header-params">H.265 slice segment header parameters</a>.</li>
     * <li>{@link #VK_VIDEO_ENCODE_H265_CAPABILITY_ROW_UNALIGNED_SLICE_SEGMENT_BIT_KHR VIDEO_ENCODE_H265_CAPABILITY_ROW_UNALIGNED_SLICE_SEGMENT_BIT_KHR} indicates that each slice segment in a frame with a single or multiple tiles per slice may begin or finish at any offset in a CTB row. If not supported, all slice segments in such a frame <b>must</b> begin at the start of a CTB row (and hence each slice segment <b>must</b> finish at the end of a CTB row). Also indicates that each slice segment in a frame with multiple slices per tile may begin or finish at any offset within the enclosing tile’s CTB row. If not supported, slice segments in such a frame <b>must</b> begin at the start of the enclosing tile’s CTB row (and hence each slice segment <b>must</b> finish at the end of the enclosing tile’s CTB row).</li>
     * <li>{@link #VK_VIDEO_ENCODE_H265_CAPABILITY_DIFFERENT_SLICE_SEGMENT_TYPE_BIT_KHR VIDEO_ENCODE_H265_CAPABILITY_DIFFERENT_SLICE_SEGMENT_TYPE_BIT_KHR} indicates that when a frame is encoded with multiple slice segments, the implementation allows encoding each slice segment with a different {@code StdVideoEncodeH265SliceSegmentHeader}{@code ::slice_type} specified in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-slice-segment-header-params">H.265 slice segment header parameters</a>. If not supported, all slice segments of the frame <b>must</b> be encoded with the same {@code slice_type} which corresponds to the picture type of the frame.</li>
     * <li>{@link #VK_VIDEO_ENCODE_H265_CAPABILITY_B_FRAME_IN_L0_LIST_BIT_KHR VIDEO_ENCODE_H265_CAPABILITY_B_FRAME_IN_L0_LIST_BIT_KHR} indicates support for using a <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-b-pic">B frame</a> as L0 reference, as specified in {@code StdVideoEncodeH265ReferenceListsInfo}{@code ::RefPicList0} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-picture-info">H.265 picture information</a>.</li>
     * <li>{@link #VK_VIDEO_ENCODE_H265_CAPABILITY_B_FRAME_IN_L1_LIST_BIT_KHR VIDEO_ENCODE_H265_CAPABILITY_B_FRAME_IN_L1_LIST_BIT_KHR} indicates support for using a <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-b-pic">B frame</a> as L1 reference, as specified in {@code StdVideoEncodeH265ReferenceListsInfo}{@code ::RefPicList1} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-picture-info">H.265 picture information</a>.</li>
     * <li>{@link #VK_VIDEO_ENCODE_H265_CAPABILITY_PER_PICTURE_TYPE_MIN_MAX_QP_BIT_KHR VIDEO_ENCODE_H265_CAPABILITY_PER_PICTURE_TYPE_MIN_MAX_QP_BIT_KHR} indicates support for specifying different QP values in the members of {@link VkVideoEncodeH265QpKHR}.</li>
     * <li>{@link #VK_VIDEO_ENCODE_H265_CAPABILITY_PER_SLICE_SEGMENT_CONSTANT_QP_BIT_KHR VIDEO_ENCODE_H265_CAPABILITY_PER_SLICE_SEGMENT_CONSTANT_QP_BIT_KHR} indicates support for specifying different constant QP values for each slice segment.</li>
     * <li>{@link #VK_VIDEO_ENCODE_H265_CAPABILITY_MULTIPLE_TILES_PER_SLICE_SEGMENT_BIT_KHR VIDEO_ENCODE_H265_CAPABILITY_MULTIPLE_TILES_PER_SLICE_SEGMENT_BIT_KHR} indicates if encoding multiple tiles per slice segment, as defined in section 6.3.1 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#itu-t-h265">ITU-T H.265 Specification</a>, is supported. If this capability flag is not present, then the implementation is only able to encode a single tile for each slice segment.</li>
     * <li>{@link #VK_VIDEO_ENCODE_H265_CAPABILITY_MULTIPLE_SLICE_SEGMENTS_PER_TILE_BIT_KHR VIDEO_ENCODE_H265_CAPABILITY_MULTIPLE_SLICE_SEGMENTS_PER_TILE_BIT_KHR} indicates if encoding multiple slice segments per tile, as defined in section 6.3.1 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#itu-t-h265">ITU-T H.265 Specification</a>, is supported. If this capability flag is not present, then the implementation is only able to encode a single slice segment for each tile.</li>
     * </ul>
     */
    public static final int
        VK_VIDEO_ENCODE_H265_CAPABILITY_HRD_COMPLIANCE_BIT_KHR                    = 0x1,
        VK_VIDEO_ENCODE_H265_CAPABILITY_PREDICTION_WEIGHT_TABLE_GENERATED_BIT_KHR = 0x2,
        VK_VIDEO_ENCODE_H265_CAPABILITY_ROW_UNALIGNED_SLICE_SEGMENT_BIT_KHR       = 0x4,
        VK_VIDEO_ENCODE_H265_CAPABILITY_DIFFERENT_SLICE_SEGMENT_TYPE_BIT_KHR      = 0x8,
        VK_VIDEO_ENCODE_H265_CAPABILITY_B_FRAME_IN_L0_LIST_BIT_KHR                = 0x10,
        VK_VIDEO_ENCODE_H265_CAPABILITY_B_FRAME_IN_L1_LIST_BIT_KHR                = 0x20,
        VK_VIDEO_ENCODE_H265_CAPABILITY_PER_PICTURE_TYPE_MIN_MAX_QP_BIT_KHR       = 0x40,
        VK_VIDEO_ENCODE_H265_CAPABILITY_PER_SLICE_SEGMENT_CONSTANT_QP_BIT_KHR     = 0x80,
        VK_VIDEO_ENCODE_H265_CAPABILITY_MULTIPLE_TILES_PER_SLICE_SEGMENT_BIT_KHR  = 0x100,
        VK_VIDEO_ENCODE_H265_CAPABILITY_MULTIPLE_SLICE_SEGMENTS_PER_TILE_BIT_KHR  = 0x200;

    /**
     * VkVideoEncodeH265StdFlagBitsKHR - Video encode H.265 syntax capability flags
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_ENCODE_H265_STD_SEPARATE_COLOR_PLANE_FLAG_SET_BIT_KHR VIDEO_ENCODE_H265_STD_SEPARATE_COLOR_PLANE_FLAG_SET_BIT_KHR} indicates whether the implementation supports using the application-provided value for {@code StdVideoH265SpsFlags}{@code ::separate_colour_plane_flag} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-sps">SPS</a> when that value is 1.</li>
     * <li>{@link #VK_VIDEO_ENCODE_H265_STD_SAMPLE_ADAPTIVE_OFFSET_ENABLED_FLAG_SET_BIT_KHR VIDEO_ENCODE_H265_STD_SAMPLE_ADAPTIVE_OFFSET_ENABLED_FLAG_SET_BIT_KHR} indicates whether the implementation supports using the application-provided value for {@code StdVideoH265SpsFlags}{@code ::sample_adaptive_offset_enabled_flag} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-sps">SPS</a> when that value is 1.</li>
     * <li>{@link #VK_VIDEO_ENCODE_H265_STD_SCALING_LIST_DATA_PRESENT_FLAG_SET_BIT_KHR VIDEO_ENCODE_H265_STD_SCALING_LIST_DATA_PRESENT_FLAG_SET_BIT_KHR} indicates whether the implementation supports using the application-provided value for the {@code scaling_list_enabled_flag} and {@code sps_scaling_list_data_present_flag} members of {@code StdVideoH265SpsFlags} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-sps">SPS</a>, and the application-provided value for {@code StdVideoH265PpsFlags}{@code ::pps_scaling_list_data_present_flag} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-pps">PPS</a> when those values are 1.</li>
     * <li>{@link #VK_VIDEO_ENCODE_H265_STD_PCM_ENABLED_FLAG_SET_BIT_KHR VIDEO_ENCODE_H265_STD_PCM_ENABLED_FLAG_SET_BIT_KHR} indicates whether the implementation supports using the application-provided value for {@code StdVideoH265SpsFlags}{@code ::pcm_enable_flag} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-sps">SPS</a> when that value is 1.</li>
     * <li>{@link #VK_VIDEO_ENCODE_H265_STD_SPS_TEMPORAL_MVP_ENABLED_FLAG_SET_BIT_KHR VIDEO_ENCODE_H265_STD_SPS_TEMPORAL_MVP_ENABLED_FLAG_SET_BIT_KHR} indicates whether the implementation supports using the application-provided value for {@code StdVideoH265SpsFlags}{@code ::sps_temporal_mvp_enabled_flag} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-sps">SPS</a> when that value is 1.</li>
     * <li>{@link #VK_VIDEO_ENCODE_H265_STD_INIT_QP_MINUS26_BIT_KHR VIDEO_ENCODE_H265_STD_INIT_QP_MINUS26_BIT_KHR} indicates whether the implementation supports using the application-provided value for {@code StdVideoH265PictureParameterSet}{@code ::init_qp_minus26} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-pps">PPS</a> when that value is non-zero.</li>
     * <li>{@link #VK_VIDEO_ENCODE_H265_STD_WEIGHTED_PRED_FLAG_SET_BIT_KHR VIDEO_ENCODE_H265_STD_WEIGHTED_PRED_FLAG_SET_BIT_KHR} indicates whether the implementation supports using the application-provided value for {@code StdVideoH265PpsFlags}{@code ::weighted_pred_flag} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-pps">PPS</a> when that value is 1.</li>
     * <li>{@link #VK_VIDEO_ENCODE_H265_STD_WEIGHTED_BIPRED_FLAG_SET_BIT_KHR VIDEO_ENCODE_H265_STD_WEIGHTED_BIPRED_FLAG_SET_BIT_KHR} indicates whether the implementation supports using the application-provided value for {@code StdVideoH265PpsFlags}{@code ::weighted_bipred_flag} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-pps">PPS</a> when that value is 1.</li>
     * <li>{@link #VK_VIDEO_ENCODE_H265_STD_LOG2_PARALLEL_MERGE_LEVEL_MINUS2_BIT_KHR VIDEO_ENCODE_H265_STD_LOG2_PARALLEL_MERGE_LEVEL_MINUS2_BIT_KHR} indicates whether the implementation supports using the application-provided value for {@code StdVideoH265PictureParameterSet}{@code ::log2_parallel_merge_level_minus2} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-pps">PPS</a> when that value is non-zero.</li>
     * <li>{@link #VK_VIDEO_ENCODE_H265_STD_SIGN_DATA_HIDING_ENABLED_FLAG_SET_BIT_KHR VIDEO_ENCODE_H265_STD_SIGN_DATA_HIDING_ENABLED_FLAG_SET_BIT_KHR} indicates whether the implementation supports using the application-provided value for {@code StdVideoH265PpsFlags}{@code ::sign_data_hiding_enabled_flag} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-pps">PPS</a> when that value is 1.</li>
     * <li>{@link #VK_VIDEO_ENCODE_H265_STD_TRANSFORM_SKIP_ENABLED_FLAG_SET_BIT_KHR VIDEO_ENCODE_H265_STD_TRANSFORM_SKIP_ENABLED_FLAG_SET_BIT_KHR} indicates whether the implementation supports using the application-provided value for {@code StdVideoH265PpsFlags}{@code ::transform_skip_enabled_flag} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-pps">PPS</a> when that value is 1.</li>
     * <li>{@link #VK_VIDEO_ENCODE_H265_STD_TRANSFORM_SKIP_ENABLED_FLAG_UNSET_BIT_KHR VIDEO_ENCODE_H265_STD_TRANSFORM_SKIP_ENABLED_FLAG_UNSET_BIT_KHR} indicates whether the implementation supports using the application-provided value for {@code StdVideoH265PpsFlags}{@code ::transform_skip_enabled_flag} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-pps">PPS</a> when that value is 0.</li>
     * <li>{@link #VK_VIDEO_ENCODE_H265_STD_PPS_SLICE_CHROMA_QP_OFFSETS_PRESENT_FLAG_SET_BIT_KHR VIDEO_ENCODE_H265_STD_PPS_SLICE_CHROMA_QP_OFFSETS_PRESENT_FLAG_SET_BIT_KHR} indicates whether the implementation supports using the application-provided value for {@code StdVideoH265PpsFlags}{@code ::pps_slice_chroma_qp_offsets_present_flag} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-pps">PPS</a> when that value is 1.</li>
     * <li>{@link #VK_VIDEO_ENCODE_H265_STD_TRANSQUANT_BYPASS_ENABLED_FLAG_SET_BIT_KHR VIDEO_ENCODE_H265_STD_TRANSQUANT_BYPASS_ENABLED_FLAG_SET_BIT_KHR} indicates whether the implementation supports using the application-provided value for {@code StdVideoH265PpsFlags}{@code ::transquant_bypass_enabled_flag} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-pps">PPS</a> when that value is 1.</li>
     * <li>{@link #VK_VIDEO_ENCODE_H265_STD_CONSTRAINED_INTRA_PRED_FLAG_SET_BIT_KHR VIDEO_ENCODE_H265_STD_CONSTRAINED_INTRA_PRED_FLAG_SET_BIT_KHR} indicates whether the implementation supports using the application-provided value for {@code StdVideoH265PpsFlags}{@code ::constrained_intra_pred_flag} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-pps">PPS</a> when that value is 1.</li>
     * <li>{@link #VK_VIDEO_ENCODE_H265_STD_ENTROPY_CODING_SYNC_ENABLED_FLAG_SET_BIT_KHR VIDEO_ENCODE_H265_STD_ENTROPY_CODING_SYNC_ENABLED_FLAG_SET_BIT_KHR} indicates whether the implementation supports using the application-provided value for {@code StdVideoH265PpsFlags}{@code ::entropy_coding_sync_enabled_flag} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-pps">PPS</a> when that value is 1.</li>
     * <li>{@link #VK_VIDEO_ENCODE_H265_STD_DEBLOCKING_FILTER_OVERRIDE_ENABLED_FLAG_SET_BIT_KHR VIDEO_ENCODE_H265_STD_DEBLOCKING_FILTER_OVERRIDE_ENABLED_FLAG_SET_BIT_KHR} indicates whether the implementation supports using the application-provided value for {@code StdVideoH265PpsFlags}{@code ::deblocking_filter_override_enabled_flag} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-pps">PPS</a> when that value is 1.</li>
     * <li>{@link #VK_VIDEO_ENCODE_H265_STD_DEPENDENT_SLICE_SEGMENTS_ENABLED_FLAG_SET_BIT_KHR VIDEO_ENCODE_H265_STD_DEPENDENT_SLICE_SEGMENTS_ENABLED_FLAG_SET_BIT_KHR} indicates whether the implementation supports using the application-provided value for {@code StdVideoH265PpsFlags}{@code ::dependent_slice_segments_enabled_flag} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-pps">PPS</a> when that value is 1.</li>
     * <li>{@link #VK_VIDEO_ENCODE_H265_STD_DEPENDENT_SLICE_SEGMENT_FLAG_SET_BIT_KHR VIDEO_ENCODE_H265_STD_DEPENDENT_SLICE_SEGMENT_FLAG_SET_BIT_KHR} indicates whether the implementation supports using the application-provided value for {@code StdVideoEncodeH265SliceSegmentHeader}{@code ::dependent_slice_segment_flag} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-slice-segment-header-params">H.265 slice segment header parameters</a> when that value is 1.</li>
     * <li>{@link #VK_VIDEO_ENCODE_H265_STD_SLICE_QP_DELTA_BIT_KHR VIDEO_ENCODE_H265_STD_SLICE_QP_DELTA_BIT_KHR} indicates whether the implementation supports using the application-provided value for {@code StdVideoEncodeH265SliceSegmentHeader}{@code ::slice_qp_delta} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-slice-segment-header-params">H.265 slice segment header parameters</a> when that value is identical across the slice segments of the encoded frame.</li>
     * <li>{@link #VK_VIDEO_ENCODE_H265_STD_DIFFERENT_SLICE_QP_DELTA_BIT_KHR VIDEO_ENCODE_H265_STD_DIFFERENT_SLICE_QP_DELTA_BIT_KHR} indicates whether the implementation supports using the application-provided value for {@code StdVideoEncodeH265SliceSegmentHeader}{@code ::slice_qp_delta} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-slice-segment-header-params">H.265 slice segment header parameters</a> when that value is different across the slice segments of the encoded frame.</li>
     * </ul>
     * 
     * <p>These capability flags provide information to the application about specific H.265 syntax element values that the implementation supports without having to <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-overrides">override</a> them and do not otherwise restrict the values that the application <b>can</b> specify for any of the mentioned H.265 syntax elements.</p>
     */
    public static final int
        VK_VIDEO_ENCODE_H265_STD_SEPARATE_COLOR_PLANE_FLAG_SET_BIT_KHR                = 0x1,
        VK_VIDEO_ENCODE_H265_STD_SAMPLE_ADAPTIVE_OFFSET_ENABLED_FLAG_SET_BIT_KHR      = 0x2,
        VK_VIDEO_ENCODE_H265_STD_SCALING_LIST_DATA_PRESENT_FLAG_SET_BIT_KHR           = 0x4,
        VK_VIDEO_ENCODE_H265_STD_PCM_ENABLED_FLAG_SET_BIT_KHR                         = 0x8,
        VK_VIDEO_ENCODE_H265_STD_SPS_TEMPORAL_MVP_ENABLED_FLAG_SET_BIT_KHR            = 0x10,
        VK_VIDEO_ENCODE_H265_STD_INIT_QP_MINUS26_BIT_KHR                              = 0x20,
        VK_VIDEO_ENCODE_H265_STD_WEIGHTED_PRED_FLAG_SET_BIT_KHR                       = 0x40,
        VK_VIDEO_ENCODE_H265_STD_WEIGHTED_BIPRED_FLAG_SET_BIT_KHR                     = 0x80,
        VK_VIDEO_ENCODE_H265_STD_LOG2_PARALLEL_MERGE_LEVEL_MINUS2_BIT_KHR             = 0x100,
        VK_VIDEO_ENCODE_H265_STD_SIGN_DATA_HIDING_ENABLED_FLAG_SET_BIT_KHR            = 0x200,
        VK_VIDEO_ENCODE_H265_STD_TRANSFORM_SKIP_ENABLED_FLAG_SET_BIT_KHR              = 0x400,
        VK_VIDEO_ENCODE_H265_STD_TRANSFORM_SKIP_ENABLED_FLAG_UNSET_BIT_KHR            = 0x800,
        VK_VIDEO_ENCODE_H265_STD_PPS_SLICE_CHROMA_QP_OFFSETS_PRESENT_FLAG_SET_BIT_KHR = 0x1000,
        VK_VIDEO_ENCODE_H265_STD_TRANSQUANT_BYPASS_ENABLED_FLAG_SET_BIT_KHR           = 0x2000,
        VK_VIDEO_ENCODE_H265_STD_CONSTRAINED_INTRA_PRED_FLAG_SET_BIT_KHR              = 0x4000,
        VK_VIDEO_ENCODE_H265_STD_ENTROPY_CODING_SYNC_ENABLED_FLAG_SET_BIT_KHR         = 0x8000,
        VK_VIDEO_ENCODE_H265_STD_DEBLOCKING_FILTER_OVERRIDE_ENABLED_FLAG_SET_BIT_KHR  = 0x10000,
        VK_VIDEO_ENCODE_H265_STD_DEPENDENT_SLICE_SEGMENTS_ENABLED_FLAG_SET_BIT_KHR    = 0x20000,
        VK_VIDEO_ENCODE_H265_STD_DEPENDENT_SLICE_SEGMENT_FLAG_SET_BIT_KHR             = 0x40000,
        VK_VIDEO_ENCODE_H265_STD_SLICE_QP_DELTA_BIT_KHR                               = 0x80000,
        VK_VIDEO_ENCODE_H265_STD_DIFFERENT_SLICE_QP_DELTA_BIT_KHR                     = 0x100000;

    /**
     * VkVideoEncodeH265CtbSizeFlagBitsKHR - Supported CTB sizes for H.265 video encode
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_ENCODE_H265_CTB_SIZE_16_BIT_KHR VIDEO_ENCODE_H265_CTB_SIZE_16_BIT_KHR} specifies that a CTB size of 16x16 is supported.</li>
     * <li>{@link #VK_VIDEO_ENCODE_H265_CTB_SIZE_32_BIT_KHR VIDEO_ENCODE_H265_CTB_SIZE_32_BIT_KHR} specifies that a CTB size of 32x32 is supported.</li>
     * <li>{@link #VK_VIDEO_ENCODE_H265_CTB_SIZE_64_BIT_KHR VIDEO_ENCODE_H265_CTB_SIZE_64_BIT_KHR} specifies that a CTB size of 64x64 is supported.</li>
     * </ul>
     */
    public static final int
        VK_VIDEO_ENCODE_H265_CTB_SIZE_16_BIT_KHR = 0x1,
        VK_VIDEO_ENCODE_H265_CTB_SIZE_32_BIT_KHR = 0x2,
        VK_VIDEO_ENCODE_H265_CTB_SIZE_64_BIT_KHR = 0x4;

    /**
     * VkVideoEncodeH265TransformBlockSizeFlagBitsKHR - Supported transform block sizes for H.265 video encode
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_ENCODE_H265_TRANSFORM_BLOCK_SIZE_4_BIT_KHR VIDEO_ENCODE_H265_TRANSFORM_BLOCK_SIZE_4_BIT_KHR} specifies that a transform block size of 4x4 is supported.</li>
     * <li>{@link #VK_VIDEO_ENCODE_H265_TRANSFORM_BLOCK_SIZE_8_BIT_KHR VIDEO_ENCODE_H265_TRANSFORM_BLOCK_SIZE_8_BIT_KHR} specifies that a transform block size of 8x8 is supported.</li>
     * <li>{@link #VK_VIDEO_ENCODE_H265_TRANSFORM_BLOCK_SIZE_16_BIT_KHR VIDEO_ENCODE_H265_TRANSFORM_BLOCK_SIZE_16_BIT_KHR} specifies that a transform block size of 16x16 is supported.</li>
     * <li>{@link #VK_VIDEO_ENCODE_H265_TRANSFORM_BLOCK_SIZE_32_BIT_KHR VIDEO_ENCODE_H265_TRANSFORM_BLOCK_SIZE_32_BIT_KHR} specifies that a transform block size of 32x32 is supported.</li>
     * </ul>
     */
    public static final int
        VK_VIDEO_ENCODE_H265_TRANSFORM_BLOCK_SIZE_4_BIT_KHR  = 0x1,
        VK_VIDEO_ENCODE_H265_TRANSFORM_BLOCK_SIZE_8_BIT_KHR  = 0x2,
        VK_VIDEO_ENCODE_H265_TRANSFORM_BLOCK_SIZE_16_BIT_KHR = 0x4,
        VK_VIDEO_ENCODE_H265_TRANSFORM_BLOCK_SIZE_32_BIT_KHR = 0x8;

    /**
     * VkVideoEncodeH265RateControlFlagBitsKHR - H.265 encode rate control bits
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_ENCODE_H265_RATE_CONTROL_ATTEMPT_HRD_COMPLIANCE_BIT_KHR VIDEO_ENCODE_H265_RATE_CONTROL_ATTEMPT_HRD_COMPLIANCE_BIT_KHR} specifies that rate control <b>should</b> attempt to produce an HRD compliant bitstream, as defined in annex C of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#itu-t-h265">ITU-T H.265 Specification</a>.</li>
     * <li>{@link #VK_VIDEO_ENCODE_H265_RATE_CONTROL_REGULAR_GOP_BIT_KHR VIDEO_ENCODE_H265_RATE_CONTROL_REGULAR_GOP_BIT_KHR} specifies that the application intends to use a <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-regular-gop">regular GOP structure</a> according to the parameters specified in the {@code gopFrameCount}, {@code idrPeriod}, and {@code consecutiveBFrameCount} members of the {@link VkVideoEncodeH265RateControlInfoKHR} structure.</li>
     * <li>{@link #VK_VIDEO_ENCODE_H265_RATE_CONTROL_REFERENCE_PATTERN_FLAT_BIT_KHR VIDEO_ENCODE_H265_RATE_CONTROL_REFERENCE_PATTERN_FLAT_BIT_KHR} specifies that the application intends to follow a <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-ref-pattern-flat">flat reference pattern</a> in the GOP.</li>
     * <li>{@link #VK_VIDEO_ENCODE_H265_RATE_CONTROL_REFERENCE_PATTERN_DYADIC_BIT_KHR VIDEO_ENCODE_H265_RATE_CONTROL_REFERENCE_PATTERN_DYADIC_BIT_KHR} specifies that the application intends to follow a <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-ref-pattern-dyadic">dyadic reference pattern</a> in the GOP.</li>
     * <li>{@link #VK_VIDEO_ENCODE_H265_RATE_CONTROL_TEMPORAL_SUB_LAYER_PATTERN_DYADIC_BIT_KHR VIDEO_ENCODE_H265_RATE_CONTROL_TEMPORAL_SUB_LAYER_PATTERN_DYADIC_BIT_KHR} specifies that the application intends to follow a <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-h265-layer-pattern-dyadic">dyadic temporal sub-layer pattern</a>.</li>
     * </ul>
     */
    public static final int
        VK_VIDEO_ENCODE_H265_RATE_CONTROL_ATTEMPT_HRD_COMPLIANCE_BIT_KHR            = 0x1,
        VK_VIDEO_ENCODE_H265_RATE_CONTROL_REGULAR_GOP_BIT_KHR                       = 0x2,
        VK_VIDEO_ENCODE_H265_RATE_CONTROL_REFERENCE_PATTERN_FLAT_BIT_KHR            = 0x4,
        VK_VIDEO_ENCODE_H265_RATE_CONTROL_REFERENCE_PATTERN_DYADIC_BIT_KHR          = 0x8,
        VK_VIDEO_ENCODE_H265_RATE_CONTROL_TEMPORAL_SUB_LAYER_PATTERN_DYADIC_BIT_KHR = 0x10;

    private KHRVideoEncodeH265() {}

}