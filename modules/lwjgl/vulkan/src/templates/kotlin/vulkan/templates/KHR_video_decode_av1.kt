/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_video_decode_av1 = "KHRVideoDecodeAV1".nativeClassVK("KHR_video_decode_av1", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_VIDEO_DECODE_AV1_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_VIDEO_DECODE_AV1_EXTENSION_NAME".."VK_KHR_video_decode_av1"
    )

    EnumConstant(
        "STRUCTURE_TYPE_VIDEO_DECODE_AV1_CAPABILITIES_KHR".."1000512000",
        "STRUCTURE_TYPE_VIDEO_DECODE_AV1_PICTURE_INFO_KHR".."1000512001",
        "STRUCTURE_TYPE_VIDEO_DECODE_AV1_PROFILE_INFO_KHR".."1000512003",
        "STRUCTURE_TYPE_VIDEO_DECODE_AV1_SESSION_PARAMETERS_CREATE_INFO_KHR".."1000512004",
        "STRUCTURE_TYPE_VIDEO_DECODE_AV1_DPB_SLOT_INFO_KHR".."1000512005"
    )

    EnumConstant(
        "VIDEO_CODEC_OPERATION_DECODE_AV1_BIT_KHR".enum(0x00000004)
    )

    EnumConstant(
        "MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR".."7"
    )
}