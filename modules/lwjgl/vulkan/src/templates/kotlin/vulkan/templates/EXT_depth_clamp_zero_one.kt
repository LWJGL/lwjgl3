/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_depth_clamp_zero_one = "EXTDepthClampZeroOne".nativeClassVK("EXT_depth_clamp_zero_one", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_DEPTH_CLAMP_ZERO_ONE_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_DEPTH_CLAMP_ZERO_ONE_EXTENSION_NAME".."VK_EXT_depth_clamp_zero_one"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLAMP_ZERO_ONE_FEATURES_EXT".."1000421000"
    )
}