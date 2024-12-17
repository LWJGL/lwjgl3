/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_display_swapchain = "KHRDisplaySwapchain".nativeClassVK("KHR_display_swapchain", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_DISPLAY_SWAPCHAIN_SPEC_VERSION".."10"
    )

    StringConstant(
        "KHR_DISPLAY_SWAPCHAIN_EXTENSION_NAME".."VK_KHR_display_swapchain"
    )

    EnumConstant(
        "STRUCTURE_TYPE_DISPLAY_PRESENT_INFO_KHR".."1000003000"
    )

    EnumConstant(
        "ERROR_INCOMPATIBLE_DISPLAY_KHR".."-1000003001"
    )

    VkResult(
        "CreateSharedSwapchainsKHR",

        VkDevice("device"),
        AutoSize("pCreateInfos", "pSwapchains")..uint32_t("swapchainCount"),
        VkSwapchainCreateInfoKHR.const.p("pCreateInfos"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        VkSwapchainKHR.p("pSwapchains")
    )
}