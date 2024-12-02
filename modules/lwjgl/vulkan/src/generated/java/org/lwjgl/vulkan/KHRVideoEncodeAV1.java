/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension builds upon the {@link KHRVideoEncodeQueue VK_KHR_video_encode_queue} extension by adding support for encoding elementary video stream sequences compliant with the AV1 video compression standard.
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_video_encode_av1}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>514</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRVideoEncodeQueue VK_KHR_video_encode_queue}</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Daniel Rakos <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_video_encode_av1]%20@aqnuep%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_video_encode_av1%20extension*">aqnuep</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_video_encode_av1.adoc">VK_KHR_video_encode_av1</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2024-09-23</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Ahmed Abdelkhalek, AMD</li>
 * <li>Benjamin Cheng, AMD</li>
 * <li>Ho Hin Lau, AMD</li>
 * <li>Lynne Iribarren, Independent</li>
 * <li>David Airlie, Red Hat, Inc.</li>
 * <li>Ping Liu, Intel</li>
 * <li>Srinath Kumarapuram, NVIDIA</li>
 * <li>Vassili Nikolaev, NVIDIA</li>
 * <li>Tony Zlatinski, NVIDIA</li>
 * <li>Konda Raju, NVIDIA</li>
 * <li>Charlie Turner, Igalia</li>
 * <li>Daniel Almeida, Collabora</li>
 * <li>Nicolas Dufresne, Collabora</li>
 * <li>Daniel Rakos, RasterGrid</li>
 * </ul></dd>
 * </dl>
 */
public final class KHRVideoEncodeAV1 {

    /** The extension specification version. */
    public static final int VK_KHR_VIDEO_ENCODE_AV1_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_VIDEO_ENCODE_AV1_EXTENSION_NAME = "VK_KHR_video_encode_av1";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_ENCODE_AV1_CAPABILITIES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_SESSION_PARAMETERS_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_AV1_SESSION_PARAMETERS_CREATE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_PICTURE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_AV1_PICTURE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_DPB_SLOT_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_AV1_DPB_SLOT_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_AV1_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_AV1_FEATURES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_PROFILE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_AV1_PROFILE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_RATE_CONTROL_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_AV1_RATE_CONTROL_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_RATE_CONTROL_LAYER_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_AV1_RATE_CONTROL_LAYER_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_QUALITY_LEVEL_PROPERTIES_KHR STRUCTURE_TYPE_VIDEO_ENCODE_AV1_QUALITY_LEVEL_PROPERTIES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_SESSION_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_AV1_SESSION_CREATE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_GOP_REMAINING_FRAME_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_AV1_GOP_REMAINING_FRAME_INFO_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_CAPABILITIES_KHR                   = 1000513000,
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_SESSION_PARAMETERS_CREATE_INFO_KHR = 1000513001,
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_PICTURE_INFO_KHR                   = 1000513002,
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_DPB_SLOT_INFO_KHR                  = 1000513003,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_AV1_FEATURES_KHR       = 1000513004,
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_PROFILE_INFO_KHR                   = 1000513005,
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_RATE_CONTROL_INFO_KHR              = 1000513006,
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_RATE_CONTROL_LAYER_INFO_KHR        = 1000513007,
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_QUALITY_LEVEL_PROPERTIES_KHR       = 1000513008,
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_SESSION_CREATE_INFO_KHR            = 1000513009,
        VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_GOP_REMAINING_FRAME_INFO_KHR       = 1000513010;

    /** Extends {@code VkVideoCodecOperationFlagBitsKHR}. */
    public static final int VK_VIDEO_CODEC_OPERATION_ENCODE_AV1_BIT_KHR = 0x40000;

