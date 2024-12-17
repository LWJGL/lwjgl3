/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import core.windows.*
import vulkan.*

val KHR_win32_surface = "KHRWin32Surface".nativeClassVK("KHR_win32_surface", type = "instance", postfix = "KHR") {
    javaImport("org.lwjgl.system.windows.*")
    IntConstant(
        "KHR_WIN32_SURFACE_SPEC_VERSION".."6"
    )

    StringConstant(
        "KHR_WIN32_SURFACE_EXTENSION_NAME".."VK_KHR_win32_surface"
    )

    EnumConstant(
        "STRUCTURE_TYPE_WIN32_SURFACE_CREATE_INFO_KHR".."1000009000"
    )

    VkResult(
        "CreateWin32SurfaceKHR",

        VkInstance("instance"),
        VkWin32SurfaceCreateInfoKHR.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkSurfaceKHR.p("pSurface")
    )

    VkBool32(
        "GetPhysicalDeviceWin32PresentationSupportKHR",

        VkPhysicalDevice("physicalDevice"),
        uint32_t("queueFamilyIndex")
    )
}