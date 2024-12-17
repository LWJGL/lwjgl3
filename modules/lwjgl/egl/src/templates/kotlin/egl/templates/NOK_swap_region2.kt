/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val NOK_swap_region2 = "NOKSwapRegion2".nativeClassEGL("NOK_swap_region2", postfix = NOK) {
    EGLBoolean(
        "SwapBuffersRegion2NOK",

        EGLDisplay("dpy"),
        EGLSurface("surface"),
        AutoSize("rects")..EGLint("numRects"),
        nullable..EGLint.const.p("rects")
    )
}