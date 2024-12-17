/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_separate_stencil_usage = "EXTSeparateStencilUsage".nativeClassVK("EXT_separate_stencil_usage", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_SEPARATE_STENCIL_USAGE_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_SEPARATE_STENCIL_USAGE_EXTENSION_NAME".."VK_EXT_separate_stencil_usage"
    )

    EnumConstant(
        "STRUCTURE_TYPE_IMAGE_STENCIL_USAGE_CREATE_INFO_EXT".."1000246000"
    )
}