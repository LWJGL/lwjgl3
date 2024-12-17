/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_shader_image_footprint = "NVShaderImageFootprint".nativeClassVK("NV_shader_image_footprint", type = "device", postfix = "NV") {
    IntConstant(
        "NV_SHADER_IMAGE_FOOTPRINT_SPEC_VERSION".."2"
    )

    StringConstant(
        "NV_SHADER_IMAGE_FOOTPRINT_EXTENSION_NAME".."VK_NV_shader_image_footprint"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_IMAGE_FOOTPRINT_FEATURES_NV".."1000204000"
    )
}