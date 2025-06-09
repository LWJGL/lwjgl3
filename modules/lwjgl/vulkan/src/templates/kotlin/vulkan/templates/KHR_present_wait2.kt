/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_present_wait2 = "KHRPresentWait2".nativeClassVK("KHR_present_wait2", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_PRESENT_WAIT_2_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_PRESENT_WAIT_2_EXTENSION_NAME".."VK_KHR_present_wait2"
    )

    EnumConstant(
        "SWAPCHAIN_CREATE_PRESENT_WAIT_2_BIT_KHR".enum(0x00000080)
    )

    EnumConstant(
        "STRUCTURE_TYPE_SURFACE_CAPABILITIES_PRESENT_WAIT_2_KHR".."1000480000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_WAIT_2_FEATURES_KHR".."1000480001",
        "STRUCTURE_TYPE_PRESENT_WAIT_2_INFO_KHR".."1000480002"
    )

    VkResult(
        "WaitForPresent2KHR",

        VkDevice("device"),
        VkSwapchainKHR("swapchain"),
        VkPresentWait2InfoKHR.const.p("pPresentWait2Info")
    )
}