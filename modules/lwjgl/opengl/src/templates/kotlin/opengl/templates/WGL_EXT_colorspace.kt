/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val WGL_EXT_colorspace = "WGLEXTColorspace".nativeClassWGL("WGL_EXT_colorspace", EXT) {
    IntConstant(
        "COLORSPACE_EXT"..0x309D
    )

    IntConstant(
        "COLORSPACE_SRGB_EXT"..0x3089,
        "COLORSPACE_LINEAR_EXT"..0x308A
    )
}