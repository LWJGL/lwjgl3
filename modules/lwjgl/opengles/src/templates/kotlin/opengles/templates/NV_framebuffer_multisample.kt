/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_framebuffer_multisample = "NVFramebufferMultisample".nativeClassGLES("NV_framebuffer_multisample", postfix = NV) {
    IntConstant(
        "RENDERBUFFER_SAMPLES_NV"..0x8CAB
    )

    IntConstant(
        "FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_NV"..0x8D56
    )

    IntConstant(
        "MAX_SAMPLES_NV"..0x8D57
    )

    void(
        "RenderbufferStorageMultisampleNV",

        GLenum("target"),
        GLsizei("samples"),
        GLenum("internalformat"),
        GLsizei("width"),
        GLsizei("height")
    )
}