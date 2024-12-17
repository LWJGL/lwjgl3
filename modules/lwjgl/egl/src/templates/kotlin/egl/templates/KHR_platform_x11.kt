/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val KHR_platform_x11 = "KHRPlatformX11".nativeClassEGL("KHR_platform_x11", postfix = KHR) {
    IntConstant(
        "PLATFORM_X11_KHR"..0x31D5,
        "PLATFORM_X11_SCREEN_KHR"..0x31D6
    )
}