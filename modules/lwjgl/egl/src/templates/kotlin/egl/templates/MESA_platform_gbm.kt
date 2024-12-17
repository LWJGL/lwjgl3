/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val MESA_platform_gbm = "MESAPlatformGBM".nativeClassEGL("MESA_platform_gbm", postfix = MESA) {
    IntConstant(
        "PLATFORM_GBM_MESA"..0x31D7
    )
}