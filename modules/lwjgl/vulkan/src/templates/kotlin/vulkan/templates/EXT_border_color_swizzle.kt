/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_border_color_swizzle = "EXTBorderColorSwizzle".nativeClassVK("EXT_border_color_swizzle", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_BORDER_COLOR_SWIZZLE_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_BORDER_COLOR_SWIZZLE_EXTENSION_NAME".."VK_EXT_border_color_swizzle"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_BORDER_COLOR_SWIZZLE_FEATURES_EXT".."1000411000",
        "STRUCTURE_TYPE_SAMPLER_BORDER_COLOR_COMPONENT_MAPPING_CREATE_INFO_EXT".."1000411001"
    )
}