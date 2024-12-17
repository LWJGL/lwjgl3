/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val KHR_display_reference = "KHRDisplayReference".nativeClassEGL("KHR_display_reference", postfix = KHR) {
    IntConstant(
        "TRACK_REFERENCES_KHR"..0x3352
    )

    EGLBoolean(
        "QueryDisplayAttribKHR",

        EGLDisplay("dpy"),
        EGLint("name"),
        Check(1)..EGLAttrib.p("value")
    )
}