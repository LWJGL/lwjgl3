/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val KHR_platform_x11 = "KHRPlatformX11".nativeClassEGL("KHR_platform_x11", postfix = KHR) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension defines how to create EGL resources from native X11 resources using the EGL 1.5 platform functionality.

        This extension only defines how to create EGL resources from Xlib resources. It does not define how to do so from xcb resources. All X11 types
        discussed here are defined by the header `Xlib.h`.

        Requires ${EGL15.core}.
        """

    IntConstant(
        "",

        "PLATFORM_X11_KHR"..0x31D5,
        "PLATFORM_X11_SCREEN_KHR"..0x31D6
    )
}