    /**
     * VkVideoEncodeAV1PredictionModeKHR - AV1 encode prediction mode
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_ENCODE_AV1_PREDICTION_MODE_INTRA_ONLY_KHR VIDEO_ENCODE_AV1_PREDICTION_MODE_INTRA_ONLY_KHR} specifies the use of <em>intra-only prediction mode</em>, used when encoding AV1 frames of type {@code STD_VIDEO_AV1_FRAME_TYPE_KEY} or {@code STD_VIDEO_AV1_FRAME_TYPE_INTRA_ONLY}.</li>
     * <li>{@link #VK_VIDEO_ENCODE_AV1_PREDICTION_MODE_SINGLE_REFERENCE_KHR VIDEO_ENCODE_AV1_PREDICTION_MODE_SINGLE_REFERENCE_KHR} specifies the use of <em>single reference prediction mode</em>, used when encoding AV1 frames of type {@code STD_VIDEO_AV1_FRAME_TYPE_INTER} or {@code STD_VIDEO_AV1_FRAME_TYPE_SWITCH} with {@code reference_select}, as defined in section 6.8.23 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#aomedia-av1">AV1 Specification</a>, equal to 0. When using this prediction mode, the application <b>must</b> specify a reference picture for at least one <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-reference-names">AV1 reference name</a> in {@link VkVideoEncodeAV1PictureInfoKHR}{@code ::referenceNameSlotIndices} that is supported by the implementation, as reported in {@link VkVideoEncodeAV1CapabilitiesKHR}{@code ::singleReferenceNameMask}.</li>
     * <li>{@link #VK_VIDEO_ENCODE_AV1_PREDICTION_MODE_UNIDIRECTIONAL_COMPOUND_KHR VIDEO_ENCODE_AV1_PREDICTION_MODE_UNIDIRECTIONAL_COMPOUND_KHR} specifies the use of <em>unidirectional compound prediction mode</em>, used when encoding AV1 frames of type {@code STD_VIDEO_AV1_FRAME_TYPE_INTER} or {@code STD_VIDEO_AV1_FRAME_TYPE_SWITCH} with {@code reference_select}, as defined in section 6.8.23 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#aomedia-av1">AV1 Specification</a>, equal to 1, and both <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-reference-names">reference names</a> used for prediction are from the same reference frame group, as defined in section 6.10.24 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#aomedia-av1">AV1 Specification</a>. When using this prediction mode, the application <b>must</b> specify a reference picture for at least two <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-reference-names">AV1 reference names</a> in {@link VkVideoEncodeAV1PictureInfoKHR}{@code ::referenceNameSlotIndices} that is supported by the implementation, as reported in {@link VkVideoEncodeAV1CapabilitiesKHR}{@code ::unidirectionalCompoundReferenceNameMask}, where those two reference names are one of the allowed pairs of reference names, as defined in section 5.11.25 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#aomedia-av1">AV1 Specification</a>, listed below:
     * 
     * <ul>
     * <li>{@code LAST_FRAME} and {@code LAST2_FRAME},</li>
     * <li>{@code LAST_FRAME} and {@code LAST3_FRAME},</li>
     * <li>{@code LAST_FRAME} and {@code GOLDEN_FRAME}, or</li>
     * <li>{@code BWDREF_FRAME} and {@code ALTREF_FRAME}.</li>
     * </ul>
     * </li>
     * <li>{@link #VK_VIDEO_ENCODE_AV1_PREDICTION_MODE_BIDIRECTIONAL_COMPOUND_KHR VIDEO_ENCODE_AV1_PREDICTION_MODE_BIDIRECTIONAL_COMPOUND_KHR} specifies the use of <em>bidirectional compound prediction mode</em>, used when encoding AV1 frames of type {@code STD_VIDEO_AV1_FRAME_TYPE_INTER} or {@code STD_VIDEO_AV1_FRAME_TYPE_SWITCH} with {@code reference_select}, as defined in section 6.8.23 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#aomedia-av1">AV1 Specification</a>, equal to 1, and the two <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-reference-names">reference names</a> used for prediction are from different reference frame groups, as defined in section 6.10.24 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#aomedia-av1">AV1 Specification</a>. When using this prediction mode, the application <b>must</b> specify a reference picture for at least one <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-reference-names">AV1 reference name</a> from each reference frame group in {@link VkVideoEncodeAV1PictureInfoKHR}{@code ::referenceNameSlotIndices} that is supported by the implementation, as reported in {@link VkVideoEncodeAV1CapabilitiesKHR}{@code ::bidirectionalCompoundReferenceNameMask}.</li>
     * </ul>
     * 
     * <p>The effective prediction mode used to encode individual AV1 mode info blocks <b>may</b> use simpler prediction modes than the one set by the application for the frame, as allowed by the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#aomedia-av1">AV1 Specification</a>, in particular:</p>
     * 
     * <ul>
     * <li>Frames encoded with single reference prediction mode <b>may</b> contain mode info blocks encoded with intra-only prediction mode.</li>
     * <li>Frames encoded with unidirectional compound prediction mode <b>may</b> contain mode info blocks encoded with intra-only or single reference prediction mode.</li>
     * <li>Frames encoded with bidirectional compound prediction mode <b>may</b> contain mode info blocks encoded with intra-only, single reference, or unidirectional compound prediction mode.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkVideoEncodeAV1PictureInfoKHR}</p>
     */
    public static final int
        VK_VIDEO_ENCODE_AV1_PREDICTION_MODE_INTRA_ONLY_KHR              = 0,
        VK_VIDEO_ENCODE_AV1_PREDICTION_MODE_SINGLE_REFERENCE_KHR        = 1,
        VK_VIDEO_ENCODE_AV1_PREDICTION_MODE_UNIDIRECTIONAL_COMPOUND_KHR = 2,
        VK_VIDEO_ENCODE_AV1_PREDICTION_MODE_BIDIRECTIONAL_COMPOUND_KHR  = 3;

