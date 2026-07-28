/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val STD_vulkan_video_codec_vp9 = "STDVulkanVideoCodecVP9".nativeClassVK("STD_vulkan_video_codec_vp9", prefix = "STD_VIDEO", type = "device", postfix = STD) {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideo.*")

    IntConstant(
        "VP9_NUM_REF_FRAMES".."8",
        "VP9_REFS_PER_FRAME".."3",
        "VP9_MAX_REF_FRAMES".."4",
        "VP9_LOOP_FILTER_ADJUSTMENTS".."2",
        "VP9_MAX_SEGMENTS".."8",
        "VP9_SEG_LVL_MAX".."4",
        "VP9_MAX_SEGMENTATION_TREE_PROBS".."7",
        "VP9_MAX_SEGMENTATION_PRED_PROB".."3"
    )

    EnumConstant(
        "VP9_PROFILE_0".enum("0"),
        "VP9_PROFILE_1".enum,
        "VP9_PROFILE_2".enum,
        "VP9_PROFILE_3".enum,
        "VP9_PROFILE_INVALID".enum(0x7FFFFFFF)
    )

    EnumConstant(
        "VP9_LEVEL_1_0".enum("0"),
        "VP9_LEVEL_1_1".enum,
        "VP9_LEVEL_2_0".enum,
        "VP9_LEVEL_2_1".enum,
        "VP9_LEVEL_3_0".enum,
        "VP9_LEVEL_3_1".enum,
        "VP9_LEVEL_4_0".enum,
        "VP9_LEVEL_4_1".enum,
        "VP9_LEVEL_5_0".enum,
        "VP9_LEVEL_5_1".enum,
        "VP9_LEVEL_5_2".enum,
        "VP9_LEVEL_6_0".enum,
        "VP9_LEVEL_6_1".enum,
        "VP9_LEVEL_6_2".enum,
        "VP9_LEVEL_INVALID".enum(0x7FFFFFFF)
    )

    EnumConstant(
        "VP9_FRAME_TYPE_KEY".enum("0"),
        "VP9_FRAME_TYPE_NON_KEY".enum,
        "VP9_FRAME_TYPE_INVALID".enum(0x7FFFFFFF)
    )

    EnumConstant(
        "VP9_REFERENCE_NAME_INTRA_FRAME".enum("0"),
        "VP9_REFERENCE_NAME_LAST_FRAME".enum,
        "VP9_REFERENCE_NAME_GOLDEN_FRAME".enum,
        "VP9_REFERENCE_NAME_ALTREF_FRAME".enum,
        "VP9_REFERENCE_NAME_INVALID".enum(0x7FFFFFFF)
    )

    EnumConstant(
        "VP9_INTERPOLATION_FILTER_EIGHTTAP".enum("0"),
        "VP9_INTERPOLATION_FILTER_EIGHTTAP_SMOOTH".enum,
        "VP9_INTERPOLATION_FILTER_EIGHTTAP_SHARP".enum,
        "VP9_INTERPOLATION_FILTER_BILINEAR".enum,
        "VP9_INTERPOLATION_FILTER_SWITCHABLE".enum,
        "VP9_INTERPOLATION_FILTER_INVALID".enum(0x7FFFFFFF)
    )

    EnumConstant(
        "VP9_COLOR_SPACE_UNKNOWN".enum("0"),
        "VP9_COLOR_SPACE_BT_601".enum,
        "VP9_COLOR_SPACE_BT_709".enum,
        "VP9_COLOR_SPACE_SMPTE_170".enum,
        "VP9_COLOR_SPACE_SMPTE_240".enum,
        "VP9_COLOR_SPACE_BT_2020".enum,
        "VP9_COLOR_SPACE_RESERVED".enum("6"),
        "VP9_COLOR_SPACE_RGB".enum("7"),
        "VP9_COLOR_SPACE_INVALID".enum(0x7FFFFFFF)
    )

    // vulkan_video_codec_h265std_decode.h

    IntConstant(
        "VK_STD_VULKAN_VIDEO_CODEC_VP9_DECODE_SPEC_VERSION".."VK_MAKE_VIDEO_STD_VERSION(1, 0, 0)"
    ).noPrefix()

    StringConstant(
        "VK_STD_VULKAN_VIDEO_CODEC_VP9_DECODE_EXTENSION_NAME".."VK_STD_vulkan_video_codec_vp9_decode"
    ).noPrefix()

}