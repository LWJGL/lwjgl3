/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_viewport_array = "NVViewportArray".nativeClassGLES("NV_viewport_array", postfix = NV) {
    IntConstant(
        "MAX_VIEWPORTS_NV"..0x825B,
        "VIEWPORT_SUBPIXEL_BITS_NV"..0x825C,
        "VIEWPORT_BOUNDS_RANGE_NV"..0x825D,
        "VIEWPORT_INDEX_PROVOKING_VERTEX_NV"..0x825F
    )

    void(
        "ViewportArrayvNV",

        GLuint("first"),
        AutoSize(4, "v")..GLsizei("count"),
        GLfloat.const.p("v")
    )

    void(
        "ViewportIndexedfNV",

        GLuint("index"),
        GLfloat("x"),
        GLfloat("y"),
        GLfloat("w"),
        GLfloat("h")
    )

    void(
        "ViewportIndexedfvNV",

        GLuint("index"),
        Check(4)..GLfloat.const.p("v")
    )

    void(
        "ScissorArrayvNV",

        GLuint("first"),
        AutoSize(4, "v")..GLsizei("count"),
        GLint.const.p("v")
    )

    void(
        "ScissorIndexedNV",

        GLuint("index"),
        GLint("left"),
        GLint("bottom"),
        GLsizei("width"),
        GLsizei("height")
    )

    void(
        "ScissorIndexedvNV",

        GLuint("index"),
        Check(4)..GLint.const.p("v")
    )

    void(
        "DepthRangeArrayfvNV",

        GLuint("first"),
        AutoSize(2, "v")..GLsizei("count"),
        GLfloat.const.p("v")
    )

    void(
        "DepthRangeIndexedfNV",

        GLuint("index"),
        GLfloat("n"),
        GLfloat("f")
    )

    void(
        "GetFloati_vNV",

        GLenum("target"),
        GLuint("index"),
        ReturnParam..Check(1)..GLfloat.p("data")
    )

    void(
        "EnableiNV",

        GLenum("target"),
        GLuint("index")
    )

    void(
        "DisableiNV",

        GLenum("target"),
        GLuint("index")
    )

    GLboolean(
        "IsEnablediNV",

        GLenum("target"),
        GLuint("index")
    )
}