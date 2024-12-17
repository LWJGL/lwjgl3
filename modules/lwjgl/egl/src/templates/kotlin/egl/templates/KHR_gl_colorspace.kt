/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val KHR_gl_colorspace = "KHRGLColorspace".nativeClassEGL("KHR_gl_colorspace", postfix = KHR) {
    IntConstant(
        "GL_COLORSPACE_KHR"..0x309D,
        "GL_COLORSPACE_SRGB_KHR"..0x3089,
        "GL_COLORSPACE_LINEAR_KHR"..0x308A
    )
}