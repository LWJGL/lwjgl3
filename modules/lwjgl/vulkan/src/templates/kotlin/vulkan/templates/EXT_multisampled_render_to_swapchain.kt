/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_multisampled_render_to_swapchain = "EXTMultisampledRenderToSwapchain".nativeClassVK("EXT_multisampled_render_to_swapchain", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_MULTISAMPLED_RENDER_TO_SWAPCHAIN_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_MULTISAMPLED_RENDER_TO_SWAPCHAIN_EXTENSION_NAME".."VK_EXT_multisampled_render_to_swapchain"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTISAMPLED_RENDER_TO_SWAPCHAIN_FEATURES_EXT".."1000616000",
        "STRUCTURE_TYPE_SWAPCHAIN_FLAGS_SURFACE_CAPABILITIES_EXT".."1000616001"
    )

    EnumConstant(
        "SWAPCHAIN_CREATE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_BIT_EXT".enum(0x00000100)
    )
}