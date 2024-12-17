/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_corner_sampled_image = "NVCornerSampledImage".nativeClassVK("NV_corner_sampled_image", type = "device", postfix = "NV") {
    IntConstant(
        "NV_CORNER_SAMPLED_IMAGE_SPEC_VERSION".."2"
    )

    StringConstant(
        "NV_CORNER_SAMPLED_IMAGE_EXTENSION_NAME".."VK_NV_corner_sampled_image"
    )

    EnumConstant(
        "IMAGE_CREATE_CORNER_SAMPLED_BIT_NV".enum(0x00002000)
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_CORNER_SAMPLED_IMAGE_FEATURES_NV".."1000050000"
    )
}