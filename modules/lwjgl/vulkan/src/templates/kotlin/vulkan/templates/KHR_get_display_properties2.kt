/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_get_display_properties2 = "KHRGetDisplayProperties2".nativeClassVK("KHR_get_display_properties2", type = "instance", postfix = "KHR") {
    IntConstant(
        "KHR_GET_DISPLAY_PROPERTIES_2_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_GET_DISPLAY_PROPERTIES_2_EXTENSION_NAME".."VK_KHR_get_display_properties2"
    )

    EnumConstant(
        "STRUCTURE_TYPE_DISPLAY_PROPERTIES_2_KHR".."1000121000",
        "STRUCTURE_TYPE_DISPLAY_PLANE_PROPERTIES_2_KHR".."1000121001",
        "STRUCTURE_TYPE_DISPLAY_MODE_PROPERTIES_2_KHR".."1000121002",
        "STRUCTURE_TYPE_DISPLAY_PLANE_INFO_2_KHR".."1000121003",
        "STRUCTURE_TYPE_DISPLAY_PLANE_CAPABILITIES_2_KHR".."1000121004"
    )

    VkResult(
        "GetPhysicalDeviceDisplayProperties2KHR",

        VkPhysicalDevice("physicalDevice"),
        AutoSize("pProperties")..Check(1)..uint32_t.p("pPropertyCount"),
        nullable..VkDisplayProperties2KHR.p("pProperties")
    )

    VkResult(
        "GetPhysicalDeviceDisplayPlaneProperties2KHR",

        VkPhysicalDevice("physicalDevice"),
        AutoSize("pProperties")..Check(1)..uint32_t.p("pPropertyCount"),
        nullable..VkDisplayPlaneProperties2KHR.p("pProperties")
    )

    VkResult(
        "GetDisplayModeProperties2KHR",

        VkPhysicalDevice("physicalDevice"),
        VkDisplayKHR("display"),
        AutoSize("pProperties")..Check(1)..uint32_t.p("pPropertyCount"),
        nullable..VkDisplayModeProperties2KHR.p("pProperties")
    )

    VkResult(
        "GetDisplayPlaneCapabilities2KHR",

        VkPhysicalDevice("physicalDevice"),
        VkDisplayPlaneInfo2KHR.const.p("pDisplayPlaneInfo"),
        VkDisplayPlaneCapabilities2KHR.p("pCapabilities")
    )
}