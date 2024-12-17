/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_frame_boundary = "EXTFrameBoundary".nativeClassVK("EXT_frame_boundary", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_FRAME_BOUNDARY_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_FRAME_BOUNDARY_EXTENSION_NAME".."VK_EXT_frame_boundary"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAME_BOUNDARY_FEATURES_EXT".."1000375000",
        "STRUCTURE_TYPE_FRAME_BOUNDARY_EXT".."1000375001"
    )

    EnumConstant(
        "FRAME_BOUNDARY_FRAME_END_BIT_EXT".enum(0x00000001)
    )
}