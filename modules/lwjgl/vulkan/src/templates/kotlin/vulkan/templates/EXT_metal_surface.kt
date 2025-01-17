/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_metal_surface = "EXTMetalSurface".nativeClassVK("EXT_metal_surface", type = "instance", postfix = "EXT") {
    IntConstant(
        "EXT_METAL_SURFACE_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_METAL_SURFACE_EXTENSION_NAME".."VK_EXT_metal_surface"
    )

    EnumConstant(
        "STRUCTURE_TYPE_METAL_SURFACE_CREATE_INFO_EXT".."1000217000"
    )

    VkResult(
        "CreateMetalSurfaceEXT",

        VkInstance("instance"),
        VkMetalSurfaceCreateInfoEXT.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkSurfaceKHR.p("pSurface")
    )
}