/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val STD_vulkan_video_codec_h264 = "STDVulkanVideoCodecH264".nativeClassVK("STD_vulkan_video_codec_h264", prefix = "STD", type = "device", postfix = STD) {
    subpackage = "video"
    javaImport("static org.lwjgl.vulkan.video.STDVulkanVideo.*")

    IntConstant(
        "The extension specification version.",

        "VK_STD_VULKAN_VIDEO_CODEC_H264_SPEC_VERSION".."VK_MAKE_VIDEO_STD_VERSION(0, 9, 5)"
    ).noPrefix()

    StringConstant(
        "The extension name.",

        "VK_STD_VULKAN_VIDEO_CODEC_H264_EXTENSION_NAME".."VK_STD_vulkan_video_codec_h264"
    ).noPrefix()

    IntConstant(
        "",

        "VIDEO_H264_CPB_CNT_LIST_SIZE".."32",
        "VIDEO_H264_SCALING_LIST_4X4_NUM_LISTS".."6",
        "VIDEO_H264_SCALING_LIST_4X4_NUM_ELEMENTS".."16",
        "VIDEO_H264_SCALING_LIST_8X8_NUM_LISTS".."2",
        "VIDEO_H264_SCALING_LIST_8X8_NUM_ELEMENTS".."64"
    )

    EnumConstant(
        "{@code StdVideoH264ChromaFormatIdc}",

        "VIDEO_H264_CHROMA_FORMAT_IDC_MONOCHROME".enum("", "0"),
        "VIDEO_H264_CHROMA_FORMAT_IDC_420".enum,
        "VIDEO_H264_CHROMA_FORMAT_IDC_422".enum,
        "VIDEO_H264_CHROMA_FORMAT_IDC_444".enum,
        "VIDEO_H264_CHROMA_FORMAT_IDC_INVALID".enum("", 0x7FFFFFFF)
    )

    EnumConstant(
        "{@code StdVideoH264ProfileIdc}",

        "VIDEO_H264_PROFILE_IDC_BASELINE".enum("Only constrained baseSTline is supported", "66"),
        "VIDEO_H264_PROFILE_IDC_MAIN".enum("", "77"),
        "VIDEO_H264_PROFILE_IDC_HIGH".enum("", "100"),
        "VIDEO_H264_PROFILE_IDC_HIGH_444_PREDICTIVE".enum("", "244"),
        "VIDEO_H264_PROFILE_IDC_INVALID".enum("", 0x7FFFFFFF)
    )

    EnumConstant(
        "{@code StdVideoH264Level}",

        "VIDEO_H264_LEVEL_1_0".enum("", "0"),
        "VIDEO_H264_LEVEL_1_1".enum,
        "VIDEO_H264_LEVEL_1_2".enum,
        "VIDEO_H264_LEVEL_1_3".enum,
        "VIDEO_H264_LEVEL_2_0".enum,
        "VIDEO_H264_LEVEL_2_1".enum,
        "VIDEO_H264_LEVEL_2_2".enum,
        "VIDEO_H264_LEVEL_3_0".enum,
        "VIDEO_H264_LEVEL_3_1".enum,
        "VIDEO_H264_LEVEL_3_2".enum,
        "VIDEO_H264_LEVEL_4_0".enum,
        "VIDEO_H264_LEVEL_4_1".enum,
        "VIDEO_H264_LEVEL_4_2".enum,
        "VIDEO_H264_LEVEL_5_0".enum,
        "VIDEO_H264_LEVEL_5_1".enum,
        "VIDEO_H264_LEVEL_5_2".enum,
        "VIDEO_H264_LEVEL_6_0".enum,
        "VIDEO_H264_LEVEL_6_1".enum,
        "VIDEO_H264_LEVEL_6_2".enum,
        "VIDEO_H264_LEVEL_INVALID".enum("", 0x7FFFFFFF)
    )

    EnumConstant(
        "{@code StdVideoH264PocType}",

        "VIDEO_H264_POC_TYPE_0".enum("", "0"),
        "VIDEO_H264_POC_TYPE_1".enum,
        "VIDEO_H264_POC_TYPE_2".enum,
        "VIDEO_H264_POC_TYPE_INVALID".enum("", 0x7FFFFFFF)
    )

    EnumConstant(
        "{@code StdVideoH264AspectRatioIdc}",

        "VIDEO_H264_ASPECT_RATIO_IDC_UNSPECIFIED".enum("", "0"),
        "VIDEO_H264_ASPECT_RATIO_IDC_SQUARE".enum,
        "VIDEO_H264_ASPECT_RATIO_IDC_12_11".enum,
        "VIDEO_H264_ASPECT_RATIO_IDC_10_11".enum,
        "VIDEO_H264_ASPECT_RATIO_IDC_16_11".enum,
        "VIDEO_H264_ASPECT_RATIO_IDC_40_33".enum,
        "VIDEO_H264_ASPECT_RATIO_IDC_24_11".enum,
        "VIDEO_H264_ASPECT_RATIO_IDC_20_11".enum,
        "VIDEO_H264_ASPECT_RATIO_IDC_32_11".enum,
        "VIDEO_H264_ASPECT_RATIO_IDC_80_33".enum,
        "VIDEO_H264_ASPECT_RATIO_IDC_18_11".enum,
        "VIDEO_H264_ASPECT_RATIO_IDC_15_11".enum,
        "VIDEO_H264_ASPECT_RATIO_IDC_64_33".enum,
        "VIDEO_H264_ASPECT_RATIO_IDC_160_99".enum,
        "VIDEO_H264_ASPECT_RATIO_IDC_4_3".enum,
        "VIDEO_H264_ASPECT_RATIO_IDC_3_2".enum,
        "VIDEO_H264_ASPECT_RATIO_IDC_2_1".enum,
        "VIDEO_H264_ASPECT_RATIO_IDC_EXTENDED_SAR".enum("", "255"),
        "VIDEO_H264_ASPECT_RATIO_IDC_INVALID".enum("", 0x7FFFFFFF)
    )

    EnumConstant(
        "{@code StdVideoH264WeightedBipredIdc}",

        "VIDEO_H264_WEIGHTED_BIPRED_IDC_DEFAULT".enum("", "0"),
        "VIDEO_H264_WEIGHTED_BIPRED_IDC_EXPLICIT".enum,
        "VIDEO_H264_WEIGHTED_BIPRED_IDC_IMPLICIT".enum,
        "VIDEO_H264_WEIGHTED_BIPRED_IDC_INVALID".enum("", 0x7FFFFFFF)
    )

    EnumConstant(
        "{@code StdVideoH264ModificationOfPicNumsIdc}",

        "VIDEO_H264_MODIFICATION_OF_PIC_NUMS_IDC_SHORT_TERM_SUBTRACT".enum("", "0"),
        "VIDEO_H264_MODIFICATION_OF_PIC_NUMS_IDC_SHORT_TERM_ADD".enum,
        "VIDEO_H264_MODIFICATION_OF_PIC_NUMS_IDC_LONG_TERM".enum,
        "VIDEO_H264_MODIFICATION_OF_PIC_NUMS_IDC_END".enum,
        "VIDEO_H264_MODIFICATION_OF_PIC_NUMS_IDC_INVALID".enum("", 0x7FFFFFFF)
    )

    EnumConstant(
        "{@code StdVideoH264MemMgmtControlOp}",

        "VIDEO_H264_MEM_MGMT_CONTROL_OP_END".enum("", "0"),
        "VIDEO_H264_MEM_MGMT_CONTROL_OP_UNMARK_SHORT_TERM".enum,
        "VIDEO_H264_MEM_MGMT_CONTROL_OP_UNMARK_LONG_TERM".enum,
        "VIDEO_H264_MEM_MGMT_CONTROL_OP_MARK_LONG_TERM".enum,
        "VIDEO_H264_MEM_MGMT_CONTROL_OP_SET_MAX_LONG_TERM_INDEX".enum,
        "VIDEO_H264_MEM_MGMT_CONTROL_OP_UNMARK_ALL".enum,
        "VIDEO_H264_MEM_MGMT_CONTROL_OP_MARK_CURRENT_AS_LONG_TERM".enum,
        "VIDEO_H264_MEM_MGMT_CONTROL_OP_INVALID".enum("", 0x7FFFFFFF)
    )

    EnumConstant(
        "{@code StdVideoH264CabacInitIdc}",

        "VIDEO_H264_CABAC_INIT_IDC_0".enum("", "0"),
        "VIDEO_H264_CABAC_INIT_IDC_1".enum,
        "VIDEO_H264_CABAC_INIT_IDC_2".enum,
        "VIDEO_H264_CABAC_INIT_IDC_INVALID".enum("", 0x7FFFFFFF)
    )

    EnumConstant(
        "{@code StdVideoH264DisableDeblockingFilterIdc}",

        "VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_DISABLED".enum("", "0"),
        "VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_ENABLED".enum,
        "VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_PARTIAL".enum,
        "VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_INVALID".enum("", 0x7FFFFFFF)
    )

    EnumConstant(
        "{@code StdVideoH264SliceType}",

        "VIDEO_H264_SLICE_TYPE_P".enum("", "0"),
        "VIDEO_H264_SLICE_TYPE_B".enum,
        "VIDEO_H264_SLICE_TYPE_I".enum,
        "VIDEO_H264_SLICE_TYPE_INVALID".enum("", 0x7FFFFFFF)
    )

    EnumConstant(
        "{@code StdVideoH264PictureType}",

        "VIDEO_H264_PICTURE_TYPE_P".enum("", "0"),
        "VIDEO_H264_PICTURE_TYPE_B".enum,
        "VIDEO_H264_PICTURE_TYPE_I".enum,
        "VIDEO_H264_PICTURE_TYPE_IDR".enum("", "5"),
        "VIDEO_H264_PICTURE_TYPE_INVALID".enum("", 0x7FFFFFFF)
    )

    EnumConstant(
        "{@code StdVideoH264NonVclNaluType}",

        "VIDEO_H264_NON_VCL_NALU_TYPE_SPS".enum("", "0"),
        "VIDEO_H264_NON_VCL_NALU_TYPE_PPS".enum,
        "VIDEO_H264_NON_VCL_NALU_TYPE_AUD".enum,
        "VIDEO_H264_NON_VCL_NALU_TYPE_PREFIX".enum,
        "VIDEO_H264_NON_VCL_NALU_TYPE_END_OF_SEQUENCE".enum,
        "VIDEO_H264_NON_VCL_NALU_TYPE_END_OF_STREAM".enum,
        "VIDEO_H264_NON_VCL_NALU_TYPE_PRECODED".enum,
        "VIDEO_H264_NON_VCL_NALU_TYPE_INVALID".enum("", 0x7FFFFFFF)
    )

    // vulkan_video_codec_h264std_decode.h

    IntConstant("", "VIDEO_DECODE_H264_FIELD_ORDER_COUNT_LIST_SIZE".."2")
    IntConstant("", "VIDEO_DECODE_H264_MVC_REF_LIST_SIZE".."15")

    EnumConstant(
        "{@code StdVideoDecodeH264FieldOrderCount}",

        "VIDEO_DECODE_H264_FIELD_ORDER_COUNT_TOP".enum("", "0"),
        "VIDEO_DECODE_H264_FIELD_ORDER_COUNT_BOTTOM".enum,
        "VIDEO_DECODE_H264_FIELD_ORDER_COUNT_INVALID".enum("", 0x7FFFFFFF)
    )
}