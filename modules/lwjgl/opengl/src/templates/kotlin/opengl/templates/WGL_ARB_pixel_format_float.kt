/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val WGL_ARB_pixel_format_float = "WGLARBPixelFormatFloat".nativeClassWGL("WGL_ARB_pixel_format_float", ARB) {
    IntConstant(
        "TYPE_RGBA_FLOAT_ARB"..0x21A0
    )

}