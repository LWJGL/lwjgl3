/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import vulkan.*
import openxr.*

val KHR_vulkan_enable2 = "KHRVulkanEnable2".nativeClassXR("KHR_vulkan_enable2", type = "instance", postfix = "KHR") {
    javaImport("org.lwjgl.vulkan.*")
    IntConstant(
        "KHR_vulkan_enable2_SPEC_VERSION".."3"
    )

    StringConstant(
        "KHR_VULKAN_ENABLE2_EXTENSION_NAME".."XR_KHR_vulkan_enable2"
    )

    EnumConstant(
        "TYPE_VULKAN_INSTANCE_CREATE_INFO_KHR".."1000090000",
        "TYPE_GRAPHICS_BINDING_VULKAN2_KHR".."1000090000",
        "TYPE_VULKAN_DEVICE_CREATE_INFO_KHR".."1000090001",
        "TYPE_SWAPCHAIN_IMAGE_VULKAN2_KHR".."1000090001",
        "TYPE_GRAPHICS_REQUIREMENTS_VULKAN2_KHR".."1000090002",
        "TYPE_VULKAN_GRAPHICS_DEVICE_GET_INFO_KHR".."1000090003"
    )

    XrResult(
        "CreateVulkanInstanceKHR",

        XrInstance("instance"),
        XrVulkanInstanceCreateInfoKHR.const.p("createInfo"),
        Check(1)..VkInstance.p("vulkanInstance"),
        Check(1)..VkResult.p("vulkanResult")
    )

    XrResult(
        "CreateVulkanDeviceKHR",

        XrInstance("instance"),
        XrVulkanDeviceCreateInfoKHR.const.p("createInfo"),
        Check(1)..VkDevice.p("vulkanDevice"),
        Check(1)..VkResult.p("vulkanResult")
    )

    XrResult(
        "GetVulkanGraphicsDevice2KHR",

        XrInstance("instance"),
        XrVulkanGraphicsDeviceGetInfoKHR.const.p("getInfo"),
        Check(1)..VkPhysicalDevice.p("vulkanPhysicalDevice")
    )

    XrResult(
        "GetVulkanGraphicsRequirements2KHR",

        XrInstance("instance"),
        XrSystemId("systemId"),
        XrGraphicsRequirementsVulkanKHR.p("graphicsRequirements")
    )
}