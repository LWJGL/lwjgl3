/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val AMD_vertex_shader_tessellator = "AMDVertexShaderTessellator".nativeClassGL("AMD_vertex_shader_tessellator", postfix = AMD) {
    IntConstant(
        "SAMPLER_BUFFER_AMD"..0x9001,
        "INT_SAMPLER_BUFFER_AMD"..0x9002,
        "UNSIGNED_INT_SAMPLER_BUFFER_AMD"..0x9003
    )

    IntConstant(
        "DISCRETE_AMD"..0x9006,
        "CONTINUOUS_AMD"..0x9007
    )

    IntConstant(
        "TESSELLATION_MODE_AMD"..0x9004
    )

    IntConstant(
        "TESSELLATION_FACTOR_AMD"..0x9005
    )

    void(
        "TessellationFactorAMD",

        GLfloat("factor")
    )

    void(
        "TessellationModeAMD",

        GLenum("mode")
    )
}