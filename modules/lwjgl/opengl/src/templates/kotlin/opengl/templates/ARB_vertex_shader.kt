/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_vertex_shader = "ARBVertexShader".nativeClassGL("ARB_vertex_shader", postfix = ARB) {
    IntConstant(
        "VERTEX_SHADER_ARB"..0x8B31
    )

    IntConstant(
        "MAX_VERTEX_UNIFORM_COMPONENTS_ARB"..0x8B4A,
        "MAX_VARYING_FLOATS_ARB"..0x8B4B,
        "MAX_VERTEX_ATTRIBS_ARB"..0x8869,
        "MAX_TEXTURE_IMAGE_UNITS_ARB"..0x8872,
        "MAX_VERTEX_TEXTURE_IMAGE_UNITS_ARB"..0x8B4C,
        "MAX_COMBINED_TEXTURE_IMAGE_UNITS_ARB"..0x8B4D,
        "MAX_TEXTURE_COORDS_ARB"..0x8871
    )

    IntConstant(
        "VERTEX_PROGRAM_POINT_SIZE_ARB"..0x8642,
        "VERTEX_PROGRAM_TWO_SIDE_ARB"..0x8643
    )

    IntConstant(
        "OBJECT_ACTIVE_ATTRIBUTES_ARB"..0x8B89,
        "OBJECT_ACTIVE_ATTRIBUTE_MAX_LENGTH_ARB"..0x8B8A
    )

    IntConstant(
        "VERTEX_ATTRIB_ARRAY_ENABLED_ARB"..0x8622,
        "VERTEX_ATTRIB_ARRAY_SIZE_ARB"..0x8623,
        "VERTEX_ATTRIB_ARRAY_STRIDE_ARB"..0x8624,
        "VERTEX_ATTRIB_ARRAY_TYPE_ARB"..0x8625,
        "VERTEX_ATTRIB_ARRAY_NORMALIZED_ARB"..0x886A,
        "CURRENT_VERTEX_ATTRIB_ARB"..0x8626
    )

    IntConstant(
        "VERTEX_ATTRIB_ARRAY_POINTER_ARB"..0x8645
    )

    IntConstant(
        "FLOAT_VEC2_ARB"..0x8B50,
        "FLOAT_VEC3_ARB"..0x8B51,
        "FLOAT_VEC4_ARB"..0x8B52,
        "FLOAT_MAT2_ARB"..0x8B5A,
        "FLOAT_MAT3_ARB"..0x8B5B,
        "FLOAT_MAT4_ARB"..0x8B5C
    )

    void(
        "VertexAttrib1fARB",
        
        GLuint("index"),
        GLfloat("v0")
    )

    void("VertexAttrib1sARB", GLuint("index"), GLshort("v0"))
    void("VertexAttrib1dARB", GLuint("index"), GLdouble("v0"))

    void(
        "VertexAttrib2fARB",

        GLuint("index"),
        GLfloat("v0"),
        GLfloat("v1")
    )

    void("VertexAttrib2sARB", GLuint("index"), GLshort("v0"), GLshort("v1"))
    void("VertexAttrib2dARB", GLuint("index"), GLdouble("v0"), GLdouble("v1"))

    void(
        "VertexAttrib3fARB",

        GLuint("index"),
        GLfloat("v0"),
        GLfloat("v1"),
        GLfloat("v2")
    )

    void("VertexAttrib3sARB", GLuint("index"), GLshort("v0"), GLshort("v1"), GLshort("v2"))
    void("VertexAttrib3dARB", GLuint("index"), GLdouble("v0"), GLdouble("v1"), GLdouble("v2"))

    void(
        "VertexAttrib4fARB",

        GLuint("index"),
        GLfloat("v0"),
        GLfloat("v1"),
        GLfloat("v2"),
        GLfloat("v3")
    )

    void("VertexAttrib4sARB", GLuint("index"), GLshort("v0"), GLshort("v1"), GLshort("v2"), GLshort("v3"))
    void("VertexAttrib4dARB", GLuint("index"), GLdouble("v0"), GLdouble("v1"), GLdouble("v2"), GLdouble("v3"))
    void("VertexAttrib4NubARB", GLuint("index"), GLubyte("x"), GLubyte("y"), GLubyte("z"), GLubyte("w"))

    void("VertexAttrib1fvARB", GLuint("index"), Check(1)..GLfloat.const.p("v"))
    void("VertexAttrib1svARB", GLuint("index"), Check(1)..GLshort.const.p("v"))
    void("VertexAttrib1dvARB", GLuint("index"), Check(1)..GLdouble.const.p("v"))

    void("VertexAttrib2fvARB", GLuint("index"), Check(2)..GLfloat.const.p("v"))
    void("VertexAttrib2svARB", GLuint("index"), Check(2)..GLshort.const.p("v"))
    void("VertexAttrib2dvARB", GLuint("index"), Check(2)..GLdouble.const.p("v"))

    void("VertexAttrib3fvARB", GLuint("index"), Check(3)..GLfloat.const.p("v"))
    void("VertexAttrib3svARB", GLuint("index"), Check(3)..GLshort.const.p("v"))
    void("VertexAttrib3dvARB", GLuint("index"), Check(3)..GLdouble.const.p("v"))

    void("VertexAttrib4fvARB", GLuint("index"), Check(4)..GLfloat.const.p("v"))
    void("VertexAttrib4svARB", GLuint("index"), Check(4)..GLshort.const.p("v"))
    void("VertexAttrib4dvARB", GLuint("index"), Check(4)..GLdouble.const.p("v"))

    void("VertexAttrib4ivARB", GLuint("index"), Check(4)..GLint.const.p("v"))
    void("VertexAttrib4bvARB", GLuint("index"), Check(4)..GLbyte.const.p("v"))
    void("VertexAttrib4ubvARB", GLuint("index"), Check(4)..GLubyte.const.p("v"))
    void("VertexAttrib4usvARB", GLuint("index"), Check(4)..GLushort.const.p("v"))
    void("VertexAttrib4uivARB", GLuint("index"), Check(4)..GLuint.const.p("v"))
    void("VertexAttrib4NbvARB", GLuint("index"), Check(4)..GLbyte.const.p("v"))
    void("VertexAttrib4NsvARB", GLuint("index"), Check(4)..GLshort.const.p("v"))
    void("VertexAttrib4NivARB", GLuint("index"), Check(4)..GLint.const.p("v"))
    void("VertexAttrib4NubvARB", GLuint("index"), Check(4)..GLubyte.const.p("v"))
    void("VertexAttrib4NusvARB", GLuint("index"), Check(4)..GLushort.const.p("v"))
    void("VertexAttrib4NuivARB", GLuint("index"), Check(4)..GLuint.const.p("v"))

    void(
        "VertexAttribPointerARB",

        GLuint("index"),
        GLint("size"),
        GLenum("type"),
        GLboolean("normalized"),
        GLsizei("stride"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..Unsafe..RawPointer..void.const.p("pointer")
    )

    void(
        "EnableVertexAttribArrayARB",

        GLuint("index")
    )

    void(
        "DisableVertexAttribArrayARB",

        GLuint("index")
    )

    void(
        "BindAttribLocationARB",

        GLhandleARB("programObj"),
        GLuint("index"),
        GLcharASCII.const.p("name")
    )

    void(
        "GetActiveAttribARB",

        GLhandleARB("programObj"),
        GLuint("index"),
        AutoSize("name")..GLsizei("maxLength"),
        Check(1)..nullable..GLsizei.p("length"),
        Check(1)..GLint.p("size"),
        Check(1)..GLenum.p("type"),
        Return(
            "length",
            "ARBShaderObjects.glGetObjectParameteriARB(programObj, GL_OBJECT_ACTIVE_ATTRIBUTE_MAX_LENGTH_ARB)"
        )..GLcharASCII.p("name")
    )

    GLint(
        "GetAttribLocationARB",

        GLhandleARB("programObj"),
        GLcharASCII.const.p("name")
    )

    void(
        "GetVertexAttribivARB",

        GLuint("index"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLint.p("params")
    )

    void(
        "GetVertexAttribfvARB",

        GLuint("index"),
        GLenum("pname"),
        Check(4)..GLfloat.p("params")
    )

    void(
        "GetVertexAttribdvARB",

        GLuint("index"),
        GLenum("pname"),
        Check(4)..GLdouble.p("params")
    )


    void(
        "GetVertexAttribPointervARB",

        GLuint("index"),
        GLenum("pname"),
        Check(1)..ReturnParam..void.p.p("pointer")
    )
}