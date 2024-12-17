/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val AMD_shader_core_properties2 = "AMDShaderCoreProperties2".nativeClassVK("AMD_shader_core_properties2", type = "device", postfix = "AMD") {
    IntConstant(
        "AMD_SHADER_CORE_PROPERTIES_2_SPEC_VERSION".."1"
    )

    StringConstant(
        "AMD_SHADER_CORE_PROPERTIES_2_EXTENSION_NAME".."VK_AMD_shader_core_properties2"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_2_AMD".."1000227000"
    )
}