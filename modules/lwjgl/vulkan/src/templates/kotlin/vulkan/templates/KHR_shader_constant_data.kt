/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_shader_constant_data = "KHRShaderConstantData".nativeClassVK("KHR_shader_constant_data", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_SHADER_CONSTANT_DATA_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_SHADER_CONSTANT_DATA_EXTENSION_NAME".."VK_KHR_shader_constant_data"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CONSTANT_DATA_FEATURES_KHR".."1000231000"
    )
}