/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val APPLE_framebuffer_multisample = "APPLEFramebufferMultisample".nativeClassGLES("APPLE_framebuffer_multisample", postfix = APPLE) {
    IntConstant(
        "RENDERBUFFER_SAMPLES_APPLE"..0x8CAB
    )

    IntConstant(
        "FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_APPLE"..0x8D56
    )

    IntConstant(
        "MAX_SAMPLES_APPLE"..0x8D57
    )

    IntConstant(
        "READ_FRAMEBUFFER_APPLE"..0x8CA8,
        "DRAW_FRAMEBUFFER_APPLE"..0x8CA9
    )

    IntConstant(
        "DRAW_FRAMEBUFFER_BINDING_APPLE"..0x8CA6,
        "READ_FRAMEBUFFER_BINDING_APPLE"..0x8CAA
    )

    void(
        "RenderbufferStorageMultisampleAPPLE",

        GLenum("target"),
        GLsizei("samples"),
        GLenum("internalformat"),
        GLsizei("width"),
        GLsizei("height")
    )

    void("ResolveMultisampleFramebufferAPPLE")
}