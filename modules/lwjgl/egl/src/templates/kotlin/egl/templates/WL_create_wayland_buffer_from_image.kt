/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val WL_create_wayland_buffer_from_image = "WLCreateWaylandBufferFromImage".nativeClassEGL("WL_create_wayland_buffer_from_image", postfix = WL) {
    "struct wl_buffer".opaque.p(
        "CreateWaylandBufferFromImageWL",

        EGLDisplay("dpy"),
        EGLImageKHR("image")
    )
}