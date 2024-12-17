/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_gl_colorspace_scrgb_linear = "EXTGLColorspaceSCRGBLinear".nativeClassEGL("EXT_gl_colorspace_scrgb_linear", postfix = EXT) {
    IntConstant(
        "GL_COLORSPACE_SCRGB_LINEAR_EXT"..0x3350
    )
}