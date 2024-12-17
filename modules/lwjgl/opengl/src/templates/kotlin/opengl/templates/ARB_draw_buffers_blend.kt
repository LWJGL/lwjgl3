/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_draw_buffers_blend = "ARBDrawBuffersBlend".nativeClassGL("ARB_draw_buffers_blend", postfix = ARB) {
    void(
        "BlendEquationiARB",

        GLuint("buf"),
        GLenum("mode")
    )

    void(
        "BlendEquationSeparateiARB",

        GLuint("buf"),
        GLenum("modeRGB"),
        GLenum("modeAlpha")
    )

    void(
        "BlendFunciARB",

        GLuint("buf"),
        GLenum("src"),
        GLenum("dst")
    )

    void(
        "BlendFuncSeparateiARB",

        GLuint("buf"),
        GLenum("srcRGB"),
        GLenum("dstRGB"),
        GLenum("srcAlpha"),
        GLenum("dstAlpha")
    )

}