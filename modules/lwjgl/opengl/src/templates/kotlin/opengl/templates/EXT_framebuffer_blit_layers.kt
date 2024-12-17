/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_framebuffer_blit_layers = "EXTFramebufferBlitLayers".nativeClassGL("EXT_framebuffer_blit_layers", postfix = EXT) {
    void(
        "BlitFramebufferLayersEXT",

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

    void(
        "BlitFramebufferLayerEXT",

        GLint("srcX0"),
        GLint("srcY0"),
        GLint("srcX1"),
        GLint("srcY1"),
        GLint("srcLayer"),
        GLint("dstX0"),
        GLint("dstY0"),
        GLint("dstX1"),
        GLint("dstY1"),
        GLint("dstLayer"),
        GLbitfield("mask"),
        GLenum("filter")
    )
}