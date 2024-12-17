/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_maintenance1 = "KHRMaintenance1".nativeClassVK("KHR_maintenance1", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_MAINTENANCE_1_SPEC_VERSION".."2"
    )

    StringConstant(
        "KHR_MAINTENANCE_1_EXTENSION_NAME".."VK_KHR_maintenance1"
    )

    IntConstant(
        "KHR_MAINTENANCE1_SPEC_VERSION".."VK_KHR_MAINTENANCE_1_SPEC_VERSION"
    )

    StringConstant(
        "KHR_MAINTENANCE1_EXTENSION_NAME".expr("VK_KHR_MAINTENANCE_1_EXTENSION_NAME")
    )

    EnumConstant(
        "ERROR_OUT_OF_POOL_MEMORY_KHR".."-1000069000"
    )

    EnumConstant(
        "FORMAT_FEATURE_TRANSFER_SRC_BIT_KHR".enum(0x00004000),
        "FORMAT_FEATURE_TRANSFER_DST_BIT_KHR".enum(0x00008000)
    )

    EnumConstant(
        "IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT_KHR".enum(0x00000020)
    )

    void(
        "TrimCommandPoolKHR",

        VkDevice("device"),
        VkCommandPool("commandPool"),
        VkCommandPoolTrimFlags("flags")
    )
}