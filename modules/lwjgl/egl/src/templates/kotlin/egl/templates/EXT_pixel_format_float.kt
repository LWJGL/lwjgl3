/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_pixel_format_float = "EXTPixelFormatFloat".nativeClassEGL("EXT_pixel_format_float", postfix = EXT) {
    IntConstant(
        "COLOR_COMPONENT_TYPE_EXT"..0x3339
    )

    IntConstant(
        "COLOR_COMPONENT_TYPE_FIXED_EXT"..0x333A,
        "COLOR_COMPONENT_TYPE_FLOAT_EXT"..0x333B
    )

}