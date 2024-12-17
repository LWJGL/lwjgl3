/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_vertex_attrib_integer_64bit = "NVVertexAttribInteger64bit".nativeClassGL("NV_vertex_attrib_integer_64bit", postfix = NV) {
    IntConstant(
        "INT64_NV"..0x140E,
        "UNSIGNED_INT64_NV"..0x140F
    )

    void(
        "VertexAttribL1i64NV",

        GLuint("index"),
        GLint64EXT("x")
    )

    void(
        "VertexAttribL2i64NV",

        GLuint("index"),
        GLint64EXT("x"),
        GLint64EXT("y")
    )

    void(
        "VertexAttribL3i64NV",

        GLuint("index"),
        GLint64EXT("x"),
        GLint64EXT("y"),
        GLint64EXT("z")
    )

    void(
        "VertexAttribL4i64NV",

        GLuint("index"),
        GLint64EXT("x"),
        GLint64EXT("y"),
        GLint64EXT("z"),
        GLint64EXT("w")
    )

    void(
        "VertexAttribL1i64vNV",

        GLuint("index"),
        Check(1)..GLint64EXT.const.p("v")
    )

    void(
        "VertexAttribL2i64vNV",

        GLuint("index"),
        Check(2)..GLint64EXT.const.p("v")
    )

    void(
        "VertexAttribL3i64vNV",

        GLuint("index"),
        Check(3)..GLint64EXT.const.p("v")
    )

    void(
        "VertexAttribL4i64vNV",

        GLuint("index"),
        Check(4)..GLint64EXT.const.p("v")
    )

    void(
        "VertexAttribL1ui64NV",

        GLuint("index"),
        GLuint64EXT("x")
    )

    void(
        "VertexAttribL2ui64NV",

        GLuint("index"),
        GLuint64EXT("x"),
        GLuint64EXT("y")
    )

    void(
        "VertexAttribL3ui64NV",

        GLuint("index"),
        GLuint64EXT("x"),
        GLuint64EXT("y"),
        GLuint64EXT("z")
    )

    void(
        "VertexAttribL4ui64NV",

        GLuint("index"),
        GLuint64EXT("x"),
        GLuint64EXT("y"),
        GLuint64EXT("z"),
        GLuint64EXT("w")
    )

    void(
        "VertexAttribL1ui64vNV",

        GLuint("index"),
        Check(1)..GLuint64EXT.const.p("v")
    )

    void(
        "VertexAttribL2ui64vNV",

        GLuint("index"),
        Check(2)..GLuint64EXT.const.p("v")
    )

    void(
        "VertexAttribL3ui64vNV",

        GLuint("index"),
        Check(3)..GLuint64EXT.const.p("v")
    )

    void(
        "VertexAttribL4ui64vNV",

        GLuint("index"),
        Check(4)..GLuint64EXT.const.p("v")
    )

    void(
        "GetVertexAttribLi64vNV",

        GLuint("index"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLint64EXT.p("params")
    )

    void(
        "GetVertexAttribLui64vNV",

        GLuint("index"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLuint64EXT.p("params")
    )

    DependsOn("GL_NV_vertex_buffer_unified_memory")..void(
        "VertexAttribLFormatNV",

        GLuint("index"),
        GLint("size"),
        GLenum("type"),
        GLsizei("stride")
    )
}