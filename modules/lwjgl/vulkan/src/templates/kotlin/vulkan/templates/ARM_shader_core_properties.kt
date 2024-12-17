/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val ARM_shader_core_properties = "ARMShaderCoreProperties".nativeClassVK("ARM_shader_core_properties", type = "device", postfix = "ARM") {
    IntConstant(
        "ARM_SHADER_CORE_PROPERTIES_SPEC_VERSION".."1"
    )

    StringConstant(
        "ARM_SHADER_CORE_PROPERTIES_EXTENSION_NAME".."VK_ARM_shader_core_properties"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_ARM".."1000415000"
    )
}