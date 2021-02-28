/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import vulkan.*
import openxr.*
import openxr.KHR as KHR1

val KHR_vulkan_swapchain_format_list = "KHRVulkanSwapchainFormatList".nativeClassXR("KHR_vulkan_swapchain_format_list", type = "instance", postfix = KHR1) {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "KHR_vulkan_swapchain_format_list_SPEC_VERSION".."3"
    )

    StringConstant(
        "The extension name.",

        "KHR_VULKAN_SWAPCHAIN_FORMAT_LIST_EXTENSION_NAME".."XR_KHR_vulkan_swapchain_format_list"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_VULKAN_SWAPCHAIN_FORMAT_LIST_CREATE_INFO_KHR".."1000014000"
    )
}