/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_platform_device = "EXTPlatformDevice".nativeClassEGL("EXT_platform_device", postfix = EXT) {
    IntConstant(
        "PLATFORM_DEVICE_EXT"..0x313F
    )
}