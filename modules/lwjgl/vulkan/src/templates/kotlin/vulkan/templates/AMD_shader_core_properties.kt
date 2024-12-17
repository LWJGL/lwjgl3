/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val AMD_shader_core_properties = "AMDShaderCoreProperties".nativeClassVK("AMD_shader_core_properties", type = "device", postfix = "AMD") {
    IntConstant(
        "AMD_SHADER_CORE_PROPERTIES_SPEC_VERSION".."2"
    )

    StringConstant(
        "AMD_SHADER_CORE_PROPERTIES_EXTENSION_NAME".."VK_AMD_shader_core_properties"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_AMD".."1000185000"
    )
}