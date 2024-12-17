/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val KHR_vulkan_swapchain_format_list = "KHRVulkanSwapchainFormatList".nativeClassXR("KHR_vulkan_swapchain_format_list", type = "instance", postfix = "KHR") {
    IntConstant(
        "KHR_vulkan_swapchain_format_list_SPEC_VERSION".."5"
    )

    StringConstant(
        "KHR_VULKAN_SWAPCHAIN_FORMAT_LIST_EXTENSION_NAME".."XR_KHR_vulkan_swapchain_format_list"
    )

    EnumConstant(
        "TYPE_VULKAN_SWAPCHAIN_FORMAT_LIST_CREATE_INFO_KHR".."1000014000"
    )
}