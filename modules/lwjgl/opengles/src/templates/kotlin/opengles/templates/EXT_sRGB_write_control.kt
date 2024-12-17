/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_sRGB_write_control = "EXTSRGBWriteControl".nativeClassGLES("EXT_sRGB_write_control", postfix = EXT) {
    IntConstant(
        "FRAMEBUFFER_SRGB_EXT"..0x8DB9
    )
}