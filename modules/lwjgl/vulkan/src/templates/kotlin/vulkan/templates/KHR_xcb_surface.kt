/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_xcb_surface = "KHRXcbSurface".nativeClassVK("KHR_xcb_surface", type = "instance", postfix = "KHR") {
    IntConstant(
        "KHR_XCB_SURFACE_SPEC_VERSION".."6"
    )

    StringConstant(
        "KHR_XCB_SURFACE_EXTENSION_NAME".."VK_KHR_xcb_surface"
    )

    EnumConstant(
        "STRUCTURE_TYPE_XCB_SURFACE_CREATE_INFO_KHR".."1000005000"
    )

    VkResult(
        "CreateXcbSurfaceKHR",

        VkInstance("instance"),
        VkXcbSurfaceCreateInfoKHR.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkSurfaceKHR.p("pSurface")
    )

    VkBool32(
        "GetPhysicalDeviceXcbPresentationSupportKHR",

        VkPhysicalDevice("physicalDevice"),
        uint32_t("queueFamilyIndex"),
        xcb_connection_t.p("connection"),
        xcb_visualid_t("visual_id")
    )
}