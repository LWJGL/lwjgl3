/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_shader_demote_to_helper_invocation = "EXTShaderDemoteToHelperInvocation".nativeClassVK("EXT_shader_demote_to_helper_invocation", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_SHADER_DEMOTE_TO_HELPER_INVOCATION_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_SHADER_DEMOTE_TO_HELPER_INVOCATION_EXTENSION_NAME".."VK_EXT_shader_demote_to_helper_invocation"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DEMOTE_TO_HELPER_INVOCATION_FEATURES_EXT".."1000276000"
    )
}