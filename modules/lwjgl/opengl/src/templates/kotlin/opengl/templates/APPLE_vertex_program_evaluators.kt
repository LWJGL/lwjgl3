/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val APPLE_vertex_program_evaluators = "APPLEVertexProgramEvaluators".nativeClassGL("APPLE_vertex_program_evaluators") {
    IntConstant(
        "VERTEX_ATTRIB_MAP1_APPLE"..0x8A00,
        "VERTEX_ATTRIB_MAP2_APPLE"..0x8A01
    )

    IntConstant(
        "VERTEX_ATTRIB_MAP1_SIZE_APPLE"..0x8A02,
        "VERTEX_ATTRIB_MAP1_COEFF_APPLE"..0x8A03,
        "VERTEX_ATTRIB_MAP1_ORDER_APPLE"..0x8A04,
        "VERTEX_ATTRIB_MAP1_DOMAIN_APPLE"..0x8A05,
        "VERTEX_ATTRIB_MAP2_SIZE_APPLE"..0x8A06,
        "VERTEX_ATTRIB_MAP2_COEFF_APPLE"..0x8A07,
        "VERTEX_ATTRIB_MAP2_ORDER_APPLE"..0x8A08,
        "VERTEX_ATTRIB_MAP2_DOMAIN_APPLE"..0x8A09
    )

    void(
        "EnableVertexAttribAPPLE",

        GLuint("index"),
        GLenum("pname")
    )

    void(
        "DisableVertexAttribAPPLE",

        GLuint("index"),
        GLenum("pname")
    )

    GLboolean(
        "IsVertexAttribEnabledAPPLE",

        GLuint("index"),
        GLenum("pname")
    )

    void(
        "MapVertexAttrib1dAPPLE",

        GLuint("index"),
        GLuint("size"),
        GLdouble("u1"),
        GLdouble("u2"),
        GLint("stride"),
        GLint("order"),
        Check("stride * order")..GLdouble.const.p("points")
    )

    void(
        "MapVertexAttrib1fAPPLE",

        GLuint("index"),
        GLuint("size"),
        GLfloat("u1"),
        GLfloat("u2"),
        GLint("stride"),
        GLint("order"),
        Check("stride * order")..GLfloat.const.p("points")
    )

    void(
        "MapVertexAttrib2dAPPLE",

        GLuint("index"),
        GLuint("size"),
        GLdouble("u1"),
        GLdouble("u2"),
        GLint("ustride"),
        GLint("uorder"),
        GLdouble("v1"),
        GLdouble("v2"),
        GLint("vstride"),
        GLint("vorder"),
        Check("ustride * uorder * vstride * vorder")..GLdouble.const.p("points")
    )

    void(
        "MapVertexAttrib2fAPPLE",

        GLuint("index"),
        GLuint("size"),
        GLfloat("u1"),
        GLfloat("u2"),
        GLint("ustride"),
        GLint("uorder"),
        GLfloat("v1"),
        GLfloat("v2"),
        GLint("vstride"),
        GLint("vorder"),
        Check("ustride * uorder * vstride * vorder")..GLfloat.const.p("points")
    )
}