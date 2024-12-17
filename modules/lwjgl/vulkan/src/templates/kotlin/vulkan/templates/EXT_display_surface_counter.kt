/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_display_surface_counter = "EXTDisplaySurfaceCounter".nativeClassVK("EXT_display_surface_counter", type = "instance", postfix = "EXT") {
    IntConstant(
        "EXT_DISPLAY_SURFACE_COUNTER_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_DISPLAY_SURFACE_COUNTER_EXTENSION_NAME".."VK_EXT_display_surface_counter"
    )

    EnumConstant(
        "STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_EXT".."1000090000",
        "STRUCTURE_TYPE_SURFACE_CAPABILITIES2_EXT".."1000090000"
    )

    EnumConstant(
        "SURFACE_COUNTER_VBLANK_BIT_EXT".enum(0x00000001),
        "SURFACE_COUNTER_VBLANK_EXT".enum(0x00000001)
    )

    VkResult(
        "GetPhysicalDeviceSurfaceCapabilities2EXT",

        VkPhysicalDevice("physicalDevice"),
        VkSurfaceKHR("surface"),
        VkSurfaceCapabilities2EXT.p("pSurfaceCapabilities")
    )
}