/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_shader_abort = "KHRShaderAbort".nativeClassVK("KHR_shader_abort", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_SHADER_ABORT_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_SHADER_ABORT_EXTENSION_NAME".."VK_KHR_shader_abort"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ABORT_FEATURES_KHR".."1000233000",
        "STRUCTURE_TYPE_DEVICE_FAULT_SHADER_ABORT_MESSAGE_INFO_KHR".."1000233001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ABORT_PROPERTIES_KHR".."1000233002"
    )
}