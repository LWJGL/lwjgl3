/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_fragment_shader_barycentric = "NVFragmentShaderBarycentric".nativeClassVK("NV_fragment_shader_barycentric", type = "device", postfix = "NV") {
    IntConstant(
        "NV_FRAGMENT_SHADER_BARYCENTRIC_SPEC_VERSION".."1"
    )

    StringConstant(
        "NV_FRAGMENT_SHADER_BARYCENTRIC_EXTENSION_NAME".."VK_NV_fragment_shader_barycentric"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES_NV".."1000203000"
    )
}