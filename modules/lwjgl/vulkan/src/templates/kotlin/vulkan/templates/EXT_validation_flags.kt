/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_validation_flags = "EXTValidationFlags".nativeClassVK("EXT_validation_flags", type = "instance", postfix = "EXT") {
    IntConstant(
        "EXT_VALIDATION_FLAGS_SPEC_VERSION".."3"
    )

    StringConstant(
        "EXT_VALIDATION_FLAGS_EXTENSION_NAME".."VK_EXT_validation_flags"
    )

    EnumConstant(
        "STRUCTURE_TYPE_VALIDATION_FLAGS_EXT".."1000061000"
    )

    EnumConstant(
        "VALIDATION_CHECK_ALL_EXT".."0",
        "VALIDATION_CHECK_SHADERS_EXT".."1"
    )
}