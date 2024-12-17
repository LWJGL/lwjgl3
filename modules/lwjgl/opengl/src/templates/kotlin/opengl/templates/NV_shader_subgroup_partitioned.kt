/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_shader_subgroup_partitioned = "NVShaderSubgroupPartitioned".nativeClassGL("NV_shader_subgroup_partitioned", postfix = NV) {
    IntConstant(
        "SUBGROUP_FEATURE_PARTITIONED_BIT_NV"..0x00000100
    )
}