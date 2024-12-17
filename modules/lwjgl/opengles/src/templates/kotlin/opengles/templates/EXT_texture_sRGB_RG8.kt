/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_texture_sRGB_RG8 = "EXTTextureSRGBRG8".nativeClassGLES("EXT_texture_sRGB_RG8", postfix = EXT) {
    IntConstant(
        "SRG8_EXT"..0x8FBE
    )
}