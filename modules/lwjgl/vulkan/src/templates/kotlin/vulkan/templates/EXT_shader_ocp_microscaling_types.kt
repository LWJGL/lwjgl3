/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_shader_ocp_microscaling_types = "EXTShaderOcpMicroscalingTypes".nativeClassVK("EXT_shader_ocp_microscaling_types", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_SHADER_OCP_MICROSCALING_TYPES_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_SHADER_OCP_MICROSCALING_TYPES_EXTENSION_NAME".."VK_EXT_shader_ocp_microscaling_types"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OCP_MICROSCALING_TYPES_FEATURES_EXT".."1000672000"
    )

    EnumConstant(
        "COMPONENT_TYPE_FLOAT6_E2M3_EXT".."1000672000",
        "COMPONENT_TYPE_FLOAT6_E3M2_EXT".."1000672001",
        "COMPONENT_TYPE_FLOAT4_E2M1_EXT".."1000672002",
        "COMPONENT_TYPE_FLOAT8_UNSIGNED_E8M0_EXT".."1000672003",
        "COMPONENT_TYPE_MXINT8_EXT".."1000672004"
    )
}