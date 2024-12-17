/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_shader_integer_dot_product = "KHRShaderIntegerDotProduct".nativeClassVK("KHR_shader_integer_dot_product", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_SHADER_INTEGER_DOT_PRODUCT_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_SHADER_INTEGER_DOT_PRODUCT_EXTENSION_NAME".."VK_KHR_shader_integer_dot_product"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_FEATURES_KHR".."1000280000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_DOT_PRODUCT_PROPERTIES_KHR".."1000280001"
    )
}