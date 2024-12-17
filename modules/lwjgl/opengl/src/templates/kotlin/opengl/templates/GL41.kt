/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GL41 = "GL41".nativeClassGL("GL41") {
    extends = GL40

    // ARB_ES2_compatibility

    IntConstant(
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
        "FIXED"..0x140C
    )

    IntConstant(
        "LOW_FLOAT"..0x8DF0,
        "MEDIUM_FLOAT"..0x8DF1,
        "HIGH_FLOAT"..0x8DF2,
        "LOW_INT"..0x8DF3,
        "MEDIUM_INT"..0x8DF4,
        "HIGH_INT"..0x8DF5
    )

    IntConstant(
        "RGB565"..0x8D62
    )

    reuse(GL41C, "ReleaseShaderCompiler")
    reuse(GL41C, "ShaderBinary")
    reuse(GL41C, "GetShaderPrecisionFormat")
    reuse(GL41C, "DepthRangef")
    reuse(GL41C, "ClearDepthf")

    // ARB_get_program_binary

    IntConstant(
        "PROGRAM_BINARY_RETRIEVABLE_HINT"..0x8257
    )

    IntConstant(
        "PROGRAM_BINARY_LENGTH"..0x8741
    )

    IntConstant(
        "NUM_PROGRAM_BINARY_FORMATS"..0x87FE,
        "PROGRAM_BINARY_FORMATS"..0x87FF
    )

    reuse(GL41C, "GetProgramBinary")
    reuse(GL41C, "ProgramBinary")
    reuse(GL41C, "ProgramParameteri")

    // ARB_separate_shader_objects

    IntConstant(
        "VERTEX_SHADER_BIT"..0x00000001,
        "FRAGMENT_SHADER_BIT"..0x00000002,
        "GEOMETRY_SHADER_BIT"..0x00000004,
        "TESS_CONTROL_SHADER_BIT"..0x00000008,
        "TESS_EVALUATION_SHADER_BIT"..0x00000010,
        "ALL_SHADER_BITS"..0xFFFFFFFF.i
    )

    IntConstant(
        "PROGRAM_SEPARABLE"..0x8258
    )

    IntConstant(
        "ACTIVE_PROGRAM"..0x8259
    )

    IntConstant(
        "PROGRAM_PIPELINE_BINDING"..0x825A
    )

    reuse(GL41C, "UseProgramStages")
    reuse(GL41C, "ActiveShaderProgram")
    reuse(GL41C, "CreateShaderProgramv")
    reuse(GL41C, "BindProgramPipeline")
    reuse(GL41C, "DeleteProgramPipelines")
    reuse(GL41C, "GenProgramPipelines")
    reuse(GL41C, "IsProgramPipeline")
    reuse(GL41C, "GetProgramPipelineiv")
    reuse(GL41C, "ProgramUniform1i")
    reuse(GL41C, "ProgramUniform2i")
    reuse(GL41C, "ProgramUniform3i")
    reuse(GL41C, "ProgramUniform4i")
    reuse(GL41C, "ProgramUniform1ui")
    reuse(GL41C, "ProgramUniform2ui")
    reuse(GL41C, "ProgramUniform3ui")
    reuse(GL41C, "ProgramUniform4ui")
    reuse(GL41C, "ProgramUniform1f")
    reuse(GL41C, "ProgramUniform2f")
    reuse(GL41C, "ProgramUniform3f")
    reuse(GL41C, "ProgramUniform4f")
    reuse(GL41C, "ProgramUniform1d")
    reuse(GL41C, "ProgramUniform2d")
    reuse(GL41C, "ProgramUniform3d")
    reuse(GL41C, "ProgramUniform4d")
    reuse(GL41C, "ProgramUniform1iv")
    reuse(GL41C, "ProgramUniform2iv")
    reuse(GL41C, "ProgramUniform3iv")
    reuse(GL41C, "ProgramUniform4iv")
    reuse(GL41C, "ProgramUniform1uiv")
    reuse(GL41C, "ProgramUniform2uiv")
    reuse(GL41C, "ProgramUniform3uiv")
    reuse(GL41C, "ProgramUniform4uiv")
    reuse(GL41C, "ProgramUniform1fv")
    reuse(GL41C, "ProgramUniform2fv")
    reuse(GL41C, "ProgramUniform3fv")
    reuse(GL41C, "ProgramUniform4fv")
    reuse(GL41C, "ProgramUniform1dv")
    reuse(GL41C, "ProgramUniform2dv")
    reuse(GL41C, "ProgramUniform3dv")
    reuse(GL41C, "ProgramUniform4dv")
    reuse(GL41C, "ProgramUniformMatrix2fv")
    reuse(GL41C, "ProgramUniformMatrix3fv")
    reuse(GL41C, "ProgramUniformMatrix4fv")
    reuse(GL41C, "ProgramUniformMatrix2dv")
    reuse(GL41C, "ProgramUniformMatrix3dv")
    reuse(GL41C, "ProgramUniformMatrix4dv")
    reuse(GL41C, "ProgramUniformMatrix2x3fv")
    reuse(GL41C, "ProgramUniformMatrix3x2fv")
    reuse(GL41C, "ProgramUniformMatrix2x4fv")
    reuse(GL41C, "ProgramUniformMatrix4x2fv")
    reuse(GL41C, "ProgramUniformMatrix3x4fv")
    reuse(GL41C, "ProgramUniformMatrix4x3fv")
    reuse(GL41C, "ProgramUniformMatrix2x3dv")
    reuse(GL41C, "ProgramUniformMatrix3x2dv")
    reuse(GL41C, "ProgramUniformMatrix2x4dv")
    reuse(GL41C, "ProgramUniformMatrix4x2dv")
    reuse(GL41C, "ProgramUniformMatrix3x4dv")
    reuse(GL41C, "ProgramUniformMatrix4x3dv")
    reuse(GL41C, "ValidateProgramPipeline")
    reuse(GL41C, "GetProgramPipelineInfoLog")

    // ARB_vertex_attrib_64bit

    reuse(GL41C, "VertexAttribL1d")
    reuse(GL41C, "VertexAttribL2d")
    reuse(GL41C, "VertexAttribL3d")
    reuse(GL41C, "VertexAttribL4d")
    reuse(GL41C, "VertexAttribL1dv")
    reuse(GL41C, "VertexAttribL2dv")
    reuse(GL41C, "VertexAttribL3dv")
    reuse(GL41C, "VertexAttribL4dv")
    reuse(GL41C, "VertexAttribLPointer")
    reuse(GL41C, "GetVertexAttribLdv")

    // ARB_viewport_array

    IntConstant(
        "MAX_VIEWPORTS"..0x825B,
        "VIEWPORT_SUBPIXEL_BITS"..0x825C,
        "VIEWPORT_BOUNDS_RANGE"..0x825D,
        "LAYER_PROVOKING_VERTEX"..0x825E,
        "VIEWPORT_INDEX_PROVOKING_VERTEX"..0x825F
    )

    IntConstant(
        "UNDEFINED_VERTEX"..0x8260
    )

    reuse(GL41C, "ViewportArrayv")
    reuse(GL41C, "ViewportIndexedf")
    reuse(GL41C, "ViewportIndexedfv")
    reuse(GL41C, "ScissorArrayv")
    reuse(GL41C, "ScissorIndexed")
    reuse(GL41C, "ScissorIndexedv")
    reuse(GL41C, "DepthRangeArrayv")
    reuse(GL41C, "DepthRangeIndexed")
    reuse(GL41C, "GetFloati_v")
    reuse(GL41C, "GetDoublei_v")
}