/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val STD_vulkan_video_codec_h265 = "STDVulkanVideoCodecH265".nativeClassVK("STD_vulkan_video_codec_h265", prefix = "STD_VIDEO", type = "device", postfix = STD) {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideo.*")

    IntConstant(
        "H265_CPB_CNT_LIST_SIZE".."32",
        "H265_SUBLAYERS_LIST_SIZE".."7",
        "H265_SCALING_LIST_4X4_NUM_LISTS".."6",
        "H265_SCALING_LIST_4X4_NUM_ELEMENTS".."16",
        "H265_SCALING_LIST_8X8_NUM_LISTS".."6",
        "H265_SCALING_LIST_8X8_NUM_ELEMENTS".."64",
        "H265_SCALING_LIST_16X16_NUM_LISTS".."6",
        "H265_SCALING_LIST_16X16_NUM_ELEMENTS".."64",
        "H265_SCALING_LIST_32X32_NUM_LISTS".."2",
        "H265_SCALING_LIST_32X32_NUM_ELEMENTS".."64",
        "H265_CHROMA_QP_OFFSET_LIST_SIZE".."6",
        "H265_CHROMA_QP_OFFSET_TILE_COLS_LIST_SIZE".."19",
        "H265_CHROMA_QP_OFFSET_TILE_ROWS_LIST_SIZE".."21",
        "H265_PREDICTOR_PALETTE_COMPONENTS_LIST_SIZE".."3",
        "H265_PREDICTOR_PALETTE_COMP_ENTRIES_LIST_SIZE".."128",
        "H265_MAX_NUM_LIST_REF".."15",
        "H265_MAX_CHROMA_PLANES".."2",
        "H265_MAX_SHORT_TERM_REF_PIC_SETS".."64",
        "H265_MAX_DPB_SIZE".."16",
        "H265_MAX_LONG_TERM_REF_PICS_SPS".."32",
        "H265_MAX_LONG_TERM_PICS".."16",
        "H265_MAX_DELTA_POC".."48",
        "H265_NO_REFERENCE_PICTURE".."0xFF"
    )

    EnumConstant(
        "H265_CHROMA_FORMAT_IDC_MONOCHROME".enum("0"),
        "H265_CHROMA_FORMAT_IDC_420".enum,
        "H265_CHROMA_FORMAT_IDC_422".enum,
        "H265_CHROMA_FORMAT_IDC_444".enum,
        "H265_CHROMA_FORMAT_IDC_INVALID".enum(0x7FFFFFFF)
    )

    EnumConstant(
        "H265_PROFILE_IDC_MAIN".enum("1"),
        "H265_PROFILE_IDC_MAIN_10".enum,
        "H265_PROFILE_IDC_MAIN_STILL_PICTURE".enum,
        "H265_PROFILE_IDC_FORMAT_RANGE_EXTENSIONS".enum,
        "H265_PROFILE_IDC_SCC_EXTENSIONS".enum("9"),
        "H265_PROFILE_IDC_INVALID".enum(0x7FFFFFFF)
    )

    EnumConstant(
        "H264_LEVEL_IDC_1_0".enum("0"),
        "H264_LEVEL_IDC_2_0".enum,
        "H264_LEVEL_IDC_2_1".enum,
        "H264_LEVEL_IDC_3_0".enum,
        "H264_LEVEL_IDC_3_1".enum,
        "H264_LEVEL_IDC_4_0".enum,
        "H264_LEVEL_IDC_4_1".enum,
        "H264_LEVEL_IDC_5_0".enum,
        "H264_LEVEL_IDC_5_1".enum,
        "H264_LEVEL_IDC_5_2".enum,
        "H264_LEVEL_IDC_6_0".enum,
        "H264_LEVEL_IDC_6_1".enum,
        "H264_LEVEL_IDC_6_2".enum,
        "H264_LEVEL_IDC_INVALID".enum(0x7FFFFFFF)
    )

    EnumConstant(
        "H265_SLICE_TYPE_B".enum("0"),
        "H265_SLICE_TYPE_P".enum,
        "H265_SLICE_TYPE_I".enum,
        "H265_SLICE_TYPE_INVALID".enum(0x7FFFFFFF)
    )

    EnumConstant(
        "H265_PICTURE_TYPE_P".enum("0"),
        "H265_PICTURE_TYPE_B".enum,
        "H265_PICTURE_TYPE_I".enum,
        "H265_PICTURE_TYPE_IDR".enum,
        "H265_PICTURE_TYPE_INVALID".enum(0x7FFFFFFF)
    )

    EnumConstant(
        "H265_ASPECT_RATIO_IDC_UNSPECIFIED".enum("0"),
        "H265_ASPECT_RATIO_IDC_SQUARE".enum,
        "H265_ASPECT_RATIO_IDC_12_11".enum,
        "H265_ASPECT_RATIO_IDC_10_11".enum,
        "H265_ASPECT_RATIO_IDC_16_11".enum,
        "H265_ASPECT_RATIO_IDC_40_33".enum,
        "H265_ASPECT_RATIO_IDC_24_11".enum,
        "H265_ASPECT_RATIO_IDC_20_11".enum,
        "H265_ASPECT_RATIO_IDC_32_11".enum,
        "H265_ASPECT_RATIO_IDC_80_33".enum,
        "H265_ASPECT_RATIO_IDC_18_11".enum,
        "H265_ASPECT_RATIO_IDC_15_11".enum,
        "H265_ASPECT_RATIO_IDC_64_33".enum,
        "H265_ASPECT_RATIO_IDC_160_99".enum,
        "H265_ASPECT_RATIO_IDC_4_3".enum,
        "H265_ASPECT_RATIO_IDC_3_2".enum,
        "H265_ASPECT_RATIO_IDC_2_1".enum,
        "H265_ASPECT_RATIO_IDC_EXTENDED_SAR".enum("255"),
        "H265_ASPECT_RATIO_IDC_INVALID".enum(0x7FFFFFFF)
    )

    // vulkan_video_codec_h265std_decode.h

    IntConstant(
        "VK_STD_VULKAN_VIDEO_CODEC_H265_DECODE_SPEC_VERSION".."VK_MAKE_VIDEO_STD_VERSION(1, 0, 0)"
    ).noPrefix()

    StringConstant(
        "VK_STD_VULKAN_VIDEO_CODEC_H265_DECODE_EXTENSION_NAME".."VK_STD_vulkan_video_codec_h265_decode"
    ).noPrefix()

    IntConstant(
        "DECODE_H265_REF_PIC_SET_LIST_SIZE".."8"
    )

    // vulkan_video_code_h265std_encode.h

    IntConstant(
        "VK_STD_VULKAN_VIDEO_CODEC_H265_ENCODE_SPEC_VERSION".."VK_MAKE_VIDEO_STD_VERSION(1, 0, 0)"
    ).noPrefix()

    StringConstant(
        "VK_STD_VULKAN_VIDEO_CODEC_H265_ENCODE_EXTENSION_NAME".."VK_STD_vulkan_video_codec_h265_encode"
    ).noPrefix()

    IntConstant(
        "ENCODE_H265_LUMA_LIST_SIZE".."15",
        "ENCODE_H265_CHROMA_LIST_SIZE".."15",
        "ENCODE_H265_CHROMA_LISTS_NUM".."2"
    )
}