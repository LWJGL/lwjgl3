/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val KHR_platform_wayland = "KHRPlatformWayland".nativeClassEGL("KHR_platform_wayland", postfix = KHR) {
    IntConstant(
        "PLATFORM_WAYLAND_KHR"..0x31D8
    )
}