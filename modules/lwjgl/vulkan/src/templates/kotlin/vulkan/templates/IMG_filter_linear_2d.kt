/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val IMG_filter_linear_2d = "IMGFilterLinear2d".nativeClassVK("IMG_filter_linear_2d", type = "device", postfix = "IMG") {
    IntConstant(
        "IMG_FILTER_LINEAR_2D_SPEC_VERSION".."1"
    )

    StringConstant(
        "IMG_FILTER_LINEAR_2D_EXTENSION_NAME".."VK_IMG_filter_linear_2d"
    )

    EnumConstantLong(
        "FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_LINEAR_2D_BIT_IMG".enum(0x200000000000L)
    )
}