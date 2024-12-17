/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_texture_sRGB_R8 = "EXTTextureSRGBR8".nativeClassGLES("EXT_texture_sRGB_R8", postfix = EXT) {
    IntConstant(
        "SR8_EXT"..0x8FBD
    )
}