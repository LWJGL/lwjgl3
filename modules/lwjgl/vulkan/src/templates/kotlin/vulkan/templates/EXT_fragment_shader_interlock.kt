/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_fragment_shader_interlock = "EXTFragmentShaderInterlock".nativeClassVK("EXT_fragment_shader_interlock", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_FRAGMENT_SHADER_INTERLOCK_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_FRAGMENT_SHADER_INTERLOCK_EXTENSION_NAME".."VK_EXT_fragment_shader_interlock"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_INTERLOCK_FEATURES_EXT".."1000251000"
    )
}