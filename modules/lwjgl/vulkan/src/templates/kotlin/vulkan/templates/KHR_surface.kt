/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_surface = "KHRSurface".nativeClassVK("KHR_surface", type = "instance", postfix = "KHR") {
    IntConstant(
        "KHR_SURFACE_SPEC_VERSION".."25"
    )

    StringConstant(
        "KHR_SURFACE_EXTENSION_NAME".."VK_KHR_surface"
    )

    EnumConstant(
        "ERROR_SURFACE_LOST_KHR".."-1000000000",
        "ERROR_NATIVE_WINDOW_IN_USE_KHR".."-1000000001"
    )

    EnumConstant(
        "OBJECT_TYPE_SURFACE_KHR".."1000000000"
    )

    EnumConstant(
        "SURFACE_TRANSFORM_IDENTITY_BIT_KHR".enum(0x00000001),
        "SURFACE_TRANSFORM_ROTATE_90_BIT_KHR".enum(0x00000002),
        "SURFACE_TRANSFORM_ROTATE_180_BIT_KHR".enum(0x00000004),
        "SURFACE_TRANSFORM_ROTATE_270_BIT_KHR".enum(0x00000008),
        "SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR".enum(0x00000010),
        "SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR".enum(0x00000020),
        "SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR".enum(0x00000040),
        "SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR".enum(0x00000080),
        "SURFACE_TRANSFORM_INHERIT_BIT_KHR".enum(0x00000100)
    )

    EnumConstant(
        "PRESENT_MODE_IMMEDIATE_KHR".."0",
        "PRESENT_MODE_MAILBOX_KHR".."1",
        "PRESENT_MODE_FIFO_KHR".."2",
        "PRESENT_MODE_FIFO_RELAXED_KHR".."3"
    )

    EnumConstant(
        "COLOR_SPACE_SRGB_NONLINEAR_KHR".."0",
        "COLORSPACE_SRGB_NONLINEAR_KHR".."0"
    )

    EnumConstant(
        "COMPOSITE_ALPHA_OPAQUE_BIT_KHR".enum(0x00000001),
        "COMPOSITE_ALPHA_PRE_MULTIPLIED_BIT_KHR".enum(0x00000002),
        "COMPOSITE_ALPHA_POST_MULTIPLIED_BIT_KHR".enum(0x00000004),
        "COMPOSITE_ALPHA_INHERIT_BIT_KHR".enum(0x00000008)
    )

    void(
        "DestroySurfaceKHR",

        VkInstance("instance"),
        VkSurfaceKHR("surface"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    VkResult(
        "GetPhysicalDeviceSurfaceSupportKHR",

        VkPhysicalDevice("physicalDevice"),
        uint32_t("queueFamilyIndex"),
        VkSurfaceKHR("surface"),
        Check(1)..VkBool32.p("pSupported")
    )

    VkResult(
        "GetPhysicalDeviceSurfaceCapabilitiesKHR",

        VkPhysicalDevice("physicalDevice"),
        VkSurfaceKHR("surface"),
        VkSurfaceCapabilitiesKHR.p("pSurfaceCapabilities")
    )

    VkResult(
        "GetPhysicalDeviceSurfaceFormatsKHR",

        VkPhysicalDevice("physicalDevice"),
        VkSurfaceKHR("surface"),
        AutoSize("pSurfaceFormats")..Check(1)..uint32_t.p("pSurfaceFormatCount"),
        nullable..VkSurfaceFormatKHR.p("pSurfaceFormats")
    )

    VkResult(
        "GetPhysicalDeviceSurfacePresentModesKHR",

        VkPhysicalDevice("physicalDevice"),
        VkSurfaceKHR("surface"),
        AutoSize("pPresentModes")..Check(1)..uint32_t.p("pPresentModeCount"),
        nullable..VkPresentModeKHR.p("pPresentModes")
    )
}