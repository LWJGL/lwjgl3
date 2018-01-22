/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val EXT_platform_x11 = "EXTPlatformX11".nativeClassEGL("EXT_platform_x11", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension defines how to create EGL resources from native X11 resources using the functions defined by EGL_EXT_platform_base.

        This extension defines only how to create EGL resources from Xlib resources. It does not define how to do so from xcb resources. All X11 types
        discussed here are defined by the header `Xlib.h`.

        Requires ${EXT_platform_base.link} and ${registryLink("EXT", "EGL_EXT_client_extensions")} to query its existence without a display.
        """

    IntConstant(
        "",

        "PLATFORM_X11_EXT"..0x31D5,
        "PLATFORM_X11_SCREEN_EXT"..0x31D6
    )
}