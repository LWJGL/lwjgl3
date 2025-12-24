/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_shader_long_vector = "EXTShaderLongVector".nativeClassVK("EXT_shader_long_vector", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_SHADER_LONG_VECTOR_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_SHADER_LONG_VECTOR_EXTENSION_NAME".."VK_EXT_shader_long_vector"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_LONG_VECTOR_FEATURES_EXT".."1000635000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_LONG_VECTOR_PROPERTIES_EXT".."1000635001"
    )
}