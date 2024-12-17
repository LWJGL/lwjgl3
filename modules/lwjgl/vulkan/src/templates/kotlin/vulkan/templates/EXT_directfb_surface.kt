/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_directfb_surface = "EXTDirectfbSurface".nativeClassVK("EXT_directfb_surface", type = "instance", postfix = "EXT") {
    IntConstant(
        "EXT_DIRECTFB_SURFACE_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_DIRECTFB_SURFACE_EXTENSION_NAME".."VK_EXT_directfb_surface"
    )

    EnumConstant(
        "STRUCTURE_TYPE_DIRECTFB_SURFACE_CREATE_INFO_EXT".."1000346000"
    )

    VkResult(
        "CreateDirectFBSurfaceEXT",

        VkInstance("instance"),
        VkDirectFBSurfaceCreateInfoEXT.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkSurfaceKHR.p("pSurface")
    )

    VkBool32(
        "GetPhysicalDeviceDirectFBPresentationSupportEXT",

        VkPhysicalDevice("physicalDevice"),
        uint32_t("queueFamilyIndex"),
        IDirectFB.p("dfb")
    )
}