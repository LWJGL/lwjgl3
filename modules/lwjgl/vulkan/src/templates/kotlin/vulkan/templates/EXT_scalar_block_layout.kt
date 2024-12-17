/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_scalar_block_layout = "EXTScalarBlockLayout".nativeClassVK("EXT_scalar_block_layout", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_SCALAR_BLOCK_LAYOUT_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_SCALAR_BLOCK_LAYOUT_EXTENSION_NAME".."VK_EXT_scalar_block_layout"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SCALAR_BLOCK_LAYOUT_FEATURES_EXT".."1000221000"
    )
}