/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_shader_sm_builtins = "NVShaderSmBuiltins".nativeClassVK("NV_shader_sm_builtins", type = "device", postfix = "NV") {
    IntConstant(
        "NV_SHADER_SM_BUILTINS_SPEC_VERSION".."1"
    )

    StringConstant(
        "NV_SHADER_SM_BUILTINS_EXTENSION_NAME".."VK_NV_shader_sm_builtins"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SM_BUILTINS_FEATURES_NV".."1000154000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SM_BUILTINS_PROPERTIES_NV".."1000154001"
    )
}