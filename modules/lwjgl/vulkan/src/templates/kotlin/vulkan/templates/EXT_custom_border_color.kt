/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_custom_border_color = "EXTCustomBorderColor".nativeClassVK("EXT_custom_border_color", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_CUSTOM_BORDER_COLOR_SPEC_VERSION".."12"
    )

    StringConstant(
        "EXT_CUSTOM_BORDER_COLOR_EXTENSION_NAME".."VK_EXT_custom_border_color"
    )

    EnumConstant(
        "STRUCTURE_TYPE_SAMPLER_CUSTOM_BORDER_COLOR_CREATE_INFO_EXT".."1000287000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_PROPERTIES_EXT".."1000287001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_FEATURES_EXT".."1000287002"
    )

    EnumConstant(
        "BORDER_COLOR_FLOAT_CUSTOM_EXT".."1000287003",
        "BORDER_COLOR_INT_CUSTOM_EXT".."1000287004"
    )
}