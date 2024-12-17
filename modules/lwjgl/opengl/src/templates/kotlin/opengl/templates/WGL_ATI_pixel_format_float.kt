/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val WGL_ATI_pixel_format_float = "WGLATIPixelFormatFloat".nativeClassWGL("WGL_ATI_pixel_format_float", postfix = ATI) {
    IntConstant(
        "RGBA_FLOAT_MODE_ATI"..0x8820,
        "COLOR_CLEAR_UNCLAMPED_VALUE_ATI"..0x8835
    )

    IntConstant(
        "TYPE_RGBA_FLOAT_ATI"..0x21A0
    )
}