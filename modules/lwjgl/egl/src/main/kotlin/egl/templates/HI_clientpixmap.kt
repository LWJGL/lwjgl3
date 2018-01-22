/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val HI_clientpixmap = "HIClientpixmap".nativeClassEGL("HI_clientpixmap", postfix = HI) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides a mechanism for using memory allocated by the application as a color-buffer.
        """

    IntConstant(
        "",

        "CLIENT_PIXMAP_POINTER_HI"..0x8F74
    )

    EGLSurface(
        "CreatePixmapSurfaceHI",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLConfig.IN("config", ""),
        EGLClientPixmapHI_p.IN("pixmap", "")
    )
}