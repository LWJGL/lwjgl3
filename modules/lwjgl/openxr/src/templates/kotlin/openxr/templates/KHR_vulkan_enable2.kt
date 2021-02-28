/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import vulkan.*
import openxr.KHR as KHR1
import openxr.*

val KHR_vulkan_enable2 = "KHRVulkanEnable2".nativeClassXR("KHR_vulkan_enable2", type = "instance", postfix = KHR1) {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "KHR_vulkan_enable2_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_VULKAN_ENABLE2_EXTENSION_NAME".."XR_KHR_vulkan_enable2"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_VULKAN_INSTANCE_CREATE_INFO_KHR".."1000090000",
        "TYPE_VULKAN_DEVICE_CREATE_INFO_KHR".."1000090001",
        "TYPE_VULKAN_GRAPHICS_DEVICE_GET_INFO_KHR".."1000090003",
        "TYPE_GRAPHICS_BINDING_VULKAN2_KHR".."1000090000",
        "TYPE_SWAPCHAIN_IMAGE_VULKAN2_KHR".."1000090001",
        "TYPE_GRAPHICS_REQUIREMENTS_VULKAN2_KHR".."1000090002"
    )

//    XrResult(
//        "CreateVulkanInstanceKHR",
//        "",
//
//        XrInstance("instance", ""),
//        XrVulkanInstanceCreateInfoKHR.const.p("createInfo", ""),
//        VkInstance.p("vulkanInstance", ""),
//        VkResult.p("vulkanResult", "")
//    )
//
//    XrResult(
//        "CreateVulkanDeviceKHR",
//        "",
//
//        XrInstance("instance", ""),
//        XrVulkanDeviceCreateInfoKHR.const.p("createInfo", ""),
//        VkDevice.p("vulkanDevice", ""),
//        VkResult.p("vulkanResult", "")
//    )

    XrResult(
        "GetVulkanGraphicsDevice2KHR",
        "",

        XrInstance("instance", ""),
        XrVulkanGraphicsDeviceGetInfoKHR.const.p("getInfo", ""),
        VkPhysicalDevice.p("vulkanPhysicalDevice", "")
    )

    XrResult(
        "GetVulkanGraphicsRequirements2KHR",
        "See #GetVulkanGraphicsRequirementsKHR().",

        XrInstance("instance", ""),
        XrSystemId("systemId", ""),
        XrGraphicsRequirementsVulkanKHR.p("graphicsRequirements", "")
    )
}