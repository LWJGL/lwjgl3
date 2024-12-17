/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_sampler_mirror_clamp_to_edge = "KHRSamplerMirrorClampToEdge".nativeClassVK("KHR_sampler_mirror_clamp_to_edge", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_SAMPLER_MIRROR_CLAMP_TO_EDGE_SPEC_VERSION".."3"
    )

    StringConstant(
        "KHR_SAMPLER_MIRROR_CLAMP_TO_EDGE_EXTENSION_NAME".."VK_KHR_sampler_mirror_clamp_to_edge"
    )

    EnumConstant(
        "SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE".."4",
        "SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE_KHR".."4"
    )
}