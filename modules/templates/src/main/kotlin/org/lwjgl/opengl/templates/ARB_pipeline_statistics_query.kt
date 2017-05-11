/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_pipeline_statistics_query = "ARBPipelineStatisticsQuery".nativeClassGL("ARB_pipeline_statistics_query", postfix = ARB) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension introduces new query types that allow applications to get statistics information about different parts of the pipeline:
        ${ul(
            "Number of vertices and primitives issued to the GL.",
            "Number of times a vertex shader, tessellation evaluation shader, geometry shader, fragment shader, and compute shader was invoked.",
            "Number of patches processed by the tessellation control shader stage.",
            "Number of primitives emitted by a geometry shader.",
            "Number of primitives that entered the primitive clipping stage.",
            "Number of primitives that are output by the primitive clipping stage."
        )}
        Requires ${GL30.core}.
        """


    IntConstant(
        """
        Accepted by the {@code target} parameter of #BeginQuery(), #EndQuery(), #GetQueryiv(),
        #BeginQueryIndexed(), #EndQueryIndexed() and #GetQueryIndexediv().
        """,

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