/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val MESA_framebuffer_flip_y = "MESAFramebufferFlipY".nativeClassGL("MESA_framebuffer_flip_y", postfix = MESA) {
    IntConstant(
        "FRAMEBUFFER_FLIP_Y_MESA"..0x8BBB
    )

    void(
        "FramebufferParameteriMESA",

        GLenum("target"),
        GLenum("pname"),
        GLint("param")
    )

    void(
        "GetFramebufferParameterivMESA",

        GLenum("target"),
        GLenum("pname"),
        Check(1)..GLint.p("params")
    )
}