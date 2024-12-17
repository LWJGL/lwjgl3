/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val MESA_framebuffer_flip_y = "MESAFramebufferFlipY".nativeClassGLES("MESA_framebuffer_flip_y", postfix = MESA) {
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