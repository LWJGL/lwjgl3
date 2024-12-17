/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_fragment_density_map2 = "EXTFragmentDensityMap2".nativeClassVK("EXT_fragment_density_map2", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_FRAGMENT_DENSITY_MAP_2_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_FRAGMENT_DENSITY_MAP_2_EXTENSION_NAME".."VK_EXT_fragment_density_map2"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_FEATURES_EXT".."1000332000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_PROPERTIES_EXT".."1000332001"
    )

    EnumConstant(
        "IMAGE_VIEW_CREATE_FRAGMENT_DENSITY_MAP_DEFERRED_BIT_EXT".enum(0x00000002)
    )
}