/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_gpu_shader5 = "NVGPUShader5".nativeClassGLES("NV_gpu_shader5", postfix = NV) {
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
        GLint64("x")
    )

    void(
        "Uniform2i64NV",

        GLint("location"),
        GLint64("x"),
        GLint64("y")
    )

    void(
        "Uniform3i64NV",

        GLint("location"),
        GLint64("x"),
        GLint64("y"),
        GLint64("z")
    )

    void(
        "Uniform4i64NV",

        GLint("location"),
        GLint64("x"),
        GLint64("y"),
        GLint64("z"),
        GLint64("w")
    )

    void(
        "Uniform1i64vNV",

        GLint("location"),
        AutoSize("value")..GLsizei("count"),
        GLint64.const.p("value")
    )

    void(
        "Uniform2i64vNV",

        GLint("location"),
        AutoSize(2, "value")..GLsizei("count"),
        GLint64.const.p("value")
    )

    void(
        "Uniform3i64vNV",

        GLint("location"),
        AutoSize(3, "value")..GLsizei("count"),
        GLint64.const.p("value")
    )

    void(
        "Uniform4i64vNV",

        GLint("location"),
        AutoSize(4, "value")..GLsizei("count"),
        GLint64.const.p("value")
    )

    void(
        "Uniform1ui64NV",

        GLint("location"),
        GLuint64("x")
    )

    void(
        "Uniform2ui64NV",

        GLint("location"),
        GLuint64("x"),
        GLuint64("y")
    )

    void(
        "Uniform3ui64NV",

        GLint("location"),
        GLuint64("x"),
        GLuint64("y"),
        GLuint64("z")
    )

    void(
        "Uniform4ui64NV",

        GLint("location"),
        GLuint64("x"),
        GLuint64("y"),
        GLuint64("z"),
        GLuint64("w")
    )

    void(
        "Uniform1ui64vNV",

        GLint("location"),
        AutoSize("value")..GLsizei("count"),
        GLuint64.const.p("value")
    )

    void(
        "Uniform2ui64vNV",

        GLint("location"),
        AutoSize(2, "value")..GLsizei("count"),
        GLuint64.p("value")
    )

    void(
        "Uniform3ui64vNV",

        GLint("location"),
        AutoSize(3, "value")..GLsizei("count"),
        GLuint64.const.p("value")
    )

    void(
        "Uniform4ui64vNV",

        GLint("location"),
        AutoSize(4, "value")..GLsizei("count"),
        GLuint64.const.p("value")
    )

    void(
        "GetUniformi64vNV",

        GLuint("program"),
        GLint("location"),
        Check(1)..ReturnParam..GLint64.p("params")
    )

    void(
        "GetUniformui64vNV",

        GLuint("program"),
        GLint("location"),
        Check(1)..ReturnParam..GLint64.p("params")
    )

    void(
        "ProgramUniform1i64NV",

        GLuint("program"),
        GLint("location"),
        GLint64("x")
    )

    void(
        "ProgramUniform2i64NV",

        GLuint("program"),
        GLint("location"),
        GLint64("x"),
        GLint64("y")
    )

    void(
        "ProgramUniform3i64NV",

        GLuint("program"),
        GLint("location"),
        GLint64("x"),
        GLint64("y"),
        GLint64("z")
    )

    void(
        "ProgramUniform4i64NV",

        GLuint("program"),
        GLint("location"),
        GLint64("x"),
        GLint64("y"),
        GLint64("z"),
        GLint64("w")
    )

    void(
        "ProgramUniform1i64vNV",

        GLuint("program"),
        GLint("location"),
        AutoSize("value")..GLsizei("count"),
        GLint64.const.p("value")
    )

    void(
        "ProgramUniform2i64vNV",

        GLuint("program"),
        GLint("location"),
        AutoSize(2, "value")..GLsizei("count"),
        GLint64.const.p("value")
    )

    void(
        "ProgramUniform3i64vNV",

        GLuint("program"),
        GLint("location"),
        AutoSize(3, "value")..GLsizei("count"),
        GLint64.const.p("value")
    )

    void(
        "ProgramUniform4i64vNV",

        GLuint("program"),
        GLint("location"),
        AutoSize(4, "value")..GLsizei("count"),
        GLint64.const.p("value")
    )

    void(
        "ProgramUniform1ui64NV",

        GLuint("program"),
        GLint("location"),
        GLuint64("x")
    )

    void(
        "ProgramUniform2ui64NV",

        GLuint("program"),
        GLint("location"),
        GLuint64("x"),
        GLuint64("y")
    )

    void(
        "ProgramUniform3ui64NV",

        GLuint("program"),
        GLint("location"),
        GLuint64("x"),
        GLuint64("y"),
        GLuint64("z")
    )

    void(
        "ProgramUniform4ui64NV",

        GLuint("program"),
        GLint("location"),
        GLuint64("x"),
        GLuint64("y"),
        GLuint64("z"),
        GLuint64("w")
    )

    void(
        "ProgramUniform1ui64vNV",

        GLuint("program"),
        GLint("location"),
        AutoSize("value")..GLsizei("count"),
        GLuint64.const.p("value")
    )

    void(
        "ProgramUniform2ui64vNV",

        GLuint("program"),
        GLint("location"),
        AutoSize(2, "value")..GLsizei("count"),
        GLuint64.const.p("value")
    )

    void(
        "ProgramUniform3ui64vNV",

        GLuint("program"),
        GLint("location"),
        AutoSize(3, "value")..GLsizei("count"),
        GLuint64.const.p("value")
    )

    void(
        "ProgramUniform4ui64vNV",

        GLuint("program"),
        GLint("location"),
        AutoSize(4, "value")..GLsizei("count"),
        GLuint64.const.p("value")
    )
}