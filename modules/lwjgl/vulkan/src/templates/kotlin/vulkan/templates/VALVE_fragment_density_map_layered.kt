/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val VALVE_fragment_density_map_layered = "VALVEFragmentDensityMapLayered".nativeClassVK("VALVE_fragment_density_map_layered", type = "device", postfix = "VALVE") {
    IntConstant(
        "VALVE_FRAGMENT_DENSITY_MAP_LAYERED_SPEC_VERSION".."1"
    )

    StringConstant(
        "VALVE_FRAGMENT_DENSITY_MAP_LAYERED_EXTENSION_NAME".."VK_VALVE_fragment_density_map_layered"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_LAYERED_FEATURES_VALVE".."1000611000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_LAYERED_PROPERTIES_VALVE".."1000611001",
        "STRUCTURE_TYPE_PIPELINE_FRAGMENT_DENSITY_MAP_LAYERED_CREATE_INFO_VALVE".."1000611002"
    )

    EnumConstant(
        "RENDER_PASS_CREATE_PER_LAYER_FRAGMENT_DENSITY_BIT_VALVE".enum(0x00000004)
    )

    EnumConstant(
        "RENDERING_PER_LAYER_FRAGMENT_DENSITY_BIT_VALVE".enum(0x00000020)
    )

    EnumConstantLong(
        "PIPELINE_CREATE_2_PER_LAYER_FRAGMENT_DENSITY_BIT_VALVE".enum(0x10000000000L)
    )
}