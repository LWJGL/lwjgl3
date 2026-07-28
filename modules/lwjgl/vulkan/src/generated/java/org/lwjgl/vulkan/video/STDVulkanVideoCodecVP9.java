/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.video;

import static org.lwjgl.vulkan.video.STDVulkanVideo.*;

public final class STDVulkanVideoCodecVP9 {

    public static final int
        STD_VIDEO_VP9_NUM_REF_FRAMES              = 8,
        STD_VIDEO_VP9_REFS_PER_FRAME              = 3,
        STD_VIDEO_VP9_MAX_REF_FRAMES              = 4,
        STD_VIDEO_VP9_LOOP_FILTER_ADJUSTMENTS     = 2,
        STD_VIDEO_VP9_MAX_SEGMENTS                = 8,
        STD_VIDEO_VP9_SEG_LVL_MAX                 = 4,
        STD_VIDEO_VP9_MAX_SEGMENTATION_TREE_PROBS = 7,
        STD_VIDEO_VP9_MAX_SEGMENTATION_PRED_PROB  = 3;

    public static final int
        STD_VIDEO_VP9_PROFILE_0       = 0,
        STD_VIDEO_VP9_PROFILE_1       = 1,
        STD_VIDEO_VP9_PROFILE_2       = 2,
        STD_VIDEO_VP9_PROFILE_3       = 3,
        STD_VIDEO_VP9_PROFILE_INVALID = 0x7FFFFFFF;

    public static final int
        STD_VIDEO_VP9_LEVEL_1_0     = 0,
        STD_VIDEO_VP9_LEVEL_1_1     = 1,
        STD_VIDEO_VP9_LEVEL_2_0     = 2,
        STD_VIDEO_VP9_LEVEL_2_1     = 3,
        STD_VIDEO_VP9_LEVEL_3_0     = 4,
        STD_VIDEO_VP9_LEVEL_3_1     = 5,
        STD_VIDEO_VP9_LEVEL_4_0     = 6,
        STD_VIDEO_VP9_LEVEL_4_1     = 7,
        STD_VIDEO_VP9_LEVEL_5_0     = 8,
        STD_VIDEO_VP9_LEVEL_5_1     = 9,
        STD_VIDEO_VP9_LEVEL_5_2     = 10,
        STD_VIDEO_VP9_LEVEL_6_0     = 11,
        STD_VIDEO_VP9_LEVEL_6_1     = 12,
        STD_VIDEO_VP9_LEVEL_6_2     = 13,
        STD_VIDEO_VP9_LEVEL_INVALID = 0x7FFFFFFF;

    public static final int
        STD_VIDEO_VP9_FRAME_TYPE_KEY     = 0,
        STD_VIDEO_VP9_FRAME_TYPE_NON_KEY = 1,
        STD_VIDEO_VP9_FRAME_TYPE_INVALID = 0x7FFFFFFF;

    public static final int
        STD_VIDEO_VP9_REFERENCE_NAME_INTRA_FRAME  = 0,
        STD_VIDEO_VP9_REFERENCE_NAME_LAST_FRAME   = 1,
        STD_VIDEO_VP9_REFERENCE_NAME_GOLDEN_FRAME = 2,
        STD_VIDEO_VP9_REFERENCE_NAME_ALTREF_FRAME = 3,
        STD_VIDEO_VP9_REFERENCE_NAME_INVALID      = 0x7FFFFFFF;

    public static final int
        STD_VIDEO_VP9_INTERPOLATION_FILTER_EIGHTTAP        = 0,
        STD_VIDEO_VP9_INTERPOLATION_FILTER_EIGHTTAP_SMOOTH = 1,
        STD_VIDEO_VP9_INTERPOLATION_FILTER_EIGHTTAP_SHARP  = 2,
        STD_VIDEO_VP9_INTERPOLATION_FILTER_BILINEAR        = 3,
        STD_VIDEO_VP9_INTERPOLATION_FILTER_SWITCHABLE      = 4,
        STD_VIDEO_VP9_INTERPOLATION_FILTER_INVALID         = 0x7FFFFFFF;

    public static final int
        STD_VIDEO_VP9_COLOR_SPACE_UNKNOWN   = 0,
        STD_VIDEO_VP9_COLOR_SPACE_BT_601    = 1,
        STD_VIDEO_VP9_COLOR_SPACE_BT_709    = 2,
        STD_VIDEO_VP9_COLOR_SPACE_SMPTE_170 = 3,
        STD_VIDEO_VP9_COLOR_SPACE_SMPTE_240 = 4,
        STD_VIDEO_VP9_COLOR_SPACE_BT_2020   = 5,
        STD_VIDEO_VP9_COLOR_SPACE_RESERVED  = 6,
        STD_VIDEO_VP9_COLOR_SPACE_RGB       = 7,
        STD_VIDEO_VP9_COLOR_SPACE_INVALID   = 0x7FFFFFFF;

    public static final int VK_STD_VULKAN_VIDEO_CODEC_VP9_DECODE_SPEC_VERSION = VK_MAKE_VIDEO_STD_VERSION(1, 0, 0);

    public static final String VK_STD_VULKAN_VIDEO_CODEC_VP9_DECODE_EXTENSION_NAME = "VK_STD_vulkan_video_codec_vp9_decode";

    private STDVulkanVideoCodecVP9() {}

}