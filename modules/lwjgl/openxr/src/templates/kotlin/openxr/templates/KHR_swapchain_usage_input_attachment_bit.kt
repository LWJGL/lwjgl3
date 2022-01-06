/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val KHR_swapchain_usage_input_attachment_bit = "KHRSwapchainUsageInputAttachmentBit".nativeClassXR("KHR_swapchain_usage_input_attachment_bit", type = "instance", postfix = "KHR") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "KHR_swapchain_usage_input_attachment_bit_SPEC_VERSION".."3"
    )

    StringConstant(
        "The extension name.",

        "KHR_SWAPCHAIN_USAGE_INPUT_ATTACHMENT_BIT_EXTENSION_NAME".."XR_KHR_swapchain_usage_input_attachment_bit"
    )

    EnumConstant(
        "Extends {@code XrSwapchainUsageFlagBits}.",

        "SWAPCHAIN_USAGE_INPUT_ATTACHMENT_BIT_KHR".enum(0x00000080)
    )
}