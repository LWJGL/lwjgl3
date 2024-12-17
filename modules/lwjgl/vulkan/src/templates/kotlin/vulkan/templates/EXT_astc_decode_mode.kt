/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_astc_decode_mode = "EXTAstcDecodeMode".nativeClassVK("EXT_astc_decode_mode", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_ASTC_DECODE_MODE_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_ASTC_DECODE_MODE_EXTENSION_NAME".."VK_EXT_astc_decode_mode"
    )

    EnumConstant(
        "STRUCTURE_TYPE_IMAGE_VIEW_ASTC_DECODE_MODE_EXT".."1000067000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_ASTC_DECODE_FEATURES_EXT".."1000067001"
    )
}