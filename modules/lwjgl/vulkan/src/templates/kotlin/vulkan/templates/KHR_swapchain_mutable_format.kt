/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_swapchain_mutable_format = "KHRSwapchainMutableFormat".nativeClassVK("KHR_swapchain_mutable_format", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_SWAPCHAIN_MUTABLE_FORMAT_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_SWAPCHAIN_MUTABLE_FORMAT_EXTENSION_NAME".."VK_KHR_swapchain_mutable_format"
    )

    EnumConstant(
        "SWAPCHAIN_CREATE_MUTABLE_FORMAT_BIT_KHR".enum(0x00000004)
    )
}