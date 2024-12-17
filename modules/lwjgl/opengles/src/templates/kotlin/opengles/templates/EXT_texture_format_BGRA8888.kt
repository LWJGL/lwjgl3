/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_texture_format_BGRA8888 = "EXTTextureFormatBGRA8888".nativeClassGLES("EXT_texture_format_BGRA8888", postfix = EXT) {
    IntConstant(
        "BGRA_EXT"..0x80E1
    )

    IntConstant(
        "BGRA8_EXT"..0x93A1
    )
}