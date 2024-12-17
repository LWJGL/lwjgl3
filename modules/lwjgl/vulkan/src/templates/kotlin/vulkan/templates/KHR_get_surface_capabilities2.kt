/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_get_surface_capabilities2 = "KHRGetSurfaceCapabilities2".nativeClassVK("KHR_get_surface_capabilities2", type = "instance", postfix = "KHR") {
    IntConstant(
        "KHR_GET_SURFACE_CAPABILITIES_2_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_GET_SURFACE_CAPABILITIES_2_EXTENSION_NAME".."VK_KHR_get_surface_capabilities2"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SURFACE_INFO_2_KHR".."1000119000",
        "STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_KHR".."1000119001",
        "STRUCTURE_TYPE_SURFACE_FORMAT_2_KHR".."1000119002"
    )

    VkResult(
        "GetPhysicalDeviceSurfaceCapabilities2KHR",

        VkPhysicalDevice("physicalDevice"),
        VkPhysicalDeviceSurfaceInfo2KHR.const.p("pSurfaceInfo"),
        VkSurfaceCapabilities2KHR.p("pSurfaceCapabilities")
    )

    VkResult(
        "GetPhysicalDeviceSurfaceFormats2KHR",

        VkPhysicalDevice("physicalDevice"),
        VkPhysicalDeviceSurfaceInfo2KHR.const.p("pSurfaceInfo"),
        AutoSize("pSurfaceFormats")..Check(1)..uint32_t.p("pSurfaceFormatCount"),
        nullable..VkSurfaceFormat2KHR.p("pSurfaceFormats")
    )
}