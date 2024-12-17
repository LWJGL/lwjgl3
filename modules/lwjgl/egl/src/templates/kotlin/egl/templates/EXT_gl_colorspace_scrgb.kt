/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_gl_colorspace_scrgb = "EXTGLColorspaceSCRGB".nativeClassEGL("EXT_gl_colorspace_scrgb", postfix = EXT) {
    IntConstant(
        "GL_COLORSPACE_SCRGB_EXT"..0x3351
    )
}