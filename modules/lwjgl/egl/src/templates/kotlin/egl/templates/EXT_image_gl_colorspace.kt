/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_image_gl_colorspace = "EXTImageGLColorspace".nativeClassEGL("EXT_image_gl_colorspace", postfix = EXT) {
    IntConstant(
        "GL_COLORSPACE_DEFAULT_EXT"..0x314D
    )
}