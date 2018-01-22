/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val MESA_platform_gbm = "MESAPlatformGBM".nativeClassEGL("MESA_platform_gbm", postfix = MESA) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension defines how to create EGL resources from native GBM resources using the functions defined by EGL_EXT_platform_base. (GBM is a Generic
        Buffer Manager for Linux).

        Requires ${EXT_platform_base.link} and ${registryLink("EXT", "EGL_EXT_client_extensions")} to query its existence without a display.
        """

    IntConstant(
        "",

        "PLATFORM_GBM_MESA"..0x31D7
    )
}