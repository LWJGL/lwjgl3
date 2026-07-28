/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_video_decode_vp9 = "KHRVideoDecodeVP9".nativeClassVK("KHR_video_decode_vp9", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_VIDEO_DECODE_VP9_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_VIDEO_DECODE_VP9_EXTENSION_NAME".."VK_KHR_video_decode_vp9"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_DECODE_VP9_FEATURES_KHR".."1000514000",
        "STRUCTURE_TYPE_VIDEO_DECODE_VP9_CAPABILITIES_KHR".."1000514001",
        "STRUCTURE_TYPE_VIDEO_DECODE_VP9_PICTURE_INFO_KHR".."1000514002",
        "STRUCTURE_TYPE_VIDEO_DECODE_VP9_PROFILE_INFO_KHR".."1000514003"
    )

    EnumConstant(
        "VIDEO_CODEC_OPERATION_DECODE_VP9_BIT_KHR".enum(0x00000008)
    )

    EnumConstant(
        "MAX_VIDEO_VP9_REFERENCES_PER_FRAME_KHR".."3"
    )
}