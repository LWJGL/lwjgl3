/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_shader_terminate_invocation = "KHRShaderTerminateInvocation".nativeClassVK("KHR_shader_terminate_invocation", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_SHADER_TERMINATE_INVOCATION_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_SHADER_TERMINATE_INVOCATION_EXTENSION_NAME".."VK_KHR_shader_terminate_invocation"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TERMINATE_INVOCATION_FEATURES_KHR".."1000215000"
    )
}