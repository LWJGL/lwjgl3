/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_headless_surface = "EXTHeadlessSurface".nativeClassVK("EXT_headless_surface", type = "instance", postfix = "EXT") {
    IntConstant(
        "EXT_HEADLESS_SURFACE_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_HEADLESS_SURFACE_EXTENSION_NAME".."VK_EXT_headless_surface"
    )

    EnumConstant(
        "STRUCTURE_TYPE_HEADLESS_SURFACE_CREATE_INFO_EXT".."1000256000"
    )

    VkResult(
        "CreateHeadlessSurfaceEXT",

        VkInstance("instance"),
        VkHeadlessSurfaceCreateInfoEXT.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkSurfaceKHR.p("pSurface")
    )
}