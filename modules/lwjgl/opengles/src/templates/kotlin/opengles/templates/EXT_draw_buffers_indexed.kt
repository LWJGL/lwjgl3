/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_draw_buffers_indexed = "EXTDrawBuffersIndexed".nativeClassGLES("EXT_draw_buffers_indexed", postfix = EXT) {
    void(
        "EnableiEXT",

        GLenum("target"),
        GLuint("index")
    )

    void(
        "DisableiEXT",

        GLenum("target"),
        GLuint("index")
    )

    void(
        "BlendEquationiEXT",

        GLuint("buf"),
        GLenum("mode")
    )

    void(
        "BlendEquationSeparateiEXT",

        GLuint("buf"),
        GLenum("modeRGB"),
        GLenum("modeAlpha")
    )

    void(
        "BlendFunciEXT",

        GLuint("buf"),
        GLenum("src"),
        GLenum("dst")
    )

    void(
        "BlendFuncSeparateiEXT",

        GLuint("buf"),
        GLenum("srcRGB"),
        GLenum("dstRGB"),
        GLenum("srcAlpha"),
        GLenum("dstAlpha")
    )

    void(
        "ColorMaskiEXT",

        GLuint("index"),
        GLboolean("r"),
        GLboolean("g"),
        GLboolean("b"),
        GLboolean("a")
    )

    GLboolean(
        "IsEnablediEXT",

        GLenum("target"),
        GLuint("index")
    )
}