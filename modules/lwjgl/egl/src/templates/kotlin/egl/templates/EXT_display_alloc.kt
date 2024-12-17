/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_display_alloc = "EXTDisplayAlloc".nativeClassEGL("EXT_display_alloc", postfix = EXT) {
    IntConstant(
        "ALLOC_NEW_DISPLAY_EXT"..0x3379
    )

    EGLBoolean(
        "DestroyDisplayEXT",

        EGLDisplay("dpy")
    )
}