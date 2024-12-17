/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_swap_buffers_with_damage = "EXTSwapBuffersWithDamage".nativeClassEGL("EXT_swap_buffers_with_damage", postfix = EXT) {
    EGLBoolean(
        "SwapBuffersWithDamageEXT",

        EGLDisplay("dpy"),
        EGLSurface("surface"),
        nullable..EGLint.p("rects"),
        AutoSize("rects")..EGLint("n_rects")
    )
}