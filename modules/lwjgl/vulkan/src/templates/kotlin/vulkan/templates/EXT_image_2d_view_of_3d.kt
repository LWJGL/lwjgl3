/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_image_2d_view_of_3d = "EXTImage2dViewOf3d".nativeClassVK("EXT_image_2d_view_of_3d", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_IMAGE_2D_VIEW_OF_3D_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_IMAGE_2D_VIEW_OF_3D_EXTENSION_NAME".."VK_EXT_image_2d_view_of_3d"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_2D_VIEW_OF_3D_FEATURES_EXT".."1000393000"
    )

    EnumConstant(
        "IMAGE_CREATE_2D_VIEW_COMPATIBLE_BIT_EXT".enum(0x00020000)
    )
}