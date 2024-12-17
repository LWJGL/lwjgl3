/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_image_view_min_lod = "EXTImageViewMinLod".nativeClassVK("EXT_image_view_min_lod", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_IMAGE_VIEW_MIN_LOD_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_IMAGE_VIEW_MIN_LOD_EXTENSION_NAME".."VK_EXT_image_view_min_lod"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_VIEW_MIN_LOD_FEATURES_EXT".."1000391000",
        "STRUCTURE_TYPE_IMAGE_VIEW_MIN_LOD_CREATE_INFO_EXT".."1000391001"
    )
}