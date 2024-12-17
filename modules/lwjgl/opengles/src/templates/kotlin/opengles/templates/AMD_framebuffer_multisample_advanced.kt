/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val AMD_framebuffer_multisample_advanced = "AMDFramebufferMultisampleAdvanced".nativeClassGLES("AMD_framebuffer_multisample_advanced", postfix = AMD) {
    IntConstant(
        "RENDERBUFFER_STORAGE_SAMPLES_AMD"..0x91B2
    )

    IntConstant(
        "MAX_COLOR_FRAMEBUFFER_SAMPLES_AMD"..0x91B3,
        "MAX_COLOR_FRAMEBUFFER_STORAGE_SAMPLES_AMD"..0x91B4,
        "MAX_DEPTH_STENCIL_FRAMEBUFFER_SAMPLES_AMD"..0x91B5,
        "NUM_SUPPORTED_MULTISAMPLE_MODES_AMD"..0x91B6,
        "SUPPORTED_MULTISAMPLE_MODES_AMD"..0x91B7
    )

    void(
        "RenderbufferStorageMultisampleAdvancedAMD",

        GLenum("target"),
        GLsizei("samples"),
        GLsizei("storageSamples"),
        GLenum("internalformat"),
        GLsizei("width"),
        GLsizei("height")
    )

    void(
        "NamedRenderbufferStorageMultisampleAdvancedAMD",

        GLuint("renderbuffer"),
        GLsizei("samples"),
        GLsizei("storageSamples"),
        GLenum("internalformat"),
        GLsizei("width"),
        GLsizei("height")
    )
}