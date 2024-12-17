/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val OES_rgb8_rgba8 = "OESRGB8RGBA8".nativeClassGLES("OES_rgb8_rgba8", postfix = OES) {
    IntConstant(
        "RGB8_OES"..0x8051,
        "RGBA8_OES"..0x8058
    )
}