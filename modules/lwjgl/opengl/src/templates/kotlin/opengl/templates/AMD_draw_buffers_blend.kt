/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val AMD_draw_buffers_blend = "AMDDrawBuffersBlend".nativeClassGL("AMD_draw_buffers_blend", postfix = AMD) {
    void(
        "BlendFuncIndexedAMD",

        GLuint("buf"),
        GLenum("src"),
        GLenum("dst")
    )

    void(
        "BlendFuncSeparateIndexedAMD",

        GLuint("buf"),
        GLenum("srcRGB"),
        GLenum("dstRGB"),
        GLenum("srcAlpha"),
        GLenum("dstAlpha")
    )

    void(
        "BlendEquationIndexedAMD",

        GLuint("buf"),
        GLenum("mode")
    )

    void(
        "BlendEquationSeparateIndexedAMD",

        GLuint("buf"),
        GLenum("modeRGB"),
        GLenum("modeAlpha")
    )
}