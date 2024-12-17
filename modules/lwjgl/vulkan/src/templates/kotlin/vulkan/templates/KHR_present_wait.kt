/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_present_wait = "KHRPresentWait".nativeClassVK("KHR_present_wait", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_PRESENT_WAIT_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_PRESENT_WAIT_EXTENSION_NAME".."VK_KHR_present_wait"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_WAIT_FEATURES_KHR".."1000248000"
    )

    VkResult(
        "WaitForPresentKHR",

        VkDevice("device"),
        VkSwapchainKHR("swapchain"),
        uint64_t("presentId"),
        uint64_t("timeout")
    )
}