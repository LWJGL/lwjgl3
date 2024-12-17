/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_platform_x11 = "EXTPlatformX11".nativeClassEGL("EXT_platform_x11", postfix = EXT) {
    IntConstant(
        "PLATFORM_X11_EXT"..0x31D5,
        "PLATFORM_X11_SCREEN_EXT"..0x31D6
    )
}