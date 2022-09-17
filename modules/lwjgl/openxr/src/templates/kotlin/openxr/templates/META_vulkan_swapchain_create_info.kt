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
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_META_vulkan_swapchain_create_info">XR_META_vulkan_swapchain_create_info</a> extension.

        Using this extension, a Vulkan-based application <b>can</b> pass through additional {@code VkImageCreateFlags} or {@code VkImageUsageFlags} by chaining an ##XrVulkanSwapchainCreateInfoMETA structure to the ##XrSwapchainCreateInfo when calling #CreateSwapchain().

        The application is still encouraged to use the common bits like #SWAPCHAIN_USAGE_TRANSFER_SRC_BIT defined in {@code XrSwapchainUsageFlags}. However, the application <b>may</b> present both #SWAPCHAIN_USAGE_TRANSFER_SRC_BIT in {@code XrSwapchainUsageFlags} and {@code VK_IMAGE_USAGE_TRANSFER_SRC_BIT} in {@code VkImageUsageFlags} at the same time.

        The application <b>must</b> enable the corresponding Vulkan extensions before requesting additional Vulkan flags. For example, {@code VK_EXT_fragment_density_map} device extension <b>must</b> be enabled if an application requests {@code VK_IMAGE_CREATE_SUBSAMPLED_BIT_EXT} bit. Otherwise, it <b>may</b> cause undefined behavior, including an application crash.

        Runtimes that implement this extension <b>must</b> support the {@link KHRVulkanEnable XR_KHR_vulkan_enable} or the {@link KHRVulkanEnable2 XR_KHR_vulkan_enable2} extension.
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