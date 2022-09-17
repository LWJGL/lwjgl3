/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val KHR_vulkan_swapchain_format_list = "KHRVulkanSwapchainFormatList".nativeClassXR("KHR_vulkan_swapchain_format_list", type = "instance", postfix = "KHR") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_KHR_vulkan_swapchain_format_list">XR_KHR_vulkan_swapchain_format_list</a> extension.

        Vulkan has the {@code VK_KHR_image_format_list} extension which allows applications to tell the {@code vkCreateImage} function which formats the application intends to use when {@code VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT} is specified. This OpenXR extension exposes that Vulkan extension to OpenXR applications. In the same way that a Vulkan-based application can pass a {@code VkImageFormatListCreateInfo} struct to the {@code vkCreateImage} function, an OpenXR application can pass an identically configured ##XrVulkanSwapchainFormatListCreateInfoKHR structure to #CreateSwapchain().

        Applications using this extension to specify more than one swapchain format must create OpenXR swapchains with the #SWAPCHAIN_USAGE_MUTABLE_FORMAT_BIT bit set.

        Runtimes implementing this extension <b>must</b> support the {@link KHRVulkanEnable XR_KHR_vulkan_enable} or the {@link KHRVulkanEnable2 XR_KHR_vulkan_enable2} extension. When {@link KHRVulkanEnable XR_KHR_vulkan_enable} is used, the runtime <b>must</b> add {@code VK_KHR_image_format_list} to the list of extensions enabled in #CreateVulkanDeviceKHR().
        """

    IntConstant(
        "The extension specification version.",

        "KHR_vulkan_swapchain_format_list_SPEC_VERSION".."4"
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