/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val HI_colorformats = "HIColorformats".nativeClassEGL("HI_colorformats", postfix = HI) {
    IntConstant(
        "COLOR_FORMAT_HI"..0x8F70,
        "COLOR_RGB_HI"..0x8F71,
        "COLOR_RGBA_HI"..0x8F72,
        "COLOR_ARGB_HI"..0x8F73
    )
}