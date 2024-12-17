/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_conservative_rasterization = "EXTConservativeRasterization".nativeClassVK("EXT_conservative_rasterization", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_CONSERVATIVE_RASTERIZATION_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_CONSERVATIVE_RASTERIZATION_EXTENSION_NAME".."VK_EXT_conservative_rasterization"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_CONSERVATIVE_RASTERIZATION_PROPERTIES_EXT".."1000101000",
        "STRUCTURE_TYPE_PIPELINE_RASTERIZATION_CONSERVATIVE_STATE_CREATE_INFO_EXT".."1000101001"
    )

    EnumConstant(
        "CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT".."0",
        "CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT".."1",
        "CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT".."2"
    )
}