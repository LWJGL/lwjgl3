/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_subgroup_size_control = "EXTSubgroupSizeControl".nativeClassVK("EXT_subgroup_size_control", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_SUBGROUP_SIZE_CONTROL_SPEC_VERSION".."2"
    )

    StringConstant(
        "EXT_SUBGROUP_SIZE_CONTROL_EXTENSION_NAME".."VK_EXT_subgroup_size_control"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_PROPERTIES_EXT".."1000225000",
        "STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO_EXT".."1000225001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES_EXT".."1000225002"
    )

    EnumConstant(
        "PIPELINE_SHADER_STAGE_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT_EXT".enum(0x00000001),
        "PIPELINE_SHADER_STAGE_CREATE_REQUIRE_FULL_SUBGROUPS_BIT_EXT".enum(0x00000002)
    )
}