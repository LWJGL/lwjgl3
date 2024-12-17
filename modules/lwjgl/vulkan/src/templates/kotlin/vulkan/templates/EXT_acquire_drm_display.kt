/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_acquire_drm_display = "EXTAcquireDrmDisplay".nativeClassVK("EXT_acquire_drm_display", type = "instance", postfix = "EXT") {
    IntConstant(
        "EXT_ACQUIRE_DRM_DISPLAY_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_ACQUIRE_DRM_DISPLAY_EXTENSION_NAME".."VK_EXT_acquire_drm_display"
    )

    VkResult(
        "AcquireDrmDisplayEXT",

        VkPhysicalDevice("physicalDevice"),
        int32_t("drmFd"),
        VkDisplayKHR("display")
    )

    VkResult(
        "GetDrmDisplayEXT",

        VkPhysicalDevice("physicalDevice"),
        int32_t("drmFd"),
        uint32_t("connectorId"),
        Check(1)..VkDisplayKHR.p("display")
    )
}