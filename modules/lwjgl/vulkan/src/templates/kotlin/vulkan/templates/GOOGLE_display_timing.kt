/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val GOOGLE_display_timing = "GOOGLEDisplayTiming".nativeClassVK("GOOGLE_display_timing", type = "device", postfix = "GOOGLE") {
    IntConstant(
        "GOOGLE_DISPLAY_TIMING_SPEC_VERSION".."1"
    )

    StringConstant(
        "GOOGLE_DISPLAY_TIMING_EXTENSION_NAME".."VK_GOOGLE_display_timing"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PRESENT_TIMES_INFO_GOOGLE".."1000092000"
    )

    VkResult(
        "GetRefreshCycleDurationGOOGLE",

        VkDevice("device"),
        VkSwapchainKHR("swapchain"),
        VkRefreshCycleDurationGOOGLE.p("pDisplayTimingProperties")
    )

    VkResult(
        "GetPastPresentationTimingGOOGLE",

        VkDevice("device"),
        VkSwapchainKHR("swapchain"),
        AutoSize("pPresentationTimings")..Check(1)..uint32_t.p("pPresentationTimingCount"),
        nullable..VkPastPresentationTimingGOOGLE.p("pPresentationTimings")
    )
}