/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val OES_draw_buffers_indexed = "OESDrawBuffersIndexed".nativeClassGLES("OES_draw_buffers_indexed", postfix = OES) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension builds upon the EXT_draw_buffers extension. In EXT_draw_buffers (part of OpenGL ES 3.0), separate values could be written to each color
        buffer, but the blend enable, blend functions, blend equations and color write masks are global and apply to all color outputs.

        This extension provides the ability to independently
        ${ul(
            "enable or disable blending",
            "set the blend equations",
            "set the blend functions, and",
            "set the color write masks per color output."
        )}

        This extension introduces indexed versions of the enable, blend equation, blend function, and color mask commands, as well as associated indexed
        queries in order to control and query these states independently on a per-color output basis.
        """

    void(
        "EnableiOES",
        "",

        GLenum("target", ""),
        GLuint("index", "")
    )

    void(
        "DisableiOES",
        "",

        GLenum("target", ""),
        GLuint("index", "")
    )

    void(
        "BlendEquationiOES",
        "",

        GLuint("buf", ""),
        GLenum("mode", "")
    )

    void(
        "BlendEquationSeparateiOES",
        "",

        GLuint("buf", ""),
        GLenum("modeRGB", ""),
        GLenum("modeAlpha", "")
    )

    void(
        "BlendFunciOES",
        "",

        GLuint("buf", ""),
        GLenum("src", ""),
        GLenum("dst", "")
    )

    void(
        "BlendFuncSeparateiOES",
        "",

        GLuint("buf", ""),
        GLenum("srcRGB", ""),
        GLenum("dstRGB", ""),
        GLenum("srcAlpha", ""),
        GLenum("dstAlpha", "")
    )

    void(
        "ColorMaskiOES",
        "",

        GLuint("index", ""),
        GLboolean("r", ""),
        GLboolean("g", ""),
        GLboolean("b", ""),
        GLboolean("a", "")
    )

    GLboolean(
        "IsEnablediOES",
        "",

        GLenum("target", ""),
        GLuint("index", "")
    )
}