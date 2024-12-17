/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_422_pixels = "EXT422Pixels".nativeClassGL("EXT_422_pixels", postfix = EXT) {
    IntConstant(
        "422_EXT"..0x80CC,
        "422_REV_EXT"..0x80CD,
        "422_AVERAGE_EXT"..0x80CE,
        "422_REV_AVERAGE_EXT"..0x80CF
    )
}