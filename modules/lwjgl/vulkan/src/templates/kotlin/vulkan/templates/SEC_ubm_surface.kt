/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val SEC_ubm_surface = "SECUbmSurface".nativeClassVK("SEC_ubm_surface", type = "instance", postfix = "SEC") {
    IntConstant(
        "SEC_UBM_SURFACE_SPEC_VERSION".."1"
    )

    StringConstant(
        "SEC_UBM_SURFACE_EXTENSION_NAME".."VK_SEC_ubm_surface"
    )

    EnumConstant(
        "STRUCTURE_TYPE_UBM_SURFACE_CREATE_INFO_SEC".."1000664000"
    )

    VkResult(
        "CreateUbmSurfaceSEC",

        VkInstance("instance"),
        VkUbmSurfaceCreateInfoSEC.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkSurfaceKHR.p("pSurface")
    )

    VkBool32(
        "GetPhysicalDeviceUbmPresentationSupportSEC",

        VkPhysicalDevice("physicalDevice"),
        uint32_t("queueFamilyIndex"),
        ubm_device.p("ubm_device")
    )
}