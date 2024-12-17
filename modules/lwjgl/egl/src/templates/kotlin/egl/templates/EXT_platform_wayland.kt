/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_platform_wayland = "EXTPlatformWayland".nativeClassEGL("EXT_platform_wayland", postfix = EXT) {
    IntConstant(
        "PLATFORM_WAYLAND_EXT"..0x31D8
    )
}