/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_framebuffer_blit = "EXTFramebufferBlit".nativeClassGL("EXT_framebuffer_blit", postfix = EXT) {
    IntConstant(
        "READ_FRAMEBUFFER_EXT"..0x8CA8,
        "DRAW_FRAMEBUFFER_EXT"..0x8CA9
    )

    IntConstant(
        "DRAW_FRAMEBUFFER_BINDING_EXT"..0x8CA6,
        "READ_FRAMEBUFFER_BINDING_EXT"..0x8CAA
    )

    void(
        "BlitFramebufferEXT",

        GLint("srcX0"),
        GLint("srcY0"),
        GLint("srcX1"),
        GLint("srcY1"),
        GLint("dstX0"),
        GLint("dstY0"),
        GLint("dstX1"),
        GLint("dstY1"),
        GLbitfield("mask"),
        GLenum("filter")
    )
}