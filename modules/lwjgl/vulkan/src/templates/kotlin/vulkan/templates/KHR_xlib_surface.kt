/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import core.linux.*
import vulkan.*

val KHR_xlib_surface = "KHRXlibSurface".nativeClassVK("KHR_xlib_surface", type = "instance", postfix = "KHR") {
    javaImport("org.lwjgl.system.linux.*")
    IntConstant(
        "KHR_XLIB_SURFACE_SPEC_VERSION".."6"
    )

    StringConstant(
        "KHR_XLIB_SURFACE_EXTENSION_NAME".."VK_KHR_xlib_surface"
    )

    EnumConstant(
        "STRUCTURE_TYPE_XLIB_SURFACE_CREATE_INFO_KHR".."1000004000"
    )

    VkResult(
        "CreateXlibSurfaceKHR",

        VkInstance("instance"),
        VkXlibSurfaceCreateInfoKHR.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkSurfaceKHR.p("pSurface")
    )

    VkBool32(
        "GetPhysicalDeviceXlibPresentationSupportKHR",

        VkPhysicalDevice("physicalDevice"),
        uint32_t("queueFamilyIndex"),
        Display.p("dpy"),
        VisualID("visualID")
    )
}