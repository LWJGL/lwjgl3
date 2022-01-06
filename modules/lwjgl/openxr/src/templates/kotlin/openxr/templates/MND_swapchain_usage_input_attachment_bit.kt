/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val MND_swapchain_usage_input_attachment_bit = "MNDSwapchainUsageInputAttachmentBit".nativeClassXR("MND_swapchain_usage_input_attachment_bit", type = "instance", postfix = "MND") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "MND_swapchain_usage_input_attachment_bit_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "MND_SWAPCHAIN_USAGE_INPUT_ATTACHMENT_BIT_EXTENSION_NAME".."XR_MND_swapchain_usage_input_attachment_bit"
    )

    EnumConstant(
        "Extends {@code XrSwapchainUsageFlagBits}.",

        "SWAPCHAIN_USAGE_INPUT_ATTACHMENT_BIT_MND".enum(0x00000080)
    )
}