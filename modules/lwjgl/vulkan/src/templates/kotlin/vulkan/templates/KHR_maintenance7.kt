/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_maintenance7 = "KHRMaintenance7".nativeClassVK("KHR_maintenance7", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_MAINTENANCE_7_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_MAINTENANCE_7_EXTENSION_NAME".."VK_KHR_maintenance7"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_7_FEATURES_KHR".."1000562000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_7_PROPERTIES_KHR".."1000562001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_LIST_KHR".."1000562002",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_KHR".."1000562003",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_VULKAN_PROPERTIES_KHR".."1000562004"
    )

    EnumConstant(
        "SUBPASS_CONTENTS_INLINE_AND_SECONDARY_COMMAND_BUFFERS_KHR".."1000451000"
    )

    EnumConstant(
        "RENDERING_CONTENTS_INLINE_BIT_KHR".enum(0x00000010)
    )

    EnumConstant(
        "PHYSICAL_DEVICE_LAYERED_API_VULKAN_KHR".."0",
        "PHYSICAL_DEVICE_LAYERED_API_D3D12_KHR".."1",
        "PHYSICAL_DEVICE_LAYERED_API_METAL_KHR".."2",
        "PHYSICAL_DEVICE_LAYERED_API_OPENGL_KHR".."3",
        "PHYSICAL_DEVICE_LAYERED_API_OPENGLES_KHR".."4"
    )
}