/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import opengl.*
import org.lwjgl.generator.*

val EXT_texture_sRGB_RG8 = "EXTTextureSRGBRG8".nativeClassGL("EXT_texture_sRGB_RG8", postfix = EXT) {
    IntConstant(
        "SRG8_EXT"..0x8FBE
    )
}