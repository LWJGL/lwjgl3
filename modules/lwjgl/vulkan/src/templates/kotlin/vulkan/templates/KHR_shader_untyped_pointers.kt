/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_shader_untyped_pointers = "KHRShaderUntypedPointers".nativeClassVK("KHR_shader_untyped_pointers", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_SHADER_UNTYPED_POINTERS_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_SHADER_UNTYPED_POINTERS_EXTENSION_NAME".."VK_KHR_shader_untyped_pointers"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_UNTYPED_POINTERS_FEATURES_KHR".."1000387000"
    )
}