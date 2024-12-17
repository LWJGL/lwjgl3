/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val STD_vulkan_video_codec_av1 = "STDVulkanVideoCodecAV1".nativeClassVK("STD_vulkan_video_codec_av1", prefix = "STD_VIDEO", type = "device", postfix = STD) {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideo.*")

    IntConstant(
        "AV1_NUM_REF_FRAMES".."8",
        "AV1_REFS_PER_FRAME".."7",
        "AV1_TOTAL_REFS_PER_FRAME".."8",
        "AV1_MAX_TILE_COLS".."64",
        "AV1_MAX_TILE_ROWS".."64",
        "AV1_MAX_SEGMENTS".."8",
        "AV1_SEG_LVL_MAX".."8",
        "AV1_PRIMARY_REF_NONE".."7",
        "AV1_SELECT_INTEGER_MV".."2",
        "AV1_SELECT_SCREEN_CONTENT_TOOLS".."2",
        "AV1_SKIP_MODE_FRAMES".."2",
        "AV1_MAX_LOOP_FILTER_STRENGTHS".."4",
        "AV1_LOOP_FILTER_ADJUSTMENTS".."2",
        "AV1_MAX_CDEF_FILTER_STRENGTHS".."8",
        "AV1_MAX_NUM_PLANES".."3",
        "AV1_GLOBAL_MOTION_PARAMS".."6",
        "AV1_MAX_NUM_Y_POINTS".."14",
        "AV1_MAX_NUM_CB_POINTS".."10",
        "AV1_MAX_NUM_CR_POINTS".."10",
        "AV1_MAX_NUM_POS_LUMA".."24",
        "AV1_MAX_NUM_POS_CHROMA".."25"
    )

    EnumConstant(
        "AV1_PROFILE_MAIN".enum("0"),
        "AV1_PROFILE_HIGH".enum,
        "AV1_PROFILE_PROFESSIONAL".enum,
        "AV1_PROFILE_INVALID".enum(0x7FFFFFFF)
    )

    EnumConstant(
        "AV1_LEVEL_2_0".enum("0"),
        "AV1_LEVEL_2_1".enum,
        "AV1_LEVEL_2_2".enum,
        "AV1_LEVEL_2_3".enum,
        "AV1_LEVEL_3_0".enum,
        "AV1_LEVEL_3_1".enum,
        "AV1_LEVEL_3_2".enum,
        "AV1_LEVEL_3_3".enum,
        "AV1_LEVEL_4_0".enum,
        "AV1_LEVEL_4_1".enum,
        "AV1_LEVEL_4_2".enum,
        "AV1_LEVEL_4_3".enum,
        "AV1_LEVEL_5_0".enum,
        "AV1_LEVEL_5_1".enum,
        "AV1_LEVEL_5_2".enum,
        "AV1_LEVEL_5_3".enum,
        "AV1_LEVEL_6_0".enum,
        "AV1_LEVEL_6_1".enum,
        "AV1_LEVEL_6_2".enum,
        "AV1_LEVEL_6_3".enum,
        "AV1_LEVEL_7_0".enum,
        "AV1_LEVEL_7_1".enum,
        "AV1_LEVEL_7_2".enum,
        "AV1_LEVEL_7_3".enum,
        "AV1_LEVEL_INVALID".enum(0x7FFFFFFF)
    )

    EnumConstant(
        "AV1_FRAME_TYPE_KEY".enum("0"),
        "AV1_FRAME_TYPE_INTER".enum,
        "AV1_FRAME_TYPE_INTRA_ONLY".enum,
        "AV1_FRAME_TYPE_SWITCH".enum,
        "AV1_FRAME_TYPE_INVALID".enum(0x7FFFFFFF)
    )

    EnumConstant(
        "AV1_REFERENCE_NAME_INTRA_FRAME".enum("0"),
        "AV1_REFERENCE_NAME_LAST_FRAME".enum,
        "AV1_REFERENCE_NAME_LAST2_FRAME".enum,
        "AV1_REFERENCE_NAME_LAST3_FRAME".enum,
        "AV1_REFERENCE_NAME_GOLDEN_FRAME".enum,
        "AV1_REFERENCE_NAME_BWDREF_FRAME".enum,
        "AV1_REFERENCE_NAME_ALTREF2_FRAME".enum,
        "AV1_REFERENCE_NAME_ALTREF_FRAME".enum,
        "AV1_REFERENCE_NAME_INVALID".enum(0x7FFFFFFF)
    )

    EnumConstant(
        "AV1_INTERPOLATION_FILTER_EIGHTTAP".enum("0"),
        "AV1_INTERPOLATION_FILTER_EIGHTTAP_SMOOTH".enum,
        "AV1_INTERPOLATION_FILTER_EIGHTTAP_SHARP".enum,
        "AV1_INTERPOLATION_FILTER_BILINEAR".enum,
        "AV1_INTERPOLATION_FILTER_SWITCHABLE".enum,
        "AV1_INTERPOLATION_FILTER_INVALID".enum(0x7FFFFFFF)
    )

    EnumConstant(
        "AV1_TX_MODE_ONLY_4X4".enum("0"),
        "AV1_TX_MODE_LARGEST".enum,
        "AV1_TX_MODE_SELECT".enum,
        "AV1_TX_MODE_INVALID".enum(0x7FFFFFFF)
    )

    EnumConstant(
        "AV1_FRAME_RESTORATION_TYPE_NONE".enum("0"),
        "AV1_FRAME_RESTORATION_TYPE_WIENER".enum,
        "AV1_FRAME_RESTORATION_TYPE_SGRPROJ".enum,
        "AV1_FRAME_RESTORATION_TYPE_SWITCHABLE".enum,
        "AV1_FRAME_RESTORATION_TYPE_INVALID".enum(0x7FFFFFFF)
    )

    EnumConstant(
        "AV1_COLOR_PRIMARIES_BT_709".enum("1"),
        "AV1_COLOR_PRIMARIES_UNSPECIFIED".enum,
        "AV1_COLOR_PRIMARIES_BT_470_M".enum,
        "AV1_COLOR_PRIMARIES_BT_470_B_G".enum,
        "AV1_COLOR_PRIMARIES_BT_601".enum,
        "AV1_COLOR_PRIMARIES_SMPTE_240".enum,
        "AV1_COLOR_PRIMARIES_GENERIC_FILM".enum,
        "AV1_COLOR_PRIMARIES_BT_2020".enum,
        "AV1_COLOR_PRIMARIES_XYZ".enum,
        "AV1_COLOR_PRIMARIES_SMPTE_431".enum,
        "AV1_COLOR_PRIMARIES_SMPTE_432".enum,
        "AV1_COLOR_PRIMARIES_EBU_3213".enum,
        "AV1_COLOR_PRIMARIES_INVALID".enum(0x7FFFFFFF)
    )

    EnumConstant(
        "AV1_TRANSFER_CHARACTERISTICS_RESERVED_0".enum("0"),
        "AV1_TRANSFER_CHARACTERISTICS_BT_709".enum,
        "AV1_TRANSFER_CHARACTERISTICS_UNSPECIFIED".enum,
        "AV1_TRANSFER_CHARACTERISTICS_RESERVED_3".enum,
        "AV1_TRANSFER_CHARACTERISTICS_BT_470_M".enum,
        "AV1_TRANSFER_CHARACTERISTICS_BT_470_B_G".enum,
        "AV1_TRANSFER_CHARACTERISTICS_BT_601".enum,
        "AV1_TRANSFER_CHARACTERISTICS_SMPTE_240".enum,
        "AV1_TRANSFER_CHARACTERISTICS_LINEAR".enum,
        "AV1_TRANSFER_CHARACTERISTICS_LOG_100".enum,
        "AV1_TRANSFER_CHARACTERISTICS_LOG_100_SQRT10".enum,
        "AV1_TRANSFER_CHARACTERISTICS_IEC_61966".enum,
        "AV1_TRANSFER_CHARACTERISTICS_BT_1361".enum,
        "AV1_TRANSFER_CHARACTERISTICS_SRGB".enum,
        "AV1_TRANSFER_CHARACTERISTICS_BT_2020_10_BIT".enum,
        "AV1_TRANSFER_CHARACTERISTICS_BT_2020_12_BIT".enum,
        "AV1_TRANSFER_CHARACTERISTICS_SMPTE_2084".enum,
        "AV1_TRANSFER_CHARACTERISTICS_SMPTE_428".enum,
        "AV1_TRANSFER_CHARACTERISTICS_HLG".enum,
        "AV1_TRANSFER_CHARACTERISTICS_INVALID".enum(0x7FFFFFFF)
    )

    EnumConstant(
        "AV1_MATRIX_COEFFICIENTS_IDENTITY".enum("0"),
        "AV1_MATRIX_COEFFICIENTS_BT_709".enum,
        "AV1_MATRIX_COEFFICIENTS_UNSPECIFIED".enum,
        "AV1_MATRIX_COEFFICIENTS_RESERVED_3".enum,
        "AV1_MATRIX_COEFFICIENTS_FCC".enum,
        "AV1_MATRIX_COEFFICIENTS_BT_470_B_G".enum,
        "AV1_MATRIX_COEFFICIENTS_BT_601".enum,
        "AV1_MATRIX_COEFFICIENTS_SMPTE_240".enum,
        "AV1_MATRIX_COEFFICIENTS_SMPTE_YCGCO".enum,
        "AV1_MATRIX_COEFFICIENTS_BT_2020_NCL".enum,
        "AV1_MATRIX_COEFFICIENTS_BT_2020_CL".enum,
        "AV1_MATRIX_COEFFICIENTS_SMPTE_2085".enum,
        "AV1_MATRIX_COEFFICIENTS_CHROMAT_NCL".enum,
        "AV1_MATRIX_COEFFICIENTS_CHROMAT_CL".enum,
        "AV1_MATRIX_COEFFICIENTS_ICTCP".enum,
        "AV1_MATRIX_COEFFICIENTS_INVALID".enum(0x7FFFFFFF)
    )

    EnumConstant(
        "AV1_CHROMA_SAMPLE_POSITION_UNKNOWN".enum("0"),
        "AV1_CHROMA_SAMPLE_POSITION_VERTICAL".enum,
        "AV1_CHROMA_SAMPLE_POSITION_COLOCATED".enum,
        "AV1_CHROMA_SAMPLE_POSITION_RESERVED".enum,
        "AV1_CHROMA_SAMPLE_POSITION_INVALID".enum(0x7FFFFFFF)
    )

    // vulkan_video_codec_av1std_decode.h

    IntConstant(
        "VK_STD_VULKAN_VIDEO_CODEC_AV1_DECODE_SPEC_VERSION".."VK_MAKE_VIDEO_STD_VERSION(1, 0, 0)"
    ).noPrefix()

    StringConstant(
        "VK_STD_VULKAN_VIDEO_CODEC_AV1_DECODE_EXTENSION_NAME".."VK_STD_vulkan_video_codec_av1_decode"
    ).noPrefix()
}