/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_filter_cubic = "EXTFilterCubic".nativeClassVK("EXT_filter_cubic", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_FILTER_CUBIC_SPEC_VERSION".."3"
    )

    StringConstant(
        "EXT_FILTER_CUBIC_EXTENSION_NAME".."VK_EXT_filter_cubic"
    )

    EnumConstant(
        "FILTER_CUBIC_EXT".."1000015000"
    )

    EnumConstant(
        "FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT".enum(0x00002000)
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_VIEW_IMAGE_FORMAT_INFO_EXT".."1000170000",
        "STRUCTURE_TYPE_FILTER_CUBIC_IMAGE_VIEW_IMAGE_FORMAT_PROPERTIES_EXT".."1000170001"
    )
}