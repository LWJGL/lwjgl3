/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val ANDROID_front_buffer_auto_refresh = "ANDROIDFrontBufferAutoRefresh".nativeClassEGL("ANDROID_front_buffer_auto_refresh", postfix = ANDROID) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension is intended for latency-sensitive applications that are doing front-buffer rendering. It allows them to indicate to the Android
        compositor that it should perform composition every time the display refreshes. This removes the overhead of having to notify the compositor that the
        window surface has been updated, but it comes at the cost of doing potentially unneeded composition work if the window surface has not been updated.
        """

    IntConstant(
        """
        When used as an attribute in #SurfaceAttrib(), the value specifies whether to enable or disable auto-refresh in the Android compositor when doing
        front-buffer rendering.
        """,

        "FRONT_BUFFER_AUTO_REFRESH_ANDROID"..0x314C
    )
}