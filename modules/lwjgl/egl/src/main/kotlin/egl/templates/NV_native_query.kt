/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val NV_native_query = "NVNativeQuery".nativeClassEGL("NV_native_query", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows an application to query which native display, pixmap and surface corresponds to a EGL object.
        """

    EGLBoolean(
        "QueryNativeDisplayNV",
        "",

        EGLDisplay.IN("dpy", ""),
        Check(1)..EGLNativeDisplayType.p.OUT("display_id", "")
    )

    EGLBoolean(
        "QueryNativeWindowNV",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLSurface.IN("surf", ""),
        Check(1)..EGLNativeWindowType.p.OUT("window", "")
    )

    EGLBoolean(
        "QueryNativePixmapNV",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLSurface.IN("surf", ""),
        Check(1)..EGLNativePixmapType.p.OUT("pixmap", "")
    )
}