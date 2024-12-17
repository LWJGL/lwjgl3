/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val KHR_swapchain_usage_input_attachment_bit = "KHRSwapchainUsageInputAttachmentBit".nativeClassXR("KHR_swapchain_usage_input_attachment_bit", type = "instance", postfix = "KHR") {
    IntConstant(
        "KHR_swapchain_usage_input_attachment_bit_SPEC_VERSION".."3"
    )

    StringConstant(
        "KHR_SWAPCHAIN_USAGE_INPUT_ATTACHMENT_BIT_EXTENSION_NAME".."XR_KHR_swapchain_usage_input_attachment_bit"
    )

    EnumConstant(
        "SWAPCHAIN_USAGE_INPUT_ATTACHMENT_BIT_KHR".enum(0x00000080)
    )
}