/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_android_surface = "KHRAndroidSurface".nativeClassVK("KHR_android_surface", type = "instance", postfix = "KHR") {
    IntConstant(
        "KHR_ANDROID_SURFACE_SPEC_VERSION".."6"
    )

    StringConstant(
        "KHR_ANDROID_SURFACE_EXTENSION_NAME".."VK_KHR_android_surface"
    )

    EnumConstant(
        "STRUCTURE_TYPE_ANDROID_SURFACE_CREATE_INFO_KHR".."1000008000"
    )

    VkResult(
        "CreateAndroidSurfaceKHR",

        VkInstance("instance"),
        VkAndroidSurfaceCreateInfoKHR.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkSurfaceKHR.p("pSurface")
    )
}