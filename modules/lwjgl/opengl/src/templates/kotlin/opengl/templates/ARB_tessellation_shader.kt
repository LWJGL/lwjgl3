/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_tessellation_shader = "ARBTessellationShader".nativeClassGL("ARB_tessellation_shader") {
    IntConstant(
        "PATCHES"..0xE
    )

    IntConstant(
        "PATCH_VERTICES"..0x8E72
    )

    IntConstant(
        "PATCH_DEFAULT_INNER_LEVEL"..0x8E73,
        "PATCH_DEFAULT_OUTER_LEVEL"..0x8E74
    )

    IntConstant(
        "TESS_CONTROL_OUTPUT_VERTICES"..0x8E75,
        "TESS_GEN_MODE"..0x8E76,
        "TESS_GEN_SPACING"..0x8E77,
        "TESS_GEN_VERTEX_ORDER"..0x8E78,
        "TESS_GEN_POINT_MODE"..0x8E79
    )

    IntConstant(
        "ISOLINES"..0x8E7A
    )

    IntConstant(
        "FRACTIONAL_ODD"..0x8E7B,
        "FRACTIONAL_EVEN"..0x8E7C
    )

    IntConstant(
        "MAX_PATCH_VERTICES"..0x8E7D,
        "MAX_TESS_GEN_LEVEL"..0x8E7E,
        "MAX_TESS_CONTROL_UNIFORM_COMPONENTS"..0x8E7F,
        "MAX_TESS_EVALUATION_UNIFORM_COMPONENTS"..0x8E80,
        "MAX_TESS_CONTROL_TEXTURE_IMAGE_UNITS"..0x8E81,
        "MAX_TESS_EVALUATION_TEXTURE_IMAGE_UNITS"..0x8E82,
        "MAX_TESS_CONTROL_OUTPUT_COMPONENTS"..0x8E83,
        "MAX_TESS_PATCH_COMPONENTS"..0x8E84,
        "MAX_TESS_CONTROL_TOTAL_OUTPUT_COMPONENTS"..0x8E85,
        "MAX_TESS_EVALUATION_OUTPUT_COMPONENTS"..0x8E86,
        "MAX_TESS_CONTROL_UNIFORM_BLOCKS"..0x8E89,
        "MAX_TESS_EVALUATION_UNIFORM_BLOCKS"..0x8E8A,
        "MAX_TESS_CONTROL_INPUT_COMPONENTS"..0x886C,
        "MAX_TESS_EVALUATION_INPUT_COMPONENTS"..0x886D,
        "MAX_COMBINED_TESS_CONTROL_UNIFORM_COMPONENTS"..0x8E1E,
        "MAX_COMBINED_TESS_EVALUATION_UNIFORM_COMPONENTS"..0x8E1F
    )

    IntConstant(
        "UNIFORM_BLOCK_REFERENCED_BY_TESS_CONTROL_SHADER"..0x84F0,
        "UNIFORM_BLOCK_REFERENCED_BY_TESS_EVALUATION_SHADER"..0x84F1
    )

    IntConstant(
        "TESS_EVALUATION_SHADER"..0x8E87,
        "TESS_CONTROL_SHADER"..0x8E88
    )

    reuse(GL40C, "PatchParameteri")
    reuse(GL40C, "PatchParameterfv")
}