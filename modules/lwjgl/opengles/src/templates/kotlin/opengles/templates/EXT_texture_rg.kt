/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_texture_rg = "EXTTextureRG".nativeClassGLES("EXT_texture_rg", postfix = EXT) {
    IntConstant(
        "RED_EXT"..0x1903,
        "RG_EXT"..0x8227
    )

    IntConstant(
        "R8_EXT"..0x8229,
        "RG8_EXT"..0x822B
    )
}