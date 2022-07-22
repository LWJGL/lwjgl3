/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GL40 = "GL40".nativeClassGL("GL40") {
    extends = GL33
    documentation =
        """
        The OpenGL functionality up to version 4.0. Includes the deprecated symbols of the Compatibility Profile.

        OpenGL 4.0 implementations support revision 4.00 of the OpenGL Shading Language.

        Extensions promoted to core in this release:
        ${ul(
            registryLinkTo("ARB", "texture_query_lod"),
            registryLinkTo("ARB", "draw_buffers_blend"),
            registryLinkTo("ARB", "draw_indirect"),
            registryLinkTo("ARB", "gpu_shader5"),
            registryLinkTo("ARB", "gpu_shader_fp64"),
            registryLinkTo("ARB", "sample_shading"),
            registryLinkTo("ARB", "shader_subroutine"),
            registryLinkTo("ARB", "tessellation_shader"),
            registryLinkTo("ARB", "texture_buffer_object_rgb32"),
            registryLinkTo("ARB", "texture_cube_map_array"),
            registryLinkTo("ARB", "texture_gather"),
            registryLinkTo("ARB", "transform_feedback2"),
            registryLinkTo("ARB", "transform_feedback3")
        )}
        """

    // ARB_draw_buffers_blend

    reuse(GL40C, "BlendEquationi")
    reuse(GL40C, "BlendEquationSeparatei")
    reuse(GL40C, "BlendFunci")
    reuse(GL40C, "BlendFuncSeparatei")

    // ARB_draw_indirect

    IntConstant(
        """
        Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferPointerv,
        MapBufferRange, FlushMappedBufferRange, GetBufferParameteriv, and CopyBufferSubData.
        """,

        "DRAW_INDIRECT_BUFFER"..0x8F3F
    )

    IntConstant(
        "Accepted by the {@code value} parameter of GetIntegerv, GetBooleanv, GetFloatv, and GetDoublev.",

        "DRAW_INDIRECT_BUFFER_BINDING"..0x8F43
    )

    reuse(GL40C, "DrawArraysIndirect")
    reuse(GL40C, "DrawElementsIndirect")

    // ARB_gpu_shader5

    IntConstant(
        "Accepted by the {@code pname} parameter of GetProgramiv.",

        "GEOMETRY_SHADER_INVOCATIONS"..0x887F
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev, and GetInteger64v.",

        "MAX_GEOMETRY_SHADER_INVOCATIONS"..0x8E5A,
        "MIN_FRAGMENT_INTERPOLATION_OFFSET"..0x8E5B,
        "MAX_FRAGMENT_INTERPOLATION_OFFSET"..0x8E5C,
        "FRAGMENT_INTERPOLATION_OFFSET_BITS"..0x8E5D
    )

    // ARB_gpu_shader_fp64

    IntConstant(
        "Returned in the {@code type} parameter of GetActiveUniform, and GetTransformFeedbackVarying.",

        "DOUBLE_VEC2"..0x8FFC,
        "DOUBLE_VEC3"..0x8FFD,
        "DOUBLE_VEC4"..0x8FFE,
        "DOUBLE_MAT2"..0x8F46,
        "DOUBLE_MAT3"..0x8F47,
        "DOUBLE_MAT4"..0x8F48,
        "DOUBLE_MAT2x3"..0x8F49,
        "DOUBLE_MAT2x4"..0x8F4A,
        "DOUBLE_MAT3x2"..0x8F4B,
        "DOUBLE_MAT3x4"..0x8F4C,
        "DOUBLE_MAT4x2"..0x8F4D,
        "DOUBLE_MAT4x3"..0x8F4E
    )

    reuse(GL40C, "Uniform1d")
    reuse(GL40C, "Uniform2d")
    reuse(GL40C, "Uniform3d")
    reuse(GL40C, "Uniform4d")
    reuse(GL40C, "Uniform1dv")
    reuse(GL40C, "Uniform2dv")
    reuse(GL40C, "Uniform3dv")
    reuse(GL40C, "Uniform4dv")
    reuse(GL40C, "UniformMatrix2dv")
    reuse(GL40C, "UniformMatrix3dv")
    reuse(GL40C, "UniformMatrix4dv")
    reuse(GL40C, "UniformMatrix2x3dv")
    reuse(GL40C, "UniformMatrix2x4dv")
    reuse(GL40C, "UniformMatrix3x2dv")
    reuse(GL40C, "UniformMatrix3x4dv")
    reuse(GL40C, "UniformMatrix4x2dv")
    reuse(GL40C, "UniformMatrix4x3dv")
    reuse(GL40C, "GetUniformdv")

    // ARB_sample_shading

    IntConstant(
        """
        Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
        GetDoublev.
        """,

        "SAMPLE_SHADING"..0x8C36
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.",

        "MIN_SAMPLE_SHADING_VALUE"..0x8C37
    )

    reuse(GL40C, "MinSampleShading")

    // ARB_shader_subroutine

    IntConstant(
        "Accepted by the {@code pname} parameter of GetProgramStageiv.",

        "ACTIVE_SUBROUTINES"..0x8DE5,
        "ACTIVE_SUBROUTINE_UNIFORMS"..0x8DE6,
        "ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS"..0x8E47,
        "ACTIVE_SUBROUTINE_MAX_LENGTH"..0x8E48,
        "ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH"..0x8E49
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev, and GetInteger64v.",

        "MAX_SUBROUTINES"..0x8DE7,
        "MAX_SUBROUTINE_UNIFORM_LOCATIONS"..0x8DE8
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetActiveSubroutineUniformiv.",

        "NUM_COMPATIBLE_SUBROUTINES"..0x8E4A,
        "COMPATIBLE_SUBROUTINES"..0x8E4B
    )

    reuse(GL40C, "GetSubroutineUniformLocation")
    reuse(GL40C, "GetSubroutineIndex")
    reuse(GL40C, "GetActiveSubroutineUniformiv")
    reuse(GL40C, "GetActiveSubroutineUniformName")
    reuse(GL40C, "GetActiveSubroutineName")
    reuse(GL40C, "UniformSubroutinesuiv")
    reuse(GL40C, "GetUniformSubroutineuiv")
    reuse(GL40C, "GetProgramStageiv")

    // ARB_tesselation_shader

    IntConstant(
        "Accepted by the {@code mode} parameter of Begin and all vertex array functions that implicitly call Begin.",

        "PATCHES"..0xE
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of PatchParameteri, GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, and GetInteger64v.",

        "PATCH_VERTICES"..0x8E72
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of PatchParameterfv, GetBooleanv, GetDoublev, GetFloatv, and GetIntegerv, and GetInteger64v.",

        "PATCH_DEFAULT_INNER_LEVEL"..0x8E73,
        "PATCH_DEFAULT_OUTER_LEVEL"..0x8E74
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetProgramiv.",

        "TESS_CONTROL_OUTPUT_VERTICES"..0x8E75,
        "TESS_GEN_MODE"..0x8E76,
        "TESS_GEN_SPACING"..0x8E77,
        "TESS_GEN_VERTEX_ORDER"..0x8E78,
        "TESS_GEN_POINT_MODE"..0x8E79
    )

    IntConstant(
        "Returned by GetProgramiv when {@code pname} is TESS_GEN_MODE.",

        "ISOLINES"..0x8E7A
    )

    IntConstant(
        "Returned by GetProgramiv when {@code pname} is TESS_GEN_SPACING.",

        "FRACTIONAL_ODD"..0x8E7B,
        "FRACTIONAL_EVEN"..0x8E7C
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, and GetInteger64v.",

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
        "Accepted by the {@code pname} parameter of GetActiveUniformBlockiv.",

        "UNIFORM_BLOCK_REFERENCED_BY_TESS_CONTROL_SHADER"..0x84F0,
        "UNIFORM_BLOCK_REFERENCED_BY_TESS_EVALUATION_SHADER"..0x84F1
    )

    IntConstant(
        "Accepted by the {@code type} parameter of CreateShader and returned by the {@code params} parameter of GetShaderiv.",

        "TESS_EVALUATION_SHADER"..0x8E87,
        "TESS_CONTROL_SHADER"..0x8E88
    )

    reuse(GL40C, "PatchParameteri")
    reuse(GL40C, "PatchParameterfv")

    // ARB_texture_cube_map_array

    IntConstant(
        "Accepted by the {@code target} parameter of TexParameteri, TexParameteriv, TexParameterf, TexParameterfv, BindTexture, and GenerateMipmap.",

        "TEXTURE_CUBE_MAP_ARRAY"..0x9009
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv and GetFloatv.",

        "TEXTURE_BINDING_CUBE_MAP_ARRAY"..0x900A
    )

    IntConstant(
        "Accepted by the {@code target} parameter of TexImage3D, TexSubImage3D, CompressedTeximage3D, CompressedTexSubImage3D and CopyTexSubImage3D.",

        "PROXY_TEXTURE_CUBE_MAP_ARRAY"..0x900B
    )

    IntConstant(
        "Returned by the {@code type} parameter of GetActiveUniform.",

        "SAMPLER_CUBE_MAP_ARRAY"..0x900C,
        "SAMPLER_CUBE_MAP_ARRAY_SHADOW"..0x900D,
        "INT_SAMPLER_CUBE_MAP_ARRAY"..0x900E,
        "UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY"..0x900F
    )

    // ARB_texture_gather

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "MIN_PROGRAM_TEXTURE_GATHER_OFFSET"..0x8E5E,
        "MAX_PROGRAM_TEXTURE_GATHER_OFFSET"..0x8E5F
    )

    // ARB_transform_feedback2

    IntConstant(
        "Accepted by the {@code target} parameter of BindTransformFeedback.",

        "TRANSFORM_FEEDBACK"..0x8E22
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.",

        "TRANSFORM_FEEDBACK_BUFFER_PAUSED"..0x8E23,
        "TRANSFORM_FEEDBACK_BUFFER_ACTIVE"..0x8E24,
        "TRANSFORM_FEEDBACK_BINDING"..0x8E25
    )

    reuse(GL40C, "BindTransformFeedback")
    reuse(GL40C, "DeleteTransformFeedbacks")
    reuse(GL40C, "GenTransformFeedbacks")
    reuse(GL40C, "IsTransformFeedback")
    reuse(GL40C, "PauseTransformFeedback")
    reuse(GL40C, "ResumeTransformFeedback")
    reuse(GL40C, "DrawTransformFeedback")

    // ARB_transform_feedback3

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.",

        "MAX_TRANSFORM_FEEDBACK_BUFFERS"..0x8E70,
        "MAX_VERTEX_STREAMS"..0x8E71
    )

    reuse(GL40C, "DrawTransformFeedbackStream")
    reuse(GL40C, "BeginQueryIndexed")
    reuse(GL40C, "EndQueryIndexed")
    reuse(GL40C, "GetQueryIndexediv")
}