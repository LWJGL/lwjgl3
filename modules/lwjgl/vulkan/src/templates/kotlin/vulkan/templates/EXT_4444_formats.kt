/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_4444_formats = "EXT4444Formats".nativeClassVK("EXT_4444_formats", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_4444_FORMATS_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_4444_FORMATS_EXTENSION_NAME".."VK_EXT_4444_formats"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_4444_FORMATS_FEATURES_EXT".."1000340000"
    )

    EnumConstant(
        "FORMAT_A4R4G4B4_UNORM_PACK16_EXT".."1000340000",
        "FORMAT_A4B4G4R4_UNORM_PACK16_EXT".."1000340001"
    )
}