/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val NV_native_query = "NVNativeQuery".nativeClassEGL("NV_native_query", postfix = NV) {
    EGLBoolean(
        "QueryNativeDisplayNV",

        EGLDisplay("dpy"),
        Check(1)..EGLNativeDisplayType.p("display_id")
    )

    EGLBoolean(
        "QueryNativeWindowNV",

        EGLDisplay("dpy"),
        EGLSurface("surf"),
        Check(1)..EGLNativeWindowType.p("window")
    )

    EGLBoolean(
        "QueryNativePixmapNV",

        EGLDisplay("dpy"),
        EGLSurface("surf"),
        Check(1)..EGLNativePixmapType.p("pixmap")
    )
}