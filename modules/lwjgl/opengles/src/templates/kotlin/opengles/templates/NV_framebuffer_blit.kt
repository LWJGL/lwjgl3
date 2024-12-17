/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_framebuffer_blit = "NVFramebufferBlit".nativeClassGLES("NV_framebuffer_blit", postfix = NV) {
    IntConstant(
        "READ_FRAMEBUFFER_NV"..0x8CA8,
        "DRAW_FRAMEBUFFER_NV"..0x8CA9
    )

    IntConstant(
        "DRAW_FRAMEBUFFER_BINDING_NV"..0x8CA6,
        "READ_FRAMEBUFFER_BINDING_NV"..0x8CAA
    )

    void(
        "BlitFramebufferNV",

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