/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_shader_clock = "KHRShaderClock".nativeClassVK("KHR_shader_clock", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_SHADER_CLOCK_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_SHADER_CLOCK_EXTENSION_NAME".."VK_KHR_shader_clock"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CLOCK_FEATURES_KHR".."1000181000"
    )
}