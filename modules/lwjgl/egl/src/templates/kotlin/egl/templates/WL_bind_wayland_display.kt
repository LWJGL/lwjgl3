/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val WL_bind_wayland_display = "WLBindWaylandDisplay".nativeClassEGL("WL_bind_wayland_display", postfix = WL) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides entry points for binding and unbinding the wl_display of a Wayland compositor to an {@code EGLDisplay}. Binding a
        {@code wl_display} means that the EGL implementation should provide one or more interfaces in the Wayland protocol to allow clients to create
        {@code wl_buffer} objects. On the server side, this extension also provides a new target for #CreateImageKHR(), to create an {@code EGLImage} from a
        {@code wl_buffer}.

        Adding an implementation-specific Wayland interface, allows the EGL implementation to define specific wayland requests and events, needed for buffer
        sharing in an EGL Wayland platform.

        Requires ${EGL14.core} and ${KHR_image_base.link}.
        """

    EGLBoolean(
        "BindWaylandDisplayWL",
        "",

        EGLDisplay("dpy", ""),
        "struct wl_display".opaque.p("display", "")
    )

    EGLBoolean(
        "UnbindWaylandDisplayWL",
        "",

        EGLDisplay("dpy", ""),
        "struct wl_display".opaque.p("display", "")
    )

    EGLBoolean(
        "QueryWaylandBufferWL",
        "",

        EGLDisplay("dpy", ""),
        "struct wl_resource".opaque.p("buffer", ""),
        EGLint("attribute", ""),
        Check(1)..EGLint.p("value", "")
    )
}