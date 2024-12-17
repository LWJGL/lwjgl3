/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_separate_shader_objects = "ARBSeparateShaderObjects".nativeClassGL("ARB_separate_shader_objects") {
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
    reuse(GL41C, "ProgramParameteri")
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
}