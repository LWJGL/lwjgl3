/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val MVK_macos_surface = "MVKMacosSurface".nativeClassVK("MVK_macos_surface", type = "instance", postfix = "MVK") {
    IntConstant(
        "MVK_MACOS_SURFACE_SPEC_VERSION".."3"
    )

    StringConstant(
        "MVK_MACOS_SURFACE_EXTENSION_NAME".."VK_MVK_macos_surface"
    )

    EnumConstant(
        "STRUCTURE_TYPE_MACOS_SURFACE_CREATE_INFO_MVK".."1000123000"
    )

    VkResult(
        "CreateMacOSSurfaceMVK",

        VkInstance("instance"),
        VkMacOSSurfaceCreateInfoMVK.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkSurfaceKHR.p("pSurface")
    )
}