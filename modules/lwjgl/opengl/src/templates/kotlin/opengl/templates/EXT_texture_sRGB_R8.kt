/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import opengl.*
import org.lwjgl.generator.*

val EXT_texture_sRGB_R8 = "EXTTextureSRGBR8".nativeClassGL("EXT_texture_sRGB_R8", postfix = EXT) {
    IntConstant(
        "SR8_EXT"..0x8FBD
    )
}