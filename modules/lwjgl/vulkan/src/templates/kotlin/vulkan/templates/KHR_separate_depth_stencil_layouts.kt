/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_separate_depth_stencil_layouts = "KHRSeparateDepthStencilLayouts".nativeClassVK("KHR_separate_depth_stencil_layouts", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_SEPARATE_DEPTH_STENCIL_LAYOUTS_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_SEPARATE_DEPTH_STENCIL_LAYOUTS_EXTENSION_NAME".."VK_KHR_separate_depth_stencil_layouts"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SEPARATE_DEPTH_STENCIL_LAYOUTS_FEATURES_KHR".."1000241000",
        "STRUCTURE_TYPE_ATTACHMENT_REFERENCE_STENCIL_LAYOUT_KHR".."1000241001",
        "STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_STENCIL_LAYOUT_KHR".."1000241002"
    )

    EnumConstant(
        "IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL_KHR".."1000241000",
        "IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL_KHR".."1000241001",
        "IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL_KHR".."1000241002",
        "IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL_KHR".."1000241003"
    )
}