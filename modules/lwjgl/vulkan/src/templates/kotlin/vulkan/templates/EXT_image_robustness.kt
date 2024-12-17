/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_image_robustness = "EXTImageRobustness".nativeClassVK("EXT_image_robustness", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_IMAGE_ROBUSTNESS_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_IMAGE_ROBUSTNESS_EXTENSION_NAME".."VK_EXT_image_robustness"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ROBUSTNESS_FEATURES_EXT".."1000335000"
    )
}