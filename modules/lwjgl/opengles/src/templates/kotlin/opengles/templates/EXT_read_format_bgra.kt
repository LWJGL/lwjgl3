/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_read_format_bgra = "EXTReadFormatBGRA".nativeClassGLES("EXT_read_format_bgra", postfix = EXT) {
    IntConstant(
        "BGRA_EXT"..0x80E1
    )

    IntConstant(
        "UNSIGNED_SHORT_4_4_4_4_REV_EXT"..0x8365,
        "UNSIGNED_SHORT_1_5_5_5_REV_EXT"..0x8366
    )
}