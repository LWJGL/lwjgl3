/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val KHR_partial_update = "KHRPartialUpdate".nativeClassEGL("KHR_partial_update", postfix = KHR) {
    IntConstant(
        "BUFFER_AGE_KHR"..0x313D
    )

    EGLBoolean(
        "SetDamageRegionKHR",

        EGLDisplay("dpy"),
        EGLSurface("surface"),
        nullable..EGLint.p("rects"),
        AutoSize("rects")..EGLint("n_rects")
    )
}