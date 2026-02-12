/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val APPLE_rgb_422 = "APPLERGB422".nativeClassGL("APPLE_rgb_422") {
    IntConstant(
        "RGB_422_APPLE"..0x8A1F
    )

    IntConstant(
        "RGB_RAW_422_APPLE"..0x8A51
    )

    IntConstant(
        "UNSIGNED_SHORT_8_8_APPLE"..0x85BA,
        "UNSIGNED_SHORT_8_8_REV_APPLE"..0x85BB
    )
}