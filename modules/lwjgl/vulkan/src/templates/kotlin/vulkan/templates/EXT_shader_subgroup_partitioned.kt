/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_shader_subgroup_partitioned = "EXTShaderSubgroupPartitioned".nativeClassVK("EXT_shader_subgroup_partitioned", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_SHADER_SUBGROUP_PARTITIONED_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_SHADER_SUBGROUP_PARTITIONED_EXTENSION_NAME".."VK_EXT_shader_subgroup_partitioned"
    )

    EnumConstant(
        "SUBGROUP_FEATURE_PARTITIONED_BIT_EXT".enum(0x00000100)
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_PARTITIONED_FEATURES_EXT".."1000662000"
    )
}