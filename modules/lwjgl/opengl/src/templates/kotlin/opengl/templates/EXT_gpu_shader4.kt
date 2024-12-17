/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_gpu_shader4 = "EXTGPUShader4".nativeClassGL("EXT_gpu_shader4", postfix = EXT) {
    IntConstant(
        "VERTEX_ATTRIB_ARRAY_INTEGER_EXT"..0x88FD
    )

    IntConstant(
        "SAMPLER_1D_ARRAY_EXT"..0x8DC0,
        "SAMPLER_2D_ARRAY_EXT"..0x8DC1,
        "SAMPLER_BUFFER_EXT"..0x8DC2,
        "SAMPLER_1D_ARRAY_SHADOW_EXT"..0x8DC3,
        "SAMPLER_2D_ARRAY_SHADOW_EXT"..0x8DC4,
        "SAMPLER_CUBE_SHADOW_EXT"..0x8DC5,
        "UNSIGNED_INT_VEC2_EXT"..0x8DC6,
        "UNSIGNED_INT_VEC3_EXT"..0x8DC7,
        "UNSIGNED_INT_VEC4_EXT"..0x8DC8,
        "INT_SAMPLER_1D_EXT"..0x8DC9,
        "INT_SAMPLER_2D_EXT"..0x8DCA,
        "INT_SAMPLER_3D_EXT"..0x8DCB,
        "INT_SAMPLER_CUBE_EXT"..0x8DCC,
        "INT_SAMPLER_2D_RECT_EXT"..0x8DCD,
        "INT_SAMPLER_1D_ARRAY_EXT"..0x8DCE,
        "INT_SAMPLER_2D_ARRAY_EXT"..0x8DCF,
        "INT_SAMPLER_BUFFER_EXT"..0x8DD0,
        "UNSIGNED_INT_SAMPLER_1D_EXT"..0x8DD1,
        "UNSIGNED_INT_SAMPLER_2D_EXT"..0x8DD2,
        "UNSIGNED_INT_SAMPLER_3D_EXT"..0x8DD3,
        "UNSIGNED_INT_SAMPLER_CUBE_EXT"..0x8DD4,
        "UNSIGNED_INT_SAMPLER_2D_RECT_EXT"..0x8DD5,
        "UNSIGNED_INT_SAMPLER_1D_ARRAY_EXT"..0x8DD6,
        "UNSIGNED_INT_SAMPLER_2D_ARRAY_EXT"..0x8DD7,
        "UNSIGNED_INT_SAMPLER_BUFFER_EXT"..0x8DD8
    )

    IntConstant(
        "MIN_PROGRAM_TEXEL_OFFSET_EXT"..0x8904,
        "MAX_PROGRAM_TEXEL_OFFSET_EXT"..0x8905
    )

    void("VertexAttribI1iEXT", GLuint("index"), GLint("x"))
    void("VertexAttribI2iEXT", GLuint("index"), GLint("x"), GLint("y"))
    void("VertexAttribI3iEXT", GLuint("index"), GLint("x"), GLint("y"), GLint("z"))
    void("VertexAttribI4iEXT",  GLuint("index"), GLint("x"), GLint("y"), GLint("z"), GLint("w"))

    void("VertexAttribI1uiEXT", GLuint("index"), GLuint("x"))
    void("VertexAttribI2uiEXT", GLuint("index"), GLuint("x"), GLuint("y"))
    void("VertexAttribI3uiEXT", GLuint("index"), GLint("x"), GLint("y"), GLint("z"))
    void("VertexAttribI4uiEXT", GLuint("index"), GLint("x"), GLint("y"), GLint("z"), GLint("w"))

    void("VertexAttribI1ivEXT", GLuint("index"), Check(1)..GLint.const.p("v"))
    void("VertexAttribI2ivEXT", GLuint("index"), Check(2)..GLint.const.p("v"))
    void("VertexAttribI3ivEXT", GLuint("index"), Check(3)..GLint.const.p("v"))
    void("VertexAttribI4ivEXT", GLuint("index"), Check(4)..GLint.const.p("v"))

    void("VertexAttribI1uivEXT", GLuint("index"), Check(1)..GLuint.const.p("v"))
    void("VertexAttribI2uivEXT", GLuint("index"), Check(2)..GLuint.const.p("v"))
    void("VertexAttribI3uivEXT", GLuint("index"), Check(3)..GLuint.const.p("v"))
    void("VertexAttribI4uivEXT", GLuint("index"), Check(4)..GLuint.const.p("v"))

    void("VertexAttribI4bvEXT", GLuint("index"), Check(4)..GLbyte.const.p("v"))
    void("VertexAttribI4svEXT", GLuint("index"), Check(4)..GLshort.const.p("v"))

    void("VertexAttribI4ubvEXT", GLuint("index"), Check(4)..GLbyte.const.p("v"))
    void("VertexAttribI4usvEXT", GLuint("index"), Check(4)..GLshort.const.p("v"))

    void(
        "VertexAttribIPointerEXT",

        GLuint("index"),
        GLint("size"),
        GLenum("type"),
        GLsizei("stride"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT
        )..Unsafe..RawPointer..void.const.p("pointer")
    )

    void(
        "GetVertexAttribIivEXT",

        GLuint("index"),
        GLenum("pname"),
        Check(4)..ReturnParam..GLint.p("params")
    )

    void(
        "GetVertexAttribIuivEXT",

        GLuint("index"),
        GLenum("pname"),
        Check(4)..ReturnParam..GLuint.p("params")
    )

    void(
        "GetUniformuivEXT",

        GLuint("program"),
        GLint("location"),
        Check(1)..ReturnParam..GLuint.p("params")
    )

    void(
        "BindFragDataLocationEXT",

        GLuint("program"),
        GLuint("color"),
        GLcharASCII.const.p("name")
    )

    GLint(
        "GetFragDataLocationEXT",

        GLuint("program"),
        GLcharASCII.const.p("name")
    )

    void(
        "Uniform1uiEXT",

        GLint("location"),
        GLuint("v0")
    )

    void(
        "Uniform2uiEXT",

        GLint("location"),
        GLuint("v0"),
        GLuint("v1")
    )

    void(
        "Uniform3uiEXT",

        GLint("location"),
        GLuint("v0"),
        GLuint("v1"),
        GLuint("v2")
    )

    void(
        "Uniform4uiEXT",

        GLint("location"),
        GLuint("v0"),
        GLuint("v1"),
        GLuint("v2"),
        GLuint("v3")
    )

    void(
        "Uniform1uivEXT",

        GLint("location"),
        AutoSize("value")..GLsizei("count"),
        GLuint.const.p("value")
    )

    void(
        "Uniform2uivEXT",

        GLint("location"),
        AutoSize(2, "value")..GLsizei("count"),
        GLuint.const.p("value")
    )

    void(
        "Uniform3uivEXT",

        GLint("location"),
        AutoSize(3, "value")..GLsizei("count"),
        GLuint.const.p("value")
    )

    void(
        "Uniform4uivEXT",

        GLint("location"),
        AutoSize(4, "value")..GLsizei("count"),
        GLuint.const.p("value")
    )
}