/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_multisampled_render_to_texture = "EXTMultisampledRenderToTexture".nativeClassGLES("EXT_multisampled_render_to_texture", postfix = EXT) {
    IntConstant(
        "RENDERBUFFER_SAMPLES_EXT"..0x8CAB
    )

    IntConstant(
        "FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_EXT"..0x8D56
    )

    IntConstant(
        "MAX_SAMPLES_EXT"..0x8D57
    )

    IntConstant(
        "FRAMEBUFFER_ATTACHMENT_TEXTURE_SAMPLES_EXT"..0x8D6C
    )

    void(
        "RenderbufferStorageMultisampleEXT",

        GLenum("target"),
        GLsizei("samples"),
        GLenum("internalformat"),
        GLsizei("width"),
        GLsizei("height")
    )

    void(
        "FramebufferTexture2DMultisampleEXT",

        GLenum("target"),
        GLenum("attachment"),
        GLenum("textarget"),
        GLuint("texture"),
        GLint("level"),
        GLsizei("samples")
    )
}