/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_swapchain_maintenance1 = "KHRSwapchainMaintenance1".nativeClassVK("KHR_swapchain_maintenance1", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_SWAPCHAIN_MAINTENANCE_1_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_SWAPCHAIN_MAINTENANCE_1_EXTENSION_NAME".."VK_KHR_swapchain_maintenance1"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SWAPCHAIN_MAINTENANCE_1_FEATURES_KHR".."1000275000",
        "STRUCTURE_TYPE_SWAPCHAIN_PRESENT_FENCE_INFO_KHR".."1000275001",
        "STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODES_CREATE_INFO_KHR".."1000275002",
        "STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODE_INFO_KHR".."1000275003",
        "STRUCTURE_TYPE_SWAPCHAIN_PRESENT_SCALING_CREATE_INFO_KHR".."1000275004",
        "STRUCTURE_TYPE_RELEASE_SWAPCHAIN_IMAGES_INFO_KHR".."1000275005"
    )

    EnumConstant(
        "SWAPCHAIN_CREATE_DEFERRED_MEMORY_ALLOCATION_BIT_KHR".enum(0x00000008)
    )

    VkResult(
        "ReleaseSwapchainImagesKHR",

        VkDevice("device"),
        VkReleaseSwapchainImagesInfoKHR.const.p("pReleaseInfo")
    )
}