/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val IMG_multisampled_render_to_texture = "IMGMultisampledRenderToTexture".nativeClassGLES("IMG_multisampled_render_to_texture", postfix = IMG) {
    IntConstant(
        "RENDERBUFFER_SAMPLES_IMG"..0x9133
    )

    IntConstant(
        "FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_IMG"..0x9134
    )

    IntConstant(
        "MAX_SAMPLES_IMG"..0x9135
    )

    IntConstant(
        "TEXTURE_SAMPLES_IMG"..0x9136
    )

    void(
        "RenderbufferStorageMultisampleIMG",

        GLenum("target"),
        GLsizei("samples"),
        GLenum("internalformat"),
        GLsizei("width"),
        GLsizei("height")
    )

    void(
        "FramebufferTexture2DMultisampleIMG",

        GLenum("target"),
        GLenum("attachment"),
        GLenum("textarget"),
        GLuint("texture"),
        GLint("level"),
        GLsizei("samples")
    )
}