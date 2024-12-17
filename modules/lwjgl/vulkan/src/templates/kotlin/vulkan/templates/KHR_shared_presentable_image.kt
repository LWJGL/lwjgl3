/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_shared_presentable_image = "KHRSharedPresentableImage".nativeClassVK("KHR_shared_presentable_image", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_SHARED_PRESENTABLE_IMAGE_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_SHARED_PRESENTABLE_IMAGE_EXTENSION_NAME".."VK_KHR_shared_presentable_image"
    )

    EnumConstant(
        "STRUCTURE_TYPE_SHARED_PRESENT_SURFACE_CAPABILITIES_KHR".."1000111000"
    )

    EnumConstant(
        "PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR".."1000111000",
        "PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR".."1000111001"
    )

    EnumConstant(
        "IMAGE_LAYOUT_SHARED_PRESENT_KHR".."1000111000"
    )

    VkResult(
        "GetSwapchainStatusKHR",

        VkDevice("device"),
        VkSwapchainKHR("swapchain")
    )
}