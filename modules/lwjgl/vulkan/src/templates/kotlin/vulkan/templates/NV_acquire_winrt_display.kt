/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_acquire_winrt_display = "NVAcquireWinrtDisplay".nativeClassVK("NV_acquire_winrt_display", type = "device", postfix = "NV") {
    IntConstant(
        "NV_ACQUIRE_WINRT_DISPLAY_SPEC_VERSION".."1"
    )

    StringConstant(
        "NV_ACQUIRE_WINRT_DISPLAY_EXTENSION_NAME".."VK_NV_acquire_winrt_display"
    )

    VkResult(
        "AcquireWinrtDisplayNV",

        VkPhysicalDevice("physicalDevice"),
        VkDisplayKHR("display")
    )

    VkResult(
        "GetWinrtDisplayNV",

        VkPhysicalDevice("physicalDevice"),
        uint32_t("deviceRelativeId"),
        Check(1)..VkDisplayKHR.p("pDisplay")
    )
}