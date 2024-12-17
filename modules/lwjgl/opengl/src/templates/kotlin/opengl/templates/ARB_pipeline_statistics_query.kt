/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_pipeline_statistics_query = "ARBPipelineStatisticsQuery".nativeClassGL("ARB_pipeline_statistics_query", postfix = ARB) {
    IntConstant(
        "VERTICES_SUBMITTED_ARB"..0x82EE,
        "PRIMITIVES_SUBMITTED_ARB"..0x82EF,
        "VERTEX_SHADER_INVOCATIONS_ARB"..0x82F0,
        "TESS_CONTROL_SHADER_PATCHES_ARB"..0x82F1,
        "TESS_EVALUATION_SHADER_INVOCATIONS_ARB"..0x82F2,
        "GEOMETRY_SHADER_INVOCATIONS"..0x887F,
        "GEOMETRY_SHADER_PRIMITIVES_EMITTED_ARB"..0x82F3,
        "FRAGMENT_SHADER_INVOCATIONS_ARB"..0x82F4,
        "COMPUTE_SHADER_INVOCATIONS_ARB"..0x82F5,
        "CLIPPING_INPUT_PRIMITIVES_ARB"..0x82F6,
        "CLIPPING_OUTPUT_PRIMITIVES_ARB"..0x82F7
    )
}