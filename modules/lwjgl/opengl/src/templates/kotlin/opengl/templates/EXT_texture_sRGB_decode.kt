/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_texture_sRGB_decode = "EXTTextureSRGBDecode".nativeClassGL("EXT_texture_sRGB_decode", postfix = EXT) {
    IntConstant(
        "TEXTURE_SRGB_DECODE_EXT"..0x8A48
    )

    IntConstant(
        "DECODE_EXT"..0x8A49,
        "SKIP_DECODE_EXT"..0x8A4A
    )
}