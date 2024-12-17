/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val IMG_filter_cubic = "IMGFilterCubic".nativeClassVK("IMG_filter_cubic", type = "device", postfix = "IMG") {
    IntConstant(
        "IMG_FILTER_CUBIC_SPEC_VERSION".."1"
    )

    StringConstant(
        "IMG_FILTER_CUBIC_EXTENSION_NAME".."VK_IMG_filter_cubic"
    )

    EnumConstant(
        "FILTER_CUBIC_IMG".."1000015000"
    )

    EnumConstant(
        "FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG".enum(0x00002000)
    )
}