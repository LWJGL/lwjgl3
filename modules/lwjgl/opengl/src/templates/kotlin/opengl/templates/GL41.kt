/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GL41 = "GL41".nativeClassGL("GL41") {
    extends = GL40
    documentation =
        """
        The OpenGL functionality up to version 4.1. Includes the deprecated symbols of the Compatibility Profile.

        OpenGL 4.1 implementations support revision 4.10 of the OpenGL Shading Language.

        Extensions promoted to core in this release:
        ${ul(
            registryLinkTo("ARB", "ES2_compatibility"),
            registryLinkTo("ARB", "get_program_binary"),
            registryLinkTo("ARB", "separate_shader_objects"),
            registryLinkTo("ARB", "shader_precision"),
            registryLinkTo("ARB", "vertex_attrib_64bit"),
            registryLinkTo("ARB", "viewport_array")
        )}
        """


    // ARB_ES2_compatibility

    IntConstant(
        "Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.",

        "SHADER_COMPILER"..0x8DFA,
        "SHADER_BINARY_FORMATS"..0x8DF8,
        "NUM_SHADER_BINARY_FORMATS"..0x8DF9,
        "MAX_VERTEX_UNIFORM_VECTORS"..0x8DFB,
        "MAX_VARYING_VECTORS"..0x8DFC,
        "MAX_FRAGMENT_UNIFORM_VECTORS"..0x8DFD,
        "IMPLEMENTATION_COLOR_READ_TYPE"..0x8B9A,
        "IMPLEMENTATION_COLOR_READ_FORMAT"..0x8B9B
    )

    IntConstant(
        "Accepted by the {@code type} parameter of VertexAttribPointer.",

        "FIXED"..0x140C
    )

    IntConstant(
        "Accepted by the {@code precisiontype} parameter of GetShaderPrecisionFormat.",

        "LOW_FLOAT"..0x8DF0,
        "MEDIUM_FLOAT"..0x8DF1,
        "HIGH_FLOAT"..0x8DF2,
        "LOW_INT"..0x8DF3,
        "MEDIUM_INT"..0x8DF4,
        "HIGH_INT"..0x8DF5
    )

    IntConstant(
        "Accepted by the {@code format} parameter of most commands taking sized internal formats.",

        "RGB565"..0x8D62
    )

    GL41C reuse "ReleaseShaderCompiler"
    GL41C reuse "ShaderBinary"
    GL41C reuse "GetShaderPrecisionFormat"
    GL41C reuse "DepthRangef"
    GL41C reuse "ClearDepthf"

    // ARB_get_program_binary

    IntConstant(
        "Accepted by the {@code pname} parameter of ProgramParameteri and GetProgramiv.",

        "PROGRAM_BINARY_RETRIEVABLE_HINT"..0x8257
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetProgramiv.",

        "PROGRAM_BINARY_LENGTH"..0x8741
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv and GetDoublev.",

        "NUM_PROGRAM_BINARY_FORMATS"..0x87FE,
        "PROGRAM_BINARY_FORMATS"..0x87FF
    )

    GL41C reuse "GetProgramBinary"
    GL41C reuse "ProgramBinary"
    GL41C reuse "ProgramParameteri"

    // ARB_separate_shader_objects

    IntConstant(
        "Accepted by {@code stages} parameter to UseProgramStages.",

        "VERTEX_SHADER_BIT"..0x00000001,
        "FRAGMENT_SHADER_BIT"..0x00000002,
        "GEOMETRY_SHADER_BIT"..0x00000004,
        "TESS_CONTROL_SHADER_BIT"..0x00000008,
        "TESS_EVALUATION_SHADER_BIT"..0x00000010,
        "ALL_SHADER_BITS"..0xFFFFFFFF.i
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of ProgramParameteri and GetProgramiv.",

        "PROGRAM_SEPARABLE"..0x8258
    )

    IntConstant(
        "Accepted by {@code type} parameter to GetProgramPipelineiv.",

        "ACTIVE_PROGRAM"..0x8259
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.",

        "PROGRAM_PIPELINE_BINDING"..0x825A
    )

    GL41C reuse "UseProgramStages"
    GL41C reuse "ActiveShaderProgram"
    GL41C reuse "CreateShaderProgramv"
    GL41C reuse "BindProgramPipeline"
    GL41C reuse "DeleteProgramPipelines"
    GL41C reuse "GenProgramPipelines"
    GL41C reuse "IsProgramPipeline"
    GL41C reuse "GetProgramPipelineiv"
    GL41C reuse "ProgramUniform1i"
    GL41C reuse "ProgramUniform2i"
    GL41C reuse "ProgramUniform3i"
    GL41C reuse "ProgramUniform4i"
    GL41C reuse "ProgramUniform1ui"
    GL41C reuse "ProgramUniform2ui"
    GL41C reuse "ProgramUniform3ui"
    GL41C reuse "ProgramUniform4ui"
    GL41C reuse "ProgramUniform1f"
    GL41C reuse "ProgramUniform2f"
    GL41C reuse "ProgramUniform3f"
    GL41C reuse "ProgramUniform4f"
    GL41C reuse "ProgramUniform1d"
    GL41C reuse "ProgramUniform2d"
    GL41C reuse "ProgramUniform3d"
    GL41C reuse "ProgramUniform4d"
    GL41C reuse "ProgramUniform1iv"
    GL41C reuse "ProgramUniform2iv"
    GL41C reuse "ProgramUniform3iv"
    GL41C reuse "ProgramUniform4iv"
    GL41C reuse "ProgramUniform1uiv"
    GL41C reuse "ProgramUniform2uiv"
    GL41C reuse "ProgramUniform3uiv"
    GL41C reuse "ProgramUniform4uiv"
    GL41C reuse "ProgramUniform1fv"
    GL41C reuse "ProgramUniform2fv"
    GL41C reuse "ProgramUniform3fv"
    GL41C reuse "ProgramUniform4fv"
    GL41C reuse "ProgramUniform1dv"
    GL41C reuse "ProgramUniform2dv"
    GL41C reuse "ProgramUniform3dv"
    GL41C reuse "ProgramUniform4dv"
    GL41C reuse "ProgramUniformMatrix2fv"
    GL41C reuse "ProgramUniformMatrix3fv"
    GL41C reuse "ProgramUniformMatrix4fv"
    GL41C reuse "ProgramUniformMatrix2dv"
    GL41C reuse "ProgramUniformMatrix3dv"
    GL41C reuse "ProgramUniformMatrix4dv"
    GL41C reuse "ProgramUniformMatrix2x3fv"
    GL41C reuse "ProgramUniformMatrix3x2fv"
    GL41C reuse "ProgramUniformMatrix2x4fv"
    GL41C reuse "ProgramUniformMatrix4x2fv"
    GL41C reuse "ProgramUniformMatrix3x4fv"
    GL41C reuse "ProgramUniformMatrix4x3fv"
    GL41C reuse "ProgramUniformMatrix2x3dv"
    GL41C reuse "ProgramUniformMatrix3x2dv"
    GL41C reuse "ProgramUniformMatrix2x4dv"
    GL41C reuse "ProgramUniformMatrix4x2dv"
    GL41C reuse "ProgramUniformMatrix3x4dv"
    GL41C reuse "ProgramUniformMatrix4x3dv"
    GL41C reuse "ValidateProgramPipeline"
    GL41C reuse "GetProgramPipelineInfoLog"

    // ARB_vertex_attrib_64bit

    GL41C reuse "VertexAttribL1d"
    GL41C reuse "VertexAttribL2d"
    GL41C reuse "VertexAttribL3d"
    GL41C reuse "VertexAttribL4d"
    GL41C reuse "VertexAttribL1dv"
    GL41C reuse "VertexAttribL2dv"
    GL41C reuse "VertexAttribL3dv"
    GL41C reuse "VertexAttribL4dv"
    GL41C reuse "VertexAttribLPointer"
    GL41C reuse "GetVertexAttribLdv"

    // ARB_viewport_array

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev and GetInteger64v.",

        "MAX_VIEWPORTS"..0x825B,
        "VIEWPORT_SUBPIXEL_BITS"..0x825C,
        "VIEWPORT_BOUNDS_RANGE"..0x825D,
        "LAYER_PROVOKING_VERTEX"..0x825E,
        "VIEWPORT_INDEX_PROVOKING_VERTEX"..0x825F
    )

    IntConstant(
        "Returned in the {@code data} parameter from a Get query with a {@code pname} of LAYER_PROVOKING_VERTEX or VIEWPORT_INDEX_PROVOKING_VERTEX.",

        "UNDEFINED_VERTEX"..0x8260
    )

    GL41C reuse "ViewportArrayv"
    GL41C reuse "ViewportIndexedf"
    GL41C reuse "ViewportIndexedfv"
    GL41C reuse "ScissorArrayv"
    GL41C reuse "ScissorIndexed"
    GL41C reuse "ScissorIndexedv"
    GL41C reuse "DepthRangeArrayv"
    GL41C reuse "DepthRangeIndexed"
    GL41C reuse "GetFloati_v"
    GL41C reuse "GetDoublei_v"
}