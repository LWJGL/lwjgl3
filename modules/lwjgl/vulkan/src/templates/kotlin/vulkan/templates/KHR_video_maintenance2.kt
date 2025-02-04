/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_video_maintenance2 = "KHRVideoMaintenance2".nativeClassVK("KHR_video_maintenance2", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_VIDEO_MAINTENANCE_2_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_VIDEO_MAINTENANCE_2_EXTENSION_NAME".."VK_KHR_video_maintenance2"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_MAINTENANCE_2_FEATURES_KHR".."1000586000",
        "STRUCTURE_TYPE_VIDEO_DECODE_H264_INLINE_SESSION_PARAMETERS_INFO_KHR".."1000586001",
        "STRUCTURE_TYPE_VIDEO_DECODE_H265_INLINE_SESSION_PARAMETERS_INFO_KHR".."1000586002",
        "STRUCTURE_TYPE_VIDEO_DECODE_AV1_INLINE_SESSION_PARAMETERS_INFO_KHR".."1000586003"
    )

    EnumConstant(
        "VIDEO_SESSION_CREATE_INLINE_SESSION_PARAMETERS_BIT_KHR".enum(0x00000020)
    )
}