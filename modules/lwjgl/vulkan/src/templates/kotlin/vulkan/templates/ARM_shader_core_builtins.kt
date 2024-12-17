/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val ARM_shader_core_builtins = "ARMShaderCoreBuiltins".nativeClassVK("ARM_shader_core_builtins", type = "device", postfix = "ARM") {
    IntConstant(
        "ARM_SHADER_CORE_BUILTINS_SPEC_VERSION".."2"
    )

    StringConstant(
        "ARM_SHADER_CORE_BUILTINS_EXTENSION_NAME".."VK_ARM_shader_core_builtins"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_BUILTINS_FEATURES_ARM".."1000497000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_BUILTINS_PROPERTIES_ARM".."1000497001"
    )
}