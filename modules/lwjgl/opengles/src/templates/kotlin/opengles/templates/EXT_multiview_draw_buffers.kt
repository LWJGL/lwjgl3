/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_multiview_draw_buffers = "EXTMultiviewDrawBuffers".nativeClassGLES("EXT_multiview_draw_buffers", postfix = EXT) {
    IntConstant(
        "COLOR_ATTACHMENT_EXT"..0x90F0,
        "MULTIVIEW_EXT"..0x90F1
    )

    IntConstant(
        "DRAW_BUFFER_EXT"..0x0C01,
        "READ_BUFFER_EXT"..0x0C02
    )

    IntConstant(
        "MAX_MULTIVIEW_BUFFERS_EXT"..0x90F2
    )

    void(
        "ReadBufferIndexedEXT",

        GLenum("src"),
        GLint("index")
    )

    void(
        "DrawBuffersIndexedEXT",

        AutoSize("location", "indices")..GLint("n"),
        GLenum.const.p("location"),
        GLint.const.p("indices")
    )

    void(
        "GetIntegeri_vEXT",

        GLenum("target"),
        GLuint("index"),
        ReturnParam..Check(1)..GLint.p("data")
    )
}