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

val KHR_vulkan_enable = "KHRVulkanEnable".nativeClassXR("KHR_vulkan_enable", type = "instance", postfix = KHR1) {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "KHR_vulkan_enable_SPEC_VERSION".."7"
    )

    StringConstant(
        "The extension name.",

        "KHR_VULKAN_ENABLE_EXTENSION_NAME".."XR_KHR_vulkan_enable"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_GRAPHICS_BINDING_VULKAN_KHR".."1000025000",
        "TYPE_SWAPCHAIN_IMAGE_VULKAN_KHR".."1000025001",
        "TYPE_GRAPHICS_REQUIREMENTS_VULKAN_KHR".."1000025002"
    )

    XrResult(
        "GetVulkanInstanceExtensionsKHR",
        "",

        XrInstance("instance", ""),
        XrSystemId("systemId", ""),
        AutoSize("buffer")..uint32_t("bufferCapacityInput", ""),
        Check(1)..uint32_t.p("bufferCountOutput", ""),
        nullable..charUTF8.p("buffer", "")
    )

    XrResult(
        "GetVulkanDeviceExtensionsKHR",
        "",

        XrInstance("instance", ""),
        XrSystemId("systemId", ""),
        AutoSize("buffer")..uint32_t("bufferCapacityInput", ""),
        Check(1)..uint32_t.p("bufferCountOutput", ""),
        nullable..charUTF8.p("buffer", "")
    )

    XrResult(
        "GetVulkanGraphicsDeviceKHR",
        "",

        XrInstance("instance", ""),
        XrSystemId("systemId", ""),
        VkInstance("vkInstance", ""),
        VkPhysicalDevice.p("vkPhysicalDevice", "")
    )

    XrResult(
        "GetVulkanGraphicsRequirementsKHR",
        "",

        XrInstance("instance", ""),
        XrSystemId("systemId", ""),
        XrGraphicsRequirementsVulkanKHR.p("graphicsRequirements", "")
    )
}