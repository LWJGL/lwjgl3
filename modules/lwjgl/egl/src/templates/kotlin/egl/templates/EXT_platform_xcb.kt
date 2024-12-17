/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_platform_xcb = "EXTPlatformXCB".nativeClassEGL("EXT_platform_xcb", postfix = EXT) {
    IntConstant(
        "PLATFORM_XCB_EXT"..0x31DC
    )

    IntConstant(
        "PLATFORM_XCB_SCREEN_EXT"..0x31DE
    )
}