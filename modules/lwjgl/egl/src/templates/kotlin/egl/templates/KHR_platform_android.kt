/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val KHR_platform_android = "KHRPlatformAndroid".nativeClassEGL("KHR_platform_android", postfix = KHR) {
    IntConstant(
        "PLATFORM_ANDROID_KHR"..0x3141
    )
}