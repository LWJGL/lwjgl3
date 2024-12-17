/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_shader_tile_image = "EXTShaderTileImage".nativeClassVK("EXT_shader_tile_image", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_SHADER_TILE_IMAGE_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_SHADER_TILE_IMAGE_EXTENSION_NAME".."VK_EXT_shader_tile_image"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TILE_IMAGE_FEATURES_EXT".."1000395000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TILE_IMAGE_PROPERTIES_EXT".."1000395001"
    )
}