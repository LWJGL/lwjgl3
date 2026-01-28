/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_fragment_density_map = "EXTFragmentDensityMap".nativeClassVK("EXT_fragment_density_map", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_FRAGMENT_DENSITY_MAP_SPEC_VERSION".."3"
    )

    StringConstant(
        "EXT_FRAGMENT_DENSITY_MAP_EXTENSION_NAME".."VK_EXT_fragment_density_map"
    )

    EnumConstant(
        "STRUCTURE_TYPE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_INFO_EXT".."1000044007",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_FEATURES_EXT".."1000218000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_PROPERTIES_EXT".."1000218001",
        "STRUCTURE_TYPE_RENDER_PASS_FRAGMENT_DENSITY_MAP_CREATE_INFO_EXT".."1000218002"
    )

    EnumConstant(
        "IMAGE_CREATE_SUBSAMPLED_BIT_EXT".enum(0x00004000)
    )

    EnumConstant(
        "IMAGE_LAYOUT_FRAGMENT_DENSITY_MAP_OPTIMAL_EXT".."1000218000"
    )

    EnumConstant(
        "ACCESS_FRAGMENT_DENSITY_MAP_READ_BIT_EXT".enum(0x01000000)
    )

    EnumConstant(
        "FORMAT_FEATURE_FRAGMENT_DENSITY_MAP_BIT_EXT".enum(0x01000000)
    )

    EnumConstant(
        "IMAGE_USAGE_FRAGMENT_DENSITY_MAP_BIT_EXT".enum(0x00000200)
    )

    EnumConstant(
        "IMAGE_VIEW_CREATE_FRAGMENT_DENSITY_MAP_DYNAMIC_BIT_EXT".enum(0x00000001)
    )

    EnumConstant(
        "PIPELINE_STAGE_FRAGMENT_DENSITY_PROCESS_BIT_EXT".enum(0x00800000)
    )

    EnumConstant(
        "SAMPLER_CREATE_SUBSAMPLED_BIT_EXT".enum(0x00000001),
        "SAMPLER_CREATE_SUBSAMPLED_COARSE_RECONSTRUCTION_BIT_EXT".enum(0x00000002)
    )

    EnumConstantLong(
        "FORMAT_FEATURE_2_FRAGMENT_DENSITY_MAP_BIT_EXT".enum(0x01000000L)
    )

    EnumConstant(
        "PIPELINE_CREATE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT".enum(0x00400000),
        "PIPELINE_RASTERIZATION_STATE_CREATE_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT".enum(0x00400000)
    )
}