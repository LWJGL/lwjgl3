/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val EXT_draw_buffers_indexed = "EXTDrawBuffersIndexed".nativeClassGLES("EXT_draw_buffers_indexed", postfix = EXT) {
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

        Requres ${GLES30.core} or ${EXT_draw_buffers.link}.
        """

    void(
        "EnableiEXT",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("index", "")
    )

    void(
        "DisableiEXT",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("index", "")
    )

    void(
        "BlendEquationiEXT",
        "",

        GLuint.IN("buf", ""),
        GLenum.IN("mode", "")
    )

    void(
        "BlendEquationSeparateiEXT",
        "",

        GLuint.IN("buf", ""),
        GLenum.IN("modeRGB", ""),
        GLenum.IN("modeAlpha", "")
    )

    void(
        "BlendFunciEXT",
        "",

        GLuint.IN("buf", ""),
        GLenum.IN("src", ""),
        GLenum.IN("dst", "")
    )

    void(
        "BlendFuncSeparateiEXT",
        "",

        GLuint.IN("buf", ""),
        GLenum.IN("srcRGB", ""),
        GLenum.IN("dstRGB", ""),
        GLenum.IN("srcAlpha", ""),
        GLenum.IN("dstAlpha", "")
    )

    void(
        "ColorMaskiEXT",
        "",

        GLuint.IN("index", ""),
        GLboolean.IN("r", ""),
        GLboolean.IN("g", ""),
        GLboolean.IN("b", ""),
        GLboolean.IN("a", "")
    )

    GLboolean(
        "IsEnablediEXT",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("index", "")
    )
}