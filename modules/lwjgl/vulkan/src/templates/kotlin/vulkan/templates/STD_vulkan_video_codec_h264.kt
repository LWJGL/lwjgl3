/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val STD_vulkan_video_codec_h264 = "STDVulkanVideoCodecH264".nativeClassVK("STD_vulkan_video_codec_h264", prefix = "STD_VIDEO", type = "device", postfix = STD) {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideo.*")

    IntConstant(
        "H264_CPB_CNT_LIST_SIZE".."32",
        "H264_SCALING_LIST_4X4_NUM_LISTS".."6",
        "H264_SCALING_LIST_4X4_NUM_ELEMENTS".."16",
        "H264_SCALING_LIST_8X8_NUM_LISTS".."6",
        "H264_SCALING_LIST_8X8_NUM_ELEMENTS".."64",
        "H264_MAX_NUM_LIST_REF".."32",
        "H264_MAX_CHROMA_PLANES".."2",
        "H264_NO_REFERENCE_PICTURE".."0xFF"
    )

    EnumConstant(
        "H264_CHROMA_FORMAT_IDC_MONOCHROME".enum("0"),
        "H264_CHROMA_FORMAT_IDC_420".enum,
        "H264_CHROMA_FORMAT_IDC_422".enum,
        "H264_CHROMA_FORMAT_IDC_444".enum,
        "H264_CHROMA_FORMAT_IDC_INVALID".enum(0x7FFFFFFF)
    )

    EnumConstant(
        "H264_PROFILE_IDC_BASELINE".enum("66"),
        "H264_PROFILE_IDC_MAIN".enum("77"),
        "H264_PROFILE_IDC_HIGH".enum("100"),
        "H264_PROFILE_IDC_HIGH_444_PREDICTIVE".enum("244"),
        "H264_PROFILE_IDC_INVALID".enum(0x7FFFFFFF)
    )

    EnumConstant(
        "H264_LEVEL_IDC_1_0".enum("0"),
        "H264_LEVEL_IDC_1_1".enum,
        "H264_LEVEL_IDC_1_2".enum,
        "H264_LEVEL_IDC_1_3".enum,
        "H264_LEVEL_IDC_2_0".enum,
        "H264_LEVEL_IDC_2_1".enum,
        "H264_LEVEL_IDC_2_2".enum,
        "H264_LEVEL_IDC_3_0".enum,
        "H264_LEVEL_IDC_3_1".enum,
        "H264_LEVEL_IDC_3_2".enum,
        "H264_LEVEL_IDC_4_0".enum,
        "H264_LEVEL_IDC_4_1".enum,
        "H264_LEVEL_IDC_4_2".enum,
        "H264_LEVEL_IDC_5_0".enum,
        "H264_LEVEL_IDC_5_1".enum,
        "H264_LEVEL_IDC_5_2".enum,
        "H264_LEVEL_IDC_6_0".enum,
        "H264_LEVEL_IDC_6_1".enum,
        "H264_LEVEL_IDC_6_2".enum,
        "H264_LEVEL_IDC_INVALID".enum(0x7FFFFFFF)
    )

    EnumConstant(
        "H264_POC_TYPE_0".enum("0"),
        "H264_POC_TYPE_1".enum,
        "H264_POC_TYPE_2".enum,
        "H264_POC_TYPE_INVALID".enum(0x7FFFFFFF)
    )

    EnumConstant(
        "H264_ASPECT_RATIO_IDC_UNSPECIFIED".enum("0"),
        "H264_ASPECT_RATIO_IDC_SQUARE".enum,
        "H264_ASPECT_RATIO_IDC_12_11".enum,
        "H264_ASPECT_RATIO_IDC_10_11".enum,
        "H264_ASPECT_RATIO_IDC_16_11".enum,
        "H264_ASPECT_RATIO_IDC_40_33".enum,
        "H264_ASPECT_RATIO_IDC_24_11".enum,
        "H264_ASPECT_RATIO_IDC_20_11".enum,
        "H264_ASPECT_RATIO_IDC_32_11".enum,
        "H264_ASPECT_RATIO_IDC_80_33".enum,
        "H264_ASPECT_RATIO_IDC_18_11".enum,
        "H264_ASPECT_RATIO_IDC_15_11".enum,
        "H264_ASPECT_RATIO_IDC_64_33".enum,
        "H264_ASPECT_RATIO_IDC_160_99".enum,
        "H264_ASPECT_RATIO_IDC_4_3".enum,
        "H264_ASPECT_RATIO_IDC_3_2".enum,
        "H264_ASPECT_RATIO_IDC_2_1".enum,
        "H264_ASPECT_RATIO_IDC_EXTENDED_SAR".enum("255"),
        "H264_ASPECT_RATIO_IDC_INVALID".enum(0x7FFFFFFF)
    )

    EnumConstant(
        "H264_WEIGHTED_BIPRED_IDC_DEFAULT".enum("0"),
        "H264_WEIGHTED_BIPRED_IDC_EXPLICIT".enum,
        "H264_WEIGHTED_BIPRED_IDC_IMPLICIT".enum,
        "H264_WEIGHTED_BIPRED_IDC_INVALID".enum(0x7FFFFFFF)
    )

    EnumConstant(
        "H264_MODIFICATION_OF_PIC_NUMS_IDC_SHORT_TERM_SUBTRACT".enum("0"),
        "H264_MODIFICATION_OF_PIC_NUMS_IDC_SHORT_TERM_ADD".enum,
        "H264_MODIFICATION_OF_PIC_NUMS_IDC_LONG_TERM".enum,
        "H264_MODIFICATION_OF_PIC_NUMS_IDC_END".enum,
        "H264_MODIFICATION_OF_PIC_NUMS_IDC_INVALID".enum(0x7FFFFFFF)
    )

    EnumConstant(
        "H264_MEM_MGMT_CONTROL_OP_END".enum("0"),
        "H264_MEM_MGMT_CONTROL_OP_UNMARK_SHORT_TERM".enum,
        "H264_MEM_MGMT_CONTROL_OP_UNMARK_LONG_TERM".enum,
        "H264_MEM_MGMT_CONTROL_OP_MARK_LONG_TERM".enum,
        "H264_MEM_MGMT_CONTROL_OP_SET_MAX_LONG_TERM_INDEX".enum,
        "H264_MEM_MGMT_CONTROL_OP_UNMARK_ALL".enum,
        "H264_MEM_MGMT_CONTROL_OP_MARK_CURRENT_AS_LONG_TERM".enum,
        "H264_MEM_MGMT_CONTROL_OP_INVALID".enum(0x7FFFFFFF)
    )

    EnumConstant(
        "H264_CABAC_INIT_IDC_0".enum("0"),
        "H264_CABAC_INIT_IDC_1".enum,
        "H264_CABAC_INIT_IDC_2".enum,
        "H264_CABAC_INIT_IDC_INVALID".enum(0x7FFFFFFF)
    )

    EnumConstant(
        "H264_DISABLE_DEBLOCKING_FILTER_IDC_DISABLED".enum("0"),
        "H264_DISABLE_DEBLOCKING_FILTER_IDC_ENABLED".enum,
        "H264_DISABLE_DEBLOCKING_FILTER_IDC_PARTIAL".enum,
        "H264_DISABLE_DEBLOCKING_FILTER_IDC_INVALID".enum(0x7FFFFFFF)
    )

    EnumConstant(
        "H264_SLICE_TYPE_P".enum("0"),
        "H264_SLICE_TYPE_B".enum,
        "H264_SLICE_TYPE_I".enum,
        "H264_SLICE_TYPE_INVALID".enum(0x7FFFFFFF)
    )

    EnumConstant(
        "H264_PICTURE_TYPE_P".enum("0"),
        "H264_PICTURE_TYPE_B".enum,
        "H264_PICTURE_TYPE_I".enum,
        "H264_PICTURE_TYPE_IDR".enum("5"),
        "H264_PICTURE_TYPE_INVALID".enum(0x7FFFFFFF)
    )

    EnumConstant(
        "H264_NON_VCL_NALU_TYPE_SPS".enum("0"),
        "H264_NON_VCL_NALU_TYPE_PPS".enum,
        "H264_NON_VCL_NALU_TYPE_AUD".enum,
        "H264_NON_VCL_NALU_TYPE_PREFIX".enum,
        "H264_NON_VCL_NALU_TYPE_END_OF_SEQUENCE".enum,
        "H264_NON_VCL_NALU_TYPE_END_OF_STREAM".enum,
        "H264_NON_VCL_NALU_TYPE_PRECODED".enum,
        "H264_NON_VCL_NALU_TYPE_INVALID".enum(0x7FFFFFFF)
    )

    // vulkan_video_codec_h264std_decode.h

    IntConstant(
        "VK_STD_VULKAN_VIDEO_CODEC_H264_DECODE_SPEC_VERSION".."VK_MAKE_VIDEO_STD_VERSION(1, 0, 0)"
    ).noPrefix()

    StringConstant(
        "VK_STD_VULKAN_VIDEO_CODEC_H264_DECODE_EXTENSION_NAME".."VK_STD_vulkan_video_codec_h264_decode"
    ).noPrefix()

    IntConstant("DECODE_H264_FIELD_ORDER_COUNT_LIST_SIZE".."2")

    EnumConstant(
        "DECODE_H264_FIELD_ORDER_COUNT_TOP".enum("0"),
        "DECODE_H264_FIELD_ORDER_COUNT_BOTTOM".enum,
        "DECODE_H264_FIELD_ORDER_COUNT_INVALID".enum(0x7FFFFFFF)
    )

    // vulkan_video_codec_h264std_encode.h

    IntConstant(
        "VK_STD_VULKAN_VIDEO_CODEC_H264_ENCODE_SPEC_VERSION".."VK_MAKE_VIDEO_STD_VERSION(1, 0, 0)"
    ).noPrefix()

    StringConstant(
        "VK_STD_VULKAN_VIDEO_CODEC_H264_ENCODE_EXTENSION_NAME".."VK_STD_vulkan_video_codec_h264_encode"
    ).noPrefix()
}