/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_shader_subgroup_rotate = "KHRShaderSubgroupRotate".nativeClassVK("KHR_shader_subgroup_rotate", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_SHADER_SUBGROUP_ROTATE_SPEC_VERSION".."2"
    )

    StringConstant(
        "KHR_SHADER_SUBGROUP_ROTATE_EXTENSION_NAME".."VK_KHR_shader_subgroup_rotate"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_ROTATE_FEATURES_KHR".."1000416000"
    )

    EnumConstant(
        "SUBGROUP_FEATURE_ROTATE_BIT_KHR".enum(0x00000200),
        "SUBGROUP_FEATURE_ROTATE_CLUSTERED_BIT_KHR".enum(0x00000400)
    )
}