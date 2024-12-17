/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_non_seamless_cube_map = "EXTNonSeamlessCubeMap".nativeClassVK("EXT_non_seamless_cube_map", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_NON_SEAMLESS_CUBE_MAP_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_NON_SEAMLESS_CUBE_MAP_EXTENSION_NAME".."VK_EXT_non_seamless_cube_map"
    )

    EnumConstant(
        "SAMPLER_CREATE_NON_SEAMLESS_CUBE_MAP_BIT_EXT".enum(0x00000004)
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_NON_SEAMLESS_CUBE_MAP_FEATURES_EXT".."1000422000"
    )
}