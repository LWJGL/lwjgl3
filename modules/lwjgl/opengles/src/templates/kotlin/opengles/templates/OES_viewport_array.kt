/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val OES_viewport_array = "OESViewportArray".nativeClassGLES("OES_viewport_array", postfix = OES) {
    IntConstant(
        "MAX_VIEWPORTS_OES"..0x825B,
        "VIEWPORT_SUBPIXEL_BITS_OES"..0x825C,
        "VIEWPORT_BOUNDS_RANGE_OES"..0x825D,
        "VIEWPORT_INDEX_PROVOKING_VERTEX_OES"..0x825F
    )

    void(
        "ViewportArrayvOES",

        GLuint("first"),
        AutoSize(4, "v")..GLsizei("count"),
        GLfloat.const.p("v")
    )

    void(
        "ViewportIndexedfOES",

        GLuint("index"),
        GLfloat("x"),
        GLfloat("y"),
        GLfloat("w"),
        GLfloat("h")
    )

    void(
        "ViewportIndexedfvOES",

        GLuint("index"),
        Check(4)..GLfloat.const.p("v")
    )

    void(
        "ScissorArrayvOES",

        GLuint("first"),
        AutoSize(4, "v")..GLsizei("count"),
        GLint.const.p("v")
    )

    void(
        "ScissorIndexedOES",

        GLuint("index"),
        GLint("left"),
        GLint("bottom"),
        GLsizei("width"),
        GLsizei("height")
    )

    void(
        "ScissorIndexedvOES",

        GLuint("index"),
        Check(4)..GLint.const.p("v")
    )

    void(
        "DepthRangeArrayfvOES",

        GLuint("first"),
        AutoSize(2, "v")..GLsizei("count"),
        GLfloat.const.p("v")
    )

    void(
        "DepthRangeIndexedfOES",

        GLuint("index"),
        GLfloat("n"),
        GLfloat("f")
    )

    void(
        "GetFloati_vOES",

        GLenum("target"),
        GLuint("index"),
        Check(1)..ReturnParam..GLfloat.p("data")
    )

    reuse(OES_draw_buffers_indexed, "EnableiOES")
    reuse(OES_draw_buffers_indexed, "DisableiOES")
    reuse(OES_draw_buffers_indexed, "IsEnablediOES")
}