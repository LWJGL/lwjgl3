/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_display = "KHRDisplay".nativeClassVK("KHR_display", type = "instance", postfix = "KHR") {
    IntConstant(
        "KHR_DISPLAY_SPEC_VERSION".."23"
    )

    StringConstant(
        "KHR_DISPLAY_EXTENSION_NAME".."VK_KHR_display"
    )

    EnumConstant(
        "STRUCTURE_TYPE_DISPLAY_MODE_CREATE_INFO_KHR".."1000002000",
        "STRUCTURE_TYPE_DISPLAY_SURFACE_CREATE_INFO_KHR".."1000002001"
    )

    EnumConstant(
        "OBJECT_TYPE_DISPLAY_KHR".."1000002000",
        "OBJECT_TYPE_DISPLAY_MODE_KHR".."1000002001"
    )

    EnumConstant(
        "DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR".enum(0x00000001),
        "DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR".enum(0x00000002),
        "DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR".enum(0x00000004),
        "DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR".enum(0x00000008)
    )

    VkResult(
        "GetPhysicalDeviceDisplayPropertiesKHR",

        VkPhysicalDevice("physicalDevice"),
        AutoSize("pProperties")..Check(1)..uint32_t.p("pPropertyCount"),
        nullable..VkDisplayPropertiesKHR.p("pProperties")
    )

    VkResult(
        "GetPhysicalDeviceDisplayPlanePropertiesKHR",

        VkPhysicalDevice("physicalDevice"),
        AutoSize("pProperties")..Check(1)..uint32_t.p("pPropertyCount"),
        nullable..VkDisplayPlanePropertiesKHR.p("pProperties")
    )

    VkResult(
        "GetDisplayPlaneSupportedDisplaysKHR",

        VkPhysicalDevice("physicalDevice"),
        uint32_t("planeIndex"),
        AutoSize("pDisplays")..Check(1)..uint32_t.p("pDisplayCount"),
        nullable..VkDisplayKHR.p("pDisplays")
    )

    VkResult(
        "GetDisplayModePropertiesKHR",

        VkPhysicalDevice("physicalDevice"),
        VkDisplayKHR("display"),
        AutoSize("pProperties")..Check(1)..uint32_t.p("pPropertyCount"),
        nullable..VkDisplayModePropertiesKHR.p("pProperties")
    )

    VkResult(
        "CreateDisplayModeKHR",

        VkPhysicalDevice("physicalDevice"),
        VkDisplayKHR("display"),
        VkDisplayModeCreateInfoKHR.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkDisplayModeKHR.p("pMode")
    )

    VkResult(
        "GetDisplayPlaneCapabilitiesKHR",

        VkPhysicalDevice("physicalDevice"),
        VkDisplayModeKHR("mode"),
        uint32_t("planeIndex"),
        VkDisplayPlaneCapabilitiesKHR.p("pCapabilities")
    )

    VkResult(
        "CreateDisplayPlaneSurfaceKHR",

        VkInstance("instance"),
        VkDisplaySurfaceCreateInfoKHR.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkSurfaceKHR.p("pSurface")
    )
}