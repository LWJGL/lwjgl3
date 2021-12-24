/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val STD_vulkan_video_codec_h265 = "STDVulkanVideoCodecH265".nativeClassVK("STD_vulkan_video_codec_h265", prefix = "STD", type = "device", postfix = STD) {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideo.*")

    IntConstant(
        "The extension specification version.",

        "VK_STD_VULKAN_VIDEO_CODEC_H265_SPEC_VERSION".."VK_MAKE_VIDEO_STD_VERSION(0, 9, 5)"
    ).noPrefix()

    StringConstant(
        "The extension name.",

        "VK_STD_VULKAN_VIDEO_CODEC_H265_EXTENSION_NAME".."VK_STD_vulkan_video_codec_h265"
    ).noPrefix()

    IntConstant(
        "",

        "VIDEO_H265_SUBLAYERS_MINUS1_LIST_SIZE".."7",
        "VIDEO_H265_CPB_CNT_LIST_SIZE".."32",
        "VIDEO_H265_SCALING_LIST_4X4_NUM_LISTS".."6",
        "VIDEO_H265_SCALING_LIST_4X4_NUM_ELEMENTS".."16",
        "VIDEO_H265_SCALING_LIST_8X8_NUM_LISTS".."6",
        "VIDEO_H265_SCALING_LIST_8X8_NUM_ELEMENTS".."64",
        "VIDEO_H265_SCALING_LIST_16X16_NUM_LISTS".."6",
        "VIDEO_H265_SCALING_LIST_16X16_NUM_ELEMENTS".."64",
        "VIDEO_H265_SCALING_LIST_32X32_NUM_LISTS".."2",
        "VIDEO_H265_SCALING_LIST_32X32_NUM_ELEMENTS".."64",
        "VIDEO_H265_PREDICTOR_PALETTE_COMPONENTS_LIST_SIZE".."3",
        "VIDEO_H265_PREDICTOR_PALETTE_COMP_ENTRIES_LIST_SIZE".."128",
        "VIDEO_H265_CHROMA_QP_OFFSET_TILE_COLS_LIST_SIZE".."19",
        "VIDEO_H265_CHROMA_QP_OFFSET_TILE_ROWS_LIST_SIZE".."21",
        "VIDEO_H265_CHROMA_QP_OFFSET_LIST_SIZE".."6",
    )

    EnumConstant(
        "{@code StdVideoH265ChromaFormatIdc}",

        "VIDEO_H265_CHROMA_FORMAT_IDC_MONOCHROME".enum("", "0"),
        "VIDEO_H265_CHROMA_FORMAT_IDC_420".enum,
        "VIDEO_H265_CHROMA_FORMAT_IDC_422".enum,
        "VIDEO_H265_CHROMA_FORMAT_IDC_444".enum,
        "VIDEO_H265_CHROMA_FORMAT_IDC_INVALID".enum("", 0x7FFFFFFF)
    )

    EnumConstant(
        "{@code StdVideoH265ProfileIdc}",

        "VIDEO_H265_PROFILE_IDC_MAIN".enum("", "1"),
        "VIDEO_H265_PROFILE_IDC_MAIN_10".enum,
        "VIDEO_H265_PROFILE_IDC_MAIN_STILL_PICTURE".enum,
        "VIDEO_H265_PROFILE_IDC_FORMAT_RANGE_EXTENSIONS".enum,
        "VIDEO_H265_PROFILE_IDC_SCC_EXTENSIONS".enum("", "9"),
        "VIDEO_H265_PROFILE_IDC_INVALID".enum("", 0x7FFFFFFF)
    )

    EnumConstant(
        "{@code StdVideoH265Level}",

        "VIDEO_H265_LEVEL_1_0".enum("", "0"),
        "VIDEO_H265_LEVEL_2_0".enum,
        "VIDEO_H265_LEVEL_2_1".enum,
        "VIDEO_H265_LEVEL_3_0".enum,
        "VIDEO_H265_LEVEL_3_1".enum,
        "VIDEO_H265_LEVEL_4_0".enum,
        "VIDEO_H265_LEVEL_4_1".enum,
        "VIDEO_H265_LEVEL_5_0".enum,
        "VIDEO_H265_LEVEL_5_1".enum,
        "VIDEO_H265_LEVEL_5_2".enum,
        "VIDEO_H265_LEVEL_6_0".enum,
        "VIDEO_H265_LEVEL_6_1".enum,
        "VIDEO_H265_LEVEL_6_2".enum,
        "VIDEO_H265_LEVEL_INVALID".enum("", 0x7FFFFFFF)
    )

    EnumConstant(
        "{@code StdVideoH265SliceType}",

        "VIDEO_H265_SLICE_TYPE_B".enum("", "0"),
        "VIDEO_H265_SLICE_TYPE_P".enum,
        "VIDEO_H265_SLICE_TYPE_I".enum,
        "VIDEO_H265_SLICE_TYPE_INVALID".enum("", 0x7FFFFFFF)
    )

    EnumConstant(
        "{@code StdVideoH265PictureType}",

        "VIDEO_H265_PICTURE_TYPE_P".enum("", "0"),
        "VIDEO_H265_PICTURE_TYPE_B".enum,
        "VIDEO_H265_PICTURE_TYPE_I".enum,
        "VIDEO_H265_PICTURE_TYPE_IDR".enum,
        "VIDEO_H265_PICTURE_TYPE_INVALID".enum("", 0x7FFFFFFF)
    )

    // vulkan_video_codec_h265std_decode.h

    IntConstant(
        "",

        "VIDEO_DECODE_H265_REF_PIC_SET_LIST_SIZE".."8"
    )

    // vulkan_video_code_h265std_encode.h

    IntConstant(
        "",

        "VIDEO_ENCODE_H265_LUMA_LIST_SIZE".."15",
        "VIDEO_ENCODE_H265_CHROMA_LIST_SIZE".."15",
        "VIDEO_ENCODE_H265_CHROMA_LISTS_NUM".."2"
    )
}