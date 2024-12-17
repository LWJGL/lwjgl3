/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val KHR_swap_buffers_with_damage = "KHRSwapBuffersWithDamage".nativeClassEGL("KHR_swap_buffers_with_damage", postfix = KHR) {
    EGLBoolean(
        "SwapBuffersWithDamageKHR",

        EGLDisplay("dpy"),
        EGLSurface("surface"),
        nullable..EGLint.p("rects"),
        AutoSize("rects")..EGLint("n_rects")
    )
}