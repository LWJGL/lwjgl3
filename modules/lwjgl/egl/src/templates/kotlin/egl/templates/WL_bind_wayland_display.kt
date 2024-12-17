/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val WL_bind_wayland_display = "WLBindWaylandDisplay".nativeClassEGL("WL_bind_wayland_display", postfix = WL) {
    EGLBoolean(
        "BindWaylandDisplayWL",

        EGLDisplay("dpy"),
        "struct wl_display".opaque.p("display")
    )

    EGLBoolean(
        "UnbindWaylandDisplayWL",

        EGLDisplay("dpy"),
        "struct wl_display".opaque.p("display")
    )

    EGLBoolean(
        "QueryWaylandBufferWL",

        EGLDisplay("dpy"),
        "struct wl_resource".opaque.p("buffer"),
        EGLint("attribute"),
        Check(1)..EGLint.p("value")
    )
}