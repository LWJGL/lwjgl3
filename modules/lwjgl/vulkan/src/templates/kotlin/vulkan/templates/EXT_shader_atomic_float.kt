/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_shader_atomic_float = "EXTShaderAtomicFloat".nativeClassVK("EXT_shader_atomic_float", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_SHADER_ATOMIC_FLOAT_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_SHADER_ATOMIC_FLOAT_EXTENSION_NAME".."VK_EXT_shader_atomic_float"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_FEATURES_EXT".."1000260000"
    )
}