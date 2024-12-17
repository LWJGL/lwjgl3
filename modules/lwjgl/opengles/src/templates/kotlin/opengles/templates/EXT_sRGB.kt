/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_sRGB = "EXTSRGB".nativeClassGLES("EXT_sRGB", postfix = EXT) {
    IntConstant(
        "SRGB_EXT"..0x8C40,
        "SRGB_ALPHA_EXT"..0x8C42
    )

    IntConstant(
        "SRGB8_ALPHA8_EXT"..0x8C43
    )

    IntConstant(
        "FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT"..0x8210
    )
}