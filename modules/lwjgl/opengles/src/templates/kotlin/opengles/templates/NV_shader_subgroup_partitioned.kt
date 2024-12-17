/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_shader_subgroup_partitioned = "NVShaderSubgroupPartitioned".nativeClassGLES("NV_shader_subgroup_partitioned", postfix = NV) {
    IntConstant(
        "SUBGROUP_FEATURE_PARTITIONED_BIT_NV"..0x00000100
    )
}