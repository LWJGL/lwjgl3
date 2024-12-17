/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val APPLE_rgb_422 = "APPLERGB422".nativeClassGLES("APPLE_rgb_422", postfix = APPLE) {
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