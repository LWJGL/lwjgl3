/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val KHR_platform_wayland = "KHRPlatformWayland".nativeClassEGL("KHR_platform_wayland", postfix = KHR) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension defines how to create EGL resources from native Wayland resources using the EGL 1.5 platform functionality.

        Requires ${EGL15.core}.
        """

    IntConstant(
        "",

        "PLATFORM_WAYLAND_KHR"..0x31D8
    )
}