/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_packed_float = "EXTPackedFloat".nativeClassGL("EXT_packed_float", postfix = EXT) {
    IntConstant(
        "R11F_G11F_B10F_EXT"..0x8C3A
    )

    IntConstant(
        "UNSIGNED_INT_10F_11F_11F_REV_EXT"..0x8C3B
    )

    IntConstant(
        "RGBA_SIGNED_COMPONENTS_EXT"..0x8C3C
    )
}

val GLX_EXT_fbconfig_packed_float = "GLXEXTFBConfigPackedFloat".nativeClassGLX("GLX_EXT_fbconfig_packed_float", EXT) {
    IntConstant(
        "RGBA_UNSIGNED_FLOAT_TYPE_EXT"..0x20B1
    )

    IntConstant(
        "RGBA_UNSIGNED_FLOAT_BIT_EXT"..0x00000008
    )

}

val WGL_EXT_pixel_format_packed_float = "WGLEXTPixelFormatPackedFloat".nativeClassWGL("WGL_EXT_pixel_format_packed_float", EXT) {
    IntConstant(
        "TYPE_RGBA_UNSIGNED_FLOAT_EXT"..0x20A8
    )
}