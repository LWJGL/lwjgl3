/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_fragment_shader_barycentric = "KHRFragmentShaderBarycentric".nativeClassVK("KHR_fragment_shader_barycentric", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_FRAGMENT_SHADER_BARYCENTRIC_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_FRAGMENT_SHADER_BARYCENTRIC_EXTENSION_NAME".."VK_KHR_fragment_shader_barycentric"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES_KHR".."1000203000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_PROPERTIES_KHR".."1000322000"
    )
}