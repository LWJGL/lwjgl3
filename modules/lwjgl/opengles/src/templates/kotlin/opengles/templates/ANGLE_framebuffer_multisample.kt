/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val ANGLE_framebuffer_multisample = "ANGLEFramebufferMultisample".nativeClassGLES("ANGLE_framebuffer_multisample", postfix = ANGLE) {
    IntConstant(
        "RENDERBUFFER_SAMPLES_ANGLE"..0x8CAB
    )

    IntConstant(
        "FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_ANGLE"..0x8D56
    )

    IntConstant(
        "MAX_SAMPLES_ANGLE"..0x8D57
    )

    void(
        "RenderbufferStorageMultisampleANGLE",

        GLenum("target"),
        GLsizei("samples"),
        GLenum("internalformat"),
        GLsizei("width"),
        GLsizei("height")
    )
}