/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_gpu_shader_fp64 = "ARBGPUShaderFP64".nativeClassGL("ARB_gpu_shader_fp64") {
    IntConstant(
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

    val program = GLuint("program")

    var src = GL40C["Uniform1d"]
    IgnoreMissing..DependsOn("GL_EXT_direct_state_access")..void(
        "ProgramUniform1dEXT",

        program,
        src["location"],
        src["x"]
    )

    src = GL40C["Uniform2d"]
    IgnoreMissing..DependsOn("GL_EXT_direct_state_access")..void(
        "ProgramUniform2dEXT",

        program,
        src["location"],
        src["x"],
        src["y"]
    )

    src = GL40C["Uniform3d"]
    IgnoreMissing..DependsOn("GL_EXT_direct_state_access")..void(
        "ProgramUniform3dEXT",

        program,
        src["location"],
        src["x"],
        src["y"],
        src["z"]
    )

    src = GL40C["Uniform4d"]
    IgnoreMissing..DependsOn("GL_EXT_direct_state_access")..void(
        "ProgramUniform4dEXT",

        program,
        src["location"],
        src["x"],
        src["y"],
        src["z"],
        src["w"]
    )

    src = GL40C["Uniform1dv"]
    IgnoreMissing..DependsOn("GL_EXT_direct_state_access")..void(
        "ProgramUniform1dvEXT",

        program,
        src["location"],
        src["count"],
        src["value"]
    )

    src = GL40C["Uniform2dv"]
    IgnoreMissing..DependsOn("GL_EXT_direct_state_access")..void(
        "ProgramUniform2dvEXT",

        program,
        src["location"],
        src["count"],
        src["value"]
    )

    src = GL40C["Uniform3dv"]
    IgnoreMissing..DependsOn("GL_EXT_direct_state_access")..void(
        "ProgramUniform3dvEXT",

        program,
        src["location"],
        src["count"],
        src["value"]
    )

    src = GL40C["Uniform4dv"]
    IgnoreMissing..DependsOn("GL_EXT_direct_state_access")..void(
        "ProgramUniform4dvEXT",

        program,
        src["location"],
        src["count"],
        src["value"]
    )

    src = GL40C["UniformMatrix2dv"]
    IgnoreMissing..DependsOn("GL_EXT_direct_state_access")..void(
        "ProgramUniformMatrix2dvEXT",

        program,
        src["location"],
        src["count"],
        src["transpose"],
        src["value"]
    )

    src = GL40C["UniformMatrix3dv"]
    IgnoreMissing..DependsOn("GL_EXT_direct_state_access")..void(
        "ProgramUniformMatrix3dvEXT",

        program,
        src["location"],
        src["count"],
        src["transpose"],
        src["value"]
    )

    src = GL40C["UniformMatrix4dv"]
    IgnoreMissing..DependsOn("GL_EXT_direct_state_access")..void(
        "ProgramUniformMatrix4dvEXT",

        program,
        src["location"],
        src["count"],
        src["transpose"],
        src["value"]
    )

    src = GL40C["UniformMatrix2x3dv"]
    IgnoreMissing..DependsOn("GL_EXT_direct_state_access")..void(
        "ProgramUniformMatrix2x3dvEXT",

        program,
        src["location"],
        src["count"],
        src["transpose"],
        src["value"]
    )

    src = GL40C["UniformMatrix2x4dv"]
    IgnoreMissing..DependsOn("GL_EXT_direct_state_access")..void(
        "ProgramUniformMatrix2x4dvEXT",

        program,
        src["location"],
        src["count"],
        src["transpose"],
        src["value"]
    )

    src = GL40C["UniformMatrix3x2dv"]
    IgnoreMissing..DependsOn("GL_EXT_direct_state_access")..void(
        "ProgramUniformMatrix3x2dvEXT",

        program,
        src["location"],
        src["count"],
        src["transpose"],
        src["value"]
    )

    src = GL40C["UniformMatrix3x4dv"]
    IgnoreMissing..DependsOn("GL_EXT_direct_state_access")..void(
        "ProgramUniformMatrix3x4dvEXT",

        program,
        src["location"],
        src["count"],
        src["transpose"],
        src["value"]
    )

    src = GL40C["UniformMatrix4x2dv"]
    IgnoreMissing..DependsOn("GL_EXT_direct_state_access")..void(
        "ProgramUniformMatrix4x2dvEXT",

        program,
        src["location"],
        src["count"],
        src["transpose"],
        src["value"]
    )

    src = GL40C["UniformMatrix4x3dv"]
    IgnoreMissing..DependsOn("GL_EXT_direct_state_access")..void(
        "ProgramUniformMatrix4x3dvEXT",

        program,
        src["location"],
        src["count"],
        src["transpose"],
        src["value"]
    )
}