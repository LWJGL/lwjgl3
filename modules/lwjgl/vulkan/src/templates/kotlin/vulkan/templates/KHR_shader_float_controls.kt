/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_shader_float_controls = "KHRShaderFloatControls".nativeClassVK("KHR_shader_float_controls", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_SHADER_FLOAT_CONTROLS_SPEC_VERSION".."4"
    )

    StringConstant(
        "KHR_SHADER_FLOAT_CONTROLS_EXTENSION_NAME".."VK_KHR_shader_float_controls"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FLOAT_CONTROLS_PROPERTIES_KHR".."1000197000"
    )

    EnumConstant(
        "SHADER_FLOAT_CONTROLS_INDEPENDENCE_32_BIT_ONLY_KHR".."0",
        "SHADER_FLOAT_CONTROLS_INDEPENDENCE_ALL_KHR".."1",
        "SHADER_FLOAT_CONTROLS_INDEPENDENCE_NONE_KHR".."2"
    )
}