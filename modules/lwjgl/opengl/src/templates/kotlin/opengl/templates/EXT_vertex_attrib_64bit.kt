/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_vertex_attrib_64bit = "EXTVertexAttrib64bit".nativeClassGL("EXT_vertex_attrib_64bit", postfix = EXT) {
    IntConstant(
        "DOUBLE_VEC2_EXT"..0x8FFC,
        "DOUBLE_VEC3_EXT"..0x8FFD,
        "DOUBLE_VEC4_EXT"..0x8FFE,
        "DOUBLE_MAT2_EXT"..0x8F46,
        "DOUBLE_MAT3_EXT"..0x8F47,
        "DOUBLE_MAT4_EXT"..0x8F48,
        "DOUBLE_MAT2x3_EXT"..0x8F49,
        "DOUBLE_MAT2x4_EXT"..0x8F4A,
        "DOUBLE_MAT3x2_EXT"..0x8F4B,
        "DOUBLE_MAT3x4_EXT"..0x8F4C,
        "DOUBLE_MAT4x2_EXT"..0x8F4D,
        "DOUBLE_MAT4x3_EXT"..0x8F4E
    )

    void(
        "VertexAttribL1dEXT",

        GLuint("index"),
        GLdouble("x")
    )

    void(
        "VertexAttribL2dEXT",

        GLuint("index"),
        GLdouble("x"),
        GLdouble("y")
    )

    void(
        "VertexAttribL3dEXT",

        GLuint("index"),
        GLdouble("x"),
        GLdouble("y"),
        GLdouble("z")
    )

    void(
        "VertexAttribL4dEXT",

        GLuint("index"),
        GLdouble("x"),
        GLdouble("y"),
        GLdouble("z"),
        GLdouble("w")
    )

    void(
        "VertexAttribL1dvEXT",

        GLuint("index"),
        Check(1)..GLdouble.const.p("v")
    )

    void(
        "VertexAttribL2dvEXT",

        GLuint("index"),
        Check(2)..GLdouble.const.p("v")
    )

    void(
        "VertexAttribL3dvEXT",

        GLuint("index"),
        Check(3)..GLdouble.const.p("v")
    )

    void(
        "VertexAttribL4dvEXT",

        GLuint("index"),
        Check(4)..GLdouble.const.p("v")
    )

    void(
        "VertexAttribLPointerEXT",

        GLuint("index"),
        GLint("size"),
        AutoType("pointer", BufferType.GL_DOUBLE)..GLenum("type"),
        GLsizei("stride"),
        Unsafe..RawPointer..void.const.p("pointer")
    )

    void(
        "GetVertexAttribLdvEXT",

        GLuint("index"),
        GLenum("pname"),
        Check(4)..GLdouble.p("params")
    )

    reuse(ARB_vertex_attrib_64bit, "VertexArrayVertexAttribLOffsetEXT")
}