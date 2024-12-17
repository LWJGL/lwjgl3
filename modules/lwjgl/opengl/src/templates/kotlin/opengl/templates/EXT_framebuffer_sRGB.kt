/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_framebuffer_sRGB = "EXTFramebufferSRGB".nativeClassGL("EXT_framebuffer_sRGB", postfix = EXT) {
    IntConstant(
        "FRAMEBUFFER_SRGB_EXT"..0x8DB9
    )

    IntConstant(
        "FRAMEBUFFER_SRGB_CAPABLE_EXT"..0x8DBA
    )
}

val GLX_EXT_framebuffer_sRGB = "GLXEXTFramebufferSRGB".nativeClassGLX("GLX_EXT_framebuffer_sRGB", EXT) {
    IntConstant(
        "FRAMEBUFFER_SRGB_CAPABLE_EXT"..0x20B2
    )
}

val WGL_EXT_framebuffer_sRGB = "WGLEXTFramebufferSRGB".nativeClassWGL("WGL_EXT_framebuffer_sRGB", EXT) {
    IntConstant(
        "FRAMEBUFFER_SRGB_CAPABLE_EXT"..0x20A9
    )
}