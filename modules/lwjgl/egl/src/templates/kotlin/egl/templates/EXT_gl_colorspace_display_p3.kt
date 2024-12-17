/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_gl_colorspace_display_p3 = "EXTGLColorspaceDisplayP3".nativeClassEGL("EXT_gl_colorspace_display_p3", postfix = EXT) {
    IntConstant(
        "GL_COLORSPACE_DISPLAY_P3_EXT"..0x3363
    )
}

val EXT_gl_colorspace_display_p3_linear = "EXTGLColorspaceDisplayP3Linear".nativeClassEGL("EXT_gl_colorspace_display_p3_linear", postfix = EXT) {
    IntConstant(
        "GL_COLORSPACE_DISPLAY_P3_LINEAR_EXT"..0x3362
    )
}