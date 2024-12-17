/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_video_maintenance1 = "KHRVideoMaintenance1".nativeClassVK("KHR_video_maintenance1", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_VIDEO_MAINTENANCE_1_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_VIDEO_MAINTENANCE_1_EXTENSION_NAME".."VK_KHR_video_maintenance1"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_MAINTENANCE_1_FEATURES_KHR".."1000515000",
        "STRUCTURE_TYPE_VIDEO_INLINE_QUERY_INFO_KHR".."1000515001"
    )

    EnumConstant(
        "IMAGE_CREATE_VIDEO_PROFILE_INDEPENDENT_BIT_KHR".enum(0x00100000)
    )

    EnumConstant(
        "BUFFER_CREATE_VIDEO_PROFILE_INDEPENDENT_BIT_KHR".enum(0x00000040)
    )

    EnumConstant(
        "VIDEO_SESSION_CREATE_INLINE_QUERIES_BIT_KHR".enum(0x00000004)
    )
}