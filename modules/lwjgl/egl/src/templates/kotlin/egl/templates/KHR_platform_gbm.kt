/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val KHR_platform_gbm = "KHRPlatformGBM".nativeClassEGL("KHR_platform_gbm", postfix = KHR) {
    IntConstant(
        "PLATFORM_GBM_KHR"..0x31D7
    )
}