/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_framebuffer_multisample = "EXTFramebufferMultisample".nativeClassGL("EXT_framebuffer_multisample", postfix = EXT) {
    void(
        "RenderbufferStorageMultisampleEXT",

        GLenum("target"),
        GLsizei("samples"),
        GLenum("internalformat"),
        GLsizei("width"),
        GLsizei("height")
    )

    IntConstant(
        "RENDERBUFFER_SAMPLES_EXT"..0x8CAB
    )

    IntConstant(
        "FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_EXT"..0x8D56
    )

    IntConstant(
        "MAX_SAMPLES_EXT"..0x8D57
    )
}