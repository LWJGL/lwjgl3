/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_shader_float16_int8 = "KHRShaderFloat16Int8".nativeClassVK("KHR_shader_float16_int8", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_SHADER_FLOAT16_INT8_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_SHADER_FLOAT16_INT8_EXTENSION_NAME".."VK_KHR_shader_float16_int8"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES_KHR".."1000082000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FLOAT16_INT8_FEATURES_KHR".."1000082000"
    )
}