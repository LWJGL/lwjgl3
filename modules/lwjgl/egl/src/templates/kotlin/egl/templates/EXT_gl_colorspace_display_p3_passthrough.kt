/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_gl_colorspace_display_p3_passthrough = "EXTGLColorspaceDisplayP3Passthrough".nativeClassEGL("EXT_gl_colorspace_display_p3_passthrough", postfix = EXT) {
    IntConstant(
        "GL_COLORSPACE_DISPLAY_P3_PASSTHROUGH_EXT"..0x3490
    )
}