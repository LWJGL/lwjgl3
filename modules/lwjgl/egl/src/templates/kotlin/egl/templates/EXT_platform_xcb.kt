/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_platform_xcb = "EXTPlatformXCB".nativeClassEGL("EXT_platform_xcb", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension defines how to create EGL resources from native X11 resources using the functions defined by {@code EGL_EXT_platform_base}.

        The native X11 resources required by this extension are xcb resources. All X11 types discussed here are defined by the header {@code xcb.h}.
        
        Requires ${EXT_platform_base.link} and ${registryLink("EXT", "EGL_EXT_client_extensions")} to query its existence without a display.
        """

    IntConstant(
        "Accepted as the {@code platform} argument of #GetPlatformDisplayEXT().",

        "PLATFORM_XCB_EXT"..0x31DC
    )

    IntConstant(
        "Accepted as an attribute name in the {@code attrib_list} argument of #GetPlatformDisplayEXT().",

        "PLATFORM_XCB_SCREEN_EXT"..0x31DE
    )
}