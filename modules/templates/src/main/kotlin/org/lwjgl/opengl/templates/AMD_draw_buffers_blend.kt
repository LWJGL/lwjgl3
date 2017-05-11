/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val AMD_draw_buffers_blend = "AMDDrawBuffersBlend".nativeClassGL("AMD_draw_buffers_blend", postfix = AMD) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension builds upon the ARB_draw_buffers and EXT_draw_buffers2 extensions. In ARB_draw_buffers (part of OpenGL 2.0), separate values could be
        written to each color buffer. This was further enhanced by EXT_draw_buffers2 by adding in the ability to enable blending and to set color write masks
        independently per color output.

        This extension provides the ability to set individual blend equations and blend functions for each color output.

        Requires ${GL20.core} and ${registryLink("EXT", "draw_buffers2")}.
        """

    void(
        "BlendFuncIndexedAMD",
        "",

        GLuint.IN("buf", ""),
        GLenum.IN("src", ""),
        GLenum.IN("dst", "")
    )

    void(
        "BlendFuncSeparateIndexedAMD",
        "",

        GLuint.IN("buf", ""),
        GLenum.IN("srcRGB", ""),
        GLenum.IN("dstRGB", ""),
        GLenum.IN("srcAlpha", ""),
        GLenum.IN("dstAlpha", "")
    )

    void(
        "BlendEquationIndexedAMD",
        "",

        GLuint.IN("buf", ""),
        GLenum.IN("mode", "")
    )

    void(
        "BlendEquationSeparateIndexedAMD",
        "",

        GLuint.IN("buf", ""),
        GLenum.IN("modeRGB", ""),
        GLenum.IN("modeAlpha", "")
    )
}