/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_image_sliced_view_of_3d = "EXTImageSlicedViewOf3d".nativeClassVK("EXT_image_sliced_view_of_3d", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_IMAGE_SLICED_VIEW_OF_3D_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_IMAGE_SLICED_VIEW_OF_3D_EXTENSION_NAME".."VK_EXT_image_sliced_view_of_3d"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_SLICED_VIEW_OF_3D_FEATURES_EXT".."1000418000",
        "STRUCTURE_TYPE_IMAGE_VIEW_SLICED_CREATE_INFO_EXT".."1000418001"
    )

    EnumConstant(
        "REMAINING_3D_SLICES_EXT".."(~0)"
    )
}