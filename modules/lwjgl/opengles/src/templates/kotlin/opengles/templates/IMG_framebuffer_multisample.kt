/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val IMG_framebuffer_downsample = "IMGFramebufferDownsample".nativeClassGLES("IMG_framebuffer_downsample", postfix = IMG) {
    IntConstant(
        "FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_AND_DOWNSAMPLE_IMG"..0x913C
    )

    IntConstant(
        "NUM_DOWNSAMPLE_SCALES_IMG"..0x913D
    )

    IntConstant(
        "DOWNSAMPLE_SCALES_IMG"..0x913E
    )

    IntConstant(
        "FRAMEBUFFER_ATTACHMENT_TEXTURE_SCALE_IMG"..0x913F
    )

    void(
        "FramebufferTexture2DDownsampleIMG",

        GLenum("target"),
        GLenum("attachment"),
        GLenum("textarget"),
        GLuint("texture"),
        GLint("level"),
        GLint("xscale"),
        GLint("yscale")
    )

    void(
        "FramebufferTextureLayerDownsampleIMG",

        GLenum("target"),
        GLenum("attachment"),
        GLuint("texture"),
        GLint("level"),
        GLint("layer"),
        GLint("xscale"),
        GLint("yscale")
    )
}