/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_shader_bfloat16 = "KHRShaderBfloat16".nativeClassVK("KHR_shader_bfloat16", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_SHADER_BFLOAT16_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_SHADER_BFLOAT16_EXTENSION_NAME".."VK_KHR_shader_bfloat16"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_BFLOAT16_FEATURES_KHR".."1000141000"
    )

    EnumConstant(
        "COMPONENT_TYPE_BFLOAT16_KHR".."1000141000"
    )
}