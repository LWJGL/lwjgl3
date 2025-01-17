/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_full_screen_exclusive = "EXTFullScreenExclusive".nativeClassVK("EXT_full_screen_exclusive", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_FULL_SCREEN_EXCLUSIVE_SPEC_VERSION".."4"
    )

    StringConstant(
        "EXT_FULL_SCREEN_EXCLUSIVE_EXTENSION_NAME".."VK_EXT_full_screen_exclusive"
    )

    EnumConstant(
        "STRUCTURE_TYPE_SURFACE_FULL_SCREEN_EXCLUSIVE_INFO_EXT".."1000255000",
        "STRUCTURE_TYPE_SURFACE_FULL_SCREEN_EXCLUSIVE_WIN32_INFO_EXT".."1000255001",
        "STRUCTURE_TYPE_SURFACE_CAPABILITIES_FULL_SCREEN_EXCLUSIVE_EXT".."1000255002"
    )

    EnumConstant(
        "ERROR_FULL_SCREEN_EXCLUSIVE_MODE_LOST_EXT".."-1000255000"
    )

    EnumConstant(
        "FULL_SCREEN_EXCLUSIVE_DEFAULT_EXT".."0",
        "FULL_SCREEN_EXCLUSIVE_ALLOWED_EXT".."1",
        "FULL_SCREEN_EXCLUSIVE_DISALLOWED_EXT".."2",
        "FULL_SCREEN_EXCLUSIVE_APPLICATION_CONTROLLED_EXT".."3"
    )

    VkResult(
        "GetPhysicalDeviceSurfacePresentModes2EXT",

        VkPhysicalDevice("physicalDevice"),
        VkPhysicalDeviceSurfaceInfo2KHR.const.p("pSurfaceInfo"),
        AutoSize("pPresentModes")..Check(1)..uint32_t.p("pPresentModeCount"),
        nullable..VkPresentModeKHR.p("pPresentModes")
    )

    VkResult(
        "AcquireFullScreenExclusiveModeEXT",

        VkDevice("device"),
        VkSwapchainKHR("swapchain")
    )

    VkResult(
        "ReleaseFullScreenExclusiveModeEXT",

        VkDevice("device"),
        VkSwapchainKHR("swapchain")
    )

    DependsOn("""ext.contains("VK_KHR_device_group") || ext.contains("Vulkan11")""")..VkResult(
        "GetDeviceGroupSurfacePresentModes2EXT",

        VkDevice("device"),
        VkPhysicalDeviceSurfaceInfo2KHR.const.p("pSurfaceInfo"),
        Check(1)..VkDeviceGroupPresentModeFlagsKHR.p("pModes")
    )
}