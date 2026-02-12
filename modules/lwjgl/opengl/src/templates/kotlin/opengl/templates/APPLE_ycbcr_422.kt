/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val APPLE_ycbcr_422 = "APPLEYCBCR422".nativeClassGL("APPLE_ycbcr_422") {
    IntConstant(
        "YCBCR_422_APPLE"..0x85B9
    )

    IntConstant(
        "UNSIGNED_SHORT_8_8_APPLE"..0x85BA,
        "UNSIGNED_SHORT_8_8_REV_APPLE"..0x85BB
    )
}