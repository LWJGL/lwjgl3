/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_depth_stencil_resolve = "KHRDepthStencilResolve".nativeClassVK("KHR_depth_stencil_resolve", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_DEPTH_STENCIL_RESOLVE_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_DEPTH_STENCIL_RESOLVE_EXTENSION_NAME".."VK_KHR_depth_stencil_resolve"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES_KHR".."1000199000",
        "STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE_KHR".."1000199001"
    )

    EnumConstant(
        "RESOLVE_MODE_NONE_KHR".."0",
        "RESOLVE_MODE_SAMPLE_ZERO_BIT_KHR".enum(0x00000001),
        "RESOLVE_MODE_AVERAGE_BIT_KHR".enum(0x00000002),
        "RESOLVE_MODE_MIN_BIT_KHR".enum(0x00000004),
        "RESOLVE_MODE_MAX_BIT_KHR".enum(0x00000008)
    )
}