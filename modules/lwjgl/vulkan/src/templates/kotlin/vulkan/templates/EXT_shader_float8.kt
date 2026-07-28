/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_shader_float8 = "EXTShaderFloat8".nativeClassVK("EXT_shader_float8", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_SHADER_FLOAT8_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_SHADER_FLOAT8_EXTENSION_NAME".."VK_EXT_shader_float8"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT8_FEATURES_EXT".."1000567000"
    )

    EnumConstant(
        "COMPONENT_TYPE_FLOAT8_E4M3_EXT".."1000491002",
        "COMPONENT_TYPE_FLOAT8_E5M2_EXT".."1000491003"
    )
}