    /**
     * VkVideoEncodeAV1RateControlGroupKHR - AV1 encode rate control group
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_ENCODE_AV1_RATE_CONTROL_GROUP_INTRA_KHR VIDEO_ENCODE_AV1_RATE_CONTROL_GROUP_INTRA_KHR} <b>should</b> be specified when encoding AV1 frames that use intra-only prediction (e.g. when encoding AV1 frames of type {@code STD_VIDEO_AV1_FRAME_TYPE_KEY} or {@code STD_VIDEO_AV1_FRAME_TYPE_INTRA_ONLY}).</li>
     * <li>{@link #VK_VIDEO_ENCODE_AV1_RATE_CONTROL_GROUP_PREDICTIVE_KHR VIDEO_ENCODE_AV1_RATE_CONTROL_GROUP_PREDICTIVE_KHR} <b>should</b> be specified when encoding AV1 frames that only have forward references in display order.</li>
     * <li>{@link #VK_VIDEO_ENCODE_AV1_RATE_CONTROL_GROUP_BIPREDICTIVE_KHR VIDEO_ENCODE_AV1_RATE_CONTROL_GROUP_BIPREDICTIVE_KHR} <b>should</b> be specified when encoding AV1 frames that have backward references in display order.</li>
     * </ul>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>While the application can specify any rate control group for any frame, indifferent of the frame type, prediction mode, or prediction direction, specifying a rate control group that does not reflect the prediction direction used by the encoded frame may result in unexpected behavior of the implementation’s rate control algorithm.</p>
     * </div>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkVideoEncodeAV1PictureInfoKHR}</p>
     */
    public static final int
        VK_VIDEO_ENCODE_AV1_RATE_CONTROL_GROUP_INTRA_KHR        = 0,
        VK_VIDEO_ENCODE_AV1_RATE_CONTROL_GROUP_PREDICTIVE_KHR   = 1,
        VK_VIDEO_ENCODE_AV1_RATE_CONTROL_GROUP_BIPREDICTIVE_KHR = 2;

