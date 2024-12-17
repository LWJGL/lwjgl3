/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_shader_buffer_load = "NVShaderBufferLoad".nativeClassGL("NV_shader_buffer_load", postfix = NV) {
    IntConstant(
        "BUFFER_GPU_ADDRESS_NV"..0x8F1D
    )

    IntConstant(
        "GPU_ADDRESS_NV"..0x8F34
    )

    IntConstant(
        "MAX_SHADER_BUFFER_ADDRESS_NV"..0x8F35
    )

    void(
        "MakeBufferResidentNV",

        GLenum("target"),
        GLenum("access")
    )

    void(
        "MakeBufferNonResidentNV",

        GLenum("target")
    )

    GLboolean(
        "IsBufferResidentNV",

        GLenum("target")
    )

    void(
        "MakeNamedBufferResidentNV",

        GLuint("buffer"),
        GLenum("access")
    )

    void(
        "MakeNamedBufferNonResidentNV",

        GLuint("buffer")
    )

    GLboolean(
        "IsNamedBufferResidentNV",

        GLuint("buffer")
    )

    void(
        "GetBufferParameterui64vNV",

        GLenum("target"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLuint64EXT.p("params")
    )

    void(
        "GetNamedBufferParameterui64vNV",

        GLuint("buffer"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLuint64EXT.p("params")
    )

    void(
        "GetIntegerui64vNV",

        GLenum("value"),
        Check(1)..ReturnParam..GLuint64EXT.p("result")
    )

    void(
        "Uniformui64NV",

        GLint("location"),
        GLuint64EXT("value")
    )

    void(
        "Uniformui64vNV",

        GLint("location"),
        AutoSize("value")..GLsizei("count"),
        GLuint64EXT.const.p("value")
    )

    void(
        "GetUniformui64vNV",

        GLuint("program"),
        GLint("location"),
        Check(1)..ReturnParam..GLuint64EXT.p("params")
    )

    void(
        "ProgramUniformui64NV",

        GLuint("program"),
        GLint("location"),
        GLuint64EXT("value")
    )

    void(
        "ProgramUniformui64vNV",

        GLuint("program"),
        GLint("location"),
        AutoSize("value")..GLsizei("count"),
        GLuint64EXT.const.p("value")
    )
}