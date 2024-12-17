/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_ycbcr_2plane_444_formats = "EXTYcbcr2plane444Formats".nativeClassVK("EXT_ycbcr_2plane_444_formats", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_YCBCR_2PLANE_444_FORMATS_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_YCBCR_2PLANE_444_FORMATS_EXTENSION_NAME".."VK_EXT_ycbcr_2plane_444_formats"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_2_PLANE_444_FORMATS_FEATURES_EXT".."1000330000"
    )

    EnumConstant(
        "FORMAT_G8_B8R8_2PLANE_444_UNORM_EXT".."1000330000",
        "FORMAT_G10X6_B10X6R10X6_2PLANE_444_UNORM_3PACK16_EXT".."1000330001",
        "FORMAT_G12X4_B12X4R12X4_2PLANE_444_UNORM_3PACK16_EXT".."1000330002",
        "FORMAT_G16_B16R16_2PLANE_444_UNORM_EXT".."1000330003"
    )
}