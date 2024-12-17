/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import core.linux.*
import vulkan.*

val KHR_wayland_surface = "KHRWaylandSurface".nativeClassVK("KHR_wayland_surface", type = "instance", postfix = "KHR") {
    javaImport("org.lwjgl.system.linux.*")
    IntConstant(
        "KHR_WAYLAND_SURFACE_SPEC_VERSION".."6"
    )

    StringConstant(
        "KHR_WAYLAND_SURFACE_EXTENSION_NAME".."VK_KHR_wayland_surface"
    )

    EnumConstant(
        "STRUCTURE_TYPE_WAYLAND_SURFACE_CREATE_INFO_KHR".."1000006000"
    )

    VkResult(
        "CreateWaylandSurfaceKHR",

        VkInstance("instance"),
        VkWaylandSurfaceCreateInfoKHR.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkSurfaceKHR.p("pSurface")
    )

    VkBool32(
        "GetPhysicalDeviceWaylandPresentationSupportKHR",

        VkPhysicalDevice("physicalDevice"),
        uint32_t("queueFamilyIndex"),
        wl_display.p("display")
    )
}