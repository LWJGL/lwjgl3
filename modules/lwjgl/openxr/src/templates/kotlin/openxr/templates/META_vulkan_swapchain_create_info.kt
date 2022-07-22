/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val META_vulkan_swapchain_create_info = "METAVulkanSwapchainCreateInfo".nativeClassXR("META_vulkan_swapchain_create_info", type = "instance", postfix = "META") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "META_vulkan_swapchain_create_info_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "META_VULKAN_SWAPCHAIN_CREATE_INFO_EXTENSION_NAME".."XR_META_vulkan_swapchain_create_info"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_VULKAN_SWAPCHAIN_CREATE_INFO_META".."1000227000"
    )
}