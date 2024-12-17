/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_video_decode_h265 = "KHRVideoDecodeH265".nativeClassVK("KHR_video_decode_h265", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_VIDEO_DECODE_H265_SPEC_VERSION".."8"
    )

    StringConstant(
        "KHR_VIDEO_DECODE_H265_EXTENSION_NAME".."VK_KHR_video_decode_h265"
    )

    EnumConstant(
        "STRUCTURE_TYPE_VIDEO_DECODE_H265_CAPABILITIES_KHR".."1000187000",
        "STRUCTURE_TYPE_VIDEO_DECODE_H265_SESSION_PARAMETERS_CREATE_INFO_KHR".."1000187001",
        "STRUCTURE_TYPE_VIDEO_DECODE_H265_SESSION_PARAMETERS_ADD_INFO_KHR".."1000187002",
        "STRUCTURE_TYPE_VIDEO_DECODE_H265_PROFILE_INFO_KHR".."1000187003",
        "STRUCTURE_TYPE_VIDEO_DECODE_H265_PICTURE_INFO_KHR".."1000187004",
        "STRUCTURE_TYPE_VIDEO_DECODE_H265_DPB_SLOT_INFO_KHR".."1000187005"
    )

    EnumConstant(
        "VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR".enum(0x00000002)
    )
}