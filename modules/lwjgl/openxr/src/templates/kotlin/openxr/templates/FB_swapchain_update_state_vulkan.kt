/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val FB_swapchain_update_state_vulkan = "FBSwapchainUpdateStateVulkan".nativeClassXR("FB_swapchain_update_state_vulkan", type = "instance", postfix = "FB") {
    documentation =
        """
        The $templateName extension.
        """

    IntConstant(
        "The extension specification version.",

        "FB_swapchain_update_state_vulkan_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "FB_SWAPCHAIN_UPDATE_STATE_VULKAN_EXTENSION_NAME".."XR_FB_swapchain_update_state_vulkan"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_SWAPCHAIN_STATE_SAMPLER_VULKAN_FB".."1000163000"
    )
}