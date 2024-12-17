/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val OES_draw_buffers_indexed = "OESDrawBuffersIndexed".nativeClassGLES("OES_draw_buffers_indexed", postfix = OES) {
    void(
        "EnableiOES",

        GLenum("target"),
        GLuint("index")
    )

    void(
        "DisableiOES",

        GLenum("target"),
        GLuint("index")
    )

    void(
        "BlendEquationiOES",

        GLuint("buf"),
        GLenum("mode")
    )

    void(
        "BlendEquationSeparateiOES",

        GLuint("buf"),
        GLenum("modeRGB"),
        GLenum("modeAlpha")
    )

    void(
        "BlendFunciOES",

        GLuint("buf"),
        GLenum("src"),
        GLenum("dst")
    )

    void(
        "BlendFuncSeparateiOES",

        GLuint("buf"),
        GLenum("srcRGB"),
        GLenum("dstRGB"),
        GLenum("srcAlpha"),
        GLenum("dstAlpha")
    )

    void(
        "ColorMaskiOES",

        GLuint("index"),
        GLboolean("r"),
        GLboolean("g"),
        GLboolean("b"),
        GLboolean("a")
    )

    GLboolean(
        "IsEnablediOES",

        GLenum("target"),
        GLuint("index")
    )
}