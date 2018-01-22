/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val EXT_platform_wayland = "EXTPlatformWayland".nativeClassEGL("EXT_platform_wayland", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension defines how to create EGL resources from native Wayland resources using the functions defined by EGL_EXT_platform_base.

        Requires ${EXT_platform_base.link} and ${registryLink("EXT", "EGL_EXT_client_extensions")} to query its existence without a display.
        """

    IntConstant(
        "",

        "PLATFORM_WAYLAND_EXT"..0x31D8
    )
}