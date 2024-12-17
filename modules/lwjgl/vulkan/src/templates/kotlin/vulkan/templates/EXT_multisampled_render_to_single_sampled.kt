/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_multisampled_render_to_single_sampled = "EXTMultisampledRenderToSingleSampled".nativeClassVK("EXT_multisampled_render_to_single_sampled", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_EXTENSION_NAME".."VK_EXT_multisampled_render_to_single_sampled"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_FEATURES_EXT".."1000376000",
        "STRUCTURE_TYPE_SUBPASS_RESOLVE_PERFORMANCE_QUERY_EXT".."1000376001",
        "STRUCTURE_TYPE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_INFO_EXT".."1000376002"
    )

    EnumConstant(
        "IMAGE_CREATE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_BIT_EXT".enum(0x00040000)
    )
}