/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val KHR_platform_android = "KHRPlatformAndroid".nativeClassEGL("KHR_platform_android", postfix = KHR) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension defines how to create EGL resources from native Android resources using the EGL 1.5 platform functionality.

        Requires ${EGL15.core}.
        """

    IntConstant(
        "",

        "PLATFORM_ANDROID_KHR"..0x3141
    )
}