    /**
     * VkVideoEncodeAV1CapabilityFlagBitsKHR - AV1 encode capability flags
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_ENCODE_AV1_CAPABILITY_PER_RATE_CONTROL_GROUP_MIN_MAX_Q_INDEX_BIT_KHR VIDEO_ENCODE_AV1_CAPABILITY_PER_RATE_CONTROL_GROUP_MIN_MAX_Q_INDEX_BIT_KHR} indicates support for specifying different quantizer index values in the members of {@link VkVideoEncodeAV1QIndexKHR}.</li>
     * <li>{@link #VK_VIDEO_ENCODE_AV1_CAPABILITY_GENERATE_OBU_EXTENSION_HEADER_BIT_KHR VIDEO_ENCODE_AV1_CAPABILITY_GENERATE_OBU_EXTENSION_HEADER_BIT_KHR} indicates support for generating OBU extension headers, as defined in section 5.3.3 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#aomedia-av1">AV1 Specification</a>.</li>
     * <li>{@link #VK_VIDEO_ENCODE_AV1_CAPABILITY_PRIMARY_REFERENCE_CDF_ONLY_BIT_KHR VIDEO_ENCODE_AV1_CAPABILITY_PRIMARY_REFERENCE_CDF_ONLY_BIT_KHR} indicates support for using the primary reference frame indicated by the value of {@code StdVideoEncodeAV1PictureInfo}{@code ::primary_ref_frame} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-picture-info">AV1 picture information</a> only for CDF data reference, as defined in section 6.8.2 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#aomedia-av1">AV1 Specification</a>.</li>
     * <li>{@link #VK_VIDEO_ENCODE_AV1_CAPABILITY_FRAME_SIZE_OVERRIDE_BIT_KHR VIDEO_ENCODE_AV1_CAPABILITY_FRAME_SIZE_OVERRIDE_BIT_KHR} indicates support for encoding a picture with a frame size different from the maximum frame size defined in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-active-sequence-header">active AV1 sequence header</a>. If this capability is not supported, then {@code frame_size_override_flag} <b>must</b> not be set in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-picture-info">AV1 picture information</a> of the encoded frame and the coded extent of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-input-picture">encode input picture</a> <b>must</b> match the maximum coded extent allowed by the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-active-sequence-header">active AV1 sequence header</a>, i.e. <code>(max_frame_width_minus_1 + 1, max_frame_height_minus_1 + 1)</code>.</li>
     * <li>{@link #VK_VIDEO_ENCODE_AV1_CAPABILITY_MOTION_VECTOR_SCALING_BIT_KHR VIDEO_ENCODE_AV1_CAPABILITY_MOTION_VECTOR_SCALING_BIT_KHR} indicates support for motion vector scaling, as defined in section 7.11.3.3 of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#aomedia-av1">AV1 Specification</a>. If this capability is not supported, then the coded extent of all <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#active-reference-pictures">active reference pictures</a> <b>must</b> match the coded extent of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-input-picture">encode input picture</a>. This capability <b>may</b> only be supported by a video profile when {@link #VK_VIDEO_ENCODE_AV1_CAPABILITY_FRAME_SIZE_OVERRIDE_BIT_KHR VIDEO_ENCODE_AV1_CAPABILITY_FRAME_SIZE_OVERRIDE_BIT_KHR} is also supported.</li>
     * </ul>
     */
    public static final int
        VK_VIDEO_ENCODE_AV1_CAPABILITY_PER_RATE_CONTROL_GROUP_MIN_MAX_Q_INDEX_BIT_KHR = 0x1,
        VK_VIDEO_ENCODE_AV1_CAPABILITY_GENERATE_OBU_EXTENSION_HEADER_BIT_KHR          = 0x2,
        VK_VIDEO_ENCODE_AV1_CAPABILITY_PRIMARY_REFERENCE_CDF_ONLY_BIT_KHR             = 0x4,
        VK_VIDEO_ENCODE_AV1_CAPABILITY_FRAME_SIZE_OVERRIDE_BIT_KHR                    = 0x8,
        VK_VIDEO_ENCODE_AV1_CAPABILITY_MOTION_VECTOR_SCALING_BIT_KHR                  = 0x10;

    /**
     * VkVideoEncodeAV1StdFlagBitsKHR - Video encode AV1 syntax capability flags
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_ENCODE_AV1_STD_UNIFORM_TILE_SPACING_FLAG_SET_BIT_KHR VIDEO_ENCODE_AV1_STD_UNIFORM_TILE_SPACING_FLAG_SET_BIT_KHR} indicates whether the implementation supports using the application-provided value for {@code StdVideoAV1TileInfoFlags}{@code ::uniform_tile_spacing_flag} in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-tile-params">AV1 tile parameters</a> when that value is 1, indifferent of the coded extent of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-input-picture">encode input picture</a> and the number of tile columns and rows requested in the {@code TileCols} and {@code TileRows} members of {@code StdVideoAV1TileInfo}.</li>
     * <li>{@link #VK_VIDEO_ENCODE_AV1_STD_SKIP_MODE_PRESENT_UNSET_BIT_KHR VIDEO_ENCODE_AV1_STD_SKIP_MODE_PRESENT_UNSET_BIT_KHR} specifies whether the implementation supports using the application-provided value for {@code StdVideoEncodeAV1PictureInfoFlags}{@code ::skip_mode_present} when that value is 0.</li>
     * <li>{@link #VK_VIDEO_ENCODE_AV1_STD_PRIMARY_REF_FRAME_BIT_KHR VIDEO_ENCODE_AV1_STD_PRIMARY_REF_FRAME_BIT_KHR} specifies whether the implementation supports using the application-provided value for {@code StdVideoEncodeAV1PictureInfo}{@code ::primary_ref_frame}.</li>
     * <li>{@link #VK_VIDEO_ENCODE_AV1_STD_DELTA_Q_BIT_KHR VIDEO_ENCODE_AV1_STD_DELTA_Q_BIT_KHR} specifies whether the implementation supports using the application-provided values for the {@code DeltaQYDc}, {@code DeltaQUDc}, {@code DeltaQUAc}, {@code DeltaQVDc}, and {@code DeltaQVAc} members of {@code StdVideoAV1Quantization}.</li>
     * </ul>
     * 
     * <p>These capability flags provide information to the application about specific AV1 syntax element values that the implementation supports without having to <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-overrides">override</a> them and do not otherwise restrict the values that the application <b>can</b> specify for any of the mentioned AV1 syntax elements.</p>
     */
    public static final int
        VK_VIDEO_ENCODE_AV1_STD_UNIFORM_TILE_SPACING_FLAG_SET_BIT_KHR = 0x1,
        VK_VIDEO_ENCODE_AV1_STD_SKIP_MODE_PRESENT_UNSET_BIT_KHR       = 0x2,
        VK_VIDEO_ENCODE_AV1_STD_PRIMARY_REF_FRAME_BIT_KHR             = 0x4,
        VK_VIDEO_ENCODE_AV1_STD_DELTA_Q_BIT_KHR                       = 0x8;

