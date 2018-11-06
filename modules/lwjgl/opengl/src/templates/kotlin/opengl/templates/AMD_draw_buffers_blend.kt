/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val AMD_draw_buffers_blend = "AMDDrawBuffersBlend".nativeClassGL("AMD_draw_buffers_blend", postfix = AMD) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension builds upon the ARB_draw_buffers and EXT_draw_buffers2 extensions. In ARB_draw_buffers (part of OpenGL 2.0), separate values could be
        written to each color buffer. This was further enhanced by EXT_draw_buffers2 by adding in the ability to enable blending and to set color write masks
        independently per color output.

        This extension provides the ability to set individual blend equations and blend functions for each color output.

        Requires ${GL20.core} and ${EXT_draw_buffers2.link}.
        """

    void(
        "BlendFuncIndexedAMD",
        "",

        GLuint("buf", ""),
        GLenum("src", ""),
        GLenum("dst", "")
    )

    void(
        "BlendFuncSeparateIndexedAMD",
        "",

        GLuint("buf", ""),
        GLenum("srcRGB", ""),
        GLenum("dstRGB", ""),
        GLenum("srcAlpha", ""),
        GLenum("dstAlpha", "")
    )

    void(
        "BlendEquationIndexedAMD",
        "",

        GLuint("buf", ""),
        GLenum("mode", "")
    )

    void(
        "BlendEquationSeparateIndexedAMD",
        "",

        GLuint("buf", ""),
        GLenum("modeRGB", ""),
        GLenum("modeAlpha", "")
    )
}