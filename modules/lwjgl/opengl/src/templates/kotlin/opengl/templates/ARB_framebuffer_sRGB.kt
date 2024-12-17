/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_framebuffer_sRGB = "ARBFramebufferSRGB".nativeClassGL("ARB_framebuffer_sRGB") {
    IntConstant(
        "FRAMEBUFFER_SRGB"..0x8DB9
    )
}

val GLX_ARB_framebuffer_sRGB = "GLXARBFramebufferSRGB".nativeClassGLX("GLX_ARB_framebuffer_sRGB", ARB) {
    IntConstant(
        "FRAMEBUFFER_SRGB_CAPABLE_ARB"..0x20B2
    )
}

val WGL_ARB_framebuffer_sRGB = "WGLARBFramebufferSRGB".nativeClassWGL("WGL_ARB_framebuffer_sRGB", ARB) {
    IntConstant(
        "FRAMEBUFFER_SRGB_CAPABLE_ARB"..0x20A9
    )
}