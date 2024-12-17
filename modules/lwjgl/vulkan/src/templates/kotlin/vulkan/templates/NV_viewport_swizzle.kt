/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_viewport_swizzle = "NVViewportSwizzle".nativeClassVK("NV_viewport_swizzle", type = "device", postfix = "NV") {
    IntConstant(
        "NV_VIEWPORT_SWIZZLE_SPEC_VERSION".."1"
    )

    StringConstant(
        "NV_VIEWPORT_SWIZZLE_EXTENSION_NAME".."VK_NV_viewport_swizzle"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PIPELINE_VIEWPORT_SWIZZLE_STATE_CREATE_INFO_NV".."1000098000"
    )

    EnumConstant(
        "VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_X_NV".."0",
        "VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_X_NV".."1",
        "VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Y_NV".."2",
        "VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Y_NV".."3",
        "VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Z_NV".."4",
        "VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Z_NV".."5",
        "VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_W_NV".."6",
        "VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_W_NV".."7"
    )
}