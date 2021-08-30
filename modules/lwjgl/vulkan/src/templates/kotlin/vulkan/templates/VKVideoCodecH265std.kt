/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val STD_vulkan_video_codec_h265 = "STDVulkanVideoCodecH265".nativeClassVK("STD_vulkan_video_codec_h265", type = "device", postfix = STD) {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideo.*")

    IntConstant(
        "The extension specification version.",

        "STD_VULKAN_VIDEO_CODEC_H265_SPEC_VERSION".."VK_MAKE_VIDEO_STD_VERSION(0, 5, 0)"
    )

    StringConstant(
        "The extension name.",

        "STD_VULKAN_VIDEO_CODEC_H265_EXTENSION_NAME".."VK_STD_vulkan_video_codec_h265"
    )

    EnumConstant(
        "{@code StdVideoH265ChromaFormatIdc}",

        "std_video_h265_chroma_format_idc_monochrome".enum("", "0"),
        "std_video_h265_chroma_format_idc_420".enum,
        "std_video_h265_chroma_format_idc_422".enum,
        "std_video_h265_chroma_format_idc_444".enum
    ).noPrefix()

    EnumConstant(
        "{@code StdVideoH265ProfileIdc}",

        "std_video_h265_profile_idc_main".enum("", "1"),
        "std_video_h265_profile_idc_main_10".enum,
        "std_video_h265_profile_idc_main_still_picture".enum,
        "std_video_h265_profile_idc_format_range_extensions".enum,
        "std_video_h265_profile_idc_scc_extensions".enum("", "9"),
        "std_video_h265_profile_idc_invalid".enum("", 0x7FFFFFFF)
    ).noPrefix()

    EnumConstant(
        "{@code StdVideoH265Level}",

        "std_video_h265_level_1_0".enum("", "0"),
        "std_video_h265_level_2_0".enum,
        "std_video_h265_level_2_1".enum,
        "std_video_h265_level_3_0".enum,
        "std_video_h265_level_3_1".enum,
        "std_video_h265_level_4_0".enum,
        "std_video_h265_level_4_1".enum,
        "std_video_h265_level_5_0".enum,
        "std_video_h265_level_5_1".enum,
        "std_video_h265_level_5_2".enum,
        "std_video_h265_level_6_0".enum,
        "std_video_h265_level_6_1".enum,
        "std_video_h265_level_6_2".enum,
        "std_video_h265_level_invalid".enum("", 0x7FFFFFFF)
    ).noPrefix()
}