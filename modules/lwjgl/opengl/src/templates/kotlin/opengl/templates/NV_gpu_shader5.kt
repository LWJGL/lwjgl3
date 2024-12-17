/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_gpu_shader5 = "NVGPUShader5".nativeClassGL("NV_gpu_shader5", postfix = NV) {
    IntConstant(
        "INT64_NV"..0x140E,
        "UNSIGNED_INT64_NV"..0x140F,
        "INT8_NV"..0x8FE0,
        "INT8_VEC2_NV"..0x8FE1,
        "INT8_VEC3_NV"..0x8FE2,
        "INT8_VEC4_NV"..0x8FE3,
        "INT16_NV"..0x8FE4,
        "INT16_VEC2_NV"..0x8FE5,
        "INT16_VEC3_NV"..0x8FE6,
        "INT16_VEC4_NV"..0x8FE7,
        "INT64_VEC2_NV"..0x8FE9,
        "INT64_VEC3_NV"..0x8FEA,
        "INT64_VEC4_NV"..0x8FEB,
        "UNSIGNED_INT8_NV"..0x8FEC,
        "UNSIGNED_INT8_VEC2_NV"..0x8FED,
        "UNSIGNED_INT8_VEC3_NV"..0x8FEE,
        "UNSIGNED_INT8_VEC4_NV"..0x8FEF,
        "UNSIGNED_INT16_NV"..0x8FF0,
        "UNSIGNED_INT16_VEC2_NV"..0x8FF1,
        "UNSIGNED_INT16_VEC3_NV"..0x8FF2,
        "UNSIGNED_INT16_VEC4_NV"..0x8FF3,
        "UNSIGNED_INT64_VEC2_NV"..0x8FF5,
        "UNSIGNED_INT64_VEC3_NV"..0x8FF6,
        "UNSIGNED_INT64_VEC4_NV"..0x8FF7,
        "FLOAT16_NV"..0x8FF8,
        "FLOAT16_VEC2_NV"..0x8FF9,
        "FLOAT16_VEC3_NV"..0x8FFA,
        "FLOAT16_VEC4_NV"..0x8FFB
    )

    void(
        "Uniform1i64NV",

        GLint("location"),
        GLint64EXT("x")
    )

    void(
        "Uniform2i64NV",

        GLint("location"),
        GLint64EXT("x"),
        GLint64EXT("y")
    )

    void(
        "Uniform3i64NV",

        GLint("location"),
        GLint64EXT("x"),
        GLint64EXT("y"),
        GLint64EXT("z")
    )

    void(
        "Uniform4i64NV",

        GLint("location"),
        GLint64EXT("x"),
        GLint64EXT("y"),
        GLint64EXT("z"),
        GLint64EXT("w")
    )

    void(
        "Uniform1i64vNV",

        GLint("location"),
        AutoSize("value")..GLsizei("count"),
        GLint64EXT.const.p("value")
    )

    void(
        "Uniform2i64vNV",

        GLint("location"),
        AutoSize(2, "value")..GLsizei("count"),
        GLint64EXT.const.p("value")
    )

    void(
        "Uniform3i64vNV",

        GLint("location"),
        AutoSize(3, "value")..GLsizei("count"),
        GLint64EXT.const.p("value")
    )

    void(
        "Uniform4i64vNV",

        GLint("location"),
        AutoSize(4, "value")..GLsizei("count"),
        GLint64EXT.const.p("value")
    )

    void(
        "Uniform1ui64NV",

        GLint("location"),
        GLuint64EXT("x")
    )

    void(
        "Uniform2ui64NV",

        GLint("location"),
        GLuint64EXT("x"),
        GLuint64EXT("y")
    )

    void(
        "Uniform3ui64NV",

        GLint("location"),
        GLuint64EXT("x"),
        GLuint64EXT("y"),
        GLuint64EXT("z")
    )

    void(
        "Uniform4ui64NV",

        GLint("location"),
        GLuint64EXT("x"),
        GLuint64EXT("y"),
        GLuint64EXT("z"),
        GLuint64EXT("w")
    )

    void(
        "Uniform1ui64vNV",

        GLint("location"),
        AutoSize("value")..GLsizei("count"),
        GLuint64EXT.const.p("value")
    )

    void(
        "Uniform2ui64vNV",

        GLint("location"),
        AutoSize(2, "value")..GLsizei("count"),
        GLuint64EXT.p("value")
    )

    void(
        "Uniform3ui64vNV",

        GLint("location"),
        AutoSize(3, "value")..GLsizei("count"),
        GLuint64EXT.const.p("value")
    )

    void(
        "Uniform4ui64vNV",

        GLint("location"),
        AutoSize(4, "value")..GLsizei("count"),
        GLuint64EXT.const.p("value")
    )

    void(
        "GetUniformi64vNV",

        GLuint("program"),
        GLint("location"),
        Check(1)..ReturnParam..GLint64EXT.p("params")
    )

    reuse(NV_shader_buffer_load, "GetUniformui64vNV")

    val DSA = DependsOn("GL_EXT_direct_state_access")

    DSA..void(
        "ProgramUniform1i64NV",

        GLuint("program"),
        GLint("location"),
        GLint64EXT("x")
    )

    DSA..void(
        "ProgramUniform2i64NV",

        GLuint("program"),
        GLint("location"),
        GLint64EXT("x"),
        GLint64EXT("y")
    )

    DSA..void(
        "ProgramUniform3i64NV",

        GLuint("program"),
        GLint("location"),
        GLint64EXT("x"),
        GLint64EXT("y"),
        GLint64EXT("z")
    )

    DSA..void(
        "ProgramUniform4i64NV",

        GLuint("program"),
        GLint("location"),
        GLint64EXT("x"),
        GLint64EXT("y"),
        GLint64EXT("z"),
        GLint64EXT("w")
    )

    DSA..void(
        "ProgramUniform1i64vNV",

        GLuint("program"),
        GLint("location"),
        AutoSize("value")..GLsizei("count"),
        GLint64EXT.const.p("value")
    )

    DSA..void(
        "ProgramUniform2i64vNV",

        GLuint("program"),
        GLint("location"),
        AutoSize(2, "value")..GLsizei("count"),
        GLint64EXT.const.p("value")
    )

    DSA..void(
        "ProgramUniform3i64vNV",

        GLuint("program"),
        GLint("location"),
        AutoSize(3, "value")..GLsizei("count"),
        GLint64EXT.const.p("value")
    )

    DSA..void(
        "ProgramUniform4i64vNV",

        GLuint("program"),
        GLint("location"),
        AutoSize(4, "value")..GLsizei("count"),
        GLint64EXT.const.p("value")
    )

    DSA..void(
        "ProgramUniform1ui64NV",

        GLuint("program"),
        GLint("location"),
        GLuint64EXT("x")
    )

    DSA..void(
        "ProgramUniform2ui64NV",

        GLuint("program"),
        GLint("location"),
        GLuint64EXT("x"),
        GLuint64EXT("y")
    )

    DSA..void(
        "ProgramUniform3ui64NV",

        GLuint("program"),
        GLint("location"),
        GLuint64EXT("x"),
        GLuint64EXT("y"),
        GLuint64EXT("z")
    )

    DSA..void(
        "ProgramUniform4ui64NV",

        GLuint("program"),
        GLint("location"),
        GLuint64EXT("x"),
        GLuint64EXT("y"),
        GLuint64EXT("z"),
        GLuint64EXT("w")
    )

    DSA..void(
        "ProgramUniform1ui64vNV",

        GLuint("program"),
        GLint("location"),
        AutoSize("value")..GLsizei("count"),
        GLuint64EXT.const.p("value")
    )

    DSA..void(
        "ProgramUniform2ui64vNV",

        GLuint("program"),
        GLint("location"),
        AutoSize(2, "value")..GLsizei("count"),
        GLuint64EXT.const.p("value")
    )

    DSA..void(
        "ProgramUniform3ui64vNV",

        GLuint("program"),
        GLint("location"),
        AutoSize(3, "value")..GLsizei("count"),
        GLuint64EXT.const.p("value")
    )

    DSA..void(
        "ProgramUniform4ui64vNV",

        GLuint("program"),
        GLint("location"),
        AutoSize(4, "value")..GLsizei("count"),
        GLuint64EXT.const.p("value")
    )
}