    /**
     * VkVideoEncodeAV1SuperblockSizeFlagBitsKHR - Supported superblock sizes for AV1 video encode
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_ENCODE_AV1_SUPERBLOCK_SIZE_64_BIT_KHR VIDEO_ENCODE_AV1_SUPERBLOCK_SIZE_64_BIT_KHR} specifies that a superblock size of 64x64 is supported.</li>
     * <li>{@link #VK_VIDEO_ENCODE_AV1_SUPERBLOCK_SIZE_128_BIT_KHR VIDEO_ENCODE_AV1_SUPERBLOCK_SIZE_128_BIT_KHR} specifies that a superblock size of 128x128 is supported.</li>
     * </ul>
     */
    public static final int
        VK_VIDEO_ENCODE_AV1_SUPERBLOCK_SIZE_64_BIT_KHR  = 0x1,
        VK_VIDEO_ENCODE_AV1_SUPERBLOCK_SIZE_128_BIT_KHR = 0x2;

    /**
     * VkVideoEncodeAV1RateControlFlagBitsKHR - AV1 encode rate control bits
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIDEO_ENCODE_AV1_RATE_CONTROL_REGULAR_GOP_BIT_KHR VIDEO_ENCODE_AV1_RATE_CONTROL_REGULAR_GOP_BIT_KHR} specifies that the application intends to use a <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-regular-gop">regular GOP structure</a> according to the parameters specified in the {@code gopFrameCount} and {@code keyFramePeriod} members of the {@link VkVideoEncodeAV1RateControlInfoKHR} structure.</li>
     * <li>{@link #VK_VIDEO_ENCODE_AV1_RATE_CONTROL_TEMPORAL_LAYER_PATTERN_DYADIC_BIT_KHR VIDEO_ENCODE_AV1_RATE_CONTROL_TEMPORAL_LAYER_PATTERN_DYADIC_BIT_KHR} specifies that the application intends to follow a <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-layer-pattern-dyadic">dyadic temporal layer pattern</a>.</li>
     * <li>{@link #VK_VIDEO_ENCODE_AV1_RATE_CONTROL_REFERENCE_PATTERN_FLAT_BIT_KHR VIDEO_ENCODE_AV1_RATE_CONTROL_REFERENCE_PATTERN_FLAT_BIT_KHR} specifies that the application intends to follow a <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-ref-pattern-flat">flat reference pattern</a> in the GOP.</li>
     * <li>{@link #VK_VIDEO_ENCODE_AV1_RATE_CONTROL_REFERENCE_PATTERN_DYADIC_BIT_KHR VIDEO_ENCODE_AV1_RATE_CONTROL_REFERENCE_PATTERN_DYADIC_BIT_KHR} specifies that the application intends to follow a <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#encode-av1-ref-pattern-dyadic">dyadic reference pattern</a> in the GOP.</li>
     * </ul>
     */
    public static final int
        VK_VIDEO_ENCODE_AV1_RATE_CONTROL_REGULAR_GOP_BIT_KHR                   = 0x1,
        VK_VIDEO_ENCODE_AV1_RATE_CONTROL_TEMPORAL_LAYER_PATTERN_DYADIC_BIT_KHR = 0x2,
        VK_VIDEO_ENCODE_AV1_RATE_CONTROL_REFERENCE_PATTERN_FLAT_BIT_KHR        = 0x4,
        VK_VIDEO_ENCODE_AV1_RATE_CONTROL_REFERENCE_PATTERN_DYADIC_BIT_KHR      = 0x8;

    private KHRVideoEncodeAV1() {}

}