/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_platform_base = "EXTPlatformBase".nativeClassEGL("EXT_platform_base", postfix = EXT) {
    EGLDisplay(
        "GetPlatformDisplayEXT",

        EGLenum("platform"),
        opaque_p("native_display"),
        nullable..noneTerminated..EGLint.const.p("attrib_list")
    )

    EGLSurface(
        "CreatePlatformWindowSurfaceEXT",

        EGLDisplay("dpy"),
        EGLConfig("config"),
        opaque_p("native_window"),
        nullable..noneTerminated..EGLint.const.p("attrib_list")
    )

    EGLSurface(
        "CreatePlatformPixmapSurfaceEXT",

        EGLDisplay("dpy"),
        EGLConfig("config"),
        opaque_p("native_pixmap"),
        nullable..noneTerminated..EGLint.const.p("attrib_list")
    )
}