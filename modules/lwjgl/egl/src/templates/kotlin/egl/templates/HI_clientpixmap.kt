/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val HI_clientpixmap = "HIClientpixmap".nativeClassEGL("HI_clientpixmap", postfix = HI) {
    IntConstant(
        "CLIENT_PIXMAP_POINTER_HI"..0x8F74
    )

    EGLSurface(
        "CreatePixmapSurfaceHI",

        EGLDisplay("dpy"),
        EGLConfig("config"),
        Input..EGLClientPixmapHI.p("pixmap")
    )
}